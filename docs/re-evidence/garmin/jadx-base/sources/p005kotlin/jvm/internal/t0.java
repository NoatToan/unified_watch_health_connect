package p005kotlin.jvm.internal;

import java.util.List;
import k23.d;
import k23.f;
import k23.g;
import k23.i;
import k23.j;
import k23.m;
import k23.n;
import k23.o;
import k23.p;

/* JADX INFO: loaded from: classes3.dex */
public class t0 {
    public g a(p pVar) {
        return pVar;
    }

    public d b(Class cls) {
        return new h(cls);
    }

    public f c(Class cls) {
        return new d0(cls, "");
    }

    public p d(p pVar) {
        a1 a1Var = (a1) pVar;
        return new a1(pVar.getF105782a(), pVar.h(), a1Var.f105784c, a1Var.f105785d | 2);
    }

    public i e(y yVar) {
        return yVar;
    }

    public j f(a0 a0Var) {
        return a0Var;
    }

    public m g(f0 f0Var) {
        return f0Var;
    }

    public n h(h0 h0Var) {
        return h0Var;
    }

    public o i(j0 j0Var) {
        return j0Var;
    }

    public String j(o oVar) {
        String string = oVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String k(w wVar) {
        return j(wVar);
    }

    public p l(d dVar, List list, boolean z14) {
        return new a1(dVar, list, z14);
    }
}
