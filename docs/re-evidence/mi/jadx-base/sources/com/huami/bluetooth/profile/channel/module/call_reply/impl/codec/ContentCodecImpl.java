package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.ql;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodecImpl;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "()V", "decode", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec$Content;", "bytes", "", "encode", MiuiCursorConstants.CONTENT, "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ContentCodecImpl implements ContentCodec {
    @Override // com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ContentCodec
    @NotNull
    public ContentCodec.Content decode(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.length == 0) {
            return new ContentCodec.Content("", 0);
        }
        int iA = ql.a(bytes, 0);
        if (iA >= 0) {
            bytes = Arrays.copyOf(bytes, iA);
            Intrinsics.checkNotNullExpressionValue(bytes, "copyOf(this, newSize)");
        }
        return new ContentCodec.Content(new String(bytes, Charsets.UTF_8), bytes.length + 1);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    @Override // com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ContentCodec
    @NotNull
    public byte[] encode(@Nullable String content) {
        byte[] bytes;
        if (content != null) {
            bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            if (bytes == null) {
                bytes = new byte[0];
            }
        } else {
            bytes = new byte[0];
        }
        return ArraysKt___ArraysJvmKt.plus(bytes, (byte) 0);
    }
}
