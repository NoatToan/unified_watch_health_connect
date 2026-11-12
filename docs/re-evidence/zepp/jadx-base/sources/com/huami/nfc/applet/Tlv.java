package com.huami.nfc.applet;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/huami/nfc/applet/Tlv;", "", "", "component1", "", "component2", "component3", "tag", SessionDescription.p, "value", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "b", LogUtil.I, "getLength", "()I", "c", "getValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Tlv {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int length;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String value;

    public Tlv(@NotNull String str, int i, @NotNull String str2) {
        this.tag = str;
        this.length = i;
        this.value = str2;
    }

    public static /* synthetic */ Tlv copy$default(Tlv tlv, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tlv.tag;
        }
        if ((i2 & 2) != 0) {
            i = tlv.length;
        }
        if ((i2 & 4) != 0) {
            str2 = tlv.value;
        }
        return tlv.copy(str, i, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final Tlv copy(@NotNull String tag, int length, @NotNull String value) {
        return new Tlv(tag, length, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tlv)) {
            return false;
        }
        Tlv tlv = (Tlv) other;
        return Intrinsics.areEqual(this.tag, tlv.tag) && this.length == tlv.length && Intrinsics.areEqual(this.value, tlv.value);
    }

    public final int getLength() {
        return this.length;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.tag.hashCode() * 31) + this.length) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "Tlv(tag=" + this.tag + ", length=" + this.length + ", value=" + this.value + ')';
    }
}
