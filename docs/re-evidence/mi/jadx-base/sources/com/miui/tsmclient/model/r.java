package com.miui.tsmclient.model;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoManager;
import com.miui.tsmclient.entity.ConfigInfo;
import com.miui.tsmclient.entity.GroupConfigInfo;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.entity.ReturnCardPayAccountExtra;
import com.miui.tsmclient.entity.TransferOutOrderInfo;
import com.miui.tsmclient.entity.TransferOutResponseInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.net.request.ConfigListRequest;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import defpackage.ljs;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class r extends BaseModel {

    public static class a extends SecureRequest<TransferOutResponseInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CardInfo f10395a;

        /* JADX WARN: Code duplicated, block: B:14:0x0066  */
        /* JADX WARN: Code duplicated, block: B:21:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
        public a(PayableCardInfo payableCardInfo, Bundle bundle) {
            String str;
            super("POST", TSMAuthContants.URL_PREPARE_RETURN_CARD, TypeToken.get(TransferOutResponseInfo.class));
            this.f10395a = payableCardInfo;
            addParams(TSMAuthContants.PARAM_CLAIMED_BALANCE, String.valueOf(payableCardInfo.mCardBalance)).addParams("cardName", payableCardInfo.mCardType).addParams("contact", payableCardInfo.getPhoneNumber()).addParams("deviceModel", ljs.b(payableCardInfo)).addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, ljs.f(payableCardInfo)).addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, ljs.n());
            if (!payableCardInfo.mSupportPhoneReturnCard && !payableCardInfo.mSupportWearableReturnCard) {
                str = payableCardInfo.mSupportMoveCardReturnCard ? Constants.RETURN_SOURCE_TYPE_MOVE_CARD_RETURN_CARD : "RETURN";
                if (bundle != null) {
                    addParams("contact", bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_PHONE_NUMBER));
                    addParams(TSMAuthContants.PARAM_RETURN_CARD_REASON, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_REASON_CODE));
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_TYPE, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_PAY_ACCOUNT_TYPE));
                        jSONObject.put(TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_NAME, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_PAY_ACCOUNT_NAME));
                        jSONObject.put(TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_ID, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_PAY_ACCOUNT_ID));
                        jSONObject.put(TSMAuthContants.PARAM_AUTH_CODE, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_AUTH_CODE));
                        addParams(TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_INFO, jSONObject.toString());
                    } catch (JSONException e) {
                        LogUtils.e("CreateReturnCardRequest addParams fails", e);
                    }
                }
                if (TextUtils.isEmpty(payableCardInfo.mRealCardNo)) {
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(TSMAuthContants.PARAM_LOGICAL_NO, payableCardInfo.mRealCardNo);
                    addParams("extra", jSONObject2.toString());
                } catch (JSONException e2) {
                    LogUtils.e("CreateReturnCardRequest addParams fails", e2);
                    return;
                }
            }
            addParams("source", str);
            if (bundle != null) {
                addParams("contact", bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_PHONE_NUMBER));
                addParams(TSMAuthContants.PARAM_RETURN_CARD_REASON, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_REASON_CODE));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_TYPE, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_PAY_ACCOUNT_TYPE));
                jSONObject3.put(TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_NAME, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_PAY_ACCOUNT_NAME));
                jSONObject3.put(TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_ID, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_PAY_ACCOUNT_ID));
                jSONObject3.put(TSMAuthContants.PARAM_AUTH_CODE, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_AUTH_CODE));
                addParams(TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_INFO, jSONObject3.toString());
            }
            if (TextUtils.isEmpty(payableCardInfo.mRealCardNo)) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(TSMAuthContants.PARAM_LOGICAL_NO, payableCardInfo.mRealCardNo);
                addParams("extra", jSONObject4.toString());
            }
        }

        @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
        public void addExtraParams() throws IOException {
            super.addExtraParams();
            try {
                addParams("cplc", this.f10395a.getTerminal().getCPLC());
            } catch (IOException | InterruptedException e) {
                throw new IOException("CreateReturnCardRequest getExtraParams failed", e);
            }
        }
    }

    public final BaseResponse a(PayableCardInfo payableCardInfo, Bundle bundle) {
        try {
            TransferOutResponseInfo transferOutResponseInfo = (TransferOutResponseInfo) HttpClient.getInstance(getContext()).execute(new a(payableCardInfo, bundle)).getResult();
            if (transferOutResponseInfo != null) {
                LogUtils.d("createReturnCardRequest, code:" + transferOutResponseInfo.getErrorCode() + ", msg:" + transferOutResponseInfo.getErrorDesc());
                TransferOutOrderInfo transferOutOrderInfo = transferOutResponseInfo.getTransferOutOrderInfo();
                if (transferOutOrderInfo == null) {
                    return new BaseResponse(transferOutResponseInfo.getErrorCode(), transferOutResponseInfo.getErrorDesc(), new Object[0]);
                }
                transferOutOrderInfo.setOrderType("RETURN");
                payableCardInfo.setUnfinishTransferOutInfo(transferOutOrderInfo);
                return new BaseResponse(0, new Object[0]);
            }
        } catch (Exception e) {
            LogUtils.e("createReturnCardRequest ExecutionException occurred", e);
        }
        return new BaseResponse(-2, new Object[0]);
    }

    public BaseResponse b(PayableCardInfo payableCardInfo, Bundle bundle) {
        BaseResponse baseResponseF = g.a(payableCardInfo.mCardType).f(getContext(), payableCardInfo, bundle);
        if (!baseResponseF.isSuccess()) {
            return baseResponseF;
        }
        if (payableCardInfo.mIsNeedLockCardBeforeReturn) {
            ljs.j(getContext(), payableCardInfo);
        }
        BaseResponse baseResponseA = a(payableCardInfo, bundle);
        return baseResponseA.mResultCode != 0 ? baseResponseA : a(payableCardInfo);
    }

    public BaseResponse a(PayableCardInfo payableCardInfo) {
        TransferOutOrderInfo unfinishTransferOutInfo = payableCardInfo.getUnfinishTransferOutInfo();
        Bundle bundle = new Bundle();
        if (unfinishTransferOutInfo == null) {
            return new BaseResponse(-2, new Object[0]);
        }
        bundle.putString("orderId", unfinishTransferOutInfo.getOrderId());
        bundle.putString("authentication_code", unfinishTransferOutInfo.getTransferOutToken());
        bundle.putBoolean(com.miui.tsmclient.model.mitsm.f.EXTRA_KEY_INTERNAL_RETURN, true);
        BaseResponse baseResponseReturnCard = CardInfoManager.getInstance(getContext()).returnCard(payableCardInfo, bundle);
        if (baseResponseReturnCard.isSuccess()) {
            try {
                GroupConfigInfo groupConfigInfo = (GroupConfigInfo) HttpClient.getInstance(getContext()).execute(new ConfigListRequest(payableCardInfo, ConfigInfo.RETURN_SUCCESS_MSG, null)).getResult();
                if (groupConfigInfo == null) {
                    return baseResponseReturnCard;
                }
                List<String> contentList = groupConfigInfo.getContentList(null, ConfigInfo.RETURN_SUCCESS_MSG);
                if (contentList.size() > 0) {
                    baseResponseReturnCard.mMsg = contentList.get(0);
                }
            } catch (IOException e) {
                LogUtils.e("querying client config return success msg exception" + e);
            }
        }
        return baseResponseReturnCard;
    }
}
