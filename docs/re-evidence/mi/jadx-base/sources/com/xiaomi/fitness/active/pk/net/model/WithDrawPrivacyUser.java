package com.xiaomi.fitness.active.pk.net.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/active/pk/net/model/WithDrawPrivacyUser;", "", "nickName", "", "ids", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getNickName", "()Ljava/lang/String;", "getIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WithDrawPrivacyUser {

    @SerializedName("pk_record_ids")
    @Nullable
    private final List<Long> ids;

    @SerializedName("nick_name")
    @Nullable
    private final String nickName;

    public WithDrawPrivacyUser(@Nullable String str, @Nullable List<Long> list) {
        this.nickName = str;
        this.ids = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithDrawPrivacyUser copy$default(WithDrawPrivacyUser withDrawPrivacyUser, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = withDrawPrivacyUser.nickName;
        }
        if ((i & 2) != 0) {
            list = withDrawPrivacyUser.ids;
        }
        return withDrawPrivacyUser.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final List<Long> component2() {
        return this.ids;
    }

    @NotNull
    public final WithDrawPrivacyUser copy(@Nullable String nickName, @Nullable List<Long> ids) {
        return new WithDrawPrivacyUser(nickName, ids);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithDrawPrivacyUser)) {
            return false;
        }
        WithDrawPrivacyUser withDrawPrivacyUser = (WithDrawPrivacyUser) other;
        return Intrinsics.areEqual(this.nickName, withDrawPrivacyUser.nickName) && Intrinsics.areEqual(this.ids, withDrawPrivacyUser.ids);
    }

    @Nullable
    public final List<Long> getIds() {
        return this.ids;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    public int hashCode() {
        String str = this.nickName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Long> list = this.ids;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WithDrawPrivacyUser(nickName=" + this.nickName + ", ids=" + this.ids + ")";
    }
}
