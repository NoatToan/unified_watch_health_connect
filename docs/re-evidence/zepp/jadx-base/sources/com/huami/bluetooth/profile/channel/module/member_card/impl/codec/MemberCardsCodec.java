package com.huami.bluetooth.profile.channel.module.member_card.impl.codec;

import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/impl/codec/MemberCardsCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "", "value", "encode", "decode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MemberCardsCodec implements Codec<List<? extends MemberCard>, byte[]> {
    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    public /* bridge */ /* synthetic */ byte[] encode(List<? extends MemberCard> list) {
        return encode2((List<MemberCard>) list);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public List<MemberCard> decode(@NotNull byte[] value) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(value).order(ByteOrder.LITTLE_ENDIAN);
        byte b = byteBufferOrder.get();
        ArrayList arrayList = new ArrayList();
        if (b > 0) {
            int i = 0;
            do {
                i++;
                arrayList.add(MemberCard.INSTANCE.toMemberCard(byteBufferOrder));
            } while (i < b);
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
    public byte[] encode2(@NotNull List<MemberCard> value) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
