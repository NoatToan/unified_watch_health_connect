package w91;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u0;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class m extends p005kotlin.jvm.internal.q implements e23.l<q91.d, Unit> {
    public m(Object obj) {
        super(1, obj, ba1.d.class, "togglePersonalRecordTypeVisibility", "togglePersonalRecordTypeVisibility(Lcom/garmin/android/apps/connectmobile/personalrecords/domain/PersonalRecordType;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(q91.d dVar) {
        aa1.h value;
        aa1.h hVarB;
        q91.d dVar2 = dVar;
        dVar2.getClass();
        ba1.d dVar3 = (ba1.d) this.receiver;
        dVar3.getClass();
        z1<aa1.h> z1Var = dVar3.f16990p;
        do {
            value = z1Var.getValue();
            hVarB = value;
            q91.g gVar = dVar2.f143580b;
            i53.c<aa1.f> cVar = hVarB.f2296h.get(gVar);
            if (cVar != null) {
                ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                for (aa1.f fVarB : cVar) {
                    if (fVarB.f2270a == dVar2) {
                        fVarB = aa1.f.b(fVarB, !fVarB.f2271b);
                    }
                    arrayList.add(fVarB);
                }
                hVarB = aa1.h.b(hVarB, false, false, false, false, 0.0d, null, null, i53.a.g(u0.i(hVarB.f2296h, new o13.p(gVar, i53.a.e(arrayList)))), null, false, 895);
            }
        } while (!z1Var.b(value, hVarB));
        dVar3.F4();
        return Unit.INSTANCE;
    }
}
