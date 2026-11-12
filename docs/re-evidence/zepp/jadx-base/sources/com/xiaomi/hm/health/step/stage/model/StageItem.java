package com.xiaomi.hm.health.step.stage.model;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J#\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/step/stage/model/StageItem;", "", "", "component1", "", "component2", "timeIndex", "value", "copy", "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getTimeIndex", "()I", "Ljava/util/List;", "getValue", "()Ljava/util/List;", "<init>", "(ILjava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StageItem {

    @SerializedName("ix")
    private final int timeIndex;

    @SerializedName("value")
    @NotNull
    private final List<Integer> value;

    public StageItem(int i, @NotNull List<Integer> list) {
        this.timeIndex = i;
        this.value = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StageItem copy$default(StageItem stageItem, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stageItem.timeIndex;
        }
        if ((i2 & 2) != 0) {
            list = stageItem.value;
        }
        return stageItem.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTimeIndex() {
        return this.timeIndex;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.value;
    }

    @NotNull
    public final StageItem copy(int timeIndex, @NotNull List<Integer> value) {
        return new StageItem(timeIndex, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageItem)) {
            return false;
        }
        StageItem stageItem = (StageItem) other;
        return this.timeIndex == stageItem.timeIndex && Intrinsics.areEqual(this.value, stageItem.value);
    }

    public final int getTimeIndex() {
        return this.timeIndex;
    }

    @NotNull
    public final List<Integer> getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.timeIndex * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "StageItem(timeIndex=" + this.timeIndex + ", value=" + this.value + ")";
    }
}
