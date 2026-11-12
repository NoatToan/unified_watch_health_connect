package c22;

import android.content.Context;
import com.garmin.util.StringRetriever;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/t2;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t2 {
    static {
        new t2();
    }

    private t2() {
    }

    public static final String a(int i14, Context context) {
        context.getClass();
        String strE = StringRetriever.e(i14, context);
        if (strE != null) {
            return strE;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        String strF = v.e0.f(i14, "Security string for index {", "} is null");
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.e(a2Var, strF);
        return "";
    }
}
