package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.utils.CollectionUtils;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qfq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("name")
    private String f46128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("taskId")
    private String f46129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("parentTaskId")
    private String f46130c;

    @SerializedName("schedules")
    private List<qfk> d;

    @SerializedName("category")
    private int e;

    @SerializedName("type")
    private int f;

    @SerializedName("timeZone")
    private String g;

    public int h() {
        return this.f;
    }

    public void d(int i) {
        this.f = i;
    }

    public int e() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    public String a() {
        return this.f46128a;
    }

    public void e(String str) {
        this.f46128a = str;
    }

    public String f() {
        return this.f46129b;
    }

    public void d(String str) {
        this.f46129b = str;
    }

    public String d() {
        return this.f46130c;
    }

    public void a(String str) {
        this.f46130c = str;
    }

    public String j() {
        return this.g;
    }

    public void b(String str) {
        this.g = str;
    }

    public List<qfk> g() {
        return this.d;
    }

    public void b(List<qfk> list) {
        this.d = list;
    }

    public qfk i() {
        if (CollectionUtils.a(this.d)) {
            return null;
        }
        for (qfk qfkVar : this.d) {
            if (qfkVar != null) {
                return qfkVar;
            }
        }
        return null;
    }

    public qfg b() {
        qfk qfkVarI = i();
        if (qfkVarI == null) {
            return null;
        }
        return qfkVarI.m();
    }

    public String c() {
        qfg qfgVarB = b();
        if (qfgVarB == null) {
            return "";
        }
        return qfgVarB.d();
    }

    public String toString() {
        return "SubTasks{mType=" + this.f + ", mCategory=" + this.e + ", mName='" + this.f46128a + ", mTaskId='" + this.f46129b + ", mTimeZone='" + this.g + ", mSchedules=" + this.d + '}';
    }
}
