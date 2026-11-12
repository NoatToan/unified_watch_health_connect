package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import com.huami.bluetooth.profile.channel.module.ex.ParseException;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u0011\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "", "value", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "a", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "contentCodec", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;)V", "b", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ReplyMsgCodec implements Codec<ReplyMsg, byte[]> {

    @Deprecated
    public static final int ID_BYTE_LEN = 4;

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ContentCodec contentCodec;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgCodec$a", "", "", "ID_BYTE_LEN", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyMsgCodec() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ReplyMsgCodec(@NotNull ContentCodec contentCodec) {
        this.contentCodec = contentCodec;
    }

    public /* synthetic */ ReplyMsgCodec(ContentCodec contentCodec, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ContentCodecImpl() : contentCodec);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public ReplyMsg decode(@NotNull byte[] value) {
        if (value.length < 4) {
            throw new ParseException(null, 1, null);
        }
        return new ReplyMsg(ByteUtilsKt.toInt$default(value, 4, 0, 2, null), this.contentCodec.decode(ArraysKt___ArraysJvmKt.copyOfRange(value, 4, value.length)).getContent());
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull ReplyMsg value) {
        return ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[0], ByteUtilsKt.toByteArray(value.getId(), 4)), this.contentCodec.encode(value.getContent()));
    }
}
