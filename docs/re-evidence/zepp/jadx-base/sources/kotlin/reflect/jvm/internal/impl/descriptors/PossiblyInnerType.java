package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class PossiblyInnerType {

    @NotNull
    private final ClassifierDescriptorWithTypeParameters a;

    @NotNull
    private final List<TypeProjection> b;

    @Nullable
    private final PossiblyInnerType c;

    /* JADX WARN: Multi-variable type inference failed */
    public PossiblyInnerType(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, @NotNull List<? extends TypeProjection> list, @Nullable PossiblyInnerType possiblyInnerType) {
        this.a = classifierDescriptorWithTypeParameters;
        this.b = list;
        this.c = possiblyInnerType;
    }

    @NotNull
    public final List<TypeProjection> getArguments() {
        return this.b;
    }

    @NotNull
    public final ClassifierDescriptorWithTypeParameters getClassifierDescriptor() {
        return this.a;
    }

    @Nullable
    public final PossiblyInnerType getOuterType() {
        return this.c;
    }
}
