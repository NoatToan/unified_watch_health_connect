package com.huami.bigdata.statistics.common;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bigdata.statistics.core.annotation.Action;
import com.huami.bigdata.statistics.core.annotation.ActionType;
import com.huami.bigdata.statistics.core.entity.AbstractDateData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/bigdata/statistics/common/CommonDateData;", "Lcom/huami/bigdata/statistics/core/entity/AbstractDateData;", "", "component1", "component2", "max", "min", "copy", "", "toString", "hashCode", "", "other", "", "equals", LogUtil.I, "getMax", "()I", "setMax", "(I)V", "getMin", "setMin", "<init>", "(II)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CommonDateData extends AbstractDateData {

    @Action(type = ActionType.MAX)
    private int max;

    @Action(type = ActionType.MIN)
    private int min;

    public CommonDateData(int i, int i2) {
        super(null, 1, null);
        this.max = i;
        this.min = i2;
    }

    public static /* synthetic */ CommonDateData copy$default(CommonDateData commonDateData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = commonDateData.max;
        }
        if ((i3 & 2) != 0) {
            i2 = commonDateData.min;
        }
        return commonDateData.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    @NotNull
    public final CommonDateData copy(int max, int min) {
        return new CommonDateData(max, min);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonDateData)) {
            return false;
        }
        CommonDateData commonDateData = (CommonDateData) other;
        return this.max == commonDateData.max && this.min == commonDateData.min;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public int hashCode() {
        return (this.max * 31) + this.min;
    }

    public final void setMax(int i) {
        this.max = i;
    }

    public final void setMin(int i) {
        this.min = i;
    }

    @Override // com.huami.bigdata.statistics.core.entity.AbstractDateData
    @NotNull
    public String toString() {
        return "CommonDateData(max=" + this.max + ", min=" + this.min + ")";
    }
}
