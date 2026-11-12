package ds;

import f5.v1;
import java.util.ArrayList;
import l72.c1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f60998c;

    public /* synthetic */ k(int i14, ArrayList arrayList) {
        this.f60996a = 1;
        this.f60997b = i14;
        this.f60998c = arrayList;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f60996a;
        int i15 = 0;
        int i16 = this.f60997b;
        ArrayList<v1> arrayList = this.f60998c;
        v1.a aVar = (v1.a) obj;
        switch (i14) {
            case 0:
                aVar.getClass();
                int i17 = 0;
                for (v1 v1Var : arrayList) {
                    v1.a.B(aVar, v1Var, i17, 0);
                    i17 += v1Var.f69144a + i16;
                }
                break;
            case 1:
                c1.a aVar2 = c1.a.f110941a;
                aVar.getClass();
                for (v1 v1Var2 : p13.h0.G0(arrayList)) {
                    int i18 = i16 - v1Var2.f69144a;
                    v1.a.B(aVar, v1Var2, i18, 0);
                    i16 = i18 - 8;
                }
                break;
            case 2:
                c1.a aVar3 = c1.a.f110941a;
                aVar.getClass();
                for (v1 v1Var3 : p13.h0.G0(arrayList)) {
                    v1.a.B(aVar, v1Var3, i16 - v1Var3.f69144a, i15);
                    i15 += v1Var3.f69145b + 8;
                }
                break;
            default:
                aVar.getClass();
                int i19 = 0;
                for (v1 v1Var4 : arrayList) {
                    v1.a.B(aVar, v1Var4, i19, 0);
                    i19 += v1Var4.f69144a + i16;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(ArrayList arrayList, int i14, int i15) {
        this.f60996a = i15;
        this.f60998c = arrayList;
        this.f60997b = i14;
    }
}
