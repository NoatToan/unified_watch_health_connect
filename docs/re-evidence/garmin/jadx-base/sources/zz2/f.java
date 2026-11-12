package zz2;

import a03.r0;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;
import zo1.y0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207665a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a03.p f207666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f207667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f207668d;

    public /* synthetic */ f(a03.p pVar, e23.a aVar, o53.b0 b0Var) {
        this.f207666b = pVar;
        this.f207667c = aVar;
        this.f207668d = b0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f207665a) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                o53.b0 b0Var = this.f207668d;
                b0Var.getClass();
                e23.a aVar = this.f207667c;
                aVar.getClass();
                a03.p pVar = this.f207666b;
                ge1.b.T(b0Var, null, null, new b0(pVar, fFloatValue, null), 3).J(new h(pVar, aVar, 1));
                break;
            default:
                k0 k0Var = (k0) obj;
                e23.a aVar2 = this.f207667c;
                aVar2.getClass();
                final o53.b0 b0Var2 = this.f207668d;
                b0Var2.getClass();
                k0Var.getClass();
                h0.c(k0Var, "Dismiss bottom sheet", new y0(aVar2, 12));
                final a03.p pVar2 = this.f207666b;
                a03.y yVarC = pVar2.c();
                r0<a03.y> r0Var = pVar2.f158i;
                a03.y yVar = a03.y.IntermediatelyExpanded;
                if (yVarC == yVar) {
                    final int i14 = 0;
                    h0.d(k0Var, "expand bottom sheet", new e23.a() { // from class: zz2.p
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    a03.p pVar3 = pVar2;
                                    pVar3.getClass();
                                    o53.b0 b0Var3 = b0Var2;
                                    b0Var3.getClass();
                                    if (pVar3.f158i.f171b.invoke(a03.y.FullyExpanded).booleanValue()) {
                                        ge1.b.T(b0Var3, null, null, new q(pVar3, null), 3);
                                    }
                                    break;
                                case 1:
                                    a03.p pVar4 = pVar2;
                                    pVar4.getClass();
                                    o53.b0 b0Var4 = b0Var2;
                                    b0Var4.getClass();
                                    if (pVar4.f158i.f171b.invoke(a03.y.IntermediatelyExpanded).booleanValue()) {
                                        ge1.b.T(b0Var4, null, null, new r(pVar4, null), 3);
                                    }
                                    break;
                                case 2:
                                    a03.p pVar5 = pVar2;
                                    pVar5.getClass();
                                    o53.b0 b0Var5 = b0Var2;
                                    b0Var5.getClass();
                                    if (pVar5.f158i.f171b.invoke(a03.y.IntermediatelyExpanded).booleanValue()) {
                                        ge1.b.T(b0Var5, null, null, new s(pVar5, null), 3);
                                    }
                                    break;
                                default:
                                    a03.p pVar6 = pVar2;
                                    pVar6.getClass();
                                    o53.b0 b0Var6 = b0Var2;
                                    b0Var6.getClass();
                                    if (pVar6.f158i.f171b.invoke(a03.y.SlightlyExpanded).booleanValue()) {
                                        ge1.b.T(b0Var6, null, null, new t(pVar6, null), 3);
                                    }
                                    break;
                            }
                            return Boolean.TRUE;
                        }
                    });
                } else {
                    a03.y yVarC2 = pVar2.c();
                    a03.y yVar2 = a03.y.SlightlyExpanded;
                    if (yVarC2 == yVar2) {
                        final int i15 = 1;
                        h0.d(k0Var, "expand bottom sheet", new e23.a() { // from class: zz2.p
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        a03.p pVar3 = pVar2;
                                        pVar3.getClass();
                                        o53.b0 b0Var3 = b0Var2;
                                        b0Var3.getClass();
                                        if (pVar3.f158i.f171b.invoke(a03.y.FullyExpanded).booleanValue()) {
                                            ge1.b.T(b0Var3, null, null, new q(pVar3, null), 3);
                                        }
                                        break;
                                    case 1:
                                        a03.p pVar4 = pVar2;
                                        pVar4.getClass();
                                        o53.b0 b0Var4 = b0Var2;
                                        b0Var4.getClass();
                                        if (pVar4.f158i.f171b.invoke(a03.y.IntermediatelyExpanded).booleanValue()) {
                                            ge1.b.T(b0Var4, null, null, new r(pVar4, null), 3);
                                        }
                                        break;
                                    case 2:
                                        a03.p pVar5 = pVar2;
                                        pVar5.getClass();
                                        o53.b0 b0Var5 = b0Var2;
                                        b0Var5.getClass();
                                        if (pVar5.f158i.f171b.invoke(a03.y.IntermediatelyExpanded).booleanValue()) {
                                            ge1.b.T(b0Var5, null, null, new s(pVar5, null), 3);
                                        }
                                        break;
                                    default:
                                        a03.p pVar6 = pVar2;
                                        pVar6.getClass();
                                        o53.b0 b0Var6 = b0Var2;
                                        b0Var6.getClass();
                                        if (pVar6.f158i.f171b.invoke(a03.y.SlightlyExpanded).booleanValue()) {
                                            ge1.b.T(b0Var6, null, null, new t(pVar6, null), 3);
                                        }
                                        break;
                                }
                                return Boolean.TRUE;
                            }
                        });
                    } else if (r0Var.d().containsKey(yVar)) {
                        final int i16 = 2;
                        h0.a(k0Var, "Collapse bottom sheet", new e23.a() { // from class: zz2.p
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        a03.p pVar3 = pVar2;
                                        pVar3.getClass();
                                        o53.b0 b0Var3 = b0Var2;
                                        b0Var3.getClass();
                                        if (pVar3.f158i.f171b.invoke(a03.y.FullyExpanded).booleanValue()) {
                                            ge1.b.T(b0Var3, null, null, new q(pVar3, null), 3);
                                        }
                                        break;
                                    case 1:
                                        a03.p pVar4 = pVar2;
                                        pVar4.getClass();
                                        o53.b0 b0Var4 = b0Var2;
                                        b0Var4.getClass();
                                        if (pVar4.f158i.f171b.invoke(a03.y.IntermediatelyExpanded).booleanValue()) {
                                            ge1.b.T(b0Var4, null, null, new r(pVar4, null), 3);
                                        }
                                        break;
                                    case 2:
                                        a03.p pVar5 = pVar2;
                                        pVar5.getClass();
                                        o53.b0 b0Var5 = b0Var2;
                                        b0Var5.getClass();
                                        if (pVar5.f158i.f171b.invoke(a03.y.IntermediatelyExpanded).booleanValue()) {
                                            ge1.b.T(b0Var5, null, null, new s(pVar5, null), 3);
                                        }
                                        break;
                                    default:
                                        a03.p pVar6 = pVar2;
                                        pVar6.getClass();
                                        o53.b0 b0Var6 = b0Var2;
                                        b0Var6.getClass();
                                        if (pVar6.f158i.f171b.invoke(a03.y.SlightlyExpanded).booleanValue()) {
                                            ge1.b.T(b0Var6, null, null, new t(pVar6, null), 3);
                                        }
                                        break;
                                }
                                return Boolean.TRUE;
                            }
                        });
                    } else if (r0Var.d().containsKey(yVar2)) {
                        final int i17 = 3;
                        h0.a(k0Var, "Collapse bottom sheet", new e23.a() { // from class: zz2.p
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        a03.p pVar3 = pVar2;
                                        pVar3.getClass();
                                        o53.b0 b0Var3 = b0Var2;
                                        b0Var3.getClass();
                                        if (pVar3.f158i.f171b.invoke(a03.y.FullyExpanded).booleanValue()) {
                                            ge1.b.T(b0Var3, null, null, new q(pVar3, null), 3);
                                        }
                                        break;
                                    case 1:
                                        a03.p pVar4 = pVar2;
                                        pVar4.getClass();
                                        o53.b0 b0Var4 = b0Var2;
                                        b0Var4.getClass();
                                        if (pVar4.f158i.f171b.invoke(a03.y.IntermediatelyExpanded).booleanValue()) {
                                            ge1.b.T(b0Var4, null, null, new r(pVar4, null), 3);
                                        }
                                        break;
                                    case 2:
                                        a03.p pVar5 = pVar2;
                                        pVar5.getClass();
                                        o53.b0 b0Var5 = b0Var2;
                                        b0Var5.getClass();
                                        if (pVar5.f158i.f171b.invoke(a03.y.IntermediatelyExpanded).booleanValue()) {
                                            ge1.b.T(b0Var5, null, null, new s(pVar5, null), 3);
                                        }
                                        break;
                                    default:
                                        a03.p pVar6 = pVar2;
                                        pVar6.getClass();
                                        o53.b0 b0Var6 = b0Var2;
                                        b0Var6.getClass();
                                        if (pVar6.f158i.f171b.invoke(a03.y.SlightlyExpanded).booleanValue()) {
                                            ge1.b.T(b0Var6, null, null, new t(pVar6, null), 3);
                                        }
                                        break;
                                }
                                return Boolean.TRUE;
                            }
                        });
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(o53.b0 b0Var, a03.p pVar, e23.a aVar) {
        this.f207668d = b0Var;
        this.f207666b = pVar;
        this.f207667c = aVar;
    }
}
