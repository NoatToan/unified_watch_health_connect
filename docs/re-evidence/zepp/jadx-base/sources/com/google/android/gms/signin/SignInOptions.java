package com.google.android.gms.signin;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {

    @RecentlyNonNull
    public static final SignInOptions zaa;
    private final boolean a = false;
    private final boolean b = false;

    @Nullable
    private final String c = null;
    private final boolean d = false;
    private final boolean g = false;

    @Nullable
    private final String e = null;

    @Nullable
    private final String f = null;

    @Nullable
    private final Long h = null;

    @Nullable
    private final Long i = null;

    public static final class zaa {
    }

    static {
        new zaa();
        zaa = new SignInOptions(false, false, null, false, null, null, false, null, null);
    }

    private SignInOptions(boolean z, boolean z2, @Nullable String str, boolean z3, @Nullable String str2, @Nullable String str3, boolean z4, @Nullable Long l, @Nullable Long l2) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInOptions)) {
            return false;
        }
        return Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hashCode(bool, bool, null, bool, bool, null, null, null, null);
    }
}
