package com.miui.tsmclient;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.ActionToken;
import com.miui.tsmclient.entity.CardConfigManager;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoManager;
import com.miui.tsmclient.entity.ConfigInfo;
import com.miui.tsmclient.entity.CouponInfo;
import com.miui.tsmclient.entity.FeeInfo;
import com.miui.tsmclient.entity.GroupConfigInfo;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.entity.OrderDetailInfo;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.entity.RechargeOrderInfo;
import com.miui.tsmclient.entity.RechargeOrderResponseInfo;
import com.miui.tsmclient.entity.RefundInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.BaseTransitCardModel;
import com.miui.tsmclient.model.m;
import com.miui.tsmclient.model.mitsm.f;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.net.request.ConfigListRequest;
import com.miui.tsmclient.net.request.RechargeOrderListRequest;
import com.miui.tsmclient.pay.IPayTool;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.pay.PayToolFactory;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.NetworkUtil;
import com.miui.tsmclient.util.TSMLocationService;
import com.tsmclient.smartcard.PrefUtils;
import defpackage.ljs;
import defpackage.p4h;
import defpackage.pfl;
import defpackage.sa4;
import defpackage.va1;
import defpackage.xno;
import defpackage.zta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class Facade {
    private m mCardManager;
    private Context mContext;
    private sa4 mSubscriptions;
    private TSMAuthManager mTSMAuthManager;
    private BaseTransitCardModel mTransitCardModel;

    public interface CardListListener extends UpdateCardListener {
        void onCardListUpdated(List<CardInfo> list);

        void onNetworkUnavailable();

        void onServerUnavailable();

        void onUpdateCardListCompleted();
    }

    public static class CityResponseInfo extends CommonResponseInfo {

        @SerializedName("data")
        private CitiesInfo mCitiesInfo;

        public static class CitiesInfo {

            @SerializedName("availableCityInfo")
            public CityInfo mAvailableCityInfo;

            @SerializedName("locationCityInfo")
            public CityInfo mLocationCityInfo;
        }

        public static class CityInfo {

            @SerializedName("cityId")
            public String mCityId;

            @SerializedName("cityName")
            public String mCityName;
        }
    }

    public interface CreateOrderListener {
        void onCreateOrderFailed(int i, String str);

        void onCreateOrderSuccess(OrderInfo orderInfo);
    }

    public interface GetCitiesInfoListener {
        void onGetCitiesInfoFailed(int i, String str);

        void onGetCitiesInfoListSuccess(CityResponseInfo.CitiesInfo citiesInfo);
    }

    public interface GetDefaultCardListener {
        void onGetDefaultCard(String str);
    }

    public interface GetIssueCardNoticeListener {
        void onGetIssueCardNoticeFailed(int i, String str);

        void onGetIssueCardNoticeSuccess(String str);
    }

    public interface GetRechargeOrderListListener {
        void onGetRechargeOrderListFailed(int i, String str);

        void onGetRechargeOrderListSuccess(List<RechargeOrderInfo> list);
    }

    public static class SimpleSubscriber<T> extends xno<T> {
        private String mCompleteLog;
        private String mErrorLog;

        public SimpleSubscriber() {
            this("error occurred");
        }

        @Override // defpackage.a6h
        public void onCompleted() {
            if (TextUtils.isEmpty(this.mCompleteLog)) {
                return;
            }
            LogUtils.d(this.mCompleteLog);
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            if (TextUtils.isEmpty(this.mErrorLog)) {
                return;
            }
            LogUtils.e(this.mErrorLog, th);
        }

        @Override // defpackage.a6h
        public void onNext(T t) {
        }

        public SimpleSubscriber(String str) {
            this(null, str);
        }

        public SimpleSubscriber(String str, String str2) {
            this.mCompleteLog = str;
            this.mErrorLog = str2;
        }
    }

    public interface UpdateCardListener {
        void onCardUpdated(CardInfo cardInfo);
    }

    private Facade() {
    }

    public static Facade getFacade(Context context) {
        Facade facade = new Facade();
        facade.onInit(context);
        return facade;
    }

    private void onInit(Context context) {
        this.mContext = context.getApplicationContext();
        BaseTransitCardModel baseTransitCardModel = new BaseTransitCardModel();
        this.mTransitCardModel = baseTransitCardModel;
        baseTransitCardModel.init(this.mContext, null);
        this.mTSMAuthManager = new TSMAuthManager();
        this.mSubscriptions = new sa4();
        this.mCardManager = new m(this.mContext);
    }

    public void activateCard(CardInfo cardInfo) {
        ljs.e(this.mContext, cardInfo);
    }

    public void clearData() {
        CardInfoManager.getInstance(this.mContext).clear();
        PrefUtils.clear(this.mContext);
        com.miui.tsmclient.util.PrefUtils.clear(this.mContext);
        com.miui.tsmclient.database.a.a(this.mContext);
    }

    public void createOrder(final FeeInfo feeInfo, final CardInfo cardInfo, Bundle bundle, final CreateOrderListener createOrderListener) {
        if (cardInfo == null || feeInfo == null || createOrderListener == null) {
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        final Bundle bundle2 = bundle;
        if (!bundle2.containsKey("payChannel")) {
            bundle2.putString("payChannel", "UCashier");
        }
        CouponInfo couponInfo = feeInfo.getCouponInfo();
        if (couponInfo != null && couponInfo.isValid()) {
            bundle2.putLong(TSMAuthContants.PARAM_COUPON_ID, couponInfo.getCouponId());
        }
        this.mSubscriptions.a(p4h.g(new Callable<OrderInfo>() { // from class: com.miui.tsmclient.Facade.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public OrderInfo call() throws Exception {
                try {
                    JSONObject jSONObjectCreateOrder = Facade.this.mTSMAuthManager.createOrder(Facade.this.mContext, feeInfo.mId, cardInfo, bundle2);
                    if (jSONObjectCreateOrder == null) {
                        return null;
                    }
                    OrderInfo orderInfo = new OrderInfo();
                    orderInfo.parse(jSONObjectCreateOrder);
                    LogUtils.d("order create success, orderId:" + orderInfo.mOrderId);
                    return orderInfo;
                } catch (AuthApiException e) {
                    LogUtils.e("create order from mipay failed. errorcode: " + e.mErrorCode + ", msg:" + e.mErrorMsg, e);
                    createOrderListener.onCreateOrderFailed(e.mErrorCode, e.mErrorMsg);
                    return null;
                }
            }
        }).y(pfl.c()).l(va1.b()).w(new SimpleSubscriber<OrderInfo>("createOrder is completed", "createOrder error occurred") { // from class: com.miui.tsmclient.Facade.3
            @Override // com.miui.tsmclient.Facade.SimpleSubscriber, defpackage.a6h
            public void onNext(OrderInfo orderInfo) {
                if (orderInfo != null) {
                    createOrderListener.onCreateOrderSuccess(orderInfo);
                }
            }
        }));
    }

    public void deactivateCard(CardInfo cardInfo) {
        ljs.j(this.mContext, cardInfo);
    }

    public BaseResponse deleteCard(CardInfo cardInfo) {
        return CardInfoManager.getInstance(this.mContext).deleteCard(cardInfo, null);
    }

    public List<CardInfo> fetchCards(CardInfo cardInfo) {
        BaseResponse baseResponseUpdateCards = CardInfoManager.getInstance(this.mContext).updateCards(cardInfo);
        if (baseResponseUpdateCards.isSuccess()) {
            if (baseResponseUpdateCards.mDatas[0] instanceof List) {
                ArrayList arrayList = new ArrayList();
                List list = (List) baseResponseUpdateCards.mDatas[0];
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add((CardInfo) list.get(i));
                }
                return arrayList;
            }
        }
        return null;
    }

    public void getCardList(final CardListListener cardListListener, final boolean z) {
        if (NetworkUtil.isConnected(this.mContext)) {
            this.mSubscriptions.a(p4h.g(new Callable<List<CardInfo>>() { // from class: com.miui.tsmclient.Facade.2
                @Override // java.util.concurrent.Callable
                public List<CardInfo> call() throws Exception {
                    List<CardInfo> cardsFromNetwork = Facade.this.mTransitCardModel.getCardsFromNetwork(null, null);
                    if (cardsFromNetwork == null) {
                        cardsFromNetwork = Collections.emptyList();
                    } else {
                        CardConfigManager.getInstance().getSupportedTransCardMap(true);
                    }
                    Facade.this.mTransitCardModel.removeUnTransferInOrder(cardsFromNetwork);
                    return cardsFromNetwork;
                }
            }).y(pfl.c()).l(va1.b()).w(new SimpleSubscriber<List<CardInfo>>("getCardsFromNetwork complete", "getCardsFromNetwork error occurred") { // from class: com.miui.tsmclient.Facade.1
                @Override // com.miui.tsmclient.Facade.SimpleSubscriber, defpackage.a6h
                public void onNext(List<CardInfo> list) {
                    if (cardListListener != null) {
                        if (list.isEmpty()) {
                            cardListListener.onServerUnavailable();
                            return;
                        }
                        ArrayList arrayList = new ArrayList(list);
                        cardListListener.onCardListUpdated(list);
                        if (z) {
                            Facade.this.updateTransitCardListFromLocal(arrayList, cardListListener);
                        }
                    }
                }
            }));
        } else if (cardListListener != null) {
            cardListListener.onNetworkUnavailable();
        }
    }

    public void getCitiesInfo(final CardInfo cardInfo, final GetCitiesInfoListener getCitiesInfoListener) {
        if (cardInfo == null || getCitiesInfoListener == null) {
            return;
        }
        String str = "POST";
        HttpClient.getInstance(this.mContext).enqueue(new SecureRequest<CityResponseInfo>(str, "api/%s/sporder/queryCityInfo", CityResponseInfo.class, new ResponseListener<CityResponseInfo>() { // from class: com.miui.tsmclient.Facade.6
            @Override // com.miui.tsmclient.common.net.ResponseListener
            public void onFailed(int i, String str2, CityResponseInfo cityResponseInfo) {
                LogUtils.e("getCitiesInfo onFail! errorCode:" + i + ", errorMsg:" + str2);
                getCitiesInfoListener.onGetCitiesInfoFailed(i, str2);
            }

            @Override // com.miui.tsmclient.common.net.ResponseListener
            public void onSuccess(CityResponseInfo cityResponseInfo) {
                LogUtils.d("getCitiesInfo onSuccess!");
                getCitiesInfoListener.onGetCitiesInfoListSuccess(cityResponseInfo.mCitiesInfo);
            }
        }) { // from class: com.miui.tsmclient.Facade.7
            @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
            public void addExtraParams() throws IOException {
                super.addExtraParams();
                try {
                    Location lastLocation = TSMLocationService.getInstance(Facade.this.mContext).getLastLocation();
                    addParams("la", String.valueOf(lastLocation.getLatitude()));
                    addParams(TSMAuthContants.PARAM_LONGITUDE, String.valueOf(lastLocation.getLongitude()));
                    addParams("cplc", cardInfo.getTerminal().getCPLC());
                    addParams("cardName", cardInfo.mCardType);
                } catch (IOException | InterruptedException e) {
                    throw new IOException("RechargeOrderListRequest getExtraParams failed", e);
                }
            }
        });
    }

    public List<CardInfo> getCloudTransitCardList() throws AuthApiException {
        return this.mTransitCardModel.getCloudCardsFromNetwork();
    }

    public void getIssueCardNotice(final CardInfo cardInfo, final GetIssueCardNoticeListener getIssueCardNoticeListener) {
        if (cardInfo == null || getIssueCardNoticeListener == null) {
            return;
        }
        HttpClient.getInstance(this.mContext).enqueue(new ConfigListRequest(cardInfo, ConfigInfo.ISSUE_CARD_NOTICE, new ResponseListener<GroupConfigInfo>() { // from class: com.miui.tsmclient.Facade.8
            @Override // com.miui.tsmclient.common.net.ResponseListener
            public void onFailed(int i, String str, GroupConfigInfo groupConfigInfo) {
                LogUtils.e("getIssueCardNotice onFail! errorCode:" + i + ", errorMsg:" + str);
                getIssueCardNoticeListener.onGetIssueCardNoticeFailed(i, str);
            }

            @Override // com.miui.tsmclient.common.net.ResponseListener
            public void onSuccess(GroupConfigInfo groupConfigInfo) {
                LogUtils.d("getIssueCardNotice onSuccess!");
                List<String> contentList = groupConfigInfo.getContentList(cardInfo.mCardType, ConfigInfo.ISSUE_CARD_NOTICE);
                getIssueCardNoticeListener.onGetIssueCardNoticeSuccess(!contentList.isEmpty() ? contentList.get(0) : null);
            }
        }));
    }

    public OrderDetailInfo getOrderDetail(CardInfo cardInfo, String str) throws AuthApiException {
        return this.mTSMAuthManager.getOrderDetailById(this.mContext, cardInfo, str);
    }

    public void getRechargeOrderList(CardInfo cardInfo, final GetRechargeOrderListListener getRechargeOrderListListener) {
        if (cardInfo == null || getRechargeOrderListListener == null) {
            return;
        }
        HttpClient.getInstance(this.mContext).enqueue(new RechargeOrderListRequest(cardInfo, new ResponseListener<RechargeOrderResponseInfo>() { // from class: com.miui.tsmclient.Facade.5
            @Override // com.miui.tsmclient.common.net.ResponseListener
            public void onFailed(int i, String str, RechargeOrderResponseInfo rechargeOrderResponseInfo) {
                LogUtils.e("RechargeOrderListRequest onFail called! errorCode:" + i + ", errorMsg:" + str);
                getRechargeOrderListListener.onGetRechargeOrderListFailed(i, str);
            }

            @Override // com.miui.tsmclient.common.net.ResponseListener
            public void onSuccess(RechargeOrderResponseInfo rechargeOrderResponseInfo) {
                LogUtils.d("RechargeOrderListRequest onSuccess called!");
                getRechargeOrderListListener.onGetRechargeOrderListSuccess(rechargeOrderResponseInfo.getRechargeOrderInfoList());
            }
        }));
    }

    public List<CardInfo> getTransitCardList(CardInfo cardInfo) throws AuthApiException {
        List<CardInfo> cardsFromNetwork = this.mTransitCardModel.getCardsFromNetwork(cardInfo, null);
        this.mTransitCardModel.removeUnTransferInOrder(cardsFromNetwork);
        return cardsFromNetwork;
    }

    public BaseResponse issue(CardInfo cardInfo, Bundle bundle) {
        if (cardInfo == null) {
            return new BaseResponse(1, new Object[0]);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (cardInfo instanceof PayableCardInfo) {
            PayableCardInfo payableCardInfo = (PayableCardInfo) cardInfo;
            bundle.putParcelable(Constants.EXTRA_CARD_INFO, payableCardInfo);
            for (OrderInfo orderInfo : payableCardInfo.mUnfinishOrderInfos) {
                ActionToken issueOrWithdrawOrderToken = orderInfo.getIssueOrWithdrawOrderToken();
                if (issueOrWithdrawOrderToken != null) {
                    bundle.putString("order_id", orderInfo.mOrderId);
                    bundle.putString("authentication_code", issueOrWithdrawOrderToken.mToken);
                    break;
                }
            }
        } else {
            if (!(cardInfo instanceof MifareCardInfo)) {
                return new BaseResponse(1, new Object[0]);
            }
            if (!bundle.containsKey(Constants.EXTRA_DOOR_CARD_PRODUCT_ID)) {
                bundle.putString(Constants.EXTRA_DOOR_CARD_PRODUCT_ID, "99999-00001");
            }
        }
        if (cardInfo.hasTransferInOrder()) {
            BaseResponse baseResponseTransferIn = CardInfoManager.getInstance(this.mContext).transferIn(cardInfo, bundle);
            LogUtils.d("Facade transferIn called! result: " + baseResponseTransferIn.mResultCode);
            return baseResponseTransferIn;
        }
        BaseResponse baseResponseIssue = CardInfoManager.getInstance(this.mContext).issue(cardInfo, bundle);
        LogUtils.d("Facade issue called! result: " + baseResponseIssue.mResultCode);
        return baseResponseIssue;
    }

    public int parsePayResult(CardInfo cardInfo, Bundle bundle) {
        IPayTool payTool = PayToolFactory.getPayTool(cardInfo.mCardType);
        if (payTool != null) {
            return payTool.parsePayResult(this.mContext, cardInfo, bundle);
        }
        throw new IllegalStateException("Pay type not supported");
    }

    public int pay(Activity activity, CardInfo cardInfo, OrderInfo orderInfo) {
        IPayTool payTool = PayToolFactory.getPayTool(cardInfo.mCardType);
        if (payTool != null) {
            return payTool.pay(activity, orderInfo.mPayExtra, null);
        }
        throw new IllegalStateException("Pay type not supported");
    }

    public OrderInfo queryOrderInfo(String str) throws AuthApiException {
        return this.mTSMAuthManager.queryByOrderId(this.mContext, str);
    }

    public BaseResponse recharge(CardInfo cardInfo) {
        return CardInfoManager.getInstance(this.mContext).recharge(cardInfo);
    }

    public RefundInfo refund(String str) throws AuthApiException {
        return this.mTSMAuthManager.refund(this.mContext, str);
    }

    public void release() {
        this.mSubscriptions.unsubscribe();
        this.mCardManager.a();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0092 A[PHI: r0
      0x0092: PHI (r0v1 com.miui.tsmclient.model.BaseResponse) = 
      (r0v0 com.miui.tsmclient.model.BaseResponse)
      (r0v0 com.miui.tsmclient.model.BaseResponse)
      (r0v11 com.miui.tsmclient.model.BaseResponse)
     binds: [B:12:0x0033, B:14:0x0042, B:21:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    public BaseResponse retryOrder(CardInfo cardInfo, String str) {
        OrderDetailInfo orderDetail;
        boolean z;
        StringBuilder sb;
        String str2;
        BaseResponse baseResponse = new BaseResponse(-1, new Object[0]);
        try {
            orderDetail = getOrderDetail(cardInfo, str);
        } catch (Exception e) {
            LogUtils.e("retryOrder failed, orderId:" + str, e);
            orderDetail = null;
        }
        if (orderDetail == null || !orderDetail.canRetry()) {
            return baseResponse;
        }
        if (orderDetail.isIssueOrWithdrawOrder()) {
            Bundle bundle = new Bundle();
            ActionToken issueOrWithdrawOrderToken = orderDetail.getUnfinishedOrder().getIssueOrWithdrawOrderToken();
            if (issueOrWithdrawOrderToken != null) {
                bundle.putString("authentication_code", issueOrWithdrawOrderToken.mToken);
                if (cardInfo.hasTransferInOrder()) {
                    baseResponse = CardInfoManager.getInstance(this.mContext).transferIn(cardInfo, bundle);
                    sb = new StringBuilder();
                    str2 = "retryOrder transferIn called! resultCode: ";
                } else {
                    baseResponse = CardInfoManager.getInstance(this.mContext).issue(cardInfo, bundle);
                    sb = new StringBuilder();
                    str2 = "retryOrder issue called! resultCode: ";
                }
                sb.append(str2);
                sb.append(baseResponse.mResultCode);
                sb.append(", responseDesc:");
                sb.append(baseResponse.mMsg);
                LogUtils.d(sb.toString());
                z = baseResponse.mResultCode == 0;
            }
        }
        if (!z || !orderDetail.isRechargeOrder() || !(cardInfo instanceof PayableCardInfo)) {
            return baseResponse;
        }
        ((PayableCardInfo) cardInfo).updateOrderInfo(orderDetail.getUnfinishedOrder());
        return CardInfoManager.getInstance(this.mContext).recharge(cardInfo);
    }

    public BaseResponse syncEse(CardInfo cardInfo) {
        int i;
        f fVar = new f();
        String message = "";
        try {
            Context context = this.mContext;
            return fVar.syncEse(context, cardInfo, fVar.getSession(context, cardInfo, null), null);
        } catch (IOException e) {
            LogUtils.e("sync Ese failed with an io exception.", e);
            i = 2;
            return new BaseResponse(i, message, new Object[0]);
        } catch (InterruptedException e2) {
            LogUtils.e("sync Ese is interrupted.", e2);
            i = 11;
            return new BaseResponse(i, message, new Object[0]);
        } catch (r.a e3) {
            int iA = e3.a();
            message = e3.getMessage();
            LogUtils.e("sync Ese failed with an tsmapi exception.", e3);
            i = iA;
            return new BaseResponse(i, message, new Object[0]);
        }
    }

    public BaseResponse updateCard(CardInfo cardInfo) {
        return CardInfoManager.getInstance(this.mContext).updateCards(cardInfo);
    }

    public void updateCardOrder(CardInfo cardInfo) throws AuthApiException {
        List<OrderInfo> cardOrderList;
        if (!(cardInfo instanceof PayableCardInfo) || (cardOrderList = this.mTransitCardModel.getCardOrderList(cardInfo)) == null) {
            return;
        }
        ((PayableCardInfo) cardInfo).mUnfinishOrderInfos = cardOrderList;
    }

    public void updateTransitCardListFromLocal(List<CardInfo> list, final CardListListener cardListListener) {
        if (list == null) {
            return;
        }
        this.mSubscriptions.a(p4h.f(list).j(new zta<CardInfo, CardInfo>() { // from class: com.miui.tsmclient.Facade.10
            @Override // defpackage.zta
            public CardInfo call(CardInfo cardInfo) {
                CardInfo transCard = CardInfoManager.getInstance(Facade.this.mContext).getTransCard(null, cardInfo);
                if (transCard == null || !transCard.mIsReadSECorrectly) {
                    CardInfoManager.getInstance(Facade.this.mContext).updateCards(cardInfo);
                } else {
                    cardInfo.updateInfo(transCard);
                    cardInfo.mDataSource = CardInfo.DataSource.DB;
                }
                return cardInfo;
            }
        }).y(pfl.c()).l(va1.b()).w(new SimpleSubscriber<CardInfo>("updateFromLocal error occurred") { // from class: com.miui.tsmclient.Facade.9
            @Override // com.miui.tsmclient.Facade.SimpleSubscriber, defpackage.a6h
            public void onCompleted() {
                LogUtils.d("updateFromLocal complete");
                CardListListener cardListListener2 = cardListListener;
                if (cardListListener2 != null) {
                    cardListListener2.onUpdateCardListCompleted();
                }
            }

            @Override // com.miui.tsmclient.Facade.SimpleSubscriber, defpackage.a6h
            public void onNext(CardInfo cardInfo) {
                CardListListener cardListListener2 = cardListListener;
                if (cardListListener2 != null) {
                    cardListListener2.onCardUpdated(cardInfo);
                }
            }
        }));
    }
}
