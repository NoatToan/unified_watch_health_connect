package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zaar;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.api.internal.zaq;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zab;
import com.google.android.gms.signin.zae;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@Deprecated
public abstract class GoogleApiClient {

    @RecentlyNonNull
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;

    @GuardedBy("sAllClients")
    private static final Set<GoogleApiClient> a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public static void dumpAll(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr) {
        Set<GoogleApiClient> set = a;
        synchronized (set) {
            int i = 0;
            String strConcat = String.valueOf(str).concat("  ");
            for (GoogleApiClient googleApiClient : set) {
                printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i);
                googleApiClient.dump(strConcat, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    @RecentlyNonNull
    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set = a;
        synchronized (set) {
        }
        return set;
    }

    @RecentlyNonNull
    public abstract ConnectionResult blockingConnect();

    @RecentlyNonNull
    public abstract ConnectionResult blockingConnect(long j, @RecentlyNonNull TimeUnit timeUnit);

    @RecentlyNonNull
    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr);

    @RecentlyNonNull
    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@RecentlyNonNull T t) {
        throw new UnsupportedOperationException();
    }

    @RecentlyNonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@RecentlyNonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public <C extends Api.Client> C getClient(@RecentlyNonNull Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract ConnectionResult getConnectionResult(@RecentlyNonNull Api<?> api);

    @RecentlyNonNull
    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @RecentlyNonNull
    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(@RecentlyNonNull Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(@RecentlyNonNull Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@RecentlyNonNull ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(@RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean maybeSignIn(@RecentlyNonNull SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@RecentlyNonNull ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(@RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener);

    @RecentlyNonNull
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@RecentlyNonNull L l) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(@RecentlyNonNull FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(@RecentlyNonNull ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(@RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener);

    public void zaa(zacn zacnVar) {
        throw new UnsupportedOperationException();
    }

    public void zab(zacn zacnVar) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    @Deprecated
    public static final class Builder {

        @Nullable
        private Account a;
        private final Set<Scope> b;
        private final Set<Scope> c;
        private int d;
        private View e;
        private String f;
        private String g;
        private final Map<Api<?>, ClientSettings.zaa> h;
        private boolean i;
        private final Context j;
        private final Map<Api<?>, Api.ApiOptions> k;
        private LifecycleActivity l;
        private int m;

        @Nullable
        private OnConnectionFailedListener n;
        private Looper o;
        private GoogleApiAvailability p;
        private Api.AbstractClientBuilder<? extends zae, SignInOptions> q;
        private final ArrayList<ConnectionCallbacks> r;
        private final ArrayList<OnConnectionFailedListener> s;

        @KeepForSdk
        public Builder(@RecentlyNonNull Context context) {
            this.b = new HashSet();
            this.c = new HashSet();
            this.h = new ArrayMap();
            this.i = false;
            this.k = new ArrayMap();
            this.m = -1;
            this.p = GoogleApiAvailability.getInstance();
            this.q = zab.zaa;
            this.r = new ArrayList<>();
            this.s = new ArrayList<>();
            this.j = context;
            this.o = context.getMainLooper();
            this.f = context.getPackageName();
            this.g = context.getClass().getName();
        }

        private final <O extends Api.ApiOptions> void a(Api<O> api, @Nullable O o, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zaa(), "Base client builder must not be null")).getImpliedScopes(o));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.h.put(api, new ClientSettings.zaa(hashSet));
        }

        @RecentlyNonNull
        public final Builder addApi(@RecentlyNonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.k.put(api, null);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zaa(), "Base client builder must not be null")).getImpliedScopes(null);
            this.c.addAll(impliedScopes);
            this.b.addAll(impliedScopes);
            return this;
        }

        @RecentlyNonNull
        public final <T extends Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(@RecentlyNonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api, @RecentlyNonNull Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.k.put(api, null);
            a(api, null, scopeArr);
            return this;
        }

        @RecentlyNonNull
        public final Builder addConnectionCallbacks(@RecentlyNonNull ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.r.add(connectionCallbacks);
            return this;
        }

        @RecentlyNonNull
        public final Builder addOnConnectionFailedListener(@RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.s.add(onConnectionFailedListener);
            return this;
        }

        @RecentlyNonNull
        public final Builder addScope(@RecentlyNonNull Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.b.add(scope);
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public final Builder addScopeNames(@RecentlyNonNull String[] strArr) {
            for (String str : strArr) {
                this.b.add(new Scope(str));
            }
            return this;
        }

        @RecentlyNonNull
        public final GoogleApiClient build() {
            Preconditions.checkArgument(!this.k.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings clientSettingsBuildClientSettings = buildClientSettings();
            Api<?> api = null;
            Map<Api<?>, ClientSettings.zaa> mapZaa = clientSettingsBuildClientSettings.zaa();
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (Api<?> api2 : this.k.keySet()) {
                Api.ApiOptions apiOptions = this.k.get(api2);
                boolean z2 = mapZaa.get(api2) != null;
                arrayMap.put(api2, Boolean.valueOf(z2));
                zaq zaqVar = new zaq(api2, z2);
                arrayList.add(zaqVar);
                Api.AbstractClientBuilder abstractClientBuilder = (Api.AbstractClientBuilder) Preconditions.checkNotNull(api2.zab());
                Api.Client clientBuildClient = abstractClientBuilder.buildClient(this.j, this.o, clientSettingsBuildClientSettings, apiOptions, (ConnectionCallbacks) zaqVar, (OnConnectionFailedListener) zaqVar);
                arrayMap2.put(api2.zac(), clientBuildClient);
                if (abstractClientBuilder.getPriority() == 1) {
                    z = apiOptions != null;
                }
                if (clientBuildClient.providesSignIn()) {
                    if (api != null) {
                        String strZad = api2.zad();
                        String strZad2 = api.zad();
                        StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 21 + String.valueOf(strZad2).length());
                        sb.append(strZad);
                        sb.append(" cannot be used with ");
                        sb.append(strZad2);
                        throw new IllegalStateException(sb.toString());
                    }
                    api = api2;
                }
            }
            if (api != null) {
                if (z) {
                    String strZad3 = api.zad();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZad3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(strZad3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
                Preconditions.checkState(this.a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.zad());
                Preconditions.checkState(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.zad());
            }
            zaar zaarVar = new zaar(this.j, new ReentrantLock(), this.o, clientSettingsBuildClientSettings, this.p, this.q, arrayMap, this.r, this.s, arrayMap2, this.m, zaar.zaa((Iterable<Api.Client>) arrayMap2.values(), true), arrayList);
            synchronized (GoogleApiClient.a) {
                GoogleApiClient.a.add(zaarVar);
            }
            if (this.m >= 0) {
                zai.zaa(this.l).zaa(this.m, zaarVar, this.n);
            }
            return zaarVar;
        }

        @RecentlyNonNull
        @VisibleForTesting
        @KeepForSdk
        public final ClientSettings buildClientSettings() {
            SignInOptions signInOptions = SignInOptions.zaa;
            Map<Api<?>, Api.ApiOptions> map = this.k;
            Api<SignInOptions> api = zab.zab;
            if (map.containsKey(api)) {
                signInOptions = (SignInOptions) this.k.get(api);
            }
            return new ClientSettings(this.a, this.b, this.h, this.d, this.e, this.f, this.g, signInOptions, false);
        }

        @RecentlyNonNull
        public final Builder enableAutoManage(@RecentlyNonNull FragmentActivity fragmentActivity, int i, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
            Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.m = i;
            this.n = onConnectionFailedListener;
            this.l = lifecycleActivity;
            return this;
        }

        @RecentlyNonNull
        public final Builder setAccountName(@RecentlyNonNull String str) {
            this.a = str == null ? null : new Account(str, "com.google");
            return this;
        }

        @RecentlyNonNull
        public final Builder setGravityForPopups(int i) {
            this.d = i;
            return this;
        }

        @RecentlyNonNull
        public final Builder setHandler(@RecentlyNonNull Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.o = handler.getLooper();
            return this;
        }

        @RecentlyNonNull
        public final Builder setViewForPopups(@RecentlyNonNull View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.e = view;
            return this;
        }

        @RecentlyNonNull
        public final Builder useDefaultAccount() {
            return setAccountName("<<default account>>");
        }

        @RecentlyNonNull
        public final <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@RecentlyNonNull Api<O> api, @RecentlyNonNull O o, @RecentlyNonNull Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.k.put(api, o);
            a(api, o, scopeArr);
            return this;
        }

        @RecentlyNonNull
        public final Builder enableAutoManage(@RecentlyNonNull FragmentActivity fragmentActivity, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            return enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
        }

        @RecentlyNonNull
        public final <O extends Api.ApiOptions.HasOptions> Builder addApi(@RecentlyNonNull Api<O> api, @RecentlyNonNull O o) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.k.put(api, o);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zaa(), "Base client builder must not be null")).getImpliedScopes(o);
            this.c.addAll(impliedScopes);
            this.b.addAll(impliedScopes);
            return this;
        }

        @KeepForSdk
        public Builder(@RecentlyNonNull Context context, @RecentlyNonNull ConnectionCallbacks connectionCallbacks, @RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.r.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.s.add(onConnectionFailedListener);
        }
    }
}
