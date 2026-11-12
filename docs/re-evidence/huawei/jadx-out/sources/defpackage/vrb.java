package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class vrb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f51510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51511b;
    private Object d;

    public vrb(int i, Object obj) {
        this.f51511b = i;
        this.d = obj;
    }

    public int r() {
        return this.f51511b;
    }

    public int v() {
        Object obj = this.d;
        if (obj instanceof vqt) {
            return ((vqt) obj).z();
        }
        return 199;
    }

    public int x() {
        Object obj = this.d;
        if (obj instanceof vqt) {
            return ((vqt) obj).ac();
        }
        return 199;
    }

    public Drawable d(Context context) {
        Object obj = this.d;
        if (obj == null || context == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return BaseApplication.getContext().getDrawable(R.drawable.ic_health_list_outdoor_running);
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).a(context);
        }
        return context.getDrawable(R.drawable.ic_health_list_fitness_new);
    }

    public int a(Context context) {
        Object obj = this.d;
        if (!(obj instanceof vqt)) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is not SingleTrackData");
            return 0;
        }
        String strR = ((vqt) obj).r();
        if (TextUtils.isEmpty(strR)) {
            return 0;
        }
        int iB = jry.a(context).b(strR);
        LogUtil.j("SportHistorySingleData", "getSport3rdIcon packageName = ", strR);
        return iB;
    }

    public int i() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0;
        }
        int i = this.f51511b;
        if (i == 0 && (obj instanceof vqt)) {
            return ((vqt) obj).l();
        }
        if (i == 1 && (obj instanceof WorkoutRecord) && ((WorkoutRecord) obj).isFitnessRecordFromDevice()) {
            return R.drawable.ic_sporthistory_watch;
        }
        if (this.f51511b == 1) {
            Object obj2 = this.d;
            if ((obj2 instanceof WorkoutRecord) && ((WorkoutRecord) obj2).acquireWearType() == 3) {
                return R.drawable.ic_tv;
            }
        }
        return 0;
    }

    public float e() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0.0f;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).e();
        }
        return ((WorkoutRecord) obj).acquireActualCalorie();
    }

    public String l() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return "";
        }
        return ((vqt) obj).f();
    }

    public String k() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "acquireGolfDeviceName mSportHistoryData is null");
            return "";
        }
        if (!(obj instanceof vqt)) {
            LogUtil.j("SportHistorySingleData", "acquireGolfDeviceName mSportHistoryData is not SingleTrackData");
            return "";
        }
        return ((vqt) obj).x();
    }

    public long j() {
        Object obj = this.d;
        if (obj == null || !(obj instanceof vqt)) {
            return 0L;
        }
        return ((vqt) obj).a();
    }

    public long o() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0L;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).j();
        }
        return ((WorkoutRecord) obj).getDuration();
    }

    public float d() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0.0f;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).d();
        }
        return 0.0f;
    }

    public int u() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).m();
        }
        return 10001;
    }

    public RelativeSportData n() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return null;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).h();
        }
        return null;
    }

    public List<RelativeSportData> h() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return null;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).s();
        }
        return null;
    }

    public int b() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).c();
        }
        return 3;
    }

    public int ac() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0;
        }
        if (this.f51511b == 0 && (obj instanceof vqt)) {
            return ((vqt) obj).n();
        }
        return 0;
    }

    public long w() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0L;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).o();
        }
        return ((WorkoutRecord) obj).startTime();
    }

    public long m() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0L;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).g();
        }
        return ((WorkoutRecord) obj).acquireExerciseTime();
    }

    public String ab() {
        Object obj = this.d;
        if (obj != null) {
            return this.f51511b == 0 ? "" : ((WorkoutRecord) obj).acquireWorkoutName();
        }
        LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
        return "";
    }

    public int q() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0;
        }
        if (this.f51511b == 0) {
            return 0;
        }
        return ((WorkoutRecord) obj).acquireId();
    }

    public String z() {
        Object obj = this.d;
        if (obj instanceof WorkoutRecord) {
            return ((WorkoutRecord) obj).acquireWorkoutId();
        }
        return "";
    }

    public int a() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).b();
        }
        return 0;
    }

    public float c() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0.0f;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).k();
        }
        return ((WorkoutRecord) obj).acquireActualCalorie();
    }

    public int f() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0;
        }
        if (this.f51511b == 0 && (obj instanceof vqt)) {
            return ((vqt) obj).i();
        }
        return 0;
    }

    public boolean p() {
        if (this.f51511b != 0) {
            return false;
        }
        Object obj = this.d;
        if (obj instanceof vqt) {
            return ((vqt) obj).w();
        }
        return false;
    }

    public int ai() {
        Object obj = this.d;
        if (obj instanceof vqt) {
            return ((vqt) obj).aa();
        }
        LogUtil.j("SportHistorySingleData", "mSportHistoryData is null,getSportDataSource");
        return 0;
    }

    public String ag() {
        Object obj = this.d;
        if (obj instanceof vqt) {
            return ((vqt) obj).y();
        }
        LogUtil.j("SportHistorySingleData", "mSportHistoryData is null,getRunCourseId");
        return "";
    }

    public String ae() {
        Object obj = this.d;
        if (obj instanceof vqt) {
            return ((vqt) obj).ad();
        }
        LogUtil.j("SportHistorySingleData", "mSportHistoryData is null,getRunCourseName");
        return "";
    }

    public boolean ah() {
        return this.f51510a;
    }

    public void e(boolean z) {
        this.f51510a = z;
    }

    public int g() {
        Object obj = this.d;
        if (obj instanceof vqt) {
            return ((vqt) obj).p();
        }
        LogUtil.j("SportHistorySingleData", "mSportHistoryData is null,acquireDeviceType");
        return 0;
    }

    public int y() {
        Object obj = this.d;
        if (obj instanceof vqt) {
            return ((vqt) obj).m();
        }
        LogUtil.j("SportHistorySingleData", "mSportHistoryData is null,acquireSportType");
        return 258;
    }

    public int b(Context context) {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).c(context);
        }
        return context.getColor(R.color.common_colorAccent);
    }

    public int aa() {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
            return 0;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).q();
        }
        return 0;
    }

    public String t() {
        Object obj = this.d;
        if (obj instanceof vqt) {
            return ((vqt) obj).u();
        }
        return "";
    }

    public String ad() {
        Object obj = this.d;
        if (obj != null) {
            return this.f51511b == 0 ? ((vqt) obj).t() : "";
        }
        LogUtil.j("SportHistorySingleData", "mSportHistoryData is null");
        return "";
    }

    public void d(String str) {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "setAlias mSportHistoryData is null");
        } else if (this.f51511b == 0) {
            ((vqt) obj).a(str);
        }
    }

    public void b(int i) {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "setSportType mSportHistoryData is null");
        } else if (this.f51511b == 0) {
            ((vqt) obj).i(i);
        }
    }

    public void d(String str, String str2) {
        Object obj = this.d;
        if (obj == null) {
            LogUtil.j("SportHistorySingleData", "saveExtendStr mSportHistoryData is null");
        } else if (this.f51511b == 0) {
            ((vqt) obj).a(str, str2);
        }
    }

    public int s() {
        if (this.f51511b != 1) {
            return 0;
        }
        Object obj = this.d;
        if (obj instanceof WorkoutRecord) {
            return ((WorkoutRecord) obj).getRecordModeType();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrb)) {
            return false;
        }
        vrb vrbVar = (vrb) obj;
        return this.f51511b == vrbVar.f51511b && this.f51510a == vrbVar.f51510a && w() == vrbVar.w() && m() == vrbVar.m() && u() == vrbVar.u() && aa() == vrbVar.aa();
    }

    public int hashCode() {
        int i = this.f51511b;
        return Objects.hash(Integer.valueOf(i), this.d, Boolean.valueOf(this.f51510a));
    }

    public int af() {
        Object obj = this.d;
        if (!(obj instanceof vqt)) {
            LogUtil.j("SportHistorySingleData", "mSportHistoryData is not instanceof SingleTrackData");
            return -1;
        }
        if (this.f51511b == 0) {
            return ((vqt) obj).v();
        }
        return -1;
    }
}
