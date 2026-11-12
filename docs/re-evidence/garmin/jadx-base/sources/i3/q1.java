package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Li3/q1;", "", "Lo4/d0;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledUncheckedBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f89373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f89374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f89375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f89376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f89377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f89378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f89379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f89380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f89381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f89382l;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89383a;

        static {
            int[] iArr = new int[r5.a.values().length];
            try {
                iArr[r5.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r5.a.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r5.a.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f89383a = iArr;
        }
    }

    private q1(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28) {
        this.f89371a = j8;
        this.f89372b = j14;
        this.f89373c = j15;
        this.f89374d = j16;
        this.f89375e = j17;
        this.f89376f = j18;
        this.f89377g = j19;
        this.f89378h = j24;
        this.f89379i = j25;
        this.f89380j = j26;
        this.f89381k = j27;
        this.f89382l = j28;
    }

    public static s1.f0 a(r5.a aVar, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        if (aVar == r5.a.Off) {
            mVar.C(1539262271);
            s1.f0 f0VarB = k9.b(n3.h0.FastEffects, mVar);
            mVar.f();
            return f0VarB;
        }
        mVar.C(1539355581);
        s1.f0 f0VarB2 = k9.b(n3.h0.DefaultEffects, mVar);
        mVar.f();
        return f0VarB2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return o4.d0.d(this.f89371a, q1Var.f89371a) && o4.d0.d(this.f89372b, q1Var.f89372b) && o4.d0.d(this.f89373c, q1Var.f89373c) && o4.d0.d(this.f89374d, q1Var.f89374d) && o4.d0.d(this.f89375e, q1Var.f89375e) && o4.d0.d(this.f89376f, q1Var.f89376f) && o4.d0.d(this.f89377g, q1Var.f89377g) && o4.d0.d(this.f89378h, q1Var.f89378h) && o4.d0.d(this.f89379i, q1Var.f89379i) && o4.d0.d(this.f89380j, q1Var.f89380j) && o4.d0.d(this.f89381k, q1Var.f89381k) && o4.d0.d(this.f89382l, q1Var.f89382l);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f89382l) + q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(q6.f.e(Long.hashCode(this.f89371a) * 31, 31, this.f89372b), 31, this.f89373c), 31, this.f89374d), 31, this.f89375e), 31, this.f89376f), 31, this.f89377g), 31, this.f89378h), 31, this.f89379i), 31, this.f89380j), 31, this.f89381k);
    }

    public /* synthetic */ q1(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18, j19, j24, j25, j26, j27, j28);
    }
}
