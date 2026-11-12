package com.huami.moving.config.impl;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J#\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/moving/config/impl/SportDataGroupItem;", "", "", "component1", "", "component2", "dataGroup", "data", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getDataGroup", "()Ljava/lang/String;", "Ljava/util/List;", "getData", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SportDataGroupItem {

    @NotNull
    private final List<String> data;

    @NotNull
    private final String dataGroup;

    public SportDataGroupItem(@NotNull String str, @NotNull List<String> list) {
        this.dataGroup = str;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportDataGroupItem copy$default(SportDataGroupItem sportDataGroupItem, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sportDataGroupItem.dataGroup;
        }
        if ((i & 2) != 0) {
            list = sportDataGroupItem.data;
        }
        return sportDataGroupItem.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDataGroup() {
        return this.dataGroup;
    }

    @NotNull
    public final List<String> component2() {
        return this.data;
    }

    @NotNull
    public final SportDataGroupItem copy(@NotNull String dataGroup, @NotNull List<String> data) {
        return new SportDataGroupItem(dataGroup, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportDataGroupItem)) {
            return false;
        }
        SportDataGroupItem sportDataGroupItem = (SportDataGroupItem) other;
        return Intrinsics.areEqual(this.dataGroup, sportDataGroupItem.dataGroup) && Intrinsics.areEqual(this.data, sportDataGroupItem.data);
    }

    @NotNull
    public final List<String> getData() {
        return this.data;
    }

    @NotNull
    public final String getDataGroup() {
        return this.dataGroup;
    }

    public int hashCode() {
        return (this.dataGroup.hashCode() * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportDataGroupItem(dataGroup=" + this.dataGroup + ", data=" + this.data + ")";
    }
}
