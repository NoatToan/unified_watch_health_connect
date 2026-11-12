package com.google.protobuf;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.mi.health.course.export.data.CourseConfigModel;
import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GeneratedMessage extends com.google.protobuf.a implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected r1 unknownFields;

    public class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.protobuf.a.b f9518a;

        public a(com.google.protobuf.a.b bVar) {
            this.f9518a = bVar;
        }

        @Override // com.google.protobuf.a.b
        public void a() {
            this.f9518a.a();
        }
    }

    public static class b extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p0 f9520b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p0 p0Var, int i) {
            super(null);
            this.f9520b = p0Var;
            this.c = i;
        }

        @Override // com.google.protobuf.GeneratedMessage.h
        public Descriptors.FieldDescriptor a() {
            return this.f9520b.getDescriptorForType().n().get(this.c);
        }
    }

    public static class c extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p0 f9521b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p0 p0Var, String str) {
            super(null);
            this.f9521b = p0Var;
            this.c = str;
        }

        @Override // com.google.protobuf.GeneratedMessage.h
        public Descriptors.FieldDescriptor a() {
            return this.f9521b.getDescriptorForType().k(this.c);
        }
    }

    public static class d extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f9522b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Class cls, String str, String str2) {
            super(null);
            this.f9522b = cls;
            this.c = str;
            this.d = str2;
        }

        @Override // com.google.protobuf.GeneratedMessage.h
        public Descriptors.FieldDescriptor a() {
            try {
                return ((Descriptors.FileDescriptor) this.f9522b.getClassLoader().loadClass(this.c).getField("descriptor").get(null)).k(this.d);
            } catch (Exception e) {
                throw new RuntimeException("Cannot load descriptors: " + this.c + " is not a valid descriptor class name", e);
            }
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9523a;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.JavaType.values().length];
            f9523a = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9523a[Descriptors.FieldDescriptor.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class f<BuilderType extends f<BuilderType>> extends com.google.protobuf.a.AbstractC0258a<BuilderType> {
        private g builderParent;
        private boolean isClean;
        private f<BuilderType>.a meAsParent;
        private r1 unknownFields;

        public class a implements g {
            public a() {
            }

            @Override // com.google.protobuf.a.b
            public void a() {
                f.this.onChanged();
            }

            public /* synthetic */ a(f fVar, a aVar) {
                this();
            }
        }

        public f() {
            this(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Descriptors.FieldDescriptor, Object> getAllFieldsMutable() {
            TreeMap treeMap = new TreeMap();
            List<Descriptors.FieldDescriptor> listO = internalGetFieldAccessorTable().f9526a.o();
            int iN = 0;
            while (iN < listO.size()) {
                Descriptors.FieldDescriptor oneofFieldDescriptor = listO.get(iN);
                Descriptors.h hVarN = oneofFieldDescriptor.n();
                if (hVarN != null) {
                    iN += hVarN.n() - 1;
                    if (hasOneof(hVarN)) {
                        oneofFieldDescriptor = getOneofFieldDescriptor(hVarN);
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    }
                } else if (oneofFieldDescriptor.isRepeated()) {
                    List list = (List) getField(oneofFieldDescriptor);
                    if (!list.isEmpty()) {
                        treeMap.put(oneofFieldDescriptor, list);
                    }
                } else if (hasField(oneofFieldDescriptor)) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
                iN++;
            }
            return treeMap;
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public void dispose() {
            this.builderParent = null;
        }

        @Override // com.google.protobuf.s0
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            return Collections.unmodifiableMap(getAllFieldsMutable());
        }

        @Override // com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return internalGetFieldAccessorTable().f9526a;
        }

        @Override // com.google.protobuf.s0
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            Object objD = internalGetFieldAccessorTable().f(fieldDescriptor).d(this);
            return fieldDescriptor.isRepeated() ? Collections.unmodifiableList((List) objD) : objD;
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public p0.a getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().f(fieldDescriptor).l(this);
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.h hVar) {
            return internalGetFieldAccessorTable().g(hVar).b(this);
        }

        public g getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new a(this, null);
            }
            return this.meAsParent;
        }

        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            return internalGetFieldAccessorTable().f(fieldDescriptor).g(this, i);
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public p0.a getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            return internalGetFieldAccessorTable().f(fieldDescriptor).i(this, i);
        }

        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().f(fieldDescriptor).e(this);
        }

        @Override // com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.s0
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().f(fieldDescriptor).o(this);
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public boolean hasOneof(Descriptors.h hVar) {
            return internalGetFieldAccessorTable().g(hVar).d(this);
        }

        public abstract k internalGetFieldAccessorTable();

        public l0 internalGetMapField(int i) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }

        public l0 internalGetMutableMapField(int i) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }

        public boolean isClean() {
            return this.isClean;
        }

        @Override // defpackage.bsf
        public boolean isInitialized() {
            for (Descriptors.FieldDescriptor fieldDescriptor : getDescriptorForType().o()) {
                if (fieldDescriptor.F() && !hasField(fieldDescriptor)) {
                    return false;
                }
                if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    if (fieldDescriptor.isRepeated()) {
                        Iterator it = ((List) getField(fieldDescriptor)).iterator();
                        while (it.hasNext()) {
                            if (!((p0) it.next()).isInitialized()) {
                                return false;
                            }
                        }
                    } else if (hasField(fieldDescriptor) && !((p0) getField(fieldDescriptor)).isInitialized()) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public void markClean() {
            this.isClean = true;
        }

        @Override // com.google.protobuf.p0.a
        public p0.a newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().f(fieldDescriptor).newBuilder();
        }

        public void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        public final void onChanged() {
            g gVar;
            if (!this.isClean || (gVar = this.builderParent) == null) {
                return;
            }
            gVar.a();
            this.isClean = false;
        }

        public boolean parseUnknownField(com.google.protobuf.j jVar, r1.b bVar, t tVar, int i) throws IOException {
            return bVar.j(i, jVar);
        }

        public f(g gVar) {
            this.unknownFields = r1.c();
            this.builderParent = gVar;
        }

        @Override // com.google.protobuf.p0.a
        public BuilderType addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().f(fieldDescriptor).h(this, obj);
            return this;
        }

        @Override // com.google.protobuf.p0.a
        public BuilderType clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            internalGetFieldAccessorTable().f(fieldDescriptor).m(this);
            return this;
        }

        @Override // com.google.protobuf.p0.a
        public BuilderType setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().f(fieldDescriptor).a(this, obj);
            return this;
        }

        /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
        public BuilderType m151setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            internalGetFieldAccessorTable().f(fieldDescriptor).k(this, i, obj);
            return this;
        }

        @Override // com.google.protobuf.p0.a
        public BuilderType setUnknownFields(r1 r1Var) {
            this.unknownFields = r1Var;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public BuilderType clearOneof(Descriptors.h hVar) {
            internalGetFieldAccessorTable().g(hVar).a(this);
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: mergeUnknownFields */
        public BuilderType mo145mergeUnknownFields(r1 r1Var) {
            this.unknownFields = r1.h(this.unknownFields).q(r1Var).build();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: clear */
        public BuilderType mo142clear() {
            this.unknownFields = r1.c();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a
        /* JADX INFO: renamed from: clone */
        public BuilderType mo144clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.mergeFrom(buildPartial());
            return buildertype;
        }
    }

    public interface g extends com.google.protobuf.a.b {
    }

    public static abstract class h implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Descriptors.FieldDescriptor f9525a;

        public h() {
        }

        public /* synthetic */ h(a aVar) {
            this();
        }

        public abstract Descriptors.FieldDescriptor a();

        @Override // com.google.protobuf.GeneratedMessage.j
        public Descriptors.FieldDescriptor getDescriptor() {
            if (this.f9525a == null) {
                synchronized (this) {
                    try {
                        if (this.f9525a == null) {
                            this.f9525a = a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f9525a;
        }
    }

    public static abstract class i<MessageType extends ExtendableMessage, BuilderType extends i<MessageType, BuilderType>> extends f<BuilderType> implements s0 {
        public static /* synthetic */ a0 a(i iVar) {
            throw null;
        }
    }

    public interface j {
        Descriptors.FieldDescriptor getDescriptor();
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Descriptors.b f9526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a[] f9527b;
        public String[] c;
        public final c[] d;
        public volatile boolean e = false;

        public interface a {
            void a(f fVar, Object obj);

            Object b(GeneratedMessage generatedMessage);

            Object c(GeneratedMessage generatedMessage);

            Object d(f fVar);

            int e(f fVar);

            int f(GeneratedMessage generatedMessage);

            Object g(f fVar, int i);

            void h(f fVar, Object obj);

            p0.a i(f fVar, int i);

            Object j(GeneratedMessage generatedMessage, int i);

            void k(f fVar, int i, Object obj);

            p0.a l(f fVar);

            void m(f fVar);

            boolean n(GeneratedMessage generatedMessage);

            p0.a newBuilder();

            boolean o(f fVar);
        }

        public static class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Descriptors.FieldDescriptor f9528a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p0 f9529b;

            public b(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessage> cls, Class<? extends f> cls2) {
                this.f9528a = fieldDescriptor;
                this.f9529b = q((GeneratedMessage) GeneratedMessage.invokeOrDie(GeneratedMessage.getMethodOrDie(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).k();
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public void a(f fVar, Object obj) {
                m(fVar);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    h(fVar, it.next());
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object b(GeneratedMessage generatedMessage) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < f(generatedMessage); i++) {
                    arrayList.add(j(generatedMessage, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object c(GeneratedMessage generatedMessage) {
                return b(generatedMessage);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object d(f fVar) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < e(fVar); i++) {
                    arrayList.add(g(fVar, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public int e(f fVar) {
                return p(fVar).i().size();
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public int f(GeneratedMessage generatedMessage) {
                return q(generatedMessage).i().size();
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object g(f fVar, int i) {
                return p(fVar).i().get(i);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public void h(f fVar, Object obj) {
                r(fVar).l().add((p0) obj);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public p0.a i(f fVar, int i) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object j(GeneratedMessage generatedMessage, int i) {
                return q(generatedMessage).i().get(i);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public void k(f fVar, int i, Object obj) {
                r(fVar).l().set(i, (p0) obj);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public p0.a l(f fVar) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public void m(f fVar) {
                r(fVar).l().clear();
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public boolean n(GeneratedMessage generatedMessage) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public p0.a newBuilder() {
                return this.f9529b.newBuilderForType();
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public boolean o(f fVar) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            public final l0<?, ?> p(f fVar) {
                return fVar.internalGetMapField(this.f9528a.getNumber());
            }

            public final l0<?, ?> q(GeneratedMessage generatedMessage) {
                return generatedMessage.internalGetMapField(this.f9528a.getNumber());
            }

            public final l0<?, ?> r(f fVar) {
                return fVar.internalGetMutableMapField(this.f9528a.getNumber());
            }
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Descriptors.b f9530a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final java.lang.reflect.Method f9531b;
            public final java.lang.reflect.Method c;
            public final java.lang.reflect.Method d;

            public c(Descriptors.b bVar, String str, Class<? extends GeneratedMessage> cls, Class<? extends f> cls2) {
                this.f9530a = bVar;
                this.f9531b = GeneratedMessage.getMethodOrDie(cls, "get" + str + "Case", new Class[0]);
                this.c = GeneratedMessage.getMethodOrDie(cls2, "get" + str + "Case", new Class[0]);
                StringBuilder sb = new StringBuilder();
                sb.append(CervicalMucusRecord.Appearance.CLEAR);
                sb.append(str);
                this.d = GeneratedMessage.getMethodOrDie(cls2, sb.toString(), new Class[0]);
            }

            public void a(f fVar) {
                GeneratedMessage.invokeOrDie(this.d, fVar, new Object[0]);
            }

            public Descriptors.FieldDescriptor b(f fVar) {
                int number = ((d0.c) GeneratedMessage.invokeOrDie(this.c, fVar, new Object[0])).getNumber();
                if (number > 0) {
                    return this.f9530a.l(number);
                }
                return null;
            }

            public Descriptors.FieldDescriptor c(GeneratedMessage generatedMessage) {
                int number = ((d0.c) GeneratedMessage.invokeOrDie(this.f9531b, generatedMessage, new Object[0])).getNumber();
                if (number > 0) {
                    return this.f9530a.l(number);
                }
                return null;
            }

            public boolean d(f fVar) {
                return ((d0.c) GeneratedMessage.invokeOrDie(this.c, fVar, new Object[0])).getNumber() != 0;
            }

            public boolean e(GeneratedMessage generatedMessage) {
                return ((d0.c) GeneratedMessage.invokeOrDie(this.f9531b, generatedMessage, new Object[0])).getNumber() != 0;
            }
        }

        public static final class d extends e {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public Descriptors.d f9532k;
            public final java.lang.reflect.Method l;
            public final java.lang.reflect.Method m;
            public boolean n;
            public java.lang.reflect.Method o;
            public java.lang.reflect.Method p;
            public java.lang.reflect.Method q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public java.lang.reflect.Method f9533r;

            public d(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessage> cls, Class<? extends f> cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.f9532k = fieldDescriptor.r();
                this.l = GeneratedMessage.getMethodOrDie(this.f9534a, "valueOf", Descriptors.e.class);
                this.m = GeneratedMessage.getMethodOrDie(this.f9534a, "getValueDescriptor", new Class[0]);
                boolean zY = fieldDescriptor.a().y();
                this.n = zY;
                if (zY) {
                    Class cls3 = Integer.TYPE;
                    this.o = GeneratedMessage.getMethodOrDie(cls, "get" + str + "Value", cls3);
                    this.p = GeneratedMessage.getMethodOrDie(cls2, "get" + str + "Value", cls3);
                    this.q = GeneratedMessage.getMethodOrDie(cls2, CourseConfigModel.DevCmd.CMD_ACTION_SET + str + "Value", cls3, cls3);
                    this.f9533r = GeneratedMessage.getMethodOrDie(cls2, "add" + str + "Value", cls3);
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.k.e, com.google.protobuf.GeneratedMessage.k.a
            public Object b(GeneratedMessage generatedMessage) {
                ArrayList arrayList = new ArrayList();
                int iF = f(generatedMessage);
                for (int i = 0; i < iF; i++) {
                    arrayList.add(j(generatedMessage, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.e, com.google.protobuf.GeneratedMessage.k.a
            public Object d(f fVar) {
                ArrayList arrayList = new ArrayList();
                int iE = e(fVar);
                for (int i = 0; i < iE; i++) {
                    arrayList.add(g(fVar, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.e, com.google.protobuf.GeneratedMessage.k.a
            public Object g(f fVar, int i) {
                if (!this.n) {
                    return GeneratedMessage.invokeOrDie(this.m, super.g(fVar, i), new Object[0]);
                }
                return this.f9532k.k(((Integer) GeneratedMessage.invokeOrDie(this.p, fVar, Integer.valueOf(i))).intValue());
            }

            @Override // com.google.protobuf.GeneratedMessage.k.e, com.google.protobuf.GeneratedMessage.k.a
            public void h(f fVar, Object obj) {
                if (this.n) {
                    GeneratedMessage.invokeOrDie(this.f9533r, fVar, Integer.valueOf(((Descriptors.e) obj).getNumber()));
                } else {
                    super.h(fVar, GeneratedMessage.invokeOrDie(this.l, null, obj));
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.k.e, com.google.protobuf.GeneratedMessage.k.a
            public Object j(GeneratedMessage generatedMessage, int i) {
                if (!this.n) {
                    return GeneratedMessage.invokeOrDie(this.m, super.j(generatedMessage, i), new Object[0]);
                }
                return this.f9532k.k(((Integer) GeneratedMessage.invokeOrDie(this.o, generatedMessage, Integer.valueOf(i))).intValue());
            }

            @Override // com.google.protobuf.GeneratedMessage.k.e, com.google.protobuf.GeneratedMessage.k.a
            public void k(f fVar, int i, Object obj) {
                if (this.n) {
                    GeneratedMessage.invokeOrDie(this.q, fVar, Integer.valueOf(i), Integer.valueOf(((Descriptors.e) obj).getNumber()));
                } else {
                    super.k(fVar, i, GeneratedMessage.invokeOrDie(this.l, null, obj));
                }
            }
        }

        public static class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Class f9534a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final java.lang.reflect.Method f9535b;
            public final java.lang.reflect.Method c;
            public final java.lang.reflect.Method d;
            public final java.lang.reflect.Method e;
            public final java.lang.reflect.Method f;
            public final java.lang.reflect.Method g;
            public final java.lang.reflect.Method h;
            public final java.lang.reflect.Method i;
            public final java.lang.reflect.Method j;

            public e(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessage> cls, Class<? extends f> cls2) {
                this.f9535b = GeneratedMessage.getMethodOrDie(cls, "get" + str + "List", new Class[0]);
                this.c = GeneratedMessage.getMethodOrDie(cls2, "get" + str + "List", new Class[0]);
                StringBuilder sb = new StringBuilder();
                sb.append("get");
                sb.append(str);
                String string = sb.toString();
                Class cls3 = Integer.TYPE;
                java.lang.reflect.Method methodOrDie = GeneratedMessage.getMethodOrDie(cls, string, cls3);
                this.d = methodOrDie;
                this.e = GeneratedMessage.getMethodOrDie(cls2, "get" + str, cls3);
                Class<?> returnType = methodOrDie.getReturnType();
                this.f9534a = returnType;
                this.f = GeneratedMessage.getMethodOrDie(cls2, CourseConfigModel.DevCmd.CMD_ACTION_SET + str, cls3, returnType);
                this.g = GeneratedMessage.getMethodOrDie(cls2, "add" + str, returnType);
                this.h = GeneratedMessage.getMethodOrDie(cls, "get" + str + "Count", new Class[0]);
                this.i = GeneratedMessage.getMethodOrDie(cls2, "get" + str + "Count", new Class[0]);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(CervicalMucusRecord.Appearance.CLEAR);
                sb2.append(str);
                this.j = GeneratedMessage.getMethodOrDie(cls2, sb2.toString(), new Class[0]);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public void a(f fVar, Object obj) {
                m(fVar);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    h(fVar, it.next());
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object b(GeneratedMessage generatedMessage) {
                return GeneratedMessage.invokeOrDie(this.f9535b, generatedMessage, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object c(GeneratedMessage generatedMessage) {
                return b(generatedMessage);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object d(f fVar) {
                return GeneratedMessage.invokeOrDie(this.c, fVar, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public int e(f fVar) {
                return ((Integer) GeneratedMessage.invokeOrDie(this.i, fVar, new Object[0])).intValue();
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public int f(GeneratedMessage generatedMessage) {
                return ((Integer) GeneratedMessage.invokeOrDie(this.h, generatedMessage, new Object[0])).intValue();
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object g(f fVar, int i) {
                return GeneratedMessage.invokeOrDie(this.e, fVar, Integer.valueOf(i));
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public void h(f fVar, Object obj) {
                GeneratedMessage.invokeOrDie(this.g, fVar, obj);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public p0.a i(f fVar, int i) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object j(GeneratedMessage generatedMessage, int i) {
                return GeneratedMessage.invokeOrDie(this.d, generatedMessage, Integer.valueOf(i));
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public void k(f fVar, int i, Object obj) {
                GeneratedMessage.invokeOrDie(this.f, fVar, Integer.valueOf(i), obj);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public p0.a l(f fVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public void m(f fVar) {
                GeneratedMessage.invokeOrDie(this.j, fVar, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public boolean n(GeneratedMessage generatedMessage) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public p0.a newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public boolean o(f fVar) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }
        }

        public static final class f extends e {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final java.lang.reflect.Method f9536k;
            public final java.lang.reflect.Method l;

            public f(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessage> cls, Class<? extends f> cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.f9536k = GeneratedMessage.getMethodOrDie(this.f9534a, "newBuilder", new Class[0]);
                this.l = GeneratedMessage.getMethodOrDie(cls2, "get" + str + "Builder", Integer.TYPE);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.e, com.google.protobuf.GeneratedMessage.k.a
            public void h(f fVar, Object obj) {
                super.h(fVar, p(obj));
            }

            @Override // com.google.protobuf.GeneratedMessage.k.e, com.google.protobuf.GeneratedMessage.k.a
            public p0.a i(f fVar, int i) {
                return (p0.a) GeneratedMessage.invokeOrDie(this.l, fVar, Integer.valueOf(i));
            }

            @Override // com.google.protobuf.GeneratedMessage.k.e, com.google.protobuf.GeneratedMessage.k.a
            public void k(f fVar, int i, Object obj) {
                super.k(fVar, i, p(obj));
            }

            @Override // com.google.protobuf.GeneratedMessage.k.e, com.google.protobuf.GeneratedMessage.k.a
            public p0.a newBuilder() {
                return (p0.a) GeneratedMessage.invokeOrDie(this.f9536k, null, new Object[0]);
            }

            public final Object p(Object obj) {
                return this.f9534a.isInstance(obj) ? obj : ((p0.a) GeneratedMessage.invokeOrDie(this.f9536k, null, new Object[0])).mergeFrom((p0) obj).build();
            }
        }

        public static final class g extends h {
            public Descriptors.d m;
            public java.lang.reflect.Method n;
            public java.lang.reflect.Method o;
            public boolean p;
            public java.lang.reflect.Method q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public java.lang.reflect.Method f9537r;
            public java.lang.reflect.Method s;

            public g(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessage> cls, Class<? extends f> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.m = fieldDescriptor.r();
                this.n = GeneratedMessage.getMethodOrDie(this.f9538a, "valueOf", Descriptors.e.class);
                this.o = GeneratedMessage.getMethodOrDie(this.f9538a, "getValueDescriptor", new Class[0]);
                boolean zY = fieldDescriptor.a().y();
                this.p = zY;
                if (zY) {
                    this.q = GeneratedMessage.getMethodOrDie(cls, "get" + str + "Value", new Class[0]);
                    this.f9537r = GeneratedMessage.getMethodOrDie(cls2, "get" + str + "Value", new Class[0]);
                    this.s = GeneratedMessage.getMethodOrDie(cls2, CourseConfigModel.DevCmd.CMD_ACTION_SET + str + "Value", Integer.TYPE);
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.k.h, com.google.protobuf.GeneratedMessage.k.a
            public void a(f fVar, Object obj) {
                if (this.p) {
                    GeneratedMessage.invokeOrDie(this.s, fVar, Integer.valueOf(((Descriptors.e) obj).getNumber()));
                } else {
                    super.a(fVar, GeneratedMessage.invokeOrDie(this.n, null, obj));
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.k.h, com.google.protobuf.GeneratedMessage.k.a
            public Object b(GeneratedMessage generatedMessage) {
                if (!this.p) {
                    return GeneratedMessage.invokeOrDie(this.o, super.b(generatedMessage), new Object[0]);
                }
                return this.m.k(((Integer) GeneratedMessage.invokeOrDie(this.q, generatedMessage, new Object[0])).intValue());
            }

            @Override // com.google.protobuf.GeneratedMessage.k.h, com.google.protobuf.GeneratedMessage.k.a
            public Object d(f fVar) {
                if (!this.p) {
                    return GeneratedMessage.invokeOrDie(this.o, super.d(fVar), new Object[0]);
                }
                return this.m.k(((Integer) GeneratedMessage.invokeOrDie(this.f9537r, fVar, new Object[0])).intValue());
            }
        }

        public static class h implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Class<?> f9538a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final java.lang.reflect.Method f9539b;
            public final java.lang.reflect.Method c;
            public final java.lang.reflect.Method d;
            public final java.lang.reflect.Method e;
            public final java.lang.reflect.Method f;
            public final java.lang.reflect.Method g;
            public final java.lang.reflect.Method h;
            public final java.lang.reflect.Method i;
            public final Descriptors.FieldDescriptor j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final boolean f9540k;
            public final boolean l;

            public h(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessage> cls, Class<? extends f> cls2, String str2) {
                java.lang.reflect.Method methodOrDie;
                java.lang.reflect.Method methodOrDie2;
                java.lang.reflect.Method methodOrDie3;
                this.j = fieldDescriptor;
                boolean z = true;
                boolean z2 = fieldDescriptor.n() != null;
                this.f9540k = z2;
                if (!k.i(fieldDescriptor.a()) && (z2 || fieldDescriptor.w() != Descriptors.FieldDescriptor.JavaType.MESSAGE)) {
                    z = false;
                }
                this.l = z;
                java.lang.reflect.Method methodOrDie4 = GeneratedMessage.getMethodOrDie(cls, "get" + str, new Class[0]);
                this.f9539b = methodOrDie4;
                this.c = GeneratedMessage.getMethodOrDie(cls2, "get" + str, new Class[0]);
                Class<?> returnType = methodOrDie4.getReturnType();
                this.f9538a = returnType;
                this.d = GeneratedMessage.getMethodOrDie(cls2, CourseConfigModel.DevCmd.CMD_ACTION_SET + str, returnType);
                java.lang.reflect.Method methodOrDie5 = null;
                if (z) {
                    methodOrDie = GeneratedMessage.getMethodOrDie(cls, "has" + str, new Class[0]);
                } else {
                    methodOrDie = null;
                }
                this.e = methodOrDie;
                if (z) {
                    methodOrDie2 = GeneratedMessage.getMethodOrDie(cls2, "has" + str, new Class[0]);
                } else {
                    methodOrDie2 = null;
                }
                this.f = methodOrDie2;
                this.g = GeneratedMessage.getMethodOrDie(cls2, CervicalMucusRecord.Appearance.CLEAR + str, new Class[0]);
                if (z2) {
                    methodOrDie3 = GeneratedMessage.getMethodOrDie(cls, "get" + str2 + "Case", new Class[0]);
                } else {
                    methodOrDie3 = null;
                }
                this.h = methodOrDie3;
                if (z2) {
                    methodOrDie5 = GeneratedMessage.getMethodOrDie(cls2, "get" + str2 + "Case", new Class[0]);
                }
                this.i = methodOrDie5;
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public void a(f fVar, Object obj) {
                GeneratedMessage.invokeOrDie(this.d, fVar, obj);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object b(GeneratedMessage generatedMessage) {
                return GeneratedMessage.invokeOrDie(this.f9539b, generatedMessage, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object c(GeneratedMessage generatedMessage) {
                return b(generatedMessage);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object d(f fVar) {
                return GeneratedMessage.invokeOrDie(this.c, fVar, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public int e(f fVar) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public int f(GeneratedMessage generatedMessage) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object g(f fVar, int i) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public void h(f fVar, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public p0.a i(f fVar, int i) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public Object j(GeneratedMessage generatedMessage, int i) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public void k(f fVar, int i, Object obj) {
                throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public p0.a l(f fVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public void m(f fVar) {
                GeneratedMessage.invokeOrDie(this.g, fVar, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public boolean n(GeneratedMessage generatedMessage) {
                if (this.l) {
                    return ((Boolean) GeneratedMessage.invokeOrDie(this.e, generatedMessage, new Object[0])).booleanValue();
                }
                if (this.f9540k) {
                    return q(generatedMessage) == this.j.getNumber();
                }
                return !b(generatedMessage).equals(this.j.p());
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public p0.a newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessage.k.a
            public boolean o(f fVar) {
                if (this.l) {
                    return ((Boolean) GeneratedMessage.invokeOrDie(this.f, fVar, new Object[0])).booleanValue();
                }
                if (this.f9540k) {
                    return p(fVar) == this.j.getNumber();
                }
                return !d(fVar).equals(this.j.p());
            }

            public final int p(f fVar) {
                return ((d0.c) GeneratedMessage.invokeOrDie(this.i, fVar, new Object[0])).getNumber();
            }

            public final int q(GeneratedMessage generatedMessage) {
                return ((d0.c) GeneratedMessage.invokeOrDie(this.h, generatedMessage, new Object[0])).getNumber();
            }
        }

        public static final class i extends h {
            public final java.lang.reflect.Method m;
            public final java.lang.reflect.Method n;

            public i(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessage> cls, Class<? extends f> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.m = GeneratedMessage.getMethodOrDie(this.f9538a, "newBuilder", new Class[0]);
                this.n = GeneratedMessage.getMethodOrDie(cls2, "get" + str + "Builder", new Class[0]);
            }

            private Object r(Object obj) {
                return this.f9538a.isInstance(obj) ? obj : ((p0.a) GeneratedMessage.invokeOrDie(this.m, null, new Object[0])).mergeFrom((p0) obj).buildPartial();
            }

            @Override // com.google.protobuf.GeneratedMessage.k.h, com.google.protobuf.GeneratedMessage.k.a
            public void a(f fVar, Object obj) {
                super.a(fVar, r(obj));
            }

            @Override // com.google.protobuf.GeneratedMessage.k.h, com.google.protobuf.GeneratedMessage.k.a
            public p0.a l(f fVar) {
                return (p0.a) GeneratedMessage.invokeOrDie(this.n, fVar, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.h, com.google.protobuf.GeneratedMessage.k.a
            public p0.a newBuilder() {
                return (p0.a) GeneratedMessage.invokeOrDie(this.m, null, new Object[0]);
            }
        }

        public static final class j extends h {
            public final java.lang.reflect.Method m;
            public final java.lang.reflect.Method n;
            public final java.lang.reflect.Method o;

            public j(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessage> cls, Class<? extends f> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.m = GeneratedMessage.getMethodOrDie(cls, "get" + str + "Bytes", new Class[0]);
                this.n = GeneratedMessage.getMethodOrDie(cls2, "get" + str + "Bytes", new Class[0]);
                this.o = GeneratedMessage.getMethodOrDie(cls2, CourseConfigModel.DevCmd.CMD_ACTION_SET + str + "Bytes", ByteString.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.k.h, com.google.protobuf.GeneratedMessage.k.a
            public void a(f fVar, Object obj) {
                if (obj instanceof ByteString) {
                    GeneratedMessage.invokeOrDie(this.o, fVar, obj);
                } else {
                    super.a(fVar, obj);
                }
            }

            @Override // com.google.protobuf.GeneratedMessage.k.h, com.google.protobuf.GeneratedMessage.k.a
            public Object c(GeneratedMessage generatedMessage) {
                return GeneratedMessage.invokeOrDie(this.m, generatedMessage, new Object[0]);
            }
        }

        public k(Descriptors.b bVar, String[] strArr) {
            this.f9526a = bVar;
            this.c = strArr;
            this.f9527b = new a[bVar.o().size()];
            this.d = new c[bVar.r().size()];
        }

        public static boolean i(Descriptors.FileDescriptor fileDescriptor) {
            return fileDescriptor.r() == Descriptors.FileDescriptor.Syntax.PROTO2;
        }

        public k e(Class<? extends GeneratedMessage> cls, Class<? extends f> cls2) {
            if (this.e) {
                return this;
            }
            synchronized (this) {
                try {
                    if (this.e) {
                        return this;
                    }
                    int length = this.f9527b.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        Descriptors.FieldDescriptor fieldDescriptor = this.f9526a.o().get(i2);
                        String str = fieldDescriptor.n() != null ? this.c[fieldDescriptor.n().p() + length] : null;
                        if (fieldDescriptor.isRepeated()) {
                            if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                                if (fieldDescriptor.C() && h(fieldDescriptor)) {
                                    this.f9527b[i2] = new b(fieldDescriptor, this.c[i2], cls, cls2);
                                } else {
                                    this.f9527b[i2] = new f(fieldDescriptor, this.c[i2], cls, cls2);
                                }
                            } else if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                                this.f9527b[i2] = new d(fieldDescriptor, this.c[i2], cls, cls2);
                            } else {
                                this.f9527b[i2] = new e(fieldDescriptor, this.c[i2], cls, cls2);
                            }
                        } else if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            this.f9527b[i2] = new i(fieldDescriptor, this.c[i2], cls, cls2, str);
                        } else if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                            this.f9527b[i2] = new g(fieldDescriptor, this.c[i2], cls, cls2, str);
                        } else if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.STRING) {
                            this.f9527b[i2] = new j(fieldDescriptor, this.c[i2], cls, cls2, str);
                        } else {
                            this.f9527b[i2] = new h(fieldDescriptor, this.c[i2], cls, cls2, str);
                        }
                        i2++;
                    }
                    int length2 = this.d.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        this.d[i3] = new c(this.f9526a, this.c[i3 + length], cls, cls2);
                    }
                    this.e = true;
                    this.c = null;
                    return this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final a f(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.o() != this.f9526a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            if (fieldDescriptor.B()) {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
            return this.f9527b[fieldDescriptor.u()];
        }

        public final c g(Descriptors.h hVar) {
            if (hVar.m() == this.f9526a) {
                return this.d[hVar.p()];
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }

        public final boolean h(Descriptors.FieldDescriptor fieldDescriptor) {
            return true;
        }
    }

    public static class l<ContainingType extends p0, Type> extends Extension<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j f9541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f9542b;
        public final p0 c;
        public final java.lang.reflect.Method d;
        public final java.lang.reflect.Method e;
        public final Extension.ExtensionType f;

        public l(j jVar, Class cls, p0 p0Var, Extension.ExtensionType extensionType) {
            if (p0.class.isAssignableFrom(cls) && !cls.isInstance(p0Var)) {
                throw new IllegalArgumentException("Bad messageDefaultInstance for " + cls.getName());
            }
            this.f9541a = jVar;
            this.f9542b = cls;
            this.c = p0Var;
            if (z0.class.isAssignableFrom(cls)) {
                this.d = GeneratedMessage.getMethodOrDie(cls, "valueOf", Descriptors.e.class);
                this.e = GeneratedMessage.getMethodOrDie(cls, "getValueDescriptor", new Class[0]);
            } else {
                this.d = null;
                this.e = null;
            }
            this.f = extensionType;
        }

        @Override // com.google.protobuf.Extension
        public Object b(Object obj) {
            Descriptors.FieldDescriptor fieldDescriptorC = c();
            if (!fieldDescriptorC.isRepeated()) {
                return e(obj);
            }
            if (fieldDescriptorC.w() != Descriptors.FieldDescriptor.JavaType.MESSAGE && fieldDescriptorC.w() != Descriptors.FieldDescriptor.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        @Override // com.google.protobuf.Extension
        public Descriptors.FieldDescriptor c() {
            j jVar = this.f9541a;
            if (jVar != null) {
                return jVar.getDescriptor();
            }
            throw new IllegalStateException("getDescriptor() called before internalInit()");
        }

        @Override // com.google.protobuf.Extension
        public p0 d() {
            return this.c;
        }

        @Override // com.google.protobuf.Extension
        public Object e(Object obj) {
            int i = e.f9523a[c().w().ordinal()];
            if (i != 1) {
                return i != 2 ? obj : GeneratedMessage.invokeOrDie(this.d, null, (Descriptors.e) obj);
            }
            return this.f9542b.isInstance(obj) ? obj : this.c.newBuilderForType().mergeFrom((p0) obj).build();
        }
    }

    public GeneratedMessage() {
        this.unknownFields = r1.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType>, T> Extension<MessageType, T> checkNotLite(r<MessageType, T> rVar) {
        if (rVar.a()) {
            throw new IllegalArgumentException("Expected non-lite extension.");
        }
        return (Extension) rVar;
    }

    public static int computeStringSize(int i2, Object obj) {
        return obj instanceof String ? CodedOutputStream.V(i2, (String) obj) : CodedOutputStream.h(i2, (ByteString) obj);
    }

    public static int computeStringSizeNoTag(Object obj) {
        return obj instanceof String ? CodedOutputStream.W((String) obj) : CodedOutputStream.i((ByteString) obj);
    }

    public static void enableAlwaysUseFieldBuildersForTesting() {
        alwaysUseFieldBuilders = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    public Map<Descriptors.FieldDescriptor, Object> getAllFieldsMutable(boolean z) {
        TreeMap treeMap = new TreeMap();
        List<Descriptors.FieldDescriptor> listO = internalGetFieldAccessorTable().f9526a.o();
        int iN = 0;
        while (iN < listO.size()) {
            Descriptors.FieldDescriptor oneofFieldDescriptor = listO.get(iN);
            Descriptors.h hVarN = oneofFieldDescriptor.n();
            if (hVarN != null) {
                iN += hVarN.n() - 1;
                if (hasOneof(hVarN)) {
                    oneofFieldDescriptor = getOneofFieldDescriptor(hVarN);
                    if (z || oneofFieldDescriptor.w() != Descriptors.FieldDescriptor.JavaType.STRING) {
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    } else {
                        treeMap.put(oneofFieldDescriptor, getFieldRaw(oneofFieldDescriptor));
                    }
                }
            } else if (oneofFieldDescriptor.isRepeated()) {
                List list = (List) getField(oneofFieldDescriptor);
                if (!list.isEmpty()) {
                    treeMap.put(oneofFieldDescriptor, list);
                }
            } else if (hasField(oneofFieldDescriptor)) {
                if (z) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                } else {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
            }
            iN++;
        }
        return treeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    public static <ContainingType extends p0, Type> l<ContainingType, Type> newFileScopedGeneratedExtension(Class cls, p0 p0Var) {
        return new l<>(null, cls, p0Var, Extension.ExtensionType.IMMUTABLE);
    }

    public static <ContainingType extends p0, Type> l<ContainingType, Type> newMessageScopedGeneratedExtension(p0 p0Var, int i2, Class cls, p0 p0Var2) {
        return new l<>(new b(p0Var, i2), cls, p0Var2, Extension.ExtensionType.IMMUTABLE);
    }

    public static <M extends p0> M parseDelimitedWithIOException(vkh<M> vkhVar, InputStream inputStream) throws IOException {
        try {
            return vkhVar.parseDelimitedFrom(inputStream);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    public static <M extends p0> M parseWithIOException(vkh<M> vkhVar, InputStream inputStream) throws IOException {
        try {
            return vkhVar.parseFrom(inputStream);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    public static void writeString(CodedOutputStream codedOutputStream, int i2, Object obj) throws IOException {
        if (obj instanceof String) {
            codedOutputStream.Y0(i2, (String) obj);
        } else {
            codedOutputStream.q0(i2, (ByteString) obj);
        }
    }

    public static void writeStringNoTag(CodedOutputStream codedOutputStream, Object obj) throws IOException {
        if (obj instanceof String) {
            codedOutputStream.Z0((String) obj);
        } else {
            codedOutputStream.r0((ByteString) obj);
        }
    }

    @Override // com.google.protobuf.s0
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return Collections.unmodifiableMap(getAllFieldsMutable(false));
    }

    public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(getAllFieldsMutable(true));
    }

    @Override // defpackage.bsf, com.google.protobuf.s0
    public abstract /* synthetic */ p0 getDefaultInstanceForType();

    @Override // defpackage.bsf, com.google.protobuf.s0
    public abstract /* synthetic */ q0 getDefaultInstanceForType();

    @Override // com.google.protobuf.s0
    public Descriptors.b getDescriptorForType() {
        return internalGetFieldAccessorTable().f9526a;
    }

    @Override // com.google.protobuf.s0
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().f(fieldDescriptor).b(this);
    }

    public Object getFieldRaw(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().f(fieldDescriptor).c(this);
    }

    @Override // com.google.protobuf.a
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.h hVar) {
        return internalGetFieldAccessorTable().g(hVar).c(this);
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<? extends GeneratedMessage> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i2) {
        return internalGetFieldAccessorTable().f(fieldDescriptor).j(this, i2);
    }

    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().f(fieldDescriptor).f(this);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i2 = this.memoizedSize;
        if (i2 != -1) {
            return i2;
        }
        int iE = MessageReflection.e(this, getAllFieldsRaw());
        this.memoizedSize = iE;
        return iE;
    }

    @Override // com.google.protobuf.s0
    public r1 getUnknownFields() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.google.protobuf.s0
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().f(fieldDescriptor).n(this);
    }

    @Override // com.google.protobuf.a
    public boolean hasOneof(Descriptors.h hVar) {
        return internalGetFieldAccessorTable().g(hVar).e(this);
    }

    public abstract k internalGetFieldAccessorTable();

    public l0 internalGetMapField(int i2) {
        throw new RuntimeException("No map fields found in " + getClass().getName());
    }

    @Override // com.google.protobuf.a, defpackage.bsf
    public boolean isInitialized() {
        for (Descriptors.FieldDescriptor fieldDescriptor : getDescriptorForType().o()) {
            if (fieldDescriptor.F() && !hasField(fieldDescriptor)) {
                return false;
            }
            if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (fieldDescriptor.isRepeated()) {
                    Iterator it = ((List) getField(fieldDescriptor)).iterator();
                    while (it.hasNext()) {
                        if (!((p0) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(fieldDescriptor) && !((p0) getField(fieldDescriptor)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void makeExtensionsImmutable() {
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public abstract /* synthetic */ p0.a newBuilderForType();

    public abstract p0.a newBuilderForType(g gVar);

    @Override // com.google.protobuf.a
    public p0.a newBuilderForType(com.google.protobuf.a.b bVar) {
        return newBuilderForType((g) new a(bVar));
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public abstract /* synthetic */ q0.a newBuilderForType();

    public boolean parseUnknownField(com.google.protobuf.j jVar, r1.b bVar, t tVar, int i2) throws IOException {
        return bVar.j(i2, jVar);
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public abstract /* synthetic */ p0.a toBuilder();

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public abstract /* synthetic */ q0.a toBuilder();

    public Object writeReplace() throws ObjectStreamException {
        return new GeneratedMessageLite.SerializedForm(this);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        MessageReflection.k(this, getAllFieldsRaw(), codedOutputStream, false);
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage> extends GeneratedMessage implements s0 {
        private static final long serialVersionUID = 1;
        private final a0<Descriptors.FieldDescriptor> extensions;

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> f9516a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry<Descriptors.FieldDescriptor, Object> f9517b;
            public final boolean c;

            public /* synthetic */ a(ExtendableMessage extendableMessage, boolean z, a aVar) {
                this(z);
            }

            public a(boolean z) {
                Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> itF = ExtendableMessage.this.extensions.F();
                this.f9516a = itF;
                if (itF.hasNext()) {
                    this.f9517b = itF.next();
                }
                this.c = z;
            }
        }

        public ExtendableMessage() {
            this.extensions = a0.K();
        }

        private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.o() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        private void verifyExtensionContainingType(Extension<MessageType, ?> extension) {
            if (extension.c().o() == getDescriptorForType()) {
                return;
            }
            throw new IllegalArgumentException("Extension is for type \"" + extension.c().o().b() + "\" which does not match message type \"" + getDescriptorForType().b() + "\".");
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.C();
        }

        public int extensionsSerializedSize() {
            return this.extensions.x();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.t();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.s0
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage
        public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage, defpackage.bsf, com.google.protobuf.s0
        public abstract /* synthetic */ p0 getDefaultInstanceForType();

        @Override // com.google.protobuf.GeneratedMessage, defpackage.bsf, com.google.protobuf.s0
        public abstract /* synthetic */ q0 getDefaultInstanceForType();

        public final <Type> Type getExtension(r<MessageType, Type> rVar) {
            Extension<MessageType, ?> extensionCheckNotLite = GeneratedMessage.checkNotLite(rVar);
            verifyExtensionContainingType(extensionCheckNotLite);
            Descriptors.FieldDescriptor fieldDescriptorC = extensionCheckNotLite.c();
            Object objS = this.extensions.s(fieldDescriptorC);
            if (objS != null) {
                return (Type) extensionCheckNotLite.b(objS);
            }
            if (fieldDescriptorC.isRepeated()) {
                return (Type) Collections.emptyList();
            }
            return fieldDescriptorC.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? (Type) extensionCheckNotLite.d() : (Type) extensionCheckNotLite.b(fieldDescriptorC.p());
        }

        public final <Type> int getExtensionCount(r<MessageType, List<Type>> rVar) {
            Extension<MessageType, ?> extensionCheckNotLite = GeneratedMessage.checkNotLite(rVar);
            verifyExtensionContainingType(extensionCheckNotLite);
            return this.extensions.w(extensionCheckNotLite.c());
        }

        public Map<Descriptors.FieldDescriptor, Object> getExtensionFields() {
            return this.extensions.r();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.s0
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.B()) {
                return super.getField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            Object objS = this.extensions.s(fieldDescriptor);
            if (objS != null) {
                return objS;
            }
            if (fieldDescriptor.isRepeated()) {
                return Collections.emptyList();
            }
            return fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? p.e(fieldDescriptor.x()) : fieldDescriptor.p();
        }

        @Override // com.google.protobuf.GeneratedMessage
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            if (!fieldDescriptor.B()) {
                return super.getRepeatedField(fieldDescriptor, i);
            }
            verifyContainingType(fieldDescriptor);
            return this.extensions.v(fieldDescriptor, i);
        }

        @Override // com.google.protobuf.GeneratedMessage
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.B()) {
                return super.getRepeatedFieldCount(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            return this.extensions.w(fieldDescriptor);
        }

        public final <Type> boolean hasExtension(r<MessageType, Type> rVar) {
            Extension<MessageType, ?> extensionCheckNotLite = GeneratedMessage.checkNotLite(rVar);
            verifyExtensionContainingType(extensionCheckNotLite);
            return this.extensions.z(extensionCheckNotLite.c());
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.s0
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.B()) {
                return super.hasField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            return this.extensions.z(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.a, defpackage.bsf
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        @Override // com.google.protobuf.GeneratedMessage
        public void makeExtensionsImmutable() {
            this.extensions.G();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.q0, com.google.protobuf.p0
        public abstract /* synthetic */ p0.a newBuilderForType();

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.q0, com.google.protobuf.p0
        public abstract /* synthetic */ q0.a newBuilderForType();

        public ExtendableMessage<MessageType>.a newExtensionWriter() {
            return new a(this, false, null);
        }

        public ExtendableMessage<MessageType>.a newMessageSetExtensionWriter() {
            return new a(this, true, null);
        }

        @Override // com.google.protobuf.GeneratedMessage
        public boolean parseUnknownField(com.google.protobuf.j jVar, r1.b bVar, t tVar, int i) throws IOException {
            return MessageReflection.g(jVar, bVar, tVar, getDescriptorForType(), new MessageReflection.c(this.extensions), i);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.q0, com.google.protobuf.p0
        public abstract /* synthetic */ p0.a toBuilder();

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.q0, com.google.protobuf.p0
        public abstract /* synthetic */ q0.a toBuilder();

        public ExtendableMessage(i<MessageType, ?> iVar) {
            super(iVar);
            this.extensions = i.a(iVar);
        }

        public final <Type> boolean hasExtension(Extension<MessageType, Type> extension) {
            return hasExtension((r) extension);
        }

        public final <Type> int getExtensionCount(Extension<MessageType, List<Type>> extension) {
            return getExtensionCount((r) extension);
        }

        public final <Type> boolean hasExtension(l<MessageType, Type> lVar) {
            return hasExtension((r) lVar);
        }

        public final <Type> int getExtensionCount(l<MessageType, List<Type>> lVar) {
            return getExtensionCount((r) lVar);
        }

        public final <Type> Type getExtension(r<MessageType, List<Type>> rVar, int i) {
            Extension<MessageType, ?> extensionCheckNotLite = GeneratedMessage.checkNotLite(rVar);
            verifyExtensionContainingType(extensionCheckNotLite);
            return (Type) extensionCheckNotLite.e(this.extensions.v(extensionCheckNotLite.c(), i));
        }

        public final <Type> Type getExtension(Extension<MessageType, Type> extension) {
            return (Type) getExtension((r) extension);
        }

        public final <Type> Type getExtension(l<MessageType, Type> lVar) {
            return (Type) getExtension((r) lVar);
        }

        public final <Type> Type getExtension(Extension<MessageType, List<Type>> extension, int i) {
            return (Type) getExtension((r) extension, i);
        }

        public final <Type> Type getExtension(l<MessageType, List<Type>> lVar, int i) {
            return (Type) getExtension((r) lVar, i);
        }
    }

    public static <ContainingType extends p0, Type> l<ContainingType, Type> newFileScopedGeneratedExtension(Class cls, p0 p0Var, String str, String str2) {
        return new l<>(new d(cls, str, str2), cls, p0Var, Extension.ExtensionType.MUTABLE);
    }

    public static <ContainingType extends p0, Type> l<ContainingType, Type> newMessageScopedGeneratedExtension(p0 p0Var, String str, Class cls, p0 p0Var2) {
        return new l<>(new c(p0Var, str), cls, p0Var2, Extension.ExtensionType.MUTABLE);
    }

    public GeneratedMessage(f<?> fVar) {
        this.unknownFields = fVar.getUnknownFields();
    }

    public static <M extends p0> M parseDelimitedWithIOException(vkh<M> vkhVar, InputStream inputStream, t tVar) throws IOException {
        try {
            return vkhVar.parseDelimitedFrom(inputStream, tVar);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    public static <M extends p0> M parseWithIOException(vkh<M> vkhVar, InputStream inputStream, t tVar) throws IOException {
        try {
            return vkhVar.parseFrom(inputStream, tVar);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    public static <M extends p0> M parseWithIOException(vkh<M> vkhVar, com.google.protobuf.j jVar) throws IOException {
        try {
            return vkhVar.parseFrom(jVar);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    public static <M extends p0> M parseWithIOException(vkh<M> vkhVar, com.google.protobuf.j jVar, t tVar) throws IOException {
        try {
            return vkhVar.parseFrom(jVar, tVar);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }
}
