package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountPicker {

    public static class AccountChooserOptions {

        @Nullable
        private Account a;
        private boolean b;

        @Nullable
        private ArrayList<Account> c;

        @Nullable
        private ArrayList<String> d;
        private boolean e;

        @Nullable
        private String f;

        @Nullable
        private Bundle g;
        private boolean h;
        private int i;

        @Nullable
        private String j;
        private boolean k;

        @Nullable
        private zza l;

        @Nullable
        private String m;
        private boolean n;
        private boolean o;

        public static class Builder {

            @Nullable
            private Account a;

            @Nullable
            private ArrayList<Account> b;

            @Nullable
            private ArrayList<String> c;
            private boolean d = false;

            @Nullable
            private String e;

            @Nullable
            private Bundle f;

            @NonNull
            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                accountChooserOptions.d = this.c;
                accountChooserOptions.c = this.b;
                accountChooserOptions.e = this.d;
                accountChooserOptions.l = null;
                accountChooserOptions.j = null;
                accountChooserOptions.g = this.f;
                accountChooserOptions.a = this.a;
                accountChooserOptions.b = false;
                accountChooserOptions.h = false;
                accountChooserOptions.m = null;
                accountChooserOptions.i = 0;
                accountChooserOptions.f = this.e;
                accountChooserOptions.k = false;
                accountChooserOptions.n = false;
                accountChooserOptions.o = false;
                return accountChooserOptions;
            }

            @NonNull
            public Builder setAllowableAccounts(@Nullable List<Account> list) {
                this.b = list == null ? null : new ArrayList<>(list);
                return this;
            }

            @NonNull
            public Builder setAllowableAccountsTypes(@Nullable List<String> list) {
                this.c = list == null ? null : new ArrayList<>(list);
                return this;
            }

            @NonNull
            public Builder setAlwaysShowAccountPicker(boolean z) {
                this.d = z;
                return this;
            }

            @NonNull
            public Builder setOptionsForAddingAccount(@Nullable Bundle bundle) {
                this.f = bundle;
                return this;
            }

            @NonNull
            public Builder setSelectedAccount(@Nullable Account account) {
                this.a = account;
                return this;
            }

            @NonNull
            public Builder setTitleOverrideText(@Nullable String str) {
                this.e = str;
                return this;
            }
        }

        public static /* bridge */ /* synthetic */ boolean D(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.n;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean a(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.o;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean b(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.b;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean c(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.h;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean d(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.k;
            return false;
        }

        public static /* bridge */ /* synthetic */ int e(AccountChooserOptions accountChooserOptions) {
            int i = accountChooserOptions.i;
            return 0;
        }

        public static /* bridge */ /* synthetic */ zza h(AccountChooserOptions accountChooserOptions) {
            zza zzaVar = accountChooserOptions.l;
            return null;
        }

        public static /* bridge */ /* synthetic */ String i(AccountChooserOptions accountChooserOptions) {
            String str = accountChooserOptions.j;
            return null;
        }

        public static /* bridge */ /* synthetic */ String j(AccountChooserOptions accountChooserOptions) {
            String str = accountChooserOptions.m;
            return null;
        }
    }

    private AccountPicker() {
    }

    @NonNull
    @Deprecated
    public static Intent newChooseAccountIntent(@Nullable Account account, @Nullable ArrayList<Account> arrayList, @Nullable String[] strArr, boolean z, @Nullable String str, @Nullable String str2, @Nullable String[] strArr2, @Nullable Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @NonNull
    public static Intent newChooseAccountIntent(@NonNull AccountChooserOptions accountChooserOptions) {
        Intent intent = new Intent();
        AccountChooserOptions.d(accountChooserOptions);
        AccountChooserOptions.i(accountChooserOptions);
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        AccountChooserOptions.h(accountChooserOptions);
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        AccountChooserOptions.b(accountChooserOptions);
        Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2");
        AccountChooserOptions.d(accountChooserOptions);
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.c);
        if (accountChooserOptions.d != null) {
            intent.putExtra("allowableAccountTypes", (String[]) accountChooserOptions.d.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.g);
        intent.putExtra("selectedAccount", accountChooserOptions.a);
        AccountChooserOptions.b(accountChooserOptions);
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.e);
        intent.putExtra("descriptionTextOverride", accountChooserOptions.f);
        AccountChooserOptions.c(accountChooserOptions);
        intent.putExtra("setGmsCoreAccount", false);
        AccountChooserOptions.j(accountChooserOptions);
        intent.putExtra("realClientPackage", (String) null);
        AccountChooserOptions.e(accountChooserOptions);
        intent.putExtra("overrideTheme", 0);
        AccountChooserOptions.d(accountChooserOptions);
        intent.putExtra("overrideCustomTheme", 0);
        AccountChooserOptions.i(accountChooserOptions);
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        AccountChooserOptions.d(accountChooserOptions);
        AccountChooserOptions.h(accountChooserOptions);
        AccountChooserOptions.D(accountChooserOptions);
        AccountChooserOptions.a(accountChooserOptions);
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
