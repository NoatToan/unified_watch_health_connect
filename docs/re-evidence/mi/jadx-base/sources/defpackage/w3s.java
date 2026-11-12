package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.common.net.ErrorInfo;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.KeyItem;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.model.mitsm.f;
import com.miui.tsmclient.model.mitsm.h;
import com.miui.tsmclient.model.mitsm.k;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ResUtils;
import com.tsmclient.smartcard.exception.NfcEeIOException;
import com.tsmclient.smartcard.terminal.IScTerminal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import r.a;

/* JADX INFO: loaded from: classes2.dex */
public class w3s extends f {
    public static List<MifareCardInfo> e(Context context, List<TsmRpcModels.DoorCardInfo> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (TsmRpcModels.DoorCardInfo doorCardInfo : list) {
            MifareCardInfo mifareCardInfo = new MifareCardInfo();
            mifareCardInfo.mAid = doorCardInfo.getAid();
            mifareCardInfo.mMifareCardType = doorCardInfo.getCardType().getNumber();
            mifareCardInfo.mVCStatus = doorCardInfo.getVcStatus();
            mifareCardInfo.mCardName = TextUtils.isEmpty(doorCardInfo.getName()) ? ResUtils.getString(context, "entrance_card_name_home") : doorCardInfo.getName();
            mifareCardInfo.mCardArt = doorCardInfo.getCardArt();
            mifareCardInfo.mCardFace = i % 2 == 0 ? 1 : 2;
            mifareCardInfo.mFingerAuthFlag = doorCardInfo.getFingerFlag();
            mifareCardInfo.mProductName = doorCardInfo.getProductName();
            mifareCardInfo.setTechType(doorCardInfo.getTechType());
            mifareCardInfo.setProductId(doorCardInfo.getProductId());
            mifareCardInfo.setBusinessId(doorCardInfo.getBusinessId());
            mifareCardInfo.setCommunityCode(doorCardInfo.getCommunityCode());
            mifareCardInfo.setApplyStatus(doorCardInfo.getStatus());
            mifareCardInfo.setSupportChildKey(doorCardInfo.getSupportKey());
            mifareCardInfo.setSectorOverwritten(doorCardInfo.getSectorOverwritten());
            List<TsmRpcModels.POJODoorCardKeysItem> keyItemsList = doorCardInfo.getKeyItemsList();
            if (keyItemsList != null && keyItemsList.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (TsmRpcModels.POJODoorCardKeysItem pOJODoorCardKeysItem : keyItemsList) {
                    KeyItem keyItem = new KeyItem();
                    keyItem.setKeyNo(pOJODoorCardKeysItem.getKeyNo());
                    keyItem.setKeyTitle(pOJODoorCardKeysItem.getKeyTitle());
                    keyItem.setKeyDesc(pOJODoorCardKeysItem.getKeyDesc());
                    keyItem.setCreateTime(pOJODoorCardKeysItem.getCreateTime());
                    keyItem.setKeyIconUrl(pOJODoorCardKeysItem.getKeyIconUrl());
                    arrayList2.add(keyItem);
                }
                mifareCardInfo.setKeyItems(arrayList2);
            }
            mifareCardInfo.setProductName(doorCardInfo.getProductName());
            mifareCardInfo.setIssuerId(doorCardInfo.getIssuerId());
            mifareCardInfo.setSupportPersonalArt(doorCardInfo.getSupportPersonalArt());
            mifareCardInfo.setVcUid(doorCardInfo.getVcUid());
            mifareCardInfo.setCid(doorCardInfo.getCid());
            mifareCardInfo.setCustomizable(doorCardInfo.getCustomizable());
            mifareCardInfo.setSupportBackup(doorCardInfo.getBackupable());
            mifareCardInfo.setBackedUp(doorCardInfo.getBackedUp());
            mifareCardInfo.setCloudCid(doorCardInfo.getCloudCid());
            mifareCardInfo.setSupportQueryTransRecord(doorCardInfo.getSupportQueryTransRecord());
            mifareCardInfo.setSupportRecharge(doorCardInfo.getSupportRecharge());
            LogUtils.t("cardInfo.mVCStatus: " + mifareCardInfo.mVCStatus + " getVcId: " + doorCardInfo.getVcUid() + " cardInfo.getCid: " + doorCardInfo.getCid());
            arrayList.add(mifareCardInfo);
            i++;
        }
        return arrayList;
    }

