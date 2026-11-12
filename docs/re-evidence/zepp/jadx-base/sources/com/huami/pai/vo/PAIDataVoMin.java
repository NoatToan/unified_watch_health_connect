package com.huami.pai.vo;

import androidx.annotation.Keep;
import com.xiaomi.hm.health.Constant;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/huami/pai/vo/PAIDataVoMin;", "", "", "component1", "component2", "", "component3", "component4", "", "component5", "date", "nextActivityScore", Constant.PAI_KEY_DAILY_PAI, "tp", "timestamp", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getNextActivityScore", "setNextActivityScore", "F", "getDp", "()F", "setDp", "(F)V", "getTp", "setTp", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;FFJ)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PAIDataVoMin {

    @NotNull
    private String date;
    private float dp;

    @NotNull
    private String nextActivityScore;
    private long timestamp;
    private float tp;

    public PAIDataVoMin(@NotNull String str, @NotNull String str2, float f, float f2, long j) {
        this.date = str;
        this.nextActivityScore = str2;
        this.dp = f;
        this.tp = f2;
        this.timestamp = j;
    }

    public static /* synthetic */ PAIDataVoMin copy$default(PAIDataVoMin pAIDataVoMin, String str, String str2, float f, float f2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pAIDataVoMin.date;
        }
        if ((i & 2) != 0) {
            str2 = pAIDataVoMin.nextActivityScore;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            f = pAIDataVoMin.dp;
        }
        float f3 = f;
        if ((i & 8) != 0) {
            f2 = pAIDataVoMin.tp;
        }
        float f4 = f2;
        if ((i & 16) != 0) {
            j = pAIDataVoMin.timestamp;
        }
        return pAIDataVoMin.copy(str, str3, f3, f4, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextActivityScore() {
        return this.nextActivityScore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getDp() {
        return this.dp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getTp() {
        return this.tp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final PAIDataVoMin copy(@NotNull String date, @NotNull String nextActivityScore, float dp, float tp, long timestamp) {
        return new PAIDataVoMin(date, nextActivityScore, dp, tp, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PAIDataVoMin)) {
            return false;
        }
        PAIDataVoMin pAIDataVoMin = (PAIDataVoMin) other;
        return Intrinsics.areEqual(this.date, pAIDataVoMin.date) && Intrinsics.areEqual(this.nextActivityScore, pAIDataVoMin.nextActivityScore) && Intrinsics.areEqual((Object) Float.valueOf(this.dp), (Object) Float.valueOf(pAIDataVoMin.dp)) && Intrinsics.areEqual((Object) Float.valueOf(this.tp), (Object) Float.valueOf(pAIDataVoMin.tp)) && this.timestamp == pAIDataVoMin.timestamp;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final float getDp() {
        return this.dp;
    }

    @NotNull
    public final String getNextActivityScore() {
        return this.nextActivityScore;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getTp() {
        return this.tp;
    }

    public int hashCode() {
        return (((((((this.date.hashCode() * 31) + this.nextActivityScore.hashCode()) * 31) + Float.floatToIntBits(this.dp)) * 31) + Float.floatToIntBits(this.tp)) * 31) + b.a(this.timestamp);
    }

    public final void setDate(@NotNull String str) {
        this.date = str;
    }

    public final void setDp(float f) {
        this.dp = f;
    }

    public final void setNextActivityScore(@NotNull String str) {
        this.nextActivityScore = str;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setTp(float f) {
        this.tp = f;
    }

    @NotNull
    public String toString() {
        return "PAIDataVoMin(date=" + this.date + ", nextActivityScore=" + this.nextActivityScore + ", dp=" + this.dp + ", tp=" + this.tp + ", timestamp=" + this.timestamp + ")";
    }

    public /* synthetic */ PAIDataVoMin(String str, String str2, float f, float f2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "[0,0,0,0,0,0,0]" : str2, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2, (i & 16) != 0 ? 0L : j);
    }
}
