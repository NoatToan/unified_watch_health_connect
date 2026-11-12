package com.huami.training.db.po;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.WebConst;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity(indices = {@Index(unique = true, value = {WebConst.QueryParam.FILTER_MODE, "filterOrder", "trainingId"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/training/db/po/FilterTraining;", "", "", "component1", "component2", "", "component3", WebConst.QueryParam.FILTER_MODE, "filterOrder", "trainingId", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getFilterMode", "()Ljava/lang/String;", "b", "getFilterOrder", "c", "J", "getTrainingId", "()J", GoogleApiAvailabilityLight.a, LogUtil.I, "getId", "()I", com.huami.sleepassistant.apilib.utils.WebConst.QueryParam.SET_ID, "(I)V", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FilterTraining {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String filterMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String filterOrder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long trainingId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @PrimaryKey(autoGenerate = true)
    private int id;

    public FilterTraining(@NotNull String str, @NotNull String str2, long j) {
        this.filterMode = str;
        this.filterOrder = str2;
        this.trainingId = j;
    }

    public static /* synthetic */ FilterTraining copy$default(FilterTraining filterTraining, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterTraining.filterMode;
        }
        if ((i & 2) != 0) {
            str2 = filterTraining.filterOrder;
        }
        if ((i & 4) != 0) {
            j = filterTraining.trainingId;
        }
        return filterTraining.copy(str, str2, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFilterMode() {
        return this.filterMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilterOrder() {
        return this.filterOrder;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTrainingId() {
        return this.trainingId;
    }

    @NotNull
    public final FilterTraining copy(@NotNull String filterMode, @NotNull String filterOrder, long trainingId) {
        return new FilterTraining(filterMode, filterOrder, trainingId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterTraining)) {
            return false;
        }
        FilterTraining filterTraining = (FilterTraining) other;
        return Intrinsics.areEqual(this.filterMode, filterTraining.filterMode) && Intrinsics.areEqual(this.filterOrder, filterTraining.filterOrder) && this.trainingId == filterTraining.trainingId;
    }

    @NotNull
    public final String getFilterMode() {
        return this.filterMode;
    }

    @NotNull
    public final String getFilterOrder() {
        return this.filterOrder;
    }

    public final int getId() {
        return this.id;
    }

    public final long getTrainingId() {
        return this.trainingId;
    }

    public int hashCode() {
        return (((this.filterMode.hashCode() * 31) + this.filterOrder.hashCode()) * 31) + b.a(this.trainingId);
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public String toString() {
        return "FilterTraining(filterMode=" + this.filterMode + ", filterOrder=" + this.filterOrder + ", trainingId=" + this.trainingId + ')';
    }
}
