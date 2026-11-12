package com.huami.account.service;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/account/service/AnonymousInfo;", "", "", "component1", "component2", "component3", "userId", "token", "region", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "getToken", "c", "getRegion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AnonymousInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String region;

    public AnonymousInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.userId = str;
        this.token = str2;
        this.region = str3;
    }

    public static /* synthetic */ AnonymousInfo copy$default(AnonymousInfo anonymousInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anonymousInfo.userId;
        }
        if ((i & 2) != 0) {
            str2 = anonymousInfo.token;
        }
        if ((i & 4) != 0) {
            str3 = anonymousInfo.region;
        }
        return anonymousInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final AnonymousInfo copy(@NotNull String userId, @NotNull String token, @NotNull String region) {
        return new AnonymousInfo(userId, token, region);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnonymousInfo)) {
            return false;
        }
        AnonymousInfo anonymousInfo = (AnonymousInfo) other;
        return Intrinsics.areEqual(this.userId, anonymousInfo.userId) && Intrinsics.areEqual(this.token, anonymousInfo.token) && Intrinsics.areEqual(this.region, anonymousInfo.region);
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((this.userId.hashCode() * 31) + this.token.hashCode()) * 31) + this.region.hashCode();
    }

    @NotNull
    public String toString() {
        return "AnonymousInfo(userId=" + this.userId + ", token=" + this.token + ", region=" + this.region + ')';
    }
}
