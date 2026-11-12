package sm2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs2.c f160292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qm2.l f160293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2.f f160294c = lm2.h.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Logger f160295d = LoggerFactory.getLogger("PAIR#ConfigPermissionsTask");

    public e(rs2.c cVar, qm2.l lVar) {
        this.f160292a = cVar;
        this.f160293b = lVar;
    }

    public static Boolean b(int i14, qm2.l lVar) {
        qm2.m mVar = lVar.f145759a.f145780a.get(Integer.valueOf(i14));
        if (mVar == null) {
            return null;
        }
        qm2.l.c cVar = mVar.f145778a;
        if (cVar == qm2.l.c.ALWAYS_ON) {
            return Boolean.TRUE;
        }
        if (cVar == qm2.l.c.ALWAYS_OFF) {
            return Boolean.FALSE;
        }
        Boolean bool = mVar.f145779b;
        if (bool != null) {
            return bool;
        }
        if (cVar == qm2.l.c.INITIALIZE_ONLY) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final boolean a(int i14) {
        lm2.f fVar = this.f160294c;
        rs2.c cVar = this.f160292a;
        if (fVar.b(cVar, i14) != -1) {
            boolean zE = fVar.e(cVar, i14);
            d(i14, zE);
            return zE;
        }
        Boolean boolB = b(i14, this.f160293b);
        if (boolB == null) {
            return false;
        }
        d(i14, boolB.booleanValue());
        return boolB.booleanValue();
    }

    public final void c() {
        boolean z14;
        boolean z15;
        boolean zA = a(1);
        boolean zA2 = a(2);
        boolean zA3 = a(3);
        hk0.f fVar = da2.d.c(((fm2.c) lm2.h.c()).g()).f58887b;
        rs2.c cVar = this.f160292a;
        if (fVar != null) {
            boolean zD = fVar.d(cVar);
            boolean zI = fVar.i(cVar);
            d(4, zI);
            z15 = zI;
            z14 = zD;
        } else {
            z14 = false;
            z15 = false;
        }
        try {
            String f172493a = cVar.getF172493a();
            g gVar = g.f160297a;
            f172493a.getClass();
            ge1.b.W(t13.h.f161748a, new h(f172493a, zA, zA2, zA3, z14, z15, null));
        } catch (Exception e4) {
            this.f160295d.error("Unable to configure settings for " + cVar.getF172493a(), (Throwable) e4);
        }
    }

    public final void d(int i14, boolean z14) {
        lm2.f fVar = this.f160294c;
        Logger logger = this.f160295d;
        rs2.c cVar = this.f160292a;
        if (i14 == 1) {
            logger.debug("saveAutoUploadPermission(" + cVar.getF172493a() + ", " + z14 + ")");
            fVar.j(cVar, 1, z14);
            return;
        }
        if (i14 == 2) {
            logger.debug("saveWeatherConditionsPermission(" + cVar.getF172493a() + ", " + z14 + ")");
            fVar.j(cVar, 2, z14);
            return;
        }
        if (i14 == 3) {
            logger.debug("saveWeatherAlertsPermission(" + cVar.getF172493a() + ", " + z14 + ")");
            fVar.j(cVar, 3, z14);
            return;
        }
        if (i14 != 4) {
            return;
        }
        logger.debug("saveLiveTrackAutoStartPermission(" + cVar.getF172493a() + ", " + z14 + ")");
        fVar.j(cVar, 4, z14);
    }
}
