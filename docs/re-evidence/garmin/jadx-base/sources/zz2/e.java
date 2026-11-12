package zz2;

import a03.r0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a03.p f207662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f207663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f207664d;

    public /* synthetic */ e(a03.p pVar, o53.b0 b0Var, e23.a aVar, int i14) {
        this.f207661a = i14;
        this.f207662b = pVar;
        this.f207663c = b0Var;
        this.f207664d = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f207661a) {
            case 0:
                o53.b0 b0Var = this.f207663c;
                b0Var.getClass();
                e23.a aVar = this.f207664d;
                aVar.getClass();
                a03.p pVar = this.f207662b;
                if (pVar.f158i.f171b.invoke(a03.y.Hidden).booleanValue()) {
                    ge1.b.T(b0Var, null, null, new a0(pVar, null), 3).J(new h(pVar, aVar, 0));
                }
                break;
            default:
                a03.p pVar2 = this.f207662b;
                r0<a03.y> r0Var = pVar2.f158i;
                o53.b0 b0Var2 = this.f207663c;
                b0Var2.getClass();
                e23.a aVar2 = this.f207664d;
                aVar2.getClass();
                if (pVar2.c() == a03.y.FullyExpanded) {
                    if (r0Var.d().containsKey(a03.y.IntermediatelyExpanded)) {
                        ge1.b.T(b0Var2, null, null, new k(pVar2, null), 3);
                    } else if (pVar2.c() == a03.y.IntermediatelyExpanded) {
                        if (r0Var.d().containsKey(a03.y.SlightlyExpanded)) {
                            ge1.b.T(b0Var2, null, null, new l(pVar2, null), 3);
                        } else {
                            ge1.b.T(b0Var2, null, null, new m(pVar2, null), 3).J(new xx1.d(aVar2, 12));
                        }
                    } else {
                        ge1.b.T(b0Var2, null, null, new m(pVar2, null), 3).J(new xx1.d(aVar2, 12));
                    }
                } else if (pVar2.c() == a03.y.IntermediatelyExpanded) {
                    if (r0Var.d().containsKey(a03.y.SlightlyExpanded)) {
                        ge1.b.T(b0Var2, null, null, new l(pVar2, null), 3);
                    } else {
                        ge1.b.T(b0Var2, null, null, new m(pVar2, null), 3).J(new xx1.d(aVar2, 12));
                    }
                } else {
                    ge1.b.T(b0Var2, null, null, new m(pVar2, null), 3).J(new xx1.d(aVar2, 12));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
