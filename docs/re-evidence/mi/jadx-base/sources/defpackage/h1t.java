package defpackage;

import android.os.ConditionVariable;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.sdk.fw.FwType;
import com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class h1t implements Runnable, xh {
    public ne c;
    public xd d;
    public IFirmwareProgressCallback e;
    public zet f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Progress f19594b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConditionVariable f19593a = new ConditionVariable();

    public h1t(ne neVar, xd xdVar, IFirmwareProgressCallback iFirmwareProgressCallback, zet zetVar) {
        this.c = neVar;
        this.d = xdVar;
        this.e = iFirmwareProgressCallback;
        this.f = zetVar;
    }

    @Override // defpackage.yh
    public void a(yd ydVar, Progress progress) {
    }

    @Override // defpackage.yh
    public void onError(int i) {
        t5t.d("FwTask", "onError:" + i);
        r3t.y().h(i);
    }

    @Override // defpackage.xh, defpackage.yh, defpackage.jys
    public void onFwProgress(Progress progress) {
        if (this.f19594b == null || progress.getPercent() != this.f19594b.getPercent()) {
            this.e.onFwProgress(progress, FwType.get(this.d.h()));
            this.f19594b = progress;
        }
    }

    @Override // defpackage.xh, defpackage.yh, defpackage.jys
    public void onFwStop(boolean z) {
        t5t.d("FwTask", "onFwStop:" + z);
        this.e.onFwStop(z, FwType.get(this.d.h()));
        this.f.onResult(z);
        this.f19593a.open();
    }

    @Override // java.lang.Runnable
    public void run() {
        t5t.d("FwTask", "firmwareInfo:" + this.d);
        if (!this.c.V()) {
            t5t.d("FwTask", "Device is not connected!!!");
            this.f.onResult(false);
            return;
        }
        t5t.d("FwTask", "In main fw task...");
        t5t.d("FwTask", new File(this.d.g()).getAbsolutePath());
        this.c.D0(this.d, this);
        this.f19593a.block();
        try {
            Thread.sleep(VibrateModeProgressBar.sLongToLong);
        } catch (Exception e) {
            t5t.d("FwTask", e.toString());
        }
        t5t.d("FwTask", "Out main fw task...");
    }

    @Override // defpackage.xh, defpackage.yh, defpackage.jys
    public void a(int i) {
        t5t.d("FwTask", "onFwStart");
        this.e.onFwStart(FwType.get(this.d.h()));
    }

    @Override // defpackage.xh
    public boolean a() {
        return !r3t.y().D();
    }
}
