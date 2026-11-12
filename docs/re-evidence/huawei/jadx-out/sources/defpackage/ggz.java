package defpackage;

import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.plan.model.model.fitness.FitnessHistoryModel;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = RecordApi.class)
@Singleton
public class ggz implements RecordApi {
    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void acquireSummaryFitnessRecord(long j, long j2, IBaseResponseCallback iBaseResponseCallback) throws Throwable {
        FitnessHistoryModel.getInstance().acquireSummaryFitnessRecord(j, j2, iBaseResponseCallback);
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void acquireSummaryFitnessRecord(ntx ntxVar, IBaseResponseCallback iBaseResponseCallback) {
        FitnessHistoryModel.getInstance().acquireSummaryFitnessRecord(ntxVar, iBaseResponseCallback);
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void acquireAnnualExerciseRecordByAll(ResultCallback resultCallback) throws Throwable {
        FitnessHistoryModel.getInstance().acquireAnnualExerciseRecordByAll(resultCallback);
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void acquireExerciseRecordByTimeAndId(long j, long j2, String str, String str2, ResultCallback resultCallback) {
        FitnessHistoryModel.getInstance().acquireExerciseRecordByTimeAndId(j, j2, str, str2, resultCallback);
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void acquireExerciseFinished(long j, long j2, String str, ResultCallback resultCallback) {
        FitnessHistoryModel.getInstance().acquireExerciseFinished(j, j2, str, resultCallback);
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void acquireFitnessRecordCategoryList(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("RecordImpl", "acquireFitnessRecordCategoryList");
        FitnessHistoryModel.getInstance().acquireFitnessRecordCategoryList(iBaseResponseCallback);
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void deleteFitnessRecord(int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("RecordImpl", "deleteFitnessRecord");
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void deleteFitnessRecord(String str, long j, IBaseResponseCallback iBaseResponseCallback) {
        FitnessHistoryModel.getInstance().deleteFitnessRecord(str, j, iBaseResponseCallback);
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void downloadFitnessRecordFromCloud(ResultCallback resultCallback) throws Throwable {
        gmc.g().i();
        FitnessHistoryModel.getInstance().downloadFitnessRecordFromCloud(resultCallback);
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void unregisterResultCallback() {
        FitnessHistoryModel.getInstance().unregisterResultCallback();
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public boolean deleteAllWorkoutRecords() {
        return gmw.b();
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public boolean insertWorkoutRecord(String str, WorkoutRecord workoutRecord) {
        return gmw.a(str, workoutRecord);
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public List<Map<String, Object>> getRecordsByDateRange(Date date, Date date2) {
        return gls.b().getRecordsByDateRange(date, date2);
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void deleteAllPlanRecords() {
        gls.b().deleteAllPlanRecords();
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void addRecordFor(String str, WorkoutRecord workoutRecord, boolean z) {
        if (workoutRecord == null) {
            LogUtil.j("RecordImpl", "addRecordFor : record is null");
        } else if (workoutRecord.getSportRecordType() != 0) {
            LogUtil.a("RecordImpl", "addRecordFor : SportRecordType != 0");
        } else {
            gmc.g().k().c(str, workoutRecord.acquireExerciseTime(), workoutRecord.acquireActualCalorie(), workoutRecord.getDuration(), workoutRecord.acquireWorkoutId(), z);
        }
    }

    @Override // com.huawei.health.courseplanservice.api.RecordApi
    public void acquireDetailFitnessRecords(ntx ntxVar, IBaseResponseCallback iBaseResponseCallback) {
        FitnessHistoryModel.getInstance().acquireDetailFitnessRecord(ntxVar, iBaseResponseCallback);
    }
}
