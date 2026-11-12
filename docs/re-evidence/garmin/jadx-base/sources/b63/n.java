package b63;

import com.google.android.exoplayer2.C;
import java.time.DateTimeException;
import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public static final l a(e53.j jVar) throws Exception {
        jVar.getClass();
        l.Companion companion = l.INSTANCE;
        long j8 = jVar.f63115a;
        int i14 = jVar.f63116b;
        companion.getClass();
        try {
            Instant instantOfEpochSecond = Instant.ofEpochSecond(j8, i14);
            instantOfEpochSecond.getClass();
            return new l(instantOfEpochSecond);
        } catch (Exception e4) {
            if ((e4 instanceof ArithmeticException) || (e4 instanceof DateTimeException)) {
                return j8 > 0 ? l.f16203d : l.f16202c;
            }
            throw e4;
        }
    }

    public static final e53.j b(l lVar) {
        lVar.getClass();
        e53.j.a aVar = e53.j.f63112c;
        Instant instant = lVar.f16204a;
        long epochSecond = instant.getEpochSecond();
        long nano = instant.getNano();
        aVar.getClass();
        return e53.j.a.b(epochSecond, nano);
    }

    @o13.e
    public static final long c(l lVar, l lVar2, i.e eVar) {
        lVar.getClass();
        Instant instant = lVar.f16204a;
        lVar2.getClass();
        Instant instant2 = lVar2.f16204a;
        eVar.getClass();
        try {
            long epochSecond = instant2.getEpochSecond() - instant.getEpochSecond();
            long nano = instant2.getNano() - instant.getNano();
            long j8 = eVar.f16196h;
            if (epochSecond > 0 && nano < 0) {
                epochSecond--;
                nano += C.NANOS_PER_SECOND;
            } else if (epochSecond < 0 && nano > 0) {
                epochSecond++;
                nano -= C.NANOS_PER_SECOND;
            }
            if (epochSecond == 0) {
                return nano / j8;
            }
            d63.b bVarB = d63.c.b(epochSecond, C.NANOS_PER_SECOND, j8);
            return Math.addExact(bVarB.f58077a, Math.addExact(nano / j8, Math.addExact(nano % j8, bVarB.f58078b) / j8));
        } catch (ArithmeticException unused) {
            return lVar.compareTo(lVar2) < 0 ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }
}
