package b21;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u6 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.t f15282b;

    public /* synthetic */ u6(u21.t tVar, int i14) {
        this.f15281a = i14;
        this.f15282b = tVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f15281a) {
            case 0:
                s21.c cVar = (s21.c) obj;
                cVar.getClass();
                this.f15282b.N4(cVar);
                break;
            case 1:
                b63.v vVar = (b63.v) obj;
                vVar.getClass();
                this.f15282b.R4(vVar);
                break;
            case 2:
                b63.v vVar2 = (b63.v) obj;
                vVar2.getClass();
                this.f15282b.O4(vVar2);
                break;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                u21.t tVar = this.f15282b;
                ge1.b.T(androidx.lifecycle.v1.a(tVar), null, null, new u21.y(tVar, zBooleanValue, null), 3);
                break;
            case 4:
                s21.c cVar2 = (s21.c) obj;
                cVar2.getClass();
                this.f15282b.N4(cVar2);
                break;
            case 5:
                b63.v vVar3 = (b63.v) obj;
                vVar3.getClass();
                this.f15282b.R4(vVar3);
                break;
            default:
                b63.v vVar4 = (b63.v) obj;
                vVar4.getClass();
                this.f15282b.O4(vVar4);
                break;
        }
        return Unit.INSTANCE;
    }
}
