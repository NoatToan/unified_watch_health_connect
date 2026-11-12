package com.miui.tsmclient.model.mitsm;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.terminal.IScTerminal;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import defpackage.pas;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pas f10385a = new pas();

    public final BaseResponse a(Context context, IScTerminal iScTerminal, TsmRpcModels.TsmSessionInfo tsmSessionInfo, TsmRpcModels.TsmAPDUCommand tsmAPDUCommand) throws r.a, InterruptedException, IOException {
        List<TsmRpcModels.TsmCAPDU> apdusList = tsmAPDUCommand.getApdusList();
        if (apdusList == null || apdusList.isEmpty()) {
            throw new r.a(tsmAPDUCommand.getResult(), "capdu list is null,\u3000errorCode:" + tsmAPDUCommand.getResult());
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (TsmRpcModels.TsmCAPDU tsmCAPDU : apdusList) {
            ScResponse scResponseTransmit = iScTerminal.transmit(tsmCAPDU.getApdu().toByteArray());
            i++;
            arrayList.add(TsmRpcModels.SeAPDUResponseItem.newBuilder().setIndex(i).setResponseData(ByteString.copyFrom(scResponseTransmit.getData().toBytes())).setResponseSw(ByteString.copyFrom(scResponseTransmit.getStatus().toBytes())).build());
            if (TextUtils.isEmpty(tsmCAPDU.getExpectSwRegex())) {
                LogUtils.d("no expected sw.");
                break;
            }
        }
        TsmRpcModels.TsmAPDUCommand tsmAPDUCommandC = this.f10385a.c(context, tsmSessionInfo, arrayList);
        if (tsmAPDUCommandC == null) {
            LogUtils.d("can not get next apdu command, process se response failed.");
            return new BaseResponse(8, new Object[0]);
        }
        int result = tsmAPDUCommandC.getResult();
        if (result != 0) {
            throw new r.a(result, "processSeResponse api returned an error, errorCode:" + result);
        }
        if (tsmAPDUCommandC.getApdusList() != null && !tsmAPDUCommandC.getApdusList().isEmpty()) {
            return a(context, iScTerminal, tsmSessionInfo, tsmAPDUCommandC);
        }
        LogUtils.d("no more apdu, execte finished!");
        return new BaseResponse(0, new Object[0]);
    }

    public TsmRpcModels.TsmSessionInfo a(Context context, CardInfo cardInfo) throws r.a, IOException {
        TsmRpcModels.TsmSessionInfo tsmSessionInfoD = this.f10385a.d(context, cardInfo);
        if (tsmSessionInfoD == null) {
            throw new r.a(7, "cannot get a session to start operation.");
        }
        if (tsmSessionInfoD.getResult() == 0) {
            LogUtils.d("sessionInfo : " + tsmSessionInfoD.getSessionId());
            return tsmSessionInfoD;
        }
        throw new r.a(tsmSessionInfoD.getResult(), "getSession failed, errorCode:" + tsmSessionInfoD.getResult());
    }

    public BaseResponse a(Context context, Bundle bundle) throws r.a, InterruptedException, IOException {
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        TsmRpcModels.TsmSessionInfo tsmSessionInfoA = a(context, cardInfo);
        TsmRpcModels.TsmAPDUCommand tsmAPDUCommandB = this.f10385a.b(context, tsmSessionInfoA, TsmRpcModels.SeOperationType.UNRESTRICT, null, bundle);
        if (tsmAPDUCommandB == null) {
            throw new r.a(8, "unRestrict ese failed, no apdu commands");
        }
        int result = tsmAPDUCommandB.getResult();
        if (result != 0) {
            throw new r.a(result, "unRestrict ese failed, errorCode: " + result);
        }
        IScTerminal terminal = cardInfo.getTerminal();
        try {
            terminal.open();
            return a(context, terminal, tsmSessionInfoA, tsmAPDUCommandB);
        } finally {
            terminal.close();
        }
    }
}
