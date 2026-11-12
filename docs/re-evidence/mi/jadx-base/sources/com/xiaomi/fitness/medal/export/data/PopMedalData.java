package com.xiaomi.fitness.medal.export.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u00101\u001a\u00020\u0007H\u0016J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0010HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jµ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010D\u001a\u00020\u00102\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010.¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "", "id", "", "type", "", "name", "", "condition", "copywriting", "icon", "turnIcon", "turnName", "detailUrl", "gotTime", "got", "", "pop", "medalClass", "turnDesc", "turnId", "medalType", "detailName", "<init>", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getType", "()I", "getName", "()Ljava/lang/String;", "getCondition", "getCopywriting", "getIcon", "getTurnIcon", "getTurnName", "getDetailUrl", "getGotTime", "getGot", "()Z", "getPop", "getMedalClass", "getTurnDesc", "getTurnId", "getMedalType", "setMedalType", "(Ljava/lang/String;)V", "getDetailName", "setDetailName", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "medal-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PopMedalData {

    @NotNull
    private final String condition;

    @NotNull
    private final String copywriting;

    @Nullable
    private String detailName;

    @NotNull
    private final String detailUrl;
    private final boolean got;
    private final long gotTime;

    @NotNull
    private final String icon;
    private final long id;
    private final int medalClass;

    @NotNull
    private String medalType;

    @NotNull
    private final String name;
    private final boolean pop;

    @NotNull
    private final String turnDesc;

    @NotNull
    private final String turnIcon;
    private final long turnId;

    @NotNull
    private final String turnName;
    private final int type;

    public PopMedalData(long j, int i, @NotNull String name, @NotNull String condition, @NotNull String copywriting, @NotNull String icon, @NotNull String turnIcon, @NotNull String turnName, @NotNull String detailUrl, long j2, boolean z, boolean z2, int i2, @NotNull String turnDesc, long j3, @NotNull String medalType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(copywriting, "copywriting");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(turnIcon, "turnIcon");
        Intrinsics.checkNotNullParameter(turnName, "turnName");
        Intrinsics.checkNotNullParameter(detailUrl, "detailUrl");
        Intrinsics.checkNotNullParameter(turnDesc, "turnDesc");
        Intrinsics.checkNotNullParameter(medalType, "medalType");
        this.id = j;
        this.type = i;
        this.name = name;
        this.condition = condition;
        this.copywriting = copywriting;
        this.icon = icon;
        this.turnIcon = turnIcon;
        this.turnName = turnName;
        this.detailUrl = detailUrl;
        this.gotTime = j2;
        this.got = z;
        this.pop = z2;
        this.medalClass = i2;
        this.turnDesc = turnDesc;
        this.turnId = j3;
        this.medalType = medalType;
        this.detailName = str;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getGotTime() {
        return this.gotTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getGot() {
        return this.got;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getPop() {
        return this.pop;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getMedalClass() {
        return this.medalClass;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTurnDesc() {
        return this.turnDesc;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getTurnId() {
        return this.turnId;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMedalType() {
        return this.medalType;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDetailName() {
        return this.detailName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCondition() {
        return this.condition;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCopywriting() {
        return this.copywriting;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTurnIcon() {
        return this.turnIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTurnName() {
        return this.turnName;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    @NotNull
    public final PopMedalData copy(long id, int type, @NotNull String name, @NotNull String condition, @NotNull String copywriting, @NotNull String icon, @NotNull String turnIcon, @NotNull String turnName, @NotNull String detailUrl, long gotTime, boolean got, boolean pop, int medalClass, @NotNull String turnDesc, long turnId, @NotNull String medalType, @Nullable String detailName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(copywriting, "copywriting");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(turnIcon, "turnIcon");
        Intrinsics.checkNotNullParameter(turnName, "turnName");
        Intrinsics.checkNotNullParameter(detailUrl, "detailUrl");
        Intrinsics.checkNotNullParameter(turnDesc, "turnDesc");
        Intrinsics.checkNotNullParameter(medalType, "medalType");
        return new PopMedalData(id, type, name, condition, copywriting, icon, turnIcon, turnName, detailUrl, gotTime, got, pop, medalClass, turnDesc, turnId, medalType, detailName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopMedalData)) {
            return false;
        }
        PopMedalData popMedalData = (PopMedalData) other;
        return this.id == popMedalData.id && this.type == popMedalData.type && Intrinsics.areEqual(this.name, popMedalData.name) && Intrinsics.areEqual(this.condition, popMedalData.condition) && Intrinsics.areEqual(this.copywriting, popMedalData.copywriting) && Intrinsics.areEqual(this.icon, popMedalData.icon) && Intrinsics.areEqual(this.turnIcon, popMedalData.turnIcon) && Intrinsics.areEqual(this.turnName, popMedalData.turnName) && Intrinsics.areEqual(this.detailUrl, popMedalData.detailUrl) && this.gotTime == popMedalData.gotTime && this.got == popMedalData.got && this.pop == popMedalData.pop && this.medalClass == popMedalData.medalClass && Intrinsics.areEqual(this.turnDesc, popMedalData.turnDesc) && this.turnId == popMedalData.turnId && Intrinsics.areEqual(this.medalType, popMedalData.medalType) && Intrinsics.areEqual(this.detailName, popMedalData.detailName);
    }

    @NotNull
    public final String getCondition() {
        return this.condition;
    }

    @NotNull
    public final String getCopywriting() {
        return this.copywriting;
    }

    @Nullable
    public final String getDetailName() {
        return this.detailName;
    }

    @NotNull
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final boolean getGot() {
        return this.got;
    }

    public final long getGotTime() {
        return this.gotTime;
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

    @NotNull
    public final String getMedalType() {
        return this.medalType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getPop() {
        return this.pop;
    }

    @NotNull
    public final String getTurnDesc() {
        return this.turnDesc;
    }

    @NotNull
    public final String getTurnIcon() {
        return this.turnIcon;
    }

    public final long getTurnId() {
        return this.turnId;
    }

    @NotNull
    public final String getTurnName() {
        return this.turnName;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.type)) * 31) + this.name.hashCode()) * 31) + this.condition.hashCode()) * 31) + this.copywriting.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.turnIcon.hashCode()) * 31) + this.turnName.hashCode()) * 31) + this.detailUrl.hashCode()) * 31) + Long.hashCode(this.gotTime)) * 31) + Boolean.hashCode(this.got)) * 31) + Boolean.hashCode(this.pop)) * 31) + Integer.hashCode(this.medalClass)) * 31) + this.turnDesc.hashCode()) * 31) + Long.hashCode(this.turnId)) * 31) + this.medalType.hashCode()) * 31;
        String str = this.detailName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setDetailName(@Nullable String str) {
        this.detailName = str;
    }

    public final void setMedalType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.medalType = str;
    }

    @NotNull
    public String toString() {
        return "PopMedalData(id=" + this.id + ", type=" + this.type + ", name='" + this.name + "', condition='" + this.condition + "', copywriting='" + this.copywriting + "', icon='" + this.icon + "', turnIcon='" + this.turnIcon + "', turnName='" + this.turnName + "', detailUrl='" + this.detailUrl + "', gotTime=" + this.gotTime + ", got=" + this.got + ", pop=" + this.pop + ", medalClass=" + this.medalClass + ", turnDesc='" + this.turnDesc + "', turnId=" + this.turnId + ", medalType='" + this.medalType + "')";
    }
}
