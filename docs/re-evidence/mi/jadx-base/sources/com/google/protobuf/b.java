package com.google.protobuf;

import com.google.protobuf.b;
import com.google.protobuf.b.a;
import defpackage.ree;
import defpackage.t8i;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements q0 {
    protected int memoizedHashCode = 0;

    public static abstract class a<MessageType extends b<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements q0.a {
        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t);
            }
        }

        private String getReadingExceptionMessage(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        public static UninitializedMessageException newUninitializedMessageException(q0 q0Var) {
            return new UninitializedMessageException(q0Var);
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo144clone();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        public boolean mergeDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            int i = inputStream.read();
            if (i == -1) {
                return false;
            }
            mo160mergeFrom((InputStream) new C0259a(inputStream, j.C(i, inputStream)), tVar);
            return true;
        }

        @Override // com.google.protobuf.q0.a
        public abstract BuilderType mergeFrom(j jVar, t tVar) throws IOException;

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            d0.a(iterable);
            if (!(iterable instanceof ree)) {
                if (iterable instanceof t8i) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    addAllCheckingNulls(iterable, list);
                    return;
                }
            }
            List<?> underlyingElements = ((ree) iterable).getUnderlyingElements();
            ree reeVar = (ree) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (reeVar.size() - size) + " is null.";
                    for (int size2 = reeVar.size() - 1; size2 >= size; size2--) {
                        reeVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    reeVar.n((ByteString) obj);
                } else {
                    reeVar.add((String) obj);
                }
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.b$a$a, reason: collision with other inner class name */
        public static final class C0259a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f9604a;

            public C0259a(InputStream inputStream, int i) {
                super(inputStream);
                this.f9604a = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f9604a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f9604a <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f9604a--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.f9604a));
                if (jSkip >= 0) {
                    this.f9604a = (int) (((long) this.f9604a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f9604a;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.f9604a -= i4;
                }
                return i4;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, t.c());
        }

        @Override // 
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType mo158mergeFrom(j jVar) throws IOException {
            return (BuilderType) mergeFrom(jVar, t.c());
        }

        public BuilderType mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                j jVarNewCodedInput = byteString.newCodedInput();
                mo158mergeFrom(jVarNewCodedInput);
                jVarNewCodedInput.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        public BuilderType mergeFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
            try {
                j jVarNewCodedInput = byteString.newCodedInput();
                mergeFrom(jVarNewCodedInput, tVar);
                jVarNewCodedInput.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        @Override // com.google.protobuf.q0.a
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) mo154mergeFrom(bArr, 0, bArr.length);
        }

        @Override // 
        /* JADX INFO: renamed from: mergeFrom */
        public BuilderType mo154mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                j jVarL = j.l(bArr, i, i2);
                mo158mergeFrom(jVarL);
                jVarL.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // 
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType mo161mergeFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
            return (BuilderType) mo155mergeFrom(bArr, 0, bArr.length, tVar);
        }

        @Override // 
        /* JADX INFO: renamed from: mergeFrom */
        public BuilderType mo155mergeFrom(byte[] bArr, int i, int i2, t tVar) throws InvalidProtocolBufferException {
            try {
                j jVarL = j.l(bArr, i, i2);
                mergeFrom(jVarL, tVar);
                jVarL.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        @Override // 
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType mo159mergeFrom(InputStream inputStream) throws IOException {
            j jVarG = j.g(inputStream);
            mo158mergeFrom(jVarG);
            jVarG.a(0);
            return this;
        }

        @Override // 
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType mo160mergeFrom(InputStream inputStream, t tVar) throws IOException {
            j jVarG = j.g(inputStream);
            mergeFrom(jVarG, tVar);
            jVarG.a(0);
            return this;
        }

        @Override // com.google.protobuf.q0.a
        public BuilderType mergeFrom(q0 q0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(q0Var)) {
                return (BuilderType) internalMergeFrom((b) q0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        a.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(e1 e1Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iD = e1Var.d(this);
        setMemoizedSerializedSize(iD);
        return iD;
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.q0
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamI0 = CodedOutputStream.i0(bArr);
            writeTo(codedOutputStreamI0);
            codedOutputStreamI0.d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // com.google.protobuf.q0
    public ByteString toByteString() {
        try {
            ByteString.h hVarNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(hVarNewCodedBuilder.b());
            return hVarNewCodedBuilder.a();
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream codedOutputStreamH0 = CodedOutputStream.h0(outputStream, CodedOutputStream.K(CodedOutputStream.M(serializedSize) + serializedSize));
        codedOutputStreamH0.P0(serializedSize);
        writeTo(codedOutputStreamH0);
        codedOutputStreamH0.e0();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamH0 = CodedOutputStream.h0(outputStream, CodedOutputStream.K(getSerializedSize()));
        writeTo(codedOutputStreamH0);
        codedOutputStreamH0.e0();
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        a.addAll((Iterable) iterable, (List) list);
    }
}
