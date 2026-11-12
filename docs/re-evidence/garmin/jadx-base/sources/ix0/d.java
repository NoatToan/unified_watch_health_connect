package ix0;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f95680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f95681c;

    public /* synthetic */ d(i iVar, int i14, int i15) {
        this.f95679a = i15;
        this.f95680b = iVar;
        this.f95681c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f95679a;
        int i15 = this.f95681c;
        i iVar = this.f95680b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i16 = i.f95700f;
        switch (i14) {
            case 0:
                iVar.g(mVar, p0.t(i15 | 1));
                break;
            case 1:
                iVar.m(mVar, p0.t(i15 | 1));
                break;
            case 2:
                iVar.k(mVar, p0.t(i15 | 1));
                break;
            case 3:
                iVar.l(mVar, p0.t(i15 | 1));
                break;
            default:
                iVar.n(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
