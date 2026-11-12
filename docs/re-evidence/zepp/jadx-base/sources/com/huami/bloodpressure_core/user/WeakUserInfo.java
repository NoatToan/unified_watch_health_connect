package com.huami.bloodpressure_core.user;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003JH\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b \u0010\u0019¨\u0006#"}, d2 = {"Lcom/huami/bloodpressure_core/user/WeakUserInfo;", "", "", "component1", "", "component2", "component3", "", "component4", "()Ljava/lang/Long;", "component5", "userId", "age", "gender", ParamKey.createTime, "token", "copy", "(Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;)Lcom/huami/bloodpressure_core/user/WeakUserInfo;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", LogUtil.I, "getAge", "()I", "getGender", "Ljava/lang/Long;", "getCreateTime", "getToken", "<init>", "(Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeakUserInfo {
    private final int age;

    @Nullable
    private final Long createTime;
    private final int gender;

    @Nullable
    private final String token;

    @Nullable
    private final String userId;

    public WeakUserInfo(@Nullable String str, int i, int i2, @Nullable Long l, @Nullable String str2) {
        this.userId = str;
        this.age = i;
        this.gender = i2;
        this.createTime = l;
        this.token = str2;
    }

    public static /* synthetic */ WeakUserInfo copy$default(WeakUserInfo weakUserInfo, String str, int i, int i2, Long l, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = weakUserInfo.userId;
        }
        if ((i3 & 2) != 0) {
            i = weakUserInfo.age;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = weakUserInfo.gender;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            l = weakUserInfo.createTime;
        }
        Long l2 = l;
        if ((i3 & 16) != 0) {
            str2 = weakUserInfo.token;
        }
        return weakUserInfo.copy(str, i4, i5, l2, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final WeakUserInfo copy(@Nullable String userId, int age, int gender, @Nullable Long createTime, @Nullable String token) {
        return new WeakUserInfo(userId, age, gender, createTime, token);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeakUserInfo)) {
            return false;
        }
        WeakUserInfo weakUserInfo = (WeakUserInfo) other;
        return Intrinsics.areEqual(this.userId, weakUserInfo.userId) && this.age == weakUserInfo.age && this.gender == weakUserInfo.gender && Intrinsics.areEqual(this.createTime, weakUserInfo.createTime) && Intrinsics.areEqual(this.token, weakUserInfo.token);
    }

    public final int getAge() {
        return this.age;
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    public final int getGender() {
        return this.gender;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.age) * 31) + this.gender) * 31;
        Long l = this.createTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.token;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WeakUserInfo(userId=" + this.userId + ", age=" + this.age + ", gender=" + this.gender + ", createTime=" + this.createTime + ", token=" + this.token + ")";
    }
}
