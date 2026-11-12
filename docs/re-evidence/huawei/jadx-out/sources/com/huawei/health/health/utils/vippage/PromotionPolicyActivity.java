package com.huawei.health.health.utils.vippage;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.vippage.PromotionPolicyActivity;
import com.huawei.health.marketing.datatype.RcmItem;
import com.huawei.health.servicesui.R;
import com.huawei.health.vip.datatypes.PromotionPolicyCacheInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.Product;
import com.huawei.trade.datatype.ProductInfo;
import com.huawei.trade.datatype.PromotionPolicyInfo;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.bottomsheet.HealthBottomSheet;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet;
import defpackage.coq;
import defpackage.fca;
import defpackage.lmf;
import defpackage.qqf;
import defpackage.qqt;
import defpackage.qrs;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class PromotionPolicyActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthBottomSheet f7103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Product f7104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f7105c;
    private ImageView d;
    private HealthTextView e;
    private PromotionPolicyInfo f;
    private String g = "";
    private HealthTextView h;
    private RelativeLayout i;
    private HealthTextView j;

    public static /* synthetic */ void c(View view) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseActivity.setDisplaySideMode(this);
        setBackgroundDrawableResource(R.color.common_black_20alpha);
        setContentView(R.layout.activity_vip_promotion_dialog);
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("PromotionPolicyActivity", "intent is null");
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("promotionPolicyInfo");
        this.g = intent.getStringExtra("showPage");
        LogUtil.a("PromotionPolicyActivity", "promotionInfoStr = ", stringExtra);
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.j("PromotionPolicyActivity", "promotionInfoStr is empty");
            finish();
            return;
        }
        try {
            this.f = (PromotionPolicyInfo) new Gson().fromJson(stringExtra, PromotionPolicyInfo.class);
            h();
            ThreadPoolManager.c().execute(new Runnable() { // from class: fcg
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b();
                }
            });
            b(0);
            j();
        } catch (JsonSyntaxException unused) {
            LogUtil.e("PromotionPolicyActivity", "parse (JsonSyntaxException");
            finish();
        }
    }

    public /* synthetic */ void b() {
        a(this.f.getProductId());
    }

    private void h() {
        this.i = (RelativeLayout) findViewById(R.id.vip_promotion_drag_view);
        this.d = (ImageView) findViewById(R.id.vip_promotion_bg);
        this.f7105c = (HealthTextView) findViewById(R.id.vip_promotion_renew_btn);
        this.j = (HealthTextView) findViewById(R.id.title);
        this.h = (HealthTextView) findViewById(R.id.sub_title);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.vip_promotion_agreement_text);
        this.e = healthTextView;
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        f();
        this.j.setText(this.f.getDialogTitle());
        this.h.setText(this.f.getDialogSubTitle());
        this.f7105c.setText(this.f.getDialogButtonName());
        this.e.setText(fca.d(true));
        a();
        e();
    }

    private void a() {
        HealthBottomSheet healthBottomSheet = (HealthBottomSheet) findViewById(R.id.vip_promotion_sliding_layout);
        this.f7103a = healthBottomSheet;
        if (healthBottomSheet == null) {
            return;
        }
        healthBottomSheet.setIndicateSafeInsetsEnabled(true);
        this.f7103a.setForceShowIndicateEnabled(false);
        this.f7103a.setSheetHeight(0);
        this.f7103a.b(new HwBottomSheet.SheetSlideListener() { // from class: com.huawei.health.health.utils.vippage.PromotionPolicyActivity.1
            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetSlide(View view, float f) {
            }

            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetStateChanged(View view, HwBottomSheet.SheetState sheetState, HwBottomSheet.SheetState sheetState2) {
                if (sheetState2 == HwBottomSheet.SheetState.COLLAPSED || sheetState2 == HwBottomSheet.SheetState.HIDDEN) {
                    PromotionPolicyActivity.this.c();
                }
            }
        });
    }

    private void e() {
        findViewById(R.id.vip_promotion_content).setOnClickListener(new View.OnClickListener() { // from class: fcf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33851c.e(view);
            }
        });
        findViewById(R.id.vip_promotion_drag_view).setOnClickListener(new View.OnClickListener() { // from class: fch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromotionPolicyActivity.c(view);
            }
        });
        this.f7105c.setOnClickListener(new View.OnClickListener() { // from class: fcj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33852a.a(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        c();
    }

    public /* synthetic */ void a(View view) {
        d();
        b(1);
    }

    private void j() {
        PromotionPolicyCacheInfo promotionPolicyCacheInfoD = fca.d();
        int lastPolicyShowCount = promotionPolicyCacheInfoD.getLastPolicyShowCount();
        if (TextUtils.equals(this.f.getPromotionPolicyId(), promotionPolicyCacheInfoD.getPolicyId())) {
            promotionPolicyCacheInfoD.setLastPolicyShowCount(lastPolicyShowCount + 1);
        } else {
            promotionPolicyCacheInfoD.setLastPolicyShowCount(1);
            promotionPolicyCacheInfoD.setPolicyId(this.f.getPromotionPolicyId());
        }
        promotionPolicyCacheInfoD.setLastShowTime(System.currentTimeMillis());
        SharedPreferenceManager.c(Integer.toString(10000), "SHOW_PROMOTION_DIALOG", qqt.b(promotionPolicyCacheInfoD));
    }

    private void d() {
        ProductInfo productInfoE = fca.e(this.f7104b);
        productInfoE.setProductId(this.f.getProductId());
        productInfoE.setPromotionPolicyId(this.f.getPromotionPolicyId());
        productInfoE.setPromotionId(this.f.getPromotionId());
        productInfoE.setTrigResName(this.f.getPromotionId());
        productInfoE.setTrigResType("1010");
        Product product = this.f7104b;
        if (product == null || product.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG) {
            fca.e(this, this.f7104b, productInfoE);
        } else {
            fca.c(this, productInfoE);
        }
    }

    private void b(final int i) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.health.utils.vippage.PromotionPolicyActivity.2
            @Override // java.lang.Runnable
            public void run() {
                HashMap map = new HashMap();
                map.put("click", 1);
                map.put("type", 1);
                map.put("event", Integer.valueOf(i));
                map.put("showPage", "false");
                if (!TextUtils.isEmpty(PromotionPolicyActivity.this.g)) {
                    map.put("showPage", PromotionPolicyActivity.this.g);
                }
                PromotionPolicyActivity.this.e(map);
                if (PromotionPolicyActivity.this.f != null) {
                    String promotionId = PromotionPolicyActivity.this.f.getPromotionId();
                    if (promotionId != null) {
                        map.put("resourceId", promotionId);
                    } else {
                        LogUtil.j("PromotionPolicyActivity", "getPromotionId() is null");
                        map.put("resourceId", "");
                    }
                }
                lmf.d().c(PromotionPolicyActivity.this, AnalyticsValue.VIP_RENEW_REMIND_DIALOG_EVENT.value(), map, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Map<String, Object> map) {
        List<RcmItem> dialogRecommendList;
        if (map == null) {
            return;
        }
        if (qrs.af(this)) {
            dialogRecommendList = this.f.getTahitiDialogRecommendList();
        } else {
            dialogRecommendList = this.f.getDialogRecommendList();
        }
        LogUtil.d("PromotionPolicyActivity", "fillRecommendInfo recommendList : ", dialogRecommendList);
        if (coq.d(dialogRecommendList)) {
            map.put("smartRecommend", false);
            return;
        }
        map.put("smartRecommend", true);
        RcmItem rcmItem = dialogRecommendList.get(0);
        if (rcmItem == null || TextUtils.isEmpty(rcmItem.getAlgId())) {
            map.put("algId", "");
        } else {
            map.put("algId", rcmItem.getAlgId());
        }
    }

    private void g() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.health.utils.vippage.PromotionPolicyActivity.5
            @Override // java.lang.Runnable
            public void run() {
                HashMap map = new HashMap();
                map.put("name", PromotionPolicyActivity.this.f.getDialogButtonName());
                map.put("payResourceType", "弹窗到期提醒");
                map.put("ActivationMode", 2);
                map.put("from", 6);
                lmf.d().c(BaseApplication.b(), AnalyticsValue.VIP_RENEWAL_PAY_SUCCESS_EVENT.value(), map, 0);
            }
        });
    }

    private void f() {
        String dialogPicUrl;
        if (qrs.af(this)) {
            dialogPicUrl = this.f.getTahitiDialogPicUrl();
        } else {
            dialogPicUrl = this.f.getDialogPicUrl();
        }
        float dimensionPixelOffset = BaseApplication.b().getResources().getDimensionPixelOffset(R.dimen.emui_corner_radius_dialog);
        qqf.b(dialogPicUrl, this.d, dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("PromotionPolicyActivity", "hide");
        finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    private void a(String str) {
        ((PayApi) Services.b("TradeService", PayApi.class)).getProductDetails(str, new d(this));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        f();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("PromotionPolicyActivity", "onActivityResult requestCode: ", Integer.valueOf(i));
        if (intent == null) {
            LogUtil.a("PromotionPolicyActivity", "onActivityResult data: ", intent);
            return;
        }
        int intExtra = intent.getIntExtra("shoppingResult", -1);
        LogUtil.a("PromotionPolicyActivity", "onActivityResult shoppingResult: ", Integer.valueOf(intExtra));
        if (intExtra != 0) {
            return;
        }
        ObserverManagerUtil.e("USER_MEMBER_INFO_UPDATE", true);
        g();
        finish();
    }

    public static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<PromotionPolicyActivity> f7109c;

        d(PromotionPolicyActivity promotionPolicyActivity) {
            this.f7109c = new WeakReference<>(promotionPolicyActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i != 0) {
                LogUtil.j("PromotionPolicyActivity", "getProductDetails failed, errorCode:", Integer.valueOf(i));
                return;
            }
            if (!(obj instanceof Product)) {
                LogUtil.j("PromotionPolicyActivity", "getProductDetails failed, objData:", obj);
                return;
            }
            final PromotionPolicyActivity promotionPolicyActivity = this.f7109c.get();
            if (promotionPolicyActivity != null && !promotionPolicyActivity.isFinishing() && !promotionPolicyActivity.isDestroyed()) {
                promotionPolicyActivity.f7104b = (Product) obj;
                HandlerExecutor.b(new Runnable() { // from class: fci
                    @Override // java.lang.Runnable
                    public final void run() {
                        PromotionPolicyActivity promotionPolicyActivity2 = promotionPolicyActivity;
                        promotionPolicyActivity2.e.setText(fca.d(promotionPolicyActivity2.f7104b.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG));
                    }
                });
                LogUtil.a("PromotionPolicyActivity", "getProductDetails success");
                return;
            }
            LogUtil.j("PromotionPolicyActivity", "getProductDetails onResponse activity is destroy, return");
        }
    }
}
