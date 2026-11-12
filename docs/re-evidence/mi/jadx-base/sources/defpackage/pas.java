package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.AuthRequest;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.Coder;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class pas extends cfs {
    public TsmRpcModels.TsmAPDUCommand b(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, TsmRpcModels.SeOperationType seOperationType, CardInfo cardInfo, Bundle bundle) throws IOException {
        String str;
        if (tsmSessionInfo == null) {
            str = "failed to start se operation, session info is null";
        } else {
            if (seOperationType != null) {
                TsmRpcModels.SeOperation.Builder type = TsmRpcModels.SeOperation.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).setType(seOperationType);
                if (cardInfo != null && !TextUtils.isEmpty(cardInfo.mAid)) {
                    type.setAid(cardInfo.mAid);
                }
                if (bundle != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt(b4s.EXTRA_NFC_ID, bundle.get(b4s.EXTRA_NFC_ID));
                        LogUtils.v("json: " + jSONObject.toString());
                        type.setExtra(jSONObject.toString());
                    } catch (JSONException e) {
                        LogUtils.e("failed to start se operation", e);
                    }
                }
                String str2 = (String) a(context, AuthRequest.AuthRequestBuilder.newBuilder(null, "api/nl/se/startSeOperation", AuthRequest.RespContentType.protobuf).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(type.build().toByteArray())).create());
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
                return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(str2));
            }
            str = "failed to start se operation, operation type is null";
        }
        LogUtils.w(str);
        return null;
    }

    public TsmRpcModels.TsmAPDUCommand c(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, List<TsmRpcModels.SeAPDUResponseItem> list) throws IOException {
        if (tsmSessionInfo == null) {
            LogUtils.w("failed to process se response, session info is null");
            return null;
        }
        String str = (String) a(context, AuthRequest.AuthRequestBuilder.newBuilder(null, "api/nl/se/processSeResponse", AuthRequest.RespContentType.protobuf).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.SeAPDUResponse.newBuilder().setSessionId(tsmSessionInfo.getSessionId()).addAllResponse(list).build().toByteArray())).create());
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return TsmRpcModels.TsmAPDUCommand.parseFrom(Coder.decodeBase64ToByteArray(str));
    }

    public TsmRpcModels.TsmSessionInfo d(Context context, CardInfo cardInfo) throws IOException {
        String cplc;
        String str;
        String strO = ljs.o(context);
        if (TextUtils.isEmpty(strO)) {
            str = "failed to create session, nfc id is null or empty.";
        } else {
            try {
                cplc = cardInfo.getTerminal().getCPLC();
            } catch (InterruptedException unused) {
                LogUtils.d("createSession is interrupted.");
                cplc = null;
            }
            if (TextUtils.isEmpty(cplc)) {
                str = "failed to create session, cplc is empty.";
            } else {
                String deviceId = DeviceUtils.getDeviceId(context, cardInfo);
                if (!TextUtils.isEmpty(deviceId)) {
                    String str2 = (String) a(context, AuthRequest.AuthRequestBuilder.newBuilder(null, "api/nl/se/createSession", AuthRequest.RespContentType.protobuf).addParams("nfcId", strO).addParams(TSMAuthContants.PARAM_REQ, Coder.encodeBase64Coder(TsmRpcModels.SeInfo.newBuilder().setCplc(ByteString.copyFrom(Coder.hexStringToBytes(cplc))).setDeviceType(ljs.b(cardInfo)).setDeviceId(deviceId).setActionSource(TsmRpcModels.ActionSource.APP_CLIENT).build().toByteArray())).create());
                    if (TextUtils.isEmpty(str2)) {
                        return null;
                    }
                    return TsmRpcModels.TsmSessionInfo.parseFrom(Coder.decodeBase64ToByteArray(str2));
                }
                str = "failed to create session, deviceId is empty.";
            }
        }
        LogUtils.w(str);
        return null;
    }
}
