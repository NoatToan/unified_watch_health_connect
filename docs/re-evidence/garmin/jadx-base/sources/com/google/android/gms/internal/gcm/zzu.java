package com.google.android.gms.internal.gcm;

import j20.x;
import n23.j;

/* JADX INFO: loaded from: classes14.dex */
final class zzu extends zzr {
    private final zzs zzdw = new zzs();

    @Override // com.google.android.gms.internal.gcm.zzr
    public final void zzd(Throwable th3, Throwable th4) {
        if (th4 == th3) {
            j.w("Self suppression is not allowed.", th4);
        } else if (th4 != null) {
            this.zzdw.zzd(th3, true).add(th4);
        } else {
            x.l("The suppressed exception cannot be null.");
        }
    }
}
