package com.example.habit.export;

import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\"\u001a\u00020\u0003H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003Jm\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/example/habit/export/Today;", "", HabitShareActivity.KEY_BIG_ICON, "", "middleIcon", "icon", "iconPad", "name", "punchTime", "Lcom/example/habit/export/PunchTime;", "smallIcon", "status", "", "type", "typeId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/habit/export/PunchTime;Ljava/lang/String;IIJ)V", "getBigIcon", "()Ljava/lang/String;", "getMiddleIcon", "getIcon", "getIconPad", "getName", "getPunchTime", "()Lcom/example/habit/export/PunchTime;", "getSmallIcon", "getStatus", "()I", "setStatus", "(I)V", "getType", "getTypeId", "()J", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "habit-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Today {

    @NotNull
    private final String bigIcon;

    @NotNull
    private final String icon;

    @NotNull
    private final String iconPad;

    @NotNull
    private final String middleIcon;

    @NotNull
    private final String name;

    @NotNull
    private final PunchTime punchTime;

    @NotNull
    private final String smallIcon;
    private int status;
    private final int type;
    private final long typeId;

    public Today(@NotNull String bigIcon, @NotNull String middleIcon, @NotNull String icon, @NotNull String iconPad, @NotNull String name, @NotNull PunchTime punchTime, @NotNull String smallIcon, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(bigIcon, "bigIcon");
        Intrinsics.checkNotNullParameter(middleIcon, "middleIcon");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconPad, "iconPad");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(punchTime, "punchTime");
        Intrinsics.checkNotNullParameter(smallIcon, "smallIcon");
        this.bigIcon = bigIcon;
        this.middleIcon = middleIcon;
        this.icon = icon;
        this.iconPad = iconPad;
        this.name = name;
        this.punchTime = punchTime;
        this.smallIcon = smallIcon;
        this.status = i;
        this.type = i2;
        this.typeId = j;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBigIcon() {
        return this.bigIcon;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getTypeId() {
        return this.typeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMiddleIcon() {
        return this.middleIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconPad() {
        return this.iconPad;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PunchTime getPunchTime() {
        return this.punchTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final Today copy(@NotNull String bigIcon, @NotNull String middleIcon, @NotNull String icon, @NotNull String iconPad, @NotNull String name, @NotNull PunchTime punchTime, @NotNull String smallIcon, int status, int type, long typeId) {
        Intrinsics.checkNotNullParameter(bigIcon, "bigIcon");
        Intrinsics.checkNotNullParameter(middleIcon, "middleIcon");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconPad, "iconPad");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(punchTime, "punchTime");
        Intrinsics.checkNotNullParameter(smallIcon, "smallIcon");
        return new Today(bigIcon, middleIcon, icon, iconPad, name, punchTime, smallIcon, status, type, typeId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Today)) {
            return false;
        }
        Today today = (Today) other;
        return Intrinsics.areEqual(this.bigIcon, today.bigIcon) && Intrinsics.areEqual(this.middleIcon, today.middleIcon) && Intrinsics.areEqual(this.icon, today.icon) && Intrinsics.areEqual(this.iconPad, today.iconPad) && Intrinsics.areEqual(this.name, today.name) && Intrinsics.areEqual(this.punchTime, today.punchTime) && Intrinsics.areEqual(this.smallIcon, today.smallIcon) && this.status == today.status && this.type == today.type && this.typeId == today.typeId;
    }

    @NotNull
    public final String getBigIcon() {
        return this.bigIcon;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getIconPad() {
        return this.iconPad;
    }

    @NotNull
    public final String getMiddleIcon() {
        return this.middleIcon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final PunchTime getPunchTime() {
        return this.punchTime;
    }

    @NotNull
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    public final long getTypeId() {
        return this.typeId;
    }

    public int hashCode() {
        return (((((((((((((((((this.bigIcon.hashCode() * 31) + this.middleIcon.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.iconPad.hashCode()) * 31) + this.name.hashCode()) * 31) + this.punchTime.hashCode()) * 31) + this.smallIcon.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.type)) * 31) + Long.hashCode(this.typeId);
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "name='" + this.name + "', status=" + this.status;
    }
}
