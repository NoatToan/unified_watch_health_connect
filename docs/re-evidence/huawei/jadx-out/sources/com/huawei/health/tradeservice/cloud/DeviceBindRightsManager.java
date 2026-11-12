package com.huawei.health.tradeservice.cloud;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hms.feature.dynamic.b;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.ChallengeInfo;
import com.huawei.trade.datatype.DeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitInfoDetail;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import com.huawei.trade.datatype.DevicePolicyInfos;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.ddv;
import defpackage.eeq;
import defpackage.eer;
import defpackage.fca;
import defpackage.ilu;
import defpackage.ily;
import defpackage.irz;
import defpackage.lua;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import defpackage.pjn;
import defpackage.qhu;
import defpackage.qqf;
import defpackage.qqt;
import health.compact.a.GRSManager;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes32.dex */
public class DeviceBindRightsManager {
    private static final int DEFAULT_RESULT_CODE_FAIL = -1;
    private static final int EXCLUSIVE_GUARDIAN_RESOURCE_TYPE = 9;
    private static final String EXCLUSIVE_VIP_TYPE_FULL = "0";
    private static final String EXCLUSIVE_VIP_TYPE_TRIAL = "-1";
    private static final int OPEN_H5_VIEW = 1;
    private static final String RELEASE_TAG = "R_DeviceBindRightsManager";
    private static final int RESULT_CODE_SUCCESS = 0;
    private static final String TAG = "DeviceBindRightsManager";
    private static final long TIME_TWENTY_SECOND = 20000;
    private static DeviceHandler mHandler = new DeviceHandler(Looper.getMainLooper());

