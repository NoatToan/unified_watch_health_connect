package u23;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import p13.h0;
import p13.u0;
import p13.w;
import p13.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'w' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class q {
    public static final q A;
    public static final q B;
    public static final q C;
    public static final q D;
    public static final q E;
    public static final q F;
    public static final q H0;
    public static final q I;
    public static final /* synthetic */ q[] I0;
    public static final /* synthetic */ w13.c J0;
    public static final q P;
    public static final q T;
    public static final q X;
    public static final q Y;
    public static final q Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, q> f168245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<q> f168246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<q> f168247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<q> f168248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<q> f168249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List<q> f168250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List<q> f168251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List<q> f168252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List<q> f168253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final List<q> f168254k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final q f168255k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List<q> f168256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List<q> f168257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List<q> f168258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final List<q> f168259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List<q> f168260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f168261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f168262r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f168263t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q f168264v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q f168265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final q f168266x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final q f168267y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final q f168268z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f168269a;

    static {
        q qVar = new q("CLASS", 0, Action.CLASS_ATTRIBUTE, false, 2, null);
        f168262r = qVar;
        q qVar2 = new q("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);
        f168263t = qVar2;
        q qVar3 = new q("TYPE_PARAMETER", 2, "type parameter", false);
        f168264v = qVar3;
        int i14 = 2;
        p005kotlin.jvm.internal.j jVar = null;
        boolean z14 = false;
        q qVar4 = new q("PROPERTY", 3, "property", z14, i14, jVar);
        f168265w = qVar4;
        q qVar5 = new q("FIELD", 4, "field", z14, i14, jVar);
        f168266x = qVar5;
        q qVar6 = new q("LOCAL_VARIABLE", 5, "local variable", z14, i14, jVar);
        f168267y = qVar6;
        q qVar7 = new q("VALUE_PARAMETER", 6, "value parameter", false, 2, null);
        f168268z = qVar7;
        q qVar8 = new q("CONSTRUCTOR", 7, "constructor", false, 2, null);
        A = qVar8;
        q qVar9 = new q("FUNCTION", 8, "function", false, 2, null);
        B = qVar9;
        q qVar10 = new q("PROPERTY_GETTER", 9, "getter", false, 2, null);
        C = qVar10;
        q qVar11 = new q("PROPERTY_SETTER", 10, "setter", false, 2, null);
        D = qVar11;
        q qVar12 = new q("TYPE", 11, "type usage", false);
        E = qVar12;
        q qVar13 = new q("EXPRESSION", 12, "expression", false);
        q qVar14 = new q("FILE", 13, "file", false);
        F = qVar14;
        q qVar15 = new q("TYPEALIAS", 14, "typealias", false);
        q qVar16 = new q("TYPE_PROJECTION", 15, "type projection", false);
        q qVar17 = new q("STAR_PROJECTION", 16, "star projection", false);
        q qVar18 = new q("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
        q qVar19 = new q("CLASS_ONLY", 18, Action.CLASS_ATTRIBUTE, false);
        I = qVar19;
        q qVar20 = new q("OBJECT", 19, "object", false);
        P = qVar20;
        q qVar21 = new q("STANDALONE_OBJECT", 20, "standalone object", false);
        T = qVar21;
        q qVar22 = new q("COMPANION_OBJECT", 21, "companion object", false);
        X = qVar22;
        q qVar23 = new q("INTERFACE", 22, "interface", false);
        Y = qVar23;
        q qVar24 = new q("ENUM_CLASS", 23, "enum class", false);
        Z = qVar24;
        q qVar25 = new q("ENUM_ENTRY", 24, "enum entry", false);
        f168255k0 = qVar25;
        q qVar26 = new q("LOCAL_CLASS", 25, "local class", false);
        H0 = qVar26;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, qVar15, qVar16, qVar17, qVar18, qVar19, qVar20, qVar21, qVar22, qVar23, qVar24, qVar25, qVar26, new q("LOCAL_FUNCTION", 26, "local function", false), new q("MEMBER_FUNCTION", 27, "member function", false), new q("TOP_LEVEL_FUNCTION", 28, "top level function", false), new q("MEMBER_PROPERTY", 29, "member property", false), new q("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false), new q("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false), new q("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false), new q("TOP_LEVEL_PROPERTY", 33, "top level property", false), new q("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false), new q("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false), new q("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false), new q("BACKING_FIELD", 37, "backing field", false, 2, null), new q("INITIALIZER", 38, "initializer", false), new q("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false), new q("LAMBDA_EXPRESSION", 40, "lambda expression", false), new q("ANONYMOUS_FUNCTION", 41, "anonymous function", false), new q("OBJECT_LITERAL", 42, "object literal", false)};
        I0 = qVarArr;
        w13.c cVar = new w13.c(qVarArr);
        J0 = cVar;
        new a(null);
        f168245b = new HashMap<>();
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            q qVar27 = (q) bVar.next();
            f168245b.put(qVar27.name(), qVar27);
        }
        w13.c cVar2 = J0;
        ArrayList arrayListK = n23.j.k(cVar2);
        p13.c.b bVar2 = new p13.c.b();
        while (bVar2.hasNext()) {
            Object next = bVar2.next();
            if (((q) next).f168269a) {
                arrayListK.add(next);
            }
        }
        f168246c = h0.g1(arrayListK);
        f168247d = h0.g1(J0);
        q qVar28 = f168263t;
        q qVar29 = f168262r;
        f168248e = x.k(qVar28, qVar29);
        f168249f = x.k(H0, qVar29);
        f168250g = x.k(I, qVar29);
        q qVar30 = X;
        q qVar31 = P;
        f168251h = x.k(qVar30, qVar31, qVar29);
        f168252i = x.k(T, qVar31, qVar29);
        f168253j = x.k(Y, qVar29);
        f168254k = x.k(Z, qVar29);
        q qVar32 = f168255k0;
        q qVar33 = f168265w;
        q qVar34 = f168266x;
        f168256l = x.k(qVar32, qVar33, qVar34);
        q qVar35 = D;
        f168257m = w.c(qVar35);
        q qVar36 = C;
        f168258n = w.c(qVar36);
        f168259o = w.c(B);
        q qVar37 = F;
        f168260p = w.c(qVar37);
        e eVar = e.CONSTRUCTOR_PARAMETER;
        q qVar38 = f168268z;
        f168261q = u0.e(new o13.p(eVar, qVar38), new o13.p(e.FIELD, qVar34), new o13.p(e.PROPERTY, qVar33), new o13.p(e.FILE, qVar37), new o13.p(e.PROPERTY_GETTER, qVar36), new o13.p(e.PROPERTY_SETTER, qVar35), new o13.p(e.RECEIVER, qVar38), new o13.p(e.SETTER_PARAMETER, qVar38), new o13.p(e.PROPERTY_DELEGATE_FIELD, qVar34));
    }

    public /* synthetic */ q(String str, int i14, String str2, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, str2, (i15 & 2) != 0 ? true : z14);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) I0.clone();
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private q(String str, int i14, String str2, boolean z14) {
        super(str, i14);
        this.f168269a = z14;
    }
}
