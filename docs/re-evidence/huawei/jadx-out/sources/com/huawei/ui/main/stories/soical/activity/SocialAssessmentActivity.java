package com.huawei.ui.main.stories.soical.activity;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.gson.Gson;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.operationbundle.R;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.stories.soical.views.AssessmentRecyclerAdapter;
import com.huawei.ui.main.stories.soical.views.OnItemVisibleListener;
import com.huawei.ui.main.stories.soical.views.RecyclerItemDecoration;
import defpackage.fxk;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qji;
import defpackage.qqv;
import defpackage.qre;
import defpackage.qrs;
import defpackage.wvg;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class SocialAssessmentActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Typeface f28875c;
    private HealthButton d;
    private long f;
    private HealthTextView g;
    private Typeface h;
    private AssessmentRecyclerAdapter j;
    private ViewGroup k;
    private RelativeLayout l;
    private ImageView m;
    private HealthTextView n;
    private MarketingApi o;
    private String p;
    private HealthTextView q;
    private OperationUtilsApi s;
    private RelativeLayout t;
    private String u;
    private boolean v;
    private CustomTitleBar w;
    private LinearLayout y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f28874b = 0;
    private volatile byte r = 0;
    private volatile boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<SingleGridContent> f28873a = new ArrayList();
    private final Handler i = new a(this);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_assessment_health);
        b();
        d();
        c();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        g();
        f();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        f();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.e = true;
        super.onDestroy();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.e(1000, view)) {
            LogUtil.a("UIDV_SocialMeasurement", "Too fast click frequency!");
            return;
        }
        int id = view.getId();
        if (R.id.hwappbarpattern_layout_cancle_icon == id) {
            finish();
            return;
        }
        if (R.id.social_sort_hot == id) {
            e((byte) 0);
            return;
        }
        if (R.id.social_sort_newest == id) {
            e((byte) 1);
            return;
        }
        if (R.id.social_btn_no_net_work == id) {
            CommonUtil.t(this);
        } else if (R.id.social_reload_layout == id) {
            j();
        } else {
            LogUtil.a("UIDV_SocialMeasurement", "Unrecognized View!");
        }
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.social_tab_titlebar);
        this.w = customTitleBar;
        customTitleBar.setLeftButtonVisibility(0);
        this.w.setLeftButtonDrawable(getDrawable(R.drawable.hwsearchview_ic_public_back), qre.f(R.string.accessibility_go_back));
        if (qqv.a(this)) {
            this.w.setTitleSize(getResources().getDimension(R.dimen.emui_master_title_2));
        } else {
            this.w.setTitleSize(getResources().getDimension(R.dimen.textSizeHeadline8));
        }
        this.w.setTitleTextColor(getResources().getColor(R.color.textColorPrimary));
        this.w.setTitleText(getString(R.string.IDS_assessment_health_title));
        this.g = (HealthTextView) findViewById(R.id.social_sort_hot);
        this.n = (HealthTextView) findViewById(R.id.social_sort_newest);
        this.h = Typeface.create(getString(R.string.textFontFamilyRegular), 0);
        this.f28875c = Typeface.create(getString(R.string.textFontFamilyMedium), 0);
        this.g.setSelected(true);
        this.g.setTypeface(this.f28875c);
        this.n.setSelected(false);
        this.y = (LinearLayout) findViewById(R.id.social_root_lyt);
        this.l = (RelativeLayout) findViewById(R.id.social_net_work_layout);
        this.m = (ImageView) findViewById(R.id.social_img_no_net_work);
        this.q = (HealthTextView) findViewById(R.id.social_tips_no_net_work);
        this.d = (HealthButton) findViewById(R.id.social_btn_no_net_work);
        this.t = (RelativeLayout) findViewById(R.id.social_reload_layout);
        this.k = (ViewGroup) findViewById(R.id.layout_loading);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.social_assessing_recyclerView);
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this, 1, false));
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.setItemAnimator(new DefaultItemAnimator());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hw_show_public_size_8);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.cardMarginStart);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.cardMarginEnd);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        healthRecycleView.addItemDecoration(new RecyclerItemDecoration(0, dimensionPixelSize4, new int[]{dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize4}));
        this.j = new AssessmentRecyclerAdapter(this.f28873a);
        g();
        healthRecycleView.setAdapter(this.j);
    }

    private void d() {
        this.w.setLeftButtonClickable(true);
        this.w.setLeftButtonOnClickListener(this);
        this.g.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.t.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.j.setOnItemClickListener(new d(this));
        this.j.b(new e(this));
    }

    private void g() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cardMarginStart);
        int iC = (fxk.c() - dimensionPixelSize) - getResources().getDimensionPixelSize(R.dimen.cardMarginEnd);
        int i = iC / 3;
        AssessmentRecyclerAdapter assessmentRecyclerAdapter = this.j;
        if (assessmentRecyclerAdapter != null) {
            assessmentRecyclerAdapter.e(iC, i);
        }
    }

    private void e(byte b2) {
        if (b2 == this.f28874b) {
            return;
        }
        if (b2 == 0) {
            this.g.setSelected(true);
            this.n.setSelected(false);
            this.g.setTypeface(this.f28875c);
            this.n.setTypeface(this.h);
        } else {
            this.g.setSelected(false);
            this.n.setSelected(true);
            this.g.setTypeface(this.h);
            this.n.setTypeface(this.f28875c);
        }
        this.f28874b = b2;
        if (a()) {
            c(this.f28873a);
            f();
        } else {
            j();
        }
    }

    private void c() {
        this.e = false;
        this.r = (byte) 0;
        d(true);
        if (this.r == 1) {
            return;
        }
        i();
        if (this.r == 1) {
            d(false);
        }
    }

    private void f() {
        if (SystemClock.elapsedRealtime() - this.f < 10000 || (this.r != 1 && this.r != 3)) {
            LogUtil.a("UIDV_SocialMeasurement", "The conditions for requesting data are not met.");
        } else {
            i();
        }
    }

    private void j() {
        if (this.r == 2) {
            d(true);
        } else {
            c();
        }
    }

    private void i() {
        if (this.o == null) {
            this.o = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        }
        if (this.o == null) {
            this.r = (byte) 1;
            return;
        }
        this.r = (byte) 2;
        c cVar = new c(this);
        this.o.getResourceResultInfo(4001).addOnSuccessListener(cVar).addOnFailureListener(cVar);
    }

    private void d(boolean z) {
        if (z) {
            if (CommonUtil.ab(this)) {
                this.y.setVisibility(8);
                this.l.setVisibility(8);
                this.k.setVisibility(0);
                return;
            }
            this.k.setVisibility(8);
            this.y.setVisibility(8);
            this.m.setImageResource(R.drawable.ic_network);
            this.q.setText(getString(R.string.IDS_hwh_home_healthshop_no_net_work_pls_click_again));
            this.d.setVisibility(0);
            this.l.setVisibility(0);
            this.r = (byte) 1;
            return;
        }
        this.k.setVisibility(8);
        if (a()) {
            this.l.setVisibility(8);
            this.y.setVisibility(0);
        } else {
            this.m.setImageResource(R.drawable.ic_social_empty);
            this.q.setText(getString(R.string.IDS_discover_no_content));
            this.d.setVisibility(8);
            this.l.setVisibility(0);
        }
    }

    private void c(List<SingleGridContent> list) {
        if (njy.e(list)) {
            d(false);
            return;
        }
        byte b2 = this.f28874b;
        List<SingleGridContent> list2 = this.f28873a;
        if (list2 != list) {
            list2.clear();
            this.f28873a.addAll(list);
        }
        Collections.sort(this.f28873a, new g(b2));
        AssessmentRecyclerAdapter assessmentRecyclerAdapter = this.j;
        if (assessmentRecyclerAdapter != null) {
            assessmentRecyclerAdapter.notifyDataSetChanged();
        }
        d(false);
    }

    private boolean a() {
        return njy.b(this.f28873a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SingleGridContent singleGridContent, long j, int i) {
        HashMap map = new HashMap();
        map.put("resourcePositionId", 4001);
        map.put("resourceId", this.p);
        map.put("resourceName", this.u);
        map.put("pullOrder", 1);
        map.put("smartRecommend", Boolean.valueOf(this.v));
        map.put("algId", "");
        if (i == 2) {
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - j));
        }
        if (singleGridContent != null) {
            map.put("itemCardName", singleGridContent.getTheme());
            map.put("itemId", singleGridContent.getDynamicDataId());
        }
        map.put("event", Integer.valueOf(i));
        lmf.d().c(this, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OperationUtilsApi e() {
        if (this.s == null) {
            this.s = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
        }
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<Integer, ResourceResultInfo> map) {
        MarketingApi marketingApi = this.o;
        if (marketingApi == null) {
            this.i.sendEmptyMessage(12);
            return;
        }
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
        if (mapFilterMarketingRules == null || !mapFilterMarketingRules.containsKey(4001) || mapFilterMarketingRules.get(4001) == null) {
            this.i.sendEmptyMessage(12);
            return;
        }
        List<ResourceBriefInfo> resources = mapFilterMarketingRules.get(4001).getResources();
        if (njy.e(resources)) {
            this.i.sendEmptyMessage(12);
            return;
        }
        if (this.e) {
            return;
        }
        GridTemplate gridTemplateA = a(resources);
        List<SingleGridContent> listE = gridTemplateA != null ? e(gridTemplateA.getGridContents()) : null;
        if (this.e) {
            return;
        }
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(11, listE));
    }

    private GridTemplate a(List<ResourceBriefInfo> list) {
        Gson gson = new Gson();
        ResourceBriefInfo resourceBriefInfo = null;
        GridTemplate gridTemplate = null;
        for (ResourceBriefInfo resourceBriefInfo2 : list) {
            if (resourceBriefInfo2 == null || resourceBriefInfo2.getContentType() != 40 || resourceBriefInfo2.getContent() == null || TextUtils.isEmpty(resourceBriefInfo2.getContent().getContent())) {
                LogUtil.a("UIDV_SocialMeasurement", "resource brief info invalid");
            } else {
                String content = resourceBriefInfo2.getContent().getContent();
                LogUtil.a("UIDV_SocialMeasurement", " marketing2.0: ", content);
                GridTemplate gridTemplate2 = (GridTemplate) gson.fromJson(content, GridTemplate.class);
                if (gridTemplate2 == null) {
                    LogUtil.a("UIDV_SocialMeasurement", "resource template parse exception");
                } else if (resourceBriefInfo == null || resourceBriefInfo.getPriority() < resourceBriefInfo2.getPriority()) {
                    resourceBriefInfo = resourceBriefInfo2;
                    gridTemplate = gridTemplate2;
                }
            }
        }
        if (resourceBriefInfo != null) {
            this.p = wvg.d(resourceBriefInfo.getResourceId());
            this.u = wvg.d(resourceBriefInfo.getResourceName());
            this.v = resourceBriefInfo.getSmartRecommend();
        }
        return gridTemplate;
    }

    private List<SingleGridContent> e(List<SingleGridContent> list) {
        if (!njy.e(list)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                SingleGridContent singleGridContent = list.get(size);
                if (!wvg.a(singleGridContent.getItemEffectiveTime(), singleGridContent.getItemExpirationTime())) {
                    list.remove(size);
                }
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        int i = message.what;
        if (i != 11) {
            if (i != 12) {
                return;
            }
            this.f = SystemClock.elapsedRealtime();
            d(false);
            return;
        }
        this.f = SystemClock.elapsedRealtime();
        if (!(message.obj instanceof List)) {
            LogUtil.a("UIDV_SocialMeasurement", "The data is null or the data type is incorrect.");
            d(false);
            return;
        }
        List<SingleGridContent> list = (List) message.obj;
        if (njy.e(list) || !(list.get(0) instanceof SingleGridContent)) {
            LogUtil.a("UIDV_SocialMeasurement", "No data exists in the container or the subtype is incorrect.");
            d(false);
        } else {
            c(list);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a extends BaseHandler<SocialAssessmentActivity> {
        a(SocialAssessmentActivity socialAssessmentActivity) {
            super(socialAssessmentActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(SocialAssessmentActivity socialAssessmentActivity, Message message) {
            socialAssessmentActivity.b(message);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class d implements BaseRecyclerAdapter.OnItemClickListener<SingleGridContent> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<SocialAssessmentActivity> f28878b;

        d(SocialAssessmentActivity socialAssessmentActivity) {
            this.f28878b = new WeakReference<>(socialAssessmentActivity);
        }

        @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onItemClicked(RecyclerHolder recyclerHolder, int i, SingleGridContent singleGridContent) {
            LogUtil.e("UIDV_SocialMeasurement", "onItemClicked Coming Position: ", Integer.valueOf(i));
            if (qrs.e(1000, recyclerHolder.itemView)) {
                LogUtil.a("UIDV_SocialMeasurement", "Too fast click frequency!");
                return;
            }
            if (singleGridContent == null) {
                LogUtil.e("UIDV_SocialMeasurement", "onItemClicked Wrong Position: ", Integer.valueOf(i));
                return;
            }
            SocialAssessmentActivity socialAssessmentActivity = this.f28878b.get();
            if (socialAssessmentActivity == null || socialAssessmentActivity.isFinishing() || socialAssessmentActivity.isDestroyed()) {
                return;
            }
            qji.b(new b(socialAssessmentActivity, singleGridContent), socialAssessmentActivity, socialAssessmentActivity.e().isNotSupportBrowseUrl(singleGridContent.getLinkValue()), AnalyticsValue.SOCIAL_1070004.value()).onClick(recyclerHolder.itemView);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e implements OnItemVisibleListener<RecyclerHolder, SingleGridContent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<SocialAssessmentActivity> f28879a;

        e(SocialAssessmentActivity socialAssessmentActivity) {
            this.f28879a = new WeakReference<>(socialAssessmentActivity);
        }

        @Override // com.huawei.ui.main.stories.soical.views.OnItemVisibleListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemVisible(RecyclerHolder recyclerHolder, int i, SingleGridContent singleGridContent) {
            if (singleGridContent == null) {
                LogUtil.e("UIDV_SocialMeasurement", "onItemClicked Wrong Position: ", Integer.valueOf(i));
                return;
            }
            SocialAssessmentActivity socialAssessmentActivity = this.f28879a.get();
            if (socialAssessmentActivity == null || socialAssessmentActivity.isFinishing() || socialAssessmentActivity.isDestroyed()) {
                return;
            }
            socialAssessmentActivity.b(singleGridContent, 0L, 1);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<SingleGridContent> f28876b;
        private final WeakReference<SocialAssessmentActivity> d;

        b(SocialAssessmentActivity socialAssessmentActivity, SingleGridContent singleGridContent) {
            this.f28876b = new WeakReference<>(singleGridContent);
            this.d = new WeakReference<>(socialAssessmentActivity);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SocialAssessmentActivity socialAssessmentActivity = this.d.get();
            SingleGridContent singleGridContent = this.f28876b.get();
            if (socialAssessmentActivity == null || singleGridContent == null || socialAssessmentActivity.isFinishing() || socialAssessmentActivity.isDestroyed()) {
                return;
            }
            Object tag = view.getTag(R.layout.item_assessment_health);
            socialAssessmentActivity.b(singleGridContent, tag instanceof Long ? ((Long) tag).longValue() : 0L, 2);
            socialAssessmentActivity.c(singleGridContent.getLinkValue());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements OnSuccessListener<Map<Integer, ResourceResultInfo>>, OnFailureListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<SocialAssessmentActivity> f28877c;

        c(SocialAssessmentActivity socialAssessmentActivity) {
            this.f28877c = new WeakReference<>(socialAssessmentActivity);
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<Integer, ResourceResultInfo> map) {
            SocialAssessmentActivity socialAssessmentActivity = this.f28877c.get();
            if (socialAssessmentActivity == null || socialAssessmentActivity.isFinishing() || socialAssessmentActivity.isDestroyed()) {
                return;
            }
            socialAssessmentActivity.b(map);
            socialAssessmentActivity.r = (byte) 3;
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            SocialAssessmentActivity socialAssessmentActivity = this.f28877c.get();
            if (socialAssessmentActivity == null || socialAssessmentActivity.isFinishing() || socialAssessmentActivity.isDestroyed()) {
                return;
            }
            LogUtil.e("UIDV_SocialMeasurement", " load resource failed");
            socialAssessmentActivity.i.sendEmptyMessage(12);
            socialAssessmentActivity.r = (byte) 3;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class g implements Comparator<SingleGridContent>, Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f28880a;

        g(int i) {
            this.f28880a = i;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(SingleGridContent singleGridContent, SingleGridContent singleGridContent2) {
            int i = 0;
            if (singleGridContent == null || singleGridContent2 == null) {
                if (singleGridContent == null) {
                    return singleGridContent2 == null ? 0 : -1;
                }
                return 1;
            }
            int i2 = this.f28880a;
            if (i2 == 0) {
                int iCompare = Integer.compare(singleGridContent2.getPriority(), singleGridContent.getPriority());
                if (iCompare == 0) {
                    iCompare = Long.compare(singleGridContent2.getItemEffectiveTime(), singleGridContent.getItemEffectiveTime());
                }
                return iCompare == 0 ? Long.compare(singleGridContent2.getParticipantCount(), singleGridContent.getParticipantCount()) : iCompare;
            }
            if (i2 == 1) {
                int iCompare2 = Long.compare(singleGridContent2.getItemEffectiveTime(), singleGridContent.getItemEffectiveTime());
                if (iCompare2 == 0) {
                    iCompare2 = Integer.compare(singleGridContent2.getPriority(), singleGridContent.getPriority());
                }
                i = iCompare2;
                if (i == 0) {
                    return Long.compare(singleGridContent2.getParticipantCount(), singleGridContent.getParticipantCount());
                }
            }
            return i;
        }
    }
}
