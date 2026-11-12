package rd;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p63.h;
import r53.z1;
import sd.l;
import sd.m;
import sd.n;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p63.c f151997a;

    static {
        p63.f fVar = new p63.f();
        l lVar = l.f158583a;
        t0 t0Var = s0.f105811a;
        fVar.a(t0Var.b(Bundle.class), lVar);
        fVar.c(t0Var.b(z1.class), new r82.e(14));
        p63.c cVarF = fVar.f();
        p63.f fVar2 = new p63.f();
        fVar2.a(t0Var.b(Size.class), n.f158587a);
        fVar2.a(t0Var.b(SizeF.class), m.f158585a);
        fVar2.c(t0Var.b(SparseArray.class), new r82.e(15));
        p63.c cVarF2 = fVar2.f();
        p63.c cVar = h.f136264a;
        p63.f fVar3 = new p63.f();
        cVarF.a(fVar3);
        cVarF2.a(fVar3);
        f151997a = fVar3.f();
    }
}
