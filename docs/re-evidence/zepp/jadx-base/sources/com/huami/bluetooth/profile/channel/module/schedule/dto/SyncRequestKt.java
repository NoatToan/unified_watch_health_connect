package com.huami.bluetooth.profile.channel.module.schedule.dto;

import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0004"}, d2 = {"", "value", "", "a", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class SyncRequestKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] a(long j) {
        byte[] bArrNumberToBytes = GattUtils.numberToBytes(j, 4);
        return bArrNumberToBytes == null ? ByteUtilsKt.toByteArray(0, 4) : bArrNumberToBytes;
    }
}
