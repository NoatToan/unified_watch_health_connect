package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dfm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("reminderPlans")
    private List<dfj> f31743c;

    public List<dfj> d() {
        return this.f31743c;
    }

    public void e(List<dfj> list) {
        this.f31743c = list;
    }

    public String toString() {
        return "BloodPressureMeasurePlan{mBloodPressureAlarmInfoCloudList=" + this.f31743c + "}";
    }
}
