package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import defpackage.c3;
import defpackage.oo;
import defpackage.u4;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgCodec;", "Lu4;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "", "value", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "contentCodec", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ReplyMsgCodec implements u4<ReplyMsg, byte[]> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int ID_BYTE_LEN = 4;

    @NotNull
    private final ContentCodec contentCodec;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgCodec$Companion;", "", "()V", "ID_BYTE_LEN", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyMsgCodec() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ReplyMsgCodec(@NotNull ContentCodec contentCodec) {
        Intrinsics.checkNotNullParameter(contentCodec, "contentCodec");
        this.contentCodec = contentCodec;
    }

    @Override // defpackage.u4
    @NotNull
    public ReplyMsg decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length < 4) {
            throw new oo(null, 1, null);
        }
        return new ReplyMsg(c3.a(value, 4, 0, 2, null), this.contentCodec.decode(ArraysKt___ArraysJvmKt.copyOfRange(value, 4, value.length)).getContent());
    }

    @Override // defpackage.u4
    @NotNull
    public byte[] encode(@NotNull ReplyMsg value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[0], c3.a(value.getId(), 4)), this.contentCodec.encode(value.getContent()));
    }

    public /* synthetic */ ReplyMsgCodec(ContentCodec contentCodec, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ContentCodecImpl() : contentCodec);
    }
}
