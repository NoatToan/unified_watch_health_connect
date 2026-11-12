package kotlin.reflect.jvm.internal.impl.name;

import com.xiaomi.ai.api.AIApiConstants;
import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIds\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,279:1\n1279#2,2:280\n1293#2,4:282\n1279#2,2:286\n1293#2,4:288\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIds\n*L\n94#1:280,2\n94#1:282,4\n98#1:286,2\n98#1:288,4\n*E\n"})
public final class StandardClassIds {

    @NotNull
    private static final ClassId Annotation;

    @NotNull
    private static final ClassId AnnotationRetention;

    @NotNull
    private static final ClassId AnnotationTarget;

    @NotNull
    private static final ClassId Any;

    @NotNull
    private static final ClassId Array;

    @NotNull
    private static final FqName BASE_ANNOTATION_PACKAGE;

    @NotNull
    private static final FqName BASE_COLLECTIONS_PACKAGE;

    @NotNull
    private static final FqName BASE_CONCURRENT_PACKAGE;

    @NotNull
    private static final FqName BASE_CONTRACTS_PACKAGE;

    @NotNull
    private static final FqName BASE_COROUTINES_PACKAGE;

    @NotNull
    private static final FqName BASE_ENUMS_PACKAGE;

    @NotNull
    private static final FqName BASE_INTERNAL_IR_PACKAGE;

    @NotNull
    private static final FqName BASE_INTERNAL_PACKAGE;

    @NotNull
    private static final FqName BASE_JVM_FUNCTIONS_PACKAGE;

    @NotNull
    private static final FqName BASE_JVM_INTERNAL_PACKAGE;

    @NotNull
    private static final FqName BASE_JVM_PACKAGE;

    @NotNull
    private static final FqName BASE_KOTLIN_PACKAGE;

    @NotNull
    private static final FqName BASE_RANGES_PACKAGE;

    @NotNull
    private static final FqName BASE_REFLECT_PACKAGE;

    @NotNull
    private static final FqName BASE_TEST_PACKAGE;

    @NotNull
    private static final ClassId Boolean;

    @NotNull
    private static final ClassId Byte;

    @NotNull
    private static final ClassId Char;

    @NotNull
    private static final ClassId CharIterator;

    @NotNull
    private static final ClassId CharRange;

    @NotNull
    private static final ClassId CharSequence;

    @NotNull
    private static final ClassId Cloneable;

    @NotNull
    private static final ClassId Collection;

    @NotNull
    private static final ClassId Comparable;

    @NotNull
    private static final ClassId Continuation;

    @NotNull
    private static final ClassId DeprecationLevel;

    @NotNull
    private static final ClassId Double;

    @NotNull
    private static final ClassId Enum;

    @NotNull
    private static final ClassId EnumEntries;

    @NotNull
    private static final ClassId Float;

    @NotNull
    private static final ClassId Function;

    @NotNull
    public static final StandardClassIds INSTANCE = new StandardClassIds();

    @NotNull
    private static final ClassId Int;

    @NotNull
    private static final ClassId IntRange;

    @NotNull
    private static final ClassId Iterable;

    @NotNull
    private static final ClassId Iterator;

    @NotNull
    private static final ClassId KCallable;

    @NotNull
    private static final ClassId KClass;

    @NotNull
    private static final ClassId KFunction;

    @NotNull
    private static final ClassId KMutableProperty;

    @NotNull
    private static final ClassId KMutableProperty0;

    @NotNull
    private static final ClassId KMutableProperty1;

    @NotNull
    private static final ClassId KMutableProperty2;

    @NotNull
    private static final ClassId KProperty;

    @NotNull
    private static final ClassId KProperty0;

    @NotNull
    private static final ClassId KProperty1;

    @NotNull
    private static final ClassId KProperty2;

    @NotNull
    private static final ClassId KType;

    @NotNull
    private static final ClassId List;

    @NotNull
    private static final ClassId ListIterator;

    @NotNull
    private static final ClassId Long;

    @NotNull
    private static final ClassId LongRange;

    @NotNull
    private static final ClassId Map;

    @NotNull
    private static final ClassId MapEntry;

    @NotNull
    private static final ClassId MutableCollection;

    @NotNull
    private static final ClassId MutableIterable;

    @NotNull
    private static final ClassId MutableIterator;

    @NotNull
    private static final ClassId MutableList;

    @NotNull
    private static final ClassId MutableListIterator;

    @NotNull
    private static final ClassId MutableMap;

