package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.service.zar;
import com.google.android.gms.common.internal.zaac;
import com.google.android.gms.common.internal.zao;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zas;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.xiaomi.market.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@KeepForSdk
public class GoogleApiManager implements Handler.Callback {

    @Nullable
    @GuardedBy("lock")
    private static GoogleApiManager t;

    @Nullable
    private com.google.android.gms.common.internal.zaaa e;

    @Nullable
    private zaac f;
    private final Context g;
    private final GoogleApiAvailability h;
    private final com.google.android.gms.common.internal.zaj i;

    @NotOnlyInitialized
    private final Handler p;
    private volatile boolean q;

    @RecentlyNonNull
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status r = new Status(4, "The user must be signed in to make this API call.");
    private static final Object s = new Object();
    private long a = 5000;
    private long b = 120000;
    private long c = 10000;
    private boolean d = false;
    private final AtomicInteger j = new AtomicInteger(1);
    private final AtomicInteger k = new AtomicInteger(0);
    private final Map<ApiKey<?>, zaa<?>> l = new ConcurrentHashMap(5, 0.75f, 1);

    @Nullable
    @GuardedBy("lock")
    private zay m = null;

    @GuardedBy("lock")
    private final Set<ApiKey<?>> n = new ArraySet();
    private final Set<ApiKey<?>> o = new ArraySet();

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.q = true;
        this.g = context;
        zas zasVar = new zas(looper, this);
        this.p = zasVar;
        this.h = googleApiAvailability;
        this.i = new com.google.android.gms.common.internal.zaj(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.q = false;
        }
        zasVar.sendMessage(zasVar.obtainMessage(6));
    }

    private final <T> void e(TaskCompletionSource<T> taskCompletionSource, int i, GoogleApi<?> googleApi) {
        d0 d0VarA;
        if (i == 0 || (d0VarA = d0.a(this, i, googleApi.getApiKey())) == null) {
            return;
        }
        Task<T> task = taskCompletionSource.getTask();
        Handler handler = this.p;
        handler.getClass();
        task.addOnCompleteListener(u.a(handler), d0VarA);
    }

    public static /* synthetic */ boolean g(GoogleApiManager googleApiManager, boolean z) {
        googleApiManager.d = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status i(ApiKey<?> apiKey, ConnectionResult connectionResult) {
        String strZaa = apiKey.zaa();
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(strZaa).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(strZaa);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(connectionResult, sb.toString());
    }

    @WorkerThread
    private final zaa<?> l(GoogleApi<?> googleApi) {
        Object apiKey = googleApi.getApiKey();
        zaa<?> zaaVar = this.l.get(apiKey);
        if (zaaVar == null) {
            zaaVar = new zaa<>(googleApi);
            this.l.put((ApiKey<?>) apiKey, zaaVar);
        }
        if (zaaVar.zak()) {
            this.o.add((ApiKey<?>) apiKey);
        }
        zaaVar.zai();
        return zaaVar;
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (s) {
            GoogleApiManager googleApiManager = t;
            if (googleApiManager != null) {
                googleApiManager.k.incrementAndGet();
                Handler handler = googleApiManager.p;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    @WorkerThread
    private final void t() {
        com.google.android.gms.common.internal.zaaa zaaaVar = this.e;
        if (zaaaVar != null) {
            if (zaaaVar.zaa() > 0 || n()) {
                u().zaa(zaaaVar);
            }
            this.e = null;
        }
    }

    @WorkerThread
    private final zaac u() {
        if (this.f == null) {
            this.f = new com.google.android.gms.common.internal.service.zaq(this.g);
        }
        return this.f;
    }

    @RecentlyNonNull
    public static GoogleApiManager zaa(@RecentlyNonNull Context context) {
        GoogleApiManager googleApiManager;
        synchronized (s) {
            if (t == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                t = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
            }
            googleApiManager = t;
        }
        return googleApiManager;
    }

    @Nullable
    public final zaa c(ApiKey<?> apiKey) {
        return this.l.get(apiKey);
    }

    public final void d(zao zaoVar, int i, long j, int i2) {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(18, new c0(zaoVar, i, j, i2)));
    }

    public final boolean f(ConnectionResult connectionResult, int i) {
        return this.h.zaa(this.g, connectionResult, i);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:66:0x0237  */
    /* JADX WARN: Code duplicated, block: B:67:0x0244  */
    @Override // android.os.Handler.Callback
    @WorkerThread
    public boolean handleMessage(@RecentlyNonNull Message message) {
        int i = message.what;
        zaa<?> zaaVar = null;
        switch (i) {
            case 1:
                this.c = ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.p.removeMessages(12);
                for (ApiKey<?> apiKey : this.l.keySet()) {
                    Handler handler = this.p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey), this.c);
                }
                return true;
            case 2:
                zaj zajVar = (zaj) message.obj;
                for (ApiKey<?> apiKey2 : zajVar.zaa()) {
                    zaa<?> zaaVar2 = this.l.get(apiKey2);
                    if (zaaVar2 == null) {
                        zajVar.zaa(apiKey2, new ConnectionResult(13), null);
                        return true;
                    }
                    if (zaaVar2.v()) {
                        zajVar.zaa(apiKey2, ConnectionResult.RESULT_SUCCESS, zaaVar2.zab().getEndpointPackageName());
                    } else {
                        ConnectionResult connectionResultZae = zaaVar2.zae();
                        if (connectionResultZae != null) {
                            zajVar.zaa(apiKey2, connectionResultZae, null);
                        } else {
                            zaaVar2.zaa(zajVar);
                            zaaVar2.zai();
                        }
                    }
                }
                return true;
            case 3:
                for (zaa<?> zaaVar3 : this.l.values()) {
                    zaaVar3.zad();
                    zaaVar3.zai();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zabu zabuVar = (zabu) message.obj;
                zaa<?> zaaVarL = this.l.get(zabuVar.zac.getApiKey());
                if (zaaVarL == null) {
                    zaaVarL = l(zabuVar.zac);
                }
                if (!zaaVarL.zak() || this.k.get() == zabuVar.zab) {
                    zaaVarL.zaa(zabuVar.zaa);
                } else {
                    zabuVar.zaa.zaa(zaa);
                    zaaVarL.zaa();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (zaa<?> zaaVar4 : this.l.values()) {
                    if (zaaVar4.zal() == i2) {
                        zaaVar = zaaVar4;
                        if (zaaVar != null) {
                            StringBuilder sb = new StringBuilder(76);
                            sb.append("Could not find API instance ");
                            sb.append(i2);
                            sb.append(" while trying to fail enqueued calls.");
                            Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                        } else if (connectionResult.getErrorCode() == 13) {
                            String errorString = this.h.getErrorString(connectionResult.getErrorCode());
                            String errorMessage = connectionResult.getErrorMessage();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length());
                            sb2.append("Error resolution was canceled by the user, original error message: ");
                            sb2.append(errorString);
                            sb2.append(": ");
                            sb2.append(errorMessage);
                            zaaVar.e(new Status(17, sb2.toString()));
                        } else {
                            zaaVar.e(i(((zaa) zaaVar).c, connectionResult));
                        }
                        return true;
                    }
                }
                if (zaaVar != null) {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i2);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                } else if (connectionResult.getErrorCode() == 13) {
                    String errorString2 = this.h.getErrorString(connectionResult.getErrorCode());
                    String errorMessage2 = connectionResult.getErrorMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(errorString2).length() + 69 + String.valueOf(errorMessage2).length());
                    sb4.append("Error resolution was canceled by the user, original error message: ");
                    sb4.append(errorString2);
                    sb4.append(": ");
                    sb4.append(errorMessage2);
                    zaaVar.e(new Status(17, sb4.toString()));
                } else {
                    zaaVar.e(i(((zaa) zaaVar).c, connectionResult));
                }
                return true;
            case 6:
                if (this.g.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.g.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new v(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.c = 300000L;
                    }
                }
                return true;
            case 7:
                l((GoogleApi) message.obj);
                return true;
            case 9:
                if (this.l.containsKey(message.obj)) {
                    this.l.get(message.obj).zaf();
                }
                return true;
            case 10:
                Iterator<ApiKey<?>> it2 = this.o.iterator();
                while (it2.hasNext()) {
                    zaa<?> zaaVarRemove = this.l.remove(it2.next());
                    if (zaaVarRemove != null) {
                        zaaVarRemove.zaa();
                    }
                }
                this.o.clear();
                return true;
            case 11:
                if (this.l.containsKey(message.obj)) {
                    this.l.get(message.obj).zag();
                }
                return true;
            case 12:
                if (this.l.containsKey(message.obj)) {
                    this.l.get(message.obj).zah();
                }
                return true;
            case 14:
                h1 h1Var = (h1) message.obj;
                ApiKey<?> apiKeyA = h1Var.a();
                if (this.l.containsKey(apiKeyA)) {
                    h1Var.b().setResult(Boolean.valueOf(zaa.k(this.l.get(apiKeyA), false)));
                } else {
                    h1Var.b().setResult(Boolean.FALSE);
                }
                return true;
            case 15:
                a aVar = (a) message.obj;
                if (this.l.containsKey(aVar.a)) {
                    this.l.get(aVar.a).j(aVar);
                }
                return true;
            case 16:
                a aVar2 = (a) message.obj;
                if (this.l.containsKey(aVar2.a)) {
                    this.l.get(aVar2.a).o(aVar2);
                }
                return true;
            case 17:
                t();
                return true;
            case 18:
                c0 c0Var = (c0) message.obj;
                if (c0Var.c == 0) {
                    u().zaa(new com.google.android.gms.common.internal.zaaa(c0Var.b, Arrays.asList(c0Var.a)));
                } else {
                    com.google.android.gms.common.internal.zaaa zaaaVar = this.e;
                    if (zaaaVar != null) {
                        List<zao> listZab = zaaaVar.zab();
                        if (this.e.zaa() != c0Var.b || (listZab != null && listZab.size() >= c0Var.d)) {
                            this.p.removeMessages(17);
                            t();
                        } else {
                            this.e.zaa(c0Var.a);
                        }
                    }
                    if (this.e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c0Var.a);
                        this.e = new com.google.android.gms.common.internal.zaaa(c0Var.b, arrayList);
                        Handler handler2 = this.p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c0Var.c);
                    }
                }
                return true;
            case 19:
                this.d = false;
                return true;
            default:
                StringBuilder sb5 = new StringBuilder(31);
                sb5.append("Unknown message id: ");
                sb5.append(i);
                Log.w("GoogleApiManager", sb5.toString());
                return false;
        }
    }

    public final void j(@NonNull zay zayVar) {
        synchronized (s) {
            if (this.m == zayVar) {
                this.m = null;
                this.n.clear();
            }
        }
    }

    @WorkerThread
    public final boolean n() {
        if (this.d) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int iZaa = this.i.zaa(this.g, 203390000);
        return iZaa == -1 || iZaa == 0;
    }

    public final int zab() {
        return this.j.getAndIncrement();
    }

    public final void zac() {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public class b implements zach, BaseGmsClient.ConnectionProgressReportCallbacks {
        private final Api.Client a;
        private final ApiKey<?> b;

        @Nullable
        private IAccountAccessor c = null;

        @Nullable
        private Set<Scope> d = null;
        private boolean e = false;

        public b(Api.Client client, ApiKey<?> apiKey) {
            this.a = client;
            this.b = apiKey;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @WorkerThread
        public final void b() {
            IAccountAccessor iAccountAccessor;
            if (!this.e || (iAccountAccessor = this.c) == null) {
                return;
            }
            this.a.getRemoteService(iAccountAccessor, this.d);
        }

        public static /* synthetic */ boolean c(b bVar, boolean z) {
            bVar.e = true;
            return true;
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
            GoogleApiManager.this.p.post(new b0(this, connectionResult));
        }

        @Override // com.google.android.gms.common.api.internal.zach
        @WorkerThread
        public final void zaa(ConnectionResult connectionResult) {
            zaa zaaVar = (zaa) GoogleApiManager.this.l.get(this.b);
            if (zaaVar != null) {
                zaaVar.zaa(connectionResult);
            }
        }

        @Override // com.google.android.gms.common.api.internal.zach
        @WorkerThread
        public final void zaa(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set) {
            if (iAccountAccessor != null && set != null) {
                this.c = iAccountAccessor;
                this.d = set;
                b();
            } else {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                zaa(new ConnectionResult(4));
            }
        }
    }

    @RecentlyNonNull
    public final Task<Boolean> zab(@RecentlyNonNull GoogleApi<?> googleApi) {
        h1 h1Var = new h1(googleApi.getApiKey());
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(14, h1Var));
        return h1Var.b().getTask();
    }

    public static class a {
        private final ApiKey<?> a;
        private final Feature b;

        private a(ApiKey<?> apiKey, Feature feature) {
            this.a = apiKey;
            this.b = feature;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                if (Objects.equal(this.a, aVar.a) && Objects.equal(this.b, aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.a, this.b);
        }

        public final String toString() {
            return Objects.toStringHelper(this).add("key", this.a).add(Constants.JSON_FEATURE, this.b).toString();
        }

        public /* synthetic */ a(ApiKey apiKey, Feature feature, v vVar) {
            this(apiKey, feature);
        }
    }

    public class zaa<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zap {

        @NotOnlyInitialized
        private final Api.Client b;
        private final ApiKey<O> c;
        private final zav d;
        private final int g;

        @Nullable
        private final zace h;
        private boolean i;
        private final Queue<zab> a = new LinkedList();
        private final Set<zaj> e = new HashSet();
        private final Map<ListenerHolder.ListenerKey<?>, zabv> f = new HashMap();
        private final List<a> j = new ArrayList();

        @Nullable
        private ConnectionResult k = null;
        private int l = 0;

        @WorkerThread
        public zaa(GoogleApi<O> googleApi) {
            Api.Client clientZaa = googleApi.zaa(GoogleApiManager.this.p.getLooper(), this);
            this.b = clientZaa;
            this.c = googleApi.getApiKey();
            this.d = new zav();
            this.g = googleApi.zaa();
            if (clientZaa.requiresSignIn()) {
                this.h = googleApi.zaa(GoogleApiManager.this.g, GoogleApiManager.this.p);
            } else {
                this.h = null;
            }
        }

        @WorkerThread
        private final void A() {
            if (this.i) {
                GoogleApiManager.this.p.removeMessages(11, this.c);
                GoogleApiManager.this.p.removeMessages(9, this.c);
                this.i = false;
            }
        }

        private final void B() {
            GoogleApiManager.this.p.removeMessages(12, this.c);
            GoogleApiManager.this.p.sendMessageDelayed(GoogleApiManager.this.p.obtainMessage(12, this.c), GoogleApiManager.this.c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        @WorkerThread
        private final Feature a(@Nullable Feature[] featureArr) {
            if (featureArr != null && featureArr.length != 0) {
                Feature[] availableFeatures = this.b.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new Feature[0];
                }
                ArrayMap arrayMap = new ArrayMap(availableFeatures.length);
                for (Feature feature : availableFeatures) {
                    arrayMap.put(feature.getName(), Long.valueOf(feature.getVersion()));
                }
                for (Feature feature2 : featureArr) {
                    Long l = (Long) arrayMap.get(feature2.getName());
                    if (l == null || l.longValue() < feature2.getVersion()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @WorkerThread
        public final void c(int i) {
            zad();
            this.i = true;
            this.d.b(i, this.b.getLastDisconnectMessage());
            GoogleApiManager.this.p.sendMessageDelayed(Message.obtain(GoogleApiManager.this.p, 9, this.c), GoogleApiManager.this.a);
            GoogleApiManager.this.p.sendMessageDelayed(Message.obtain(GoogleApiManager.this.p, 11, this.c), GoogleApiManager.this.b);
            GoogleApiManager.this.i.zaa();
            Iterator<zabv> it2 = this.f.values().iterator();
            while (it2.hasNext()) {
                it2.next().zac.run();
            }
        }

        @WorkerThread
        private final void d(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            zace zaceVar = this.h;
            if (zaceVar != null) {
                zaceVar.zaa();
            }
            zad();
            GoogleApiManager.this.i.zaa();
            s(connectionResult);
            if (this.b instanceof zar) {
                GoogleApiManager.g(GoogleApiManager.this, true);
                GoogleApiManager.this.p.sendMessageDelayed(GoogleApiManager.this.p.obtainMessage(19), 300000L);
            }
            if (connectionResult.getErrorCode() == 4) {
                e(GoogleApiManager.r);
                return;
            }
            if (this.a.isEmpty()) {
                this.k = connectionResult;
                return;
            }
            if (exc != null) {
                Preconditions.checkHandlerThread(GoogleApiManager.this.p);
                f(null, exc, false);
                return;
            }
            if (!GoogleApiManager.this.q) {
                e(u(connectionResult));
                return;
            }
            f(u(connectionResult), null, true);
            if (this.a.isEmpty() || p(connectionResult) || GoogleApiManager.this.f(connectionResult, this.g)) {
                return;
            }
            if (connectionResult.getErrorCode() == 18) {
                this.i = true;
            }
            if (this.i) {
                GoogleApiManager.this.p.sendMessageDelayed(Message.obtain(GoogleApiManager.this.p, 9, this.c), GoogleApiManager.this.a);
            } else {
                e(u(connectionResult));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @WorkerThread
        public final void e(Status status) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            f(status, null, false);
        }

        @WorkerThread
        private final void f(@Nullable Status status, @Nullable Exception exc, boolean z) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            if ((status == null) == (exc == null)) {
                throw new IllegalArgumentException("Status XOR exception should be null");
            }
            Iterator<zab> it2 = this.a.iterator();
            while (it2.hasNext()) {
                zab next = it2.next();
                if (!z || next.zaa == 2) {
                    if (status != null) {
                        next.zaa(status);
                    } else {
                        next.zaa(exc);
                    }
                    it2.remove();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @WorkerThread
        public final void j(a aVar) {
            if (this.j.contains(aVar) && !this.i) {
                if (this.b.isConnected()) {
                    z();
                } else {
                    zai();
                }
            }
        }

        public static /* synthetic */ boolean k(zaa zaaVar, boolean z) {
            return zaaVar.l(false);
        }

        @WorkerThread
        private final boolean l(boolean z) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            if (!this.b.isConnected() || this.f.size() != 0) {
                return false;
            }
            if (!this.d.f()) {
                this.b.disconnect("Timing out service connection.");
                return true;
            }
            if (z) {
                B();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @WorkerThread
        public final void o(a aVar) {
            Feature[] featureArrZac;
            if (this.j.remove(aVar)) {
                GoogleApiManager.this.p.removeMessages(15, aVar);
                GoogleApiManager.this.p.removeMessages(16, aVar);
                Feature feature = aVar.b;
                ArrayList arrayList = new ArrayList(this.a.size());
                for (zab zabVar : this.a) {
                    if ((zabVar instanceof zad) && (featureArrZac = ((zad) zabVar).zac(this)) != null && ArrayUtils.contains(featureArrZac, feature)) {
                        arrayList.add(zabVar);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zab zabVar2 = (zab) obj;
                    this.a.remove(zabVar2);
                    zabVar2.zaa(new UnsupportedApiCallException(feature));
                }
            }
        }

        @WorkerThread
        private final boolean p(@NonNull ConnectionResult connectionResult) {
            synchronized (GoogleApiManager.s) {
                if (GoogleApiManager.this.m == null || !GoogleApiManager.this.n.contains(this.c)) {
                    return false;
                }
                GoogleApiManager.this.m.zab(connectionResult, this.g);
                return true;
            }
        }

        @WorkerThread
        private final boolean q(zab zabVar) {
            if (!(zabVar instanceof zad)) {
                t(zabVar);
                return true;
            }
            zad zadVar = (zad) zabVar;
            Feature featureA = a(zadVar.zac(this));
            if (featureA == null) {
                t(zabVar);
                return true;
            }
            String name = this.b.getClass().getName();
            String name2 = featureA.getName();
            long version = featureA.getVersion();
            StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(name2).length());
            sb.append(name);
            sb.append(" could not execute call because it requires feature (");
            sb.append(name2);
            sb.append(", ");
            sb.append(version);
            sb.append(").");
            Log.w("GoogleApiManager", sb.toString());
            if (!GoogleApiManager.this.q || !zadVar.zad(this)) {
                zadVar.zaa(new UnsupportedApiCallException(featureA));
                return true;
            }
            a aVar = new a(this.c, featureA, null);
            int iIndexOf = this.j.indexOf(aVar);
            if (iIndexOf >= 0) {
                a aVar2 = this.j.get(iIndexOf);
                GoogleApiManager.this.p.removeMessages(15, aVar2);
                GoogleApiManager.this.p.sendMessageDelayed(Message.obtain(GoogleApiManager.this.p, 15, aVar2), GoogleApiManager.this.a);
                return false;
            }
            this.j.add(aVar);
            GoogleApiManager.this.p.sendMessageDelayed(Message.obtain(GoogleApiManager.this.p, 15, aVar), GoogleApiManager.this.a);
            GoogleApiManager.this.p.sendMessageDelayed(Message.obtain(GoogleApiManager.this.p, 16, aVar), GoogleApiManager.this.b);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (p(connectionResult)) {
                return false;
            }
            GoogleApiManager.this.f(connectionResult, this.g);
            return false;
        }

        @WorkerThread
        private final void s(ConnectionResult connectionResult) {
            for (zaj zajVar : this.e) {
                String endpointPackageName = null;
                if (Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                    endpointPackageName = this.b.getEndpointPackageName();
                }
                zajVar.zaa(this.c, connectionResult, endpointPackageName);
            }
            this.e.clear();
        }

        @WorkerThread
        private final void t(zab zabVar) {
            zabVar.zaa(this.d, zak());
            try {
                zabVar.zaa((zaa<?>) this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            } catch (Throwable th) {
                throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", this.b.getClass().getName()), th);
            }
        }

        private final Status u(ConnectionResult connectionResult) {
            return GoogleApiManager.i(this.c, connectionResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @WorkerThread
        public final void y() {
            zad();
            s(ConnectionResult.RESULT_SUCCESS);
            A();
            Iterator<zabv> it2 = this.f.values().iterator();
            while (it2.hasNext()) {
                zabv next = it2.next();
                if (a(next.zaa.getRequiredFeatures()) != null) {
                    it2.remove();
                } else {
                    try {
                        next.zaa.registerListener(this.b, new TaskCompletionSource<>());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(3);
                        this.b.disconnect("DeadObjectException thrown while calling register listener method.");
                    } catch (RemoteException unused2) {
                        it2.remove();
                    }
                }
            }
            z();
            B();
        }

        @WorkerThread
        private final void z() {
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                zab zabVar = (zab) obj;
                if (!this.b.isConnected()) {
                    return;
                }
                if (q(zabVar)) {
                    this.a.remove(zabVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public final void onConnected(@Nullable Bundle bundle) {
            if (Looper.myLooper() == GoogleApiManager.this.p.getLooper()) {
                y();
            } else {
                GoogleApiManager.this.p.post(new x(this));
            }
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        @WorkerThread
        public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            d(connectionResult, null);
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public final void onConnectionSuspended(int i) {
            if (Looper.myLooper() == GoogleApiManager.this.p.getLooper()) {
                c(i);
            } else {
                GoogleApiManager.this.p.post(new w(this, i));
            }
        }

        public final boolean v() {
            return this.b.isConnected();
        }

        @WorkerThread
        public final int w() {
            return this.l;
        }

        @WorkerThread
        public final void x() {
            this.l++;
        }

        @WorkerThread
        public final void zaa(@NonNull ConnectionResult connectionResult) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            Api.Client client = this.b;
            String name = client.getClass().getName();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(strValueOf);
            client.disconnect(sb.toString());
            onConnectionFailed(connectionResult);
        }

        public final Api.Client zab() {
            return this.b;
        }

        public final Map<ListenerHolder.ListenerKey<?>, zabv> zac() {
            return this.f;
        }

        @WorkerThread
        public final void zad() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            this.k = null;
        }

        @Nullable
        @WorkerThread
        public final ConnectionResult zae() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            return this.k;
        }

        @WorkerThread
        public final void zaf() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            if (this.i) {
                zai();
            }
        }

        @WorkerThread
        public final void zag() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            if (this.i) {
                A();
                e(GoogleApiManager.this.h.isGooglePlayServicesAvailable(GoogleApiManager.this.g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
                this.b.disconnect("Timing out connection while resuming.");
            }
        }

        @WorkerThread
        public final boolean zah() {
            return l(true);
        }

        @WorkerThread
        public final void zai() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            if (this.b.isConnected() || this.b.isConnecting()) {
                return;
            }
            try {
                int iZaa = GoogleApiManager.this.i.zaa(GoogleApiManager.this.g, this.b);
                if (iZaa == 0) {
                    b bVar = GoogleApiManager.this.new b(this.b, this.c);
                    if (this.b.requiresSignIn()) {
                        ((zace) Preconditions.checkNotNull(this.h)).zaa(bVar);
                    }
                    try {
                        this.b.connect(bVar);
                        return;
                    } catch (SecurityException e) {
                        d(new ConnectionResult(10), e);
                        return;
                    }
                }
                ConnectionResult connectionResult = new ConnectionResult(iZaa, null);
                String name = this.b.getClass().getName();
                String strValueOf = String.valueOf(connectionResult);
                StringBuilder sb = new StringBuilder(name.length() + 35 + strValueOf.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(strValueOf);
                Log.w("GoogleApiManager", sb.toString());
                onConnectionFailed(connectionResult);
            } catch (IllegalStateException e2) {
                d(new ConnectionResult(10), e2);
            }
        }

        public final boolean zak() {
            return this.b.requiresSignIn();
        }

        public final int zal() {
            return this.g;
        }

        @Override // com.google.android.gms.common.api.internal.zap
        public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
            if (Looper.myLooper() != GoogleApiManager.this.p.getLooper()) {
                GoogleApiManager.this.p.post(new z(this, connectionResult));
            } else {
                onConnectionFailed(connectionResult);
            }
        }

        @WorkerThread
        public final void zaa(zab zabVar) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            if (this.b.isConnected()) {
                if (q(zabVar)) {
                    B();
                    return;
                } else {
                    this.a.add(zabVar);
                    return;
                }
            }
            this.a.add(zabVar);
            ConnectionResult connectionResult = this.k;
            if (connectionResult != null && connectionResult.hasResolution()) {
                onConnectionFailed(this.k);
            } else {
                zai();
            }
        }

        @WorkerThread
        public final void zaa() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            e(GoogleApiManager.zaa);
            this.d.zab();
            for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
                zaa(new zag(listenerKey, new TaskCompletionSource()));
            }
            s(new ConnectionResult(4));
            if (this.b.isConnected()) {
                this.b.onUserSignOut(new y(this));
            }
        }

        @WorkerThread
        public final void zaa(zaj zajVar) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.p);
            this.e.add(zajVar);
        }
    }

    public final void zab(@RecentlyNonNull ConnectionResult connectionResult, int i) {
        if (f(connectionResult, i)) {
            return;
        }
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    @RecentlyNonNull
    public static GoogleApiManager zaa() {
        GoogleApiManager googleApiManager;
        synchronized (s) {
            Preconditions.checkNotNull(t, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = t;
        }
        return googleApiManager;
    }

    public final void zaa(@RecentlyNonNull GoogleApi<?> googleApi) {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final void zaa(@NonNull zay zayVar) {
        synchronized (s) {
            if (this.m != zayVar) {
                this.m = zayVar;
                this.n.clear();
            }
            this.n.addAll(zayVar.b());
        }
    }

    @RecentlyNonNull
    public final Task<Map<ApiKey<?>, String>> zaa(@RecentlyNonNull Iterable<? extends HasApiKey<?>> iterable) {
        zaj zajVar = new zaj(iterable);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(2, zajVar));
        return zajVar.zab();
    }

    public final <O extends Api.ApiOptions> void zaa(@RecentlyNonNull GoogleApi<O> googleApi, int i, @RecentlyNonNull BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zaf zafVar = new zaf(i, apiMethodImpl);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(4, new zabu(zafVar, this.k.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void zaa(@RecentlyNonNull GoogleApi<O> googleApi, int i, @RecentlyNonNull TaskApiCall<Api.AnyClient, ResultT> taskApiCall, @RecentlyNonNull TaskCompletionSource<ResultT> taskCompletionSource, @RecentlyNonNull StatusExceptionMapper statusExceptionMapper) {
        e(taskCompletionSource, taskApiCall.zab(), googleApi);
        zah zahVar = new zah(i, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(4, new zabu(zahVar, this.k.get(), googleApi)));
    }

    @RecentlyNonNull
    public final <O extends Api.ApiOptions> Task<Void> zaa(@RecentlyNonNull GoogleApi<O> googleApi, @RecentlyNonNull RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @RecentlyNonNull UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @RecentlyNonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        e(taskCompletionSource, registerListenerMethod.zab(), googleApi);
        zae zaeVar = new zae(new zabv(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(8, new zabu(zaeVar, this.k.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    @RecentlyNonNull
    public final <O extends Api.ApiOptions> Task<Boolean> zaa(@RecentlyNonNull GoogleApi<O> googleApi, @RecentlyNonNull ListenerHolder.ListenerKey<?> listenerKey, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        e(taskCompletionSource, i, googleApi);
        zag zagVar = new zag(listenerKey, taskCompletionSource);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(13, new zabu(zagVar, this.k.get(), googleApi)));
        return taskCompletionSource.getTask();
    }
}
