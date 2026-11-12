package com.google.android.gms.measurement.internal;

import am.j;
import android.os.Bundle;
import p6.b;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzjh {
    public static void zza(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static Object zzb(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        h.z(j.o(obj2.getClass().getCanonicalName(), "]", b.i("Invalid conditional user property field type. '", str, "' expected [", cls.getCanonicalName(), "] but was [")));
        return null;
    }
}
