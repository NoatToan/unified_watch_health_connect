package i41;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.m;
import p3.n;
import p3.x1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Li41/h;", "", "", Action.KEY_ATTRIBUTE, "", "status", "Lo92/e;", "iconShape", "", "fill", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILo92/e;Z)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f90942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f90943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f90944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f90945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f90946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f90947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f90948k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f90949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f90950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f90951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ h[] f90952o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o92.e f90955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f90956d;

    static {
        o92.e eVar = o92.e.DIAMOND;
        h hVar = new h("NO_STATUS", 0, "NONE", R.string.ohrv_summary_status_no_status, eVar, false, 8, null);
        f90943f = hVar;
        h hVar2 = new h("BALANCED", 1, "BALANCED", R.string.ohrv_summary_status_balanced, o92.e.CIRCLE, false, 8, null);
        f90944g = hVar2;
        int i14 = 8;
        j jVar = null;
        boolean z14 = false;
        h hVar3 = new h("INVALID", 2, "INVALID", R.string.ohrv_summary_status_invalid, eVar, z14, i14, jVar);
        f90945h = hVar3;
        o92.e eVar2 = o92.e.TRIANGLE;
        h hVar4 = new h("LOW", 3, "LOW", R.string.ohrv_summary_status_low, eVar2, false, 8, null);
        f90946i = hVar4;
        h hVar5 = new h("POOR", 4, "POOR", R.string.ohrv_summary_status_poor, eVar2, false);
        f90947j = hVar5;
        o92.e eVar3 = o92.e.RECTANGLE;
        h hVar6 = new h("UNBALANCED", 5, "UNBALANCED", R.string.ohrv_summary_status_unbalanced, eVar3, false, 8, null);
        f90948k = hVar6;
        int i15 = 8;
        j jVar2 = null;
        boolean z15 = false;
        h hVar7 = new h("UNBALANCED_LOW", 6, "UNBALANCED_LOW", R.string.ohrv_summary_status_unbalanced, eVar3, z15, i15, jVar2);
        f90949l = hVar7;
        h hVar8 = new h("UNBALANCED_UPPER", 7, "UNBALANCED_UPPER", R.string.ohrv_summary_status_unbalanced, eVar3, z15, i15, jVar2);
        f90950m = hVar8;
        h hVar9 = new h("NONE", 8, "NONE", R.string.ohrv_summary_status_no_status, eVar, z14, i14, jVar);
        f90951n = hVar9;
        f90952o = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9};
        f90942e = new a(null);
    }

    public /* synthetic */ h(String str, int i14, String str2, int i15, o92.e eVar, boolean z14, int i16, j jVar) {
        this(str, i14, str2, i15, eVar, (i16 & 8) != 0 ? true : z14);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f90952o.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li41/h$a;", "", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: i41.h$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1746a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f90957a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.f90943f.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.f90944g.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h.f90945h.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[h.f90946i.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[h.f90947j.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[h.f90948k.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[h.f90949l.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[h.f90950m.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[h.f90951n.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                f90957a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static long a(h hVar, m mVar) {
            hVar.getClass();
            x1 x1Var = n.f135158a;
            switch (C1746a.f90957a[hVar.ordinal()]) {
                case 1:
                    mVar.C(-698863608);
                    mVar.f();
                    gl.c.f77766a.getClass();
                    return gl.c.f77767b.f77805s;
                case 2:
                    mVar.C(-698861554);
                    gl.c.f77766a.getClass();
                    long jD = gl.c.a(mVar).d();
                    mVar.f();
                    return jD;
                case 3:
                    mVar.C(-698859352);
                    mVar.f();
                    gl.c.f77766a.getClass();
                    return gl.c.f77767b.f77805s;
                case 4:
                    mVar.C(-698857460);
                    gl.c.f77766a.getClass();
                    long jL = gl.c.a(mVar).l();
                    mVar.f();
                    return jL;
                case 5:
                    mVar.C(-698855412);
                    gl.c.f77766a.getClass();
                    long jL2 = gl.c.a(mVar).l();
                    mVar.f();
                    return jL2;
                case 6:
                    mVar.C(-698853169);
                    gl.c.f77766a.getClass();
                    long jH = gl.c.a(mVar).h();
                    mVar.f();
                    return jH;
                case 7:
                    mVar.C(-698850705);
                    gl.c.f77766a.getClass();
                    long jH2 = gl.c.a(mVar).h();
                    mVar.f();
                    return jH2;
                case 8:
                    mVar.C(-698848177);
                    gl.c.f77766a.getClass();
                    long jH3 = gl.c.a(mVar).h();
                    mVar.f();
                    return jH3;
                case 9:
                    mVar.C(-698846040);
                    mVar.f();
                    gl.c.f77766a.getClass();
                    return gl.c.f77767b.f77805s;
                default:
                    throw n23.j.m(mVar, -698865277);
            }
        }

        private a() {
        }
    }

    private h(String str, int i14, String str2, int i15, o92.e eVar, boolean z14) {
        super(str, i14);
        this.f90953a = str2;
        this.f90954b = i15;
        this.f90955c = eVar;
        this.f90956d = z14;
    }
}
