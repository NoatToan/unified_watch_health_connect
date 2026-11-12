package com.huawei.health.marketing.views;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.templates.FamousTeacherSeriesRecTemplate;
import com.huawei.health.marketing.datatype.templates.SingleFamousTeacherContent;
import com.huawei.health.marketing.datatype.templates.SingleFamousTeacherStandardContent;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketing.views.FamousTeacherAvatarAdapter;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fwz;
import defpackage.fxk;
import defpackage.fya;
import defpackage.gzl;
import defpackage.gzx;
import defpackage.ifp;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class FamousTeacherLayout extends LinearLayout implements View.OnClickListener, ResourceBriefInfoOwnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f8332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FamousTeacherAvatarAdapter f8333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FamousTeacherClassAdapter f8334c;
    private LinearLayout d;
    private HealthSubHeader e;
    private long f;
    private int g;
    private String h;
    private ResourceBriefInfo i;
    private Pair<Integer, Integer> j;
    private HealthRecycleView k;
    private HealthCardView l;
    private ImageView m;
    private HealthTextView n;
    private HealthTextView o;
    private b p;
    private c r;
    private SingleFamousTeacherStandardContent s;
    private FamousTeacherSeriesRecTemplate t;

    public FamousTeacherLayout(Context context) {
        super(context);
        this.j = BaseActivity.getSafeRegionWidth();
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        return (resourceBriefInfo == null || this.i == null || !resourceBriefInfo.getResourceId().equals(this.i.getResourceId())) ? false : true;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        ResourceBriefInfo resourceBriefInfo = this.i;
        if (resourceBriefInfo != null) {
            return resourceBriefInfo.getPriority();
        }
        return 0;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.g;
    }

    static class a extends BaseHandler<FamousTeacherLayout> {
        a(FamousTeacherLayout famousTeacherLayout) {
            super(famousTeacherLayout);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(FamousTeacherLayout famousTeacherLayout, Message message) {
            if (message.what == 1000) {
                if (famousTeacherLayout.s == null || famousTeacherLayout.f8334c == null) {
                    return;
                }
                famousTeacherLayout.f8334c.a(famousTeacherLayout.s);
                return;
            }
            LogUtil.j("FamousTeacherLayout", "handleMessageWhenReferenceNotNull not match ");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null || qrs.r()) {
            LogUtil.j("FamousTeacherLayout", "view = null or isFastClick");
            return;
        }
        if (view.getId() != R.id.hwsubheader_more_container) {
            LogUtil.j("FamousTeacherLayout", "click not match");
            return;
        }
        if (TextUtils.isEmpty(this.h)) {
            LogUtil.j("FamousTeacherLayout", "mMoreUrl is empty");
        } else if (!fxk.b(this.h)) {
            b(this.h);
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: fzi
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f34788b.b(i, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    public /* synthetic */ void b(int i, Object obj) {
        if (i == 0) {
            b(this.h);
        } else {
            LogUtil.j("FamousTeacherLayout", "onClick errorCode = ", Integer.valueOf(i));
        }
    }

    private void d(String str, int i) {
        LogUtil.a("FamousTeacherLayout", "goToDetail");
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(str);
        }
        b(2, i);
    }

    private void b(String str) {
        LogUtil.a("FamousTeacherLayout", "goToMore ");
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(str);
        }
        HashMap map = new HashMap();
        map.put("event", 1);
        map.put("moreEntryName", this.t.getMoreMenuTitle());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MARKETING_FAMOUS_TEACHER.value(), map, 0);
    }

    public void d(int i, ResourceBriefInfo resourceBriefInfo, FamousTeacherSeriesRecTemplate famousTeacherSeriesRecTemplate) {
        if (famousTeacherSeriesRecTemplate == null) {
            LogUtil.j("FamousTeacherLayout", "template = null");
            return;
        }
        this.g = i;
        this.t = famousTeacherSeriesRecTemplate;
        this.i = resourceBriefInfo;
        LogUtil.a("FamousTeacherLayout", "template:", famousTeacherSeriesRecTemplate.toString());
        c();
        d(famousTeacherSeriesRecTemplate.getGridContents().get(0), 0);
        if (this.p == null) {
            this.p = new b(this);
        }
        qsp.a(this.d, this.p);
    }

    private void c() {
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.layout_famous_teacher, this);
        this.d = (LinearLayout) viewInflate.findViewById(R.id.layout_famous_view);
        this.e = (HealthSubHeader) viewInflate.findViewById(R.id.marketing_teacher_sub_header);
        this.k = (HealthRecycleView) viewInflate.findViewById(R.id.marketing_teacher_recycler_view);
        this.f8332a = (HealthRecycleView) viewInflate.findViewById(R.id.marketing_class_recycler_view);
        this.l = (HealthCardView) viewInflate.findViewById(R.id.teacher_item);
        this.o = (HealthTextView) viewInflate.findViewById(R.id.tv_teacher_name);
        this.n = (HealthTextView) viewInflate.findViewById(R.id.tv_teacher_describe);
        this.m = (ImageView) viewInflate.findViewById(R.id.img_teacher_background);
        this.f8333b = new FamousTeacherAvatarAdapter(BaseApplication.getContext(), new ArrayList());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BaseApplication.getContext());
        linearLayoutManager.setOrientation(0);
        this.k.setLayoutManager(linearLayoutManager);
        this.k.setAdapter(this.f8333b);
        this.f8334c = new FamousTeacherClassAdapter(BaseApplication.getContext(), this.g, this.i, new ArrayList(), this.t);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(BaseApplication.getContext());
        linearLayoutManager2.setOrientation(0);
        this.f8332a.setLayoutManager(linearLayoutManager2);
        this.f8332a.setAdapter(this.f8334c);
        this.f8332a.setFocusableInTouchMode(false);
        this.f8332a.requestFocus();
        this.f8332a.setItemAnimator(null);
        this.f8332a.setNestedScrollingEnabled(false);
        this.f8333b.c(this.t.getGridContents());
        setSubHeaderUi(this.t);
        a(this.k);
        if (!fxk.a(this.g)) {
            viewInflate.setPadding(((Integer) this.j.first).intValue(), 0, ((Integer) this.j.second).intValue(), 0);
        }
        this.r = new c(this);
        this.f8333b.e(new FamousTeacherAvatarAdapter.onItemClickListener() { // from class: fzk
            @Override // com.huawei.health.marketing.views.FamousTeacherAvatarAdapter.onItemClickListener
            public final void onItemClick(FamousTeacherAvatarAdapter.ViewHolder viewHolder, SingleFamousTeacherStandardContent singleFamousTeacherStandardContent, int i, int i2) {
                this.f34791c.b(viewHolder, singleFamousTeacherStandardContent, i, i2);
            }
        });
    }

    public /* synthetic */ void b(FamousTeacherAvatarAdapter.ViewHolder viewHolder, SingleFamousTeacherStandardContent singleFamousTeacherStandardContent, int i, int i2) {
        this.f8333b.notifyItemChanged(i);
        this.f8333b.notifyItemChanged(i2);
        d(singleFamousTeacherStandardContent, i2);
        b(1, i2);
        qsp.a(this.k, this.r);
    }

    private void setSubHeaderUi(FamousTeacherSeriesRecTemplate famousTeacherSeriesRecTemplate) {
        if (famousTeacherSeriesRecTemplate == null) {
            return;
        }
        boolean zIsNameVisibility = famousTeacherSeriesRecTemplate.isNameVisibility();
        String name = famousTeacherSeriesRecTemplate.getName();
        fya.b(zIsNameVisibility && !TextUtils.isEmpty(name), this.e);
        this.e.setHeadTitleText(name);
        String linkValue = famousTeacherSeriesRecTemplate.getLinkValue();
        this.h = linkValue;
        if (!TextUtils.isEmpty(linkValue)) {
            this.e.setMoreLayoutVisibility(0);
            if (!TextUtils.isEmpty(famousTeacherSeriesRecTemplate.getMoreMenuTitle())) {
                this.e.setMoreTextMaxLines(2);
                this.e.setMoreTextAlignment(6);
                this.e.setMoreText(famousTeacherSeriesRecTemplate.getMoreMenuTitle());
                this.e.setMoreTextVisibility(0);
            } else {
                this.e.setMoreTextVisibility(4);
            }
            this.e.setMoreViewClickListener(this);
        } else {
            this.e.setMoreLayoutVisibility(8);
        }
        this.e.setSubHeaderBackgroundColor(0);
    }

    private void a(HealthRecycleView healthRecycleView) {
        healthRecycleView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.huawei.health.marketing.views.FamousTeacherLayout.1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_16dp);
                int dimensionPixelSize2 = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_16dp);
                int dimensionPixelSize3 = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_0dp);
                int size = FamousTeacherLayout.this.t.getGridContents().size() - 1;
                if (childAdapterPosition == size) {
                    rect.right = ((Integer) BaseActivity.getSafeRegionWidth().second).intValue() + dimensionPixelSize2;
                    rect.left = dimensionPixelSize3 / 2;
                }
                if (childAdapterPosition == 0) {
                    rect.left = ((Integer) BaseActivity.getSafeRegionWidth().first).intValue() + dimensionPixelSize;
                    rect.right = dimensionPixelSize3 / 2;
                }
                if (childAdapterPosition <= 0 || childAdapterPosition >= size) {
                    return;
                }
                int i = dimensionPixelSize3 / 2;
                rect.left = i;
                rect.right = i;
            }
        });
    }

    private void d(SingleFamousTeacherStandardContent singleFamousTeacherStandardContent, int i) {
        this.s = singleFamousTeacherStandardContent;
        e(singleFamousTeacherStandardContent);
        fya.e(this.o, singleFamousTeacherStandardContent.getTheme(), singleFamousTeacherStandardContent.isThemeVisibility());
        fya.e(this.n, singleFamousTeacherStandardContent.getDescription(), singleFamousTeacherStandardContent.isDescriptionVisibility());
        if (TextUtils.equals(this.i.getCategory(), SingleDailyMomentContent.COURSE_TYPE)) {
            b(singleFamousTeacherStandardContent.getSubContents());
        } else {
            this.f8334c.a(singleFamousTeacherStandardContent);
        }
        this.f = System.currentTimeMillis();
        b(singleFamousTeacherStandardContent, i);
    }

    private void b(SingleFamousTeacherStandardContent singleFamousTeacherStandardContent, final int i) {
        final String linkValue = singleFamousTeacherStandardContent.getLinkValue();
        this.l.setOnClickListener(new View.OnClickListener() { // from class: fzh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(linkValue, i, view);
            }
        });
    }

    public /* synthetic */ void d(final String str, final int i, View view) {
        if (TextUtils.isEmpty(str) || qrs.e(view)) {
            LogUtil.j("FamousTeacherLayout", "click too fast or url is empty");
        } else if (!fxk.b(str)) {
            d(str, i);
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: fzl
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.d.b(str, i, i2, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    public /* synthetic */ void b(String str, int i, int i2, Object obj) {
        if (i2 == 0) {
            d(str, i);
        } else {
            LogUtil.j("FamousTeacherLayout", "onClick errorCode = ", Integer.valueOf(i2));
        }
    }

    private void b(List<SingleFamousTeacherContent> list) {
        if (njy.e(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (SingleFamousTeacherContent singleFamousTeacherContent : list) {
            if (singleFamousTeacherContent != null && !TextUtils.isEmpty(singleFamousTeacherContent.getDynamicDataId())) {
                arrayList.add(new gzl.a(singleFamousTeacherContent.getDynamicDataId()).c());
            }
        }
        a((List<gzl>) arrayList, false, (UiCallback<List<FitWorkout>>) new d(this, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        synchronized (this) {
            new a(this).sendEmptyMessage(1000);
        }
    }

    private void a(final List<gzl> list, final boolean z, final UiCallback<List<FitWorkout>> uiCallback) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fze
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(list, z, uiCallback);
                }
            });
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("FamousTeacherLayout", "getCourseByIds, courseApi is null.");
            uiCallback.onFailure(ResultUtil.ResultCode.PARAMETER_INVALID, "CourseApi is null");
        } else {
            courseApi.getCourseByIds(list, z, uiCallback);
        }
    }

    public /* synthetic */ void e(List list, boolean z, UiCallback uiCallback) {
        a((List<gzl>) list, z, (UiCallback<List<FitWorkout>>) uiCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<SingleFamousTeacherContent> list, List<FitWorkout> list2) {
        for (SingleFamousTeacherContent singleFamousTeacherContent : list) {
            if (singleFamousTeacherContent != null) {
                String dynamicDataId = singleFamousTeacherContent.getDynamicDataId();
                if (!TextUtils.isEmpty(dynamicDataId)) {
                    for (FitWorkout fitWorkout : list2) {
                        if (fitWorkout != null && TextUtils.equals(dynamicDataId, fitWorkout.acquireId())) {
                            LogUtil.a("FamousTeacherLayout", "fitWorkout:", fitWorkout.toString());
                            singleFamousTeacherContent.setDescription(fwz.e(fitWorkout.acquireDifficulty()) + "·" + gzx.c(BaseApplication.getContext(), com.huawei.ui.commonui.R.string.IDS_min_unit_no_space, ifp.d(fitWorkout.acquireDuration())));
                            singleFamousTeacherContent.setDescriptionVisibility(true);
                            singleFamousTeacherContent.setTheme(fitWorkout.acquireName());
                            singleFamousTeacherContent.setThemeVisibility(true);
                            LogUtil.a("FamousTeacherLayout", "SingleFamousTeacherContent:", singleFamousTeacherContent.toString());
                            break;
                        }
                    }
                }
            }
        }
    }

    private void e(SingleFamousTeacherStandardContent singleFamousTeacherStandardContent) {
        String picture = singleFamousTeacherStandardContent.getPicture();
        String tahitiPicture = singleFamousTeacherStandardContent.getTahitiPicture();
        if (qrs.af(BaseApplication.getActivity()) && !TextUtils.isEmpty(tahitiPicture)) {
            picture = tahitiPicture;
        }
        qqf.b(this.m, picture, qqf.f46647a, 3, 0);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        LogUtil.a("FamousTeacherLayout", "onConfigurationChanged: ", Integer.valueOf(configuration.orientation));
        e(this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        if (this.i == null) {
            LogUtil.a("FamousTeacherLayout", "resourceBriefInfo is null. return.");
            return;
        }
        String str = this.i.getResourceName() + " " + this.s.getTheme();
        LogUtil.a("FamousTeacherLayout", "set click event Result. PositionId: ", Integer.valueOf(this.g), "; resourceName: ", str);
        HashMap map = new HashMap();
        map.put("resourceName", str);
        map.put("itemCardName", this.s.getTabName());
        map.put("itemId", "");
        map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.f));
        map.put("pullOrder", 0);
        FamousTeacherSeriesRecTemplate famousTeacherSeriesRecTemplate = this.t;
        if (famousTeacherSeriesRecTemplate != null) {
            map.put("moreEntryName", famousTeacherSeriesRecTemplate.getMoreMenuTitle());
        }
        MarketingBiUtils.a(i, this.g, this.i, map);
    }

    static class d extends UiCallback<List<FitWorkout>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<SingleFamousTeacherContent> f8336a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<FamousTeacherLayout> f8337c;

        d(FamousTeacherLayout famousTeacherLayout, List<SingleFamousTeacherContent> list) {
            this.f8337c = new WeakReference<>(famousTeacherLayout);
            this.f8336a = list;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            FamousTeacherLayout famousTeacherLayout = this.f8337c.get();
            if (famousTeacherLayout == null) {
                LogUtil.j("FamousTeacherLayout", "getCourseByIds onFailure layout is null");
            } else {
                LogUtil.j("FamousTeacherLayout", "getCourseByIds onFailure, ", str);
                famousTeacherLayout.b();
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<FitWorkout> list) {
            FamousTeacherLayout famousTeacherLayout = this.f8337c.get();
            if (famousTeacherLayout == null) {
                LogUtil.j("FamousTeacherLayout", "getCourseByIds onSuccess layout is null");
                return;
            }
            LogUtil.a("FamousTeacherLayout", "getCourseByIds onSuccess, ");
            if (njy.b(list)) {
                famousTeacherLayout.b(this.f8336a, list);
            }
            famousTeacherLayout.b();
        }
    }

    static class b implements ViewTreeObserver.OnScrollChangedListener {
        private final WeakReference<FamousTeacherLayout> e;

        public b(FamousTeacherLayout famousTeacherLayout) {
            this.e = new WeakReference<>(famousTeacherLayout);
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            FamousTeacherLayout famousTeacherLayout = this.e.get();
            if (famousTeacherLayout != null) {
                if (MarketingBiUtils.c(famousTeacherLayout.d)) {
                    famousTeacherLayout.b(1, 0);
                    qsp.c(famousTeacherLayout.d, this);
                    return;
                }
                return;
            }
            LogUtil.j("FamousTeacherLayout", "onScrollChanged layout is null");
        }
    }

    static class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<FamousTeacherLayout> f8335a;

        c(FamousTeacherLayout famousTeacherLayout) {
            this.f8335a = new WeakReference<>(famousTeacherLayout);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            FamousTeacherLayout famousTeacherLayout = this.f8335a.get();
            if (famousTeacherLayout != null) {
                FamousTeacherAvatarAdapter famousTeacherAvatarAdapter = famousTeacherLayout.f8333b;
                if (famousTeacherAvatarAdapter == null) {
                    ReleaseLogUtil.d("FamousTeacherLayout", "TeacherRecycleViewOnGlobalLayoutListener onGlobalLayout adapter is null");
                    return;
                }
                FamousTeacherAvatarAdapter.ViewHolder viewHolderA = famousTeacherAvatarAdapter.a();
                if (viewHolderA == null) {
                    ReleaseLogUtil.d("FamousTeacherLayout", "TeacherRecycleViewOnGlobalLayoutListener onGlobalLayout holder is null");
                    return;
                }
                LogUtil.a("FamousTeacherLayout", "TeacherRecycleViewOnGlobalLayoutListener onGlobalLayout holder ", viewHolderA);
                famousTeacherLayout.e();
                lrd.b(viewHolderA.itemView, 8);
                return;
            }
            ReleaseLogUtil.d("FamousTeacherLayout", "TeacherRecycleViewOnGlobalLayoutListener onGlobalLayout layout is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c cVar = this.r;
        if (cVar == null) {
            ReleaseLogUtil.d("FamousTeacherLayout", "removeOnGlobalLayoutListener mTeacherRecycleViewOnGlobalLayoutListener is null");
        } else {
            qsp.b(this.k, cVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ReleaseLogUtil.c("FamousTeacherLayout", "onDetachedFromWindow");
        e();
        b bVar = this.p;
        if (bVar != null) {
            qsp.c(this.d, bVar);
        }
    }
}
