package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hv {
    private gt a;
    private volatile int b = -1;

    public static class a {
        public static Map<String, hv> a = new HashMap();
    }

    private hv(gt gtVar) {
        this.a = gtVar;
    }

    public static hv a(gt gtVar) {
        if (a.a.get(gtVar.a()) == null) {
            a.a.put(gtVar.a(), new hv(gtVar));
        }
        return a.a.get(gtVar.a());
    }

    public final boolean b(Context context) {
        try {
            return Boolean.parseBoolean(hz.a(context, this.a, "scisf"));
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void a(Context context, boolean z, boolean z2) {
        hz.a(context, this.a, "sckey", String.valueOf(z));
        if (z) {
            hz.a(context, this.a, "scisf", String.valueOf(z2));
        }
    }

    public final boolean a(Context context) {
        try {
            return Boolean.parseBoolean(hz.a(context, this.a, "sckey"));
        } catch (Throwable unused) {
            return false;
        }
    }
}
