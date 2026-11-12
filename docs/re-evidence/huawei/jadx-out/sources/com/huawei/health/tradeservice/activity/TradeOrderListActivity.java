package com.huawei.health.tradeservice.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.tradeservice.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.TradeViewApi;
import com.huawei.ui.commonui.base.BaseActivity;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes2.dex */
public class TradeOrderListActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f10259a;
    private Context e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_order_list);
        clearBackgroundDrawable();
        this.e = this;
        d();
        c();
    }

    private void d() {
        this.f10259a = (LinearLayout) findViewById(R.id.lin_content);
    }

    private void c() {
        LogUtil.a("TradeOrderListActivity", "addTradeView");
        this.f10259a.removeAllViews();
        Intent intent = getIntent();
        int intExtra = intent != null ? intent.getIntExtra("PAGE_TYPE", 1) : 1;
        LogUtil.a("TradeOrderListActivity", "pageType = ", Integer.valueOf(intExtra));
        TradeViewApi tradeViewApi = (TradeViewApi) Services.d("TradeService", TradeViewApi.class);
        if (tradeViewApi == null) {
            LogUtil.e("TradeOrderListActivity", "tradeViewApi is null.");
            return;
        }
        View orderVeiw = tradeViewApi.getOrderVeiw(this.e, intExtra);
        orderVeiw.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f10259a.addView(orderVeiw);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
