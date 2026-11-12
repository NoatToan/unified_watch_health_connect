package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.mi.health.course.export.data.CourseConfigModel;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class mgh extends ih2 implements Comparable<mgh> {
    public static final AnnotationIntrospector.ReferenceProperty m = AnnotationIntrospector.ReferenceProperty.e("");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26142b;
    public final MapperConfig<?> c;
    public final AnnotationIntrospector d;
    public final PropertyName e;
    public final PropertyName f;
    public k<AnnotatedField> g;
    public k<AnnotatedParameter> h;
    public k<AnnotatedMethod> i;
    public k<AnnotatedMethod> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient PropertyMetadata f26143k;
    public transient AnnotationIntrospector.ReferenceProperty l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26144a;

        static {
            int[] iArr = new int[JsonProperty.Access.values().length];
            f26144a = iArr;
            try {
                iArr[JsonProperty.Access.READ_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26144a[JsonProperty.Access.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26144a[JsonProperty.Access.WRITE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26144a[JsonProperty.Access.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class b implements m<Class<?>[]> {
        public b() {
        }

        @Override // mgh.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Class<?>[] a(AnnotatedMember annotatedMember) {
            return mgh.this.d.findViews(annotatedMember);
        }
    }

    public class c implements m<AnnotationIntrospector.ReferenceProperty> {
        public c() {
        }

        @Override // mgh.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnnotationIntrospector.ReferenceProperty a(AnnotatedMember annotatedMember) {
            return mgh.this.d.findReferenceType(annotatedMember);
        }
    }

    public class d implements m<Boolean> {
        public d() {
        }

        @Override // mgh.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(AnnotatedMember annotatedMember) {
            return mgh.this.d.isTypeId(annotatedMember);
        }
    }

    public class e implements m<Boolean> {
        public e() {
        }

        @Override // mgh.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(AnnotatedMember annotatedMember) {
            return mgh.this.d.hasRequiredMarker(annotatedMember);
        }
    }

    public class f implements m<String> {
        public f() {
        }

        @Override // mgh.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(AnnotatedMember annotatedMember) {
            return mgh.this.d.findPropertyDescription(annotatedMember);
        }
    }

    public class g implements m<Integer> {
        public g() {
        }

        @Override // mgh.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(AnnotatedMember annotatedMember) {
            return mgh.this.d.findPropertyIndex(annotatedMember);
        }
    }

    public class h implements m<String> {
        public h() {
        }

        @Override // mgh.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(AnnotatedMember annotatedMember) {
            return mgh.this.d.findPropertyDefaultValue(annotatedMember);
        }
    }

    public class i implements m<z3h> {
        public i() {
        }

        @Override // mgh.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z3h a(AnnotatedMember annotatedMember) {
            z3h z3hVarFindObjectIdInfo = mgh.this.d.findObjectIdInfo(annotatedMember);
            return z3hVarFindObjectIdInfo != null ? mgh.this.d.findObjectReferenceInfo(annotatedMember, z3hVarFindObjectIdInfo) : z3hVarFindObjectIdInfo;
        }
    }

    public class j implements m<JsonProperty.Access> {
        public j() {
        }

        @Override // mgh.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JsonProperty.Access a(AnnotatedMember annotatedMember) {
            return mgh.this.d.findPropertyAccess(annotatedMember);
        }
    }

    public static final class k<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f26154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k<T> f26155b;
        public final PropertyName c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public k(T t, k<T> kVar, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            this.f26154a = t;
            this.f26155b = kVar;
            PropertyName propertyName2 = (propertyName == null || propertyName.isEmpty()) ? null : propertyName;
            this.c = propertyName2;
            if (z) {
                if (propertyName2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (!propertyName.hasSimpleName()) {
                    z = false;
                }
            }
            this.d = z;
            this.e = z2;
            this.f = z3;
        }

        public k<T> a(k<T> kVar) {
            k<T> kVar2 = this.f26155b;
            return kVar2 == null ? c(kVar) : c(kVar2.a(kVar));
        }

        public k<T> b() {
            k<T> kVar = this.f26155b;
            if (kVar == null) {
                return this;
            }
            k<T> kVarB = kVar.b();
            if (this.c != null) {
                return kVarB.c == null ? c(null) : c(kVarB);
            }
            if (kVarB.c != null) {
                return kVarB;
            }
            boolean z = this.e;
            if (z == kVarB.e) {
                return c(kVarB);
            }
            return z ? c(null) : kVarB;
        }

        public k<T> c(k<T> kVar) {
            return kVar == this.f26155b ? this : new k<>(this.f26154a, kVar, this.c, this.d, this.e, this.f);
        }

        public k<T> d(T t) {
            return t == this.f26154a ? this : new k<>(t, this.f26155b, this.c, this.d, this.e, this.f);
        }

        public k<T> e() {
            k<T> kVarE;
            if (!this.f) {
                k<T> kVar = this.f26155b;
                return (kVar == null || (kVarE = kVar.e()) == this.f26155b) ? this : c(kVarE);
            }
            k<T> kVar2 = this.f26155b;
            if (kVar2 == null) {
                return null;
            }
            return kVar2.e();
        }

        public k<T> f() {
            return this.f26155b == null ? this : new k<>(this.f26154a, null, this.c, this.d, this.e, this.f);
        }

        public k<T> g() {
            k<T> kVar = this.f26155b;
            k<T> kVarG = kVar == null ? null : kVar.g();
            return this.e ? c(kVarG) : kVarG;
        }

        public String toString() {
            String str = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.f26154a.toString(), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.d));
            if (this.f26155b == null) {
                return str;
            }
            return str + ", " + this.f26155b.toString();
        }
    }

    public static class l<T extends AnnotatedMember> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k<T> f26156a;

        public l(k<T> kVar) {
            this.f26156a = kVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T next() {
            k<T> kVar = this.f26156a;
            if (kVar == null) {
                throw new NoSuchElementException();
            }
            T t = kVar.f26154a;
            this.f26156a = kVar.f26155b;
            return t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26156a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public interface m<T> {
        T a(AnnotatedMember annotatedMember);
    }

    public mgh(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z, propertyName, propertyName);
    }

    public static <T> k<T> n0(k<T> kVar, k<T> kVar2) {
        if (kVar == null) {
            return kVar2;
        }
        return kVar2 == null ? kVar : kVar.a(kVar2);
    }

    @Override // defpackage.ih2
    public boolean A(PropertyName propertyName) {
        return this.e.equals(propertyName);
    }

    @Override // defpackage.ih2
    public boolean B() {
        return this.j != null;
    }

    @Override // defpackage.ih2
    public boolean C() {
        return G(this.g) || G(this.i) || G(this.j) || F(this.h);
    }

    @Override // defpackage.ih2
    public boolean D() {
        return F(this.g) || F(this.i) || F(this.j) || F(this.h);
    }

    @Override // defpackage.ih2
    public boolean E() {
        Boolean bool = (Boolean) j0(new d());
        return bool != null && bool.booleanValue();
    }

    public final <T> boolean F(k<T> kVar) {
        while (kVar != null) {
            if (kVar.c != null && kVar.d) {
                return true;
            }
            kVar = kVar.f26155b;
        }
        return false;
    }

    public final <T> boolean G(k<T> kVar) {
        while (kVar != null) {
            PropertyName propertyName = kVar.c;
            if (propertyName != null && propertyName.hasSimpleName()) {
                return true;
            }
            kVar = kVar.f26155b;
        }
        return false;
    }

    public final <T> boolean H(k<T> kVar) {
        while (kVar != null) {
            if (kVar.f) {
                return true;
            }
            kVar = kVar.f26155b;
        }
        return false;
    }

    public final <T> boolean I(k<T> kVar) {
        while (kVar != null) {
            if (kVar.e) {
                return true;
            }
            kVar = kVar.f26155b;
        }
        return false;
    }

    public final <T extends AnnotatedMember> k<T> J(k<T> kVar, hd1 hd1Var) {
        AnnotatedMember annotatedMember = (AnnotatedMember) kVar.f26154a.withAnnotations(hd1Var);
        k<T> kVar2 = kVar.f26155b;
        k kVarC = kVar;
        if (kVar2 != null) {
            kVarC = kVar.c(J(kVar2, hd1Var));
        }
        return kVarC.d(annotatedMember);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.Map), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void K(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.Map), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public String L() {
        return (String) j0(new h());
    }

    public String M() {
        return (String) j0(new f());
    }

    public final Set<PropertyName> N(k<? extends AnnotatedMember> kVar, Set<PropertyName> set) {
        for (k kVar2 = kVar; kVar2 != null; kVar2 = kVar2.f26155b) {
            if (kVar2.d && kVar2.c != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(kVar2.c);
            }
        }
        return set;
    }

    public Integer O() {
        return (Integer) j0(new g());
    }

    public Boolean P() {
        return (Boolean) j0(new e());
    }

    public final <T extends AnnotatedMember> hd1 Q(k<T> kVar) {
        hd1 allAnnotations = kVar.f26154a.getAllAnnotations();
        k<T> kVar2 = kVar.f26155b;
        return kVar2 != null ? hd1.d(allAnnotations, Q(kVar2)) : allAnnotations;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039 A[PHI: r2 r8
      0x0039: PHI (r2v5 boolean) = (r2v0 boolean), (r2v10 boolean) binds: [B:5:0x000f, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r8v5 com.fasterxml.jackson.databind.PropertyMetadata) = (r8v0 com.fasterxml.jackson.databind.PropertyMetadata), (r8v9 com.fasterxml.jackson.databind.PropertyMetadata) binds: [B:5:0x000f, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    public PropertyMetadata R(PropertyMetadata propertyMetadata) {
        Nulls nullsNonDefaultContentNulls;
        Boolean mergeable;
        Boolean boolFindMergeInfo;
        AnnotatedMember annotatedMemberS = s();
        AnnotatedMember annotatedMemberK = k();
        boolean z = true;
        Nulls nullsNonDefaultValueNulls = null;
        if (annotatedMemberS != null) {
            AnnotationIntrospector annotationIntrospector = this.d;
            if (annotationIntrospector == null) {
                nullsNonDefaultContentNulls = null;
            } else {
                if (annotatedMemberK != null && (boolFindMergeInfo = annotationIntrospector.findMergeInfo(annotatedMemberS)) != null) {
                    if (boolFindMergeInfo.booleanValue()) {
                        propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.a.b(annotatedMemberK));
                    }
                    z = false;
                }
                JsonSetter.Value valueFindSetterInfo = this.d.findSetterInfo(annotatedMemberS);
                if (valueFindSetterInfo != null) {
                    nullsNonDefaultValueNulls = valueFindSetterInfo.nonDefaultValueNulls();
                    nullsNonDefaultContentNulls = valueFindSetterInfo.nonDefaultContentNulls();
                } else {
                    nullsNonDefaultContentNulls = null;
                }
            }
            if (z || nullsNonDefaultValueNulls == null || nullsNonDefaultContentNulls == null) {
                kc4 configOverride = this.c.getConfigOverride(w());
                JsonSetter.Value setterInfo = configOverride.getSetterInfo();
                if (setterInfo != null) {
                    if (nullsNonDefaultValueNulls == null) {
                        nullsNonDefaultValueNulls = setterInfo.nonDefaultValueNulls();
                    }
                    if (nullsNonDefaultContentNulls == null) {
                        nullsNonDefaultContentNulls = setterInfo.nonDefaultContentNulls();
                    }
                }
                if (z && annotatedMemberK != null && (mergeable = configOverride.getMergeable()) != null) {
                    if (mergeable.booleanValue()) {
                        propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.a.c(annotatedMemberK));
                    }
                    z = false;
                }
            }
        } else {
            nullsNonDefaultContentNulls = null;
        }
        if (z || nullsNonDefaultValueNulls == null || nullsNonDefaultContentNulls == null) {
            JsonSetter.Value defaultSetterInfo = this.c.getDefaultSetterInfo();
            if (nullsNonDefaultValueNulls == null) {
                nullsNonDefaultValueNulls = defaultSetterInfo.nonDefaultValueNulls();
            }
            if (nullsNonDefaultContentNulls == null) {
                nullsNonDefaultContentNulls = defaultSetterInfo.nonDefaultContentNulls();
            }
            if (z) {
                if (Boolean.TRUE.equals(this.c.getDefaultMergeable()) && annotatedMemberK != null) {
                    propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.a.a(annotatedMemberK));
                }
            }
        }
        return (nullsNonDefaultValueNulls == null && nullsNonDefaultContentNulls == null) ? propertyMetadata : propertyMetadata.withNulls(nullsNonDefaultValueNulls, nullsNonDefaultContentNulls);
    }

    public int S(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    public final hd1 T(int i2, k<? extends AnnotatedMember>... kVarArr) {
        hd1 hd1VarQ = Q(kVarArr[i2]);
        do {
            i2++;
            if (i2 >= kVarArr.length) {
                return hd1VarQ;
            }
        } while (kVarArr[i2] == null);
        return hd1.d(hd1VarQ, T(i2, kVarArr));
    }

    public final <T> k<T> U(k<T> kVar) {
        return kVar == null ? kVar : kVar.e();
    }

    public final <T> k<T> V(k<T> kVar) {
        return kVar == null ? kVar : kVar.g();
    }

    public int W(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        return (!name.startsWith(CourseConfigModel.DevCmd.CMD_ACTION_SET) || name.length() <= 3) ? 2 : 1;
    }

    public final <T> k<T> X(k<T> kVar) {
        return kVar == null ? kVar : kVar.b();
    }

    public void Y(mgh mghVar) {
        this.g = n0(this.g, mghVar.g);
        this.h = n0(this.h, mghVar.h);
        this.i = n0(this.i, mghVar.i);
        this.j = n0(this.j, mghVar.j);
    }

    public void Z(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.h = new k<>(annotatedParameter, this.h, propertyName, z, z2, z3);
    }

    @Override // defpackage.ih2
    public boolean a() {
        return (this.h == null && this.j == null && this.g == null) ? false : true;
    }

    public void a0(AnnotatedField annotatedField, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.g = new k<>(annotatedField, this.g, propertyName, z, z2, z3);
    }

    @Override // defpackage.ih2
    public boolean b() {
        return (this.i == null && this.g == null) ? false : true;
    }

    public void b0(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.i = new k<>(annotatedMethod, this.i, propertyName, z, z2, z3);
    }

    @Override // defpackage.ih2
    public JsonInclude.Value c() {
        AnnotatedMember annotatedMemberK = k();
        AnnotationIntrospector annotationIntrospector = this.d;
        JsonInclude.Value valueFindPropertyInclusion = annotationIntrospector == null ? null : annotationIntrospector.findPropertyInclusion(annotatedMemberK);
        return valueFindPropertyInclusion == null ? JsonInclude.Value.empty() : valueFindPropertyInclusion;
    }

    public void c0(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.j = new k<>(annotatedMethod, this.j, propertyName, z, z2, z3);
    }

    @Override // defpackage.ih2
    public z3h d() {
        return (z3h) j0(new i());
    }

    public boolean d0() {
        return H(this.g) || H(this.i) || H(this.j) || H(this.h);
    }

    public boolean e0() {
        return I(this.g) || I(this.i) || I(this.j) || I(this.h);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public int compareTo(mgh mghVar) {
        if (this.h != null) {
            if (mghVar.h == null) {
                return -1;
            }
        } else if (mghVar.h != null) {
            return 1;
        }
        return getName().compareTo(mghVar.getName());
    }

    public Collection<mgh> g0(Collection<PropertyName> collection) {
        HashMap map = new HashMap();
        K(collection, map, this.g);
        K(collection, map, this.i);
        K(collection, map, this.j);
        K(collection, map, this.h);
        return map.values();
    }

    @Override // defpackage.ih2
    public PropertyName getFullName() {
        return this.e;
    }

    @Override // defpackage.ih2
    public PropertyMetadata getMetadata() {
        if (this.f26143k == null) {
            Boolean boolP = P();
            String strM = M();
            Integer numO = O();
            String strL = L();
            if (boolP == null && numO == null && strL == null) {
                PropertyMetadata propertyMetadataWithDescription = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
                if (strM != null) {
                    propertyMetadataWithDescription = propertyMetadataWithDescription.withDescription(strM);
                }
                this.f26143k = propertyMetadataWithDescription;
            } else {
                this.f26143k = PropertyMetadata.construct(boolP, strM, numO, strL);
            }
            if (!this.f26142b) {
                this.f26143k = R(this.f26143k);
            }
        }
        return this.f26143k;
    }

    @Override // defpackage.ih2, defpackage.ogg
    public String getName() {
        PropertyName propertyName = this.e;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    @Override // defpackage.ih2
    public PropertyName getWrapperName() {
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMember annotatedMemberS = s();
        if (annotatedMemberS == null || (annotationIntrospector = this.d) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(annotatedMemberS);
    }

    @Override // defpackage.ih2
    public AnnotationIntrospector.ReferenceProperty h() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = this.l;
        if (referenceProperty != null) {
            if (referenceProperty == m) {
                return null;
            }
            return referenceProperty;
        }
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = (AnnotationIntrospector.ReferenceProperty) j0(new c());
        this.l = referenceProperty2 == null ? m : referenceProperty2;
        return referenceProperty2;
    }

    public JsonProperty.Access h0() {
        return (JsonProperty.Access) k0(new j(), JsonProperty.Access.AUTO);
    }

    @Override // defpackage.ih2
    public Class<?>[] i() {
        return (Class[]) j0(new b());
    }

    public Set<PropertyName> i0() {
        Set<PropertyName> setN = N(this.h, N(this.j, N(this.i, N(this.g, null))));
        return setN == null ? Collections.emptySet() : setN;
    }

    public <T> T j0(m<T> mVar) {
        k<AnnotatedMethod> kVar;
        k<AnnotatedField> kVar2;
        T tA = null;
        if (this.d == null) {
            return null;
        }
        if (this.f26142b) {
            k<AnnotatedMethod> kVar3 = this.i;
            if (kVar3 != null) {
                tA = mVar.a(kVar3.f26154a);
            }
        } else {
            k<AnnotatedParameter> kVar4 = this.h;
            tA = kVar4 != null ? mVar.a(kVar4.f26154a) : null;
            if (tA == null && (kVar = this.j) != null) {
                tA = mVar.a(kVar.f26154a);
            }
        }
        return (tA != null || (kVar2 = this.g) == null) ? tA : mVar.a(kVar2.f26154a);
    }

    public <T> T k0(m<T> mVar, T t) {
        T tA;
        T tA2;
        T tA3;
        T tA4;
        T tA5;
        T tA6;
        T tA7;
        T tA8;
        if (this.d == null) {
            return null;
        }
        if (this.f26142b) {
            k<AnnotatedMethod> kVar = this.i;
            if (kVar != null && (tA8 = mVar.a(kVar.f26154a)) != null && tA8 != t) {
                return tA8;
            }
            k<AnnotatedField> kVar2 = this.g;
            if (kVar2 != null && (tA7 = mVar.a(kVar2.f26154a)) != null && tA7 != t) {
                return tA7;
            }
            k<AnnotatedParameter> kVar3 = this.h;
            if (kVar3 != null && (tA6 = mVar.a(kVar3.f26154a)) != null && tA6 != t) {
                return tA6;
            }
            k<AnnotatedMethod> kVar4 = this.j;
            if (kVar4 == null || (tA5 = mVar.a(kVar4.f26154a)) == null || tA5 == t) {
                return null;
            }
            return tA5;
        }
        k<AnnotatedParameter> kVar5 = this.h;
        if (kVar5 != null && (tA4 = mVar.a(kVar5.f26154a)) != null && tA4 != t) {
            return tA4;
        }
        k<AnnotatedMethod> kVar6 = this.j;
        if (kVar6 != null && (tA3 = mVar.a(kVar6.f26154a)) != null && tA3 != t) {
            return tA3;
        }
        k<AnnotatedField> kVar7 = this.g;
        if (kVar7 != null && (tA2 = mVar.a(kVar7.f26154a)) != null && tA2 != t) {
            return tA2;
        }
        k<AnnotatedMethod> kVar8 = this.i;
        if (kVar8 == null || (tA = mVar.a(kVar8.f26154a)) == null || tA == t) {
            return null;
        }
        return tA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ih2
    public AnnotatedParameter l() {
        k kVar = this.h;
        if (kVar == null) {
            return null;
        }
        while (!(((AnnotatedParameter) kVar.f26154a).getOwner() instanceof AnnotatedConstructor)) {
            kVar = kVar.f26155b;
            if (kVar == null) {
                return this.h.f26154a;
            }
        }
        return (AnnotatedParameter) kVar.f26154a;
    }

    public String l0() {
        return this.f.getSimpleName();
    }

    @Override // defpackage.ih2
    public Iterator<AnnotatedParameter> m() {
        k<AnnotatedParameter> kVar = this.h;
        return kVar == null ? h04.m() : new l(kVar);
    }

    public boolean m0() {
        return this.i != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ih2
    public AnnotatedField n() {
        k<AnnotatedField> kVar = this.g;
        if (kVar == null) {
            return null;
        }
        AnnotatedField annotatedField = kVar.f26154a;
        for (k kVar2 = kVar.f26155b; kVar2 != null; kVar2 = kVar2.f26155b) {
            AnnotatedField annotatedField2 = (AnnotatedField) kVar2.f26154a;
            Class<?> declaringClass = annotatedField.getDeclaringClass();
            Class<?> declaringClass2 = annotatedField2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedField = annotatedField2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + annotatedField.getFullName() + " vs " + annotatedField2.getFullName());
        }
        return annotatedField;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ih2
    public AnnotatedMethod o() {
        int iS;
        int iS2;
        k kVar = this.i;
        if (kVar == null) {
            return null;
        }
        k kVar2 = kVar.f26155b;
        if (kVar2 == null) {
            return (AnnotatedMethod) kVar.f26154a;
        }
        while (kVar2 != null) {
            Class<?> declaringClass = ((AnnotatedMethod) kVar.f26154a).getDeclaringClass();
            Class<?> declaringClass2 = ((AnnotatedMethod) kVar2.f26154a).getDeclaringClass();
            if (declaringClass == declaringClass2) {
                iS = S((AnnotatedMethod) kVar2.f26154a);
                iS2 = S((AnnotatedMethod) kVar.f26154a);
                if (iS != iS2) {
                    throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((AnnotatedMethod) kVar.f26154a).getFullName() + " vs " + ((AnnotatedMethod) kVar2.f26154a).getFullName());
                }
                if (iS < iS2) {
                    kVar = kVar2;
                }
            } else if (declaringClass.isAssignableFrom(declaringClass2)) {
                kVar = kVar2;
            } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                continue;
            } else {
                iS = S((AnnotatedMethod) kVar2.f26154a);
                iS2 = S((AnnotatedMethod) kVar.f26154a);
                if (iS != iS2) {
                    throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((AnnotatedMethod) kVar.f26154a).getFullName() + " vs " + ((AnnotatedMethod) kVar2.f26154a).getFullName());
                }
                if (iS < iS2) {
                    kVar = kVar2;
                }
            }
            kVar2 = kVar2.f26155b;
        }
        this.i = kVar.f();
        return (AnnotatedMethod) kVar.f26154a;
    }

    public void o0(boolean z) {
        if (z) {
            k<AnnotatedMethod> kVar = this.i;
            if (kVar != null) {
                this.i = J(this.i, T(0, kVar, this.g, this.h, this.j));
                return;
            }
            k<AnnotatedField> kVar2 = this.g;
            if (kVar2 != null) {
                this.g = J(this.g, T(0, kVar2, this.h, this.j));
                return;
            }
            return;
        }
        k<AnnotatedParameter> kVar3 = this.h;
        if (kVar3 != null) {
            this.h = J(this.h, T(0, kVar3, this.j, this.g, this.i));
            return;
        }
        k<AnnotatedMethod> kVar4 = this.j;
        if (kVar4 != null) {
            this.j = J(this.j, T(0, kVar4, this.g, this.i));
            return;
        }
        k<AnnotatedField> kVar5 = this.g;
        if (kVar5 != null) {
            this.g = J(this.g, T(0, kVar5, this.i));
        }
    }

    public void p0() {
        this.h = null;
    }

    public void q0() {
        this.g = U(this.g);
        this.i = U(this.i);
        this.j = U(this.j);
        this.h = U(this.h);
    }

    public JsonProperty.Access r0(boolean z) {
        JsonProperty.Access accessH0 = h0();
        if (accessH0 == null) {
            accessH0 = JsonProperty.Access.AUTO;
        }
        int i2 = a.f26144a[accessH0.ordinal()];
        if (i2 == 1) {
            this.j = null;
            this.h = null;
            if (!this.f26142b) {
                this.g = null;
            }
        } else if (i2 != 2) {
            if (i2 != 3) {
                this.i = V(this.i);
                this.h = V(this.h);
                if (!z || this.i == null) {
                    this.g = V(this.g);
                    this.j = V(this.j);
                }
            } else {
                this.i = null;
                if (this.f26142b) {
                    this.g = null;
                }
            }
        }
        return accessH0;
    }

    @Override // defpackage.ih2
    public AnnotatedMember s() {
        AnnotatedMember annotatedMemberP;
        return (this.f26142b || (annotatedMemberP = p()) == null) ? k() : annotatedMemberP;
    }

    public void s0() {
        this.g = X(this.g);
        this.i = X(this.i);
        this.j = X(this.j);
        this.h = X(this.h);
    }

    public mgh t0(PropertyName propertyName) {
        return new mgh(this, propertyName);
    }

    public String toString() {
        return "[Property '" + this.e + "'; ctors: " + this.h + ", field(s): " + this.g + ", getter(s): " + this.i + ", setter(s): " + this.j + "]";
    }

    @Override // defpackage.ih2
    public JavaType u() {
        if (this.f26142b) {
            AnnotatedMethod annotatedMethodO = o();
            if (annotatedMethodO != null) {
                return annotatedMethodO.getType();
            }
            AnnotatedField annotatedFieldN = n();
            return annotatedFieldN == null ? TypeFactory.unknownType() : annotatedFieldN.getType();
        }
        fd1 fd1VarL = l();
        if (fd1VarL == null) {
            AnnotatedMethod annotatedMethodX = x();
            if (annotatedMethodX != null) {
                return annotatedMethodX.getParameterType(0);
            }
            fd1VarL = n();
        }
        return (fd1VarL == null && (fd1VarL = o()) == null) ? TypeFactory.unknownType() : fd1VarL.getType();
    }

    public mgh u0(String str) {
        PropertyName propertyNameWithSimpleName = this.e.withSimpleName(str);
        return propertyNameWithSimpleName == this.e ? this : new mgh(this, propertyNameWithSimpleName);
    }

    @Override // defpackage.ih2
    public Class<?> w() {
        return u().getRawClass();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:36:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ih2
    public AnnotatedMethod x() {
        AnnotatedMethod annotatedMethod;
        AnnotatedMethod annotatedMethod2;
        int iW;
        int iW2;
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMethod annotatedMethodResolveSetterConflict;
        k kVar = this.j;
        if (kVar == null) {
            return null;
        }
        k kVar2 = kVar.f26155b;
        if (kVar2 == null) {
            return (AnnotatedMethod) kVar.f26154a;
        }
        while (kVar2 != null) {
            Class<?> declaringClass = ((AnnotatedMethod) kVar.f26154a).getDeclaringClass();
            Class<?> declaringClass2 = ((AnnotatedMethod) kVar2.f26154a).getDeclaringClass();
            if (declaringClass == declaringClass2) {
                annotatedMethod = (AnnotatedMethod) kVar2.f26154a;
                annotatedMethod2 = (AnnotatedMethod) kVar.f26154a;
                iW = W(annotatedMethod);
                iW2 = W(annotatedMethod2);
                if (iW != iW2) {
                    annotationIntrospector = this.d;
                    if (annotationIntrospector == null) {
                        annotatedMethodResolveSetterConflict = annotationIntrospector.resolveSetterConflict(this.c, annotatedMethod2, annotatedMethod);
                        if (annotatedMethodResolveSetterConflict != annotatedMethod2) {
                            if (annotatedMethodResolveSetterConflict != annotatedMethod) {
                            }
                            kVar = kVar2;
                        } else {
                            continue;
                        }
                    }
                    throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", getName(), ((AnnotatedMethod) kVar.f26154a).getFullName(), ((AnnotatedMethod) kVar2.f26154a).getFullName()));
                }
                if (iW < iW2) {
                    kVar = kVar2;
                }
            } else if (declaringClass.isAssignableFrom(declaringClass2)) {
                kVar = kVar2;
            } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                continue;
            } else {
                annotatedMethod = (AnnotatedMethod) kVar2.f26154a;
                annotatedMethod2 = (AnnotatedMethod) kVar.f26154a;
                iW = W(annotatedMethod);
                iW2 = W(annotatedMethod2);
                if (iW != iW2) {
                    annotationIntrospector = this.d;
                    if (annotationIntrospector == null) {
                        annotatedMethodResolveSetterConflict = annotationIntrospector.resolveSetterConflict(this.c, annotatedMethod2, annotatedMethod);
                        if (annotatedMethodResolveSetterConflict != annotatedMethod2) {
                            if (annotatedMethodResolveSetterConflict != annotatedMethod) {
                            }
                            kVar = kVar2;
                        } else {
                            continue;
                        }
                    }
                    throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", getName(), ((AnnotatedMethod) kVar.f26154a).getFullName(), ((AnnotatedMethod) kVar2.f26154a).getFullName()));
                }
                if (iW < iW2) {
                    kVar = kVar2;
                }
            }
            kVar2 = kVar2.f26155b;
        }
        this.j = kVar.f();
        return (AnnotatedMethod) kVar.f26154a;
    }

    @Override // defpackage.ih2
    public boolean y() {
        return this.h != null;
    }

    @Override // defpackage.ih2
    public boolean z() {
        return this.g != null;
    }

    public mgh(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this.c = mapperConfig;
        this.d = annotationIntrospector;
        this.f = propertyName;
        this.e = propertyName2;
        this.f26142b = z;
    }

    public mgh(mgh mghVar, PropertyName propertyName) {
        this.c = mghVar.c;
        this.d = mghVar.d;
        this.f = mghVar.f;
        this.e = propertyName;
        this.g = mghVar.g;
        this.h = mghVar.h;
        this.i = mghVar.i;
        this.j = mghVar.j;
        this.f26142b = mghVar.f26142b;
    }
}
