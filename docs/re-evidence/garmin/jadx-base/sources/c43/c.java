package c43;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.List;
import p13.j0;
import p13.w;
import p43.g2;
import p43.n0;
import p43.t1;
import q43.m;
import t23.d1;
import t23.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f24441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f24442b;

    public c(t1 t1Var) {
        t1Var.getClass();
        this.f24441a = t1Var;
        t1Var.a();
        g2 g2Var = g2.INVARIANT;
    }

    @Override // p43.m1
    public final boolean C() {
        return false;
    }

    @Override // p43.m1
    public final Collection<n0> b() {
        t1 t1Var = this.f24441a;
        n0 type = t1Var.a() == g2.OUT_VARIANCE ? t1Var.getType() : e().p();
        type.getClass();
        return w.c(type);
    }

    @Override // p43.m1
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d e() {
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE = this.f24441a.getType().F0().e();
        dVarE.getClass();
        return dVarE;
    }

    @Override // p43.m1
    public final List<d1> getParameters() {
        return j0.f134944a;
    }

    @Override // c43.b
    public final t1 getProjection() {
        return this.f24441a;
    }

    @Override // p43.m1
    public final /* bridge */ /* synthetic */ h t() {
        return null;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f24441a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
