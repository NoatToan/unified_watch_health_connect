package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes15.dex */
public class qfp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.TASK_MODIFY_TIME)
    private long f46125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("snapshotId")
    private String f46126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("planId")
    private String f46127c;

    @SerializedName("phoneType")
    private String d;

    @SerializedName(ParsedFieldTag.RECORD_DAY)
    private int e;

    @SerializedName("syncStatus")
    private int h;

    @SerializedName(ParsedFieldTag.TASKS)
    private String i;

    @SerializedName("timeZone")
    private String j;

    public String b() {
        return this.f46127c;
    }

    public void d(String str) {
        this.f46127c = str;
    }

    public int a() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public long e() {
        return this.f46125a;
    }

    public void c(long j) {
        this.f46125a = j;
    }

    public String h() {
        return this.j;
    }

    public void e(String str) {
        this.j = str;
    }

    public String d() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public String c() {
        return this.f46126b;
    }

    public void c(String str) {
        this.f46126b = str;
    }

    public String g() {
        return this.i;
    }

    public void b(String str) {
        this.i = str;
    }

    public int i() {
        return this.h;
    }

    public void b(int i) {
        this.h = i;
    }
}
