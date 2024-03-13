## JMeter test plans and their execution through the GUI
1. **HTTP Request for `/all-student`**
<p align="center">
  <img src="src\main\resources\static\image\all-student\all-students request.png" />
</p>

2. **HTTP Request for `/all-student-name`**
<p align="center">
  <img src="src\main\resources\static\image\all-student-name\all-students-name request.png" />
</p>

3. **HTTP Request for `/highest-gpa`**
<p align="center">
  <img src="src\main\resources\static\image\highest-gpa\highest-gpa request.png" />
</p>

## JMeter test plan through the command line 
1. **HTTP Request for `/all-student`**
<p align="center">
  <img src="src\main\resources\static\image\all-student\all-students-results request.png" />
</p>

2. **HTTP Request for `/all-student-name`**
<p align="center">
  <img src="src\main\resources\static\image\all-student-name\all-students-name-results request.png" />
</p>

3. **HTTP Request for `/highest-gpa`**
<p align="center">
  <img src="src\main\resources\static\image\highest-gpa\highest-gpa-results request.png" />
</p>

## Optimizing endpoint /all-student
<p align="center">
  <img src="src\main\resources\static\image\all-student\getallstudents-optim.png" />
</p>

## Optimizing endpoint /highest-gpa
<p align="center">
  <img src="src\main\resources\static\image\highest-gpa\highestgpa-prof-optim.png" />
</p>

## Optimizing endpoint /all-student-name
<p align="center">
  <img src="src\main\resources\static\image\all-student-name\joinStudent-optim.png" />
</p>

## The re-measurement through JMeter after performance optimization
1. **Optimization `/all-student`**
<p align="center">
  <img src="src\main\resources\static\image\all-student\all-students-optim request.png" />
</p>
Kesimpulan : Terdapat penurunan `_execution time_` saat mengakses endpoint `/all-student` dari rata-rata 29.328,4ms menjadi 3.421,9ms pada JMeter dan dari rata-rata 2.080ms menjadi 559ms pada Profiling Intellij.

2. **HTTP Request for `/all-student-name`**
<p align="center">
  <img src="src\main\resources\static\image\all-student-name\all-students-name-optim request.png" />
</p>
Kesimpulan : Terdapat penurunan `_execution time_` saat mengakses endpoint `/all-student-name` dari rata-rata 513,9ms menjadi 231,6ms pada JMeter dan dari rata-rata 246ms menjadi 143ms pada Profiling Intellij.

3. **HTTP Request for `/highest-gpa`**
<p align="center">
  <img src="src\main\resources\static\image\highest-gpa\highest-gpa-optim request.png" />
</p>
Kesimpulan : Terdapat penurunan `_execution time_` saat mengakses endpoint `/highest-gpa` dari rata-rata 414,4ms menjadi 12ms pada JMeter dan dari rata-rata 130ms menjadi 78ms pada Profiling Intellij.

## Reflection
1. Perbedaan antara pendekatan pengujian kinerja dengan JMeter dan Profiler IntelliJ dalam konteks mengoptimalkan kinerja aplikasi sangat signifikan. JMeter memfokuskan pada evaluasi bagaimana kode aplikasi beroperasi dan apakah respons yang dihasilkannya dapat diterima atau tidak. Ini berarti JMeter digunakan untuk mengukur kinerja secara keseluruhan dari perspektif pengguna, seperti waktu tanggapan, throughput, dan kemampuan untuk menangani beban yang tinggi.
Di sisi lain, Profiler IntelliJ tidak hanya melakukan evaluasi kinerja kode, tetapi juga menyediakan analisis mendalam tentang bagaimana kode aplikasi dieksekusi. Profiler ini dapat mengidentifikasi secara spesifik bagian kode mana yang memakan waktu eksekusi yang cukup lama. Dengan demikian, Profiler IntelliJ memungkinkan pengembang untuk mengetahui dengan tepat di mana titik-titik lemah dalam kode tersebut berada dan memberikan informasi yang diperlukan untuk melakukan optimasi yang lebih spesifik.

