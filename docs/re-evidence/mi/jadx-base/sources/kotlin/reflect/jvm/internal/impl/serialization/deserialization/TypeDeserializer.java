package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTypeDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1557#2:301\n1628#2,3:302\n1567#2:305\n1598#2,4:306\n1557#2:311\n1628#2,3:312\n1#3:310\n*S KotlinDebug\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n*L\n76#1:301\n76#1:302,3\n105#1:305\n105#1:306,4\n246#1:311\n246#1:312,3\n*E\n"})
public final class TypeDeserializer {

    @NotNull
    private final DeserializationContext c;

    @NotNull
    private final Function1<Integer, ClassifierDescriptor> classifierDescriptors;

    @NotNull
    private final String containerPresentableName;

    @NotNull
    private final String debugName;

    @Nullable
    private final TypeDeserializer parent;

    @NotNull
    private final Function1<Integer, ClassifierDescriptor> typeAliasDescriptors;

    @NotNull
    private final Map<Integer, TypeParameterDescriptor> typeParameterDescriptors;

    public TypeDeserializer(@NotNull DeserializationContext c, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> typeParameterProtos, @NotNull String debugName, @NotNull String containerPresentableName) {
        Map<Integer, TypeParameterDescriptor> linkedHashMap;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(containerPresentableName, "containerPresentableName");
        this.c = c;
        this.parent = typeDeserializer;
        this.debugName = debugName;
        this.containerPresentableName = containerPresentableName;
        this.classifierDescriptors = c.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$0
            private final TypeDeserializer arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public Object invoke2(Object obj) {
                return TypeDeserializer.classifierDescriptors$lambda$0(this.arg$0, ((Number) obj).intValue());
            }
        });
        this.typeAliasDescriptors = c.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$1
            private final TypeDeserializer arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public Object invoke2(Object obj) {
                return TypeDeserializer.typeAliasDescriptors$lambda$1(this.arg$0, ((Number) obj).intValue());
            }
        });
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = MapsKt__MapsKt.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            for (ProtoBuf.TypeParameter typeParameter : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.c, typeParameter, i));
                i++;
            }
        }
        this.typeParameterDescriptors = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassifierDescriptor classifierDescriptors$lambda$0(TypeDeserializer this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.computeClassifierDescriptor(i);
    }

    private final ClassifierDescriptor computeClassifierDescriptor(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.c.getNameResolver(), i);
        return classId.isLocal() ? this.c.getComponents().deserializeClass(classId) : FindClassInModuleKt.findClassifierAcrossModuleDependencies(this.c.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType computeLocalClassifierReplacementType(int i) {
        if (NameResolverUtilKt.getClassId(this.c.getNameResolver(), i).isLocal()) {
            return this.c.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        return null;
    }

    private final ClassifierDescriptor computeTypeAliasDescriptor(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.c.getNameResolver(), i);
        if (classId.isLocal()) {
            return null;
        }
        return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(this.c.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType createSimpleSuspendFunctionType(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType);
        List listDropLast = CollectionsKt___CollectionsKt.dropLast(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType), 1);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDropLast, 10));
        Iterator it = listDropLast.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, arrayList, null, kotlinType2, true).makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }

    private final SimpleType createSuspendFunctionType(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        SimpleType simpleTypeCreateSuspendFunctionTypeForBasicCase;
        int size;
        int size2 = typeConstructor.getParameters().size() - list.size();
        if (size2 != 0) {
            simpleTypeCreateSuspendFunctionTypeForBasicCase = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                TypeConstructor typeConstructor2 = typeConstructor.getBuiltIns().getSuspendFunction(size).getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor2, "getTypeConstructor(...)");
                simpleTypeCreateSuspendFunctionTypeForBasicCase = KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor2, list, z, (KotlinTypeRefiner) null, 16, (Object) null);
            }
        } else {
            simpleTypeCreateSuspendFunctionTypeForBasicCase = createSuspendFunctionTypeForBasicCase(typeAttributes, typeConstructor, list, z);
        }
        return simpleTypeCreateSuspendFunctionTypeForBasicCase == null ? ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list, typeConstructor, new String[0]) : simpleTypeCreateSuspendFunctionTypeForBasicCase;
    }

    private final SimpleType createSuspendFunctionTypeForBasicCase(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor, list, z, (KotlinTypeRefiner) null, 16, (Object) null);
        if (FunctionTypesKt.isFunctionType(simpleTypeSimpleType$default)) {
            return transformRuntimeFunctionTypeToSuspendFunction(simpleTypeSimpleType$default);
        }
        return null;
    }

    private final TypeParameterDescriptor loadTypeParameter(int i) {
        TypeParameterDescriptor typeParameterDescriptor = this.typeParameterDescriptors.get(Integer.valueOf(i));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.parent;
        if (typeDeserializer != null) {
            return typeDeserializer.loadTypeParameter(i);
        }
        return null;
    }

    private static final List<ProtoBuf.Type.Argument> simpleType$collectAllArguments(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        Intrinsics.checkNotNullExpressionValue(argumentList, "getArgumentList(...)");
        List<ProtoBuf.Type.Argument> list = argumentList;
        ProtoBuf.Type typeOuterType = ProtoTypeTableUtilKt.outerType(type, typeDeserializer.c.getTypeTable());
        List<ProtoBuf.Type.Argument> listSimpleType$collectAllArguments = typeOuterType != null ? simpleType$collectAllArguments(typeOuterType, typeDeserializer) : null;
        if (listSimpleType$collectAllArguments == null) {
            listSimpleType$collectAllArguments = CollectionsKt__CollectionsKt.emptyList();
        }
        return CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) listSimpleType$collectAllArguments);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return typeDeserializer.simpleType(type, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List simpleType$lambda$3(TypeDeserializer this$0, ProtoBuf.Type proto) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(proto, "$proto");
        return this$0.c.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations(proto, this$0.c.getNameResolver());
    }

    private final TypeAttributes toAttributes(List<? extends TypeAttributeTranslator> list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        List<? extends TypeAttributeTranslator> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).toAttributes(annotations, typeConstructor, declarationDescriptor));
        }
        return TypeAttributes.Companion.create(CollectionsKt__IterablesKt.flatten(arrayList));
    }

    private final SimpleType transformRuntimeFunctionTypeToSuspendFunction(KotlinType kotlinType) {
        KotlinType type;
        TypeProjection typeProjection = (TypeProjection) CollectionsKt___CollectionsKt.lastOrNull((List) FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType));
        if (typeProjection == null || (type = typeProjection.getType()) == null) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo2180getDeclarationDescriptor = type.getConstructor().mo2180getDeclarationDescriptor();
        FqName fqNameSafe = classifierDescriptorMo2180getDeclarationDescriptor != null ? DescriptorUtilsKt.getFqNameSafe(classifierDescriptorMo2180getDeclarationDescriptor) : null;
        if (type.getArguments().size() != 1 || (!Intrinsics.areEqual(fqNameSafe, StandardNames.CONTINUATION_INTERFACE_FQ_NAME) && !Intrinsics.areEqual(fqNameSafe, TypeDeserializerKt.EXPERIMENTAL_CONTINUATION_FQ_NAME))) {
            return (SimpleType) kotlinType;
        }
        KotlinType type2 = ((TypeProjection) CollectionsKt___CollectionsKt.single((List) type.getArguments())).getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        DeclarationDescriptor containingDeclaration = this.c.getContainingDeclaration();
        CallableDescriptor callableDescriptor = containingDeclaration instanceof CallableDescriptor ? (CallableDescriptor) containingDeclaration : null;
        return Intrinsics.areEqual(callableDescriptor != null ? DescriptorUtilsKt.fqNameOrNull(callableDescriptor) : null, SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? createSimpleSuspendFunctionType(kotlinType, type2) : createSimpleSuspendFunctionType(kotlinType, type2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassifierDescriptor typeAliasDescriptors$lambda$1(TypeDeserializer this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.computeTypeAliasDescriptor(i);
    }

    private final TypeProjection typeArgument(TypeParameterDescriptor typeParameterDescriptor, ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
            return typeParameterDescriptor == null ? new StarProjectionForAbsentTypeParameter(this.c.getComponents().getModuleDescriptor().getBuiltIns()) : new StarProjectionImpl(typeParameterDescriptor);
        }
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
        Intrinsics.checkNotNullExpressionValue(projection, "getProjection(...)");
        Variance variance = protoEnumFlags.variance(projection);
        ProtoBuf.Type type = ProtoTypeTableUtilKt.type(argument, this.c.getTypeTable());
        return type == null ? new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString())) : new TypeProjectionImpl(variance, type(type));
    }

    private final TypeConstructor typeConstructor(ProtoBuf.Type type) {
        ClassifierDescriptor classifierDescriptorInvoke2;
        Object next;
        if (type.hasClassName()) {
            classifierDescriptorInvoke2 = this.classifierDescriptors.invoke2(Integer.valueOf(type.getClassName()));
            if (classifierDescriptorInvoke2 == null) {
                classifierDescriptorInvoke2 = typeConstructor$notFoundClass(this, type, type.getClassName());
            }
        } else if (type.hasTypeParameter()) {
            classifierDescriptorInvoke2 = loadTypeParameter(type.getTypeParameter());
            if (classifierDescriptorInvoke2 == null) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(type.getTypeParameter()), this.containerPresentableName);
            }
        } else if (type.hasTypeParameterName()) {
            String string = this.c.getNameResolver().getString(type.getTypeParameterName());
            Iterator<T> it = getOwnTypeParameters().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((TypeParameterDescriptor) next).getName().asString(), string));
            classifierDescriptorInvoke2 = (TypeParameterDescriptor) next;
            if (classifierDescriptorInvoke2 == null) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.c.getContainingDeclaration().toString());
            }
        } else {
            if (!type.hasTypeAliasName()) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            classifierDescriptorInvoke2 = this.typeAliasDescriptors.invoke2(Integer.valueOf(type.getTypeAliasName()));
            if (classifierDescriptorInvoke2 == null) {
                classifierDescriptorInvoke2 = typeConstructor$notFoundClass(this, type, type.getTypeAliasName());
            }
        }
        TypeConstructor typeConstructor = classifierDescriptorInvoke2.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return typeConstructor;
    }

    private static final ClassDescriptor typeConstructor$notFoundClass(final TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i) {
        ClassId classId = NameResolverUtilKt.getClassId(typeDeserializer.c.getNameResolver(), i);
        List<Integer> mutableList = SequencesKt___SequencesKt.toMutableList(SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.generateSequence(type, (Function1<? super ProtoBuf.Type, ? extends ProtoBuf.Type>) ((Function1<? super Object, ? extends Object>) new Function1(typeDeserializer) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$3
            private final TypeDeserializer arg$0;

            {
                this.arg$0 = typeDeserializer;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public Object invoke2(Object obj) {
                return TypeDeserializer.typeConstructor$notFoundClass$lambda$8(this.arg$0, (ProtoBuf.Type) obj);
            }
        })), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public Object invoke2(Object obj) {
                return Integer.valueOf(TypeDeserializer.typeConstructor$notFoundClass$lambda$9((ProtoBuf.Type) obj));
            }
        }));
        int iCount = SequencesKt___SequencesKt.count(SequencesKt__SequencesKt.generateSequence(classId, (Function1<? super ClassId, ? extends ClassId>) ((Function1<? super Object, ? extends Object>) new PropertyReference1() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1
            @Override // kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).getOuterClassId();
            }

            @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
            public String getName() {
                return "outerClassId";
            }

            @Override // kotlin.jvm.internal.CallableReference
            public KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(ClassId.class);
            }

            @Override // kotlin.jvm.internal.CallableReference
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        })));
        while (mutableList.size() < iCount) {
            mutableList.add(0);
        }
        return typeDeserializer.c.getComponents().getNotFoundClasses().getClass(classId, mutableList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoBuf.Type typeConstructor$notFoundClass$lambda$8(TypeDeserializer this$0, ProtoBuf.Type it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return ProtoTypeTableUtilKt.outerType(it, this$0.c.getTypeTable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int typeConstructor$notFoundClass$lambda$9(ProtoBuf.Type it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getArgumentCount();
    }

    @NotNull
    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return CollectionsKt___CollectionsKt.toList(this.typeParameterDescriptors.values());
    }

    @NotNull
    public final SimpleType simpleType(@NotNull final ProtoBuf.Type proto, boolean z) {
        SimpleType simpleTypeSimpleType$default;
        SimpleType simpleTypeWithAbbreviation;
        Intrinsics.checkNotNullParameter(proto, "proto");
        SimpleType simpleTypeComputeLocalClassifierReplacementType = proto.hasClassName() ? computeLocalClassifierReplacementType(proto.getClassName()) : proto.hasTypeAliasName() ? computeLocalClassifierReplacementType(proto.getTypeAliasName()) : null;
        if (simpleTypeComputeLocalClassifierReplacementType != null) {
            return simpleTypeComputeLocalClassifierReplacementType;
        }
        TypeConstructor typeConstructor = typeConstructor(proto);
        if (ErrorUtils.isError(typeConstructor.mo2180getDeclarationDescriptor())) {
            return ErrorUtils.INSTANCE.createErrorType(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructor, typeConstructor.toString());
        }
        DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(this.c.getStorageManager(), new Function0(this, proto) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$2
            private final TypeDeserializer arg$0;
            private final ProtoBuf.Type arg$1;

            {
                this.arg$0 = this;
                this.arg$1 = proto;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return TypeDeserializer.simpleType$lambda$3(this.arg$0, this.arg$1);
            }
        });
        TypeAttributes attributes = toAttributes(this.c.getComponents().getTypeAttributeTranslators(), deserializedAnnotations, typeConstructor, this.c.getContainingDeclaration());
        List<ProtoBuf.Type.Argument> listSimpleType$collectAllArguments = simpleType$collectAllArguments(proto, this);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSimpleType$collectAllArguments, 10));
        int i = 0;
        for (Object obj : listSimpleType$collectAllArguments) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            arrayList.add(typeArgument((TypeParameterDescriptor) CollectionsKt___CollectionsKt.getOrNull(parameters, i), (ProtoBuf.Type.Argument) obj));
            i = i2;
        }
        List<? extends TypeProjection> list = CollectionsKt___CollectionsKt.toList(arrayList);
        ClassifierDescriptor classifierDescriptorMo2180getDeclarationDescriptor = typeConstructor.mo2180getDeclarationDescriptor();
        if (z && (classifierDescriptorMo2180getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
            SimpleType simpleTypeComputeExpandedType = KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) classifierDescriptorMo2180getDeclarationDescriptor, list);
            simpleTypeSimpleType$default = simpleTypeComputeExpandedType.makeNullableAsSpecified(KotlinTypeKt.isNullable(simpleTypeComputeExpandedType) || proto.getNullable()).replaceAttributes(toAttributes(this.c.getComponents().getTypeAttributeTranslators(), Annotations.Companion.create(CollectionsKt___CollectionsKt.plus((Iterable) deserializedAnnotations, (Iterable) simpleTypeComputeExpandedType.getAnnotations())), typeConstructor, this.c.getContainingDeclaration()));
        } else if (Flags.SUSPEND_TYPE.get(proto.getFlags()).booleanValue()) {
            simpleTypeSimpleType$default = createSuspendFunctionType(attributes, typeConstructor, list, proto.getNullable());
        } else {
            simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(attributes, typeConstructor, list, proto.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
            if (Flags.DEFINITELY_NOT_NULL_TYPE.get(proto.getFlags()).booleanValue()) {
                DefinitelyNotNullType definitelyNotNullTypeMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleTypeSimpleType$default, true, false, 4, null);
                if (definitelyNotNullTypeMakeDefinitelyNotNull$default == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeSimpleType$default + '\'').toString());
                }
                simpleTypeSimpleType$default = definitelyNotNullTypeMakeDefinitelyNotNull$default;
            }
        }
        ProtoBuf.Type typeAbbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(proto, this.c.getTypeTable());
        return (typeAbbreviatedType == null || (simpleTypeWithAbbreviation = SpecialTypesKt.withAbbreviation(simpleTypeSimpleType$default, simpleType(typeAbbreviatedType, false))) == null) ? simpleTypeSimpleType$default : simpleTypeWithAbbreviation;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.debugName);
        if (this.parent == null) {
            str = "";
        } else {
            str = ". Child of " + this.parent.debugName;
        }
        sb.append(str);
        return sb.toString();
    }

    @NotNull
    public final KotlinType type(@NotNull ProtoBuf.Type proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (!proto.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(proto, true);
        }
        String string = this.c.getNameResolver().getString(proto.getFlexibleTypeCapabilitiesId());
        SimpleType simpleTypeSimpleType$default = simpleType$default(this, proto, false, 2, null);
        ProtoBuf.Type typeFlexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(proto, this.c.getTypeTable());
        Intrinsics.checkNotNull(typeFlexibleUpperBound);
        return this.c.getComponents().getFlexibleTypeDeserializer().create(proto, string, simpleTypeSimpleType$default, simpleType$default(this, typeFlexibleUpperBound, false, 2, null));
    }
}
