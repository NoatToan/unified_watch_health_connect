package com.huami.bluetooth.profile.channel.module.settings.primarydata;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b&\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntPrimaryData;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData;", "", "checkValid", "", "a", LogUtil.I, "getValue", "()I", "setValue", "(I)V", "value", "b", "Ljava/lang/Integer;", "getMin", "()Ljava/lang/Integer;", "setMin", "(Ljava/lang/Integer;)V", "min", "c", "getMax", "setMax", "max", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class IntPrimaryData implements IPrimaryData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Integer min;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Integer max;

    public IntPrimaryData(int i, @Nullable Integer num, @Nullable Integer num2) {
        this.value = i;
        this.min = num;
        this.max = num2;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean checkValid() {
        Integer min = getMin();
        Integer max = getMax();
        if (!getContainDesc()) {
            return true;
        }
        if (min != null && max != null) {
            int value = getValue();
            if (min.intValue() <= value && value <= max.intValue()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Integer getMax() {
        return this.max;
    }

    @Nullable
    public Integer getMin() {
        return this.min;
    }

    public int getValue() {
        return this.value;
    }

    public void setMax(@Nullable Integer num) {
        this.max = num;
    }

    public void setMin(@Nullable Integer num) {
        this.min = num;
    }

    public void setValue(int i) {
        this.value = i;
    }

    public /* synthetic */ IntPrimaryData(int i, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2);
    }
}
