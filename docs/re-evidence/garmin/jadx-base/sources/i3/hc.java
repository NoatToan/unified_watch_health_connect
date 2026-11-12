package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li3/hc;", "La5/a;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hc implements a5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc f88320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Float, Unit> f88321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p008y1.b2 f88322c;

    /* JADX WARN: Multi-variable type inference failed */
    public hc(mc mcVar, e23.l<? super Float, Unit> lVar, p008y1.b2 b2Var) {
        this.f88320a = mcVar;
        this.f88321b = lVar;
        this.f88322c = b2Var;
    }

    public final long a(float f14) {
        p008y1.b2 b2Var = p008y1.b2.Horizontal;
        p008y1.b2 b2Var2 = this.f88322c;
        float f15 = b2Var2 == b2Var ? f14 : 0.0f;
        if (b2Var2 != p008y1.b2.Vertical) {
            f14 = 0.0f;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo1onPostFlingRZ2iAVY(long j8, long j14, t13.d<? super g6.s> dVar) {
        this.f88321b.invoke(new Float(this.f88322c == p008y1.b2.Horizontal ? g6.s.c(j14) : g6.s.d(j14)));
        return g6.s.a(j14);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo2onPostScrollDzOQY0M(long j8, long j14, int i14) {
        a5.j.f1233b.getClass();
        if (i14 == a5.j.f1234c) {
            return a(this.f88320a.f88996e.d(Float.intBitsToFloat((int) (this.f88322c == p008y1.b2.Horizontal ? j14 >> 32 : j14 & 4294967295L))));
        }
        n4.c.f123541b.getClass();
        return 0L;
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo3onPreFlingQWom1Mo(long j8, t13.d<? super g6.s> dVar) {
        float fC = this.f88322c == p008y1.b2.Horizontal ? g6.s.c(j8) : g6.s.d(j8);
        mc mcVar = this.f88320a;
        float fH = mcVar.f88996e.h();
        float fE = mcVar.f88996e.e().e();
        if (fC >= 0.0f || fH <= fE) {
            g6.s.f76026b.getClass();
            j8 = 0;
        } else {
            this.f88321b.invoke(new Float(fC));
        }
        return g6.s.a(j8);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo4onPreScrollOzD1aCk(long j8, int i14) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f88322c == p008y1.b2.Horizontal ? j8 >> 32 : j8 & 4294967295L));
        if (fIntBitsToFloat < 0.0f) {
            a5.j.f1233b.getClass();
            if (i14 == a5.j.f1234c) {
                return a(this.f88320a.f88996e.d(fIntBitsToFloat));
            }
        }
        n4.c.f123541b.getClass();
        return 0L;
    }
}
