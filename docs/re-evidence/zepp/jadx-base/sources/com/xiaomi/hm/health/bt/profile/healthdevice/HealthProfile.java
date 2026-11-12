package com.xiaomi.hm.health.bt.profile.healthdevice;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.util.Pair;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.collect.DataCollect;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/healthdevice/HealthProfile;", "Lcom/xiaomi/hm/health/bt/profile/milipro/MiLiProProfile;", "Landroid/util/Pair;", "", "getCoeff", "Ljava/util/Calendar;", "time", "Lcom/xiaomi/hm/health/bt/profile/collect/DataCollect;", "getCollectDataForOld", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/bluetooth/BluetoothDevice;", "device", "Lcom/xiaomi/hm/health/bt/gatt/IGattCallback$IConnectionStateChangeCallback;", "connCB", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lcom/xiaomi/hm/health/bt/gatt/IGattCallback$IConnectionStateChangeCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HealthProfile extends MiLiProProfile {
    private static final byte G1 = 14;
    private static final short H1 = 41;

    public HealthProfile(@NotNull Context context, @NotNull BluetoothDevice bluetoothDevice, @NotNull IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback) {
        super(context, bluetoothDevice, iConnectionStateChangeCallback);
    }

    @Nullable
    public final Pair<Integer, Integer> getCoeff() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{14}, 1);
        if (hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 14)) {
            byte[] data = hMNotifyResponseSendECFCommand.getData();
            if (data != null && data.length == 8) {
                return Pair.create(Integer.valueOf(((data[1] & 255) << 8) | (data[0] & 255) | ((data[2] & 255) << 16) | ((data[3] & 255) << 24)), Integer.valueOf(((data[7] & 255) << 24) | (data[4] & 255) | ((data[5] & 255) << 8) | ((data[6] & 255) << 16)));
            }
        }
        return null;
    }

    @Nullable
    public final DataCollect getCollectDataForOld(@NotNull Calendar time) {
        return getCollectData(time, H1);
    }
}
