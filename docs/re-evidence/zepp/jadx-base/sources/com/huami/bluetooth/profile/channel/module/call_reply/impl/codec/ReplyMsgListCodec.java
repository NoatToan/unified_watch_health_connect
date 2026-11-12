package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgListCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "", "value", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "a", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "contentCodec", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;)V", "b", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ReplyMsgListCodec implements Codec<List<? extends ReplyMsg>, byte[]> {

    @Deprecated
    public static final int COUNT_BYTE_LEN = 2;

    @Deprecated
    public static final int ID_BYTE_LEN = 4;

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ContentCodec contentCodec;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"com/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ReplyMsgListCodec$a", "", "", "COUNT_BYTE_LEN", LogUtil.I, "ID_BYTE_LEN", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyMsgListCodec() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ReplyMsgListCodec(@NotNull ContentCodec contentCodec) {
        this.contentCodec = contentCodec;
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    public /* bridge */ /* synthetic */ byte[] encode(List<? extends ReplyMsg> list) {
        return encode2((List<ReplyMsg>) list);
    }

    public /* synthetic */ ReplyMsgListCodec(ContentCodec contentCodec, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ContentCodecImpl() : contentCodec);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public List<ReplyMsg> decode(@NotNull byte[] value) {
        int bytes = 2;
        if (value.length < 2) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        while (bytes < value.length && value.length - bytes >= 4) {
            int i = ByteUtilsKt.toInt(value, 4, bytes);
            ContentCodec.Content contentDecode = this.contentCodec.decode(ArraysKt___ArraysJvmKt.copyOfRange(value, bytes + 4, value.length));
            bytes += contentDecode.getBytes() + 4;
            arrayList.add(new ReplyMsg(i, contentDecode.getContent()));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
    public byte[] encode2(@NotNull List<ReplyMsg> value) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(ByteUtilsKt.toByteArray(value.size(), 2));
        ReplyMsgCodec replyMsgCodec = new ReplyMsgCodec(this.contentCodec);
        Iterator<T> it2 = value.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(replyMsgCodec.encode((ReplyMsg) it2.next()));
        }
        return byteArrayOutputStream.toByteArray();
    }
}
