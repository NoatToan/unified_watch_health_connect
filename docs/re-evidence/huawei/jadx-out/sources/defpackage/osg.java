package defpackage;

/* JADX INFO: loaded from: classes13.dex */
public class osg extends osf implements Comparable<osg> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44639a;
    private String aa;
    private String ab;
    private long ac;
    private int ad;
    private long ae;
    private long af;
    private int ag;
    private long ah;
    private int ai;
    private int aj;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f44640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44641c;
    private int d;
    private int e;
    private String f;
    private long g;
    private int h;
    private int i;
    private int j;
    private String k;
    private String l;
    private int m;
    private String n;
    private String o;
    private long p;
    private String q;
    private int r;
    private String s;
    private String t;
    private int u;
    private int v;
    private int w;
    private int x;
    private String y;
    private int z;

    public osg() {
        super(12);
    }

    public String h() {
        return this.s;
    }

    public void b(String str) {
        this.s = str;
    }

    public String i() {
        return this.y;
    }

    public void j(String str) {
        this.y = str;
    }

    public String e() {
        return this.n;
    }

    public void d(String str) {
        this.n = str;
    }

    public String o() {
        return this.ab;
    }

    public void g(String str) {
        this.ab = str;
    }

    public String c() {
        return this.q;
    }

    public void c(String str) {
        this.q = str;
    }

    public int g() {
        return this.r;
    }

    public void b(int i) {
        this.r = i;
    }

    public int m() {
        return this.x;
    }

    public void d(int i) {
        this.x = i;
    }

    public int n() {
        return this.w;
    }

    public void a(int i) {
        this.w = i;
    }

    public int s() {
        return this.ai;
    }

    public void f(int i) {
        this.ai = i;
    }

    public String d() {
        return this.k;
    }

    public void a(String str) {
        this.k = str;
    }

    public long b() {
        return this.f44640b;
    }

    public void a(long j) {
        this.f44640b = j;
    }

    public long q() {
        return this.ae;
    }

    public void d(long j) {
        this.ae = j;
    }

    public long k() {
        return this.ac;
    }

    public void e(long j) {
        this.ac = j;
    }

    public void b(long j) {
        this.p = j;
    }

    public String t() {
        return this.aa;
    }

    public void h(String str) {
        this.aa = str;
    }

    public int l() {
        return this.v;
    }

    public void c(int i) {
        this.v = i;
    }

    public String j() {
        return this.t;
    }

    public void e(String str) {
        this.t = str;
    }

    public int p() {
        return this.ag;
    }

    public void i(int i) {
        this.ag = i;
    }

    public int f() {
        return this.u;
    }

    public void e(int i) {
        this.u = i;
    }

    public long a() {
        return this.g;
    }

    public void c(long j) {
        this.g = j;
    }

    public int r() {
        return this.z;
    }

    public void j(int i) {
        this.z = i;
    }

    public void m(int i) {
        this.e = i;
    }

    public int w() {
        return this.i;
    }

    public void l(int i) {
        this.i = i;
    }

    public String aa() {
        return this.l;
    }

    public void o(String str) {
        this.l = str;
    }

    public String ab() {
        return this.o;
    }

    public void n(String str) {
        this.o = str;
    }

    public int v() {
        return this.f44641c;
    }

    public void g(int i) {
        this.f44641c = i;
    }

    public int ai() {
        return this.ad;
    }

    public void r(int i) {
        this.ad = i;
    }

    public int ad() {
        return this.j;
    }

    public void k(int i) {
        this.j = i;
    }

    public int x() {
        return this.d;
    }

    public void h(int i) {
        this.d = i;
    }

    public long ag() {
        return this.ah;
    }

    public void i(long j) {
        this.ah = j;
    }

    public long ae() {
        return this.af;
    }

    public void g(long j) {
        this.af = j;
    }

    public int ac() {
        return this.m;
    }

    public void n(int i) {
        this.m = i;
    }

    public String z() {
        return this.f;
    }

    public void f(String str) {
        this.f = str;
    }

    public int u() {
        return this.h;
    }

    public void o(int i) {
        this.h = i;
    }

    public String y() {
        return this.f44639a;
    }

    public void i(String str) {
        this.f44639a = str;
    }

    public int ah() {
        return this.aj;
    }

    public void p(int i) {
        this.aj = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof osg) {
            osg osgVar = (osg) obj;
            String str = this.s;
            if (str != null && str.equals(osgVar.h()) && osgVar.ai() == this.ad && osgVar.ac() == this.m) {
                return true;
            }
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(osg osgVar) {
        if (osgVar == null) {
            return 0;
        }
        int i = this.v;
        int i2 = osgVar.v;
        return i != i2 ? i2 - i : osgVar.ad - this.ad;
    }

    public String toString() {
        return "KakaTaskInfo{taskId=" + this.s + ", taskName='" + this.y + "', taskDes='" + this.n + "', taskSpecification='" + this.ab + "', taskDetailUrl='" + this.q + "', taskFrequency=" + this.r + ", taskRewardKaka=" + this.x + ", taskRewardExperience=" + this.w + ", taskTypes=" + this.ai + ", taskConditions='" + this.k + "', eventTimestamp=" + this.f44640b + ", taskSyncTimestamp=" + this.ae + ", taskStartTime=" + this.ac + ", taskEndTime=" + this.p + ", taskStatus='" + this.aa + "', taskPriority=" + this.v + ", taskIcon='" + this.t + "', taskIsShow='" + this.u + "', lastTimestamp='" + this.g + "', taskSyncLocation='" + this.z + "', taskSyncStatus=" + this.ag + ", healthTaskType=" + this.e + ", kakaContinuous=" + this.i + ", preBotton='" + this.l + "', postBotton='" + this.o + "', category=" + this.f44641c + ", taskRule=" + this.ad + ", level=" + this.j + ", bonusType=" + this.d + ", updateTime=" + this.ah + ", timeZoneOffset=" + this.af + ", pictureUrl='" + this.f + "', scenario=" + this.m + ", labelMatch=" + this.h + ", buttonColor='" + this.f44639a + '}';
    }
}
