package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.fitness.activity.sportintensity.SportIntensityDataInteractor;
import com.huawei.ui.openservice.OpenServiceUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class uhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f50087a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static uhf f50088c;
    private Context e = BaseApplication.getContext();

    public static uhf c() {
        uhf uhfVar;
        synchronized (f50087a) {
            if (f50088c == null) {
                f50088c = new uhf();
            }
            uhfVar = f50088c;
        }
        return uhfVar;
    }

    public void c(long j, long j2, int i, final SportIntensityDataInteractor.e eVar) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setType(new int[]{47101, 47102, 47103, 47104, 47105, 47107, 47108, 47109});
        final String[] strArr = {"TOTAL", OpenServiceUtil.Location.STEP, "RUN", "CYCLE", "FITNESS", "CLIMB", "SWIM", "UNKNOWHIGH"};
        hiAggregateOption.setConstantsKey(strArr);
        if (i == 3 || i == 4 || i == 5) {
            i = 3;
        } else if (i == 6) {
            i = 5;
        }
        hiAggregateOption.setGroupUnitType(i);
        hiAggregateOption.setReadType(0);
        LogUtil.a("Step_FitnessSportIntensityInteractor", "getFitnessDataDetailByData aggregateOption = ", hiAggregateOption.toString());
        HiHealthManager.d(this.e).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: uhf.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                if (njy.e(list)) {
                    eVar.onResponse(0, null);
                    return;
                }
                LogUtil.a("Step_FitnessSportIntensityInteractor", " hiHealthDataList = ", list, " errorCode", Integer.valueOf(i2), " anchor", Integer.valueOf(i3));
                ArrayList arrayList = new ArrayList(10);
                uhf.this.c(list, arrayList, strArr);
                eVar.onResponse(0, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list, ArrayList<uhg> arrayList, String[] strArr) {
        uhg uhgVar = new uhg();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                i += hiHealthData.getInt(strArr[0]);
                i2 += hiHealthData.getInt(strArr[1]);
                i3 += hiHealthData.getInt(strArr[2]);
                i4 += hiHealthData.getInt(strArr[3]);
                i5 += hiHealthData.getInt(strArr[4]);
                i6 += hiHealthData.getInt(strArr[5]);
                i7 += hiHealthData.getInt(strArr[6]);
                i8 += hiHealthData.getInt(strArr[7]);
            }
        }
        uhgVar.d(i);
        uhgVar.g(i2);
        uhgVar.e(i3);
        uhgVar.c(i4);
        uhgVar.a(i5);
        uhgVar.b(i6);
        uhgVar.f(i7);
        uhgVar.j(i8);
        arrayList.add(uhgVar);
    }
}
