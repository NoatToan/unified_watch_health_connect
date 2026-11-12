package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.utils.CollectionUtils;
import com.tencent.open.SocialConstants;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("cyclePeriod")
    private qfi f46102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String f46103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cycleInterval")
    private int f46104c = 1;

    @SerializedName("count")
    private int d;

    @SerializedName("allDayType")
    private boolean e;

    @SerializedName("duration")
    private int f;

    @SerializedName("endDay")
    private int g;

    @SerializedName("dtEnd")
    private long h;

    @SerializedName("dtStart")
    private long i;

    @SerializedName("metadata")
    private String j;

    @SerializedName("objectiveInfos")
    private List<qfg> k;

    @SerializedName("objectiveRelation")
    private int l;

    @SerializedName("name")
    private String m;

    @SerializedName("recurrence")
    private String n;

    @SerializedName("originalFlag")
    private int o;

    @SerializedName("timeZone")
    private String q;

    @SerializedName("updatedTime")
    private long s;

    @SerializedName("startDay")
    private int t;

    public String o() {
        return this.m;
    }

    public void c(String str) {
        this.m = str;
    }

    public String b() {
        return this.f46103b;
    }

    public void d(String str) {
        this.f46103b = str;
    }

    public int k() {
        return this.o;
    }

    public void j(int i) {
        this.o = i;
    }

    public boolean t() {
        return this.e;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public long f() {
        return this.i;
    }

    public void b(long j) {
        this.i = j;
    }

    public long e() {
        return this.h;
    }

    public void a(long j) {
        this.h = j;
    }

    public int s() {
        return this.t;
    }

    public void h(int i) {
        this.t = i;
    }

    public int h() {
        return this.g;
    }

    public void d(int i) {
        this.g = i;
    }

    public String q() {
        return this.q;
    }

    public void e(String str) {
        this.q = str;
    }

    public int i() {
        return this.f;
    }

    public void b(int i) {
        this.f = i;
    }

    public int c() {
        return this.f46104c;
    }

    public void c(int i) {
        this.f46104c = i;
    }

    public qfi d() {
        return this.f46102a;
    }

    public void a(qfi qfiVar) {
        this.f46102a = qfiVar;
    }

    public int a() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public String r() {
        return this.n;
    }

    public void b(String str) {
        this.n = str;
    }

    public int l() {
        return this.l;
    }

    public void a(int i) {
        this.l = i;
    }

    public String g() {
        return this.j;
    }

    public void a(String str) {
        this.j = str;
    }

    public void d(long j) {
        this.s = j;
    }

    public List<qfg> n() {
        return this.k;
    }

    public void b(List<qfg> list) {
        this.k = list;
    }

    public qfg m() {
        if (CollectionUtils.a(this.k)) {
            return null;
        }
        for (qfg qfgVar : this.k) {
            if (qfgVar != null) {
                return qfgVar;
            }
        }
        return null;
    }

    public String j() {
        qfg qfgVarM = m();
        if (qfgVarM == null) {
            return "";
        }
        return qfgVarM.e();
    }

    public String toString() {
        return "BaseSchedule{name='" + this.m + ", desc='" + this.f46103b + ", originalFlag=" + this.o + ", allDayType=" + this.e + ", dtStart=" + this.i + ", dtEnd=" + this.h + ", startDay=" + this.t + ", endDay=" + this.g + ", timeZone='" + this.q + ", duration=" + this.f + ", cycleInterval=" + this.f46104c + ", count=" + this.d + ", recurrence='" + this.n + ", objectiveRelation=" + this.l + ", metadata='" + this.j + ", updatedTime=" + this.s + ", objectiveInfos=" + this.k + '}';
    }
}
