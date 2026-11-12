package com.huami.bluetooth.profile.channel.module.nfc;

import com.huami.bluetooth.profile.channel.module.base.ErrorCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "Lcom/huami/bluetooth/profile/channel/module/base/ErrorCode;", "toNFCErrorCode", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class NFCErrorCodeKt {
    @NotNull
    public static final ErrorCode toNFCErrorCode(int i) {
        return NFCErrorCode.INSTANCE.toErrorCode(i);
    }
}
