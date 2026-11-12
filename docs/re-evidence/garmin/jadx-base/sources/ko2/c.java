package ko2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lko2/c;", "Las2/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends as2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f105778b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DecimalFormatSymbols f105779c = new DecimalFormatSymbols(Locale.CHINA);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DecimalFormat f105780d;

    static {
        b.f105773a.getClass();
        f105780d = b.f105774b;
    }

    private c() {
    }

    public static String e(double d14) {
        if (d14 == 0.0d) {
            b.f105773a.getClass();
            String str = b.f105776d.format(d14);
            str.getClass();
            return str;
        }
        b.f105773a.getClass();
        String str2 = b.f105774b.format(d14);
        str2.getClass();
        return str2;
    }

    public static String f(double d14) {
        b.f105773a.getClass();
        String str = b.f105777e.format(d14);
        str.getClass();
        return str;
    }

    @Override // as2.a
    /* JADX INFO: renamed from: c */
    public final DecimalFormat getF85281c() {
        return f105780d;
    }

    @Override // as2.a
    /* JADX INFO: renamed from: d */
    public final DecimalFormatSymbols getF85280b() {
        return f105779c;
    }
}
