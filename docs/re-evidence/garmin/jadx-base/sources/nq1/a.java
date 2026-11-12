package nq1;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class a extends q implements l<hs1.d, hs1.j> {
    public a(Object obj) {
        super(1, obj, h.class, "pushesMovementValue", "pushesMovementValue(Lcom/garmin/android/apps/connectmobile/timeline/model/v2/DailySummary;)Lcom/garmin/android/apps/connectmobile/timeline/model/v2/MovementValue;", 0);
    }

    @Override // e23.l
    public final hs1.j invoke(hs1.d dVar) {
        hs1.i movement;
        hs1.d dVar2 = dVar;
        ((h) this.receiver).getClass();
        if (dVar2 == null || (movement = dVar2.getMovement()) == null) {
            return null;
        }
        return movement.getPushes();
    }
}
