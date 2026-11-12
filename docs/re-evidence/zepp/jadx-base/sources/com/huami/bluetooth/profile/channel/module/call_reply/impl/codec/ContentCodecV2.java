package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodecV2;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "", "content", "", "encode", HTTP.CONTENT_RANGE_BYTES, "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec$Content;", "decode", "Ljava/nio/charset/Charset;", "a", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "b", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ContentCodecV2 implements ContentCodec {

    @Deprecated
    public static final int LENGTH_BYTE_LEN = 2;

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Charset charset;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodecV2$a", "", "", "LENGTH_BYTE_LEN", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ContentCodecV2(@NotNull Charset charset) {
        this.charset = charset;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ContentCodec
    @NotNull
    public ContentCodec.Content decode(@NotNull byte[] bytes) {
        if (bytes.length < 2) {
            return new ContentCodec.Content("", bytes.length);
        }
        int int$default = ByteUtilsKt.toInt$default(bytes, 2, 0, 2, null);
        if (int$default == 0) {
            return new ContentCodec.Content("", 2);
        }
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bytes, 2, Math.min(int$default + 2, bytes.length));
        return new ContentCodec.Content(new String(bArrCopyOfRange, this.charset), bArrCopyOfRange.length + 2);
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ContentCodec
    @NotNull
    public byte[] encode(@Nullable String content) {
        byte[] bytes = content == null ? null : content.getBytes(this.charset);
        if (bytes == null) {
            bytes = new byte[0];
        }
        return ArraysKt___ArraysJvmKt.plus(ByteUtilsKt.toByteArray(bytes.length, 2), bytes);
    }
}
