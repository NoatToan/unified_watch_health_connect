package wr2;

import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lwr2/q;", "", "Lfs2/a;", "deviceWalletItem", "Lis2/b;", "requiredServiceProviderType", "<init>", "(Lfs2/a;Lis2/b;)V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f186872d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fs2.a f186873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ms2.g f186874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final is2.b f186875c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr2/q$b;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        REMOVED_COMPLETELY,
        REMOVED_PARTIALLY,
        REMOVE_PRECONDITIONS_FAILED,
        REMOVE_FAILED,
        ALREADY_REMOVED,
        API_UNDER_MAINTENANCE
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f186872d = gt2.b.f79005a.h("PAY#RemoveCardOperation");
    }

    public q(fs2.a aVar, is2.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.f186873a = aVar;
        this.f186875c = bVar;
        is2.b bVar2 = aVar.f73427b;
        this.f186874b = bVar2 != null ? ps2.w.f140538a.a(bVar2) : null;
    }

    public boolean a() {
        is2.b bVar = this.f186873a.f73427b;
        is2.b bVar2 = this.f186875c;
        if (bVar == bVar2) {
            return true;
        }
        f186872d.warn("Invalid provider type provided (required type: " + bVar2 + ", found type: " + bVar + ")");
        return false;
    }

    public abstract void b(long j8, mr2.c.j jVar);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwr2/q$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
