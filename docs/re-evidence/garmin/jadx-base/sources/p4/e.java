package p4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp4/e;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f135544a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f135545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f135546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f135547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f135548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f135549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f135550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f135551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f135552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f135553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f135554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f135555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f135556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f135557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f135558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f135559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f135560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f135561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q f135562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t f135563t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k f135564u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q f135565v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q f135566w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final q f135567x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final l f135568y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c[] f135569z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f135545b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f135546c = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f135547d = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f135548e = rVar4;
        j.f135579a.getClass();
        s sVar = j.f135583e;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f135549f = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f135550g = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new org.apache.commons.lang3.e(21), new org.apache.commons.lang3.e(22), -0.799f, 2.399f, rVar, 2);
        f135551h = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f135552i = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f135553j = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f135554k = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f135555l = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f135556m = qVar8;
        int i14 = 96;
        p005kotlin.jvm.internal.j jVar = null;
        double d14 = 2.2222222222222223d;
        double d15 = 0.9099181073703367d;
        double d16 = 0.09008189262966333d;
        double d17 = 0.2222222222222222d;
        double d18 = 0.081d;
        double d19 = 0.0d;
        double d24 = 0.0d;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f135580b, new r(d14, d15, d16, d17, d18, d19, d24, i14, jVar), 8);
        f135557n = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(d14, d15, d16, d17, d18, d19, d24, i14, jVar), 9);
        f135558o = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f135559p = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f135581c, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, d19, d24, i14, jVar), 11);
        f135560q = qVar12;
        s sVar2 = j.f135582d;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f135561r = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f135562s = qVar14;
        t tVar = new t("Generic XYZ", 14);
        f135563t = tVar;
        k kVar = new k("Generic L*a*b*", 15);
        f135564u = kVar;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f135565v = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new org.apache.commons.lang3.e(23), new org.apache.commons.lang3.e(24), 0.0f, 1.0f, rVar3, 17);
        f135566w = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new org.apache.commons.lang3.e(25), new org.apache.commons.lang3.e(26), 0.0f, 1.0f, rVar4, 18);
        f135567x = qVar17;
        l lVar = new l("Oklab", 19);
        f135568y = lVar;
        f135569z = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, tVar, kVar, qVar15, qVar16, qVar17, lVar};
    }

    private e() {
    }

    public static double a(r rVar, double d14) {
        double d15 = d14 < 0.0d ? -1.0d : 1.0d;
        double d16 = d14 * d15;
        double d17 = rVar.f135619b;
        double d18 = rVar.f135620c;
        double d19 = rVar.f135621d;
        double d24 = rVar.f135622e;
        double d25 = rVar.f135623f;
        double d26 = d17 * d16;
        return (rVar.f135624g + 1.0d) * d15 * (d26 <= 1.0d ? Math.pow(d26, d18) : Math.exp((d16 - d25) * d19) + d24);
    }

    public static double b(r rVar, double d14) {
        double d15 = d14 < 0.0d ? -1.0d : 1.0d;
        double d16 = 1.0d / rVar.f135619b;
        double d17 = 1.0d / rVar.f135620c;
        double d18 = 1.0d / rVar.f135621d;
        double d19 = rVar.f135622e;
        double d24 = rVar.f135623f;
        double d25 = (d14 * d15) / (rVar.f135624g + 1.0d);
        return d15 * (d25 <= 1.0d ? Math.pow(d25, d17) * d16 : (Math.log(d25 - d19) * d18) + d24);
    }

    public static double c(r rVar, double d14) {
        double d15 = d14 < 0.0d ? -1.0d : 1.0d;
        double d16 = d14 * d15;
        double d17 = rVar.f135619b;
        double d18 = rVar.f135621d;
        double dPow = (Math.pow(d16, d18) * rVar.f135620c) + d17;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d16, d18) * rVar.f135623f) + rVar.f135622e), rVar.f135624g) * d15;
    }

    public static double d(r rVar, double d14) {
        double d15 = d14 < 0.0d ? -1.0d : 1.0d;
        double d16 = d14 * d15;
        double d17 = -rVar.f135619b;
        double d18 = rVar.f135622e;
        double d19 = 1.0d / rVar.f135624g;
        return Math.pow(Math.max((Math.pow(d16, d19) * d18) + d17, 0.0d) / ((Math.pow(d16, d19) * (-rVar.f135623f)) + rVar.f135620c), 1.0d / rVar.f135621d) * d15;
    }
}
