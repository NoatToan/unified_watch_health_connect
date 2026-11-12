package p008y1;

import a2.j;
import b5.a0;
import b5.m0;
import b5.q;
import b5.s0;
import b5.u0;
import b5.v0;
import b5.z;
import c5.f;
import e23.l;
import e23.p;
import f5.d0;
import g6.s;
import h5.h;
import h5.k;
import h5.m;
import h5.u1;
import java.util.List;
import kotlin.a4;
import kotlin.t1;
import n4.c;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import t13.d;
import u1.g0;
import v13.i;
import y4.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B7\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ly1/p0;", "Lh5/m;", "Lh5/u1;", "Ly4/e;", "Lh5/h;", "Lkotlin/Function1;", "Lb5/m0;", "", "canDrag", "enabled", "La2/j;", "interactionSource", "Ly1/b2;", "orientationLock", "<init>", "(Le23/l;ZLa2/j;Ly1/b2;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class p0 extends m implements u1, e, h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b2 f193516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l<? super m0, Boolean> f193517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f193518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f193519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q53.b f193520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a2.a.b f193521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f193522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f193523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d0.a f193524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d0.d f193525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d0.c f193526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d0.b f193527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d0 f193528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c5.e f193529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f193530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v3 f193531r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i1 f193532t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f193533v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u0 f193534w;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f193535a;

        static {
            int[] iArr = new int[d0.a.EnumC3607a.values().length];
            try {
                iArr[d0.a.EnumC3607a.NotInitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f193535a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {499, 501, 503, 510, 512, 515}, m = "invokeSuspend", v = 1)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r0 f193536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r0 f193537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f193538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f193539d;

        /* JADX INFO: renamed from: y1.p0$b$a, reason: from Kotlin metadata */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Ly1/e0$b;", "", "processDelta", "<anonymous>", "(Le23/l;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {506}, m = "invokeSuspend", v = 1)
        public static final class Function1 extends i implements p<l<? super e0.b, ? extends Unit>, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public r0 f193541a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f193542b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f193543c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r0<e0> f193544d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ p0 f193545e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Function1(r0<e0> r0Var, p0 p0Var, d<? super Function1> dVar) {
                super(2, dVar);
                this.f193544d = r0Var;
                this.f193545e = p0Var;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                Function1 function1 = new Function1(this.f193544d, this.f193545e, dVar);
                function1.f193543c = obj;
                return function1;
            }

            @Override // e23.p
            public final Object invoke(l<? super e0.b, ? extends Unit> lVar, d<? super Unit> dVar) {
                return ((Function1) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002a  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0040 -> B:25:0x0052). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004c -> B:24:0x004f). Please report as a decompilation issue!!! */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                l lVar;
                r0<e0> r0Var;
                e0 e0Var;
                T t7;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193542b;
                if (i14 == 0) {
                    r.b(obj);
                    lVar = (l) this.f193543c;
                    r0Var = this.f193544d;
                    e0Var = r0Var.f105810a;
                    if (!(e0Var instanceof e0.d) || (e0Var instanceof e0.a)) {
                        return Unit.INSTANCE;
                    }
                    t7 = 0;
                    e0.b bVar = e0Var instanceof e0.b ? (e0.b) e0Var : null;
                    if (bVar != null) {
                        lVar.invoke(bVar);
                    }
                    q53.b bVar2 = this.f193545e.f193520g;
                    if (bVar2 != null) {
                        this.f193543c = lVar;
                        this.f193541a = r0Var;
                        this.f193542b = 1;
                        obj = bVar2.g(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    r0Var.f105810a = t7;
                    r0Var = this.f193544d;
                    e0Var = r0Var.f105810a;
                    if (e0Var instanceof e0.d) {
                    }
                    return Unit.INSTANCE;
                }
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0Var = this.f193541a;
                lVar = (l) this.f193543c;
                r.b(obj);
                t7 = (e0) obj;
                r0Var.f105810a = t7;
                r0Var = this.f193544d;
                e0Var = r0Var.f105810a;
                if (e0Var instanceof e0.d) {
                }
                return Unit.INSTANCE;
            }
        }

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            b bVar = p0.this.new b(dVar);
            bVar.f193539d = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0031 A[PHI: r1 r4
          0x0031: PHI (r1v11 kotlin.jvm.internal.r0) = (r1v3 kotlin.jvm.internal.r0), (r1v15 kotlin.jvm.internal.r0) binds: [B:13:0x002e, B:36:0x00a7] A[DONT_GENERATE, DONT_INLINE]
          0x0031: PHI (r4v6 o53.b0) = (r4v4 o53.b0), (r4v7 o53.b0) binds: [B:13:0x002e, B:36:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:19:0x0055 A[PHI: r5
          0x0055: PHI (r5v7 o53.b0) = (r5v0 o53.b0), (r5v3 o53.b0), (r5v3 o53.b0), (r5v3 o53.b0), (r5v5 o53.b0), (r5v8 o53.b0) binds: [B:18:0x004d, B:45:0x00c4, B:47:0x00d1, B:41:0x00bd, B:30:0x0081, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x005b  */
        /* JADX WARN: Code duplicated, block: B:23:0x0064  */
        /* JADX WARN: Code duplicated, block: B:26:0x0075  */
        /* JADX WARN: Code duplicated, block: B:31:0x0083  */
        /* JADX WARN: Code duplicated, block: B:34:0x0095  */
        /* JADX WARN: Code duplicated, block: B:44:0x00c2 A[Catch: CancellationException -> 0x00c0, TryCatch #0 {CancellationException -> 0x00c0, blocks: (B:38:0x00aa, B:40:0x00b0, B:44:0x00c2, B:46:0x00c6), top: B:55:0x00aa }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00c6 A[Catch: CancellationException -> 0x00c0, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00c0, blocks: (B:38:0x00aa, B:40:0x00b0, B:44:0x00c2, B:46:0x00c6), top: B:55:0x00aa }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0081 -> B:19:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bd -> B:19:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c4 -> B:19:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d1 -> B:19:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00df -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: y1.p0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public p0(l<? super m0, Boolean> lVar, boolean z14, j jVar, b2 b2Var) {
        this.f193516c = b2Var;
        this.f193517d = lVar;
        this.f193518e = z14;
        this.f193519f = jVar;
        c.a aVar = c.f123541b;
        aVar.getClass();
        this.f193530q = c.f123543d;
        aVar.getClass();
        this.f193533v = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object X1(p0 p0Var, v13.c cVar) {
        s0 s0Var;
        p0Var.getClass();
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i14 = s0Var.f193628c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f193628c = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(p0Var, cVar);
            }
        } else {
            s0Var = new s0(p0Var, cVar);
        }
        Object obj = s0Var.f193626a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var.f193628c;
        if (i15 == 0) {
            r.b(obj);
            a2.a.b bVar = p0Var.f193521h;
            if (bVar != null) {
                j jVar = p0Var.f193519f;
                if (jVar != null) {
                    a2.a.C0002a c0002a = new a2.a.C0002a(bVar);
                    s0Var.f193628c = 1;
                    if (jVar.b(c0002a, s0Var) == aVar) {
                        return aVar;
                    }
                }
            }
            s.f76026b.getClass();
            p0Var.h2(new e0.d(0L, false, null));
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        p0Var.f193521h = null;
        s.f76026b.getClass();
        p0Var.h2(new e0.d(0L, false, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object Y1(p0 p0Var, e0.c cVar, v13.c cVar2) {
        t0 t0Var;
        j jVar;
        a2.a.b bVar;
        e0.c cVar3;
        a2.a.b bVar2;
        p0Var.getClass();
        if (cVar2 instanceof t0) {
            t0Var = (t0) cVar2;
            int i14 = t0Var.f193650e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t0Var.f193650e = i14 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(p0Var, cVar2);
            }
        } else {
            t0Var = new t0(p0Var, cVar2);
        }
        Object obj = t0Var.f193648c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = t0Var.f193650e;
        if (i15 == 0) {
            r.b(obj);
            a2.a.b bVar3 = p0Var.f193521h;
            if (bVar3 != null && (jVar = p0Var.f193519f) != null) {
                a2.a.C0002a c0002a = new a2.a.C0002a(bVar3);
                t0Var.f193646a = cVar;
                t0Var.f193650e = 1;
                if (jVar.b(c0002a, t0Var) != aVar) {
                }
                return aVar;
            }
            p0Var.f193521h = bVar;
            p0Var.g2(cVar.f193176a);
            return Unit.INSTANCE;
        }
        if (i15 == 1) {
            cVar = t0Var.f193646a;
            r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar2 = t0Var.f193647b;
            cVar3 = t0Var.f193646a;
            r.b(obj);
        }
        bVar = bVar2;
        cVar = cVar3;
        p0Var.f193521h = bVar;
        p0Var.g2(cVar.f193176a);
        return Unit.INSTANCE;
        bVar = new a2.a.b();
        j jVar2 = p0Var.f193519f;
        if (jVar2 != null) {
            t0Var.f193646a = cVar;
            t0Var.f193647b = bVar;
            t0Var.f193650e = 2;
            if (jVar2.b(bVar, t0Var) != aVar) {
                cVar3 = cVar;
                bVar2 = bVar;
                bVar = bVar2;
                cVar = cVar3;
            }
            return aVar;
        }
        p0Var.f193521h = bVar;
        p0Var.g2(cVar.f193176a);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object Z1(p0 p0Var, e0.d dVar, v13.c cVar) {
        u0 u0Var;
        p0Var.getClass();
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i14 = u0Var.f193669d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u0Var.f193669d = i14 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(p0Var, cVar);
            }
        } else {
            u0Var = new u0(p0Var, cVar);
        }
        Object obj = u0Var.f193667b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u0Var.f193669d;
        if (i15 == 0) {
            r.b(obj);
            a2.a.b bVar = p0Var.f193521h;
            if (bVar != null) {
                j jVar = p0Var.f193519f;
                if (jVar != null) {
                    a2.a.c cVar2 = new a2.a.c(bVar);
                    u0Var.f193666a = dVar;
                    u0Var.f193669d = 1;
                    if (jVar.b(cVar2, u0Var) == aVar) {
                        return aVar;
                    }
                }
            }
            p0Var.h2(dVar);
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dVar = u0Var.f193666a;
        r.b(obj);
        p0Var.f193521h = null;
        p0Var.h2(dVar);
        return Unit.INSTANCE;
    }

    public static void e2(p0 p0Var, a0 a0Var, long j8, long j14, int i14) {
        if ((i14 & 4) != 0) {
            c.f123541b.getClass();
            j14 = 0;
        }
        d0.c cVar = p0Var.f193526m;
        if (cVar == null) {
            d0.c cVar2 = new d0.c(null, 0L, false, 7, null);
            p0Var.f193526m = cVar2;
            cVar = cVar2;
        }
        cVar.f193160a = a0Var;
        cVar.f193161b = j8;
        v3 v3Var = p0Var.f193531r;
        b2 b2Var = p0Var.f193516c;
        if (v3Var == null) {
            p0Var.f193531r = new v3(b2Var, 0L, 2, null);
        } else {
            v3Var.f193688a = b2Var;
            v3Var.f193689b = j14;
        }
        cVar.f193162c = false;
        p0Var.f193528o = cVar;
    }

    @Override // h5.u1
    public final void a1() {
        u0 u0Var = this.f193534w;
        if (u0Var != null) {
            u0Var.a1();
        }
        if (g0.f167501h && this.f193523j) {
            c2();
            if (this.f193522i) {
                i2().i(e0.a.f193173a);
            }
            this.f193529p = null;
        }
        this.f193523j = false;
    }

    public final void a2() {
        a2.a.b bVar = this.f193521h;
        if (bVar != null) {
            j jVar = this.f193519f;
            if (jVar != null) {
                jVar.a(new a2.a.C0002a(bVar));
            }
            this.f193521h = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y4.e
    public final void b0(y4.a aVar, b5.s sVar) {
        y4.d dVar;
        long j8;
        y4.d dVar2;
        y4.d dVar3;
        i1.a.c cVar;
        y4.d dVar4;
        y4.d dVar5;
        int i14 = aVar.f194371b;
        List<y4.d> list = aVar.f194370a;
        if (this.f193518e) {
            if (this.f193532t == null) {
                this.f193532t = new i1(this);
            }
            i1 i1Var = this.f193532t;
            if (i1Var != null) {
                p0 p0Var = i1Var.f193277a;
                Object[] objArr = 0;
                i1.a.C3608a.EnumC3609a enumC3609a = null;
                Object[] objArr2 = 0;
                if (i1Var.f193282f == null) {
                    i1.a.C3608a c3608a = i1Var.f193278b;
                    if (c3608a == null) {
                        c3608a = new i1.a.C3608a(enumC3609a, objArr == true ? 1 : 0, 3, objArr2 == true ? 1 : 0);
                        i1Var.f193278b = c3608a;
                    }
                    i1Var.f193282f = c3608a;
                }
                i1.a aVar2 = i1Var.f193282f;
                if (aVar2 == null) {
                    vb.h.s("currentDragState should not be null");
                    return;
                }
                boolean z14 = true;
                if (aVar2 instanceof i1.a.C3608a) {
                    i1.a.C3608a c3608a2 = (i1.a.C3608a) aVar2;
                    if (list.isEmpty()) {
                        return;
                    }
                    int size = list.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        y4.d dVar6 = list.get(i15);
                        if (dVar6.f194389h || !dVar6.f194385d) {
                            return;
                        }
                    }
                    y4.d dVar7 = (y4.d) h0.b0(list);
                    i1.a.C3608a.EnumC3609a enumC3609a2 = i1.b.f193301a[c3608a2.f193289a.ordinal()] == 1 ? !p0Var.m2() ? i1.a.C3608a.EnumC3609a.Yes : i1.a.C3608a.EnumC3609a.No : c3608a2.f193289a;
                    c3608a2.f193289a = enumC3609a2;
                    if (sVar == b5.s.Initial && enumC3609a2 == i1.a.C3608a.EnumC3609a.No) {
                        dVar7.f194390i = true;
                        c3608a2.f193290b = true;
                    }
                    if (sVar == b5.s.Main) {
                        if (enumC3609a2 == i1.a.C3608a.EnumC3609a.Yes) {
                            i1.c(i1Var, dVar7, dVar7.f194382a, 0L, 12);
                            return;
                        }
                        if (c3608a2.f193290b) {
                            y4.b bVarA = y4.b.a(i14);
                            c.f123541b.getClass();
                            i1Var.f(dVar7, dVar7, bVarA, 0L);
                            i1Var.e(dVar7, y4.b.a(i14), 0L);
                            long j14 = dVar7.f194382a;
                            i1.a.d dVar8 = i1Var.f193279c;
                            if (dVar8 == null) {
                                dVar8 = new i1.a.d(0L, 1, null);
                                i1Var.f193279c = dVar8;
                            }
                            dVar8.f193300a = j14;
                            i1Var.f193282f = dVar8;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (aVar2 instanceof i1.a.c) {
                    i1.a.c cVar2 = (i1.a.c) aVar2;
                    if (sVar == b5.s.Initial) {
                        return;
                    }
                    int size2 = list.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size2) {
                            dVar3 = null;
                            break;
                        }
                        dVar3 = list.get(i16);
                        if (z.b(dVar3.f194382a, cVar2.f193298b)) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                    y4.d dVar9 = dVar3;
                    if (dVar9 == null) {
                        int size3 = list.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size3) {
                                dVar5 = null;
                                break;
                            }
                            dVar5 = list.get(i17);
                            if (dVar5.f194385d) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                        dVar9 = dVar5;
                        if (dVar9 == null) {
                            i1Var.a();
                            return;
                        }
                        cVar2.f193298b = dVar9.f194382a;
                    }
                    y4.d dVar10 = dVar9;
                    if (sVar != b5.s.Main) {
                        cVar = cVar2;
                    } else if (dVar10.f194390i) {
                        cVar = cVar2;
                        y4.d dVar11 = cVar.f193297a;
                        if (dVar11 == null) {
                            vb.h.s("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j15 = cVar.f193298b;
                        v3 v3Var = i1Var.f193285i;
                        if (v3Var == null) {
                            vb.h.s("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        i1Var.b(dVar11, j15, v3Var);
                    } else if (j1.b(dVar10)) {
                        int size4 = list.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size4) {
                                dVar4 = null;
                                break;
                            }
                            y4.d dVar12 = list.get(i18);
                            if (dVar12.f194385d) {
                                dVar4 = dVar12;
                                break;
                            }
                            i18++;
                        }
                        y4.d dVar13 = dVar4;
                        if (dVar13 == null) {
                            i1Var.a();
                        } else {
                            cVar2.f193298b = dVar13.f194382a;
                        }
                        cVar = cVar2;
                    } else {
                        a4 a4Var = (a4) h5.i.a(p0Var, t1.f91502t);
                        m0.f15849b.getClass();
                        float fL = m0.l(a4Var, m0.f15850c);
                        v3 v3Var2 = i1Var.f193285i;
                        if (v3Var2 == null) {
                            vb.h.s("Touch slop detector not initialized.");
                            return;
                        }
                        long jA = v3Var2.a(j1.c(dVar10, p0Var.f193516c, y4.b.a(i14)), j1.d(dVar10, p0Var.f193516c, y4.b.a(i14)), fL);
                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                            dVar10.f194390i = true;
                            cVar = cVar2;
                            y4.d dVar14 = cVar.f193297a;
                            dVar14.getClass();
                            i1Var.f(dVar14, dVar10, y4.b.a(i14), jA);
                            i1Var.e(dVar10, y4.b.a(i14), jA);
                            long j16 = dVar10.f194382a;
                            i1.a.d dVar15 = i1Var.f193279c;
                            if (dVar15 == null) {
                                dVar15 = new i1.a.d(0L, 1, null);
                                i1Var.f193279c = dVar15;
                            }
                            dVar15.f193300a = j16;
                            i1Var.f193282f = dVar15;
                        } else {
                            cVar = cVar2;
                            cVar.f193299c = true;
                        }
                    }
                    if (sVar == b5.s.Final && cVar.f193299c) {
                        if (!dVar10.f194390i) {
                            cVar.f193299c = false;
                            return;
                        }
                        y4.d dVar16 = cVar.f193297a;
                        if (dVar16 == null) {
                            vb.h.s("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j17 = cVar.f193298b;
                        v3 v3Var3 = i1Var.f193285i;
                        if (v3Var3 != null) {
                            i1Var.b(dVar16, j17, v3Var3);
                            return;
                        } else {
                            vb.h.s("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    return;
                }
                if (aVar2 instanceof i1.a.b) {
                    i1.a.b bVar = (i1.a.b) aVar2;
                    if (sVar != b5.s.Final) {
                        return;
                    }
                    int size5 = list.size();
                    for (int i19 = 0; i19 < size5; i19++) {
                        if (list.get(i19).f194390i) {
                            z14 = false;
                            break;
                        }
                    }
                    int size6 = list.size();
                    for (int i24 = 0; i24 < size6; i24++) {
                        if (list.get(i24).f194385d) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (z14) {
                                long jC = j1.c((y4.d) h0.b0(list), p0Var.f193516c, y4.b.a(i14));
                                y4.d dVar17 = bVar.f193295a;
                                dVar17.getClass();
                                long jI = c.i(jC, j1.c(dVar17, p0Var.f193516c, y4.b.a(i14)));
                                y4.d dVar18 = bVar.f193295a;
                                if (dVar18 != null) {
                                    i1.c(i1Var, dVar18, bVar.f193296b, jI, 8);
                                    return;
                                } else {
                                    vb.h.s("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    i1Var.a();
                    return;
                }
                if (!(aVar2 instanceof i1.a.d)) {
                    lc.u0.r();
                    return;
                }
                i1.a.d dVar19 = (i1.a.d) aVar2;
                if (sVar != b5.s.Main) {
                    return;
                }
                long j18 = dVar19.f193300a;
                int size7 = list.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size7) {
                        dVar = null;
                        break;
                    }
                    dVar = list.get(i25);
                    if (z.b(dVar.f194382a, j18)) {
                        break;
                    } else {
                        i25++;
                    }
                }
                y4.d dVar20 = dVar;
                if (dVar20 == null) {
                    return;
                }
                if (!j1.b(dVar20)) {
                    if (dVar20.f194390i) {
                        p0Var.f2(e0.a.f193173a);
                        return;
                    }
                    b2 b2Var = p0Var.f193516c;
                    y4.b bVarA2 = y4.b.a(i14);
                    if (c.e(c.i(j1.c(dVar20, b2Var, bVarA2), j1.d(dVar20, b2Var, bVarA2))) == 0.0f) {
                        return;
                    }
                    b2 b2Var2 = p0Var.f193516c;
                    y4.b bVarA3 = y4.b.a(i14);
                    long jI2 = c.i(j1.c(dVar20, b2Var2, bVarA3), j1.d(dVar20, b2Var2, bVarA3));
                    if (dVar20.f194390i) {
                        c.f123541b.getClass();
                        j8 = 0;
                    } else {
                        j8 = jI2;
                    }
                    i1Var.e(dVar20, y4.b.a(i14), j8);
                    dVar20.f194390i = true;
                    return;
                }
                int size8 = list.size();
                int i26 = 0;
                while (true) {
                    if (i26 >= size8) {
                        dVar2 = null;
                        break;
                    }
                    dVar2 = list.get(i26);
                    if (dVar2.f194385d) {
                        break;
                    } else {
                        i26++;
                    }
                }
                y4.d dVar21 = dVar2;
                if (dVar21 != null) {
                    dVar19.f193300a = dVar21.f194382a;
                    return;
                }
                if (dVar20.f194390i || !j1.b(dVar20)) {
                    p0Var.f2(e0.a.f193173a);
                } else {
                    j1.a(i1Var.d(), dVar20, p0Var.f193516c, y4.b.a(i14), i1Var.f193286j, i1Var.f193288l);
                    float fH = ((a4) h5.i.a(p0Var, t1.f91502t)).h();
                    long jA2 = i1Var.d().a(xy2.b.h(fH, fH));
                    c5.b bVar2 = i1Var.d().f24464a;
                    c5.d dVar22 = bVar2.f24447a;
                    c5.a[] aVarArr = dVar22.f24455d;
                    p13.s.m(0, aVarArr.length, null, aVarArr);
                    dVar22.f24456e = 0;
                    c5.d dVar23 = bVar2.f24448b;
                    c5.a[] aVarArr2 = dVar23.f24455d;
                    p13.s.m(0, aVarArr2.length, null, aVarArr2);
                    dVar23.f24456e = 0;
                    bVar2.f24449c = 0L;
                    p0Var.f2(new e0.d(a1.b(jA2), true, null));
                }
                i1Var.a();
            }
        }
    }

    public abstract Object b2(b.Function1 function1, b bVar);

    public final void c2() {
        d0.a aVar = this.f193524k;
        if (aVar == null) {
            aVar = new d0.a(null, false, 3, null);
            this.f193524k = aVar;
        }
        aVar.f193152a = d0.a.EnumC3607a.NotInitialized;
        aVar.f193153b = false;
        this.f193528o = aVar;
    }

    public final void d2(a0 a0Var, long j8, v3 v3Var) {
        d0.b bVar = this.f193527n;
        if (bVar == null) {
            d0.b bVar2 = new d0.b(null, 0L, null, 7, null);
            this.f193527n = bVar2;
            bVar = bVar2;
        }
        bVar.f193158a = a0Var;
        bVar.f193159b = j8;
        v3.c(v3Var);
        this.f193528o = bVar;
    }

    public final void f2(e0 e0Var) {
        if ((e0Var instanceof e0.c) && !this.f193522i) {
            this.f193522i = true;
            n2();
        }
        i2().i(e0Var);
    }

    public abstract void g2(long j8);

    public abstract void h2(e0.d dVar);

    public final q53.i<e0> i2() {
        q53.b bVar = this.f193520g;
        if (bVar != null) {
            return bVar;
        }
        vb.h.s("Events channel not initialized.");
        return null;
    }

    public final c5.e j2() {
        c5.e eVar = this.f193529p;
        if (eVar != null) {
            return eVar;
        }
        vb.h.s("Velocity Tracker not initialized.");
        return null;
    }

    public final void k2(a0 a0Var, long j8) {
        long jF = d0.f(k.f(getNode()));
        long j14 = this.f193530q;
        c.f123541b.getClass();
        if (!c.d(j14, c.f123543d) && !c.d(jF, this.f193530q)) {
            this.f193533v = c.j(this.f193533v, c.i(jF, this.f193530q));
        }
        this.f193530q = jF;
        f.a(j2(), a0Var, this.f193533v);
        i2().i(new e0.b(j8, false, null));
    }

    public final void l2(a0 a0Var, a0 a0Var2, long j8) {
        if (this.f193529p == null) {
            this.f193529p = new c5.e();
        }
        c5.e eVarJ2 = j2();
        c.a aVar = c.f123541b;
        aVar.getClass();
        f.a(eVarJ2, a0Var, 0L);
        long jI = c.i(a0Var2.f15750c, j8);
        aVar.getClass();
        this.f193533v = 0L;
        if (this.f193517d.invoke(m0.a(a0Var.f15756i)).booleanValue()) {
            if (!this.f193522i) {
                if (this.f193520g == null) {
                    this.f193520g = q53.l.a(Integer.MAX_VALUE, 6, null);
                }
                n2();
            }
            this.f193530q = d0.f(k.f(this));
            i2().i(new e0.c(jI, null));
        }
    }

    public abstract boolean m2();

    public final void n2() {
        this.f193522i = true;
        if (this.f193520g == null) {
            this.f193520g = q53.l.a(Integer.MAX_VALUE, 6, null);
        }
        ge1.b.T(getCoroutineScope(), null, null, new b(null), 3);
    }

    public final void o2(l<? super m0, Boolean> lVar, boolean z14, j jVar, b2 b2Var, boolean z15) {
        this.f193517d = lVar;
        boolean z16 = true;
        if (this.f193518e != z14) {
            this.f193518e = z14;
            if (!z14) {
                a2();
                u0 u0Var = this.f193534w;
                if (u0Var != null) {
                    V1(u0Var);
                }
                this.f193534w = null;
                this.f193532t = null;
            }
            z15 = true;
        }
        if (!p005kotlin.jvm.internal.s.g(this.f193519f, jVar)) {
            a2();
            this.f193519f = jVar;
        }
        if (this.f193516c != b2Var) {
            this.f193516c = b2Var;
        } else {
            z16 = z15;
        }
        if (z16) {
            if (g0.f167501h && this.f193523j) {
                c2();
                if (this.f193522i) {
                    i2().i(e0.a.f193173a);
                }
                this.f193529p = null;
            }
            i1 i1Var = this.f193532t;
            if (i1Var != null) {
                i1Var.a();
                p0 p0Var = i1Var.f193277a;
                if (p0Var.f193522i) {
                    p0Var.f2(e0.a.f193173a);
                }
                i1Var.f193283g = null;
                z1 z1Var = i1Var.f193287k;
                z1Var.f193766a = 0;
                z1Var.f193767b.clear();
            }
            u0 u0Var2 = this.f193534w;
            if (u0Var2 != null) {
                u0Var2.i0();
            }
        }
    }

    @Override // h4.r.c
    public final void onDetach() {
        this.f193522i = false;
        a2();
        c.f123541b.getClass();
        this.f193533v = 0L;
    }

    @Override // y4.e
    public final void u0() {
        i1 i1Var = this.f193532t;
        if (i1Var != null) {
            i1Var.a();
            p0 p0Var = i1Var.f193277a;
            if (p0Var.f193522i) {
                p0Var.f2(e0.a.f193173a);
            }
            i1Var.f193283g = null;
            z1 z1Var = i1Var.f193287k;
            z1Var.f193766a = 0;
            z1Var.f193767b.clear();
        }
    }

    public void u1(q qVar, b5.s sVar, long j8) {
        a0 a0Var;
        a0 a0Var2;
        a0 a0Var3;
        a0 a0Var4;
        boolean z14 = true;
        this.f193523j = true;
        boolean z15 = g0.f167501h;
        boolean z16 = this.f193518e;
        if (!z15) {
            if (z16 && this.f193534w == null) {
                v0 v0VarA = s0.a(new r0(this));
                U1(v0VarA);
                this.f193534w = v0VarA;
            }
            u0 u0Var = this.f193534w;
            if (u0Var != null) {
                u0Var.u1(qVar, sVar, j8);
                return;
            }
            return;
        }
        if (z16) {
            a0 a0Var5 = null;
            if (this.f193528o == null) {
                d0.a aVar = this.f193524k;
                if (aVar == null) {
                    aVar = new d0.a(null, false, 3, null);
                    this.f193524k = aVar;
                }
                this.f193528o = aVar;
            }
            d0 d0Var = this.f193528o;
            if (d0Var == null) {
                vb.h.s("currentDragState should not be null");
                return;
            }
            if (d0Var instanceof d0.a) {
                d0.a aVar2 = (d0.a) d0Var;
                if (!qVar.f15870a.isEmpty() && k3.g(qVar, false, false)) {
                    a0 a0Var6 = (a0) h0.b0(qVar.f15870a);
                    d0.a.EnumC3607a enumC3607a = a.f193535a[aVar2.f193152a.ordinal()] == 1 ? !m2() ? d0.a.EnumC3607a.Yes : d0.a.EnumC3607a.No : aVar2.f193152a;
                    aVar2.f193152a = enumC3607a;
                    if (sVar == b5.s.Initial && enumC3607a == d0.a.EnumC3607a.No) {
                        a0Var6.a();
                        aVar2.f193153b = true;
                    }
                    if (sVar == b5.s.Main) {
                        if (enumC3607a == d0.a.EnumC3607a.Yes) {
                            e2(this, a0Var6, a0Var6.f15748a, 0L, 12);
                            return;
                        }
                        if (aVar2.f193153b) {
                            c.f123541b.getClass();
                            l2(a0Var6, a0Var6, 0L);
                            k2(a0Var6, 0L);
                            long j14 = a0Var6.f15748a;
                            d0.d dVar = this.f193525l;
                            if (dVar == null) {
                                dVar = new d0.d(0L, 1, null);
                                this.f193525l = dVar;
                            }
                            dVar.f193163a = j14;
                            this.f193528o = dVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (d0Var instanceof d0.c) {
                d0.c cVar = (d0.c) d0Var;
                if (sVar == b5.s.Initial) {
                    return;
                }
                List<a0> list = qVar.f15870a;
                int size = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        a0Var3 = null;
                        break;
                    }
                    a0Var3 = list.get(i14);
                    if (z.b(a0Var3.f15748a, cVar.f193161b)) {
                        break;
                    } else {
                        i14++;
                    }
                }
                a0 a0Var7 = a0Var3;
                if (a0Var7 == null) {
                    int size2 = list.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size2) {
                            a0Var4 = null;
                            break;
                        }
                        a0Var4 = list.get(i15);
                        if (a0Var4.f15751d) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    a0Var7 = a0Var4;
                    if (a0Var7 == null) {
                        c2();
                        return;
                    }
                    cVar.f193161b = a0Var7.f15748a;
                }
                if (sVar == b5.s.Main) {
                    if (a0Var7.b()) {
                        a0 a0Var8 = cVar.f193160a;
                        if (a0Var8 == null) {
                            vb.h.s("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j15 = cVar.f193161b;
                        v3 v3Var = this.f193531r;
                        if (v3Var == null) {
                            vb.h.s("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        d2(a0Var8, j15, v3Var);
                    } else if (b5.r.d(a0Var7)) {
                        int size3 = list.size();
                        for (int i16 = 0; i16 < size3; i16++) {
                            a0 a0Var9 = list.get(i16);
                            if (a0Var9.f15751d) {
                                a0Var5 = a0Var9;
                                break;
                            }
                        }
                        a0 a0Var10 = a0Var5;
                        if (a0Var10 == null) {
                            c2();
                        } else {
                            cVar.f193161b = a0Var10.f15748a;
                        }
                    } else {
                        float fL = m0.l((a4) h5.i.a(this, t1.f91502t), a0Var7.f15756i);
                        v3 v3Var2 = this.f193531r;
                        if (v3Var2 == null) {
                            vb.h.s("Touch slop detector not initialized.");
                            return;
                        }
                        long jA = v3Var2.a(a0Var7.f15750c, a0Var7.f15754g, fL);
                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                            a0Var7.a();
                            a0 a0Var11 = cVar.f193160a;
                            a0Var11.getClass();
                            l2(a0Var11, a0Var7, jA);
                            k2(a0Var7, jA);
                            long j16 = a0Var7.f15748a;
                            d0.d dVar2 = this.f193525l;
                            if (dVar2 == null) {
                                dVar2 = new d0.d(0L, 1, null);
                                this.f193525l = dVar2;
                            }
                            dVar2.f193163a = j16;
                            this.f193528o = dVar2;
                        } else {
                            cVar.f193162c = true;
                        }
                    }
                }
                if (sVar == b5.s.Final && cVar.f193162c) {
                    if (!a0Var7.b()) {
                        cVar.f193162c = false;
                        return;
                    }
                    a0 a0Var12 = cVar.f193160a;
                    if (a0Var12 == null) {
                        vb.h.s("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j17 = cVar.f193161b;
                    v3 v3Var3 = this.f193531r;
                    if (v3Var3 != null) {
                        d2(a0Var12, j17, v3Var3);
                        return;
                    } else {
                        vb.h.s("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                }
                return;
            }
            if (d0Var instanceof d0.b) {
                d0.b bVar = (d0.b) d0Var;
                if (sVar != b5.s.Final) {
                    return;
                }
                List<a0> list2 = qVar.f15870a;
                int size4 = list2.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    if (list2.get(i17).b()) {
                        z14 = false;
                        break;
                    }
                }
                int size5 = list2.size();
                for (int i18 = 0; i18 < size5; i18++) {
                    if (list2.get(i18).f15751d) {
                        if (list2.isEmpty()) {
                            break;
                        }
                        if (z14) {
                            long j18 = ((a0) h0.b0(list2)).f15750c;
                            a0 a0Var13 = bVar.f193158a;
                            a0Var13.getClass();
                            long jI = c.i(j18, a0Var13.f15750c);
                            a0 a0Var14 = bVar.f193158a;
                            if (a0Var14 != null) {
                                e2(this, a0Var14, bVar.f193159b, jI, 8);
                                return;
                            } else {
                                vb.h.s("AwaitGesturePickup.initialDown was not initialized.");
                                return;
                            }
                        }
                        return;
                    }
                }
                c2();
                return;
            }
            if (!(d0Var instanceof d0.d)) {
                lc.u0.r();
                return;
            }
            d0.d dVar3 = (d0.d) d0Var;
            if (sVar != b5.s.Main) {
                return;
            }
            long j19 = dVar3.f193163a;
            List<a0> list3 = qVar.f15870a;
            int size6 = list3.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size6) {
                    a0Var = null;
                    break;
                }
                a0 a0Var15 = list3.get(i19);
                if (z.b(a0Var15.f15748a, j19)) {
                    a0Var = a0Var15;
                    break;
                }
                i19++;
            }
            a0 a0Var16 = a0Var;
            if (a0Var16 == null) {
                return;
            }
            if (!b5.r.d(a0Var16)) {
                if (a0Var16.b()) {
                    i2().i(e0.a.f193173a);
                    return;
                } else {
                    if (c.e(b5.r.f(a0Var16, true)) == 0.0f) {
                        return;
                    }
                    k2(a0Var16, b5.r.f(a0Var16, false));
                    a0Var16.a();
                    return;
                }
            }
            List<a0> list4 = qVar.f15870a;
            int size7 = list4.size();
            int i24 = 0;
            while (true) {
                if (i24 >= size7) {
                    a0Var2 = null;
                    break;
                }
                a0Var2 = list4.get(i24);
                if (a0Var2.f15751d) {
                    break;
                } else {
                    i24++;
                }
            }
            a0 a0Var17 = a0Var2;
            if (a0Var17 != null) {
                dVar3.f193163a = a0Var17.f15748a;
                return;
            }
            if (a0Var16.b() || !b5.r.d(a0Var16)) {
                i2().i(e0.a.f193173a);
            } else {
                c5.e eVarJ2 = j2();
                c.f123541b.getClass();
                f.a(eVarJ2, a0Var16, 0L);
                float fH = ((a4) h5.i.a(this, t1.f91502t)).h();
                long jA2 = j2().a(xy2.b.h(fH, fH));
                c5.b bVar2 = j2().f24464a;
                c5.d dVar4 = bVar2.f24447a;
                c5.a[] aVarArr = dVar4.f24455d;
                p13.s.m(0, aVarArr.length, null, aVarArr);
                dVar4.f24456e = 0;
                c5.d dVar5 = bVar2.f24448b;
                c5.a[] aVarArr2 = dVar5.f24455d;
                p13.s.m(0, aVarArr2.length, null, aVarArr2);
                dVar5.f24456e = 0;
                bVar2.f24449c = 0L;
                i2().i(new e0.d(a1.b(jA2), false, null));
                this.f193523j = false;
            }
            c2();
        }
    }
}
