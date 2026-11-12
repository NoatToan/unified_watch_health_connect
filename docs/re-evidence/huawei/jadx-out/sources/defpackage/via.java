package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class via {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultCode")
    private int f51141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultDesc")
    private String f51142b;

    @SerializedName("dietDayRecordList")
    private List<vgo> e;

    public void b(int i) {
        this.f51141a = i;
    }

    public void e(String str) {
        this.f51142b = str;
    }

    public List<vgo> c() {
        return this.e;
    }

    public void a(List<vgo> list) {
        this.e = list;
    }

    public String toString() {
        return "DietResponse{mResultCode=" + this.f51141a + ", mResultDesc='" + this.f51142b + "', mDietDayRecordList=" + this.e + '}';
    }
}
