package defpackage;

import com.careforeyou.library.bt.scanner.BluetoothLeScannerCompat;

/* JADX INFO: loaded from: classes4.dex */
public class vq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile BluetoothLeScannerCompat f51444c;

    public static boolean e() {
        return true;
    }

    public static BluetoothLeScannerCompat b() {
        if (f51444c == null) {
            if (e()) {
                f51444c = new vr();
            } else {
                f51444c = new vj();
            }
        }
        return f51444c;
    }
}
