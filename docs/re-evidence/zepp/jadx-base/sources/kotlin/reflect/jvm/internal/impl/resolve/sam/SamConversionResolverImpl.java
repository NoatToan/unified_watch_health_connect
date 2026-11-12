package kotlin.reflect.jvm.internal.impl.resolve.sam;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class SamConversionResolverImpl implements SamConversionResolver {

    @NotNull
    private final Iterable<Object> a;

    @NotNull
    private final CacheWithNullableValues<ClassDescriptor, SimpleType> b;

    public SamConversionResolverImpl(@NotNull StorageManager storageManager, @NotNull Iterable<? extends Object> iterable) {
        this.a = iterable;
        this.b = storageManager.createCacheWithNullableValues();
    }
}
