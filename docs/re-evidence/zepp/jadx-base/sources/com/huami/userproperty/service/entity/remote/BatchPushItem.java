package com.huami.userproperty.service.entity.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/BatchPushItem;", "", "", "component1", "component2", "key", "api", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "b", "getApi", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BatchPushItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String api;

    public BatchPushItem(@NotNull String str, @Nullable String str2) {
        this.key = str;
        this.api = str2;
    }

    public static /* synthetic */ BatchPushItem copy$default(BatchPushItem batchPushItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchPushItem.key;
        }
        if ((i & 2) != 0) {
            str2 = batchPushItem.api;
        }
        return batchPushItem.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApi() {
        return this.api;
    }

    @NotNull
    public final BatchPushItem copy(@NotNull String key, @Nullable String api) {
        return new BatchPushItem(key, api);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchPushItem)) {
            return false;
        }
        BatchPushItem batchPushItem = (BatchPushItem) other;
        return Intrinsics.areEqual(this.key, batchPushItem.key) && Intrinsics.areEqual(this.api, batchPushItem.api);
    }

    @Nullable
    public final String getApi() {
        return this.api;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        String str = this.api;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "BatchPushItem(key=" + this.key + ", api=" + ((Object) this.api) + ')';
    }

    public /* synthetic */ BatchPushItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
