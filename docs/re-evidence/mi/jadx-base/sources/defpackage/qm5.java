package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes7.dex */
public class qm5 {
    public static u7r a(byte[] bArr) {
        try {
            return u7r.y(bArr);
        } catch (InvalidProtocolBufferNanoException | NullPointerException e) {
            mr2.b("DataParser", "parse packet exception:" + e);
            return null;
        }
    }

    public static u7r b(byte[] bArr) {
        try {
            return u7r.y(bArr);
        } catch (InvalidProtocolBufferNanoException e) {
            e.printStackTrace();
            return null;
        }
    }
}
