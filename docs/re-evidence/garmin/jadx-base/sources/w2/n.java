package w2;

import android.content.ClipData;
import android.content.ClipDescription;
import kotlin.m1;
import kotlin.n1;
import kotlin.o1;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.h3;
import p006l2.l1;
import p006l2.p2;
import p006l2.r2;
import p008y1.m0;
import p3.c2;
import p3.p0;
import s5.q0;
import s5.w0;
import v2.g1;
import v2.g2;
import v2.h2;
import v2.j1;
import v2.k2;
import v2.s0;
import z2.a1;
import z2.p1;
import z2.v1;
import z2.v2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lw2/n;", "", "Lv2/h2;", "textFieldState", "Lv2/g2;", "textLayoutState", "Lg6/c;", "density", "", "enabled", "readOnly", "isFocused", "isPassword", "Lr2/p;", "toolbarRequester", "Lo53/b0;", "coroutineScope", "Lz2/q;", "platformSelectionBehaviors", "Li5/o1;", "clipboard", "<init>", "(Lv2/h2;Lv2/g2;Lg6/c;ZZZZLr2/p;Lo53/b0;Lz2/q;Li5/o1;)V", "a", "b", "c", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n {
    public final p3.d0 A;
    public final w2.a B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f181365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f181366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g6.c f181367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f181368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f181369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r2.p f181370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o53.b0 f181371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z2.q f181372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o1 f181373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f181374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f181375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w4.a f181376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i0 f181377m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c2 f181378n = p0.n(Boolean.TRUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e23.a<Unit> f181379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e23.a<? extends w1.a> f181380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c2 f181381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c2 f181382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c2 f181383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c2 f181384t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c2 f181385u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c2 f181386v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c2 f181387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v1 f181388x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f181389y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a2.l.b f181390z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw2/n$a;", "", "<init>", "(Ljava/lang/String;I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        None,
        Touch,
        Mouse
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw2/n$b;", "Lz2/l;", "Lkotlin/Function0;", "", "requestFocus", "<init>", "(Lw2/n;Le23/a;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class b implements z2.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.a<Unit> f181395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f181396b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f181397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f181398d;

        public b(e23.a<Unit> aVar) {
            this.f181395a = aVar;
            n4.c.f123541b.getClass();
            this.f181397c = n4.c.f123543d;
            this.f181398d = true;
        }

        @Override // z2.l
        public final boolean a(long j8, z2.d0 d0Var, int i14) {
            n nVar = n.this;
            q0 q0VarC = nVar.f181366b.c();
            if (!nVar.f181374j || q0VarC == null || nVar.f181365a.d().f167839c.length() == 0) {
                return false;
            }
            this.f181398d = i14 >= 2;
            nVar.f181384t.setValue(a.Mouse);
            this.f181395a.invoke();
            nVar.f181389y = -1;
            this.f181396b = -1;
            this.f181397c = j8;
            this.f181396b = (int) (f(j8, d0Var, q0VarC, true) >> 32);
            return true;
        }

        @Override // z2.l
        public final void b() {
            a aVar = a.None;
            n nVar = n.this;
            nVar.f181384t.setValue(aVar);
            if (this.f181398d) {
                nVar.x();
            }
        }

        @Override // z2.l
        public final boolean c(long j8) {
            n nVar = n.this;
            q0 q0VarC = nVar.f181366b.c();
            if (!nVar.f181374j || q0VarC == null || nVar.f181365a.d().f167839c.length() == 0) {
                return false;
            }
            this.f181398d = false;
            this.f181395a.invoke();
            z2.d0.f201550a.getClass();
            f(j8, z2.d0.a.f201552b, q0VarC, false);
            return true;
        }

        @Override // z2.l
        public final boolean d(long j8, z2.d0 d0Var) {
            n nVar = n.this;
            q0 q0VarC = nVar.f181366b.c();
            if (!nVar.f181374j || q0VarC == null || nVar.f181365a.d().length() == 0) {
                return false;
            }
            if (w0.d(nVar.f181365a.d().f167840d, f(j8, d0Var, q0VarC, false))) {
                return true;
            }
            this.f181398d = false;
            return true;
        }

        @Override // z2.l
        public final boolean e(long j8) {
            return true;
        }

        public final long f(long j8, z2.d0 d0Var, q0 q0Var, boolean z14) {
            int length = q0Var.f157280a.f157265a.f157138b.length();
            int iD = this.f181396b;
            n nVar = n.this;
            if (iD < 0 || iD > length) {
                iD = nVar.f181366b.d(this.f181397c, false);
            }
            int i14 = iD;
            long jH = nVar.H(nVar.f181365a.d(), i14, nVar.f181366b.d(j8, false), false, d0Var, false, z14);
            if (this.f181396b == -1 && !w0.e(jH)) {
                this.f181396b = (int) (jH >> 32);
            }
            if (w0.i(jH)) {
                jH = og.a.l((int) (4294967295L & jH), (int) (jH >> 32));
            }
            nVar.f181365a.j(jH);
            nVar.D(j0.Selection);
            return jH;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw2/n$c;", "Ll2/p2;", "Lkotlin/Function0;", "", "requestFocus", "<init>", "(Lw2/n;Le23/a;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class c implements p2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.a<Unit> f181400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f181401b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f181402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f181403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public l1 f181404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f181405f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public z2.d0 f181406g;

        public c(e23.a<Unit> aVar) {
            this.f181400a = aVar;
            n4.c.f123541b.getClass();
            this.f181402c = n4.c.f123543d;
            this.f181403d = 0L;
            this.f181404e = l1.SelectionEnd;
            this.f181405f = true;
            z2.d0.f201550a.getClass();
            this.f181406g = z2.d0.a.f201552b;
        }

        @Override // p006l2.p2
        public final void a() {
        }

        @Override // p006l2.p2
        public final void b(long j8, z2.d0 d0Var) {
            n nVar = n.this;
            boolean z14 = nVar.f181374j;
            h2 h2Var = nVar.f181365a;
            g2 g2Var = nVar.f181366b;
            if (z14) {
                nVar.G(this.f181404e, j8);
                nVar.C(false);
                nVar.f181384t.setValue(a.Touch);
                this.f181402c = j8;
                n4.c.f123541b.getClass();
                this.f181403d = 0L;
                nVar.f181389y = -1;
                this.f181405f = true;
                this.f181406g = d0Var;
                if (g2Var.c() == null) {
                    return;
                }
                if (g2Var.f(j8)) {
                    if (h2Var.d().f167839c.length() == 0) {
                        return;
                    }
                    int iD = g2Var.d(j8, true);
                    u2.e eVarD = nVar.f181365a.d();
                    w0.f157315b.getClass();
                    long jH = nVar.H(new u2.e(eVarD, w0.f157316c, null, null, null, null, 60, null), iD, iD, false, this.f181406g, false, false);
                    h2Var.j(jH);
                    nVar.D(j0.Selection);
                    this.f181401b = (int) (jH >> 32);
                    return;
                }
                int iD2 = g2Var.d(j8, true);
                w4.a aVar = nVar.f181376l;
                if (aVar != null) {
                    w4.b.f181904b.getClass();
                    aVar.a(w4.b.a.b());
                }
                h2Var.getClass();
                h2Var.j(og.a.l(iD2, iD2));
                nVar.C(true);
                this.f181405f = false;
                nVar.D(j0.Cursor);
            }
        }

        @Override // p006l2.p2
        public final void c() {
        }

        @Override // p006l2.p2
        public final void d(long j8) {
            int iIntValue;
            int iD;
            z2.d0 d0Var;
            l1 l1Var;
            n nVar = n.this;
            boolean z14 = nVar.f181374j;
            h2 h2Var = nVar.f181365a;
            g2 g2Var = nVar.f181366b;
            if (!z14 || g2Var.c() == null || h2Var.d().f167839c.length() == 0) {
                return;
            }
            long j14 = n4.c.j(this.f181403d, j8);
            this.f181403d = j14;
            long j15 = n4.c.j(this.f181402c, j14);
            if (this.f181401b >= 0 || g2Var.f(j15)) {
                int i14 = this.f181401b;
                Integer numValueOf = Integer.valueOf(i14);
                if (i14 < 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : g2Var.d(this.f181402c, false);
                iD = g2Var.d(j15, false);
                if (this.f181401b < 0 && iIntValue == iD) {
                    return;
                }
                d0Var = this.f181406g;
                nVar.D(j0.Selection);
            } else {
                iIntValue = g2Var.d(this.f181402c, true);
                iD = g2Var.d(j15, true);
                if (iIntValue == iD) {
                    z2.d0.f201550a.getClass();
                    d0Var = z2.d0.a.f201552b;
                } else {
                    d0Var = this.f181406g;
                }
            }
            z2.d0 d0Var2 = d0Var;
            int i15 = iIntValue;
            int i16 = iD;
            long j16 = h2Var.d().f167840d;
            long jH = nVar.H(nVar.f181365a.d(), i15, i16, false, d0Var2, false, false);
            if (this.f181401b == -1 && !w0.e(jH)) {
                this.f181401b = (int) (jH >> 32);
            }
            if (w0.i(jH)) {
                jH = og.a.l((int) (jH & 4294967295L), (int) (jH >> 32));
            }
            if (!w0.d(jH, j16)) {
                int i17 = (int) (jH >> 32);
                int i18 = (int) (j16 >> 32);
                if (i17 == i18 || ((int) (jH & 4294967295L)) != ((int) (j16 & 4294967295L))) {
                    l1Var = ((i17 != i18 || ((int) (jH & 4294967295L)) == ((int) (j16 & 4294967295L))) && ((float) (i17 + ((int) (jH & 4294967295L)))) / 2.0f <= ((float) (i18 + ((int) (j16 & 4294967295L)))) / 2.0f) ? l1.SelectionStart : l1.SelectionEnd;
                } else {
                    l1Var = l1.SelectionStart;
                }
                this.f181404e = l1Var;
                this.f181405f = false;
            }
            if (w0.e(j16) || !w0.e(jH)) {
                h2Var.j(jH);
            }
            nVar.G(this.f181404e, j15);
        }

        public final void e() {
            if ((this.f181402c & 9223372034707292159L) != 9205357640488583168L) {
                n nVar = n.this;
                nVar.i();
                this.f181401b = -1;
                n4.c.f123541b.getClass();
                this.f181402c = n4.c.f123543d;
                this.f181403d = 0L;
                nVar.f181389y = -1;
                z2.d0.f201550a.getClass();
                this.f181406g = z2.d0.a.f201552b;
                nVar.f181384t.setValue(a.None);
                this.f181400a.invoke();
                if (this.f181405f) {
                    nVar.x();
                }
            }
        }

        @Override // p006l2.p2
        public final void onCancel() {
            e();
        }

        @Override // p006l2.p2
        public final void onStop() {
            e();
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181408a;

        static {
            int[] iArr = new int[s0.values().length];
            try {
                iArr[s0.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.Insertion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s0.Replacement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f181408a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$maybeSuggestSelectionRange$1", f = "TextFieldSelectionState.kt", l = {1095}, m = "invokeSuspend", v = 1)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f181409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z2.q f181410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CharSequence f181411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f181412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n f181413e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(z2.q qVar, CharSequence charSequence, long j8, n nVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f181410b = qVar;
            this.f181411c = charSequence;
            this.f181412d = j8;
            this.f181413e = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f181410b, this.f181411c, this.f181412d, this.f181413e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f181409a;
            long j8 = this.f181412d;
            CharSequence charSequence = this.f181411c;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f181409a = 1;
                obj = this.f181410b.c(charSequence, j8, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            w0 w0Var = (w0) obj;
            n nVar = this.f181413e;
            boolean z14 = nVar.f181369e;
            h2 h2Var = nVar.f181365a;
            if (!z14 && w0Var != null) {
                long j14 = w0Var.f157317a;
                if (p005kotlin.jvm.internal.s.g(h2Var.d().f167839c, charSequence) && w0.d(h2Var.d().f167840d, j8) && !w0.d(j14, h2Var.d().f167840d)) {
                    h2Var.j(j14);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public n(h2 h2Var, g2 g2Var, g6.c cVar, boolean z14, boolean z15, boolean z16, boolean z17, r2.p pVar, o53.b0 b0Var, z2.q qVar, o1 o1Var) {
        this.f181365a = h2Var;
        this.f181366b = g2Var;
        this.f181367c = cVar;
        this.f181368d = z16;
        this.f181369e = z17;
        this.f181370f = pVar;
        this.f181371g = b0Var;
        this.f181372h = qVar;
        this.f181373i = o1Var;
        this.f181374j = z14;
        this.f181375k = z15;
        n4.c.f123541b.getClass();
        long j8 = n4.c.f123543d;
        this.f181381q = p0.n(n4.c.a(j8));
        this.f181382r = p0.n(n4.c.a(j8));
        this.f181383s = p0.n(null);
        this.f181384t = p0.n(a.None);
        Boolean bool = Boolean.FALSE;
        this.f181385u = p0.n(bool);
        this.f181386v = p0.n(j0.None);
        this.f181387w = p0.n(bool);
        this.f181389y = -1;
        this.A = p0.f(new p006l2.m(this, 3));
        this.B = new w2.a(this.f181373i);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object a(n nVar, b5.h0 h0Var, v13.c cVar) throws Throwable {
        p pVar;
        p005kotlin.jvm.internal.q0 q0Var;
        Throwable th3;
        p005kotlin.jvm.internal.q0 q0Var2;
        nVar.getClass();
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f181430e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f181430e = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(nVar, cVar);
            }
        } else {
            pVar = new p(nVar, cVar);
        }
        p pVar2 = pVar;
        Object obj = pVar2.f181428c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar2.f181430e;
        if (i15 != 0) {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q0Var2 = pVar2.f181427b;
            q0Var = pVar2.f181426a;
            try {
                o13.r.b(obj);
                l(q0Var, q0Var2, nVar);
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                th3 = th4;
                l(q0Var, q0Var2, nVar);
                throw th3;
            }
        }
        o13.r.b(obj);
        p005kotlin.jvm.internal.q0 q0Var3 = new p005kotlin.jvm.internal.q0();
        n4.c.f123541b.getClass();
        long j8 = n4.c.f123543d;
        q0Var3.f105808a = j8;
        p005kotlin.jvm.internal.q0 q0Var4 = new p005kotlin.jvm.internal.q0();
        q0Var4.f105808a = j8;
        try {
            tn2.s0 s0Var = new tn2.s0(q0Var3, 23, nVar, q0Var4);
            m mVar = new m(q0Var3, q0Var4, nVar, 1);
            m mVar2 = new m(q0Var3, q0Var4, nVar, 2);
            vx1.b bVar = new vx1.b(q0Var4, 9, nVar, q0Var3);
            pVar2.f181426a = q0Var3;
            pVar2.f181427b = q0Var4;
            pVar2.f181430e = 1;
            if (m0.f(h0Var, s0Var, mVar, mVar2, bVar, pVar2) == aVar) {
                return aVar;
            }
            q0Var = q0Var3;
            q0Var2 = q0Var4;
            l(q0Var, q0Var2, nVar);
            return Unit.INSTANCE;
        } catch (Throwable th5) {
            q0Var = q0Var3;
            th3 = th5;
            q0Var2 = q0Var4;
            l(q0Var, q0Var2, nVar);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public static final Object b(n nVar, b5.h0 h0Var, boolean z14, v13.c cVar) throws Throwable {
        q qVar;
        l1 l1Var;
        p005kotlin.jvm.internal.q0 q0Var;
        p005kotlin.jvm.internal.q0 q0Var2;
        p005kotlin.jvm.internal.q0 q0Var3;
        n nVar2 = nVar;
        nVar2.getClass();
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f181436f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f181436f = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(nVar2, cVar);
            }
        } else {
            qVar = new q(nVar2, cVar);
        }
        q qVar2 = qVar;
        Object obj = qVar2.f181434d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar2.f181436f;
        if (i15 != 0) {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l1Var = qVar2.f181433c;
            q0Var2 = qVar2.f181432b;
            q0Var3 = qVar2.f181431a;
            try {
                o13.r.b(obj);
                nVar2 = nVar2;
                if (nVar2.q() == l1Var) {
                    m(q0Var3, q0Var2, nVar2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                nVar2 = nVar2;
                if (nVar2.q() == l1Var) {
                    m(q0Var3, q0Var2, nVar2);
                }
                throw th;
            }
        }
        o13.r.b(obj);
        p005kotlin.jvm.internal.q0 q0Var4 = new p005kotlin.jvm.internal.q0();
        n4.c.f123541b.getClass();
        q0Var4.f105808a = n4.c.f123543d;
        p005kotlin.jvm.internal.q0 q0Var5 = new p005kotlin.jvm.internal.q0();
        q0Var5.f105808a = 0L;
        l1 l1Var2 = z14 ? l1.SelectionStart : l1.SelectionEnd;
        try {
            try {
                cq.m mVar = new cq.m(q0Var4, nVar2, z14, l1Var2, q0Var5, 12);
                l1Var2 = l1Var2;
                m mVar2 = new m(q0Var4, nVar2, q0Var5, 3);
                m mVar3 = new m(q0Var4, nVar2, q0Var5, 0);
                q0Var3 = q0Var4;
                try {
                    ug2.p pVar = new ug2.p(q0Var5, nVar2, l1Var2, q0Var3, z14, 6);
                    q0Var = q0Var5;
                    nVar2 = nVar2;
                    l1Var = l1Var2;
                    q0Var4 = q0Var3;
                    try {
                        qVar2.f181431a = q0Var4;
                        qVar2.f181432b = q0Var;
                        qVar2.f181433c = l1Var;
                        qVar2.f181436f = 1;
                        if (m0.f(h0Var, mVar, mVar2, mVar3, pVar, qVar2) == aVar) {
                            return aVar;
                        }
                        q0Var2 = q0Var;
                        q0Var3 = q0Var4;
                        if (nVar2.q() == l1Var) {
                            m(q0Var3, q0Var2, nVar2);
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th4) {
                        th = th4;
                        q0Var2 = q0Var;
                        q0Var3 = q0Var4;
                        if (nVar2.q() == l1Var) {
                            m(q0Var3, q0Var2, nVar2);
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    nVar2 = nVar2;
                    l1Var = l1Var2;
                    q0Var2 = q0Var5;
                    if (nVar2.q() == l1Var) {
                        m(q0Var3, q0Var2, nVar2);
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                l1Var = l1Var2;
                q0Var = q0Var5;
                q0Var2 = q0Var;
                q0Var3 = q0Var4;
                if (nVar2.q() == l1Var) {
                    m(q0Var3, q0Var2, nVar2);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            l1Var = l1Var2;
        }
    }

    public static final void l(p005kotlin.jvm.internal.q0 q0Var, p005kotlin.jvm.internal.q0 q0Var2, n nVar) {
        if ((q0Var.f105808a & 9223372034707292159L) != 9205357640488583168L) {
            n4.c.a aVar = n4.c.f123541b;
            aVar.getClass();
            long j8 = n4.c.f123543d;
            q0Var.f105808a = j8;
            aVar.getClass();
            q0Var2.f105808a = j8;
            nVar.i();
        }
    }

    public static final void m(p005kotlin.jvm.internal.q0 q0Var, p005kotlin.jvm.internal.q0 q0Var2, n nVar) {
        if ((q0Var.f105808a & 9223372034707292159L) != 9205357640488583168L) {
            nVar.i();
            n4.c.a aVar = n4.c.f123541b;
            aVar.getClass();
            q0Var.f105808a = n4.c.f123543d;
            aVar.getClass();
            q0Var2.f105808a = 0L;
            nVar.f181389y = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0109  */
    public final boolean A(long j8) {
        int iG;
        s0 s0Var;
        boolean z14;
        long j14;
        long jL;
        h2.b bVar;
        q0 q0VarC = this.f181366b.c();
        if (q0VarC == null || (iG = q0VarC.f157281b.g(j8)) == -1) {
            return false;
        }
        h2 h2Var = this.f181365a;
        p3.d0 d0Var = h2Var.f175041c;
        c2 c2Var = h2Var.f175042d;
        j1 j1Var = null;
        g1 g1Var = (d0Var == null || (bVar = (h2.b) d0Var.getF182175a()) == null) ? null : bVar.f175045b;
        long jA = g1Var != null ? g1Var.a(iG, false) : og.a.l(iG, iG);
        long jF = h2Var.f(jA);
        if (w0.e(jA) && w0.e(jF)) {
            s0Var = s0.Untransformed;
        } else if (w0.e(jA) || w0.e(jF)) {
            s0Var = (!w0.e(jA) || w0.e(jF)) ? s0.Deletion : s0.Insertion;
        } else {
            s0Var = s0.Replacement;
        }
        int i14 = d.f181408a[s0Var.ordinal()];
        if (i14 == 1 || i14 == 2) {
            z14 = false;
        } else {
            if (i14 != 3) {
                if (i14 != 4) {
                    u0.r();
                    return false;
                }
                z14 = false;
                n4.d dVarC = q0VarC.c((int) (jF >> 32));
                n4.d dVarC2 = q0VarC.c((int) (jF & 4294967295L));
                float fD = v2.i.d(j8, dVarC);
                float fD2 = v2.i.d(j8, dVarC2);
                if (fD == fD2 || fD >= fD2) {
                    j14 = jA & 4294967295L;
                }
                int i15 = (int) j14;
                jL = og.a.l(i15, i15);
                if (!w0.d(jL, h2Var.f175039a.b().f167840d) && (j1Var == null || j1Var.equals((j1) c2Var.getF182175a()))) {
                    return z14;
                }
                h2Var.k(jL);
                if (j1Var != null) {
                    c2Var.setValue(j1Var);
                }
                return true;
            }
            z14 = false;
            n4.d dVarC3 = q0VarC.c((int) (jF >> 32));
            n4.d dVarC4 = q0VarC.c((int) (jF & 4294967295L));
            float fD3 = v2.i.d(j8, dVarC3);
            float fD4 = v2.i.d(j8, dVarC4);
            j1Var = (fD3 != fD4 && fD3 < fD4) ? new j1(k2.Start) : new j1(k2.End);
        }
        j14 = jA >> 32;
        int i16 = (int) j14;
        jL = og.a.l(i16, i16);
        if (!w0.d(jL, h2Var.f175039a.b().f167840d)) {
        }
        h2Var.k(jL);
        if (j1Var != null) {
            c2Var.setValue(j1Var);
        }
        return true;
    }

    public final void B() {
        u2.h hVar = this.f181365a.f175039a;
        x2.c cVar = x2.c.MergeIfPossible;
        hVar.f167847b.a().b();
        u2.d dVar = hVar.f167847b;
        og2.k.E(dVar, 0, dVar.f167831b.length());
        u2.h.a(hVar, true, cVar);
    }

    public final void C(boolean z14) {
        this.f181385u.setValue(Boolean.valueOf(z14));
    }

    public final void D(j0 j0Var) {
        this.f181386v.setValue(j0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object E(v13.c cVar) {
        y yVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i14 = yVar.f181469c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f181469c = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object objE = yVar.f181467a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f181469c;
        c2 c2Var = this.f181386v;
        try {
            if (i15 == 0) {
                o13.r.b(objE);
                z zVar = new z(this, null);
                yVar.f181469c = 1;
                objE = o53.c0.e(zVar, yVar);
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE);
            }
            C(false);
            if (((j0) c2Var.getF182175a()) != j0.None) {
                w();
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            C(false);
            if (((j0) c2Var.getF182175a()) != j0.None) {
                w();
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Unit F() {
        boolean z14;
        ClipDescription primaryClipDescription;
        w2.a aVar = this.B;
        o1 o1Var = aVar.f181277a;
        boolean zHasPrimaryClip = o1Var.b().hasPrimaryClip();
        aVar.f181278b = zHasPrimaryClip;
        if (zHasPrimaryClip && (primaryClipDescription = o1Var.b().getPrimaryClipDescription()) != null) {
            z14 = primaryClipDescription.hasMimeType("text/*");
        }
        aVar.f181279c = z14;
        Unit unit = Unit.INSTANCE;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return unit;
    }

    public final void G(l1 l1Var, long j8) {
        this.f181383s.setValue(l1Var);
        this.f181382r.setValue(n4.c.a(j8));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final long H(u2.e eVar, int i14, int i15, boolean z14, z2.d0 d0Var, boolean z15, boolean z16) {
        long j8;
        boolean z17;
        v1 v1VarA;
        int i16;
        long jL;
        w4.a aVar;
        long j14 = eVar.f167840d;
        w0 w0VarA = w0.a(j14);
        long j15 = w0VarA.f157317a;
        if (z16 || (!z15 && w0.e(j15))) {
            w0VarA = null;
        }
        q0 q0VarC = this.f181366b.c();
        boolean z18 = false;
        if (q0VarC == null) {
            w0.f157315b.getClass();
            jL = w0.f157316c;
        } else if (w0VarA == null) {
            z2.d0.f201550a.getClass();
            if (p005kotlin.jvm.internal.s.g(d0Var, z2.d0.a.f201553c)) {
                jL = og.a.l(i14, i15);
            } else {
                int i17 = this.f181389y;
                if (w0VarA != null) {
                    j8 = w0VarA.f157317a;
                } else {
                    w0.f157315b.getClass();
                    j8 = w0.f157316c;
                }
                long j16 = j8;
                if (w0VarA == null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                v1VarA = a1.a(q0VarC, i14, i15, i17, j16, z17, z14);
                if (w0VarA != null || v1VarA.k(this.f181388x)) {
                    z2.b0 b0VarA = d0Var.a(v1VarA);
                    long jL2 = og.a.l(b0VarA.f201523a.f201527b, b0VarA.f201524b.f201527b);
                    this.f181388x = v1VarA;
                    if (z14) {
                        i16 = i14;
                    } else {
                        i16 = i15;
                    }
                    this.f181389y = i16;
                    jL = jL2;
                } else {
                    jL = w0VarA.f157317a;
                }
            }
        } else {
            int i18 = this.f181389y;
            if (w0VarA != null) {
                j8 = w0VarA.f157317a;
            } else {
                w0.f157315b.getClass();
                j8 = w0.f157316c;
            }
            long j17 = j8;
            if (w0VarA == null) {
                z17 = true;
            } else {
                z17 = false;
            }
            v1VarA = a1.a(q0VarC, i14, i15, i18, j17, z17, z14);
            if (w0VarA != null) {
                z2.b0 b0VarA2 = d0Var.a(v1VarA);
                long jL3 = og.a.l(b0VarA2.f201523a.f201527b, b0VarA2.f201524b.f201527b);
                this.f181388x = v1VarA;
                if (z14) {
                    i16 = i14;
                } else {
                    i16 = i15;
                }
                this.f181389y = i16;
                jL = jL3;
            } else {
                z2.b0 b0VarA3 = d0Var.a(v1VarA);
                long jL4 = og.a.l(b0VarA3.f201523a.f201527b, b0VarA3.f201524b.f201527b);
                this.f181388x = v1VarA;
                if (z14) {
                    i16 = i14;
                } else {
                    i16 = i15;
                }
                this.f181389y = i16;
                jL = jL4;
            }
        }
        if (!w0.d(jL, j14)) {
            if (w0.i(jL) != w0.i(j14) && w0.d(og.a.l((int) (4294967295L & jL), (int) (jL >> 32)), j14)) {
                z18 = true;
            }
            if (((Boolean) this.f181378n.getF182175a()).booleanValue() && !z18 && (aVar = this.f181376l) != null) {
                w4.b.f181904b.getClass();
                aVar.a(w4.b.a.b());
            }
        }
        return jL;
    }

    public final n4.d c(q0 q0Var, u2.e eVar) {
        float f14;
        if (!w0.e(eVar.f167840d)) {
            n4.d.f123545e.getClass();
            return n4.d.f123546f;
        }
        n4.d dVarC = q0Var.c((int) (eVar.f167840d >> 32));
        float fFloor = (float) Math.floor(this.f181367c.s0(r2.f108753a));
        if (fFloor < 1.0f) {
            fFloor = 1.0f;
        }
        if (q0Var.f157280a.f157272h == g6.o.Ltr) {
            f14 = (fFloor / 2) + dVarC.f123547a;
        } else {
            f14 = dVarC.f123549c - (fFloor / 2);
        }
        float f15 = fFloor / 2;
        float f16 = ((int) (q0Var.f157282c >> 32)) - f15;
        if (f14 > f16) {
            f14 = f16;
        }
        if (f14 < f15) {
            f14 = f15;
        }
        float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f14)) + 0.5f : (float) Math.rint(f14);
        return new n4.d(fFloor2 - f15, dVarC.f123548b, fFloor2 + f15, dVarC.f123550d);
    }

    public final boolean d() {
        return r() && w0.e(this.f181365a.d().f167840d);
    }

    public final boolean e() {
        return (w0.e(this.f181365a.d().f167840d) || this.f181369e) ? false : true;
    }

    public final boolean f() {
        return (w0.e(this.f181365a.d().f167840d) || !r() || this.f181369e) ? false : true;
    }

    public final boolean g() {
        if (r()) {
            if (this.B.f181279c) {
                return true;
            }
            e23.a<? extends w1.a> aVar = this.f181380p;
            if ((aVar != null ? aVar.invoke() : null) != null && this.B.f181278b) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        h2 h2Var = this.f181365a;
        return w0.f(h2Var.d().f167840d) != h2Var.d().f167839c.length();
    }

    public final void i() {
        this.f181383s.setValue(null);
        n4.c.f123541b.getClass();
        long j8 = n4.c.f123543d;
        this.f181382r.setValue(n4.c.a(j8));
        this.f181381q.setValue(n4.c.a(j8));
    }

    public final Object j(boolean z14, v13.i iVar) {
        Unit unitC;
        h2 h2Var = this.f181365a;
        s5.c cVar = null;
        if (!w0.e(h2Var.d().f167840d) && !this.f181369e) {
            u2.e eVarD = h2Var.d();
            s5.c cVar2 = new s5.c(eVarD.f167839c.subSequence(w0.h(eVarD.f167840d), w0.g(eVarD.f167840d)).toString(), null, 2, null);
            if (z14) {
                h2Var.a();
            }
            cVar = cVar2;
        }
        return (cVar != null && (unitC = this.f181373i.c(b2.b.a(cVar))) == u13.a.COROUTINE_SUSPENDED) ? unitC : Unit.INSTANCE;
    }

    public final Object k(v13.i iVar) {
        Unit unitC;
        h2 h2Var = this.f181365a;
        s5.c cVar = null;
        if (!w0.e(h2Var.d().f167840d) && r() && !this.f181369e) {
            u2.e eVarD = h2Var.d();
            s5.c cVar2 = new s5.c(eVarD.f167839c.subSequence(w0.h(eVarD.f167840d), w0.g(eVarD.f167840d)).toString(), null, 2, null);
            h2Var.c();
            cVar = cVar2;
        }
        return (cVar != null && (unitC = this.f181373i.c(b2.b.a(cVar))) == u13.a.COROUTINE_SUSPENDED) ? unitC : Unit.INSTANCE;
    }

    public final Object n(b5.h0 h0Var, v13.i iVar) {
        Object objR = h0Var.R(new r(this, null), iVar);
        return objR == u13.a.COROUTINE_SUSPENDED ? objR : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final f o(boolean z14) {
        long jC;
        u2.e eVarD = this.f181365a.d();
        boolean zBooleanValue = ((Boolean) this.f181385u.getF182175a()).booleanValue();
        boolean z15 = true;
        boolean z16 = ((a) this.f181384t.getF182175a()) == a.None;
        l1 l1VarQ = q();
        if (!zBooleanValue || !z16 || !w0.e(eVarD.f167840d) || eVarD.f167842f != null || eVarD.f167839c.length() <= 0) {
            z15 = false;
        } else if (l1VarQ != l1.Cursor) {
            f4.f.f68735e.getClass();
            f4.f fVarA = f4.f.a.a();
            e23.l<Object, Unit> f68799i = fVarA != null ? fVarA.getF68799i() : null;
            f4.f fVarB = f4.f.a.b(fVarA);
            try {
                long jC2 = p().c();
                f4.f.a.e(fVarA, fVarB, f68799i);
                f5.c0 c0VarV = v();
                if (!(c0VarV != null ? p1.a(jC2, p1.c(c0VarV)) : false)) {
                    z15 = false;
                }
            } catch (Throwable th3) {
                f4.f.a.e(fVarA, fVarB, f68799i);
                throw th3;
            }
        }
        if (!z15) {
            f.f181324f.getClass();
            return f.f181325g;
        }
        if (z14) {
            jC = p().c();
        } else {
            n4.c.f123541b.getClass();
            jC = n4.c.f123543d;
        }
        return new f(true, jC, 0.0f, d6.g.Ltr, false, null);
    }

    public final n4.d p() {
        q0 q0VarC = this.f181366b.c();
        if (q0VarC != null) {
            return c(q0VarC, this.f181365a.d());
        }
        n4.d.f123545e.getClass();
        return n4.d.f123546f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l1 q() {
        return (l1) this.f181383s.getF182175a();
    }

    public final boolean r() {
        return this.f181374j && !this.f181375k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long s() {
        long jW;
        c2 c2Var = this.f181382r;
        if ((((n4.c) c2Var.getF182175a()).f123544a & 9223372034707292159L) == 9205357640488583168L) {
            n4.c.f123541b.getClass();
            return n4.c.f123543d;
        }
        c2 c2Var2 = this.f181381q;
        if ((((n4.c) c2Var2.getF182175a()).f123544a & 9223372034707292159L) == 9205357640488583168L) {
            return v2.i.e(this.f181366b, ((n4.c) c2Var.getF182175a()).f123544a);
        }
        long j8 = ((n4.c) c2Var.getF182175a()).f123544a;
        long j14 = ((n4.c) c2Var2.getF182175a()).f123544a;
        f5.c0 c0VarV = v();
        if (c0VarV != null) {
            n4.c.f123541b.getClass();
            jW = c0VarV.W(0L);
        } else {
            n4.c.f123541b.getClass();
            jW = n4.c.f123543d;
        }
        return n4.c.j(j8, n4.c.i(j14, jW));
    }

    public final long t(boolean z14) {
        long j8;
        q0 q0VarC = this.f181366b.c();
        if (q0VarC == null) {
            n4.c.f123541b.getClass();
            return 0L;
        }
        long j14 = this.f181365a.d().f167840d;
        if (z14) {
            w0.a aVar = w0.f157315b;
            j8 = j14 >> 32;
        } else {
            w0.a aVar2 = w0.f157315b;
            j8 = 4294967295L & j14;
        }
        return v2.a(q0VarC, (int) j8, z14, w0.i(j14));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final f u(boolean z14, boolean z15) {
        boolean z16;
        l1 l1Var = z14 ? l1.SelectionStart : l1.SelectionEnd;
        q0 q0VarC = this.f181366b.c();
        if (q0VarC == null) {
            f.f181324f.getClass();
            return f.f181325g;
        }
        h2 h2Var = this.f181365a;
        long j8 = h2Var.d().f167840d;
        if (w0.e(j8)) {
            f.f181324f.getClass();
            return f.f181325g;
        }
        long jT = t(z14);
        if (((a) this.f181384t.getF182175a()) != a.None) {
            z16 = false;
        } else {
            if (q() != l1Var) {
                f5.c0 c0VarV = v();
                if (!(c0VarV != null ? p1.a(jT, p1.c(c0VarV)) : false)) {
                    z16 = false;
                }
            }
            z16 = true;
        }
        if (!z16) {
            f.f181324f.getClass();
            return f.f181325g;
        }
        if (!(h2Var.d().f167842f == null)) {
            f.f181324f.getClass();
            return f.f181325g;
        }
        d6.g gVarA = q0VarC.a(z14 ? (int) (j8 >> 32) : Math.max(((int) (j8 & 4294967295L)) - 1, 0));
        boolean zI = w0.i(j8);
        if (z15) {
            f5.c0 c0VarV2 = v();
            if (c0VarV2 != null) {
                jT = v2.i.c(jT, p1.c(c0VarV2));
            }
        } else {
            n4.c.f123541b.getClass();
            jT = n4.c.f123543d;
        }
        return new f(true, jT, h3.a(q0VarC, (int) (z14 ? j8 >> 32 : j8 & 4294967295L)), gVarA, zI, null);
    }

    public final f5.c0 v() {
        f5.c0 c0VarE = this.f181366b.e();
        if (c0VarE == null || !c0VarE.isAttached()) {
            return null;
        }
        return c0VarE;
    }

    public final void w() {
        if (u1.g0.f167495b) {
            this.f181370f.a();
            return;
        }
        i0 i0Var = this.f181377m;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    public final void x() {
        z2.q qVar = this.f181372h;
        if (qVar != null) {
            h2 h2Var = this.f181365a;
            CharSequence charSequence = h2Var.d().f167839c;
            long j8 = h2Var.d().f167840d;
            if (charSequence.length() > 0 && !w0.e(j8)) {
                ge1.b.T(this.f181371g, null, o53.d0.UNDISPATCHED, new e(qVar, charSequence, j8, this, null), 1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (z(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (z(r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(v13.c cVar) {
        v vVar;
        w1.a aVarInvoke;
        m1 m1Var;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f181446d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f181446d = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objA = vVar.f181444b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f181446d;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objA);
                return Unit.INSTANCE;
            }
            if (i15 == 2) {
                aVarInvoke = vVar.f181443a;
                o13.r.b(objA);
                m1Var = (m1) objA;
                if (m1Var == null) {
                    n1 n1Var = new n1(m1Var.f91340a.getDescription());
                    aVarInvoke.a();
                    v1.d.a.f174661b.getClass();
                    new v1.d(m1Var, n1Var, v1.d.a.f174663d, null, 8, null);
                    throw null;
                }
                vVar.f181443a = null;
                vVar.f181446d = 3;
            } else {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objA);
        e23.a<? extends w1.a> aVar = this.f181380p;
        if (aVar == null || (aVarInvoke = aVar.invoke()) == null) {
            vVar.f181446d = 1;
        } else {
            o1 o1Var = this.f181373i;
            vVar.f181443a = aVarInvoke;
            vVar.f181446d = 2;
            objA = o1Var.a();
            if (objA != obj) {
                m1Var = (m1) objA;
                if (m1Var == null) {
                    n1 n1Var2 = new n1(m1Var.f91340a.getDescription());
                    aVarInvoke.a();
                    v1.d.a.f174661b.getClass();
                    new v1.d(m1Var, n1Var2, v1.d.a.f174663d, null, 8, null);
                    throw null;
                }
                vVar.f181443a = null;
                vVar.f181446d = 3;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r8 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(v13.c cVar) {
        w wVar;
        CharSequence text;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f181449c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f181449c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objA = wVar.f181447a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f181449c;
        if (i15 == 0) {
            o13.r.b(objA);
            o1 o1Var = this.f181373i;
            wVar.f181449c = 1;
            objA = o1Var.a();
            if (objA != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objA);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        String str = (String) objA;
        if (str != null) {
            h2.h(this.f181365a, str, x2.c.NeverMerge, false, 10);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
        m1 m1Var = (m1) objA;
        if (m1Var != null) {
            wVar.f181449c = 2;
            int i16 = b2.a.f14460a;
            ClipData.Item itemAt = m1Var.f91340a.getItemAt(0);
            objA = (itemAt == null || (text = itemAt.getText()) == null) ? null : text.toString();
        }
        return Unit.INSTANCE;
    }
}
