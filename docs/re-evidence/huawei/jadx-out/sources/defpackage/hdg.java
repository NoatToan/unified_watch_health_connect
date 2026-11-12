package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hdg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bloodSugarGoal")
    private final int f36455b;

    @SerializedName("bloodPressureGoal")
    private final int d;

    @SerializedName("managementGoal")
    private final int e;

    public int c() {
        return this.d;
    }

    public int d() {
        return this.f36455b;
    }

    public int e() {
        return this.e;
    }

    public List<Integer> b() {
        ArrayList arrayList = new ArrayList();
        int i = this.e;
        if (i != 0) {
            arrayList.add(Integer.valueOf(i));
        }
        if (this.d != 0) {
            arrayList.add(6);
        }
        if (this.f36455b != 0) {
            arrayList.add(5);
        }
        return arrayList;
    }
}
