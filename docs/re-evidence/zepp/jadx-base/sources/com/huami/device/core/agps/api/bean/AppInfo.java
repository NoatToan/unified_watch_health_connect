package com.huami.device.core.agps.api.bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.agps.api.DownloadResourceType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003JS\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR%\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001b¨\u0006,"}, d2 = {"Lcom/huami/device/core/agps/api/bean/AppInfo;", "", "", "component1", "component2", "Lcom/huami/device/core/agps/api/DownloadResourceType;", "component3", "component4", "", "component5", "component6", "host", "appName", "fileType", "token", "header", "userId", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "b", "getAppName", "c", "Lcom/huami/device/core/agps/api/DownloadResourceType;", "getFileType", "()Lcom/huami/device/core/agps/api/DownloadResourceType;", GoogleApiAvailabilityLight.a, "getToken", "e", "Ljava/util/Map;", "getHeader", "()Ljava/util/Map;", "f", "getUserId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/device/core/agps/api/DownloadResourceType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "agps-api_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AppInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String host;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final DownloadResourceType fileType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final Map<String, String> header;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String userId;

    public AppInfo(@NotNull String str, @NotNull String str2, @NotNull DownloadResourceType downloadResourceType, @NotNull String str3, @NotNull Map<String, String> map, @Nullable String str4) {
        this.host = str;
        this.appName = str2;
        this.fileType = downloadResourceType;
        this.token = str3;
        this.header = map;
        this.userId = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, DownloadResourceType downloadResourceType, String str3, Map map, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInfo.host;
        }
        if ((i & 2) != 0) {
            str2 = appInfo.appName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            downloadResourceType = appInfo.fileType;
        }
        DownloadResourceType downloadResourceType2 = downloadResourceType;
        if ((i & 8) != 0) {
            str3 = appInfo.token;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            map = appInfo.header;
        }
        Map map2 = map;
        if ((i & 32) != 0) {
            str4 = appInfo.userId;
        }
        return appInfo.copy(str, str5, downloadResourceType2, str6, map2, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DownloadResourceType getFileType() {
        return this.fileType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final Map<String, String> component5() {
        return this.header;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final AppInfo copy(@NotNull String host, @NotNull String appName, @NotNull DownloadResourceType fileType, @NotNull String token, @NotNull Map<String, String> header, @Nullable String userId) {
        return new AppInfo(host, appName, fileType, token, header, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) other;
        return Intrinsics.areEqual(this.host, appInfo.host) && Intrinsics.areEqual(this.appName, appInfo.appName) && Intrinsics.areEqual(this.fileType, appInfo.fileType) && Intrinsics.areEqual(this.token, appInfo.token) && Intrinsics.areEqual(this.header, appInfo.header) && Intrinsics.areEqual(this.userId, appInfo.userId);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final DownloadResourceType getFileType() {
        return this.fileType;
    }

    @NotNull
    public final Map<String, String> getHeader() {
        return this.header;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.host;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.appName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        DownloadResourceType downloadResourceType = this.fileType;
        int iHashCode3 = (iHashCode2 + (downloadResourceType != null ? downloadResourceType.hashCode() : 0)) * 31;
        String str3 = this.token;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, String> map = this.header;
        int iHashCode5 = (iHashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.userId;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AppInfo(host=" + this.host + ", appName=" + this.appName + ", fileType=" + this.fileType + ", token=" + this.token + ", header=" + this.header + ", userId=" + this.userId + ")";
    }

    public /* synthetic */ AppInfo(String str, String str2, DownloadResourceType downloadResourceType, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, downloadResourceType, str3, (i & 16) != 0 ? r.emptyMap() : map, (i & 32) != 0 ? null : str4);
    }
}
