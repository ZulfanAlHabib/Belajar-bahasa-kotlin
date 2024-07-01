fun main() {
    val nama = "Zulfan"
    val umur = 20
    val hobi = "membaca dan menulis"

    println("nama: $nama")
    println("umur: $umur tahun")
    println("hobi: $hobi")


    val nilaiUAS1 = 96
    val nilaiUAS2 = 94
    val nilaiUAS3 = 90
    val ratarata = (nilaiUAS1 + nilaiUAS2 + nilaiUAS3) / 3

    println("Nilai rata-rata UAS adalah: $ratarata")

    if (ratarata >= 91)
        println("Luar biasa! kamu mendapatkan nilai yang sangat tinggi")
    else if (ratarata >= 61)
        println("cukup baik tetapi perlu belajar lebih giat lagi")
    else
        println("tingkatkan belajarmu untuk mencapai nilai yang baik")

}