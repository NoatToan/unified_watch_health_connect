package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
final class a {

    @NotNull
    private final KotlinType a;

    @Nullable
    private final a b;

    public a(@NotNull KotlinType kotlinType, @Nullable a aVar) {
        this.a = kotlinType;
        this.b = aVar;
    }

    @Nullable
    public final a a() {
        return this.b;
    }

    @NotNull
    public final KotlinType b() {
        return this.a;
    }
}
