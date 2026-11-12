package com.huami.sleep.sleepintrodetail.vo;

import com.alipay.sdk.m.x.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\u001cR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lcom/huami/sleep/sleepintrodetail/vo/AvgTipInfoVo;", "", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "title", "avgValue", "date", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/huami/sleep/sleepintrodetail/vo/AvgTipInfoVo;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", d.o, "(Ljava/lang/String;)V", "b", "Ljava/lang/Integer;", "getAvgValue", "setAvgValue", "(Ljava/lang/Integer;)V", "c", "getDate", "setDate", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AvgTipInfoVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer avgValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String date;

    public AvgTipInfoVo() {
        this(null, null, null, 7, null);
    }

    public AvgTipInfoVo(@NotNull String str, @Nullable Integer num, @NotNull String str2) {
        this.title = str;
        this.avgValue = num;
        this.date = str2;
    }

    public static /* synthetic */ AvgTipInfoVo copy$default(AvgTipInfoVo avgTipInfoVo, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avgTipInfoVo.title;
        }
        if ((i & 2) != 0) {
            num = avgTipInfoVo.avgValue;
        }
        if ((i & 4) != 0) {
            str2 = avgTipInfoVo.date;
        }
        return avgTipInfoVo.copy(str, num, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAvgValue() {
        return this.avgValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final AvgTipInfoVo copy(@NotNull String title, @Nullable Integer avgValue, @NotNull String date) {
        return new AvgTipInfoVo(title, avgValue, date);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvgTipInfoVo)) {
            return false;
        }
        AvgTipInfoVo avgTipInfoVo = (AvgTipInfoVo) other;
        return Intrinsics.areEqual(this.title, avgTipInfoVo.title) && Intrinsics.areEqual(this.avgValue, avgTipInfoVo.avgValue) && Intrinsics.areEqual(this.date, avgTipInfoVo.date);
    }

    @Nullable
    public final Integer getAvgValue() {
        return this.avgValue;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Integer num = this.avgValue;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.date.hashCode();
    }

    public final void setAvgValue(@Nullable Integer num) {
        this.avgValue = num;
    }

    public final void setDate(@NotNull String str) {
        this.date = str;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "AvgTipInfoVo(title=" + this.title + ", avgValue=" + this.avgValue + ", date=" + this.date + ")";
    }

    public /* synthetic */ AvgTipInfoVo(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str2);
    }
}
