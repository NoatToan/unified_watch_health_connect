package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class n6t extends o6t {
    public n6t(o6t o6tVar) {
        super(o6tVar);
    }

    @Override // defpackage.o6t
    public final byte[] b(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date()));
        stringBuffer.append(" ");
        stringBuffer.append(UUID.randomUUID().toString());
        stringBuffer.append(" ");
        if (stringBuffer.length() != 53) {
            return new byte[0];
        }
        byte[] bArrN = p0t.n(stringBuffer.toString());
        byte[] bArr2 = new byte[bArrN.length + bArr.length];
        System.arraycopy(bArrN, 0, bArr2, 0, bArrN.length);
        System.arraycopy(bArr, 0, bArr2, bArrN.length, bArr.length);
        return bArr2;
    }
}
