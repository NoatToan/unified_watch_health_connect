package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
public abstract class x<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected n1 unknownFields = n1.f6788f;

    public static abstract class a<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a.AbstractC0093a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageType f6911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MessageType f6912b;

        public a(MessageType messagetype) {
            this.f6911a = messagetype;
            if (messagetype.j()) {
                vb.h.s("Default instance must be immutable.");
                throw null;
            }
            this.f6912b = (MessageType) messagetype.l();
        }

        public static <MessageType> void i(MessageType messagetype, MessageType messagetype2) {
            c1 c1Var = c1.f6688c;
            c1Var.getClass();
            c1Var.a(messagetype.getClass()).mergeFrom(messagetype, messagetype2);
        }

        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0093a
        /* JADX INFO: renamed from: c */
        public final a clone() {
            MessageType messagetype = this.f6911a;
            messagetype.getClass();
            a aVar = (a) messagetype.f(f.NEW_BUILDER);
            aVar.f6912b = (MessageType) f();
            return aVar;
        }

        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0093a
        public final Object clone() {
            MessageType messagetype = this.f6911a;
            messagetype.getClass();
            a aVar = (a) messagetype.f(f.NEW_BUILDER);
            aVar.f6912b = (MessageType) f();
            return aVar;
        }

        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0093a
        public final a d(androidx.datastore.preferences.protobuf.a aVar) {
            h((x) aVar);
            return this;
        }

        public final MessageType e() {
            MessageType messagetype = (MessageType) f();
            messagetype.getClass();
            if (x.i(messagetype, true)) {
                return messagetype;
            }
            throw new UninitializedMessageException(messagetype);
        }

        public final MessageType f() {
            boolean zJ = this.f6912b.j();
            MessageType messagetype = this.f6912b;
            if (!zJ) {
                return messagetype;
            }
            messagetype.getClass();
            c1 c1Var = c1.f6688c;
            c1Var.getClass();
            c1Var.a(messagetype.getClass()).makeImmutable(messagetype);
            messagetype.k();
            return this.f6912b;
        }

        public final void g() {
            if (this.f6912b.j()) {
                return;
            }
            MessageType messagetype = (MessageType) this.f6911a.l();
            i(messagetype, this.f6912b);
            this.f6912b = messagetype;
        }

        public final void h(x xVar) {
            if (this.f6911a.equals(xVar)) {
                return;
            }
            g();
            i(this.f6912b, xVar);
        }

        @Override // androidx.datastore.preferences.protobuf.r0
        public final boolean isInitialized() {
            return x.i(this.f6912b, false);
        }
    }

    public static class b<T extends x<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f6913a;

        public b(T t7) {
            this.f6913a = t7;
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends x<MessageType, BuilderType> implements r0 {
        protected t<d> extensions = t.f6847d;

        @Override // androidx.datastore.preferences.protobuf.x, androidx.datastore.preferences.protobuf.r0
        public final x a() {
            return (x) f(f.GET_DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.x, androidx.datastore.preferences.protobuf.q0
        public final a newBuilderForType() {
            return (a) f(f.NEW_BUILDER);
        }

        @Override // androidx.datastore.preferences.protobuf.x, androidx.datastore.preferences.protobuf.q0
        public final a toBuilder() {
            a aVar = (a) f(f.NEW_BUILDER);
            aVar.h(this);
            return aVar;
        }
    }

    public static final class d implements t.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s1 f6915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f6917d;

        public d(z.b<?> bVar, int i14, s1 s1Var, boolean z14, boolean z15) {
            this.f6914a = i14;
            this.f6915b = s1Var;
            this.f6916c = z14;
            this.f6917d = z15;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f6914a - ((d) obj).f6914a;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public final t1 getLiteJavaType() {
            return this.f6915b.f6845a;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public final s1 getLiteType() {
            return this.f6915b;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public final int getNumber() {
            return this.f6914a;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public final boolean isPacked() {
            return this.f6917d;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public final boolean isRepeated() {
            return this.f6916c;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public final a y2(q0.a aVar, q0 q0Var) {
            a aVar2 = (a) aVar;
            aVar2.h((x) q0Var);
            return aVar2;
        }
    }

    public static class e<ContainingType extends q0, Type> extends m<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContainingType f6918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f6919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q0 f6920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f6921d;

        public e(ContainingType containingtype, Type type, q0 q0Var, d dVar, Class cls) {
            if (containingtype == null) {
                vb.h.s("Null containingTypeDefaultInstance");
                throw null;
            }
            if (dVar.f6915b == s1.f6836m && q0Var == null) {
                vb.h.s("Null messageDefaultInstance");
                throw null;
            }
            this.f6918a = containingtype;
            this.f6919b = type;
            this.f6920c = q0Var;
            this.f6921d = dVar;
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

    public static <T extends x<?, ?>> T g(Class<T> cls) {
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
        x xVar = (x) p1.d(cls);
        xVar.getClass();
        T t14 = (T) xVar.f(f.GET_DEFAULT_INSTANCE);
        if (t14 != null) {
            defaultInstanceMap.put(cls, t14);
            return t14;
        }
        j20.x.h();
        return null;
    }

    public static Object h(Method method, x xVar, Object... objArr) {
        try {
            return method.invoke(xVar, objArr);
        } catch (IllegalAccessException e4) {
            q2.v("Couldn't use Java reflection to implement protocol message reflection.", e4);
            return null;
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            q2.v("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final <T extends x<T, ?>> boolean i(T t7, boolean z14) {
        byte bByteValue = ((Byte) t7.f(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        c1 c1Var = c1.f6688c;
        c1Var.getClass();
        boolean zIsInitialized = c1Var.a(t7.getClass()).isInitialized(t7);
        if (z14) {
            t7.f(f.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zIsInitialized;
    }

    public static <T extends x<T, ?>> T m(T t7, i iVar, o oVar) throws InvalidProtocolBufferException {
        T t14 = (T) t7.l();
        try {
            c1 c1Var = c1.f6688c;
            c1Var.getClass();
            g1 g1VarA = c1Var.a(t14.getClass());
            g1VarA.b(t14, j.a(iVar), oVar);
            g1VarA.makeImmutable(t14);
            return t14;
        } catch (InvalidProtocolBufferException e4) {
            e = e4;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t14);
        } catch (UninitializedMessageException e14) {
            throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(t14);
        } catch (IOException e15) {
            if (e15.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e15.getCause());
            }
            throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(t14);
        } catch (RuntimeException e16) {
            if (e16.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e16.getCause());
            }
            throw e16;
        }
    }

    public static <T extends x<?, ?>> void n(Class<T> cls, T t7) {
        t7.k();
        defaultInstanceMap.put(cls, t7);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public x a() {
        return (x) f(f.GET_DEFAULT_INSTANCE);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void b(CodedOutputStream codedOutputStream) {
        c1 c1Var = c1.f6688c;
        c1Var.getClass();
        c1Var.a(getClass()).d(this, k.a(codedOutputStream));
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int c() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int d(g1 g1Var) {
        int iA;
        int iA2;
        if (j()) {
            if (g1Var == null) {
                c1 c1Var = c1.f6688c;
                c1Var.getClass();
                iA2 = c1Var.a(getClass()).a(this);
            } else {
                iA2 = g1Var.a(this);
            }
            if (iA2 >= 0) {
                return iA2;
            }
            vb.h.z(am.j.h(iA2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (c() != Integer.MAX_VALUE) {
            return c();
        }
        if (g1Var == null) {
            c1 c1Var2 = c1.f6688c;
            c1Var2.getClass();
            iA = c1Var2.a(getClass()).a(this);
        } else {
            iA = g1Var.a(this);
        }
        e(iA);
        return iA;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void e(int i14) {
        if (i14 < 0) {
            vb.h.z(am.j.h(i14, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i14 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c1 c1Var = c1.f6688c;
        c1Var.getClass();
        return c1Var.a(getClass()).c(this, (x) obj);
    }

    public abstract Object f(f fVar);

    @Override // androidx.datastore.preferences.protobuf.q0
    public final z0<MessageType> getParserForType() {
        return (z0) f(f.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final int getSerializedSize() {
        return d(null);
    }

    public final int hashCode() {
        if (j()) {
            c1 c1Var = c1.f6688c;
            c1Var.getClass();
            return c1Var.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            c1 c1Var2 = c1.f6688c;
            c1Var2.getClass();
            this.memoizedHashCode = c1Var2.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean isInitialized() {
        return i(this, true);
    }

    public final boolean j() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void k() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final MessageType l() {
        return (MessageType) f(f.NEW_MUTABLE_INSTANCE);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public a newBuilderForType() {
        return (a) f(f.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public a toBuilder() {
        a aVar = (a) f(f.NEW_BUILDER);
        aVar.h(this);
        return aVar;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = s0.f6825a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("# ");
        sb3.append(string);
        s0.c(this, sb3, 0);
        return sb3.toString();
    }
}
