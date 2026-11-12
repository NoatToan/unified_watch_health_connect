package or0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f133339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ir0.d f133340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f133341d;

    public /* synthetic */ g(j jVar, ir0.d dVar, int i14, int i15) {
        this.f133338a = i15;
        this.f133339b = jVar;
        this.f133340c = dVar;
        this.f133341d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f133338a;
        int i15 = this.f133341d;
        ir0.d dVar = this.f133340c;
        j jVar = this.f133339b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        j.a aVar = j.f133348g;
        switch (i14) {
            case 0:
                jVar.j(dVar, mVar, p0.t(i15 | 1));
                break;
            default:
                jVar.i(dVar, mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
