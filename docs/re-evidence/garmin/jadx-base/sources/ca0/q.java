package ca0;

import b21.d7;
import com.garmin.proto.generated.GDISimpleSetup;
import com.garmin.proto.generated.WifiSetup;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f26423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f26424d;

    public /* synthetic */ q(lc.m0 m0Var, e23.a aVar, e23.a aVar2, int i14) {
        this.f26421a = i14;
        this.f26422b = m0Var;
        this.f26423c = aVar;
        this.f26424d = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0076  */
    /* JADX WARN: Code duplicated, block: B:17:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:24:0x0125  */
    /* JADX WARN: Code duplicated, block: B:29:0x0143  */
    /* JADX WARN: Code duplicated, block: B:36:0x018e  */
    /* JADX WARN: Code duplicated, block: B:43:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x0203  */
    /* JADX WARN: Code duplicated, block: B:55:0x0246  */
    /* JADX WARN: Code duplicated, block: B:62:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:67:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x0318  */
    /* JADX WARN: Code duplicated, block: B:79:0x033b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0358  */
    /* JADX WARN: Code duplicated, block: B:91:0x039d  */
    /* JADX WARN: Code duplicated, block: B:98:0x03dc  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        int i14 = this.f26421a;
        final int i15 = 1;
        int i16 = 21;
        e23.a aVar = this.f26423c;
        final int i17 = 0;
        final lc.m0 m0Var = this.f26422b;
        p3.m.a aVar2 = p3.m.f135153a;
        e23.a aVar3 = this.f26424d;
        switch (i14) {
            case 0:
                lc.v vVar = (lc.v) obj2;
                p3.m mVar = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar);
                p3.x1 x1Var = p3.n.f135158a;
                final ja0.a aVarA = h0.a(vVar, aVar3, m0Var, mVar);
                boolean zR = mVar.r(m0Var) | mVar.r(aVarA);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new e23.l() { // from class: ca0.v
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            la0.b bVar = (la0.b) obj5;
                            switch (i17) {
                                case 0:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA.z4(i0.u.INSTANCE, bVar));
                                    break;
                                case 1:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA.z4(i0.l.INSTANCE, bVar));
                                    break;
                                case 2:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA.z4(i0.d.INSTANCE, bVar));
                                    break;
                                default:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA.z4(i0.j.INSTANCE, bVar));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e23.l() { // from class: ca0.v
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                la0.b bVar = (la0.b) obj5;
                                switch (i17) {
                                    case 0:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA.z4(i0.u.INSTANCE, bVar));
                                        break;
                                    case 1:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA.z4(i0.l.INSTANCE, bVar));
                                        break;
                                    case 2:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA.z4(i0.d.INSTANCE, bVar));
                                        break;
                                    default:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA.z4(i0.j.INSTANCE, bVar));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    }
                }
                ma0.g.a(aVar, (e23.l) objQ, mVar, 0);
                break;
            case 1:
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar2);
                p3.x1 x1Var2 = p3.n.f135158a;
                final ja0.a aVarA2 = h0.a(vVar2, aVar3, m0Var, mVar2);
                boolean zR2 = mVar2.r(m0Var) | mVar2.r(aVarA2);
                Object objQ2 = mVar2.q();
                if (zR2) {
                    objQ2 = new e23.a() { // from class: ca0.t
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    lc.y.l(m0Var, aVarA2.z4(i0.v.INSTANCE, la0.b.CONFIRM));
                                    break;
                                default:
                                    lc.y.l(m0Var, aVarA2.z4(i0.e.INSTANCE, la0.b.CONFIRM));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new e23.a() { // from class: ca0.t
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        lc.y.l(m0Var, aVarA2.z4(i0.v.INSTANCE, la0.b.CONFIRM));
                                        break;
                                    default:
                                        lc.y.l(m0Var, aVarA2.z4(i0.e.INSTANCE, la0.b.CONFIRM));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    }
                }
                ma0.e.a((e23.a) objQ2, aVar, mVar2, 0);
                break;
            case 2:
                lc.v vVar3 = (lc.v) obj2;
                p3.m mVar3 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar3.getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                final ja0.a aVarA3 = h0.a(vVar3, aVar3, m0Var, mVar3);
                List<j90.n> list = ((la0.a) s9.c.c(aVarA3.f98058i, mVar3).getF182175a()).f111612e;
                boolean zR3 = mVar3.r(aVarA3);
                Object objQ3 = mVar3.q();
                if (zR3) {
                    objQ3 = new c0(aVarA3);
                    mVar3.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new c0(aVarA3);
                        mVar3.K(objQ3);
                    }
                }
                e23.p pVar = (e23.p) ((k23.g) objQ3);
                boolean zR4 = mVar3.r(m0Var) | mVar3.r(aVarA3);
                Object objQ4 = mVar3.q();
                if (zR4) {
                    final int i18 = 3;
                    objQ4 = new e23.l() { // from class: ca0.v
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            la0.b bVar = (la0.b) obj5;
                            switch (i18) {
                                case 0:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA3.z4(i0.u.INSTANCE, bVar));
                                    break;
                                case 1:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA3.z4(i0.l.INSTANCE, bVar));
                                    break;
                                case 2:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA3.z4(i0.d.INSTANCE, bVar));
                                    break;
                                default:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA3.z4(i0.j.INSTANCE, bVar));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar3.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        final int i19 = 3;
                        objQ4 = new e23.l() { // from class: ca0.v
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                la0.b bVar = (la0.b) obj5;
                                switch (i19) {
                                    case 0:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA3.z4(i0.u.INSTANCE, bVar));
                                        break;
                                    case 1:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA3.z4(i0.l.INSTANCE, bVar));
                                        break;
                                    case 2:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA3.z4(i0.d.INSTANCE, bVar));
                                        break;
                                    default:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA3.z4(i0.j.INSTANCE, bVar));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ4);
                    }
                }
                e23.l lVar = (e23.l) objQ4;
                boolean zR5 = mVar3.r(m0Var);
                Object objQ5 = mVar3.q();
                if (zR5) {
                    objQ5 = new aa2.m(m0Var, 19);
                    mVar3.K(objQ5);
                } else {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new aa2.m(m0Var, 19);
                        mVar3.K(objQ5);
                    }
                }
                ka0.f.b(list, pVar, lVar, (e23.a) objQ5, this.f26423c, mVar3, 0);
                break;
            case 3:
                lc.v vVar4 = (lc.v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar4.getClass();
                p3.x1 x1Var4 = p3.n.f135158a;
                final ja0.a aVarA4 = h0.a(vVar4, aVar3, m0Var, mVar4);
                p3.p1 p1VarC = s9.c.c(aVarA4.f98056g, mVar4);
                long j8 = ((la0.a) s9.c.c(aVarA4.f98058i, mVar4).getF182175a()).f111610c;
                List list2 = (List) p1VarC.getF182175a();
                boolean zR6 = mVar4.r(aVarA4);
                Object objQ6 = mVar4.q();
                if (zR6) {
                    objQ6 = new d0(aVarA4);
                    mVar4.K(objQ6);
                } else {
                    aVar2.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new d0(aVarA4);
                        mVar4.K(objQ6);
                    }
                }
                e23.l lVar2 = (e23.l) ((k23.g) objQ6);
                boolean zR7 = mVar4.r(m0Var) | mVar4.r(aVarA4);
                Object objQ7 = mVar4.q();
                if (zR7) {
                    final int i24 = 2;
                    objQ7 = new e23.l() { // from class: ca0.v
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            la0.b bVar = (la0.b) obj5;
                            switch (i24) {
                                case 0:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA4.z4(i0.u.INSTANCE, bVar));
                                    break;
                                case 1:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA4.z4(i0.l.INSTANCE, bVar));
                                    break;
                                case 2:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA4.z4(i0.d.INSTANCE, bVar));
                                    break;
                                default:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA4.z4(i0.j.INSTANCE, bVar));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar4.K(objQ7);
                } else {
                    aVar2.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        final int i25 = 2;
                        objQ7 = new e23.l() { // from class: ca0.v
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                la0.b bVar = (la0.b) obj5;
                                switch (i25) {
                                    case 0:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA4.z4(i0.u.INSTANCE, bVar));
                                        break;
                                    case 1:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA4.z4(i0.l.INSTANCE, bVar));
                                        break;
                                    case 2:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA4.z4(i0.d.INSTANCE, bVar));
                                        break;
                                    default:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA4.z4(i0.j.INSTANCE, bVar));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(objQ7);
                    }
                }
                ka0.a.a(j8, list2, lVar2, (e23.l) objQ7, this.f26423c, mVar4, 0);
                break;
            case 4:
                lc.v vVar5 = (lc.v) obj2;
                p3.m mVar5 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar5);
                p3.x1 x1Var5 = p3.n.f135158a;
                final ja0.a aVarA5 = h0.a(vVar5, aVar3, m0Var, mVar5);
                boolean zR8 = mVar5.r(m0Var) | mVar5.r(aVarA5);
                Object objQ8 = mVar5.q();
                if (zR8) {
                    objQ8 = new e23.a() { // from class: ca0.t
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    lc.y.l(m0Var, aVarA5.z4(i0.v.INSTANCE, la0.b.CONFIRM));
                                    break;
                                default:
                                    lc.y.l(m0Var, aVarA5.z4(i0.e.INSTANCE, la0.b.CONFIRM));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar5.K(objQ8);
                } else {
                    aVar2.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new e23.a() { // from class: ca0.t
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        lc.y.l(m0Var, aVarA5.z4(i0.v.INSTANCE, la0.b.CONFIRM));
                                        break;
                                    default:
                                        lc.y.l(m0Var, aVarA5.z4(i0.e.INSTANCE, la0.b.CONFIRM));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar5.K(objQ8);
                    }
                }
                ka0.b.a((e23.a) objQ8, aVar, mVar5, 0);
                break;
            case 5:
                lc.v vVar6 = (lc.v) obj2;
                p3.m mVar6 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar6.getClass();
                p3.x1 x1Var6 = p3.n.f135158a;
                final ja0.a aVarA6 = h0.a(vVar6, aVar3, m0Var, mVar6);
                List<GDISimpleSetup.SensorType> list3 = ((la0.a) s9.c.c(aVarA6.f98058i, mVar6).getF182175a()).f111611d;
                boolean zR9 = mVar6.r(aVarA6);
                Object objQ9 = mVar6.q();
                if (zR9) {
                    objQ9 = new a0(aVarA6);
                    mVar6.K(objQ9);
                } else {
                    aVar2.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new a0(aVarA6);
                        mVar6.K(objQ9);
                    }
                }
                e23.l lVar3 = (e23.l) ((k23.g) objQ9);
                boolean zR10 = mVar6.r(m0Var) | mVar6.r(aVarA6);
                Object objQ10 = mVar6.q();
                if (zR10) {
                    objQ10 = new e23.l() { // from class: ca0.v
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            la0.b bVar = (la0.b) obj5;
                            switch (i15) {
                                case 0:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA6.z4(i0.u.INSTANCE, bVar));
                                    break;
                                case 1:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA6.z4(i0.l.INSTANCE, bVar));
                                    break;
                                case 2:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA6.z4(i0.d.INSTANCE, bVar));
                                    break;
                                default:
                                    bVar.getClass();
                                    lc.y.l(m0Var, aVarA6.z4(i0.j.INSTANCE, bVar));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar6.K(objQ10);
                } else {
                    aVar2.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new e23.l() { // from class: ca0.v
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                la0.b bVar = (la0.b) obj5;
                                switch (i15) {
                                    case 0:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA6.z4(i0.u.INSTANCE, bVar));
                                        break;
                                    case 1:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA6.z4(i0.l.INSTANCE, bVar));
                                        break;
                                    case 2:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA6.z4(i0.d.INSTANCE, bVar));
                                        break;
                                    default:
                                        bVar.getClass();
                                        lc.y.l(m0Var, aVarA6.z4(i0.j.INSTANCE, bVar));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(objQ10);
                    }
                }
                ma0.a.a(list3, lVar3, (e23.l) objQ10, this.f26423c, mVar6, 0);
                break;
            case 6:
                lc.v vVar7 = (lc.v) obj2;
                p3.m mVar7 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar7);
                p3.x1 x1Var7 = p3.n.f135158a;
                sa0.n nVarA = f4.a(vVar7, aVar3, m0Var, mVar7);
                sa0.n.b bVar = (sa0.n.b) s9.c.c(nVarA.f158213d, mVar7).getF182175a();
                boolean zR11 = mVar7.r(m0Var);
                Object objQ11 = mVar7.q();
                if (zR11) {
                    objQ11 = new u0(m0Var, 21);
                    mVar7.K(objQ11);
                } else {
                    aVar2.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new u0(m0Var, 21);
                        mVar7.K(objQ11);
                    }
                }
                sa0.h.b(bVar, nVarA, (e23.a) objQ11, this.f26423c, mVar7, 0);
                break;
            case 7:
                lc.v vVar8 = (lc.v) obj2;
                p3.m mVar8 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar8.getClass();
                p3.x1 x1Var8 = p3.n.f135158a;
                List<WifiSetup.ScannedAccessPoint> list4 = ((sa0.n.b) s9.c.c(f4.a(vVar8, aVar3, m0Var, mVar8).f158213d, mVar8).getF182175a()).f158219f;
                boolean zR12 = mVar8.r(m0Var);
                Object objQ12 = mVar8.q();
                if (zR12) {
                    objQ12 = new u0(m0Var, 22);
                    mVar8.K(objQ12);
                } else {
                    aVar2.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new u0(m0Var, 22);
                        mVar8.K(objQ12);
                    }
                }
                e23.a aVar4 = (e23.a) objQ12;
                boolean zR13 = mVar8.r(m0Var);
                Object objQ13 = mVar8.q();
                if (zR13) {
                    objQ13 = new d7(m0Var, i16);
                    mVar8.K(objQ13);
                } else {
                    aVar2.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new d7(m0Var, i16);
                        mVar8.K(objQ13);
                    }
                }
                sa0.j.c(list4, aVar4, (e23.l) objQ13, this.f26423c, mVar8, 0);
                break;
            case 8:
                lc.v vVar9 = (lc.v) obj2;
                p3.m mVar9 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar9);
                p3.x1 x1Var9 = p3.n.f135158a;
                sa0.n nVarA2 = f4.a(vVar9, aVar3, m0Var, mVar9);
                p3.p1 p1VarC2 = s9.c.c(nVarA2.f158213d, mVar9);
                String str2 = nVarA2.f158211b.f111524i;
                List<WifiSetup.SecurityType> list5 = ((sa0.n.b) p1VarC2.getF182175a()).f158221h;
                boolean zR14 = mVar9.r(m0Var);
                Object objQ14 = mVar9.q();
                if (zR14) {
                    objQ14 = new d7(m0Var, 20);
                    mVar9.K(objQ14);
                } else {
                    aVar2.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new d7(m0Var, 20);
                        mVar9.K(objQ14);
                    }
                }
                sa0.b.b(str2, list5, (e23.l) objQ14, this.f26423c, mVar9, 0);
                break;
            default:
                lc.v vVar10 = (lc.v) obj2;
                p3.m mVar10 = (p3.m) obj3;
                r1.q2.t((Integer) obj4, (r1.l) obj, vVar10);
                p3.x1 x1Var10 = p3.n.f135158a;
                lc.m0 m0Var2 = this.f26422b;
                sa0.n nVarA3 = f4.a(vVar10, aVar3, m0Var2, mVar10);
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                String str3 = ((g4.d) lc.w.a(vVar10, t0Var.b(g4.d.class))).f26237a;
                WifiSetup.SecurityType securityTypeValueOf = WifiSetup.SecurityType.valueOf(((g4.d) lc.w.a(vVar10, t0Var.b(g4.d.class))).f26238b);
                boolean zR15 = mVar10.r(nVarA3) | mVar10.r(m0Var2) | mVar10.B(str3) | mVar10.k(securityTypeValueOf.ordinal());
                Object objQ15 = mVar10.q();
                if (zR15) {
                    str = str3;
                    a03.n0 n0Var = new a03.n0(nVarA3, m0Var2, str, securityTypeValueOf, 16);
                    mVar10.K(n0Var);
                    objQ15 = n0Var;
                } else {
                    aVar2.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        str = str3;
                        a03.n0 n0Var2 = new a03.n0(nVarA3, m0Var2, str, securityTypeValueOf, 16);
                        mVar10.K(n0Var2);
                        objQ15 = n0Var2;
                    } else {
                        str = str3;
                    }
                }
                sa0.f.b(str, securityTypeValueOf, (e23.l) objQ15, this.f26423c, mVar10, 0);
                break;
        }
        return Unit.INSTANCE;
    }
}
