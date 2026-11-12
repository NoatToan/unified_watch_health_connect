package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mpr {
    public static void a(DeviceInfo deviceInfo) {
        LogUtil.a("BasicDataSendCommandUtil", "sendSyncTodayData enter.");
        mkf.e(BaseApplication.getContext()).sendDeviceData(mps.b(deviceInfo));
    }

    public static void c(long j, long j2, DeviceInfo deviceInfo) {
        LogUtil.a("BasicDataSendCommandUtil", "sendHealthDataByFrameCountCmd enter.");
        mkf.e(BaseApplication.getContext()).sendDeviceData(mps.a(j, j2, deviceInfo));
    }

    public static void c(int i, DeviceInfo deviceInfo) {
        LogUtil.a("BasicDataSendCommandUtil", "sendHealthDataByFrameCompressedCmd enter index:", Integer.valueOf(i));
        mkf.e(BaseApplication.getContext()).sendDeviceData(mps.d(i, deviceInfo));
    }

    public static void b(int i, DeviceInfo deviceInfo) {
        LogUtil.a("BasicDataSendCommandUtil", "sendHealthDataByFrameCmd enter index:", Integer.valueOf(i));
        mkf.e(BaseApplication.getContext()).sendDeviceData(mps.a(i, deviceInfo));
    }

    public static void c(long j, long j2) {
        mkf.e(BaseApplication.getContext()).sendDeviceData(mps.c(j, j2));
    }

    public static void a(int i, DeviceInfo deviceInfo) {
        mkf.e(BaseApplication.getContext()).sendDeviceData(mps.b(i, deviceInfo));
    }

    public static void b(long j, long j2) {
        mkf.e(BaseApplication.getContext()).sendDeviceData(mps.e(j, j2));
    }

    public static void d(int i, DeviceInfo deviceInfo) {
        mkf.e(BaseApplication.getContext()).sendDeviceData(mps.e(i, deviceInfo));
    }

    public static void a(List<mhl> list) {
        LogUtil.a("BasicDataSendCommandUtil", "sendSetDeviceReportThreshold thresholdList: ", list);
        mkf.e(BaseApplication.getContext()).sendDeviceData(mps.d(list));
    }

    public static void c() {
        ReleaseLogUtil.d("R_BasicDataSendCommandUtil", "sendDeviceReport.");
        mkf.e(BaseApplication.getContext()).sendDeviceData(mps.b());
    }

    public static void d(long j, long j2, int i) {
        mkf.e(BaseApplication.getContext()).sendDeviceData(mps.c(j, j2, i));
    }

    public static void e(int i, DeviceInfo deviceInfo) {
        mkf.e(BaseApplication.getContext()).sendDeviceData(mps.c(i, deviceInfo));
    }
}
