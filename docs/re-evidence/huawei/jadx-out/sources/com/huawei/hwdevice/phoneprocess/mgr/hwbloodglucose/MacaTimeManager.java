package com.huawei.hwdevice.phoneprocess.mgr.hwbloodglucose;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.mkn;
import defpackage.mqn;
import defpackage.mqt;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class MacaTimeManager {
    private static MacaTimeManager d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MacaTimeDataManager f17469c;

    enum ValueType {
        REMAIN,
        INITIAL,
        ACTIVATE
    }

    public static MacaTimeManager d() {
        MacaTimeManager macaTimeManager;
        synchronized (e) {
            if (d == null) {
                LogUtil.a("MacaTimeManager", "create new instance");
                d = new MacaTimeManager();
            }
            macaTimeManager = d;
        }
        return macaTimeManager;
    }

    public MacaTimeManager() {
        LogUtil.a("MacaTimeManager", "MacaTimeManager created .");
        this.f17469c = new MacaTimeDataManager(BaseApplication.b());
    }

    public void c(String str, int i, int i2, int i3) {
        LogUtil.a("MacaTimeManager", "updateMacaTime received: remainTime: " + i + ", initTime: " + i2 + ", actTime: " + i3);
        this.f17469c.a(str, new mqt(i, i2, i3, System.currentTimeMillis(), SystemClock.elapsedRealtime()));
    }

    private int b(String str, ValueType valueType, int i) {
        long jCurrentTimeMillis;
        mqt mqtVarB = this.f17469c.b(str);
        if (mqtVarB.f42199c == 0 && mqtVarB.d == 0) {
            if (i >= 2) {
                return 0;
            }
            for (DeviceInfo deviceInfo : mkn.e().getDeviceList(HwGetDevicesMode.FOLLOWED_DEVICES, null, "MacaTimeManager")) {
                if (Objects.equals(deviceInfo.getDeviceIdentify(), str)) {
                    mqn.d().c(deviceInfo);
                }
            }
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            return b(str, valueType, i + 1);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < mqtVarB.d || mqtVarB.d == 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - mqtVarB.f42199c;
            LogUtil.a("MacaTimeManager", "Calculating time for MAC " + str + " using wall clock diff (reboot or no elapsed).");
        } else {
            jCurrentTimeMillis = jElapsedRealtime - mqtVarB.d;
            LogUtil.a("MacaTimeManager", "Calculating time for MAC " + str + " using elapsedRealtime diff.");
        }
        long j = jCurrentTimeMillis / 60000;
        int iOrdinal = valueType.ordinal();
        if (iOrdinal == 0) {
            return Math.max(0, mqtVarB.f42198b - ((int) j));
        }
        if (iOrdinal == 1) {
            return Math.max(0, mqtVarB.f42197a - ((int) j));
        }
        if (iOrdinal != 2) {
            return 0;
        }
        return mqtVarB.e;
    }

    public int d(String str) {
        return b(str, ValueType.REMAIN, 0);
    }

    public int e(String str) {
        return b(str, ValueType.INITIAL, 0);
    }

    public int a(String str) {
        return b(str, ValueType.ACTIVATE, 0);
    }

    private void a(DeviceInfo deviceInfo) {
        LogUtil.a("MacaTimeManager", "System time or timezone has changed, so update maca time.");
        mqn.d().c(deviceInfo);
    }

    public void c(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.TIME_SET".equals(action) || "android.intent.action.TIMEZONE_CHANGED".equals(action) || "android.intent.action.DATE_CHANGED".equals(intent.getAction())) {
            for (DeviceInfo deviceInfo : mkn.e().getDeviceList(HwGetDevicesMode.FOLLOWED_DEVICES, null, "MacaTimeManager")) {
                if (deviceInfo.getDeviceConnectState() == 2) {
                    a(deviceInfo);
                }
            }
        }
    }
}
