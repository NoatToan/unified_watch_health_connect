package f53;

import e53.j;
import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final Instant a(j jVar) {
        jVar.getClass();
        Instant instantOfEpochSecond = Instant.ofEpochSecond(jVar.f63115a, jVar.f63116b);
        instantOfEpochSecond.getClass();
        return instantOfEpochSecond;
    }

    public static final j b(Instant instant) {
        j.a aVar = j.f63112c;
        long epochSecond = instant.getEpochSecond();
        long nano = instant.getNano();
        aVar.getClass();
        return j.a.b(epochSecond, nano);
    }
}
