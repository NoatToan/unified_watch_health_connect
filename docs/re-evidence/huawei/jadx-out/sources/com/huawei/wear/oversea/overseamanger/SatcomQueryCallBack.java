package com.huawei.wear.oversea.overseamanger;

import com.huawei.wear.oversea.satcomcard.SatcomCardSupportInfo;

/* JADX INFO: loaded from: classes20.dex */
public interface SatcomQueryCallBack {
    int onFail(SatcomCardSupportInfo satcomCardSupportInfo);

    int onSuccess(SatcomCardSupportInfo satcomCardSupportInfo);
}
