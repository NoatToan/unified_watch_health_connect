package com.xiaomi.fitness.devicesettings.bluttooth.todo.miui;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/SubTodoList;", "", "title", "", "subTodoEntities", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/SubTodoEntity;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getSubTodoEntities", "()Ljava/util/List;", "setSubTodoEntities", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SubTodoList {

    @SerializedName("subTodoEntities")
    @Nullable
    private List<SubTodoEntity> subTodoEntities;

    @SerializedName("title")
    @Nullable
    private String title;

    /* JADX WARN: Multi-variable type inference failed */
    public SubTodoList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubTodoList copy$default(SubTodoList subTodoList, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subTodoList.title;
        }
        if ((i & 2) != 0) {
            list = subTodoList.subTodoEntities;
        }
        return subTodoList.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final List<SubTodoEntity> component2() {
        return this.subTodoEntities;
    }

    @NotNull
    public final SubTodoList copy(@Nullable String title, @Nullable List<SubTodoEntity> subTodoEntities) {
        return new SubTodoList(title, subTodoEntities);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubTodoList)) {
            return false;
        }
        SubTodoList subTodoList = (SubTodoList) other;
        return Intrinsics.areEqual(this.title, subTodoList.title) && Intrinsics.areEqual(this.subTodoEntities, subTodoList.subTodoEntities);
    }

    @Nullable
    public final List<SubTodoEntity> getSubTodoEntities() {
        return this.subTodoEntities;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SubTodoEntity> list = this.subTodoEntities;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setSubTodoEntities(@Nullable List<SubTodoEntity> list) {
        this.subTodoEntities = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "SubTodoList(title=" + this.title + ", subTodoEntities=" + this.subTodoEntities + ")";
    }

    public SubTodoList(@Nullable String str, @Nullable List<SubTodoEntity> list) {
        this.title = str;
        this.subTodoEntities = list;
    }

    public /* synthetic */ SubTodoList(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
