package kotlin.reflect.jvm.internal.impl.builtins;

import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.cybergarage.upnp.std.av.renderer.AVTransport;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class StandardNames {

    @JvmField
    @NotNull
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;

    @JvmField
    @NotNull
    public static final Name BUILT_INS_PACKAGE_NAME;

    @JvmField
    @NotNull
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL;

    @JvmField
    @NotNull
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME_RELEASE;

    @JvmField
    @NotNull
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME_EXPERIMENTAL;

    @JvmField
    @NotNull
    public static final FqName COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL;

    @JvmField
    @NotNull
    public static final FqName COROUTINES_PACKAGE_FQ_NAME_RELEASE;

    @JvmField
    @NotNull
    public static final FqName KOTLIN_REFLECT_FQ_NAME;

    @JvmField
    @NotNull
    public static final List<String> PREFIXES;

    @JvmField
    @NotNull
    public static final FqName RANGES_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName RESULT_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName TEXT_PACKAGE_FQ_NAME;

    @NotNull
    public static final StandardNames INSTANCE = new StandardNames();

    @JvmField
    @NotNull
    public static final Name ENUM_VALUES = Name.identifier("values");

    @JvmField
    @NotNull
    public static final Name ENUM_VALUE_OF = Name.identifier("valueOf");

    @JvmField
    @NotNull
    public static final Name CHAR_CODE = Name.identifier("code");

    public static final class FqNames {

        @NotNull
        public static final FqNames INSTANCE;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _boolean;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _byte;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _char;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _double;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _enum;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _float;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _int;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _long;

        @JvmField
        @NotNull
        public static final FqNameUnsafe _short;

        @JvmField
        @NotNull
        public static final FqName annotation;

        @JvmField
        @NotNull
        public static final FqName annotationRetention;

        @JvmField
        @NotNull
        public static final FqName annotationTarget;

        @JvmField
        @NotNull
        public static final FqNameUnsafe any;

        @JvmField
        @NotNull
        public static final FqNameUnsafe array;

        @JvmField
        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;

        @JvmField
        @NotNull
        public static final FqNameUnsafe charSequence;

        @JvmField
        @NotNull
        public static final FqNameUnsafe cloneable;

        @JvmField
        @NotNull
        public static final FqName collection;

        @JvmField
        @NotNull
        public static final FqName comparable;

        @JvmField
        @NotNull
        public static final FqName deprecated;

        @JvmField
        @NotNull
        public static final FqName deprecatedSinceKotlin;

        @JvmField
        @NotNull
        public static final FqName deprecationLevel;

        @JvmField
        @NotNull
        public static final FqName extensionFunctionType;

        @JvmField
        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;

        @JvmField
        @NotNull
        public static final FqNameUnsafe functionSupertype;

        @JvmField
        @NotNull
        public static final FqNameUnsafe intRange;

        @JvmField
        @NotNull
        public static final FqName iterable;

        @JvmField
        @NotNull
        public static final FqName iterator;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kCallable;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kClass;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kDeclarationContainer;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty0;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty1;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty2;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutablePropertyFqName;

        @JvmField
        @NotNull
        public static final ClassId kProperty;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty0;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty1;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty2;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kPropertyFqName;

        @JvmField
        @NotNull
        public static final FqName list;

        @JvmField
        @NotNull
        public static final FqName listIterator;

        @JvmField
        @NotNull
        public static final FqNameUnsafe longRange;

        @JvmField
        @NotNull
        public static final FqName map;

        @JvmField
        @NotNull
        public static final FqName mapEntry;

        @JvmField
        @NotNull
        public static final FqName mustBeDocumented;

        @JvmField
        @NotNull
        public static final FqName mutableCollection;

        @JvmField
        @NotNull
        public static final FqName mutableIterable;

        @JvmField
        @NotNull
        public static final FqName mutableIterator;

        @JvmField
        @NotNull
        public static final FqName mutableList;

        @JvmField
        @NotNull
        public static final FqName mutableListIterator;

        @JvmField
        @NotNull
        public static final FqName mutableMap;

        @JvmField
        @NotNull
        public static final FqName mutableMapEntry;

        @JvmField
        @NotNull
        public static final FqName mutableSet;

        @JvmField
        @NotNull
        public static final FqNameUnsafe nothing;

        @JvmField
        @NotNull
        public static final FqNameUnsafe number;

        @JvmField
        @NotNull
        public static final FqName parameterName;

        @JvmField
        @NotNull
        public static final Set<Name> primitiveArrayTypeShortNames;

        @JvmField
        @NotNull
        public static final Set<Name> primitiveTypeShortNames;

        @JvmField
        @NotNull
        public static final FqName publishedApi;

        @JvmField
        @NotNull
        public static final FqName repeatable;

        @JvmField
        @NotNull
        public static final FqName replaceWith;

        @JvmField
        @NotNull
        public static final FqName retention;

        @JvmField
        @NotNull
        public static final FqName set;

        @JvmField
        @NotNull
        public static final FqNameUnsafe string;

        @JvmField
        @NotNull
        public static final FqName suppress;

        @JvmField
        @NotNull
        public static final FqName target;

        @JvmField
        @NotNull
        public static final FqName throwable;

        @JvmField
        @NotNull
        public static final ClassId uByte;

        @JvmField
        @NotNull
        public static final FqName uByteArrayFqName;

        @JvmField
        @NotNull
        public static final FqName uByteFqName;

        @JvmField
        @NotNull
        public static final ClassId uInt;

        @JvmField
        @NotNull
        public static final FqName uIntArrayFqName;

        @JvmField
        @NotNull
        public static final FqName uIntFqName;

        @JvmField
        @NotNull
        public static final ClassId uLong;

        @JvmField
        @NotNull
        public static final FqName uLongArrayFqName;

        @JvmField
        @NotNull
        public static final FqName uLongFqName;

        @JvmField
        @NotNull
        public static final ClassId uShort;

        @JvmField
        @NotNull
        public static final FqName uShortArrayFqName;

        @JvmField
        @NotNull
        public static final FqName uShortFqName;

        @JvmField
        @NotNull
        public static final FqNameUnsafe unit;

        @JvmField
        @NotNull
        public static final FqName unsafeVariance;

        static {
            FqNames fqNames = new FqNames();
            INSTANCE = fqNames;
            any = fqNames.d("Any");
            nothing = fqNames.d("Nothing");
            cloneable = fqNames.d("Cloneable");
            suppress = fqNames.c("Suppress");
            unit = fqNames.d("Unit");
            charSequence = fqNames.d("CharSequence");
            string = fqNames.d("String");
            array = fqNames.d("Array");
            _boolean = fqNames.d("Boolean");
            _char = fqNames.d("Char");
            _byte = fqNames.d("Byte");
            _short = fqNames.d("Short");
            _int = fqNames.d("Int");
            _long = fqNames.d("Long");
            _float = fqNames.d("Float");
            _double = fqNames.d("Double");
            number = fqNames.d(StatEvent.Key.NUMBER);
            _enum = fqNames.d("Enum");
            functionSupertype = fqNames.d("Function");
            throwable = fqNames.c("Throwable");
            comparable = fqNames.c("Comparable");
            intRange = fqNames.e("IntRange");
            longRange = fqNames.e("LongRange");
            deprecated = fqNames.c("Deprecated");
            deprecatedSinceKotlin = fqNames.c("DeprecatedSinceKotlin");
            deprecationLevel = fqNames.c("DeprecationLevel");
            replaceWith = fqNames.c("ReplaceWith");
            extensionFunctionType = fqNames.c("ExtensionFunctionType");
            parameterName = fqNames.c("ParameterName");
            annotation = fqNames.c("Annotation");
            target = fqNames.a(AVTransport.TARGET);
            annotationTarget = fqNames.a("AnnotationTarget");
            annotationRetention = fqNames.a("AnnotationRetention");
            retention = fqNames.a("Retention");
            repeatable = fqNames.a("Repeatable");
            mustBeDocumented = fqNames.a("MustBeDocumented");
            unsafeVariance = fqNames.c("UnsafeVariance");
            publishedApi = fqNames.c("PublishedApi");
            iterator = fqNames.b("Iterator");
            iterable = fqNames.b("Iterable");
            collection = fqNames.b("Collection");
            list = fqNames.b("List");
            listIterator = fqNames.b("ListIterator");
            set = fqNames.b("Set");
            FqName fqNameB = fqNames.b(AIApiConstants.Map.NAME);
            map = fqNameB;
            mapEntry = fqNameB.child(Name.identifier("Entry"));
            mutableIterator = fqNames.b("MutableIterator");
            mutableIterable = fqNames.b("MutableIterable");
            mutableCollection = fqNames.b("MutableCollection");
            mutableList = fqNames.b("MutableList");
            mutableListIterator = fqNames.b("MutableListIterator");
            mutableSet = fqNames.b("MutableSet");
            FqName fqNameB2 = fqNames.b("MutableMap");
            mutableMap = fqNameB2;
            mutableMapEntry = fqNameB2.child(Name.identifier("MutableEntry"));
            kClass = reflect("KClass");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect("KProperty1");
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeReflect = reflect("KProperty");
            kPropertyFqName = fqNameUnsafeReflect;
            kMutablePropertyFqName = reflect("KMutableProperty");
            kProperty = ClassId.topLevel(fqNameUnsafeReflect.toSafe());
            kDeclarationContainer = reflect("KDeclarationContainer");
            FqName fqNameC = fqNames.c("UByte");
            uByteFqName = fqNameC;
            FqName fqNameC2 = fqNames.c("UShort");
            uShortFqName = fqNameC2;
            FqName fqNameC3 = fqNames.c("UInt");
            uIntFqName = fqNameC3;
            FqName fqNameC4 = fqNames.c("ULong");
            uLongFqName = fqNameC4;
            uByte = ClassId.topLevel(fqNameC);
            uShort = ClassId.topLevel(fqNameC2);
            uInt = ClassId.topLevel(fqNameC3);
            uLong = ClassId.topLevel(fqNameC4);
            uByteArrayFqName = fqNames.c("UByteArray");
            uShortArrayFqName = fqNames.c("UShortArray");
            uIntArrayFqName = fqNames.c("UIntArray");
            uLongArrayFqName = fqNames.c("ULongArray");
            HashSet hashSetNewHashSetWithExpectedSize = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            int i = 0;
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize.add(primitiveType.getTypeName());
            }
            primitiveTypeShortNames = hashSetNewHashSetWithExpectedSize;
            HashSet hashSetNewHashSetWithExpectedSize2 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize2.add(primitiveType2.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = hashSetNewHashSetWithExpectedSize2;
            HashMap mapNewHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            PrimitiveType[] primitiveTypeArrValues = PrimitiveType.values();
            int length = primitiveTypeArrValues.length;
            int i2 = 0;
            while (i2 < length) {
                PrimitiveType primitiveType3 = primitiveTypeArrValues[i2];
                i2++;
                mapNewHashMapWithExpectedSize.put(INSTANCE.d(primitiveType3.getTypeName().asString()), primitiveType3);
            }
            fqNameToPrimitiveType = mapNewHashMapWithExpectedSize;
            HashMap mapNewHashMapWithExpectedSize2 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            PrimitiveType[] primitiveTypeArrValues2 = PrimitiveType.values();
            int length2 = primitiveTypeArrValues2.length;
            while (i < length2) {
                PrimitiveType primitiveType4 = primitiveTypeArrValues2[i];
                i++;
                mapNewHashMapWithExpectedSize2.put(INSTANCE.d(primitiveType4.getArrayTypeName().asString()), primitiveType4);
            }
            arrayClassFqNameToPrimitiveType = mapNewHashMapWithExpectedSize2;
        }

        private FqNames() {
        }

        private final FqName a(String str) {
            return StandardNames.ANNOTATION_PACKAGE_FQ_NAME.child(Name.identifier(str));
        }

        private final FqName b(String str) {
            return StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.child(Name.identifier(str));
        }

        private final FqName c(String str) {
            return StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(str));
        }

        private final FqNameUnsafe d(String str) {
            return c(str).toUnsafe();
        }

        private final FqNameUnsafe e(String str) {
            return StandardNames.RANGES_PACKAGE_FQ_NAME.child(Name.identifier(str)).toUnsafe();
        }

        @JvmStatic
        @NotNull
        public static final FqNameUnsafe reflect(@NotNull String str) {
            return StandardNames.KOTLIN_REFLECT_FQ_NAME.child(Name.identifier(str)).toUnsafe();
        }
    }

    static {
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME_RELEASE = fqName;
        FqName fqNameChild = fqName.child(Name.identifier("experimental"));
        COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL = fqNameChild;
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME_EXPERIMENTAL = fqNameChild.child(Name.identifier("intrinsics"));
        CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL = fqNameChild.child(Name.identifier("Continuation"));
        CONTINUATION_INTERFACE_FQ_NAME_RELEASE = fqName.child(Name.identifier("Continuation"));
        RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = fqName2;
        PREFIXES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"KProperty", "KMutableProperty", "KFunction", "KSuspendFunction"});
        Name nameIdentifier = Name.identifier("kotlin");
        BUILT_INS_PACKAGE_NAME = nameIdentifier;
        FqName fqName3 = FqName.topLevel(nameIdentifier);
        BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        FqName fqNameChild2 = fqName3.child(Name.identifier("annotation"));
        ANNOTATION_PACKAGE_FQ_NAME = fqNameChild2;
        FqName fqNameChild3 = fqName3.child(Name.identifier("collections"));
        COLLECTIONS_PACKAGE_FQ_NAME = fqNameChild3;
        FqName fqNameChild4 = fqName3.child(Name.identifier("ranges"));
        RANGES_PACKAGE_FQ_NAME = fqNameChild4;
        TEXT_PACKAGE_FQ_NAME = fqName3.child(Name.identifier("text"));
        BUILT_INS_PACKAGE_FQ_NAMES = y.setOf((Object[]) new FqName[]{fqName3, fqNameChild3, fqNameChild4, fqNameChild2, fqName2, fqName3.child(Name.identifier("internal")), fqName});
    }

    private StandardNames() {
    }

    @JvmStatic
    @NotNull
    public static final ClassId getFunctionClassId(int i) {
        return new ClassId(BUILT_INS_PACKAGE_FQ_NAME, Name.identifier(getFunctionName(i)));
    }

    @JvmStatic
    @NotNull
    public static final String getFunctionName(int i) {
        return Intrinsics.stringPlus("Function", Integer.valueOf(i));
    }

    @JvmStatic
    @NotNull
    public static final FqName getPrimitiveFqName(@NotNull PrimitiveType primitiveType) {
        return BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
    }

    @JvmStatic
    @NotNull
    public static final String getSuspendFunctionName(int i) {
        return Intrinsics.stringPlus(FunctionClassKind.SuspendFunction.getClassNamePrefix(), Integer.valueOf(i));
    }

    @JvmStatic
    public static final boolean isPrimitiveArray(@NotNull FqNameUnsafe fqNameUnsafe) {
        return FqNames.arrayClassFqNameToPrimitiveType.get(fqNameUnsafe) != null;
    }
}
