package com.huawei.health.tradeservice.cloud;

import android.content.Context;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.chj;
import defpackage.oet;
import defpackage.ofe;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TradeServiceCloudMgr {
    private static final String TAG = "TradeService_CloudMgr";
    private static volatile TradeServiceCloudMgr sCloudMgr;
    private TradeServiceCloudApi callApi = (TradeServiceCloudApi) oet.d().e(TradeServiceCloudApi.class);
    private TradeServiceCloudFactory paramsFactory = new TradeServiceCloudFactory(BaseApplication.getContext());

    private TradeServiceCloudMgr(Context context) {
    }

    public static TradeServiceCloudMgr getInstance() {
        if (sCloudMgr == null) {
            sCloudMgr = new TradeServiceCloudMgr(BaseApplication.getContext());
        }
        return sCloudMgr;
    }

    public void getProductInfo(ProductInfoReq productInfoReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.productQueryInfo(productInfoReq.getUrl(), this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void productQueryDetails(ProductDetailsReq productDetailsReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.productQueryDetails(productDetailsReq.getUrl(), this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void resourceQueryInfo(ResourceInfoReq resourceInfoReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.resourceQueryInfo(resourceInfoReq.getUrl(), this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void orderCreate(OrderCreateReq orderCreateReq, Map<String, Object> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.orderCreate(orderCreateReq.getUrl(), this.paramsFactory.getHeaders(), ofe.c(map)).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    static class NetWorkReqCallBack implements ResultCallback {
        private IBaseResponseCallback mCallBack;

        private NetWorkReqCallBack(IBaseResponseCallback iBaseResponseCallback) {
            this.mCallBack = iBaseResponseCallback;
        }

        @Override // com.huawei.hms.framework.network.restclient.ResultCallback
        public void onResponse(Response response) {
            if (response == null || !(response.getBody() instanceof BaseRsp)) {
                LogUtil.e(TradeServiceCloudMgr.TAG, "NetWorkReqCallBack rsp is null");
                IBaseResponseCallback iBaseResponseCallback = this.mCallBack;
                if (iBaseResponseCallback == null) {
                    return;
                }
                iBaseResponseCallback.a(-1, null);
                return;
            }
            BaseRsp baseRsp = (BaseRsp) response.getBody();
            int resultCode = baseRsp.getResultCode();
            LogUtil.a(TradeServiceCloudMgr.TAG, "NetWorkReqCallBack resultCode= ", Integer.valueOf(resultCode));
            if (this.mCallBack == null) {
                return;
            }
            if (baseRsp.getResultCode() == 3040046) {
                this.mCallBack.a(resultCode, baseRsp);
            } else if (baseRsp.getResultCode() != 0) {
                this.mCallBack.a(resultCode, null);
            } else {
                this.mCallBack.a(0, baseRsp);
            }
        }

        @Override // com.huawei.hms.framework.network.restclient.ResultCallback
        public void onFailure(Throwable th) {
            LogUtil.e(TradeServiceCloudMgr.TAG, "NetWorkReqCallBack IOException ", th.getMessage());
            IBaseResponseCallback iBaseResponseCallback = this.mCallBack;
            if (iBaseResponseCallback == null) {
                return;
            }
            iBaseResponseCallback.a(-1, null);
        }
    }

    public void orderCancel(OrderCancelReq orderCancelReq, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.orderCancel(orderCancelReq.getUrl(), this.paramsFactory.getHeaders(), ofe.c(orderCancelReq)).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void orderQueryUnpaid(OrderUnpaidReq orderUnpaidReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.orderQueryUnpaid(orderUnpaidReq.getUrl(), this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void orderReportPurchaseResult(OrderReportResultReq orderReportResultReq, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.orderReportPurchaseResult(orderReportResultReq.getUrl(), this.paramsFactory.getHeaders(), ofe.c(orderReportResultReq)).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void orderRedelivery(OrderRedeliveryReq orderRedeliveryReq, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.orderRedelivery(orderRedeliveryReq.getUrl(), this.paramsFactory.getHeaders(), ofe.c(orderRedeliveryReq)).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void orderQueryHistory(OrderHistoryReq orderHistoryReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.orderQueryHistory(orderHistoryReq.getUrl(), this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void orderQueryDetails(OrderQueryDetailsReq orderQueryDetailsReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.orderQueryDetails(orderQueryDetailsReq.getUrl(), this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void queryAudiosPackageBySeriesId(OrderAudiosPackageReq orderAudiosPackageReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        chj chjVar = new chj();
        this.callApi.queryAudiosPackageBySeriesId(orderAudiosPackageReq.getUrl(), chjVar.getHeaders(), ofe.c(chjVar.getBody(map))).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void cardQueryInfo(CardQueryInfoReq cardQueryInfoReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.cardQueryInfo(cardQueryInfoReq.getUrl(), this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void resourceAuthInfo(ResourceAuthReq resourceAuthReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.resourceAuthInfo(resourceAuthReq.getUrl(), this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void functionAuthInfo(FunctionAuthReq functionAuthReq, String str, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.functionAuthInfo(functionAuthReq.getUrl() + str + "?", this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void assetMsgNotify(AssetMsgNotifyReq assetMsgNotifyReq, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.assetMsgNotify(assetMsgNotifyReq.getUrl(), this.paramsFactory.getHeaders(), ofe.c(assetMsgNotifyReq)).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void assetMsgListQuery(AssetMsgListReq assetMsgListReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.assetMsgListQuery(assetMsgListReq.getUrl(), this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void assetMsgVisited(AssetMsgVisitedReq assetMsgVisitedReq, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.assetMsgVisited(assetMsgVisitedReq.getUrl(), this.paramsFactory.getHeaders(), ofe.c(assetMsgVisitedReq)).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void promotionInfoQuery(PromotionInfoReq promotionInfoReq, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.promotionInfoQuery(promotionInfoReq.getUrl(), this.paramsFactory.getHeaders(), ofe.c(promotionInfoReq)).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void giftCardListQuery(GiftCardListReq giftCardListReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.giftCardListQuery(giftCardListReq.getUrl(), this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void awardListQuery(AwardListReq awardListReq, JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.receiveAward(awardListReq.getUrl(), this.paramsFactory.getHeaders(), jSONObject.toString()).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void couponListQuery(CouponListReq couponListReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.couponListQuery(couponListReq.getUrl(), this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }

    public void receiveCoupon(ReceiveCouponReq receiveCouponReq, IBaseResponseCallback iBaseResponseCallback) {
        try {
            ReceiveCouponRsp body = this.callApi.receiveCoupon(receiveCouponReq.getUrl(), this.paramsFactory.getHeaders(), ofe.c(receiveCouponReq)).execute().getBody();
            LogUtil.a(TAG, "receiveCoupon");
            if (body != null) {
                LogUtil.a(TAG, Integer.valueOf(body.getResultCode()));
                LogUtil.a(TAG, body.getCouponResultList());
                iBaseResponseCallback.a(body.getResultCode(), body.getCouponResultList());
                return;
            }
            iBaseResponseCallback.a(-1, null);
        } catch (IOException unused) {
            LogUtil.a(TAG, "IOException");
            iBaseResponseCallback.a(-1, null);
        }
    }

    public void getPromotionPolicy(PromotionPolicyReq promotionPolicyReq, HashMap<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        this.callApi.getPromotionPolicy(promotionPolicyReq.getUrl(), this.paramsFactory.getHeaders(), map).enqueue(new NetWorkReqCallBack(iBaseResponseCallback));
    }
}
