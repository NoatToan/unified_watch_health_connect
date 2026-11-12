package h21;

import androidx.lifecycle.v1;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i21.d f81093b;

    public /* synthetic */ l(i21.d dVar, int i14) {
        this.f81092a = i14;
        this.f81093b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        switch (this.f81092a) {
            case 0:
                this.f81093b.G4();
                break;
            case 1:
                this.f81093b.G4();
                break;
            case 2:
                i21.d dVar = this.f81093b;
                dVar.getClass();
                ge1.b.T(v1.a(dVar), null, null, new i21.u(dVar, null), 3);
                break;
            case 3:
                i21.d dVar2 = this.f81093b;
                p2 p2Var = dVar2.f87285q;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, i21.c.a((i21.c) value, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4177919)));
                ge1.b.T(v1.a(dVar2), null, null, new i21.i(dVar2, null), 3);
                break;
            case 4:
                i21.d dVar3 = this.f81093b;
                p2 p2Var2 = dVar3.f87285q;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, i21.c.a((i21.c) value2, null, null, null, null, null, null, null, null, null, null, false, false, null, false, true, false, null, null, 3899391)));
                ge1.b.T(v1.a(dVar3), null, null, new i21.s(dVar3, null), 3);
                break;
            default:
                i21.d dVar4 = this.f81093b;
                p2 p2Var3 = dVar4.f87285q;
                do {
                    value3 = p2Var3.getValue();
                } while (!p2Var3.b(value3, i21.c.a((i21.c) value3, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4161535)));
                ge1.b.T(v1.a(dVar4), null, null, new i21.h(dVar4, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
