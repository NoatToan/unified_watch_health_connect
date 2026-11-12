package r6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a extends q6.d {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final float f150961n0;

    public a(q6.g gVar) {
        super(gVar, q6.g.d.ALIGN_VERTICALLY);
        this.f150961n0 = 0.5f;
    }

    @Override // q6.d, q6.a, q6.e
    public final void apply() {
        Iterator<Object> it = this.f143082m0.iterator();
        while (it.hasNext()) {
            q6.a aVarC = this.f143080k0.c(it.next());
            aVarC.g();
            Object obj = this.N;
            if (obj != null) {
                aVarC.o(obj);
            } else {
                Object obj2 = this.O;
                if (obj2 != null) {
                    aVarC.f143024d0 = q6.g.b.START_TO_END;
                    aVarC.O = obj2;
                } else {
                    aVarC.o(0);
                }
            }
            Object obj3 = this.P;
            if (obj3 != null) {
                aVarC.f143024d0 = q6.g.b.END_TO_START;
                aVarC.P = obj3;
            } else {
                Object obj4 = this.Q;
                if (obj4 != null) {
                    aVarC.i(obj4);
                } else {
                    aVarC.i(0);
                }
            }
            float f14 = this.f150961n0;
            if (f14 != 0.5f) {
                aVarC.f143031h = f14;
            }
        }
    }
}
