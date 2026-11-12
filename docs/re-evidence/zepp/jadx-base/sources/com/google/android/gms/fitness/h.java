package com.google.android.gms.fitness;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.fitness.result.DailyTotalResult;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class h implements PendingResultUtil.ResultConverter {
    public static final PendingResultUtil.ResultConverter a = new h();

    private h() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final Object convert(Result result) {
        return HistoryClient.e((DailyTotalResult) result);
    }
}
