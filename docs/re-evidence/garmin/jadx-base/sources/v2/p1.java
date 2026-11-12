package v2;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006Ba\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lv2/p1;", "Lh5/m;", "Lh5/c0;", "Lh5/s;", "Lh5/h;", "Lh5/u;", "Lh5/y1;", "", "isFocused", "isDragHovered", "Lv2/g2;", "textLayoutState", "Lv2/h2;", "textFieldState", "Lw2/n;", "textFieldSelectionState", "Lo4/w;", "cursorBrush", "writeable", "Lu1/d2;", "scrollState", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "Lr2/p;", "toolbarRequester", "Lz2/q;", "platformSelectionBehaviors", "<init>", "(ZZLv2/g2;Lv2/h2;Lw2/n;Lo4/w;ZLu1/d2;Ly1/b2;Lr2/p;Lz2/q;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p1 extends h5.m implements h5.c0, h5.s, h5.h, h5.u, h5.y1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f175112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f175113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g2 f175114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h2 f175115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w2.n f175116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o4.w f175117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f175118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u1.d2 f175119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p008y1.b2 f175120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r2.p f175121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z2.q f175122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e0 f175123n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o53.c2 f175124o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s5.w0 f175125p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n4.d f175126q = new n4.d(-1.0f, -1.0f, -1.0f, -1.0f);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f175127r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f175128t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w2.h f175129v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r2.n f175130w;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", f = "TextFieldCoreModifier.kt", l = {619}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f175131a;

        /* JADX INFO: renamed from: v2.p1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isWindowFocused", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", f = "TextFieldCoreModifier.kt", l = {621}, m = "invokeSuspend", v = 1)
        public static final class C3261a extends v13.i implements e23.p<Integer, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f175133a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ int f175134b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p1 f175135c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3261a(p1 p1Var, t13.d<? super C3261a> dVar) {
                super(2, dVar);
                this.f175135c = p1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3261a c3261a = new C3261a(this.f175135c, dVar);
                c3261a.f175134b = ((Number) obj).intValue();
                return c3261a;
            }

            @Override // e23.p
            public final Object invoke(Integer num, t13.d<? super Unit> dVar) {
                return ((C3261a) create(Integer.valueOf(num.intValue()), dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                e0 e0Var;
                Object obj2 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f175133a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    if (Math.abs(this.f175134b) == 1 && (e0Var = this.f175135c.f175123n) != null) {
                        this.f175133a = 1;
                        Object objE = o53.c0.e(new d0(e0Var, null), this);
                        if (objE != obj2) {
                            objE = Unit.INSTANCE;
                        }
                        if (objE == obj2) {
                            return obj2;
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

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p1.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f175131a;
            if (i14 == 0) {
                o13.r.b(obj);
                p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
                p0Var.f105807a = 1;
                p1 p1Var = p1.this;
                r53.c2 c2VarS = p3.p0.s(new ug2.h(17, p1Var, p0Var));
                C3261a c3261a = new C3261a(p1Var, null);
                this.f175131a = 1;
                if (r53.s.k(c2VarS, c3261a, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1", f = "TextFieldCoreModifier.kt", l = {209, 210}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f175136a;

        public b(t13.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return p1.this.new b(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            if (r8.a(r1, r5, r7) == r0) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f175136a;
            p1 p1Var = p1.this;
            if (i14 == 0) {
                o13.r.b(obj);
                w2.n nVar = p1Var.f175116g;
                this.f175136a = 1;
                if (nVar.F() != aVar) {
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
            p1Var.f175116g.f181387w.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
            z2.q qVar = p1Var.f175122m;
            if (qVar != null) {
                CharSequence charSequence = p1Var.f175116g.f181365a.d().f167839c;
                long j8 = p1Var.f175116g.f181365a.d().f167840d;
                this.f175136a = 2;
            }
            p1Var.f175116g.f181387w.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2", f = "TextFieldCoreModifier.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends v13.i implements e23.l<t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return p1.this.new c(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p1.this.f175116g.f181387w.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public p1(boolean z14, boolean z15, g2 g2Var, h2 h2Var, w2.n nVar, o4.w wVar, boolean z16, u1.d2 d2Var, p008y1.b2 b2Var, r2.p pVar, z2.q qVar) {
        this.f175112c = z14;
        this.f175113d = z15;
        this.f175114e = g2Var;
        this.f175115f = h2Var;
        this.f175116g = nVar;
        this.f175117h = wVar;
        this.f175118i = z16;
        this.f175119j = d2Var;
        this.f175120k = b2Var;
        this.f175121l = pVar;
        this.f175122m = qVar;
        h2 h2Var2 = this.f175115f;
        w2.n nVar2 = this.f175116g;
        g2 g2Var2 = this.f175114e;
        boolean z17 = this.f175112c || this.f175113d;
        p5.j0<e23.a<n4.c>> j0Var = u1.j1.f167577a;
        w2.k kVar = new w2.k(h2Var2, nVar2, g2Var2, z17);
        U1(kVar);
        this.f175129v = kVar;
        r2.n nVar3 = new r2.n(this.f175121l, new b(null), new c(null), new uo1.a(this, 10));
        U1(nVar3);
        this.f175130w = nVar3;
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        this.f175129v.D1(k0Var);
    }

    public final boolean X1() {
        if (!this.f175118i) {
            return false;
        }
        if (!this.f175112c && !this.f175113d) {
            return false;
        }
        o4.w wVar = this.f175117h;
        float f14 = n1.f175100a;
        return ((wVar instanceof o4.t1) && ((o4.t1) wVar).f129007b == 16) ? false : true;
    }

    public final void Y1() {
        if (this.f175123n == null) {
            this.f175123n = new e0(((Boolean) h5.i.a(this, kotlin.t1.f91506x)).booleanValue());
            h5.t.a(this);
        }
        this.f175124o = ge1.b.T(getCoroutineScope(), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    public final void Z1(f5.v1.a aVar, int i14, int i15, long j8, g6.o oVar) {
        int i16;
        s5.q0 q0VarC;
        this.f175119j.f167434b.t(i14);
        this.f175119j.f(i15 - i14);
        s5.w0 w0Var = this.f175125p;
        if (w0Var != null) {
            s5.w0.a aVar2 = s5.w0.f157315b;
            int i17 = (int) (j8 & 4294967295L);
            long j14 = w0Var.f157317a;
            if (i17 == ((int) (j14 & 4294967295L))) {
                i16 = (int) (j8 >> 32);
                if (i16 == ((int) (j14 >> 32)) && i15 == this.f175127r && i14 == this.f175128t) {
                    i16 = -1;
                }
            } else {
                s5.w0.a aVar3 = s5.w0.f157315b;
                i16 = (int) (j8 & 4294967295L);
            }
        } else {
            s5.w0.a aVar4 = s5.w0.f157315b;
            i16 = (int) (j8 & 4294967295L);
        }
        if (i16 < 0 || !X1() || (q0VarC = this.f175114e.c()) == null) {
            return;
        }
        n4.d dVarC = q0VarC.c(j23.t.f(i16, new j23.l(0, q0VarC.f157280a.f157265a.f157138b.length())));
        float f14 = dVarC.f123547a;
        float f15 = dVarC.f123549c;
        boolean z14 = oVar == g6.o.Rtl;
        int iF0 = aVar.f0(n1.f175100a);
        float f16 = z14 ? i15 - f15 : f14;
        if (z14) {
            f14 = i15 - f15;
        }
        float f17 = 0.0f;
        n4.d dVarB = n4.d.b(dVarC, f16, f14 + iF0, 0.0f, 10);
        float f18 = dVarB.f123548b;
        float f19 = dVarB.f123547a;
        n4.d dVar = this.f175126q;
        boolean z15 = (f19 == dVar.f123547a && f18 == dVar.f123548b && i15 == this.f175127r) ? false : true;
        if (z15 || i14 != this.f175128t) {
            boolean z16 = this.f175120k == p008y1.b2.Vertical;
            if (!z16) {
                f18 = f19;
            }
            float f22 = z16 ? dVarB.f123550d : dVarB.f123549c;
            int intValue = this.f175119j.f167433a.getIntValue();
            float f24 = intValue + i14;
            if (f22 > f24) {
                f17 = f22 - f24;
            } else {
                float f25 = intValue;
                if (f18 < f25 && f22 - f18 > i14) {
                    f17 = f22 - f24;
                } else if (f18 < f25 && f22 - f18 <= i14) {
                    f17 = f18 - f25;
                }
            }
            this.f175125p = s5.w0.a(j8);
            this.f175126q = dVarB;
            this.f175128t = i14;
            this.f175127r = i15;
            ge1.b.T(getCoroutineScope(), null, o53.d0.UNDISPATCHED, new q1(this, f17, z15, dVarC, null), 1);
        }
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(final f5.b1 b1Var, f5.y0 y0Var, long j8) {
        if (this.f175120k == p008y1.b2.Vertical) {
            final f5.v1 v1VarQ = y0Var.Q(g6.a.c(0, 0, 0, Integer.MAX_VALUE, 7, j8));
            final int iMin = Math.min(v1VarQ.f69145b, g6.a.i(j8));
            final int i14 = 1;
            return f5.b1.h0(b1Var, v1VarQ.f69144a, iMin, new e23.l(this) { // from class: v2.o1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p1 f175108b;

                {
                    this.f175108b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            f5.v1.a aVar = (f5.v1.a) obj;
                            f5.v1 v1Var = v1VarQ;
                            int i15 = v1Var.f69144a;
                            p1 p1Var = this.f175108b;
                            p1Var.Z1(aVar, iMin, i15, p1Var.f175115f.d().f167840d, b1Var.getF68910b());
                            f5.v1.a.B(aVar, v1Var, -p1Var.f175119j.f167433a.getIntValue(), 0);
                            break;
                        default:
                            f5.v1.a aVar2 = (f5.v1.a) obj;
                            f5.v1 v1Var2 = v1VarQ;
                            int i16 = v1Var2.f69145b;
                            p1 p1Var2 = this.f175108b;
                            p1Var2.Z1(aVar2, iMin, i16, p1Var2.f175115f.d().f167840d, b1Var.getF68910b());
                            f5.v1.a.B(aVar2, v1Var2, 0, -p1Var2.f175119j.f167433a.getIntValue());
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
        final f5.v1 v1VarQ2 = y0Var.Q(g6.a.c(0, Integer.MAX_VALUE, 0, 0, 13, j8));
        final int iMin2 = Math.min(v1VarQ2.f69144a, g6.a.j(j8));
        final int i15 = 0;
        return f5.b1.h0(b1Var, iMin2, v1VarQ2.f69145b, new e23.l(this) { // from class: v2.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1 f175108b;

            {
                this.f175108b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        f5.v1.a aVar = (f5.v1.a) obj;
                        f5.v1 v1Var = v1VarQ2;
                        int i16 = v1Var.f69144a;
                        p1 p1Var = this.f175108b;
                        p1Var.Z1(aVar, iMin2, i16, p1Var.f175115f.d().f167840d, b1Var.getF68910b());
                        f5.v1.a.B(aVar, v1Var, -p1Var.f175119j.f167433a.getIntValue(), 0);
                        break;
                    default:
                        f5.v1.a aVar2 = (f5.v1.a) obj;
                        f5.v1 v1Var2 = v1VarQ2;
                        int i17 = v1Var2.f69145b;
                        p1 p1Var2 = this.f175108b;
                        p1Var2.Z1(aVar2, iMin2, i17, p1Var2.f175115f.d().f167840d, b1Var.getF68910b());
                        f5.v1.a.B(aVar2, v1Var2, 0, -p1Var2.f175119j.f167433a.getIntValue());
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // h5.u
    public final void o(h5.c1 c1Var) {
        this.f175114e.f174999e.setValue(c1Var);
        this.f175129v.o(c1Var);
    }

    @Override // h4.r.c
    public final void onAttach() {
        if (this.f175112c && X1()) {
            Y1();
        }
    }

    @Override // h5.s
    public final void p(h5.h0 h0Var) {
        int iH;
        int iG;
        q4.a aVar = h0Var.f81825a;
        h0Var.m1();
        u2.e eVarD = this.f175115f.d();
        s5.q0 q0VarC = this.f175114e.c();
        if (q0VarC == null) {
            return;
        }
        o13.p<u2.j, s5.w0> pVar = eVarD.f167842f;
        o13.p<u2.j, s5.w0> pVar2 = eVarD.f167842f;
        long j8 = eVarD.f167840d;
        if (pVar != null) {
            int i14 = pVar.f128594a.f167856a;
            long j14 = pVar.f128595b.f157317a;
            if (!s5.w0.e(j14)) {
                o4.j jVarK = q0VarC.k(s5.w0.h(j14), s5.w0.g(j14));
                s5.p0 p0Var = q0VarC.f157280a;
                u2.j.f167854b.getClass();
                if (i14 == u2.j.f167855c) {
                    o4.w wVarB = p0Var.f157266b.b();
                    if (wVarB != null) {
                        q4.f.C1(h0Var, jVarK, wVarB, 0.2f, null, 56);
                    } else {
                        long jC = p0Var.f157266b.c();
                        if (jC == 16) {
                            o4.d0.f128823b.getClass();
                            jC = o4.d0.f128824c;
                        }
                        q4.f.L(h0Var, jVarK, o4.d0.c(o4.d0.e(jC) * 0.2f, jC, 14), 0.0f, null, 60);
                    }
                } else {
                    q4.f.L(h0Var, jVarK, ((t2) h5.i.a(this, u2.f201804a)).f201803b, 0.0f, null, 60);
                }
            }
        }
        if (s5.w0.e(j8)) {
            o4.y yVarA = aVar.f142543b.a();
            s5.u0.f157305a.getClass();
            s5.u0.a(yVarA, q0VarC);
            if (pVar2 == null) {
                e0 e0Var = this.f175123n;
                float floatValue = e0Var != null ? e0Var.f174959c.getFloatValue() : 0.0f;
                if (floatValue != 0.0f && X1()) {
                    n4.d dVarP = this.f175116g.p();
                    q4.f.A1(h0Var, this.f175117h, dVarP.h(), dVarP.c(), dVarP.f123549c - dVarP.f123547a, floatValue);
                }
            }
        } else {
            if (pVar2 == null && (iH = s5.w0.h(j8)) != (iG = s5.w0.g(j8))) {
                q4.f.L(h0Var, q0VarC.k(iH, iG), ((t2) h5.i.a(this, u2.f201804a)).f201803b, 0.0f, null, 60);
            }
            o4.y yVarA2 = aVar.f142543b.a();
            s5.u0.f157305a.getClass();
            s5.u0.a(yVarA2, q0VarC);
        }
        this.f175129v.p(h0Var);
    }
}
