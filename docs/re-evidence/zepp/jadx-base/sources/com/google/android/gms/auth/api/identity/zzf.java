package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public class zzf implements Api.ApiOptions.Optional {
    private final String a;

    public static class zzc {
        private String a;

        private zzc() {
        }

        public static zzc zzc(zzf zzfVar) {
            zzc zzcVar = new zzc();
            String strZzh = zzfVar.zzh();
            if (strZzh != null) {
                zzcVar.zze(strZzh);
            }
            return zzcVar;
        }

        public final zzc zze(@NonNull String str) {
            this.a = Preconditions.checkNotEmpty(str);
            return this;
        }

        public final zzf zzi() {
            return new zzf(this.a);
        }
    }

    public zzf(String str) {
        this.a = str;
    }

    public static zzc zzg() {
        return new zzc();
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof zzf;
    }

    public int hashCode() {
        return Objects.hashCode(zzf.class);
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
