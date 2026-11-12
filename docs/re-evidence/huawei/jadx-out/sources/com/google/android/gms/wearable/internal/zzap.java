package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.ChannelApi;

/* JADX INFO: loaded from: classes21.dex */
final /* synthetic */ class zzap implements PendingResultUtil.ResultConverter {
    static final PendingResultUtil.ResultConverter zzbx = new zzap();

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final Object convert(Result result) {
        return zzao.zza(((ChannelApi.OpenChannelResult) result).getChannel());
    }

    private zzap() {
    }
}
