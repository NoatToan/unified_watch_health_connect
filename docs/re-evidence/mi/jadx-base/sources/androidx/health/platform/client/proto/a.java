package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.a.AbstractC0036a;
import defpackage.pee;
import defpackage.r8i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0036a<MessageType, BuilderType>> implements o0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.health.platform.client.proto.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0036a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0036a<MessageType, BuilderType>> implements o0.a {
        public static <T> void c(Iterable<T> iterable, List<? super T> list) {
            f0.a(iterable);
            if (!(iterable instanceof pee)) {
                if (iterable instanceof r8i) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    d(iterable, list);
                    return;
                }
            }
            List<?> underlyingElements = ((pee) iterable).getUnderlyingElements();
            pee peeVar = (pee) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (peeVar.size() - size) + " is null.";
                    for (int size2 = peeVar.size() - 1; size2 >= size; size2--) {
                        peeVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    peeVar.N((ByteString) obj);
                } else {
                    peeVar.add((String) obj);
                }
            }
        }

        public static <T> void d(Iterable<T> iterable, List<? super T> list) {
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

        public static UninitializedMessageException i(o0 o0Var) {
            return new UninitializedMessageException(o0Var);
        }

        public abstract BuilderType e(MessageType messagetype);

        @Override // androidx.health.platform.client.proto.o0.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BuilderType o(o0 o0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(o0Var)) {
                return (BuilderType) e((a) o0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override // androidx.health.platform.client.proto.o0.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) h(bArr, 0, bArr.length);
        }

        public abstract BuilderType h(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;
    }

    public static <T> void c(Iterable<T> iterable, List<? super T> list) {
        AbstractC0036a.c(iterable, list);
    }

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int e(w1 w1Var) {
        int iD = d();
        if (iD != -1) {
            return iD;
        }
        int iD2 = w1Var.d(this);
        h(iD2);
        return iD2;
    }

    public final String f(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public UninitializedMessageException g() {
        return new UninitializedMessageException(this);
    }

    public void h(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.health.platform.client.proto.o0
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamD0 = CodedOutputStream.d0(bArr);
            b(codedOutputStreamD0);
            codedOutputStreamD0.d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(f("byte array"), e);
        }
    }

    @Override // androidx.health.platform.client.proto.o0
    public ByteString toByteString() {
        try {
            ByteString.h hVarNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            b(hVarNewCodedBuilder.b());
            return hVarNewCodedBuilder.a();
        } catch (IOException e) {
            throw new RuntimeException(f("ByteString"), e);
        }
    }
}
