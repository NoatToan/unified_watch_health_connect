package y10;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f193897b;

    public /* synthetic */ j(k kVar, int i14) {
        this.f193896a = i14;
        this.f193897b = kVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f193896a) {
            case 0:
                k kVar = this.f193897b;
                kVar.f193917p.m(new n0.b(kVar.E4(), kVar.G4(kVar.f193902a), false, null, 12, null));
                break;
            case 1:
                k kVar2 = this.f193897b;
                kVar2.f193917p.m(new n0.b(kVar2.E4(), kVar2.G4(kVar2.f193902a), false, null, 12, null));
                break;
            default:
                k kVar3 = this.f193897b;
                kVar3.f193917p.m(new n0.b(kVar3.E4(), kVar3.G4(kVar3.f193902a), false, null, 12, null));
                break;
        }
        return Unit.INSTANCE;
    }
}
