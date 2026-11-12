package q53;

/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static b a(int i14, int i15, a aVar) {
        if ((i15 & 1) != 0) {
            i14 = 0;
        }
        if ((i15 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if (i14 == -2) {
            if (aVar != a.SUSPEND) {
                return new p(1, aVar, null);
            }
            i.f142994p0.getClass();
            return new b(i.a.f142996b, null);
        }
        if (i14 == -1) {
            if (aVar == a.SUSPEND) {
                return new p(1, a.DROP_OLDEST, null);
            }
            vb.h.s("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i14 == 0) {
            return aVar == a.SUSPEND ? new b(0, null) : new p(1, aVar, null);
        }
        if (i14 != Integer.MAX_VALUE) {
            return aVar == a.SUSPEND ? new b(i14, null) : new p(i14, aVar, null);
        }
        return new b(Integer.MAX_VALUE, null);
    }
}
