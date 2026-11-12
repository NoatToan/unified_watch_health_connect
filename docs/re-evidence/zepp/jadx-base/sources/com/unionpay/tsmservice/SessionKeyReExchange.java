package com.unionpay.tsmservice;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.unionpay.tsmservice.data.Constant;
import com.unionpay.tsmservice.data.ResultCode;
import com.unionpay.tsmservice.request.BleKeyExchangeRequestParams;
import com.unionpay.tsmservice.request.CheckBinRequestParams;
import com.unionpay.tsmservice.request.EncryptDataRequestParams;
import com.unionpay.tsmservice.request.ExchangeKeyRequestParams;
import com.unionpay.tsmservice.request.ExecuteCmdRequestParams;
import com.unionpay.tsmservice.request.GetActiveCodeRequestParams;
import com.unionpay.tsmservice.request.GetEncryptDataRequestParams;
import com.unionpay.tsmservice.request.GetUniteAppListRequestParams;
import com.unionpay.tsmservice.request.InitRequestParams;
import com.unionpay.tsmservice.request.OpenUniteCardApplyActivityWithRiskInfoRequestParams;
import com.unionpay.tsmservice.request.RequestParams;
import com.unionpay.tsmservice.request.SafetyKeyboardRequestParams;
import com.unionpay.tsmservice.request.UniteAppDeleteRequestParams;
import com.unionpay.tsmservice.request.UniteAppDownloadRequestParams;
import com.unionpay.tsmservice.request.UniteCardActiveRequestParams;
import com.unionpay.tsmservice.result.ExchangeKeyResult;
import com.unionpay.tsmservice.result.GetPubKeyResult;
import com.unionpay.tsmservice.utils.IUPJniInterface;

/* JADX INFO: loaded from: classes18.dex */
public class SessionKeyReExchange {
    private static final String k = "SessionKeyReExchange";
    private UPTsmAddon a;
    private int b;
    private RequestParams c;
    private ITsmCallback d;
    private ITsmProgressCallback e;
    private int f;
    private Object g;
    private OnSafetyKeyboardCallback h;
    private Context i;
    private int j;

    public class a extends ITsmCallback.Stub {
        public static final int f = 0;
        public static final int g = 1;
        private int d;

        public a(int i) {
            this.d = -1;
            this.d = i;
        }

