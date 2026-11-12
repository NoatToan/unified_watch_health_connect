package defpackage;

import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwhealthdatamgr.R;
import com.huawei.hwhealthdatamgr.sportrecordingstrategy.SportsRecordingBean;

/* JADX INFO: loaded from: classes11.dex */
public class nle extends nlc {
    private WorkoutRecord d;

    @Override // defpackage.nlc
    public int a() {
        return 3;
    }

    @Override // defpackage.nlc
    public boolean i() {
        return true;
    }

    public SportsRecordingBean c(WorkoutRecord workoutRecord) {
        SportsRecordingBean sportsRecordingBean = new SportsRecordingBean();
        if (workoutRecord == null) {
            return sportsRecordingBean;
        }
        this.d = workoutRecord;
        sportsRecordingBean.setNeedConvertToTime(i());
        sportsRecordingBean.setSportStartTime(workoutRecord.startTime());
        sportsRecordingBean.setSportEndTime(workoutRecord.acquireExerciseTime());
        sportsRecordingBean.setShowType(a());
        sportsRecordingBean.setSportTime(c(workoutRecord.startTime()));
        sportsRecordingBean.setSportData(d());
        sportsRecordingBean.setSportUnit(b());
        sportsRecordingBean.setSportSpeed(e());
        sportsRecordingBean.setSportSpeedUnit(e());
        sportsRecordingBean.setSportTypeName(workoutRecord.acquireWorkoutName());
        sportsRecordingBean.setSportKeepTime(e(workoutRecord.getDuration()));
        return sportsRecordingBean;
    }

    @Override // defpackage.nlc
    public String e(long j) {
        return String.valueOf(j);
    }

    @Override // defpackage.nlc
    public String d() {
        WorkoutRecord workoutRecord = this.d;
        if (workoutRecord == null) {
            return "";
        }
        return b(workoutRecord.getActiveCalorie(), this.d.acquireActualCalorie());
    }

    @Override // defpackage.nlc
    public String b() {
        return qre.f(R.string.IDS_band_data_sport_energy_unit);
    }
}
