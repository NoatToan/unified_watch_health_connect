package com.google.android.gms.internal.mlkit_common;

import a7.g;
import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
final class zzd extends zzk {
    @Override // com.google.android.gms.internal.mlkit_common.zzk
    public final int zza(Context context, zzj zzjVar, boolean z14) {
        return (zzjVar.zza.getAuthority().lastIndexOf(64) < 0 || g.a(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
