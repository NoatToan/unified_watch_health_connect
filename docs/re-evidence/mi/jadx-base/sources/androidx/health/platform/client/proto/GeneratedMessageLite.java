package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.GeneratedMessageLite.a;
import defpackage.bcj;
import defpackage.hbq;
import defpackage.tkh;
import defpackage.vdi;
import defpackage.zrf;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.health.platform.client.proto.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected c2 unknownFields = c2.c();

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

        public SerializedForm(o0 o0Var) {
            Class<?> cls = o0Var.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = o0Var.toByteArray();
        }

        public static SerializedForm of(o0 o0Var) {
            return new SerializedForm(o0Var);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((o0) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
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
                return ((o0) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
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

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.health.platform.client.proto.a.AbstractC0036a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageType f2460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MessageType f2461b;

        public a(MessageType messagetype) {
            this.f2460a = messagetype;
            if (messagetype.A()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f2461b = (MessageType) x();
        }

        public static <MessageType> void w(MessageType messagetype, MessageType messagetype2) {
            vdi.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType x() {
            return (MessageType) this.f2460a.G();
        }

        @Override // defpackage.zrf
        public final boolean isInitialized() {
            return GeneratedMessageLite.z(this.f2461b, false);
        }

        @Override // androidx.health.platform.client.proto.o0.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw androidx.health.platform.client.proto.a.AbstractC0036a.i(messagetype);
        }

        @Override // androidx.health.platform.client.proto.o0.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public MessageType buildPartial() {
            if (!this.f2461b.A()) {
                return this.f2461b;
            }
            this.f2461b.B();
            return this.f2461b;
        }

        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.f2461b = (MessageType) buildPartial();
            return buildertype;
        }

        public final void n() {
            if (this.f2461b.A()) {
                return;
            }
            p();
        }

        public void p() {
            MessageType messagetype = (MessageType) x();
            w(messagetype, this.f2461b);
            this.f2461b = messagetype;
        }

        @Override // defpackage.zrf
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public MessageType getDefaultInstanceForType() {
            return this.f2460a;
        }

        @Override // androidx.health.platform.client.proto.a.AbstractC0036a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public BuilderType e(MessageType messagetype) {
            return (BuilderType) t(messagetype);
        }

        @Override // androidx.health.platform.client.proto.o0.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public BuilderType P(h hVar, y yVar) throws IOException {
            n();
            try {
                vdi.a().d(this.f2461b).h(this.f2461b, i.O(hVar), yVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        public BuilderType t(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            n();
            w(this.f2461b, messagetype);
            return this;
        }

        @Override // androidx.health.platform.client.proto.a.AbstractC0036a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public BuilderType h(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return (BuilderType) v(bArr, i, i2, y.b());
        }

        public BuilderType v(byte[] bArr, int i, int i2, y yVar) throws InvalidProtocolBufferException {
            n();
            try {
                vdi.a().d(this.f2461b).f(this.f2461b, bArr, i, i + i2, new androidx.health.platform.client.proto.d.b(yVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }
    }

    public static class b<T extends GeneratedMessageLite<T, ?>> extends androidx.health.platform.client.proto.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f2462b;

        public b(T t) {
            this.f2462b = t;
        }

        @Override // defpackage.tkh
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T a(h hVar, y yVar) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.I(this.f2462b, hVar, yVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements zrf {
        protected c0<d> extensions = c0.h();

        public c0<d> N() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    public static final class d implements c0.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0.d<?> f2463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2464b;
        public final WireFormat.FieldType c;
        public final boolean d;
        public final boolean e;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f2464b - dVar.f2464b;
        }

        public f0.d<?> b() {
            return this.f2463a;
        }

        @Override // androidx.health.platform.client.proto.c0.b
        public WireFormat.JavaType getLiteJavaType() {
            return this.c.getJavaType();
        }

        @Override // androidx.health.platform.client.proto.c0.b
        public WireFormat.FieldType getLiteType() {
            return this.c;
        }

        @Override // androidx.health.platform.client.proto.c0.b
        public int getNumber() {
            return this.f2464b;
        }

        @Override // androidx.health.platform.client.proto.c0.b
        public boolean isPacked() {
            return this.e;
        }

        @Override // androidx.health.platform.client.proto.c0.b
        public boolean isRepeated() {
            return this.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.health.platform.client.proto.c0.b
        public o0.a t(o0.a aVar, o0 o0Var) {
            return ((a) aVar).t((GeneratedMessageLite) o0Var);
        }
    }

    public static class e<ContainingType extends o0, Type> extends x<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o0 f2465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f2466b;

        public WireFormat.FieldType a() {
            return this.f2466b.getLiteType();
        }

        public o0 b() {
            return this.f2465a;
        }

        public int c() {
            return this.f2466b.getNumber();
        }

        public boolean d() {
            return this.f2466b.d;
        }
    }

    public static <E> f0.i<E> D(f0.i<E> iVar) {
        int size = iVar.size();
        return iVar.a(size == 0 ? 10 : size * 2);
    }

    public static Object F(o0 o0Var, String str, Object[] objArr) {
        return new bcj(o0Var, str, objArr);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T H(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) j(J(t, bArr, 0, bArr.length, y.b()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T I(T t, h hVar, y yVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.G();
        try {
            w1 w1VarD = vdi.a().d(t2);
            w1VarD.h(t2, i.O(hVar), yVar);
            w1VarD.c(t2);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (UninitializedMessageException e3) {
            throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(t2);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T J(T t, byte[] bArr, int i, int i2, y yVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.G();
        try {
            w1 w1VarD = vdi.a().d(t2);
            w1VarD.f(t2, bArr, i, i + i2, new androidx.health.platform.client.proto.d.b(yVar));
            w1VarD.c(t2);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (UninitializedMessageException e3) {
            throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t2);
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void K(Class<T> cls, T t) {
        t.C();
        defaultInstanceMap.put(cls, t);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T j(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.g().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    public static <E> f0.i<E> t() {
        return v0.g();
    }

    public static <T extends GeneratedMessageLite<?, ?>> T u(Class<T> cls) {
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
            generatedMessageLite = (T) ((GeneratedMessageLite) hbq.l(cls)).getDefaultInstanceForType();
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    public static Object y(Method method, Object obj, Object... objArr) {
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

    public static final <T extends GeneratedMessageLite<T, ?>> boolean z(T t, boolean z) {
        byte bByteValue = ((Byte) t.q(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = vdi.a().d(t).b(t);
        if (z) {
            t.r(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zB ? t : null);
        }
        return zB;
    }

    public boolean A() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void B() {
        vdi.a().d(this).c(this);
        C();
    }

    public void C() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.health.platform.client.proto.o0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) q(MethodToInvoke.NEW_BUILDER);
    }

    public MessageType G() {
        return (MessageType) q(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public void L(int i) {
        this.memoizedHashCode = i;
    }

    @Override // androidx.health.platform.client.proto.o0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final BuilderType toBuilder() {
        return (BuilderType) ((a) q(MethodToInvoke.NEW_BUILDER)).t(this);
    }

    @Override // androidx.health.platform.client.proto.o0
    public void b(CodedOutputStream codedOutputStream) throws IOException {
        vdi.a().d(this).g(this, j.P(codedOutputStream));
    }

    @Override // androidx.health.platform.client.proto.a
    public int d() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.health.platform.client.proto.a
    public int e(w1 w1Var) {
        if (!A()) {
            if (d() != Integer.MAX_VALUE) {
                return d();
            }
            int iN = n(w1Var);
            h(iN);
            return iN;
        }
        int iN2 = n(w1Var);
        if (iN2 >= 0) {
            return iN2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iN2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return vdi.a().d(this).equals(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    @Override // androidx.health.platform.client.proto.o0
    public final tkh<MessageType> getParserForType() {
        return (tkh) q(MethodToInvoke.GET_PARSER);
    }

    @Override // androidx.health.platform.client.proto.o0
    public int getSerializedSize() {
        return e(null);
    }

    @Override // androidx.health.platform.client.proto.a
    public void h(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    public int hashCode() {
        if (A()) {
            return m();
        }
        if (x()) {
            L(m());
        }
        return w();
    }

    public Object i() throws Exception {
        return q(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    @Override // defpackage.zrf
    public final boolean isInitialized() {
        return z(this, true);
    }

    public void k() {
        this.memoizedHashCode = 0;
    }

    public void l() {
        h(Integer.MAX_VALUE);
    }

    public int m() {
        return vdi.a().d(this).hashCode(this);
    }

    public final int n(w1<?> w1Var) {
        return w1Var == null ? vdi.a().d(this).d(this) : w1Var.d(this);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType p() {
        return (BuilderType) q(MethodToInvoke.NEW_BUILDER);
    }

    public Object q(MethodToInvoke methodToInvoke) {
        return s(methodToInvoke, null, null);
    }

    public Object r(MethodToInvoke methodToInvoke, Object obj) {
        return s(methodToInvoke, obj, null);
    }

    public abstract Object s(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public String toString() {
        return p0.f(this, super.toString());
    }

    @Override // defpackage.zrf
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) q(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public int w() {
        return this.memoizedHashCode;
    }

    public boolean x() {
        return w() == 0;
    }
}
