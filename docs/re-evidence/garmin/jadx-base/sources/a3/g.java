package a3;

import f5.v1;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f5.b1 f662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f665f;

    public /* synthetic */ g(ArrayList arrayList, f5.b1 b1Var, float f14, int i14, ArrayList arrayList2, int i15) {
        this.f660a = i15;
        this.f661b = arrayList;
        this.f662c = b1Var;
        this.f663d = f14;
        this.f664e = i14;
        this.f665f = arrayList2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        v1.a aVar = (v1.a) obj;
        switch (this.f660a) {
            case 0:
                ArrayList arrayList = this.f661b;
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    List list = (List) arrayList.get(i14);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i15 = 0;
                    while (true) {
                        f5.b1 b1Var = this.f662c;
                        if (i15 < size2) {
                            iArr[i15] = ((v1) list.get(i15)).f69144a + (i15 < list.size() + (-1) ? b1Var.f0(this.f663d) : 0);
                            i15++;
                        } else {
                            c2.j.f22691a.getClass();
                            int[] iArr2 = new int[size2];
                            c2.j.f22695e.c(b1Var, this.f664e, iArr, iArr2);
                            int size3 = list.size();
                            for (int i16 = 0; i16 < size3; i16++) {
                                aVar.r((v1) list.get(i16), iArr2[i16], ((Number) this.f665f.get(i14)).intValue(), 0.0f);
                            }
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList2 = this.f661b;
                int size4 = arrayList2.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    List list2 = (List) arrayList2.get(i17);
                    int size5 = list2.size();
                    int[] iArr3 = new int[size5];
                    int i18 = 0;
                    while (true) {
                        f5.b1 b1Var2 = this.f662c;
                        if (i18 < size5) {
                            iArr3[i18] = ((v1) list2.get(i18)).f69144a + (i18 < list2.size() + (-1) ? b1Var2.f0(this.f663d) : 0);
                            i18++;
                        } else {
                            c2.j.f22691a.getClass();
                            int[] iArr4 = new int[size5];
                            c2.j.f22693c.b(b1Var2, this.f664e, iArr3, b1Var2.getF68887b(), iArr4);
                            int size6 = list2.size();
                            for (int i19 = 0; i19 < size6; i19++) {
                                aVar.r((v1) list2.get(i19), iArr4[i19], ((Number) this.f665f.get(i17)).intValue(), 0.0f);
                            }
                        }
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
