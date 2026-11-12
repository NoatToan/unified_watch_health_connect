package defpackage;

import com.xiaomi.fitness.common.log.Logger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes7.dex */
public class e6f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Integer> f16311a = new HashMap();

    public static void a(String str) {
        f16311a.remove(str);
    }

    public static Queue<byte[]> b(z5f.c cVar) {
        if (cVar.c == null) {
            Logger.w("MassDataSplitter", "empty data, should not be split");
            return null;
        }
        if (cVar.d >= 4) {
            return c(cVar);
        }
        Logger.w("MassDataSplitter", "segmentSize should greater than 4");
        return null;
    }

    public static Queue<byte[]> c(z5f.c cVar) {
        int i = cVar.d - 4;
        int length = cVar.c.length;
        short sCeil = (short) Math.ceil(length / (i * 1.0f));
        int i2 = length - ((sCeil - 1) * i);
        Integer num = f16311a.get(cVar.f40912b);
        int iIntValue = num == null ? 0 : num.intValue();
        LinkedList linkedList = new LinkedList();
        short s = 1;
        while (s <= sCeil) {
            int i3 = s == sCeil ? i2 : i;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3 + 4).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.putShort((short) cVar.p);
            int i4 = iIntValue + s;
            byteBufferOrder.putShort((short) i4);
            byteBufferOrder.put(cVar.c, (s - 1) * i, i3);
            linkedList.add(byteBufferOrder.array());
            Logger.i("MassDataSplitter", "startSplit: index = " + i4 + ", totalsegmentsize = " + cVar.p);
            s = (short) (s + 1);
        }
        int i5 = sCeil + iIntValue;
        f16311a.put(cVar.f40912b, Integer.valueOf(i5));
        cVar.f40914r = iIntValue;
        Logger.d("MassDataSplitter", "split data, lastDataLength = " + i2 + "lastIndex = " + iIntValue + " dataLen = " + length + " segmentSize = " + i5);
        return linkedList;
    }
}
