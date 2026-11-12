package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil;
import com.huawei.hwdevice.phoneprocess.mgr.sleepsync.SleepSyncManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class mju {
    private static final Map<Integer, Set<Integer>> d;

    static {
        HashMap map = new HashMap(16);
        d = map;
        HashSet hashSet = new HashSet(2);
        hashSet.add(16);
        hashSet.add(59);
        hashSet.add(46);
        hashSet.add(54);
        hashSet.add(56);
        map.put(1, hashSet);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(12);
        map.put(39, hashSet2);
        HashSet hashSet3 = new HashSet(2);
        hashSet3.add(7);
        map.put(42, hashSet3);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(1);
        map.put(11, hashSet4);
    }

    public static boolean e(byte[] bArr, DeviceInfo deviceInfo) {
        if (bArr != null && bArr.length >= 2) {
            if (deviceInfo == null) {
                LogUtil.j("DataReceivedResponse", "responseDataReceived deviceInfo null");
                return true;
            }
            byte b2 = bArr[0];
            byte b3 = bArr[1];
            if (b2 == 27 || b2 == 39) {
                ReleaseLogUtil.c("DEVMGR_DataReceivedResponse", "response sid: ", Integer.valueOf(b2), " cid: ", Integer.valueOf(b3));
            }
            if (!b(b2, b3) && !d(b2, b3, bArr)) {
                return true;
            }
            b(b2, b3, bArr, deviceInfo);
            a(b2, b3, bArr, deviceInfo);
            c(b2, b3, bArr, deviceInfo);
            b(b2, b3, deviceInfo);
            b(b2, b3, bArr);
            a(b2, b3, bArr);
            d(b2, b3, bArr, deviceInfo);
            e(b2, b3, bArr, deviceInfo);
            c(bArr, deviceInfo, b2, b3);
        }
        return false;
    }

    private static boolean b(int i, int i2) {
        Set<Integer> set = d.get(Integer.valueOf(i));
        return set != null && set.contains(Integer.valueOf(i2));
    }

    private static boolean d(int i, int i2, byte[] bArr) {
        LogUtil.a("DataReceivedResponse", "isSpecialProcess enter");
        if (i != 7 || i2 != 15 || !a(bArr)) {
            return false;
        }
        LogUtil.a("DataReceivedResponse", "command is 5.7.15 sleep");
        return true;
    }

    private static void b(int i, int i2, byte[] bArr, DeviceInfo deviceInfo) {
        if (i == 1 && i2 == 16) {
            new ndo().e(bArr, deviceInfo);
        }
    }

    private static void a(int i, int i2, byte[] bArr, final DeviceInfo deviceInfo) {
        if (i == 39 && i2 == 12) {
            String strE = eeq.e(bArr);
            if (TextUtils.isEmpty(strE) || strE.length() < 4) {
                LogUtil.j("DataReceivedResponse", "responseOneHopHandInfo dataInfos is error");
                return;
            }
            if ("7F04".equalsIgnoreCase(strE.length() >= 8 ? strE.substring(4, 8) : null)) {
                LogUtil.j("DataReceivedResponse", "responseOneHopHandInfo error 7F04");
            } else {
                LogUtil.a("DataReceivedResponse", "enter send ability");
                HwWatchFaceUtil.b(new HwWatchFaceUtil.TouchSupportCallback() { // from class: mju.2
                    @Override // com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil.TouchSupportCallback
                    public void touchSupportResult(int i3) {
                        LogUtil.a("DataReceivedResponse", "touchSupport:", Integer.valueOf(i3));
                        String str = eeq.d(1) + eeq.d(1) + eeq.d(i3);
                        DeviceCommand deviceCommand = new DeviceCommand();
                        deviceCommand.setServiceID(39);
                        deviceCommand.setCommandID(12);
                        deviceCommand.setDataContent(eeq.c(str));
                        deviceCommand.setDataLen(eeq.c(str).length);
                        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
                        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
                    }
                });
            }
        }
    }

    private static void c(int i, int i2, byte[] bArr, final DeviceInfo deviceInfo) {
        if (i != 42 || i2 != 7) {
            LogUtil.j("DataReceivedResponse", "responseAppMarketSupportFeatures serviceId and CommandId is error");
            return;
        }
        String strE = eeq.e(bArr);
        LogUtil.j("DataReceivedResponse", "responseAppMarketSupportFeatures dataInfo:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            return;
        }
        if ("7F04".equalsIgnoreCase(strE.length() >= 8 ? strE.substring(4, 8) : null)) {
            return;
        }
        LogUtil.a("DataReceivedResponse", "responseAppMarketSupportFeatures get and send support features");
        neq.a().a(new IBaseResponseCallback() { // from class: mju.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                LogUtil.a("DataReceivedResponse", "getAppMarketSupportFeatures features:", Integer.valueOf(i3));
                String str = eeq.d(1) + eeq.d(1) + eeq.d(i3);
                DeviceCommand deviceCommand = new DeviceCommand();
                deviceCommand.setServiceID(42);
                deviceCommand.setCommandID(7);
                deviceCommand.setDataContent(eeq.c(str));
                deviceCommand.setDataLen(eeq.c(str).length);
                deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
                mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
            }
        });
    }

    private static void b(int i, int i2, DeviceInfo deviceInfo) {
        if (i == 1 && i2 == 59) {
            LogUtil.a("DataReceivedResponse", "Enter 5.1.59 responseDisconnectDevice");
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(deviceInfo.getDeviceIdentify());
            mkf.e(BaseApplication.getContext()).unPair(arrayList, false);
        }
    }

    private static void b(int i, int i2, byte[] bArr) {
        if (i == 11 && i2 == 1) {
            mlh.e(BaseApplication.getContext()).b(bArr);
        }
    }

    private static void a(int i, int i2, byte[] bArr) {
        if (i == 1 && i2 == 46) {
            ndd.d().e(bArr);
        }
    }

    private static void d(int i, int i2, byte[] bArr, DeviceInfo deviceInfo) {
        if (i == 1 && i2 == 54) {
            mzq.e().c(bArr, deviceInfo);
        }
    }

    private static void e(int i, int i2, byte[] bArr, DeviceInfo deviceInfo) {
        if (i == 1 && i2 == 56) {
            nfn.c(bArr, deviceInfo);
        }
    }

    private static void c(byte[] bArr, DeviceInfo deviceInfo, int i, int i2) {
        LogUtil.a("DataReceivedResponse", "enter responseSleepSyncInfo");
        if (i == 7 && i2 == 15 && a(bArr)) {
            LogUtil.a("DataReceivedResponse", "responseSleepSyncInfo is sleep");
            Intent intent = new Intent("com.huawei.health.watch_in_sleep");
            intent.setPackage(BaseApplication.getContext().getPackageName());
            BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
            SleepSyncManager.d().d(deviceInfo);
        }
    }

    private static boolean a(byte[] bArr) {
        try {
            if (mjb.a(bArr) == 16) {
                LogUtil.a("DataReceivedResponse", "action is sleep");
                return true;
            }
        } catch (eeu unused) {
            LogUtil.e("DataReceivedResponse", "processDeviceDataReport exception");
        }
        return false;
    }
}
