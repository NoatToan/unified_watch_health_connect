package t91;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import ub0.k;
import w52.z1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f163203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f163204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f163205d;

    public /* synthetic */ b(r rVar, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f163202a = i15;
        this.f163203b = rVar;
        this.f163204c = aVar;
        this.f163205d = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f163202a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                c.a(this.f163203b, this.f163204c, this.f163205d, mVar, p0.t(1));
                break;
            case 1:
                k.f(this.f163203b, this.f163204c, this.f163205d, mVar, p0.t(7));
                break;
            default:
                z1.a(this.f163203b, this.f163204c, this.f163205d, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
