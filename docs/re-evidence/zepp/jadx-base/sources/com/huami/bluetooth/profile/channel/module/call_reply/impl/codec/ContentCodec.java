package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec;", "", "", "content", "", "encode", HTTP.CONTENT_RANGE_BYTES, "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec$Content;", "decode", "Content", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface ContentCodec {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/ContentCodec$Content;", "", "", "component1", "", "component2", "content", HTTP.CONTENT_RANGE_BYTES, "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "b", LogUtil.I, "getBytes", "()I", "<init>", "(Ljava/lang/String;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Content {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int bytes;

        public Content(@NotNull String str, int i) {
            this.content = str;
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
            return (this.content.hashCode() * 31) + this.bytes;
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
