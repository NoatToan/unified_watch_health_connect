package p003ji0;

import d53.w;
import e2.f0;
import e23.l;
import ii0.v;
import j02.r;
import li0.d0;
import li0.f;
import p005kotlin.Unit;
import u2.h;
import z3.e;
import zc.a;
import zc.d;

/* JADX INFO: loaded from: classes8.dex */
public final class o {
    public static final void a(f0 f0Var, d<d0> dVar, boolean z14, h hVar, f fVar, Boolean bool, l<? super f0, Unit> lVar) {
        f0Var.getClass();
        dVar.getClass();
        hVar.getClass();
        fVar.getClass();
        int length = w.i0(hVar.b().f167839c).length();
        if (bool != null ? bool.booleanValue() : length == 0) {
            lVar.invoke(f0Var);
            return;
        }
        if (length == 1) {
            i.f98783a.getClass();
            f0.b(f0Var, null, i.f98784b, 3);
            return;
        }
        if (2 <= length && length <= Integer.MAX_VALUE) {
            if (z14) {
                for (int i14 = 0; i14 < 15; i14++) {
                    i.f98783a.getClass();
                    f0.b(f0Var, null, i.f98785c, 3);
                }
                return;
            }
            if (dVar.b() != 0) {
                f0.f(f0Var, dVar.b(), new a(new r(24), dVar), new e(-360093170, true, new v(dVar, fVar, 3)), 4);
            } else {
                i.f98783a.getClass();
                f0.b(f0Var, null, i.f98786d, 3);
            }
        }
    }
}
