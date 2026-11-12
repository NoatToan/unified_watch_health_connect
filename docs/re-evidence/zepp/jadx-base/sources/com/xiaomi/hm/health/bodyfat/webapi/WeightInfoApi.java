package com.xiaomi.hm.health.bodyfat.webapi;

import com.huami.feature.config.FeatureSwitch;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class WeightInfoApi {
    private static final String a = "Weight-WeightInfoApi";
    private static final String b = "users/%s/members/%s/weightRecords";
    private static final String c = "users/%s/macAddress/%s/weightRecords";
    private static final String d = "users/%s/macAddress/%s/weightRecordOne";
    private static final String e = "huami.health.scale.delete.json";
    private static FeatureSwitch f = (FeatureSwitch) KoinJavaComponent.get(FeatureSwitch.class);

    public class a extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ IHMHttpResponseHandler a;

        public a(IHMHttpResponseHandler iHMHttpResponseHandler) {
            this.a = iHMHttpResponseHandler;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.i(WeightInfoApi.a, "no owner data upload fail" + hMHttpResponseData, new Object[0]);
            this.a.onFailure(hMHttpResponseData);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            HMLog.i(WeightInfoApi.a, "no owner data upload success:" + hMHttpResponseData, new Object[0]);
            this.a.onSuccess(hMHttpResponseData);
        }
    }

    public class b extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ IHMHttpResponseHandler a;

        public b(IHMHttpResponseHandler iHMHttpResponseHandler) {
            this.a = iHMHttpResponseHandler;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.i(WeightInfoApi.a, "weightinfo upload fail" + hMHttpResponseData, new Object[0]);
            this.a.onFailure(hMHttpResponseData);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            HMLog.i(WeightInfoApi.a, "weightinfo upload success:" + hMHttpResponseData, new Object[0]);
            this.a.onSuccess(hMHttpResponseData);
        }
    }

    private static void a(String str, IHMSimpleHttpResponseHandler iHMSimpleHttpResponseHandler) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        String url = HMServerDef.getUrl(String.format(Locale.getDefault(), str, BFCallback.getHMPersonInfo().getUserid(), BFCallback.getHMDeviceManager().getBoundDeviceAddress(HMDeviceType.WEIGHT)));
        HMLog.d(a, "Sync WeightInfos Without Owner To Local : " + url, new Object[0]);
        HMLog.d(a, "params : " + systemParams, new Object[0]);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, true, iHMSimpleHttpResponseHandler);
    }

    public static void deleteWeightInfoWithoutOwner(long j, IHMSimpleHttpResponseHandler iHMSimpleHttpResponseHandler) {
        if (f.isSyncDataEnable()) {
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put(ParamKey.createTime, Long.valueOf(j));
            String url = HMServerDef.getUrl(String.format(Locale.getDefault(), c, BFCallback.getHMPersonInfo().getUserid(), BFCallback.getHMDeviceManager().getBoundDeviceAddress(HMDeviceType.WEIGHT)));
            HMLog.d(a, "Delete WeightInfos Without Owner : " + url, new Object[0]);
            HMLog.d(a, "params : " + systemParams, new Object[0]);
            HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.DELETE, true, iHMSimpleHttpResponseHandler);
        }
    }

    public static void syncDeletedWeightInfosToServer(String str, IHMHttpResponseHandler iHMHttpResponseHandler) {
        if (f.isSyncDataEnable()) {
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("jsondata", str);
            systemParams.put("devicetype", 1);
            String url = HMServerDef.getUrl(e);
            HMLog.d(a, "Sync Deleted WeightInfos To Server : " + url, new Object[0]);
            HMLog.d(a, "params : " + systemParams, new Object[0]);
            HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, true, iHMHttpResponseHandler);
        }
    }

    public static void syncNoOwnerDataToServer(String str, String str2, IHMHttpResponseHandler iHMHttpResponseHandler) {
        if (f.isSyncDataEnable()) {
            String url = HMServerDef.getUrl(String.format(Locale.getDefault(), c, BFCallback.getHMPersonInfo().getUserid(), str));
            try {
                Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
                HashSet hashSet = new HashSet();
                systemHeader.put("Content-Type", "application/json");
                hashSet.add(str2);
                HMLog.v(a, "no owner data:" + str2, new Object[0]);
                HMWebUtil.doSeparateRequest(url, systemHeader, (Set<Object>) hashSet, Support.RequestSupport.POST, true, true, (IHMBasicHttpResponseHandler) new a(iHMHttpResponseHandler), new HMHttpConfig[0]);
            } catch (Exception unused) {
            }
        }
    }

    public static void syncWeightInfoLatestWithoutOwnerToLocal(IHMSimpleHttpResponseHandler iHMSimpleHttpResponseHandler) {
        a(d, iHMSimpleHttpResponseHandler);
    }

    public static void syncWeightInfoWithoutOwnerToLocal(IHMSimpleHttpResponseHandler iHMSimpleHttpResponseHandler) {
        a(c, iHMSimpleHttpResponseHandler);
    }

    public static void syncWeightInfosToLocal(long j, long j2, long j3, IHMSimpleHttpResponseHandler iHMSimpleHttpResponseHandler) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("limit", 200);
        if (j > -1) {
            systemParams.put("fromTime", Long.valueOf(ExtentionUtilsKt.millsToSecond(j, false)));
        }
        if (j2 > -1) {
            systemParams.put("toTime", Long.valueOf(ExtentionUtilsKt.millsToSecond(j2, false)));
        } else {
            systemParams.put("toTime", Long.valueOf(System.currentTimeMillis() / 1000));
        }
        String userid = BFCallback.getHMPersonInfo().getUserid();
        if (j3 == Long.parseLong(userid)) {
            j3 = -1;
        }
        String url = HMServerDef.getUrl(String.format(Locale.getDefault(), b, userid, Long.valueOf(j3)));
        HMLog.d(a, "Sync WeightInfos To Local : " + url, new Object[0]);
        HMLog.d(a, "params : " + systemParams, new Object[0]);
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, true, iHMSimpleHttpResponseHandler);
    }

    public static void syncWeightInfosToServer(String str, String str2, IHMHttpResponseHandler iHMHttpResponseHandler) {
        if (f.isSyncDataEnable()) {
            String userid = BFCallback.getHMPersonInfo().getUserid();
            String strValueOf = str;
            if (strValueOf.equals(userid)) {
                strValueOf = String.valueOf(-1L);
            }
            String str3 = HMServerDef.getUrl(String.format(Locale.getDefault(), b, userid, strValueOf)) + "?deviceSource=104";
            try {
                Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
                HashSet hashSet = new HashSet();
                systemHeader.put("Content-Type", "application/json");
                hashSet.add(str2);
                HMLog.i(a, "weightinfo upload url:" + str3, new Object[0]);
                HMLog.i(a, "weightinfo upload params:" + str2, new Object[0]);
                HMWebUtil.doSeparateRequest(str3, systemHeader, (Set<Object>) hashSet, Support.RequestSupport.POST, true, true, (IHMBasicHttpResponseHandler) new b(iHMHttpResponseHandler), new HMHttpConfig[0]);
            } catch (Exception unused) {
            }
        }
    }
}
