package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMMiliProExtDevice;", "Lcom/xiaomi/hm/health/bt/profile/milipro/MiLiProProfile;", "P", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/bluetooth/BluetoothDevice;", "device", "newProfile", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Lcom/xiaomi/hm/health/bt/profile/milipro/MiLiProProfile;", "getProfile", "()Lcom/xiaomi/hm/health/bt/profile/milipro/MiLiProProfile;", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)V", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "(Landroid/content/Context;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class HMMiliProExtDevice<P extends MiLiProProfile> extends HMMiLiProDevice {
    public HMMiliProExtDevice(@NotNull Context context, @NotNull BluetoothDevice bluetoothDevice) {
        super(context, bluetoothDevice);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice
    @NotNull
    public P newProfile(@NotNull Context context, @NotNull BluetoothDevice device) {
        P p = (P) super.newProfile(context, device);
        Objects.requireNonNull(p, "null cannot be cast to non-null type P of com.xiaomi.hm.health.bt.device.HMMiliProExtDevice");
        return p;
    }

    public HMMiliProExtDevice(@NotNull Context context, @NotNull String str) {
        super(context, str);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice
    @NotNull
    public P getProfile() {
        P p = (P) this.miLiProProfile;
        Objects.requireNonNull(p, "null cannot be cast to non-null type P of com.xiaomi.hm.health.bt.device.HMMiliProExtDevice");
        return p;
    }
}
