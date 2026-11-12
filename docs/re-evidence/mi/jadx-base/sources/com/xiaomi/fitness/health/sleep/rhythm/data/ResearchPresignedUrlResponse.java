package com.xiaomi.fitness.health.sleep.rhythm.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/data/ResearchPresignedUrlResponse;", "", "url", "", "bucket_name", "obj_name", "method", "expires_time", "", "time", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getUrl", "()Ljava/lang/String;", "getBucket_name", "getObj_name", "getMethod", "getExpires_time", "()J", "getTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResearchPresignedUrlResponse {

    @SerializedName("bucket_name")
    @NotNull
    private final String bucket_name;

    @SerializedName("expires_time")
    private final long expires_time;

    @SerializedName("method")
    @NotNull
    private final String method;

    @SerializedName("obj_name")
    @NotNull
    private final String obj_name;

    @SerializedName("time")
    private final long time;

    @SerializedName("url")
    @NotNull
    private final String url;

    public ResearchPresignedUrlResponse(@NotNull String url, @NotNull String bucket_name, @NotNull String obj_name, @NotNull String method, long j, long j2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bucket_name, "bucket_name");
        Intrinsics.checkNotNullParameter(obj_name, "obj_name");
        Intrinsics.checkNotNullParameter(method, "method");
        this.url = url;
        this.bucket_name = bucket_name;
        this.obj_name = obj_name;
        this.method = method;
        this.expires_time = j;
        this.time = j2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBucket_name() {
        return this.bucket_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getObj_name() {
        return this.obj_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getExpires_time() {
        return this.expires_time;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final ResearchPresignedUrlResponse copy(@NotNull String url, @NotNull String bucket_name, @NotNull String obj_name, @NotNull String method, long expires_time, long time) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bucket_name, "bucket_name");
        Intrinsics.checkNotNullParameter(obj_name, "obj_name");
        Intrinsics.checkNotNullParameter(method, "method");
        return new ResearchPresignedUrlResponse(url, bucket_name, obj_name, method, expires_time, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchPresignedUrlResponse)) {
            return false;
        }
        ResearchPresignedUrlResponse researchPresignedUrlResponse = (ResearchPresignedUrlResponse) other;
        return Intrinsics.areEqual(this.url, researchPresignedUrlResponse.url) && Intrinsics.areEqual(this.bucket_name, researchPresignedUrlResponse.bucket_name) && Intrinsics.areEqual(this.obj_name, researchPresignedUrlResponse.obj_name) && Intrinsics.areEqual(this.method, researchPresignedUrlResponse.method) && this.expires_time == researchPresignedUrlResponse.expires_time && this.time == researchPresignedUrlResponse.time;
    }

    @NotNull
    public final String getBucket_name() {
        return this.bucket_name;
    }

    public final long getExpires_time() {
        return this.expires_time;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final String getObj_name() {
        return this.obj_name;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((this.url.hashCode() * 31) + this.bucket_name.hashCode()) * 31) + this.obj_name.hashCode()) * 31) + this.method.hashCode()) * 31) + Long.hashCode(this.expires_time)) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "ResearchPresignedUrlResponse(url=" + this.url + ", bucket_name=" + this.bucket_name + ", obj_name=" + this.obj_name + ", method=" + this.method + ", expires_time=" + this.expires_time + ", time=" + this.time + ")";
    }
}
