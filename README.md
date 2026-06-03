# LAPORAN PRAKTIKUM

## EXCEPTION HANDLING PADA JAVA

### Nama : Syahrizal Hamdala

### NIM : (Isi NIM kamu)

### Kelas : (Isi Kelas kamu)e

---

## I. TUJUAN PRAKTIKUM

1. Memahami konsep exception handling pada Java.
2. Mengetahui jenis-jenis exception yang terjadi saat runtime.
3. Memahami penggunaan try, catch, throw, throws, dan finally.
4. Mampu menangani error agar program tidak berhenti secara tiba-tiba.

---

## II. DASAR TEORI

Exception adalah suatu kondisi error yang terjadi saat program dijalankan (runtime). Java menyediakan mekanisme penanganan error menggunakan exception handling agar program tetap berjalan normal.

Beberapa keyword penting dalam exception handling:

* **try**: digunakan untuk membungkus kode yang berpotensi error
* **catch**: digunakan untuk menangkap dan menangani error
* **throw**: digunakan untuk melempar exception secara manual
* **throws**: digunakan untuk mendeklarasikan exception pada method
* **finally**: blok yang selalu dijalankan

---

## III. HASIL DAN ANALISA

### Percobaan 1

**Error:** ArrayIndexOutOfBoundsException
**Analisa:**
Terjadi karena mengakses array di luar batas indeks. Array berukuran 5 hanya memiliki indeks 0–4, tetapi program mengakses indeks ke-5.

**Perbaikan:**
Menggunakan try-catch agar error dapat ditangani dan program tidak berhenti.

---

### Percobaan 2

**Error:** ArrayIndexOutOfBoundsException
**Analisa:**
Perulangan melebihi jumlah elemen array.

**Perbaikan:**
Exception ditangani menggunakan try-catch dan indeks di-reset sehingga program tetap berjalan.

---

### Percobaan 3

**Error:** ArithmeticException (pembagian dengan nol)
**Analisa:**
Pembagian bilangan dengan nol tidak diperbolehkan dalam Java.

**Perbaikan:**
Menggunakan try-catch untuk menangani error tersebut.
Penggunaan catch yang lebih spesifik (ArithmeticException) lebih disarankan.

---

### Percobaan 4

**Error:**

* ArithmeticException
* ArrayIndexOutOfBoundsException

**Analisa:**
Urutan kode mempengaruhi error yang terjadi. Java hanya mengeksekusi sampai error pertama ditemukan.

**Perbaikan:**
Menukar urutan kode agar error tertentu dapat diuji terlebih dahulu.

---

### Percobaan 5

**Analisa:**
Menunjukkan penggunaan method pada exception:

* getMessage() → menampilkan pesan error
* printStackTrace() → menampilkan detail error
* printStackTrace(System.out) → menampilkan ke output

**Kesimpulan:**
Exception dapat digunakan untuk debugging program.

---

### Percobaan 6

**Analisa:**
Menggunakan keyword throw untuk membuat exception secara manual.
Setelah throw dijalankan, program langsung berpindah ke catch.

---

### Percobaan 7

**Analisa:**
Menampilkan berbagai informasi exception seperti:

* getMessage()
* toString()
* printStackTrace()

**Kesimpulan:**
Exception dapat memberikan informasi lengkap terkait error.

---

### Percobaan 8

**Analisa:**
Menggunakan keyword throws untuk melempar exception ke method pemanggil.

Perbedaan:

* Tanpa try-catch → error dilempar keluar
* Dengan try-catch → error ditangani

Finally akan selalu dijalankan.

---

### Percobaan 9

**Analisa:**
Menunjukkan propagasi exception dari method ke method lain.
Jika string kosong, maka exception akan dilempar dan ditangkap di main.

Finally tetap dijalankan.

---

### Percobaan 10

**Analisa:**
Menunjukkan penggunaan exception pada operasi file.
IOException dapat terjadi saat membaca/menulis file.

**Kesimpulan:**
File handling wajib menggunakan exception handling.

---

### Percobaan 11

**Analisa:**
Membuat custom exception dengan extends Throwable.

**Kesimpulan:**
Programmer dapat membuat exception sendiri sesuai kebutuhan.

---

### Percobaan 12

**Analisa:**
Custom exception dengan extends Exception.
Exception dilempar saat kondisi tertentu terpenuhi.

**Kesimpulan:**
Digunakan untuk validasi kondisi khusus dalam program.

---

## IV. KESIMPULAN

1. Exception handling digunakan untuk menangani error saat runtime.
2. Try-catch dapat mencegah program berhenti secara tiba-tiba.
3. Throw digunakan untuk membuat exception secara manual.
4. Throws digunakan untuk melempar exception ke method lain.
5. Finally selalu dijalankan meskipun terjadi error.
6. Exception dapat berupa built-in maupun custom.

---

## V. LAMPIRAN

(Lampirkan source code dan link GitHub/GitLab di sini)

---
