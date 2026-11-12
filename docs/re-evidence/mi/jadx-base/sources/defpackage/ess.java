package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.mitsm.f;
import com.miui.tsmclient.model.mitsm.h;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.terminal.IScTerminal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import r.a;

/* JADX INFO: loaded from: classes2.dex */
public class ess extends f {
    public e2s d = new e2s();
    public c3t e = new ias();

    public BaseResponse a(Context context, CardInfo cardInfo) {
        BaseResponse baseResponse;
        try {
            return f.sNeedSync.get() ? syncEse(context, cardInfo, getSession(context, cardInfo, null), null) : new BaseResponse(0, new Object[0]);
        } catch (IOException e) {
            LogUtils.e("sync failed with an io exception.", e);
            baseResponse = new BaseResponse(-1, e.getMessage(), new Object[0]);
            return baseResponse;
        } catch (InterruptedException e2) {
            LogUtils.e("sync is interrupted.", e2);
            Thread.currentThread().interrupt();
            baseResponse = new BaseResponse(-1, e2.getMessage(), new Object[0]);
            return baseResponse;
        } catch (a e3) {
            LogUtils.e("sync failed with an tsmapi exception.", e3);
            baseResponse = new BaseResponse(-1, e3.getMessage(), new Object[0]);
            return baseResponse;
        }
    }

    public final BaseResponse b(Context context, IScTerminal iScTerminal, TsmRpcModels.TsmSessionInfo tsmSessionInfo, TsmRpcModels.TsmAPDUCommand tsmAPDUCommand, CarKeyCardInfo carKeyCardInfo) throws a, InterruptedException, IOException {
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
        TsmRpcModels.TsmAPDUCommand tsmAPDUCommandE = this.d.e(context, tsmSessionInfo, arrayList, carKeyCardInfo.getVehicleOEMId());
        if (tsmAPDUCommandE == null) {
            LogUtils.e("DigitalKey-MiDigitalKeyClient", "DigitalKey can not get nextApduCommand, processCCCSeResponse failed");
            return new BaseResponse(16, new Object[0]);
        }
        int iA = h.a(tsmAPDUCommandE.getResult());
        if (iA != 0) {
            LogUtils.e("DigitalKey-MiDigitalKeyClient", "DigitalKey executeCapdu failed");
            throw new a(iA, tsmAPDUCommandE.getErrorDesc());
        }
        if (tsmAPDUCommandE.getApdusList() != null && !tsmAPDUCommandE.getApdusList().isEmpty()) {
            return b(context, iScTerminal, tsmSessionInfo, tsmAPDUCommandE, carKeyCardInfo);
        }
        LogUtils.e("DigitalKey-MiDigitalKeyClient", "DigitalKey no more apdu, execute finished");
        return new BaseResponse(0, new Object[0]);
    }

    public BaseResponse c(Context context, String str) {
        return this.e.c(context, str);
    }

    public BaseResponse d(Context context, String str, CarKeyCardInfo carKeyCardInfo, String str2) throws a, InterruptedException, AuthApiException {
        TsmRpcModels.TsmStartActionResponse tsmStartActionResponseF = this.d.f(context, carKeyCardInfo, TsmRpcModels.SeOperationType.valueOf(str), carKeyCardInfo.getVehicleOEMId(), str2);
        if (tsmStartActionResponseF == null) {
            LogUtils.e("DigitalKey-MiDigitalKeyClient", "startCCCAction returns null");
            return new BaseResponse(1, new Object[0]);
        }
        int iA = h.a(tsmStartActionResponseF.getResult());
        if (iA != 0) {
            return new BaseResponse(iA, tsmStartActionResponseF.getErrorDesc(), new Object[0]);
        }
        try {
            BaseResponse baseResponseExecuteCapdu = executeCapdu(context, carKeyCardInfo, TsmRpcModels.TsmSessionInfo.newBuilder().setResult(tsmStartActionResponseF.getResult()).setSessionId(tsmStartActionResponseF.getSessionId()).setErrorDesc(tsmStartActionResponseF.getErrorDesc()).build(), tsmStartActionResponseF.getApduCommand());
            String aid = tsmStartActionResponseF.getApduCommand().getAid();
            baseResponseExecuteCapdu.mDatas = new Object[]{aid};
            LogUtils.d("DigitalKey-MiDigitalKeyClient", "invoke finished, result: " + baseResponseExecuteCapdu.mResultCode + ", aid = " + aid);
            return baseResponseExecuteCapdu;
        } catch (IOException e) {
            String message = e.getMessage();
            LogUtils.e("DigitalKey-MiDigitalKeyClient", "io exception occurs when processing apdu commands");
            return new BaseResponse(2, message, new Object[0]);
        }
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse delete(Context context, CardInfo cardInfo, Bundle bundle) {
        return this.e.b(context, cardInfo.getCardId());
    }

    public void e(Context context, CarKeyCardInfo carKeyCardInfo) throws IOException {
        this.e.a(context, carKeyCardInfo);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse executeCapdu(Context context, CardInfo cardInfo, TsmRpcModels.TsmSessionInfo tsmSessionInfo, TsmRpcModels.TsmAPDUCommand tsmAPDUCommand) throws a, InterruptedException, IOException {
        IScTerminal terminal = cardInfo.getTerminal();
        try {
            terminal.open();
            return b(context, terminal, tsmSessionInfo, tsmAPDUCommand, (CarKeyCardInfo) cardInfo);
        } finally {
            terminal.close();
        }
    }

    public BaseResponse f(Context context, String str) {
        return this.e.a(context, str);
    }

    public BaseResponse g(Context context, String str) {
        return this.e.d(context, str);
    }
}
