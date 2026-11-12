package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.a;
import defpackage.csf;
import defpackage.ecj;
import defpackage.i7i;
import defpackage.kbq;
import defpackage.ydi;
import defpackage.ykh;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
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

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a.AbstractC0030a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageType f2173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MessageType f2174b;
        public boolean c = false;

        public a(MessageType messagetype) {
            this.f2173a = messagetype;
            this.f2174b = (MessageType) messagetype.l(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.b0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw androidx.datastore.preferences.protobuf.a.AbstractC0030a.h(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.b0.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public MessageType buildPartial() {
            if (this.c) {
                return this.f2174b;
            }
            this.f2174b.u();
            this.c = true;
            return this.f2174b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            i7i.a aVar = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            aVar.q(buildPartial());
            return aVar;
        }

        public void l() {
            if (this.c) {
                MessageType messagetype = (MessageType) this.f2174b.l(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                t(messagetype, this.f2174b);
                this.f2174b = messagetype;
                this.c = false;
            }
        }

        @Override // defpackage.csf
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public MessageType getDefaultInstanceForType() {
            return this.f2173a;
        }

        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0030a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public BuilderType d(MessageType messagetype) {
            return (BuilderType) q(messagetype);
        }

        public BuilderType q(MessageType messagetype) {
            l();
            t(this.f2174b, messagetype);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0030a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public BuilderType g(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return (BuilderType) s(bArr, i, i2, l.b());
        }

        public BuilderType s(byte[] bArr, int i, int i2, l lVar) throws InvalidProtocolBufferException {
            l();
            try {
                ydi.a().e(this.f2174b).h(this.f2174b, bArr, i, i + i2, new androidx.datastore.preferences.protobuf.d.b(lVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public final void t(MessageType messagetype, MessageType messagetype2) {
            ydi.a().e(messagetype).a(messagetype, messagetype2);
        }
    }

    public static class b<T extends GeneratedMessageLite<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f2175b;

        public b(T t) {
            this.f2175b = t;
        }

        @Override // defpackage.ykh
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T a(g gVar, l lVar) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.z(this.f2175b, gVar, lVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements csf {
        protected p<d> extensions = p.h();

        public p<d> C() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, defpackage.csf
        public /* bridge */ /* synthetic */ b0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.b0
        public /* bridge */ /* synthetic */ b0.a newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.b0
        public /* bridge */ /* synthetic */ b0.a toBuilder() {
            return super.toBuilder();
        }
    }

    public static final class d implements p.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s.d<?> f2176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2177b;
        public final WireFormat.FieldType c;
        public final boolean d;
        public final boolean e;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f2177b - dVar.f2177b;
        }

        public s.d<?> b() {
            return this.f2176a;
        }

        @Override // androidx.datastore.preferences.protobuf.p.b
        public WireFormat.JavaType getLiteJavaType() {
            return this.c.getJavaType();
        }

        @Override // androidx.datastore.preferences.protobuf.p.b
        public WireFormat.FieldType getLiteType() {
            return this.c;
        }

        @Override // androidx.datastore.preferences.protobuf.p.b
        public int getNumber() {
            return this.f2177b;
        }

        @Override // androidx.datastore.preferences.protobuf.p.b
        public boolean isPacked() {
            return this.e;
        }

        @Override // androidx.datastore.preferences.protobuf.p.b
        public boolean isRepeated() {
            return this.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.p.b
        public b0.a j(b0.a aVar, b0 b0Var) {
            return ((a) aVar).q((GeneratedMessageLite) b0Var);
        }
    }

    public static class e<ContainingType extends b0, Type> extends k<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f2178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f2179b;

        public WireFormat.FieldType a() {
            return this.f2179b.getLiteType();
        }

        public b0 b() {
            return this.f2178a;
        }

        public int c() {
            return this.f2179b.getNumber();
        }

        public boolean d() {
            return this.f2179b.d;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void A(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T j(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.f().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    public static <E> s.i<E> p() {
        return h0.g();
    }

    public static <T extends GeneratedMessageLite<?, ?>> T q(Class<T> cls) {
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
            generatedMessageLite = (T) ((GeneratedMessageLite) kbq.j(cls)).getDefaultInstanceForType();
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    public static Object s(Method method, Object obj, Object... objArr) {
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

    public static final <T extends GeneratedMessageLite<T, ?>> boolean t(T t, boolean z) {
        byte bByteValue = ((Byte) t.l(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = ydi.a().e(t).b(t);
        if (z) {
            t.n(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zB ? t : null);
        }
        return zB;
    }

    public static <E> s.i<E> v(s.i<E> iVar) {
        int size = iVar.size();
        return iVar.a(size == 0 ? 10 : size * 2);
    }

    public static Object x(b0 b0Var, String str, Object[] objArr) {
        return new ecj(b0Var, str, objArr);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T y(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) j(z(t, g.f(inputStream), l.b()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T z(T t, g gVar, l lVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.l(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            k0 k0VarE = ydi.a().e(t2);
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

    @Override // androidx.datastore.preferences.protobuf.b0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) l(MethodToInvoke.NEW_BUILDER);
        buildertype.q(this);
        return buildertype;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void a(CodedOutputStream codedOutputStream) throws IOException {
        ydi.a().e(this).f(this, i.P(codedOutputStream));
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public int c() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getDefaultInstanceForType().getClass().isInstance(obj)) {
            return ydi.a().e(this).equals(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public void g(int i) {
        this.memoizedSerializedSize = i;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final ykh<MessageType> getParserForType() {
        return (ykh) l(MethodToInvoke.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = ydi.a().e(this).d(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ydi.a().e(this).hashCode(this);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public Object i() throws Exception {
        return l(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    @Override // defpackage.csf
    public final boolean isInitialized() {
        return t(this, true);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType k() {
        return (BuilderType) l(MethodToInvoke.NEW_BUILDER);
    }

    public Object l(MethodToInvoke methodToInvoke) {
        return o(methodToInvoke, null, null);
    }

    public Object n(MethodToInvoke methodToInvoke, Object obj) {
        return o(methodToInvoke, obj, null);
    }

    public abstract Object o(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    @Override // defpackage.csf
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) l(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public String toString() {
        return c0.e(this, super.toString());
    }

    public void u() {
        ydi.a().e(this).c(this);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) l(MethodToInvoke.NEW_BUILDER);
    }
}
