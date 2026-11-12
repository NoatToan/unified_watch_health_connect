package com.huami.femalehealth.logiclib.dto;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003Jw\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R!\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b\u0012\u0010!R!\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!R\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!¨\u0006-"}, d2 = {"Lcom/huami/femalehealth/logiclib/dto/Myself;", "", "", "toString", "component1", "Lkotlin/Function0;", "component2", "component3", "component4", "", "component5", "component6", "Lcom/huami/femalehealth/logiclib/dto/UserType;", "component7", "userId", "nickname", WebAPI.PARAM_SHARE_INVITE_AVATAR, "summary", "isMale", "location", "type", "copy", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "Lkotlin/jvm/functions/Function0;", "getNickname", "()Lkotlin/jvm/functions/Function0;", "c", "getAvatar", GoogleApiAvailabilityLight.a, "getSummary", "e", "f", "getLocation", "g", "getType", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Myself {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> nickname;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> avatar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> summary;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isMale;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> location;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Function0<UserType> type;

    /* JADX WARN: Multi-variable type inference failed */
    public Myself(@NotNull String str, @NotNull Function0<String> function0, @NotNull Function0<String> function1, @NotNull Function0<String> function2, @NotNull Function0<Boolean> function3, @NotNull Function0<String> function4, @NotNull Function0<? extends UserType> function5) {
        this.userId = str;
        this.nickname = function0;
        this.avatar = function1;
        this.summary = function2;
        this.isMale = function3;
        this.location = function4;
        this.type = function5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Myself copy$default(Myself myself, String str, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = myself.userId;
        }
        if ((i & 2) != 0) {
            function0 = myself.nickname;
        }
        Function0 function6 = function0;
        if ((i & 4) != 0) {
            function1 = myself.avatar;
        }
        Function0 function7 = function1;
        if ((i & 8) != 0) {
            function2 = myself.summary;
        }
        Function0 function8 = function2;
        if ((i & 16) != 0) {
            function3 = myself.isMale;
        }
        Function0 function9 = function3;
        if ((i & 32) != 0) {
            function4 = myself.location;
        }
        Function0 function10 = function4;
        if ((i & 64) != 0) {
            function5 = myself.type;
        }
        return myself.copy(str, function6, function7, function8, function9, function10, function5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final Function0<String> component2() {
        return this.nickname;
    }

    @NotNull
    public final Function0<String> component3() {
        return this.avatar;
    }

    @NotNull
    public final Function0<String> component4() {
        return this.summary;
    }

    @NotNull
    public final Function0<Boolean> component5() {
        return this.isMale;
    }

    @NotNull
    public final Function0<String> component6() {
        return this.location;
    }

    @NotNull
    public final Function0<UserType> component7() {
        return this.type;
    }

    @NotNull
    public final Myself copy(@NotNull String userId, @NotNull Function0<String> nickname, @NotNull Function0<String> avatar, @NotNull Function0<String> summary, @NotNull Function0<Boolean> isMale, @NotNull Function0<String> location, @NotNull Function0<? extends UserType> type) {
        return new Myself(userId, nickname, avatar, summary, isMale, location, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Myself)) {
            return false;
        }
        Myself myself = (Myself) other;
        return Intrinsics.areEqual(this.userId, myself.userId) && Intrinsics.areEqual(this.nickname, myself.nickname) && Intrinsics.areEqual(this.avatar, myself.avatar) && Intrinsics.areEqual(this.summary, myself.summary) && Intrinsics.areEqual(this.isMale, myself.isMale) && Intrinsics.areEqual(this.location, myself.location) && Intrinsics.areEqual(this.type, myself.type);
    }

    @NotNull
    public final Function0<String> getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final Function0<String> getLocation() {
        return this.location;
    }

    @NotNull
    public final Function0<String> getNickname() {
        return this.nickname;
    }

    @NotNull
    public final Function0<String> getSummary() {
        return this.summary;
    }

    @NotNull
    public final Function0<UserType> getType() {
        return this.type;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((this.userId.hashCode() * 31) + this.nickname.hashCode()) * 31) + this.avatar.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.isMale.hashCode()) * 31) + this.location.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public final Function0<Boolean> isMale() {
        return this.isMale;
    }

    @NotNull
    public String toString() {
        return f.trimIndent("\n                    userId: " + this.userId + "\n                    nickname: " + this.nickname.invoke() + "\n                    avatar: " + this.avatar.invoke() + "\n                    summary: " + ((Object) this.summary.invoke()) + "\n                    isMale: " + this.isMale.invoke().booleanValue() + "\n                    location: " + ((Object) this.location.invoke()) + "\n                    type: " + this.type.invoke() + "\n                ");
    }
}
