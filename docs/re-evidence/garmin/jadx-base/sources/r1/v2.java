package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lr1/v2;", "Lh4/r$c;", "Lh5/s;", "Ls1/t1;", "Lr1/r0;", "transition", "Ls1/t1$a;", "Lo4/d0;", "Ls1/q;", "veilAnimation", "Lr1/u1;", "enter", "Lr1/w1;", "exit", "<init>", "(Ls1/t1;Ls1/t1$a;Lr1/u1;Lr1/w1;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v2 extends h4.r.c implements h5.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s1.t1<r0>.a<o4.d0, s1.q> f149296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u1 f149297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w1 f149298c;

    public v2(s1.t1<r0> t1Var, s1.t1<r0>.a<o4.d0, s1.q> aVar, u1 u1Var, w1 w1Var) {
        this.f149296a = aVar;
        this.f149297b = u1Var;
        this.f149298c = w1Var;
    }

    @Override // h5.s
    public final void p(h5.h0 h0Var) {
        long jFloatToRawIntBits;
        h0Var.m1();
        s1.t1.a.C2947a c2947aA = this.f149296a.a(new t2(this), new u2(this));
        if (o4.d0.e(((o4.d0) c2947aA.getF182175a()).f128833a) == 0.0f) {
            return;
        }
        r2 r2Var = this.f149297b.getF149295c().f149185e;
        if (r2Var == null) {
            r2Var = this.f149298c.getF149312d().f149185e;
        }
        if (r2Var == null || !r2Var.f149225d) {
            q4.f.A0(h0Var, ((o4.d0) c2947aA.getF182175a()).f128833a, 0L, 0L, 0.0f, null, null, 126);
            return;
        }
        h5.c1 c1VarF = h5.k.f(this);
        f5.c0 c0VarY = c1VarF.y();
        if (c0VarY != null) {
            long j8 = ((h5.c1) c0VarY).f69146c;
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j8 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j8 >> 32)) << 32);
            n4.g.a aVar = n4.g.f123559b;
        } else {
            n4.g.f123559b.getClass();
            jFloatToRawIntBits = 0;
        }
        long j14 = jFloatToRawIntBits;
        long jD = f5.d0.d(c1VarF);
        n4.c.a aVar2 = n4.c.f123541b;
        q4.f.A0(h0Var, ((o4.d0) c2947aA.getF182175a()).f128833a, jD ^ (-9223372034707292160L), j14, 0.0f, null, null, 120);
    }
}