    @NotNull
    private static final ClassId MutableMapEntry;

    @NotNull
    private static final ClassId MutableSet;

    @NotNull
    private static final ClassId Nothing;

    @NotNull
    private static final ClassId Number;

    @NotNull
    private static final ClassId Result;

    @NotNull
    private static final ClassId Set;

    @NotNull
    private static final ClassId Short;

    @NotNull
    private static final ClassId String;

    @NotNull
    private static final ClassId Throwable;

    @NotNull
    private static final ClassId UByte;

    @NotNull
    private static final ClassId UInt;

    @NotNull
    private static final ClassId ULong;

    @NotNull
    private static final ClassId UShort;

    @NotNull
    private static final ClassId Unit;

    @NotNull
    private static final Set<ClassId> allBuiltinTypes;

    @NotNull
    private static final Set<FqName> builtInsPackages;

    @NotNull
    private static final Set<FqName> builtInsPackagesWithDefaultNamedImport;

    @NotNull
    private static final Set<ClassId> constantAllowedTypes;

    @NotNull
    private static final Map<ClassId, ClassId> elementTypeByPrimitiveArrayType;

    @NotNull
    private static final Map<ClassId, ClassId> elementTypeByUnsignedArrayType;

    @NotNull
    private static final Map<ClassId, ClassId> primitiveArrayTypeByElementType;

    @NotNull
    private static final Set<ClassId> primitiveTypes;

    @NotNull
    private static final Map<ClassId, ClassId> unsignedArrayTypeByElementType;

    @NotNull
    private static final Set<ClassId> unsignedTypes;

