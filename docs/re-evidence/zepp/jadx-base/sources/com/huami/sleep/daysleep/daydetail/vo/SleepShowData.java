package com.huami.sleep.daysleep.daydetail.vo;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\ba\b\u0086\b\u0018\u00002\u00020\u0001B×\u0001\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0019\u0012\b\b\u0002\u0010/\u001a\u00020\u0019¢\u0006\u0004\bx\u0010yJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0019HÆ\u0003JÙ\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u00192\b\b\u0002\u0010/\u001a\u00020\u0019HÆ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001J\t\u00102\u001a\u00020\u0002HÖ\u0001J\u0013\u00104\u001a\u00020\u00192\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00106\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00106\u001a\u0004\bB\u00108\"\u0004\bC\u0010:R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00106\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00106\u001a\u0004\bH\u00108\"\u0004\bI\u0010:R$\u0010\"\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010#\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR$\u0010$\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010K\u001a\u0004\bT\u0010M\"\u0004\bU\u0010OR$\u0010%\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010K\u001a\u0004\bW\u0010M\"\u0004\bX\u0010OR\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u00106\u001a\u0004\bZ\u00108\"\u0004\b[\u0010:R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u00106\u001a\u0004\b]\u00108\"\u0004\b^\u0010:R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u00106\u001a\u0004\b`\u00108\"\u0004\ba\u0010:R\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u00106\u001a\u0004\bc\u00108\"\u0004\bd\u0010:R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u00106\u001a\u0004\bf\u00108\"\u0004\bg\u0010:R\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u00106\u001a\u0004\bi\u00108\"\u0004\bj\u0010:R\"\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u00106\u001a\u0004\bl\u00108\"\u0004\bm\u0010:R\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u00106\u001a\u0004\bo\u00108\"\u0004\bp\u0010:R\"\u0010.\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\b.\u0010s\"\u0004\bt\u0010uR\"\u0010/\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010r\u001a\u0004\b/\u0010s\"\u0004\bw\u0010u¨\u0006z"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/vo/SleepShowData;", "", "", "getDuration", "getDeepDuration", "getLightDuration", "component1", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "", "component19", "component20", "durationHour", "durationMin", "deepDurationHour", "deepDurationMin", "lightDurationHour", "lightDurationMin", "time", "timeReg", "awakeTime", "awakeTimeReg", "awakeDuration", "awakeNum", "sleepFeeling", "intoSleepTime", "lazyBedTime", "turnOverTime", "dreamTime", "sleepScore", "isEmpty", "isRemSupported", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getDurationHour", "()I", "setDurationHour", "(I)V", "b", "getDurationMin", "setDurationMin", "c", "getDeepDurationHour", "setDeepDurationHour", GoogleApiAvailabilityLight.a, "getDeepDurationMin", "setDeepDurationMin", "e", "getLightDurationHour", "setLightDurationHour", "f", "getLightDurationMin", "setLightDurationMin", "g", "Ljava/lang/String;", "getTime", "()Ljava/lang/String;", "setTime", "(Ljava/lang/String;)V", "h", "getTimeReg", "setTimeReg", "i", "getAwakeTime", "setAwakeTime", z.j, "getAwakeTimeReg", "setAwakeTimeReg", hl.k, "getAwakeDuration", "setAwakeDuration", "l", "getAwakeNum", "setAwakeNum", "m", "getSleepFeeling", "setSleepFeeling", GoogleApiAvailabilityLight.b, "getIntoSleepTime", "setIntoSleepTime", "o", "getLazyBedTime", "setLazyBedTime", b.r, "getTurnOverTime", "setTurnOverTime", DTransferConstants.SEARCH_KEY, "getDreamTime", "setDreamTime", "r", "getSleepScore", "setSleepScore", SOAP.XMLNS, "Z", "()Z", "setEmpty", "(Z)V", "t", "setRemSupported", "<init>", "(IIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIIIZZ)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepShowData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int durationHour;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int durationMin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int deepDurationHour;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int deepDurationMin;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int lightDurationHour;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private int lightDurationMin;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private String time;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private String timeReg;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private String awakeTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private String awakeTimeReg;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private int awakeDuration;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private int awakeNum;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private int sleepFeeling;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    private int intoSleepTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    private int lazyBedTime;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private int turnOverTime;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    private int dreamTime;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    private int sleepScore;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    private boolean isEmpty;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    private boolean isRemSupported;

    public SleepShowData() {
        this(0, 0, 0, 0, 0, 0, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 1048575, null);
    }

    public SleepShowData(int i, int i2, int i3, int i4, int i5, int i6, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z, boolean z2) {
        this.durationHour = i;
        this.durationMin = i2;
        this.deepDurationHour = i3;
        this.deepDurationMin = i4;
        this.lightDurationHour = i5;
        this.lightDurationMin = i6;
        this.time = str;
        this.timeReg = str2;
        this.awakeTime = str3;
        this.awakeTimeReg = str4;
        this.awakeDuration = i7;
        this.awakeNum = i8;
        this.sleepFeeling = i9;
        this.intoSleepTime = i10;
        this.lazyBedTime = i11;
        this.turnOverTime = i12;
        this.dreamTime = i13;
        this.sleepScore = i14;
        this.isEmpty = z;
        this.isRemSupported = z2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDurationHour() {
        return this.durationHour;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAwakeTimeReg() {
        return this.awakeTimeReg;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getAwakeDuration() {
        return this.awakeDuration;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getAwakeNum() {
        return this.awakeNum;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getSleepFeeling() {
        return this.sleepFeeling;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getIntoSleepTime() {
        return this.intoSleepTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getLazyBedTime() {
        return this.lazyBedTime;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getTurnOverTime() {
        return this.turnOverTime;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getDreamTime() {
        return this.dreamTime;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getSleepScore() {
        return this.sleepScore;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDurationMin() {
        return this.durationMin;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsRemSupported() {
        return this.isRemSupported;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeepDurationHour() {
        return this.deepDurationHour;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeepDurationMin() {
        return this.deepDurationMin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLightDurationHour() {
        return this.lightDurationHour;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLightDurationMin() {
        return this.lightDurationMin;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTimeReg() {
        return this.timeReg;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAwakeTime() {
        return this.awakeTime;
    }

    @NotNull
    public final SleepShowData copy(int durationHour, int durationMin, int deepDurationHour, int deepDurationMin, int lightDurationHour, int lightDurationMin, @Nullable String time, @Nullable String timeReg, @Nullable String awakeTime, @Nullable String awakeTimeReg, int awakeDuration, int awakeNum, int sleepFeeling, int intoSleepTime, int lazyBedTime, int turnOverTime, int dreamTime, int sleepScore, boolean isEmpty, boolean isRemSupported) {
        return new SleepShowData(durationHour, durationMin, deepDurationHour, deepDurationMin, lightDurationHour, lightDurationMin, time, timeReg, awakeTime, awakeTimeReg, awakeDuration, awakeNum, sleepFeeling, intoSleepTime, lazyBedTime, turnOverTime, dreamTime, sleepScore, isEmpty, isRemSupported);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepShowData)) {
            return false;
        }
        SleepShowData sleepShowData = (SleepShowData) other;
        return this.durationHour == sleepShowData.durationHour && this.durationMin == sleepShowData.durationMin && this.deepDurationHour == sleepShowData.deepDurationHour && this.deepDurationMin == sleepShowData.deepDurationMin && this.lightDurationHour == sleepShowData.lightDurationHour && this.lightDurationMin == sleepShowData.lightDurationMin && Intrinsics.areEqual(this.time, sleepShowData.time) && Intrinsics.areEqual(this.timeReg, sleepShowData.timeReg) && Intrinsics.areEqual(this.awakeTime, sleepShowData.awakeTime) && Intrinsics.areEqual(this.awakeTimeReg, sleepShowData.awakeTimeReg) && this.awakeDuration == sleepShowData.awakeDuration && this.awakeNum == sleepShowData.awakeNum && this.sleepFeeling == sleepShowData.sleepFeeling && this.intoSleepTime == sleepShowData.intoSleepTime && this.lazyBedTime == sleepShowData.lazyBedTime && this.turnOverTime == sleepShowData.turnOverTime && this.dreamTime == sleepShowData.dreamTime && this.sleepScore == sleepShowData.sleepScore && this.isEmpty == sleepShowData.isEmpty && this.isRemSupported == sleepShowData.isRemSupported;
    }

    public final int getAwakeDuration() {
        return this.awakeDuration;
    }

    public final int getAwakeNum() {
        return this.awakeNum;
    }

    @Nullable
    public final String getAwakeTime() {
        return this.awakeTime;
    }

    @Nullable
    public final String getAwakeTimeReg() {
        return this.awakeTimeReg;
    }

    public final int getDeepDuration() {
        return (this.deepDurationHour * 60) + this.deepDurationMin;
    }

    public final int getDeepDurationHour() {
        return this.deepDurationHour;
    }

    public final int getDeepDurationMin() {
        return this.deepDurationMin;
    }

    public final int getDreamTime() {
        return this.dreamTime;
    }

    public final int getDuration() {
        return (this.durationHour * 60) + this.durationMin;
    }

    public final int getDurationHour() {
        return this.durationHour;
    }

    public final int getDurationMin() {
        return this.durationMin;
    }

    public final int getIntoSleepTime() {
        return this.intoSleepTime;
    }

    public final int getLazyBedTime() {
        return this.lazyBedTime;
    }

    public final int getLightDuration() {
        return (this.lightDurationHour * 60) + this.lightDurationMin;
    }

    public final int getLightDurationHour() {
        return this.lightDurationHour;
    }

    public final int getLightDurationMin() {
        return this.lightDurationMin;
    }

    public final int getSleepFeeling() {
        return this.sleepFeeling;
    }

    public final int getSleepScore() {
        return this.sleepScore;
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    @Nullable
    public final String getTimeReg() {
        return this.timeReg;
    }

    public final int getTurnOverTime() {
        return this.turnOverTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38, types: [int] */
    /* JADX WARN: Type inference failed for: r1v24, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int i = ((((((((((this.durationHour * 31) + this.durationMin) * 31) + this.deepDurationHour) * 31) + this.deepDurationMin) * 31) + this.lightDurationHour) * 31) + this.lightDurationMin) * 31;
        String str = this.time;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timeReg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.awakeTime;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.awakeTimeReg;
        int iHashCode4 = (((((((((((((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.awakeDuration) * 31) + this.awakeNum) * 31) + this.sleepFeeling) * 31) + this.intoSleepTime) * 31) + this.lazyBedTime) * 31) + this.turnOverTime) * 31) + this.dreamTime) * 31) + this.sleepScore) * 31;
        boolean z = this.isEmpty;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (iHashCode4 + r1) * 31;
        boolean z2 = this.isRemSupported;
        return i2 + (z2 ? 1 : z2);
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public final boolean isRemSupported() {
        return this.isRemSupported;
    }

    public final void setAwakeDuration(int i) {
        this.awakeDuration = i;
    }

    public final void setAwakeNum(int i) {
        this.awakeNum = i;
    }

    public final void setAwakeTime(@Nullable String str) {
        this.awakeTime = str;
    }

    public final void setAwakeTimeReg(@Nullable String str) {
        this.awakeTimeReg = str;
    }

    public final void setDeepDurationHour(int i) {
        this.deepDurationHour = i;
    }

    public final void setDeepDurationMin(int i) {
        this.deepDurationMin = i;
    }

    public final void setDreamTime(int i) {
        this.dreamTime = i;
    }

    public final void setDurationHour(int i) {
        this.durationHour = i;
    }

    public final void setDurationMin(int i) {
        this.durationMin = i;
    }

    public final void setEmpty(boolean z) {
        this.isEmpty = z;
    }

    public final void setIntoSleepTime(int i) {
        this.intoSleepTime = i;
    }

    public final void setLazyBedTime(int i) {
        this.lazyBedTime = i;
    }

    public final void setLightDurationHour(int i) {
        this.lightDurationHour = i;
    }

    public final void setLightDurationMin(int i) {
        this.lightDurationMin = i;
    }

    public final void setRemSupported(boolean z) {
        this.isRemSupported = z;
    }

    public final void setSleepFeeling(int i) {
        this.sleepFeeling = i;
    }

    public final void setSleepScore(int i) {
        this.sleepScore = i;
    }

    public final void setTime(@Nullable String str) {
        this.time = str;
    }

    public final void setTimeReg(@Nullable String str) {
        this.timeReg = str;
    }

    public final void setTurnOverTime(int i) {
        this.turnOverTime = i;
    }

    @NotNull
    public String toString() {
        return "SleepShowData(durationHour=" + this.durationHour + ", durationMin=" + this.durationMin + ", deepDurationHour=" + this.deepDurationHour + ", deepDurationMin=" + this.deepDurationMin + ", lightDurationHour=" + this.lightDurationHour + ", lightDurationMin=" + this.lightDurationMin + ", time=" + this.time + ", timeReg=" + this.timeReg + ", awakeTime=" + this.awakeTime + ", awakeTimeReg=" + this.awakeTimeReg + ", awakeDuration=" + this.awakeDuration + ", awakeNum=" + this.awakeNum + ", sleepFeeling=" + this.sleepFeeling + ", intoSleepTime=" + this.intoSleepTime + ", lazyBedTime=" + this.lazyBedTime + ", turnOverTime=" + this.turnOverTime + ", dreamTime=" + this.dreamTime + ", sleepScore=" + this.sleepScore + ", isEmpty=" + this.isEmpty + ", isRemSupported=" + this.isRemSupported + ")";
    }

    public /* synthetic */ SleepShowData(int i, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, String str4, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z, boolean z2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i, (i15 & 2) != 0 ? 0 : i2, (i15 & 4) != 0 ? 0 : i3, (i15 & 8) != 0 ? 0 : i4, (i15 & 16) != 0 ? 0 : i5, (i15 & 32) != 0 ? 0 : i6, (i15 & 64) != 0 ? null : str, (i15 & 128) != 0 ? null : str2, (i15 & 256) != 0 ? null : str3, (i15 & 512) == 0 ? str4 : null, (i15 & 1024) != 0 ? 0 : i7, (i15 & 2048) != 0 ? 0 : i8, (i15 & 4096) != 0 ? 0 : i9, (i15 & 8192) != 0 ? 0 : i10, (i15 & 16384) != 0 ? 0 : i11, (i15 & 32768) != 0 ? 0 : i12, (i15 & 65536) != 0 ? 0 : i13, (i15 & 131072) != 0 ? 0 : i14, (i15 & 262144) != 0 ? true : z, (i15 & 524288) != 0 ? false : z2);
    }
}
