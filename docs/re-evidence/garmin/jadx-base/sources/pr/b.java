package pr;

import am.j;
import ez0.c;
import i3.e5;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import z10.h3;
import zy0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpr/b;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f139599a = new b();

    private b() {
    }

    public static String a(String str, String str2) {
        str.getClass();
        String strK = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).k(c.GC_WEB_URL);
        h3.f201031a.getClass();
        return j.o(str2, ".png", e5.l(strK, "/images/activity-share/create-card/", h3.a(), "/", str));
    }

    public static String b(String str) {
        String strK = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).k(c.GC_WEB_URL);
        h3.f201031a.getClass();
        StringBuilder sbL = e5.l(strK, "/images/activity-share/", h3.a(), "/", str);
        sbL.append(".png");
        return sbL.toString();
    }

    public static String c(String str) {
        String strK = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).k(c.GC_WEB_URL);
        h3.f201031a.getClass();
        StringBuilder sbL = e5.l(strK, "/images/activity-share/transparency/", h3.a(), "/transparency", str);
        sbL.append(".png");
        return sbL.toString();
    }
}
