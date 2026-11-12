package org.apache.commons.io;

import com.google.firebase.messaging.l;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteOrderParser {
    private ByteOrderParser() {
    }

    public static ByteOrder parseByteOrder(String str) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        if (byteOrder.toString().equals(str)) {
            return byteOrder;
        }
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        if (byteOrder2.toString().equals(str)) {
            return byteOrder2;
        }
        l.k(str, "Unsupported byte order setting: ", ", expected one of ", byteOrder2, ", ", byteOrder);
        return null;
    }
}
