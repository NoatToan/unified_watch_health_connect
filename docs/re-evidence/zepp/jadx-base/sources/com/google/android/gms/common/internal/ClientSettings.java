package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
@KeepForSdk
public final class ClientSettings {

    @Nullable
    private final Account a;
    private final Set<Scope> b;
    private final Set<Scope> c;
    private final Map<Api<?>, zaa> d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final SignInOptions i;
    private final boolean j;
    private Integer k;

    @KeepForSdk
    public static final class Builder {

        @Nullable
        private Account a;
        private ArraySet<Scope> b;
        private String d;
        private String e;
        private int c = 0;
        private SignInOptions f = SignInOptions.zaa;

        @RecentlyNonNull
        @KeepForSdk
        public final ClientSettings build() {
            return new ClientSettings(this.a, this.b, null, 0, null, this.d, this.e, this.f, false);
        }

        @RecentlyNonNull
        @KeepForSdk
        public final Builder setRealClientPackageName(@RecentlyNonNull String str) {
            this.d = str;
            return this;
        }

        @RecentlyNonNull
        public final Builder zaa(@Nullable Account account) {
            this.a = account;
            return this;
        }

        @RecentlyNonNull
        public final Builder zaa(@RecentlyNonNull Collection<Scope> collection) {
            if (this.b == null) {
                this.b = new ArraySet<>();
            }
            this.b.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public final Builder zaa(@RecentlyNonNull String str) {
            this.e = str;
            return this;
        }
    }

    public static final class zaa {
        public final Set<Scope> zaa;

        public zaa(Set<Scope> set) {
            Preconditions.checkNotNull(set);
            this.zaa = Collections.unmodifiableSet(set);
        }
    }

    @KeepForSdk
    public ClientSettings(@RecentlyNonNull Account account, @RecentlyNonNull Set<Scope> set, @RecentlyNonNull Map<Api<?>, zaa> map, int i, @RecentlyNonNull View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull SignInOptions signInOptions) {
        this(account, set, map, i, view, str, str2, signInOptions, false);
    }

    @RecentlyNonNull
    @KeepForSdk
    public static ClientSettings createDefault(@RecentlyNonNull Context context) {
        return new GoogleApiClient.Builder(context).buildClientSettings();
    }

    @RecentlyNullable
    @KeepForSdk
    public final Account getAccount() {
        return this.a;
    }

    @RecentlyNullable
    @KeepForSdk
    @Deprecated
    public final String getAccountName() {
        Account account = this.a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @RecentlyNonNull
    @KeepForSdk
    public final Account getAccountOrDefault() {
        Account account = this.a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @RecentlyNonNull
    @KeepForSdk
    public final Set<Scope> getAllRequestedScopes() {
        return this.c;
    }

    @RecentlyNonNull
    @KeepForSdk
    public final Set<Scope> getApplicableScopes(@RecentlyNonNull Api<?> api) {
        zaa zaaVar = this.d.get(api);
        if (zaaVar == null || zaaVar.zaa.isEmpty()) {
            return this.b;
        }
        HashSet hashSet = new HashSet(this.b);
        hashSet.addAll(zaaVar.zaa);
        return hashSet;
    }

    @KeepForSdk
    public final int getGravityForPopups() {
        return this.e;
    }

    @RecentlyNullable
    @KeepForSdk
    public final String getRealClientPackageName() {
        return this.g;
    }

    @RecentlyNonNull
    @KeepForSdk
    public final Set<Scope> getRequiredScopes() {
        return this.b;
    }

    @RecentlyNullable
    @KeepForSdk
    public final View getViewForPopups() {
        return this.f;
    }

    @RecentlyNonNull
    public final Map<Api<?>, zaa> zaa() {
        return this.d;
    }

    @RecentlyNullable
    public final String zab() {
        return this.h;
    }

    @RecentlyNonNull
    public final SignInOptions zac() {
        return this.i;
    }

    @RecentlyNullable
    public final Integer zad() {
        return this.k;
    }

    public ClientSettings(@Nullable Account account, @RecentlyNonNull Set<Scope> set, @RecentlyNonNull Map<Api<?>, zaa> map, int i, @RecentlyNonNull View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull SignInOptions signInOptions, boolean z) {
        this.a = account;
        Set<Scope> setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.d = map;
        this.f = view;
        this.e = i;
        this.g = str;
        this.h = str2;
        this.i = signInOptions;
        this.j = false;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator<zaa> it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll(it2.next().zaa);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public final void zaa(@RecentlyNonNull Integer num) {
        this.k = num;
    }
}