        @Override // com.unionpay.tsmservice.ITsmCallback
        public void onError(String str, String str2) throws RemoteException {
            Log.e(SessionKeyReExchange.k, "execute reExchangeKey onError : errorCode=" + str + " errorDesc=" + str2);
            if (SessionKeyReExchange.this.d != null) {
                switch (SessionKeyReExchange.this.b) {
                    case 1:
                        str = ResultCode.ERROR_INTERFACE_GET_ASSOCIATED_APP;
                        break;
                    case 2:
                        str = ResultCode.ERROR_INTERFACE_APP_DOWNLOAD_APPLY;
                        break;
                    case 3:
                        str = ResultCode.ERROR_INTERFACE_APP_DELETE;
                        break;
                    case 4:
                        str = ResultCode.ERROR_INTERFACE_GET_SMS_AUTH_CODE;
                        break;
                    case 5:
                        str = ResultCode.ERROR_INTERFACE_GET_APP_DETAIL;
                        break;
                    case 6:
                        str = ResultCode.ERROR_INTERFACE_GET_TRANS_ELEMENTS;
                        break;
                    case 7:
                        str = ResultCode.ERROR_INTERFACE_APP_DOWNLOAD;
                        break;
                    case 8:
                    case 9:
                        str = ResultCode.ERROR_INTERFACE_APP_DATA_UPDATE;
                        break;
                    case 10:
                        str = ResultCode.ERROR_INTERFACE_GET_TRANS_RECORD;
                        break;
                    case 11:
                        str = ResultCode.ERROR_INTERFACE_GET_ACCOUNT_INFO;
                        break;
                    case 12:
                        str = ResultCode.ERROR_INTERFACE_GET_ACCOUNT_BALANCE;
                        break;
                    case 13:
                        str = ResultCode.ERROR_INTERFACE_GET_CARD_INFO;
                        break;
                    case 14:
                        str = ResultCode.ERROR_INTERFACE_SET_DEFAULT_CARD;
                        break;
                    case 15:
                        str = ResultCode.ERROR_INTERFACE_OPEN_CHANNEL;
                        break;
                    case 16:
                        str = ResultCode.ERROR_INTERFACE_SEND_APDU;
                        break;
                    case 17:
                        str = ResultCode.ERROR_INTERFACE_CLOSE_CHANNEL;
                        break;
                    case 18:
                        str = ResultCode.ERROR_INTERFACE_HIDE_APP_APPLY;
                        break;
                    case 19:
                        str = ResultCode.ERROR_INTERFACE_GET_SE_ID;
                        break;
                    case 20:
                        str = ResultCode.ERROR_INTERFACE_GET_DEFAULT_CARD;
                        break;
                    case 21:
                        str = ResultCode.ERROR_INTERFACE_GET_SE_APP_LIST;
                        break;
                    case 22:
                        str = ResultCode.ERROR_INTERFACE_GET_APP_LIST;
                        break;
                    case 23:
                        str = ResultCode.ERROR_INTERFACE_GET_APP_STATUS;
                        break;
                    case 24:
                        str = ResultCode.ERROR_INTERFACE_APP_LOCK;
                        break;
                    case 25:
                        str = ResultCode.ERROR_INTERFACE_APP_UNLOCK;
                        break;
                    case 26:
                        str = "10004";
                        break;
                    case 27:
                    case 29:
                        str = "10001";
                        break;
                    case 28:
                        str = ResultCode.ERROR_INTERFACE_EXECUTE_CMD;
                        break;
                    case 32:
                        str = ResultCode.ERROR_INTERFACE_CHECK_BIN_CODE;
                        break;
                    case 33:
                        str = ResultCode.ERROR_INTERFACE_OPEN_UNITE_CARD_APPLY_ACTIVITY;
                        break;
                    case 34:
                        str = ResultCode.ERROR_INTERFACE_UNITE_APP_DOWNLOAD;
                        break;
                    case 35:
                        str = ResultCode.ERROR_INTERFACE_UNITE_APP_LIST;
                        break;
                    case 36:
                        str = ResultCode.ERROR_INTERFACE_UNITE_APP_DELETE;
                        break;
                    case 37:
                        str = ResultCode.ERROR_INTERFACE_GET_ACTIVE_CODE;
                        break;
                    case 38:
                        str = ResultCode.ERROR_INTERFACE_UNITE_CARD_ACTIVE;
                        break;
                    case 39:
                        str = ResultCode.ERROR_INTERFACE_GET_SUPPORTED_CARD_TYPE_LIST;
                        break;
                    case 40:
                        str = ResultCode.ERROR_INTERFACE_SET_SAFETYKEYBOARD_BITMAP;
                        break;
                    case 41:
                        str = ResultCode.ERROR_INTERFACE_SHOW_SAFETYKEYBOARD;
                        break;
                    case 42:
                        str = ResultCode.ERROR_INTERFACE_GET_SAFETYKEYBOARD_ENCRYPTEDDATA;
                        break;
                }
                SessionKeyReExchange.this.d.onError(str + "00000", str2);
            }
        }

        @Override // com.unionpay.tsmservice.ITsmCallback
        public void onResult(Bundle bundle) throws RemoteException {
            int i = this.d;
            if (i == 0) {
                bundle.setClassLoader(GetPubKeyResult.class.getClassLoader());
                SessionKeyReExchange.this.h(((GetPubKeyResult) bundle.get("result")).getKey());
            } else {
                if (i != 1) {
                    return;
                }
                bundle.setClassLoader(ExchangeKeyResult.class.getClassLoader());
                SessionKeyReExchange.this.g(((ExchangeKeyResult) bundle.get("result")).getKey());
            }
        }
    }

    public SessionKeyReExchange(UPTsmAddon uPTsmAddon, int i, ITsmCallback iTsmCallback) {
        this(uPTsmAddon, i, (RequestParams) null, iTsmCallback);
    }

    private String e(String str) {
        return IUPJniInterface.adM(str);
    }

