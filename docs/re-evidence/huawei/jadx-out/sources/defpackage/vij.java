package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("daysOfWeek")
    private int f51153a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("enabled")
    private boolean f51154c;

    @SerializedName("reminderPlans")
    private List<vid> d;

    @SerializedName("alarmId")
    private int e;

    public int d() {
        return this.f51153a;
    }

    public boolean a() {
        return this.f51154c;
    }

    public List<vid> c() {
        return this.d;
    }

    public String toString() {
        return "ReminderBean{mAlarmId=" + this.e + ", mDaysOfWeek=" + this.f51153a + ", mIsEnabled=" + this.f51154c + ", mReminderPlanList=" + this.d + '}';
    }
}
