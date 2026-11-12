package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.huami.bluetooth.profile.channel.module.ModuleUtilsKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.text.Charsets;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodecImpl;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "", "content", "", "encode", HTTP.CONTENT_RANGE_BYTES, "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec$Content;", "decode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ContentCodecImpl implements ContentCodec {
    @Override // com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ContentCodec
    @NotNull
    public ContentCodec.Content decode(@NotNull byte[] bytes) {
        if (bytes.length == 0) {
            return new ContentCodec.Content("", 0);
        }
        int iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(bytes, 0);
        if (iFindStringEndFlag >= 0) {
            bytes = Arrays.copyOf(bytes, iFindStringEndFlag);
        }
        return new ContentCodec.Content(new String(bytes, Charsets.UTF_8), bytes.length + 1);
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.impl.codec.ContentCodec
    @NotNull
    public byte[] encode(@Nullable String content) {
        byte[] bytes = content == null ? null : content.getBytes(Charsets.UTF_8);
        if (bytes == null) {
            bytes = new byte[0];
        }
        return ArraysKt___ArraysJvmKt.plus(bytes, (byte) 0);
    }
}
