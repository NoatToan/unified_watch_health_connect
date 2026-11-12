package p008y1;

import e23.p;
import o13.r;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import s1.k;
import t13.d;
import u1.k1;
import u13.a;
import v13.c;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class m2 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(e3 e3Var, float f14, k kVar, c cVar) {
        h2 h2Var;
        o0 o0Var;
        if (cVar instanceof h2) {
            h2Var = (h2) cVar;
            int i14 = h2Var.f193253c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h2Var.f193253c = i14 - Integer.MIN_VALUE;
            } else {
                h2Var = new h2(cVar);
            }
        } else {
            h2Var = new h2(cVar);
        }
        Object obj = h2Var.f193252b;
        Object obj2 = a.COROUTINE_SUSPENDED;
        int i15 = h2Var.f193253c;
        if (i15 == 0) {
            r.b(obj);
            o0 o0Var2 = new o0();
            p<? super o2, ? super d<? super Unit>, ? extends Object> i2Var = new i2(f14, kVar, o0Var2, null);
            h2Var.f193251a = o0Var2;
            h2Var.f193253c = 1;
            if (e3Var.b(k1.Default, i2Var, h2Var) == obj2) {
                return obj2;
            }
            o0Var = o0Var2;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o0Var = h2Var.f193251a;
            r.b(obj);
        }
        return new Float(o0Var.f105806a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(e3 e3Var, float f14, c cVar) {
        j2 j2Var;
        o0 o0Var;
        if (cVar instanceof j2) {
            j2Var = (j2) cVar;
            int i14 = j2Var.f193337c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j2Var.f193337c = i14 - Integer.MIN_VALUE;
            } else {
                j2Var = new j2(cVar);
            }
        } else {
            j2Var = new j2(cVar);
        }
        Object obj = j2Var.f193336b;
        Object obj2 = a.COROUTINE_SUSPENDED;
        int i15 = j2Var.f193337c;
        if (i15 == 0) {
            r.b(obj);
            o0 o0Var2 = new o0();
            p<? super o2, ? super d<? super Unit>, ? extends Object> k2Var = new k2(o0Var2, f14, null);
            j2Var.f193335a = o0Var2;
            j2Var.f193337c = 1;
            if (e3Var.b(k1.Default, k2Var, j2Var) == obj2) {
                return obj2;
            }
            o0Var = o0Var2;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o0Var = j2Var.f193335a;
            r.b(obj);
        }
        return new Float(o0Var.f105806a);
    }
}
