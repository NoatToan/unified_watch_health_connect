package defpackage;

import com.nimbusds.jose.util.IntegerOverflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class k {
    public static byte[] a(byte[] bArr) throws IntegerOverflowException {
        return ByteBuffer.allocate(8).putLong(y73.e(bArr)).array();
    }
}
