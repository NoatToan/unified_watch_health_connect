package com.huami.bluetooth.profile.ecf.data;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0013\u001a\u00020\u00108F@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/LiftWristTouch;", "", "", "component1", "enable", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getEnable", "()Z", "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(Z)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LiftWristTouch {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean enable;

    public LiftWristTouch(boolean z) {
        this.enable = z;
    }

    public static /* synthetic */ LiftWristTouch copy$default(LiftWristTouch liftWristTouch, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = liftWristTouch.enable;
        }
        return liftWristTouch.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final LiftWristTouch copy(boolean enable) {
        return new LiftWristTouch(enable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LiftWristTouch) && this.enable == ((LiftWristTouch) other).enable;
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        if (getEnable()) {
            byteArrayOutputStream.write(1);
        } else {
            byteArrayOutputStream.write(0);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public int hashCode() {
        boolean z = this.enable;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public String toString() {
        return "LiftWristTouch(enable=" + this.enable + ')';
    }
}
