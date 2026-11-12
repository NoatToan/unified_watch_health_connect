package com.huawei.ui.main.stories.member;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.operationbundle.R;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.Product;
import com.huawei.trade.datatype.ProductInfo;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.stories.member.MemberTypeSelectActivity;
import com.huawei.ui.main.stories.member.adaper.MemberIncludeAdapter;
import defpackage.fca;
import defpackage.fcn;
import defpackage.foc;
import defpackage.fud;
import defpackage.irz;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqy;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MemberTypeSelectActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f28612b = Arrays.asList("1", "6", "7", "10", "12");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f28613a;
    private HealthTextView ad;
    private RelativeLayout ae;
    private HealthTextView ag;
    private Runnable ai;
    private Product aj;
    private HealthTextView al;
    private HealthTextView ao;
    private UserMemberInfo ap;
    private TextView aq;
    private String ar;
    private TextView as;
    private LinearLayout d;
    private HealthTextView f;
    private Context h;
    private HealthRecycleView k;
    private MemberIncludeAdapter m;
    private View n;
    private HealthCardView o;
    private Intent q;
    private ImageView v;
    private HealthImageView x;
    private boolean y;
    private KnitFragment z;
    private boolean p = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28614c = "";
    private final String ab = "MEMBER_TYPE_TAG_";
    private Handler l = new d(this);
    private String ak = "1000";
    private String an = "0";
    private String am = "";
    private String ah = "";
    private String aa = "";
    private String af = "";
    private String i = "";
    private String w = "";
    private int j = -1;
    private String e = "";
    private boolean t = false;
    private boolean s = false;
    private boolean r = true;
    private RepeatResourceBenefitInfo g = null;
    private boolean u = false;
    private final View.OnClickListener ac = new View.OnClickListener() { // from class: com.huawei.ui.main.stories.member.MemberTypeSelectActivity.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            LogUtil.a("MemberTypeSelectActivity", "open btn clicked. isGuardian: " + MemberTypeSelectActivity.this.p);
            if (!MemberTypeSelectActivity.this.p) {
                if (!TextUtils.isEmpty(MemberTypeSelectActivity.this.ar)) {
                    str = MemberTypeSelectActivity.this.ar;
                } else {
                    str = "1".equals(MemberTypeSelectActivity.this.an) ? "VipRate" : "VipPage";
                }
                if (TextUtils.isEmpty(MemberTypeSelectActivity.this.e) || TextUtils.isEmpty(MemberTypeSelectActivity.this.ah)) {
                    if (MemberTypeSelectActivity.this.ap == null || MemberTypeSelectActivity.this.ap.getMemberFlag() == -1) {
                        fcn.d(MemberTypeSelectActivity.this.am, str, MemberTypeSelectActivity.this.q != null ? MemberTypeSelectActivity.this.q.getIntExtra("slidingScreens", 1) : 1);
                    } else {
                        fcn.a(MemberTypeSelectActivity.this.am, str);
                    }
                } else {
                    fcn.d(MemberTypeSelectActivity.this.e, MemberTypeSelectActivity.this.ah);
                }
            }
            if (MemberTypeSelectActivity.this.aj == null) {
                LogUtil.e("MemberTypeSelectActivity", "mSelectedProduct is null, cannot proceed.");
                return;
            }
            MemberTypeSelectActivity memberTypeSelectActivity = MemberTypeSelectActivity.this;
            ProductInfo productInfoE = memberTypeSelectActivity.e(fca.e(memberTypeSelectActivity.aj));
            if (MemberTypeSelectActivity.this.p) {
                productInfoE.setResourceType(9);
            }
            ReleaseLogUtil.d("R_MemberTypeSelectActivity", "open btn clicked productInfo name:", productInfoE.getProductName());
            if (productInfoE.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG) {
                fca.e(MemberTypeSelectActivity.this.z.getActivity(), MemberTypeSelectActivity.this.aj, productInfoE);
            } else {
                fca.c(MemberTypeSelectActivity.this.z.getActivity(), productInfoE);
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseActivity.setDisplaySideMode(this);
        setBackgroundDrawableResource(R.color.series_top_big_image_foreground);
        setContentView(R.layout.activity_member_type_select);
        this.h = this;
        this.ap = irz.a();
        this.y = qrs.af(this);
        this.q = getIntent();
        a();
        j();
        o();
        if (this.p) {
            return;
        }
        fcn.q();
    }

    private void j() {
        Intent intent = this.q;
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("memberTypeSelectUri");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        String strA = qqy.a(stringExtra);
        LogUtil.a("MemberTypeSelectActivity", "handleUrl url：", strA);
        Uri uri = Uri.parse(strA);
        String queryParameter = uri.getQueryParameter("benefitType");
        this.f28614c = queryParameter;
        boolean zEquals = "9".equals(queryParameter);
        this.p = zEquals;
        LogUtil.a("MemberTypeSelectActivity", "handleUri mBenefitType: ", this.f28614c, " isGuardian: ", Boolean.valueOf(zEquals));
        a(uri);
    }

    private void a(Uri uri) {
        if (uri == null) {
            return;
        }
        String queryParameter = uri.getQueryParameter("bitPageId");
        if (TextUtils.isEmpty(queryParameter)) {
            this.aa = uri.getQueryParameter("pageId");
        } else {
            this.aa = queryParameter;
        }
        this.af = uri.getQueryParameter("payFrom");
        fcn.n(TextUtils.isEmpty(this.aa) ? "" : this.aa);
        fcn.k(TextUtils.isEmpty(this.af) ? "" : this.af);
        this.w = uri.getQueryParameter("itemId");
        this.ah = uri.getQueryParameter("payResourceType");
        this.am = uri.getQueryParameter("trigResName");
        String queryParameter2 = uri.getQueryParameter("name");
        this.e = queryParameter2;
        fcn.a(TextUtils.isEmpty(queryParameter2) ? "" : this.e);
        fcn.p(TextUtils.isEmpty(this.ah) ? "" : this.ah);
        fcn.n(TextUtils.isEmpty(this.aa) ? "" : this.aa);
        fcn.o(TextUtils.isEmpty(this.w) ? "" : this.w);
        Intent intent = this.q;
        String stringExtra = intent != null ? intent.getStringExtra(WebViewHelp.BI_KEY_PULL_FROM) : "";
        String queryParameter3 = uri.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = queryParameter3;
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        fcn.i(stringExtra);
        String queryParameter4 = uri.getQueryParameter("pullOrder");
        fcn.t(queryParameter4 != null ? queryParameter4 : "");
        this.an = uri.getQueryParameter("trigResMemberPrice");
        this.ar = uri.getQueryParameter("vipOpenFrom");
        String queryParameter5 = uri.getQueryParameter("trigResType");
        this.ak = queryParameter5;
        fcn.d(f28612b.contains(queryParameter5));
        this.i = uri.getQueryParameter("productId");
        String queryParameter6 = uri.getQueryParameter("from");
        if (TextUtils.isEmpty(queryParameter6)) {
            return;
        }
        try {
            this.j = Integer.parseInt(queryParameter6);
        } catch (NumberFormatException e) {
            LogUtil.e("MemberTypeSelectActivity", e.getMessage());
        }
    }

    private void o() {
        f();
        m();
        n();
        i();
        q();
        k();
    }

    private void f() {
        this.o = (HealthCardView) findViewById(R.id.card_container);
        this.d = (LinearLayout) findViewById(R.id.member_type_button_agreement_layout);
        this.v = (ImageView) findViewById(R.id.iv_fallback_texture);
        this.as = (TextView) findViewById(R.id.tv_fallback_title);
        this.aq = (TextView) findViewById(R.id.tv_fallback_subtitle);
        this.x = (HealthImageView) findViewById(R.id.iv_member_card);
        this.ao = (HealthTextView) findViewById(R.id.tv_period_title);
        this.al = (HealthTextView) findViewById(R.id.title);
        this.ag = (HealthTextView) findViewById(R.id.member_renew_remind);
        this.ae = (RelativeLayout) findViewById(R.id.remind_text_rl);
        this.f = (HealthTextView) findViewById(R.id.member_include_footer_tips);
        this.n = findViewById(R.id.member_include_root_card);
        this.k = (HealthRecycleView) findViewById(R.id.member_include_recycleview);
        MemberIncludeAdapter memberIncludeAdapter = new MemberIncludeAdapter();
        this.m = memberIncludeAdapter;
        this.k.setAdapter(memberIncludeAdapter);
        this.k.setLayoutManager(new HealthLinearLayoutManager(this.h, 1, false));
        this.k.setOverScrollMode(2);
        this.k.b(false);
        c(8);
        if (this.p) {
            this.ao.setText(R.string.IDS_vip_equity_cycle);
            this.al.setText(R.string.IDS_vip_open_immediately);
        } else {
            this.ao.setText(R.string.IDS_vip_membership_period);
            this.al.setText(R.string.IDS_vip_product_activate);
        }
        View viewFindViewById = findViewById(R.id.btn_close);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.member.MemberTypeSelectActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    MemberTypeSelectActivity.this.h();
                }
            });
        }
    }

    private void c(int i) {
        this.o.setVisibility(i);
        this.d.setVisibility(i);
    }

    private void m() {
        findViewById(R.id.activity_member_type_select_content).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.member.MemberTypeSelectActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MemberTypeSelectActivity.this.h();
            }
        });
    }

    private void n() {
        if (this.p) {
            this.z = foc.b(this, 38, g());
        } else {
            this.z = foc.b(this, 33, g());
        }
        KnitFragment knitFragment = this.z;
        if (knitFragment == null) {
            LogUtil.e("MemberTypeSelectActivity", "knitFragment == null");
            return;
        }
        knitFragment.setOutHandler(this.l);
        this.z.setIsBottomPadding(false);
        getSupportFragmentManager().beginTransaction().replace(R.id.member_type_drag_content, this.z).commit();
    }

    private void i() {
        this.ad = (HealthTextView) findViewById(R.id.member_type_open_button);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.member_type_agreement_text);
        this.f28613a = healthTextView;
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f28613a.setHighlightColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Product product) {
        String string;
        UserMemberInfo userMemberInfoA;
        HealthTextView healthTextView = this.ad;
        if (healthTextView == null) {
            return;
        }
        healthTextView.setOnClickListener(this.ac);
        if (product != null && !TextUtils.isEmpty(product.getButtonDesc())) {
            string = product.getButtonDesc();
        } else {
            string = getResources().getString(com.huawei.health.servicesui.R.string.IDS_vip_open_immediately);
            String string2 = getResources().getString(com.huawei.health.servicesui.R.string.IDS_user_vip_renew);
            if (!this.p ? !((userMemberInfoA = irz.a()) == null || userMemberInfoA.getMemberFlag() != 1) : !this.r) {
                string = string2;
            }
        }
        qsp.b(this.ad, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Product product = this.aj;
        if (product == null) {
            return;
        }
        if (this.p) {
            qsp.b(this.f28613a, fca.c(product));
        } else {
            qsp.b(this.f28613a, fca.d(a(product)));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        h();
        q();
        k();
    }

    private boolean a(Product product) {
        return product != null && product.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ProductInfo e(ProductInfo productInfo) {
        String str;
        ProductInfo productInfo2 = new ProductInfo();
        if (productInfo == null) {
            return productInfo2;
        }
        productInfo.setTrigResMemberPrice(this.an);
        if (TextUtils.isEmpty(this.e)) {
            str = "会员开通";
        } else {
            str = this.e;
        }
        if (!TextUtils.isEmpty(this.am)) {
            str = this.am;
        }
        if (!TextUtils.isEmpty(this.w)) {
            str = str + "#" + this.w;
        }
        productInfo.setTrigResName(str);
        productInfo.setTrigResType(this.ak);
        return productInfo;
    }

    private Bundle g() {
        Intent intent = this.q;
        if (intent == null) {
            return null;
        }
        int intExtra = intent.getIntExtra("MEMBER_TYPE_SELECT_INDEX", -1);
        LogUtil.a("MemberTypeSelectActivity", "getKnitExtra: ", Integer.valueOf(intExtra));
        Bundle bundle = new Bundle();
        bundle.putBoolean(KnitFragment.KEY_EXTRA_WRAP_CONTENT, true);
        bundle.putBoolean("IS_SHOW_OPEN", true);
        bundle.putBoolean("is_guardian_mode", this.p);
        if (!TextUtils.isEmpty(this.i)) {
            bundle.putString("DEFAULT_PRODUCT_ID", this.i);
        }
        if (intExtra >= 0) {
            bundle.putInt("MEMBER_TYPE_SELECT_INDEX", intExtra);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ReleaseLogUtil.d("R_MemberTypeSelectActivity", "onActivityResult resultCode: ", Integer.valueOf(i2));
        if (i != 10000) {
            return;
        }
        int intExtra = intent != null ? intent.getIntExtra("shoppingResult", -1) : -1;
        ReleaseLogUtil.d("R_MemberTypeSelectActivity", "shoppingResult: ", Integer.valueOf(intExtra));
        if (intExtra != 0) {
            if (intExtra == 3040022) {
                qpx.e(this.h, qre.a(com.huawei.ui.commonui.R.string.IDS_member_period_exceed_limit, qre.e(R.plurals.IDS_benefit_year, 10, 10)));
                return;
            }
            return;
        }
        UserMemberInfo userMemberInfoA = irz.a();
        boolean z = userMemberInfoA == null || userMemberInfoA.getMemberFlag() == -1;
        this.r = fca.e(this.g);
        t();
        Product product = this.aj;
        if (product != null) {
            if (this.p) {
                fcn.d(this.aj.getProductName(), 2, true ^ this.r, product.isHealthMember());
            } else {
                int i3 = fca.a(product) ? 2 : 3;
                int i4 = this.j;
                if (i4 == -1) {
                    i4 = 8;
                }
                fcn.e(this.aj.getProductName(), i4, i3, !z);
            }
        }
        this.q.putExtra("shoppingResult", intExtra);
        h();
        if (this.p) {
            b();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c();
    }

    private void c() {
        fcn.i("");
        fcn.a("");
        fcn.p("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("MemberTypeSelectActivity", "hide");
        setResult(-1, this.q);
        finish();
    }

    private void t() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: vyd
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e();
            }
        });
    }

    public /* synthetic */ void e() {
        ((VipApi) Services.b("vip", VipApi.class)).getVipInfo(new VipCallback() { // from class: com.huawei.ui.main.stories.member.MemberTypeSelectActivity.2
            @Override // com.huawei.health.vip.api.VipCallback
            public void onSuccess(Object obj) {
                LogUtil.a("MemberTypeSelectActivity", "updateLocalMemberInfo onSuccess: result ", obj);
            }

            @Override // com.huawei.health.vip.api.VipCallback
            public void onFailure(int i, String str) {
                LogUtil.a("MemberTypeSelectActivity", "updateLocalMemberInfo failure, errCode:", Integer.valueOf(i), " errMsg:", str);
            }
        });
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class d extends BaseHandler<MemberTypeSelectActivity> {
        public d(MemberTypeSelectActivity memberTypeSelectActivity) {
            super(memberTypeSelectActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MemberTypeSelectActivity memberTypeSelectActivity, Message message) {
            if (message.what != 100) {
                return;
            }
            Object obj = message.obj;
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("PRODUCTS");
                int i = bundle.getInt("MEMBER_TYPE_SELECT_INDEX", -1);
                ReleaseLogUtil.d("R_MemberTypeSelectActivity", "update index: ", Integer.valueOf(i));
                if (njy.c(parcelableArrayList, i)) {
                    ObserverManagerUtil.e("MEMBER_TYPE_TAG_", Integer.valueOf(i));
                    memberTypeSelectActivity.aj = (Product) parcelableArrayList.get(i);
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        memberTypeSelectActivity.f((Product) null);
                    } else {
                        memberTypeSelectActivity.f((Product) parcelableArrayList.get(0));
                    }
                    memberTypeSelectActivity.c(memberTypeSelectActivity.aj);
                    memberTypeSelectActivity.d(memberTypeSelectActivity.aj);
                    memberTypeSelectActivity.l();
                }
                if (i < 0 || memberTypeSelectActivity.q == null) {
                    return;
                }
                memberTypeSelectActivity.q.putExtra("MEMBER_TYPE_SELECT_INDEX", i);
                memberTypeSelectActivity.setResult(-1, memberTypeSelectActivity.q);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Product product) {
        String memberPackagePadImageUrl;
        if (this.x == null || this.as == null || this.aq == null || this.v == null || this.t) {
            return;
        }
        if (product == null) {
            memberPackagePadImageUrl = "";
        } else {
            memberPackagePadImageUrl = this.y ? product.getMemberPackagePadImageUrl() : product.getMemberPackageImageUrl();
        }
        if (TextUtils.isEmpty(memberPackagePadImageUrl)) {
            p();
        } else {
            ReleaseLogUtil.d("R_MemberTypeSelectActivity", "updateMemberCardImage imageUrl: ", memberPackagePadImageUrl);
            this.v.setVisibility(8);
            this.as.setVisibility(8);
            this.aq.setVisibility(8);
            b(memberPackagePadImageUrl);
        }
        this.t = true;
    }

    private void b(final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: vye
            @Override // java.lang.Runnable
            public final void run() {
                this.f51690a.c(str);
            }
        });
    }

    public /* synthetic */ void c(String str) {
        final Drawable drawableB = qqf.b(this.h, str);
        HandlerExecutor.c(new Runnable() { // from class: vyi
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(drawableB);
            }
        });
    }

    public /* synthetic */ void a(Drawable drawable) {
        c(0);
        if (drawable == null) {
            ReleaseLogUtil.e("R_MemberTypeSelectActivity", "bg drawable is null");
        } else {
            this.x.setImageDrawable(drawable);
        }
    }

    private void p() {
        int i;
        ReleaseLogUtil.d("R_MemberTypeSelectActivity", "setupFallbackCardStyle");
        this.v.setVisibility(0);
        this.as.setVisibility(0);
        this.aq.setVisibility(0);
        if (this.p) {
            i = this.y ? R.drawable.ic_health_vip_premium_card_pad : R.drawable.ic_health_vip_premium_card_phone;
        } else {
            i = this.y ? R.drawable.ic_health_vip_default_card_pad : R.drawable.ic_health_vip_default_card_phone;
        }
        this.x.setImageResource(i);
        Context contextB = BaseApplication.b();
        if (this.p) {
            this.v.setImageResource(this.s ? R.drawable.ic_premium_on : R.drawable.ic_premium_off);
            this.as.setText(R.string.IDS_guardian_service);
            this.as.setTextColor(ContextCompat.getColor(contextB, R.color.color_vip_fallback_subtitle_title));
            this.aq.setText(getResources().getString(R.string.IDS_benifit_tip, "|", "24"));
            this.aq.setTextColor(ContextCompat.getColor(contextB, R.color.color_vip_fallback_subtitle_title));
        } else {
            this.v.setImageResource(irz.i() ? R.drawable.ic_vip_on : R.drawable.ic_vip_off);
            this.as.setText(R.string.IDS_member_life);
            this.as.setTextColor(ContextCompat.getColor(contextB, R.color.color_member_fallback_subtitle_title));
            this.aq.setText(R.string.IDS_vip_card_title_default);
            this.aq.setTextColor(ContextCompat.getColor(contextB, R.color.color_member_fallback_subtitle_title));
        }
        c(0);
    }

    private void a() {
        ((PayApi) Services.b("TradeService", PayApi.class)).queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: vyg
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f51693c.c(i, obj);
            }
        });
    }

    public /* synthetic */ void c(int i, Object obj) {
        if (i != 0 || !(obj instanceof RepeatResourceBenefitInfo)) {
            ReleaseLogUtil.a("MemberTypeSelectActivity", "getExclusiveStatus error", Integer.valueOf(i));
            this.s = false;
            this.g = null;
        } else {
            LogUtil.a("MemberTypeSelectActivity", "getExclusiveStatus onSuccess: ", obj);
            RepeatResourceBenefitInfo repeatResourceBenefitInfo = (RepeatResourceBenefitInfo) obj;
            this.g = repeatResourceBenefitInfo;
            this.s = c(repeatResourceBenefitInfo);
            this.r = fca.e(this.g);
        }
    }

    private boolean c(RepeatResourceBenefitInfo repeatResourceBenefitInfo) {
        Long expireTime;
        return repeatResourceBenefitInfo != null && (expireTime = repeatResourceBenefitInfo.getExpireTime()) != null && expireTime.longValue() > 0 && expireTime.longValue() > repeatResourceBenefitInfo.getNowTime();
    }

    private void b() {
        this.u = false;
        Runnable runnable = new Runnable() { // from class: vya
            @Override // java.lang.Runnable
            public final void run() {
                this.f51688b.d();
            }
        };
        this.ai = runnable;
        HandlerExecutor.c(runnable, 5000L);
        ((PayApi) Services.b("TradeService", PayApi.class)).queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: vyb
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.e(i, obj);
            }
        });
    }

    public /* synthetic */ void d() {
        if (this.u) {
            return;
        }
        this.u = true;
        qpx.e(this.h, qre.f(R.string.IDS_benefit_activating_loading));
    }

    public /* synthetic */ void e(int i, Object obj) {
        if (this.u) {
            return;
        }
        this.u = true;
        if (this.ai != null) {
            HandlerExecutor.a().removeCallbacks(this.ai);
        }
        if (i != 0 || !(obj instanceof RepeatResourceBenefitInfo)) {
            ReleaseLogUtil.a("MemberTypeSelectActivity", "queryBenefitInfo error, resultCode: ", Integer.valueOf(i));
            qpx.e(this.h, qre.f(R.string.IDS_benefit_activating_loading));
        } else {
            LogUtil.a("MemberTypeSelectActivity", "queryBenefitInfo onSuccess: result ", obj);
            e(((RepeatResourceBenefitInfo) obj).getExpireTime());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void e(final Long l) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: vyh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51694c.e(l);
                }
            });
            return;
        }
        qpx.e(this.h, qre.a(R.string.IDS_benefit_activate_content_duration, DateFormatUtil.d(l.longValue(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Product product) {
        if (product == null) {
            LogUtil.j("MemberTypeSelectActivity", "product is null");
            return;
        }
        LogUtil.a("MemberTypeSelectActivity", "now product is ", product.toString());
        List<Product> giveaways = product.getGiveaways();
        if (njy.b(giveaways)) {
            c(product, giveaways);
        } else {
            e(product);
        }
    }

    private void c(Product product, List<Product> list) {
        this.ae.setVisibility(8);
        this.ag.setVisibility(8);
        View view = this.n;
        if (view != null) {
            view.setVisibility(0);
        }
        if (njy.e(list)) {
            this.k.setVisibility(8);
        } else {
            this.m.a(list);
            this.k.setVisibility(0);
            if (list.size() > 2) {
                int iB = (int) (((double) qre.b(R.dimen.health_common_72dp)) * 2.3d);
                ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
                layoutParams.height = iB;
                this.k.setLayoutParams(layoutParams);
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.k.getLayoutParams();
                layoutParams2.height = -2;
                this.k.setLayoutParams(layoutParams2);
            }
        }
        if (this.f != null) {
            String strB = b(product);
            if (TextUtils.isEmpty(strB)) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                this.f.setText(strB);
            }
        }
    }

    private void e(Product product) {
        View view = this.n;
        if (view != null) {
            view.setVisibility(8);
        }
        if (TextUtils.isEmpty(product.getProductDesc())) {
            this.ae.setVisibility(8);
            this.ag.setVisibility(8);
        } else {
            this.ae.setVisibility(0);
            this.ag.setVisibility(0);
            h(product);
        }
    }

    private void h(Product product) {
        if (product.getPurchasePolicy() != Product.SUBSCRIPTION_PURCHASE_FLAG) {
            qsp.a(this.ag, product.getProductDesc(), true);
            this.ae.setOnClickListener(null);
            return;
        }
        String str = product.getProductDesc() + " .";
        SpannableString spannableString = new SpannableString(str);
        Drawable drawableA = a(BaseApplication.b());
        drawableA.setBounds(0, 0, drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight());
        qri.d(spannableString, str.length() - 1, str.length(), new fud(drawableA));
        qsp.a(this.ag, spannableString, true);
        this.ae.setOnClickListener(new View.OnClickListener() { // from class: vyj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberTypeSelectActivity.d(view);
            }
        });
    }

    public static /* synthetic */ void d(View view) {
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vip?isImmerse&h5pro=true&pName=com.huawei.health&path=CancelService&urlType=4");
        }
    }

    private Drawable a(Context context) {
        Drawable drawable = getResources().getDrawable(qrs.x(context) ? com.huawei.health.servicesui.R.drawable.ic_question_dark_xxxhdpi : com.huawei.health.servicesui.R.drawable.ic_question_xxxhdpi);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        return LanguageUtil.ba(BaseApplication.b()) ? qqz.e(context, drawable) : drawable;
    }

    private String b(Product product) {
        if (!TextUtils.isEmpty(product.getGiveawayDesc())) {
            return product.getGiveawayDesc();
        }
        return "";
    }

    private void q() {
        View viewFindViewById = findViewById(R.id.member_type_drag_view);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.activity_member_type_select_content);
        if (viewFindViewById == null) {
            return;
        }
        LogUtil.a("MemberTypeSelectActivity", "setCenterCardLayout() start process.");
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (qrs.af(this.h)) {
                if (viewGroup instanceof LinearLayout) {
                    ((LinearLayout) viewGroup).setGravity(17);
                }
                int i = qrs.i(this.h);
                int iG = qrs.g(this.h);
                int iB = qre.b(R.dimen.health_common_480dp);
                if (i <= iB) {
                    iB = i - (qre.b(R.dimen.health_common_32dp) * 2);
                }
                layoutParams2.width = iB;
                layoutParams2.height = (int) (((double) Math.min(i, iG)) * 0.9d);
                LogUtil.a("MemberTypeSelectActivity", "setCenterCardLayout() Widescreen Config windowWidth: " + i + ", windowHeight: " + iG + ", target width: " + layoutParams2.width + ", target height: " + layoutParams2.height);
            } else {
                if (viewGroup instanceof LinearLayout) {
                    ((LinearLayout) viewGroup).setGravity(80);
                }
                layoutParams2.height = -2;
                layoutParams2.width = -1;
                LogUtil.a("MemberTypeSelectActivity", "setCenterCardLayout() Normal Screen Config");
            }
            LogUtil.a("MemberTypeSelectActivity", "setCenterCardLayout() success. Final layout params applied -> width: " + layoutParams2.width + ", height: " + layoutParams2.height + ", topMargin: " + layoutParams2.topMargin + ", gravity: " + layoutParams2.gravity);
            viewFindViewById.setLayoutParams(layoutParams2);
        }
    }

    private void k() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.member_type_drag_view);
        if (viewGroup == null) {
            return;
        }
        final float fA = qre.a(R.dimen.emui_text_size_headline6_medium);
        viewGroup.setOutlineProvider(new ViewOutlineProvider() { // from class: com.huawei.ui.main.stories.member.MemberTypeSelectActivity.4
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                int width = view.getWidth();
                int height = view.getHeight();
                if (qrs.af(MemberTypeSelectActivity.this.h)) {
                    outline.setRoundRect(0, 0, width, height, fA);
                } else {
                    float f = fA;
                    outline.setRoundRect(0, 0, width, height + ((int) (2.0f * f)), f);
                }
            }
        });
        viewGroup.setClipToOutline(true);
    }
}
