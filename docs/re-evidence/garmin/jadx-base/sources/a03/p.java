package a03;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"La03/p;", "", "", "skipHiddenState", "skipIntermediatelyExpanded", "skipSlightlyExpanded", "La03/m;", "flexibleSheetSize", "containSystemBars", "allowNestedScroll", "isModal", "Ls1/k;", "", "animateSpec", "La03/y;", "initialValue", "Lkotlin/Function1;", "confirmValueChange", "<init>", "(ZZZLa03/m;ZZZLs1/k;La03/y;Le23/l;)V", "a", "flexible-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f149j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s1.k<Float> f157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r0<y> f158i;

    public p(boolean z14, boolean z15, boolean z16, m mVar, boolean z17, boolean z18, boolean z19, s1.k<Float> kVar, y yVar, e23.l<? super y, Boolean> lVar) {
        mVar.getClass();
        kVar.getClass();
        yVar.getClass();
        lVar.getClass();
        this.f150a = z14;
        this.f151b = z15;
        this.f152c = z16;
        this.f153d = mVar;
        this.f154e = z17;
        this.f155f = z18;
        this.f156g = z19;
        this.f157h = kVar;
        if (z15 && yVar == y.IntermediatelyExpanded) {
            vb.h.s("The initial value must not be set to IntermediatelyExpanded if skipIntermediatelyExpanded is set to true.");
            throw null;
        }
        p3.p0.n(Boolean.FALSE);
        this.f158i = new r0<>(yVar, kVar, lVar, null, 0.0f, 24, null);
    }

    public static Object a(p pVar, y yVar, float f14, s1.k kVar, v13.c cVar, int i14) throws Throwable {
        if ((i14 & 2) != 0) {
            f14 = pVar.f158i.f180k.getFloatValue();
        }
        if ((i14 & 4) != 0) {
            kVar = pVar.f157h;
        }
        Object objA = pVar.f158i.a(yVar, f14, kVar, cVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (a(r1, r2, 0.0f, r4, r5, 2) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (a(r9, r2, 0.0f, r9.f157h, r5, 2) == r0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(v13.c cVar) {
        q qVar;
        p pVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f162d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f162d = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        q qVar2 = qVar;
        Object obj = qVar2.f160b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar2.f162d;
        if (i15 == 0) {
            o13.r.b(obj);
            if (this.f156g) {
                y yVar = y.FullyExpanded;
                qVar2.f162d = 3;
            } else {
                y yVar2 = y.FullyExpanded;
                qVar2.f159a = this;
                qVar2.f162d = 1;
                if (a(this, yVar2, 0.0f, this.f157h, qVar2, 2) != aVar) {
                    pVar = this;
                    y yVar3 = y.FullyExpanded;
                    s1.k<Float> kVar = pVar.f157h;
                    qVar2.f159a = null;
                    qVar2.f162d = 2;
                }
            }
            return aVar;
        }
        if (i15 == 1) {
            pVar = qVar2.f159a;
            o13.r.b(obj);
            y yVar4 = y.FullyExpanded;
            s1.k<Float> kVar2 = pVar.f157h;
            qVar2.f159a = null;
            qVar2.f162d = 2;
        } else {
            if (i15 != 2) {
                if (i15 == 3) {
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y c() {
        return (y) this.f158i.f177h.getF182175a();
    }

    public final Object d(v13.i iVar) throws Throwable {
        if (this.f150a) {
            vb.h.z("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
            return null;
        }
        Object objA = a(this, y.Hidden, 0.0f, this.f157h, iVar, 2);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (a(r1, r2, 0.0f, r4, r5, 2) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (a(r9, r2, 0.0f, r9.f157h, r5, 2) == r0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(v13.c cVar) {
        r rVar;
        p pVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f168d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f168d = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        r rVar2 = rVar;
        Object obj = rVar2.f166b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar2.f168d;
        if (i15 != 0) {
            if (i15 == 1) {
                pVar = rVar2.f165a;
                o13.r.b(obj);
                y yVar = y.IntermediatelyExpanded;
                s1.k<Float> kVar = pVar.f157h;
                rVar2.f165a = null;
                rVar2.f168d = 2;
            } else {
                if (i15 != 2) {
                    if (i15 == 3) {
                        o13.r.b(obj);
                        return Unit.INSTANCE;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        if (this.f151b) {
            vb.h.z("Attempted to animate to intermediately expanded when skipIntermediatelyExpanded was enabled. Set skipIntermediatelyExpanded to false to use this function.");
            return null;
        }
        if (this.f156g) {
            y yVar2 = y.IntermediatelyExpanded;
            rVar2.f168d = 3;
        } else {
            y yVar3 = y.IntermediatelyExpanded;
            rVar2.f165a = this;
            rVar2.f168d = 1;
            if (a(this, yVar3, 0.0f, this.f157h, rVar2, 2) != aVar) {
                pVar = this;
                y yVar4 = y.IntermediatelyExpanded;
                s1.k<Float> kVar2 = pVar.f157h;
                rVar2.f165a = null;
                rVar2.f168d = 2;
            }
        }
        return aVar;
    }

    public final boolean f() {
        return this.f158i.f177h.getF182175a() != y.Hidden;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        if (a(r1, r2, 0.0f, r4, r5, 2) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        if (a(r8, r9, 0.0f, null, r5, 6) == r0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(v13.c cVar) {
        s sVar;
        p pVar;
        r0<y> r0Var;
        y yVar;
        r0<y> r0Var2;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f192d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f192d = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        s sVar2 = sVar;
        Object obj = sVar2.f190b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar2.f192d;
        if (i15 != 0) {
            if (i15 == 1) {
                pVar = sVar2.f189a;
                o13.r.b(obj);
                r0Var = pVar.f158i;
                yVar = y.IntermediatelyExpanded;
                if (!r0Var.d().containsKey(yVar)) {
                    r0Var2 = pVar.f158i;
                    yVar = y.SlightlyExpanded;
                    if (!r0Var2.d().containsKey(yVar)) {
                        yVar = y.FullyExpanded;
                    }
                }
                s1.k<Float> kVar = pVar.f157h;
                sVar2.f189a = null;
                sVar2.f192d = 2;
            } else {
                if (i15 != 2) {
                    if (i15 == 3) {
                        o13.r.b(obj);
                        return Unit.INSTANCE;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        boolean z14 = this.f156g;
        r0<y> r0Var3 = this.f158i;
        if (z14) {
            y yVar2 = y.IntermediatelyExpanded;
            if (!r0Var3.d().containsKey(yVar2)) {
                yVar2 = y.SlightlyExpanded;
                if (!r0Var3.d().containsKey(yVar2)) {
                    yVar2 = y.FullyExpanded;
                }
            }
            sVar2.f192d = 3;
        } else {
            y yVar3 = y.IntermediatelyExpanded;
            if (!r0Var3.d().containsKey(yVar3)) {
                yVar3 = y.SlightlyExpanded;
                if (!r0Var3.d().containsKey(yVar3)) {
                    yVar3 = y.FullyExpanded;
                }
            }
            y yVar4 = yVar3;
            sVar2.f189a = this;
            sVar2.f192d = 1;
            if (a(this, yVar4, 0.0f, this.f157h, sVar2, 2) != aVar) {
                pVar = this;
                r0Var = pVar.f158i;
                yVar = y.IntermediatelyExpanded;
                if (!r0Var.d().containsKey(yVar)) {
                    r0Var2 = pVar.f158i;
                    yVar = y.SlightlyExpanded;
                    if (!r0Var2.d().containsKey(yVar)) {
                        yVar = y.FullyExpanded;
                    }
                }
                s1.k<Float> kVar2 = pVar.f157h;
                sVar2.f189a = null;
                sVar2.f192d = 2;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (a(r1, r2, 0.0f, r4, r5, 2) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (a(r9, r2, 0.0f, r9.f157h, r5, 2) == r0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(v13.c cVar) {
        t tVar;
        p pVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f200d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f200d = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        t tVar2 = tVar;
        Object obj = tVar2.f198b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar2.f200d;
        if (i15 != 0) {
            if (i15 == 1) {
                pVar = tVar2.f197a;
                o13.r.b(obj);
                y yVar = y.SlightlyExpanded;
                s1.k<Float> kVar = pVar.f157h;
                tVar2.f197a = null;
                tVar2.f200d = 2;
            } else {
                if (i15 != 2) {
                    if (i15 == 3) {
                        o13.r.b(obj);
                        return Unit.INSTANCE;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        if (this.f152c) {
            vb.h.z("Attempted to animate to slightly expanded when skipSlightlyExpanded was enabled. Set skipIntermediatelyExpanded to false to use this function.");
            return null;
        }
        if (this.f156g) {
            y yVar2 = y.SlightlyExpanded;
            tVar2.f200d = 3;
        } else {
            y yVar3 = y.SlightlyExpanded;
            tVar2.f197a = this;
            tVar2.f200d = 1;
            if (a(this, yVar3, 0.0f, this.f157h, tVar2, 2) != aVar) {
                pVar = this;
                y yVar4 = y.SlightlyExpanded;
                s1.k<Float> kVar2 = pVar.f157h;
                tVar2.f197a = null;
                tVar2.f200d = 2;
            }
        }
        return aVar;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La03/p$a;", "", "<init>", "()V", "flexible-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ p(boolean z14, boolean z15, boolean z16, m mVar, boolean z17, boolean z18, boolean z19, s1.k kVar, y yVar, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, z15, z16, mVar, z17, z18, z19, kVar, (i14 & 256) != 0 ? y.Hidden : yVar, (i14 & 512) != 0 ? new h(1) : lVar);
    }
}
