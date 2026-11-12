package com.xiaomi.fitness.watch.face.request;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceUserAction;", "", "userId", "", "icon", "", "name", "type", "", "create", "current", "<init>", "(JLjava/lang/String;Ljava/lang/String;IJJ)V", "getUserId", "()J", "getIcon", "()Ljava/lang/String;", "getName", "getType", "()I", "getCreate", "getCurrent", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceUserAction {

    @SerializedName(MiuiCursorConstants.CREATE_TIME)
    private final long create;

    @SerializedName("current_time")
    private final long current;

    @SerializedName("user_icon")
    @Nullable
    private final String icon;

    @SerializedName("user_nick_name")
    @Nullable
    private final String name;

    @SerializedName("action_type")
    private final int type;

    @SerializedName("user_id")
    private final long userId;

    public FaceUserAction(long j, @Nullable String str, @Nullable String str2, int i, long j2, long j3) {
        this.userId = j;
        this.icon = str;
        this.name = str2;
        this.type = i;
        this.create = j2;
        this.current = j3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCreate() {
        return this.create;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCurrent() {
        return this.current;
    }

    @NotNull
    public final FaceUserAction copy(long userId, @Nullable String icon, @Nullable String name, int type, long create, long current) {
        return new FaceUserAction(userId, icon, name, type, create, current);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceUserAction)) {
            return false;
        }
        FaceUserAction faceUserAction = (FaceUserAction) other;
        return this.userId == faceUserAction.userId && Intrinsics.areEqual(this.icon, faceUserAction.icon) && Intrinsics.areEqual(this.name, faceUserAction.name) && this.type == faceUserAction.type && this.create == faceUserAction.create && this.current == faceUserAction.current;
    }

    public final long getCreate() {
        return this.create;
    }

    public final long getCurrent() {
        return this.current;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.userId) * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31) + Long.hashCode(this.create)) * 31) + Long.hashCode(this.current);
    }

    @NotNull
    public String toString() {
        return "FaceUserAction(userId=" + this.userId + ", icon=" + this.icon + ", name=" + this.name + ", type=" + this.type + ", create=" + this.create + ", current=" + this.current + ")";
    }
}
