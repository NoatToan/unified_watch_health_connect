package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.ICCOACarKeyCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.model.mitsm.f;
import com.miui.tsmclient.model.mitsm.h;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.exception.InvalidTLVException;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import com.tsmclient.smartcard.terminal.CommandApdu;
import com.tsmclient.smartcard.terminal.IScTerminal;
import com.tsmclient.smartcard.tlv.TLVBuilder;
import com.tsmclient.smartcard.tlv.TLVParser;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import r.a;

/* JADX INFO: loaded from: classes2.dex */
public class nzs extends f {
    public jxs d = new jxs();

    public BaseResponse a(Context context, ICCOACarKeyCardInfo iCCOACarKeyCardInfo) throws InterruptedException, IOException {
        IScTerminal terminal = new ICCOACarKeyCardInfo().getTerminal();
        try {
            terminal.open();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(TsmRpcModels.TsmCAPDU.newBuilder().setApdu(ByteString.copyFrom(Coder.hexStringToBytes("00A404000EF00000004943434F41444B412021"))).setExpectSwRegex("^(9000)$").build());
            arrayList2.add(TsmRpcModels.TsmCAPDU.newBuilder().setApdu(ByteString.copyFrom(new CommandApdu(128, 128, 1, 0, Coder.hexStringToBytes("890F" + iCCOACarKeyCardInfo.getCardId())).toBytes())).setExpectSwRegex("^(9000)$").build());
            e(context, terminal, arrayList2, arrayList);
            try {
                if (TLVParser.parse(ByteArray.wrap(arrayList.get(1).getResponseData().toByteArray())).getValue().findTLV(ByteArray.wrap((byte) -120)).getValue().toBytes().get(0) != 3) {
                    BaseResponse baseResponse = new BaseResponse(17, new Object[0]);
                    terminal.close();
                    return baseResponse;
                }
                arrayList2.clear();
                arrayList.clear();
                TLVBuilder tLVBuilder = new TLVBuilder();
                tLVBuilder.addBytes(ByteArray.wrap((byte) 94), new byte[]{3}).addBytes(ByteArray.wrap((byte) -119), Coder.hexStringToBytes(iCCOACarKeyCardInfo.getCardId()));
                TLVBuilder tLVBuilder2 = new TLVBuilder();
                tLVBuilder2.addBytes(ByteArray.wrap((byte) 117), tLVBuilder.buildArray()).addBytes(ByteArray.wrap((byte) -99), new byte[16]);
                try {
                    byte[] bArrDigest = MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM).digest(tLVBuilder2.buildArray());
                    TLVBuilder tLVBuilder3 = new TLVBuilder();
                    tLVBuilder3.addBytes(ByteArray.wrap((byte) -119), Coder.hexStringToBytes(iCCOACarKeyCardInfo.getCardId())).addBytes(ByteArray.wrap((byte) 88), bArrDigest);
                    arrayList2.add(TsmRpcModels.TsmCAPDU.newBuilder().setApdu(ByteString.copyFrom(new CommandApdu(128, 135, 0, 0, tLVBuilder3.buildArray()).toBytes())).setExpectSwRegex("^(9000)$").build());
                    e(context, terminal, arrayList2, arrayList);
                    tLVBuilder2.addBytes(ByteArray.wrap((byte) -98), TLVParser.parse(ByteArray.wrap(arrayList.get(0).getResponseData().toByteArray())).getValue().toBytes().toBytes());
                    CommonResponseInfo commonResponseInfoX = this.d.x(context, iCCOACarKeyCardInfo.getCardId(), Coder.bytesToHexString(tLVBuilder2.buildArray()));
                    BaseResponse baseResponse2 = new BaseResponse(commonResponseInfoX.isSuccess() ? 0 : commonResponseInfoX.getErrorCode(), commonResponseInfoX.getErrorDesc(), new Object[0]);
                    terminal.close();
                    return baseResponse2;
                } catch (NoSuchAlgorithmException e) {
                    throw new IOException("message digest error", e);
                }
            } catch (InvalidTLVException | TagNotFoundException e2) {
                LogUtils.e("parse iccoa data signed", e2);
                BaseResponse baseResponse3 = new BaseResponse(1, new Object[0]);
                terminal.close();
                return baseResponse3;
            }
        } catch (Throwable th) {
            terminal.close();
            throw th;
        }
    }

    public final BaseResponse b(Context context, TsmRpcModels.TsmSessionInfo tsmSessionInfo, TsmRpcModels.TsmAPDUCommand tsmAPDUCommand, CardInfo cardInfo) throws a, InterruptedException, IOException {
        IScTerminal terminal = cardInfo.getTerminal();
        try {
            terminal.open();
            return c(context, terminal, tsmSessionInfo, tsmAPDUCommand, cardInfo);
        } finally {
            terminal.close();
        }
    }

    public final BaseResponse c(Context context, IScTerminal iScTerminal, TsmRpcModels.TsmSessionInfo tsmSessionInfo, TsmRpcModels.TsmAPDUCommand tsmAPDUCommand, CardInfo cardInfo) throws a, InterruptedException, IOException {
        List<TsmRpcModels.TsmCAPDU> apdusList = tsmAPDUCommand.getApdusList();
        if (apdusList == null || apdusList.isEmpty()) {
            LogUtils.d("executeCapdu, apduList is empty or null");
            if (h.a(tsmAPDUCommand.getResult()) == 0) {
                return new BaseResponse(0, new Object[0]);
            }
            LogUtils.e("executeCapdu, apduCommand execute errorCode = " + tsmAPDUCommand.getResult());
            throw new a(h.a(tsmAPDUCommand.getResult()), tsmAPDUCommand.getErrorDesc());
        }
        ArrayList arrayList = new ArrayList();
        internalExecuteCapdu(context, iScTerminal, apdusList, arrayList);
        TsmRpcModels.TsmAPDUCommand tsmAPDUCommandV = this.d.v(context, tsmSessionInfo, arrayList);
        if (tsmAPDUCommandV == null) {
            LogUtils.e("ICCOADigitalKeyCardClient", "DigitalKey can not get nextApduCommand, processCCCSeResponse failed");
            return new BaseResponse(16, new Object[0]);
        }
        int iA = h.a(tsmAPDUCommandV.getResult());
        if (iA != 0) {
            LogUtils.e("ICCOADigitalKeyCardClient", "DigitalKey executeCapdu failed");
            throw new a(iA, tsmAPDUCommandV.getErrorDesc());
        }
        if (tsmAPDUCommandV.getApdusList() != null && !tsmAPDUCommandV.getApdusList().isEmpty()) {
            return c(context, iScTerminal, tsmSessionInfo, tsmAPDUCommandV, cardInfo);
        }
        LogUtils.e("ICCOADigitalKeyCardClient", "DigitalKey no more apdu, execute finished");
        return tsmAPDUCommandV.hasRespValue() ? new BaseResponse(0, "", tsmAPDUCommandV.getRespValue()) : new BaseResponse(0, new Object[0]);
    }

    public BaseResponse d(Context context, String str, String str2) throws a, AuthApiException {
        int i;
        String strFindText;
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        TsmRpcModels.TsmStartActionResponse tsmStartActionResponseW = this.d.w(context, cardInfo, TsmRpcModels.SeOperationType.valueOf(str), str2);
        if (tsmStartActionResponseW == null) {
            LogUtils.e("ICCOADigitalKeyCardClient", "iccoa digital key action returns null");
            return new BaseResponse(1, new Object[0]);
        }
        int iA = h.a(tsmStartActionResponseW.getResult());
        if (iA != 0) {
            return new BaseResponse(iA, tsmStartActionResponseW.getErrorDesc(), new Object[0]);
        }
        try {
            BaseResponse baseResponseB = b(context, TsmRpcModels.TsmSessionInfo.newBuilder().setResult(tsmStartActionResponseW.getResult()).setSessionId(tsmStartActionResponseW.getSessionId()).setErrorDesc(tsmStartActionResponseW.getErrorDesc()).build(), tsmStartActionResponseW.getApduCommand(), cardInfo);
            LogUtils.d("ICCOADigitalKeyCardClient", "invoke finished, result: " + baseResponseB.mResultCode + ", aid = " + tsmStartActionResponseW.getApduCommand().getAid());
            return baseResponseB;
        } catch (IOException e) {
            strFindText = e.getMessage();
            LogUtils.e("ICCOADigitalKeyCardClient", "io exception occurs when processing apdu commands");
            i = 8;
            return new BaseResponse(i, strFindText, new Object[0]);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            i = 11;
            strFindText = ErrorCode.findText(context, 11);
            return new BaseResponse(i, strFindText, new Object[0]);
        }
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse delete(Context context, CardInfo cardInfo, Bundle bundle) {
        String str;
        String string;
        try {
            JSONObject jSONObjectPut = new JSONObject().put("keyId", cardInfo.getCardId());
            String str2 = "terminationType";
            if (!TextUtils.equals("REMOTE_SHARE", bundle != null ? bundle.getString("terminationType") : "")) {
                str = "ICCOA_V2_TERMINATE_KEY";
                if (bundle != null) {
                    string = bundle.getString("terminationType");
                }
                return d(context, str, jSONObjectPut.toString());
            }
            str = "ICCOA_V2_TERMINATE_SHARE_KEY";
            str2 = TSMAuthContants.PARAM_SHARED_ID;
            string = bundle.getString(Constants.EXTRA_CAR_KEY_ID);
            jSONObjectPut.put(str2, string);
            return d(context, str, jSONObjectPut.toString());
        } catch (AuthApiException e) {
            return new BaseResponse(e.mErrorCode, e.getMessage(), new Object[0]);
        } catch (JSONException unused) {
            return new BaseResponse(ErrorCode.ERROR_CODE_INVALID_PARAM, new Object[0]);
        } catch (a e2) {
            return new BaseResponse(e2.a(), e2.getMessage(), new Object[0]);
        }
    }

    public final void e(Context context, IScTerminal iScTerminal, List<TsmRpcModels.TsmCAPDU> list, List<TsmRpcModels.SeAPDUResponseItem> list2) throws InterruptedException, IOException {
        if (!internalExecuteCapdu(context, iScTerminal, list, list2).isSuccess()) {
            throw new IOException("se response error");
        }
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse issue(Context context, CardInfo cardInfo, Bundle bundle) {
        int iA;
        String strFindText;
        Throwable th;
        try {
            BaseResponse baseResponseSyncEse = f.sNeedSync.get() ? syncEse(context, cardInfo, getSession(context, cardInfo, null), bundle) : null;
            if (baseResponseSyncEse != null && !baseResponseSyncEse.isSuccess()) {
                iA = baseResponseSyncEse.mResultCode;
                strFindText = baseResponseSyncEse.mMsg;
                return new BaseResponse(iA, strFindText, new Object[0]);
            }
            return d(context, "ICCOA_V2_CREATE_KEY", bundle.getString("extra_data"));
        } catch (AuthApiException e) {
            iA = e.mErrorCode;
            th = e;
            strFindText = th.getMessage();
        } catch (IOException unused) {
            strFindText = "";
            iA = 8;
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
            iA = 11;
            strFindText = ErrorCode.findText(context, 11);
        } catch (a e2) {
            iA = e2.a();
            th = e2;
            strFindText = th.getMessage();
        }
    }
}
