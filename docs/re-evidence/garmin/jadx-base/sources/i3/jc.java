package i3;

import com.google.android.exoplayer2.C;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class jc implements e23.q<gj, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f88592a;

    public jc(String str) {
        this.f88592a = str;
    }

    @Override // e23.q
    public final Unit invoke(gj gjVar, p3.m mVar, Integer num) {
        gj gjVar2 = gjVar;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? mVar2.B(gjVar2) : mVar2.r(gjVar2) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            ej.a(gjVar2, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, z3.f.c(-999924215, new ic(this.f88592a), mVar2), mVar2, (iIntValue & 14) | C.ENCODING_PCM_32BIT, 255);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
