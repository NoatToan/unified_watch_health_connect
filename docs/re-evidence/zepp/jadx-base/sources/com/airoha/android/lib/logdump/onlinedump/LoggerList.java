package com.airoha.android.lib.logdump.onlinedump;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LoggerList<E> extends ArrayList<E> {
    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i, int i2) {
        super.removeRange(i, i2);
    }

    public byte[] subArray(int i, int i2, LoggerList<Byte> loggerList) {
        List<Byte> listSubList = loggerList.subList(i, i2);
        byte[] bArr = new byte[i2 - i];
        Iterator<Byte> it2 = listSubList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            bArr[i3] = it2.next().byteValue();
            i3++;
        }
        return bArr;
    }
}
