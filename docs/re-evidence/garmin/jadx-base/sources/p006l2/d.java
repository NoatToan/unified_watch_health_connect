package p006l2;

import d6.p;
import g6.q;
import g6.r;
import o53.f0;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import s5.c;
import s5.o;
import s5.p0;
import s5.q0;
import vb.h;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll2/d;", "Ll2/l2;", "Lg6/q;", "minFontSize", "maxFontSize", "stepSize", "<init>", "(JJJLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f108432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f108433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f108434d;

    private d(long j8, long j14, long j15) {
        this.f108432b = j8;
        this.f108433c = j14;
        this.f108434d = j15;
        q.a aVar = q.f76018b;
        aVar.getClass();
        long j16 = q.f76020d;
        if (q.b(j8, j16)) {
            h.s("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
            throw null;
        }
        aVar.getClass();
        if (q.b(j14, j16)) {
            h.s("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
            throw null;
        }
        aVar.getClass();
        if (q.b(j15, j16)) {
            h.s("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
            throw null;
        }
        if (r.b(q.c(j8), q.c(j14))) {
            f0.o(j8, j14);
            if (Float.compare(q.d(j8), q.d(j14)) > 0) {
                this.f108432b = j14;
            }
        }
        long jC = q.c(j15);
        r.f76022b.getClass();
        if (r.b(jC, r.f76023c)) {
            long jH = f0.H(1.0E-4f, 4294967296L);
            f0.o(j15, jH);
            if (Float.compare(q.d(j15), q.d(jH)) < 0) {
                h.s("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                throw null;
            }
        }
        if (q.d(this.f108432b) < 0.0f) {
            h.s("AutoSize.StepBased: minFontSize must not be negative");
            throw null;
        }
        if (q.d(j14) >= 0.0f) {
            return;
        }
        h.s("AutoSize.StepBased: maxFontSize must not be negative");
        throw null;
    }

    public static boolean b(q0 q0Var) {
        p0 p0Var = q0Var.f157280a;
        long j8 = q0Var.f157282c;
        o oVar = q0Var.f157281b;
        int i14 = p0Var.f157270f;
        p.f57793b.getClass();
        if (i14 == p.f57794c || i14 == p.f57796e) {
            return ((float) ((int) (j8 >> 32))) < oVar.f157255d || q0Var.d();
        }
        int i15 = p.f57797f;
        if (i14 != i15 && i14 != p.f57798g && i14 != p.f57795d) {
            e.r("TextOverflow type ", p.a(p0Var.f157270f), " is not supported.");
            return false;
        }
        int i16 = oVar.f157257f;
        if (i16 != 0) {
            if (i16 == 1) {
                return q0Var.m(0);
            }
            int i17 = p0Var.f157270f;
            if (i17 == i15 || i17 == p.f57798g) {
                return ((float) ((int) (j8 >> 32))) < oVar.f157255d || q0Var.d();
            }
            if (i17 == p.f57795d) {
                return q0Var.m(i16 - 1);
            }
        }
        return false;
    }

    @Override // p006l2.l2
    public final long a(f.a aVar, long j8, c cVar) {
        float fG0 = aVar.g0(this.f108434d);
        float fG1 = aVar.g0(this.f108432b);
        float fG2 = aVar.g0(this.f108433c);
        float f14 = 2;
        float f15 = (fG1 + fG2) / f14;
        float f16 = fG1;
        float f17 = fG2;
        while (f17 - f16 >= fG0) {
            if (b(aVar.e(j8, aVar.D(f15)))) {
                f17 = f15;
            } else {
                f16 = f15;
            }
            f15 = (f16 + f17) / f14;
        }
        float fFloor = (((float) Math.floor((f16 - fG1) / fG0)) * fG0) + fG1;
        float f18 = fG0 + fFloor;
        if (f18 <= fG2 && !b(aVar.e(j8, aVar.D(f18)))) {
            fFloor = f18;
        }
        return aVar.D(fFloor);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return q.b(dVar.f108432b, this.f108432b) && q.b(dVar.f108433c, this.f108433c) && q.b(dVar.f108434d, this.f108434d);
    }

    @Override // p006l2.l2
    public final int hashCode() {
        q.a aVar = q.f76018b;
        return Long.hashCode(this.f108434d) + q6.f.e(Long.hashCode(this.f108432b) * 31, 31, this.f108433c);
    }

    public /* synthetic */ d(long j8, long j14, long j15, j jVar) {
        this(j8, j14, j15);
    }
}
