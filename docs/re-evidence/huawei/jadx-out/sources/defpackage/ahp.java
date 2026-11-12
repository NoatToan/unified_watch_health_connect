package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.util.LookupCache;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.seuqneceutils.SequenceDetailFieldConfig;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public class ahp implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final ahl f421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final ahl f422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final ahl f423c;
    protected static final ahl d;
    protected static final ahl e;
    protected static final ahl f;
    protected static final ahl g;
    protected static final ahl h;
    protected static final ahl i;
    private static final Class<?> q;
    private static final Class<?> r;
    private static final long serialVersionUID = 1;
    private static final Class<?> x;
    protected final LookupCache<Object, JavaType> k;
    protected final TypeModifier[] l;
    protected final ahm n;
    protected final ClassLoader o;
    private static final JavaType[] y = new JavaType[0];
    protected static final ahp m = new ahp();
    protected static final ahn j = ahn.e();
    private static final Class<?> u = String.class;
    private static final Class<?> v = Object.class;
    private static final Class<?> s = Comparable.class;
    private static final Class<?> p = Class.class;
    private static final Class<?> t = Enum.class;
    private static final Class<?> w = JsonNode.class;

    static {
        Class<?> cls = Boolean.TYPE;
        r = cls;
        Class<?> cls2 = Integer.TYPE;
        q = cls2;
        Class<?> cls3 = Long.TYPE;
        x = cls3;
        f423c = new ahl(cls);
        f422b = new ahl(cls2);
        h = new ahl(cls3);
        i = new ahl(String.class);
        f = new ahl(Object.class);
        f421a = new ahl(Comparable.class);
        e = new ahl(Enum.class);
        d = new ahl(Class.class);
        g = new ahl(JsonNode.class);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private ahp() {
        this(null);
    }

    protected ahp(LookupCache<Object, JavaType> lookupCache) {
        this.k = lookupCache == null ? new aia<>(16, 200) : lookupCache;
        this.n = new ahm(this);
        this.l = null;
        this.o = null;
    }

    protected ahp(LookupCache<Object, JavaType> lookupCache, ahm ahmVar, TypeModifier[] typeModifierArr, ClassLoader classLoader) {
        this.k = lookupCache == null ? new aia<>(16, 200) : lookupCache;
        this.n = ahmVar.c(this);
        this.l = typeModifierArr;
        this.o = classLoader;
    }

    public ahp a(TypeModifier typeModifier) {
        LookupCache<Object, JavaType> lookupCache = this.k;
        TypeModifier[] typeModifierArr = null;
        if (typeModifier == null) {
            lookupCache = null;
        } else {
            TypeModifier[] typeModifierArr2 = this.l;
            if (typeModifierArr2 == null) {
                lookupCache = null;
                typeModifierArr = new TypeModifier[]{typeModifier};
            } else {
                typeModifierArr = (TypeModifier[]) aht.d(typeModifierArr2, typeModifier);
            }
        }
        return new ahp(lookupCache, this.n, typeModifierArr, this.o);
    }

    public static ahp a() {
        return m;
    }

    public ClassLoader e() {
        return this.o;
    }

    public static JavaType c() {
        return a().d();
    }

    public Class<?> e(String str) throws ClassNotFoundException {
        Throwable thB;
        Class<?> clsC;
        if (str.indexOf(46) < 0 && (clsC = c(str)) != null) {
            return clsC;
        }
        ClassLoader classLoaderE = e();
        if (classLoaderE == null) {
            classLoaderE = Thread.currentThread().getContextClassLoader();
        }
        if (classLoaderE != null) {
            try {
                return c(str, true, classLoaderE);
            } catch (Exception e2) {
                thB = ahw.b((Throwable) e2);
            }
        } else {
            thB = null;
        }
        try {
            return d(str);
        } catch (Exception e3) {
            if (thB == null) {
                thB = ahw.b((Throwable) e3);
            }
            ahw.i(thB);
            throw new ClassNotFoundException(thB.getMessage(), thB);
        }
    }

    protected Class<?> c(String str, boolean z, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(str, true, classLoader);
    }

    protected Class<?> d(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    protected Class<?> c(String str) {
        if ("int".equals(str)) {
            return Integer.TYPE;
        }
        if ("long".equals(str)) {
            return Long.TYPE;
        }
        if ("float".equals(str)) {
            return Float.TYPE;
        }
        if (SequenceDetailFieldConfig.DOUBLE.equals(str)) {
            return Double.TYPE;
        }
        if (TypedValues.Custom.S_BOOLEAN.equals(str)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(str)) {
            return Byte.TYPE;
        }
        if (SequenceDetailFieldConfig.CHAR.equals(str)) {
            return Character.TYPE;
        }
        if ("short".equals(str)) {
            return Short.TYPE;
        }
        if ("void".equals(str)) {
            return Void.TYPE;
        }
        return null;
    }

    public JavaType c(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return b(javaType, cls, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        if (r0 == java.util.EnumSet.class) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JavaType b(JavaType javaType, Class<?> cls, boolean z) throws IllegalArgumentException {
        int length;
        JavaType javaTypeD;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass != cls) {
            if (rawClass == Object.class) {
                javaTypeD = d((ahf) null, cls, j);
            } else {
                if (!rawClass.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException(String.format("Class %s not subtype of %s", ahw.u(cls), ahw.a(javaType)));
                }
                if (javaType.isContainerType()) {
                    if (javaType.isMapLikeType()) {
                        if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                            javaTypeD = d((ahf) null, cls, ahn.b(cls, javaType.getKeyType(), javaType.getContentType()));
                        } else if (!javaType.getBindings().a()) {
                            javaTypeD = d((ahf) null, cls, j);
                        } else {
                            javaTypeD = d((ahf) null, cls, e(javaType, length, cls, z));
                        }
                    } else if (javaType.isCollectionLikeType()) {
                        if (cls == ArrayList.class || cls == LinkedList.class || cls == HashSet.class || cls == TreeSet.class) {
                            javaTypeD = d((ahf) null, cls, ahn.a(cls, javaType.getContentType()));
                        }
                    } else if (!javaType.getBindings().a()) {
                        javaTypeD = d((ahf) null, cls, j);
                    } else {
                        javaTypeD = d((ahf) null, cls, e(javaType, length, cls, z));
                    }
                } else if (!javaType.getBindings().a() || (length = cls.getTypeParameters().length) == 0) {
                    javaTypeD = d((ahf) null, cls, j);
                } else {
                    javaTypeD = d((ahf) null, cls, e(javaType, length, cls, z));
                }
            }
            return javaTypeD.withHandlersFrom(javaType);
        }
        return javaType;
    }

    private ahn e(JavaType javaType, int i2, Class<?> cls, boolean z) {
        ahj[] ahjVarArr = new ahj[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            ahjVarArr[i3] = new ahj(i3);
        }
        JavaType javaTypeFindSuperType = d((ahf) null, cls, ahn.a(cls, ahjVarArr)).findSuperType(javaType.getRawClass());
        if (javaTypeFindSuperType == null) {
            throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", javaType.getRawClass().getName(), cls.getName()));
        }
        String strB = b(javaType, javaTypeFindSuperType);
        if (strB != null && !z) {
            throw new IllegalArgumentException("Failed to specialize base type " + javaType.toCanonical() + " as " + cls.getName() + ", problem: " + strB);
        }
        JavaType[] javaTypeArr = new JavaType[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            JavaType javaTypeC = ahjVarArr[i4].c();
            if (javaTypeC == null) {
                javaTypeC = c();
            }
            javaTypeArr[i4] = javaTypeC;
        }
        return ahn.a(cls, javaTypeArr);
    }

    private String b(JavaType javaType, JavaType javaType2) throws IllegalArgumentException {
        List<JavaType> listB = javaType.getBindings().b();
        List<JavaType> listB2 = javaType2.getBindings().b();
        int size = listB2.size();
        int size2 = listB.size();
        int i2 = 0;
        while (i2 < size2) {
            JavaType javaType3 = listB.get(i2);
            JavaType javaTypeC = i2 < size ? listB2.get(i2) : c();
            if (!e(javaType3, javaTypeC) && !javaType3.hasRawClass(Object.class) && ((i2 != 0 || !javaType.isMapLikeType() || !javaTypeC.hasRawClass(Object.class)) && (!javaType3.isInterface() || !javaType3.isTypeOrSuperTypeOf(javaTypeC.getRawClass())))) {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", Integer.valueOf(i2 + 1), Integer.valueOf(size2), javaType3.toCanonical(), javaTypeC.toCanonical());
            }
            i2++;
        }
        return null;
    }

    private boolean e(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof ahj) {
            ((ahj) javaType2).c(javaType);
            return true;
        }
        if (javaType.getRawClass() != javaType2.getRawClass()) {
            return false;
        }
        List<JavaType> listB = javaType.getBindings().b();
        List<JavaType> listB2 = javaType2.getBindings().b();
        int size = listB.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!e(listB.get(i2), listB2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public JavaType b(JavaType javaType, Class<?> cls) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        JavaType javaTypeFindSuperType = javaType.findSuperType(cls);
        if (javaTypeFindSuperType != null) {
            return javaTypeFindSuperType;
        }
        if (!cls.isAssignableFrom(rawClass)) {
            throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), javaType));
        }
        throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), javaType));
    }

    public JavaType b(String str) throws IllegalArgumentException {
        return this.n.e(str);
    }

    public JavaType[] a(JavaType javaType, Class<?> cls) {
        JavaType javaTypeFindSuperType = javaType.findSuperType(cls);
        if (javaTypeFindSuperType == null) {
            return y;
        }
        return javaTypeFindSuperType.getBindings().d();
    }

    public JavaType b(Type type) {
        return b((ahf) null, type, j);
    }

    public JavaType a(TypeReference<?> typeReference) {
        return b((ahf) null, typeReference.getType(), j);
    }

    public JavaType a(Type type, ahn ahnVar) {
        return b((ahf) null, type, ahnVar);
    }

    public ahg b(Class<? extends Collection> cls, Class<?> cls2) {
        return b(cls, d((ahf) null, cls2, j));
    }

    public ahg b(Class<? extends Collection> cls, JavaType javaType) {
        ahn ahnVarD = ahn.d(cls, javaType);
        ahg ahgVar = (ahg) d((ahf) null, cls, ahnVarD);
        if (ahnVarD.a() && javaType != null) {
            JavaType contentType = ahgVar.findSuperType(Collection.class).getContentType();
            if (!contentType.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", ahw.u(cls), javaType, contentType));
            }
        }
        return ahgVar;
    }

    public ahh c(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        JavaType javaTypeD;
        JavaType javaTypeD2;
        if (cls == Properties.class) {
            javaTypeD = i;
            javaTypeD2 = javaTypeD;
        } else {
            ahn ahnVar = j;
            javaTypeD = d((ahf) null, cls2, ahnVar);
            javaTypeD2 = d((ahf) null, cls3, ahnVar);
        }
        return c(cls, javaTypeD, javaTypeD2);
    }

    public ahh c(Class<? extends Map> cls, JavaType javaType, JavaType javaType2) {
        ahn ahnVarB = ahn.b(cls, new JavaType[]{javaType, javaType2});
        ahh ahhVar = (ahh) d((ahf) null, cls, ahnVarB);
        if (ahnVarB.a()) {
            JavaType javaTypeFindSuperType = ahhVar.findSuperType(Map.class);
            JavaType keyType = javaTypeFindSuperType.getKeyType();
            if (!keyType.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", ahw.u(cls), javaType, keyType));
            }
            JavaType contentType = javaTypeFindSuperType.getContentType();
            if (!contentType.equals(javaType2)) {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", ahw.u(cls), javaType2, contentType));
            }
        }
        return ahhVar;
    }

    @Deprecated
    public JavaType d(Class<?> cls) {
        return a(cls, j, null, null);
    }

    public JavaType c(Class<?> cls, ahn ahnVar) {
        return d(cls, d((ahf) null, cls, ahnVar));
    }

    private JavaType e(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeD;
        JavaType javaType2;
        JavaType javaType3;
        if (cls == Properties.class) {
            javaTypeD = i;
        } else {
            List<JavaType> listB = ahnVar.b();
            int size = listB.size();
            if (size == 0) {
                javaTypeD = d();
            } else if (size == 2) {
                JavaType javaType4 = listB.get(0);
                javaType2 = listB.get(1);
                javaType3 = javaType4;
            } else {
                throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s (%s), can not resolve", ahw.u(cls), Integer.valueOf(size), size == 1 ? "" : "s", ahnVar));
            }
            return ahh.c(cls, ahnVar, javaType, javaTypeArr, javaType3, javaType2);
        }
        javaType3 = javaTypeD;
        javaType2 = javaType3;
        return ahh.c(cls, ahnVar, javaType, javaTypeArr, javaType3, javaType2);
    }

    private JavaType c(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeD;
        List<JavaType> listB = ahnVar.b();
        if (listB.isEmpty()) {
            javaTypeD = d();
        } else if (listB.size() == 1) {
            javaTypeD = listB.get(0);
        } else {
            throw new IllegalArgumentException("Strange Collection type " + cls.getName() + ": cannot determine type parameters");
        }
        return ahg.c(cls, ahnVar, javaType, javaTypeArr, javaTypeD);
    }

    private JavaType d(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeD;
        List<JavaType> listB = ahnVar.b();
        if (listB.isEmpty()) {
            javaTypeD = d();
        } else if (listB.size() == 1) {
            javaTypeD = listB.get(0);
        } else {
            throw new IllegalArgumentException("Strange Reference type " + cls.getName() + ": cannot determine type parameters");
        }
        return ahi.e(cls, ahnVar, javaType, javaTypeArr, javaTypeD);
    }

    protected JavaType a(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaTypeE;
        return (!ahnVar.a() || (javaTypeE = e(cls)) == null) ? b(cls, ahnVar, javaType, javaTypeArr) : javaTypeE;
    }

    protected JavaType b(Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new ahl(cls, ahnVar, javaType, javaTypeArr);
    }

    protected JavaType d() {
        return f;
    }

    protected JavaType e(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == r) {
                return f423c;
            }
            if (cls == q) {
                return f422b;
            }
            if (cls == x) {
                return h;
            }
            return null;
        }
        if (cls == u) {
            return i;
        }
        if (cls == v) {
            return f;
        }
        if (cls == w) {
            return g;
        }
        return null;
    }

    protected JavaType b(ahf ahfVar, Type type, ahn ahnVar) {
        JavaType javaTypeD;
        if (type instanceof Class) {
            javaTypeD = d(ahfVar, (Class<?>) type, j);
        } else if (type instanceof ParameterizedType) {
            javaTypeD = e(ahfVar, (ParameterizedType) type, ahnVar);
        } else {
            if (type instanceof JavaType) {
                return (JavaType) type;
            }
            if (type instanceof GenericArrayType) {
                javaTypeD = a(ahfVar, (GenericArrayType) type, ahnVar);
            } else if (type instanceof TypeVariable) {
                javaTypeD = c(ahfVar, (TypeVariable<?>) type, ahnVar);
            } else if (type instanceof WildcardType) {
                javaTypeD = d(ahfVar, (WildcardType) type, ahnVar);
            } else {
                StringBuilder sb = new StringBuilder("Unrecognized Type: ");
                sb.append(type == null ? "[null]" : type.toString());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return d(type, javaTypeD);
    }

    protected JavaType d(Type type, JavaType javaType) {
        if (this.l == null) {
            return javaType;
        }
        ahn bindings = javaType.getBindings();
        if (bindings == null) {
            bindings = j;
        }
        TypeModifier[] typeModifierArr = this.l;
        int length = typeModifierArr.length;
        int i2 = 0;
        while (i2 < length) {
            TypeModifier typeModifier = typeModifierArr[i2];
            JavaType javaTypeModifyType = typeModifier.modifyType(javaType, type, bindings, this);
            if (javaTypeModifyType == null) {
                throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", typeModifier, typeModifier.getClass().getName(), javaType));
            }
            i2++;
            javaType = javaTypeModifyType;
        }
        return javaType;
    }

    protected JavaType d(ahf ahfVar, Class<?> cls, ahn ahnVar) {
        ahf ahfVarB;
        JavaType javaTypeA;
        JavaType[] javaTypeArrE;
        JavaType javaTypeB;
        JavaType javaTypeE = e(cls);
        if (javaTypeE != null) {
            return javaTypeE;
        }
        Object objE = (ahnVar == null || ahnVar.a()) ? cls : ahnVar.e(cls);
        JavaType javaTypeRefine = this.k.get(objE);
        if (javaTypeRefine != null) {
            return javaTypeRefine;
        }
        if (ahfVar == null) {
            ahfVarB = new ahf(cls);
        } else {
            ahf ahfVarD = ahfVar.d(cls);
            if (ahfVarD != null) {
                aho ahoVar = new aho(cls, j);
                ahfVarD.a(ahoVar);
                return ahoVar;
            }
            ahfVarB = ahfVar.b(cls);
        }
        if (cls.isArray()) {
            javaTypeB = ahe.e(b(ahfVarB, cls.getComponentType(), ahnVar), ahnVar);
        } else {
            if (cls.isInterface()) {
                javaTypeArrE = e(ahfVarB, cls, ahnVar);
                javaTypeA = null;
            } else {
                javaTypeA = a(ahfVarB, cls, ahnVar);
                javaTypeArrE = e(ahfVarB, cls, ahnVar);
            }
            JavaType[] javaTypeArr = javaTypeArrE;
            JavaType javaType = javaTypeA;
            if (cls == Properties.class) {
                ahl ahlVar = i;
                javaTypeRefine = ahh.c(cls, ahnVar, javaType, javaTypeArr, ahlVar, ahlVar);
            } else if (javaType != null) {
                javaTypeRefine = javaType.refine(cls, ahnVar, javaType, javaTypeArr);
            }
            javaTypeB = (javaTypeRefine == null && (javaTypeRefine = d(ahfVarB, cls, ahnVar, javaType, javaTypeArr)) == null && (javaTypeRefine = e(ahfVarB, cls, ahnVar, javaType, javaTypeArr)) == null) ? b(cls, ahnVar, javaType, javaTypeArr) : javaTypeRefine;
        }
        ahfVarB.c(javaTypeB);
        if (!javaTypeB.hasHandlers()) {
            this.k.putIfAbsent(objE, javaTypeB);
        }
        return javaTypeB;
    }

    protected JavaType a(ahf ahfVar, Class<?> cls, ahn ahnVar) {
        Type typeJ = ahw.j(cls);
        if (typeJ == null) {
            return null;
        }
        return b(ahfVar, typeJ, ahnVar);
    }

    protected JavaType[] e(ahf ahfVar, Class<?> cls, ahn ahnVar) {
        Type[] typeArrH = ahw.h(cls);
        if (typeArrH == null || typeArrH.length == 0) {
            return y;
        }
        int length = typeArrH.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i2 = 0; i2 < length; i2++) {
            javaTypeArr[i2] = b(ahfVar, typeArrH[i2], ahnVar);
        }
        return javaTypeArr;
    }

    protected JavaType d(ahf ahfVar, Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        if (ahnVar == null) {
            ahnVar = j;
        }
        if (cls == Map.class) {
            return e(cls, ahnVar, javaType, javaTypeArr);
        }
        if (cls == Collection.class) {
            return c(cls, ahnVar, javaType, javaTypeArr);
        }
        if (cls == AtomicReference.class) {
            return d(cls, ahnVar, javaType, javaTypeArr);
        }
        return null;
    }

    protected JavaType e(ahf ahfVar, Class<?> cls, ahn ahnVar, JavaType javaType, JavaType[] javaTypeArr) {
        for (JavaType javaType2 : javaTypeArr) {
            JavaType javaTypeRefine = javaType2.refine(cls, ahnVar, javaType, javaTypeArr);
            if (javaTypeRefine != null) {
                return javaTypeRefine;
            }
        }
        return null;
    }

    protected JavaType e(ahf ahfVar, ParameterizedType parameterizedType, ahn ahnVar) {
        ahn ahnVarA;
        Class<?> cls = (Class) parameterizedType.getRawType();
        if (cls == t) {
            return e;
        }
        if (cls == s) {
            return f421a;
        }
        if (cls == p) {
            return d;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
        if (length == 0) {
            ahnVarA = j;
        } else {
            JavaType[] javaTypeArr = new JavaType[length];
            for (int i2 = 0; i2 < length; i2++) {
                javaTypeArr[i2] = b(ahfVar, actualTypeArguments[i2], ahnVar);
            }
            ahnVarA = ahn.a(cls, javaTypeArr);
        }
        return d(ahfVar, cls, ahnVarA);
    }

    protected JavaType a(ahf ahfVar, GenericArrayType genericArrayType, ahn ahnVar) {
        return ahe.e(b(ahfVar, genericArrayType.getGenericComponentType(), ahnVar), ahnVar);
    }

    protected JavaType c(ahf ahfVar, TypeVariable<?> typeVariable, ahn ahnVar) {
        Type[] bounds;
        String name = typeVariable.getName();
        if (ahnVar == null) {
            throw new IllegalArgumentException("Null `bindings` passed (type variable \"" + name + "\")");
        }
        JavaType javaTypeD = ahnVar.d(name);
        if (javaTypeD != null) {
            return javaTypeD;
        }
        if (ahnVar.e(name)) {
            return f;
        }
        ahn ahnVarB = ahnVar.b(name);
        synchronized (typeVariable) {
            bounds = typeVariable.getBounds();
        }
        return b(ahfVar, bounds[0], ahnVarB);
    }

    protected JavaType d(ahf ahfVar, WildcardType wildcardType, ahn ahnVar) {
        return b(ahfVar, wildcardType.getUpperBounds()[0], ahnVar);
    }
}
