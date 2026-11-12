package com.amap.api.col.p0003sl;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class jx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ix f2937a;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Map<String, jx> f2938a = new HashMap();
    }

    private jx(ix ixVar) {
        this.f2937a = ixVar;
    }

    public static jx a(ix ixVar) {
        if (a.f2938a.get(ixVar.a()) == null) {
            a.f2938a.put(ixVar.a(), new jx(ixVar));
        }
        return a.f2938a.get(ixVar.a());
    }

    public final void a(Context context, boolean z, boolean z2) {
        ka.a(context, this.f2937a, "sckey", String.valueOf(z));
        if (z) {
            ka.a(context, this.f2937a, "scisf", String.valueOf(z2));
        }
    }

    public final boolean a(Context context) {
        try {
            return Boolean.parseBoolean(ka.a(context, this.f2937a, "sckey"));
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean b(Context context) {
        try {
            return Boolean.parseBoolean(ka.a(context, this.f2937a, "scisf"));
        } catch (Throwable unused) {
            return true;
        }
    }
}
