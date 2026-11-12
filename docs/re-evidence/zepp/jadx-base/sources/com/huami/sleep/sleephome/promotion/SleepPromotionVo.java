package com.huami.sleep.sleephome.promotion;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/sleep/sleephome/promotion/SleepPromotionVo;", "", "", "component1", "component2", "component3", "component4", "Lcom/huami/sleep/sleephome/promotion/NavigateInfo;", "component5", "id", "imageUrl", "title", MessengerShareContentUtility.SUBTITLE, "navigateInfo", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getImageUrl", "c", "getTitle", GoogleApiAvailabilityLight.a, "getSubtitle", "e", "Lcom/huami/sleep/sleephome/promotion/NavigateInfo;", "getNavigateInfo", "()Lcom/huami/sleep/sleephome/promotion/NavigateInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/sleep/sleephome/promotion/NavigateInfo;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepPromotionVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String imageUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final NavigateInfo navigateInfo;

    public SleepPromotionVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull NavigateInfo navigateInfo) {
        this.id = str;
        this.imageUrl = str2;
        this.title = str3;
        this.subtitle = str4;
        this.navigateInfo = navigateInfo;
    }

    public static /* synthetic */ SleepPromotionVo copy$default(SleepPromotionVo sleepPromotionVo, String str, String str2, String str3, String str4, NavigateInfo navigateInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepPromotionVo.id;
        }
        if ((i & 2) != 0) {
            str2 = sleepPromotionVo.imageUrl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = sleepPromotionVo.title;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = sleepPromotionVo.subtitle;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            navigateInfo = sleepPromotionVo.navigateInfo;
        }
        return sleepPromotionVo.copy(str, str5, str6, str7, navigateInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NavigateInfo getNavigateInfo() {
        return this.navigateInfo;
    }

    @NotNull
    public final SleepPromotionVo copy(@NotNull String id, @NotNull String imageUrl, @NotNull String title, @NotNull String subtitle, @NotNull NavigateInfo navigateInfo) {
        return new SleepPromotionVo(id, imageUrl, title, subtitle, navigateInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepPromotionVo)) {
            return false;
        }
        SleepPromotionVo sleepPromotionVo = (SleepPromotionVo) other;
        return Intrinsics.areEqual(this.id, sleepPromotionVo.id) && Intrinsics.areEqual(this.imageUrl, sleepPromotionVo.imageUrl) && Intrinsics.areEqual(this.title, sleepPromotionVo.title) && Intrinsics.areEqual(this.subtitle, sleepPromotionVo.subtitle) && Intrinsics.areEqual(this.navigateInfo, sleepPromotionVo.navigateInfo);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final NavigateInfo getNavigateInfo() {
        return this.navigateInfo;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.navigateInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepPromotionVo(id=" + this.id + ", imageUrl=" + this.imageUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", navigateInfo=" + this.navigateInfo + ")";
    }
}
