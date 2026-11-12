package com.xiaomi.fitness.nfc.sdk;

import android.text.TextUtils;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.external.CommandList;
import com.tsmclient.smartcard.terminal.external.IApduExecutor;
import com.tsmclient.smartcard.terminal.external.IChannel;
import com.tsmclient.smartcard.terminal.external.ResponseList;
import defpackage.bmg;
import defpackage.ssg;
import defpackage.vqg;
import defpackage.yrg;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class IApduExecutorImpl implements IApduExecutor {
    private ResponseList executeBatch(CommandList commandList) throws InterruptedException, IOException {
        ResponseList responseList = new ResponseList();
        vqg.d("IApduExecutorImpl start size = " + commandList.getList().size());
        yrg.a aVar = new yrg.a();
        aVar.c = new yrg[commandList.getList().size()];
        for (int i = 0; i < commandList.getList().size(); i++) {
            CommandList.Command command = commandList.getList().get(i);
            yrg yrgVar = new yrg();
            yrgVar.c = command.getApdu();
            yrgVar.d = command.getExpectStatus();
            aVar.c[i] = yrgVar;
        }
        vqg.a("IApduExecutorImpl send  apduSize = 0, statusSize = 0");
        try {
            yrg.a aVarX = ssg.u().x(aVar);
            int i2 = 0;
            while (true) {
                yrg[] yrgVarArr = aVarX.c;
                if (i2 >= yrgVarArr.length) {
                    break;
                }
                yrg yrgVar2 = yrgVarArr[i2];
                if (yrgVar2.d == null) {
                    yrgVar2.d = "";
                }
                ResponseList.Response response = new ResponseList.Response(yrgVar2.c, Coder.hexStringToBytes(yrgVar2.d));
                responseList.addResponse(response);
                if (TextUtils.isEmpty(commandList.getList().get(i2).getExpectStatus())) {
                    responseList.setFailed();
                    break;
                }
                if (!Pattern.compile(commandList.getList().get(i2).getExpectStatus()).matcher(Coder.bytesToHexString(response.getStatus())).matches()) {
                    responseList.setFailed();
                    break;
                }
                i2++;
            }
        } catch (IOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            vqg.c("IApduExecutorImpl error", e3);
        }
        vqg.a("IApduExecutorImpl resp  apduSize = 0, statusSize = 0");
        StringBuilder sb = new StringBuilder();
        sb.append("IApduExecutorImpl end   size = ");
        sb.append(responseList.getList().size());
        vqg.a(sb.toString());
        return responseList;
    }

    @Override // com.tsmclient.smartcard.terminal.external.IApduExecutor
    public ResponseList execute(IChannel iChannel, CommandList commandList) throws InterruptedException, IOException {
        if (commandList == null || commandList.getList() == null) {
            return new ResponseList();
        }
        int size = commandList.getList().size();
        vqg.d("IApduExecutorImpl commandList size=" + size);
        if (size <= 1) {
            return executeItem(iChannel, commandList);
        }
        boolean zC = bmg.c();
        vqg.d("IApduExecutorImpl isInit=" + zC);
        if (!zC) {
            int iT = ssg.u().t();
            vqg.d("IApduExecutorImpl capability=" + iT);
            bmg.b(iT);
        }
        boolean zD = bmg.d();
        vqg.d("IApduExecutorImpl capability=" + zD);
        return zD ? executeBatch(commandList) : executeItem(iChannel, commandList);
    }

    public ResponseList executeItem(IChannel iChannel, CommandList commandList) throws InterruptedException, IOException {
        ResponseList responseList = new ResponseList();
        for (CommandList.Command command : commandList.getList()) {
            byte[] bArrTransceive = iChannel.transceive(command.getApdu());
            if (bArrTransceive == null || bArrTransceive.length < 2) {
                throw new IOException("response length is illegal");
            }
            byte[] bArr = new byte[bArrTransceive.length - 2];
            System.arraycopy(bArrTransceive, 0, bArr, 0, bArrTransceive.length - 2);
            byte[] bArr2 = new byte[2];
            System.arraycopy(bArrTransceive, bArrTransceive.length - 2, bArr2, 0, 2);
            ResponseList.Response response = new ResponseList.Response(bArr, bArr2);
            responseList.addResponse(response);
            if (TextUtils.isEmpty(command.getExpectStatus())) {
                responseList.setFailed();
                break;
            }
            if (!Pattern.compile(command.getExpectStatus()).matcher(Coder.bytesToHexString(response.getStatus())).matches()) {
                responseList.setFailed();
                break;
            }
        }
        return responseList;
    }
}
