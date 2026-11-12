package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes43.dex */
public class qfc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("startDay")
    private int f46095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("endDay")
    private int f46096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("status")
    private int f46097c;

    @SerializedName("dataSource")
    private int d;

    @SerializedName(ParsedFieldTag.TASKS)
    private qfa e;

    @SerializedName("timeZone")
    private String i;

    public int b() {
        return this.f46095a;
    }

    public void a(int i) {
        this.f46095a = i;
    }

    public int e() {
        return this.f46096b;
    }

    public void e(int i) {
        this.f46096b = i;
    }

    public int c() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public qfa d() {
        return this.e;
    }

    public void d(qfa qfaVar) {
        this.e = qfaVar;
    }

    public String g() {
        return this.i;
    }

    public void b(String str) {
        this.i = str;
    }

    public int a() {
        return this.f46097c;
    }

    public void c(int i) {
        this.f46097c = i;
    }

    public String toString() {
        return "HealthLifeTask{startDay=" + this.f46095a + ", endDay=" + this.f46096b + ", dataSource=" + this.d + ", tasks=" + this.e + ", timeZone='" + this.i + ", status=" + this.f46097c + '}';
    }
}
