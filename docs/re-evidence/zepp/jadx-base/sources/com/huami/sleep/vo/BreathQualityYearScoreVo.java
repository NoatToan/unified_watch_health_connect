package com.huami.sleep.vo;

import com.huami.sleep.view.SleepPosCircleView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0019\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0003J-\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R)\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/sleep/vo/BreathQualityYearScoreVo;", "", "", "component1", "Ljava/util/ArrayList;", "Lcom/huami/sleep/view/SleepPosCircleView$Item;", "Lkotlin/collections/ArrayList;", "component2", "yearStr", "data", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getYearStr", "()Ljava/lang/String;", "setYearStr", "(Ljava/lang/String;)V", "b", "Ljava/util/ArrayList;", "getData", "()Ljava/util/ArrayList;", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BreathQualityYearScoreVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private String yearStr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<SleepPosCircleView.Item> data;

    /* JADX WARN: Multi-variable type inference failed */
    public BreathQualityYearScoreVo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public BreathQualityYearScoreVo(@NotNull String str, @NotNull ArrayList<SleepPosCircleView.Item> arrayList) {
        this.yearStr = str;
        this.data = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BreathQualityYearScoreVo copy$default(BreathQualityYearScoreVo breathQualityYearScoreVo, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = breathQualityYearScoreVo.yearStr;
        }
        if ((i & 2) != 0) {
            arrayList = breathQualityYearScoreVo.data;
        }
        return breathQualityYearScoreVo.copy(str, arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getYearStr() {
        return this.yearStr;
    }

    @NotNull
    public final ArrayList<SleepPosCircleView.Item> component2() {
        return this.data;
    }

    @NotNull
    public final BreathQualityYearScoreVo copy(@NotNull String yearStr, @NotNull ArrayList<SleepPosCircleView.Item> data) {
        return new BreathQualityYearScoreVo(yearStr, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreathQualityYearScoreVo)) {
            return false;
        }
        BreathQualityYearScoreVo breathQualityYearScoreVo = (BreathQualityYearScoreVo) other;
        return Intrinsics.areEqual(this.yearStr, breathQualityYearScoreVo.yearStr) && Intrinsics.areEqual(this.data, breathQualityYearScoreVo.data);
    }

    @NotNull
    public final ArrayList<SleepPosCircleView.Item> getData() {
        return this.data;
    }

    @NotNull
    public final String getYearStr() {
        return this.yearStr;
    }

    public int hashCode() {
        return (this.yearStr.hashCode() * 31) + this.data.hashCode();
    }

    public final void setYearStr(@NotNull String str) {
        this.yearStr = str;
    }

    @NotNull
    public String toString() {
        return "BreathQualityYearScoreVo(yearStr=" + this.yearStr + ", data=" + this.data + ")";
    }

    public /* synthetic */ BreathQualityYearScoreVo(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
