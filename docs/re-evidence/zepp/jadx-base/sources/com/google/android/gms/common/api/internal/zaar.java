package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.zak;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zaar extends GoogleApiClient implements zabn {
    private final Lock b;
    private final com.google.android.gms.common.internal.zah c;
    private final int e;
    private final Context f;
    private final Looper g;
    private volatile boolean i;
    private long j;
    private long k;
    private final p l;
    private final GoogleApiAvailability m;

    @Nullable
    @VisibleForTesting
    private zabk n;
    public final Map<Api.AnyClientKey<?>, Api.Client> o;
    public Set<Scope> p;
    private final ClientSettings q;
    private final Map<Api<?>, Boolean> r;
    private final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> s;
    private final ListenerHolders t;
    private final ArrayList<zaq> u;
    private Integer v;

    @Nullable
    public Set<zacn> w;
    public final zaco x;
    private final zak y;

    @Nullable
    private zabo d = null;

    @VisibleForTesting
    public final Queue<BaseImplementation.ApiMethodImpl<?, ?>> h = new LinkedList();

    public zaar(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i, int i2, ArrayList<zaq> arrayList) {
        this.j = ClientLibraryUtils.isPackageSide() ? 10000L : 120000L;
        this.k = 5000L;
        this.p = new HashSet();
        this.t = new ListenerHolders();
        this.v = null;
        this.w = null;
        m mVar = new m(this);
        this.y = mVar;
        this.f = context;
        this.b = lock;
        this.c = new com.google.android.gms.common.internal.zah(looper, mVar);
        this.g = looper;
        this.l = new p(this, looper);
        this.m = googleApiAvailability;
        this.e = i;
        if (i >= 0) {
            this.v = Integer.valueOf(i2);
        }
        this.r = map;
        this.o = map2;
        this.u = arrayList;
        this.x = new zaco();
        Iterator<GoogleApiClient.ConnectionCallbacks> it2 = list.iterator();
        while (it2.hasNext()) {
            this.c.zaa(it2.next());
        }
        Iterator<GoogleApiClient.OnConnectionFailedListener> it3 = list2.iterator();
        while (it3.hasNext()) {
            this.c.zaa(it3.next());
        }
        this.q = clientSettings;
        this.s = abstractClientBuilder;
    }

    private final void b(int i) {
        Integer num = this.v;
        if (num == null) {
            this.v = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String strF = f(i);
            String strF2 = f(this.v.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(strF).length() + 51 + String.valueOf(strF2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(strF);
            sb.append(". Mode was already set to ");
            sb.append(strF2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.d != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (Api.Client client : this.o.values()) {
            if (client.requiresSignIn()) {
                z = true;
            }
            if (client.providesSignIn()) {
                z2 = true;
            }
        }
        int iIntValue = this.v.intValue();
        if (iIntValue == 1) {
            if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (iIntValue == 2 && z) {
            this.d = c1.b(this.f, this, this.b, this.g, this.m, this.o, this.q, this.r, this.s, this.u);
            return;
        }
        this.d = new zaaz(this.f, this, this.b, this.g, this.m, this.o, this.q, this.r, this.s, this.u, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        Common.zaa.zaa(googleApiClient).setResultCallback(new q(this, statusPendingResult, z, googleApiClient));
    }

    private static String f(int i) {
        if (i == 1) {
            return "SIGN_IN_MODE_REQUIRED";
        }
        if (i != 2) {
            return i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
        }
        return "SIGN_IN_MODE_OPTIONAL";
    }

    @GuardedBy("mLock")
    private final void k() {
        this.c.zab();
        ((zabo) Preconditions.checkNotNull(this.d)).zaa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        this.b.lock();
        try {
            if (this.i) {
                k();
            }
        } finally {
            this.b.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        this.b.lock();
        try {
            if (h()) {
                k();
            }
        } finally {
            this.b.unlock();
        }
    }

    private final boolean n() {
        Lock lock;
        this.b.lock();
        try {
            Set<zacn> set = this.w;
            if (set == null) {
                return false;
            }
            return !set.isEmpty();
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect() {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.b.lock();
        try {
            if (this.e >= 0) {
                if (this.v == null) {
                    z = false;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.v;
                if (num == null) {
                    this.v = Integer.valueOf(zaa((Iterable<Api.Client>) this.o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            b(((Integer) Preconditions.checkNotNull(this.v)).intValue());
            this.c.zab();
            ConnectionResult connectionResultZab = ((zabo) Preconditions.checkNotNull(this.d)).zab();
            this.b.unlock();
            return connectionResultZab;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.v;
        Preconditions.checkState(num == null || num.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.o.containsKey(Common.CLIENT_KEY)) {
            c(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(this.f).addApi(Common.API).addConnectionCallbacks(new o(this, atomicReference, statusPendingResult)).addOnConnectionFailedListener(new n(this, statusPendingResult)).setHandler(this.l).build();
            atomicReference.set(googleApiClientBuild);
            googleApiClientBuild.connect();
        }
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.b.lock();
        try {
            if (this.e >= 0) {
                Preconditions.checkState(this.v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.v;
                if (num == null) {
                    this.v = Integer.valueOf(zaa((Iterable<Api.Client>) this.o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            connect(((Integer) Preconditions.checkNotNull(this.v)).intValue());
            this.b.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.b.lock();
        try {
            this.x.zaa();
            zabo zaboVar = this.d;
            if (zaboVar != null) {
                zaboVar.zac();
            }
            this.t.zaa();
            for (BaseImplementation.ApiMethodImpl<?, ?> apiMethodImpl : this.h) {
                apiMethodImpl.zaa((v0) null);
                apiMethodImpl.cancel();
            }
            this.h.clear();
            if (this.d == null) {
                return;
            }
            h();
            this.c.zaa();
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.i);
        printWriter.append(" mWorkQueue.size()=").print(this.h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.x.a.size());
        zabo zaboVar = this.d;
        if (zaboVar != null) {
            zaboVar.zaa(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        Api<?> api = t.getApi();
        boolean zContainsKey = this.o.containsKey(t.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(strZad);
        sb.append(" required for this call.");
        Preconditions.checkArgument(zContainsKey, sb.toString());
        this.b.lock();
        try {
            zabo zaboVar = this.d;
            if (zaboVar != null) {
                return (T) zaboVar.zaa(t);
            }
            this.h.add(t);
            return t;
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        Api<?> api = t.getApi();
        boolean zContainsKey = this.o.containsKey(t.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(strZad);
        sb.append(" required for this call.");
        Preconditions.checkArgument(zContainsKey, sb.toString());
        this.b.lock();
        try {
            zabo zaboVar = this.d;
            if (zaboVar == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (!this.i) {
                T t2 = (T) zaboVar.zab(t);
                this.b.unlock();
                return t2;
            }
            this.h.add(t);
            while (!this.h.isEmpty()) {
                BaseImplementation.ApiMethodImpl<?, ?> apiMethodImplRemove = this.h.remove();
                this.x.a(apiMethodImplRemove);
                apiMethodImplRemove.setFailedResult(Status.RESULT_INTERNAL_ERROR);
            }
            this.b.unlock();
            return t;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        C c = (C) this.o.get(anyClientKey);
        Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        this.b.lock();
        try {
            if (!isConnected() && !this.i) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.o.containsKey(api.zac())) {
                throw new IllegalArgumentException(String.valueOf(api.zad()).concat(" was never registered with GoogleApiClient"));
            }
            ConnectionResult connectionResultZaa = ((zabo) Preconditions.checkNotNull(this.d)).zaa(api);
            if (connectionResultZaa != null) {
                this.b.unlock();
                return connectionResultZaa;
            }
            if (this.i) {
                ConnectionResult connectionResult = ConnectionResult.RESULT_SUCCESS;
                this.b.unlock();
                return connectionResult;
            }
            Log.w("GoogleApiClientImpl", j());
            Log.wtf("GoogleApiClientImpl", String.valueOf(api.zad()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
            ConnectionResult connectionResult2 = new ConnectionResult(8, null);
            this.b.unlock();
            return connectionResult2;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.f;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.g;
    }

    @GuardedBy("mLock")
    public final boolean h() {
        if (!this.i) {
            return false;
        }
        this.i = false;
        this.l.removeMessages(2);
        this.l.removeMessages(1);
        zabk zabkVar = this.n;
        if (zabkVar != null) {
            zabkVar.zaa();
            this.n = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(@NonNull Api<?> api) {
        return this.o.containsKey(api.zac());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@NonNull Api<?> api) {
        Api.Client client;
        return isConnected() && (client = this.o.get(api.zac())) != null && client.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        zabo zaboVar = this.d;
        return zaboVar != null && zaboVar.zad();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        zabo zaboVar = this.d;
        return zaboVar != null && zaboVar.zae();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.c.zab(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.c.zab(onConnectionFailedListener);
    }

    public final String j() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zabo zaboVar = this.d;
        return zaboVar != null && zaboVar.zaa(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zabo zaboVar = this.d;
        if (zaboVar != null) {
            zaboVar.zag();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.c.zaa(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.c.zaa(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> registerListener(@NonNull L l) {
        this.b.lock();
        try {
            return this.t.zaa(l, this.g, "NO_TYPE");
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        if (this.e < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        zai.zaa(lifecycleActivity).zaa(this.e);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.c.zac(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.c.zac(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabn
    @GuardedBy("mLock")
    public final void zaa(@Nullable Bundle bundle) {
        while (!this.h.isEmpty()) {
            execute(this.h.remove());
        }
        this.c.zaa(bundle);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zab(zacn zacnVar) {
        zabo zaboVar;
        this.b.lock();
        try {
            Set<zacn> set = this.w;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!set.remove(zacnVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!n() && (zaboVar = this.d) != null) {
                zaboVar.zaf();
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabn
    @GuardedBy("mLock")
    public final void zaa(ConnectionResult connectionResult) {
        if (!this.m.isPlayServicesPossiblyUpdating(this.f, connectionResult.getErrorCode())) {
            h();
        }
        if (this.i) {
            return;
        }
        this.c.zaa(connectionResult);
        this.c.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.zabn
    @GuardedBy("mLock")
    public final void zaa(int i, boolean z) {
        if (i == 1 && !z && !this.i) {
            this.i = true;
            if (this.n == null && !ClientLibraryUtils.isPackageSide()) {
                try {
                    this.n = this.m.zaa(this.f.getApplicationContext(), new r(this));
                } catch (SecurityException unused) {
                }
            }
            p pVar = this.l;
            pVar.sendMessageDelayed(pVar.obtainMessage(1), this.j);
            p pVar2 = this.l;
            pVar2.sendMessageDelayed(pVar2.obtainMessage(2), this.k);
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.x.a.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zaco.zaa);
        }
        this.c.zaa(i);
        this.c.zaa();
        if (i == 2) {
            k();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i) {
        this.b.lock();
        boolean z = true;
        if (i != 3 && i != 1 && i != 2) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            Preconditions.checkArgument(z, sb.toString());
            b(i);
            k();
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.b.lock();
        try {
            Integer num = this.v;
            if (num == null) {
                this.v = Integer.valueOf(zaa((Iterable<Api.Client>) this.o.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            b(((Integer) Preconditions.checkNotNull(this.v)).intValue());
            this.c.zab();
            ConnectionResult connectionResultZaa = ((zabo) Preconditions.checkNotNull(this.d)).zaa(j, timeUnit);
            this.b.unlock();
            return connectionResultZaa;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zaa(zacn zacnVar) {
        this.b.lock();
        try {
            if (this.w == null) {
                this.w = new HashSet();
            }
            this.w.add(zacnVar);
        } finally {
            this.b.unlock();
        }
    }

    public static int zaa(Iterable<Api.Client> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (Api.Client client : iterable) {
            if (client.requiresSignIn()) {
                z2 = true;
            }
            if (client.providesSignIn()) {
                z3 = true;
            }
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }
}
