package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class InlineClassRepresentation<Type extends SimpleTypeMarker> {

    @NotNull
    private final Name a;

    @NotNull
    private final Type b;

    public InlineClassRepresentation(@NotNull Name name, @NotNull Type type) {
        this.a = name;
        this.b = type;
    }

    @NotNull
    public final Name getUnderlyingPropertyName() {
        return this.a;
    }

    @NotNull
    public final Type getUnderlyingType() {
        return this.b;
    }
}
