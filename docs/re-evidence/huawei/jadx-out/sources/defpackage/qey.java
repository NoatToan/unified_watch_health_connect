package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.tencent.open.SocialConstants;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("enableEqPunch")
    private boolean f46086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("category")
    private int f46087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("endDay")
    private int f46088c;

    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String d;

    @SerializedName("createdTime")
    private long e;

    @SerializedName("metadata")
    private String f;

    @SerializedName("name")
    private String g;

    @SerializedName("startDay")
    private int h;

    @SerializedName("objectiveInfos")
    private List<qfg> i;

    @SerializedName("planId")
    private String j;

    @SerializedName("timeZone")
    private String k;

    @SerializedName("subCategory")
    private int l;

    @SerializedName("templateId")
    private String m;

    @SerializedName("status")
    private int n;

    @SerializedName(ParsedFieldTag.TASKS)
    private List<qfy> o;

    @SerializedName("trainingRecurrence")
    private String p;

    @SerializedName("type")
    private int r;

    @SerializedName("updatedTime")
    private long s;

    public String h() {
        return this.j;
    }

    public void d(String str) {
        this.j = str;
    }

    public int e() {
        return this.f46087b;
    }

    public void e(int i) {
        this.f46087b = i;
    }

    public int k() {
        return this.l;
    }

    public void b(int i) {
        this.l = i;
    }

    public void a(String str) {
        this.m = str;
    }

    public String g() {
        return this.g;
    }

    public void c(String str) {
        this.g = str;
    }

    public String d() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    public int i() {
        return this.h;
    }

    public void d(int i) {
        this.h = i;
    }

    public int b() {
        return this.f46088c;
    }

    public void a(int i) {
        this.f46088c = i;
    }

    public String m() {
        return this.k;
    }

    public void j(String str) {
        this.k = str;
    }

    public int f() {
        return this.n;
    }

    public void c(int i) {
        this.n = i;
    }

    public void e(boolean z) {
        this.f46086a = z;
    }

    public String a() {
        return this.f;
    }

    public void e(String str) {
        this.f = str;
    }

    public long c() {
        return this.e;
    }

    public void d(long j) {
        this.e = j;
    }

    public long l() {
        return this.s;
    }

    public void c(long j) {
        this.s = j;
    }

    public int o() {
        return this.r;
    }

    public List<qfg> j() {
        return this.i;
    }

    public List<qfy> n() {
        return this.o;
    }

    public void a(List<qfy> list) {
        this.o = list;
    }

    public String toString() {
        return "PlanDetail{planId='" + this.j + "', category=" + this.f46087b + ", subCategory=" + this.l + ", templateId='" + this.m + "', name='" + this.g + "', desc='" + this.d + "', startDay=" + this.h + ", endDay=" + this.f46088c + ", trainingRecurrence='" + this.p + "', timeZone='" + this.k + "', status=" + this.n + ", enableEqPunch=" + this.f46086a + ", metadata='" + this.f + "', createdTime=" + this.e + ", updatedTime=" + this.s + ", type=" + this.r + ", objectiveInfos=" + this.i + ", tasks=" + this.o + '}';
    }
}
