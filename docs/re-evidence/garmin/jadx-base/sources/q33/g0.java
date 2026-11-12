package q33;

import com.google.android.gms.common.ConnectionResult;
import p43.g2;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g0 f142468l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f142469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f142470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f142471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f142472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f142473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f142474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f142475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f142476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g0 f142477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f142478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f142479k;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f142480a;

        static {
            int[] iArr = new int[g2.values().length];
            try {
                iArr[g2.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g2.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f142480a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new a(null);
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z24 = false;
        g0 g0Var = new g0(z14, z15, z16, z17, z18, null, false, null, null, z19, z24, 2047, null);
        boolean z25 = false;
        boolean z26 = false;
        boolean z27 = false;
        boolean z28 = false;
        g0 g0Var2 = null;
        g0 g0Var3 = null;
        g0 g0Var4 = new g0(z25, z26, z19, z24, z27, null, z28, g0Var2, g0Var3, false, true, 1023, null);
        boolean z29 = false;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        g0 g0Var5 = new g0(z25, z26, z19, z24, z27, objArr2, z28, g0Var2, g0Var3, true, z29, 1535, objArr);
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        new g0(z25, true, z19, z24, z27, objArr4, z28, g0Var2, g0Var3, false, z29, 2045, objArr3);
        f142468l = new g0(z14, z15, z16, z17, z18, g0Var, false, null, null, z19, z24, 2012, 0 == true ? 1 : 0);
        new g0(false, false, z19, z24, false, g0Var5, z28, g0Var2, g0Var3, true, z29, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 0 == true ? 1 : 0);
        p005kotlin.jvm.internal.j jVar = null;
        boolean z34 = false;
        g0 g0Var6 = null;
        g0 g0Var7 = null;
        new g0(z14, true, z16, z17, z18, g0Var, z34, g0Var6, g0Var7, z19, z24, 2012, jVar);
        boolean z35 = false;
        new g0(z14, z35, z16, true, z18, g0Var, z34, g0Var6, g0Var7, z19, z24, 2007, jVar);
        boolean z36 = false;
        boolean z37 = false;
        boolean z38 = true;
        boolean z39 = false;
        boolean z44 = false;
        boolean z45 = true;
        new g0(z36, z37, z19, z38, z39, g0Var4, z28, g0Var2, g0Var3, z44, z45, 983, 0 == true ? 1 : 0);
        new g0(z36, z37, z19, z38, z39, g0Var4, z28, g0Var2, g0Var3, z44, z45, 919, 0 == true ? 1 : 0);
        new g0(z14, z35, true, false, z18, g0Var, false, null, null, z19, false, 2008, null);
        Object[] objArr5 = 0 == true ? 1 : 0;
        new g0(true, true, z44, false, false, objArr5, true, null, null, false, false, 1980, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g0(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, g0 g0Var, boolean z19, g0 g0Var2, g0 g0Var3, boolean z24, boolean z25, int i14, p005kotlin.jvm.internal.j jVar) {
        z14 = (i14 & 1) != 0 ? true : z14;
        z15 = (i14 & 2) != 0 ? true : z15;
        z16 = (i14 & 4) != 0 ? false : z16;
        z17 = (i14 & 8) != 0 ? false : z17;
        z18 = (i14 & 16) != 0 ? false : z18;
        g0Var = (i14 & 32) != 0 ? null : g0Var;
        this(z14, z15, z16, z17, z18, g0Var, (i14 & 64) != 0 ? true : z19, (i14 & 128) != 0 ? g0Var : g0Var2, (i14 & 256) != 0 ? g0Var : g0Var3, (i14 & 512) != 0 ? false : z24, (i14 & 1024) != 0 ? false : z25);
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public g0(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, g0 g0Var, boolean z19, g0 g0Var2, g0 g0Var3, boolean z24, boolean z25) {
        this.f142469a = z14;
        this.f142470b = z15;
        this.f142471c = z16;
        this.f142472d = z17;
        this.f142473e = z18;
        this.f142474f = g0Var;
        this.f142475g = z19;
        this.f142476h = g0Var2;
        this.f142477i = g0Var3;
        this.f142478j = z24;
        this.f142479k = z25;
    }

    public g0() {
        this(false, false, false, false, false, null, false, null, null, false, false, 2047, null);
    }
}
