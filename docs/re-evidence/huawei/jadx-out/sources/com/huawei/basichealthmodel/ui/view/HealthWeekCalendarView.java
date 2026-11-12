package com.huawei.basichealthmodel.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.callback.DateSelectListener;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.cbg;
import defpackage.lrd;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes23.dex */
public class HealthWeekCalendarView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5375c;
    private HealthTextView d;
    private int e;
    private final SparseArray<View> f;
    private boolean g;
    private int h;
    private boolean i;
    private SparseArray<View> j;
    private DateSelectListener k;
    private SparseArray<HealthTextView> l;
    private SparseArray<String> m;
    private int n;
    private SparseIntArray o;
    private final String[] r;
    private String[] s;

    public HealthWeekCalendarView(Context context) {
        this(context, null);
    }

    public HealthWeekCalendarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public HealthWeekCalendarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new SparseArray<>();
        this.o = new SparseIntArray();
        this.f = new SparseArray<>(7);
        this.l = new SparseArray<>();
        this.j = new SparseArray<>();
        this.s = new String[]{qre.f(R.string.IDS_report_sunday), qre.f(R.string.IDS_report_monday), qre.f(R.string.IDS_report_thuesday), qre.f(R.string.IDS_report_wedesday), qre.f(R.string.IDS_report_thursday), qre.f(R.string.IDS_report_friday), qre.f(R.string.IDS_report_saturday)};
        this.r = new String[]{qre.f(R.string.IDS_sunday), qre.f(R.string.IDS_monday), qre.f(R.string.IDS_tuesday), qre.f(R.string.IDS_wednesday), qre.f(R.string.IDS_thursday), qre.f(R.string.IDS_friday), qre.f(R.string.IDS_saturday)};
        this.f5375c = true;
        this.i = true;
        c();
        e();
    }

    public void setHeaderViewCanShow(boolean z) {
        this.i = z;
    }

    public void setClickAble(boolean z) {
        this.f5375c = z;
    }

    public void setListener(DateSelectListener dateSelectListener) {
        this.k = dateSelectListener;
    }

    public void setSparseArrayStrDate(SparseArray<String> sparseArray) {
        this.m = sparseArray;
    }

    public void setCountPageNumber(int i) {
        this.e = i;
        this.m = cbg.a(i);
        this.o = cbg.c(this.e);
        a();
    }

    public void setSparseArrayIntDate(SparseIntArray sparseIntArray) {
        this.o = sparseIntArray;
        a();
    }

    private void e() {
        HealthTextView healthTextView = this.d;
        if (healthTextView == null) {
            ReleaseLogUtil.d("HL_HealthWeekCalendarView", "initData mHeaderDataTextView is null");
            return;
        }
        healthTextView.setText(UnitUtil.a(cbg.o(), 22));
        int iU = cbg.u();
        this.f5373a = iU;
        this.f5374b = iU;
        this.m = cbg.a(0);
        this.o = cbg.c(0);
        a();
        int iR = cbg.r();
        this.h = iR;
        if (iR == 0) {
            this.h = DateFormatUtil.a(System.currentTimeMillis());
        }
        this.g = LanguageUtil.f(BaseApplication.b());
    }

    private void c() {
        View viewA = qre.a(BaseApplication.b(), R.layout.item_week_calendar_header_view, this);
        if (viewA == null) {
            LogUtil.j("HL_HealthWeekCalendarView", "initView view is null");
        } else {
            a(viewA);
        }
    }

    private void a(View view) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.header_date_view);
        this.d = healthTextView;
        cbg.d(healthTextView, com.huawei.ui.commonui.R.dimen.health_common_14dp, 1.2f);
        setWeekCalendarLayout(view);
    }

    private void setWeekCalendarLayout(View view) {
        this.f.put(2, view.findViewById(R.id.week_day_layout_monday));
        this.f.put(3, view.findViewById(R.id.week_day_layout_thuesday));
        this.f.put(4, view.findViewById(R.id.week_day_layout_wedesday));
        this.f.put(5, view.findViewById(R.id.week_day_layout_thursday));
        this.f.put(6, view.findViewById(R.id.week_day_layout_friday));
        this.f.put(7, view.findViewById(R.id.week_day_layout_saturday));
        this.f.put(1, view.findViewById(R.id.week_day_layout_sunday));
        this.l.put(2, (HealthTextView) view.findViewById(R.id.week_day_monday));
        this.l.put(3, (HealthTextView) view.findViewById(R.id.week_day_tuesday));
        this.l.put(4, (HealthTextView) view.findViewById(R.id.week_day_wednesday));
        this.l.put(5, (HealthTextView) view.findViewById(R.id.week_day_thursday));
        this.l.put(6, (HealthTextView) view.findViewById(R.id.week_day_friday));
        this.l.put(7, (HealthTextView) view.findViewById(R.id.week_day_saturday));
        this.l.put(1, (HealthTextView) view.findViewById(R.id.week_day_sunday));
        this.j.put(2, view.findViewById(R.id.week_day_line_monday));
        this.j.put(3, view.findViewById(R.id.week_day_line_thuesday));
        this.j.put(4, view.findViewById(R.id.week_day_line_wedesday));
        this.j.put(5, view.findViewById(R.id.week_day_line_thursday));
        this.j.put(6, view.findViewById(R.id.week_day_line_friday));
        this.j.put(7, view.findViewById(R.id.week_day_line_saturday));
        this.j.put(1, view.findViewById(R.id.week_day_line_sunday));
        view.findViewById(R.id.week_day_layout_monday).setOnClickListener(this);
        view.findViewById(R.id.week_day_layout_thuesday).setOnClickListener(this);
        view.findViewById(R.id.week_day_layout_wedesday).setOnClickListener(this);
        view.findViewById(R.id.week_day_layout_thursday).setOnClickListener(this);
        view.findViewById(R.id.week_day_layout_friday).setOnClickListener(this);
        view.findViewById(R.id.week_day_layout_saturday).setOnClickListener(this);
        view.findViewById(R.id.week_day_layout_sunday).setOnClickListener(this);
    }

    private void d(int i) {
        SparseIntArray sparseIntArray;
        this.d.setText(this.m.get(i));
        LogUtil.j("HL_HealthWeekCalendarView", "updateHeaderDataView tv = ", this.m.get(i));
        if (this.k == null || (sparseIntArray = this.o) == null) {
            return;
        }
        int size = sparseIntArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = this.o.keyAt(i2);
            if (this.o.get(iKeyAt) == i) {
                this.k.loadDayDataCallback(iKeyAt);
                return;
            }
        }
    }

    private void h() {
        int i = this.o.get(this.h);
        int i2 = this.f5373a;
        if (i > i2) {
            HealthTextView healthTextView = this.l.get(i2);
            if (healthTextView != null) {
                healthTextView.setTypeface(qrr.g());
                healthTextView.setTextColor(qre.e(com.huawei.ui.commonui.R.color.textColorSecondary));
                setAccessibilitySelected(false);
            }
            View view = this.j.get(this.f5373a);
            if (view != null) {
                view.setVisibility(4);
            }
            this.f5373a = i;
        }
        this.d.setText(this.m.get(this.f5373a));
        HealthTextView healthTextView2 = this.l.get(this.f5373a);
        View view2 = this.j.get(this.f5373a);
        e(healthTextView2, view2);
        if (view2 == null) {
            ReleaseLogUtil.d("HL_HealthWeekCalendarView", "smoothToMaxLeft lineView is null");
        } else {
            view2.setVisibility(0);
        }
    }

    private void e(HealthTextView healthTextView, View view) {
        if (healthTextView == null || view == null) {
            return;
        }
        healthTextView.setTypeface(qrr.e());
        healthTextView.setTextColor(getResources().getColor(com.huawei.ui.commonui.R.color.colorAccent));
        setAccessibilitySelected(true);
        if (TextUtils.isEmpty(healthTextView.getText())) {
            return;
        }
        String string = healthTextView.getText().toString();
        Rect rect = new Rect();
        healthTextView.getPaint().getTextBounds(string, 0, string.length(), rect);
        int iWidth = rect.width();
        if (iWidth > qrs.d(BaseApplication.b(), 16.0f)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = iWidth;
            view.setLayoutParams(layoutParams);
        }
    }

    public void b(boolean z) {
        this.d.setVisibility(this.i ? 0 : 8);
        this.d.setText(this.m.get(this.f5373a));
        if (z) {
            return;
        }
        LogUtil.a("HL_HealthWeekCalendarView", "updateWeekViewWithData is not NowWeek");
        this.j.get(this.f5373a).setVisibility(4);
        HealthTextView healthTextView = this.l.get(this.f5373a);
        healthTextView.setTypeface(qrr.g());
        healthTextView.setTextColor(getResources().getColor(com.huawei.ui.commonui.R.color.textColorSecondary));
        setAccessibilitySelected(false);
        int i = this.f5373a - 1;
        if (i >= 0) {
            String[] strArr = this.s;
            if (i <= strArr.length - 1) {
                healthTextView.setText(strArr[i]);
            }
        }
    }

    public void d() {
        j();
        n();
        f();
    }

    private void n() {
        if (this.e == 0) {
            l();
        } else {
            i();
        }
    }

    private void j() {
        HealthTextView healthTextView = this.d;
        if (healthTextView == null) {
            ReleaseLogUtil.d("HL_HealthWeekCalendarView", "setHeaderDataTextView mHeaderDataTextView is null");
            return;
        }
        healthTextView.setVisibility(this.i ? 0 : 8);
        if (this.e == 0) {
            g();
        }
        this.d.setText(this.m.get(this.f5373a));
    }

    private void i() {
        HealthTextView healthTextView = this.l.get(this.f5374b);
        int i = this.f5374b - 1;
        if (i >= 0) {
            String[] strArr = this.s;
            if (i <= strArr.length - 1) {
                healthTextView.setText(strArr[i]);
            }
        }
        if (this.o.get(this.h) > 0) {
            h();
            return;
        }
        HealthTextView healthTextView2 = this.l.get(this.f5373a);
        int i2 = this.f5373a - 1;
        if (i2 >= 0) {
            String[] strArr2 = this.s;
            if (i2 <= strArr2.length - 1 && healthTextView2 != null) {
                healthTextView2.setText(strArr2[i2]);
            }
        }
        View view = this.j.get(this.f5373a);
        e(healthTextView2, view);
        if (view == null) {
            ReleaseLogUtil.d("HL_HealthWeekCalendarView", "updateMultiPages lineView is null");
        } else {
            view.setVisibility(0);
        }
    }

    private void l() {
        HealthTextView healthTextView = this.l.get(this.f5374b);
        if (this.g && healthTextView != null) {
            healthTextView.setText(com.huawei.ui.commonui.R.string.IDS_hwh_home_group_today);
        }
        int i = this.f5373a;
        int i2 = this.f5374b;
        if (i == i2) {
            LogUtil.a("HL_HealthWeekCalendarView", "updateWeekView mIndex = mCurrentIndex ", Integer.valueOf(i2));
            View view = this.j.get(this.f5373a);
            e(healthTextView, view);
            if (view == null) {
                ReleaseLogUtil.d("HL_HealthWeekCalendarView", "updateOnePage lineView is null");
            } else {
                view.setVisibility(0);
            }
        }
    }

    private void f() {
        SparseIntArray sparseIntArray = this.o;
        if (sparseIntArray == null) {
            return;
        }
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.o.keyAt(i);
            if (this.o.get(iKeyAt) == this.f5373a) {
                this.n = iKeyAt;
                return;
            }
        }
    }

    public int getSmoothSelectDate() {
        return this.n;
    }

    private void g() {
        int i = this.f5373a;
        if (i > this.f5374b) {
            View view = this.j.get(i);
            if (view != null) {
                view.setVisibility(4);
            }
            HealthTextView healthTextView = this.l.get(this.f5373a);
            if (healthTextView != null) {
                healthTextView.setTypeface(qrr.g());
                healthTextView.setTextColor(qre.e(com.huawei.ui.commonui.R.color.textColorSecondary));
                setAccessibilitySelected(false);
            }
            this.f5373a = this.f5374b;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f5375c) {
            int id = view.getId();
            if (id == R.id.week_day_layout_monday) {
                e(2);
                return;
            }
            if (id == R.id.week_day_layout_thuesday) {
                e(3);
                return;
            }
            if (id == R.id.week_day_layout_wedesday) {
                e(4);
                return;
            }
            if (id == R.id.week_day_layout_thursday) {
                e(5);
                return;
            }
            if (id == R.id.week_day_layout_friday) {
                e(6);
                return;
            }
            if (id == R.id.week_day_layout_saturday) {
                e(7);
            } else if (id == R.id.week_day_layout_sunday) {
                e(1);
            } else {
                LogUtil.j("HL_HealthWeekCalendarView", "can not find click id");
            }
        }
    }

    public void e(int i) {
        int i2;
        LogUtil.a("HL_HealthWeekCalendarView", "notifyViewChange clicked index = ", Integer.valueOf(i));
        if (this.e == 0 && (i2 = this.f5374b) < i) {
            LogUtil.a("HL_HealthWeekCalendarView", "future date, can not clickable mCurrentIndex = ", Integer.valueOf(i2));
            return;
        }
        if (this.o.get(this.h) > 0) {
            int i3 = this.o.get(this.h);
            LogUtil.j("HL_HealthWeekCalendarView", "the beginTime index = ", Integer.valueOf(i3));
            if (i < i3) {
                LogUtil.j("HL_HealthWeekCalendarView", "past date, can not clickable index = ", Integer.valueOf(i));
                return;
            }
        }
        int i4 = this.f5373a;
        if (i4 != i) {
            this.j.get(i4).setVisibility(4);
            HealthTextView healthTextView = this.l.get(this.f5373a);
            healthTextView.setTypeface(qrr.g());
            healthTextView.setTextColor(getResources().getColor(com.huawei.ui.commonui.R.color.textColorSecondary));
            setAccessibilitySelected(false);
            this.f5373a = i;
            View view = this.j.get(i);
            HealthTextView healthTextView2 = this.l.get(i);
            if (this.e == 0) {
                if (this.f5374b == i) {
                    if (this.g) {
                        healthTextView2.setText(com.huawei.ui.commonui.R.string.IDS_hwh_home_group_today);
                    }
                    e(healthTextView2, view);
                    view.setVisibility(0);
                } else {
                    healthTextView2.setText(this.s[i - 1]);
                }
            }
            d(i);
        }
        HealthTextView healthTextView3 = this.l.get(i);
        View view2 = this.j.get(i);
        e(healthTextView3, view2);
        view2.setVisibility(0);
    }

    private void a() {
        SparseIntArray sparseIntArray = this.o;
        if (sparseIntArray == null || this.r == null) {
            ReleaseLogUtil.d("HL_HealthWeekCalendarView", "initAccessibility mSparseArrayIntDate ", sparseIntArray, " mWeekNameContentDescription ", this.r);
            return;
        }
        int size = sparseIntArray.size();
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        int length = this.r.length;
        String strF = qre.f(com.huawei.ui.commonui.R.string.IDS_hwh_home_group_today);
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.o.keyAt(i);
            View view = this.f.get(this.o.get(iKeyAt));
            lrd.c(view, iKeyAt <= iA ? 1 : 2);
            if (iKeyAt == iA && this.g) {
                lrd.d(view, strF, this.f5375c);
            } else if (i < length) {
                lrd.d(view, this.r[i], this.f5375c);
            }
        }
    }

    private void setAccessibilitySelected(boolean z) {
        CharSequence text;
        if (this.f5375c) {
            if (this.f == null) {
                ReleaseLogUtil.d("HL_HealthWeekCalendarView", "setAccessibilitySelected mLayoutArray is null");
                return;
            }
            CharSequence[] charSequenceArr = this.r;
            if (charSequenceArr == null || (this.g && this.e == 0 && this.f5374b == this.f5373a)) {
                HealthTextView healthTextView = this.l.get(this.f5373a);
                if (healthTextView == null) {
                    ReleaseLogUtil.d("HL_HealthWeekCalendarView", "setAccessibilitySelected textView is null");
                    return;
                }
                text = healthTextView.getText();
            } else {
                int i = this.f5373a - 1;
                if (i < 0 || i >= charSequenceArr.length) {
                    ReleaseLogUtil.d("HL_HealthWeekCalendarView", "setAccessibilitySelected index ", Integer.valueOf(i), " mWeekNameContentDescription ", charSequenceArr);
                    return;
                }
                text = charSequenceArr[i];
            }
            b();
            View view = this.f.get(this.f5373a);
            if (z) {
                lrd.e(view, text, true, false, null);
            } else {
                lrd.c(view, text, true);
            }
        }
    }

    private void b() {
        SparseArray<View> sparseArray = this.f;
        if (sparseArray == null || this.r == null) {
            ReleaseLogUtil.d("HL_HealthWeekCalendarView", "resetAccessibilitySelected mLayoutArray ", sparseArray, " mWeekNameContentDescription ", this.r);
            return;
        }
        int size = sparseArray.size();
        int length = this.r.length;
        boolean z = this.g && this.e == 0;
        String strF = qre.f(com.huawei.ui.commonui.R.string.IDS_hwh_home_group_today);
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.f.keyAt(i);
            View view = this.f.get(iKeyAt);
            if (z && this.f5374b == iKeyAt) {
                lrd.c(view, (CharSequence) strF, false);
            } else if (length != 0 && i < length) {
                lrd.c(view, (CharSequence) this.r[i], false);
            }
        }
    }
}
