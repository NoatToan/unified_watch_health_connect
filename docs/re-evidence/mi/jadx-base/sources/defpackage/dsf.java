package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dsf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f15887a = -1;

    public static final <T extends dsf> T f(T t, byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (T) g(t, bArr, 0, bArr.length);
    }

    public static final <T extends dsf> T g(T t, byte[] bArr, int i, int i2) throws InvalidProtocolBufferNanoException {
        try {
            o34 o34VarH = o34.h(bArr, i, i2);
            t.e(o34VarH);
            o34VarH.a(0);
            return t;
        } catch (InvalidProtocolBufferNanoException e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final void h(dsf dsfVar, byte[] bArr, int i, int i2) {
        try {
            CodedOutputByteBufferNano codedOutputByteBufferNanoK = CodedOutputByteBufferNano.K(bArr, i, i2);
            dsfVar.j(codedOutputByteBufferNanoK);
            codedOutputByteBufferNanoK.a();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final byte[] i(dsf dsfVar) {
        int iD = dsfVar.d();
        byte[] bArr = new byte[iD];
        h(dsfVar, bArr, 0, iD);
        return bArr;
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public dsf clone() throws CloneNotSupportedException {
        return (dsf) super.clone();
    }

    public int b() {
        return 0;
    }

    public int c() {
        if (this.f15887a < 0) {
            d();
        }
        return this.f15887a;
    }

    public int d() {
        int iB = b();
        this.f15887a = iB;
        return iB;
    }

    public abstract dsf e(o34 o34Var) throws IOException;

    public void j(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
    }

    public String toString() {
        return esf.d(this);
    }
}
