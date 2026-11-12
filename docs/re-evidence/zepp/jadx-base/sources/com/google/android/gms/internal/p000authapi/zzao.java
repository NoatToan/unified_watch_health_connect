package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.zzl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzao extends GoogleApi<zzl> implements SignInClient {
    private static final Api.ClientKey<zzaw> k;
    private static final Api.AbstractClientBuilder<zzaw, zzl> l;
    private static final Api<zzl> m;

    static {
        Api.ClientKey<zzaw> clientKey = new Api.ClientKey<>();
        k = clientKey;
        f fVar = new f();
        l = fVar;
        m = new Api<>("Auth.Api.Identity.SignIn.API", fVar, clientKey);
    }

    public zzao(@NonNull Context context, @NonNull zzl zzlVar) {
        super(context, m, zzl.zzc.zzc(zzlVar).zzh(zzba.zzw()).zzk(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<BeginSignInResult> beginSignIn(@NonNull BeginSignInRequest beginSignInRequest) {
        final BeginSignInRequest beginSignInRequestBuild = BeginSignInRequest.zzc(beginSignInRequest).zzd(getApiOptions().zzh()).build();
        return doRead(TaskApiCall.builder().setFeatures(zzay.zzdc).run(new RemoteCall(this, beginSignInRequestBuild) { // from class: com.google.android.gms.internal.auth-api.e
            private final zzao a;
            private final BeginSignInRequest b;

            {
                this.a = this;
                this.b = beginSignInRequestBuild;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzao zzaoVar = this.a;
                BeginSignInRequest beginSignInRequest2 = this.b;
                ((zzai) ((zzaw) obj).getService()).zzc(new i(zzaoVar, (TaskCompletionSource) obj2), (BeginSignInRequest) Preconditions.checkNotNull(beginSignInRequest2));
            }
        }).setAutoResolveMissingFeatures(false).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final SignInCredential getSignInCredentialFromIntent(@Nullable Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new ApiException(Status.RESULT_CANCELED);
        }
        if (!status.isSuccess()) {
            throw new ApiException(status);
        }
        SignInCredential signInCredential = (SignInCredential) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "sign_in_credential", SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(Status.RESULT_INTERNAL_ERROR);
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<PendingIntent> getSignInIntent(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        final GetSignInIntentRequest getSignInIntentRequestBuild = GetSignInIntentRequest.zzc(getSignInIntentRequest).zzf(getApiOptions().zzh()).build();
        return doRead(TaskApiCall.builder().setFeatures(zzay.zzdh).run(new RemoteCall(this, getSignInIntentRequestBuild) { // from class: com.google.android.gms.internal.auth-api.g
            private final zzao a;
            private final GetSignInIntentRequest b;

            {
                this.a = this;
                this.b = getSignInIntentRequestBuild;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzao zzaoVar = this.a;
                GetSignInIntentRequest getSignInIntentRequest2 = this.b;
                ((zzai) ((zzaw) obj).getService()).zzc(new j(zzaoVar, (TaskCompletionSource) obj2), (GetSignInIntentRequest) Preconditions.checkNotNull(getSignInIntentRequest2));
            }
        }).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator<GoogleApiClient> it2 = GoogleApiClient.getAllClients().iterator();
        while (it2.hasNext()) {
            it2.next().maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
        return doRead(TaskApiCall.builder().setFeatures(zzay.zzdd).run(new RemoteCall(this) { // from class: com.google.android.gms.internal.auth-api.d
            private final zzao a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzao zzaoVar = this.a;
                ((zzai) ((zzaw) obj).getService()).zzc(new h(zzaoVar, (TaskCompletionSource) obj2), zzaoVar.getApiOptions().zzh());
            }
        }).setAutoResolveMissingFeatures(false).build());
    }

    public zzao(@NonNull Activity activity, @NonNull zzl zzlVar) {
        super(activity, m, zzl.zzc.zzc(zzlVar).zzh(zzba.zzw()).zzk(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
