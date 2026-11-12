package pb1;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f136839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f136840c;

    public /* synthetic */ d(h hVar, int i14, int i15) {
        this.f136838a = i15;
        this.f136839b = hVar;
        this.f136840c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f136838a;
        int i15 = this.f136840c;
        h hVar = this.f136839b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i16 = h.f136849f;
        switch (i14) {
            case 0:
                hVar.h(mVar, p0.t(i15 | 1));
                break;
            case 1:
                hVar.j(mVar, p0.t(i15 | 1));
                break;
            case 2:
                hVar.g(mVar, p0.t(i15 | 1));
                break;
            default:
                hVar.i(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
