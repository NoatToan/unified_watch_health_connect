package q92;

import c22.b0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x[] f143616a = {x.DI_CONNECT_UPLOAD, x.DI_CONNECT_INSIGHTS, x.DI_CONNECT_LIVETRACK, x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN};

    public static final boolean a(v vVar) {
        vVar.getClass();
        if (vVar.f143785c == u.PENDING_RECONSENT) {
            return !vVar.b() || p005kotlin.jvm.internal.s.g(vVar.f143789g.get(e.FLOW.f143626a), "GRADUATION_FLOW");
        }
        return false;
    }

    public static final Date b(String str) {
        if (str != null && !d53.w.J(str)) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat.parse(str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final boolean c(v vVar) {
        vVar.getClass();
        return !vVar.b() || d(vVar);
    }

    public static final boolean d(v vVar) {
        vVar.getClass();
        String country = Locale.CHINA.getCountry();
        p92.o.f136619a.getClass();
        p92.o.l();
        return d53.u.q(country, b0.b(null), true) && p13.u.z(f143616a, vVar.f143783a) && vVar.b() && vVar.f143785c == u.DEFAULT;
    }
}
