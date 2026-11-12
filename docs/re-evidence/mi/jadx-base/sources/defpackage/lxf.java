package defpackage;

import com.xiaomi.fitness.nfc.bean.CardWrapper;

/* JADX INFO: loaded from: classes9.dex */
public class lxf {
    public static String a(boolean z) {
        return z ? c(false) : b();
    }

    public static String b() {
        return "http://cnbj1.fds.api.xiaomi.com/door-card-img/door_card_2.0/%E5%8D%95%E5%85%83.png";
    }

    public static String c(boolean z) {
        return z ? "http://cdn.cnbj1.fds.api.mi-img.com/plato-xiaoai/developer_0eac06044cd8adc170bb0a70bdbdf791.png?GalaxyAccessKeyId=AKVGLQWBOVIRQ3XLEW&Expires=9223372036854775807&Signature=TBcIEfpYwvxMfPVwvSVFaKZiaEo=" : "http://cdn.cnbj1.fds.api.mi-img.com/plato-xiaoai/developer_a5b106e5567267876bbb5200ad8e9983.png?GalaxyAccessKeyId=AKVGLQWBOVIRQ3XLEW&Expires=9223372036854775807&Signature=2oFx6nPZeIzVPYMNXsrABp4VlD0=";
    }

    public static boolean d(CardWrapper cardWrapper) {
        return cardWrapper != null && "59013-40002".equalsIgnoreCase(cardWrapper.getProductId());
    }

    public static boolean e(CardWrapper cardWrapper) {
        return "66666-00211".equalsIgnoreCase(cardWrapper.getProductId());
    }

    public static boolean f(CardWrapper cardWrapper) {
        return cardWrapper != null && ("59012-40001".equalsIgnoreCase(cardWrapper.getProductId()) || "5849414F4D49000001".equalsIgnoreCase(cardWrapper.mAid) || "http://cdn.cnbj1.fds.api.mi-img.com/door-card-img/xiaomi_staff_card/xiaomi_staff_card_art_new.png".equalsIgnoreCase(cardWrapper.getCardFace()));
    }
}
