package oj0;

import android.content.Context;
import android.graphics.Bitmap;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o4.v0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loj0/e;", "", "<init>", "()V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f132277a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, v0> f132278b = Collections.synchronizedMap(new LinkedHashMap());

    private e() {
    }

    public static v0 a(Context context, String str) throws Throwable {
        context.getClass();
        Map<String, v0> map = f132278b;
        v0 v0Var = map.get(str);
        if (v0Var != null) {
            a2 a2Var = a2.SUBSCRIPTIONS;
            String strM = am.j.m("Found ", str, " in memory");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GCPlusImageStore", strM);
            return v0Var;
        }
        zp0.e eVar = zp0.e.f206587a;
        String strValueOf = String.valueOf(str.hashCode());
        eVar.getClass();
        Bitmap bitmapB = zp0.e.b(context, "subscription_images", strValueOf);
        if (bitmapB == null) {
            return null;
        }
        o4.f fVar = new o4.f(bitmapB);
        a2 a2Var2 = a2.SUBSCRIPTIONS;
        String strM2 = am.j.m("Found ", str, " on disk");
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "GCPlusImageStore", strM2);
        map.put(str, fVar);
        return fVar;
    }
}
