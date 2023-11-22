package id.infinitelearning.KotlinSubmission.exercise4

import kotlin.ArithmeticException

fun main(args : Array<String>) {
  /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    try{
        var num = 20 / 0
    }
    catch(e: ArithmeticException){
        // caught and handles it
        println("Pembagian dengan angka nol tidak boleh")
    }
}