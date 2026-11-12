package u1;

import android.view.KeyEvent;
import kotlin.a4;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0017B\u007f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lu1/c0;", "Lh5/h;", "Lu1/b;", "Lkotlin/Function0;", "", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "", "hapticFeedbackEnabled", "La2/j;", "interactionSource", "Lu1/f1;", "indicationNodeFactory", "useLocalIndication", "enabled", "onClickLabel", "Lp5/l;", "role", "<init>", "(Le23/a;Ljava/lang/String;Le23/a;Le23/a;ZLa2/j;Lu1/f1;ZZLjava/lang/String;Lp5/l;Lkotlin/jvm/internal/j;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 extends u1.b {
    public String A;
    public e23.a<Unit> B;
    public e23.a<Unit> C;
    public boolean D;
    public final p1.m0<o53.l1> E;
    public final p1.m0<a> F;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu1/c0$a;", "", "Lo53/l1;", "job", "<init>", "(Lo53/l1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o53.l1 f167416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f167417b;

        public a(o53.l1 l1Var) {
            this.f167416a = l1Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1", f = "Clickable.kt", l = {1138}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167418a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c0.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167418a;
            c0 c0Var = c0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                long jC = ((a4) h5.i.a(c0Var, kotlin.t1.f91502t)).c();
                this.f167418a = 1;
                if (o53.m0.b(jC, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            e23.a<Unit> aVar2 = c0Var.B;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    private c0(e23.a<Unit> aVar, String str, e23.a<Unit> aVar2, e23.a<Unit> aVar3, boolean z14, a2.j jVar, f1 f1Var, boolean z15, boolean z16, String str2, p5.l lVar) {
        super(jVar, f1Var, z15, z16, str2, lVar, aVar, null);
        this.A = str;
        this.B = aVar2;
        this.C = aVar3;
        this.D = z14;
        this.E = p1.w.a();
        this.F = p1.w.a();
    }

    @Override // u1.b
    public final void X1(p5.k0 k0Var) {
        if (this.B != null) {
            String str = this.A;
            ty1.f1 f1Var = new ty1.f1(this, 2);
            k23.l<Object>[] lVarArr = p5.h0.f136016a;
            p5.p.f136057a.getClass();
            k0Var.a(p5.p.f136060d, new p5.a(str, f1Var));
        }
    }

    @Override // u1.b
    public final b5.v0 Y1() {
        return b5.s0.a(new e0(this));
    }

    @Override // u1.b
    public final void f2() {
        j2();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // u1.b
    public final boolean g2(KeyEvent keyEvent) {
        boolean z14;
        long jA = z4.d.a(keyEvent);
        if (this.B != null) {
            p1.m0<o53.l1> m0Var = this.E;
            if (m0Var.b(jA) == null) {
                m0Var.h(jA, ge1.b.T(getCoroutineScope(), null, null, new b(null), 3));
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        p1.m0<a> m0Var2 = this.F;
        a aVarB = m0Var2.b(jA);
        if (aVarB != null) {
            o53.l1 l1Var = aVarB.f167416a;
            if (l1Var.isActive()) {
                l1Var.c(null);
                if (!aVarB.f167417b) {
                    this.f167354i.invoke();
                    m0Var2.g(jA);
                    return z14;
                }
            } else {
                m0Var2.g(jA);
            }
        }
        return z14;
    }

    @Override // u1.b
    public final void h2(KeyEvent keyEvent) {
        e23.a<Unit> aVar;
        long jA = z4.d.a(keyEvent);
        p1.m0<o53.l1> m0Var = this.E;
        boolean z14 = false;
        if (m0Var.b(jA) != null) {
            o53.l1 l1VarB = m0Var.b(jA);
            if (l1VarB != null) {
                if (l1VarB.isActive()) {
                    l1VarB.c(null);
                } else {
                    z14 = true;
                }
            }
            m0Var.g(jA);
        }
        if (this.C == null) {
            if (z14) {
                return;
            }
            this.f167354i.invoke();
            return;
        }
        p1.m0<a> m0Var2 = this.F;
        if (m0Var2.b(jA) == null) {
            if (z14) {
                return;
            }
            m0Var2.h(jA, new a(ge1.b.T(getCoroutineScope(), null, null, new f0(this, jA, null), 3)));
        } else {
            if (!z14 && (aVar = this.C) != null) {
                aVar.invoke();
            }
            m0Var2.g(jA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0 A[LOOP:2: B:24:0x0071->B:34:0x00a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3 A[EDGE_INSN: B:43:0x00a3->B:35:0x00a3 BREAK  A[LOOP:2: B:24:0x0071->B:34:0x00a0], SYNTHETIC] */
    public final void j2() {
        char c14;
        long j8;
        long j14;
        p1.m0<o53.l1> m0Var = this.E;
        Object[] objArr = m0Var.f134842c;
        long[] jArr = m0Var.f134840a;
        int length = jArr.length - 2;
        char c15 = 7;
        if (length >= 0) {
            int i14 = 0;
            j8 = 128;
            while (true) {
                long j15 = jArr[i14];
                j14 = 255;
                if ((((~j15) << c15) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j15 & 255) < 128) {
                            ((o53.l1) objArr[(i14 << 3) + i16]).c(null);
                        }
                        j15 >>= 8;
                        i16++;
                        c15 = c15;
                    }
                    c14 = c15;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    c14 = c15;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                c15 = c14;
            }
        } else {
            c14 = 7;
            j8 = 128;
            j14 = 255;
        }
        m0Var.c();
        p1.m0<a> m0Var2 = this.F;
        Object[] objArr2 = m0Var2.f134842c;
        long[] jArr2 = m0Var2.f134840a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i17 = 0;
            while (true) {
                long j16 = jArr2[i17];
                if ((((~j16) << c14) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i17 != length2) {
                        break;
                        break;
                    }
                    i17++;
                } else {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j16 & j14) < j8) {
                            ((a) objArr2[(i17 << 3) + i19]).f167416a.c(null);
                        }
                        j16 >>= 8;
                    }
                    if (i18 != 8) {
                        break;
                    } else if (i17 != length2) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        m0Var2.c();
    }

    @Override // h4.r.c
    public final void onReset() {
        super.onReset();
        j2();
    }

    public /* synthetic */ c0(e23.a aVar, String str, e23.a aVar2, e23.a aVar3, boolean z14, a2.j jVar, f1 f1Var, boolean z15, boolean z16, String str2, p5.l lVar, p005kotlin.jvm.internal.j jVar2) {
        this(aVar, str, aVar2, aVar3, z14, jVar, f1Var, z15, z16, str2, lVar);
    }
}
