package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.multisync.HwExerciseAdviceAw70Manager;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mpj {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42132c = new Object();

    public static void e() {
        LogUtil.a("HwSyncOtherTask", "notifyToSyncWorkoutData sending broadcast to sync workout data.");
        ThreadPoolManager.c().a("HwSyncOtherTask", new Runnable() { // from class: mpi
            @Override // java.lang.Runnable
            public final void run() {
                mpj.b();
            }
        });
    }

    static /* synthetic */ void b() {
        synchronized (d) {
            LogUtil.a("HwSyncOtherTask", "ready register device info.");
            if (d()) {
                HwExerciseAdviceManager.getInstance().syncDeviceWorkoutRecordInfo();
            }
        }
    }

    public static void a() {
        LogUtil.a("HwSyncOtherTask", "notifyAW70ToSyncWorkoutData sending broadcast to sync workout data.");
        ThreadPoolManager.c().a("HwSyncOtherTask", new Runnable() { // from class: mpn
            @Override // java.lang.Runnable
            public final void run() {
                mpj.c();
            }
        });
    }

    static /* synthetic */ void c() {
        synchronized (f42132c) {
            LogUtil.a("HwSyncOtherTask", "notifyAW70ToSyncWorkoutData ready register device info.");
            if (d()) {
                HwExerciseAdviceAw70Manager.getInstance(HwExerciseAdviceManager.getInstance()).syncDeviceWorkoutRecordInfo();
            }
        }
    }

    private static boolean d() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwSyncOtherTask");
        if (deviceList == null) {
            LogUtil.j("HwSyncOtherTask", "startSyncWorkOut deviceInfoList is null");
            return false;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo != null) {
                if (!myo.e(deviceInfo)) {
                    return false;
                }
                myo.a(deviceInfo);
            }
        }
        return true;
    }
}
