package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {

    @NotNull
    private final StorageManager a;

    @NotNull
    private final KotlinMetadataFinder b;

    @NotNull
    private final ModuleDescriptor c;
    public DeserializationComponents components;

    @NotNull
    private final MemoizedFunctionToNullable<FqName, PackageFragmentDescriptor> d;

    public static final class a extends Lambda implements Function1<FqName, PackageFragmentDescriptor> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PackageFragmentDescriptor invoke(@NotNull FqName fqName) {
            DeserializedPackageFragment deserializedPackageFragmentFindPackage = AbstractDeserializedPackageFragmentProvider.this.findPackage(fqName);
            if (deserializedPackageFragmentFindPackage == null) {
                return null;
            }
            deserializedPackageFragmentFindPackage.initialize(AbstractDeserializedPackageFragmentProvider.this.getComponents());
            return deserializedPackageFragmentFindPackage;
        }
    }

    public AbstractDeserializedPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull KotlinMetadataFinder kotlinMetadataFinder, @NotNull ModuleDescriptor moduleDescriptor) {
        this.a = storageManager;
        this.b = kotlinMetadataFinder;
        this.c = moduleDescriptor;
        this.d = storageManager.createMemoizedFunctionWithNullableValues(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        CollectionsKt.addIfNotNull(collection, this.d.invoke(fqName));
    }

    @Nullable
    public abstract DeserializedPackageFragment findPackage(@NotNull FqName fqName);

    @NotNull
    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        return null;
    }

    @NotNull
    public final KotlinMetadataFinder getFinder() {
        return this.b;
    }

    @NotNull
    public final ModuleDescriptor getModuleDescriptor() {
        return this.c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName) {
        return CollectionsKt__CollectionsKt.listOfNotNull(this.d.invoke(fqName));
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        return y.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        return (this.d.isComputed(fqName) ? this.d.invoke(fqName) : findPackage(fqName)) == null;
    }

    public final void setComponents(@NotNull DeserializationComponents deserializationComponents) {
        this.components = deserializationComponents;
    }
}
