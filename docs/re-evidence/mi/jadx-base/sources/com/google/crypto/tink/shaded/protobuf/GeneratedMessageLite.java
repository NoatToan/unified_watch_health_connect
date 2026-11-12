package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.a;
import defpackage.asf;
import defpackage.ccj;
import defpackage.dw0;
import defpackage.ibq;
import defpackage.ukh;
import defpackage.wdi;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected o0 unknownFields = o0.e();
    protected int memoizedSerializedSize = -1;

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final Class<?> messageClass;
        private final String messageClassName;

        public SerializedForm(b0 b0Var) {
            Class<?> cls = b0Var.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = b0Var.toByteArray();
        }

        public static SerializedForm of(b0 b0Var) {
            return new SerializedForm(b0Var);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((b0) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException("Unable to understand proto buffer", e);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (NoSuchFieldException e4) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.messageClassName, e4);
            } catch (SecurityException e5) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.messageClassName, e5);
            }
        }

        private Class<?> resolveMessageClass() throws ClassNotFoundException {
            Class<?> cls = this.messageClass;
            return cls != null ? cls : Class.forName(this.messageClassName);
        }

        public Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((b0) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException("Unable to understand proto buffer", e);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (SecurityException e4) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e4);
            }
        }
    }

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a.AbstractC0254a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageType f9360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MessageType f9361b;
        public boolean c = false;

        public a(MessageType messagetype) {
            this.f9360a = messagetype;
            this.f9361b = (MessageType) messagetype.j(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.b0.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw com.google.crypto.tink.shaded.protobuf.a.AbstractC0254a.f(messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.b0.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public MessageType buildPartial() {
            if (this.c) {
                return this.f9361b;
            }
            this.f9361b.r();
            this.c = true;
            return this.f9361b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            dw0.b bVar = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            bVar.p(buildPartial());
            return bVar;
        }

        public final void j() {
            if (this.c) {
                k();
                this.c = false;
            }
        }

        public void k() {
            MessageType messagetype = (MessageType) this.f9361b.j(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            s(messagetype, this.f9361b);
            this.f9361b = messagetype;
        }

        @Override // defpackage.asf
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public MessageType getDefaultInstanceForType() {
            return this.f9360a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0254a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public BuilderType b(MessageType messagetype) {
            return (BuilderType) p(messagetype);
        }

        public BuilderType p(MessageType messagetype) {
            j();
            s(this.f9361b, messagetype);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0254a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public BuilderType e(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return (BuilderType) r(bArr, i, i2, l.b());
        }

        public BuilderType r(byte[] bArr, int i, int i2, l lVar) throws InvalidProtocolBufferException {
            j();
            try {
                wdi.a().e(this.f9361b).f(this.f9361b, bArr, i, i + i2, new com.google.crypto.tink.shaded.protobuf.d.b(lVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final void s(MessageType messagetype, MessageType messagetype2) {
            wdi.a().e(messagetype).a(messagetype, messagetype2);
        }
    }

    public static class b<T extends GeneratedMessageLite<T, ?>> extends com.google.crypto.tink.shaded.protobuf.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f9362b;

        public b(T t) {
            this.f9362b = t;
        }

        @Override // defpackage.ukh
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T b(g gVar, l lVar) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.y(this.f9362b, gVar, lVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements asf {
        protected p<d> extensions = p.h();

        public p<d> C() {
            if (this.extensions.n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    public static final class d implements p.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s.d<?> f9363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9364b;
        public final WireFormat.FieldType c;
        public final boolean d;
        public final boolean e;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f9364b - dVar.f9364b;
        }

        public s.d<?> b() {
            return this.f9363a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.p.b
        public b0.a g(b0.a aVar, b0 b0Var) {
            return ((a) aVar).p((GeneratedMessageLite) b0Var);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p.b
        public WireFormat.JavaType getLiteJavaType() {
            return this.c.getJavaType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p.b
        public WireFormat.FieldType getLiteType() {
            return this.c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p.b
        public int getNumber() {
            return this.f9364b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p.b
        public boolean isPacked() {
            return this.e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p.b
        public boolean isRepeated() {
            return this.d;
        }
    }

    public static class e<ContainingType extends b0, Type> extends k<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f9365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f9366b;

        public WireFormat.FieldType a() {
            return this.f9366b.getLiteType();
        }

        public b0 b() {
            return this.f9365a;
        }

        public int c() {
            return this.f9366b.getNumber();
        }

        public boolean d() {
            return this.f9366b.d;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void A(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T h(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.e().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    public static <E> s.i<E> m() {
        return h0.g();
    }

    public static <T extends GeneratedMessageLite<?, ?>> T n(Class<T> cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((GeneratedMessageLite) ibq.j(cls)).getDefaultInstanceForType();
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    public static Object p(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean q(T t, boolean z) {
        byte bByteValue = ((Byte) t.j(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = wdi.a().e(t).b(t);
        if (z) {
            t.k(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zB ? t : null);
        }
        return zB;
    }

    public static <E> s.i<E> s(s.i<E> iVar) {
        int size = iVar.size();
        return iVar.a(size == 0 ? 10 : size * 2);
    }

    public static Object u(b0 b0Var, String str, Object[] objArr) {
        return new ccj(b0Var, str, objArr);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T v(T t, ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        return (T) h(x(t, byteString, lVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T w(T t, byte[] bArr, l lVar) throws InvalidProtocolBufferException {
        return (T) h(z(t, bArr, 0, bArr.length, lVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T x(T t, ByteString byteString, l lVar) throws InvalidProtocolBufferException {
        g gVarNewCodedInput = byteString.newCodedInput();
        T t2 = (T) y(t, gVarNewCodedInput, lVar);
        try {
            gVarNewCodedInput.a(0);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            throw e2.setUnfinishedMessage(t2);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T y(T t, g gVar, l lVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.j(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            k0 k0VarE = wdi.a().e(t2);
            k0VarE.g(t2, h.O(gVar), lVar);
            k0VarE.c(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw e3;
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T z(T t, byte[] bArr, int i, int i2, l lVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.j(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            k0 k0VarE = wdi.a().e(t2);
            k0VarE.f(t2, bArr, i, i + i2, new com.google.crypto.tink.shaded.protobuf.d.b(lVar));
            k0VarE.c(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) j(MethodToInvoke.NEW_BUILDER);
        buildertype.p(this);
        return buildertype;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public void a(CodedOutputStream codedOutputStream) throws IOException {
        wdi.a().e(this).h(this, i.P(codedOutputStream));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public int b() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getDefaultInstanceForType().getClass().isInstance(obj)) {
            return wdi.a().e(this).equals(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public void f(int i) {
        this.memoizedSerializedSize = i;
    }

    public Object g() throws Exception {
        return j(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final ukh<MessageType> getParserForType() {
        return (ukh) j(MethodToInvoke.GET_PARSER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = wdi.a().e(this).d(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = wdi.a().e(this).hashCode(this);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType i() {
        return (BuilderType) j(MethodToInvoke.NEW_BUILDER);
    }

    @Override // defpackage.asf
    public final boolean isInitialized() {
        return q(this, true);
    }

    public Object j(MethodToInvoke methodToInvoke) {
        return l(methodToInvoke, null, null);
    }

    public Object k(MethodToInvoke methodToInvoke, Object obj) {
        return l(methodToInvoke, obj, null);
    }

    public abstract Object l(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    @Override // defpackage.asf
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) j(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public void r() {
        wdi.a().e(this).c(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) j(MethodToInvoke.NEW_BUILDER);
    }

    public String toString() {
        return c0.e(this, super.toString());
    }
}
