package com.huawei.operation.h5pro.jsmodules.device;

import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.FeedbackApi;
import com.huawei.health.device.callback.FeedbackCallback;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.operation.beans.MatterNotifyConfigBean;
import defpackage.coq;
import defpackage.cqj;
import defpackage.edc;
import defpackage.eec;
import defpackage.eee;
import defpackage.eef;
import defpackage.eeg;
import defpackage.ffv;
import defpackage.iov;
import defpackage.nio;
import defpackage.njy;
import defpackage.oqn;
import defpackage.qhq;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.function.Predicate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MatterDataJsApi extends CommonDataJsApi {
    public static final String APP_PACKAGE_NAME = "hw.unitedevice.cgm";
    private static final int CONFIG_ACTION_MODIFY = 1;
    private static final int CONFIG_ACTION_QUERY = 2;
    private static final double DEFAULT_ONE_HOUR = 60.0d;
    public static final String MATTER_PACKAGE_NAME = "hw.device.bloodglucose";
    public static final String MODEL = "MatterData";
    private static final String RELEASE_TAG = "DEVMGR_MatterDataJsApi";
    private static final String TAG = "MatterDataJsApi";

    @JavascriptInterface
    public void getBloodGlucoseActive(long j, String str) {
    }

    @JavascriptInterface
    public void switchBloodGlucoseActive(long j, String str) {
    }

    @JavascriptInterface
    public void setNotifyConfig(long j, String str) {
        ReleaseLogUtil.c(RELEASE_TAG, "setNotifyConfig callbackId ", Long.valueOf(j));
        ReleaseLogUtil.c(RELEASE_TAG, "setNotifyConfig param ", str);
        DeviceInfo deviceInfo = getDeviceInfo(str);
        if (deviceInfo == null) {
            onFailureCallback(j, "targetDevice is null");
            return;
        }
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        MatterNotifyConfigBean matterNotifyConfigBean = (MatterNotifyConfigBean) new Gson().fromJson(str, MatterNotifyConfigBean.class);
        int type = matterNotifyConfigBean.getType();
        if (type == 7) {
            SharedPreferenceManager.e(this.mContext, String.valueOf(10008), nio.e(deviceMac) + "DEVICE_ERROR", matterNotifyConfigBean.isEnable() ? "1" : "0", new StorageParams());
            onSuccessCallback(j);
            return;
        }
        if (type != 8) {
            if (type == 9) {
                String strE = ffv.e(MatterDataContans.KEY_UNIT_TYPE, Double.valueOf(matterNotifyConfigBean.getThreshold()));
                saveUnit(strE);
                sendUnit(strE, deviceInfo, j);
                return;
            } else {
                setNotifyConfigInfo(matterNotifyConfigBean, deviceInfo, j);
                onSuccessCallback(j);
                return;
            }
        }
        SharedPreferenceManager.e(this.mContext, String.valueOf(10008), nio.e(deviceMac) + "DEVICE_CONNECT", matterNotifyConfigBean.isEnable() ? "1" : "0", new StorageParams());
        SharedPreferenceManager.e(this.mContext, String.valueOf(10008), nio.e(deviceMac) + "DEVICE_CONNECT_TH", matterNotifyConfigBean.getThreshold() <= 0.1d ? "60" : Double.toString(matterNotifyConfigBean.getThreshold()), new StorageParams());
        onSuccessCallback(j);
    }

    private void sendUnit(String str, DeviceInfo deviceInfo, long j) {
        setSampleConfigInfo(Long.parseLong(MatterDataContans.TYPE_HEALTH), str, deviceInfo, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveUnit(String str) {
        qhq.d(MatterDataContans.TYPE_HEALTH, MatterDataContans.CONFIG_ID_UNIT_TYPE, str, new HiDataOperateListener() { // from class: com.huawei.operation.h5pro.jsmodules.device.MatterDataJsApi.1
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.b(MatterDataJsApi.TAG, "save unit errorCode: ", Integer.valueOf(i));
            }
        }, System.currentTimeMillis());
    }

    private void setNotifyConfigInfo(MatterNotifyConfigBean matterNotifyConfigBean, DeviceInfo deviceInfo, long j) {
        switch (matterNotifyConfigBean.getType()) {
            case 1:
                setHypoglycemia(matterNotifyConfigBean, deviceInfo, j);
                break;
            case 2:
                setHyperglycemia(matterNotifyConfigBean, deviceInfo, j);
                break;
            case 3:
                setUrgentHypoglycemia(matterNotifyConfigBean, deviceInfo, j);
                break;
            case 4:
                setAboutHypoglycemic(matterNotifyConfigBean, deviceInfo, j);
                break;
            case 5:
                setRise(matterNotifyConfigBean, deviceInfo, j);
                break;
            case 6:
                setFall(matterNotifyConfigBean, deviceInfo, j);
                break;
            default:
                LogUtil.e(TAG, "other state");
                break;
        }
    }

    private void setHypoglycemia(MatterNotifyConfigBean matterNotifyConfigBean, DeviceInfo deviceInfo, long j) {
        HashMap map = new HashMap();
        map.put(MatterDataContans.HYPOGLYCEMIA_SWITCH_KEY, matterNotifyConfigBean.isEnable() ? "1" : "0");
        setSampleConfigInfo(900300027L, new Gson().toJson(map), deviceInfo, j);
        map.clear();
        map.put(MatterDataContans.HYPOGLYCEMIA_THRESHOLD_KEY, matterNotifyConfigBean.getThreshold() + "");
        setSampleConfigInfo(900300028L, new Gson().toJson(map), deviceInfo, j);
    }

    private void setHyperglycemia(MatterNotifyConfigBean matterNotifyConfigBean, DeviceInfo deviceInfo, long j) {
        HashMap map = new HashMap();
        map.put(MatterDataContans.HYPERGLYCEMIA_SWITCH_KEY, matterNotifyConfigBean.isEnable() ? "1" : "0");
        setSampleConfigInfo(900300029L, new Gson().toJson(map), deviceInfo, j);
        map.clear();
        map.put(MatterDataContans.HYPERGLYCEMIA_THRESHOLD_KEY, matterNotifyConfigBean.getThreshold() + "");
        setSampleConfigInfo(900300030L, new Gson().toJson(map), deviceInfo, j);
    }

    private void setUrgentHypoglycemia(MatterNotifyConfigBean matterNotifyConfigBean, DeviceInfo deviceInfo, long j) {
        HashMap map = new HashMap();
        map.put(MatterDataContans.URGENT_HYPOGLYCEMIA_SWITCH_KEY, matterNotifyConfigBean.isEnable() ? "1" : "0");
        setSampleConfigInfo(900300024L, new Gson().toJson(map), deviceInfo, j);
    }

    private void setAboutHypoglycemic(MatterNotifyConfigBean matterNotifyConfigBean, DeviceInfo deviceInfo, long j) {
        HashMap map = new HashMap();
        map.put(MatterDataContans.ABOUT_HYPOGLYCEMIC_SWITCH_KEY, matterNotifyConfigBean.isEnable() ? "1" : "0");
        setSampleConfigInfo(900300025L, new Gson().toJson(map), deviceInfo, j);
        map.clear();
        map.put(MatterDataContans.ABOUT_HYPOGLYCEMIC_THRESHOLD_KEY, matterNotifyConfigBean.getThreshold() + "");
        setSampleConfigInfo(900300026L, new Gson().toJson(map), deviceInfo, j);
    }

    private void setRise(MatterNotifyConfigBean matterNotifyConfigBean, DeviceInfo deviceInfo, long j) {
        HashMap map = new HashMap();
        map.put(MatterDataContans.RISE_SWITCH_KEY, matterNotifyConfigBean.isEnable() ? "1" : "0");
        setSampleConfigInfo(900300031L, new Gson().toJson(map), deviceInfo, j);
        map.clear();
        map.put(MatterDataContans.RISE_SPEED_THRESHOLD_KEY, matterNotifyConfigBean.getSpeedThreshold() + "");
        setSampleConfigInfo(900300032L, new Gson().toJson(map), deviceInfo, j);
        map.clear();
        map.put(MatterDataContans.RISE_THRESHOLD_KEY, matterNotifyConfigBean.getThreshold() + "");
        setSampleConfigInfo(900300033L, new Gson().toJson(map), deviceInfo, j);
    }

    private void setFall(MatterNotifyConfigBean matterNotifyConfigBean, DeviceInfo deviceInfo, long j) {
        HashMap map = new HashMap();
        map.put(MatterDataContans.FALL_SWITCH_KEY, matterNotifyConfigBean.isEnable() ? "1" : "0");
        setSampleConfigInfo(900300034L, new Gson().toJson(map), deviceInfo, j);
        map.clear();
        map.put(MatterDataContans.FALL_SPEED_THRESHOLD_KEY, matterNotifyConfigBean.getSpeedThreshold() + "");
        setSampleConfigInfo(900300035L, new Gson().toJson(map), deviceInfo, j);
        map.clear();
        map.put(MatterDataContans.FALL_THRESHOLD_KEY, matterNotifyConfigBean.getThreshold() + "");
        setSampleConfigInfo(900300036L, new Gson().toJson(map), deviceInfo, j);
    }

    private void setSampleConfigInfo(long j, String str, DeviceInfo deviceInfo, long j2) {
        eeg eegVar = new eeg();
        eegVar.b(j);
        eegVar.b(1);
        eegVar.d(oqn.a(oqn.c(str)));
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        if (edc.e().sendSampleConfigCommand(deviceInfo, constructSampleConfig(arrayList), TAG)) {
            onSuccessCallback(j2);
        } else {
            onFailureCallback(j2, "sendSampleConfigCommand err ");
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        LogUtil.b(TAG, "MACA js onDestroy");
        DeviceInfo macaDeviceInfo = getMacaDeviceInfo();
        if (macaDeviceInfo != null) {
            LogUtil.b(TAG, "onDestroy unregister maca data");
            edc.e().sendSampleEventCommand(macaDeviceInfo, constructSampleConfig(0), TAG);
        }
    }

    @JavascriptInterface
    public void getNotifyConfig(final long j, String str) {
        ReleaseLogUtil.c(RELEASE_TAG, "getNotifyConfig callbackId ", Long.valueOf(j));
        ReleaseLogUtil.c(RELEASE_TAG, "getNotifyConfig param ", str);
        DeviceInfo deviceInfo = getDeviceInfo(str);
        if (deviceInfo == null) {
            onFailureCallback(j, "targetDevice is null");
            return;
        }
        final HashSet hashSet = new HashSet();
        edc.e().registerDeviceSampleListener(APP_PACKAGE_NAME, new DataReceiveCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.MatterDataJsApi$$ExternalSyntheticLambda1
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public final void onDataReceived(int i, DeviceInfo deviceInfo2, eec eecVar) {
                this.f$0.m1602x89df3397(j, hashSet, i, deviceInfo2, eecVar);
            }
        }, TAG);
        getDeviceSwitch(hashSet, deviceInfo.getDeviceIdentify());
        getUnitType(hashSet);
        ArrayList arrayList = new ArrayList(5);
        for (int length = MatterDataContans.NOTIFY_CONFIG_L_IST.length - 1; length >= 0; length--) {
            eeg eegVar = new eeg();
            eegVar.b(MatterDataContans.NOTIFY_CONFIG_L_IST[length]);
            eegVar.b(2);
            arrayList.add(eegVar);
        }
        edc.e().sendSampleConfigCommand(deviceInfo, constructSampleConfig(arrayList), TAG);
    }

    /* JADX INFO: renamed from: lambda$getNotifyConfig$0$com-huawei-operation-h5pro-jsmodules-device-MatterDataJsApi, reason: not valid java name */
    /* synthetic */ void m1602x89df3397(long j, Set set, int i, DeviceInfo deviceInfo, eec eecVar) {
        if (eecVar instanceof eef) {
            notifyConfig(eecVar, j, set);
        }
    }

    private void getUnitType(Set<MatterNotifyConfigBean> set) {
        final MatterNotifyConfigBean matterNotifyConfigBean = new MatterNotifyConfigBean();
        matterNotifyConfigBean.setType(9);
        matterNotifyConfigBean.setEnable(true);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(MatterDataContans.CONFIG_ID_UNIT_TYPE);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: com.huawei.operation.h5pro.jsmodules.device.MatterDataJsApi.2
            /* JADX WARN: Code duplicated, block: B:9:0x005e  */
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.b(MatterDataJsApi.TAG, "onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (!njy.e(list) && njy.b(obj, HiSampleConfig.class)) {
                        String strA = ffv.a(((HiSampleConfig) list.get(0)).getConfigData(), MatterDataContans.KEY_UNIT_TYPE);
                        matterNotifyConfigBean.setThreshold(Double.parseDouble(strA));
                        LogUtil.b(MatterDataJsApi.TAG, "unit: ", Double.valueOf(Double.parseDouble(strA)), ", isMmol : ", Boolean.valueOf(Objects.equals(strA, "0")));
                    } else {
                        matterNotifyConfigBean.setThreshold(0.0d);
                        MatterDataJsApi.this.saveUnit(ffv.e(MatterDataContans.KEY_UNIT_TYPE, Double.valueOf(0.0d)));
                    }
                } else {
                    matterNotifyConfigBean.setThreshold(0.0d);
                    MatterDataJsApi.this.saveUnit(ffv.e(MatterDataContans.KEY_UNIT_TYPE, Double.valueOf(0.0d)));
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.b(MatterDataJsApi.TAG, "onResultIntent errorCode: ", Integer.valueOf(i2), ", data: ", obj);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            LogUtil.e(TAG, "countDown interrupt");
        }
        set.add(matterNotifyConfigBean);
    }

    private void notifyConfig(eec eecVar, long j, Set<MatterNotifyConfigBean> set) {
        List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
        if (coq.d(configInfoList)) {
            LogUtil.b(TAG, "list is empty");
            return;
        }
        LogUtil.b(TAG, "configData: ", Integer.valueOf(configInfoList.size()));
        for (eeg eegVar : configInfoList) {
            if (eegVar != null) {
                String str = new String(eegVar.e());
                LogUtil.b(TAG, "configData: ", str);
                switch ((int) eegVar.c()) {
                    case MatterDataContans.CONFIG_ID_URGENT_HYPOGLYCEMIA_SWITCH /* 900300024 */:
                        getUrgentHypoglycemiaSwitch(str, set);
                        break;
                    case MatterDataContans.CONFIG_ID_ABOUT_HYPOGLYCEMIA_SWITCH /* 900300025 */:
                        getAboutHypoglycemicSwitch(str, set);
                        break;
                    case MatterDataContans.CONFIG_ID_ABOUT_HYPOGLYCEMIA_THRESHOLD /* 900300026 */:
                        getAboutHypoglycemicThreshold(str, set);
                        break;
                    case MatterDataContans.CONFIG_ID_HYPOGLYCEMIA_SWITCH /* 900300027 */:
                        getHypoglycemiaSwitch(str, set);
                        break;
                    case MatterDataContans.CONFIG_ID_HYPOGLYCEMIA_THRESHOLD /* 900300028 */:
                        getHypoglycemiaThreshold(str, set);
                        break;
                    case MatterDataContans.CONFIG_ID_HYPERGLYCEMIA_SWITCH /* 900300029 */:
                        getHyperglycemiaSwitch(str, set);
                        break;
                    case MatterDataContans.CONFIG_ID_HYPERGLYCEMIA_THRESHOLD /* 900300030 */:
                        getHyperglycemiaThreshold(str, set);
                        break;
                    case MatterDataContans.CONFIG_ID_RISE_SWITCH /* 900300031 */:
                        getRiseSwitch(str, set);
                        break;
                    case MatterDataContans.CONFIG_ID_RISE_SPEED_THRESHOLD /* 900300032 */:
                        getRiseSpeedThreshold(str, set);
                        break;
                    case MatterDataContans.CONFIG_ID_RISE_THRESHOLD /* 900300033 */:
                        getRiseThreshold(str, set);
                        break;
                    case MatterDataContans.CONFIG_ID_FAIL_SWITCH /* 900300034 */:
                        getFallSwitch(str, set);
                        break;
                    case MatterDataContans.CONFIG_ID_FAIL_SPEED_THRESHOLD /* 900300035 */:
                        getFallSpeedThreshold(str, set);
                        break;
                    case MatterDataContans.CONFIG_ID_FAIL_THRESHOLD /* 900300036 */:
                        getFallThreshold(str, set);
                        break;
                    default:
                        LogUtil.e(TAG, "other config");
                        break;
                }
            }
        }
        LogUtil.b(TAG, "getNotifyConfig configBeanSet:", new Gson().toJson(set));
        onSuccessCallback(j, new Gson().toJson(set));
    }

    private void getDeviceSwitch(Set<MatterNotifyConfigBean> set, String str) {
        MatterNotifyConfigBean matterNotifyConfigBean = new MatterNotifyConfigBean();
        String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10008), nio.e(str) + "DEVICE_ERROR");
        boolean z = true;
        matterNotifyConfigBean.setEnable(TextUtils.isEmpty(strE) || strE.equals("1"));
        matterNotifyConfigBean.setType(7);
        set.add(matterNotifyConfigBean);
        MatterNotifyConfigBean matterNotifyConfigBean2 = new MatterNotifyConfigBean();
        String strE2 = SharedPreferenceManager.e(this.mContext, String.valueOf(10008), nio.e(str) + "DEVICE_CONNECT");
        String strE3 = SharedPreferenceManager.e(this.mContext, String.valueOf(10008), nio.e(str) + "DEVICE_CONNECT_TH");
        if (!TextUtils.isEmpty(strE2) && !strE2.equals("1")) {
            z = false;
        }
        matterNotifyConfigBean2.setEnable(z);
        matterNotifyConfigBean2.setType(8);
        try {
            matterNotifyConfigBean2.setThreshold(Double.parseDouble(strE3));
        } catch (NumberFormatException unused) {
            LogUtil.e(TAG, "parse th failed " + strE3);
            matterNotifyConfigBean2.setThreshold(DEFAULT_ONE_HOUR);
        }
        set.add(matterNotifyConfigBean2);
    }

    private void getHypoglycemiaSwitch(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean configBean = getConfigBean(1, set);
        configBean.setEnable(DevicePairUtils.getJsonValue(MatterDataContans.HYPOGLYCEMIA_SWITCH_KEY, str).equals("1"));
        set.add(configBean);
    }

    private void getHypoglycemiaThreshold(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean configBean = getConfigBean(1, set);
        configBean.setThreshold(Double.parseDouble(DevicePairUtils.getJsonValue(MatterDataContans.HYPOGLYCEMIA_THRESHOLD_KEY, str)));
        set.add(configBean);
    }

    private void getHyperglycemiaSwitch(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean configBean = getConfigBean(2, set);
        configBean.setEnable(DevicePairUtils.getJsonValue(MatterDataContans.HYPERGLYCEMIA_SWITCH_KEY, str).equals("1"));
        set.add(configBean);
    }

    private void getHyperglycemiaThreshold(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean configBean = getConfigBean(2, set);
        configBean.setThreshold(Double.parseDouble(DevicePairUtils.getJsonValue(MatterDataContans.HYPERGLYCEMIA_THRESHOLD_KEY, str)));
        set.add(configBean);
    }

    private void getUrgentHypoglycemiaSwitch(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean matterNotifyConfigBean = new MatterNotifyConfigBean();
        matterNotifyConfigBean.setType(3);
        matterNotifyConfigBean.setEnable(DevicePairUtils.getJsonValue(MatterDataContans.URGENT_HYPOGLYCEMIA_SWITCH_KEY, str).equals("1"));
        set.add(matterNotifyConfigBean);
    }

    private void getAboutHypoglycemicSwitch(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean configBean = getConfigBean(4, set);
        configBean.setEnable(DevicePairUtils.getJsonValue(MatterDataContans.ABOUT_HYPOGLYCEMIC_SWITCH_KEY, str).equals("1"));
        set.add(configBean);
    }

    private void getAboutHypoglycemicThreshold(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean configBean = getConfigBean(4, set);
        configBean.setThreshold(Double.parseDouble(DevicePairUtils.getJsonValue(MatterDataContans.ABOUT_HYPOGLYCEMIC_THRESHOLD_KEY, str)));
        set.add(configBean);
    }

    private void getRiseSwitch(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean configBean = getConfigBean(5, set);
        configBean.setEnable(DevicePairUtils.getJsonValue(MatterDataContans.RISE_SWITCH_KEY, str).equals("1"));
        set.add(configBean);
    }

    private void getRiseSpeedThreshold(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean configBean = getConfigBean(5, set);
        configBean.setSpeedThreshold(Double.parseDouble(DevicePairUtils.getJsonValue(MatterDataContans.RISE_SPEED_THRESHOLD_KEY, str)));
        set.add(configBean);
    }

    private void getRiseThreshold(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean configBean = getConfigBean(5, set);
        configBean.setThreshold(Double.parseDouble(DevicePairUtils.getJsonValue(MatterDataContans.RISE_THRESHOLD_KEY, str)));
        set.add(configBean);
    }

    private void getFallSwitch(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean configBean = getConfigBean(6, set);
        configBean.setEnable(DevicePairUtils.getJsonValue(MatterDataContans.FALL_SWITCH_KEY, str).equals("1"));
        set.add(configBean);
    }

    private void getFallSpeedThreshold(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean configBean = getConfigBean(6, set);
        configBean.setSpeedThreshold(Double.parseDouble(DevicePairUtils.getJsonValue(MatterDataContans.FALL_SPEED_THRESHOLD_KEY, str)));
        set.add(configBean);
    }

    private void getFallThreshold(String str, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean configBean = getConfigBean(6, set);
        configBean.setThreshold(Double.parseDouble(DevicePairUtils.getJsonValue(MatterDataContans.FALL_THRESHOLD_KEY, str)));
        set.add(configBean);
    }

    private MatterNotifyConfigBean getConfigBean(final int i, Set<MatterNotifyConfigBean> set) {
        MatterNotifyConfigBean matterNotifyConfigBeanOrElse = set.stream().filter(new Predicate() { // from class: com.huawei.operation.h5pro.jsmodules.device.MatterDataJsApi$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return MatterDataJsApi.lambda$getConfigBean$1(i, (MatterNotifyConfigBean) obj);
            }
        }).findAny().orElse(null);
        if (matterNotifyConfigBeanOrElse != null) {
            return matterNotifyConfigBeanOrElse;
        }
        MatterNotifyConfigBean matterNotifyConfigBean = new MatterNotifyConfigBean();
        matterNotifyConfigBean.setType(i);
        return matterNotifyConfigBean;
    }

    static /* synthetic */ boolean lambda$getConfigBean$1(int i, MatterNotifyConfigBean matterNotifyConfigBean) {
        return matterNotifyConfigBean.getType() == i;
    }

    private static eef constructSampleConfig(List<eeg> list) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName(APP_PACKAGE_NAME);
        eefVar.setWearPkgName(MATTER_PACKAGE_NAME);
        eefVar.setCommandId(1);
        eefVar.setConfigInfoList(list);
        return eefVar;
    }

    @Override // com.huawei.operation.h5pro.jsmodules.device.CommonDataJsApi
    @JavascriptInterface
    public void getDeviceInfo(long j, String str) throws Exception {
        try {
            super.getDeviceInfo(j, str);
        } catch (Exception e) {
            ReleaseLogUtil.d(RELEASE_TAG, "getDeviceInfo Exception:", DfxUtils.d(Thread.currentThread(), e));
            throw e;
        }
    }

    @JavascriptInterface
    public void subscribingRealTimeData(long j, String str) {
        ReleaseLogUtil.c(RELEASE_TAG, "subscribingRealTimeData callbackId ", Long.valueOf(j));
        ReleaseLogUtil.c(RELEASE_TAG, "subscribingRealTimeData param ", str);
        DeviceInfo deviceInfo = getDeviceInfo(str);
        if (getDeviceInfo(str) == null) {
            onFailureCallback(j, "targetDevice is null");
        } else if (edc.e().sendSampleEventCommand(deviceInfo, constructSampleConfig(1), TAG)) {
            onSuccessCallback(j);
        } else {
            onFailureCallback(j, "Event send fail");
        }
    }

    private eee constructSampleConfig(int i) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName(APP_PACKAGE_NAME);
        eeeVar.setWearPkgName(MATTER_PACKAGE_NAME);
        eeeVar.setCommandId(2);
        eeeVar.a(80030011L);
        eeeVar.a(0);
        eeeVar.e(new cqj().b(1, i).e());
        return eeeVar;
    }

    @JavascriptInterface
    public void unsubscribingRealTimeData(long j, String str) {
        ReleaseLogUtil.c(RELEASE_TAG, "unsubscribingRealTimeData callbackId ", Long.valueOf(j));
        ReleaseLogUtil.c(RELEASE_TAG, "unsubscribingRealTimeData param ", str);
        DeviceInfo deviceInfo = getDeviceInfo(str);
        if (getDeviceInfo(str) == null) {
            onFailureCallback(j, "targetDevice is null");
        } else if (edc.e().sendSampleEventCommand(deviceInfo, constructSampleConfig(0), TAG)) {
            onSuccessCallback(j);
        } else {
            onFailureCallback(j, "Event send fail");
        }
    }

    private String[] parseActiveData(String str) {
        return new String[0];
    }

    @JavascriptInterface
    public void getLogInfo(final long j, String str) {
        ReleaseLogUtil.c(RELEASE_TAG, "getLogInfo callbackId ", Long.valueOf(j));
        if (TextUtils.isEmpty(str)) {
            onFailureCallback(j, "param is null");
            return;
        }
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        if (TextUtils.isEmpty(deviceMac)) {
            onFailureCallback(j, "targetDevice is null");
            return;
        }
        FeedbackApi feedbackApi = (FeedbackApi) Services.d("MODULE_FEEDBACK", FeedbackApi.class);
        if (feedbackApi == null) {
            ReleaseLogUtil.d(RELEASE_TAG, "api is null");
            onFailureCallback(j, "api is null");
        } else {
            ReleaseLogUtil.c(RELEASE_TAG, "api.deviceBetaFeedback");
            feedbackApi.deviceBetaFeedback(deviceMac, new FeedbackCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.MatterDataJsApi.3
                @Override // com.huawei.health.device.callback.FeedbackCallback
                public void onSuccess() {
                    ReleaseLogUtil.c(MatterDataJsApi.RELEASE_TAG, "onSuccess");
                    MatterDataJsApi.this.onSuccessCallback(j);
                }

                @Override // com.huawei.health.device.callback.FeedbackCallback
                public void onFail(String str2) {
                    ReleaseLogUtil.c(MatterDataJsApi.RELEASE_TAG, "onFail msg = ", str2);
                    MatterDataJsApi.this.onFailureCallback(j, str2);
                }
            });
        }
    }

    @JavascriptInterface
    public void jumpToOtaPage(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.c(RELEASE_TAG, "jumpToOtaPage param is empty");
            onFailureCallback(j, "param is empty");
            return;
        }
        try {
            String strOptString = new JSONObject(str).optString(MatterDataContans.KEY_MAC_ADDRESS);
            if (TextUtils.isEmpty(strOptString)) {
                ReleaseLogUtil.c(RELEASE_TAG, "jumpToOtaPage deviceMac is empty");
                onFailureCallback(j, "deviceMac is empty");
                return;
            }
            onSuccessCallback(j);
            ReleaseLogUtil.c(RELEASE_TAG, "jumpToOtaPage success");
            Intent intent = new Intent();
            intent.setClassName(this.mContext, "com.huawei.ui.device.activity.update.UpdateVersionActivity");
            intent.putExtra("device_id", strOptString);
            iov.d(BaseApplication.j(), intent);
        } catch (JSONException e) {
            ReleaseLogUtil.c(RELEASE_TAG, "jumpToOtaPage jsonException ", ExceptionUtils.c(e));
            onFailureCallback(j, "param parse jsonException");
        }
    }
}
