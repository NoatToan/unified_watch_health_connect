package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class BaseImplementation {

    @KeepForSdk
    public interface ResultHolder<R> {
        @KeepForSdk
        void setFailedResult(@RecentlyNonNull Status status);

        @KeepForSdk
        void setResult(@RecentlyNonNull R r);
    }

    @KeepForSdk
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {

        @KeepForSdk
        private final Api.AnyClientKey<A> q;

        @Nullable
        @KeepForSdk
        private final Api<?> r;

        @KeepForSdk
        @Deprecated
        public ApiMethodImpl(@RecentlyNonNull Api.AnyClientKey<A> anyClientKey, @RecentlyNonNull GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            this.q = (Api.AnyClientKey) Preconditions.checkNotNull(anyClientKey);
            this.r = null;
        }

        @KeepForSdk
        private void f(@NonNull RemoteException remoteException) {
            setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        @KeepForSdk
        public abstract void doExecute(@RecentlyNonNull A a) throws RemoteException;

        @RecentlyNullable
        @KeepForSdk
        public final Api<?> getApi() {
            return this.r;
        }

        @RecentlyNonNull
        @KeepForSdk
        public final Api.AnyClientKey<A> getClientKey() {
            return this.q;
        }

        @KeepForSdk
        public void onSetFailedResult(@RecentlyNonNull R r) {
        }

        @KeepForSdk
        public final void run(@RecentlyNonNull A a) throws DeadObjectException {
            try {
                doExecute(a);
            } catch (DeadObjectException e) {
                f(e);
                throw e;
            } catch (RemoteException e2) {
                f(e2);
            }
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public final void setFailedResult(@RecentlyNonNull Status status) {
            Preconditions.checkArgument(!status.isSuccess(), "Failed result must not be success");
            R rCreateFailedResult = createFailedResult(status);
            setResult((Result) rCreateFailedResult);
            onSetFailedResult(rCreateFailedResult);
        }

        @KeepForSdk
        public /* bridge */ /* synthetic */ void setResult(@RecentlyNonNull Object obj) {
            super.setResult((Result) obj);
        }

        @KeepForSdk
        public ApiMethodImpl(@RecentlyNonNull Api<?> api, @RecentlyNonNull GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            Preconditions.checkNotNull(api, "Api must not be null");
            this.q = (Api.AnyClientKey<A>) api.zac();
            this.r = api;
        }

        @KeepForSdk
        @VisibleForTesting
        public ApiMethodImpl(@RecentlyNonNull BasePendingResult.CallbackHandler<R> callbackHandler) {
            super(callbackHandler);
            this.q = new Api.AnyClientKey<>();
            this.r = null;
        }
    }
}
