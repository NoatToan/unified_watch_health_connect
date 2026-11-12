package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ,\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/InviteAuthContent;", "", "authDataTypes", "", "", "authDataTimeScope", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getAuthDataTypes", "()Ljava/util/List;", "setAuthDataTypes", "(Ljava/util/List;)V", "getAuthDataTimeScope", "()Ljava/lang/Integer;", "setAuthDataTimeScope", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/xiaomi/fitness/relative/server/model/InviteAuthContent;", "equals", "", "other", "hashCode", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InviteAuthContent {

    @SerializedName("auth_time_range")
    @Nullable
    private Integer authDataTimeScope;

    @SerializedName("auth_data")
    @Nullable
    private List<String> authDataTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public InviteAuthContent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InviteAuthContent copy$default(InviteAuthContent inviteAuthContent, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = inviteAuthContent.authDataTypes;
        }
        if ((i & 2) != 0) {
            num = inviteAuthContent.authDataTimeScope;
        }
        return inviteAuthContent.copy(list, num);
    }

    @Nullable
    public final List<String> component1() {
        return this.authDataTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAuthDataTimeScope() {
        return this.authDataTimeScope;
    }

    @NotNull
    public final InviteAuthContent copy(@Nullable List<String> authDataTypes, @DataSharedTimeScope @Nullable Integer authDataTimeScope) {
        return new InviteAuthContent(authDataTypes, authDataTimeScope);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteAuthContent)) {
            return false;
        }
        InviteAuthContent inviteAuthContent = (InviteAuthContent) other;
        return Intrinsics.areEqual(this.authDataTypes, inviteAuthContent.authDataTypes) && Intrinsics.areEqual(this.authDataTimeScope, inviteAuthContent.authDataTimeScope);
    }

    @Nullable
    public final Integer getAuthDataTimeScope() {
        return this.authDataTimeScope;
    }

    @Nullable
    public final List<String> getAuthDataTypes() {
        return this.authDataTypes;
    }

    public int hashCode() {
        List<String> list = this.authDataTypes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.authDataTimeScope;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setAuthDataTimeScope(@Nullable Integer num) {
        this.authDataTimeScope = num;
    }

    public final void setAuthDataTypes(@Nullable List<String> list) {
        this.authDataTypes = list;
    }

    @NotNull
    public String toString() {
        return "InviteAuthContent(authDataTypes=" + this.authDataTypes + ", authDataTimeScope=" + this.authDataTimeScope + ")";
    }

    public InviteAuthContent(@Nullable List<String> list, @DataSharedTimeScope @Nullable Integer num) {
        this.authDataTypes = list;
        this.authDataTimeScope = num;
    }

    public /* synthetic */ InviteAuthContent(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num);
    }
}
