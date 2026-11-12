package com.huawei.ui.commonui.calendarview;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.lrd;
import defpackage.qjj;
import defpackage.qjo;
import defpackage.qre;
import defpackage.qrs;
import defpackage.xde;
import defpackage.xfs;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class HealthMultiCalendarView extends FrameLayout {
    private static final String e = "HealthMultiCalendarView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthWeekBar f23342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MarkDateTrigger f23343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthMonthRecyclerView f23344c;
    private final qjo d;

    public HealthMultiCalendarView(Context context) {
        this(context, null);
    }

    public HealthMultiCalendarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.healthMultiCalendarViewStyle);
    }

    public HealthMultiCalendarView(Context context, AttributeSet attributeSet, int i) {
        super(b(context, i), attributeSet, i);
        this.d = new qjo(context, attributeSet, i, R.style.Widget_Emui_HealthMultiCalendarView);
        e(super.getContext());
    }

    private static Context b(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HealthMultiCalendarView);
    }

    private void e(Context context) {
        LayoutInflater.from(context).inflate(R.layout.health_multi_calendar_view, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameContent);
        HealthMonthRecyclerView healthMonthRecyclerView = (HealthMonthRecyclerView) frameLayout.findViewById(R.id.list);
        this.f23344c = healthMonthRecyclerView;
        healthMonthRecyclerView.d(this.d);
        e(frameLayout);
        this.d.d = new HealthCalendarView.OnInnerDateSelectedListener() { // from class: com.huawei.ui.commonui.calendarview.HealthMultiCalendarView.5
            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnInnerDateSelectedListener
            public void onWeekDateSelected(HealthCalendar healthCalendar, boolean z) {
            }

            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnInnerDateSelectedListener
            public void onMonthDateSelected(HealthCalendar healthCalendar, boolean z) {
                if (z) {
                    HealthMultiCalendarView.this.d.o = healthCalendar;
                    HealthMultiCalendarView.this.f23344c.getAdapter().notifyDataSetChanged();
                }
            }
        };
        if (a(this.d.s())) {
            qjo qjoVar = this.d;
            qjoVar.o = qjoVar.b();
        } else {
            qjo qjoVar2 = this.d;
            qjoVar2.o = qjoVar2.r();
        }
        this.f23344c.c();
        e();
    }

    private void e() {
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.title);
        healthTextView.setText(R.string.IDS_select_time);
        lrd.b(healthTextView, qre.f(R.string.IDS_select_time));
        if (qrs.v()) {
            healthTextView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.health_common_28dp));
        }
        ((HealthTextView) findViewById(R.id.icon)).setText(xde.b(getCurCanlendar().getDay()));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.icon_parent);
        lrd.b(viewGroup, qre.a(R.string.IDS_two_parts, UnitUtil.e(getCurCanlendar().transformCalendar(), 8), qre.f(R.string.IDS_detail_sleep_bottom_btu_day_txt)));
        boolean z = !b() || this.d.s().hasMark();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setEnabled(z);
        }
        viewGroup.setEnabled(z);
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.calendarview.HealthMultiCalendarView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HealthMultiCalendarView.this.a(true, true);
            }
        });
    }

    private void e(FrameLayout frameLayout) {
        try {
            this.f23342a = (HealthWeekBar) this.d.z().getConstructor(Context.class).newInstance(getContext());
        } catch (IllegalAccessException unused) {
            Log.e(e, "IllegalAccessException in reflect call HealthWeekBar constructor");
        } catch (InstantiationException unused2) {
            Log.e(e, "InstantiationException in reflect call HealthWeekBar constructor");
        } catch (NoSuchMethodException unused3) {
            Log.e(e, "NoSuchMethodException in reflect call HealthWeekBar constructor");
        } catch (InvocationTargetException unused4) {
            Log.e(e, "InvocationTargetException in reflect call HealthWeekBar constructor");
        }
        if (this.f23342a == null) {
            this.f23342a = new HealthWeekBar(getContext());
        }
        frameLayout.addView(this.f23342a, 1, new ViewGroup.LayoutParams(-1, -2));
        this.f23342a.a(this.d);
        this.f23342a.b(this.d.aa());
        HealthWeekBar healthWeekBar = this.f23342a;
        healthWeekBar.measure(healthWeekBar.getMeasuredWidthAndState(), 0);
        int measuredHeight = this.f23342a.getMeasuredHeight();
        if (this.d.ab() == measuredHeight || !(this.f23344c.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return;
        }
        this.d.f(measuredHeight);
        ((FrameLayout.LayoutParams) this.f23344c.getLayoutParams()).setMargins(0, measuredHeight + getResources().getDimensionPixelSize(R.dimen.health_calendarview_week_line_height), 0, 0);
    }

    public void setSelectedThemeColor(int i) {
        this.d.j(i);
    }

    public void setSelectedMarkerSize(int i) {
        this.d.n(i);
    }

    public void setItemVerticalSpace(int i) {
        this.d.e(i);
    }

    public void setRange(HealthCalendar healthCalendar, HealthCalendar healthCalendar2) {
        if (healthCalendar.compareTo(healthCalendar2) > 0) {
            return;
        }
        this.d.b(healthCalendar, healthCalendar2);
        if (!a(this.d.o)) {
            qjo qjoVar = this.d;
            qjoVar.o = qjoVar.r();
        }
        this.f23344c.e();
    }

    public HealthCalendar getCurCanlendar() {
        return this.d.s();
    }

    public void a(boolean z, boolean z2) {
        HealthCalendar healthCalendarS = this.d.s();
        setSelectedCalendar(healthCalendarS);
        c(healthCalendarS, z, true);
        if (!z2 || !this.d.am() || healthCalendarS.hasMark() || this.f23343b == null) {
            return;
        }
        c(healthCalendarS, z);
    }

    public void c(HealthCalendar healthCalendar, boolean z, boolean z2) {
        if (healthCalendar.isAvailable() && a(healthCalendar)) {
            this.f23344c.c(healthCalendar, z, z2);
            if (this.d.f46319b == null || !z2) {
                return;
            }
            this.d.f46319b.onCalendarSelect(healthCalendar, false);
        }
    }

    private void c(HealthCalendar healthCalendar, boolean z) {
        LogUtil.a(e, "retrieveMarkAndJump, presentDay: ", healthCalendar);
        this.f23343b.retrieveMarkDate(qjj.d(healthCalendar), qjj.e(healthCalendar), new d(healthCalendar, this.d));
    }

    /* JADX INFO: loaded from: classes43.dex */
    static class d extends UiCallback<Map<String, HealthCalendar>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthCalendar f23345a;
        private WeakReference<qjo> d;

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
        }

        d(HealthCalendar healthCalendar, qjo qjoVar) {
            this.f23345a = healthCalendar;
            this.d = new WeakReference<>(qjoVar);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Map<String, HealthCalendar> map) {
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.commonui.calendarview.HealthMultiCalendarView.d.3
                @Override // java.lang.Runnable
                public void run() {
                    Map map2 = map;
                    HealthCalendar healthCalendar = map2 != null ? (HealthCalendar) map2.get(d.this.f23345a.toString()) : null;
                    LogUtil.a(HealthMultiCalendarView.e, "get present day with marks: ", healthCalendar);
                    qjo qjoVar = (qjo) d.this.d.get();
                    if (healthCalendar == null || qjoVar == null || qjoVar.f46319b == null) {
                        return;
                    }
                    qjoVar.f46319b.onCalendarSelect(healthCalendar, true);
                }
            });
        }
    }

    public void d(HealthCalendar healthCalendar) {
        c(healthCalendar, false, true);
    }

    public void a() {
        HealthCalendar healthCalendar = this.d.o;
        if (healthCalendar.isAvailable() && a(healthCalendar)) {
            healthCalendar.setPresentDay(healthCalendar.equals(this.d.s()));
            c(this.d.o, false, true);
            if (this.d.d != null) {
                this.d.d.onMonthDateSelected(healthCalendar, false);
            }
        }
    }

    public void setOnCalendarSelectListener(HealthCalendarView.OnCalendarSelectListener onCalendarSelectListener) {
        this.d.f46319b = onCalendarSelectListener;
        if (this.d.f46319b == null) {
            return;
        }
        a(this.d.o);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        if (this.d == null) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putSerializable("selected_calendar", this.d.o);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Serializable serializable = bundle.getSerializable("selected_calendar");
            if (serializable instanceof HealthCalendar) {
                this.d.o = (HealthCalendar) serializable;
            }
            if (this.d.f46319b != null) {
                this.d.f46319b.onCalendarSelect(this.d.o, false);
            }
            if (this.d.o != null) {
                d(this.d.o);
            }
            super.onRestoreInstanceState(bundle.getParcelable("super"));
        }
    }

    public void setWeekStart(int i) {
        if ((i == 1 || i == 2 || i == 7) && i != this.d.aa()) {
            this.d.m(i);
            this.f23342a.b(i);
            c();
        }
    }

    private void c() {
        this.f23344c.getAdapter().notifyDataSetChanged();
    }

    public HealthCalendar getSelectedCalendar() {
        return this.d.o;
    }

    public void setSelectedCalendar(HealthCalendar healthCalendar) {
        this.d.o = healthCalendar;
        this.f23344c.getAdapter().notifyDataSetChanged();
    }

    protected final boolean a(HealthCalendar healthCalendar) {
        qjo qjoVar = this.d;
        return qjoVar != null && qjj.e(healthCalendar, qjoVar);
    }

    public void setIsSetGrayUnmarkedDate(boolean z) {
        this.d.a(z);
    }

    public boolean b() {
        return this.d.am();
    }

    public void setIsShowFutureDate(boolean z) {
        this.d.f(z);
    }

    public void setExtraSpace(int i) {
        this.d.a(i);
    }

    public void setLastExtraSpace(int i) {
        this.d.c(i);
    }

    public void setMarkDateTrigger(MarkDateTrigger markDateTrigger) {
        this.f23343b = markDateTrigger;
        this.f23344c.setMarkDateTrigger(markDateTrigger);
    }

    public void setMarkerViewClickable(boolean z) {
        this.d.h(z);
    }
}
