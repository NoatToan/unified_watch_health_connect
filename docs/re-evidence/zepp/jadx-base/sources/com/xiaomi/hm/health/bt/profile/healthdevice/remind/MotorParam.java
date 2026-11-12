package com.xiaomi.hm.health.bt.profile.healthdevice.remind;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\bHÆ\u0003J\t\u0010\f\u001a\u00020\bHÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003JY\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\bHÆ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u0011\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0012\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\u0013\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u0019\u0010\u0014\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u0019\u0010\u0015\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/MotorParam;", "", "", "toString", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "component7", "component8", "vibrationMode", "count", "totalCount", "activeInterval", "inactiveInterval", "delay", "genericFlag", "remindTypeFlag", "copy", "hashCode", "other", "", "equals", "a", "B", "getVibrationMode", "()B", "b", "getCount", "c", "getTotalCount", GoogleApiAvailabilityLight.a, LogUtil.I, "getActiveInterval", "()I", "e", "getInactiveInterval", "f", "getDelay", "g", "getGenericFlag", "h", "getRemindTypeFlag", "<init>", "(BBBIIIII)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MotorParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final byte vibrationMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final byte count;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final byte totalCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int activeInterval;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int inactiveInterval;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int delay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int genericFlag;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int remindTypeFlag;

    public MotorParam(byte b, byte b2, byte b3, int i, int i2, int i3, int i4, int i5) {
        this.vibrationMode = b;
        this.count = b2;
        this.totalCount = b3;
        this.activeInterval = i;
        this.inactiveInterval = i2;
        this.delay = i3;
        this.genericFlag = i4;
        this.remindTypeFlag = i5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte getVibrationMode() {
        return this.vibrationMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte getTotalCount() {
        return this.totalCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getActiveInterval() {
        return this.activeInterval;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getInactiveInterval() {
        return this.inactiveInterval;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getGenericFlag() {
        return this.genericFlag;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getRemindTypeFlag() {
        return this.remindTypeFlag;
    }

    @NotNull
    public final MotorParam copy(byte vibrationMode, byte count, byte totalCount, int activeInterval, int inactiveInterval, int delay, int genericFlag, int remindTypeFlag) {
        return new MotorParam(vibrationMode, count, totalCount, activeInterval, inactiveInterval, delay, genericFlag, remindTypeFlag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MotorParam)) {
            return false;
        }
        MotorParam motorParam = (MotorParam) other;
        return this.vibrationMode == motorParam.vibrationMode && this.count == motorParam.count && this.totalCount == motorParam.totalCount && this.activeInterval == motorParam.activeInterval && this.inactiveInterval == motorParam.inactiveInterval && this.delay == motorParam.delay && this.genericFlag == motorParam.genericFlag && this.remindTypeFlag == motorParam.remindTypeFlag;
    }

    public final int getActiveInterval() {
        return this.activeInterval;
    }

    public final byte getCount() {
        return this.count;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getGenericFlag() {
        return this.genericFlag;
    }

    public final int getInactiveInterval() {
        return this.inactiveInterval;
    }

    public final int getRemindTypeFlag() {
        return this.remindTypeFlag;
    }

    public final byte getTotalCount() {
        return this.totalCount;
    }

    public final byte getVibrationMode() {
        return this.vibrationMode;
    }

    public int hashCode() {
        return (((((((((((((this.vibrationMode * 31) + this.count) * 31) + this.totalCount) * 31) + this.activeInterval) * 31) + this.inactiveInterval) * 31) + this.delay) * 31) + this.genericFlag) * 31) + this.remindTypeFlag;
    }

    @NotNull
    public String toString() {
        return "MotorParam[vibrationMode: " + ((int) this.vibrationMode) + ", count: " + ((int) this.count) + ", totalCount: " + ((int) this.totalCount) + ", activeInterval: " + this.activeInterval + ", inactiveInterval: " + this.inactiveInterval + ", delay: " + this.delay + ", genericFlag: " + this.genericFlag + ", remindTypeFlag: " + this.remindTypeFlag + JsonLexerKt.END_LIST;
    }
}
