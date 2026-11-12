package a03;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f70a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3.e f71b = new z3.e(-830282246, false, a.f72a);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f72a = new a();

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            if ((num.intValue() & 11) == 2 && mVar2.b()) {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }
}
