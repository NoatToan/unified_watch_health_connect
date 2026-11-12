package com.huawei.health.faservice;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwdevicemanager.DeviceManager;
import com.huawei.hwdevicemanager.IInitCallback;
import com.huawei.systemserver.dmaccessservice.common.DeviceBasicInfo;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class HopDeviceUtil {
    private HopDeviceUtil() {
    }

    public static HopDeviceUtil b() {
        return SingletonHolder.SINGLETON_INSTANCE;
    }

    static class SingletonHolder {
        private static final HopDeviceUtil SINGLETON_INSTANCE = new HopDeviceUtil();

        private SingletonHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<DeviceBasicInfo> c() {
        Bundle bundle = new Bundle();
        bundle.putInt("sortType", 0);
        bundle.putString("siftFilter", a());
        List<DeviceBasicInfo> arrayList = new ArrayList<>(0);
        try {
            arrayList = DeviceManager.getInstance(BaseApplication.b()).getTrustedDeviceList("com.huawei.health", bundle);
        } catch (SecurityException e) {
            LogUtil.e("HopDeviceUtil", "getTrustedDeviceList exception: ", e.getMessage());
        }
        LogUtil.b("HopDeviceUtil", "trusted deviceList :", arrayList);
        return c(arrayList);
    }

    private String a() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("harmonyVersion", "2.0.0");
        map.put("system", map2);
        map.put("devType", new String[]{"09C"});
        map.put("groupType", "1");
        map.put("curComType", 4);
        HashMap map3 = new HashMap();
        map3.put("commonFilter", map);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(map3);
        HashMap map4 = new HashMap();
        map4.put("filters", arrayList);
        String strD = HiJsonUtil.d(map4);
        LogUtil.b("HopDeviceUtil", "trustedDeviceFilter: ", strD);
        return strD;
    }

    public void e() throws ClassNotFoundException, NoClassDefFoundError {
        if (!CommonUtil.bc()) {
            LogUtil.b("HopDeviceUtil", "the system is not support. no need to release");
        } else {
            ThreadPoolManager.c().b("HopDeviceUtil", new Runnable() { // from class: com.huawei.health.faservice.HopDeviceUtil$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.d();
                }
            });
        }
    }

    /* synthetic */ void d() {
        DeviceManager.getInstance(BaseApplication.b()).unInitDeviceManager("com.huawei.health", new IInitCallback() { // from class: com.huawei.health.faservice.HopDeviceUtil.1
            public void onInitDone(int i) {
                LogUtil.b("HopDeviceUtil", "unInit onInitDone result: " + i);
            }

            public void onException(int i) {
                LogUtil.e("HopDeviceUtil", "unInit onException errorCode: " + i);
                HopDeviceUtil.this.h();
            }
        });
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            DeviceManager.getInstance(BaseApplication.b()).release();
        } catch (IllegalArgumentException e) {
            LogUtil.e("HopDeviceUtil", "may the deviceManager not init, exception:", e.getMessage());
        }
    }

    public void c(final UiCallback<List<?>> uiCallback) throws ClassNotFoundException, NoClassDefFoundError {
        LogUtil.b("HopDeviceUtil", "enter hasAvailableFaDevice");
        if (!CommonUtil.bc()) {
            uiCallback.onFailure(2, "the system is not support.");
        } else {
            ThreadPoolManager.c().b("HopDeviceUtil", new Runnable() { // from class: com.huawei.health.faservice.HopDeviceUtil$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(uiCallback);
                }
            });
        }
    }

    /* synthetic */ void a(final UiCallback uiCallback) {
        try {
            DeviceManager.getInstance(BaseApplication.b()).initDeviceManager("com.huawei.health", new IInitCallback() { // from class: com.huawei.health.faservice.HopDeviceUtil.2
                public void onInitDone(int i) {
                    LogUtil.b("HopDeviceUtil", "onInitDone result: " + i);
                    if (i == 0) {
                        List listC = HopDeviceUtil.this.c();
                        if (njy.b(listC)) {
                            uiCallback.onSuccess(new Handler(Looper.getMainLooper()), listC);
                            return;
                        } else {
                            uiCallback.onFailure(1, "no find available device");
                            return;
                        }
                    }
                    uiCallback.onFailure(2, "initDeviceManager fail, result code:", Integer.valueOf(i));
                }

                public void onException(int i) {
                    LogUtil.e("HopDeviceUtil", "onException errorCode: " + i);
                    HopDeviceUtil.this.h();
                }
            });
        } catch (SecurityException unused) {
            LogUtil.d("HopDeviceUtil", "SecurityException happened, executor initDeviceManager failed.");
            uiCallback.onFailure(2, "SecurityException happened, executor initDeviceManager failed.");
        }
    }

    private List<DeviceBasicInfo> c(List<DeviceBasicInfo> list) {
        if (njy.e(list)) {
            LogUtil.b("HopDeviceUtil", "the getTrustedDeviceList method return null");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (DeviceBasicInfo deviceBasicInfo : list) {
            if (deviceBasicInfo.isDeviceOnline() && deviceBasicInfo.getDeviceType() == DeviceBasicInfo.DeviceType.TELEVISION) {
                arrayList.add(deviceBasicInfo);
            }
        }
        LogUtil.b("HopDeviceUtil", "the available deviceList Info: ", list);
        return arrayList;
    }
}
