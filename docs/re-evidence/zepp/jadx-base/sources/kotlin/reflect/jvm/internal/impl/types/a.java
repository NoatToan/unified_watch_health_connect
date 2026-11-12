package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class a extends DelegatingSimpleTypeImpl {

    @NotNull
    private final Annotations c;

    public a(@NotNull SimpleType simpleType, @NotNull Annotations annotations) {
        super(simpleType);
        this.c = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a replaceDelegate(@NotNull SimpleType simpleType) {
        return new a(simpleType, getAnnotations());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.c;
    }
}
