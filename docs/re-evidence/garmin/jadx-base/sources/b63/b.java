package b63;

import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDateTime;
import kotlinx.datetime.DateTimeArithmeticException;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static e53.j a(o oVar, z zVar) {
        x.f16223a.getClass();
        x xVar = x.f16224b;
        oVar.getClass();
        zVar.getClass();
        xVar.getClass();
        Instant instant = oVar.f16206a.atStartOfDay(zVar.f16227a).toInstant();
        instant.getClass();
        return f53.a.b(instant);
    }

    public static final int b(w wVar) {
        wVar.getClass();
        return wVar.ordinal() + 1;
    }

    public static e53.j c(u uVar, z zVar) {
        x.f16223a.getClass();
        x xVar = x.f16224b;
        uVar.getClass();
        zVar.getClass();
        xVar.getClass();
        Instant instant = uVar.f16216a.atZone(zVar.f16227a).toInstant();
        instant.getClass();
        return f53.a.b(instant);
    }

    @o13.e
    public static final u d(l lVar, z zVar) {
        lVar.getClass();
        zVar.getClass();
        return e(n.b(lVar), zVar);
    }

    public static final u e(e53.j jVar, z zVar) {
        jVar.getClass();
        zVar.getClass();
        try {
            return new u(LocalDateTime.ofInstant(f53.a.a(jVar), zVar.f16227a));
        } catch (DateTimeException e4) {
            throw new DateTimeArithmeticException(e4);
        }
    }

    @o13.e
    public static final o f(a aVar, z zVar) {
        aVar.getClass();
        e eVar = aVar instanceof e ? (e) aVar : null;
        return g(eVar != null ? eVar.f16182a : new y(aVar), zVar);
    }

    public static final o g(e53.a aVar, z zVar) {
        aVar.getClass();
        return e(aVar.a(), zVar).b();
    }
}
