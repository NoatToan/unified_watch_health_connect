package com.xiaomi.fitness.homepage.banner;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/homepage/banner/HomeBannerModel;", "", "imgUrl", "", "intentUrl", "mainTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImgUrl", "()Ljava/lang/String;", "setImgUrl", "(Ljava/lang/String;)V", "getIntentUrl", "setIntentUrl", "getMainTitle", "setMainTitle", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeBannerModel {

    @NotNull
    private String imgUrl;

    @NotNull
    private String intentUrl;

    @NotNull
    private String mainTitle;

    public HomeBannerModel(@NotNull String imgUrl, @NotNull String intentUrl, @NotNull String mainTitle) {
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(intentUrl, "intentUrl");
        Intrinsics.checkNotNullParameter(mainTitle, "mainTitle");
        this.imgUrl = imgUrl;
        this.intentUrl = intentUrl;
        this.mainTitle = mainTitle;
    }

    @NotNull
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @NotNull
    public final String getIntentUrl() {
        return this.intentUrl;
    }

    @NotNull
    public final String getMainTitle() {
        return this.mainTitle;
    }

    public final void setImgUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imgUrl = str;
    }

    public final void setIntentUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.intentUrl = str;
    }

    public final void setMainTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mainTitle = str;
    }
}
