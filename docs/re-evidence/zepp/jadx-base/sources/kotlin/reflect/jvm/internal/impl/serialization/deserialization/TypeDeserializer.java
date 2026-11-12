package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
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
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class TypeDeserializer {

    @NotNull
    private final DeserializationContext a;

    @Nullable
    private final TypeDeserializer b;

    @NotNull
    private final String c;

    @NotNull
    private final String d;
    private boolean e;

    @NotNull
    private final Function1<Integer, ClassifierDescriptor> f;

    @NotNull
    private final Function1<Integer, ClassifierDescriptor> g;

    @NotNull
    private final Map<Integer, TypeParameterDescriptor> h;

    public static final class a extends Lambda implements Function1<Integer, ClassifierDescriptor> {
        public a() {
            super(1);
        }

        @Nullable
        public final ClassifierDescriptor a(int i) {
            return TypeDeserializer.this.a(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ ClassifierDescriptor invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public static final class b extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
        public final /* synthetic */ ProtoBuf.Type b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ProtoBuf.Type type) {
            super(0);
            this.b = type;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends AnnotationDescriptor> invoke() {
            return TypeDeserializer.this.a.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations(this.b, TypeDeserializer.this.a.getNameResolver());
        }
    }

    public static final class c extends Lambda implements Function1<Integer, ClassifierDescriptor> {
        public c() {
            super(1);
        }

        @Nullable
        public final ClassifierDescriptor a(int i) {
            return TypeDeserializer.this.c(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ ClassifierDescriptor invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public /* synthetic */ class d extends FunctionReference implements Function1<ClassId, ClassId> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClassId invoke(@NotNull ClassId classId) {
            return classId.getOuterClassId();
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ClassId.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    public static final class e extends Lambda implements Function1<ProtoBuf.Type, ProtoBuf.Type> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProtoBuf.Type invoke(@NotNull ProtoBuf.Type type) {
            return ProtoTypeTableUtilKt.outerType(type, TypeDeserializer.this.a.getTypeTable());
        }
    }

    public static final class f extends Lambda implements Function1<ProtoBuf.Type, Integer> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@NotNull ProtoBuf.Type type) {
            return Integer.valueOf(type.getArgumentCount());
        }
    }

    public TypeDeserializer(@NotNull DeserializationContext deserializationContext, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> list, @NotNull String str, @NotNull String str2, boolean z) {
        Map<Integer, TypeParameterDescriptor> linkedHashMap;
        this.a = deserializationContext;
        this.b = typeDeserializer;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = deserializationContext.getStorageManager().createMemoizedFunctionWithNullableValues(new a());
        this.g = deserializationContext.getStorageManager().createMemoizedFunctionWithNullableValues(new c());
        if (list.isEmpty()) {
            linkedHashMap = r.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            for (ProtoBuf.TypeParameter typeParameter : list) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.a, typeParameter, i));
                i++;
            }
        }
        this.h = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassifierDescriptor a(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.a.getNameResolver(), i);
        return classId.isLocal() ? this.a.getComponents().deserializeClass(classId) : FindClassInModuleKt.findClassifierAcrossModuleDependencies(this.a.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType b(int i) {
        if (NameResolverUtilKt.getClassId(this.a.getNameResolver(), i).isLocal()) {
            return this.a.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassifierDescriptor c(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.a.getNameResolver(), i);
        if (classId.isLocal()) {
            return null;
        }
        return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(this.a.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType d(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List listDropLast = CollectionsKt___CollectionsKt.dropLast(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType), 1);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDropLast, 10));
        Iterator it2 = listDropLast.iterator();
        while (it2.hasNext()) {
            arrayList.add(((TypeProjection) it2.next()).getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, arrayList, null, kotlinType2, true).makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }

    private final SimpleType e(Annotations annotations, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        int size;
        int size2 = typeConstructor.getParameters().size() - list.size();
        SimpleType simpleTypeF = null;
        if (size2 == 0) {
            simpleTypeF = f(annotations, typeConstructor, list, z);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            simpleTypeF = KotlinTypeFactory.simpleType$default(annotations, typeConstructor.getBuiltIns().getSuspendFunction(size).getTypeConstructor(), list, z, null, 16, null);
        }
        return simpleTypeF == null ? ErrorUtils.createErrorTypeWithArguments(Intrinsics.stringPlus("Bad suspend function in metadata with constructor: ", typeConstructor), list) : simpleTypeF;
    }

    private final SimpleType f(Annotations annotations, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(annotations, typeConstructor, list, z, null, 16, null);
        if (FunctionTypesKt.isFunctionType(simpleTypeSimpleType$default)) {
            return i(simpleTypeSimpleType$default);
        }
        return null;
    }

    private final TypeParameterDescriptor g(int i) {
        TypeParameterDescriptor typeParameterDescriptor = this.h.get(Integer.valueOf(i));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.b;
        if (typeDeserializer == null) {
            return null;
        }
        return typeDeserializer.g(i);
    }

    private static final List<ProtoBuf.Type.Argument> h(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        ProtoBuf.Type typeOuterType = ProtoTypeTableUtilKt.outerType(type, typeDeserializer.a.getTypeTable());
        List<ProtoBuf.Type.Argument> listH = typeOuterType == null ? null : h(typeOuterType, typeDeserializer);
        if (listH == null) {
            listH = CollectionsKt__CollectionsKt.emptyList();
        }
        return CollectionsKt___CollectionsKt.plus((Collection) argumentList, (Iterable) listH);
    }

    private final SimpleType i(KotlinType kotlinType) {
        boolean releaseCoroutines = this.a.getComponents().getConfiguration().getReleaseCoroutines();
        TypeProjection typeProjection = (TypeProjection) CollectionsKt.lastOrNull((List) FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType));
        KotlinType type = typeProjection == null ? null : typeProjection.getType();
        if (type == null) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = type.getConstructor().mo4298getDeclarationDescriptor();
        FqName fqNameSafe = classifierDescriptorMo4298getDeclarationDescriptor == null ? null : DescriptorUtilsKt.getFqNameSafe(classifierDescriptorMo4298getDeclarationDescriptor);
        boolean z = true;
        if (type.getArguments().size() != 1 || (!SuspendFunctionTypesKt.isContinuation(fqNameSafe, true) && !SuspendFunctionTypesKt.isContinuation(fqNameSafe, false))) {
            return (SimpleType) kotlinType;
        }
        KotlinType type2 = ((TypeProjection) CollectionsKt.single((List) type.getArguments())).getType();
        DeclarationDescriptor containingDeclaration = this.a.getContainingDeclaration();
        if (!(containingDeclaration instanceof CallableDescriptor)) {
            containingDeclaration = null;
        }
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        if (Intrinsics.areEqual(callableDescriptor != null ? DescriptorUtilsKt.fqNameOrNull(callableDescriptor) : null, SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
            return d(kotlinType, type2);
        }
        if (!this.e && (!releaseCoroutines || !SuspendFunctionTypesKt.isContinuation(fqNameSafe, !releaseCoroutines))) {
            z = false;
        }
        this.e = z;
        return d(kotlinType, type2);
    }

    private final TypeProjection j(TypeParameterDescriptor typeParameterDescriptor, ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
            return typeParameterDescriptor == null ? new StarProjectionForAbsentTypeParameter(this.a.getComponents().getModuleDescriptor().getBuiltIns()) : new StarProjectionImpl(typeParameterDescriptor);
        }
        Variance variance = ProtoEnumFlags.INSTANCE.variance(argument.getProjection());
        ProtoBuf.Type type = ProtoTypeTableUtilKt.type(argument, this.a.getTypeTable());
        return type == null ? new TypeProjectionImpl(ErrorUtils.createErrorType("No type recorded")) : new TypeProjectionImpl(variance, type(type));
    }

    private final TypeConstructor k(ProtoBuf.Type type) {
        ClassifierDescriptor classifierDescriptorInvoke;
        Object next;
        if (type.hasClassName()) {
            classifierDescriptorInvoke = this.f.invoke(Integer.valueOf(type.getClassName()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = l(this, type, type.getClassName());
            }
        } else if (type.hasTypeParameter()) {
            classifierDescriptorInvoke = g(type.getTypeParameter());
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.createErrorTypeConstructor("Unknown type parameter " + type.getTypeParameter() + ". Please try recompiling module containing \"" + this.d + '\"');
            }
        } else if (type.hasTypeParameterName()) {
            String string = this.a.getNameResolver().getString(type.getTypeParameterName());
            Iterator<T> it2 = getOwnTypeParameters().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((TypeParameterDescriptor) next).getName().asString(), string));
            classifierDescriptorInvoke = (TypeParameterDescriptor) next;
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.createErrorTypeConstructor("Deserialized type parameter " + string + " in " + this.a.getContainingDeclaration());
            }
        } else {
            if (!type.hasTypeAliasName()) {
                return ErrorUtils.createErrorTypeConstructor("Unknown type");
            }
            classifierDescriptorInvoke = this.g.invoke(Integer.valueOf(type.getTypeAliasName()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = l(this, type, type.getTypeAliasName());
            }
        }
        return classifierDescriptorInvoke.getTypeConstructor();
    }

    private static final ClassDescriptor l(TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i) {
        ClassId classId = NameResolverUtilKt.getClassId(typeDeserializer.a.getNameResolver(), i);
        List<Integer> mutableList = SequencesKt___SequencesKt.toMutableList(SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.generateSequence(type, typeDeserializer.new e()), f.a));
        int iCount = SequencesKt___SequencesKt.count(SequencesKt__SequencesKt.generateSequence(classId, d.a));
        while (mutableList.size() < iCount) {
            mutableList.add(0);
        }
        return typeDeserializer.a.getComponents().getNotFoundClasses().getClass(classId, mutableList);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return typeDeserializer.simpleType(type, z);
    }

    public final boolean getExperimentalSuspendFunctionTypeEncountered() {
        return this.e;
    }

    @NotNull
    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return CollectionsKt___CollectionsKt.toList(this.h.values());
    }

    @NotNull
    public final SimpleType simpleType(@NotNull ProtoBuf.Type type, boolean z) {
        SimpleType simpleTypeSimpleType$default;
        SimpleType simpleTypeWithAbbreviation;
        SimpleType simpleTypeB = type.hasClassName() ? b(type.getClassName()) : type.hasTypeAliasName() ? b(type.getTypeAliasName()) : null;
        if (simpleTypeB != null) {
            return simpleTypeB;
        }
        TypeConstructor typeConstructorK = k(type);
        if (ErrorUtils.isError(typeConstructorK.mo4298getDeclarationDescriptor())) {
            return ErrorUtils.createErrorTypeWithCustomConstructor(typeConstructorK.toString(), typeConstructorK);
        }
        DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(this.a.getStorageManager(), new b(type));
        List<ProtoBuf.Type.Argument> listH = h(type, this);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listH, 10));
        int i = 0;
        for (Object obj : listH) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(j((TypeParameterDescriptor) CollectionsKt.getOrNull(typeConstructorK.getParameters(), i), (ProtoBuf.Type.Argument) obj));
            i = i2;
        }
        List<? extends TypeProjection> list = CollectionsKt___CollectionsKt.toList(arrayList);
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = typeConstructorK.mo4298getDeclarationDescriptor();
        if (z && (classifierDescriptorMo4298getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
            SimpleType simpleTypeComputeExpandedType = KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) classifierDescriptorMo4298getDeclarationDescriptor, list);
            simpleTypeSimpleType$default = simpleTypeComputeExpandedType.makeNullableAsSpecified(KotlinTypeKt.isNullable(simpleTypeComputeExpandedType) || type.getNullable()).replaceAnnotations(Annotations.Companion.create(CollectionsKt___CollectionsKt.plus((Iterable) deserializedAnnotations, (Iterable) simpleTypeComputeExpandedType.getAnnotations())));
        } else if (Flags.SUSPEND_TYPE.get(type.getFlags()).booleanValue()) {
            simpleTypeSimpleType$default = e(deserializedAnnotations, typeConstructorK, list, type.getNullable());
        } else {
            simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(deserializedAnnotations, typeConstructorK, list, type.getNullable(), null, 16, null);
            if (Flags.DEFINITELY_NOT_NULL_TYPE.get(type.getFlags()).booleanValue()) {
                DefinitelyNotNullType definitelyNotNullTypeMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleTypeSimpleType$default, false, 2, null);
                if (definitelyNotNullTypeMakeDefinitelyNotNull$default == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeSimpleType$default + '\'').toString());
                }
                simpleTypeSimpleType$default = definitelyNotNullTypeMakeDefinitelyNotNull$default;
            }
        }
        ProtoBuf.Type typeAbbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(type, this.a.getTypeTable());
        if (typeAbbreviatedType != null && (simpleTypeWithAbbreviation = SpecialTypesKt.withAbbreviation(simpleTypeSimpleType$default, simpleType(typeAbbreviatedType, false))) != null) {
            simpleTypeSimpleType$default = simpleTypeWithAbbreviation;
        }
        return type.hasClassName() ? this.a.getComponents().getPlatformDependentTypeTransformer().transformPlatformType(NameResolverUtilKt.getClassId(this.a.getNameResolver(), type.getClassName()), simpleTypeSimpleType$default) : simpleTypeSimpleType$default;
    }

    @NotNull
    public String toString() {
        String str = this.c;
        TypeDeserializer typeDeserializer = this.b;
        return Intrinsics.stringPlus(str, typeDeserializer == null ? "" : Intrinsics.stringPlus(". Child of ", typeDeserializer.c));
    }

    @NotNull
    public final KotlinType type(@NotNull ProtoBuf.Type type) {
        if (!type.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(type, true);
        }
        return this.a.getComponents().getFlexibleTypeDeserializer().create(type, this.a.getNameResolver().getString(type.getFlexibleTypeCapabilitiesId()), simpleType$default(this, type, false, 2, null), simpleType$default(this, ProtoTypeTableUtilKt.flexibleUpperBound(type, this.a.getTypeTable()), false, 2, null));
    }

    public /* synthetic */ TypeDeserializer(DeserializationContext deserializationContext, TypeDeserializer typeDeserializer, List list, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deserializationContext, typeDeserializer, list, str, str2, (i & 32) != 0 ? false : z);
    }
}
