package com.google.protobuf;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.mi.health.course.export.data.CourseConfigModel;
import defpackage.jbq;
import defpackage.vkh;
import defpackage.xdi;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GeneratedMessageV3 extends com.google.protobuf.a implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected r1 unknownFields;

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.protobuf.a.b f9551a;

        public a(com.google.protobuf.a.b bVar) {
            this.f9551a = bVar;
        }

        @Override // com.google.protobuf.a.b
        public void a() {
            this.f9551a.a();
        }
    }

    public static abstract class b<BuilderType extends b<BuilderType>> extends com.google.protobuf.a.AbstractC0258a<BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f9553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b<BuilderType>.a f9554b;
        public boolean c;
        public r1 d;

        public class a implements c {
            public a() {
            }

            @Override // com.google.protobuf.a.b
            public void a() {
                b.this.onChanged();
            }

            public /* synthetic */ a(b bVar, a aVar) {
                this();
            }
        }

        public b() {
            this(null);
        }

        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BuilderType addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            h().e(fieldDescriptor).f(this, obj);
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BuilderType mo142clear() {
            this.d = r1.c();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public BuilderType clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            h().e(fieldDescriptor).a(this);
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public void dispose() {
            this.f9553a = null;
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType clearOneof(Descriptors.h hVar) {
            h().f(hVar).a(this);
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BuilderType mo144clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.mergeFrom(buildPartial());
            return buildertype;
        }

        public c g() {
            if (this.f9554b == null) {
                this.f9554b = new a(this, null);
            }
            return this.f9554b;
        }

        @Override // com.google.protobuf.s0
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            return Collections.unmodifiableMap(getAllFieldsMutable());
        }

        public final Map<Descriptors.FieldDescriptor, Object> getAllFieldsMutable() {
            TreeMap treeMap = new TreeMap();
            List<Descriptors.FieldDescriptor> listO = h().f9556a.o();
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

        public Descriptors.b getDescriptorForType() {
            return h().f9556a;
        }

        @Override // com.google.protobuf.s0
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            Object objC = h().e(fieldDescriptor).c(this);
            return fieldDescriptor.isRepeated() ? Collections.unmodifiableList((List) objC) : objC;
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public p0.a getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            return h().e(fieldDescriptor).l(this);
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.h hVar) {
            return h().f(hVar).b(this);
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public p0.a getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            return h().e(fieldDescriptor).k(this, i);
        }

        @Override // com.google.protobuf.s0
        public final r1 getUnknownFields() {
            return this.d;
        }

        public abstract e h();

        @Override // com.google.protobuf.s0
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return h().e(fieldDescriptor).h(this);
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public boolean hasOneof(Descriptors.h hVar) {
            return h().f(hVar).d(this);
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType mo145mergeUnknownFields(r1 r1Var) {
            return (BuilderType) setUnknownFields(r1.h(this.d).q(r1Var).build());
        }

        public l0 internalGetMapField(int i) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }

        public l0 internalGetMutableMapField(int i) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }

        public boolean isClean() {
            return this.c;
        }

        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public BuilderType setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            h().e(fieldDescriptor).e(this, obj);
            return this;
        }

        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public BuilderType setUnknownFields(r1 r1Var) {
            return (BuilderType) l(r1Var);
        }

        public final BuilderType l(r1 r1Var) {
            this.d = r1Var;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public void markClean() {
            this.c = true;
        }

        @Override // com.google.protobuf.p0.a
        public p0.a newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            return h().e(fieldDescriptor).newBuilder();
        }

        public void onBuilt() {
            if (this.f9553a != null) {
                markClean();
            }
        }

        public final void onChanged() {
            c cVar;
            if (!this.c || (cVar = this.f9553a) == null) {
                return;
            }
            cVar.a();
            this.c = false;
        }

        public b(c cVar) {
            this.d = r1.c();
            this.f9553a = cVar;
        }
    }

    public interface c extends com.google.protobuf.a.b {
    }

    public static abstract class d<MessageType extends ExtendableMessage, BuilderType extends d<MessageType, BuilderType>> extends b<BuilderType> implements s0 {
        public a0.b<Descriptors.FieldDescriptor> e;

        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a0<Descriptors.FieldDescriptor> q() {
            a0.b<Descriptors.FieldDescriptor> bVar = this.e;
            return bVar == null ? a0.q() : bVar.b();
        }

        private void w(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.o() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.s0
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable();
            a0.b<Descriptors.FieldDescriptor> bVar = this.e;
            if (bVar != null) {
                allFieldsMutable.putAll(bVar.e());
            }
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.s0
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.B()) {
                return super.getField(fieldDescriptor);
            }
            w(fieldDescriptor);
            a0.b<Descriptors.FieldDescriptor> bVar = this.e;
            Object objF = bVar == null ? null : bVar.f(fieldDescriptor);
            if (objF == null) {
                return fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? p.e(fieldDescriptor.x()) : fieldDescriptor.p();
            }
            return objF;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        public p0.a getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.B()) {
                return super.getFieldBuilder(fieldDescriptor);
            }
            w(fieldDescriptor);
            if (fieldDescriptor.w() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            t();
            Object objG = this.e.g(fieldDescriptor);
            if (objG == null) {
                p.b bVarH = p.h(fieldDescriptor.x());
                this.e.p(fieldDescriptor, bVarH);
                onChanged();
                return bVarH;
            }
            if (objG instanceof p0.a) {
                return (p0.a) objG;
            }
            if (!(objG instanceof p0)) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            p0.a builder = ((p0) objG).toBuilder();
            this.e.p(fieldDescriptor, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        public p0.a getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            if (!fieldDescriptor.B()) {
                return super.getRepeatedFieldBuilder(fieldDescriptor, i);
            }
            w(fieldDescriptor);
            t();
            if (fieldDescriptor.w() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Object objH = this.e.h(fieldDescriptor, i);
            if (objH instanceof p0.a) {
                return (p0.a) objH;
            }
            if (!(objH instanceof p0)) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            p0.a builder = ((p0) objH).toBuilder();
            this.e.q(fieldDescriptor, i, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.s0
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.B()) {
                return super.hasField(fieldDescriptor);
            }
            w(fieldDescriptor);
            a0.b<Descriptors.FieldDescriptor> bVar = this.e;
            if (bVar == null) {
                return false;
            }
            return bVar.i(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        public p0.a newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            return fieldDescriptor.B() ? p.h(fieldDescriptor.x()) : super.newBuilderForField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public BuilderType addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.B()) {
                return (BuilderType) super.addRepeatedField(fieldDescriptor, obj);
            }
            w(fieldDescriptor);
            t();
            this.e.a(fieldDescriptor, obj);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public BuilderType mo142clear() {
            this.e = null;
            return (BuilderType) super.mo142clear();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public BuilderType clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.B()) {
                return (BuilderType) super.clearField(fieldDescriptor);
            }
            w(fieldDescriptor);
            t();
            this.e.c(fieldDescriptor);
            onChanged();
            return this;
        }

        public final void t() {
            if (this.e == null) {
                this.e = a0.J();
            }
        }

        public final void u(ExtendableMessage extendableMessage) {
            if (extendableMessage.extensions != null) {
                t();
                this.e.j(extendableMessage.extensions);
                onChanged();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public BuilderType setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.B()) {
                return (BuilderType) super.setField(fieldDescriptor, obj);
            }
            w(fieldDescriptor);
            t();
            this.e.p(fieldDescriptor, obj);
            onChanged();
            return this;
        }

        public d(c cVar) {
            super(cVar);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Descriptors.b f9556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a[] f9557b;
        public String[] c;
        public final c[] d;
        public volatile boolean e = false;

        public interface a {
            void a(b bVar);

            Object b(GeneratedMessageV3 generatedMessageV3);

            Object c(b bVar);

            int d(GeneratedMessageV3 generatedMessageV3);

            void e(b bVar, Object obj);

            void f(b bVar, Object obj);

            boolean g(GeneratedMessageV3 generatedMessageV3);

            boolean h(b bVar);

            Object i(GeneratedMessageV3 generatedMessageV3, int i);

            Object j(GeneratedMessageV3 generatedMessageV3);

            p0.a k(b bVar, int i);

            p0.a l(b bVar);

            p0.a newBuilder();
        }

        public static class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Descriptors.FieldDescriptor f9558a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p0 f9559b;

            public b(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends b> cls2) {
                this.f9558a = fieldDescriptor;
                this.f9559b = o((GeneratedMessageV3) GeneratedMessageV3.invokeOrDie(GeneratedMessageV3.getMethodOrDie(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).k();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public void a(b bVar) {
                p(bVar).l().clear();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public Object b(GeneratedMessageV3 generatedMessageV3) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < d(generatedMessageV3); i++) {
                    arrayList.add(i(generatedMessageV3, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public Object c(b bVar) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < r(bVar); i++) {
                    arrayList.add(q(bVar, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public int d(GeneratedMessageV3 generatedMessageV3) {
                return o(generatedMessageV3).i().size();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public void e(b bVar, Object obj) {
                a(bVar);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    f(bVar, it.next());
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public void f(b bVar, Object obj) {
                p(bVar).l().add(m((p0) obj));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public boolean g(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public boolean h(b bVar) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public Object i(GeneratedMessageV3 generatedMessageV3, int i) {
                return o(generatedMessageV3).i().get(i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public Object j(GeneratedMessageV3 generatedMessageV3) {
                return b(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a k(b bVar, int i) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a l(b bVar) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            public final p0 m(p0 p0Var) {
                if (p0Var == null) {
                    return null;
                }
                return this.f9559b.getClass().isInstance(p0Var) ? p0Var : this.f9559b.toBuilder().mergeFrom(p0Var).build();
            }

            public final l0<?, ?> n(b bVar) {
                return bVar.internalGetMapField(this.f9558a.getNumber());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a newBuilder() {
                return this.f9559b.newBuilderForType();
            }

            public final l0<?, ?> o(GeneratedMessageV3 generatedMessageV3) {
                return generatedMessageV3.internalGetMapField(this.f9558a.getNumber());
            }

            public final l0<?, ?> p(b bVar) {
                return bVar.internalGetMutableMapField(this.f9558a.getNumber());
            }

            public Object q(b bVar, int i) {
                return n(bVar).i().get(i);
            }

            public int r(b bVar) {
                return n(bVar).i().size();
            }
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Descriptors.b f9560a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final java.lang.reflect.Method f9561b;
            public final java.lang.reflect.Method c;
            public final java.lang.reflect.Method d;
            public final Descriptors.FieldDescriptor e;

            public c(Descriptors.b bVar, int i, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends b> cls2) {
                this.f9560a = bVar;
                Descriptors.h hVar = bVar.r().get(i);
                if (hVar.r()) {
                    this.f9561b = null;
                    this.c = null;
                    this.e = hVar.o().get(0);
                } else {
                    this.f9561b = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Case", new Class[0]);
                    this.c = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Case", new Class[0]);
                    this.e = null;
                }
                this.d = GeneratedMessageV3.getMethodOrDie(cls2, CervicalMucusRecord.Appearance.CLEAR + str, new Class[0]);
            }

            public void a(b bVar) {
                GeneratedMessageV3.invokeOrDie(this.d, bVar, new Object[0]);
            }

            public Descriptors.FieldDescriptor b(b bVar) {
                Descriptors.FieldDescriptor fieldDescriptor = this.e;
                if (fieldDescriptor != null) {
                    if (bVar.hasField(fieldDescriptor)) {
                        return this.e;
                    }
                    return null;
                }
                int number = ((d0.c) GeneratedMessageV3.invokeOrDie(this.c, bVar, new Object[0])).getNumber();
                if (number > 0) {
                    return this.f9560a.l(number);
                }
                return null;
            }

            public Descriptors.FieldDescriptor c(GeneratedMessageV3 generatedMessageV3) {
                Descriptors.FieldDescriptor fieldDescriptor = this.e;
                if (fieldDescriptor != null) {
                    if (generatedMessageV3.hasField(fieldDescriptor)) {
                        return this.e;
                    }
                    return null;
                }
                int number = ((d0.c) GeneratedMessageV3.invokeOrDie(this.f9561b, generatedMessageV3, new Object[0])).getNumber();
                if (number > 0) {
                    return this.f9560a.l(number);
                }
                return null;
            }

            public boolean d(b bVar) {
                Descriptors.FieldDescriptor fieldDescriptor = this.e;
                if (fieldDescriptor != null) {
                    return bVar.hasField(fieldDescriptor);
                }
                return ((d0.c) GeneratedMessageV3.invokeOrDie(this.c, bVar, new Object[0])).getNumber() != 0;
            }

            public boolean e(GeneratedMessageV3 generatedMessageV3) {
                Descriptors.FieldDescriptor fieldDescriptor = this.e;
                if (fieldDescriptor != null) {
                    return generatedMessageV3.hasField(fieldDescriptor);
                }
                return ((d0.c) GeneratedMessageV3.invokeOrDie(this.f9561b, generatedMessageV3, new Object[0])).getNumber() != 0;
            }
        }

        public static final class d extends C0256e {
            public Descriptors.d c;
            public final java.lang.reflect.Method d;
            public final java.lang.reflect.Method e;
            public boolean f;
            public java.lang.reflect.Method g;
            public java.lang.reflect.Method h;
            public java.lang.reflect.Method i;
            public java.lang.reflect.Method j;

            public d(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends b> cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.c = fieldDescriptor.r();
                this.d = GeneratedMessageV3.getMethodOrDie(this.f9562a, "valueOf", Descriptors.e.class);
                this.e = GeneratedMessageV3.getMethodOrDie(this.f9562a, "getValueDescriptor", new Class[0]);
                boolean zY = fieldDescriptor.a().y();
                this.f = zY;
                if (zY) {
                    Class cls3 = Integer.TYPE;
                    this.g = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Value", cls3);
                    this.h = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Value", cls3);
                    this.i = GeneratedMessageV3.getMethodOrDie(cls2, CourseConfigModel.DevCmd.CMD_ACTION_SET + str + "Value", cls3, cls3);
                    this.j = GeneratedMessageV3.getMethodOrDie(cls2, "add" + str + "Value", cls3);
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e, com.google.protobuf.GeneratedMessageV3.e.a
            public Object b(GeneratedMessageV3 generatedMessageV3) {
                ArrayList arrayList = new ArrayList();
                int iD = d(generatedMessageV3);
                for (int i = 0; i < iD; i++) {
                    arrayList.add(i(generatedMessageV3, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e, com.google.protobuf.GeneratedMessageV3.e.a
            public Object c(b bVar) {
                ArrayList arrayList = new ArrayList();
                int iO = o(bVar);
                for (int i = 0; i < iO; i++) {
                    arrayList.add(n(bVar, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e, com.google.protobuf.GeneratedMessageV3.e.a
            public void f(b bVar, Object obj) {
                if (this.f) {
                    GeneratedMessageV3.invokeOrDie(this.j, bVar, Integer.valueOf(((Descriptors.e) obj).getNumber()));
                } else {
                    super.f(bVar, GeneratedMessageV3.invokeOrDie(this.d, null, obj));
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e, com.google.protobuf.GeneratedMessageV3.e.a
            public Object i(GeneratedMessageV3 generatedMessageV3, int i) {
                if (!this.f) {
                    return GeneratedMessageV3.invokeOrDie(this.e, super.i(generatedMessageV3, i), new Object[0]);
                }
                return this.c.k(((Integer) GeneratedMessageV3.invokeOrDie(this.g, generatedMessageV3, Integer.valueOf(i))).intValue());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e
            public Object n(b bVar, int i) {
                if (!this.f) {
                    return GeneratedMessageV3.invokeOrDie(this.e, super.n(bVar, i), new Object[0]);
                }
                return this.c.k(((Integer) GeneratedMessageV3.invokeOrDie(this.h, bVar, Integer.valueOf(i))).intValue());
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageV3$e$e, reason: collision with other inner class name */
        public static class C0256e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Class f9562a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a f9563b;

            /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageV3$e$e$a */
            public interface a {
                void a(b<?> bVar);

                Object b(GeneratedMessageV3 generatedMessageV3);

                Object c(b<?> bVar);

                int d(GeneratedMessageV3 generatedMessageV3);

                Object e(b<?> bVar, int i);

                void f(b<?> bVar, Object obj);

                int g(b<?> bVar);

                Object i(GeneratedMessageV3 generatedMessageV3, int i);
            }

            /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageV3$e$e$b */
            public static final class b implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final java.lang.reflect.Method f9564a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final java.lang.reflect.Method f9565b;
                public final java.lang.reflect.Method c;
                public final java.lang.reflect.Method d;
                public final java.lang.reflect.Method e;
                public final java.lang.reflect.Method f;
                public final java.lang.reflect.Method g;
                public final java.lang.reflect.Method h;
                public final java.lang.reflect.Method i;

                public b(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends b> cls2) {
                    this.f9564a = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "List", new Class[0]);
                    this.f9565b = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "List", new Class[0]);
                    StringBuilder sb = new StringBuilder();
                    sb.append("get");
                    sb.append(str);
                    String string = sb.toString();
                    Class cls3 = Integer.TYPE;
                    java.lang.reflect.Method methodOrDie = GeneratedMessageV3.getMethodOrDie(cls, string, cls3);
                    this.c = methodOrDie;
                    this.d = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str, cls3);
                    Class<?> returnType = methodOrDie.getReturnType();
                    this.e = GeneratedMessageV3.getMethodOrDie(cls2, CourseConfigModel.DevCmd.CMD_ACTION_SET + str, cls3, returnType);
                    this.f = GeneratedMessageV3.getMethodOrDie(cls2, "add" + str, returnType);
                    this.g = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Count", new Class[0]);
                    this.h = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Count", new Class[0]);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(CervicalMucusRecord.Appearance.CLEAR);
                    sb2.append(str);
                    this.i = GeneratedMessageV3.getMethodOrDie(cls2, sb2.toString(), new Class[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e.a
                public void a(b<?> bVar) {
                    GeneratedMessageV3.invokeOrDie(this.i, bVar, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e.a
                public Object b(GeneratedMessageV3 generatedMessageV3) {
                    return GeneratedMessageV3.invokeOrDie(this.f9564a, generatedMessageV3, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e.a
                public Object c(b<?> bVar) {
                    return GeneratedMessageV3.invokeOrDie(this.f9565b, bVar, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e.a
                public int d(GeneratedMessageV3 generatedMessageV3) {
                    return ((Integer) GeneratedMessageV3.invokeOrDie(this.g, generatedMessageV3, new Object[0])).intValue();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e.a
                public Object e(b<?> bVar, int i) {
                    return GeneratedMessageV3.invokeOrDie(this.d, bVar, Integer.valueOf(i));
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e.a
                public void f(b<?> bVar, Object obj) {
                    GeneratedMessageV3.invokeOrDie(this.f, bVar, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e.a
                public int g(b<?> bVar) {
                    return ((Integer) GeneratedMessageV3.invokeOrDie(this.h, bVar, new Object[0])).intValue();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e.a
                public Object i(GeneratedMessageV3 generatedMessageV3, int i) {
                    return GeneratedMessageV3.invokeOrDie(this.c, generatedMessageV3, Integer.valueOf(i));
                }
            }

            public C0256e(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends b> cls2) {
                b bVar = new b(fieldDescriptor, str, cls, cls2);
                this.f9562a = bVar.c.getReturnType();
                this.f9563b = m(bVar);
            }

            public static a m(b bVar) {
                return bVar;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public void a(b bVar) {
                this.f9563b.a(bVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public Object b(GeneratedMessageV3 generatedMessageV3) {
                return this.f9563b.b(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public Object c(b bVar) {
                return this.f9563b.c(bVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public int d(GeneratedMessageV3 generatedMessageV3) {
                return this.f9563b.d(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public void e(b bVar, Object obj) {
                a(bVar);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    f(bVar, it.next());
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public void f(b bVar, Object obj) {
                this.f9563b.f(bVar, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public boolean g(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public boolean h(b bVar) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public Object i(GeneratedMessageV3 generatedMessageV3, int i) {
                return this.f9563b.i(generatedMessageV3, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public Object j(GeneratedMessageV3 generatedMessageV3) {
                return b(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a k(b bVar, int i) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a l(b bVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            public Object n(b bVar, int i) {
                return this.f9563b.e(bVar, i);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            public int o(b bVar) {
                return this.f9563b.g(bVar);
            }
        }

        public static final class f extends C0256e {
            public final java.lang.reflect.Method c;
            public final java.lang.reflect.Method d;

            public f(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends b> cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.c = GeneratedMessageV3.getMethodOrDie(this.f9562a, "newBuilder", new Class[0]);
                this.d = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Builder", Integer.TYPE);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e, com.google.protobuf.GeneratedMessageV3.e.a
            public void f(b bVar, Object obj) {
                super.f(bVar, p(obj));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e, com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a k(b bVar, int i) {
                return (p0.a) GeneratedMessageV3.invokeOrDie(this.d, bVar, Integer.valueOf(i));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.C0256e, com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a newBuilder() {
                return (p0.a) GeneratedMessageV3.invokeOrDie(this.c, null, new Object[0]);
            }

            public final Object p(Object obj) {
                return this.f9562a.isInstance(obj) ? obj : ((p0.a) GeneratedMessageV3.invokeOrDie(this.c, null, new Object[0])).mergeFrom((p0) obj).build();
            }
        }

        public static final class g extends h {
            public Descriptors.d f;
            public java.lang.reflect.Method g;
            public java.lang.reflect.Method h;
            public boolean i;
            public java.lang.reflect.Method j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public java.lang.reflect.Method f9566k;
            public java.lang.reflect.Method l;

            public g(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends b> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.f = fieldDescriptor.r();
                this.g = GeneratedMessageV3.getMethodOrDie(this.f9567a, "valueOf", Descriptors.e.class);
                this.h = GeneratedMessageV3.getMethodOrDie(this.f9567a, "getValueDescriptor", new Class[0]);
                boolean zY = fieldDescriptor.a().y();
                this.i = zY;
                if (zY) {
                    this.j = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Value", new Class[0]);
                    this.f9566k = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Value", new Class[0]);
                    this.l = GeneratedMessageV3.getMethodOrDie(cls2, CourseConfigModel.DevCmd.CMD_ACTION_SET + str + "Value", Integer.TYPE);
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.h, com.google.protobuf.GeneratedMessageV3.e.a
            public Object b(GeneratedMessageV3 generatedMessageV3) {
                if (!this.i) {
                    return GeneratedMessageV3.invokeOrDie(this.h, super.b(generatedMessageV3), new Object[0]);
                }
                return this.f.k(((Integer) GeneratedMessageV3.invokeOrDie(this.j, generatedMessageV3, new Object[0])).intValue());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.h, com.google.protobuf.GeneratedMessageV3.e.a
            public Object c(b bVar) {
                if (!this.i) {
                    return GeneratedMessageV3.invokeOrDie(this.h, super.c(bVar), new Object[0]);
                }
                return this.f.k(((Integer) GeneratedMessageV3.invokeOrDie(this.f9566k, bVar, new Object[0])).intValue());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.h, com.google.protobuf.GeneratedMessageV3.e.a
            public void e(b bVar, Object obj) {
                if (this.i) {
                    GeneratedMessageV3.invokeOrDie(this.l, bVar, Integer.valueOf(((Descriptors.e) obj).getNumber()));
                } else {
                    super.e(bVar, GeneratedMessageV3.invokeOrDie(this.g, null, obj));
                }
            }
        }

        public static class h implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Class<?> f9567a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Descriptors.FieldDescriptor f9568b;
            public final boolean c;
            public final boolean d;
            public final a e;

            public interface a {
                void a(b<?> bVar);

                Object b(GeneratedMessageV3 generatedMessageV3);

                Object c(b<?> bVar);

                int d(GeneratedMessageV3 generatedMessageV3);

                void e(b<?> bVar, Object obj);

                int f(b<?> bVar);

                boolean g(GeneratedMessageV3 generatedMessageV3);

                boolean h(b<?> bVar);
            }

            public static final class b implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final java.lang.reflect.Method f9569a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final java.lang.reflect.Method f9570b;
                public final java.lang.reflect.Method c;
                public final java.lang.reflect.Method d;
                public final java.lang.reflect.Method e;
                public final java.lang.reflect.Method f;
                public final java.lang.reflect.Method g;
                public final java.lang.reflect.Method h;

                public b(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends b> cls2, String str2, boolean z, boolean z2) {
                    java.lang.reflect.Method methodOrDie;
                    java.lang.reflect.Method methodOrDie2;
                    java.lang.reflect.Method methodOrDie3;
                    java.lang.reflect.Method methodOrDie4 = GeneratedMessageV3.getMethodOrDie(cls, "get" + str, new Class[0]);
                    this.f9569a = methodOrDie4;
                    this.f9570b = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str, new Class[0]);
                    this.c = GeneratedMessageV3.getMethodOrDie(cls2, CourseConfigModel.DevCmd.CMD_ACTION_SET + str, methodOrDie4.getReturnType());
                    java.lang.reflect.Method methodOrDie5 = null;
                    if (z2) {
                        methodOrDie = GeneratedMessageV3.getMethodOrDie(cls, "has" + str, new Class[0]);
                    } else {
                        methodOrDie = null;
                    }
                    this.d = methodOrDie;
                    if (z2) {
                        methodOrDie2 = GeneratedMessageV3.getMethodOrDie(cls2, "has" + str, new Class[0]);
                    } else {
                        methodOrDie2 = null;
                    }
                    this.e = methodOrDie2;
                    this.f = GeneratedMessageV3.getMethodOrDie(cls2, CervicalMucusRecord.Appearance.CLEAR + str, new Class[0]);
                    if (z) {
                        methodOrDie3 = GeneratedMessageV3.getMethodOrDie(cls, "get" + str2 + "Case", new Class[0]);
                    } else {
                        methodOrDie3 = null;
                    }
                    this.g = methodOrDie3;
                    if (z) {
                        methodOrDie5 = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str2 + "Case", new Class[0]);
                    }
                    this.h = methodOrDie5;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.h.a
                public void a(b<?> bVar) {
                    GeneratedMessageV3.invokeOrDie(this.f, bVar, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.h.a
                public Object b(GeneratedMessageV3 generatedMessageV3) {
                    return GeneratedMessageV3.invokeOrDie(this.f9569a, generatedMessageV3, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.h.a
                public Object c(b<?> bVar) {
                    return GeneratedMessageV3.invokeOrDie(this.f9570b, bVar, new Object[0]);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.h.a
                public int d(GeneratedMessageV3 generatedMessageV3) {
                    return ((d0.c) GeneratedMessageV3.invokeOrDie(this.g, generatedMessageV3, new Object[0])).getNumber();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.h.a
                public void e(b<?> bVar, Object obj) {
                    GeneratedMessageV3.invokeOrDie(this.c, bVar, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.h.a
                public int f(b<?> bVar) {
                    return ((d0.c) GeneratedMessageV3.invokeOrDie(this.h, bVar, new Object[0])).getNumber();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.h.a
                public boolean g(GeneratedMessageV3 generatedMessageV3) {
                    return ((Boolean) GeneratedMessageV3.invokeOrDie(this.d, generatedMessageV3, new Object[0])).booleanValue();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.e.h.a
                public boolean h(b<?> bVar) {
                    return ((Boolean) GeneratedMessageV3.invokeOrDie(this.e, bVar, new Object[0])).booleanValue();
                }
            }

            public h(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends b> cls2, String str2) {
                boolean z = (fieldDescriptor.n() == null || fieldDescriptor.n().r()) ? false : true;
                this.c = z;
                boolean z2 = fieldDescriptor.a().r() == Descriptors.FileDescriptor.Syntax.PROTO2 || fieldDescriptor.A() || (!z && fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE);
                this.d = z2;
                b bVar = new b(fieldDescriptor, str, cls, cls2, str2, z, z2);
                this.f9568b = fieldDescriptor;
                this.f9567a = bVar.f9569a.getReturnType();
                this.e = m(bVar);
            }

            public static a m(b bVar) {
                return bVar;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public void a(b bVar) {
                this.e.a(bVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public Object b(GeneratedMessageV3 generatedMessageV3) {
                return this.e.b(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public Object c(b bVar) {
                return this.e.c(bVar);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public int d(GeneratedMessageV3 generatedMessageV3) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public void e(b bVar, Object obj) {
                this.e.e(bVar, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public void f(b bVar, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public boolean g(GeneratedMessageV3 generatedMessageV3) {
                if (this.d) {
                    return this.e.g(generatedMessageV3);
                }
                if (this.c) {
                    return this.e.d(generatedMessageV3) == this.f9568b.getNumber();
                }
                return !b(generatedMessageV3).equals(this.f9568b.p());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public boolean h(b bVar) {
                if (this.d) {
                    return this.e.h(bVar);
                }
                if (this.c) {
                    return this.e.f(bVar) == this.f9568b.getNumber();
                }
                return !c(bVar).equals(this.f9568b.p());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public Object i(GeneratedMessageV3 generatedMessageV3, int i) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public Object j(GeneratedMessageV3 generatedMessageV3) {
                return b(generatedMessageV3);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a k(b bVar, int i) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a l(b bVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a newBuilder() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }
        }

        public static final class i extends h {
            public final java.lang.reflect.Method f;
            public final java.lang.reflect.Method g;

            public i(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends b> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.f = GeneratedMessageV3.getMethodOrDie(this.f9567a, "newBuilder", new Class[0]);
                this.g = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Builder", new Class[0]);
            }

            private Object n(Object obj) {
                return this.f9567a.isInstance(obj) ? obj : ((p0.a) GeneratedMessageV3.invokeOrDie(this.f, null, new Object[0])).mergeFrom((p0) obj).buildPartial();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.h, com.google.protobuf.GeneratedMessageV3.e.a
            public void e(b bVar, Object obj) {
                super.e(bVar, n(obj));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.h, com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a l(b bVar) {
                return (p0.a) GeneratedMessageV3.invokeOrDie(this.g, bVar, new Object[0]);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.h, com.google.protobuf.GeneratedMessageV3.e.a
            public p0.a newBuilder() {
                return (p0.a) GeneratedMessageV3.invokeOrDie(this.f, null, new Object[0]);
            }
        }

        public static final class j extends h {
            public final java.lang.reflect.Method f;
            public final java.lang.reflect.Method g;
            public final java.lang.reflect.Method h;

            public j(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends GeneratedMessageV3> cls, Class<? extends b> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.f = GeneratedMessageV3.getMethodOrDie(cls, "get" + str + "Bytes", new Class[0]);
                this.g = GeneratedMessageV3.getMethodOrDie(cls2, "get" + str + "Bytes", new Class[0]);
                this.h = GeneratedMessageV3.getMethodOrDie(cls2, CourseConfigModel.DevCmd.CMD_ACTION_SET + str + "Bytes", ByteString.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.h, com.google.protobuf.GeneratedMessageV3.e.a
            public void e(b bVar, Object obj) {
                if (obj instanceof ByteString) {
                    GeneratedMessageV3.invokeOrDie(this.h, bVar, obj);
                } else {
                    super.e(bVar, obj);
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.e.h, com.google.protobuf.GeneratedMessageV3.e.a
            public Object j(GeneratedMessageV3 generatedMessageV3) {
                return GeneratedMessageV3.invokeOrDie(this.f, generatedMessageV3, new Object[0]);
            }
        }

        public e(Descriptors.b bVar, String[] strArr) {
            this.f9556a = bVar;
            this.c = strArr;
            this.f9557b = new a[bVar.o().size()];
            this.d = new c[bVar.r().size()];
        }

        public e d(Class<? extends GeneratedMessageV3> cls, Class<? extends b> cls2) {
            if (this.e) {
                return this;
            }
            synchronized (this) {
                try {
                    if (this.e) {
                        return this;
                    }
                    int length = this.f9557b.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        Descriptors.FieldDescriptor fieldDescriptor = this.f9556a.o().get(i2);
                        String str = fieldDescriptor.n() != null ? this.c[fieldDescriptor.n().p() + length] : null;
                        if (fieldDescriptor.isRepeated()) {
                            if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                                if (fieldDescriptor.C()) {
                                    this.f9557b[i2] = new b(fieldDescriptor, this.c[i2], cls, cls2);
                                } else {
                                    this.f9557b[i2] = new f(fieldDescriptor, this.c[i2], cls, cls2);
                                }
                            } else if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                                this.f9557b[i2] = new d(fieldDescriptor, this.c[i2], cls, cls2);
                            } else {
                                this.f9557b[i2] = new C0256e(fieldDescriptor, this.c[i2], cls, cls2);
                            }
                        } else if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            this.f9557b[i2] = new i(fieldDescriptor, this.c[i2], cls, cls2, str);
                        } else if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                            this.f9557b[i2] = new g(fieldDescriptor, this.c[i2], cls, cls2, str);
                        } else if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.STRING) {
                            this.f9557b[i2] = new j(fieldDescriptor, this.c[i2], cls, cls2, str);
                        } else {
                            this.f9557b[i2] = new h(fieldDescriptor, this.c[i2], cls, cls2, str);
                        }
                        i2++;
                    }
                    int length2 = this.d.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        this.d[i3] = new c(this.f9556a, i3, this.c[i3 + length], cls, cls2);
                    }
                    this.e = true;
                    this.c = null;
                    return this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final a e(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.o() != this.f9556a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            if (fieldDescriptor.B()) {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
            return this.f9557b[fieldDescriptor.u()];
        }

        public final c f(Descriptors.h hVar) {
            if (hVar.m() == this.f9556a) {
                return this.d[hVar.p()];
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f9571a = new f();
    }

    public GeneratedMessageV3() {
        this.unknownFields = r1.c();
    }

    public static boolean canUseUnsafe() {
        return jbq.J() && jbq.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType>, T> Extension<MessageType, T> checkNotLite(r<MessageType, T> rVar) {
        if (rVar.a()) {
            throw new IllegalArgumentException("Expected non-lite extension.");
        }
        return (Extension) rVar;
    }

    public static int computeStringSize(int i, Object obj) {
        return obj instanceof String ? CodedOutputStream.V(i, (String) obj) : CodedOutputStream.h(i, (ByteString) obj);
    }

    public static int computeStringSizeNoTag(Object obj) {
        return obj instanceof String ? CodedOutputStream.W((String) obj) : CodedOutputStream.i((ByteString) obj);
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

    public static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    public Map<Descriptors.FieldDescriptor, Object> getAllFieldsMutable(boolean z) {
        TreeMap treeMap = new TreeMap();
        List<Descriptors.FieldDescriptor> listO = internalGetFieldAccessorTable().f9556a.o();
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

    private static <V> void maybeSerializeBooleanEntryTo(CodedOutputStream codedOutputStream, Map<Boolean, V> map, j0<Boolean, V> j0Var, int i, boolean z) throws IOException {
        if (map.containsKey(Boolean.valueOf(z))) {
            codedOutputStream.K0(i, j0Var.newBuilderForType().n(Boolean.valueOf(z)).q(map.get(Boolean.valueOf(z))).build());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$g] */
    public static d0.g mutableCopy(d0.g gVar) {
        int size = gVar.size();
        return gVar.a2(size == 0 ? 10 : size * 2);
    }

    public static d0.a newBooleanList() {
        return new i();
    }

    public static d0.b newDoubleList() {
        return new n();
    }

    public static d0.f newFloatList() {
        return new b0();
    }

    public static d0.g newIntList() {
        return new c0();
    }

    public static d0.h newLongList() {
        return new i0();
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

    public static <V> void serializeBooleanMapTo(CodedOutputStream codedOutputStream, l0<Boolean, V> l0Var, j0<Boolean, V> j0Var, int i) throws IOException {
        Map<Boolean, V> mapJ = l0Var.j();
        if (!codedOutputStream.g0()) {
            serializeMapTo(codedOutputStream, mapJ, j0Var, i);
        } else {
            maybeSerializeBooleanEntryTo(codedOutputStream, mapJ, j0Var, i, false);
            maybeSerializeBooleanEntryTo(codedOutputStream, mapJ, j0Var, i, true);
        }
    }

    public static <V> void serializeIntegerMapTo(CodedOutputStream codedOutputStream, l0<Integer, V> l0Var, j0<Integer, V> j0Var, int i) throws IOException {
        Map<Integer, V> mapJ = l0Var.j();
        if (!codedOutputStream.g0()) {
            serializeMapTo(codedOutputStream, mapJ, j0Var, i);
            return;
        }
        int size = mapJ.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = mapJ.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            codedOutputStream.K0(i, j0Var.newBuilderForType().n(Integer.valueOf(i4)).q(mapJ.get(Integer.valueOf(i4))).build());
        }
    }

    public static <V> void serializeLongMapTo(CodedOutputStream codedOutputStream, l0<Long, V> l0Var, j0<Long, V> j0Var, int i) throws IOException {
        Map<Long, V> mapJ = l0Var.j();
        if (!codedOutputStream.g0()) {
            serializeMapTo(codedOutputStream, mapJ, j0Var, i);
            return;
        }
        int size = mapJ.size();
        long[] jArr = new long[size];
        Iterator<Long> it = mapJ.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            codedOutputStream.K0(i, j0Var.newBuilderForType().n(Long.valueOf(j)).q(mapJ.get(Long.valueOf(j))).build());
        }
    }

    private static <K, V> void serializeMapTo(CodedOutputStream codedOutputStream, Map<K, V> map, j0<K, V> j0Var, int i) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            codedOutputStream.K0(i, j0Var.newBuilderForType().n(entry.getKey()).q(entry.getValue()).build());
        }
    }

    public static <V> void serializeStringMapTo(CodedOutputStream codedOutputStream, l0<String, V> l0Var, j0<String, V> j0Var, int i) throws IOException {
        Map<String, V> mapJ = l0Var.j();
        if (!codedOutputStream.g0()) {
            serializeMapTo(codedOutputStream, mapJ, j0Var, i);
            return;
        }
        String[] strArr = (String[]) mapJ.keySet().toArray(new String[mapJ.size()]);
        Arrays.sort(strArr);
        for (String str : strArr) {
            codedOutputStream.K0(i, j0Var.newBuilderForType().n(str).q(mapJ.get(str)).build());
        }
    }

    public static void setAlwaysUseFieldBuildersForTesting(boolean z) {
        alwaysUseFieldBuilders = z;
    }

    public static void writeString(CodedOutputStream codedOutputStream, int i, Object obj) throws IOException {
        if (obj instanceof String) {
            codedOutputStream.Y0(i, (String) obj);
        } else {
            codedOutputStream.q0(i, (ByteString) obj);
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
        return internalGetFieldAccessorTable().f9556a;
    }

    @Override // com.google.protobuf.s0
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).b(this);
    }

    public Object getFieldRaw(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).j(this);
    }

    @Override // com.google.protobuf.a
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.h hVar) {
        return internalGetFieldAccessorTable().f(hVar).c(this);
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<? extends GeneratedMessageV3> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).i(this, i);
    }

    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).d(this);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iE = MessageReflection.e(this, getAllFieldsRaw());
        this.memoizedSize = iE;
        return iE;
    }

    public r1 getUnknownFields() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.google.protobuf.s0
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).g(this);
    }

    @Override // com.google.protobuf.a
    public boolean hasOneof(Descriptors.h hVar) {
        return internalGetFieldAccessorTable().f(hVar).e(this);
    }

    public abstract e internalGetFieldAccessorTable();

    public l0 internalGetMapField(int i) {
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

    public void mergeFromAndMakeImmutableInternal(j jVar, t tVar) throws InvalidProtocolBufferException {
        e1 e1VarE = xdi.a().e(this);
        try {
            e1VarE.h(this, k.P(jVar), tVar);
            e1VarE.c(this);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.setUnfinishedMessage(this);
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
        }
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public abstract /* synthetic */ p0.a newBuilderForType();

    public abstract p0.a newBuilderForType(c cVar);

    @Override // com.google.protobuf.a
    public p0.a newBuilderForType(com.google.protobuf.a.b bVar) {
        return newBuilderForType((c) new a(bVar));
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public abstract /* synthetic */ q0.a newBuilderForType();

    public Object newInstance(f fVar) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    public boolean parseUnknownField(j jVar, r1.b bVar, t tVar, int i) throws IOException {
        return jVar.M() ? jVar.N(i) : bVar.j(i, jVar);
    }

    public boolean parseUnknownFieldProto3(j jVar, r1.b bVar, t tVar, int i) throws IOException {
        return parseUnknownField(jVar, bVar, tVar, i);
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

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage> extends GeneratedMessageV3 implements s0 {
        private static final long serialVersionUID = 1;
        private final a0<Descriptors.FieldDescriptor> extensions;

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> f9549a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry<Descriptors.FieldDescriptor, Object> f9550b;
            public final boolean c;

            public /* synthetic */ a(ExtendableMessage extendableMessage, boolean z, a aVar) {
                this(z);
            }

            public void a(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<Descriptors.FieldDescriptor, Object> entry = this.f9550b;
                    if (entry == null || entry.getKey().getNumber() >= i) {
                        return;
                    }
                    Descriptors.FieldDescriptor key = this.f9550b.getKey();
                    if (!this.c || key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated()) {
                        a0.Q(key, this.f9550b.getValue(), codedOutputStream);
                    } else if (this.f9550b instanceof e0.b) {
                        codedOutputStream.O0(key.getNumber(), ((e0.b) this.f9550b).a().f());
                    } else {
                        codedOutputStream.N0(key.getNumber(), (p0) this.f9550b.getValue());
                    }
                    if (this.f9549a.hasNext()) {
                        this.f9550b = this.f9549a.next();
                    } else {
                        this.f9550b = null;
                    }
                }
            }

            public a(boolean z) {
                Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> itF = ExtendableMessage.this.extensions.F();
                this.f9549a = itF;
                if (itF.hasNext()) {
                    this.f9550b = itF.next();
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public abstract /* synthetic */ p0 getDefaultInstanceForType();

        @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
        public abstract /* synthetic */ q0 getDefaultInstanceForType();

        public final <Type> Type getExtension(r<MessageType, Type> rVar) {
            Extension<MessageType, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(rVar);
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
            Extension<MessageType, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(rVar);
            verifyExtensionContainingType(extensionCheckNotLite);
            return this.extensions.w(extensionCheckNotLite.c());
        }

        public Map<Descriptors.FieldDescriptor, Object> getExtensionFields() {
            return this.extensions.r();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
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

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            if (!fieldDescriptor.B()) {
                return super.getRepeatedField(fieldDescriptor, i);
            }
            verifyContainingType(fieldDescriptor);
            return this.extensions.v(fieldDescriptor, i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.B()) {
                return super.getRepeatedFieldCount(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            return this.extensions.w(fieldDescriptor);
        }

        public final <Type> boolean hasExtension(r<MessageType, Type> rVar) {
            Extension<MessageType, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(rVar);
            verifyExtensionContainingType(extensionCheckNotLite);
            return this.extensions.z(extensionCheckNotLite.c());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.B()) {
                return super.hasField(fieldDescriptor);
            }
            verifyContainingType(fieldDescriptor);
            return this.extensions.z(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public void makeExtensionsImmutable() {
            this.extensions.G();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public abstract /* synthetic */ p0.a newBuilderForType();

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public abstract /* synthetic */ q0.a newBuilderForType();

        public ExtendableMessage<MessageType>.a newExtensionWriter() {
            return new a(this, false, null);
        }

        public ExtendableMessage<MessageType>.a newMessageSetExtensionWriter() {
            return new a(this, true, null);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public boolean parseUnknownField(j jVar, r1.b bVar, t tVar, int i) throws IOException {
            if (jVar.M()) {
                bVar = null;
            }
            return MessageReflection.g(jVar, bVar, tVar, getDescriptorForType(), new MessageReflection.c(this.extensions), i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public boolean parseUnknownFieldProto3(j jVar, r1.b bVar, t tVar, int i) throws IOException {
            return parseUnknownField(jVar, bVar, tVar, i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public abstract /* synthetic */ p0.a toBuilder();

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
        public abstract /* synthetic */ q0.a toBuilder();

        public ExtendableMessage(d<MessageType, ?> dVar) {
            super(dVar);
            this.extensions = dVar.q();
        }

        public final <Type> boolean hasExtension(Extension<MessageType, Type> extension) {
            return hasExtension((r) extension);
        }

        public final <Type> int getExtensionCount(Extension<MessageType, List<Type>> extension) {
            return getExtensionCount((r) extension);
        }

        public final <Type> boolean hasExtension(GeneratedMessage.l<MessageType, Type> lVar) {
            return hasExtension((r) lVar);
        }

        public final <Type> int getExtensionCount(GeneratedMessage.l<MessageType, List<Type>> lVar) {
            return getExtensionCount((r) lVar);
        }

        public final <Type> Type getExtension(r<MessageType, List<Type>> rVar, int i) {
            Extension<MessageType, ?> extensionCheckNotLite = GeneratedMessageV3.checkNotLite(rVar);
            verifyExtensionContainingType(extensionCheckNotLite);
            return (Type) extensionCheckNotLite.e(this.extensions.v(extensionCheckNotLite.c(), i));
        }

        public final <Type> Type getExtension(Extension<MessageType, Type> extension) {
            return (Type) getExtension((r) extension);
        }

        public final <Type> Type getExtension(GeneratedMessage.l<MessageType, Type> lVar) {
            return (Type) getExtension((r) lVar);
        }

        public final <Type> Type getExtension(Extension<MessageType, List<Type>> extension, int i) {
            return (Type) getExtension((r) extension, i);
        }

        public final <Type> Type getExtension(GeneratedMessage.l<MessageType, List<Type>> lVar, int i) {
            return (Type) getExtension((r) lVar, i);
        }
    }

    public GeneratedMessageV3(b<?> bVar) {
        this.unknownFields = bVar.getUnknownFields();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$h] */
    public static d0.h mutableCopy(d0.h hVar) {
        int size = hVar.size();
        return hVar.a2(size == 0 ? 10 : size * 2);
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

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$f] */
    public static d0.f mutableCopy(d0.f fVar) {
        int size = fVar.size();
        return fVar.a2(size == 0 ? 10 : size * 2);
    }

    public static <M extends p0> M parseWithIOException(vkh<M> vkhVar, j jVar) throws IOException {
        try {
            return vkhVar.parseFrom(jVar);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$b] */
    public static d0.b mutableCopy(d0.b bVar) {
        int size = bVar.size();
        return bVar.a2(size == 0 ? 10 : size * 2);
    }

    public static <M extends p0> M parseWithIOException(vkh<M> vkhVar, j jVar, t tVar) throws IOException {
        try {
            return vkhVar.parseFrom(jVar, tVar);
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$a] */
    public static d0.a mutableCopy(d0.a aVar) {
        int size = aVar.size();
        return aVar.a2(size == 0 ? 10 : size * 2);
    }
}
