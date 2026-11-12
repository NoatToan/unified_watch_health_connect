package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;

/* JADX INFO: loaded from: classes3.dex */
final class y extends LruCache<String, zzc> {
    public final /* synthetic */ zzfm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(zzfm zzfmVar, int i) {
        super(20);
        this.a = zzfmVar;
    }

    @Override // androidx.collection.LruCache
    public final /* bridge */ /* synthetic */ zzc create(String str) {
        String str2 = str;
        Preconditions.checkNotEmpty(str2);
        return zzfm.c(this.a, str2);
    }
}
