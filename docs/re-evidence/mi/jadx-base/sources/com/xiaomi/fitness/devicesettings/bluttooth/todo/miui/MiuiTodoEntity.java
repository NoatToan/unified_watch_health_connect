package com.xiaomi.fitness.devicesettings.bluttooth.todo.miui;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010)\u001a\u00020\u0005H\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003Jm\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\u0013\u00105\u001a\u00020#2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/MiuiTodoEntity;", "", "id", "", MiuiCursorConstants.CONTENT, "", "listType", "remindType", "remindRepeatType", "remindTimeMillis", "", "finishType", "lastModifyTimeMillis", "customSortId", "createTimeMillis", "<init>", "(ILjava/lang/String;IIIJIJJJ)V", "getId", "()I", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getListType", "getRemindType", "getRemindRepeatType", "getRemindTimeMillis", "()J", "getFinishType", "getLastModifyTimeMillis", "getCustomSortId", "getCreateTimeMillis", "setCreateTimeMillis", "(J)V", "isSubTodo", "", "()Z", "getSubTodoList", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/SubTodoList;", "getGetSubTodoList", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/SubTodoList;", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MiuiTodoEntity {

    @NotNull
    private String content;
    private long createTimeMillis;
    private final long customSortId;
    private final int finishType;
    private final int id;
    private final long lastModifyTimeMillis;
    private final int listType;
    private final int remindRepeatType;
    private final long remindTimeMillis;
    private final int remindType;

    public MiuiTodoEntity(int i, @NotNull String content, int i2, int i3, int i4, long j, int i5, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = i;
        this.content = content;
        this.listType = i2;
        this.remindType = i3;
        this.remindRepeatType = i4;
        this.remindTimeMillis = j;
        this.finishType = i5;
        this.lastModifyTimeMillis = j2;
        this.customSortId = j3;
        this.createTimeMillis = j4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getCreateTimeMillis() {
        return this.createTimeMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getListType() {
        return this.listType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRemindType() {
        return this.remindType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRemindRepeatType() {
        return this.remindRepeatType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getRemindTimeMillis() {
        return this.remindTimeMillis;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getFinishType() {
        return this.finishType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getLastModifyTimeMillis() {
        return this.lastModifyTimeMillis;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getCustomSortId() {
        return this.customSortId;
    }

    @NotNull
    public final MiuiTodoEntity copy(int id, @NotNull String content, int listType, int remindType, int remindRepeatType, long remindTimeMillis, int finishType, long lastModifyTimeMillis, long customSortId, long createTimeMillis) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new MiuiTodoEntity(id, content, listType, remindType, remindRepeatType, remindTimeMillis, finishType, lastModifyTimeMillis, customSortId, createTimeMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiuiTodoEntity)) {
            return false;
        }
        MiuiTodoEntity miuiTodoEntity = (MiuiTodoEntity) other;
        return this.id == miuiTodoEntity.id && Intrinsics.areEqual(this.content, miuiTodoEntity.content) && this.listType == miuiTodoEntity.listType && this.remindType == miuiTodoEntity.remindType && this.remindRepeatType == miuiTodoEntity.remindRepeatType && this.remindTimeMillis == miuiTodoEntity.remindTimeMillis && this.finishType == miuiTodoEntity.finishType && this.lastModifyTimeMillis == miuiTodoEntity.lastModifyTimeMillis && this.customSortId == miuiTodoEntity.customSortId && this.createTimeMillis == miuiTodoEntity.createTimeMillis;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final long getCreateTimeMillis() {
        return this.createTimeMillis;
    }

    public final long getCustomSortId() {
        return this.customSortId;
    }

    public final int getFinishType() {
        return this.finishType;
    }

    @Nullable
    public final SubTodoList getGetSubTodoList() {
        if (!isSubTodo()) {
            return null;
        }
        try {
            return (SubTodoList) MiuiTodoSyncDeviceManagerKt.getMGson().fromJson(this.content, SubTodoList.class);
        } catch (Exception e) {
            Logger.i("MiuiTodoEntity", "fromJson SubTodoList exception " + e);
            return null;
        }
    }

    public final int getId() {
        return this.id;
    }

    public final long getLastModifyTimeMillis() {
        return this.lastModifyTimeMillis;
    }

    public final int getListType() {
        return this.listType;
    }

    public final int getRemindRepeatType() {
        return this.remindRepeatType;
    }

    public final long getRemindTimeMillis() {
        return this.remindTimeMillis;
    }

    public final int getRemindType() {
        return this.remindType;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.id) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.listType)) * 31) + Integer.hashCode(this.remindType)) * 31) + Integer.hashCode(this.remindRepeatType)) * 31) + Long.hashCode(this.remindTimeMillis)) * 31) + Integer.hashCode(this.finishType)) * 31) + Long.hashCode(this.lastModifyTimeMillis)) * 31) + Long.hashCode(this.customSortId)) * 31) + Long.hashCode(this.createTimeMillis);
    }

    public final boolean isSubTodo() {
        return this.listType == 1;
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final void setCreateTimeMillis(long j) {
        this.createTimeMillis = j;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.content;
        int i2 = this.listType;
        int i3 = this.remindType;
        int i4 = this.remindRepeatType;
        long j = this.remindTimeMillis;
        long j2 = 1000;
        String dateYYYYMMDDHHmmssLocalFormat = TimeDateUtil.getDateYYYYMMDDHHmmssLocalFormat(j / j2);
        int i5 = this.finishType;
        long j3 = this.lastModifyTimeMillis;
        String dateYYYYMMDDHHmmssLocalFormat2 = TimeDateUtil.getDateYYYYMMDDHHmmssLocalFormat(j3 / j2);
        long j4 = this.customSortId;
        long j5 = this.createTimeMillis;
        return "MiuiTodoEntity(id=" + i + ", content='" + str + "', listType=" + i2 + ", remindType=" + i3 + ", remindRepeatType=" + i4 + ", remindTimeMillis=" + j + " [" + dateYYYYMMDDHHmmssLocalFormat + "], finishType=" + i5 + ", lastModifyTimeMillis=" + j3 + " [" + dateYYYYMMDDHHmmssLocalFormat2 + "], customSortId=" + j4 + ", createTimeMillis=" + j5 + " [" + TimeDateUtil.getDateYYYYMMDDHHmmssLocalFormat(j5 / j2) + "])";
    }

    public /* synthetic */ MiuiTodoEntity(int i, String str, int i2, int i3, int i4, long j, int i5, long j2, long j3, long j4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0L : j, i5, j2, j3, j4);
    }
}
