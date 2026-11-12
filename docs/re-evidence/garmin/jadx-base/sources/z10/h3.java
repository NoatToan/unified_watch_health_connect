package z10;

import java.text.MessageFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz10/h3;", "", "<init>", "()V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h3 f201031a = new h3();

    private h3() {
    }

    public static String a() {
        int i14 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c().getResources().getDisplayMetrics().densityDpi;
        if (i14 <= 160) {
            return "mdpi";
        }
        if (i14 <= 240) {
            return "hdpi";
        }
        return i14 <= 320 ? "xhdpi" : "xxhdpi";
    }

    public static String b(String str) {
        String str2;
        if (p005kotlin.jvm.internal.s.g(str, "MY_FITNESS_PAL")) {
            str2 = "3rd_party_mfp.png";
        } else {
            str2 = p005kotlin.jvm.internal.s.g(str, "STRAVA") ? "3rd_party_strava.png" : "";
        }
        String str3 = MessageFormat.format("http://static.garmincdn.com/com.garmin.connect/content/images/gcm/gdpr/third_party/android/{0}/{1}", a(), str2);
        str3.getClass();
        return str3;
    }
}
