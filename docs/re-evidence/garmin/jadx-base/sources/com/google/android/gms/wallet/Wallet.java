package com.google.android.gms.wallet;

import am.j;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.wallet.wobs.WalletObjects;
import java.util.Locale;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class Wallet {
    public static final Api<WalletOptions> API;
    private static final Api.ClientKey<com.google.android.gms.internal.wallet.zzv> CLIENT_KEY;
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.wallet.zzv, WalletOptions> zzeb;

    @Deprecated
    private static final zzz zzec;
    private static final WalletObjects zzed;

    @ShowFirstParty
    private static final com.google.android.gms.internal.wallet.zzh zzee;

    public static abstract class zza<R extends Result> extends BaseImplementation.ApiMethodImpl<R, com.google.android.gms.internal.wallet.zzv> {
        public zza(GoogleApiClient googleApiClient) {
            super(Wallet.API, googleApiClient);
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
        /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
        public abstract void doExecute(com.google.android.gms.internal.wallet.zzv zzvVar);
    }

    public static abstract class zzb extends zza<Status> {
        public zzb(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public /* synthetic */ Result createFailedResult(Status status) {
            return status;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.wallet.zzs, com.google.android.gms.wallet.zzz] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.wallet.zzab, com.google.android.gms.internal.wallet.zzh] */
    static {
        Api.ClientKey<com.google.android.gms.internal.wallet.zzv> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        zzaj zzajVar = new zzaj();
        zzeb = zzajVar;
        API = new Api<>("Wallet.API", zzajVar, clientKey);
        zzec = new com.google.android.gms.internal.wallet.zzs();
        zzed = new com.google.android.gms.internal.wallet.zzaa();
        zzee = new com.google.android.gms.internal.wallet.zzab();
    }

    private Wallet() {
    }

    public static PaymentsClient getPaymentsClient(Activity activity, WalletOptions walletOptions) {
        return new PaymentsClient(activity, walletOptions);
    }

    public static WalletObjectsClient getWalletObjectsClient(Activity activity, WalletOptions walletOptions) {
        return new WalletObjectsClient(activity, walletOptions);
    }

    public static PaymentsClient getPaymentsClient(Context context, WalletOptions walletOptions) {
        return new PaymentsClient(context, walletOptions);
    }

    public static final class WalletOptions implements Api.ApiOptions.HasAccountOptions {

        @ShowFirstParty
        private final Account account;
        public final int environment;
        public final int theme;
        final boolean zzef;

        public static final class Builder {
            private int environment = 3;
            private int theme = 1;
            private boolean zzef = true;

            public final WalletOptions build() {
                return new WalletOptions(this, null);
            }

            public final Builder setEnvironment(int i14) {
                if (i14 == 0 || i14 == 0 || i14 == 2 || i14 == 1 || i14 == 3) {
                    this.environment = i14;
                    return this;
                }
                Locale locale = Locale.US;
                h.s(j.h(i14, "Invalid environment value "));
                return null;
            }

            public final Builder setTheme(int i14) {
                if (i14 == 0 || i14 == 1 || i14 == 2 || i14 == 3) {
                    this.theme = i14;
                    return this;
                }
                Locale locale = Locale.US;
                h.s(j.h(i14, "Invalid theme value "));
                return null;
            }

            @Deprecated
            public final Builder useGoogleWallet() {
                this.zzef = false;
                return this;
            }
        }

        private WalletOptions(Builder builder) {
            this.environment = builder.environment;
            this.theme = builder.theme;
            this.zzef = builder.zzef;
            this.account = null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof WalletOptions) {
                WalletOptions walletOptions = (WalletOptions) obj;
                if (Objects.equal(Integer.valueOf(this.environment), Integer.valueOf(walletOptions.environment)) && Objects.equal(Integer.valueOf(this.theme), Integer.valueOf(walletOptions.theme)) && Objects.equal(null, null) && Objects.equal(Boolean.valueOf(this.zzef), Boolean.valueOf(walletOptions.zzef))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions
        public final Account getAccount() {
            return null;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.environment), Integer.valueOf(this.theme), null, Boolean.valueOf(this.zzef));
        }

        private WalletOptions() {
            this(new Builder());
        }

        public /* synthetic */ WalletOptions(Builder builder, zzaj zzajVar) {
            this(builder);
        }

        public /* synthetic */ WalletOptions(zzaj zzajVar) {
            this();
        }
    }
}
