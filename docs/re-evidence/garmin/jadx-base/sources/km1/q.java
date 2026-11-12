package km1;

/* JADX INFO: loaded from: classes10.dex */
public final class q {
    public static final j23.i a(p pVar) {
        pVar.getClass();
        b63.z.INSTANCE.getClass();
        b63.z zVarA = b63.z.Companion.a();
        b63.u uVarB = b(pVar);
        e53.j jVarC = uVarB != null ? b63.b.c(uVarB, zVarA) : null;
        if (jVarC == null || pVar.getOptimalSleepWindowStartMins() == null || pVar.getOptimalSleepWindowEndMins() == null) {
            return null;
        }
        int iIntValue = pVar.getOptimalSleepWindowStartMins().intValue();
        b63.i.INSTANCE.getClass();
        b63.i.e eVar = b63.i.f16188b;
        eVar.getClass();
        return j23.s.a(b63.b.e(b63.m.a(jVarC, iIntValue, eVar), zVarA), b63.b.e(b63.m.a(jVarC, pVar.getOptimalSleepWindowEndMins().intValue(), eVar), zVarA));
    }

    public static final b63.u b(p pVar) {
        b63.o oVarB;
        pVar.getClass();
        String calendarDate = pVar.getCalendarDate();
        if (calendarDate != null) {
            try {
                oVarB = b63.o.Companion.b(b63.o.INSTANCE, calendarDate);
            } catch (Exception unused) {
                oVarB = null;
            }
        } else {
            oVarB = null;
        }
        if (oVarB != null) {
            return b63.q.b(oVarB, 0, 0);
        }
        return null;
    }

    public static final r c(p pVar) {
        Object next;
        w13.c cVar = r.f105571n;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            next = bVarN.next();
            if (p005kotlin.jvm.internal.s.g(((r) next).f105572a, pVar.getStatus())) {
                return (r) next;
            }
        }
        next = null;
        return (r) next;
    }
}
