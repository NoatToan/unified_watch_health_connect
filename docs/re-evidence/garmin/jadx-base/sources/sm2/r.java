package sm2;

import android.content.Context;
import android.os.AsyncTask;
import com.garmin.device.pairing.PairingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public abstract class r extends om2.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yl2.d f160338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f160339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f160340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ExecutorService f160341g = Executors.newFixedThreadPool(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rm2.c f160342h;

    public r(Context context, yl2.d dVar, rm2.c cVar, String str) {
        this.f160342h = null;
        String strConcat = "PAIR#".concat(str == null ? getClass().getSimpleName() : str);
        this.f160337c = strConcat;
        this.f160339e = context;
        this.f160338d = dVar;
        this.f160342h = cVar;
        this.f160340f = LoggerFactory.getLogger(strConcat);
    }

    public static void g(yl2.d dVar, rm2.c cVar) {
        dVar.f197853o = true;
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new q(dVar, true));
        if (cVar != null) {
            cVar.v(qm2.k.DISCONNECTING);
        }
    }

    @Override // om2.b
    public final String a() {
        return this.f160337c;
    }

    @Override // om2.b
    public final void c() {
        Logger logger = this.f160340f;
        try {
            if (f()) {
                h();
            }
        } catch (PairingException e4) {
            logger.error("Operation failed", (Throwable) e4);
            e(e4);
        } catch (Exception e14) {
            logger.error("Operation failed", (Throwable) e14);
            e(new PairingException(this, yl2.e.OTHER_FATAL, e14.getMessage()));
        }
    }

    public abstract void h();

    public final void i(int i14) {
        this.f160338d.f197853o = true;
        e(new PairingException(this, yl2.e.DISCONNECTION, am.j.h(i14, "Gatt status: ")));
    }

    public void onDeviceDisconnected(la2.h hVar) {
        if (this.f160338d.f197854p) {
            i(hVar.f111674b);
        }
    }
}
