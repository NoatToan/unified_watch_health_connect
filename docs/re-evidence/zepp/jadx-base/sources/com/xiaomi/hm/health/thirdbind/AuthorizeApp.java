package com.xiaomi.hm.health.thirdbind;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/AuthorizeApp;", "", "", "component1", "component2", "component3", "appId", "appName", "icon", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "b", "getAppName", "c", "getIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AuthorizeApp {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("appId")
    @NotNull
    private final String appId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("appName")
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("icon")
    @NotNull
    private final String icon;

    public AuthorizeApp(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.appId = str;
        this.appName = str2;
        this.icon = str3;
    }

    public static /* synthetic */ AuthorizeApp copy$default(AuthorizeApp authorizeApp, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorizeApp.appId;
        }
        if ((i & 2) != 0) {
            str2 = authorizeApp.appName;
        }
        if ((i & 4) != 0) {
            str3 = authorizeApp.icon;
        }
        return authorizeApp.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final AuthorizeApp copy(@NotNull String appId, @NotNull String appName, @NotNull String icon) {
        return new AuthorizeApp(appId, appName, icon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorizeApp)) {
            return false;
        }
        AuthorizeApp authorizeApp = (AuthorizeApp) other;
        return Intrinsics.areEqual(this.appId, authorizeApp.appId) && Intrinsics.areEqual(this.appName, authorizeApp.appName) && Intrinsics.areEqual(this.icon, authorizeApp.icon);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return (((this.appId.hashCode() * 31) + this.appName.hashCode()) * 31) + this.icon.hashCode();
    }

    @NotNull
    public String toString() {
        return "AuthorizeApp(appId=" + this.appId + ", appName=" + this.appName + ", icon=" + this.icon + ")";
    }
}
