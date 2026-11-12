package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes14.dex */
final class zzab extends zzz<Bundle> {
    public zzab(int i14, int i15, Bundle bundle) {
        super(i14, 1, bundle);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.iid.zzz
    public final void zzh(Bundle bundle) {
        Object bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bundle2);
            new StringBuilder(strValueOf2.length() + strValueOf.length() + 16);
        }
        this.zzcq.setResult((T) bundle2);
    }

    @Override // com.google.android.gms.iid.zzz
    public final boolean zzw() {
        return false;
    }
}
