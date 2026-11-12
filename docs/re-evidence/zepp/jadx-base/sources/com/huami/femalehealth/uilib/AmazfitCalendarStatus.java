package com.huami.femalehealth.uilib;

import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/femalehealth/uilib/AmazfitCalendarStatus;", "", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "component1", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "component2", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "component3", "date", "status", "vo", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "getDate", "()Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "b", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "getStatus", "()Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "c", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "getVo", "()Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<init>", "(Lcom/huami/femalehealth/logiclib/helper/DateTriple;Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AmazfitCalendarStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final DateTriple date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final CalendarPeriodStyle status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final MenstruationVo vo;

    public AmazfitCalendarStatus(@NotNull DateTriple dateTriple, @NotNull CalendarPeriodStyle calendarPeriodStyle, @Nullable MenstruationVo menstruationVo) {
        this.date = dateTriple;
        this.status = calendarPeriodStyle;
        this.vo = menstruationVo;
    }

    public static /* synthetic */ AmazfitCalendarStatus copy$default(AmazfitCalendarStatus amazfitCalendarStatus, DateTriple dateTriple, CalendarPeriodStyle calendarPeriodStyle, MenstruationVo menstruationVo, int i, Object obj) {
        if ((i & 1) != 0) {
            dateTriple = amazfitCalendarStatus.date;
        }
        if ((i & 2) != 0) {
            calendarPeriodStyle = amazfitCalendarStatus.status;
        }
        if ((i & 4) != 0) {
            menstruationVo = amazfitCalendarStatus.vo;
        }
        return amazfitCalendarStatus.copy(dateTriple, calendarPeriodStyle, menstruationVo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DateTriple getDate() {
        return this.date;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CalendarPeriodStyle getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MenstruationVo getVo() {
        return this.vo;
    }

    @NotNull
    public final AmazfitCalendarStatus copy(@NotNull DateTriple date, @NotNull CalendarPeriodStyle status, @Nullable MenstruationVo vo) {
        return new AmazfitCalendarStatus(date, status, vo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmazfitCalendarStatus)) {
            return false;
        }
        AmazfitCalendarStatus amazfitCalendarStatus = (AmazfitCalendarStatus) other;
        return Intrinsics.areEqual(this.date, amazfitCalendarStatus.date) && Intrinsics.areEqual(this.status, amazfitCalendarStatus.status) && Intrinsics.areEqual(this.vo, amazfitCalendarStatus.vo);
    }

    @NotNull
    public final DateTriple getDate() {
        return this.date;
    }

    @NotNull
    public final CalendarPeriodStyle getStatus() {
        return this.status;
    }

    @Nullable
    public final MenstruationVo getVo() {
        return this.vo;
    }

    public int hashCode() {
        int iHashCode = ((this.date.hashCode() * 31) + this.status.hashCode()) * 31;
        MenstruationVo menstruationVo = this.vo;
        return iHashCode + (menstruationVo == null ? 0 : menstruationVo.hashCode());
    }

    @NotNull
    public String toString() {
        return "AmazfitCalendarStatus(date=" + this.date + ", status=" + this.status + ", vo=" + this.vo + ')';
    }
}
