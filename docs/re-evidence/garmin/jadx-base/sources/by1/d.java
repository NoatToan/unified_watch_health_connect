package by1;

import c22.a4;
import java.util.ArrayList;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ey1.a f22177b;

    public /* synthetic */ d(ey1.a aVar, int i14) {
        this.f22176a = i14;
        this.f22177b = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        ArrayList arrayList;
        Object value2;
        dy1.g gVar;
        ArrayList arrayListD1;
        int i14 = this.f22176a;
        ey1.a aVar = this.f22177b;
        switch (i14) {
            case 0:
                a4 a4Var = (a4) obj;
                mx1.b bVar = (mx1.b) obj2;
                e eVar = e.f22178a;
                a4Var.getClass();
                bVar.getClass();
                aVar.a5(a4Var, bVar);
                aVar.A4();
                break;
            case 1:
                mx1.a aVar2 = (mx1.a) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                g gVar2 = g.f22184a;
                aVar2.getClass();
                p2 p2Var = aVar.f67278j;
                do {
                    value = p2Var.getValue();
                    i53.c<dy1.a> cVar = (i53.c) value;
                    arrayList = new ArrayList(p13.y.r(cVar, 10));
                    for (dy1.a aVar3 : cVar) {
                        mx1.a aVar4 = aVar3.f61526a;
                        if (aVar4 == aVar2) {
                            aVar3 = new dy1.a(aVar4, zBooleanValue);
                        }
                        arrayList.add(aVar3);
                    }
                } while (!p2Var.b(value, i53.a.e(arrayList)));
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                cy1.c cVar2 = cy1.c.f56798a;
                p2 p2Var2 = aVar.f67281m.f128212f;
                do {
                    value2 = p2Var2.getValue();
                    gVar = (dy1.g) value2;
                    arrayListD1 = h0.d1(gVar.f61555b);
                    if (iIntValue >= 0 && iIntValue < arrayListD1.size() && iIntValue2 >= 0 && iIntValue2 < arrayListD1.size()) {
                        arrayListD1.add(iIntValue2, arrayListD1.remove(iIntValue));
                    }
                    Unit unit = Unit.INSTANCE;
                } while (!p2Var2.b(value2, dy1.g.a(gVar, i53.a.e(arrayListD1))));
                break;
        }
        return Unit.INSTANCE;
    }
}
