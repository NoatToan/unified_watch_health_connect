package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class om5 {
    public static byte[] a(s7r s7rVar) {
        if (s7rVar == null) {
            return null;
        }
        try {
            return dsf.i(s7rVar);
        } catch (Exception e) {
            Logger.e("DataParser", "getDataByWearPacket exception:" + e);
            return null;
        }
    }

    public static s7r b(byte[] bArr) {
        try {
            return s7r.L(bArr);
        } catch (InvalidProtocolBufferNanoException | NullPointerException e) {
            Logger.e("DataParser", "parse packet exception:" + e);
            return null;
        }
    }
}
