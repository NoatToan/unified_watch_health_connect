package com.xiaomi.fitness.watch.face.request;

import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FacePaidListRequest;", "", "model", "", "limit", "", RouteRequest.KEY_NEXT_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getModel", "()Ljava/lang/String;", "getLimit", "()I", "getNext_key", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FacePaidListRequest {
    private final int limit;

    @NotNull
    private final String model;

    @NotNull
    private final String next_key;

    public FacePaidListRequest(@NotNull String model, int i, @NotNull String next_key) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(next_key, "next_key");
        this.model = model;
        this.limit = i;
        this.next_key = next_key;
    }

    public static /* synthetic */ FacePaidListRequest copy$default(FacePaidListRequest facePaidListRequest, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = facePaidListRequest.model;
        }
        if ((i2 & 2) != 0) {
            i = facePaidListRequest.limit;
        }
        if ((i2 & 4) != 0) {
            str2 = facePaidListRequest.next_key;
        }
        return facePaidListRequest.copy(str, i, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNext_key() {
        return this.next_key;
    }

    @NotNull
    public final FacePaidListRequest copy(@NotNull String model, int limit, @NotNull String next_key) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(next_key, "next_key");
        return new FacePaidListRequest(model, limit, next_key);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FacePaidListRequest)) {
            return false;
        }
        FacePaidListRequest facePaidListRequest = (FacePaidListRequest) other;
        return Intrinsics.areEqual(this.model, facePaidListRequest.model) && this.limit == facePaidListRequest.limit && Intrinsics.areEqual(this.next_key, facePaidListRequest.next_key);
    }

    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getNext_key() {
        return this.next_key;
    }

    public int hashCode() {
        return (((this.model.hashCode() * 31) + Integer.hashCode(this.limit)) * 31) + this.next_key.hashCode();
    }

    @NotNull
    public String toString() {
        return "FacePaidListRequest(model=" + this.model + ", limit=" + this.limit + ", next_key=" + this.next_key + ")";
    }
}
