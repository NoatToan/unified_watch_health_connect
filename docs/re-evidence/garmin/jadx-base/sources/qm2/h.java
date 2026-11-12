package qm2;

import android.content.Context;
import bd0.c0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lqm2/h;", "Lmm2/a;", "<init>", "()V", "a", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends mm2.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f145710g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public nm2.a f145711f;

    static {
        new a(null);
        f145710g = LoggerFactory.getLogger("PAIR#BtcNonSetupStrategy");
    }

    public h() {
        super("BtcNonSetupStrategy");
    }

    @Override // mm2.a, mm2.d
    public final void a(l lVar, nm2.a aVar) {
        aVar.getClass();
        this.f145711f = aVar;
    }

    @Override // mm2.d
    public final void b(Context context, bm2.d dVar) {
        String strF = dVar.f();
        strF.getClass();
        mm2.e.f119687a.put(strF, Boolean.FALSE);
        int connectionType = dVar.getConnectionType();
        Logger logger = f145710g;
        if (connectionType == 2) {
            logger.info("***** BTC RECONNECT START ***** " + dVar.f());
        } else {
            logger.info("***** DUAL PAIRING BLE RECONNECT START ***** " + dVar.f());
        }
        if (dVar.getF172495c() > 0) {
            new sm2.e(dVar, ((c0) lm2.h.d()).b(String.valueOf(dVar.getF172495c()))).c();
        }
        e(dVar);
        if (vm2.e.c(dVar, ((em2.d) lm2.h.e()).f(dVar).f128594a)) {
            logger.debug("Device firmware version is greater than the cached XML firmware version... requesting device XML download.");
            logger.debug("readGarminDeviceXml(" + dVar.f() + ")");
            lm2.g gVarC = lm2.h.c();
            String strF2 = dVar.f();
            strF2.getClass();
            ((fm2.c) gVarC).o(strF2, new j(this, dVar));
        }
        d(dVar, true);
        if (dVar.getConnectionType() == 2) {
            logger.info("***** BTC RECONNECT COMPLETE ***** " + dVar.f());
            return;
        }
        logger.info("***** DUAL PAIRING BLE RECONNECT COMPLETE ***** " + dVar.f());
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqm2/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
