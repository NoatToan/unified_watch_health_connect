package s23;

import com.garmin.proto.generated.GDIInReachMessaging;
import java.io.InputStream;
import java.util.List;
import l43.b0;
import t23.c0;
import t23.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends l43.c {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(o43.n nVar, q33.v vVar, c0 c0Var, g0 g0Var, v23.a aVar, v23.c cVar, l43.o oVar, q43.n nVar2, h43.a aVar2) {
        super(nVar, vVar, c0Var);
        nVar.getClass();
        vVar.getClass();
        c0Var.getClass();
        g0Var.getClass();
        aVar.getClass();
        cVar.getClass();
        oVar.getClass();
        nVar2.getClass();
        aVar2.getClass();
        l43.q qVar = new l43.q(this);
        m43.a aVar3 = m43.a.f116638q;
        l43.f fVar = new l43.f(c0Var, g0Var, aVar3);
        b0.a aVar4 = b0.a.f109987a;
        l43.w.a aVar5 = l43.w.f110117a;
        aVar5.getClass();
        b33.a.C0220a c0220a = b33.a.C0220a.f15678a;
        l43.x.a aVar6 = l43.x.a.f110119a;
        List listK = p13.x.k(new r23.a(nVar, c0Var), new g(nVar, c0Var, null, 4, null));
        l43.m.f110048a.getClass();
        this.f109991d = new l43.n(nVar, c0Var, oVar, qVar, fVar, this, aVar4, aVar5, c0220a, aVar6, listK, g0Var, l43.m.a.f110050b, aVar, cVar, aVar3.f102882a, nVar2, aVar2, null, l43.z.f110134a, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, null);
    }

    @Override // l43.c
    public final p005kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a d(x33.c cVar) {
        cVar.getClass();
        InputStream inputStreamA = this.f109989b.a(cVar);
        if (inputStreamA == null) {
            return null;
        }
        p005kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f105962m.getClass();
        return p005kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.C2041a.a(cVar, this.f109988a, this.f109990c, inputStreamA, false);
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
