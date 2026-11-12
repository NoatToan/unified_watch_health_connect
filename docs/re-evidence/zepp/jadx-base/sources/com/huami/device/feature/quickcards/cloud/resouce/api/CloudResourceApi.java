package com.huami.device.feature.quickcards.cloud.resouce.api;

import androidx.annotation.WorkerThread;
import com.amazon.identity.auth.device.datastore.DatabaseHelper;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000 \t*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0002\n\tJ!\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi;", "RequestBean", "ResponseBean", "", "request", "", "source", "queryData", "(Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Object;", "Companion", DatabaseHelper.appInfoTable, "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public interface CloudResourceApi<RequestBean, ResponseBean> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int TYPE_APP_SORT = 1;
    public static final int TYPE_QUICK_CARD = 3;
    public static final int TYPE_QUICK_SCREEN = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J;\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi$AppInfo;", "", "", "component1", "component2", "component3", "component4", "component5", "host", "appName", "userId", "lang", "token", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "b", "getAppName", "c", "getUserId", GoogleApiAvailabilityLight.a, "getLang", "e", "getToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class AppInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String host;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final String appName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        private final String userId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        private final String lang;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @NotNull
        private final String token;

        public AppInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            this.host = str;
            this.appName = str2;
            this.userId = str3;
            this.lang = str4;
            this.token = str5;
        }

        public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = appInfo.host;
            }
            if ((i & 2) != 0) {
                str2 = appInfo.appName;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = appInfo.userId;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = appInfo.lang;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = appInfo.token;
            }
            return appInfo.copy(str, str6, str7, str8, str5);
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
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getLang() {
            return this.lang;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @NotNull
        public final AppInfo copy(@NotNull String host, @NotNull String appName, @NotNull String userId, @NotNull String lang, @NotNull String token) {
            return new AppInfo(host, appName, userId, lang, token);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppInfo)) {
                return false;
            }
            AppInfo appInfo = (AppInfo) other;
            return Intrinsics.areEqual(this.host, appInfo.host) && Intrinsics.areEqual(this.appName, appInfo.appName) && Intrinsics.areEqual(this.userId, appInfo.userId) && Intrinsics.areEqual(this.lang, appInfo.lang) && Intrinsics.areEqual(this.token, appInfo.token);
        }

        @NotNull
        public final String getAppName() {
            return this.appName;
        }

        @NotNull
        public final String getHost() {
            return this.host;
        }

        @NotNull
        public final String getLang() {
            return this.lang;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return (((((((this.host.hashCode() * 31) + this.appName.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.token.hashCode();
        }

        @NotNull
        public String toString() {
            return "AppInfo(host=" + this.host + ", appName=" + this.appName + ", userId=" + this.userId + ", lang=" + this.lang + ", token=" + this.token + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi$Companion;", "", "", "TYPE_APP_SORT", LogUtil.I, "TYPE_QUICK_SCREEN", "TYPE_QUICK_CARD", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int TYPE_APP_SORT = 1;
        public static final int TYPE_QUICK_CARD = 3;
        public static final int TYPE_QUICK_SCREEN = 2;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @WorkerThread
    ResponseBean queryData(RequestBean request, @Nullable Integer source) throws Exception;
}
