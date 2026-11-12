package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class pe implements e23.q<c2.t2, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f89318a;

    public pe(String str) {
        this.f89318a = str;
    }

    @Override // e23.q
    public final Unit invoke(c2.t2 t2Var, p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            mh.c(this.f89318a, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262142);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
