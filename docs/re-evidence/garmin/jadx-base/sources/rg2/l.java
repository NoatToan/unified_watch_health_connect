package rg2;

import fg2.d0;
import fg2.e0;
import fg2.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;
import yg2.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class l extends q implements e23.a<Integer> {
    public l(Object obj) {
        super(0, obj, fg2.f.class, "currentTotalRound", "currentTotalRound$live_session_view()Ljava/lang/Integer;", 0);
    }

    @Override // e23.a
    public final Integer invoke() {
        Float f14;
        fg2.f fVar = (fg2.f) this.receiver;
        d0 d0Var = fVar.f71478b.f131781j;
        boolean zBooleanValue = ((Boolean) fVar.f71486j.getValue()).booleanValue();
        o oVar = (o) d0Var.f71428c.getValue();
        if (h0.b(oVar) || zBooleanValue) {
            return null;
        }
        yg2.h0 h0Var = (yg2.h0) d0Var.f71431f.f150540a.getValue();
        yg2.a aVarC = h0.c(oVar, h0Var != null ? Integer.valueOf(h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) : null);
        int iFloatValue = 0;
        if (aVarC != null) {
            List listN0 = p13.h0.N0(oVar.b(), new e0());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listN0) {
                if (((yg2.a) obj).getClusterIndex() <= aVarC.getClusterIndex()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                iFloatValue += ((yg2.a) it.next()).f196937d;
            }
        } else {
            Iterator<yg2.a> it3 = oVar.b().iterator();
            int i14 = 0;
            while (it3.hasNext()) {
                i14 += it3.next().f196937d;
            }
            rf2.b bVar = (rf2.b) d0Var.f71432g.getValue();
            if (bVar != null && (f14 = bVar.f152460f) != null) {
                iFloatValue = (int) f14.floatValue();
            }
            iFloatValue = (iFloatValue / 2) + i14;
        }
        return Integer.valueOf(iFloatValue);
    }
}
