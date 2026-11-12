package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00148@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/EqUnit;", "", "", "component1", "component2", "frequency", "gain", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getFrequency", "()I", "b", "getGain", "", "getBytes$bluetooth_release", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EqUnit {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int frequency;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int gain;

    public EqUnit(int i, int i2) {
        this.frequency = i;
        this.gain = i2;
    }

    public static /* synthetic */ EqUnit copy$default(EqUnit eqUnit, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = eqUnit.frequency;
        }
        if ((i3 & 2) != 0) {
            i2 = eqUnit.gain;
        }
        return eqUnit.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGain() {
        return this.gain;
    }

    @NotNull
    public final EqUnit copy(int frequency, int gain) {
        return new EqUnit(frequency, gain);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EqUnit)) {
            return false;
        }
        EqUnit eqUnit = (EqUnit) other;
        return this.frequency == eqUnit.frequency && this.gain == eqUnit.gain;
    }

    @NotNull
    public final byte[] getBytes$bluetooth_release() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byteArray$default = ByteUtilsKt.toByteArray$default(getFrequency(), 0, 1, null);
        byteArrayOutputStream.write(byteArray$default, 0, byteArray$default.length);
        byteArrayOutputStream.write(getGain());
        return byteArrayOutputStream.toByteArray();
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final int getGain() {
        return this.gain;
    }

    public int hashCode() {
        return (this.frequency * 31) + this.gain;
    }

    @NotNull
    public String toString() {
        return "EqUnit(frequency=" + this.frequency + ", gain=" + this.gain + ')';
    }
}
