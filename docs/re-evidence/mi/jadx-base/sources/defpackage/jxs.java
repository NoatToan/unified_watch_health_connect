package defpackage;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.miui.tsmclient.account.AccountInfo;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.internal.okhttp.InternalIOException;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.AuthRequest;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.Coder;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import r.a;

/* JADX INFO: loaded from: classes2.dex */
public class jxs extends e2s {
    public TsmRpcModels.TsmAPDUCommand v(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, List<TsmRpcModels.SeAPDUResponseItem> list) throws a {
        AccountInfo accountInfoLoadAccountInfo = loadAccountInfo(context);
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to process se response, session info is null");
            throw new a(1);
        }
        try {
            return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfoLoadAccountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfoLoadAccountInfo, TSMAuthContants.URL_ICCOA2_PROCESS_SE_RESPONSE, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfoLoadAccountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.SeAPDUResponse.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).addAllResponse(list).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("processICCOASeResponse failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("processICCOASeResponse failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public TsmRpcModels.TsmStartActionResponse w(Context context, CardInfo cardInfo, TsmRpcModels.SeOperationType seOperationType, String str) throws a, AuthApiException {
        AccountInfo accountInfo = getAccountInfo(context);
        String cplc = getCplc(cardInfo);
        try {
            return TsmRpcModels.TsmStartActionResponse.parseFrom(Coder.decodeBase64ToByteArray(sendRequest(context, accountInfo, AuthRequest.AuthRequestBuilder.newBuilder(accountInfo, TSMAuthContants.URL_ICCOA2_SE_ACTION, AuthRequest.RespContentType.protobuf).addParams("userId", accountInfo.getUserId()).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.TsmStartActionInfo.newBuilder().setSeInfo(TsmRpcModels.SeInfo.newBuilder().setCplc(ByteString.copyFrom(Coder.hexStringToBytes(cplc))).setDeviceType(ljs.b(cardInfo)).setDeviceId(DeviceUtils.getDeviceId(context, null)).setActionSource(TsmRpcModels.ActionSource.APP_CLIENT).setDeviceInfo(TsmRpcModels.DeviceInfo.newBuilder().setDeviceModel(ljs.b(cardInfo)).setLang(Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry()).setMiuiSystemVersion(ljs.n()).setMiuiRomType(ljs.f(null)).setTsmclientVersionCode(ljs.a(context)).build()).build()).setActionName(seOperationType).setParams(str).build().toByteArray())).create())));
        } catch (InvalidProtocolBufferException e) {
            LogUtils.e("startICCOADigitalKeyAction failed", e);
            throw new a(16);
        } catch (AuthApiException e2) {
            LogUtils.e("startICCOADigitalKeyAction failed, code: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
            throw new a(e2.mErrorCode, e2.mErrorMsg);
        }
    }

    public CommonResponseInfo x(Context context, String str, String str2) {
        int i;
        CommonResponseInfo commonResponseInfo = new CommonResponseInfo();
        try {
            return (CommonResponseInfo) HttpClient.getInstance(context).execute(new z3s(str, str2)).getResult();
        } catch (InternalIOException e) {
            LogUtils.e("reportKeyStatusActivate InternalIOException, ", e);
            i = 14;
            commonResponseInfo.setErrorCode(i);
            return commonResponseInfo;
        } catch (IOException e2) {
            LogUtils.e("reportKeyStatusActivate IOException, ", e2);
            i = 2;
            commonResponseInfo.setErrorCode(i);
            return commonResponseInfo;
        }
    }
}
