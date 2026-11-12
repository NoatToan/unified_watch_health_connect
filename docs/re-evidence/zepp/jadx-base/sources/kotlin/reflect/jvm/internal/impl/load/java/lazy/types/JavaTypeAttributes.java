package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Set;
import kotlin.collections.x;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class JavaTypeAttributes {

    @NotNull
    private final TypeUsage a;

    @NotNull
    private final JavaTypeFlexibility b;
    private final boolean c;

    @Nullable
    private final Set<TypeParameterDescriptor> d;

    @Nullable
    private final SimpleType e;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeAttributes(@NotNull TypeUsage typeUsage, @NotNull JavaTypeFlexibility javaTypeFlexibility, boolean z, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        this.a = typeUsage;
        this.b = javaTypeFlexibility;
        this.c = z;
        this.d = set;
        this.e = simpleType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaTypeAttributes copy$default(JavaTypeAttributes javaTypeAttributes, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, Set set, SimpleType simpleType, int i, Object obj) {
        if ((i & 1) != 0) {
            typeUsage = javaTypeAttributes.a;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.b;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        if ((i & 4) != 0) {
            z = javaTypeAttributes.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            set = javaTypeAttributes.d;
        }
        Set set2 = set;
        if ((i & 16) != 0) {
            simpleType = javaTypeAttributes.e;
        }
        return javaTypeAttributes.copy(typeUsage, javaTypeFlexibility2, z2, set2, simpleType);
    }

    @NotNull
    public final JavaTypeAttributes copy(@NotNull TypeUsage typeUsage, @NotNull JavaTypeFlexibility javaTypeFlexibility, boolean z, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        return new JavaTypeAttributes(typeUsage, javaTypeFlexibility, z, set, simpleType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaTypeAttributes)) {
            return false;
        }
        JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
        return this.a == javaTypeAttributes.a && this.b == javaTypeAttributes.b && this.c == javaTypeAttributes.c && Intrinsics.areEqual(this.d, javaTypeAttributes.d) && Intrinsics.areEqual(this.e, javaTypeAttributes.e);
    }

    @Nullable
    public final SimpleType getDefaultType() {
        return this.e;
    }

    @NotNull
    public final JavaTypeFlexibility getFlexibility() {
        return this.b;
    }

    @NotNull
    public final TypeUsage getHowThisTypeIsUsed() {
        return this.a;
    }

    @Nullable
    public final Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        boolean z = this.c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        Set<TypeParameterDescriptor> set = this.d;
        int iHashCode2 = (i + (set == null ? 0 : set.hashCode())) * 31;
        SimpleType simpleType = this.e;
        return iHashCode2 + (simpleType != null ? simpleType.hashCode() : 0);
    }

    public final boolean isForAnnotationParameter() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.a + ", flexibility=" + this.b + ", isForAnnotationParameter=" + this.c + ", visitedTypeParameters=" + this.d + ", defaultType=" + this.e + ')';
    }

    @NotNull
    public final JavaTypeAttributes withDefaultType(@Nullable SimpleType simpleType) {
        return copy$default(this, null, null, false, null, simpleType, 15, null);
    }

    @NotNull
    public final JavaTypeAttributes withFlexibility(@NotNull JavaTypeFlexibility javaTypeFlexibility) {
        return copy$default(this, null, javaTypeFlexibility, false, null, null, 29, null);
    }

    @NotNull
    public final JavaTypeAttributes withNewVisitedTypeParameter(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        Set<TypeParameterDescriptor> set = this.d;
        return copy$default(this, null, null, false, set != null ? z.plus(set, typeParameterDescriptor) : x.setOf(typeParameterDescriptor), null, 23, null);
    }

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, Set set, SimpleType simpleType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : set, (i & 16) != 0 ? null : simpleType);
    }
}