    private String f() {
        return IUPJniInterface.amSK();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str) throws RemoteException {
        String strE = e(str);
        if (1001 != this.f) {
            k(strE);
            l(1000, strE);
            Log.i(Constant.ADDON_LOG_TAG, "=======updateSessionKeyTimestamp");
            i();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constant.KEY_SESSION_KEY, strE);
        if (this.d != null) {
            l(1001, strE);
            this.d.onResult(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) throws RemoteException {
        String strJ = j(str, f());
        ExchangeKeyRequestParams exchangeKeyRequestParams = new ExchangeKeyRequestParams();
        exchangeKeyRequestParams.setTempKey(strJ);
        exchangeKeyRequestParams.setType(this.f);
        this.a.exchangeKey(exchangeKeyRequestParams, new a(1));
    }

    private void i() throws RemoteException {
        int i = this.b;
        if (i == 13) {
            this.a.getCardInfo((String[]) this.g, this.d);
        }
        if (i == 14) {
            this.a.setDefaultCard((String) this.g, this.d);
            return;
        }
        if (i == 20) {
            this.a.getDefaultCard(this.d);
            return;
        }
        switch (i) {
            case 26:
                this.a.encryptData((EncryptDataRequestParams) this.c, this.d);
                break;
            case 27:
                InitRequestParams initRequestParams = (InitRequestParams) this.c;
                Log.i(Constant.ADDON_LOG_TAG, "=======mUPTsmAddon.init");
                this.a.init(initRequestParams, this.d);
                break;
            case 28:
                this.a.executeCmd((ExecuteCmdRequestParams) this.c, this.d, this.e);
                break;
            case 29:
                this.a.bleKeyExchange((BleKeyExchangeRequestParams) this.c, this.d);
                break;
            default:
                switch (i) {
                    case 32:
                        this.a.checkBinCode((CheckBinRequestParams) this.c, this.d);
                        break;
                    case 33:
                        OpenUniteCardApplyActivityWithRiskInfoRequestParams openUniteCardApplyActivityWithRiskInfoRequestParams = (OpenUniteCardApplyActivityWithRiskInfoRequestParams) this.c;
                        UPTsmAddon uPTsmAddon = this.a;
                        uPTsmAddon.openUniteCardApplyActivity(openUniteCardApplyActivityWithRiskInfoRequestParams, uPTsmAddon.getContext(), this.d);
                        break;
                    case 34:
                        this.a.UniteAppDownload((UniteAppDownloadRequestParams) this.c, this.d, this.e);
                        break;
                    case 35:
                        this.a.getUniteAppList((GetUniteAppListRequestParams) this.c, this.d);
                        break;
                    case 36:
                        this.a.uniteAppDelete((UniteAppDeleteRequestParams) this.c, this.d, this.e);
                        break;
                    case 37:
                        this.a.getActiveCode((GetActiveCodeRequestParams) this.c, this.d);
                        break;
                    case 38:
                        this.a.uniteCardActive((UniteCardActiveRequestParams) this.c, this.d);
                        break;
                    case 39:
                        this.a.getSupportedCardTypeList(this.d);
                        break;
                    case 40:
                        this.a.setSafetyKeyboardBitmap((SafetyKeyboardRequestParams) this.c);
                        break;
                    case 41:
                        this.a.showSafetyKeyboard((SafetyKeyboardRequestParams) this.c, this.j, this.h, this.i);
                        break;
                    case 42:
                        this.a.getEncryptData((GetEncryptDataRequestParams) this.c, this.d);
                        break;
                }
                break;
        }
    }

    private String j(String str, String str2) {
        return IUPJniInterface.arEWK(str, str2);
    }

    private void k(String str) {
        IUPJniInterface.asSK(str);
    }

    private void l(int i, String str) {
        Context context = this.a.getContext();
        if (context != null) {
            if (1000 == i) {
                IUPJniInterface.auSKT(context.getPackageName(), str);
            } else if (1001 == i) {
                IUPJniInterface.auSKT(Constant.PREFIX + context.getPackageName(), str);
            }
        }
    }

    public void reGetPubKey() throws RemoteException {
        this.a.getPubKey(new a(0));
    }

    public SessionKeyReExchange(UPTsmAddon uPTsmAddon, int i, RequestParams requestParams, ITsmCallback iTsmCallback) {
        this(uPTsmAddon, i, requestParams, iTsmCallback, null);
    }

    public SessionKeyReExchange(UPTsmAddon uPTsmAddon, int i, RequestParams requestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback) {
        this(uPTsmAddon, i, requestParams, iTsmCallback, (ITsmProgressCallback) null, 1000);
    }

    public SessionKeyReExchange(UPTsmAddon uPTsmAddon, int i, RequestParams requestParams, ITsmCallback iTsmCallback, ITsmProgressCallback iTsmProgressCallback, int i2) {
        this.b = 0;
        this.f = 1000;
        this.a = uPTsmAddon;
        this.b = i;
        this.c = requestParams;
        this.d = iTsmCallback;
        this.e = iTsmProgressCallback;
        this.f = i2;
    }

    public SessionKeyReExchange(UPTsmAddon uPTsmAddon, int i, SafetyKeyboardRequestParams safetyKeyboardRequestParams, int i2, OnSafetyKeyboardCallback onSafetyKeyboardCallback, Context context) {
        this.b = 0;
        this.f = 1000;
        this.a = uPTsmAddon;
        this.b = i;
        this.j = i2;
        this.c = safetyKeyboardRequestParams;
        this.h = onSafetyKeyboardCallback;
        this.i = context;
    }

    public SessionKeyReExchange(UPTsmAddon uPTsmAddon, int i, Object obj, ITsmCallback iTsmCallback) {
        this.b = 0;
        this.f = 1000;
        this.a = uPTsmAddon;
        this.b = i;
        this.g = obj;
        this.d = iTsmCallback;
        this.f = 1000;
    }
}
