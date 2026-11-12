package com.huami.message.dto;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003JS\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u000f\u0010\u001c¨\u0006$"}, d2 = {"Lcom/huami/message/dto/Profile;", "", "", "component1", "Lkotlin/Function0;", "component2", "component3", "", "component4", "", "component5", "userId", WebAPI.PARAM_SHARE_INVITE_AVATAR, "nickname", "age", "isMale", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "Lkotlin/jvm/functions/Function0;", "getAvatar", "()Lkotlin/jvm/functions/Function0;", "c", "getNickname", GoogleApiAvailabilityLight.a, "getAge", "e", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Profile {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<String> avatar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<String> nickname;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<Integer> age;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<Boolean> isMale;

    public Profile(@NotNull String str, @NotNull Function0<String> function0, @NotNull Function0<String> function1, @NotNull Function0<Integer> function2, @NotNull Function0<Boolean> function3) {
        this.userId = str;
        this.avatar = function0;
        this.nickname = function1;
        this.age = function2;
        this.isMale = function3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Profile copy$default(Profile profile, String str, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profile.userId;
        }
        if ((i & 2) != 0) {
            function0 = profile.avatar;
        }
        Function0 function4 = function0;
        if ((i & 4) != 0) {
            function1 = profile.nickname;
        }
        Function0 function5 = function1;
        if ((i & 8) != 0) {
            function2 = profile.age;
        }
        Function0 function6 = function2;
        if ((i & 16) != 0) {
            function3 = profile.isMale;
        }
        return profile.copy(str, function4, function5, function6, function3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final Function0<String> component2() {
        return this.avatar;
    }

    @NotNull
    public final Function0<String> component3() {
        return this.nickname;
    }

    @NotNull
    public final Function0<Integer> component4() {
        return this.age;
    }

    @NotNull
    public final Function0<Boolean> component5() {
        return this.isMale;
    }

    @NotNull
    public final Profile copy(@NotNull String userId, @NotNull Function0<String> avatar, @NotNull Function0<String> nickname, @NotNull Function0<Integer> age, @NotNull Function0<Boolean> isMale) {
        return new Profile(userId, avatar, nickname, age, isMale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) other;
        return Intrinsics.areEqual(this.userId, profile.userId) && Intrinsics.areEqual(this.avatar, profile.avatar) && Intrinsics.areEqual(this.nickname, profile.nickname) && Intrinsics.areEqual(this.age, profile.age) && Intrinsics.areEqual(this.isMale, profile.isMale);
    }

    @NotNull
    public final Function0<Integer> getAge() {
        return this.age;
    }

    @NotNull
    public final Function0<String> getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final Function0<String> getNickname() {
        return this.nickname;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((this.userId.hashCode() * 31) + this.avatar.hashCode()) * 31) + this.nickname.hashCode()) * 31) + this.age.hashCode()) * 31) + this.isMale.hashCode();
    }

    @NotNull
    public final Function0<Boolean> isMale() {
        return this.isMale;
    }

    @NotNull
    public String toString() {
        return "Profile(userId=" + this.userId + ", avatar=" + this.avatar + ", nickname=" + this.nickname + ", age=" + this.age + ", isMale=" + this.isMale + ')';
    }
}
