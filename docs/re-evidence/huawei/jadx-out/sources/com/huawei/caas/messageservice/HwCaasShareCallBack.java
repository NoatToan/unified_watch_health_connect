package com.huawei.caas.messageservice;

/* JADX INFO: loaded from: classes23.dex */
public interface HwCaasShareCallBack {
    void initFail(int i);

    void initSuccess(HwCaasShareHandler hwCaasShareHandler);

    void releaseSuccess();

    void sendResult(HwShareUtils.SendResultEnum sendResultEnum);
}
