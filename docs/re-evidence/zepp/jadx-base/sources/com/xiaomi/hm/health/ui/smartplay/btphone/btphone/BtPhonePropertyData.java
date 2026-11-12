package com.xiaomi.hm.health.ui.smartplay.btphone.btphone;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/btphone/BtPhonePropertyData;", "", "", "needDelayTime", "", "toString", "", "enable", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "delayEnable", "getDelayEnable", "setDelayEnable", "delayTime", LogUtil.I, "getDelayTime", "()I", "setDelayTime", "(I)V", "<init>", "(ZZI)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhonePropertyData {
    public static final int DEFAULT_SHOW_TIME = 3;
    public static final int NO_DELAY_TIME = 0;
    private boolean delayEnable;
    private int delayTime;
    private boolean enable;

    public BtPhonePropertyData() {
        this(false, false, 0, 7, null);
    }

    public BtPhonePropertyData(boolean z, boolean z2, int i) {
        this.enable = z;
        this.delayEnable = z2;
        this.delayTime = i;
    }

    public final boolean getDelayEnable() {
        return this.delayEnable;
    }

    public final int getDelayTime() {
        return this.delayTime;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int needDelayTime() {
        if (this.delayEnable) {
            return this.delayTime;
        }
        return 0;
    }

    public final void setDelayEnable(boolean z) {
        this.delayEnable = z;
    }

    public final void setDelayTime(int i) {
        this.delayTime = i;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    @NotNull
    public String toString() {
        return "BtPhonePropertyData(enable=" + this.enable + ", delayEnable=" + this.delayEnable + ", delayTime=" + this.delayTime + ")";
    }

    public /* synthetic */ BtPhonePropertyData(boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 3 : i);
    }
}
