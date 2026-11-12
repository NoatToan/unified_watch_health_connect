package c81;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g81.d f25702b;

    public /* synthetic */ k(g81.d dVar, int i14, int i15) {
        this.f25701a = i15;
        this.f25702b = dVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f25701a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                l.c(this.f25702b, mVar, p0.t(1));
                break;
            case 1:
                l.a(this.f25702b, mVar, p0.t(1));
                break;
            default:
                l.b(this.f25702b, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
