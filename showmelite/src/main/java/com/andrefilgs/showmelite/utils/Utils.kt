package com.andrefilgs.showmelite.utils


import java.text.SimpleDateFormat
import java.util.*

/**
 * @author André Filgueiras on 14/10/2020
 * Auxiliary class to find UTF-8 chars
 */
class Utils() {

  companion object {



    fun getNow(): Long {
      return System.currentTimeMillis()
    }

    fun getNowFormat():String{
      return "yyyy-MM-dd, HH:mm:ss:SSS"
    }

    fun convertToSeconds(timeInMilliseconds:Long, precision:Int):String{
      val timeDouble = timeInMilliseconds.toDouble() / 1000
      val format = "%${precision}.3fs"
      return String.format(Locale("en", "US"),format, timeDouble)
    }

    fun convertToMilliseconds(timeInMilliseconds:Long, precision:Int):String{
      val format = "%${precision}dms"
      return String.format(format, timeInMilliseconds)
    }

    //"dd EEEE MMMM yyyy, HH:mm a z"
    //https://developer.android.com/reference/kotlin/java/text/SimpleDateFormat
    fun convertTime(
      now: Long,
      format: String? = "yyyy-MM-dd, HH:mm:ss:SSS",
      local: Locale? = Locale("pt", "BR")): String {
      return SimpleDateFormat(format!!, local!!).format(now)
    }


    fun utf8Encode(codePoint: Int) = String(intArrayOf(codePoint), 0, 1).toByteArray(Charsets.UTF_8)

    fun utf8Decode(bytes: ByteArray) = String(bytes, Charsets.UTF_8).codePointAt(0)



    fun generateUtfChars(begin:Int =32, end: Int=100){
      val sb = StringBuilder()
      for (codePoint in begin..end){
        val bytes = utf8Encode(codePoint)
        val decoded = utf8Decode(bytes)
        sb.append(java.lang.String.format("%c", decoded))
      }
    }

    fun generateAllUtfChars(){
//      generateUtfChars(255,350)
//      generateUtfChars(351,4000)
//      generateUtfChars(4001,6000)
//      generateUtfChars(6001,8000)
//      generateUtfChars(8001,10000)
//      generateUtfChars(10001,12000)
//      generateUtfChars(12001,14000)
      //chinese
//      generateUtfChars(14001,16000)
//      generateUtfChars(16001,18000)
//      generateUtfChars(18001,20000)
//      generateUtfChars(20001,22000)
//      generateUtfChars(22001,24000)
//      generateUtfChars(24001,26000)
//      generateUtfChars(26001,28000)
//      generateUtfChars(150001,152000)

      //nice ones
//      generateUtfChars(0x2300,0x2416)
//      generateUtfChars(0x2000,0x2100)
//      generateUtfChars(0x2101,0x2201)
//      generateUtfChars(0x2201,0x2301)
//      generateUtfChars(0x2301,0x2401)
//      generateUtfChars(0x2417,0x2515)
//      generateUtfChars(0x2516,0x2615)
//      generateUtfChars(0x2617,0x2815)
//      generateUtfChars(0x2816,0x2900)
//      generateUtfChars(0x2615,0x2616)
    }
  }
}