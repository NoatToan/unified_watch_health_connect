package com.huami.pai.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/pai/dto/HttpUserInfo;", "", "", "component1", "component2", "", "component3", "", "component4", "component5", "userId", "token", "createdTime", "age", "gender", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "getToken", "c", "J", "getCreatedTime", "()J", GoogleApiAvailabilityLight.a, LogUtil.I, "getAge", "()I", "e", "getGender", "<init>", "(Ljava/lang/String;Ljava/lang/String;JII)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HttpUserInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long createdTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int age;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int gender;

    public HttpUserInfo(@NotNull String str, @NotNull String str2, long j, int i, int i2) {
        this.userId = str;
        this.token = str2;
        this.createdTime = j;
        this.age = i;
        this.gender = i2;
    }

    public static /* synthetic */ HttpUserInfo copy$default(HttpUserInfo httpUserInfo, String str, String str2, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = httpUserInfo.userId;
        }
        if ((i3 & 2) != 0) {
            str2 = httpUserInfo.token;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            j = httpUserInfo.createdTime;
        }
        long j2 = j;
        if ((i3 & 8) != 0) {
            i = httpUserInfo.age;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = httpUserInfo.gender;
        }
        return httpUserInfo.copy(str, str3, j2, i4, i2);
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCreatedTime() {
        return this.createdTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    @NotNull
    public final HttpUserInfo copy(@NotNull String userId, @NotNull String token, long createdTime, int age, int gender) {
        return new HttpUserInfo(userId, token, createdTime, age, gender);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpUserInfo)) {
            return false;
        }
        HttpUserInfo httpUserInfo = (HttpUserInfo) other;
        return Intrinsics.areEqual(this.userId, httpUserInfo.userId) && Intrinsics.areEqual(this.token, httpUserInfo.token) && this.createdTime == httpUserInfo.createdTime && this.age == httpUserInfo.age && this.gender == httpUserInfo.gender;
    }

    public final int getAge() {
        return this.age;
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    public final int getGender() {
        return this.gender;
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
        return (((((((this.userId.hashCode() * 31) + this.token.hashCode()) * 31) + b.a(this.createdTime)) * 31) + this.age) * 31) + this.gender;
    }

    @NotNull
    public String toString() {
        return "HttpUserInfo(userId=" + this.userId + ", token=" + this.token + ", createdTime=" + this.createdTime + ", age=" + this.age + ", gender=" + this.gender + ")";
    }

    public /* synthetic */ HttpUserInfo(String str, String str2, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? HttpUserInfoKt.DEFAULT_CREATED_TIME : j, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }
}
