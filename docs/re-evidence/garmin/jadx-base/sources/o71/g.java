package o71;

import com.garmin.android.apps.connectmobile.v2;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.r;
import e32.o;
import o13.m;
import o13.t;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014Bo\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00124\u0010\u000b\u001a0\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004\u0012\u001e\u0010\u000f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lo71/g;", "", "Le32/o;", "summaryTimeInterval", "Lkotlin/Function4;", "Lo71/i;", "Lorg/joda/time/LocalDate;", "Lt13/d;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lo71/e;", "", "requestStrengthStats", "Lkotlin/Function1;", "Lj23/g;", "Lc53/j;", "dateEnumerator", "Lorg/joda/time/ReadablePeriod;", "diffForPast", "<init>", "(Ljava/lang/String;ILe32/o;Le23/r;Le23/l;Lorg/joda/time/ReadablePeriod;)V", JWKParameterNames.OCT_KEY_VALUE, "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f130199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f130200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f130201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f130202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f130203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f130204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f130205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ g[] f130206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w13.c f130207m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f130208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<o71.i, LocalDate, LocalDate, t13.d<? super v2<o71.e>>, Object> f130209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<j23.g<LocalDate>, c53.j<LocalDate>> f130210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReadablePeriod f130211d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements e23.l<j23.g<LocalDate>, c53.j<? extends LocalDate>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f130212a = new a();

        public a() {
            super(1, n71.f.class, "daysIn", "daysIn(Lkotlin/ranges/ClosedRange;)Lkotlin/sequences/Sequence;", 1);
        }

        @Override // e23.l
        public final c53.j<? extends LocalDate> invoke(j23.g<LocalDate> gVar) {
            j23.g<LocalDate> gVar2 = gVar;
            gVar2.getClass();
            t tVar = n71.f.f124834a;
            return n71.f.b(gVar2, n71.c.f124831a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements r<o71.i, LocalDate, LocalDate, t13.d<? super v2<? extends o71.e>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f130213a = new b();

        public b() {
            super(4, o71.i.class, "getSevenDaysStats", "getSevenDaysStats(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Object invoke(o71.i iVar, LocalDate localDate, LocalDate localDate2, t13.d<? super v2<? extends o71.e>> dVar) {
            o71.i iVar2 = iVar;
            iVar2.getClass();
            return iVar2.A4(g.f130201g, localDate, localDate2, dVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.l<j23.g<LocalDate>, c53.j<? extends LocalDate>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f130214a = new c();

        public c() {
            super(1, n71.f.class, "daysIn", "daysIn(Lkotlin/ranges/ClosedRange;)Lkotlin/sequences/Sequence;", 1);
        }

        @Override // e23.l
        public final c53.j<? extends LocalDate> invoke(j23.g<LocalDate> gVar) {
            j23.g<LocalDate> gVar2 = gVar;
            gVar2.getClass();
            t tVar = n71.f.f124834a;
            return n71.f.b(gVar2, n71.c.f124831a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements r<o71.i, LocalDate, LocalDate, t13.d<? super v2<? extends o71.e>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f130215a = new d();

        public d() {
            super(4, o71.i.class, "getFourWeeksStats", "getFourWeeksStats(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Object invoke(o71.i iVar, LocalDate localDate, LocalDate localDate2, t13.d<? super v2<? extends o71.e>> dVar) {
            o71.i iVar2 = iVar;
            iVar2.getClass();
            return iVar2.A4(g.f130202h, localDate, localDate2, dVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements e23.l<j23.g<LocalDate>, c53.j<? extends LocalDate>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f130216a = new e();

        public e() {
            super(1, n71.f.class, "daysIn", "daysIn(Lkotlin/ranges/ClosedRange;)Lkotlin/sequences/Sequence;", 1);
        }

        @Override // e23.l
        public final c53.j<? extends LocalDate> invoke(j23.g<LocalDate> gVar) {
            j23.g<LocalDate> gVar2 = gVar;
            gVar2.getClass();
            t tVar = n71.f.f124834a;
            return n71.f.b(gVar2, n71.c.f124831a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends q implements r<o71.i, LocalDate, LocalDate, t13.d<? super v2<? extends o71.e>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f130217a = new f();

        public f() {
            super(4, o71.i.class, "getTwelveWeeksStats", "getTwelveWeeksStats(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Object invoke(o71.i iVar, LocalDate localDate, LocalDate localDate2, t13.d<? super v2<? extends o71.e>> dVar) {
            return iVar.D4(localDate, localDate2, dVar);
        }
    }

    /* JADX INFO: renamed from: o71.g$g, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class C2481g extends q implements e23.l<j23.g<LocalDate>, c53.j<? extends LocalDate>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2481g f130218a = new C2481g();

        public C2481g() {
            super(1, n71.f.class, "daysOfWeekIn", "daysOfWeekIn(Lkotlin/ranges/ClosedRange;)Lkotlin/sequences/Sequence;", 1);
        }

        @Override // e23.l
        public final c53.j<? extends LocalDate> invoke(j23.g<LocalDate> gVar) {
            j23.g<LocalDate> gVar2 = gVar;
            gVar2.getClass();
            t tVar = n71.f.f124834a;
            return n71.f.b(gVar2, n71.e.f124833a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class h extends q implements r<o71.i, LocalDate, LocalDate, t13.d<? super v2<? extends o71.e>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f130219a = new h();

        public h() {
            super(4, o71.i.class, "getOneYearStats", "getOneYearStats(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Object invoke(o71.i iVar, LocalDate localDate, LocalDate localDate2, t13.d<? super v2<? extends o71.e>> dVar) {
            return iVar.C4(localDate, localDate2, dVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class i extends q implements e23.l<j23.g<LocalDate>, c53.j<? extends LocalDate>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f130220a = new i();

        public i() {
            super(1, n71.f.class, "daysOfMonthIn", "daysOfMonthIn(Lkotlin/ranges/ClosedRange;)Lkotlin/sequences/Sequence;", 1);
        }

        @Override // e23.l
        public final c53.j<? extends LocalDate> invoke(j23.g<LocalDate> gVar) {
            j23.g<LocalDate> gVar2 = gVar;
            gVar2.getClass();
            t tVar = n71.f.f124834a;
            return n71.f.b(gVar2, n71.d.f124832a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class j extends q implements r<o71.i, LocalDate, LocalDate, t13.d<? super v2<? extends o71.e>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f130221a = new j();

        public j() {
            super(4, o71.i.class, "getOneMonthStats", "getOneMonthStats(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Object invoke(o71.i iVar, LocalDate localDate, LocalDate localDate2, t13.d<? super v2<? extends o71.e>> dVar) {
            return iVar.B4(localDate, localDate2, dVar);
        }
    }

    static {
        o oVar = o.f62807j;
        b bVar = b.f130213a;
        c cVar = c.f130214a;
        Days days = Days.SEVEN;
        days.getClass();
        g gVar = new g("SEVEN_DAYS", 0, oVar, bVar, cVar, days);
        f130201g = gVar;
        o oVar2 = o.f62808k;
        d dVar = d.f130215a;
        e eVar = e.f130216a;
        Weeks weeks = Weeks.weeks(4);
        weeks.getClass();
        g gVar2 = new g("FOUR_WEEKS", 1, oVar2, dVar, eVar, weeks);
        f130202h = gVar2;
        o oVar3 = o.f62810m;
        f fVar = f.f130217a;
        C2481g c2481g = C2481g.f130218a;
        Weeks weeks2 = Weeks.weeks(12);
        weeks2.getClass();
        g gVar3 = new g("TWELVE_WEEKS", 2, oVar3, fVar, c2481g, weeks2);
        f130203i = gVar3;
        o oVar4 = o.f62814q;
        h hVar = h.f130219a;
        i iVar = i.f130220a;
        Months months = Months.TWELVE;
        months.getClass();
        g gVar4 = new g("ONE_YEAR", 3, oVar4, hVar, iVar, months);
        f130204j = gVar4;
        o oVar5 = o.f62809l;
        j jVar = j.f130221a;
        a aVar = a.f130212a;
        Months months2 = Months.ONE;
        months2.getClass();
        g gVar5 = new g("ONE_MONTH", 4, oVar5, jVar, aVar, months2);
        f130205k = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        f130206l = gVarArr;
        f130207m = new w13.c(gVarArr);
        f130199e = new k(null);
        f130200f = m.b(new nw1.e(23));
    }

    private g(String str, int i14, o oVar, r rVar, e23.l lVar, ReadablePeriod readablePeriod) {
        super(str, i14);
        this.f130208a = oVar;
        this.f130209b = rVar;
        this.f130210c = lVar;
        this.f130211d = readablePeriod;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f130206l.clone();
    }

    public final LocalDate a(LocalDate localDate) {
        localDate.getClass();
        LocalDate localDateMinus = localDate.minus(this.f130211d);
        localDateMinus.getClass();
        return localDateMinus;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo71/g$k;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class k {
        public /* synthetic */ k(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static g a(int i14) {
            o.f62804g.getClass();
            o oVarA = o.a.a(i14);
            Object obj = null;
            if (oVarA == null) {
                return null;
            }
            w13.c cVar = g.f130207m;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                Object next = bVarN.next();
                if (((g) next).f130208a == oVarA) {
                    obj = next;
                    break;
                }
            }
            return (g) obj;
        }

        private k() {
        }
    }
}
