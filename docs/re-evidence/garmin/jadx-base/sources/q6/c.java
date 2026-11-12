package q6;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f143067h = new String("FIXED_DIMENSION");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f143068i = new String("WRAP_DIMENSION");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f143069j = new String("SPREAD_DIMENSION");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f143070k = new String("PARENT_DIMENSION");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f143071l = new String("PERCENT_DIMENSION");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f143072m = new String("RATIO_DIMENSION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f143074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f143075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f143076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f143077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f143078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f143079g;

    private c() {
        this.f143073a = 0;
        this.f143074b = Integer.MAX_VALUE;
        this.f143075c = 1.0f;
        this.f143076d = 0;
        this.f143077e = null;
        this.f143078f = f143068i;
        this.f143079g = false;
    }

    public static c b() {
        c cVar = new c(f143067h);
        cVar.f143078f = f143068i;
        return cVar;
    }

    public static c c(int i14) {
        c cVar = new c(f143067h);
        cVar.f143078f = null;
        cVar.f143076d = i14;
        return cVar;
    }

    public static c d() {
        return new c(f143070k);
    }

    public static c e(float f14) {
        c cVar = new c(f143071l);
        cVar.f143075c = f14;
        return cVar;
    }

    public static c f(String str) {
        c cVar = new c(f143072m);
        cVar.f143077e = str;
        return cVar;
    }

    public static c g(String str) {
        c cVar = new c();
        cVar.f143078f = str;
        cVar.f143079g = true;
        return cVar;
    }

    public static c h() {
        return new c(f143068i);
    }

    public final void a(t6.e eVar, int i14) {
        String str = this.f143077e;
        if (str != null) {
            eVar.L(str);
        }
        boolean z14 = this.f143079g;
        String str2 = f143070k;
        int i15 = 2;
        String str3 = f143071l;
        String str4 = f143068i;
        if (i14 == 0) {
            if (z14) {
                eVar.P(t6.e.b.MATCH_CONSTRAINT);
                Object obj = this.f143078f;
                if (obj == str4) {
                    i15 = 1;
                } else if (obj != str3) {
                    i15 = 0;
                }
                eVar.Q(i15, this.f143075c, this.f143073a, this.f143074b);
                return;
            }
            int i16 = this.f143073a;
            if (i16 > 0) {
                if (i16 < 0) {
                    eVar.f162613f0 = 0;
                } else {
                    eVar.f162613f0 = i16;
                }
            }
            int i17 = this.f143074b;
            if (i17 < Integer.MAX_VALUE) {
                eVar.E[0] = i17;
            }
            Object obj2 = this.f143078f;
            if (obj2 == str4) {
                eVar.P(t6.e.b.WRAP_CONTENT);
                return;
            }
            if (obj2 == str2) {
                eVar.P(t6.e.b.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    eVar.P(t6.e.b.FIXED);
                    eVar.T(this.f143076d);
                    return;
                }
                return;
            }
        }
        if (z14) {
            eVar.R(t6.e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f143078f;
            if (obj3 == str4) {
                i15 = 1;
            } else if (obj3 != str3) {
                i15 = 0;
            }
            eVar.S(i15, this.f143075c, this.f143073a, this.f143074b);
            return;
        }
        int i18 = this.f143073a;
        if (i18 > 0) {
            if (i18 < 0) {
                eVar.f162615g0 = 0;
            } else {
                eVar.f162615g0 = i18;
            }
        }
        int i19 = this.f143074b;
        if (i19 < Integer.MAX_VALUE) {
            eVar.E[1] = i19;
        }
        Object obj4 = this.f143078f;
        if (obj4 == str4) {
            eVar.R(t6.e.b.WRAP_CONTENT);
            return;
        }
        if (obj4 == str2) {
            eVar.R(t6.e.b.MATCH_PARENT);
        } else if (obj4 == null) {
            eVar.R(t6.e.b.FIXED);
            eVar.O(this.f143076d);
        }
    }

    private c(Object obj) {
        this.f143073a = 0;
        this.f143074b = Integer.MAX_VALUE;
        this.f143075c = 1.0f;
        this.f143076d = 0;
        this.f143077e = null;
        this.f143079g = false;
        this.f143078f = obj;
    }
}
