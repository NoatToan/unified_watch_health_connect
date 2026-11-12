package gm2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import com.garmin.device.datatypes.DeviceProfile;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
public interface d extends hk2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f78016a = a.f78017a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgm2/d$a;", "", "<init>", "()V", "device-pairing-gdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f78017a = new a();

        private a() {
        }
    }

    @SuppressLint({"MissingPermission"})
    dk2.d b(DeviceProfile deviceProfile, BluetoothDevice bluetoothDevice);
}
