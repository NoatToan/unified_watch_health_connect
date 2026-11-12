package z33;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends z33.a implements Serializable {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202187a;

        static {
            int[] iArr = new int[w.values().length];
            f202187a = iArr;
            try {
                iArr[w.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f202187a[w.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<MessageType extends g, BuilderType extends b> extends z33.a.AbstractC3766a<BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z33.c f202188a = z33.c.f202161a;

        @Override // z33.a.AbstractC3766a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType b() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract BuilderType e(MessageType messagetype);
    }

    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z33.f<e> f202189b = z33.f.f202181d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f202190c;

        @Override // z33.g.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType b() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final void g(MessageType messagetype) {
            r rVar;
            if (!this.f202190c) {
                this.f202189b = this.f202189b.clone();
                this.f202190c = true;
            }
            z33.f<e> fVar = this.f202189b;
            z33.f<e> fVar2 = messagetype.f202191a;
            fVar.getClass();
            int i14 = 0;
            while (true) {
                int size = fVar2.f202182a.f202231b.size();
                rVar = fVar2.f202182a;
                if (i14 >= size) {
                    break;
                }
                fVar.g(rVar.f202231b.get(i14));
                i14++;
            }
            Iterator<Map.Entry<Object, Object>> it = rVar.c().iterator();
            while (it.hasNext()) {
                fVar.g((Map.Entry) it.next());
            }
        }
    }

    public static final class e implements z33.f.b<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h.b<?> f202195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f202196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v f202197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f202198d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f202199e;

        public e(h.b<?> bVar, int i14, v vVar, boolean z14, boolean z15) {
            this.f202195a = bVar;
            this.f202196b = i14;
            this.f202197c = vVar;
            this.f202198d = z14;
            this.f202199e = z15;
        }

        @Override // z33.f.b
        public final b a2(n.a aVar, n nVar) {
            return ((b) aVar).e((g) nVar);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f202196b - ((e) obj).f202196b;
        }

        @Override // z33.f.b
        public final w getLiteJavaType() {
            return this.f202197c.f202267a;
        }

        @Override // z33.f.b
        public final v getLiteType() {
            return this.f202197c;
        }

        @Override // z33.f.b
        public final int getNumber() {
            return this.f202196b;
        }

        @Override // z33.f.b
        public final boolean isPacked() {
            return this.f202199e;
        }

        @Override // z33.f.b
        public final boolean isRepeated() {
            return this.f202198d;
        }
    }

    public static class f<ContainingType extends n, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContainingType f202200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f202201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f202202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e f202203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Method f202204e;

        public f(ContainingType containingtype, Type type, n nVar, e eVar, Class cls) {
            if (containingtype == null) {
                vb.h.s("Null containingTypeDefaultInstance");
                throw null;
            }
            if (eVar.f202197c == v.f202258m && nVar == null) {
                vb.h.s("Null messageDefaultInstance");
                throw null;
            }
            this.f202200a = containingtype;
            this.f202201b = type;
            this.f202202c = nVar;
            this.f202203d = eVar;
            if (!h.a.class.isAssignableFrom(cls)) {
                this.f202204e = null;
                return;
            }
            try {
                this.f202204e = cls.getMethod(CoreConstants.VALUE_OF, Integer.TYPE);
            } catch (NoSuchMethodException e4) {
                String name = cls.getName();
                q2.v(e0.h(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e4);
                throw null;
            }
        }

        public final Object a(Object obj) {
            if (this.f202203d.f202197c.f202267a != w.ENUM) {
                return obj;
            }
            try {
                return this.f202204e.invoke(null, (Integer) obj);
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

        public final Object b(Object obj) {
            return this.f202203d.f202197c.f202267a == w.ENUM ? Integer.valueOf(((h.a) obj).getNumber()) : obj;
        }
    }

    public g() {
    }

    public static f b(n nVar, n nVar2, int i14, v vVar, Class cls) {
        return new f(nVar, Collections.EMPTY_LIST, nVar2, new e(null, i14, vVar, true, false), cls);
    }

    public static f c(n nVar, Object obj, n nVar2, int i14, v vVar, Class cls) {
        return new f(nVar, obj, nVar2, new e(null, i14, vVar, false, false), cls);
    }

    public g(b bVar) {
    }

    public static abstract class d<MessageType extends d<MessageType>> extends g implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z33.f<e> f202191a;

        public d(c<MessageType, ?> cVar) {
            z33.f<e> fVar = cVar.f202189b;
            if (!fVar.f202183b) {
                fVar.f202182a.e();
                fVar.f202183b = true;
            }
            cVar.f202190c = false;
            this.f202191a = cVar.f202189b;
        }

        public final boolean d() {
            r rVar = this.f202191a.f202182a;
            for (int i14 = 0; i14 < rVar.f202231b.size(); i14++) {
                if (!z33.f.f(rVar.f202231b.get(i14))) {
                    return false;
                }
            }
            Iterator<Map.Entry<Object, Object>> it = rVar.c().iterator();
            while (it.hasNext()) {
                if (!z33.f.f(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int e() {
            r rVar = this.f202191a.f202182a;
            int iD = 0;
            for (int i14 = 0; i14 < rVar.f202231b.size(); i14++) {
                s<K, V>.b bVar = rVar.f202231b.get(i14);
                iD += z33.f.d((z33.f.b) bVar.getKey(), bVar.getValue());
            }
            for (Map.Entry<Object, Object> entry : rVar.c()) {
                iD += z33.f.d((z33.f.b) entry.getKey(), entry.getValue());
            }
            return iD;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [Type, java.util.ArrayList] */
        public final <Type> Type f(f<MessageType, Type> fVar) {
            l(fVar);
            e eVar = fVar.f202203d;
            Type type = (Type) this.f202191a.e(eVar);
            if (type == null) {
                return fVar.f202201b;
            }
            if (!eVar.f202198d) {
                return (Type) fVar.a(type);
            }
            if (eVar.f202197c.f202267a != w.ENUM) {
                return type;
            }
            ?? r14 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r14.add(fVar.a(it.next()));
            }
            return r14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean g(f<MessageType, Type> fVar) {
            l(fVar);
            e eVar = fVar.f202203d;
            z33.f<e> fVar2 = this.f202191a;
            fVar2.getClass();
            if (!eVar.f202198d) {
                return fVar2.f202182a.get(eVar) != null;
            }
            vb.h.s("hasField() can only be called on non-repeated fields.");
            return false;
        }

        public final void h() {
            z33.f<e> fVar = this.f202191a;
            if (fVar.f202183b) {
                return;
            }
            fVar.f202182a.e();
            fVar.f202183b = true;
        }

        public final d<MessageType>.a i() {
            return new a(this, false, null);
        }

        /* JADX WARN: Code duplicated, block: B:4:0x001a  */
        public final boolean k(z33.d dVar, CodedOutputStream codedOutputStream, z33.e eVar, int i14) throws IOException {
            boolean z14;
            boolean z15;
            Object objBuild;
            n nVar;
            int i15 = i14 & 7;
            f<?, ?> fVar = eVar.f202178a.get(new z33.e.a(getDefaultInstanceForType(), i14 >>> 3));
            if (fVar == null) {
                z15 = true;
                z14 = false;
            } else {
                e eVar2 = fVar.f202203d;
                v vVar = eVar2.f202197c;
                z33.f fVar2 = z33.f.f202181d;
                if (i15 == vVar.f202268b) {
                    z15 = false;
                    z14 = false;
                } else if (eVar2.f202198d && vVar.a() && i15 == 2) {
                    z14 = true;
                    z15 = false;
                } else {
                    z15 = true;
                    z14 = false;
                }
            }
            if (z15) {
                return dVar.r(i14, codedOutputStream);
            }
            z33.f<e> fVar3 = this.f202191a;
            if (z14) {
                int iE = dVar.e(dVar.l());
                e eVar3 = fVar.f202203d;
                if (eVar3.f202197c == v.f202261p) {
                    while (dVar.b() > 0) {
                        h.a aVarFindValueByNumber = eVar3.f202195a.findValueByNumber(dVar.l());
                        if (aVarFindValueByNumber == null) {
                            return true;
                        }
                        fVar3.a(eVar3, fVar.b(aVarFindValueByNumber));
                    }
                } else {
                    while (dVar.b() > 0) {
                        fVar3.a(eVar3, z33.f.i(dVar, eVar3.f202197c));
                    }
                }
                dVar.d(iE);
                return true;
            }
            int[] iArr = a.f202187a;
            e eVar4 = fVar.f202203d;
            v vVar2 = eVar4.f202197c;
            boolean z16 = eVar4.f202198d;
            int i16 = iArr[vVar2.f202267a.ordinal()];
            if (i16 == 1) {
                n.a builder = (z16 || (nVar = (n) fVar3.e(eVar4)) == null) ? null : nVar.toBuilder();
                if (builder == null) {
                    builder = fVar.f202202c.newBuilderForType();
                }
                if (vVar2 == v.f202257l) {
                    int i17 = eVar4.f202196b;
                    int i18 = dVar.f202176i;
                    if (i18 >= 64) {
                        throw InvalidProtocolBufferException.recursionLimitExceeded();
                    }
                    dVar.f202176i = i18 + 1;
                    builder.b1(dVar, eVar);
                    dVar.a((i17 << 3) | 4);
                    dVar.f202176i--;
                } else {
                    int iL = dVar.l();
                    if (dVar.f202176i >= 64) {
                        throw InvalidProtocolBufferException.recursionLimitExceeded();
                    }
                    int iE2 = dVar.e(iL);
                    dVar.f202176i++;
                    builder.b1(dVar, eVar);
                    dVar.a(0);
                    dVar.f202176i--;
                    dVar.d(iE2);
                }
                objBuild = builder.build();
            } else if (i16 != 2) {
                objBuild = z33.f.i(dVar, vVar2);
            } else {
                int iL2 = dVar.l();
                h.a aVarFindValueByNumber2 = eVar4.f202195a.findValueByNumber(iL2);
                if (aVarFindValueByNumber2 == null) {
                    codedOutputStream.v(i14);
                    codedOutputStream.v(iL2);
                    return true;
                }
                objBuild = aVarFindValueByNumber2;
            }
            if (z16) {
                fVar3.a(eVar4, fVar.b(objBuild));
                return true;
            }
            fVar3.j(eVar4, fVar.b(objBuild));
            return true;
        }

        public final void l(f<MessageType, ?> fVar) {
            if (fVar.f202200a == getDefaultInstanceForType()) {
                return;
            }
            vb.h.s("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public d() {
            this.f202191a = z33.f.h();
        }

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<e, Object>> f202192a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry<e, Object> f202193b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f202194c;

            private a(d dVar, boolean z14) {
                z33.f<e> fVar = dVar.f202191a;
                boolean z15 = fVar.f202184c;
                r rVar = fVar.f202182a;
                Iterator cVar = z15 ? new i.c(rVar.entrySet().iterator()) : rVar.entrySet().iterator();
                this.f202192a = cVar;
                if (cVar.hasNext()) {
                    this.f202193b = (Map.Entry) cVar.next();
                }
                this.f202194c = z14;
            }

            public final void a(int i14, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry<e, Object> entry = this.f202193b;
                    if (entry == null || entry.getKey().f202196b >= i14) {
                        return;
                    }
                    e key = this.f202193b.getKey();
                    int iC = 0;
                    if (this.f202194c && key.f202197c.f202267a == w.MESSAGE && !key.f202198d) {
                        int i15 = key.f202196b;
                        n nVar = (n) this.f202193b.getValue();
                        codedOutputStream.x(1, 3);
                        codedOutputStream.x(2, 0);
                        codedOutputStream.v(i15);
                        codedOutputStream.o(3, nVar);
                        codedOutputStream.x(1, 4);
                    } else {
                        Object value = this.f202193b.getValue();
                        z33.f fVar = z33.f.f202181d;
                        v vVar = key.f202197c;
                        int i16 = key.f202196b;
                        if (key.f202198d) {
                            List list = (List) value;
                            if (key.f202199e) {
                                codedOutputStream.x(i16, 2);
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    iC += z33.f.c(vVar, it.next());
                                }
                                codedOutputStream.v(iC);
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    z33.f.m(codedOutputStream, vVar, it3.next());
                                }
                            } else {
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    z33.f.l(codedOutputStream, vVar, i16, it4.next());
                                }
                            }
                        } else if (value instanceof i) {
                            z33.f.l(codedOutputStream, vVar, i16, ((i) value).a());
                        } else {
                            z33.f.l(codedOutputStream, vVar, i16, value);
                        }
                    }
                    Iterator<Map.Entry<e, Object>> it5 = this.f202192a;
                    if (it5.hasNext()) {
                        this.f202193b = it5.next();
                    } else {
                        this.f202193b = null;
                    }
                }
            }

            public /* synthetic */ a(d dVar, boolean z14, a aVar) {
                this(dVar, z14);
            }
        }
    }
}
