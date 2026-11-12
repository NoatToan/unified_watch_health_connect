package com.huawei.health.tradeservice.cloud;

import android.text.TextUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.TagConstants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.CloudParamKeys;
import defpackage.fod;
import defpackage.ily;
import defpackage.pjn;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class OrderManager {
    private static final String TAG = "TradeService_OrderManager";

    private OrderManager() {
    }

    public static void orderCreate(String str, Map<String, Object> map, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "orderCreate enter");
        if (TextUtils.isEmpty(str)) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        OrderCreateReq orderCreateReq = new OrderCreateReq();
        map.put(CloudParamKeys.CLIENT_TYPE, String.valueOf(ily.a()));
        map.put("country", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        map.put("productId", str);
        TradeServiceCloudMgr.getInstance().orderCreate(orderCreateReq, map, iBaseResponseCallback);
    }

    public static void orderCancel(String str, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "orderCancel enter");
        if (TextUtils.isEmpty(str)) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        OrderCancelReq orderCancelReq = new OrderCancelReq();
        orderCancelReq.setOrderCode(str);
        TradeServiceCloudMgr.getInstance().orderCancel(orderCancelReq, iBaseResponseCallback);
    }

    public static void orderQueryUnpaid(String str, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "orderQueryUnpaid enter");
        if (TextUtils.isEmpty(str)) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        HashMap<String, String> map = new HashMap<>(16);
        map.put(CloudParamKeys.CLIENT_TYPE, String.valueOf(ily.a()));
        map.put("country", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        map.put("language", pjn.b(null));
        map.put("orderCode", str);
        TradeServiceCloudMgr.getInstance().orderQueryUnpaid(new OrderUnpaidReq(), map, iBaseResponseCallback);
    }

    public static void orderReportPurchaseResult(String str, String str2, String str3, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "orderReportPurchaseResult enter");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        OrderReportResultReq orderReportResultReq = new OrderReportResultReq();
        orderReportResultReq.setOrderCode(str);
        orderReportResultReq.setPurchaseData(str2);
        orderReportResultReq.setDataSignature(str3);
        TradeServiceCloudMgr.getInstance().orderReportPurchaseResult(orderReportResultReq, iBaseResponseCallback);
    }

    public static void orderRedelivery(String str, String str2, String str3, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "orderRedelivery enter");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        OrderRedeliveryReq orderRedeliveryReq = new OrderRedeliveryReq();
        orderRedeliveryReq.setOrderCode(str);
        orderRedeliveryReq.setPurchaseData(str2);
        orderRedeliveryReq.setDataSignature(str3);
        TradeServiceCloudMgr.getInstance().orderRedelivery(orderRedeliveryReq, iBaseResponseCallback);
    }

    public static void orderQueryHistory(long j, long j2, long j3, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "orderQueryHistory enter");
        HashMap<String, String> map = new HashMap<>(16);
        map.put("language", pjn.b(null));
        if (j > 0) {
            map.put("startTime", String.valueOf(j));
        }
        if (j2 > 0) {
            map.put("endTime", String.valueOf(j2));
        }
        if (j3 > 0) {
            map.put(BleConstants.LIMIT, String.valueOf(j3));
        }
        TradeServiceCloudMgr.getInstance().orderQueryHistory(new OrderHistoryReq(), map, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.OrderManager.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof OrderHistoryRsp) {
                    iBaseResponseCallback.a(0, ((OrderHistoryRsp) obj).getHistoryOrders());
                } else {
                    iBaseResponseCallback.a(-1, null);
                }
            }
        });
    }

    public static void orderQueryDetails(String str, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "orderQueryDetails enter");
        if (TextUtils.isEmpty(str)) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        HashMap map = new HashMap(16);
        map.put("language", pjn.b(null));
        map.put("orderCode", str);
        TradeServiceCloudMgr.getInstance().orderQueryDetails(new OrderQueryDetailsReq(), ily.b((HashMap<String, String>) map), new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.OrderManager.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof OrderQueryDetailsRsp) {
                    iBaseResponseCallback.a(0, ((OrderQueryDetailsRsp) obj).getOrderDetail());
                } else {
                    iBaseResponseCallback.a(i, null);
                }
            }
        });
    }

    public static void queryAudiosPackageBySeriesId(String str, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "queryAudiosPackageBySeriesId enter");
        if (TextUtils.isEmpty(str)) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        HashMap map = new HashMap(16);
        map.put("ids", str);
        TradeServiceCloudMgr.getInstance().queryAudiosPackageBySeriesId(new OrderAudiosPackageReq(), ily.b((HashMap<String, String>) map), new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.OrderManager.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof OrderAudiosPackageRsq) {
                    iBaseResponseCallback.a(0, (OrderAudiosPackageRsq) obj);
                } else {
                    iBaseResponseCallback.a(i, null);
                }
            }
        });
    }

    public static void promotionInfoQuery(String str, String str2, String str3, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j(TAG, "promotionInfoQuery: callBack is null");
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j(TAG, "promotionInfoQuery: param is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        LogUtil.a(TAG, "promotionInfoQuery enter");
        PromotionInfoReq promotionInfoReq = new PromotionInfoReq();
        promotionInfoReq.setProductId(str);
        promotionInfoReq.setPromotionId(str2);
        promotionInfoReq.setCountry(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        promotionInfoReq.setClientType(ily.a());
        promotionInfoReq.setClientVersion(fod.e(BaseApplication.getContext()));
        if (!TextUtils.isEmpty(str3)) {
            promotionInfoReq.setPromotionPolicyId(str3);
        }
        TradeServiceCloudMgr.getInstance().promotionInfoQuery(promotionInfoReq, iBaseResponseCallback);
    }

    public static void getPromotionPolicy(final IBaseResponseCallback iBaseResponseCallback, String str) {
        if (iBaseResponseCallback == null) {
            LogUtil.j(TAG, "getPromotionPolicy: callback is null");
            return;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("territory", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        map.put(CloudParamKeys.CLIENT_TYPE, String.valueOf(ily.a()));
        map.put("clientVersion", fod.e(BaseApplication.getContext()));
        map.put("language", pjn.b(null));
        if (!TextUtils.isEmpty(str)) {
            map.put(TagConstants.SCENE_TYPE, str);
        }
        TradeServiceCloudMgr.getInstance().getPromotionPolicy(new PromotionPolicyReq(), map, new IBaseResponseCallback() { // from class: com.huawei.health.tradeservice.cloud.OrderManager$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                OrderManager.lambda$getPromotionPolicy$0(iBaseResponseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void lambda$getPromotionPolicy$0(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        if (obj instanceof PromotionPolicyRsq) {
            iBaseResponseCallback.a(0, ((PromotionPolicyRsq) obj).getPromotionPolicyInfo());
        } else {
            iBaseResponseCallback.a(i, null);
        }
    }
}
