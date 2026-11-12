package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/GetSharedDataTypesResult;", "", "keys", "", "", "<init>", "(Ljava/util/List;)V", "getKeys", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetSharedDataTypesResult {

    @SerializedName("keys")
    @NotNull
    private final List<String> keys;

    public GetSharedDataTypesResult(@NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        this.keys = keys;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetSharedDataTypesResult copy$default(GetSharedDataTypesResult getSharedDataTypesResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getSharedDataTypesResult.keys;
        }
        return getSharedDataTypesResult.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.keys;
    }

    @NotNull
    public final GetSharedDataTypesResult copy(@NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        return new GetSharedDataTypesResult(keys);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetSharedDataTypesResult) && Intrinsics.areEqual(this.keys, ((GetSharedDataTypesResult) other).keys);
    }

    @NotNull
    public final List<String> getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return this.keys.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetSharedDataTypesResult(keys=" + this.keys + ")";
    }
}
