package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzgy {
    public final Context a;

    @Nullable
    public String b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public Boolean e;
    public long f;

    @Nullable
    public com.google.android.gms.internal.measurement.zzcl g;
    public boolean h;

    @Nullable
    public final Long i;

    @Nullable
    public String j;

    @VisibleForTesting
    public zzgy(Context context, @Nullable com.google.android.gms.internal.measurement.zzcl zzclVar, @Nullable Long l) {
        this.h = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (zzclVar != null) {
            this.g = zzclVar;
            this.b = zzclVar.zzf;
            this.c = zzclVar.zze;
            this.d = zzclVar.zzd;
            this.h = zzclVar.zzc;
            this.f = zzclVar.zzb;
            this.j = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
