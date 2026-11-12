package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class LazyJavaPackageScope extends LazyJavaStaticScope {

    @NotNull
    private final JavaPackage m;

    @NotNull
    private final LazyJavaPackageFragment n;

    @NotNull
    private final NullableLazyValue<Set<String>> o;

    @NotNull
    private final MemoizedFunctionToNullable<a, ClassDescriptor> p;

    public static abstract class KotlinClassLookupResult {

        public static final class Found extends KotlinClassLookupResult {

            @NotNull
            private final ClassDescriptor a;

            public Found(@NotNull ClassDescriptor classDescriptor) {
                super(null);
                this.a = classDescriptor;
            }

            @NotNull
            public final ClassDescriptor getDescriptor() {
                return this.a;
            }
        }

        public static final class NotFound extends KotlinClassLookupResult {

            @NotNull
            public static final NotFound INSTANCE = new NotFound();

            private NotFound() {
                super(null);
            }
        }

        public static final class SyntheticClass extends KotlinClassLookupResult {

            @NotNull
            public static final SyntheticClass INSTANCE = new SyntheticClass();

            private SyntheticClass() {
                super(null);
            }
        }

        private KotlinClassLookupResult() {
        }

        public /* synthetic */ KotlinClassLookupResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class a {

        @NotNull
        private final Name a;

        @Nullable
        private final JavaClass b;

        public a(@NotNull Name name, @Nullable JavaClass javaClass) {
            this.a = name;
            this.b = javaClass;
        }

        @Nullable
        public final JavaClass a() {
            return this.b;
        }

        @NotNull
        public final Name b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class b extends Lambda implements Function1<a, ClassDescriptor> {
        public final /* synthetic */ LazyJavaResolverContext b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LazyJavaResolverContext lazyJavaResolverContext) {
            super(1);
            this.b = lazyJavaResolverContext;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x008c  */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClassDescriptor invoke(@NotNull a aVar) {
            byte[] content;
            ClassId classId = new ClassId(LazyJavaPackageScope.this.getOwnerDescriptor().getFqName(), aVar.b());
            KotlinClassFinder.Result resultFindKotlinClassOrContent = aVar.a() != null ? this.b.getComponents().getKotlinClassFinder().findKotlinClassOrContent(aVar.a()) : this.b.getComponents().getKotlinClassFinder().findKotlinClassOrContent(classId);
            KotlinJvmBinaryClass kotlinJvmBinaryClass = resultFindKotlinClassOrContent == null ? null : resultFindKotlinClassOrContent.toKotlinJvmBinaryClass();
            ClassId classId2 = kotlinJvmBinaryClass == null ? null : kotlinJvmBinaryClass.getClassId();
            if (classId2 != null && (classId2.isNestedClass() || classId2.isLocal())) {
                return null;
            }
            KotlinClassLookupResult kotlinClassLookupResultJ = LazyJavaPackageScope.this.j(kotlinJvmBinaryClass);
            if (kotlinClassLookupResultJ instanceof KotlinClassLookupResult.Found) {
                return ((KotlinClassLookupResult.Found) kotlinClassLookupResultJ).getDescriptor();
            }
            if (kotlinClassLookupResultJ instanceof KotlinClassLookupResult.SyntheticClass) {
                return null;
            }
            if (!(kotlinClassLookupResultJ instanceof KotlinClassLookupResult.NotFound)) {
                throw new NoWhenBranchMatchedException();
            }
            JavaClass javaClassA = aVar.a();
            if (javaClassA == null) {
                JavaClassFinder finder = this.b.getComponents().getFinder();
                if (resultFindKotlinClassOrContent != null) {
                    if (!(resultFindKotlinClassOrContent instanceof KotlinClassFinder.Result.ClassFileContent)) {
                        resultFindKotlinClassOrContent = null;
                    }
                    KotlinClassFinder.Result.ClassFileContent classFileContent = (KotlinClassFinder.Result.ClassFileContent) resultFindKotlinClassOrContent;
                    if (classFileContent == null) {
                        content = null;
                    } else {
                        content = classFileContent.getContent();
                    }
                } else {
                    content = null;
                }
                javaClassA = finder.findClass(new JavaClassFinder.Request(classId, content, null, 4, null));
            }
            JavaClass javaClass = javaClassA;
            if ((javaClass == null ? null : javaClass.getLightClassOriginKind()) != LightClassOriginKind.BINARY) {
                FqName fqName = javaClass == null ? null : javaClass.getFqName();
                if (fqName == null || fqName.isRoot() || !Intrinsics.areEqual(fqName.parent(), LazyJavaPackageScope.this.getOwnerDescriptor().getFqName())) {
                    return null;
                }
                LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(this.b, LazyJavaPackageScope.this.getOwnerDescriptor(), javaClass, null, 8, null);
                this.b.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                return lazyJavaClassDescriptor;
            }
            throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + javaClass + "\nClassId: " + classId + "\nfindKotlinClass(JavaClass) = " + KotlinClassFinderKt.findKotlinClass(this.b.getComponents().getKotlinClassFinder(), javaClass) + "\nfindKotlinClass(ClassId) = " + KotlinClassFinderKt.findKotlinClass(this.b.getComponents().getKotlinClassFinder(), classId) + '\n');
        }
    }

    public static final class c extends Lambda implements Function0<Set<? extends String>> {
        public final /* synthetic */ LazyJavaResolverContext a;
        public final /* synthetic */ LazyJavaPackageScope b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
            super(0);
            this.a = lazyJavaResolverContext;
            this.b = lazyJavaPackageScope;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Set<? extends String> getA() {
            return this.a.getComponents().getFinder().knownClassNamesInPackage(this.b.getOwnerDescriptor().getFqName());
        }
    }

    public LazyJavaPackageScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage, @NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(lazyJavaResolverContext);
        this.m = javaPackage;
        this.n = lazyJavaPackageFragment;
        this.o = lazyJavaResolverContext.getStorageManager().createNullableLazyValue(new c(lazyJavaResolverContext, this));
        this.p = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new b(lazyJavaResolverContext));
    }

    private final ClassDescriptor i(Name name, JavaClass javaClass) {
        if (!SpecialNames.isSafeIdentifier(name)) {
            return null;
        }
        Set<String> setInvoke = this.o.getA();
        if (javaClass != null || setInvoke == null || setInvoke.contains(name.asString())) {
            return this.p.invoke(new a(name, javaClass));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KotlinClassLookupResult j(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass == null) {
            return KotlinClassLookupResult.NotFound.INSTANCE;
        }
        if (kotlinJvmBinaryClass.getClassHeader().getKind() != KotlinClassHeader.Kind.CLASS) {
            return KotlinClassLookupResult.SyntheticClass.INSTANCE;
        }
        ClassDescriptor classDescriptorResolveClass = getC().getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass);
        return classDescriptorResolveClass != null ? new KotlinClassLookupResult.Found(classDescriptorResolveClass) : KotlinClassLookupResult.NotFound.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        if (!descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return y.emptySet();
        }
        Set<String> setInvoke = this.o.getA();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it2 = setInvoke.iterator();
            while (it2.hasNext()) {
                hashSet.add(Name.identifier((String) it2.next()));
            }
            return hashSet;
        }
        JavaPackage javaPackage = this.m;
        if (function1 == null) {
            function1 = FunctionsKt.alwaysTrue();
        }
        Collection<JavaClass> classes = javaPackage.getClasses(function1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : classes) {
            Name name = javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE ? null : javaClass.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        return y.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public DeclaredMemberIndex computeMemberIndex() {
        return DeclaredMemberIndex.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        return y.emptySet();
    }

    @Nullable
    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(@NotNull JavaClass javaClass) {
        return i(javaClass.getName(), javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (!descriptorKindFilter.acceptsKinds(companion.getNON_SINGLETON_CLASSIFIERS_MASK() | companion.getCLASSIFIERS_MASK())) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Collection<DeclarationDescriptor> collectionInvoke = getAllDescriptors().getA();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
            if ((declarationDescriptor instanceof ClassDescriptor) && function1.invoke(((ClassDescriptor) declarationDescriptor).getName()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassDescriptor mo4299getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        return i(name, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public LazyJavaPackageFragment getOwnerDescriptor() {
        return this.n;
    }
}
