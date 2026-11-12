package com.huami.bluetooth.profile.channel.module.hearing.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/DSPTestParam;", "", "", "component1", "earphonePosition", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getEarphonePosition", "()I", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DSPTestParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int earphonePosition;

    public DSPTestParam(int i) {
        this.earphonePosition = i;
    }

    public static /* synthetic */ DSPTestParam copy$default(DSPTestParam dSPTestParam, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dSPTestParam.earphonePosition;
        }
        return dSPTestParam.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEarphonePosition() {
        return this.earphonePosition;
    }

    @NotNull
    public final DSPTestParam copy(int earphonePosition) {
        return new DSPTestParam(earphonePosition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DSPTestParam) && this.earphonePosition == ((DSPTestParam) other).earphonePosition;
    }

    public final int getEarphonePosition() {
        return this.earphonePosition;
    }

    public int hashCode() {
        return this.earphonePosition;
    }

    @NotNull
    public String toString() {
        return "DSPTestParam(earphonePosition=" + this.earphonePosition + ')';
    }
}
