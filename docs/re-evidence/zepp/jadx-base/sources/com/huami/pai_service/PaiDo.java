package com.huami.pai_service;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.Constant;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\u0005\u0012\b\b\u0002\u0010#\u001a\u00020\u0005\u0012\b\b\u0002\u0010$\u001a\u00020\b\u0012\b\b\u0002\u0010%\u001a\u00020\b\u0012\b\b\u0002\u0010&\u001a\u00020\b\u0012\b\b\u0002\u0010'\u001a\u00020\n¢\u0006\u0004\bG\u0010HJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\bHÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\bHÆ\u0003J\t\u0010\u000f\u001a\u00020\bHÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J³\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\nHÆ\u0001J\t\u0010)\u001a\u00020\nHÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001J\u0013\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\u0019\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u001a\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\b5\u00104R\u0019\u0010\u001b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u001c\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u001d\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00106\u001a\u0004\b<\u00108R\u0019\u0010\u001e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u00106\u001a\u0004\b=\u00108R\u0019\u0010\u001f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u00106\u001a\u0004\b>\u00108R\u0019\u0010 \u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b \u00106\u001a\u0004\b?\u00108R\u0019\u0010!\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b@\u00104R\u0019\u0010\"\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\bA\u00104R\u0019\u0010#\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\bB\u00104R\u0019\u0010$\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b$\u00106\u001a\u0004\bC\u00108R\u0019\u0010%\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u00106\u001a\u0004\bD\u00108R\u0019\u0010&\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b&\u00106\u001a\u0004\bE\u00108R\u0019\u0010'\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b'\u00109\u001a\u0004\bF\u0010;¨\u0006I"}, d2 = {"Lcom/huami/pai_service/PaiDo;", "", "", "component1", "component2", "", "component3", "component4", "", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "timestamp", "timeZone", "tp", Constant.PAI_KEY_DAILY_PAI, "index", "activityScore", Constant.PAI_KEY_GENDER, Constant.PAI_KEY_MAX_HR, "age", Constant.PAI_KEY_RHR, Constant.PAI_KEY_LOW_ZONE_PAI, Constant.PAI_KEY_MEDIUM_ZONE_PAI, Constant.PAI_KEY_HIGH_ZONE_PAI, Constant.PAI_KEY_LOW_ZONE_MINUTES, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES, Constant.PAI_KEY_HIGH_ZONE_MINUTES, "nextActivityScore", "copy", "toString", "hashCode", "other", "", "equals", "J", "getTimestamp", "()J", "getTimeZone", "F", "getTp", "()F", "getDp", LogUtil.I, "getIndex", "()I", "Ljava/lang/String;", "getActivityScore", "()Ljava/lang/String;", "getGd", "getMaxHr", "getAge", "getRestHr", "getLp", "getMp", "getHp", "getLm", "getMm", "getHm", "getNextActivityScore", "<init>", "(JJFFILjava/lang/String;IIIIFFFIIILjava/lang/String;)V", "pai-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PaiDo {

    @NotNull
    private final String activityScore;
    private final int age;
    private final float dp;
    private final int gd;
    private final int hm;
    private final float hp;
    private final int index;
    private final int lm;
    private final float lp;
    private final int maxHr;
    private final int mm;
    private final float mp;

    @NotNull
    private final String nextActivityScore;
    private final int restHr;
    private final long timeZone;
    private final long timestamp;
    private final float tp;

    public PaiDo() {
        this(0L, 0L, 0.0f, 0.0f, 0, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, 131071, null);
    }

    public PaiDo(long j, long j2, float f, float f2, int i, @NotNull String str, int i2, int i3, int i4, int i5, float f3, float f4, float f5, int i6, int i7, int i8, @NotNull String str2) {
        this.timestamp = j;
        this.timeZone = j2;
        this.tp = f;
        this.dp = f2;
        this.index = i;
        this.activityScore = str;
        this.gd = i2;
        this.maxHr = i3;
        this.age = i4;
        this.restHr = i5;
        this.lp = f3;
        this.mp = f4;
        this.hp = f5;
        this.lm = i6;
        this.mm = i7;
        this.hm = i8;
        this.nextActivityScore = str2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getRestHr() {
        return this.restHr;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getLp() {
        return this.lp;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getMp() {
        return this.mp;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getHp() {
        return this.hp;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getLm() {
        return this.lm;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getMm() {
        return this.mm;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getHm() {
        return this.hm;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getNextActivityScore() {
        return this.nextActivityScore;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getTp() {
        return this.tp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getDp() {
        return this.dp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getActivityScore() {
        return this.activityScore;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getGd() {
        return this.gd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMaxHr() {
        return this.maxHr;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    @NotNull
    public final PaiDo copy(long timestamp, long timeZone, float tp, float dp, int index, @NotNull String activityScore, int gd, int maxHr, int age, int restHr, float lp, float mp, float hp, int lm, int mm, int hm, @NotNull String nextActivityScore) {
        return new PaiDo(timestamp, timeZone, tp, dp, index, activityScore, gd, maxHr, age, restHr, lp, mp, hp, lm, mm, hm, nextActivityScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaiDo)) {
            return false;
        }
        PaiDo paiDo = (PaiDo) other;
        return this.timestamp == paiDo.timestamp && this.timeZone == paiDo.timeZone && Intrinsics.areEqual((Object) Float.valueOf(this.tp), (Object) Float.valueOf(paiDo.tp)) && Intrinsics.areEqual((Object) Float.valueOf(this.dp), (Object) Float.valueOf(paiDo.dp)) && this.index == paiDo.index && Intrinsics.areEqual(this.activityScore, paiDo.activityScore) && this.gd == paiDo.gd && this.maxHr == paiDo.maxHr && this.age == paiDo.age && this.restHr == paiDo.restHr && Intrinsics.areEqual((Object) Float.valueOf(this.lp), (Object) Float.valueOf(paiDo.lp)) && Intrinsics.areEqual((Object) Float.valueOf(this.mp), (Object) Float.valueOf(paiDo.mp)) && Intrinsics.areEqual((Object) Float.valueOf(this.hp), (Object) Float.valueOf(paiDo.hp)) && this.lm == paiDo.lm && this.mm == paiDo.mm && this.hm == paiDo.hm && Intrinsics.areEqual(this.nextActivityScore, paiDo.nextActivityScore);
    }

    @NotNull
    public final String getActivityScore() {
        return this.activityScore;
    }

    public final int getAge() {
        return this.age;
    }

    public final float getDp() {
        return this.dp;
    }

    public final int getGd() {
        return this.gd;
    }

    public final int getHm() {
        return this.hm;
    }

    public final float getHp() {
        return this.hp;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getLm() {
        return this.lm;
    }

    public final float getLp() {
        return this.lp;
    }

    public final int getMaxHr() {
        return this.maxHr;
    }

    public final int getMm() {
        return this.mm;
    }

    public final float getMp() {
        return this.mp;
    }

    @NotNull
    public final String getNextActivityScore() {
        return this.nextActivityScore;
    }

    public final int getRestHr() {
        return this.restHr;
    }

    public final long getTimeZone() {
        return this.timeZone;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getTp() {
        return this.tp;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((b.a(this.timestamp) * 31) + b.a(this.timeZone)) * 31) + Float.floatToIntBits(this.tp)) * 31) + Float.floatToIntBits(this.dp)) * 31) + this.index) * 31) + this.activityScore.hashCode()) * 31) + this.gd) * 31) + this.maxHr) * 31) + this.age) * 31) + this.restHr) * 31) + Float.floatToIntBits(this.lp)) * 31) + Float.floatToIntBits(this.mp)) * 31) + Float.floatToIntBits(this.hp)) * 31) + this.lm) * 31) + this.mm) * 31) + this.hm) * 31) + this.nextActivityScore.hashCode();
    }

    @NotNull
    public String toString() {
        return "PaiDo(timestamp=" + this.timestamp + ", timeZone=" + this.timeZone + ", tp=" + this.tp + ", dp=" + this.dp + ", index=" + this.index + ", activityScore=" + this.activityScore + ", gd=" + this.gd + ", maxHr=" + this.maxHr + ", age=" + this.age + ", restHr=" + this.restHr + ", lp=" + this.lp + ", mp=" + this.mp + ", hp=" + this.hp + ", lm=" + this.lm + ", mm=" + this.mm + ", hm=" + this.hm + ", nextActivityScore=" + this.nextActivityScore + ")";
    }

    public /* synthetic */ PaiDo(long j, long j2, float f, float f2, int i, String str, int i2, int i3, int i4, int i5, float f3, float f4, float f5, int i6, int i7, int i8, String str2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0L : j, (i9 & 2) != 0 ? -1L : j2, (i9 & 4) != 0 ? 0.0f : f, (i9 & 8) != 0 ? 0.0f : f2, (i9 & 16) != 0 ? -1 : i, (i9 & 32) != 0 ? "[0,0,0,0,0,0,0]" : str, (i9 & 64) != 0 ? 0 : i2, (i9 & 128) != 0 ? 0 : i3, (i9 & 256) != 0 ? 0 : i4, (i9 & 512) != 0 ? 0 : i5, (i9 & 1024) != 0 ? 0.0f : f3, (i9 & 2048) != 0 ? 0.0f : f4, (i9 & 4096) != 0 ? 0.0f : f5, (i9 & 8192) != 0 ? 0 : i6, (i9 & 16384) != 0 ? 0 : i7, (i9 & 32768) != 0 ? 0 : i8, (i9 & 65536) != 0 ? "[0,0,0,0,0,0,0]" : str2);
    }
}
