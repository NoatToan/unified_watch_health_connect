package kh0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ih0.s f104712b;

    public /* synthetic */ b(ih0.s sVar, int i14) {
        this.f104711a = i14;
        this.f104712b = sVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        dh0.g gVar;
        switch (this.f104711a) {
            case 0:
                ih0.o oVar = (ih0.o) obj;
                oVar.getClass();
                boolean z14 = oVar instanceof ih0.o.a;
                ih0.s sVar = this.f104712b;
                if (z14 && ((gVar = ((ih0.o.a) oVar).f93470a) == dh0.g.BMI || gVar == dh0.g.BODY_FAT)) {
                    sVar.f93488g = true;
                }
                sVar.A4();
                break;
            default:
                dh0.g gVar2 = (dh0.g) obj;
                gVar2.getClass();
                if (gVar2 == dh0.g.BMI || gVar2 == dh0.g.BODY_FAT) {
                    ih0.s sVar2 = this.f104712b;
                    sVar2.f93488g = true;
                    sVar2.A4();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
