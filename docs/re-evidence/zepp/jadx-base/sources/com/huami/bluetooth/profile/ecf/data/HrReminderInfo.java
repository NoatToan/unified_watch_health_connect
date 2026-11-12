package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\u00020\u00168\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;", "", "", "component1", "", "component2", "enable", "hrValue", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "getEnable", "()Z", "b", LogUtil.I, "getHrValue", "()I", "", "c", "[B", "getBytes$bluetooth_release", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(ZI)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HrReminderInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int hrValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final byte[] bytes;

    /* JADX WARN: Multi-variable type inference failed */
    public HrReminderInfo() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public HrReminderInfo(boolean z, int i) {
        this.enable = z;
        this.hrValue = i;
        this.bytes = new byte[]{ByteUtilsKt.toByte(z), (byte) i};
    }

    public static /* synthetic */ HrReminderInfo copy$default(HrReminderInfo hrReminderInfo, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = hrReminderInfo.enable;
        }
        if ((i2 & 2) != 0) {
            i = hrReminderInfo.hrValue;
        }
        return hrReminderInfo.copy(z, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHrValue() {
        return this.hrValue;
    }

    @NotNull
    public final HrReminderInfo copy(boolean enable, int hrValue) {
        return new HrReminderInfo(enable, hrValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrReminderInfo)) {
            return false;
        }
        HrReminderInfo hrReminderInfo = (HrReminderInfo) other;
        return this.enable == hrReminderInfo.enable && this.hrValue == hrReminderInfo.hrValue;
    }

    @NotNull
    /* JADX INFO: renamed from: getBytes$bluetooth_release, reason: from getter */
    public final byte[] getBytes() {
        return this.bytes;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getHrValue() {
        return this.hrValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.hrValue;
    }

    @NotNull
    public String toString() {
        return "HrReminderInfo(enable=" + this.enable + ", hrValue=" + this.hrValue + ')';
    }

    public /* synthetic */ HrReminderInfo(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }
}
