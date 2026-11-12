package com.huawei.ui.main.stories.member;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.model.mainpage.MainPageConfig;
import com.huawei.health.knit.model.mainpage.MainPageGroupConfig;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.section.model.MarketingIdInfo;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.marketing.views.IViewVisibilityChange;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.operationbundle.R;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.Product;
import com.huawei.trade.datatype.ProductInfo;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.stories.utils.MemberCardUpdateDialog;
import defpackage.fca;
import defpackage.fcn;
import defpackage.foc;
import defpackage.fxr;
import defpackage.irz;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qhu;
import defpackage.qqt;
import defpackage.qqv;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class MemberIntroFragment extends BaseFragment implements IViewVisibilityChange {
    private static final PathInterpolator d = new PathInterpolator(0.0f, 0.2f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f28587a;
    private List<Product> aa;
    private LinearLayout ab;
    private ViewGroup ac;
    private View ad;
    private int af;
    private String ag;
    private CustomTitleBar ah;
    private Product ai;
    private LinearLayout aj;
    private String al;
    private String an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f28588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f28589c;
    private Context e;
    private RelativeLayout g;
    private boolean h;
    private long j;
    private View k;
    private KnitFragment n;
    private MemberCardUpdateDialog q;
    private RelativeLayout r;
    private HealthTextView v;
    private HealthTextView y;
    private final String x = "MEMBER_TYPE_TAG_";
    private final Handler i = new e(this);
    private boolean ae = true;
    private boolean m = false;
    private boolean l = false;
    private boolean o = false;
    private int z = 0;
    private String s = "";
    private int f = 1;
    private int u = 0;
    private final View.OnClickListener w = new View.OnClickListener() { // from class: com.huawei.ui.main.stories.member.MemberIntroFragment.5
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            LogUtil.a("MemberIntroFragment", "open btn clicked");
            MemberIntroFragment.this.j();
            if (!TextUtils.isEmpty(MemberIntroFragment.this.an)) {
                str = MemberIntroFragment.this.an;
            } else {
                str = "1".equals(MemberIntroFragment.this.ag) ? "VipRate" : "VipPage";
            }
            fcn.d(MemberIntroFragment.this.al, str, MemberIntroFragment.this.f);
            MemberIntroFragment memberIntroFragment = MemberIntroFragment.this;
            ProductInfo productInfoB = memberIntroFragment.b(fca.e(memberIntroFragment.ai));
            if (productInfoB.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG) {
                fca.e(MemberIntroFragment.this.getContext(), MemberIntroFragment.this.ai, productInfoB);
            } else {
                MemberIntroFragment.this.n();
            }
        }
    };
    private final View.OnClickListener t = new View.OnClickListener() { // from class: com.huawei.ui.main.stories.member.MemberIntroFragment.4
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!qrs.r()) {
                MemberIntroFragment.this.e();
            } else {
                LogUtil.a("MemberIntroFragment", "isFastClick");
            }
        }
    };
    private final Observer am = new Observer() { // from class: com.huawei.ui.main.stories.member.MemberIntroFragment.2
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if (TextUtils.equals(str, "USER_MEMBER_INFO_UPDATE") && njy.c(objArr, 0)) {
                Object obj = objArr[0];
                if (obj instanceof UserMemberInfo) {
                    final UserMemberInfo userMemberInfo = (UserMemberInfo) obj;
                    HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.main.stories.member.MemberIntroFragment.2.5
                        @Override // java.lang.Runnable
                        public void run() {
                            MemberIntroFragment.this.d(userMemberInfo);
                        }
                    });
                }
            }
        }
    };
    private final Observer p = new AnonymousClass1();

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.member.MemberIntroFragment$1, reason: invalid class name */
    public class AnonymousClass1 implements Observer {
        AnonymousClass1() {
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, final Object... objArr) {
            if (njy.c(objArr, 0)) {
                LogUtil.a("MemberIntroFragment", "viewStub start args = ", objArr);
                HandlerExecutor.b(new Runnable() { // from class: vxy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.d(objArr);
                    }
                });
            }
        }

        public /* synthetic */ void d(Object[] objArr) {
            if (MemberIntroFragment.this.q == null) {
                MemberIntroFragment.this.q = new MemberCardUpdateDialog(MemberIntroFragment.this.e);
            }
            MemberIntroFragment.this.q.d(objArr[0]);
            MemberIntroFragment.this.q.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("MemberIntroFragment", "onCreateView");
        this.e = getActivity();
        this.ad = layoutInflater.inflate(R.layout.fragment_member_intro, viewGroup, false);
        this.j = System.currentTimeMillis();
        this.ah = (CustomTitleBar) this.ad.findViewById(R.id.member_title_bar);
        this.ab = (LinearLayout) this.ad.findViewById(R.id.member_intro_root_lyt);
        RelativeLayout relativeLayout = (RelativeLayout) this.ad.findViewById(R.id.loading_layout);
        this.r = relativeLayout;
        relativeLayout.setVisibility(0);
        this.g = (RelativeLayout) this.ad.findViewById(R.id.member_intro_error_layout);
        i();
        m();
        l();
        return this.ad;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        q();
        this.i.removeMessages(102);
    }

    public void b(int i) {
        this.z = i;
    }

    private void i() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.m = arguments.getBoolean("IS_SHOW_TITLE_RETURN_BUTTOM", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (TextUtils.isEmpty(this.s)) {
            LogUtil.j("MemberIntroFragment", "type select url is empty");
            return;
        }
        Uri uri = Uri.parse(this.s);
        this.ag = uri.getQueryParameter("trigResMemberPrice");
        this.an = uri.getQueryParameter("vipOpenFrom");
        this.al = uri.getQueryParameter("trigResName");
    }

    private void l() {
        h();
        g();
        o();
        f();
    }

    private void m() {
        ObserverManagerUtil.d(this.am, "USER_MEMBER_INFO_UPDATE");
        ObserverManagerUtil.d(this.p, "MEMBER_OPEN_BMI_CHANGE");
    }

    private void q() {
        ObserverManagerUtil.c(this.am);
        ObserverManagerUtil.c(this.p);
    }

    private void o() {
        this.ah.setLeftButtonVisibility(this.m ? 0 : 8);
        this.ah.setTitleText(this.e.getString(R.string.IDS_member_tab_title));
        if (qqv.a(this.e)) {
            this.ah.setTitleSize(this.e.getResources().getDimension(com.huawei.health.servicesui.R.dimen.textSizeHeadline7));
        } else {
            this.ah.setTitleSize(this.e.getResources().getDimension(com.huawei.health.servicesui.R.dimen.textSizeHeadline8));
        }
        this.ah.setTitleTextColor(this.e.getResources().getColor(R.color.common_dialog_title_text_color));
        this.ah.setTitleBarBackgroundColor(ContextCompat.getColor(this.e, R.color.common_white_0alpha));
        this.ah.setRightButtonVisibility(8);
        this.ah.setVisibility(0);
        if (this.m) {
            this.ah.setTitleMarginStart(this.e.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.health_common_0dp));
        } else {
            this.ah.setTitleMarginStart(this.e.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.emui_dimens_max_start));
        }
        this.ah.setClickable(true);
        this.ah.bringToFront();
    }

    private void f() {
        qsp.b(this.g, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.member.MemberIntroFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    return;
                }
                LogUtil.a("MemberIntroFragment", "click error layout");
                ObserverManagerUtil.e("REFRESH_DISCOVER_FRAGMENT", new Object[0]);
            }
        });
    }

    private void h() {
        this.k = this.ad.findViewById(R.id.member_intro_knit_container);
        this.ac = (ViewGroup) this.ad.findViewById(R.id.member_intro_open_member_layout);
        this.aj = (LinearLayout) this.ad.findViewById(R.id.member_intro_member_type_select_layout);
        this.f28587a = (HealthTextView) this.ad.findViewById(R.id.member_intro_currency_text);
        this.f28589c = (HealthTextView) this.ad.findViewById(R.id.member_intro_amount_text);
        this.y = (HealthTextView) this.ad.findViewById(R.id.member_intro_member_type_select_text);
        this.aj.setOnClickListener(this.t);
        HealthTextView healthTextView = (HealthTextView) this.ad.findViewById(R.id.member_intro_open_member_text);
        this.v = healthTextView;
        healthTextView.setOnClickListener(this.w);
        d(irz.a());
        HealthTextView healthTextView2 = (HealthTextView) this.ad.findViewById(R.id.member_agreement_text);
        this.f28588b = healthTextView2;
        healthTextView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(UserMemberInfo userMemberInfo) {
        boolean z = userMemberInfo == null || userMemberInfo.getMemberFlag() == -1;
        LogUtil.a("MemberIntroFragment", "refreshOpenMemberBtn isNoVip: ", Boolean.valueOf(z));
        qsp.b(this.v, BaseApplication.b().getResources().getString(z ? R.string.IDS_vip_open_vip : R.string.IDS_user_vip_renew));
    }

    private void g() {
        KnitFragment knitFragmentB = b();
        this.n = knitFragmentB;
        if (knitFragmentB == null) {
            LogUtil.a("MemberIntroFragment", "getMainPageKnitFragment returns null");
            return;
        }
        knitFragmentB.setLoadingCallback(new b(this));
        this.n.setOutHandler(this.i);
        this.n.setScrollViewListener(new a(this));
        getChildFragmentManager().beginTransaction().add(R.id.member_intro_knit_container, this.n).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        qsp.c((View) this.ab, 0);
        qsp.c((View) this.g, 8);
        qsp.c((View) this.r, 8);
        this.ae = true;
        if (this.l) {
            HandlerExecutor.c(new Runnable() { // from class: vxz
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d();
                }
            }, 500L);
        }
        if (this.o) {
            HandlerExecutor.c(new Runnable() { // from class: vxx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51687a.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        qsp.c((View) this.ab, 4);
        qsp.c((View) this.r, 8);
        qsp.c((View) this.g, 0);
        this.ae = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ProductInfo b(ProductInfo productInfo) {
        ProductInfo productInfo2 = new ProductInfo();
        if (productInfo == null) {
            return productInfo2;
        }
        productInfo.setTrigResName("会员开通");
        productInfo.setTrigResType("1000");
        productInfo.setTrigResMemberPrice("0");
        return productInfo;
    }

    private KnitFragment b() {
        MainPageGroupConfig mainPageGroupConfigD = foc.d(getContext(), "MainPageSectionsConfig.json");
        ArrayList<MainPageConfig> pagesConfig = mainPageGroupConfigD != null ? mainPageGroupConfigD.getPagesConfig() : null;
        if (pagesConfig != null) {
            for (int i = 0; i < pagesConfig.size(); i++) {
                MainPageConfig mainPageConfig = pagesConfig.get(i);
                if (mainPageConfig != null) {
                    int pageType = mainPageConfig.getPageType();
                    int resPosId = mainPageConfig.getResPosId();
                    String strB = qqt.b(mainPageConfig);
                    if (pageType == 32) {
                        Bundle bundle = new Bundle();
                        bundle.putInt(KnitFragment.KEY_BOOT_DRAWING_SECTIONS_COUNT, 2);
                        bundle.putLong(KnitFragment.KEY_LOADING_TIME_OUT_DELAY, 10000L);
                        return KnitFragment.newInstance(strB, new MemberIntroPageResTrigger(getContext(), resPosId, null, this).setExtra(c()), bundle);
                    }
                }
            }
        }
        return null;
    }

    private Bundle c() {
        LogUtil.a("MemberIntroFragment", "setObserverTag: ", "MEMBER_TYPE_TAG_");
        Bundle bundle = new Bundle();
        bundle.putString("MEMBER_PRODUCT_TAG", "MEMBER_TYPE_TAG_");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Product> list, int i) {
        ViewGroup viewGroup;
        LogUtil.a("MemberIntroFragment", "refreshOpenMemberLayout selectedIndex: ", Integer.valueOf(i));
        if (njy.e(list, i)) {
            return;
        }
        this.aa = list;
        this.af = i;
        Product product = list.get(i);
        if (product == null) {
            return;
        }
        this.ai = product;
        ObserverManagerUtil.e("MEMBER_TYPE_SELECTED", product);
        if (product.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG) {
            qsp.e((TextView) this.y, R.string.IDS_user_vip_more_product);
        } else {
            qsp.b(this.y, product.getProductName());
        }
        qsp.b(this.f28587a, qhu.d(product.getCurrency()));
        qsp.b(this.f28589c, fca.b(product));
        this.f28588b.setText(b(a(product)));
        this.f28588b.setHighlightColor(0);
        if (!this.ae || (viewGroup = this.ac) == null || viewGroup.getVisibility() == 0) {
            return;
        }
        p();
    }

    private CharSequence b(boolean z) {
        int i;
        CharSequence charSequenceD = fca.d(z);
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceD);
            spannableStringBuilder.append((CharSequence) "  ");
            if (qrs.x(BaseApplication.b())) {
                i = com.huawei.health.servicesui.R.drawable.ic_question_dark_xxxhdpi;
            } else {
                i = com.huawei.health.servicesui.R.drawable.ic_question_xxxhdpi;
            }
            Drawable drawable = ContextCompat.getDrawable(this.e, i);
            if (drawable != null) {
                int textSize = (int) this.f28588b.getTextSize();
                int iD = qrs.d(this.e, 2.0f);
                drawable.setBounds(0, iD, textSize, textSize + iD);
                int length = spannableStringBuilder.length() - 1;
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), length, length2, 33);
                spannableStringBuilder.append((CharSequence) "\u200b");
                spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.huawei.ui.main.stories.member.MemberIntroFragment.6
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
                        if (marketRouterApi != null) {
                            marketRouterApi.router("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?isImmerse&h5pro=true&pName=com.huawei.health&path=CancelService&urlType=4");
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint textPaint) {
                        textPaint.setUnderlineText(false);
                    }
                }, length, length2, 33);
                return spannableStringBuilder;
            }
        }
        return charSequenceD;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("MemberIntroFragment", "onConfigurationChanged");
    }

    private boolean a(Product product) {
        return product != null && product.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Product product = this.ai;
        if (product == null) {
            return;
        }
        ProductInfo productInfoE = fca.e(product);
        productInfoE.setAreaInfo(fca.a());
        productInfoE.setBiParams(fcn.e());
        String strB = qqt.b(b(productInfoE));
        LogUtil.a("MemberIntroFragment", "jumpOpenPage: ", strB);
        ((PayApi) Services.b("TradeService", PayApi.class)).buyByProductId(BaseApplication.b(), this, 10000, strB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void e() {
        LogUtil.a("MemberIntroFragment", "jumpTypeSelectActivity: ", Integer.valueOf(this.af));
        if (BaseApplication.j() == null) {
            LogUtil.e("MemberIntroFragment", "jumpTypeSelectActivity getTopActivity null");
            return;
        }
        Intent intent = new Intent(BaseApplication.j(), (Class<?>) MemberTypeSelectActivity.class);
        intent.putExtra("MEMBER_TYPE_SELECT_INDEX", this.af);
        intent.putExtra("memberTypeSelectUri", this.s);
        intent.putExtra("slidingScreens", this.f);
        if (!isAdded()) {
            LogUtil.e("MemberIntroFragment", "jumpTypeSelectActivity mHost is null");
            return;
        }
        startActivityForResult(intent, 10001);
        fca.b(this.e);
        this.o = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Product product;
        super.onActivityResult(i, i2, intent);
        LogUtil.a("MemberIntroFragment", "onActivityResult resultCode: ", Integer.valueOf(i2), "requestCode ", Integer.valueOf(i));
        if (i == 10000) {
            int intExtra = intent != null ? intent.getIntExtra("shoppingResult", -1) : -1;
            UserMemberInfo userMemberInfoA = irz.a();
            boolean z = userMemberInfoA == null || userMemberInfoA.getMemberFlag() == -1;
            if (intExtra != 0 || (product = this.ai) == null) {
                return;
            }
            fcn.e(this.ai.getProductName(), 8, fca.a(product) ? 2 : 3, !z);
            return;
        }
        if (i == 10001 && intent != null) {
            int intExtra2 = intent.getIntExtra("MEMBER_TYPE_SELECT_INDEX", -1);
            LogUtil.a("MemberIntroFragment", "onActivityResult index: ", Integer.valueOf(intExtra2));
            if (njy.c(this.aa, intExtra2)) {
                this.af = intExtra2;
                ObserverManagerUtil.e("MEMBER_TYPE_TAG_", Integer.valueOf(intExtra2));
            }
        }
    }

    static class e extends BaseHandler<MemberIntroFragment> {
        public e(MemberIntroFragment memberIntroFragment) {
            super(memberIntroFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MemberIntroFragment memberIntroFragment, Message message) {
            int i = message.what;
            if (i == 100) {
                Object obj = message.obj;
                if (obj instanceof Bundle) {
                    Bundle bundle = (Bundle) obj;
                    memberIntroFragment.a(bundle.getParcelableArrayList("PRODUCTS"), bundle.getInt("MEMBER_TYPE_SELECT_INDEX", -1));
                    return;
                }
                return;
            }
            if (i == 102 && !fcn.c(500)) {
                fcn.a(BaseApplication.b(), memberIntroFragment.z);
            }
        }
    }

    static class MemberIntroPageResTrigger extends BasePageResTrigger {
        private WeakReference<MemberIntroFragment> mReference;

        @Override // com.huawei.health.knit.section.listener.BasePageResTrigger, com.huawei.health.knit.section.listener.IPageResTrigger
        public int getPageCategory() {
            return 2;
        }

        public MemberIntroPageResTrigger(Context context, int i, MarketingIdInfo marketingIdInfo, MemberIntroFragment memberIntroFragment) {
            super(context, i, marketingIdInfo);
            this.mReference = new WeakReference<>(memberIntroFragment);
        }

        @Override // com.huawei.health.knit.section.listener.BasePageResTrigger, com.huawei.health.knit.section.listener.IPageResTrigger
        public void onPageCreated(Activity activity, View view) {
            super.onPageCreated(activity, view);
        }
    }

    public static class a implements ScrollViewListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f28597a = 1000;
        private final WeakReference<Fragment> d;

        public a(Fragment fragment) {
            this.d = new WeakReference<>(fragment);
        }

        @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
        public void onScrollChanged(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
            e(healthScrollView, i, i2, i3, i4);
            Fragment fragment = this.d.get();
            if (fragment == null || !(fragment instanceof MemberIntroFragment)) {
                return;
            }
            if (!healthScrollView.canScrollVertically(1) && System.currentTimeMillis() - this.f28597a > 2000) {
                this.f28597a = SystemClock.elapsedRealtime();
            }
            MemberIntroFragment memberIntroFragment = (MemberIntroFragment) fragment;
            if (memberIntroFragment.getUserVisibleHint()) {
                int scrollY = ((healthScrollView.getScrollY() + healthScrollView.getHeight()) - healthScrollView.getPaddingTop()) - healthScrollView.getPaddingBottom();
                if (memberIntroFragment.u == 0) {
                    memberIntroFragment.u = healthScrollView.getHeight();
                }
                memberIntroFragment.f = (int) Math.ceil((((double) scrollY) * 1.0d) / ((double) memberIntroFragment.u));
                if (healthScrollView.getChildAt(0).getHeight() != scrollY || System.currentTimeMillis() - this.f28597a <= 1000) {
                    return;
                }
                LogUtil.a("MemberIntroFragment", "scrolled to bottom");
                HashMap map = new HashMap();
                map.put("scroll", "1");
                map.put(CommonUtil.PAGE_TYPE, 2);
                lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_DISCOVER_SCROLL_TO_BOTTOM_2020014.value(), map, 0);
                lmf.d().b(BaseApplication.b());
                this.f28597a = System.currentTimeMillis();
            }
        }

        private void e(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
            Fragment fragment = this.d.get();
            if (fragment instanceof MemberIntroFragment) {
                MemberIntroFragment memberIntroFragment = (MemberIntroFragment) fragment;
                if (i2 <= 0) {
                    memberIntroFragment.ah.setTitleTextColor(ContextCompat.getColor(memberIntroFragment.e, R.color.common_dialog_title_text_color));
                    memberIntroFragment.ah.setTitleBarBackgroundColor(ContextCompat.getColor(memberIntroFragment.e, R.color.common_white_0alpha));
                } else {
                    memberIntroFragment.ah.setTitleTextColor(ContextCompat.getColor(memberIntroFragment.e, R.color.textColorPrimary));
                    memberIntroFragment.ah.setTitleBarBackgroundColor(ContextCompat.getColor(memberIntroFragment.e, R.color.colorSubBackground));
                }
            }
        }
    }

    @Override // com.huawei.health.marketing.views.IViewVisibilityChange
    public void onVisibilityChange(boolean z) {
        LogUtil.a("MemberIntroFragment", "onVisibilityChange: ", Boolean.valueOf(z));
        this.h = z;
        if (z) {
            fxr.b(new c(this));
            this.j = System.currentTimeMillis();
        }
        if (z || this.j == 0) {
            return;
        }
        s();
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MemberIntroFragment> f28599a;

        public c(MemberIntroFragment memberIntroFragment) {
            this.f28599a = new WeakReference<>(memberIntroFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            MemberIntroFragment memberIntroFragment = this.f28599a.get();
            if (memberIntroFragment == null) {
                LogUtil.j("MemberIntroFragment", "MemberOuterCallback is null");
                return;
            }
            boolean zB = (i == 0 && njy.b(obj, DeviceBenefits.class)) ? irz.b((List<DeviceBenefits>) obj) : false;
            LogUtil.a("MemberIntroFragment", "onVisibilityChange hasMemberEquity", Boolean.valueOf(zB));
            fcn.e(zB);
            memberIntroFragment.i.sendEmptyMessageDelayed(102, 1000L);
        }
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<MemberIntroFragment> f28598b;

        b(MemberIntroFragment memberIntroFragment) {
            this.f28598b = new WeakReference<>(memberIntroFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("MemberIntroFragment", "LoadingCallback errorCode ", Integer.valueOf(i));
            MemberIntroFragment memberIntroFragment = this.f28598b.get();
            if (memberIntroFragment == null) {
                LogUtil.j("MemberIntroFragment", "member intro fragment is null");
                return;
            }
            if (!health.compact.a.CommonUtil.ab(BaseApplication.b())) {
                memberIntroFragment.r();
            } else {
                memberIntroFragment.h = true;
                memberIntroFragment.t();
            }
            LogUtil.a("MemberIntroFragment", "LoadingCallback mFragmentIsVisibleToUser ", Boolean.valueOf(memberIntroFragment.h));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            this.j = System.currentTimeMillis();
        }
        this.u = 0;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            s();
        }
    }

    public void e(boolean z) {
        this.l = z;
    }

    public void a(boolean z) {
        this.o = z;
    }

    public void c(String str) {
        this.s = str;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d() {
        KnitFragment knitFragment = this.n;
        if (knitFragment == null) {
            return;
        }
        knitFragment.getHealthScrollView().fullScroll(130);
        this.l = false;
    }

    private void s() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("MemberIntroFragment", "setStayEvent: ", Long.valueOf(this.j), " ", Long.valueOf(jCurrentTimeMillis));
        fcn.e(this.j, jCurrentTimeMillis);
    }

    private void p() {
        if (this.ac == null || this.ai == null || !this.ae || Utils.i()) {
            return;
        }
        LogUtil.a("MemberIntroFragment", "showOpenMemberLayout");
        this.ac.animate().cancel();
        qsp.c((View) this.ac, 0);
        this.ac.animate().alpha(1.0f).setInterpolator(d).setDuration(250L).setListener(null);
    }
}
