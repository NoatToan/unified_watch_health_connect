package com.huami.bluetooth.profile.ecf.data;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0017\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/Touchscreen;", "", "", "component1", "component2", "enable", "enableWorkout", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getEnable", "()Z", "b", "getEnableWorkout", "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(ZZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Touchscreen {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean enableWorkout;

    public Touchscreen(boolean z, boolean z2) {
        this.enable = z;
        this.enableWorkout = z2;
    }

    public static /* synthetic */ Touchscreen copy$default(Touchscreen touchscreen, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = touchscreen.enable;
        }
        if ((i & 2) != 0) {
            z2 = touchscreen.enableWorkout;
        }
        return touchscreen.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnableWorkout() {
        return this.enableWorkout;
    }

    @NotNull
    public final Touchscreen copy(boolean enable, boolean enableWorkout) {
        return new Touchscreen(enable, enableWorkout);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Touchscreen)) {
            return false;
        }
        Touchscreen touchscreen = (Touchscreen) other;
        return this.enable == touchscreen.enable && this.enableWorkout == touchscreen.enableWorkout;
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        if (!getEnable()) {
            byteArrayOutputStream.write(0);
        } else if (getEnableWorkout()) {
            byteArrayOutputStream.write(3);
        } else {
            byteArrayOutputStream.write(1);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getEnableWorkout() {
        return this.enableWorkout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.enableWorkout;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "Touchscreen(enable=" + this.enable + ", enableWorkout=" + this.enableWorkout + ')';
    }
}
