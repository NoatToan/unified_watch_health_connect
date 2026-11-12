package com.huami.sleep.sleephome.promotion;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/sleep/sleephome/promotion/NavigateInfo;", "", "", "component1", "", "component2", "mode", "url", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getMode", "()I", "b", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NavigateInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int mode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String url;

    public NavigateInfo(int i, @NotNull String str) {
        this.mode = i;
        this.url = str;
    }

    public static /* synthetic */ NavigateInfo copy$default(NavigateInfo navigateInfo, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = navigateInfo.mode;
        }
        if ((i2 & 2) != 0) {
            str = navigateInfo.url;
        }
        return navigateInfo.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final NavigateInfo copy(int mode, @NotNull String url) {
        return new NavigateInfo(mode, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigateInfo)) {
            return false;
        }
        NavigateInfo navigateInfo = (NavigateInfo) other;
        return this.mode == navigateInfo.mode && Intrinsics.areEqual(this.url, navigateInfo.url);
    }

    public final int getMode() {
        return this.mode;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.mode * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "NavigateInfo(mode=" + this.mode + ", url=" + this.url + ")";
    }
}
