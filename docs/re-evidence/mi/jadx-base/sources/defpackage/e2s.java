package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.miui.tsmclient.account.AccountInfo;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.Response;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.entity.digitalkey.CarKeyList;
import com.miui.tsmclient.entity.digitalkey.CertificateInfo;
import com.miui.tsmclient.entity.digitalkey.NotificationTokenInfo;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.AuthRequest;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.Coder;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class e2s extends b4s {

    public class a extends TypeToken<List<String>> {
        public a() {
        }
    }

    public CommonResponseInfo a(Context context, String str, int i, String str2) {
        CommonResponseInfo commonResponseInfo = new CommonResponseInfo();
        try {
            return (CommonResponseInfo) HttpClient.getInstance(context).execute(new fet(str, i, str2)).getResult();
        } catch (IOException e) {
            LogUtils.e("occurs an exception for reportTrackResult", e);
            commonResponseInfo.setErrorCode(12);
            return commonResponseInfo;
        }
    }

    public CommonResponseInfo b(Context context, String str, String str2) {
        String string = UUID.randomUUID().toString();
        int i = 0;
        Response responseExecute = null;
        do {
            try {
                responseExecute = HttpClient.getInstance(context).execute(new avs(str, str2, string));
                if (responseExecute.isHttpRequestSuccessful()) {
                    break;
                }
                Thread.sleep(VibrateModeProgressBar.sLongToLong);
                i++;
            } catch (Exception e) {
                LogUtils.e("occurs an exception for deleteMailbox", e);
                if (responseExecute == null) {
                    return null;
                }
                return (CommonResponseInfo) responseExecute.getResult();
            }
        } while (i <= 1);
        CommonResponseInfo commonResponseInfo = new CommonResponseInfo();
        commonResponseInfo.setErrorCode(responseExecute.getHttpStatusCode());
        return commonResponseInfo;
    }

    public CommonResponseInfo c(Context context, String str, String str2, String str3, int i) {
        try {
            return (CommonResponseInfo) HttpClient.getInstance(context).execute(new yft(str, str2, str3, i)).getResult();
        } catch (IOException e) {
            LogUtils.e("updateShareInvitation IOException, " + e);
            CommonResponseInfo commonResponseInfo = new CommonResponseInfo();
            commonResponseInfo.setErrorCode(2);
            return commonResponseInfo;
        }
    }

    public CommonResponseInfo d(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        CommonResponseInfo commonResponseInfo = null;
        try {
            try {
                Iterator it = ((List) new Gson().fromJson(str2, new a().getType())).iterator();
                while (it.hasNext()) {
                    commonResponseInfo = (CommonResponseInfo) HttpClient.getInstance(context).execute(new set(str, (String) it.next(), str3, str4, str5, str6)).getResult();
                }
            } catch (IOException e) {
                e = e;
                LogUtils.e("terminateRemoteDigitalKey IOException, " + e);
            }
        } catch (IOException e2) {
            e = e2;
        }
        return commonResponseInfo;
    }

    public TsmRpcModels.TsmAPDUCommand e(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, List<TsmRpcModels.SeAPDUResponseItem> list, String str) throws r.a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to process se response, session info is null");
            throw new r.a(1);
        }
        try {
            return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_PROCESS_CCC_SE_RESPONSE, AuthRequest.RespContentType.protobuf).addParams("vehicleOEMId", str).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.SeAPDUResponse.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).addAllResponse(list).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("processCCCSeResponse failed", e);
            throw new r.a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("processCCCSeResponse failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new r.a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmStartActionResponse f(Context context, CarKeyCardInfo carKeyCardInfo, TsmRpcModels.SeOperationType seOperationType, String str, String str2) throws r.a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        String cplc = getCplc(carKeyCardInfo);
        AuthRequest.AuthRequestBuilder authRequestBuilderAddParams = AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_CCC_SE_ACTION, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.TsmStartActionInfo.newBuilder().setSeInfo(TsmRpcModels.SeInfo.newBuilder().setCplc(TextUtils.isEmpty(cplc) ? ByteString.copyFrom(new byte[0]) : ByteString.copyFrom(Coder.hexStringToBytes(cplc))).setDeviceType(ljs.b(carKeyCardInfo)).setDeviceId(DeviceUtils.getDeviceId(context, null)).setActionSource(TsmRpcModels.ActionSource.APP_CLIENT).setDeviceInfo(TsmRpcModels.DeviceInfo.newBuilder().setDeviceModel(ljs.b(carKeyCardInfo)).setLang(Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry()).setMiuiSystemVersion(ljs.n()).setHyperOSVersion(ljs.k()).setRomType(ljs.i()).setMiuiRomType(ljs.f(null)).setTsmclientVersionCode(ljs.a(context)).build()).build()).setActionName(seOperationType).setParams(str2).build().toByteArray()));
        if (!TextUtils.isEmpty(str)) {
            authRequestBuilderAddParams.addParams("vehicleOEMId", str);
        }
        try {
            return TsmRpcModels.TsmStartActionResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, authRequestBuilderAddParams.create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("startCCCAction failed", e);
            throw new r.a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("startCCCAction failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new r.a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public kjs g(Context context, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9) {
        Response responseExecute;
        try {
            qzs qzsVarA = qzs.a(str2);
            NotificationTokenInfo notificationTokenInfoFromJson = NotificationTokenInfo.fromJson(str3);
            int i2 = 0;
            responseExecute = null;
            do {
                try {
                    responseExecute = HttpClient.getInstance(context).execute(new gss(str, qzsVarA, notificationTokenInfoFromJson.getNotificationToken(), str4, str5, str6, i, str7, str8, str9));
                    if (responseExecute.isHttpRequestSuccessful()) {
                        break;
                    }
                    Thread.sleep(VibrateModeProgressBar.sLongToLong);
                    i2++;
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    LogUtils.e("createMailbox Exception, " + e);
                }
            } while (i2 <= 1);
            if (!responseExecute.isHttpRequestSuccessful()) {
                kjs kjsVar = new kjs();
                kjsVar.setErrorCode(responseExecute.getHttpStatusCode());
                return kjsVar;
            }
            ((kjs) responseExecute.getResult()).setErrorCode(responseExecute.getHttpStatusCode());
            if (responseExecute == null) {
                return null;
            }
            return (kjs) responseExecute.getResult();
        } catch (Exception e2) {
            e = e2;
            responseExecute = null;
        }
    }

    public hss h(Context context) {
        try {
            return (hss) HttpClient.getInstance(context).execute(new e3t(DeviceUtils.getDeviceModel(null))).getResult();
        } catch (IOException e) {
            LogUtils.e("getMailboxConfiguration IOException, " + e);
            return null;
        }
    }

    public nxs i(Context context, e7t.a aVar) {
        int i;
        LogUtils.d("sendKeyTracking");
        nxs nxsVar = new nxs();
        try {
            e7t e7tVarB = aVar.b();
            e7tVarB.b();
            Response responseExecute = HttpClient.getInstance(context).execute(e7tVarB);
            if (responseExecute.isSuccess()) {
                nxsVar = (nxs) responseExecute.getResult();
            } else {
                nxsVar.setErrorCode(responseExecute.getHttpStatusCode());
            }
            LogUtils.t("sendKeyTracking responseInfo " + nxsVar);
        } catch (ConnectException | SocketTimeoutException | UnknownHostException unused) {
            i = 2;
            nxsVar.setErrorCode(i);
        } catch (IOException e) {
            LogUtils.e("occurs an exception for sendKeyTracking", e);
            i = 12;
            nxsVar.setErrorCode(i);
        }
        return nxsVar;
    }

    public String j(Context context, String str, String str2, String str3) {
        LogUtils.d("getDigitalKeysDetail");
        try {
            b1t b1tVar = new b1t(context, str3, str, str2, null);
            b1t.b bVar = (b1t.b) HttpClient.getInstance(context).execute(b1tVar).getResult();
            CarKeyList carKeyList = new CarKeyList();
            if (b1tVar.isSuccess()) {
                carKeyList.setCarKeyList(bVar.a() == null ? Collections.EMPTY_LIST : bVar.a().b());
                return new Gson().toJson(carKeyList);
            }
        } catch (IOException e) {
            LogUtils.e("getDigitalKeysDetail IOException" + e);
        }
        return null;
    }

    public List<CertificateInfo> k(Context context, CarKeyCardInfo carKeyCardInfo, String str) {
        try {
            uns unsVar = new uns(carKeyCardInfo.getVehicleOEMId(), str);
            ffs ffsVar = (ffs) HttpClient.getInstance(context).execute(unsVar).getResult();
            if (unsVar.isSuccess()) {
                return ffsVar.a();
            }
        } catch (IOException e) {
            LogUtils.e("occurs an exception for getCertificates", e);
        }
        return Collections.emptyList();
    }

    public e5t l(Context context, String str, String str2, String str3, String str4) {
        Response responseExecute;
        String string = UUID.randomUUID().toString();
        try {
            qzs qzsVarA = qzs.a(str2);
            NotificationTokenInfo notificationTokenInfoFromJson = NotificationTokenInfo.fromJson(str4);
            int i = 0;
            responseExecute = null;
            do {
                try {
                    responseExecute = HttpClient.getInstance(context).execute(new jft(str, str3, qzsVarA, string, notificationTokenInfoFromJson.getNotificationToken()));
                    if (responseExecute.isHttpRequestSuccessful()) {
                        break;
                    }
                    Thread.sleep(VibrateModeProgressBar.sLongToLong);
                    i++;
                } catch (Exception e) {
                    e = e;
                    LogUtils.e("occurs an exception for updateMailbox", e);
                }
            } while (i <= 1);
            if (!responseExecute.isHttpRequestSuccessful()) {
                e5t e5tVar = new e5t();
                e5tVar.setErrorCode(responseExecute.getHttpStatusCode());
                return e5tVar;
            }
            ((e5t) responseExecute.getResult()).setErrorCode(responseExecute.getHttpStatusCode());
            if (responseExecute == null) {
                return null;
            }
            return (e5t) responseExecute.getResult();
        } catch (Exception e2) {
            e = e2;
            responseExecute = null;
        }
    }

    public CommonResponseInfo m(Context context, String str) {
        try {
            return (CommonResponseInfo) HttpClient.getInstance(context).execute(new nas(str)).getResult();
        } catch (IOException e) {
            LogUtils.e("cancelSession IOException, " + e);
            return null;
        }
    }

    public CommonResponseInfo n(Context context, String str, String str2) {
        try {
            return (CommonResponseInfo) HttpClient.getInstance(context).execute(new mxs(str, str2)).getResult();
        } catch (IOException e) {
            LogUtils.e("deleteShareInvitation IOException, " + e);
            CommonResponseInfo commonResponseInfo = new CommonResponseInfo();
            commonResponseInfo.setErrorCode(2);
            return commonResponseInfo;
        }
    }

    public CommonResponseInfo o(Context context, String str, String str2, String str3) {
        try {
            return (CommonResponseInfo) HttpClient.getInstance(context).execute(new ddt(str, str2, str3)).getResult();
        } catch (IOException e) {
            LogUtils.e("redeemSession IOException, " + e);
            return null;
        }
    }

    public String p(Context context) {
        try {
            tbt tbtVar = new tbt();
            d1t d1tVar = (d1t) HttpClient.getInstance(context).execute(tbtVar).getResult();
            if (tbtVar.isSuccess()) {
                return d1tVar.a().toJson();
            }
            return null;
        } catch (IOException e) {
            LogUtils.e("occurs an exception for getPolicyInfo", e);
            return null;
        }
    }

    public vns q(Context context, String str) {
        try {
            return (vns) HttpClient.getInstance(context).execute(new pzs(str)).getResult();
        } catch (IOException e) {
            LogUtils.e("generateSession IOException, " + e);
            return null;
        }
    }

    public String r(Context context) {
        try {
            efs efsVar = new efs(context, ProductList.ProductInfo.CCC_TYPE);
            a4s a4sVar = (a4s) HttpClient.getInstance(context).execute(efsVar).getResult();
            if (!efsVar.isSuccess()) {
                return null;
            }
            List<ProductList.ProductInfo> listA = a4sVar.a().a();
            ProductList productList = new ProductList();
            productList.setProducts(listA);
            return productList.toJson();
        } catch (IOException e) {
            LogUtils.e("occurs an exception for getProductInfo", e);
            return null;
        }
    }

    public f3t s(Context context, String str, String str2) {
        String string = UUID.randomUUID().toString();
        int i = 0;
        Response responseExecute = null;
        do {
            try {
                responseExecute = HttpClient.getInstance(context).execute(new ect(str, str2, string));
                if (responseExecute.isHttpRequestSuccessful()) {
                    break;
                }
                Thread.sleep(VibrateModeProgressBar.sLongToLong);
                i++;
            } catch (Exception e) {
                LogUtils.e("occurs an exception for queryMailbox", e);
            }
        } while (i <= 1);
        if (!responseExecute.isHttpRequestSuccessful()) {
            f3t f3tVar = new f3t();
            f3tVar.setErrorCode(responseExecute.getHttpStatusCode());
            return f3tVar;
        }
        ((f3t) responseExecute.getResult()).setErrorCode(responseExecute.getHttpStatusCode());
        if (responseExecute == null) {
            return null;
        }
        return (f3t) responseExecute.getResult();
    }

    public CommonResponseInfo t(Context context, String str, String str2) {
        try {
            Response responseExecute = HttpClient.getInstance(context).execute(new pdt(str, str2, UUID.randomUUID().toString()));
            CommonResponseInfo commonResponseInfo = new CommonResponseInfo();
            commonResponseInfo.setErrorCode(responseExecute.getHttpStatusCode());
            return commonResponseInfo;
        } catch (Exception unused) {
            LogUtils.e("occurs an exception for relinquishMailbox");
            return null;
        }
    }

    public bvs u(Context context, String str) {
        try {
            return (bvs) HttpClient.getInstance(context).execute(new d5t(str)).getResult();
        } catch (IOException e) {
            LogUtils.e("occurs an exception for getNotificationToken", e);
            return null;
        }
    }
}
