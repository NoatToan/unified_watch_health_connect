package com.huawei.health.marketing.views;

import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.TimePeriod;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.MultiGridsSleepPageTemplate;
import com.huawei.health.marketing.request.ActivityInfoListFactory;
import com.huawei.health.marketing.request.RespSleepAudioInfo;
import com.huawei.health.marketing.request.SleepAudioInfo;
import com.huawei.health.marketing.request.SleepAudioInfoApi;
import com.huawei.health.marketing.request.SleepAudioInfoReq;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.viewpager.carouselsviewpager.CarouselsPagerAdapter;
import com.huawei.ui.commonui.viewpager.carouselsviewpager.CarouselsTransformer;
import com.huawei.ui.commonui.viewpager.carouselsviewpager.CarouselsViewPager;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.fya;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import defpackage.pao;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class CarouselsLayout extends BaseLifeCycleLinearLayout implements ResourceBriefInfoOwnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<SingleGridContent> f8207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f8208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CarouselsPagerAdapter f8209c;
    private List<String> d;
    private HealthCardView e;
    private boolean f;
    private int g;
    private Context h;
    private ImageView i;
    private String j;
    private HealthTextView k;
    private HealthTextView l;
    private int m;
    private HealthTextView n;
    private ImageView o;
    private LinearLayout p;
    private String q;
    private ResourceBriefInfo r;
    private String s;
    private List<SingleGridContent> t;
    private MultiGridsSleepPageTemplate u;
    private CarouselsViewPager v;
    private HealthSubHeader w;
    private View x;
    private long y;

    public CarouselsLayout(Context context) {
        this(context, null);
    }

    public CarouselsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarouselsLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CarouselsLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f8207a = new ArrayList();
        this.t = new ArrayList();
        this.d = new ArrayList(3);
        this.f8208b = new ArrayList(3);
        this.h = context;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        boolean z = (resourceBriefInfo == null || this.r == null || !resourceBriefInfo.getResourceId().equals(this.r.getResourceId())) ? false : true;
        LogUtil.a("CarouselsLayout", "isOwnedByBriefInfo: " + z);
        return z;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        ResourceBriefInfo resourceBriefInfo = this.r;
        if (resourceBriefInfo != null) {
            return resourceBriefInfo.getPriority();
        }
        return 0;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.m;
    }

    public void e(int i, ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate) {
        LogUtil.a("CarouselsLayout", "initData");
        if (resourceBriefInfo != null) {
            LogUtil.a("CarouselsLayout", "resourceBriefInfo: " + resourceBriefInfo.toString());
        }
        this.m = i;
        this.r = resourceBriefInfo;
        if (resourceBriefInfo != null) {
            this.s = resourceBriefInfo.getResourceId();
            this.q = this.r.getResourceName();
            this.j = this.r.getCategory();
        }
        this.y = System.currentTimeMillis();
        if (baseTemplate instanceof MultiGridsSleepPageTemplate) {
            MultiGridsSleepPageTemplate multiGridsSleepPageTemplate = (MultiGridsSleepPageTemplate) baseTemplate;
            this.u = multiGridsSleepPageTemplate;
            this.f8207a = multiGridsSleepPageTemplate.getGridContents();
        }
        if (njy.e(this.f8207a)) {
            LogUtil.j("CarouselsLayout", "List isEmpty");
        } else {
            d();
        }
    }

    public void d() {
        LogUtil.a("CarouselsLayout", "initView");
        a();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");
        try {
            this.f = Integer.parseInt(simpleDateFormat.format(date)) >= 6 && Integer.parseInt(simpleDateFormat.format(date)) < 18;
        } catch (NumberFormatException e) {
            LogUtil.e("CarouselsLayout", "NumberFormatException", e.getMessage());
        }
        e();
        c();
        e(this.t);
        ArrayList<String> arrayList = new ArrayList<>();
        for (SingleGridContent singleGridContent : this.t) {
            arrayList.add(singleGridContent.getPicture());
            this.d.add(singleGridContent.getTheme());
        }
        b(arrayList);
        this.v.setPageTransformer(false, new CarouselsTransformer(this.v));
        this.v.setOffscreenPageLimit(3);
        this.v.setQuantityOfShowPages(3);
        this.v.setAdapter(this.f8209c);
        this.v.b();
        LogUtil.a("CarouselsLayout", "mDayAudioThemeList size: " + this.d.size() + " ,mAudioHeatCount size: " + this.f8208b.size());
        setPageResource(0);
        this.v.setPageScrolledListener(new b());
        this.i.setImageDrawable(ContextCompat.getDrawable(this.h, R.mipmap.sleep_recommended_music));
        this.i.setOnClickListener(e(this.t, true));
        this.e.setOnClickListener(e(this.t, false));
        if (((Integer) BaseActivity.getSafeRegionWidth().first).intValue() > 0 || ((Integer) BaseActivity.getSafeRegionWidth().second).intValue() > 0) {
            LogUtil.a("CarouselsLayout", "isCurvedScreen");
            ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(((Integer) BaseActivity.getSafeRegionWidth().first).intValue());
                marginLayoutParams.setMarginEnd(((Integer) BaseActivity.getSafeRegionWidth().second).intValue());
            }
        }
    }

    private void b(final ArrayList<String> arrayList) {
        this.f8209c = new CarouselsPagerAdapter(this.h, arrayList, new CarouselsPagerAdapter.IViewGenerator() { // from class: com.huawei.health.marketing.views.CarouselsLayout.5
            @Override // com.huawei.ui.commonui.viewpager.carouselsviewpager.CarouselsPagerAdapter.IViewGenerator
            public View inflate(Context context, final String str) {
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.imageview_layout, (ViewGroup) null, false);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.imgaview);
                imageView.setRotation(180.0f);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.marketing.views.CarouselsLayout.5.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        CarouselsLayout.this.b(CarouselsLayout.this.t, true, arrayList.indexOf(str));
                    }
                });
                qqf.b(imageView, str, qqf.e, 1, 0);
                return viewInflate;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageResource(int i) {
        String quantityString;
        String str = "pageId: " + i;
        StringBuilder sb = new StringBuilder(", mAudioHeatCount size: ");
        List<Integer> list = this.f8208b;
        sb.append(list == null ? null : Integer.valueOf(list.size()));
        LogUtil.a("CarouselsLayout", str, sb.toString());
        List<String> list2 = this.d;
        if (list2 != null && list2.size() > i) {
            qsp.b(this.l, this.d.get(i));
        }
        List<Integer> list3 = this.f8208b;
        if (list3 != null && list3.size() > i) {
            int iIntValue = this.f8208b.get(i).intValue();
            if (LanguageUtil.f(this.h)) {
                quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_sleep_music_unit_ten_thousand, iIntValue, UnitUtil.e(((double) iIntValue) / 10000.0d, 1, 1));
            } else {
                quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_sleep_music_unit_ten_thousand, iIntValue, UnitUtil.e(((double) iIntValue) / 1000.0d, 1, 1));
            }
            qsp.b(this.k, quantityString);
        }
        List<SingleGridContent> list4 = this.t;
        if (list4 == null || list4.size() <= i) {
            return;
        }
        this.e.setCardBackgroundColor(Color.parseColor(this.t.get(i).getBackgroundColor()));
    }

    private View.OnClickListener e(final List<SingleGridContent> list, final boolean z) {
        LogUtil.a("CarouselsLayout", "getViewClickListener");
        return new View.OnClickListener() { // from class: com.huawei.health.marketing.views.CarouselsLayout.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CarouselsLayout carouselsLayout = CarouselsLayout.this;
                carouselsLayout.b(list, z, carouselsLayout.g);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<SingleGridContent> list, boolean z, int i) {
        CarouselsViewPager carouselsViewPager = this.v;
        if (carouselsViewPager == null) {
            LogUtil.a("CarouselsLayout", "mViewPager is null");
            return;
        }
        carouselsViewPager.c();
        if (list == null || this.v.getCurrentRealItem() < 0 || this.v.getCurrentRealItem() >= list.size()) {
            return;
        }
        final SingleGridContent singleGridContent = list.get(this.v.getCurrentRealItem());
        if (i != -1) {
            singleGridContent = list.get(i % list.size());
        }
        final String linkValue = singleGridContent.getLinkValue();
        if (TextUtils.isEmpty(linkValue) || qrs.r()) {
            return;
        }
        boolean zB = fxk.b(linkValue);
        if (z) {
            linkValue = linkValue + "&playing=true";
        }
        if (!zB) {
            a(2, singleGridContent.getTheme(), singleGridContent.getDynamicDataId());
            d(linkValue, singleGridContent.getDynamicDataId());
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: fye
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.e.a(singleGridContent, linkValue, i2, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    public /* synthetic */ void a(SingleGridContent singleGridContent, String str, int i, Object obj) {
        if (i == 0) {
            a(2, singleGridContent.getTheme(), singleGridContent.getDynamicDataId());
            d(str, singleGridContent.getDynamicDataId());
        } else {
            LogUtil.j("CarouselsLayout", "getViewClickListener errorCode = ", Integer.valueOf(i));
        }
    }

    private void d(String str, String str2) {
        LogUtil.a("CarouselsLayout", "goToDetail");
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(d(fxl.d(str, this.j), this.m, str2));
        }
    }

    private String d(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.contains("?") ? "&pullfrom=" : "?pullfrom=");
        return sb.toString() + i + "&resourceName=" + this.q + "&resourceId=" + this.s + "&pullOrder=" + (this.v.getCurrentRealItem() + 1) + "&itemId=" + str2;
    }

    private void a(int i, String str, String str2) {
        HashMap map = new HashMap(4);
        map.put("resourcePositionId", Integer.valueOf(this.m));
        map.put("resourceId", this.s);
        map.put("resourceName", this.q);
        map.put("event", Integer.valueOf(i));
        map.put("itemCardName", str);
        MultiGridsSleepPageTemplate multiGridsSleepPageTemplate = this.u;
        if (multiGridsSleepPageTemplate != null) {
            map.put("moreEntryName", multiGridsSleepPageTemplate.getMoreMenuTitle());
        }
        if (i == 2) {
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.y));
            this.y = System.currentTimeMillis();
        }
        map.put("pullOrder", Integer.valueOf(this.v.getCurrentRealItem() + 1));
        if (this.r != null) {
            map.put("algId", "");
            map.put("smartRecommend", Boolean.valueOf(this.r.getSmartRecommend()));
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("itemId", str2);
        }
        lmf.d().c(this.h, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<SingleGridContent> list) {
        LogUtil.a("CarouselsLayout", "requestSleepAudioData");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new c(this, list));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (SingleGridContent singleGridContent : list) {
            if (!TextUtils.isEmpty(singleGridContent.getDynamicDataId())) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    String[] strArrSplit = sb.toString().substring(1).split(",");
                    int length = strArrSplit.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (TextUtils.equals(strArrSplit[i], singleGridContent.getDynamicDataId())) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            sb.append(",");
                            sb.append(singleGridContent.getDynamicDataId());
                            break;
                        }
                    }
                } else if (!TextUtils.isEmpty(singleGridContent.getDynamicDataId())) {
                    sb.append(",");
                    sb.append(singleGridContent.getDynamicDataId());
                }
            }
        }
        if (TextUtils.isEmpty(sb.toString())) {
            LogUtil.j("CarouselsLayout", "requestSleepAudioData idStrings is empty.");
            return;
        }
        String strSubstring = sb.substring(1);
        SleepAudioInfoReq sleepAudioInfoReq = new SleepAudioInfoReq();
        e(sleepAudioInfoReq, strSubstring);
        SleepAudioInfoApi sleepAudioInfoApi = (SleepAudioInfoApi) oet.d().e(SleepAudioInfoApi.class);
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.getContext());
        Map<String, Object> body = activityInfoListFactory.getBody(sleepAudioInfoReq);
        body.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        String strC = ofe.c(body);
        LogUtil.a("CarouselsLayout", "requestSleepAudioData, body: " + strC);
        d(sleepAudioInfoApi, sleepAudioInfoReq, activityInfoListFactory, list, strC);
    }

    private void e() {
        MultiGridsSleepPageTemplate multiGridsSleepPageTemplate = this.u;
        if (multiGridsSleepPageTemplate != null) {
            fya.b(multiGridsSleepPageTemplate.isNameVisibility(), this.w);
            this.w.setHeadTitleText(this.u.getName());
            this.w.setSubHeaderBackgroundColor(0);
            if (TextUtils.isEmpty(this.u.getLinkValue())) {
                this.w.setRightArrayVisibility(8);
            } else {
                if (!TextUtils.isEmpty(this.u.getMoreMenuTitle())) {
                    this.w.setMoreTextMaxLines(2);
                    this.w.setMoreTextAlignment(6);
                    this.w.setMoreText(this.u.getMoreMenuTitle());
                } else {
                    this.w.setMoreText("");
                }
                this.w.setRightArrayVisibility(0);
                this.w.setMoreViewClickListener(new View.OnClickListener() { // from class: fyd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.d.a(view);
                    }
                });
            }
        }
        if (this.f) {
            qsp.a(this.o, ContextCompat.getDrawable(this.h, R.mipmap.sleep_recommended_sum));
        } else {
            qsp.a(this.o, ContextCompat.getDrawable(this.h, R.mipmap.sleep_recommended_moon));
        }
    }

    public /* synthetic */ void a(View view) {
        HashMap map = new HashMap();
        map.put("moreEntryName", this.u.getMoreMenuTitle());
        MarketingBiUtils.a(3, this.m, this.r, map);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(this.u.getLinkValue());
        }
    }

    private void c() {
        List<SingleGridContent> list = this.f8207a;
        if (list == null || list.size() == 0) {
            LogUtil.a("CarouselsLayout", "no resource");
            qsp.c((View) this.p, 8);
            return;
        }
        for (SingleGridContent singleGridContent : this.f8207a) {
            LogUtil.a("CarouselsLayout", "singleGridContent: " + singleGridContent.toString());
            if (b(this.u.getTimePeriods()) == singleGridContent.getTimePeriodIdx()) {
                this.t.add(singleGridContent);
            }
        }
        while (this.t.size() < 3) {
            this.t.add(this.f8207a.get(0));
        }
        MultiGridsSleepPageTemplate multiGridsSleepPageTemplate = this.u;
        if (multiGridsSleepPageTemplate == null || multiGridsSleepPageTemplate.getTimePeriods() == null) {
            return;
        }
        for (TimePeriod timePeriod : this.u.getTimePeriods()) {
            if (a(timePeriod)) {
                qsp.b(this.n, timePeriod.getDescription());
                return;
            }
        }
    }

    private void a() {
        View viewInflate = LayoutInflater.from(this.h).inflate(R.layout.section_recommended_layout, this);
        this.x = viewInflate;
        this.p = (LinearLayout) viewInflate.findViewById(R.id.root_section_recommended);
        this.e = (HealthCardView) this.x.findViewById(R.id.section_recommended_cardview);
        this.w = (HealthSubHeader) this.x.findViewById(R.id.section_recommended_subhead);
        this.n = (HealthTextView) this.x.findViewById(R.id.section_recommended_title);
        this.o = (ImageView) this.x.findViewById(R.id.section_recommended_title_image);
        this.l = (HealthTextView) this.x.findViewById(R.id.section_recommended_subtitle_text);
        this.k = (HealthTextView) this.x.findViewById(R.id.section_recommended_subtitle_num);
        this.v = (CarouselsViewPager) this.x.findViewById(R.id.carouisels_viewpager);
        this.i = (ImageView) this.x.findViewById(R.id.music_button_image);
        int densityDpi = getDensityDpi();
        if (densityDpi < 440) {
            this.v.setPadding(0, 0, pao.e(this.h, densityDpi - 440), 0);
        }
    }

    private void d(SleepAudioInfoApi sleepAudioInfoApi, SleepAudioInfoReq sleepAudioInfoReq, ParamsFactory paramsFactory, List<SingleGridContent> list, String str) {
        try {
            Response<RespSleepAudioInfo> responseExecute = sleepAudioInfoApi.getSleepAudioList(sleepAudioInfoReq.getUrl(), paramsFactory.getHeaders(), str).execute();
            if (responseExecute.isOK()) {
                LogUtil.a("CarouselsLayout", "requestSleepAudioData response is OK.");
                RespSleepAudioInfo body = responseExecute.getBody();
                if (body == null) {
                    LogUtil.j("CarouselsLayout", "requestSleepAudioData result is null");
                    return;
                }
                if (body.getResultCode() == 0 && !njy.e(body.getSleepAudios())) {
                    for (SingleGridContent singleGridContent : list) {
                        if (singleGridContent != null) {
                            String dynamicDataId = singleGridContent.getDynamicDataId();
                            if (!TextUtils.isEmpty(dynamicDataId)) {
                                for (SleepAudioInfo sleepAudioInfo : body.getSleepAudios()) {
                                    if (sleepAudioInfo != null && TextUtils.equals(String.valueOf(sleepAudioInfo.getId()), dynamicDataId)) {
                                        this.f8208b.add(Integer.valueOf(sleepAudioInfo.getHeatCount()));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                LogUtil.j("CarouselsLayout", "requestSleepAudioData result is error.");
            }
        } catch (IOException unused) {
            LogUtil.j("CarouselsLayout", "requestSleepAudioData exception.");
        }
    }

    private int b(List<TimePeriod> list) {
        LogUtil.a("CarouselsLayout", "getCurrentTimePeriodIdx");
        if (list == null || list.size() == 0) {
            LogUtil.a("CarouselsLayout", "timePeriodList is empty");
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (a(list.get(i))) {
                return i;
            }
        }
        LogUtil.a("CarouselsLayout", "no match time period");
        return -1;
    }

    private boolean a(TimePeriod timePeriod) {
        int i;
        int i2;
        int i3;
        int i4;
        if (timePeriod == null) {
            LogUtil.a("CarouselsLayout", "timePeriod is null");
            return false;
        }
        LogUtil.a("CarouselsLayout", "isCurrentInTimePeriod, beginTime: " + timePeriod.getBeginTime() + ", endTime: " + timePeriod.getEndTime());
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = timePeriod.getBeginTime().split(":");
        String[] strArrSplit2 = timePeriod.getEndTime().split(":");
        if (strArrSplit.length != 2 || strArrSplit2.length != 2) {
            LogUtil.a("CarouselsLayout", "time array size error");
            return false;
        }
        try {
            i2 = Integer.parseInt(strArrSplit[0]);
            try {
                i = Integer.parseInt(strArrSplit[1]);
                try {
                    i3 = Integer.parseInt(strArrSplit2[0]);
                    try {
                        i4 = Integer.parseInt(strArrSplit2[1]);
                    } catch (NumberFormatException e) {
                        e = e;
                        LogUtil.e("CarouselsLayout", "exception is", e.getMessage());
                        i4 = 0;
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                    i3 = 0;
                }
            } catch (NumberFormatException e3) {
                e = e3;
                i = 0;
                i3 = 0;
            }
        } catch (NumberFormatException e4) {
            e = e4;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (i3 < i2) {
            i3 += 24;
        }
        return lsl.a(System.currentTimeMillis(), i2, i) < jCurrentTimeMillis && lsl.a(System.currentTimeMillis(), i3, i4) > jCurrentTimeMillis;
    }

    private void e(SleepAudioInfoReq sleepAudioInfoReq, String str) {
        sleepAudioInfoReq.setIds(str);
        sleepAudioInfoReq.setPageNo("1");
        sleepAudioInfoReq.setPageSize("100");
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        LogUtil.a("CarouselsLayout", BaseDialog.LIFE_CYCLE_ON_RESUME);
        super.onResume();
        this.v.b();
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onPause() {
        LogUtil.a("CarouselsLayout", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        CarouselsViewPager carouselsViewPager = this.v;
        if (carouselsViewPager == null) {
            LogUtil.a("CarouselsLayout", "mViewPager is null");
        } else {
            carouselsViewPager.c();
        }
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        CarouselsViewPager carouselsViewPager = this.v;
        if (carouselsViewPager == null) {
            LogUtil.a("CarouselsLayout", "mViewPager is null");
        } else {
            carouselsViewPager.c();
        }
    }

    private int getDensityDpi() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = this.h.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (systemService instanceof WindowManager) {
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.densityDpi;
    }

    static class b implements CarouselsViewPager.PageScrolledListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<CarouselsLayout> f8216a;

        private b(CarouselsLayout carouselsLayout) {
            this.f8216a = new WeakReference<>(carouselsLayout);
        }

        @Override // com.huawei.ui.commonui.viewpager.carouselsviewpager.CarouselsViewPager.PageScrolledListener
        public void pageScrolled(int i) {
            WeakReference<CarouselsLayout> weakReference = this.f8216a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            CarouselsLayout carouselsLayout = this.f8216a.get();
            carouselsLayout.g = i;
            carouselsLayout.setPageResource(i);
        }
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<CarouselsLayout> f8217a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<SingleGridContent> f8218c = new ArrayList();

        public c(CarouselsLayout carouselsLayout, List<SingleGridContent> list) {
            this.f8217a = new WeakReference<>(carouselsLayout);
            this.f8218c.addAll(list);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<CarouselsLayout> weakReference = this.f8217a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f8217a.get().e(this.f8218c);
        }
    }
}
