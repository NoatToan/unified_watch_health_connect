package com.huawei.health.routeradapter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.fua;
import defpackage.iov;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class TradeOrderDetailPretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        ReleaseLogUtil.d("TradeOrderDetailPretreatmentService", "onPretreatment");
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.j("TradeOrderDetailPretreatmentService", "onPretreatment uri is null!");
            return true;
        }
        String string = guidepost.d().getString("orderCode");
        LogUtil.a("TradeOrderDetailPretreatmentService", "onPretreatment orderCode", string, " uri ", uriO);
        if (!uriO.toString().contains("TradeOrderDetailActivity") || TextUtils.isEmpty(string) || Utils.o() || !fua.n()) {
            return true;
        }
        iov.b(context, ArkUIXConstants.ORDER_DETAIL, "23", string);
        return false;
    }
}
