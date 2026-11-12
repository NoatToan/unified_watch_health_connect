package com.huawei.health.vip.vipinfo;

import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes33.dex */
public class VipInfoReq {
    private static final String MEMBER_TYPE_PATH = "&memberType=1";
    private static final String RESOURCE_TYPE_PATH = "?resourceType=4";
    private static final String TRADE_SERVICE_PATH = "/tradeservice/v1";
    private static final String TRANSFER_BENEFITS_PATH = "/transfer-benefits";
    private static final String VIP_PATH = "/tradeservice/v1/member";
    private static final String VIP_RECEIVED_SHARED_LIST_PATH = "/tradeservice/v1/member/share/sharedUser/authorizations";
    private static final String VIP_TYPE_PATH = "/tradeservice/v1/member/types";
    private static final String VIP_USER_INFO_PATH = "/tradeservice/v1/member/userInfos";
    private static final String VIRTUAL_RESOURCE_SUMMARY_PATH = "/tradeservice/v1/virtualresource-product/summaryInfo?resId=0&resType=9";

    public String getVipUserInfoUrl() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("tradeService") + VIP_USER_INFO_PATH;
    }

    public String getVipTypeUrl() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("tradeService") + VIP_TYPE_PATH;
    }

    public String getVirtualResourceSummaryUrl() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("tradeService") + VIRTUAL_RESOURCE_SUMMARY_PATH;
    }

    public String getVipSharedInvitationListUrl() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("tradeService") + VIP_RECEIVED_SHARED_LIST_PATH;
    }

    public String getVipTransferBenefitsUrl() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("tradeService") + "/tradeservice/v1/transfer-benefits?resourceType=4&memberType=1";
    }
}
