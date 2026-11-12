package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ka implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f88682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f88683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.j f88684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg f88685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f88686e;

    public ka(boolean z14, boolean z15, a2.j jVar, sg sgVar, o4.r1 r1Var) {
        this.f88682a = z14;
        this.f88683b = z15;
        this.f88684c = jVar;
        this.f88685d = sgVar;
        this.f88686e = r1Var;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            ba.f87580a.a(this.f88682a, this.f88683b, this.f88684c, null, this.f88685d, this.f88686e, 0.0f, 0.0f, mVar2, 100663296, 200);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
