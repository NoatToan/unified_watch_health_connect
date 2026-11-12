package defpackage;

import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataDeleteProOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;

/* JADX INFO: loaded from: classes19.dex */
public class wgu {
    public static HiAggregateOption a(vzo vzoVar, int[] iArr, String[] strArr, int i) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        if (vzoVar != null) {
            hiAggregateOption.setReadType(vzoVar.l());
            hiAggregateOption.setDeviceUuid(vzoVar.j());
            hiAggregateOption.setStartTime(vzoVar.m());
            hiAggregateOption.setEndTime(vzoVar.h());
            hiAggregateOption.setType(iArr);
            hiAggregateOption.setConstantsKey(strArr);
            hiAggregateOption.setAggregateType(i);
            hiAggregateOption.setGroupUnitType(3);
            hiAggregateOption.setSortOrder(1);
        }
        return hiAggregateOption;
    }

    public static HiAggregateOption c(vzo vzoVar, int[] iArr, String[] strArr, int i, int i2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        if (vzoVar != null) {
            hiAggregateOption.setReadType(vzoVar.l());
            hiAggregateOption.setDeviceUuid(vzoVar.j());
            hiAggregateOption.setStartTime(vzoVar.m());
            hiAggregateOption.setEndTime(vzoVar.h());
            hiAggregateOption.setType(iArr);
            hiAggregateOption.setConstantsKey(strArr);
            hiAggregateOption.setAggregateType(i);
            hiAggregateOption.setGroupUnitType(i2);
            hiAggregateOption.setSortOrder(1);
        }
        return hiAggregateOption;
    }

    public static HiDataAggregateProOption c(HiAggregateOption hiAggregateOption, String str) {
        return HiDataAggregateProOption.builder().c(hiAggregateOption).e(str).e();
    }

    public static HiDataReadOption b(vzo vzoVar, int[] iArr) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        if (vzoVar != null) {
            hiDataReadOption.setReadType(vzoVar.l());
            hiDataReadOption.setDeviceUuid(vzoVar.j());
            hiDataReadOption.setStartTime(vzoVar.m());
            hiDataReadOption.setEndTime(vzoVar.h());
            hiDataReadOption.setType(iArr);
            hiDataReadOption.setSortOrder(1);
        }
        return hiDataReadOption;
    }

    public static HiDataReadProOption d(HiDataReadOption hiDataReadOption, String str) {
        return HiDataReadProOption.builder().e(hiDataReadOption).a(str).b();
    }

    public static HiDataDeleteProOption e(HiDataDeleteOption hiDataDeleteOption, vzo vzoVar) {
        return HiDataDeleteProOption.builder().c(hiDataDeleteOption).b(Integer.valueOf(vzoVar.a())).d(0).a(vzoVar.j()).b(vzoVar.f()).a((Integer) 1).c();
    }
}
