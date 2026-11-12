package com.huawei.hms.iap;

import android.text.TextUtils;
import com.huawei.hms.iap.entity.PurchaseIntentWithPriceReq;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes34.dex */
public class o extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PurchaseIntentWithPriceReq f13591a;

    @Override // com.huawei.hms.iap.a
    protected int a() {
        if (a(this.f13591a.getReservedInfor())) {
            return Constants.HMS_VERSION_CODE_61000000;
        }
        return (c() || d()) ? 50300000 : 40002000;
    }

    private boolean d() {
        PurchaseIntentWithPriceReq purchaseIntentWithPriceReq = this.f13591a;
        if (purchaseIntentWithPriceReq == null || TextUtils.isEmpty(purchaseIntentWithPriceReq.getReservedInfor())) {
            return false;
        }
        HMSLog.i("PurchaseIntentWithPriceTaskApiCall", "reservedInfor is not empty");
        return true;
    }

    private boolean c() {
        PurchaseIntentWithPriceReq purchaseIntentWithPriceReq = this.f13591a;
        if (purchaseIntentWithPriceReq == null || TextUtils.isEmpty(purchaseIntentWithPriceReq.getSignatureAlgorithm())) {
            return false;
        }
        HMSLog.i("PurchaseIntentWithPriceTaskApiCall", "Use the SHA256WithRSA/PSS algorithm.");
        return true;
    }

    private void b() {
        if (a(this.f13591a.getReservedInfor())) {
            a(11);
        } else if (c()) {
            a(4);
        } else if (d()) {
            a(4);
        }
    }

    public o(String str, PurchaseIntentWithPriceReq purchaseIntentWithPriceReq, String str2, String str3) {
        super(str, JsonUtil.createJsonString(purchaseIntentWithPriceReq), str2, str3);
        this.f13591a = purchaseIntentWithPriceReq;
        b();
    }
}
