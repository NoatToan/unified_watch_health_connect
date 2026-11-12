package defpackage;

import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vdd {
    public static uwh c(List<uwh> list, long j) {
        if (njy.e(list)) {
            return new uwh();
        }
        int i = 0;
        if (list.size() <= 1) {
            return list.get(0);
        }
        int size = list.size() - 1;
        boolean z = list.get(0).g() - list.get(size).g() >= 0;
        while (size != i + 1) {
            int i2 = (i + size) / 2;
            uwh uwhVar = list.get(i2);
            long jG = uwhVar.g();
            if (jG == j) {
                return uwhVar;
            }
            if (jG > j) {
                if (z) {
                    i = i2;
                } else {
                    size = i2;
                }
            } else if (z) {
                size = i2;
            } else {
                i = i2;
            }
        }
        if (Math.abs(j - list.get(i).g()) < Math.abs(list.get(size).g() - j)) {
            return list.get(i);
        }
        return list.get(size);
    }

    public static void d(int i) {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(i);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        HiHealthNativeApi.a(dxw.d()).synCloud(hiSyncOption, null);
        LogUtil.a("HealthDataUtils", "sync cloud over, dataType: ", Integer.valueOf(i));
    }
}
