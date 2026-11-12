package mx;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f121310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gx.a f121311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f121312d;

    public /* synthetic */ b(r rVar, gx.a aVar, int i14, int i15) {
        this.f121309a = i15;
        this.f121310b = rVar;
        this.f121311c = aVar;
        this.f121312d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (this.f121309a) {
            case 0:
                num.getClass();
                c.a(this.f121310b, this.f121311c, mVar, p0.t(this.f121312d | 1));
                break;
            default:
                num.intValue();
                j.a(this.f121310b, this.f121311c, mVar, p0.t(this.f121312d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
