package s53;

/* JADX INFO: loaded from: classes3.dex */
public interface t<T> extends r53.i<T> {

    public static final class a {
        public static /* synthetic */ r53.i a(t tVar, t13.g gVar, int i14, q53.a aVar, int i15) {
            if ((i15 & 1) != 0) {
                gVar = t13.h.f161748a;
            }
            if ((i15 & 2) != 0) {
                i14 = -3;
            }
            if ((i15 & 4) != 0) {
                aVar = q53.a.SUSPEND;
            }
            return tVar.e(gVar, i14, aVar);
        }
    }

    r53.i<T> e(t13.g gVar, int i14, q53.a aVar);
}
