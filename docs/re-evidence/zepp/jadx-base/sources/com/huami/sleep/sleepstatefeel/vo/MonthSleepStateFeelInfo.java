package com.huami.sleep.sleepstatefeel.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xmlywind.sdk.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/vo/MonthSleepStateFeelInfo;", "", "", "component1", "", "component2", "component3", "text", Constants.RATIO, "day", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "b", LogUtil.I, "getRatio", "()I", "setRatio", "(I)V", "c", "getDay", "<init>", "(Ljava/lang/String;II)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MonthSleepStateFeelInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int ratio;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int day;

    public MonthSleepStateFeelInfo(@NotNull String str, int i, int i2) {
        this.text = str;
        this.ratio = i;
        this.day = i2;
    }

    public static /* synthetic */ MonthSleepStateFeelInfo copy$default(MonthSleepStateFeelInfo monthSleepStateFeelInfo, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = monthSleepStateFeelInfo.text;
        }
        if ((i3 & 2) != 0) {
            i = monthSleepStateFeelInfo.ratio;
        }
        if ((i3 & 4) != 0) {
            i2 = monthSleepStateFeelInfo.day;
        }
        return monthSleepStateFeelInfo.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRatio() {
        return this.ratio;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    @NotNull
    public final MonthSleepStateFeelInfo copy(@NotNull String text, int ratio, int day) {
        return new MonthSleepStateFeelInfo(text, ratio, day);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthSleepStateFeelInfo)) {
            return false;
        }
        MonthSleepStateFeelInfo monthSleepStateFeelInfo = (MonthSleepStateFeelInfo) other;
        return Intrinsics.areEqual(this.text, monthSleepStateFeelInfo.text) && this.ratio == monthSleepStateFeelInfo.ratio && this.day == monthSleepStateFeelInfo.day;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getRatio() {
        return this.ratio;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.ratio) * 31) + this.day;
    }

    public final void setRatio(int i) {
        this.ratio = i;
    }

    @NotNull
    public String toString() {
        return "MonthSleepStateFeelInfo(text=" + this.text + ", ratio=" + this.ratio + ", day=" + this.day + ")";
    }
}
