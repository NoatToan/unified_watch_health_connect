package com.huami.bluetooth.profile.channel.module.member_card.impl.codec;

import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.member_card.BarcodeType;
import com.huami.bluetooth.profile.channel.module.member_card.Version;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/codec/VersionCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "Lcom/huami/bluetooth/profile/channel/module/member_card/Version;", "", "value", "encode", "decode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class VersionCodec implements Codec<Version, byte[]> {
    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public Version decode(@NotNull byte[] value) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(value);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        byte b = byteBufferWrap.get();
        byte b2 = byteBufferWrap.get();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (b2 > 0) {
            int i2 = 0;
            do {
                i2++;
                BarcodeType code = BarcodeType.INSTANCE.parseCode(byteBufferWrap.get());
                if (code != null) {
                    arrayList.add(code);
                }
            } while (i2 < b2);
        }
        byte b3 = byteBufferWrap.get();
        ArrayList arrayList2 = new ArrayList();
        if (b3 > 0) {
            do {
                i++;
                arrayList2.add(Byte.valueOf(byteBufferWrap.get()));
            } while (i < b3);
        }
        return new Version(b, arrayList, CollectionsKt___CollectionsKt.toByteArray(arrayList2));
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull Version value) {
        throw new NotImplementedError("An operation is not implemented: 暂不编码");
    }
}
