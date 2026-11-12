package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bwj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("enabled")
    private boolean f1234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("daysOfWeek")
    private int f1235b;

    @SerializedName("reminderPlans")
    private List<bwb> d;

    @SerializedName("alarmId")
    private int e;

    public bwj(int i, int i2, boolean z, List<bwb> list) {
        this.e = i;
        this.f1235b = i2;
        this.f1234a = z;
        this.d = list;
    }

    public boolean e() {
        return this.f1234a;
    }

    public void b(boolean z) {
        this.f1234a = z;
    }

    public List<bwb> c() {
        return this.d;
    }

    public void a(List<bwb> list) {
        this.d = list;
    }

    public String toString() {
        return "ReminderBean{mAlarmId=" + this.e + ", mDaysOfWeek=" + this.f1235b + ", mIsEnabled=" + this.f1234a + ", mReminderPlanList=" + this.d + '}';
    }
}
