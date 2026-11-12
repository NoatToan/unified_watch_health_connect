package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/GetRelativeListResult;", "", "relativeUserList", "", "Lcom/xiaomi/fitness/relative/server/model/RelativeUserInfo;", "<init>", "(Ljava/util/List;)V", "getRelativeUserList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetRelativeListResult {

    @SerializedName("relative_list")
    @Nullable
    private final List<RelativeUserInfo> relativeUserList;

    public GetRelativeListResult(@Nullable List<RelativeUserInfo> list) {
        this.relativeUserList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetRelativeListResult copy$default(GetRelativeListResult getRelativeListResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getRelativeListResult.relativeUserList;
        }
        return getRelativeListResult.copy(list);
    }

    @Nullable
    public final List<RelativeUserInfo> component1() {
        return this.relativeUserList;
    }

    @NotNull
    public final GetRelativeListResult copy(@Nullable List<RelativeUserInfo> relativeUserList) {
        return new GetRelativeListResult(relativeUserList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetRelativeListResult) && Intrinsics.areEqual(this.relativeUserList, ((GetRelativeListResult) other).relativeUserList);
    }

    @Nullable
    public final List<RelativeUserInfo> getRelativeUserList() {
        return this.relativeUserList;
    }

    public int hashCode() {
        List<RelativeUserInfo> list = this.relativeUserList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetRelativeListResult(relativeUserList=" + this.relativeUserList + ")";
    }
}
