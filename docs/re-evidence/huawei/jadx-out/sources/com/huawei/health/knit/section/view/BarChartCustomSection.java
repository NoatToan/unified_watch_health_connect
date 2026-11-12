package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.chart.CoreSleepDayDetailView;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.utils.HarmonyOsTypefaceSpan;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.fra;
import defpackage.idy;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qto;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class BarChartCustomSection extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7572a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private int ad;
    private ImageView ae;
    private boolean af;
    private boolean ag;
    private LinearLayout ah;
    private ImageView ai;
    private HealthTextView aj;
    private HealthTextView ak;
    private ImageView al;
    private HealthTextView am;
    private ImageView an;
    private ImageView ao;
    private ImageView ap;
    private ImageView aq;
    private HealthTextView ar;
    private HealthTextView as;
    private HealthProgressBar at;
    private HealthTextView au;
    private HealthTextView av;
    private int aw;
    private LinearLayout ax;
    private HealthViewPager.OnViewPagerTouchEvent ay;
    private String az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnClickSectionListener f7573b;
    private int ba;
    private LinearLayout bb;
    private String bc;
    private HealthTextView bd;
    private LinearLayout be;
    private HealthTextView bf;
    private LinearLayout bg;
    private long bh;
    private int bi;
    private HealthTextView bj;
    private long bk;
    private HealthTextView bl;
    private LinearLayout bm;
    private LinearLayout bn;
    private HealthTextView bo;
    private ImageView bp;
    private HealthTextView bq;
    private List<fra> br;
    private List<fra> bs;
    private boolean bt;
    private CoreSleepDayDetailView bu;
    private ArrayList<CoreSleepDayDetailView> bv;
    private boolean bw;
    private HealthTextView bx;
    private HealthTextView by;
    private double bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f7574c;
    private Typeface ca;
    private View.OnClickListener cb;
    private View cf;
    private int d;
    private boolean e;
    private HealthViewPager f;
    private Context g;
    private LinearLayout h;
    private OnClickSectionListener i;
    private RelativeLayout j;
    private String k;
    private int l;
    private Date m;
    private String n;
    private HealthTextView o;
    private LinearLayout p;
    private LinearLayout q;
    private int r;
    private HealthTextView s;
    private HealthTextView t;
    private HealthTextView u;
    private View v;
    private ImageView w;
    private ImageView x;
    private int y;
    private boolean z;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    public BarChartCustomSection(Context context) {
        super(context);
        this.br = new ArrayList(16);
        this.bz = 0.0d;
        this.bv = new ArrayList<>(16);
        this.m = new Date(System.currentTimeMillis());
        this.ag = true;
        this.z = false;
        this.r = 0;
        this.aa = false;
        this.ac = false;
        this.bk = 0L;
        this.bh = 0L;
    }

    public BarChartCustomSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.br = new ArrayList(16);
        this.bz = 0.0d;
        this.bv = new ArrayList<>(16);
        this.m = new Date(System.currentTimeMillis());
        this.ag = true;
        this.z = false;
        this.r = 0;
        this.aa = false;
        this.ac = false;
        this.bk = 0L;
        this.bh = 0L;
    }

    public BarChartCustomSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.br = new ArrayList(16);
        this.bz = 0.0d;
        this.bv = new ArrayList<>(16);
        this.m = new Date(System.currentTimeMillis());
        this.ag = true;
        this.z = false;
        this.r = 0;
        this.aa = false;
        this.ac = false;
        this.bk = 0L;
        this.bh = 0L;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.g = context;
        h();
        a();
        c();
        m();
        return this.cf;
    }

    private void m() {
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.health.knit.section.view.BarChartCustomSection.2
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    if (iIntValue == 100) {
                        BarChartCustomSection.this.e((Boolean) true);
                        return;
                    }
                    if (iIntValue == 101) {
                        if (BarChartCustomSection.this.bj != null) {
                            BarChartCustomSection.this.bj.setVisibility(8);
                        }
                        if (BarChartCustomSection.this.ax != null) {
                            BarChartCustomSection.this.ax.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    BarChartCustomSection.this.a(iIntValue);
                }
            }
        }, "SLEEP_SYNC_RATE");
    }

    private void h() {
        if (this.cf == null) {
            LogUtil.e("BarChartCustomSection", "initView mainView is null, start to inflate");
            this.cf = LayoutInflater.from(this.g).inflate(R.layout.section_custom_bar_layout, (ViewGroup) this, false);
        }
        j();
        this.ae.setOnClickListener(this);
        this.bp.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.w.setOnClickListener(this);
        if (LanguageUtil.ba(this.g)) {
            this.ae.setImageResource(R.drawable.ic_right_grey_arrow);
            this.bp.setImageResource(R.drawable.ic_left_grey_arrow);
        } else {
            this.ae.setImageResource(R.drawable.ic_left_grey_arrow);
            this.bp.setImageResource(R.drawable.ic_right_grey_arrow);
        }
        i();
        f();
        d();
    }

    private void a() {
        View viewA = qsp.a(this.cf, R.id.go_to_ecg_tips_layout);
        this.v = viewA;
        ((HealthTextView) qsp.a(viewA, R.id.toast_no_notice_tv)).setVisibility(8);
        this.bx = (HealthTextView) qsp.a(this.v, R.id.toast_try_tv);
        ((HealthTextView) qsp.a(this.v, R.id.toast_cancel_tv)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.BarChartCustomSection.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == null || BarChartCustomSection.this.v == null) {
                    return;
                }
                BarChartCustomSection.this.v.setVisibility(8);
                if (BarChartCustomSection.this.cb != null) {
                    BarChartCustomSection.this.cb.onClick(view);
                }
            }
        });
        this.by = (HealthTextView) qsp.a(this.v, R.id.toast_title_tv);
    }

    private void c() {
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this.cf, R.id.core_sleep_btn_tips_layout);
        this.j = relativeLayout;
        if (relativeLayout == null) {
            LogUtil.a("BarChartCustomSection", "initCoreSleepTips, mCoreSleepBtnTipsLayout is null");
        }
    }

    private void d() {
        LogUtil.e("debugn", "initLoadingView");
        this.at.setLayerType(1, null);
        this.bj.setVisibility(4);
        this.q.setVisibility(4);
        this.u.setVisibility(4);
        this.be.setVisibility(4);
        this.bg.setVisibility(4);
        this.ax.setVisibility(0);
        this.au.setText(R.string.IDS_getting_file);
        this.bl.setVisibility(8);
    }

    private void f() {
        this.bu.setColorType(0);
        this.bu.setDayDetailView(true);
        LogUtil.e("BarChartCustomSection", "initViewPagerData mSleepDataList: ", this.br.toString());
    }

    private void i() {
        if (this.bu == null) {
            CoreSleepDayDetailView coreSleepDayDetailView = new CoreSleepDayDetailView(this.g);
            this.bu = coreSleepDayDetailView;
            coreSleepDayDetailView.setLayerType(1, null);
            this.bu.setDayDetailView(true);
        }
        this.bv.clear();
        this.bv.add(this.bu);
        this.f.setAdapter(new qto(this.bv));
        this.f.setIsScroll(false);
        this.f.setOnViewPagerTouchEventListener(new HealthViewPager.OnViewPagerTouchEvent() { // from class: com.huawei.health.knit.section.view.BarChartCustomSection.3
            @Override // com.huawei.ui.commonui.viewpager.HealthViewPager.OnViewPagerTouchEvent
            public void setIsViewTouch(Boolean bool) {
            }

            @Override // com.huawei.ui.commonui.viewpager.HealthViewPager.OnViewPagerTouchEvent
            public void onTouchDown(MotionEvent motionEvent) {
                if (BarChartCustomSection.this.ay != null) {
                    BarChartCustomSection.this.ay.onTouchDown(motionEvent);
                }
            }

            @Override // com.huawei.ui.commonui.viewpager.HealthViewPager.OnViewPagerTouchEvent
            public void onTouchUp(MotionEvent motionEvent) {
                if (BarChartCustomSection.this.ay != null) {
                    BarChartCustomSection.this.ay.setIsViewTouch(Boolean.valueOf(BarChartCustomSection.this.bu.b()));
                    BarChartCustomSection.this.ay.onTouchUp(motionEvent);
                }
            }
        });
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "BarChartCustomSection";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.e("BarChartCustomSection", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            return;
        }
        setTempDataListAndSleepDataList(map);
        CoreSleepDayDetailView.OnClickViewDefaultListener onClickViewDefaultListener = (CoreSleepDayDetailView.OnClickViewDefaultListener) qqw.a(map, "BAR_CHART_CLICK_EVENT", (Class<Object>) CoreSleepDayDetailView.OnClickViewDefaultListener.class, (Object) null);
        if (onClickViewDefaultListener != null) {
            this.bu.setonClickViewDefaultListener(onClickViewDefaultListener);
        }
        this.i = (OnClickSectionListener) qqw.a(map, "BAR_CHART_ARROW_COMMON_EVENT", (Class<Object>) OnClickSectionListener.class, (Object) null);
        this.cb = (View.OnClickListener) qqw.a(map, "TEXT_CANCEL_CLICK", (Class<Object>) View.OnClickListener.class, (Object) null);
        this.n = qqw.d((Map) map, "BAR_CHART_PERIOD_STRING", "");
        this.k = qqw.d((Map) map, "BAR_CHART_TYPE_STRING", "");
        this.l = qqw.c(map, "BAR_CHART_TIME_INT", 0);
        this.ad = qqw.c(map, "SLEEP_HYBRID_NIGHT_TIME", 0);
        this.y = qqw.c(map, "SLEEP_HYBRID_NOON_TIME", 0);
        this.f7572a = qqw.a(map, "BAR_CHART_DATA_VALID", false);
        this.aw = qqw.c(map, "BAR_CHART_TOTAL_MANUAL_BED_TIME", 0);
        this.ba = qqw.c(map, "BAR_CHART_TOTAL_MANUAL_SLEEP_TIME", 0);
        this.bc = qqw.d((Map) map, "BAR_CHART_TOTAL_MANUAL_BED_TITLE", "");
        this.az = qqw.d((Map) map, "BAR_CHART_TOTAL_MANUAL_SLEEP_TITLE", "");
        this.f7573b = (OnClickSectionListener) qqw.a(map, "BAR_CHART_CALENDAR_CLICK_EVENT", (Class<Object>) OnClickSectionListener.class, (Object) null);
        this.ay = (HealthViewPager.OnViewPagerTouchEvent) qqw.a(map, "BAR_CHART_VIEWPAGER_TOUCH_EVENT", (Class<Object>) HealthViewPager.OnViewPagerTouchEvent.class, (Object) null);
        this.bi = qqw.c(map, "BAR_CHART_PROCESS_TEXT_VISIBILITY", 8);
        setVisibilityOrText(map);
        setNoDataRec(map);
        e(map);
        this.ag = qqw.a(map, "BAR_CHART_IS_SCIENCE_SLEEP", true);
        Object obj = map.get("BAR_CHART_VALID_DATA");
        if (obj instanceof Double) {
            this.bz = ((Double) obj).doubleValue();
        }
        this.z = qqw.a(map, "BAR_CHART_IS_TYPE", false);
        this.aa = qqw.a(map, "BAR_COMMON_IS_PHONE", false);
        this.ac = qqw.a(map, "BAR_COMMON_IS_MANUAL", false);
        LogUtil.a("BarChartCustomSection", "mIsPhone is", Boolean.valueOf(this.aa));
        long jE = qqw.e((Map) map, "BAR_COMMON_PHONE_START_TIME", 0L);
        this.bk = jE;
        LogUtil.a("BarChartCustomSection", "mPhoneStartTime is", Long.valueOf(jE));
        long jE2 = qqw.e((Map) map, "BAR_COMMON_PHONE_END_TIME", 0L);
        this.bh = jE2;
        LogUtil.a("BarChartCustomSection", "mPhoneEndTime is", Long.valueOf(jE2));
        this.m = (Date) qqw.a(map, "BAR_CHART_CURRENT_DAY", (Class<Object>) Date.class, (Object) null);
        this.d = qqw.c(map, "BAR_CHART_COLOR_TYPE", 0);
        setViewUtilsData(map);
        this.r = qqw.c(map, "SLEEP_DAY_BAR_CHART_DEVICE_ID", 0);
        this.r = qqw.c(map, "SLEEP_DAY_BAR_CHART_DEVICE_ID", 0);
        this.af = qqw.a(map, "BAR_SCIENCE_IS_SUPPORT_BEDTIME", false);
        if (this.ac) {
            qsp.a(this.ai, (Drawable) qqw.a(map, "BAR_CHART_LEGEND_SIX_DRAWABLE", (Class<Object>) Drawable.class, (Object) null));
            qsp.a(this.ao, (Drawable) qqw.a(map, "BAR_CHART_LEGEND_SEVEN_DRAWABLE", (Class<Object>) Drawable.class, (Object) null));
            qsp.b(this.am, qqw.d((Map) map, "BAR_CHART_LEGEND_SIX_TEXT", ""));
            qsp.b(this.as, qqw.d((Map) map, "BAR_CHART_LEGEND_SEVEN_TEXT", ""));
            this.ab = qqw.a(map, "BAR_COMMON_IS_MANUAL_INCOMPLETE", false);
            String strD = qqw.d((Map) map, "BAR_CHART_TOTAL_MANUAL_SLEEP_PERIOD", "");
            if (TextUtils.isEmpty(strD)) {
                qsp.c((View) this.u, 4);
            } else {
                qsp.b(this.u, strD);
                qsp.c((View) this.u, 0);
            }
        }
        a(this.n, this.k, this.l);
        g();
    }

    private void o() {
        int i = this.ad;
        int i2 = this.y;
        if (i != i2 && i != 0 && i2 != 0) {
            this.u.setVisibility(0);
            String string = this.g.getString(R.string.IDS_fitness_total_sleep_data_title);
            String strC = c(this.ad);
            String string2 = this.g.getString(R.string.IDS_fitness_core_sleep_noontime_sleep);
            String strC2 = c(this.y);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(string);
            stringBuffer.append(" ");
            stringBuffer.append(strC);
            stringBuffer.append(" | ");
            stringBuffer.append(string2);
            stringBuffer.append(" ");
            stringBuffer.append(strC2);
            this.u.setText(stringBuffer.toString());
            return;
        }
        this.u.setVisibility(4);
    }

    private String c(int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        double d = i3;
        String strE = UnitUtil.e(d, 1, 0);
        String quantityString = BaseApplication.getContext().getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_min_unit, i3, UnitUtil.e(d, 1, 0));
        if (i2 == 0) {
            return i3 == 0 ? quantityString.replace(strE, "--") : quantityString;
        }
        return BaseApplication.getContext().getString(com.huawei.ui.commonui.R.string.IDS_two_parts, BaseApplication.getContext().getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_hour_unit, i2, UnitUtil.e(i2, 1, 0)), quantityString);
    }

    private void e(HashMap<String, Object> map) {
        LogUtil.a("BarChartCustomSection", "coreSleepBtnTipsLayoutResponse");
        Object obj = map.get("CORE_SLEEP_BTN_TIPS");
        LogUtil.a("BarChartCustomSection", "callback: ", obj);
        if (!(obj instanceof IBaseResponseCallback)) {
            LogUtil.e("BarChartCustomSection", "callback type is invalid");
            return;
        }
        RelativeLayout relativeLayout = this.j;
        if (relativeLayout == null) {
            LogUtil.e("BarChartCustomSection", "mCoreSleepBtnTipsLayout is null");
        } else {
            ((IBaseResponseCallback) obj).a(0, relativeLayout);
        }
    }

    private void setVisibilityOrText(HashMap<String, Object> map) {
        qsp.b(this.o, qqw.d((Map) map, "BAR_CHART_DATE_TEXT", ""));
        qsp.a(this.w, (Drawable) qqw.a(map, "BAR_CHART_HELP_ICON", (Class<Object>) Drawable.class, (Object) null));
        qsp.c((View) this.w, qqw.c(map, "BAR_CHART_HELP_ICON_VISIBILITY", 8));
        qsp.b(this.bx, qqw.d((Map) map, "ECG_TEXT_TRY_TEXT", this.g.getString(R.string.IDS_device_bt_right_btn_info)));
        qsp.e(this.bx, (OnClickSectionListener) qqw.a(map, "ECG_TEXT_TRY_CLICK_EVENT", (Class<Object>) OnClickSectionListener.class, (Object) null), "ECG_TEXT_TRY_CLICK_EVENT");
        qsp.b(this.by, qqw.d((Map) map, "ECG_TEXT_CONTENT_TEXT", ""));
        qsp.c(this.v, qqw.c(map, "ECG_TIPS_LAYOUT_VISIBILITY", 8));
        qsp.c((View) this.h, qqw.c(map, "BAR_CHART_CORE_LEGEND_VISIBILITY", 0));
        qsp.c((View) this.bm, qqw.c(map, "BAR_CHART_REM_LEGEND_VISIBILITY", 0));
        qsp.c((View) this.bb, qqw.c(map, "BAR_CHART_NOON_LEGEND_VISIBILITY", 4));
    }

    private void setViewUtilsData(HashMap<String, Object> map) {
        qsp.a(this.an, (Drawable) qqw.a(map, "BAR_CHART_LEGEND_ONE_DRAWABLE", (Class<Object>) Drawable.class, (Object) null));
        qsp.a(this.aq, (Drawable) qqw.a(map, "BAR_CHART_LEGEND_TWO_DRAWABLE", (Class<Object>) Drawable.class, (Object) null));
        qsp.a(this.ap, (Drawable) qqw.a(map, "BAR_CHART_LEGEND_THREE_DRAWABLE", (Class<Object>) Drawable.class, (Object) null));
        qsp.a(this.ai, (Drawable) qqw.a(map, "BAR_CHART_LEGEND_FOUR_DRAWABLE", (Class<Object>) Drawable.class, (Object) null));
        qsp.a(this.al, (Drawable) qqw.a(map, "BAR_CHART_LEGEND_FIVE_DRAWABLE", (Class<Object>) Drawable.class, (Object) null));
        qsp.a(this.ao, (Drawable) qqw.a(map, "BAR_CHART_LEGEND_FIVE_DRAWABLE", (Class<Object>) Drawable.class, (Object) null));
        qsp.b(this.aj, qqw.d((Map) map, "BAR_CHART_LEGEND_ONE_TEXT", ""));
        qsp.b(this.av, qqw.d((Map) map, "BAR_CHART_LEGEND_TWO_TEXT", ""));
        qsp.b(this.ar, qqw.d((Map) map, "BAR_CHART_LEGEND_THREE_TEXT", ""));
        qsp.b(this.am, qqw.d((Map) map, "BAR_CHART_LEGEND_FOUR_TEXT", ""));
        qsp.b(this.ak, qqw.d((Map) map, "BAR_CHART_LEGEND_FIVE_TEXT", ""));
        qsp.b(this.as, qqw.d((Map) map, "BAR_CHART_LEGEND_FIVE_TEXT", ""));
        qsp.b(this.bj, qqw.d((Map) map, "BAR_CHART_SYNC_TEXT", this.g.getResources().getString(R.string.IDS_fitness_core_sleep_no_sleep_data)));
    }

    private void setNoDataRec(HashMap<String, Object> map) {
        Object obj = map.get("BAR_CHART_IS_TODAY");
        if (obj instanceof Boolean) {
            d(((Boolean) obj).booleanValue());
        }
        Object obj2 = map.get("BAR_CHART_IS_DISMISS_LOADING");
        if (obj2 instanceof Boolean) {
            a(((Boolean) obj2).booleanValue());
        }
        Object obj3 = map.get("BAR_CHART_IS_NO_DATA_REC");
        if (obj3 instanceof Boolean) {
            b(((Boolean) obj3).booleanValue());
        }
        Object obj4 = map.get("BAR_CHART_IS_DATA_SYNCING");
        if (obj4 instanceof Integer) {
            a(((Integer) obj4).intValue());
        }
    }

    private void g() {
        int i;
        if (this.bu != null && this.e) {
            LogUtil.a("BarChartCustomSection", "prepareRefreshChart misPhone ", Boolean.valueOf(this.aa), " is manual ", Boolean.valueOf(this.ac));
            this.bu.setColorType(this.d);
            this.bu.isSupportBedTime(this.af);
            this.bu.refreshFitnessDataList(b(), this.ag, this.bz, this.z, this.m, this.aa, this.ac, this.ab);
        }
        HealthTextView healthTextView = this.bj;
        if (healthTextView == null || (i = this.bi) == Integer.MAX_VALUE) {
            return;
        }
        healthTextView.setVisibility(i);
        if (this.bi == 0) {
            qsp.c((View) this.u, 4);
            qsp.c((View) this.be, 4);
            qsp.c((View) this.bg, 4);
        }
    }

    private List<fra> b() {
        if (!this.af) {
            LogUtil.a("BarChartCustomSection", "mIsSupportBedTime is false");
            return this.br;
        }
        ArrayList arrayList = new ArrayList();
        for (fra fraVar : this.br) {
            if (fraVar.a() != 69) {
                arrayList.add(fraVar);
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.e("BarChartCustomSection", "mSleepDataList is not enough");
            return this.br;
        }
        ArrayList arrayList2 = new ArrayList();
        fra fraVar2 = new fra();
        int i = 0;
        while (i < arrayList.size()) {
            fra fraVar3 = (fra) arrayList.get(i);
            if (i == 0 || i == arrayList.size() - 1) {
                if (fraVar3.a() == 67) {
                    arrayList2.add(fraVar3);
                }
            } else {
                if (fraVar2.a() == 67 && fraVar2.d() != fraVar3.b()) {
                    arrayList2.add(fraVar2);
                }
                if (fraVar3.a() == 67 && fraVar2.d() != fraVar3.b()) {
                    arrayList2.add(fraVar3);
                }
            }
            i++;
            fraVar2 = fraVar3;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.remove((fra) it.next());
        }
        LogUtil.a("BarChartCustomSection", "delete ears ", arrayList2.toString());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Boolean bool) {
        if (bool.booleanValue()) {
            this.bl.setVisibility(0);
            this.bl.setText(UnitUtil.e(100.0d, 2, 0));
            this.ax.postDelayed(new Runnable() { // from class: fty
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34577a.e();
                }
            }, 500L);
        }
    }

    public /* synthetic */ void e() {
        this.ax.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.bj.setVisibility(8);
        this.bl.setVisibility(0);
        this.ax.setVisibility(0);
        this.u.setVisibility(4);
        this.be.setVisibility(4);
        this.bg.setVisibility(4);
        this.au.setText(R.string.IDS_pull_to_refresh_refreshing_label);
        this.bl.setText(UnitUtil.e(i, 2, 0));
    }

    private void b(boolean z) {
        if (z) {
            this.bd.setText("");
            this.t.setText("");
            this.q.setVisibility(4);
            this.u.setVisibility(4);
            this.be.setVisibility(4);
            this.bg.setVisibility(4);
        }
    }

    private void a(boolean z) {
        if (z && this.bw != z) {
            LogUtil.e("dbugn", "dealLoading TEXT_VISIBILITY" + z);
            HealthTextView healthTextView = this.bj;
            if (healthTextView != null) {
                healthTextView.setVisibility(8);
            }
            LinearLayout linearLayout = this.ax;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else if (this.bw != z) {
            LogUtil.e("dbugn", "11dealLoading TEXT_VISIBILITY" + z);
            HealthTextView healthTextView2 = this.bj;
            if (healthTextView2 != null) {
                healthTextView2.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.ax;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            HealthTextView healthTextView3 = this.au;
            if (healthTextView3 != null) {
                healthTextView3.setText(R.string.IDS_getting_file);
            }
            HealthTextView healthTextView4 = this.bl;
            if (healthTextView4 != null) {
                healthTextView4.setVisibility(8);
            }
            qsp.c((View) this.u, 4);
            qsp.c((View) this.be, 4);
            qsp.c((View) this.bg, 4);
        } else {
            LogUtil.e("BarChartCustomSection", "dealLoading wrong");
        }
        this.bw = z;
    }

    private void d(boolean z) {
        if (z && this.bt != z) {
            this.ae.setVisibility(0);
            this.bp.setVisibility(4);
            this.bn.setClickable(false);
        } else if (this.bt != z) {
            this.ae.setVisibility(0);
            this.bp.setVisibility(0);
            this.bn.setClickable(true);
            this.ax.setVisibility(0);
            this.bw = false;
            this.bl.setVisibility(8);
            this.au.setText(this.g.getString(R.string.IDS_getting_file));
        } else {
            LogUtil.e("BarChartCustomSection", "dealIsToday wrong");
        }
        this.bt = z;
    }

    private void a(String str, String str2, int i) {
        this.be.setVisibility(0);
        this.bg.setVisibility(8);
        this.s.setVisibility(4);
        if (this.ac) {
            setManualData(i);
            return;
        }
        if (i == 0) {
            this.be.setVisibility(4);
            this.bg.setVisibility(4);
            return;
        }
        this.bd.setVisibility(0);
        HealthTextView healthTextView = this.bd;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        healthTextView.setText(str);
        HealthTextView healthTextView2 = this.t;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        healthTextView2.setText(str2);
        setSleepDataToCommonSleep(i);
        o();
    }

    private void setManualData(int i) {
        if (i == 0) {
            this.be.setVisibility(4);
            this.bg.setVisibility(4);
            return;
        }
        this.be.setVisibility(0);
        this.bg.setVisibility(0);
        this.p.setVisibility(0);
        if (!TextUtils.isEmpty(this.bc)) {
            this.bd.setText(this.bc);
            this.bd.setVisibility(0);
        } else {
            this.be.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.az)) {
            this.bf.setText(this.az);
            this.bf.setVisibility(0);
        } else {
            this.bg.setVisibility(8);
        }
        int i2 = this.aw;
        if (i2 != 0) {
            this.bq.setText(b(i2));
            this.bq.setVisibility(0);
            lrd.c(this.bq, this.q.getVisibility() == 0 ? 1 : 2);
        } else {
            this.be.setVisibility(8);
        }
        int i3 = this.ba;
        if (i3 != 0) {
            this.bo.setText(b(i3));
            this.bo.setVisibility(0);
            lrd.c(this.bo, this.q.getVisibility() == 0 ? 1 : 2);
            return;
        }
        this.bg.setVisibility(8);
    }

    private void setSleepDataToCommonSleep(int i) {
        if (i < 0) {
            this.bq.setVisibility(4);
            return;
        }
        this.bq.setText(b(i));
        this.bq.setVisibility(0);
        lrd.c(this.bq, this.q.getVisibility() == 0 ? 1 : 2);
    }

    private SpannableString b(int i) {
        String strReplace;
        int iIndexOf;
        this.ca = Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        int i2 = i / 60;
        int i3 = i % 60;
        double d = i3;
        String strE = UnitUtil.e(d, 1, 0);
        String quantityString = "";
        try {
            strReplace = BaseApplication.getContext().getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_min_unit, i3, UnitUtil.e(d, 1, 0));
        } catch (IllegalFormatConversionException e) {
            LogUtil.j("BarChartCustomSection", "getTimeSpannableString() strMin IllegalFormatConversionException = ", e);
            strReplace = "";
        }
        if (i2 == 0) {
            if (i3 == 0) {
                strReplace = strReplace.replace(strE, "--");
                this.q.setVisibility(4);
            } else {
                this.q.setVisibility(0);
            }
            SpannableString spannableString = new SpannableString(strReplace);
            if (i3 == 0) {
                iIndexOf = strReplace.indexOf("--");
            } else {
                iIndexOf = strReplace.indexOf(strE);
            }
            int length = i3 != 0 ? strE.length() : 2;
            if (iIndexOf < 0) {
                return spannableString;
            }
            d(spannableString, iIndexOf, length);
            spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(qrs.p() ? R.dimen.health_common_30sp : R.dimen.health_common_30dp)), iIndexOf, length + iIndexOf, 17);
            return spannableString;
        }
        this.q.setVisibility(0);
        try {
            quantityString = BaseApplication.getContext().getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_hour_unit, i2, UnitUtil.e(i2, 1, 0));
        } catch (IllegalFormatConversionException e2) {
            LogUtil.j("BarChartCustomSection", "getTimeSpannableString() strHour IllegalFormatConversionException = ", e2);
        }
        String string = BaseApplication.getContext().getString(com.huawei.ui.commonui.R.string.IDS_two_parts, quantityString, strReplace);
        String strE2 = UnitUtil.e(i2, 1, 0);
        int iLastIndexOf = string.lastIndexOf(strE);
        int iIndexOf2 = string.indexOf(strE2);
        SpannableString spannableString2 = new SpannableString(string);
        if (iLastIndexOf >= 0) {
            d(spannableString2, iLastIndexOf, strE.length());
            spannableString2.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(qrs.p() ? R.dimen.health_common_30sp : R.dimen.health_common_30dp)), iLastIndexOf, strE.length() + iLastIndexOf, 17);
        }
        if (iIndexOf2 >= 0) {
            d(spannableString2, iIndexOf2, strE2.length());
            spannableString2.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(qrs.p() ? R.dimen.health_common_30sp : R.dimen.health_common_30dp)), iIndexOf2, strE2.length() + iIndexOf2, 17);
        }
        return spannableString2;
    }

    private void d(SpannableString spannableString, int i, int i2) {
        if (this.ca == null) {
            LogUtil.d("BarChartCustomSection", "custom typeface is null.,return");
        } else if (Build.VERSION.SDK_INT >= 28) {
            spannableString.setSpan(new HarmonyOsTypefaceSpan(this.ca), i, i2 + i, 17);
        } else {
            spannableString.setSpan(new TypefaceSpan(Constants.FONT), i, i2 + i, 17);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        HashMap map = new HashMap(16);
        map.put("type", "1");
        idy.b(AnalyticsValue.SLEEP_DETAILS_CLICK_21300046.value(), map);
        if (view == null) {
            LogUtil.e("BarChartCustomSection", "onClick View null");
            return;
        }
        if (view.getId() == R.id.left_arrow_iv) {
            this.u.setVisibility(4);
            this.be.setVisibility(4);
            this.bg.setVisibility(4);
            OnClickSectionListener onClickSectionListener = this.i;
            if (onClickSectionListener != null) {
                onClickSectionListener.onClick("BAR_LEFT_ARROW_CLICK_EVENT");
                return;
            }
            return;
        }
        if (view.getId() == R.id.right_arrow_iv) {
            this.u.setVisibility(4);
            this.be.setVisibility(4);
            this.bg.setVisibility(4);
            OnClickSectionListener onClickSectionListener2 = this.i;
            if (onClickSectionListener2 != null) {
                onClickSectionListener2.onClick("BAR_RIGHT_ARROW_CLICK_EVENT");
                return;
            }
            return;
        }
        if (view.getId() == R.id.fitness_detail_time_date_tv) {
            OnClickSectionListener onClickSectionListener3 = this.f7573b;
            if (onClickSectionListener3 != null) {
                onClickSectionListener3.onClick("BAR_CHART_CALENDAR_CLICK_EVENT");
                return;
            }
            return;
        }
        if (view.getId() != R.id.hw_health_fitness_data_origin_icon) {
            LogUtil.e("BarChartCustomSection", "view id is invalid");
            return;
        }
        OnClickSectionListener onClickSectionListener4 = this.i;
        if (onClickSectionListener4 != null) {
            onClickSectionListener4.onClick("BAR_HELP_ICON_CLICK_EVENT");
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public List<Bitmap> getShareBitmap() {
        int height = this.f7574c.getHeight();
        int width = getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, getHeight(), Bitmap.Config.ARGB_4444);
        draw(new Canvas(bitmapCreateBitmap));
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, getHeight() - height, width, height);
        bitmapCreateBitmap.recycle();
        return Collections.singletonList(bitmapCreateBitmap2);
    }

    public String getCurrentDayMsg() {
        HealthTextView healthTextView = this.o;
        if (healthTextView != null) {
            return healthTextView.getText().toString();
        }
        return "";
    }

    public int getmDeviceType() {
        return this.r;
    }

    private void j() {
        this.o = (HealthTextView) this.cf.findViewById(R.id.fitness_detail_time_date_tv);
        this.ae = (ImageView) this.cf.findViewById(R.id.left_arrow_iv);
        this.ah = (LinearLayout) this.cf.findViewById(R.id.linear_left_arrow_iv);
        this.bp = (ImageView) this.cf.findViewById(R.id.right_arrow_iv);
        this.bn = (LinearLayout) this.cf.findViewById(R.id.linear_right_arrow_iv);
        this.bd = (HealthTextView) this.cf.findViewById(R.id.day_time_period);
        this.q = (LinearLayout) this.cf.findViewById(R.id.day_time_duration_time);
        this.be = (LinearLayout) this.cf.findViewById(R.id.time_period_ll_1);
        this.t = (HealthTextView) this.cf.findViewById(R.id.day_time_duration_type);
        this.bq = (HealthTextView) this.cf.findViewById(R.id.common_sleep_sleep_time);
        this.an = (ImageView) this.cf.findViewById(R.id.legend_one_image);
        this.aj = (HealthTextView) this.cf.findViewById(R.id.legend_one_text);
        this.aq = (ImageView) this.cf.findViewById(R.id.legend_two_image);
        this.av = (HealthTextView) this.cf.findViewById(R.id.legend_two_text);
        this.ap = (ImageView) this.cf.findViewById(R.id.legend_three_image);
        this.ar = (HealthTextView) this.cf.findViewById(R.id.legend_three_text);
        this.u = (HealthTextView) this.cf.findViewById(R.id.night_and_noon_hybrid_time);
        this.al = (ImageView) this.cf.findViewById(R.id.legend_four_image);
        this.ak = (HealthTextView) this.cf.findViewById(R.id.legend_four_text);
        this.ai = (ImageView) this.cf.findViewById(R.id.legend_five_image);
        this.am = (HealthTextView) this.cf.findViewById(R.id.legend_five_text);
        this.ao = (ImageView) this.cf.findViewById(R.id.legend_six_image);
        this.as = (HealthTextView) this.cf.findViewById(R.id.legend_six_text);
        this.f = (HealthViewPager) this.cf.findViewById(R.id.fitness_sleep_detail_viewpager);
        this.at = (HealthProgressBar) this.cf.findViewById(R.id.sleep_loading_iv);
        this.au = (HealthTextView) this.cf.findViewById(R.id.custom_progress_dialog_desc);
        this.bl = (HealthTextView) this.cf.findViewById(R.id.custom_progress_dialog_percent);
        this.bj = (HealthTextView) this.cf.findViewById(R.id.processDialog_title_text);
        this.ax = (LinearLayout) this.cf.findViewById(R.id.sleep_loading_layout);
        this.h = (LinearLayout) this.cf.findViewById(R.id.sleep_color_block);
        this.bm = (LinearLayout) this.cf.findViewById(R.id.core_sleep_rem_layout);
        this.bb = (LinearLayout) this.cf.findViewById(R.id.sleep_true_noon_sleep_legend_layout);
        this.f7574c = (RelativeLayout) this.cf.findViewById(R.id.core_sleep_share_image);
        this.w = (ImageView) this.cf.findViewById(R.id.hw_health_fitness_data_origin_icon);
        this.bg = (LinearLayout) this.cf.findViewById(R.id.time_period_ll_2);
        this.bf = (HealthTextView) this.cf.findViewById(R.id.day_time_period_2);
        this.p = (LinearLayout) this.cf.findViewById(R.id.day_time_duration_time_2);
        this.s = (HealthTextView) this.cf.findViewById(R.id.day_time_duration_type_2);
        this.bo = (HealthTextView) this.cf.findViewById(R.id.common_sleep_sleep_time_2);
        this.x = (ImageView) this.cf.findViewById(R.id.hw_health_fitness_data_origin_icon_2);
        lrd.b(this.ae, qre.f(R.string.accessibility_last_day));
        lrd.b(this.ah, qre.f(R.string.accessibility_last_day));
        lrd.b(this.bp, qre.f(R.string.accessibility_next_day));
        lrd.b(this.bn, qre.f(R.string.accessibility_next_day));
    }

    private void setTempDataListAndSleepDataList(HashMap<String, Object> map) {
        List<fra> list = (List) qqw.a(map, "BAR_CHART_DATA_LIST", (Class<Object>) List.class, (Object) null);
        if (list != null) {
            boolean zB = b(map, list);
            this.e = zB;
            LogUtil.a("BarChartCustomSection", "setTempDataListAndSleepDataList isNeedRefresh is ", Boolean.valueOf(zB));
            if (this.e) {
                this.br = list;
            }
            this.bs = new ArrayList(list);
        }
    }

    private boolean b(HashMap<String, Object> map, List<fra> list) {
        List<fra> list2 = this.bs;
        return (list2 != null && njy.c(list2, list, true) && qqw.c(map, "BAR_CHART_COLOR_TYPE", 0) == this.d && qqw.a(map, "BAR_COMMON_IS_PHONE", false) == this.aa && !njy.e(this.br) && qqw.a(map, "BAR_COMMON_IS_MANUAL", false) == this.ac && qqw.a(map, "BAR_CHART_IS_SCIENCE_SLEEP", true) == this.ag && qqw.a(map, "BAR_CHART_IS_TYPE", false) == this.z && !qqw.a(map, "is_need_refresh_chart", false)) ? false : true;
    }
}
