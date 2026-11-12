package c31;

import b63.u;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc31/a;", "", "<init>", "()V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    public static d31.b a(String str) {
        if (str != null) {
            d31.b.f57332b.getClass();
            d31.b bVarA = d31.b.a.a(str);
            if (bVarA != null) {
                return bVarA;
            }
        }
        return d31.b.UNKNOWN;
    }

    public static u b(String str) {
        if (str != null) {
            try {
                return u.Companion.a(u.INSTANCE, str);
            } catch (Exception e4) {
                a2 a2Var = a2.ONBOARDING;
                String strConcat = "Failed to parse LocalDateTime from string: ".concat(str);
                i2.f36769a.getClass();
                i2.a.g(a2Var, strConcat, e4);
            }
        }
        return null;
    }

    public static d31.c c(String str) {
        if (str != null) {
            d31.c.f57340b.getClass();
            d31.c cVarA = d31.c.a.a(str);
            if (cVarA != null) {
                return cVarA;
            }
        }
        return d31.c.UNKNOWN;
    }

    public static d31.d d(String str) {
        if (str != null) {
            d31.d.f57349b.getClass();
            d31.d dVarA = d31.d.a.a(str);
            if (dVarA != null) {
                return dVarA;
            }
        }
        return d31.d.UNKNOWN;
    }

    public static String e(d31.c cVar) {
        String str;
        return (cVar == null || (str = cVar.f57347a) == null) ? d31.c.UNKNOWN.f57347a : str;
    }

    public static String f(d31.d dVar) {
        String str;
        return (dVar == null || (str = dVar.f57377a) == null) ? d31.d.UNKNOWN.f57377a : str;
    }
}
