package com.xiaomi.fitness.device.manager.export.scan.beacon;

import com.xiaomi.fitness.common.utils.ByteUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/scan/beacon/BeaconItem;", "", "<init>", "()V", "len", "", "getLen", "()I", "setLen", "(I)V", "type", "getType", "setType", "bytes", "", "getBytes", "()[B", "setBytes", "([B)V", "toString", "", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BeaconItem {
    public byte[] bytes;
    private int len;
    private int type;

    @NotNull
    public final byte[] getBytes() {
        byte[] bArr = this.bytes;
        if (bArr != null) {
            return bArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bytes");
        return null;
    }

    public final int getLen() {
        return this.len;
    }

    public final int getType() {
        return this.type;
    }

    public final void setBytes(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.bytes = bArr;
    }

    public final void setLen(int i) {
        this.len = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@Len = " + this.len + ", @Type = " + this.type);
        sb.append(" -> ");
        StringBuilder sb2 = new StringBuilder();
        try {
            for (byte b2 : getBytes()) {
                sb2.append(String.valueOf(b2 & 255));
            }
            sb.append(sb2.toString());
        } catch (Exception unused) {
            sb.append(ByteUtil.byteToString(getBytes()));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
