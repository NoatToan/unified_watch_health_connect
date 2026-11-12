package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ValueParameterData {

    @NotNull
    private final KotlinType a;
    private final boolean b;

    public ValueParameterData(@NotNull KotlinType kotlinType, boolean z) {
        this.a = kotlinType;
        this.b = z;
    }

    public final boolean getHasDefaultValue() {
        return this.b;
    }

    @NotNull
    public final KotlinType getType() {
        return this.a;
    }
}
