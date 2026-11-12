package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class pdw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("realClockInDayList")
    private List<Integer> f45215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("targetClockInDayList")
    private List<Integer> f45216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("totalCalorie")
    private float f45217c;

    @SerializedName(BleConstants.TOTAL_DISTANCE)
    private float d;

    @SerializedName("totalDuration")
    private int e;

    @SerializedName("trainCompleteRate")
    private float i;

    public float j() {
        return this.i;
    }

    public void e(float f) {
        this.i = f;
    }

    public int e() {
        return this.e;
    }

    public void d(int i) {
        this.e = i;
    }

    public float b() {
        return this.f45217c;
    }

    public List<Integer> c() {
        return this.f45216b;
    }

    public void b(List<Integer> list) {
        this.f45216b = list;
    }

    public List<Integer> d() {
        return this.f45215a;
    }

    public void a(List<Integer> list) {
        this.f45215a = list;
    }

    public float a() {
        return this.d;
    }

    public void a(float f) {
        this.d = f;
    }

    public void b(float f) {
        this.f45217c = f;
    }
}
