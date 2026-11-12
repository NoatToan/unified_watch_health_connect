package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.TimeSharingFragment;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.lmf;
import defpackage.qjm;
import defpackage.qjp;
import defpackage.qli;
import defpackage.qpn;
import defpackage.qqn;
import defpackage.qqw;
import defpackage.qri;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class SectionPieChart extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewStub f7863a;
    private HealthSubTabWidget aa;
    private HealthTextView ab;
    private HealthTextView ac;
    private LinearLayout ad;
    private View ae;
    private SectionPieChartTrendAdapter af;
    private ViewStub ag;
    private HealthViewPager ah;
    private HealthTextView ai;
    private HealthRingChartAdapter aj;
    private HealthRingChart ak;
    private HealthTextView al;
    private HealthTextView am;
    private View an;
    private int ao;
    private HealthTextView ap;
    private boolean aq;
    private SpannableString ar;
    private String as;
    private ViewStub at;
    private View av;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewStub f7864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnClickSectionListener f7865c;
    private View d;
    private View e;
    private HealthTextView f;
    private HealthTextView g;
    private ImageView h;
    private HealthTextView i;
    private HealthTextView j;
    private SectionPieChartBasicAdapter k;
    private HealthTextView l;
    private LinearLayout m;
    private HealthTextView n;
    private HealthTextView o;
    private LinearLayout p;
    private Context q;
    private View.OnClickListener r;
    private LinearLayout s;
    private HashMap<String, Object> t;
    private boolean u;
    private HealthDivider v;
    private boolean w;
    private boolean x;
    private View y;
    private qpn z;

    public SectionPieChart(Context context) {
        this(context, null);
    }

    public SectionPieChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionPieChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.as = "";
        this.ao = qqn.d(R.color.blood_pressure_subtab_item_text);
        this.aq = false;
        this.w = false;
        this.x = false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionPieChart", "onCreateView");
        this.q = context;
        i();
        return this.an;
    }

    private void i() {
        if (this.an == null) {
            LogUtil.j("SectionPieChart", "initView mainView is null, start to inflate");
            if (qrs.u()) {
                this.an = LayoutInflater.from(this.q).inflate(R.layout.section_pie_chart_trable, (ViewGroup) this, false);
            } else {
                this.an = LayoutInflater.from(this.q).inflate(R.layout.section_pie_chart, (ViewGroup) this, false);
            }
        }
        LinearLayout linearLayout = (LinearLayout) this.an.findViewById(R.id.section_pie_ll);
        this.m = linearLayout;
        linearLayout.setMinimumWidth(qrs.i(this.q));
        this.p = (LinearLayout) this.an.findViewById(R.id.first_layer_left_layout);
        this.f = (HealthTextView) this.an.findViewById(R.id.first_layer_left_top_tv);
        this.i = (HealthTextView) this.an.findViewById(R.id.first_layer_left_left_tv);
        this.s = (LinearLayout) this.an.findViewById(R.id.first_layer_right_layout);
        this.l = (HealthTextView) this.an.findViewById(R.id.first_layer_right_top_tv);
        this.j = (HealthTextView) this.an.findViewById(R.id.first_layer_right_left_tv);
        this.o = (HealthTextView) this.an.findViewById(R.id.first_layer_right_right_tv);
        this.v = (HealthDivider) this.an.findViewById(R.id.section_divider);
        this.y = this.an.findViewById(R.id.second_layer_piechart_container);
        this.ak = (HealthRingChart) this.an.findViewById(R.id.second_layer_piechart);
        this.ap = (HealthTextView) this.an.findViewById(R.id.third_layer_tv);
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.q, new qjm(true, true));
        this.aj = healthRingChartAdapter;
        healthRingChartAdapter.e(new HealthRingChartAdapter.DataFormatter() { // from class: fwj
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return UnitUtil.e(qjpVar.b() * 100.0f, 2, 1);
            }
        }, 1);
        this.ak.setAdapter(this.aj);
        this.f7863a = (ViewStub) this.an.findViewById(R.id.basic_situation_stub);
        this.at = (ViewStub) this.an.findViewById(R.id.trend_stub);
        this.ag = (ViewStub) this.an.findViewById(R.id.time_sharing_stub);
        this.f7864b = (ViewStub) this.an.findViewById(R.id.expand_stub);
        this.r = new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionPieChart.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SectionPieChart.this.c();
                SectionPieChart sectionPieChart = SectionPieChart.this;
                sectionPieChart.aq = !sectionPieChart.aq;
                SectionPieChart sectionPieChart2 = SectionPieChart.this;
                sectionPieChart2.b(sectionPieChart2.aq);
                if (!SectionPieChart.this.aq) {
                    SectionPieChart.this.getKnitFragment().getHealthScrollView().fling(0);
                    SectionPieChart.this.getKnitFragment().getHealthScrollView().smoothScrollTo(0, 0);
                }
                SectionPieChart.this.e();
            }
        };
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionPieChart";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionPieChart", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionPieChart", "no need to bind");
            return;
        }
        this.t = map;
        setText(map);
        e(map);
        j();
        c(map);
    }

    private void e(HashMap<String, Object> map) {
        this.aj.d(qqw.c(map, "SECOND_LAYER_RING_CHART_LEGEND_COLOR", 0));
        List<qjp> listA = qqw.a((Map) map, "SECOND_LAYER_RING_CHART", qjp.class, (List) new ArrayList());
        this.ak.c(listA);
        List listA2 = qqw.a((Map) map, "SECOND_LAYER_RING_CHART_DESC", String.class, (List) new ArrayList());
        if (listA2.size() == 2) {
            this.ak.setDesc((String) listA2.get(0), (String) listA2.get(1));
        }
        final int iC = qqw.c(map, "SECOND_LAYER_RING_CHART_VALUE_UNIT_RES_ID", -16777216);
        this.aj.d(new HealthRingChartAdapter.DataFormatter() { // from class: fwc
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return this.d.d(iC, qjpVar);
            }
        });
        this.ak.c(listA);
        this.ao = qqw.c(map, "THIRD_LAYER_CLICK_TEXT_COLOR", -16777216);
        this.f7865c = (OnClickSectionListener) qqw.a(map, "CLICK_EVENT_LISTENER", (Class<Object>) OnClickSectionListener.class, (Object) null);
        this.as = qqw.d((Map) map, "THIRD_LAYER_TEXT", "");
        this.ar = (SpannableString) qqw.a(map, "THIRD_LAYER_CLICK_TEXT", (Class<SpannableString>) SpannableString.class, new SpannableString(""));
    }

    public /* synthetic */ String d(int i, qjp qjpVar) {
        int iF = (int) qjpVar.f();
        return this.q.getResources().getQuantityString(i, iF, UnitUtil.e(iF, 1, 0));
    }

    private void c(HashMap<String, Object> map) {
        boolean z = qqw.c(map, KnitHealthDetailActivity.KEY_SUB_PAGE_INDEX, 0) != 0;
        this.u = z;
        if (!this.w) {
            this.w = true;
            this.aq = z;
        }
        a(map);
        d(map);
        f(map);
        b(this.t);
    }

    private void d(HashMap<String, Object> map) {
        HealthTextView healthTextView = this.n;
        if (healthTextView != null) {
            healthTextView.setText(qqw.d((Map) map, "BASIC_HEADER_TITLE", ""));
        }
        if (this.k != null) {
            this.k.c(qqw.a((Map) map, "BASIC_DATA", SectionPieChartBasicAdapter.b.class, (List) new ArrayList()));
        }
    }

    private void f(HashMap<String, Object> map) {
        HealthTextView healthTextView = this.al;
        if (healthTextView != null) {
            healthTextView.setText(qqw.d((Map) map, "TREND_HEADER_TITLE", ""));
        }
        qsp.b(this.ab, qqw.d((Map) map, "TREND_TITLE_PRIMARY", ""));
        qsp.b(this.ac, qqw.d((Map) map, "TREND_TITLE_SECONDARY", ""));
        qsp.b(this.am, qqw.d((Map) map, "TREND_INDICATOR_TITLE", ""));
        if (this.af != null) {
            this.af.b(qqw.a((Map) map, "TREND_DATA", SectionPieChartTrendAdapter.a.class, (List) new ArrayList()));
        }
    }

    private void b(HashMap<String, Object> map) {
        Map map2 = (Map) this.t.get("TIME_SHARING_BASIC_DATA");
        Map<String, List<qjp>> map3 = (Map) this.t.get("TIME_SHARING_RING_CHART");
        boolean z = true;
        if (map3 != null && map3.size() == 1) {
            qsp.c(this.ae, 8);
            this.x = false;
            LogUtil.a("SectionPieChart", "hide time share");
            return;
        }
        this.x = true;
        h();
        HealthTextView healthTextView = this.ai;
        if (healthTextView != null) {
            healthTextView.setText(qqw.d((Map) map, "TIME_SHARING_TITLE", ""));
        }
        StringBuilder sb = new StringBuilder("timeSharingBasicMap size: ");
        Object objValueOf = Constants.NULL;
        sb.append(map2 != null ? Integer.valueOf(map2.size()) : Constants.NULL);
        sb.append("timeSharingRingMap size: ");
        if (map3 != null) {
            objValueOf = Integer.valueOf(map3.size());
        }
        sb.append(objValueOf);
        LogUtil.a("SectionPieChart", sb.toString());
        if (this.ah == null || this.aa == null || map2 == null) {
            LogUtil.a("SectionPieChart", "mSubTabWidget, mTimeSharingViewPager or timeSharingBasicMap is null");
            return;
        }
        this.z = new qpn(getKnitFragment().getChildFragmentManager(), this.ah, this.aa);
        this.aa.h();
        HashMap map4 = new HashMap(map2);
        if (LanguageUtil.ba(this.q)) {
            ListIterator listIterator = new ArrayList(map4.entrySet()).listIterator(map4.size());
            while (listIterator.hasPrevious()) {
                e(map3, (Map.Entry) listIterator.previous(), z);
                z = false;
            }
            return;
        }
        Iterator it = map4.entrySet().iterator();
        while (it.hasNext()) {
            e(map3, (Map.Entry) it.next(), z);
            z = false;
        }
    }

    private void e(Map<String, List<qjp>> map, Map.Entry<String, List<SectionPieChartBasicAdapter.b>> entry, boolean z) {
        TimeSharingFragment timeSharingFragmentB = TimeSharingFragment.b();
        timeSharingFragmentB.c(map != null ? map.get(entry.getKey()) : null, getResources().getString(R.string.IDS_blood_pressure_time_point_basic_infomation), entry.getValue());
        timeSharingFragmentB.d(this.ah);
        this.z.b(this.aa.b(entry.getKey()), timeSharingFragmentB, z);
    }

    private void a() {
        if (this.d != null) {
            return;
        }
        View viewInflate = this.f7863a.inflate();
        this.d = viewInflate;
        this.n = (HealthTextView) viewInflate.findViewById(R.id.basic_situation_sub_header);
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.d.findViewById(R.id.basic_recycler_view);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.q));
        SectionPieChartBasicAdapter sectionPieChartBasicAdapter = new SectionPieChartBasicAdapter(this.q);
        this.k = sectionPieChartBasicAdapter;
        healthRecycleView.setAdapter(sectionPieChartBasicAdapter);
        this.n.post(new Runnable() { // from class: com.huawei.health.knit.section.view.SectionPieChart.1
            @Override // java.lang.Runnable
            public void run() {
                if (!SectionPieChart.this.u || SectionPieChart.this.getKnitFragment() == null || SectionPieChart.this.getKnitFragment().getHealthScrollView() == null || SectionPieChart.this.n == null) {
                    return;
                }
                SectionPieChart.this.u = false;
                HealthScrollView healthScrollView = SectionPieChart.this.getKnitFragment().getHealthScrollView();
                int[] iArr = new int[2];
                healthScrollView.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                SectionPieChart.this.n.getLocationOnScreen(iArr2);
                healthScrollView.scrollTo(0, iArr2[1] - iArr[1]);
            }
        });
    }

    private void d() {
        if (this.av != null) {
            return;
        }
        View viewInflate = this.at.inflate();
        this.av = viewInflate;
        this.al = (HealthTextView) viewInflate.findViewById(R.id.trend_sub_header);
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.av.findViewById(R.id.trend_recycler);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.q));
        SectionPieChartTrendAdapter sectionPieChartTrendAdapter = new SectionPieChartTrendAdapter(this.q);
        this.af = sectionPieChartTrendAdapter;
        healthRecycleView.setAdapter(sectionPieChartTrendAdapter);
        this.am = (HealthTextView) this.av.findViewById(R.id.trend_indicator_title);
        this.ad = (LinearLayout) this.av.findViewById(R.id.right_oval_text_layout);
        this.ab = (HealthTextView) this.av.findViewById(R.id.primary_title);
        this.ac = (HealthTextView) this.av.findViewById(R.id.secondary_title);
    }

    private void b() {
        LogUtil.a("SectionPieChart", "inflateTimeSharingIfNeeded");
        if (this.ae != null) {
            return;
        }
        View viewInflate = this.ag.inflate();
        this.ae = viewInflate;
        this.ai = (HealthTextView) viewInflate.findViewById(R.id.time_sharing_sub_header);
        this.ah = (HealthViewPager) this.ae.findViewById(R.id.time_sharing_view_pager);
        this.aa = (HealthSubTabWidget) this.ae.findViewById(R.id.time_sharing_tab_widget);
        this.ah.setIsAutoHeight(true);
        this.ah.setFocusableInTouchMode(false);
        this.ah.requestFocus();
    }

    private void a(HashMap<String, Object> map) {
        DataInfos dataInfos = (DataInfos) qqw.a(map, "DATA_INFO", (Class<DataInfos>) DataInfos.class, DataInfos.BloodPressureDayDetail);
        if (this.d == null && dataInfos != DataInfos.BloodPressureDayDetail) {
            a();
        }
        if (this.av == null && dataInfos != DataInfos.BloodPressureDayDetail) {
            d();
        }
        if (this.ae == null && dataInfos != DataInfos.BloodPressureDayDetail) {
            b();
        }
        if (this.e == null) {
            View viewInflate = this.f7864b.inflate();
            this.e = viewInflate;
            this.h = (ImageView) viewInflate.findViewById(R.id.expand_arrow);
            this.g = (HealthTextView) this.e.findViewById(R.id.expand_arrow_hint);
            this.e.setOnClickListener(this.r);
        }
        b(this.aq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        LogUtil.a("SectionPieChart", "showMoreAnalysis: " + z);
        qsp.e((TextView) this.g, z ? R.string.IDS_hide_analysis : R.string.IDS_more_analysis);
        HealthTextView healthTextView = this.g;
        if (healthTextView != null) {
            healthTextView.setAllCaps(true);
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setRotationX(z ? 180.0f : 0.0f);
        }
        if (!z) {
            b(this.t);
        }
        int i = z ? 0 : 8;
        qsp.c((View) this.v, i);
        qsp.c(this.y, i);
        qsp.c(this.d, i);
        qsp.c(this.av, i);
        h();
        qsp.c((View) this.ap, i);
    }

    private void h() {
        qsp.c(this.ae, (this.aq && this.x) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        int iC = qqw.c(this.t, "DATA_INFO_INDEX", 1);
        if ((iC == 2 || iC == 3) && !this.aq) {
            HashMap map = new HashMap();
            map.put("click", "1");
            map.put("type", Integer.valueOf(iC));
            lmf.d().c(this.q, AnalyticsValue.BLOOD_PRESSURE_MORE_ANALYSIS_2040204.value(), map, 0);
        }
    }

    private void j() {
        setKeywordClickable(this.ap, new SpannableString(this.as), Pattern.compile(this.ar.toString()), new ClickableSpan() { // from class: com.huawei.health.knit.section.view.SectionPieChart.5
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                if (SectionPieChart.this.f7865c != null) {
                    SectionPieChart.this.f7865c.onClick("THIRD_LAYER_CLICK_TEXT");
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        HealthTextView healthTextView = this.ac;
        if (healthTextView == null) {
            LogUtil.a("SectionPieChart", "mSecondaryTitle is null");
        } else {
            final ViewTreeObserver viewTreeObserver = healthTextView.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.view.SectionPieChart.4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (SectionPieChart.this.ad != null && (SectionPieChart.this.ad.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) SectionPieChart.this.ad.getLayoutParams();
                        if (qsp.e(SectionPieChart.this.ac)) {
                            layoutParams.addRule(3, R.id.left_oval_text_layout);
                            layoutParams.addRule(18, R.id.left_oval_text_layout);
                        } else {
                            layoutParams.addRule(17, R.id.left_oval_text_layout);
                        }
                        SectionPieChart.this.ad.setLayoutParams(layoutParams);
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                        return;
                    }
                    LogUtil.a("SectionPieChart", "no need to reshape view");
                }
            });
        }
    }

    public void setKeywordClickable(HealthTextView healthTextView, SpannableString spannableString, Pattern pattern, ClickableSpan clickableSpan) {
        Matcher matcher = pattern.matcher(spannableString.toString());
        while (matcher.find()) {
            String strGroup = matcher.group();
            if (!"".equals(strGroup)) {
                int iIndexOf = spannableString.toString().indexOf(strGroup);
                setClickTextView(healthTextView, spannableString, iIndexOf, iIndexOf + strGroup.length(), clickableSpan);
            }
        }
    }

    public void setClickTextView(HealthTextView healthTextView, SpannableString spannableString, int i, int i2, ClickableSpan clickableSpan) {
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(this.q, R.style.health_basic_click_textview);
        spannableString.setSpan(textAppearanceSpan, i, i2, 33);
        spannableString.setSpan(clickableSpan, i, i2, 33);
        spannableString.setSpan(new ForegroundColorSpan(this.ao), i, i2, 33);
        if (LanguageUtil.q(this.q) && (qrs.af(this.q) || qrs.ah(this.q))) {
            StringBuilder sb = new StringBuilder(spannableString.toString());
            sb.insert(sb.length() - this.ar.length(), "\n");
            SpannableString spannableString2 = new SpannableString(sb);
            int i3 = i2 + 1;
            spannableString2.setSpan(textAppearanceSpan, i, i3, 33);
            spannableString2.setSpan(clickableSpan, i, i2, 33);
            spannableString2.setSpan(new ForegroundColorSpan(this.ao), i, i3, 33);
            healthTextView.setText(spannableString2);
        } else {
            healthTextView.setText(spannableString);
        }
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setText(HashMap<String, Object> map) {
        qsp.b(this.f, qqw.d((Map) map, "FIRST_LAYER_LEFT_TOP", ""));
        qsp.b(this.i, a(qqw.d((Map) map, "FIRST_LAYER_LEFT_LEFT", "")));
        qsp.b(this.l, qqw.d((Map) map, "FIRST_LAYER_RIGHT_TOP", ""));
        qsp.b(this.j, qqw.d((Map) map, "FIRST_LAYER_RIGHT_LEFT", ""));
        this.o.setText(qqw.d((Map) map, "FIRST_LAYER_RIGHT_RIGHT", ""));
        f();
    }

    private void f() {
        if (LanguageUtil.br(getContext()) || LanguageUtil.z(getContext())) {
            LinearLayout linearLayout = this.p;
            if (linearLayout != null) {
                linearLayout.setLayoutDirection(0);
            }
            LinearLayout linearLayout2 = this.s;
            if (linearLayout2 != null) {
                linearLayout2.setLayoutDirection(0);
            }
        }
    }

    private CharSequence a(String str) {
        SpannableString spannableString = new SpannableString(str);
        qri.a(spannableString, str, new ForegroundColorSpan(getResources().getColor(R.color.textColorSecondary)));
        qri.a(spannableString, str, new AbsoluteSizeSpan(12, true));
        qri.a(spannableString, str, new qli(qrr.g()));
        Matcher matcher = Pattern.compile("[\\d\\/]", 2).matcher(spannableString);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            qri.d(spannableString, iStart, iEnd, new TextAppearanceSpan(getContext(), R.style.blood_pressure_data_style));
            qri.b(spannableString, iStart, iEnd);
        }
        return spannableString;
    }
}
