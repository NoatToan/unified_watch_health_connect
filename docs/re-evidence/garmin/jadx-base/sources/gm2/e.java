package gm2;

import android.bluetooth.BluetoothDevice;
import com.garmin.device.datatypes.DeviceProfile;
import la2.i;
import ma2.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgm2/e;", "Lma2/j;", "device-pairing-gdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hk2.a f78018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothDevice f78019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f78020c;

    public e(hk2.a aVar, BluetoothDevice bluetoothDevice, d dVar) {
        this.f78018a = aVar;
        this.f78019b = bluetoothDevice;
        this.f78020c = dVar;
    }

    @Override // ma2.j
    public final void c(i iVar) {
        String address = this.f78019b.getAddress();
        address.getClass();
        this.f78018a.c(address, iVar != null ? iVar.name() : null);
    }

    @Override // ma2.j
    public final void d(DeviceProfile deviceProfile) {
        this.f78018a.a(this.f78020c.b(deviceProfile, this.f78019b));
    }

    @Override // ma2.j
    public final void e() {
        String address = this.f78019b.getAddress();
        address.getClass();
        this.f78018a.b(address);
    }
}
