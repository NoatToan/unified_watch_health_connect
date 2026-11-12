package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.a;
import com.xiaomi.hm.health.bt.proto.Beats;
import defpackage.bsf;
import defpackage.dcj;
import defpackage.jbq;
import defpackage.vkh;
import defpackage.xdi;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.protobuf.b<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected s1 unknownFields = s1.c();
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

        public SerializedForm(q0 q0Var) {
            Class<?> cls = q0Var.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = q0Var.toByteArray();
        }

        public static SerializedForm of(q0 q0Var) {
            return new SerializedForm(q0Var);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((q0) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
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
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((q0) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
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

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.protobuf.b.a<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;
        protected boolean isBuilt = false;

        public a(MessageType messagetype) {
            this.defaultInstance = messagetype;
            this.instance = (MessageType) messagetype.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        private void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            xdi.a().e(messagetype).a(messagetype, messagetype2);
        }

        public final void copyOnWrite() {
            if (this.isBuilt) {
                copyOnWriteInternal();
                this.isBuilt = false;
            }
        }

        public void copyOnWriteInternal() {
            MessageType messagetype = (MessageType) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            mergeFromInstance(messagetype, this.instance);
            this.instance = messagetype;
        }

        @Override // defpackage.bsf
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw com.google.protobuf.b.a.newUninitializedMessageException(messagetype);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        public MessageType buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
        public final BuilderType m152clear() {
            this.instance = (MessageType) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        @Override // defpackage.bsf, com.google.protobuf.s0
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // com.google.protobuf.b.a
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) mergeFrom((GeneratedMessageLite) messagetype);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: clone */
        public BuilderType mo144clone() {
            Beats.BeatsStatisticsMessage.Builder builder = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            builder.mergeFrom(buildPartial());
            return builder;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType mo155mergeFrom(byte[] bArr, int i, int i2, t tVar) throws InvalidProtocolBufferException {
            copyOnWrite();
            try {
                xdi.a().e(this.instance).g(this.instance, bArr, i, i + i2, new g.b(tVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.b.a
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType mo154mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return (BuilderType) mo155mergeFrom(bArr, i, i2, t.c());
        }

        @Override // com.google.protobuf.b.a, com.google.protobuf.q0.a
        public BuilderType mergeFrom(j jVar, t tVar) throws IOException {
            copyOnWrite();
            try {
                xdi.a().e(this.instance).h(this.instance, k.P(jVar), tVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static class b<T extends GeneratedMessageLite<T, ?>> extends com.google.protobuf.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f9543a;

        public b(T t) {
            this.f9543a = t;
        }

        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.parsePartialFrom(this.f9543a, jVar, tVar);
        }

        @Override // com.google.protobuf.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public T mo156parsePartialFrom(byte[] bArr, int i, int i2, t tVar) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.parsePartialFrom(this.f9543a, bArr, i, i2, tVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements bsf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a0<d> f9544a = a0.q();

        public a0<d> a() {
            if (this.f9544a.B()) {
                this.f9544a = this.f9544a.clone();
            }
            return this.f9544a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, defpackage.bsf, com.google.protobuf.s0
        public /* bridge */ /* synthetic */ q0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.q0, com.google.protobuf.p0
        public /* bridge */ /* synthetic */ q0.a newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.q0, com.google.protobuf.p0
        public /* bridge */ /* synthetic */ q0.a toBuilder() {
            return super.toBuilder();
        }
    }

    public static final class d implements a0.c<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0.d<?> f9545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9546b;
        public final WireFormat.FieldType c;
        public final boolean d;
        public final boolean e;

        public d(d0.d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f9545a = dVar;
            this.f9546b = i;
            this.c = fieldType;
            this.d = z;
            this.e = z2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f9546b - dVar.f9546b;
        }

        public d0.d<?> b() {
            return this.f9545a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.a0.c
        public q0.a f(q0.a aVar, q0 q0Var) {
            return ((a) aVar).mergeFrom((GeneratedMessageLite) q0Var);
        }

        @Override // com.google.protobuf.a0.c
        public WireFormat.JavaType getLiteJavaType() {
            return this.c.getJavaType();
        }

        @Override // com.google.protobuf.a0.c
        public WireFormat.FieldType getLiteType() {
            return this.c;
        }

        @Override // com.google.protobuf.a0.c
        public int getNumber() {
            return this.f9546b;
        }

        @Override // com.google.protobuf.a0.c
        public boolean isPacked() {
            return this.e;
        }

        @Override // com.google.protobuf.a0.c
        public boolean isRepeated() {
            return this.d;
        }
    }

    public static class e<ContainingType extends q0, Type> extends r<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContainingType f9547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f9548b;
        public final q0 c;
        public final d d;

        public e(ContainingType containingtype, Type type, q0 q0Var, d dVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (dVar.getLiteType() == WireFormat.FieldType.MESSAGE && q0Var == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f9547a = containingtype;
            this.f9548b = type;
            this.c = q0Var;
            this.d = dVar;
        }

        public ContainingType b() {
            return this.f9547a;
        }

        public WireFormat.FieldType c() {
            return this.d.getLiteType();
        }

        public q0 d() {
            return this.c;
        }

        public int e() {
            return this.d.getNumber();
        }

        public boolean f() {
            return this.d.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends c<MessageType, BuilderType>, BuilderType, T> e<MessageType, T> checkIsLite(r<MessageType, T> rVar) {
        if (rVar.a()) {
            return (e) rVar;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    public static d0.a emptyBooleanList() {
        return i.i();
    }

    public static d0.b emptyDoubleList() {
        return n.j();
    }

    public static d0.f emptyFloatList() {
        return b0.i();
    }

    public static d0.g emptyIntList() {
        return c0.i();
    }

    public static d0.h emptyLongList() {
        return i0.j();
    }

    public static <E> d0.i<E> emptyProtobufList() {
        return y0.g();
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == s1.c()) {
            this.unknownFields = s1.n();
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
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
            generatedMessageLite = (T) ((GeneratedMessageLite) jbq.l(cls)).getDefaultInstanceForType();
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e2);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
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

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$g] */
    public static d0.g mutableCopy(d0.g gVar) {
        int size = gVar.size();
        return gVar.a2(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(q0 q0Var, String str, Object[] objArr) {
        return new dcj(q0Var, str, objArr);
    }

    public static <ContainingType extends q0, Type> e<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, q0 q0Var, d0.d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new e<>(containingtype, Collections.emptyList(), q0Var, new d(dVar, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends q0, Type> e<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, q0 q0Var, d0.d<?> dVar, int i, WireFormat.FieldType fieldType, Class cls) {
        return new e<>(containingtype, type, q0Var, new d(dVar, i, fieldType, false, false), cls);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, t.c()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, j.i(byteBuffer), tVar));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, t tVar) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            j jVarG = j.g(new com.google.protobuf.b.a.C0259a(inputStream, j.C(i, inputStream)));
            T t2 = (T) parsePartialFrom(t, jVarG, tVar);
            try {
                jVarG.a(0);
                return t2;
            } catch (InvalidProtocolBufferException e2) {
                throw e2.setUnfinishedMessage(t2);
            }
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3.getMessage());
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, j jVar, t tVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            e1 e1VarE = xdi.a().e(t2);
            e1VarE.h(t2, k.P(jVar), tVar);
            e1VarE.c(t2);
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

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return xdi.a().e(this).equals(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.b
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public final vkh<MessageType> getParserForType() {
        return (vkh) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    @Override // com.google.protobuf.q0
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = xdi.a().e(this).d(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = xdi.a().e(this).hashCode(this);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.bsf
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        xdi.a().e(this).c(this);
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.k(i, byteString);
    }

    public final void mergeUnknownFields(s1 s1Var) {
        this.unknownFields = s1.m(this.unknownFields, s1Var);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.l(i, i2);
    }

    public boolean parseUnknownField(int i, j jVar) throws IOException {
        if (WireFormat.b(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.i(i, jVar);
    }

    @Override // com.google.protobuf.b
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public String toString() {
        return r0.e(this, super.toString());
    }

    @Override // com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        xdi.a().e(this).f(this, l.T(codedOutputStream));
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = xdi.a().e(t).b(t);
        if (z) {
            t.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zB ? t : null);
        }
        return zB;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((GeneratedMessageLite) messagetype);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    @Override // defpackage.bsf, com.google.protobuf.s0
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$h] */
    public static d0.h mutableCopy(d0.h hVar) {
        int size = hVar.size();
        return hVar.a2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, byteBuffer, t.c());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, t tVar) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, tVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, byteString, t.c()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$f] */
    public static d0.f mutableCopy(d0.f fVar) {
        int size = fVar.size();
        return fVar.a2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, tVar));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$b] */
    public static d0.b mutableCopy(d0.b bVar) {
        int size = bVar.size();
        return bVar.a2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, t.c()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$a] */
    public static d0.a mutableCopy(d0.a aVar) {
        int size = aVar.size();
        return aVar.a2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, tVar));
    }

    public static <E> d0.i<E> mutableCopy(d0.i<E> iVar) {
        int size = iVar.size();
        return iVar.a2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, t tVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            e1 e1VarE = xdi.a().e(t2);
            e1VarE.g(t2, bArr, i, i + i2, new g.b(tVar));
            e1VarE.c(t2);
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

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, j.g(inputStream), t.c()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, t tVar) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, j.g(inputStream), tVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, j jVar) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, jVar, t.c());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, j jVar, t tVar) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, jVar, tVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, j jVar) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, jVar, t.c());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        j jVarNewCodedInput = byteString.newCodedInput();
        T t2 = (T) parsePartialFrom(t, jVarNewCodedInput, tVar);
        try {
            jVarNewCodedInput.a(0);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            throw e2.setUnfinishedMessage(t2);
        }
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, tVar));
    }
}
