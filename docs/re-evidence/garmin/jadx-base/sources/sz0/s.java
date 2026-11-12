package sz0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f161506b;

    public /* synthetic */ s(u uVar, int i14) {
        this.f161505a = i14;
        this.f161506b = uVar;
    }

    @Override // f.b
    public final void a(Object obj) {
        i0 i0VarD7;
        int i14 = this.f161505a;
        u uVar = this.f161506b;
        switch (i14) {
            case 0:
                f.a aVar = (f.a) obj;
                int i15 = u.E;
                aVar.getClass();
                if (aVar.f67585a == -1) {
                    uVar.d7().a();
                    return;
                }
                return;
            case 1:
                int i16 = u.E;
                ((Unit) obj).getClass();
                i0VarD7 = uVar.d7();
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i17 = u.E;
                if (zBooleanValue) {
                    uVar.d7().y4();
                }
                i0VarD7 = uVar.d7();
                break;
        }
        sn.a.u(uVar, i0VarD7);
    }
}
