package p3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
public final class u2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public en0.n f135325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f135326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f135327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2 f135328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.q<o53.b0, e1, t13.d<? super Unit>, Object> f135329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1 f135330f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f135331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f135332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.q<o53.b0, e1, t13.d<? super Unit>, Object> f135333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e1 f135334d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.q<? super o53.b0, ? super e1, ? super t13.d<? super Unit>, ? extends Object> qVar, e1 e1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f135333c = qVar;
            this.f135334d = e1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f135333c, this.f135334d, dVar);
            aVar.f135332b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f135331a;
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var = (o53.b0) this.f135332b;
                this.f135331a = 1;
                if (this.f135333c.invoke(b0Var, this.f135334d, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u2(s2 s2Var, e23.q<? super o53.b0, ? super e1, ? super t13.d<? super Unit>, ? extends Object> qVar, e1 e1Var, t13.d<? super u2> dVar) {
        super(2, dVar);
        this.f135328d = s2Var;
        this.f135329e = qVar;
        this.f135330f = e1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u2 u2Var = new u2(this.f135328d, this.f135329e, this.f135330f, dVar);
        u2Var.f135327c = obj;
        return u2Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0101 A[EDGE_INSN: B:107:0x0101->B:62:0x0101 BREAK  A[LOOP:0: B:58:0x00ed->B:109:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0146 A[EDGE_INSN: B:110:0x0146->B:87:0x0146 BREAK  A[LOOP:1: B:82:0x0131->B:112:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1 A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:47:0x00cd, B:49:0x00d1, B:52:0x00d6, B:54:0x00dc, B:55:0x00e1), top: B:97:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:47:0x00cd, B:49:0x00d1, B:52:0x00d6, B:54:0x00dc, B:55:0x00e1), top: B:97:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0115 A[Catch: all -> 0x0118, TryCatch #4 {all -> 0x0118, blocks: (B:71:0x0111, B:73:0x0115, B:76:0x011a, B:78:0x0120, B:79:0x0125), top: B:104:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0120 A[Catch: all -> 0x0118, TryCatch #4 {all -> 0x0118, blocks: (B:71:0x0111, B:73:0x0115, B:76:0x011a, B:78:0x0120, B:79:0x0125), top: B:104:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x013f  */
    /* JADX WARN: Code duplicated, block: B:97:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.l1 l1VarG;
        r53.p2 p2Var;
        u3.e eVar;
        x3.b bVarAdd;
        en0.n nVar;
        Throwable th3;
        List<c0> listH;
        s2 s2Var;
        s2.c cVar;
        r53.p2 p2Var2;
        u3.e eVar2;
        x3.b bVarRemove;
        s2 s2Var2;
        s2.c cVar2;
        r53.p2 p2Var3;
        u3.e eVar3;
        x3.b bVarRemove2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f135326b;
        if (i14 != 0) {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nVar = this.f135325a;
            l1VarG = (o53.l1) this.f135327c;
            try {
                o13.r.b(obj);
                nVar.c();
                s2Var2 = this.f135328d;
                synchronized (s2Var2.f135276c) {
                    try {
                        if (s2Var2.f135277d == l1VarG) {
                            s2Var2.f135277d = null;
                        }
                        if (s2Var2.C() != null) {
                            n.a("called outside of runRecomposeAndApplyChanges");
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                s2.a aVar2 = s2.f135273z;
                cVar2 = this.f135328d.f135298y;
                aVar2.getClass();
                do {
                    p2Var3 = s2.A;
                    eVar3 = (u3.e) p2Var3.getValue();
                    bVarRemove2 = eVar3.remove((Object) cVar2);
                    if (eVar3 != bVarRemove2) {
                        break;
                    }
                } while (!p2Var3.k(eVar3, bVarRemove2));
                return Unit.INSTANCE;
            } catch (Throwable th5) {
                th3 = th5;
                nVar.c();
                s2Var = this.f135328d;
                synchronized (s2Var.f135276c) {
                    try {
                        if (s2Var.f135277d == l1VarG) {
                            s2Var.f135277d = null;
                        }
                        if (s2Var.C() != null) {
                            n.a("called outside of runRecomposeAndApplyChanges");
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                s2.a aVar3 = s2.f135273z;
                cVar = this.f135328d.f135298y;
                aVar3.getClass();
                do {
                    p2Var2 = s2.A;
                    eVar2 = (u3.e) p2Var2.getValue();
                    bVarRemove = eVar2.remove((Object) cVar);
                    if (eVar2 != bVarRemove) {
                        break;
                    }
                } while (!p2Var2.k(eVar2, bVarRemove));
                throw th3;
            }
        }
        o13.r.b(obj);
        l1VarG = g8.i.G(((o53.b0) this.f135327c).getF195311f());
        s2 s2Var3 = this.f135328d;
        synchronized (s2Var3.f135276c) {
            try {
                Throwable th7 = s2Var3.f135278e;
                if (th7 != null) {
                    throw th7;
                }
                if (((s2.d) s2Var3.f135294u.getValue()).compareTo(s2.d.ShuttingDown) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (s2Var3.f135277d != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                s2Var3.f135277d = l1VarG;
                if (s2Var3.C() != null) {
                    n.a("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit3 = Unit.INSTANCE;
            } catch (Throwable th8) {
                throw th8;
            }
        }
        f4.f.a aVar4 = f4.f.f68735e;
        ov1.q qVar = new ov1.q(this.f135328d, 6);
        aVar4.getClass();
        en0.n nVarD = f4.f.a.d(qVar);
        s2.a aVar5 = s2.f135273z;
        s2.c cVar3 = this.f135328d.f135298y;
        aVar5.getClass();
        do {
            p2Var = s2.A;
            eVar = (u3.e) p2Var.getValue();
            bVarAdd = eVar.add((Object) cVar3);
            if (eVar == bVarAdd) {
                break;
            }
        } while (!p2Var.k(eVar, bVarAdd));
        try {
            s2 s2Var4 = this.f135328d;
            synchronized (s2Var4.f135276c) {
                listH = s2Var4.H();
            }
            int size = listH.size();
            for (int i15 = 0; i15 < size; i15++) {
                listH.get(i15).invalidateAll();
            }
            a aVar6 = new a(this.f135329e, this.f135330f, null);
            this.f135327c = l1VarG;
            this.f135325a = nVarD;
            this.f135326b = 1;
            if (o53.c0.e(aVar6, this) == aVar) {
                return aVar;
            }
            nVar = nVarD;
            nVar.c();
            s2Var2 = this.f135328d;
            synchronized (s2Var2.f135276c) {
                if (s2Var2.f135277d == l1VarG) {
                    s2Var2.f135277d = null;
                }
                if (s2Var2.C() != null) {
                    n.a("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit4 = Unit.INSTANCE;
                s2.a aVar7 = s2.f135273z;
                cVar2 = this.f135328d.f135298y;
                aVar7.getClass();
                do {
                    p2Var3 = s2.A;
                    eVar3 = (u3.e) p2Var3.getValue();
                    bVarRemove2 = eVar3.remove((Object) cVar2);
                    if (eVar3 != bVarRemove2) {
                        break;
                        break;
                    }
                } while (!p2Var3.k(eVar3, bVarRemove2));
                return Unit.INSTANCE;
            }
        } catch (Throwable th9) {
            nVar = nVarD;
            th3 = th9;
            nVar.c();
            s2Var = this.f135328d;
            synchronized (s2Var.f135276c) {
                if (s2Var.f135277d == l1VarG) {
                    s2Var.f135277d = null;
                }
                if (s2Var.C() != null) {
                    n.a("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit5 = Unit.INSTANCE;
                s2.a aVar8 = s2.f135273z;
                cVar = this.f135328d.f135298y;
                aVar8.getClass();
                do {
                    p2Var2 = s2.A;
                    eVar2 = (u3.e) p2Var2.getValue();
                    bVarRemove = eVar2.remove((Object) cVar);
                    if (eVar2 != bVarRemove) {
                        break;
                        break;
                    }
                } while (!p2Var2.k(eVar2, bVarRemove));
                throw th3;
            }
        }
    }
}
