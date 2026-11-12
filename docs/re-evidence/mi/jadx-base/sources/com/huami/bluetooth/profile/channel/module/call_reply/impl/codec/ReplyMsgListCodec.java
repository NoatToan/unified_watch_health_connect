package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import defpackage.c3;
import defpackage.u4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\rB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgListCodec;", "Lu4;", "", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "", "value", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "contentCodec", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ReplyMsgListCodec implements u4<List<? extends ReplyMsg>, byte[]> {

    @Deprecated
    public static final int COUNT_BYTE_LEN = 2;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int ID_BYTE_LEN = 4;

    @NotNull
    private final ContentCodec contentCodec;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgListCodec$Companion;", "", "()V", "COUNT_BYTE_LEN", "", "ID_BYTE_LEN", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyMsgListCodec() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.u4
    public /* bridge */ /* synthetic */ byte[] encode(List<? extends ReplyMsg> list) {
        return encode2((List<ReplyMsg>) list);
    }

    public ReplyMsgListCodec(@NotNull ContentCodec contentCodec) {
        Intrinsics.checkNotNullParameter(contentCodec, "contentCodec");
        this.contentCodec = contentCodec;
    }

    @Override // defpackage.u4
    @NotNull
    public List<ReplyMsg> decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int bytes = 2;
        if (value.length < 2) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        while (bytes < value.length && value.length - bytes >= 4) {
            int iA = c3.a(value, 4, bytes);
            ContentCodec.Content contentDecode = this.contentCodec.decode(ArraysKt___ArraysJvmKt.copyOfRange(value, bytes + 4, value.length));
            bytes += contentDecode.getBytes() + 4;
            arrayList.add(new ReplyMsg(iA, contentDecode.getContent()));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
    public byte[] encode2(@NotNull List<ReplyMsg> value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(c3.a(value.size(), 2));
        ReplyMsgCodec replyMsgCodec = new ReplyMsgCodec(this.contentCodec);
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(replyMsgCodec.encode((ReplyMsg) it.next()));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }

    public /* synthetic */ ReplyMsgListCodec(ContentCodec contentCodec, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ContentCodecImpl() : contentCodec);
    }
}
