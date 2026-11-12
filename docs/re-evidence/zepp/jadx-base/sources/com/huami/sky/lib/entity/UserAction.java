package com.huami.sky.lib.entity;

import com.huami.sky.lib.constant.UserActionEnum;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/sky/lib/entity/UserAction;", "", "", "component1", "Lcom/huami/sky/lib/constant/UserActionEnum;", "component2", "", "component3", "id", "type", "time", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/huami/sky/lib/constant/UserActionEnum;", "getType", "()Lcom/huami/sky/lib/constant/UserActionEnum;", "J", "getTime", "()J", "<init>", "(Ljava/lang/String;Lcom/huami/sky/lib/constant/UserActionEnum;J)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserAction {

    @NotNull
    private final String id;
    private final long time;

    @NotNull
    private final UserActionEnum type;

    public UserAction(@NotNull String str, @NotNull UserActionEnum userActionEnum, long j) {
        this.id = str;
        this.type = userActionEnum;
        this.time = j;
    }

    public static /* synthetic */ UserAction copy$default(UserAction userAction, String str, UserActionEnum userActionEnum, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userAction.id;
        }
        if ((i & 2) != 0) {
            userActionEnum = userAction.type;
        }
        if ((i & 4) != 0) {
            j = userAction.time;
        }
        return userAction.copy(str, userActionEnum, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserActionEnum getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final UserAction copy(@NotNull String id, @NotNull UserActionEnum type, long time) {
        return new UserAction(id, type, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAction)) {
            return false;
        }
        UserAction userAction = (UserAction) other;
        return Intrinsics.areEqual(this.id, userAction.id) && this.type == userAction.type && this.time == userAction.time;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final UserActionEnum getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + b.a(this.time);
    }

    @NotNull
    public String toString() {
        return "UserAction(id=" + this.id + ", type=" + this.type + ", time=" + this.time + ")";
    }
}
