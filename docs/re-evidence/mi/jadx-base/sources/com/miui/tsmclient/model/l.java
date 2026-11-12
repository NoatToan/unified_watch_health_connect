package com.miui.tsmclient.model;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.entity.ActionToken;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.ConfirmBizStatusInfo;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.IOUtils;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.exception.NfcEeIOException;
import com.tsmclient.smartcard.terminal.IScTerminal;
import defpackage.b4s;
import defpackage.fns;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class l extends com.miui.tsmclient.model.mitsm.d {
    public l(com.miui.tsmclient.model.mitsm.f fVar) {
        super(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0228  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f A[PHI: r0
      0x014f: PHI (r0v29 com.miui.tsmclient.model.BaseResponse) = 
      (r0v15 com.miui.tsmclient.model.BaseResponse)
      (r0v22 com.miui.tsmclient.model.BaseResponse)
      (r0v27 com.miui.tsmclient.model.BaseResponse)
      (r0v35 com.miui.tsmclient.model.BaseResponse)
     binds: [B:101:0x019c, B:84:0x014d, B:110:0x01c8, B:119:0x0212] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v11, types: [com.miui.tsmclient.entity.ConfirmBizStatusInfo] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public BaseResponse a(Context context, PayableCardInfo payableCardInfo, OrderInfo orderInfo, Tag tag, Bundle bundle) {
        Object[] objArr;
        int iA;
        BaseResponse baseResponseUpload;
        String sessionId;
        String str;
        BaseResponse baseResponseA;
        int i;
        String message = "";
        ConfirmBizStatusInfo confirmBizStatusInfo = 1;
        confirmBizStatusInfo = 1;
        ConfirmBizStatusInfo confirmBizStatusInfo2 = 1;
        ConfirmBizStatusInfo confirmBizStatusInfo3 = 1;
        ConfirmBizStatusInfo confirmBizStatusInfo4 = 1;
        confirmBizStatusInfo = 1;
        com.miui.tsmclient.model.mitsm.k.a aVar = null;
        if (payableCardInfo == null) {
            return new BaseResponse(1, new Object[0]);
        }
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        int i2 = bundle2.getBoolean(Constants.EXTRA_OUT_OPERATION);
        if (i2 == 0 && orderInfo == null) {
            return new BaseResponse(1, new Object[0]);
        }
        long j = bundle2.getLong(Constants.EXTRA_VERSION_CONTROL_ID, 0L);
        String strD = fns.d(j);
        if (TextUtils.isEmpty(strD)) {
            objArr = false;
        } else {
            bundle2.putString(b4s.EXTRA_NEED_PHONE_NUMBER, strD);
            objArr = true;
        }
        com.miui.tsmclient.model.mitsm.k.a aVar2 = i2 != 0 ? com.miui.tsmclient.model.mitsm.k.a.OUT_RECHARGE : com.miui.tsmclient.model.mitsm.k.a.RECHARGE;
        if (orderInfo != null) {
            bundle2.putString("order_id", orderInfo.mOrderId);
        }
        ConfirmBizStatusInfo confirmBizStatusInfo5 = new ConfirmBizStatusInfo(payableCardInfo, bundle2, com.miui.tsmclient.model.mitsm.a.a(aVar2));
        try {
            try {
                try {
                    try {
                        TsmRpcModels.TsmSessionInfo session = getSession(context, payableCardInfo, aVar2, true);
                        if (session != null) {
                            try {
                                sessionId = session.getSessionId();
                            } catch (Throwable th) {
                                th = th;
                                confirmBizStatusInfo = confirmBizStatusInfo5;
                                i2 = 0;
                                aVar = aVar2;
                                if (!bundle2.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                                    com.miui.tsmclient.model.mitsm.k.a().b(payableCardInfo, aVar);
                                }
                                confirmBizStatusInfo.setErrorCode(i2);
                                confirmBizStatusInfo.setErrorDesc("");
                                confirmBizStatusInfo.upload(context).isSuccess();
                                throw th;
                            }
                        } else {
                            sessionId = "";
                        }
                        confirmBizStatusInfo5.setSessionId(sessionId);
                        try {
                            if (i2 != 0) {
                                baseResponseA = startSeOperation(context, payableCardInfo, session, TsmRpcModels.SeOperationType.OUT_TOPUP, bundle2);
                            } else {
                                Iterator<ActionToken> it = orderInfo.mActionTokens.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        str = null;
                                        break;
                                    }
                                    ActionToken next = it.next();
                                    if (next.isRechargeType()) {
                                        str = next.mToken;
                                        break;
                                    }
                                }
                                baseResponseA = a(context, payableCardInfo, session, str, bundle2);
                            }
                            if (baseResponseA.isSuccess()) {
                                if (objArr != false) {
                                    fns.c().g(context, payableCardInfo.mCardType, j);
                                }
                                i = 0;
                            } else {
                                message = baseResponseA.mMsg;
                                i = baseResponseA.mResultCode;
                            }
                            if (!bundle2.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                                com.miui.tsmclient.model.mitsm.k.a().b(payableCardInfo, aVar2);
                            }
                            confirmBizStatusInfo5.setErrorCode(i);
                            confirmBizStatusInfo5.setErrorDesc(message);
                            confirmBizStatusInfo5.upload(context).isSuccess();
                            return baseResponseA;
                        } catch (NfcEeIOException e) {
                            e = e;
                            try {
                                LogUtils.e("recharge failed with an nfc exception. errorCode:" + e.getErrorCode(), e);
                                iA = 10;
                                confirmBizStatusInfo.setErrorCode(ErrorCode.getUnifiedNfcErrorCode(e.getErrorCode()));
                                confirmBizStatusInfo.setExtra(IOUtils.getStackTrace(e));
                                if (!bundle2.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                                    com.miui.tsmclient.model.mitsm.k.a().b(payableCardInfo, aVar);
                                }
                                confirmBizStatusInfo.setErrorCode(10);
                                confirmBizStatusInfo.setErrorDesc("");
                                baseResponseUpload = confirmBizStatusInfo.upload(context);
                                if (!baseResponseUpload.isSuccess()) {
                                    iA = baseResponseUpload.mResultCode;
                                    message = baseResponseUpload.mMsg;
                                }
                                return new BaseResponse(iA, message, new Object[0]);
                            } catch (Throwable th2) {
                                th = th2;
                                i2 = 0;
                                if (!bundle2.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                                    com.miui.tsmclient.model.mitsm.k.a().b(payableCardInfo, aVar);
                                }
                                confirmBizStatusInfo.setErrorCode(i2);
                                confirmBizStatusInfo.setErrorDesc("");
                                confirmBizStatusInfo.upload(context).isSuccess();
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            LogUtils.e("recharge failed with an io exception.", e);
                            iA = 12;
                            confirmBizStatusInfo2.setExtra(IOUtils.getStackTrace(e));
                            if (!bundle2.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                                com.miui.tsmclient.model.mitsm.k.a().b(payableCardInfo, aVar);
                            }
                            confirmBizStatusInfo2.setErrorCode(12);
                            confirmBizStatusInfo2.setErrorDesc("");
                            baseResponseUpload = confirmBizStatusInfo2.upload(context);
                            if (!baseResponseUpload.isSuccess()) {
                                iA = baseResponseUpload.mResultCode;
                                message = baseResponseUpload.mMsg;
                            }
                            return new BaseResponse(iA, message, new Object[0]);
                        } catch (InterruptedException e3) {
                            e = e3;
                            LogUtils.e("recharge is interrupted.", e);
                            iA = 11;
                            confirmBizStatusInfo3.setExtra(IOUtils.getStackTrace(e));
                            Thread.currentThread().interrupt();
                            if (!bundle2.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                                com.miui.tsmclient.model.mitsm.k.a().b(payableCardInfo, aVar);
                            }
                            confirmBizStatusInfo3.setErrorCode(11);
                            confirmBizStatusInfo3.setErrorDesc("");
                            baseResponseUpload = confirmBizStatusInfo3.upload(context);
                            if (!baseResponseUpload.isSuccess()) {
                                iA = baseResponseUpload.mResultCode;
                                message = baseResponseUpload.mMsg;
                            }
                            return new BaseResponse(iA, message, new Object[0]);
                        } catch (r.a e4) {
                            e = e4;
                            LogUtils.e("recharge failed with an tsmapi exception.", e);
                            iA = e.a();
                            message = e.getMessage();
                            if (iA > 1000000) {
                                iA = 1001;
                                message = ErrorCode.findText(context, 1001);
                            }
                            confirmBizStatusInfo4.setExtra(IOUtils.getStackTrace(e), e.getCause() != null);
                            if (!bundle2.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                                com.miui.tsmclient.model.mitsm.k.a().b(payableCardInfo, aVar);
                            }
                            confirmBizStatusInfo4.setErrorCode(iA);
                            confirmBizStatusInfo4.setErrorDesc(message);
                            baseResponseUpload = confirmBizStatusInfo4.upload(context);
                            if (!baseResponseUpload.isSuccess()) {
                                iA = baseResponseUpload.mResultCode;
                                message = baseResponseUpload.mMsg;
                            }
                            return new BaseResponse(iA, message, new Object[0]);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i2 = 0;
                        if (!bundle2.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                            com.miui.tsmclient.model.mitsm.k.a().b(payableCardInfo, aVar);
                        }
                        confirmBizStatusInfo.setErrorCode(i2);
                        confirmBizStatusInfo.setErrorDesc("");
                        confirmBizStatusInfo.upload(context).isSuccess();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    confirmBizStatusInfo = confirmBizStatusInfo5;
                    aVar = aVar2;
                    i2 = 0;
                    if (!bundle2.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                        com.miui.tsmclient.model.mitsm.k.a().b(payableCardInfo, aVar);
                    }
                    confirmBizStatusInfo.setErrorCode(i2);
                    confirmBizStatusInfo.setErrorDesc("");
                    confirmBizStatusInfo.upload(context).isSuccess();
                    throw th;
                }
            } catch (NfcEeIOException e5) {
                e = e5;
                confirmBizStatusInfo = confirmBizStatusInfo5;
                aVar = aVar2;
            } catch (IOException e6) {
                e = e6;
                confirmBizStatusInfo2 = confirmBizStatusInfo5;
                aVar = aVar2;
            } catch (InterruptedException e7) {
                e = e7;
                confirmBizStatusInfo3 = confirmBizStatusInfo5;
                aVar = aVar2;
            } catch (r.a e8) {
                e = e8;
                confirmBizStatusInfo4 = confirmBizStatusInfo5;
                aVar = aVar2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // com.miui.tsmclient.model.mitsm.d, com.miui.tsmclient.model.mitsm.f
    public BaseResponse executeCommands(Context context, CardInfo cardInfo, Bundle bundle) {
        try {
            return super.executeCommands(context, cardInfo, bundle);
        } finally {
            if (bundle.containsKey(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_BUSINESS_TYPE)) {
                com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, (com.miui.tsmclient.model.mitsm.k.a) bundle.getSerializable(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_BUSINESS_TYPE));
            }
        }
    }

    public final BaseResponse a(Context context, CardInfo cardInfo, TsmRpcModels.TsmSessionInfo tsmSessionInfo, String str, Bundle bundle) throws r.a, InterruptedException, IOException {
        BaseResponse baseResponseSyncEse = com.miui.tsmclient.model.mitsm.f.sNeedSync.get() ? syncEse(context, cardInfo, tsmSessionInfo, bundle) : null;
        if (baseResponseSyncEse != null && !baseResponseSyncEse.isSuccess()) {
            return baseResponseSyncEse;
        }
        TsmRpcModels.TsmAPDUCommand tsmAPDUCommandStartTopupOperation = this.mSeiTsmAuthManager.startTopupOperation(context, tsmSessionInfo, cardInfo, str, bundle);
        if (tsmAPDUCommandStartTopupOperation == null) {
            LogUtils.d("can not get apduCommand,startTopupOperation failed.");
            return new BaseResponse(16, new Object[0]);
        }
        int iA = com.miui.tsmclient.model.mitsm.h.a(tsmAPDUCommandStartTopupOperation.getResult());
        if (iA != 0) {
            throw new r.a(iA, tsmAPDUCommandStartTopupOperation.getErrorDesc());
        }
        if (tsmAPDUCommandStartTopupOperation.getApdusList() == null || tsmAPDUCommandStartTopupOperation.getApdusList().isEmpty()) {
            return new BaseResponse(0, new Object[0]);
        }
        IScTerminal terminal = cardInfo.getTerminal();
        try {
            terminal.open();
            return executeCapdu(context, terminal, tsmSessionInfo, tsmAPDUCommandStartTopupOperation);
        } finally {
            terminal.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[PHI: r7 r12
      0x0082: PHI (r7v2 java.lang.String) = (r7v0 java.lang.String), (r7v0 java.lang.String), (r7v1 java.lang.String), (r7v0 java.lang.String) binds: [B:23:0x0047, B:27:0x0054, B:40:0x0081, B:31:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r12v7 int) = (r12v2 int), (r12v3 int), (r12v6 int), (r12v9 int) binds: [B:23:0x0047, B:27:0x0054, B:40:0x0081, B:31:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    public BaseResponse a(Context context, CardInfo cardInfo, Bundle bundle) {
        int i;
        if (bundle == null) {
            bundle = new Bundle();
        }
        String message = "";
        try {
            try {
                try {
                    com.miui.tsmclient.model.mitsm.k.a aVar = com.miui.tsmclient.model.mitsm.k.a.READ_CARD;
                    BaseResponse baseResponseStartSeOperation = startSeOperation(context, cardInfo, getSession(context, cardInfo, aVar, true), TsmRpcModels.SeOperationType.READ_CARD, bundle);
                    if (!bundle.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                        com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, aVar);
                    }
                    return baseResponseStartSeOperation;
                } catch (NfcEeIOException e) {
                    LogUtils.e("check failed with NfcEeIOException before refund.", e);
                    boolean z = bundle.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH);
                    i = 10;
                    if (!z) {
                        com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, com.miui.tsmclient.model.mitsm.k.a.READ_CARD);
                    }
                    return new BaseResponse(i, message, new Object[0]);
                } catch (r.a e2) {
                    LogUtils.e("check failed with an tsmapi exception before refund.", e2);
                    int iA = e2.a();
                    message = e2.getMessage();
                    int i2 = iA > 1000000 ? 1001 : iA;
                    if (bundle.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                        i = i2;
                    } else {
                        i = i2;
                        com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, com.miui.tsmclient.model.mitsm.k.a.READ_CARD);
                    }
                    return new BaseResponse(i, message, new Object[0]);
                }
            } catch (IOException e3) {
                LogUtils.e("check failed with an io exception before refund.", e3);
                boolean z2 = bundle.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH);
                i = 2;
                if (!z2) {
                    com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, com.miui.tsmclient.model.mitsm.k.a.READ_CARD);
                }
                return new BaseResponse(i, message, new Object[0]);
            } catch (InterruptedException e4) {
                LogUtils.e("check is interrupted before refund.", e4);
                Thread.currentThread().interrupt();
                boolean z3 = bundle.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH);
                i = 11;
                if (!z3) {
                    com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, com.miui.tsmclient.model.mitsm.k.a.READ_CARD);
                }
                return new BaseResponse(i, message, new Object[0]);
            }
        } catch (Throwable th) {
            if (!bundle.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, com.miui.tsmclient.model.mitsm.k.a.READ_CARD);
            }
            throw th;
        }
    }
}
