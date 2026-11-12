package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ApiKey<O extends Api.ApiOptions> {
    private final boolean a = false;
    private final int b;
    private final Api<O> c;

    @Nullable
    private final O d;

    @Nullable
    private final String e;

    private ApiKey(Api<O> api, @Nullable O o, @Nullable String str) {
        this.c = api;
        this.d = o;
        this.e = str;
        this.b = Objects.hashCode(api, o, str);
    }

    @RecentlyNonNull
    public static <O extends Api.ApiOptions> ApiKey<O> zaa(@RecentlyNonNull Api<O> api, @Nullable O o, @Nullable String str) {
        return new ApiKey<>(api, o, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.equal(this.c, apiKey.c) && Objects.equal(this.d, apiKey.d) && Objects.equal(this.e, apiKey.e);
    }

    public final int hashCode() {
        return this.b;
    }

    @RecentlyNonNull
    public final String zaa() {
        return this.c.zad();
    }
}
