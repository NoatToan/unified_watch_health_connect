package com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure.schedule;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.reminder.AdRemindParserKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003JQ\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\r\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001c\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001c\u0010\u0010\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u001c\u0010\u0011\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001b¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/bloodpressure/schedule/ScheduleBean;", "", "", "component1", "", "component2", "component3", "component4", "component5", "", "component6", "component7", "title", "allDay", "startDate", AdRemindParserKt.KEY_STOP_DATE, "loop", "remind", "note", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "Z", "getAllDay", "()Z", "c", "getStartDate", GoogleApiAvailabilityLight.a, "getStopDate", "e", "getLoop", "f", LogUtil.I, "getRemind", "()I", "g", "getNote", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ScheduleBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("allDay")
    private final boolean allDay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("startDate")
    @NotNull
    private final String startDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName(AdRemindParserKt.KEY_STOP_DATE)
    @NotNull
    private final String stopDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("loop")
    @NotNull
    private final String loop;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("remind")
    private final int remind;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("note")
    @Nullable
    private final String note;

    public ScheduleBean(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @Nullable String str5) {
        this.title = str;
        this.allDay = z;
        this.startDate = str2;
        this.stopDate = str3;
        this.loop = str4;
        this.remind = i;
        this.note = str5;
    }

    public static /* synthetic */ ScheduleBean copy$default(ScheduleBean scheduleBean, String str, boolean z, String str2, String str3, String str4, int i, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = scheduleBean.title;
        }
        if ((i2 & 2) != 0) {
            z = scheduleBean.allDay;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            str2 = scheduleBean.startDate;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = scheduleBean.stopDate;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = scheduleBean.loop;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            i = scheduleBean.remind;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            str5 = scheduleBean.note;
        }
        return scheduleBean.copy(str, z2, str6, str7, str8, i3, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAllDay() {
        return this.allDay;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStopDate() {
        return this.stopDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLoop() {
        return this.loop;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRemind() {
        return this.remind;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    @NotNull
    public final ScheduleBean copy(@NotNull String title, boolean allDay, @NotNull String startDate, @NotNull String stopDate, @NotNull String loop, int remind, @Nullable String note) {
        return new ScheduleBean(title, allDay, startDate, stopDate, loop, remind, note);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleBean)) {
            return false;
        }
        ScheduleBean scheduleBean = (ScheduleBean) other;
        return Intrinsics.areEqual(this.title, scheduleBean.title) && this.allDay == scheduleBean.allDay && Intrinsics.areEqual(this.startDate, scheduleBean.startDate) && Intrinsics.areEqual(this.stopDate, scheduleBean.stopDate) && Intrinsics.areEqual(this.loop, scheduleBean.loop) && this.remind == scheduleBean.remind && Intrinsics.areEqual(this.note, scheduleBean.note);
    }

    public final boolean getAllDay() {
        return this.allDay;
    }

    @NotNull
    public final String getLoop() {
        return this.loop;
    }

    @Nullable
    public final String getNote() {
        return this.note;
    }

    public final int getRemind() {
        return this.remind;
    }

    @NotNull
    public final String getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final String getStopDate() {
        return this.stopDate;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        boolean z = this.allDay;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((iHashCode + r1) * 31) + this.startDate.hashCode()) * 31) + this.stopDate.hashCode()) * 31) + this.loop.hashCode()) * 31) + this.remind) * 31;
        String str = this.note;
        return iHashCode2 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ScheduleBean(title=" + this.title + ", allDay=" + this.allDay + ", startDate=" + this.startDate + ", stopDate=" + this.stopDate + ", loop=" + this.loop + ", remind=" + this.remind + ", note=" + this.note + ")";
    }

    public /* synthetic */ ScheduleBean(String str, boolean z, String str2, String str3, String str4, int i, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, str3, str4, i, (i2 & 64) != 0 ? null : str5);
    }
}
