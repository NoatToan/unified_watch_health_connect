package com.xiaomi.fitness.nfc.sdk;

import android.content.Context;
import com.tsmclient.smartcard.terminal.external.IChannel;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.nfc.bean.NfcResponse;
import defpackage.ssg;
import defpackage.vqg;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class ChannelImpl implements IChannel {
    public static boolean isTransferOutOption = false;
    public int SEND_SIZE = 0;
    public int RESP_SIZE = 0;

    public ChannelImpl(Context context) {
    }

    @Override // com.tsmclient.smartcard.terminal.external.IChannel
    public void close() throws InterruptedException, IOException {
        vqg.d("-------------------- channel close ----------------------");
        this.SEND_SIZE = 0;
        this.RESP_SIZE = 0;
        try {
            ssg.u().c(SportReportBaseParser.ReportType.divingOTU, null);
        } catch (IOException e) {
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    @Override // com.tsmclient.smartcard.terminal.external.IChannel
    public void open() throws InterruptedException, IOException {
        this.SEND_SIZE = 0;
        this.RESP_SIZE = 0;
        vqg.d("-------------------- channel open ----------------------");
        try {
            ssg.u().c(192, null);
        } catch (IOException e) {
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    @Override // com.tsmclient.smartcard.terminal.external.IChannel
    public byte[] transceive(byte[] bArr) throws InterruptedException, IOException {
        NfcResponse nfcResponseC;
        this.SEND_SIZE += bArr == null ? 0 : bArr.length;
        try {
            nfcResponseC = ssg.u().c(SportReportBaseParser.ReportType.divingCNS, bArr);
        } catch (IOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            e3.printStackTrace();
            nfcResponseC = null;
        }
        int i = this.RESP_SIZE;
        byte[] bArr2 = nfcResponseC.mData;
        this.RESP_SIZE = i + (bArr2 != null ? bArr2.length : 0);
        return bArr2;
    }
}
