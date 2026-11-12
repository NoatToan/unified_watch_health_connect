package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m2 f88937a = new m2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3.e f88938b = new z3.e(1392012807, false, b.f88942a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z3.e f88939c = new z3.e(1768941633, false, c.f88943a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z3.e f88940d = new z3.e(-788244078, false, a.f88941a);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f88941a = new a();

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f88942a = new b();

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                f0.f88041a.a(null, 0.0f, 0.0f, null, 0L, mVar2, 196608);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements e23.q<fe, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f88943a = new c();

        @Override // e23.q
        public final Unit invoke(fe feVar, p3.m mVar, Integer num) {
            fe feVar2 = feVar;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= mVar2.B(feVar2) ? 4 : 2;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                p3.x1 x1Var = p3.n.f135158a;
                ce.b(feVar2, null, null, mVar2, iIntValue & 14, 6);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }
}
