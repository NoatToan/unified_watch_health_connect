package tl2;

import android.os.Handler;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.device.nfc.NfcCommandHandler;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import vo2.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Ltl2/c;", "", "Ltl2/e;", "transferData", "", "useExplicitLock", "Ltl2/c$c;", "transferType", "", HeaderParameterNames.AUTHENTICATION_TAG, "<init>", "(Ltl2/e;ZLtl2/c$c;Ljava/lang/String;)V", "a", "b", "c", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f165283l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC3105c f165285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f165286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f165287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f165288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.garmin.device.nfc.g f165289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f165290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f165291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f165292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f165293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f165294k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltl2/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        SUCCESS,
        FAILED_START_BY_DEVICE_BUSY,
        FAILED_START_NOT_RECEIVE_RESPONSE,
        FAILED_FINISH_BY_DEVICE_BUSY,
        FAILED_FINISH_NOT_RECEIVE_RESPONSE,
        IDLE_TIMEOUT,
        DISCONNECTED,
        DROPPED
    }

    /* JADX INFO: renamed from: tl2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltl2/c$c;", "", "<init>", "(Ljava/lang/String;I)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC3105c {
        HIGH_PRIORITY_MESSAGE,
        APDU,
        WALLET_UPDATE,
        LOW_PRIORITY_MESSAGE,
        MULTI_PACKAGE_APDU
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"tl2/c$d", "Lcom/garmin/device/nfc/g$f;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements com.garmin.device.nfc.g.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cs2.a<b> f165310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f165311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f165312c;

        public d(cs2.a<b> aVar, c cVar, int i14) {
            this.f165310a = aVar;
            this.f165311b = cVar;
            this.f165312c = i14;
        }

        @Override // com.garmin.device.nfc.g.e
        public final void a(com.garmin.device.nfc.i iVar) {
            int i14 = this.f165312c;
            c cVar = this.f165311b;
            cs2.a<b> aVar = this.f165310a;
            byte[] bArrD = iVar.d();
            bArrD.getClass();
            if ((bArrD.length == 0 ? (byte) 2 : bArrD[0]) == 1) {
                aVar.accept(b.SUCCESS);
                return;
            }
            Byte bValueOf = bArrD.length > 1 ? Byte.valueOf(bArrD[1]) : null;
            cVar.f165290g.error("Failure response " + bValueOf + " from device for explicit lock end, retries:" + i14);
            if (i14 <= 0) {
                aVar.accept(b.FAILED_FINISH_BY_DEVICE_BUSY);
                return;
            }
            tl2.d dVar = new tl2.d(cVar, aVar, i14, 0);
            synchronized (cVar.f165287d) {
                cVar.f165287d.postDelayed(dVar, 500L);
            }
        }

        @Override // com.garmin.device.nfc.g.f
        public final void b(int i14) {
            this.f165311b.f165290g.error("Failure to get response from device for explicit lock end");
            this.f165310a.accept(b.FAILED_FINISH_NOT_RECEIVE_RESPONSE);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"tl2/c$e", "Lcom/garmin/device/nfc/g$f;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements com.garmin.device.nfc.g.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cs2.a<b> f165313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f165314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f165315c;

        public e(cs2.a<b> aVar, c cVar, int i14) {
            this.f165313a = aVar;
            this.f165314b = cVar;
            this.f165315c = i14;
        }

        @Override // com.garmin.device.nfc.g.e
        public final void a(com.garmin.device.nfc.i iVar) {
            int i14 = this.f165315c;
            c cVar = this.f165314b;
            cs2.a<b> aVar = this.f165313a;
            byte[] bArrD = iVar.d();
            bArrD.getClass();
            byte b14 = bArrD.length == 0 ? (byte) 2 : bArrD[0];
            if (b14 == 1) {
                aVar.accept(b.SUCCESS);
                return;
            }
            cVar.f165290g.error("Failure response from device for explicit lock start, retries:" + i14);
            if (b14 != 3 || i14 <= 0) {
                aVar.accept(b.FAILED_START_BY_DEVICE_BUSY);
                return;
            }
            Byte bValueOf = bArrD.length > 1 ? Byte.valueOf(bArrD[1]) : null;
            cVar.f165290g.warn("Busy response " + bValueOf + " from device for explicit lock start");
            tl2.d dVar = new tl2.d(cVar, aVar, i14, 1);
            synchronized (cVar.f165287d) {
                cVar.f165287d.postDelayed(dVar, 500L);
            }
        }

        @Override // com.garmin.device.nfc.g.f
        public final void b(int i14) {
            this.f165314b.f165290g.error("Failure to get response from device for explicit lock start");
            this.f165313a.accept(b.FAILED_START_NOT_RECEIVE_RESPONSE);
        }
    }

    static {
        new a(null);
    }

    public c(tl2.e eVar, boolean z14, EnumC3105c enumC3105c, String str) {
        eVar.getClass();
        enumC3105c.getClass();
        str.getClass();
        this.f165284a = z14;
        this.f165285b = enumC3105c;
        this.f165286c = eVar.f165320a;
        this.f165287d = eVar.f165322c;
        this.f165288e = eVar.f165324e;
        this.f165289f = eVar.f165321b;
        Logger logger = LoggerFactory.getLogger("PAY#NFC#".concat(str));
        logger.getClass();
        this.f165290g = logger;
        this.f165291h = eVar.f165323d;
        this.f165292i = 60000L;
        this.f165293j = new AtomicInteger(0);
    }

    public final void a() {
        synchronized (this.f165287d) {
            this.f165287d.removeCallbacksAndMessages(null);
            Unit unit = Unit.INSTANCE;
        }
    }

    public void b() {
        this.f165293j.compareAndSet(1, 2);
        this.f165290g.trace("Disconnecting transfer id " + this.f165291h);
        this.f165286c.b(b.DISCONNECTED);
    }

    public abstract void c(b bVar, tl2.a aVar);

    public abstract void d(tl2.b bVar);

    public final void e() {
        f(b.SUCCESS, null);
    }

    public final void f(b bVar, s sVar) {
        bVar.getClass();
        int andSet = this.f165293j.getAndSet(2);
        if (andSet == 0) {
            this.f165286c.b(bVar);
            if (sVar != null) {
                sVar.accept(Boolean.FALSE);
                return;
            }
            return;
        }
        if (andSet == 1) {
            a();
            c(bVar, new tl2.a(this, sVar, bVar, 0));
        } else {
            if (andSet != 2) {
                return;
            }
            this.f165290g.error("Unexpected call end() for not running transfer " + this.f165291h);
            if (sVar != null) {
                sVar.accept(Boolean.FALSE);
            }
        }
    }

    public final void g(cs2.a<b> aVar, int i14) {
        aVar.getClass();
        if (!this.f165284a) {
            aVar.accept(b.SUCCESS);
        } else {
            this.f165290g.trace("End explicit lock");
            this.f165289f.c(new com.garmin.device.nfc.i(NfcCommandHandler.b.NFC_ACCESS_RELEASE, new byte[]{this.f165288e}), new d(aVar, this, i14), AbstractComponentTracker.LINGERING_TIMEOUT);
        }
    }

    public final void h(cs2.a<b> aVar, int i14) {
        aVar.getClass();
        if (!this.f165284a) {
            aVar.accept(b.SUCCESS);
            return;
        }
        com.garmin.device.nfc.i iVar = new com.garmin.device.nfc.i(NfcCommandHandler.b.NFC_ACCESS_ACQUIRE, new byte[]{this.f165288e});
        this.f165290g.trace("Start explicit lock");
        this.f165289f.c(iVar, new e(aVar, this, i14), AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    public final void i() {
        synchronized (this.f165287d) {
            this.f165287d.postDelayed(new po.g(this, 23), this.f165292i);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Ltl2/c$a;", "", "<init>", "()V", "", "NOT_STARTED", "I", "RUNNING", "ENDED", "", "DEFAULT_TRANSFER_IDLE_TIMEOUT", "J", "BUSY_RETRY_DELAY", "BUSY_RETRY_ATTEMPTS", "END_RETRY_ATTEMPTS", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
