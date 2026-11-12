package ot1;

import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1.a f133780b;

    public /* synthetic */ b(qt1.a aVar, int i14) {
        this.f133779a = i14;
        this.f133780b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        Object value2;
        pt1.c cVar;
        int i14 = this.f133779a;
        qt1.a aVar = this.f133780b;
        switch (i14) {
            case 0:
                e eVar = e.f133785a;
                aVar.f147495h.a();
                aVar.H4();
                return Unit.INSTANCE;
            case 1:
                e eVar2 = e.f133785a;
                p2 p2Var = aVar.f147501n;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.FALSE));
                aVar.H4();
                return Unit.INSTANCE;
            case 2:
                e eVar3 = e.f133785a;
                aVar.E4();
                return Unit.INSTANCE;
            case 3:
                e eVar4 = e.f133785a;
                p2 p2Var2 = aVar.f147503p;
                do {
                    value2 = p2Var2.getValue();
                    cVar = (pt1.c) value2;
                } while (!p2Var2.b(value2, pt1.c.a(cVar, false, false, false, null, null, pt1.j.a(cVar.f140821f, null, null, null, 7), false, false, 479)));
                return Unit.INSTANCE;
            default:
                return ((pt1.c) aVar.f147503p.getValue()).f140819d.f140835k;
        }
    }
}
