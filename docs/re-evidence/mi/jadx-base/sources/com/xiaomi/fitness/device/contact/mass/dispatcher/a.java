package com.xiaomi.fitness.device.contact.mass.dispatcher;

import com.xiaomi.fitness.common.log.Logger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Integer> f11897a = new HashMap();

    public static void a(String str) {
        f11897a.remove(str);
    }

    public static Queue<byte[]> b(MassDataDispatcher.b bVar) {
        if (bVar.c == null) {
            Logger.w("MassDataSplitter", "empty data, should not be split");
            return null;
        }
        if (bVar.d >= 4) {
            return c(bVar);
        }
        Logger.w("MassDataSplitter", "segmentSize should greater than 4");
        return null;
    }

    public static Queue<byte[]> c(MassDataDispatcher.b bVar) {
        int i = bVar.d - 4;
        int length = bVar.c.length;
        short sCeil = (short) Math.ceil(length / (i * 1.0f));
        int i2 = length - ((sCeil - 1) * i);
        Integer num = f11897a.get(bVar.f11894b);
        int iIntValue = num == null ? 0 : num.intValue();
        LinkedList linkedList = new LinkedList();
        short s = 1;
        while (s <= sCeil) {
            int i3 = s == sCeil ? i2 : i;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3 + 4).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.putShort((short) bVar.p);
            byteBufferOrder.putShort((short) (iIntValue + s));
            byteBufferOrder.put(bVar.c, (s - 1) * i, i3);
            linkedList.add(byteBufferOrder.array());
            s = (short) (s + 1);
        }
        int i4 = sCeil + iIntValue;
        f11897a.put(bVar.f11894b, Integer.valueOf(i4));
        bVar.f11896r = iIntValue;
        Logger.d("MassDataSplitter", "split data, lastDataLength = " + i2 + "lastIndex = " + iIntValue + " dataLen = " + length + " segmentSize = " + i4);
        return linkedList;
    }
}
