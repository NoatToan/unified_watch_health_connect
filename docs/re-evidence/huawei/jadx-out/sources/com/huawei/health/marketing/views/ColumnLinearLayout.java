package com.huawei.health.marketing.views;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.knit.data.IKnitLifeCycle;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.SingleEntryContent;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.SingleHotSeriesRecommendContent;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.datatype.templates.HotSeriesRecommendTemplate;
import com.huawei.health.marketing.datatype.templates.MultiFunctionTemplate;
import com.huawei.health.marketing.datatype.templates.QuickEntryTemplate;
import com.huawei.health.marketing.datatype.templates.SingleFunctionGridContent;
import com.huawei.health.marketing.request.ActivityIdInfo;
import com.huawei.health.marketing.request.ActivityInfoListFactory;
import com.huawei.health.marketing.request.BreathExerciseInfo;
import com.huawei.health.marketing.request.BreathExerciseInfoApi;
import com.huawei.health.marketing.request.BreathExerciseInfoReq;
import com.huawei.health.marketing.request.ColumnRequestUtils;
import com.huawei.health.marketing.request.InformationInfo;
import com.huawei.health.marketing.request.RespBreathExerciseInfo;
import com.huawei.health.marketing.request.RespSleepAudioInfo;
import com.huawei.health.marketing.request.SleepAudioInfo;
import com.huawei.health.marketing.request.SleepAudioInfoApi;
import com.huawei.health.marketing.request.SleepAudioInfoReq;
import com.huawei.health.marketing.utils.ColumnLayoutItemDecoration;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketing.views.ColumnLinearLayout;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.servicesui.R;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseInfo;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.audio.SleepAudioPackage;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.up.model.UserInfomation;
import defpackage.ewz;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.fya;
import defpackage.gzl;
import defpackage.haa;
import defpackage.ifp;
import defpackage.irz;
import defpackage.lmd;
import defpackage.lmf;
import defpackage.lsx;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class ColumnLinearLayout extends BaseLifeCycleLinearLayout implements View.OnClickListener, ResourceBriefInfoOwnable, IKnitLifeCycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8255a;
    private ResourceBriefInfo aa;
    private HealthRecycleView ab;
    private RelativeLayout ac;
    private List<SingleGridContent> ad;
    private long ae;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<List<SingleGridContent>> f8256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseTemplate f8257c;
    private boolean d;
    private int e;
    private a f;
    private d g;
    private int h;
    private Context i;
    private ColumnLayoutAdapter j;
    private boolean k;
    private String l;
    private List<SingleGridContent> m;
    private HealthSubHeader n;
    private boolean o;
    private Handler p;
    private boolean q;
    private LinearLayout r;
    private String s;
    private View.OnClickListener t;
    private String u;
    private int v;
    private Pair<Integer, Integer> w;
    private int x;
    private int y;
    private d z;

    static class c extends BaseHandler<ColumnLinearLayout> {
        c(ColumnLinearLayout columnLinearLayout) {
            super(columnLinearLayout);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ColumnLinearLayout columnLinearLayout, Message message) {
            if (message.what == 8193 && (message.obj instanceof ColumnLayoutAdapter)) {
                ColumnLayoutAdapter columnLayoutAdapter = (ColumnLayoutAdapter) message.obj;
                if (columnLinearLayout.ab != null) {
                    if (columnLinearLayout.n.getVisibility() == 8) {
                        columnLinearLayout.n.setVisibility(0);
                    }
                    columnLayoutAdapter.c(columnLinearLayout.ad);
                    columnLinearLayout.ab.setAdapter(columnLayoutAdapter);
                    columnLinearLayout.a();
                }
            }
        }
    }

    public ColumnLinearLayout(Context context) {
        super(context);
        this.v = 1;
        this.q = false;
        this.k = true;
        this.w = BaseActivity.getSafeRegionWidth();
        this.f8256b = new ArrayList(10);
        this.m = new ArrayList(10);
        this.f8255a = true;
        this.e = -1;
        this.o = true;
        this.d = false;
        this.i = context;
        this.p = new c(this);
    }

    private void e() {
        this.k = true;
        View viewA = qre.a(this.i, R.layout.cloumn_linearlayout, this);
        if (viewA == null) {
            LogUtil.e("ColumnLinearLayout", "initView NotFoundException.");
            this.k = false;
            return;
        }
        LinearLayout linearLayout = (LinearLayout) viewA.findViewById(R.id.layout_marketing_grid);
        this.r = linearLayout;
        linearLayout.setVisibility(0);
        this.ab = (HealthRecycleView) viewA.findViewById(R.id.marketing_grid_recycler_view);
        this.ac = (RelativeLayout) viewA.findViewById(R.id.marketing_grid_recycler_view_out);
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewA.findViewById(R.id.marketing_grid_sub_header);
        this.n = healthSubHeader;
        if (healthSubHeader == null) {
            LogUtil.j("ColumnLinearLayout", "initView mHealthSubHeader is null.");
            this.k = false;
            setVisibility(8);
            return;
        }
        healthSubHeader.setMoreTextVisibility(4);
        this.ab.setNestedScrollingEnabled(false);
        this.ab.setHasFixedSize(true);
        this.ab.b(false);
        this.ab.e(false);
        this.q = qrs.af(BaseApplication.getActivity());
        i();
    }

    private void i() {
        this.ab.setIsOpenExposedTime(true);
        this.ab.setOnCardExposureTimeListener(new HealthRecycleView.OnCardExposureTimeListener() { // from class: fyy
            @Override // com.huawei.ui.commonui.recycleview.HealthRecycleView.OnCardExposureTimeListener
            public final void onCardExposed(int i, long j, TimeUnit timeUnit) {
                this.f34770b.b(i, j, timeUnit);
            }
        });
    }

    public /* synthetic */ void b(int i, long j, TimeUnit timeUnit) {
        if (this.aa == null) {
            return;
        }
        this.ab.setCollectExposedTime(new lmd(this.aa.getResourceId(), this.aa.getResourceName(), ewz.b(this.f8257c, this.h, i), String.valueOf(this.x), String.valueOf(i), j));
    }

    public void e(String str) {
        this.l = str;
    }

    public void b(int i, ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate) {
        e();
        if (this.k) {
            this.f8257c = baseTemplate;
            this.x = i;
            this.aa = resourceBriefInfo;
            if (resourceBriefInfo != null) {
                this.h = resourceBriefInfo.getContentType();
            }
            this.ab.b(this.h == 47);
            this.v = getLayoutOrientation();
            if (resourceBriefInfo != null) {
                this.y = resourceBriefInfo.getPriority();
            }
            this.ae = System.currentTimeMillis();
            setRecyclerViewBackground(baseTemplate);
            b(baseTemplate);
            this.ab.addOnScrollListener(new b(this.aa, this.j));
            c();
            this.p.postDelayed(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.1
                @Override // java.lang.Runnable
                public void run() {
                    ColumnLinearLayout.this.g();
                }
            }, 100L);
        }
    }

    private void c() {
        if (this.f8255a && this.h == 47) {
            LogUtil.a("ColumnLinearLayout", "register Observer");
            if (this.f == null) {
                this.f = new a(this);
            }
            ObserverManagerUtil.d(this.f, "HOME_RECYCLE_VIEW_MOVE");
            this.f8255a = false;
        }
    }

    private void b(LinearLayoutManager linearLayoutManager, int i) {
        this.ab.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.8
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int[] iArr = new int[2];
                if (ColumnLinearLayout.this.j.e() != null) {
                    ColumnLinearLayout.this.j.e().itemView.getLocationInWindow(iArr);
                }
                if (iArr[0] == 0 || iArr[1] == 0) {
                    return;
                }
                ColumnLinearLayout.this.j.b(iArr[0]);
                ColumnLinearLayout.this.j.a(iArr[1]);
                LogUtil.a("ColumnLinearLayout", "HEALTH_HEADLINES Location X:" + iArr[0] + " Y:" + iArr[1]);
                ObserverManagerUtil.e("REFRESH_HEALTH_HEADLINES_SHOW_STATUS", false);
                ColumnLinearLayout.this.ab.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        LogUtil.a("ColumnLinearLayout", "current Item " + iFindFirstVisibleItemPosition + '~' + iFindLastVisibleItemPosition + ";target postion:" + i);
        if (i <= iFindFirstVisibleItemPosition) {
            this.ab.scrollToPosition(Math.max(i, 0));
        } else if (i <= iFindLastVisibleItemPosition) {
            this.ab.scrollBy(this.ab.getChildAt(i - iFindFirstVisibleItemPosition).getLeft(), 0);
        } else {
            this.ab.scrollToPosition(Math.min(i + 4, this.m.size() - 1));
        }
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onStop() {
        super.onStop();
        HealthRecycleView healthRecycleView = this.ab;
        if (healthRecycleView != null) {
            healthRecycleView.onStop();
        }
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        ColumnLayoutAdapter columnLayoutAdapter;
        super.onResume();
        HealthRecycleView healthRecycleView = this.ab;
        if (healthRecycleView != null) {
            healthRecycleView.onResume();
        }
        if (this.h == 84) {
            a(this.m, this.j);
        }
        if (this.h == 113 && (columnLayoutAdapter = this.j) != null) {
            columnLayoutAdapter.notifyDataSetChanged();
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ColumnLayoutAdapter columnLayoutAdapter;
        int i = this.e;
        if (i == -1) {
            return;
        }
        if (i != 1 && this.o && (columnLayoutAdapter = this.j) != null) {
            b((LinearLayoutManager) this.ab.getLayoutManager(), columnLayoutAdapter.d() - 2);
            this.o = false;
        } else {
            ObserverManagerUtil.e("REFRESH_HEALTH_HEADLINES_SHOW_STATUS", true);
        }
        this.e = -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        LogUtil.a("ColumnLinearLayout", "onDetachedFromWindow ");
        qsp.b(this.r, this.g);
        qsp.c(this.r, this.z);
        int i = this.h;
        if (i == 21 || i == 19) {
            ObserverManagerUtil.a("MARKETING_AUDITION_BTN_REFRESH");
        }
        a aVar = this.f;
        if (aVar != null) {
            ObserverManagerUtil.c(aVar);
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.r != null) {
            if (this.g == null) {
                this.g = new d(this);
            }
            if (this.z == null) {
                this.z = new d(this);
            }
            qsp.a((View) this.r, (ViewTreeObserver.OnGlobalLayoutListener) this.g);
            qsp.a((View) this.r, (ViewTreeObserver.OnScrollChangedListener) this.z);
        }
    }

    public HealthSubHeader getHealthSubHeader() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LinearLayout linearLayout = this.r;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        int height = this.r.getHeight();
        int width = this.r.getWidth();
        Rect rect = new Rect();
        if (getLocalVisibleRect(rect) && a(rect, height, width) && !this.d) {
            ResourceBriefInfo resourceBriefInfo = this.aa;
            LogUtil.a("ColumnLinearLayout", "visible to user, resource name: ", resourceBriefInfo != null ? resourceBriefInfo.getResourceName() : null, ", positionId: ", Integer.valueOf(this.x), ", height: ", Integer.valueOf(height), ", width: ", Integer.valueOf(width), ", getLocalVisibleRect: ", Boolean.valueOf(getLocalVisibleRect(rect)));
            this.d = true;
            HashMap map = new HashMap();
            map.put("moreEntryName", this.s);
            MarketingBiUtils.a(1, this.x, this.aa, map);
        }
    }

    public static boolean a(Rect rect, int i, int i2) {
        return rect != null && rect.left >= 0 && rect.left < i2 && rect.top >= 0 && rect.top < i && rect.bottom >= Math.min(i / 2, 400);
    }

    public void setItemClickListener(View.OnClickListener onClickListener) {
        this.t = onClickListener;
    }

    public void setShowDialogFlag(boolean z) {
        ColumnLayoutAdapter columnLayoutAdapter = this.j;
        if (columnLayoutAdapter != null) {
            columnLayoutAdapter.e(z);
        }
    }

    public void d(ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate, String str) {
        ColumnLayoutAdapter columnLayoutAdapter;
        if (resourceBriefInfo.getContentType() == 47 && (columnLayoutAdapter = this.j) != null && (baseTemplate instanceof GridTemplate)) {
            columnLayoutAdapter.c(((GridTemplate) baseTemplate).getGridContents());
            this.j.a(str);
            this.j.notifyDataSetChanged();
        }
    }

    public ColumnLayoutAdapter getmColumnLayoutAdapter() {
        return this.j;
    }

    static class b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ColumnLayoutAdapter> f8288c;
        private int d;
        private ResourceBriefInfo e;
        private int j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8287b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8286a = false;

        b(ResourceBriefInfo resourceBriefInfo, ColumnLayoutAdapter columnLayoutAdapter) {
            this.e = resourceBriefInfo;
            this.f8288c = new WeakReference<>(columnLayoutAdapter);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int iFindFirstVisibleItemPosition;
            int iFindFirstCompletelyVisibleItemPosition;
            float f;
            super.onScrollStateChanged(recyclerView, i);
            ColumnLayoutAdapter columnLayoutAdapter = this.f8288c.get();
            if (i == 1 && columnLayoutAdapter != null) {
                columnLayoutAdapter.b();
            }
            if (i == 0) {
                if (columnLayoutAdapter != null) {
                    columnLayoutAdapter.h();
                }
                if (LanguageUtil.ba(BaseApplication.getContext())) {
                    return;
                }
                if (this.f8286a) {
                    this.f8286a = false;
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof GridLayoutManager)) {
                    return;
                }
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                if (gridLayoutManager.getOrientation() != 0) {
                    return;
                }
                boolean z = this.f8287b > 0;
                if (z) {
                    iFindFirstVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
                } else {
                    iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
                }
                if (z) {
                    iFindFirstCompletelyVisibleItemPosition = gridLayoutManager.findLastCompletelyVisibleItemPosition();
                } else {
                    iFindFirstCompletelyVisibleItemPosition = gridLayoutManager.findFirstCompletelyVisibleItemPosition();
                }
                if (iFindFirstCompletelyVisibleItemPosition == iFindFirstVisibleItemPosition || iFindFirstVisibleItemPosition < 0) {
                    return;
                }
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                int[] iArr = new int[2];
                recyclerView.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                float f2 = i2;
                float measuredWidth = i2 + recyclerView.getMeasuredWidth();
                if (viewHolderFindViewHolderForAdapterPosition == null) {
                    LogUtil.d("ColumnLinearLayout", "onScrollStateChanged viewHolder is null,return");
                    return;
                }
                viewHolderFindViewHolderForAdapterPosition.itemView.getLocationOnScreen(iArr);
                float measuredWidth2 = viewHolderFindViewHolderForAdapterPosition.itemView.getMeasuredWidth();
                if (z) {
                    float f3 = measuredWidth - iArr[0];
                    f = f3 / measuredWidth2 > 0.3f ? measuredWidth2 - f3 : -(f3 + 0.5f);
                } else {
                    float f4 = (iArr[0] + measuredWidth2) - f2;
                    f = f4 / measuredWidth2 > 0.3f ? -(measuredWidth2 - f4) : f4 + 0.5f;
                }
                recyclerView.smoothScrollBy((int) f, 0, new DecelerateInterpolator());
                this.f8286a = true;
            }
            ResourceBriefInfo resourceBriefInfo = this.e;
            if (resourceBriefInfo != null && resourceBriefInfo.getContentType() == 47 && i != 1 && this.d == 1 && this.j > 50) {
                b();
            }
            this.d = i;
        }

        private void b() {
            HashMap map = new HashMap();
            map.put("click", 1);
            map.put(CommonUtil.PAGE_TYPE, 2);
            ResourceBriefInfo resourceBriefInfo = this.e;
            map.put("smartRecommend", Boolean.valueOf(resourceBriefInfo != null && "intelligent_alpha".equals(resourceBriefInfo.getSortingRules())));
            LogUtil.a("ColumnLinearLayout", "biEventFunctionMenuDragToRight 2040171: ", map.toString());
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.FUNCTION_CARD_2040171.value(), map, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0) {
                this.f8287b = i;
            }
            if (this.d == 1) {
                this.j += i;
            } else {
                this.j = 0;
            }
            super.onScrolled(recyclerView, i, i2);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("ColumnLinearLayout", "onConfigurationChanged1: ", Integer.valueOf(configuration.orientation));
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.9
            @Override // java.lang.Runnable
            public void run() {
                fxk.d(configuration.orientation);
                ColumnLinearLayout.this.q = qrs.af(BaseApplication.getActivity());
                if (ColumnLinearLayout.this.ab == null || ColumnLinearLayout.this.ab.getAdapter() == null) {
                    return;
                }
                if (ColumnLinearLayout.this.ab.getAdapter() instanceof ColumnLayoutAdapter) {
                    ((ColumnLayoutAdapter) ColumnLinearLayout.this.ab.getAdapter()).c(ColumnLinearLayout.this.q);
                }
                ColumnLinearLayout.this.a();
                ColumnLinearLayout.this.ab.getAdapter().notifyDataSetChanged();
            }
        }, 200L);
    }

    public int getContentType() {
        return this.h;
    }

    private void b(BaseTemplate baseTemplate) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (baseTemplate == null) {
            LogUtil.j("ColumnLinearLayout", "gridTemplate is null.");
            if (this.h == 47) {
                this.n.setVisibility(8);
                return;
            }
            return;
        }
        int i6 = this.h;
        if ((i6 == 10 || i6 == 23) && (baseTemplate instanceof QuickEntryTemplate)) {
            List<SingleEntryContent> gridContents = ((QuickEntryTemplate) baseTemplate).getGridContents();
            if (njy.e(gridContents)) {
                this.r.setVisibility(8);
                LogUtil.j("ColumnLinearLayout", "dataShow() entryContentList is empty.");
                return;
            } else {
                e((GridTemplate) null, this.aa, true);
                ColumnLayoutAdapter columnLayoutAdapter = new ColumnLayoutAdapter(this.i, this.x, this.aa);
                this.j = columnLayoutAdapter;
                columnLayoutAdapter.d(gridContents);
            }
        } else if (i6 == 113 && (baseTemplate instanceof HotSeriesRecommendTemplate)) {
            HotSeriesRecommendTemplate hotSeriesRecommendTemplate = (HotSeriesRecommendTemplate) baseTemplate;
            List<SingleHotSeriesRecommendContent> gridContents2 = hotSeriesRecommendTemplate.getGridContents();
            if (njy.e(gridContents2)) {
                this.r.setVisibility(8);
                LogUtil.j("ColumnLinearLayout", "dataShow() HotSeriesRecommendTemplate data is empty.");
                return;
            }
            GridTemplate gridTemplate = new GridTemplate();
            gridTemplate.setName(hotSeriesRecommendTemplate.getName());
            gridTemplate.setNameVisibility(hotSeriesRecommendTemplate.isNameVisibility());
            gridTemplate.setLinkValue(hotSeriesRecommendTemplate.getLinkValue());
            gridTemplate.setMoreMenuTitle(hotSeriesRecommendTemplate.getMoreMenuTitle());
            e(gridTemplate, this.aa, false);
            ColumnLayoutAdapter columnLayoutAdapter2 = new ColumnLayoutAdapter(this.i, this.x, this.aa);
            this.j = columnLayoutAdapter2;
            columnLayoutAdapter2.b(gridContents2);
        } else if (i6 == 116) {
            List<SingleFunctionGridContent> gridContents3 = ((MultiFunctionTemplate) baseTemplate).getGridContents();
            if (njy.e(gridContents3)) {
                this.r.setVisibility(8);
                LogUtil.j("ColumnLinearLayout", "dataShow() entryContentList is empty.");
                return;
            } else {
                e((GridTemplate) null, this.aa, true);
                ColumnLayoutAdapter columnLayoutAdapter3 = new ColumnLayoutAdapter(this.i, this.x, this.aa);
                this.j = columnLayoutAdapter3;
                columnLayoutAdapter3.a(gridContents3);
            }
        } else {
            if (!(baseTemplate instanceof GridTemplate)) {
                this.r.setVisibility(8);
                LogUtil.j("ColumnLinearLayout", "dataShow() GridTemplate is empty.");
                return;
            }
            GridTemplate gridTemplate2 = (GridTemplate) baseTemplate;
            List<SingleGridContent> listC = fxk.c(i6, gridTemplate2.getSleepAudioType(), gridTemplate2.getGridContents());
            this.m = listC;
            if (njy.e(listC)) {
                this.r.setVisibility(8);
                LogUtil.j("ColumnLinearLayout", "dataShow() gridContentList is empty.");
                return;
            }
            e(gridTemplate2, this.aa, false);
            int i7 = this.h;
            if (i7 != 8 && i7 != 48) {
                LogUtil.a("ColumnLinearLayout", "init ColumnLayoutAdapter: ", Integer.valueOf(this.aa.getContentType()));
                this.j = new ColumnLayoutAdapter(this.i, this.x, this.aa);
                if (this.h == 76) {
                    e(listC.get(0));
                    if (listC.size() > 1) {
                        listC = listC.subList(1, listC.size());
                    } else {
                        listC = new ArrayList<>();
                    }
                }
                this.j.c(listC);
                String category = this.aa.getCategory();
                View.OnClickListener onClickListener = this.t;
                if (onClickListener != null) {
                    this.j.b(onClickListener);
                }
                if (this.h == 24) {
                    this.j.a(gridTemplate2.hasBlank());
                }
                if (TextUtils.equals(category, SingleDailyMomentContent.ACTIVITY_TYPE) && ((i5 = this.h) == 6 || i5 == 15 || i5 == 19 || (i5 == 24 && gridTemplate2.hasBlank()))) {
                    d(listC, this.j);
                    j();
                    return;
                }
                if (TextUtils.equals(category, SingleDailyMomentContent.INFORMATION_TYPE) && ((i4 = this.h) == 6 || i4 == 15 || (i4 == 24 && gridTemplate2.hasBlank()))) {
                    c(listC, this.j);
                    j();
                    return;
                }
                if (TextUtils.equals(category, "Mixed") && ((i3 = this.h) == 6 || i3 == 15 || (i3 == 24 && gridTemplate2.hasBlank()))) {
                    i(listC, this.j);
                    j();
                    return;
                }
                if (TextUtils.equals(category, "SleepAudio") && ((i2 = this.h) == 21 || i2 == 80)) {
                    c(category, listC, this.j);
                    j();
                    return;
                }
                if ((TextUtils.equals(category, "SleepingSeries") || TextUtils.equals(category, "SleepAudio")) && ((i = this.h) == 19 || i == 21)) {
                    c(category, listC, this.j);
                    j();
                    return;
                }
                if (TextUtils.equals(category, "BreathExercise") && this.h == 21) {
                    b(listC, this.j);
                    j();
                    return;
                }
                if (this.h == 84) {
                    a(listC, this.j);
                    j();
                    return;
                }
                if (TextUtils.equals(category, SingleDailyMomentContent.COURSE_TYPE)) {
                    int i8 = this.h;
                    if (i8 == 6 || i8 == 19 || i8 == 107 || (i8 == 24 && gridTemplate2.hasBlank())) {
                        e(listC, this.j);
                        j();
                        return;
                    } else if (this.h == 59) {
                        e(listC, this.j);
                    }
                }
                setVisibilityIfSleepManagement(gridTemplate2);
            } else {
                this.f8256b.clear();
                this.f8256b.add(listC);
                ColumnLayoutAdapter columnLayoutAdapter4 = new ColumnLayoutAdapter(this.i, this.x, this.aa);
                this.j = columnLayoutAdapter4;
                columnLayoutAdapter4.e(this.f8256b);
                if (TextUtils.equals(this.aa.getCategory(), SingleDailyMomentContent.ACTIVITY_TYPE) && this.h == 48) {
                    d(listC, this.j);
                }
            }
        }
        j();
    }

    private void j() {
        this.j.a(this.l);
        this.ab.setAdapter(this.j);
        a();
    }

    private void e(SingleGridContent singleGridContent) {
        LinearLayout.LayoutParams layoutParams;
        float[] fArr;
        View viewInflate = LayoutInflater.from(this.i).inflate(R.layout.card_one_carry_three, (ViewGroup) this, false);
        ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
        if (!(layoutParams2 instanceof LinearLayout.LayoutParams)) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        }
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        int dimensionPixelSize = this.i.getResources().getDimensionPixelSize(R.dimen.health_common_12dp);
        int iIntValue = ((Integer) safeRegionWidth.first).intValue() + dimensionPixelSize;
        int iIntValue2 = ((Integer) safeRegionWidth.second).intValue() + dimensionPixelSize;
        if (!qrs.af(BaseApplication.getActivity())) {
            layoutParams.height = (int) (((qrs.i(BaseApplication.getActivity()) - iIntValue) - iIntValue2) * 0.42857143f);
            layoutParams.width = -1;
            layoutParams.setMarginStart(iIntValue);
            layoutParams.setMarginEnd(iIntValue2);
        } else {
            int dimensionPixelSize2 = this.i.getResources().getDimensionPixelSize(R.dimen.health_common_144dp);
            layoutParams.height = dimensionPixelSize2;
            layoutParams.width = (int) (dimensionPixelSize2 / 0.42857143f);
            layoutParams.setMarginStart(iIntValue);
        }
        layoutParams.bottomMargin = dimensionPixelSize;
        viewInflate.setLayoutParams(layoutParams);
        qqf.c(singleGridContent.getPicture(), (HealthImageView) viewInflate.findViewById(R.id.img_background), 0);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.primary_title);
        if (singleGridContent.isThemeVisibility()) {
            healthTextView.setText(singleGridContent.getTheme());
            healthTextView.setVisibility(0);
        } else {
            healthTextView.setVisibility(8);
        }
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.secondary_title);
        healthTextView2.setText(singleGridContent.getDescription());
        healthTextView2.setVisibility(singleGridContent.getDescriptionVisibility() ? 0 : 8);
        e(viewInflate, singleGridContent);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.corner_mark);
        float fA = fya.a(8.0f);
        if (!LanguageUtil.ba(this.i)) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fA, fA};
        } else {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, fA, fA, 0.0f, 0.0f};
        }
        fya.a(healthTextView3, singleGridContent, fArr);
        LinearLayout linearLayout = this.r;
        if (linearLayout != null) {
            linearLayout.addView(viewInflate, 1);
        }
    }

    private void e(View view, final SingleGridContent singleGridContent) {
        final String linkValue = singleGridContent.getLinkValue();
        view.setOnClickListener(new View.OnClickListener() { // from class: fyx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f34768a.c(linkValue, singleGridContent, view2);
            }
        });
    }

    public /* synthetic */ void c(final String str, final SingleGridContent singleGridContent, View view) {
        if (!fxk.b(str)) {
            c(2, singleGridContent);
            b(str);
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: fyu
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.a(singleGridContent, str, i, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    public /* synthetic */ void a(SingleGridContent singleGridContent, String str, int i, Object obj) {
        if (i == 0) {
            c(2, singleGridContent);
            b(str);
        } else {
            LogUtil.j("ColumnLinearLayout", "getViewClickListener errorCode = ", Integer.valueOf(i));
        }
    }

    private void c(int i, SingleGridContent singleGridContent) {
        HashMap map = new HashMap(3);
        map.put("resourcePositionId", Integer.valueOf(this.x));
        map.put("resourceId", this.aa.getResourceId());
        map.put("resourceName", this.aa.getResourceName());
        map.put("event", Integer.valueOf(i));
        map.put("itemCardName", singleGridContent.getTheme());
        map.put("pullOrder", 1);
        map.put("moreEntryName", this.s);
        if (this.aa != null) {
            map.put("algId", "");
            map.put("smartRecommend", Boolean.valueOf(this.aa.getSmartRecommend()));
        }
        if (!TextUtils.isEmpty(singleGridContent.getDynamicDataId())) {
            map.put("itemId", singleGridContent.getDynamicDataId());
        }
        if (i == 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            map.put("durationTime", Long.valueOf(jCurrentTimeMillis - this.ae));
            this.ae = jCurrentTimeMillis;
        }
        lmf.d().c(this.i, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    private void setSubHeaderHeight(LinearLayout.LayoutParams layoutParams) {
        this.n.setVisibility(4);
        if (layoutParams != null) {
            layoutParams.height = this.i.getResources().getDimensionPixelSize(R.dimen.emui_card_device_12dp);
        }
    }

    private void e(GridTemplate gridTemplate, ResourceBriefInfo resourceBriefInfo, boolean z) {
        if (z) {
            setSubHeaderHeight(getSubHeaderParams());
            return;
        }
        if (gridTemplate == null) {
            return;
        }
        LinearLayout.LayoutParams subHeaderParams = getSubHeaderParams();
        boolean zIsNameVisibility = gridTemplate.isNameVisibility();
        String name = gridTemplate.getName();
        if (!zIsNameVisibility || TextUtils.isEmpty(name)) {
            setSubHeaderHeight(subHeaderParams);
            return;
        }
        this.n.setVisibility(0);
        if (resourceBriefInfo != null && this.h == 84) {
            this.n.setVisibility(8);
        }
        this.n.setHeadTitleText(name);
        this.u = gridTemplate.getLinkValue();
        boolean zB = b(gridTemplate);
        if (!TextUtils.isEmpty(this.u) && !zB) {
            this.n.setMoreLayoutVisibility(0);
            this.n.setMoreViewClickListener(this);
            if (!TextUtils.isEmpty(gridTemplate.getMoreMenuTitle())) {
                this.s = gridTemplate.getMoreMenuTitle();
                this.n.setMoreTextVisibility(0);
                this.n.setMoreTextMaxLines(2);
                this.n.setMoreTextAlignment(6);
                this.n.setMoreText(gridTemplate.getMoreMenuTitle());
            }
        } else {
            this.n.setMoreLayoutVisibility(8);
        }
        this.n.setSubHeaderBackgroundColor(0);
    }

    private boolean b(final GridTemplate gridTemplate) {
        boolean z;
        LogUtil.a("ColumnLinearLayout", "initSubHeadCloseLayout closeButton: ", Boolean.valueOf(gridTemplate.isAdvertiseCloseButtonSwitch()), "  InfoButton: ", Boolean.valueOf(gridTemplate.isAdvertiseInfoButtonSwitch()), "  InfoLink: ", gridTemplate.getAdvertiseInfoLink());
        boolean z2 = true;
        if (gridTemplate.isAdvertiseCloseButtonSwitch()) {
            this.n.setCloseBtnVisibility(0);
            z = true;
        } else {
            z = false;
        }
        if (!gridTemplate.isAdvertiseInfoButtonSwitch() || TextUtils.isEmpty(gridTemplate.getAdvertiseInfoLink())) {
            z2 = z;
        } else {
            this.n.setInfoBtnVisibility(0);
        }
        this.n.setCloseBtnClickListener(new View.OnClickListener() { // from class: fyv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
        this.n.setInfoBtnClickListener(new View.OnClickListener() { // from class: fyt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ColumnLinearLayout.c(gridTemplate, view);
            }
        });
        return z2;
    }

    public /* synthetic */ void b(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("ColumnLinearLayout", "setResourceCloseRecord. closeTime = ", Long.valueOf(jCurrentTimeMillis), "; resourceName = ", this.aa.getResourceName(), "; contentType = ", Integer.valueOf(this.aa.getContentType()));
        fxl.b(this.x, 1, this.aa);
        MarketingBiUtils.b(this.x, this.aa, this.ae);
        setVisibility(8);
    }

    public static /* synthetic */ void c(GridTemplate gridTemplate, View view) {
        LogUtil.a("ColumnLinearLayout", "infoBtn clicked， url：", gridTemplate.getAdvertiseInfoLink());
        ((MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class)).router(gridTemplate.getAdvertiseInfoLink());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        a(fxk.a(this.h, this.q, this.ab.getAdapter() != null ? this.ab.getAdapter().getItemCount() : 0), fxk.a(this.h, this.q), fxk.c(this.h), fxk.a(this.h, this.x));
    }

    private void a(int i, int i2, int i3, int[] iArr) {
        GridLayoutManager gridLayoutManager;
        if (this.i == null) {
            LogUtil.j("ColumnLinearLayout", "setRecyclerViewLayout() mContext is null.");
            return;
        }
        if (i < 1) {
            LogUtil.j("ColumnLinearLayout", "setRecyclerViewLayout() gridNumber should be at least 1.");
            return;
        }
        if (this.v == 2) {
            int i4 = this.h;
            if (i4 == 59 || i4 == 116 || i4 == 23) {
                gridLayoutManager = new GridLayoutManager(this.i, 2);
                gridLayoutManager.setReverseLayout(false);
            } else {
                gridLayoutManager = new GridLayoutManager(this.i, 1);
            }
            gridLayoutManager.setOrientation(0);
        } else {
            gridLayoutManager = new GridLayoutManager(this.i, i);
            gridLayoutManager.setOrientation(1);
        }
        this.ab.setLayoutManager(gridLayoutManager);
        if (this.h == 22 && this.x != 4009) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ab.getLayoutParams();
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            this.ab.setLayoutParams(layoutParams);
        }
        int itemDecorationCount = this.ab.getItemDecorationCount();
        if (!this.ab.isComputingLayout()) {
            if (itemDecorationCount > 0) {
                while (true) {
                    itemDecorationCount--;
                    if (itemDecorationCount < 0) {
                        break;
                    } else {
                        this.ab.removeItemDecorationAt(itemDecorationCount);
                    }
                }
            }
            this.ab.addItemDecoration(new ColumnLayoutItemDecoration(i2, i3, i, iArr, this.h));
        }
        this.ab.setHasFixedSize(true);
        this.ab.setNestedScrollingEnabled(false);
        this.ab.setVisibility(0);
    }

    private LinearLayout.LayoutParams getSubHeaderParams() {
        ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            int i = layoutParams2.leftMargin;
            int i2 = layoutParams2.rightMargin;
            if (fxk.a(this.x)) {
                layoutParams2.leftMargin = i;
                layoutParams2.rightMargin = i2;
                return layoutParams2;
            }
            layoutParams2.leftMargin = i + ((Integer) this.w.first).intValue();
            layoutParams2.rightMargin = i2 + ((Integer) this.w.second).intValue();
        }
        return layoutParams2;
    }

    private int getLayoutOrientation() {
        int i = this.h;
        if (i == 39 || i == 40 || i == 79 || i == 80 || i == 84 || i == 85) {
            return 2;
        }
        switch (i) {
            case 10:
            case 35:
            case 47:
            case 59:
            case 76:
            case GolfCourseInfo.DATA_LENGTH /* 92 */:
            case 94:
            case 96:
            case 107:
            case CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON /* 113 */:
            case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                return 2;
            default:
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return 2;
                    default:
                        return 1;
                }
        }
    }

    private void setRecyclerViewBackground(BaseTemplate baseTemplate) {
        if (this.h == 24 && (baseTemplate instanceof GridTemplate) && !((GridTemplate) baseTemplate).hasBlank()) {
            this.ab.setBackground(ContextCompat.getDrawable(BaseApplication.getContext(), R.drawable.configured_item_image_text_background));
        }
        int i = this.h;
        if (i == 22 || i == 24) {
            f();
            return;
        }
        if (i == 47 && this.x == 4009) {
            this.ac.setBackground(ContextCompat.getDrawable(BaseApplication.getContext(), R.drawable.configured_item_image_text_background));
            h();
            return;
        }
        if (i == 116) {
            MultiFunctionTemplate multiFunctionTemplate = (MultiFunctionTemplate) baseTemplate;
            h();
            n();
            setRecycleViewClickListener(multiFunctionTemplate.getLinkValue());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.r.getLayoutParams();
            layoutParams.width = -2;
            this.r.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.ab.getLayoutParams();
            layoutParams2.width = -2;
            this.ab.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.ac.getLayoutParams();
            layoutParams3.width = -2;
            this.ac.setLayoutParams(layoutParams3);
            RequestOptions requestOptionsCenterCrop = RequestOptions.bitmapTransform(new RoundedCorners((int) getResources().getDimension(R.dimen.defaultCornerRadiusL))).centerCrop();
            CustomTarget<Drawable> customTarget = new CustomTarget<Drawable>() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.12
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable drawable) {
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) ColumnLinearLayout.this.ac.getLayoutParams();
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    layoutParams4.height = (layoutParams4.width * bitmapDrawable.getBitmap().getHeight()) / bitmapDrawable.getBitmap().getWidth();
                    ColumnLinearLayout.this.ac.setLayoutParams(layoutParams4);
                    ColumnLinearLayout.this.ac.setBackground(drawable);
                }
            };
            if (qqs.e(this.i)) {
                qqf.a(multiFunctionTemplate.getDarkBackgroundPicture(), requestOptionsCenterCrop, customTarget);
                return;
            } else {
                qqf.a(multiFunctionTemplate.getPicture(), requestOptionsCenterCrop, customTarget);
                return;
            }
        }
        this.ab.setBackground(null);
    }

    private void setRecycleViewClickListener(final String str) {
        this.ac.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ColumnLinearLayout.this.b(str);
            }
        });
    }

    private void n() {
        ViewGroup.LayoutParams layoutParams = this.ab.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
            int dimensionPixelSize2 = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
            if (!fxk.a(this.x)) {
                dimensionPixelSize += ((Integer) this.w.first).intValue();
                dimensionPixelSize2 += ((Integer) this.w.second).intValue();
            }
            layoutParams2.addRule(14);
            layoutParams2.setMargins(dimensionPixelSize, qqp.a(this.i, 50.0f), dimensionPixelSize2, qqp.a(this.i, 16.0f));
            this.ab.setLayoutParams(layoutParams2);
        }
    }

    private void h() {
        int i = this.h;
        if ((i == 47 && this.x == 4009) || i == 116) {
            ViewGroup.LayoutParams layoutParams = this.ac.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_12dp);
                int dimensionPixelSize2 = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_12dp);
                int iIntValue = fxk.a(this.x) ? 0 : ((Integer) this.w.first).intValue();
                int iIntValue2 = fxk.a(this.x) ? 0 : ((Integer) this.w.second).intValue();
                layoutParams2.setMarginStart(dimensionPixelSize + iIntValue);
                layoutParams2.setMarginEnd(dimensionPixelSize2 + iIntValue2);
                this.ac.setLayoutParams(layoutParams2);
            }
        }
    }

    private void f() {
        ViewGroup.LayoutParams layoutParams = this.ab.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
            int dimensionPixelSize2 = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
            if (fxk.a(this.x)) {
                layoutParams2.setMarginStart(dimensionPixelSize);
                layoutParams2.setMarginEnd(dimensionPixelSize2);
            } else {
                layoutParams2.setMarginStart(dimensionPixelSize + ((Integer) this.w.first).intValue());
                layoutParams2.setMarginEnd(dimensionPixelSize2 + ((Integer) this.w.second).intValue());
            }
            this.ab.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final List<SingleGridContent> list, final ColumnLayoutAdapter columnLayoutAdapter) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.13
                @Override // java.lang.Runnable
                public void run() {
                    ColumnLinearLayout.this.d((List<SingleGridContent>) list, columnLayoutAdapter);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        for (SingleGridContent singleGridContent : list) {
            if (!TextUtils.isEmpty(singleGridContent.getDynamicDataId()) && !arrayList.contains(singleGridContent.getDynamicDataId())) {
                arrayList.add(singleGridContent.getDynamicDataId());
            }
        }
        if (arrayList.size() == 0) {
            LogUtil.j("ColumnLinearLayout", "requestActivityData idLists is empty.");
            j(list, columnLayoutAdapter);
            return;
        }
        List<ActivityIdInfo> listRequestActivityInfo = ColumnRequestUtils.requestActivityInfo(this.i, this.x, arrayList);
        if (njy.e(listRequestActivityInfo)) {
            LogUtil.j("ColumnLinearLayout", "requestActivityData activityIdInfos is empty.");
            j(list, columnLayoutAdapter);
        } else {
            e(list, listRequestActivityInfo);
            j(list, columnLayoutAdapter);
        }
    }

    private void e(final List<SingleGridContent> list, final ColumnLayoutAdapter columnLayoutAdapter) {
        if (njy.e(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (SingleGridContent singleGridContent : list) {
            if (singleGridContent != null && !TextUtils.isEmpty(singleGridContent.getDynamicDataId())) {
                arrayList.add(new gzl.a(singleGridContent.getDynamicDataId()).c());
            }
        }
        d((List<gzl>) arrayList, false, new UiCallback<List<FitWorkout>>() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.11
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("ColumnLinearLayout", "getCourseByIds failed, errorCode:" + i + ", errorInfo:" + str);
                ColumnLinearLayout.this.j(list, columnLayoutAdapter);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitWorkout> list2) {
                if (njy.b(list2)) {
                    LogUtil.a("ColumnLinearLayout", "getCourseByIds success, course count:" + list2.size());
                    ColumnLinearLayout.this.d((List<SingleGridContent>) list, list2);
                }
                ColumnLinearLayout.this.j(list, columnLayoutAdapter);
            }
        });
    }

    private void setVisibilityIfSleepManagement(GridTemplate gridTemplate) {
        if (!njy.e(gridTemplate.getGridContents())) {
            if (gridTemplate.getGridContents().get(0) != null) {
                if (this.h == 15 && "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleep-management?h5pro=true&urlType=4&pName=com.huawei.health&path=distribute&statusBarTextBlack&isImmerse".equals(gridTemplate.getGridContents().get(0).getLinkValue())) {
                    setVisibility(VersionControlUtil.isSupportSleepManagement() ? 0 : 8);
                    return;
                }
                return;
            }
        }
        LogUtil.a("ColumnLinearLayout", "get contents fail");
    }

    private void d(final List<gzl> list, final boolean z, final UiCallback<List<FitWorkout>> uiCallback) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fyw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34766a.b(list, z, uiCallback);
                }
            });
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("ColumnLinearLayout", "getCourseByIds, courseApi is null.");
            uiCallback.onFailure(ResultUtil.ResultCode.PARAMETER_INVALID, "CourseApi is null");
        } else {
            courseApi.getCourseByIds(list, z, uiCallback);
        }
    }

    public /* synthetic */ void b(List list, boolean z, UiCallback uiCallback) {
        d((List<gzl>) list, z, (UiCallback<List<FitWorkout>>) uiCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final List<SingleGridContent> list, final ColumnLayoutAdapter columnLayoutAdapter) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.14
                @Override // java.lang.Runnable
                public void run() {
                    ColumnLinearLayout.this.c((List<SingleGridContent>) list, columnLayoutAdapter);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (SingleGridContent singleGridContent : list) {
            if (!TextUtils.isEmpty(singleGridContent.getDynamicDataId()) && !sb.toString().contains(singleGridContent.getDynamicDataId())) {
                sb.append(",");
                sb.append(singleGridContent.getDynamicDataId());
            }
        }
        if (TextUtils.isEmpty(sb.toString())) {
            LogUtil.j("ColumnLinearLayout", "requestInformationData() idStrings is empty.");
            j(list, columnLayoutAdapter);
            return;
        }
        List<InformationInfo> listRequestInformationInfo = ColumnRequestUtils.requestInformationInfo(sb.toString().substring(1));
        if (njy.e(listRequestInformationInfo)) {
            LogUtil.j("ColumnLinearLayout", "requestInformationData() informationInfoList is empty.");
            j(list, columnLayoutAdapter);
        } else {
            b(list, listRequestInformationInfo);
            j(list, columnLayoutAdapter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final List<SingleGridContent> list, final ColumnLayoutAdapter columnLayoutAdapter) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.18
                @Override // java.lang.Runnable
                public void run() {
                    ColumnLinearLayout.this.i(list, columnLayoutAdapter);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        StringBuilder sb = new StringBuilder();
        for (SingleGridContent singleGridContent : list) {
            if (!TextUtils.isEmpty(singleGridContent.getDynamicDataId())) {
                String itemCategory = singleGridContent.getItemCategory();
                if (TextUtils.equals(itemCategory, SingleDailyMomentContent.ACTIVITY_TYPE) && !arrayList.contains(singleGridContent.getDynamicDataId())) {
                    arrayList.add(singleGridContent.getDynamicDataId());
                }
                if (TextUtils.equals(itemCategory, SingleDailyMomentContent.INFORMATION_TYPE) && !sb.toString().contains(singleGridContent.getDynamicDataId())) {
                    sb.append(",");
                    sb.append(singleGridContent.getDynamicDataId());
                }
                if (TextUtils.equals(itemCategory, SingleDailyMomentContent.COURSE_TYPE) && !arrayList2.contains(singleGridContent.getDynamicDataId())) {
                    arrayList2.add(singleGridContent.getDynamicDataId());
                }
            }
        }
        if (arrayList.isEmpty() && TextUtils.isEmpty(sb.toString()) && arrayList2.isEmpty()) {
            LogUtil.j("ColumnLinearLayout", "requestMixedData() activityIds and informationIds is empty.");
            j(list, columnLayoutAdapter);
            return;
        }
        List<ActivityIdInfo> listRequestActivityInfo = arrayList.size() > 0 ? ColumnRequestUtils.requestActivityInfo(this.i, this.x, arrayList) : null;
        List<InformationInfo> listRequestInformationInfo = TextUtils.isEmpty(sb.toString()) ? null : ColumnRequestUtils.requestInformationInfo(sb.toString().substring(1));
        if (!njy.e(listRequestActivityInfo)) {
            e(list, listRequestActivityInfo);
        }
        if (!njy.e(listRequestInformationInfo)) {
            b(list, listRequestInformationInfo);
        }
        if (arrayList2.isEmpty()) {
            j(list, columnLayoutAdapter);
            return;
        }
        ArrayList arrayList3 = new ArrayList(10);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new gzl.a((String) it.next()).c());
        }
        d((List<gzl>) arrayList3, false, new UiCallback<List<FitWorkout>>() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                ColumnLinearLayout.this.j(list, columnLayoutAdapter);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitWorkout> list2) {
                if (njy.b(list2)) {
                    ColumnLinearLayout.this.d((List<SingleGridContent>) list, list2);
                }
                ColumnLinearLayout.this.j(list, columnLayoutAdapter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final String str, final List<SingleGridContent> list, final ColumnLayoutAdapter columnLayoutAdapter) {
        String dynamicDataId;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    ColumnLinearLayout.this.c(str, (List<SingleGridContent>) list, columnLayoutAdapter);
                }
            });
            return;
        }
        ArrayList<String> arrayList = new ArrayList(list.size());
        for (SingleGridContent singleGridContent : list) {
            if (TextUtils.equals(str, "SleepAudio")) {
                dynamicDataId = singleGridContent.getDynamicDataId();
            } else if (TextUtils.equals(str, "SleepingSeries") && singleGridContent.isAuditionVisibility()) {
                dynamicDataId = singleGridContent.getDynamicDataId();
            } else {
                dynamicDataId = "";
            }
            if (!TextUtils.isEmpty(dynamicDataId) && !arrayList.contains(dynamicDataId)) {
                arrayList.add(dynamicDataId);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            sb.append(",");
            sb.append(str2);
        }
        if (TextUtils.isEmpty(sb.toString())) {
            LogUtil.j("ColumnLinearLayout", "requestSleepData idStrings is empty.");
            j(list, columnLayoutAdapter);
            return;
        }
        String strSubstring = sb.toString().substring(1);
        if (TextUtils.equals(str, "SleepAudio")) {
            d(strSubstring, list, columnLayoutAdapter);
        } else if (TextUtils.equals(str, "SleepingSeries")) {
            b(strSubstring, list, columnLayoutAdapter);
        }
    }

    private void d(String str, List<SingleGridContent> list, ColumnLayoutAdapter columnLayoutAdapter) {
        SleepAudioInfoReq sleepAudioInfoReq = new SleepAudioInfoReq();
        sleepAudioInfoReq.setIds(str);
        sleepAudioInfoReq.setPageNo("1");
        sleepAudioInfoReq.setPageSize("100");
        SleepAudioInfoApi sleepAudioInfoApi = (SleepAudioInfoApi) oet.d().e(SleepAudioInfoApi.class);
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.getContext());
        Map<String, Object> body = activityInfoListFactory.getBody(sleepAudioInfoReq);
        body.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        try {
            Response<RespSleepAudioInfo> responseExecute = sleepAudioInfoApi.getSleepAudioList(sleepAudioInfoReq.getUrl(), activityInfoListFactory.getHeaders(), ofe.c(body)).execute();
            if (responseExecute.isOK()) {
                LogUtil.a("ColumnLinearLayout", "requestSleepAudioData response is OK.");
                RespSleepAudioInfo body2 = responseExecute.getBody();
                if (body2 == null) {
                    LogUtil.j("ColumnLinearLayout", "requestSleepAudioData result is null");
                    j(list, columnLayoutAdapter);
                    return;
                }
                if (body2.getResultCode() == 0 && !njy.e(body2.getSleepAudios())) {
                    for (SingleGridContent singleGridContent : list) {
                        if (singleGridContent != null) {
                            String dynamicDataId = singleGridContent.getDynamicDataId();
                            if (!TextUtils.isEmpty(dynamicDataId)) {
                                for (SleepAudioInfo sleepAudioInfo : body2.getSleepAudios()) {
                                    if (sleepAudioInfo != null && TextUtils.equals(String.valueOf(sleepAudioInfo.getId()), dynamicDataId)) {
                                        singleGridContent.setHeatCount(sleepAudioInfo.getHeatCount());
                                        singleGridContent.setLabelType(sleepAudioInfo.getLabelType());
                                        singleGridContent.setVip(sleepAudioInfo.getIsVip());
                                        singleGridContent.setIsPay(sleepAudioInfo.getPurchasedStatus());
                                        singleGridContent.setExtend("category=SleepAudio");
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    j(list, columnLayoutAdapter);
                    return;
                }
                LogUtil.j("ColumnLinearLayout", "requestSleepAudioData result is error.");
                j(list, columnLayoutAdapter);
                return;
            }
            j(list, columnLayoutAdapter);
        } catch (IOException | NumberFormatException unused) {
            LogUtil.e("ColumnLinearLayout", "requestSleepAudioData exception.");
            j(list, columnLayoutAdapter);
        }
    }

    private void b(String str, final List<SingleGridContent> list, final ColumnLayoutAdapter columnLayoutAdapter) {
        LogUtil.a("ColumnLinearLayout", "requestSleepSeriesData， ids = ", str);
        ((CourseApi) Services.b("CoursePlanService", CourseApi.class)).queryAudiosPackageBySeriesId(str, new UiCallback<List<SleepAudioPackage>>() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                LogUtil.j("ColumnLinearLayout", "requestSleepSeriesData fail, errorCode： ", Integer.valueOf(i), ", errorInfo: ", str2);
                ColumnLinearLayout.this.j(list, columnLayoutAdapter);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<SleepAudioPackage> list2) {
                if (njy.e(list2)) {
                    LogUtil.j("ColumnLinearLayout", "requestSleepSeriesData data is empty");
                    ColumnLinearLayout.this.j(list, columnLayoutAdapter);
                    return;
                }
                for (SingleGridContent singleGridContent : list) {
                    if (singleGridContent != null) {
                        String dynamicDataId = singleGridContent.getDynamicDataId();
                        if (!TextUtils.isEmpty(dynamicDataId)) {
                            for (SleepAudioPackage sleepAudioPackage : list2) {
                                if (sleepAudioPackage != null) {
                                    SleepAudioSeries sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries();
                                    if (sleepAudioSeries == null) {
                                        LogUtil.j("ColumnLinearLayout", "series is null");
                                    } else if (TextUtils.equals(String.valueOf(sleepAudioSeries.getId()), dynamicDataId)) {
                                        singleGridContent.setVip(sleepAudioSeries.getIsVip());
                                        singleGridContent.setIsPay(sleepAudioSeries.getPurchasedStatus());
                                        singleGridContent.setExtend("category=SleepingSeries");
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                ColumnLinearLayout.this.j(list, columnLayoutAdapter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<SingleGridContent> list, final ColumnLayoutAdapter columnLayoutAdapter) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    ColumnLinearLayout.this.a((List<SingleGridContent>) list, columnLayoutAdapter);
                }
            });
            return;
        }
        LogUtil.a("ColumnLinearLayout", "requestCourseData");
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.a("ColumnLinearLayout", "mCourseApi not found");
            j(list, columnLayoutAdapter);
            return;
        }
        String strC = c(list);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.a("ColumnLinearLayout", "topicIds not found");
            j(list, columnLayoutAdapter);
        } else {
            try {
                courseApi.queryAudiosPackageBySeriesId(strC, new UiCallback<List<SleepAudioPackage>>() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.10
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e("ColumnLinearLayout", "queryAudiosPackageBySeriesId fail, errorCode： ", Integer.valueOf(i), ", errorInfo: ", str);
                        ColumnLinearLayout.this.j(list, columnLayoutAdapter);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(List<SleepAudioPackage> list2) {
                        if (!njy.e(list2)) {
                            if (ColumnLinearLayout.this.e(list2)) {
                                ColumnLinearLayout.this.c((List<SingleGridContent>) list, list2, columnLayoutAdapter);
                                return;
                            } else {
                                ColumnLinearLayout.this.b((List<SingleGridContent>) list, columnLayoutAdapter, list2, false);
                                return;
                            }
                        }
                        LogUtil.a("ColumnLinearLayout", "data is empty");
                        ColumnLinearLayout.this.j(list, columnLayoutAdapter);
                    }
                });
            } catch (NumberFormatException unused) {
                LogUtil.e("ColumnLinearLayout", "requestSleepAudioData exception.");
                j(list, columnLayoutAdapter);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<SingleGridContent> list, ColumnLayoutAdapter columnLayoutAdapter, List<SleepAudioPackage> list2, boolean z) {
        LogUtil.a("ColumnLinearLayout", "refreshView: isVipUser: ", Boolean.valueOf(z));
        c(list, list2, z);
        j(list, columnLayoutAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final List<SingleGridContent> list, final List<SleepAudioPackage> list2, final ColumnLayoutAdapter columnLayoutAdapter) {
        LogUtil.a("ColumnLinearLayout", "requestVipInfo: ");
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j("ColumnLinearLayout", "refreshVipStateData VipApi is null");
            b(list, columnLayoutAdapter, list2, false);
        } else {
            vipApi.getVipInfo(new VipCallback() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.7
                @Override // com.huawei.health.vip.api.VipCallback
                public void onSuccess(Object obj) {
                    UserMemberInfo userMemberInfo;
                    if (obj == null) {
                        LogUtil.a("ColumnLinearLayout", "getVipInfo onSuccess result is null");
                        ColumnLinearLayout.this.b((List<SingleGridContent>) list, columnLayoutAdapter, (List<SleepAudioPackage>) list2, false);
                        return;
                    }
                    if (obj instanceof UserMemberInfo) {
                        userMemberInfo = (UserMemberInfo) obj;
                        LogUtil.a("ColumnLinearLayout", "memberInfo: ", userMemberInfo.toString());
                    } else {
                        userMemberInfo = null;
                    }
                    if (userMemberInfo == null || userMemberInfo.getMemberFlag() != 1) {
                        LogUtil.j("ColumnLinearLayout", "TradeViewApi memberInfo == null or != VipConstants.MEMBER_FLAG_VIP");
                        ColumnLinearLayout.this.b((List<SingleGridContent>) list, columnLayoutAdapter, (List<SleepAudioPackage>) list2, false);
                    } else if (!irz.d(userMemberInfo)) {
                        ColumnLinearLayout.this.b((List<SingleGridContent>) list, columnLayoutAdapter, (List<SleepAudioPackage>) list2, true);
                    } else {
                        LogUtil.j("ColumnLinearLayout", "isVipExpired");
                        ColumnLinearLayout.this.b((List<SingleGridContent>) list, columnLayoutAdapter, (List<SleepAudioPackage>) list2, false);
                    }
                }

                @Override // com.huawei.health.vip.api.VipCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("ColumnLinearLayout", "getVipInfo errorCode=", Integer.valueOf(i), " errMsg=", str);
                    ColumnLinearLayout.this.b((List<SingleGridContent>) list, columnLayoutAdapter, (List<SleepAudioPackage>) list2, false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(List<SleepAudioPackage> list) {
        SleepAudioSeries sleepAudioSeries;
        for (SleepAudioPackage sleepAudioPackage : list) {
            if (sleepAudioPackage != null && (sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries()) != null && sleepAudioSeries.getIsVip() == 1) {
                return true;
            }
        }
        return false;
    }

    private void c(List<SingleGridContent> list, List<SleepAudioPackage> list2, boolean z) {
        SleepAudioSeries sleepAudioSeries;
        LogUtil.a("ColumnLinearLayout", "parseSeriesInfo: isVipUser: ", Boolean.valueOf(z));
        for (SingleGridContent singleGridContent : list) {
            if (singleGridContent != null) {
                String dynamicDataId = singleGridContent.getDynamicDataId();
                if (!TextUtils.isEmpty(dynamicDataId)) {
                    for (SleepAudioPackage sleepAudioPackage : list2) {
                        if (sleepAudioPackage != null && (sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries()) != null && TextUtils.equals(String.valueOf(sleepAudioSeries.getId()), dynamicDataId)) {
                            int isVip = sleepAudioSeries.getIsVip();
                            LogUtil.a("ColumnLinearLayout", "parseSeriesInfo: isVip: ", Integer.valueOf(isVip), ", id: ", dynamicDataId);
                            if (isVip == 1) {
                                int i = z ? 1 : 2;
                                LogUtil.a("ColumnLinearLayout", "parseSeriesInfo: isPaid: ", Integer.valueOf(i));
                                singleGridContent.setIsPay(i);
                                singleGridContent.setPlayPercent(haa.a(sleepAudioPackage, z, i));
                            } else {
                                int purchasedStatus = sleepAudioSeries.getPurchasedStatus();
                                LogUtil.a("ColumnLinearLayout", "parseSeriesInfo: status: ", Integer.valueOf(purchasedStatus));
                                singleGridContent.setIsPay(purchasedStatus);
                                singleGridContent.setPlayPercent(haa.a(sleepAudioPackage, z, purchasedStatus));
                            }
                            singleGridContent.setVip(sleepAudioSeries.getIsVip());
                            break;
                        }
                    }
                }
            }
        }
    }

    private String c(List<SingleGridContent> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            SingleGridContent singleGridContent = list.get(i);
            if (singleGridContent != null) {
                if (i == list.size() - 1) {
                    sb.append(singleGridContent.getDynamicDataId());
                } else {
                    sb.append(singleGridContent.getDynamicDataId());
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final List<SingleGridContent> list, final ColumnLayoutAdapter columnLayoutAdapter) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.6
                @Override // java.lang.Runnable
                public void run() {
                    ColumnLinearLayout.this.b((List<SingleGridContent>) list, columnLayoutAdapter);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<SingleGridContent> it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            SingleGridContent next = it.next();
            if (!TextUtils.isEmpty(next.getDynamicDataId())) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    String[] strArrSplit = sb.toString().substring(1).split(",");
                    int length = strArrSplit.length;
                    while (true) {
                        if (i < length) {
                            if (TextUtils.equals(strArrSplit[i], next.getDynamicDataId())) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            sb.append(",");
                            sb.append(next.getDynamicDataId());
                            break;
                        }
                    }
                } else if (!TextUtils.isEmpty(next.getDynamicDataId())) {
                    sb.append(",");
                    sb.append(next.getDynamicDataId());
                }
            }
        }
        if (TextUtils.isEmpty(sb.toString())) {
            LogUtil.j("ColumnLinearLayout", "requestBreathExerciseData idBuilder is empty.");
            j(list, columnLayoutAdapter);
            return;
        }
        String strSubstring = sb.toString().substring(1);
        BreathExerciseInfoReq breathExerciseInfoReq = new BreathExerciseInfoReq();
        breathExerciseInfoReq.setIds(strSubstring);
        BreathExerciseInfoApi breathExerciseInfoApi = (BreathExerciseInfoApi) oet.d().e(BreathExerciseInfoApi.class);
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.getContext());
        try {
            Response<RespBreathExerciseInfo> responseExecute = breathExerciseInfoApi.getBreathExerciseList(breathExerciseInfoReq.getUrl(), activityInfoListFactory.getHeaders(), ofe.c(activityInfoListFactory.getBody(breathExerciseInfoReq))).execute();
            if (responseExecute.isOK()) {
                LogUtil.a("ColumnLinearLayout", "requestBreathExerciseData response is OK.");
                RespBreathExerciseInfo body = responseExecute.getBody();
                if (body == null) {
                    LogUtil.j("ColumnLinearLayout", "requestBreathExerciseInfo result is empty.");
                    j(list, columnLayoutAdapter);
                    return;
                }
                if (body.getResultCode().equals("0") && !njy.e(body.getBreathTrainings())) {
                    for (SingleGridContent singleGridContent : list) {
                        if (singleGridContent != null) {
                            String dynamicDataId = singleGridContent.getDynamicDataId();
                            if (!TextUtils.isEmpty(dynamicDataId)) {
                                for (BreathExerciseInfo breathExerciseInfo : body.getBreathTrainings()) {
                                    if (breathExerciseInfo != null && TextUtils.equals(String.valueOf(breathExerciseInfo.getId()), dynamicDataId)) {
                                        singleGridContent.setHeatCount(breathExerciseInfo.getHeatCount());
                                        singleGridContent.setVip(Integer.parseInt(breathExerciseInfo.getIsVip()));
                                        singleGridContent.setLabelType(breathExerciseInfo.getLabelType());
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    j(list, columnLayoutAdapter);
                    return;
                }
                LogUtil.j("ColumnLinearLayout", "requestBreathExerciseData result is error. ", body.getResultCode());
                j(list, columnLayoutAdapter);
                return;
            }
            j(list, columnLayoutAdapter);
        } catch (IOException | NumberFormatException e) {
            LogUtil.e("ColumnLinearLayout", "exception is:", e.getMessage());
            j(list, columnLayoutAdapter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(List<SingleGridContent> list, ColumnLayoutAdapter columnLayoutAdapter) {
        synchronized (this) {
            this.ad = list;
            Message messageObtainMessage = this.p.obtainMessage();
            messageObtainMessage.what = 8193;
            messageObtainMessage.obj = columnLayoutAdapter;
            this.p.sendMessage(messageObtainMessage);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (TextUtils.isEmpty(this.u) || qrs.r()) {
            return;
        }
        if (!fxk.b(this.u)) {
            b(this.u);
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: fzb
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f34776b.b(i, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    public /* synthetic */ void b(int i, Object obj) {
        if (i == 0) {
            b(this.u);
        } else {
            LogUtil.j("ColumnLinearLayout", "onClick errorCode = ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ColumnLinearLayout", "goToDetail linkValue is empty ");
            return;
        }
        d();
        LogUtil.a("ColumnLinearLayout", "more linkValue: ", str);
        if (this.h == 83) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.setPackage(this.i.getPackageName());
            intent.setFlags(268435456);
            lsx.c(intent, this.i);
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi == null || str == null) {
            return;
        }
        marketRouterApi.router(str);
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        return (resourceBriefInfo == null || this.aa == null || !resourceBriefInfo.getResourceId().equals(this.aa.getResourceId())) ? false : true;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        return this.y;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.x;
    }

    private void d() {
        HashMap map = new HashMap(3);
        map.put("resourcePositionId", Integer.valueOf(this.x));
        map.put("resourceId", this.aa.getResourceId());
        map.put("resourceName", this.aa.getResourceName());
        map.put("event", 3);
        map.put("pullOrder", 1);
        map.put("algId", "");
        map.put("moreEntryName", this.s);
        map.put("smartRecommend", Boolean.valueOf(this.aa.getSmartRecommend()));
        map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.ae));
        this.ae = System.currentTimeMillis();
        lmf.d().c(this.i, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    private void e(List<SingleGridContent> list, List<ActivityIdInfo> list2) {
        for (SingleGridContent singleGridContent : list) {
            if (singleGridContent != null) {
                String dynamicDataId = singleGridContent.getDynamicDataId();
                if (!TextUtils.isEmpty(dynamicDataId)) {
                    for (ActivityIdInfo activityIdInfo : list2) {
                        if (activityIdInfo != null && TextUtils.equals(dynamicDataId, activityIdInfo.getActivityId())) {
                            singleGridContent.setBeginDate(activityIdInfo.getBeginDate());
                            singleGridContent.setEndDate(activityIdInfo.getEndDate());
                            singleGridContent.setNumberOfPeople(activityIdInfo.getNumberOfPeople());
                            singleGridContent.setAvatarUrlList(activityIdInfo.getPortraitUrls());
                            singleGridContent.setStatistic(this.i.getResources().getQuantityString(R.plurals.IDS_person_join, activityIdInfo.getNumberOfPeople(), UnitUtil.e(activityIdInfo.getNumberOfPeople(), 1, 0)));
                            break;
                        }
                    }
                }
            }
        }
    }

    private void b(List<SingleGridContent> list, List<InformationInfo> list2) {
        for (SingleGridContent singleGridContent : list) {
            if (singleGridContent != null) {
                String dynamicDataId = singleGridContent.getDynamicDataId();
                if (!TextUtils.isEmpty(dynamicDataId)) {
                    for (InformationInfo informationInfo : list2) {
                        if (informationInfo != null && TextUtils.equals(dynamicDataId, String.valueOf(informationInfo.getId()))) {
                            singleGridContent.setNumberOfPeople(informationInfo.getReadCount());
                            singleGridContent.setAvatarUrlList(informationInfo.getAvatarList());
                            singleGridContent.setStatistic(this.i.getResources().getQuantityString(R.plurals.IDS_have_viewed, informationInfo.getReadCount(), UnitUtil.e(informationInfo.getReadCount(), 1, 0)));
                            break;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<SingleGridContent> list, List<FitWorkout> list2) {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        float weightOrDefaultValue = userInfo != null ? userInfo.getWeightOrDefaultValue() : 1.0f;
        for (SingleGridContent singleGridContent : list) {
            if (singleGridContent != null) {
                String dynamicDataId = singleGridContent.getDynamicDataId();
                if (!TextUtils.isEmpty(dynamicDataId)) {
                    for (FitWorkout fitWorkout : list2) {
                        if (fitWorkout != null && TextUtils.equals(dynamicDataId, fitWorkout.acquireId())) {
                            singleGridContent.setCostTime(fitWorkout.acquireDuration());
                            singleGridContent.setNumberOfPeople(fitWorkout.acquireUsers());
                            singleGridContent.setExtend(((int) ifp.b(fitWorkout.acquireCalorie() * weightOrDefaultValue)) + "," + fitWorkout.acquireDifficulty());
                            singleGridContent.setAvatarUrlList(fitWorkout.getPortraitUrlList());
                            singleGridContent.setStatistic(this.i.getResources().getQuantityString(R.plurals.IDS_have_trained, fitWorkout.acquireUsers(), UnitUtil.e((double) fitWorkout.acquireUsers(), 1, 0)));
                            break;
                        }
                    }
                }
            }
        }
    }

    static class d implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
        private final WeakReference<ColumnLinearLayout> e;

        public d(ColumnLinearLayout columnLinearLayout) {
            this.e = new WeakReference<>(columnLinearLayout);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ColumnLinearLayout columnLinearLayout = this.e.get();
            if (columnLinearLayout == null) {
                return;
            }
            if (columnLinearLayout.d) {
                qsp.b(columnLinearLayout.r, this);
            } else {
                columnLinearLayout.b();
            }
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            ColumnLinearLayout columnLinearLayout = this.e.get();
            if (columnLinearLayout == null) {
                return;
            }
            if (columnLinearLayout.d) {
                qsp.c(columnLinearLayout.r, this);
            } else {
                columnLinearLayout.b();
            }
        }
    }

    static class a implements Observer {
        private WeakReference<ColumnLinearLayout> e;

        a(ColumnLinearLayout columnLinearLayout) {
            this.e = new WeakReference<>(columnLinearLayout);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            final ColumnLinearLayout columnLinearLayout = this.e.get();
            if (columnLinearLayout == null) {
                return;
            }
            if (!njy.c(objArr, 0)) {
                LogUtil.e("ColumnLinearLayout", "null args!");
                return;
            }
            Object obj = objArr[0];
            if ((obj instanceof Boolean) && (objArr[1] instanceof Boolean)) {
                columnLinearLayout.e = ((Boolean) obj).booleanValue() ? 1 : 0;
                if (((Boolean) objArr[1]).booleanValue()) {
                    return;
                }
                HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.marketing.views.ColumnLinearLayout.a.4
                    @Override // java.lang.Runnable
                    public void run() {
                        columnLinearLayout.l();
                    }
                }, 300L);
            }
        }
    }
}
