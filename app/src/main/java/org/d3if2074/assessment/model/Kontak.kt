package org.d3if2074.assessment.model

import android.text.Editable

data class Kontak(
    val id: String,
    val namaDepan: String,
    val namaBelakang: String,
    val nomor: String,
) {
    constructor() : this("", "", "", "") {
    }
}
