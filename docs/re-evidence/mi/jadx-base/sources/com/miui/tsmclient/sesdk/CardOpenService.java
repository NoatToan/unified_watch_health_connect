package com.miui.tsmclient.sesdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.account.AccountInfo;
import com.miui.tsmclient.account.TSMAccountManager;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.internal.okhttp.InternalIOException;
import com.miui.tsmclient.entity.CardGroupType;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.entity.SeInfoResponse;
import com.miui.tsmclient.entity.UncompletedBusiness;
import com.miui.tsmclient.model.BaseModel;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.BaseTransitCardModel;
import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.model.g;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.open.IMiTransitOpenService;
import com.miui.tsmclient.open.OpenConstants;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.NetworkUtil;
import com.miui.tsmclient.util.TSMLocationService;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.model.TradeLog;
import defpackage.ezs;
import defpackage.s0t;
import defpackage.trs;
import java.io.IOException;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class CardOpenService extends Service {
    private IMiTransitOpenService mService;

    public static final class CardData {

        @SerializedName("balance")
        private int mBalance;

        @SerializedName("cardBusinessStatus")
        private String mCardBusinessStatus;

        @SerializedName("cardBusinessStatusDesc")
        private String mCardBusinessStatusDesc;

        @SerializedName(TSMAuthContants.PARAM_CARDNO)
        private String mCardNo;
        private int mDataType;

        @SerializedName("logicCardNo")
        private String mLogicCardNo;

        @SerializedName("tradeRecords")
        private List<TradeRecord> mTradeRecords;

        @SerializedName("validityDate")
        private String mValidityDate;

        public static class CardDataSerializer implements JsonSerializer<CardData> {
            @Override // com.google.gson.JsonSerializer
            public JsonElement serialize(CardData cardData, Type type, JsonSerializationContext jsonSerializationContext) {
                JsonObject jsonObject = new JsonObject();
                int i = cardData.mDataType;
                boolean z = i == 0;
                if ((i & 1) != 0 || z) {
                    jsonObject.addProperty(TSMAuthContants.PARAM_CARDNO, cardData.mCardNo);
                    jsonObject.addProperty("logicCardNo", cardData.mLogicCardNo);
                }
                if ((i & 2) != 0 || z) {
                    jsonObject.addProperty("balance", Integer.valueOf(cardData.mBalance));
                }
                if ((i & 4) != 0 || z) {
                    jsonObject.addProperty("validityDate", cardData.mValidityDate);
                }
                if ((i & 8) != 0 || z) {
                    jsonObject.add("tradeRecords", jsonSerializationContext.serialize(cardData.mTradeRecords));
                }
                if (!TextUtils.isEmpty(cardData.mCardBusinessStatus)) {
                    jsonObject.addProperty("cardBusinessStatus", cardData.mCardBusinessStatus);
                }
                if (!TextUtils.isEmpty(cardData.mCardBusinessStatusDesc)) {
                    jsonObject.addProperty("cardBusinessStatusDesc", cardData.mCardBusinessStatusDesc);
                }
                return jsonObject;
            }
        }

        public static final class TradeRecord {

            @SerializedName("tradeAmount")
            private int mTradeAmount;

            @SerializedName("tradeDate")
            private String mTradeDate;

            @SerializedName("tradeType")
            private int mTradeType;

            private TradeRecord(TradeLog tradeLog) {
                this.mTradeType = tradeLog.getTradeType();
                this.mTradeAmount = (int) tradeLog.getAuAmount();
                if (TextUtils.isEmpty(tradeLog.getTradeDate()) || TextUtils.isEmpty(tradeLog.getTradeTime())) {
                    return;
                }
                this.mTradeDate = tradeLog.getTradeDate() + tradeLog.getTradeTime();
            }
        }

        private CardData(CardInfo cardInfo, int i) {
            UncompletedBusiness uncompletedBusiness;
            this.mDataType = i;
            String str = cardInfo.mCardNo;
            this.mCardNo = str == null ? "" : str;
            this.mLogicCardNo = cardInfo.mRealCardNo;
            this.mBalance = cardInfo.mCardBalance;
            this.mValidityDate = cardInfo.mEndDate;
            this.mTradeRecords = new ArrayList();
            List<TradeLog> list = cardInfo.mTradeLogs;
            if (list != null) {
                Iterator<TradeLog> it = list.iterator();
                while (it.hasNext()) {
                    this.mTradeRecords.add(new TradeRecord(it.next()));
                }
            }
            if (!(cardInfo instanceof PayableCardInfo) || (uncompletedBusiness = ((PayableCardInfo) cardInfo).getUncompletedBusiness()) == null) {
                return;
            }
            this.mCardBusinessStatus = uncompletedBusiness.getBusinessStatus();
            this.mCardBusinessStatusDesc = uncompletedBusiness.getRespDesc();
        }
    }

    public static final class Response {

        @SerializedName("data")
        private Object mData;

        @SerializedName("resultMsg")
        private String mMsg;

        @SerializedName("resultCode")
        private int mResultCode;

        public Response(Context context, int i) {
            this(context, i, null);
        }

        public boolean isSuccess() {
            return this.mResultCode == 0;
        }

        public String toString() {
            return new GsonBuilder().registerTypeAdapter(CardData.class, new CardData.CardDataSerializer()).create().toJson(this);
        }

        public Response(Context context, int i, Object obj) {
            this(context, i, null, obj);
        }

        public Response(Context context, int i, String str, Object obj) {
            this.mResultCode = i;
            this.mMsg = isSuccess() ? "" : ErrorCode.getErrorText(context, i, str);
            this.mData = obj;
        }
    }

    public class ServiceImpl extends IMiTransitOpenService.Stub {
        private static final String sErrorNetwork = "error_network";
        private Context mContext;
        private MiPayService mMiPayService = new MiPayService();

        public ServiceImpl(Context context) {
            this.mContext = context;
        }

        private Response checkCallingApp(Map map) {
            Signature[] signatureArr;
            String str = (String) map.get("cardType");
            String str2 = (String) map.get("spId");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return new Response(this.mContext, 1);
            }
            Response response = new Response(this.mContext, 20);
            int callingUid = Binder.getCallingUid();
            PackageManager packageManager = this.mContext.getPackageManager();
            String[] packagesForUid = packageManager.getPackagesForUid(callingUid);
            if (packagesForUid == null || packagesForUid.length == 0) {
                return response;
            }
            int errorCode = 0;
            try {
                String str3 = packagesForUid[0];
                map.put("callerPackageName", str3);
                LogUtils.d("CardOpenService checkCallingApp packageName:" + str3);
                PackageInfo packageInfo = packageManager.getPackageInfo(str3, 64);
                if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(packageInfo.signatures[0].toByteArray());
                    CommonResponseInfo commonResponseInfo = (CommonResponseInfo) HttpClient.getInstance(this.mContext).execute(new ezs(str2, str, Coder.bytesToHexString(messageDigest.digest()))).getResult();
                    if (commonResponseInfo != null) {
                        Context context = this.mContext;
                        if (!commonResponseInfo.isSuccess()) {
                            errorCode = commonResponseInfo.getErrorCode();
                        }
                        return new Response(context, errorCode, commonResponseInfo.getErrorDesc(), null);
                    }
                }
            } catch (InternalIOException e) {
                return new Response(this.mContext, e.getErrorCode(), e.getMessage(), null);
            } catch (Exception e2) {
                LogUtils.e("checkCallingApp error occurred", e2);
            }
            return response;
        }

        private UncompletedBusiness checkTransCardUncompletedBusiness(String str) {
            List<UncompletedBusiness> listQueryUncompletedBusiness;
            try {
                listQueryUncompletedBusiness = ((BaseTransitCardModel) BaseModel.create(this.mContext, BaseTransitCardModel.class)).queryUncompletedBusiness(str);
            } catch (AuthApiException e) {
                LogUtils.e("checkTransCardUncompletedBusiness failed! :" + e.mErrorMsg);
                listQueryUncompletedBusiness = null;
            }
            if (listQueryUncompletedBusiness == null || listQueryUncompletedBusiness.isEmpty()) {
                return null;
            }
            return listQueryUncompletedBusiness.get(0);
        }

        private Bundle getBundle(Map map) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(Constants.EXTRA_OUT_OPERATION, true);
            if (map != null) {
                bundle.putString("business_id", (String) map.get("businessId"));
                bundle.putString("callerPackageName", (String) map.get("callerPackageName"));
                Map map2 = (Map) map.get("extraData");
                if (map2 != null) {
                    bundle.putString("extra_data", new Gson().toJson(map2));
                }
            }
            return bundle;
        }

        private SeCard getCard(Map map) {
            String str = (String) map.get("cardType");
            try {
                List<SeCard> transitCardList = this.mMiPayService.getTransitCardList(str, false);
                if (!transitCardList.isEmpty()) {
                    return transitCardList.get(0);
                }
            } catch (AuthApiException e) {
                LogUtils.e("getCard:" + str + " failed", e);
            }
            return null;
        }

        private Response getNfcEEStatus() {
            return new Response(this.mContext, CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_DUMMY, null).getDeviceInfo().isEseEnabled(this.mContext) ? 0 : 31);
        }

        private String getParam(Map map) {
            return new JSONObject(map).toString();
        }

        private Map getParamMap(Map map) {
            HashMap map2 = new HashMap();
            map2.put(Constants.EXTRA_OUT_OPERATION, Boolean.TRUE);
            if (map != null) {
                map2.put("business_id", (String) map.get("businessId"));
                map2.put("callerPackageName", (String) map.get("callerPackageName"));
                Map map3 = (Map) map.get("extraData");
                if (map3 != null) {
                    map2.put("extra_data", new Gson().toJson(map3));
                }
            }
            return map2;
        }

        private void notify(SeCard seCard, String str) {
            Intent intent = new Intent(OpenConstants.ACTION_UPDATE_CARD_INFO);
            intent.setPackage(this.mContext.getPackageName());
            intent.putExtra("action_type", str);
            intent.putExtra("card_type", seCard.getId());
            intent.putExtra("aid", seCard.getAid());
            this.mContext.sendBroadcast(intent);
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String deleteCard(Map map) throws RemoteException {
            LogUtils.d("CardOpenService deleteCard called");
            Response responseCheckCallingApp = checkCallingApp(map);
            if (!responseCheckCallingApp.isSuccess()) {
                return responseCheckCallingApp.toString();
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                SeCard card = getCard(map);
                if (card == null) {
                    return new Response(this.mContext, 2).toString();
                }
                BaseResponse baseResponse = new BaseResponse();
                if (card.getCategory() == CardCategory.TRANSIT) {
                    baseResponse = card.returnCard(getParam(getParamMap(map)));
                }
                if (card.getCategory() == CardCategory.DOOR) {
                    baseResponse = card.delete(getParam(getParamMap(map)));
                }
                if (baseResponse.isSuccess()) {
                    notify(card, "delete");
                }
                String string = new Response(this.mContext, baseResponse.mResultCode, baseResponse.mMsg, null).toString();
                LogUtils.d("CardOpenService deleteCard: " + string);
                return string;
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String executeCommands(Map map) throws NotSupportedException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String getGiftCard(Map map) throws RemoteException {
            Response response;
            LogUtils.d("CardOpenService getGiftCard called");
            Response responseCheckCallingApp = checkCallingApp(map);
            if (!responseCheckCallingApp.isSuccess()) {
                return responseCheckCallingApp.toString();
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    JSONArray jSONArrayQueryGiftCardRequest = new TSMAuthManager().queryGiftCardRequest(this.mContext, CardGroupType.TRANSCARD, (String) map.get("cardType"), TSMLocationService.getInstance(this.mContext).getLastLocation());
                    response = new Response(this.mContext, 0, "", jSONArrayQueryGiftCardRequest);
                    LogUtils.d("CardOpenService getGiftCard jsonArray:" + jSONArrayQueryGiftCardRequest.toString());
                } catch (AuthApiException e) {
                    response = new Response(this.mContext, e.mErrorCode, e.mErrorMsg, null);
                }
                return response.toString();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String getSeid(Map map) throws RemoteException {
            String cplc;
            LogUtils.d("CardOpenService getSeid called");
            Response responseCheckCallingApp = checkCallingApp(map);
            if (!responseCheckCallingApp.isSuccess()) {
                return responseCheckCallingApp.toString();
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                SeCard card = getCard(map);
                if (card == null) {
                    String string = new Response(this.mContext, 2).toString();
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    return string;
                }
                try {
                    cplc = card.mCardInfo.getTerminal().getCPLC();
                } catch (Exception e) {
                    LogUtils.e("getCplc error on getSeid", e);
                    cplc = null;
                }
                if (TextUtils.isEmpty(cplc)) {
                    String string2 = new Response(this.mContext, 13).toString();
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    return string2;
                }
                try {
                    SeInfoResponse seInfoResponse = (SeInfoResponse) HttpClient.getInstance(this.mContext).execute(new s0t((String) map.get("spId"), (String) map.get("cardType"), cplc)).getResult();
                    if (seInfoResponse != null) {
                        String string3 = new Response(this.mContext, seInfoResponse.isSuccess() ? 0 : seInfoResponse.getErrorCode(), seInfoResponse.getErrorDesc(), seInfoResponse.getData()).toString();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        return string3;
                    }
                } catch (IOException e2) {
                    LogUtils.e("execute GetSeidRequest failed", e2);
                }
                String string4 = new Response(this.mContext, 2).toString();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                return string4;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String getServiceStatus(Map map) throws RemoteException {
            String cplc;
            LogUtils.d("CardOpenService getServiceStatus called");
            if (!NetworkUtil.isConnected(this.mContext)) {
                return new Response(this.mContext, 2).toString();
            }
            Response responseCheckCallingApp = checkCallingApp(map);
            if (!responseCheckCallingApp.isSuccess()) {
                return responseCheckCallingApp.toString();
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                AccountInfo accountInfoLoadAccountInfo = new TSMAccountManager().loadAccountInfo(this.mContext);
                if (accountInfoLoadAccountInfo != null && accountInfoLoadAccountInfo.getUserId() != null) {
                    String str = (String) map.get("cardType");
                    String str2 = (String) map.get("spId");
                    SeCard card = getCard(map);
                    if (card == null) {
                        String string = new Response(this.mContext, 2).toString();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        return string;
                    }
                    try {
                        cplc = card.mCardInfo.getTerminal().getCPLC();
                    } catch (Exception e) {
                        LogUtils.e("getCplc error on getServiceStatus", e);
                        cplc = null;
                    }
                    try {
                        CommonResponseInfo commonResponseInfo = (CommonResponseInfo) HttpClient.getInstance(this.mContext).execute(new trs(str2, str, cplc, (String) map.get("actionType"))).getResult();
                        if (commonResponseInfo != null) {
                            Response nfcEEStatus = getNfcEEStatus();
                            if (!nfcEEStatus.isSuccess()) {
                                String string2 = nfcEEStatus.toString();
                                Binder.restoreCallingIdentity(jClearCallingIdentity);
                                return string2;
                            }
                            if (TextUtils.isEmpty(cplc)) {
                                String string3 = new Response(this.mContext, 13).toString();
                                Binder.restoreCallingIdentity(jClearCallingIdentity);
                                return string3;
                            }
                            String string4 = new Response(this.mContext, commonResponseInfo.isSuccess() ? 0 : commonResponseInfo.getErrorCode(), commonResponseInfo.getErrorDesc(), null).toString();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            return string4;
                        }
                    } catch (IOException e2) {
                        LogUtils.e("execute TransitServiceStatusRequest failed", e2);
                    }
                    String string5 = new Response(this.mContext, 2).toString();
                    LogUtils.d("CardOpenService getServiceStatus: " + string5);
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    return string5;
                }
                String string6 = new Response(this.mContext, 14).toString();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                return string6;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String issueCard(Map map) throws RemoteException {
            LogUtils.d("CardOpenService issueCard called");
            Response responseCheckCallingApp = checkCallingApp(map);
            if (!responseCheckCallingApp.isSuccess()) {
                return responseCheckCallingApp.toString();
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                SeCard card = getCard(map);
                if (card == null) {
                    return new Response(this.mContext, 2).toString();
                }
                BaseResponse baseResponseIssue = card.issue(getParam(getParamMap(map)));
                if (baseResponseIssue.isSuccess()) {
                    notify(card, "add");
                }
                String string = new Response(this.mContext, baseResponseIssue.mResultCode, baseResponseIssue.mMsg, null).toString();
                LogUtils.d("CardOpenService issueCard: " + string);
                return string;
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String login(Map map) throws NotSupportedException {
            return null;
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String preIssueCard(Map map) throws RemoteException {
            LogUtils.d("CardOpenService preIssueCard called");
            Response responseCheckCallingApp = checkCallingApp(map);
            if (!responseCheckCallingApp.isSuccess()) {
                return responseCheckCallingApp.toString();
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                SeCard card = getCard(map);
                if (card == null) {
                    return new Response(this.mContext, 2).toString();
                }
                String str = (String) map.get("cardType");
                Bundle bundle = getBundle(map);
                bundle.putBoolean(Constants.EXTRA_PRE_LOAD, true);
                BaseResponse baseResponseL = g.a(str).l(this.mContext, card.mCardInfo, bundle);
                String string = new Response(this.mContext, baseResponseL.mResultCode, baseResponseL.mMsg, null).toString();
                LogUtils.d("CardOpenService preIssueCard: " + string);
                return string;
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String queryCardInfo(Map map) throws RemoteException {
            int iIntValue;
            LogUtils.d("CardOpenService queryCardInfo called");
            Response responseCheckCallingApp = checkCallingApp(map);
            if (!responseCheckCallingApp.isSuccess()) {
                return responseCheckCallingApp.toString();
            }
            int i = 0;
            if (map.containsKey("dataType")) {
                try {
                    iIntValue = ((Integer) map.get("dataType")).intValue();
                } catch (Exception e) {
                    LogUtils.e("queryCardInfo failed when parsing dataType", e);
                    iIntValue = 0;
                }
            } else {
                iIntValue = 0;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                SeCard card = getCard(map);
                if (card == null) {
                    return new Response(this.mContext, 2).toString();
                }
                UncompletedBusiness uncompletedBusinessCheckTransCardUncompletedBusiness = checkTransCardUncompletedBusiness(card.getId());
                CardInfo cardInfo = card.mCardInfo;
                if (cardInfo instanceof PayableCardInfo) {
                    ((PayableCardInfo) cardInfo).setUncompletedBusiness(uncompletedBusinessCheckTransCardUncompletedBusiness);
                }
                if (!card.updateContent().isSuccess()) {
                    LogUtils.e("queryCardInfo failed");
                    return new Response(this.mContext, -1, null, null).toString();
                }
                if (!card.isIssued()) {
                    i = 2003;
                }
                return new Response(this.mContext, i, card.isIssued() ? null : "not exist", new CardData(card.mCardInfo, iIntValue)).toString();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // com.miui.tsmclient.open.IMiTransitOpenService
        public String recharge(Map map) throws RemoteException {
            LogUtils.d("CardOpenService recharge called");
            Response responseCheckCallingApp = checkCallingApp(map);
            if (!responseCheckCallingApp.isSuccess()) {
                return responseCheckCallingApp.toString();
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                SeCard card = getCard(map);
                if (card == null) {
                    return new Response(this.mContext, 2).toString();
                }
                BaseResponse baseResponseRecharge = card.recharge(getParam(getParamMap(map)));
                if (baseResponseRecharge.isSuccess()) {
                    notify(card, "update");
                }
                String string = new Response(this.mContext, baseResponseRecharge.mResultCode, baseResponseRecharge.mMsg, null).toString();
                LogUtils.d("CardOpenService recharge: " + string);
                return string;
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.mService == null) {
            this.mService = new ServiceImpl(this);
        }
        return this.mService.asBinder();
    }
}
