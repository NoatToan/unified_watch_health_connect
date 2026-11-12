package com.xiaomi.fitness.webview.bean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/webview/bean/PageData;", "Ljava/io/Serializable;", "targetPage", "", "pageParam", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTargetPage", "()Ljava/lang/String;", "getPageParam", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PageData implements Serializable {

    @SerializedName("pageParam")
    @Nullable
    private final String pageParam;

    @SerializedName("targetPage")
    @Nullable
    private final String targetPage;

    public PageData(@Nullable String str, @Nullable String str2) {
        this.targetPage = str;
        this.pageParam = str2;
    }

    public static /* synthetic */ PageData copy$default(PageData pageData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageData.targetPage;
        }
        if ((i & 2) != 0) {
            str2 = pageData.pageParam;
        }
        return pageData.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTargetPage() {
        return this.targetPage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageParam() {
        return this.pageParam;
    }

    @NotNull
    public final PageData copy(@Nullable String targetPage, @Nullable String pageParam) {
        return new PageData(targetPage, pageParam);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageData)) {
            return false;
        }
        PageData pageData = (PageData) other;
        return Intrinsics.areEqual(this.targetPage, pageData.targetPage) && Intrinsics.areEqual(this.pageParam, pageData.pageParam);
    }

    @Nullable
    public final String getPageParam() {
        return this.pageParam;
    }

    @Nullable
    public final String getTargetPage() {
        return this.targetPage;
    }

    public int hashCode() {
        String str = this.targetPage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pageParam;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PageData(targetPage=" + this.targetPage + ", pageParam=" + this.pageParam + ')';
    }
}
