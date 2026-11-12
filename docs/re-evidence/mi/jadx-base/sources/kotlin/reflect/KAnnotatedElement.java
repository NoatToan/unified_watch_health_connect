package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface KAnnotatedElement {
    @NotNull
    List<Annotation> getAnnotations();
}
