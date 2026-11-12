package com.huawei.health.marketing.views;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.CourseNoticeStandardTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.fya;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.util.HashMap;

/* JADX INFO: loaded from: classes29.dex */
public class CoursePreviewLayout extends LinearLayout implements View.OnClickListener, ResourceBriefInfoOwnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Pair<Integer, Integer> f8313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSubHeader f8314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CoursePreviewAdapter f8315c;
    private String d;
    private HealthRecycleView e;
    private CourseNoticeStandardTemplate f;
    private ResourceBriefInfo g;
    private int h;

    public CoursePreviewLayout(Context context) {
        super(context);
        this.f8313a = BaseActivity.getSafeRegionWidth();
    }

    public void e(int i, ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate) {
        if (!(baseTemplate instanceof CourseNoticeStandardTemplate)) {
            LogUtil.j("CoursePreviewLayout", "template is not CourseNoticeStandardTemplate");
            return;
        }
        this.h = i;
        this.f = (CourseNoticeStandardTemplate) baseTemplate;
        this.g = resourceBriefInfo;
        LogUtil.a("CoursePreviewLayout", "template:", baseTemplate.toString());
        a();
    }

    private void a() {
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.layout_course_preview, this);
        this.f8314b = (HealthSubHeader) viewInflate.findViewById(R.id.marketing_course_sub_header);
        this.e = (HealthRecycleView) viewInflate.findViewById(R.id.marketing_course_recycler_view);
        setSubHeaderUi(this.f);
        this.f8315c = new CoursePreviewAdapter(this.f, this.h, this.g);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BaseApplication.getContext());
        linearLayoutManager.setOrientation(0);
        this.e.setLayoutManager(linearLayoutManager);
        this.e.setAdapter(this.f8315c);
        c(this.e);
        if (fxk.a(this.h)) {
            return;
        }
        viewInflate.setPadding(((Integer) this.f8313a.first).intValue(), 0, ((Integer) this.f8313a.second).intValue(), 0);
    }

    private void setSubHeaderUi(CourseNoticeStandardTemplate courseNoticeStandardTemplate) {
        if (courseNoticeStandardTemplate == null) {
            LogUtil.j("CoursePreviewLayout", "setSubHeaderUi template is null");
            return;
        }
        boolean zIsNameVisibility = courseNoticeStandardTemplate.isNameVisibility();
        String name = courseNoticeStandardTemplate.getName();
        fya.b(zIsNameVisibility && !TextUtils.isEmpty(name), this.f8314b);
        this.f8314b.setHeadTitleText(name);
        String linkValue = courseNoticeStandardTemplate.getLinkValue();
        this.d = linkValue;
        if (!TextUtils.isEmpty(linkValue)) {
            this.f8314b.setMoreLayoutVisibility(0);
            if (!TextUtils.isEmpty(courseNoticeStandardTemplate.getMoreMenuTitle())) {
                this.f8314b.setMoreTextMaxLines(2);
                this.f8314b.setMoreTextAlignment(6);
                this.f8314b.setMoreText(courseNoticeStandardTemplate.getMoreMenuTitle());
                this.f8314b.setMoreTextVisibility(0);
            } else {
                this.f8314b.setMoreTextVisibility(4);
            }
            this.f8314b.setMoreViewClickListener(this);
        } else {
            this.f8314b.setMoreLayoutVisibility(8);
        }
        this.f8314b.setSubHeaderBackgroundColor(0);
    }

    private void c(HealthRecycleView healthRecycleView) {
        healthRecycleView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.huawei.health.marketing.views.CoursePreviewLayout.4
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect, view, recyclerView, state);
                int dimensionPixelOffset = CoursePreviewLayout.this.getResources().getDimensionPixelOffset(R.dimen.cardMarginMiddle);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int size = CoursePreviewLayout.this.f.getGridContents().size();
                if (LanguageUtil.ba(BaseApplication.getContext())) {
                    if (childAdapterPosition == 0) {
                        rect.right = dimensionPixelOffset;
                    }
                    if (childAdapterPosition == size - 1) {
                        rect.left = dimensionPixelOffset;
                        return;
                    }
                    return;
                }
                if (childAdapterPosition == 0) {
                    rect.left = dimensionPixelOffset;
                }
                if (childAdapterPosition == size - 1) {
                    rect.right = dimensionPixelOffset;
                }
            }
        });
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        return (resourceBriefInfo == null || this.g == null || !resourceBriefInfo.getResourceId().equals(this.g.getResourceId())) ? false : true;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        ResourceBriefInfo resourceBriefInfo = this.g;
        if (resourceBriefInfo != null) {
            return resourceBriefInfo.getPriority();
        }
        return 0;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.hwsubheader_more_container) {
            if (TextUtils.isEmpty(this.d)) {
                LogUtil.j("CoursePreviewLayout", "mMoreUrl is empty");
            } else if (!fxk.b(this.d)) {
                d(this.d, 3);
            } else {
                LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: fzf
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f34782a.e(i, obj);
                    }
                }, AnalyticsValue.MARKETING_RESOURCE.value());
            }
        }
    }

    public /* synthetic */ void e(int i, Object obj) {
        if (i == 0) {
            d(this.d, 3);
        } else {
            LogUtil.j("CoursePreviewLayout", "onClick errorCode = ", Integer.valueOf(i));
        }
    }

    private void d(String str, int i) {
        LogUtil.a("CoursePreviewLayout", "goToMore ");
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(fxl.d(str, this.g, this.h, 1));
        }
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        map.put("moreEntryName", this.f.getMoreMenuTitle());
        MarketingBiUtils.a(i, this.h, this.g, map);
    }
}
