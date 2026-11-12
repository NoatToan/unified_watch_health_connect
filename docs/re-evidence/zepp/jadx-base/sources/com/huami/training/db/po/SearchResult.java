package com.huami.training.db.po;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.utils.WebConst;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity(indices = {@Index(unique = true, value = {"query", "mode"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ@\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\tR\"\u0010)\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/huami/training/db/po/SearchResult;", "", "", "component1", "component2", "", "", "component3", "component4", "()Ljava/lang/Long;", "query", "mode", "ids", "next", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lcom/huami/training/db/po/SearchResult;", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getQuery", "()Ljava/lang/String;", "b", "getMode", "c", "Ljava/util/List;", "getIds", "()Ljava/util/List;", GoogleApiAvailabilityLight.a, "Ljava/lang/Long;", "getNext", "e", LogUtil.I, "getId", "()I", WebConst.QueryParam.SET_ID, "(I)V", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SearchResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String query;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String mode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Long> ids;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long next;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @PrimaryKey(autoGenerate = true)
    private int id;

    public SearchResult(@NotNull String str, @NotNull String str2, @NotNull List<Long> list, @Nullable Long l) {
        this.query = str;
        this.mode = str2;
        this.ids = list;
        this.next = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResult copy$default(SearchResult searchResult, String str, String str2, List list, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchResult.query;
        }
        if ((i & 2) != 0) {
            str2 = searchResult.mode;
        }
        if ((i & 4) != 0) {
            list = searchResult.ids;
        }
        if ((i & 8) != 0) {
            l = searchResult.next;
        }
        return searchResult.copy(str, str2, list, l);
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
    public final List<Long> component3() {
        return this.ids;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getNext() {
        return this.next;
    }

    @NotNull
    public final SearchResult copy(@NotNull String query, @NotNull String mode, @NotNull List<Long> ids, @Nullable Long next) {
        return new SearchResult(query, mode, ids, next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResult)) {
            return false;
        }
        SearchResult searchResult = (SearchResult) other;
        return Intrinsics.areEqual(this.query, searchResult.query) && Intrinsics.areEqual(this.mode, searchResult.mode) && Intrinsics.areEqual(this.ids, searchResult.ids) && Intrinsics.areEqual(this.next, searchResult.next);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final List<Long> getIds() {
        return this.ids;
    }

    @NotNull
    public final String getMode() {
        return this.mode;
    }

    @Nullable
    public final Long getNext() {
        return this.next;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        int iHashCode = ((((this.query.hashCode() * 31) + this.mode.hashCode()) * 31) + this.ids.hashCode()) * 31;
        Long l = this.next;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public String toString() {
        return "SearchResult(query=" + this.query + ", mode=" + this.mode + ", ids=" + this.ids + ", next=" + this.next + ')';
    }
}
