package po0;

import e23.l;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ co0.c f139007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f139008c;

    public /* synthetic */ c(co0.c cVar, l lVar, int i14, int i15) {
        this.f139006a = i15;
        this.f139007b = cVar;
        this.f139008c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f139006a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                g.b(this.f139007b, this.f139008c, mVar, p0.t(1));
                break;
            case 1:
                g.b(this.f139007b, this.f139008c, mVar, p0.t(1));
                break;
            case 2:
                g.b(this.f139007b, this.f139008c, mVar, p0.t(1));
                break;
            case 3:
                h.b(this.f139007b, this.f139008c, mVar, p0.t(1));
                break;
            case 4:
                h.b(this.f139007b, this.f139008c, mVar, p0.t(1));
                break;
            default:
                h.b(this.f139007b, this.f139008c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
