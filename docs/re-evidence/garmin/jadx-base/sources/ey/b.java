package ey;

import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ley/b;", "", "<init>", "()V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    static {
        new b();
    }

    private b() {
    }

    public static final boolean a(CalendarItemDTO.b bVar) {
        w13.c cVar = xx.e.E;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            xx.e eVar = (xx.e) bVarN.next();
            if (eVar.f192498d == bVar) {
                return true;
            }
            if (eVar == xx.e.f192490v && bVar == CalendarItemDTO.b.FBT_ADAPTIVE_WORKOUT) {
                return true;
            }
        }
        return false;
    }
}
