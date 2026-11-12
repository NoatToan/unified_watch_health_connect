package com.xiaomi.fitness.devicesettings.bluttooth.todo.miui;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/SubTodoEntity;", "", MiuiCursorConstants.CONTENT, "", "isFinish", "", "<init>", "(Ljava/lang/String;Z)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "()Z", "setFinish", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SubTodoEntity {

    @SerializedName(MiuiCursorConstants.CONTENT)
    @Nullable
    private String content;

    @SerializedName("isFinish")
    private boolean isFinish;

    /* JADX WARN: Multi-variable type inference failed */
    public SubTodoEntity() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SubTodoEntity copy$default(SubTodoEntity subTodoEntity, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subTodoEntity.content;
        }
        if ((i & 2) != 0) {
            z = subTodoEntity.isFinish;
        }
        return subTodoEntity.copy(str, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsFinish() {
        return this.isFinish;
    }

    @NotNull
    public final SubTodoEntity copy(@Nullable String content, boolean isFinish) {
        return new SubTodoEntity(content, isFinish);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubTodoEntity)) {
            return false;
        }
        SubTodoEntity subTodoEntity = (SubTodoEntity) other;
        return Intrinsics.areEqual(this.content, subTodoEntity.content) && this.isFinish == subTodoEntity.isFinish;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public int hashCode() {
        String str = this.content;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isFinish);
    }

    public final boolean isFinish() {
        return this.isFinish;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setFinish(boolean z) {
        this.isFinish = z;
    }

    @NotNull
    public String toString() {
        return "SubTodoEntity(content=" + this.content + ", isFinish=" + this.isFinish + ")";
    }

    public SubTodoEntity(@Nullable String str, boolean z) {
        this.content = str;
        this.isFinish = z;
    }

    public /* synthetic */ SubTodoEntity(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }
}
