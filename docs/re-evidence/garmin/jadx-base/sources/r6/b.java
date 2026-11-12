package r6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b extends q6.d {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final float f150962n0;

    public b(q6.g gVar) {
        super(gVar, q6.g.d.ALIGN_VERTICALLY);
        this.f150962n0 = 0.5f;
    }

    @Override // q6.d, q6.a, q6.e
    public final void apply() {
        Iterator<Object> it = this.f143082m0.iterator();
        while (it.hasNext()) {
            q6.a aVarC = this.f143080k0.c(it.next());
            aVarC.h();
            Object obj = this.R;
            if (obj != null) {
                aVarC.p(obj);
            } else {
                Object obj2 = this.S;
                if (obj2 != null) {
                    aVarC.f143024d0 = q6.g.b.TOP_TO_BOTTOM;
                    aVarC.S = obj2;
                } else {
                    aVarC.p(0);
                }
            }
            Object obj3 = this.U;
            if (obj3 != null) {
                aVarC.f143024d0 = q6.g.b.BOTTOM_TO_TOP;
                aVarC.U = obj3;
            } else {
                Object obj4 = this.V;
                if (obj4 != null) {
                    aVarC.e(obj4);
                } else {
                    aVarC.e(0);
                }
            }
            float f14 = this.f150962n0;
            if (f14 != 0.5f) {
                aVarC.f143033i = f14;
            }
        }
    }
}