    public static void queryBenefitInfo(final int i, final String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.b(TAG, "queryBenefitInfo browseMode.");
            iBaseResponseCallback.a(-1, "queryBenefitInfo browseMode");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceBindRightsManager.queryBenefitInfo(i, str, iBaseResponseCallback);
                }
            });
        } else {
            requestBenefitInfo(i, str, iBaseResponseCallback);
        }
    }

    private static void requestBenefitInfo(final int i, String str, final IBaseResponseCallback iBaseResponseCallback) {
        TradeServiceCloudFactory tradeServiceCloudFactory = new TradeServiceCloudFactory(BaseApplication.getContext());
        String str2 = GRSManager.c(BaseApplication.getContext()).getUrl("tradeService") + "/tradeservice/v1/repeatresource/benefit-info";
        HashMap map = new HashMap();
        map.put("resourceType", String.valueOf(i));
        map.put("resourceId", str);
        oet.d().e(str2, tradeServiceCloudFactory.getHeaders(), map, BenefitInfoRsp.class, new ResultCallback<BenefitInfoRsp>() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager.1
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(BenefitInfoRsp benefitInfoRsp) {
                if (benefitInfoRsp == null) {
                    iBaseResponseCallback.a(-1, "queryBenefitInfo is null.");
                } else if (benefitInfoRsp.getResultCode() == 0) {
                    iBaseResponseCallback.a(0, benefitInfoRsp.getBenefitResult());
                    DeviceBindRightsManager.handleSaveExclusiveStatusToSp(i, benefitInfoRsp.getBenefitResult());
                } else {
                    LogUtil.b(DeviceBindRightsManager.TAG, "queryBenefitInfo data getResultCode: ", Integer.valueOf(benefitInfoRsp.getResultCode()));
                    iBaseResponseCallback.a(benefitInfoRsp.getResultCode(), Integer.valueOf(benefitInfoRsp.getResultCode()));
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e(DeviceBindRightsManager.TAG, "queryBenefitInfo onFailure. throwable: ", th.toString());
                iBaseResponseCallback.a(-1, th.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleSaveExclusiveStatusToSp(int i, Object obj) {
        if (i == 9 && (obj instanceof RepeatResourceBenefitInfo)) {
            RepeatResourceBenefitInfo repeatResourceBenefitInfo = (RepeatResourceBenefitInfo) obj;
            boolean zE = repeatResourceBenefitInfo != null ? fca.e(repeatResourceBenefitInfo) : true;
            String str = zE ? "-1" : "0";
            lua.f(String.valueOf(10000), "IS_FIRST_TIME_OPEN_VIP_KEY", str);
            LogUtil.b(TAG, "handleSaveExclusiveStatusToSp success, isFirstTime: " + zE + ", vipType: " + str);
        }
    }

    private static boolean isParametersValid(DeviceBenefitQueryParam deviceBenefitQueryParam, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.e(TAG, "isParametersValid callback is null.");
            return false;
        }
        if (!irz.j() || !VersionControlUtil.isSupportOperationAccount()) {
            LogUtil.e(TAG, "isParametersValid GP or oversea or minor account.");
            iBaseResponseCallback.a(-1, "GP or oversea or minor account.");
            return false;
        }
        if (deviceBenefitQueryParam == null) {
            iBaseResponseCallback.a(-1, "no device.");
            LogUtil.e(TAG, "isParametersValid queryParam is null.");
            return false;
        }
        if (deviceBenefitQueryParam.getBenefitType() == null) {
            LogUtil.e(TAG, "getDeviceBenefits benefitType error");
            iBaseResponseCallback.a(-1, "benefitType error");
            return false;
        }
        if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            return true;
        }
        LogUtil.b(TAG, "browseMode.");
        iBaseResponseCallback.a(-1, "browseMode");
        return false;
    }

    public static void getDeviceBenefits(DeviceBenefitQueryParam deviceBenefitQueryParam, IBaseResponseCallback iBaseResponseCallback) {
        if (!isParametersValid(deviceBenefitQueryParam, iBaseResponseCallback)) {
            LogUtil.e(TAG, "getDeviceBenefits Parameters invalid.");
        } else {
            getInboxAndPerfPurchaseBenefit(deviceBenefitQueryParam, iBaseResponseCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getInboxAndPerfPurchaseBenefit(final DeviceBenefitQueryParam deviceBenefitQueryParam, final IBaseResponseCallback iBaseResponseCallback) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceBindRightsManager.getInboxAndPerfPurchaseBenefit(deviceBenefitQueryParam, iBaseResponseCallback);
                }
            });
        } else if (!isParametersValid(deviceBenefitQueryParam, iBaseResponseCallback)) {
            LogUtil.e(TAG, "getDeviceInboxInfo Parameters invalid.");
        } else {
            requestBenefit(deviceBenefitQueryParam, iBaseResponseCallback);
        }
    }

    private static void requestBenefit(DeviceBenefitQueryParam deviceBenefitQueryParam, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.c(RELEASE_TAG, "getDeviceInboxInfo enter");
        TradeServiceCloudFactory tradeServiceCloudFactory = new TradeServiceCloudFactory(BaseApplication.getContext());
        Map<String, Object> commonParams = getCommonParams(deviceBenefitQueryParam);
        if (commonParams.isEmpty()) {
            LogUtil.e(TAG, "params is empty.");
            iBaseResponseCallback.a(-1, "no device.");
            return;
        }
        oet.d().c(GRSManager.c(BaseApplication.getContext()).getUrl("tradeService") + "/tradeservice/v2/device-policies", tradeServiceCloudFactory.getHeaders(), ofe.c(commonParams), DeviceInboxAndPerfRsp.class, new AnonymousClass2(iBaseResponseCallback, deviceBenefitQueryParam));
    }

    /* JADX INFO: renamed from: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager$2, reason: invalid class name */
    class AnonymousClass2 implements ResultCallback<DeviceInboxAndPerfRsp> {
        final /* synthetic */ IBaseResponseCallback val$callback;
        final /* synthetic */ DeviceBenefitQueryParam val$queryParam;

        AnonymousClass2(IBaseResponseCallback iBaseResponseCallback, DeviceBenefitQueryParam deviceBenefitQueryParam) {
            this.val$callback = iBaseResponseCallback;
            this.val$queryParam = deviceBenefitQueryParam;
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onSuccess(DeviceInboxAndPerfRsp deviceInboxAndPerfRsp) {
            if (deviceInboxAndPerfRsp == null) {
                this.val$callback.a(-1, "getDeviceInboxInfo is null.");
                return;
            }
            if (deviceInboxAndPerfRsp.getResultCode() == 0) {
                DevicePolicyInfos devicePolicyInfos = deviceInboxAndPerfRsp.getDevicePolicyInfos();
                if (devicePolicyInfos == null) {
                    LogUtil.e(DeviceBindRightsManager.TAG, "DevicePolicyInfos is null.");
                    this.val$callback.a(-1, "devicePolicyInfos is null.");
                    return;
                }
                final DeviceBenefits deviceBenefits = new DeviceBenefits();
                deviceBenefits.setBenefitInfos(devicePolicyInfos.getDeviceBenefitInfoList());
                deviceBenefits.setInboxInfos(devicePolicyInfos.getDeviceInboxInfoList());
                deviceBenefits.setPerfPurchaseInfos(devicePolicyInfos.getDevicePerfPurchaseInfoList());
                deviceBenefits.setDeviceSn(this.val$queryParam.getDeviceSn());
                deviceBenefits.setDeviceType(this.val$queryParam.getDeviceType());
                DeviceBindRightsManager.printBenefitInfo(devicePolicyInfos);
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DeviceBindRightsManager.preLoadBenefitImage(deviceBenefits);
                    }
                });
                this.val$callback.a(0, deviceBenefits);
                return;
            }
            LogUtil.b(DeviceBindRightsManager.TAG, "getDeviceInboxInfo data getResultDesc: ", deviceInboxAndPerfRsp.getResultDesc());
            this.val$callback.a(deviceInboxAndPerfRsp.getResultCode(), deviceInboxAndPerfRsp.getResultDesc());
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            LogUtil.e(DeviceBindRightsManager.TAG, "getDeviceInboxInfo onFailure. throwable: ", th.toString());
            this.val$callback.a(-1, th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void preLoadBenefitImage(DeviceBenefits deviceBenefits) {
        if (deviceBenefits == null) {
            LogUtil.e(TAG, "preLoadBenefitImage deviceBenefits is null");
        } else {
            preLoadInboxImage(deviceBenefits.getInboxInfos());
            preLoadPurchaseImage(deviceBenefits.getPerfPurchaseInfos());
        }
    }

    private static void preLoadInboxImage(List<DeviceInboxInfo> list) {
        if (njy.e(list)) {
            LogUtil.e(TAG, "preLoadInboxImage inboxInfos is null");
            return;
        }
        for (DeviceInboxInfo deviceInboxInfo : list) {
            String cardUrl = deviceInboxInfo.getCardUrl();
            String largeCardUrl = deviceInboxInfo.getLargeCardUrl();
            if (!TextUtils.isEmpty(cardUrl)) {
                qqf.g(cardUrl);
            }
            if (!TextUtils.isEmpty(largeCardUrl)) {
                qqf.g(largeCardUrl);
            }
        }
    }

    private static void preLoadPurchaseImage(List<DevicePerfPurchaseInfo> list) {
        if (njy.e(list)) {
            LogUtil.e(TAG, "preLoadPurchaseImage inboxInfos is null");
            return;
        }
        for (DevicePerfPurchaseInfo devicePerfPurchaseInfo : list) {
            String cardUrl = devicePerfPurchaseInfo.getCardUrl();
            String largeCardUrl = devicePerfPurchaseInfo.getLargeCardUrl();
            if (!TextUtils.isEmpty(cardUrl)) {
                qqf.g(cardUrl);
            }
            if (!TextUtils.isEmpty(largeCardUrl)) {
                qqf.g(largeCardUrl);
            }
        }
    }

    public static void deviceInboxActive(DeviceBenefitQueryParam deviceBenefitQueryParam, DeviceInboxInfo deviceInboxInfo, HashMap<String, Object> map, final IBaseResponseCallback iBaseResponseCallback) {
        if (deviceBenefitQueryParam == null || deviceInboxInfo == null || map == null || iBaseResponseCallback == null) {
            LogUtil.e(TAG, "deviceInboxActive Parameters invalid");
            return;
        }
        TradeServiceCloudFactory tradeServiceCloudFactory = new TradeServiceCloudFactory(BaseApplication.getContext());
        Map<String, Object> commonParams = getCommonParams(deviceBenefitQueryParam);
        commonParams.put("deviceInboxId", deviceInboxInfo.getDeviceInboxId());
        commonParams.put("version", b.u);
        commonParams.putAll(map);
        oet.d().c(GRSManager.c(BaseApplication.getContext()).getUrl("tradeService") + "/tradeservice/v3/device-inbox-active", tradeServiceCloudFactory.getHeaders(), ofe.c(commonParams), BaseRsp.class, new ResultCallback<BaseRsp>() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager.3
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(BaseRsp baseRsp) {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
                linkedHashMap.put(OpAnalyticsConstants.REQUEST_INTERFACE, "/tradeservice/v3/device-inbox-active");
                linkedHashMap.put("resultCode", Integer.toString(baseRsp.getResultCode()));
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_VIP_INFO_80070002.value(), linkedHashMap);
                LogUtil.b(DeviceBindRightsManager.TAG, "deviceInboxActive data : ", qqt.b(baseRsp));
                iBaseResponseCallback.a(baseRsp.getResultCode(), baseRsp.getResultDesc());
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.d(DeviceBindRightsManager.RELEASE_TAG, "deviceInboxActive onFailure. throwable: ", ExceptionUtils.c(th));
                iBaseResponseCallback.a(-1, VastAttribute.ERROR);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void printBenefitInfo(DevicePolicyInfos devicePolicyInfos) {
        if (devicePolicyInfos == null) {
            return;
        }
        if (njy.b(devicePolicyInfos.getDeviceInboxInfoList())) {
            ReleaseLogUtil.c(RELEASE_TAG, "getDeviceInboxInfoList size = ", Integer.valueOf(devicePolicyInfos.getDeviceInboxInfoList().size()));
        }
        if (njy.b(devicePolicyInfos.getDevicePerfPurchaseInfoList())) {
            ReleaseLogUtil.c(RELEASE_TAG, "getDevicePerfPurchaseInfoList size = ", Integer.valueOf(devicePolicyInfos.getDevicePerfPurchaseInfoList().size()));
        }
        if (njy.b(devicePolicyInfos.getDeviceBenefitInfoList())) {
            ReleaseLogUtil.c(RELEASE_TAG, "getDeviceBenefitInfoList size = ", Integer.valueOf(devicePolicyInfos.getDeviceBenefitInfoList().size()));
        }
    }

    public static void bindDeviceBenefit(final DeviceBenefitQueryParam deviceBenefitQueryParam, final IBaseResponseCallback iBaseResponseCallback) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceBindRightsManager.bindDeviceBenefit(deviceBenefitQueryParam, iBaseResponseCallback);
                }
            });
            return;
        }
        if (!isParametersValid(deviceBenefitQueryParam, iBaseResponseCallback)) {
            LogUtil.e(TAG, "bindDeviceBenefit Parameters invalid.");
            return;
        }
        LogUtil.b(TAG, "bindDeviceBenefit enter");
        Map<String, Object> commonParams = getCommonParams(deviceBenefitQueryParam);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        getCertParams(countDownLatch, deviceBenefitQueryParam, commonParams);
        try {
            LogUtil.b(TAG, "wait bindDeviceBenefit countDown result:", Boolean.valueOf(countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.d(TAG, "InterruptedException");
        }
        if (commonParams.isEmpty()) {
            iBaseResponseCallback.a(-1, "no device.");
            return;
        }
        oet.d().c(GRSManager.c(BaseApplication.getContext()).getUrl("tradeService") + "/tradeservice/v1/device-benefit-bind", new TradeServiceCloudFactory(BaseApplication.getContext()).getHeaders(), ofe.c(commonParams), BaseRsp.class, new ResultCallback<BaseRsp>() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager.4
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(BaseRsp baseRsp) {
                if (baseRsp == null) {
                    iBaseResponseCallback.a(-1, "DevicePerfPurchaseRsp is null.");
                } else {
                    ReleaseLogUtil.c(DeviceBindRightsManager.RELEASE_TAG, "bindDeviceBenefit success. data: ", Integer.valueOf(baseRsp.getResultCode()));
                    iBaseResponseCallback.a(baseRsp.getResultCode(), baseRsp.getResultDesc());
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e(DeviceBindRightsManager.TAG, "bindDeviceBenefit onFailure. throwable: ", th.toString());
                iBaseResponseCallback.a(-1, th.toString());
            }
        });
    }

    private static void getCertParams(final CountDownLatch countDownLatch, final DeviceBenefitQueryParam deviceBenefitQueryParam, final Map<String, Object> map) {
        getChallenge(new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                DeviceBindRightsManager.lambda$getCertParams$4(countDownLatch, deviceBenefitQueryParam, map, i, obj);
            }
        });
    }

    static /* synthetic */ void lambda$getCertParams$4(final CountDownLatch countDownLatch, DeviceBenefitQueryParam deviceBenefitQueryParam, final Map map, int i, Object obj) {
        ReleaseLogUtil.c(TAG, "getChallenge onResponse errorCode: ", Integer.valueOf(i));
        if (i != 0) {
            countDownLatch.countDown();
            return;
        }
        LogUtil.c(TAG, "getChallenge onResponse objData: ", new Gson().toJson(obj));
        eer.c().e(deviceBenefitQueryParam.getDeviceInfo(), new int[]{1}, ((ChallengeInfo) obj).getChallenge(), new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager$$ExternalSyntheticLambda7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj2) {
                DeviceBindRightsManager.lambda$getCertParams$3(map, countDownLatch, i2, obj2);
            }
        });
    }

    static /* synthetic */ void lambda$getCertParams$3(Map map, CountDownLatch countDownLatch, int i, Object obj) {
        ReleaseLogUtil.c(RELEASE_TAG, "sendGetDeviceCertCommand onResponse errorCode: ", Integer.valueOf(i));
        LogUtil.c(TAG, "getDeviceCertificateChain objData = ", new Gson().toJson(obj));
        addCertToParams(i, obj, map);
        countDownLatch.countDown();
    }

    private static Map<String, Object> getCommonParams(DeviceBenefitQueryParam deviceBenefitQueryParam) {
        if (deviceBenefitQueryParam == null) {
            LogUtil.e(TAG, "queryParam == null");
            return Collections.EMPTY_MAP;
        }
        String deviceType = deviceBenefitQueryParam.getDeviceType();
        String deviceSn = deviceBenefitQueryParam.getDeviceSn();
        String deviceUdid = deviceBenefitQueryParam.getDeviceUdid();
        String salt = deviceBenefitQueryParam.getSalt();
        String deviceNumber = deviceBenefitQueryParam.getDeviceNumber();
        if (TextUtils.isEmpty(deviceType)) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(16);
        map.put("territory", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        map.put(CloudParamKeys.CLIENT_TYPE, String.valueOf(ily.a()));
        map.put("locale", pjn.b(null));
        map.put("deviceType", deviceType);
        map.put("clientVersion", CardManager.getClientVersion(BaseApplication.getContext()));
        if (!TextUtils.isEmpty(deviceSn)) {
            map.put("deviceSN", deviceSn);
        }
        if (!TextUtils.isEmpty(deviceUdid)) {
            map.put("udid", deviceUdid);
        }
        if (!TextUtils.isEmpty(deviceNumber)) {
            map.put("deviceNumber", eeq.d(deviceNumber));
        }
        if (!TextUtils.isEmpty(salt)) {
            map.put("salt", eeq.d(salt));
        }
        int deviceCategory = deviceBenefitQueryParam.getDeviceCategory();
        if (deviceCategory != 0) {
            map.put("deviceCategory", String.valueOf(deviceCategory));
        }
        int deviceSnType = deviceBenefitQueryParam.getDeviceSnType();
        if (deviceSnType != 0) {
            map.put("snType", String.valueOf(deviceSnType));
        }
        LogUtil.b(TAG, "queryParam = ", map.toString());
        return map;
    }

    public static void getDeviceBenefitsBatch(final List<DeviceBenefitQueryParam> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (!njy.e(list)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceBindRightsManager.lambda$getDeviceBenefitsBatch$5(list, iBaseResponseCallback);
                }
            });
        } else if (iBaseResponseCallback != null) {
            LogUtil.e(TAG, "getDeviceBenefitsBatch queryParam is null.");
            iBaseResponseCallback.a(-1, "no device.");
        }
    }

    static /* synthetic */ void lambda$getDeviceBenefitsBatch$5(List list, IBaseResponseCallback iBaseResponseCallback) {
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            getDeviceBenefits((DeviceBenefitQueryParam) it.next(), new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (obj instanceof DeviceBenefits) {
                        copyOnWriteArrayList.add((DeviceBenefits) obj);
                    }
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await(20000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.d(TAG, "getDeviceBenefitsBatch InterruptedException");
        }
        if (iBaseResponseCallback != null) {
            if (njy.e(copyOnWriteArrayList)) {
                ReleaseLogUtil.c(RELEASE_TAG, "deviceBenefitsList is empty.");
                iBaseResponseCallback.a(-1, "No device has benefit.");
            } else {
                iBaseResponseCallback.a(0, copyOnWriteArrayList);
            }
        }
    }

    public static void enableBenefitAutoActivation(final DeviceBenefitQueryParam deviceBenefitQueryParam) {
        getDeviceBenefits(deviceBenefitQueryParam, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof DeviceBenefits) {
                    DeviceBenefits deviceBenefits = (DeviceBenefits) obj;
                    List<DeviceInboxInfo> inboxInfos = deviceBenefits.getInboxInfos();
                    if (njy.e(inboxInfos)) {
                        LogUtil.b(DeviceBindRightsManager.TAG, "deviceInboxInfoList is empty");
                        return;
                    }
                    for (DeviceInboxInfo deviceInboxInfo : inboxInfos) {
                        if (deviceInboxInfo.isBenefitInfoValid() && deviceInboxInfo.isAutoActivate()) {
                            ReleaseLogUtil.c(DeviceBindRightsManager.RELEASE_TAG, "has auto activated inbox.");
                            DeviceBindRightsManager.useWhichValidType(deviceBenefitQueryParam, deviceInboxInfo);
                            break;
                        }
                    }
                    DeviceBindRightsManager.processDevBenefitIneffective(deviceBenefits, deviceBenefitQueryParam);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processDevBenefitIneffective(DeviceBenefits deviceBenefits, DeviceBenefitQueryParam deviceBenefitQueryParam) {
        if (getNeedBindDeviceBenefit(deviceBenefits)) {
            bindDeviceBenefit(deviceBenefitQueryParam, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager$$ExternalSyntheticLambda2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LogUtil.b(DeviceBindRightsManager.TAG, "bindDeviceBenefit errorCode: ", Integer.valueOf(i));
                }
            });
        }
    }

    private static boolean getNeedBindDeviceBenefit(DeviceBenefits deviceBenefits) {
        List<DeviceBenefitInfo> benefitInfos = deviceBenefits.getBenefitInfos();
        if (njy.e(benefitInfos)) {
            LogUtil.b(TAG, "deviceBenefitInfoList is empty");
            return false;
        }
        for (DeviceBenefitInfo deviceBenefitInfo : benefitInfos) {
            List<DeviceBenefitInfoDetail> benefitInfos2 = deviceBenefitInfo.getBenefitInfos();
            if (!njy.e(benefitInfos2)) {
                Iterator<DeviceBenefitInfoDetail> it = benefitInfos2.iterator();
                while (it.hasNext()) {
                    if (isInvalidSmartTrainPlanBenefit(it.next(), deviceBenefitInfo)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isInvalidSmartTrainPlanBenefit(DeviceBenefitInfoDetail deviceBenefitInfoDetail, DeviceBenefitInfo deviceBenefitInfo) {
        if (deviceBenefitInfoDetail.getBenefitType() == 3) {
            return deviceBenefitInfo.getActiveStatus() == 2 || deviceBenefitInfo.getActiveStatus() == 3;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void useWhichValidType(final DeviceBenefitQueryParam deviceBenefitQueryParam, final DeviceInboxInfo deviceInboxInfo) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceBindRightsManager.useWhichValidType(deviceBenefitQueryParam, deviceInboxInfo);
                }
            });
            return;
        }
        Map<String, Object> commonParams = getCommonParams(deviceBenefitQueryParam);
        if (commonParams.isEmpty()) {
            LogUtil.e(TAG, "bindAutoActivateDevice params is empty.");
        } else {
            dealWithValidType(deviceBenefitQueryParam, deviceInboxInfo, commonParams);
        }
    }

    private static void dealWithValidType(final DeviceBenefitQueryParam deviceBenefitQueryParam, DeviceInboxInfo deviceInboxInfo, final Map<String, Object> map) {
        if (deviceInboxInfo.getValidateType() == 2) {
            getChallenge(new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager.7
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.b(DeviceBindRightsManager.TAG, "getChallenge onResponse errorCode: ", Integer.valueOf(i));
                    if (i == 0) {
                        LogUtil.c(DeviceBindRightsManager.TAG, "getChallenge onResponse objData: ", new Gson().toJson(obj));
                        eer.c().e(deviceBenefitQueryParam.getDeviceInfo(), new int[]{1}, ((ChallengeInfo) obj).getChallenge(), new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager.7.1
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i2, Object obj2) {
                                ReleaseLogUtil.c(DeviceBindRightsManager.RELEASE_TAG, "sendGetDeviceCertCommand onResponse errorCode: ", Integer.valueOf(i2));
                                LogUtil.c(DeviceBindRightsManager.TAG, "getDeviceCertificateChain objData = ", new Gson().toJson(obj2));
                                DeviceBindRightsManager.addCertToParams(i2, obj2, map);
                                DeviceBindRightsManager.enableAutoActivation(map);
                            }
                        });
                    }
                }
            });
        } else {
            enableAutoActivation(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addCertToParams(int i, Object obj, Map<String, Object> map) {
        if (i == -1 || (!(obj instanceof String) && !(obj instanceof List))) {
            map.put("certChain", null);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                map.put("certChain", new Gson().toJson(str));
                map.put("certChainType", "1");
                return;
            } else {
                ReleaseLogUtil.d(RELEASE_TAG, "getDeviceCertificateChain cert is null");
                map.put("certChain", null);
                return;
            }
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (njy.e(list)) {
                ReleaseLogUtil.d(RELEASE_TAG, "getDeviceCertificateChain cert list is null");
                map.put("certChainList", null);
            } else {
                map.put("certChainList", list);
                map.put("certChainType", "2");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void enableAutoActivation(Map<String, Object> map) {
        oet.d().c(GRSManager.c(BaseApplication.getContext()).getUrl("tradeService") + "/tradeservice/v1/inbox-device-bind", new TradeServiceCloudFactory(BaseApplication.getContext()).getHeaders(), ofe.c(map), BaseRsp.class, new ResultCallback<BaseRsp>() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager.8
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(BaseRsp baseRsp) {
                LogUtil.b(DeviceBindRightsManager.TAG, "Bind inbox info data getResultDesc: ", baseRsp.getResultDesc(), "; getResultCode: ", Integer.valueOf(baseRsp.getResultCode()));
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e(DeviceBindRightsManager.TAG, "Bind inbox info onFailure. throwable: ", th.toString());
            }
        });
    }

    public static void activateDeviceBenefitPage(final DeviceBenefitQueryParam deviceBenefitQueryParam) {
        if (deviceBenefitQueryParam == null) {
            ReleaseLogUtil.d(TAG, "activateDeviceBenefitPage queryParam is null.");
            return;
        }
        ReleaseLogUtil.c(TAG, "start activateDeviceBenefitPage.");
        getDeviceBenefits(deviceBenefitQueryParam, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof DeviceBenefits) {
                    DeviceBenefits deviceBenefits = (DeviceBenefits) obj;
                    DeviceInboxInfo deviceInboxInfoE = qhu.e(deviceBenefits.getInboxInfos());
                    DeviceInboxInfo deviceInboxInfoD = ilu.d(deviceBenefits.getInboxInfos());
                    DevicePerfPurchaseInfo devicePerfPurchaseInfoC = qhu.c(deviceBenefits.getPerfPurchaseInfos());
                    ReleaseLogUtil.c(DeviceBindRightsManager.RELEASE_TAG, "isValidInboxInfo: ", Boolean.valueOf(deviceInboxInfoE != null), "; isValidPerfPurchaseInfo: ", Boolean.valueOf(devicePerfPurchaseInfoC != null));
                    if (deviceInboxInfoD != null) {
                        DeviceBindRightsManager.jumpToNewBenefitDialog(deviceInboxInfoD, deviceBenefits);
                        return;
                    }
                    if (deviceInboxInfoE != null) {
                        irz.a(true, deviceBenefits.getDeviceSn());
                        DeviceBindRightsManager.jumpToNewBenefitDialog(deviceInboxInfoE, deviceBenefits);
                        return;
                    }
                    if (devicePerfPurchaseInfoC != null) {
                        irz.a(false, deviceBenefits.getDeviceSn());
                        DeviceBindRightsManager.jumpToNewBenefitDialog(devicePerfPurchaseInfoC, deviceBenefits);
                        return;
                    }
                    LogUtil.e(DeviceBindRightsManager.TAG, "NO INFO VALID.");
                    if (TextUtils.isEmpty("")) {
                        return;
                    }
                    String str = "&deviceSN=" + deviceBenefitQueryParam.getDeviceSn();
                    ilu.c(deviceBenefits);
                    DeviceBindRightsManager.sendMsg(1, str);
                }
            }
        });
        bindDeviceBenefit(deviceBenefitQueryParam, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.b(DeviceBindRightsManager.TAG, "bindDeviceBenefit errorCode: ", Integer.valueOf(i));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jumpToNewBenefitDialog(BaseDeviceBenefitInfo baseDeviceBenefitInfo, DeviceBenefits deviceBenefits) {
        List<DeviceBenefitInfo> benefitInfos = deviceBenefits.getBenefitInfos();
        baseDeviceBenefitInfo.setDeviceSn(deviceBenefits.getDeviceSn());
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "DEVICE_BIND_INBOX_KEY", String.valueOf(1), new StorageParams());
        irz.e(BaseApplication.getContext(), baseDeviceBenefitInfo, 1, benefitInfos);
        ilu.c(deviceBenefits);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void openH5(String str) {
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "DEVICE_BIND_INBOX_KEY", String.valueOf(1), new StorageParams());
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath(str);
        Context activity = BaseApplication.getActivity();
        if (activity == null) {
            LogUtil.e(TAG, "getActivity() is null.");
            activity = BaseApplication.getContext();
        }
        LogUtil.b(TAG, "open H5, path = ", str);
        ddv.b().loadH5ProApp(activity, "com.huawei.health.h5.vip", builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void sendMsg(int i, T t) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = t;
        mHandler.sendMessage(messageObtain);
    }

    static class DeviceHandler extends Handler {
        DeviceHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                if (message.obj instanceof String) {
                    DeviceBindRightsManager.openH5((String) message.obj);
                    return;
                }
                return;
            }
            LogUtil.b(DeviceBindRightsManager.TAG, "NO MESSAGE.");
        }
    }

    public static void getChallenge(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.b(TAG, "getChallenge callBack is null.");
            return;
        }
        oet.d().e(GRSManager.c(BaseApplication.getContext()).getUrl("tradeService") + "/tradeservice/v1/device-cert-challenge", new TradeServiceCloudFactory(BaseApplication.getContext()).getHeaders(), new HashMap(), DeviceCertChallengeRsp.class, new ResultCallback<DeviceCertChallengeRsp>() { // from class: com.huawei.health.tradeservice.cloud.DeviceBindRightsManager.11
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(DeviceCertChallengeRsp deviceCertChallengeRsp) {
                if (deviceCertChallengeRsp == null) {
                    iBaseResponseCallback.a(-1, "getDeviceInboxInfo is null.");
                } else if (deviceCertChallengeRsp.getResultCode() == 0) {
                    iBaseResponseCallback.a(deviceCertChallengeRsp.getResultCode(), deviceCertChallengeRsp.getChallengeInfo());
                } else {
                    LogUtil.b(DeviceBindRightsManager.TAG, "getChallenge data getResultDesc: ", deviceCertChallengeRsp.getResultDesc());
                    iBaseResponseCallback.a(deviceCertChallengeRsp.getResultCode(), deviceCertChallengeRsp.getResultDesc());
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e(DeviceBindRightsManager.TAG, "getChallenge onFailure. throwable: ", th.toString());
                iBaseResponseCallback.a(-1, th.toString());
            }
        });
    }
}
