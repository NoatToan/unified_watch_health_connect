package com.huami.bodymeasurements.temperature.model.koin.data;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/koin/data/TempUserInfo;", "", "", "component1", "Ljava/util/Date;", "component2", "userId", "registerDate", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "Ljava/util/Date;", "getRegisterDate", "()Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TempUserInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date registerDate;

    public TempUserInfo(@NotNull String str, @NotNull Date date) {
        this.userId = str;
        this.registerDate = date;
    }

    public static /* synthetic */ TempUserInfo copy$default(TempUserInfo tempUserInfo, String str, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tempUserInfo.userId;
        }
        if ((i & 2) != 0) {
            date = tempUserInfo.registerDate;
        }
        return tempUserInfo.copy(str, date);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getRegisterDate() {
        return this.registerDate;
    }

    @NotNull
    public final TempUserInfo copy(@NotNull String userId, @NotNull Date registerDate) {
        return new TempUserInfo(userId, registerDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TempUserInfo)) {
            return false;
        }
        TempUserInfo tempUserInfo = (TempUserInfo) other;
        return Intrinsics.areEqual(this.userId, tempUserInfo.userId) && Intrinsics.areEqual(this.registerDate, tempUserInfo.registerDate);
    }

    @NotNull
    public final Date getRegisterDate() {
        return this.registerDate;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (this.userId.hashCode() * 31) + this.registerDate.hashCode();
    }

    @NotNull
    public String toString() {
        return "TempUserInfo(userId=" + this.userId + ", registerDate=" + this.registerDate + ')';
    }
}
