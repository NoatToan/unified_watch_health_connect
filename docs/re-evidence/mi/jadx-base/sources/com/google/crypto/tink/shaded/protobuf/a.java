package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.AbstractC0254a;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0254a<MessageType, BuilderType>> implements b0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0254a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0254a<MessageType, BuilderType>> implements b0.a {
        public static UninitializedMessageException f(b0 b0Var) {
            return new UninitializedMessageException(b0Var);
        }

        public abstract BuilderType b(MessageType messagetype);

        @Override // com.google.crypto.tink.shaded.protobuf.b0.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BuilderType o0(b0 b0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(b0Var)) {
                return (BuilderType) b((a) b0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.b0.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) e(bArr, 0, bArr.length);
        }

        public abstract BuilderType e(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;
    }

    public int b() {
        throw new UnsupportedOperationException();
    }

    public int c(k0 k0Var) {
        int iB = b();
        if (iB != -1) {
            return iB;
        }
        int iD = k0Var.d(this);
        f(iD);
        return iD;
    }

    public final String d(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public UninitializedMessageException e() {
        return new UninitializedMessageException(this);
    }

    public void f(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamE0 = CodedOutputStream.e0(bArr);
            a(codedOutputStreamE0);
            codedOutputStreamE0.d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(d("byte array"), e);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public ByteString toByteString() {
        try {
            ByteString.h hVarNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            a(hVarNewCodedBuilder.b());
            return hVarNewCodedBuilder.a();
        } catch (IOException e) {
            throw new RuntimeException(d("ByteString"), e);
        }
    }
}
