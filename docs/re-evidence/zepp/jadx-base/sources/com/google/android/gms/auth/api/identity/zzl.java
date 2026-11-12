package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzl implements Api.ApiOptions.Optional {
    private final String a;

    public static class zzc {
        private String a;

        private zzc() {
        }

        public static zzc zzc(zzl zzlVar) {
            zzc zzcVar = new zzc();
            String strZzh = zzlVar.zzh();
            if (strZzh != null) {
                zzcVar.zzh(strZzh);
            }
            return zzcVar;
        }

        public final zzc zzh(@NonNull String str) {
            this.a = Preconditions.checkNotEmpty(str);
            return this;
        }

        public final zzl zzk() {
            return new zzl(this.a);
        }
    }

    public zzl(String str) {
        this.a = str;
    }

    public static zzc zzj() {
        return new zzc();
    }

    public final boolean equals(@Nullable Object obj) {
        return obj instanceof zzl;
    }

    public final int hashCode() {
        return Objects.hashCode(zzl.class);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.a);
        return bundle;
    }

    public final String zzh() {
        return this.a;
    }
}
