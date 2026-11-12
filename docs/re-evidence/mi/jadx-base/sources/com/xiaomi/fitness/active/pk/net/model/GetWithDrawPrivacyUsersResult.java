package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/GetWithDrawPrivacyUsersResult;", "", "list", "", "Lcom/xiaomi/fitness/active/pk/net/model/WithDrawPrivacyUser;", "<init>", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetWithDrawPrivacyUsersResult {

    @SerializedName("withdraw_privacy_detail_list")
    @Nullable
    private final List<WithDrawPrivacyUser> list;

    public GetWithDrawPrivacyUsersResult(@Nullable List<WithDrawPrivacyUser> list) {
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetWithDrawPrivacyUsersResult copy$default(GetWithDrawPrivacyUsersResult getWithDrawPrivacyUsersResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getWithDrawPrivacyUsersResult.list;
        }
        return getWithDrawPrivacyUsersResult.copy(list);
    }

    @Nullable
    public final List<WithDrawPrivacyUser> component1() {
        return this.list;
    }

    @NotNull
    public final GetWithDrawPrivacyUsersResult copy(@Nullable List<WithDrawPrivacyUser> list) {
        return new GetWithDrawPrivacyUsersResult(list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetWithDrawPrivacyUsersResult) && Intrinsics.areEqual(this.list, ((GetWithDrawPrivacyUsersResult) other).list);
    }

    @Nullable
    public final List<WithDrawPrivacyUser> getList() {
        return this.list;
    }

    public int hashCode() {
        List<WithDrawPrivacyUser> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetWithDrawPrivacyUsersResult(list=" + this.list + ")";
    }
}
