package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
final class d {

    @NotNull
    private final KotlinType a;

    @Nullable
    private final JavaDefaultQualifiers b;

    @Nullable
    private final TypeParameterDescriptor c;
    private final boolean d;

    public d(@NotNull KotlinType kotlinType, @Nullable JavaDefaultQualifiers javaDefaultQualifiers, @Nullable TypeParameterDescriptor typeParameterDescriptor, boolean z) {
        this.a = kotlinType;
        this.b = javaDefaultQualifiers;
        this.c = typeParameterDescriptor;
        this.d = z;
    }

    @NotNull
    public final KotlinType a() {
        return this.a;
    }

    @Nullable
    public final JavaDefaultQualifiers b() {
        return this.b;
    }

    @Nullable
    public final TypeParameterDescriptor c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    @NotNull
    public final KotlinType e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.a, dVar.a) && Intrinsics.areEqual(this.b, dVar.b) && Intrinsics.areEqual(this.c, dVar.c) && this.d == dVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        JavaDefaultQualifiers javaDefaultQualifiers = this.b;
        int iHashCode2 = (iHashCode + (javaDefaultQualifiers == null ? 0 : javaDefaultQualifiers.hashCode())) * 31;
        TypeParameterDescriptor typeParameterDescriptor = this.c;
        int iHashCode3 = (iHashCode2 + (typeParameterDescriptor != null ? typeParameterDescriptor.hashCode() : 0)) * 31;
        boolean z = this.d;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode3 + r1;
    }

    @NotNull
    public String toString() {
        return "TypeAndDefaultQualifiers(type=" + this.a + ", defaultQualifiers=" + this.b + ", typeParameterForArgument=" + this.c + ", isFromStarProjection=" + this.d + ')';
    }
}
