package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class LazyJavaScope extends MemberScopeImpl {
    public static final /* synthetic */ KProperty<Object>[] l = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    @NotNull
    private final LazyJavaResolverContext a;

    @Nullable
    private final LazyJavaScope b;

    @NotNull
    private final NotNullLazyValue<Collection<DeclarationDescriptor>> c;

    @NotNull
    private final NotNullLazyValue<DeclaredMemberIndex> d;

    @NotNull
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> e;

    @NotNull
    private final MemoizedFunctionToNullable<Name, PropertyDescriptor> f;

    @NotNull
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> g;

    @NotNull
    private final NotNullLazyValue h;

    @NotNull
    private final NotNullLazyValue i;

    @NotNull
    private final NotNullLazyValue j;

    @NotNull
    private final MemoizedFunctionToNotNull<Name, List<PropertyDescriptor>> k;

    public static final class MethodSignatureData {

        @NotNull
        private final KotlinType a;

        @Nullable
        private final KotlinType b;

        @NotNull
        private final List<ValueParameterDescriptor> c;

        @NotNull
        private final List<TypeParameterDescriptor> d;
        private final boolean e;

        @NotNull
        private final List<String> f;

        /* JADX WARN: Multi-variable type inference failed */
        public MethodSignatureData(@NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<? extends ValueParameterDescriptor> list, @NotNull List<? extends TypeParameterDescriptor> list2, boolean z, @NotNull List<String> list3) {
            this.a = kotlinType;
            this.b = kotlinType2;
            this.c = list;
            this.d = list2;
            this.e = z;
            this.f = list3;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
            return Intrinsics.areEqual(this.a, methodSignatureData.a) && Intrinsics.areEqual(this.b, methodSignatureData.b) && Intrinsics.areEqual(this.c, methodSignatureData.c) && Intrinsics.areEqual(this.d, methodSignatureData.d) && this.e == methodSignatureData.e && Intrinsics.areEqual(this.f, methodSignatureData.f);
        }

        @NotNull
        public final List<String> getErrors() {
            return this.f;
        }

        public final boolean getHasStableParameterNames() {
            return this.e;
        }

        @Nullable
        public final KotlinType getReceiverType() {
            return this.b;
        }

        @NotNull
        public final KotlinType getReturnType() {
            return this.a;
        }

        @NotNull
        public final List<TypeParameterDescriptor> getTypeParameters() {
            return this.d;
        }

        @NotNull
        public final List<ValueParameterDescriptor> getValueParameters() {
            return this.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v9, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v8, types: [int] */
        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            KotlinType kotlinType = this.b;
            int iHashCode2 = (((((iHashCode + (kotlinType == null ? 0 : kotlinType.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
            boolean z = this.e;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return ((iHashCode2 + r1) * 31) + this.f.hashCode();
        }

        @NotNull
        public String toString() {
            return "MethodSignatureData(returnType=" + this.a + ", receiverType=" + this.b + ", valueParameters=" + this.c + ", typeParameters=" + this.d + ", hasStableParameterNames=" + this.e + ", errors=" + this.f + ')';
        }
    }

    public static final class ResolvedValueParameters {

        @NotNull
        private final List<ValueParameterDescriptor> a;
        private final boolean b;

        /* JADX WARN: Multi-variable type inference failed */
        public ResolvedValueParameters(@NotNull List<? extends ValueParameterDescriptor> list, boolean z) {
            this.a = list;
            this.b = z;
        }

        @NotNull
        public final List<ValueParameterDescriptor> getDescriptors() {
            return this.a;
        }

        public final boolean getHasSynthesizedNames() {
            return this.b;
        }
    }

    public static final class a extends Lambda implements Function0<Collection<? extends DeclarationDescriptor>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<DeclarationDescriptor> invoke() {
            return LazyJavaScope.this.computeDescriptors(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER());
        }
    }

    public static final class b extends Lambda implements Function0<Set<? extends Name>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends Name> invoke() {
            return LazyJavaScope.this.computeClassNames(DescriptorKindFilter.CLASSIFIERS, null);
        }
    }

    public static final class c extends Lambda implements Function1<Name, PropertyDescriptor> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PropertyDescriptor invoke(@NotNull Name name) {
            if (LazyJavaScope.this.getMainScope() != null) {
                return (PropertyDescriptor) LazyJavaScope.this.getMainScope().f.invoke(name);
            }
            JavaField javaFieldFindFieldByName = LazyJavaScope.this.getDeclaredMemberIndex().invoke().findFieldByName(name);
            if (javaFieldFindFieldByName == null || javaFieldFindFieldByName.isEnumEntry()) {
                return null;
            }
            return LazyJavaScope.this.g(javaFieldFindFieldByName);
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
            if (LazyJavaScope.this.getMainScope() != null) {
                return (Collection) LazyJavaScope.this.getMainScope().e.invoke(name);
            }
            ArrayList arrayList = new ArrayList();
            for (JavaMethod javaMethod : LazyJavaScope.this.getDeclaredMemberIndex().invoke().findMethodsByName(name)) {
                JavaMethodDescriptor javaMethodDescriptorResolveMethodToFunctionDescriptor = LazyJavaScope.this.resolveMethodToFunctionDescriptor(javaMethod);
                if (LazyJavaScope.this.isVisibleAsFunction(javaMethodDescriptorResolveMethodToFunctionDescriptor)) {
                    LazyJavaScope.this.getC().getComponents().getJavaResolverCache().recordMethod(javaMethod, javaMethodDescriptorResolveMethodToFunctionDescriptor);
                    arrayList.add(javaMethodDescriptorResolveMethodToFunctionDescriptor);
                }
            }
            LazyJavaScope.this.computeImplicitlyDeclaredFunctions(arrayList, name);
            return arrayList;
        }
    }

    public static final class e extends Lambda implements Function0<DeclaredMemberIndex> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeclaredMemberIndex invoke() {
            return LazyJavaScope.this.computeMemberIndex();
        }
    }

    public static final class f extends Lambda implements Function0<Set<? extends Name>> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends Name> invoke() {
            return LazyJavaScope.this.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
        }
    }

    public static final class g extends Lambda implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) LazyJavaScope.this.e.invoke(name));
            LazyJavaScope.this.h(linkedHashSet);
            LazyJavaScope.this.computeNonDeclaredFunctions(linkedHashSet, name);
            return CollectionsKt___CollectionsKt.toList(LazyJavaScope.this.getC().getComponents().getSignatureEnhancement().enhanceSignatures(LazyJavaScope.this.getC(), linkedHashSet));
        }
    }

    public static final class h extends Lambda implements Function1<Name, List<? extends PropertyDescriptor>> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<PropertyDescriptor> invoke(@NotNull Name name) {
            ArrayList arrayList = new ArrayList();
            CollectionsKt.addIfNotNull(arrayList, LazyJavaScope.this.f.invoke(name));
            LazyJavaScope.this.computeNonDeclaredProperties(name, arrayList);
            return DescriptorUtils.isAnnotationClass(LazyJavaScope.this.getOwnerDescriptor()) ? CollectionsKt___CollectionsKt.toList(arrayList) : CollectionsKt___CollectionsKt.toList(LazyJavaScope.this.getC().getComponents().getSignatureEnhancement().enhanceSignatures(LazyJavaScope.this.getC(), arrayList));
        }
    }

    public static final class i extends Lambda implements Function0<Set<? extends Name>> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends Name> invoke() {
            return LazyJavaScope.this.computePropertyNames(DescriptorKindFilter.VARIABLES, null);
        }
    }

    public static final class j extends Lambda implements Function0<ConstantValue<?>> {
        public final /* synthetic */ JavaField b;
        public final /* synthetic */ PropertyDescriptorImpl c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(JavaField javaField, PropertyDescriptorImpl propertyDescriptorImpl) {
            super(0);
            this.b = javaField;
            this.c = propertyDescriptorImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConstantValue<?> invoke() {
            return LazyJavaScope.this.getC().getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(this.b, this.c);
        }
    }

    public static final class k extends Lambda implements Function1<SimpleFunctionDescriptor, CallableDescriptor> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CallableDescriptor invoke(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
            return simpleFunctionDescriptor;
        }
    }

    public /* synthetic */ LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaScope lazyJavaScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, (i2 & 2) != 0 ? null : lazyJavaScope);
    }

    private final PropertyDescriptorImpl a(JavaField javaField) {
        return JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(this.a, javaField), Modality.FINAL, UtilsKt.toDescriptorVisibility(javaField.getVisibility()), !javaField.isFinal(), javaField.getName(), this.a.getComponents().getSourceElementFactory().source(javaField), f(javaField));
    }

    private final Set<Name> b() {
        return (Set) StorageKt.getValue(this.j, this, (KProperty<?>) l[2]);
    }

    private final Set<Name> c() {
        return (Set) StorageKt.getValue(this.h, this, (KProperty<?>) l[0]);
    }

    private final Set<Name> d() {
        return (Set) StorageKt.getValue(this.i, this, (KProperty<?>) l[1]);
    }

    private final KotlinType e(JavaField javaField) {
        boolean z = false;
        KotlinType kotlinTypeTransformJavaType = this.a.getTypeResolver().transformJavaType(javaField.getType(), JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null));
        if ((KotlinBuiltIns.isPrimitiveType(kotlinTypeTransformJavaType) || KotlinBuiltIns.isString(kotlinTypeTransformJavaType)) && f(javaField) && javaField.getHasConstantNotNullInitializer()) {
            z = true;
        }
        return z ? TypeUtils.makeNotNullable(kotlinTypeTransformJavaType) : kotlinTypeTransformJavaType;
    }

    private final boolean f(JavaField javaField) {
        return javaField.isFinal() && javaField.isStatic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PropertyDescriptor g(JavaField javaField) {
        PropertyDescriptorImpl propertyDescriptorImplA = a(javaField);
        propertyDescriptorImplA.initialize(null, null, null, null);
        propertyDescriptorImplA.setType(e(javaField), CollectionsKt__CollectionsKt.emptyList(), getDispatchReceiverParameter(), null);
        if (DescriptorUtils.shouldRecordInitializerForProperty(propertyDescriptorImplA, propertyDescriptorImplA.getType())) {
            propertyDescriptorImplA.setCompileTimeInitializer(this.a.getStorageManager().createNullableLazyValue(new j(javaField, propertyDescriptorImplA)));
        }
        this.a.getComponents().getJavaResolverCache().recordField(javaField, propertyDescriptorImplA);
        return propertyDescriptorImplA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Set<SimpleFunctionDescriptor> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strComputeJvmDescriptor$default);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strComputeJvmDescriptor$default, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection<? extends SimpleFunctionDescriptor> collectionSelectMostSpecificInEachOverridableGroup = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list, k.a);
                set.removeAll(list);
                set.addAll(collectionSelectMostSpecificInEachOverridableGroup);
            }
        }
    }

    @NotNull
    public abstract Set<Name> computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @NotNull
    public final List<DeclarationDescriptor> computeDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
            for (Name name : computeClassNames(descriptorKindFilter, function1)) {
                if (function1.invoke(name).booleanValue()) {
                    CollectionsKt.addIfNotNull(linkedHashSet, mo4299getContributedClassifier(name, noLookupLocation));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name2 : computeFunctionNames(descriptorKindFilter, function1)) {
                if (function1.invoke(name2).booleanValue()) {
                    linkedHashSet.addAll(getContributedFunctions(name2, noLookupLocation));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !descriptorKindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name3 : computePropertyNames(descriptorKindFilter, function1)) {
                if (function1.invoke(name3).booleanValue()) {
                    linkedHashSet.addAll(getContributedVariables(name3, noLookupLocation));
                }
            }
        }
        return CollectionsKt___CollectionsKt.toList(linkedHashSet);
    }

    @NotNull
    public abstract Set<Name> computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    public void computeImplicitlyDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
    }

    @NotNull
    public abstract DeclaredMemberIndex computeMemberIndex();

    @NotNull
    public final KotlinType computeMethodReturnType(@NotNull JavaMethod javaMethod, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        return lazyJavaResolverContext.getTypeResolver().transformJavaType(javaMethod.getReturnType(), JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, javaMethod.getContainingClass().isAnnotationType(), null, 2, null));
    }

    public abstract void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name);

    public abstract void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection);

    @NotNull
    public abstract Set<Name> computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @NotNull
    public final NotNullLazyValue<Collection<DeclarationDescriptor>> getAllDescriptors() {
        return this.c;
    }

    @NotNull
    public final LazyJavaResolverContext getC() {
        return this.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getClassifierNames() {
        return b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        return this.c.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        return !getFunctionNames().contains(name) ? CollectionsKt__CollectionsKt.emptyList() : this.g.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        return !getVariableNames().contains(name) ? CollectionsKt__CollectionsKt.emptyList() : this.k.invoke(name);
    }

    @NotNull
    public final NotNullLazyValue<DeclaredMemberIndex> getDeclaredMemberIndex() {
        return this.d;
    }

    @Nullable
    public abstract ReceiverParameterDescriptor getDispatchReceiverParameter();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return c();
    }

    @Nullable
    public final LazyJavaScope getMainScope() {
        return this.b;
    }

    @NotNull
    public abstract DeclarationDescriptor getOwnerDescriptor();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return d();
    }

    public boolean isVisibleAsFunction(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        return true;
    }

    @NotNull
    public abstract MethodSignatureData resolveMethodSignature(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2);

    @NotNull
    public final JavaMethodDescriptor resolveMethodToFunctionDescriptor(@NotNull JavaMethod javaMethod) {
        JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(this.a, javaMethod), javaMethod.getName(), this.a.getComponents().getSourceElementFactory().source(javaMethod), this.d.invoke().findRecordComponentByName(javaMethod.getName()) != null && javaMethod.getValueParameters().isEmpty());
        LazyJavaResolverContext lazyJavaResolverContextChildForMethod$default = ContextKt.childForMethod$default(this.a, javaMethodDescriptorCreateJavaMethod, javaMethod, 0, 4, null);
        List<JavaTypeParameter> typeParameters = javaMethod.getTypeParameters();
        List<? extends TypeParameterDescriptor> arrayList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10));
        Iterator<T> it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList.add(lazyJavaResolverContextChildForMethod$default.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it2.next()));
        }
        ResolvedValueParameters resolvedValueParametersResolveValueParameters = resolveValueParameters(lazyJavaResolverContextChildForMethod$default, javaMethodDescriptorCreateJavaMethod, javaMethod.getValueParameters());
        MethodSignatureData methodSignatureDataResolveMethodSignature = resolveMethodSignature(javaMethod, arrayList, computeMethodReturnType(javaMethod, lazyJavaResolverContextChildForMethod$default), resolvedValueParametersResolveValueParameters.getDescriptors());
        KotlinType receiverType = methodSignatureDataResolveMethodSignature.getReceiverType();
        javaMethodDescriptorCreateJavaMethod.initialize(receiverType == null ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(javaMethodDescriptorCreateJavaMethod, receiverType, Annotations.Companion.getEMPTY()), getDispatchReceiverParameter(), methodSignatureDataResolveMethodSignature.getTypeParameters(), methodSignatureDataResolveMethodSignature.getValueParameters(), methodSignatureDataResolveMethodSignature.getReturnType(), Modality.Companion.convertFromFlags(false, javaMethod.isAbstract(), !javaMethod.isFinal()), UtilsKt.toDescriptorVisibility(javaMethod.getVisibility()), methodSignatureDataResolveMethodSignature.getReceiverType() != null ? q.mapOf(TuplesKt.to(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, kotlin.collections.CollectionsKt.first((List) resolvedValueParametersResolveValueParameters.getDescriptors()))) : r.emptyMap());
        javaMethodDescriptorCreateJavaMethod.setParameterNamesStatus(methodSignatureDataResolveMethodSignature.getHasStableParameterNames(), resolvedValueParametersResolveValueParameters.getHasSynthesizedNames());
        if (!methodSignatureDataResolveMethodSignature.getErrors().isEmpty()) {
            lazyJavaResolverContextChildForMethod$default.getComponents().getSignaturePropagator().reportSignatureErrors(javaMethodDescriptorCreateJavaMethod, methodSignatureDataResolveMethodSignature.getErrors());
        }
        return javaMethodDescriptorCreateJavaMethod;
    }

    @NotNull
    public final ResolvedValueParameters resolveValueParameters(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull FunctionDescriptor functionDescriptor, @NotNull List<? extends JavaValueParameter> list) {
        Pair pair;
        Name name;
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt___CollectionsKt.withIndex(list);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10));
        boolean z = false;
        boolean z2 = false;
        for (IndexedValue indexedValue : iterableWithIndex) {
            int iComponent1 = indexedValue.component1();
            JavaValueParameter javaValueParameter = (JavaValueParameter) indexedValue.component2();
            Annotations annotationsResolveAnnotations = LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaValueParameter);
            JavaTypeAttributes attributes$default = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, z, null, 3, null);
            if (javaValueParameter.isVararg()) {
                JavaType type = javaValueParameter.getType();
                JavaArrayType javaArrayType = type instanceof JavaArrayType ? (JavaArrayType) type : null;
                if (javaArrayType == null) {
                    throw new AssertionError(Intrinsics.stringPlus("Vararg parameter should be an array: ", javaValueParameter));
                }
                KotlinType kotlinTypeTransformArrayType = lazyJavaResolverContext.getTypeResolver().transformArrayType(javaArrayType, attributes$default, true);
                pair = TuplesKt.to(kotlinTypeTransformArrayType, lazyJavaResolverContext.getModule().getBuiltIns().getArrayElementType(kotlinTypeTransformArrayType));
            } else {
                pair = TuplesKt.to(lazyJavaResolverContext.getTypeResolver().transformJavaType(javaValueParameter.getType(), attributes$default), null);
            }
            KotlinType kotlinType = (KotlinType) pair.component1();
            KotlinType kotlinType2 = (KotlinType) pair.component2();
            if (Intrinsics.areEqual(functionDescriptor.getName().asString(), "equals") && list.size() == 1 && Intrinsics.areEqual(lazyJavaResolverContext.getModule().getBuiltIns().getNullableAnyType(), kotlinType)) {
                name = Name.identifier("other");
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z2 = true;
                }
                if (name == null) {
                    name = Name.identifier(Intrinsics.stringPlus(com.google.android.exoplayer2.text.ttml.b.r, Integer.valueOf(iComponent1)));
                }
            }
            arrayList.add(new ValueParameterDescriptorImpl(functionDescriptor, null, iComponent1, annotationsResolveAnnotations, name, kotlinType, false, false, false, kotlinType2, lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaValueParameter)));
            z = false;
        }
        return new ResolvedValueParameters(CollectionsKt___CollectionsKt.toList(arrayList), z2);
    }

    @NotNull
    public String toString() {
        return Intrinsics.stringPlus("Lazy scope for ", getOwnerDescriptor());
    }

    public LazyJavaScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @Nullable LazyJavaScope lazyJavaScope) {
        this.a = lazyJavaResolverContext;
        this.b = lazyJavaScope;
        this.c = lazyJavaResolverContext.getStorageManager().createRecursionTolerantLazyValue(new a(), CollectionsKt__CollectionsKt.emptyList());
        this.d = lazyJavaResolverContext.getStorageManager().createLazyValue(new e());
        this.e = lazyJavaResolverContext.getStorageManager().createMemoizedFunction(new d());
        this.f = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new c());
        this.g = lazyJavaResolverContext.getStorageManager().createMemoizedFunction(new g());
        this.h = lazyJavaResolverContext.getStorageManager().createLazyValue(new f());
        this.i = lazyJavaResolverContext.getStorageManager().createLazyValue(new i());
        this.j = lazyJavaResolverContext.getStorageManager().createLazyValue(new b());
        this.k = lazyJavaResolverContext.getStorageManager().createMemoizedFunction(new h());
    }
}
