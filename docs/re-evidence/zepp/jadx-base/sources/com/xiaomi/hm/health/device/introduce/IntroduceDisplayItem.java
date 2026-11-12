package com.xiaomi.hm.health.device.introduce;

import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J3\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R%\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/IntroduceDisplayItem;", "", "", "component1", "component2", "Lkotlin/Function1;", "Lcom/airbnb/lottie/LottieAnimationView;", "", "component3", "title", "subTitle", "imgInit", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "getSubTitle", "c", "Lkotlin/jvm/functions/Function1;", "getImgInit", "()Lkotlin/jvm/functions/Function1;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class IntroduceDisplayItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function1<LottieAnimationView, Unit> imgInit;

    /* JADX WARN: Multi-variable type inference failed */
    public IntroduceDisplayItem(@NotNull String str, @NotNull String str2, @NotNull Function1<? super LottieAnimationView, Unit> function1) {
        this.title = str;
        this.subTitle = str2;
        this.imgInit = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntroduceDisplayItem copy$default(IntroduceDisplayItem introduceDisplayItem, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = introduceDisplayItem.title;
        }
        if ((i & 2) != 0) {
            str2 = introduceDisplayItem.subTitle;
        }
        if ((i & 4) != 0) {
            function1 = introduceDisplayItem.imgInit;
        }
        return introduceDisplayItem.copy(str, str2, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final Function1<LottieAnimationView, Unit> component3() {
        return this.imgInit;
    }

    @NotNull
    public final IntroduceDisplayItem copy(@NotNull String title, @NotNull String subTitle, @NotNull Function1<? super LottieAnimationView, Unit> imgInit) {
        return new IntroduceDisplayItem(title, subTitle, imgInit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntroduceDisplayItem)) {
            return false;
        }
        IntroduceDisplayItem introduceDisplayItem = (IntroduceDisplayItem) other;
        return Intrinsics.areEqual(this.title, introduceDisplayItem.title) && Intrinsics.areEqual(this.subTitle, introduceDisplayItem.subTitle) && Intrinsics.areEqual(this.imgInit, introduceDisplayItem.imgInit);
    }

    @NotNull
    public final Function1<LottieAnimationView, Unit> getImgInit() {
        return this.imgInit;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.subTitle.hashCode()) * 31) + this.imgInit.hashCode();
    }

    @NotNull
    public String toString() {
        return "IntroduceDisplayItem(title=" + this.title + ", subTitle=" + this.subTitle + ", imgInit=" + this.imgInit + ")";
    }
}
