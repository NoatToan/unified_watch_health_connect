package c40;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e50.i f24322b;

    public /* synthetic */ f(e50.i iVar, int i14, int i15) {
        this.f24321a = i15;
        this.f24322b = iVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f24321a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                g.a(this.f24322b, mVar, p0.t(1));
                break;
            default:
                h.a(this.f24322b, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
