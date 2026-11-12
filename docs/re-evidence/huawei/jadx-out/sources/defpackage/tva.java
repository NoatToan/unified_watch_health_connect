package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.utils.FoundationCommonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class tva extends tuy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Integer> f49695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<Integer> f49696b;
    private static final List<Integer> d;

    static {
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f49696b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        f49695a = arrayList3;
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE.value()));
        arrayList2.add(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value()));
        arrayList3.add(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_USER_VALUE.value()));
        arrayList2.add(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value()));
        arrayList3.add(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE.value()));
        arrayList2.add(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value()));
        arrayList3.add(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE.value()));
    }

    @Override // defpackage.tuy
    protected List<Integer> d() {
        return d;
    }

    @Override // defpackage.tuy
    protected List<Integer> c() {
        return f49696b;
    }

    @Override // defpackage.tuy
    protected List<Integer> b() {
        return f49695a;
    }

    @Override // defpackage.tuy
    protected void a() {
        if (this.e.size() == 4) {
            this.e.remove(0);
        }
    }

    @Override // defpackage.tuy
    protected HiHealthData a(HiHealthData hiHealthData) {
        HiHealthData hiHealthData2 = new HiHealthData(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_IS_RING_NEW.value());
        hiHealthData2.setStartTime(hiHealthData.getStartTime());
        hiHealthData2.setEndTime(hiHealthData.getEndTime());
        hiHealthData2.setDeviceUuid(FoundationCommonUtil.getAndroidId(BaseApplication.b()));
        hiHealthData2.setValue(1);
        return hiHealthData2;
    }

    @Override // defpackage.tuy
    protected int e() {
        return DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_IS_RING_NEW.value();
    }
}
