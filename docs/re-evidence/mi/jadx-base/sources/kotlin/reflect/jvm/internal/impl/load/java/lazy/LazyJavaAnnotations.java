package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaAnnotations implements Annotations {

    @NotNull
    private final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> annotationDescriptors;

    @NotNull
    private final JavaAnnotationOwner annotationOwner;
    private final boolean areAnnotationsFreshlySupported;

    @NotNull
    private final LazyJavaResolverContext c;

    public LazyJavaAnnotations(@NotNull LazyJavaResolverContext c, @NotNull JavaAnnotationOwner annotationOwner, boolean z) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        this.c = c;
        this.annotationOwner = annotationOwner;
        this.areAnnotationsFreshlySupported = z;
        this.annotationDescriptors = c.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations$$Lambda$0
            private final LazyJavaAnnotations arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public Object invoke2(Object obj) {
                return LazyJavaAnnotations.annotationDescriptors$lambda$0(this.arg$0, (JavaAnnotation) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotationDescriptor annotationDescriptors$lambda$0(LazyJavaAnnotations this$0, JavaAnnotation annotation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        return JavaAnnotationMapper.INSTANCE.mapOrResolveJavaAnnotation(annotation, this$0.c, this$0.areAnnotationsFreshlySupported);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo2175findAnnotation(@NotNull FqName fqName) {
        AnnotationDescriptor annotationDescriptorInvoke2;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        JavaAnnotation javaAnnotationFindAnnotation = this.annotationOwner.findAnnotation(fqName);
        return (javaAnnotationFindAnnotation == null || (annotationDescriptorInvoke2 = this.annotationDescriptors.invoke2(javaAnnotationFindAnnotation)) == null) ? JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName, this.annotationOwner, this.c) : annotationDescriptorInvoke2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.annotationOwner.getAnnotations().isEmpty() && !this.annotationOwner.isDeprecatedInJavaDoc();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return SequencesKt___SequencesKt.filterNotNull(SequencesKt___SequencesKt.plus((Sequence<? extends AnnotationDescriptor>) SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(this.annotationOwner.getAnnotations()), this.annotationDescriptors), JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(StandardNames.FqNames.deprecated, this.annotationOwner, this.c))).iterator();
    }

    public /* synthetic */ LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotationOwner, (i & 4) != 0 ? false : z);
    }
}
