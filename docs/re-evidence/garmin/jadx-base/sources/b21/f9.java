package b21;

import androidx.lifecycle.ViewModelStoreOwner;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f9 implements e23.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f14666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f14667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v21.e f14668d;

    public /* synthetic */ f9(lc.v vVar, lc.m0 m0Var, v21.e eVar) {
        this.f14665a = 1;
        this.f14666b = vVar;
        this.f14667c = m0Var;
        this.f14668d = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:109:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:114:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:119:0x040d  */
    /* JADX WARN: Code duplicated, block: B:15:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:20:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:30:0x0108  */
    /* JADX WARN: Code duplicated, block: B:35:0x0123  */
    /* JADX WARN: Code duplicated, block: B:43:0x0185  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0210  */
    /* JADX WARN: Code duplicated, block: B:60:0x022e  */
    /* JADX WARN: Code duplicated, block: B:65:0x024b  */
    /* JADX WARN: Code duplicated, block: B:77:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:82:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0059  */
    /* JADX WARN: Code duplicated, block: B:92:0x0345  */
    /* JADX WARN: Code duplicated, block: B:99:0x039c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.u
    public final Object m(androidx.lifecycle.u1 u1Var, Object obj, Object obj2, Object obj3, Object obj4, p3.m mVar, Integer num) {
        androidx.lifecycle.j1 j1VarA;
        int i14 = this.f14665a;
        final int i15 = 1;
        final int i16 = 2;
        p3.m.a aVar = p3.m.f135153a;
        lc.m0 m0Var = this.f14667c;
        lc.v vVar = this.f14666b;
        final int i17 = 0;
        switch (i14) {
            case 0:
                ((s21.a0) obj).getClass();
                ((e23.l) obj2).getClass();
                ((e23.a) obj3).getClass();
                ((fe) obj4).getClass();
                p3.x1 x1Var = p3.n.f135158a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                Object obj5 = (l4.b0) lc.w.a(vVar, t0Var.b(l4.b0.class));
                boolean zR = mVar.r(obj5);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new s4(obj5, 7);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new s4(obj5, 7);
                        mVar.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                mVar.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(u21.m0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), aVar2);
                mVar.R();
                final u21.m0 m0Var2 = (u21.m0) u1VarResolveViewModel;
                p3.p1 p1VarC = s9.c.c(m0Var2.f168042b, mVar);
                u21.l0 l0Var = (u21.l0) p1VarC.getF182175a();
                boolean zR2 = mVar.r(m0Var2);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new e23.l() { // from class: b21.v8
                        @Override // e23.l
                        public final Object invoke(Object obj6) {
                            Object value;
                            u21.l0 l0Var2;
                            int i18;
                            Object value2;
                            u21.l0 l0Var3;
                            int i19;
                            Object value3;
                            u21.l0 l0Var4;
                            int i24;
                            Integer num2 = (Integer) obj6;
                            switch (i17) {
                                case 0:
                                    int iIntValue = num2.intValue();
                                    r53.p2 p2Var = m0Var2.f168041a;
                                    do {
                                        value = p2Var.getValue();
                                        l0Var2 = (u21.l0) value;
                                        v21.f fVar = v21.f.f175333a;
                                        i18 = l0Var2.f168028a;
                                        fVar.getClass();
                                    } while (!p2Var.b(value, u21.l0.a(l0Var2, v21.f.a(i18, iIntValue, 4.0d), iIntValue, 0.0d, 0, 0.0d, 0, 121)));
                                    break;
                                case 1:
                                    int iIntValue2 = num2.intValue();
                                    r53.p2 p2Var2 = m0Var2.f168041a;
                                    do {
                                        value2 = p2Var2.getValue();
                                        l0Var3 = (u21.l0) value2;
                                        v21.f fVar2 = v21.f.f175333a;
                                        i19 = l0Var3.f168028a;
                                        fVar2.getClass();
                                    } while (!p2Var2.b(value2, u21.l0.a(l0Var3, 0.0d, 0, v21.f.a(i19, iIntValue2, 9.0d), iIntValue2, 0.0d, 0, 103)));
                                    break;
                                default:
                                    int iIntValue3 = num2.intValue();
                                    r53.p2 p2Var3 = m0Var2.f168041a;
                                    do {
                                        value3 = p2Var3.getValue();
                                        l0Var4 = (u21.l0) value3;
                                        v21.f fVar3 = v21.f.f175333a;
                                        i24 = l0Var4.f168028a;
                                        fVar3.getClass();
                                    } while (!p2Var3.b(value3, u21.l0.a(l0Var4, 0.0d, 0, 0.0d, 0, v21.f.a(i24, iIntValue3, 4.0d), iIntValue3, 31)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new e23.l() { // from class: b21.v8
                            @Override // e23.l
                            public final Object invoke(Object obj6) {
                                Object value;
                                u21.l0 l0Var2;
                                int i18;
                                Object value2;
                                u21.l0 l0Var3;
                                int i19;
                                Object value3;
                                u21.l0 l0Var4;
                                int i24;
                                Integer num2 = (Integer) obj6;
                                switch (i17) {
                                    case 0:
                                        int iIntValue = num2.intValue();
                                        r53.p2 p2Var = m0Var2.f168041a;
                                        do {
                                            value = p2Var.getValue();
                                            l0Var2 = (u21.l0) value;
                                            v21.f fVar = v21.f.f175333a;
                                            i18 = l0Var2.f168028a;
                                            fVar.getClass();
                                        } while (!p2Var.b(value, u21.l0.a(l0Var2, v21.f.a(i18, iIntValue, 4.0d), iIntValue, 0.0d, 0, 0.0d, 0, 121)));
                                        break;
                                    case 1:
                                        int iIntValue2 = num2.intValue();
                                        r53.p2 p2Var2 = m0Var2.f168041a;
                                        do {
                                            value2 = p2Var2.getValue();
                                            l0Var3 = (u21.l0) value2;
                                            v21.f fVar2 = v21.f.f175333a;
                                            i19 = l0Var3.f168028a;
                                            fVar2.getClass();
                                        } while (!p2Var2.b(value2, u21.l0.a(l0Var3, 0.0d, 0, v21.f.a(i19, iIntValue2, 9.0d), iIntValue2, 0.0d, 0, 103)));
                                        break;
                                    default:
                                        int iIntValue3 = num2.intValue();
                                        r53.p2 p2Var3 = m0Var2.f168041a;
                                        do {
                                            value3 = p2Var3.getValue();
                                            l0Var4 = (u21.l0) value3;
                                            v21.f fVar3 = v21.f.f175333a;
                                            i24 = l0Var4.f168028a;
                                            fVar3.getClass();
                                        } while (!p2Var3.b(value3, u21.l0.a(l0Var4, 0.0d, 0, 0.0d, 0, v21.f.a(i24, iIntValue3, 4.0d), iIntValue3, 31)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ2);
                    }
                }
                e23.l lVar = (e23.l) objQ2;
                boolean zR3 = mVar.r(m0Var2);
                Object objQ3 = mVar.q();
                if (zR3) {
                    objQ3 = new e23.l() { // from class: b21.v8
                        @Override // e23.l
                        public final Object invoke(Object obj6) {
                            Object value;
                            u21.l0 l0Var2;
                            int i18;
                            Object value2;
                            u21.l0 l0Var3;
                            int i19;
                            Object value3;
                            u21.l0 l0Var4;
                            int i24;
                            Integer num2 = (Integer) obj6;
                            switch (i15) {
                                case 0:
                                    int iIntValue = num2.intValue();
                                    r53.p2 p2Var = m0Var2.f168041a;
                                    do {
                                        value = p2Var.getValue();
                                        l0Var2 = (u21.l0) value;
                                        v21.f fVar = v21.f.f175333a;
                                        i18 = l0Var2.f168028a;
                                        fVar.getClass();
                                    } while (!p2Var.b(value, u21.l0.a(l0Var2, v21.f.a(i18, iIntValue, 4.0d), iIntValue, 0.0d, 0, 0.0d, 0, 121)));
                                    break;
                                case 1:
                                    int iIntValue2 = num2.intValue();
                                    r53.p2 p2Var2 = m0Var2.f168041a;
                                    do {
                                        value2 = p2Var2.getValue();
                                        l0Var3 = (u21.l0) value2;
                                        v21.f fVar2 = v21.f.f175333a;
                                        i19 = l0Var3.f168028a;
                                        fVar2.getClass();
                                    } while (!p2Var2.b(value2, u21.l0.a(l0Var3, 0.0d, 0, v21.f.a(i19, iIntValue2, 9.0d), iIntValue2, 0.0d, 0, 103)));
                                    break;
                                default:
                                    int iIntValue3 = num2.intValue();
                                    r53.p2 p2Var3 = m0Var2.f168041a;
                                    do {
                                        value3 = p2Var3.getValue();
                                        l0Var4 = (u21.l0) value3;
                                        v21.f fVar3 = v21.f.f175333a;
                                        i24 = l0Var4.f168028a;
                                        fVar3.getClass();
                                    } while (!p2Var3.b(value3, u21.l0.a(l0Var4, 0.0d, 0, 0.0d, 0, v21.f.a(i24, iIntValue3, 4.0d), iIntValue3, 31)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new e23.l() { // from class: b21.v8
                            @Override // e23.l
                            public final Object invoke(Object obj6) {
                                Object value;
                                u21.l0 l0Var2;
                                int i18;
                                Object value2;
                                u21.l0 l0Var3;
                                int i19;
                                Object value3;
                                u21.l0 l0Var4;
                                int i24;
                                Integer num2 = (Integer) obj6;
                                switch (i15) {
                                    case 0:
                                        int iIntValue = num2.intValue();
                                        r53.p2 p2Var = m0Var2.f168041a;
                                        do {
                                            value = p2Var.getValue();
                                            l0Var2 = (u21.l0) value;
                                            v21.f fVar = v21.f.f175333a;
                                            i18 = l0Var2.f168028a;
                                            fVar.getClass();
                                        } while (!p2Var.b(value, u21.l0.a(l0Var2, v21.f.a(i18, iIntValue, 4.0d), iIntValue, 0.0d, 0, 0.0d, 0, 121)));
                                        break;
                                    case 1:
                                        int iIntValue2 = num2.intValue();
                                        r53.p2 p2Var2 = m0Var2.f168041a;
                                        do {
                                            value2 = p2Var2.getValue();
                                            l0Var3 = (u21.l0) value2;
                                            v21.f fVar2 = v21.f.f175333a;
                                            i19 = l0Var3.f168028a;
                                            fVar2.getClass();
                                        } while (!p2Var2.b(value2, u21.l0.a(l0Var3, 0.0d, 0, v21.f.a(i19, iIntValue2, 9.0d), iIntValue2, 0.0d, 0, 103)));
                                        break;
                                    default:
                                        int iIntValue3 = num2.intValue();
                                        r53.p2 p2Var3 = m0Var2.f168041a;
                                        do {
                                            value3 = p2Var3.getValue();
                                            l0Var4 = (u21.l0) value3;
                                            v21.f fVar3 = v21.f.f175333a;
                                            i24 = l0Var4.f168028a;
                                            fVar3.getClass();
                                        } while (!p2Var3.b(value3, u21.l0.a(l0Var4, 0.0d, 0, 0.0d, 0, v21.f.a(i24, iIntValue3, 4.0d), iIntValue3, 31)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ3);
                    }
                }
                e23.l lVar2 = (e23.l) objQ3;
                boolean zR4 = mVar.r(m0Var2);
                Object objQ4 = mVar.q();
                if (zR4) {
                    objQ4 = new e23.l() { // from class: b21.v8
                        @Override // e23.l
                        public final Object invoke(Object obj6) {
                            Object value;
                            u21.l0 l0Var2;
                            int i18;
                            Object value2;
                            u21.l0 l0Var3;
                            int i19;
                            Object value3;
                            u21.l0 l0Var4;
                            int i24;
                            Integer num2 = (Integer) obj6;
                            switch (i16) {
                                case 0:
                                    int iIntValue = num2.intValue();
                                    r53.p2 p2Var = m0Var2.f168041a;
                                    do {
                                        value = p2Var.getValue();
                                        l0Var2 = (u21.l0) value;
                                        v21.f fVar = v21.f.f175333a;
                                        i18 = l0Var2.f168028a;
                                        fVar.getClass();
                                    } while (!p2Var.b(value, u21.l0.a(l0Var2, v21.f.a(i18, iIntValue, 4.0d), iIntValue, 0.0d, 0, 0.0d, 0, 121)));
                                    break;
                                case 1:
                                    int iIntValue2 = num2.intValue();
                                    r53.p2 p2Var2 = m0Var2.f168041a;
                                    do {
                                        value2 = p2Var2.getValue();
                                        l0Var3 = (u21.l0) value2;
                                        v21.f fVar2 = v21.f.f175333a;
                                        i19 = l0Var3.f168028a;
                                        fVar2.getClass();
                                    } while (!p2Var2.b(value2, u21.l0.a(l0Var3, 0.0d, 0, v21.f.a(i19, iIntValue2, 9.0d), iIntValue2, 0.0d, 0, 103)));
                                    break;
                                default:
                                    int iIntValue3 = num2.intValue();
                                    r53.p2 p2Var3 = m0Var2.f168041a;
                                    do {
                                        value3 = p2Var3.getValue();
                                        l0Var4 = (u21.l0) value3;
                                        v21.f fVar3 = v21.f.f175333a;
                                        i24 = l0Var4.f168028a;
                                        fVar3.getClass();
                                    } while (!p2Var3.b(value3, u21.l0.a(l0Var4, 0.0d, 0, 0.0d, 0, v21.f.a(i24, iIntValue3, 4.0d), iIntValue3, 31)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new e23.l() { // from class: b21.v8
                            @Override // e23.l
                            public final Object invoke(Object obj6) {
                                Object value;
                                u21.l0 l0Var2;
                                int i18;
                                Object value2;
                                u21.l0 l0Var3;
                                int i19;
                                Object value3;
                                u21.l0 l0Var4;
                                int i24;
                                Integer num2 = (Integer) obj6;
                                switch (i16) {
                                    case 0:
                                        int iIntValue = num2.intValue();
                                        r53.p2 p2Var = m0Var2.f168041a;
                                        do {
                                            value = p2Var.getValue();
                                            l0Var2 = (u21.l0) value;
                                            v21.f fVar = v21.f.f175333a;
                                            i18 = l0Var2.f168028a;
                                            fVar.getClass();
                                        } while (!p2Var.b(value, u21.l0.a(l0Var2, v21.f.a(i18, iIntValue, 4.0d), iIntValue, 0.0d, 0, 0.0d, 0, 121)));
                                        break;
                                    case 1:
                                        int iIntValue2 = num2.intValue();
                                        r53.p2 p2Var2 = m0Var2.f168041a;
                                        do {
                                            value2 = p2Var2.getValue();
                                            l0Var3 = (u21.l0) value2;
                                            v21.f fVar2 = v21.f.f175333a;
                                            i19 = l0Var3.f168028a;
                                            fVar2.getClass();
                                        } while (!p2Var2.b(value2, u21.l0.a(l0Var3, 0.0d, 0, v21.f.a(i19, iIntValue2, 9.0d), iIntValue2, 0.0d, 0, 103)));
                                        break;
                                    default:
                                        int iIntValue3 = num2.intValue();
                                        r53.p2 p2Var3 = m0Var2.f168041a;
                                        do {
                                            value3 = p2Var3.getValue();
                                            l0Var4 = (u21.l0) value3;
                                            v21.f fVar3 = v21.f.f175333a;
                                            i24 = l0Var4.f168028a;
                                            fVar3.getClass();
                                        } while (!p2Var3.b(value3, u21.l0.a(l0Var4, 0.0d, 0, 0.0d, 0, v21.f.a(i24, iIntValue3, 4.0d), iIntValue3, 31)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ4);
                    }
                }
                e23.l lVar3 = (e23.l) objQ4;
                boolean zR5 = mVar.r(m0Var) | mVar.B(p1VarC);
                Object objQ5 = mVar.q();
                if (zR5) {
                    objQ5 = new s8(m0Var, p1VarC, 2);
                    mVar.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new s8(m0Var, p1VarC, 2);
                        mVar.K(objQ5);
                    }
                }
                e23.a aVar3 = (e23.a) objQ5;
                boolean zR6 = mVar.r(m0Var);
                Object objQ6 = mVar.q();
                if (zR6) {
                    objQ6 = new aa2.m(m0Var, 14);
                    mVar.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new aa2.m(m0Var, 14);
                        mVar.K(objQ6);
                    }
                }
                t21.m.a(l0Var, this.f14668d, lVar, lVar2, lVar3, aVar3, (e23.a) objQ6, mVar, 0);
                return Unit.INSTANCE;
            case 1:
                Object obj6 = (s21.a0) obj;
                obj6.getClass();
                ((e23.l) obj2).getClass();
                ((e23.a) obj3).getClass();
                ((fe) obj4).getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                Object obj7 = (l4.a0) lc.w.a(vVar, t0Var2.b(l4.a0.class));
                boolean zR7 = mVar.r(obj7);
                Object objQ7 = mVar.q();
                if (zR7) {
                    objQ7 = new s4(obj7, 5);
                    mVar.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new s4(obj7, 5);
                        mVar.K(objQ7);
                    }
                }
                e23.a aVar4 = (e23.a) objQ7;
                mVar.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var2.b(u21.f0.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar, 0), aVar4);
                mVar.R();
                u21.f0 f0Var = (u21.f0) u1VarResolveViewModel2;
                p3.p1 p1VarC2 = s9.c.c(f0Var.f167955d, mVar);
                Boolean boolValueOf = Boolean.valueOf(((u21.e0) p1VarC2.getF182175a()).f167941d);
                boolean zB = mVar.B(p1VarC2) | mVar.r(m0Var);
                Object objQ8 = mVar.q();
                if (zB) {
                    objQ8 = new x9(m0Var, p1VarC2, null);
                    mVar.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new x9(m0Var, p1VarC2, null);
                        mVar.K(objQ8);
                    }
                }
                p3.l0.e((e23.p) objQ8, boolValueOf, mVar);
                u21.e0 e0Var = (u21.e0) p1VarC2.getF182175a();
                boolean zR8 = mVar.r(f0Var) | mVar.r(obj6);
                Object objQ9 = mVar.q();
                if (zR8) {
                    objQ9 = new a42.i(20, f0Var, obj6);
                    mVar.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new a42.i(20, f0Var, obj6);
                        mVar.K(objQ9);
                    }
                }
                e23.l lVar4 = (e23.l) objQ9;
                boolean zR9 = mVar.r(f0Var);
                Object objQ10 = mVar.q();
                if (zR9) {
                    objQ10 = new a03.f(f0Var, 25);
                    mVar.K(objQ10);
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new a03.f(f0Var, 25);
                        mVar.K(objQ10);
                    }
                }
                e23.l lVar5 = (e23.l) objQ10;
                boolean zR10 = mVar.r(m0Var);
                Object objQ11 = mVar.q();
                if (zR10) {
                    objQ11 = new aa2.m(m0Var, 13);
                    mVar.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new aa2.m(m0Var, 13);
                        mVar.K(objQ11);
                    }
                }
                t21.k.a(e0Var, this.f14668d, lVar4, lVar5, (e23.a) objQ11, mVar, 0);
                if (((u21.e0) p1VarC2.getF182175a()).f167939b) {
                    mVar.C(-586010018);
                    lc.v vVarF = m0Var.f();
                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                        j1VarA.f(Boolean.TRUE, "warningShownResult");
                    }
                    l72.c1 c1Var = l72.c1.f110940a;
                    String strQ = gl1.y.Q(mVar, R.string.calories_goal_warning);
                    String strQ2 = gl1.y.Q(mVar, R.string.calories_goal_warning_message);
                    String strQ3 = gl1.y.Q(mVar, R.string.lbl_common_continue);
                    String strQ4 = gl1.y.Q(mVar, R.string.lbl_cancel);
                    boolean zR11 = mVar.r(f0Var) | mVar.B(p1VarC2);
                    Object objQ12 = mVar.q();
                    if (zR11) {
                        objQ12 = new ao1.i(23, f0Var, p1VarC2);
                        mVar.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new ao1.i(23, f0Var, p1VarC2);
                            mVar.K(objQ12);
                        }
                    }
                    e23.a<Unit> aVar5 = (e23.a) objQ12;
                    boolean zR12 = mVar.r(f0Var);
                    Object objQ13 = mVar.q();
                    if (zR12) {
                        objQ13 = new s4(f0Var, 6);
                        mVar.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new s4(f0Var, 6);
                            mVar.K(objQ13);
                        }
                    }
                    c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar5, strQ4, (e23.a) objQ13, mVar, 0, 0, 217);
                    mVar.f();
                } else {
                    mVar.C(-585176831);
                    mVar.f();
                }
                return Unit.INSTANCE;
            default:
                ((s21.a0) obj).getClass();
                ((e23.l) obj2).getClass();
                ((e23.a) obj3).getClass();
                ((fe) obj4).getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                Object obj8 = (l4.z) lc.w.a(vVar, t0Var3.b(l4.z.class));
                boolean zR13 = mVar.r(obj8);
                Object objQ14 = mVar.q();
                if (zR13) {
                    objQ14 = new s4(obj8, 11);
                    mVar.K(objQ14);
                } else {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new s4(obj8, 11);
                        mVar.K(objQ14);
                    }
                }
                e23.a aVar6 = (e23.a) objQ14;
                mVar.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA3 = v9.a.a(mVar);
                if (viewModelStoreOwnerA3 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel3 = GetViewModelKt.resolveViewModel(t0Var3.b(u21.d.class), viewModelStoreOwnerA3.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA3), null, KoinApplicationKt.currentKoinScope(mVar, 0), aVar6);
                mVar.R();
                final u21.d dVar = (u21.d) u1VarResolveViewModel3;
                p3.p1 p1VarC3 = s9.c.c(dVar.f167925b, mVar);
                u21.c cVar = (u21.c) p1VarC3.getF182175a();
                boolean zR14 = mVar.r(dVar);
                Object objQ15 = mVar.q();
                if (zR14) {
                    objQ15 = new e23.l() { // from class: b21.r8
                        @Override // e23.l
                        public final Object invoke(Object obj9) {
                            Object value;
                            Object value2;
                            u21.c cVar2;
                            Object value3;
                            u21.c cVar3;
                            Object value4;
                            u21.c cVar4;
                            Object value5;
                            switch (i15) {
                                case 0:
                                    l01.a aVar7 = (l01.a) obj9;
                                    aVar7.getClass();
                                    r53.p2 p2Var = dVar.f167924a;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, u21.c.a((u21.c) value, null, false, true, s21.a.ACTIVITY_MULTIPLIER, aVar7, 7)));
                                    return Unit.INSTANCE;
                                case 1:
                                    s21.a aVar8 = (s21.a) obj9;
                                    aVar8.getClass();
                                    r53.p2 p2Var2 = dVar.f167924a;
                                    int i18 = u21.d.a.f167926a[aVar8.ordinal()];
                                    if (i18 == 1) {
                                        do {
                                            value2 = p2Var2.getValue();
                                            cVar2 = (u21.c) value2;
                                        } while (!p2Var2.b(value2, u21.c.a(cVar2, null, false, u21.d.x4(cVar2.f167907a), aVar8, null, 39)));
                                    } else if (i18 == 2) {
                                        do {
                                            value3 = p2Var2.getValue();
                                            cVar3 = (u21.c) value3;
                                        } while (!p2Var2.b(value3, u21.c.a(cVar3, null, false, cVar3.f167912f != null, aVar8, null, 39)));
                                    } else {
                                        if (i18 != 3) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        boolean zX4 = u21.d.x4(((u21.c) p2Var2.getValue()).f167908b);
                                        do {
                                            value4 = p2Var2.getValue();
                                            cVar4 = (u21.c) value4;
                                        } while (!p2Var2.b(value4, u21.c.a(cVar4, null, g22.n.d(cVar4.f167908b) && !zX4, zX4, aVar8, null, 35)));
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    String str = (String) obj9;
                                    str.getClass();
                                    boolean zX5 = u21.d.x4(str);
                                    r53.p2 p2Var3 = dVar.f167924a;
                                    do {
                                        value5 = p2Var3.getValue();
                                    } while (!p2Var3.b(value5, u21.c.a((u21.c) value5, str, !zX5, zX5, s21.a.CUSTOM_ACTIVE_CALORIES, null, 33)));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    mVar.K(objQ15);
                } else {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new e23.l() { // from class: b21.r8
                            @Override // e23.l
                            public final Object invoke(Object obj9) {
                                Object value;
                                Object value2;
                                u21.c cVar2;
                                Object value3;
                                u21.c cVar3;
                                Object value4;
                                u21.c cVar4;
                                Object value5;
                                switch (i15) {
                                    case 0:
                                        l01.a aVar7 = (l01.a) obj9;
                                        aVar7.getClass();
                                        r53.p2 p2Var = dVar.f167924a;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, u21.c.a((u21.c) value, null, false, true, s21.a.ACTIVITY_MULTIPLIER, aVar7, 7)));
                                        return Unit.INSTANCE;
                                    case 1:
                                        s21.a aVar8 = (s21.a) obj9;
                                        aVar8.getClass();
                                        r53.p2 p2Var2 = dVar.f167924a;
                                        int i18 = u21.d.a.f167926a[aVar8.ordinal()];
                                        if (i18 == 1) {
                                            do {
                                                value2 = p2Var2.getValue();
                                                cVar2 = (u21.c) value2;
                                            } while (!p2Var2.b(value2, u21.c.a(cVar2, null, false, u21.d.x4(cVar2.f167907a), aVar8, null, 39)));
                                        } else if (i18 == 2) {
                                            do {
                                                value3 = p2Var2.getValue();
                                                cVar3 = (u21.c) value3;
                                            } while (!p2Var2.b(value3, u21.c.a(cVar3, null, false, cVar3.f167912f != null, aVar8, null, 39)));
                                        } else {
                                            if (i18 != 3) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            boolean zX4 = u21.d.x4(((u21.c) p2Var2.getValue()).f167908b);
                                            do {
                                                value4 = p2Var2.getValue();
                                                cVar4 = (u21.c) value4;
                                            } while (!p2Var2.b(value4, u21.c.a(cVar4, null, g22.n.d(cVar4.f167908b) && !zX4, zX4, aVar8, null, 35)));
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        String str = (String) obj9;
                                        str.getClass();
                                        boolean zX5 = u21.d.x4(str);
                                        r53.p2 p2Var3 = dVar.f167924a;
                                        do {
                                            value5 = p2Var3.getValue();
                                        } while (!p2Var3.b(value5, u21.c.a((u21.c) value5, str, !zX5, zX5, s21.a.CUSTOM_ACTIVE_CALORIES, null, 33)));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar.K(objQ15);
                    }
                }
                e23.l lVar6 = (e23.l) objQ15;
                boolean zR15 = mVar.r(dVar);
                Object objQ16 = mVar.q();
                if (zR15) {
                    objQ16 = new e23.l() { // from class: b21.r8
                        @Override // e23.l
                        public final Object invoke(Object obj9) {
                            Object value;
                            Object value2;
                            u21.c cVar2;
                            Object value3;
                            u21.c cVar3;
                            Object value4;
                            u21.c cVar4;
                            Object value5;
                            switch (i16) {
                                case 0:
                                    l01.a aVar7 = (l01.a) obj9;
                                    aVar7.getClass();
                                    r53.p2 p2Var = dVar.f167924a;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, u21.c.a((u21.c) value, null, false, true, s21.a.ACTIVITY_MULTIPLIER, aVar7, 7)));
                                    return Unit.INSTANCE;
                                case 1:
                                    s21.a aVar8 = (s21.a) obj9;
                                    aVar8.getClass();
                                    r53.p2 p2Var2 = dVar.f167924a;
                                    int i18 = u21.d.a.f167926a[aVar8.ordinal()];
                                    if (i18 == 1) {
                                        do {
                                            value2 = p2Var2.getValue();
                                            cVar2 = (u21.c) value2;
                                        } while (!p2Var2.b(value2, u21.c.a(cVar2, null, false, u21.d.x4(cVar2.f167907a), aVar8, null, 39)));
                                    } else if (i18 == 2) {
                                        do {
                                            value3 = p2Var2.getValue();
                                            cVar3 = (u21.c) value3;
                                        } while (!p2Var2.b(value3, u21.c.a(cVar3, null, false, cVar3.f167912f != null, aVar8, null, 39)));
                                    } else {
                                        if (i18 != 3) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        boolean zX4 = u21.d.x4(((u21.c) p2Var2.getValue()).f167908b);
                                        do {
                                            value4 = p2Var2.getValue();
                                            cVar4 = (u21.c) value4;
                                        } while (!p2Var2.b(value4, u21.c.a(cVar4, null, g22.n.d(cVar4.f167908b) && !zX4, zX4, aVar8, null, 35)));
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    String str = (String) obj9;
                                    str.getClass();
                                    boolean zX5 = u21.d.x4(str);
                                    r53.p2 p2Var3 = dVar.f167924a;
                                    do {
                                        value5 = p2Var3.getValue();
                                    } while (!p2Var3.b(value5, u21.c.a((u21.c) value5, str, !zX5, zX5, s21.a.CUSTOM_ACTIVE_CALORIES, null, 33)));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    mVar.K(objQ16);
                } else {
                    aVar.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        objQ16 = new e23.l() { // from class: b21.r8
                            @Override // e23.l
                            public final Object invoke(Object obj9) {
                                Object value;
                                Object value2;
                                u21.c cVar2;
                                Object value3;
                                u21.c cVar3;
                                Object value4;
                                u21.c cVar4;
                                Object value5;
                                switch (i16) {
                                    case 0:
                                        l01.a aVar7 = (l01.a) obj9;
                                        aVar7.getClass();
                                        r53.p2 p2Var = dVar.f167924a;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, u21.c.a((u21.c) value, null, false, true, s21.a.ACTIVITY_MULTIPLIER, aVar7, 7)));
                                        return Unit.INSTANCE;
                                    case 1:
                                        s21.a aVar8 = (s21.a) obj9;
                                        aVar8.getClass();
                                        r53.p2 p2Var2 = dVar.f167924a;
                                        int i18 = u21.d.a.f167926a[aVar8.ordinal()];
                                        if (i18 == 1) {
                                            do {
                                                value2 = p2Var2.getValue();
                                                cVar2 = (u21.c) value2;
                                            } while (!p2Var2.b(value2, u21.c.a(cVar2, null, false, u21.d.x4(cVar2.f167907a), aVar8, null, 39)));
                                        } else if (i18 == 2) {
                                            do {
                                                value3 = p2Var2.getValue();
                                                cVar3 = (u21.c) value3;
                                            } while (!p2Var2.b(value3, u21.c.a(cVar3, null, false, cVar3.f167912f != null, aVar8, null, 39)));
                                        } else {
                                            if (i18 != 3) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            boolean zX4 = u21.d.x4(((u21.c) p2Var2.getValue()).f167908b);
                                            do {
                                                value4 = p2Var2.getValue();
                                                cVar4 = (u21.c) value4;
                                            } while (!p2Var2.b(value4, u21.c.a(cVar4, null, g22.n.d(cVar4.f167908b) && !zX4, zX4, aVar8, null, 35)));
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        String str = (String) obj9;
                                        str.getClass();
                                        boolean zX5 = u21.d.x4(str);
                                        r53.p2 p2Var3 = dVar.f167924a;
                                        do {
                                            value5 = p2Var3.getValue();
                                        } while (!p2Var3.b(value5, u21.c.a((u21.c) value5, str, !zX5, zX5, s21.a.CUSTOM_ACTIVE_CALORIES, null, 33)));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar.K(objQ16);
                    }
                }
                e23.l lVar7 = (e23.l) objQ16;
                boolean zR16 = mVar.r(dVar);
                Object objQ17 = mVar.q();
                if (zR16) {
                    objQ17 = new e23.l() { // from class: b21.r8
                        @Override // e23.l
                        public final Object invoke(Object obj9) {
                            Object value;
                            Object value2;
                            u21.c cVar2;
                            Object value3;
                            u21.c cVar3;
                            Object value4;
                            u21.c cVar4;
                            Object value5;
                            switch (i17) {
                                case 0:
                                    l01.a aVar7 = (l01.a) obj9;
                                    aVar7.getClass();
                                    r53.p2 p2Var = dVar.f167924a;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, u21.c.a((u21.c) value, null, false, true, s21.a.ACTIVITY_MULTIPLIER, aVar7, 7)));
                                    return Unit.INSTANCE;
                                case 1:
                                    s21.a aVar8 = (s21.a) obj9;
                                    aVar8.getClass();
                                    r53.p2 p2Var2 = dVar.f167924a;
                                    int i18 = u21.d.a.f167926a[aVar8.ordinal()];
                                    if (i18 == 1) {
                                        do {
                                            value2 = p2Var2.getValue();
                                            cVar2 = (u21.c) value2;
                                        } while (!p2Var2.b(value2, u21.c.a(cVar2, null, false, u21.d.x4(cVar2.f167907a), aVar8, null, 39)));
                                    } else if (i18 == 2) {
                                        do {
                                            value3 = p2Var2.getValue();
                                            cVar3 = (u21.c) value3;
                                        } while (!p2Var2.b(value3, u21.c.a(cVar3, null, false, cVar3.f167912f != null, aVar8, null, 39)));
                                    } else {
                                        if (i18 != 3) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        boolean zX4 = u21.d.x4(((u21.c) p2Var2.getValue()).f167908b);
                                        do {
                                            value4 = p2Var2.getValue();
                                            cVar4 = (u21.c) value4;
                                        } while (!p2Var2.b(value4, u21.c.a(cVar4, null, g22.n.d(cVar4.f167908b) && !zX4, zX4, aVar8, null, 35)));
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    String str = (String) obj9;
                                    str.getClass();
                                    boolean zX5 = u21.d.x4(str);
                                    r53.p2 p2Var3 = dVar.f167924a;
                                    do {
                                        value5 = p2Var3.getValue();
                                    } while (!p2Var3.b(value5, u21.c.a((u21.c) value5, str, !zX5, zX5, s21.a.CUSTOM_ACTIVE_CALORIES, null, 33)));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    mVar.K(objQ17);
                } else {
                    aVar.getClass();
                    if (objQ17 == p3.m.a.f135155b) {
                        objQ17 = new e23.l() { // from class: b21.r8
                            @Override // e23.l
                            public final Object invoke(Object obj9) {
                                Object value;
                                Object value2;
                                u21.c cVar2;
                                Object value3;
                                u21.c cVar3;
                                Object value4;
                                u21.c cVar4;
                                Object value5;
                                switch (i17) {
                                    case 0:
                                        l01.a aVar7 = (l01.a) obj9;
                                        aVar7.getClass();
                                        r53.p2 p2Var = dVar.f167924a;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, u21.c.a((u21.c) value, null, false, true, s21.a.ACTIVITY_MULTIPLIER, aVar7, 7)));
                                        return Unit.INSTANCE;
                                    case 1:
                                        s21.a aVar8 = (s21.a) obj9;
                                        aVar8.getClass();
                                        r53.p2 p2Var2 = dVar.f167924a;
                                        int i18 = u21.d.a.f167926a[aVar8.ordinal()];
                                        if (i18 == 1) {
                                            do {
                                                value2 = p2Var2.getValue();
                                                cVar2 = (u21.c) value2;
                                            } while (!p2Var2.b(value2, u21.c.a(cVar2, null, false, u21.d.x4(cVar2.f167907a), aVar8, null, 39)));
                                        } else if (i18 == 2) {
                                            do {
                                                value3 = p2Var2.getValue();
                                                cVar3 = (u21.c) value3;
                                            } while (!p2Var2.b(value3, u21.c.a(cVar3, null, false, cVar3.f167912f != null, aVar8, null, 39)));
                                        } else {
                                            if (i18 != 3) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            boolean zX4 = u21.d.x4(((u21.c) p2Var2.getValue()).f167908b);
                                            do {
                                                value4 = p2Var2.getValue();
                                                cVar4 = (u21.c) value4;
                                            } while (!p2Var2.b(value4, u21.c.a(cVar4, null, g22.n.d(cVar4.f167908b) && !zX4, zX4, aVar8, null, 35)));
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        String str = (String) obj9;
                                        str.getClass();
                                        boolean zX5 = u21.d.x4(str);
                                        r53.p2 p2Var3 = dVar.f167924a;
                                        do {
                                            value5 = p2Var3.getValue();
                                        } while (!p2Var3.b(value5, u21.c.a((u21.c) value5, str, !zX5, zX5, s21.a.CUSTOM_ACTIVE_CALORIES, null, 33)));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        mVar.K(objQ17);
                    }
                }
                e23.l lVar8 = (e23.l) objQ17;
                boolean zR17 = mVar.r(m0Var) | mVar.B(p1VarC3);
                Object objQ18 = mVar.q();
                if (zR17) {
                    objQ18 = new s8(m0Var, p1VarC3, 0);
                    mVar.K(objQ18);
                } else {
                    aVar.getClass();
                    if (objQ18 == p3.m.a.f135155b) {
                        objQ18 = new s8(m0Var, p1VarC3, 0);
                        mVar.K(objQ18);
                    }
                }
                e23.a aVar7 = (e23.a) objQ18;
                boolean zR18 = mVar.r(m0Var);
                Object objQ19 = mVar.q();
                if (zR18) {
                    objQ19 = new aa2.m(m0Var, 12);
                    mVar.K(objQ19);
                } else {
                    aVar.getClass();
                    if (objQ19 == p3.m.a.f135155b) {
                        objQ19 = new aa2.m(m0Var, 12);
                        mVar.K(objQ19);
                    }
                }
                t21.b.c(cVar, this.f14668d, lVar6, lVar7, lVar8, aVar7, (e23.a) objQ19, mVar, 0);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f9(lc.v vVar, v21.e eVar, lc.m0 m0Var, int i14) {
        this.f14665a = i14;
        this.f14666b = vVar;
        this.f14668d = eVar;
        this.f14667c = m0Var;
    }
}
