package lc;

import android.content.Context;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llc/m0;", "Llc/y;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class m0 extends y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context) {
        super(context);
        context.getClass();
    }

    public final void u(androidx.lifecycle.n0 n0Var) {
        androidx.lifecycle.b0 lifecycle;
        n0Var.getClass();
        qc.h hVar = this.f111904b;
        androidx.lifecycle.a0 a0Var = hVar.f144332s;
        if (n0Var.equals(hVar.f144328o)) {
            return;
        }
        androidx.lifecycle.n0 n0Var2 = hVar.f144328o;
        if (n0Var2 != null && (lifecycle = n0Var2.getF158017a()) != null) {
            lifecycle.d(a0Var);
        }
        hVar.f144328o = n0Var;
        n0Var.getF158017a().a(a0Var);
    }

    public final void v(y1 y1Var) {
        y1Var.getClass();
        qc.h hVar = this.f111904b;
        hVar.getClass();
        z zVar = hVar.f144329p;
        z.f111916b.getClass();
        x1.b bVar = x1.f8070b;
        u9.a aVar = a0.f111719a;
        x1 x1VarB = x1.b.b(bVar, y1Var, aVar);
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        if (p005kotlin.jvm.internal.s.g(zVar, (z) x1VarB.b(t0Var.b(z.class)))) {
            return;
        }
        if (hVar.f144319f.isEmpty()) {
            hVar.f144329p = (z) x1.b.b(bVar, y1Var, aVar).b(t0Var.b(z.class));
        } else {
            vb.h.z("ViewModelStore should be set before setGraph call");
        }
    }
}
