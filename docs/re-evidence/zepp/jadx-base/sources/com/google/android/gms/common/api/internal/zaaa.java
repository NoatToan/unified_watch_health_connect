package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zaaa implements zaaw {
    private final zaaz a;
    private boolean b = false;

    public zaaa(zaaz zaazVar) {
        this.a = zaazVar;
    }

    public final void b() {
        if (this.b) {
            this.b = false;
            this.a.n.x.zaa();
            zab();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        return (T) zab(t);
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final void zaa() {
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final void zaa(@Nullable Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        try {
            this.a.n.x.a(t);
            zaar zaarVar = this.a.n;
            Api.Client client = zaarVar.o.get(t.getClientKey());
            Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.a.g.containsKey(t.getClientKey())) {
                t.run(client);
            } else {
                t.setFailedResult(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.a.c(new b(this, this));
        }
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final void zac() {
        if (this.b) {
            this.b = false;
            this.a.c(new a(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final void zaa(int i) {
        this.a.b(null);
        this.a.o.zaa(i, this.b);
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final boolean zab() {
        if (this.b) {
            return false;
        }
        Set<zacn> set = this.a.n.w;
        if (set != null && !set.isEmpty()) {
            this.b = true;
            Iterator<zacn> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
            return false;
        }
        this.a.b(null);
        return true;
    }
}
