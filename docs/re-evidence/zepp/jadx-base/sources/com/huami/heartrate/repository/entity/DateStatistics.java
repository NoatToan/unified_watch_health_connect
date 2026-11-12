package com.huami.heartrate.repository.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/huami/heartrate/repository/entity/DateStatistics;", "", "", "", "component1", "datas", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getDatas", "()Ljava/util/List;", "setDatas", "(Ljava/util/List;)V", "<init>", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DateStatistics {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private List<String> datas;

    public DateStatistics(@NotNull List<String> list) {
        this.datas = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DateStatistics copy$default(DateStatistics dateStatistics, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dateStatistics.datas;
        }
        return dateStatistics.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.datas;
    }

    @NotNull
    public final DateStatistics copy(@NotNull List<String> datas) {
        return new DateStatistics(datas);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DateStatistics) && Intrinsics.areEqual(this.datas, ((DateStatistics) other).datas);
    }

    @NotNull
    public final List<String> getDatas() {
        return this.datas;
    }

    public int hashCode() {
        return this.datas.hashCode();
    }

    public final void setDatas(@NotNull List<String> list) {
        this.datas = list;
    }

    @NotNull
    public String toString() {
        return "DateStatistics(datas=" + this.datas + ")";
    }
}
