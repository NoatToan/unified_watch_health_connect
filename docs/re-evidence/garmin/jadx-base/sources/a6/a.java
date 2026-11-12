package a6;

import java.util.ArrayList;
import o4.q1;
import o4.w;
import o4.y;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final void a(s5.o oVar, y yVar, w wVar, float f14, q1 q1Var, d6.i iVar, q4.g gVar, int i14) {
        ArrayList arrayList = oVar.f157259h;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            s5.s sVar = (s5.s) arrayList.get(i15);
            sVar.f157290a.t(yVar, wVar, f14, q1Var, iVar, gVar, i14);
            yVar.q(0.0f, sVar.f157290a.getHeight());
        }
    }
}
