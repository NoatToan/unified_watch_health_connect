package com.huami.watchfacesstore.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J#\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/watchfacesstore/bean/Ranking;", "", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "component1", "", "component2", "data", "type", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getData", "()Ljava/util/List;", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Ranking {

    @NotNull
    private final List<WatchData> data;

    @NotNull
    private final String type;

    public Ranking(@NotNull List<WatchData> list, @NotNull String str) {
        this.data = list;
        this.type = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ranking copy$default(Ranking ranking, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ranking.data;
        }
        if ((i & 2) != 0) {
            str = ranking.type;
        }
        return ranking.copy(list, str);
    }

    @NotNull
    public final List<WatchData> component1() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final Ranking copy(@NotNull List<WatchData> data, @NotNull String type) {
        return new Ranking(data, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ranking)) {
            return false;
        }
        Ranking ranking = (Ranking) other;
        return Intrinsics.areEqual(this.data, ranking.data) && Intrinsics.areEqual(this.type, ranking.type);
    }

    @NotNull
    public final List<WatchData> getData() {
        return this.data;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "Ranking(data=" + this.data + ", type=" + this.type + ")";
    }
}
