package com.huawei.ui.main.stories.health.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.indicator.HealthLevelIndicator;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.WeightBodyDataActivity;
import defpackage.dnb;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qli;
import defpackage.qlj;
import defpackage.qqf;
import defpackage.qrr;
import defpackage.uww;
import defpackage.vdo;
import defpackage.vei;
import defpackage.vns;
import defpackage.wtx;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class WeightBodyDataFragment extends BaseFragment {
    public static final String AI_BODY_SHAPE_BEAN = "AI_BODY_SHAPE_BEAN";
    protected static final float MAX_LEVEL_PERCENT = 100.0f;
    protected static final float PRECISION_VALUE_ONE = 0.1f;
    protected static final float PRECISION_VALUE_TWO = 0.01f;
    private static final String TAG = "HealthWeight_WeightBodyDataFragment";
    private static final int TEXT_SIZE = 10;
    private static final String WEIGHT_BODY_DATA_QUERY_KEY = "test";
    protected HealthImageView mAIBodyDataImageView;
    protected View mAIBodyDataImageViewLayout;
    private HealthCardView mAboutCardView;
    private HealthTextView mAboutDescription;
    protected ImageView mAboutImage;
    private HealthSubHeader mAboutSubHeader;
    protected WeightBodyDataActivity mActivity;
    protected uww mAiBodyShapeBean;
    private HealthTextView mBalanced;
    private HealthCardView mBalancedCardView;
    private HealthTextView mBalancedDescription;
    private HealthSubHeader mBalancedSubHeader;
    private HealthTextView mBalancedSuggest;
    protected Context mContext;
    private HealthCardView mDataCardView;
    private HealthTextView mDataSubTitle;
    protected HealthTextView mDataUnit;
    private HealthTextView mDataValue;
    protected byte mGender;
    private HealthTextView mIdeal;
    private HealthCardView mIdealCardView;
    protected HealthTextView mIdealDescription;
    private HealthSubHeader mIdealSubHeader;
    private HealthLevelIndicator mIndicator;
    private HealthCardView mIndicatorCardView;
    private ViewStub mIndicatorLevelLayout;
    protected Resources mResources;
    private HealthCardView mResultCardView;
    private HealthTextView mResultDescription;
    private HealthSubHeader mResultSubHeader;
    private HealthTextView mResultSuggest;
    protected LinearLayout mSegmental;
    private HealthCardView mSegmentalCardView;
    protected HealthSubHeader mSegmentalSubHeader;
    protected dnb mWeightBean;
    private vns mWeightTrendChartViewHolder;
    protected int mStartType = 0;
    protected long mStartTime = 0;
    protected boolean mIsShowChange = false;
    protected boolean mIsOversea = false;
    private boolean mHasScrollBi = false;
    private boolean mHadScrollBottomBi = false;
    private final Handler mWeightBodyDataHandler = new a(this);

    protected int getBiType() {
        return 0;
    }

    protected void initAnalysisAndInterpretation() {
    }

    protected void initData() {
    }

    protected void initSpecification() {
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = BaseApplication.getContext();
        this.mContext = context;
        this.mResources = context.getResources();
        FragmentActivity activity = getActivity();
        if (activity instanceof WeightBodyDataActivity) {
            this.mActivity = (WeightBodyDataActivity) activity;
        } else {
            LogUtil.j(TAG, "onCreate fragmentActivity instanceof WeightBodyDataActivity is false");
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.j(TAG, "onCreate Bundle is null");
            return;
        }
        Serializable serializable = arguments.getSerializable("WeightBean");
        if (serializable instanceof dnb) {
            this.mWeightBean = (dnb) serializable;
        } else {
            LogUtil.j(TAG, "onCreate Serializable not WeightBean");
        }
        Serializable serializable2 = arguments.getSerializable(AI_BODY_SHAPE_BEAN);
        if (serializable2 instanceof uww) {
            this.mAiBodyShapeBean = (uww) serializable2;
        } else {
            LogUtil.j(TAG, "onCreate Serializable not AiBodyShapeBean");
        }
        this.mStartType = arguments.getInt("start_type", this.mStartType);
        this.mStartTime = arguments.getLong("start_time", this.mStartTime);
        this.mIsShowChange = arguments.getBoolean("is_show_change", this.mIsShowChange);
        this.mIsOversea = arguments.getBoolean("is_oversea", this.mIsOversea);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null || (this.mWeightBean == null && this.mAiBodyShapeBean == null)) {
            LogUtil.j(TAG, "onCreateView LayoutInflater or WeightBean AibodyShapeBean is null");
            return null;
        }
        View viewInflate = layoutInflater.inflate(getLayoutId(), viewGroup, false);
        initView(viewInflate);
        initLineChartView(viewInflate);
        initData();
        initSpecification();
        initAnalysisAndInterpretation();
        initScrollBiListener(viewInflate);
        initAIBodyDataImage();
        return viewInflate;
    }

    private void initLineChartView(View view) {
        Boolean boolIsShowHistoricalData = isShowHistoricalData();
        boolean zBooleanValue = boolIsShowHistoricalData.booleanValue();
        boolean z = getArguments().getBoolean("isGuestMeasure");
        LogUtil.a(TAG, "initLineChartView() mIsGuestMeasure = ", Boolean.valueOf(z), ", showHistoricalData = ", boolIsShowHistoricalData);
        if (!zBooleanValue || z) {
            return;
        }
        vns vnsVar = new vns(view, this.mWeightBean);
        this.mWeightTrendChartViewHolder = vnsVar;
        vnsVar.b(getBodyDataKey());
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.historical_data_subHeader);
        healthSubHeader.setSubHeaderBackgroundColor(getColor(R.color.transparent));
        this.mWeightTrendChartViewHolder.d(healthSubHeader);
        getChartData();
    }

    protected void getChartData() {
        HiHealthManager.d(getContext()).aggregateHiHealthData(getHiAggregateOption(), new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideTrendView() {
        Message messageObtainMessage = this.mWeightBodyDataHandler.obtainMessage();
        messageObtainMessage.what = 18;
        this.mWeightBodyDataHandler.sendMessage(messageObtainMessage);
    }

    public void updateTrendData(List<Pair<Long, Float>> list) {
        if (njy.e(list) || list.size() == 1) {
            LogUtil.j(TAG, "readCardData onResult no data");
            hideTrendView();
        } else {
            Message messageObtainMessage = this.mWeightBodyDataHandler.obtainMessage();
            messageObtainMessage.what = 10;
            messageObtainMessage.obj = list;
            this.mWeightBodyDataHandler.sendMessage(messageObtainMessage);
        }
    }

    protected HiAggregateOption getHiAggregateOption() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(getTrendStartTime(), getTrendEndTime());
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(3);
        hiAggregateOption.setSortOrder(0);
        hiAggregateOption.setFilter(vei.a(MultiUsersManager.INSTANCE.getCurrentUser()));
        hiAggregateOption.setConstantsKey(new String[]{"test"});
        LogUtil.a(TAG, "getChartData() aggregateOption = ", hiAggregateOption.toString());
        return hiAggregateOption;
    }

    protected int getLayoutId() {
        return R.layout.fragment_weight_body_data;
    }

    public void initView(View view) {
        this.mDataCardView = (HealthCardView) view.findViewById(R.id.fragment_weight_data_card_view);
        this.mDataSubTitle = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_sub_title);
        this.mDataValue = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_value);
        this.mDataUnit = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_unit);
        this.mIndicatorCardView = (HealthCardView) view.findViewById(R.id.fragment_weight_specification_card_view);
        this.mIndicator = (HealthLevelIndicator) view.findViewById(R.id.fragment_weight_body_data_specification_indicator);
        this.mIndicatorLevelLayout = (ViewStub) view.findViewById(R.id.view_stub_weight_body_level_rang);
        this.mSegmentalSubHeader = (HealthSubHeader) view.findViewById(R.id.fragment_weight_body_data_segmental_sub_header);
        this.mSegmentalCardView = (HealthCardView) view.findViewById(R.id.fragment_weight_body_data_segmental_card_view);
        this.mSegmental = (LinearLayout) view.findViewById(R.id.fragment_weight_body_data_segmental);
        this.mIdealSubHeader = (HealthSubHeader) view.findViewById(R.id.fragment_weight_body_data_ideal_header);
        this.mIdealCardView = (HealthCardView) view.findViewById(R.id.fragment_weight_body_data_ideal_card_view);
        this.mIdeal = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_ideal);
        this.mIdealDescription = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_ideal_description);
        this.mBalancedSubHeader = (HealthSubHeader) view.findViewById(R.id.fragment_weight_body_data_balanced_header);
        this.mBalancedCardView = (HealthCardView) view.findViewById(R.id.fragment_weight_body_data_balanced_card_view);
        this.mBalanced = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_balanced);
        this.mBalancedDescription = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_balanced_description);
        this.mBalancedSuggest = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_balanced_suggest);
        initResultViewAndAboutView(view);
        this.mAboutImage = (ImageView) view.findViewById(R.id.fragment_weight_body_data_about_image);
        this.mAIBodyDataImageView = (HealthImageView) view.findViewById(R.id.ai_body_shape_image);
        this.mAIBodyDataImageViewLayout = view.findViewById(R.id.ai_body_shape_image_layout);
    }

    private void initScrollBiListener(View view) {
        HealthScrollView healthScrollView = (HealthScrollView) view.findViewById(R.id.fragment_weight_scrollView);
        healthScrollView.setIsForceScrollListener(true);
        healthScrollView.setScrollViewListener(new ScrollViewListener() { // from class: uva
            @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
            public final void onScrollChanged(HealthScrollView healthScrollView2, int i, int i2, int i3, int i4) {
                this.f50600a.m1731xab120c4c(healthScrollView2, i, i2, i3, i4);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initScrollBiListener$0$com-huawei-ui-main-stories-health-fragment-WeightBodyDataFragment, reason: not valid java name */
    public /* synthetic */ void m1731xab120c4c(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
        if (!this.mHasScrollBi) {
            this.mHasScrollBi = true;
            biScrollViewEvent(1);
        }
        if (this.mHadScrollBottomBi || i2 != healthScrollView.getChildAt(0).getMeasuredHeight() - healthScrollView.getMeasuredHeight()) {
            return;
        }
        this.mHadScrollBottomBi = true;
        biScrollViewEvent(2);
    }

    private void biScrollViewEvent(int i) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("event", Integer.valueOf(i));
        map.put("type", Integer.valueOf(getBiType()));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.WEIGHT_PAGE_DATA_DETAIL_BOTOOM_2160115.value(), map, 0);
    }

    public void updateTitleTextStyle(String str, SpannableString spannableString, int i) {
        int length = spannableString.length();
        int length2 = str.length();
        if (length2 > length) {
            LogUtil.j(TAG, "initData bodyAgeLength is error");
            length2 = length;
        }
        spannableString.setSpan(new AbsoluteSizeSpan(13, true), 0, length, 17);
        int iIndexOf = spannableString.toString().indexOf(str);
        if (LanguageUtil.aj(this.mContext)) {
            iIndexOf = length - length2;
        } else {
            length = iIndexOf + length2;
        }
        if (iIndexOf != -1) {
            spannableString.setSpan(new AbsoluteSizeSpan(40, true), iIndexOf, length, 17);
        }
        spannableString.setSpan(new qli(qrr.c()), 0, spannableString.length(), 17);
        setDataInfo(getString(i), spannableString);
    }

    protected Boolean isShowHistoricalData() {
        return false;
    }

    protected Boolean isSetUnit() {
        return false;
    }

    protected String getBodyDataKey() {
        return "bodyWeight";
    }

    private void initAIBodyDataImage() {
        String aIBodyShapeImageKey = getAIBodyShapeImageKey();
        if (TextUtils.isEmpty(aIBodyShapeImageKey)) {
            LogUtil.a(TAG, "imagekey is empty, return");
        } else {
            wtx.b(aIBodyShapeImageKey, new AnonymousClass4());
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment$4, reason: invalid class name */
    public class AnonymousClass4 implements DownloadCallback<File> {
        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onProgress(long j, long j2, boolean z, String str) {
        }

        AnonymousClass4() {
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onFinish(final File file) {
            HandlerExecutor.b(new Runnable() { // from class: uvc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50602c.d(file);
                }
            });
        }

        public /* synthetic */ void d(File file) {
            WeightBodyDataFragment.this.mAIBodyDataImageViewLayout.setVisibility(0);
            qqf.d(file, WeightBodyDataFragment.this.mAIBodyDataImageView);
            WeightBodyDataFragment.this.mWeightTrendChartViewHolder.d(0);
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onFail(int i, Throwable th) {
            LogUtil.e(WeightBodyDataFragment.TAG, "loadImage fail ", th);
        }
    }

    protected long getTrendEndTime() {
        dnb dnbVar = this.mWeightBean;
        if (dnbVar == null) {
            LogUtil.e(TAG, "weight bean is null, return");
            return 0L;
        }
        return dnbVar.aw();
    }

    protected long getTrendStartTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(getTrendEndTime());
        calendar.add(1, -1);
        return calendar.getTime().getTime();
    }

    protected void initResultViewAndAboutView(View view) {
        this.mResultSubHeader = (HealthSubHeader) view.findViewById(R.id.fragment_weight_body_data_result);
        this.mResultCardView = (HealthCardView) view.findViewById(R.id.fragment_weight_body_data_result_card_view);
        this.mResultDescription = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_result_description);
        this.mResultSuggest = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_result_suggest);
        this.mAboutSubHeader = (HealthSubHeader) view.findViewById(R.id.fragment_weight_body_data_about);
        this.mAboutCardView = (HealthCardView) view.findViewById(R.id.fragment_weight_body_data_about_card_view);
        this.mAboutDescription = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_about_description);
    }

    protected void setDataInfo(String str, String str2, String str3) {
        HealthTextView healthTextView;
        HealthTextView healthTextView2;
        HealthTextView healthTextView3;
        HealthCardView healthCardView = this.mDataCardView;
        if (healthCardView == null) {
            LogUtil.j(TAG, "setDataInfo, mDataCardView is null.");
            return;
        }
        healthCardView.setVisibility(0);
        if (!TextUtils.isEmpty(str) && (healthTextView3 = this.mDataSubTitle) != null) {
            healthTextView3.setText(str);
        }
        if (!TextUtils.isEmpty(str2) && (healthTextView2 = this.mDataValue) != null) {
            healthTextView2.setText(str2);
        }
        if (TextUtils.isEmpty(str3) || (healthTextView = this.mDataUnit) == null) {
            return;
        }
        healthTextView.setText(str3);
    }

    protected void setDataInfo(String str, SpannableString spannableString) {
        HealthTextView healthTextView;
        HealthTextView healthTextView2;
        HealthCardView healthCardView = this.mDataCardView;
        if (healthCardView == null) {
            LogUtil.j(TAG, "setDataInfo, mDataCardView is null.");
            return;
        }
        healthCardView.setVisibility(0);
        if (!TextUtils.isEmpty(str) && (healthTextView2 = this.mDataSubTitle) != null) {
            healthTextView2.setText(str);
        }
        if (spannableString == null || (healthTextView = this.mDataValue) == null) {
            return;
        }
        healthTextView.setText(spannableString);
    }

    protected void setIndicatorCardViewVisible() {
        HealthCardView healthCardView = this.mIndicatorCardView;
        if (healthCardView == null) {
            LogUtil.j(TAG, "setIndicatorCardViewVisible, mIndicatorCardView is null.");
        } else {
            healthCardView.setVisibility(0);
        }
    }

    protected void setAllLevelsData(List<qlj> list, double[] dArr, double[] dArr2) {
        vei.e(this.mIndicator, list, dArr, dArr2);
    }

    protected void setLevelSpannableString(double d2, String str) {
        if (this.mIndicator == null) {
            LogUtil.j(TAG, "setLevel, mIndicator is null.");
        } else {
            this.mIndicator.setLevel((float) d2, UnitUtil.b(this.mContext, "[\\.\\d]", str, R.style.health_weight_body_data_value, R.style.health_weight_body_data_unit));
        }
    }

    protected void setLevelUnitString(double d2, String str, String str2) {
        HealthLevelIndicator healthLevelIndicator = this.mIndicator;
        if (healthLevelIndicator == null) {
            LogUtil.j(TAG, "setLevel, mIndicator is null.");
        } else {
            healthLevelIndicator.setLevel((float) d2, str);
            this.mIndicator.setLevelUnit(str2);
        }
    }

    protected void setLevel(double d2, String str) {
        HealthLevelIndicator healthLevelIndicator = this.mIndicator;
        if (healthLevelIndicator == null) {
            LogUtil.j(TAG, "setLevel, mIndicator is null.");
        } else {
            healthLevelIndicator.setLevel((float) d2, str);
        }
    }

    protected void setLevelInfo(List<c> list) {
        ViewStub viewStub;
        if (njy.e(list) || (viewStub = this.mIndicatorLevelLayout) == null) {
            LogUtil.j(TAG, "setLevelInfo, levelInfoBeans is empty or mIndicatorLevelLayout is null.");
            return;
        }
        View viewInflate = viewStub.inflate();
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar != null) {
                if (i == 0) {
                    initLevelItem(viewInflate.findViewById(R.id.weight_body_level_rang_low), cVar);
                } else if (i == 1) {
                    initLevelItem(viewInflate.findViewById(R.id.weight_body_level_rang_stand), cVar);
                } else if (i == 2) {
                    initLevelItem(viewInflate.findViewById(R.id.weight_body_level_rang_high), cVar);
                } else if (i == 3) {
                    initLevelItem(viewInflate.findViewById(R.id.weight_body_level_rang_super_high), cVar);
                }
            }
        }
    }

    private void initLevelItem(View view, c cVar) {
        view.setVisibility(0);
        ImageView imageView = (ImageView) view.findViewById(R.id.weight_body_level_rang_item_icon);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(cVar.d());
        imageView.setImageDrawable(gradientDrawable);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.weight_body_level_rang_item_name);
        healthTextView.setSplittable(true);
        healthTextView.setText(cVar.b());
        if (LanguageUtil.y(this.mContext) || LanguageUtil.ao(this.mContext) || LanguageUtil.bi(this.mContext)) {
            healthTextView.setTextSize(1, 10.0f);
        }
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.weight_body_level_rang_item_content);
        if (TextUtils.isEmpty(cVar.c())) {
            healthTextView2.setVisibility(8);
        } else {
            healthTextView2.setText(cVar.c());
        }
    }

    protected int getColor(int i) {
        return ContextCompat.getColor(this.mContext, i);
    }

    protected String getComRangContent(float f, float f2) {
        return this.mContext.getString(R.string.IDS_hw_pressure_grade_range, UnitUtil.e(f, 1, 1), UnitUtil.e(f2, 1, 1));
    }

    protected String getMinRangContent(float f) {
        if (LanguageUtil.c(this.mContext)) {
            return this.mContext.getString(R.string.IDS_less_than, UnitUtil.e(f, 1, 1));
        }
        return this.mContext.getString(R.string.IDS_bp_min_scope_value, UnitUtil.e(f, 1, 1));
    }

    protected String getMaxRangContent(float f) {
        return this.mContext.getString(R.string.IDS_bp_max_explain, UnitUtil.e(f, 1, 1));
    }

    protected float getCalculateRangValue(float f, float f2, boolean z) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(f);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(f2);
        if (z) {
            return bigDecimalValueOf.add(bigDecimalValueOf2).floatValue();
        }
        return bigDecimalValueOf.subtract(bigDecimalValueOf2).floatValue();
    }

    private void setSubHeaderTopMargin(HealthSubHeader healthSubHeader, int i) {
        ViewGroup.LayoutParams layoutParams = healthSubHeader.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = i;
            healthSubHeader.setLayoutParams(layoutParams2);
        }
    }

    protected void setSegmentalCardViewState(int i) {
        HealthSubHeader healthSubHeader = this.mSegmentalSubHeader;
        if (healthSubHeader != null) {
            setSubHeaderTopMargin(healthSubHeader, (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_min_8dp));
            this.mSegmentalSubHeader.setVisibility(i);
            this.mSegmentalSubHeader.setSubHeaderBackgroundColor(0);
        }
        HealthCardView healthCardView = this.mSegmentalCardView;
        if (healthCardView == null) {
            LogUtil.j(TAG, "setSegmentalCardViewState, mSegmentalCardView is null.");
        } else {
            healthCardView.setVisibility(i);
        }
    }

    protected void initIdeal(String str, String str2, String str3) {
        if (!vdo.a()) {
            LogUtil.j(TAG, "initIdeal, is not support.");
        } else {
            initIdealForGlobal(str, str2, str3);
        }
    }

    protected void initIdealForGlobal(String str, String str2, String str3) {
        HealthSubHeader healthSubHeader;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        boolean zIsEmpty2 = TextUtils.isEmpty(str3);
        HealthTextView healthTextView = this.mIdeal;
        if (healthTextView != null && !zIsEmpty) {
            healthTextView.setText(str2);
            this.mIdeal.setVisibility(0);
        }
        HealthTextView healthTextView2 = this.mIdealDescription;
        if (healthTextView2 != null && !zIsEmpty2) {
            healthTextView2.setText(str3);
            this.mIdealDescription.setVisibility(0);
        }
        if (zIsEmpty && zIsEmpty2) {
            LogUtil.j(TAG, "initIdealForGlobal, isNameEmpty or isDescriptionEmpty.");
            return;
        }
        if (this.mIdealSubHeader != null && !TextUtils.isEmpty(str)) {
            this.mIdealSubHeader.setHeadTitleText(str);
            this.mIdealSubHeader.setSubHeaderBackgroundColor(getColor(R.color.transparent));
            if (this.mResultSubHeader != null && (healthSubHeader = this.mSegmentalSubHeader) != null && healthSubHeader.getVisibility() == 8 && this.mResultSubHeader.getVisibility() == 8) {
                setSubHeaderTopMargin(this.mIdealSubHeader, (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_min_8dp));
            }
            this.mIdealSubHeader.setVisibility(0);
        }
        HealthCardView healthCardView = this.mIdealCardView;
        if (healthCardView != null) {
            healthCardView.setVisibility(0);
        }
    }

    protected void initResult(String str, String str2) {
        if (!vdo.a()) {
            LogUtil.j(TAG, "initResult, is not support.");
        } else {
            initResultForGlobal(str, str2);
        }
    }

    protected void initResultForGlobal(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        HealthTextView healthTextView = this.mResultDescription;
        if (healthTextView != null && !zIsEmpty) {
            healthTextView.setText(str);
            this.mResultDescription.setVisibility(0);
        }
        HealthTextView healthTextView2 = this.mResultSuggest;
        if (healthTextView2 != null && !zIsEmpty2) {
            healthTextView2.setText(str2);
            this.mResultSuggest.setVisibility(0);
        }
        if (zIsEmpty && zIsEmpty2) {
            LogUtil.j(TAG, "initResultForGlobal, isDescriptionEmpty or isSuggestionEmpty.");
            return;
        }
        HealthSubHeader healthSubHeader = this.mResultSubHeader;
        if (healthSubHeader != null) {
            healthSubHeader.setSubHeaderBackgroundColor(getColor(R.color.transparent));
            HealthSubHeader healthSubHeader2 = this.mSegmentalSubHeader;
            if (healthSubHeader2 != null && healthSubHeader2.getVisibility() == 8) {
                setSubHeaderTopMargin(this.mResultSubHeader, (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_min_8dp));
            }
            this.mResultSubHeader.setVisibility(0);
        }
        HealthCardView healthCardView = this.mResultCardView;
        if (healthCardView != null) {
            healthCardView.setVisibility(0);
        }
    }

    protected void setBalanceResultViewState(int i) {
        HealthSubHeader healthSubHeader = this.mBalancedSubHeader;
        if (healthSubHeader != null) {
            healthSubHeader.setVisibility(i);
        }
        HealthCardView healthCardView = this.mBalancedCardView;
        if (healthCardView != null) {
            healthCardView.setVisibility(i);
        }
        HealthTextView healthTextView = this.mBalanced;
        if (healthTextView != null) {
            healthTextView.setVisibility(i);
        }
        HealthTextView healthTextView2 = this.mBalancedDescription;
        if (healthTextView2 != null) {
            healthTextView2.setVisibility(i);
        }
        HealthTextView healthTextView3 = this.mBalancedSuggest;
        if (healthTextView3 != null) {
            healthTextView3.setVisibility(i);
        }
    }

    protected void setBalanceInfo(boolean z, String str, String str2, String str3, String str4) {
        if (z || !vdo.a()) {
            setBalanceResultViewState(8);
            return;
        }
        setBalanceResultViewState(0);
        if (this.mBalanced != null && !TextUtils.isEmpty(str2)) {
            this.mBalanced.setText(str2);
        }
        if (this.mBalancedDescription != null && !TextUtils.isEmpty(str3)) {
            this.mBalancedDescription.setText(str3);
        }
        if (this.mBalancedSuggest != null && !TextUtils.isEmpty(str4)) {
            this.mBalancedSuggest.setText(str4);
        }
        if (this.mBalancedSubHeader == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.mBalancedSubHeader.setHeadTitleText(str);
        this.mBalancedSubHeader.setSubHeaderBackgroundColor(getColor(R.color.transparent));
    }

    protected String getAIBodyShapeImageKey() {
        return "";
    }

    protected void initAbout(String str, String str2) {
        if (this.mAboutSubHeader != null && !TextUtils.isEmpty(str)) {
            HealthSubHeader healthSubHeader = this.mAboutSubHeader;
            String string = this.mResources.getString(R.string.IDS_weight_about);
            if (!LanguageUtil.o(this.mContext)) {
                str = str.toLowerCase(Locale.ENGLISH);
            }
            healthSubHeader.setHeadTitleText(String.format(string, str));
            this.mAboutSubHeader.setSubHeaderBackgroundColor(getColor(R.color.transparent));
            this.mAboutSubHeader.setVisibility(0);
        }
        if (this.mAboutDescription == null || TextUtils.isEmpty(str2)) {
            LogUtil.j(TAG, "initAbout, mAboutDescription is null or description is empty.");
            return;
        }
        this.mAboutDescription.setText(str2);
        this.mAboutDescription.setVisibility(0);
        HealthCardView healthCardView = this.mAboutCardView;
        if (healthCardView != null) {
            healthCardView.setVisibility(0);
        }
    }

    protected void initAboutImage(int i) {
        ImageView imageView = this.mAboutImage;
        if (imageView == null) {
            LogUtil.j(TAG, "initAboutImage, mAboutImage is null.");
        } else {
            imageView.setImageResource(i);
            this.mAboutImage.setVisibility(0);
        }
    }

    protected List<Pair<Long, Float>> buildTrendData(List<HiHealthData> list) {
        double dC;
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            LogUtil.j(TAG, "dataList is empty", getBodyDataKey());
            return arrayList;
        }
        for (HiHealthData hiHealthData : list) {
            if (isSetUnit().booleanValue()) {
                dC = UnitUtil.c(hiHealthData.getDouble(getBodyDataKey()));
            } else {
                dC = hiHealthData.getDouble(getBodyDataKey());
            }
            float f = (float) dC;
            if (f > 0.0f) {
                arrayList.add(new Pair(Long.valueOf(hiHealthData.getStartTime()), Float.valueOf(f)));
            }
        }
        int size = list.size();
        int size2 = arrayList.size();
        LogUtil.a(TAG, "dataList size is: ", Integer.valueOf(size), " trendDataList size is: ", Integer.valueOf(size2), " getBodyDataKey is: ", getBodyDataKey());
        return arrayList;
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27920b;
        private final String d;
        private final int e;

        public c(String str, String str2, int i) {
            this.f27920b = str;
            this.d = str2;
            this.e = i;
        }

        public String b() {
            return this.f27920b;
        }

        public String c() {
            return this.d;
        }

        public int d() {
            return this.e;
        }
    }

    static class d implements HiAggregateListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<WeightBodyDataFragment> f27921c;

        d(WeightBodyDataFragment weightBodyDataFragment) {
            this.f27921c = new WeakReference<>(weightBodyDataFragment);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            WeightBodyDataFragment weightBodyDataFragment = this.f27921c.get();
            if (weightBodyDataFragment == null || weightBodyDataFragment.isDetached()) {
                LogUtil.j(WeightBodyDataFragment.TAG, "ChartDataListener onResult fragment ", weightBodyDataFragment);
            } else {
                weightBodyDataFragment.updateTrendData(weightBodyDataFragment.buildTrendData(list));
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            WeightBodyDataFragment weightBodyDataFragment = this.f27921c.get();
            if (weightBodyDataFragment != null && !weightBodyDataFragment.isDetached()) {
                weightBodyDataFragment.hideTrendView();
            } else {
                LogUtil.j(WeightBodyDataFragment.TAG, "ChartDataListener onResultIntent fragment ", weightBodyDataFragment);
            }
        }
    }

    public class a extends BaseHandler<WeightBodyDataFragment> {
        a(WeightBodyDataFragment weightBodyDataFragment) {
            super(weightBodyDataFragment);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WeightBodyDataFragment weightBodyDataFragment, Message message) {
            ArrayList arrayList;
            if (weightBodyDataFragment == null) {
                LogUtil.j(WeightBodyDataFragment.TAG, "handleMessageWhenReferenceNotNull obj is null");
                return;
            }
            int i = message.what;
            if (i != 10) {
                if (i == 18) {
                    if (WeightBodyDataFragment.this.mWeightTrendChartViewHolder != null) {
                        WeightBodyDataFragment.this.mWeightTrendChartViewHolder.b(new ArrayList());
                        return;
                    }
                    return;
                }
                LogUtil.j(WeightBodyDataFragment.TAG, "other msg");
                return;
            }
            if (!njy.b(message.obj, Pair.class)) {
                LogUtil.j(WeightBodyDataFragment.TAG, "msg.obj is not instanceof List Pair");
                arrayList = new ArrayList();
            } else {
                arrayList = (ArrayList) message.obj;
            }
            if (WeightBodyDataFragment.this.mWeightTrendChartViewHolder != null) {
                WeightBodyDataFragment.this.mWeightTrendChartViewHolder.b(arrayList);
            }
        }
    }
}
