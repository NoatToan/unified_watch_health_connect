package zz2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f207654a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3.e f207655b = new z3.e(-1589537738, false, a.f207656a);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f207656a = new a();

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            if ((num.intValue() & 11) == 2 && mVar2.b()) {
                mVar2.e();
            } else {
                b.f207647a.a(null, 0.0f, 0.0f, null, 0L, mVar2, 196608);
            }
            return Unit.INSTANCE;
        }
    }
}
