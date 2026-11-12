package com.miui.tsmclient.sesdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.entity.ActionToken;
import com.miui.tsmclient.entity.CardGroupType;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.miui.tsmclient.entity.CouponDetail;
import com.miui.tsmclient.entity.CouponInfo;
import com.miui.tsmclient.entity.CouponResponseInfo;
import com.miui.tsmclient.entity.FeeInfo;
import com.miui.tsmclient.entity.OrderDetailInfo;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.entity.RechargeOrderInfo;
import com.miui.tsmclient.entity.RechargeOrderResponseInfo;
import com.miui.tsmclient.entity.RefundInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.net.request.RechargeOrderListRequest;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.TSMLocationService;
import defpackage.ift;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class OrderData {
    private String mCaptcha;
    private SeCard mCard;
    private Fee mFee;
    private String mIdentityCode;
    private String mPayChannel;
    private String mPhoneNum;
    private int mServiceFee;
    private TSMAuthManager mTSMAuthManager = new TSMAuthManager();

    public static class Coupon {
        private CouponDetail mCouponDetail;
        private CouponInfo mCouponInfo;

        private Coupon(CouponInfo couponInfo) {
            this.mCouponInfo = couponInfo;
            this.mCouponDetail = CouponDetail.get(couponInfo.getExtra());
        }

        public long getCouponId() {
            return this.mCouponInfo.getCouponId();
        }

        public String getDiscountAmount() {
            return this.mCouponDetail.getDiscountFee();
        }

        public String getDiscountDesc() {
            return this.mCouponDetail.getDiscountDesc();
        }

        public String getExpireDesc() {
            return this.mCouponDetail.getExpireToast();
        }

        public String getTitle() {
            return this.mCouponDetail.getCouponTitle();
        }

        public int getTotalDiscount() {
            return this.mCouponInfo.getTotalDiscount();
        }

        public boolean isHighLight() {
            return this.mCouponDetail.isHighLight();
        }

        public boolean isValid() {
            return this.mCouponInfo.isValid();
        }
    }

    public static class CouponList {
        private List<Coupon> mList;

        private CouponList(List<Coupon> list) {
            this.mList = list;
        }

        public List<Coupon> getList() {
            return this.mList;
        }

        public boolean isEmpty() {
            List<Coupon> list = this.mList;
            return list != null && list.isEmpty();
        }
    }

    public static class Fee {
        private FeeInfo mFeeInfo;

        private Fee(FeeInfo feeInfo) {
            this.mFeeInfo = feeInfo;
        }

        public int getRechargeFee() {
            return this.mFeeInfo.getRechargeFee();
        }

        public int getServiceFee() {
            return this.mFeeInfo.getDiscountIssueFee();
        }

        public int getTotalPay() {
            return this.mFeeInfo.getDiscountPayFee();
        }

        public boolean isSuggested() {
            return this.mFeeInfo.isSuggested();
        }
    }

    public static class FeeList {
        private List<Fee> mList;

        private FeeList(List<Fee> list) {
            this.mList = list;
        }

        public List<Fee> getList() {
            return this.mList;
        }

        public boolean isEmpty() {
            List<Fee> list = this.mList;
            return list != null && list.isEmpty();
        }
    }

    public static class Order {
        private SeCard mCard;
        private OrderInfo mOrderInfo;

        private Order(OrderInfo orderInfo, SeCard seCard) {
            this.mOrderInfo = orderInfo;
            this.mCard = seCard;
            seCard.setCityId(orderInfo.mCityId);
        }

        public String getCityId() {
            return this.mOrderInfo.mCityId;
        }

        @Deprecated
        public String getIssueToken() {
            List<ActionToken> list = this.mOrderInfo.mActionTokens;
            if (list == null) {
                return null;
            }
            for (ActionToken actionToken : list) {
                if (actionToken.isIssueType()) {
                    return actionToken.mToken;
                }
            }
            return null;
        }

        public String getOrderId() {
            return this.mOrderInfo.mOrderId;
        }

        public int getPayFee() {
            return this.mOrderInfo.mPayFee;
        }

        public String getPayString() {
            return this.mOrderInfo.mPayExtra;
        }

        @Deprecated
        public String getRechargeToken() {
            List<ActionToken> list = this.mOrderInfo.mActionTokens;
            if (list == null) {
                return null;
            }
            for (ActionToken actionToken : list) {
                if (actionToken.isRechargeType()) {
                    return actionToken.mToken;
                }
            }
            return null;
        }

        public String getToken() {
            List<ActionToken> list = this.mOrderInfo.mActionTokens;
            if (list == null) {
                return null;
            }
            for (ActionToken actionToken : list) {
                if (this.mCard.isIssued()) {
                    if (actionToken.isRechargeType()) {
                        return actionToken.mToken;
                    }
                } else if (actionToken.isIssueType() || actionToken.isWithdrawType()) {
                    return actionToken.mToken;
                }
            }
            return null;
        }

        @Deprecated
        public String getTransferInToken() {
            List<ActionToken> list = this.mOrderInfo.mActionTokens;
            if (list == null) {
                return null;
            }
            for (ActionToken actionToken : list) {
                if (actionToken.isWithdrawType()) {
                    return actionToken.mToken;
                }
            }
            return null;
        }

        public boolean isPaid() {
            return this.mOrderInfo.isPaid();
        }

        public void update() throws AuthApiException {
            this.mOrderInfo = new TSMAuthManager().queryByOrderId(EnvironmentConfig.getContext(), getOrderId());
        }
    }

    public static class OrderList {
        private List<Order> mList;

        private OrderList(List<Order> list) {
            this.mList = list;
        }

        public List<Order> getList() {
            return this.mList;
        }

        public boolean isEmpty() {
            List<Order> list = this.mList;
            return list != null && list.isEmpty();
        }
    }

    public static class OrderRecord {
        private SeCard mCard;
        private RechargeOrderInfo mRecord;

        private OrderRecord(RechargeOrderInfo rechargeOrderInfo, SeCard seCard) {
            this.mRecord = rechargeOrderInfo;
            this.mCard = seCard;
        }

        public int getAmount() {
            return this.mRecord.getAmount();
        }

        public OrderRecordDetail getDetail() throws AuthApiException {
            return new OrderRecordDetail(new TSMAuthManager().getOrderDetailById(EnvironmentConfig.getContext(), this.mCard.mCardInfo, getOrderId()), this.mCard);
        }

        public String getOrderId() {
            return this.mRecord.getOrderId();
        }

        public String getStatusDesc() {
            return this.mRecord.getStatusDesc();
        }

        public String getTime() {
            return this.mRecord.getTime();
        }

        public String getTitle() {
            return this.mRecord.getTitle();
        }
    }

    public static class OrderRecordDetail {
        private SeCard mCard;
        private OrderDetailInfo mDetail;
        private OrderFlowList mOrderFlowList;
        private TSMAuthManager mTSMAuthManager;

        public static class OrderFlow {
            private OrderDetailInfo.OrderFlow mOrderFlow;

            public OrderFlow(OrderDetailInfo.OrderFlow orderFlow) {
                this.mOrderFlow = orderFlow;
            }

            public int getAmount() {
                return this.mOrderFlow.getAmount();
            }

            public String getDesc() {
                return this.mOrderFlow.getDesc();
            }

            public String getKey() {
                return this.mOrderFlow.getKey();
            }

            public String getSubKey() {
                return this.mOrderFlow.getSubKey();
            }

            public String getSubValue() {
                return this.mOrderFlow.getSubValue();
            }

            public String getTime() {
                return this.mOrderFlow.getTime();
            }

            public String getTitle() {
                return this.mOrderFlow.getTitle();
            }

            public String getValue() {
                return this.mOrderFlow.getValue();
            }
        }

        public static class OrderFlowList {
            private List<OrderFlow> mList;

            private OrderFlowList(List<OrderFlow> list) {
                this.mList = list;
            }

            public List<OrderFlow> getList() {
                return this.mList;
            }

            public boolean isEmpty() {
                List<OrderFlow> list = this.mList;
                return list != null && list.isEmpty();
            }
        }

        private OrderRecordDetail(OrderDetailInfo orderDetailInfo, SeCard seCard) {
            this.mDetail = orderDetailInfo;
            this.mCard = seCard;
            this.mTSMAuthManager = new TSMAuthManager();
        }

        public String getCardType() {
            return this.mDetail.getCardType();
        }

        public String getHint() {
            return this.mDetail.getHint();
        }

        public OrderFlowList getOrderFlows() {
            OrderFlowList orderFlowList = this.mOrderFlowList;
            if (orderFlowList != null) {
                return orderFlowList;
            }
            ArrayList arrayList = new ArrayList();
            List<OrderDetailInfo.OrderFlow> orderFlows = this.mDetail.getOrderFlows();
            if (orderFlows != null) {
                Iterator<OrderDetailInfo.OrderFlow> it = orderFlows.iterator();
                while (it.hasNext()) {
                    arrayList.add(new OrderFlow(it.next()));
                }
            }
            OrderFlowList orderFlowList2 = new OrderFlowList(arrayList);
            this.mOrderFlowList = orderFlowList2;
            return orderFlowList2;
        }

        public String getOrderId() {
            return this.mDetail.getOrderId();
        }

        public String getRefundDesc() {
            return this.mDetail.getRefundDesc();
        }

        public String getSpOrderId() {
            return this.mDetail.getSpOrderId();
        }

        public int getStatus() {
            return this.mDetail.getStatus();
        }

        public String getStatusDesc() {
            return this.mDetail.getStatusDesc();
        }

        public String getTime() {
            return this.mDetail.getTime();
        }

        public boolean isCanRefund() {
            return this.mDetail.canRefund();
        }

        public boolean isCanRetry() {
            return this.mDetail.canRetry() && this.mDetail.getUnfinishedOrder() != null;
        }

        public boolean isRefundSuccess() {
            return this.mDetail.isRefundSuccess();
        }

        public boolean isSuccess() {
            return this.mDetail.isSuccess();
        }

        public RefundInfo refund() throws AuthApiException {
            if (!isCanRefund()) {
                throw new IllegalStateException("refund is not available");
            }
            if (this.mDetail.isSyncBeforeRefund()) {
                RefundInfo refundInfo = new RefundInfo();
                Bundle bundle = new Bundle();
                bundle.putString("orderId", getOrderId());
                bundle.putString(TSMAuthContants.PARAM_SPORDERID, this.mDetail.getSpOrderId());
                BaseResponse baseResponseI = this.mCard.mCardOperation.i(EnvironmentConfig.getContext(), this.mCard.mCardInfo, bundle);
                if (!baseResponseI.isSuccess()) {
                    refundInfo.setResponseCode(Integer.toString(baseResponseI.mResultCode));
                    refundInfo.setResponseDesc(baseResponseI.mMsg);
                    return refundInfo;
                }
            }
            return this.mTSMAuthManager.refund(EnvironmentConfig.getContext(), getOrderId());
        }

        public BaseResponse retryOrder() {
            if (!isCanRetry()) {
                throw new IllegalStateException("The order can not be retried");
            }
            BaseResponse baseResponse = new BaseResponse(0, new Object[0]);
            Order order = new Order(this.mDetail.getUnfinishedOrder(), this.mCard);
            if (order.getTransferInToken() != null) {
                baseResponse = this.mCard.transferIn(order.getTransferInToken());
            } else if (order.getIssueToken() != null) {
                baseResponse = this.mCard.issue(order.getIssueToken());
            }
            return (!baseResponse.isSuccess() || order.getRechargeToken() == null) ? baseResponse : this.mCard.recharge(order.getRechargeToken());
        }

        public void update() throws AuthApiException {
            this.mDetail = this.mTSMAuthManager.getOrderDetailById(EnvironmentConfig.getContext(), this.mCard.mCardInfo, getOrderId());
        }
    }

    public static class OrderRecordList {
        private List<OrderRecord> mList;

        private OrderRecordList(List<OrderRecord> list) {
            this.mList = list;
        }

        public List<OrderRecord> getList() {
            return this.mList;
        }

        public boolean isEmpty() {
            List<OrderRecord> list = this.mList;
            return list != null && list.isEmpty();
        }
    }

    public OrderData(SeCard seCard, int i) {
        this.mCard = seCard;
        this.mServiceFee = i;
    }

    public Order createOrder() throws AuthApiException {
        Fee fee = this.mFee;
        if (fee == null) {
            throw new IllegalStateException("fee is null on createOrder");
        }
        FeeInfo feeInfo = fee.mFeeInfo;
        Bundle bundle = new Bundle();
        bundle.putString("payChannel", TextUtils.isEmpty(this.mPayChannel) ? "UCashier" : this.mPayChannel);
        CouponInfo couponInfo = feeInfo.getCouponInfo();
        if (couponInfo != null && couponInfo.isValid()) {
            bundle.putLong(TSMAuthContants.PARAM_COUPON_ID, couponInfo.getCouponId());
        }
        if (!TextUtils.isEmpty(this.mPhoneNum)) {
            bundle.putString("phone", this.mPhoneNum);
        }
        if (!TextUtils.isEmpty(this.mCaptcha)) {
            bundle.putString("captcha", this.mCaptcha);
        }
        if (!TextUtils.isEmpty(this.mIdentityCode)) {
            bundle.putString("identityCode", this.mIdentityCode);
        }
        bundle.putAll(feeInfo.getCustomFeeExtra(new PayableCardInfo(CardInfo.CARD_TYPE_DUMMY)));
        JSONObject jSONObjectCreateOrder = this.mTSMAuthManager.createOrder(EnvironmentConfig.getContext(), feeInfo.mId, CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_DUMMY, null), bundle);
        if (jSONObjectCreateOrder == null) {
            return null;
        }
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.parse(jSONObjectCreateOrder);
        LogUtils.d("order create success, orderId:" + orderInfo.mOrderId);
        return new Order(orderInfo, this.mCard);
    }

    public CouponList getCouponList() throws AuthApiException {
        if (this.mFee == null) {
            throw new IllegalStateException("fee is null on getCouponList");
        }
        ArrayList arrayList = new ArrayList();
        FeeInfo feeInfo = this.mFee.mFeeInfo;
        PayableCardInfo payableCardInfo = new PayableCardInfo(CardInfo.CARD_TYPE_DUMMY);
        try {
            CouponResponseInfo couponResponseInfo = (CouponResponseInfo) HttpClient.getInstance(EnvironmentConfig.getContext()).execute(new ift(EnvironmentConfig.getContext(), payableCardInfo, feeInfo, feeInfo.getCustomFeeExtra(payableCardInfo), null)).getResult();
            if (!couponResponseInfo.isSuccess()) {
                throw new AuthApiException(couponResponseInfo.getErrorCode(), couponResponseInfo.getErrorDesc());
            }
            List<CouponInfo> couponInfoList = couponResponseInfo.getCouponInfoList();
            if (couponInfoList == null) {
                return new CouponList(arrayList);
            }
            Iterator<CouponInfo> it = couponInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(new Coupon(it.next()));
            }
            return new CouponList(arrayList);
        } catch (IOException unused) {
            throw new AuthApiException(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeeList getFeeList() throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        FeeInfo.ActionType[] actionTypeArr = this.mCard.isIssued() ? new FeeInfo.ActionType[]{FeeInfo.ActionType.recharge} : new FeeInfo.ActionType[]{FeeInfo.ActionType.issue, FeeInfo.ActionType.issueAndRecharge};
        try {
            JSONArray jSONArrayQueryCardProduct = this.mTSMAuthManager.queryCardProduct(EnvironmentConfig.getContext(), CardGroupType.TRANSCARD, this.mCard.getId(), TSMLocationService.getInstance(EnvironmentConfig.getContext()).getLastLocation());
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (jSONArrayQueryCardProduct != null && jSONArrayQueryCardProduct.length() >= 1) {
                JSONArray jSONArray = jSONArrayQueryCardProduct.getJSONObject(0).getJSONArray("fees");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    FeeInfo feeInfo = new FeeInfo();
                    feeInfo.parse(jSONObject);
                    if (Arrays.asList(actionTypeArr).contains(feeInfo.mActionType)) {
                        arrayList.add(new Fee(feeInfo));
                    }
                }
                return new FeeList(arrayList);
            }
            return new FeeList(objArr2 == true ? 1 : 0);
        } catch (JSONException e) {
            LogUtils.e("failed to get cards on network!", e);
            throw new AuthApiException(16);
        }
    }

    public OrderRecordList getOrderRecordList() throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        try {
            RechargeOrderResponseInfo rechargeOrderResponseInfo = (RechargeOrderResponseInfo) HttpClient.getInstance(EnvironmentConfig.getContext()).execute(new RechargeOrderListRequest(this.mCard.mCardInfo, null)).getResult();
            if (!rechargeOrderResponseInfo.isSuccess()) {
                throw new AuthApiException(rechargeOrderResponseInfo.getErrorCode(), rechargeOrderResponseInfo.getErrorDesc());
            }
            List<RechargeOrderInfo> rechargeOrderInfoList = rechargeOrderResponseInfo.getRechargeOrderInfoList();
            if (rechargeOrderInfoList == null) {
                return new OrderRecordList(arrayList);
            }
            Iterator<RechargeOrderInfo> it = rechargeOrderInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(new OrderRecord(it.next(), this.mCard));
            }
            return new OrderRecordList(arrayList);
        } catch (IOException unused) {
            throw new AuthApiException(2);
        }
    }

    public List<String> getPayChannelList() {
        SeCard seCard = this.mCard;
        if (seCard != null) {
            CardInfo cardInfo = seCard.mCardInfo;
            if (cardInfo instanceof PayableCardInfo) {
                return ((PayableCardInfo) cardInfo).getPaymentChannels();
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderList getPendingOrderList() throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayQueryByUserId = this.mTSMAuthManager.queryByUserId(EnvironmentConfig.getContext());
        List list = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (jSONArrayQueryByUserId == null) {
            return new OrderList(list);
        }
        for (int i = 0; i < jSONArrayQueryByUserId.length(); i++) {
            OrderInfo orderInfo = new OrderInfo();
            try {
                orderInfo.parse(jSONArrayQueryByUserId.getJSONObject(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (this.mCard.getId().equals(orderInfo.mCardType)) {
                arrayList.add(new Order(orderInfo, this.mCard));
            }
        }
        return new OrderList(arrayList);
    }

    public int getServiceFee() {
        return this.mServiceFee;
    }

    public void setCaptcha(String str) {
        this.mCaptcha = str;
    }

    public void setCoupon(Coupon coupon) {
        Fee fee = this.mFee;
        if (fee == null) {
            throw new IllegalStateException("fee is null on setCoupon");
        }
        fee.mFeeInfo.setCouponInfo(coupon == null ? null : coupon.mCouponInfo);
    }

    public void setFee(Fee fee) {
        Fee fee2 = this.mFee;
        if (fee2 != null) {
            fee2.mFeeInfo.setCouponInfo(null);
        }
        this.mFee = fee;
    }

    public void setIdentityCode(String str) {
        this.mIdentityCode = str;
    }

    public void setPayChannel(String str) {
        this.mPayChannel = str;
    }

    public void setPhoneNum(String str) {
        this.mPhoneNum = str;
    }
}
