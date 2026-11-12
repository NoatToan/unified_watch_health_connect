package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
public class qfl extends qfm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("createdTime")
    private long f46117c;

    @SerializedName("updatedTime")
    private long e;

    public void d(long j) {
        this.f46117c = j;
    }

    public void a(long j) {
        this.e = j;
    }

    @Override // defpackage.qfm
    public String toString() {
        return "ScheduleResult{" + super.toString() + ",, createdTime=" + this.f46117c + ", updatedTime=" + this.e + '}';
    }
}
