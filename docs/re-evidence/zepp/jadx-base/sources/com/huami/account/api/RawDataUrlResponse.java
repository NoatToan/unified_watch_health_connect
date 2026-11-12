package com.huami.account.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/account/api/RawDataUrlResponse;", "", "", "component1", "component2", "component3", "putURI", "postURI", "getURI", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPutURI", "()Ljava/lang/String;", "b", "getPostURI", "c", "getGetURI", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RawDataUrlResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("putURI")
    @NotNull
    private final String putURI;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("postURI")
    @NotNull
    private final String postURI;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("getURI")
    @NotNull
    private final String getURI;

    public RawDataUrlResponse() {
        this(null, null, null, 7, null);
    }

    public RawDataUrlResponse(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.putURI = str;
        this.postURI = str2;
        this.getURI = str3;
    }

    public static /* synthetic */ RawDataUrlResponse copy$default(RawDataUrlResponse rawDataUrlResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rawDataUrlResponse.putURI;
        }
        if ((i & 2) != 0) {
            str2 = rawDataUrlResponse.postURI;
        }
        if ((i & 4) != 0) {
            str3 = rawDataUrlResponse.getURI;
        }
        return rawDataUrlResponse.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPutURI() {
        return this.putURI;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPostURI() {
        return this.postURI;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGetURI() {
        return this.getURI;
    }

    @NotNull
    public final RawDataUrlResponse copy(@NotNull String putURI, @NotNull String postURI, @NotNull String getURI) {
        return new RawDataUrlResponse(putURI, postURI, getURI);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawDataUrlResponse)) {
            return false;
        }
        RawDataUrlResponse rawDataUrlResponse = (RawDataUrlResponse) other;
        return Intrinsics.areEqual(this.putURI, rawDataUrlResponse.putURI) && Intrinsics.areEqual(this.postURI, rawDataUrlResponse.postURI) && Intrinsics.areEqual(this.getURI, rawDataUrlResponse.getURI);
    }

    @NotNull
    public final String getGetURI() {
        return this.getURI;
    }

    @NotNull
    public final String getPostURI() {
        return this.postURI;
    }

    @NotNull
    public final String getPutURI() {
        return this.putURI;
    }

    public int hashCode() {
        return (((this.putURI.hashCode() * 31) + this.postURI.hashCode()) * 31) + this.getURI.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawDataUrlResponse(putURI=" + this.putURI + ", postURI=" + this.postURI + ", getURI=" + this.getURI + ")";
    }

    public /* synthetic */ RawDataUrlResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
