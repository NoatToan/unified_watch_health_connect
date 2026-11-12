package r53;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h1 {
    public static final j2 a(i iVar) {
        q53.i.f142994p0.getClass();
        int i14 = q53.i.a.f142996b;
        if (1 >= i14) {
            i14 = 1;
        }
        int i15 = i14 - 1;
        if (iVar instanceof s53.f) {
            s53.f fVar = (s53.f) iVar;
            q53.a aVar = fVar.f157483c;
            i iVarJ = fVar.j();
            if (iVarJ != null) {
                int i16 = fVar.f157482b;
                if (i16 != -3 && i16 != -2 && i16 != 0) {
                    i15 = i16;
                } else if (aVar != q53.a.SUSPEND || i16 == 0) {
                    i15 = 0;
                }
                return new j2(iVarJ, i15, aVar, fVar.f157481a);
            }
        }
        return new j2(iVar, i15, q53.a.SUSPEND, t13.h.f161748a);
    }
}
