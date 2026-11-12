package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f31425a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f31426b = -1;
    public byte c = 0;
    public byte[] d = null;
    public boolean e = false;
    public byte[] f = null;

    public enum a {
        RESERVED((byte) 0),
        SUCCESS((byte) 1),
        INVALID_STATE((byte) 2),
        UNKNOW_COMMAND((byte) 3),
        OPERATION_FAILED((byte) 4),
        SPACE_INSUFFICIENT((byte) 15),
        DIAL_ID_UNDEFINED((byte) 16),
        DIAL_BUILT_IN((byte) 17);

        public byte t;

        a(byte b2) {
            this.t = b2;
        }

        public byte a() {
            return this.t;
        }
    }

    public static qe g(byte[] bArr) {
        return h(bArr, 1);
    }

    public static qe h(byte[] bArr, int i) {
        qe qeVar = new qe();
        qeVar.c(bArr, i);
        return qeVar;
    }

    public synchronized byte a() {
        return this.f31426b;
    }

    public synchronized void b(byte[] bArr) {
        c(bArr, 1);
    }

    public final synchronized void c(byte[] bArr, int i) {
        try {
            t5t.m("HMNotifyResponse", "from value:" + tet.x(bArr));
            this.e = true;
            if (bArr != null && bArr.length > 0) {
                byte[] bArr2 = new byte[bArr.length];
                this.f = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
            int i2 = i + 2;
            if (bArr != null && bArr.length >= i2) {
                this.f31425a = bArr[0];
                this.f31426b = bArr[1];
                this.c = bArr[i + 1];
                this.d = null;
                int length = bArr.length - i2;
                if (length > 0) {
                    byte[] bArr3 = new byte[length];
                    this.d = bArr3;
                    System.arraycopy(bArr, i2, bArr3, 0, length);
                }
                t5t.m("HMNotifyResponse", toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean d(byte b2) {
        return this.f31426b == b2 && this.c == a.SUCCESS.a();
    }

    public synchronized boolean e(byte b2, short s) {
        byte[] bArr = this.f;
        boolean z = false;
        if (bArr != null && bArr.length >= 5) {
            if ((bArr[0] & 255) == 16 && (bArr[1] & 255) == b2 && (bArr[2] & 255) == (s & 255) && (bArr[3] & 255) == ((s >> 8) & 255) && (bArr[4] & 255) == a.SUCCESS.a()) {
                z = true;
            }
            return z;
        }
        return false;
    }

    public synchronized byte f() {
        return this.c;
    }

    public synchronized byte[] i() {
        return this.d;
    }

    public synchronized byte[] j() {
        return this.f;
    }

    public synchronized boolean k() {
        return this.c == a.SUCCESS.a();
    }

    public synchronized String toString() {
        return "HMNotifyResponse{origin=" + tet.x(this.f) + ", flag=" + String.format("%02x ", Byte.valueOf(this.f31425a)) + ", cmd=" + String.format("%02x ", Byte.valueOf(this.f31426b)) + ", code=" + String.format("%02x ", Byte.valueOf(this.c)) + ", data=" + tet.x(this.d) + AbstractJsonLexerKt.END_OBJ;
    }
}
