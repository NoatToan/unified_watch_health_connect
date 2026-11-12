package com.xiaomi.fitness.health.sleep.rhythm.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/data/ResearchPresignedUrlRequest;", "", "did", "", "project_id", "", "prefix", "suffix", "items", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/ResearchPresignedUrlItem;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDid", "()Ljava/lang/String;", "getProject_id", "()I", "getPrefix", "getSuffix", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResearchPresignedUrlRequest {

    @SerializedName("did")
    @NotNull
    private final String did;

    @SerializedName("items")
    @NotNull
    private final List<ResearchPresignedUrlItem> items;

    @SerializedName("prefix")
    @NotNull
    private final String prefix;

    @SerializedName("project_id")
    private final int project_id;

    @SerializedName("suffix")
    @NotNull
    private final String suffix;

    public ResearchPresignedUrlRequest(@NotNull String did, int i, @NotNull String prefix, @NotNull String suffix, @NotNull List<ResearchPresignedUrlItem> items) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(items, "items");
        this.did = did;
        this.project_id = i;
        this.prefix = prefix;
        this.suffix = suffix;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResearchPresignedUrlRequest copy$default(ResearchPresignedUrlRequest researchPresignedUrlRequest, String str, int i, String str2, String str3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = researchPresignedUrlRequest.did;
        }
        if ((i2 & 2) != 0) {
            i = researchPresignedUrlRequest.project_id;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = researchPresignedUrlRequest.prefix;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = researchPresignedUrlRequest.suffix;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            list = researchPresignedUrlRequest.items;
        }
        return researchPresignedUrlRequest.copy(str, i3, str4, str5, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProject_id() {
        return this.project_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    @NotNull
    public final List<ResearchPresignedUrlItem> component5() {
        return this.items;
    }

    @NotNull
    public final ResearchPresignedUrlRequest copy(@NotNull String did, int project_id, @NotNull String prefix, @NotNull String suffix, @NotNull List<ResearchPresignedUrlItem> items) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(items, "items");
        return new ResearchPresignedUrlRequest(did, project_id, prefix, suffix, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchPresignedUrlRequest)) {
            return false;
        }
        ResearchPresignedUrlRequest researchPresignedUrlRequest = (ResearchPresignedUrlRequest) other;
        return Intrinsics.areEqual(this.did, researchPresignedUrlRequest.did) && this.project_id == researchPresignedUrlRequest.project_id && Intrinsics.areEqual(this.prefix, researchPresignedUrlRequest.prefix) && Intrinsics.areEqual(this.suffix, researchPresignedUrlRequest.suffix) && Intrinsics.areEqual(this.items, researchPresignedUrlRequest.items);
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final List<ResearchPresignedUrlItem> getItems() {
        return this.items;
    }

    @NotNull
    public final String getPrefix() {
        return this.prefix;
    }

    public final int getProject_id() {
        return this.project_id;
    }

    @NotNull
    public final String getSuffix() {
        return this.suffix;
    }

    public int hashCode() {
        return (((((((this.did.hashCode() * 31) + Integer.hashCode(this.project_id)) * 31) + this.prefix.hashCode()) * 31) + this.suffix.hashCode()) * 31) + this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return "ResearchPresignedUrlRequest(did=" + this.did + ", project_id=" + this.project_id + ", prefix=" + this.prefix + ", suffix=" + this.suffix + ", items=" + this.items + ")";
    }

    public /* synthetic */ ResearchPresignedUrlRequest(String str, int i, String str2, String str3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? "sleep_wake" : str2, (i2 & 8) != 0 ? "pdf" : str3, list);
    }
}
