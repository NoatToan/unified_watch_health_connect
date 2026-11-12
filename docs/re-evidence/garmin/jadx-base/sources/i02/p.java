package i02;

import ch.qos.logback.core.joran.action.Action;
import hq.f0;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.q0;
import p3.c2;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0013Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Li02/p;", "T", "", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "", "maxScrollPerFrame", "Lkotlin/Function2;", "Li02/f;", "", "onMove", "", "canDragOver", "", "onDragEnd", "Li02/b;", "dragCancelledAnimation", "<init>", "(Lo53/b0;FLe23/p;Le23/p;Le23/p;Li02/b;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class p<T> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f86882o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f0 f86883p = new f0(27);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f0 f86884q = new f0(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f86885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f86886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.p<f, f, Integer> f86887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.p<f, f, Boolean> f86888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.p<Integer, Integer, Unit> f86889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i02.b f86890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f86891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q53.b f86892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q53.b f86893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c2 f86894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c2 f86895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o53.c2 f86896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f86897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f86898n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.ReorderableState$autoscroll$1", f = "ReorderableState.kt", l = {216}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o0 f86899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public q0 f86900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f86901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f86902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p<T> f86903e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f14, p<T> pVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f86902d = f14;
            this.f86903e = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f86902d, this.f86903e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0034  */
        /* JADX WARN: Code duplicated, block: B:18:0x0051 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0034
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r7.f86901c
                i02.p<T> r2 = r7.f86903e
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 != r3) goto L13
                kotlin.jvm.internal.q0 r1 = r7.f86900b
                kotlin.jvm.internal.o0 r4 = r7.f86899a
                o13.r.b(r8)
                goto L52
            L13:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r8)
                r8 = 0
                return r8
            L1a:
                o13.r.b(r8)
                kotlin.jvm.internal.o0 r8 = new kotlin.jvm.internal.o0
                r8.<init>()
                float r1 = r7.f86902d
                r8.f105806a = r1
                kotlin.jvm.internal.q0 r1 = new kotlin.jvm.internal.q0
                r1.<init>()
                r4 = r8
            L2c:
                float r8 = r4.f105806a
                r5 = 0
                int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r8 != 0) goto L34
                goto L5f
            L34:
                o53.c2 r8 = r2.f86896l
                if (r8 == 0) goto L5f
                boolean r8 = r8.isActive()
                if (r8 != r3) goto L5f
                gw1.d r8 = new gw1.d
                r5 = 11
                r8.<init>(r1, r5, r4, r2)
                r7.f86899a = r4
                r7.f86900b = r1
                r7.f86901c = r3
                java.lang.Object r8 = p3.g1.b(r8, r7)
                if (r8 != r0) goto L52
                return r0
            L52:
                q53.b r8 = r2.f86893i
                float r5 = r4.f105806a
                java.lang.Float r6 = new java.lang.Float
                r6.<init>(r5)
                r8.i(r6)
                goto L2c
            L5f:
                kotlin.Unit r8 = p005kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: i02.p.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.ReorderableState$onDragCanceled$1", f = "ReorderableState.kt", l = {104}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<T> f86905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f86906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f86907d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p<T> pVar, f fVar, long j8, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f86905b = pVar;
            this.f86906c = fVar;
            this.f86907d = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f86905b, this.f86906c, this.f86907d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f86904a;
            if (i14 == 0) {
                o13.r.b(obj);
                i02.b bVar = this.f86905b.f86890f;
                this.f86904a = 1;
                if (bVar.a(this.f86906c, this.f86907d, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.ReorderableState$onDragUsingFingerPoint$1$1", f = "ReorderableState.kt", l = {185}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<T> f86909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f86910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ T f86911d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p<T> pVar, T t7, T t14, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f86909b = pVar;
            this.f86910c = t7;
            this.f86911d = t14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f86909b, this.f86910c, this.f86911d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f86908a;
            if (i14 == 0) {
                o13.r.b(obj);
                p<T> pVar = this.f86909b;
                e23.p<f, f, Integer> pVar2 = pVar.f86887c;
                T t7 = this.f86910c;
                f fVar = new f(pVar.l(t7), pVar.m(t7));
                T t14 = this.f86911d;
                Integer num = new Integer(pVar2.invoke(fVar, new f(pVar.l(t14), pVar.m(t14))).intValue());
                if (num.intValue() == -1) {
                    num = null;
                }
                if (num == null) {
                    num = new Integer(pVar.l(t14));
                }
                pVar.f86891g.setValue(num);
                int i15 = pVar.i();
                int iJ = pVar.j();
                this.f86908a = 1;
                if (pVar.x(i15, iJ, this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public p(b0 b0Var, float f14, e23.p<? super f, ? super f, Integer> pVar, e23.p<? super f, ? super f, Boolean> pVar2, e23.p<? super Integer, ? super Integer, Unit> pVar3, i02.b bVar) {
        b0Var.getClass();
        pVar.getClass();
        bVar.getClass();
        this.f86885a = b0Var;
        this.f86886b = f14;
        this.f86887c = pVar;
        this.f86888d = pVar2;
        this.f86889e = pVar3;
        this.f86890f = bVar;
        this.f86891g = p0.n(null);
        this.f86892h = q53.l.a(0, 7, null);
        this.f86893i = q53.l.a(0, 7, null);
        n4.c.f123541b.getClass();
        this.f86894j = p0.n(n4.c.a(0L));
        this.f86895k = p0.n(null);
        this.f86897m = new ArrayList();
        this.f86898n = new ArrayList();
    }

    public final void a(float f14) {
        o53.c2 c2Var = this.f86896l;
        if (f14 == 0.0f) {
            if (c2Var != null) {
                c2Var.c(null);
            }
            this.f86896l = null;
        } else if (c2Var == null || !c2Var.isActive()) {
            this.f86896l = ge1.b.T(this.f86885a, null, null, new b(f14, this, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    public final float b(float f14, long j8) {
        float f15;
        float fT;
        float fIntBitsToFloat;
        float fR;
        T tH = h();
        if (tH != null) {
            if (u()) {
                f15 = g() + p(tH);
                fT = k(tH) + f15;
                fIntBitsToFloat = Float.intBitsToFloat((int) (d() & 4294967295L));
            } else {
                f15 = f() + n(tH);
                fT = t(tH) + f15;
                fIntBitsToFloat = Float.intBitsToFloat((int) (d() >> 32));
            }
            if (fIntBitsToFloat > 0.0f) {
                fR = fT - q();
                if (fR < 0.0f) {
                    fR = 0.0f;
                }
            } else if (fIntBitsToFloat < 0.0f) {
                fR = f15 - r();
                if (fR > 0.0f) {
                    fR = 0.0f;
                }
            } else {
                fR = 0.0f;
            }
            int i14 = (int) (fT - f15);
            f86882o.getClass();
            if (fR != 0.0f) {
                float fFloatValue = ((Number) f86884q.invoke(Float.valueOf(j8 > 1500 ? 1.0f : j8 / 1500))).floatValue() * ((Number) f86883p.invoke(Float.valueOf(Math.min(1.0f, (Math.abs(fR) * 1.0f) / i14)))).floatValue() * Math.signum(fR) * f14;
                if (fFloatValue == 0.0f) {
                    return fR > 0.0f ? 1.0f : -1.0f;
                }
                return fFloatValue;
            }
        }
        return 0.0f;
    }

    public abstract int c(T t7);

    public final long d() {
        return ((n4.c) this.f86894j.getF182175a()).f123544a;
    }

    public final Integer e() {
        return (Integer) this.f86891g.getF182175a();
    }

    public final float f() {
        T tH = h();
        if (tH == null) {
            return 0.0f;
        }
        T f182175a = this.f86895k.getF182175a();
        return (Float.intBitsToFloat((int) (d() >> 32)) + (f182175a != null ? n(f182175a) : 0)) - n(tH);
    }

    public final float g() {
        T tH = h();
        if (tH == null) {
            return 0.0f;
        }
        T f182175a = this.f86895k.getF182175a();
        return (Float.intBitsToFloat((int) (d() & 4294967295L)) + (f182175a != null ? p(f182175a) : 0)) - p(tH);
    }

    public final T h() {
        for (T t7 : s()) {
            int iL = l(t7);
            Integer numE = e();
            if (numE != null && iL == numE.intValue()) {
                return t7;
            }
        }
        return null;
    }

    public abstract int i();

    public abstract int j();

    public abstract int k(T t7);

    public abstract int l(T t7);

    public abstract Object m(T t7);

    public abstract int n(T t7);

    public abstract int o(T t7);

    public abstract int p(T t7);

    public abstract int q();

    public abstract int r();

    public abstract List<T> s();

    public abstract int t(T t7);

    public abstract boolean u();

    public final void v() {
        p pVar;
        Integer numE = e();
        c2 c2Var = this.f86895k;
        if (numE != null) {
            int iIntValue = numE.intValue();
            T f182175a = c2Var.getF182175a();
            f fVar = new f(iIntValue, f182175a != null ? m(f182175a) : null);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f())) << 32) | (((long) Float.floatToRawIntBits(g())) & 4294967295L);
            n4.c.a aVar = n4.c.f123541b;
            p pVar2 = this;
            ge1.b.T(pVar2.f86885a, null, null, new c(pVar2, fVar, jFloatToRawIntBits, null), 3);
            pVar = pVar2;
        } else {
            pVar = this;
        }
        T f182175a2 = c2Var.getF182175a();
        Integer numValueOf = f182175a2 != null ? Integer.valueOf(l(f182175a2)) : null;
        Integer numE2 = e();
        c2Var.setValue(null);
        n4.c.f123541b.getClass();
        pVar.f86894j.setValue(n4.c.a(0L));
        pVar.f86891g.setValue(null);
        o53.c2 c2Var2 = pVar.f86896l;
        if (c2Var2 != null) {
            c2Var2.c(null);
        }
        pVar.f86896l = null;
        e23.p<Integer, Integer, Unit> pVar3 = pVar.f86889e;
        if (pVar3 == null || numValueOf == null || numE2 == null) {
            return;
        }
        pVar3.invoke(numValueOf, numE2);
    }

    public final void w(int i14, int i15, int i16, int i17) {
        e23.p<f, f, Boolean> pVar;
        this.f86894j.setValue(n4.c.a((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (d() & 4294967295L)) + i17)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (d() >> 32)) + i16)) << 32)));
        T tH = h();
        if (tH == null) {
            return;
        }
        for (T t7 : s()) {
            int iL = l(t7);
            Integer numE = e();
            if (numE == null || iL != numE.intValue()) {
                if (!p005kotlin.jvm.internal.s.g(m(t7), m(tH))) {
                    int iP = p(t7);
                    if (i15 <= c(t7) && iP <= i15) {
                        int iN = n(t7);
                        if (i14 <= o(t7) && iN <= i14 && ((pVar = this.f86888d) == null || pVar.invoke(new f(l(t7), m(t7)), new f(l(tH), m(tH))).booleanValue())) {
                            if (l(t7) == i() || l(tH) == i()) {
                                ge1.b.T(this.f86885a, null, null, new d(this, tH, t7, null), 3);
                            } else {
                                int iIntValue = this.f86887c.invoke(new f(l(tH), m(tH)), new f(l(t7), m(t7))).intValue();
                                Integer numValueOf = iIntValue != -1 ? Integer.valueOf(iIntValue) : null;
                                if (numValueOf == null) {
                                    numValueOf = Integer.valueOf(l(t7));
                                }
                                this.f86891g.setValue(numValueOf);
                            }
                        }
                    }
                }
            }
        }
        float fB = b(this.f86886b, 0L);
        if (fB == 0.0f) {
            return;
        }
        a(fB);
    }

    public abstract Object x(int i14, int i15, v13.i iVar);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Li02/p$a;", "", "<init>", "()V", "", "ACCELERATION_LIMIT_TIME_MS", "J", "Lkotlin/Function1;", "", "EaseOutQuadInterpolator", "Le23/l;", "EaseInQuintInterpolator", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
