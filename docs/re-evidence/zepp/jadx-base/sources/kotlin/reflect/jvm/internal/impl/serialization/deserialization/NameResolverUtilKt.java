package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class NameResolverUtilKt {
    @NotNull
    public static final ClassId getClassId(@NotNull NameResolver nameResolver, int i) {
        return ClassId.fromString(nameResolver.getQualifiedClassName(i), nameResolver.isLocalClassName(i));
    }

    @NotNull
    public static final Name getName(@NotNull NameResolver nameResolver, int i) {
        return Name.guessByFirstCharacter(nameResolver.getString(i));
    }
}
