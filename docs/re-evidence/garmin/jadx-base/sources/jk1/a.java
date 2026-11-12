package jk1;

import hk1.l;
import hk1.q;
import hk1.w;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f99377b;

    public /* synthetic */ a(f fVar, int i14) {
        this.f99376a = i14;
        this.f99377b = fVar;
    }

    @Override // e23.a
    public final Object invoke() {
        q bVar;
        Object value;
        Object value2;
        switch (this.f99376a) {
            case 0:
                f fVar = this.f99377b;
                w wVar = fVar.f99397a;
                if (wVar instanceof w.a) {
                    String str = ((w.a) wVar).f84207a;
                    if (str == null) {
                        str = "";
                    }
                    bVar = new q.a(str, null);
                } else {
                    bVar = wVar instanceof w.b ? new q.b(l.ACCESS_DENIED, ((w.b) wVar).f84210b) : q.d.f84188a;
                }
                String strX4 = fVar.x4(bVar);
                p2 p2Var = fVar.f99406j;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, e.a((e) value, false, null, null, strX4, 127)));
                break;
            default:
                p2 p2Var2 = this.f99377b.f99406j;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, e.a((e) value2, false, null, null, null, 508)));
                break;
        }
        return Unit.INSTANCE;
    }
}
