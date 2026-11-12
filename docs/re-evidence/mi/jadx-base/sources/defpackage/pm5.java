package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes2.dex */
public class pm5 {
    public static t7r a(byte[] bArr) {
        try {
            return t7r.r(bArr);
        } catch (InvalidProtocolBufferNanoException | NullPointerException e) {
            mr2.b("DataParser", "parse packet exception:" + e);
            return null;
        }
    }
}
