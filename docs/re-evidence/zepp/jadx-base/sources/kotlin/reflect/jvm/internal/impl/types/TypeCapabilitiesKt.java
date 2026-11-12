package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class TypeCapabilitiesKt {
    @Nullable
    public static final CustomTypeVariable getCustomTypeVariable(@NotNull KotlinType kotlinType) {
        Object objUnwrap = kotlinType.unwrap();
        CustomTypeVariable customTypeVariable = objUnwrap instanceof CustomTypeVariable ? (CustomTypeVariable) objUnwrap : null;
        if (customTypeVariable != null && customTypeVariable.isTypeVariable()) {
            return customTypeVariable;
        }
        return null;
    }

    public static final boolean isCustomTypeVariable(@NotNull KotlinType kotlinType) {
        Object objUnwrap = kotlinType.unwrap();
        CustomTypeVariable customTypeVariable = objUnwrap instanceof CustomTypeVariable ? (CustomTypeVariable) objUnwrap : null;
        if (customTypeVariable == null) {
            return false;
        }
        return customTypeVariable.isTypeVariable();
    }
}
