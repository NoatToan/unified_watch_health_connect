package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.threeCircle.remind.model.DeviceEventData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public class ika {
    public static String d(eee eeeVar) {
        if (eeeVar.getCommandId() != 2) {
            ReleaseLogUtil.e("R_TC_3CircDevInt", "onDataReceived, message commandId: ", Integer.valueOf(eeeVar.getCommandId()));
            return "";
        }
        if (eeeVar.d() != 800200001) {
            ReleaseLogUtil.e("R_TC_3CircDevInt", "onDataReceived, sampleEvent EventId is error");
            return "";
        }
        int iE = e(eeeVar.c());
        if (iE == 1) {
            return "WeekSummary";
        }
        if (iE == 2) {
            return "OverGoal";
        }
        if (iE == 3) {
            return "PerfectMonth";
        }
        LogUtil.j("R_TC_3CircDevInt", "unknown event id");
        return "";
    }

    private static int e(byte[] bArr) {
        ReleaseLogUtil.d("R_TC_3CircDevInt", "eventData byte size:", Integer.valueOf(bArr == null ? 0 : bArr.length), " ", eeq.e(bArr));
        if (bArr == null || bArr.length == 0) {
            return -1;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBufferWrap.getInt();
        byte b2 = byteBufferWrap.get();
        ReleaseLogUtil.d("R_TC_3CircDevInt", "timeStamp:", Integer.valueOf(i), " eventId:", Byte.valueOf(b2));
        return b2;
    }

    public static boolean c() {
        int iC = SharedPreferenceManager.c("threeCircleSp", "hw.sport.threecircle", 0);
        ReleaseLogUtil.d("R_TC_3CircDevInt", "connectDate:", Integer.valueOf(iC));
        return iC != 0 && lsl.b(iC, DateFormatUtil.a(System.currentTimeMillis(), TimeZone.getDefault())) <= 7;
    }

    public static void c(DeviceInfo deviceInfo, DeviceEventData deviceEventData) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.sport.threecircle");
        eeeVar.setWearPkgName(SyncStrategy.WEAR_PKG_NAME);
        eeeVar.setCommandId(2);
        eeeVar.a(800200001L);
        eeeVar.a(0);
        byte[] bytes = deviceEventData.getBytes();
        ReleaseLogUtil.d("R_TC_3CircDevInt", "eventData:", eeq.e(bytes));
        eeeVar.e(bytes);
        edc.e().sendSampleEventCommand(deviceInfo, eeeVar, "R_TC_3CircDevInt");
    }

    public static void b(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 154);
        boolean zD2 = eey.d(deviceInfo, 156);
        ReleaseLogUtil.d("R_TC_3CircDevInt", "isSupportThreeCircle:", Boolean.valueOf(zD), " isLite:", Boolean.valueOf(zD2));
        if (zD && !zD2) {
            SharedPreferenceManager.d("threeCircleSp", "hw.sport.threecircle", DateFormatUtil.a(System.currentTimeMillis(), TimeZone.getDefault()));
        }
        if (zD || zD2) {
            SharedPreferenceManager.c("threeCircleSp", "devicesConnectTime", System.currentTimeMillis());
        }
    }

    public static boolean c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("R_TC_3CircDevInt", "isSupportCompleteThreeCircle deviceInfo == null");
            return false;
        }
        boolean zD = eey.d(deviceInfo, 154);
        boolean zD2 = eey.d(deviceInfo, 156);
        ReleaseLogUtil.d("R_TC_3CircDevInt", "isSupportCompleteThreeCircle isSupportWriteBackThreeCircle:", Boolean.valueOf(zD), "isThreeCircleLite:", Boolean.valueOf(zD2));
        return zD && !zD2;
    }
}
