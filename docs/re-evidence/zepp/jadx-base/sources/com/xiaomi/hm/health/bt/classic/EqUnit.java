package com.xiaomi.hm.health.bt.classic;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/bt/classic/EqUnit;", "", "", "toString", "", "component1", "", "component2", "frequency", "gain", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getFrequency", "()I", "setFrequency", "(I)V", "b", "B", "getGain", "()B", "setGain", "(B)V", "<init>", "(IB)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EqUnit {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int frequency;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private byte gain;

    public EqUnit(int i, byte b) {
        this.frequency = i;
        this.gain = b;
    }

    public static /* synthetic */ EqUnit copy$default(EqUnit eqUnit, int i, byte b, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eqUnit.frequency;
        }
        if ((i2 & 2) != 0) {
            b = eqUnit.gain;
        }
        return eqUnit.copy(i, b);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getGain() {
        return this.gain;
    }

    @NotNull
    public final EqUnit copy(int frequency, byte gain) {
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

    public final int getFrequency() {
        return this.frequency;
    }

    public final byte getGain() {
        return this.gain;
    }

    public int hashCode() {
        return (this.frequency * 31) + this.gain;
    }

    public final void setFrequency(int i) {
        this.frequency = i;
    }

    public final void setGain(byte b) {
        this.gain = b;
    }

    @NotNull
    public String toString() {
        return "frequency: " + this.frequency + ", gain: " + ((Object) GattUtils.bytesToHexString(new byte[]{this.gain}));
    }
}
