package com.huami.calendarview;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseWeekView extends BaseView {
    public BaseWeekView(Context context) {
        super(context);
    }

    @Override // com.huami.calendarview.BaseView
    public void e() {
        List<Calendar> list = this.c;
        if (list == null) {
            return;
        }
        if (list.contains(this.a.j())) {
            Iterator<Calendar> it2 = this.c.iterator();
            while (it2.hasNext()) {
                it2.next().setCurrentDay(false);
            }
            this.c.get(this.c.indexOf(this.a.j())).setCurrentDay(true);
        }
        invalidate();
    }

    public Calendar getIndex() {
        int iG = ((int) (this.d - this.a.g())) / this.mItemWidth;
        if (iG >= 7) {
            iG = 6;
        }
        int i = ((((int) this.e) / this.mItemHeight) * 7) + iG;
        if (i < 0 || i >= this.c.size()) {
            return null;
        }
        return this.c.get(i);
    }

    public final int h(boolean z) {
        for (int i = 0; i < this.c.size(); i++) {
            boolean zIsInRange = isInRange(this.c.get(i));
            if (z && zIsInRange) {
                return i;
            }
            if (!z && !zIsInRange) {
                return i - 1;
            }
        }
        return z ? 6 : 0;
    }

    public final boolean i(Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(this.a.z(), this.a.B() - 1, this.a.A());
        long timeInMillis = calendar2.getTimeInMillis();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        return calendar2.getTimeInMillis() < timeInMillis;
    }

    public final void j(Calendar calendar, boolean z) {
        List<Calendar> list;
        c cVar;
        CalendarView.OnYearChangeListener onYearChangeListener;
        if (this.b == null || this.a.v0 == null || (list = this.c) == null || list.size() == 0) {
            return;
        }
        int iX = b.x(calendar, this.a.U());
        if (this.c.contains(this.a.j())) {
            iX = b.x(this.a.j(), this.a.U());
        }
        Calendar calendar2 = this.c.get(iX);
        if (this.a.L() != 0) {
            if (this.c.contains(this.a.B0)) {
                calendar2 = this.a.B0;
            } else {
                this.g = -1;
            }
        }
        if (!isInRange(calendar2)) {
            iX = h(i(calendar2));
            calendar2 = this.c.get(iX);
        }
        calendar2.setCurrentDay(calendar2.equals(this.a.j()));
        this.a.v0.b(calendar2, false);
        this.b.w(b.v(calendar2, this.a.U()));
        c cVar2 = this.a;
        if (cVar2.r0 != null && z && cVar2.L() == 0) {
            this.a.r0.onCalendarSelect(calendar2, false);
        }
        this.b.u();
        if (this.a.L() == 0) {
            this.g = iX;
        }
        c cVar3 = this.a;
        if (!cVar3.X && cVar3.C0 != null && calendar.getYear() != this.a.C0.getYear() && (onYearChangeListener = (cVar = this.a).w0) != null) {
            onYearChangeListener.onYearChange(cVar.C0.getYear());
        }
        this.a.C0 = calendar2;
        invalidate();
    }

    public final void k() {
        invalidate();
    }

    public final void l() {
        if (this.c.contains(this.a.B0)) {
            return;
        }
        this.g = -1;
        invalidate();
    }

    public final void m() {
        Calendar calendarF = b.f(this.a.z(), this.a.B(), this.a.A(), ((Integer) getTag()).intValue() + 1, this.a.U());
        setSelectedCalendar(this.a.B0);
        setup(calendarF);
    }

    @Override // com.huami.calendarview.BaseView
    public void onDestroy() {
    }

    public void onLoopStart(int i) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.mItemHeight, 1073741824));
    }

    @Override // com.huami.calendarview.BaseView
    public void onPreviewHook() {
    }

    public final void setSelectedCalendar(Calendar calendar) {
        if (this.a.L() != 1 || calendar.equals(this.a.B0)) {
            this.g = this.c.indexOf(calendar);
        }
    }

    public final void setup(Calendar calendar) {
        c cVar = this.a;
        this.c = b.A(calendar, cVar, cVar.U());
        a();
        invalidate();
    }
}
