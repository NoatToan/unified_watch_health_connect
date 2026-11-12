package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("category")
    private int f46146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("executableFlag")
    private boolean f46147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(TypedValues.Custom.S_DIMENSION)
    private String f46148c;

    @SerializedName("metadata")
    private String d;

    @SerializedName("globalTaskFlag")
    private boolean e;

    @SerializedName("name")
    private String f;

    @SerializedName("subTasks")
    private List<qfq> g;

    @SerializedName("parentTaskId")
    private String h;

    @SerializedName("taskId")
    private String i;

    @SerializedName("schedules")
    private List<qfk> j;

    @SerializedName("type")
    private int k;

    @SerializedName("timeZone")
    private String l;

    @SerializedName("updatedTime")
    private long m;

    public String g() {
        return this.i;
    }

    public void e(String str) {
        this.i = str;
    }

    public int i() {
        return this.k;
    }

    public int c() {
        return this.f46146a;
    }

    public String d() {
        return this.f;
    }

    public String h() {
        return this.l;
    }

    public List<qfk> j() {
        return this.j;
    }

    public void a(List<qfk> list) {
        this.j = list;
    }

    public List<qfq> f() {
        return this.g;
    }

    public void b(List<qfq> list) {
        this.g = list;
    }

    public String a() {
        return this.d;
    }

    public boolean m() {
        return this.f46147b;
    }

    public boolean l() {
        return this.e;
    }

    public String e() {
        return this.h;
    }

    public String b() {
        return this.f46148c;
    }

    public long o() {
        return this.m;
    }

    public String toString() {
        return "TaskSchedule{taskId='" + this.i + "', type=" + this.k + ", category=" + this.f46146a + ", name='" + this.f + "', timeZone='" + this.l + "', schedules=" + this.j + ", subTasks=" + this.g + ", metadata='" + this.d + "', executableFlag=" + this.f46147b + ", globalTaskFlag=" + this.e + ", parentTaskId='" + this.h + "', dimension='" + this.f46148c + "', updatedTime=" + this.m + '}';
    }
}
