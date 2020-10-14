package com.andrefilgs.showmelite.utils


/**
 * @author André Filgueiras on 14/10/2020
 */
fun Boolean?.orDefault(default: Boolean = false): Boolean {
  if (this == null)
    return default
  return this
}
