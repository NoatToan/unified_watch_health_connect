package com.miui.tsmclient.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.entity.ProprietaryCarKeyCardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ResUtils;
import com.tsmclient.smartcard.exception.NfcEeIOException;
import com.tsmclient.smartcard.terminal.IScTerminal;
import defpackage.b1t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class o extends com.miui.tsmclient.model.mitsm.f {
    public final BaseResponse a(Context context, CardInfo cardInfo, IScTerminal iScTerminal, TsmRpcModels.TsmSessionInfo tsmSessionInfo, Bundle bundle, TsmRpcModels.TsmAPDUCommand tsmAPDUCommand) throws r.a, InterruptedException, IOException {
        List<TsmRpcModels.TsmCAPDU> apdusList = tsmAPDUCommand.getApdusList();
        if (apdusList == null || apdusList.isEmpty()) {
            throw new r.a(com.miui.tsmclient.model.mitsm.h.a(tsmAPDUCommand.getResult()), tsmAPDUCommand.getErrorDesc());
        }
        ArrayList arrayList = new ArrayList();
        internalExecuteCapdu(context, iScTerminal, apdusList, arrayList);
        TsmRpcModels.TsmAPDUCommand tsmAPDUCommandExecuteCommand = this.mSeiTsmAuthManager.executeCommand(context, cardInfo, tsmSessionInfo, bundle, arrayList);
        if (tsmAPDUCommandExecuteCommand == null) {
            LogUtils.d("can not get nextApducommand, executeCommandCapdu failed.");
            return new BaseResponse(16, ErrorCode.findText(context, 16), new Object[0]);
        }
        int iA = com.miui.tsmclient.model.mitsm.h.a(tsmAPDUCommandExecuteCommand.getResult());
        if (iA != 0) {
            throw new r.a(iA, tsmAPDUCommandExecuteCommand.getErrorDesc());
        }
        if (tsmAPDUCommandExecuteCommand.getApdusList() != null && !tsmAPDUCommandExecuteCommand.getApdusList().isEmpty()) {
            return a(context, cardInfo, iScTerminal, tsmSessionInfo, bundle, tsmAPDUCommandExecuteCommand);
        }
        LogUtils.d("no more apdu, execute finished!");
        return new BaseResponse(0, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse executeCommands(Context context, CardInfo cardInfo, Bundle bundle) {
        int i;
        int i2;
        o oVar = this;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String message = "";
        com.miui.tsmclient.model.mitsm.k.a aVar = (com.miui.tsmclient.model.mitsm.k.a) (bundle == null ? new Bundle() : bundle).getSerializable(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_BUSINESS_TYPE);
        if (aVar == null) {
            aVar = com.miui.tsmclient.model.mitsm.k.a.OUT_EXECUTE;
        }
        com.miui.tsmclient.model.mitsm.k.a aVar2 = aVar;
        try {
            try {
                TsmRpcModels.TsmSessionInfo session = oVar.getSession(context, cardInfo, aVar2, true);
                TsmRpcModels.TsmAPDUCommand tsmAPDUCommandExecuteCommand = oVar.mSeiTsmAuthManager.executeCommand(context, cardInfo, session, bundle, new ArrayList());
                if (tsmAPDUCommandExecuteCommand == null) {
                    BaseResponse baseResponse = new BaseResponse(16, ErrorCode.findText(context, 16), new Object[0]);
                    com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, aVar2);
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
                            com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, aVar2);
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
                    com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, aVar2);
                    LogUtils.d("******* executeCommands time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " *******");
                    i = 2;
                    i2 = oVar;
                    return new BaseResponse(i, message, new Object[i2]);
                } catch (InterruptedException e2) {
                    e = e2;
                    LogUtils.e("executeCommands is interrupted.", e);
                    Thread.currentThread().interrupt();
                    com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, aVar2);
                    LogUtils.d("******* executeCommands time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " *******");
                    i = 11;
                    i2 = oVar;
                    return new BaseResponse(i, message, new Object[i2]);
                } catch (r.a e3) {
                    e = e3;
                    int iA = e.a();
                    message = e.getMessage();
                    LogUtils.e("executeCommands failed with an tsmapi exception.", e);
                    com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, aVar2);
                    LogUtils.d("******* executeCommands time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " *******");
                    i = iA;
                    i2 = oVar;
                    return new BaseResponse(i, message, new Object[i2]);
                }
            } catch (Throwable th3) {
                com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, aVar2);
                LogUtils.d("******* executeCommands time:" + (System.currentTimeMillis() - jCurrentTimeMillis) + " *******");
                throw th3;
            }
        } catch (IOException e4) {
            e = e4;
            oVar = null;
        } catch (InterruptedException e5) {
            e = e5;
            oVar = null;
        } catch (r.a e6) {
            e = e6;
            oVar = null;
        }
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse isServiceAvailable(Context context, CardInfo cardInfo, Bundle bundle) {
        String errorDesc;
        int iA = -1;
        if (!(cardInfo instanceof ProprietaryCarKeyCardInfo)) {
            return new BaseResponse(-1, new Object[0]);
        }
        try {
            TsmRpcModels.CommonResponse commonResponseIsServiceAvailable = this.mSeiTsmAuthManager.isServiceAvailable(context, TsmRpcModels.ServiceType.MIFARE_CARD, ((ProprietaryCarKeyCardInfo) cardInfo).getProductId());
            if (commonResponseIsServiceAvailable != null) {
                iA = commonResponseIsServiceAvailable.getResult();
                errorDesc = commonResponseIsServiceAvailable.getErrorDesc();
            } else {
                errorDesc = "";
            }
        } catch (r.a e) {
            iA = e.a();
            String message = e.getMessage();
            LogUtils.e("failed to check service availability", e);
            errorDesc = message;
        }
        LogUtils.d("isServiceAvailable result: " + iA + ", msg:" + errorDesc);
        return new BaseResponse(iA, errorDesc, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01d5 A[PHI: r0 r13
      0x01d5: PHI (r0v16 int) = (r0v13 int), (r0v15 int), (r0v21 int) binds: [B:113:0x01d2, B:128:0x01ff, B:134:0x0222] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r13v5 ??) = (r13v23 ??), (r13v24 ??), (r13v25 ??) binds: [B:113:0x01d2, B:128:0x01ff, B:134:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x01d7 A[PHI: r0 r12 r13 r14
      0x01d7: PHI (r0v19 int) = (r0v13 int), (r0v13 int), (r0v15 int), (r0v15 int), (r0v21 int), (r0v21 int) binds: [B:111:0x01cc, B:113:0x01d2, B:126:0x01f9, B:128:0x01ff, B:132:0x021c, B:134:0x0222] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r12v10 com.miui.tsmclient.entity.CardInfo) = 
      (r12v7 com.miui.tsmclient.entity.CardInfo)
      (r12v7 com.miui.tsmclient.entity.CardInfo)
      (r12v8 com.miui.tsmclient.entity.CardInfo)
      (r12v8 com.miui.tsmclient.entity.CardInfo)
      (r12v11 com.miui.tsmclient.entity.CardInfo)
      (r12v11 com.miui.tsmclient.entity.CardInfo)
     binds: [B:111:0x01cc, B:113:0x01d2, B:126:0x01f9, B:128:0x01ff, B:132:0x021c, B:134:0x0222] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r13v6 ??) = (r13v17 ??), (r13v18 ??), (r13v19 ??), (r13v20 ??), (r13v21 ??), (r13v22 ??) binds: [B:111:0x01cc, B:113:0x01d2, B:126:0x01f9, B:128:0x01ff, B:132:0x021c, B:134:0x0222] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r14v12 ??) = (r14v31 ??), (r14v32 ??), (r14v33 ??), (r14v34 ??), (r14v35 ??), (r14v36 ??) binds: [B:111:0x01cc, B:113:0x01d2, B:126:0x01f9, B:128:0x01ff, B:132:0x021c, B:134:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [com.miui.tsmclient.seitsm.TsmRpcModels$TsmSessionInfo] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [com.miui.tsmclient.model.mitsm.k$a] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.miui.tsmclient.model.mitsm.k$a] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.miui.tsmclient.model.mitsm.k] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.miui.tsmclient.model.mitsm.k] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.miui.tsmclient.model.mitsm.f, com.miui.tsmclient.model.o] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r8v10, types: [b4s] */
    /* JADX WARN: Type inference failed for: r8v11, types: [com.miui.tsmclient.seitsm.TsmRpcModels$TsmAPDUCommand] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
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
        String productId;
        ?? string;
        String str;
        ?? r10;
        CardInfo cardInfo2;
        ?? r11;
        ?? r13;
        int i;
        ?? r14;
        ?? r2;
        ?? r15;
        ?? r3;
        ?? r16;
        ?? r17;
        com.miui.tsmclient.model.mitsm.k.a aVar = com.miui.tsmclient.model.mitsm.k.a.INSTALL;
        if (bundle != null) {
            productId = bundle.getString(Constants.EXTRA_DOOR_CARD_PRODUCT_ID);
            string = bundle.getString(Constants.EXTRA_MIFARE_DOOR_CARD_ISSUER_TOKEN);
        } else {
            productId = "";
            string = productId;
        }
        if (TextUtils.isEmpty(productId)) {
            productId = ((ProprietaryCarKeyCardInfo) cardInfo).getProductId();
        }
        String str2 = productId;
        try {
            try {
                TsmRpcModels.TsmSessionInfo session = getSession(context, cardInfo, aVar);
                BaseResponse baseResponseSyncEse = com.miui.tsmclient.model.mitsm.f.sNeedSync.get() ? syncEse(context, cardInfo, session, bundle) : null;
                if (baseResponseSyncEse != null && !baseResponseSyncEse.isSuccess()) {
                    if (bundle == null || !bundle.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                        com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, aVar);
                    }
                    return baseResponseSyncEse;
                }
                String businessId = ((ProprietaryCarKeyCardInfo) cardInfo).getBusinessId();
                Bundle bundle2 = new Bundle();
                bundle2.putString(TSMAuthContants.PARAM_COMMUNITY_CODE, "");
                bundle2.putString("businessId", businessId);
                bundle2.putString("ticket", "");
                bundle2.putBoolean(TSMAuthContants.PARAM_OVER_WRITE, false);
                cardInfo2 = null;
                r11 = session;
                r13 = 5;
                str = "";
                ?? InstallDoorCard = this.mSeiTsmAuthManager.installDoorCard(context, r11, str2, null, 5, string, str, bundle2);
                if (InstallDoorCard == 0) {
                    com.miui.tsmclient.model.mitsm.f.sNeedSync.set(true);
                    BaseResponse baseResponse = new BaseResponse(16, new Object[0]);
                    if (bundle == null || !bundle.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                        com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, aVar);
                    }
                    return baseResponse;
                }
                int iA = com.miui.tsmclient.model.mitsm.h.a(InstallDoorCard.getResult());
                try {
                    if (iA != 0) {
                        throw new r.a(iA, InstallDoorCard.getErrorDesc());
                    }
                    if (InstallDoorCard.getApdusList() != null) {
                        try {
                            if (!InstallDoorCard.getApdusList().isEmpty()) {
                                try {
                                    IScTerminal terminal = cardInfo.getTerminal();
                                    try {
                                        terminal.open();
                                        BaseResponse baseResponseExecuteCapdu = executeCapdu(context, terminal, session, InstallDoorCard);
                                        if (baseResponseExecuteCapdu != null && baseResponseExecuteCapdu.mResultCode == 0) {
                                            try {
                                                a(context, cardInfo, InstallDoorCard.getAid(), str2, true);
                                            } catch (Throwable th) {
                                                th = th;
                                                terminal.close();
                                                throw th;
                                            }
                                        }
                                        terminal.close();
                                        if (r5 == 0 || !bundle.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                                            com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, aVar);
                                        }
                                        return baseResponseExecuteCapdu;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (NfcEeIOException e) {
                                    e = e;
                                    r11 = InstallDoorCard;
                                    LogUtils.e("issue failed with an nfc exception. errorCode:" + e.getErrorCode(), e);
                                    i = 10;
                                    r17 = r13;
                                    r16 = string;
                                    if (r11 == 0 || !r11.getBoolean(str)) {
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r3 = r17;
                                        r15 = r16;
                                        com.miui.tsmclient.model.mitsm.k.a().b(cardInfo2, r15);
                                        r2 = r3;
                                    } else {
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r2 = r14;
                                    }
                                    return new BaseResponse(i, r2, new Object[0]);
                                } catch (IOException e2) {
                                    e = e2;
                                    r11 = InstallDoorCard;
                                    LogUtils.e("issue failed with an io exception.", e);
                                    i = 2;
                                    r17 = r13;
                                    r16 = string;
                                    if (r11 == 0 || !r11.getBoolean(str)) {
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r3 = r17;
                                        r15 = r16;
                                        com.miui.tsmclient.model.mitsm.k.a().b(cardInfo2, r15);
                                        r2 = r3;
                                    } else {
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r2 = r14;
                                    }
                                    return new BaseResponse(i, r2, new Object[0]);
                                } catch (InterruptedException e3) {
                                    e = e3;
                                    r11 = InstallDoorCard;
                                    LogUtils.e("issue is interrupted.", e);
                                    i = 11;
                                    r17 = r13;
                                    r16 = string;
                                    if (r11 == 0 || !r11.getBoolean(str)) {
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r3 = r17;
                                        r15 = r16;
                                        com.miui.tsmclient.model.mitsm.k.a().b(cardInfo2, r15);
                                        r2 = r3;
                                    } else {
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r17 = r13;
                                        r16 = string;
                                        r14 = r13;
                                        r2 = r14;
                                    }
                                    return new BaseResponse(i, r2, new Object[0]);
                                } catch (r.a e4) {
                                    e = e4;
                                    r11 = InstallDoorCard;
                                    int iA2 = e.a();
                                    String message = e.getMessage();
                                    LogUtils.e("issue failed with an tsmapi exception.", e);
                                    if (r11 == 0 || !r11.getBoolean(str)) {
                                        i = iA2;
                                        r3 = message;
                                        r15 = string;
                                        com.miui.tsmclient.model.mitsm.k.a().b(cardInfo2, r15);
                                        r2 = r3;
                                    } else {
                                        i = iA2;
                                        r2 = message;
                                    }
                                    return new BaseResponse(i, r2, new Object[0]);
                                } catch (Throwable th3) {
                                    th = th3;
                                    r10 = InstallDoorCard;
                                    if (r10 == 0 || !r10.getBoolean(str)) {
                                        com.miui.tsmclient.model.mitsm.k.a().b(cardInfo2, string);
                                    }
                                    throw th;
                                }
                            }
                        } catch (NfcEeIOException e5) {
                            e = e5;
                            r13 = "";
                            string = aVar;
                            str = com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH;
                            InstallDoorCard = bundle;
                            cardInfo2 = cardInfo;
                        } catch (IOException e6) {
                            e = e6;
                            r13 = "";
                            string = aVar;
                            str = com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH;
                            InstallDoorCard = bundle;
                            cardInfo2 = cardInfo;
                        } catch (InterruptedException e7) {
                            e = e7;
                            r13 = "";
                            string = aVar;
                            str = com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH;
                            InstallDoorCard = bundle;
                            cardInfo2 = cardInfo;
                        } catch (r.a e8) {
                            e = e8;
                            string = aVar;
                            str = com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH;
                            InstallDoorCard = bundle;
                            cardInfo2 = cardInfo;
                        } catch (Throwable th4) {
                            th = th4;
                            string = aVar;
                            str = com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH;
                            InstallDoorCard = bundle;
                            cardInfo2 = cardInfo;
                        }
                    }
                    a(context, cardInfo, InstallDoorCard.getAid(), str2, true);
                    BaseResponse baseResponse2 = new BaseResponse(0, new Object[0]);
                    if (bundle == null || !bundle.getBoolean(com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                        com.miui.tsmclient.model.mitsm.k.a().b(cardInfo, aVar);
                    }
                    return baseResponse2;
                } catch (NfcEeIOException e9) {
                    e = e9;
                } catch (IOException e10) {
                    e = e10;
                } catch (InterruptedException e11) {
                    e = e11;
                } catch (r.a e12) {
                    e = e12;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (NfcEeIOException e13) {
            e = e13;
            r13 = "";
            string = aVar;
            str = com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH;
            r11 = bundle;
            cardInfo2 = cardInfo;
        } catch (IOException e14) {
            e = e14;
            r13 = "";
            string = aVar;
            str = com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH;
            r11 = bundle;
            cardInfo2 = cardInfo;
        } catch (InterruptedException e15) {
            e = e15;
            r13 = "";
            string = aVar;
            str = com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH;
            r11 = bundle;
            cardInfo2 = cardInfo;
        } catch (r.a e16) {
            e = e16;
            string = aVar;
            str = com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH;
            r11 = bundle;
            cardInfo2 = cardInfo;
        } catch (Throwable th6) {
            th = th6;
            string = aVar;
            str = com.miui.tsmclient.model.mitsm.f.EXTRAS_KEY_SESSION_NOT_FINISH;
            r10 = bundle;
            cardInfo2 = cardInfo;
        }
    }

    public BaseResponse a(Context context) {
        String message;
        int errorCode;
        try {
            b1t b1tVar = new b1t(context, "PROPRIETARY");
            b1t.b bVar = (b1t.b) HttpClient.getInstance(context).execute(b1tVar).getResult();
            if (b1tVar.isSuccess()) {
                return new BaseResponse(0, bVar.a().f());
            }
            if (bVar != null) {
                errorCode = bVar.getErrorCode();
                message = bVar.getErrorDesc();
            } else {
                message = "";
                errorCode = 3;
            }
            return new BaseResponse(errorCode, message, new Object[0]);
        } catch (IOException e) {
            message = e.getMessage();
            errorCode = 2;
        }
    }

    public final MifareCardInfo[] a(ProprietaryCarKeyCardInfo... proprietaryCarKeyCardInfoArr) {
        ArrayList arrayList = new ArrayList();
        for (ProprietaryCarKeyCardInfo proprietaryCarKeyCardInfo : proprietaryCarKeyCardInfoArr) {
            arrayList.add(proprietaryCarKeyCardInfo.transformToMifareCardInfo());
        }
        return (MifareCardInfo[]) arrayList.toArray(new MifareCardInfo[proprietaryCarKeyCardInfoArr.length]);
    }

    public BaseResponse a(Context context, ProprietaryCarKeyCardInfo... proprietaryCarKeyCardInfoArr) {
        int iA;
        String message = "";
        try {
            TsmRpcModels.CommonResponse commonResponseUpdateMifareCard = this.mSeiTsmAuthManager.updateMifareCard(context, a(proprietaryCarKeyCardInfoArr));
            if (commonResponseUpdateMifareCard == null) {
                iA = -1;
            } else {
                int iA2 = com.miui.tsmclient.model.mitsm.h.a(commonResponseUpdateMifareCard.getResult());
                message = commonResponseUpdateMifareCard.getErrorDesc();
                LogUtils.d("update traditional card info result: " + iA2);
                iA = iA2;
            }
            if (proprietaryCarKeyCardInfoArr != null && proprietaryCarKeyCardInfoArr.length == 1) {
                ProprietaryCarKeyCardInfo proprietaryCarKeyCardInfo = proprietaryCarKeyCardInfoArr[0];
                a(context, proprietaryCarKeyCardInfo, proprietaryCarKeyCardInfo.mAid, proprietaryCarKeyCardInfo.getProductId(), false);
            }
        } catch (IOException e) {
            LogUtils.e("update failed with an io exception.", e);
            iA = 2;
        } catch (r.a e2) {
            LogUtils.e("failed to update mifare card info", e2);
            iA = e2.a();
            message = e2.getMessage();
        }
        return new BaseResponse(iA, message, new Object[0]);
    }

    public final void a(Context context, CardInfo cardInfo, String str, String str2, boolean z) throws r.a, IOException {
        a(context, (ProprietaryCarKeyCardInfo) cardInfo, this.mSeiTsmAuthManager.queryDoorCardInfoByAid(context, str, 5, str2));
        if (z) {
            notifyCardInfoChanged(context, cardInfo);
        }
    }

    public static void a(Context context, ProprietaryCarKeyCardInfo proprietaryCarKeyCardInfo, TsmRpcModels.DoorCardInfo doorCardInfo) {
        if (doorCardInfo != null) {
            proprietaryCarKeyCardInfo.mAid = doorCardInfo.getAid();
            if (proprietaryCarKeyCardInfo.mCardArt == null) {
                proprietaryCarKeyCardInfo.mCardArt = doorCardInfo.getCardArt();
            }
            proprietaryCarKeyCardInfo.mVCStatus = doorCardInfo.getVcStatus();
            proprietaryCarKeyCardInfo.setVcUid(doorCardInfo.getVcUid());
            proprietaryCarKeyCardInfo.setCid(doorCardInfo.getCid());
            proprietaryCarKeyCardInfo.setUIName(TextUtils.isEmpty(doorCardInfo.getName()) ? ResUtils.getString(context, "entrance_card_name_home") : doorCardInfo.getName());
            proprietaryCarKeyCardInfo.mCardName = TextUtils.isEmpty(doorCardInfo.getName()) ? ResUtils.getString(context, "entrance_card_name_home") : doorCardInfo.getName();
            proprietaryCarKeyCardInfo.mFingerAuthFlag = doorCardInfo.getFingerFlag();
            proprietaryCarKeyCardInfo.setProductId(doorCardInfo.getProductId());
            proprietaryCarKeyCardInfo.setSupportPersonalArt(doorCardInfo.getSupportPersonalArt());
            proprietaryCarKeyCardInfo.setProductName(doorCardInfo.getProductName());
            proprietaryCarKeyCardInfo.setCustomizable(doorCardInfo.getCustomizable());
        }
    }
}
