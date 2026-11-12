package com.xiaomi.fitness.sport_eco.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/bean/RecommendSportBean;", "Lcom/xiaomi/fitness/sport_eco/bean/BaseSportItemBean;", "<init>", "()V", "img", "", "getImg", "()Ljava/lang/String;", "setImg", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "title", "getTitle", "setTitle", "mainTitle", "getMainTitle", "setMainTitle", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecommendSportBean extends BaseSportItemBean {

    @NotNull
    private String img = "";

    @NotNull
    private String url = "";

    @NotNull
    private String title = "";

    @NotNull
    private String mainTitle = "";

    @NotNull
    public final String getImg() {
        return this.img;
    }

    @NotNull
    public final String getMainTitle() {
        return this.mainTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.img = str;
    }

    public final void setMainTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mainTitle = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }
}
