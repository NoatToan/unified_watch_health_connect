package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class ClassicTypeCheckerContext extends AbstractTypeCheckerContext {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean e;
    private final boolean f;
    private final boolean g;

    @NotNull
    private final KotlinTypeRefiner h;

    @NotNull
    private final KotlinTypePreparator i;

    @NotNull
    private final ClassicTypeSystemContext j;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final AbstractTypeCheckerContext.SupertypesPolicy.DoCustomTransform classicSubstitutionSupertypePolicy(@NotNull final ClassicTypeSystemContext classicTypeSystemContext, @NotNull SimpleTypeMarker simpleTypeMarker) {
            if (!(simpleTypeMarker instanceof SimpleType)) {
                throw new IllegalArgumentException(ClassicTypeCheckerContextKt.a(simpleTypeMarker).toString());
            }
            final TypeSubstitutor typeSubstitutorBuildSubstitutor = TypeConstructorSubstitution.Companion.create((KotlinType) simpleTypeMarker).buildSubstitutor();
            return new AbstractTypeCheckerContext.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContext$Companion$classicSubstitutionSupertypePolicy$2
                @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy
                @NotNull
                /* JADX INFO: renamed from: transformType */
                public SimpleTypeMarker mo4301transformType(@NotNull AbstractTypeCheckerContext abstractTypeCheckerContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
                    ClassicTypeSystemContext classicTypeSystemContext2 = classicTypeSystemContext;
                    return classicTypeSystemContext2.asSimpleType(typeSubstitutorBuildSubstitutor.safeSubstitute((KotlinType) classicTypeSystemContext2.lowerBoundIfFlexible(kotlinTypeMarker), Variance.INVARIANT));
                }
            };
        }
    }

    public /* synthetic */ ClassicTypeCheckerContext(boolean z, boolean z2, boolean z3, KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator, ClassicTypeSystemContext classicTypeSystemContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2, (i & 4) == 0 ? z3 : true, (i & 8) != 0 ? KotlinTypeRefiner.Default.INSTANCE : kotlinTypeRefiner, (i & 16) != 0 ? KotlinTypePreparator.Default.INSTANCE : kotlinTypePreparator, (i & 32) != 0 ? SimpleClassicTypeSystemContext.INSTANCE : classicTypeSystemContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public boolean isAllowedTypeVariable(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return (kotlinTypeMarker instanceof UnwrappedType) && this.g && (((UnwrappedType) kotlinTypeMarker).getConstructor() instanceof NewTypeVariableConstructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public boolean isErrorTypeEqualsToAnything() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    public boolean isStubTypeEqualsToAnything() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    @NotNull
    public KotlinTypeMarker prepareType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        if (kotlinTypeMarker instanceof KotlinType) {
            return this.i.prepareType(((KotlinType) kotlinTypeMarker).unwrap());
        }
        throw new IllegalArgumentException(ClassicTypeCheckerContextKt.a(kotlinTypeMarker).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    @NotNull
    public KotlinTypeMarker refineType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        if (kotlinTypeMarker instanceof KotlinType) {
            return this.h.refineType((KotlinType) kotlinTypeMarker);
        }
        throw new IllegalArgumentException(ClassicTypeCheckerContextKt.a(kotlinTypeMarker).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    @NotNull
    public ClassicTypeSystemContext getTypeSystemContext() {
        return this.j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext
    @NotNull
    public AbstractTypeCheckerContext.SupertypesPolicy.DoCustomTransform substitutionSupertypePolicy(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return Companion.classicSubstitutionSupertypePolicy(getTypeSystemContext(), simpleTypeMarker);
    }

    public ClassicTypeCheckerContext(boolean z, boolean z2, boolean z3, @NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull KotlinTypePreparator kotlinTypePreparator, @NotNull ClassicTypeSystemContext classicTypeSystemContext) {
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = kotlinTypeRefiner;
        this.i = kotlinTypePreparator;
        this.j = classicTypeSystemContext;
    }
}
