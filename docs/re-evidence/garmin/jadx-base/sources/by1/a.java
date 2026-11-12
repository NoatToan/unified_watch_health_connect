package by1;

import androidx.lifecycle.v1;
import java.util.ArrayList;
import nx1.c0;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ey1.a f22170b;

    public /* synthetic */ a(ey1.a aVar, int i14) {
        this.f22169a = i14;
        this.f22170b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        dy1.g gVar;
        ArrayList arrayList;
        int i14 = this.f22169a;
        ey1.a aVar = this.f22170b;
        switch (i14) {
            case 0:
                mx1.c cVar = (mx1.c) obj;
                c cVar2 = c.f22175a;
                cVar.getClass();
                aVar.U4(cVar);
                break;
            case 1:
                Long l14 = (Long) obj;
                l14.getClass();
                e eVar = e.f22178a;
                aVar.S4(l14);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                m mVar = m.f22196a;
                aVar.Q4(bool);
                break;
            case 3:
                Long l15 = (Long) obj;
                l15.getClass();
                m mVar2 = m.f22196a;
                aVar.S4(l15);
                break;
            case 4:
                dy1.d dVar = (dy1.d) obj;
                r rVar = r.f22207a;
                dVar.getClass();
                ge1.b.T(v1.a(aVar), null, null, new ey1.h(aVar, dVar, null), 3);
                break;
            case 5:
                mx1.d dVar2 = (mx1.d) obj;
                x xVar = x.f22221a;
                dVar2.getClass();
                aVar.V4(dVar2);
                break;
            case 6:
                String str = (String) obj;
                cy1.c cVar3 = cy1.c.f56798a;
                str.getClass();
                c0 c0Var = aVar.f67281m;
                c0Var.getClass();
                p2 p2Var = c0Var.f128212f;
                do {
                    value = p2Var.getValue();
                    gVar = (dy1.g) value;
                    i53.c<dy1.h> cVar4 = gVar.f61555b;
                    arrayList = new ArrayList();
                    for (dy1.h hVar : cVar4) {
                        if (!p005kotlin.jvm.internal.s.g(hVar.f61556a, str)) {
                            arrayList.add(hVar);
                        }
                    }
                } while (!p2Var.b(value, dy1.g.a(gVar, i53.a.e(arrayList))));
                break;
            case 7:
                mx1.e eVar2 = (mx1.e) obj;
                cy1.d dVar3 = cy1.d.f56799a;
                eVar2.getClass();
                aVar.T4(eVar2);
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                cy1.e eVar3 = cy1.e.f56800a;
                aVar.R4(iIntValue);
                break;
        }
        return Unit.INSTANCE;
    }
}
