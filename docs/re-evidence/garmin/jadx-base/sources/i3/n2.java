package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n2 f89051a = new n2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3.e f89052b;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f89053a = new a();

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
    public static final class b implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f89054a = new b();

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

    static {
        new z3.e(-1294623166, false, a.f89053a);
        f89052b = new z3.e(-91331245, false, b.f89054a);
    }
}
