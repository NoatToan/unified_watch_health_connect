package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* JADX INFO: loaded from: classes3.dex */
final class b implements PendingResultUtil.ResultConverter<WorkAccountApi.AddAccountResult, Account> {
    public b(WorkAccountClient workAccountClient) {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Account convert(Result result) {
        return ((WorkAccountApi.AddAccountResult) result).getAccount();
    }
}
