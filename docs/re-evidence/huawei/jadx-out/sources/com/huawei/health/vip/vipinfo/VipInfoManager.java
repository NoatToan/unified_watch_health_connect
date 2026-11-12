package com.huawei.health.vip.vipinfo;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.tradeservice.cloud.TradeServiceCloudFactory;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import defpackage.fod;
import defpackage.fxl;
import defpackage.irv;
import defpackage.irz;
import defpackage.isd;
import defpackage.isf;
import defpackage.lmf;
import defpackage.lua;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import defpackage.peh;
import defpackage.pjn;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class VipInfoManager {
    private static final String CLIENT_TYPE = "clientType";
    private static final String COUNTRY = "country";
    private static final String LANGUAGE = "language";
    private static final String LIMIT = "limit";
    private static final String OFF_TIME = "cutOffTime";
    private static final String OP_KEY_RESULT_CODE = "resultCode";
    private static final String SUBTYPE = "subType";
    private static final String TAG = "VipInfoManager";
    private static final String TAG_RELEASE = "R_VipInfoManager";
    private static final String TERRITORY = "territory";
    private static volatile VipInfoManager sInstance;
    private VipInfoApi mVipInfoApi = (VipInfoApi) oet.d().e(VipInfoApi.class);
    private ParamsFactory mParamsFactory = new TradeServiceCloudFactory(BaseApplication.getContext());
    private String mCountryCode = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);

    private VipInfoManager() {
    }

    public static VipInfoManager getInstance() {
        if (sInstance == null) {
            synchronized (VipInfoManager.class) {
                if (sInstance == null) {
                    sInstance = new VipInfoManager();
                }
            }
        }
        return sInstance;
    }

    public void getVipInfo(final IBaseResponseCallback iBaseResponseCallback) {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            getVipInfoFromSp(iBaseResponseCallback);
        } else {
            if (isVipNotEnabled(iBaseResponseCallback)) {
                return;
            }
            ThreadPoolManager.c().submit(new Callable() { // from class: com.huawei.health.vip.vipinfo.VipInfoManager$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.m1247lambda$getVipInfo$0$comhuaweihealthvipvipinfoVipInfoManager(iBaseResponseCallback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$getVipInfo$0$com-huawei-health-vip-vipinfo-VipInfoManager, reason: not valid java name */
    /* synthetic */ Void m1247lambda$getVipInfo$0$comhuaweihealthvipvipinfoVipInfoManager(IBaseResponseCallback iBaseResponseCallback) throws Exception {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        VipInfoRsp vipMemberInfo = getVipMemberInfo();
        if (vipMemberInfo == null) {
            LogUtil.j(TAG, "vipInfoRsp is null ");
            linkedHashMap.put("resultCode", String.valueOf(-1));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_VIP_INFO_80070002.value(), linkedHashMap);
            getVipInfoFromSp(iBaseResponseCallback);
            return null;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "vipInfoRsp.getResultCode(): ", vipMemberInfo.getResultCode());
        linkedHashMap.put("resultCode", String.valueOf(vipMemberInfo.getResultCode()));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_VIP_INFO_80070002.value(), linkedHashMap);
        if (vipMemberInfo.getResultCode().intValue() != 0) {
            iBaseResponseCallback.a(-1, "error resultCode=" + vipMemberInfo.getResultCode());
            return null;
        }
        boolean zIsSendVipInfoChanged = isSendVipInfoChanged(vipMemberInfo.getUserMemberInfo());
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "USER_VIP_INFO_KEY", peh.c(vipMemberInfo.getUserMemberInfo()), new StorageParams());
        if (zIsSendVipInfoChanged) {
            ObserverManagerUtil.e(ObserveLabels.VIP_INFO_CHANGED, vipMemberInfo.getUserMemberInfo());
        }
        iBaseResponseCallback.a(vipMemberInfo.getResultCode().intValue(), vipMemberInfo.getUserMemberInfo());
        setVipBiEvent(vipMemberInfo);
        LogUtil.a(TAG, "getVipInfo end");
        return null;
    }

    private boolean isSendVipInfoChanged(UserMemberInfo userMemberInfo) {
        UserMemberInfo userMemberInfoA = irz.a();
        if (userMemberInfoA == null) {
            LogUtil.a(TAG, "isSendVipInfoChanged cachedVipInfo is null");
            return true;
        }
        if (userMemberInfoA.getMemberFlag() == userMemberInfo.getMemberFlag() && userMemberInfoA.getMemberType() == userMemberInfo.getMemberType() && userMemberInfoA.getAutoRenew() == userMemberInfo.getAutoRenew() && userMemberInfoA.getAutoRenewType() == userMemberInfo.getAutoRenewType() && userMemberInfoA.getExpireTime() == userMemberInfo.getExpireTime()) {
            return false;
        }
        LogUtil.a(TAG, "isSendVipInfoChanged send msg");
        return true;
    }

    private void setVipBiEvent(VipInfoRsp vipInfoRsp) {
        if (vipInfoRsp.getResultCode().intValue() == 0) {
            setVipBiInfo(vipInfoRsp.getUserMemberInfo());
        }
    }

    private void setVipBiInfo(UserMemberInfo userMemberInfo) {
        String str;
        if (userMemberInfo.getMemberFlag() != 1) {
            str = "0";
        } else if (irz.d(userMemberInfo)) {
            str = "-1";
        } else {
            str = "1";
        }
        setBiInfo(str, "0");
    }

    private void setBiInfo(String str, String str2) {
        Context contextB = com.huawei.haf.application.BaseApplication.b();
        lmf.d().b(str, str2);
        SharedPreferenceManager.e(contextB, Integer.toString(10000), "MAIN_VIP_KEY", str, new StorageParams());
        SharedPreferenceManager.e(contextB, Integer.toString(10000), "SHARED_VIP_KEY", str2, new StorageParams());
    }

    public VipInfoRsp getVipMemberInfo() {
        VipInfoReq vipInfoReq = new VipInfoReq();
        try {
            HashMap map = new HashMap(10);
            map.put("clientType", fxl.d());
            map.put("country", this.mCountryCode);
            Response<VipInfoRsp> responseExecute = this.mVipInfoApi.getVipMemberInfo(vipInfoReq.getVipUserInfoUrl(), this.mParamsFactory.getHeaders(), map).execute();
            if (responseExecute == null) {
                LogUtil.j(TAG, "response is null");
                return null;
            }
            if (responseExecute.isOK()) {
                LogUtil.a(TAG, "response is OK.");
                return responseExecute.getBody();
            }
            LogUtil.j(TAG, "response result == ", Integer.valueOf(responseExecute.getCode()));
            return null;
        } catch (IOException e) {
            LogUtil.e(TAG, "getVipInfo fail, ", e.getMessage());
        }
    }

    public void getVipMessage(final String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (isVipNotEnabled(iBaseResponseCallback)) {
            return;
        }
        ThreadPoolManager.c().submit(new Callable() { // from class: com.huawei.health.vip.vipinfo.VipInfoManager$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m1248x8463fe1f(str, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getVipMessage$1$com-huawei-health-vip-vipinfo-VipInfoManager, reason: not valid java name */
    /* synthetic */ Void m1248x8463fe1f(String str, IBaseResponseCallback iBaseResponseCallback) throws Exception {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "msgId is empty");
            iBaseResponseCallback.a(-1, VastAttribute.ERROR);
            return null;
        }
        VipMessageRsp vipMessageInfo = getVipMessageInfo(str);
        if (vipMessageInfo == null) {
            LogUtil.j(TAG, "vipMessageRsp is null ");
            iBaseResponseCallback.a(-1, VastAttribute.ERROR);
            return null;
        }
        LogUtil.a(TAG, "vipMessageRsp.getResultCode(): ", vipMessageInfo.getResultCode());
        iBaseResponseCallback.a(vipMessageInfo.getResultCode().intValue(), vipMessageInfo.getMessage());
        LogUtil.a(TAG, "vipMessageRsp end");
        return null;
    }

    private VipMessageRsp getVipMessageInfo(String str) {
        VipMessageReq vipMessageReq = new VipMessageReq();
        try {
            Response<VipMessageRsp> responseExecute = this.mVipInfoApi.getVipMessage(vipMessageReq.getUrl() + str, this.mParamsFactory.getHeaders()).execute();
            if (responseExecute == null) {
                LogUtil.j(TAG, "response = null");
                return null;
            }
            if (responseExecute.isOK()) {
                LogUtil.a(TAG, "response is OK.");
                return responseExecute.getBody();
            }
            LogUtil.j(TAG, "response code == ", Integer.valueOf(responseExecute.getCode()));
            return null;
        } catch (IOException e) {
            LogUtil.e(TAG, "getVipMessageInfo fail, ", e.getMessage());
        }
    }

    public void getVipMessageList(final long j, final long j2, final IBaseResponseCallback iBaseResponseCallback, final boolean z) {
        if (isVipNotEnabled(iBaseResponseCallback)) {
            return;
        }
        ThreadPoolManager.c().submit(new Callable() { // from class: com.huawei.health.vip.vipinfo.VipInfoManager$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m1249x5b4274c0(j, j2, z, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getVipMessageList$2$com-huawei-health-vip-vipinfo-VipInfoManager, reason: not valid java name */
    /* synthetic */ Void m1249x5b4274c0(long j, long j2, boolean z, IBaseResponseCallback iBaseResponseCallback) throws Exception {
        VipMessageListRsp vipMessageList = getVipMessageList(j, j2, z);
        if (vipMessageList == null) {
            LogUtil.j(TAG, "vipMessageListRsp is null ");
            iBaseResponseCallback.a(-1, VastAttribute.ERROR);
            return null;
        }
        LogUtil.a(TAG, "vipMessageListRsp.getResultCode(): ", vipMessageList.getResultCode());
        iBaseResponseCallback.a(vipMessageList.getResultCode().intValue(), vipMessageList.getMessages());
        LogUtil.a(TAG, "vipMessageListRsp end");
        return null;
    }

    private VipMessageListRsp getVipMessageList(long j, long j2, boolean z) {
        VipMessageListReq vipMessageListReq = new VipMessageListReq();
        try {
            HashMap map = new HashMap(10);
            map.put(OFF_TIME, String.valueOf(j));
            map.put("limit", String.valueOf(j2));
            Response<VipMessageListRsp> responseExecute = this.mVipInfoApi.getVipMessageList(z ? VipMessageListReq.getVipBenefitPath() : vipMessageListReq.getUrl(), this.mParamsFactory.getHeaders(), map).execute();
            if (responseExecute == null) {
                LogUtil.j(TAG, "response = null");
                return null;
            }
            if (responseExecute.isOK()) {
                LogUtil.a(TAG, "getVipMessageList response is OK.", responseExecute.toString());
                return responseExecute.getBody();
            }
            LogUtil.j(TAG, "getVipMessageList response code == ", Integer.valueOf(responseExecute.getCode()));
            return null;
        } catch (IOException e) {
            LogUtil.e(TAG, "getVipMessageList fail, ", e.getMessage());
        }
    }

    public void setVipMessageRead(final List<String> list) {
        ThreadPoolManager.c().submit(new Callable() { // from class: com.huawei.health.vip.vipinfo.VipInfoManager$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m1250x3b8b58db(list);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setVipMessageRead$3$com-huawei-health-vip-vipinfo-VipInfoManager, reason: not valid java name */
    /* synthetic */ Void m1250x3b8b58db(List list) throws Exception {
        if (njy.e(list)) {
            LogUtil.j(TAG, "messageIds is empty");
            return null;
        }
        VipMessageReadRsp vipMessageReadRsp = getVipMessageReadRsp(list);
        if (vipMessageReadRsp == null) {
            LogUtil.j(TAG, "vipMessageListRsp is null ");
            return null;
        }
        LogUtil.a(TAG, "vipMessageListRsp.getResultCode(): ", vipMessageReadRsp.getResultCode());
        return null;
    }

    private VipMessageReadRsp getVipMessageReadRsp(List<String> list) {
        VipMessageReadReq vipMessageReadReq = new VipMessageReadReq();
        try {
            LogUtil.a(TAG, "url:", vipMessageReadReq.getUrl());
            vipMessageReadReq.setMessageIds(list);
            Response<VipMessageReadRsp> responseExecute = this.mVipInfoApi.setVipMessageRead(vipMessageReadReq.getUrl(), this.mParamsFactory.getHeaders(), ofe.c(vipMessageReadReq)).execute();
            if (responseExecute == null) {
                LogUtil.j(TAG, "response = null");
                return null;
            }
            if (responseExecute.isOK()) {
                LogUtil.a(TAG, "response is OK.");
                return responseExecute.getBody();
            }
            LogUtil.j(TAG, "response result == ", Integer.valueOf(responseExecute.getCode()));
            return null;
        } catch (IOException e) {
            LogUtil.e(TAG, "getVipMessageReadRsp fail, ", e.getMessage());
        }
    }

    private void getVipInfoFromSp(IBaseResponseCallback iBaseResponseCallback) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "USER_VIP_INFO_KEY");
        if (TextUtils.isEmpty(strE)) {
            iBaseResponseCallback.a(-1, VastAttribute.ERROR);
        } else {
            iBaseResponseCallback.a(0, (UserMemberInfo) peh.b(strE, UserMemberInfo.class));
        }
    }

    public void getVipTransferBenefits(IBaseResponseCallback iBaseResponseCallback) {
        if (isVipNotEnabled(iBaseResponseCallback)) {
            return;
        }
        VipInfoReq vipInfoReq = new VipInfoReq();
        try {
            HashMap map = new HashMap(10);
            map.put("clientType", fxl.d());
            map.put("country", this.mCountryCode);
            map.put("language", getLanguage());
            Map<String, String> headers = this.mParamsFactory.getHeaders();
            if (headers != null && !TextUtils.isEmpty(headers.get(CloudParamKeys.X_TOKEN))) {
                Response<isf> responseExecute = this.mVipInfoApi.getTransferBenefitsList(vipInfoReq.getVipTransferBenefitsUrl(), headers, map).execute();
                if (responseExecute == null) {
                    LogUtil.j(TAG, "response is null");
                    iBaseResponseCallback.a(-1, null);
                    return;
                } else if (responseExecute.isOK()) {
                    LogUtil.a(TAG, "response is OK.");
                    iBaseResponseCallback.a(0, responseExecute.getBody());
                    return;
                } else {
                    LogUtil.j(TAG, "response result == ", Integer.valueOf(responseExecute.getCode()));
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
            }
            LogUtil.j(TAG, "x-token is null");
            iBaseResponseCallback.a(-1, null);
        } catch (IOException e) {
            LogUtil.e(TAG, "getVipInfo fail, ", e.getMessage());
        }
    }

    public void getVipType(IBaseResponseCallback iBaseResponseCallback) {
        if (isVipNotEnabled(iBaseResponseCallback)) {
            return;
        }
        VipInfoReq vipInfoReq = new VipInfoReq();
        try {
            HashMap map = new HashMap(10);
            map.put("clientType", fxl.d());
            map.put("country", this.mCountryCode);
            map.put("language", getLanguage());
            map.put("clientVersion", fod.e(BaseApplication.getContext()));
            Map<String, String> headers = this.mParamsFactory.getHeaders();
            if (headers != null && !TextUtils.isEmpty(headers.get(CloudParamKeys.X_TOKEN))) {
                Response<isd> responseExecute = this.mVipInfoApi.getVipMemberType(vipInfoReq.getVipTypeUrl(), headers, map).execute();
                if (responseExecute == null) {
                    LogUtil.j(TAG, "response is null");
                    iBaseResponseCallback.a(-1, null);
                    return;
                } else if (responseExecute.isOK()) {
                    LogUtil.a(TAG, "response is OK.");
                    iBaseResponseCallback.a(0, responseExecute.getBody());
                    return;
                } else {
                    LogUtil.j(TAG, "response result == ", Integer.valueOf(responseExecute.getCode()));
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
            }
            LogUtil.j(TAG, "x-token is null");
            iBaseResponseCallback.a(-1, null);
        } catch (IOException e) {
            LogUtil.e(TAG, "getVipInfo fail, ", e.getMessage());
        }
    }

    public void getVirtualResourceSummary(IBaseResponseCallback iBaseResponseCallback) {
        if (isVipNotEnabled(iBaseResponseCallback)) {
            return;
        }
        VipInfoReq vipInfoReq = new VipInfoReq();
        try {
            HashMap map = new HashMap(10);
            map.put("clientType", fxl.d());
            map.put(TERRITORY, this.mCountryCode);
            map.put("language", getLanguage());
            String strE = lua.e(String.valueOf(10000), "IS_FIRST_TIME_OPEN_VIP_KEY", String.valueOf(-1));
            if (!String.valueOf(-1).equals(strE)) {
                map.put(SUBTYPE, strE);
            }
            map.put("clientVersion", fod.e(BaseApplication.getContext()));
            Map<String, String> headers = this.mParamsFactory.getHeaders();
            if (headers != null && !TextUtils.isEmpty(headers.get(CloudParamKeys.X_TOKEN))) {
                Response<irv> responseExecute = this.mVipInfoApi.getSummaryInfo(vipInfoReq.getVirtualResourceSummaryUrl(), headers, map).execute();
                if (responseExecute == null) {
                    LogUtil.j(TAG, "getVirtualResourceSummary: response is null");
                    iBaseResponseCallback.a(-1, null);
                    return;
                } else if (responseExecute.isOK()) {
                    LogUtil.a(TAG, "getVirtualResourceSummary: response is OK.");
                    iBaseResponseCallback.a(0, responseExecute.getBody());
                    return;
                } else {
                    LogUtil.j(TAG, "getVirtualResourceSummary: response result == ", Integer.valueOf(responseExecute.getCode()));
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
            }
            LogUtil.j(TAG, "getVirtualResourceSummary: x-token is null");
            iBaseResponseCallback.a(-1, null);
        } catch (IOException e) {
            LogUtil.e(TAG, "getVirtualResourceSummary fail, ", e.getMessage());
        }
    }

    private boolean isVipNotEnabled(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j(TAG, "isVipNotEnabled callback is null.");
            return true;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.j(TAG, "isBrowseMode.");
            iBaseResponseCallback.a(-1, "BrowseMode.");
            return true;
        }
        if (CommonUtil.ca()) {
            iBaseResponseCallback.a(-1, "GP or StoreDemo version.");
            return true;
        }
        if (irz.j()) {
            return false;
        }
        LogUtil.j(TAG, "VipAbilityEnabled false.");
        iBaseResponseCallback.a(-1, "vip ability not enabled.");
        return true;
    }

    private String getLanguage() {
        String strB = pjn.b(null);
        if (strB != null) {
            return strB;
        }
        LogUtil.j(TAG, "getLanguage get null");
        return ProfileRequestConstants.X_LANGUAGE_VALUE;
    }
}