2. Proses profilisasi membantu mengidentifikasi dan memahami titik-titik lemah dalam aplikasi dengan menyajikan berbagai visualisasi yang informatif, seperti flame graph, call tree, atau daftar metode dari hasil kerja aplikasi. Melalui Profiler IntelliJ, pengguna dapat memilih berbagai metrik untuk menganalisis kinerja aplikasi, seperti CPU time, total time, atau alokasi memori, untuk setiap bagian kode aplikasi.
3. Ya, Profiler IntelliJ bisa dengan efektif  menganalisis dan mengidentifikasi bottleneck dalam kode aplikasi yg saya kembangkan. Profiller intellij menyediakan visualisasi yang jelas tentang penggunaan sumber daya dan memungkinkan untuk menelusuri jalur eksekusi kode secara mendalam, membantu pengembang dalam mengidentifikasi dan memperbaiki masalah kinerja.Visualisasi seperti flame graph dan call tree memungkinkan pengembang untuk melihat secara grafis bagaimana waktu eksekusi aplikasi terdistribusi di antara berbagai fungsi atau metode. Dengan melihat metrik yang berbeda, seperti CPU time atau total time, pengguna dapat mengidentifikasi dengan jelas bagian-bagian kode yang memakan waktu eksekusi yang signifikan.
4. Tantangan utama dalam pengujian kinerja adalah menentukan skenario pengujian yang representatif dan memastikan hasilnya konsisten. Dalam profilisasi, tantangan utama adalah menginterpretasikan data yang kompleks dan menemukan penyebab sebenarnya dari bottleneck. Untuk mengatasi tantangan ini, penting untuk memiliki pemahaman yang kuat tentang arsitektur dan kode aplikasi, serta menggunakan alat-alat pengujian dan profilisasi dengan bijak.Tantangan utama dalam pengujian kinerja adalah menentukan skenario pengujian yang representatif dan memastikan hasilnya konsisten. Dalam profilisasi, tantangan utama adalah menginterpretasikan data yang kompleks dan menemukan penyebab sebenarnya dari bottleneck. Untuk mengatasi tantangan ini, penting untuk memiliki pemahaman yang kuat tentang arsitektur dan kode aplikasi, serta menggunakan alat-alat pengujian dan profilisasi dengan bijak.
5. Manfaat utama dari menggunakan Profiler IntelliJ adalah kemampuannya untuk memberikan wawasan mendalam tentang penggunaan sumber daya dan kinerja aplikasi pada tingkat kode. profiller intellij memungkinkan saya untuk mengidentifikasi dan memperbaiki masalah kinerja dengan lebih efisien.
6. Dalam situasi dimana hasil dari profilisasi dengan profiller intellij tidak sepenuhnya konsisten dengan temuan dari pengujian kinerja menggunakan jmeter, penting untuk menganalisis perbedaan antara hasil profilisasi dan pengujian kinerja untuk memahami penyebabnya. Hal ini bisa terjadi karena perbedaan dalam lingkungan pengujian, skenario pengujian yang tidak representatif, atau masalah konfigurasi. Untuk menangani hal ini, perlu dilakukan investigasi lebih lanjut dan mungkin perlu melakukan pengujian dan profilisasi lebih lanjut dengan skenario yang lebih sesuai.
7. Setelah menganalisis hasil dari pengujian kinerja dan profilisasi, terdapat beberapa strategi yang dapat diimplementasikan untuk mengoptimalkan kode aplikasi. Salah satunya adalah dengan melakukan refaktorisasi kode, yang melibatkan restrukturisasi kode agar lebih efisien dan mudah dipahami tanpa mengorbankan fungsionalitas. Selain itu, pengoptimalan algoritma juga merupakan strategi yang efektif untuk meningkatkan kinerja aplikasi dengan mengidentifikasi dan mengimplementasikan pendekatan algoritma yang lebih efisien.
Untuk memastikan bahwa perubahan yang dilakukan tidak memengaruhi fungsionalitas aplikasi, penting untuk melakukan pengujian regresi secara menyeluruh. Pengujian ini akan memvalidasi bahwa perubahan yang diterapkan tidak menyebabkan kerusakan atau perubahan yang tidak diinginkan pada aplikasi. Dengan pendekatan ini, pengembang dapat memastikan bahwa aplikasi tetap stabil dan berkinerja tinggi setelah perubahan tersebut diterapkan.
