package sm2;

import android.content.Context;
import android.os.Handler;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.device.pairing.PairingException;
import java.util.Timer;
import java.util.TimerTask;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class k extends sm2.a implements rm2.g, la2.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rm2.h f160314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Timer f160315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Timer f160316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f160317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f160318n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f160319o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f160320p;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            k kVar = k.this;
            kVar.f160317m = false;
            kVar.e(new PairingException(kVar, yl2.e.RESET_FAILURE, "Reset timed out"));
        }
    }

    public class b extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f160322a;

        public b(String str) {
            this.f160322a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            k.this.l(this.f160322a);
        }
    }

    public class c implements k7.b<Boolean> {
        public c() {
        }

        @Override // k7.b
        public final void accept(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            k kVar = k.this;
            if (zBooleanValue) {
                Timer timer = kVar.f160315k;
                if (timer != null) {
                    timer.cancel();
                }
                rm2.c cVar = kVar.f160342h;
                if (cVar != null) {
                    cVar.v(qm2.k.SENDING_DEVICE_RESET_COMMAND_SUCCESS);
                }
                kVar.f160340f.debug("Wait 10 secs for device reset...");
                kVar.f160320p.postDelayed(new po.g(kVar, 20), AbstractComponentTracker.LINGERING_TIMEOUT);
                return;
            }
            Timer timer2 = kVar.f160315k;
            if (timer2 != null) {
                timer2.cancel();
            }
            int i14 = kVar.f160318n + 1;
            kVar.f160318n = i14;
            if (i14 <= 1) {
                kVar.n();
                return;
            }
            rm2.c cVar2 = kVar.f160342h;
            if (cVar2 != null) {
                cVar2.m(qm2.k.SENDING_DEVICE_RESET_COMMAND_FAILURE, yl2.e.RESET_FAILURE, null);
            }
            kVar.e(new PairingException(kVar, yl2.e.RESET_FAILURE, "Reset command failed to send"));
        }
    }

    public k(Context context, yl2.d dVar, rm2.c cVar, rm2.h hVar, int i14) {
        super(context, dVar, cVar, "DeviceResetOperation");
        this.f160318n = 0;
        this.f160319o = 0;
        this.f160320p = new Handler();
        this.f160314j = hVar;
        this.f160319o = i14;
    }

    @Override // sm2.r
    public final void h() {
        yl2.d dVar = this.f160338d;
        boolean z14 = dVar.f197846h;
        Logger logger = this.f160340f;
        if (!z14 || dVar.f197849k) {
            logger.debug("Skipping device reset");
            d();
        } else {
            logger.debug(".promptResetDevice()");
            this.f160314j.q(this);
        }
    }

    public final void n() {
        Logger logger = this.f160340f;
        logger.debug(".resetDevice()");
        yl2.d dVar = this.f160338d;
        dVar.f197849k = true;
        dVar.f197850l = false;
        this.f160317m = true;
        rm2.c cVar = this.f160342h;
        if (cVar != null) {
            cVar.v(qm2.k.SENDING_DEVICE_RESET_COMMAND);
        }
        Timer timer = this.f160316l;
        if (timer != null) {
            timer.cancel();
        }
        if (dVar.getF197656b() == null) {
            logger.warn("MAC address unknown for reset.");
            e(new PairingException(this, yl2.e.RESET_FAILURE, "Reset attempted to unknown mac address"));
        } else {
            ((fm2.c) lm2.h.c()).n(dVar.getF197656b(), 500, new c());
        }
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        Timer timer = this.f160316l;
        if (timer != null) {
            timer.cancel();
        }
        m(new bm2.d(bVar.f111632a));
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
        String string = cVar.f111634b.toString();
        if (cVar.b()) {
            int i14 = this.f160319o;
            if (i14 <= 0) {
                l(string);
                return;
            }
            Timer timer = new Timer();
            this.f160316l = timer;
            timer.schedule(new b(string), ((long) i14) * 1000);
            return;
        }
        if (this.f160317m) {
            this.f160340f.warn("Receive device disconnect try reconnect again");
            j();
        } else {
            Timer timer2 = this.f160316l;
            if (timer2 != null) {
                timer2.cancel();
            }
            k(string);
        }
    }

    @Override // sm2.r, la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        if (!this.f160317m) {
            i(hVar.f111674b);
            return;
        }
        Timer timer = new Timer();
        this.f160315k = timer;
        timer.schedule(new a(), 30000L);
    }

    public k(Context context, yl2.d dVar, rm2.c cVar, rm2.h hVar) {
        this(context, dVar, cVar, hVar, 0);
    }
}
