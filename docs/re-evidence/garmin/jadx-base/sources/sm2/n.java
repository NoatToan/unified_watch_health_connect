package sm2;

import com.garmin.device.pairing.PairingException;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes11.dex */
public class n extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f160328a;

    public n(o oVar) {
        this.f160328a = oVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        o oVar = this.f160328a;
        oVar.f160330j.F();
        oVar.f160340f.warn(".handlePairingPasskeyRequired() > onTimerExpired(): User let pin prompt timer expire.");
        oVar.e(new PairingException(oVar, yl2.e.PASSKEY_TIMEOUT, "Garmin Auth timeout"));
    }
}
