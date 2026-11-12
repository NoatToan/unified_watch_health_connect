package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    @NotNull
    private final LazyJavaResolverContext a;

    @NotNull
    private final DeclarationDescriptor b;
    private final int c;

    @NotNull
    private final Map<JavaTypeParameter, Integer> d;

    @NotNull
    private final MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> e;

    public static final class a extends Lambda implements Function1<JavaTypeParameter, LazyJavaTypeParameterDescriptor> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LazyJavaTypeParameterDescriptor invoke(@NotNull JavaTypeParameter javaTypeParameter) {
            Integer num = (Integer) LazyJavaTypeParameterResolver.this.d.get(javaTypeParameter);
            if (num == null) {
                return null;
            }
            LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = LazyJavaTypeParameterResolver.this;
            return new LazyJavaTypeParameterDescriptor(ContextKt.copyWithNewDefaultTypeQualifiers(ContextKt.child(lazyJavaTypeParameterResolver.a, lazyJavaTypeParameterResolver), lazyJavaTypeParameterResolver.b.getAnnotations()), javaTypeParameter, lazyJavaTypeParameterResolver.c + num.intValue(), lazyJavaTypeParameterResolver.b);
        }
    }

    public LazyJavaTypeParameterResolver(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        this.a = lazyJavaResolverContext;
        this.b = declarationDescriptor;
        this.c = i;
        this.d = CollectionsKt.mapToIndex(javaTypeParameterListOwner.getTypeParameters());
        this.e = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    @Nullable
    public TypeParameterDescriptor resolveTypeParameter(@NotNull JavaTypeParameter javaTypeParameter) {
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptorInvoke = this.e.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptorInvoke == null ? this.a.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter) : lazyJavaTypeParameterDescriptorInvoke;
    }
}
