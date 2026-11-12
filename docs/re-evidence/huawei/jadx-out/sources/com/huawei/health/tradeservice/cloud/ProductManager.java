package com.huawei.health.tradeservice.cloud;

import android.text.TextUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.CloudParamKeys;
import defpackage.ily;
import defpackage.pjn;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes32.dex */
public class ProductManager {
    private static final String R_TAG = "R_TradeService_ProductManager";
    private static final String TAG = "TradeService_ProductManager";

    private ProductManager() {
    }

    public static void getProductSummaryInfo(String str, int i, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "getProductSummaryInfo enter");
        if (TextUtils.isEmpty(str) || i < 0) {
            ReleaseLogUtil.e(R_TAG, "resId is ", str, " resType is ", Integer.valueOf(i));
            iBaseResponseCallback.a(-1, null);
            return;
        }
        HashMap<String, String> map = new HashMap<>(16);
        map.put(CloudParamKeys.CLIENT_TYPE, String.valueOf(ily.a()));
        map.put("territory", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        map.put("locale", pjn.b(null));
        map.put("resType", String.valueOf(i));
        map.put("resId", str);
        TradeServiceCloudMgr.getInstance().getProductInfo(new ProductInfoReq(), map, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.ProductManager.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d(ProductManager.R_TAG, "getProductSummaryInfo, errCode is ", Integer.valueOf(i2));
                if (obj instanceof ProductInfoRsp) {
                    iBaseResponseCallback.a(0, ((ProductInfoRsp) obj).getProductSummaryList());
                } else {
                    iBaseResponseCallback.a(i2, null);
                }
            }
        });
    }

    public static void getProductDetails(String str, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "getProductDetails enter");
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d(R_TAG, "productId is ", str);
            iBaseResponseCallback.a(-1, null);
            return;
        }
        HashMap<String, String> map = new HashMap<>(16);
        map.put(CloudParamKeys.CLIENT_TYPE, String.valueOf(ily.a()));
        map.put("country", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        map.put("language", pjn.b(null));
        map.put("productId", str);
        TradeServiceCloudMgr.getInstance().productQueryDetails(new ProductDetailsReq(), map, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.ProductManager.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d(ProductManager.R_TAG, "getProductDetails, errCode is ", Integer.valueOf(i));
                if (obj instanceof ProductDetailsRsp) {
                    iBaseResponseCallback.a(0, ((ProductDetailsRsp) obj).getProductInfo());
                } else {
                    iBaseResponseCallback.a(i, null);
                }
            }
        });
    }
}
