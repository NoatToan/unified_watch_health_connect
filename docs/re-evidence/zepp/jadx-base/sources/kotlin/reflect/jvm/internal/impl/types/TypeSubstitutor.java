package kotlin.reflect.jvm.internal.impl.types;

import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public class TypeSubstitutor {
    public static final TypeSubstitutor EMPTY = create(TypeSubstitution.EMPTY);
    public static final /* synthetic */ boolean b = false;

    @NotNull
    private final TypeSubstitution a;

    public static class a implements Function1<FqName, Boolean> {
        private static /* synthetic */ void a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(@NotNull FqName fqName) {
            if (fqName == null) {
                a(0);
            }
            return Boolean.valueOf(!fqName.equals(StandardNames.FqNames.unsafeVariance));
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    public enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public TypeSubstitutor(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            a(7);
        }
        this.a = typeSubstitution;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    private static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i2 = 2;
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i2 = 2;
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = StatEvent.TP_FIRST;
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = DbUtils.Const.Table.CONTEXT;
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    private static void b(int i, TypeProjection typeProjection, TypeSubstitution typeSubstitution) {
        if (i <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + f(typeProjection) + "; substitution: " + f(typeSubstitution));
    }

    private static d c(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return d.OUT_IN_IN_POSITION;
        }
        return (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    @NotNull
    public static Variance combine(@NotNull Variance variance, @NotNull TypeProjection typeProjection) {
        if (variance == null) {
            a(35);
        }
        if (typeProjection == null) {
            a(36);
        }
        if (!typeProjection.isStarProjection()) {
            return combine(variance, typeProjection.getProjectionKind());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 == null) {
            a(37);
        }
        return variance2;
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            a(0);
        }
        return new TypeSubstitutor(typeSubstitution);
    }

    @NotNull
    public static TypeSubstitutor createChainedSubstitutor(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            a(3);
        }
        if (typeSubstitution2 == null) {
            a(4);
        }
        return create(DisjointKeysUnionTypeSubstitution.create(typeSubstitution, typeSubstitution2));
    }

    @NotNull
    private static Annotations d(@NotNull Annotations annotations) {
        if (annotations == null) {
            a(33);
        }
        return !annotations.hasAnnotation(StandardNames.FqNames.unsafeVariance) ? annotations : new FilteredAnnotations(annotations, new a());
    }

    @NotNull
    private static TypeProjection e(@NotNull KotlinType kotlinType, @NotNull TypeProjection typeProjection, @Nullable TypeParameterDescriptor typeParameterDescriptor, @NotNull TypeProjection typeProjection2) {
        if (kotlinType == null) {
            a(26);
        }
        if (typeProjection == null) {
            a(27);
        }
        if (typeProjection2 == null) {
            a(28);
        }
        if (!kotlinType.getAnnotations().hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
            if (typeProjection == null) {
                a(29);
            }
            return typeProjection;
        }
        TypeConstructor constructor = typeProjection.getType().getConstructor();
        if (!(constructor instanceof NewCapturedTypeConstructor)) {
            return typeProjection;
        }
        TypeProjection projection = ((NewCapturedTypeConstructor) constructor).getProjection();
        Variance projectionKind = projection.getProjectionKind();
        d dVarC = c(typeProjection2.getProjectionKind(), projectionKind);
        d dVar = d.OUT_IN_IN_POSITION;
        if (dVarC == dVar) {
            return new TypeProjectionImpl(projection.getType());
        }
        return (typeParameterDescriptor != null && c(typeParameterDescriptor.getVariance(), projectionKind) == dVar) ? new TypeProjectionImpl(projection.getType()) : typeProjection;
    }

    private static String f(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (ExceptionUtilsKt.isProcessCanceledException(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    private TypeProjection g(TypeProjection typeProjection, int i) throws c {
        KotlinType type = typeProjection.getType();
        Variance projectionKind = typeProjection.getProjectionKind();
        if (type.getConstructor().mo4298getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        SimpleType abbreviation = SpecialTypesKt.getAbbreviation(type);
        KotlinType kotlinTypeSubstitute = abbreviation != null ? replaceWithNonApproximatingSubstitution().substitute(abbreviation, Variance.INVARIANT) : null;
        KotlinType kotlinTypeReplace = TypeSubstitutionKt.replace(type, h(type.getConstructor().getParameters(), type.getArguments(), i), this.a.filterAnnotations(type.getAnnotations()));
        if ((kotlinTypeReplace instanceof SimpleType) && (kotlinTypeSubstitute instanceof SimpleType)) {
            kotlinTypeReplace = SpecialTypesKt.withAbbreviation((SimpleType) kotlinTypeReplace, (SimpleType) kotlinTypeSubstitute);
        }
        return new TypeProjectionImpl(projectionKind, kotlinTypeReplace);
    }

    private List<TypeProjection> h(List<TypeParameterDescriptor> list, List<TypeProjection> list2, int i) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            TypeParameterDescriptor typeParameterDescriptor = list.get(i2);
            TypeProjection typeProjection = list2.get(i2);
            TypeProjection typeProjectionI = i(typeProjection, typeParameterDescriptor, i + 1);
            int i3 = b.a[c(typeParameterDescriptor.getVariance(), typeProjectionI.getProjectionKind()).ordinal()];
            if (i3 == 1 || i3 == 2) {
                typeProjectionI = TypeUtils.makeStarProjection(typeParameterDescriptor);
            } else if (i3 == 3) {
                Variance variance = typeParameterDescriptor.getVariance();
                Variance variance2 = Variance.INVARIANT;
                if (variance != variance2 && !typeProjectionI.isStarProjection()) {
                    typeProjectionI = new TypeProjectionImpl(variance2, typeProjectionI.getType());
                }
            }
            if (typeProjectionI != typeProjection) {
                z = true;
            }
            arrayList.add(typeProjectionI);
        }
        return !z ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated, kotlin.reflect.jvm.internal.impl.types.KotlinType] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.reflect.jvm.internal.impl.types.TypeSubstitution] */
    /* JADX WARN: Type inference failed for: r8v14, types: [kotlin.reflect.jvm.internal.impl.types.KotlinType] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    private TypeProjection i(@NotNull TypeProjection typeProjection, @Nullable TypeParameterDescriptor typeParameterDescriptor, int i) throws c {
        ?? enhancement;
        if (typeProjection == null) {
            a(18);
        }
        b(i, typeProjection, this.a);
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        ?? type = typeProjection.getType();
        if (type instanceof TypeWithEnhancement) {
            TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
            UnwrappedType origin = typeWithEnhancement.getOrigin();
            KotlinType enhancement2 = typeWithEnhancement.getEnhancement();
            TypeProjection typeProjectionI = i(new TypeProjectionImpl(typeProjection.getProjectionKind(), origin), typeParameterDescriptor, i + 1);
            if (typeProjectionI.isStarProjection()) {
                return typeProjectionI;
            }
            Object objSubstitute = substitute(enhancement2, typeProjection.getProjectionKind());
            UnwrappedType unwrappedTypeUnwrap = typeProjectionI.getType().unwrap();
            if (objSubstitute instanceof TypeWithEnhancement) {
                enhancement = objSubstitute;
                enhancement = ((TypeWithEnhancement) objSubstitute).getEnhancement();
            }
            enhancement = objSubstitute;
            return new TypeProjectionImpl(typeProjectionI.getProjectionKind(), TypeWithEnhancementKt.wrapEnhancement(unwrappedTypeUnwrap, enhancement));
        }
        if (!DynamicTypesKt.isDynamic(type) && !(type.unwrap() instanceof RawType)) {
            TypeProjection typeProjectionMo4302get = this.a.mo4302get(type);
            TypeProjection typeProjectionE = typeProjectionMo4302get != null ? e(type, typeProjectionMo4302get, typeParameterDescriptor, typeProjection) : null;
            Variance projectionKind = typeProjection.getProjectionKind();
            if (typeProjectionE == null && FlexibleTypesKt.isFlexible(type) && !TypeCapabilitiesKt.isCustomTypeVariable(type)) {
                FlexibleType flexibleTypeAsFlexibleType = FlexibleTypesKt.asFlexibleType(type);
                int i2 = i + 1;
                TypeProjection typeProjectionI2 = i(new TypeProjectionImpl(projectionKind, flexibleTypeAsFlexibleType.getLowerBound()), typeParameterDescriptor, i2);
                TypeProjection typeProjectionI3 = i(new TypeProjectionImpl(projectionKind, flexibleTypeAsFlexibleType.getUpperBound()), typeParameterDescriptor, i2);
                return (typeProjectionI2.getType() == flexibleTypeAsFlexibleType.getLowerBound() && typeProjectionI3.getType() == flexibleTypeAsFlexibleType.getUpperBound()) ? typeProjection : new TypeProjectionImpl(typeProjectionI2.getProjectionKind(), KotlinTypeFactory.flexibleType(TypeSubstitutionKt.asSimpleType(typeProjectionI2.getType()), TypeSubstitutionKt.asSimpleType(typeProjectionI3.getType())));
            }
            if (!KotlinBuiltIns.isNothing(type) && !KotlinTypeKt.isError(type)) {
                if (typeProjectionE != null) {
                    d dVarC = c(projectionKind, typeProjectionE.getProjectionKind());
                    if (!CapturedTypeConstructorKt.isCaptured(type)) {
                        int i3 = b.a[dVarC.ordinal()];
                        if (i3 == 1) {
                            throw new c("Out-projection in in-position");
                        }
                        if (i3 == 2) {
                            return new TypeProjectionImpl(Variance.OUT_VARIANCE, type.getConstructor().getBuiltIns().getNullableAnyType());
                        }
                    }
                    CustomTypeVariable customTypeVariable = TypeCapabilitiesKt.getCustomTypeVariable(type);
                    if (typeProjectionE.isStarProjection()) {
                        return typeProjectionE;
                    }
                    KotlinType kotlinTypeSubstitutionResult = customTypeVariable != null ? customTypeVariable.substitutionResult(typeProjectionE.getType()) : TypeUtils.makeNullableIfNeeded(typeProjectionE.getType(), type.isMarkedNullable());
                    if (!type.getAnnotations().isEmpty()) {
                        kotlinTypeSubstitutionResult = TypeUtilsKt.replaceAnnotations(kotlinTypeSubstitutionResult, new CompositeAnnotations(kotlinTypeSubstitutionResult.getAnnotations(), d(this.a.filterAnnotations(type.getAnnotations()))));
                    }
                    if (dVarC == d.NO_CONFLICT) {
                        projectionKind = combine(projectionKind, typeProjectionE.getProjectionKind());
                    }
                    return new TypeProjectionImpl(projectionKind, kotlinTypeSubstitutionResult);
                }
                typeProjection = g(typeProjection, i);
                if (typeProjection == null) {
                    a(25);
                }
            }
        }
        return typeProjection;
    }

    @NotNull
    public TypeSubstitution getSubstitution() {
        TypeSubstitution typeSubstitution = this.a;
        if (typeSubstitution == null) {
            a(8);
        }
        return typeSubstitution;
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @NotNull
    public TypeSubstitutor replaceWithNonApproximatingSubstitution() {
        TypeSubstitution typeSubstitution = this.a;
        return ((typeSubstitution instanceof IndexedParametersSubstitution) && typeSubstitution.approximateContravariantCapturedTypes()) ? new TypeSubstitutor(new IndexedParametersSubstitution(((IndexedParametersSubstitution) this.a).getParameters(), ((IndexedParametersSubstitution) this.a).getArguments(), false)) : this;
    }

    @NotNull
    public KotlinType safeSubstitute(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (kotlinType == null) {
            a(9);
        }
        if (variance == null) {
            a(10);
        }
        if (isEmpty()) {
            if (kotlinType == null) {
                a(11);
            }
            return kotlinType;
        }
        try {
            KotlinType type = i(new TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e) {
            SimpleType simpleTypeCreateErrorType = ErrorUtils.createErrorType(e.getMessage());
            if (simpleTypeCreateErrorType == null) {
                a(13);
            }
            return simpleTypeCreateErrorType;
        }
    }

    @Nullable
    public KotlinType substitute(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (kotlinType == null) {
            a(14);
        }
        if (variance == null) {
            a(15);
        }
        TypeProjection typeProjectionSubstitute = substitute(new TypeProjectionImpl(variance, getSubstitution().prepareTopLevelType(kotlinType, variance)));
        if (typeProjectionSubstitute == null) {
            return null;
        }
        return typeProjectionSubstitute.getType();
    }

    @Nullable
    public TypeProjection substituteWithoutApproximation(@NotNull TypeProjection typeProjection) {
        if (typeProjection == null) {
            a(17);
        }
        if (isEmpty()) {
            return typeProjection;
        }
        try {
            return i(typeProjection, null, 0);
        } catch (c unused) {
            return null;
        }
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            a(6);
        }
        return create(TypeConstructorSubstitution.create(kotlinType.getConstructor(), kotlinType.getArguments()));
    }

    @NotNull
    public static Variance combine(@NotNull Variance variance, @NotNull Variance variance2) {
        if (variance == null) {
            a(38);
        }
        if (variance2 == null) {
            a(39);
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 == null) {
                a(40);
            }
            return variance2;
        }
        if (variance2 == variance3) {
            if (variance == null) {
                a(41);
            }
            return variance;
        }
        if (variance == variance2) {
            if (variance2 == null) {
                a(42);
            }
            return variance2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    @Nullable
    public TypeProjection substitute(@NotNull TypeProjection typeProjection) {
        if (typeProjection == null) {
            a(16);
        }
        TypeProjection typeProjectionSubstituteWithoutApproximation = substituteWithoutApproximation(typeProjection);
        return (this.a.approximateCapturedTypes() || this.a.approximateContravariantCapturedTypes()) ? CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary(typeProjectionSubstituteWithoutApproximation, this.a.approximateContravariantCapturedTypes()) : typeProjectionSubstituteWithoutApproximation;
    }
}
