package com.huami.nfc.web;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/nfc/web/UserInfo;", "", "", "component1", "component2", "miId", "miToken", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getMiId", "()Ljava/lang/String;", "b", "getMiToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String miId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String miToken;

    public UserInfo(@Nullable String str, @Nullable String str2) {
        this.miId = str;
        this.miToken = str2;
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInfo.miId;
        }
        if ((i & 2) != 0) {
            str2 = userInfo.miToken;
        }
        return userInfo.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMiId() {
        return this.miId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMiToken() {
        return this.miToken;
    }

    @NotNull
    public final UserInfo copy(@Nullable String miId, @Nullable String miToken) {
        return new UserInfo(miId, miToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return Intrinsics.areEqual(this.miId, userInfo.miId) && Intrinsics.areEqual(this.miToken, userInfo.miToken);
    }

    @Nullable
    public final String getMiId() {
        return this.miId;
    }

    @Nullable
    public final String getMiToken() {
        return this.miToken;
    }

    public int hashCode() {
        String str = this.miId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.miToken;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserInfo(miId=" + ((Object) this.miId) + ", miToken=" + ((Object) this.miToken) + ')';
    }
}
