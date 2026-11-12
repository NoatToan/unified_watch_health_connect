package cg2;

import androidx.room.a0;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.List;
import lc.u0;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcg2/c;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {
    public final String[] A;
    public final String[] B;
    public final String[] C;
    public final String[] D;
    public final String[] E;
    public final String[] F;
    public final String[] G;
    public final String[] H;
    public final String[] I;
    public final String[] J;
    public final String[] K;
    public final String[] L;
    public final String[] M;
    public final String[] N;
    public final String[] O;
    public final String[] P;
    public final List<String[]> Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f27246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f27247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f27248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f27249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f27250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f27251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f27252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f27253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String[] f27254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String[] f27255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String[] f27256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String[] f27257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String[] f27258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String[] f27259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String[] f27260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String[] f27261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String[] f27262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String[] f27263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String[] f27264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String[] f27265t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String[] f27266u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String[] f27267v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String[] f27268w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String[] f27269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String[] f27270y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String[] f27271z;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27272a;

        static {
            int[] iArr = new int[cg2.a.values().length];
            try {
                iArr[cg2.a.ADDUCTORS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cg2.a.TRICEPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cg2.a.TRAPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[cg2.a.LATS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[cg2.a.LOWER_BACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[cg2.a.ABDUCTORS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[cg2.a.GLUTES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[cg2.a.HAMSTRINGS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[cg2.a.CALVES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[cg2.a.SHOULDERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[cg2.a.CHEST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[cg2.a.BICEPS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[cg2.a.FOREARM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[cg2.a.OBLIQUES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[cg2.a.ABS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[cg2.a.HIPS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[cg2.a.QUADS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f27272a = iArr;
        }
    }

    public c() {
        String[] strArrA = a("BackNeckLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        String[] strArrA2 = a("BackNeckRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        String[] strArrA3 = a("BackTricepsLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27246a = strArrA3;
        String[] strArrA4 = a("BackTricepsRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27247b = strArrA4;
        String[] strArrA5 = a("BackForearmsLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27248c = strArrA5;
        String[] strArrA6 = a("BackForearmsRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27249d = strArrA6;
        String[] strArrA7 = a("BackShouldersLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27250e = strArrA7;
        String[] strArrA8 = a("BackShouldersRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27251f = strArrA8;
        String[] strArrA9 = a("BackTrapsLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27252g = strArrA9;
        String[] strArrA10 = a("BackTrapsRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27253h = strArrA10;
        String[] strArrA11 = a("BackLatsLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27254i = strArrA11;
        String[] strArrA12 = a("BackLatsRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27255j = strArrA12;
        String[] strArrA13 = a("BackLowerBackLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27256k = strArrA13;
        String[] strArrA14 = a("BackLowerBackRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27257l = strArrA14;
        String[] strArrA15 = a("BackAbductorsLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27258m = strArrA15;
        String[] strArrA16 = a("BackAbductorsRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27259n = strArrA16;
        String[] strArrA17 = a("BackAdductorsRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27260o = strArrA17;
        String[] strArrA18 = a("BackAdductorsLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27261p = strArrA18;
        String[] strArrA19 = a("BackGlutesLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27262q = strArrA19;
        String[] strArrA20 = a("BackGlutesRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27263r = strArrA20;
        String[] strArrA21 = a("BackHamstringsLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27264s = strArrA21;
        String[] strArrA22 = a("BackHamstringsRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27265t = strArrA22;
        String[] strArrA23 = a("BackCalvesLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27266u = strArrA23;
        String[] strArrA24 = a("BackCalvesRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27267v = strArrA24;
        String[] strArrA25 = a("FrontShouldersLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27268w = strArrA25;
        String[] strArrA26 = a("FrontShouldersRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27269x = strArrA26;
        String[] strArrA27 = a("FrontChestLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27270y = strArrA27;
        String[] strArrA28 = a("FrontChestRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.f27271z = strArrA28;
        String[] strArrA29 = a("FrontBicepsLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.A = strArrA29;
        String[] strArrA30 = a("FrontBicepsRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.B = strArrA30;
        String[] strArrA31 = a("FrontForearmsLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.C = strArrA31;
        String[] strArrA32 = a("FrontForearmsRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.D = strArrA32;
        String[] strArrA33 = a("FrontObliquesLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.E = strArrA33;
        String[] strArrA34 = a("FrontObliquesRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.F = strArrA34;
        String[] strArrA35 = a("FrontAbsLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.G = strArrA35;
        String[] strArrA36 = a("FrontAbsRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.H = strArrA36;
        String[] strArrA37 = a("FrontHipsLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.I = strArrA37;
        String[] strArrA38 = a("FrontHipsLeft", "2");
        this.J = strArrA38;
        String[] strArrA39 = a("FrontHipsLeft", "3");
        this.K = strArrA39;
        String[] strArrA40 = a("FrontHipsRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.L = strArrA40;
        String[] strArrA41 = a("FrontHipsRight", "2");
        this.M = strArrA41;
        String[] strArrA42 = a("FrontHipsRight", "3");
        this.N = strArrA42;
        String[] strArrA43 = a("FrontQuadsLeft", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.O = strArrA43;
        String[] strArrA44 = a("FrontQuadsRight", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        this.P = strArrA44;
        this.Q = x.k(strArrA, strArrA2, strArrA3, strArrA4, strArrA5, strArrA6, strArrA7, strArrA8, strArrA9, strArrA10, strArrA11, strArrA12, strArrA13, strArrA14, strArrA15, strArrA16, strArrA18, strArrA17, strArrA19, strArrA20, strArrA21, strArrA22, strArrA23, strArrA24, strArrA25, strArrA26, strArrA27, strArrA28, strArrA29, strArrA30, strArrA31, strArrA32, strArrA33, strArrA34, strArrA35, strArrA36, strArrA37, strArrA38, strArrA39, strArrA40, strArrA41, strArrA42, strArrA43, strArrA44);
    }

    public static String[] a(String str, String str2) {
        return new String[]{Marker.ANY_MARKER, str, a0.j("Fill ", str2, ".", str)};
    }

    public final List<String[]> b(cg2.a aVar) {
        if (aVar == null) {
            return null;
        }
        switch (a.f27272a[aVar.ordinal()]) {
            case 1:
                return x.k(this.f27261p, this.f27260o);
            case 2:
                return x.k(this.f27246a, this.f27247b);
            case 3:
                return x.k(this.f27252g, this.f27253h);
            case 4:
                return x.k(this.f27254i, this.f27255j);
            case 5:
                return x.k(this.f27256k, this.f27257l);
            case 6:
                return x.k(this.f27258m, this.f27259n);
            case 7:
                return x.k(this.f27262q, this.f27263r);
            case 8:
                return x.k(this.f27264s, this.f27265t);
            case 9:
                return x.k(this.f27266u, this.f27267v);
            case 10:
                return x.k(this.f27268w, this.f27269x, this.f27250e, this.f27251f);
            case 11:
                return x.k(this.f27270y, this.f27271z);
            case 12:
                return x.k(this.A, this.B);
            case 13:
                return x.k(this.C, this.D, this.f27248c, this.f27249d);
            case 14:
                return x.k(this.E, this.F);
            case 15:
                return x.k(this.G, this.H);
            case 16:
                return x.k(this.I, this.J, this.K, this.L, this.M, this.N);
            case 17:
                return x.k(this.O, this.P);
            default:
                u0.r();
                return null;
        }
    }
}
