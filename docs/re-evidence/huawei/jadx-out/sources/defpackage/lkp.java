package defpackage;

import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.data.type.HiConfigDataType;
import com.huawei.hihealth.data.type.HiHealthDataType;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lkp {
    public static void d(HiDataDeleteOption hiDataDeleteOption, kym kymVar) throws lks {
        if (hiDataDeleteOption == null) {
            throw new lks("validDeleteOption deleteOption is null");
        }
        c(hiDataDeleteOption.getTimes());
        d(hiDataDeleteOption.getTypes());
        e(kymVar);
    }

    private static void e(kym kymVar) throws lks {
        int i = kymVar.i();
        if (i <= 0) {
            ReleaseLogUtil.e("HiH_HiDataDeleteValid", "deleteHealthData() who <= 0");
            throw new lks("deleteHealthData() who <= 0");
        }
        if (HiCommonUtil.b(kymVar.a())) {
            ReleaseLogUtil.e("HiH_HiDataDeleteValid", "deleteHealthData() clientIDs is null who = ", Integer.valueOf(i));
            throw new lks("deleteHealthData() clientIDs is null");
        }
    }

    private static void d(int[] iArr) throws lks {
        if (iArr == null || iArr.length <= 0) {
            throw new lks("validType types is null");
        }
        HiHealthDataType.Category categoryD = HiHealthDataType.d(iArr[0]);
        for (int i : iArr) {
            if (!HiHealthDataType.i(i) && !HiConfigDataType.j(i)) {
                throw new lks("validType types canot delete type = " + i);
            }
            if (categoryD != HiHealthDataType.d(i)) {
                throw new lks("validType types is not same category type = " + i);
            }
        }
    }

    private static void c(List<HiTimeInterval> list) throws lks {
        if (list == null || list.isEmpty()) {
            throw new lks("validTimes times is null or empty");
        }
        for (HiTimeInterval hiTimeInterval : list) {
            long startTime = hiTimeInterval.getStartTime();
            long endTime = hiTimeInterval.getEndTime();
            if (startTime > endTime) {
                throw new lks("validTimes startTime > endTime startTime = " + startTime + ",endTime = " + endTime);
            }
        }
    }
}
