package com.xiaomi.hm.health.bt.profile.beep;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/beep/BeepItem;", "", "", "toString", "", "component1", "", "component2", "type", "switchState", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getType", "()I", "setType", "(I)V", "b", "B", "getSwitchState", "()B", "setSwitchState", "(B)V", "<init>", "(IB)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BeepItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private byte switchState;

    public BeepItem(int i, byte b) {
        this.type = i;
        this.switchState = b;
    }

    public static /* synthetic */ BeepItem copy$default(BeepItem beepItem, int i, byte b, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = beepItem.type;
        }
        if ((i2 & 2) != 0) {
            b = beepItem.switchState;
        }
        return beepItem.copy(i, b);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getSwitchState() {
        return this.switchState;
    }

    @NotNull
    public final BeepItem copy(int type, byte switchState) {
        return new BeepItem(type, switchState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeepItem)) {
            return false;
        }
        BeepItem beepItem = (BeepItem) other;
        return this.type == beepItem.type && this.switchState == beepItem.switchState;
    }

    public final byte getSwitchState() {
        return this.switchState;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type * 31) + this.switchState;
    }

    public final void setSwitchState(byte b) {
        this.switchState = b;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "BeepItem{bit= " + this.type + ", switchState=" + ((int) this.switchState) + '}';
    }
}
