package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.j0;
import androidx.health.platform.client.proto.j0.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0<MessageType extends j0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.health.platform.client.proto.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, j0<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected w2 unknownFields = w2.f7807f;

    public static abstract class a<MessageType extends j0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.health.platform.client.proto.a.AbstractC0103a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageType f7676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MessageType f7677b;

        public a(MessageType messagetype) {
            this.f7676a = messagetype;
            if (messagetype.m()) {
                vb.h.s("Default instance must be immutable.");
                throw null;
            }
            this.f7677b = (MessageType) messagetype.p();
        }

        public static <MessageType> void i(MessageType messagetype, MessageType messagetype2) {
            r1 r1Var = r1.f7767c;
            r1Var.getClass();
            r1Var.a(messagetype.getClass()).mergeFrom(messagetype, messagetype2);
        }

        @Override // androidx.health.platform.client.proto.a.AbstractC0103a
        /* JADX INFO: renamed from: c */
        public final a clone() {
            MessageType messagetype = this.f7676a;
            messagetype.getClass();
            a aVar = (a) messagetype.i(f.NEW_BUILDER);
            aVar.f7677b = (MessageType) f();
            return aVar;
        }

        @Override // androidx.health.platform.client.proto.a.AbstractC0103a
        public final Object clone() {
            MessageType messagetype = this.f7676a;
            messagetype.getClass();
            a aVar = (a) messagetype.i(f.NEW_BUILDER);
            aVar.f7677b = (MessageType) f();
            return aVar;
        }

        @Override // androidx.health.platform.client.proto.a.AbstractC0103a
        public final a d(androidx.health.platform.client.proto.a aVar) {
            h((j0) aVar);
            return this;
        }

        public final MessageType e() {
            MessageType messagetype = (MessageType) f();
            messagetype.getClass();
            if (j0.l(messagetype, true)) {
                return messagetype;
            }
            throw new UninitializedMessageException(messagetype);
        }

        public final MessageType f() {
            boolean zM = this.f7677b.m();
            MessageType messagetype = this.f7677b;
            if (!zM) {
                return messagetype;
            }
            messagetype.getClass();
            r1 r1Var = r1.f7767c;
            r1Var.getClass();
            r1Var.a(messagetype.getClass()).makeImmutable(messagetype);
            messagetype.n();
            return this.f7677b;
        }

        public final void g() {
            if (this.f7677b.m()) {
                return;
            }
            MessageType messagetype = (MessageType) this.f7676a.p();
            i(messagetype, this.f7677b);
            this.f7677b = messagetype;
        }

        public final void h(j0 j0Var) {
            if (this.f7676a.equals(j0Var)) {
                return;
            }
            g();
            i(this.f7677b, j0Var);
        }

        @Override // androidx.health.platform.client.proto.d1
        public final boolean isInitialized() {
            return j0.l(this.f7677b, false);
        }
    }

    public static class b<T extends j0<T, ?>> extends androidx.health.platform.client.proto.b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f7678a;

        public b(T t7) {
            this.f7678a = t7;
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends j0<MessageType, BuilderType> implements d1 {
        protected f0<d> extensions = f0.f7604d;

        @Override // androidx.health.platform.client.proto.j0, androidx.health.platform.client.proto.d1
        public final j0 a() {
            return (j0) i(f.GET_DEFAULT_INSTANCE);
        }

        @Override // androidx.health.platform.client.proto.j0, androidx.health.platform.client.proto.c1
        public final a newBuilderForType() {
            return (a) i(f.NEW_BUILDER);
        }

        @Override // androidx.health.platform.client.proto.j0, androidx.health.platform.client.proto.c1
        public final a toBuilder() {
            a aVar = (a) i(f.NEW_BUILDER);
            aVar.h(this);
            return aVar;
        }
    }

    public static final class d implements f0.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0.b<?> f7679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b3 f7681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f7682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f7683e;

        public d(l0.b<?> bVar, int i14, b3 b3Var, boolean z14, boolean z15) {
            this.f7679a = bVar;
            this.f7680b = i14;
            this.f7681c = b3Var;
            this.f7682d = z14;
            this.f7683e = z15;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f7680b - ((d) obj).f7680b;
        }

        @Override // androidx.health.platform.client.proto.f0.b
        public final c3 getLiteJavaType() {
            return this.f7681c.f7559a;
        }

        @Override // androidx.health.platform.client.proto.f0.b
        public final b3 getLiteType() {
            return this.f7681c;
        }

        @Override // androidx.health.platform.client.proto.f0.b
        public final int getNumber() {
            return this.f7680b;
        }

        @Override // androidx.health.platform.client.proto.f0.b
        public final boolean isPacked() {
            return this.f7683e;
        }

        @Override // androidx.health.platform.client.proto.f0.b
        public final boolean isRepeated() {
            return this.f7682d;
        }

        @Override // androidx.health.platform.client.proto.f0.b
        public final a w3(c1.a aVar, c1 c1Var) {
            a aVar2 = (a) aVar;
            aVar2.h((j0) c1Var);
            return aVar2;
        }
    }

    public static class e<ContainingType extends c1, Type> extends y<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContainingType f7684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f7685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c1 f7686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f7687d;

        public e(ContainingType containingtype, Type type, c1 c1Var, d dVar, Class cls) {
            if (containingtype == null) {
                vb.h.s("Null containingTypeDefaultInstance");
                throw null;
            }
            if (dVar.f7681c == b3.f7550m && c1Var == null) {
                vb.h.s("Null messageDefaultInstance");
                throw null;
            }
            this.f7684a = containingtype;
            this.f7685b = type;
            this.f7686c = c1Var;
            this.f7687d = dVar;
        }
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static <T extends j0<?, ?>> T j(Class<T> cls) {
        T t7 = (T) defaultInstanceMap.get(cls);
        if (t7 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t7 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                com.airbnb.lottie.animation.keyframe.a.x("Class initialization cannot fail.", e4);
                return null;
            }
        }
        if (t7 != null) {
            return t7;
        }
        j0 j0Var = (j0) y2.b(cls);
        j0Var.getClass();
        T t14 = (T) j0Var.i(f.GET_DEFAULT_INSTANCE);
        if (t14 != null) {
            defaultInstanceMap.put(cls, t14);
            return t14;
        }
        j20.x.h();
        return null;
    }

    public static Object k(Method method, j0 j0Var, Object... objArr) {
        try {
            return method.invoke(j0Var, objArr);
        } catch (IllegalAccessException e4) {
            r1.q2.v("Couldn't use Java reflection to implement protocol message reflection.", e4);
            return null;
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            r1.q2.v("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final <T extends j0<T, ?>> boolean l(T t7, boolean z14) {
        byte bByteValue = ((Byte) t7.i(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        r1 r1Var = r1.f7767c;
        r1Var.getClass();
        boolean zIsInitialized = r1Var.a(t7.getClass()).isInitialized(t7);
        if (z14) {
            t7.i(f.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zIsInitialized;
    }

    public static <E> l0.d<E> o(l0.d<E> dVar) {
        int size = dVar.size();
        return dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends j0<T, ?>> T q(T t7, byte[] bArr) throws InvalidProtocolBufferException {
        int length = bArr.length;
        a0 a0VarA = a0.a();
        if (length != 0) {
            j0 j0VarP = t7.p();
            try {
                r1 r1Var = r1.f7767c;
                r1Var.getClass();
                n2 n2VarA = r1Var.a(j0VarP.getClass());
                n2VarA.a(j0VarP, bArr, 0, length, new androidx.health.platform.client.proto.e.b(a0VarA));
                n2VarA.makeImmutable(j0VarP);
                t7 = (T) j0VarP;
            } catch (InvalidProtocolBufferException e4) {
                InvalidProtocolBufferException invalidProtocolBufferException = e4;
                if (invalidProtocolBufferException.getThrownFromInputStream()) {
                    invalidProtocolBufferException = new InvalidProtocolBufferException((IOException) invalidProtocolBufferException);
                }
                throw invalidProtocolBufferException.setUnfinishedMessage(j0VarP);
            } catch (UninitializedMessageException e14) {
                throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(j0VarP);
            } catch (IOException e15) {
                if (e15.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e15.getCause());
                }
                throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(j0VarP);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(j0VarP);
            }
        }
        if (t7 == null || l(t7, true)) {
            return t7;
        }
        throw new UninitializedMessageException(t7).asInvalidProtocolBufferException().setUnfinishedMessage(t7);
    }

    public static <T extends j0<?, ?>> void r(Class<T> cls, T t7) {
        t7.n();
        defaultInstanceMap.put(cls, t7);
    }

    @Override // androidx.health.platform.client.proto.d1
    public j0 a() {
        return (j0) i(f.GET_DEFAULT_INSTANCE);
    }

    @Override // androidx.health.platform.client.proto.c1
    public final void b(CodedOutputStream codedOutputStream) {
        r1 r1Var = r1.f7767c;
        r1Var.getClass();
        r1Var.a(getClass()).c(this, l.a(codedOutputStream));
    }

    @Override // androidx.health.platform.client.proto.a
    public final int d() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.health.platform.client.proto.a
    public final int e(n2 n2Var) {
        int iD;
        int iD2;
        if (m()) {
            if (n2Var == null) {
                r1 r1Var = r1.f7767c;
                r1Var.getClass();
                iD2 = r1Var.a(getClass()).d(this);
            } else {
                iD2 = n2Var.d(this);
            }
            if (iD2 >= 0) {
                return iD2;
            }
            vb.h.z(am.j.h(iD2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (d() != Integer.MAX_VALUE) {
            return d();
        }
        if (n2Var == null) {
            r1 r1Var2 = r1.f7767c;
            r1Var2.getClass();
            iD = r1Var2.a(getClass()).d(this);
        } else {
            iD = n2Var.d(this);
        }
        g(iD);
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r1 r1Var = r1.f7767c;
        r1Var.getClass();
        return r1Var.a(getClass()).f(this, (j0) obj);
    }

    @Override // androidx.health.platform.client.proto.a
    public final void g(int i14) {
        if (i14 < 0) {
            vb.h.z(am.j.h(i14, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i14 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    @Override // androidx.health.platform.client.proto.c1
    public final l1<MessageType> getParserForType() {
        return (l1) i(f.GET_PARSER);
    }

    @Override // androidx.health.platform.client.proto.c1
    public final int getSerializedSize() {
        return e(null);
    }

    public final <MessageType extends j0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType h() {
        return (BuilderType) i(f.NEW_BUILDER);
    }

    public final int hashCode() {
        if (m()) {
            r1 r1Var = r1.f7767c;
            r1Var.getClass();
            return r1Var.a(getClass()).b(this);
        }
        if (this.memoizedHashCode == 0) {
            r1 r1Var2 = r1.f7767c;
            r1Var2.getClass();
            this.memoizedHashCode = r1Var2.a(getClass()).b(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object i(f fVar);

    @Override // androidx.health.platform.client.proto.d1
    public final boolean isInitialized() {
        return l(this, true);
    }

    public final boolean m() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void n() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.health.platform.client.proto.c1
    public a newBuilderForType() {
        return (a) i(f.NEW_BUILDER);
    }

    public final MessageType p() {
        return (MessageType) i(f.NEW_MUTABLE_INSTANCE);
    }

    @Override // androidx.health.platform.client.proto.c1
    public a toBuilder() {
        a aVar = (a) i(f.NEW_BUILDER);
        aVar.h(this);
        return aVar;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = e1.f7601a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("# ");
        sb3.append(string);
        e1.c(this, sb3, 0);
        return sb3.toString();
    }
}
