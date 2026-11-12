package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes23.dex */
public class bwb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("hour")
    private final int f1221c;

    @SerializedName("minute")
    private final int d;

    public bwb(int i, int i2) {
        this.f1221c = i;
        this.d = i2;
    }

    public int d() {
        return this.f1221c;
    }

    public int c() {
        return this.d;
    }

    public String toString() {
        return "ReminderPlanBean{mHour=" + this.f1221c + ", mMinute=" + this.d + '}';
    }
}
