package com.huami.bluetooth.profile.ecf.data;

import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;", "toHrReminderInfo", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class HrReminderInfoKt {
    @Nullable
    public static final HrReminderInfo toHrReminderInfo(@NotNull byte[] bArr) {
        if (bArr.length != 2) {
            return null;
        }
        return new HrReminderInfo(ByteUtilsKt.toBoolean(bArr[0]), ByteUtilsKt.toInt(bArr, 1, 1));
    }
}
