package com.huawei.health.knit.section.homesection;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.ezf;
import defpackage.lmf;
import defpackage.lmn;
import defpackage.njy;
import defpackage.qdm;
import defpackage.qdt;
import defpackage.qdu;
import defpackage.qdw;
import defpackage.qdy;
import defpackage.qdz;
import defpackage.qee;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HealthInsightsCardSection extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7494a;
    private HealthTextView aa;
    private List<qdy> ab;
    private HealthTextView ac;
    private int ad;
    private RelativeLayout ae;
    private HealthTextView af;
    private HealthTextView ag;
    private HealthTextView ah;
    private HealthTextView ai;
    private e aj;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthImageView f7495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthImageView f7496c;
    private HealthImageView d;
    private HealthTextView e;
    private LinearLayout f;
    private RelativeLayout g;
    private RelativeLayout h;
    private RelativeLayout i;
    private RelativeLayout j;
    private HealthSubHeader k;
    private HealthProgressBar l;
    private View m;
    private HealthTextView n;
    private LinearLayout o;
    private HealthTextView p;
    private HealthImageView q;
    private HealthTextView r;
    private HealthImageView s;
    private HealthImageView t;
    private HealthImageView u;
    private HealthImageView v;
    private HealthImageView w;
    private HealthImageView x;
    private HealthImageView y;
    private HealthTextView z;

    private int b(int i, int i2) {
        if (i > 0 && i2 > 0) {
            return 1;
        }
        if (i <= 0 || i2 != 0) {
            return (i != 0 || i2 <= 0) ? 4 : 3;
        }
        return 2;
    }

    public HealthInsightsCardSection(Context context) {
        super(context);
        this.ab = new ArrayList();
        this.ad = 0;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.f7494a = context;
        long jCurrentTimeMillis = System.currentTimeMillis();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.health_insights, (ViewGroup) this, false);
        this.m = viewInflate;
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.health_insights_total_layout);
        this.ae = relativeLayout;
        BaseActivity.setViewSafeRegion(true, relativeLayout);
        setBiEventListener(this.ae);
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.m.findViewById(R.id.section_insights_sub_header);
        this.k = healthSubHeader;
        healthSubHeader.setHeadTitleTextColor(qre.e(R.color.colorSubHeaderText));
        e();
        setNoDataViewItem(this.m);
        setHasDataViewItem(this.m);
        b();
        d();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.m.getLayoutParams();
        layoutParams.height = -2;
        this.m.setLayoutParams(layoutParams);
        this.m.setVisibility(0);
        LogUtil.a("HealthInsightsCardSection", "getCardViewHolder total time is ：", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return this.m;
    }

    private void setHasDataViewItem(View view) {
        this.g = (RelativeLayout) view.findViewById(R.id.insights_data_layout);
        this.af = (HealthTextView) view.findViewById(R.id.insights_tips_summary_text);
        this.o = (LinearLayout) view.findViewById(R.id.light_data_two);
        this.i = (RelativeLayout) view.findViewById(R.id.info_one);
        this.h = (RelativeLayout) view.findViewById(R.id.info_two);
        this.j = (RelativeLayout) view.findViewById(R.id.info_three);
        this.r = (HealthTextView) view.findViewById(R.id.number_one);
        this.p = (HealthTextView) view.findViewById(R.id.number_two);
        this.d = (HealthImageView) view.findViewById(R.id.domain_one);
        this.f7495b = (HealthImageView) view.findViewById(R.id.domain_two);
        this.f7496c = (HealthImageView) view.findViewById(R.id.domain_three);
        this.ai = (HealthTextView) view.findViewById(R.id.insights_text_one);
        this.ah = (HealthTextView) view.findViewById(R.id.insights_text_two);
        this.ag = (HealthTextView) view.findViewById(R.id.insights_text_three);
        this.ac = (HealthTextView) view.findViewById(R.id.tag_one);
        this.z = (HealthTextView) view.findViewById(R.id.tag_two);
        this.aa = (HealthTextView) view.findViewById(R.id.tag_three);
    }

    private void setNoDataViewItem(View view) {
        this.f = (LinearLayout) view.findViewById(R.id.insights_no_data_layout);
        this.n = (HealthTextView) view.findViewById(R.id.insights_tips_text);
        this.y = (HealthImageView) view.findViewById(R.id.domain_pic_one);
        this.w = (HealthImageView) view.findViewById(R.id.domain_pic_two);
        this.x = (HealthImageView) view.findViewById(R.id.domain_pic_three);
        this.s = (HealthImageView) view.findViewById(R.id.domain_pic_four);
        this.q = (HealthImageView) view.findViewById(R.id.domain_pic_five);
        this.v = (HealthImageView) view.findViewById(R.id.domain_pic_six);
        this.u = (HealthImageView) view.findViewById(R.id.domain_pic_seven);
        this.t = (HealthImageView) view.findViewById(R.id.domain_pic_eight);
        this.l = (HealthProgressBar) view.findViewById(R.id.network_loading_pic);
        this.e = (HealthTextView) view.findViewById(R.id.insights_guide_text);
    }

    private void e() {
        this.k.setSubHeaderBackgroundColor(qre.e(R.color.common_transparent));
        this.k.setMoreText(qre.f(R.string.IDS_function_set_card_button_blood_pressure));
        this.k.setHeadTitleText(ezf.a());
        this.k.setHeadTitleTextColor(qre.e(R.color.colorSubHeaderText));
        this.k.setMoreViewClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.homesection.HealthInsightsCardSection.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    LogUtil.a("HealthInsightsCardSection", "click too fast");
                    return;
                }
                HashMap map = new HashMap();
                map.put("event", 1);
                map.put(FunctionSetBeanReader.BI_ELEMENT, "m0");
                HealthInsightsCardSection.this.setBiEvent(map);
                AppRouter.e(Uri.parse("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.health-trend?h5pro=true&urlType=4&pName=com.huawei.health&path=tabView&tabName=summary&pullfrom=e1&isComplaint=true")).e(268435456).b(BaseApplication.getContext());
            }
        });
    }

    private void setBiEventListener(View view) {
        if (view == null) {
            return;
        }
        if (this.aj == null) {
            this.aj = new e(this, view);
        }
        qsp.a(view, this.aj);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("HealthInsightsCardSection", "bindParamsToView");
        if (map == null || map.size() == 0) {
            LogUtil.a("HealthInsightsCardSection", "no need to bind");
            return;
        }
        if (qqw.a(map, "INIT_CARD_DATA", false)) {
            d();
        }
        qee qeeVar = (qee) qqw.a(map, "REFRESH_CARD_DATA", (Class<Object>) qee.class, (Object) null);
        if (qeeVar != null) {
            a(qeeVar);
        }
        if (qqw.a(map, "DESTROY", false)) {
            c();
        }
    }

    private void b() {
        this.ae.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.homesection.HealthInsightsCardSection.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    LogUtil.a("HealthInsightsCardSection", "click too fast");
                    return;
                }
                HashMap map = new HashMap();
                map.put("event", 1);
                map.put(FunctionSetBeanReader.BI_ELEMENT, "m1");
                HealthInsightsCardSection.this.setBiEvent(map);
                AppRouter.e(Uri.parse("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.health-trend?h5pro=true&urlType=4&pName=com.huawei.health&path=tabView&tabName=summary&pullfrom=e1&isComplaint=true")).e(268435456).b(BaseApplication.getContext());
            }
        });
    }

    private void e(qee qeeVar) {
        int iA;
        int size;
        LogUtil.a("HealthInsightsCardSection", "showHasDataCard");
        qdz qdzVarB = qeeVar.b();
        if (qdzVarB == null) {
            LogUtil.j("HealthInsightsCardSection", "indexCard is null ");
            return;
        }
        List<qdy> listD = qdzVarB.d();
        if (njy.e(listD)) {
            LogUtil.j("HealthInsightsCardSection", "indexCardTextInfos is empty");
            return;
        }
        this.ab = new ArrayList(listD);
        qdw qdwVarA = qeeVar.a();
        int iB = 0;
        int size2 = qdwVarA != null ? qdwVarA.b().size() : 0;
        if (qdzVarB.e() != null) {
            qdt qdtVarE = qdzVarB.e();
            iB = qdtVarE.b();
            iA = qdtVarE.a();
        } else {
            iA = 0;
        }
        LogUtil.a("HealthInsightsCardSection", "numberTotal is: ", Integer.valueOf(size2), " numberException is: ", Integer.valueOf(iB), " numberChange is: ", Integer.valueOf(iA), "indexCardTextInfos size is: ", Integer.valueOf(listD.size()));
        this.ad = b(iB, iA);
        if (size2 == 0) {
            LogUtil.j("HealthInsightsCardSection", "numberTotal is 0");
            size = listD.size();
        } else {
            size = size2;
        }
        e(size, iB, iA, this.ad, listD);
    }

    private void b(qee qeeVar) {
        LogUtil.a("HealthInsightsCardSection", "showEmptyData");
        this.ad = 0;
        this.ab = new ArrayList();
        this.n.setText(ezf.c());
        List<qdu> listD = qeeVar.d();
        if (njy.e(listD)) {
            LogUtil.a("HealthInsightsCardSection", "dayRemainsList is empty");
            a();
        } else {
            a(e(listD));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(final List<qdu> list) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: frr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34451c.a(list);
                }
            });
            return;
        }
        if (njy.e(list)) {
            LogUtil.a("HealthInsightsCardSection", "remainsLists is empty");
            return;
        }
        qdu qduVar = list.get(0);
        String strB = qduVar.b();
        int iA = qduVar.a();
        this.g.setVisibility(8);
        this.f.setVisibility(0);
        this.l.setVisibility(8);
        a(this.e, strB, iA);
        if (list.size() != 8) {
            LogUtil.j("HealthInsightsCardSection", "remainsLists is not total num");
            return;
        }
        b(this.y, list, 0);
        b(this.w, list, 1);
        b(this.x, list, 2);
        b(this.s, list, 3);
        b(this.q, list, 4);
        b(this.v, list, 5);
        b(this.u, list, 6);
        b(this.t, list, 7);
    }

    private void b(HealthImageView healthImageView, List<qdu> list, int i) {
        qdu qduVar = list.get(i);
        if (qduVar == null) {
            LogUtil.j("HealthInsightsCardSection", "remains is num");
        } else {
            healthImageView.setImageResource(qdm.e(qduVar.b(), ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: frx
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.f();
                }
            });
            return;
        }
        this.g.setVisibility(8);
        this.f.setVisibility(0);
        this.l.setVisibility(0);
        if (!NetworkUtil.i()) {
            this.e.setText(qre.f(com.huawei.health.servicesapi.R.string.IDS_insights_network_tips));
        } else {
            this.e.setText(ezf.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a() {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: fry
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34460a.a();
                }
            });
            return;
        }
        this.g.setVisibility(8);
        this.f.setVisibility(0);
        if (!NetworkUtil.i()) {
            this.l.setVisibility(0);
            this.e.setText(qre.f(com.huawei.health.servicesapi.R.string.IDS_insights_network_tips));
        } else {
            this.l.setVisibility(8);
            this.e.setText(ezf.d());
        }
    }

    private boolean e(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("sleep") || str.equals("heartHealth") || str.equals("emotionalHealth") || str.equals(MessageConstant.BLOOD_PRESSURE_TYPE);
    }

    private List<qdu> e(List<qdu> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            qdu qduVar = list.get(i);
            if (qduVar.b() != null && !qduVar.b().equals("calorie") && !qduVar.b().equals("activeHour") && !qduVar.b().equals("exerciseTimeLen") && !arrayList.contains(qduVar)) {
                qduVar.c(qdm.b(qduVar.b()));
                arrayList.add(qduVar);
            }
        }
        arrayList.sort(new Comparator<qdu>() { // from class: com.huawei.health.knit.section.homesection.HealthInsightsCardSection.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(qdu qduVar2, qdu qduVar3) {
                int iD;
                int iD2;
                if (qduVar2.a() != qduVar3.a()) {
                    iD = qduVar2.a();
                    iD2 = qduVar3.a();
                } else {
                    iD = qduVar2.d();
                    iD2 = qduVar3.d();
                }
                return iD - iD2;
            }
        });
        LogUtil.a("HealthInsightsCardSection", "remainsLists size is: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private void d(TextView textView, qdy qdyVar, int i, int i2) {
        int iD = qrs.d(BaseApplication.getContext(), 1.0f);
        int iD2 = qrs.d(BaseApplication.getContext(), 4.0f);
        textView.setPadding(iD2, iD, iD2, iD);
        textView.setVisibility(0);
        textView.setText(qdm.a(qdyVar.b()));
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), i));
        textView.setBackgroundResource(i2);
    }

    private void d(TextView textView, TextView textView2, HealthImageView healthImageView, List<qdy> list, RelativeLayout relativeLayout, int i) {
        int i2;
        int i3;
        if (list.size() < i) {
            relativeLayout.setVisibility(8);
            return;
        }
        relativeLayout.setVisibility(0);
        qdy qdyVar = list.get(i - 1);
        if (TextUtils.isEmpty(qdyVar.a())) {
            relativeLayout.setVisibility(8);
            LogUtil.j("HealthInsightsCardSection", "indexCardOne text ie null");
            return;
        }
        textView.setText(qdyVar.a());
        healthImageView.setImageResource(qdm.e(qdyVar.d(), qdyVar.e()));
        if (qdm.i(qdyVar.b())) {
            i2 = R.color.dynamic_blood_pressure_high;
            i3 = R.drawable.insight_card_red;
        } else if (qdm.e(qdyVar.b())) {
            i2 = R.color.insight_tag_text_better_color;
            i3 = R.drawable.insight_card_green;
        } else if (qdm.g(qdyVar.b())) {
            i2 = R.color.insight_tag_text_worse_color;
            i3 = R.drawable.insight_card_orange;
        } else if (qdm.f(qdyVar.b())) {
            i2 = R.color.sleep_suggest_content;
            i3 = R.drawable.insight_card_grey;
        } else {
            i2 = -1;
            i3 = -1;
        }
        if (i2 != -1 && i3 != -1) {
            d(textView2, qdyVar, i2, i3);
        } else {
            textView2.setVisibility(8);
        }
    }

    private void a(HealthTextView healthTextView, String str, int i) {
        String strE;
        String strF = qre.f(qdm.c(str));
        if (TextUtils.isEmpty(strF)) {
            strF = ezf.a();
        }
        if (e(str)) {
            strE = qre.e(R.plurals.IDS_summary_watch_day_need, i, strF, UnitUtil.e(i, 1, 0));
        } else {
            strE = qre.e(R.plurals.IDS_summary_app_day_need, i, strF, UnitUtil.e(i, 1, 0));
        }
        SpannableString spannableString = new SpannableString(strE);
        qri.b(spannableString, strF, R.color.emui_end_color);
        qri.e(spannableString, String.valueOf(i), R.string.textFontFamilyMedium);
        healthTextView.setText(spannableString);
    }

    private void a(HealthTextView healthTextView, int i, int i2) {
        String strE = UnitUtil.e(i, 1, 0);
        SpannableString spannableString = new SpannableString(qre.e(i2, i, strE));
        qri.c(spannableString, strE, qre.b(R.dimen.health_common_24sp));
        qri.a(spannableString, strE, new ForegroundColorSpan(qre.e(R.color.textColorPrimary)));
        qri.a(spannableString, strE);
        healthTextView.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void e(final int i, final int i2, final int i3, final int i4, final List<qdy> list) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: frv
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(i, i2, i3, i4, list);
                }
            });
            return;
        }
        this.f.setVisibility(8);
        this.g.setVisibility(0);
        this.af.setVisibility(0);
        this.af.setText(qre.f(com.huawei.health.servicesapi.R.string.IDS_insights_data_summary_one));
        if (i4 == 1) {
            this.o.setVisibility(0);
            a(this.r, i2, R.plurals.IDS_highlight_data_exception_item);
            a(this.p, i3, R.plurals.IDS_highlight_data_change_item);
        } else if (i4 == 2) {
            this.o.setVisibility(8);
            a(this.r, i2, R.plurals.IDS_highlight_data_exception_item);
        } else if (i4 == 3) {
            this.o.setVisibility(8);
            a(this.r, i3, R.plurals.IDS_highlight_data_change_item);
        } else {
            this.o.setVisibility(8);
            a(this.r, i, R.plurals.IDS_highlight_data_analysis_item);
        }
        d(this.ai, this.ac, this.d, list, this.i, 1);
        d(this.ah, this.z, this.f7495b, list, this.h, 2);
        d(this.ag, this.aa, this.f7496c, list, this.j, 3);
    }

    public void d() {
        qee qeeVarF = qdm.f();
        if (qeeVarF == null) {
            LogUtil.a("HealthInsightsCardSection", "response is null");
            this.ad = 0;
            f();
            return;
        }
        a(qeeVarF);
    }

    public void a(qee qeeVar) {
        if (qeeVar == null) {
            LogUtil.a("HealthInsightsCardSection", "response ie null");
            this.ad = 0;
            a();
            return;
        }
        qdz qdzVarB = qeeVar.b();
        if (qdzVarB == null) {
            LogUtil.a("HealthInsightsCardSection", "indexCard is null");
            b(qeeVar);
        } else if (njy.e(qdzVarB.d())) {
            LogUtil.a("HealthInsightsCardSection", "indexCardTextInfos is empty");
            b(qeeVar);
        } else {
            e(qeeVar);
        }
    }

    public void c() {
        qsp.b(this.ae, this.aj);
    }

    private Pair<String, String> getBiExtendData() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (njy.e(this.ab)) {
            return new Pair<>(sb.toString(), sb2.toString());
        }
        for (int i = 0; i < this.ab.size(); i++) {
            qdy qdyVar = this.ab.get(i);
            sb.append(" ");
            sb.append(qdyVar.d());
            sb2.append(" ");
            sb2.append(qre.f(qdm.a(qdyVar.b())));
        }
        return new Pair<>(sb.toString(), sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBiEvent(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        Pair<String, String> biExtendData = getBiExtendData();
        map.put("pageId", "Today_0001");
        if (this.ad == 0) {
            map.put("value", "locked");
        } else {
            map.put("value", "unlocked");
        }
        map.put("moduleName", "featured_summary");
        HashMap map2 = new HashMap();
        map2.put("action", 0);
        map2.put("moduleName", "featured_summary");
        map2.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, biExtendData.first);
        map2.put("reminderData", biExtendData.second);
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(map2);
        lmnVar.d(arrayList);
        LogUtil.a("HealthInsightsCardSection", "uploadBiEvent health insights card visible, 2010222: ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.HEALTH_INSIGHTS_CARD_2010222.value(), lmnVar, 0);
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener {
        private final WeakReference<View> d;
        private final WeakReference<HealthInsightsCardSection> e;

        public e(HealthInsightsCardSection healthInsightsCardSection, View view) {
            this.e = new WeakReference<>(healthInsightsCardSection);
            this.d = new WeakReference<>(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            HealthInsightsCardSection healthInsightsCardSection = this.e.get();
            View view = this.d.get();
            if (healthInsightsCardSection == null || view == null || view.getVisibility() != 0) {
                return;
            }
            HashMap map = new HashMap();
            map.put("event", 0);
            map.put(FunctionSetBeanReader.BI_ELEMENT, "m0");
            healthInsightsCardSection.setBiEvent(map);
            qsp.b(view, this);
        }
    }
}
