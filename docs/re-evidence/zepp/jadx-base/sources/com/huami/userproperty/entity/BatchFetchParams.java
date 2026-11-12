package com.huami.userproperty.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0003J%\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/userproperty/entity/BatchFetchParams;", "Lcom/huami/userproperty/entity/AbsFetchParams;", "", "", "component1", "component2", "keys", "api", "copy", "toString", "", "hashCode", "", "other", "", "equals", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "e", "Ljava/lang/String;", "getApi", "()Ljava/lang/String;", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BatchFetchParams extends AbsFetchParams {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<String> keys;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String api;

    public /* synthetic */ BatchFetchParams(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchFetchParams copy$default(BatchFetchParams batchFetchParams, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = batchFetchParams.getKeys();
        }
        if ((i & 2) != 0) {
            str = batchFetchParams.getApi();
        }
        return batchFetchParams.copy(list, str);
    }

    @NotNull
    public final List<String> component1() {
        return getKeys();
    }

    @Nullable
    public final String component2() {
        return getApi();
    }

    @NotNull
    public final BatchFetchParams copy(@NotNull List<String> keys, @Nullable String api) {
        return new BatchFetchParams(keys, api);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchFetchParams)) {
            return false;
        }
        BatchFetchParams batchFetchParams = (BatchFetchParams) other;
        return Intrinsics.areEqual(getKeys(), batchFetchParams.getKeys()) && Intrinsics.areEqual(getApi(), batchFetchParams.getApi());
    }

    @Override // com.huami.userproperty.entity.AbsFetchParams
    @Nullable
    public String getApi() {
        return this.api;
    }

    @Override // com.huami.userproperty.entity.AbsFetchParams
    @NotNull
    public List<String> getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return (getKeys().hashCode() * 31) + (getApi() == null ? 0 : getApi().hashCode());
    }

    @NotNull
    public String toString() {
        return "BatchFetchParams(keys=" + getKeys() + ", api=" + ((Object) getApi()) + ')';
    }

    public BatchFetchParams(@NotNull List<String> list, @Nullable String str) {
        super(list, "BATCH", str, null);
        this.keys = list;
        this.api = str;
    }
}
