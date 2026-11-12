package com.huawei.ui.main.stories.nps.npsstate;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.DeviceManagerCommonConfigApi;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiDataHiDeviceInfoListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.stories.nps.component.NpsApi;
import com.huawei.ui.main.stories.nps.component.NpsCommonUtil;
import com.huawei.ui.main.stories.nps.component.NpsConfig;
import com.huawei.ui.main.stories.nps.component.NpsSharePreferenceUtils;
import com.huawei.ui.main.stories.nps.harid.HagridNpsManager;
import defpackage.ddv;
import defpackage.ecu;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qrs;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes19.dex */
public class NpsUserShowController {
    private static final String CONTROL_NUM = "control_num";
    private static final long FIFTEEN_DAYS_MILLISECONDS = 1296000000;
    private static final Object LOCK = new Object();
    private static final int NEED_SURVEY = 1;
    private static final long NINETY_DAYS_MILLISECONDS = 7776000000L;
    private static final String NPS_ENTER_FALSE = "false";
    private static final String NPS_ENTER_TRUE = "true";
    private static final long ONE_DAY_TIME = 86400000;
    private static final long SEVENTY_FIVE_DAYS_MILLISECONDS = 6480000000L;
    private static final int SURVEY_TIME_ONE = 1;
    private static final int SURVEY_TIME_THREE = 3;
    private static final int SURVEY_TIME_TWO = 2;
    private static final String TAG = "NpsUserShowController";
    private static final long THIRTY_DAYS_MILLISECONDS = 2592000000L;
    private static final int UNNEED_SURVEY = 0;
    private static volatile String sConnectedWhitelistDevices = "";
    private static volatile NpsUserShowController sNpsUserShowController;
    private static String[] sSupportOverseasCountryCode;
    private Context mContext;
    private int mSurveyTime;

    private NpsUserShowController(Context context) {
        this.mContext = context;
    }

    public static NpsUserShowController getInstance(Context context) {
        NpsUserShowController npsUserShowController;
        synchronized (NpsUserShowController.class) {
            if (sNpsUserShowController == null) {
                synchronized (LOCK) {
                    if (sNpsUserShowController == null) {
                        sNpsUserShowController = new NpsUserShowController(context.getApplicationContext());
                    }
                }
            }
            npsUserShowController = sNpsUserShowController;
        }
        return npsUserShowController;
    }

    private boolean isNewBecomeOld(Context context, String str) {
        return NpsSharePreferenceUtils.getIsNewBecomeOld(context, str);
    }

    private void setNewBecomeOld(Context context, String str, boolean z) {
        NpsSharePreferenceUtils.setIsNewBecomeOld(context, str, z);
    }

