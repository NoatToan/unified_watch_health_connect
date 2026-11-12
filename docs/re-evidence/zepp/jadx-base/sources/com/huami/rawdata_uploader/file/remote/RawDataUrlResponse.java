package com.huami.rawdata_uploader.file.remote;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/rawdata_uploader/file/remote/RawDataUrlResponse;", "", "", "component1", "component2", "objectName", "putURI", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getObjectName", "()Ljava/lang/String;", "getPutURI", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RawDataUrlResponse {

    @NotNull
    private final String objectName;

    @NotNull
    private final String putURI;

    /* JADX WARN: Multi-variable type inference failed */
    public RawDataUrlResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public RawDataUrlResponse(@NotNull String str, @NotNull String str2) {
        this.objectName = str;
        this.putURI = str2;
    }

    public static /* synthetic */ RawDataUrlResponse copy$default(RawDataUrlResponse rawDataUrlResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rawDataUrlResponse.objectName;
        }
        if ((i & 2) != 0) {
            str2 = rawDataUrlResponse.putURI;
        }
        return rawDataUrlResponse.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getObjectName() {
        return this.objectName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPutURI() {
        return this.putURI;
    }

    @NotNull
    public final RawDataUrlResponse copy(@NotNull String objectName, @NotNull String putURI) {
        return new RawDataUrlResponse(objectName, putURI);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawDataUrlResponse)) {
            return false;
        }
        RawDataUrlResponse rawDataUrlResponse = (RawDataUrlResponse) other;
        return Intrinsics.areEqual(this.objectName, rawDataUrlResponse.objectName) && Intrinsics.areEqual(this.putURI, rawDataUrlResponse.putURI);
    }

    @NotNull
    public final String getObjectName() {
        return this.objectName;
    }

    @NotNull
    public final String getPutURI() {
        return this.putURI;
    }

    public int hashCode() {
        return (this.objectName.hashCode() * 31) + this.putURI.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawDataUrlResponse(objectName=" + this.objectName + ", putURI=" + this.putURI + ")";
    }

    public /* synthetic */ RawDataUrlResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
