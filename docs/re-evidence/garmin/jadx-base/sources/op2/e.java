package op2;

import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lop2/e;", "Lwr2/q;", "Lfs2/a;", "deviceWalletItem", "<init>", "(Lfs2/a;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends wr2.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f133186f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z0 f133187e;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f133186f = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayRemoveCardOperation");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fs2.a aVar) {
        super(aVar, is2.b.FITPAY);
        aVar.getClass();
        ms2.g gVar = this.f186874b;
        this.f133187e = gVar instanceof z0 ? (z0) gVar : null;
    }

    @Override // wr2.q
    public final boolean a() {
        if (this.f133187e != null) {
            return super.a();
        }
        f133186f.warn("Can't remove FitPay card (reason: can't retrieve FitPayServiceProvider)");
        return false;
    }

    @Override // wr2.q
    public final void b(long j8, mr2.c.j jVar) {
        aq2.b.f12463a.getClass();
        if (aq2.b.f12464b) {
            f133186f.debug("removeCard: fitpay API is under maintenance, can not remove card");
            jVar.invoke(wr2.q.b.API_UNDER_MAINTENANCE);
        } else {
            x53.c cVar = s0.f129406a;
            ge1.b.T(c0.a(u53.o.f168762a), null, null, new f(j8, this, jVar, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lop2/e$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
