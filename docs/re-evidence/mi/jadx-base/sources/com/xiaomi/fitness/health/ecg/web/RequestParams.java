package com.xiaomi.fitness.health.ecg.web;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/web/RequestParams;", "", "scopeList", "", "", "<init>", "(Ljava/util/List;)V", "getScopeList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RequestParams {

    @SerializedName("scopeList")
    @NotNull
    private final List<Integer> scopeList;

    public RequestParams(@NotNull List<Integer> scopeList) {
        Intrinsics.checkNotNullParameter(scopeList, "scopeList");
        this.scopeList = scopeList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestParams copy$default(RequestParams requestParams, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = requestParams.scopeList;
        }
        return requestParams.copy(list);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.scopeList;
    }

    @NotNull
    public final RequestParams copy(@NotNull List<Integer> scopeList) {
        Intrinsics.checkNotNullParameter(scopeList, "scopeList");
        return new RequestParams(scopeList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestParams) && Intrinsics.areEqual(this.scopeList, ((RequestParams) other).scopeList);
    }

    @NotNull
    public final List<Integer> getScopeList() {
        return this.scopeList;
    }

    public int hashCode() {
        return this.scopeList.hashCode();
    }

    @NotNull
    public String toString() {
        return "RequestParams(scopeList=" + this.scopeList + ")";
    }
}
