package gw0;

import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f79608b;

    public /* synthetic */ h(u uVar, int i14) {
        this.f79607a = i14;
        this.f79608b = uVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        Object value2;
        int i14 = this.f79607a;
        u uVar = this.f79608b;
        switch (i14) {
            case 0:
                uVar.f79776q.i(new o82.a(uVar.f79767h, null, 2, null), true);
                tv0.f fVar = uVar.f79766g;
                fVar.f166547c = fVar.f166546b.g();
                break;
            case 1:
                uVar.f79761b.j();
                p2 p2Var = uVar.f79772m;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.FALSE));
                break;
            case 2:
                uVar.B4(false);
                break;
            case 3:
                uVar.A4(false);
                break;
            case 4:
                int i15 = u.f79759x;
                uVar.y4(false, true);
                break;
            case 5:
                uVar.z4(false);
                break;
            default:
                uVar.f79761b.j();
                p2 p2Var2 = uVar.f79772m;
                do {
                    value2 = p2Var2.getValue();
                    ((Boolean) value2).getClass();
                } while (!p2Var2.b(value2, Boolean.FALSE));
                break;
        }
        return Unit.INSTANCE;
    }
}
