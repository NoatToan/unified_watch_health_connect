package com.huami.bluetooth.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/utils/ByteString;", "", "", "component1", "", "component2", "str", HTTP.CONTENT_RANGE_BYTES, "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getStr", "()Ljava/lang/String;", "b", LogUtil.I, "getBytes", "()I", "<init>", "(Ljava/lang/String;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ByteString {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String str;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int bytes;

    public ByteString(@NotNull String str, int i) {
        this.str = str;
        this.bytes = i;
    }

    public static /* synthetic */ ByteString copy$default(ByteString byteString, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = byteString.str;
        }
        if ((i2 & 2) != 0) {
            i = byteString.bytes;
        }
        return byteString.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStr() {
        return this.str;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBytes() {
        return this.bytes;
    }

    @NotNull
    public final ByteString copy(@NotNull String str, int bytes) {
        return new ByteString(str, bytes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) other;
        return Intrinsics.areEqual(this.str, byteString.str) && this.bytes == byteString.bytes;
    }

    public final int getBytes() {
        return this.bytes;
    }

    @NotNull
    public final String getStr() {
        return this.str;
    }

    public int hashCode() {
        return (this.str.hashCode() * 31) + this.bytes;
    }

    @NotNull
    public String toString() {
        return "ByteString(str=" + this.str + ", bytes=" + this.bytes + ')';
    }
}
