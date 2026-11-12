package kotlin.reflect.jvm.internal.impl.util;

import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import java.util.Set;
import kotlin.collections.y;
import kotlin.jvm.JvmField;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorNameConventions {

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
    public static final Set<Name> SIMPLE_UNARY_OPERATION_NAMES;

    @JvmField
    @NotNull
    public static final Name TIMES;

    @JvmField
    @NotNull
    public static final Name TIMES_ASSIGN;

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
        GET_VALUE = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("setValue");
        SET_VALUE = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("provideDelegate");
        PROVIDE_DELEGATE = nameIdentifier3;
        EQUALS = Name.identifier("equals");
        COMPARE_TO = Name.identifier("compareTo");
        CONTAINS = Name.identifier(SearchCriteria.CONTAINS);
        INVOKE = Name.identifier("invoke");
        ITERATOR = Name.identifier("iterator");
        GET = Name.identifier("get");
        SET = Name.identifier(WatchFaceArrivingEvent.CMD_SET);
        NEXT = Name.identifier("next");
        HAS_NEXT = Name.identifier("hasNext");
        TO_STRING = Name.identifier("toString");
        COMPONENT_REGEX = new Regex("component\\d+");
        AND = Name.identifier(SearchCriteria.AND);
        OR = Name.identifier(SearchCriteria.OR);
        XOR = Name.identifier("xor");
        INV = Name.identifier("inv");
        SHL = Name.identifier("shl");
        SHR = Name.identifier("shr");
        USHR = Name.identifier("ushr");
        Name nameIdentifier4 = Name.identifier("inc");
        INC = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("dec");
        DEC = nameIdentifier5;
        Name nameIdentifier6 = Name.identifier("plus");
        PLUS = nameIdentifier6;
        Name nameIdentifier7 = Name.identifier("minus");
        MINUS = nameIdentifier7;
        Name nameIdentifier8 = Name.identifier("not");
        NOT = nameIdentifier8;
        Name nameIdentifier9 = Name.identifier("unaryMinus");
        UNARY_MINUS = nameIdentifier9;
        Name nameIdentifier10 = Name.identifier("unaryPlus");
        UNARY_PLUS = nameIdentifier10;
        Name nameIdentifier11 = Name.identifier("times");
        TIMES = nameIdentifier11;
        Name nameIdentifier12 = Name.identifier(com.google.android.exoplayer2.text.ttml.b.q);
        DIV = nameIdentifier12;
        Name nameIdentifier13 = Name.identifier("mod");
        MOD = nameIdentifier13;
        Name nameIdentifier14 = Name.identifier("rem");
        REM = nameIdentifier14;
        Name nameIdentifier15 = Name.identifier("rangeTo");
        RANGE_TO = nameIdentifier15;
        Name nameIdentifier16 = Name.identifier("timesAssign");
        TIMES_ASSIGN = nameIdentifier16;
        Name nameIdentifier17 = Name.identifier("divAssign");
        DIV_ASSIGN = nameIdentifier17;
        Name nameIdentifier18 = Name.identifier("modAssign");
        MOD_ASSIGN = nameIdentifier18;
        Name nameIdentifier19 = Name.identifier("remAssign");
        REM_ASSIGN = nameIdentifier19;
        Name nameIdentifier20 = Name.identifier("plusAssign");
        PLUS_ASSIGN = nameIdentifier20;
        Name nameIdentifier21 = Name.identifier("minusAssign");
        MINUS_ASSIGN = nameIdentifier21;
        UNARY_OPERATION_NAMES = y.setOf((Object[]) new Name[]{nameIdentifier4, nameIdentifier5, nameIdentifier10, nameIdentifier9, nameIdentifier8});
        SIMPLE_UNARY_OPERATION_NAMES = y.setOf((Object[]) new Name[]{nameIdentifier10, nameIdentifier9, nameIdentifier8});
        BINARY_OPERATION_NAMES = y.setOf((Object[]) new Name[]{nameIdentifier11, nameIdentifier6, nameIdentifier7, nameIdentifier12, nameIdentifier13, nameIdentifier14, nameIdentifier15});
        ASSIGNMENT_OPERATIONS = y.setOf((Object[]) new Name[]{nameIdentifier16, nameIdentifier17, nameIdentifier18, nameIdentifier19, nameIdentifier20, nameIdentifier21});
        DELEGATED_PROPERTY_OPERATORS = y.setOf((Object[]) new Name[]{nameIdentifier, nameIdentifier2, nameIdentifier3});
    }

    private OperatorNameConventions() {
    }
}
