package tn;

import com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import lc.k0;
import lc.m0;
import lc.y;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.x1;
import s70.b0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HealthSnapshotActivity f165458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f165459c;

    public /* synthetic */ d(HealthSnapshotActivity healthSnapshotActivity, m0 m0Var, int i14) {
        this.f165457a = i14;
        this.f165458b = healthSnapshotActivity;
        this.f165459c = m0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165457a;
        final m0 m0Var = this.f165459c;
        final HealthSnapshotActivity healthSnapshotActivity = this.f165458b;
        switch (i14) {
            case 0:
                sn.h hVar = (sn.h) obj;
                HealthSnapshotActivity.a aVar = HealthSnapshotActivity.f29015d;
                hVar.getClass();
                healthSnapshotActivity.ea().A4(new com.garmin.android.apps.connectmobile.activities.health.presentation.b.c(hVar));
                y.k("details", m0Var);
                break;
            default:
                k0 k0Var = (k0) obj;
                HealthSnapshotActivity.a aVar2 = HealthSnapshotActivity.f29015d;
                k0Var.getClass();
                final int i15 = 0;
                final int i16 = 1;
                l82.a.a(k0Var, "list", new z3.e(-1393898660, true, new e23.r() { // from class: tn.f
                    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
                    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00e4  */
                    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
                    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0040  */
                    @Override // e23.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i17 = i15;
                        p3.m.a aVar3 = p3.m.f135153a;
                        m0 m0Var2 = m0Var;
                        final HealthSnapshotActivity healthSnapshotActivity2 = healthSnapshotActivity;
                        final int i18 = 0;
                        r1.l lVar = (r1.l) obj2;
                        lc.v vVar = (lc.v) obj3;
                        p3.m mVar = (p3.m) obj4;
                        ((Integer) obj5).getClass();
                        HealthSnapshotActivity.a aVar4 = HealthSnapshotActivity.f29015d;
                        switch (i17) {
                            case 0:
                                lVar.getClass();
                                vVar.getClass();
                                x1 x1Var = p3.n.f135158a;
                                v vVar2 = (v) healthSnapshotActivity2.f29017b.getValue();
                                boolean zR = mVar.r(healthSnapshotActivity2);
                                Object objQ = mVar.q();
                                if (zR) {
                                    final int i19 = 1;
                                    objQ = new e23.a() { // from class: tn.c
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i24 = i19;
                                            HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                            switch (i24) {
                                                case 0:
                                                    HealthSnapshotActivity.a aVar5 = HealthSnapshotActivity.f29015d;
                                                    sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                    DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                    if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                        sn.a.o(f12.l.f68084a, true);
                                                    }
                                                    if (!healthSnapshotActivity3.f29018c) {
                                                        ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                    }
                                                    healthSnapshotActivity3.setResult(-1);
                                                    return Unit.INSTANCE;
                                                case 1:
                                                    HealthSnapshotActivity.a aVar6 = HealthSnapshotActivity.f29015d;
                                                    HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                    return Unit.INSTANCE;
                                                default:
                                                    return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                            }
                                        }
                                    };
                                    mVar.K(objQ);
                                } else {
                                    aVar3.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        final int i110 = 1;
                                        objQ = new e23.a() { // from class: tn.c
                                            @Override // e23.a
                                            public final Object invoke() {
                                                int i24 = i110;
                                                HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                                switch (i24) {
                                                    case 0:
                                                        HealthSnapshotActivity.a aVar5 = HealthSnapshotActivity.f29015d;
                                                        sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                        DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                        if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                            sn.a.o(f12.l.f68084a, true);
                                                        }
                                                        if (!healthSnapshotActivity3.f29018c) {
                                                            ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                        }
                                                        healthSnapshotActivity3.setResult(-1);
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        HealthSnapshotActivity.a aVar6 = HealthSnapshotActivity.f29015d;
                                                        HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                        return Unit.INSTANCE;
                                                    default:
                                                        return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                                }
                                            }
                                        };
                                        mVar.K(objQ);
                                    }
                                }
                                e23.a aVar5 = (e23.a) objQ;
                                boolean zR2 = mVar.r(healthSnapshotActivity2);
                                Object objQ2 = mVar.q();
                                if (zR2) {
                                    final int i24 = 2;
                                    objQ2 = new e23.a() { // from class: tn.c
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i25 = i24;
                                            HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                            switch (i25) {
                                                case 0:
                                                    HealthSnapshotActivity.a aVar6 = HealthSnapshotActivity.f29015d;
                                                    sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                    DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                    if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                        sn.a.o(f12.l.f68084a, true);
                                                    }
                                                    if (!healthSnapshotActivity3.f29018c) {
                                                        ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                    }
                                                    healthSnapshotActivity3.setResult(-1);
                                                    return Unit.INSTANCE;
                                                case 1:
                                                    HealthSnapshotActivity.a aVar7 = HealthSnapshotActivity.f29015d;
                                                    HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                    return Unit.INSTANCE;
                                                default:
                                                    return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                            }
                                        }
                                    };
                                    mVar.K(objQ2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        final int i25 = 2;
                                        objQ2 = new e23.a() { // from class: tn.c
                                            @Override // e23.a
                                            public final Object invoke() {
                                                int i26 = i25;
                                                HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                                switch (i26) {
                                                    case 0:
                                                        HealthSnapshotActivity.a aVar6 = HealthSnapshotActivity.f29015d;
                                                        sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                        DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                        if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                            sn.a.o(f12.l.f68084a, true);
                                                        }
                                                        if (!healthSnapshotActivity3.f29018c) {
                                                            ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                        }
                                                        healthSnapshotActivity3.setResult(-1);
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        HealthSnapshotActivity.a aVar7 = HealthSnapshotActivity.f29015d;
                                                        HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                        return Unit.INSTANCE;
                                                    default:
                                                        return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                                }
                                            }
                                        };
                                        mVar.K(objQ2);
                                    }
                                }
                                e23.a aVar6 = (e23.a) objQ2;
                                boolean zR3 = mVar.r(healthSnapshotActivity2) | mVar.r(m0Var2);
                                Object objQ3 = mVar.q();
                                if (zR3) {
                                    objQ3 = new d(healthSnapshotActivity2, m0Var2, i18);
                                    mVar.K(objQ3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new d(healthSnapshotActivity2, m0Var2, i18);
                                        mVar.K(objQ3);
                                    }
                                }
                                new u(vVar2, aVar5, aVar6, (e23.l) objQ3).a(m0Var2, mVar, 0);
                                break;
                            case 1:
                                lVar.getClass();
                                vVar.getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                com.garmin.android.apps.connectmobile.activities.health.presentation.e eVarEa = healthSnapshotActivity2.ea();
                                boolean zR4 = mVar.r(healthSnapshotActivity2);
                                Object objQ4 = mVar.q();
                                if (zR4) {
                                    objQ4 = new s5.a(healthSnapshotActivity2, 27);
                                    mVar.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new s5.a(healthSnapshotActivity2, 27);
                                        mVar.K(objQ4);
                                    }
                                }
                                e23.p pVar = (e23.p) objQ4;
                                boolean zR5 = mVar.r(healthSnapshotActivity2) | mVar.r(m0Var2);
                                Object objQ5 = mVar.q();
                                if (zR5) {
                                    objQ5 = new tb0.d(3, healthSnapshotActivity2, m0Var2);
                                    mVar.K(objQ5);
                                } else {
                                    aVar3.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new tb0.d(3, healthSnapshotActivity2, m0Var2);
                                        mVar.K(objQ5);
                                    }
                                }
                                e23.a aVar7 = (e23.a) objQ5;
                                boolean zR6 = mVar.r(healthSnapshotActivity2);
                                Object objQ6 = mVar.q();
                                if (zR6) {
                                    objQ6 = new e23.a() { // from class: tn.c
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i26 = i18;
                                            HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                            switch (i26) {
                                                case 0:
                                                    HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                    sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                    DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                    if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                        sn.a.o(f12.l.f68084a, true);
                                                    }
                                                    if (!healthSnapshotActivity3.f29018c) {
                                                        ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                    }
                                                    healthSnapshotActivity3.setResult(-1);
                                                    return Unit.INSTANCE;
                                                case 1:
                                                    HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                    HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                    return Unit.INSTANCE;
                                                default:
                                                    return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                            }
                                        }
                                    };
                                    mVar.K(objQ6);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new e23.a() { // from class: tn.c
                                            @Override // e23.a
                                            public final Object invoke() {
                                                int i26 = i18;
                                                HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                                switch (i26) {
                                                    case 0:
                                                        HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                        sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                        DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                        if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                            sn.a.o(f12.l.f68084a, true);
                                                        }
                                                        if (!healthSnapshotActivity3.f29018c) {
                                                            ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                        }
                                                        healthSnapshotActivity3.setResult(-1);
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                        HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                        return Unit.INSTANCE;
                                                    default:
                                                        return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                                }
                                            }
                                        };
                                        mVar.K(objQ6);
                                    }
                                }
                                new com.garmin.android.apps.connectmobile.activities.health.presentation.c(eVarEa, pVar, aVar7, (e23.a) objQ6).a(m0Var2, mVar, 0);
                                break;
                            default:
                                lVar.getClass();
                                vVar.getClass();
                                x1 x1Var3 = p3.n.f135158a;
                                String str = healthSnapshotActivity2.ea().f29059g;
                                String str2 = healthSnapshotActivity2.ea().f29060h;
                                boolean zR7 = mVar.r(healthSnapshotActivity2);
                                Object objQ7 = mVar.q();
                                if (zR7) {
                                    objQ7 = new b0(healthSnapshotActivity2, 27);
                                    mVar.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new b0(healthSnapshotActivity2, 27);
                                        mVar.K(objQ7);
                                    }
                                }
                                new m(str, str2, (e23.l) objQ7).a(m0Var2, mVar, 0);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                l82.a.a(k0Var, "details", new z3.e(1385196357, true, new e23.r() { // from class: tn.f
                    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
                    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00e4  */
                    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
                    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0040  */
                    @Override // e23.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i17 = i16;
                        p3.m.a aVar3 = p3.m.f135153a;
                        m0 m0Var2 = m0Var;
                        final HealthSnapshotActivity healthSnapshotActivity2 = healthSnapshotActivity;
                        final int i18 = 0;
                        r1.l lVar = (r1.l) obj2;
                        lc.v vVar = (lc.v) obj3;
                        p3.m mVar = (p3.m) obj4;
                        ((Integer) obj5).getClass();
                        HealthSnapshotActivity.a aVar4 = HealthSnapshotActivity.f29015d;
                        switch (i17) {
                            case 0:
                                lVar.getClass();
                                vVar.getClass();
                                x1 x1Var = p3.n.f135158a;
                                v vVar2 = (v) healthSnapshotActivity2.f29017b.getValue();
                                boolean zR = mVar.r(healthSnapshotActivity2);
                                Object objQ = mVar.q();
                                if (zR) {
                                    final int i110 = 1;
                                    objQ = new e23.a() { // from class: tn.c
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i26 = i110;
                                            HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                            switch (i26) {
                                                case 0:
                                                    HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                    sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                    DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                    if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                        sn.a.o(f12.l.f68084a, true);
                                                    }
                                                    if (!healthSnapshotActivity3.f29018c) {
                                                        ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                    }
                                                    healthSnapshotActivity3.setResult(-1);
                                                    return Unit.INSTANCE;
                                                case 1:
                                                    HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                    HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                    return Unit.INSTANCE;
                                                default:
                                                    return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                            }
                                        }
                                    };
                                    mVar.K(objQ);
                                } else {
                                    aVar3.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        final int i111 = 1;
                                        objQ = new e23.a() { // from class: tn.c
                                            @Override // e23.a
                                            public final Object invoke() {
                                                int i26 = i111;
                                                HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                                switch (i26) {
                                                    case 0:
                                                        HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                        sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                        DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                        if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                            sn.a.o(f12.l.f68084a, true);
                                                        }
                                                        if (!healthSnapshotActivity3.f29018c) {
                                                            ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                        }
                                                        healthSnapshotActivity3.setResult(-1);
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                        HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                        return Unit.INSTANCE;
                                                    default:
                                                        return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                                }
                                            }
                                        };
                                        mVar.K(objQ);
                                    }
                                }
                                e23.a aVar5 = (e23.a) objQ;
                                boolean zR2 = mVar.r(healthSnapshotActivity2);
                                Object objQ2 = mVar.q();
                                if (zR2) {
                                    final int i25 = 2;
                                    objQ2 = new e23.a() { // from class: tn.c
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i26 = i25;
                                            HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                            switch (i26) {
                                                case 0:
                                                    HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                    sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                    DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                    if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                        sn.a.o(f12.l.f68084a, true);
                                                    }
                                                    if (!healthSnapshotActivity3.f29018c) {
                                                        ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                    }
                                                    healthSnapshotActivity3.setResult(-1);
                                                    return Unit.INSTANCE;
                                                case 1:
                                                    HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                    HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                    return Unit.INSTANCE;
                                                default:
                                                    return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                            }
                                        }
                                    };
                                    mVar.K(objQ2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        final int i26 = 2;
                                        objQ2 = new e23.a() { // from class: tn.c
                                            @Override // e23.a
                                            public final Object invoke() {
                                                int i27 = i26;
                                                HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                                switch (i27) {
                                                    case 0:
                                                        HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                        sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                        DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                        if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                            sn.a.o(f12.l.f68084a, true);
                                                        }
                                                        if (!healthSnapshotActivity3.f29018c) {
                                                            ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                        }
                                                        healthSnapshotActivity3.setResult(-1);
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                        HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                        return Unit.INSTANCE;
                                                    default:
                                                        return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                                }
                                            }
                                        };
                                        mVar.K(objQ2);
                                    }
                                }
                                e23.a aVar6 = (e23.a) objQ2;
                                boolean zR3 = mVar.r(healthSnapshotActivity2) | mVar.r(m0Var2);
                                Object objQ3 = mVar.q();
                                if (zR3) {
                                    objQ3 = new d(healthSnapshotActivity2, m0Var2, i18);
                                    mVar.K(objQ3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new d(healthSnapshotActivity2, m0Var2, i18);
                                        mVar.K(objQ3);
                                    }
                                }
                                new u(vVar2, aVar5, aVar6, (e23.l) objQ3).a(m0Var2, mVar, 0);
                                break;
                            case 1:
                                lVar.getClass();
                                vVar.getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                com.garmin.android.apps.connectmobile.activities.health.presentation.e eVarEa = healthSnapshotActivity2.ea();
                                boolean zR4 = mVar.r(healthSnapshotActivity2);
                                Object objQ4 = mVar.q();
                                if (zR4) {
                                    objQ4 = new s5.a(healthSnapshotActivity2, 27);
                                    mVar.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new s5.a(healthSnapshotActivity2, 27);
                                        mVar.K(objQ4);
                                    }
                                }
                                e23.p pVar = (e23.p) objQ4;
                                boolean zR5 = mVar.r(healthSnapshotActivity2) | mVar.r(m0Var2);
                                Object objQ5 = mVar.q();
                                if (zR5) {
                                    objQ5 = new tb0.d(3, healthSnapshotActivity2, m0Var2);
                                    mVar.K(objQ5);
                                } else {
                                    aVar3.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new tb0.d(3, healthSnapshotActivity2, m0Var2);
                                        mVar.K(objQ5);
                                    }
                                }
                                e23.a aVar7 = (e23.a) objQ5;
                                boolean zR6 = mVar.r(healthSnapshotActivity2);
                                Object objQ6 = mVar.q();
                                if (zR6) {
                                    objQ6 = new e23.a() { // from class: tn.c
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i27 = i18;
                                            HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                            switch (i27) {
                                                case 0:
                                                    HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                    sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                    DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                    if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                        sn.a.o(f12.l.f68084a, true);
                                                    }
                                                    if (!healthSnapshotActivity3.f29018c) {
                                                        ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                    }
                                                    healthSnapshotActivity3.setResult(-1);
                                                    return Unit.INSTANCE;
                                                case 1:
                                                    HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                    HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                    return Unit.INSTANCE;
                                                default:
                                                    return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                            }
                                        }
                                    };
                                    mVar.K(objQ6);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new e23.a() { // from class: tn.c
                                            @Override // e23.a
                                            public final Object invoke() {
                                                int i27 = i18;
                                                HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                                switch (i27) {
                                                    case 0:
                                                        HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                        sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                        DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                        if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                            sn.a.o(f12.l.f68084a, true);
                                                        }
                                                        if (!healthSnapshotActivity3.f29018c) {
                                                            ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                        }
                                                        healthSnapshotActivity3.setResult(-1);
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                        HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                        return Unit.INSTANCE;
                                                    default:
                                                        return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                                }
                                            }
                                        };
                                        mVar.K(objQ6);
                                    }
                                }
                                new com.garmin.android.apps.connectmobile.activities.health.presentation.c(eVarEa, pVar, aVar7, (e23.a) objQ6).a(m0Var2, mVar, 0);
                                break;
                            default:
                                lVar.getClass();
                                vVar.getClass();
                                x1 x1Var3 = p3.n.f135158a;
                                String str = healthSnapshotActivity2.ea().f29059g;
                                String str2 = healthSnapshotActivity2.ea().f29060h;
                                boolean zR7 = mVar.r(healthSnapshotActivity2);
                                Object objQ7 = mVar.q();
                                if (zR7) {
                                    objQ7 = new b0(healthSnapshotActivity2, 27);
                                    mVar.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new b0(healthSnapshotActivity2, 27);
                                        mVar.K(objQ7);
                                    }
                                }
                                new m(str, str2, (e23.l) objQ7).a(m0Var2, mVar, 0);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                final int i17 = 2;
                l82.a.a(k0Var, "health_snapshot_edit_name", new z3.e(1729759716, true, new e23.r() { // from class: tn.f
                    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
                    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
                    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00e4  */
                    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
                    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0040  */
                    @Override // e23.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i18 = i17;
                        p3.m.a aVar3 = p3.m.f135153a;
                        m0 m0Var2 = m0Var;
                        final HealthSnapshotActivity healthSnapshotActivity2 = healthSnapshotActivity;
                        final int i19 = 0;
                        r1.l lVar = (r1.l) obj2;
                        lc.v vVar = (lc.v) obj3;
                        p3.m mVar = (p3.m) obj4;
                        ((Integer) obj5).getClass();
                        HealthSnapshotActivity.a aVar4 = HealthSnapshotActivity.f29015d;
                        switch (i18) {
                            case 0:
                                lVar.getClass();
                                vVar.getClass();
                                x1 x1Var = p3.n.f135158a;
                                v vVar2 = (v) healthSnapshotActivity2.f29017b.getValue();
                                boolean zR = mVar.r(healthSnapshotActivity2);
                                Object objQ = mVar.q();
                                if (zR) {
                                    final int i111 = 1;
                                    objQ = new e23.a() { // from class: tn.c
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i27 = i111;
                                            HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                            switch (i27) {
                                                case 0:
                                                    HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                    sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                    DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                    if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                        sn.a.o(f12.l.f68084a, true);
                                                    }
                                                    if (!healthSnapshotActivity3.f29018c) {
                                                        ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                    }
                                                    healthSnapshotActivity3.setResult(-1);
                                                    return Unit.INSTANCE;
                                                case 1:
                                                    HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                    HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                    return Unit.INSTANCE;
                                                default:
                                                    return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                            }
                                        }
                                    };
                                    mVar.K(objQ);
                                } else {
                                    aVar3.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        final int i112 = 1;
                                        objQ = new e23.a() { // from class: tn.c
                                            @Override // e23.a
                                            public final Object invoke() {
                                                int i27 = i112;
                                                HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                                switch (i27) {
                                                    case 0:
                                                        HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                        sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                        DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                        if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                            sn.a.o(f12.l.f68084a, true);
                                                        }
                                                        if (!healthSnapshotActivity3.f29018c) {
                                                            ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                        }
                                                        healthSnapshotActivity3.setResult(-1);
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                        HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                        return Unit.INSTANCE;
                                                    default:
                                                        return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                                }
                                            }
                                        };
                                        mVar.K(objQ);
                                    }
                                }
                                e23.a aVar5 = (e23.a) objQ;
                                boolean zR2 = mVar.r(healthSnapshotActivity2);
                                Object objQ2 = mVar.q();
                                if (zR2) {
                                    final int i26 = 2;
                                    objQ2 = new e23.a() { // from class: tn.c
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i27 = i26;
                                            HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                            switch (i27) {
                                                case 0:
                                                    HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                    sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                    DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                    if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                        sn.a.o(f12.l.f68084a, true);
                                                    }
                                                    if (!healthSnapshotActivity3.f29018c) {
                                                        ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                    }
                                                    healthSnapshotActivity3.setResult(-1);
                                                    return Unit.INSTANCE;
                                                case 1:
                                                    HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                    HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                    return Unit.INSTANCE;
                                                default:
                                                    return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                            }
                                        }
                                    };
                                    mVar.K(objQ2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        final int i27 = 2;
                                        objQ2 = new e23.a() { // from class: tn.c
                                            @Override // e23.a
                                            public final Object invoke() {
                                                int i28 = i27;
                                                HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                                switch (i28) {
                                                    case 0:
                                                        HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                        sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                        DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                        if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                            sn.a.o(f12.l.f68084a, true);
                                                        }
                                                        if (!healthSnapshotActivity3.f29018c) {
                                                            ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                        }
                                                        healthSnapshotActivity3.setResult(-1);
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                        HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                        return Unit.INSTANCE;
                                                    default:
                                                        return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                                }
                                            }
                                        };
                                        mVar.K(objQ2);
                                    }
                                }
                                e23.a aVar6 = (e23.a) objQ2;
                                boolean zR3 = mVar.r(healthSnapshotActivity2) | mVar.r(m0Var2);
                                Object objQ3 = mVar.q();
                                if (zR3) {
                                    objQ3 = new d(healthSnapshotActivity2, m0Var2, i19);
                                    mVar.K(objQ3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new d(healthSnapshotActivity2, m0Var2, i19);
                                        mVar.K(objQ3);
                                    }
                                }
                                new u(vVar2, aVar5, aVar6, (e23.l) objQ3).a(m0Var2, mVar, 0);
                                break;
                            case 1:
                                lVar.getClass();
                                vVar.getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                com.garmin.android.apps.connectmobile.activities.health.presentation.e eVarEa = healthSnapshotActivity2.ea();
                                boolean zR4 = mVar.r(healthSnapshotActivity2);
                                Object objQ4 = mVar.q();
                                if (zR4) {
                                    objQ4 = new s5.a(healthSnapshotActivity2, 27);
                                    mVar.K(objQ4);
                                } else {
                                    aVar3.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new s5.a(healthSnapshotActivity2, 27);
                                        mVar.K(objQ4);
                                    }
                                }
                                e23.p pVar = (e23.p) objQ4;
                                boolean zR5 = mVar.r(healthSnapshotActivity2) | mVar.r(m0Var2);
                                Object objQ5 = mVar.q();
                                if (zR5) {
                                    objQ5 = new tb0.d(3, healthSnapshotActivity2, m0Var2);
                                    mVar.K(objQ5);
                                } else {
                                    aVar3.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        objQ5 = new tb0.d(3, healthSnapshotActivity2, m0Var2);
                                        mVar.K(objQ5);
                                    }
                                }
                                e23.a aVar7 = (e23.a) objQ5;
                                boolean zR6 = mVar.r(healthSnapshotActivity2);
                                Object objQ6 = mVar.q();
                                if (zR6) {
                                    objQ6 = new e23.a() { // from class: tn.c
                                        @Override // e23.a
                                        public final Object invoke() {
                                            int i28 = i19;
                                            HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                            switch (i28) {
                                                case 0:
                                                    HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                    sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                    DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                    if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                        sn.a.o(f12.l.f68084a, true);
                                                    }
                                                    if (!healthSnapshotActivity3.f29018c) {
                                                        ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                    }
                                                    healthSnapshotActivity3.setResult(-1);
                                                    return Unit.INSTANCE;
                                                case 1:
                                                    HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                    HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                    return Unit.INSTANCE;
                                                default:
                                                    return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                            }
                                        }
                                    };
                                    mVar.K(objQ6);
                                } else {
                                    aVar3.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new e23.a() { // from class: tn.c
                                            @Override // e23.a
                                            public final Object invoke() {
                                                int i28 = i19;
                                                HealthSnapshotActivity healthSnapshotActivity3 = healthSnapshotActivity2;
                                                switch (i28) {
                                                    case 0:
                                                        HealthSnapshotActivity.a aVar8 = HealthSnapshotActivity.f29015d;
                                                        sn.h hVar2 = healthSnapshotActivity3.ea().x4().getValue().f165466a;
                                                        DateTime dateTimeT = hVar2 != null ? hVar2.t() : null;
                                                        if (dateTimeT != null ? dateTimeT.isAfter(DateTime.now().minusDays(7)) : false) {
                                                            sn.a.o(f12.l.f68084a, true);
                                                        }
                                                        if (!healthSnapshotActivity3.f29018c) {
                                                            ((v) healthSnapshotActivity3.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
                                                        }
                                                        healthSnapshotActivity3.setResult(-1);
                                                        return Unit.INSTANCE;
                                                    case 1:
                                                        HealthSnapshotActivity.a aVar9 = HealthSnapshotActivity.f29015d;
                                                        HelpActivity.a.e(HelpActivity.f36653a, healthSnapshotActivity2, ro0.l.HEALTH_SNAPSHOT, null, null, 12);
                                                        return Unit.INSTANCE;
                                                    default:
                                                        return HealthSnapshotActivity.da(healthSnapshotActivity3);
                                                }
                                            }
                                        };
                                        mVar.K(objQ6);
                                    }
                                }
                                new com.garmin.android.apps.connectmobile.activities.health.presentation.c(eVarEa, pVar, aVar7, (e23.a) objQ6).a(m0Var2, mVar, 0);
                                break;
                            default:
                                lVar.getClass();
                                vVar.getClass();
                                x1 x1Var3 = p3.n.f135158a;
                                String str = healthSnapshotActivity2.ea().f29059g;
                                String str2 = healthSnapshotActivity2.ea().f29060h;
                                boolean zR7 = mVar.r(healthSnapshotActivity2);
                                Object objQ7 = mVar.q();
                                if (zR7) {
                                    objQ7 = new b0(healthSnapshotActivity2, 27);
                                    mVar.K(objQ7);
                                } else {
                                    aVar3.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new b0(healthSnapshotActivity2, 27);
                                        mVar.K(objQ7);
                                    }
                                }
                                new m(str, str2, (e23.l) objQ7).a(m0Var2, mVar, 0);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                break;
        }
        return Unit.INSTANCE;
    }
}
