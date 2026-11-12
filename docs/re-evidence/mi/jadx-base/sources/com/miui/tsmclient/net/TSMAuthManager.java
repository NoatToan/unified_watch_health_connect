package com.miui.tsmclient.net;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.miui.tsmclient.account.AccountInfo;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.ActionToken;
import com.miui.tsmclient.entity.CardGroupType;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.miui.tsmclient.entity.CheckMifareIssuedResponse;
import com.miui.tsmclient.entity.DCEPCardInfo;
import com.miui.tsmclient.entity.DeductInfo;
import com.miui.tsmclient.entity.FmshUserInfo;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.entity.OrderDetailInfo;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.entity.RefundAuthorizationInfo;
import com.miui.tsmclient.entity.RefundChannelInfo;
import com.miui.tsmclient.entity.RefundInfo;
import com.miui.tsmclient.entity.ReturnCardPayAccountExtra;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.DoorCardConstants;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.TSMLocationService;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TSMAuthManager extends BaseAuthManager {
    public JSONObject acquireToken(Context context, CardInfo cardInfo) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        JSONObject jSONObject = (JSONObject) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_ACQUIRE_TOKEN, AuthRequest.RespContentType.json).addParams(TSMAuthContants.PARAM_SEID, getSEId(cardInfo)).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfo)).addParams("cardName", cardInfo.mCardType).addParams("deviceId", DeviceUtils.getDeviceId(context, cardInfo)).addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, DeviceUtils.getMIUIRomType(cardInfo)).addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, DeviceUtils.getRomVersion()).create());
        LogUtils.d("acquireToken api response: " + jSONObject.toString());
        return jSONObject;
    }

    public BaseResponse addHardwareWallet(Context context, CardInfo cardInfo, Bundle bundle) {
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_ADD_HARDWARE_WALLET, AuthRequest.RespContentType.json).addParams("cplc", getCplc(cardInfo)).addParams(TSMAuthContants.PARAM_WALLETINFO, ((DCEPCardInfo) cardInfo).toJson()).create());
            return new BaseResponse(0, new Object[0]);
        } catch (AuthApiException e) {
            int i = e.mErrorCode;
            return new BaseResponse(i, ErrorCode.getErrorText(context, i, e.mErrorMsg), new Object[0]);
        }
    }

    public void addLocationParams(AuthRequest.AuthRequestBuilder authRequestBuilder, Location location) {
        if (location != null) {
            authRequestBuilder.addParams("la", String.valueOf(location.getLatitude())).addParams(TSMAuthContants.PARAM_LONGITUDE, String.valueOf(location.getLongitude()));
        }
    }

    public String addUserAuthCode(Context context, String str) throws AuthApiException {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        AccountInfo accountInfo = getAccountInfo(context);
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_DUMMY, null);
        return ((JSONObject) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_SCAN_PAY_ADD_USER_AUTH_CODE, AuthRequest.RespContentType.json).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfoMakeCardInfo)).addParams("deviceId", DeviceUtils.getDeviceId(context, cardInfoMakeCardInfo)).addParams("cplc", EnvironmentConfig.isSupportNfc() ? getCplc(cardInfoMakeCardInfo) : "").addParams(TSMAuthContants.PARAM_PAY_URL, str).create())).optString(TSMAuthContants.PARAM_PAY_URL);
    }

    public BaseResponse afterSaleTransferCard(Context context, CardInfo cardInfo, Bundle bundle) {
        int i;
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            if (bundle != null) {
                try {
                    jSONObject.put(TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_TYPE, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_PAY_ACCOUNT_TYPE));
                    jSONObject.put(TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_NAME, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_PAY_ACCOUNT_NAME));
                    jSONObject.put(TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_ID, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_PAY_ACCOUNT_ID));
                    jSONObject.put(TSMAuthContants.PARAM_AUTH_CODE, bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_AUTH_CODE));
                } catch (JSONException e) {
                    LogUtils.e("afterSaleTransferCard addParams fails", e);
                }
            }
            AccountInfo accountInfo = getAccountInfo(context);
            LogUtils.d("afterSaleTransferCardRequest api response: " + ((JSONObject) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_AFTER_SALE_TRANSFER_CARD, AuthRequest.RespContentType.json).addParams("cardName", cardInfo.mCardType).addParams("cplc", getCplc(cardInfo)).addParams("orderId", cardInfo.getOrderId()).addParams(TSMAuthContants.PARAM_RETURN_CARD_PAY_ACCOUNT_INFO, jSONObject.toString()).addParams("contact", bundle.getString(ReturnCardPayAccountExtra.KEY_RETURN_CARD_PHONE_NUMBER)).create())));
            str = "";
            i = 0;
        } catch (AuthApiException e2) {
            LogUtils.e("afterSaleTransferCardRequest with exception ", e2);
            i = e2.mErrorCode;
            str = e2.mErrorMsg;
        }
        return new BaseResponse(i, str, new Object[0]);
    }

    public BaseResponse bindAuthorization(Context context, CardInfo cardInfo, String str, String str2) {
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_BIND_AUTHORIZATION, AuthRequest.RespContentType.json).addParams("cplc", getCplc(cardInfo)).addParams(TSMAuthContants.PARAM_AUTH_CODE, str).addParams("cardName", cardInfo.mCardType).addParams(TSMAuthContants.PARAM_AUTH_CHANNEL, str2).create());
            LogUtils.d("bindAuthorization api success");
            return new BaseResponse(0, new Object[0]);
        } catch (AuthApiException e) {
            LogUtils.e("bindAuthorization failed ", e);
            return new BaseResponse(e.mErrorCode, e.mErrorMsg, new Object[0]);
        }
    }

    public CheckMifareIssuedResponse checkMifareIssued(Context context, MifareTag mifareTag) throws AuthApiException {
        if (mifareTag == null) {
            return new CheckMifareIssuedResponse();
        }
        AccountInfo accountInfo = getAccountInfo(context);
        JSONObject jSONObject = (JSONObject) sendGetRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_CHECK_IF_ISSUED, AuthRequest.RespContentType.json).addParams("cplc", getCplc(CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_DUMMY, null))).addParams("vcUid", mifareTag.getUid()).create());
        LogUtils.d("checkMifareIssued api response: " + jSONObject.toString());
        return (CheckMifareIssuedResponse) new Gson().fromJson(jSONObject.toString(), CheckMifareIssuedResponse.class);
    }

    public String checkPayString(Context context, String str, String str2) throws AuthApiException {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        AccountInfo accountInfo = getAccountInfo(context);
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_DUMMY, null);
        JSONObject jSONObject = (JSONObject) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_SCAN_PAY_VERIFY_URL, AuthRequest.RespContentType.json).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfoMakeCardInfo)).addParams("deviceId", DeviceUtils.getDeviceId(context, cardInfoMakeCardInfo)).addParams("cplc", EnvironmentConfig.isSupportNfc() ? getCplc(cardInfoMakeCardInfo) : "").addParams("payString", str).addParams(TSMAuthContants.PARAM_PAY_TYPE, str2).create());
        return TextUtils.equals(jSONObject.optString(TSMAuthContants.PARAM_RESP_CODE), "SUCCESS") ? jSONObject.optString("payString") : "";
    }

    public BaseResponse communityDummyCardCancel(Context context, MifareCardInfo mifareCardInfo) {
        String str;
        int i;
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            str = (String) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_COMMUNITY_DUMMY_CARD_CANCEL, AuthRequest.RespContentType.json).addParams("cplc", getCplc(mifareCardInfo)).addParams(TSMAuthContants.PARAM_SEID, getSEId(mifareCardInfo)).addParams("userId", accountInfo.getUserId()).addParams(TSMAuthContants.PARAM_PARTNER_ID, DoorCardConstants.PARTNER_ID).addParams("productId", mifareCardInfo.getProductId()).addParams("businessId", mifareCardInfo.getBusinessId()).create());
            i = 0;
        } catch (AuthApiException e) {
            LogUtils.e("communityDummyCardCancel failed ", e);
            str = e.mErrorMsg;
            i = e.mErrorCode;
        }
        return new BaseResponse(i, str, new Object[0]);
    }

    public JSONObject confirmProtocolVersion(Context context, long j, String str) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        AuthRequest.AuthRequestBuilder authRequestBuilderAddParams = AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_CONFIRM, AuthRequest.RespContentType.json).addParams("id", String.valueOf(j)).addParams(TSMAuthContants.PARAM_SEID, EnvironmentConfig.isSupportNfc(context) ? getSEId(new CardInfo(CardInfo.CARD_TYPE_DUMMY)) : DeviceUtils.getDeviceId(context, null));
        if (!TextUtils.isEmpty(str)) {
            authRequestBuilderAddParams.addParams(TSMAuthContants.PARAM_SERVICE_NAME, str);
        }
        return (JSONObject) sendRequest(context, accountInfo, authRequestBuilderAddParams.create());
    }

    public BaseResponse createDeductOrder(Context context, CardInfo cardInfo, DeductInfo deductInfo) {
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            JSONObject jSONObject = (JSONObject) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_CREATE_DEDUCT_ORDER, AuthRequest.RespContentType.json).addParams(TSMAuthContants.PARAM_FEEID, String.valueOf(deductInfo.getFeeId())).addParams(TSMAuthContants.PARAM_SEID, getSEId(cardInfo)).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfo)).addParams(TSMAuthContants.PARAM_CARDNO, cardInfo.mCardNo).addParams("balance", String.valueOf(cardInfo.mCardBalance)).addParams("deviceId", DeviceUtils.getDeviceId(context, cardInfo)).addParams("cplc", getCplc(cardInfo)).addParams(TSMAuthContants.PARAM_DEDUCT_ID, deductInfo.getDeductId()).create());
            LogUtils.d("createDeductOrder api response: " + jSONObject.toString());
            return new BaseResponse(0, "", jSONObject.optString("orderId"));
        } catch (AuthApiException e) {
            LogUtils.e("createDeductOrder failed with an apiException, code:" + e.mErrorCode + ", msg:" + e.mErrorMsg, e);
            return new BaseResponse(e.mErrorCode, e.mErrorMsg, new Object[0]);
        }
    }

    public JSONObject createOrder(Context context, int i, CardInfo cardInfo, Bundle bundle) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        AuthRequest.AuthRequestBuilder authRequestBuilderAddParams = AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_CREATE_ORDER_V2, AuthRequest.RespContentType.json).addParams(TSMAuthContants.PARAM_FEEID, String.valueOf(i)).addParams(TSMAuthContants.PARAM_SEID, getSEId(cardInfo)).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfo)).addParams(TSMAuthContants.PARAM_CARDNO, cardInfo.mCardNo).addParams("balance", String.valueOf(cardInfo.mCardBalance)).addParams("deviceId", DeviceUtils.getDeviceId(context, cardInfo)).addParams("cplc", getCplc(cardInfo)).addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, DeviceUtils.getMIUIRomType(cardInfo)).addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, DeviceUtils.getRomVersion());
        String string = bundle.getString(TSMAuthContants.HEADER_UNDERAGE_VERIFY_KEY);
        if (!TextUtils.isEmpty(string)) {
            authRequestBuilderAddParams.addHeader(TSMAuthContants.HEADER_UNDERAGE_VERIFY_KEY, string);
        }
        Location lastLocation = TSMLocationService.getInstance(context).getLastLocation();
        if (lastLocation != null) {
            LogUtils.d("createOrderV2 la:" + lastLocation.getLatitude() + ", lo:" + lastLocation.getLongitude());
            authRequestBuilderAddParams.addParams("la", String.valueOf(lastLocation.getLatitude())).addParams(TSMAuthContants.PARAM_LONGITUDE, String.valueOf(lastLocation.getLongitude()));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packageName", context.getPackageName());
            jSONObject.put(TSMAuthContants.PARAM_SUPPORT_COUPON, true);
            if (bundle.containsKey("cityId")) {
                authRequestBuilderAddParams.addParams("cityId", String.valueOf(bundle.getInt("cityId", 5200)));
            }
            if (bundle.containsKey(TSMAuthContants.EXTRA_CUSTOM_FEE)) {
                authRequestBuilderAddParams.addParams(TSMAuthContants.EXTRA_CUSTOM_FEE, bundle.getString(TSMAuthContants.EXTRA_CUSTOM_FEE));
                LogUtils.d("createOrder extraCustomFee:" + bundle.getString(TSMAuthContants.EXTRA_CUSTOM_FEE));
            }
            if (bundle.containsKey(TSMAuthContants.PARAM_TRANSFER_ORDERID)) {
                jSONObject.put(TSMAuthContants.PARAM_TRANSFER_ORDERID, bundle.getString(TSMAuthContants.PARAM_TRANSFER_ORDERID));
            }
            if (bundle.containsKey(TSMAuthContants.PARAM_COUPON_ID)) {
                jSONObject.put(TSMAuthContants.PARAM_COUPON_ID, bundle.getLong(TSMAuthContants.PARAM_COUPON_ID));
            }
            if (bundle.containsKey("payChannel")) {
                jSONObject.put("payChannel", bundle.getString("payChannel"));
            }
            if (bundle.containsKey("qrCode")) {
                jSONObject.put("qrCode", bundle.getBoolean("qrCode"));
            }
            if (bundle.containsKey(TSMAuthContants.PARAM_PAY_TYPE)) {
                jSONObject.put(TSMAuthContants.PARAM_PAY_TYPE, bundle.getString(TSMAuthContants.PARAM_PAY_TYPE));
            }
            if (bundle.containsKey("phone")) {
                jSONObject.put("phone", bundle.getString("phone"));
            }
            if (bundle.containsKey("captcha")) {
                jSONObject.put("captcha", bundle.getString("captcha"));
            }
            if (bundle.containsKey("identityCode")) {
                jSONObject.put("identityCode", bundle.getString("identityCode"));
            }
        } catch (JSONException e) {
            LogUtils.e("createOrder called! parse  error.", e);
        }
        if (jSONObject.length() > 0) {
            authRequestBuilderAddParams.addParams("extra", jSONObject.toString());
        }
        JSONObject jSONObject2 = (JSONObject) sendRequest(context, accountInfo, authRequestBuilderAddParams.create());
        LogUtils.t("createOrder api response: " + jSONObject2.toString());
        return jSONObject2;
    }

    public BaseResponse getAuthInfo(Context context, RefundChannelInfo refundChannelInfo, CardInfo cardInfo) {
        BaseResponse baseResponse = new BaseResponse(0, new Object[0]);
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            String string = sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_GET_PAY_AUTH_TOKEN, AuthRequest.RespContentType.json).addParams("cplc", getCplc(cardInfo)).addParams("cardName", cardInfo.mCardType).addParams(TSMAuthContants.PARAM_AUTH_CHANNEL, refundChannelInfo.getChannelName()).create()).toString();
            LogUtils.t("getAuthInfo api response: " + string);
            baseResponse.setDatas(RefundAuthorizationInfo.fromJson(string));
        } catch (AuthApiException e) {
            LogUtils.e("getAuthInfo failed ", e);
            baseResponse.mMsg = e.mErrorMsg;
            baseResponse.mResultCode = e.mErrorCode;
        }
        return baseResponse;
    }

    public String getCplc(CardInfo cardInfo) throws AuthApiException {
        try {
            return cardInfo.getTerminal().getCPLC();
        } catch (IOException e) {
            LogUtils.e("failed to get cplc", e);
            throw new AuthApiException(10);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            LogUtils.e("failed to get cplc", e2);
            throw new AuthApiException(11);
        }
    }

    public FmshUserInfo getFmshUserInfo(Context context, String str, String str2) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        AuthRequest.AuthRequestBuilder authRequestBuilderAddParams = AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_NEW_BIZ_PASS, AuthRequest.RespContentType.json).addParams("cplc", getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY))).addParams("deviceModel", DeviceUtils.getDeviceModel(null)).addParams("type", str);
        if (!TextUtils.isEmpty(str2)) {
            authRequestBuilderAddParams.addParams(TSMAuthContants.PARAM_APP_NO, str2);
        }
        return (FmshUserInfo) new Gson().fromJson(((JSONObject) sendRequest(context, accountInfo, authRequestBuilderAddParams.create())).toString(), FmshUserInfo.class);
    }

    public OrderDetailInfo getOrderDetailById(Context context, CardInfo cardInfo, String str) throws AuthApiException {
        if (cardInfo == null || TextUtils.isEmpty(str)) {
            LogUtils.e("getOrderDetailById failed. params is invalid");
            throw new AuthApiException(1);
        }
        AccountInfo accountInfo = getAccountInfo(context);
        String string = ((JSONObject) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_RECHARGE_ORDER_DETAIL, AuthRequest.RespContentType.json).addParams("orderId", str).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfo)).addParams("aid", cardInfo.mAid).addParams("cardName", cardInfo.mCardType).addParams("cplc", getCplc(cardInfo)).create())).toString();
        LogUtils.d("getOrderDetailById api response: " + string);
        return (OrderDetailInfo) new GsonBuilder().registerTypeAdapter(ActionToken.TokenType.class, new ActionToken.TokenTypeDeserializer()).registerTypeAdapter(OrderInfo.OrderStatus.class, new OrderInfo.OrderStatusDeserializer()).create().fromJson(string, OrderDetailInfo.class);
    }

    public String getSEId(CardInfo cardInfo) throws AuthApiException {
        try {
            String seid = cardInfo.getTerminal().getSeid();
            if (TextUtils.isEmpty(seid)) {
                throw new AuthApiException(13);
            }
            return seid;
        } catch (IOException e) {
            LogUtils.e("failed to get seId", e);
            throw new AuthApiException(10);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            LogUtils.e("failed to get seId", e2);
            throw new AuthApiException(11);
        }
    }

    public JSONArray queryAccountTransitCards(Context context) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        return (JSONArray) sendGetRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_ACCOUNT_QUERY_ALL_TRANSIT_CARDS, AuthRequest.RespContentType.json).addParams("cplc", getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY))).create());
    }

    public JSONObject queryAllServiceProtocol(Context context, String str, TSMAuthContants.ActionType actionType) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        AuthRequest.AuthRequestBuilder authRequestBuilderAddParams = AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_ALL_SERVICE_PROTOCOL, AuthRequest.RespContentType.json).addParams(TSMAuthContants.PARAM_SEID, EnvironmentConfig.isSupportNfc(context) ? getSEId(CardInfoFactory.makeCardInfo(str, null)) : DeviceUtils.getDeviceId(context, null)).addParams("deviceModel", DeviceUtils.getDeviceModel(null)).addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, DeviceUtils.getMIUIRomType(null)).addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, DeviceUtils.getRomVersion()).addParams("cardName", str);
        if (!TextUtils.equals(Constants.MIPAY_PRIVACY, str) && !TextUtils.equals(Constants.DOORCARD_PRIVACY, str)) {
            authRequestBuilderAddParams.addParams("actionType", actionType.toString());
        }
        return (JSONObject) sendGetRequest(context, accountInfo, authRequestBuilderAddParams.create());
    }

    public OrderInfo queryByOrderId(Context context, String str) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        JSONObject jSONObject = (JSONObject) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_BY_ORDERID, AuthRequest.RespContentType.json).addParams("orderId", str).create());
        if (jSONObject == null) {
            return null;
        }
        LogUtils.d("queryByOrderId api response: " + jSONObject.toString());
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.parse(jSONObject);
        return orderInfo;
    }

    public JSONArray queryByUserId(Context context) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        JSONArray jSONArray = (JSONArray) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_BY_USERID, AuthRequest.RespContentType.json).addParams(TSMAuthContants.PARAM_SEID, getSEId(cardInfo)).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfo)).addParams(TSMAuthContants.PARAM_SUPPORT_CARD_TRANSFER, "true").create());
        LogUtils.d("queryByUserId api response: " + jSONArray.toString());
        return jSONArray;
    }

    public JSONArray queryCardProduct(Context context, String str) throws IOException, AuthApiException {
        return queryCardProduct(context, CardGroupType.TRANSCARD, str, null);
    }

    public JSONArray queryCardProductGroup(Context context, CardGroupType cardGroupType, String str, Location location) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(TextUtils.isEmpty(str) ? CardInfo.CARD_TYPE_DUMMY : str, null);
        AuthRequest.AuthRequestBuilder authRequestBuilderAddParams = AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_CARD_PRODUCT_V3, AuthRequest.RespContentType.json).addParams("cplc", getCplc(cardInfoMakeCardInfo)).addParams("type", String.valueOf(cardGroupType.getId())).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfoMakeCardInfo)).addParams(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().toString()).addParams(TSMAuthContants.PARAM_SUPPORT_CARD_TRANSFER, "true");
        if (!TextUtils.isEmpty(str)) {
            authRequestBuilderAddParams.addParams("cardName", str);
        }
        addLocationParams(authRequestBuilderAddParams, location);
        JSONArray jSONArray = (JSONArray) sendRequest(context, accountInfo, authRequestBuilderAddParams.create());
        LogUtils.d("queryCardProductGroup api response: " + jSONArray.toString());
        return jSONArray;
    }

    public JSONArray queryCardsOnLoggingOut(Context context) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        JSONArray jSONArray = (JSONArray) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_CARDS_ON_LOGGING_OUT, AuthRequest.RespContentType.json).create());
        LogUtils.d("queryCardsOnLoggingOut api response: " + jSONArray.toString());
        return jSONArray;
    }

    public JSONArray queryChildCardProduct(Context context, String str) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(TextUtils.isEmpty(str) ? CardInfo.CARD_TYPE_DUMMY : str, null);
        JSONArray jSONArray = (JSONArray) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_CHILD_CARD_PRODUCT, AuthRequest.RespContentType.json).addParams(TSMAuthContants.PARAM_CARD_FAMILY, str).addParams("cplc", getCplc(cardInfoMakeCardInfo)).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfoMakeCardInfo)).addParams(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().toString()).addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, DeviceUtils.getMIUIRomType(cardInfoMakeCardInfo)).addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, DeviceUtils.getRomVersion()).create());
        LogUtils.d("queryChildCardProduct api response: " + jSONArray.toString());
        return jSONArray;
    }

    public BaseResponse queryClientVersions(Context context) {
        BaseResponse baseResponse = new BaseResponse(0, new Object[0]);
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
            JSONArray jSONArray = (JSONArray) sendGetRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_LATEST_VERSIONS, AuthRequest.RespContentType.json).addParams("deviceId", DeviceUtils.getDeviceId(context, cardInfo)).addParams("cplc", EnvironmentConfig.isSupportNfc() ? getCplc(cardInfo) : "").create());
            StringBuilder sb = new StringBuilder();
            sb.append("queryClientVersions api response: ");
            sb.append(jSONArray == null ? AbstractJsonLexerKt.NULL : jSONArray.toString());
            LogUtils.t(sb.toString());
            baseResponse.setDatas(jSONArray);
        } catch (AuthApiException e) {
            LogUtils.e("queryClientVersions failed ", e);
            int i = e.mErrorCode;
            baseResponse.mResultCode = i;
            baseResponse.mMsg = ErrorCode.getErrorText(context, i, e.mErrorMsg);
        }
        return baseResponse;
    }

    public JSONArray queryCloudTransitCard(Context context, CardGroupType cardGroupType, String str, Location location) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(TextUtils.isEmpty(str) ? CardInfo.CARD_TYPE_DUMMY : str, null);
        AuthRequest.AuthRequestBuilder authRequestBuilderAddParams = AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_CLOUD_TRANSIT_CARD, AuthRequest.RespContentType.json).addParams("cplc", getCplc(cardInfoMakeCardInfo)).addParams("type", String.valueOf(cardGroupType.getId())).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfoMakeCardInfo)).addParams(TSMAuthContants.PARAM_TSMCLIENT_VERSION_CODE, String.valueOf(DeviceUtils.getAppVersionCode(context))).addParams(TSMAuthContants.PARAM_TSMCLIENT_VERSION_NAME, String.valueOf(DeviceUtils.getAppVersionName(context))).addParams(TSMAuthContants.PARAM_SUPPORT_CARD_TRANSFER, "true");
        if (!TextUtils.isEmpty(str)) {
            authRequestBuilderAddParams.addParams("cardName", str);
        }
        addLocationParams(authRequestBuilderAddParams, location);
        JSONArray jSONArray = (JSONArray) sendRequest(context, accountInfo, authRequestBuilderAddParams.create());
        LogUtils.d("queryCloudTransitCard api response: " + jSONArray.toString());
        return jSONArray;
    }

    public DeductInfo queryDeductContract(Context context, CardInfo cardInfo) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        JSONObject jSONObject = (JSONObject) sendGetRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_DEDUCT_CONTRACT, AuthRequest.RespContentType.json).addParams("cplc", getCplc(cardInfo)).addParams("cardName", cardInfo.mCardType).create());
        LogUtils.d("queryDeductContract api response:" + jSONObject.toString());
        return (DeductInfo) new Gson().fromJson(jSONObject.toString(), DeductInfo.class);
    }

    public JSONArray queryGiftCardRequest(Context context, CardGroupType cardGroupType, String str, Location location) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(TextUtils.isEmpty(str) ? CardInfo.CARD_TYPE_DUMMY : str, null);
        AuthRequest.AuthRequestBuilder authRequestBuilderAddParams = AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_GIVE_CARD, AuthRequest.RespContentType.json).addParams("cplc", getCplc(cardInfoMakeCardInfo)).addParams("type", String.valueOf(cardGroupType.getId())).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfoMakeCardInfo)).addParams(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().toString());
        if (!TextUtils.isEmpty(str)) {
            authRequestBuilderAddParams.addParams("cardName", str);
        }
        addLocationParams(authRequestBuilderAddParams, location);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("needCouponInfo", true);
            jSONObject.put("supportGiveCard", true);
            jSONObject.put("activityType", Constants.EXTRA_GIVE_CARD);
        } catch (JSONException e) {
            LogUtils.e("queryGiftCardRequest called! parse  error.", e);
        }
        authRequestBuilderAddParams.addParams("extra", jSONObject.toString());
        JSONArray jSONArray = (JSONArray) sendRequest(context, accountInfo, authRequestBuilderAddParams.create());
        LogUtils.d("queryGiftCardRequest api response: " + jSONArray.toString());
        return jSONArray;
    }

    public BaseResponse queryHardwareWallet(Context context, CardInfo cardInfo) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            return new BaseResponse(0, sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_HARDWARE_WALLET, AuthRequest.RespContentType.json).addParams("cplc", getCplc(cardInfo)).addParams(TSMAuthContants.PARAM_WALLETID, ((DCEPCardInfo) cardInfo).getContextId()).create()));
        } catch (AuthApiException e) {
            int i = e.mErrorCode;
            baseResponse.mResultCode = i;
            baseResponse.mMsg = ErrorCode.getErrorText(context, i, e.mErrorMsg);
            return baseResponse;
        }
    }

    public JSONArray queryLoggingOutCardProduct(Context context) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_DUMMY, null);
        JSONArray jSONArray = (JSONArray) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_LOGGING_OUT_CARD_PRODUCT, AuthRequest.RespContentType.json).addParams(TSMAuthContants.PARAM_SEID, getSEId(cardInfoMakeCardInfo)).addParams("cplc", getCplc(cardInfoMakeCardInfo)).create());
        LogUtils.d("queryCleanSeCardProduct api response: " + jSONArray.toString());
        return jSONArray;
    }

    public OrderInfo queryOrderInfoByOrderId(Context context, String str) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        JSONObject jSONObject = (JSONObject) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_BY_ORDERID, AuthRequest.RespContentType.json).addParams("orderId", str).create());
        LogUtils.d("queryByOrderId api response: " + jSONObject.toString());
        return (OrderInfo) new GsonBuilder().registerTypeAdapter(OrderInfo.OrderStatus.class, new OrderInfo.OrderStatusDeserializer()).registerTypeAdapter(ActionToken.TokenType.class, new ActionToken.TokenTypeDeserializer()).create().fromJson(jSONObject.toString(), OrderInfo.class);
    }

    public JSONArray queryRecommendedTransitCard(Context context, CardGroupType cardGroupType, String str, int i) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        if (TextUtils.isEmpty(str)) {
            str = CardInfo.CARD_TYPE_DUMMY;
        }
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(str, null);
        JSONArray jSONArray = (JSONArray) sendGetRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_RECOMMENDED_CLOUD_TRANSIT_CARD, AuthRequest.RespContentType.json).addParams("cplc", getCplc(cardInfoMakeCardInfo)).addParams("type", String.valueOf(cardGroupType.getId())).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfoMakeCardInfo)).addParams(TSMAuthContants.PARAM_TSMCLIENT_VERSION_NAME, String.valueOf(DeviceUtils.getAppVersionName(context))).addParams(TSMAuthContants.PARAM_SUPPORT_CARD_TRANSFER, "true").addParams("cityId", String.valueOf(i)).create());
        LogUtils.d("queryRecommendedTransitCard api response: " + jSONArray.toString());
        return jSONArray;
    }

    public BaseResponse queryRefundChannels(Context context, CardInfo cardInfo) {
        BaseResponse baseResponse = new BaseResponse(0, new Object[0]);
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            JSONArray jSONArray = (JSONArray) sendGetRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_REFUND_MODE, AuthRequest.RespContentType.json).addParams("cardName", cardInfo.mCardType).create());
            LogUtils.t("queryRefundChannels api response: " + jSONArray.toString());
            baseResponse.setDatas(RefundChannelInfo.fromJson(jSONArray.toString()));
        } catch (AuthApiException e) {
            LogUtils.e("queryRefundChannels failed ", e);
            baseResponse.mMsg = ErrorCode.findText(context, e.mErrorCode);
            baseResponse.mResultCode = e.mErrorCode;
        }
        return baseResponse;
    }

    public String queryRefundStatus(Context context, String str) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        Object objSendRequest = sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.QUERY_REFUND_STATUS, AuthRequest.RespContentType.json).addParams("cplc", getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY))).addParams("cardName", str).create());
        if (objSendRequest == null) {
            return null;
        }
        return objSendRequest.toString();
    }

    public JSONArray queryServiceProtocol(Context context, List<String> list, TSMAuthContants.ActionType actionType) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        return (JSONArray) sendGetRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_SERVICE_PROTOCOL, AuthRequest.RespContentType.json).addParams(TSMAuthContants.PARAM_SEID, EnvironmentConfig.isSupportNfc(context) ? getSEId(CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_DUMMY, null)) : DeviceUtils.getDeviceId(context, null)).addParams(TSMAuthContants.PARAM_SERVICE_NAMES, new Gson().toJson(list)).addParams("actionType", actionType.toString()).create());
    }

    public JSONArray queryUncompletedBusiness(Context context, String str) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        JSONArray jSONArray = (JSONArray) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_UNCOMPLETED_BUSINESSES_LIST, AuthRequest.RespContentType.json).addParams("cplc", getCplc(cardInfo)).addParams(TSMAuthContants.PARAM_SEID, getSEId(cardInfo)).addParams("cardName", str).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfo)).addParams("packageName", context.getPackageName()).create());
        LogUtils.t("queryUncompletedBusiness api response: " + jSONArray.toString());
        return jSONArray;
    }

    public RefundInfo refund(Context context, String str) throws AuthApiException {
        if (TextUtils.isEmpty(str)) {
            throw new AuthApiException(1);
        }
        AccountInfo accountInfo = getAccountInfo(context);
        String string = ((JSONObject) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_REFUND_ORDER_BY_ID, AuthRequest.RespContentType.json).addParams("orderId", str).create())).toString();
        LogUtils.d("refund api response: " + string);
        return (RefundInfo) new Gson().fromJson(string, RefundInfo.class);
    }

    public JSONObject refundOrderById(Context context, String str) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        JSONObject jSONObject = (JSONObject) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_REFUND_ORDER_BY_ID, AuthRequest.RespContentType.json).addParams("orderId", str).create());
        LogUtils.d("refundOrderById api response: " + jSONObject.toString());
        return jSONObject;
    }

    public String refundServiceFee(Context context, String str) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        Object objSendRequest = sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.APPLY_REFUND, AuthRequest.RespContentType.json).addParams("cplc", getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY))).addParams("cardName", str).create());
        if (objSendRequest == null) {
            return null;
        }
        return objSendRequest.toString();
    }

    public BaseResponse removeHardwareWallet(Context context, CardInfo cardInfo, Bundle bundle) {
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_REMOVE_HARDWARE_WALLET, AuthRequest.RespContentType.json).addParams("cplc", getCplc(cardInfo)).addParams(TSMAuthContants.PARAM_WALLETINFO, ((DCEPCardInfo) cardInfo).toJson()).create());
            return new BaseResponse(0, new Object[0]);
        } catch (AuthApiException e) {
            int i = e.mErrorCode;
            return new BaseResponse(i, ErrorCode.getErrorText(context, i, e.mErrorMsg), new Object[0]);
        }
    }

    @Override // com.miui.tsmclient.net.BaseAuthManager
    public Object sendGetRequest(Context context, AccountInfo accountInfo, AuthRequest authRequest) throws AuthApiException {
        return super.sendGetRequest(context, accountInfo, authRequest);
    }

    @Override // com.miui.tsmclient.net.BaseAuthManager
    public Object sendRequest(Context context, AccountInfo accountInfo, AuthRequest authRequest) throws AuthApiException {
        return super.sendRequest(context, accountInfo, authRequest);
    }

    public BaseResponse sendVerificationCode(Context context, String str, String str2, String str3) {
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_TRANSIT_CARD_SEND_CAPTCHA, AuthRequest.RespContentType.json).addParams("phone", str).addParams("cardName", str2).addParams("cplc", getCplc(CardInfoFactory.makeCardInfo(TextUtils.isEmpty(str2) ? CardInfo.CARD_TYPE_DUMMY : str2, null))).addParams("actionType", str3).create());
            return new BaseResponse(0, new Object[0]);
        } catch (AuthApiException e) {
            int i = e.mErrorCode;
            return new BaseResponse(i, ErrorCode.getErrorText(context, i, e.mErrorMsg), new Object[0]);
        }
    }

    public BaseResponse updateCalcTimeWait(Context context, MifareCardInfo mifareCardInfo) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            return new BaseResponse(0, sendGetRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_CAL_TASK_WAIT_TIME, AuthRequest.RespContentType.json).addParams("cplc", getCplc(mifareCardInfo)).addParams(TSMAuthContants.PARAM_REFID, mifareCardInfo.getCid()).create()));
        } catch (AuthApiException e) {
            int i = e.mErrorCode;
            baseResponse.mResultCode = i;
            baseResponse.mMsg = ErrorCode.getErrorText(context, i, e.mErrorMsg);
            return baseResponse;
        }
    }

    public JSONObject updateCardBaseInfo(Context context, String str) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        return (JSONObject) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_UPDATE_CARD_BASE_INFO, AuthRequest.RespContentType.json).addParams("cplc", getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY))).addParams("message", str).create());
    }

    public void updateCommunityCardFlowStatus(Context context, MifareCardInfo mifareCardInfo) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        JSONObject jSONObject = (JSONObject) sendGetRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_FLOW_CONTROL, AuthRequest.RespContentType.json).addParams("cplc", getCplc(mifareCardInfo)).addParams(TSMAuthContants.PARAM_PARTNER_ID, DoorCardConstants.PARTNER_ID).addParams("userId", accountInfo.getUserId()).addParams("deviceModel", DeviceUtils.getDeviceModel(mifareCardInfo)).addParams("productId", mifareCardInfo.getProductId()).addParams(TSMAuthContants.PARAM_COMMUNITY_CODE, mifareCardInfo.getCommunityCode()).addParams("businessId", mifareCardInfo.getBusinessId()).create());
        String strOptString = jSONObject.optString("status");
        String strOptString2 = jSONObject.optString("ticket");
        String strOptString3 = jSONObject.optString("nextStep");
        strOptString.hashCode();
        switch (strOptString) {
            case "PHONE_VERIFIED":
            case "APPROVED":
                mifareCardInfo.setTicket(strOptString2);
                mifareCardInfo.setCommunityCardFlowStatus(3);
                break;
            case "PRIVILEGE_CHANGED":
                if ("DELETE".equals(strOptString3)) {
                    mifareCardInfo.setCommunityCardFlowStatus(5);
                    break;
                } else {
                    if (DoorCardConstants.FLOW_CONTROL_STEP_RE_ISSUE.equals(strOptString3)) {
                        mifareCardInfo.setTicket(strOptString2);
                        mifareCardInfo.setCommunityCardFlowStatus(4);
                    }
                    break;
                }
                break;
            case "NONE":
            case "REJECTED":
                mifareCardInfo.setCommunityCardFlowStatus(2);
                break;
            case "PENDING":
                mifareCardInfo.setCommunityCardFlowStatus(1);
                break;
            default:
                mifareCardInfo.setCommunityCardFlowStatus(0);
                break;
        }
    }

    public BaseResponse uploadDefaultTransCardTradeLogs(Context context, String str) {
        int i;
        String str2;
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_UPLOAD_DEFAULT_TRANSIT_CARD_TRADE_LOG, AuthRequest.RespContentType.json).addParams("cplc", getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY))).addParams("cardInfo", str).create());
            LogUtils.d("uploadDefaultTransCardTradeLogs success");
            str2 = "";
            i = 0;
        } catch (AuthApiException e) {
            LogUtils.e("uploadSwipeCardHciTradeInfo failed with an exception", e);
            i = e.mErrorCode;
            str2 = e.mErrorMsg;
        }
        return new BaseResponse(i, str2, new Object[0]);
    }

    public BaseResponse uploadSwipeCardErrorInfo(Context context, String str) {
        int i;
        String str2;
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_UPLOAD_SWIPE_CARD_ERROR_INFO, AuthRequest.RespContentType.json).addParams("message", str).create());
            LogUtils.d("uploadSwipeCardErrorInfo success");
            str2 = "";
            i = 0;
        } catch (AuthApiException e) {
            LogUtils.e("uploadSwipeCardErrorInfo failed with an exception", e);
            i = e.mErrorCode;
            str2 = e.mErrorMsg;
        }
        return new BaseResponse(i, str2, new Object[0]);
    }

    public BaseResponse uploadSwipeCardHciTradeInfo(Context context, String str) {
        int i;
        String str2;
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
            sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_UPLOAD_SWIPE_CARD_HCI_TRADE_INFO, AuthRequest.RespContentType.json).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfo)).addParams("cplc", getCplc(cardInfo)).addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, DeviceUtils.getMIUIRomType(null)).addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, DeviceUtils.getRomVersion()).addParams("message", str).create());
            LogUtils.d("uploadSwipeCardHciTradeInfo success");
            str2 = "";
            i = 0;
        } catch (AuthApiException e) {
            LogUtils.e("uploadSwipeCardHciTradeInfo failed with an exception", e);
            i = e.mErrorCode;
            str2 = e.mErrorMsg;
        }
        return new BaseResponse(i, str2, new Object[0]);
    }

    public BaseResponse uploadTransferOutResult(Context context, CardInfo cardInfo, Bundle bundle) {
        int errorCode;
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        PayableCardInfo payableCardInfo = cardInfo instanceof PayableCardInfo ? (PayableCardInfo) cardInfo : null;
        if (payableCardInfo == null || payableCardInfo.getUnfinishTransferOutInfo() == null) {
            return new BaseResponse(1, new Object[0]);
        }
        try {
            AccountInfo accountInfo = getAccountInfo(context);
            String str2 = (String) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_CONFIRM_TRANSFER_OUT, null).addParams("orderId", bundle.getString("order_id")).addParams("cplc", getCplc(payableCardInfo)).create());
            LogUtils.d("uploadTransferOutResult api response: " + str2);
            CommonResponseInfo commonResponseInfo = (CommonResponseInfo) new Gson().fromJson(str2, CommonResponseInfo.class);
            if (commonResponseInfo == null) {
                str = "";
                errorCode = 16;
            } else {
                String errorDesc = commonResponseInfo.getErrorDesc();
                if (commonResponseInfo.getErrorCode() == 200) {
                    str = errorDesc;
                    errorCode = 0;
                } else {
                    errorCode = commonResponseInfo.getErrorCode();
                    str = errorDesc;
                }
            }
        } catch (AuthApiException e) {
            LogUtils.e("confirmTransferOut failed with an apiException, code:" + e.mErrorCode + ", msg:" + e.mErrorMsg, e);
            errorCode = e.mErrorCode;
            str = e.mErrorMsg;
        }
        return new BaseResponse(errorCode, str, new Object[0]);
    }

    public boolean verifyOrder(Context context, String str) throws AuthApiException {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        AccountInfo accountInfo = getAccountInfo(context);
        JSONObject jSONObject = (JSONObject) sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_VERIFY_AND_CREATE_ORDER, AuthRequest.RespContentType.json).addParams("cplc", EnvironmentConfig.isSupportNfc() ? getCplc(CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_DUMMY, null)) : "").addParams("deviceId", DeviceUtils.getDeviceId(context, null)).addParams(TSMAuthContants.PARAM_ORDER_INFO, str).create());
        LogUtils.t("verifyOrder response: " + jSONObject);
        if (jSONObject != null) {
            return jSONObject.optBoolean(TSMAuthContants.PARAM_VERIFY_RESULT);
        }
        return false;
    }

    public JSONArray queryCardProduct(Context context, CardGroupType cardGroupType) throws IOException, AuthApiException {
        return queryCardProduct(context, cardGroupType, null, null);
    }

    public JSONArray queryCardProduct(Context context, CardGroupType cardGroupType, String str, Location location) throws AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(TextUtils.isEmpty(str) ? CardInfo.CARD_TYPE_DUMMY : str, null);
        AuthRequest.AuthRequestBuilder authRequestBuilderAddParams = AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_QUERY_CARD_PRODUCT, AuthRequest.RespContentType.json).addParams("cplc", getCplc(cardInfoMakeCardInfo)).addParams("type", String.valueOf(cardGroupType.getId())).addParams("deviceModel", DeviceUtils.getDeviceModel(cardInfoMakeCardInfo)).addParams(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().toString()).addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, DeviceUtils.getMIUIRomType(cardInfoMakeCardInfo)).addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, DeviceUtils.getRomVersion()).addParams(TSMAuthContants.PARAM_SUPPORT_CARD_TRANSFER, "true");
        if (!TextUtils.isEmpty(str)) {
            authRequestBuilderAddParams.addParams("cardName", str);
        }
        addLocationParams(authRequestBuilderAddParams, location);
        JSONArray jSONArray = (JSONArray) sendRequest(context, accountInfo, authRequestBuilderAddParams.create());
        LogUtils.d("queryCardProduct api response: " + jSONArray.toString());
        return jSONArray;
    }
}
