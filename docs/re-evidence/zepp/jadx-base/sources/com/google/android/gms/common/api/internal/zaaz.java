package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes3.dex */
public final class zaaz implements zabo, zap {
    private final Lock a;
    private final Condition b;
    private final Context c;
    private final GoogleApiAvailabilityLight d;
    private final t e;
    public final Map<Api.AnyClientKey<?>, Api.Client> f;

    @Nullable
    private final ClientSettings h;
    private final Map<Api<?>, Boolean> i;

    @Nullable
    private final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> j;

    @NotOnlyInitialized
    private volatile zaaw k;
    public int m;
    public final zaar n;
    public final zabn o;
    public final Map<Api.AnyClientKey<?>, ConnectionResult> g = new HashMap();

    @Nullable
    private ConnectionResult l = null;

    public zaaz(Context context, zaar zaarVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, @Nullable ClientSettings clientSettings, Map<Api<?>, Boolean> map2, @Nullable Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList, zabn zabnVar) {
        this.c = context;
        this.a = lock;
        this.d = googleApiAvailabilityLight;
        this.f = map;
        this.h = clientSettings;
        this.i = map2;
        this.j = abstractClientBuilder;
        this.n = zaarVar;
        this.o = zabnVar;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            zaq zaqVar = arrayList.get(i);
            i++;
            zaqVar.zaa(this);
        }
        this.e = new t(this, looper);
        this.b = lock.newCondition();
        this.k = new zaao(this);
    }

    public final void b(@Nullable ConnectionResult connectionResult) {
        this.a.lock();
        try {
            this.l = connectionResult;
            this.k = new zaao(this);
            this.k.zaa();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public final void c(s sVar) {
        this.e.sendMessage(this.e.obtainMessage(1, sVar));
    }

    public final void d(RuntimeException runtimeException) {
        this.e.sendMessage(this.e.obtainMessage(2, runtimeException));
    }

    public final void f() {
        this.a.lock();
        try {
            this.k = new zaaf(this, this.h, this.i, this.d, this.j, this.a, this.c);
            this.k.zaa();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public final void g() {
        this.a.lock();
        try {
            this.n.h();
            this.k = new zaaa(this);
            this.k.zaa();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        this.a.lock();
        try {
            this.k.zaa(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.a.lock();
        try {
            this.k.zaa(i);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(@NonNull T t) {
        t.zab();
        return (T) this.k.zaa(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    public final boolean zaa(SignInConnectionListener signInConnectionListener) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(@NonNull T t) {
        t.zab();
        return (T) this.k.zab(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final void zac() {
        if (this.k.zab()) {
            this.g.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    public final boolean zad() {
        return this.k instanceof zaaa;
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    public final boolean zae() {
        return this.k instanceof zaaf;
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final void zaf() {
        if (zad()) {
            ((zaaa) this.k).b();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    public final void zag() {
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final void zaa() {
        this.k.zac();
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final ConnectionResult zab() {
        zaa();
        while (zae()) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (zad()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.l;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final ConnectionResult zaa(long j, TimeUnit timeUnit) {
        zaa();
        long nanos = timeUnit.toNanos(j);
        while (zae()) {
            if (nanos <= 0) {
                zac();
                return new ConnectionResult(14, null);
            }
            try {
                nanos = this.b.awaitNanos(nanos);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        if (zad()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.l;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @Nullable
    @GuardedBy("mLock")
    public final ConnectionResult zaa(@NonNull Api<?> api) {
        Api.AnyClientKey<?> anyClientKeyZac = api.zac();
        if (!this.f.containsKey(anyClientKeyZac)) {
            return null;
        }
        if (this.f.get(anyClientKeyZac).isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        if (this.g.containsKey(anyClientKeyZac)) {
            return this.g.get(anyClientKeyZac);
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zaa(@NonNull ConnectionResult connectionResult, @NonNull Api<?> api, boolean z) {
        this.a.lock();
        try {
            this.k.zaa(connectionResult, api, z);
        } finally {
            this.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    public final void zaa(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.k);
        for (Api<?> api : this.i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) api.zad()).println(":");
            ((Api.Client) Preconditions.checkNotNull(this.f.get(api.zac()))).dump(strConcat, fileDescriptor, printWriter, strArr);
        }
    }
}
