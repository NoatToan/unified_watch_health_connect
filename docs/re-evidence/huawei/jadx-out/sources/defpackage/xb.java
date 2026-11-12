package defpackage;

import com.fasterxml.jackson.core.SerializableString;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class xb implements SerializableString, Serializable {
    private static final wy h = wy.d();
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected char[] f52674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected byte[] f52675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f52676c;
    protected transient String d;
    protected byte[] e;

    public xb(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f52676c = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.d = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.f52676c);
    }

    protected Object readResolve() {
        return new xb(this.d);
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final String getValue() {
        return this.f52676c;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final int charLength() {
        return this.f52676c.length();
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final char[] asQuotedChars() {
        char[] cArr = this.f52674a;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrB = h.b(this.f52676c);
        this.f52674a = cArrB;
        return cArrB;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final byte[] asQuotedUTF8() {
        byte[] bArr = this.e;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrC = h.c(this.f52676c);
        this.e = bArrC;
        return bArrC;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this.f52675b;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrD = h.d(this.f52676c);
        this.f52675b = bArrD;
        return bArrD;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendQuoted(char[] cArr, int i) {
        char[] cArrB = this.f52674a;
        if (cArrB == null) {
            cArrB = h.b(this.f52676c);
            this.f52674a = cArrB;
        }
        int length = cArrB.length;
        if (i + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArrB, 0, cArr, i, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendQuotedUTF8(byte[] bArr, int i) {
        byte[] bArrC = this.e;
        if (bArrC == null) {
            bArrC = h.c(this.f52676c);
            this.e = bArrC;
        }
        int length = bArrC.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrC, 0, bArr, i, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendUnquoted(char[] cArr, int i) {
        String str = this.f52676c;
        int length = str.length();
        if (i + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendUnquotedUTF8(byte[] bArr, int i) {
        byte[] bArrD = this.f52675b;
        if (bArrD == null) {
            bArrD = h.d(this.f52676c);
            this.f52675b = bArrD;
        }
        int length = bArrD.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrD, 0, bArr, i, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int writeQuotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArrC = this.e;
        if (bArrC == null) {
            bArrC = h.c(this.f52676c);
            this.e = bArrC;
        }
        int length = bArrC.length;
        outputStream.write(bArrC, 0, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int writeUnquotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArrD = this.f52675b;
        if (bArrD == null) {
            bArrD = h.d(this.f52676c);
            this.f52675b = bArrD;
        }
        int length = bArrD.length;
        outputStream.write(bArrD, 0, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int putQuotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArrC = this.e;
        if (bArrC == null) {
            bArrC = h.c(this.f52676c);
            this.e = bArrC;
        }
        int length = bArrC.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrC, 0, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int putUnquotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArrD = this.f52675b;
        if (bArrD == null) {
            bArrD = h.d(this.f52676c);
            this.f52675b = bArrD;
        }
        int length = bArrD.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrD, 0, length);
        return length;
    }

    public final String toString() {
        return this.f52676c;
    }

    public final int hashCode() {
        return this.f52676c.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f52676c.equals(((xb) obj).f52676c);
    }
}
