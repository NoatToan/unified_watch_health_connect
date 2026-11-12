package com.huami.bluetooth.profile.channel.module.call_reply;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/Version;", "", "", "component1", "component2", "component3", "v", "maxReplyMsgCount", "encode", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getV", "()I", "b", "getMaxReplyMsgCount", "c", "getEncode", "<init>", "(III)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Version {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int v;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int maxReplyMsgCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int encode;

    public Version(int i, int i2, int i3) {
        this.v = i;
        this.maxReplyMsgCount = i2;
        this.encode = i3;
    }

    public static /* synthetic */ Version copy$default(Version version, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = version.v;
        }
        if ((i4 & 2) != 0) {
            i2 = version.maxReplyMsgCount;
        }
        if ((i4 & 4) != 0) {
            i3 = version.encode;
        }
        return version.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getV() {
        return this.v;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxReplyMsgCount() {
        return this.maxReplyMsgCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEncode() {
        return this.encode;
    }

    @NotNull
    public final Version copy(int v, int maxReplyMsgCount, int encode) {
        return new Version(v, maxReplyMsgCount, encode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Version)) {
            return false;
        }
        Version version = (Version) other;
        return this.v == version.v && this.maxReplyMsgCount == version.maxReplyMsgCount && this.encode == version.encode;
    }

    public final int getEncode() {
        return this.encode;
    }

    public final int getMaxReplyMsgCount() {
        return this.maxReplyMsgCount;
    }

    public final int getV() {
        return this.v;
    }

    public int hashCode() {
        return (((this.v * 31) + this.maxReplyMsgCount) * 31) + this.encode;
    }

    @NotNull
    public String toString() {
        return "Version(v=" + this.v + ", maxReplyMsgCount=" + this.maxReplyMsgCount + ", encode=" + this.encode + ')';
    }

    public /* synthetic */ Version(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
