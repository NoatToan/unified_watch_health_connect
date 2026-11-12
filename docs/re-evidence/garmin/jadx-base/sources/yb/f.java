package yb;

import com.google.android.exoplayer2.C;
import j20.x;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {
    private f() {
    }

    public static void a(i iVar, int i14, fa.g<c> gVar) {
        long eventTime = iVar.getEventTime(i14);
        List<ea.a> cues = iVar.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i14 == iVar.getEventTimeCount() - 1) {
            x.h();
            return;
        }
        long eventTime2 = iVar.getEventTime(i14 + 1) - iVar.getEventTime(i14);
        if (eventTime2 > 0) {
            gVar.accept(new c(cues, eventTime, eventTime2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void b(i iVar, n.b bVar, fa.g<c> gVar) {
        int nextEventTimeIndex;
        boolean z14;
        long j8 = bVar.f195664a;
        if (j8 == C.TIME_UNSET) {
            nextEventTimeIndex = 0;
        } else {
            nextEventTimeIndex = iVar.getNextEventTimeIndex(j8);
            if (nextEventTimeIndex == -1) {
                nextEventTimeIndex = iVar.getEventTimeCount();
            }
            if (nextEventTimeIndex > 0 && iVar.getEventTime(nextEventTimeIndex - 1) == j8) {
                nextEventTimeIndex--;
            }
        }
        if (j8 == C.TIME_UNSET || nextEventTimeIndex >= iVar.getEventTimeCount()) {
            z14 = false;
        } else {
            List<ea.a> cues = iVar.getCues(j8);
            long eventTime = iVar.getEventTime(nextEventTimeIndex);
            if (cues.isEmpty()) {
                z14 = false;
            } else {
                long j14 = bVar.f195664a;
                if (j14 < eventTime) {
                    gVar.accept(new c(cues, j14, eventTime - j14));
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
        }
        for (int i14 = nextEventTimeIndex; i14 < iVar.getEventTimeCount(); i14++) {
            a(iVar, i14, gVar);
        }
        if (bVar.f195665b) {
            if (z14) {
                nextEventTimeIndex--;
            }
            for (int i15 = 0; i15 < nextEventTimeIndex; i15++) {
                a(iVar, i15, gVar);
            }
            if (z14) {
                gVar.accept(new c(iVar.getCues(j8), iVar.getEventTime(nextEventTimeIndex), j8 - iVar.getEventTime(nextEventTimeIndex)));
            }
        }
    }
}
