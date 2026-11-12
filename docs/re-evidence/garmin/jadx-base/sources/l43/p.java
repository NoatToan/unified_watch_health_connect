package l43;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f110085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u33.d f110086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t23.l f110087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u33.h f110088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u33.j f110089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u33.a f110090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n43.v f110091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0 f110092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l0 f110093i;

    public p(n nVar, u33.d dVar, t23.l lVar, u33.h hVar, u33.j jVar, u33.a aVar, n43.v vVar, x0 x0Var, List<s33.u> list) {
        nVar.getClass();
        dVar.getClass();
        lVar.getClass();
        hVar.getClass();
        jVar.getClass();
        aVar.getClass();
        list.getClass();
        this.f110085a = nVar;
        this.f110086b = dVar;
        this.f110087c = lVar;
        this.f110088d = hVar;
        this.f110089e = jVar;
        this.f110090f = aVar;
        this.f110091g = vVar;
        this.f110092h = new x0(this, x0Var, list, "Deserializer for \"" + lVar.getName() + CoreConstants.DOUBLE_QUOTE_CHAR, vVar != null ? vVar.b() : "[container not found]");
        this.f110093i = new l0(this);
    }

    public final p a(t23.l lVar, List<s33.u> list, u33.d dVar, u33.h hVar, u33.j jVar, u33.a aVar) {
        list.getClass();
        jVar.getClass();
        int i14 = aVar.f168291b;
        if ((i14 != 1 || aVar.f168292c < 4) && i14 <= 1) {
            jVar = this.f110089e;
        }
        return new p(this.f110085a, dVar, lVar, hVar, jVar, aVar, this.f110091g, this.f110092h, list);
    }
}
