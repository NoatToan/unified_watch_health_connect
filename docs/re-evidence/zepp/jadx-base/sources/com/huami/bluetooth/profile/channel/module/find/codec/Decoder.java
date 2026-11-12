package com.huami.bluetooth.profile.channel.module.find.codec;

import com.huami.bluetooth.profile.channel.module.base.CmdResponse;
import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/codec/Decoder;", "", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "", "originResponse", "Lcom/huami/bluetooth/profile/channel/module/base/CmdResponse;", "decode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class Decoder {

    @NotNull
    public static final Decoder INSTANCE = new Decoder();

    private Decoder() {
    }

    @NotNull
    public final ModuleResult<CmdResponse> decode(@NotNull ModuleResult<byte[]> originResponse) {
        if (originResponse instanceof Timeout) {
            return new Timeout(null, 1, null);
        }
        if (originResponse instanceof Failure) {
            return new Failure(((Failure) originResponse).getMsg(), 0, 2, null);
        }
        if (!(originResponse instanceof Success)) {
            return ModuleResult.Companion.fail$default(ModuleResult.INSTANCE, "未知错误类型", 0, 2, null);
        }
        byte[] bArrSubArrayWithoutFirstElement = ByteArrayKt.subArrayWithoutFirstElement((byte[]) ((Success) originResponse).getData());
        Byte bFirstOrNull = ArraysKt___ArraysKt.firstOrNull(bArrSubArrayWithoutFirstElement);
        byte bByteValue = bFirstOrNull == null ? (byte) -1 : bFirstOrNull.byteValue();
        return ModuleResult.INSTANCE.success(new CmdResponse(bByteValue, bArrSubArrayWithoutFirstElement.length > 1 ? ByteArrayKt.subArrayWithoutFirstElement(bArrSubArrayWithoutFirstElement) : null, bByteValue == -1 ? Intrinsics.stringPlus("解析错误，data: ", GattUtils.bytesToHexString(bArrSubArrayWithoutFirstElement)) : ""));
    }
}
