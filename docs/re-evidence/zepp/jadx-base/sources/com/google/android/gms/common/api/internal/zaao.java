package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import java.util.Collections;
import java.util.Iterator;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes3.dex */
public final class zaao implements zaaw {

    @NotOnlyInitialized
    private final zaaz a;

    public zaao(zaaz zaazVar) {
        this.a = zaazVar;
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final void zaa() {
        Iterator<Api.Client> it2 = this.a.f.values().iterator();
        while (it2.hasNext()) {
            it2.next().disconnect();
        }
        this.a.n.p = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final void zaa(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final void zaa(@Nullable Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final boolean zab() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final void zac() {
        this.a.f();
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        this.a.n.h.add(t);
        return t;
    }
}
