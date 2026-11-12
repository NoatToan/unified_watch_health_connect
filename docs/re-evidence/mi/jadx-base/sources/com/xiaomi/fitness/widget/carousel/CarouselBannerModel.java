package com.xiaomi.fitness.widget.carousel;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/widget/carousel/CarouselBannerModel;", "", "imgUrl", "", "clickUrl", "title", "id", "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getImgUrl", "()Ljava/lang/String;", "getClickUrl", "getTitle", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fitness/widget/carousel/CarouselBannerModel;", "equals", "", "other", "hashCode", "toString", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CarouselBannerModel {

    @Nullable
    private final String clickUrl;

    @Nullable
    private final Integer id;

    @Nullable
    private final String imgUrl;

    @Nullable
    private final String title;

    @Nullable
    private final Integer type;

    public CarouselBannerModel() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CarouselBannerModel copy$default(CarouselBannerModel carouselBannerModel, String str, String str2, String str3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = carouselBannerModel.imgUrl;
        }
        if ((i & 2) != 0) {
            str2 = carouselBannerModel.clickUrl;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = carouselBannerModel.title;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            num = carouselBannerModel.id;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = carouselBannerModel.type;
        }
        return carouselBannerModel.copy(str, str4, str5, num3, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClickUrl() {
        return this.clickUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    public final CarouselBannerModel copy(@Nullable String imgUrl, @Nullable String clickUrl, @Nullable String title, @Nullable Integer id, @Nullable Integer type) {
        return new CarouselBannerModel(imgUrl, clickUrl, title, id, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselBannerModel)) {
            return false;
        }
        CarouselBannerModel carouselBannerModel = (CarouselBannerModel) other;
        return Intrinsics.areEqual(this.imgUrl, carouselBannerModel.imgUrl) && Intrinsics.areEqual(this.clickUrl, carouselBannerModel.clickUrl) && Intrinsics.areEqual(this.title, carouselBannerModel.title) && Intrinsics.areEqual(this.id, carouselBannerModel.id) && Intrinsics.areEqual(this.type, carouselBannerModel.type);
    }

    @Nullable
    public final String getClickUrl() {
        return this.clickUrl;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.imgUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clickUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.id;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.type;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CarouselBannerModel(imgUrl=" + this.imgUrl + ", clickUrl=" + this.clickUrl + ", title=" + this.title + ", id=" + this.id + ", type=" + this.type + ")";
    }

    public CarouselBannerModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2) {
        this.imgUrl = str;
        this.clickUrl = str2;
        this.title = str3;
        this.id = num;
        this.type = num2;
    }

    public /* synthetic */ CarouselBannerModel(String str, String str2, String str3, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
