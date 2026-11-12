package sm2;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.garmin.android.gfdi.AuthRegistry;
import com.garmin.device.pairing.PairingException;
import ds.e0;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class o extends a implements rm2.f, la2.a, AuthRegistry.Callback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f160329o = ((fm2.c) lm2.h.c()).f72122c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rm2.h f160330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Timer f160331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f160332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f160333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f160334n;

    public o(Context context, yl2.d dVar, rm2.c cVar, rm2.h hVar) {
        super(context, dVar, cVar, "HandshakeOperation");
        this.f160332l = 0;
        this.f160333m = 0L;
        this.f160334n = new AtomicBoolean(false);
        this.f160330j = hVar;
    }

    @Override // sm2.r
    public final void h() {
        this.f160332l = 0;
        this.f160333m = SystemClock.elapsedRealtime();
        j();
    }

    @Override // sm2.a
    public final void j() {
        this.f160332l++;
        yl2.d dVar = this.f160338d;
        bm2.a aVar = dVar.f197841c;
        if (aVar == null || !oa2.a.c(aVar.f18886a) || dVar.f197842d != null) {
            super.j();
            return;
        }
        this.f160340f.debug("connectDevice: already bonded");
        Timer timer = new Timer();
        this.f160331k = timer;
        timer.schedule(new m(this), 3000L);
    }

    @Override // sm2.a
    public final void k(String str) {
        if (!p(str)) {
            super.k(str);
            return;
        }
        boolean andSet = this.f160334n.getAndSet(false);
        Logger logger = this.f160340f;
        if (andSet) {
            e0.u("handleConnectingFailure(", str, "):  Retry already in progress", logger);
            return;
        }
        e0.u("handleConnectingFailure(", str, "):  Retrying...", logger);
        yl2.d dVar = this.f160338d;
        dVar.f197853o = true;
        long f197655a = dVar.getF197655a();
        bm2.a aVar = dVar.f197841c;
        ((fm2.c) lm2.h.c()).d(f197655a, aVar != null ? aVar.f18886a : null, true);
        Timer timer = this.f160331k;
        if (timer != null) {
            timer.cancel();
        }
        j();
    }

    @Override // sm2.a
    public final void l(String str) {
        if (!p(str)) {
            super.l(str);
            return;
        }
        e0.u("handleConnectingTimeout(", str, "):  Retrying...", this.f160340f);
        this.f160334n.set(true);
        yl2.d dVar = this.f160338d;
        dVar.f197853o = true;
        long f197655a = dVar.getF197655a();
        bm2.a aVar = dVar.f197841c;
        ((fm2.c) lm2.h.c()).d(f197655a, aVar != null ? aVar.f18886a : null, true);
        Timer timer = this.f160331k;
        if (timer != null) {
            timer.cancel();
        }
        j();
    }

    public final void o(String str) {
        yl2.d dVar;
        bm2.a aVar;
        int i14;
        Timer timer = this.f160331k;
        if (timer != null) {
            timer.cancel();
        }
        Logger logger = this.f160340f;
        if (str == null || (aVar = (dVar = this.f160338d).f197841c) == null) {
            logger.warn(".onPasskeyResponse() > onCancel(): User pressed the prompt's cancel button. Exiting flow.");
            e(new PairingException(this, yl2.e.ABORTED));
            return;
        }
        aVar.f18889d = str;
        String f197656b = dVar.getF197656b();
        fm2.c cVar = (fm2.c) lm2.h.c();
        f197656b.getClass();
        if (da2.c.f58878b == null) {
            da2.c.f58878b = new da2.c();
        }
        da2.c cVar2 = da2.c.f58878b;
        Context contextG = cVar.g();
        cVar2.getClass();
        da2.d dVarC = da2.d.c(contextG);
        ea2.c cVar3 = (ea2.c) dVarC.getCapability(f197656b, ea2.c.class);
        if (cVar3 != null) {
            cVar3.authenticateDevice(str);
            i14 = 0;
        } else {
            i14 = dVarC.a(f197656b) != null ? 1 : 2;
        }
        if (i14 == 0) {
            return;
        }
        if (f160329o == i14) {
            dVar.f197853o = true;
            e(new PairingException(this, yl2.e.PASSKEY_TIMEOUT, "Garmin Auth device disconnect"));
            return;
        }
        logger.error("Authenticate passkey failed with status [" + i14 + "]");
        e(new PairingException(this, yl2.e.ABORTED));
    }

    @Override // com.garmin.android.gfdi.AuthRegistry.Callback
    public final void onDeviceAuthenticated(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        rm2.c cVar = this.f160342h;
        if (cVar != null) {
            cVar.v(qm2.k.AUTHENTICATED);
            cVar.v(qm2.k.CONNECTING);
        }
        pm2.a aVar = this.f160284i;
        if (aVar != null) {
            aVar.b(this.f160339e);
        }
        yl2.d dVar = this.f160338d;
        dVar.f197843e = bArr;
        dVar.f197844f = bArr2;
        dVar.f197845g = bArr3;
        StringBuilder sb3 = new StringBuilder(".handleDeviceAuthenticated()");
        if (dVar.f197843e == null || dVar.f197844f == null || dVar.f197845g == null) {
            sb3.append(" Garmin auth does not exist");
        } else {
            sb3.append(" Garmin auth exists");
        }
        this.f160340f.debug(sb3.toString());
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        this.f160334n.set(false);
        m(new bm2.d(bVar.f111632a));
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
        String string = cVar.f111634b.toString();
        if (cVar.b()) {
            l(string);
        } else {
            k(string);
        }
    }

    @Override // com.garmin.android.gfdi.AuthRegistry.Callback
    public final void onPasskeyRequired(String str, int i14) {
        this.f160340f.debug(".onPasskeyRequired()");
        rm2.c cVar = this.f160342h;
        if (cVar != null) {
            cVar.v(qm2.k.AUTHENTICATING);
        }
        long j8 = this.f160338d.f197852n;
        if (j8 > 0 && j8 != -1) {
            try {
                String strValueOf = String.valueOf(j8);
                if (!TextUtils.isEmpty(strValueOf)) {
                    if (strValueOf.length() > 6) {
                        strValueOf = strValueOf.substring(strValueOf.length() - 6, strValueOf.length());
                    } else if (strValueOf.length() < 6) {
                        StringBuilder sb3 = new StringBuilder(strValueOf);
                        for (int length = 6 - strValueOf.length(); length > 0; length--) {
                            sb3.insert(0, "0");
                        }
                        strValueOf = sb3.toString();
                    }
                    o(strValueOf);
                    return;
                }
            } catch (NumberFormatException unused) {
            }
        }
        rm2.h hVar = this.f160330j;
        hVar.F();
        if (i14 <= 0) {
            i14 = 30;
        }
        hVar.H(i14, this);
        Timer timer = new Timer();
        this.f160331k = timer;
        timer.schedule(new n(this), ((long) i14) * 1000);
    }

    public final boolean p(String str) {
        bm2.a aVar;
        if (la2.i.AUTHENTICATION_EXCEPTION.name().equals(str)) {
            return false;
        }
        boolean zEquals = la2.i.GFDI_PREMATURE_DISCONNECT.name().equals(str);
        yl2.d dVar = this.f160338d;
        if (!zEquals || (aVar = dVar.f197841c) == null || oa2.a.c(aVar.f18886a)) {
            bm2.a aVar2 = dVar.f197841c;
            return this.f160332l < ((aVar2 == null || !oa2.a.c(aVar2.f18886a)) ? 2 : 3) && SystemClock.elapsedRealtime() < this.f160333m + 60000;
        }
        this.f160340f.debug("Not retrying GFDI_PREMATURE_DISCONNECT since device is not bonded, likely user cancelled bonding prompt");
        return false;
    }
}
