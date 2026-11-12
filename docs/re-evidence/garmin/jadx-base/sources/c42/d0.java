package c42;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f24375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f24376c;

    public /* synthetic */ d0(e23.l lVar, List list, int i14) {
        this.f24374a = i14;
        this.f24375b = lVar;
        this.f24376c = list;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f24374a) {
            case 0:
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                h0.a aVar = h0.a.f24398a;
                List list = this.f24376c;
                f0Var.a(list.size(), null, new h0.b(aVar, list), new z3.e(802480018, true, new h0.c(list, this.f24375b)));
                break;
            case 1:
                this.f24375b.invoke(this.f24376c.get(((Integer) obj).intValue()));
                break;
            case 2:
                e2.f0 f0Var2 = (e2.f0) obj;
                f0Var2.getClass();
                j21.k.b bVar = j21.k.b.f96675a;
                List list2 = this.f24376c;
                f0Var2.a(list2.size(), null, new j21.k.c(bVar, list2), new z3.e(802480018, true, new j21.k.d(list2, this.f24375b)));
                if (list2.isEmpty()) {
                    j21.a.f96635a.getClass();
                    e2.f0.b(f0Var2, null, j21.a.f96636b, 3);
                }
                break;
            case 3:
                e2.f0 f0Var3 = (e2.f0) obj;
                f0Var3.getClass();
                ll1.i.a aVar2 = ll1.i.a.f113397a;
                List list3 = this.f24376c;
                f0Var3.a(list3.size(), null, new ll1.i.b(aVar2, list3), new z3.e(802480018, true, new ll1.i.c(list3, this.f24375b)));
                break;
            case 4:
                e2.f0 f0Var4 = (e2.f0) obj;
                f0Var4.getClass();
                mk1.f.a aVar3 = mk1.f.a.f119154a;
                List list4 = this.f24376c;
                f0Var4.a(list4.size(), null, new mk1.f.b(aVar3, list4), new z3.e(802480018, true, new mk1.f.c(list4, this.f24375b)));
                break;
            case 5:
                this.f24375b.invoke(this.f24376c.get(((Integer) obj).intValue()));
                break;
            case 6:
                e2.f0 f0Var5 = (e2.f0) obj;
                f0Var5.getClass();
                List list5 = this.f24376c;
                e2.f0.f(f0Var5, list5.size(), null, new z3.e(-1142812748, true, new i91.b(list5, this.f24375b, 1)), 6);
                break;
            default:
                e2.f0 f0Var6 = (e2.f0) obj;
                f0Var6.getClass();
                ur2.a.b bVar2 = ur2.a.b.f172328a;
                List list6 = this.f24376c;
                f0Var6.a(list6.size(), null, new ur2.a.c(bVar2, list6), new z3.e(802480018, true, new ur2.a.d(list6, this.f24375b)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d0(List list, e23.l lVar, int i14) {
        this.f24374a = i14;
        this.f24376c = list;
        this.f24375b = lVar;
    }
}
