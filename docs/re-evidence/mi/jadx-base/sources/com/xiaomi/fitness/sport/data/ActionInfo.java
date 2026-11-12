package com.xiaomi.fitness.sport.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u000bHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sport/data/ActionInfo;", "", "actionIcon", "", "actionIconDark", "actionTitle", "actionTitleColor", "actionTitleColorDark", "actionBgColor", "actionBgColorDark", "actionIntentType", "", "actionIntent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getActionIcon", "()Ljava/lang/String;", "getActionIconDark", "getActionTitle", "getActionTitleColor", "getActionTitleColorDark", "getActionBgColor", "getActionBgColorDark", "getActionIntentType", "()I", "getActionIntent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActionInfo {

    @NotNull
    private final String actionBgColor;

    @NotNull
    private final String actionBgColorDark;

    @NotNull
    private final String actionIcon;

    @NotNull
    private final String actionIconDark;

    @NotNull
    private final String actionIntent;
    private final int actionIntentType;

    @NotNull
    private final String actionTitle;

    @NotNull
    private final String actionTitleColor;

    @NotNull
    private final String actionTitleColorDark;

    public ActionInfo(@NotNull String actionIcon, @NotNull String actionIconDark, @NotNull String actionTitle, @NotNull String actionTitleColor, @NotNull String actionTitleColorDark, @NotNull String actionBgColor, @NotNull String actionBgColorDark, int i, @NotNull String actionIntent) {
        Intrinsics.checkNotNullParameter(actionIcon, "actionIcon");
        Intrinsics.checkNotNullParameter(actionIconDark, "actionIconDark");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        Intrinsics.checkNotNullParameter(actionTitleColor, "actionTitleColor");
        Intrinsics.checkNotNullParameter(actionTitleColorDark, "actionTitleColorDark");
        Intrinsics.checkNotNullParameter(actionBgColor, "actionBgColor");
        Intrinsics.checkNotNullParameter(actionBgColorDark, "actionBgColorDark");
        Intrinsics.checkNotNullParameter(actionIntent, "actionIntent");
        this.actionIcon = actionIcon;
        this.actionIconDark = actionIconDark;
        this.actionTitle = actionTitle;
        this.actionTitleColor = actionTitleColor;
        this.actionTitleColorDark = actionTitleColorDark;
        this.actionBgColor = actionBgColor;
        this.actionBgColorDark = actionBgColorDark;
        this.actionIntentType = i;
        this.actionIntent = actionIntent;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActionIcon() {
        return this.actionIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActionIconDark() {
        return this.actionIconDark;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActionTitleColor() {
        return this.actionTitleColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getActionTitleColorDark() {
        return this.actionTitleColorDark;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getActionBgColor() {
        return this.actionBgColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getActionBgColorDark() {
        return this.actionBgColorDark;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getActionIntentType() {
        return this.actionIntentType;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getActionIntent() {
        return this.actionIntent;
    }

    @NotNull
    public final ActionInfo copy(@NotNull String actionIcon, @NotNull String actionIconDark, @NotNull String actionTitle, @NotNull String actionTitleColor, @NotNull String actionTitleColorDark, @NotNull String actionBgColor, @NotNull String actionBgColorDark, int actionIntentType, @NotNull String actionIntent) {
        Intrinsics.checkNotNullParameter(actionIcon, "actionIcon");
        Intrinsics.checkNotNullParameter(actionIconDark, "actionIconDark");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        Intrinsics.checkNotNullParameter(actionTitleColor, "actionTitleColor");
        Intrinsics.checkNotNullParameter(actionTitleColorDark, "actionTitleColorDark");
        Intrinsics.checkNotNullParameter(actionBgColor, "actionBgColor");
        Intrinsics.checkNotNullParameter(actionBgColorDark, "actionBgColorDark");
        Intrinsics.checkNotNullParameter(actionIntent, "actionIntent");
        return new ActionInfo(actionIcon, actionIconDark, actionTitle, actionTitleColor, actionTitleColorDark, actionBgColor, actionBgColorDark, actionIntentType, actionIntent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionInfo)) {
            return false;
        }
        ActionInfo actionInfo = (ActionInfo) other;
        return Intrinsics.areEqual(this.actionIcon, actionInfo.actionIcon) && Intrinsics.areEqual(this.actionIconDark, actionInfo.actionIconDark) && Intrinsics.areEqual(this.actionTitle, actionInfo.actionTitle) && Intrinsics.areEqual(this.actionTitleColor, actionInfo.actionTitleColor) && Intrinsics.areEqual(this.actionTitleColorDark, actionInfo.actionTitleColorDark) && Intrinsics.areEqual(this.actionBgColor, actionInfo.actionBgColor) && Intrinsics.areEqual(this.actionBgColorDark, actionInfo.actionBgColorDark) && this.actionIntentType == actionInfo.actionIntentType && Intrinsics.areEqual(this.actionIntent, actionInfo.actionIntent);
    }

    @NotNull
    public final String getActionBgColor() {
        return this.actionBgColor;
    }

    @NotNull
    public final String getActionBgColorDark() {
        return this.actionBgColorDark;
    }

    @NotNull
    public final String getActionIcon() {
        return this.actionIcon;
    }

    @NotNull
    public final String getActionIconDark() {
        return this.actionIconDark;
    }

    @NotNull
    public final String getActionIntent() {
        return this.actionIntent;
    }

    public final int getActionIntentType() {
        return this.actionIntentType;
    }

    @NotNull
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @NotNull
    public final String getActionTitleColor() {
        return this.actionTitleColor;
    }

    @NotNull
    public final String getActionTitleColorDark() {
        return this.actionTitleColorDark;
    }

    public int hashCode() {
        return (((((((((((((((this.actionIcon.hashCode() * 31) + this.actionIconDark.hashCode()) * 31) + this.actionTitle.hashCode()) * 31) + this.actionTitleColor.hashCode()) * 31) + this.actionTitleColorDark.hashCode()) * 31) + this.actionBgColor.hashCode()) * 31) + this.actionBgColorDark.hashCode()) * 31) + Integer.hashCode(this.actionIntentType)) * 31) + this.actionIntent.hashCode();
    }

    @NotNull
    public String toString() {
        return "ActionInfo(actionIcon=" + this.actionIcon + ", actionIconDark=" + this.actionIconDark + ", actionTitle=" + this.actionTitle + ", actionTitleColor=" + this.actionTitleColor + ", actionTitleColorDark=" + this.actionTitleColorDark + ", actionBgColor=" + this.actionBgColor + ", actionBgColorDark=" + this.actionBgColorDark + ", actionIntentType=" + this.actionIntentType + ", actionIntent=" + this.actionIntent + ")";
    }
}
