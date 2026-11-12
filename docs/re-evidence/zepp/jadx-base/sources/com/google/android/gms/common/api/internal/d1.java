package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes3.dex */
final class d1 implements zabn {
    private final /* synthetic */ c1 a;

    private d1(c1 c1Var) {
        this.a = c1Var;
    }

    @Override // com.google.android.gms.common.api.internal.zabn
    public final void zaa(@Nullable Bundle bundle) {
        this.a.m.lock();
        try {
            this.a.k = ConnectionResult.RESULT_SUCCESS;
            this.a.r();
        } finally {
            this.a.m.unlock();
        }
    }

    public /* synthetic */ d1(c1 c1Var, b1 b1Var) {
        this(c1Var);
    }

    @Override // com.google.android.gms.common.api.internal.zabn
    public final void zaa(@NonNull ConnectionResult connectionResult) {
        this.a.m.lock();
        try {
            this.a.k = connectionResult;
            this.a.r();
        } finally {
            this.a.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabn
    public final void zaa(int i, boolean z) {
        this.a.m.lock();
        try {
            if (this.a.l) {
                this.a.l = false;
                this.a.d(i, z);
            } else {
                this.a.l = true;
                this.a.d.onConnectionSuspended(i);
            }
        } finally {
            this.a.m.unlock();
        }
    }
}
