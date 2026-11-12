package kn2;

import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import ms2.d;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkn2/a;", "", "", "url", "Lms2/d;", "provider", "Lcom/google/common/util/concurrent/ListeningScheduledExecutorService;", "executorService", "Lo13/p;", "", "widthHeight", "<init>", "(Ljava/lang/String;Lms2/d;Lcom/google/common/util/concurrent/ListeningScheduledExecutorService;Lo13/p;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f105681g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f105683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListeningScheduledExecutorService f105684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<Integer, Integer> f105685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f105686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zi2.a f105687f;

    static {
        new C2035a(null);
        int i14 = gt2.c.f79010a;
        f105681g = gt2.b.f79005a.h("PAY#DeviceWalletItemImageCreator");
    }

    public a(String str, d dVar, ListeningScheduledExecutorService listeningScheduledExecutorService, p<Integer, Integer> pVar) {
        str.getClass();
        dVar.getClass();
        listeningScheduledExecutorService.getClass();
        pVar.getClass();
        this.f105682a = str;
        this.f105683b = dVar;
        this.f105684c = listeningScheduledExecutorService;
        this.f105685d = pVar;
        this.f105686e = dVar.getF165540a().name() + ", unitID " + dVar.getF165542c().getUnitId() + ", productNbr " + dVar.getF165542c().getProductNumber() + ", url ->\n" + str;
        kj0.b.f104940a.getClass();
        this.f105687f = kj0.b.a();
    }

    /* JADX INFO: renamed from: kn2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkn2/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2035a {
        public /* synthetic */ C2035a(j jVar) {
            this();
        }

        private C2035a() {
        }
    }
}
