public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operator Precedence
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * operator precedence, associativity, dan cara mengontrol urutan evaluasi.
         */

        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        // Latihan 1: Precedence aritmatika dasar
        // - Buat variabel: a = 10, b = 5, c = 2
        int a = 10, b = 5, c = 2;

        // - Hitung hasil dari: a + b * c
        // - Prediksi hasilnya terlebih dahulu, lalu hitung dan print
        // Prediksi: 10 + (5 * 2) = 10 + 10 = 20
        // - Tambahkan komentar dengan prediksi vs hasil aktual
        int result1 = a + b * c;
        System.out.println("a + b * c -> prediksi: 20; hasil: " + result1
        + " (penjelasan: b * c => 5 * 2 = 10; lalu a + 10 => 20)");

        // - Hitung hasil dari: (a + b) * c
        // Prediksi: (10 + 5) * 2 = 15 * 2 = 30
        // - Bandingkan dengan hasil sebelumnya
        int result2 = (a + b) * c;
        System.out.println("(a + b) * c -> prediksi: 30; hasil: " + result2);

        // - Hitung hasil dari: a * b + c / 2
        // - Jelaskan urutan operasi dalam komentar
        int result3 = a * b + c / 2;
        System.out.println("a * b + c / 2 -> hasil: " + result3
        + " (a * b = 50; c / 2 = 1; 50 + 1 = 51)");

        // - Hitung hasil dari: a / b + c * 2
        // - Tunjukkan evaluasi step-by-step dalam komentar
        //Step-by-step: a / b (10 / 5 = 2) ; c * 2 (2 * 2 = 4) ; 2 + 4 = 6
        int result4 = a / b + c * 2;
        System.out.println("a / b + c * 2 -> hasil: " + result4
        + " (a / b = 2; c * 2 = 4; 2 + 4 = 6)");

        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        // Latihan 2: Mencampur operator aritmatika dan perbandingan
        // - Buat variabel: x = 15, y = 10, z = 20
        int x = 15, y = 10, z = 20;

        // - Evaluasi: x + y > z - 5
        // Step: x+y = 25; z-5 = 15; 25 > 15 => true
        // - Uraikan urutan evaluasi dalam komentar
        boolean comp1 = x + y > z - 5;
        System.out.println("x + y > z - 5 -> " + comp1
        + " (x+y=25 ; z-5=15 ; 25>15 => true)");

        // - Evaluasi: x > y + z / 4
        // Step: z/4 = 20/4 = 5 ; y + (z/4) = 10 + 5 = 15 ; x > 15 ? (15 > 15) => false
        // - Jelaskan operasi mana yang terjadi lebih dulu
        boolean comp2 = x > y + z / 4;
        System.out.println("x > y + z / 4 -> " + comp2
                + "  (z/4=5 ; y+5=15 ; x(15)>15 => false)");

        // - Evaluasi: (x + y) > (z - 5) && x < z
        // Step: (25 > 15) && (15 < 20) => true && true => true
        // - Tunjukkan bagaimana tanda kurung mengubah evaluasi
        boolean comp3 = (x + y) > (z - 5) && x < z;
        System.out.println("(x + y) > (z - 5) && x < z -> " + comp3);

        // - Buat ekspresi kompleks: x * 2 + y > z && y < x + 5
        // Step: x*2 + y = 30 + 10 = 40 ; 40 > 20 => true ; y < x+5 => 10 < 20 => true ; true && true -> true
        // - Prediksi hasilnya, lalu verifikasi
        boolean comp4 = x * 2 + y > z && y < x + 5;
        System.out.println("x * 2 + y > z && y < x + 5 -> " + comp4
                + "  (x*2+y=40>20 true ; y<x+5 true ; -> true)");

        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\n=== PRECEDENCE OPERATOR LOGIKA ===");

        // Latihan 3: Memahami precedence operator logika
        // - Buat variabel boolean: p = true, q = false, r = true
        boolean p = true, q = false, r = true;

        // - Evaluasi: p && q || r
        // && dievaluasi sebelum || -> (p && q) || r -> (true && false) || true -> false || true -> true
        // - Jelaskan mengapa && memiliki precedence lebih tinggi dari ||
        boolean logic1 = p && q || r;
        System.out.println("p && q || r -> " + logic1
                + "  (evaluasi: (p && q) -> false ; false || r -> true)");

        // - Evaluasi: p || q && r
        // q && r dievaluasi dulu -> p || (q && r) -> true || false -> true
        // - Bandingkan dengan hasil sebelumnya
        boolean logic2 = p || q && r;
        System.out.println("p || q && r -> " + logic2
                + "  (evaluasi: q&&r=false ; p||false=true)");

        // - Evaluasi: !p && q || r
        // ! memiliki precedence tertinggi: (!p) && q || r -> (!true)=false ; false&&q=false ; false||r=true
        // - Tunjukkan bagaimana NOT (!) memiliki precedence tertinggi
        boolean logic3 = !p && q || r;
        System.out.println("!p && q || r -> " + logic3
                + "  ( !p=false ; false&&q=false ; false||r=true )");

        // - Gunakan tanda kurung untuk mengubah evaluasi: p && (q || r)
        boolean logic4 = p && (q || r);
        System.out.println("p && (q || r) -> " + logic4
                + "  (q||r=true ; p&&true=true)");
        // - Bandingkan dengan p && q || r
        System.out.println("Perbandingan: (p && q || r) = " + logic1
                + " ; (p && (q || r)) = " + logic4
                + "  (nilai sama untuk kombinasi ini, tapi parentheses bisa mengubah hasil di kasus lain)");

        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\n=== TIPE OPERATOR CAMPURAN ===");

        // Latihan 4: Menggabungkan operator aritmatika, perbandingan, dan logika
        // - Buat variabel: num1 = 25, num2 = 15, num3 = 30
        int num1 = 25, num2 = 15, num3 = 30;

        // - Evaluasi: num1 > num2 + 5 && num3 / 2 < num1
        // - Uraikan urutan evaluasi lengkap
        boolean mix1 = num1 > num2 + 5 && num3 / 2 < num1;
        System.out.println("num1 > num2 + 5 && num3 / 2 < num1 -> " + mix1
                + "  (num2+5=20 ; num1>20 true ; num3/2=15 ; 15<num1 true ; overall true)");

        // - Evaluasi: num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10
        // Urutan: +,- dulu -> perbandingan >,< -> && -> ||
        // - Tunjukkan evaluasi step-by-step
        boolean mix2 = num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10;
        System.out.println("num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10 -> " + mix2
                + "  (evaluasi: left true ; right (true && true) -> true ; final true)");

        // - Gunakan tanda kurung untuk memaksa evaluasi berbeda: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10
        boolean mix3 = (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10;
        System.out.println("(num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10 -> " + mix3
                + "  (keduanya true untuk nilai sekarang sehingga hasil tetap true)");

        // - Bandingkan hasil dan jelaskan perbedaannya
        // Dengan tanda kurung memaksa berbeda: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        // Latihan 5: Unary operators dengan operasi lain
        // - Buat variabel: value = 8
        int value = 8;

        // - Evaluasi: ++value * 2
        // ++value * 2  (pre-increment: value becomes 9, lalu 9*2 = 18)
        // - Jelaskan operasi mana yang terjadi lebih dulu
        value = 8;
        int u1 = ++value * 2; // value -> 9, u1 = 18
        System.out.println("++value * 2 -> hasil: " + u1 + "  (value setelah operasi = " + value + ")");


        // - Reset value ke 8, lalu evaluasi: value++ * 2
        // value++ * 2  (post-increment: pakai nilai lama 8 untuk perkalian -> 8*2 = 16 ; setelah itu value jadi 9)
        // - Bandingkan dengan hasil sebelumnya
        value = 8;
        int u2 = value++ * 2; // u2 = 16 ; value -> 9
        System.out.println("value++ * 2 -> hasil: " + u2 + "  (value setelah operasi = " + value + ")");

        // - Reset value ke 8, lalu evaluasi: 2 * ++value
        // - Amati urutan evaluasi
        value = 8;
        int u3 = 2 * ++value; // value->9 ; u3 = 18
        System.out.println("2 * ++value -> hasil: " + u3 + "  (value setelah operasi = " + value + ")");

        // - Reset value ke 8, lalu evaluasi: -value + 10
        // (unary minus memiliki precedence tinggi => -8 + 10 = 2)
        // - Tunjukkan bagaimana unary minus memiliki precedence tinggi
        value = 8;
        int u4 = -value + 10; // -8 + 10 = 2
        System.out.println("-value + 10 -> hasil: " + u4);

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        // Latihan 6: Operator assignment dan precedence
        // - Buat variabel: a = 5, b = 10
        a = 5;
        b = 10;

        // - Evaluasi dan jelaskan: a += b * 2
        // - Tunjukkan bahwa aritmatika terjadi sebelum assignment
        a = 5; // reset
        a += b * 2; // same as a = a + (b*2)
        System.out.println("Setelah a += b * 2 -> a = " + a + "  (b*2=20 ; a was 5 ; a->25)");

        // - Reset a ke 5, lalu evaluasi: a *= b + 3
        // - Jelaskan urutan evaluasi
        a = 5;
        a *= b + 3; // a = a * (b+3)
        System.out.println("Setelah a *= b + 3 -> a = " + a + "  (b+3=13 ; a was 5 ; a->65)");

        // - Evaluasi: a = b > 5 ? b * 2 : b / 2
        // Ternary assignment: a = (b > 5 ? b * 2 : b / 2)
        // - Tunjukkan bagaimana ternary operator bekerja dengan assignment
        a = (b > 5 ? b * 2 : b / 2);
        System.out.println("a = b > 5 ? b * 2 : b / 2 -> a = " + a + "  (b=10 >5 -> a=b*2=20)");

        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        // Latihan 7: Menggunakan tanda kurung untuk mengontrol evaluasi
        // - Buat variabel: a = 8, b = 4, c = 2, d = 6
        a = 8;
        b = 4;
        c = 2;
        int d = 6;

        // - Bandingkan hasil dari: a + b * c - d dan (a + b) * (c - d)
        // - Tunjukkan langkah kalkulasi untuk keduanya
        int expr1 = a + b * c - d;
        System.out.println("a + b * c - d -> " + expr1
                + "  (4*2=8 ; 8+8=16 ; 16-6=10)");

        int expr2 = (a + b) * (c - d);
        System.out.println("(a + b) * (c - d) -> " + expr2
                + "  ((a+b)=12 ; (c-d)=-4 ; 12 * -4 = -48)");

        // - Bandingkan hasil dari: a > b && c < d || a == b dan a > b && (c < d || a == b)
        boolean logicExpr1 = a > b && c < d || a == b;
        System.out.println("a > b && c < d || a == b -> " + logicExpr1
                + "  (evaluasi: (a>b && c<d) -> true ; true || false -> true)");

        boolean logicExpr2 = a > b && (c < d || a == b);
        System.out.println("a > b && (c < d || a == b) -> " + logicExpr2
                + "  (parentheses memaksa evaluasi bagian dalam dulu; hasil tetap true untuk nilai kini)");
        // - Jelaskan bagaimana tanda kurung mengubah logika

        // - Buat ekspresi nested kompleks menggunakan beberapa level tanda kurung
        // - Contoh: ((a + b) * c) / (d - 2) > (a - b)
        // Step: (a+b)=12 ; *c => 24 ; (d-2)=4 ; 24/4=6 ; (a-b)=4 ; 6 > 4 => true
        // - Tunjukkan evaluasi step-by-step

        int numerator = ((a + b) * c);
        int denominator = (d - 2);
        int divisionResult = numerator / denominator;
        int rightSide = (a - b);
        boolean nested = divisionResult > rightSide;
        System.out.println("((a + b) * c) / (d - 2) -> " + divisionResult
                + " ; (a - b) -> " + rightSide
                + " ; ((...) / (...)) > (a-b) -> " + nested
                + "  (step: (a+b)=12 ; *c=24 ; d-2=4 ; 24/4=6 ; 6>4 true)");
    }
}
