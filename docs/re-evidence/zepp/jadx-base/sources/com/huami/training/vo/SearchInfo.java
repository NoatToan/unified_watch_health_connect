package com.huami.training.vo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/training/vo/SearchInfo;", "", "", "component1", "component2", "query", "mode", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getQuery", "()Ljava/lang/String;", "b", "getMode", "setMode", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SearchInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String query;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String mode;

    public SearchInfo(@NotNull String str, @NotNull String str2) {
        this.query = str;
        this.mode = str2;
    }

    public static /* synthetic */ SearchInfo copy$default(SearchInfo searchInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchInfo.query;
        }
        if ((i & 2) != 0) {
            str2 = searchInfo.mode;
        }
        return searchInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    @NotNull
    public final SearchInfo copy(@NotNull String query, @NotNull String mode) {
        return new SearchInfo(query, mode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchInfo)) {
            return false;
        }
        SearchInfo searchInfo = (SearchInfo) other;
        return Intrinsics.areEqual(this.query, searchInfo.query) && Intrinsics.areEqual(this.mode, searchInfo.mode);
    }

    @NotNull
    public final String getMode() {
        return this.mode;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        return (this.query.hashCode() * 31) + this.mode.hashCode();
    }

    public final void setMode(@NotNull String str) {
        this.mode = str;
    }

    @NotNull
    public String toString() {
        return "SearchInfo(query=" + this.query + ", mode=" + this.mode + ')';
    }
}
