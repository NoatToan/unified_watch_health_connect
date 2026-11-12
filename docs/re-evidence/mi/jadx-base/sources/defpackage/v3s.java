package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.EidCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.mitsm.f;
import com.miui.tsmclient.model.mitsm.h;
import com.miui.tsmclient.model.mitsm.k;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.exception.NfcEeIOException;
import com.tsmclient.smartcard.terminal.IScTerminal;
import java.io.IOException;
import java.util.ArrayList;
import r.a;

/* JADX INFO: loaded from: classes2.dex */
public class v3s extends f {
    public BaseResponse a(Context context, EidCardInfo eidCardInfo) {
        int iA;
        String message;
        ArrayList arrayList = new ArrayList();
        try {
            TsmRpcModels.EidInfoResponse eidInfoResponseQueryEidCard = this.mSeiTsmAuthManager.queryEidCard(context);
            if (eidInfoResponseQueryEidCard != null) {
                iA = h.a(eidInfoResponseQueryEidCard.getResult());
                message = eidInfoResponseQueryEidCard.getErrorDesc();
                LogUtils.d("EidCardClient updateCardInfo result: " + iA + ", msg: " + message);
                TsmRpcModels.EidInfo eidInfo = eidInfoResponseQueryEidCard.getEidInfo();
                if (iA == 0 && eidInfo != null && !TextUtils.isEmpty(eidInfo.getAid())) {
                    eidCardInfo.mAid = eidInfo.getAid();
                    eidCardInfo.mCardName = eidInfo.getName();
                    eidCardInfo.setCardArt(eidInfo.getCardArt());
                    eidCardInfo.setVCStatus(eidInfo.getVcStatus());
                    arrayList.add(eidCardInfo);
                    LogUtils.t("EidCardClient updateCardInfo eidCardInfo: " + eidCardInfo.serialize());
                }
            } else {
                iA = -1;
                message = "";
            }
        } catch (a e) {
            LogUtils.e("EidCardClient updateCardInfo error occurred", e);
            iA = e.a();
            message = e.getMessage();
        }
        return new BaseResponse(iA, message, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0144 A[PHI: r3 r11
      0x0144: PHI (r3v2 java.lang.String) = 
      (r3v0 java.lang.String)
      (r3v0 java.lang.String)
      (r3v0 java.lang.String)
      (r3v0 java.lang.String)
      (r3v1 java.lang.String)
      (r3v0 java.lang.String)
      (r3v0 java.lang.String)
     binds: [B:62:0x00f0, B:64:0x00f6, B:75:0x0119, B:77:0x011f, B:72:0x0111, B:81:0x013c, B:83:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r11v10 int) = (r11v3 int), (r11v3 int), (r11v5 int), (r11v5 int), (r11v7 int), (r11v13 int), (r11v13 int) binds: [B:62:0x00f0, B:64:0x00f6, B:75:0x0119, B:77:0x011f, B:72:0x0111, B:81:0x013c, B:83:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse issue(Context context, CardInfo cardInfo, Bundle bundle) {
        int i;
        EidCardInfo eidCardInfo = (EidCardInfo) cardInfo;
        k.a aVar = k.a.INSTALL;
        String message = "";
        String string = bundle != null ? bundle.getString(Constants.EXTRA_SP_TOKEN) : "";
        try {
            try {
                try {
                    try {
                        try {
                            TsmRpcModels.TsmSessionInfo session = getSession(context, cardInfo, aVar);
                            if (f.sNeedSync.get()) {
                                BaseResponse baseResponseSyncEse = syncEse(context, cardInfo, session, bundle);
                                LogUtils.d("EidCardClient syncEse response:" + baseResponseSyncEse.mResultCode + " msg:" + baseResponseSyncEse.mMsg);
                            }
                            TsmRpcModels.TsmAPDUCommand tsmAPDUCommandInstallEidCard = this.mSeiTsmAuthManager.installEidCard(context, session, string);
                            if (tsmAPDUCommandInstallEidCard == null) {
                                BaseResponse baseResponse = new BaseResponse(16, new Object[0]);
                                if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                                    k.a().b(cardInfo, aVar);
                                }
                                return baseResponse;
                            }
                            int iA = h.a(tsmAPDUCommandInstallEidCard.getResult());
                            if (iA != 0) {
                                throw new a(iA, tsmAPDUCommandInstallEidCard.getErrorDesc());
                            }
                            if (tsmAPDUCommandInstallEidCard.getApdusList() != null && !tsmAPDUCommandInstallEidCard.getApdusList().isEmpty()) {
                                IScTerminal terminal = cardInfo.getTerminal();
                                try {
                                    terminal.open();
                                    BaseResponse baseResponseExecuteCapdu = executeCapdu(context, terminal, session, tsmAPDUCommandInstallEidCard);
                                    if (baseResponseExecuteCapdu != null && baseResponseExecuteCapdu.mResultCode == 0) {
                                        a(context, eidCardInfo);
                                    }
                                    terminal.close();
                                    if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                                        k.a().b(cardInfo, aVar);
                                    }
                                    return baseResponseExecuteCapdu;
                                } catch (Throwable th) {
                                    terminal.close();
                                    throw th;
                                }
                            }
                            a(context, eidCardInfo);
                            BaseResponse baseResponse2 = new BaseResponse(0, new Object[0]);
                            if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                                k.a().b(cardInfo, aVar);
                            }
                            return baseResponse2;
                        } catch (NfcEeIOException e) {
                            LogUtils.e("issue failed with an nfc exception. errorCode:" + e.getErrorCode(), e);
                            i = 10;
                            if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                                k.a().b(cardInfo, aVar);
                            }
                            return new BaseResponse(i, message, new Object[0]);
                        }
                    } catch (a e2) {
                        int iA2 = e2.a();
                        message = e2.getMessage();
                        LogUtils.e("issue failed with an tsm api exception.", e2);
                        if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                            i = iA2;
                            k.a().b(cardInfo, aVar);
                        } else {
                            i = iA2;
                        }
                        return new BaseResponse(i, message, new Object[0]);
                    }
                } catch (IOException e3) {
                    LogUtils.e("issue failed with an io exception.", e3);
                    i = 2;
                    if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                        k.a().b(cardInfo, aVar);
                    }
                    return new BaseResponse(i, message, new Object[0]);
                }
            } catch (InterruptedException e4) {
                LogUtils.e("issue is interrupted.", e4);
                Thread.currentThread().interrupt();
                i = 11;
                if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                    k.a().b(cardInfo, aVar);
                }
                return new BaseResponse(i, message, new Object[0]);
            }
        } catch (Throwable th2) {
            if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                k.a().b(cardInfo, aVar);
            }
            throw th2;
        }
    }
}
