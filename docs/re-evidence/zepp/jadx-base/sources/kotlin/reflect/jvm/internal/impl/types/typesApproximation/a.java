package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class a {

    @NotNull
    private final TypeParameterDescriptor a;

    @NotNull
    private final KotlinType b;

    @NotNull
    private final KotlinType c;

    public a(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        this.a = typeParameterDescriptor;
        this.b = kotlinType;
        this.c = kotlinType2;
    }

    @NotNull
    public final KotlinType a() {
        return this.b;
    }

    @NotNull
    public final KotlinType b() {
        return this.c;
    }

    @NotNull
    public final TypeParameterDescriptor c() {
        return this.a;
    }

    public final boolean d() {
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(this.b, this.c);
    }
}