    public NpsConfig readNpsConfig() throws Throwable {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(BaseApplication.getContext().getFilesDir().getCanonicalPath());
            sb.append(File.separator);
            sb.append("lightcloud");
            sb.append(File.separator);
            sb.append(Utils.o() ? "servicefwo" : "servicefw");
            String strQ = CommonUtil.q(sb.toString() + File.separator + "NPSConfig.txt");
            LogUtil.a(TAG, "readNpsConfig npsStr: NPSConfig.txt");
            try {
                return (NpsConfig) HiJsonUtil.d(strQ, NpsConfig.class);
            } catch (JsonSyntaxException e) {
                LogUtil.c(TAG, "readNpsConfig JsonSyntaxException, e is ", e.getMessage());
                return null;
            }
        } catch (IOException e2) {
            LogUtil.c(TAG, "getCanonicalPath suffix invalid,error:", e2.getMessage());
            return null;
        }
    }

    private boolean isTheNewUserHadConfigInfo(String str) {
        return !TextUtils.isEmpty(NpsSharePreferenceUtils.getNewUserNativeConfigStr(this.mContext, str));
    }

    private void generateNewUserConfigInfo(String str) {
        NativeConfigBean nativeConfigBean = new NativeConfigBean();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = FIFTEEN_DAYS_MILLISECONDS + jCurrentTimeMillis;
        nativeConfigBean.setHuidStr(str);
        nativeConfigBean.setShowTime(j);
        nativeConfigBean.setExpireTime(3888000000L + jCurrentTimeMillis);
        nativeConfigBean.setNeedSurvey(true);
        NativeConfigBean nativeConfigBean2 = new NativeConfigBean();
        long j2 = NINETY_DAYS_MILLISECONDS + jCurrentTimeMillis;
        nativeConfigBean2.setHuidStr(str);
        nativeConfigBean2.setShowTime(j2);
        nativeConfigBean.setExpireTime(jCurrentTimeMillis + 10368000000L);
        nativeConfigBean2.setNeedSurvey(true);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        LogUtil.a(TAG, " new user first survey time: ", simpleDateFormat.format(Long.valueOf(j)), " second survey time: ", simpleDateFormat.format(Long.valueOf(j2)));
        HashMap map = new HashMap();
        map.put(1, nativeConfigBean);
        map.put(2, nativeConfigBean2);
        NativeConfigMap nativeConfigMap = new NativeConfigMap();
        nativeConfigMap.setNewUserConfig(map);
        NpsSharePreferenceUtils.setNewUserNativeConfig(this.mContext, str, HiJsonUtil.d(nativeConfigMap));
    }

    public Map<Integer, NativeConfigBean> getNewUserConfigInfo(String str) {
        return NpsSharePreferenceUtils.getNewUserNativeConfig(this.mContext, str).getNewUserConfig();
    }

    private void saveNewUserConfigInfo(String str, int i, NativeConfigBean nativeConfigBean) {
        Map<Integer, NativeConfigBean> newUserConfigInfo = getNewUserConfigInfo(str);
        newUserConfigInfo.put(Integer.valueOf(i), nativeConfigBean);
        NativeConfigMap nativeConfigMap = new NativeConfigMap();
        nativeConfigMap.setNewUserConfig(newUserConfigInfo);
        NpsSharePreferenceUtils.setNewUserNativeConfig(this.mContext, str, HiJsonUtil.d(nativeConfigMap));
    }

    private int getNeedSurveyBatchs(String str) {
        Map<Integer, NativeConfigBean> newUserConfigInfo = getNewUserConfigInfo(str);
        if (newUserConfigInfo == null) {
            return 0;
        }
        NativeConfigBean nativeConfigBean = newUserConfigInfo.get(1);
        if (nativeConfigBean != null && nativeConfigBean.isNeedSurvey()) {
            LogUtil.a(TAG, "getNeedSurveyBatchs() return 1 bean.isNeedSurvey: ", Boolean.valueOf(nativeConfigBean.isNeedSurvey()));
            return 1;
        }
        NativeConfigBean nativeConfigBean2 = newUserConfigInfo.get(2);
        if (nativeConfigBean2 == null || !nativeConfigBean2.isNeedSurvey()) {
            return 0;
        }
        LogUtil.a(TAG, "getNeedSurveyBatchs() return 2 bean.isNeedSurvey: ", Boolean.valueOf(nativeConfigBean2.isNeedSurvey()));
        return 2;
    }

    private boolean isNewUser(String str) {
        return "done".equals(str);
    }

    private boolean isTheOldUserHadConfigInfo(String str) {
        return NpsSharePreferenceUtils.getOldUserNativeConfig(this.mContext, str).isHasNativeConfig();
    }

    private void generateOldUserConfigInfo(NpsConfig npsConfig, String str, String str2) {
        NativeConfigBean nativeConfigBean = new NativeConfigBean();
        int[] iArr = npsConfig.getNeedInvestigate().get(Integer.valueOf(generateNumberFromHuid(str)));
        int iE = CommonUtil.e(BaseApplication.getContext());
        String healthVersion = npsConfig.getHealthVersion();
        LogUtil.a(TAG, "generateOldUserConfigInfo HealthVersion: ", healthVersion);
        if (TextUtils.isEmpty(healthVersion)) {
            healthVersion = "0";
        }
        if (iArr != null && iE >= qrs.a(healthVersion)) {
            nativeConfigBean.setHuidStr(str2);
            nativeConfigBean.setNeedSurvey(true);
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + (((long) (iArr[0] + (SecureRandom.getInstanceStrong().nextInt(iArr[1] - iArr[0]) - 1))) * 86400000);
                boolean zIsNewBecomeOld = isNewBecomeOld(this.mContext, str2);
                LogUtil.a(TAG, "is new turn to old user? ", Boolean.valueOf(zIsNewBecomeOld));
                if (zIsNewBecomeOld) {
                    jCurrentTimeMillis += NINETY_DAYS_MILLISECONDS;
                    setNewBecomeOld(this.mContext, str2, false);
                }
                LogUtil.a(TAG, "the old user config survey time is: ", new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(Long.valueOf(jCurrentTimeMillis)));
                nativeConfigBean.setShowTime(jCurrentTimeMillis);
                nativeConfigBean.setExpireTime(jCurrentTimeMillis + THIRTY_DAYS_MILLISECONDS);
            } catch (NoSuchMethodError | NoSuchAlgorithmException e) {
                nativeConfigBean.setNeedSurvey(false);
                LogUtil.c(TAG, "generateOldUserConfigInfo: exception -> " + e.getMessage());
            }
        } else {
            nativeConfigBean.setNeedSurvey(false);
        }
        nativeConfigBean.setHasNativeConfig(true);
        NpsSharePreferenceUtils.setOldUserNativeConfig(this.mContext, str, HiJsonUtil.d(nativeConfigBean));
    }

    private int generateNumberFromHuid(String str) {
        char[] charArray = str.toCharArray();
        for (int length = charArray.length - 1; length >= 0; length--) {
            String strValueOf = String.valueOf(charArray[length]);
            if (qrs.d(strValueOf)) {
                return qrs.a(strValueOf);
            }
        }
        return 0;
    }

    public NativeConfigBean getOldUserConfigInfo(String str) {
        return NpsSharePreferenceUtils.getOldUserNativeConfig(this.mContext, str);
    }

    private void saveOldUserConfigInfo(String str, String str2) {
        NpsSharePreferenceUtils.setOldUserNativeConfig(this.mContext, str, str2);
    }

    private DeviceInfo getConnectedOrPairedDeviceInfo() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, TAG);
        if (njy.e(deviceList)) {
            LogUtil.d(TAG, "getCurrentDeviceInfo() deviceInfoList is empty");
            return null;
        }
        LogUtil.a(TAG, "getCurrentDeviceInfo() deviceInfoList.size() = ", Integer.valueOf(deviceList.size()));
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo == null) {
                LogUtil.d(TAG, "deviceInfo is null");
            } else if (deviceInfo.getDeviceActiveState() == 1) {
                return deviceInfo;
            }
        }
        LogUtil.a(TAG, "getCurrentDeviceInfo() deviceInfo's ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE");
        return null;
    }

    public int getSurveyTime() {
        return this.mSurveyTime;
    }

    private boolean isCheckShowNps(NativeConfigBean nativeConfigBean, String str, int i) {
        if (nativeConfigBean == null) {
            LogUtil.d(TAG, "isCheckShowNps configBean == null");
            return false;
        }
        if (!nativeConfigBean.isNeedSurvey()) {
            LogUtil.a(TAG, "isCheckShowNps the survey is not need surveyed");
            return false;
        }
        long expireTime = nativeConfigBean.getExpireTime();
        if (expireTime == 0) {
            expireTime = nativeConfigBean.getShowTime() + THIRTY_DAYS_MILLISECONDS;
            nativeConfigBean.setExpireTime(expireTime);
            setTheNpsEnterUnSee(str, i, nativeConfigBean);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < nativeConfigBean.getShowTime()) {
            LogUtil.d(TAG, "isCheckShowNps the survey time is not achieve!");
            return false;
        }
        if (jCurrentTimeMillis <= expireTime) {
            LogUtil.a(TAG, "isCheckShow show the nps enter: ", true);
            return true;
        }
        LogUtil.a(TAG, "isCheckShow is expired");
        nativeConfigBean.setNeedSurvey(false);
        setTheNpsEnterUnSee(str, i, nativeConfigBean);
        return false;
    }

    private void setTheNpsEnterUnSee(String str, int i, NativeConfigBean nativeConfigBean) {
        if (i == 1 || i == 2) {
            saveNewUserConfigInfo(str, i, nativeConfigBean);
        } else {
            saveOldUserConfigInfo(str, HiJsonUtil.d(nativeConfigBean));
        }
    }

    public void setTheSurveyUnNeeded(int i) {
        NpsConfig npsConfig;
        String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1011);
        LogUtil.a(TAG, "setTheSurveyUnNeeded surveyTime: ", Integer.valueOf(i));
        if (TextUtils.isEmpty(accountInfo)) {
            return;
        }
        if (i <= 2 && i > 0) {
            NativeConfigBean nativeConfigBean = getNewUserConfigInfo(accountInfo).get(Integer.valueOf(i));
            LogUtil.a(TAG, "setTheSurveyUnNeeded() newBean.isNeedSurvey: ", Boolean.valueOf(nativeConfigBean.isNeedSurvey()));
            if (i == 2) {
                LogUtil.a(TAG, " surveyTime == 2, new user turn to old user");
                setNewBecomeOld(this.mContext, accountInfo, true);
            }
            nativeConfigBean.setNeedSurvey(false);
            setTheNpsEnterUnSee(accountInfo, i, nativeConfigBean);
        }
        if (i != 3 || (npsConfig = readNpsConfig()) == null) {
            return;
        }
        String str = npsConfig.getVersion() + accountInfo;
        NativeConfigBean oldUserConfigInfo = getOldUserConfigInfo(str);
        oldUserConfigInfo.setNeedSurvey(false);
        setTheNpsEnterUnSee(str, i, oldUserConfigInfo);
    }

    public boolean isShowNps() {
        return isSendNps();
    }

    private int getControlNum(String str) {
        int iC = SharedPreferenceManager.c(String.valueOf(10004), CONTROL_NUM + str, 0);
        if (iC != 0) {
            return iC;
        }
        int iNextInt = new SecureRandom().nextInt(100) + 1;
        SharedPreferenceManager.d(String.valueOf(10004), CONTROL_NUM + str, iNextInt);
        return iNextInt;
    }

    private boolean isInterceptByAppNewNpsConfig(String str) {
        AppNewNpsConfig appNewNpsConfig = (AppNewNpsConfig) ((DeviceManagerCommonConfigApi) Services.b("Module_Device_Feature", DeviceManagerCommonConfigApi.class)).getConfig("appNewNPS", AppNewNpsConfig.class);
        if (appNewNpsConfig == null) {
            LogUtil.a(TAG, "isInterceptByAppNewNpsConfig appNewNpsConfig is null");
            return isInterceptDeviceOrPhoneUser();
        }
        AppNewNpsConfig.DeviceConfig emuiConfig = CommonUtil.bg() ? appNewNpsConfig.getEmuiConfig() : appNewNpsConfig.getAndroidConfig();
        if (emuiConfig == null) {
            LogUtil.a(TAG, "isInterceptByAppNewNpsConfig deviceConfig is null");
            return isInterceptDeviceOrPhoneUser();
        }
        LogUtil.a(TAG, "isInterceptByAppNewNpsConfig deviceConfig = ", emuiConfig.toString());
        if (emuiConfig.isAllOpen()) {
            return false;
        }
        List<String> hiLinkDeviceIdList = NpsCommonUtil.getHiLinkDeviceIdList();
        if (njy.e(hiLinkDeviceIdList)) {
            return isInterceptByWatchOrBandDevice();
        }
        if (hiLinkDeviceIdList.size() == 1) {
            return isInterceptSingleDeviceNewNps(hiLinkDeviceIdList.get(0), emuiConfig, str);
        }
        return isInterceptMultipleDevicesNewNps(hiLinkDeviceIdList, emuiConfig, str);
    }

    private boolean isInterceptByWatchOrBandDevice() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthManager.d(BaseApplication.getContext()).readDeviceInfo(new HiDataHiDeviceInfoListener() { // from class: com.huawei.ui.main.stories.nps.npsstate.NpsUserShowController$$ExternalSyntheticLambda3
            @Override // com.huawei.hihealth.data.listener.HiDataHiDeviceInfoListener
            public final void onResult(List list) {
                NpsUserShowController.lambda$isInterceptByWatchOrBandDevice$0(atomicBoolean, countDownLatch, list);
            }
        });
        try {
            if (!countDownLatch.await(30L, TimeUnit.SECONDS)) {
                LogUtil.c(TAG, "isInterceptByWatchOrBandDevice await timeout");
            }
        } catch (InterruptedException unused) {
            LogUtil.c(TAG, "isInterceptByWatchOrBandDevice InterruptedException: ");
        }
        return atomicBoolean.get();
    }

    static /* synthetic */ void lambda$isInterceptByWatchOrBandDevice$0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, List list) {
        if (!njy.e(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HiDeviceInfo hiDeviceInfo = (HiDeviceInfo) it.next();
                if (hiDeviceInfo != null) {
                    String deviceName = hiDeviceInfo.getDeviceName();
                    if (!TextUtils.isEmpty(deviceName) && (deviceName.contains("HUAWEI WATCH") || deviceName.contains("HUAWEI Band"))) {
                        LogUtil.a(TAG, "isInterceptByWatchOrBandDevice found watch/band device: ", deviceName);
                        atomicBoolean.set(true);
                        break;
                    }
                }
            }
        }
        countDownLatch.countDown();
    }

    private boolean isInterceptSingleDeviceNewNps(String str, AppNewNpsConfig.DeviceConfig deviceConfig, String str2) {
        List<AppNewNpsConfig.ControlDeviceItem> deviceBlackList = deviceConfig.getDeviceBlackList();
        List<AppNewNpsConfig.ControlDeviceItem> deviceWhiteList = deviceConfig.getDeviceWhiteList();
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int controlNum = getControlNum(str2);
        if (!njy.e(deviceBlackList)) {
            for (AppNewNpsConfig.ControlDeviceItem controlDeviceItem : deviceBlackList) {
                if (controlDeviceItem != null && !njy.e(controlDeviceItem.getDevice()) && controlDeviceItem.getDevice().contains(str)) {
                    if (controlNum > controlDeviceItem.getControl()) {
                        break;
                    }
                    LogUtil.a(TAG, "isInterceptSingleDeviceNewNps blackList intercept, device=", str, " controlNum=", Integer.valueOf(controlNum), " control=", Integer.valueOf(controlDeviceItem.getControl()));
                    return true;
                }
            }
            return false;
        }
        if (njy.e(deviceWhiteList)) {
            return true;
        }
        for (AppNewNpsConfig.ControlDeviceItem controlDeviceItem2 : deviceWhiteList) {
            if (controlDeviceItem2 != null && !njy.e(controlDeviceItem2.getDevice()) && controlDeviceItem2.getDevice().contains(str)) {
                if (controlNum > controlDeviceItem2.getControl()) {
                    LogUtil.a(TAG, "isInterceptSingleDeviceNewNps whiteList intercept, device=", str, " controlNum=", Integer.valueOf(controlNum), " control=", Integer.valueOf(controlDeviceItem2.getControl()));
                    break;
                }
                return false;
            }
        }
        return true;
    }

    private boolean isInterceptMultipleDevicesNewNps(List<String> list, AppNewNpsConfig.DeviceConfig deviceConfig, String str) {
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2) && !isInterceptSingleDeviceNewNps(str2, deviceConfig, str)) {
                return false;
            }
        }
        return true;
    }

    private boolean isInterceptDeviceOrPhoneUser() {
        if (!HagridNpsManager.getInstance().isBindWifiDevice()) {
            return NpsCommonUtil.isDeviceUser();
        }
        LogUtil.a(TAG, "isInterceptDeviceOrPhoneUser: isBindWifiDevice");
        return true;
    }

    private boolean isInterceptedCountry() {
        boolean zL = LanguageUtil.l(this.mContext);
        if (!Utils.o()) {
            return !zL;
        }
        LogUtil.e(TAG, "isInterceptedCountry: isOversea -> ", true);
        String[] strArr = sSupportOverseasCountryCode;
        if (strArr == null || strArr.length == 0) {
            sSupportOverseasCountryCode = new String[]{"GB", "FR", "DE", "IT", "PL", "ES", "TR"};
        }
        final String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1010);
        if (Arrays.stream(sSupportOverseasCountryCode).anyMatch(new Predicate() { // from class: com.huawei.ui.main.stories.nps.npsstate.NpsUserShowController$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((String) obj).equalsIgnoreCase(accountInfo);
            }
        })) {
            return false;
        }
        LogUtil.e(TAG, "isInterceptedCountry: userCountryCode -> ", accountInfo);
        return true;
    }

    private boolean isSendNps() throws Throwable {
        final String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e(TAG, "isShowNps huidStr is no char: ", false);
            return false;
        }
        if (isInterceptedCountry()) {
            LogUtil.e(TAG, "isShowNps isInterceptedCountry: ", true);
            return false;
        }
        if (qrs.ah(this.mContext)) {
            LogUtil.a(TAG, "isShowNps isPad");
            return false;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.nps.npsstate.NpsUserShowController$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1734xf84bfb5f(accountInfo);
            }
        });
        String isInteractDeviceUser = NpsCommonUtil.getIsInteractDeviceUser(accountInfo);
        if (!NpsCommonUtil.isValidBoolean(isInteractDeviceUser)) {
            LogUtil.a(TAG, "isShowNps isInteractDeviceUser is null");
            return false;
        }
        if (Boolean.parseBoolean(isInteractDeviceUser)) {
            LogUtil.a(TAG, "isShowNps isInterceptByAppNpsConfig: ", true);
            return false;
        }
        Map<Integer, NativeConfigBean> newUserConfigInfo = getNewUserConfigInfo(accountInfo);
        if (newUserConfigInfo != null) {
            if (isCheckShowNps(newUserConfigInfo.get(1), accountInfo, 1)) {
                LogUtil.a(TAG, " NpsUserShowController isShow nps time 1 return true");
                this.mSurveyTime = 1;
                return true;
            }
            if (isCheckShowNps(newUserConfigInfo.get(2), accountInfo, 2)) {
                LogUtil.a(TAG, " NpsUserShowController isShow nps time 2 return true");
                this.mSurveyTime = 2;
                return true;
            }
        }
        NpsConfig npsConfig = readNpsConfig();
        if (npsConfig == null) {
            LogUtil.d(TAG, "isShowNps the config == null ");
            return false;
        }
        if (!isCheckShowNps(getOldUserConfigInfo(npsConfig.getVersion() + accountInfo), npsConfig.getVersion() + accountInfo, 3)) {
            return false;
        }
        this.mSurveyTime = 3;
        LogUtil.a(TAG, "isShowNps NpsUserShowController isShow nps time 3 return true");
        return true;
    }

    /* JADX INFO: renamed from: lambda$isSendNps$2$com-huawei-ui-main-stories-nps-npsstate-NpsUserShowController, reason: not valid java name */
    /* synthetic */ void m1734xf84bfb5f(String str) {
        try {
            boolean zIsInterceptByAppNewNpsConfig = isInterceptByAppNewNpsConfig(str);
            NpsCommonUtil.setIsInteractDeviceUser(str, String.valueOf(zIsInterceptByAppNewNpsConfig));
            NpsCommonUtil.reportBI(str, zIsInterceptByAppNewNpsConfig, getControlNum(str));
        } catch (Exception e) {
            xjt.ar("uiSyncException" + ExceptionUtils.c(e));
        }
    }

    private boolean checkIsEnterWearHome() {
        String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10099), "key_ui_nps_enter_wear_home");
        if ("true".equals(strE)) {
            LogUtil.d(TAG, "isShowNps IsEnterWearHome: NPS_ENTER_TRUE");
            return true;
        }
        if (!NPS_ENTER_FALSE.equals(strE)) {
            isHaveStepsFromWear();
        }
        LogUtil.a(TAG, "isShowNps IsEnterWearHome: NPS_ENTER_FALSE");
        return false;
    }

    public String getHuidStr() {
        String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1011);
        return TextUtils.isEmpty(accountInfo) ? "" : accountInfo;
    }

    public void threadExecuteNpsModule() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.nps.npsstate.NpsUserShowController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m1735xf35332ed();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$threadExecuteNpsModule$3$com-huawei-ui-main-stories-nps-npsstate-NpsUserShowController, reason: not valid java name */
    /* synthetic */ void m1735xf35332ed() throws Throwable {
        if (isInterceptedCountry()) {
            LogUtil.e(TAG, "threadExecuteNpsModule isInterceptedCountry: ", true);
        } else {
            executeNpsModule();
        }
    }

    private void executeNpsModule() throws Throwable {
        String accountInfo = LoginInit.getInstance(this.mContext).getAccountInfo(1011);
        LogUtil.e(TAG, "executeNpsModule huidStr: ", accountInfo);
        if (TextUtils.isEmpty(accountInfo)) {
            return;
        }
        boolean zIsTheNewUserHadConfigInfo = isTheNewUserHadConfigInfo(accountInfo);
        LogUtil.a(TAG, "NpsUserShowController isTheNewUserHadConfigInfo: ", Boolean.valueOf(zIsTheNewUserHadConfigInfo));
        if (!zIsTheNewUserHadConfigInfo) {
            String userType = NpsSharePreferenceUtils.getUserType(BaseApplication.getContext(), "NEWBIE" + accountInfo);
            LogUtil.a(TAG, "NpsUserShowController get the user type: ", userType);
            if (TextUtils.isEmpty(userType)) {
                return;
            }
            boolean zIsNewUser = isNewUser(userType);
            LogUtil.a(TAG, "executeNpsModule is new user? ", Boolean.valueOf(zIsNewUser));
            if (!zIsNewUser) {
                LogUtil.a(TAG, "executeNpsModule gotoTheOldUserConfig");
                gotoTheOldUserConfig(accountInfo);
                return;
            } else {
                LogUtil.a(TAG, "executeNpsModule generateNewUserConfigInfo");
                generateNewUserConfigInfo(accountInfo);
            }
        }
        int needSurveyBatchs = getNeedSurveyBatchs(accountInfo);
        LogUtil.a(TAG, "executeNpsModule get the new user batch: ", Integer.valueOf(needSurveyBatchs));
        if (needSurveyBatchs == 0) {
            LogUtil.a(TAG, "executeNpsModule queryBatch == 0 gotoTheOldUserConfig");
            gotoTheOldUserConfig(accountInfo);
        } else {
            LogUtil.a(TAG, "executeNpsModule needDownload!");
        }
    }

    private void gotoTheOldUserConfig(String str) throws Throwable {
        NpsConfig npsConfig = readNpsConfig();
        if (npsConfig != null) {
            String str2 = npsConfig.getVersion() + str;
            boolean zIsTheOldUserHadConfigInfo = isTheOldUserHadConfigInfo(str2);
            LogUtil.a(TAG, "gotoTheOldUserConfig isHasConfig: ", Boolean.valueOf(zIsTheOldUserHadConfigInfo));
            if (!zIsTheOldUserHadConfigInfo) {
                LogUtil.a(TAG, "gotoTheOldUserConfig generateOldUserConfigInfo");
                generateOldUserConfigInfo(npsConfig, str2, str);
            } else {
                LogUtil.a(TAG, "gotoTheOldUserConfig needDownload!");
            }
        }
    }

    private void isHaveStepsFromWear() {
        HiTimeInterval hiTimeInterval = new HiTimeInterval();
        hiTimeInterval.setStartTime(0L);
        hiTimeInterval.setEndTime(System.currentTimeMillis());
        LogUtil.a(TAG, "enter isHaveStepsFromWear");
        HiHealthManager.d(this.mContext).fetchDataSourceByType(2, hiTimeInterval, new HiDataClientListener() { // from class: com.huawei.ui.main.stories.nps.npsstate.NpsUserShowController.1
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public void onResult(List<HiHealthClient> list) {
                int deviceType;
                if (list == null) {
                    LogUtil.d(NpsUserShowController.TAG, "clientList null");
                    return;
                }
                for (HiHealthClient hiHealthClient : list) {
                    if (hiHealthClient != null && (deviceType = hiHealthClient.getHiDeviceInfo().getDeviceType()) != 30 && deviceType != 32) {
                        SharedPreferenceManager.e(NpsUserShowController.this.mContext, String.valueOf(10099), "key_ui_nps_enter_wear_home", "true", null);
                        return;
                    }
                }
                SharedPreferenceManager.e(NpsUserShowController.this.mContext, String.valueOf(10099), "key_ui_nps_enter_wear_home", NpsUserShowController.NPS_ENTER_FALSE, null);
            }
        });
    }

    public void showNpsPage(Context context) {
        if (context == null) {
            return;
        }
        ddv.b().initH5Pro();
        H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.nps", new H5ProLaunchOption.Builder().addCustomizeJsModule("npsapi", NpsApi.class).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).setImmerse().showStatusBar().setStatusBarTextBlack(true).setForceDarkMode(1).setNeedSoftInputAdapter().addCustomizeArg("connectedWhitelistDevices", sConnectedWhitelistDevices).build());
        sConnectedWhitelistDevices = "";
    }

    private HiAggregateOption createAggregateOption(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC = lsl.c(jCurrentTimeMillis, (int) (1 - j));
        long jC2 = lsl.c(jCurrentTimeMillis);
        LogUtil.a(TAG, "start: ", DateFormatUtil.e(jC, DateFormatUtil.DateFormatType.DATE_FORMAT_14), " end: ", DateFormatUtil.e(jC2, DateFormatUtil.DateFormatType.DATE_FORMAT_14));
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(jC);
        hiAggregateOption.setEndTime(jC2);
        hiAggregateOption.setType(new int[]{40002});
        hiAggregateOption.setConstantsKey(new String[]{"stepUserValue"});
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setGroupUnitType(3);
        return hiAggregateOption;
    }
}
