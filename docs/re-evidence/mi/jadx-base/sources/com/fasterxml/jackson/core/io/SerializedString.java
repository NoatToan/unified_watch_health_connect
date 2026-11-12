package com.fasterxml.jackson.core.io;

import defpackage.owl;
import defpackage.y53;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class SerializedString implements owl, Serializable {
    private static final long serialVersionUID = 1;
    protected transient String _jdkSerializeValue;
    protected char[] _quotedChars;
    protected byte[] _quotedUTF8Ref;
    protected byte[] _unquotedUTF8Ref;
    protected final String _value;

    public SerializedString(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this._value = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this._jdkSerializeValue = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this._value);
    }

    public int appendQuoted(char[] cArr, int i) {
        char[] cArrD = this._quotedChars;
        if (cArrD == null) {
            cArrD = y53.d(this._value);
            this._quotedChars = cArrD;
        }
        int length = cArrD.length;
        if (i + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArrD, 0, cArr, i, length);
        return length;
    }

    @Override // defpackage.owl
    public int appendQuotedUTF8(byte[] bArr, int i) {
        byte[] bArrE = this._quotedUTF8Ref;
        if (bArrE == null) {
            bArrE = y53.e(this._value);
            this._quotedUTF8Ref = bArrE;
        }
        int length = bArrE.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrE, 0, bArr, i, length);
        return length;
    }

    public int appendUnquoted(char[] cArr, int i) {
        String str = this._value;
        int length = str.length();
        if (i + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i);
        return length;
    }

    public int appendUnquotedUTF8(byte[] bArr, int i) {
        byte[] bArrA = this._unquotedUTF8Ref;
        if (bArrA == null) {
            bArrA = y53.a(this._value);
            this._unquotedUTF8Ref = bArrA;
        }
        int length = bArrA.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrA, 0, bArr, i, length);
        return length;
    }

    @Override // defpackage.owl
    public final char[] asQuotedChars() {
        char[] cArr = this._quotedChars;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrD = y53.d(this._value);
        this._quotedChars = cArrD;
        return cArrD;
    }

    @Override // defpackage.owl
    public final byte[] asQuotedUTF8() {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrE = y53.e(this._value);
        this._quotedUTF8Ref = bArrE;
        return bArrE;
    }

    @Override // defpackage.owl
    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrA = y53.a(this._value);
        this._unquotedUTF8Ref = bArrA;
        return bArrA;
    }

    public final int charLength() {
        return this._value.length();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((SerializedString) obj)._value);
    }

    @Override // defpackage.owl
    public final String getValue() {
        return this._value;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    public int putQuotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArrE = this._quotedUTF8Ref;
        if (bArrE == null) {
            bArrE = y53.e(this._value);
            this._quotedUTF8Ref = bArrE;
        }
        int length = bArrE.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrE, 0, length);
        return length;
    }

    public int putUnquotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArrA = this._unquotedUTF8Ref;
        if (bArrA == null) {
            bArrA = y53.a(this._value);
            this._unquotedUTF8Ref = bArrA;
        }
        int length = bArrA.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrA, 0, length);
        return length;
    }

    public Object readResolve() {
        return new SerializedString(this._jdkSerializeValue);
    }

    public final String toString() {
        return this._value;
    }

    public int writeQuotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArrE = this._quotedUTF8Ref;
        if (bArrE == null) {
            bArrE = y53.e(this._value);
            this._quotedUTF8Ref = bArrE;
        }
        int length = bArrE.length;
        outputStream.write(bArrE, 0, length);
        return length;
    }

    public int writeUnquotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArrA = this._unquotedUTF8Ref;
        if (bArrA == null) {
            bArrA = y53.a(this._value);
            this._unquotedUTF8Ref = bArrA;
        }
        int length = bArrA.length;
        outputStream.write(bArrA, 0, length);
        return length;
    }
}
