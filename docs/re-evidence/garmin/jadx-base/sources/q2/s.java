package q2;

import android.graphics.drawable.Drawable;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class s implements e23.q<d0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Drawable f142193a;

    public s(Drawable drawable) {
        this.f142193a = drawable;
    }

    @Override // e23.q
    public final Unit invoke(d0 d0Var, p3.m mVar, Integer num) {
        long j8 = d0Var.f128833a;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            u.f142195a.a(this.f142193a, mVar2, 48);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
