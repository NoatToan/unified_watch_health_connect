package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.miui.tsmclient.account.AccountInfo;
import com.miui.tsmclient.entity.BankCardInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.InAppTransData;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.entity.QrBankCardInfo;
import com.miui.tsmclient.entity.RiskInfo;
import com.miui.tsmclient.model.mitsm.j;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.AuthRequest;
import com.miui.tsmclient.net.BaseAuthManager;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.StringUtils;
import com.miui.tsmclient.util.TSMLocationService;
import com.tsmclient.smartcard.Coder;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import r.a;

/* JADX INFO: loaded from: classes3.dex */
public class b4s extends BaseAuthManager {
    public static final String APPLY_CHANNEL_BANK = "00";
    public static final String APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD = "10";
    public static final String APPLY_CHANNEL_TOKEN2_ONE_CLICK_BIND_CARD = "09";
    public static final String APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD = "11";
    public static final String APPLY_CHANNEL_XIAOMI = "01";
    private static final String AUTO_AUTHORIZE_FLAG = "1";
    public static final String BANK_CHANNEL_DATA = "bank_channel_data";
    public static final String EXTRA_APPLY_CHANNEL = "extra_apply_channel";
    public static final String EXTRA_AUTHENTICATION_CODE = "authentication_code";
    public static final String EXTRA_CARD_NAME = "card_name";
    public static final String EXTRA_CITY_ID = "extra_city_id";
    public static final String EXTRA_NEED_PHONE_NUMBER = "need_phone_number";
    public static final String EXTRA_NFC_ID = "nfc_id";
    public static final String EXTRA_SOURCE_CHANNEL = "extra_source_channel";
    private static final String LOG_MSG_MITSMCARDCLIENT = "MiTSMCardClient_";

    private String getSeId(CardInfo cardInfo) throws a {
        try {
            return cardInfo.getTerminal().getSeid();
        } catch (IOException e) {
            LogUtils.e("failed to get seId", e);
            throw new a(13);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            LogUtils.e("failed to get seId", e2);
            throw new a(11);
        }
    }

