package com.xiaomi.fitness.nfc.sdk;

import android.content.Context;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.external.IChannel;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.nfc.bean.NfcResponse;
import defpackage.ssg;
import defpackage.vqg;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class MasterCustomerChanelImpl implements IChannel {
    public static boolean isTransferOutOption = false;
    public int SEND_SIZE = 0;
    public int RESP_SIZE = 0;

    public MasterCustomerChanelImpl(Context context) {
    }

    public static byte[] toPrimitive(Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    @Override // com.tsmclient.smartcard.terminal.external.IChannel
    public void close() throws InterruptedException, IOException {
        vqg.a("all send size = " + this.SEND_SIZE + "， receive size = " + this.RESP_SIZE);
        vqg.a("--------------------Customer channel close ----------------------");
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
        vqg.a("--------------------Customer channel open ----------------------");
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
        this.SEND_SIZE += bArr == null ? 0 : bArr.length;
        vqg.d("request all data:" + Coder.bytesToHexString(bArr));
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (i < bArr.length) {
                for (int i2 = 0; i2 < 512 && i < bArr.length; i2++) {
                    arrayList2.add(Byte.valueOf(bArr[i]));
                    i++;
                }
                byte[] primitive = toPrimitive((Byte[]) arrayList2.toArray(new Byte[arrayList2.size()]));
                vqg.d("execute in data size:" + primitive.length);
                vqg.d("request part data:" + Coder.bytesToHexString(primitive));
                NfcResponse nfcResponseG = ssg.u().g(primitive);
                if (nfcResponseG.mStatus != 1) {
                    vqg.d("execute son data error");
                    throw new IOException("execute son data error");
                }
                for (byte b2 : nfcResponseG.mData) {
                    arrayList.add(Byte.valueOf(b2));
                }
                arrayList2.clear();
            }
        } catch (IOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            vqg.c("CustomerChannelImpl", e3);
            e3.printStackTrace();
        }
        this.RESP_SIZE += arrayList.size();
        byte[] primitive2 = toPrimitive((Byte[]) arrayList.toArray(new Byte[arrayList.size()]));
        vqg.d("response all data:" + Coder.bytesToHexString(primitive2));
        return primitive2;
    }
}
