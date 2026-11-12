package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("objectiveResults")
    private List<qfh> f46118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("metadata")
    private String f46119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("planId")
    private String f46120c;

    @SerializedName("completionStatus")
    private int d;

    @SerializedName("endTime")
    private Long e;

    @SerializedName("taskId")
    private String f;

    @SerializedName("scheduleId")
    private String g;

    @SerializedName("timeZone")
    private String h;

    @SerializedName(ParsedFieldTag.RECORD_DAY)
    private int i;

    @SerializedName("startTime")
    private Long j;

    public qfm() {
    }

    public qfm(String str, String str2, String str3, int i, String str4) {
        this.f46120c = str;
        this.g = str2;
        this.f = str3;
        this.i = i;
        this.h = str4;
    }

    public String c() {
        return this.f46120c;
    }

    public void c(String str) {
        this.f46120c = str;
    }

    public String g() {
        return this.f;
    }

    public void e(String str) {
        this.f = str;
    }

    public String i() {
        return this.g;
    }

    public void b(String str) {
        this.g = str;
    }

    public int h() {
        return this.i;
    }

    public void b(int i) {
        this.i = i;
    }

    public long f() {
        Long l = this.j;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public void e(long j) {
        this.j = Long.valueOf(j);
    }

    public long b() {
        Long l = this.e;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public void b(long j) {
        this.e = Long.valueOf(j);
    }

    public String j() {
        return this.h;
    }

    public void d(String str) {
        this.h = str;
    }

    public int d() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public String e() {
        return this.f46119b;
    }

    public void a(String str) {
        this.f46119b = str;
    }

    public List<qfh> a() {
        return this.f46118a;
    }

    public void a(List<qfh> list) {
        this.f46118a = list;
    }

    public String toString() {
        return "ScheduleResult{taskId='" + this.f + ", scheduleId='" + this.g + ", recordDay=" + this.i + ", startTime=" + this.j + ", endTime=" + this.e + ", timeZone='" + this.h + ", completionStatus=" + this.d + ", metadata='" + this.f46119b + ", objectiveResults=" + this.f46118a + '}';
    }
}
