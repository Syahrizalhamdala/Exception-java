# 📘 LAPORAN ANALISIS

## EXCEPTION HANDLING PADA JAVA

---

## 🧑‍💻 Identitas

* **Nama**: Syahrizal Hamdala
* **Program Studi**: Teknik Informatika
* **Mata Kuliah**: Pemrograman Berorientasi Objek

---

## 📌 Pendahuluan

Exception Handling merupakan mekanisme dalam bahasa pemrograman Java yang digunakan untuk menangani kesalahan (error) yang terjadi saat program dijalankan (runtime). Dengan adanya exception handling, program dapat tetap berjalan tanpa mengalami crash secara tiba-tiba.

---

## 🎯 Tujuan

* Memahami konsep exception handling dalam Java
* Mengetahui jenis-jenis error pada runtime
* Mampu menggunakan try, catch, throw, throws, dan finally
* Menganalisis berbagai kasus exception

---

## 📚 Dasar Teori

Beberapa keyword penting dalam exception handling:

* **try** → Membungkus kode yang berpotensi error
* **catch** → Menangkap dan menangani error
* **throw** → Melempar exception secara manual
* **throws** → Mendeklarasikan exception pada method
* **finally** → Blok yang selalu dijalankan

---

## 🔍 Analisis Percobaan

### 🔹 Percobaan 1

Terjadi error `ArrayIndexOutOfBoundsException` karena akses indeks array melebihi batas.
Solusi menggunakan try-catch untuk menangani error tersebut.

---

### 🔹 Percobaan 2

Error terjadi karena perulangan melebihi jumlah elemen array.
Dengan try-catch, program dapat mengatur ulang indeks dan tetap berjalan.

---

### 🔹 Percobaan 3

Terjadi `ArithmeticException` akibat pembagian dengan nol.
Penggunaan catch yang spesifik lebih disarankan dibanding umum.

---

### 🔹 Percobaan 4

Terdapat dua kemungkinan error:

* ArithmeticException
* ArrayIndexOutOfBoundsException

Urutan kode menentukan error mana yang muncul terlebih dahulu.

---

### 🔹 Percobaan 5

Menunjukkan penggunaan:

* `getMessage()`
* `printStackTrace()`

Digunakan untuk debugging dan mengetahui detail error.

---

### 🔹 Percobaan 6

Menggunakan `throw` untuk membuat exception secara manual.
Setelah throw dijalankan, program langsung masuk ke catch.

---

### 🔹 Percobaan 7

Menampilkan informasi detail dari exception:

* Pesan error
* Nama exception
* Stack trace

---

### 🔹 Percobaan 8

Menggunakan `throws` untuk melempar exception ke method pemanggil.
Ditunjukkan juga penggunaan `finally` yang selalu dijalankan.

---

### 🔹 Percobaan 9

Menunjukkan propagasi exception dari method ke method lain.
Exception dilempar dari method dan ditangkap di main.

---

### 🔹 Percobaan 10

Menangani error pada file handling menggunakan `IOException`.
Penting untuk mencegah crash saat operasi file.

---

### 🔹 Percobaan 11

Membuat custom exception dengan `extends Throwable`.
Digunakan untuk membuat error sesuai kebutuhan.

---

### 🔹 Percobaan 12

Custom exception dengan `extends Exception`.
Digunakan untuk validasi kondisi tertentu dalam program.

---

## ✅ Kesimpulan

* Exception handling sangat penting untuk menjaga kestabilan program
* Try-catch dapat mencegah program berhenti secara tiba-tiba
* Throw dan throws digunakan untuk mengelola exception
* Finally selalu dijalankan
* Exception dapat dibuat sendiri (custom exception)

---

## 📂 Lampiran

Silakan lihat source code pada repository ini untuk implementasi lengkap setiap percobaan.

---

## ⭐ Penutup

Laporan ini dibuat sebagai bagian dari praktikum pemrograman Java untuk memahami konsep exception handling secara menyeluruh.

---
