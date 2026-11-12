package nq1;

import e23.l;
import hd1.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class b extends q implements l<e0, Integer> {
    public b(Object obj) {
        super(1, obj, h.class, "realtimePushesCount", "realtimePushesCount(Lcom/garmin/android/apps/connectmobile/realtimedata/RealTimePushesDTO;)Ljava/lang/Integer;", 0);
    }

    @Override // e23.l
    public final Integer invoke(e0 e0Var) {
        e0 e0Var2 = e0Var;
        ((h) this.receiver).getClass();
        if (e0Var2 == null) {
            return null;
        }
        int i14 = e0Var2.f83378b;
        Integer numValueOf = Integer.valueOf(i14);
        if (i14 >= 0) {
            return numValueOf;
        }
        return null;
    }
}
