package q72;

import e23.l;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r72.i f143283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w82.a f143284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f143285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f143286e;

    public /* synthetic */ g(r72.i iVar, w82.a aVar, l lVar, int i14, int i15) {
        this.f143282a = i15;
        this.f143283b = iVar;
        this.f143284c = aVar;
        this.f143285d = lVar;
        this.f143286e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f143282a;
        m mVar = (m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                h.b(this.f143283b, this.f143284c, this.f143285d, mVar, p0.t(this.f143286e | 1));
                break;
            default:
                h.h(this.f143283b, this.f143284c, this.f143285d, mVar, p0.t(this.f143286e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
