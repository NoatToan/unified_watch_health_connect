package o82;

import b63.i;
import b63.o;
import b63.p;
import b63.q;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo82/g;", "", "Lo82/f;", "strategy", "<init>", "(Ljava/lang/String;ILo82/f;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f130849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f130850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f130851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f130852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f130853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f130854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f130855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f130856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f130857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f130858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f130859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ g[] f130860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w13.c f130861n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f130862a;

    static {
        g gVar = new g("CURRENT", 0, new f() { // from class: o82.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o82.f
            public final a a(o oVar, int i14) {
                i.Companion.getClass();
                return new a(q.e(oVar, i14, i.f16190d), null, 2, 0 == true ? 1 : 0);
            }

            @Override // o82.f
            public final o b(o oVar, o oVar2) {
                oVar.getClass();
                return oVar2;
            }

            @Override // o82.f
            public final a c(a aVar) {
                aVar.getClass();
                return aVar;
            }

            @Override // o82.f
            public final a d(a aVar) {
                aVar.getClass();
                return aVar;
            }

            @Override // o82.f
            public final double e(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                return 1.0d;
            }

            @Override // o82.f
            public final o f(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                return oVar2;
            }
        });
        f130849b = gVar;
        final int i14 = 1;
        g gVar2 = new g("ONE_DAY", 1, new f(i14) { // from class: o82.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130845a;

            {
                this.f130845a = i14;
            }

            @Override // o82.f
            public final a a(o oVar, int i15) {
                int i16 = this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                o oVarE = q.e(oVar, i15 * i16, cVar);
                return new a(oVarE, q.e(oVarE, i16 - 1, cVar));
            }

            @Override // o82.f
            public final o b(o oVar, o oVar2) {
                oVar.getClass();
                int iCeil = ((int) Math.ceil(e(oVar, oVar2))) * this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                return q.e(q.c(oVar2, iCeil, cVar), 1, cVar);
            }

            @Override // o82.f
            public final a c(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i15 = this.f130845a;
                o oVarE = q.e(oVar, i15, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarE, q.e(oVar2, i15, cVar));
            }

            @Override // o82.f
            public final a d(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i15 = this.f130845a;
                o oVarC = q.c(oVar, i15, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarC, q.c(oVar2, i15, cVar));
            }

            @Override // o82.f
            public final double e(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                return ((double) (p.a(oVar, oVar2) + 1)) / ((double) this.f130845a);
            }

            @Override // o82.f
            public final o f(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                int iE = ((int) e(oVar, oVar2)) * this.f130845a;
                i.a aVar = i.Companion;
                aVar.getClass();
                i.c cVar = i.f16190d;
                o oVarC = q.c(oVar2, iE, cVar);
                aVar.getClass();
                return q.e(oVarC, 1, cVar);
            }
        });
        f130850c = gVar2;
        final int i15 = 7;
        g gVar3 = new g("ONE_WEEK", 2, new f(i15) { // from class: o82.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130845a;

            {
                this.f130845a = i15;
            }

            @Override // o82.f
            public final a a(o oVar, int i16) {
                int i17 = this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                o oVarE = q.e(oVar, i16 * i17, cVar);
                return new a(oVarE, q.e(oVarE, i17 - 1, cVar));
            }

            @Override // o82.f
            public final o b(o oVar, o oVar2) {
                oVar.getClass();
                int iCeil = ((int) Math.ceil(e(oVar, oVar2))) * this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                return q.e(q.c(oVar2, iCeil, cVar), 1, cVar);
            }

            @Override // o82.f
            public final a c(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i16 = this.f130845a;
                o oVarE = q.e(oVar, i16, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarE, q.e(oVar2, i16, cVar));
            }

            @Override // o82.f
            public final a d(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i16 = this.f130845a;
                o oVarC = q.c(oVar, i16, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarC, q.c(oVar2, i16, cVar));
            }

            @Override // o82.f
            public final double e(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                return ((double) (p.a(oVar, oVar2) + 1)) / ((double) this.f130845a);
            }

            @Override // o82.f
            public final o f(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                int iE = ((int) e(oVar, oVar2)) * this.f130845a;
                i.a aVar = i.Companion;
                aVar.getClass();
                i.c cVar = i.f16190d;
                o oVarC = q.c(oVar2, iE, cVar);
                aVar.getClass();
                return q.e(oVarC, 1, cVar);
            }
        });
        f130851d = gVar3;
        final int i16 = 14;
        g gVar4 = new g("TWO_WEEKS", 3, new f(i16) { // from class: o82.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130845a;

            {
                this.f130845a = i16;
            }

            @Override // o82.f
            public final a a(o oVar, int i17) {
                int i18 = this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                o oVarE = q.e(oVar, i17 * i18, cVar);
                return new a(oVarE, q.e(oVarE, i18 - 1, cVar));
            }

            @Override // o82.f
            public final o b(o oVar, o oVar2) {
                oVar.getClass();
                int iCeil = ((int) Math.ceil(e(oVar, oVar2))) * this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                return q.e(q.c(oVar2, iCeil, cVar), 1, cVar);
            }

            @Override // o82.f
            public final a c(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i17 = this.f130845a;
                o oVarE = q.e(oVar, i17, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarE, q.e(oVar2, i17, cVar));
            }

            @Override // o82.f
            public final a d(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i17 = this.f130845a;
                o oVarC = q.c(oVar, i17, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarC, q.c(oVar2, i17, cVar));
            }

            @Override // o82.f
            public final double e(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                return ((double) (p.a(oVar, oVar2) + 1)) / ((double) this.f130845a);
            }

            @Override // o82.f
            public final o f(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                int iE = ((int) e(oVar, oVar2)) * this.f130845a;
                i.a aVar = i.Companion;
                aVar.getClass();
                i.c cVar = i.f16190d;
                o oVarC = q.c(oVar2, iE, cVar);
                aVar.getClass();
                return q.e(oVarC, 1, cVar);
            }
        });
        f130852e = gVar4;
        final int i17 = 28;
        g gVar5 = new g("FOUR_WEEKS", 4, new f(i17) { // from class: o82.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130845a;

            {
                this.f130845a = i17;
            }

            @Override // o82.f
            public final a a(o oVar, int i18) {
                int i19 = this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                o oVarE = q.e(oVar, i18 * i19, cVar);
                return new a(oVarE, q.e(oVarE, i19 - 1, cVar));
            }

            @Override // o82.f
            public final o b(o oVar, o oVar2) {
                oVar.getClass();
                int iCeil = ((int) Math.ceil(e(oVar, oVar2))) * this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                return q.e(q.c(oVar2, iCeil, cVar), 1, cVar);
            }

            @Override // o82.f
            public final a c(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i18 = this.f130845a;
                o oVarE = q.e(oVar, i18, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarE, q.e(oVar2, i18, cVar));
            }

            @Override // o82.f
            public final a d(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i18 = this.f130845a;
                o oVarC = q.c(oVar, i18, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarC, q.c(oVar2, i18, cVar));
            }

            @Override // o82.f
            public final double e(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                return ((double) (p.a(oVar, oVar2) + 1)) / ((double) this.f130845a);
            }

            @Override // o82.f
            public final o f(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                int iE = ((int) e(oVar, oVar2)) * this.f130845a;
                i.a aVar = i.Companion;
                aVar.getClass();
                i.c cVar = i.f16190d;
                o oVarC = q.c(oVar2, iE, cVar);
                aVar.getClass();
                return q.e(oVarC, 1, cVar);
            }
        });
        f130853f = gVar5;
        final int i18 = 84;
        g gVar6 = new g("TWELVE_WEEKS", 5, new f(i18) { // from class: o82.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130845a;

            {
                this.f130845a = i18;
            }

            @Override // o82.f
            public final a a(o oVar, int i19) {
                int i110 = this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                o oVarE = q.e(oVar, i19 * i110, cVar);
                return new a(oVarE, q.e(oVarE, i110 - 1, cVar));
            }

            @Override // o82.f
            public final o b(o oVar, o oVar2) {
                oVar.getClass();
                int iCeil = ((int) Math.ceil(e(oVar, oVar2))) * this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                return q.e(q.c(oVar2, iCeil, cVar), 1, cVar);
            }

            @Override // o82.f
            public final a c(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i19 = this.f130845a;
                o oVarE = q.e(oVar, i19, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarE, q.e(oVar2, i19, cVar));
            }

            @Override // o82.f
            public final a d(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i19 = this.f130845a;
                o oVarC = q.c(oVar, i19, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarC, q.c(oVar2, i19, cVar));
            }

            @Override // o82.f
            public final double e(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                return ((double) (p.a(oVar, oVar2) + 1)) / ((double) this.f130845a);
            }

            @Override // o82.f
            public final o f(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                int iE = ((int) e(oVar, oVar2)) * this.f130845a;
                i.a aVar = i.Companion;
                aVar.getClass();
                i.c cVar = i.f16190d;
                o oVarC = q.c(oVar2, iE, cVar);
                aVar.getClass();
                return q.e(oVarC, 1, cVar);
            }
        });
        f130854g = gVar6;
        final int i19 = 182;
        final int i24 = 6;
        g gVar7 = new g("TWENTY_SIX_WEEKS", 6, new f(i19) { // from class: o82.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130845a;

            {
                this.f130845a = i19;
            }

            @Override // o82.f
            public final a a(o oVar, int i110) {
                int i111 = this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                o oVarE = q.e(oVar, i110 * i111, cVar);
                return new a(oVarE, q.e(oVarE, i111 - 1, cVar));
            }

            @Override // o82.f
            public final o b(o oVar, o oVar2) {
                oVar.getClass();
                int iCeil = ((int) Math.ceil(e(oVar, oVar2))) * this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                return q.e(q.c(oVar2, iCeil, cVar), 1, cVar);
            }

            @Override // o82.f
            public final a c(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i110 = this.f130845a;
                o oVarE = q.e(oVar, i110, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarE, q.e(oVar2, i110, cVar));
            }

            @Override // o82.f
            public final a d(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i110 = this.f130845a;
                o oVarC = q.c(oVar, i110, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarC, q.c(oVar2, i110, cVar));
            }

            @Override // o82.f
            public final double e(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                return ((double) (p.a(oVar, oVar2) + 1)) / ((double) this.f130845a);
            }

            @Override // o82.f
            public final o f(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                int iE = ((int) e(oVar, oVar2)) * this.f130845a;
                i.a aVar = i.Companion;
                aVar.getClass();
                i.c cVar = i.f16190d;
                o oVarC = q.c(oVar2, iE, cVar);
                aVar.getClass();
                return q.e(oVarC, 1, cVar);
            }
        });
        f130855h = gVar7;
        final int i25 = 364;
        g gVar8 = new g("FIFTY_TWO_WEEKS", 7, new f(i25) { // from class: o82.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130845a;

            {
                this.f130845a = i25;
            }

            @Override // o82.f
            public final a a(o oVar, int i110) {
                int i111 = this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                o oVarE = q.e(oVar, i110 * i111, cVar);
                return new a(oVarE, q.e(oVarE, i111 - 1, cVar));
            }

            @Override // o82.f
            public final o b(o oVar, o oVar2) {
                oVar.getClass();
                int iCeil = ((int) Math.ceil(e(oVar, oVar2))) * this.f130845a;
                i.Companion.getClass();
                i.c cVar = i.f16190d;
                return q.e(q.c(oVar2, iCeil, cVar), 1, cVar);
            }

            @Override // o82.f
            public final a c(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i110 = this.f130845a;
                o oVarE = q.e(oVar, i110, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarE, q.e(oVar2, i110, cVar));
            }

            @Override // o82.f
            public final a d(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.c cVar = i.f16190d;
                int i110 = this.f130845a;
                o oVarC = q.c(oVar, i110, cVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarC, q.c(oVar2, i110, cVar));
            }

            @Override // o82.f
            public final double e(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                return ((double) (p.a(oVar, oVar2) + 1)) / ((double) this.f130845a);
            }

            @Override // o82.f
            public final o f(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                int iE = ((int) e(oVar, oVar2)) * this.f130845a;
                i.a aVar = i.Companion;
                aVar.getClass();
                i.c cVar = i.f16190d;
                o oVarC = q.c(oVar2, iE, cVar);
                aVar.getClass();
                return q.e(oVarC, 1, cVar);
            }
        });
        f130856i = gVar8;
        g gVar9 = new g("MONTHLY", 8, new f(i14) { // from class: o82.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130848a;

            {
                this.f130848a = i14;
            }

            @Override // o82.f
            public final a a(o oVar, int i26) {
                int i27 = this.f130848a;
                i.Companion.getClass();
                i.d dVar = i.f16192f;
                o oVarE = q.e(oVar, i26 * i27, dVar);
                return new a(oVarE, q.c(q.e(oVarE, i27, dVar), 1, i.f16190d));
            }

            @Override // o82.f
            public final o b(o oVar, o oVar2) {
                oVar.getClass();
                int iCeil = ((int) Math.ceil(e(oVar, oVar2))) * this.f130848a;
                i.Companion.getClass();
                i.d dVar = i.f16192f;
                LocalDate localDate = q.e(q.c(oVar2, iCeil, dVar), 1, dVar).f16206a;
                return new o(localDate.getYear(), localDate.getMonthValue(), 1);
            }

            @Override // o82.f
            public final a c(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.d dVar = i.f16192f;
                int i26 = this.f130848a;
                o oVarE = q.e(oVar, i26, dVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarE, q.e(oVar2, i26, dVar));
            }

            @Override // o82.f
            public final a d(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.d dVar = i.f16192f;
                int i26 = this.f130848a;
                o oVarC = q.c(oVar, i26, dVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarC, q.c(oVar2, i26, dVar));
            }

            @Override // o82.f
            public final double e(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                LocalDate localDate = oVar.f16206a;
                o oVar3 = new o(localDate.getYear(), localDate.getMonthValue(), 1);
                LocalDate localDate2 = oVar2.f16206a;
                o oVar4 = new o(localDate2.getYear(), localDate2.getMonthValue(), 1);
                i.Companion.getClass();
                return ((double) d63.c.a(oVar3.f16206a.until(q.e(oVar4, 1, i.f16192f).f16206a, ChronoUnit.MONTHS))) / ((double) this.f130848a);
            }

            @Override // o82.f
            public final o f(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                int iE = ((int) e(oVar, oVar2)) * this.f130848a;
                i.a aVar = i.Companion;
                aVar.getClass();
                i.d dVar = i.f16192f;
                o oVarC = q.c(oVar2, iE, dVar);
                aVar.getClass();
                LocalDate localDate = q.e(oVarC, 1, dVar).f16206a;
                return new o(localDate.getYear(), localDate.getMonthValue(), 1);
            }
        });
        f130857j = gVar9;
        g gVar10 = new g("SIX_MONTHS", 9, new f(i24) { // from class: o82.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130848a;

            {
                this.f130848a = i24;
            }

            @Override // o82.f
            public final a a(o oVar, int i26) {
                int i27 = this.f130848a;
                i.Companion.getClass();
                i.d dVar = i.f16192f;
                o oVarE = q.e(oVar, i26 * i27, dVar);
                return new a(oVarE, q.c(q.e(oVarE, i27, dVar), 1, i.f16190d));
            }

            @Override // o82.f
            public final o b(o oVar, o oVar2) {
                oVar.getClass();
                int iCeil = ((int) Math.ceil(e(oVar, oVar2))) * this.f130848a;
                i.Companion.getClass();
                i.d dVar = i.f16192f;
                LocalDate localDate = q.e(q.c(oVar2, iCeil, dVar), 1, dVar).f16206a;
                return new o(localDate.getYear(), localDate.getMonthValue(), 1);
            }

            @Override // o82.f
            public final a c(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.d dVar = i.f16192f;
                int i26 = this.f130848a;
                o oVarE = q.e(oVar, i26, dVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarE, q.e(oVar2, i26, dVar));
            }

            @Override // o82.f
            public final a d(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.d dVar = i.f16192f;
                int i26 = this.f130848a;
                o oVarC = q.c(oVar, i26, dVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarC, q.c(oVar2, i26, dVar));
            }

            @Override // o82.f
            public final double e(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                LocalDate localDate = oVar.f16206a;
                o oVar3 = new o(localDate.getYear(), localDate.getMonthValue(), 1);
                LocalDate localDate2 = oVar2.f16206a;
                o oVar4 = new o(localDate2.getYear(), localDate2.getMonthValue(), 1);
                i.Companion.getClass();
                return ((double) d63.c.a(oVar3.f16206a.until(q.e(oVar4, 1, i.f16192f).f16206a, ChronoUnit.MONTHS))) / ((double) this.f130848a);
            }

            @Override // o82.f
            public final o f(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                int iE = ((int) e(oVar, oVar2)) * this.f130848a;
                i.a aVar = i.Companion;
                aVar.getClass();
                i.d dVar = i.f16192f;
                o oVarC = q.c(oVar2, iE, dVar);
                aVar.getClass();
                LocalDate localDate = q.e(oVarC, 1, dVar).f16206a;
                return new o(localDate.getYear(), localDate.getMonthValue(), 1);
            }
        });
        f130858k = gVar10;
        final int i26 = 12;
        g gVar11 = new g("TWELVE_MONTHS", 10, new f(i26) { // from class: o82.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f130848a;

            {
                this.f130848a = i26;
            }

            @Override // o82.f
            public final a a(o oVar, int i27) {
                int i28 = this.f130848a;
                i.Companion.getClass();
                i.d dVar = i.f16192f;
                o oVarE = q.e(oVar, i27 * i28, dVar);
                return new a(oVarE, q.c(q.e(oVarE, i28, dVar), 1, i.f16190d));
            }

            @Override // o82.f
            public final o b(o oVar, o oVar2) {
                oVar.getClass();
                int iCeil = ((int) Math.ceil(e(oVar, oVar2))) * this.f130848a;
                i.Companion.getClass();
                i.d dVar = i.f16192f;
                LocalDate localDate = q.e(q.c(oVar2, iCeil, dVar), 1, dVar).f16206a;
                return new o(localDate.getYear(), localDate.getMonthValue(), 1);
            }

            @Override // o82.f
            public final a c(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.d dVar = i.f16192f;
                int i27 = this.f130848a;
                o oVarE = q.e(oVar, i27, dVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarE, q.e(oVar2, i27, dVar));
            }

            @Override // o82.f
            public final a d(a aVar) {
                aVar.getClass();
                o oVar = aVar.f130843a;
                i.a aVar2 = i.Companion;
                aVar2.getClass();
                i.d dVar = i.f16192f;
                int i27 = this.f130848a;
                o oVarC = q.c(oVar, i27, dVar);
                o oVar2 = aVar.f130844b;
                aVar2.getClass();
                return new a(oVarC, q.c(oVar2, i27, dVar));
            }

            @Override // o82.f
            public final double e(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                LocalDate localDate = oVar.f16206a;
                o oVar3 = new o(localDate.getYear(), localDate.getMonthValue(), 1);
                LocalDate localDate2 = oVar2.f16206a;
                o oVar4 = new o(localDate2.getYear(), localDate2.getMonthValue(), 1);
                i.Companion.getClass();
                return ((double) d63.c.a(oVar3.f16206a.until(q.e(oVar4, 1, i.f16192f).f16206a, ChronoUnit.MONTHS))) / ((double) this.f130848a);
            }

            @Override // o82.f
            public final o f(o oVar, o oVar2) {
                oVar.getClass();
                oVar2.getClass();
                int iE = ((int) e(oVar, oVar2)) * this.f130848a;
                i.a aVar = i.Companion;
                aVar.getClass();
                i.d dVar = i.f16192f;
                o oVarC = q.c(oVar2, iE, dVar);
                aVar.getClass();
                LocalDate localDate = q.e(oVarC, 1, dVar).f16206a;
                return new o(localDate.getYear(), localDate.getMonthValue(), 1);
            }
        });
        f130859l = gVar11;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f130860m = gVarArr;
        f130861n = new w13.c(gVarArr);
    }

    private g(String str, int i14, f fVar) {
        super(str, i14);
        this.f130862a = fVar;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f130860m.clone();
    }
}
