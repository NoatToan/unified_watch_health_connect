package yn0;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j23.g f198151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ un0.a f198152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f198153d;

    public /* synthetic */ f(j23.g gVar, un0.a aVar, int i14, int i15) {
        this.f198150a = i15;
        this.f198151b = gVar;
        this.f198152c = aVar;
        this.f198153d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198150a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                i.c(this.f198151b, this.f198152c, mVar, p0.t(this.f198153d | 1));
                break;
            case 1:
                l.c(this.f198151b, this.f198152c, mVar, p0.t(this.f198153d | 1));
                break;
            case 2:
                m.c(this.f198151b, this.f198152c, mVar, p0.t(this.f198153d | 1));
                break;
            default:
                n.c(this.f198151b, this.f198152c, mVar, p0.t(this.f198153d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
