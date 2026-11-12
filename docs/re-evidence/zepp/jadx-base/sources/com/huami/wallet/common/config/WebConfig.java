package com.huami.wallet.common.config;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/wallet/common/config/WebConfig;", "", "", "component1", "component2", "webAppName", "webHost", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getWebAppName", "()Ljava/lang/String;", "b", "getWebHost", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "common_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WebConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String webAppName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String webHost;

    public WebConfig(@NotNull String str, @NotNull String str2) {
        this.webAppName = str;
        this.webHost = str2;
    }

    public static /* synthetic */ WebConfig copy$default(WebConfig webConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webConfig.webAppName;
        }
        if ((i & 2) != 0) {
            str2 = webConfig.webHost;
        }
        return webConfig.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWebAppName() {
        return this.webAppName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWebHost() {
        return this.webHost;
    }

    @NotNull
    public final WebConfig copy(@NotNull String webAppName, @NotNull String webHost) {
        return new WebConfig(webAppName, webHost);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebConfig)) {
            return false;
        }
        WebConfig webConfig = (WebConfig) other;
        return Intrinsics.areEqual(this.webAppName, webConfig.webAppName) && Intrinsics.areEqual(this.webHost, webConfig.webHost);
    }

    @NotNull
    public final String getWebAppName() {
        return this.webAppName;
    }

    @NotNull
    public final String getWebHost() {
        return this.webHost;
    }

    public int hashCode() {
        return (this.webAppName.hashCode() * 31) + this.webHost.hashCode();
    }

    @NotNull
    public String toString() {
        return "WebConfig(webAppName=" + this.webAppName + ", webHost=" + this.webHost + ')';
    }

    public /* synthetic */ WebConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
