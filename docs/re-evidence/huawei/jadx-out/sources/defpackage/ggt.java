package defpackage;

import android.content.Context;
import com.huawei.health.courseplanservice.api.DataPlatformApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = DataPlatformApi.class)
@Singleton
public class ggt implements DataPlatformApi {
    @Override // com.huawei.health.courseplanservice.api.DataPlatformApi
    public void insertCalorieData(Context context, WorkoutRecord workoutRecord) {
        gls.b().insertCalorieData(context, workoutRecord);
    }

    @Override // com.huawei.health.courseplanservice.api.DataPlatformApi
    public void insertCaloriePoints(Context context, Map<Long, HiHealthData> map) {
        gls.b().insertCaloriePoints(context, map);
    }

    @Override // com.huawei.health.courseplanservice.api.DataPlatformApi
    public void insertFitnessIntensityData(Context context, List<Long> list) {
        gls.b().insertFitnessIntensityData(context, list);
    }
}
