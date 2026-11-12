package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\"\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\bHÆ\u0003¢\u0006\u0002\u0010\u0013JJ\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR,\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/SportRemindSettings;", "", "name", "", "remindSwitch", "", "remindTime", "calendars", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/training_plan/net/SportRemindSettingsCalendar;", "Ljava/util/ArrayList;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;)V", "getName", "()Ljava/lang/String;", "getRemindSwitch", "()Z", "getRemindTime", "getCalendars", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;)Lcom/xiaomi/fitness/training_plan/net/SportRemindSettings;", "equals", "other", "hashCode", "", "toString", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportRemindSettings {

    @SerializedName("calendar_infos")
    @Nullable
    private final ArrayList<SportRemindSettingsCalendar> calendars;

    @SerializedName("name")
    @NotNull
    private final String name;

    @SerializedName("remind_switch")
    private final boolean remindSwitch;

    @SerializedName(MiuiCursorConstants.REMIND_TIME)
    @NotNull
    private final String remindTime;

    public SportRemindSettings(@NotNull String name, boolean z, @NotNull String remindTime, @Nullable ArrayList<SportRemindSettingsCalendar> arrayList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(remindTime, "remindTime");
        this.name = name;
        this.remindSwitch = z;
        this.remindTime = remindTime;
        this.calendars = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportRemindSettings copy$default(SportRemindSettings sportRemindSettings, String str, boolean z, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sportRemindSettings.name;
        }
        if ((i & 2) != 0) {
            z = sportRemindSettings.remindSwitch;
        }
        if ((i & 4) != 0) {
            str2 = sportRemindSettings.remindTime;
        }
        if ((i & 8) != 0) {
            arrayList = sportRemindSettings.calendars;
        }
        return sportRemindSettings.copy(str, z, str2, arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRemindSwitch() {
        return this.remindSwitch;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemindTime() {
        return this.remindTime;
    }

    @Nullable
    public final ArrayList<SportRemindSettingsCalendar> component4() {
        return this.calendars;
    }

    @NotNull
    public final SportRemindSettings copy(@NotNull String name, boolean remindSwitch, @NotNull String remindTime, @Nullable ArrayList<SportRemindSettingsCalendar> calendars) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(remindTime, "remindTime");
        return new SportRemindSettings(name, remindSwitch, remindTime, calendars);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRemindSettings)) {
            return false;
        }
        SportRemindSettings sportRemindSettings = (SportRemindSettings) other;
        return Intrinsics.areEqual(this.name, sportRemindSettings.name) && this.remindSwitch == sportRemindSettings.remindSwitch && Intrinsics.areEqual(this.remindTime, sportRemindSettings.remindTime) && Intrinsics.areEqual(this.calendars, sportRemindSettings.calendars);
    }

    @Nullable
    public final ArrayList<SportRemindSettingsCalendar> getCalendars() {
        return this.calendars;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getRemindSwitch() {
        return this.remindSwitch;
    }

    @NotNull
    public final String getRemindTime() {
        return this.remindTime;
    }

    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + Boolean.hashCode(this.remindSwitch)) * 31) + this.remindTime.hashCode()) * 31;
        ArrayList<SportRemindSettingsCalendar> arrayList = this.calendars;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    @NotNull
    public String toString() {
        return "SportRemindSettings(name=" + this.name + ", remindSwitch=" + this.remindSwitch + ", remindTime=" + this.remindTime + ", calendars=" + this.calendars + ")";
    }
}
