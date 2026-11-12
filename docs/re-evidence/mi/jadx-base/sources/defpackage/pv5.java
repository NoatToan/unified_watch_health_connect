package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class pv5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l4d f30818a = new l4d("JPEG", "jpeg");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l4d f30819b = new l4d("PNG", "png");
    public static final l4d c = new l4d("GIF", "gif");
    public static final l4d d = new l4d("BMP", "bmp");
    public static final l4d e = new l4d("ICO", "ico");
    public static final l4d f = new l4d("WEBP_SIMPLE", "webp");
    public static final l4d g = new l4d("WEBP_LOSSLESS", "webp");
    public static final l4d h = new l4d("WEBP_EXTENDED", "webp");
    public static final l4d i = new l4d("WEBP_EXTENDED_WITH_ALPHA", "webp");
    public static final l4d j = new l4d("WEBP_ANIMATED", "webp");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l4d f30820k = new l4d("HEIF", "heif");

    public static boolean a(l4d l4dVar) {
        return l4dVar == f || l4dVar == g || l4dVar == h || l4dVar == i;
    }

    public static boolean b(l4d l4dVar) {
        return a(l4dVar) || l4dVar == j;
    }
}
