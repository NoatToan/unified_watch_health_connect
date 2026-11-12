package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class MemberDeserializer {

    @NotNull
    private final DeserializationContext a;

    @NotNull
    private final AnnotationDeserializer b;

    public static final class b extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
        public final /* synthetic */ MessageLite b;
        public final /* synthetic */ AnnotatedCallableKind c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
            super(0);
            this.b = messageLite;
            this.c = annotatedCallableKind;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends AnnotationDescriptor> getA() {
            List<? extends AnnotationDescriptor> list;
            MemberDeserializer memberDeserializer = MemberDeserializer.this;
            ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.a.getContainingDeclaration());
            if (protoContainerA == null) {
                list = null;
            } else {
                list = CollectionsKt___CollectionsKt.toList(MemberDeserializer.this.a.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(protoContainerA, this.b, this.c));
            }
            return list != null ? list : CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public static final class c extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ ProtoBuf.Property c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, ProtoBuf.Property property) {
            super(0);
            this.b = z;
            this.c = property;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends AnnotationDescriptor> getA() {
            List<? extends AnnotationDescriptor> list;
            MemberDeserializer memberDeserializer = MemberDeserializer.this;
            ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.a.getContainingDeclaration());
            if (protoContainerA == null) {
                list = null;
            } else {
                boolean z = this.b;
                MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                ProtoBuf.Property property = this.c;
                list = z ? CollectionsKt___CollectionsKt.toList(memberDeserializer2.a.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(protoContainerA, property)) : CollectionsKt___CollectionsKt.toList(memberDeserializer2.a.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(protoContainerA, property));
            }
            return list != null ? list : CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public static final class d extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
        public final /* synthetic */ MessageLite b;
        public final /* synthetic */ AnnotatedCallableKind c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
            super(0);
            this.b = messageLite;
            this.c = annotatedCallableKind;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends AnnotationDescriptor> getA() {
            List<AnnotationDescriptor> listLoadExtensionReceiverParameterAnnotations;
            MemberDeserializer memberDeserializer = MemberDeserializer.this;
            ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.a.getContainingDeclaration());
            if (protoContainerA == null) {
                listLoadExtensionReceiverParameterAnnotations = null;
            } else {
                listLoadExtensionReceiverParameterAnnotations = MemberDeserializer.this.a.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(protoContainerA, this.b, this.c);
            }
            return listLoadExtensionReceiverParameterAnnotations != null ? listLoadExtensionReceiverParameterAnnotations : CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public static final class e extends Lambda implements Function0<ConstantValue<?>> {
        public final /* synthetic */ ProtoBuf.Property b;
        public final /* synthetic */ DeserializedPropertyDescriptor c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
            super(0);
            this.b = property;
            this.c = deserializedPropertyDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConstantValue<?> getA() {
            MemberDeserializer memberDeserializer = MemberDeserializer.this;
            return MemberDeserializer.this.a.getComponents().getAnnotationAndConstantLoader().loadPropertyConstant(memberDeserializer.a(memberDeserializer.a.getContainingDeclaration()), this.b, this.c.getReturnType());
        }
    }

    public static final class f extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
        public final /* synthetic */ ProtoContainer b;
        public final /* synthetic */ MessageLite c;
        public final /* synthetic */ AnnotatedCallableKind d;
        public final /* synthetic */ int e;
        public final /* synthetic */ ProtoBuf.ValueParameter f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
            super(0);
            this.b = protoContainer;
            this.c = messageLite;
            this.d = annotatedCallableKind;
            this.e = i;
            this.f = valueParameter;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends AnnotationDescriptor> getA() {
            return CollectionsKt___CollectionsKt.toList(MemberDeserializer.this.a.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(this.b, this.c, this.d, this.e, this.f));
        }
    }

    public MemberDeserializer(@NotNull DeserializationContext deserializationContext) {
        this.a = deserializationContext;
        this.b = new AnnotationDeserializer(deserializationContext.getComponents().getModuleDescriptor(), deserializationContext.getComponents().getNotFoundClasses());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProtoContainer a(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.a.getNameResolver(), this.a.getTypeTable(), this.a.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    private final DeserializedMemberDescriptor.CoroutinesCompatibilityMode b(DeserializedMemberDescriptor deserializedMemberDescriptor, TypeDeserializer typeDeserializer) {
        if (!m(deserializedMemberDescriptor)) {
            return DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
        }
        e(typeDeserializer);
        return typeDeserializer.getExperimentalSuspendFunctionTypeEncountered() ? DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE : DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
    }

    private final DeserializedMemberDescriptor.CoroutinesCompatibilityMode c(DeserializedCallableMemberDescriptor deserializedCallableMemberDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, Collection<? extends ValueParameterDescriptor> collection, Collection<? extends TypeParameterDescriptor> collection2, KotlinType kotlinType, boolean z) {
        boolean z2;
        boolean z3;
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode;
        boolean z4;
        if (m(deserializedCallableMemberDescriptor) && !Intrinsics.areEqual(DescriptorUtilsKt.fqNameOrNull(deserializedCallableMemberDescriptor), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ValueParameterDescriptor) it2.next()).getType());
            }
            List<KotlinType> listPlus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt__CollectionsKt.listOfNotNull(receiverParameterDescriptor == null ? null : receiverParameterDescriptor.getType()));
            if (kotlinType != null && d(kotlinType)) {
                return DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
            }
            if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                Iterator<T> it3 = collection2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z3 = false;
                        break;
                    }
                    List<KotlinType> upperBounds = ((TypeParameterDescriptor) it3.next()).getUpperBounds();
                    if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
                        Iterator<T> it4 = upperBounds.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z2 = false;
                                break;
                            }
                            if (d((KotlinType) it4.next())) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        z2 = false;
                        break;
                        break;
                    }
                    if (z2) {
                        z3 = true;
                        break;
                    }
                }
            } else {
                z3 = false;
                break;
            }
            if (z3) {
                return DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listPlus, 10));
            for (KotlinType kotlinType2 : listPlus) {
                if (!FunctionTypesKt.isSuspendFunctionType(kotlinType2) || kotlinType2.getArguments().size() > 3) {
                    coroutinesCompatibilityMode = d(kotlinType2) ? DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE : DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
                } else {
                    List<TypeProjection> arguments = kotlinType2.getArguments();
                    if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
                        Iterator<T> it5 = arguments.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                z4 = false;
                                break;
                            }
                            if (d(((TypeProjection) it5.next()).getType())) {
                                z4 = true;
                                break;
                            }
                        }
                    } else {
                        z4 = false;
                        break;
                    }
                    coroutinesCompatibilityMode = z4 ? DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE : DeserializedMemberDescriptor.CoroutinesCompatibilityMode.NEEDS_WRAPPER;
                }
                arrayList2.add(coroutinesCompatibilityMode);
            }
            DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode2 = (DeserializedMemberDescriptor.CoroutinesCompatibilityMode) CollectionsKt.maxOrNull((Iterable) arrayList2);
            if (coroutinesCompatibilityMode2 == null) {
                coroutinesCompatibilityMode2 = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
            }
            return (DeserializedMemberDescriptor.CoroutinesCompatibilityMode) ComparisonsKt.maxOf(z ? DeserializedMemberDescriptor.CoroutinesCompatibilityMode.NEEDS_WRAPPER : DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE, coroutinesCompatibilityMode2);
        }
        return DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
    }

    private final boolean d(KotlinType kotlinType) {
        return TypeUtilsKt.contains(kotlinType, new PropertyReference1() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.a
            @Override // kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Boolean.valueOf(FunctionTypesKt.isSuspendFunctionType((KotlinType) obj));
            }

            @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
            @NotNull
            public String getName() {
                return "isSuspendFunctionType";
            }

            @Override // kotlin.jvm.internal.CallableReference
            @NotNull
            public KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinPackage(FunctionTypesKt.class, "deserialization");
            }

            @Override // kotlin.jvm.internal.CallableReference
            @NotNull
            public String getSignature() {
                return "isSuspendFunctionType(Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            }
        });
    }

    private final void e(TypeDeserializer typeDeserializer) {
        Iterator<T> it2 = typeDeserializer.getOwnTypeParameters().iterator();
        while (it2.hasNext()) {
            ((TypeParameterDescriptor) it2.next()).getUpperBounds();
        }
    }

    private final Annotations f(MessageLite messageLite, int i, AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.HAS_ANNOTATIONS.get(i).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.a.getStorageManager(), new b(messageLite, annotatedCallableKind));
    }

    private final ReceiverParameterDescriptor g() {
        DeclarationDescriptor containingDeclaration = this.a.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null) {
            return null;
        }
        return classDescriptor.getThisAsReceiverParameter();
    }

    private final Annotations h(ProtoBuf.Property property, boolean z) {
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.a.getStorageManager(), new c(z, property));
    }

    private final Annotations i(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.a.getStorageManager(), new d(messageLite, annotatedCallableKind));
    }

    private final void j(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends TypeParameterDescriptor> list, List<? extends ValueParameterDescriptor> list2, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map, boolean z) {
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, kotlinType, modality, descriptorVisibility, map, c(deserializedSimpleFunctionDescriptor, receiverParameterDescriptor, list2, list, kotlinType, z));
    }

    private final int k(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    private final List<ValueParameterDescriptor> l(List<ProtoBuf.ValueParameter> list, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        CallableDescriptor callableDescriptor = (CallableDescriptor) this.a.getContainingDeclaration();
        ProtoContainer protoContainerA = a(callableDescriptor.getContainingDeclaration());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            Annotations empty = (protoContainerA == null || !Flags.HAS_ANNOTATIONS.get(flags).booleanValue()) ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.a.getStorageManager(), new f(protoContainerA, messageLite, annotatedCallableKind, i, valueParameter));
            Name name = NameResolverUtilKt.getName(this.a.getNameResolver(), valueParameter.getName());
            KotlinType kotlinTypeType = this.a.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, this.a.getTypeTable()));
            boolean zBooleanValue = Flags.DECLARES_DEFAULT_VALUE.get(flags).booleanValue();
            boolean zBooleanValue2 = Flags.IS_CROSSINLINE.get(flags).booleanValue();
            boolean zBooleanValue3 = Flags.IS_NOINLINE.get(flags).booleanValue();
            ProtoBuf.Type typeVarargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, this.a.getTypeTable());
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i, empty, name, kotlinTypeType, zBooleanValue, zBooleanValue2, zBooleanValue3, typeVarargElementType == null ? null : this.a.getTypeDeserializer().type(typeVarargElementType), SourceElement.NO_SOURCE));
            arrayList = arrayList2;
            i = i2;
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    private final boolean m(DeserializedMemberDescriptor deserializedMemberDescriptor) {
        boolean z;
        if (!this.a.getComponents().getConfiguration().getReleaseCoroutines()) {
            return false;
        }
        List<VersionRequirement> versionRequirements = deserializedMemberDescriptor.getVersionRequirements();
        if ((versionRequirements instanceof Collection) && versionRequirements.isEmpty()) {
            z = true;
        } else {
            for (VersionRequirement versionRequirement : versionRequirements) {
                if (Intrinsics.areEqual(versionRequirement.getVersion(), new VersionRequirement.Version(1, 3, 0, 4, null)) && versionRequirement.getKind() == ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @NotNull
    public final ClassConstructorDescriptor loadConstructor(@NotNull ProtoBuf.Constructor constructor, boolean z) {
        DeserializationContext c2;
        TypeDeserializer typeDeserializer;
        ClassDescriptor classDescriptor = (ClassDescriptor) this.a.getContainingDeclaration();
        int flags = constructor.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, f(constructor, flags, annotatedCallableKind), z, CallableMemberDescriptor.Kind.DECLARATION, constructor, this.a.getNameResolver(), this.a.getTypeTable(), this.a.getVersionRequirementTable(), this.a.getContainerSource(), null, 1024, null);
        deserializedClassConstructorDescriptor.initialize(DeserializationContext.childContext$default(this.a, deserializedClassConstructorDescriptor, CollectionsKt__CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer().l(constructor.getValueParameterList(), constructor, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(constructor.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(constructor.getFlags()).booleanValue());
        DeclarationDescriptor containingDeclaration = this.a.getContainingDeclaration();
        DeserializedClassDescriptor deserializedClassDescriptor = containingDeclaration instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) containingDeclaration : null;
        deserializedClassConstructorDescriptor.setCoroutinesExperimentalCompatibilityMode$deserialization((deserializedClassDescriptor != null && (c2 = deserializedClassDescriptor.getC()) != null && (typeDeserializer = c2.getTypeDeserializer()) != null && typeDeserializer.getExperimentalSuspendFunctionTypeEncountered()) && m(deserializedClassConstructorDescriptor) ? DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE : c(deserializedClassConstructorDescriptor, null, deserializedClassConstructorDescriptor.getValueParameters(), deserializedClassConstructorDescriptor.getTypeParameters(), deserializedClassConstructorDescriptor.getReturnType(), false));
        return deserializedClassConstructorDescriptor;
    }

    @NotNull
    public final SimpleFunctionDescriptor loadFunction(@NotNull ProtoBuf.Function function) {
        KotlinType kotlinTypeType;
        int flags = function.hasFlags() ? function.getFlags() : k(function.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotationsF = f(function, flags, annotatedCallableKind);
        Annotations annotationsI = ProtoTypeTableUtilKt.hasReceiver(function) ? i(function, annotatedCallableKind) : Annotations.Companion.getEMPTY();
        VersionRequirementTable empty = Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(this.a.getContainingDeclaration()).child(NameResolverUtilKt.getName(this.a.getNameResolver(), function.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : this.a.getVersionRequirementTable();
        Name name = NameResolverUtilKt.getName(this.a.getNameResolver(), function.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(this.a.getContainingDeclaration(), null, annotationsF, name, ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(flags)), function, this.a.getNameResolver(), this.a.getTypeTable(), empty, this.a.getContainerSource(), null, 1024, null);
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(this.a, deserializedSimpleFunctionDescriptor, function.getTypeParameterList(), null, null, null, null, 60, null);
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(function, this.a.getTypeTable());
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = null;
        if (typeReceiverType != null && (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) != null) {
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, kotlinTypeType, annotationsI);
        }
        ReceiverParameterDescriptor receiverParameterDescriptorG = g();
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        List<ValueParameterDescriptor> listL = deserializationContextChildContext$default.getMemberDeserializer().l(function.getValueParameterList(), function, annotatedCallableKind);
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(function, this.a.getTypeTable()));
        Modality modality = protoEnumFlags.modality(Flags.MODALITY.get(flags));
        DescriptorVisibility descriptorVisibility = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags));
        Map<? extends CallableDescriptor.UserDataKey<?>, ?> mapEmptyMap = r.emptyMap();
        Flags.BooleanFlagField booleanFlagField = Flags.IS_SUSPEND;
        j(deserializedSimpleFunctionDescriptor, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, receiverParameterDescriptorG, ownTypeParameters, listL, kotlinTypeType2, modality, descriptorVisibility, mapEmptyMap, booleanFlagField.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setOperator(Flags.IS_OPERATOR.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setInfix(Flags.IS_INFIX.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setExternal(Flags.IS_EXTERNAL_FUNCTION.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setInline(Flags.IS_INLINE.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setTailrec(Flags.IS_TAILREC.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setSuspend(booleanFlagField.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setExpect(Flags.IS_EXPECT_FUNCTION.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(flags).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> pairDeserializeContractFromFunction = this.a.getComponents().getContractDeserializer().deserializeContractFromFunction(function, deserializedSimpleFunctionDescriptor, this.a.getTypeTable(), deserializationContextChildContext$default.getTypeDeserializer());
        if (pairDeserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap(pairDeserializeContractFromFunction.getFirst(), pairDeserializeContractFromFunction.getSecond());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    @NotNull
    public final PropertyDescriptor loadProperty(@NotNull ProtoBuf.Property property) {
        ProtoBuf.Property property2;
        Annotations empty;
        KotlinType kotlinTypeType;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor;
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable;
        ProtoEnumFlags protoEnumFlags;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor2;
        ProtoBuf.Property property3;
        boolean z;
        PropertySetterDescriptorImpl propertySetterDescriptorImplCreateDefaultSetter;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter;
        int flags = property.hasFlags() ? property.getFlags() : k(property.getOldFlags());
        DeclarationDescriptor containingDeclaration = this.a.getContainingDeclaration();
        Annotations annotationsF = f(property, flags, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
        Flags.FlagField<ProtoBuf.Modality> flagField = Flags.MODALITY;
        Modality modality = protoEnumFlags2.modality(flagField.get(flags));
        Flags.FlagField<ProtoBuf.Visibility> flagField2 = Flags.VISIBILITY;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor3 = new DeserializedPropertyDescriptor(containingDeclaration, null, annotationsF, modality, ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField2.get(flags)), Flags.IS_VAR.get(flags).booleanValue(), NameResolverUtilKt.getName(this.a.getNameResolver(), property.getName()), ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags2, Flags.MEMBER_KIND.get(flags)), Flags.IS_LATEINIT.get(flags).booleanValue(), Flags.IS_CONST.get(flags).booleanValue(), Flags.IS_EXTERNAL_PROPERTY.get(flags).booleanValue(), Flags.IS_DELEGATED.get(flags).booleanValue(), Flags.IS_EXPECT_PROPERTY.get(flags).booleanValue(), property, this.a.getNameResolver(), this.a.getTypeTable(), this.a.getVersionRequirementTable(), this.a.getContainerSource());
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(this.a, deserializedPropertyDescriptor3, property.getTypeParameterList(), null, null, null, null, 60, null);
        boolean zBooleanValue = Flags.HAS_GETTER.get(flags).booleanValue();
        if (zBooleanValue && ProtoTypeTableUtilKt.hasReceiver(property)) {
            property2 = property;
            empty = i(property2, AnnotatedCallableKind.PROPERTY_GETTER);
        } else {
            property2 = property;
            empty = Annotations.Companion.getEMPTY();
        }
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(property2, this.a.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        ReceiverParameterDescriptor receiverParameterDescriptorG = g();
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(property2, this.a.getTypeTable());
        if (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) {
            deserializedPropertyDescriptor = deserializedPropertyDescriptor3;
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = null;
        } else {
            deserializedPropertyDescriptor = deserializedPropertyDescriptor3;
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, kotlinTypeType, empty);
        }
        deserializedPropertyDescriptor.setType(kotlinTypeType2, ownTypeParameters, receiverParameterDescriptorG, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable);
        Flags.FlagField<ProtoBuf.Visibility> flagField3 = flagField2;
        Flags.FlagField<ProtoBuf.Modality> flagField4 = flagField;
        int accessorFlags = Flags.getAccessorFlags(Flags.HAS_ANNOTATIONS.get(flags).booleanValue(), flagField3.get(flags), flagField4.get(flags), false, false, false);
        if (zBooleanValue) {
            int getterFlags = property.hasGetterFlags() ? property.getGetterFlags() : accessorFlags;
            boolean zBooleanValue2 = Flags.IS_NOT_DEFAULT.get(getterFlags).booleanValue();
            boolean zBooleanValue3 = Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags).booleanValue();
            boolean zBooleanValue4 = Flags.IS_INLINE_ACCESSOR.get(getterFlags).booleanValue();
            Annotations annotationsF2 = f(property2, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zBooleanValue2) {
                protoEnumFlags = protoEnumFlags2;
                propertyGetterDescriptorImplCreateDefaultGetter = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotationsF2, protoEnumFlags2.modality(flagField4.get(getterFlags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField3.get(getterFlags)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                protoEnumFlags = protoEnumFlags2;
                propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotationsF2);
            }
            propertyGetterDescriptorImplCreateDefaultGetter.initialize(deserializedPropertyDescriptor.getReturnType());
            propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
        } else {
            flagField4 = flagField4;
            flagField3 = flagField3;
            protoEnumFlags = protoEnumFlags2;
            propertyGetterDescriptorImpl = null;
        }
        if (Flags.HAS_SETTER.get(flags).booleanValue()) {
            if (property.hasSetterFlags()) {
                accessorFlags = property.getSetterFlags();
            }
            int i = accessorFlags;
            boolean zBooleanValue5 = Flags.IS_NOT_DEFAULT.get(i).booleanValue();
            boolean zBooleanValue6 = Flags.IS_EXTERNAL_ACCESSOR.get(i).booleanValue();
            boolean zBooleanValue7 = Flags.IS_INLINE_ACCESSOR.get(i).booleanValue();
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotationsF3 = f(property2, i, annotatedCallableKind);
            if (zBooleanValue5) {
                ProtoEnumFlags protoEnumFlags3 = protoEnumFlags;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotationsF3, protoEnumFlags3.modality(flagField4.get(i)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags3, flagField3.get(i)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                z = true;
                deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                property3 = property2;
                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) CollectionsKt.single((List) DeserializationContext.childContext$default(deserializationContextChildContext$default, propertySetterDescriptorImpl, CollectionsKt__CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer().l(kotlin.collections.e.listOf(property.getSetterValueParameter()), property3, annotatedCallableKind)));
                propertySetterDescriptorImplCreateDefaultSetter = propertySetterDescriptorImpl;
            } else {
                deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                property3 = property2;
                z = true;
                propertySetterDescriptorImplCreateDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor2, annotationsF3, Annotations.Companion.getEMPTY());
            }
        } else {
            deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
            property3 = property2;
            z = true;
            propertySetterDescriptorImplCreateDefaultSetter = null;
        }
        if (Flags.HAS_CONSTANT.get(flags).booleanValue()) {
            deserializedPropertyDescriptor2.setCompileTimeInitializer(this.a.getStorageManager().createNullableLazyValue(new e(property3, deserializedPropertyDescriptor2)));
        }
        deserializedPropertyDescriptor2.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImplCreateDefaultSetter, new FieldDescriptorImpl(h(property3, false), deserializedPropertyDescriptor2), new FieldDescriptorImpl(h(property3, z), deserializedPropertyDescriptor2), b(deserializedPropertyDescriptor2, deserializationContextChildContext$default.getTypeDeserializer()));
        return deserializedPropertyDescriptor2;
    }

    @NotNull
    public final TypeAliasDescriptor loadTypeAlias(@NotNull ProtoBuf.TypeAlias typeAlias) {
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(annotationList, 10));
        Iterator<T> it2 = annotationList.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.b.deserializeAnnotation((ProtoBuf.Annotation) it2.next(), this.a.getNameResolver()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.a.getStorageManager(), this.a.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(this.a.getNameResolver(), typeAlias.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(typeAlias.getFlags())), typeAlias, this.a.getNameResolver(), this.a.getTypeTable(), this.a.getVersionRequirementTable(), this.a.getContainerSource());
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(this.a, deserializedTypeAliasDescriptor, typeAlias.getTypeParameterList(), null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.initialize(deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters(), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(typeAlias, this.a.getTypeTable()), false), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(typeAlias, this.a.getTypeTable()), false), b(deserializedTypeAliasDescriptor, deserializationContextChildContext$default.getTypeDeserializer()));
        return deserializedTypeAliasDescriptor;
    }
}
