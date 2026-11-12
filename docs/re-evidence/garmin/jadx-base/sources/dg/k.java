package dg;

import androidx.lifecycle.b0;
import androidx.lifecycle.m0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, androidx.lifecycle.m0, dg.j] */
    public static final Object a(b0 b0Var, v13.c cVar) throws Throwable {
        i iVar;
        b0 b0Var2;
        r0 r0Var;
        Throwable th3;
        b0 b0Var3;
        m0 m0Var;
        m0 m0Var2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f59481d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f59481d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(cVar);
            }
        } else {
            iVar = new i(cVar);
        }
        Object obj = iVar.f59480c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f59481d;
        if (i15 != 0) {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = iVar.f59479b;
            b0Var2 = iVar.f59478a;
            try {
                o13.r.b(obj);
                b0Var3 = b0Var2;
                m0Var2 = (m0) r0Var.f105810a;
                if (m0Var2 != null) {
                    b0Var3.d(m0Var2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                th3 = th4;
                m0Var = (m0) r0Var.f105810a;
                if (m0Var != null) {
                    b0Var2.d(m0Var);
                }
                throw th3;
            }
        }
        o13.r.b(obj);
        if (b0Var.getF7973d().a(b0.b.STARTED)) {
            return Unit.INSTANCE;
        }
        r0 r0Var2 = new r0();
        try {
            iVar.f59478a = b0Var;
            iVar.f59479b = r0Var2;
            iVar.f59481d = 1;
            o53.k kVar = new o53.k(u13.f.b(iVar), 1);
            kVar.q();
            ?? jVar = new j(kVar);
            r0Var2.f105810a = jVar;
            b0Var.a(jVar);
            if (kVar.p() == aVar) {
                return aVar;
            }
            b0Var3 = b0Var;
            r0Var = r0Var2;
            m0Var2 = (m0) r0Var.f105810a;
            if (m0Var2 != null) {
                b0Var3.d(m0Var2);
            }
            return Unit.INSTANCE;
        } catch (Throwable th5) {
            b0Var2 = b0Var;
            r0Var = r0Var2;
            th3 = th5;
            m0Var = (m0) r0Var.f105810a;
            if (m0Var != null) {
                b0Var2.d(m0Var);
            }
            throw th3;
        }
    }
}
