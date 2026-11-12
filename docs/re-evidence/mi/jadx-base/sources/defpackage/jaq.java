package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class jaq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f22599b;

    public jaq(int i, byte[] bArr) {
        this.f22598a = i;
        this.f22599b = bArr;
    }

    public int a() {
        return CodedOutputByteBufferNano.p(this.f22598a) + this.f22599b.length;
    }

    public void b(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.g0(this.f22598a);
        codedOutputByteBufferNano.c0(this.f22599b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jaq)) {
            return false;
        }
        jaq jaqVar = (jaq) obj;
        return this.f22598a == jaqVar.f22598a && Arrays.equals(this.f22599b, jaqVar.f22599b);
    }

    public int hashCode() {
        return ((527 + this.f22598a) * 31) + Arrays.hashCode(this.f22599b);
    }
}
