package com.huami.bluetooth.profile.channel.module.settings.primarydata;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import defpackage.oj;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001+B1\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b(\u0010)B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\t\u0010\r\u001a\u00020\fHÆ\u0003J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\"R$\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\"R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "Loj;", "Ljava/io/Serializable;", "Ljava/io/ByteArrayOutputStream;", "bos", "", "write", "", "component1", "component2", "()Ljava/lang/Integer;", "component3", "", "component4", "value", "min", VibrateModeSetFragment.MAX, "containDesc", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Z)Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "", "toString", "hashCode", "", "other", "equals", "I", "getValue", "()I", "setValue", "(I)V", "Ljava/lang/Integer;", "getMin", "setMin", "(Ljava/lang/Integer;)V", "getMax", "setMax", "Z", "getContainDesc", "()Z", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Z)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class IntData extends oj implements Serializable {
    private static final long serialVersionUID = 1;
    private final boolean containDesc;

    @Nullable
    private Integer max;

    @Nullable
    private Integer min;
    private int value;

    public /* synthetic */ IntData(int i, Integer num, Integer num2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? false : z);
    }

    public static /* synthetic */ IntData copy$default(IntData intData, int i, Integer num, Integer num2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = intData.getValue();
        }
        if ((i2 & 2) != 0) {
            num = intData.getMin();
        }
        if ((i2 & 4) != 0) {
            num2 = intData.getMax();
        }
        if ((i2 & 8) != 0) {
            z = intData.getContainDesc();
        }
        return intData.copy(i, num, num2, z);
    }

    public final int component1() {
        return getValue();
    }

    @Nullable
    public final Integer component2() {
        return getMin();
    }

    @Nullable
    public final Integer component3() {
        return getMax();
    }

    public final boolean component4() {
        return getContainDesc();
    }

    @NotNull
    public final IntData copy(int value, @Nullable Integer min, @Nullable Integer max, boolean containDesc) {
        return new IntData(value, min, max, containDesc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntData)) {
            return false;
        }
        IntData intData = (IntData) other;
        return getValue() == intData.getValue() && Intrinsics.areEqual(getMin(), intData.getMin()) && Intrinsics.areEqual(getMax(), intData.getMax()) && getContainDesc() == intData.getContainDesc();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean getContainDesc() {
        return this.containDesc;
    }

    @Override // defpackage.oj
    @Nullable
    public Integer getMax() {
        return this.max;
    }

    @Override // defpackage.oj
    @Nullable
    public Integer getMin() {
        return this.min;
    }

    @Override // defpackage.oj
    public int getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(getValue()) * 31) + (getMin() == null ? 0 : getMin().hashCode())) * 31) + (getMax() != null ? getMax().hashCode() : 0)) * 31;
        boolean containDesc = getContainDesc();
        ?? r1 = containDesc;
        if (containDesc) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @Override // defpackage.oj
    public void setMax(@Nullable Integer num) {
        this.max = num;
    }

    @Override // defpackage.oj
    public void setMin(@Nullable Integer num) {
        this.min = num;
    }

    @Override // defpackage.oj
    public void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "IntData(value=" + getValue() + ", min=" + getMin() + ", max=" + getMax() + ", containDesc=" + getContainDesc() + ')';
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public void write(@NotNull ByteArrayOutputStream bos) throws IOException {
        Intrinsics.checkNotNullParameter(bos, "bos");
        bos.write(1);
        bos.write(tet.s((short) getValue()));
    }

    public IntData(int i, @Nullable Integer num, @Nullable Integer num2, boolean z) {
        super(i, null, null, 6, null);
        this.value = i;
        this.min = num;
        this.max = num2;
        this.containDesc = z;
    }

    public IntData(int i) {
        this(i, null, null, false);
    }
}
