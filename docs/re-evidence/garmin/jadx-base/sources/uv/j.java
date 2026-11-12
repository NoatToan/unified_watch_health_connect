package uv;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luv/j;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f172903a;

    static {
        new j();
        f172903a = j.class.getSimpleName();
    }

    private j() {
    }

    public static final String a(String str) {
        str.getClass();
        try {
            Integer numValueOf = Integer.valueOf(str);
            return (numValueOf.intValue() / 100) + "." + w.M(2, String.valueOf(numValueOf.intValue() % 100));
        } catch (NumberFormatException e4) {
            String strN = fb1.c.n("The firmware version is not a valid number: ", e4.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, f172903a, strN);
            return "0";
        }
    }
}
