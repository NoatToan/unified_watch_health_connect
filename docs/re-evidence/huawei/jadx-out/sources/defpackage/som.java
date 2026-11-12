package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class som extends CardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48464a;
    private HealthImageView aa;
    private HealthImageView ab;
    private HealthImageView ac;
    private HealthImageView ad;
    private HealthTextView ae;
    private HealthImageView af;
    private HealthImageView ag;
    private HealthImageView ah;
    private HealthTextView ai;
    private HealthTextView aj;
    private HealthTextView ak;
    private List<qdy> al;
    private HealthTextView am;
    private HealthTextView an;
    private RelativeLayout aq;
    private HealthTextView ar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f48465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthImageView f48466c;
    private HealthImageView d;
    private HealthImageView e;
    private RelativeLayout f;
    private RelativeLayout g;
    private RelativeLayout h;
    private LinearLayout i;
    private RelativeLayout j;
    private HealthTextView k;
    private HealthImageView l;
    private HealthSubHeader m;
    private LinearLayout n;
    private View o;
    private HealthTextView p;
    private HealthTextView q;
    private LinearLayout r;
    private HealthTextView s;
    private HealthTextView t;
    private d u;
    private HealthTextView v;
    private HealthProgressBar w;
    private int x;
    private HealthTextView y;
    private HealthImageView z;

    private int c(int i, int i2) {
        if (i > 0 && i2 > 0) {
            return 1;
        }
        if (i <= 0 || i2 != 0) {
            return (i != 0 || i2 <= 0) ? 4 : 3;
        }
        return 2;
    }

    public som(View view, Context context, boolean z) {
        super(view, context, z);
        this.al = new ArrayList();
        this.f48464a = "huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.health-trend?h5pro=true&urlType=4&pName=com.huawei.health&path=tabView&tabName=summary&pullfrom=e1&isComplaint=true";
        this.x = 0;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.health_insights_total_layout);
        this.aq = relativeLayout;
        BaseActivity.setViewSafeRegion(true, relativeLayout);
        d(this.aq);
        d();
        b(view);
        c(view);
        h();
    }

    private void c(View view) {
        this.j = (RelativeLayout) view.findViewById(R.id.insights_data_layout);
        this.ar = (HealthTextView) view.findViewById(R.id.insights_tips_summary_text);
        this.n = (LinearLayout) view.findViewById(R.id.light_data_two);
        this.f = (RelativeLayout) view.findViewById(R.id.info_one);
        this.h = (RelativeLayout) view.findViewById(R.id.info_two);
        this.g = (RelativeLayout) view.findViewById(R.id.info_three);
        this.y = (HealthTextView) view.findViewById(R.id.number_one);
        this.v = (HealthTextView) view.findViewById(R.id.number_two);
        this.f48466c = (HealthImageView) view.findViewById(R.id.domain_one);
        this.e = (HealthImageView) view.findViewById(R.id.domain_two);
        this.d = (HealthImageView) view.findViewById(R.id.domain_three);
        this.aj = (HealthTextView) view.findViewById(R.id.insights_text_one);
        this.an = (HealthTextView) view.findViewById(R.id.insights_text_two);
        this.ak = (HealthTextView) view.findViewById(R.id.insights_text_three);
        this.ai = (HealthTextView) view.findViewById(R.id.tag_one);
        this.am = (HealthTextView) view.findViewById(R.id.tag_two);
        this.ae = (HealthTextView) view.findViewById(R.id.tag_three);
        this.q = (HealthTextView) view.findViewById(R.id.item_two);
        this.p = (HealthTextView) view.findViewById(R.id.item_one);
        this.r = (LinearLayout) view.findViewById(R.id.light_data);
        this.l = (HealthImageView) view.findViewById(R.id.insight_pic);
        this.t = (HealthTextView) view.findViewById(R.id.number_readiness);
        this.k = (HealthTextView) view.findViewById(R.id.body_readiness);
        this.o = view.findViewById(R.id.divider);
    }

    private void b(View view) {
        this.i = (LinearLayout) view.findViewById(R.id.insights_no_data_layout);
        this.s = (HealthTextView) view.findViewById(R.id.insights_tips_text);
        this.ad = (HealthImageView) view.findViewById(R.id.domain_pic_one);
        this.af = (HealthImageView) view.findViewById(R.id.domain_pic_two);
        this.ag = (HealthImageView) view.findViewById(R.id.domain_pic_three);
        this.ab = (HealthImageView) view.findViewById(R.id.domain_pic_four);
        this.ac = (HealthImageView) view.findViewById(R.id.domain_pic_five);
        this.ah = (HealthImageView) view.findViewById(R.id.domain_pic_six);
        this.aa = (HealthImageView) view.findViewById(R.id.domain_pic_seven);
        this.z = (HealthImageView) view.findViewById(R.id.domain_pic_eight);
        this.w = (HealthProgressBar) view.findViewById(R.id.network_loading_pic);
        this.f48465b = (HealthTextView) view.findViewById(R.id.insights_guide_text);
    }

    public void d() {
        if (this.m == null) {
            this.m = (HealthSubHeader) this.itemView.findViewById(R.id.section_insights_sub_header);
        }
        this.m.setSubHeaderBackgroundColor(qre.e(R.color.common_transparent));
        this.m.setMoreText(qre.f(R.string.IDS_function_set_card_button_blood_pressure));
        this.m.setHeadTitleText(ezf.a());
        this.m.setHeadTitleTextColor(qre.e(R.color.colorSubHeaderText));
        this.m.setMoreViewClickListener(new View.OnClickListener() { // from class: som.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    LogUtil.a("HealthInsightsCardDataCardViewHolder", "click too fast");
                    return;
                }
                HashMap map = new HashMap();
                map.put("event", 1);
                map.put(FunctionSetBeanReader.BI_ELEMENT, "m0");
                som.this.c(map);
                AppRouter.e(Uri.parse(som.this.f48464a)).e(268435456).b(BaseApplication.getContext());
            }
        });
    }

    private void d(View view) {
        if (view == null) {
            return;
        }
        if (this.u == null) {
            this.u = new d(this, view);
        }
        qsp.a(view, this.u);
    }

    private void h() {
        this.aq.setOnClickListener(new View.OnClickListener() { // from class: som.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    LogUtil.a("HealthInsightsCardDataCardViewHolder", "click too fast");
                    return;
                }
                HashMap map = new HashMap();
                map.put("event", 1);
                map.put(FunctionSetBeanReader.BI_ELEMENT, "m1");
                som.this.c(map);
                AppRouter.e(Uri.parse(som.this.f48464a)).e(268435456).b(BaseApplication.getContext());
            }
        });
    }

    private void a(qee qeeVar) {
        int iA;
        LogUtil.a("HealthInsightsCardDataCardViewHolder", "showHasDataCard");
        qdz qdzVarB = qeeVar.b();
        if (qdzVarB == null) {
            LogUtil.j("HealthInsightsCardDataCardViewHolder", "indexCard is null ");
            return;
        }
        List<qdy> listD = qdzVarB.d();
        if (njy.e(listD)) {
            LogUtil.j("HealthInsightsCardDataCardViewHolder", "indexCardTextInfos is empty");
            return;
        }
        this.al = new ArrayList(listD);
        qdw qdwVarA = qeeVar.a();
        int iB = 0;
        int size = qdwVarA != null ? qdwVarA.b().size() : 0;
        if (qdzVarB.e() != null) {
            qdt qdtVarE = qdzVarB.e();
            iB = qdtVarE.b();
            iA = qdtVarE.a();
        } else {
            iA = 0;
        }
        LogUtil.a("HealthInsightsCardDataCardViewHolder", "numberTotal is: ", Integer.valueOf(size), " numberException is: ", Integer.valueOf(iB), " numberChange is: ", Integer.valueOf(iA), "indexCardTextInfos size is: ", Integer.valueOf(listD.size()));
        this.x = c(iB, iA);
        if (size == 0) {
            LogUtil.j("HealthInsightsCardDataCardViewHolder", "numberTotal is 0");
            size = listD.size();
        }
        int iA2 = qdm.a(qdwVarA);
        LogUtil.a("HealthInsightsCardDataCardViewHolder", "bodyReadinessValue is: ", Integer.valueOf(iA2));
        e(size, iA2, iB, iA, this.x, listD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(final qee qeeVar) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: soq
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(qeeVar);
                }
            });
            return;
        }
        LogUtil.a("HealthInsightsCardDataCardViewHolder", "showEmptyData");
        this.x = 0;
        this.al = new ArrayList();
        this.s.setText(ezf.c());
        List<qdu> listD = qeeVar.d();
        if (njy.e(listD)) {
            LogUtil.a("HealthInsightsCardDataCardViewHolder", "dayRemainsList is empty");
            b();
        } else {
            a(e(listD));
        }
    }

    private void a(final List<qdu> list) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: soo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48472b.b(list);
                }
            });
            return;
        }
        qdu qduVar = list.get(0);
        String strB = qduVar.b();
        int iA = qduVar.a();
        this.j.setVisibility(8);
        this.i.setVisibility(0);
        this.w.setVisibility(8);
        a(this.f48465b, strB, iA);
        if (list.size() != 8) {
            LogUtil.j("HealthInsightsCardDataCardViewHolder", "remainsLists is not total num");
            return;
        }
        e(this.ad, list, 0);
        e(this.af, list, 1);
        e(this.ag, list, 2);
        e(this.ab, list, 3);
        e(this.ac, list, 4);
        e(this.ah, list, 5);
        e(this.aa, list, 6);
        e(this.z, list, 7);
    }

    /* synthetic */ void b(List list) {
        a((List<qdu>) list);
    }

    private void e(HealthImageView healthImageView, List<qdu> list, int i) {
        qdu qduVar = list.get(i);
        if (qduVar == null) {
            LogUtil.j("HealthInsightsCardDataCardViewHolder", "remains is num");
        } else {
            healthImageView.setImageResource(qdm.e(qduVar.b(), ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: sor
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48474c.g();
                }
            });
            return;
        }
        this.j.setVisibility(8);
        this.i.setVisibility(0);
        this.w.setVisibility(0);
        if (!NetworkUtil.i()) {
            this.f48465b.setText(qre.f(com.huawei.health.servicesapi.R.string.IDS_insights_network_tips));
        } else {
            this.f48465b.setText(ezf.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void b() {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: soi
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b();
                }
            });
            return;
        }
        this.j.setVisibility(8);
        this.i.setVisibility(0);
        if (!NetworkUtil.i()) {
            this.w.setVisibility(0);
            this.f48465b.setText(qre.f(com.huawei.health.servicesapi.R.string.IDS_insights_network_tips));
        } else {
            this.w.setVisibility(8);
            this.f48465b.setText(ezf.d());
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
            if (qduVar.b() != null && !qduVar.b().equals("calorie") && !qduVar.b().equals("activeHour") && !qduVar.b().equals("exerciseTimeLen") && !qduVar.b().equals("readiness") && !arrayList.contains(qduVar)) {
                qduVar.c(qdm.b(qduVar.b()));
                arrayList.add(qduVar);
            }
        }
        arrayList.sort(new Comparator<qdu>() { // from class: som.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
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
        LogUtil.a("HealthInsightsCardDataCardViewHolder", "remainsLists size is: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private void a(TextView textView, qdy qdyVar, int i, int i2) {
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
        qdy qdyVar = list.get(i - 1);
        if (TextUtils.isEmpty(qdyVar.a())) {
            relativeLayout.setVisibility(8);
            LogUtil.j("HealthInsightsCardDataCardViewHolder", "indexCardOne text ie null");
            return;
        }
        relativeLayout.setVisibility(0);
        textView.setText(qdyVar.a());
        healthImageView.setImageResource(qdm.e(qdyVar.d(), qdyVar.e()));
        if (qdm.i(qdyVar.b())) {
            i2 = com.huawei.ui.main.R.color.dynamic_blood_pressure_high;
            i3 = com.huawei.ui.main.R.drawable.insight_card_red;
        } else if (qdm.e(qdyVar.b())) {
            i2 = com.huawei.ui.main.R.color.insight_tag_text_better_color;
            i3 = com.huawei.ui.main.R.drawable.insight_card_green;
        } else if (qdm.g(qdyVar.b())) {
            i2 = com.huawei.ui.main.R.color.insight_tag_text_worse_color;
            i3 = com.huawei.ui.main.R.drawable.insight_card_orange;
        } else if (qdm.f(qdyVar.b())) {
            i2 = com.huawei.ui.main.R.color.sleep_suggest_content;
            i3 = com.huawei.ui.main.R.drawable.insight_card_grey;
        } else {
            i2 = -1;
            i3 = -1;
        }
        if (i2 != -1 && i3 != -1) {
            a(textView2, qdyVar, i2, i3);
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

    private void c(HealthTextView healthTextView, int i, int i2) {
        String strE = UnitUtil.e(i, 1, 0);
        SpannableString spannableString = new SpannableString(qre.e(i2, i, strE));
        qri.c(spannableString, strE, qre.b(com.huawei.ui.main.R.dimen.health_common_24sp));
        qri.a(spannableString, strE, new ForegroundColorSpan(qre.e(com.huawei.healthcloud.plugintrack.R.color.textColorPrimary)));
        qri.a(spannableString, strE, new StyleSpan(1));
        healthTextView.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void e(final int i, final int i2, final int i3, final int i4, final int i5, final List<qdy> list) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: sok
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48462b.e(i, i2, i3, i4, i5, list);
                }
            });
            return;
        }
        this.i.setVisibility(8);
        this.j.setVisibility(0);
        this.ar.setVisibility(0);
        this.ar.setText(qre.f(com.huawei.health.servicesapi.R.string.IDS_insights_data_summary_one));
        if (i5 == 1) {
            this.n.setVisibility(0);
            c(this.p, i3, R.plurals.IDS_summary_count);
            c(this.q, i4, R.plurals.IDS_summary_count);
            this.y.setText(R.string.IDS_insights_data_exception);
            this.v.setText(R.string.IDS_insights_data_change);
        } else if (i5 == 2) {
            this.n.setVisibility(8);
            c(this.p, i3, R.plurals.IDS_summary_count);
            this.y.setText(R.string.IDS_insights_data_exception);
        } else if (i5 == 3) {
            this.n.setVisibility(8);
            c(this.p, i4, R.plurals.IDS_summary_count);
            this.y.setText(R.string.IDS_insights_data_change);
        } else {
            this.n.setVisibility(8);
            c(this.p, i, R.plurals.IDS_summary_count);
            this.y.setText(R.string.IDS_insights_data_analysis);
        }
        d(this.aj, this.ai, this.f48466c, list, this.f, 1);
        d(this.an, this.am, this.e, list, this.h, 2);
        d(this.ak, this.ae, this.d, list, this.g, 3);
        b(i2);
        this.j.post(new Runnable() { // from class: sop
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a();
            }
        });
    }

    /* synthetic */ void a() {
        if (this.j.isShown()) {
            LogUtil.a("HealthInsightsCardDataCardViewHolder", "insightDataLayout invalidate");
            this.j.invalidate();
        }
    }

    private void b(int i) {
        LogUtil.a("HealthInsightsCardDataCardViewHolder", "enter updateBodyReadiness");
        if (i == -1) {
            this.l.setImageResource(R.mipmap.insight_pic);
            this.t.setVisibility(8);
            this.k.setVisibility(8);
            this.o.setVisibility(8);
            return;
        }
        int iC = qdm.c(i);
        if (iC >= 0 && iC <= 4) {
            this.l.setImageResource(qdm.b(iC));
            this.t.setVisibility(0);
            this.k.setVisibility(0);
            this.o.setVisibility(0);
            this.t.setText(UnitUtil.e(i, 1, 0));
            this.t.setTextColor(qdm.d(iC));
            this.k.setTextColor(qdm.d(iC));
            return;
        }
        LogUtil.j("HealthInsightsCardDataCardViewHolder", "bodyReadinessValue is error");
        this.l.setImageResource(R.mipmap.insight_pic);
        this.t.setVisibility(8);
        this.k.setVisibility(8);
        this.o.setVisibility(8);
    }

    public void c() {
        qee qeeVarF = qdm.f();
        if (qeeVarF == null) {
            LogUtil.a("HealthInsightsCardDataCardViewHolder", "response ie null");
            this.x = 0;
            g();
            return;
        }
        d(qeeVarF);
    }

    public void d(qee qeeVar) {
        if (qeeVar == null) {
            LogUtil.a("HealthInsightsCardDataCardViewHolder", "response ie null");
            this.x = 0;
            b();
            return;
        }
        qdz qdzVarB = qeeVar.b();
        if (qdzVarB == null) {
            LogUtil.a("HealthInsightsCardDataCardViewHolder", "indexCard is null");
            b(qeeVar);
        } else if (njy.e(qdzVarB.d())) {
            LogUtil.a("HealthInsightsCardDataCardViewHolder", "indexCardTextInfos is empty");
            b(qeeVar);
        } else {
            a(qeeVar);
        }
    }

    public void e() {
        qsp.b(this.aq, this.u);
    }

    private Pair<String, String> j() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (njy.e(this.al)) {
            return new Pair<>(sb.toString(), sb2.toString());
        }
        for (int i = 0; i < this.al.size(); i++) {
            qdy qdyVar = this.al.get(i);
            sb.append(" ");
            sb.append(qdyVar.d());
            sb2.append(" ");
            sb2.append(qre.f(qdm.a(qdyVar.b())));
        }
        return new Pair<>(sb.toString(), sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        Pair<String, String> pairJ = j();
        map.put("pageId", "Today_0001");
        if (this.x == 0) {
            map.put("value", "locked");
        } else {
            map.put("value", "unlocked");
        }
        map.put("moduleName", "featured_summary");
        HashMap map2 = new HashMap();
        map2.put("action", 0);
        map2.put("moduleName", "featured_summary");
        map2.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, pairJ.first);
        map2.put("reminderData", pairJ.second);
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(map2);
        lmnVar.d(arrayList);
        LogUtil.a("HealthInsightsCardDataCardViewHolder", "uploadBiEvent health insights card visible, 2010222: ", lmnVar.toString());
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.HEALTH_INSIGHTS_CARD_2010222.value(), lmnVar, 0);
    }

    static class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<View> f48469a;
        private final WeakReference<som> e;

        public d(som somVar, View view) {
            this.e = new WeakReference<>(somVar);
            this.f48469a = new WeakReference<>(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            som somVar = this.e.get();
            View view = this.f48469a.get();
            if (somVar == null || view == null || view.getVisibility() != 0) {
                return;
            }
            HashMap map = new HashMap();
            map.put("event", 0);
            map.put(FunctionSetBeanReader.BI_ELEMENT, "m0");
            somVar.c(map);
            qsp.b(view, this);
        }
    }
}
