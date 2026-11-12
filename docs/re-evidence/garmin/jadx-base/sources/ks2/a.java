package ks2;

import e23.l;
import e23.p;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hs2.d f106393b;

    public /* synthetic */ a(hs2.d dVar, int i14) {
        this.f106392a = i14;
        this.f106393b = dVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int iD;
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        switch (this.f106392a) {
            case 0:
                lVar.getClass();
                lVar2.getClass();
                iD = this.f106393b.D(new e.a(lVar, lVar2));
                break;
            default:
                lVar.getClass();
                lVar2.getClass();
                iD = this.f106393b.u(new f(lVar, lVar2));
                break;
        }
        return Integer.valueOf(iD);
    }
}
