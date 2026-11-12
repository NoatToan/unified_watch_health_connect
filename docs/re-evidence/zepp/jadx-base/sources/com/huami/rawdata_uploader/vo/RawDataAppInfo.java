package com.huami.rawdata_uploader.vo;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/rawdata_uploader/vo/RawDataAppInfo;", "", "", "component1", "appName", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RawDataAppInfo {

    @NotNull
    private final String appName;

    /* JADX WARN: Multi-variable type inference failed */
    public RawDataAppInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public RawDataAppInfo(@NotNull String str) {
        this.appName = str;
    }

    public static /* synthetic */ RawDataAppInfo copy$default(RawDataAppInfo rawDataAppInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rawDataAppInfo.appName;
        }
        return rawDataAppInfo.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final RawDataAppInfo copy(@NotNull String appName) {
        return new RawDataAppInfo(appName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RawDataAppInfo) && Intrinsics.areEqual(this.appName, ((RawDataAppInfo) other).appName);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    public int hashCode() {
        return this.appName.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawDataAppInfo(appName=" + this.appName + ")";
    }

    public /* synthetic */ RawDataAppInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
