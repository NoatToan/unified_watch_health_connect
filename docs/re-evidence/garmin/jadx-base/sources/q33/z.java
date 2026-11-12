package q33;

import ch.qos.logback.core.CoreConstants;
import n43.m0;
import t23.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements n43.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f142541b;

    public z(x xVar, l43.y<u33.c> yVar, m0 m0Var, n43.u uVar) {
        xVar.getClass();
        m0Var.getClass();
        uVar.getClass();
        this.f142541b = xVar;
    }

    @Override // t23.y0
    public final z0.a a() {
        z0.a aVar = z0.f162077a;
        aVar.getClass();
        return aVar;
    }

    @Override // n43.v
    public final String b() {
        return androidx.room.a0.m(new StringBuilder("Class '"), this.f142541b.d().a().f188596a.f188600a, CoreConstants.SINGLE_QUOTE_CHAR);
    }

    public final String toString() {
        return z.class.getSimpleName() + ": " + this.f142541b;
    }
}
