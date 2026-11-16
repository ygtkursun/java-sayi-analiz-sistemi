# Rapor

**Ad Soyad:** Yiğit Kurşun  
**Numara:** 95

## 1. Algoritma Açıklaması

Program kullanıcıdan sürekli sayı girmesini ister. Girilen sayı 0 olmadığı sürece sayının asal olup olmadığını, mükemmel sayı olup olmadığını ve kaç basamaklı olduğunu kontrol eder. Ardından pozitif, negatif, tek ve çift sayı sayaçlarını sürekli günceller; sayıların toplamını, en büyüğünü ve en küçüğünü hesaplar. Kullanıcı 0 girdiğinde o zamana kadar girilen sayılara ait rapor ekrana yazdırılır.

## 2. Girdi - İşlem - Çıktı

**Girdiler:**
- Kullanıcının girdiği tam sayılar.
- Çıkış yapmak için 0.

**İşlemler:**
- Sayının asal olup olmadığını kontrol etme.
- Sayının mükemmel olup olmadığını kontrol etme.
- Sayının basamak sayısını hesaplama.
- Pozitif, negatif, tek ve çift sayı adetlerini hesaplama.
- Girilen sayıların toplamını ve ortalamasını hesaplama.
- En büyük ve en küçük sayıyı bulma.

**Çıktılar:**
- Sayının asal olup olmadığı.
- Sayının mükemmel olup olmadığı.
- Sayının basamak sayısı.
- Pozitif, negatif, tek ve çift sayı adetleri.
- Girilen sayı adedi.
- Sayıların toplamı ve ortalaması.
- En büyük ve en küçük sayı.
- Çıkış mesajı.

## 3. Sözde Kod (Pseudocode)

1. Başla.
2. Gerekli değişkenleri tanımla.
3. Kullanıcıdan bir sayı girmesini iste.
4. Girilen sayı 0 ise döngüyü bitir.
5. Sayının asal olup olmadığını kontrol et.
6. Sayının mükemmel olup olmadığını kontrol et.
7. Sayının basamak sayısını hesapla.
8. Pozitif, negatif, tek ve çift sayı sayaçlarını güncelle.
9. Sayı adedini ve toplamı güncelle.
10. En büyük ve en küçük sayıyı belirle.
11. Tekrar kullanıcıdan sayı iste.
12. 0 girildiğinde ortalamayı hesapla.
13. İstatistik raporunu ekrana yazdır.
14. Bitir.

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Senaryoları (en az 8)

| No | Girilen sayılar | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 | 5, 0 | Pozitif, tek, asal | Pozitif, tek, asal | Evet |
| 2 | -4, 0 | Negatif, çift | Negatif, çift | Evet |
| 3 | 7, 0 | Asal sayı | Asal sayı | Evet |
| 4 | 6, 0 | Mükemmel sayı değil | Mükemmel sayı değil | Evet |
| 5 | 28, 0 | Mükemmel sayı | Mükemmel sayı | Evet |
| 6 | 10, 0 | 2 basamaklı, asal değil | 2 basamaklı, asal değil | Evet |
| 7 | 12, -7, 5, 0 | 2 pozitif, 1 negatif, toplam 10, ortalama 3,33 | 2 pozitif, 1 negatif, toplam 10, ortalama 3,33 | Evet |
| 8 | 0 | Çıkış mesajı, rapor gösterilmez | Çıkış mesajı, rapor gösterilmez | Evet |

## 6. Ek Görevler (Opsiyonel)
<!-- Max-min farkı, pozitiflerin ortalaması, asal sayı adedi için örnek çıktılar. -->

