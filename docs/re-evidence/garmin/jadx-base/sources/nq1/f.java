package nq1;

import e23.l;
import hd1.i0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class f extends q implements l<i0, Integer> {
    public f(Object obj) {
        super(1, obj, h.class, "realtimeStepsGoal", "realtimeStepsGoal(Lcom/garmin/android/apps/connectmobile/realtimedata/RealTimeStepsDTO;)Ljava/lang/Integer;", 0);
    }

    @Override // e23.l
    public final Integer invoke(i0 i0Var) {
        i0 i0Var2 = i0Var;
        ((h) this.receiver).getClass();
        if (i0Var2 == null) {
            return null;
        }
        int i14 = i0Var2.f83384c;
        Integer numValueOf = Integer.valueOf(i14);
        if (i14 >= 0) {
            return numValueOf;
        }
        return null;
    }
}
