package ds;

import java.util.ArrayList;
import java.util.List;
import nr.p0;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qr.t f60894b;

    public /* synthetic */ c(qr.t tVar, int i14) {
        this.f60893a = i14;
        this.f60894b = tVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        p0.a iVar;
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        int i14 = this.f60893a;
        qr.t tVar = this.f60894b;
        switch (i14) {
            case 0:
                f.a aVar = (f.a) obj;
                aVar.getClass();
                if (aVar.f67585a == 0) {
                    js.b bVar = (js.b) tVar.M0.getValue();
                    boolean z14 = bVar.f100591d.get();
                    bVar.a();
                    if (!z14) {
                        tVar.F5("ActivityShareTemplateCancelled", null, false, false);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                p2 p2Var = tVar.X;
                p0.a aVar2 = ((p0) ((List) p2Var.getValue()).get(iIntValue)).f127286e;
                if (aVar2 instanceof p0.a.h) {
                    iVar = new p0.a.h(!((p0.a.h) aVar2).f127301a);
                } else if (aVar2 instanceof p0.a.i) {
                    p0.a.i iVar2 = (p0.a.i) aVar2;
                    iVar = new p0.a.i(iVar2.f127302a, !iVar2.f127303b);
                } else {
                    iVar = aVar2;
                }
                do {
                    value = p2Var.getValue();
                    List list = (List) value;
                    arrayList = new ArrayList(p13.y.r(list, 10));
                    int i15 = 0;
                    for (Object obj2 : list) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        p0 p0VarA = (p0) obj2;
                        if (i15 == iIntValue) {
                            p0VarA = p0.a(p0VarA, iVar);
                        }
                        arrayList.add(p0VarA);
                        i15 = i16;
                    }
                } while (!p2Var.b(value, arrayList));
                return Unit.INSTANCE;
            case 2:
                int iIntValue2 = ((Integer) obj).intValue();
                p2 p2Var2 = tVar.Y;
                p0.a.c cVar = (p0.a.c) ((p0) ((List) p2Var2.getValue()).get(iIntValue2)).f127286e;
                jr.h hVar = cVar.f127293e;
                p0.a.c cVarA = p0.a.c.a(cVar, jr.x.a(hVar, !hVar.getF100059a(), hVar.a()));
                do {
                    value2 = p2Var2.getValue();
                    List list2 = (List) value2;
                    arrayList2 = new ArrayList(p13.y.r(list2, 10));
                    int i17 = 0;
                    for (Object obj3 : list2) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        p0 p0VarA2 = (p0) obj3;
                        if (i17 == iIntValue2) {
                            p0VarA2 = p0.a(p0VarA2, cVarA);
                        }
                        arrayList2.add(p0VarA2);
                        i17 = i18;
                    }
                } while (!p2Var2.b(value2, arrayList2));
                return Unit.INSTANCE;
            default:
                String str = (String) obj;
                int i19 = qr.t.A2;
                str.getClass();
                tVar.N0.k(null, str);
                return Unit.INSTANCE;
        }
    }
}
