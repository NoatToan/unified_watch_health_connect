package com.google.android.gms.internal.fitness;

import android.util.Log;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.fitness.result.DataReadResult;

/* JADX INFO: loaded from: classes3.dex */
final class r0 extends zzbf {
    private final BaseImplementation.ResultHolder<DataReadResult> b;
    private int c;
    private DataReadResult d;

    private r0(BaseImplementation.ResultHolder<DataReadResult> resultHolder) {
        this.c = 0;
        this.b = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzbc
    public final void zza(DataReadResult dataReadResult) {
        synchronized (this) {
            if (Log.isLoggable("Fitness", 2)) {
                int i = this.c;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Received batch result ");
                sb.append(i);
                Log.v("Fitness", sb.toString());
            }
            DataReadResult dataReadResult2 = this.d;
            if (dataReadResult2 == null) {
                this.d = dataReadResult;
            } else {
                dataReadResult2.zzb(dataReadResult);
            }
            int i2 = this.c + 1;
            this.c = i2;
            if (i2 == this.d.zzab()) {
                this.b.setResult(this.d);
            }
        }
    }

    public /* synthetic */ r0(BaseImplementation.ResultHolder resultHolder, k0 k0Var) {
        this(resultHolder);
    }
}
