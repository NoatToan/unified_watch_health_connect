package kotlin.reflect.jvm.internal.impl.util;

import com.mi.health.course.export.data.CourseConfigModel;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes4.dex */
public final class OperatorNameConventions {

    @JvmField
    @NotNull
    public static final Set<Name> ALL_BINARY_OPERATION_NAMES;

    @JvmField
    @NotNull
    public static final Name AND;

    @JvmField
    @NotNull
    public static final Set<Name> ASSIGNMENT_OPERATIONS;

    @JvmField
    @NotNull
    public static final Set<Name> BINARY_OPERATION_NAMES;

    @JvmField
    @NotNull
    public static final Set<Name> BITWISE_OPERATION_NAMES;

    @JvmField
    @NotNull
    public static final Name COMPARE_TO;

    @JvmField
    @NotNull
    public static final Regex COMPONENT_REGEX;

    @JvmField
    @NotNull
    public static final Name CONTAINS;

    @JvmField
    @NotNull
    public static final Name DEC;

    @JvmField
    @NotNull
    public static final Set<Name> DELEGATED_PROPERTY_OPERATORS;

    @JvmField
    @NotNull
    public static final Name DIV;

    @JvmField
    @NotNull
    public static final Name DIV_ASSIGN;

    @JvmField
    @NotNull
    public static final Name EQUALS;

    @JvmField
    @NotNull
    public static final Name GET;

    @JvmField
    @NotNull
    public static final Name GET_VALUE;

    @JvmField
    @NotNull
    public static final Name HASH_CODE;

    @JvmField
    @NotNull
    public static final Name HAS_NEXT;

    @JvmField
    @NotNull
    public static final Name INC;

    @NotNull
    public static final OperatorNameConventions INSTANCE = new OperatorNameConventions();

    @JvmField
    @NotNull
    public static final Name INV;

    @JvmField
    @NotNull
    public static final Name INVOKE;

    @JvmField
    @NotNull
    public static final Name ITERATOR;

    @JvmField
    @NotNull
    public static final Name MINUS;

    @JvmField
    @NotNull
    public static final Name MINUS_ASSIGN;

    @JvmField
    @NotNull
    public static final Name MOD;

    @JvmField
    @NotNull
    public static final Name MOD_ASSIGN;

    @JvmField
    @NotNull
    public static final Map<Name, Name> MOD_OPERATORS_REPLACEMENT;

    @JvmField
    @NotNull
    public static final Name NEXT;

    @JvmField
    @NotNull
    public static final Name NOT;

    @JvmField
    @NotNull
    public static final Name OR;

    @JvmField
    @NotNull
    public static final Name PLUS;

    @JvmField
    @NotNull
    public static final Name PLUS_ASSIGN;

    @JvmField
    @NotNull
    public static final Name PROVIDE_DELEGATE;

    @JvmField
    @NotNull
    public static final Name RANGE_TO;

    @JvmField
    @NotNull
    public static final Name RANGE_UNTIL;

    @JvmField
    @NotNull
    public static final Name REM;

    @JvmField
    @NotNull
    public static final Name REM_ASSIGN;

    @JvmField
    @NotNull
    public static final Name SET;

    @JvmField
    @NotNull
    public static final Name SET_VALUE;

    @JvmField
    @NotNull
    public static final Name SHL;

    @JvmField
    @NotNull
    public static final Name SHR;

    @JvmField
    @NotNull
    public static final Set<Name> SIMPLE_BINARY_OPERATION_NAMES;

    @JvmField
    @NotNull
    public static final Set<Name> SIMPLE_BITWISE_OPERATION_NAMES;

    @JvmField
    @NotNull
    public static final Set<Name> SIMPLE_UNARY_OPERATION_NAMES;

    @JvmField
    @NotNull
    public static final Set<Name> STATEMENT_LIKE_OPERATORS;

    @JvmField
    @NotNull
    public static final Name TIMES;

    @JvmField
    @NotNull
    public static final Name TIMES_ASSIGN;

    @NotNull
    private static final Map<Name, String> TOKENS_BY_OPERATOR_NAME;

    @JvmField
    @NotNull
    public static final Name TO_STRING;

    @JvmField
    @NotNull
    public static final Name UNARY_MINUS;

    @JvmField
    @NotNull
    public static final Set<Name> UNARY_OPERATION_NAMES;

    @JvmField
    @NotNull
    public static final Name UNARY_PLUS;

    @JvmField
    @NotNull
    public static final Name USHR;

    @JvmField
    @NotNull
    public static final Name XOR;

