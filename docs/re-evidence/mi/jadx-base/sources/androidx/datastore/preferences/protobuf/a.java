package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0030a;
import defpackage.see;
import defpackage.u8i;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0030a<MessageType, BuilderType>> implements b0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0030a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0030a<MessageType, BuilderType>> implements b0.a {
        public static <T> void b(Iterable<T> iterable, List<? super T> list) {
            s.a(iterable);
            if (!(iterable instanceof see)) {
                if (iterable instanceof u8i) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    c(iterable, list);
                    return;
                }
            }
            List<?> underlyingElements = ((see) iterable).getUnderlyingElements();
            see seeVar = (see) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (seeVar.size() - size) + " is null.";
                    for (int size2 = seeVar.size() - 1; size2 >= size; size2--) {
                        seeVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    seeVar.y((ByteString) obj);
                } else {
                    seeVar.add((String) obj);
                }
            }
        }

        public static <T> void c(Iterable<T> iterable, List<? super T> list) {
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

        public static UninitializedMessageException h(b0 b0Var) {
            return new UninitializedMessageException(b0Var);
        }

        public abstract BuilderType d(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.b0.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BuilderType m(b0 b0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(b0Var)) {
                return (BuilderType) d((a) b0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override // androidx.datastore.preferences.protobuf.b0.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) g(bArr, 0, bArr.length);
        }

        public abstract BuilderType g(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;
    }

    public static <T> void b(Iterable<T> iterable, List<? super T> list) {
        AbstractC0030a.b(iterable, list);
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    public int d(k0 k0Var) {
        int iC = c();
        if (iC != -1) {
            return iC;
        }
        int iD = k0Var.d(this);
        g(iD);
        return iD;
    }

    public final String e(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public UninitializedMessageException f() {
        return new UninitializedMessageException(this);
    }

    public void g(int i) {
        throw new UnsupportedOperationException();
    }

    public void h(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamG0 = CodedOutputStream.g0(outputStream, CodedOutputStream.J(getSerializedSize()));
        a(codedOutputStreamG0);
        codedOutputStreamG0.d0();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamH0 = CodedOutputStream.h0(bArr);
            a(codedOutputStreamH0);
            codedOutputStreamH0.d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e("byte array"), e);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public ByteString toByteString() {
        try {
            ByteString.h hVarNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            a(hVarNewCodedBuilder.b());
            return hVarNewCodedBuilder.a();
        } catch (IOException e) {
            throw new RuntimeException(e("ByteString"), e);
        }
    }
}
