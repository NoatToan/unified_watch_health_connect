package defpackage;

import com.huami.bluetooth.profile.characteristic.DataCallback;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class to2 implements IGattCallback.INotifyCallback {
    public final /* synthetic */ DataCallback a;

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
    public final void notify(byte[] bArr) {
        this.a.onReceived(bArr);
    }
}
