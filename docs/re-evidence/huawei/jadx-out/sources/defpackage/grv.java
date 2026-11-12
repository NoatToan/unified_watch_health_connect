package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.jsoperation.JsUtil;

/* JADX INFO: loaded from: classes8.dex */
public class grv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endTime")
    private long f35962a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(JsUtil.SCORE)
    private int f35963c;

    @SerializedName("grade")
    private int d;

    public void b(long j) {
        this.f35962a = j;
    }

    public int c() {
        return this.f35963c;
    }

    public void b(int i) {
        this.f35963c = i;
    }

    public void a(int i) {
        this.d = i;
    }

    public int e() {
        return this.d;
    }

    public String toString() {
        return "PressureMeasureBean{mStressEndTime=" + this.f35962a + ", mStressScore=" + this.f35963c + ", mStressGrade=" + this.d + '}';
    }
}
