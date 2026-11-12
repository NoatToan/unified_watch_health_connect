package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwstressmgr.PressureCalibrate;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mza {
    private boolean d;

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final mza f42722a = new mza();
    }

    private mza() {
        this.d = false;
    }

    public static mza e() {
        return c.f42722a;
    }

    public float[] c(int i, float[] fArr, List<Integer> list, List<Integer> list2) {
        float[] fArrLibPressureCalibrate;
        synchronized (this) {
            PressureCalibrate pressureCalibrateE = PressureCalibrate.e();
            if (njy.b(list)) {
                ReleaseLogUtil.d("PressureDataProvider", "rriValueList size ", Integer.valueOf(list.size()));
            }
            if (njy.b(list2)) {
                ReleaseLogUtil.d("PressureDataProvider", "sqiValueList size ", Integer.valueOf(list2.size()));
            }
            a(true);
            int[] iArrC = c(list);
            int length = iArrC.length;
            LogUtil.a("PressureDataProvider", "cycleRriDataLength:", Integer.valueOf(length));
            int[] iArrC2 = c(list2);
            LogUtil.a("PressureDataProvider", "signalTime: ", Integer.valueOf(i), " rriData: ", Arrays.toString(fArr), " cycleRriData: ", Arrays.toString(iArrC), " cycleSqiData: ", Arrays.toString(iArrC2));
            fArrLibPressureCalibrate = pressureCalibrateE.libPressureCalibrate(fArr, i, length, iArrC, iArrC2);
            if (fArrLibPressureCalibrate == null) {
                LogUtil.a("PressureDataProvider", "cycleBack is null");
                fArrLibPressureCalibrate = new float[19];
            }
        }
        return fArrLibPressureCalibrate;
    }

    private int[] c(List<Integer> list) {
        if (list == null) {
            return new int[0];
        }
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            if (num == null) {
                ReleaseLogUtil.e("PressureDataProvider", "DeviceData error, List contains null!");
                LogUtil.j("PressureDataProvider", "list: ", list);
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put("resultList", list.toString());
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HW_PRESSURE_DEVICE_80070014.value(), linkedHashMap);
                return new int[0];
            }
            iArr[i] = num.intValue();
        }
        return iArr;
    }

    public boolean b(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (fArr[i2] == 0.0f) {
                i++;
            }
            if (i2 == fArr.length - 1 && i == fArr.length) {
                z = true;
            }
        }
        return z;
    }

    private void a(boolean z) {
        this.d = z;
    }

    public boolean c() {
        return this.d;
    }
}