    static {
        Name nameIdentifier = Name.identifier("getValue");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        GET_VALUE = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("setValue");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        SET_VALUE = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("provideDelegate");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
        PROVIDE_DELEGATE = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("equals");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier4, "identifier(...)");
        EQUALS = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("hashCode");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier5, "identifier(...)");
        HASH_CODE = nameIdentifier5;
        Name nameIdentifier6 = Name.identifier("compareTo");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier6, "identifier(...)");
        COMPARE_TO = nameIdentifier6;
        Name nameIdentifier7 = Name.identifier("contains");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier7, "identifier(...)");
        CONTAINS = nameIdentifier7;
        Name nameIdentifier8 = Name.identifier("invoke");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier8, "identifier(...)");
        INVOKE = nameIdentifier8;
        Name nameIdentifier9 = Name.identifier("iterator");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier9, "identifier(...)");
        ITERATOR = nameIdentifier9;
        Name nameIdentifier10 = Name.identifier("get");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier10, "identifier(...)");
        GET = nameIdentifier10;
        Name nameIdentifier11 = Name.identifier(CourseConfigModel.DevCmd.CMD_ACTION_SET);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier11, "identifier(...)");
        SET = nameIdentifier11;
        Name nameIdentifier12 = Name.identifier("next");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier12, "identifier(...)");
        NEXT = nameIdentifier12;
        Name nameIdentifier13 = Name.identifier("hasNext");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier13, "identifier(...)");
        HAS_NEXT = nameIdentifier13;
        Name nameIdentifier14 = Name.identifier("toString");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier14, "identifier(...)");
        TO_STRING = nameIdentifier14;
        COMPONENT_REGEX = new Regex("component\\d+");
        Name nameIdentifier15 = Name.identifier("and");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier15, "identifier(...)");
        AND = nameIdentifier15;
        Name nameIdentifier16 = Name.identifier("or");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier16, "identifier(...)");
        OR = nameIdentifier16;
        Name nameIdentifier17 = Name.identifier("xor");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier17, "identifier(...)");
        XOR = nameIdentifier17;
        Name nameIdentifier18 = Name.identifier("inv");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier18, "identifier(...)");
        INV = nameIdentifier18;
        Name nameIdentifier19 = Name.identifier("shl");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier19, "identifier(...)");
        SHL = nameIdentifier19;
        Name nameIdentifier20 = Name.identifier("shr");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier20, "identifier(...)");
        SHR = nameIdentifier20;
        Name nameIdentifier21 = Name.identifier("ushr");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier21, "identifier(...)");
        USHR = nameIdentifier21;
        Name nameIdentifier22 = Name.identifier("inc");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier22, "identifier(...)");
        INC = nameIdentifier22;
        Name nameIdentifier23 = Name.identifier("dec");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier23, "identifier(...)");
        DEC = nameIdentifier23;
        Name nameIdentifier24 = Name.identifier("plus");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier24, "identifier(...)");
        PLUS = nameIdentifier24;
        Name nameIdentifier25 = Name.identifier("minus");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier25, "identifier(...)");
        MINUS = nameIdentifier25;
        Name nameIdentifier26 = Name.identifier("not");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier26, "identifier(...)");
        NOT = nameIdentifier26;
        Name nameIdentifier27 = Name.identifier("unaryMinus");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier27, "identifier(...)");
        UNARY_MINUS = nameIdentifier27;
        Name nameIdentifier28 = Name.identifier("unaryPlus");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier28, "identifier(...)");
        UNARY_PLUS = nameIdentifier28;
        Name nameIdentifier29 = Name.identifier("times");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier29, "identifier(...)");
        TIMES = nameIdentifier29;
        Name nameIdentifier30 = Name.identifier("div");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier30, "identifier(...)");
        DIV = nameIdentifier30;
        Name nameIdentifier31 = Name.identifier("mod");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier31, "identifier(...)");
        MOD = nameIdentifier31;
        Name nameIdentifier32 = Name.identifier("rem");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier32, "identifier(...)");
        REM = nameIdentifier32;
        Name nameIdentifier33 = Name.identifier("rangeTo");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier33, "identifier(...)");
        RANGE_TO = nameIdentifier33;
        Name nameIdentifier34 = Name.identifier("rangeUntil");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier34, "identifier(...)");
        RANGE_UNTIL = nameIdentifier34;
        Name nameIdentifier35 = Name.identifier("timesAssign");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier35, "identifier(...)");
        TIMES_ASSIGN = nameIdentifier35;
        Name nameIdentifier36 = Name.identifier("divAssign");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier36, "identifier(...)");
        DIV_ASSIGN = nameIdentifier36;
        Name nameIdentifier37 = Name.identifier("modAssign");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier37, "identifier(...)");
        MOD_ASSIGN = nameIdentifier37;
        Name nameIdentifier38 = Name.identifier("remAssign");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier38, "identifier(...)");
        REM_ASSIGN = nameIdentifier38;
        Name nameIdentifier39 = Name.identifier("plusAssign");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier39, "identifier(...)");
        PLUS_ASSIGN = nameIdentifier39;
        Name nameIdentifier40 = Name.identifier("minusAssign");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier40, "identifier(...)");
        MINUS_ASSIGN = nameIdentifier40;
        UNARY_OPERATION_NAMES = SetsKt__SetsKt.setOf((Object[]) new Name[]{nameIdentifier22, nameIdentifier23, nameIdentifier28, nameIdentifier27, nameIdentifier26, nameIdentifier18});
        SIMPLE_UNARY_OPERATION_NAMES = SetsKt__SetsKt.setOf((Object[]) new Name[]{nameIdentifier28, nameIdentifier27, nameIdentifier26, nameIdentifier18});
        Set<Name> of = SetsKt__SetsKt.setOf((Object[]) new Name[]{nameIdentifier29, nameIdentifier24, nameIdentifier25, nameIdentifier30, nameIdentifier31, nameIdentifier32, nameIdentifier33, nameIdentifier34});
        BINARY_OPERATION_NAMES = of;
        SIMPLE_BINARY_OPERATION_NAMES = SetsKt__SetsKt.setOf((Object[]) new Name[]{nameIdentifier29, nameIdentifier24, nameIdentifier25, nameIdentifier30, nameIdentifier31, nameIdentifier32});
        Set<Name> of2 = SetsKt__SetsKt.setOf((Object[]) new Name[]{nameIdentifier15, nameIdentifier16, nameIdentifier17, nameIdentifier18, nameIdentifier19, nameIdentifier20, nameIdentifier21});
        BITWISE_OPERATION_NAMES = of2;
        SIMPLE_BITWISE_OPERATION_NAMES = SetsKt__SetsKt.setOf((Object[]) new Name[]{nameIdentifier15, nameIdentifier16, nameIdentifier17, nameIdentifier19, nameIdentifier20, nameIdentifier21});
        ALL_BINARY_OPERATION_NAMES = SetsKt___SetsKt.plus(SetsKt___SetsKt.plus((Set) of, (Iterable) of2), (Iterable) SetsKt__SetsKt.setOf((Object[]) new Name[]{nameIdentifier4, nameIdentifier7, nameIdentifier6}));
        Set<Name> of3 = SetsKt__SetsKt.setOf((Object[]) new Name[]{nameIdentifier35, nameIdentifier36, nameIdentifier37, nameIdentifier38, nameIdentifier39, nameIdentifier40});
        ASSIGNMENT_OPERATIONS = of3;
        DELEGATED_PROPERTY_OPERATORS = SetsKt__SetsKt.setOf((Object[]) new Name[]{nameIdentifier, nameIdentifier2, nameIdentifier3});
        MOD_OPERATORS_REPLACEMENT = MapsKt__MapsKt.mapOf(TuplesKt.to(nameIdentifier31, nameIdentifier32), TuplesKt.to(nameIdentifier37, nameIdentifier38));
        STATEMENT_LIKE_OPERATORS = SetsKt___SetsKt.plus(SetsKt__SetsJVMKt.setOf(nameIdentifier11), (Iterable) of3);
        TOKENS_BY_OPERATOR_NAME = MapsKt__MapsKt.mapOf(TuplesKt.to(nameIdentifier22, "++"), TuplesKt.to(nameIdentifier23, "--"), TuplesKt.to(nameIdentifier28, Marker.ANY_NON_NULL_MARKER), TuplesKt.to(nameIdentifier27, "-"), TuplesKt.to(nameIdentifier26, "!"), TuplesKt.to(nameIdentifier29, Marker.ANY_MARKER), TuplesKt.to(nameIdentifier24, Marker.ANY_NON_NULL_MARKER), TuplesKt.to(nameIdentifier25, "-"), TuplesKt.to(nameIdentifier30, "/"), TuplesKt.to(nameIdentifier32, "%"), TuplesKt.to(nameIdentifier33, ".."), TuplesKt.to(nameIdentifier34, "..<"));
    }

    private OperatorNameConventions() {
    }
}
