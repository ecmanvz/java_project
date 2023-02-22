# java_project
Projenin amacı bir metin belgesini açıp içindeki kelimelere RegEx yardımıyla kimlik atayıp ( e-mail , web sitesi , sesli harf vb…) sayım yapan bir uygulama geliştirmektir.
GELİŞTİRİLEN YAZILIM:
Ödev dökümanı iyice incelenip fizibilite araştırması yaptıktan sonra uygulamanın nasıl geliştirileceğine dair fikir yürütüldü. İnternetten RegEx ile ilgili araştırmalar yapılıp bu ifadelerin nasıl yazıldığı iyice öğrenildi.
Uygulamanın geliştirilebilmesi için RegEx ifadeler çok büyük önem arzediyordu çünkü başka türlü bir sayım stili geliştirmek hem çok karmaşıktı hem de çok fazla kod yazma gerektiriyordu. RegEx ifadeleri hazırlaması da zor ve karmaşıktı fakat kesin bir çözüm getiriyordu. Bu sebeple gerek internetten bulunan hazır ifadeler üzerinde amacımıza göre değişiklikler yaparak , gerek ifadeleri bizzat yazarak RegEx ifadeler oluşturuldu.
Genelde çoğu sayım RegEx yardımıyla yapıldı fakat cümle sayımı için stabil çalışan bir RegEx oluşturulamadı. Oluşturulan ifadeler iyi çalışmıyordu bazı web sitelerini , emailleri de cümle olarak kabul ediyordu ve karışıklık çıkıyordu. Bu sebeple cümle sayımlarında kelimenin sonunda nokta olup olmamasına bakıldı. Eğer cümle ise bu nokta kaldırıldı çünkü cümlenin son kelimesi bir e mail adresi,web sitesi de olabilirdi ve sondaki nokta sayım yapan regex ifadeyi yanıltıyordu.
SONUÇ:
Sonunda stabil olarak sayım yapabilen bir uygulama geliştirilebildi. RegEx kazanımı elde edildi. Uygulama farklı dökümanlarda da test edildi fakat şu ana kadar herhangi bir sorunla karşılaşılmadı.
