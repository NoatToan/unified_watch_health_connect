package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zau;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zaaf implements zaaw {
    private final zaaz a;
    private final Lock b;
    private final Context c;
    private final GoogleApiAvailabilityLight d;

    @Nullable
    private ConnectionResult e;
    private int f;
    private int h;

    @Nullable
    private com.google.android.gms.signin.zae k;
    private boolean l;
    private boolean m;
    private boolean n;

    @Nullable
    private IAccountAccessor o;
    private boolean p;
    private boolean q;

    @Nullable
    private final ClientSettings r;
    private final Map<Api<?>, Boolean> s;

    @Nullable
    private final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> t;
    private int g = 0;
    private final Bundle i = new Bundle();
    private final Set<Api.AnyClientKey> j = new HashSet();
    private ArrayList<Future<?>> u = new ArrayList<>();

    public zaaf(zaaz zaazVar, @Nullable ClientSettings clientSettings, Map<Api<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, @Nullable Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Lock lock, Context context) {
        this.a = zaazVar;
        this.r = clientSettings;
        this.s = map;
        this.d = googleApiAvailabilityLight;
        this.t = abstractClientBuilder;
        this.b = lock;
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Scope> A() {
        if (this.r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.r.getRequiredScopes());
        Map<Api<?>, ClientSettings.zaa> mapZaa = this.r.zaa();
        for (Api<?> api : mapZaa.keySet()) {
            if (!this.a.g.containsKey(api.zac())) {
                hashSet.addAll(mapZaa.get(api).zaa);
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void e(zak zakVar) {
        if (l(0)) {
            ConnectionResult connectionResultZaa = zakVar.zaa();
            if (!connectionResultZaa.isSuccess()) {
                if (!g(connectionResultZaa)) {
                    j(connectionResultZaa);
                    return;
                } else {
                    w();
                    r();
                    return;
                }
            }
            zau zauVar = (zau) Preconditions.checkNotNull(zakVar.zab());
            ConnectionResult connectionResultZab = zauVar.zab();
            if (connectionResultZab.isSuccess()) {
                this.n = true;
                this.o = (IAccountAccessor) Preconditions.checkNotNull(zauVar.zaa());
                this.p = zauVar.zac();
                this.q = zauVar.zad();
                r();
                return;
            }
            String strValueOf = String.valueOf(connectionResultZab);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 48);
            sb.append("Sign-in succeeded with resolve account failure: ");
            sb.append(strValueOf);
            Log.wtf("GACConnecting", sb.toString(), new Exception());
            j(connectionResultZab);
        }
    }

    @GuardedBy("mLock")
    private final void f(boolean z) {
        com.google.android.gms.signin.zae zaeVar = this.k;
        if (zaeVar != null) {
            if (zaeVar.isConnected() && z) {
                zaeVar.zaa();
            }
            zaeVar.disconnect();
            this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean g(ConnectionResult connectionResult) {
        return this.l && !connectionResult.hasResolution();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void j(ConnectionResult connectionResult) {
        y();
        f(!connectionResult.hasResolution());
        this.a.b(connectionResult);
        this.a.o.zaa(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    @GuardedBy("mLock")
    public final void k(ConnectionResult connectionResult, Api<?> api, boolean z) {
        int priority = api.zaa().getPriority();
        boolean z2 = false;
        if (z) {
            if (connectionResult.hasResolution() || this.d.getErrorResolutionIntent(connectionResult.getErrorCode()) != null) {
                if (this.e != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
            }
        } else if (this.e != null || priority < this.f) {
            z2 = true;
        }
        if (z2) {
            this.e = connectionResult;
            this.f = priority;
        }
        this.a.g.put(api.zac(), connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean l(int i) {
        if (this.g == i) {
            return true;
        }
        Log.w("GACConnecting", this.a.n.j());
        String strValueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(strValueOf);
        Log.w("GACConnecting", sb.toString());
        int i2 = this.h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        Log.w("GACConnecting", sb2.toString());
        String strN = n(this.g);
        String strN2 = n(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(strN).length() + 70 + String.valueOf(strN2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(strN);
        sb3.append(" but received callback for step ");
        sb3.append(strN2);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        j(new ConnectionResult(8, null));
        return false;
    }

    private static String n(int i) {
        if (i != 0) {
            return i != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE";
        }
        return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean q() {
        int i = this.h - 1;
        this.h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.a.n.j());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            j(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.e;
        if (connectionResult == null) {
            return true;
        }
        this.a.m = this.f;
        j(connectionResult);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void r() {
        if (this.h != 0) {
            return;
        }
        if (!this.m || this.n) {
            ArrayList arrayList = new ArrayList();
            this.g = 1;
            this.h = this.a.f.size();
            for (Api.AnyClientKey<?> anyClientKey : this.a.f.keySet()) {
                if (!this.a.g.containsKey(anyClientKey)) {
                    arrayList.add(this.a.f.get(anyClientKey));
                } else if (q()) {
                    u();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.u.add(zaba.zaa().submit(new i(this, arrayList)));
        }
    }

    @GuardedBy("mLock")
    private final void u() {
        this.a.g();
        zaba.zaa().execute(new c(this));
        com.google.android.gms.signin.zae zaeVar = this.k;
        if (zaeVar != null) {
            if (this.p) {
                zaeVar.zaa((IAccountAccessor) Preconditions.checkNotNull(this.o), this.q);
            }
            f(false);
        }
        Iterator<Api.AnyClientKey<?>> it2 = this.a.g.keySet().iterator();
        while (it2.hasNext()) {
            ((Api.Client) Preconditions.checkNotNull(this.a.f.get(it2.next()))).disconnect();
        }
        this.a.o.zaa(this.i.isEmpty() ? null : this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void w() {
        this.m = false;
        this.a.n.p = Collections.emptySet();
        for (Api.AnyClientKey<?> anyClientKey : this.j) {
            if (!this.a.g.containsKey(anyClientKey)) {
                this.a.g.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    private final void y() {
        ArrayList<Future<?>> arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Future<?> future = arrayList.get(i);
            i++;
            future.cancel(true);
        }
        this.u.clear();
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    @GuardedBy("mLock")
    public final void zaa() {
        this.a.g.clear();
        this.m = false;
        c cVar = null;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap map = new HashMap();
        boolean z = false;
        for (Api<?> api : this.s.keySet()) {
            Api.Client client = (Api.Client) Preconditions.checkNotNull(this.a.f.get(api.zac()));
            z |= api.zaa().getPriority() == 1;
            boolean zBooleanValue = this.s.get(api).booleanValue();
            if (client.requiresSignIn()) {
                this.m = true;
                if (zBooleanValue) {
                    this.j.add(api.zac());
                } else {
                    this.l = false;
                }
            }
            map.put(client, new e(this, api, zBooleanValue));
        }
        if (z) {
            this.m = false;
        }
        if (this.m) {
            Preconditions.checkNotNull(this.r);
            Preconditions.checkNotNull(this.t);
            this.r.zaa(Integer.valueOf(System.identityHashCode(this.a.n)));
            j jVar = new j(this, cVar);
            Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.t;
            Context context = this.c;
            Looper looper = this.a.n.getLooper();
            ClientSettings clientSettings = this.r;
            this.k = (com.google.android.gms.signin.zae) abstractClientBuilder.buildClient(context, looper, clientSettings, clientSettings.zac(), (GoogleApiClient.ConnectionCallbacks) jVar, (GoogleApiClient.OnConnectionFailedListener) jVar);
        }
        this.h = this.a.f.size();
        this.u.add(zaba.zaa().submit(new d(this, map)));
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final void zac() {
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    @GuardedBy("mLock")
    public final boolean zab() {
        y();
        f(true);
        this.a.b(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    @GuardedBy("mLock")
    public final void zaa(@Nullable Bundle bundle) {
        if (l(1)) {
            if (bundle != null) {
                this.i.putAll(bundle);
            }
            if (q()) {
                u();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    @GuardedBy("mLock")
    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (l(1)) {
            k(connectionResult, api, z);
            if (q()) {
                u();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        this.a.n.h.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zaaw
    @GuardedBy("mLock")
    public final void zaa(int i) {
        j(new ConnectionResult(8, null));
    }
}
