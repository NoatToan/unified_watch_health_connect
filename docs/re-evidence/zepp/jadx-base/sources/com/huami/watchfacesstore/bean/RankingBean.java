package com.huami.watchfacesstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003JK\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0010\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u0011\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006&"}, d2 = {"Lcom/huami/watchfacesstore/bean/RankingBean;", "", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "data", "name", DTransferConstants.PAGE, "per_page", DTransferConstants.TOTAL_PAGE, "type", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/util/List;", "getData", "()Ljava/util/List;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", LogUtil.I, "getPage", "()I", "getPer_page", "getTotal_page", "getType", "<init>", "(Ljava/util/List;Ljava/lang/String;IIILjava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RankingBean {

    @NotNull
    private final List<WatchData> data;

    @NotNull
    private final String name;
    private final int page;
    private final int per_page;
    private final int total_page;

    @NotNull
    private final String type;

    public RankingBean(@NotNull List<WatchData> list, @NotNull String str, int i, int i2, int i3, @NotNull String str2) {
        this.data = list;
        this.name = str;
        this.page = i;
        this.per_page = i2;
        this.total_page = i3;
        this.type = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankingBean copy$default(RankingBean rankingBean, List list, String str, int i, int i2, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = rankingBean.data;
        }
        if ((i4 & 2) != 0) {
            str = rankingBean.name;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            i = rankingBean.page;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = rankingBean.per_page;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = rankingBean.total_page;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            str2 = rankingBean.type;
        }
        return rankingBean.copy(list, str3, i5, i6, i7, str2);
    }

    @NotNull
    public final List<WatchData> component1() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPer_page() {
        return this.per_page;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotal_page() {
        return this.total_page;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final RankingBean copy(@NotNull List<WatchData> data, @NotNull String name, int page, int per_page, int total_page, @NotNull String type) {
        return new RankingBean(data, name, page, per_page, total_page, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankingBean)) {
            return false;
        }
        RankingBean rankingBean = (RankingBean) other;
        return Intrinsics.areEqual(this.data, rankingBean.data) && Intrinsics.areEqual(this.name, rankingBean.name) && this.page == rankingBean.page && this.per_page == rankingBean.per_page && this.total_page == rankingBean.total_page && Intrinsics.areEqual(this.type, rankingBean.type);
    }

    @NotNull
    public final List<WatchData> getData() {
        return this.data;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPer_page() {
        return this.per_page;
    }

    public final int getTotal_page() {
        return this.total_page;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.data.hashCode() * 31) + this.name.hashCode()) * 31) + this.page) * 31) + this.per_page) * 31) + this.total_page) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "RankingBean(data=" + this.data + ", name=" + this.name + ", page=" + this.page + ", per_page=" + this.per_page + ", total_page=" + this.total_page + ", type=" + this.type + ")";
    }
}
