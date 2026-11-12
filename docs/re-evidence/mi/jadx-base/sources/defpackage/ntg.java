package defpackage;

import com.xiaomi.mi_connect.nfc.exception.NfcParseActionRecordException;

/* JADX INFO: loaded from: classes11.dex */
public final class ntg implements uuc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28355b;
    public byte c;
    public byte d;
    public byte[] e;

    public ntg(short s, byte b2, byte b3, byte b4, byte[] bArr) {
        this.f28354a = s;
        this.f28355b = b2;
        this.c = b4;
        this.d = b3;
        this.e = bArr;
    }

    public static ntg b(byte[] bArr) throws NfcParseActionRecordException {
        byte[] bArr2;
        if (bArr.length < 5) {
            throw new NfcParseActionRecordException("invalidate action record");
        }
        short sA = fbm.a(bArr);
        byte b2 = bArr[2];
        byte b3 = bArr[3];
        byte b4 = bArr[4];
        int length = bArr.length - 5;
        if (length > 0) {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 5, bArr3, 0, length);
            bArr2 = bArr3;
        } else {
            bArr2 = null;
        }
        return new ntg(sA, b2, b4, b3, bArr2);
    }

    @Override // defpackage.uuc
    public <T extends uuc> T a(Class<T> cls) {
        if (cls.equals(ntg.class)) {
            return this;
        }
        return null;
    }
}
