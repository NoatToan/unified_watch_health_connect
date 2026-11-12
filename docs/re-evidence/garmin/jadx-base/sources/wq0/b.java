package wq0;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f186585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.b f186586c;

    public /* synthetic */ b(l lVar, a0.b bVar, int i14) {
        this.f186584a = i14;
        this.f186585b = lVar;
        this.f186586c = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        z zVar;
        List listN0;
        ArrayList arrayListD1;
        Object value2;
        z zVarA;
        Object value3;
        int i14 = this.f186584a;
        a0.b bVar = this.f186586c;
        l lVar = this.f186585b;
        switch (i14) {
            case 0:
                lVar.getClass();
                bVar.getClass();
                int iIndexOf = ((z) lVar.f186610d.getValue()).f186617b.indexOf(bVar);
                int i15 = iIndexOf - 1;
                if (iIndexOf != -1 && i15 != -1) {
                    lVar.y4(iIndexOf, i15);
                }
                break;
            case 1:
                lVar.getClass();
                bVar.getClass();
                p2 p2Var = lVar.f186610d;
                int iIndexOf2 = ((z) p2Var.getValue()).f186617b.indexOf(bVar);
                int i16 = iIndexOf2 + 1;
                if (iIndexOf2 != -1 && i16 != ((z) p2Var.getValue()).f186617b.size()) {
                    lVar.y4(iIndexOf2, i16);
                }
                break;
            default:
                lVar.getClass();
                bVar.getClass();
                tq0.f fVar = bVar.f186582b;
                boolean z14 = fVar.f166056b;
                p2 p2Var2 = lVar.f186610d;
                if (z14) {
                    do {
                        value2 = p2Var2.getValue();
                        zVarA = (z) value2;
                        if (zVarA.f186617b.size() == 1) {
                            do {
                                value3 = p2Var2.getValue();
                            } while (!p2Var2.b(value3, z.a((z) value3, false, null, null, false, true, false, 47)));
                        } else {
                            a0.b bVarA = a0.b.a(bVar, tq0.f.b(fVar, 0, false, 5));
                            ArrayList arrayListD2 = h0.d1(zVarA.f186617b);
                            arrayListD2.remove(bVar);
                            Unit unit = Unit.INSTANCE;
                            List listN1 = h0.N0(arrayListD2, new w());
                            ArrayList arrayListD3 = h0.d1(zVarA.f186618c);
                            arrayListD3.add(bVarA);
                            zVarA = z.a(zVarA, false, listN1, h0.N0(arrayListD3, new x()), false, false, false, 57);
                        }
                    } while (!p2Var2.b(value2, zVarA));
                } else {
                    do {
                        value = p2Var2.getValue();
                        zVar = (z) value;
                        a0.b bVarA2 = a0.b.a(bVar, tq0.f.b(fVar, 0, true, 5));
                        ArrayList arrayListD4 = h0.d1(zVar.f186617b);
                        arrayListD4.add(bVarA2);
                        Unit unit2 = Unit.INSTANCE;
                        listN0 = h0.N0(arrayListD4, new m());
                        arrayListD1 = h0.d1(zVar.f186618c);
                        arrayListD1.remove(bVar);
                    } while (!p2Var2.b(value, z.a(zVar, false, listN0, h0.N0(arrayListD1, new n()), false, false, false, 57)));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
