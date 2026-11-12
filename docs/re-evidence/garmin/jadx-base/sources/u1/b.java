package u1;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.List;
import kotlin.a4;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.p2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0002\u0019\u001aBM\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lu1/b;", "Lh5/m;", "Lh5/u1;", "Lz4/g;", "Lh5/y1;", "Lh5/e2;", "Lh5/h;", "Lh5/i1;", "Ly4/e;", "La2/j;", "interactionSource", "Lu1/f1;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Lp5/l;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(La2/j;Lu1/f1;ZZLjava/lang/String;Lp5/l;Le23/a;Lkotlin/jvm/internal/j;)V", "a", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b extends h5.m implements h5.u1, z4.g, h5.y1, h5.e2, h5.h, h5.i1, y4.e {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C3147b f167347z = new C3147b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a2.j f167348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f1 f167349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f167350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f167351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p5.l f167352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f167353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e23.a<Unit> f167354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n0 f167355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f1 f167356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b5.u0 f167357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h5.j f167358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a2.l.b f167359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a2.e f167360o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p1.m0<a2.l.b> f167361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f167362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2.l.b f167363r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2.j f167364t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f167365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f167366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o53.c2 f167367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C3147b f167368y;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu1/b$a;", "", "Lu1/b;", "node", "<init>", "(Lu1/b;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f167369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public y4.d f167370b;

        public a(b bVar) {
            this.f167369a = bVar;
        }

        public final void a() {
            if (this.f167370b != null) {
                this.f167370b = null;
                this.f167369a.b2(true);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<Boolean, Unit> {
        public c(Object obj) {
            super(1, obj, b.class, "onFocusChange", "onFocusChange(Z)V", 0);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x006e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0070 A[LOOP:0: B:10:0x0027->B:22:0x0070, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:30:0x0073 A[EDGE_INSN: B:30:0x0073->B:23:0x0073 BREAK  A[LOOP:0: B:10:0x0027->B:22:0x0070], SYNTHETIC] */
        @Override // e23.l
        public final Unit invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            b bVar = (b) this.receiver;
            p1.m0<a2.l.b> m0Var = bVar.f167361p;
            if (zBooleanValue) {
                bVar.e2();
            } else {
                if (bVar.f167348c != null) {
                    Object[] objArr = m0Var.f134842c;
                    long[] jArr = m0Var.f134840a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j8 = jArr[i14];
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i14 != length) {
                                    break;
                                    break;
                                }
                                i14++;
                            } else {
                                int i15 = 8;
                                int i16 = 8 - ((~(i14 - length)) >>> 31);
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((255 & j8) < 128) {
                                        ge1.b.T(bVar.getCoroutineScope(), null, null, new u1.f(bVar, (a2.l.b) objArr[(i14 << 3) + i17], null), 3);
                                    }
                                    j8 >>= i15;
                                    i17++;
                                    i15 = i15;
                                }
                                if (i16 != i15) {
                                    break;
                                }
                                if (i14 != length) {
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                    a2.l.b bVar2 = bVar.f167363r;
                    if (bVar2 != null) {
                        ge1.b.T(bVar.getCoroutineScope(), null, null, new u1.g(bVar, bVar2, null), 3);
                    }
                }
                m0Var.c();
                bVar.f167363r = null;
                bVar.f2();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionCancel$1$1$1", f = "Clickable.kt", l = {1726}, m = "invokeSuspend", v = 1)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a2.j f167372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a2.l.a f167373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o53.u0 f167374d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a2.j jVar, a2.l.a aVar, o53.u0 u0Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f167372b = jVar;
            this.f167373c = aVar;
            this.f167374d = u0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f167372b, this.f167373c, this.f167374d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167371a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f167371a = 1;
                if (this.f167372b.b(this.f167373c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o53.u0 u0Var = this.f167374d;
            if (u0Var != null) {
                u0Var.dispose();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", f = "Clickable.kt", l = {1669, 1674, 1675}, m = "invokeSuspend", v = 1)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a2.l.c f167375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f167376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.l1 f167377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f167378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a2.j f167379e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o53.l1 l1Var, long j8, a2.j jVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f167377c = l1Var;
            this.f167378d = j8;
            this.f167379e = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f167377c, this.f167378d, this.f167379e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            if (r2.b(r1, r8) == r0) goto L20;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a2.l.c cVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167376b;
            a2.j jVar = this.f167379e;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f167376b = 1;
                if (this.f167377c.P(this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                cVar = this.f167375a;
                o13.r.b(obj);
                this.f167375a = null;
                this.f167376b = 3;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            a2.l.b bVar = new a2.l.b(this.f167378d, null);
            cVar = new a2.l.c(bVar);
            this.f167375a = cVar;
            this.f167376b = 2;
            if (jVar.b(bVar, this) != aVar) {
                this.f167375a = null;
                this.f167376b = 3;
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$2$1", f = "Clickable.kt", l = {1686}, m = "invokeSuspend", v = 1)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a2.l.b f167381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a2.j f167382c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a2.l.b bVar, a2.j jVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f167381b = bVar;
            this.f167382c = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f167381b, this.f167382c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167380a;
            if (i14 == 0) {
                o13.r.b(obj);
                a2.l.c cVar = new a2.l.c(this.f167381b);
                this.f167380a = 1;
                if (this.f167382c.b(cVar, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1", f = "Clickable.kt", l = {1624, 1625}, m = "invokeSuspend", v = 1)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a2.j f167384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a2.l.b f167385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f167386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f167387e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a2.j jVar, a2.l.b bVar, boolean z14, b bVar2, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f167384b = jVar;
            this.f167385c = bVar;
            this.f167386d = z14;
            this.f167387e = bVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f167384b, this.f167385c, this.f167386d, this.f167387e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            if (r7.f167384b.b(r4, r7) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167383a;
            a2.l.b bVar = this.f167385c;
            if (i14 == 0) {
                o13.r.b(obj);
                long j8 = z.f167723a;
                this.f167383a = 1;
                if (o53.m0.b(j8, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            boolean z14 = this.f167386d;
            b bVar2 = this.f167387e;
            if (z14) {
                bVar2.f167363r = bVar;
            } else {
                bVar2.f167359n = bVar;
            }
            return Unit.INSTANCE;
            this.f167383a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$2", f = "Clickable.kt", l = {1638}, m = "invokeSuspend", v = 1)
    public static final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a2.j f167389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a2.l.b f167390c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a2.j jVar, a2.l.b bVar, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f167389b = jVar;
            this.f167390c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(this.f167389b, this.f167390c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167388a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f167388a = 1;
                if (this.f167389b.b(this.f167390c, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {1548}, m = "invokeSuspend", v = 1)
    public static final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167391a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a2.l.b f167393c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(a2.l.b bVar, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f167393c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new i(this.f167393c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167391a;
            if (i14 == 0) {
                o13.r.b(obj);
                a2.j jVar = b.this.f167348c;
                if (jVar != null) {
                    this.f167391a = 1;
                    if (jVar.b(this.f167393c, this) == aVar) {
                        return aVar;
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
    @v13.e(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2", f = "Clickable.kt", l = {1559}, m = "invokeSuspend", v = 1)
    public static final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167394a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a2.l.b f167396c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(a2.l.b bVar, t13.d<? super j> dVar) {
            super(2, dVar);
            this.f167396c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new j(this.f167396c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167394a;
            if (i14 == 0) {
                o13.r.b(obj);
                a2.j jVar = b.this.f167348c;
                if (jVar != null) {
                    a2.l.c cVar = new a2.l.c(this.f167396c);
                    this.f167394a = 1;
                    if (jVar.b(cVar, this) == aVar) {
                        return aVar;
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
    @v13.e(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {
        public k(t13.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new k(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            b bVar = b.this;
            if (bVar.f167360o == null) {
                a2.e eVar = new a2.e();
                a2.j jVar = bVar.f167348c;
                if (jVar != null) {
                    ge1.b.T(bVar.getCoroutineScope(), null, null, new u1.c(jVar, eVar, null), 3);
                }
                bVar.f167360o = eVar;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {
        public l(t13.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new l(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            b bVar = b.this;
            a2.e eVar = bVar.f167360o;
            if (eVar != null) {
                a2.f fVar = new a2.f(eVar);
                a2.j jVar = bVar.f167348c;
                if (jVar != null) {
                    ge1.b.T(bVar.getCoroutineScope(), null, null, new u1.d(jVar, fVar, null), 3);
                }
                bVar.f167360o = null;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(a2.j jVar, f1 f1Var, boolean z14, boolean z15, String str, p5.l lVar, e23.a<Unit> aVar) {
        this.f167348c = jVar;
        this.f167349d = f1Var;
        this.f167350e = z14;
        this.f167351f = str;
        this.f167352g = lVar;
        this.f167353h = z15;
        this.f167354i = aVar;
        a2.j jVar2 = this.f167348c;
        m4.n0.f116502b.getClass();
        this.f167355j = new n0(jVar2, 0 == true ? 1 : 0, new c(this), null);
        this.f167361p = p1.w.a();
        n4.c.f123541b.getClass();
        this.f167362q = 0L;
        a2.j jVar3 = this.f167348c;
        this.f167364t = jVar3;
        this.f167365v = jVar3 == null;
        this.f167368y = f167347z;
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        p5.l lVar = this.f167352g;
        if (lVar != null) {
            p5.h0.w(k0Var, lVar.f136041a);
        }
        p5.h0.i(k0Var, this.f167351f, new u1.a(this, 1));
        if (this.f167353h) {
            this.f167355j.D1(k0Var);
        } else {
            p5.h0.b(k0Var);
        }
        X1(k0Var);
    }

    @Override // z4.g
    public final boolean J(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[RETURN] */
    @Override // z4.g
    public final boolean M1(KeyEvent keyEvent) {
        boolean z14;
        e2();
        long jA = z4.d.a(keyEvent);
        boolean z15 = this.f167353h;
        p1.m0<a2.l.b> m0Var = this.f167361p;
        if (z15) {
            int iB = z4.d.b(keyEvent);
            z4.c.f202307b.getClass();
            if (iB == z4.c.f202309d && w.g(keyEvent)) {
                if (m0Var.a(jA)) {
                    z14 = false;
                } else {
                    a2.l.b bVar = new a2.l.b(this.f167362q, null);
                    m0Var.h(jA, bVar);
                    if (this.f167348c != null) {
                        ge1.b.T(getCoroutineScope(), null, null, new i(bVar, null), 3);
                    }
                    z14 = true;
                }
                if (g2(keyEvent) || z14) {
                    return true;
                }
                return false;
            }
        }
        if (this.f167353h) {
            int iB2 = z4.d.b(keyEvent);
            z4.c.f202307b.getClass();
            if (iB2 == z4.c.f202308c && w.g(keyEvent)) {
                a2.l.b bVarG = m0Var.g(jA);
                if (bVarG != null) {
                    if (this.f167348c != null) {
                        ge1.b.T(getCoroutineScope(), null, null, new j(bVarG, null), 3);
                    }
                    h2(keyEvent);
                }
                if (bVarG != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // h5.e2
    public final Object X() {
        return this.f167368y;
    }

    public void X1(p5.k0 k0Var) {
    }

    public abstract b5.v0 Y1();

    public final boolean Z1() {
        p005kotlin.jvm.internal.m0 m0Var = new p005kotlin.jvm.internal.m0();
        gl1.d.h0(this, p2.f193552c, new kn1.c(m0Var, 1));
        if (!m0Var.f105804a) {
            int i14 = z.f167724b;
            ViewParent parent = h5.l.a(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    @Override // h5.u1
    public void a1() {
        a2.e eVar;
        a2.j jVar = this.f167348c;
        if (jVar != null && (eVar = this.f167360o) != null) {
            jVar.a(new a2.f(eVar));
        }
        this.f167360o = null;
        b5.u0 u0Var = this.f167357l;
        if (u0Var != null) {
            u0Var.a1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void a2() {
        a2.j jVar = this.f167348c;
        p1.m0<a2.l.b> m0Var = this.f167361p;
        if (jVar != null) {
            a2.l.b bVar = this.f167359n;
            if (bVar != null) {
                jVar.a(new a2.l.a(bVar));
            }
            a2.l.b bVar2 = this.f167363r;
            if (bVar2 != null) {
                jVar.a(new a2.l.a(bVar2));
            }
            a2.e eVar = this.f167360o;
            if (eVar != null) {
                jVar.a(new a2.f(eVar));
            }
            Object[] objArr = m0Var.f134842c;
            long[] jArr = m0Var.f134840a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j8 = jArr[i14];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i14 != length) {
                            break;
                            break;
                        }
                        i14++;
                    } else {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((255 & j8) < 128) {
                                jVar.a(new a2.l.a((a2.l.b) objArr[(i14 << 3) + i16]));
                            }
                            j8 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        } else if (i14 != length) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
            }
        }
        this.f167359n = null;
        this.f167363r = null;
        this.f167360o = null;
        m0Var.c();
    }

    @Override // y4.e
    public final void b0(y4.a aVar, b5.s sVar) {
        List<y4.d> list = aVar.f194370a;
        e2();
        if (this.f167353h) {
            if (this.f167366w == null) {
                this.f167366w = new a(this);
            }
            a aVar2 = this.f167366w;
            if (aVar2 != null) {
                e23.a<Unit> aVar3 = this.f167354i;
                b bVar = aVar2.f167369a;
                int i14 = 0;
                if (sVar != b5.s.Main) {
                    if (sVar != b5.s.Final || aVar2.f167370b == null) {
                        return;
                    }
                    int size = list.size();
                    while (i14 < size) {
                        y4.d dVar = list.get(i14);
                        if (dVar.f194390i && !dVar.equals(aVar2.f167370b)) {
                            aVar2.a();
                            return;
                        }
                        i14++;
                    }
                    return;
                }
                y4.d dVar2 = aVar2.f167370b;
                if (dVar2 == null) {
                    int size2 = list.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        y4.d dVar3 = list.get(i15);
                        if (!dVar3.f194389h && dVar3.f194385d) {
                            y4.d dVar4 = list.get(0);
                            aVar2.f167370b = dVar4;
                            bVar.d2(dVar4.f194384c, true);
                            dVar4.f194390i = true;
                            return;
                        }
                    }
                    return;
                }
                long j8 = dVar2.f194384c;
                int size3 = list.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    y4.d dVar5 = list.get(i16);
                    if (dVar5.f194389h && dVar5.f194385d) {
                        if (Math.abs(n4.c.e(n4.c.i(list.get(0).f194384c, j8))) > ((a4) h5.i.a(bVar, kotlin.t1.f91502t)).e()) {
                            aVar2.a();
                            return;
                        }
                        return;
                    }
                }
                int size4 = list.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    y4.d dVar6 = list.get(i17);
                    if (dVar6.f194390i || !dVar6.f194389h || dVar6.f194385d) {
                        int size5 = list.size();
                        while (i14 < size5) {
                            if (list.get(i14).f194390i) {
                                aVar2.a();
                                return;
                            }
                            i14++;
                        }
                        return;
                    }
                }
                list.get(0).f194390i = true;
                bVar.c2(j8, true);
                aVar3.invoke();
                aVar2.f167370b = null;
            }
        }
    }

    public final void b2(boolean z14) {
        a2.j jVar = this.f167348c;
        if (jVar != null) {
            o53.c2 c2Var = this.f167367x;
            if (c2Var == null || !c2Var.isActive()) {
                a2.l.b bVar = z14 ? this.f167363r : this.f167359n;
                if (bVar != null) {
                    a2.l.a aVar = new a2.l.a(bVar);
                    o53.l1 l1Var = (o53.l1) getCoroutineScope().getF195311f().get(o53.l1.f129368i0);
                    ge1.b.T(getCoroutineScope(), null, null, new d(jVar, aVar, l1Var != null ? l1Var.J(new ty1.g2(1, jVar, aVar)) : null, null), 3);
                }
            } else {
                o53.c2 c2Var2 = this.f167367x;
                if (c2Var2 != null) {
                    c2Var2.c(null);
                }
            }
            if (z14) {
                this.f167363r = null;
            } else {
                this.f167359n = null;
            }
        }
    }

    public final void c2(long j8, boolean z14) {
        a2.j jVar = this.f167348c;
        if (jVar != null) {
            o53.c2 c2Var = this.f167367x;
            if (c2Var == null || !c2Var.isActive()) {
                a2.l.b bVar = z14 ? this.f167363r : this.f167359n;
                if (bVar != null) {
                    ge1.b.T(getCoroutineScope(), null, null, new f(bVar, jVar, null), 3);
                }
            } else {
                c2Var.c(null);
                ge1.b.T(getCoroutineScope(), null, null, new e(c2Var, j8, jVar, null), 3);
            }
            if (z14) {
                this.f167363r = null;
            } else {
                this.f167359n = null;
            }
        }
    }

    public final void d2(long j8, boolean z14) {
        a2.j jVar = this.f167348c;
        if (jVar != null) {
            a2.l.b bVar = new a2.l.b(j8, null);
            if (Z1()) {
                this.f167367x = ge1.b.T(getCoroutineScope(), null, null, new g(jVar, bVar, z14, this, null), 3);
                return;
            }
            if (z14) {
                this.f167363r = bVar;
            } else {
                this.f167359n = bVar;
            }
            ge1.b.T(getCoroutineScope(), null, null, new h(jVar, bVar, null), 3);
        }
    }

    public final void e2() {
        if (this.f167358m != null) {
            return;
        }
        f1 f1Var = this.f167350e ? this.f167356k : this.f167349d;
        if (f1Var != null) {
            if (this.f167348c == null) {
                this.f167348c = new a2.k();
            }
            this.f167355j.Z1(this.f167348c);
            a2.j jVar = this.f167348c;
            jVar.getClass();
            h5.j jVarA = f1Var.a(jVar);
            U1(jVarA);
            this.f167358m = jVarA;
        }
    }

    public void f2() {
    }

    public abstract boolean g2(KeyEvent keyEvent);

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    public abstract void h2(KeyEvent keyEvent);

    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    public final void i2(a2.j jVar, f1 f1Var, boolean z14, boolean z15, String str, p5.l lVar, e23.a<Unit> aVar) {
        boolean z16;
        boolean z17;
        h5.j jVar2;
        if (p005kotlin.jvm.internal.s.g(this.f167364t, jVar)) {
            z16 = false;
        } else {
            a2();
            this.f167364t = jVar;
            this.f167348c = jVar;
            z16 = true;
        }
        if (!p005kotlin.jvm.internal.s.g(this.f167349d, f1Var)) {
            this.f167349d = f1Var;
            z16 = true;
        }
        if (this.f167350e != z14) {
            this.f167350e = z14;
            if (z14) {
                x1();
            }
            z16 = true;
        }
        boolean z18 = this.f167353h;
        n0 n0Var = this.f167355j;
        if (z18 != z15) {
            if (z15) {
                U1(n0Var);
            } else {
                V1(n0Var);
                a2();
            }
            h5.k.g(this).U();
            this.f167353h = z15;
        }
        if (!p005kotlin.jvm.internal.s.g(this.f167351f, str)) {
            this.f167351f = str;
            h5.k.g(this).U();
        }
        if (!p005kotlin.jvm.internal.s.g(this.f167352g, lVar)) {
            this.f167352g = lVar;
            h5.k.g(this).U();
        }
        this.f167354i = aVar;
        boolean z19 = this.f167365v;
        a2.j jVar3 = this.f167364t;
        if (z19 != (jVar3 == null)) {
            boolean z24 = jVar3 == null;
            this.f167365v = z24;
            z17 = (z24 || this.f167358m != null) ? z16 : true;
        }
        if (z17 && ((jVar2 = this.f167358m) != null || !this.f167365v)) {
            if (jVar2 != null) {
                V1(jVar2);
            }
            this.f167358m = null;
            e2();
        }
        n0Var.Z1(this.f167348c);
    }

    @Override // h5.y1
    /* JADX INFO: renamed from: l1 */
    public final boolean getF136009a() {
        return true;
    }

    @Override // h4.r.c
    public final void onAttach() {
        x1();
        if (!this.f167365v) {
            e2();
        }
        if (this.f167353h) {
            U1(this.f167355j);
        }
    }

    @Override // h4.r.c
    public final void onDetach() {
        a2();
        if (this.f167364t == null) {
            this.f167348c = null;
        }
        h5.j jVar = this.f167358m;
        if (jVar != null) {
            V1(jVar);
        }
        this.f167358m = null;
    }

    @Override // y4.e
    public final void u0() {
        a aVar = this.f167366w;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // h5.u1
    public void u1(b5.q qVar, b5.s sVar, long j8) {
        b5.v0 v0VarY1;
        long jB = g6.n.b(j8);
        g6.k.a aVar = g6.k.f76003b;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32);
        n4.c.a aVar2 = n4.c.f123541b;
        this.f167362q = jFloatToRawIntBits;
        e2();
        if (this.f167353h && sVar == b5.s.Main) {
            int i14 = qVar.f15875f;
            b5.t.f15887b.getClass();
            if (i14 == b5.t.f15891f) {
                ge1.b.T(getCoroutineScope(), null, null, new k(null), 3);
            } else if (i14 == b5.t.f15892g) {
                ge1.b.T(getCoroutineScope(), null, null, new l(null), 3);
            }
        }
        if (this.f167357l == null && (v0VarY1 = Y1()) != null) {
            U1(v0VarY1);
            this.f167357l = v0VarY1;
        }
        b5.u0 u0Var = this.f167357l;
        if (u0Var != null) {
            u0Var.u1(qVar, sVar, j8);
        }
    }

    @Override // h5.i1
    public final void x1() {
        if (this.f167350e) {
            h5.j1.a(this, new u1.a(this, 0));
        }
    }

    /* JADX INFO: renamed from: u1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu1/b$b;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C3147b {
        public /* synthetic */ C3147b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3147b() {
        }
    }

    public /* synthetic */ b(a2.j jVar, f1 f1Var, boolean z14, boolean z15, String str, p5.l lVar, e23.a aVar, p005kotlin.jvm.internal.j jVar2) {
        this(jVar, f1Var, z14, z15, str, lVar, aVar);
    }
}
