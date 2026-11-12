package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"time"}, tableName = "switch_song_dao")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/SwitchSongEntity;", "", "time", "", "value", "", "isUpload", "", "extra", "<init>", "(JLjava/lang/String;ILjava/lang/String;)V", "getTime", "()J", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "()I", "setUpload", "(I)V", "getExtra", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SwitchSongEntity {

    @Nullable
    private final String extra;

    @ColumnInfo(name = "isUpload")
    private int isUpload;
    private final long time;

    @NotNull
    private String value;

    public SwitchSongEntity(long j, @NotNull String value, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.time = j;
        this.value = value;
        this.isUpload = i;
        this.extra = str;
    }

    public static /* synthetic */ SwitchSongEntity copy$default(SwitchSongEntity switchSongEntity, long j, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = switchSongEntity.time;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = switchSongEntity.value;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            i = switchSongEntity.isUpload;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = switchSongEntity.extra;
        }
        return switchSongEntity.copy(j2, str3, i3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIsUpload() {
        return this.isUpload;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final SwitchSongEntity copy(long time, @NotNull String value, int isUpload, @Nullable String extra) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new SwitchSongEntity(time, value, isUpload, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchSongEntity)) {
            return false;
        }
        SwitchSongEntity switchSongEntity = (SwitchSongEntity) other;
        return this.time == switchSongEntity.time && Intrinsics.areEqual(this.value, switchSongEntity.value) && this.isUpload == switchSongEntity.isUpload && Intrinsics.areEqual(this.extra, switchSongEntity.extra);
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.time) * 31) + this.value.hashCode()) * 31) + Integer.hashCode(this.isUpload)) * 31;
        String str = this.extra;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final int isUpload() {
        return this.isUpload;
    }

    public final void setUpload(int i) {
        this.isUpload = i;
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "SwitchSongEntity(time=" + this.time + ", value=" + this.value + ", isUpload=" + this.isUpload + ", extra=" + this.extra + ")";
    }

    public /* synthetic */ SwitchSongEntity(long j, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str2);
    }
}
