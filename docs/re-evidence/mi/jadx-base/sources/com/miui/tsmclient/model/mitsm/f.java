package com.miui.tsmclient.model.mitsm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.miui.tsmclient.analytics.AnalyticManager;
import com.miui.tsmclient.analytics.TSMDataStatInterface;
import com.miui.tsmclient.entity.ApduFixEntity;
import com.miui.tsmclient.entity.BankCardInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.ConfirmBizStatusInfo;
import com.miui.tsmclient.entity.LogCaptureConfig;
import com.miui.tsmclient.entity.SessionInfoResponse;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.ConfigManager;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.IOUtils;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.PrefUtils;
import com.miui.tsmclient.util.ServiceUtils;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.exception.NfcEeIOException;
import com.tsmclient.smartcard.terminal.IScTerminal;
import com.tsmclient.smartcard.terminal.external.CommandList;
import com.tsmclient.smartcard.terminal.external.IApduExecutor;
import com.tsmclient.smartcard.terminal.external.ResponseList;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import defpackage.b4s;
import defpackage.c4s;
import defpackage.fes;
import defpackage.h9s;
import defpackage.ljs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class f extends com.miui.tsmclient.model.c {
    public static final String EXTRAS_KEY_BUSINESS_TYPE = "extras_key_business_type";
    public static final String EXTRAS_KEY_SESSION_NOT_FINISH = "extras_key_session_not_finish";
    public static final String EXTRAS_KEY_SE_OPERATION = "extras_key_se_operation";
    public static final String EXTRA_KEY_INTERNAL_RETURN = "extras_key_internal_return";
    protected static AtomicBoolean sNeedSync = new AtomicBoolean(true);
    protected b4s mSeiTsmAuthManager = new b4s();

    public static void initSync() {
        sNeedSync.set(true);
    }

    private boolean isIssueOrTransferIn(TsmRpcModels.SeOperationType seOperationType) {
        return seOperationType == TsmRpcModels.SeOperationType.INSTALL || seOperationType == TsmRpcModels.SeOperationType.SHIFT_IN;
    }

    private void matchApduStatus(ScResponse scResponse, List<LogCaptureConfig> list) {
        Iterator<LogCaptureConfig> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isStatusMatcher(scResponse.getStatus().toString())) {
                LogUtils.d(Constants.MQS_LOG_CAPTURE, "error_response:" + scResponse.getStatus().toString());
                return;
            }
        }
    }

    public BaseResponse backup(Context context, CardInfo cardInfo) {
        return new BaseResponse(17, new Object[0]);
    }

    public BaseResponse checkSeUpgrade(Context context, int i) {
        String message;
        int result;
        TsmRpcModels.CheckSeUpgradeResponse checkSeUpgradeResponseCheckSeUpgrade = null;
        try {
            checkSeUpgradeResponseCheckSeUpgrade = this.mSeiTsmAuthManager.checkSeUpgrade(context, TsmRpcModels.ServiceType.valueOf(i));
            if (checkSeUpgradeResponseCheckSeUpgrade != null) {
                result = checkSeUpgradeResponseCheckSeUpgrade.getResult();
                message = checkSeUpgradeResponseCheckSeUpgrade.getErrorDesc();
            } else {
                result = -2;
                message = "";
            }
        } catch (r.a e) {
            LogUtils.e("failed to check service available, businessType = " + i, e);
            int iA = e.a();
            message = e.getMessage();
            result = iA;
        }
        return new BaseResponse(result, message, checkSeUpgradeResponseCheckSeUpgrade);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x011f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121 A[Catch: all -> 0x0079, TryCatch #5 {all -> 0x0079, blocks: (B:12:0x0074, B:37:0x00b1, B:56:0x0117, B:60:0x0125, B:64:0x0137, B:59:0x0121, B:49:0x00df, B:72:0x0166, B:80:0x0198, B:10:0x006e, B:25:0x008a, B:27:0x0096, B:30:0x00a2, B:36:0x00af), top: B:98:0x006e, inners: #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:66:0x0141  */
    /* JADX WARN: Code duplicated, block: B:69:0x0158  */
    public BaseResponse delete(Context context, CardInfo cardInfo, Bundle bundle) throws Throwable {
        int iA;
        StringBuilder sb;
        boolean z;
        boolean z2;
        BaseResponse baseResponseUpload;
        String sessionId;
        String message = "";
        LogUtils.d("Delete aid is : " + cardInfo.mAid);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        k.a aVar = (k.a) bundle2.getSerializable(EXTRAS_KEY_BUSINESS_TYPE);
        if (aVar == null) {
            aVar = k.a.DELETE;
        }
        k.a aVar2 = aVar;
        ConfirmBizStatusInfo confirmBizStatusInfo = new ConfirmBizStatusInfo(cardInfo, bundle2, a.a(aVar2));
        boolean z3 = bundle2.getBoolean(EXTRAS_KEY_SESSION_NOT_FINISH);
        TsmRpcModels.SeOperationType seOperationTypeValueOf = TsmRpcModels.SeOperationType.valueOf(bundle2.getInt(EXTRAS_KEY_SE_OPERATION, 4));
        LogUtils.d("delete called. SeOperationType: " + seOperationTypeValueOf);
        int i = 0;
        try {
            try {
                try {
                    try {
                        try {
                            TsmRpcModels.TsmSessionInfo session = getSession(context, cardInfo, aVar2, true);
                            if (session != null) {
                                try {
                                    sessionId = session.getSessionId();
                                } catch (r.a e) {
                                    e = e;
                                    z = true;
                                    if (e.a() == 10021) {
                                        iA = 0;
                                    } else {
                                        iA = e.a();
                                    }
                                    message = e.getMessage();
                                    String stackTrace = IOUtils.getStackTrace(e);
                                    if (e.getCause() != null) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    confirmBizStatusInfo.setExtra(stackTrace, z2);
                                    LogUtils.e("delete failed with an tsmapi exception.", e);
                                    if (!z3) {
                                        k.a().b(cardInfo, aVar2);
                                    }
                                    confirmBizStatusInfo.setErrorCode(iA);
                                    confirmBizStatusInfo.setErrorDesc(message);
                                    baseResponseUpload = confirmBizStatusInfo.upload(context);
                                    if (!baseResponseUpload.isSuccess()) {
                                        int i2 = baseResponseUpload.mResultCode;
                                        message = baseResponseUpload.mMsg;
                                        iA = i2;
                                    }
                                    sb = new StringBuilder();
                                    sb.append("******* delete time:");
                                    sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                                    sb.append(" *******");
                                    LogUtils.d(sb.toString());
                                    return new BaseResponse(iA, message, new Object[0]);
                                }
                            } else {
                                sessionId = "";
                            }
                            confirmBizStatusInfo.setSessionId(sessionId);
                            z = true;
                            try {
                                BaseResponse baseResponseStartSeOperation = startSeOperation(context, cardInfo, session, seOperationTypeValueOf, bundle2);
                                if (baseResponseStartSeOperation.isSuccess()) {
                                    if (!z3) {
                                        updateInternal(context, cardInfo);
                                    }
                                    iA = 0;
                                } else {
                                    iA = baseResponseStartSeOperation.mResultCode;
                                    try {
                                        message = baseResponseStartSeOperation.mMsg;
                                    } catch (r.a e2) {
                                        e = e2;
                                        if (e.a() == 10021) {
                                            iA = 0;
                                        } else {
                                            iA = e.a();
                                        }
                                        message = e.getMessage();
                                        String stackTrace2 = IOUtils.getStackTrace(e);
                                        if (e.getCause() != null) {
                                            z2 = z;
                                        } else {
                                            z2 = false;
                                        }
                                        confirmBizStatusInfo.setExtra(stackTrace2, z2);
                                        LogUtils.e("delete failed with an tsmapi exception.", e);
                                        if (!z3) {
                                            k.a().b(cardInfo, aVar2);
                                        }
                                        confirmBizStatusInfo.setErrorCode(iA);
                                        confirmBizStatusInfo.setErrorDesc(message);
                                        baseResponseUpload = confirmBizStatusInfo.upload(context);
                                        if (!baseResponseUpload.isSuccess()) {
                                            int i3 = baseResponseUpload.mResultCode;
                                            message = baseResponseUpload.mMsg;
                                            iA = i3;
                                        }
                                        sb = new StringBuilder();
                                    }
                                }
                                if (!z3) {
                                    k.a().b(cardInfo, aVar2);
                                }
                                confirmBizStatusInfo.setErrorCode(iA);
                                confirmBizStatusInfo.setErrorDesc(message);
                                BaseResponse baseResponseUpload2 = confirmBizStatusInfo.upload(context);
                                if (!baseResponseUpload2.isSuccess()) {
                                    iA = baseResponseUpload2.mResultCode;
                                    message = baseResponseUpload2.mMsg;
                                }
                                sb = new StringBuilder();
                            } catch (r.a e3) {
                                e = e3;
                                if (e.a() == 10021) {
                                    iA = 0;
                                } else {
                                    iA = e.a();
                                }
                                message = e.getMessage();
                                String stackTrace3 = IOUtils.getStackTrace(e);
                                if (e.getCause() != null) {
                                    z2 = z;
                                } else {
                                    z2 = false;
                                }
                                confirmBizStatusInfo.setExtra(stackTrace3, z2);
                                LogUtils.e("delete failed with an tsmapi exception.", e);
                                if (!z3) {
                                    k.a().b(cardInfo, aVar2);
                                }
                                confirmBizStatusInfo.setErrorCode(iA);
                                confirmBizStatusInfo.setErrorDesc(message);
                                baseResponseUpload = confirmBizStatusInfo.upload(context);
                                if (!baseResponseUpload.isSuccess()) {
                                    int i4 = baseResponseUpload.mResultCode;
                                    message = baseResponseUpload.mMsg;
                                    iA = i4;
                                }
                                sb = new StringBuilder();
                                sb.append("******* delete time:");
                                sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                                sb.append(" *******");
                                LogUtils.d(sb.toString());
                                return new BaseResponse(iA, message, new Object[0]);
                            }
                        } catch (r.a e4) {
                            e = e4;
                            z = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        i = 0;
                        if (!z3) {
                            k.a().b(cardInfo, aVar2);
                        }
                        confirmBizStatusInfo.setErrorCode(i);
                        confirmBizStatusInfo.setErrorDesc("");
                        confirmBizStatusInfo.upload(context).isSuccess();
                        LogUtils.d("******* delete time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " *******");
                        throw th;
                    }
                } catch (NfcEeIOException e5) {
                    iA = 10;
                    confirmBizStatusInfo.setErrorCode(ErrorCode.getUnifiedNfcErrorCode(e5.getErrorCode()));
                    confirmBizStatusInfo.setExtra(IOUtils.getStackTrace(e5));
                    LogUtils.e("delete failed with NfcEeIOException.", e5);
                    if (!z3) {
                        k.a().b(cardInfo, aVar2);
                    }
                    confirmBizStatusInfo.setErrorCode(10);
                    confirmBizStatusInfo.setErrorDesc("");
                    BaseResponse baseResponseUpload3 = confirmBizStatusInfo.upload(context);
                    if (!baseResponseUpload3.isSuccess()) {
                        int i5 = baseResponseUpload3.mResultCode;
                        message = baseResponseUpload3.mMsg;
                        iA = i5;
                    }
                    sb = new StringBuilder();
                }
            } catch (IOException e6) {
                iA = 12;
                confirmBizStatusInfo.setExtra(IOUtils.getStackTrace(e6));
                LogUtils.e("delete failed with an io exception.", e6);
                if (!z3) {
                    k.a().b(cardInfo, aVar2);
                }
                confirmBizStatusInfo.setErrorCode(12);
                confirmBizStatusInfo.setErrorDesc("");
                BaseResponse baseResponseUpload4 = confirmBizStatusInfo.upload(context);
                if (!baseResponseUpload4.isSuccess()) {
                    int i6 = baseResponseUpload4.mResultCode;
                    message = baseResponseUpload4.mMsg;
                    iA = i6;
                }
                sb = new StringBuilder();
            } catch (InterruptedException e7) {
                iA = 11;
                confirmBizStatusInfo.setExtra(IOUtils.getStackTrace(e7));
                LogUtils.e("delete is interrupted.", e7);
                Thread.currentThread().interrupt();
                if (!z3) {
                    k.a().b(cardInfo, aVar2);
                }
                confirmBizStatusInfo.setErrorCode(11);
                confirmBizStatusInfo.setErrorDesc("");
                BaseResponse baseResponseUpload5 = confirmBizStatusInfo.upload(context);
                if (!baseResponseUpload5.isSuccess()) {
                    int i7 = baseResponseUpload5.mResultCode;
                    message = baseResponseUpload5.mMsg;
                    iA = i7;
                }
                sb = new StringBuilder();
            }
            sb.append("******* delete time:");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb.append(" *******");
            LogUtils.d(sb.toString());
            return new BaseResponse(iA, message, new Object[0]);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public BaseResponse executeCapdu(Context context, CardInfo cardInfo, TsmRpcModels.TsmSessionInfo tsmSessionInfo, TsmRpcModels.TsmAPDUCommand tsmAPDUCommand) throws r.a, InterruptedException, IOException {
        IScTerminal terminal = cardInfo.getTerminal();
        try {
            terminal.open();
            return executeCapdu(context, terminal, tsmSessionInfo, tsmAPDUCommand);
        } finally {
            terminal.close();
        }
    }

    public BaseResponse executeCommands(Context context, CardInfo cardInfo, Bundle bundle) {
        int i;
        if (cardInfo == null) {
            return new BaseResponse(1, new Object[0]);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        String message = "";
        TsmRpcModels.SeOperationType seOperationTypeValueOf = TsmRpcModels.SeOperationType.OUT_EXEC_CMDS;
        if (bundle2.containsKey(EXTRAS_KEY_SE_OPERATION)) {
            seOperationTypeValueOf = TsmRpcModels.SeOperationType.valueOf(bundle2.getInt(EXTRAS_KEY_SE_OPERATION));
        }
        TsmRpcModels.SeOperationType seOperationType = seOperationTypeValueOf;
        k.a aVar = k.a.OUT_EXECUTE;
        if (bundle2.containsKey(EXTRAS_KEY_BUSINESS_TYPE)) {
            aVar = (k.a) bundle2.getSerializable(EXTRAS_KEY_BUSINESS_TYPE);
        }
        try {
            return startSeOperation(context, cardInfo, getSession(context, cardInfo, aVar, true), seOperationType, bundle2);
        } catch (NfcEeIOException e) {
            LogUtils.e("executeCommands failed with an nfc exception. errorCode:" + e.getErrorCode(), e);
            i = 10;
            return new BaseResponse(i, message, new Object[0]);
        } catch (IOException e2) {
            LogUtils.e("executeCommands failed with an io exception.", e2);
            i = 2;
            return new BaseResponse(i, message, new Object[0]);
        } catch (InterruptedException e3) {
            LogUtils.e("executeCommands is interrupted.", e3);
            Thread.currentThread().interrupt();
            i = 11;
            return new BaseResponse(i, message, new Object[0]);
        } catch (r.a e4) {
            LogUtils.e("executeCommands failed with an tsmapi exception.", e4);
            int iA = e4.a();
            message = e4.getMessage();
            i = iA;
            return new BaseResponse(i, message, new Object[0]);
        }
    }

    public BaseResponse executeSeOperation(Context context, Bundle bundle) {
        int iA;
        String message;
        try {
            CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
            TsmRpcModels.TsmStartActionResponse tsmStartActionResponseExecuteSeOperation = this.mSeiTsmAuthManager.executeSeOperation(context, cardInfo, bundle);
            if (tsmStartActionResponseExecuteSeOperation == null) {
                LogUtils.e("executeSeOperation return null");
                return new BaseResponse(1, new Object[0]);
            }
            iA = h.a(tsmStartActionResponseExecuteSeOperation.getResult());
            LogUtils.d("executeSeOperation finished, resultCode: " + iA + " resultMsg:" + tsmStartActionResponseExecuteSeOperation.getErrorDesc());
            if (iA != 0) {
                message = tsmStartActionResponseExecuteSeOperation.getErrorDesc();
                return new BaseResponse(iA, message, new Object[0]);
            }
            BaseResponse baseResponseExecuteCapdu = executeCapdu(context, cardInfo, TsmRpcModels.TsmSessionInfo.newBuilder().setResult(tsmStartActionResponseExecuteSeOperation.getResult()).setSessionId(tsmStartActionResponseExecuteSeOperation.getSessionId()).setErrorDesc(tsmStartActionResponseExecuteSeOperation.getErrorDesc()).build(), tsmStartActionResponseExecuteSeOperation.getApduCommand());
            LogUtils.d("executeCapdu finished, resultCode: " + baseResponseExecuteCapdu.mResultCode + " resultMsg:" + baseResponseExecuteCapdu.mMsg);
            if (baseResponseExecuteCapdu.isSuccess()) {
                SessionInfoResponse sessionInfoResponse = new SessionInfoResponse();
                sessionInfoResponse.setSessionId(tsmStartActionResponseExecuteSeOperation.getSessionId());
                baseResponseExecuteCapdu.setDatas(sessionInfoResponse);
            }
            return baseResponseExecuteCapdu;
        } catch (AuthApiException e) {
            LogUtils.e("executeSeOperation failed", e);
            iA = e.mErrorCode;
            message = e.mErrorMsg;
        } catch (IOException e2) {
            LogUtils.e("executeSeOperation failed", e2);
            message = e2.getMessage();
            iA = 2;
        } catch (InterruptedException e3) {
            LogUtils.e("executeSeOperation failed", e3);
            Thread.currentThread().interrupt();
            message = e3.getMessage();
            iA = 11;
        } catch (r.a e4) {
            LogUtils.e("executeSeOperation failed", e4);
            iA = e4.a();
            message = e4.getMessage();
        }
    }

    public BaseResponse fixApdu(Context context, CardInfo cardInfo, Bundle bundle) {
        return new BaseResponse(0, new Object[0]);
    }

    public String getOperationResult(Context context, Bundle bundle) throws r.a, AuthApiException {
        String operationResult = this.mSeiTsmAuthManager.getOperationResult(context, TsmRpcModels.TsmSessionInfo.newBuilder().setResult(0).setSessionId(bundle.getString("sessionId", "")).build());
        LogUtils.d("getOperationResult finished, operationResponse: " + operationResult);
        return operationResult;
    }

    public TsmRpcModels.TsmSessionInfo getSession(Context context, CardInfo cardInfo, k.a aVar) throws r.a {
        return getSession(context, cardInfo, aVar, false);
    }

    public BaseResponse internalExecuteCapdu(Context context, IScTerminal iScTerminal, List<TsmRpcModels.TsmCAPDU> list, List<TsmRpcModels.SeAPDUResponseItem> list2) throws InterruptedException, IOException {
        boolean z;
        c4s c4sVar;
        IApduExecutor iApduExecutorE;
        if ((iScTerminal instanceof c4s) && (iApduExecutorE = (c4sVar = (c4s) iScTerminal).e()) != null) {
            CommandList commandList = new CommandList();
            for (TsmRpcModels.TsmCAPDU tsmCAPDU : list) {
                commandList.addCommand(new CommandList.Command(tsmCAPDU.getApdu().toByteArray(), tsmCAPDU.getExpectSwRegex()));
            }
            LogUtils.v("internalExecute command size: " + commandList.getList().size());
            ResponseList responseListExecute = iApduExecutorE.execute(c4sVar.g(), commandList);
            if (responseListExecute == null) {
                return new BaseResponse(-1, new Object[0]);
            }
            int i = 0;
            for (ResponseList.Response response : responseListExecute.getList()) {
                list2.add(TsmRpcModels.SeAPDUResponseItem.newBuilder().setIndex(i).setResponseData(ByteString.copyFrom(response.getData())).setResponseSw(ByteString.copyFrom(response.getStatus())).build());
                i++;
            }
            return new BaseResponse(responseListExecute.isSuccess() ? 0 : -1, new Object[0]);
        }
        try {
            Iterator<TsmRpcModels.TsmCAPDU> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                TsmRpcModels.TsmCAPDU next = it.next();
                h9s h9sVarA = fes.a();
                h9sVarA.b(next);
                ScResponse scResponseTransmit = iScTerminal.transmit(next.getApdu().toByteArray());
                h9sVarA.a(next);
                int i3 = i2 + 1;
                list2.add(TsmRpcModels.SeAPDUResponseItem.newBuilder().setIndex(i2).setResponseData(ByteString.copyFrom(scResponseTransmit.getData().toBytes())).setResponseSw(ByteString.copyFrom(scResponseTransmit.getStatus().toBytes())).build());
                if (TextUtils.isEmpty(next.getExpectSwRegex())) {
                    LogUtils.w("no expected sw.");
                } else if (Pattern.compile(next.getExpectSwRegex()).matcher(Coder.bytesToHexString(scResponseTransmit.getStatus().toBytes())).matches()) {
                    i2 = i3;
                } else {
                    matchApduStatus(scResponseTransmit, ConfigManager.getInstance(context).getLogCaptureConfig());
                }
                z = false;
                break;
            }
            return new BaseResponse(z ? 0 : -1, new Object[0]);
        } catch (Exception e) {
            LogUtils.e("pullPersonData internalExecuteCapdu error: ", e);
            return new BaseResponse(-1, e);
        }
    }

    public BaseResponse invoke(Context context, String str, String str2) throws r.a, InterruptedException, AuthApiException {
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        TsmRpcModels.TsmStartActionResponse tsmStartActionResponseStartAction = this.mSeiTsmAuthManager.startAction(context, cardInfo, TsmRpcModels.SeOperationType.valueOf(str), str2);
        if (tsmStartActionResponseStartAction == null) {
            LogUtils.e("startAction() returns null");
            return new BaseResponse(1, new Object[0]);
        }
        int iA = h.a(tsmStartActionResponseStartAction.getResult());
        if (iA != 0) {
            return new BaseResponse(iA, tsmStartActionResponseStartAction.getErrorDesc(), new Object[0]);
        }
        try {
            BaseResponse baseResponseExecuteCapdu = executeCapdu(context, cardInfo, TsmRpcModels.TsmSessionInfo.newBuilder().setResult(tsmStartActionResponseStartAction.getResult()).setSessionId(tsmStartActionResponseStartAction.getSessionId()).setErrorDesc(tsmStartActionResponseStartAction.getErrorDesc()).build(), tsmStartActionResponseStartAction.getApduCommand());
            String aid = tsmStartActionResponseStartAction.getApduCommand().getAid();
            LogUtils.d("enroll card finished when invoking task, aid = " + aid);
            baseResponseExecuteCapdu.mDatas = new Object[]{aid};
            LogUtils.e("invoke finished, result: " + baseResponseExecuteCapdu.mResultCode);
            return baseResponseExecuteCapdu;
        } catch (IOException e) {
            String message = e.getMessage();
            LogUtils.e("io exception occurs when processing apdu commands.", e);
            return new BaseResponse(2, message, new Object[0]);
        }
    }

    public BaseResponse isServiceAvailable(Context context, CardInfo cardInfo, Bundle bundle) {
        return new BaseResponse(0, new Object[0]);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11641. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public com.miui.tsmclient.model.BaseResponse issue(android.content.Context r30, com.miui.tsmclient.entity.CardInfo r31, android.os.Bundle r32) {
        /*
            Method dump skipped, instruction units count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.tsmclient.model.mitsm.f.issue(android.content.Context, com.miui.tsmclient.entity.CardInfo, android.os.Bundle):com.miui.tsmclient.model.BaseResponse");
    }

    public BaseResponse lock(Context context, CardInfo cardInfo, Bundle bundle) {
        int i;
        String str;
        int i2;
        String message;
        int iA;
        k.a aVar = k.a.LOCK;
        try {
            try {
                try {
                    BaseResponse baseResponseStartSeOperation = startSeOperation(context, cardInfo, getSession(context, cardInfo, aVar, true), TsmRpcModels.SeOperationType.LOCK, bundle);
                    k.a().b(cardInfo, aVar);
                    return baseResponseStartSeOperation;
                } catch (r.a e) {
                    iA = e.a();
                    message = e.getMessage();
                    LogUtils.e("lock failed with an tsmapi exception.", e);
                    k.a().b(cardInfo, aVar);
                    return new BaseResponse(iA, message, new Object[0]);
                }
            } catch (NfcEeIOException e2) {
                e = e2;
                str = "lock failed with NfcEeIOException.";
                i2 = 10;
                LogUtils.e(str, e);
                i = i2;
                k.a().b(cardInfo, aVar);
                message = "";
                iA = i;
                return new BaseResponse(iA, message, new Object[0]);
            } catch (IOException e3) {
                e = e3;
                str = "lock failed with an io exception.";
                i2 = 2;
                LogUtils.e(str, e);
                i = i2;
                k.a().b(cardInfo, aVar);
                message = "";
                iA = i;
                return new BaseResponse(iA, message, new Object[0]);
            } catch (InterruptedException e4) {
                LogUtils.e("lock is interrupted.", e4);
                Thread.currentThread().interrupt();
                i = 11;
                k.a().b(cardInfo, aVar);
                message = "";
                iA = i;
                return new BaseResponse(iA, message, new Object[0]);
            }
        } catch (Throwable th) {
            k.a().b(cardInfo, aVar);
            throw th;
        }
    }

    public void notifyCardInfoChanged(Context context, CardInfo cardInfo) {
        Intent intent = new Intent(Constants.ACTION_UPDATE_CARD_INFO);
        intent.setPackage(context.getPackageName());
        intent.putExtra(Constants.EXTRA_CARD_INFO, cardInfo);
        context.sendBroadcast(intent, Constants.Permission.TSM_GROUP);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008f A[PHI: r10
      0x008f: PHI (r10v5 com.miui.tsmclient.model.BaseResponse) = 
      (r10v1 com.miui.tsmclient.model.BaseResponse)
      (r10v2 com.miui.tsmclient.model.BaseResponse)
      (r10v3 com.miui.tsmclient.model.BaseResponse)
      (r10v7 com.miui.tsmclient.model.BaseResponse)
     binds: [B:34:0x008d, B:43:0x00dc, B:48:0x0109, B:38:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    public BaseResponse preReturnCard(Context context, CardInfo cardInfo, Bundle bundle) throws Throwable {
        int iA;
        BaseResponse baseResponseUpload;
        String message = "";
        LogUtils.d("preReturnCard called.");
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        ConfirmBizStatusInfo confirmBizStatusInfo = new ConfirmBizStatusInfo(cardInfo, bundle2, a.RETURN);
        int i = 0;
        int i2 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            TsmRpcModels.TsmSessionInfo session = getSession(context, cardInfo, null);
                            confirmBizStatusInfo.setSessionId(session != null ? session.getSessionId() : "");
                            BaseResponse baseResponseStartSeOperation = startSeOperation(context, cardInfo, session, TsmRpcModels.SeOperationType.CHECK_RETURN, bundle2);
                            if (!baseResponseStartSeOperation.isSuccess()) {
                                i = baseResponseStartSeOperation.mResultCode;
                                try {
                                    confirmBizStatusInfo.setErrorDesc(baseResponseStartSeOperation.mMsg);
                                    i2 = i;
                                } catch (r.a e) {
                                    e = e;
                                    iA = e.a();
                                    message = e.getMessage();
                                    confirmBizStatusInfo.setExtra(IOUtils.getStackTrace(e));
                                    LogUtils.e("preReturnCard failed with an SeiTSMApiException.", e);
                                    confirmBizStatusInfo.setErrorCode(iA);
                                    confirmBizStatusInfo.setErrorDesc(message);
                                    confirmBizStatusInfo.setCoreOperation("preReturnCard");
                                    baseResponseUpload = confirmBizStatusInfo.upload(context);
                                    if (!baseResponseUpload.isSuccess()) {
                                        iA = baseResponseUpload.mResultCode;
                                        message = baseResponseUpload.mMsg;
                                    }
                                    return new BaseResponse(iA, message, new Object[0]);
                                }
                            }
                            confirmBizStatusInfo.setErrorCode(i2);
                            confirmBizStatusInfo.setErrorDesc("");
                            confirmBizStatusInfo.setCoreOperation("preReturnCard");
                            confirmBizStatusInfo.upload(context).isSuccess();
                            return baseResponseStartSeOperation;
                        } catch (Throwable th) {
                            th = th;
                            i2 = i;
                            confirmBizStatusInfo.setErrorCode(i2);
                            confirmBizStatusInfo.setErrorDesc("");
                            confirmBizStatusInfo.setCoreOperation("preReturnCard");
                            confirmBizStatusInfo.upload(context).isSuccess();
                            throw th;
                        }
                    } catch (NfcEeIOException e2) {
                        iA = 10;
                        confirmBizStatusInfo.setErrorCode(ErrorCode.getUnifiedNfcErrorCode(e2.getErrorCode()));
                        confirmBizStatusInfo.setExtra(IOUtils.getStackTrace(e2));
                        LogUtils.e("preReturnCard failed with NfcEeIOException.", e2);
                        confirmBizStatusInfo.setErrorCode(10);
                        confirmBizStatusInfo.setErrorDesc("");
                        confirmBizStatusInfo.setCoreOperation("preReturnCard");
                        baseResponseUpload = confirmBizStatusInfo.upload(context);
                        if (!baseResponseUpload.isSuccess()) {
                            iA = baseResponseUpload.mResultCode;
                            message = baseResponseUpload.mMsg;
                        }
                        return new BaseResponse(iA, message, new Object[0]);
                    }
                } catch (IOException e3) {
                    iA = 12;
                    confirmBizStatusInfo.setExtra(IOUtils.getStackTrace(e3));
                    LogUtils.e("preReturnCard failed with an io exception.", e3);
                    confirmBizStatusInfo.setErrorCode(12);
                    confirmBizStatusInfo.setErrorDesc("");
                    confirmBizStatusInfo.setCoreOperation("preReturnCard");
                    baseResponseUpload = confirmBizStatusInfo.upload(context);
                    if (!baseResponseUpload.isSuccess()) {
                        iA = baseResponseUpload.mResultCode;
                        message = baseResponseUpload.mMsg;
                    }
                    return new BaseResponse(iA, message, new Object[0]);
                }
            } catch (InterruptedException e4) {
                iA = 11;
                confirmBizStatusInfo.setExtra(IOUtils.getStackTrace(e4));
                LogUtils.e("preReturnCard is interrupted.", e4);
                Thread.currentThread().interrupt();
                confirmBizStatusInfo.setErrorCode(11);
                confirmBizStatusInfo.setErrorDesc("");
                confirmBizStatusInfo.setCoreOperation("preReturnCard");
                baseResponseUpload = confirmBizStatusInfo.upload(context);
                if (!baseResponseUpload.isSuccess()) {
                    iA = baseResponseUpload.mResultCode;
                    message = baseResponseUpload.mMsg;
                }
                return new BaseResponse(iA, message, new Object[0]);
            }
        } catch (r.a e5) {
            e = e5;
        } catch (Throwable th2) {
            th = th2;
            confirmBizStatusInfo.setErrorCode(i2);
            confirmBizStatusInfo.setErrorDesc("");
            confirmBizStatusInfo.setCoreOperation("preReturnCard");
            confirmBizStatusInfo.upload(context).isSuccess();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[PHI: r11
      0x0093: PHI (r11v5 com.miui.tsmclient.model.BaseResponse) = 
      (r11v1 com.miui.tsmclient.model.BaseResponse)
      (r11v2 com.miui.tsmclient.model.BaseResponse)
      (r11v3 com.miui.tsmclient.model.BaseResponse)
      (r11v7 com.miui.tsmclient.model.BaseResponse)
     binds: [B:34:0x0091, B:52:0x0116, B:47:0x00e9, B:42:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    public BaseResponse preTransferOut(Context context, CardInfo cardInfo, Bundle bundle) throws Throwable {
        int iA;
        BaseResponse baseResponseUpload;
        String message = "";
        LogUtils.d("preTransferOut called.");
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        ConfirmBizStatusInfo confirmBizStatusInfo = new ConfirmBizStatusInfo(cardInfo, bundle2, a.a(k.a.TRANSFER_OUT));
        int i = 0;
        int i2 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            TsmRpcModels.TsmSessionInfo session = getSession(context, cardInfo, null);
                            confirmBizStatusInfo.setSessionId(session != null ? session.getSessionId() : "");
                            BaseResponse baseResponseStartSeOperation = startSeOperation(context, cardInfo, session, TsmRpcModels.SeOperationType.CHECK_SHIFT_OUT, bundle2);
                            if (!baseResponseStartSeOperation.isSuccess()) {
                                i = baseResponseStartSeOperation.mResultCode;
                                try {
                                    confirmBizStatusInfo.setErrorDesc(baseResponseStartSeOperation.mMsg);
                                    i2 = i;
                                } catch (r.a e) {
                                    e = e;
                                    iA = e.a();
                                    message = e.getMessage();
                                    confirmBizStatusInfo.setExtra(IOUtils.getStackTrace(e), e.getCause() != null);
                                    LogUtils.e("preTransferOut failed with an SeiTSMApiException.", e);
                                    confirmBizStatusInfo.setErrorCode(iA);
                                    confirmBizStatusInfo.setErrorDesc(message);
                                    confirmBizStatusInfo.setCoreOperation("preTransferOut");
                                    baseResponseUpload = confirmBizStatusInfo.upload(context);
                                    if (!baseResponseUpload.isSuccess()) {
                                        iA = baseResponseUpload.mResultCode;
                                        message = baseResponseUpload.mMsg;
                                    }
                                    return new BaseResponse(iA, message, new Object[0]);
                                }
                            }
                            confirmBizStatusInfo.setErrorCode(i2);
                            confirmBizStatusInfo.setErrorDesc("");
                            confirmBizStatusInfo.setCoreOperation("preTransferOut");
                            confirmBizStatusInfo.upload(context).isSuccess();
                            return baseResponseStartSeOperation;
                        } catch (IOException e2) {
                            iA = 12;
                            confirmBizStatusInfo.setExtra(IOUtils.getStackTrace(e2));
                            LogUtils.e("preTransferOut failed with an io exception.", e2);
                            confirmBizStatusInfo.setErrorCode(12);
                            confirmBizStatusInfo.setErrorDesc("");
                            confirmBizStatusInfo.setCoreOperation("preTransferOut");
                            baseResponseUpload = confirmBizStatusInfo.upload(context);
                            if (!baseResponseUpload.isSuccess()) {
                                iA = baseResponseUpload.mResultCode;
                                message = baseResponseUpload.mMsg;
                            }
                            return new BaseResponse(iA, message, new Object[0]);
                        }
                    } catch (NfcEeIOException e3) {
                        iA = 10;
                        confirmBizStatusInfo.setErrorCode(ErrorCode.getUnifiedNfcErrorCode(e3.getErrorCode()));
                        confirmBizStatusInfo.setExtra(IOUtils.getStackTrace(e3));
                        LogUtils.e("preTransferOut failed with NfcEeIOException.", e3);
                        confirmBizStatusInfo.setErrorCode(10);
                        confirmBizStatusInfo.setErrorDesc("");
                        confirmBizStatusInfo.setCoreOperation("preTransferOut");
                        baseResponseUpload = confirmBizStatusInfo.upload(context);
                        if (!baseResponseUpload.isSuccess()) {
                            iA = baseResponseUpload.mResultCode;
                            message = baseResponseUpload.mMsg;
                        }
                        return new BaseResponse(iA, message, new Object[0]);
                    }
                } catch (InterruptedException e4) {
                    iA = 11;
                    confirmBizStatusInfo.setExtra(IOUtils.getStackTrace(e4));
                    LogUtils.e("preTransferOut is interrupted.", e4);
                    Thread.currentThread().interrupt();
                    confirmBizStatusInfo.setErrorCode(11);
                    confirmBizStatusInfo.setErrorDesc("");
                    confirmBizStatusInfo.setCoreOperation("preTransferOut");
                    baseResponseUpload = confirmBizStatusInfo.upload(context);
                    if (!baseResponseUpload.isSuccess()) {
                        iA = baseResponseUpload.mResultCode;
                        message = baseResponseUpload.mMsg;
                    }
                    return new BaseResponse(iA, message, new Object[0]);
                }
            } catch (Throwable th) {
                th = th;
                i2 = i;
                confirmBizStatusInfo.setErrorCode(i2);
                confirmBizStatusInfo.setErrorDesc("");
                confirmBizStatusInfo.setCoreOperation("preTransferOut");
                confirmBizStatusInfo.upload(context).isSuccess();
                throw th;
            }
        } catch (r.a e5) {
            e = e5;
        } catch (Throwable th2) {
            th = th2;
            confirmBizStatusInfo.setErrorCode(i2);
            confirmBizStatusInfo.setErrorDesc("");
            confirmBizStatusInfo.setCoreOperation("preTransferOut");
            confirmBizStatusInfo.upload(context).isSuccess();
            throw th;
        }
    }

    public BaseResponse rawMode(Context context, IScTerminal iScTerminal, Bundle bundle) {
        int iA;
        String message = "";
        try {
            CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
            TsmRpcModels.SeOperationType seOperationType = TsmRpcModels.SeOperationType.OPEN_SECURE_CHANNEL;
            if (bundle != null) {
                if (bundle.getBoolean("open")) {
                    seOperationType = TsmRpcModels.SeOperationType.OPEN_TAI;
                } else if (bundle.getBoolean(Constants.EXTRA_CLOSE_TAI)) {
                    seOperationType = TsmRpcModels.SeOperationType.CLOSE_TAI;
                }
            }
            TsmRpcModels.SeOperationType seOperationType2 = seOperationType;
            if (iScTerminal == null) {
                iScTerminal = cardInfo.getTerminal();
            }
            TsmRpcModels.TsmSessionInfo session = getSession(context, cardInfo, null);
            TsmRpcModels.TsmAPDUCommand tsmAPDUCommandStartSeOperation = this.mSeiTsmAuthManager.startSeOperation(context, session, seOperationType2, cardInfo, bundle);
            if (tsmAPDUCommandStartSeOperation == null) {
                return new BaseResponse(8, new Object[0]);
            }
            iA = h.a(tsmAPDUCommandStartSeOperation.getResult());
            message = tsmAPDUCommandStartSeOperation.getErrorDesc();
            if (iA == 0) {
                LogUtils.t("openSecureChannel startSeOperation success");
                try {
                    iScTerminal.open();
                    return executeCapdu(context, iScTerminal, session, tsmAPDUCommandStartSeOperation);
                } finally {
                    iScTerminal.close();
                }
            }
            return new BaseResponse(iA, message, new Object[0]);
        } catch (NfcEeIOException e) {
            LogUtils.e("open secure channel failed with NfcEeIOException.", e);
            iA = 10;
        } catch (IOException e2) {
            iA = 2;
            message = ErrorCode.findText(context, 2);
            LogUtils.e("open secure channel fail", e2);
        } catch (InterruptedException e3) {
            iA = 11;
            message = ErrorCode.findText(context, 11);
            LogUtils.t("open secure channel fail, exception:" + e3);
            Thread.currentThread().interrupt();
        } catch (r.a e4) {
            iA = e4.a();
            message = e4.getMessage();
            LogUtils.e("open secure channel fail", e4);
        }
    }

    public BaseResponse returnCard(Context context, CardInfo cardInfo, Bundle bundle) throws Throwable {
        k.a aVar;
        LogUtils.d("returnCard called.");
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle.getBoolean(Constants.EXTRA_OUT_OPERATION)) {
            BaseResponse baseResponsePreReturnCard = preReturnCard(context, cardInfo, bundle);
            if (!baseResponsePreReturnCard.isSuccess()) {
                return baseResponsePreReturnCard;
            }
        }
        if (bundle.getBoolean(EXTRA_KEY_INTERNAL_RETURN, false)) {
            bundle.putInt(EXTRAS_KEY_SE_OPERATION, 24);
            aVar = k.a.INTERNAL_RETURN;
        } else {
            bundle.putInt(EXTRAS_KEY_SE_OPERATION, 23);
            aVar = k.a.OUT_RETURN;
        }
        bundle.putSerializable(EXTRAS_KEY_BUSINESS_TYPE, aVar);
        return delete(context, cardInfo, bundle);
    }

    public BaseResponse saveAppKey(Context context) {
        int iA;
        String str;
        int iA2;
        Throwable th;
        if (PrefUtils.getBoolean(context, PrefUtils.PREF_KEY_SPI_PK_STATE, false)) {
            LogUtils.d("don't need to save app key again");
            return new BaseResponse(0, new Object[0]);
        }
        LogUtils.v("-------------- start saveAppKey---------------");
        AnalyticManager.getInstance().recordEvent("nfc", String.format(AnalyticManager.KEY_OPERATION_LAUNCH, "saveAppKey"));
        TSMDataStatInterface.getInstance().recordStringEvent(5, "0");
        Bundle bundleP = ljs.p(context);
        if (bundleP == null) {
            LogUtils.w("signedPK is null");
            HashMap map = new HashMap();
            map.put("error_code", Integer.toString(10));
            AnalyticManager.getInstance().recordEvent("nfc", String.format(AnalyticManager.KEY_OPERATION_FAILED, "saveAppKey"), map);
            ArrayList arrayList = new ArrayList();
            arrayList.add("-1");
            arrayList.add("ERROR_NFC");
            TSMDataStatInterface.getInstance().recordListEvent(5, arrayList);
            return new BaseResponse(10, new Object[0]);
        }
        k.a aVar = k.a.SAVEKEY;
        String message = "";
        BankCardInfo bankCardInfo = new BankCardInfo();
        ArrayList arrayList2 = new ArrayList();
        try {
            try {
                try {
                    TsmRpcModels.TsmSessionInfo session = getSession(context, bankCardInfo, aVar, true);
                    TsmRpcModels.TsmAPDUCommand tsmAPDUCommandSaveAppKey = this.mSeiTsmAuthManager.saveAppKey(context, bundleP, session);
                    if (tsmAPDUCommandSaveAppKey == null) {
                        LogUtils.d("can not get apdu Command, saveAppKey failed.");
                        HashMap map2 = new HashMap();
                        map2.put("error_code", Integer.toString(8));
                        AnalyticManager.getInstance().recordEvent("nfc", String.format(AnalyticManager.KEY_OPERATION_FAILED, "saveAppKey"), map2);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add("-1");
                        arrayList3.add(String.valueOf(8));
                        TSMDataStatInterface.getInstance().recordListEvent(5, arrayList3);
                        BaseResponse baseResponse = new BaseResponse(8, new Object[0]);
                        k.a().b(bankCardInfo, aVar);
                        return baseResponse;
                    }
                    iA2 = h.a(tsmAPDUCommandSaveAppKey.getResult());
                    message = tsmAPDUCommandSaveAppKey.getErrorDesc();
                    if (iA2 == 0) {
                        BaseResponse baseResponse2 = new BaseResponse(0, new Object[0]);
                        if (tsmAPDUCommandSaveAppKey.getApdusList() != null && !tsmAPDUCommandSaveAppKey.getApdusList().isEmpty()) {
                            baseResponse2 = executeCapdu(context, bankCardInfo, session, tsmAPDUCommandSaveAppKey);
                        }
                        if (baseResponse2 != null && baseResponse2.mResultCode == 0) {
                            PrefUtils.putBoolean(context, PrefUtils.PREF_KEY_SPI_PK_STATE, true);
                            AnalyticManager.getInstance().recordEvent("nfc", String.format(AnalyticManager.KEY_OPERATION_SUCCESS, "saveAppKey"));
                            TSMDataStatInterface.getInstance().recordStringEvent(5, "1");
                        }
                        k.a().b(bankCardInfo, aVar);
                        return baseResponse2;
                    }
                    k.a().b(bankCardInfo, aVar);
                    LogUtils.w("save app key result code: " + iA2);
                    LogUtils.v("-------------- saveAppKey end ---------------");
                    HashMap map3 = new HashMap();
                    map3.put("error_code", Integer.toString(iA2));
                    AnalyticManager.getInstance().recordEvent("nfc", String.format(AnalyticManager.KEY_OPERATION_FAILED, "saveAppKey"), map3);
                    arrayList2.add("-1");
                    arrayList2.add(String.valueOf(iA2));
                    TSMDataStatInterface.getInstance().recordListEvent(5, arrayList2);
                    return new BaseResponse(iA2, message, new Object[0]);
                } catch (IOException e) {
                    str = "saveAppKey failed with an io exception.";
                    iA = 2;
                    th = e;
                    LogUtils.e(str, th);
                    iA2 = iA;
                } catch (InterruptedException e2) {
                    LogUtils.e("saveAppKey is interrupted.", e2);
                    Thread.currentThread().interrupt();
                    iA2 = 11;
                }
            } catch (NfcEeIOException e3) {
                str = "saveAppKey failed with NfcEeIOException.";
                iA = 10;
                th = e3;
                LogUtils.e(str, th);
                iA2 = iA;
            } catch (r.a e4) {
                iA = e4.a();
                str = "saveAppKey failed with an tsmapi exception.";
                message = e4.getMessage();
                th = e4;
                LogUtils.e(str, th);
                iA2 = iA;
            }
        } catch (Throwable th2) {
            k.a().b(bankCardInfo, aVar);
            throw th2;
        }
    }

    public BaseResponse startSeOperation(Context context, CardInfo cardInfo, TsmRpcModels.TsmSessionInfo tsmSessionInfo, TsmRpcModels.SeOperationType seOperationType, Bundle bundle) throws r.a, InterruptedException, IOException {
        BaseResponse baseResponseSyncEse = sNeedSync.get() ? syncEse(context, cardInfo, tsmSessionInfo, bundle) : null;
        if (baseResponseSyncEse != null && !baseResponseSyncEse.isSuccess()) {
            return baseResponseSyncEse;
        }
        TsmRpcModels.TsmAPDUCommand tsmAPDUCommandStartSeOperation = this.mSeiTsmAuthManager.startSeOperation(context, tsmSessionInfo, seOperationType, cardInfo, bundle);
        if (tsmAPDUCommandStartSeOperation == null) {
            sNeedSync.set(true);
            return new BaseResponse(8, new Object[0]);
        }
        int iA = h.a(tsmAPDUCommandStartSeOperation.getResult());
        if (iA != 0) {
            throw new r.a(iA, tsmAPDUCommandStartSeOperation.getErrorDesc());
        }
        if (tsmAPDUCommandStartSeOperation.getApdusList() == null || tsmAPDUCommandStartSeOperation.getApdusList().isEmpty()) {
            return new BaseResponse(0, new Object[0]);
        }
        IScTerminal terminal = cardInfo.getTerminal();
        try {
            terminal.open();
            return executeCapdu(context, terminal, tsmSessionInfo, tsmAPDUCommandStartSeOperation);
        } finally {
            terminal.close();
        }
    }

    public BaseResponse syncEse(Context context, CardInfo cardInfo, TsmRpcModels.TsmSessionInfo tsmSessionInfo, Bundle bundle) throws r.a, InterruptedException, IOException {
        TsmRpcModels.TsmAPDUCommand tsmAPDUCommandStartSeOperation = this.mSeiTsmAuthManager.startSeOperation(context, tsmSessionInfo, TsmRpcModels.SeOperationType.SYNC, cardInfo, bundle);
        if (tsmAPDUCommandStartSeOperation == null) {
            LogUtils.e("syncEse failed, no apdu commands");
            throw new r.a(8, "");
        }
        int iA = h.a(tsmAPDUCommandStartSeOperation.getResult());
        if (iA != 0) {
            throw new r.a(iA, tsmAPDUCommandStartSeOperation.getErrorDesc());
        }
        if (tsmAPDUCommandStartSeOperation.getApdusList() == null || tsmAPDUCommandStartSeOperation.getApdusList().isEmpty()) {
            return new BaseResponse(0, Constants.NO_APDU, new Object[0]);
        }
        IScTerminal terminal = cardInfo.getTerminal();
        try {
            terminal.open();
            BaseResponse baseResponseExecuteCapdu = executeCapdu(context, terminal, tsmSessionInfo, tsmAPDUCommandStartSeOperation);
            LogUtils.d("sync ese finished, result:" + baseResponseExecuteCapdu.mResultCode);
            if (bundle == null || !bundle.getBoolean(TSMAuthContants.PARAM_ONLY_SYNC_CARD)) {
                sNeedSync.set(false);
            }
            return baseResponseExecuteCapdu;
        } finally {
            terminal.close();
        }
    }

    public BaseResponse transferIn(Context context, CardInfo cardInfo, Bundle bundle) {
        LogUtils.d("transferIn called.");
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt(EXTRAS_KEY_SE_OPERATION, 12);
        bundle.putSerializable(EXTRAS_KEY_BUSINESS_TYPE, k.a.TRANSFER_IN);
        return issue(context, cardInfo, bundle);
    }

    public BaseResponse transferOut(Context context, CardInfo cardInfo, Bundle bundle) {
        LogUtils.d("transferOut called.");
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt(EXTRAS_KEY_SE_OPERATION, 11);
        bundle.putSerializable(EXTRAS_KEY_BUSINESS_TYPE, k.a.TRANSFER_OUT);
        return delete(context, cardInfo, bundle);
    }

    public BaseResponse unrestrictEse(Context context, Bundle bundle) throws r.a, InterruptedException, IOException {
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        TsmRpcModels.TsmSessionInfo session = getSession(context, cardInfo, null);
        TsmRpcModels.TsmAPDUCommand tsmAPDUCommandStartSeOperation = this.mSeiTsmAuthManager.startSeOperation(context, session, TsmRpcModels.SeOperationType.UNRESTRICT, null, bundle);
        if (tsmAPDUCommandStartSeOperation == null) {
            LogUtils.e("unRestrict ese failed, no apdu commands");
            throw new r.a(8, "");
        }
        int iA = h.a(tsmAPDUCommandStartSeOperation.getResult());
        if (iA != 0) {
            throw new r.a(iA, tsmAPDUCommandStartSeOperation.getErrorDesc());
        }
        IScTerminal terminal = cardInfo.getTerminal();
        try {
            terminal.open();
            return executeCapdu(context, terminal, session, tsmAPDUCommandStartSeOperation);
        } finally {
            terminal.close();
        }
    }

    public void updateInternal(Context context, CardInfo cardInfo) {
        ljs.g(context, cardInfo);
        Intent intent = new Intent(Constants.ACTION_QUERY_CARDS);
        intent.setPackage("com.miui.tsmclient");
        intent.putExtra("card_type", cardInfo.mCardType);
        ServiceUtils.startService(context, intent);
    }

    public BaseResponse upgradeApplet(Context context, int i) {
        int iA;
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        String message = "";
        Bundle bundle = new Bundle();
        bundle.putInt(TSMAuthContants.PARAM_SERVICE_TYPE, i);
        try {
            TsmRpcModels.TsmSessionInfo session = getSession(context, cardInfo, null);
            TsmRpcModels.TsmAPDUCommand tsmAPDUCommandStartSeOperation = this.mSeiTsmAuthManager.startSeOperation(context, session, TsmRpcModels.SeOperationType.UPGRADE_SE, cardInfo, bundle);
            if (tsmAPDUCommandStartSeOperation == null) {
                return new BaseResponse(8, new Object[0]);
            }
            iA = tsmAPDUCommandStartSeOperation.getResult();
            message = tsmAPDUCommandStartSeOperation.getErrorDesc();
            if (iA == 0) {
                if (tsmAPDUCommandStartSeOperation.getApdusList() != null && !tsmAPDUCommandStartSeOperation.getApdusList().isEmpty()) {
                    IScTerminal terminal = cardInfo.getTerminal();
                    try {
                        terminal.open();
                        return executeCapdu(context, terminal, session, tsmAPDUCommandStartSeOperation);
                    } finally {
                        terminal.close();
                    }
                }
                iA = 0;
            }
            LogUtils.d("upgrade applet resultCode = " + iA + ", msg = " + message);
            return new BaseResponse(iA, message, new Object[0]);
        } catch (NfcEeIOException e) {
            LogUtils.e("failed to upgrade applet", e);
            iA = 10;
        } catch (IOException e2) {
            LogUtils.e("failed to upgrade applet", e2);
            iA = 2;
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            LogUtils.e("failed to upgrade applet", e3);
            iA = 11;
        } catch (r.a e4) {
            iA = e4.a();
            message = e4.getMessage();
            LogUtils.e("failed to upgrade applet", e4);
        }
    }

    public BaseResponse uploadTransferOutResult(Context context, CardInfo cardInfo, Bundle bundle) {
        return this.mTSMAuthManager.uploadTransferOutResult(context, cardInfo, bundle);
    }

    public BaseResponse executeCapdu(Context context, IScTerminal iScTerminal, TsmRpcModels.TsmSessionInfo tsmSessionInfo, TsmRpcModels.TsmAPDUCommand tsmAPDUCommand) throws r.a, InterruptedException, IOException {
        return executeCapdu(context, iScTerminal, tsmSessionInfo, tsmAPDUCommand, null, true, null);
    }

    public TsmRpcModels.TsmSessionInfo getSession(Context context, CardInfo cardInfo, k.a aVar, boolean z) throws r.a {
        k kVarA = k.a();
        TsmRpcModels.TsmSessionInfo tsmSessionInfoA = aVar == null ? kVarA.a(context, cardInfo) : kVarA.a(context, cardInfo, aVar, z);
        if (tsmSessionInfoA.getResult() != 0) {
            throw new r.a(h.a(tsmSessionInfoA.getResult()), tsmSessionInfoA.getErrorDesc());
        }
        LogUtils.d("sessionInfo : " + tsmSessionInfoA.getSessionId());
        return tsmSessionInfoA;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    public BaseResponse executeCapdu(Context context, IScTerminal iScTerminal, TsmRpcModels.TsmSessionInfo tsmSessionInfo, TsmRpcModels.TsmAPDUCommand tsmAPDUCommand, TsmRpcModels.SeOperationType seOperationType, boolean z, Bundle bundle) throws r.a, InterruptedException, IOException {
        int result;
        String errorDesc;
        Exception exc;
        List<TsmRpcModels.TsmCAPDU> apdusList = tsmAPDUCommand.getApdusList();
        if (apdusList == null || apdusList.isEmpty()) {
            throw new r.a(h.a(tsmAPDUCommand.getResult()), tsmAPDUCommand.getErrorDesc());
        }
        ArrayList arrayList = new ArrayList();
        h9s h9sVarA = fes.a();
        try {
            h9sVarA.c(apdusList, z);
            BaseResponse baseResponseInternalExecuteCapdu = internalExecuteCapdu(context, iScTerminal, apdusList, arrayList);
            if (!z) {
                boolean zIsSuccess = baseResponseInternalExecuteCapdu.isSuccess();
                try {
                    h9sVarA.c();
                    TsmRpcModels.CommonResponse commonResponseProcessFinishNotify = this.mSeiTsmAuthManager.processFinishNotify(context, tsmSessionInfo, zIsSuccess, seOperationType, arrayList, tsmAPDUCommand.getScriptsId());
                    h9sVarA.b();
                    if (commonResponseProcessFinishNotify != null && commonResponseProcessFinishNotify.getResult() == 0) {
                        BaseResponse baseResponse = new BaseResponse(zIsSuccess ? 0 : 8, new Object[0]);
                        h9sVarA.a();
                        return baseResponse;
                    }
                    if (commonResponseProcessFinishNotify != null) {
                        result = commonResponseProcessFinishNotify.getResult();
                        errorDesc = commonResponseProcessFinishNotify.getErrorDesc();
                    } else {
                        result = -2;
                        errorDesc = "";
                    }
                    throw new r.a(result, errorDesc);
                } catch (r.a e) {
                    if (bundle == null || !bundle.getBoolean(Constants.EXTRA_SKIP_SAVE_APDU_RESPONSE)) {
                        ApduFixEntity fromApduResponse = ApduFixEntity.getFromApduResponse(context, tsmSessionInfo == null ? "" : tsmSessionInfo.getSessionId(), zIsSuccess, seOperationType, arrayList, tsmAPDUCommand.getScriptsId(), tsmAPDUCommand.getAid());
                        if (fromApduResponse != null) {
                            fromApduResponse.saveToCache();
                        }
                    }
                    throw e;
                }
            }
            h9sVarA.c();
            TsmRpcModels.TsmAPDUCommand tsmAPDUCommandProcessSeResponse = this.mSeiTsmAuthManager.processSeResponse(context, tsmSessionInfo, arrayList);
            h9sVarA.b();
            if (tsmAPDUCommandProcessSeResponse == null) {
                LogUtils.d("can not get nextApducommand, processSeResponse failed.");
                BaseResponse baseResponse2 = new BaseResponse(16, new Object[0]);
                h9sVarA.a();
                return baseResponse2;
            }
            int iA = h.a(tsmAPDUCommandProcessSeResponse.getResult());
            if (iA != 0) {
                Object[] objArr = baseResponseInternalExecuteCapdu.mDatas;
                if (objArr == null || objArr.length <= 0) {
                    exc = null;
                } else {
                    Object obj = objArr[0];
                    if (obj instanceof Exception) {
                        exc = (Exception) obj;
                    } else {
                        exc = null;
                    }
                }
                throw new r.a(iA, tsmAPDUCommandProcessSeResponse.getErrorDesc(), exc);
            }
            if (tsmAPDUCommandProcessSeResponse.getApdusList() != null && !tsmAPDUCommandProcessSeResponse.getApdusList().isEmpty()) {
                BaseResponse baseResponseExecuteCapdu = executeCapdu(context, iScTerminal, tsmSessionInfo, tsmAPDUCommandProcessSeResponse);
                h9sVarA.a();
                return baseResponseExecuteCapdu;
            }
            LogUtils.d("no more apdu, execute finished!");
            BaseResponse baseResponse3 = new BaseResponse(0, new Object[0]);
            h9sVarA.a();
            return baseResponse3;
        } catch (Throwable th) {
            h9sVarA.a();
            throw th;
        }
    }
}
