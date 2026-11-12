package com.huawei.health.marketing.views;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.BaseSidingTemplate;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.dkf;
import defpackage.ewz;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.lmd;
import defpackage.njy;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseSeriesSidingLayout<T> extends BaseLifeCycleLinearLayout implements ResourceBriefInfoOwnable {
    protected final String TAG;
    private String mCategory;
    protected Context mContext;
    private RelativeLayout mHeader;
    private HealthTextView mHeaderSubTitle;
    protected HealthTextView mHeaderTitle;
    private HealthRecycleView mHealthRecycleView;
    private HealthTextView mMore;
    private ImageView mMoreArray;
    protected LinearLayout mMoreLayout;
    private Pair<Integer, Integer> mPair;
    protected int mPositionId;
    private ResourceBriefInfo mResourceBriefInfo;
    protected String mResourceId;
    protected String mResourceName;
    protected BaseSidingTemplate mTemplate;
    protected String mTemplateTheme;
    private View mainView;

    protected abstract BaseSeriesSidingAdapter<T> getAdapter();

    public BaseSeriesSidingLayout(Context context) {
        this(context, null);
    }

    public BaseSeriesSidingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseSeriesSidingLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public BaseSeriesSidingLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.TAG = getLayoutTag();
        this.mPair = BaseActivity.getSafeRegionWidth();
        this.mContext = context;
    }

    public ResourceBriefInfo getResourceBriefInfo() {
        return this.mResourceBriefInfo;
    }

    public void initData(int i, ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate) {
        LogUtil.a(this.TAG, "initData");
        if (resourceBriefInfo == null) {
            LogUtil.e(this.TAG, "resourceBriefInfo is null");
            return;
        }
        if (!(baseTemplate instanceof BaseSidingTemplate)) {
            LogUtil.e(this.TAG, "filterTemplate error");
            return;
        }
        LogUtil.a(this.TAG, "resourceBriefInfo: " + resourceBriefInfo.toString());
        this.mPositionId = i;
        this.mResourceBriefInfo = resourceBriefInfo;
        this.mResourceId = resourceBriefInfo.getResourceId();
        this.mResourceName = this.mResourceBriefInfo.getResourceName();
        this.mCategory = this.mResourceBriefInfo.getCategory();
        BaseSidingTemplate baseSidingTemplate = (BaseSidingTemplate) baseTemplate;
        this.mTemplate = baseSidingTemplate;
        this.mTemplateTheme = baseSidingTemplate.getTheme();
        if (njy.e(this.mTemplate.getGridContents())) {
            LogUtil.j(this.TAG, "List isEmpty");
        } else {
            initViews();
            bindData();
        }
    }

    private void bindData() {
        setMarginLayoutParams(this.mHeader, this.mTemplate.isNameVisibility());
        qsp.a(this.mHeaderTitle, this.mTemplate.getTheme(), true);
        bindTitleData();
        BaseSeriesSidingAdapter<T> adapter = getAdapter();
        if (adapter == null) {
            LogUtil.e(this.TAG, "mAdapter is null");
        } else {
            adapter.setDataList(this.mTemplate.getGridContents(), this.mResourceBriefInfo);
            this.mHealthRecycleView.setAdapter(adapter);
        }
    }

    private void bindTitleData() {
        qsp.a(this.mHeaderSubTitle, this.mTemplate.getSubTitle(), true);
        if (this.mMore == null || TextUtils.isEmpty(this.mTemplate.getLinkValue())) {
            this.mMoreLayout.setVisibility(8);
        } else {
            qsp.a(this.mMore, this.mTemplate.getTopRightCornerText(), true);
            this.mMoreLayout.setVisibility(0);
            qsp.b(this.mMoreLayout, getViewClickListener());
        }
        this.mMoreArray.setImageDrawable(this.mContext.getResources().getDrawable(R.drawable.member_tab_pic_arrow_right));
    }

    private View.OnClickListener getViewClickListener() {
        return new View.OnClickListener() { // from class: com.huawei.health.marketing.views.BaseSeriesSidingLayout.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String linkValue = BaseSeriesSidingLayout.this.mTemplate.getLinkValue();
                if (TextUtils.isEmpty(linkValue) || qrs.r()) {
                    LogUtil.a(BaseSeriesSidingLayout.this.TAG, "linkValue is error, linkValue: ", linkValue);
                    return;
                }
                MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
                if (marketRouterApi != null) {
                    String strD = fxl.d(linkValue, BaseSeriesSidingLayout.this.mCategory);
                    BaseSeriesSidingLayout baseSeriesSidingLayout = BaseSeriesSidingLayout.this;
                    marketRouterApi.router(baseSeriesSidingLayout.setUrlPositionId(strD, baseSeriesSidingLayout.mPositionId));
                    HashMap map = new HashMap();
                    map.put("moreEntryName", BaseSeriesSidingLayout.this.mTemplate.getTopRightCornerText());
                    MarketingBiUtils.a(3, BaseSeriesSidingLayout.this.mPositionId, BaseSeriesSidingLayout.this.mResourceBriefInfo, map);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String setUrlPositionId(String str, int i) {
        if (str.contains("?")) {
            return str + "&pullfrom=" + i;
        }
        return str + "?pullfrom=" + i;
    }

    private void initViews() {
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.series_siding_layout, this);
        this.mainView = viewInflate;
        this.mHeader = (RelativeLayout) viewInflate.findViewById(R.id.section_sub_header);
        this.mHeaderTitle = (HealthTextView) this.mainView.findViewById(R.id.header_title);
        this.mHeaderSubTitle = (HealthTextView) this.mainView.findViewById(R.id.header_subtitle);
        this.mMoreLayout = (LinearLayout) this.mainView.findViewById(R.id.more_layout);
        this.mMore = (HealthTextView) this.mainView.findViewById(R.id.more);
        this.mMoreArray = (ImageView) this.mainView.findViewById(R.id.title_more_array);
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.mainView.findViewById(R.id.series_course_recycler_view);
        this.mHealthRecycleView = healthRecycleView;
        dkf.d(healthRecycleView);
        this.mHealthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this.mContext, 0, false));
        setSeriesRecyclerviewBiEvent();
    }

    private void setSeriesRecyclerviewBiEvent() {
        this.mHealthRecycleView.setIsOpenExposedTime(true);
        this.mHealthRecycleView.setOnCardExposureTimeListener(new HealthRecycleView.OnCardExposureTimeListener() { // from class: fyh
            @Override // com.huawei.ui.commonui.recycleview.HealthRecycleView.OnCardExposureTimeListener
            public final void onCardExposed(int i, long j, TimeUnit timeUnit) {
                this.e.m1126xd13a0b28(i, j, timeUnit);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setSeriesRecyclerviewBiEvent$0$com-huawei-health-marketing-views-BaseSeriesSidingLayout, reason: not valid java name */
    public /* synthetic */ void m1126xd13a0b28(int i, long j, TimeUnit timeUnit) {
        if (this.mResourceBriefInfo == null) {
            return;
        }
        this.mHealthRecycleView.setCollectExposedTime(new lmd(this.mResourceBriefInfo.getResourceId(), this.mResourceBriefInfo.getResourceName(), ewz.c(this.mTemplate, i), String.valueOf(this.mPositionId), String.valueOf(i), j));
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onStop() {
        super.onStop();
        HealthRecycleView healthRecycleView = this.mHealthRecycleView;
        if (healthRecycleView != null) {
            healthRecycleView.onStop();
        }
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        super.onResume();
        HealthRecycleView healthRecycleView = this.mHealthRecycleView;
        if (healthRecycleView != null) {
            healthRecycleView.onResume();
        }
    }

    private void setMarginLayoutParams(RelativeLayout relativeLayout, boolean z) {
        if (relativeLayout.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (!z) {
                relativeLayout.setVisibility(4);
                layoutParams.height = qre.b(R.dimen.emui_card_device_12dp);
            } else {
                relativeLayout.setVisibility(0);
                layoutParams.topMargin = qre.b(R.dimen.health_common_16dp);
                int iB = qre.b(R.dimen.defaultPaddingStart);
                int iB2 = qre.b(R.dimen.defaultPaddingEnd);
                if (fxk.a(this.mPositionId)) {
                    layoutParams.setMarginStart(iB);
                    layoutParams.setMarginEnd(iB2);
                } else {
                    layoutParams.setMarginStart(iB + ((Integer) this.mPair.first).intValue());
                    layoutParams.setMarginEnd(iB2 + ((Integer) this.mPair.second).intValue());
                }
            }
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        boolean z = (resourceBriefInfo == null || this.mResourceBriefInfo == null || !resourceBriefInfo.getResourceId().equals(this.mResourceBriefInfo.getResourceId())) ? false : true;
        LogUtil.a(this.TAG, "isOwnedByBriefInfo: " + z);
        return z;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        ResourceBriefInfo resourceBriefInfo = this.mResourceBriefInfo;
        if (resourceBriefInfo != null) {
            return resourceBriefInfo.getPriority();
        }
        return 0;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.mPositionId;
    }

    protected String getLayoutTag() {
        return "BaseSeriesSidingLayout";
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a(this.TAG, "onConfigurationChanged1: ", Integer.valueOf(configuration.orientation));
        HealthRecycleView healthRecycleView = this.mHealthRecycleView;
        if (healthRecycleView == null || healthRecycleView.getAdapter() == null) {
            return;
        }
        this.mHealthRecycleView.getAdapter().notifyDataSetChanged();
    }
}
