package kotlin;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import e5.a;
import h4.s;
import o2.c;
import o53.c0;
import p005kotlin.jvm.internal.r0;
import p1.t0;
import p3.a1;
import p3.e1;
import p3.e2;
import p3.s2;
import r53.o2;
import t13.e;
import t13.g;
import t13.h;
import u53.d;
import xy2.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j4 implements k4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [t13.g] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v3, types: [t13.g] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, i5.u2] */
    @Override // kotlin.k4
    public final s2 a(View view2) {
        g gVar;
        e2 e2Var;
        ?? u2Var;
        k4.a aVar = k4.a.f91252a;
        t0<Context, o2<Float>> t0Var = s4.f91480a;
        g gVar2 = h.f161748a;
        e.a aVar2 = e.f161746w0;
        gVar2.getClass();
        aVar2.getClass();
        r0.f91409k.getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gVar = (g) r0.f91410l.getValue();
        } else {
            gVar = r0.f91411m.get();
            if (gVar == null) {
                vb.h.z("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        g gVarPlus = gVar.plus(gVar2);
        e1 e1Var = (e1) gVarPlus.get(e1.f135069m0);
        if (e1Var != null) {
            e2Var = new e2(e1Var);
            a1 a1Var = e2Var.f135072b;
            synchronized (a1Var.f135030a) {
                a1Var.f135033d = false;
                p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
            }
        } else {
            e2Var = null;
        }
        r0 r0Var = new r0();
        s sVar = (s) gVarPlus.get(s.U);
        ?? r14 = sVar;
        if (sVar == null) {
            u2Var = new u2(view2.getContext().getApplicationContext());
            r0Var.f105810a = u2Var;
        }
        if (e2Var != null) {
            r14 = u2Var;
            gVar2 = e2Var;
        }
        r14 = u2Var;
        g gVarPlus2 = gVarPlus.plus(gVar2).plus(r14);
        s2 s2Var = new s2(gVarPlus2);
        synchronized (s2Var.f135276c) {
            s2Var.f135293t = true;
            p005kotlin.Unit unit2 = p005kotlin.Unit.INSTANCE;
        }
        d dVarA = c0.a(gVarPlus2);
        n0 n0VarR = b.r(view2);
        b0 f158017a = n0VarR != null ? n0VarR.getF158017a() : null;
        if (f158017a != null) {
            view2.addOnAttachStateChangeListener(new o4(view2, s2Var));
            f158017a.a(new p4(dVarA, e2Var, s2Var, r0Var));
            return s2Var;
        }
        a.c("ViewTreeLifecycleOwner not found from " + view2);
        c.f();
        return null;
    }
}
