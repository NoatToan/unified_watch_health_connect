package com.huawei.health.vip.vipinfo;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes33.dex */
public class VipMessageReq implements IRequest {
    private static final String VIP_PATH = "/tradeservice/v1/member/messages/";

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("tradeService") + VIP_PATH;
    }
}
