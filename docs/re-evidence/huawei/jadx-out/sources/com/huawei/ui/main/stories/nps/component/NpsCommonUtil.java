package com.huawei.ui.main.stories.nps.component;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.agconnect.apms.Agent;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataHiDeviceInfoListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import defpackage.drw;
import defpackage.dxm;
import defpackage.ecu;
import defpackage.era;
import defpackage.lsl;
import defpackage.lvl;
import defpackage.njy;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.EmuiBuild;
import health.compact.a.HarmonyBuild;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.SystemProperties;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class NpsCommonUtil {
    private static final String DEFAULT = "default";
    private static final String DEVICE_NAME_FILE_NAME = "/data/product.bin";
    private static final String IS_INTERACT_DEVICE_USER = "interact_device_user";
    private static final String KEY_NPS_INTERCEPT = "key_nps_intercept";
    private static final int MAX_READ_LINE = 5242880;
    private static final long MILLIS_FOR_DAY = 86400000;
    private static final String TAG = "NpsCommonUtil";
    private static final String TAG_RELEASE = "R_NpsCommonUtil";

    private NpsCommonUtil() {
    }

    public static String getClientVersionCode() {
        return CommonUtil.e(BaseApplication.getContext()) + "";
    }

    public static String getCountryCode() {
        return BaseApplication.getContext().getResources().getConfiguration().locale.getCountry();
    }

    public static String getFirmRomVersion() {
        return Build.DISPLAY;
    }

    public static String getEmuiVerion() {
        return CommonUtil.bc() ? HarmonyBuild.f36561a : EmuiBuild.f36543a;
    }

    public static String getInternalModel() throws Throwable {
        String strConvertFileToString = convertFileToString(getDeviceNameFileName());
        if (!TextUtils.isEmpty(strConvertFileToString)) {
            return strConvertFileToString;
        }
        String strD = SystemProperties.d("ro.product.model");
        return TextUtils.isEmpty(strD) ? Build.MODEL : strD;
    }

    public static boolean isDeviceUser() {
        int iC = SharedPreferenceManager.c(String.valueOf(10024), "isPairedDevice", 0);
        if (iC != 1) {
            checkIsUseMyScale();
        }
        long jD = SharedPreferenceManager.d(String.valueOf(10024), "pairedDeviceTime", 0L);
        if (iC != 1 || Math.abs(lsl.a(jD, System.currentTimeMillis())) <= 1) {
            return false;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "paired device, return.");
        return true;
    }

    private static void checkIsUseMyScale() {
        ThreadPoolManager.c().a("checkIsUseMyScale", new Runnable() { // from class: com.huawei.ui.main.stories.nps.component.NpsCommonUtil$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NpsCommonUtil.lambda$checkIsUseMyScale$1();
            }
        });
    }

    static /* synthetic */ void lambda$checkIsUseMyScale$1() {
        Iterator<String> it = drw.e().d(HealthDevice.HealthDeviceKind.HDK_WEIGHT).iterator();
        while (it.hasNext()) {
            if (dxm.ad(it.next())) {
                LogUtil.a(TAG, "checkIsUseMyScale have scale device");
                SharedPreferenceManager.d(String.valueOf(10024), "isPairedDevice", 1);
                return;
            }
        }
        HiHealthManager.d(BaseApplication.getContext()).readDeviceInfo(new HiDataHiDeviceInfoListener() { // from class: com.huawei.ui.main.stories.nps.component.NpsCommonUtil$$ExternalSyntheticLambda1
            @Override // com.huawei.hihealth.data.listener.HiDataHiDeviceInfoListener
            public final void onResult(List list) {
                NpsCommonUtil.lambda$checkIsUseMyScale$0(list);
            }
        });
    }

    static /* synthetic */ void lambda$checkIsUseMyScale$0(List list) {
        if (njy.e(list)) {
            LogUtil.d(TAG, "checkIsUseMyScale readDeviceInfo onResult infoList is null.");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (dxm.af(((HiDeviceInfo) it.next()).getProdId())) {
                LogUtil.a(TAG, "checkIsUseMyScale use scale device");
                SharedPreferenceManager.d(String.valueOf(10024), "isPairedDevice", 1);
                return;
            }
        }
    }

    private static String getDeviceNameFileName() {
        return DEVICE_NAME_FILE_NAME;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private static String convertFileToString(String str) throws Throwable {
        Throwable th;
        ?? r10;
        InputStreamReader inputStreamReader;
        Object obj;
        ?? r6;
        Object obj2;
        Object obj3 = "convertFileToString occurred IOException2";
        StringBuilder sb = new StringBuilder();
        ?? r7 = 0;
        r7 = 0;
        r7 = 0;
        InputStreamReader inputStreamReader2 = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream(str), "UTF-8");
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    int i = 0;
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            r7 = i;
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                            i++;
                            if (i > 5242880) {
                                Object[] objArr = {"read lines exceed max: ", 5242880};
                                LogUtil.c(TAG, objArr);
                                r7 = objArr;
                                break;
                            }
                        } catch (IOException unused) {
                            r7 = bufferedReader;
                            LogUtil.c(TAG, "convertFileToString occurred IOException");
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (IOException unused2) {
                                    LogUtil.c(TAG, "convertFileToString occurred IOException2");
                                }
                            }
                            if (r7 != 0) {
                                try {
                                    r7.close();
                                } catch (IOException unused3) {
                                    LogUtil.c(TAG, "convertFileToString occurred IOException3");
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r6 = bufferedReader;
                            obj2 = "convertFileToString occurred IOException2";
                            r10 = r6;
                            inputStreamReader2 = inputStreamReader;
                            obj = obj2;
                            if (inputStreamReader2 != null) {
                                try {
                                    inputStreamReader2.close();
                                } catch (IOException unused4) {
                                    LogUtil.c(TAG, obj);
                                }
                            }
                            if (r10 != 0) {
                                try {
                                    r10.close();
                                    throw th;
                                } catch (IOException unused5) {
                                    LogUtil.c(TAG, "convertFileToString occurred IOException3");
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        inputStreamReader.close();
                        obj3 = "convertFileToString occurred IOException2";
                    } catch (IOException unused6) {
                        Object[] objArr2 = {"convertFileToString occurred IOException2"};
                        LogUtil.c(TAG, objArr2);
                        obj3 = objArr2;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused7) {
                        LogUtil.c(TAG, "convertFileToString occurred IOException3");
                    }
                } catch (IOException unused8) {
                }
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj3;
                r6 = r7;
            }
        } catch (IOException unused9) {
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
            r10 = 0;
            obj = "convertFileToString occurred IOException2";
            if (inputStreamReader2 != null) {
                inputStreamReader2.close();
            }
            if (r10 != 0) {
                r10.close();
                throw th;
            }
            throw th;
        }
        return sb.toString();
    }

    public static String getAndroidVersion() {
        return Agent.OS_NAME + Build.VERSION.RELEASE;
    }

    public static List<String> getHiLinkDeviceIdList() {
        List<DeviceInfo> wearDeviceList = getWearDeviceList();
        ArrayList arrayList = new ArrayList();
        if (!njy.e(wearDeviceList)) {
            Iterator<DeviceInfo> it = wearDeviceList.iterator();
            while (it.hasNext()) {
                String hiLinkDeviceId = it.next().getHiLinkDeviceId();
                if (TextUtils.isEmpty(hiLinkDeviceId)) {
                    arrayList.add("default");
                } else if (!arrayList.contains(hiLinkDeviceId)) {
                    arrayList.add(hiLinkDeviceId);
                }
            }
        }
        ArrayList<String> arrayListD = drw.e().d(HealthDevice.HealthDeviceKind.HDK_WEIGHT);
        if (!njy.e(arrayListD)) {
            for (String str : arrayListD) {
                if (!dxm.ad(str)) {
                    arrayList.add("default");
                } else {
                    String strB = era.b(str);
                    if (TextUtils.isEmpty(strB)) {
                        arrayList.add("default");
                    } else if (!arrayList.contains(strB)) {
                        arrayList.add(strB);
                    }
                }
            }
        }
        LogUtil.a(TAG, "getHiLinkDeviceIdList = ", arrayList.toString());
        ReleaseLogUtil.d(TAG_RELEASE, "getHiLinkDeviceIdList size = ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static List<DeviceInfo> getWearDeviceList() {
        HashMap map = new HashMap();
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, TAG);
        if (!njy.e(deviceList)) {
            for (DeviceInfo deviceInfo : deviceList) {
                String deviceIdentify = deviceInfo.getDeviceIdentify();
                if (!TextUtils.isEmpty(deviceIdentify)) {
                    map.put(deviceIdentify, deviceInfo);
                }
            }
        }
        List<CloudDeviceInfo> listC = lvl.c();
        if (!njy.e(listC)) {
            for (CloudDeviceInfo cloudDeviceInfo : listC) {
                String deviceIdentify2 = cloudDeviceInfo.getDeviceIdentify();
                if (!TextUtils.isEmpty(deviceIdentify2) && !map.containsKey(deviceIdentify2)) {
                    map.put(deviceIdentify2, cloudDeviceInfo);
                }
            }
        }
        ArrayList arrayList = new ArrayList(map.values());
        ReleaseLogUtil.d(TAG_RELEASE, "getWearDevice ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static void setIsInteractDeviceUser(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferenceManager.c(String.valueOf(10099), IS_INTERACT_DEVICE_USER + str, str2);
    }

    public static String getIsInteractDeviceUser(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return SharedPreferenceManager.b(String.valueOf(10099), IS_INTERACT_DEVICE_USER + str, "");
    }

    public static boolean isValidBoolean(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false");
    }

    public static void reportBI(String str, boolean z, int i) {
        if (z) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - SharedPreferenceManager.d(String.valueOf(10004), KEY_NPS_INTERCEPT + str, 0L)) < 86400000) {
            return;
        }
        xjt.ar("controlNum = " + i + " hiLinkDeviceIdList = " + getHiLinkDeviceIdList().toString());
        LogUtil.a(TAG, "reportBI, controlNum = ", Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(KEY_NPS_INTERCEPT);
        sb.append(str);
        SharedPreferenceManager.c(String.valueOf(10004), sb.toString(), System.currentTimeMillis());
    }
}