    public TsmRpcModels.AddCardForQrResponse addCardForQr(Context context, String str, Bundle bundle) throws a {
        LogUtils.v("addCardForQr start");
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (bundle == null) {
            LogUtils.d("failed to add card for qr, param is null");
            throw new a(1);
        }
        byte[] bArrHexStringToBytes = Coder.hexStringToBytes(bundle.getString(TSMAuthContants.PARAM_CIPHER_CARD_INFO));
        if (bArrHexStringToBytes == null) {
            LogUtils.d("failed to add card for qr, crypt card info is null");
            throw new a(1);
        }
        String deviceId = DeviceUtils.getDeviceId(context, null);
        if (TextUtils.isEmpty(deviceId)) {
            LogUtils.d("failed to add card for qr, deviceId is null");
            throw new a(1);
        }
        TsmRpcModels.AddCardForQrRequest.Builder deviceId2 = TsmRpcModels.AddCardForQrRequest.newBuilder().setCardInfo(ByteString.copyFrom(bArrHexStringToBytes)).setDeviceId(deviceId);
        if (!TextUtils.isEmpty(bundle.getString(TSMAuthContants.PARAM_CVN2))) {
            deviceId2.setCvn2(ByteString.copyFrom(Coder.hexStringToBytes(bundle.getString(TSMAuthContants.PARAM_CVN2))));
        }
        RiskInfo riskInfo = (RiskInfo) bundle.getParcelable(TSMAuthContants.PARAM_RISK_INFO);
        if (riskInfo != null) {
            Location lastLocation = TSMLocationService.getInstance(context).getLastLocation();
            riskInfo.setDeviceLocation(StringUtils.join(",", String.valueOf(lastLocation.getLongitude()), String.valueOf(lastLocation.getLatitude())));
            deviceId2.setRiskInfo(riskInfo.buildTSMRiskInfoBuilder().build());
        }
        if (!TextUtils.isEmpty(str)) {
            deviceId2.setIssuerId(str);
        }
        try {
            return TsmRpcModels.AddCardForQrResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_ADD_BANK_CARD_FOR_QR, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_AUTO_AUTHORIZE_FLAG, "1").addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(deviceId2.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("addCardForQr failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("addCardForQr failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.CommonResponse bindIdentityInfo(Context context, Bundle bundle) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        TsmRpcModels.IdentityBindRequest.Builder builderNewBuilder = TsmRpcModels.IdentityBindRequest.newBuilder();
        if (!TextUtils.isEmpty(bundle.getString("name"))) {
            builderNewBuilder.setName(bundle.getString("name"));
        }
        if (!TextUtils.isEmpty(bundle.getString(TSMAuthContants.PARAM_ID_CARD_NO))) {
            builderNewBuilder.setIdCardNo(bundle.getString(TSMAuthContants.PARAM_ID_CARD_NO));
        }
        try {
            return TsmRpcModels.CommonResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_BIND_IDENTITY_INFO, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(builderNewBuilder.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("bindIdentityInfo failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("bindIdentityInfo failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.CheckSeUpgradeResponse checkSeUpgrade(Context context, TsmRpcModels.ServiceType serviceType) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        try {
            return TsmRpcModels.CheckSeUpgradeResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_CHECK_SE_UPGRADE, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.CheckServiceRequest.newBuilder().setDeviceInfo(TsmRpcModels.DeviceInfo.newBuilder().setDeviceModel(ljs.b(null)).setLang(Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry()).setMiuiSystemVersion(ljs.n()).setHyperOSVersion(ljs.k()).setRomType(ljs.i()).setMiuiRomType(ljs.f(null)).build()).setSeviceType(serviceType).setCplc(getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY))).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("checkSeUpgrade failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("checkSeUpgrade failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmSessionInfo createSession(Context context, CardInfo cardInfo) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        String deviceId = DeviceUtils.getDeviceId(context, cardInfo);
        if (TextUtils.isEmpty(deviceId)) {
            throw new a(15);
        }
        String cplc = EnvironmentConfig.isSupportNfc(context) ? getCplc(cardInfo) : "";
        try {
            return TsmRpcModels.TsmSessionInfo.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_CREATE_SESSION, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.SeInfo.newBuilder().setCplc(TextUtils.isEmpty(cplc) ? ByteString.copyFrom(new byte[0]) : ByteString.copyFrom(Coder.hexStringToBytes(cplc))).setDeviceType(ljs.b(cardInfo)).setDeviceId(deviceId).setActionSource(TsmRpcModels.ActionSource.APP_CLIENT).setDeviceInfo(TsmRpcModels.DeviceInfo.newBuilder().setDeviceModel(ljs.b(cardInfo)).setLang(Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry()).setMiuiSystemVersion(ljs.n()).setHyperOSVersion(ljs.k()).setRomType(ljs.i()).setMiuiRomType(ljs.f(cardInfo)).setTsmclientVersionCode(ljs.a(context)).build()).setNfcCapable(EnvironmentConfig.isSupportNfc(context)).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("createSession failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("createSession failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.CommonResponse deleteAllBankCards(Context context) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        try {
            return TsmRpcModels.CommonResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_DELETE_BANK_CARDS, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("deleteAllBankCards failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("deleteAllBankCards failed, code: " + e2.mErrorCode + ", msg:" + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.CommonResponse deleteQrBankCard(Context context, Bundle bundle) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (bundle == null) {
            LogUtils.d("failed to delete qr bank card, extras is null");
            throw new a(1);
        }
        String deviceId = DeviceUtils.getDeviceId(context, null);
        if (TextUtils.isEmpty(deviceId)) {
            LogUtils.d("failed to delete qr bank card, deviceId is null");
            throw new a(1);
        }
        String string = bundle.getString(TSMAuthContants.PARAM_CARD_REFERENCE_ID);
        if (TextUtils.isEmpty(string)) {
            LogUtils.d("failed to delete qr bank card, cardReferencedId is null");
            throw new a(1);
        }
        try {
            return TsmRpcModels.CommonResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_DELETE_BANK_CARD_FOR_QR, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.DeleteQrBankCardRequest.newBuilder().setDeviceId(deviceId).setCardReferenceId(string).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("deleteQrBankCard failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("deleteQrBankCard failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.VirtualCardInfoResponse enrollUPCard(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, CardInfo cardInfo, Bundle bundle) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to enroll up card, session info is null");
            throw new a(1);
        }
        if (bundle == null) {
            LogUtils.d("failed to enroll up card, param is null");
            throw new a(1);
        }
        boolean z = bundle.getBoolean(TSMAuthContants.PARAM_IS_SUPPORT_TOKEN2, false);
        byte[] byteArray = bundle.getByteArray(TSMAuthContants.PARAM_CIPHER_CARD_INFO);
        if (!z && byteArray == null) {
            LogUtils.d("failed to enroll up card, crypt card info is null");
            throw new a(1);
        }
        TsmRpcModels.EnrollUPCardRequest.Builder sessionId = TsmRpcModels.EnrollUPCardRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId());
        sessionId.setCardInfo(byteArray == null ? ByteString.copyFrom(new byte[0]) : ByteString.copyFrom(byteArray));
        String string = bundle.getString("extra_source_channel");
        if (!TextUtils.isEmpty(string)) {
            sessionId.setSourceChannel(string);
        }
        RiskInfo riskInfo = (RiskInfo) bundle.getParcelable(TSMAuthContants.PARAM_RISK_INFO);
        if (riskInfo != null) {
            Location lastLocation = TSMLocationService.getInstance(context).getLastLocation();
            riskInfo.setDeviceLocation(StringUtils.join(",", String.valueOf(lastLocation.getLongitude()), String.valueOf(lastLocation.getLatitude())));
            sessionId.setRiskInfo(riskInfo.buildTSMRiskInfoBuilder().build());
        }
        String string2 = bundle.getString(BANK_CHANNEL_DATA);
        if (string2 != null) {
            sessionId.setBankChannelData(string2);
        }
        BankCardInfo bankCardInfo = (BankCardInfo) cardInfo;
        if (bankCardInfo.mBankCardType == 1) {
            sessionId.setBankCardType(TsmRpcModels.BankCardType.DEBIT);
            byte[] byteArray2 = bundle.getByteArray(TSMAuthContants.PARAM_CIPHER_PIN_INFO);
            if (byteArray2 != null) {
                sessionId.setPinInfo(ByteString.copyFrom(byteArray2));
            }
        } else {
            sessionId.setBankCardType(TsmRpcModels.BankCardType.CREDIT);
            byte[] byteArray3 = bundle.getByteArray(TSMAuthContants.PARAM_CIPHER_CVV2_INFO);
            if (byteArray3 != null) {
                sessionId.setCvn2Info(ByteString.copyFrom(byteArray3));
            }
        }
        if (!TextUtils.isEmpty(bankCardInfo.mBankCardPan)) {
            sessionId.setCardNumber(bankCardInfo.mBankCardPan);
        }
        String string3 = bundle.getString(EXTRA_APPLY_CHANNEL);
        if (TextUtils.isEmpty(string3)) {
            sessionId.setApplyChannel("01");
        } else {
            sessionId.setApplyChannel(string3);
        }
        String string4 = bundle.getString(TSMAuthContants.PARAM_QUICK_ENROLL_CARD_FLAG);
        if ("01".equals(string4) && !TextUtils.isEmpty(bankCardInfo.mVCReferenceId)) {
            sessionId.setVirtualCardRefId(bankCardInfo.mVCReferenceId);
        }
        sessionId.setTokenV2(z);
        String string5 = bundle.getString(TSMAuthContants.PARAM_OTP_VALUE);
        if (!TextUtils.isEmpty(string5)) {
            sessionId.setOtpValue(string5);
        }
        String string6 = bundle.getString(TSMAuthContants.PARAM_ENCRYPTED_DATA);
        if (!TextUtils.isEmpty(string6)) {
            sessionId.setEncryptedData(string6);
        }
        String string7 = bundle.getString("tokenType");
        if (!TextUtils.isEmpty(string7)) {
            sessionId.setTokenType(string7);
        }
        sessionId.setEnhanceable(true);
        AuthRequest authRequestCreate = AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_ENROLL_UP_CARD, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_QUICK_ENROLL_CARD_FLAG, string4).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(sessionId.build().toByteArray())).create();
        String string8 = bundle.getString(TSMAuthContants.HEADER_UNDERAGE_VERIFY_KEY);
        if (!TextUtils.isEmpty(string8)) {
            authRequestCreate.addHeader(TSMAuthContants.HEADER_UNDERAGE_VERIFY_KEY, string8);
        }
        try {
            return TsmRpcModels.VirtualCardInfoResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, authRequestCreate)));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("enrollUPCard failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("enrollUPCard failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmAPDUCommand executeCommand(Context context, CardInfo cardInfo, TsmRpcModels.TsmSessionInfo tsmSessionInfo, Bundle bundle, List<TsmRpcModels.SeAPDUResponseItem> list) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (bundle == null) {
            LogUtils.w("failed to processTask, param is null");
            throw new a(1);
        }
        String cplc = getCplc(cardInfo);
        String seId = getSeId(cardInfo);
        String deviceId = DeviceUtils.getDeviceId(context, null);
        if (TextUtils.isEmpty(deviceId)) {
            LogUtils.w("failed to processTask, deviceId is empty.");
            throw new a(15);
        }
        String string = bundle.getString("issuerId", "");
        String string2 = bundle.getString(Constants.EXTRA_DOOR_CARD_PRODUCT_ID);
        try {
            return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_START_EXECUTE_COMMAND, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.ProcessTask.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).setIssuerId(string).setProductId(string2).setToken(bundle.getString(Constants.EXTRA_MIFARE_DOOR_CARD_ISSUER_TOKEN)).addAllResponse(list).setSeInfo(TsmRpcModels.SeInfo.newBuilder().setCplc(ByteString.copyFrom(Coder.hexStringToBytes(cplc))).setDeviceType(ljs.b(cardInfo)).setDeviceId(deviceId).setActionSource(TsmRpcModels.ActionSource.APP_CLIENT).setDeviceInfo(TsmRpcModels.DeviceInfo.newBuilder().setDeviceModel(ljs.b(null)).setLang(Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry()).setMiuiSystemVersion(ljs.n()).setHyperOSVersion(ljs.k()).setRomType(ljs.i()).setMiuiRomType(ljs.f(null)).setTsmclientVersionCode(DeviceUtils.getAppVersionCode(context)).setSeId(seId).build()).build()).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("processTask failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("processTask failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmStartActionResponse executeSeOperation(Context context, CardInfo cardInfo, Bundle bundle) throws a, AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        if (accountInfo == null || bundle == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to executeSeOperation, accountInfo is null:");
            sb.append(accountInfo == null);
            sb.append(" or extras is null：");
            sb.append(bundle == null);
            LogUtils.d(sb.toString());
            throw new a(1);
        }
        String cplc = getCplc(cardInfo);
        String deviceId = DeviceUtils.getDeviceId(context, null);
        String string = bundle.getString("packageName", "");
        String string2 = bundle.getString("appVersionName", "");
        String string3 = bundle.getString("appVersionCode", "");
        String string4 = bundle.getString(Constants.OPERATION, "");
        String string5 = bundle.getString("authType", "");
        String string6 = bundle.getString("jwtToken", "");
        try {
            return TsmRpcModels.TsmStartActionResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_START_TSM_ACTION, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.OpenTsmStartActionRequest.newBuilder().setSeInfo(TsmRpcModels.SeInfo.newBuilder().setCplc(ByteString.copyFrom(Coder.hexStringToBytes(cplc))).setDeviceType(ljs.b(cardInfo)).setDeviceId(deviceId).setActionSource(TsmRpcModels.ActionSource.APP_CLIENT).setDeviceInfo(TsmRpcModels.DeviceInfo.newBuilder().setDeviceModel(ljs.b(cardInfo)).setLang(Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry()).setMiuiSystemVersion(ljs.n()).setHyperOSVersion(ljs.k()).setRomType(ljs.i()).setMiuiRomType(ljs.f(null)).setTsmclientVersionCode(ljs.a(context)).build()).build()).setAppInfo(TsmRpcModels.AppInfo.newBuilder().setAppVersionCode(string3).setAppVersionName(string2).setPackageName(string).build()).setCredential(TsmRpcModels.OpenTsmCredential.newBuilder().setAuthType(string5).setJwtToken(string6).build()).setOperation(string4).setExtra(bundle.getString("extra_data", "")).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("executeSeOperation failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("executeSeOperation failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.BankCardListForQrResponse getBankCardListForQR(Context context) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        String deviceId = DeviceUtils.getDeviceId(context, null);
        if (TextUtils.isEmpty(deviceId)) {
            LogUtils.d("failed to get bank card list for qr, param is null");
            throw new a(1);
        }
        try {
            return TsmRpcModels.BankCardListForQrResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_QUERY_BANK_LIST_FOR_QR, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.BankCardListForQrRequest.newBuilder().setDeviceId(deviceId).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("getBankCardListForQR failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("getBankCardListForQR failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public String getCplc(CardInfo cardInfo) throws a {
        try {
            return cardInfo.getTerminal().getCPLC();
        } catch (IOException e) {
            LogUtils.e("failed to get cplc", e);
            throw new a(13);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            LogUtils.e("failed to get cplc", e2);
            throw new a(11);
        }
    }

    public String getOperationResult(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo) throws a, AuthApiException {
        if (tsmSessionInfo == null) {
            LogUtils.d("failed to getOperationResult, session info is null");
            throw new a(1);
        }
        AccountInfo accountInfo = getAccountInfo(context);
        if (accountInfo == null) {
            LogUtils.d("failed to getOperationResult, accountInfo is null");
            throw new a(1);
        }
        try {
            return sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_GET_OPERATION_RESULT, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.OpenTsmGetOperationResultRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).build().toByteArray())).create());
        } catch (AuthApiException e) {
            LogUtils.e("getOperationResult failed, code: " + e.mErrorCode + ", msg: " + e.mErrorMsg, e);
            throw new a(e.mErrorCode, e.mErrorMsg);
        }
    }

    public TsmRpcModels.UpTransStatusResponse getQrTransStatus(Context context, String str, String str2) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        String deviceId = DeviceUtils.getDeviceId(context, null);
        if (TextUtils.isEmpty(deviceId)) {
            LogUtils.d("failed to get qr trans status, deviceId is null");
            throw new a(1);
        }
        try {
            return TsmRpcModels.UpTransStatusResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_GET_TRANS_STATUS_FOR_QR, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams("deviceId", deviceId).addParams(TSMAuthContants.PARAM_CARD_REFERENCE_ID_CAMEL, str).addParams("qrCode", str2).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("getQrTransStatus failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("getQrTransStatus failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.UpQrCodeResponse getUpQrCode(Context context, String str) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        String deviceId = DeviceUtils.getDeviceId(context, null);
        if (TextUtils.isEmpty(deviceId)) {
            LogUtils.d("failed to get qr code for qr, deviceId is null");
            throw new a(1);
        }
        Location lastLocation = TSMLocationService.getInstance(context).getLastLocation();
        try {
            return TsmRpcModels.UpQrCodeResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_GET_QR_CODE_FOR_QR, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.UpQrCodeRequest.newBuilder().setDeviceId(deviceId).setCardReferenceId(str).setLongitude(String.valueOf(lastLocation.getLongitude())).setLatitude(String.valueOf(lastLocation.getLatitude())).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("getUpQrCode failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("getUpQrCode failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.UpQrTokenIdResponse getUpQrTokenId(Context context, String str) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        String deviceId = DeviceUtils.getDeviceId(context, null);
        if (TextUtils.isEmpty(deviceId)) {
            LogUtils.d("failed to get up qr tokenId, deviceId is null");
            throw new a(1);
        }
        try {
            return TsmRpcModels.UpQrTokenIdResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_GET_TOKEN_ID_FOR_QR, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams("deviceId", deviceId).addParams(TSMAuthContants.PARAM_CARD_REFERENCE_ID_CAMEL, str).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("getUpQrTokenId failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("getUpQrTokenId failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmAPDUCommand installDoorCard(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, String str, MifareTag mifareTag, int i, String str2, String str3, Bundle bundle) throws a {
        String string = bundle.getString(TSMAuthContants.PARAM_COMMUNITY_CODE);
        String string2 = bundle.getString("businessId");
        String string3 = bundle.getString("ticket");
        boolean z = bundle.getBoolean(TSMAuthContants.PARAM_OVER_WRITE);
        String string4 = bundle.getString("issuerId");
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        TsmRpcModels.DoorCardType doorCardTypeValueOf = TsmRpcModels.DoorCardType.valueOf(i);
        if (doorCardTypeValueOf == null) {
            LogUtils.w("failed to install door card, card type is empty.");
            throw new a(1);
        }
        if (mifareTag == null && i == 0) {
            LogUtils.w("failed to install door card, tag info is null");
            throw new a(1);
        }
        TsmRpcModels.MifareCardParam.Builder builderNewBuilder = TsmRpcModels.MifareCardParam.newBuilder();
        if (mifareTag != null) {
            if (!TextUtils.isEmpty(mifareTag.getUid())) {
                builderNewBuilder.setUid(mifareTag.getUid());
            }
            if (!TextUtils.isEmpty(mifareTag.getAtqa())) {
                builderNewBuilder.setAtqa(mifareTag.getAtqa());
            }
            if (!TextUtils.isEmpty(mifareTag.getSak())) {
                builderNewBuilder.setSak(mifareTag.getSak());
            }
            if (!TextUtils.isEmpty(mifareTag.getBlockContent())) {
                builderNewBuilder.setContent(mifareTag.getBlockContent());
            }
            builderNewBuilder.setSize(mifareTag.getSize());
            String sectorData = mifareTag.getSectorData();
            if (!TextUtils.isEmpty(sectorData)) {
                builderNewBuilder.setMifareType(1);
                builderNewBuilder.setEncSectorData(sectorData);
                builderNewBuilder.setCostTime(mifareTag.getConsumedTime());
            }
            builderNewBuilder.setFullEncrypted(mifareTag.getKnownKeyCount() == 0);
        }
        TsmRpcModels.EnrollDoorCardRequest.Builder productId = TsmRpcModels.EnrollDoorCardRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).setProductId(str == null ? "" : str);
        if (string4 == null) {
            string4 = "";
        }
        AuthRequest authRequestCreate = AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_DOOR_CARD_ENROLL, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(productId.setIssuerId(string4).setCardType(doorCardTypeValueOf).setMifareCardParam(builderNewBuilder).setToken(str2 != null ? str2 : "").setApplyChannel(TextUtils.isEmpty(str3) ? "tsmclient" : str3).setBusinessId(string2).setCommunityCode(string).setTicket(string3).setOverwrite(z).build().toByteArray())).create();
        String string5 = bundle.getString(TSMAuthContants.HEADER_UNDERAGE_VERIFY_KEY);
        if (!TextUtils.isEmpty(string5)) {
            authRequestCreate.addHeader(TSMAuthContants.HEADER_UNDERAGE_VERIFY_KEY, string5);
        }
        try {
            return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, authRequestCreate)));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("installDoorCard failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("installDoorCard failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmAPDUCommand installEidCard(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, String str) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        try {
            return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_EID_CARD_ENROLL, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.EnrollEidRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).setSpToken(str).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("installEidCard failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("installEidCard failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.CommonResponse isBankCardServiceAvailable(Context context) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        try {
            return TsmRpcModels.CommonResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_IS_BANKCARD_SERVICE_AVAILABLE, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.DeviceInfo.newBuilder().setDeviceModel(ljs.b(null)).setLang(Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry()).setMiuiSystemVersion(ljs.n()).setHyperOSVersion(ljs.k()).setRomType(ljs.i()).setMiuiRomType(ljs.f(null)).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("isBankCardServiceAvailable failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("isBankCardServiceAvailable failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.CommonResponse isServiceAvailable(Context context, TsmRpcModels.ServiceType serviceType, String str) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        String cplc = getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY));
        TsmRpcModels.DeviceInfo deviceInfoBuild = TsmRpcModels.DeviceInfo.newBuilder().setDeviceModel(ljs.b(null)).setLang(Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry()).setMiuiSystemVersion(ljs.n()).setHyperOSVersion(ljs.k()).setRomType(ljs.i()).setMiuiRomType(ljs.f(null)).build();
        TsmRpcModels.CommonRiskInfo.Builder builderAddAllSimNumber = TsmRpcModels.CommonRiskInfo.newBuilder().setAccountId(accountInfoLoadAccountInfo.getUserId()).setMd5Imei(DeviceUtils.getDeviceId(context, null)).addAllSimNumber(ljs.m(null));
        Location lastLocation = TSMLocationService.getInstance(context).getLastLocation();
        if (lastLocation != null) {
            builderAddAllSimNumber.setLocation(StringUtils.join(",", String.valueOf(lastLocation.getLongitude()), String.valueOf(lastLocation.getLatitude())));
        }
        try {
            return TsmRpcModels.CommonResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_CHECK_SERVICE, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.CheckServiceRequest.newBuilder().setDeviceInfo(deviceInfoBuild).setSeviceType(serviceType).setRiskInfo(builderAddAllSimNumber.build()).setCplc(cplc).setExtra(str).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("isServiceAvailable failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("isServiceAvailable failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public AccountInfo loadAccountInfo(Context context) throws a {
        AccountInfo accountInfoLoadAccountInfo = this.mAccountManager.loadAccountInfo(context);
        if (accountInfoLoadAccountInfo == null || !accountInfoLoadAccountInfo.isValid()) {
            throw new a(14);
        }
        return accountInfoLoadAccountInfo;
    }

    public TsmRpcModels.CommonResponse notifyResult(Context context, int i, InAppTransData inAppTransData) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (inAppTransData == null) {
            LogUtils.w("failed to request inapp transaction command, transaction data is null");
            throw new a(1);
        }
        try {
            String strSendRequest = sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_INAPP_NOTIFY_PAY_RESULT, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.InAppPayResult.newBuilder().setOrderNumber(inAppTransData.getOrderNumber()).setMerchantId(inAppTransData.getMerchantId()).setPan(inAppTransData.getPan()).setAcquirer(inAppTransData.getChannel()).setResult(i).build().toByteArray())).create());
            LogUtils.i("response " + strSendRequest);
            return TsmRpcModels.CommonResponse.parseFrom(Coder.decodeBase64ToByteArray(strSendRequest));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("notifyResult failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("notifyResult failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.CommonResponse persoFinishNotify(Context context, CardInfo cardInfo, boolean z, List<TsmRpcModels.SeAPDUResponseItem> list, TsmRpcModels.TsmSessionInfo tsmSessionInfo) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to notify personal finishing, session info is null");
            throw new a(1);
        }
        if (cardInfo != null) {
            BankCardInfo bankCardInfo = (BankCardInfo) cardInfo;
            if (bankCardInfo.mVCReferenceId != null) {
                TsmRpcModels.PersoFinishNotifyRequest.Builder sessionId = TsmRpcModels.PersoFinishNotifyRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId());
                sessionId.setOperationResult(z);
                sessionId.setVirtualCardReferenceId(bankCardInfo.mVCReferenceId);
                sessionId.addAllResponse(list);
                try {
                    return TsmRpcModels.CommonResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_PERSO_FINISH_NOTIFY, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(sessionId.build().toByteArray())).create())));
                } catch (InvalidProtocolBufferException e) {
                    LogUtils.e("persoFinishNotify failed", e);
                    throw new a(16);
                } catch (AuthApiException e2) {
                    LogUtils.e("persoFinishNotify failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
                    throw new a(e2.mErrorCode, e2.mErrorMsg);
                }
            }
        }
        LogUtils.w("failed to notify personal finishing, card info or card referenceId is null");
        throw new a(1);
    }

    public TsmRpcModels.TsmAPDUCommand preparePayApplet(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, Bundle bundle) throws a {
        TsmRpcModels.BankCardType bankCardType;
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to prepare pay applet, session info is null");
            throw new a(1);
        }
        if (bundle == null) {
            LogUtils.w("failed to prepare pay applet, param is null");
            throw new a(1);
        }
        TsmRpcModels.CardIssuerInfo.Builder builderNewBuilder = TsmRpcModels.CardIssuerInfo.newBuilder();
        builderNewBuilder.setCardIssueChannel(bundle.getInt(TSMAuthContants.PARAM_ISSUER_CHANNEL) == 2 ? TsmRpcModels.CardIssueChannel.CMB : TsmRpcModels.CardIssueChannel.UP);
        String string = bundle.getString(TSMAuthContants.PARAM_ISSUER_ID);
        if (string != null) {
            builderNewBuilder.setIssuerId(string);
        }
        TsmRpcModels.PreparePayAppletRequest.Builder sessionId = TsmRpcModels.PreparePayAppletRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId());
        int i = bundle.getInt(TSMAuthContants.PARAM_BANKCARD_TYPE);
        try {
            if (i != 1) {
                if (i == 2) {
                    bankCardType = TsmRpcModels.BankCardType.CREDIT;
                }
                sessionId.setCardIssuerInfo(builderNewBuilder.build());
                return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_PREPARE_PAY_APPLET, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(sessionId.build().toByteArray())).create())));
            }
            bankCardType = TsmRpcModels.BankCardType.DEBIT;
            return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_PREPARE_PAY_APPLET, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(sessionId.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("preparePayApplet failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("preparePayApplet failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
        sessionId.setCardType(bankCardType);
        sessionId.setCardIssuerInfo(builderNewBuilder.build());
    }

    public TsmRpcModels.CommonResponse processFinishNotify(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, boolean z, TsmRpcModels.SeOperationType seOperationType, List<TsmRpcModels.SeAPDUResponseItem> list, String str) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to process finishing notification, session info is null");
            throw new a(1);
        }
        if (seOperationType == null) {
            LogUtils.w("failed to process finishing notification, se operation type is null");
            throw new a(1);
        }
        TsmRpcModels.ProcessFinishNotifyRequest.Builder actionType = TsmRpcModels.ProcessFinishNotifyRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).setActionResult(z).setActionType(seOperationType);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        try {
            return TsmRpcModels.CommonResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_PROCESS_FINISH_NOTIFY, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(actionType.setScriptsId(str).addAllResponse(list).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("processFinishNotify failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("processFinishNotify failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmAPDUCommand processSeResponse(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, List<TsmRpcModels.SeAPDUResponseItem> list) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to process se response, session info is null");
            throw new a(1);
        }
        try {
            return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, this.mHost, TSMAuthContants.URL_PROCESS_SE_RESPONSE, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.SeAPDUResponse.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).addAllResponse(list).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("processSeResponse failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("processSeResponse failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmAPDUCommand pullBusCardPersoData(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, j jVar) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w(jVar.c() + ": failed to pull bus card personal data, session info is null");
            throw new a(1);
        }
        try {
            return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, jVar.d(), AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.PullBusCardDataRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e(jVar.c() + ": pullBusCardPersoData failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e(jVar.c() + ": pullBusCardPersoData failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmAPDUCommand pullBusCardTransferData(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, boolean z) {
        String str;
        String str2;
        Throwable th;
        AccountInfo accountInfoLoadAccountInfo = this.mAccountManager.loadAccountInfo(context);
        if (accountInfoLoadAccountInfo == null || !accountInfoLoadAccountInfo.isValid()) {
            str = "failed to pull bus card transfer data, account info is null";
        } else {
            if (tsmSessionInfo != null) {
                try {
                    String strSendRequest = sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, z ? TSMAuthContants.URL_PULL_BUS_CARD_TRANSFER_IN_DATA : TSMAuthContants.URL_PULL_BUS_CARD_TRANSFER_OUT_DATA, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.PullBusCardDataRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).build().toByteArray())).create());
                    if (!TextUtils.isEmpty(strSendRequest)) {
                        return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(strSendRequest));
                    }
                } catch (InvalidProtocolBufferException e) {
                    str2 = "pullBusCardTransferData failed";
                    th = e;
                    LogUtils.e(str2, th);
                } catch (AuthApiException e2) {
                    str2 = "pullBusCardTransferData failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg;
                    th = e2;
                    LogUtils.e(str2, th);
                }
                return null;
            }
            str = "failed to pull bus card transfer  data, session info is null";
        }
        LogUtils.e(str);
        return null;
    }

    public TsmRpcModels.TsmAPDUCommand pullPersonData(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, CardInfo cardInfo, Bundle bundle) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to pull personal data, session info is null");
            throw new a(1);
        }
        try {
            return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_PULL_PERSO_DATA, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.PullPersoDataRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("pullPersoData failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("pullPersoData failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.ApplyTokenResponse queryApplyToken(Context context, Bundle bundle) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        String cplc = EnvironmentConfig.isSupportNfc(context) ? getCplc(cardInfo) : DeviceUtils.getDeviceId(context, cardInfo);
        String string = bundle.getString("issuerId");
        String string2 = bundle.getString("applyChannel");
        String string3 = bundle.getString("pan");
        String string4 = bundle.getString("tokenType");
        int i = bundle.getInt("bankCardType");
        TsmRpcModels.ApplyTokenRequest.Builder cplc2 = TsmRpcModels.ApplyTokenRequest.newBuilder().setCplc(cplc);
        if (!TextUtils.isEmpty(string4)) {
            cplc2.setTokenType(string4);
        }
        if (!TextUtils.isEmpty(string)) {
            cplc2.setIssuerId(string);
        }
        if (!TextUtils.isEmpty(string3)) {
            cplc2.setPan(string3);
        }
        if (TextUtils.isEmpty(string2)) {
            cplc2.setApplyChannel("01");
        } else {
            cplc2.setApplyChannel(string2);
        }
        cplc2.setBankCardType(i == 2 ? TsmRpcModels.BankCardType.CREDIT : TsmRpcModels.BankCardType.DEBIT);
        RiskInfo riskInfo = (RiskInfo) bundle.getParcelable(TSMAuthContants.PARAM_RISK_INFO);
        if (riskInfo != null) {
            Location lastLocation = TSMLocationService.getInstance(context).getLastLocation();
            riskInfo.setDeviceLocation(StringUtils.join(",", String.valueOf(lastLocation.getLongitude()), String.valueOf(lastLocation.getLatitude())));
            cplc2.setRiskInfo(riskInfo.buildTSMRiskInfoBuilder().build());
        }
        try {
            return TsmRpcModels.ApplyTokenResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_TOKEN_V2_APPLY_TOKEN, AuthRequest.RespContentType.protobuf).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(cplc2.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryApplyToken failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryApplyToken failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.QueryBankCardInfoResponse queryBankCardInfo(Context context, String str) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        TsmRpcModels.QueryBankCardInfoRequest.Builder cplc = TsmRpcModels.QueryBankCardInfoRequest.newBuilder().setCplc(getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY)));
        if (!TextUtils.isEmpty(str)) {
            cplc.setAid(str);
        }
        try {
            return TsmRpcModels.QueryBankCardInfoResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_QUERY_BANK_CARD_INFO, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(cplc.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryBankCardInfo failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryBankCardInfo failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.QueryBankListResponse queryBankListOfOneKey(Context context) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        try {
            return TsmRpcModels.QueryBankListResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.QUERY_ONE_CLICK_CARD_BIND_LIST, AuthRequest.RespContentType.protobuf).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.QueryBankListRequest.newBuilder().setCplc(EnvironmentConfig.isSupportNfc(context) ? getCplc(cardInfo) : DeviceUtils.getDeviceId(context, cardInfo)).setDeviceModel(DeviceUtils.getDeviceModel(cardInfo)).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryBankListOfOneKey failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryBankListOfOneKey failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.BatchApplyTokenResponse queryBatchApplyToken(Context context, Bundle bundle) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        TsmRpcModels.BatchApplyTokenRequest.Builder builderAddAllSpanRefIds = TsmRpcModels.BatchApplyTokenRequest.newBuilder().setCplc(EnvironmentConfig.isSupportNfc(context) ? getCplc(cardInfo) : DeviceUtils.getDeviceId(context, cardInfo)).setTokenType(bundle.getString("tokenType")).addAllSpanRefIds(bundle.getStringArrayList(TSMAuthContants.PARAM_SPANREFIDS));
        RiskInfo riskInfo = (RiskInfo) bundle.getParcelable(TSMAuthContants.PARAM_RISK_INFO);
        if (riskInfo != null) {
            Location lastLocation = TSMLocationService.getInstance(context).getLastLocation();
            riskInfo.setDeviceLocation(StringUtils.join(",", String.valueOf(lastLocation.getLongitude()), String.valueOf(lastLocation.getLatitude())));
            builderAddAllSpanRefIds.setRiskInfo(riskInfo.buildTSMRiskInfoBuilder().build());
        }
        try {
            return TsmRpcModels.BatchApplyTokenResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_BATCH_APPLY_TOKEN, AuthRequest.RespContentType.protobuf).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(builderAddAllSpanRefIds.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryBatchApplyToken failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryBatchApplyToken failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.BankCardFirstPageResponse queryBindBankCardListV2(Context context) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        try {
            return TsmRpcModels.BankCardFirstPageResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.QUERY_BIND_BANK_CARD_LIST_FOR_TOKEN_V2, AuthRequest.RespContentType.protobuf).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.BankCardFirstPageRequest.newBuilder().setCplc(EnvironmentConfig.isSupportNfc(context) ? getCplc(cardInfo) : DeviceUtils.getDeviceId(context, cardInfo)).setDeviceModel(DeviceUtils.getDeviceModel(cardInfo)).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryBindBankCardListV2 failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryBindBankCardListV2 failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.UpCardMoreInfoResponse queryBindCardPhoneNumberAndFakePan(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, String str) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to query phone number and fake pan, session info is null");
            throw new a(1);
        }
        TsmRpcModels.UpCardMoreInfoRequest.Builder sessionId = TsmRpcModels.UpCardMoreInfoRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId());
        if (!TextUtils.isEmpty(str)) {
            sessionId.setOldVcReferenceId(str);
        }
        try {
            return TsmRpcModels.UpCardMoreInfoResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_QUERY_UP_MORE_CARD_INFO, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(sessionId.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryBindCardPhoneNumberAndFakePan failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryBindCardPhoneNumberAndFakePan failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.DoorCardInfo queryDoorCardInfoByAid(Context context, String str, int i, String str2) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        TsmRpcModels.DoorCardType doorCardTypeValueOf = TsmRpcModels.DoorCardType.valueOf(i);
        if (doorCardTypeValueOf == null) {
            LogUtils.w("failed to query door card info by aid, card type is empty.");
            throw new a(1);
        }
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        String cplc = getCplc(cardInfo);
        TsmRpcModels.DeviceInfo deviceInfoBuild = TsmRpcModels.DeviceInfo.newBuilder().setDeviceModel(ljs.b(null)).setLang(Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry()).setMiuiSystemVersion(ljs.n()).setHyperOSVersion(ljs.k()).setRomType(ljs.i()).setMiuiRomType(ljs.f(null)).setTsmclientVersionCode(DeviceUtils.getAppVersionCode(context)).setSeId(getSeId(cardInfo)).build();
        TsmRpcModels.QueryDoorCardRequest.Builder cardType = TsmRpcModels.QueryDoorCardRequest.newBuilder().setCplc(cplc).setAid(str).setCardType(doorCardTypeValueOf);
        if (str2 == null) {
            str2 = "";
        }
        try {
            TsmRpcModels.QueryDoorCardInfoResponse from = TsmRpcModels.QueryDoorCardInfoResponse.parseFrom(Coder.decodeBase64ToByteArray((String) sendGetRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_DOOR_CARD_QUERY_BY_AID, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(cardType.setProductId(str2).setDeviceInfo(deviceInfoBuild).build().toByteArray())).create())));
            if (from == null || from.getCardInfoListList() == null || from.getCardInfoListList().size() <= 0) {
                throw new a(16);
            }
            return from.getCardInfoListList().get(0);
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryMifareCardInfoByAid failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryMifareCardInfoByAid failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.EidInfoResponse queryEidCard(Context context) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        try {
            return TsmRpcModels.EidInfoResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_QUERY_EID_INFO, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams("cplc", getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY))).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryEidCard failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryEidCard failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.IdentityResponse queryIdentity(Context context) throws a {
        LogUtils.v("queryIdentity");
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        try {
            return TsmRpcModels.IdentityResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_QUERY_CERTIFICATION, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryIdentity failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryIdentity failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmStartActionResponse queryInstruction(Context context, String str) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (accountInfoLoadAccountInfo == null || !accountInfoLoadAccountInfo.isValid()) {
            LogUtils.e("queryInstruction failed, account info is null or invalid");
            return null;
        }
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        try {
            return TsmRpcModels.TsmStartActionResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, this.mHost, TSMAuthContants.URL_PUSH_TASK_INVOKE, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams("taskId", str).addParams(TSMAuthContants.PARAM_SE_INFO, Coder.encodeBase64Coder(TsmRpcModels.SeInfo.newBuilder().setCplc(ByteString.copyFrom(Coder.hexStringToBytes(getCplc(cardInfo)))).setDeviceType(ljs.b(cardInfo)).setDeviceId(DeviceUtils.getDeviceId(context, cardInfo)).setActionSource(TsmRpcModels.ActionSource.APP_CLIENT).setDeviceInfo(TsmRpcModels.DeviceInfo.newBuilder().setDeviceModel(ljs.b(cardInfo)).setLang(Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry()).setMiuiSystemVersion(ljs.n()).setHyperOSVersion(ljs.k()).setRomType(ljs.i()).setMiuiRomType(ljs.f(null)).setTsmclientVersionCode(ljs.a(context)).build()).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryInstruction failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryInstruction failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.QueryDoorCardInfoResponse queryMifareCardList(Context context) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        try {
            return TsmRpcModels.QueryDoorCardInfoResponse.parseFrom(Coder.decodeBase64ToByteArray((String) sendGetRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_MIFARE_LIST, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams("cplc", getCplc(cardInfo)).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.DeviceInfo.newBuilder().setDeviceModel(ljs.b(null)).setLang(Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry()).setMiuiSystemVersion(ljs.n()).setHyperOSVersion(ljs.k()).setRomType(ljs.i()).setMiuiRomType(ljs.f(null)).setTsmclientVersionCode(DeviceUtils.getAppVersionCode(context)).setSeId(getSeId(cardInfo)).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryMifareCardList failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryMifareCardList failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.QueryPanResponse queryPan(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, Bundle bundle) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to query pan, session info is null");
            throw new a(1);
        }
        TsmRpcModels.QueryPanRequest.Builder sessionId = TsmRpcModels.QueryPanRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId());
        if (bundle.getLong(TSMAuthContants.PARAM_CARD_BIND_ID) != 0) {
            sessionId.setBindId(bundle.getLong(TSMAuthContants.PARAM_CARD_BIND_ID));
        } else {
            sessionId.setPan(bundle.getString("pan"));
        }
        sessionId.setTokenV2(bundle.getBoolean(TSMAuthContants.PARAM_IS_SUPPORT_TOKEN2, false));
        sessionId.setEnhanceable(true);
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        sessionId.setCplc(EnvironmentConfig.isSupportNfc(context) ? getCplc(cardInfo) : DeviceUtils.getDeviceId(context, cardInfo));
        sessionId.setDeviceModel(ljs.b(cardInfo));
        try {
            return TsmRpcModels.QueryPanResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_QUERY_PAN, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(sessionId.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryPan failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryPan failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.QueryPanForQrResponse queryPanForQr(Context context, Bundle bundle) throws a {
        LogUtils.v("queryPanForQr");
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        TsmRpcModels.QueryPanForQrRequest.Builder builderNewBuilder = TsmRpcModels.QueryPanForQrRequest.newBuilder();
        String deviceId = DeviceUtils.getDeviceId(context, null);
        if (TextUtils.isEmpty(deviceId)) {
            LogUtils.d("failed to query pan for qr, deviceId is null");
            throw new a(1);
        }
        builderNewBuilder.setDeviceId(deviceId);
        if (bundle == null) {
            LogUtils.d("failed to query pan for qr, bundle is null");
            throw new a(1);
        }
        if (!TextUtils.isEmpty(bundle.getString(TSMAuthContants.PARAM_CIPHER_PAN))) {
            builderNewBuilder.setCipheredPan(ByteString.copyFrom(Coder.hexStringToBytes(bundle.getString(TSMAuthContants.PARAM_CIPHER_PAN))));
        }
        try {
            return TsmRpcModels.QueryPanForQrResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_QUERY_PAN_FOR_QR, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(builderNewBuilder.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryPanForQr failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryPanForQr failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.QueryBankCardInfoResponse queryQuickBankCardInfo(Context context) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        try {
            return TsmRpcModels.QueryBankCardInfoResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_QUERY_QUICK_BIND_CARD_INFO, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.QueryQuickEnrollCardListRequest.newBuilder().setCplc(getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY))).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryQuickBankCardInfo failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryQuickBankCardInfo failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmPendingTaskList queryTaskList(Context context) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (accountInfoLoadAccountInfo == null || !accountInfoLoadAccountInfo.isValid()) {
            LogUtils.e("failed to queryTaskList, account info is null or invalid");
            return null;
        }
        try {
            return TsmRpcModels.TsmPendingTaskList.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, this.mHost, TSMAuthContants.URL_PUSH_TASK_LIST, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams("cplc", getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY))).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("queryTaskList failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("queryTaskList failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.InAppTransCommand requestInappTransCommand(Context context, InAppTransData inAppTransData) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (inAppTransData == null) {
            LogUtils.w("failed to request inapp transaction command, transaction data is null");
            throw new a(1);
        }
        LogUtils.d("transdata " + inAppTransData.toString());
        try {
            String strSendRequest = sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_INAPP_REQUEST_PAY, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.InAppTransData.newBuilder().setOrderNumber(inAppTransData.getOrderNumber()).setMerchantName(inAppTransData.getMerchantName()).setMerchantId(inAppTransData.getMerchantId()).setTotalAmount(inAppTransData.getOrderAmount()).setDiscountAmount(inAppTransData.getDiscountAmount()).setPayAmount(inAppTransData.getPayAmount()).setEncryptPayAmount(inAppTransData.getEncryptPayAmount()).setCurrencyCode(inAppTransData.getCurrencyCode()).setSign(inAppTransData.getSignedData()).setSignKeyIndex(inAppTransData.getSignKeyIndex()).setPan(inAppTransData.getPan()).setPbocAid(inAppTransData.getPayCardAppletAid()).setAcquirer(inAppTransData.getChannel()).setVerifyMethod(inAppTransData.getVerifyMethod()).build().toByteArray())).create());
            LogUtils.d("response " + strSendRequest);
            return TsmRpcModels.InAppTransCommand.parseFrom(Coder.decodeBase64ToByteArray(strSendRequest));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("requestInappTransCommand failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("requestInappTransCommand failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TransDataForNonNFCResponse requestInappTransNoNFC(Context context, QrBankCardInfo qrBankCardInfo, InAppTransData inAppTransData) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (inAppTransData == null) {
            LogUtils.w("failed to request inapp transaction command, transaction data is null");
            throw new a(1);
        }
        LogUtils.d("transdata " + inAppTransData.toString());
        try {
            String strSendRequest = sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_INAPP_REQUEST_PAY_NO_NFC, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.InAppTransData.newBuilder().setOrderNumber(inAppTransData.getOrderNumber()).setMerchantName(inAppTransData.getMerchantName()).setMerchantId(inAppTransData.getMerchantId()).setTotalAmount(inAppTransData.getOrderAmount()).setDiscountAmount(inAppTransData.getDiscountAmount()).setPayAmount(inAppTransData.getPayAmount()).setEncryptPayAmount(inAppTransData.getEncryptPayAmount()).setCurrencyCode(inAppTransData.getCurrencyCode()).setSign(inAppTransData.getSignedData()).setSignKeyIndex(inAppTransData.getSignKeyIndex()).setPan(inAppTransData.getPan()).setPbocAid(inAppTransData.getPayCardAppletAid()).setAcquirer(inAppTransData.getChannel()).setVerifyMethod(inAppTransData.getVerifyMethod()).setCardReferenceId(qrBankCardInfo.mVCReferenceId).setDeviceId(DeviceUtils.getDeviceId(context, qrBankCardInfo)).build().toByteArray())).create());
            LogUtils.d("requestInappTransNoNFC response " + strSendRequest);
            return TsmRpcModels.TransDataForNonNFCResponse.parseFrom(Coder.decodeBase64ToByteArray(strSendRequest));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("requestInappTransNoNFC failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("requestInappTransNoNFC failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.CommonResponse requestVerificationCode(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, String str, Bundle bundle) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to request verification code, session info is null");
            throw new a(1);
        }
        if (TextUtils.isEmpty(str)) {
            LogUtils.w("failed to request verification code, card reference id is empty");
            throw new a(1);
        }
        String string = bundle.getString(EXTRA_APPLY_CHANNEL);
        boolean z = bundle.getBoolean(TSMAuthContants.PARAM_IS_SUPPORT_TOKEN2, false);
        String string2 = bundle.getString(TSMAuthContants.PARAM_ENCRYPTED_DATA);
        String string3 = bundle.getString("tokenType");
        TsmRpcModels.RequestVerificationCode.Builder optMethod = TsmRpcModels.RequestVerificationCode.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).setVirtualCardReferenceId(str).setOptMethod(TsmRpcModels.OtpMethod.SMS);
        if (TextUtils.isEmpty(string)) {
            string = "01";
        }
        TsmRpcModels.RequestVerificationCode.Builder applyChannel = optMethod.setApplyChannel(string);
        if (TextUtils.isEmpty(string2)) {
            string2 = "";
        }
        TsmRpcModels.RequestVerificationCode.Builder encryptedData = applyChannel.setEncryptedData(string2);
        if (TextUtils.isEmpty(string3)) {
            string3 = "";
        }
        try {
            return TsmRpcModels.CommonResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_REQUEST_VERTIFICATION_CODE, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(encryptedData.setTokenType(string3).setTokenV2(z).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("requestVerificationCode failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("requestVerificationCode failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.CommonResponse requestVerificationCodeForQR(Context context, Bundle bundle) throws a {
        LogUtils.v("requestVerificationCodeForQR");
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (bundle == null) {
            LogUtils.d("failed to request verification code, param is null");
            throw new a(1);
        }
        String deviceId = DeviceUtils.getDeviceId(context, null);
        if (TextUtils.isEmpty(deviceId)) {
            LogUtils.d("failed to request verification code, deviceId is null");
            throw new a(1);
        }
        byte[] bArrHexStringToBytes = Coder.hexStringToBytes(bundle.getString(TSMAuthContants.PARAM_CIPHER_TWO_ELEMENT));
        if (bArrHexStringToBytes == null) {
            LogUtils.d("failed to request verification code, crypt card info is null");
            throw new a(1);
        }
        TsmRpcModels.RequestVerificationCodeForQr.Builder cardInfo = TsmRpcModels.RequestVerificationCodeForQr.newBuilder().setDeviceId(deviceId).setCardInfo(ByteString.copyFrom(bArrHexStringToBytes));
        if (!TextUtils.isEmpty(bundle.getString(TSMAuthContants.PARAM_CVN2))) {
            cardInfo.setCvn2(ByteString.copyFrom(Coder.hexStringToBytes(bundle.getString(TSMAuthContants.PARAM_CVN2))));
        }
        try {
            return TsmRpcModels.CommonResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_REQUEST_VERIFICATION_CODE_FOR_QR, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(cardInfo.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("requestVerificationCodeForQR failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("requestVerificationCodeForQR failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmAPDUCommand saveAppKey(Context context, Bundle bundle, TsmRpcModels.TsmSessionInfo tsmSessionInfo) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to save app key, session info is null");
            throw new a(1);
        }
        if (bundle == null) {
            LogUtils.w("failed to save app key, param is null");
            throw new a(1);
        }
        String cplc = getCplc(new CardInfo(CardInfo.CARD_TYPE_DUMMY));
        String deviceId = DeviceUtils.getDeviceId(context, null);
        if (TextUtils.isEmpty(deviceId)) {
            LogUtils.w("failed to save app key, deviceId  is empty.");
            throw new a(15);
        }
        try {
            try {
                return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_SAVE_APP_KEY, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.SaveAppKeyRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).setAppName("tsmclient").setCpuModel(bundle.getString(Constants.KEY_CPU_MODEL)).setTzId(bundle.getString(Constants.KEY_TZID)).setKeyAlg(bundle.getString(Constants.KEY_KEY_ALG)).setPkX(bundle.getString(Constants.KEY_PKX)).setPkY(bundle.getString(Constants.KEY_PKY)).setClientSign(bundle.getString("sign")).setDeviceModel(bundle.getString("deviceModel")).setDeviceId(deviceId).setCplc(cplc).build().toByteArray())).create())));
            } catch (InvalidProtocolBufferException e) {
                LogUtils.e("saveAppKey failed", e);
                throw new a(16);
            } catch (AuthApiException e2) {
                LogUtils.e("saveAppKey failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
                throw new a(e2.mErrorCode, e2.mErrorMsg);
            }
        } catch (Exception e3) {
            LogUtils.e("failed to save app key.", e3);
            throw new a(1);
        }
    }

    public TsmRpcModels.TsmStartActionResponse startAction(Context context, CardInfo cardInfo, TsmRpcModels.SeOperationType seOperationType, String str) throws a, AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        String cplc = getCplc(cardInfo);
        String deviceId = DeviceUtils.getDeviceId(context, null);
        LogUtils.d(Constants.MQS_LOG_CAPTURE, "operation: MiTSMCardClient_" + cardInfo.mCardType + seOperationType);
        try {
            return TsmRpcModels.TsmStartActionResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, this.mHost, TSMAuthContants.URL_START_ACTION, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.TsmStartActionInfo.newBuilder().setSeInfo(TsmRpcModels.SeInfo.newBuilder().setCplc(ByteString.copyFrom(Coder.hexStringToBytes(cplc))).setDeviceType(ljs.b(cardInfo)).setDeviceId(deviceId).setActionSource(TsmRpcModels.ActionSource.APP_CLIENT).setDeviceInfo(TsmRpcModels.DeviceInfo.newBuilder().setDeviceModel(ljs.b(cardInfo)).setLang(Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry()).setMiuiSystemVersion(ljs.n()).setHyperOSVersion(ljs.k()).setRomType(ljs.i()).setMiuiRomType(ljs.f(null)).setTsmclientVersionCode(ljs.a(context)).build()).build()).setActionName(seOperationType).setParams(str).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("startAction failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("startAction failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmAPDUCommand startSeOperation(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, TsmRpcModels.SeOperationType seOperationType, CardInfo cardInfo, Bundle bundle) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to start se operation, session info is null");
            throw new a(1);
        }
        if (seOperationType == null) {
            LogUtils.w("failed to start se operation, operation type is null");
            throw new a(1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("operation: MiTSMCardClient_");
        sb.append(cardInfo == null ? AbstractJsonLexerKt.NULL : cardInfo.mCardType);
        sb.append(seOperationType);
        LogUtils.d(Constants.MQS_LOG_CAPTURE, sb.toString());
        TsmRpcModels.SeOperation.Builder type = TsmRpcModels.SeOperation.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).setType(seOperationType);
        if (cardInfo != null && !TextUtils.isEmpty(cardInfo.mAid)) {
            type.setAid(cardInfo.mAid);
        }
        if (bundle != null) {
            String string = bundle.getString("authentication_code");
            if (!TextUtils.isEmpty(string)) {
                type.setAuthenticationCode(ByteString.copyFrom(Coder.hexStringToBytes(string)));
            }
            String string2 = bundle.getString("extra_city_id");
            if (!TextUtils.isEmpty(string2)) {
                type.setCityId(string2);
            }
            String string3 = bundle.getString("extra_source_channel");
            if (!TextUtils.isEmpty(string3)) {
                type.setSourceChannel(string3);
            }
            String string4 = bundle.getString(EXTRA_NEED_PHONE_NUMBER);
            JSONObject jSONObject = null;
            try {
                jSONObject = !TextUtils.isEmpty(string4) ? new JSONObject(string4) : new JSONObject();
                if (cardInfo != null && !TextUtils.isEmpty(cardInfo.mCardType)) {
                    jSONObject.put("card_name", cardInfo.mCardType);
                }
                jSONObject.putOpt(TSMAuthContants.PARAM_SERVICE_TYPE, Integer.valueOf(bundle.getInt(TSMAuthContants.PARAM_SERVICE_TYPE, -1)));
                jSONObject.putOpt(TSMAuthContants.PARAM_ONLY_SYNC_CARD, Boolean.valueOf(bundle.getBoolean(TSMAuthContants.PARAM_ONLY_SYNC_CARD)));
                jSONObject.putOpt(EXTRA_NFC_ID, bundle.get(EXTRA_NFC_ID));
                String string5 = bundle.getString("business_id");
                if (!TextUtils.isEmpty(string5)) {
                    jSONObject.putOpt("business_id", string5);
                }
                String string6 = bundle.getString("callerPackageName");
                if (!TextUtils.isEmpty(string6)) {
                    jSONObject.putOpt("callerPackageName", string6);
                }
                String string7 = bundle.getString(Constants.EXTRA_DOOR_CARD_BUSINESS_ID);
                if (!TextUtils.isEmpty(string7)) {
                    jSONObject.putOpt(Constants.EXTRA_DOOR_CARD_BUSINESS_ID, string7);
                }
                if (bundle.containsKey(TSMAuthContants.PARAM_SYNC_OPERATION)) {
                    jSONObject.putOpt(TSMAuthContants.PARAM_SYNC_OPERATION, Integer.valueOf(bundle.getInt(TSMAuthContants.PARAM_SYNC_OPERATION)));
                }
            } catch (JSONException e) {
                LogUtils.e("failed to start se operation", e);
            }
            String string8 = bundle.getString("extra_data");
            if (!TextUtils.isEmpty(string8)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(string8);
                    if (jSONObject == null) {
                        jSONObject = jSONObject2;
                    } else {
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            jSONObject.put(next, jSONObject2.opt(next));
                        }
                    }
                } catch (Exception e2) {
                    LogUtils.e("parse extraData failed", e2);
                }
            }
            String string9 = bundle.getString("orderId");
            if (!TextUtils.isEmpty(string9)) {
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception e3) {
                        LogUtils.e("failed to start se operation, put orderId failed", e3);
                    }
                }
                jSONObject.put("orderId", string9);
            }
            String string10 = bundle.getString(TSMAuthContants.PARAM_SPORDERID);
            if (!TextUtils.isEmpty(string10)) {
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception e4) {
                        LogUtils.e("failed to start se operation, put spOrderId failed", e4);
                    }
                }
                jSONObject.put(TSMAuthContants.PARAM_SPORDERID, string10);
            }
            boolean z = bundle.getBoolean(TSMAuthContants.PARAM_FORCE_DELETE_MIPAY);
            if (z) {
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception e5) {
                        LogUtils.e("failed to start se operation, put force_delete_mipay failed", e5);
                    }
                }
                jSONObject.put(TSMAuthContants.PARAM_FORCE_DELETE_MIPAY, z);
            }
            if (jSONObject != null) {
                LogUtils.v("json: " + jSONObject.toString());
                type.setExtra(jSONObject.toString());
            }
        }
        try {
            return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_START_SE_OPERATION, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(type.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e6) {
            LogUtils.e("startSeOperation failed", e6);
            throw new a(16);
        } catch (AuthApiException e7) {
            LogUtils.e("startSeOperation failed, code: " + e7.mErrorCode + ", msg: " + e7.mErrorMsg, e7);
            throw new a(e7.mErrorCode, e7.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmAPDUCommand startTopupOperation(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, CardInfo cardInfo, String str, Bundle bundle) throws a {
        String str2;
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to start top-up operation, session info is null");
            throw new a(1);
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(cardInfo.mAid)) {
            LogUtils.w("failed to start top-up operation, authenticationCode is empty or appAid is empty");
            throw new a(1);
        }
        TsmRpcModels.TopUpOperation.Builder builderNewBuilder = TsmRpcModels.TopUpOperation.newBuilder();
        TsmRpcModels.TopUpOperation.Builder authenticationCode = builderNewBuilder.setSessionId(tsmSessionInfo.getSessionId()).setAid(cardInfo.mAid).setAuthenticationCode(ByteString.copyFrom(Coder.hexStringToBytes(str)));
        if (TextUtils.isEmpty(cardInfo.mCardNo)) {
            str2 = "";
        } else if (TextUtils.isEmpty(cardInfo.mRealCardNo)) {
            str2 = cardInfo.mCardNo;
        } else {
            str2 = cardInfo.mCardNo + ";" + cardInfo.mRealCardNo;
        }
        authenticationCode.setCardNumber(str2).setBalance(cardInfo.mCardBalance);
        if (bundle != null) {
            String string = bundle.getString("extra_city_id");
            if (!TextUtils.isEmpty(string)) {
                builderNewBuilder.setCityId(string);
            }
        }
        if (bundle != null && bundle.containsKey(EXTRA_NEED_PHONE_NUMBER)) {
            String string2 = bundle.getString(EXTRA_NEED_PHONE_NUMBER);
            if (!TextUtils.isEmpty(string2)) {
                builderNewBuilder.setExtra(string2);
            }
        }
        try {
            return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_TOPUP, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(builderNewBuilder.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("startTopupOperation failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("startTopupOperation failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.CommonResponse updateMifareCard(Context context, MifareCardInfo... mifareCardInfoArr) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        String cplc = getCplc(cardInfo);
        String seId = getSeId(cardInfo);
        if (mifareCardInfoArr == null || mifareCardInfoArr.length < 1) {
            LogUtils.w("failed to update mifare card, card info is null");
            throw new a(1);
        }
        ArrayList arrayList = new ArrayList();
        for (MifareCardInfo mifareCardInfo : mifareCardInfoArr) {
            int mifareCardType = mifareCardInfo.getMifareCardType();
            TsmRpcModels.DoorCardInfo.Builder builderNewBuilder = TsmRpcModels.DoorCardInfo.newBuilder();
            String str = mifareCardInfo.mAid;
            if (str == null) {
                str = "";
            }
            arrayList.add(builderNewBuilder.setAid(str).setCardType(TsmRpcModels.DoorCardType.valueOf(mifareCardType)).setName(mifareCardInfo.mCardName).setFingerFlag(mifareCardInfo.mFingerAuthFlag).setProductId(mifareCardInfo.getProductId()).setBusinessId(mifareCardInfo.getBusinessId()).setSeId(seId).build());
        }
        try {
            return TsmRpcModels.CommonResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_UPDATE_MIFARE_CARD, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.UpdateDoorCardRequest.newBuilder().setCplc(cplc).addAllCardInfo(arrayList).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("updateMifareCard failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("updateMifareCard failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmAPDUCommand updateSectorData(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, MifareCardInfo mifareCardInfo, MifareTag mifareTag) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (mifareTag == null) {
            mifareTag = new MifareTag();
        }
        TsmRpcModels.UpdateSectorDataRequest.Builder costTimeOfVerifyKey = TsmRpcModels.UpdateSectorDataRequest.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).setCplc(getCplc(mifareCardInfo)).setUid(mifareTag.getUid()).setAid(mifareCardInfo.mAid).setCostTimeOfVerifyKey(mifareTag.getConsumedTime());
        costTimeOfVerifyKey.setValidateResult(TextUtils.equals(mifareTag.getBlockContent(), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI) ? 1 : 0);
        costTimeOfVerifyKey.setContent(mifareTag.getBlockContent());
        if (!TextUtils.isEmpty(mifareCardInfo.getCid())) {
            costTimeOfVerifyKey.setCid(mifareCardInfo.getCid());
        }
        try {
            return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_UPDATE_SECTOR_DATA, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(costTimeOfVerifyKey.build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.t("updateSectorData failed: " + e.getMessage());
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.t("updateSectorData failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.CommonResponse verifyVerificationCode(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, String str, String str2) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to verify verification code, session info is null");
            throw new a(1);
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtils.w("failed to verify verification code, card referenceId or verification code is empty");
            throw new a(1);
        }
        try {
            return TsmRpcModels.CommonResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_VERIFICATION_CODE, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.VerifyVerificationCode.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).setVirtualCardReferenceId(str).setVerificationCode(str2).build().toByteArray())).addParams(TSMAuthContants.PARAM_AUTO_AUTHORIZE_FLAG, "1").create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("verifyVerificationCode failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("verifyVerificationCode failed, code: " + e2.mErrorCode + ", msg:" + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    @Override // com.miui.tsmclient.net.BaseAuthManager
    public String sendRequest(Context context, AccountInfo accountInfo, AuthRequest authRequest) throws AuthApiException {
        return (String) super.sendRequest(context, accountInfo, authRequest);
    }
}
