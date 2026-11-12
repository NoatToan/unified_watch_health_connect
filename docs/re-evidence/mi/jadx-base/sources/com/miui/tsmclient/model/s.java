package com.miui.tsmclient.model;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoManager;
import com.miui.tsmclient.entity.OrderResponseInfo;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.entity.TransferOutOrderInfo;
import com.miui.tsmclient.entity.TransferOutResponseInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.LogUtils;
import defpackage.ljs;
import defpackage.tis;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class s extends BaseModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f10396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tis f10397b;

    public class a implements ResponseListener<OrderResponseInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PayableCardInfo f10398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ResponseListener f10399b;

        public a(PayableCardInfo payableCardInfo, ResponseListener responseListener) {
            this.f10398a = payableCardInfo;
            this.f10399b = responseListener;
        }

        @Override // com.miui.tsmclient.common.net.ResponseListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFailed(int i, String str, OrderResponseInfo orderResponseInfo) {
            LogUtils.e("startTransferIn called! e:" + str);
            ResponseListener responseListener = this.f10399b;
            if (responseListener != null) {
                responseListener.onFailed(i, str, this.f10398a);
            }
        }

        @Override // com.miui.tsmclient.common.net.ResponseListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(OrderResponseInfo orderResponseInfo) {
            this.f10398a.updateOrderInfo(orderResponseInfo.getOrderInfo());
            ResponseListener responseListener = this.f10399b;
            if (responseListener != null) {
                responseListener.onSuccess(this.f10398a);
            }
        }
    }

    public static class b extends SecureRequest<TransferOutResponseInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CardInfo f10400a;

        public b(PayableCardInfo payableCardInfo) {
            super("POST", TSMAuthContants.URL_PREPARE_TRANSFERS_OUT, TypeToken.get(TransferOutResponseInfo.class));
            this.f10400a = payableCardInfo;
            addParams(TSMAuthContants.PARAM_CLAIMED_BALANCE, String.valueOf(payableCardInfo.mCardBalance)).addParams("cardName", payableCardInfo.mCardType).addParams(TSMAuthContants.PARAM_SKIP_OWNER_CHECK, "true").addParams("contact", payableCardInfo.getPhoneNumber()).addParams("deviceModel", ljs.b(payableCardInfo)).addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, ljs.f(payableCardInfo)).addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, ljs.n());
            if (TextUtils.isEmpty(payableCardInfo.mRealCardNo)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TSMAuthContants.PARAM_LOGICAL_NO, payableCardInfo.mRealCardNo);
                addParams("extra", jSONObject.toString());
            } catch (JSONException e) {
                LogUtils.e("CreateTransferOutOrderRequest addParams throws e", e);
            }
        }

        @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
        public void addExtraParams() throws IOException {
            super.addExtraParams();
            try {
                addParams("cplc", this.f10400a.getTerminal().getCPLC());
            } catch (IOException | InterruptedException e) {
                throw new IOException("CreateTransferOutOrderRequest getExtraParams failed", e);
            }
        }
    }

    public final BaseResponse a(PayableCardInfo payableCardInfo) {
        try {
            TransferOutResponseInfo transferOutResponseInfo = (TransferOutResponseInfo) HttpClient.getInstance(getContext()).execute(new b(payableCardInfo)).getResult();
            if (transferOutResponseInfo != null) {
                LogUtils.d("createTransferOutOrder, code:" + transferOutResponseInfo.getErrorCode() + ", msg:" + transferOutResponseInfo.getErrorDesc());
                TransferOutOrderInfo transferOutOrderInfo = transferOutResponseInfo.getTransferOutOrderInfo();
                if (transferOutOrderInfo == null) {
                    return new BaseResponse(transferOutResponseInfo.getErrorCode(), transferOutResponseInfo.getErrorDesc(), new Object[0]);
                }
                transferOutOrderInfo.setOrderType(TransferOutOrderInfo.ORDER_TYPE_TRANSFER);
                payableCardInfo.setUnfinishTransferOutInfo(transferOutOrderInfo);
                payableCardInfo.setOrderId(transferOutOrderInfo.getOrderId());
                return new BaseResponse(0, new Object[0]);
            }
        } catch (Exception e) {
            LogUtils.e("CreateTransferOutOrderRequest ExecutionException occurred", e);
        }
        return new BaseResponse(-2, new Object[0]);
    }

    public BaseResponse b(PayableCardInfo payableCardInfo) {
        BaseResponse baseResponseA = this.f10396a.a(getContext(), payableCardInfo, (Bundle) null);
        return baseResponseA.mResultCode != 0 ? baseResponseA : d(payableCardInfo);
    }

    public BaseResponse c(PayableCardInfo payableCardInfo) {
        BaseResponse baseResponseA = this.f10396a.a(getContext(), payableCardInfo, (Bundle) null);
        if (baseResponseA.mResultCode != 0) {
            return baseResponseA;
        }
        BaseResponse baseResponseA2 = a(payableCardInfo);
        return baseResponseA2.mResultCode != 0 ? baseResponseA2 : d(payableCardInfo);
    }

    public BaseResponse d(PayableCardInfo payableCardInfo) {
        TransferOutOrderInfo unfinishTransferOutInfo = payableCardInfo.getUnfinishTransferOutInfo();
        Bundle bundle = new Bundle();
        if (unfinishTransferOutInfo != null) {
            bundle.putString("order_id", unfinishTransferOutInfo.getOrderId());
            bundle.putString("authentication_code", unfinishTransferOutInfo.getTransferOutToken());
        }
        return CardInfoManager.getInstance(getContext()).transferOut(payableCardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.BaseModel
    public void onInit() {
        this.f10396a = new m(getContext());
    }

    @Override // com.miui.tsmclient.model.BaseModel, com.miui.tsmclient.common.mvp.IModel
    public void release() {
        HttpClient.getInstance(getContext()).cancel(this.f10397b);
    }

    public void a(PayableCardInfo payableCardInfo, ResponseListener<CardInfo> responseListener) {
        if (payableCardInfo != null && payableCardInfo.getTransferInOrder() != null && !TextUtils.isEmpty(payableCardInfo.getTransferInOrder().mOrderId)) {
            HttpClient.getInstance(getContext()).cancel(this.f10397b);
            this.f10397b = new tis(getContext(), payableCardInfo, new a(payableCardInfo, responseListener));
            HttpClient.getInstance(getContext()).enqueue(this.f10397b);
            return;
        }
        LogUtils.e(s.class.getSimpleName() + " startTransferIn() called, but param info is null!");
        if (responseListener != null) {
            responseListener.onFailed(1, "", null);
        }
    }
}
