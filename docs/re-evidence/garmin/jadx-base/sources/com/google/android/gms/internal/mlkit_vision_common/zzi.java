package com.google.android.gms.internal.mlkit_vision_common;

import j20.x;
import java.util.Objects;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes14.dex */
final class zzi {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            x.l("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            x.l(e.f("null value in entry: ", "=null", obj));
        }
    }
}
