package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class RegistrationMethods<A extends Api.AnyClient, L> {

    @RecentlyNonNull
    @KeepForSdk
    public final RegisterListenerMethod<A, L> register;

    @RecentlyNonNull
    public final UnregisterListenerMethod<A, L> zaa;

    @RecentlyNonNull
    public final Runnable zab;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, L> {
        private RemoteCall<A, TaskCompletionSource<Void>> a;
        private RemoteCall<A, TaskCompletionSource<Boolean>> b;
        private Runnable c;
        private ListenerHolder<L> d;
        private Feature[] e;
        private boolean f;
        private int g;

        private Builder() {
            this.c = i0.a;
            this.f = true;
        }

        public final /* synthetic */ void b(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
            this.a.accept(anyClient, taskCompletionSource);
        }

        @RecentlyNonNull
        @KeepForSdk
        public RegistrationMethods<A, L> build() {
            Preconditions.checkArgument(this.a != null, "Must set register function");
            Preconditions.checkArgument(this.b != null, "Must set unregister function");
            Preconditions.checkArgument(this.d != null, "Must set holder");
            return new RegistrationMethods<>(new j0(this, this.d, this.e, this.f, this.g), new m0(this, (ListenerHolder.ListenerKey) Preconditions.checkNotNull(this.d.getListenerKey(), "Key must not be null")), this.c);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, L> onConnectionSuspended(@RecentlyNonNull Runnable runnable) {
            this.c = runnable;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        @Deprecated
        public Builder<A, L> register(@RecentlyNonNull final BiConsumer<A, TaskCompletionSource<Void>> biConsumer) {
            this.a = new RemoteCall(biConsumer) { // from class: com.google.android.gms.common.api.internal.h0
                private final BiConsumer a;

                {
                    this.a = biConsumer;
                }

                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    this.a.accept((Api.AnyClient) obj, (TaskCompletionSource) obj2);
                }
            };
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, L> setAutoResolveMissingFeatures(boolean z) {
            this.f = z;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, L> setFeatures(@RecentlyNonNull Feature... featureArr) {
            this.e = featureArr;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, L> setMethodKey(int i) {
            this.g = i;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        @Deprecated
        public Builder<A, L> unregister(@RecentlyNonNull BiConsumer<A, TaskCompletionSource<Boolean>> biConsumer) {
            this.a = new RemoteCall(this) { // from class: com.google.android.gms.common.api.internal.l0
                private final RegistrationMethods.Builder a;

                {
                    this.a = this;
                }

                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) throws RemoteException {
                    this.a.b((Api.AnyClient) obj, (TaskCompletionSource) obj2);
                }
            };
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, L> withHolder(@RecentlyNonNull ListenerHolder<L> listenerHolder) {
            this.d = listenerHolder;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, L> register(@RecentlyNonNull RemoteCall<A, TaskCompletionSource<Void>> remoteCall) {
            this.a = remoteCall;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, L> unregister(@RecentlyNonNull RemoteCall<A, TaskCompletionSource<Boolean>> remoteCall) {
            this.b = remoteCall;
            return this;
        }
    }

    private RegistrationMethods(RegisterListenerMethod<A, L> registerListenerMethod, UnregisterListenerMethod<A, L> unregisterListenerMethod, Runnable runnable) {
        this.register = registerListenerMethod;
        this.zaa = unregisterListenerMethod;
        this.zab = runnable;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <A extends Api.AnyClient, L> Builder<A, L> builder() {
        return new Builder<>();
    }
}
