package com.xiaomi.hm.health.mainpage;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.unionpay.ui.activity.WatchUnlockActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/PageEntry;", "", "Landroidx/fragment/app/Fragment;", "component1", "", "component2", "component3", "component4", "fragment", WatchUnlockActivity.ARGS_ACTION, "pageIcon", "pagePosition", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "b", LogUtil.I, "getPageTitle", "()I", "c", "getPageIcon", GoogleApiAvailabilityLight.a, "getPagePosition", "<init>", "(Landroidx/fragment/app/Fragment;III)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PageEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Fragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int pageTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int pageIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int pagePosition;

    public PageEntry(@NotNull Fragment fragment, @StringRes int i, @DrawableRes int i2, int i3) {
        this.fragment = fragment;
        this.pageTitle = i;
        this.pageIcon = i2;
        this.pagePosition = i3;
    }

    public static /* synthetic */ PageEntry copy$default(PageEntry pageEntry, Fragment fragment, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fragment = pageEntry.fragment;
        }
        if ((i4 & 2) != 0) {
            i = pageEntry.pageTitle;
        }
        if ((i4 & 4) != 0) {
            i2 = pageEntry.pageIcon;
        }
        if ((i4 & 8) != 0) {
            i3 = pageEntry.pagePosition;
        }
        return pageEntry.copy(fragment, i, i2, i3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Fragment getFragment() {
        return this.fragment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageTitle() {
        return this.pageTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPageIcon() {
        return this.pageIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPagePosition() {
        return this.pagePosition;
    }

    @NotNull
    public final PageEntry copy(@NotNull Fragment fragment, @StringRes int pageTitle, @DrawableRes int pageIcon, int pagePosition) {
        return new PageEntry(fragment, pageTitle, pageIcon, pagePosition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageEntry)) {
            return false;
        }
        PageEntry pageEntry = (PageEntry) other;
        return Intrinsics.areEqual(this.fragment, pageEntry.fragment) && this.pageTitle == pageEntry.pageTitle && this.pageIcon == pageEntry.pageIcon && this.pagePosition == pageEntry.pagePosition;
    }

    @NotNull
    public final Fragment getFragment() {
        return this.fragment;
    }

    public final int getPageIcon() {
        return this.pageIcon;
    }

    public final int getPagePosition() {
        return this.pagePosition;
    }

    public final int getPageTitle() {
        return this.pageTitle;
    }

    public int hashCode() {
        return (((((this.fragment.hashCode() * 31) + this.pageTitle) * 31) + this.pageIcon) * 31) + this.pagePosition;
    }

    @NotNull
    public String toString() {
        return "PageEntry(fragment=" + this.fragment + ", pageTitle=" + this.pageTitle + ", pageIcon=" + this.pageIcon + ", pagePosition=" + this.pagePosition + ")";
    }
}
