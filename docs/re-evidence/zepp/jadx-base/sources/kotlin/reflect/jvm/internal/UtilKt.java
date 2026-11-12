package kotlin.reflect.jvm.internal;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.notification.TransportUri;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedArrayValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a(\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002\u001a.\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0000\u001a\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u0012H\u0000\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0014*\u00020\u0016H\u0002\u001a\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u0004\u0018\u00010\u0019H\u0000\u001a\u0014\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f*\u0004\u0018\u00010\u0019H\u0000\u001a\u0014\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010!*\u0004\u0018\u00010\u0019H\u0000\u001a\u0012\u0010%\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020#H\u0000\u001ap\u00106\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010'*\u00020&\"\b\b\u0001\u0010)*\u00020(2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010+\u001a\u00028\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u001d\u00105\u001a\u0019\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000102¢\u0006\u0002\b4H\u0000¢\u0006\u0004\b6\u00107\u001a'\u0010;\u001a\u00028\u0000\"\u0004\b\u0000\u001082\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0080\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\"\u001c\u0010A\u001a\u00020=8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010>\u001a\u0004\b?\u0010@\"\u001a\u0010D\u001a\u00020C*\u00020B8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\"\u001c\u0010I\u001a\u0004\u0018\u00010F*\u00020(8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006J"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Ljava/lang/Class;", "toJavaClass", "Ljava/lang/ClassLoader;", "classLoader", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "kotlinClassId", "", "arrayDimensions", "c", "", "packageName", "className", "b", "createArrayType", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "Lkotlin/reflect/KVisibility;", "toKVisibility", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "", "", "computeAnnotations", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "e", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "", "f", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;", "a", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "asKFunctionImpl", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "asKPropertyImpl", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "asKCallableImpl", "Ljava/lang/reflect/Type;", "type", "defaultPrimitiveValue", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", LogUtil.D, "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lkotlin/reflect/KType;", "", "isInlineClassType", "(Lkotlin/reflect/KType;)Z", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {1, 5, 1})
public final class UtilKt {

    @NotNull
    private static final FqName a = new FqName("kotlin.jvm.JvmStatic");

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            iArr[PrimitiveType.CHAR.ordinal()] = 2;
            iArr[PrimitiveType.BYTE.ordinal()] = 3;
            iArr[PrimitiveType.SHORT.ordinal()] = 4;
            iArr[PrimitiveType.INT.ordinal()] = 5;
            iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            iArr[PrimitiveType.LONG.ordinal()] = 7;
            iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v3, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v5, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [double[]] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v7, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v8, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [long[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Object a(ArrayValue arrayValue, ClassLoader classLoader) {
        KotlinType type;
        short[] sArr;
        Class clsD;
        DeserializedArrayValue deserializedArrayValue = (DeserializedArrayValue) (!(arrayValue instanceof DeserializedArrayValue) ? null : arrayValue);
        if (deserializedArrayValue == null || (type = deserializedArrayValue.getType()) == null) {
            return null;
        }
        List<? extends ConstantValue<?>> value = arrayValue.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10));
        Iterator<T> it2 = value.iterator();
        while (it2.hasNext()) {
            arrayList.add(f((ConstantValue) it2.next(), classLoader));
        }
        PrimitiveType primitiveArrayElementType = KotlinBuiltIns.getPrimitiveArrayElementType(type);
        int i = 0;
        if (primitiveArrayElementType != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[primitiveArrayElementType.ordinal()]) {
                case 1:
                    int size = arrayValue.getValue().size();
                    sArr = new boolean[size];
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        sArr[i] = ((Boolean) obj).booleanValue();
                        i++;
                    }
                    break;
                case 2:
                    int size2 = arrayValue.getValue().size();
                    sArr = new char[size2];
                    while (i < size2) {
                        Object obj2 = arrayList.get(i);
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Char");
                        sArr[i] = ((Character) obj2).charValue();
                        i++;
                    }
                    break;
                case 3:
                    int size3 = arrayValue.getValue().size();
                    sArr = new byte[size3];
                    while (i < size3) {
                        Object obj3 = arrayList.get(i);
                        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Byte");
                        sArr[i] = ((Byte) obj3).byteValue();
                        i++;
                    }
                    break;
                case 4:
                    int size4 = arrayValue.getValue().size();
                    sArr = new short[size4];
                    while (i < size4) {
                        Object obj4 = arrayList.get(i);
                        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Short");
                        sArr[i] = ((Short) obj4).shortValue();
                        i++;
                    }
                    break;
                case 5:
                    int size5 = arrayValue.getValue().size();
                    sArr = new int[size5];
                    while (i < size5) {
                        Object obj5 = arrayList.get(i);
                        Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                        sArr[i] = ((Integer) obj5).intValue();
                        i++;
                    }
                    break;
                case 6:
                    int size6 = arrayValue.getValue().size();
                    sArr = new float[size6];
                    while (i < size6) {
                        Object obj6 = arrayList.get(i);
                        Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.Float");
                        sArr[i] = ((Float) obj6).floatValue();
                        i++;
                    }
                    break;
                case 7:
                    int size7 = arrayValue.getValue().size();
                    sArr = new long[size7];
                    while (i < size7) {
                        Object obj7 = arrayList.get(i);
                        Objects.requireNonNull(obj7, "null cannot be cast to non-null type kotlin.Long");
                        sArr[i] = ((Long) obj7).longValue();
                        i++;
                    }
                    break;
                case 8:
                    int size8 = arrayValue.getValue().size();
                    sArr = new double[size8];
                    while (i < size8) {
                        Object obj8 = arrayList.get(i);
                        Objects.requireNonNull(obj8, "null cannot be cast to non-null type kotlin.Double");
                        sArr[i] = ((Double) obj8).doubleValue();
                        i++;
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!KotlinBuiltIns.isArray(type)) {
                throw new IllegalStateException(("Not an array type: " + type).toString());
            }
            KotlinType type2 = ((TypeProjection) CollectionsKt.single((List) type.getArguments())).getType();
            ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = type2.getConstructor().mo4298getDeclarationDescriptor();
            if (!(classifierDescriptorMo4298getDeclarationDescriptor instanceof ClassDescriptor)) {
                classifierDescriptorMo4298getDeclarationDescriptor = null;
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo4298getDeclarationDescriptor;
            if (classDescriptor == null) {
                throw new IllegalStateException(("Not a class type: " + type2).toString());
            }
            if (KotlinBuiltIns.isString(type2)) {
                int size9 = arrayValue.getValue().size();
                sArr = new String[size9];
                while (i < size9) {
                    Object obj9 = arrayList.get(i);
                    Objects.requireNonNull(obj9, "null cannot be cast to non-null type kotlin.String");
                    sArr[i] = (String) obj9;
                    i++;
                }
            } else if (KotlinBuiltIns.isKClass(classDescriptor)) {
                int size10 = arrayValue.getValue().size();
                sArr = new Class[size10];
                while (i < size10) {
                    Object obj10 = arrayList.get(i);
                    Objects.requireNonNull(obj10, "null cannot be cast to non-null type java.lang.Class<*>");
                    sArr[i] = (Class) obj10;
                    i++;
                }
            } else {
                ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                if (classId == null || (clsD = d(classLoader, classId, 0, 4, null)) == null) {
                    return null;
                }
                Object objNewInstance = Array.newInstance((Class<?>) clsD, arrayValue.getValue().size());
                Objects.requireNonNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                sArr = (Object[]) objNewInstance;
                int size11 = arrayList.size();
                while (i < size11) {
                    sArr[i] = arrayList.get(i);
                    i++;
                }
            }
        }
        return sArr;
    }

    @Nullable
    public static final KCallableImpl<?> asKCallableImpl(@Nullable Object obj) {
        KCallableImpl<?> kCallableImplAsKFunctionImpl = (KCallableImpl) (!(obj instanceof KCallableImpl) ? null : obj);
        if (kCallableImplAsKFunctionImpl == null) {
            kCallableImplAsKFunctionImpl = asKFunctionImpl(obj);
        }
        return kCallableImplAsKFunctionImpl != null ? kCallableImplAsKFunctionImpl : asKPropertyImpl(obj);
    }

    @Nullable
    public static final KFunctionImpl asKFunctionImpl(@Nullable Object obj) {
        KFunctionImpl kFunctionImpl = (KFunctionImpl) (!(obj instanceof KFunctionImpl) ? null : obj);
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        if (!(obj instanceof FunctionReference)) {
            obj = null;
        }
        FunctionReference functionReference = (FunctionReference) obj;
        KCallable kCallableCompute = functionReference != null ? functionReference.compute() : null;
        return (KFunctionImpl) (kCallableCompute instanceof KFunctionImpl ? kCallableCompute : null);
    }

    @Nullable
    public static final KPropertyImpl<?> asKPropertyImpl(@Nullable Object obj) {
        KPropertyImpl<?> kPropertyImpl = (KPropertyImpl) (!(obj instanceof KPropertyImpl) ? null : obj);
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        if (!(obj instanceof PropertyReference)) {
            obj = null;
        }
        PropertyReference propertyReference = (PropertyReference) obj;
        KCallable kCallableCompute = propertyReference != null ? propertyReference.compute() : null;
        return (KPropertyImpl) (kCallableCompute instanceof KPropertyImpl ? kCallableCompute : null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Class<?> b(ClassLoader classLoader, String str, String str2, int i) {
        if (Intrinsics.areEqual(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        String str3 = str + '.' + m.replace$default(str2, '.', '$', false, 4, (Object) null);
        if (i > 0) {
            str3 = m.repeat("[", i) + 'L' + str3 + ';';
        }
        return ReflectJavaClassFinderKt.tryLoadClass(classLoader, str3);
    }

    private static final Class<?> c(ClassLoader classLoader, ClassId classId, int i) {
        ClassId classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(classId.asSingleFqName().toUnsafe());
        if (classIdMapKotlinToJava != null) {
            classId = classIdMapKotlinToJava;
        }
        return b(classLoader, classId.getPackageFqName().asString(), classId.getRelativeClassName().asString(), i);
    }

    @NotNull
    public static final List<Annotation> computeAnnotations(@NotNull Annotated annotated) {
        Annotations annotations = annotated.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            SourceElement source = annotationDescriptor.getSource();
            Annotation annotationE = null;
            if (source instanceof ReflectAnnotationSource) {
                annotationE = ((ReflectAnnotationSource) source).getAnnotation();
            } else if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
                if (!(javaElement instanceof ReflectJavaAnnotation)) {
                    javaElement = null;
                }
                ReflectJavaAnnotation reflectJavaAnnotation = (ReflectJavaAnnotation) javaElement;
                if (reflectJavaAnnotation != null) {
                    annotationE = reflectJavaAnnotation.getAnnotation();
                }
            } else {
                annotationE = e(annotationDescriptor);
            }
            if (annotationE != null) {
                arrayList.add(annotationE);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Class<?> createArrayType(@NotNull Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    public static /* synthetic */ Class d(ClassLoader classLoader, ClassId classId, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return c(classLoader, classId, i);
    }

    @Nullable
    public static final Object defaultPrimitiveValue(@NotNull Type type) {
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (Intrinsics.areEqual(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (Intrinsics.areEqual(type, Character.TYPE)) {
            return Character.valueOf((char) 0);
        }
        if (Intrinsics.areEqual(type, Byte.TYPE)) {
            return Byte.valueOf((byte) 0);
        }
        if (Intrinsics.areEqual(type, Short.TYPE)) {
            return Short.valueOf((short) 0);
        }
        if (Intrinsics.areEqual(type, Integer.TYPE)) {
            return 0;
        }
        if (Intrinsics.areEqual(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (Intrinsics.areEqual(type, Long.TYPE)) {
            return 0L;
        }
        if (Intrinsics.areEqual(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (Intrinsics.areEqual(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    @Nullable
    public static final <M extends MessageLite, D extends CallableDescriptor> D deserializeToDescriptor(@NotNull Class<?> cls, @NotNull M m, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull BinaryVersion binaryVersion, @NotNull Function2<? super MemberDeserializer, ? super M, ? extends D> function2) {
        List<ProtoBuf.TypeParameter> typeParameterList;
        RuntimeModuleData orCreateModule = ModuleByClassLoaderKt.getOrCreateModule(cls);
        if (m instanceof ProtoBuf.Function) {
            typeParameterList = ((ProtoBuf.Function) m).getTypeParameterList();
        } else {
            if (!(m instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unsupported message: " + m).toString());
            }
            typeParameterList = ((ProtoBuf.Property) m).getTypeParameterList();
        }
        return function2.invoke(new MemberDeserializer(new DeserializationContext(orCreateModule.getDeserialization(), nameResolver, orCreateModule.getModule(), typeTable, VersionRequirementTable.Companion.getEMPTY(), binaryVersion, null, null, typeParameterList)), m);
    }

    private static final Annotation e(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        Class<?> javaClass = annotationClass != null ? toJavaClass(annotationClass) : null;
        if (!(javaClass instanceof Class)) {
            javaClass = null;
        }
        if (javaClass == null) {
            return null;
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = annotationDescriptor.getAllValueArguments().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Name name = (Name) entry.getKey();
            Object objF = f((ConstantValue) entry.getValue(), javaClass.getClassLoader());
            Pair pair = objF != null ? TuplesKt.to(name.asString(), objF) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (Annotation) AnnotationConstructorCallerKt.createAnnotationInstance$default(javaClass, r.toMap(arrayList), null, 4, null);
    }

    private static final Object f(ConstantValue<?> constantValue, ClassLoader classLoader) {
        if (constantValue instanceof AnnotationValue) {
            return e(((AnnotationValue) constantValue).getValue());
        }
        if (constantValue instanceof ArrayValue) {
            return a((ArrayValue) constantValue, classLoader);
        }
        if (constantValue instanceof EnumValue) {
            Pair<? extends ClassId, ? extends Name> value = ((EnumValue) constantValue).getValue();
            ClassId classIdComponent1 = value.component1();
            Name nameComponent2 = value.component2();
            Class clsD = d(classLoader, classIdComponent1, 0, 4, null);
            if (clsD != null) {
                return a.a(clsD, nameComponent2.asString());
            }
            return null;
        }
        if (!(constantValue instanceof KClassValue)) {
            if ((constantValue instanceof ErrorValue) || (constantValue instanceof NullValue)) {
                return null;
            }
            return constantValue.getValue();
        }
        KClassValue.Value value2 = ((KClassValue) constantValue).getValue();
        if (value2 instanceof KClassValue.Value.NormalClass) {
            KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value2;
            return c(classLoader, normalClass.getClassId(), normalClass.getArrayDimensions());
        }
        if (!(value2 instanceof KClassValue.Value.LocalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = ((KClassValue.Value.LocalClass) value2).getType().getConstructor().mo4298getDeclarationDescriptor();
        if (!(classifierDescriptorMo4298getDeclarationDescriptor instanceof ClassDescriptor)) {
            classifierDescriptorMo4298getDeclarationDescriptor = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo4298getDeclarationDescriptor;
        if (classDescriptor != null) {
            return toJavaClass(classDescriptor);
        }
        return null;
    }

    @Nullable
    public static final ReceiverParameterDescriptor getInstanceReceiverParameter(@NotNull CallableDescriptor callableDescriptor) {
        if (callableDescriptor.getDispatchReceiverParameter() == null) {
            return null;
        }
        DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        Objects.requireNonNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((ClassDescriptor) containingDeclaration).getThisAsReceiverParameter();
    }

    @NotNull
    public static final FqName getJVM_STATIC() {
        return a;
    }

    public static final boolean isInlineClassType(@NotNull KType kType) {
        KotlinType type;
        if (!(kType instanceof KTypeImpl)) {
            kType = null;
        }
        KTypeImpl kTypeImpl = (KTypeImpl) kType;
        return (kTypeImpl == null || (type = kTypeImpl.getType()) == null || !InlineClassesUtilsKt.isInlineClassType(type)) ? false : true;
    }

    @Nullable
    public static final Class<?> toJavaClass(@NotNull ClassDescriptor classDescriptor) {
        SourceElement source = classDescriptor.getSource();
        if (source instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass binaryClass = ((KotlinJvmBinarySourceElement) source).getBinaryClass();
            Objects.requireNonNull(binaryClass, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((ReflectKotlinClass) binaryClass).getKlass();
        }
        if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
            Objects.requireNonNull(javaElement, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass) javaElement).getElement();
        }
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        if (classId != null) {
            return c(ReflectClassUtilKt.getSafeClassLoader(classDescriptor.getClass()), classId, 0);
        }
        return null;
    }

    @Nullable
    public static final KVisibility toKVisibility(@NotNull DescriptorVisibility descriptorVisibility) {
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PUBLIC)) {
            return KVisibility.PUBLIC;
        }
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PROTECTED)) {
            return KVisibility.PROTECTED;
        }
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.INTERNAL)) {
            return KVisibility.INTERNAL;
        }
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PRIVATE) || Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PRIVATE_TO_THIS)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }
}
