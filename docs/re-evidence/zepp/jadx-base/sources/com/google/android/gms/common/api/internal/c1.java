package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zas;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
final class c1 implements zabo {
    private final Context a;
    private final zaar b;
    private final Looper c;
    private final zaaz d;
    private final zaaz e;
    private final Map<Api.AnyClientKey<?>, zaaz> f;

    @Nullable
    private final Api.Client h;

    @Nullable
    private Bundle i;
    private final Lock m;
    private final Set<SignInConnectionListener> g = Collections.newSetFromMap(new WeakHashMap());

    @Nullable
    private ConnectionResult j = null;

    @Nullable
    private ConnectionResult k = null;
    private boolean l = false;

    @GuardedBy("mLock")
    private int n = 0;

    private c1(Context context, zaar zaarVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, @Nullable Api.Client client, ArrayList<zaq> arrayList, ArrayList<zaq> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.a = context;
        this.b = zaarVar;
        this.m = lock;
        this.c = looper;
        this.h = client;
        this.d = new zaaz(context, zaarVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new e1(this, null));
        this.e = new zaaz(context, zaarVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new d1(this, null));
        ArrayMap arrayMap = new ArrayMap();
        Iterator<Api.AnyClientKey<?>> it2 = map2.keySet().iterator();
        while (it2.hasNext()) {
            arrayMap.put(it2.next(), this.d);
        }
        Iterator<Api.AnyClientKey<?>> it3 = map.keySet().iterator();
        while (it3.hasNext()) {
            arrayMap.put(it3.next(), this.e);
        }
        this.f = Collections.unmodifiableMap(arrayMap);
    }

    public static c1 b(Context context, zaar zaarVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        Api.Client client = null;
        for (Map.Entry<Api.AnyClientKey<?>, Api.Client> entry : map.entrySet()) {
            Api.Client value = entry.getValue();
            if (value.providesSignIn()) {
                client = value;
            }
            if (value.requiresSignIn()) {
                arrayMap.put(entry.getKey(), value);
            } else {
                arrayMap2.put(entry.getKey(), value);
            }
        }
        Preconditions.checkState(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (Api<?> api : map2.keySet()) {
            Api.AnyClientKey<?> anyClientKeyZac = api.zac();
            if (arrayMap.containsKey(anyClientKeyZac)) {
                arrayMap3.put(api, map2.get(api));
            } else {
                if (!arrayMap2.containsKey(anyClientKeyZac)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                arrayMap4.put(api, map2.get(api));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            zaq zaqVar = arrayList.get(i);
            i++;
            zaq zaqVar2 = zaqVar;
            if (arrayMap3.containsKey(zaqVar2.zaa)) {
                arrayList2.add(zaqVar2);
            } else {
                if (!arrayMap4.containsKey(zaqVar2.zaa)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(zaqVar2);
            }
        }
        return new c1(context, zaarVar, lock, looper, googleApiAvailabilityLight, arrayMap, arrayMap2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void d(int i, boolean z) {
        this.b.zaa(i, z);
        this.k = null;
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(@Nullable Bundle bundle) {
        Bundle bundle2 = this.i;
        if (bundle2 == null) {
            this.i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    @GuardedBy("mLock")
    private final void f(ConnectionResult connectionResult) {
        int i = this.n;
        if (i == 1) {
            s();
        } else if (i != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.b.zaa(connectionResult);
            s();
        }
        this.n = 0;
    }

    private static boolean l(@Nullable ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    private final boolean m(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        zaaz zaazVar = this.f.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zaazVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zaazVar.equals(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void r() {
        ConnectionResult connectionResult;
        if (!l(this.j)) {
            if (this.j != null && l(this.k)) {
                this.e.zac();
                f((ConnectionResult) Preconditions.checkNotNull(this.j));
                return;
            }
            ConnectionResult connectionResult2 = this.j;
            if (connectionResult2 == null || (connectionResult = this.k) == null) {
                return;
            }
            if (this.e.m < this.d.m) {
                connectionResult2 = connectionResult;
            }
            f(connectionResult2);
            return;
        }
        if (l(this.k) || t()) {
            int i = this.n;
            if (i == 1) {
                s();
            } else if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((zaar) Preconditions.checkNotNull(this.b)).zaa(this.i);
                s();
            }
            this.n = 0;
            return;
        }
        ConnectionResult connectionResult3 = this.k;
        if (connectionResult3 != null) {
            if (this.n == 1) {
                s();
            } else {
                f(connectionResult3);
                this.d.zac();
            }
        }
    }

    @GuardedBy("mLock")
    private final void s() {
        Iterator<SignInConnectionListener> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next().onComplete();
        }
        this.g.clear();
    }

    @GuardedBy("mLock")
    private final boolean t() {
        ConnectionResult connectionResult = this.k;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    @Nullable
    private final PendingIntent u() {
        if (this.h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.a, System.identityHashCode(this.b), this.h.getSignInIntent(), AMapEngineUtils.HALF_MAX_P20_WIDTH);
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(@NonNull T t) {
        if (!m(t)) {
            return (T) this.d.zaa(t);
        }
        if (!t()) {
            return (T) this.e.zaa(t);
        }
        t.setFailedResult(new Status(4, (String) null, u()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(@NonNull T t) {
        if (!m(t)) {
            return (T) this.d.zab(t);
        }
        if (!t()) {
            return (T) this.e.zab(t);
        }
        t.setFailedResult(new Status(4, (String) null, u()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final void zac() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.d.zac();
        this.e.zac();
        s();
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    public final boolean zad() {
        this.m.lock();
        try {
            boolean z = true;
            if (!this.d.zad() || (!this.e.zad() && !t() && this.n != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    public final boolean zae() {
        this.m.lock();
        try {
            return this.n == 2;
        } finally {
            this.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final void zaf() {
        this.d.zaf();
        this.e.zaf();
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    public final void zag() {
        this.m.lock();
        try {
            boolean zZae = zae();
            this.e.zac();
            this.k = new ConnectionResult(4);
            if (zZae) {
                new zas(this.c).post(new b1(this));
            } else {
                s();
            }
        } finally {
            this.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @Nullable
    @GuardedBy("mLock")
    public final ConnectionResult zaa(@NonNull Api<?> api) {
        if (Objects.equal(this.f.get(api.zac()), this.e)) {
            if (t()) {
                return new ConnectionResult(4, u());
            }
            return this.e.zaa(api);
        }
        return this.d.zaa(api);
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final void zaa() {
        this.n = 2;
        this.l = false;
        this.k = null;
        this.j = null;
        this.d.zaa();
        this.e.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    @GuardedBy("mLock")
    public final ConnectionResult zaa(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    public final boolean zaa(SignInConnectionListener signInConnectionListener) {
        this.m.lock();
        try {
            if ((zae() || zad()) && !this.e.zad()) {
                this.g.add(signInConnectionListener);
                if (this.n == 0) {
                    this.n = 1;
                }
                this.k = null;
                this.e.zaa();
                return true;
            }
            return false;
        } finally {
            this.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabo
    public final void zaa(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.zaa(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.zaa(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
