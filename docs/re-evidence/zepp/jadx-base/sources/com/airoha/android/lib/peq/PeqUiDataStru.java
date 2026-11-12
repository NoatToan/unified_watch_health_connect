package com.airoha.android.lib.peq;

import com.airoha.android.lib.util.Converter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PeqUiDataStru {
    private byte a;
    private byte[] b;
    private List<PeqBandInfo> c;

    public PeqUiDataStru(PeqBandInfo[] peqBandInfoArr) {
        this.a = (byte) 0;
        this.b = new byte[]{0, 0, 0, 0};
        this.c = Arrays.asList(peqBandInfoArr);
    }

    public double getMasterGain() {
        return ((double) Converter.bytesToInt32(this.b)) / 100.0d;
    }

    public List<PeqBandInfo> getPeqBandInfoList() {
        return this.c;
    }

    public byte[] getRaw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Byte.valueOf(this.a));
        for (byte b : this.b) {
            arrayList.add(Byte.valueOf(b));
        }
        Iterator<PeqBandInfo> it2 = this.c.iterator();
        while (it2.hasNext()) {
            for (byte b2 : it2.next().getRaw()) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        byte[] bArr = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            bArr[i] = ((Byte) arrayList.get(i)).byteValue();
        }
        return bArr;
    }

    public PeqUiDataStru(PeqBandInfo[] peqBandInfoArr, double d) {
        this.a = (byte) 0;
        this.b = new byte[]{0, 0, 0, 0};
        this.b = Converter.intToBytes((int) (d * 100.0d));
        this.c = Arrays.asList(peqBandInfoArr);
    }

    public PeqUiDataStru(byte[] bArr) {
        this.a = (byte) 0;
        this.b = new byte[]{0, 0, 0, 0};
        this.a = bArr[0];
        this.b = new byte[]{bArr[1], bArr[2], bArr[3], bArr[4]};
        this.c = new LinkedList();
        for (int i = 5; i < bArr.length; i += 18) {
            byte[] bArr2 = new byte[18];
            System.arraycopy(bArr, i, bArr2, 0, 18);
            this.c.add(new PeqBandInfo(bArr2));
        }
    }
}
