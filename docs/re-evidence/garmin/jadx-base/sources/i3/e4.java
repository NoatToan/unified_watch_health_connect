package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class e4 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u4.d f87945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f87946b;

    public e4(u4.d dVar, String str) {
        this.f87945a = dVar;
        this.f87946b = str;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            i7.b(this.f87945a, this.f87946b, null, 0L, mVar2, 0, 12);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
