package com.huami.femalehealth.uilib.widget.calendar;

import android.content.Context;
import android.util.AttributeSet;
import com.huami.calendarview.CalendarView;
import com.huami.femalehealth.uilib.helper.RTLHelper;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014¨\u0006\u0010"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/RTLCalendarView;", "Lcom/huami/calendarview/CalendarView;", "", z.j, "", "rtl", "", "getDefaultMinYear", "getDefaultMaxYear", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class RTLCalendarView extends CalendarView {
    public RTLCalendarView(@NotNull Context context) {
        this(context, null);
    }

    private final void j() {
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.calendarview.CalendarView
    public int getDefaultMaxYear() {
        return FemaleHealthCalendarViewKt.getYEAR_MAX();
    }

    @Override // com.huami.calendarview.CalendarView
    public int getDefaultMinYear() {
        return 2019;
    }

    @Override // com.huami.calendarview.CalendarView
    public boolean rtl() {
        return RTLHelper.INSTANCE.isRTL(getContext());
    }

    public RTLCalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        j();
    }
}
