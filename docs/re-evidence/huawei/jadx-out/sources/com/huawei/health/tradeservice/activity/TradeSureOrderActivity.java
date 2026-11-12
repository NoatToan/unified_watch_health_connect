package com.huawei.health.tradeservice.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.tradeservice.R;
import com.huawei.health.tradeservice.cloud.ProductManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.Product;
import com.huawei.trade.datatype.TimeLimitedPromotion;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ilx;
import defpackage.ily;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes32.dex */
public class TradeSureOrderActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f10263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f10264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f10265c;
    private Handler d;
    private LinearLayout e;
    private HealthTextView f;
    private String g;
    private ImageView h;
    private String i;
    private HealthTextView j;
    private View k;
    private RelativeLayout l;
    private ilx m;
    private HealthButton n;
    private Product o;
    private HealthTextView q;
    private HealthTextView t;

    static class d extends BaseHandler<TradeSureOrderActivity> {
        d(TradeSureOrderActivity tradeSureOrderActivity) {
            super(tradeSureOrderActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TradeSureOrderActivity tradeSureOrderActivity, Message message) {
            int i = message.what;
            if (i == 1101) {
                tradeSureOrderActivity.c();
            } else if (i == 1102) {
                tradeSureOrderActivity.d();
            } else {
                LogUtil.j("TradeInformationLayout", "handleMessageWhenReferenceNotNull not match ");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sure_trade_order);
        if (getIntent() == null) {
            LogUtil.j("TradeInformationLayout", "getIntent() = null");
            finish();
            return;
        }
        this.g = getIntent().getStringExtra("productId");
        this.i = getIntent().getStringExtra("productInfo");
        this.d = new d(this);
        this.f10265c = this;
        a();
        b();
    }

    private void a() {
        this.k = findViewById(R.id.rl_hint);
        this.h = (ImageView) findViewById(R.id.img_goods);
        this.q = (HealthTextView) findViewById(R.id.tv_show_price);
        this.j = (HealthTextView) findViewById(R.id.tv_procuct_name);
        this.n = (HealthButton) findViewById(R.id.btn_submit);
        this.t = (HealthTextView) findViewById(R.id.tv_pay_price);
        this.f10264b = (HealthTextView) findViewById(R.id.tv_end_time);
        this.f10263a = (HealthTextView) findViewById(R.id.tv_lin_price);
        this.f10264b.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.l = (RelativeLayout) findViewById(R.id.rl_content);
        this.f = (HealthTextView) findViewById(R.id.tv_show_quantity);
        this.e = (LinearLayout) findViewById(R.id.lin_countdown);
        this.n.setOnClickListener(this);
    }

    private void b() {
        if (!CommonUtil.ab(this.f10265c.getApplicationContext())) {
            d();
        } else {
            ProductManager.getProductDetails(this.g, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.activity.TradeSureOrderActivity.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i != 0 || !(obj instanceof Product)) {
                        LogUtil.j("TradeInformationLayout", "getProductSummaryInfo fail errorCode = ", Integer.valueOf(i));
                        TradeSureOrderActivity.this.d.sendEmptyMessage(1102);
                    } else {
                        LogUtil.j("TradeInformationLayout", "getProductInfo success");
                        TradeSureOrderActivity.this.o = (Product) obj;
                        TradeSureOrderActivity.this.d.sendEmptyMessage(1101);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.l.setVisibility(0);
        this.k.setVisibility(8);
        this.f.setText(String.format(getString(R.string.IDS_quantity), 1));
        qqf.a(this.o.getProductUrl(), this.h, (int) BaseApplication.b().getResources().getDimension(com.huawei.ui.commonui.R.dimen.defaultCornerRadiusM));
        this.j.setText(this.o.getProductName());
        double microPrice = this.o.getMicroPrice() / 1000000.0f;
        String currency = this.o.getCurrency();
        String strC = ily.c(currency, microPrice);
        this.q.setText(strC);
        ily.b(strC, ily.e(currency), this.t);
        b(this.o.getGiveaways());
        c(currency);
    }

    private void c(String str) {
        TimeLimitedPromotion promotion = this.o.getPromotion();
        this.e.setVisibility(8);
        if (promotion != null && promotion.getMicroOriginPrice() > 0) {
            this.f10263a.setText(ily.c(str, promotion.getMicroOriginPrice() / 1000000.0f));
            this.f10263a.getPaint().setFlags(16);
        }
        if (this.o.getSaleTime() - this.o.getNowTime() > 0) {
            this.e.setVisibility(0);
            String strD = UnitUtil.d("yyyy/MM/dd HH:mm:ss", this.o.getSaleTime());
            ily.a(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_expected_sale), strD), strD, this.f10264b, R.color.emui_accent);
            return;
        }
        TimeLimitedPromotion promotion2 = this.o.getPromotion();
        if (promotion2 == null) {
            LogUtil.a("TradeInformationLayout", "do not need show promotin");
            return;
        }
        long promotionEndTime = promotion2.getPromotionEndTime() - this.o.getNowTime();
        if (promotionEndTime > 0) {
            this.e.setVisibility(0);
            ilx ilxVar = new ilx(this.d, this.f10264b, promotionEndTime);
            this.m = ilxVar;
            ilxVar.d();
        }
    }

    private void b(List<Product> list) {
        if (njy.e(list)) {
            LogUtil.a("TradeInformationLayout", "giveaways is empty");
            return;
        }
        ViewStub viewStub = (ViewStub) findViewById(R.id.viewstub_giveaway);
        if (qrs.u()) {
            viewStub = (ViewStub) findViewById(R.id.viewstub_giveaway_large);
        }
        viewStub.inflate();
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.tv_giveaway_title);
        healthTextView.setText(LanguageUtil.l(this.f10265c) ? "【" + this.f10265c.getString(R.string.IDS_giveaway) + "】" : this.f10265c.getString(R.string.IDS_giveaway));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.lin_giveaway);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.lin_combine_product);
        linearLayout.removeAllViews();
        for (Product product : list) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, qrs.d((Context) this, 32.0f));
            View viewInflate = View.inflate(this, R.layout.trade_giveaway_item_sure, null);
            if (qrs.u()) {
                viewInflate = View.inflate(this, R.layout.trade_giveaway_item_sure_large, null);
            }
            HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.tv_giveaway_name);
            ((HealthTextView) viewInflate.findViewById(R.id.tv_giveaway_quantity)).setText(String.format(getString(R.string.IDS_quantity), 1));
            healthTextView2.setText(product.getProductName());
            viewInflate.setLayoutParams(layoutParams);
            if (TextUtils.equals(product.getAttachType(), "giveaway")) {
                healthTextView.setVisibility(0);
                linearLayout.addView(viewInflate);
            } else {
                linearLayout2.addView(viewInflate);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.e(view)) {
            LogUtil.j("TradeInformationLayout", "button click too fast");
            return;
        }
        if (view.getId() == R.id.rl_hint) {
            b();
        } else if (view.getId() == R.id.btn_submit) {
            e();
        } else {
            LogUtil.j("TradeInformationLayout", "onClick not match");
        }
    }

    private void e() {
        ((PayApi) Services.d("TradeService", PayApi.class)).buyByProductId(this, 0, this.i);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.l.setVisibility(8);
        this.k.setVisibility(0);
        this.k.setOnClickListener(this);
        ((HealthTextView) findViewById(R.id.tv_hint)).setText(getString(R.string.IDS_hwh_home_healthshop_no_net_work_pls_click_again));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ilx ilxVar = this.m;
        if (ilxVar != null) {
            ilxVar.a();
        } else {
            LogUtil.j("TradeInformationLayout", "mTimeUtils = null");
        }
        LogUtil.a("TradeInformationLayout", "onDestroy");
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
