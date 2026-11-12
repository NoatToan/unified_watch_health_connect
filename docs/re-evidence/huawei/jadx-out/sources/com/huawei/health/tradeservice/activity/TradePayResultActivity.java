package com.huawei.health.tradeservice.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.tradeservice.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.trade.datatype.PayLoadBean;
import com.huawei.trade.datatype.PayRequest;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.fua;
import defpackage.ily;
import defpackage.iov;
import defpackage.lmf;
import defpackage.qjs;
import defpackage.qrs;
import health.compact.a.LogUtil;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class TradePayResultActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f10260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f10261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTitleBar f10262c;
    private Context d;
    private LinearLayout e;
    private HealthButton f;
    private String g;
    private HealthTextView h;
    private PayLoadBean i;
    private View j;
    private HealthButton k;
    private HealthTextView m;
    private PayRequest n;
    private String o;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pay_success);
        this.d = this;
        d();
        a();
    }

    private void d() {
        this.f10262c = (CustomTitleBar) findViewById(R.id.trade_titlebar);
        this.j = findViewById(R.id.rl_hint);
        this.f10260a = (ImageView) findViewById(R.id.img_hint);
        this.h = (HealthTextView) findViewById(R.id.tv_hint);
        this.f10261b = (LinearLayout) findViewById(R.id.lin_content);
        this.m = (HealthTextView) findViewById(R.id.tv_price);
        HealthButton healthButton = (HealthButton) findViewById(R.id.btn_start_train);
        this.k = healthButton;
        healthButton.setOnClickListener(this);
        HealthButton healthButton2 = (HealthButton) findViewById(R.id.btn_view_order);
        this.f = healthButton2;
        healthButton2.setOnClickListener(this);
        this.e = (LinearLayout) findViewById(R.id.column_button);
        if (qrs.af(this.d)) {
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            layoutParams.width = qjs.c(false, 3);
            this.e.setLayoutParams(layoutParams);
        }
    }

    private void a() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            LogUtil.e("TradePayResultActivity", "intent = null");
            b();
            return;
        }
        int i = extras.getInt("shoppingResult", -1);
        LogUtil.b("TradePayResultActivity", "requestCode:", Integer.valueOf(i));
        if (i != 0) {
            LogUtil.e("TradePayResultActivity", "requestCode is not ok");
            b();
            return;
        }
        this.g = extras.getString("orderCode");
        String string = extras.getString("payRequest");
        Gson gson = new Gson();
        try {
            PayRequest payRequest = (PayRequest) gson.fromJson(string, PayRequest.class);
            this.n = payRequest;
            if (payRequest == null) {
                LogUtil.e("TradePayResultActivity", "mPayRequest = null");
                b();
            } else {
                this.o = payRequest.getProductId();
                this.i = (PayLoadBean) gson.fromJson(this.n.getPayLoad(), PayLoadBean.class);
                e();
            }
        } catch (JsonSyntaxException unused) {
            LogUtil.d("TradePayResultActivity", "initData JsonSyntaxException");
            b();
        }
    }

    private void e() {
        if (this.n == null) {
            LogUtil.e("TradePayResultActivity", "mPayRequest = null");
            b();
        } else {
            this.m.setText(String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_trade_amount), ily.c(this.i.getCurrency(), this.i.getMicroPrice() / 1000000.0f)));
            c();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null || qrs.r()) {
            LogUtil.e("TradePayResultActivity", "onClick view is null or isFaskClick");
            return;
        }
        int id = view.getId();
        if (id == R.id.btn_start_train) {
            finish();
            return;
        }
        if (id != R.id.btn_view_order) {
            LogUtil.b("TradePayResultActivity", "onClick not match");
            return;
        }
        if (!Utils.o() && fua.n()) {
            iov.b(this.d, ArkUIXConstants.ORDER_DETAIL, "23", this.g);
        } else {
            Intent intent = new Intent(this, (Class<?>) TradeOrderDetailActivity.class);
            intent.putExtra("orderCode", this.g);
            intent.putExtra("productId", this.o);
            intent.putExtra("pageFrom", true);
            this.d.startActivity(intent);
        }
        finish();
    }

    private void b() {
        this.f10262c.setTitleText(getString(R.string.IDS_trade_fail));
        this.f10261b.setVisibility(8);
        this.j.setVisibility(0);
        this.f10260a.setOnClickListener(this);
        this.h.setText(getString(R.string.IDS_system_error));
    }

    private void c() {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("type", this.i.getType());
        map.put("name", this.i.getProductName());
        map.put(ParsedFieldTag.PRICE, String.valueOf(this.i.getMicroPrice() / 1000000.0f));
        map.put("id", this.i.getProductId());
        map.put("discountPeriod", ily.c());
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.TRADE_PAY_SUCCESS.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
