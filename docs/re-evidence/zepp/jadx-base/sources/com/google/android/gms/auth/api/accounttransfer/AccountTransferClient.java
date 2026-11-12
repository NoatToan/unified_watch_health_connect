package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzy;
import com.google.android.gms.internal.auth.zzz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public class AccountTransferClient extends GoogleApi<zzn> {
    private static final Api.ClientKey<com.google.android.gms.internal.auth.zzu> k;
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzu, zzn> l;
    private static final Api<zzn> m;

    public static class a<T> extends com.google.android.gms.internal.auth.zzs {
        private b<T> b;

        public a(b<T> bVar) {
            this.b = bVar;
        }

        @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
        public final void onFailure(Status status) {
            this.b.b(status);
        }
    }

    public static abstract class b<T> extends TaskApiCall<com.google.android.gms.internal.auth.zzu, T> {
        private TaskCompletionSource<T> d;

        private b() {
        }

        public final void a(T t) {
            this.d.setResult(t);
        }

        public final void b(Status status) {
            AccountTransferClient.d(this.d, status);
        }

        public abstract void c(zzz zzzVar) throws RemoteException;

        @Override // com.google.android.gms.common.api.internal.TaskApiCall
        public /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
            this.d = taskCompletionSource;
            c((zzz) ((com.google.android.gms.internal.auth.zzu) anyClient).getService());
        }

        public /* synthetic */ b(com.google.android.gms.auth.api.accounttransfer.b bVar) {
            this();
        }
    }

    static {
        Api.ClientKey<com.google.android.gms.internal.auth.zzu> clientKey = new Api.ClientKey<>();
        k = clientKey;
        com.google.android.gms.auth.api.accounttransfer.b bVar = new com.google.android.gms.auth.api.accounttransfer.b();
        l = bVar;
        m = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", bVar, clientKey);
    }

    public AccountTransferClient(@NonNull Context context) {
        super(context, m, (Api.ApiOptions) null, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(TaskCompletionSource taskCompletionSource, Status status) {
        taskCompletionSource.setException(new AccountTransferException(status));
    }

    public Task<DeviceMetaData> getDeviceMetaData(String str) {
        Preconditions.checkNotNull(str);
        return doRead(new f(this, new com.google.android.gms.internal.auth.zzv(str)));
    }

    public Task<Void> notifyCompletion(String str, int i) {
        Preconditions.checkNotNull(str);
        return doWrite(new i(this, new zzab(str, i)));
    }

    public Task<byte[]> retrieveData(String str) {
        Preconditions.checkNotNull(str);
        return doRead(new d(this, new zzad(str)));
    }

    public Task<Void> sendData(String str, byte[] bArr) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(bArr);
        return doWrite(new com.google.android.gms.auth.api.accounttransfer.c(this, new zzaf(str, bArr)));
    }

    public Task<Void> showUserChallenge(String str, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(pendingIntent);
        return doWrite(new h(this, new zzah(str, pendingIntent)));
    }

    public static abstract class c extends b<Void> {
        public zzy e;

        private c() {
            super(null);
            this.e = new j(this);
        }

        public /* synthetic */ c(com.google.android.gms.auth.api.accounttransfer.b bVar) {
            this();
        }
    }

    public AccountTransferClient(@NonNull Activity activity) {
        super(activity, (Api<Api.ApiOptions>) m, (Api.ApiOptions) null, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }
}
