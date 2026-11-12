package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p2 f89260a = new p2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3.e f89261b = new z3.e(-1548712596, false, a.f89262a);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.q<wd, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f89262a = new a();

        @Override // e23.q
        public final Unit invoke(wd wdVar, p3.m mVar, Integer num) {
            wd wdVar2 = wdVar;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= mVar2.B(wdVar2) ? 4 : 2;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                p3.x1 x1Var = p3.n.f135158a;
                le.d(wdVar2, null, null, 0L, 0L, 0L, 0L, 0L, mVar2, iIntValue & 14);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }
}
