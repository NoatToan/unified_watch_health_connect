package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qfy extends qfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("schedules")
    private List<qfk> f46143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("status")
    private int f46144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(TypedValues.Custom.S_DIMENSION)
    private String f46145c;

    @SerializedName("subTaskIds")
    private List<String> d;

    @SerializedName("createdTime")
    private long e;

    @SerializedName("updatedTime")
    private long g;

    public int o() {
        return this.f46144b;
    }

    public void a(int i) {
        this.f46144b = i;
    }

    public List<String> r() {
        return this.d;
    }

    public void a(List<String> list) {
        this.d = list;
    }

    public void c(long j) {
        this.e = j;
    }

    public void d(long j) {
        this.g = j;
    }

    public List<qfk> n() {
        return this.f46143a;
    }

    public void d(List<qfk> list) {
        this.f46143a = list;
    }

    public void h(String str) {
        this.f46145c = str;
    }

    public String s() {
        qfk qfkVar;
        return (njy.e(this.f46143a) || (qfkVar = this.f46143a.get(0)) == null || njy.e(qfkVar.n())) ? "" : qfkVar.n().get(0).e();
    }

    @Override // defpackage.qfx
    public String toString() {
        return "TaskDetail{" + super.toString() + ",, status=" + this.f46144b + ", subTaskIds=" + this.d + ", createdTime=" + this.e + ", updatedTime=" + this.g + ", schedules=" + this.f46143a + ", dimension=" + this.f46145c + '}';
    }
}
