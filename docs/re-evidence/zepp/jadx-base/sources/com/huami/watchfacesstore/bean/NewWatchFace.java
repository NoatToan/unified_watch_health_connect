package com.huami.watchfacesstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/watchfacesstore/bean/NewWatchFace;", "", "", "component1", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "component2", "totalCount", "data", "copy", "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getTotalCount", "()I", "Ljava/util/List;", "getData", "()Ljava/util/List;", "<init>", "(ILjava/util/List;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NewWatchFace {

    @NotNull
    private final List<WatchData> data;
    private final int totalCount;

    public NewWatchFace(int i, @NotNull List<WatchData> list) {
        this.totalCount = i;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewWatchFace copy$default(NewWatchFace newWatchFace, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = newWatchFace.totalCount;
        }
        if ((i2 & 2) != 0) {
            list = newWatchFace.data;
        }
        return newWatchFace.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    public final List<WatchData> component2() {
        return this.data;
    }

    @NotNull
    public final NewWatchFace copy(int totalCount, @NotNull List<WatchData> data) {
        return new NewWatchFace(totalCount, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewWatchFace)) {
            return false;
        }
        NewWatchFace newWatchFace = (NewWatchFace) other;
        return this.totalCount == newWatchFace.totalCount && Intrinsics.areEqual(this.data, newWatchFace.data);
    }

    @NotNull
    public final List<WatchData> getData() {
        return this.data;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return (this.totalCount * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "NewWatchFace(totalCount=" + this.totalCount + ", data=" + this.data + ")";
    }
}
