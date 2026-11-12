package com.huawei.health.marketing.views;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.QuestionnaireTemplate;
import com.huawei.health.marketing.request.ColumnRequestUtils;
import com.huawei.health.marketing.request.QuestionOptionReq;
import com.huawei.health.marketing.request.QuestionResultReq;
import com.huawei.health.marketing.request.QuestionResultRsp;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fxk;
import defpackage.fya;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class QuestionAndAnswerLayout extends LinearLayout implements View.OnClickListener, ResourceBriefInfoOwnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f8392a;
    private HealthTextView aa;
    private LinearLayout ab;
    private HealthTextView ac;
    private HealthTextView ad;
    private LinearLayout ae;
    private HealthTextView af;
    private HealthImageView ag;
    private LinearLayout ah;
    private HealthImageView ai;
    private HealthTextView aj;
    private HealthTextView ak;
    private QuestionnaireTemplate al;
    private View an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f8393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f8394c;
    private ResourceBriefInfo d;
    private SingleArticleAdapter e;
    private LinearLayout f;
    private HealthImageView g;
    private HealthTextView h;
    private HealthImageView i;
    private Context j;
    private HealthSubHeader k;
    private HealthTextView l;
    private HealthButton m;
    private String n;
    private Handler o;
    private Pair<Integer, Integer> p;
    private HealthButton q;
    private HealthTextView r;
    private RelativeLayout s;
    private HealthTextView t;
    private View u;
    private View v;
    private LinearLayout w;
    private int x;
    private RelativeLayout y;
    private HealthRecycleView z;

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        return (resourceBriefInfo == null || this.d == null || !resourceBriefInfo.getResourceId().equals(this.d.getResourceId())) ? false : true;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        ResourceBriefInfo resourceBriefInfo = this.d;
        if (resourceBriefInfo != null) {
            return resourceBriefInfo.getPriority();
        }
        return 0;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.x;
    }

    static class d extends BaseHandler<QuestionAndAnswerLayout> {
        d(QuestionAndAnswerLayout questionAndAnswerLayout) {
            super(questionAndAnswerLayout);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(QuestionAndAnswerLayout questionAndAnswerLayout, Message message) {
            if (message.what == 1000) {
                questionAndAnswerLayout.c(questionAndAnswerLayout.al);
            } else {
                LogUtil.j("QuestionAndAnswerLayout", "handleMessageWhenReferenceNotNull not match ");
            }
        }
    }

    public QuestionAndAnswerLayout(Context context) {
        super(context);
        this.p = BaseActivity.getSafeRegionWidth();
        this.x = 0;
        this.j = context;
        this.o = new d(this);
    }

    public void c(int i, ResourceBriefInfo resourceBriefInfo, QuestionnaireTemplate questionnaireTemplate) {
        if (questionnaireTemplate == null) {
            LogUtil.j("QuestionAndAnswerLayout", "template = null");
            return;
        }
        this.d = resourceBriefInfo;
        this.x = i;
        this.al = questionnaireTemplate;
        LogUtil.a("QuestionAndAnswerLayout", "template:", questionnaireTemplate.toString());
        a();
        c(0);
        d();
    }

    private void a() {
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.layout_marketing_question_and_answer, this);
        this.an = viewInflate.findViewById(R.id.layout_question_and_answer);
        this.k = (HealthSubHeader) viewInflate.findViewById(R.id.marketing_question_sub_header);
        this.f8394c = (ImageView) viewInflate.findViewById(R.id.img_background);
        this.ak = (HealthTextView) viewInflate.findViewById(R.id.tv_answer_title);
        this.l = (HealthTextView) viewInflate.findViewById(R.id.tv_join_number);
        this.q = (HealthButton) viewInflate.findViewById(R.id.btn_ok);
        this.m = (HealthButton) viewInflate.findViewById(R.id.btn_not_ok);
        this.ab = (LinearLayout) viewInflate.findViewById(R.id.lin_btn_select);
        this.v = viewInflate.findViewById(R.id.view_progress_ok);
        this.u = viewInflate.findViewById(R.id.view_progress_not_ok);
        this.w = (LinearLayout) viewInflate.findViewById(R.id.lin_progress_view);
        this.ad = (HealthTextView) viewInflate.findViewById(R.id.tv_proportion_ok);
        this.aj = (HealthTextView) viewInflate.findViewById(R.id.tv_select_ok);
        this.ac = (HealthTextView) viewInflate.findViewById(R.id.tv_proportion_not_ok);
        this.af = (HealthTextView) viewInflate.findViewById(R.id.tv_select_not_ok);
        this.y = (RelativeLayout) viewInflate.findViewById(R.id.lin_proportion_view);
        this.aa = (HealthTextView) viewInflate.findViewById(R.id.tv_answer_reason);
        this.z = (HealthRecycleView) viewInflate.findViewById(R.id.recycle_recommend);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BaseApplication.getContext());
        linearLayoutManager.setOrientation(1);
        this.z.setLayoutManager(linearLayoutManager);
        this.z.setNestedScrollingEnabled(false);
        this.z.setHasFixedSize(true);
        this.z.b(false);
        this.z.e(false);
        this.f8393b = (LinearLayout) viewInflate.findViewById(R.id.lin_answer_layout);
        this.g = (HealthImageView) viewInflate.findViewById(R.id.img_connection);
        this.h = (HealthTextView) viewInflate.findViewById(R.id.tv_collapse);
        this.f8392a = (LinearLayout) viewInflate.findViewById(R.id.answer_detail);
        this.ae = (LinearLayout) viewInflate.findViewById(R.id.lin_select_ok);
        this.ah = (LinearLayout) viewInflate.findViewById(R.id.lin_select_not_ok);
        this.ag = (HealthImageView) viewInflate.findViewById(R.id.img_select_ok);
        this.ai = (HealthImageView) viewInflate.findViewById(R.id.img_select_not_ok);
        this.r = (HealthTextView) viewInflate.findViewById(R.id.tv_option_one);
        this.t = (HealthTextView) viewInflate.findViewById(R.id.tv_option_two);
        this.s = (RelativeLayout) viewInflate.findViewById(R.id.rt_option_layout);
        this.i = (HealthImageView) viewInflate.findViewById(R.id.img_collapse_arrow);
        this.f = (LinearLayout) viewInflate.findViewById(R.id.lin_collapse_layout);
        if (fxk.a(this.x)) {
            return;
        }
        viewInflate.setPadding(((Integer) this.p.first).intValue(), 0, ((Integer) this.p.second).intValue(), 0);
    }

    private void d() {
        final QuestionResultReq questionResultReq = new QuestionResultReq();
        questionResultReq.setResourceId(this.d.getResourceId());
        questionResultReq.setTheme(this.al.getTheme());
        questionResultReq.setThemeId(this.al.getThemeId());
        final a aVar = new a(this, 11);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.QuestionAndAnswerLayout.2
            @Override // java.lang.Runnable
            public void run() {
                ColumnRequestUtils.requestAnswer(questionResultReq, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(QuestionnaireTemplate questionnaireTemplate) {
        long j;
        long j2;
        long j3;
        if (questionnaireTemplate == null) {
            LogUtil.j("QuestionAndAnswerLayout", "showAnswerAndQuestion template is null");
            return;
        }
        setSubHeaderUi(questionnaireTemplate);
        fya.e(this.ak, questionnaireTemplate.getTheme(), questionnaireTemplate.isThemeVisibility());
        setBackground(questionnaireTemplate);
        if (questionnaireTemplate.getQuestionnaireResults() != null) {
            Map<String, Long> questionnaireResults = questionnaireTemplate.getQuestionnaireResults();
            long jLongValue = questionnaireResults.containsKey("optionOne") ? questionnaireResults.get("optionOne").longValue() : 0L;
            long jLongValue2 = questionnaireResults.containsKey("optionTwo") ? questionnaireResults.get("optionTwo").longValue() : 0L;
            LogUtil.a("QuestionAndAnswerLayout", "selectOne:", Long.valueOf(jLongValue), " selectTwo:", Long.valueOf(jLongValue2));
            j3 = jLongValue + jLongValue2;
            j2 = jLongValue2;
            j = jLongValue;
        } else {
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        if (TextUtils.isEmpty(questionnaireTemplate.getOptionContent())) {
            this.l.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_person_join, (int) j3, UnitUtil.e(j3, 1, 0)));
            this.ab.setVisibility(0);
            this.w.setVisibility(8);
            this.y.setVisibility(8);
            this.f8393b.setVisibility(8);
            this.s.setVisibility(8);
            this.q.setText(questionnaireTemplate.getOptionOne());
            this.m.setText(questionnaireTemplate.getOptionTwo());
            this.q.setOnClickListener(this);
            this.m.setOnClickListener(this);
            this.an.setVisibility(0);
            return;
        }
        c(j, j2, j3, questionnaireTemplate);
    }

    private void c(long j, long j2, long j3, QuestionnaireTemplate questionnaireTemplate) {
        long j4;
        long j5;
        long j6;
        if (j3 <= 0) {
            LogUtil.a("QuestionAndAnswerLayout", "join = 0");
            j4 = 1;
            if ("optionOne".equals(questionnaireTemplate.getOptionContent())) {
                j5 = j2;
                j6 = 1;
            } else {
                j5 = 1;
                j6 = 1;
                j4 = j;
            }
        } else {
            j4 = j;
            j5 = j2;
            j6 = j3;
        }
        this.l.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_person_join, (int) j6, UnitUtil.e(j6, 1, 0)));
        if (!njy.b(questionnaireTemplate.getGridContents())) {
            LogUtil.a("QuestionAndAnswerLayout", "gridContents is empty, not need show");
        } else {
            SingleArticleAdapter singleArticleAdapter = new SingleArticleAdapter(this.j, new ArrayList(), this.x, this.d);
            this.e = singleArticleAdapter;
            this.z.setAdapter(singleArticleAdapter);
            this.e.b(questionnaireTemplate.getGridContents());
        }
        a(j4, j5, j6);
        this.w.setVisibility(0);
        this.y.setVisibility(0);
        this.f8393b.setVisibility(0);
        this.ab.setVisibility(8);
        this.s.setVisibility(0);
        this.r.setText(questionnaireTemplate.getOptionOne());
        this.t.setText(questionnaireTemplate.getOptionTwo());
        if (qrs.u()) {
            this.r.setTextSize(1, 16.0f);
            this.t.setTextSize(1, 16.0f);
        }
        if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_ICE), Integer.toString(this.x).concat("_isQAExpand"), true)) {
            this.f8392a.setVisibility(0);
            this.h.setText(R.string.IDS_device_health_retract);
            this.i.setImageResource(R.drawable.ic_arrow_retract);
        } else {
            this.f8392a.setVisibility(8);
            this.h.setText(R.string.IDS_device_health_expand);
            this.i.setImageResource(R.drawable.ic_arrow_expend);
        }
        this.f.setOnClickListener(this);
        this.an.setVisibility(0);
    }

    private void setBackground(final QuestionnaireTemplate questionnaireTemplate) {
        if (TextUtils.isEmpty(questionnaireTemplate.getPicture())) {
            LogUtil.j("QuestionAndAnswerLayout", "background is empty");
        } else {
            final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8394c.getLayoutParams();
            this.ak.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.marketing.views.QuestionAndAnswerLayout.5
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (QuestionAndAnswerLayout.this.ak.getLineCount() > 1) {
                        layoutParams.height = qrs.d(QuestionAndAnswerLayout.this.j, 164.0f);
                    } else {
                        layoutParams.height = qrs.d(QuestionAndAnswerLayout.this.j, 140.0f);
                    }
                    QuestionAndAnswerLayout.this.f8394c.setLayoutParams(layoutParams);
                    qqf.b(QuestionAndAnswerLayout.this.f8394c, questionnaireTemplate.getPicture(), qqf.d, 1, 0);
                    QuestionAndAnswerLayout.this.ak.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    /* JADX WARN: Code duplicated, block: B:19:0x008d  */
    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
    private void a(long j, long j2, long j3) {
        double d2;
        double d3;
        float f;
        float f2;
        this.ab.setVisibility(8);
        b();
        double d4 = UnitUtil.d(j / j3, 2);
        if (Math.abs(d4 - 0.0d) >= 1.0E-6d) {
            if (Math.abs(d4 - 1.0d) < 1.0E-6d) {
                d2 = j2 <= 0 ? 0.0d : 0.01d;
                d3 = 1.0d - d2;
            }
            double d5 = d2;
            this.ad.setText(UnitUtil.e(d3 * 100.0d, 2, 0));
            this.ac.setText(UnitUtil.e(100.0d * d5, 2, 0));
            f = (float) d3;
            f2 = (float) d5;
            if (Math.abs(d3 - 0.0d) < 1.0E-6d) {
                this.v.setVisibility(8);
                this.g.setVisibility(8);
                this.u.setBackgroundResource(R.drawable.background_select_not_ok_fill);
                return;
            }
            if (d3 <= 0.05d) {
                d(this.v, 0.05f);
                d(this.u, 0.95f);
                return;
            }
            if (Math.abs(d3 - 1.0d) < 1.0E-6d) {
                this.u.setVisibility(8);
                this.g.setVisibility(8);
                this.v.setBackgroundResource(R.drawable.background_select_ok_fill);
            } else if (d3 >= 0.95d) {
                d(this.v, 0.95f);
                d(this.u, 0.05f);
            } else {
                d(this.v, f);
                d(this.u, f2);
            }
        }
        if (j > 0) {
            d4 = 0.01d;
        }
        d2 = 1.0d - d4;
        d3 = d4;
        double d6 = d2;
        this.ad.setText(UnitUtil.e(d3 * 100.0d, 2, 0));
        this.ac.setText(UnitUtil.e(100.0d * d6, 2, 0));
        f = (float) d3;
        f2 = (float) d6;
        if (Math.abs(d3 - 0.0d) < 1.0E-6d) {
            this.v.setVisibility(8);
            this.g.setVisibility(8);
            this.u.setBackgroundResource(R.drawable.background_select_not_ok_fill);
            return;
        }
        if (d3 <= 0.05d) {
            d(this.v, 0.05f);
            d(this.u, 0.95f);
            return;
        }
        if (Math.abs(d3 - 1.0d) < 1.0E-6d) {
            this.u.setVisibility(8);
            this.g.setVisibility(8);
            this.v.setBackgroundResource(R.drawable.background_select_ok_fill);
        } else if (d3 >= 0.95d) {
            d(this.v, 0.95f);
            d(this.u, 0.05f);
        } else {
            d(this.v, f);
            d(this.u, f2);
        }
    }

    private void b() {
        int i;
        int i2;
        if (this.al.getOptionContent().equals(this.al.getCorrectOption())) {
            i = R.string.IDS_select_right;
            i2 = R.drawable.icon_select_corrcet;
        } else {
            i = R.string.IDS_select_error;
            i2 = R.drawable.icon_select_wrong;
        }
        if ("optionOne".equals(this.al.getOptionContent())) {
            this.ae.setVisibility(0);
            this.ag.setImageResource(i2);
            this.aj.setText(i);
            this.ah.setVisibility(8);
        } else {
            this.ae.setVisibility(8);
            this.ah.setVisibility(0);
            this.ai.setImageResource(i2);
            this.af.setText(i);
        }
        if (TextUtils.isEmpty(this.al.getDescription())) {
            return;
        }
        this.aa.setText(this.al.getDescription());
        this.aa.setVisibility(0);
    }

    private void d(View view, double d2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.weight = (float) d2;
        view.setLayoutParams(layoutParams);
    }

    private void setSubHeaderUi(QuestionnaireTemplate questionnaireTemplate) {
        if (questionnaireTemplate == null) {
            return;
        }
        boolean zIsNameVisibility = questionnaireTemplate.isNameVisibility();
        String name = questionnaireTemplate.getName();
        fya.b(zIsNameVisibility && !TextUtils.isEmpty(name), this.k);
        this.k.setHeadTitleText(name);
        String linkValue = questionnaireTemplate.getLinkValue();
        this.n = linkValue;
        if (!TextUtils.isEmpty(linkValue)) {
            this.k.setMoreLayoutVisibility(0);
            this.k.setMoreViewClickListener(this);
        } else {
            this.k.setMoreLayoutVisibility(8);
        }
        this.k.setSubHeaderBackgroundColor(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null || qrs.r()) {
            LogUtil.j("QuestionAndAnswerLayout", "view = null or isFastClick");
            return;
        }
        if (view.getId() == R.id.btn_ok) {
            if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
                c();
                return;
            } else {
                e(view.getId());
                return;
            }
        }
        if (view.getId() == R.id.btn_not_ok) {
            if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
                e();
                return;
            } else {
                e(view.getId());
                return;
            }
        }
        if (view.getId() == R.id.hwsubheader_more_container) {
            if (TextUtils.isEmpty(this.n)) {
                LogUtil.j("QuestionAndAnswerLayout", "mMoreUrl is empty");
                return;
            } else if (!fxk.b(this.n)) {
                c(this.n);
                return;
            } else {
                e(view.getId());
                return;
            }
        }
        if (view.getId() == R.id.lin_collapse_layout) {
            String strConcat = Integer.toString(this.x).concat("_isQAExpand");
            if (this.f8392a.getVisibility() == 0) {
                this.f8392a.setVisibility(8);
                this.h.setText(R.string.IDS_device_health_expand);
                this.i.setImageResource(R.drawable.ic_arrow_expend);
                SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_ICE), strConcat, false);
                c(5);
                return;
            }
            this.f8392a.setVisibility(0);
            this.h.setText(R.string.IDS_device_health_retract);
            this.i.setImageResource(R.drawable.ic_arrow_retract);
            SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_ICE), strConcat, true);
            c(4);
        }
    }

    private void e(final int i) {
        LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: fzz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.e.a(i, i2, obj);
            }
        }, AnalyticsValue.MARKETING_RESOURCE.value());
    }

    public /* synthetic */ void a(int i, int i2, Object obj) {
        LogUtil.j("QuestionAndAnswerLayout", "browsingToLogin errorCode =", Integer.valueOf(i2));
        if (i2 != 0) {
            return;
        }
        if (i == R.id.btn_ok) {
            c();
        } else if (i == R.id.btn_not_ok) {
            e();
        } else if (i == R.id.hwsubheader_more_container) {
            c(this.n);
        }
    }

    private void c() {
        if (!CommonUtil.ab(this.j)) {
            qpx.e(this.j, R.string.IDS_connect_network);
            return;
        }
        this.al.setOptionContent("optionOne");
        Map<String, Long> questionnaireResults = this.al.getQuestionnaireResults();
        if (questionnaireResults == null) {
            questionnaireResults = new HashMap<>(1);
            questionnaireResults.put("optionOne", 1L);
        } else if (questionnaireResults.containsKey("optionOne")) {
            questionnaireResults.put("optionOne", Long.valueOf(questionnaireResults.get("optionOne").longValue() + 1));
        } else {
            questionnaireResults.put("optionOne", 1L);
        }
        this.al.setQuestionnaireResults(questionnaireResults);
        c(this.al);
        c("optionOne", this.al.getOptionOne());
        c(1);
    }

    private void e() {
        if (!CommonUtil.ab(this.j)) {
            qpx.e(this.j, R.string.IDS_connect_network);
            return;
        }
        this.al.setOptionContent("optionTwo");
        Map<String, Long> questionnaireResults = this.al.getQuestionnaireResults();
        if (questionnaireResults == null) {
            questionnaireResults = new HashMap<>(1);
            questionnaireResults.put("optionTwo", 1L);
        } else if (questionnaireResults.containsKey("optionTwo")) {
            questionnaireResults.put("optionTwo", Long.valueOf(questionnaireResults.get("optionTwo").longValue() + 1));
        } else {
            questionnaireResults.put("optionTwo", 1L);
        }
        this.al.setQuestionnaireResults(questionnaireResults);
        c(this.al);
        c("optionTwo", this.al.getOptionTwo());
        c(2);
    }

    private void c(String str) {
        LogUtil.a("QuestionAndAnswerLayout", "more linkValue: ", str);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(str);
        }
        c(3);
    }

    private void c(String str, String str2) {
        final QuestionOptionReq questionOptionReq = new QuestionOptionReq();
        questionOptionReq.setOptionId(str);
        questionOptionReq.setOptionContent(str2);
        questionOptionReq.setResourceId(this.d.getResourceId());
        questionOptionReq.setTheme(this.al.getTheme());
        questionOptionReq.setThemeId(this.al.getThemeId());
        final a aVar = new a(this, 10);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.QuestionAndAnswerLayout.1
            @Override // java.lang.Runnable
            public void run() {
                ColumnRequestUtils.submitAnswer(questionOptionReq, aVar);
            }
        });
    }

    private void c(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        map.put("resourceName", this.al.getTheme());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MARKETING_QUESTION_AND_ANSWER.value(), map, 0);
    }

    static class a implements ResultCallback<QuestionResultRsp> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<QuestionAndAnswerLayout> f8402c;

        a(QuestionAndAnswerLayout questionAndAnswerLayout, int i) {
            this.f8402c = new WeakReference<>(questionAndAnswerLayout);
            this.f8401b = i;
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(QuestionResultRsp questionResultRsp) {
            int i = this.f8401b;
            if (i == 10) {
                if (questionResultRsp.getResultCode().intValue() == 0) {
                    LogUtil.a("QuestionAndAnswerLayout", "submitAnswer success");
                    return;
                }
                LogUtil.j("QuestionAndAnswerLayout", "submitAnswer error code:", questionResultRsp.getResultCode());
                if (questionResultRsp.getResultCode().intValue() == 2207002) {
                    LogUtil.a("QuestionAndAnswerLayout", "already answer");
                    return;
                } else {
                    qpx.e(BaseApplication.getContext(), R.string.IDS_submit_error);
                    return;
                }
            }
            if (i == 11) {
                if (questionResultRsp.getResultCode().intValue() == 0) {
                    QuestionAndAnswerLayout questionAndAnswerLayout = this.f8402c.get();
                    LogUtil.a("QuestionAndAnswerLayout", "request answer success");
                    questionAndAnswerLayout.al.setOptionContent(questionResultRsp.getUserOptionId());
                    questionAndAnswerLayout.al.setQuestionnaireResults(questionResultRsp.getQuestionSums());
                    questionAndAnswerLayout.o.sendEmptyMessage(1000);
                    return;
                }
                LogUtil.j("QuestionAndAnswerLayout", "request Answer error code:", questionResultRsp.getResultCode(), questionResultRsp.getResultDesc());
                return;
            }
            LogUtil.j("QuestionAndAnswerLayout", "onSuccess not match");
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            int i = this.f8401b;
            if (i == 10) {
                LogUtil.j("QuestionAndAnswerLayout", "submitAnswer onFailure", th.toString());
                qpx.e(BaseApplication.getContext(), R.string.IDS_submit_error);
            } else if (i == 11) {
                LogUtil.j("QuestionAndAnswerLayout", "request answer fail");
            } else {
                LogUtil.j("QuestionAndAnswerLayout", "onSuccess not match");
            }
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        LogUtil.a("QuestionAndAnswerLayout", "onConfigurationChanged");
        setBackground(this.al);
    }
}
