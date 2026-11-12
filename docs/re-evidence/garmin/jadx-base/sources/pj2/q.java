package pj2;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class q extends ScanCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f138108a;

    public q(v vVar) {
        this.f138108a = vVar;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i14) {
        UUID uuid = v.f138114t;
        v vVar = this.f138108a;
        vVar.d();
        vVar.f138122f.sendMessage(v.e.f138165i.b(i14, v.b.SCAN_FAILED));
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i14, ScanResult scanResult) {
        v vVar = this.f138108a;
        vVar.f138121e.info("device found, name: {}, address: {}", scanResult.getDevice().getName(), scanResult.getDevice().getAddress());
        if (vVar.f138118b.equals(scanResult.getDevice().getAddress())) {
            vVar.f138121e.debug("device found using scan method");
            vVar.d();
            vVar.f138122f.removeMessages(1003);
            vVar.f138122f.sendMessage(v.e.f138160d.b(1, scanResult.getDevice()));
        }
    }
}
