package a3;

import p3.c2;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y3 f849a = new y3(new a03.d(4));

    /* JADX WARN: Multi-variable type inference failed */
    public static final long a(long j8, p3.m mVar) {
        long j14;
        x1 x1Var = p3.n.f135158a;
        mVar.C(-583917585);
        o0.f762a.getClass();
        t tVarA = o0.a(mVar);
        long jA = tVarA.a();
        c2 c2Var = tVarA.f828i;
        c2 c2Var2 = tVarA.f827h;
        if (o4.d0.d(j8, jA) || o4.d0.d(j8, ((o4.d0) tVarA.f821b.getF182175a()).f128833a)) {
            j14 = ((o4.d0) c2Var2.getF182175a()).f128833a;
        } else if (o4.d0.d(j8, ((o4.d0) tVarA.f822c.getF182175a()).f128833a) || o4.d0.d(j8, ((o4.d0) tVarA.f823d.getF182175a()).f128833a)) {
            j14 = ((o4.d0) c2Var.getF182175a()).f128833a;
        } else if (o4.d0.d(j8, ((o4.d0) tVarA.f824e.getF182175a()).f128833a)) {
            j14 = ((o4.d0) tVarA.f829j.getF182175a()).f128833a;
        } else if (o4.d0.d(j8, tVarA.b())) {
            j14 = ((o4.d0) tVarA.f830k.getF182175a()).f128833a;
        } else if (o4.d0.d(j8, ((o4.d0) tVarA.f826g.getF182175a()).f128833a)) {
            j14 = ((o4.d0) tVarA.f831l.getF182175a()).f128833a;
        } else {
            o4.d0.f128823b.getClass();
            j14 = o4.d0.f128832k;
        }
        if (j14 == 16) {
            j14 = ((o4.d0) mVar.A(x.f872a)).f128833a;
        }
        mVar.f();
        return j14;
    }
}
