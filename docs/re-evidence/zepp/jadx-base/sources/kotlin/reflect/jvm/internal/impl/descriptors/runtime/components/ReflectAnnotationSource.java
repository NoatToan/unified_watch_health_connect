package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ReflectAnnotationSource implements SourceElement {

    @NotNull
    private final Annotation a;

    public ReflectAnnotationSource(@NotNull Annotation annotation) {
        this.a = annotation;
    }

    @NotNull
    public final Annotation getAnnotation() {
        return this.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        return SourceFile.NO_SOURCE_FILE;
    }
}
