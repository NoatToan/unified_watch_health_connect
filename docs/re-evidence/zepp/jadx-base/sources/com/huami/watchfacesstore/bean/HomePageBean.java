package com.huami.watchfacesstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b-\u0010.J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000fHÆ\u0003J\u007f\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000fHÆ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u000fHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b$\u0010#R\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b%\u0010#R\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b&\u0010#R\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b'\u0010#R!\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b(\u0010#R\u0019\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b,\u0010+¨\u0006/"}, d2 = {"Lcom/huami/watchfacesstore/bean/HomePageBean;", "", "", "Lcom/huami/watchfacesstore/bean/BannerBean;", "component1", "Lcom/huami/watchfacesstore/bean/Category;", "component2", "Lcom/huami/watchfacesstore/bean/WatchData;", "component3", "Lcom/huami/watchfacesstore/bean/Ranking;", "component4", "Lcom/huami/watchfacesstore/bean/Subject;", "component5", "Lcom/huami/watchfacesstore/bean/Topic;", "component6", "", "component7", "component8", "banner", "categories", "newWatchFace", "ranking", "subjects", Constants.EXTRA_KEY_TOPICS, "total", "new_count", "copy", "", "toString", "hashCode", "other", "", "equals", "Ljava/util/List;", "getBanner", "()Ljava/util/List;", "getCategories", "getNewWatchFace", "getRanking", "getSubjects", "getTopics", LogUtil.I, "getTotal", "()I", "getNew_count", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;II)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HomePageBean {

    @NotNull
    private final List<BannerBean> banner;

    @NotNull
    private final List<Category> categories;

    @SerializedName("new")
    @NotNull
    private final List<WatchData> newWatchFace;
    private final int new_count;

    @NotNull
    private final List<Ranking> ranking;

    @NotNull
    private final List<Subject> subjects;

    @Nullable
    private final List<Topic> topics;
    private final int total;

    public HomePageBean(@NotNull List<BannerBean> list, @NotNull List<Category> list2, @NotNull List<WatchData> list3, @NotNull List<Ranking> list4, @NotNull List<Subject> list5, @Nullable List<Topic> list6, int i, int i2) {
        this.banner = list;
        this.categories = list2;
        this.newWatchFace = list3;
        this.ranking = list4;
        this.subjects = list5;
        this.topics = list6;
        this.total = i;
        this.new_count = i2;
    }

    @NotNull
    public final List<BannerBean> component1() {
        return this.banner;
    }

    @NotNull
    public final List<Category> component2() {
        return this.categories;
    }

    @NotNull
    public final List<WatchData> component3() {
        return this.newWatchFace;
    }

    @NotNull
    public final List<Ranking> component4() {
        return this.ranking;
    }

    @NotNull
    public final List<Subject> component5() {
        return this.subjects;
    }

    @Nullable
    public final List<Topic> component6() {
        return this.topics;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getNew_count() {
        return this.new_count;
    }

    @NotNull
    public final HomePageBean copy(@NotNull List<BannerBean> banner, @NotNull List<Category> categories, @NotNull List<WatchData> newWatchFace, @NotNull List<Ranking> ranking, @NotNull List<Subject> subjects, @Nullable List<Topic> topics, int total, int new_count) {
        return new HomePageBean(banner, categories, newWatchFace, ranking, subjects, topics, total, new_count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomePageBean)) {
            return false;
        }
        HomePageBean homePageBean = (HomePageBean) other;
        return Intrinsics.areEqual(this.banner, homePageBean.banner) && Intrinsics.areEqual(this.categories, homePageBean.categories) && Intrinsics.areEqual(this.newWatchFace, homePageBean.newWatchFace) && Intrinsics.areEqual(this.ranking, homePageBean.ranking) && Intrinsics.areEqual(this.subjects, homePageBean.subjects) && Intrinsics.areEqual(this.topics, homePageBean.topics) && this.total == homePageBean.total && this.new_count == homePageBean.new_count;
    }

    @NotNull
    public final List<BannerBean> getBanner() {
        return this.banner;
    }

    @NotNull
    public final List<Category> getCategories() {
        return this.categories;
    }

    @NotNull
    public final List<WatchData> getNewWatchFace() {
        return this.newWatchFace;
    }

    public final int getNew_count() {
        return this.new_count;
    }

    @NotNull
    public final List<Ranking> getRanking() {
        return this.ranking;
    }

    @NotNull
    public final List<Subject> getSubjects() {
        return this.subjects;
    }

    @Nullable
    public final List<Topic> getTopics() {
        return this.topics;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.banner.hashCode() * 31) + this.categories.hashCode()) * 31) + this.newWatchFace.hashCode()) * 31) + this.ranking.hashCode()) * 31) + this.subjects.hashCode()) * 31;
        List<Topic> list = this.topics;
        return ((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.total) * 31) + this.new_count;
    }

    @NotNull
    public String toString() {
        return "HomePageBean(banner=" + this.banner + ", categories=" + this.categories + ", newWatchFace=" + this.newWatchFace + ", ranking=" + this.ranking + ", subjects=" + this.subjects + ", topics=" + this.topics + ", total=" + this.total + ", new_count=" + this.new_count + ")";
    }
}
