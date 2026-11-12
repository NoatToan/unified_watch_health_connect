package fg2;

import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class q<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f71550a;

    public q(f fVar) {
        this.f71550a = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        Object value;
        sf2.e eVar = (sf2.e) obj;
        boolean z14 = eVar instanceof sf2.e.h;
        f fVar = this.f71550a;
        if (z14) {
            fVar.f71485i.k(null, Boolean.TRUE);
        } else if (eVar instanceof sf2.e.b) {
            fVar.f71483g.setValue(((sf2.e.b) eVar).f158951a);
        } else if (eVar instanceof sf2.e.f) {
            zg2.c cVar = zg2.c.f204692a;
            sf2.e.f fVar2 = (sf2.e.f) eVar;
            yf2.a aVar = fVar2.f158961a;
            UUID uuid = fVar2.f158962b;
            cVar.getClass();
            zg2.c.a("LiveActivityRepository", "Value estimation completed for sessionUuid:" + uuid + " valueEstimationType:" + aVar);
            p2 p2Var = fVar.f71495s;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, new o13.p(uuid, aVar)));
        }
        return Unit.INSTANCE;
    }
}
