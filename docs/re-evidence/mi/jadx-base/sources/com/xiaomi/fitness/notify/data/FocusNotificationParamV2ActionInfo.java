package com.xiaomi.fitness.notify.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2ActionInfo;", "", "actionIcon", "", "actionTitle", "actionTitleColor", "actionBgColor", "actionIntentType", "", "actionIntent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getActionIcon", "()Ljava/lang/String;", "getActionTitle", "getActionTitleColor", "getActionBgColor", "getActionIntentType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActionIntent", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2ActionInfo;", "equals", "", "other", "hashCode", "toString", "notify-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FocusNotificationParamV2ActionInfo {

    @Nullable
    private final String actionBgColor;

    @Nullable
    private final String actionIcon;

    @Nullable
    private final String actionIntent;

    @Nullable
    private final Integer actionIntentType;

    @Nullable
    private final String actionTitle;

    @Nullable
    private final String actionTitleColor;

    public FocusNotificationParamV2ActionInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable String str5) {
        this.actionIcon = str;
        this.actionTitle = str2;
        this.actionTitleColor = str3;
        this.actionBgColor = str4;
        this.actionIntentType = num;
        this.actionIntent = str5;
    }

    public static /* synthetic */ FocusNotificationParamV2ActionInfo copy$default(FocusNotificationParamV2ActionInfo focusNotificationParamV2ActionInfo, String str, String str2, String str3, String str4, Integer num, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = focusNotificationParamV2ActionInfo.actionIcon;
        }
        if ((i & 2) != 0) {
            str2 = focusNotificationParamV2ActionInfo.actionTitle;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = focusNotificationParamV2ActionInfo.actionTitleColor;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = focusNotificationParamV2ActionInfo.actionBgColor;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            num = focusNotificationParamV2ActionInfo.actionIntentType;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            str5 = focusNotificationParamV2ActionInfo.actionIntent;
        }
        return focusNotificationParamV2ActionInfo.copy(str, str6, str7, str8, num2, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActionIcon() {
        return this.actionIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getActionTitleColor() {
        return this.actionTitleColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActionBgColor() {
        return this.actionBgColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getActionIntentType() {
        return this.actionIntentType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getActionIntent() {
        return this.actionIntent;
    }

    @NotNull
    public final FocusNotificationParamV2ActionInfo copy(@Nullable String actionIcon, @Nullable String actionTitle, @Nullable String actionTitleColor, @Nullable String actionBgColor, @Nullable Integer actionIntentType, @Nullable String actionIntent) {
        return new FocusNotificationParamV2ActionInfo(actionIcon, actionTitle, actionTitleColor, actionBgColor, actionIntentType, actionIntent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FocusNotificationParamV2ActionInfo)) {
            return false;
        }
        FocusNotificationParamV2ActionInfo focusNotificationParamV2ActionInfo = (FocusNotificationParamV2ActionInfo) other;
        return Intrinsics.areEqual(this.actionIcon, focusNotificationParamV2ActionInfo.actionIcon) && Intrinsics.areEqual(this.actionTitle, focusNotificationParamV2ActionInfo.actionTitle) && Intrinsics.areEqual(this.actionTitleColor, focusNotificationParamV2ActionInfo.actionTitleColor) && Intrinsics.areEqual(this.actionBgColor, focusNotificationParamV2ActionInfo.actionBgColor) && Intrinsics.areEqual(this.actionIntentType, focusNotificationParamV2ActionInfo.actionIntentType) && Intrinsics.areEqual(this.actionIntent, focusNotificationParamV2ActionInfo.actionIntent);
    }

    @Nullable
    public final String getActionBgColor() {
        return this.actionBgColor;
    }

    @Nullable
    public final String getActionIcon() {
        return this.actionIcon;
    }

    @Nullable
    public final String getActionIntent() {
        return this.actionIntent;
    }

    @Nullable
    public final Integer getActionIntentType() {
        return this.actionIntentType;
    }

    @Nullable
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @Nullable
    public final String getActionTitleColor() {
        return this.actionTitleColor;
    }

    public int hashCode() {
        String str = this.actionIcon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionTitleColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionBgColor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.actionIntentType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.actionIntent;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FocusNotificationParamV2ActionInfo(actionIcon=" + this.actionIcon + ", actionTitle=" + this.actionTitle + ", actionTitleColor=" + this.actionTitleColor + ", actionBgColor=" + this.actionBgColor + ", actionIntentType=" + this.actionIntentType + ", actionIntent=" + this.actionIntent + ")";
    }
}
