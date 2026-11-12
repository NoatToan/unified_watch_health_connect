package com.xiaomi.fitness.medal.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/medal/bean/PopMedalList;", "", "popMedalList", "", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "<init>", "(Ljava/util/List;)V", "getPopMedalList", "()Ljava/util/List;", "toString", "", "component1", "copy", "equals", "", "other", "hashCode", "", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PopMedalList {

    @SerializedName("popMedalList")
    @NotNull
    private final List<PopMedalData> popMedalList;

    public PopMedalList(@NotNull List<PopMedalData> popMedalList) {
        Intrinsics.checkNotNullParameter(popMedalList, "popMedalList");
        this.popMedalList = popMedalList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PopMedalList copy$default(PopMedalList popMedalList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = popMedalList.popMedalList;
        }
        return popMedalList.copy(list);
    }

    @NotNull
    public final List<PopMedalData> component1() {
        return this.popMedalList;
    }

    @NotNull
    public final PopMedalList copy(@NotNull List<PopMedalData> popMedalList) {
        Intrinsics.checkNotNullParameter(popMedalList, "popMedalList");
        return new PopMedalList(popMedalList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PopMedalList) && Intrinsics.areEqual(this.popMedalList, ((PopMedalList) other).popMedalList);
    }

    @NotNull
    public final List<PopMedalData> getPopMedalList() {
        return this.popMedalList;
    }

    public int hashCode() {
        return this.popMedalList.hashCode();
    }

    @NotNull
    public String toString() {
        return "PopMedalList(popMedalList=" + this.popMedalList + ")";
    }
}
