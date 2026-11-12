package com.huawei.ui.main.stories.health.activity.healthdata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.indicator.HealthLevelIndicator;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.recycleview.RecyclerItemDecoration;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.adapter.WeightBodyIndexRecycleAdapter;
import com.huawei.ui.main.stories.health.fragment.WeightBodyAnalysisReportFragment;
import com.huawei.ui.main.stories.health.fragment.WeightShareFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.WaistToHipRatioFragment;
import com.huawei.ui.main.stories.health.util.WeightAndAiBodyShapeCallback;
import com.huawei.ui.main.stories.health.util.WeightCommonView;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import defpackage.dnb;
import defpackage.dnj;
import defpackage.elh;
import defpackage.elo;
import defpackage.exz;
import defpackage.ezh;
import defpackage.iov;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qlj;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrk;
import defpackage.uwc;
import defpackage.uww;
import defpackage.vcp;
import defpackage.vcs;
import defpackage.vcz;
import defpackage.vdc;
import defpackage.vdo;
import defpackage.vei;
import defpackage.wkb;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class WeightDetailActivity extends BaseActivity implements View.OnClickListener, WaistToHipRatioFragment.WaistToHipCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConstraintLayout f27635a;
    private LinearLayout aa;
    private int ab;
    private CustomTitleBar ac;
    private int ad;
    private String af;
    private HealthTextView ag;
    private HealthTextView ah;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeightBodyIndexRecycleAdapter f27636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27637c;
    private WeightCommonView f;
    private int g;
    private long h;
    private Context i;
    private e j;
    private Intent l;
    private HealthLevelIndicator m;
    private boolean o;
    private boolean p;
    private boolean r;
    private dnj s;
    private WeightBodyAnalysisReportFragment u;
    private HealthRecycleView v;
    private WeightShareFragment x;
    private HealthTextView y;
    private long z;
    private final Context d = BaseApplication.b();
    private dnb q = new dnb();
    private boolean t = false;
    private List<uwc> k = new ArrayList(16);
    private List<uwc> w = new ArrayList(16);
    private List<dnb> e = new ArrayList(16);
    private boolean n = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.health_data_weight_body_index_detial);
        clearBackgroundDrawable();
        Intent intent = getIntent();
        this.l = intent;
        if (intent == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDetailActivity", "onCreate intent is null");
            finish();
            return;
        }
        if (intent.hasExtra("type")) {
            this.ad = this.l.getIntExtra("type", 0);
        }
        ReleaseLogUtil.c("HealthWeight_WeightDetailActivity", "onCreate mType ", Integer.valueOf(this.ad));
        this.r = this.ad == 0;
        this.i = this;
        this.j = new e(this);
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        this.s = currentUser;
        if (currentUser == null || TextUtils.isEmpty(currentUser.i())) {
            MultiUsersManager.INSTANCE.setCurrentUser((dnj) this.l.getSerializableExtra("currentUser"));
            MultiUsersManager.INSTANCE.setMainUser((dnj) this.l.getSerializableExtra("mainUser"));
            this.s = MultiUsersManager.INSTANCE.getCurrentUser();
        }
        q();
        m();
    }

    private void q() {
        this.f = (WeightCommonView) findViewById(R.id.hw_show_health_weight_detail_common_view);
        HealthScrollView healthScrollView = (HealthScrollView) findViewById(R.id.weight_scrollView);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.health_healthdata_bodyindex_title_layout);
        this.ac = customTitleBar;
        if (this.r) {
            customTitleBar.setVisibility(0);
            healthScrollView.setVisibility(0);
            healthScrollView.setScrollViewVerticalDirectionEvent(true);
            healthScrollView.smoothScrollTo(0, 0);
        } else {
            customTitleBar.setVisibility(8);
            healthScrollView.setVisibility(8);
        }
        this.f27635a = (ConstraintLayout) findViewById(R.id.hw_show_body_score_layout);
        this.y = (HealthTextView) findViewById(R.id.hw_show_health_data_weight_bodyindex_mid_time);
        HealthLevelIndicator healthLevelIndicator = (HealthLevelIndicator) findViewById(R.id.weight_detail_specification_indicator);
        this.m = healthLevelIndicator;
        healthLevelIndicator.setOnClickListener(this);
        this.ah = (HealthTextView) findViewById(R.id.hw_show_health_data_weight_mid_weight_score);
        this.ag = (HealthTextView) findViewById(R.id.hw_show_body_fit_score_suggestion);
        o();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.health_healthdata_inputweight_top_tip);
        this.aa = linearLayout;
        linearLayout.setOnClickListener(this);
        CustomTitleBar customTitleBar2 = this.ac;
        Context context = this.i;
        customTitleBar2.setRightSoftkeyBackground(ContextCompat.getDrawable(context, LanguageUtil.ba(context) ? R.drawable.ic_health_nav_share_black_rt : R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
    }

    private void o() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.hw_show_health_data_bodyindex_detail_recycle);
        this.v = healthRecycleView;
        healthRecycleView.setLayoutManager(new GridLayoutManager(this.i, 3) { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightDetailActivity.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.v.setIsScroll(false);
        if (this.v.getItemDecorationCount() <= 0) {
            int dimensionPixelSize = this.i.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(Integer.valueOf(dimensionPixelSize));
            arrayList.add(Integer.valueOf(dimensionPixelSize));
            arrayList.add(Integer.valueOf(dimensionPixelSize));
            arrayList.add(Integer.valueOf(this.i.getResources().getDimensionPixelSize(R.dimen.health_common_16dp)));
            int dimensionPixelSize2 = this.i.getResources().getDimensionPixelSize(R.dimen.health_common_8dp);
            this.v.addItemDecoration(new RecyclerItemDecoration(dimensionPixelSize2, dimensionPixelSize2, arrayList));
        }
    }

    private void e() {
        long jAx = this.q.ax();
        t();
        if (this.q.isVisible(31, this.t) && this.q.isVisible(1, this.t) && vei.b(this.q, this.t)) {
            this.f27635a.setVisibility(0);
        } else {
            this.f27635a.setVisibility(8);
        }
        if (this.q.as() == 0.0d) {
            WaistToHipRatioFragment.a(this.i);
        }
        this.y.setText(DateFormatUtil.a(jAx, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD) + " " + qrk.a(this.i, jAx, 1));
        x();
        this.f.setWeightCommonView(this.q, this.t, true);
        k();
        y();
    }

    private void k() {
        double[] dArrE = exz.e(Utils.o(), this.q.an(), this.q.c());
        if (!vei.b(dArrE, 2)) {
            LogUtil.j("HealthWeight_WeightDetailActivity", "initSpecification, bodyMassIndexValue is out of bound.");
            return;
        }
        float f = (float) dArrE[0];
        float f2 = (float) dArrE[1];
        float f3 = (float) dArrE[2];
        float fA = a(f2, 0.1f, true);
        String strD = vcz.d(0, 1);
        String strD2 = vcz.d(0, 2);
        String strD3 = vcz.d(0, 3);
        String strD4 = vcz.d(0, 4);
        int color = getColor(vdc.c(1));
        int color2 = getColor(vdc.c(2));
        int color3 = getColor(vdc.c(3));
        int color4 = getColor(vdc.c(4));
        double[] dArrC = exz.c(Utils.o());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj((float) dArrC[0], f, color, strD));
        arrayList.add(new qlj(f, fA, color2, strD2));
        arrayList.add(new qlj(fA, f3, color3, strD3));
        arrayList.add(new qlj(f3, (float) dArrC[1], color4, strD4));
        vei.e(this.m, arrayList, dArrE, dArrC);
        e(findViewById(R.id.weight_body_level_rang_low), strD, color);
        e(findViewById(R.id.weight_body_level_rang_stand), strD2, color2);
        e(findViewById(R.id.weight_body_level_rang_high), strD3, color3);
        e(findViewById(R.id.weight_body_level_rang_super_high), strD4, color4);
        String strE = UnitUtil.e(UnitUtil.c(this.q.av()), 1, this.q.getFractionDigitByType(0));
        SpannableString spannableString = new SpannableString(strE);
        spannableString.setSpan(new AbsoluteSizeSpan(38, true), 0, strE.length(), 18);
        this.m.setLevel((float) UnitUtil.d(this.q.f(), 1), spannableString);
        this.m.setLevelUnit(vei.b());
        this.m.setVisibility(0);
    }

    private float a(float f, float f2, boolean z) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(f);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(f2);
        if (z) {
            return bigDecimalValueOf.add(bigDecimalValueOf2).floatValue();
        }
        return bigDecimalValueOf.subtract(bigDecimalValueOf2).floatValue();
    }

    private void e(View view, String str, int i) {
        if (view == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDetailActivity", "initLevelItem view is null levelName ", str, " levelColor ", Integer.valueOf(i));
            return;
        }
        view.setVisibility(0);
        ImageView imageView = (ImageView) view.findViewById(R.id.weight_body_level_rang_item_icon);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        imageView.setImageDrawable(gradientDrawable);
        ((HealthTextView) view.findViewById(R.id.weight_body_level_rang_item_name)).setText(str);
        view.findViewById(R.id.weight_body_level_rang_item_content).setVisibility(8);
    }

    private void m() {
        Serializable serializableExtra = this.l.getSerializableExtra("weightBean");
        this.f27637c = this.l.getIntExtra("clientId", 0);
        if (serializableExtra instanceof dnb) {
            dnb dnbVar = (dnb) serializableExtra;
            this.q = dnbVar;
            LogUtil.a("HealthWeight_WeightDetailActivity", "initData mLatestBean ", HiJsonUtil.d(dnbVar));
            i();
            return;
        }
        this.af = this.l.getStringExtra(JsbMapKeyNames.H5_USER_ID);
        long longExtra = this.l.getLongExtra("startTime", 0L);
        long longExtra2 = this.l.getLongExtra("endTime", 0L);
        int i = this.ad;
        LogUtil.a("HealthWeight_WeightDetailActivity", "initData startTime ", Long.valueOf(longExtra), " endTime ", Long.valueOf(longExtra2), " mType ", Integer.valueOf(i), JsbMapKeyNames.H5_USER_ID, this.af);
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(longExtra, longExtra2);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setCount(1);
        vei.d(MultiUsersManager.INSTANCE.getCurrentUser(), hiAggregateOption, (HiAggregateOption) null, new c(this));
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements WeightAndAiBodyShapeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<WeightDetailActivity> f27638a;

        c(WeightDetailActivity weightDetailActivity) {
            this.f27638a = new WeakReference<>(weightDetailActivity);
        }

        @Override // com.huawei.ui.main.stories.health.util.WeightAndAiBodyShapeCallback
        public void getWeightAndAIBodyShape(ArrayList<dnb> arrayList, ArrayList<uww> arrayList2) {
            if (njy.e(arrayList)) {
                LogUtil.j("HealthWeight_WeightDetailActivity", "InnerWeightAndAiBodyShapeCallback list ", arrayList);
                return;
            }
            WeightDetailActivity weightDetailActivity = this.f27638a.get();
            if (weightDetailActivity != null && !weightDetailActivity.isFinishing() && !weightDetailActivity.isDestroyed()) {
                weightDetailActivity.q = arrayList.get(0);
                weightDetailActivity.i();
                weightDetailActivity.a();
                int i = weightDetailActivity.ad;
                if (i == 1) {
                    weightDetailActivity.d();
                    return;
                } else {
                    if (i != 2) {
                        return;
                    }
                    weightDetailActivity.b(weightDetailActivity.i);
                    return;
                }
            }
            LogUtil.j("HealthWeight_WeightDetailActivity", "InnerWeightAndAiBodyShapeCallback getWeightAndAIBodyShape activity ", weightDetailActivity);
        }
    }

    private void t() {
        this.ac.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: urg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50480b.a(view);
            }
        });
        this.ac.setRightSoftkeyVisibility(0);
        l();
        this.ac.setRightThirdKeyBackground(qre.c(R.drawable.icon_report), qre.f(R.string.IDS_read_report));
        this.ac.setRightThirdKeyVisibility(8);
        this.ac.setRightThirdKeyOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightDetailActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WeightDetailActivity.this.d();
            }
        });
        this.ac.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: urf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50479a.c(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    public /* synthetic */ void c(View view) {
        b(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: ure
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50478a.i();
                }
            });
            return;
        }
        this.t = !vdo.a();
        boolean booleanExtra = this.l.getBooleanExtra("guest_measure", false);
        this.n = booleanExtra;
        LogUtil.a("HealthWeight_WeightDetailActivity", "initData() mIsGuestMeasure = ", Boolean.valueOf(booleanExtra), " mIsHideCard ", Boolean.valueOf(this.t));
        if (this.n) {
            this.q = vei.c(this.q, this.t);
        }
        dnb dnbVar = this.q;
        if (dnbVar == null) {
            LogUtil.j("HealthWeight_WeightDetailActivity", "initData mLatestBean = null");
            finish();
        } else {
            LogUtil.a("HealthWeight_WeightDetailActivity", "goToConfigView mLatestBean ", HiJsonUtil.d(dnbVar));
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(final Context context) {
        dnb dnbVar;
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: urd
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(context);
                }
            });
            return;
        }
        if (!(context instanceof Activity) || (dnbVar = this.q) == null) {
            LogUtil.j("HealthWeight_WeightDetailActivity", "parent is not a Activity or mLatestBean is null!");
            return;
        }
        if (TextUtils.isEmpty(dnbVar.k())) {
            f();
        } else {
            c();
        }
        vei.a(AnalyticsValue.HEALTH_HEALTH_WEIGHT_DETAILS_SHARE_2030059.value(), this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void d() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: urj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50484c.d();
                }
            });
            return;
        }
        Activity activity = (Activity) this.i;
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (this.q == null || currentUser == null) {
            return;
        }
        WeightBodyAnalysisReportFragment weightBodyAnalysisReportFragment = new WeightBodyAnalysisReportFragment();
        this.u = weightBodyAnalysisReportFragment;
        weightBodyAnalysisReportFragment.d(activity, this.n);
        this.u.a(this.q);
        e eVar = this.j;
        if (eVar != null) {
            Message messageObtainMessage = eVar.obtainMessage();
            messageObtainMessage.what = 2000;
            this.j.sendMessage(messageObtainMessage);
            vei.a(AnalyticsValue.HEALTH_PLUGIN_DEVICE_HAGRID_DEVICE_DUAL_MODE_ADD_SUCCESS_2060037.value(), this.i);
        }
    }

    private void f() {
        dnb dnbVar;
        LogUtil.a("HealthWeight_WeightDetailActivity", "fetchDeviceInfoAndShare");
        if (this.i == null || (dnbVar = this.q) == null) {
            LogUtil.j("HealthWeight_WeightDetailActivity", "fetchDeviceInfoAndShare mContext is null or mLatestBean is null");
        } else {
            dnbVar.e(h());
            c();
        }
    }

    private String h() {
        dnb dnbVar = this.q;
        if (dnbVar == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDetailActivity", "getDeviceName mLatestBean is null");
            return "";
        }
        String strK = dnbVar.k();
        if (!TextUtils.isEmpty(strK)) {
            ReleaseLogUtil.c("HealthWeight_WeightDetailActivity", "getDeviceName deviceName ", strK);
            return strK;
        }
        String weightScaleProductId = this.q.getWeightScaleProductId();
        elh elhVarD = ResourceManager.c().d(weightScaleProductId);
        LogUtil.a("HealthWeight_WeightDetailActivity", "getDeviceName productId ", weightScaleProductId, " productInfo ", elhVarD);
        if (elhVarD == null) {
            return "";
        }
        elh.d dVarL = elhVarD.l();
        LogUtil.a("HealthWeight_WeightDetailActivity", "getDeviceName productManifest ", dVarL);
        if (dVarL == null) {
            return "";
        }
        String strA = elo.a(weightScaleProductId, dVarL.d());
        ReleaseLogUtil.c("HealthWeight_WeightDetailActivity", "getDeviceName deviceName ", strA);
        return strA;
    }

    private void l() {
        Drawable drawableC = qre.c(R.drawable.icon_report);
        if (LanguageUtil.ba(this.d)) {
            BitmapDrawable bitmapDrawableE = qqz.e(this.d, drawableC);
            if (bitmapDrawableE == null) {
                this.ac.setRightThirdKeyBackground(drawableC, qre.f(R.string.IDS_read_report));
                return;
            } else {
                this.ac.setRightThirdKeyBackground(bitmapDrawableE, qre.f(R.string.IDS_read_report));
                return;
            }
        }
        this.ac.setRightThirdKeyBackground(drawableC, qre.f(R.string.IDS_read_report));
    }

    public void c() {
        Context context = this.i;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
            if (this.q == null || currentUser == null) {
                return;
            }
            WeightShareFragment weightShareFragment = new WeightShareFragment();
            this.x = weightShareFragment;
            weightShareFragment.a(this.n);
            this.x.b(activity, this.t);
            this.x.c(this.q, this.i);
            Message messageObtainMessage = this.j.obtainMessage();
            messageObtainMessage.what = 1000;
            this.j.sendMessageDelayed(messageObtainMessage, this.r ? 0L : 100L);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.weightbodydata.WaistToHipRatioFragment.WaistToHipCallback
    public void onWaistToHipRatioChanged(dnb dnbVar) {
        this.q = dnbVar;
        this.k.clear();
        this.k.addAll(vcs.a(this.q, false, this.t));
        this.f27636b.a(this.q);
        this.f27636b.a(this.k);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class e extends BaseHandler<WeightDetailActivity> {
        e(WeightDetailActivity weightDetailActivity) {
            super(weightDetailActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WeightDetailActivity weightDetailActivity, Message message) {
            if (!weightDetailActivity.isFinishing() && !weightDetailActivity.isDestroyed()) {
                weightDetailActivity.e(message.what);
            } else {
                ReleaseLogUtil.d("HealthWeight_WeightDetailActivity", "handleMessageWhenReferenceNotNull activity ", weightDetailActivity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (i == 1000) {
            if (this.x == null) {
                ReleaseLogUtil.d("HealthWeight_WeightDetailActivity", "showShareDialog mShareFragment is null");
                return;
            }
            if (PermissionUtil.a()) {
                this.x.d();
            } else {
                PermissionUtil.d(this.i, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(this.i) { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightDetailActivity.2
                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onGranted() {
                        WeightDetailActivity.this.x.d();
                    }
                });
            }
            this.o = !this.r;
            return;
        }
        if (i != 2000) {
            ReleaseLogUtil.d("HealthWeight_WeightDetailActivity", "showShareDialog default shareType ", Integer.valueOf(i));
            return;
        }
        WeightBodyAnalysisReportFragment weightBodyAnalysisReportFragment = this.u;
        if (weightBodyAnalysisReportFragment == null) {
            ReleaseLogUtil.d("HealthWeight_WeightDetailActivity", "showShareDialog mReportFragment is null");
        } else {
            weightBodyAnalysisReportFragment.c();
            this.o = !this.r;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ReleaseLogUtil.c("HealthWeight_WeightDetailActivity", "onResume mIsAutoDisplayShare ", Boolean.valueOf(this.o), " mType ", Integer.valueOf(this.ad));
        if (this.o && this.ad == 2) {
            finish();
        } else {
            a();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ReleaseLogUtil.c("HealthWeight_WeightDetailActivity", "onPause mIsAutoDisplayShare ", Boolean.valueOf(this.o), " mType ", Integer.valueOf(this.ad));
        if (this.o && this.ad == 1) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: urb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50476c.a();
                }
            });
            return;
        }
        dnb dnbVar = this.q;
        if (dnbVar == null) {
            return;
        }
        boolean zIsVisible = dnbVar.isVisible(1, this.t);
        if (zIsVisible || Utils.o()) {
            LogUtil.a("HealthWeight_WeightDetailActivity", "has bodyFat or is oversea set topTip gone");
            this.aa.setVisibility(8);
        } else {
            LogUtil.j("HealthWeight_WeightDetailActivity", "no bodyFat and is not oversea set topTip visible");
            this.aa.setVisibility(0);
        }
        if (vei.b(this.q, this.t) && zIsVisible) {
            this.ac.setRightSoftkeyVisibility(0);
            if (r()) {
                this.ac.setRightThirdKeyVisibility(0);
                return;
            } else {
                this.ac.setRightThirdKeyVisibility(8);
                return;
            }
        }
        this.ac.setRightThirdKeyVisibility(8);
        this.ac.setRightSoftkeyVisibility(8);
    }

    private void y() {
        PrivacyDataModel privacyDataModel = new PrivacyDataModel();
        privacyDataModel.setClientId(this.f27637c);
        privacyDataModel.setStartTime(this.q.ax());
        privacyDataModel.setEndTime(this.q.aw());
        privacyDataModel.setModifyTime(this.q.aw());
        privacyDataModel.setDeviceName(h());
        double dC = UnitUtil.c(this.q.av());
        privacyDataModel.setDataTitle(UnitUtil.e(dC, 1, 1) + " " + vei.e(dC, false));
        privacyDataModel.setDoubleValue(dC);
        wkb.e(this.i, this.ac, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, privacyDataModel);
    }

    private boolean r() {
        dnb dnbVar = this.q;
        if (dnbVar == null) {
            return false;
        }
        double[] dArrAi = dnbVar.ai();
        if (dArrAi == null || dArrAi.length < 6 || this.q.ac() != 2) {
            LogUtil.j("HealthWeight_WeightDetailActivity", "isShowTitle valid fail");
            return false;
        }
        for (double d : dArrAi) {
            if (d <= 0.0d) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WaistToHipRatioFragment.a(null);
    }

    private void x() {
        if (this.s == null) {
            LogUtil.j("HealthWeight_WeightDetailActivity", "mainuser is null");
            return;
        }
        ad();
        w();
        v();
        WeightBodyIndexRecycleAdapter weightBodyIndexRecycleAdapter = new WeightBodyIndexRecycleAdapter(this.i, this.k, this.q, this.t);
        this.f27636b = weightBodyIndexRecycleAdapter;
        weightBodyIndexRecycleAdapter.d(this.n);
        this.v.setAdapter(this.f27636b);
        if (this.s.e() > 0) {
            s();
        } else {
            g();
        }
    }

    private void s() {
        dnj dnjVar = this.s;
        if (dnjVar == null) {
            LogUtil.j("HealthWeight_WeightDetailActivity", "processBodyTypeData mainuser is null");
            return;
        }
        this.e = vei.e(dnjVar.i(), this.q.ax(), this.s, this.t);
        p();
        int i = this.ab;
        boolean z = false;
        boolean z2 = (i == 0 || this.g == 0) ? false : true;
        if (this.p && ezh.e(i) && ezh.e(this.g) && z2) {
            z = true;
        }
        this.p = z;
    }

    private void g() {
        MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: urc
            @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.a(i, (dnj) obj);
            }
        });
    }

    public /* synthetic */ void a(final int i, final dnj dnjVar) {
        Context context = this.i;
        if (context == null || !(context instanceof Activity)) {
            LogUtil.j("HealthWeight_WeightDetailActivity", "getUserWeightTwoWeekData mContext is null or mContext is not Activity");
        } else {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: urh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50482c.a(dnjVar, i);
                }
            });
        }
    }

    public /* synthetic */ void a(dnj dnjVar, int i) {
        if (dnjVar == null || i != 0) {
            LogUtil.j("HealthWeight_WeightDetailActivity", "getUserWeigh loadDataSuccess getCurrentUser: currentUser is null return");
            dnjVar = MultiUsersManager.INSTANCE.getCurrentUser();
        }
        this.s = dnjVar;
        s();
    }

    private void ad() {
        this.ag.setText(vcp.a(this.q));
    }

    private void w() {
        double dH = this.q.h();
        if (ezh.c(dH)) {
            this.ah.setText(UnitUtil.e(dH, 1, 0));
        }
    }

    private boolean p() {
        this.p = false;
        if (this.q == null) {
            LogUtil.j("HealthWeight_WeightDetailActivity", "isShowBadyTypeCard mLatestBean = null");
            return false;
        }
        this.ab = 0;
        this.g = 0;
        List<dnb> list = this.e;
        if (list == null || list.size() <= 1) {
            LogUtil.a("HealthWeight_WeightDetailActivity", "weightDetail isShowBadyTypeCard mBodyTypeDataList is null or size <= 1");
            return this.p;
        }
        LogUtil.a("HealthWeight_WeightDetailActivity", "isShowBadyTypeCard mBodyTypeDataList size == ", Integer.valueOf(this.e.size()));
        List<dnb> list2 = this.e;
        dnb dnbVar = list2.get(list2.size() - 1);
        if (lsl.g(dnbVar.ax(), this.q.ax())) {
            return this.p;
        }
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (!lsl.g(dnbVar.ax(), this.e.get(size).ax())) {
                if (this.e.get(size).ax() != this.q.ax() || dnbVar.r() <= 0) {
                    break;
                    break;
                }
                LogUtil.a("HealthWeight_WeightDetailActivity", "isShowBadyTypeCard, bodyType has chenged... ");
                this.ab = vei.d(dnbVar);
                this.g = vei.d(this.q);
                this.z = dnbVar.ax();
                this.h = this.q.ax();
                break;
            }
        }
        LogUtil.a("HealthWeight_WeightDetailActivity", "isShowBadyTypeCard, mStartType = " + this.ab + "; mEndType=" + this.g + "; mStartTime=" + this.z + "; mEndTime=" + this.h);
        if (this.ab != this.g) {
            this.p = true;
        }
        return this.p;
    }

    private void v() {
        if (this.q == null || this.k == null) {
            LogUtil.j("HealthWeight_WeightDetailActivity", "mLatestBean is null or indexRecycleItems is null.");
            return;
        }
        this.w.clear();
        this.k.clear();
        this.k.addAll(vcs.a(this.q, false, this.t));
        if (njy.e(this.k)) {
            LogUtil.j("HealthWeight_WeightDetailActivity", "indexRecycleItems size == 0 .");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.m) {
            n();
        } else if (view == this.aa) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: uri
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50483c.b();
                }
            });
        } else {
            LogUtil.j("HealthWeight_WeightDetailActivity", "onClick else");
        }
    }

    public /* synthetic */ void b() {
        final String strA = vei.a();
        runOnUiThread(new Runnable() { // from class: urm
            @Override // java.lang.Runnable
            public final void run() {
                this.f50485b.d(strA);
            }
        });
    }

    public /* synthetic */ void d(String str) {
        LogUtil.a("HealthWeight_WeightDetailActivity", "onClick runOnUiThread");
        a(str);
    }

    private void a(String str) {
        LogUtil.a("HealthWeight_WeightDetailActivity", "enter enterTipsDetail");
        Intent intent = new Intent(this.i, (Class<?>) WebViewActivity.class);
        intent.putExtra("title", this.i.getString(R.string.IDS_hw_health_show_healthdata_more_question));
        intent.putExtra("url", str);
        iov.d(this.i, intent);
    }

    private void n() {
        LogUtil.a("HealthWeight_WeightDetailActivity", "mDataLayout--- onClick... ");
        LogUtil.a("HealthWeight_WeightDetailActivity", "gotoData() mIsGuestMeasure = ", Boolean.valueOf(this.n));
        Intent intent = new Intent(this.i, (Class<?>) WeightBodyDataActivity.class);
        intent.putExtra("isWeight", true);
        intent.putExtra("position", 0);
        dnb dnbVar = this.q;
        if (dnbVar != null && this.i != null) {
            intent.putExtra("WeightBean", dnbVar);
            intent.putExtra("start_time", this.z);
            intent.putExtra("start_type", this.ab);
            intent.putExtra("isGuestMeasure", this.n);
            iov.d(this.i, intent);
            return;
        }
        LogUtil.j("HealthWeight_WeightDetailActivity", "gotoData latestBean is null");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
