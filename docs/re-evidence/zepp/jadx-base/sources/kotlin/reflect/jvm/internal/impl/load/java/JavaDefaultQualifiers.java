package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class JavaDefaultQualifiers {

    @NotNull
    private final NullabilityQualifierWithMigrationStatus a;

    @NotNull
    private final Collection<AnnotationQualifierApplicabilityType> b;
    private final boolean c;
    private final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaDefaultQualifiers(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @NotNull Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z, boolean z2) {
        this.a = nullabilityQualifierWithMigrationStatus;
        this.b = collection;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaDefaultQualifiers copy$default(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers.a;
        }
        if ((i & 2) != 0) {
            collection = javaDefaultQualifiers.b;
        }
        if ((i & 4) != 0) {
            z = javaDefaultQualifiers.c;
        }
        if ((i & 8) != 0) {
            z2 = javaDefaultQualifiers.d;
        }
        return javaDefaultQualifiers.copy(nullabilityQualifierWithMigrationStatus, collection, z, z2);
    }

    @NotNull
    public final JavaDefaultQualifiers copy(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @NotNull Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z, boolean z2) {
        return new JavaDefaultQualifiers(nullabilityQualifierWithMigrationStatus, collection, z, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaDefaultQualifiers)) {
            return false;
        }
        JavaDefaultQualifiers javaDefaultQualifiers = (JavaDefaultQualifiers) obj;
        return Intrinsics.areEqual(this.a, javaDefaultQualifiers.a) && Intrinsics.areEqual(this.b, javaDefaultQualifiers.b) && this.c == javaDefaultQualifiers.c && this.d == javaDefaultQualifiers.d;
    }

    public final boolean getAffectsStarProjection() {
        return this.d;
    }

    public final boolean getAffectsTypeParameterBasedTypes() {
        return this.c;
    }

    public final boolean getMakesTypeParameterNotNull() {
        return this.a.getQualifier() == NullabilityQualifier.NOT_NULL && this.c;
    }

    @NotNull
    public final NullabilityQualifierWithMigrationStatus getNullabilityQualifier() {
        return this.a;
    }

    @NotNull
    public final Collection<AnnotationQualifierApplicabilityType> getQualifierApplicabilityTypes() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        boolean z = this.c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.d;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.a + ", qualifierApplicabilityTypes=" + this.b + ", affectsTypeParameterBasedTypes=" + this.c + ", affectsStarProjection=" + this.d + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            z = nullabilityQualifierWithMigrationStatus.getQualifier() == NullabilityQualifier.NOT_NULL;
        }
        this(nullabilityQualifierWithMigrationStatus, collection, z, (i & 8) != 0 ? z : z2);
    }
}
