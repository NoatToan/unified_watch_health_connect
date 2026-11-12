package r43;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF7' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static final k A;
    public static final k B;
    public static final k C;
    public static final k D;
    public static final k E;
    public static final k F;
    public static final k I;
    public static final /* synthetic */ k[] P;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f150364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f150365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f150366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f150367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f150368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f150369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f150370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f150371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f150372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k f150373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k f150374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k f150375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k f150376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k f150377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f150378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k f150379r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f150380t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k f150381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k f150382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k f150383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final k f150384y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final k f150385z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f150387b;

    /* JADX INFO: Fake field, exist only in values array */
    k EF1;

    /* JADX INFO: Fake field, exist only in values array */
    k EF2;

    /* JADX INFO: Fake field, exist only in values array */
    k EF3;

    /* JADX INFO: Fake field, exist only in values array */
    k EF5;

    /* JADX INFO: Fake field, exist only in values array */
    k EF7;

    static {
        k kVar = new k("UNRESOLVED_TYPE", 0, "Unresolved type for %s", true);
        k kVar2 = new k("UNRESOLVED_TYPE_PARAMETER_TYPE", 1, "Unresolved type parameter type", true);
        k kVar3 = new k("UNRESOLVED_CLASS_TYPE", 2, "Unresolved class %s", true);
        k kVar4 = new k("UNRESOLVED_JAVA_CLASS", 3, "Unresolved java class %s", true);
        f150364c = kVar4;
        k kVar5 = new k("UNRESOLVED_DECLARATION", 4, "Unresolved declaration %s", true);
        k kVar6 = new k("UNRESOLVED_KCLASS_CONSTANT_VALUE", 5, "Unresolved type for %s (arrayDimensions=%s)", true);
        f150365d = kVar6;
        p005kotlin.jvm.internal.j jVar = null;
        k kVar7 = new k("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", false, 2, jVar);
        k kVar8 = new k("RETURN_TYPE", 7, "Return type for %s cannot be resolved", false, 2, null);
        k kVar9 = new k("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", false, 2, null);
        f150366e = kVar9;
        k kVar10 = new k("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", false, 2, jVar);
        k kVar11 = new k("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", false, 2, null);
        k kVar12 = new k("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", false, 2, null);
        k kVar13 = new k("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", false, 2, null);
        k kVar14 = new k("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", false, 2, null);
        k kVar15 = new k("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", false, 2, null);
        k kVar16 = new k("RECURSIVE_TYPE", 15, "Recursive type", false, 2, null);
        k kVar17 = new k("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", false, 2, null);
        f150367f = kVar17;
        k kVar18 = new k("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", false, 2, null);
        k kVar19 = new k("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", false, 2, null);
        f150368g = kVar19;
        k kVar20 = new k("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", false, 2, null);
        f150369h = kVar20;
        k kVar21 = new k("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", false, 2, null);
        k kVar22 = new k("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", false, 2, null);
        f150370i = kVar22;
        k kVar23 = new k("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", false, 2, null);
        f150371j = kVar23;
        k kVar24 = new k("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", false, 2, null);
        k kVar25 = new k("ERROR_EXPECTED_TYPE", 24, "Error expected type", false, 2, null);
        k kVar26 = new k("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", false, 2, null);
        k kVar27 = new k("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", false, 2, null);
        k kVar28 = new k("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", false, 2, null);
        f150372k = kVar28;
        k kVar29 = new k("DONT_CARE", 28, "Special DONT_CARE type", false, 2, null);
        f150373l = kVar29;
        k kVar30 = new k("STUB_TYPE", 29, "Stub type %s", false, 2, null);
        k kVar31 = new k("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", false, 2, null);
        k kVar32 = new k("TYPE_FOR_COMPILER_EXCEPTION", 31, "Error type for a compiler exception while analyzing %s", false, 2, null);
        k kVar33 = new k("ERROR_FLEXIBLE_TYPE", 32, "Error java flexible type with id %s. (%s..%s)", false, 2, null);
        f150374m = kVar33;
        k kVar34 = new k("ERROR_RAW_TYPE", 33, "Error raw type %s", false, 2, null);
        f150375n = kVar34;
        k kVar35 = new k("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 34, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false, 2, null);
        k kVar36 = new k("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 35, "Illegal type range for dynamic type %s..%s", false, 2, null);
        k kVar37 = new k("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 36, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", false, 2, null);
        f150376o = kVar37;
        k kVar38 = new k("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 37, "Couldn't deserialize type parameter %s in %s", false, 2, null);
        f150377p = kVar38;
        k kVar39 = new k("INCONSISTENT_SUSPEND_FUNCTION", 38, "Inconsistent suspend function type in metadata with constructor %s", false, 2, null);
        f150378q = kVar39;
        k kVar40 = new k("UNEXPECTED_FLEXIBLE_TYPE_ID", 39, "Unexpected id of a flexible type %s. (%s..%s)", false, 2, null);
        k kVar41 = new k("UNKNOWN_TYPE", 40, "Unknown type", false, 2, null);
        f150379r = kVar41;
        k kVar42 = new k("NO_TYPE_SPECIFIED", 41, "No type specified for %s", false, 2, null);
        k kVar43 = new k("NO_TYPE_FOR_LOOP_RANGE", 42, "Loop range has no type", false, 2, null);
        k kVar44 = new k("NO_TYPE_FOR_LOOP_PARAMETER", 43, "Loop parameter has no type", false, 2, null);
        k kVar45 = new k("MISSED_TYPE_FOR_PARAMETER", 44, "Missed a type for a value parameter %s", false, 2, null);
        k kVar46 = new k("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 45, "Missed a type argument for a type parameter %s", false, 2, null);
        f150380t = kVar46;
        k kVar47 = new k("PARSE_ERROR_ARGUMENT", 46, "Error type for parse error argument %s", false, 2, null);
        k kVar48 = new k("STAR_PROJECTION_IN_CALL", 47, "Error type for star projection directly passing as a call type argument", false, 2, null);
        k kVar49 = new k("PROHIBITED_DYNAMIC_TYPE", 48, "Dynamic type in a not allowed context", false, 2, null);
        k kVar50 = new k("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 49, "Not an annotation type %s in the annotation context", false, 2, null);
        k kVar51 = new k("UNIT_RETURN_TYPE_FOR_INC_DEC", 50, "Unit type returned by inc or dec", false, 2, null);
        k kVar52 = new k("RETURN_NOT_ALLOWED", 51, "Return not allowed", false, 2, null);
        k kVar53 = new k("UNRESOLVED_PARCEL_TYPE", 52, "Unresolved 'Parcel' type", true);
        k kVar54 = new k("KAPT_ERROR_TYPE", 53, "Kapt error type", false, 2, null);
        k kVar55 = new k("SYNTHETIC_ELEMENT_ERROR_TYPE", 54, "Error type for synthetic element", false, 2, null);
        k kVar56 = new k("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 55, "Error type in ad hoc resolve for lighter classes", false, 2, null);
        k kVar57 = new k("ERROR_EXPRESSION_TYPE", 56, "Error expression type", false, 2, null);
        k kVar58 = new k("ERROR_RECEIVER_TYPE", 57, "Error receiver type for %s", false, 2, null);
        k kVar59 = new k("ERROR_CONSTANT_VALUE", 58, "Error constant value %s", false, 2, null);
        f150381v = kVar59;
        k kVar60 = new k("EMPTY_CALLABLE_REFERENCE", 59, "Empty callable reference", false, 2, null);
        k kVar61 = new k("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 60, "Unsupported callable reference type %s", false, 2, null);
        k kVar62 = new k("TYPE_FOR_DELEGATION", 61, "Error delegation type for %s", false, 2, null);
        k kVar63 = new k("UNAVAILABLE_TYPE_FOR_DECLARATION", 62, "Type is unavailable for declaration %s", false, 2, null);
        k kVar64 = new k("ERROR_TYPE_PARAMETER", 63, "Error type parameter", false, 2, null);
        k kVar65 = new k("ERROR_TYPE_PROJECTION", 64, "Error type projection", false, 2, null);
        k kVar66 = new k("ERROR_SUPER_TYPE", 65, "Error super type", false, 2, null);
        k kVar67 = new k("SUPER_TYPE_FOR_ERROR_TYPE", 66, "Supertype of error type %s", false, 2, null);
        k kVar68 = new k("ERROR_PROPERTY_TYPE", 67, "Error property type", false, 2, null);
        f150382w = kVar68;
        k kVar69 = new k("ERROR_CLASS", 68, "Error class", false, 2, null);
        f150383x = kVar69;
        k kVar70 = new k("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 69, "Type for error type constructor (%s)", false, 2, null);
        f150384y = kVar70;
        k kVar71 = new k("INTERSECTION_OF_ERROR_TYPES", 70, "Intersection of error types %s", false, 2, null);
        f150385z = kVar71;
        k kVar72 = new k("CANNOT_COMPUTE_ERASED_BOUND", 71, "Cannot compute erased upper bound of a type parameter %s", false, 2, null);
        A = kVar72;
        k kVar73 = new k("NOT_FOUND_UNSIGNED_TYPE", 72, "Unsigned type %s not found", false, 2, null);
        B = kVar73;
        k kVar74 = new k("ERROR_ENUM_TYPE", 73, "Not found the corresponding enum class for given enum entry %s.%s", false, 2, null);
        C = kVar74;
        k kVar75 = new k("NO_RECORDED_TYPE", 74, "Not found recorded type for %s", false, 2, null);
        D = kVar75;
        k kVar76 = new k("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 75, "Descriptor not found for function %s", false, 2, null);
        k kVar77 = new k("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 76, "Cannot build class type, descriptor not found for builder %s", false, 2, null);
        k kVar78 = new k("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 77, "Cannot build type parameter type, descriptor not found for builder %s", false, 2, null);
        k kVar79 = new k("UNMAPPED_ANNOTATION_TARGET_TYPE", 78, "Type for unmapped Java annotation target to Kotlin one", false, 2, null);
        E = kVar79;
        k kVar80 = new k("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 79, "Unknown type for an array element of a java annotation argument", false, 2, null);
        F = kVar80;
        k kVar81 = new k("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 80, "No fqName for annotation %s", false, 2, null);
        I = kVar81;
        P = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18, kVar19, kVar20, kVar21, kVar22, kVar23, kVar24, kVar25, kVar26, kVar27, kVar28, kVar29, kVar30, kVar31, kVar32, kVar33, kVar34, kVar35, kVar36, kVar37, kVar38, kVar39, kVar40, kVar41, kVar42, kVar43, kVar44, kVar45, kVar46, kVar47, kVar48, kVar49, kVar50, kVar51, kVar52, kVar53, kVar54, kVar55, kVar56, kVar57, kVar58, kVar59, kVar60, kVar61, kVar62, kVar63, kVar64, kVar65, kVar66, kVar67, kVar68, kVar69, kVar70, kVar71, kVar72, kVar73, kVar74, kVar75, kVar76, kVar77, kVar78, kVar79, kVar80, kVar81, new k("NOT_FOUND_FQNAME", 81, "No fqName for %s", false, 2, null), new k("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 82, "Type for generated error expression", false, 2, null)};
    }

    public /* synthetic */ k(String str, int i14, String str2, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, str2, (i15 & 2) != 0 ? false : z14);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) P.clone();
    }

    private k(String str, int i14, String str2, boolean z14) {
        super(str, i14);
        this.f150386a = str2;
        this.f150387b = z14;
    }
}
