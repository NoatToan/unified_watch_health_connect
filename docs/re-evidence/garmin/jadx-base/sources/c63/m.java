package c63;

import c2.o3;
import com.roomorama.caldroid.CaldroidFragment;
import kotlinx.datetime.DateTimeFormatException;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lc63/m;", "", "Lc63/o;", "contents", "<init>", "(Lc63/o;)V", "a", "b", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f25014c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f25015a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc63/m$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25016a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f25017b;

        static {
            a aVar = m.f25013b;
            o3 o3Var = new o3(18);
            aVar.getClass();
            p.a aVar2 = new p.a(new e63.d());
            o3Var.invoke(aVar2);
            f25017b = new p(aVar2.build());
            o3 o3Var2 = new o3(23);
            p.a aVar3 = new p.a(new e63.d());
            o3Var2.invoke(aVar3);
            new p(aVar3.build());
        }

        private b() {
        }
    }

    static {
        p005kotlin.jvm.internal.b0 b0Var = new p005kotlin.jvm.internal.b0(m.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0);
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        f25014c = new k23.l[]{t0Var.f(b0Var), kg.f.g(m.class, "day", "getDay()Ljava/lang/Integer;", 0, t0Var), kg.f.g(m.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0, t0Var), kg.f.g(m.class, "dayOfYear", "getDayOfYear()Ljava/lang/Integer;", 0, t0Var), kg.f.g(m.class, "hour", "getHour()Ljava/lang/Integer;", 0, t0Var), kg.f.g(m.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0, t0Var), kg.f.g(m.class, "minute", "getMinute()Ljava/lang/Integer;", 0, t0Var), kg.f.g(m.class, "second", "getSecond()Ljava/lang/Integer;", 0, t0Var), kg.f.g(m.class, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", 0, t0Var), kg.f.g(m.class, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", 0, t0Var), kg.f.g(m.class, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", 0, t0Var)};
        f25013b = new a(null);
    }

    public m(o oVar) {
        oVar.getClass();
        this.f25015a = oVar;
        a0 a0Var = oVar.f25029a;
        new y0(new p005kotlin.jvm.internal.z(a0Var) { // from class: c63.m.i
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((a0) this.receiver).f24941a.f24964b;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((a0) this.receiver).f24941a.f24964b = (Integer) obj;
            }
        });
        new y0(new p005kotlin.jvm.internal.z(a0Var) { // from class: c63.m.c
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((a0) this.receiver).f24942b;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((a0) this.receiver).f24942b = (Integer) obj;
            }
        });
        new y0(new p005kotlin.jvm.internal.z(a0Var) { // from class: c63.m.d
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((a0) this.receiver).f24942b;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((a0) this.receiver).f24942b = (Integer) obj;
            }
        });
        new u0(new p005kotlin.jvm.internal.z(a0Var) { // from class: c63.m.e
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((a0) this.receiver).f24944d;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((a0) this.receiver).f24944d = (Integer) obj;
            }
        });
        c0 c0Var = oVar.f25030b;
        new y0(new p005kotlin.jvm.internal.z(c0Var) { // from class: c63.m.f
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((c0) this.receiver).f24950a;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((c0) this.receiver).f24950a = (Integer) obj;
            }
        });
        new y0(new p005kotlin.jvm.internal.z(c0Var) { // from class: c63.m.g
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((c0) this.receiver).f24951b;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((c0) this.receiver).f24951b = (Integer) obj;
            }
        });
        new y0(new p005kotlin.jvm.internal.z(c0Var) { // from class: c63.m.h
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((c0) this.receiver).f24953d;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((c0) this.receiver).f24953d = (Integer) obj;
            }
        });
        new y0(new p005kotlin.jvm.internal.z(c0Var) { // from class: c63.m.m
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((c0) this.receiver).f24954e;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((c0) this.receiver).f24954e = (Integer) obj;
            }
        });
        d0 d0Var = oVar.f25031c;
        new y0(new p005kotlin.jvm.internal.z(d0Var) { // from class: c63.m.j
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((d0) this.receiver).f24957b;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((d0) this.receiver).f24957b = (Integer) obj;
            }
        });
        new y0(new p005kotlin.jvm.internal.z(d0Var) { // from class: c63.m.k
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((d0) this.receiver).f24958c;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((d0) this.receiver).f24958c = (Integer) obj;
            }
        });
        new y0(new p005kotlin.jvm.internal.z(d0Var) { // from class: c63.m.l
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((d0) this.receiver).f24959d;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((d0) this.receiver).f24959d = (Integer) obj;
            }
        });
    }

    public static e53.j a(m mVar) {
        b63.x.f16223a.getClass();
        b63.x xVar = b63.x.f16224b;
        mVar.getClass();
        xVar.getClass();
        o oVar = mVar.f25015a;
        d0 d0Var = oVar.f25031c;
        c0 c0Var = oVar.f25030b;
        b63.a0 a0VarB = d0Var.b();
        b63.v vVarH = c0Var.h();
        a0 a0VarA = oVar.f25029a.copy();
        e0 e0Var = a0VarA.f24941a;
        Integer num = e0Var.f24963a;
        o1.a(num, CaldroidFragment.YEAR);
        e0Var.f24963a = Integer.valueOf(num.intValue() % 10000);
        try {
            Integer num2 = oVar.f25029a.f24941a.f24963a;
            num2.getClass();
            long jAddExact = Math.addExact(Math.multiplyExact(num2.intValue() / 10000, 315569520000L), ((a0VarA.c().f16206a.toEpochDay() * ((long) DateTimeConstants.SECONDS_PER_DAY)) + ((long) vVarH.f16219a.toSecondOfDay())) - ((long) a0VarB.f16173a.getTotalSeconds()));
            e53.j.a aVar = e53.j.f63112c;
            Integer num3 = c0Var.f24955f;
            int iIntValue = num3 != null ? num3.intValue() : 0;
            aVar.getClass();
            e53.j jVarB = e53.j.a.b(jAddExact, iIntValue);
            if (jVarB.f63115a == jAddExact) {
                return jVarB;
            }
            throw new DateTimeFormatException("The parsed date is outside the range representable by Instant");
        } catch (ArithmeticException e4) {
            throw new DateTimeFormatException("The parsed date is outside the range representable by Instant", e4);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc63/m$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ m(o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            oVar = new o(null, null, null, null, 15, null);
        }
        this(oVar);
    }
}
