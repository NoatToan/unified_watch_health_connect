package com.huawei.ui.main.stories.template.health.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.core.widget.NestedScrollView;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.ui.commonui.activetips.ActiveTipsView;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.utils.SleepBootPagerHelper;
import com.huawei.ui.main.stories.template.ResourceParseHelper;
import com.huawei.ui.main.stories.template.data.PageDataObserver;
import com.huawei.ui.main.stories.template.health.config.HealthNoDeviceConfig;
import com.huawei.ui.main.stories.template.health.view.NoDataResolutionView;
import com.huawei.ui.main.stories.template.health.view.NoDataViewContainer;
import defpackage.dlo;
import defpackage.fua;
import defpackage.idy;
import defpackage.iov;
import defpackage.irx;
import defpackage.irz;
import defpackage.njy;
import defpackage.pjo;
import defpackage.qhu;
import defpackage.qji;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.vcu;
import defpackage.wpd;
import defpackage.wpp;
import defpackage.wpq;
import defpackage.wps;
import defpackage.wpw;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class CommonHealthNoDeviceFragment extends BaseFragment implements PageDataObserver, ResourceParseHelper.ConfigInfoCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f28989a;
    private CustomTitleBar aa;
    private int ab;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f28990b;
    private ActiveTipsView e;
    private NoDataResolutionView f;
    private int g;
    private Context h;
    private LinearLayout i;
    private NoDataViewContainer j;
    private HealthNoDeviceConfig l;
    private ImageView m;
    private RelativeLayout o;
    private ResourceParseHelper p;
    private wps q;
    private int r;
    private PayApi s;
    private NestedScrollView.OnScrollChangeListener t;
    private String u;
    private HealthTextView v;
    private View w;
    private NestedScrollView x;
    private Runnable y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28991c = -1;
    private final View.OnClickListener d = new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.template.health.common.CommonHealthNoDeviceFragment.5
        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, int i2) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, String str) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap map = new HashMap(16);
            map.put("click", "1");
            map.put("hasdate", "false");
            idy.b(AnalyticsValue.MANUALLY_MONITOR_SLEEP_21300044.value(), map);
            if (view.getId() == R.id.section_root_view) {
                pjo.b().c(CommonHealthNoDeviceFragment.this.h, "0");
            } else if (view.getId() == R.id.sleep_no_data_device_card) {
                LogUtil.a("CommonHealth", "sleep no data device card is clicked!");
                GRSManager.c(CommonHealthNoDeviceFragment.this.h).d("activityUrl", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.template.health.common.CommonHealthNoDeviceFragment.5.2
                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackSuccess(String str) {
                        String strF;
                        if (TextUtils.isEmpty(str)) {
                            strF = qre.f(R.string.url_sleep_date_guide);
                            ReleaseLogUtil.d("CommonHealth", "onClick messageCenter ", str);
                        } else {
                            strF = str + "/messageH5/sleephtml/sleepDateGuide.html";
                        }
                        if (CommonUtil.cl()) {
                            strF = str + "/recommendH5/sleephtml/sleepDateGuide.html";
                        }
                        CommonHealthNoDeviceFragment.this.d(strF, true);
                    }

                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackFail(int i) {
                        LogUtil.d("CommonHealth", "GRSManager onCallBackFail ACTIVITY_KEY code = ", Integer.valueOf(i));
                    }
                });
            }
        }
    };
    private boolean k = true;
    private boolean n = false;

    public static CommonHealthNoDeviceFragment e(String str, int i) {
        CommonHealthNoDeviceFragment commonHealthNoDeviceFragment = new CommonHealthNoDeviceFragment();
        Bundle bundle = new Bundle();
        bundle.putString("common_no_device_service_id", str);
        bundle.putInt("common_no_device_page_type", i);
        commonHealthNoDeviceFragment.setArguments(bundle);
        return commonHealthNoDeviceFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.h = getContext();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_health_common_no_device, viewGroup, false);
        this.w = viewInflate;
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.u = arguments.getString("common_no_device_service_id");
            this.f28991c = arguments.getInt("common_no_device_bind_type");
        }
        if (this.f28991c == 1) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.common_no_bind_layout);
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.common_bind_no_record_layout);
            try {
                if (this.f28990b == null) {
                    View viewInflate = viewStub.inflate();
                    this.f28990b = viewInflate;
                    ImageView imageView = (ImageView) viewInflate.findViewById(R.id.common_bind_no_record_image);
                    HealthTextView healthTextView = (HealthTextView) this.f28990b.findViewById(R.id.common_bind_no_record_text);
                    qsp.a(imageView, a(this.f28991c));
                    qsp.b(healthTextView, b(this.f28991c));
                    linearLayout.setVisibility(8);
                    this.f28990b.setVisibility(0);
                }
            } catch (InflateException unused) {
                LogUtil.e("CommonHealth", "inflate mBindNoRecordLayout fail");
            }
        }
        b(view);
        d();
        b(this.u);
        this.j.setMarketingResource(this.f28989a, this.u);
    }

    private void e() {
        new SleepBootPagerHelper(this.h).showBootPage((LinearLayout) this.w.findViewById(R.id.boot_page_layout_container));
    }

    private void d() {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getInt("common_no_device_page_type") == 1 && fua.c(this.h)) {
            e();
            View viewInflate = LayoutInflater.from(this.h).inflate(R.layout.sleep_no_data_entry_layout, (ViewGroup) this.i, false);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.container_root_layout);
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            if (linearLayout.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.setMarginStart(((Integer) safeRegionWidth.first).intValue());
                layoutParams.setMarginEnd(((Integer) safeRegionWidth.second).intValue());
                linearLayout.setLayoutParams(layoutParams);
            }
            LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.section_root_view);
            HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.btn_image);
            healthButton.setText(this.h.getResources().getString(R.string.IDS_hw_health_show_healthdata_know_detail));
            healthButton.setAutoTextInfo(13, 1, 1);
            if (LanguageUtil.ba(this.h)) {
                ((ImageView) viewInflate.findViewById(R.id.background_image)).setImageDrawable(qqz.e(this.h, getResources().getDrawable(R.drawable.sleep_no_data_device_card_img)));
            }
            View.OnClickListener onClickListenerB = qji.b(this.d, (BaseActivity) this.h, true, "");
            linearLayout2.setOnClickListener(onClickListenerB);
            HealthCardView healthCardView = (HealthCardView) viewInflate.findViewById(R.id.sleep_no_data_device_card);
            healthCardView.setOnClickListener(onClickListenerB);
            if (healthCardView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) healthCardView.getLayoutParams();
                layoutParams2.width = qrs.t(this.h);
                layoutParams2.setMarginStart(qrs.c(this.h, 0, false));
                layoutParams2.setMarginEnd(qrs.e(this.h, 0, false));
                healthCardView.setLayoutParams(layoutParams2);
            }
            this.i.addView(viewInflate);
            this.i.setVisibility(0);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if ("BloodPressureCardConstructor".equals(this.u)) {
            LogUtil.a("CommonHealth", "reflushExclusiveGuardian");
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, boolean z) {
        Intent intent = new Intent(this.h, (Class<?>) WebViewActivity.class);
        intent.putExtra("EXTRA_BI_SOURCE", "SLEEPDETAIL");
        intent.putExtra("EXTRA_BI_NAME", "sleep_service");
        intent.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
        intent.putExtra("url", str);
        if (z) {
            intent.putExtra(Constants.IS_GUIDE, true);
        }
        iov.d(this.h, intent);
    }

    private void b(View view) {
        this.f = (NoDataResolutionView) view.findViewById(R.id.health_detail_resolution_view);
        this.i = (LinearLayout) view.findViewById(R.id.no_data_fragment_layout_for_sleep_page);
        this.j = (NoDataViewContainer) view.findViewById(R.id.no_data_fragment_view_container);
        ActiveTipsView activeTipsView = (ActiveTipsView) view.findViewById(R.id.active_tips_view);
        this.e = activeTipsView;
        activeTipsView.setSelected(true);
        this.m = (ImageView) view.findViewById(R.id.no_data_fragment_head_img);
        this.aa = (CustomTitleBar) view.findViewById(R.id.health_detail_no_data_title_layout);
        this.x = (NestedScrollView) view.findViewById(R.id.health_detail_no_data_scrollview);
        h();
        this.o = (RelativeLayout) view.findViewById(R.id.net_work_layout);
        this.v = (HealthTextView) view.findViewById(R.id.tips_net_work_down);
        a();
        this.aa.setTitleBarBackgroundColor(getContext().getResources().getColor(R.color.no_fragment_title_bgcolor_alpha));
        ResourceParseHelper.c(this);
        this.v.setOnClickListener(new View.OnClickListener() { // from class: wpr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f52326c.a(view2);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        if (this.k || this.n) {
            return;
        }
        wpp.a().e();
        wpp.a().b(this.r);
        b(this.u);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    private void h() {
        byte b2;
        String str = this.u;
        str.hashCode();
        int i = 0;
        switch (str) {
            case "BloodOxygenCardConstructor":
                b2 = 0;
                break;
            case "StressCardConstructor":
                b2 = 1;
                break;
            case "SleepCardConstructor":
                b2 = 2;
                break;
            case "HeartRateConstructor":
                b2 = 3;
                break;
            case "BloodPressureCardConstructor":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            i = 3034;
        } else if (b2 == 1) {
            i = 3035;
        } else if (b2 == 2) {
            i = 3036;
        } else if (b2 == 3) {
            i = 3033;
        } else if (b2 == 4) {
            i = 3039;
        }
        ScrollUtil.a(this.x, getActivity().getWindow().getDecorView(), i);
    }

    private Drawable a(int i) {
        if (i == 1) {
            return ContextCompat.getDrawable(this.h, R.drawable.ic_health_empty_nopresure);
        }
        return null;
    }

    private String b(int i) {
        if (i == 1) {
            return this.h.getString(R.string.IDS_hw_show_main_bloodpressure_detail_norecord);
        }
        return "";
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        NoDataViewContainer noDataViewContainer = this.j;
        if (noDataViewContainer != null) {
            noDataViewContainer.refreshTahiti();
        }
        wps wpsVar = this.q;
        if (wpsVar != null) {
            ResourceParseHelper.b(wpsVar.d().d(), this.u, this);
        }
    }

    private void b(String str) {
        this.n = true;
        this.k = true;
        this.v.setVisibility(8);
        this.f28989a = getActivity();
        ResourceParseHelper resourceParseHelper = new ResourceParseHelper();
        this.p = resourceParseHelper;
        if (!resourceParseHelper.b(this.u)) {
            wpd.c().d(this.u, new a(this));
        } else if (!CommonUtil.ab(getActivity())) {
            this.o.setVisibility(0);
            this.n = false;
        } else {
            this.p.e(str, new e(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(wps wpsVar) {
        this.l = wpsVar.b();
        c(wpsVar);
        Runnable runnable = new Runnable() { // from class: wpn
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b();
            }
        };
        this.y = runnable;
        this.j.post(runnable);
        g();
    }

    public /* synthetic */ void b() {
        this.j.setConfigInfo(this.l, false);
    }

    private void c(wps wpsVar) {
        ResourceParseHelper.e(wpsVar.d().b(), this.u, this);
        ResourceParseHelper.e(wpsVar.d().c(), this.u, this);
        ResourceParseHelper.b(wpsVar.d().d(), this.u, this);
    }

    private void g() {
        wpq.a().d(this.r, this);
        wpp.a().c(this.r);
    }

    @Override // com.huawei.ui.main.stories.template.data.PageDataObserver
    public void update(wpq wpqVar, List<dlo> list) {
        if (this.k) {
            this.j.setAllViewData(list);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Runnable runnable;
        wpq.a().e(this);
        wpp.a().e();
        ResourceParseHelper.c();
        wpd.c().d();
        if (this.f28989a != null) {
            this.f28989a = null;
        }
        if (this.f != null) {
            this.f = null;
        }
        if (this.e != null) {
            this.e = null;
        }
        if (this.p != null) {
            this.p = null;
        }
        NoDataViewContainer noDataViewContainer = this.j;
        if (noDataViewContainer != null && (runnable = this.y) != null) {
            noDataViewContainer.removeCallbacks(runnable);
            this.y = null;
        }
        if (this.q != null) {
            this.q = null;
        }
        if (this.t != null) {
            this.t = null;
        }
        super.onDestroy();
    }

    private void a() {
        NestedScrollView.OnScrollChangeListener onScrollChangeListener = new NestedScrollView.OnScrollChangeListener() { // from class: com.huawei.ui.main.stories.template.health.common.CommonHealthNoDeviceFragment$$ExternalSyntheticLambda0
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                this.d.a(nestedScrollView, i, i2, i3, i4);
            }
        };
        this.t = onScrollChangeListener;
        this.x.setOnScrollChangeListener(onScrollChangeListener);
    }

    /* synthetic */ void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        this.ab = this.aa.getMeasuredHeight();
        this.g = this.m.getMeasuredHeight() - this.ab;
        Resources resources = getContext().getResources();
        if (this.g > i2) {
            this.aa.setTitleBarBackgroundColor(resources.getColor(R.color.no_fragment_title_bgcolor_alpha));
        } else {
            this.aa.setTitleBarBackgroundColor(resources.getColor(R.color.no_fragment_titlebgcolor));
        }
    }

    private void i() {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getInt("common_no_device_page_type") == 7) {
            c();
        }
    }

    private void c() {
        LogUtil.a("CommonHealth", "getExclusiveGuardianData() enter");
        List<DeviceBenefitQueryParam> listD = qhu.d("CommonHealth", DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_INBOX);
        if (!njy.e(listD)) {
            if (this.s == null) {
                this.s = (PayApi) Services.d("TradeService", PayApi.class);
            }
            this.s.getAllDeviceBenefits(listD, new b(this));
            return;
        }
        LogUtil.j("CommonHealth", "getExclusiveGuardianData() queryParamList isEmpty");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(CopyOnWriteArrayList<DeviceBenefits> copyOnWriteArrayList) {
        LogUtil.a("CommonHealth", "processingData() enter");
        if (!njy.e(copyOnWriteArrayList)) {
            Iterator<DeviceBenefits> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                List<DeviceInboxInfo> inboxInfos = it.next().getInboxInfos();
                LogUtil.a("CommonHealth", "inboxInfos  = ", inboxInfos);
                if (!njy.e(inboxInfos)) {
                    Iterator<DeviceInboxInfo> it2 = inboxInfos.iterator();
                    while (it2.hasNext()) {
                        d(it2.next());
                    }
                } else {
                    LogUtil.j("CommonHealth", "processingData() deviceBenefits.getInboxInfos() isEmpty");
                }
            }
            return;
        }
        LogUtil.j("CommonHealth", "processingData() deviceBenefitsList isEmpty");
    }

    private void d(final DeviceInboxInfo deviceInboxInfo) {
        boolean zC = vcu.c(deviceInboxInfo);
        LogUtil.a("CommonHealth", "isShowTips  = ", Boolean.valueOf(zC));
        if (!zC || this.e == null) {
            return;
        }
        String strE = irx.e(deviceInboxInfo);
        if (TextUtils.isEmpty(strE)) {
            strE = "P12M";
        }
        String strB = irz.b(strE);
        LogUtil.a("CommonHealth", "timeStr  = ", strB);
        final String strE2 = vcu.e(R.string.IDS_user_service_has_pick_tip, strB);
        LogUtil.a("CommonHealth", "tipText  = ", strE2);
        if (getActivity() != null) {
            getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.ui.main.stories.template.health.common.CommonHealthNoDeviceFragment.2
                @Override // java.lang.Runnable
                public void run() {
                    if (CommonHealthNoDeviceFragment.this.e != null) {
                        CommonHealthNoDeviceFragment.this.e.setVisibility(0);
                        CommonHealthNoDeviceFragment.this.e.setTipsText(strE2);
                        CommonHealthNoDeviceFragment.this.e.setActiveBtText(CommonHealthNoDeviceFragment.this.getResources().getString(R.string.IDS_h5_vip_active_now));
                        CommonHealthNoDeviceFragment.this.e.setClickBannerListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.template.health.common.CommonHealthNoDeviceFragment.2.1
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                if (deviceInboxInfo == null) {
                                    LogUtil.j("CommonHealth", "deviceInboxInfo is null");
                                } else {
                                    vcu.a(CommonHealthNoDeviceFragment.this.h, deviceInboxInfo.getLinkType(), OperationUtils.newPathConcat(deviceInboxInfo.getLinkValue(), "from", "8"));
                                }
                            }
                        });
                        return;
                    }
                    LogUtil.j("CommonHealth", "mActiveTipsView is null");
                }
            });
        } else {
            LogUtil.j("CommonHealth", "getActivity() is null");
        }
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<CommonHealthNoDeviceFragment> f28998b;

        b(CommonHealthNoDeviceFragment commonHealthNoDeviceFragment) {
            this.f28998b = new WeakReference<>(commonHealthNoDeviceFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("CommonHealth", "GetAllDeviceBenefitsCallback errorCode = ", Integer.valueOf(i));
            CommonHealthNoDeviceFragment commonHealthNoDeviceFragment = this.f28998b.get();
            if (commonHealthNoDeviceFragment == null) {
                LogUtil.j("CommonHealth", "commonHealthNoDeviceFragment is null");
            } else if (i == 0 && (obj instanceof CopyOnWriteArrayList)) {
                commonHealthNoDeviceFragment.e((CopyOnWriteArrayList<DeviceBenefits>) obj);
            } else {
                LogUtil.j("CommonHealth", "errorCode not success");
            }
        }
    }

    @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
    public void getTitleName(String str) {
        this.aa.setTitleText(str);
    }

    @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
    public void getDescription(String str) {
        NoDataResolutionView noDataResolutionView = this.f;
        if (noDataResolutionView != null) {
            noDataResolutionView.setData(str);
        }
    }

    @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
    public void getImagePath(String str) {
        if (getActivity() == null) {
            LogUtil.j("CommonHealth", "getImagePath getActivity is null");
            return;
        }
        Activity activity = this.f28989a;
        if (activity == null || activity.isFinishing() || this.f28989a.isDestroyed()) {
            return;
        }
        qqf.e(str, new RequestOptions().skipMemoryCache(true), this.m);
    }

    @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
    public void showParseErrorAlert() {
        this.k = false;
        this.v.setVisibility(0);
    }

    static class a implements Consumer<wps> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<CommonHealthNoDeviceFragment> f28997c;

        a(CommonHealthNoDeviceFragment commonHealthNoDeviceFragment) {
            this.f28997c = new WeakReference<>(commonHealthNoDeviceFragment);
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(wps wpsVar) {
            int iB;
            CommonHealthNoDeviceFragment commonHealthNoDeviceFragment = this.f28997c.get();
            if (commonHealthNoDeviceFragment == null || commonHealthNoDeviceFragment.f28989a == null) {
                return;
            }
            if (wpsVar == null) {
                LogUtil.j("CommonHealth", "getTemplateConfig result is null");
                return;
            }
            wpw operationData = wpsVar.b().getOperationData();
            if (operationData != null) {
                iB = operationData.b();
            } else {
                iB = wpsVar.e().b();
            }
            commonHealthNoDeviceFragment.r = iB;
            commonHealthNoDeviceFragment.n = false;
            commonHealthNoDeviceFragment.q = wpsVar;
            commonHealthNoDeviceFragment.b(commonHealthNoDeviceFragment.q);
        }
    }

    static class e implements ResourceParseHelper.JsonResult {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<CommonHealthNoDeviceFragment> f28999c;

        e(CommonHealthNoDeviceFragment commonHealthNoDeviceFragment) {
            this.f28999c = new WeakReference<>(commonHealthNoDeviceFragment);
        }

        @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.JsonResult
        public void onResult(wps wpsVar) {
            CommonHealthNoDeviceFragment commonHealthNoDeviceFragment = this.f28999c.get();
            if (commonHealthNoDeviceFragment == null || commonHealthNoDeviceFragment.f28989a == null) {
                return;
            }
            if (wpsVar != null) {
                commonHealthNoDeviceFragment.n = false;
                commonHealthNoDeviceFragment.q = wpsVar;
                commonHealthNoDeviceFragment.b(commonHealthNoDeviceFragment.q);
                return;
            }
            LogUtil.j("CommonHealth", "getTemplateConfig result is null");
        }

        @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.JsonResult
        public void onFail() {
            CommonHealthNoDeviceFragment commonHealthNoDeviceFragment = this.f28999c.get();
            if (commonHealthNoDeviceFragment == null) {
                return;
            }
            commonHealthNoDeviceFragment.n = false;
            LogUtil.d("CommonHealth", "requestConfig onFail");
        }
    }
}
