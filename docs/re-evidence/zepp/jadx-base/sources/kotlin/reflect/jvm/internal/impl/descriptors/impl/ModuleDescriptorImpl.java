package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.y;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.TargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.checker.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {

    @NotNull
    private final StorageManager c;

    @NotNull
    private final KotlinBuiltIns d;

    @Nullable
    private final TargetPlatform e;

    @Nullable
    private final Name f;

    @NotNull
    private final Map<ModuleCapability<?>, Object> g;

    @NotNull
    private final PackageViewDescriptorFactory h;

    @Nullable
    private ModuleDependencies i;

    @Nullable
    private PackageFragmentProvider j;
    private boolean k;

    @NotNull
    private final MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> l;

    @NotNull
    private final Lazy m;

    public static final class a extends Lambda implements Function0<CompositePackageFragmentProvider> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompositePackageFragmentProvider invoke() {
            ModuleDependencies moduleDependencies = ModuleDescriptorImpl.this.i;
            ModuleDescriptorImpl moduleDescriptorImpl = ModuleDescriptorImpl.this;
            if (moduleDependencies == null) {
                throw new AssertionError("Dependencies of module " + moduleDescriptorImpl.b() + " were not set before querying module content");
            }
            List<ModuleDescriptorImpl> allDependencies = moduleDependencies.getAllDependencies();
            allDependencies.contains(ModuleDescriptorImpl.this);
            Iterator<T> it2 = allDependencies.iterator();
            while (it2.hasNext()) {
                ((ModuleDescriptorImpl) it2.next()).d();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allDependencies, 10));
            Iterator<T> it3 = allDependencies.iterator();
            while (it3.hasNext()) {
                arrayList.add(((ModuleDescriptorImpl) it3.next()).j);
            }
            return new CompositePackageFragmentProvider(arrayList, Intrinsics.stringPlus("CompositeProvider@ModuleDescriptor for ", ModuleDescriptorImpl.this.getName()));
        }
    }

    public static final class b extends Lambda implements Function1<FqName, PackageViewDescriptor> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PackageViewDescriptor invoke(@NotNull FqName fqName) {
            PackageViewDescriptorFactory packageViewDescriptorFactory = ModuleDescriptorImpl.this.h;
            ModuleDescriptorImpl moduleDescriptorImpl = ModuleDescriptorImpl.this;
            return packageViewDescriptorFactory.compute(moduleDescriptorImpl, fqName, moduleDescriptorImpl.c);
        }
    }

    @JvmOverloads
    public ModuleDescriptorImpl(@NotNull Name name, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable TargetPlatform targetPlatform) {
        this(name, storageManager, kotlinBuiltIns, targetPlatform, null, null, 48, null);
    }

    public /* synthetic */ ModuleDescriptorImpl(Name name, StorageManager storageManager, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map map, Name name2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, storageManager, kotlinBuiltIns, (i & 8) != 0 ? null : targetPlatform, (i & 16) != 0 ? r.emptyMap() : map, (i & 32) != 0 ? null : name2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b() {
        return getName().toString();
    }

    private final CompositePackageFragmentProvider c() {
        return (CompositePackageFragmentProvider) this.m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d() {
        return this.j != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return (R) ModuleDescriptor.DefaultImpls.accept(this, declarationDescriptorVisitor, d);
    }

    public void assertValid() {
        if (!isValid()) {
            throw new InvalidModuleException(Intrinsics.stringPlus("Accessing invalid module descriptor ", this));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return this.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @Nullable
    public <T> T getCapability(@NotNull ModuleCapability<T> moduleCapability) {
        return (T) this.g.get(moduleCapability);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public DeclarationDescriptor getContainingDeclaration() {
        return ModuleDescriptor.DefaultImpls.getContainingDeclaration(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public List<ModuleDescriptor> getExpectedByModules() {
        ModuleDependencies moduleDependencies = this.i;
        if (moduleDependencies != null) {
            return moduleDependencies.getDirectExpectedByDependencies();
        }
        throw new AssertionError("Dependencies of module " + b() + " were not set");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public PackageViewDescriptor getPackage(@NotNull FqName fqName) {
        assertValid();
        return this.l.invoke(fqName);
    }

    @NotNull
    public final PackageFragmentProvider getPackageFragmentProvider() {
        assertValid();
        return c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(fqName, function1);
    }

    public final void initialize(@NotNull PackageFragmentProvider packageFragmentProvider) {
        d();
        this.j = packageFragmentProvider;
    }

    public boolean isValid() {
        return this.k;
    }

    public final void setDependencies(@NotNull ModuleDependencies moduleDependencies) {
        this.i = moduleDependencies;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor moduleDescriptor) {
        return Intrinsics.areEqual(this, moduleDescriptor) || CollectionsKt___CollectionsKt.contains(this.i.getModulesWhoseInternalsAreVisible(), moduleDescriptor) || getExpectedByModules().contains(moduleDescriptor) || moduleDescriptor.getExpectedByModules().contains(this);
    }

    public final void setDependencies(@NotNull ModuleDescriptorImpl... moduleDescriptorImplArr) {
        setDependencies(ArraysKt___ArraysKt.toList(moduleDescriptorImplArr));
    }

    @JvmOverloads
    public ModuleDescriptorImpl(@NotNull Name name, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable TargetPlatform targetPlatform, @NotNull Map<ModuleCapability<?>, ? extends Object> map, @Nullable Name name2) {
        super(Annotations.Companion.getEMPTY(), name);
        this.c = storageManager;
        this.d = kotlinBuiltIns;
        this.e = targetPlatform;
        this.f = name2;
        if (name.isSpecial()) {
            Map<ModuleCapability<?>, Object> mutableMap = r.toMutableMap(map);
            this.g = mutableMap;
            mutableMap.put(KotlinTypeRefinerKt.getREFINER_CAPABILITY(), new Ref(null));
            PackageViewDescriptorFactory packageViewDescriptorFactory = (PackageViewDescriptorFactory) getCapability(PackageViewDescriptorFactory.Companion.getCAPABILITY());
            this.h = packageViewDescriptorFactory == null ? PackageViewDescriptorFactory.Default.INSTANCE : packageViewDescriptorFactory;
            this.k = true;
            this.l = storageManager.createMemoizedFunction(new b());
            this.m = LazyKt__LazyJVMKt.lazy(new a());
            return;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Module name must be special: ", name));
    }

    public final void setDependencies(@NotNull List<ModuleDescriptorImpl> list) {
        setDependencies(list, y.emptySet());
    }

    public final void setDependencies(@NotNull List<ModuleDescriptorImpl> list, @NotNull Set<ModuleDescriptorImpl> set) {
        setDependencies(new ModuleDependenciesImpl(list, set, CollectionsKt__CollectionsKt.emptyList(), y.emptySet()));
    }
}
