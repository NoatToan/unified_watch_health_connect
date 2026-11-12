package com.huawei.health.routeradapter;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.operation.utils.UriConstants;
import com.huawei.ui.main.R;
import defpackage.iov;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class OrderListPretreatmentService implements PretreatmentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8713a = "";
    private Context e;

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        if (e()) {
            b();
            return false;
        }
        c();
        return false;
    }

    private void c() {
        Intent intent = new Intent();
        intent.setClass(this.e, WebViewActivity.class);
        intent.putExtra("url", a());
        intent.putExtra("EXTRA_BI_ID", "");
        intent.putExtra("EXTRA_BI_NAME", "");
        intent.putExtra("EXTRA_BI_SOURCE", "ShopManager");
        intent.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
        intent.putExtra("title", this.e.getString(R.string.IDS_hwh_home_healthshop_featured_order_management));
        iov.d(this.e, intent);
    }

    private void b() {
        Intent intent = new Intent();
        intent.setClassName(this.e.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
        String string = IntentParams.builder().addPageId(ArkUIXConstants.ORDER).addPageType("22").addBuildConfigInfo(CommonUtil.a()).build().toString();
        LogUtil.a("OrderListPretreatmentService", "gotoOrderList params: " + string);
        intent.putExtra(e.n, string);
        intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 4);
        iov.c(this.e, intent);
    }

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
        this.e = context;
    }

    private boolean e() {
        return Process.is64Bit();
    }

    private String a() {
        if (!TextUtils.isEmpty(this.f8713a)) {
            return this.f8713a;
        }
        String string = "";
        try {
            string = OperationUtils.getVmallRules().getString("orderList");
            LogUtil.d("OrderListPretreatmentService", "orderUrl: ", string);
        } catch (JSONException unused) {
            LogUtil.j("OrderListPretreatmentService", "getShopCenterUrl JSONException.");
        }
        if (TextUtils.isEmpty(string)) {
            string = UriConstants.VMALL_URL_STRING;
        }
        String url = GRSManager.c(this.e).getUrl("healthRecommendUrl");
        if (TextUtils.isEmpty(url)) {
            LogUtil.j("OrderListPretreatmentService", "getShopCenterUrl recommendHost is empty");
            url = "https:/";
        }
        LogUtil.d("OrderListPretreatmentService", "getShopCenterUrl recommendHost = ", url);
        String str = url + string;
        this.f8713a = str;
        return str;
    }
}
