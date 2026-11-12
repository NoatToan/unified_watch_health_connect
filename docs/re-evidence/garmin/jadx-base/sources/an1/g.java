package an1;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import rk0.b1;
import sk0.y0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f4487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f4489d;

    public /* synthetic */ g(r rVar, String str, e23.a aVar, int i14, int i15) {
        this.f4486a = i15;
        this.f4487b = rVar;
        this.f4488c = str;
        this.f4489d = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f4486a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                h.a(this.f4487b, this.f4488c, this.f4489d, mVar, p0.t(1));
                break;
            case 1:
                b1.a(this.f4487b, this.f4488c, this.f4489d, mVar, p0.t(7));
                break;
            case 2:
                y0.b(this.f4487b, this.f4488c, this.f4489d, mVar, p0.t(7));
                break;
            default:
                u11.d.a(this.f4487b, this.f4488c, this.f4489d, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
