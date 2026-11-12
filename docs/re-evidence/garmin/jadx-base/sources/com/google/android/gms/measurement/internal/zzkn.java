package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzkn implements zzpo {
    final /* synthetic */ zzlj zza;

    public zzkn(zzlj zzljVar) {
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzpo
    public final void zza(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzlj zzljVar = this.zza;
        if (zIsEmpty) {
            zzljVar.zzB(TtmlNode.TEXT_EMPHASIS_AUTO, "_err", bundle);
        } else {
            zzljVar.zzI(TtmlNode.TEXT_EMPHASIS_AUTO, "_err", bundle, str);
        }
    }
}