    public static void g(Context context, MifareCardInfo mifareCardInfo, TsmRpcModels.DoorCardInfo doorCardInfo) {
        if (doorCardInfo != null) {
            mifareCardInfo.mAid = doorCardInfo.getAid();
            String cardArt = doorCardInfo.getCardArt();
            if (!TextUtils.isEmpty(cardArt)) {
                mifareCardInfo.mCardArt = cardArt;
            }
            mifareCardInfo.mVCStatus = doorCardInfo.getVcStatus();
            mifareCardInfo.setVcUid(doorCardInfo.getVcUid());
            mifareCardInfo.setCid(doorCardInfo.getCid());
            LogUtils.t("cardInfo.mVCStatus: " + mifareCardInfo.mVCStatus + " getVcId: " + mifareCardInfo.getVcUid() + " cardInfo.getCid: " + mifareCardInfo.getCid());
            mifareCardInfo.mCardName = doorCardInfo.getName();
            mifareCardInfo.mFingerAuthFlag = doorCardInfo.getFingerFlag();
            mifareCardInfo.setProductId(doorCardInfo.getProductId());
            mifareCardInfo.setSupportPersonalArt(doorCardInfo.getSupportPersonalArt());
            mifareCardInfo.setCustomizable(doorCardInfo.getCustomizable());
            mifareCardInfo.setSupportRecharge(doorCardInfo.getSupportRecharge());
            mifareCardInfo.setSupportQueryTransRecord(doorCardInfo.getSupportQueryTransRecord());
            mifareCardInfo.setCloudCid(doorCardInfo.getCloudCid());
            mifareCardInfo.setProductName(doorCardInfo.getProductName());
            mifareCardInfo.setBackedUp(doorCardInfo.getBackedUp());
            mifareCardInfo.setSupportBackup(doorCardInfo.getBackupable());
        }
    }

    public BaseResponse a(Context context) {
        int iA;
        String message;
        try {
            TsmRpcModels.QueryDoorCardInfoResponse queryDoorCardInfoResponseQueryMifareCardList = this.mSeiTsmAuthManager.queryMifareCardList(context);
            if (queryDoorCardInfoResponseQueryMifareCardList == null) {
                message = "";
                iA = -1;
            } else {
                iA = h.a(queryDoorCardInfoResponseQueryMifareCardList.getResult());
                String errorDesc = queryDoorCardInfoResponseQueryMifareCardList.getErrorDesc();
                LogUtils.d("queryMifareCardInfo result: " + iA);
                if (iA == 0) {
                    return new BaseResponse(0, queryDoorCardInfoResponseQueryMifareCardList);
                }
                message = errorDesc;
            }
        } catch (a e) {
            LogUtils.e("failed to query mifare card info", e);
            iA = e.a();
            message = e.getMessage();
        }
        return new BaseResponse(iA, message, new Object[0]);
    }

