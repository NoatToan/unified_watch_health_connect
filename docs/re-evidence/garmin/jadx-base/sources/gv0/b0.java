package gv0;

import android.app.Activity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79168a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f79169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pu0.b f79170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl.a f79171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f79172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f79173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wd2.a f79174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Activity f79175h;

    public /* synthetic */ b0(y yVar, hl.a aVar, pu0.b bVar, d dVar, e23.l lVar, wd2.a aVar2, Activity activity) {
        this.f79169b = yVar;
        this.f79171d = aVar;
        this.f79170c = bVar;
        this.f79172e = dVar;
        this.f79173f = lVar;
        this.f79174g = aVar2;
        this.f79175h = activity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f79168a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    hl.a.c cVar = (hl.a.c) this.f79171d;
                    final d dVar = this.f79172e;
                    boolean zR = mVar.r(dVar);
                    final e23.l lVar = this.f79173f;
                    boolean zB = zR | mVar.B(lVar);
                    final wd2.a aVar2 = this.f79174g;
                    boolean zR2 = zB | mVar.r(aVar2);
                    final Activity activity = this.f79175h;
                    boolean zR3 = zR2 | mVar.r(activity);
                    Object objQ = mVar.q();
                    if (zR3) {
                        final int i15 = 1;
                        e23.p pVar = new e23.p() { // from class: gv0.c0
                            @Override // e23.p
                            public final Object invoke(Object obj4, Object obj5) {
                                pu0.b bVar = (pu0.b) obj4;
                                y yVar = (y) obj5;
                                switch (i15) {
                                    case 0:
                                        yVar.getClass();
                                        if (bVar != null) {
                                            int i16 = j0.a.f79300a[yVar.ordinal()];
                                            if (i16 == 1) {
                                                dVar.A4(bVar);
                                            } else if (i16 == 2) {
                                                String str = bVar.f141183a;
                                                if (str != null) {
                                                    lVar.invoke(str);
                                                }
                                            } else {
                                                if (i16 != 3) {
                                                    lc.u0.r();
                                                    return null;
                                                }
                                                aVar2.a(activity);
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        yVar.getClass();
                                        if (bVar != null) {
                                            int i17 = j0.a.f79300a[yVar.ordinal()];
                                            if (i17 == 1) {
                                                dVar.A4(bVar);
                                            } else if (i17 == 2) {
                                                String str2 = bVar.f141183a;
                                                if (str2 != null) {
                                                    lVar.invoke(str2);
                                                }
                                            } else {
                                                if (i17 != 3) {
                                                    lc.u0.r();
                                                    return null;
                                                }
                                                aVar2.a(activity);
                                            }
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar.K(pVar);
                        objQ = pVar;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int i16 = 1;
                            e23.p pVar2 = new e23.p() { // from class: gv0.c0
                                @Override // e23.p
                                public final Object invoke(Object obj4, Object obj5) {
                                    pu0.b bVar = (pu0.b) obj4;
                                    y yVar = (y) obj5;
                                    switch (i16) {
                                        case 0:
                                            yVar.getClass();
                                            if (bVar != null) {
                                                int i17 = j0.a.f79300a[yVar.ordinal()];
                                                if (i17 == 1) {
                                                    dVar.A4(bVar);
                                                } else if (i17 == 2) {
                                                    String str = bVar.f141183a;
                                                    if (str != null) {
                                                        lVar.invoke(str);
                                                    }
                                                } else {
                                                    if (i17 != 3) {
                                                        lc.u0.r();
                                                        return null;
                                                    }
                                                    aVar2.a(activity);
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            yVar.getClass();
                                            if (bVar != null) {
                                                int i18 = j0.a.f79300a[yVar.ordinal()];
                                                if (i18 == 1) {
                                                    dVar.A4(bVar);
                                                } else if (i18 == 2) {
                                                    String str2 = bVar.f141183a;
                                                    if (str2 != null) {
                                                        lVar.invoke(str2);
                                                    }
                                                } else {
                                                    if (i18 != 3) {
                                                        lc.u0.r();
                                                        return null;
                                                    }
                                                    aVar2.a(activity);
                                                }
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar.K(pVar2);
                            objQ = pVar2;
                        }
                    }
                    hl.a.Companion companion = hl.a.INSTANCE;
                    j0.b(this.f79169b, this.f79170c, cVar, (e23.p) objQ, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    final d dVar2 = this.f79172e;
                    boolean zR4 = mVar2.r(dVar2);
                    final e23.l lVar2 = this.f79173f;
                    boolean zB2 = zR4 | mVar2.B(lVar2);
                    final wd2.a aVar3 = this.f79174g;
                    boolean zR5 = zB2 | mVar2.r(aVar3);
                    final Activity activity2 = this.f79175h;
                    boolean zR6 = zR5 | mVar2.r(activity2);
                    Object objQ2 = mVar2.q();
                    if (zR6) {
                        final int i17 = 0;
                        objQ2 = new e23.p() { // from class: gv0.c0
                            @Override // e23.p
                            public final Object invoke(Object obj4, Object obj5) {
                                pu0.b bVar = (pu0.b) obj4;
                                y yVar = (y) obj5;
                                switch (i17) {
                                    case 0:
                                        yVar.getClass();
                                        if (bVar != null) {
                                            int i18 = j0.a.f79300a[yVar.ordinal()];
                                            if (i18 == 1) {
                                                dVar2.A4(bVar);
                                            } else if (i18 == 2) {
                                                String str = bVar.f141183a;
                                                if (str != null) {
                                                    lVar2.invoke(str);
                                                }
                                            } else {
                                                if (i18 != 3) {
                                                    lc.u0.r();
                                                    return null;
                                                }
                                                aVar3.a(activity2);
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        yVar.getClass();
                                        if (bVar != null) {
                                            int i19 = j0.a.f79300a[yVar.ordinal()];
                                            if (i19 == 1) {
                                                dVar2.A4(bVar);
                                            } else if (i19 == 2) {
                                                String str2 = bVar.f141183a;
                                                if (str2 != null) {
                                                    lVar2.invoke(str2);
                                                }
                                            } else {
                                                if (i19 != 3) {
                                                    lc.u0.r();
                                                    return null;
                                                }
                                                aVar3.a(activity2);
                                            }
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            final int i18 = 0;
                            objQ2 = new e23.p() { // from class: gv0.c0
                                @Override // e23.p
                                public final Object invoke(Object obj4, Object obj5) {
                                    pu0.b bVar = (pu0.b) obj4;
                                    y yVar = (y) obj5;
                                    switch (i18) {
                                        case 0:
                                            yVar.getClass();
                                            if (bVar != null) {
                                                int i19 = j0.a.f79300a[yVar.ordinal()];
                                                if (i19 == 1) {
                                                    dVar2.A4(bVar);
                                                } else if (i19 == 2) {
                                                    String str = bVar.f141183a;
                                                    if (str != null) {
                                                        lVar2.invoke(str);
                                                    }
                                                } else {
                                                    if (i19 != 3) {
                                                        lc.u0.r();
                                                        return null;
                                                    }
                                                    aVar3.a(activity2);
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            yVar.getClass();
                                            if (bVar != null) {
                                                int i110 = j0.a.f79300a[yVar.ordinal()];
                                                if (i110 == 1) {
                                                    dVar2.A4(bVar);
                                                } else if (i110 == 2) {
                                                    String str2 = bVar.f141183a;
                                                    if (str2 != null) {
                                                        lVar2.invoke(str2);
                                                    }
                                                } else {
                                                    if (i110 != 3) {
                                                        lc.u0.r();
                                                        return null;
                                                    }
                                                    aVar3.a(activity2);
                                                }
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    hl.a.Companion companion2 = hl.a.INSTANCE;
                    j0.b(this.f79169b, this.f79170c, this.f79171d, (e23.p) objQ2, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b0(y yVar, pu0.b bVar, hl.a aVar, d dVar, e23.l lVar, wd2.a aVar2, Activity activity) {
        this.f79169b = yVar;
        this.f79170c = bVar;
        this.f79171d = aVar;
        this.f79172e = dVar;
        this.f79173f = lVar;
        this.f79174g = aVar2;
        this.f79175h = activity;
    }
}
