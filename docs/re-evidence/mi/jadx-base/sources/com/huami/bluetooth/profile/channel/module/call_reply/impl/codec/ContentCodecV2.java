package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.c3;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodecV2;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "charset", "Ljava/nio/charset/Charset;", "(Ljava/nio/charset/Charset;)V", "decode", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec$Content;", "bytes", "", "encode", MiuiCursorConstants.CONTENT, "", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ContentCodecV2 implements ContentCodec {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int LENGTH_BYTE_LEN = 2;

    @NotNull
    private final Charset charset;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodecV2$Companion;", "", "()V", "LENGTH_BYTE_LEN", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ContentCodecV2(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.charset = charset;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ContentCodec
    @NotNull
    public ContentCodec.Content decode(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.length < 2) {
            return new ContentCodec.Content("", bytes.length);
        }
        int iA = c3.a(bytes, 2, 0, 2, null);
        if (iA == 0) {
            return new ContentCodec.Content("", 2);
        }
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bytes, 2, Math.min(iA + 2, bytes.length));
        return new ContentCodec.Content(new String(bArrCopyOfRange, this.charset), bArrCopyOfRange.length + 2);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000f  */
    @Override // com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ContentCodec
    @NotNull
    public byte[] encode(@Nullable String content) {
        byte[] bytes;
        if (content != null) {
            bytes = content.getBytes(this.charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            if (bytes == null) {
                bytes = new byte[0];
            }
        } else {
            bytes = new byte[0];
        }
        return ArraysKt___ArraysJvmKt.plus(c3.a(bytes.length, 2), bytes);
    }
}
