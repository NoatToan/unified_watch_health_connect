package p006l2;

import e23.a;
import e23.l;
import f5.v1;
import g6.k;
import java.util.List;
import o13.p;
import p005kotlin.Unit;
import w2.a0;
import zw1.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l3 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f108645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f108646c;

    public /* synthetic */ l3(List list, List list2, int i14) {
        this.f108644a = i14;
        this.f108645b = list;
        this.f108646c = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        long j8;
        switch (this.f108644a) {
            case 0:
                v1.a aVar = (v1.a) obj;
                List list = this.f108645b;
                if (list != null) {
                    int size = list.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        p pVar = (p) list.get(i14);
                        v1.a.y(aVar, (v1) pVar.f128594a, ((k) pVar.f128595b).f76005a);
                    }
                }
                List list2 = this.f108646c;
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        p pVar2 = (p) list2.get(i15);
                        v1 v1Var = (v1) pVar2.f128594a;
                        a aVar2 = (a) pVar2.f128595b;
                        if (aVar2 != null) {
                            j8 = ((k) aVar2.invoke()).f76005a;
                        } else {
                            k.f76003b.getClass();
                            j8 = 0;
                        }
                        v1.a.y(aVar, v1Var, j8);
                    }
                }
                break;
            default:
                g gVar = (g) obj;
                gVar.getClass();
                a0.n(gVar.f207267a, this.f108645b, this.f108646c, gVar.f207269c, gVar.f207270d, gVar.f207271e, gVar.f207268b);
                break;
        }
        return Unit.INSTANCE;
    }
}
