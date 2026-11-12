package yu1;

import e23.p;
import jv1.n;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import vu1.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f199781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f199782c;

    public /* synthetic */ e(n nVar, w wVar, int i14, int i15) {
        this.f199780a = i15;
        this.f199781b = nVar;
        this.f199782c = wVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f199780a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                g.c(this.f199781b, this.f199782c, mVar, p0.t(1));
                break;
            default:
                i.g(this.f199781b, this.f199782c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
