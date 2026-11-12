package com.xiaomi.hm.health.ui.smartplay.appnotify.data;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/data/AppSupportReplyInfo;", "", "", "component1", "component2", "icon", "appName", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIcon", "()I", "b", "getAppName", "<init>", "(II)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppSupportReplyInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int appName;

    public AppSupportReplyInfo(@DrawableRes int i, @StringRes int i2) {
        this.icon = i;
        this.appName = i2;
    }

    public static /* synthetic */ AppSupportReplyInfo copy$default(AppSupportReplyInfo appSupportReplyInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = appSupportReplyInfo.icon;
        }
        if ((i3 & 2) != 0) {
            i2 = appSupportReplyInfo.appName;
        }
        return appSupportReplyInfo.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAppName() {
        return this.appName;
    }

    @NotNull
    public final AppSupportReplyInfo copy(@DrawableRes int icon, @StringRes int appName) {
        return new AppSupportReplyInfo(icon, appName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppSupportReplyInfo)) {
            return false;
        }
        AppSupportReplyInfo appSupportReplyInfo = (AppSupportReplyInfo) other;
        return this.icon == appSupportReplyInfo.icon && this.appName == appSupportReplyInfo.appName;
    }

    public final int getAppName() {
        return this.appName;
    }

    public final int getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return (this.icon * 31) + this.appName;
    }

    @NotNull
    public String toString() {
        return "AppSupportReplyInfo(icon=" + this.icon + ", appName=" + this.appName + ")";
    }
}
