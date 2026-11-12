package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {

    @NotNull
    private final ProtoBuf.Class e;

    @NotNull
    private final BinaryVersion f;

    @NotNull
    private final SourceElement g;

    @NotNull
    private final ClassId h;

    @NotNull
    private final Modality i;

    @NotNull
    private final DescriptorVisibility j;

    @NotNull
    private final ClassKind k;

    @NotNull
    private final DeserializationContext l;

    @NotNull
    private final MemberScopeImpl m;

    @NotNull
    private final a n;

    @NotNull
    private final ScopesHolderForClass<DeserializedClassMemberScope> o;

    @Nullable
    private final b p;

    @NotNull
    private final DeclarationDescriptor q;

    @NotNull
    private final NullableLazyValue<ClassConstructorDescriptor> r;

    @NotNull
    private final NotNullLazyValue<Collection<ClassConstructorDescriptor>> s;

    @NotNull
    private final NullableLazyValue<ClassDescriptor> t;

    @NotNull
    private final NotNullLazyValue<Collection<ClassDescriptor>> u;

    @NotNull
    private final NullableLazyValue<InlineClassRepresentation<SimpleType>> v;

    @NotNull
    private final ProtoContainer.Class w;

    @NotNull
    private final Annotations x;

    public final class DeserializedClassMemberScope extends DeserializedMemberScope {

        @NotNull
        private final KotlinTypeRefiner f;

        @NotNull
        private final NotNullLazyValue<Collection<DeclarationDescriptor>> g;

        @NotNull
        private final NotNullLazyValue<Collection<KotlinType>> h;

        public static final class a extends Lambda implements Function0<List<? extends Name>> {
            public final /* synthetic */ List<Name> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<Name> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends Name> invoke() {
                return this.a;
            }
        }

        public static final class b extends Lambda implements Function0<Collection<? extends DeclarationDescriptor>> {
            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<DeclarationDescriptor> invoke() {
                return DeserializedClassMemberScope.this.computeDescriptors(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
            }
        }

        public static final class c extends Lambda implements Function0<Collection<? extends KotlinType>> {
            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<KotlinType> invoke() {
                return DeserializedClassMemberScope.this.f.refineSupertypes(DeserializedClassMemberScope.this.h());
            }
        }

        public DeserializedClassMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
            DeserializationContext c2 = DeserializedClassDescriptor.this.getC();
            List<ProtoBuf.Function> functionList = DeserializedClassDescriptor.this.getClassProto().getFunctionList();
            List<ProtoBuf.Property> propertyList = DeserializedClassDescriptor.this.getClassProto().getPropertyList();
            List<ProtoBuf.TypeAlias> typeAliasList = DeserializedClassDescriptor.this.getClassProto().getTypeAliasList();
            List<Integer> nestedClassNameList = DeserializedClassDescriptor.this.getClassProto().getNestedClassNameList();
            NameResolver nameResolver = DeserializedClassDescriptor.this.getC().getNameResolver();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(nestedClassNameList, 10));
            Iterator<T> it2 = nestedClassNameList.iterator();
            while (it2.hasNext()) {
                arrayList.add(NameResolverUtilKt.getName(nameResolver, ((Number) it2.next()).intValue()));
            }
            super(c2, functionList, propertyList, typeAliasList, new a(arrayList));
            this.f = kotlinTypeRefiner;
            this.g = getC().getStorageManager().createLazyValue(new b());
            this.h = getC().getStorageManager().createLazyValue(new c());
        }

        private final <D extends CallableMemberDescriptor> void g(Name name, Collection<? extends D> collection, final List<D> list) {
            getC().getComponents().getKotlinTypeChecker().getOverridingUtil().generateOverridesInFunctionGroup(name, collection, new ArrayList(list), h(), new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                public void addFakeOverride(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
                    OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
                    list.add((D) callableMemberDescriptor);
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                public void conflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeserializedClassDescriptor h() {
            return DeserializedClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public void addEnumEntryDescriptors(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1) {
            b bVar = h().p;
            Collection<ClassDescriptor> collectionD = bVar == null ? null : bVar.d();
            if (collectionD == null) {
                collectionD = CollectionsKt__CollectionsKt.emptyList();
            }
            collection.addAll(collectionD);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public void computeNonDeclaredFunctions(@NotNull Name name, @NotNull List<SimpleFunctionDescriptor> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it2 = this.h.invoke().iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next().getMemberScope().getContributedFunctions(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            list.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctions(name, DeserializedClassDescriptor.this));
            g(name, arrayList, list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public void computeNonDeclaredProperties(@NotNull Name name, @NotNull List<PropertyDescriptor> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it2 = this.h.invoke().iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next().getMemberScope().getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            g(name, arrayList, list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        public ClassId createClassId(@NotNull Name name) {
            return DeserializedClassDescriptor.this.h.createNestedClassId(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @Nullable
        /* JADX INFO: renamed from: getContributedClassifier */
        public ClassifierDescriptor mo4299getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            ClassDescriptor classDescriptorF;
            recordLookup(name, lookupLocation);
            b bVar = h().p;
            return (bVar == null || (classDescriptorF = bVar.f(name)) == null) ? super.mo4299getContributedClassifier(name, lookupLocation) : classDescriptorF;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
            return this.g.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            recordLookup(name, lookupLocation);
            return super.getContributedFunctions(name, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            recordLookup(name, lookupLocation);
            return super.getContributedVariables(name, lookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @Nullable
        public Set<Name> getNonDeclaredClassifierNames() {
            List<KotlinType> supertypes = h().n.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it2 = supertypes.iterator();
            while (it2.hasNext()) {
                Set<Name> classifierNames = ((KotlinType) it2.next()).getMemberScope().getClassifierNames();
                if (classifierNames == null) {
                    return null;
                }
                kotlin.collections.h.addAll(linkedHashSet, classifierNames);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        public Set<Name> getNonDeclaredFunctionNames() {
            List<KotlinType> supertypes = h().n.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it2 = supertypes.iterator();
            while (it2.hasNext()) {
                kotlin.collections.h.addAll(linkedHashSet, ((KotlinType) it2.next()).getMemberScope().getFunctionNames());
            }
            linkedHashSet.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(DeserializedClassDescriptor.this));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        public Set<Name> getNonDeclaredVariableNames() {
            List<KotlinType> supertypes = h().n.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it2 = supertypes.iterator();
            while (it2.hasNext()) {
                kotlin.collections.h.addAll(linkedHashSet, ((KotlinType) it2.next()).getMemberScope().getVariableNames());
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public boolean isDeclaredFunctionAvailable(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
            return getC().getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(DeserializedClassDescriptor.this, simpleFunctionDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public void recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, h(), name);
        }
    }

    public final class a extends AbstractClassTypeConstructor {

        @NotNull
        private final NotNullLazyValue<List<TypeParameterDescriptor>> d;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$a$a, reason: collision with other inner class name */
        public static final class C1174a extends Lambda implements Function0<List<? extends TypeParameterDescriptor>> {
            public final /* synthetic */ DeserializedClassDescriptor a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1174a(DeserializedClassDescriptor deserializedClassDescriptor) {
                super(0);
                this.a = deserializedClassDescriptor;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends TypeParameterDescriptor> invoke() {
                return TypeParameterUtilsKt.computeConstructorTypeParameters(this.a);
            }
        }

        public a() {
            super(DeserializedClassDescriptor.this.getC().getStorageManager());
            this.d = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new C1174a(DeserializedClassDescriptor.this));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        public Collection<KotlinType> computeSupertypes() {
            FqName fqNameAsSingleFqName;
            List<ProtoBuf.Type> listSupertypes = ProtoTypeTableUtilKt.supertypes(DeserializedClassDescriptor.this.getClassProto(), DeserializedClassDescriptor.this.getC().getTypeTable());
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSupertypes, 10));
            Iterator<T> it2 = listSupertypes.iterator();
            while (it2.hasNext()) {
                arrayList.add(deserializedClassDescriptor.getC().getTypeDeserializer().type((ProtoBuf.Type) it2.next()));
            }
            List listPlus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) DeserializedClassDescriptor.this.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(DeserializedClassDescriptor.this));
            ArrayList<NotFoundClasses.MockClassDescriptor> arrayList2 = new ArrayList();
            Iterator it3 = listPlus.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = ((KotlinType) it3.next()).getConstructor().mo4298getDeclarationDescriptor();
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorMo4298getDeclarationDescriptor instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorMo4298getDeclarationDescriptor : null;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporter = DeserializedClassDescriptor.this.getC().getComponents().getErrorReporter();
                DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                for (NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList2) {
                    ClassId classId = DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                    String strAsString = (classId == null || (fqNameAsSingleFqName = classId.asSingleFqName()) == null) ? null : fqNameAsSingleFqName.asString();
                    if (strAsString == null) {
                        strAsString = mockClassDescriptor2.getName().asString();
                    }
                    arrayList3.add(strAsString);
                }
                errorReporter.reportIncompleteHierarchy(deserializedClassDescriptor2, arrayList3);
            }
            return CollectionsKt___CollectionsKt.toList(listPlus);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public DeserializedClassDescriptor mo4298getDeclarationDescriptor() {
            return DeserializedClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return this.d.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        public SupertypeLoopChecker getSupertypeLoopChecker() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        @NotNull
        public String toString() {
            return DeserializedClassDescriptor.this.getName().toString();
        }
    }

    public final class b {

        @NotNull
        private final Map<Name, ProtoBuf.EnumEntry> a;

        @NotNull
        private final MemoizedFunctionToNullable<Name, ClassDescriptor> b;

        @NotNull
        private final NotNullLazyValue<Set<Name>> c;

        public static final class a extends Lambda implements Function1<Name, ClassDescriptor> {
            public final /* synthetic */ DeserializedClassDescriptor b;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$b$a$a, reason: collision with other inner class name */
            public static final class C1175a extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
                public final /* synthetic */ DeserializedClassDescriptor a;
                public final /* synthetic */ ProtoBuf.EnumEntry b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1175a(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf.EnumEntry enumEntry) {
                    super(0);
                    this.a = deserializedClassDescriptor;
                    this.b = enumEntry;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final List<? extends AnnotationDescriptor> invoke() {
                    return CollectionsKt___CollectionsKt.toList(this.a.getC().getComponents().getAnnotationAndConstantLoader().loadEnumEntryAnnotations(this.a.getThisAsProtoContainer$deserialization(), this.b));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeserializedClassDescriptor deserializedClassDescriptor) {
                super(1);
                this.b = deserializedClassDescriptor;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ClassDescriptor invoke(@NotNull Name name) {
                ProtoBuf.EnumEntry enumEntry = (ProtoBuf.EnumEntry) b.this.a.get(name);
                if (enumEntry == null) {
                    return null;
                }
                DeserializedClassDescriptor deserializedClassDescriptor = this.b;
                return EnumEntrySyntheticClassDescriptor.create(deserializedClassDescriptor.getC().getStorageManager(), deserializedClassDescriptor, name, b.this.c, new DeserializedAnnotations(deserializedClassDescriptor.getC().getStorageManager(), new C1175a(deserializedClassDescriptor, enumEntry)), SourceElement.NO_SOURCE);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$b$b, reason: collision with other inner class name */
        public static final class C1176b extends Lambda implements Function0<Set<? extends Name>> {
            public C1176b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<? extends Name> invoke() {
                return b.this.e();
            }
        }

        public b() {
            List<ProtoBuf.EnumEntry> enumEntryList = DeserializedClassDescriptor.this.getClassProto().getEnumEntryList();
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntryList, 10)), 16));
            for (Object obj : enumEntryList) {
                linkedHashMap.put(NameResolverUtilKt.getName(DeserializedClassDescriptor.this.getC().getNameResolver(), ((ProtoBuf.EnumEntry) obj).getName()), obj);
            }
            this.a = linkedHashMap;
            this.b = DeserializedClassDescriptor.this.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new a(DeserializedClassDescriptor.this));
            this.c = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new C1176b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<Name> e() {
            HashSet hashSet = new HashSet();
            Iterator<KotlinType> it2 = DeserializedClassDescriptor.this.getTypeConstructor().getSupertypes().iterator();
            while (it2.hasNext()) {
                for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(it2.next().getMemberScope(), null, null, 3, null)) {
                    if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                        hashSet.add(declarationDescriptor.getName());
                    }
                }
            }
            List<ProtoBuf.Function> functionList = DeserializedClassDescriptor.this.getClassProto().getFunctionList();
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            Iterator<T> it3 = functionList.iterator();
            while (it3.hasNext()) {
                hashSet.add(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it3.next()).getName()));
            }
            List<ProtoBuf.Property> propertyList = DeserializedClassDescriptor.this.getClassProto().getPropertyList();
            DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
            Iterator<T> it4 = propertyList.iterator();
            while (it4.hasNext()) {
                hashSet.add(NameResolverUtilKt.getName(deserializedClassDescriptor2.getC().getNameResolver(), ((ProtoBuf.Property) it4.next()).getName()));
            }
            return z.plus((Set) hashSet, (Iterable) hashSet);
        }

        @NotNull
        public final Collection<ClassDescriptor> d() {
            Set<Name> setKeySet = this.a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                ClassDescriptor classDescriptorF = f((Name) it2.next());
                if (classDescriptorF != null) {
                    arrayList.add(classDescriptorF);
                }
            }
            return arrayList;
        }

        @Nullable
        public final ClassDescriptor f(@NotNull Name name) {
            return this.b.invoke(name);
        }
    }

    public static final class c extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends AnnotationDescriptor> invoke() {
            return CollectionsKt___CollectionsKt.toList(DeserializedClassDescriptor.this.getC().getComponents().getAnnotationAndConstantLoader().loadClassAnnotations(DeserializedClassDescriptor.this.getThisAsProtoContainer$deserialization()));
        }
    }

    public static final class d extends Lambda implements Function0<ClassDescriptor> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClassDescriptor invoke() {
            return DeserializedClassDescriptor.this.b();
        }
    }

    public static final class e extends Lambda implements Function0<Collection<? extends ClassConstructorDescriptor>> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<ClassConstructorDescriptor> invoke() {
            return DeserializedClassDescriptor.this.c();
        }
    }

    public static final class f extends Lambda implements Function0<InlineClassRepresentation<SimpleType>> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InlineClassRepresentation<SimpleType> invoke() {
            return DeserializedClassDescriptor.this.d();
        }
    }

    public /* synthetic */ class g extends FunctionReference implements Function1<KotlinTypeRefiner, DeserializedClassMemberScope> {
        public g(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeserializedClassMemberScope invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            return ((DeserializedClassDescriptor) this.receiver).new DeserializedClassMemberScope(kotlinTypeRefiner);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(DeserializedClassMemberScope.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    public static final class h extends Lambda implements Function0<ClassConstructorDescriptor> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClassConstructorDescriptor invoke() {
            return DeserializedClassDescriptor.this.e();
        }
    }

    public static final class i extends Lambda implements Function0<Collection<? extends ClassDescriptor>> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<ClassDescriptor> invoke() {
            return DeserializedClassDescriptor.this.g();
        }
    }

    public DeserializedClassDescriptor(@NotNull DeserializationContext deserializationContext, @NotNull ProtoBuf.Class r10, @NotNull NameResolver nameResolver, @NotNull BinaryVersion binaryVersion, @NotNull SourceElement sourceElement) {
        super(deserializationContext.getStorageManager(), NameResolverUtilKt.getClassId(nameResolver, r10.getFqName()).getShortClassName());
        this.e = r10;
        this.f = binaryVersion;
        this.g = sourceElement;
        this.h = NameResolverUtilKt.getClassId(nameResolver, r10.getFqName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        this.i = protoEnumFlags.modality(Flags.MODALITY.get(r10.getFlags()));
        this.j = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(r10.getFlags()));
        ClassKind classKind = protoEnumFlags.classKind(Flags.CLASS_KIND.get(r10.getFlags()));
        this.k = classKind;
        DeserializationContext deserializationContextChildContext = deserializationContext.childContext(this, r10.getTypeParameterList(), nameResolver, new TypeTable(r10.getTypeTable()), VersionRequirementTable.Companion.create(r10.getVersionRequirementTable()), binaryVersion);
        this.l = deserializationContextChildContext;
        ClassKind classKind2 = ClassKind.ENUM_CLASS;
        this.m = classKind == classKind2 ? new StaticScopeForKotlinEnum(deserializationContextChildContext.getStorageManager(), this) : MemberScope.Empty.INSTANCE;
        this.n = new a();
        this.o = ScopesHolderForClass.Companion.create(this, deserializationContextChildContext.getStorageManager(), deserializationContextChildContext.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new g(this));
        this.p = classKind == classKind2 ? new b() : null;
        DeclarationDescriptor containingDeclaration = deserializationContext.getContainingDeclaration();
        this.q = containingDeclaration;
        this.r = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new h());
        this.s = deserializationContextChildContext.getStorageManager().createLazyValue(new e());
        this.t = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new d());
        this.u = deserializationContextChildContext.getStorageManager().createLazyValue(new i());
        this.v = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new f());
        NameResolver nameResolver2 = deserializationContextChildContext.getNameResolver();
        TypeTable typeTable = deserializationContextChildContext.getTypeTable();
        DeserializedClassDescriptor deserializedClassDescriptor = containingDeclaration instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) containingDeclaration : null;
        this.w = new ProtoContainer.Class(r10, nameResolver2, typeTable, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.w : null);
        this.x = !Flags.HAS_ANNOTATIONS.get(r10.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(deserializationContextChildContext.getStorageManager(), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor b() {
        if (!this.e.hasCompanionObjectName()) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo4299getContributedClassifier = h().mo4299getContributedClassifier(NameResolverUtilKt.getName(this.l.getNameResolver(), this.e.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo4299getContributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo4299getContributedClassifier;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<ClassConstructorDescriptor> c() {
        return CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.plus((Collection) f(), (Iterable) CollectionsKt__CollectionsKt.listOfNotNull(mo4293getUnsubstitutedPrimaryConstructor())), (Iterable) this.l.getComponents().getAdditionalClassPartsProvider().getConstructors(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InlineClassRepresentation<SimpleType> d() {
        Name name;
        Object obj = null;
        if (!InlineClassesUtilsKt.isInlineClass(this)) {
            return null;
        }
        if (this.e.hasInlineClassUnderlyingPropertyName()) {
            name = NameResolverUtilKt.getName(this.l.getNameResolver(), this.e.getInlineClassUnderlyingPropertyName());
        } else {
            if (this.f.isAtLeast(1, 5, 1)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Inline class has no underlying property name in metadata: ", this).toString());
            }
            ClassConstructorDescriptor classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor = mo4293getUnsubstitutedPrimaryConstructor();
            if (classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor == null) {
                throw new IllegalStateException(Intrinsics.stringPlus("Inline class has no primary constructor: ", this).toString());
            }
            name = ((ValueParameterDescriptor) CollectionsKt.first((List) classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor.getValueParameters())).getName();
        }
        ProtoBuf.Type typeInlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(this.e, this.l.getTypeTable());
        SimpleType simpleTypeSimpleType$default = typeInlineClassUnderlyingType == null ? null : TypeDeserializer.simpleType$default(this.l.getTypeDeserializer(), typeInlineClassUnderlyingType, false, 2, null);
        if (simpleTypeSimpleType$default == null) {
            Iterator<T> it2 = h().getContributedVariables(name, NoLookupLocation.FROM_DESERIALIZATION).iterator();
            Object obj2 = null;
            boolean z = false;
            while (true) {
                if (!it2.hasNext()) {
                    if (!z) {
                        break;
                    }
                    obj = obj2;
                    break;
                }
                Object next = it2.next();
                if (((PropertyDescriptor) next).getExtensionReceiverParameter() == null) {
                    if (z) {
                        break;
                    }
                    obj2 = next;
                    z = true;
                }
            }
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
            if (propertyDescriptor == null) {
                throw new IllegalStateException(Intrinsics.stringPlus("Inline class has no underlying property: ", this).toString());
            }
            simpleTypeSimpleType$default = (SimpleType) propertyDescriptor.getType();
        }
        return new InlineClassRepresentation<>(name, simpleTypeSimpleType$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassConstructorDescriptor e() {
        Object next;
        if (this.k.isSingleton()) {
            ClassConstructorDescriptorImpl classConstructorDescriptorImplCreatePrimaryConstructorForObject = DescriptorFactory.createPrimaryConstructorForObject(this, SourceElement.NO_SOURCE);
            classConstructorDescriptorImplCreatePrimaryConstructorForObject.setReturnType(getDefaultType());
            return classConstructorDescriptorImplCreatePrimaryConstructorForObject;
        }
        Iterator<T> it2 = this.e.getConstructorList().iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(!Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) next).getFlags()).booleanValue()));
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) next;
        if (constructor == null) {
            return null;
        }
        return getC().getMemberDeserializer().loadConstructor(constructor, true);
    }

    private final List<ClassConstructorDescriptor> f() {
        List<ProtoBuf.Constructor> constructorList = this.e.getConstructorList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : constructorList) {
            if (Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) obj).getFlags()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getC().getMemberDeserializer().loadConstructor((ProtoBuf.Constructor) it2.next(), false));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<ClassDescriptor> g() {
        if (this.i != Modality.SEALED) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Integer> sealedSubclassFqNameList = this.e.getSealedSubclassFqNameList();
        if (!(!sealedSubclassFqNameList.isEmpty())) {
            return CliSealedClassInheritorsProvider.INSTANCE.computeSealedSubclasses(this, false);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = sealedSubclassFqNameList.iterator();
        while (it2.hasNext()) {
            ClassDescriptor classDescriptorDeserializeClass = getC().getComponents().deserializeClass(NameResolverUtilKt.getClassId(getC().getNameResolver(), ((Integer) it2.next()).intValue()));
            if (classDescriptorDeserializeClass != null) {
                arrayList.add(classDescriptorDeserializeClass);
            }
        }
        return arrayList;
    }

    private final DeserializedClassMemberScope h() {
        return (DeserializedClassMemberScope) this.o.getScope(this.l.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.x;
    }

    @NotNull
    public final DeserializationContext getC() {
        return this.l;
    }

    @NotNull
    public final ProtoBuf.Class getClassProto() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo4292getCompanionObjectDescriptor() {
        return this.t.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        return this.s.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        return this.q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.l.getTypeDeserializer().getOwnTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public InlineClassRepresentation<SimpleType> getInlineClassRepresentation() {
        return this.v.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return this.k;
    }

    @NotNull
    public final BinaryVersion getMetadataVersion() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        return this.i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassDescriptor> getSealedSubclasses() {
        return this.u.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        return this.g;
    }

    @NotNull
    public final ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        return this.o.getScope(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo4293getUnsubstitutedPrimaryConstructor() {
        return this.r.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        return this.j;
    }

    public final boolean hasNestedClass$deserialization(@NotNull Name name) {
        return h().getClassNames$deserialization().contains(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return Flags.CLASS_KIND.get(this.e.getFlags()) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return Flags.IS_DATA.get(this.e.getFlags()).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return Flags.IS_EXPECT_CLASS.get(this.e.getFlags()).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return Flags.IS_EXTERNAL_CLASS.get(this.e.getFlags()).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return Flags.IS_FUN_INTERFACE.get(this.e.getFlags()).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return Flags.IS_INLINE_CLASS.get(this.e.getFlags()).booleanValue() && this.f.isAtMost(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return Flags.IS_INNER.get(this.e.getFlags()).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return Flags.IS_INLINE_CLASS.get(this.e.getFlags()).booleanValue() && this.f.isAtLeast(1, 4, 2);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("deserialized ");
        sb.append(isExpect() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScopeImpl getStaticScope() {
        return this.m;
    }
}
