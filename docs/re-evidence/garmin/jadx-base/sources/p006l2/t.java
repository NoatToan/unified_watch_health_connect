package p006l2;

import e23.l;
import f4.s;
import p005kotlin.Unit;
import s5.q0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3 f108793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f108794c;

    public /* synthetic */ t(j3 j3Var, l lVar, int i14) {
        this.f108792a = i14;
        this.f108793b = j3Var;
        this.f108794c = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f108792a) {
            case 0:
                q0 q0Var = (q0) obj;
                j3 j3Var = this.f108793b;
                if (j3Var != null) {
                    j3Var.f108587a.setValue(q0Var);
                }
                l lVar = this.f108794c;
                if (lVar != null) {
                    lVar.invoke(q0Var);
                }
                return Unit.INSTANCE;
            default:
                j3 j3Var2 = this.f108793b;
                s<l<k2, Unit>> sVar = j3Var2.f108589c;
                l<k2, Unit> lVar2 = this.f108794c;
                sVar.add(lVar2);
                return new j3.b(j3Var2, lVar2);
        }
    }
}
