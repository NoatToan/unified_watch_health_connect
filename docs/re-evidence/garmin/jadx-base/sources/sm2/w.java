package sm2;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Timer;
import java.util.UUID;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lsm2/w;", "", "Lorg/slf4j/Logger;", "logger", "", "macAddress", "Lsm2/w$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "allowRetries", "", "shouldTimeout", "<init>", "(Lorg/slf4j/Logger;Ljava/lang/String;Lsm2/w$b;IZ)V", "a", "b", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static long f160351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f160352i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f160353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f160355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f160356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f160357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f160358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Timer f160359g;

    public interface b {
        void a(long j8, long j14);

        void b(o13.p<byte[], UUID> pVar, String str);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"sm2/w$c", "Lsm2/w$b;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements b {
        public c() {
        }

        @Override // sm2.w.b
        public final void a(long j8, long j14) {
            int i14 = w.f160352i;
            w wVar = w.this;
            wVar.b();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - w.f160351h >= 2000) {
                w.f160351h = jCurrentTimeMillis;
                wVar.f160353a.debug(com.nimbusds.jose.shaded.gson.internal.a.g(j14, "/", ")", com.nimbusds.jose.shaded.gson.internal.a.j(j8, "readGarminDeviceXml.progress(", wVar.f160354b, ", ")));
            } else {
                wVar.f160353a.trace(com.nimbusds.jose.shaded.gson.internal.a.g(j14, "/", ")", com.nimbusds.jose.shaded.gson.internal.a.j(j8, "readGarminDeviceXml.progress(", wVar.f160354b, ", ")));
            }
            wVar.f160355c.a(j8, j14);
        }

        @Override // sm2.w.b
        public final void b(o13.p<byte[], UUID> pVar, String str) {
            int i14 = w.f160352i;
            w wVar = w.this;
            wVar.b();
            if ((pVar != null ? pVar.f128594a : null) == null || pVar.f128594a.length == 0) {
                w.a(wVar, str);
            } else {
                wVar.f160355c.b(pVar, null);
            }
        }
    }

    static {
        new a(null);
    }

    public w(Logger logger, String str, b bVar, int i14, boolean z14) {
        logger.getClass();
        str.getClass();
        bVar.getClass();
        this.f160353a = logger;
        this.f160354b = str;
        this.f160355c = bVar;
        this.f160356d = i14;
        this.f160357e = z14;
    }

    public static final void a(w wVar, String str) {
        Logger logger = wVar.f160353a;
        int i14 = wVar.f160358f + 1;
        wVar.f160358f = i14;
        if (i14 > wVar.f160356d) {
            wVar.f160355c.b(null, (str == null || str.length() == 0) ? "Failed to download device xml" : "Failed to download device xml: ".concat(str));
            return;
        }
        com.airbnb.lottie.animation.keyframe.a.A("handleDeviceXMLDownloadFailure: ", str, logger);
        logger.debug("Attempting retry " + wVar.f160358f);
        wVar.c();
    }

    public final void b() {
        if (this.f160359g != null) {
            this.f160353a.debug("cancelXmlTimer");
            Timer timer = this.f160359g;
            if (timer != null) {
                timer.cancel();
            }
            this.f160359g = null;
        }
    }

    public final void c() {
        String str = this.f160354b;
        boolean z14 = this.f160357e;
        StringBuilder sbD = zl.a.d("readGarminDeviceXml(", str, ") shouldTimeout:", z14, ", allowedRetries:");
        sbD.append(this.f160356d);
        String string = sbD.toString();
        Logger logger = this.f160353a;
        logger.debug(string);
        if (z14) {
            logger.debug("startXmlTimer");
            Timer timer = new Timer();
            this.f160359g = timer;
            timer.schedule(new x(this), 30000);
        }
        ((fm2.c) lm2.h.c()).o(str, new c());
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lsm2/w$a;", "", "<init>", "()V", "", "PROGRESS_INTERVAL", "J", "", "NO_RESPONSE_TIMEOUT", "I", "lastProgressBroadcast", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ w(Logger logger, String str, b bVar, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(logger, str, bVar, (i15 & 8) != 0 ? 0 : i14, (i15 & 16) != 0 ? true : z14);
    }
}
