package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import kotlin.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {

    @NotNull
    private final LazyJavaResolverContext a;

    @NotNull
    private final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> b;

    public static final class a extends Lambda implements Function0<LazyJavaPackageFragment> {
        public final /* synthetic */ JavaPackage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JavaPackage javaPackage) {
            super(0);
            this.b = javaPackage;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LazyJavaPackageFragment invoke() {
            return new LazyJavaPackageFragment(LazyJavaPackageFragmentProvider.this.a, this.b);
        }
    }

    public LazyJavaPackageFragmentProvider(@NotNull JavaResolverComponents javaResolverComponents) {
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(javaResolverComponents, TypeParameterResolver.EMPTY.INSTANCE, c.lazyOf(null));
        this.a = lazyJavaResolverContext;
        this.b = lazyJavaResolverContext.getStorageManager().createCacheWithNotNullValues();
    }

    private final LazyJavaPackageFragment a(FqName fqName) {
        JavaPackage javaPackageFindPackage = this.a.getComponents().getFinder().findPackage(fqName);
        if (javaPackageFindPackage == null) {
            return null;
        }
        return this.b.computeIfAbsent(fqName, new a(javaPackageFindPackage));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        CollectionsKt.addIfNotNull(collection, a(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public List<LazyJavaPackageFragment> getPackageFragments(@NotNull FqName fqName) {
        return CollectionsKt__CollectionsKt.listOfNotNull(a(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public /* bridge */ /* synthetic */ Collection getSubPackagesOf(FqName fqName, Function1 function1) {
        return getSubPackagesOf(fqName, (Function1<? super Name, Boolean>) function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        return this.a.getComponents().getFinder().findPackage(fqName) == null;
    }

    @NotNull
    public String toString() {
        return Intrinsics.stringPlus("LazyJavaPackageFragmentProvider of module ", this.a.getComponents().getModule());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public List<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        LazyJavaPackageFragment lazyJavaPackageFragmentA = a(fqName);
        List<FqName> subPackageFqNames$descriptors_jvm = lazyJavaPackageFragmentA == null ? null : lazyJavaPackageFragmentA.getSubPackageFqNames$descriptors_jvm();
        return subPackageFqNames$descriptors_jvm != null ? subPackageFqNames$descriptors_jvm : CollectionsKt__CollectionsKt.emptyList();
    }
}
