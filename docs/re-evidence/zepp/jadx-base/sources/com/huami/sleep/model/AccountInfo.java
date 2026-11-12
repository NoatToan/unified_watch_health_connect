package com.huami.sleep.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J;\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\f\u0010\u0017R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/huami/sleep/model/AccountInfo;", "", "", "component1", "component2", "", "component3", "", "component4", "", "component5", "isChina", TdmillHmFragment.ARG_IS_OVERSEA, "gender", "creatTime", "userId", "copy", "toString", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "c", LogUtil.I, "getGender", "()I", GoogleApiAvailabilityLight.a, "J", "getCreatTime", "()J", "e", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "<init>", "(ZZIJLjava/lang/String;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AccountInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isChina;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isOversea;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int gender;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long creatTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    public AccountInfo(boolean z, boolean z2, int i, long j, @NotNull String str) {
        this.isChina = z;
        this.isOversea = z2;
        this.gender = i;
        this.creatTime = j;
        this.userId = str;
    }

    public static /* synthetic */ AccountInfo copy$default(AccountInfo accountInfo, boolean z, boolean z2, int i, long j, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = accountInfo.isChina;
        }
        if ((i2 & 2) != 0) {
            z2 = accountInfo.isOversea;
        }
        boolean z3 = z2;
        if ((i2 & 4) != 0) {
            i = accountInfo.gender;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = accountInfo.creatTime;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            str = accountInfo.userId;
        }
        return accountInfo.copy(z, z3, i3, j2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsChina() {
        return this.isChina;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsOversea() {
        return this.isOversea;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreatTime() {
        return this.creatTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final AccountInfo copy(boolean isChina, boolean isOversea, int gender, long creatTime, @NotNull String userId) {
        return new AccountInfo(isChina, isOversea, gender, creatTime, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountInfo)) {
            return false;
        }
        AccountInfo accountInfo = (AccountInfo) other;
        return this.isChina == accountInfo.isChina && this.isOversea == accountInfo.isOversea && this.gender == accountInfo.gender && this.creatTime == accountInfo.creatTime && Intrinsics.areEqual(this.userId, accountInfo.userId);
    }

    public final long getCreatTime() {
        return this.creatTime;
    }

    public final int getGender() {
        return this.gender;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        boolean z = this.isChina;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isOversea;
        return ((((((i + (z2 ? 1 : z2)) * 31) + this.gender) * 31) + b.a(this.creatTime)) * 31) + this.userId.hashCode();
    }

    public final boolean isChina() {
        return this.isChina;
    }

    public final boolean isOversea() {
        return this.isOversea;
    }

    @NotNull
    public String toString() {
        return "AccountInfo(isChina=" + this.isChina + ", isOversea=" + this.isOversea + ", gender=" + this.gender + ", creatTime=" + this.creatTime + ", userId=" + this.userId + ")";
    }
}
