package a03;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.b2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"La03/v;", "La5/a;", "flexible-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v implements a5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<Float, Unit> f220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b2 f221d;

    /* JADX WARN: Multi-variable type inference failed */
    public v(e23.l<? super Boolean, Unit> lVar, p pVar, e23.l<? super Float, Unit> lVar2, b2 b2Var) {
        this.f218a = lVar;
        this.f219b = pVar;
        this.f220c = lVar2;
        this.f221d = b2Var;
    }

    public final long a(float f14) {
        b2 b2Var = b2.Horizontal;
        b2 b2Var2 = this.f221d;
        float f15 = b2Var2 == b2Var ? f14 : 0.0f;
        if (b2Var2 != b2.Vertical) {
            f14 = 0.0f;
        }
        return gl1.y.f(f15, f14);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    public final Object mo1onPostFlingRZ2iAVY(long j8, long j14, t13.d<? super g6.s> dVar) {
        this.f218a.invoke(Boolean.FALSE);
        this.f220c.invoke(new Float(this.f221d == b2.Horizontal ? g6.s.c(j14) : g6.s.d(j14)));
        return g6.s.a(j14);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public final long mo2onPostScrollDzOQY0M(long j8, long j14, int i14) {
        a5.j.f1233b.getClass();
        int i15 = a5.j.f1236e;
        b2 b2Var = this.f221d;
        e23.l<Boolean, Unit> lVar = this.f218a;
        p pVar = this.f219b;
        if (i14 == i15) {
            lVar.invoke(Boolean.TRUE);
            return a(pVar.f158i.c(b2Var == b2.Horizontal ? n4.c.g(j14) : n4.c.h(j14)));
        }
        if (pVar.c() != y.Hidden && !pVar.f156g) {
            return a(pVar.f158i.c(b2Var == b2.Horizontal ? n4.c.g(j14) : n4.c.h(j14)));
        }
        lVar.invoke(Boolean.FALSE);
        n4.c.f123541b.getClass();
        return 0L;
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public final Object mo3onPreFlingQWom1Mo(long j8, t13.d<? super g6.s> dVar) {
        float fC = this.f221d == b2.Horizontal ? g6.s.c(j8) : g6.s.d(j8);
        p pVar = this.f219b;
        float f14 = pVar.f158i.f();
        if (fC >= 0.0f || f14 <= ((Number) pVar.f158i.f181l.getF182175a()).floatValue()) {
            g6.s.f76026b.getClass();
            j8 = 0;
        } else {
            this.f220c.invoke(new Float(fC));
        }
        return g6.s.a(j8);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public final long mo4onPreScrollOzD1aCk(long j8, int i14) {
        float fG = this.f221d == b2.Horizontal ? n4.c.g(j8) : n4.c.h(j8);
        e23.l<Boolean, Unit> lVar = this.f218a;
        p pVar = this.f219b;
        if (fG < 0.0f) {
            a5.j.f1233b.getClass();
            if (i14 == a5.j.f1236e) {
                lVar.invoke(Boolean.TRUE);
                return a(pVar.f158i.c(fG));
            }
        }
        if (fG > 0.0f) {
            a5.j.f1233b.getClass();
            if (i14 == a5.j.f1237f && pVar.c() == y.FullyExpanded && !pVar.f156g) {
                lVar.invoke(Boolean.FALSE);
                n4.c.f123541b.getClass();
                return 0L;
            }
        }
        if (fG > 0.0f && pVar.c() != y.FullyExpanded && !pVar.f156g) {
            lVar.invoke(Boolean.TRUE);
            return a(pVar.f158i.c(fG));
        }
        lVar.invoke(Boolean.FALSE);
        n4.c.f123541b.getClass();
        return 0L;
    }
}