    public BaseResponse b(Context context, MifareCardInfo mifareCardInfo) {
        try {
            this.mTSMAuthManager.updateCommunityCardFlowStatus(context, mifareCardInfo);
            return new BaseResponse(0, new Object[0]);
        } catch (AuthApiException e) {
            LogUtils.d("updateCommunityCardFlowStatus failed " + e);
            return new BaseResponse(e.mErrorCode, e.mErrorMsg, new Object[0]);
        }
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse backup(Context context, CardInfo cardInfo) {
        int iA;
        String strFindText;
        String str;
        int i;
        d3t d3tVar;
        if (cardInfo == null) {
            cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        }
        CardInfo cardInfo2 = cardInfo;
        IScTerminal terminal = cardInfo2.getTerminal();
        MifareCardInfo mifareCardInfo = null;
        try {
            try {
                try {
                    TsmRpcModels.TsmSessionInfo session = getSession(context, cardInfo2, null);
                    if (cardInfo2 instanceof MifareCardInfo) {
                        mifareCardInfo = (MifareCardInfo) cardInfo2;
                        d3tVar = new d3t(session.getSessionId(), mifareCardInfo.getCid(), cardInfo2.mAid);
                    } else {
                        d3tVar = new d3t(session.getSessionId());
                    }
                    d3t.b bVar = (d3t.b) HttpClient.getInstance(context).execute(d3tVar).getResult();
                    if (!d3tVar.isSuccess()) {
                        ErrorInfo errorInfo = d3tVar.getResponse().getErrorInfo();
                        i = errorInfo.mErrorCode;
                        strFindText = errorInfo.mErrorDesc;
                        terminal.close();
                        return new BaseResponse(i, strFindText, new Object[0]);
                    }
                    terminal.open();
                    BaseResponse baseResponseExecuteCapdu = executeCapdu(context, terminal, session, bVar.a());
                    if (baseResponseExecuteCapdu != null && baseResponseExecuteCapdu.isSuccess() && (cardInfo2 instanceof MifareCardInfo)) {
                        f(context, cardInfo2, mifareCardInfo.mAid, mifareCardInfo.getMifareCardType(), mifareCardInfo.getProductId(), true);
                    }
                    terminal.close();
                    return baseResponseExecuteCapdu;
                } catch (a e) {
                    iA = e.a();
                    strFindText = e.getMessage();
                    str = "backup failed with an tsmapi exception.";
                    LogUtils.t(str);
                    i = iA;
                }
            } catch (IOException unused) {
                iA = 2;
                strFindText = ErrorCode.findText(context, 2);
                str = "backup failed with an io exception.";
                LogUtils.t(str);
                i = iA;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                iA = 11;
                strFindText = ErrorCode.findText(context, 11);
                str = "backup is interrupted.";
                LogUtils.t(str);
                i = iA;
            }
        } catch (Throwable th) {
            terminal.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x011b A[PHI: r2 r13
      0x011b: PHI (r2v2 int) = (r2v0 int), (r2v0 int), (r2v1 int), (r2v1 int), (r2v4 int), (r2v4 int) binds: [B:69:0x0113, B:71:0x0119, B:64:0x00fd, B:66:0x0103, B:58:0x00e9, B:60:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r13v4 java.lang.String) = 
      (r13v2 java.lang.String)
      (r13v2 java.lang.String)
      (r13v3 java.lang.String)
      (r13v3 java.lang.String)
      (r13v6 java.lang.String)
      (r13v6 java.lang.String)
     binds: [B:69:0x0113, B:71:0x0119, B:64:0x00fd, B:66:0x0103, B:58:0x00e9, B:60:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    public BaseResponse c(Context context, MifareCardInfo mifareCardInfo, Bundle bundle) {
        int iA;
        String message;
        k.a aVar = k.a.UPDATE;
        String str = mifareCardInfo.mProductId;
        try {
            try {
                try {
                    TsmRpcModels.TsmSessionInfo session = getSession(context, mifareCardInfo, aVar);
                    TsmRpcModels.TsmAPDUCommand tsmAPDUCommandUpdateSectorData = this.mSeiTsmAuthManager.updateSectorData(context, session, mifareCardInfo, bundle != null ? (MifareTag) bundle.getParcelable(Constants.EXTRA_MIFARE_TAG) : null);
                    if (tsmAPDUCommandUpdateSectorData == null) {
                        BaseResponse baseResponse = new BaseResponse(16, ErrorCode.findText(context, 16), new Object[0]);
                        if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                            k.a().b(mifareCardInfo, aVar);
                        }
                        return baseResponse;
                    }
                    int iA2 = h.a(tsmAPDUCommandUpdateSectorData.getResult());
                    if (iA2 != 0) {
                        throw new a(iA2, tsmAPDUCommandUpdateSectorData.getErrorDesc());
                    }
                    if (tsmAPDUCommandUpdateSectorData.getApdusList() == null) {
                        BaseResponse baseResponse2 = new BaseResponse(16, ErrorCode.findText(context, 16), new Object[0]);
                        if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                            k.a().b(mifareCardInfo, aVar);
                        }
                        return baseResponse2;
                    }
                    if (tsmAPDUCommandUpdateSectorData.getApdusList().isEmpty()) {
                        f(context, mifareCardInfo, mifareCardInfo.mAid, mifareCardInfo.getMifareCardType(), str, true);
                        BaseResponse baseResponse3 = new BaseResponse(0, new Object[0]);
                        if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                            k.a().b(mifareCardInfo, aVar);
                        }
                        return baseResponse3;
                    }
                    IScTerminal terminal = mifareCardInfo.getTerminal();
                    try {
                        terminal.open();
                        BaseResponse baseResponseExecuteCapdu = executeCapdu(context, terminal, session, tsmAPDUCommandUpdateSectorData);
                        if (baseResponseExecuteCapdu != null && baseResponseExecuteCapdu.mResultCode == 0) {
                            f(context, mifareCardInfo, tsmAPDUCommandUpdateSectorData.getAid(), mifareCardInfo.getMifareCardType(), str, true);
                        }
                        terminal.close();
                        if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                            k.a().b(mifareCardInfo, aVar);
                        }
                        return baseResponseExecuteCapdu;
                    } catch (Throwable th) {
                        terminal.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    iA = 2;
                    message = ErrorCode.findText(context, 2);
                    LogUtils.t("update failed with an io exception.");
                    if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                        k.a().b(mifareCardInfo, aVar);
                    }
                    return new BaseResponse(iA, message, new Object[0]);
                }
            } catch (InterruptedException unused2) {
                iA = 11;
                message = ErrorCode.findText(context, 11);
                LogUtils.t("update is interrupted.");
                if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                    k.a().b(mifareCardInfo, aVar);
                }
                return new BaseResponse(iA, message, new Object[0]);
            } catch (a e) {
                iA = e.a();
                message = e.getMessage();
                LogUtils.t("update failed with an tsmapi exception.");
                if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                    k.a().b(mifareCardInfo, aVar);
                }
                return new BaseResponse(iA, message, new Object[0]);
            }
        } catch (Throwable th2) {
            if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                k.a().b(mifareCardInfo, aVar);
            }
            throw th2;
        }
    }

    public BaseResponse d(Context context, MifareCardInfo... mifareCardInfoArr) {
        int iA;
        String message = "";
        try {
            TsmRpcModels.CommonResponse commonResponseUpdateMifareCard = this.mSeiTsmAuthManager.updateMifareCard(context, mifareCardInfoArr);
            if (commonResponseUpdateMifareCard == null) {
                iA = -1;
            } else {
                int iA2 = h.a(commonResponseUpdateMifareCard.getResult());
                message = commonResponseUpdateMifareCard.getErrorDesc();
                LogUtils.d("updateMifareCardInfo result: " + iA2);
                iA = iA2;
            }
            if (mifareCardInfoArr != null && mifareCardInfoArr.length == 1) {
                MifareCardInfo mifareCardInfo = mifareCardInfoArr[0];
                f(context, mifareCardInfo, mifareCardInfo.mAid, mifareCardInfo.getMifareCardType(), mifareCardInfoArr[0].getProductId(), false);
            }
        } catch (IOException e) {
            LogUtils.e("update failed with an io exception.", e);
            iA = 2;
        } catch (a e2) {
            LogUtils.e("failed to update mifare card info", e2);
            iA = e2.a();
            message = e2.getMessage();
        }
        return new BaseResponse(iA, message, new Object[0]);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse delete(Context context, CardInfo cardInfo, Bundle bundle) {
        MifareCardInfo mifareCardInfo = (MifareCardInfo) cardInfo;
        return mifareCardInfo.isDeletable() ? super.delete(context, cardInfo, bundle) : this.mTSMAuthManager.communityDummyCardCancel(context, mifareCardInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse executeCommands(Context context, CardInfo cardInfo, Bundle bundle) {
        int i;
        int i2;
        w3s w3sVar = this;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String message = "";
        k.a aVar = (k.a) (bundle == null ? new Bundle() : bundle).getSerializable(f.EXTRAS_KEY_BUSINESS_TYPE);
        if (aVar == null) {
            aVar = k.a.OUT_EXECUTE;
        }
        k.a aVar2 = aVar;
        try {
            try {
                TsmRpcModels.TsmSessionInfo session = w3sVar.getSession(context, cardInfo, aVar2, true);
                TsmRpcModels.TsmAPDUCommand tsmAPDUCommandExecuteCommand = w3sVar.mSeiTsmAuthManager.executeCommand(context, cardInfo, session, bundle, new ArrayList());
                if (tsmAPDUCommandExecuteCommand == null) {
                    BaseResponse baseResponse = new BaseResponse(16, ErrorCode.findText(context, 16), new Object[0]);
                    k.a().b(cardInfo, aVar2);
                    LogUtils.d("******* executeCommands time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " *******");
                    return baseResponse;
                }
                try {
                    IScTerminal terminal = cardInfo.getTerminal();
                    try {
                        terminal.open();
                        try {
                            BaseResponse baseResponseA = a(context, cardInfo, terminal, session, bundle, tsmAPDUCommandExecuteCommand);
                            terminal.close();
                            k.a().b(cardInfo, aVar2);
                            LogUtils.d("******* executeCommands time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " *******");
                            return baseResponseA;
                        } catch (Throwable th) {
                            th = th;
                            terminal.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e) {
                    e = e;
                    LogUtils.e("executeCommands failed with an io exception.", e);
                    k.a().b(cardInfo, aVar2);
                    LogUtils.d("******* executeCommands time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " *******");
                    i = 2;
                    i2 = w3sVar;
                    return new BaseResponse(i, message, new Object[i2]);
                } catch (InterruptedException e2) {
                    e = e2;
                    LogUtils.e("executeCommands is interrupted.", e);
                    Thread.currentThread().interrupt();
                    k.a().b(cardInfo, aVar2);
                    LogUtils.d("******* executeCommands time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " *******");
                    i = 11;
                    i2 = w3sVar;
                    return new BaseResponse(i, message, new Object[i2]);
                } catch (a e3) {
                    e = e3;
                    int iA = e.a();
                    message = e.getMessage();
                    LogUtils.e("executeCommands failed with an tsmapi exception.", e);
                    k.a().b(cardInfo, aVar2);
                    LogUtils.d("******* executeCommands time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " *******");
                    i = iA;
                    i2 = w3sVar;
                    return new BaseResponse(i, message, new Object[i2]);
                }
            } catch (Throwable th3) {
                k.a().b(cardInfo, aVar2);
                LogUtils.d("******* executeCommands time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " *******");
                throw th3;
            }
        } catch (IOException e4) {
            e = e4;
            w3sVar = null;
        } catch (InterruptedException e5) {
            e = e5;
            w3sVar = null;
        } catch (a e6) {
            e = e6;
            w3sVar = null;
        }
    }

    public final void f(Context context, CardInfo cardInfo, String str, int i, String str2, boolean z) throws a, IOException {
        TsmRpcModels.DoorCardInfo doorCardInfoQueryDoorCardInfoByAid = this.mSeiTsmAuthManager.queryDoorCardInfoByAid(context, str, i, str2);
        if (CardInfo.CARD_TYPE_MIFARE.equals(cardInfo.mCardType)) {
            g(context, (MifareCardInfo) cardInfo, doorCardInfoQueryDoorCardInfoByAid);
            if (z) {
                notifyCardInfoChanged(context, cardInfo);
            }
        }
    }

    public BaseResponse h(Context context, MifareCardInfo mifareCardInfo) {
        return this.mTSMAuthManager.updateCalcTimeWait(context, mifareCardInfo);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse isServiceAvailable(Context context, CardInfo cardInfo, Bundle bundle) {
        String errorDesc;
        int iA = -1;
        if (!(cardInfo instanceof MifareCardInfo)) {
            return new BaseResponse(-1, new Object[0]);
        }
        MifareCardInfo mifareCardInfo = (MifareCardInfo) cardInfo;
        try {
            TsmRpcModels.CommonResponse commonResponseIsServiceAvailable = this.mSeiTsmAuthManager.isServiceAvailable(context, TsmRpcModels.ServiceType.valueOf(mifareCardInfo.getServiceType()), mifareCardInfo.getProductId());
            if (commonResponseIsServiceAvailable != null) {
                iA = commonResponseIsServiceAvailable.getResult();
                errorDesc = commonResponseIsServiceAvailable.getErrorDesc();
            } else {
                errorDesc = "";
            }
        } catch (a e) {
            iA = e.a();
            String message = e.getMessage();
            LogUtils.e("failed to check service availability", e);
            errorDesc = message;
        }
        LogUtils.d("isServiceAvailable result: " + iA + ", msg:" + errorDesc);
        return new BaseResponse(iA, errorDesc, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0208 A[PHI: r0 r13 r14 r19
      0x0208: PHI (r0v16 int) = (r0v9 int), (r0v13 int), (r0v13 int), (r0v15 int), (r0v15 int), (r0v19 int), (r0v19 int) binds: [B:102:0x01d5, B:91:0x01b1, B:93:0x01b7, B:105:0x01dd, B:107:0x01e3, B:111:0x0200, B:113:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r13v11 ??) = (r13v21 ??), (r13v22 ??), (r13v23 ??), (r13v24 ??), (r13v25 ??), (r13v26 ??), (r13v27 ??) binds: [B:102:0x01d5, B:91:0x01b1, B:93:0x01b7, B:105:0x01dd, B:107:0x01e3, B:111:0x0200, B:113:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r14v9 ??) = (r14v13 ??), (r14v14 ??), (r14v15 ??), (r14v16 ??), (r14v17 ??), (r14v18 ??), (r14v19 ??) binds: [B:102:0x01d5, B:91:0x01b1, B:93:0x01b7, B:105:0x01dd, B:107:0x01e3, B:111:0x0200, B:113:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r19v2 java.lang.String) = 
      (r19v1 java.lang.String)
      (r19v0 java.lang.String)
      (r19v0 java.lang.String)
      (r19v0 java.lang.String)
      (r19v0 java.lang.String)
      (r19v0 java.lang.String)
      (r19v0 java.lang.String)
     binds: [B:102:0x01d5, B:91:0x01b1, B:93:0x01b7, B:105:0x01dd, B:107:0x01e3, B:111:0x0200, B:113:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x0221  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.miui.tsmclient.seitsm.TsmRpcModels$TsmSessionInfo] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.miui.tsmclient.entity.MifareTag] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [com.miui.tsmclient.entity.CardInfo] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.miui.tsmclient.entity.CardInfo] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12, types: [int] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [com.miui.tsmclient.model.mitsm.k$a] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v10, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r15v11, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r15v8, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r15v9, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.miui.tsmclient.model.mitsm.k] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.miui.tsmclient.model.mitsm.k] */
    /* JADX WARN: Type inference failed for: r9v8, types: [b4s] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse issue(Context context, CardInfo cardInfo, Bundle bundle) {
        ?? r13;
        String string;
        String str;
        ?? r15;
        String string2;
        ?? r14;
        ?? r11;
        int i;
        ?? r16;
        ?? r17;
        k.a aVar = k.a.INSTALL;
        MifareCardInfo mifareCardInfo = (MifareCardInfo) cardInfo;
        int mifareCardType = mifareCardInfo.getMifareCardType();
        String message = "";
        if (bundle != null) {
            MifareTag mifareTag = (MifareTag) bundle.getParcelable(Constants.EXTRA_MIFARE_TAG);
            string = bundle.getString(Constants.EXTRA_DOOR_CARD_PRODUCT_ID);
            String string3 = bundle.getString(Constants.EXTRA_MIFARE_DOOR_CARD_ISSUER_TOKEN);
            string2 = bundle.getString(Constants.EXTRA_MIFARE_CPU_CARD_APPLY_CHANNEL);
            r13 = mifareTag;
            r15 = string3;
            str = string2;
        } else {
            r13 = 0;
            string = "";
            String str2 = string;
            str = str2;
            r15 = str2;
        }
        String productId = TextUtils.isEmpty(string) ? mifareCardInfo.getProductId() : string;
        try {
            try {
                TsmRpcModels.TsmSessionInfo session = getSession(context, cardInfo, aVar);
                BaseResponse baseResponseSyncEse = f.sNeedSync.get() ? syncEse(context, cardInfo, session, bundle) : null;
                if (baseResponseSyncEse != null && !baseResponseSyncEse.isSuccess()) {
                    if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                        k.a().b(cardInfo, aVar);
                    }
                    return baseResponseSyncEse;
                }
                MifareCardInfo mifareCardInfo2 = (MifareCardInfo) cardInfo;
                String communityCode = mifareCardInfo2.getCommunityCode();
                String businessId = mifareCardInfo2.getBusinessId();
                String ticket = mifareCardInfo2.getTicket();
                boolean zIsOverWrite = mifareCardInfo2.isOverWrite();
                Bundle bundle2 = new Bundle(bundle);
                bundle2.putString(TSMAuthContants.PARAM_COMMUNITY_CODE, communityCode);
                bundle2.putString("businessId", businessId);
                bundle2.putString("ticket", ticket);
                bundle2.putBoolean(TSMAuthContants.PARAM_OVER_WRITE, zIsOverWrite);
                r11 = session;
                r14 = mifareCardType;
                TsmRpcModels.TsmAPDUCommand tsmAPDUCommandInstallDoorCard = this.mSeiTsmAuthManager.installDoorCard(context, r11, productId, r13, r14, r15, str, bundle2);
                if (tsmAPDUCommandInstallDoorCard == null) {
                    f.sNeedSync.set(true);
                    BaseResponse baseResponse = new BaseResponse(16, new Object[0]);
                    if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                        k.a().b(cardInfo, aVar);
                    }
                    return baseResponse;
                }
                int iA = h.a(tsmAPDUCommandInstallDoorCard.getResult());
                try {
                    if (iA != 0) {
                        throw new a(iA, tsmAPDUCommandInstallDoorCard.getErrorDesc());
                    }
                    if (tsmAPDUCommandInstallDoorCard.getApdusList() == null || tsmAPDUCommandInstallDoorCard.getApdusList().isEmpty()) {
                        f(context, cardInfo, tsmAPDUCommandInstallDoorCard.getAid(), mifareCardType, productId, true);
                        BaseResponse baseResponse2 = new BaseResponse(0, new Object[0]);
                        if (bundle == null || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                            k.a().b(cardInfo, aVar);
                        }
                        return baseResponse2;
                    }
                    IScTerminal terminal = cardInfo.getTerminal();
                    try {
                        terminal.open();
                        BaseResponse baseResponseExecuteCapdu = executeCapdu(context, terminal, session, tsmAPDUCommandInstallDoorCard);
                        if (baseResponseExecuteCapdu != null && baseResponseExecuteCapdu.mResultCode == 0) {
                            try {
                                f(context, cardInfo, tsmAPDUCommandInstallDoorCard.getAid(), mifareCardType, productId, true);
                            } catch (Throwable th) {
                                th = th;
                                terminal.close();
                                throw th;
                            }
                        }
                        terminal.close();
                        if (r6 == 0 || !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                            k.a().b(cardInfo, aVar);
                        }
                        return baseResponseExecuteCapdu;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (NfcEeIOException e) {
                    e = e;
                    LogUtils.e("issue failed with an nfc exception. errorCode:" + e.getErrorCode(), e);
                    i = 10;
                    r17 = r13;
                    r16 = r14;
                    if (r15 == 0 || !r15.getBoolean(r11)) {
                        r17 = r13;
                        r16 = r14;
                        r17 = r13;
                        r16 = r14;
                        r17 = r13;
                        r16 = r14;
                        k.a().b(r17, r16);
                    }
                    r17 = r13;
                    r16 = r14;
                    r17 = r13;
                    r16 = r14;
                    r17 = r13;
                    r16 = r14;
                    return new BaseResponse(i, message, new Object[0]);
                } catch (IOException e2) {
                    e = e2;
                    LogUtils.e("issue failed with an io exception.", e);
                    i = 2;
                    r17 = r13;
                    r16 = r14;
                    if (r15 == 0 || !r15.getBoolean(r11)) {
                        r17 = r13;
                        r16 = r14;
                        r17 = r13;
                        r16 = r14;
                        r17 = r13;
                        r16 = r14;
                        k.a().b(r17, r16);
                    }
                    r17 = r13;
                    r16 = r14;
                    r17 = r13;
                    r16 = r14;
                    r17 = r13;
                    r16 = r14;
                    return new BaseResponse(i, message, new Object[0]);
                } catch (InterruptedException e3) {
                    e = e3;
                    LogUtils.e("issue is interrupted.", e);
                    i = 11;
                    r17 = r13;
                    r16 = r14;
                    if (r15 == 0 || !r15.getBoolean(r11)) {
                        r17 = r13;
                        r16 = r14;
                        r17 = r13;
                        r16 = r14;
                        r17 = r13;
                        r16 = r14;
                        k.a().b(r17, r16);
                    }
                    r17 = r13;
                    r16 = r14;
                    r17 = r13;
                    r16 = r14;
                    r17 = r13;
                    r16 = r14;
                    return new BaseResponse(i, message, new Object[0]);
                } catch (a e4) {
                    e = e4;
                    int iA2 = e.a();
                    message = e.getMessage();
                    LogUtils.e("issue failed with an tsmapi exception.", e);
                    if (r15 == 0 || !r15.getBoolean(r11)) {
                        i = iA2;
                        r17 = r13;
                        r16 = r14;
                        r17 = r13;
                        r16 = r14;
                        r17 = r13;
                        r16 = r14;
                        r17 = r13;
                        r16 = r14;
                        k.a().b(r17, r16);
                    } else {
                        i = iA2;
                    }
                    r17 = r13;
                    r16 = r14;
                    r17 = r13;
                    r16 = r14;
                    r17 = r13;
                    r16 = r14;
                    return new BaseResponse(i, message, new Object[0]);
                }
            } catch (Throwable th3) {
                th = th3;
                if (r15 != 0 || !r15.getBoolean(string2)) {
                    k.a().b(r13, aVar);
                }
                throw th;
            }
        } catch (NfcEeIOException e5) {
            e = e5;
            r14 = aVar;
            r11 = f.EXTRAS_KEY_SESSION_NOT_FINISH;
            r15 = bundle;
            r13 = cardInfo;
        } catch (IOException e6) {
            e = e6;
            r14 = aVar;
            r11 = f.EXTRAS_KEY_SESSION_NOT_FINISH;
            r15 = bundle;
            r13 = cardInfo;
        } catch (InterruptedException e7) {
            e = e7;
            r14 = aVar;
            r11 = f.EXTRAS_KEY_SESSION_NOT_FINISH;
            r15 = bundle;
            r13 = cardInfo;
        } catch (a e8) {
            e = e8;
            r14 = aVar;
            r11 = f.EXTRAS_KEY_SESSION_NOT_FINISH;
            r15 = bundle;
            r13 = cardInfo;
        } catch (Throwable th4) {
            th = th4;
            string2 = f.EXTRAS_KEY_SESSION_NOT_FINISH;
            r15 = bundle;
            r13 = cardInfo;
            if (r15 != 0) {
                k.a().b(r13, aVar);
            } else {
                k.a().b(r13, aVar);
            }
            throw th;
        }
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse transferIn(Context context, CardInfo cardInfo, Bundle bundle) {
        int iA;
        String str;
        String strFindText;
        Throwable th;
        String string;
        IScTerminal terminal = cardInfo.getTerminal();
        String message = "";
        try {
            if (bundle != null) {
                try {
                    string = bundle.getString("applyChannel");
                } catch (IOException e) {
                    str = "transferIn failed with an io exception.";
                    iA = 2;
                    th = e;
                    LogUtils.e(str, th);
                    terminal.close();
                    strFindText = message;
                    return new BaseResponse(iA, strFindText, new Object[0]);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    iA = 11;
                    strFindText = ErrorCode.findText(context, 11);
                    LogUtils.t("transferIn is interrupted.");
                } catch (a e2) {
                    iA = e2.a();
                    message = e2.getMessage();
                    str = "transferIn failed with an tsmapi exception.";
                    th = e2;
                    LogUtils.e(str, th);
                    terminal.close();
                    strFindText = message;
                    return new BaseResponse(iA, strFindText, new Object[0]);
                }
            } else {
                string = "";
            }
            TsmRpcModels.TsmSessionInfo session = getSession(context, cardInfo, null);
            BaseResponse baseResponseSyncEse = f.sNeedSync.get() ? syncEse(context, cardInfo, session, bundle) : null;
            if (baseResponseSyncEse == null || baseResponseSyncEse.isSuccess()) {
                d7t d7tVar = new d7t(session.getSessionId(), ((MifareCardInfo) cardInfo).getCloudCid(), string);
                d3t.b bVar = (d3t.b) HttpClient.getInstance(context).execute(d7tVar).getResult();
                if (d7tVar.isSuccess()) {
                    terminal.open();
                    TsmRpcModels.TsmAPDUCommand tsmAPDUCommandA = bVar.a();
                    BaseResponse baseResponseExecuteCapdu = executeCapdu(context, terminal, session, tsmAPDUCommandA);
                    if (baseResponseExecuteCapdu != null && baseResponseExecuteCapdu.isSuccess()) {
                        MifareCardInfo mifareCardInfo = (MifareCardInfo) cardInfo;
                        f(context, cardInfo, tsmAPDUCommandA.getAid(), mifareCardInfo.getMifareCardType(), mifareCardInfo.getProductId(), true);
                    }
                    terminal.close();
                    return baseResponseExecuteCapdu;
                }
                ErrorInfo errorInfo = d7tVar.getResponse().getErrorInfo();
                int i = errorInfo.mErrorCode;
                strFindText = errorInfo.mErrorDesc;
                iA = i;
            } else {
                iA = baseResponseSyncEse.mResultCode;
                strFindText = baseResponseSyncEse.mMsg;
            }
            terminal.close();
            return new BaseResponse(iA, strFindText, new Object[0]);
        } catch (Throwable th2) {
            terminal.close();
            throw th2;
        }
    }

    private BaseResponse a(Context context, CardInfo cardInfo, IScTerminal iScTerminal, TsmRpcModels.TsmSessionInfo tsmSessionInfo, Bundle bundle, TsmRpcModels.TsmAPDUCommand tsmAPDUCommand) throws a, InterruptedException, IOException {
        List<TsmRpcModels.TsmCAPDU> apdusList = tsmAPDUCommand.getApdusList();
        if (apdusList == null || apdusList.isEmpty()) {
            throw new a(h.a(tsmAPDUCommand.getResult()), tsmAPDUCommand.getErrorDesc());
        }
        ArrayList arrayList = new ArrayList();
        internalExecuteCapdu(context, iScTerminal, apdusList, arrayList);
        TsmRpcModels.TsmAPDUCommand tsmAPDUCommandExecuteCommand = this.mSeiTsmAuthManager.executeCommand(context, cardInfo, tsmSessionInfo, bundle, arrayList);
        if (tsmAPDUCommandExecuteCommand == null) {
            LogUtils.d("can not get nextApducommand, executeCommandCapdu failed.");
            return new BaseResponse(16, ErrorCode.findText(context, 16), new Object[0]);
        }
        int iA = h.a(tsmAPDUCommandExecuteCommand.getResult());
        if (iA != 0) {
            throw new a(iA, tsmAPDUCommandExecuteCommand.getErrorDesc());
        }
        if (tsmAPDUCommandExecuteCommand.getApdusList() != null && !tsmAPDUCommandExecuteCommand.getApdusList().isEmpty()) {
            return a(context, cardInfo, iScTerminal, tsmSessionInfo, bundle, tsmAPDUCommandExecuteCommand);
        }
        LogUtils.d("no more apdu, execute finished!");
        return new BaseResponse(0, new Object[0]);
    }
}
