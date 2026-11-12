package v2;

import android.icu.text.DecimalFormatSymbols;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p3;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lv2/c2;", "Lp3/x3;", "Ls5/q0;", "Lf4/g0;", "<init>", "()V", "a", "c", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c2 implements x3<s5.q0>, f4.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.c2 f174910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c2 f174911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s5.s0 f174912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f174913d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv2/c2$a;", "Lf4/i0;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends f4.i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f174914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<s5.c.d<s5.c.a>> f174915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public s5.w0 f174916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public s5.x0 f174917f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f174918g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f174919h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public g6.o f174922k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public w5.q.b f174923l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public s5.q0 f174925n;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f174920i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f174921j = Float.NaN;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f174924m = g6.b.b(0, 0, 15);

        @Override // f4.i0
        public final void a(f4.i0 i0Var) {
            i0Var.getClass();
            a aVar = (a) i0Var;
            this.f174914c = aVar.f174914c;
            this.f174915d = aVar.f174915d;
            this.f174916e = aVar.f174916e;
            this.f174917f = aVar.f174917f;
            this.f174918g = aVar.f174918g;
            this.f174919h = aVar.f174919h;
            this.f174920i = aVar.f174920i;
            this.f174921j = aVar.f174921j;
            this.f174922k = aVar.f174922k;
            this.f174923l = aVar.f174923l;
            this.f174924m = aVar.f174924m;
            this.f174925n = aVar.f174925n;
        }

        @Override // f4.i0
        public final f4.i0 b() {
            return new a();
        }

        public final String toString() {
            return "CacheRecord(visualText=" + ((Object) this.f174914c) + ", annotations=" + this.f174915d + ", composition=" + this.f174916e + ", textStyle=" + this.f174917f + ", singleLine=" + this.f174918g + ", softWrap=" + this.f174919h + ", densityValue=" + this.f174920i + ", fontScale=" + this.f174921j + ", layoutDirection=" + this.f174922k + ", fontFamilyResolver=" + this.f174923l + ", constraints=" + ((Object) g6.a.n(this.f174924m)) + ", layoutResult=" + this.f174925n + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public c2() {
        c.f174934f.getClass();
        this.f174910a = new p3.c2(null, c.f174935g);
        b.f174926g.getClass();
        this.f174911b = new p3.c2(null, b.f174927h);
        this.f174913d = new a();
    }

    public final s5.q0 a(c cVar, b bVar) {
        z5.b bVarA;
        int i14;
        CharSequence charSequence;
        s5.x0 x0Var;
        u2.e eVarD = cVar.f174936a.d();
        List<s5.c.d<s5.c.a>> listA = eVarD.f167837a;
        List<s5.c.d<s5.c.a>> list = eVarD.f167838b;
        if ((listA == null || listA.isEmpty()) && (list == null || list.isEmpty())) {
            listA = null;
        } else if (listA == null || listA.isEmpty()) {
            listA = list;
        } else if (list != null && !list.isEmpty()) {
            q13.b bVarB = p13.w.b();
            bVarB.addAll(listA);
            bVarB.addAll(list);
            listA = p13.w.a(bVarB);
        }
        a aVar = (a) f4.l.g(this.f174913d);
        s5.q0 q0Var = aVar.f174925n;
        if (q0Var != null && (charSequence = aVar.f174914c) != null && d53.u.m(charSequence, eVarD) && p005kotlin.jvm.internal.s.g(aVar.f174915d, listA) && p005kotlin.jvm.internal.s.g(aVar.f174916e, eVarD.f167841e) && aVar.f174918g == cVar.f174938c && aVar.f174919h == cVar.f174939d && aVar.f174922k == bVar.f174929b && aVar.f174920i == bVar.f174928a.getF75991a() && aVar.f174921j == bVar.f174928a.getF75992b() && g6.a.d(aVar.f174924m, bVar.f174931d) && p005kotlin.jvm.internal.s.g(aVar.f174923l, bVar.f174930c) && !q0Var.f157281b.f157252a.b()) {
            s5.x0 x0Var2 = aVar.f174917f;
            boolean zD = x0Var2 != null ? x0Var2.d(cVar.f174937b) : false;
            s5.x0 x0Var3 = aVar.f174917f;
            boolean z14 = x0Var3 != null && (x0Var3 == (x0Var = cVar.f174937b) || x0Var3.f157322a.c(x0Var.f157322a));
            if (zD && z14) {
                return q0Var;
            }
            if (zD) {
                s5.p0 p0Var = q0Var.f157280a;
                return new s5.q0(new s5.p0(p0Var.f157265a, cVar.f174937b, p0Var.f157267c, p0Var.f157268d, p0Var.f157269e, p0Var.f157270f, p0Var.f157271g, p0Var.f157272h, p0Var.f157273i, p0Var.f157274j, (p005kotlin.jvm.internal.j) null), q0Var.f157281b, q0Var.f157282c, null);
            }
        }
        s5.s0 s0Var = this.f174912c;
        if (s0Var == null) {
            s0Var = new s5.s0(bVar.f174930c, bVar.f174928a, bVar.f174929b, 1);
            this.f174912c = s0Var;
        }
        s5.s0 s0Var2 = s0Var;
        boolean z15 = cVar.f174940e;
        s5.x0 x0VarE = cVar.f174937b;
        if (z15) {
            z5.c cVar2 = x0VarE.f157322a.localeList;
            if (cVar2 == null || (bVarA = cVar2.f202443a.get(0)) == null) {
                z5.b.f202439b.getClass();
                bVarA = z5.b.a.a();
            }
            Locale locale = bVarA.f202440a;
            g0.f174992a.getClass();
            byte directionality = Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(locale).getDigitStrings()[0], 0));
            if (directionality == 1 || directionality == 2) {
                d6.j.f57765b.getClass();
                i14 = d6.j.f57767d;
            } else {
                d6.j.f57765b.getClass();
                i14 = d6.j.f57766c;
            }
            x0VarE = x0VarE.e(new s5.x0(0L, 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (q4.g) null, 0, i14, 0L, (d6.n) null, (s5.c0) null, (d6.f) null, 0, 0, (d6.o) null, 16711679, (p005kotlin.jvm.internal.j) null));
        }
        s5.q0 q0VarB = s5.s0.b(s0Var2, new s5.c(eVarD.f167839c.toString(), listA == null ? p13.j0.f134944a : listA), x0VarE, 0, cVar.f174939d, cVar.f174938c ? 1 : Integer.MAX_VALUE, null, bVar.f174931d, bVar.f174929b, bVar.f174928a, bVar.f174930c, 1060);
        if (!q0VarB.equals(q0Var)) {
            f4.f.f68735e.getClass();
            f4.f fVarI = f4.l.i();
            if (!fVarI.f()) {
                a aVar2 = this.f174913d;
                synchronized (f4.l.f68775c) {
                    a aVar3 = (a) f4.l.v(aVar2, this, fVarI);
                    aVar3.f174914c = eVarD;
                    aVar3.f174915d = listA;
                    aVar3.f174916e = eVarD.f167841e;
                    aVar3.f174918g = cVar.f174938c;
                    aVar3.f174919h = cVar.f174939d;
                    aVar3.f174917f = cVar.f174937b;
                    aVar3.f174922k = bVar.f174929b;
                    aVar3.f174920i = bVar.f174932e;
                    aVar3.f174921j = bVar.f174933f;
                    aVar3.f174924m = bVar.f174931d;
                    aVar3.f174923l = bVar.f174930c;
                    aVar3.f174925n = q0VarB;
                    Unit unit = Unit.INSTANCE;
                }
                f4.l.m(fVarI, this);
                return q0VarB;
            }
        }
        return q0VarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.x3
    /* JADX INFO: renamed from: getValue */
    public final s5.q0 getF182175a() {
        b bVar;
        c cVar = (c) this.f174910a.getF182175a();
        if (cVar == null || (bVar = (b) this.f174911b.getF182175a()) == null) {
            return null;
        }
        return a(cVar, bVar);
    }

    @Override // f4.g0
    public final f4.i0 m() {
        return this.f174913d;
    }

    @Override // f4.g0
    public final f4.i0 o(f4.i0 i0Var, f4.i0 i0Var2, f4.i0 i0Var3) {
        return i0Var3;
    }

    @Override // f4.g0
    public final void q(f4.i0 i0Var) {
        i0Var.getClass();
        this.f174913d = (a) i0Var;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lv2/c2$b;", "", "Lg6/c;", "density", "Lg6/o;", "layoutDirection", "Lw5/q$b;", "fontFamilyResolver", "Lg6/a;", "constraints", "<init>", "(Lg6/c;Lg6/o;Lw5/q$b;JLkotlin/jvm/internal/j;)V", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C3259b f174926g = new C3259b(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f174927h = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g6.c f174928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g6.o f174929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w5.q.b f174930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f174931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f174932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f174933f;

        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"v2/c2$b$a", "Lp3/p3;", "Lv2/c2$b;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements p3<b> {
            /* JADX WARN: Code duplicated, block: B:24:0x0042 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:25:0x0043 A[RETURN] */
            @Override // p3.p3
            public final boolean a(b bVar, b bVar2) {
                b bVar3 = bVar;
                b bVar4 = bVar2;
                if (bVar3 == null || bVar4 == null) {
                    if ((bVar3 == null) ^ (bVar4 == null)) {
                        return false;
                    }
                    return true;
                }
                if (bVar3.f174932e == bVar4.f174932e && bVar3.f174933f == bVar4.f174933f && bVar3.f174929b == bVar4.f174929b && p005kotlin.jvm.internal.s.g(bVar3.f174930c, bVar4.f174930c) && g6.a.d(bVar3.f174931d, bVar4.f174931d)) {
                    return true;
                }
                return false;
            }
        }

        private b(g6.c cVar, g6.o oVar, w5.q.b bVar, long j8) {
            this.f174928a = cVar;
            this.f174929b = oVar;
            this.f174930c = bVar;
            this.f174931d = j8;
            this.f174932e = cVar.getF75991a();
            this.f174933f = cVar.getF75992b();
        }

        public final String toString() {
            return "MeasureInputs(density=" + this.f174928a + ", densityValue=" + this.f174932e + ", fontScale=" + this.f174933f + ", layoutDirection=" + this.f174929b + ", fontFamilyResolver=" + this.f174930c + ", constraints=" + ((Object) g6.a.n(this.f174931d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        /* JADX INFO: renamed from: v2.c2$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv2/c2$b$b;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C3259b {
            public /* synthetic */ C3259b(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C3259b() {
            }
        }

        public /* synthetic */ b(g6.c cVar, g6.o oVar, w5.q.b bVar, long j8, p005kotlin.jvm.internal.j jVar) {
            this(cVar, oVar, bVar, j8);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lv2/c2$c;", "", "Lv2/h2;", "textFieldState", "Ls5/x0;", "textStyle", "", "singleLine", "softWrap", "isKeyboardTypePhone", "<init>", "(Lv2/h2;Ls5/x0;ZZZ)V", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f174934f = new b(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f174935g = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h2 f174936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s5.x0 f174937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f174938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f174939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f174940e;

        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"v2/c2$c$a", "Lp3/p3;", "Lv2/c2$c;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements p3<c> {
            /* JADX WARN: Code duplicated, block: B:24:0x003a A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:25:0x003b A[RETURN] */
            @Override // p3.p3
            public final boolean a(c cVar, c cVar2) {
                c cVar3 = cVar;
                c cVar4 = cVar2;
                if (cVar3 == null || cVar4 == null) {
                    if ((cVar3 == null) ^ (cVar4 == null)) {
                        return false;
                    }
                    return true;
                }
                if (cVar3.f174936a == cVar4.f174936a && p005kotlin.jvm.internal.s.g(cVar3.f174937b, cVar4.f174937b) && cVar3.f174938c == cVar4.f174938c && cVar3.f174939d == cVar4.f174939d && cVar3.f174940e == cVar4.f174940e) {
                    return true;
                }
                return false;
            }
        }

        public c(h2 h2Var, s5.x0 x0Var, boolean z14, boolean z15, boolean z16) {
            this.f174936a = h2Var;
            this.f174937b = x0Var;
            this.f174938c = z14;
            this.f174939d = z15;
            this.f174940e = z16;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NonMeasureInputs(textFieldState=");
            sb3.append(this.f174936a);
            sb3.append(", textStyle=");
            sb3.append(this.f174937b);
            sb3.append(", singleLine=");
            sb3.append(this.f174938c);
            sb3.append(", softWrap=");
            sb3.append(this.f174939d);
            sb3.append(", isKeyboardTypePhone=");
            return am.j.t(sb3, this.f174940e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv2/c2$c$b;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private b() {
            }
        }
    }
}
