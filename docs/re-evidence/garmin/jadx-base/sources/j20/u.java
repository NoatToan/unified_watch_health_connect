package j20;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.e f96623b;

    public /* synthetic */ u(com.garmin.android.apps.connectmobile.contacts.emergency.e eVar, int i14) {
        this.f96622a = i14;
        this.f96623b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object[] objArr = 0;
        final int i14 = 2;
        final int i15 = 1;
        switch (this.f96622a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1180749366, new u(this.f96623b, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar2 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    final com.garmin.android.apps.connectmobile.contacts.emergency.e eVar = this.f96623b;
                    boolean zR = mVar2.r(eVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ = new e23.a() { // from class: j20.v
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = objArr2;
                                com.garmin.android.apps.connectmobile.contacts.emergency.e eVar2 = eVar;
                                switch (i16) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar4 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                        if (eVar2.w6().f32658q) {
                                            g22.e.l(eVar2);
                                            eVar2.w6().H4(true, l20.l.EMERGENCY_CONTACT);
                                        } else {
                                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW6 = eVar2.w6();
                                            l20.l lVar = l20.l.EMERGENCY_CONTACT;
                                            lVar.getClass();
                                            dVarW6.N4(lVar);
                                            dVarW6.E.j("SendNewRequestFragment");
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar5 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                        if (eVar2.w6().f32658q) {
                                            g22.e.l(eVar2);
                                            eVar2.w6().H4(true, l20.l.LIVETRACK);
                                        } else {
                                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW7 = eVar2.w6();
                                            l20.l lVar2 = l20.l.LIVETRACK;
                                            lVar2.getClass();
                                            dVarW7.N4(lVar2);
                                            dVarW7.E.j("SendNewRequestFragment");
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar6 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                        if (eVar2.w6().f32651j) {
                                            eVar2.w6().O4();
                                            if (eVar2.w6().C4()) {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW8 = eVar2.w6();
                                                dVarW8.f32649h = false;
                                                y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var = dVarW8.f32652k;
                                                g3.a aVar7 = g3.f35298f;
                                                o13.u uVar = new o13.u(dVarW8.f32646e, dVarW8.f32647f, Boolean.TRUE);
                                                aVar7.getClass();
                                                y0Var.j(g3.a.d(uVar));
                                            } else {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW9 = eVar2.w6();
                                                dVarW9.f32649h = false;
                                                dVarW9.E.j("SendMultipleSMSRequestFragment");
                                            }
                                        } else {
                                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW10 = eVar2.w6();
                                            dVarW10.f32649h = false;
                                            y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var2 = dVarW10.f32652k;
                                            g3.a aVar8 = g3.f35298f;
                                            o13.u uVar2 = new o13.u(dVarW10.f32646e, dVarW10.f32647f, Boolean.TRUE);
                                            aVar8.getClass();
                                            y0Var2.j(g3.a.d(uVar2));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: j20.v
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = objArr3;
                                    com.garmin.android.apps.connectmobile.contacts.emergency.e eVar2 = eVar;
                                    switch (i16) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar4 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                            if (eVar2.w6().f32658q) {
                                                g22.e.l(eVar2);
                                                eVar2.w6().H4(true, l20.l.EMERGENCY_CONTACT);
                                            } else {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW6 = eVar2.w6();
                                                l20.l lVar = l20.l.EMERGENCY_CONTACT;
                                                lVar.getClass();
                                                dVarW6.N4(lVar);
                                                dVarW6.E.j("SendNewRequestFragment");
                                            }
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar5 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                            if (eVar2.w6().f32658q) {
                                                g22.e.l(eVar2);
                                                eVar2.w6().H4(true, l20.l.LIVETRACK);
                                            } else {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW7 = eVar2.w6();
                                                l20.l lVar2 = l20.l.LIVETRACK;
                                                lVar2.getClass();
                                                dVarW7.N4(lVar2);
                                                dVarW7.E.j("SendNewRequestFragment");
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar6 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                            if (eVar2.w6().f32651j) {
                                                eVar2.w6().O4();
                                                if (eVar2.w6().C4()) {
                                                    com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW8 = eVar2.w6();
                                                    dVarW8.f32649h = false;
                                                    y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var = dVarW8.f32652k;
                                                    g3.a aVar7 = g3.f35298f;
                                                    o13.u uVar = new o13.u(dVarW8.f32646e, dVarW8.f32647f, Boolean.TRUE);
                                                    aVar7.getClass();
                                                    y0Var.j(g3.a.d(uVar));
                                                } else {
                                                    com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW9 = eVar2.w6();
                                                    dVarW9.f32649h = false;
                                                    dVarW9.E.j("SendMultipleSMSRequestFragment");
                                                }
                                            } else {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW10 = eVar2.w6();
                                                dVarW10.f32649h = false;
                                                y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var2 = dVarW10.f32652k;
                                                g3.a aVar8 = g3.f35298f;
                                                o13.u uVar2 = new o13.u(dVarW10.f32646e, dVarW10.f32647f, Boolean.TRUE);
                                                aVar8.getClass();
                                                y0Var2.j(g3.a.d(uVar2));
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    e23.a<Unit> aVar4 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(eVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: j20.v
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = i15;
                                com.garmin.android.apps.connectmobile.contacts.emergency.e eVar2 = eVar;
                                switch (i16) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar5 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                        if (eVar2.w6().f32658q) {
                                            g22.e.l(eVar2);
                                            eVar2.w6().H4(true, l20.l.EMERGENCY_CONTACT);
                                        } else {
                                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW6 = eVar2.w6();
                                            l20.l lVar = l20.l.EMERGENCY_CONTACT;
                                            lVar.getClass();
                                            dVarW6.N4(lVar);
                                            dVarW6.E.j("SendNewRequestFragment");
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar6 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                        if (eVar2.w6().f32658q) {
                                            g22.e.l(eVar2);
                                            eVar2.w6().H4(true, l20.l.LIVETRACK);
                                        } else {
                                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW7 = eVar2.w6();
                                            l20.l lVar2 = l20.l.LIVETRACK;
                                            lVar2.getClass();
                                            dVarW7.N4(lVar2);
                                            dVarW7.E.j("SendNewRequestFragment");
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar7 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                        if (eVar2.w6().f32651j) {
                                            eVar2.w6().O4();
                                            if (eVar2.w6().C4()) {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW8 = eVar2.w6();
                                                dVarW8.f32649h = false;
                                                y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var = dVarW8.f32652k;
                                                g3.a aVar8 = g3.f35298f;
                                                o13.u uVar = new o13.u(dVarW8.f32646e, dVarW8.f32647f, Boolean.TRUE);
                                                aVar8.getClass();
                                                y0Var.j(g3.a.d(uVar));
                                            } else {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW9 = eVar2.w6();
                                                dVarW9.f32649h = false;
                                                dVarW9.E.j("SendMultipleSMSRequestFragment");
                                            }
                                        } else {
                                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW10 = eVar2.w6();
                                            dVarW10.f32649h = false;
                                            y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var2 = dVarW10.f32652k;
                                            g3.a aVar9 = g3.f35298f;
                                            o13.u uVar2 = new o13.u(dVarW10.f32646e, dVarW10.f32647f, Boolean.TRUE);
                                            aVar9.getClass();
                                            y0Var2.j(g3.a.d(uVar2));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: j20.v
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = i15;
                                    com.garmin.android.apps.connectmobile.contacts.emergency.e eVar2 = eVar;
                                    switch (i16) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar5 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                            if (eVar2.w6().f32658q) {
                                                g22.e.l(eVar2);
                                                eVar2.w6().H4(true, l20.l.EMERGENCY_CONTACT);
                                            } else {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW6 = eVar2.w6();
                                                l20.l lVar = l20.l.EMERGENCY_CONTACT;
                                                lVar.getClass();
                                                dVarW6.N4(lVar);
                                                dVarW6.E.j("SendNewRequestFragment");
                                            }
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar6 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                            if (eVar2.w6().f32658q) {
                                                g22.e.l(eVar2);
                                                eVar2.w6().H4(true, l20.l.LIVETRACK);
                                            } else {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW7 = eVar2.w6();
                                                l20.l lVar2 = l20.l.LIVETRACK;
                                                lVar2.getClass();
                                                dVarW7.N4(lVar2);
                                                dVarW7.E.j("SendNewRequestFragment");
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar7 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                            if (eVar2.w6().f32651j) {
                                                eVar2.w6().O4();
                                                if (eVar2.w6().C4()) {
                                                    com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW8 = eVar2.w6();
                                                    dVarW8.f32649h = false;
                                                    y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var = dVarW8.f32652k;
                                                    g3.a aVar8 = g3.f35298f;
                                                    o13.u uVar = new o13.u(dVarW8.f32646e, dVarW8.f32647f, Boolean.TRUE);
                                                    aVar8.getClass();
                                                    y0Var.j(g3.a.d(uVar));
                                                } else {
                                                    com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW9 = eVar2.w6();
                                                    dVarW9.f32649h = false;
                                                    dVarW9.E.j("SendMultipleSMSRequestFragment");
                                                }
                                            } else {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW10 = eVar2.w6();
                                                dVarW10.f32649h = false;
                                                y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var2 = dVarW10.f32652k;
                                                g3.a aVar9 = g3.f35298f;
                                                o13.u uVar2 = new o13.u(dVarW10.f32646e, dVarW10.f32647f, Boolean.TRUE);
                                                aVar9.getClass();
                                                y0Var2.j(g3.a.d(uVar2));
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a<Unit> aVar5 = (e23.a) objQ2;
                    boolean zR3 = mVar2.r(eVar);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: j20.v
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = i14;
                                com.garmin.android.apps.connectmobile.contacts.emergency.e eVar2 = eVar;
                                switch (i16) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar6 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                        if (eVar2.w6().f32658q) {
                                            g22.e.l(eVar2);
                                            eVar2.w6().H4(true, l20.l.EMERGENCY_CONTACT);
                                        } else {
                                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW6 = eVar2.w6();
                                            l20.l lVar = l20.l.EMERGENCY_CONTACT;
                                            lVar.getClass();
                                            dVarW6.N4(lVar);
                                            dVarW6.E.j("SendNewRequestFragment");
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar7 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                        if (eVar2.w6().f32658q) {
                                            g22.e.l(eVar2);
                                            eVar2.w6().H4(true, l20.l.LIVETRACK);
                                        } else {
                                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW7 = eVar2.w6();
                                            l20.l lVar2 = l20.l.LIVETRACK;
                                            lVar2.getClass();
                                            dVarW7.N4(lVar2);
                                            dVarW7.E.j("SendNewRequestFragment");
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar8 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                        if (eVar2.w6().f32651j) {
                                            eVar2.w6().O4();
                                            if (eVar2.w6().C4()) {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW8 = eVar2.w6();
                                                dVarW8.f32649h = false;
                                                y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var = dVarW8.f32652k;
                                                g3.a aVar9 = g3.f35298f;
                                                o13.u uVar = new o13.u(dVarW8.f32646e, dVarW8.f32647f, Boolean.TRUE);
                                                aVar9.getClass();
                                                y0Var.j(g3.a.d(uVar));
                                            } else {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW9 = eVar2.w6();
                                                dVarW9.f32649h = false;
                                                dVarW9.E.j("SendMultipleSMSRequestFragment");
                                            }
                                        } else {
                                            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW10 = eVar2.w6();
                                            dVarW10.f32649h = false;
                                            y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var2 = dVarW10.f32652k;
                                            g3.a aVar10 = g3.f35298f;
                                            o13.u uVar2 = new o13.u(dVarW10.f32646e, dVarW10.f32647f, Boolean.TRUE);
                                            aVar10.getClass();
                                            y0Var2.j(g3.a.d(uVar2));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: j20.v
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = i14;
                                    com.garmin.android.apps.connectmobile.contacts.emergency.e eVar2 = eVar;
                                    switch (i16) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar6 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                            if (eVar2.w6().f32658q) {
                                                g22.e.l(eVar2);
                                                eVar2.w6().H4(true, l20.l.EMERGENCY_CONTACT);
                                            } else {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW6 = eVar2.w6();
                                                l20.l lVar = l20.l.EMERGENCY_CONTACT;
                                                lVar.getClass();
                                                dVarW6.N4(lVar);
                                                dVarW6.E.j("SendNewRequestFragment");
                                            }
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar7 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                            if (eVar2.w6().f32658q) {
                                                g22.e.l(eVar2);
                                                eVar2.w6().H4(true, l20.l.LIVETRACK);
                                            } else {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW7 = eVar2.w6();
                                                l20.l lVar2 = l20.l.LIVETRACK;
                                                lVar2.getClass();
                                                dVarW7.N4(lVar2);
                                                dVarW7.E.j("SendNewRequestFragment");
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar8 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                            if (eVar2.w6().f32651j) {
                                                eVar2.w6().O4();
                                                if (eVar2.w6().C4()) {
                                                    com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW8 = eVar2.w6();
                                                    dVarW8.f32649h = false;
                                                    y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var = dVarW8.f32652k;
                                                    g3.a aVar9 = g3.f35298f;
                                                    o13.u uVar = new o13.u(dVarW8.f32646e, dVarW8.f32647f, Boolean.TRUE);
                                                    aVar9.getClass();
                                                    y0Var.j(g3.a.d(uVar));
                                                } else {
                                                    com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW9 = eVar2.w6();
                                                    dVarW9.f32649h = false;
                                                    dVarW9.E.j("SendMultipleSMSRequestFragment");
                                                }
                                            } else {
                                                com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW10 = eVar2.w6();
                                                dVarW10.f32649h = false;
                                                y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var2 = dVarW10.f32652k;
                                                g3.a aVar10 = g3.f35298f;
                                                o13.u uVar2 = new o13.u(dVarW10.f32646e, dVarW10.f32647f, Boolean.TRUE);
                                                aVar10.getClass();
                                                y0Var2.j(g3.a.d(uVar2));
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    eVar.u6(aVar4, aVar5, (e23.a) objQ3, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
