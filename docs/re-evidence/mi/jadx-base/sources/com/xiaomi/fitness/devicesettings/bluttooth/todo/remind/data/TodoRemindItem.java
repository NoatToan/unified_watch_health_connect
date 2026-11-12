package com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.data;

import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003Jg\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001J\u0013\u00106\u001a\u00020\u00072\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u0011\u0010+\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010\u001a¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;", "Ljava/io/Serializable;", "id", "", "source", "status", "remindEnable", "", "repeatMode", MiuiCursorConstants.CONTENT, "", "remindTimeSecond", "", "customDayStr", "updateTimeSecond", "<init>", "(IIIZILjava/lang/String;JLjava/lang/String;J)V", "getId", "()I", "setId", "(I)V", "getSource", "setSource", "getStatus", "setStatus", "getRemindEnable", "()Z", "setRemindEnable", "(Z)V", "getRepeatMode", "setRepeatMode", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getRemindTimeSecond", "()J", "setRemindTimeSecond", "(J)V", "getCustomDayStr", "setCustomDayStr", "getUpdateTimeSecond", "setUpdateTimeSecond", "isFinish", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TodoRemindItem implements Serializable {

    @Nullable
    private String content;

    @Nullable
    private String customDayStr;
    private int id;
    private boolean remindEnable;
    private long remindTimeSecond;
    private int repeatMode;
    private int source;
    private int status;
    private long updateTimeSecond;

    public TodoRemindItem() {
        this(0, 0, 0, false, 0, null, 0L, null, 0L, 511, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getRemindEnable() {
        return this.remindEnable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRepeatMode() {
        return this.repeatMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getRemindTimeSecond() {
        return this.remindTimeSecond;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCustomDayStr() {
        return this.customDayStr;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getUpdateTimeSecond() {
        return this.updateTimeSecond;
    }

    @NotNull
    public final TodoRemindItem copy(int id, int source, int status, boolean remindEnable, int repeatMode, @Nullable String content, long remindTimeSecond, @Nullable String customDayStr, long updateTimeSecond) {
        return new TodoRemindItem(id, source, status, remindEnable, repeatMode, content, remindTimeSecond, customDayStr, updateTimeSecond);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TodoRemindItem)) {
            return false;
        }
        TodoRemindItem todoRemindItem = (TodoRemindItem) other;
        return this.id == todoRemindItem.id && this.source == todoRemindItem.source && this.status == todoRemindItem.status && this.remindEnable == todoRemindItem.remindEnable && this.repeatMode == todoRemindItem.repeatMode && Intrinsics.areEqual(this.content, todoRemindItem.content) && this.remindTimeSecond == todoRemindItem.remindTimeSecond && Intrinsics.areEqual(this.customDayStr, todoRemindItem.customDayStr) && this.updateTimeSecond == todoRemindItem.updateTimeSecond;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getCustomDayStr() {
        return this.customDayStr;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getRemindEnable() {
        return this.remindEnable;
    }

    public final long getRemindTimeSecond() {
        return this.remindTimeSecond;
    }

    public final int getRepeatMode() {
        return this.repeatMode;
    }

    public final int getSource() {
        return this.source;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getUpdateTimeSecond() {
        return this.updateTimeSecond;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.source)) * 31) + Integer.hashCode(this.status)) * 31) + Boolean.hashCode(this.remindEnable)) * 31) + Integer.hashCode(this.repeatMode)) * 31;
        String str = this.content;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.remindTimeSecond)) * 31;
        String str2 = this.customDayStr;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.updateTimeSecond);
    }

    public final boolean isFinish() {
        return this.status == 2;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setCustomDayStr(@Nullable String str) {
        this.customDayStr = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setRemindEnable(boolean z) {
        this.remindEnable = z;
    }

    public final void setRemindTimeSecond(long j) {
        this.remindTimeSecond = j;
    }

    public final void setRepeatMode(int i) {
        this.repeatMode = i;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setUpdateTimeSecond(long j) {
        this.updateTimeSecond = j;
    }

    @NotNull
    public String toString() {
        return "TodoRemindItem(id=" + this.id + ", source=" + this.source + ", status=" + this.status + ", remindEnable=" + this.remindEnable + ", repeatMode=" + this.repeatMode + ", content=" + this.content + ", remindTimeSecond=" + this.remindTimeSecond + ", customDayStr=" + this.customDayStr + ", updateTimeSecond=" + this.updateTimeSecond + ")";
    }

    public TodoRemindItem(int i, int i2, int i3, boolean z, int i4, @Nullable String str, long j, @Nullable String str2, long j2) {
        this.id = i;
        this.source = i2;
        this.status = i3;
        this.remindEnable = z;
        this.repeatMode = i4;
        this.content = str;
        this.remindTimeSecond = j;
        this.customDayStr = str2;
        this.updateTimeSecond = j2;
    }

    public /* synthetic */ TodoRemindItem(int i, int i2, int i3, boolean z, int i4, String str, long j, String str2, long j2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? -1 : i, (i5 & 2) != 0 ? 2 : i2, (i5 & 4) != 0 ? 1 : i3, (i5 & 8) != 0 ? false : z, (i5 & 16) == 0 ? i4 : 0, (i5 & 32) != 0 ? null : str, (i5 & 64) != 0 ? -1L : j, (i5 & 128) == 0 ? str2 : null, (i5 & 256) == 0 ? j2 : -1L);
    }
}
