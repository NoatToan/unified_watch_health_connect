package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.huawei.haf.application.BaseApplication;
import com.huawei.operation.share.ShareConfig;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarView;
import com.huawei.ui.commonui.calendarview.HealthDefaultMonthView;
import com.huawei.ui.commonui.calendarview.HealthDefaultWeekView;
import com.huawei.ui.commonui.calendarview.HealthMark;
import com.huawei.ui.commonui.calendarview.HealthWeekBar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class qjo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HealthCalendar f46318a;
    private boolean ab;
    private boolean ad;
    private boolean ae;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private boolean an;
    private HealthCalendar ao;
    private int ap;
    private HealthCalendar aq;
    private boolean as;
    private String at;
    private int au;
    private HealthCalendar av;
    private int aw;
    private Class<?> ax;
    private int ay;
    private int az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HealthCalendarView.OnCalendarSelectListener f46319b;
    private int ba;
    private int bb;
    private int bc;
    private Class<?> bd;
    private int be;
    private String bf;
    private int bg;
    private int bh;
    private String bi;
    private Class<?> bl;
    private int bm;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    HealthMark f46320c;
    public HealthCalendarView.OnInnerDateSelectedListener d;
    public Map<String, HealthCalendar> e;
    public HealthCalendar f;
    public int g;
    public int h;
    public int i;
    public HealthCalendar j;
    public int k;
    public HealthCalendarView.OnViewChangeListener l;
    public int m;
    public HealthCalendarView.OnWeekChangeListener n;
    public HealthCalendar o;
    private int p;
    private int q;
    private int r;
    public int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private boolean z = true;
    private boolean aa = true;
    private boolean af = true;
    private boolean y = true;
    private boolean ac = false;
    private HashMap<String, int[]> ar = new HashMap<>();

    public void b(int i) {
    }

    public qjo(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthCalendarView, i, i2);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_calendar_padding_start, 0);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_calendar_padding_end, 0);
        if (typedArrayObtainStyledAttributes.peekValue(R.styleable.HealthCalendarView_calendar_padding) != null) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_calendar_padding, 0);
            this.q = dimensionPixelSize;
            this.r = dimensionPixelSize;
            this.t = dimensionPixelSize;
        }
        this.at = typedArrayObtainStyledAttributes.getString(R.styleable.HealthCalendarView_month_view);
        this.bi = typedArrayObtainStyledAttributes.getString(R.styleable.HealthCalendarView_week_view);
        this.bf = typedArrayObtainStyledAttributes.getString(R.styleable.HealthCalendarView_week_bar_view);
        this.bm = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_week_text_size, 0);
        this.bg = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_week_bar_height, 0);
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_week_date_text_margin_top, 0);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_week_date_maker_margin_top, 0);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_week_date_circle_size, context.getResources().getDimensionPixelSize(R.dimen.health_calendarview_item_width));
        this.ai = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthCalendarView_subHeader_show_date, false);
        this.ae = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthCalendarView_week_day_replace_date, false);
        this.ab = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthCalendarView_month_view_scrollable, true);
        this.an = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthCalendarView_week_view_scrollable, true);
        this.u = typedArrayObtainStyledAttributes.getInt(R.styleable.HealthCalendarView_month_view_auto_select_day, 0);
        this.aw = typedArrayObtainStyledAttributes.getInt(R.styleable.HealthCalendarView_month_view_show_mode, 2);
        this.be = typedArrayObtainStyledAttributes.getInt(R.styleable.HealthCalendarView_week_start_with, 1);
        this.bb = typedArrayObtainStyledAttributes.getColor(R.styleable.HealthCalendarView_week_background, 0);
        this.bh = typedArrayObtainStyledAttributes.getColor(R.styleable.HealthCalendarView_week_text_color, 0);
        this.v = typedArrayObtainStyledAttributes.getColor(R.styleable.HealthCalendarView_current_day_text_color, 0);
        this.x = typedArrayObtainStyledAttributes.getColor(R.styleable.HealthCalendarView_current_day_selected_text_color, 0);
        this.ay = typedArrayObtainStyledAttributes.getColor(R.styleable.HealthCalendarView_selected_theme_color, 0);
        this.az = typedArrayObtainStyledAttributes.getColor(R.styleable.HealthCalendarView_selected_text_color, 0);
        this.bc = typedArrayObtainStyledAttributes.getColor(R.styleable.HealthCalendarView_current_month_text_color, 0);
        this.au = typedArrayObtainStyledAttributes.getColor(R.styleable.HealthCalendarView_other_month_text_color, 0);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_day_text_size, 0);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_calendar_height, 0);
        this.ak = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_item_vertical_space, 0);
        this.al = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_item_extra_space, 0);
        this.aj = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HealthCalendarView_last_item_extra_space, 0);
        this.ah = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthCalendarView_show_future_date, true);
        this.ag = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HealthCalendarView_set_gray_unmarked_date, false);
        e(typedArrayObtainStyledAttributes);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        au();
    }

    private void e(TypedArray typedArray) {
        this.i = typedArray.getDimensionPixelSize(R.styleable.HealthCalendarView_mark_margin_top, 0);
        this.g = typedArray.getDimensionPixelSize(R.styleable.HealthCalendarView_mark_view_size, 0);
        this.am = typedArray.getColor(R.styleable.HealthCalendarView_mark_text_color, 0);
        this.ap = typedArray.getDimensionPixelSize(R.styleable.HealthCalendarView_mark_text_size, 0);
        int color = typedArray.getColor(R.styleable.HealthCalendarView_mark_theme_color, 0);
        HealthMark healthMark = new HealthMark(typedArray.getDrawable(R.styleable.HealthCalendarView_mark_drawale), typedArray.getString(R.styleable.HealthCalendarView_mark_text), color);
        this.f46320c = healthMark;
        healthMark.a(this.i);
    }

    private void b(TypedArray typedArray) {
        int i = typedArray.getInt(R.styleable.HealthCalendarView_min_year, 1900);
        this.aq = new HealthCalendar(i > 1900 ? i : 1900, typedArray.getInt(R.styleable.HealthCalendarView_min_year_month, 1), typedArray.getInt(R.styleable.HealthCalendarView_min_year_day, 1));
        int i2 = R.styleable.HealthCalendarView_max_year;
        int i3 = ShareConfig.MSG_SHARE_FAIL_TOAST;
        int i4 = typedArray.getInt(i2, ShareConfig.MSG_SHARE_FAIL_TOAST);
        int i5 = typedArray.getInt(R.styleable.HealthCalendarView_max_year_month, 12);
        int i6 = typedArray.getInt(R.styleable.HealthCalendarView_max_year_day, -1);
        if (i4 < 2099) {
            i3 = i4;
        }
        this.ao = new HealthCalendar(i3, i5, i6);
    }

    private void au() {
        this.av = new HealthCalendar();
        Date date = new Date();
        this.av.setYear(qjj.b("yyyy", date));
        this.av.setMonth(qjj.b("MM", date));
        this.av.setDay(qjj.b("dd", date));
        this.av.setPresentDay(true);
        av();
        try {
            this.bd = TextUtils.isEmpty(this.bf) ? HealthWeekBar.class : Class.forName(this.bf);
        } catch (ClassNotFoundException unused) {
            Log.e("HealthCalendarViewManager", "WeekBar class not found");
        }
        try {
            this.ax = TextUtils.isEmpty(this.at) ? HealthDefaultMonthView.class : Class.forName(this.at);
        } catch (ClassNotFoundException unused2) {
            Log.e("HealthCalendarViewManager", "MonthView class not found");
        }
        try {
            this.bl = TextUtils.isEmpty(this.bi) ? HealthDefaultWeekView.class : Class.forName(this.bi);
        } catch (ClassNotFoundException unused3) {
            Log.e("HealthCalendarViewManager", "WeekView class not found");
        }
    }

    public int i() {
        return this.v;
    }

    public int j() {
        return this.x;
    }

    public int ad() {
        return this.bh;
    }

    public int n() {
        return this.am;
    }

    public int k() {
        return this.ap;
    }

    public int p() {
        return this.au;
    }

    public int x() {
        return this.bc;
    }

    public int y() {
        return this.az;
    }

    public HealthMark f() {
        return this.f46320c;
    }

    public void j(int i) {
        this.ay = i;
        this.v = i;
    }

    public void n(int i) {
        this.k = i;
    }

    public int ac() {
        return this.k;
    }

    public void e(int i) {
        this.ak = i;
    }

    public int w() {
        return this.ay;
    }

    public int u() {
        return this.bb;
    }

    public Class<?> t() {
        return this.ax;
    }

    public Class<?> ag() {
        return this.bl;
    }

    public Class<?> z() {
        return this.bd;
    }

    public int ab() {
        return this.bg;
    }

    public void f(int i) {
        this.bg = i;
    }

    public int v() {
        return this.ba;
    }

    public void i(int i) {
        this.ba = i;
    }

    public int h() {
        if (qrs.v()) {
            return BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.health_common_24dp);
        }
        return this.w;
    }

    public void d(int i) {
        this.w = i;
    }

    public int c() {
        return this.p + this.ak;
    }

    public int o() {
        return this.al;
    }

    int l() {
        return this.aj;
    }

    public void c(int i) {
        this.aj = i;
    }

    public void a(int i) {
        this.al = i;
    }

    public int q() {
        return this.aw;
    }

    public void g(int i) {
        this.aw = i;
    }

    public boolean as() {
        return this.ai;
    }

    public boolean ar() {
        return this.ae;
    }

    public void i(boolean z) {
        this.ae = z;
    }

    public void h(int i) {
        this.g = i;
    }

    public boolean af() {
        return this.ab;
    }

    public boolean aq() {
        return this.an;
    }

    public void d(boolean z) {
        this.ac = z;
    }

    public void j(boolean z) {
        this.ab = z;
    }

    public void l(boolean z) {
        this.an = z;
    }

    public int aa() {
        return this.be;
    }

    public void m(int i) {
        this.be = i;
    }

    int g() {
        return this.u;
    }

    public boolean ai() {
        return this.y;
    }

    public void b(boolean z) {
        this.y = z;
    }

    public int ah() {
        if (qrs.v()) {
            return BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.health_common_16dp);
        }
        return this.bm;
    }

    public HealthCalendar s() {
        return this.av;
    }

    public void ap() {
        Date date = new Date();
        this.av.setYear(qjj.b("yyyy", date));
        this.av.setMonth(qjj.b("MM", date));
        this.av.setDay(qjj.b("dd", date));
    }

    public int d() {
        return this.r;
    }

    public int a() {
        return this.t;
    }

    public boolean ao() {
        return this.ah;
    }

    public void f(boolean z) {
        this.ah = z;
    }

    public boolean am() {
        return this.ag;
    }

    public void a(boolean z) {
        this.ag = z;
    }

    public boolean al() {
        return this.ad;
    }

    public void c(boolean z) {
        this.ad = z;
    }

    public boolean aj() {
        return this.z;
    }

    public void e(boolean z) {
        this.z = z;
    }

    public boolean ak() {
        return this.aa;
    }

    public void g(boolean z) {
        this.aa = z;
    }

    public HealthCalendar b() {
        HealthCalendar healthCalendar = new HealthCalendar();
        healthCalendar.setYear(this.av.getYear());
        healthCalendar.setMonth(this.av.getMonth());
        healthCalendar.setDay(this.av.getDay());
        healthCalendar.setPresentDay(true);
        return healthCalendar;
    }

    public HealthCalendar r() {
        return this.aq;
    }

    public HealthCalendar m() {
        return this.ao;
    }

    public void e(List<HealthCalendar> list) {
        Map<String, HealthCalendar> map = this.e;
        if (map == null || map.size() == 0) {
            return;
        }
        for (HealthCalendar healthCalendar : list) {
            if (this.e.containsKey(healthCalendar.toString())) {
                HealthCalendar healthCalendar2 = this.e.get(healthCalendar.toString());
                if (healthCalendar2 != null) {
                    if (healthCalendar2.getMarks() == null) {
                        healthCalendar2.addMark(this.f46320c);
                    }
                    healthCalendar.setMarks(healthCalendar2.getMarks());
                }
            } else {
                healthCalendar.clearMark();
            }
        }
    }

    public void c(Map<String, HealthCalendar> map) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        for (Map.Entry<String, HealthCalendar> entry : map.entrySet()) {
            String key = entry.getKey();
            this.e.remove(key);
            HealthCalendar value = entry.getValue();
            if (value != null) {
                if (value.getMarks() == null) {
                    value.addMark(this.f46320c);
                }
                this.e.put(key, value);
            }
        }
    }

    public void e() {
        this.e = null;
    }

    public void b(HealthCalendar healthCalendar, HealthCalendar healthCalendar2) {
        this.aq = healthCalendar;
        this.ao = healthCalendar2;
        av();
    }

    public void e(HealthCalendar healthCalendar, HealthCalendar healthCalendar2) {
        this.f = healthCalendar;
        this.j = healthCalendar2;
    }

    private void av() {
        if (!this.ac && this.ao.getYear() < this.av.getYear()) {
            this.ao.setYear(this.av.getYear());
        }
        if (this.ao.getDay() == -1) {
            HealthCalendar healthCalendar = this.ao;
            healthCalendar.setDay(qjj.d(healthCalendar.getYear(), this.ao.getMonth()));
        }
        this.h = qjj.b(this.av, this);
    }

    public boolean ae() {
        return this.as;
    }

    public void h(boolean z) {
        this.as = z;
    }

    public void m(boolean z) {
        this.af = z;
    }

    public boolean an() {
        return this.af;
    }

    int[] d(String str) {
        return this.ar.get(str);
    }

    public void b(String str, int[] iArr) {
        this.ar.put(str, iArr);
    }
}
