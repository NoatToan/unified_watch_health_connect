package i3;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f90191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f90192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f90193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c2.l2 f90194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c2.l2 f90195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f90196f;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k4 f90197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l3 f90198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b3 f90199c;

        public a(k4 k4Var, l3 l3Var, b3 b3Var) {
            this.f90197a = k4Var;
            this.f90198b = l3Var;
            this.f90199c = b3Var;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                d3 d3Var = d3.f87817a;
                k4 k4Var = this.f90197a;
                d3Var.a(k4Var.g(), k4Var.f(), this.f90198b, c2.l.x(h4.r.S, x3.f90195e), this.f90199c.f87539c, mVar2, 199680);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k4 f90200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b3 f90201b;

        public b(k4 k4Var, b3 b3Var) {
            this.f90200a = k4Var;
            this.f90201b = b3Var;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x003e  */
        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r rVarX = c2.l.x(h4.r.S, x3.f90194d);
                k4 k4Var = this.f90200a;
                int iF = k4Var.f();
                boolean zB = mVar2.B(k4Var);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new y3(k4Var, 0);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new y3(k4Var, 0);
                        mVar2.K(objQ);
                    }
                }
                x3.f(rVarX, iF, (e23.l) objQ, this.f90201b, mVar2, 6);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k4 f90202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l3.e0 f90203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l3 f90204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b3 f90205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f90206e;

        public c(k4 k4Var, l3.e0 e0Var, l3 l3Var, b3 b3Var, m4.b0 b0Var) {
            this.f90202a = k4Var;
            this.f90203b = e0Var;
            this.f90204c = l3Var;
            this.f90205d = b3Var;
            this.f90206e = b0Var;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x003f  */
        /* JADX WARN: Code duplicated, block: B:17:0x005a  */
        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                k4 k4Var = this.f90202a;
                Long lG = k4Var.g();
                long jD = k4Var.d();
                int iF = k4Var.f();
                boolean zB = mVar2.B(k4Var);
                Object objQ = mVar2.q();
                p3.m.a aVar = p3.m.f135153a;
                if (zB) {
                    objQ = new y3(k4Var, 1);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new y3(k4Var, 1);
                        mVar2.K(objQ);
                    }
                }
                e23.l lVar = (e23.l) objQ;
                boolean zB2 = mVar2.B(k4Var);
                Object objQ2 = mVar2.q();
                if (zB2) {
                    objQ2 = new y3(k4Var, 2);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new y3(k4Var, 2);
                        mVar2.K(objQ2);
                    }
                }
                x3.k(lG, jD, iF, lVar, (e23.l) objQ2, this.f90203b, k4Var.b(), this.f90204c, k4Var.e(), this.f90205d, this.f90206e, mVar2, 0);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$1", f = "DatePicker.kt", l = {1552}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f90207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f90208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f90209c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e2.i0 i0Var, int i14, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f90208b = i0Var;
            this.f90209c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f90208b, this.f90209c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f90207a;
            if (i14 == 0) {
                o13.r.b(obj);
                e2.i0 i0Var = this.f90208b;
                if (!i0Var.f62442i.a()) {
                    int iH = i0Var.h();
                    int i15 = this.f90209c;
                    if (iH != i15) {
                        this.f90207a = 1;
                        if (i0Var.l(i15, 0, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1", f = "DatePicker.kt", l = {1572}, m = "invokeSuspend")
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f90210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f90211b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e2.i0 i0Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f90211b = i0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f90211b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f90210a;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    e2.i0 i0Var = this.f90211b;
                    int iH = i0Var.h() + 1;
                    this.f90210a = 1;
                    if (e2.i0.f(i0Var, iH, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", l = {1584}, m = "invokeSuspend")
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f90212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f90213b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e2.i0 i0Var, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f90213b = i0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f90213b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f90212a;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    e2.i0 i0Var = this.f90213b;
                    int iH = i0Var.h() - 1;
                    this.f90212a = 1;
                    if (e2.i0.f(i0Var, iH, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class g implements e23.q<r1.e0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f90214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f90215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f90216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f90217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j23.l f90218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l3.h0 f90219f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ bc f90220g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ l3.e0 f90221h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ b3 f90222i;

        public g(long j8, p3.p1<Boolean> p1Var, o53.b0 b0Var, e2.i0 i0Var, j23.l lVar, l3.h0 h0Var, bc bcVar, l3.e0 e0Var, b3 b3Var) {
            this.f90214a = j8;
            this.f90215b = p1Var;
            this.f90216c = b0Var;
            this.f90217d = i0Var;
            this.f90218e = lVar;
            this.f90219f = h0Var;
            this.f90220g = bcVar;
            this.f90221h = e0Var;
            this.f90222i = b3Var;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:6:0x0031  */
        @Override // e23.q
        public final Unit invoke(r1.e0 e0Var, p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            num.intValue();
            p3.x1 x1Var = p3.n.f135158a;
            int i14 = l3.n1.f109367b;
            String strH = l3.k.h(mVar2, R.string.m3c_date_picker_year_picker_pane_title);
            h4.r.a aVar = h4.r.S;
            boolean zB = mVar2.B(strH);
            Object objQ = mVar2.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new i11.g(strH, 5);
                mVar2.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i11.g(strH, 5);
                    mVar2.K(objQ);
                }
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, aVar, false);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar3);
            } else {
                mVar2.c();
            }
            p3.b4.c(h5.g.a.f81810g, zVarA, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC2, mVar2);
            c2.b0 b0Var = c2.b0.f22601a;
            float f14 = x3.f90191a * 7;
            g6.f.a aVar4 = g6.f.f75994b;
            r5.f89500a.getClass();
            h4.r rVarA = c2.l.A(c2.x2.k(aVar, f14 - r5.f89501b), x3.f90193c, 0.0f, 2);
            p3.p1<Boolean> p1Var = this.f90215b;
            boolean zB2 = mVar2.B(p1Var);
            o53.b0 b0Var2 = this.f90216c;
            boolean zR = zB2 | mVar2.r(b0Var2);
            e2.i0 i0Var = this.f90217d;
            boolean zB3 = zR | mVar2.B(i0Var);
            j23.l lVar = this.f90218e;
            boolean zR2 = zB3 | mVar2.r(lVar);
            l3.h0 h0Var = this.f90219f;
            boolean zB4 = zR2 | mVar2.B(h0Var);
            Object objQ2 = mVar2.q();
            if (zB4) {
                am.e1 e1Var = new am.e1(b0Var2, p1Var, i0Var, lVar, h0Var, 25);
                mVar2.K(e1Var);
                objQ2 = e1Var;
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    am.e1 e1Var2 = new am.e1(b0Var2, p1Var, i0Var, lVar, h0Var, 25);
                    mVar2.K(e1Var2);
                    objQ2 = e1Var2;
                }
            }
            e23.l lVar2 = (e23.l) objQ2;
            long j8 = this.f90214a;
            bc bcVar = this.f90220g;
            l3.e0 e0Var2 = this.f90221h;
            b3 b3Var = this.f90222i;
            x3.n(rVarA, j8, lVar2, bcVar, e0Var2, lVar, b3Var, mVar2, 6);
            v5.a(0.0f, 0, 3, b3Var.f87560x, null, mVar2);
            mVar2.y();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class h implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f90223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b3 f90224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f90225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f90226d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f90227e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f90228f;

        public h(String str, b3 b3Var, boolean z14, boolean z15, boolean z16, boolean z17) {
            this.f90223a = str;
            this.f90224b = b3Var;
            this.f90225c = z14;
            this.f90226d = z15;
            this.f90227e = z16;
            this.f90228f = z17;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.x3 x3VarA;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                n3.n.f123126a.getClass();
                h4.r rVarN = c2.x2.n(aVar, n3.n.f123133h, n3.n.f123131f);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(rVarN, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
                c2.u uVar = c2.u.f22885a;
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i11.f(10);
                    mVar2.K(objQ);
                }
                h4.r rVarB = p5.v.b(aVar, (e23.l) objQ);
                b3 b3Var = this.f90224b;
                long j8 = b3Var.f87551o;
                boolean z14 = this.f90226d;
                boolean z15 = this.f90227e;
                boolean z16 = this.f90228f;
                if (z14 && z16) {
                    j8 = b3Var.f87552p;
                } else if (z14 && !z16) {
                    j8 = b3Var.f87553q;
                } else if (z15 && z16) {
                    j8 = b3Var.f87559w;
                } else if (!z15 || z16) {
                    if (this.f90225c && z16) {
                        j8 = b3Var.f87556t;
                    } else if (z16) {
                        j8 = b3Var.f87550n;
                    }
                }
                if (z15) {
                    mVar2.C(-969483020);
                    x3VarA = p3.p0.q(o4.d0.a(j8), mVar2);
                    mVar2.f();
                } else {
                    mVar2.C(-969417610);
                    x3VarA = r1.f2.a(j8, k9.b(n3.h0.DefaultEffects, mVar2), mVar2);
                    mVar2.f();
                }
                long j14 = ((o4.d0) x3VarA.getF182175a()).f128833a;
                d6.h.f57752b.getClass();
                mh.c(this.f90223a, rVarB, j14, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 261112);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class i implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<q5, Unit> f90230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h4.r f90231c;

        /* JADX WARN: Multi-variable type inference failed */
        public i(int i14, e23.l<? super q5, Unit> lVar, h4.r rVar) {
            this.f90229a = i14;
            this.f90230b = lVar;
            this.f90231c = rVar;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0107  */
        /* JADX WARN: Code duplicated, block: B:28:0x0261  */
        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                q5.f89410b.getClass();
                p3.m.a aVar = p3.m.f135153a;
                e23.l<q5, Unit> lVar = this.f90230b;
                if (this.f90229a == 0) {
                    mVar2.C(-101264927);
                    l3.z0.f109502a.getClass();
                    u4.d dVarC = l3.z0.f109504c;
                    if (dVarC == null) {
                        g6.f.a aVar2 = g6.f.f75994b;
                        u4.d.a aVar3 = new u4.d.a("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
                        p13.j0 j0Var = u4.m.f168519a;
                        o4.d0.f128823b.getClass();
                        o4.t1 t1Var = new o4.t1(o4.d0.f128824c, null);
                        o4.u1.f129010b.getClass();
                        o4.v1.f129019b.getClass();
                        int i14 = o4.v1.f129021d;
                        u4.e eVar = new u4.e();
                        eVar.k(3.0f, 17.25f);
                        eVar.o(21.0f);
                        eVar.h(3.75f);
                        eVar.i(17.81f, 9.94f);
                        com.nimbusds.jose.shaded.gson.internal.a.B(eVar, -3.75f, -3.75f, 3.0f, 17.25f);
                        eVar.k(20.71f, 7.04f);
                        eVar.e(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        eVar.j(-2.34f, -2.34f);
                        eVar.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        eVar.j(-1.83f, 1.83f);
                        com.nimbusds.jose.shaded.gson.internal.a.C(eVar, 3.75f, 3.75f, 1.83f, -1.83f);
                        u4.d.a.b(aVar3, eVar.f168407a, 0, t1Var, 1.0f, null, 1.0f, i14, 1.0f);
                        dVarC = aVar3.c();
                        l3.z0.f109504c = dVarC;
                    }
                    int i15 = l3.n1.f109367b;
                    String strH = l3.k.h(mVar2, R.string.m3c_date_picker_switch_to_input_mode);
                    boolean zB = mVar2.B(lVar);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new gt1.k(lVar, 6);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new gt1.k(lVar, 6);
                            mVar2.K(objQ);
                        }
                    }
                    x3.h(0, 16, (e23.a) objQ, this.f90231c, strH, mVar2, dVarC, false);
                    mVar2.f();
                } else {
                    mVar2.C(-100967048);
                    l3.z0.f109502a.getClass();
                    u4.d dVarC2 = l3.z0.f109505d;
                    if (dVarC2 == null) {
                        g6.f.a aVar4 = g6.f.f75994b;
                        u4.d.a aVar5 = new u4.d.a("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
                        p13.j0 j0Var2 = u4.m.f168519a;
                        o4.d0.f128823b.getClass();
                        o4.t1 t1Var2 = new o4.t1(o4.d0.f128824c, null);
                        o4.u1.f129010b.getClass();
                        o4.v1.f129019b.getClass();
                        int i16 = o4.v1.f129021d;
                        u4.e eVar2 = new u4.e();
                        eVar2.k(9.0f, 11.0f);
                        eVar2.i(7.0f, 11.0f);
                        eVar2.p(2.0f);
                        eVar2.h(2.0f);
                        eVar2.p(-2.0f);
                        eVar2.c();
                        eVar2.k(13.0f, 11.0f);
                        eVar2.h(-2.0f);
                        eVar2.p(2.0f);
                        eVar2.h(2.0f);
                        eVar2.p(-2.0f);
                        eVar2.c();
                        eVar2.k(17.0f, 11.0f);
                        eVar2.h(-2.0f);
                        eVar2.p(2.0f);
                        eVar2.h(2.0f);
                        eVar2.p(-2.0f);
                        eVar2.c();
                        eVar2.k(19.0f, 4.0f);
                        eVar2.h(-1.0f);
                        eVar2.i(18.0f, 2.0f);
                        eVar2.h(-2.0f);
                        eVar2.p(2.0f);
                        eVar2.i(8.0f, 4.0f);
                        eVar2.i(8.0f, 2.0f);
                        eVar2.i(6.0f, 2.0f);
                        eVar2.p(2.0f);
                        eVar2.i(5.0f, 4.0f);
                        eVar2.e(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        eVar2.i(3.0f, 20.0f);
                        eVar2.e(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        eVar2.h(14.0f);
                        eVar2.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        eVar2.i(21.0f, 6.0f);
                        eVar2.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        hb.a.r(eVar2, 19.0f, 20.0f, 5.0f, 20.0f);
                        hb.a.t(eVar2, 5.0f, 9.0f, 14.0f, 11.0f);
                        u4.d.a.b(aVar5, eVar2.f168407a, 0, t1Var2, 1.0f, null, 1.0f, i16, 1.0f);
                        dVarC2 = aVar5.c();
                        l3.z0.f109505d = dVarC2;
                    }
                    int i17 = l3.n1.f109367b;
                    String strH2 = l3.k.h(mVar2, R.string.m3c_date_picker_switch_to_calendar_mode);
                    boolean zB2 = mVar2.B(lVar);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new gt1.k(lVar, 7);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new gt1.k(lVar, 7);
                            mVar2.K(objQ2);
                        }
                    }
                    x3.h(0, 16, (e23.a) objQ2, this.f90231c, strH2, mVar2, dVarC2, false);
                    mVar2.f();
                }
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class j implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f90232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j23.l f90233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l3.e0 f90234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l3.h0 f90235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f90236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l3.d0 f90237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Long f90238g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ l3 f90239h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ bc f90240i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ b3 f90241j;

        /* JADX WARN: Multi-variable type inference failed */
        public j(e2.i0 i0Var, j23.l lVar, l3.e0 e0Var, l3.h0 h0Var, e23.l<? super Long, Unit> lVar2, l3.d0 d0Var, Long l14, l3 l3Var, bc bcVar, b3 b3Var) {
            this.f90232a = i0Var;
            this.f90233b = lVar;
            this.f90234c = e0Var;
            this.f90235d = h0Var;
            this.f90236e = lVar2;
            this.f90237f = d0Var;
            this.f90238g = l14;
            this.f90239h = l3Var;
            this.f90240i = bcVar;
            this.f90241j = b3Var;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new i11.f(11);
                    mVar2.K(objQ);
                }
                h4.r rVarC = p5.v.c((e23.l) objQ, aVar, false);
                d3.f87817a.getClass();
                s1.z zVarE = s1.v.e();
                s1.f0 f0VarB = k9.b(n3.h0.DefaultEffects, mVar2);
                boolean zB = mVar2.B(zVarE);
                e2.i0 i0Var = this.f90232a;
                boolean zB2 = zB | mVar2.B(i0Var);
                Object objQ2 = mVar2.q();
                if (zB2 || objQ2 == c2565a) {
                    e3 e3Var = new e3(new z1.f(i0Var, z1.u.a.f200875a));
                    float f14 = z1.s.f200874a;
                    objQ2 = new z1.o(e3Var, zVarE, f0VarB);
                    mVar2.K(objQ2);
                }
                p008y1.t3 t3Var = (p008y1.t3) objQ2;
                boolean zR = mVar2.r(this.f90233b) | mVar2.r(this.f90234c) | mVar2.B(this.f90235d) | mVar2.B(this.f90236e) | mVar2.B(this.f90237f) | mVar2.B(this.f90238g) | mVar2.r(this.f90239h) | mVar2.B(this.f90240i) | mVar2.B(this.f90241j);
                Object objQ3 = mVar2.q();
                if (zR || objQ3 == c2565a) {
                    b4 b4Var = new b4(this.f90233b, this.f90234c, this.f90235d, this.f90236e, this.f90237f, this.f90238g, this.f90239h, this.f90240i, this.f90241j, 0);
                    mVar2.K(b4Var);
                    objQ3 = b4Var;
                }
                e2.c.c(rVarC, i0Var, null, null, null, t3Var, false, null, (e23.l) objQ3, mVar2, 0, 444);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", f = "DatePicker.kt", l = {1754}, m = "invokeSuspend")
    public static final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f90242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f90243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f90244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l3.e0 f90245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j23.l f90246e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(e2.i0 i0Var, e23.l<? super Long, Unit> lVar, l3.e0 e0Var, j23.l lVar2, t13.d<? super k> dVar) {
            super(2, dVar);
            this.f90243b = i0Var;
            this.f90244c = lVar;
            this.f90245d = e0Var;
            this.f90246e = lVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new k(this.f90243b, this.f90244c, this.f90245d, this.f90246e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f90242a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f90242a = 1;
                float f14 = x3.f90191a;
                e2.i0 i0Var = this.f90243b;
                Object objCollect = p3.p0.s(new ct1.c(i0Var, 3)).collect(new j4(i0Var, this.f90244c, this.f90245d, this.f90246e), this);
                if (objCollect != aVar) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class l implements e23.q<gj, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f90247a;

        public l(String str) {
            this.f90247a = str;
        }

        @Override // e23.q
        public final Unit invoke(gj gjVar, p3.m mVar, Integer num) {
            gj gjVar2 = gjVar;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? mVar2.B(gjVar2) : mVar2.r(gjVar2) ? 4 : 2;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                p3.x1 x1Var = p3.n.f135158a;
                ej.a(gjVar2, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, z3.f.c(1905952188, new d4(this.f90247a), mVar2), mVar2, (iIntValue & 14) | C.ENCODING_PCM_32BIT, 255);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class m implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f90248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h4.r f90249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f90250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u4.d f90251d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f90252e;

        public m(e23.a<Unit> aVar, h4.r rVar, boolean z14, u4.d dVar, String str) {
            this.f90248a = aVar;
            this.f90249b = rVar;
            this.f90250c = z14;
            this.f90251d = dVar;
            this.f90252e = str;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h7.a(this.f90248a, this.f90249b, this.f90250c, null, null, z3.f.c(-1301085432, new e4(this.f90251d, this.f90252e), mVar2), mVar2, 1572864, 56);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class n implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f90253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b3 f90254b;

        public n(String str, b3 b3Var) {
            this.f90253a = str;
            this.f90254b = b3Var;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038  */
        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                String str = this.f90253a;
                boolean zB = mVar2.B(str);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new i11.g(this.f90253a, 6);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new i11.g(this.f90253a, 6);
                        mVar2.K(objQ);
                    }
                }
                mh.c(str, p5.v.c((e23.l) objQ, aVar, false), this.f90254b.f87542f, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262136);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class o implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f90255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f90256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f90257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f90258d;

        public o(e23.a<Unit> aVar, boolean z14, e23.a<Unit> aVar2, boolean z15) {
            this.f90255a = aVar;
            this.f90256b = z14;
            this.f90257c = aVar2;
            this.f90258d = z15;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                c2.s2 s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, mVar2, 0);
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(aVar, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                p3.b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
                c2.u2 u2Var = c2.u2.f22900a;
                l3.y0.f109494a.getClass();
                u4.d dVarC = l3.y0.f109495b;
                if (dVarC == null) {
                    g6.f.a aVar3 = g6.f.f75994b;
                    u4.d.a aVar4 = new u4.d.a("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96, null);
                    p13.j0 j0Var = u4.m.f168519a;
                    o4.d0.f128823b.getClass();
                    o4.t1 t1Var = new o4.t1(o4.d0.f128824c, null);
                    o4.u1.f129010b.getClass();
                    o4.v1.f129019b.getClass();
                    int i14 = o4.v1.f129021d;
                    u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(15.41f, 16.59f, 10.83f, 12.0f);
                    eVarM.j(4.58f, -4.59f);
                    eVarM.i(14.0f, 6.0f);
                    eVarM.j(-6.0f, 6.0f);
                    com.nimbusds.jose.shaded.gson.internal.a.C(eVarM, 6.0f, 6.0f, 1.41f, -1.41f);
                    u4.d.a.b(aVar4, eVarM.f168407a, 0, t1Var, 1.0f, null, 1.0f, i14, 1.0f);
                    dVarC = aVar4.c();
                    l3.y0.f109495b = dVarC;
                }
                u4.d dVar = dVarC;
                int i15 = l3.n1.f109367b;
                x3.h(0, 8, this.f90255a, null, l3.k.h(mVar2, R.string.m3c_date_picker_switch_to_previous_month), mVar2, dVar, this.f90256b);
                u4.d dVarC2 = l3.y0.f109496c;
                if (dVarC2 == null) {
                    g6.f.a aVar5 = g6.f.f75994b;
                    u4.d.a aVar6 = new u4.d.a("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96, null);
                    p13.j0 j0Var2 = u4.m.f168519a;
                    o4.d0.f128823b.getClass();
                    o4.t1 t1Var2 = new o4.t1(o4.d0.f128824c, null);
                    o4.u1.f129010b.getClass();
                    o4.v1.f129019b.getClass();
                    int i16 = o4.v1.f129021d;
                    u4.e eVarM2 = com.nimbusds.jose.shaded.gson.internal.a.m(8.59f, 16.59f, 13.17f, 12.0f);
                    eVarM2.i(8.59f, 7.41f);
                    eVarM2.i(10.0f, 6.0f);
                    eVarM2.j(6.0f, 6.0f);
                    com.nimbusds.jose.shaded.gson.internal.a.C(eVarM2, -6.0f, 6.0f, -1.41f, -1.41f);
                    u4.d.a.b(aVar6, eVarM2.f168407a, 0, t1Var2, 1.0f, null, 1.0f, i16, 1.0f);
                    dVarC2 = aVar6.c();
                    l3.y0.f109496c = dVarC2;
                }
                x3.h(0, 8, this.f90257c, null, l3.k.h(mVar2, R.string.m3c_date_picker_switch_to_next_month), mVar2, dVarC2, this.f90258d);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class p implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f90259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b3 f90260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f90261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f90262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f90263e;

        public p(String str, b3 b3Var, boolean z14, boolean z15, boolean z16) {
            this.f90259a = str;
            this.f90260b = b3Var;
            this.f90261c = z14;
            this.f90262d = z15;
            this.f90263e = z16;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            long j8;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r.a aVar = h4.r.S;
                h4.r rVarF = c2.x2.f(aVar, 1.0f);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(rVarF, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
                c2.u uVar = c2.u.f22885a;
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i11.f(12);
                    mVar2.K(objQ);
                }
                h4.r rVarB = p5.v.b(aVar, (e23.l) objQ);
                b3 b3Var = this.f90260b;
                b3Var.getClass();
                boolean z14 = this.f90262d;
                boolean z15 = this.f90263e;
                if (z14 && z15) {
                    j8 = b3Var.f87546j;
                } else if (z14 && !z15) {
                    j8 = b3Var.f87547k;
                } else if (this.f90261c && z15) {
                    j8 = b3Var.f87545i;
                } else {
                    j8 = z15 ? b3Var.f87543g : b3Var.f87544h;
                }
                long j14 = ((o4.d0) r1.f2.a(j8, k9.b(n3.h0.DefaultEffects, mVar2), mVar2).getF182175a()).f128833a;
                d6.h.f57752b.getClass();
                mh.c(this.f90259a, rVarB, j14, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 261112);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class q implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l3.e0 f90264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f90265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j23.l f90266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h4.r f90267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b3 f90268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.l<Integer, Unit> f90269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ bc f90270g;

        /* JADX WARN: Multi-variable type inference failed */
        public q(l3.e0 e0Var, long j8, j23.l lVar, h4.r rVar, b3 b3Var, e23.l<? super Integer, Unit> lVar2, bc bcVar) {
            this.f90264a = e0Var;
            this.f90265b = j8;
            this.f90266c = lVar;
            this.f90267d = rVar;
            this.f90268e = b3Var;
            this.f90269f = lVar2;
            this.f90270g = bcVar;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0098  */
        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                l3.e0 e0Var = this.f90264a;
                int i14 = e0Var.g(e0Var.h()).f109260a;
                int i15 = e0Var.f(this.f90265b).f109260a;
                j23.l lVar = this.f90266c;
                f2.p0 p0VarA = f2.r0.a(Math.max(0, (i15 - lVar.f96796a) - 3), mVar2, 2);
                f2.b.C1415b c1415b = new f2.b.C1415b(3);
                b3 b3Var = this.f90268e;
                h4.r rVarE = u1.n.e(this.f90267d, b3Var.f87537a, o4.m1.f128891a);
                c2.j.f22691a.getClass();
                c2.j.h hVar = c2.j.f22697g;
                c2.j.i iVarI = c2.j.i(x3.f90196f);
                boolean zR = mVar2.r(e0Var) | mVar2.r(lVar) | mVar2.k(i15) | mVar2.k(i14) | mVar2.B(this.f90269f) | mVar2.B(this.f90270g) | mVar2.B(b3Var);
                Object objQ = mVar2.q();
                if (zR) {
                    g4 g4Var = new g4(this.f90266c, this.f90264a, i15, i14, this.f90269f, this.f90270g, this.f90268e);
                    mVar2.K(g4Var);
                    objQ = g4Var;
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        g4 g4Var2 = new g4(this.f90266c, this.f90264a, i15, i14, this.f90269f, this.f90270g, this.f90268e);
                        mVar2.K(g4Var2);
                        objQ = g4Var2;
                    }
                }
                f2.j.a(c1415b, rVarE, p0VarA, null, iVarI, hVar, null, false, null, (e23.l) objQ, mVar2, 1769472, 0, 920);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f90191a = 48;
        f90192b = 56;
        float f14 = 12;
        f90193c = f14;
        f90194d = c2.l.e(0.0f, 0.0f, f14, f14, 3);
        float f15 = 24;
        float f16 = 16;
        c2.l.e(f15, f16, f14, 0.0f, 8);
        f90195e = c2.l.e(f15, 0.0f, f14, f14, 2);
        f90196f = f16;
    }

    public static final void a(h4.r rVar, e23.p pVar, e23.p pVar2, e23.p pVar3, b3 b3Var, s5.x0 x0Var, float f14, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        e23.p pVar4;
        e23.p pVar5;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(1539132883);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            pVar4 = pVar2;
            i15 |= o0VarE.r(pVar4) ? 256 : 128;
        } else {
            pVar4 = pVar2;
        }
        if ((i14 & 3072) == 0) {
            pVar5 = pVar3;
            i15 |= o0VarE.r(pVar5) ? 2048 : 1024;
        } else {
            pVar5 = pVar3;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(b3Var) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(x0Var) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.i(f14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 4793491) != 4793490)) {
            p3.x1 x1Var = p3.n.f135158a;
            n3.n.f123126a.getClass();
            h4.r rVarT = c2.x2.t(rVar, n3.n.f123130e, 0.0f, 0.0f, 14);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new i11.f(7);
                o0VarE.K(objQ);
            }
            h4.r rVarE = u1.n.e(p5.v.c((e23.l) objQ, rVarT, false), b3Var.f87537a, o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d(h4.r.S, pVar, b3Var.f87538b, b3Var.f87539c, f14, z3.f.c(-1658370654, new w3(pVar4, pVar5, pVar, b3Var, x0Var), o0VarE), o0VarE, (i16 & 112) | 196614 | (57344 & (i16 >> 6)));
            o0Var = o0VarE;
            b71.i.n(14 & (i16 >> 21), eVar, o0Var, true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s3(rVar, pVar, pVar2, pVar3, b3Var, x0Var, f14, eVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0148  */
    /* JADX WARN: Code duplicated, block: B:102:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x015f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0175  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x0120  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(k4 k4Var, h4.r rVar, l3 l3Var, b3 b3Var, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, boolean z14, m4.b0 b0Var, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        e23.p<? super p3.m, ? super Integer, Unit> pVarC;
        int i18;
        int i19;
        boolean z15;
        l3 l3Var2;
        h4.r rVar3;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        m4.b0 b0Var2;
        p3.p2 p2VarI0;
        int i24;
        z3.e eVarC;
        p3.m.a aVar;
        Object objQ;
        h4.r rVar4;
        m4.b0 b0Var3;
        int i25;
        l3 l3Var3;
        Object objQ2;
        boolean zB;
        Object objQ3;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean zR;
        l3 l3Var4 = l3Var;
        p3.o0 o0VarE = mVar.E(1105472031);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(k4Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i30 = i15 & 2;
        if (i30 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if ((i15 & 4) != 0) {
                    i29 = 128;
                } else {
                    if ((i14 & 512) == 0) {
                        zR = o0VarE.B(l3Var4);
                    } else {
                        zR = o0VarE.r(l3Var4);
                    }
                    if (zR) {
                        i29 = 256;
                    } else {
                        i29 = 128;
                    }
                }
                i16 |= i29;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.B(b3Var)) {
                    i28 = 2048;
                } else {
                    i28 = 1024;
                }
                i16 |= i28;
            }
            if ((i14 & 24576) != 0) {
                if (o0VarE.r(pVar)) {
                    i27 = 16384;
                } else {
                    i27 = 8192;
                }
                i16 |= i27;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    pVarC = pVar2;
                    if (o0VarE.r(pVarC)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                if ((1572864 & i14) == 0) {
                    if (o0VarE.h(z14)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                i19 = i16 | 12582912;
                if ((4793491 & i19) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (o0VarE.n(i19 & 1, z15)) {
                    o0VarE.G0();
                    i24 = i14 & 1;
                    eVarC = null;
                    aVar = p3.m.f135153a;
                    if (i24 != 0 || o0VarE.o0()) {
                        if (i30 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i15 & 4) != 0) {
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = d3.c(d3.f87817a, null, 7);
                                o0VarE.K(objQ2);
                            }
                            l3Var4 = (l3) objQ2;
                            i19 &= -897;
                        }
                        if (i17 != 0) {
                            pVarC = z3.f.c(1439279037, new a(k4Var, l3Var4, b3Var), o0VarE);
                        }
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = kg.f.j(o0VarE);
                        }
                        rVar4 = rVar2;
                        b0Var3 = (m4.b0) objQ;
                        i25 = i19;
                        l3Var3 = l3Var4;
                    } else {
                        o0VarE.e();
                        if ((i15 & 4) != 0) {
                            i19 &= -897;
                        }
                        rVar4 = rVar2;
                        b0Var3 = b0Var;
                        l3Var3 = l3Var4;
                        i25 = i19;
                    }
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    zB = o0VarE.B(k4Var.getLocale());
                    objQ3 = o0VarE.q();
                    if (zB) {
                        if (k4Var instanceof a0) {
                            objQ3 = ((a0) k4Var).f87406c;
                        } else {
                            objQ3 = new l3.f0(k4Var.getLocale());
                        }
                        o0VarE.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            if (k4Var instanceof a0) {
                                objQ3 = ((a0) k4Var).f87406c;
                            } else {
                                objQ3 = new l3.f0(k4Var.getLocale());
                            }
                            o0VarE.K(objQ3);
                        }
                    }
                    l3.e0 e0Var = (l3.e0) objQ3;
                    if (z14) {
                        o0VarE.C(-690551113);
                        eVarC = z3.f.c(-1483431603, new b(k4Var, b3Var), o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-690163489);
                        o0VarE.g0(false);
                    }
                    n3.n.f123126a.getClass();
                    s5.x0 x0VarA = sj.a(n3.n.f123144s, o0VarE);
                    float f14 = n3.n.f123142q;
                    z3.e eVarC2 = z3.f.c(-1346903698, new c(k4Var, e0Var, l3Var3, b3Var, b0Var3), o0VarE);
                    int i34 = i25 >> 9;
                    int i35 = ((i25 >> 3) & 14) | 14155776 | (i34 & 112) | (i34 & 896) | (57344 & (i25 << 3));
                    h4.r rVar5 = rVar4;
                    e23.p<? super p3.m, ? super Integer, Unit> pVar4 = pVarC;
                    a(rVar5, pVar, pVar4, eVarC, b3Var, x0VarA, f14, eVarC2, o0VarE, i35);
                    pVar3 = pVar4;
                    l3Var2 = l3Var3;
                    rVar3 = rVar5;
                    b0Var2 = b0Var3;
                } else {
                    o0VarE.e();
                    l3Var2 = l3Var4;
                    rVar3 = rVar2;
                    pVar3 = pVarC;
                    b0Var2 = b0Var;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a3.q(k4Var, rVar3, l3Var2, b3Var, pVar, pVar3, z14, b0Var2, i14, i15);
                }
            }
            i16 |= 196608;
            pVarC = pVar2;
            if ((1572864 & i14) == 0) {
                if (o0VarE.h(z14)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            i19 = i16 | 12582912;
            if ((4793491 & i19) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i19 & 1, z15)) {
                o0VarE.G0();
                i24 = i14 & 1;
                eVarC = null;
                aVar = p3.m.f135153a;
                if (i24 != 0) {
                    if (i30 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i15 & 4) != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = d3.c(d3.f87817a, null, 7);
                            o0VarE.K(objQ2);
                        }
                        l3Var4 = (l3) objQ2;
                        i19 &= -897;
                    }
                    if (i17 != 0) {
                        pVarC = z3.f.c(1439279037, new a(k4Var, l3Var4, b3Var), o0VarE);
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.j(o0VarE);
                    }
                    rVar4 = rVar2;
                    b0Var3 = (m4.b0) objQ;
                    i25 = i19;
                    l3Var3 = l3Var4;
                } else {
                    if (i30 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i15 & 4) != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = d3.c(d3.f87817a, null, 7);
                            o0VarE.K(objQ2);
                        }
                        l3Var4 = (l3) objQ2;
                        i19 &= -897;
                    }
                    if (i17 != 0) {
                        pVarC = z3.f.c(1439279037, new a(k4Var, l3Var4, b3Var), o0VarE);
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.j(o0VarE);
                    }
                    rVar4 = rVar2;
                    b0Var3 = (m4.b0) objQ;
                    i25 = i19;
                    l3Var3 = l3Var4;
                }
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                zB = o0VarE.B(k4Var.getLocale());
                objQ3 = o0VarE.q();
                if (zB) {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        if (k4Var instanceof a0) {
                            objQ3 = ((a0) k4Var).f87406c;
                        } else {
                            objQ3 = new l3.f0(k4Var.getLocale());
                        }
                        o0VarE.K(objQ3);
                    }
                } else {
                    if (k4Var instanceof a0) {
                        objQ3 = ((a0) k4Var).f87406c;
                    } else {
                        objQ3 = new l3.f0(k4Var.getLocale());
                    }
                    o0VarE.K(objQ3);
                }
                l3.e0 e0Var2 = (l3.e0) objQ3;
                if (z14) {
                    o0VarE.C(-690551113);
                    eVarC = z3.f.c(-1483431603, new b(k4Var, b3Var), o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-690163489);
                    o0VarE.g0(false);
                }
                n3.n.f123126a.getClass();
                s5.x0 x0VarA2 = sj.a(n3.n.f123144s, o0VarE);
                float f15 = n3.n.f123142q;
                z3.e eVarC3 = z3.f.c(-1346903698, new c(k4Var, e0Var2, l3Var3, b3Var, b0Var3), o0VarE);
                int i36 = i25 >> 9;
                int i37 = ((i25 >> 3) & 14) | 14155776 | (i36 & 112) | (i36 & 896) | (57344 & (i25 << 3));
                h4.r rVar6 = rVar4;
                e23.p<? super p3.m, ? super Integer, Unit> pVar5 = pVarC;
                a(rVar6, pVar, pVar5, eVarC, b3Var, x0VarA2, f15, eVarC3, o0VarE, i37);
                pVar3 = pVar5;
                l3Var2 = l3Var3;
                rVar3 = rVar6;
                b0Var2 = b0Var3;
            } else {
                o0VarE.e();
                l3Var2 = l3Var4;
                rVar3 = rVar2;
                pVar3 = pVarC;
                b0Var2 = b0Var;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a3.q(k4Var, rVar3, l3Var2, b3Var, pVar, pVar3, z14, b0Var2, i14, i15);
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        if ((i14 & 384) == 0) {
            if ((i15 & 4) != 0) {
                i29 = 128;
            } else {
                if ((i14 & 512) == 0) {
                    zR = o0VarE.B(l3Var4);
                } else {
                    zR = o0VarE.r(l3Var4);
                }
                if (zR) {
                    i29 = 256;
                } else {
                    i29 = 128;
                }
            }
            i16 |= i29;
        }
        if ((i14 & 3072) == 0) {
            if (o0VarE.B(b3Var)) {
                i28 = 2048;
            } else {
                i28 = 1024;
            }
            i16 |= i28;
        }
        if ((i14 & 24576) != 0) {
            if (o0VarE.r(pVar)) {
                i27 = 16384;
            } else {
                i27 = 8192;
            }
            i16 |= i27;
        }
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                pVarC = pVar2;
                if (o0VarE.r(pVarC)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.h(z14)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            i19 = i16 | 12582912;
            if ((4793491 & i19) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i19 & 1, z15)) {
                o0VarE.G0();
                i24 = i14 & 1;
                eVarC = null;
                aVar = p3.m.f135153a;
                if (i24 != 0) {
                    if (i30 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i15 & 4) != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = d3.c(d3.f87817a, null, 7);
                            o0VarE.K(objQ2);
                        }
                        l3Var4 = (l3) objQ2;
                        i19 &= -897;
                    }
                    if (i17 != 0) {
                        pVarC = z3.f.c(1439279037, new a(k4Var, l3Var4, b3Var), o0VarE);
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.j(o0VarE);
                    }
                    rVar4 = rVar2;
                    b0Var3 = (m4.b0) objQ;
                    i25 = i19;
                    l3Var3 = l3Var4;
                } else {
                    if (i30 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i15 & 4) != 0) {
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = d3.c(d3.f87817a, null, 7);
                            o0VarE.K(objQ2);
                        }
                        l3Var4 = (l3) objQ2;
                        i19 &= -897;
                    }
                    if (i17 != 0) {
                        pVarC = z3.f.c(1439279037, new a(k4Var, l3Var4, b3Var), o0VarE);
                    }
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.j(o0VarE);
                    }
                    rVar4 = rVar2;
                    b0Var3 = (m4.b0) objQ;
                    i25 = i19;
                    l3Var3 = l3Var4;
                }
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                zB = o0VarE.B(k4Var.getLocale());
                objQ3 = o0VarE.q();
                if (zB) {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        if (k4Var instanceof a0) {
                            objQ3 = ((a0) k4Var).f87406c;
                        } else {
                            objQ3 = new l3.f0(k4Var.getLocale());
                        }
                        o0VarE.K(objQ3);
                    }
                } else {
                    if (k4Var instanceof a0) {
                        objQ3 = ((a0) k4Var).f87406c;
                    } else {
                        objQ3 = new l3.f0(k4Var.getLocale());
                    }
                    o0VarE.K(objQ3);
                }
                l3.e0 e0Var3 = (l3.e0) objQ3;
                if (z14) {
                    o0VarE.C(-690551113);
                    eVarC = z3.f.c(-1483431603, new b(k4Var, b3Var), o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-690163489);
                    o0VarE.g0(false);
                }
                n3.n.f123126a.getClass();
                s5.x0 x0VarA3 = sj.a(n3.n.f123144s, o0VarE);
                float f16 = n3.n.f123142q;
                z3.e eVarC4 = z3.f.c(-1346903698, new c(k4Var, e0Var3, l3Var3, b3Var, b0Var3), o0VarE);
                int i38 = i25 >> 9;
                int i39 = ((i25 >> 3) & 14) | 14155776 | (i38 & 112) | (i38 & 896) | (57344 & (i25 << 3));
                h4.r rVar7 = rVar4;
                e23.p<? super p3.m, ? super Integer, Unit> pVar6 = pVarC;
                a(rVar7, pVar, pVar6, eVarC, b3Var, x0VarA3, f16, eVarC4, o0VarE, i39);
                pVar3 = pVar6;
                l3Var2 = l3Var3;
                rVar3 = rVar7;
                b0Var2 = b0Var3;
            } else {
                o0VarE.e();
                l3Var2 = l3Var4;
                rVar3 = rVar2;
                pVar3 = pVarC;
                b0Var2 = b0Var;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a3.q(k4Var, rVar3, l3Var2, b3Var, pVar, pVar3, z14, b0Var2, i14, i15);
            }
        }
        i16 |= 196608;
        pVarC = pVar2;
        if ((1572864 & i14) == 0) {
            if (o0VarE.h(z14)) {
                i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i26 = 524288;
            }
            i16 |= i26;
        }
        i19 = i16 | 12582912;
        if ((4793491 & i19) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i19 & 1, z15)) {
            o0VarE.G0();
            i24 = i14 & 1;
            eVarC = null;
            aVar = p3.m.f135153a;
            if (i24 != 0) {
                if (i30 != 0) {
                    rVar2 = h4.r.S;
                }
                if ((i15 & 4) != 0) {
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = d3.c(d3.f87817a, null, 7);
                        o0VarE.K(objQ2);
                    }
                    l3Var4 = (l3) objQ2;
                    i19 &= -897;
                }
                if (i17 != 0) {
                    pVarC = z3.f.c(1439279037, new a(k4Var, l3Var4, b3Var), o0VarE);
                }
                objQ = o0VarE.q();
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.j(o0VarE);
                }
                rVar4 = rVar2;
                b0Var3 = (m4.b0) objQ;
                i25 = i19;
                l3Var3 = l3Var4;
            } else {
                if (i30 != 0) {
                    rVar2 = h4.r.S;
                }
                if ((i15 & 4) != 0) {
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = d3.c(d3.f87817a, null, 7);
                        o0VarE.K(objQ2);
                    }
                    l3Var4 = (l3) objQ2;
                    i19 &= -897;
                }
                if (i17 != 0) {
                    pVarC = z3.f.c(1439279037, new a(k4Var, l3Var4, b3Var), o0VarE);
                }
                objQ = o0VarE.q();
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.j(o0VarE);
                }
                rVar4 = rVar2;
                b0Var3 = (m4.b0) objQ;
                i25 = i19;
                l3Var3 = l3Var4;
            }
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            zB = o0VarE.B(k4Var.getLocale());
            objQ3 = o0VarE.q();
            if (zB) {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    if (k4Var instanceof a0) {
                        objQ3 = ((a0) k4Var).f87406c;
                    } else {
                        objQ3 = new l3.f0(k4Var.getLocale());
                    }
                    o0VarE.K(objQ3);
                }
            } else {
                if (k4Var instanceof a0) {
                    objQ3 = ((a0) k4Var).f87406c;
                } else {
                    objQ3 = new l3.f0(k4Var.getLocale());
                }
                o0VarE.K(objQ3);
            }
            l3.e0 e0Var4 = (l3.e0) objQ3;
            if (z14) {
                o0VarE.C(-690551113);
                eVarC = z3.f.c(-1483431603, new b(k4Var, b3Var), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-690163489);
                o0VarE.g0(false);
            }
            n3.n.f123126a.getClass();
            s5.x0 x0VarA4 = sj.a(n3.n.f123144s, o0VarE);
            float f17 = n3.n.f123142q;
            z3.e eVarC5 = z3.f.c(-1346903698, new c(k4Var, e0Var4, l3Var3, b3Var, b0Var3), o0VarE);
            int i310 = i25 >> 9;
            int i311 = ((i25 >> 3) & 14) | 14155776 | (i310 & 112) | (i310 & 896) | (57344 & (i25 << 3));
            h4.r rVar8 = rVar4;
            e23.p<? super p3.m, ? super Integer, Unit> pVar7 = pVarC;
            a(rVar8, pVar, pVar7, eVarC, b3Var, x0VarA4, f17, eVarC5, o0VarE, i311);
            pVar3 = pVar7;
            l3Var2 = l3Var3;
            rVar3 = rVar8;
            b0Var2 = b0Var3;
        } else {
            o0VarE.e();
            l3Var2 = l3Var4;
            rVar3 = rVar2;
            pVar3 = pVarC;
            b0Var2 = b0Var;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.q(k4Var, rVar3, l3Var2, b3Var, pVar, pVar3, z14, b0Var2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029f  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:104:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:111:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:113:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x0206  */
    /* JADX WARN: Code duplicated, block: B:90:0x0257  */
    /* JADX WARN: Code duplicated, block: B:92:0x025e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0262  */
    /* JADX WARN: Code duplicated, block: B:98:0x027d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(Long l14, long j8, e23.l<? super Long, Unit> lVar, e23.l<? super Long, Unit> lVar2, l3.e0 e0Var, j23.l lVar3, l3 l3Var, bc bcVar, b3 b3Var, p3.m mVar, int i14) {
        h5.g.a.e eVar;
        h5.g.a.f fVar;
        float f14;
        String strA;
        boolean zR;
        Object objQ;
        boolean zR2;
        Object objQ2;
        boolean zB;
        Object objQ3;
        int i15;
        h5.g.a.e eVar2;
        f5.z0 z0VarD;
        int iP;
        p3.i2 i2VarA0;
        h4.r rVarC;
        c2.z zVarA;
        int iP2;
        p3.i2 i2VarA1;
        h4.r rVarC2;
        p3.o0 o0VarE = mVar.E(-434467002);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(l14) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(e0Var) ? 16384 : 8192) | (o0VarE.r(lVar3) ? 131072 : 65536) | (o0VarE.B(l3Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(bcVar) ? 8388608 : 4194304) | (o0VarE.B(b3Var) ? 67108864 : 33554432);
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (38347923 & i16) != 38347922)) {
            p3.x1 x1Var = p3.n.f135158a;
            l3.h0 h0VarF = e0Var.f(j8);
            int i18 = (((h0VarF.f109260a - lVar3.f96796a) * 12) + h0VarF.f109261b) - 1;
            if (i18 < 0) {
                i18 = 0;
            }
            e2.i0 i0VarA = e2.k0.a(i18, 0, 2, o0VarE);
            Integer numValueOf = Integer.valueOf(i18);
            boolean zB2 = o0VarE.B(i0VarA) | o0VarE.k(i18);
            Object objQ4 = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB2) {
                objQ4 = new d(i0VarA, i18, null);
                o0VarE.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new d(i0VarA, i18, null);
                    o0VarE.K(objQ4);
                }
            }
            p3.l0.e((e23.p) objQ4, numValueOf, o0VarE);
            Object objQ5 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ5 == c2565a) {
                objQ5 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ5);
            }
            o53.b0 b0Var = (o53.b0) objQ5;
            Object[] objArr = new Object[0];
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new i01.j(14);
                o0VarE.K(objQ6);
            }
            p3.p1 p1Var = (p3.p1) d4.a.e(objArr, (e23.a) objQ6, o0VarE, 48);
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            c2.z zVarA2 = c2.y.a(kVar, aVar3, o0VarE, 0);
            int iP3 = o0VarE.P();
            p3.i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            p3.b4.c(eVar3, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                eVar = eVar3;
            } else {
                eVar = eVar3;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP3))) {
                }
                fVar = h5.g.a.f81807d;
                p3.b4.c(fVar, rVarC3, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                f14 = f90193c;
                h4.r rVarA = c2.l.A(aVar2, f14, 0.0f, 2);
                boolean zC = i0VarA.c();
                boolean zE = i0VarA.e();
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                strA = l3Var.a(Long.valueOf(j8), e0Var.f109226a);
                if (strA == null) {
                    strA = "-";
                }
                String str = strA;
                zR = o0VarE.r(b0Var) | o0VarE.B(i0VarA);
                objQ = o0VarE.q();
                if (zR || objQ == c2565a) {
                    objQ = new et1.y(b0Var, i0VarA, i17);
                    o0VarE.K(objQ);
                }
                e23.a aVar5 = (e23.a) objQ;
                zR2 = o0VarE.r(b0Var) | o0VarE.B(i0VarA);
                objQ2 = o0VarE.q();
                if (zR2 || objQ2 == c2565a) {
                    objQ2 = new et1.y(b0Var, i0VarA, 2);
                    o0VarE.K(objQ2);
                }
                e23.a aVar6 = (e23.a) objQ2;
                zB = o0VarE.B(p1Var);
                objQ3 = o0VarE.q();
                if (zB || objQ3 == c2565a) {
                    objQ3 = new i11.i(p1Var, 1);
                    o0VarE.K(objQ3);
                }
                i15 = i16 & 234881024;
                eVar2 = eVar;
                j(rVarA, zC, zE, zBooleanValue, str, aVar5, aVar6, (e23.a) objQ3, b3Var, o0VarE, i15 | 6);
                o0VarE = o0VarE;
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iP = o0VarE.P();
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar2, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                p3.b4.c(eVar2, z0VarD, o0VarE);
                p3.b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                    v.h.A(iP, o0VarE, iP, bVar);
                }
                p3.b4.c(fVar, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                h4.r rVarA2 = c2.l.A(aVar2, f14, 0.0f, 2);
                zVarA = c2.y.a(kVar, aVar3, o0VarE, 0);
                iP2 = o0VarE.P();
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA2, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                p3.b4.c(eVar2, zVarA, o0VarE);
                p3.b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                    v.h.A(iP2, o0VarE, iP2, bVar);
                }
                p3.b4.c(fVar, rVarC2, o0VarE);
                l(b3Var, e0Var, o0VarE, ((i16 >> 24) & 14) | ((i16 >> 9) & 112));
                g(i0VarA, l14, lVar, lVar2, e0Var, lVar3, l3Var, bcVar, b3Var, o0VarE, ((i16 << 3) & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (i16 & 29360128) | i15);
                o0VarE.g0(true);
                n3.h0 h0Var = n3.h0.DefaultEffects;
                s1.f0 f0VarB = k9.b(h0Var, o0VarE);
                s1.f0 f0VarB2 = k9.b(n3.h0.FastEffects, o0VarE);
                s1.f0 f0VarB3 = k9.b(h0Var, o0VarE);
                r1.c0.e(((Boolean) p1Var.getF182175a()).booleanValue(), l4.k.c(aVar2), r1.u0.c(f0VarB3, null, 14).b(new r1.v1(new r1.o2(new r1.y1(0.6f, f0VarB), null, null, null, null, false, null, 126, null))), r1.u0.j(f0VarB3, null, 14).b(r1.u0.e(f0VarB2, 2)), null, z3.f.c(1193716082, new g(j8, p1Var, b0Var, i0VarA, lVar3, h0VarF, bcVar, e0Var, b3Var), o0VarE), o0VarE, 196656, 16);
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iP3, o0VarE, iP3, bVar);
            fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var3 = c2.b0.f22601a;
            f14 = f90193c;
            h4.r rVarA3 = c2.l.A(aVar2, f14, 0.0f, 2);
            boolean zC2 = i0VarA.c();
            boolean zE2 = i0VarA.e();
            boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
            strA = l3Var.a(Long.valueOf(j8), e0Var.f109226a);
            if (strA == null) {
                strA = "-";
            }
            String str2 = strA;
            zR = o0VarE.r(b0Var) | o0VarE.B(i0VarA);
            objQ = o0VarE.q();
            if (zR) {
                objQ = new et1.y(b0Var, i0VarA, i17);
                o0VarE.K(objQ);
            } else {
                objQ = new et1.y(b0Var, i0VarA, i17);
                o0VarE.K(objQ);
            }
            e23.a aVar7 = (e23.a) objQ;
            zR2 = o0VarE.r(b0Var) | o0VarE.B(i0VarA);
            objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new et1.y(b0Var, i0VarA, 2);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new et1.y(b0Var, i0VarA, 2);
                o0VarE.K(objQ2);
            }
            e23.a aVar8 = (e23.a) objQ2;
            zB = o0VarE.B(p1Var);
            objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new i11.i(p1Var, 1);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new i11.i(p1Var, 1);
                o0VarE.K(objQ3);
            }
            i15 = i16 & 234881024;
            eVar2 = eVar;
            j(rVarA3, zC2, zE2, zBooleanValue2, str2, aVar7, aVar8, (e23.a) objQ3, b3Var, o0VarE, i15 | 6);
            o0VarE = o0VarE;
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iP = o0VarE.P();
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar2, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            p3.b4.c(eVar2, z0VarD, o0VarE);
            p3.b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iP, o0VarE, iP, bVar);
            } else {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(fVar, rVarC, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            h4.r rVarA4 = c2.l.A(aVar2, f14, 0.0f, 2);
            zVarA = c2.y.a(kVar, aVar3, o0VarE, 0);
            iP2 = o0VarE.P();
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarA4, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            p3.b4.c(eVar2, zVarA, o0VarE);
            p3.b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iP2, o0VarE, iP2, bVar);
            } else {
                v.h.A(iP2, o0VarE, iP2, bVar);
            }
            p3.b4.c(fVar, rVarC2, o0VarE);
            l(b3Var, e0Var, o0VarE, ((i16 >> 24) & 14) | ((i16 >> 9) & 112));
            g(i0VarA, l14, lVar, lVar2, e0Var, lVar3, l3Var, bcVar, b3Var, o0VarE, ((i16 << 3) & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (i16 & 29360128) | i15);
            o0VarE.g0(true);
            n3.h0 h0Var2 = n3.h0.DefaultEffects;
            s1.f0 f0VarB4 = k9.b(h0Var2, o0VarE);
            s1.f0 f0VarB5 = k9.b(n3.h0.FastEffects, o0VarE);
            s1.f0 f0VarB6 = k9.b(h0Var2, o0VarE);
            r1.c0.e(((Boolean) p1Var.getF182175a()).booleanValue(), l4.k.c(aVar2), r1.u0.c(f0VarB6, null, 14).b(new r1.v1(new r1.o2(new r1.y1(0.6f, f0VarB4), null, null, null, null, false, null, 126, null))), r1.u0.j(f0VarB6, null, 14).b(r1.u0.e(f0VarB5, 2)), null, z3.f.c(1193716082, new g(j8, p1Var, b0Var, i0VarA, lVar3, h0VarF, bcVar, e0Var, b3Var), o0VarE), o0VarE, 196656, 16);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u3(l14, j8, lVar, lVar2, e0Var, lVar3, l3Var, bcVar, b3Var, i14);
        }
    }

    public static final void d(final h4.r rVar, final e23.p pVar, final long j8, final long j14, final float f14, final z3.e eVar, p3.m mVar, final int i14) {
        int i15;
        boolean z14;
        p3.o0 o0VarE = mVar.E(2020490761);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.l(j8) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.l(j14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.i(f14) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarThen = c2.x2.f(rVar, 1.0f).then(pVar != null ? c2.x2.b(h4.r.S, 0.0f, f14, 1) : h4.r.S);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(gVar, h4.d.a.f81536n, o0VarE, 6);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            int i16 = i15;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (pVar != null) {
                o0VarE.C(396894187);
                n3.n.f123126a.getClass();
                z14 = true;
                l3.k.b(j8, sj.a(n3.n.f123146u, o0VarE), z3.f.c(1344395458, new a4(pVar), o0VarE), o0VarE, ((i16 >> 6) & 14) | 384);
                o0VarE.g0(false);
            } else {
                z14 = true;
                o0VarE.C(397163267);
                o0VarE.g0(false);
            }
            p3.v.a(s2.f89590a.c(o4.d0.a(j14)), eVar, o0VarE, ((i16 >> 12) & 112) | 8);
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.t3
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x3.d(rVar, pVar, j8, j14, f14, eVar, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    public static final void e(final String str, final h4.r rVar, final boolean z14, final e23.a<Unit> aVar, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final String str2, final b3 b3Var, p3.m mVar, final int i14) {
        String str3;
        int i15;
        boolean z19;
        p3.o0 o0Var;
        long j8;
        p3.x3 x3VarQ;
        p3.o0 o0VarE = mVar.E(-945355136);
        if ((i14 & 6) == 0) {
            str3 = str;
            i15 = (o0VarE.B(str3) ? 4 : 2) | i14;
        } else {
            str3 = str;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z15) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z16) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            z19 = z18;
            i15 |= o0VarE.h(z19) ? 8388608 : 4194304;
        } else {
            z19 = z18;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.B(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i15 |= o0VarE.B(b3Var) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean z24 = (234881024 & i15) == 67108864;
            Object objQ = o0VarE.q();
            if (z24) {
                objQ = new i11.g(str2, 3);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i11.g(str2, 3);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVar, true);
            n3.n.f123126a.getClass();
            o4.r1 r1VarC = fc.c(n3.n.f123132g, o0VarE);
            int i16 = i15 >> 6;
            b3Var.getClass();
            if (z14) {
                j8 = z16 ? b3Var.f87554r : b3Var.f87555s;
            } else {
                o4.d0.f128823b.getClass();
                j8 = o4.d0.f128831j;
            }
            if (z15) {
                o0VarE.C(-1319856736);
                x3VarQ = r1.f2.a(j8, k9.b(n3.h0.DefaultEffects, o0VarE), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1319630064);
                x3VarQ = p3.p0.q(o4.d0.a(j8), o0VarE);
                o0VarE.g0(false);
            }
            o0Var = o0VarE;
            ve.b(z14, aVar, rVarC, z16, r1VarC, ((o4.d0) x3VarQ.getF182175a()).f128833a, 0L, 0.0f, (!z17 || z14) ? null : u1.n.a(n3.n.f123139n, b3Var.f87557u), null, z3.f.c(1126347158, new h(str3, b3Var, z17, z14, z19, z16), o0VarE), o0Var, i16 & 7294, 1472);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.q3
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x3.e(str, rVar, z14, aVar, z15, z16, z17, z18, str2, b3Var, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void f(h4.r rVar, int i14, e23.l<? super q5, Unit> lVar, b3 b3Var, p3.m mVar, int i15) {
        p3.o0 o0VarE = mVar.E(-1461252485);
        int i16 = (o0VarE.k(i14) ? 32 : 16) | i15 | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.B(b3Var) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.v.a(s2.f89590a.c(o4.d0.a(b3Var.f87539c)), z3.f.c(-1734512197, new i(i14, lVar, rVar), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(rVar, i14, lVar, b3Var, i15, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x0118  */
    public static final void g(e2.i0 i0Var, Long l14, e23.l<? super Long, Unit> lVar, e23.l<? super Long, Unit> lVar2, l3.e0 e0Var, j23.l lVar3, l3 l3Var, bc bcVar, b3 b3Var, p3.m mVar, int i14) {
        Object kVar;
        e2.i0 i0Var2 = i0Var;
        p3.o0 o0VarE = mVar.E(-1994757941);
        int i15 = i14 | (o0VarE.B(i0Var2) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(l14) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(e0Var) ? 16384 : 8192) | (o0VarE.r(lVar3) ? 131072 : 65536) | (o0VarE.B(l3Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(bcVar) ? 8388608 : 4194304) | (o0VarE.B(b3Var) ? 67108864 : 33554432);
        if (o0VarE.n(i16 & 1, (38347923 & i16) != 38347922)) {
            p3.x1 x1Var = p3.n.f135158a;
            l3.d0 d0VarH = e0Var.h();
            boolean zB = o0VarE.B(lVar3);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = e0Var.e(lVar3.f96796a, 1);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = e0Var.e(lVar3.f96796a, 1);
                    o0VarE.K(objQ);
                }
            }
            n3.n.f123126a.getClass();
            mh.a(sj.a(n3.n.f123134i, o0VarE), z3.f.c(1504086906, new j(i0Var2, lVar3, e0Var, (l3.h0) objQ, lVar, d0VarH, l14, l3Var, bcVar, b3Var), o0VarE), o0VarE, 48);
            boolean zR = ((i16 & 14) == 4) | ((i16 & 7168) == 2048) | o0VarE.r(e0Var) | o0VarE.r(lVar3);
            Object objQ2 = o0VarE.q();
            if (zR) {
                i0Var2 = i0Var;
                kVar = new k(i0Var2, lVar2, e0Var, lVar3, null);
                o0VarE.K(kVar);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    i0Var2 = i0Var;
                    kVar = new k(i0Var2, lVar2, e0Var, lVar3, null);
                    o0VarE.K(kVar);
                } else {
                    kVar = objQ2;
                    i0Var2 = i0Var;
                }
            }
            p3.l0.e((e23.p) kVar, i0Var2, o0VarE);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(i0Var2, l14, lVar, lVar2, e0Var, lVar3, l3Var, bcVar, b3Var, i14);
        }
    }

    public static final void h(int i14, int i15, e23.a aVar, h4.r rVar, String str, p3.m mVar, u4.d dVar, boolean z14) {
        h4.r rVar2;
        int i16;
        boolean z15;
        int i17;
        boolean z16;
        p3.o0 o0VarE = mVar.E(-368059805);
        int i18 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128);
        int i19 = i15 & 8;
        if (i19 != 0) {
            i16 = i18 | 3072;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i18 | (o0VarE.B(rVar2) ? 2048 : 1024);
        }
        int i24 = i15 & 16;
        if (i24 != 0) {
            i17 = i16 | 24576;
            z15 = z14;
        } else {
            z15 = z14;
            i17 = i16 | (o0VarE.h(z15) ? 16384 : 8192);
        }
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            h4.r rVar3 = i19 != 0 ? h4.r.S : rVar2;
            boolean z17 = i24 == 0 ? z15 : true;
            p3.x1 x1Var = p3.n.f135158a;
            vi viVar = vi.f90035a;
            ti.f89828b.getClass();
            int i25 = ti.f89829c;
            viVar.getClass();
            ej.b(vi.a(i25, o0VarE, 390), z3.f.c(-456272562, new l(str), o0VarE), ej.d(0, 7, o0VarE, false), null, false, z3.f.c(-1124908186, new m(aVar, rVar3, z17, dVar, str), o0VarE), o0VarE, 100663344, 248);
            rVar2 = rVar3;
            z16 = z17;
        } else {
            o0VarE.e();
            z16 = z15;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(aVar, dVar, str, rVar2, z16, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x027f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0281  */
    /* JADX WARN: Code duplicated, block: B:130:0x0286  */
    /* JADX WARN: Code duplicated, block: B:133:0x028f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0291  */
    /* JADX WARN: Code duplicated, block: B:135:0x0296  */
    /* JADX WARN: Code duplicated, block: B:138:0x029c  */
    /* JADX WARN: Code duplicated, block: B:139:0x029e  */
    /* JADX WARN: Code duplicated, block: B:191:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:200:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ea  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(l3.h0 h0Var, e23.l<? super Long, Unit> lVar, long j8, Long l14, Long l15, cc ccVar, l3 l3Var, bc bcVar, b3 b3Var, Locale locale, p3.m mVar, int i14) {
        p3.o0 o0Var;
        h4.r rVarF;
        p3.o0 o0Var2;
        p3.c<?> cVar;
        boolean z14;
        boolean z15;
        long jLongValue;
        boolean z16;
        long jLongValue2;
        l3.h0 h0Var2 = h0Var;
        e23.l<? super Long, Unit> lVar2 = lVar;
        Object obj = ccVar;
        b3 b3Var2 = b3Var;
        Locale locale2 = locale;
        p3.o0 o0VarE = mVar.E(-333300603);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = (o0VarE.B(h0Var2) ? 4 : 2) | i14 | (o0VarE.r(lVar2) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.B(l14) ? 2048 : 1024);
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(l15) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(obj) ? 131072 : 65536;
        }
        int i16 = i15 | (o0VarE.B(l3Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(bcVar) ? 8388608 : 4194304) | (o0VarE.B(b3Var2) ? 67108864 : 33554432) | (o0VarE.r(locale2) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, (i16 & 306783379) != 306783378)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.m.a aVar = p3.m.f135153a;
            if (obj != null) {
                o0VarE.C(606579709);
                h4.r.a aVar2 = h4.r.S;
                boolean z17 = ((i16 & 234881024) == 67108864) | ((i16 & 458752) == 131072);
                Object objQ = o0VarE.q();
                if (z17) {
                    objQ = new hy.h(1, obj, b3Var2);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new hy.h(1, obj, b3Var2);
                        o0VarE.K(objQ);
                    }
                }
                rVarF = l4.k.f(aVar2, (e23.l) objQ);
                o0VarE.g0(false);
            } else {
                o0VarE.C(606771165);
                o0VarE.g0(false);
                rVarF = h4.r.S;
            }
            h4.r.a aVar3 = h4.r.S;
            float f14 = f90191a * 6;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarThen = c2.x2.k(aVar3, f14).then(rVarF);
            c2.j.f22691a.getClass();
            c2.j.h hVar = c2.j.f22697g;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(hVar, h4.d.a.f81536n, o0VarE, 6);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(-680088486);
            int i17 = 0;
            int i18 = 0;
            int i19 = 6;
            while (i18 < i19) {
                h4.r rVarF2 = c2.x2.f(h4.r.S, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.h hVar2 = c2.j.f22697g;
                h4.d.f81522a.getClass();
                c2.s2 s2VarA = c2.q2.a(hVar2, h4.d.a.f81534l, o0VarE, 54);
                p3.x1 x1Var2 = p3.n.f135158a;
                int iP2 = o0VarE.P();
                p3.i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarF2, o0VarE);
                h5.g.V.getClass();
                int i24 = i17;
                h5.e0.a aVar6 = h5.g.a.f81805b;
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                int i25 = i18;
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                p3.b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                p3.b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                    v.h.A(iP2, o0VarE, iP2, bVar2);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                c2.u2 u2Var = c2.u2.f22900a;
                o0VarE.C(1542622325);
                int i26 = i24;
                int i27 = 0;
                while (i27 < 7) {
                    int i28 = h0Var2.f109263d;
                    if (i26 < i28 || i26 >= i28 + h0Var2.f109262c) {
                        i26 = i26;
                        i27 = i27;
                        o0Var2 = o0VarE;
                        cVar = cVar2;
                        o0Var2.C(576825328);
                        h4.r.a aVar7 = h4.r.S;
                        n3.n.f123126a.getClass();
                        h4.r rVarT = c2.x2.t(aVar7, n3.n.f123133h, n3.n.f123131f, 0.0f, 12);
                        p3.y3 y3Var = p7.f89282d;
                        c2.l.f(c2.x2.r(rVarT, ((g6.f) o0Var2.A(y3Var)).f75997a, ((g6.f) o0Var2.A(y3Var)).f75997a), o0Var2);
                        o0Var2.g0(false);
                    } else {
                        o0VarE.C(577914947);
                        int i29 = i26 - h0Var2.f109263d;
                        long j14 = (((long) i29) * 86400000) + h0Var2.f109264e;
                        boolean z18 = j14 == j8;
                        boolean z19 = l14 != null && j14 == l14.longValue();
                        boolean z24 = l15 != null && j14 == l15.longValue();
                        if (obj != null) {
                            o0VarE.C(578361347);
                            boolean zL = ((i16 & 458752) == 131072) | o0VarE.l(j14);
                            Object objQ2 = o0VarE.q();
                            if (zL) {
                                if (l14 != null) {
                                    jLongValue = l14.longValue();
                                } else {
                                    jLongValue = Long.MAX_VALUE;
                                }
                                if (j14 < jLongValue) {
                                    z16 = false;
                                } else {
                                    if (l15 != null) {
                                        jLongValue2 = l15.longValue();
                                    } else {
                                        jLongValue2 = Long.MIN_VALUE;
                                    }
                                    if (j14 <= jLongValue2) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                }
                                objQ2 = hb.a.n(z16, o0VarE);
                            } else {
                                aVar.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    if (l14 != null) {
                                        jLongValue = l14.longValue();
                                    } else {
                                        jLongValue = Long.MAX_VALUE;
                                    }
                                    if (j14 < jLongValue) {
                                        z16 = false;
                                    } else {
                                        if (l15 != null) {
                                            jLongValue2 = l15.longValue();
                                        } else {
                                            jLongValue2 = Long.MIN_VALUE;
                                        }
                                        if (j14 <= jLongValue2) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                    }
                                    objQ2 = hb.a.n(z16, o0VarE);
                                }
                            }
                            boolean zBooleanValue = ((Boolean) ((p3.p1) objQ2).getF182175a()).booleanValue();
                            o0VarE.g0(false);
                            z14 = zBooleanValue;
                        } else {
                            o0VarE.C(578890300);
                            o0VarE.g0(false);
                            z14 = false;
                        }
                        boolean z25 = obj != null;
                        p3.x1 x1Var3 = p3.n.f135158a;
                        StringBuilder sb3 = new StringBuilder();
                        if (z25) {
                            o0VarE.C(974450583);
                            if (z19) {
                                o0VarE.C(1416909399);
                                int i30 = l3.n1.f109367b;
                                sb3.append(l3.k.h(o0VarE, R.string.m3c_date_range_picker_start_headline));
                                z15 = false;
                                o0VarE.g0(false);
                            } else {
                                z15 = false;
                                if (z24) {
                                    o0VarE.C(1416913397);
                                    int i34 = l3.n1.f109367b;
                                    sb3.append(l3.k.h(o0VarE, R.string.m3c_date_range_picker_end_headline));
                                    z15 = false;
                                    o0VarE.g0(false);
                                } else {
                                    if (z14) {
                                        o0VarE.C(1416917332);
                                        int i35 = l3.n1.f109367b;
                                        sb3.append(l3.k.h(o0VarE, R.string.m3c_date_range_picker_day_in_range));
                                        z15 = false;
                                        o0VarE.g0(false);
                                    } else {
                                        o0VarE.C(974832875);
                                        o0VarE.g0(false);
                                    }
                                    o0VarE.g0(z15);
                                }
                            }
                            o0VarE.g0(z15);
                        } else {
                            i27 = i27;
                            o0VarE.C(974838827);
                            o0VarE.g0(false);
                        }
                        if (z18) {
                            o0VarE.C(1416920485);
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            int i36 = l3.n1.f109367b;
                            sb3.append(l3.k.h(o0VarE, R.string.m3c_date_picker_today_description));
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(975029291);
                            o0VarE.g0(false);
                        }
                        String string = sb3.length() == 0 ? null : sb3.toString();
                        String strB = l3Var.b(Long.valueOf(j14), locale2, true);
                        if (strB == null) {
                            strB = "";
                        }
                        String strA = j1.a(i29 + 1, 7, locale2);
                        h4.r.a aVar8 = h4.r.S;
                        boolean z26 = z19 || z24;
                        boolean zL2 = ((i16 & 112) == 32) | o0VarE.l(j14);
                        Object objQ3 = o0VarE.q();
                        if (zL2) {
                            objQ3 = new p3(0, j14, lVar2);
                            o0VarE.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new p3(0, j14, lVar2);
                                o0VarE.K(objQ3);
                            }
                        }
                        e23.a aVar9 = (e23.a) objQ3;
                        boolean zL3 = o0VarE.l(j14) | ((i16 & 29360128) == 8388608);
                        Object objQ4 = o0VarE.q();
                        if (zL3) {
                            bcVar.getClass();
                            objQ4 = Boolean.valueOf(bcVar.a(j14));
                            o0VarE.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                bcVar.getClass();
                                objQ4 = Boolean.valueOf(bcVar.a(j14));
                                o0VarE.K(objQ4);
                            }
                        }
                        boolean zBooleanValue2 = ((Boolean) objQ4).booleanValue();
                        if (string != null) {
                            strB = e5.g(string, ", ", strB);
                        }
                        cVar = cVar2;
                        p3.o0 o0Var3 = o0VarE;
                        e(strA, aVar8, z26, aVar9, z19, zBooleanValue2, z18, z14, strB, b3Var2, o0Var3, ((i16 << 3) & 1879048192) | 48);
                        o0Var2 = o0Var3;
                        o0Var2.g0(false);
                    }
                    h0Var2 = h0Var;
                    lVar2 = lVar;
                    obj = ccVar;
                    cVar2 = cVar;
                    o0VarE = o0Var2;
                    i26++;
                    i27++;
                    b3Var2 = b3Var;
                    locale2 = locale;
                }
                p3.o0 o0Var4 = o0VarE;
                i19 = 6;
                o0Var4.g0(false);
                o0Var4.g0(true);
                h0Var2 = h0Var;
                lVar2 = lVar;
                obj = ccVar;
                i18 = i25 + 1;
                i17 = i26;
                b3Var2 = b3Var;
                locale2 = locale;
            }
            o0Var = o0VarE;
            o0Var.g0(false);
            o0Var.g0(true);
            p3.x1 x1Var4 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hw1.h(h0Var, lVar, j8, l14, l15, ccVar, l3Var, bcVar, b3Var, locale, i14);
        }
    }

    public static final void j(h4.r rVar, final boolean z14, final boolean z15, final boolean z16, final String str, final e23.a<Unit> aVar, final e23.a<Unit> aVar2, final e23.a<Unit> aVar3, final b3 b3Var, p3.m mVar, final int i14) {
        h4.r rVar2;
        c2.j.e eVar;
        p3.o0 o0VarE = mVar.E(-773929258);
        int i15 = i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.h(z16) ? 2048 : 1024) | (o0VarE.B(str) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar3) ? 8388608 : 4194304) | (o0VarE.B(b3Var) ? 67108864 : 33554432);
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            p3.x1 x1Var = p3.n.f135158a;
            rVar2 = rVar;
            h4.r rVarK = c2.x2.k(c2.x2.f(rVar2, 1.0f), f90192b);
            if (z16) {
                c2.j.f22691a.getClass();
                eVar = c2.j.f22692b;
            } else {
                c2.j.f22691a.getClass();
                eVar = c2.j.f22698h;
            }
            h4.d.f81522a.getClass();
            c2.s2 s2VarA = c2.q2.a(eVar, h4.d.a.f81534l, o0VarE, 48);
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarK, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            o(((i15 >> 21) & 14) | 3072 | ((i15 >> 6) & 112), aVar3, null, o0VarE, z3.f.c(619076006, new n(str, b3Var), o0VarE), z16);
            if (z16) {
                o0VarE.C(282432080);
                o0VarE.g0(false);
            } else {
                o0VarE.C(281624840);
                p3.v.a(s2.f89590a.c(o4.d0.a(b3Var.f87542f)), z3.f.c(-128317193, new o(aVar2, z15, aVar, z14), o0VarE), o0VarE, 56);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final h4.r rVar3 = rVar2;
            p2VarI0.f135219d = new e23.p(z14, z15, z16, str, aVar, aVar2, aVar3, b3Var, i14) { // from class: i3.o3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f89135b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f89136c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f89137d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f89138e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.a f89139f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.a f89140g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.a f89141h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ b3 f89142i;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(7);
                    x3.j(this.f89134a, this.f89135b, this.f89136c, this.f89137d, this.f89138e, this.f89139f, this.f89140g, this.f89141h, this.f89142i, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void k(Long l14, long j8, int i14, e23.l lVar, e23.l lVar2, l3.e0 e0Var, j23.l lVar3, l3 l3Var, bc bcVar, b3 b3Var, m4.b0 b0Var, p3.m mVar, int i15) {
        p3.o0 o0VarE = mVar.E(-2053685029);
        int i16 = i15 | (o0VarE.B(l14) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(e0Var) ? 131072 : 65536) | (o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(l3Var) ? 8388608 : 4194304) | (o0VarE.B(bcVar) ? 67108864 : 33554432) | (o0VarE.B(b3Var) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && ((o0VarE.B(b0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            int i17 = -((g6.c) o0VarE.A(kotlin.t1.f91490h)).f0(48);
            s1.f0 f0VarB = k9.b(n3.h0.DefaultEffects, o0VarE);
            s1.f0 f0VarB2 = k9.b(n3.h0.FastEffects, o0VarE);
            n3.h0 h0Var = n3.h0.DefaultSpatial;
            s1.f0 f0VarB3 = k9.b(h0Var, o0VarE);
            s1.f0 f0VarB4 = k9.b(h0Var, o0VarE);
            q5 q5VarA = q5.a(i14);
            h4.r.a aVar2 = h4.r.S;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new i11.f(9);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, aVar2, false);
            boolean zR = o0VarE.r(f0VarB3) | o0VarE.r(f0VarB) | o0VarE.r(f0VarB2) | o0VarE.k(i17) | o0VarE.r(f0VarB4);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new b81.b(f0VarB3, f0VarB, f0VarB2, i17, f0VarB4, 2);
                o0VarE.K(objQ2);
            }
            r1.b.a(q5VarA, rVarC, (e23.l) objQ2, null, "DatePickerDisplayModeAnimation", null, z3.f.c(1838500091, new f4(l14, j8, lVar, lVar2, e0Var, lVar3, l3Var, bcVar, b3Var, b0Var), o0VarE), o0VarE, ((i16 >> 6) & 14) | 1597440, 40);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hw1.h(l14, j8, i14, lVar, lVar2, e0Var, lVar3, l3Var, bcVar, b3Var, b0Var, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v11 */
    public static final void l(b3 b3Var, l3.e0 e0Var, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1849465391);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (i14 & 6) == 0 ? (o0VarE.B(b3Var) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(e0Var) ? 32 : 16;
        }
        boolean z14 = 0;
        boolean z15 = true;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            int f109232c = e0Var.getF109232c();
            ArrayList f109233d = e0Var.getF109233d();
            ArrayList arrayList = new ArrayList();
            int i16 = f109232c - 1;
            int size = f109233d.size();
            for (int i17 = i16; i17 < size; i17++) {
                arrayList.add(f109233d.get(i17));
            }
            for (int i18 = 0; i18 < i16; i18++) {
                arrayList.add(f109233d.get(i18));
            }
            n3.n.f123126a.getClass();
            s5.x0 x0VarA = sj.a(n3.n.C, o0VarE);
            float f14 = 0.0f;
            h4.r rVarF = c2.x2.f(c2.x2.b(h4.r.S, 0.0f, f90191a, 1), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.h hVar = c2.j.f22697g;
            h4.d.f81522a.getClass();
            c2.s2 s2VarA = c2.q2.a(hVar, h4.d.a.f81534l, o0VarE, 54);
            p3.x1 x1Var2 = p3.n.f135158a;
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u2 u2Var = c2.u2.f22900a;
            o0VarE.C(24563235);
            int size2 = arrayList.size();
            int i19 = 0;
            while (i19 < size2) {
                o13.p pVar = (o13.p) arrayList.get(i19);
                h4.r.a aVar2 = h4.r.S;
                boolean zB = o0VarE.B(pVar);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new n3(z14, pVar);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new n3(z14, pVar);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarB = p5.v.b(aVar2, (e23.l) objQ);
                n3.n.f123126a.getClass();
                h4.r rVarT = c2.x2.t(rVarB, n3.n.f123133h, n3.n.f123131f, f14, 12);
                p3.y3 y3Var = p7.f89282d;
                h4.r rVarR = c2.x2.r(rVarT, ((g6.f) o0VarE.A(y3Var)).f75997a, ((g6.f) o0VarE.A(y3Var)).f75997a);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, z14);
                p3.x1 x1Var3 = p3.n.f135158a;
                int iP2 = o0VarE.P();
                p3.i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarR, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                p3.b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                    v.h.A(iP2, o0VarE, iP2, bVar2);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                String str = (String) pVar.f128595b;
                h4.r rVarY = c2.x2.y(aVar2, null, 3);
                int i24 = i19;
                long j8 = b3Var.f87540d;
                d6.h.f57752b.getClass();
                p3.o0 o0Var2 = o0VarE;
                mh.c(str, rVarY, j8, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, o0Var2, 48, 0, 130040);
                o0Var2.g0(true);
                i19 = i24 + 1;
                size2 = size2;
                z15 = true;
                o0VarE = o0Var2;
                f14 = 0.0f;
                arrayList = arrayList;
                cVar = cVar;
                z14 = 0;
            }
            p3.o0 o0Var3 = o0VarE;
            o0Var3.g0(z14);
            o0Var3.g0(z15);
            p3.x1 x1Var4 = p3.n.f135158a;
            o0Var = o0Var3;
        } else {
            p3.o0 o0Var4 = o0VarE;
            o0Var4.e();
            o0Var = o0Var4;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f2.o(b3Var, e0Var, i14, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    public static final void m(String str, h4.r rVar, boolean z14, boolean z15, e23.a<Unit> aVar, boolean z16, String str2, b3 b3Var, p3.m mVar, int i14) {
        u1.u uVarA;
        long j8;
        p3.o0 o0VarE = mVar.E(-1153850597);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.h(z16) ? 131072 : 65536) | (o0VarE.B(str2) ? 1048576 : 524288) | (o0VarE.B(b3Var) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean z17 = ((i15 & 7168) == 2048) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z17) {
                if (z15) {
                    uVarA = null;
                } else {
                    uVarA = null;
                }
                objQ = uVarA;
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    if (z15 || z14) {
                        uVarA = null;
                    } else {
                        n3.n.f123126a.getClass();
                        uVarA = u1.n.a(n3.n.f123139n, b3Var.f87557u);
                    }
                    objQ = uVarA;
                    o0VarE.K(objQ);
                }
            }
            u1.u uVar = (u1.u) objQ;
            boolean z18 = (3670016 & i15) == 1048576;
            Object objQ2 = o0VarE.q();
            if (z18) {
                objQ2 = new i11.g(str2, 4);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new i11.g(str2, 4);
                    o0VarE.K(objQ2);
                }
            }
            h4.r rVarC = p5.v.c((e23.l) objQ2, rVar, true);
            n3.n.f123126a.getClass();
            o4.r1 r1VarC = fc.c(n3.n.I, o0VarE);
            int i16 = i15 >> 6;
            int i17 = i16 & 14;
            b3Var.getClass();
            if (z14) {
                j8 = z16 ? b3Var.f87548l : b3Var.f87549m;
            } else {
                o4.d0.f128823b.getClass();
                j8 = o4.d0.f128831j;
            }
            ve.b(z14, aVar, rVarC, z16, r1VarC, ((o4.d0) r1.f2.a(j8, k9.b(n3.h0.DefaultEffects, o0VarE), o0VarE).getF182175a()).f128833a, 0L, 0.0f, uVar, null, z3.f.c(-564400443, new p(str, b3Var, z15, z14, z16), o0VarE), o0VarE, i17 | ((i15 >> 9) & 112) | (i16 & 7168), 1472);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r3(str, rVar, z14, z15, aVar, z16, str2, b3Var, i14);
        }
    }

    public static final void n(h4.r rVar, long j8, e23.l<? super Integer, Unit> lVar, bc bcVar, l3.e0 e0Var, j23.l lVar2, b3 b3Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1286899812);
        int i15 = i14 | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.B(bcVar) ? 2048 : 1024) | (o0VarE.r(e0Var) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.B(b3Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            n3.n.f123126a.getClass();
            mh.a(sj.a(n3.n.F, o0VarE), z3.f.c(1301915789, new q(e0Var, j8, lVar2, rVar, b3Var, lVar, bcVar), o0VarE), o0VarE, 48);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new es.a(rVar, j8, lVar, bcVar, e0Var, lVar2, b3Var, i14);
        }
    }

    public static final void o(int i14, e23.a aVar, h4.r rVar, p3.m mVar, z3.e eVar, boolean z14) {
        int i15;
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(-709923073);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i16 = i15 | 384;
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            rVar2 = h4.r.S;
            p3.x1 x1Var = p3.n.f135158a;
            k2.h hVar = k2.i.f102406a;
            c1 c1Var = c1.f87691a;
            long j8 = ((o4.d0) o0VarE.A(s2.f89590a)).f128833a;
            c1Var.getClass();
            h1.c(aVar, rVar2, false, hVar, c1.c(0L, j8, 0L, o0VarE, 13), null, null, null, z3.f.c(1899489890, new i4(eVar, z14), o0VarE), o0VarE, (i16 & 14) | 807075840 | ((i16 >> 3) & 112), 388);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(aVar, z14, rVar2, eVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    public static final m4 p(Long l14, j23.l lVar, bc bcVar, p3.m mVar, int i14, int i15) {
        if ((i15 & 4) != 0) {
            d3.f87817a.getClass();
            lVar = d3.f87818b;
        }
        Object obj = lVar;
        q5.f89410b.getClass();
        if ((i15 & 16) != 0) {
            d3.f87817a.getClass();
            bcVar = d3.f87820d;
        }
        bc bcVar2 = bcVar;
        p3.x1 x1Var = p3.n.f135158a;
        Locale localeA = i1.a(mVar);
        Object[] objArr = new Object[0];
        m4.f88948h.getClass();
        d4.l lVarB = d4.a.b(new ho2.o(12), new l4(bcVar2, localeA, 0));
        boolean z14 = true;
        boolean zR = ((((i14 & 14) ^ 6) > 4 && mVar.B(l14)) || (i14 & 6) == 4) | ((((i14 & 112) ^ 48) > 32 && mVar.B(l14)) || (i14 & 48) == 32) | mVar.r(obj) | ((((i14 & 7168) ^ 3072) > 2048 && mVar.k(0)) || (i14 & 3072) == 2048);
        if ((((57344 & i14) ^ 24576) <= 16384 || !mVar.B(bcVar2)) && (i14 & 24576) != 16384) {
            z14 = false;
        }
        boolean zR2 = zR | z14 | mVar.r(localeA);
        Object objQ = mVar.q();
        if (zR2) {
            objQ = new b21.v4(l14, l14, obj, bcVar2, localeA, 10);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new b21.v4(l14, l14, obj, bcVar2, localeA, 10);
                mVar.K(objQ);
            }
        }
        m4 m4Var = (m4) d4.a.c(objArr, lVarB, (e23.a) objQ, mVar, 0);
        m4Var.f87407d.setValue(bcVar2);
        return m4Var;
    }
}
