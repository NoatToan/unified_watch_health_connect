package com.google.android.gms.auth.api;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzf;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.p000authapi.zzj;
import com.google.android.gms.internal.p000authapi.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class Auth {
    public static final Api<AuthCredentialsOptions> CREDENTIALS_API;
    public static final CredentialsApi CredentialsApi;
    public static final Api<GoogleSignInOptions> GOOGLE_SIGN_IN_API;
    public static final GoogleSignInApi GoogleSignInApi;

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static final Api<AuthProxyOptions> PROXY_API;

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static final ProxyApi ProxyApi;
    private static final Api.AbstractClientBuilder<zzq, AuthCredentialsOptions> a;
    private static final Api.AbstractClientBuilder<zzf, GoogleSignInOptions> b;
    public static final Api.ClientKey<zzq> zzg;
    public static final Api.ClientKey<zzf> zzh;

    @Deprecated
    public static class AuthCredentialsOptions implements Api.ApiOptions.Optional {
        public static final AuthCredentialsOptions zzk = new Builder().zze();
        private final String a;
        private final boolean b;

        @Nullable
        private final String c;

        public AuthCredentialsOptions(Builder builder) {
            this.a = builder.zzl;
            this.b = builder.zzu.booleanValue();
            this.c = builder.zzn;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AuthCredentialsOptions)) {
                return false;
            }
            AuthCredentialsOptions authCredentialsOptions = (AuthCredentialsOptions) obj;
            return Objects.equal(this.a, authCredentialsOptions.a) && this.b == authCredentialsOptions.b && Objects.equal(this.c, authCredentialsOptions.c);
        }

        @Nullable
        public final String getLogSessionId() {
            return this.c;
        }

        public int hashCode() {
            return Objects.hashCode(this.a, Boolean.valueOf(this.b), this.c);
        }

        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.a);
            bundle.putBoolean("force_save_dialog", this.b);
            bundle.putString("log_session_id", this.c);
            return bundle;
        }

        @Nullable
        public final String zzd() {
            return this.a;
        }

        @Deprecated
        public static class Builder {
            public String zzl;

            @Nullable
            public String zzn;
            public Boolean zzu;

            public Builder() {
                this.zzu = Boolean.FALSE;
            }

            public Builder forceEnableSaveDialog() {
                this.zzu = Boolean.TRUE;
                return this;
            }

            @ShowFirstParty
            public Builder zzc(String str) {
                this.zzn = str;
                return this;
            }

            @ShowFirstParty
            public AuthCredentialsOptions zze() {
                return new AuthCredentialsOptions(this);
            }

            @ShowFirstParty
            public Builder(AuthCredentialsOptions authCredentialsOptions) {
                this.zzu = Boolean.FALSE;
                this.zzl = authCredentialsOptions.a;
                this.zzu = Boolean.valueOf(authCredentialsOptions.b);
                this.zzn = authCredentialsOptions.c;
            }
        }
    }

    static {
        Api.ClientKey<zzq> clientKey = new Api.ClientKey<>();
        zzg = clientKey;
        Api.ClientKey<zzf> clientKey2 = new Api.ClientKey<>();
        zzh = clientKey2;
        b bVar = new b();
        a = bVar;
        c cVar = new c();
        b = cVar;
        PROXY_API = AuthProxy.API;
        CREDENTIALS_API = new Api<>("Auth.CREDENTIALS_API", bVar, clientKey);
        GOOGLE_SIGN_IN_API = new Api<>("Auth.GOOGLE_SIGN_IN_API", cVar, clientKey2);
        ProxyApi = AuthProxy.ProxyApi;
        CredentialsApi = new zzj();
        GoogleSignInApi = new zzg();
    }

    private Auth() {
    }
}
