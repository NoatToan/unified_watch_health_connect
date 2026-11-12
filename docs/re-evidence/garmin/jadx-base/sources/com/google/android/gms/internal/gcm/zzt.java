package com.google.android.gms.internal.gcm;

import j20.x;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes14.dex */
final class zzt extends WeakReference<Throwable> {
    private final int zzdv;

    public zzt(Throwable th3, ReferenceQueue<Throwable> referenceQueue) {
        super(th3, referenceQueue);
        if (th3 != null) {
            this.zzdv = System.identityHashCode(th3);
        } else {
            x.l("The referent cannot be null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzt.class) {
            if (this == obj) {
                return true;
            }
            zzt zztVar = (zzt) obj;
            if (this.zzdv == zztVar.zzdv && get() == zztVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzdv;
    }
}
