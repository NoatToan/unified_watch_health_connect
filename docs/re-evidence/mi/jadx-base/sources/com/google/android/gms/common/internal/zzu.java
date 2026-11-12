package com.google.android.gms.common.internal;

import android.net.Uri;
import com.xiaomi.fitness.device.manager.export.bean.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class zzu {
    private static final Uri zza;
    private static final Uri zzb;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        zza = uri;
        zzb = uri.buildUpon().appendPath("circles").appendPath(Feature.FIND).build();
    }
}
