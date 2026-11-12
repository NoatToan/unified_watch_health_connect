package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    @NotNull
    private final ClassDescriptor m;

    @NotNull
    private final JavaClass n;
    private final boolean o;

    @NotNull
    private final NotNullLazyValue<List<ClassConstructorDescriptor>> p;

    @NotNull
    private final NotNullLazyValue<Set<Name>> q;

    @NotNull
    private final NotNullLazyValue<Map<Name, JavaField>> r;

    @NotNull
    private final MemoizedFunctionToNullable<Name, ClassDescriptorBase> s;

    public static final class a extends Lambda implements Function1<JavaMember, Boolean> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull JavaMember javaMember) {
            return Boolean.valueOf(!javaMember.isStatic());
        }
    }

    public /* synthetic */ class b extends FunctionReference implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        public b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
            return ((LazyJavaClassMemberScope) this.receiver).R(name);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(LazyJavaClassMemberScope.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    public /* synthetic */ class c extends FunctionReference implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        public c(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
            return ((LazyJavaClassMemberScope) this.receiver).S(name);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(LazyJavaClassMemberScope.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    public static final class d extends Lambda implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
            return LazyJavaClassMemberScope.this.R(name);
        }
    }

    public static final class e extends Lambda implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
            return LazyJavaClassMemberScope.this.S(name);
        }
    }

    public static final class f extends Lambda implements Function0<List<? extends ClassConstructorDescriptor>> {
        public final /* synthetic */ LazyJavaResolverContext b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LazyJavaResolverContext lazyJavaResolverContext) {
            super(0);
            this.b = lazyJavaResolverContext;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends ClassConstructorDescriptor> getA() {
            Collection<JavaConstructor> constructors = LazyJavaClassMemberScope.this.n.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.size());
            Iterator<JavaConstructor> it2 = constructors.iterator();
            while (it2.hasNext()) {
                arrayList.add(LazyJavaClassMemberScope.this.P(it2.next()));
            }
            if (LazyJavaClassMemberScope.this.n.isRecord()) {
                ClassConstructorDescriptor classConstructorDescriptorQ = LazyJavaClassMemberScope.this.q();
                boolean z = false;
                String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptorQ, false, false, 2, null);
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    do {
                        if (!it3.hasNext()) {
                            z = true;
                            break;
                        }
                    } while (!Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmDescriptor$default((ClassConstructorDescriptor) it3.next(), false, false, 2, null), strComputeJvmDescriptor$default));
                } else {
                    z = true;
                    break;
                }
                if (z) {
                    arrayList.add(classConstructorDescriptorQ);
                    this.b.getComponents().getJavaResolverCache().recordConstructor(LazyJavaClassMemberScope.this.n, classConstructorDescriptorQ);
                }
            }
            this.b.getComponents().getSyntheticPartsProvider().generateConstructors(LazyJavaClassMemberScope.this.getOwnerDescriptor(), arrayList);
            SignatureEnhancement signatureEnhancement = this.b.getComponents().getSignatureEnhancement();
            LazyJavaResolverContext lazyJavaResolverContext = this.b;
            LazyJavaClassMemberScope lazyJavaClassMemberScope = LazyJavaClassMemberScope.this;
            boolean zIsEmpty = arrayList.isEmpty();
            List listListOfNotNull = arrayList;
            if (zIsEmpty) {
                listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(lazyJavaClassMemberScope.p());
            }
            return CollectionsKt___CollectionsKt.toList(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext, listListOfNotNull));
        }
    }

    public static final class g extends Lambda implements Function0<Map<Name, ? extends JavaField>> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Map<Name, ? extends JavaField> getA() {
            Collection<JavaField> fields = LazyJavaClassMemberScope.this.n.getFields();
            ArrayList arrayList = new ArrayList();
            for (Object obj : fields) {
                if (((JavaField) obj).isEnumEntry()) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((JavaField) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    public static final class h extends Lambda implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        public final /* synthetic */ SimpleFunctionDescriptor a;
        public final /* synthetic */ LazyJavaClassMemberScope b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
            super(1);
            this.a = simpleFunctionDescriptor;
            this.b = lazyJavaClassMemberScope;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
            return Intrinsics.areEqual(this.a.getName(), name) ? kotlin.collections.e.listOf(this.a) : CollectionsKt___CollectionsKt.plus(this.b.R(name), (Iterable) this.b.S(name));
        }
    }

    public static final class i extends Lambda implements Function0<Set<? extends Name>> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Set<? extends Name> getA() {
            return CollectionsKt___CollectionsKt.toSet(LazyJavaClassMemberScope.this.n.getInnerClassNames());
        }
    }

    public static final class j extends Lambda implements Function1<Name, ClassDescriptorBase> {
        public final /* synthetic */ LazyJavaResolverContext b;

        public static final class a extends Lambda implements Function0<Set<? extends Name>> {
            public final /* synthetic */ LazyJavaClassMemberScope a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
                super(0);
                this.a = lazyJavaClassMemberScope;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Set<? extends Name> getA() {
                return z.plus((Set) this.a.getFunctionNames(), (Iterable) this.a.getVariableNames());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LazyJavaResolverContext lazyJavaResolverContext) {
            super(1);
            this.b = lazyJavaResolverContext;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClassDescriptorBase invoke(@NotNull Name name) {
            if (!((Set) LazyJavaClassMemberScope.this.q.getA()).contains(name)) {
                JavaField javaField = (JavaField) ((Map) LazyJavaClassMemberScope.this.r.getA()).get(name);
                if (javaField == null) {
                    return null;
                }
                return EnumEntrySyntheticClassDescriptor.create(this.b.getStorageManager(), LazyJavaClassMemberScope.this.getOwnerDescriptor(), name, this.b.getStorageManager().createLazyValue(new a(LazyJavaClassMemberScope.this)), LazyJavaAnnotationsKt.resolveAnnotations(this.b, javaField), this.b.getComponents().getSourceElementFactory().source(javaField));
            }
            JavaClass javaClassFindClass = this.b.getComponents().getFinder().findClass(new JavaClassFinder.Request(DescriptorUtilsKt.getClassId(LazyJavaClassMemberScope.this.getOwnerDescriptor()).createNestedClassId(name), null, LazyJavaClassMemberScope.this.n, 2, null));
            if (javaClassFindClass == null) {
                return null;
            }
            LazyJavaResolverContext lazyJavaResolverContext = this.b;
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, LazyJavaClassMemberScope.this.getOwnerDescriptor(), javaClassFindClass, null, 8, null);
            lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
    }

    public /* synthetic */ LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, classDescriptor, javaClass, z, (i2 & 16) != 0 ? null : lazyJavaClassMemberScope);
    }

    private final boolean A(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        return OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptor2, callableDescriptor, true).getResult() == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor2, callableDescriptor);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    private final boolean B(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        boolean z;
        List<Name> builtinFunctionNamesByJvmName = SpecialGenericSignatures.Companion.getBuiltinFunctionNamesByJvmName(simpleFunctionDescriptor.getName());
        if (!(builtinFunctionNamesByJvmName instanceof Collection) || !builtinFunctionNamesByJvmName.isEmpty()) {
            for (Name name : builtinFunctionNamesByJvmName) {
                Set<SimpleFunctionDescriptor> setI = I(name);
                ArrayList arrayList = new ArrayList();
                for (Object obj : setI) {
                    if (SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName((SimpleFunctionDescriptor) obj)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    z = false;
                    break;
                }
                SimpleFunctionDescriptor simpleFunctionDescriptorX = x(simpleFunctionDescriptor, name);
                if (arrayList.isEmpty()) {
                    z = false;
                    break;
                    break;
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                        break;
                    }
                    if (C((SimpleFunctionDescriptor) it2.next(), simpleFunctionDescriptorX)) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean C(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        if (BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor)) {
            functionDescriptor = functionDescriptor.getOriginal();
        }
        return A(functionDescriptor, simpleFunctionDescriptor);
    }

    private final boolean D(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        SimpleFunctionDescriptor simpleFunctionDescriptorY = y(simpleFunctionDescriptor);
        if (simpleFunctionDescriptorY == null) {
            return false;
        }
        Set<SimpleFunctionDescriptor> setI = I(simpleFunctionDescriptor.getName());
        if ((setI instanceof Collection) && setI.isEmpty()) {
            return false;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : setI) {
            if (simpleFunctionDescriptor2.isSuspend() && A(simpleFunctionDescriptorY, simpleFunctionDescriptor2)) {
                return true;
            }
        }
        return false;
    }

    private final SimpleFunctionDescriptor E(PropertyDescriptor propertyDescriptor, String str, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Iterator<T> it2 = function1.invoke(Name.identifier(str)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it2.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it2.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 0) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null ? false : kotlinTypeChecker.isSubtypeOf(returnType, propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final SimpleFunctionDescriptor F(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertyGetterDescriptor propertyGetterDescriptor = getter == null ? null : (PropertyGetterDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(getter);
        String builtinSpecialPropertyGetterName = propertyGetterDescriptor != null ? ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyGetterDescriptor) : null;
        return (builtinSpecialPropertyGetterName == null || SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(getOwnerDescriptor(), propertyGetterDescriptor)) ? E(propertyDescriptor, JvmAbi.getterName(propertyDescriptor.getName().asString()), function1) : E(propertyDescriptor, builtinSpecialPropertyGetterName, function1);
    }

    private final SimpleFunctionDescriptor G(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        Iterator<T> it2 = function1.invoke(Name.identifier(JvmAbi.setterName(propertyDescriptor.getName().asString()))).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it2.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it2.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && KotlinBuiltIns.isUnit(returnType) && KotlinTypeChecker.DEFAULT.equalTypes(((ValueParameterDescriptor) CollectionsKt.single((List) simpleFunctionDescriptor2.getValueParameters())).getType(), propertyDescriptor.getType())) {
                simpleFunctionDescriptor = simpleFunctionDescriptor2;
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final DescriptorVisibility H(ClassDescriptor classDescriptor) {
        DescriptorVisibility visibility = classDescriptor.getVisibility();
        return Intrinsics.areEqual(visibility, JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY) ? JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE : visibility;
    }

    private final Set<SimpleFunctionDescriptor> I(Name name) {
        Collection<KotlinType> collectionN = n();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it2 = collectionN.iterator();
        while (it2.hasNext()) {
            kotlin.collections.h.addAll(linkedHashSet, ((KotlinType) it2.next()).getMemberScope().getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    private final Set<PropertyDescriptor> J(Name name) {
        Collection<KotlinType> collectionN = n();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionN.iterator();
        while (it2.hasNext()) {
            Collection<? extends PropertyDescriptor> contributedVariables = ((KotlinType) it2.next()).getMemberScope().getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(contributedVariables, 10));
            Iterator<T> it3 = contributedVariables.iterator();
            while (it3.hasNext()) {
                arrayList2.add((PropertyDescriptor) it3.next());
            }
            kotlin.collections.h.addAll(arrayList, arrayList2);
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList);
    }

    private final boolean K(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        return Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 2, null), MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor.getOriginal(), false, false, 2, null)) && !A(simpleFunctionDescriptor, functionDescriptor);
    }

    private final boolean L(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        boolean z;
        boolean z2;
        List<Name> propertyNamesCandidatesByAccessorName = PropertiesConventionUtilKt.getPropertyNamesCandidatesByAccessorName(simpleFunctionDescriptor.getName());
        if (!(propertyNamesCandidatesByAccessorName instanceof Collection) || !propertyNamesCandidatesByAccessorName.isEmpty()) {
            Iterator<T> it2 = propertyNamesCandidatesByAccessorName.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                Set<PropertyDescriptor> setJ = J((Name) it2.next());
                if (!(setJ instanceof Collection) || !setJ.isEmpty()) {
                    Iterator<T> it3 = setJ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z = false;
                            break;
                        }
                        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) it3.next();
                        if (z(propertyDescriptor, new h(simpleFunctionDescriptor, this)) && (propertyDescriptor.isVar() || !JvmAbi.isSetterName(simpleFunctionDescriptor.getName().asString()))) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                    break;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        return (z2 || B(simpleFunctionDescriptor) || T(simpleFunctionDescriptor) || D(simpleFunctionDescriptor)) ? false : true;
    }

    private final SimpleFunctionDescriptor M(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptorS;
        FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor);
        if (overriddenBuiltinFunctionWithErasedValueParametersInJava == null || (simpleFunctionDescriptorS = s(overriddenBuiltinFunctionWithErasedValueParametersInJava, function1)) == null) {
            return null;
        }
        if (!L(simpleFunctionDescriptorS)) {
            simpleFunctionDescriptorS = null;
        }
        if (simpleFunctionDescriptorS == null) {
            return null;
        }
        return r(simpleFunctionDescriptorS, overriddenBuiltinFunctionWithErasedValueParametersInJava, collection);
    }

    private final SimpleFunctionDescriptor N(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1, Name name, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(simpleFunctionDescriptor);
        if (simpleFunctionDescriptor2 == null) {
            return null;
        }
        Iterator<? extends SimpleFunctionDescriptor> it2 = function1.invoke(Name.identifier(SpecialBuiltinMembers.getJvmMethodNameIfSpecial(simpleFunctionDescriptor2))).iterator();
        while (it2.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptorX = x(it2.next(), name);
            if (C(simpleFunctionDescriptor2, simpleFunctionDescriptorX)) {
                return r(simpleFunctionDescriptorX, simpleFunctionDescriptor2, collection);
            }
        }
        return null;
    }

    private final SimpleFunctionDescriptor O(SimpleFunctionDescriptor simpleFunctionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (!simpleFunctionDescriptor.isSuspend()) {
            return null;
        }
        Iterator<T> it2 = function1.invoke(simpleFunctionDescriptor.getName()).iterator();
        while (it2.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptorY = y((SimpleFunctionDescriptor) it2.next());
            if (simpleFunctionDescriptorY == null || !A(simpleFunctionDescriptorY, simpleFunctionDescriptor)) {
                simpleFunctionDescriptorY = null;
            }
            if (simpleFunctionDescriptorY != null) {
                return simpleFunctionDescriptorY;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JavaClassConstructorDescriptor P(JavaConstructor javaConstructor) {
        ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaConstructor), false, getC().getComponents().getSourceElementFactory().source(javaConstructor));
        LazyJavaResolverContext lazyJavaResolverContextChildForMethod = ContextKt.childForMethod(getC(), javaClassConstructorDescriptorCreateJavaConstructor, javaConstructor, ownerDescriptor.getDeclaredTypeParameters().size());
        LazyJavaScope.ResolvedValueParameters resolvedValueParametersResolveValueParameters = resolveValueParameters(lazyJavaResolverContextChildForMethod, javaClassConstructorDescriptorCreateJavaConstructor, javaConstructor.getValueParameters());
        List<TypeParameterDescriptor> declaredTypeParameters = ownerDescriptor.getDeclaredTypeParameters();
        List<JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10));
        Iterator<T> it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList.add(lazyJavaResolverContextChildForMethod.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it2.next()));
        }
        javaClassConstructorDescriptorCreateJavaConstructor.initialize(resolvedValueParametersResolveValueParameters.getDescriptors(), UtilsKt.toDescriptorVisibility(javaConstructor.getVisibility()), CollectionsKt___CollectionsKt.plus((Collection) declaredTypeParameters, (Iterable) arrayList));
        javaClassConstructorDescriptorCreateJavaConstructor.setHasStableParameterNames(false);
        javaClassConstructorDescriptorCreateJavaConstructor.setHasSynthesizedParameterNames(resolvedValueParametersResolveValueParameters.getHasSynthesizedNames());
        javaClassConstructorDescriptorCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        lazyJavaResolverContextChildForMethod.getComponents().getJavaResolverCache().recordConstructor(javaConstructor, javaClassConstructorDescriptorCreateJavaConstructor);
        return javaClassConstructorDescriptorCreateJavaConstructor;
    }

    private final JavaMethodDescriptor Q(JavaRecordComponent javaRecordComponent) {
        JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaRecordComponent), javaRecordComponent.getName(), getC().getComponents().getSourceElementFactory().source(javaRecordComponent), true);
        javaMethodDescriptorCreateJavaMethod.initialize(null, getDispatchReceiverParameter(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), getC().getTypeResolver().transformJavaType(javaRecordComponent.getType(), JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 2, null)), Modality.Companion.convertFromFlags(false, false, true), DescriptorVisibilities.PUBLIC, null);
        javaMethodDescriptorCreateJavaMethod.setParameterNamesStatus(false, false);
        getC().getComponents().getJavaResolverCache().recordMethod(javaRecordComponent, javaMethodDescriptorCreateJavaMethod);
        return javaMethodDescriptorCreateJavaMethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<SimpleFunctionDescriptor> R(Name name) {
        Collection<JavaMethod> collectionFindMethodsByName = getDeclaredMemberIndex().getA().findMethodsByName(name);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collectionFindMethodsByName, 10));
        Iterator<T> it2 = collectionFindMethodsByName.iterator();
        while (it2.hasNext()) {
            arrayList.add(resolveMethodToFunctionDescriptor((JavaMethod) it2.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<SimpleFunctionDescriptor> S(Name name) {
        Set<SimpleFunctionDescriptor> setI = I(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setI) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (!(SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(simpleFunctionDescriptor) || BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor) != null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean T(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        if (!BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(simpleFunctionDescriptor.getName())) {
            return false;
        }
        Set<SimpleFunctionDescriptor> setI = I(simpleFunctionDescriptor.getName());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = setI.iterator();
        while (it2.hasNext()) {
            FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((SimpleFunctionDescriptor) it2.next());
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                arrayList.add(overriddenBuiltinFunctionWithErasedValueParametersInJava);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (K(simpleFunctionDescriptor, (FunctionDescriptor) it3.next())) {
                return true;
            }
        }
        return false;
    }

    private final void i(List<ValueParameterDescriptor> list, ConstructorDescriptor constructorDescriptor, int i2, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        list.add(new ValueParameterDescriptorImpl(constructorDescriptor, null, i2, Annotations.Companion.getEMPTY(), javaMethod.getName(), TypeUtils.makeNotNullable(kotlinType), javaMethod.getHasAnnotationParameterDefaultValue(), false, false, kotlinType2 == null ? null : TypeUtils.makeNotNullable(kotlinType2), getC().getComponents().getSourceElementFactory().source(javaMethod)));
    }

    private final void j(Collection<SimpleFunctionDescriptor> collection, Name name, Collection<? extends SimpleFunctionDescriptor> collection2, boolean z) {
        Collection<? extends SimpleFunctionDescriptor> collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, collection2, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        if (!z) {
            collection.addAll(collectionResolveOverridesForNonStaticMembers);
            return;
        }
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) collection, (Iterable) collectionResolveOverridesForNonStaticMembers);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collectionResolveOverridesForNonStaticMembers, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptorR : collectionResolveOverridesForNonStaticMembers) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenSpecialBuiltin(simpleFunctionDescriptorR);
            if (simpleFunctionDescriptor != null) {
                simpleFunctionDescriptorR = r(simpleFunctionDescriptorR, simpleFunctionDescriptor, listPlus);
            }
            arrayList.add(simpleFunctionDescriptorR);
        }
        collection.addAll(arrayList);
    }

    private final void k(Name name, Collection<? extends SimpleFunctionDescriptor> collection, Collection<? extends SimpleFunctionDescriptor> collection2, Collection<SimpleFunctionDescriptor> collection3, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, N(simpleFunctionDescriptor, function1, name, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, M(simpleFunctionDescriptor, function1, collection));
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection3, O(simpleFunctionDescriptor, function1));
        }
    }

    private final void l(Set<? extends PropertyDescriptor> set, Collection<PropertyDescriptor> collection, Set<PropertyDescriptor> set2, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (PropertyDescriptor propertyDescriptor : set) {
            JavaPropertyDescriptor javaPropertyDescriptorT = t(propertyDescriptor, function1);
            if (javaPropertyDescriptorT != null) {
                collection.add(javaPropertyDescriptorT);
                if (set2 == null) {
                    return;
                }
                set2.add(propertyDescriptor);
                return;
            }
        }
    }

    private final void m(Name name, Collection<PropertyDescriptor> collection) {
        JavaMethod javaMethod = (JavaMethod) CollectionsKt.singleOrNull(getDeclaredMemberIndex().getA().findMethodsByName(name));
        if (javaMethod == null) {
            return;
        }
        collection.add(v(this, javaMethod, null, Modality.FINAL, 2, null));
    }

    private final Collection<KotlinType> n() {
        return this.o ? getOwnerDescriptor().getTypeConstructor().getSupertypes() : getC().getComponents().getKotlinTypeChecker().getKotlinTypeRefiner().refineSupertypes(getOwnerDescriptor());
    }

    private final List<ValueParameterDescriptor> o(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        Pair pair;
        Collection<JavaMethod> methods = this.n.getMethods();
        ArrayList arrayList = new ArrayList(methods.size());
        JavaTypeAttributes attributes$default = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, true, null, 2, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : methods) {
            if (Intrinsics.areEqual(((JavaMethod) obj).getName(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.component1();
        List<JavaMethod> list2 = (List) pair2.component2();
        list.size();
        JavaMethod javaMethod = (JavaMethod) CollectionsKt.firstOrNull(list);
        if (javaMethod != null) {
            JavaType returnType = javaMethod.getReturnType();
            if (returnType instanceof JavaArrayType) {
                JavaArrayType javaArrayType = (JavaArrayType) returnType;
                pair = new Pair(getC().getTypeResolver().transformArrayType(javaArrayType, attributes$default, true), getC().getTypeResolver().transformJavaType(javaArrayType.getComponentType(), attributes$default));
            } else {
                pair = new Pair(getC().getTypeResolver().transformJavaType(returnType, attributes$default), null);
            }
            i(arrayList, classConstructorDescriptorImpl, 0, javaMethod, (KotlinType) pair.component1(), (KotlinType) pair.component2());
        }
        int i2 = 0;
        int i3 = javaMethod == null ? 0 : 1;
        for (JavaMethod javaMethod2 : list2) {
            i(arrayList, classConstructorDescriptorImpl, i2 + i3, javaMethod2, getC().getTypeResolver().transformJavaType(javaMethod2.getReturnType(), attributes$default), null);
            i2++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassConstructorDescriptor p() {
        boolean zIsAnnotationType = this.n.isAnnotationType();
        if ((this.n.isInterface() || !this.n.hasDefaultConstructor()) && !zIsAnnotationType) {
            return null;
        }
        ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, Annotations.Companion.getEMPTY(), true, getC().getComponents().getSourceElementFactory().source(this.n));
        List<ValueParameterDescriptor> listO = zIsAnnotationType ? o(javaClassConstructorDescriptorCreateJavaConstructor) : Collections.emptyList();
        javaClassConstructorDescriptorCreateJavaConstructor.setHasSynthesizedParameterNames(false);
        javaClassConstructorDescriptorCreateJavaConstructor.initialize(listO, H(ownerDescriptor));
        javaClassConstructorDescriptorCreateJavaConstructor.setHasStableParameterNames(true);
        javaClassConstructorDescriptorCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        getC().getComponents().getJavaResolverCache().recordConstructor(this.n, javaClassConstructorDescriptorCreateJavaConstructor);
        return javaClassConstructorDescriptorCreateJavaConstructor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassConstructorDescriptor q() {
        ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, Annotations.Companion.getEMPTY(), true, getC().getComponents().getSourceElementFactory().source(this.n));
        List<ValueParameterDescriptor> listW = w(javaClassConstructorDescriptorCreateJavaConstructor);
        javaClassConstructorDescriptorCreateJavaConstructor.setHasSynthesizedParameterNames(false);
        javaClassConstructorDescriptorCreateJavaConstructor.initialize(listW, H(ownerDescriptor));
        javaClassConstructorDescriptorCreateJavaConstructor.setHasStableParameterNames(false);
        javaClassConstructorDescriptorCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        return javaClassConstructorDescriptorCreateJavaConstructor;
    }

    private final SimpleFunctionDescriptor r(SimpleFunctionDescriptor simpleFunctionDescriptor, CallableDescriptor callableDescriptor, Collection<? extends SimpleFunctionDescriptor> collection) {
        boolean z = false;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            z = true;
        } else {
            for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : collection) {
                if (!Intrinsics.areEqual(simpleFunctionDescriptor, simpleFunctionDescriptor2) && simpleFunctionDescriptor2.getInitialSignatureDescriptor() == null && A(simpleFunctionDescriptor2, callableDescriptor)) {
                }
            }
            z = true;
        }
        return z ? simpleFunctionDescriptor : (SimpleFunctionDescriptor) simpleFunctionDescriptor.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
    }

    private final SimpleFunctionDescriptor s(FunctionDescriptor functionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        Object next;
        Iterator<T> it2 = function1.invoke(functionDescriptor.getName()).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!K((SimpleFunctionDescriptor) next, functionDescriptor));
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) next;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(valueParameters, 10));
        for (ValueParameterDescriptor valueParameterDescriptor : valueParameters) {
            arrayList.add(new ValueParameterData(valueParameterDescriptor.getType(), valueParameterDescriptor.declaresDefaultValue()));
        }
        copyBuilderNewCopyBuilder.setValueParameters(UtilKt.copyValueParameters(arrayList, simpleFunctionDescriptor.getValueParameters(), functionDescriptor));
        copyBuilderNewCopyBuilder.setSignatureChange();
        copyBuilderNewCopyBuilder.setPreserveSourceElement();
        return (SimpleFunctionDescriptor) copyBuilderNewCopyBuilder.build();
    }

    private final JavaPropertyDescriptor t(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        PropertySetterDescriptorImpl propertySetterDescriptorImplCreateSetter = null;
        if (!z(propertyDescriptor, function1)) {
            return null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorF = F(propertyDescriptor, function1);
        SimpleFunctionDescriptor simpleFunctionDescriptorG = propertyDescriptor.isVar() ? G(propertyDescriptor, function1) : null;
        if (simpleFunctionDescriptorG != null) {
            simpleFunctionDescriptorG.getModality();
            simpleFunctionDescriptorF.getModality();
        }
        JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = new JavaForKotlinOverridePropertyDescriptor(getOwnerDescriptor(), simpleFunctionDescriptorF, simpleFunctionDescriptorG, propertyDescriptor);
        javaForKotlinOverridePropertyDescriptor.setType(simpleFunctionDescriptorF.getReturnType(), CollectionsKt__CollectionsKt.emptyList(), getDispatchReceiverParameter(), null);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateGetter = DescriptorFactory.createGetter(javaForKotlinOverridePropertyDescriptor, simpleFunctionDescriptorF.getAnnotations(), false, false, false, simpleFunctionDescriptorF.getSource());
        propertyGetterDescriptorImplCreateGetter.setInitialSignatureDescriptor(simpleFunctionDescriptorF);
        propertyGetterDescriptorImplCreateGetter.initialize(javaForKotlinOverridePropertyDescriptor.getType());
        if (simpleFunctionDescriptorG != null) {
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.firstOrNull((List) simpleFunctionDescriptorG.getValueParameters());
            if (valueParameterDescriptor == null) {
                throw new AssertionError(Intrinsics.stringPlus("No parameter found for ", simpleFunctionDescriptorG));
            }
            propertySetterDescriptorImplCreateSetter = DescriptorFactory.createSetter(javaForKotlinOverridePropertyDescriptor, simpleFunctionDescriptorG.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptorG.getVisibility(), simpleFunctionDescriptorG.getSource());
            propertySetterDescriptorImplCreateSetter.setInitialSignatureDescriptor(simpleFunctionDescriptorG);
        }
        javaForKotlinOverridePropertyDescriptor.initialize(propertyGetterDescriptorImplCreateGetter, propertySetterDescriptorImplCreateSetter);
        return javaForKotlinOverridePropertyDescriptor;
    }

    private final JavaPropertyDescriptor u(JavaMethod javaMethod, KotlinType kotlinType, Modality modality) {
        JavaPropertyDescriptor javaPropertyDescriptorCreate = JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaMethod), modality, UtilsKt.toDescriptorVisibility(javaMethod.getVisibility()), false, javaMethod.getName(), getC().getComponents().getSourceElementFactory().source(javaMethod), false);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(javaPropertyDescriptorCreate, Annotations.Companion.getEMPTY());
        javaPropertyDescriptorCreate.initialize(propertyGetterDescriptorImplCreateDefaultGetter, null);
        KotlinType kotlinTypeComputeMethodReturnType = kotlinType == null ? computeMethodReturnType(javaMethod, ContextKt.childForMethod$default(getC(), javaPropertyDescriptorCreate, javaMethod, 0, 4, null)) : kotlinType;
        javaPropertyDescriptorCreate.setType(kotlinTypeComputeMethodReturnType, CollectionsKt__CollectionsKt.emptyList(), getDispatchReceiverParameter(), null);
        propertyGetterDescriptorImplCreateDefaultGetter.initialize(kotlinTypeComputeMethodReturnType);
        return javaPropertyDescriptorCreate;
    }

    public static /* synthetic */ JavaPropertyDescriptor v(LazyJavaClassMemberScope lazyJavaClassMemberScope, JavaMethod javaMethod, KotlinType kotlinType, Modality modality, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            kotlinType = null;
        }
        return lazyJavaClassMemberScope.u(javaMethod, kotlinType, modality);
    }

    private final List<ValueParameterDescriptor> w(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        Collection<JavaRecordComponent> recordComponents = this.n.getRecordComponents();
        ArrayList arrayList = new ArrayList(recordComponents.size());
        KotlinType kotlinType = null;
        JavaTypeAttributes attributes$default = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 2, null);
        int i2 = 0;
        for (JavaRecordComponent javaRecordComponent : recordComponents) {
            int i3 = i2 + 1;
            KotlinType kotlinTypeTransformJavaType = getC().getTypeResolver().transformJavaType(javaRecordComponent.getType(), attributes$default);
            arrayList.add(new ValueParameterDescriptorImpl(classConstructorDescriptorImpl, null, i2, Annotations.Companion.getEMPTY(), javaRecordComponent.getName(), kotlinTypeTransformJavaType, false, false, false, javaRecordComponent.isVararg() ? getC().getComponents().getModule().getBuiltIns().getArrayElementType(kotlinTypeTransformJavaType) : kotlinType, getC().getComponents().getSourceElementFactory().source(javaRecordComponent)));
            i2 = i3;
            kotlinType = null;
        }
        return arrayList;
    }

    private final SimpleFunctionDescriptor x(SimpleFunctionDescriptor simpleFunctionDescriptor, Name name) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        copyBuilderNewCopyBuilder.setName(name);
        copyBuilderNewCopyBuilder.setSignatureChange();
        copyBuilderNewCopyBuilder.setPreserveSourceElement();
        return (SimpleFunctionDescriptor) copyBuilderNewCopyBuilder.build();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    private final SimpleFunctionDescriptor y(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FqNameUnsafe fqNameUnsafe;
        FqName safe;
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.lastOrNull((List) simpleFunctionDescriptor.getValueParameters());
        if (valueParameterDescriptor != null) {
            ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = valueParameterDescriptor.getType().getConstructor().mo4298getDeclarationDescriptor();
            if (classifierDescriptorMo4298getDeclarationDescriptor == null || (fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptorMo4298getDeclarationDescriptor)) == null) {
                safe = null;
            } else {
                if (!fqNameUnsafe.isSafe()) {
                    fqNameUnsafe = null;
                }
                if (fqNameUnsafe == null) {
                    safe = null;
                } else {
                    safe = fqNameUnsafe.toSafe();
                }
            }
            if (!SuspendFunctionTypesKt.isContinuation(safe, getC().getComponents().getSettings().isReleaseCoroutines())) {
                valueParameterDescriptor = null;
            }
        } else {
            valueParameterDescriptor = null;
        }
        if (valueParameterDescriptor == null) {
            return null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) simpleFunctionDescriptor.newCopyBuilder().setValueParameters(CollectionsKt___CollectionsKt.dropLast(simpleFunctionDescriptor.getValueParameters(), 1)).setReturnType(valueParameterDescriptor.getType().getArguments().get(0).getType()).build();
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl = (SimpleFunctionDescriptorImpl) simpleFunctionDescriptor2;
        if (simpleFunctionDescriptorImpl != null) {
            simpleFunctionDescriptorImpl.setSuspend(true);
        }
        return simpleFunctionDescriptor2;
    }

    private final boolean z(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorF = F(propertyDescriptor, function1);
        SimpleFunctionDescriptor simpleFunctionDescriptorG = G(propertyDescriptor, function1);
        if (simpleFunctionDescriptorF == null) {
            return false;
        }
        if (propertyDescriptor.isVar()) {
            return simpleFunctionDescriptorG != null && simpleFunctionDescriptorG.getModality() == simpleFunctionDescriptorF.getModality();
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        return z.plus((Set) this.q.getA(), (Iterable) this.r.getA().keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public /* bridge */ /* synthetic */ Set computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        return computeFunctionNames(descriptorKindFilter, (Function1<? super Name, Boolean>) function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeImplicitlyDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        if (this.n.isRecord() && getDeclaredMemberIndex().getA().findRecordComponentByName(name) != null) {
            boolean z = true;
            if (!collection.isEmpty()) {
                Iterator<T> it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (((SimpleFunctionDescriptor) it2.next()).getValueParameters().isEmpty()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                collection.add(Q(getDeclaredMemberIndex().getA().findRecordComponentByName(name)));
            }
        }
        getC().getComponents().getSyntheticPartsProvider().generateMethods(getOwnerDescriptor(), name, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        boolean z;
        Set<SimpleFunctionDescriptor> setI = I(name);
        if (!SpecialGenericSignatures.Companion.getSameAsRenamedInJvmBuiltin(name) && !BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            if (!(setI instanceof Collection) || !setI.isEmpty()) {
                Iterator<T> it2 = setI.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((FunctionDescriptor) it2.next()).isSuspend()) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : setI) {
                    if (L((SimpleFunctionDescriptor) obj)) {
                        arrayList.add(obj);
                    }
                }
                j(collection, name, arrayList, false);
                return;
            }
        }
        SmartSet smartSetCreate = SmartSet.Companion.create();
        Collection<? extends SimpleFunctionDescriptor> collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, setI, CollectionsKt__CollectionsKt.emptyList(), getOwnerDescriptor(), ErrorReporter.DO_NOTHING, getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        k(name, collection, collectionResolveOverridesForNonStaticMembers, collection, new b(this));
        k(name, collection, collectionResolveOverridesForNonStaticMembers, smartSetCreate, new c(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setI) {
            if (L((SimpleFunctionDescriptor) obj2)) {
                arrayList2.add(obj2);
            }
        }
        j(collection, name, CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) smartSetCreate), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        if (this.n.isAnnotationType()) {
            m(name, collection);
        }
        Set<PropertyDescriptor> setJ = J(name);
        if (setJ.isEmpty()) {
            return;
        }
        SmartSet.Companion companion = SmartSet.Companion;
        SmartSet smartSetCreate = companion.create();
        SmartSet smartSetCreate2 = companion.create();
        l(setJ, collection, smartSetCreate, new d());
        l(z.minus((Set) setJ, (Iterable) smartSetCreate), smartSetCreate2, null, new e());
        collection.addAll(DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, z.plus((Set) setJ, (Iterable) smartSetCreate2), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        if (this.n.isAnnotationType()) {
            return getFunctionNames();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(getDeclaredMemberIndex().getA().getFieldNames());
        Iterator<T> it2 = getOwnerDescriptor().getTypeConstructor().getSupertypes().iterator();
        while (it2.hasNext()) {
            kotlin.collections.h.addAll(linkedHashSet, ((KotlinType) it2.next()).getMemberScope().getVariableNames());
        }
        return linkedHashSet;
    }

    @NotNull
    public final NotNullLazyValue<List<ClassConstructorDescriptor>> getConstructors$descriptors_jvm() {
        return this.p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo4299getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        recordLookup(name, lookupLocation);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) getMainScope();
        ClassDescriptorBase classDescriptorBaseInvoke = lazyJavaClassMemberScope == null ? null : lazyJavaClassMemberScope.s.invoke(name);
        return classDescriptorBaseInvoke == null ? this.s.invoke(name) : classDescriptorBaseInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        recordLookup(name, lookupLocation);
        return super.getContributedFunctions(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        recordLookup(name, lookupLocation);
        return super.getContributedVariables(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return DescriptorUtils.getDispatchReceiverParameterIfNeeded(getOwnerDescriptor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public boolean isVisibleAsFunction(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        if (this.n.isAnnotationType()) {
            return false;
        }
        return L(javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public void recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, getOwnerDescriptor(), name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public LazyJavaScope.MethodSignatureData resolveMethodSignature(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2) {
        SignaturePropagator.PropagatedSignature propagatedSignatureResolvePropagatedSignature = getC().getComponents().getSignaturePropagator().resolvePropagatedSignature(javaMethod, getOwnerDescriptor(), kotlinType, null, list2, list);
        return new LazyJavaScope.MethodSignatureData(propagatedSignatureResolvePropagatedSignature.getReturnType(), propagatedSignatureResolvePropagatedSignature.getReceiverType(), propagatedSignatureResolvePropagatedSignature.getValueParameters(), propagatedSignatureResolvePropagatedSignature.getTypeParameters(), propagatedSignatureResolvePropagatedSignature.hasStableParameterNames(), propagatedSignatureResolvePropagatedSignature.getErrors());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public String toString() {
        return Intrinsics.stringPlus("Lazy Java member scope for ", this.n.getFqName());
    }

    public LazyJavaClassMemberScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull JavaClass javaClass, boolean z, @Nullable LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(lazyJavaResolverContext, lazyJavaClassMemberScope);
        this.m = classDescriptor;
        this.n = javaClass;
        this.o = z;
        this.p = lazyJavaResolverContext.getStorageManager().createLazyValue(new f(lazyJavaResolverContext));
        this.q = lazyJavaResolverContext.getStorageManager().createLazyValue(new i());
        this.r = lazyJavaResolverContext.getStorageManager().createLazyValue(new g());
        this.s = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new j(lazyJavaResolverContext));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public LinkedHashSet<Name> computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Collection<KotlinType> supertypes = getOwnerDescriptor().getTypeConstructor().getSupertypes();
        LinkedHashSet<Name> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it2 = supertypes.iterator();
        while (it2.hasNext()) {
            kotlin.collections.h.addAll(linkedHashSet, ((KotlinType) it2.next()).getMemberScope().getFunctionNames());
        }
        linkedHashSet.addAll(getDeclaredMemberIndex().getA().getMethodNames());
        linkedHashSet.addAll(getDeclaredMemberIndex().getA().getRecordComponentNames());
        linkedHashSet.addAll(computeClassNames(descriptorKindFilter, function1));
        linkedHashSet.addAll(getC().getComponents().getSyntheticPartsProvider().getMethodNames(getOwnerDescriptor()));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.n, a.a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public ClassDescriptor getOwnerDescriptor() {
        return this.m;
    }
}
