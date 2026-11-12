package pj2;

import android.bluetooth.BluetoothGatt;
import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes11.dex */
public class g implements Predicate<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BluetoothGatt f138061a;

    public g(h hVar, BluetoothGatt bluetoothGatt) {
        this.f138061a = bluetoothGatt;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Void r14) {
        return this.f138061a.requestMtu(515);
    }
}
