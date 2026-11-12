package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zau;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zace extends com.google.android.gms.signin.internal.zab implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> i = com.google.android.gms.signin.zab.zaa;
    private final Context b;
    private final Handler c;
    private final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> d;
    private Set<Scope> e;
    private ClientSettings f;
    private com.google.android.gms.signin.zae g;
    private zach h;

    @WorkerThread
    public zace(Context context, Handler handler, @NonNull ClientSettings clientSettings) {
        this(context, handler, clientSettings, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void c(zak zakVar) {
        ConnectionResult connectionResultZaa = zakVar.zaa();
        if (connectionResultZaa.isSuccess()) {
            zau zauVar = (zau) Preconditions.checkNotNull(zakVar.zab());
            ConnectionResult connectionResultZab = zauVar.zab();
            if (!connectionResultZab.isSuccess()) {
                String strValueOf = String.valueOf(connectionResultZab);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(strValueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.h.zaa(connectionResultZab);
                this.g.disconnect();
                return;
            }
            this.h.zaa(zauVar.zaa(), this.e);
        } else {
            this.h.zaa(connectionResultZaa);
        }
        this.g.disconnect();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnected(@Nullable Bundle bundle) {
        this.g.zaa(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.h.zaa(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnectionSuspended(int i2) {
        this.g.disconnect();
    }

    @WorkerThread
    public final void zaa(zach zachVar) {
        com.google.android.gms.signin.zae zaeVar = this.g;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
        this.f.zaa(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.d;
        Context context = this.b;
        Looper looper = this.c.getLooper();
        ClientSettings clientSettings = this.f;
        this.g = (com.google.android.gms.signin.zae) abstractClientBuilder.buildClient(context, looper, clientSettings, clientSettings.zac(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.h = zachVar;
        Set<Scope> set = this.e;
        if (set == null || set.isEmpty()) {
            this.c.post(new o0(this));
        } else {
            this.g.zab();
        }
    }

    @WorkerThread
    private zace(Context context, Handler handler, @NonNull ClientSettings clientSettings, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder) {
        this.b = context;
        this.c = handler;
        this.f = (ClientSettings) Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.e = clientSettings.getRequiredScopes();
        this.d = abstractClientBuilder;
    }

    public final void zaa() {
        com.google.android.gms.signin.zae zaeVar = this.g;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
    }

    @Override // com.google.android.gms.signin.internal.zab, com.google.android.gms.signin.internal.zae
    @BinderThread
    public final void zaa(zak zakVar) {
        this.c.post(new n0(this, zakVar));
    }
}
