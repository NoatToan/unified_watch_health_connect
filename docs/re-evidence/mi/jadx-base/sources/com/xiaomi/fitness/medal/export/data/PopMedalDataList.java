package com.xiaomi.fitness.medal.export.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/medal/export/data/PopMedalDataList;", "", "popMedalDataList", "", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "<init>", "(Ljava/util/List;)V", "getPopMedalDataList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "medal-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PopMedalDataList {

    @NotNull
    private final List<PopMedalData> popMedalDataList;

    public PopMedalDataList(@NotNull List<PopMedalData> popMedalDataList) {
        Intrinsics.checkNotNullParameter(popMedalDataList, "popMedalDataList");
        this.popMedalDataList = popMedalDataList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PopMedalDataList copy$default(PopMedalDataList popMedalDataList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = popMedalDataList.popMedalDataList;
        }
        return popMedalDataList.copy(list);
    }

    @NotNull
    public final List<PopMedalData> component1() {
        return this.popMedalDataList;
    }

    @NotNull
    public final PopMedalDataList copy(@NotNull List<PopMedalData> popMedalDataList) {
        Intrinsics.checkNotNullParameter(popMedalDataList, "popMedalDataList");
        return new PopMedalDataList(popMedalDataList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PopMedalDataList) && Intrinsics.areEqual(this.popMedalDataList, ((PopMedalDataList) other).popMedalDataList);
    }

    @NotNull
    public final List<PopMedalData> getPopMedalDataList() {
        return this.popMedalDataList;
    }

    public int hashCode() {
        return this.popMedalDataList.hashCode();
    }

    @NotNull
    public String toString() {
        return "PopMedalDataList(popMedalDataList=" + this.popMedalDataList + ")";
    }
}
