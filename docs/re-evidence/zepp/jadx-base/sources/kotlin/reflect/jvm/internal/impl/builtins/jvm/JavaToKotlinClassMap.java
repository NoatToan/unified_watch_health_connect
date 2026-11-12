package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class JavaToKotlinClassMap {

    @NotNull
    public static final JavaToKotlinClassMap INSTANCE;

    @NotNull
    private static final String a;

    @NotNull
    private static final String b;

    @NotNull
    private static final String c;

    @NotNull
    private static final String d;

    @NotNull
    private static final ClassId e;

    @NotNull
    private static final FqName f;

    @NotNull
    private static final ClassId g;

    @NotNull
    private static final ClassId h;

    @NotNull
    private static final ClassId i;

    @NotNull
    private static final HashMap<FqNameUnsafe, ClassId> j;

    @NotNull
    private static final HashMap<FqNameUnsafe, ClassId> k;

    @NotNull
    private static final HashMap<FqNameUnsafe, FqName> l;

    @NotNull
    private static final HashMap<FqNameUnsafe, FqName> m;

    @NotNull
    private static final List<PlatformMutabilityMapping> n;

    public static final class PlatformMutabilityMapping {

        @NotNull
        private final ClassId a;

        @NotNull
        private final ClassId b;

        @NotNull
        private final ClassId c;

        public PlatformMutabilityMapping(@NotNull ClassId classId, @NotNull ClassId classId2, @NotNull ClassId classId3) {
            this.a = classId;
            this.b = classId2;
            this.c = classId3;
        }

        @NotNull
        public final ClassId component1() {
            return this.a;
        }

        @NotNull
        public final ClassId component2() {
            return this.b;
        }

        @NotNull
        public final ClassId component3() {
            return this.c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.areEqual(this.a, platformMutabilityMapping.a) && Intrinsics.areEqual(this.b, platformMutabilityMapping.b) && Intrinsics.areEqual(this.c, platformMutabilityMapping.c);
        }

        @NotNull
        public final ClassId getJavaClass() {
            return this.a;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        @NotNull
        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
        }
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        StringBuilder sb = new StringBuilder();
        FunctionClassKind functionClassKind = FunctionClassKind.Function;
        sb.append(functionClassKind.getPackageFqName().toString());
        sb.append('.');
        sb.append(functionClassKind.getClassNamePrefix());
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionClassKind functionClassKind2 = FunctionClassKind.KFunction;
        sb2.append(functionClassKind2.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(functionClassKind2.getClassNamePrefix());
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassKind functionClassKind3 = FunctionClassKind.SuspendFunction;
        sb3.append(functionClassKind3.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(functionClassKind3.getClassNamePrefix());
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassKind functionClassKind4 = FunctionClassKind.KSuspendFunction;
        sb4.append(functionClassKind4.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(functionClassKind4.getClassNamePrefix());
        d = sb4.toString();
        ClassId classId = ClassId.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        e = classId;
        f = classId.asSingleFqName();
        g = ClassId.topLevel(new FqName("kotlin.reflect.KFunction"));
        h = ClassId.topLevel(new FqName("kotlin.reflect.KClass"));
        i = javaToKotlinClassMap.g(Class.class);
        j = new HashMap<>();
        k = new HashMap<>();
        l = new HashMap<>();
        m = new HashMap<>();
        ClassId classId2 = ClassId.topLevel(StandardNames.FqNames.iterable);
        int i2 = 0;
        ClassId classId3 = new ClassId(classId2.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableIterable, classId2.getPackageFqName()), false);
        ClassId classId4 = ClassId.topLevel(StandardNames.FqNames.iterator);
        ClassId classId5 = new ClassId(classId4.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableIterator, classId4.getPackageFqName()), false);
        ClassId classId6 = ClassId.topLevel(StandardNames.FqNames.collection);
        ClassId classId7 = new ClassId(classId6.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableCollection, classId6.getPackageFqName()), false);
        ClassId classId8 = ClassId.topLevel(StandardNames.FqNames.list);
        ClassId classId9 = new ClassId(classId8.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableList, classId8.getPackageFqName()), false);
        ClassId classId10 = ClassId.topLevel(StandardNames.FqNames.set);
        ClassId classId11 = new ClassId(classId10.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableSet, classId10.getPackageFqName()), false);
        ClassId classId12 = ClassId.topLevel(StandardNames.FqNames.listIterator);
        ClassId classId13 = new ClassId(classId12.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableListIterator, classId12.getPackageFqName()), false);
        FqName fqName = StandardNames.FqNames.map;
        ClassId classId14 = ClassId.topLevel(fqName);
        ClassId classId15 = new ClassId(classId14.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableMap, classId14.getPackageFqName()), false);
        ClassId classIdCreateNestedClassId = ClassId.topLevel(fqName).createNestedClassId(StandardNames.FqNames.mapEntry.shortName());
        List<PlatformMutabilityMapping> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new PlatformMutabilityMapping[]{new PlatformMutabilityMapping(javaToKotlinClassMap.g(Iterable.class), classId2, classId3), new PlatformMutabilityMapping(javaToKotlinClassMap.g(Iterator.class), classId4, classId5), new PlatformMutabilityMapping(javaToKotlinClassMap.g(Collection.class), classId6, classId7), new PlatformMutabilityMapping(javaToKotlinClassMap.g(List.class), classId8, classId9), new PlatformMutabilityMapping(javaToKotlinClassMap.g(Set.class), classId10, classId11), new PlatformMutabilityMapping(javaToKotlinClassMap.g(ListIterator.class), classId12, classId13), new PlatformMutabilityMapping(javaToKotlinClassMap.g(Map.class), classId14, classId15), new PlatformMutabilityMapping(javaToKotlinClassMap.g(Map.Entry.class), classIdCreateNestedClassId, new ClassId(classIdCreateNestedClassId.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableMapEntry, classIdCreateNestedClassId.getPackageFqName()), false))});
        n = listListOf;
        javaToKotlinClassMap.f(Object.class, StandardNames.FqNames.any);
        javaToKotlinClassMap.f(String.class, StandardNames.FqNames.string);
        javaToKotlinClassMap.f(CharSequence.class, StandardNames.FqNames.charSequence);
        javaToKotlinClassMap.e(Throwable.class, StandardNames.FqNames.throwable);
        javaToKotlinClassMap.f(Cloneable.class, StandardNames.FqNames.cloneable);
        javaToKotlinClassMap.f(Number.class, StandardNames.FqNames.number);
        javaToKotlinClassMap.e(Comparable.class, StandardNames.FqNames.comparable);
        javaToKotlinClassMap.f(Enum.class, StandardNames.FqNames._enum);
        javaToKotlinClassMap.e(Annotation.class, StandardNames.FqNames.annotation);
        Iterator<PlatformMutabilityMapping> it2 = listListOf.iterator();
        while (it2.hasNext()) {
            INSTANCE.d(it2.next());
        }
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i3 = 0;
        while (i3 < length) {
            JvmPrimitiveType jvmPrimitiveType = jvmPrimitiveTypeArrValues[i3];
            i3++;
            INSTANCE.a(ClassId.topLevel(jvmPrimitiveType.getWrapperFqName()), ClassId.topLevel(StandardNames.getPrimitiveFqName(jvmPrimitiveType.getPrimitiveType())));
        }
        for (ClassId classId16 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            INSTANCE.a(ClassId.topLevel(new FqName("kotlin.jvm.internal." + classId16.getShortClassName().asString() + "CompanionObject")), classId16.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT));
        }
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            javaToKotlinClassMap2.a(ClassId.topLevel(new FqName(Intrinsics.stringPlus("kotlin.jvm.functions.Function", Integer.valueOf(i4)))), StandardNames.getFunctionClassId(i4));
            javaToKotlinClassMap2.c(new FqName(Intrinsics.stringPlus(b, Integer.valueOf(i4))), g);
            if (i5 >= 23) {
                break;
            } else {
                i4 = i5;
            }
        }
        while (true) {
            int i6 = i2 + 1;
            FunctionClassKind functionClassKind5 = FunctionClassKind.KSuspendFunction;
            String str = functionClassKind5.getPackageFqName().toString() + '.' + functionClassKind5.getClassNamePrefix();
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            javaToKotlinClassMap3.c(new FqName(Intrinsics.stringPlus(str, Integer.valueOf(i2))), g);
            if (i6 >= 22) {
                javaToKotlinClassMap3.c(StandardNames.FqNames.nothing.toSafe(), javaToKotlinClassMap3.g(Void.class));
                return;
            }
            i2 = i6;
        }
    }

    private JavaToKotlinClassMap() {
    }

    private final void a(ClassId classId, ClassId classId2) {
        b(classId, classId2);
        c(classId2.asSingleFqName(), classId);
    }

    private final void b(ClassId classId, ClassId classId2) {
        j.put(classId.asSingleFqName().toUnsafe(), classId2);
    }

    private final void c(FqName fqName, ClassId classId) {
        k.put(fqName.toUnsafe(), classId);
    }

    private final void d(PlatformMutabilityMapping platformMutabilityMapping) {
        ClassId classIdComponent1 = platformMutabilityMapping.component1();
        ClassId classIdComponent2 = platformMutabilityMapping.component2();
        ClassId classIdComponent3 = platformMutabilityMapping.component3();
        a(classIdComponent1, classIdComponent2);
        c(classIdComponent3.asSingleFqName(), classIdComponent1);
        FqName fqNameAsSingleFqName = classIdComponent2.asSingleFqName();
        FqName fqNameAsSingleFqName2 = classIdComponent3.asSingleFqName();
        l.put(classIdComponent3.asSingleFqName().toUnsafe(), fqNameAsSingleFqName);
        m.put(fqNameAsSingleFqName.toUnsafe(), fqNameAsSingleFqName2);
    }

    private final void e(Class<?> cls, FqName fqName) {
        a(g(cls), ClassId.topLevel(fqName));
    }

    private final void f(Class<?> cls, FqNameUnsafe fqNameUnsafe) {
        e(cls, fqNameUnsafe.toSafe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassId g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? ClassId.topLevel(new FqName(cls.getCanonicalName())) : g(declaringClass).createNestedClassId(Name.identifier(cls.getSimpleName()));
    }

    private final boolean h(FqNameUnsafe fqNameUnsafe, String str) {
        Integer intOrNull;
        String strSubstringAfter = StringsKt__StringsKt.substringAfter(fqNameUnsafe.asString(), str, "");
        return (strSubstringAfter.length() > 0) && !StringsKt__StringsKt.startsWith$default((CharSequence) strSubstringAfter, '0', false, 2, (Object) null) && (intOrNull = l.toIntOrNull(strSubstringAfter)) != null && intOrNull.intValue() >= 23;
    }

    @NotNull
    public final FqName getFUNCTION_N_FQ_NAME() {
        return f;
    }

    @NotNull
    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return n;
    }

    public final boolean isMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        HashMap<FqNameUnsafe, FqName> map = l;
        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return map.containsKey(fqNameUnsafe);
    }

    public final boolean isReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        HashMap<FqNameUnsafe, FqName> map = m;
        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return map.containsKey(fqNameUnsafe);
    }

    @Nullable
    public final ClassId mapJavaToKotlin(@NotNull FqName fqName) {
        return j.get(fqName.toUnsafe());
    }

    @Nullable
    public final ClassId mapKotlinToJava(@NotNull FqNameUnsafe fqNameUnsafe) {
        if (!h(fqNameUnsafe, a) && !h(fqNameUnsafe, c)) {
            if (!h(fqNameUnsafe, b) && !h(fqNameUnsafe, d)) {
                return k.get(fqNameUnsafe);
            }
            return g;
        }
        return e;
    }

    @Nullable
    public final FqName mutableToReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        return l.get(fqNameUnsafe);
    }

    @Nullable
    public final FqName readOnlyToMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        return m.get(fqNameUnsafe);
    }
}
