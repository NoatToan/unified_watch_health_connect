package p008y1;

import a5.j;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import b5.a0;
import b5.m0;
import b5.q;
import b5.t;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.p;
import g6.s;
import h5.k;
import h5.y1;
import java.util.List;
import k23.l;
import m4.h0;
import m4.i0;
import m4.j0;
import m4.n0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p5.k0;
import r1.m2;
import s1.z;
import t13.d;
import u1.g0;
import u1.k1;
import u1.p0;
import u1.r1;
import v13.i;
import vb.h;
import vy0.e;
import z4.c;
import z4.f;
import z4.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ly1/a3;", "Ly1/p0;", "Lz4/g;", "Lh5/y1;", "Ly1/a2;", "Ly1/e3;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lu1/r1;", "overscrollEffect", "Ly1/e1;", "flingBehavior", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "", "enabled", "reverseDirection", "La2/j;", "interactionSource", "Ly1/x;", "bringIntoViewSpec", "<init>", "(Ly1/e3;Lu1/r1;Ly1/e1;Ly1/b2;ZZLa2/j;Ly1/x;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a3 extends p0 implements g, y1, a2 {
    public final p2 A;
    public final b0 B;
    public final h3 C;
    public final w2 D;
    public final i0 E;
    public final z F;
    public e I;
    public d3 P;
    public n1 T;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r1 f193078x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e1 f193079y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a5.b f193080z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {395}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0.d f193082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a3 f193083c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0.d dVar, a3 a3Var, d<? super a> dVar2) {
            super(2, dVar2);
            this.f193082b = dVar;
            this.f193083c = a3Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f193082b, this.f193083c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193081a;
            if (i14 == 0) {
                r.b(obj);
                e0.d dVar = this.f193082b;
                float f14 = dVar.f193178b ? -1.0f : 1.0f;
                h3 h3Var = this.f193083c.C;
                long jG = s.g(f14, dVar.f193177a);
                this.f193081a = 1;
                if (h3Var.d(jG, false, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {532}, m = "invokeSuspend", v = 1)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193084a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f193086c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/y1;", "", "<anonymous>", "(Ly1/y1;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends i implements p<y1, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f193087a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f193088b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j8, d<? super a> dVar) {
                super(2, dVar);
                this.f193088b = j8;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                a aVar = new a(this.f193088b, dVar);
                aVar.f193087a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(y1 y1Var, d<? super Unit> dVar) {
                return ((a) create(y1Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                y1 y1Var = (y1) this.f193087a;
                j.f1233b.getClass();
                y1Var.b(j.f1234c, this.f193088b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, d<? super b> dVar) {
            super(2, dVar);
            this.f193086c = j8;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a3.this.new b(this.f193086c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193084a;
            if (i14 == 0) {
                r.b(obj);
                h3 h3Var = a3.this.C;
                k1 k1Var = k1.UserInput;
                a aVar2 = new a(this.f193086c, null);
                this.f193084a = 1;
                if (h3Var.h(k1Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public a3(e3 e3Var, r1 r1Var, e1 e1Var, b2 b2Var, boolean z14, boolean z15, a2.j jVar, x xVar) {
        super(t2.f193654a, z14, jVar, b2Var);
        this.f193078x = r1Var;
        this.f193079y = e1Var;
        a5.b bVar = new a5.b();
        this.f193080z = bVar;
        p2 p2Var = new p2(z14);
        U1(p2Var);
        this.A = p2Var;
        b0 b0Var = new b0(new z(new m2(t2.f193657d)), null, 2, null);
        this.B = b0Var;
        r1 r1Var2 = this.f193078x;
        e1 e1Var2 = this.f193079y;
        e1 e1Var3 = e1Var2 == null ? b0Var : e1Var2;
        final int i14 = 0;
        h3 h3Var = new h3(e3Var, r1Var2, e1Var3, b2Var, z15, bVar, this, new e23.a(this) { // from class: y1.x2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a3 f193709b;

            {
                this.f193709b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return Boolean.valueOf(this.f193709b.getIsAttached());
                    default:
                        i0 i0Var = this.f193709b.E;
                        if (!i0Var.getNode().getIsAttached()) {
                            return null;
                        }
                        h0 h0Var = (h0) i0Var.a0();
                        if (!h0Var.b()) {
                            return null;
                        }
                        if (h0Var.a()) {
                            return ((j0) i0Var).X1(null);
                        }
                        j0 j0VarF = k.h(i0Var).getFocusOwner().f();
                        if (j0VarF != null) {
                            return j0VarF.X1(k.f(i0Var));
                        }
                        return null;
                }
            }
        });
        this.C = h3Var;
        w2 w2Var = new w2(h3Var, z14);
        this.D = w2Var;
        n0.f116502b.getClass();
        j0 j0Var = new j0(n0.f116504d, false, null, null, 10, null);
        U1(j0Var);
        this.E = j0Var;
        final int i15 = 1;
        z zVar = new z(b2Var, h3Var, z15, xVar, new e23.a(this) { // from class: y1.x2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a3 f193709b;

            {
                this.f193709b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return Boolean.valueOf(this.f193709b.getIsAttached());
                    default:
                        i0 i0Var = this.f193709b.E;
                        if (!i0Var.getNode().getIsAttached()) {
                            return null;
                        }
                        h0 h0Var = (h0) i0Var.a0();
                        if (!h0Var.b()) {
                            return null;
                        }
                        if (h0Var.a()) {
                            return ((j0) i0Var).X1(null);
                        }
                        j0 j0VarF = k.h(i0Var).getFocusOwner().f();
                        if (j0VarF != null) {
                            return j0VarF.X1(k.f(i0Var));
                        }
                        return null;
                }
            }
        });
        U1(zVar);
        this.F = zVar;
        U1(new a5.g(w2Var, bVar));
        U1(new i2.h(zVar));
        if (g0.f167500g) {
            return;
        }
        U1(new p0(new xa2.g(this, 17)));
    }

    @Override // h5.y1
    public final void D1(k0 k0Var) {
        if (this.f193518e && (this.I == null || this.P == null)) {
            this.I = new e(this, 25);
            this.P = new d3(this, null);
        }
        e eVar = this.I;
        if (eVar != null) {
            l<Object>[] lVarArr = p5.h0.f136016a;
            p5.p.f136057a.getClass();
            k0Var.a(p5.p.f136061e, new p5.a(null, eVar));
        }
        d3 d3Var = this.P;
        if (d3Var != null) {
            l<Object>[] lVarArr2 = p5.h0.f136016a;
            p5.p.f136057a.getClass();
            k0Var.a(p5.p.f136062f, d3Var);
        }
    }

    @Override // z4.g
    public final boolean J(KeyEvent keyEvent) {
        return false;
    }

    @Override // z4.g
    public final boolean M1(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (this.f193518e) {
            long jA = z4.d.a(keyEvent);
            z4.a.f202280b.getClass();
            if (z4.a.a(jA, z4.a.F) || z4.a.a(f.a(keyEvent.getKeyCode()), z4.a.E)) {
                int iB = z4.d.b(keyEvent);
                c.f202307b.getClass();
                if (iB == c.f202309d && !keyEvent.isCtrlPressed()) {
                    boolean z14 = this.C.f193257d == b2.Vertical;
                    z zVar = this.F;
                    if (z14) {
                        int i14 = (int) (zVar.f193739j & 4294967295L);
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(z4.a.a(f.a(keyEvent.getKeyCode()), z4.a.E) ? i14 : -i14)));
                        n4.c.a aVar = n4.c.f123541b;
                    } else {
                        int i15 = (int) (zVar.f193739j >> 32);
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(z4.a.a(f.a(keyEvent.getKeyCode()), z4.a.E) ? i15 : -i15)) << 32);
                        n4.c.a aVar2 = n4.c.f123541b;
                    }
                    ge1.b.T(getCoroutineScope(), null, null, new b(jFloatToRawIntBits, null), 3);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p008y1.a2
    public final void O0(long j8) {
        if (getIsAttached()) {
            k.h(this).y();
        }
    }

    @Override // p008y1.p0
    public final Object b2(p0.b.Function1 function1, p0.b bVar) {
        k1 k1Var = k1.UserInput;
        h3 h3Var = this.C;
        Object objH = h3Var.h(k1Var, new y2(function1, h3Var, null), bVar);
        return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
    }

    @Override // p008y1.p0
    public final void g2(long j8) {
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // p008y1.p0
    public final void h2(e0.d dVar) {
        ge1.b.T(this.f193080z.d(), null, null, new a(dVar, this, null), 3);
    }

    @Override // p008y1.p0
    /* JADX INFO: renamed from: m2 */
    public final boolean getF193136z() {
        h3 h3Var = this.C;
        if (h3Var.f193254a.a()) {
            return true;
        }
        r1 r1Var = h3Var.f193255b;
        return r1Var != null ? r1Var.a() : false;
    }

    @Override // h4.r.c
    public final void onAttach() {
        if (getIsAttached()) {
            g6.c cVar = k.g(this).A;
            b0 b0Var = this.B;
            b0Var.getClass();
            b0Var.f193093a = new z(new m2(cVar));
        }
        n1 n1Var = this.T;
        if (n1Var != null) {
            n1Var.f193440d = k.g(this).A;
        }
    }

    @Override // h5.j, h5.u1
    public final void onDensityChange() {
        a1();
        if (getIsAttached()) {
            g6.c cVar = k.g(this).A;
            b0 b0Var = this.B;
            b0Var.getClass();
            b0Var.f193093a = new z(new m2(cVar));
        }
        n1 n1Var = this.T;
        if (n1Var != null) {
            n1Var.f193440d = k.g(this).A;
        }
    }

    public final void p2(e3 e3Var, b2 b2Var, r1 r1Var, boolean z14, boolean z15, e1 e1Var, a2.j jVar, x xVar) {
        boolean z16;
        boolean z17 = true;
        boolean z18 = false;
        if (this.f193518e != z14) {
            this.D.f193695b = z14;
            this.A.f193554b = z14;
            z16 = true;
        } else {
            z16 = false;
        }
        e1 e1Var2 = e1Var == null ? this.B : e1Var;
        h3 h3Var = this.C;
        if (!p005kotlin.jvm.internal.s.g(h3Var.f193254a, e3Var)) {
            h3Var.f193254a = e3Var;
            z18 = true;
        }
        h3Var.f193255b = r1Var;
        if (h3Var.f193257d != b2Var) {
            h3Var.f193257d = b2Var;
            z18 = true;
        }
        if (h3Var.f193258e != z15) {
            h3Var.f193258e = z15;
        } else {
            z17 = z18;
        }
        h3Var.f193256c = e1Var2;
        h3Var.f193259f = this.f193080z;
        z zVar = this.F;
        zVar.f193730a = b2Var;
        zVar.f193732c = z15;
        zVar.f193733d = xVar;
        this.f193078x = r1Var;
        this.f193079y = e1Var;
        y0 y0Var = t2.f193654a;
        b2 b2Var2 = h3Var.f193257d;
        b2 b2Var3 = b2.Vertical;
        if (b2Var2 != b2Var3) {
            b2Var3 = b2.Horizontal;
        }
        o2(y0Var, z14, jVar, b2Var3, z17);
        if (z16) {
            this.I = null;
            this.P = null;
            k.g(this).U();
        }
    }

    @Override // p008y1.p0, h5.u1
    public final void u1(q qVar, b5.s sVar, long j8) {
        List<a0> list = qVar.f15870a;
        int size = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            if (this.f193517d.invoke(m0.a(list.get(i15).f15756i)).booleanValue()) {
                super.u1(qVar, sVar, j8);
                break;
            }
        }
        if (this.f193518e) {
            if (sVar == b5.s.Initial) {
                int i16 = qVar.f15875f;
                t.f15887b.getClass();
                if (i16 == t.f15893h) {
                    if (this.T == null) {
                        this.T = new n1(this.C, new v(ViewConfiguration.get(h5.l.a(this).getContext())), new z2(this), k.g(this).A);
                    }
                    n1 n1Var = this.T;
                    if (n1Var != null) {
                        b0 coroutineScope = getCoroutineScope();
                        if (n1Var.f193443g == null) {
                            n1Var.f193443g = ge1.b.T(coroutineScope, null, null, new t1(n1Var, null), 3);
                        }
                    }
                }
            }
            n1 n1Var2 = this.T;
            if (n1Var2 != null) {
                if (!g0.f167502i) {
                    if (sVar == b5.s.Main) {
                        int i17 = qVar.f15875f;
                        t.f15887b.getClass();
                        if (i17 == t.f15893h) {
                            int size2 = list.size();
                            while (i14 < size2) {
                                if (list.get(i14).b()) {
                                    return;
                                } else {
                                    i14++;
                                }
                            }
                            if (n1Var2.e(qVar, j8)) {
                                n1.c(qVar);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                int i18 = qVar.f15875f;
                t.f15887b.getClass();
                if (i18 == t.f15893h) {
                    int size3 = list.size();
                    while (i14 < size3) {
                        if (list.get(i14).b()) {
                            return;
                        } else {
                            i14++;
                        }
                    }
                    if (sVar == b5.s.Initial && n1Var2.f193442f) {
                        n1Var2.e(qVar, j8);
                        n1.c(qVar);
                    }
                    if (sVar == b5.s.Main && !n1Var2.f193442f && n1Var2.e(qVar, j8)) {
                        n1.c(qVar);
                    }
                }
            }
        }
    }
}
