package ov1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f134169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mv1.b f134170c;

    public /* synthetic */ h(j jVar, mv1.b bVar, int i14, int i15) {
        this.f134168a = i15;
        this.f134169b = jVar;
        this.f134170c = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f134168a;
        mv1.b bVar = this.f134170c;
        j jVar = this.f134169b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        j.a aVar = j.f134173d;
        switch (i14) {
            case 0:
                jVar.z6(bVar, mVar, p0.t(1));
                break;
            default:
                jVar.y6(bVar, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
