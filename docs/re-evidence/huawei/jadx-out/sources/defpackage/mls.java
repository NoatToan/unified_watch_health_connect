package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mls {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bloodOxygenIndex")
    private int f41893b;

    @SerializedName("bloodOxygenStructList")
    private List<mlr> d;

    @SerializedName("workoutRecordId")
    private int e;

    public void a(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void e(int i) {
        this.f41893b = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void a(List<mlr> list) {
        this.d = (List) lst.d(list);
    }
}
