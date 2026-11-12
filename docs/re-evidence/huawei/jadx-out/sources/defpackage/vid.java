package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class vid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("minute")
    private final int f51146a;

    @SerializedName("hour")
    private final int e;

    public int b() {
        return this.e;
    }

    public int d() {
        return this.f51146a;
    }

    public String toString() {
        return "ReminderPlanBean{mHour=" + this.e + ", mMinute=" + this.f51146a + '}';
    }
}
