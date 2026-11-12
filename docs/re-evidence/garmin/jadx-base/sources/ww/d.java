package ww;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f187501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f187502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z3.e f187503d;

    public /* synthetic */ d(f fVar, r rVar, z3.e eVar, int i14, int i15) {
        this.f187500a = i15;
        this.f187501b = fVar;
        this.f187502c = rVar;
        this.f187503d = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f187500a;
        z3.e eVar = this.f187503d;
        r rVar = this.f187502c;
        f fVar = this.f187501b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        f.a aVar = f.f187506i;
        switch (i14) {
            case 0:
                fVar.o(rVar, eVar, mVar, p0.t(49));
                break;
            default:
                fVar.j(rVar, eVar, mVar, p0.t(49));
                break;
        }
        return Unit.INSTANCE;
    }
}
