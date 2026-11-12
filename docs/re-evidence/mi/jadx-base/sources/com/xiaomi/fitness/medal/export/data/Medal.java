package com.xiaomi.fitness.medal.export.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/medal/export/data/Medal;", "", "icon", "", "id", "", "name", "medalType", "medalClass", "", "medalGotTime", "condition", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IJLjava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getId", "()J", "getName", "getMedalType", "getMedalClass", "()I", "getMedalGotTime", "getCondition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "medal-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Medal {

    @SerializedName("condition")
    @NotNull
    private final String condition;

    @SerializedName("icon")
    @NotNull
    private final String icon;

    @SerializedName("id")
    private final long id;

    @SerializedName("medalClass")
    private final int medalClass;

    @SerializedName("gotTime")
    private final long medalGotTime;

    @SerializedName("medalType")
    @NotNull
    private final String medalType;

    @SerializedName("name")
    @NotNull
    private final String name;

    public Medal(@NotNull String icon, long j, @NotNull String name, @NotNull String medalType, int i, long j2, @NotNull String condition) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(medalType, "medalType");
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.icon = icon;
        this.id = j;
        this.name = name;
        this.medalType = medalType;
        this.medalClass = i;
        this.medalGotTime = j2;
        this.condition = condition;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMedalType() {
        return this.medalType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMedalClass() {
        return this.medalClass;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getMedalGotTime() {
        return this.medalGotTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCondition() {
        return this.condition;
    }

    @NotNull
    public final Medal copy(@NotNull String icon, long id, @NotNull String name, @NotNull String medalType, int medalClass, long medalGotTime, @NotNull String condition) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(medalType, "medalType");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return new Medal(icon, id, name, medalType, medalClass, medalGotTime, condition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Medal)) {
            return false;
        }
        Medal medal = (Medal) other;
        return Intrinsics.areEqual(this.icon, medal.icon) && this.id == medal.id && Intrinsics.areEqual(this.name, medal.name) && Intrinsics.areEqual(this.medalType, medal.medalType) && this.medalClass == medal.medalClass && this.medalGotTime == medal.medalGotTime && Intrinsics.areEqual(this.condition, medal.condition);
    }

    @NotNull
    public final String getCondition() {
        return this.condition;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.id;
    }

    public final int getMedalClass() {
        return this.medalClass;
    }

    public final long getMedalGotTime() {
        return this.medalGotTime;
    }

    @NotNull
    public final String getMedalType() {
        return this.medalType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((((((this.icon.hashCode() * 31) + Long.hashCode(this.id)) * 31) + this.name.hashCode()) * 31) + this.medalType.hashCode()) * 31) + Integer.hashCode(this.medalClass)) * 31) + Long.hashCode(this.medalGotTime)) * 31) + this.condition.hashCode();
    }

    @NotNull
    public String toString() {
        return "Medal(icon=" + this.icon + ", id=" + this.id + ", name=" + this.name + ", medalType=" + this.medalType + ", medalClass=" + this.medalClass + ", medalGotTime=" + this.medalGotTime + ", condition=" + this.condition + ")";
    }
}
