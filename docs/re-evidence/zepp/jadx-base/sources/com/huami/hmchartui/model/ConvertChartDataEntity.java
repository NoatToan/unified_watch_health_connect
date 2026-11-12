package com.huami.hmchartui.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J%\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/hmchartui/model/ConvertChartDataEntity;", "", "Lcom/huami/hmchartui/model/ConvertChartData;", "component1", "", "component2", "data", "list", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/hmchartui/model/ConvertChartData;", "getData", "()Lcom/huami/hmchartui/model/ConvertChartData;", "b", "Ljava/util/List;", "getList", "()Ljava/util/List;", "<init>", "(Lcom/huami/hmchartui/model/ConvertChartData;Ljava/util/List;)V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ConvertChartDataEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final ConvertChartData data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<ConvertChartData> list;

    public ConvertChartDataEntity(@Nullable ConvertChartData convertChartData, @NotNull List<ConvertChartData> list) {
        this.data = convertChartData;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConvertChartDataEntity copy$default(ConvertChartDataEntity convertChartDataEntity, ConvertChartData convertChartData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            convertChartData = convertChartDataEntity.data;
        }
        if ((i & 2) != 0) {
            list = convertChartDataEntity.list;
        }
        return convertChartDataEntity.copy(convertChartData, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConvertChartData getData() {
        return this.data;
    }

    @NotNull
    public final List<ConvertChartData> component2() {
        return this.list;
    }

    @NotNull
    public final ConvertChartDataEntity copy(@Nullable ConvertChartData data, @NotNull List<ConvertChartData> list) {
        return new ConvertChartDataEntity(data, list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConvertChartDataEntity)) {
            return false;
        }
        ConvertChartDataEntity convertChartDataEntity = (ConvertChartDataEntity) other;
        return Intrinsics.areEqual(this.data, convertChartDataEntity.data) && Intrinsics.areEqual(this.list, convertChartDataEntity.list);
    }

    @Nullable
    public final ConvertChartData getData() {
        return this.data;
    }

    @NotNull
    public final List<ConvertChartData> getList() {
        return this.list;
    }

    public int hashCode() {
        ConvertChartData convertChartData = this.data;
        return ((convertChartData == null ? 0 : convertChartData.hashCode()) * 31) + this.list.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConvertChartDataEntity(data=" + this.data + ", list=" + this.list + ")";
    }
}
