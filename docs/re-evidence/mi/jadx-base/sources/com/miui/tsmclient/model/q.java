package com.miui.tsmclient.model;

import android.content.Context;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.terminal.IScTerminal;
import defpackage.b4s;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class q extends com.miui.tsmclient.model.mitsm.f {
    public final BaseResponse a(Context context, TsmRpcModels.TsmStartActionResponse tsmStartActionResponse) {
        int iA;
        String str;
        Throwable th;
        IScTerminal terminal = new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal();
        TsmRpcModels.TsmSessionInfo tsmSessionInfoBuild = TsmRpcModels.TsmSessionInfo.newBuilder().setResult(tsmStartActionResponse.getResult()).setSessionId(tsmStartActionResponse.getSessionId()).setErrorDesc(tsmStartActionResponse.getErrorDesc()).build();
        TsmRpcModels.TsmAPDUCommand apduCommand = tsmStartActionResponse.getApduCommand();
        String message = "";
        try {
            try {
                terminal.open();
                BaseResponse baseResponseExecuteCapdu = executeCapdu(context, terminal, tsmSessionInfoBuild, apduCommand);
                terminal.close();
                return baseResponseExecuteCapdu;
            } catch (IOException e) {
                str = "Push execute failed with an io exception.";
                iA = 2;
                th = e;
                LogUtils.e(str, th);
                terminal.close();
                return new BaseResponse(iA, message, new Object[0]);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                str = "Push execute is interrupted.";
                iA = 11;
                th = e2;
                LogUtils.e(str, th);
                terminal.close();
                return new BaseResponse(iA, message, new Object[0]);
            } catch (r.a e3) {
                iA = e3.a();
                message = e3.getMessage();
                str = "Push execute failed with an tsm api exception.";
                th = e3;
                LogUtils.e(str, th);
                terminal.close();
                return new BaseResponse(iA, message, new Object[0]);
            }
        } catch (Throwable th2) {
            terminal.close();
            throw th2;
        }
    }

    public BaseResponse a(Context context, TsmRpcModels.TsmPendingTask tsmPendingTask) {
        int iA;
        String message;
        try {
            TsmRpcModels.TsmStartActionResponse tsmStartActionResponseQueryInstruction = new b4s().queryInstruction(context, tsmPendingTask.getTaskId());
            if (tsmStartActionResponseQueryInstruction == null) {
                return new BaseResponse(3, "", new Object[0]);
            }
            iA = com.miui.tsmclient.model.mitsm.h.a(tsmStartActionResponseQueryInstruction.getResult());
            message = tsmStartActionResponseQueryInstruction.getErrorDesc();
            LogUtils.d("executeTask resultCode: " + iA + " resultMsg: " + message);
            if (iA == 0) {
                return a(context, tsmStartActionResponseQueryInstruction);
            }
            return new BaseResponse(iA, message, new Object[0]);
        } catch (r.a e) {
            iA = e.a();
            message = e.getMessage();
            LogUtils.e("executeTask throw exception", e);
        }
    }
}
