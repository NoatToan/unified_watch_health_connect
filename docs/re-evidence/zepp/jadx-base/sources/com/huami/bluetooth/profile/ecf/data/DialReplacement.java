package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u001b\u001a\u00020\u00188F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/DialReplacement;", "", "", "component1", "component2", "component3", "src", "dest", "destSize", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getSrc", "()I", "b", "getDest", "c", "getDestSize", "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(III)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DialReplacement {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int src;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int dest;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int destSize;

    public DialReplacement(int i, int i2, int i3) {
        this.src = i;
        this.dest = i2;
        this.destSize = i3;
    }

    public static /* synthetic */ DialReplacement copy$default(DialReplacement dialReplacement, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = dialReplacement.src;
        }
        if ((i4 & 2) != 0) {
            i2 = dialReplacement.dest;
        }
        if ((i4 & 4) != 0) {
            i3 = dialReplacement.destSize;
        }
        return dialReplacement.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSrc() {
        return this.src;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDest() {
        return this.dest;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDestSize() {
        return this.destSize;
    }

    @NotNull
    public final DialReplacement copy(int src, int dest, int destSize) {
        return new DialReplacement(src, dest, destSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialReplacement)) {
            return false;
        }
        DialReplacement dialReplacement = (DialReplacement) other;
        return this.src == dialReplacement.src && this.dest == dialReplacement.dest && this.destSize == dialReplacement.destSize;
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(GattUtils.intToBytes(getSrc()));
        byteArrayOutputStream.write(GattUtils.intToBytes(getDest()));
        byteArrayOutputStream.write(GattUtils.intToBytes(getDestSize()));
        return byteArrayOutputStream.toByteArray();
    }

    public final int getDest() {
        return this.dest;
    }

    public final int getDestSize() {
        return this.destSize;
    }

    public final int getSrc() {
        return this.src;
    }

    public int hashCode() {
        return (((this.src * 31) + this.dest) * 31) + this.destSize;
    }

    @NotNull
    public String toString() {
        return "DialReplacement(src=" + this.src + ", dest=" + this.dest + ", destSize=" + this.destSize + ')';
    }
}
