package yn2;

import org.joda.time.Duration;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Unit;
import tn2.f0;

/* JADX INFO: loaded from: classes11.dex */
public interface i extends vq2.b, vq2.c {
    default void Q0(f0.a aVar, LocalTime localTime, LocalTime localTime2, e23.a<Unit> aVar2) {
        aVar.getClass();
        localTime.getClass();
        localTime2.getClass();
        Z5(new wv0.h(DateTimeFormat.forPattern("h:mm a"), localTime, localTime2, false, aVar2, 11));
    }

    default void l3(Duration duration, e23.a<Unit> aVar) {
        duration.getClass();
        Z5(new x9.b(duration, aVar, 23));
    }
}