    static {
        FqName fqName = new FqName("kotlin");
        BASE_KOTLIN_PACKAGE = fqName;
        FqName fqNameChild = fqName.child(Name.identifier("reflect"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(...)");
        BASE_REFLECT_PACKAGE = fqNameChild;
        FqName fqNameChild2 = fqName.child(Name.identifier("collections"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild2, "child(...)");
        BASE_COLLECTIONS_PACKAGE = fqNameChild2;
        FqName fqNameChild3 = fqName.child(Name.identifier("ranges"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild3, "child(...)");
        BASE_RANGES_PACKAGE = fqNameChild3;
        FqName fqNameChild4 = fqName.child(Name.identifier(DebugImage.JVM));
        Intrinsics.checkNotNullExpressionValue(fqNameChild4, "child(...)");
        BASE_JVM_PACKAGE = fqNameChild4;
        FqName fqNameChild5 = fqNameChild4.child(Name.identifier("internal"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild5, "child(...)");
        BASE_JVM_INTERNAL_PACKAGE = fqNameChild5;
        FqName fqNameChild6 = fqNameChild4.child(Name.identifier("functions"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild6, "child(...)");
        BASE_JVM_FUNCTIONS_PACKAGE = fqNameChild6;
        FqName fqNameChild7 = fqName.child(Name.identifier("annotation"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild7, "child(...)");
        BASE_ANNOTATION_PACKAGE = fqNameChild7;
        FqName fqNameChild8 = fqName.child(Name.identifier("internal"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild8, "child(...)");
        BASE_INTERNAL_PACKAGE = fqNameChild8;
        FqName fqNameChild9 = fqNameChild8.child(Name.identifier("ir"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild9, "child(...)");
        BASE_INTERNAL_IR_PACKAGE = fqNameChild9;
        FqName fqNameChild10 = fqName.child(Name.identifier("coroutines"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild10, "child(...)");
        BASE_COROUTINES_PACKAGE = fqNameChild10;
        FqName fqNameChild11 = fqName.child(Name.identifier("enums"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild11, "child(...)");
        BASE_ENUMS_PACKAGE = fqNameChild11;
        FqName fqNameChild12 = fqName.child(Name.identifier("contracts"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild12, "child(...)");
        BASE_CONTRACTS_PACKAGE = fqNameChild12;
        FqName fqNameChild13 = fqName.child(Name.identifier("concurrent"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild13, "child(...)");
        BASE_CONCURRENT_PACKAGE = fqNameChild13;
        FqName fqNameChild14 = fqName.child(Name.identifier("test"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild14, "child(...)");
        BASE_TEST_PACKAGE = fqNameChild14;
        builtInsPackagesWithDefaultNamedImport = SetsKt__SetsKt.setOf((Object[]) new FqName[]{fqName, fqNameChild2, fqNameChild3, fqNameChild7});
        builtInsPackages = SetsKt__SetsKt.setOf((Object[]) new FqName[]{fqName, fqNameChild2, fqNameChild3, fqNameChild7, fqNameChild, fqNameChild8, fqNameChild10});
        Nothing = StandardClassIdsKt.baseId("Nothing");
        Unit = StandardClassIdsKt.baseId("Unit");
        Any = StandardClassIdsKt.baseId("Any");
        Enum = StandardClassIdsKt.baseId("Enum");
        Annotation = StandardClassIdsKt.baseId("Annotation");
        Array = StandardClassIdsKt.baseId("Array");
        ClassId classIdBaseId = StandardClassIdsKt.baseId("Boolean");
        Boolean = classIdBaseId;
        ClassId classIdBaseId2 = StandardClassIdsKt.baseId("Char");
        Char = classIdBaseId2;
        ClassId classIdBaseId3 = StandardClassIdsKt.baseId("Byte");
        Byte = classIdBaseId3;
        ClassId classIdBaseId4 = StandardClassIdsKt.baseId("Short");
        Short = classIdBaseId4;
        ClassId classIdBaseId5 = StandardClassIdsKt.baseId("Int");
        Int = classIdBaseId5;
        ClassId classIdBaseId6 = StandardClassIdsKt.baseId("Long");
        Long = classIdBaseId6;
        ClassId classIdBaseId7 = StandardClassIdsKt.baseId("Float");
        Float = classIdBaseId7;
        ClassId classIdBaseId8 = StandardClassIdsKt.baseId("Double");
        Double = classIdBaseId8;
        UByte = StandardClassIdsKt.unsignedId(classIdBaseId3);
        UShort = StandardClassIdsKt.unsignedId(classIdBaseId4);
        UInt = StandardClassIdsKt.unsignedId(classIdBaseId5);
        ULong = StandardClassIdsKt.unsignedId(classIdBaseId6);
        CharSequence = StandardClassIdsKt.baseId("CharSequence");
        String = StandardClassIdsKt.baseId("String");
        Throwable = StandardClassIdsKt.baseId("Throwable");
        Cloneable = StandardClassIdsKt.baseId("Cloneable");
        KProperty = StandardClassIdsKt.reflectId("KProperty");
        KMutableProperty = StandardClassIdsKt.reflectId("KMutableProperty");
        KProperty0 = StandardClassIdsKt.reflectId("KProperty0");
        KMutableProperty0 = StandardClassIdsKt.reflectId("KMutableProperty0");
        KProperty1 = StandardClassIdsKt.reflectId("KProperty1");
        KMutableProperty1 = StandardClassIdsKt.reflectId("KMutableProperty1");
        KProperty2 = StandardClassIdsKt.reflectId("KProperty2");
        KMutableProperty2 = StandardClassIdsKt.reflectId("KMutableProperty2");
        KFunction = StandardClassIdsKt.reflectId("KFunction");
        KClass = StandardClassIdsKt.reflectId("KClass");
        KCallable = StandardClassIdsKt.reflectId("KCallable");
        KType = StandardClassIdsKt.reflectId("KType");
        Comparable = StandardClassIdsKt.baseId("Comparable");
        Number = StandardClassIdsKt.baseId("Number");
        Function = StandardClassIdsKt.baseId("Function");
        Set<ClassId> of = SetsKt__SetsKt.setOf((Object[]) new ClassId[]{classIdBaseId, classIdBaseId2, classIdBaseId3, classIdBaseId4, classIdBaseId5, classIdBaseId6, classIdBaseId7, classIdBaseId8});
        primitiveTypes = of;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(of, 10)), 16));
        for (Object obj : of) {
            linkedHashMap.put(obj, StandardClassIdsKt.primitiveArrayId(((ClassId) obj).getShortClassName()));
        }
        primitiveArrayTypeByElementType = linkedHashMap;
        elementTypeByPrimitiveArrayType = StandardClassIdsKt.inverseMap(linkedHashMap);
        Set<ClassId> of2 = SetsKt__SetsKt.setOf((Object[]) new ClassId[]{UByte, UShort, UInt, ULong});
        unsignedTypes = of2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(of2, 10)), 16));
        for (Object obj2 : of2) {
            linkedHashMap2.put(obj2, StandardClassIdsKt.primitiveArrayId(((ClassId) obj2).getShortClassName()));
        }
        unsignedArrayTypeByElementType = linkedHashMap2;
        elementTypeByUnsignedArrayType = StandardClassIdsKt.inverseMap(linkedHashMap2);
        Set<ClassId> set = primitiveTypes;
        Set<ClassId> set2 = unsignedTypes;
        Set setPlus = SetsKt___SetsKt.plus((Set) set, (Iterable) set2);
        ClassId classId = String;
        constantAllowedTypes = SetsKt___SetsKt.plus((Set<? extends ClassId>) ((Set<? extends Object>) setPlus), classId);
        Continuation = StandardClassIdsKt.coroutinesId("Continuation");
        Iterator = StandardClassIdsKt.collectionsId("Iterator");
        Iterable = StandardClassIdsKt.collectionsId("Iterable");
        Collection = StandardClassIdsKt.collectionsId("Collection");
        List = StandardClassIdsKt.collectionsId("List");
        ListIterator = StandardClassIdsKt.collectionsId("ListIterator");
        Set = StandardClassIdsKt.collectionsId("Set");
        ClassId classIdCollectionsId = StandardClassIdsKt.collectionsId(AIApiConstants.Map.NAME);
        Map = classIdCollectionsId;
        MutableIterator = StandardClassIdsKt.collectionsId("MutableIterator");
        CharIterator = StandardClassIdsKt.collectionsId("CharIterator");
        MutableIterable = StandardClassIdsKt.collectionsId("MutableIterable");
        MutableCollection = StandardClassIdsKt.collectionsId("MutableCollection");
        MutableList = StandardClassIdsKt.collectionsId("MutableList");
        MutableListIterator = StandardClassIdsKt.collectionsId("MutableListIterator");
        MutableSet = StandardClassIdsKt.collectionsId("MutableSet");
        ClassId classIdCollectionsId2 = StandardClassIdsKt.collectionsId("MutableMap");
        MutableMap = classIdCollectionsId2;
        Name nameIdentifier = Name.identifier("Entry");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        MapEntry = classIdCollectionsId.createNestedClassId(nameIdentifier);
        Name nameIdentifier2 = Name.identifier("MutableEntry");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        MutableMapEntry = classIdCollectionsId2.createNestedClassId(nameIdentifier2);
        Result = StandardClassIdsKt.baseId("Result");
        IntRange = StandardClassIdsKt.rangesId("IntRange");
        LongRange = StandardClassIdsKt.rangesId("LongRange");
        CharRange = StandardClassIdsKt.rangesId("CharRange");
        AnnotationRetention = StandardClassIdsKt.annotationId("AnnotationRetention");
        AnnotationTarget = StandardClassIdsKt.annotationId("AnnotationTarget");
        DeprecationLevel = StandardClassIdsKt.baseId("DeprecationLevel");
        EnumEntries = StandardClassIdsKt.enumsId("EnumEntries");
        allBuiltinTypes = SetsKt___SetsKt.plus((Set<? extends ClassId>) ((Set<? extends Object>) SetsKt___SetsKt.plus((Set<? extends ClassId>) ((Set<? extends Object>) SetsKt___SetsKt.plus((Set<? extends ClassId>) ((Set<? extends Object>) SetsKt___SetsKt.plus((Set<? extends ClassId>) ((Set<? extends Object>) SetsKt___SetsKt.plus((Set) set, (Iterable) set2)), classId)), Unit)), Any)), Enum);
    }

    private StandardClassIds() {
    }

    @NotNull
    public final ClassId getArray() {
        return Array;
    }

    @NotNull
    public final FqName getBASE_ANNOTATION_PACKAGE() {
        return BASE_ANNOTATION_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_COLLECTIONS_PACKAGE() {
        return BASE_COLLECTIONS_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_COROUTINES_PACKAGE() {
        return BASE_COROUTINES_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_ENUMS_PACKAGE() {
        return BASE_ENUMS_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_KOTLIN_PACKAGE() {
        return BASE_KOTLIN_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_RANGES_PACKAGE() {
        return BASE_RANGES_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_REFLECT_PACKAGE() {
        return BASE_REFLECT_PACKAGE;
    }

    @NotNull
    public final ClassId getEnumEntries() {
        return EnumEntries;
    }

    @NotNull
    public final ClassId getKClass() {
        return KClass;
    }

    @NotNull
    public final ClassId getKFunction() {
        return KFunction;
    }

    @NotNull
    public final ClassId getMutableList() {
        return MutableList;
    }

    @NotNull
    public final ClassId getMutableMap() {
        return MutableMap;
    }

    @NotNull
    public final ClassId getMutableSet() {
        return MutableSet;
    }
}
