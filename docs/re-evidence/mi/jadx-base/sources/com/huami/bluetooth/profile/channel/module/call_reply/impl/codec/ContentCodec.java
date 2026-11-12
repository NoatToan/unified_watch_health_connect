package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "", "decode", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec$Content;", "bytes", "", "encode", MiuiCursorConstants.CONTENT, "", "Content", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ContentCodec {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec$Content;", "", MiuiCursorConstants.CONTENT, "", "bytes", "", "(Ljava/lang/String;I)V", "getBytes", "()I", "getContent", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Content {
        private final int bytes;

        @NotNull
        private final String content;

        public Content(@NotNull String content, int i) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.bytes = i;
        }

        public static /* synthetic */ Content copy$default(Content content, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = content.content;
            }
            if ((i2 & 2) != 0) {
                i = content.bytes;
            }
            return content.copy(str, i);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getBytes() {
            return this.bytes;
        }

        @NotNull
        public final Content copy(@NotNull String content, int bytes) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Content(content, bytes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.content, content.content) && this.bytes == content.bytes;
        }

        public final int getBytes() {
            return this.bytes;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public int hashCode() {
            return (this.content.hashCode() * 31) + Integer.hashCode(this.bytes);
        }

        @NotNull
        public String toString() {
            return "Content(content=" + this.content + ", bytes=" + this.bytes + ')';
        }
    }

    @NotNull
    Content decode(@NotNull byte[] bytes);

    @NotNull
    byte[] encode(@Nullable String content);
}
