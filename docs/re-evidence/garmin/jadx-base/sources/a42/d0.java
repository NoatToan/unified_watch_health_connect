package a42;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b21.e5;
import b21.l4;
import c2.x2;
import ca0.b1;
import ca0.d2;
import ca0.e4;
import ca0.f4;
import ca0.g4;
import ca0.i0;
import ca0.j0;
import ca0.j1;
import ca0.l2;
import ca0.n1;
import ca0.o0;
import ca0.o1;
import ca0.o2;
import ca0.r1;
import ca0.s1;
import ca0.t1;
import ca0.t2;
import ca0.v0;
import ca0.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import com.garmin.proto.generated.WifiSetup;
import ew1.c2;
import i3.d6;
import i3.fe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.m0;
import m92.p0;
import mp.k;
import org.joda.time.LocalDate;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.u0;
import p3.l0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.q2;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d0 implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f997e;

    public /* synthetic */ d0(e23.a aVar, e23.l lVar, e23.l lVar2, e23.a aVar2) {
        this.f993a = 10;
        this.f995c = aVar;
        this.f996d = lVar;
        this.f994b = lVar2;
        this.f997e = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0139  */
    /* JADX WARN: Code duplicated, block: B:53:0x0154  */
    /* JADX WARN: Code duplicated, block: B:58:0x016f  */
    /* JADX WARN: Code duplicated, block: B:63:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        i53.c cVar = (i53.c) this.f994b;
        final ew0.m mVar = (ew0.m) this.f995c;
        x3 x3Var = (x3) this.f997e;
        x3 x3Var2 = (x3) this.f996d;
        ew0.g0 g0Var = (ew0.g0) obj;
        p3.m mVar2 = (p3.m) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        g0Var.getClass();
        ((c12.h) obj2).getClass();
        final int i14 = 2;
        final int i15 = 4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? mVar2.B(g0Var) : mVar2.r(g0Var) ? 4 : 2;
        }
        final int i16 = 1;
        final int i17 = 0;
        if (mVar2.n(iIntValue & 1, (iIntValue & 131) != 130)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = g0Var instanceof ew0.g0.d;
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                mVar2.C(1816045724);
                boolean zR = mVar2.r(mVar);
                Object objQ = mVar2.q();
                if (zR) {
                    objQ = new ew0.a0(mVar);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ew0.a0(mVar);
                        mVar2.K(objQ);
                    }
                }
                e23.l lVar = (e23.l) ((k23.g) objQ);
                boolean zR2 = mVar2.r(mVar);
                Object objQ2 = mVar2.q();
                if (zR2) {
                    objQ2 = new ew0.b0(mVar);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ew0.b0(mVar);
                        mVar2.K(objQ2);
                    }
                }
                ew0.c0.f(cVar, lVar, (e23.q) ((k23.g) objQ2), mVar2, pv0.d.f141356k);
                mVar2.f();
            } else if (g0Var instanceof ew0.g0.c) {
                mVar2.C(2136802426);
                ew0.c0.e(cVar, mVar2, pv0.d.f141356k);
                mVar2.f();
            } else if (g0Var instanceof ew0.g0.a) {
                mVar2.C(1816481708);
                String strQ = gl1.y.Q(mVar2, R.string.msg_do_you_want_to_log_behaviors);
                String strQ2 = gl1.y.Q(mVar2, R.string.msg_auto_log_behaviors);
                i53.c cVarE = i53.a.e((List) x3Var.getF182175a());
                boolean z15 = ((ew0.d0) x3Var2.getF182175a()).f66201b;
                boolean zR3 = mVar2.r(mVar);
                Object objQ3 = mVar2.q();
                if (zR3) {
                    objQ3 = new e23.l() { // from class: ew0.v
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            Object value;
                            boolean z16;
                            Object value2;
                            rd1.a aVar2;
                            Object value3;
                            rd1.a aVar3;
                            Object value4;
                            rd1.a aVar4;
                            Object value5;
                            rd1.a aVar5;
                            switch (i17) {
                                case 0:
                                    boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                    p2 p2Var = mVar.f66249p;
                                    do {
                                        value = p2Var.getValue();
                                        d0 d0Var = (d0) value;
                                        z16 = d0Var.f66200a;
                                        d0Var.getClass();
                                    } while (!p2Var.b(value, new d0(z16, zBooleanValue)));
                                    break;
                                case 1:
                                    boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                    p2 p2Var2 = mVar.f66245l;
                                    do {
                                        value2 = p2Var2.getValue();
                                        aVar2 = (rd1.a) value2;
                                    } while (!p2Var2.b(value2, rd1.a.a(aVar2, qd1.a.a(aVar2.f152032a, zBooleanValue2, null, null, 14), null, 14)));
                                    break;
                                case 2:
                                    b63.v vVar = (b63.v) obj5;
                                    vVar.getClass();
                                    m mVar3 = mVar;
                                    mVar3.getClass();
                                    p2 p2Var3 = mVar3.f66245l;
                                    do {
                                        value3 = p2Var3.getValue();
                                        aVar3 = (rd1.a) value3;
                                    } while (!p2Var3.b(value3, rd1.a.a(aVar3, qd1.a.a(aVar3.f152032a, false, null, vVar, 11), null, 14)));
                                    break;
                                case 3:
                                    boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                    p2 p2Var4 = mVar.f66245l;
                                    do {
                                        value4 = p2Var4.getValue();
                                        aVar4 = (rd1.a) value4;
                                    } while (!p2Var4.b(value4, rd1.a.a(aVar4, null, qd1.a.a(aVar4.f152033b, zBooleanValue3, null, null, 14), 13)));
                                    break;
                                default:
                                    b63.v vVar2 = (b63.v) obj5;
                                    vVar2.getClass();
                                    m mVar4 = mVar;
                                    mVar4.getClass();
                                    p2 p2Var5 = mVar4.f66245l;
                                    do {
                                        value5 = p2Var5.getValue();
                                        aVar5 = (rd1.a) value5;
                                    } while (!p2Var5.b(value5, rd1.a.a(aVar5, null, qd1.a.a(aVar5.f152033b, false, null, vVar2, 11), 13)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new e23.l() { // from class: ew0.v
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                Object value;
                                boolean z16;
                                Object value2;
                                rd1.a aVar2;
                                Object value3;
                                rd1.a aVar3;
                                Object value4;
                                rd1.a aVar4;
                                Object value5;
                                rd1.a aVar5;
                                switch (i17) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                        p2 p2Var = mVar.f66249p;
                                        do {
                                            value = p2Var.getValue();
                                            d0 d0Var = (d0) value;
                                            z16 = d0Var.f66200a;
                                            d0Var.getClass();
                                        } while (!p2Var.b(value, new d0(z16, zBooleanValue)));
                                        break;
                                    case 1:
                                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                        p2 p2Var2 = mVar.f66245l;
                                        do {
                                            value2 = p2Var2.getValue();
                                            aVar2 = (rd1.a) value2;
                                        } while (!p2Var2.b(value2, rd1.a.a(aVar2, qd1.a.a(aVar2.f152032a, zBooleanValue2, null, null, 14), null, 14)));
                                        break;
                                    case 2:
                                        b63.v vVar = (b63.v) obj5;
                                        vVar.getClass();
                                        m mVar3 = mVar;
                                        mVar3.getClass();
                                        p2 p2Var3 = mVar3.f66245l;
                                        do {
                                            value3 = p2Var3.getValue();
                                            aVar3 = (rd1.a) value3;
                                        } while (!p2Var3.b(value3, rd1.a.a(aVar3, qd1.a.a(aVar3.f152032a, false, null, vVar, 11), null, 14)));
                                        break;
                                    case 3:
                                        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                        p2 p2Var4 = mVar.f66245l;
                                        do {
                                            value4 = p2Var4.getValue();
                                            aVar4 = (rd1.a) value4;
                                        } while (!p2Var4.b(value4, rd1.a.a(aVar4, null, qd1.a.a(aVar4.f152033b, zBooleanValue3, null, null, 14), 13)));
                                        break;
                                    default:
                                        b63.v vVar2 = (b63.v) obj5;
                                        vVar2.getClass();
                                        m mVar4 = mVar;
                                        mVar4.getClass();
                                        p2 p2Var5 = mVar4.f66245l;
                                        do {
                                            value5 = p2Var5.getValue();
                                            aVar5 = (rd1.a) value5;
                                        } while (!p2Var5.b(value5, rd1.a.a(aVar5, null, qd1.a.a(aVar5.f152033b, false, null, vVar2, 11), 13)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    }
                }
                xv0.a.a(strQ, strQ2, cVarE, z15, false, (e23.l) objQ3, mVar2, 0, 16);
                mVar2.f();
            } else {
                if (!(g0Var instanceof ew0.g0.b)) {
                    throw n23.j.m(mVar2, 2136791004);
                }
                mVar2.C(1817021387);
                rd1.a aVar2 = (rd1.a) s9.c.c(mVar.f66246m, mVar2).getF182175a();
                boolean zR4 = mVar2.r(mVar);
                Object objQ4 = mVar2.q();
                if (zR4) {
                    objQ4 = new e23.l() { // from class: ew0.v
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            Object value;
                            boolean z16;
                            Object value2;
                            rd1.a aVar3;
                            Object value3;
                            rd1.a aVar4;
                            Object value4;
                            rd1.a aVar5;
                            Object value5;
                            rd1.a aVar6;
                            switch (i16) {
                                case 0:
                                    boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                    p2 p2Var = mVar.f66249p;
                                    do {
                                        value = p2Var.getValue();
                                        d0 d0Var = (d0) value;
                                        z16 = d0Var.f66200a;
                                        d0Var.getClass();
                                    } while (!p2Var.b(value, new d0(z16, zBooleanValue)));
                                    break;
                                case 1:
                                    boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                    p2 p2Var2 = mVar.f66245l;
                                    do {
                                        value2 = p2Var2.getValue();
                                        aVar3 = (rd1.a) value2;
                                    } while (!p2Var2.b(value2, rd1.a.a(aVar3, qd1.a.a(aVar3.f152032a, zBooleanValue2, null, null, 14), null, 14)));
                                    break;
                                case 2:
                                    b63.v vVar = (b63.v) obj5;
                                    vVar.getClass();
                                    m mVar3 = mVar;
                                    mVar3.getClass();
                                    p2 p2Var3 = mVar3.f66245l;
                                    do {
                                        value3 = p2Var3.getValue();
                                        aVar4 = (rd1.a) value3;
                                    } while (!p2Var3.b(value3, rd1.a.a(aVar4, qd1.a.a(aVar4.f152032a, false, null, vVar, 11), null, 14)));
                                    break;
                                case 3:
                                    boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                    p2 p2Var4 = mVar.f66245l;
                                    do {
                                        value4 = p2Var4.getValue();
                                        aVar5 = (rd1.a) value4;
                                    } while (!p2Var4.b(value4, rd1.a.a(aVar5, null, qd1.a.a(aVar5.f152033b, zBooleanValue3, null, null, 14), 13)));
                                    break;
                                default:
                                    b63.v vVar2 = (b63.v) obj5;
                                    vVar2.getClass();
                                    m mVar4 = mVar;
                                    mVar4.getClass();
                                    p2 p2Var5 = mVar4.f66245l;
                                    do {
                                        value5 = p2Var5.getValue();
                                        aVar6 = (rd1.a) value5;
                                    } while (!p2Var5.b(value5, rd1.a.a(aVar6, null, qd1.a.a(aVar6.f152033b, false, null, vVar2, 11), 13)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new e23.l() { // from class: ew0.v
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                Object value;
                                boolean z16;
                                Object value2;
                                rd1.a aVar3;
                                Object value3;
                                rd1.a aVar4;
                                Object value4;
                                rd1.a aVar5;
                                Object value5;
                                rd1.a aVar6;
                                switch (i16) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                        p2 p2Var = mVar.f66249p;
                                        do {
                                            value = p2Var.getValue();
                                            d0 d0Var = (d0) value;
                                            z16 = d0Var.f66200a;
                                            d0Var.getClass();
                                        } while (!p2Var.b(value, new d0(z16, zBooleanValue)));
                                        break;
                                    case 1:
                                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                        p2 p2Var2 = mVar.f66245l;
                                        do {
                                            value2 = p2Var2.getValue();
                                            aVar3 = (rd1.a) value2;
                                        } while (!p2Var2.b(value2, rd1.a.a(aVar3, qd1.a.a(aVar3.f152032a, zBooleanValue2, null, null, 14), null, 14)));
                                        break;
                                    case 2:
                                        b63.v vVar = (b63.v) obj5;
                                        vVar.getClass();
                                        m mVar3 = mVar;
                                        mVar3.getClass();
                                        p2 p2Var3 = mVar3.f66245l;
                                        do {
                                            value3 = p2Var3.getValue();
                                            aVar4 = (rd1.a) value3;
                                        } while (!p2Var3.b(value3, rd1.a.a(aVar4, qd1.a.a(aVar4.f152032a, false, null, vVar, 11), null, 14)));
                                        break;
                                    case 3:
                                        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                        p2 p2Var4 = mVar.f66245l;
                                        do {
                                            value4 = p2Var4.getValue();
                                            aVar5 = (rd1.a) value4;
                                        } while (!p2Var4.b(value4, rd1.a.a(aVar5, null, qd1.a.a(aVar5.f152033b, zBooleanValue3, null, null, 14), 13)));
                                        break;
                                    default:
                                        b63.v vVar2 = (b63.v) obj5;
                                        vVar2.getClass();
                                        m mVar4 = mVar;
                                        mVar4.getClass();
                                        p2 p2Var5 = mVar4.f66245l;
                                        do {
                                            value5 = p2Var5.getValue();
                                            aVar6 = (rd1.a) value5;
                                        } while (!p2Var5.b(value5, rd1.a.a(aVar6, null, qd1.a.a(aVar6.f152033b, false, null, vVar2, 11), 13)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ4);
                    }
                }
                e23.l lVar2 = (e23.l) objQ4;
                boolean zR5 = mVar2.r(mVar);
                Object objQ5 = mVar2.q();
                if (zR5) {
                    objQ5 = new e23.l() { // from class: ew0.v
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            Object value;
                            boolean z16;
                            Object value2;
                            rd1.a aVar3;
                            Object value3;
                            rd1.a aVar4;
                            Object value4;
                            rd1.a aVar5;
                            Object value5;
                            rd1.a aVar6;
                            switch (i14) {
                                case 0:
                                    boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                    p2 p2Var = mVar.f66249p;
                                    do {
                                        value = p2Var.getValue();
                                        d0 d0Var = (d0) value;
                                        z16 = d0Var.f66200a;
                                        d0Var.getClass();
                                    } while (!p2Var.b(value, new d0(z16, zBooleanValue)));
                                    break;
                                case 1:
                                    boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                    p2 p2Var2 = mVar.f66245l;
                                    do {
                                        value2 = p2Var2.getValue();
                                        aVar3 = (rd1.a) value2;
                                    } while (!p2Var2.b(value2, rd1.a.a(aVar3, qd1.a.a(aVar3.f152032a, zBooleanValue2, null, null, 14), null, 14)));
                                    break;
                                case 2:
                                    b63.v vVar = (b63.v) obj5;
                                    vVar.getClass();
                                    m mVar3 = mVar;
                                    mVar3.getClass();
                                    p2 p2Var3 = mVar3.f66245l;
                                    do {
                                        value3 = p2Var3.getValue();
                                        aVar4 = (rd1.a) value3;
                                    } while (!p2Var3.b(value3, rd1.a.a(aVar4, qd1.a.a(aVar4.f152032a, false, null, vVar, 11), null, 14)));
                                    break;
                                case 3:
                                    boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                    p2 p2Var4 = mVar.f66245l;
                                    do {
                                        value4 = p2Var4.getValue();
                                        aVar5 = (rd1.a) value4;
                                    } while (!p2Var4.b(value4, rd1.a.a(aVar5, null, qd1.a.a(aVar5.f152033b, zBooleanValue3, null, null, 14), 13)));
                                    break;
                                default:
                                    b63.v vVar2 = (b63.v) obj5;
                                    vVar2.getClass();
                                    m mVar4 = mVar;
                                    mVar4.getClass();
                                    p2 p2Var5 = mVar4.f66245l;
                                    do {
                                        value5 = p2Var5.getValue();
                                        aVar6 = (rd1.a) value5;
                                    } while (!p2Var5.b(value5, rd1.a.a(aVar6, null, qd1.a.a(aVar6.f152033b, false, null, vVar2, 11), 13)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new e23.l() { // from class: ew0.v
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                Object value;
                                boolean z16;
                                Object value2;
                                rd1.a aVar3;
                                Object value3;
                                rd1.a aVar4;
                                Object value4;
                                rd1.a aVar5;
                                Object value5;
                                rd1.a aVar6;
                                switch (i14) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                        p2 p2Var = mVar.f66249p;
                                        do {
                                            value = p2Var.getValue();
                                            d0 d0Var = (d0) value;
                                            z16 = d0Var.f66200a;
                                            d0Var.getClass();
                                        } while (!p2Var.b(value, new d0(z16, zBooleanValue)));
                                        break;
                                    case 1:
                                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                        p2 p2Var2 = mVar.f66245l;
                                        do {
                                            value2 = p2Var2.getValue();
                                            aVar3 = (rd1.a) value2;
                                        } while (!p2Var2.b(value2, rd1.a.a(aVar3, qd1.a.a(aVar3.f152032a, zBooleanValue2, null, null, 14), null, 14)));
                                        break;
                                    case 2:
                                        b63.v vVar = (b63.v) obj5;
                                        vVar.getClass();
                                        m mVar3 = mVar;
                                        mVar3.getClass();
                                        p2 p2Var3 = mVar3.f66245l;
                                        do {
                                            value3 = p2Var3.getValue();
                                            aVar4 = (rd1.a) value3;
                                        } while (!p2Var3.b(value3, rd1.a.a(aVar4, qd1.a.a(aVar4.f152032a, false, null, vVar, 11), null, 14)));
                                        break;
                                    case 3:
                                        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                        p2 p2Var4 = mVar.f66245l;
                                        do {
                                            value4 = p2Var4.getValue();
                                            aVar5 = (rd1.a) value4;
                                        } while (!p2Var4.b(value4, rd1.a.a(aVar5, null, qd1.a.a(aVar5.f152033b, zBooleanValue3, null, null, 14), 13)));
                                        break;
                                    default:
                                        b63.v vVar2 = (b63.v) obj5;
                                        vVar2.getClass();
                                        m mVar4 = mVar;
                                        mVar4.getClass();
                                        p2 p2Var5 = mVar4.f66245l;
                                        do {
                                            value5 = p2Var5.getValue();
                                            aVar6 = (rd1.a) value5;
                                        } while (!p2Var5.b(value5, rd1.a.a(aVar6, null, qd1.a.a(aVar6.f152033b, false, null, vVar2, 11), 13)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ5);
                    }
                }
                e23.l lVar3 = (e23.l) objQ5;
                boolean zR6 = mVar2.r(mVar);
                Object objQ6 = mVar2.q();
                if (zR6) {
                    final int i18 = 3;
                    objQ6 = new e23.l() { // from class: ew0.v
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            Object value;
                            boolean z16;
                            Object value2;
                            rd1.a aVar3;
                            Object value3;
                            rd1.a aVar4;
                            Object value4;
                            rd1.a aVar5;
                            Object value5;
                            rd1.a aVar6;
                            switch (i18) {
                                case 0:
                                    boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                    p2 p2Var = mVar.f66249p;
                                    do {
                                        value = p2Var.getValue();
                                        d0 d0Var = (d0) value;
                                        z16 = d0Var.f66200a;
                                        d0Var.getClass();
                                    } while (!p2Var.b(value, new d0(z16, zBooleanValue)));
                                    break;
                                case 1:
                                    boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                    p2 p2Var2 = mVar.f66245l;
                                    do {
                                        value2 = p2Var2.getValue();
                                        aVar3 = (rd1.a) value2;
                                    } while (!p2Var2.b(value2, rd1.a.a(aVar3, qd1.a.a(aVar3.f152032a, zBooleanValue2, null, null, 14), null, 14)));
                                    break;
                                case 2:
                                    b63.v vVar = (b63.v) obj5;
                                    vVar.getClass();
                                    m mVar3 = mVar;
                                    mVar3.getClass();
                                    p2 p2Var3 = mVar3.f66245l;
                                    do {
                                        value3 = p2Var3.getValue();
                                        aVar4 = (rd1.a) value3;
                                    } while (!p2Var3.b(value3, rd1.a.a(aVar4, qd1.a.a(aVar4.f152032a, false, null, vVar, 11), null, 14)));
                                    break;
                                case 3:
                                    boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                    p2 p2Var4 = mVar.f66245l;
                                    do {
                                        value4 = p2Var4.getValue();
                                        aVar5 = (rd1.a) value4;
                                    } while (!p2Var4.b(value4, rd1.a.a(aVar5, null, qd1.a.a(aVar5.f152033b, zBooleanValue3, null, null, 14), 13)));
                                    break;
                                default:
                                    b63.v vVar2 = (b63.v) obj5;
                                    vVar2.getClass();
                                    m mVar4 = mVar;
                                    mVar4.getClass();
                                    p2 p2Var5 = mVar4.f66245l;
                                    do {
                                        value5 = p2Var5.getValue();
                                        aVar6 = (rd1.a) value5;
                                    } while (!p2Var5.b(value5, rd1.a.a(aVar6, null, qd1.a.a(aVar6.f152033b, false, null, vVar2, 11), 13)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        final int i19 = 3;
                        objQ6 = new e23.l() { // from class: ew0.v
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                Object value;
                                boolean z16;
                                Object value2;
                                rd1.a aVar3;
                                Object value3;
                                rd1.a aVar4;
                                Object value4;
                                rd1.a aVar5;
                                Object value5;
                                rd1.a aVar6;
                                switch (i19) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                        p2 p2Var = mVar.f66249p;
                                        do {
                                            value = p2Var.getValue();
                                            d0 d0Var = (d0) value;
                                            z16 = d0Var.f66200a;
                                            d0Var.getClass();
                                        } while (!p2Var.b(value, new d0(z16, zBooleanValue)));
                                        break;
                                    case 1:
                                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                        p2 p2Var2 = mVar.f66245l;
                                        do {
                                            value2 = p2Var2.getValue();
                                            aVar3 = (rd1.a) value2;
                                        } while (!p2Var2.b(value2, rd1.a.a(aVar3, qd1.a.a(aVar3.f152032a, zBooleanValue2, null, null, 14), null, 14)));
                                        break;
                                    case 2:
                                        b63.v vVar = (b63.v) obj5;
                                        vVar.getClass();
                                        m mVar3 = mVar;
                                        mVar3.getClass();
                                        p2 p2Var3 = mVar3.f66245l;
                                        do {
                                            value3 = p2Var3.getValue();
                                            aVar4 = (rd1.a) value3;
                                        } while (!p2Var3.b(value3, rd1.a.a(aVar4, qd1.a.a(aVar4.f152032a, false, null, vVar, 11), null, 14)));
                                        break;
                                    case 3:
                                        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                        p2 p2Var4 = mVar.f66245l;
                                        do {
                                            value4 = p2Var4.getValue();
                                            aVar5 = (rd1.a) value4;
                                        } while (!p2Var4.b(value4, rd1.a.a(aVar5, null, qd1.a.a(aVar5.f152033b, zBooleanValue3, null, null, 14), 13)));
                                        break;
                                    default:
                                        b63.v vVar2 = (b63.v) obj5;
                                        vVar2.getClass();
                                        m mVar4 = mVar;
                                        mVar4.getClass();
                                        p2 p2Var5 = mVar4.f66245l;
                                        do {
                                            value5 = p2Var5.getValue();
                                            aVar6 = (rd1.a) value5;
                                        } while (!p2Var5.b(value5, rd1.a.a(aVar6, null, qd1.a.a(aVar6.f152033b, false, null, vVar2, 11), 13)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ6);
                    }
                }
                e23.l lVar4 = (e23.l) objQ6;
                boolean zR7 = mVar2.r(mVar);
                Object objQ7 = mVar2.q();
                if (zR7) {
                    objQ7 = new e23.l() { // from class: ew0.v
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            Object value;
                            boolean z16;
                            Object value2;
                            rd1.a aVar3;
                            Object value3;
                            rd1.a aVar4;
                            Object value4;
                            rd1.a aVar5;
                            Object value5;
                            rd1.a aVar6;
                            switch (i15) {
                                case 0:
                                    boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                    p2 p2Var = mVar.f66249p;
                                    do {
                                        value = p2Var.getValue();
                                        d0 d0Var = (d0) value;
                                        z16 = d0Var.f66200a;
                                        d0Var.getClass();
                                    } while (!p2Var.b(value, new d0(z16, zBooleanValue)));
                                    break;
                                case 1:
                                    boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                    p2 p2Var2 = mVar.f66245l;
                                    do {
                                        value2 = p2Var2.getValue();
                                        aVar3 = (rd1.a) value2;
                                    } while (!p2Var2.b(value2, rd1.a.a(aVar3, qd1.a.a(aVar3.f152032a, zBooleanValue2, null, null, 14), null, 14)));
                                    break;
                                case 2:
                                    b63.v vVar = (b63.v) obj5;
                                    vVar.getClass();
                                    m mVar3 = mVar;
                                    mVar3.getClass();
                                    p2 p2Var3 = mVar3.f66245l;
                                    do {
                                        value3 = p2Var3.getValue();
                                        aVar4 = (rd1.a) value3;
                                    } while (!p2Var3.b(value3, rd1.a.a(aVar4, qd1.a.a(aVar4.f152032a, false, null, vVar, 11), null, 14)));
                                    break;
                                case 3:
                                    boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                    p2 p2Var4 = mVar.f66245l;
                                    do {
                                        value4 = p2Var4.getValue();
                                        aVar5 = (rd1.a) value4;
                                    } while (!p2Var4.b(value4, rd1.a.a(aVar5, null, qd1.a.a(aVar5.f152033b, zBooleanValue3, null, null, 14), 13)));
                                    break;
                                default:
                                    b63.v vVar2 = (b63.v) obj5;
                                    vVar2.getClass();
                                    m mVar4 = mVar;
                                    mVar4.getClass();
                                    p2 p2Var5 = mVar4.f66245l;
                                    do {
                                        value5 = p2Var5.getValue();
                                        aVar6 = (rd1.a) value5;
                                    } while (!p2Var5.b(value5, rd1.a.a(aVar6, null, qd1.a.a(aVar6.f152033b, false, null, vVar2, 11), 13)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new e23.l() { // from class: ew0.v
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                Object value;
                                boolean z16;
                                Object value2;
                                rd1.a aVar3;
                                Object value3;
                                rd1.a aVar4;
                                Object value4;
                                rd1.a aVar5;
                                Object value5;
                                rd1.a aVar6;
                                switch (i15) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                                        p2 p2Var = mVar.f66249p;
                                        do {
                                            value = p2Var.getValue();
                                            d0 d0Var = (d0) value;
                                            z16 = d0Var.f66200a;
                                            d0Var.getClass();
                                        } while (!p2Var.b(value, new d0(z16, zBooleanValue)));
                                        break;
                                    case 1:
                                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                        p2 p2Var2 = mVar.f66245l;
                                        do {
                                            value2 = p2Var2.getValue();
                                            aVar3 = (rd1.a) value2;
                                        } while (!p2Var2.b(value2, rd1.a.a(aVar3, qd1.a.a(aVar3.f152032a, zBooleanValue2, null, null, 14), null, 14)));
                                        break;
                                    case 2:
                                        b63.v vVar = (b63.v) obj5;
                                        vVar.getClass();
                                        m mVar3 = mVar;
                                        mVar3.getClass();
                                        p2 p2Var3 = mVar3.f66245l;
                                        do {
                                            value3 = p2Var3.getValue();
                                            aVar4 = (rd1.a) value3;
                                        } while (!p2Var3.b(value3, rd1.a.a(aVar4, qd1.a.a(aVar4.f152032a, false, null, vVar, 11), null, 14)));
                                        break;
                                    case 3:
                                        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                                        p2 p2Var4 = mVar.f66245l;
                                        do {
                                            value4 = p2Var4.getValue();
                                            aVar5 = (rd1.a) value4;
                                        } while (!p2Var4.b(value4, rd1.a.a(aVar5, null, qd1.a.a(aVar5.f152033b, zBooleanValue3, null, null, 14), 13)));
                                        break;
                                    default:
                                        b63.v vVar2 = (b63.v) obj5;
                                        vVar2.getClass();
                                        m mVar4 = mVar;
                                        mVar4.getClass();
                                        p2 p2Var5 = mVar4.f66245l;
                                        do {
                                            value5 = p2Var5.getValue();
                                            aVar6 = (rd1.a) value5;
                                        } while (!p2Var5.b(value5, rd1.a.a(aVar6, null, qd1.a.a(aVar6.f152033b, false, null, vVar2, 11), 13)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ7);
                    }
                }
                ew0.c0.d(aVar2, lVar2, lVar3, lVar4, (e23.l) objQ7, mVar2, 8);
                mVar2.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        c.q qVar = (c.q) this.f994b;
        Context context = (Context) this.f995c;
        l80.b bVar = (l80.b) this.f996d;
        m0 m0Var = (m0) this.f997e;
        long jLongValue = ((Long) obj).longValue();
        zf2.d dVar = (zf2.d) obj2;
        zf2.i iVar = (zf2.i) obj3;
        String str = (String) obj4;
        dVar.getClass();
        if (bVar.a(jLongValue)) {
            qVar.a(gl1.q.a(context, jLongValue, dVar, iVar, str, false, false, false, 224), null);
            Unit unit = Unit.INSTANCE;
        } else {
            m0Var.getClass();
            lc.y.l(m0Var, new gl1.f(jLongValue));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0072  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:6:0x0044  */
    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        kl1.a aVar = (kl1.a) this.f994b;
        gl1.a aVar2 = (gl1.a) this.f996d;
        e23.a aVar3 = (e23.a) this.f995c;
        lc.y yVar = (lc.y) this.f997e;
        lc.v vVar = (lc.v) obj2;
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        ((r1.l) obj).getClass();
        vVar.getClass();
        x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        p3.m.a aVar4 = p3.m.f135153a;
        if (zB) {
            objQ = yVar.c(s0.f105811a.b(gl1.s.class));
            mVar.K(objQ);
        } else {
            aVar4.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = yVar.c(s0.f105811a.b(gl1.s.class));
                mVar.K(objQ);
            }
        }
        t0 t0Var = s0.f105811a;
        long j8 = ((gl1.s) lc.w.a((lc.v) objQ, t0Var.b(gl1.s.class))).f77863a;
        boolean zL = mVar.l(j8);
        Object objQ2 = mVar.q();
        if (zL) {
            objQ2 = new a90.b(j8, 8);
            mVar.K(objQ2);
        } else {
            aVar4.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new a90.b(j8, 8);
                mVar.K(objQ2);
            }
        }
        e23.a aVar5 = (e23.a) objQ2;
        mVar.L(-1614864554);
        v9.a.f176280a.getClass();
        ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
        if (viewModelStoreOwnerA == null) {
            vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(jl1.g.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), aVar5);
        mVar.R();
        jl1.g gVar = (jl1.g) u1VarResolveViewModel;
        boolean zB2 = mVar.B(aVar2) | mVar.l(j8);
        Object objQ3 = mVar.q();
        if (zB2) {
            objQ3 = new bb2.b(aVar2, j8, 5);
            mVar.K(objQ3);
        } else {
            aVar4.getClass();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = new bb2.b(aVar2, j8, 5);
                mVar.K(objQ3);
            }
        }
        jl1.f.d(gVar, aVar, true, (e23.l) objQ3, aVar3, mVar, 384, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0072  */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        ArrayList arrayList = (ArrayList) this.f994b;
        ug2.x xVar = (ug2.x) this.f996d;
        e23.a aVar = (e23.a) this.f995c;
        e23.a aVar2 = (e23.a) this.f997e;
        int iIntValue = ((Integer) obj2).intValue();
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        ((h2.c0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        gw0.a aVar3 = (gw0.a) p13.h0.e0(iIntValue, arrayList);
        int i14 = aVar3 == null ? -1 : gw0.t.a.f79758b[aVar3.ordinal()];
        if (i14 == 1) {
            mVar.C(1199053351);
            boolean zB = mVar.B(xVar) | mVar.B(aVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new gp.f(8, xVar, aVar);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gp.f(8, xVar, aVar);
                    mVar.K(objQ);
                }
            }
            gw0.t.a((e23.a) objQ, aVar, mVar, 0);
            mVar.f();
        } else if (i14 != 2) {
            mVar.C(1199562402);
            mVar.f();
        } else {
            mVar.C(1199440603);
            gw0.t.e(aVar2, mVar, 0);
            mVar.f();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        v21.e eVar = (v21.e) this.f994b;
        g21.u uVar = (g21.u) this.f995c;
        g21.f0 f0Var = (g21.f0) this.f996d;
        i53.c cVar = (i53.c) this.f997e;
        g21.t tVar = (g21.t) obj2;
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        ((r1.l) obj).getClass();
        tVar.getClass();
        x1 x1Var = p3.n.f135158a;
        int i14 = h21.y.a.f81198a[tVar.ordinal()];
        if (i14 == 1) {
            mVar.C(103132185);
            h21.y.a(eVar, null, uVar, f0Var, mVar, 48);
            mVar.f();
        } else {
            if (i14 != 2) {
                throw n23.j.m(mVar, 418967323);
            }
            mVar.C(103473588);
            z01.c.a(x2.f(h4.r.S, 1.0f), eVar, null, uVar, f0Var, null, cVar, false, mVar, 12779910, 0);
            mVar.f();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0071  */
    /* JADX WARN: Code duplicated, block: B:6:0x0054  */
    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        o82.a aVar = (o82.a) this.f994b;
        o82.g gVar = (o82.g) this.f995c;
        h60.h hVar = (h60.h) this.f996d;
        n82.f fVar = (n82.f) this.f997e;
        u82.f fVar2 = (u82.f) obj2;
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        ((c2.t) obj).getClass();
        fVar2.getClass();
        x1 x1Var = p3.n.f135158a;
        LocalDate localDateH = g22.l.h(aVar.f130843a);
        LocalDate localDateH2 = g22.l.h(aVar.f130844b);
        n60.b bVar = (n60.b) fVar2.a();
        boolean zR = mVar.r(hVar) | mVar.k(gVar.ordinal());
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zR) {
            objQ = new h60.e(hVar, gVar, 1);
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new h60.e(hVar, gVar, 1);
                mVar.K(objQ);
            }
        }
        e23.a aVar3 = (e23.a) objQ;
        boolean zB = mVar.B(fVar);
        Object objQ2 = mVar.q();
        if (zB) {
            objQ2 = new d52.k(fVar, 4);
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new d52.k(fVar, 4);
                mVar.K(objQ2);
            }
        }
        r60.d.a(localDateH, localDateH2, gVar, bVar, aVar3, (e23.l) objQ2, mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        n82.f fVar = (n82.f) this.f994b;
        o82.a aVar = (o82.a) this.f995c;
        qo0.a aVar2 = (qo0.a) this.f997e;
        e23.l lVar = (e23.l) this.f996d;
        u82.f fVar2 = (u82.f) obj2;
        p3.m mVar = (p3.m) obj3;
        int iC = vb.h.c((Integer) obj4, (c2.t) obj, fVar2);
        if ((iC & 48) == 0) {
            iC |= (iC & 64) == 0 ? mVar.B(fVar2) : mVar.r(fVar2) ? 32 : 16;
        }
        boolean z14 = false;
        if (mVar.n(iC & 1, (iC & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = mVar.B(fVar) | mVar.B(aVar) | mVar.r(aVar2);
            if ((iC & 112) == 32 || ((iC & 64) != 0 && mVar.r(fVar2))) {
                z14 = true;
            }
            boolean z15 = zB | z14;
            Object objQ = mVar.q();
            if (z15) {
                ho0.m.b bVar = new ho0.m.b(fVar, aVar, aVar2, fVar2, null);
                mVar.K(bVar);
                objQ = bVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    ho0.m.b bVar2 = new ho0.m.b(fVar, aVar, aVar2, fVar2, null);
                    mVar.K(bVar2);
                    objQ = bVar2;
                }
            }
            int i14 = gs1.t.f78871l;
            l0.e((e23.p) objQ, fVar2, mVar);
            oo0.e.a(vb.h.k(aVar.f130843a), (gs1.t) fVar2.a(), aVar2, lVar, mVar, i14 << 3);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00d4  */
    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        i53.c cVar = (i53.c) this.f994b;
        Context context = (Context) this.f997e;
        e23.l lVar = (e23.l) this.f996d;
        e23.a aVar = (e23.a) this.f995c;
        int iIntValue = ((Integer) obj2).intValue();
        p3.m mVar = (p3.m) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((f2.r) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= mVar.k(iIntValue) ? 32 : 16;
        }
        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            String str = (String) cVar.get(iIntValue);
            wf.f.a aVar2 = new wf.f.a(context);
            aVar2.f184930c = str;
            wf.g.a(aVar2);
            wf.f fVarA = aVar2.a();
            f5.k.f68985a.getClass();
            f5.k.a.C1427a c1427a = f5.k.a.f68987b;
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            d92.b.f58623a.getClass();
            t4.c cVar2 = new t4.c(d92.b.a(mVar).c().g(), null);
            t4.c cVar3 = new t4.c(d92.b.a(mVar).d().a().c(), null);
            h4.r rVarG = c2.l.g(x2.f(h4.r.S, 1.0f), 1.0f);
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarG, j92.b.f97899b.f97920e);
            boolean zB = mVar.B(lVar) | mVar.B(str) | mVar.B(aVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new d6(lVar, 6, str, aVar);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d6(lVar, 6, str, aVar);
                    mVar.K(objQ);
                }
            }
            jf.r.b(fVarA, null, u1.w.d(rVarY, false, null, null, (e23.a) objQ, 15), cVar2, cVar3, null, null, null, null, gVar, c1427a, null, mVar, 805306416, 6, 31200);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        e23.a aVar = (e23.a) this.f995c;
        k62.j jVar = (k62.j) this.f994b;
        k62.j jVar2 = (k62.j) this.f996d;
        gp.h hVar = (gp.h) this.f997e;
        p3.m mVar = (p3.m) obj3;
        q2.t((Integer) obj4, (r1.l) obj, (lc.v) obj2);
        x1 x1Var = p3.n.f135158a;
        mVar.L(-1614864554);
        v9.a.f176280a.getClass();
        ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar);
        if (viewModelStoreOwnerA == null) {
            vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(k62.h.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
        mVar.R();
        k62.f.b((k62.h) u1VarResolveViewModel, aVar, jVar, jVar2, hVar, mVar, 0);
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        PreviewCatalogActivity previewCatalogActivity = (PreviewCatalogActivity) this.f994b;
        m0 m0Var = (m0) this.f996d;
        e23.a<Unit> aVar = (e23.a) this.f995c;
        m72.i iVar = (m72.i) this.f997e;
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        int i14 = PreviewCatalogActivity.f49781a;
        ((r1.l) obj).getClass();
        ((lc.v) obj2).getClass();
        x1 x1Var = p3.n.f135158a;
        previewCatalogActivity.M9(m0Var, aVar, iVar, mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0070  */
    /* JADX WARN: Code duplicated, block: B:16:0x008b  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:6:0x0051  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        o82.g gVar = (o82.g) this.f994b;
        final np.c cVar = (np.c) this.f995c;
        final op.a aVar = (op.a) this.f996d;
        p1 p1Var = (p1) this.f997e;
        u82.f fVar = (u82.f) obj2;
        p3.m mVar = (p3.m) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((c2.t) obj).getClass();
        fVar.getClass();
        x1 x1Var = p3.n.f135158a;
        qp.d dVar = (qp.d) p1Var.getF182175a();
        boolean zR = mVar.r(cVar) | mVar.k(gVar.ordinal());
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zR) {
            objQ = new ml0.e(26, cVar, gVar);
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ml0.e(26, cVar, gVar);
                mVar.K(objQ);
            }
        }
        e23.l lVar = (e23.l) objQ;
        boolean zR2 = mVar.r(cVar);
        Object objQ2 = mVar.q();
        final int i14 = 0;
        if (zR2) {
            objQ2 = new e23.p() { // from class: np.e
                @Override // e23.p
                public final Object invoke(Object obj5, Object obj6) {
                    Object value;
                    qp.d dVarA;
                    switch (i14) {
                        case 0:
                            o82.g gVar2 = (o82.g) obj5;
                            Map map = (Map) obj6;
                            gVar2.getClass();
                            map.getClass();
                            c cVar2 = cVar;
                            cVar2.getClass();
                            p2 p2Var = cVar2.f126788f;
                            do {
                                value = p2Var.getValue();
                                dVarA = (qp.d) value;
                                k kVar = dVarA.f146011e;
                                if (kVar != null) {
                                    String string = new h(gVar2, kVar).toString();
                                    LinkedHashMap linkedHashMapN = u0.n(dVarA.f146015i);
                                    linkedHashMapN.put(string, i53.a.g(map));
                                    dVarA = qp.d.a(dVarA, false, false, null, null, null, null, null, i53.a.g(linkedHashMapN), 255);
                                }
                            } while (!p2Var.b(value, dVarA));
                            break;
                        default:
                            long jLongValue = ((Long) obj5).longValue();
                            String str = (String) obj6;
                            str.getClass();
                            c cVar3 = cVar;
                            cVar3.getClass();
                            ge1.b.T(v1.a(cVar3), null, null, new d(cVar3, jLongValue, str, null), 3);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            mVar.K(objQ2);
        } else {
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new e23.p() { // from class: np.e
                    @Override // e23.p
                    public final Object invoke(Object obj5, Object obj6) {
                        Object value;
                        qp.d dVarA;
                        switch (i14) {
                            case 0:
                                o82.g gVar2 = (o82.g) obj5;
                                Map map = (Map) obj6;
                                gVar2.getClass();
                                map.getClass();
                                c cVar2 = cVar;
                                cVar2.getClass();
                                p2 p2Var = cVar2.f126788f;
                                do {
                                    value = p2Var.getValue();
                                    dVarA = (qp.d) value;
                                    k kVar = dVarA.f146011e;
                                    if (kVar != null) {
                                        String string = new h(gVar2, kVar).toString();
                                        LinkedHashMap linkedHashMapN = u0.n(dVarA.f146015i);
                                        linkedHashMapN.put(string, i53.a.g(map));
                                        dVarA = qp.d.a(dVarA, false, false, null, null, null, null, null, i53.a.g(linkedHashMapN), 255);
                                    }
                                } while (!p2Var.b(value, dVarA));
                                break;
                            default:
                                long jLongValue = ((Long) obj5).longValue();
                                String str = (String) obj6;
                                str.getClass();
                                c cVar3 = cVar;
                                cVar3.getClass();
                                ge1.b.T(v1.a(cVar3), null, null, new d(cVar3, jLongValue, str, null), 3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ2);
            }
        }
        e23.p pVar = (e23.p) objQ2;
        boolean zR3 = mVar.r(aVar);
        Object objQ3 = mVar.q();
        if (zR3) {
            objQ3 = new mh1.x(aVar, 29);
            mVar.K(objQ3);
        } else {
            aVar2.getClass();
            if (objQ3 == p3.m.a.f135155b) {
                objQ3 = new mh1.x(aVar, 29);
                mVar.K(objQ3);
            }
        }
        e23.l lVar2 = (e23.l) objQ3;
        boolean zR4 = mVar.r(aVar);
        Object objQ4 = mVar.q();
        if (zR4) {
            objQ4 = new e23.p() { // from class: np.f
                @Override // e23.p
                public final Object invoke(Object obj5, Object obj6) {
                    switch (i14) {
                        case 0:
                            aVar.d(((Integer) obj5).intValue(), ((Integer) obj6).intValue());
                            break;
                        default:
                            long jLongValue = ((Long) obj5).longValue();
                            x0 x0Var = (x0) obj6;
                            x0Var.getClass();
                            aVar.a(jLongValue, x0Var);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            mVar.K(objQ4);
        } else {
            aVar2.getClass();
            if (objQ4 == p3.m.a.f135155b) {
                objQ4 = new e23.p() { // from class: np.f
                    @Override // e23.p
                    public final Object invoke(Object obj5, Object obj6) {
                        switch (i14) {
                            case 0:
                                aVar.d(((Integer) obj5).intValue(), ((Integer) obj6).intValue());
                                break;
                            default:
                                long jLongValue = ((Long) obj5).longValue();
                                x0 x0Var = (x0) obj6;
                                x0Var.getClass();
                                aVar.a(jLongValue, x0Var);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ4);
            }
        }
        e23.p pVar2 = (e23.p) objQ4;
        boolean zR5 = mVar.r(aVar);
        Object objQ5 = mVar.q();
        final int i15 = 1;
        if (zR5) {
            objQ5 = new e23.p() { // from class: np.f
                @Override // e23.p
                public final Object invoke(Object obj5, Object obj6) {
                    switch (i15) {
                        case 0:
                            aVar.d(((Integer) obj5).intValue(), ((Integer) obj6).intValue());
                            break;
                        default:
                            long jLongValue = ((Long) obj5).longValue();
                            x0 x0Var = (x0) obj6;
                            x0Var.getClass();
                            aVar.a(jLongValue, x0Var);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            mVar.K(objQ5);
        } else {
            aVar2.getClass();
            if (objQ5 == p3.m.a.f135155b) {
                objQ5 = new e23.p() { // from class: np.f
                    @Override // e23.p
                    public final Object invoke(Object obj5, Object obj6) {
                        switch (i15) {
                            case 0:
                                aVar.d(((Integer) obj5).intValue(), ((Integer) obj6).intValue());
                                break;
                            default:
                                long jLongValue = ((Long) obj5).longValue();
                                x0 x0Var = (x0) obj6;
                                x0Var.getClass();
                                aVar.a(jLongValue, x0Var);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ5);
            }
        }
        e23.p pVar3 = (e23.p) objQ5;
        boolean zR6 = mVar.r(cVar);
        Object objQ6 = mVar.q();
        if (zR6) {
            objQ6 = new e23.p() { // from class: np.e
                @Override // e23.p
                public final Object invoke(Object obj5, Object obj6) {
                    Object value;
                    qp.d dVarA;
                    switch (i15) {
                        case 0:
                            o82.g gVar2 = (o82.g) obj5;
                            Map map = (Map) obj6;
                            gVar2.getClass();
                            map.getClass();
                            c cVar2 = cVar;
                            cVar2.getClass();
                            p2 p2Var = cVar2.f126788f;
                            do {
                                value = p2Var.getValue();
                                dVarA = (qp.d) value;
                                k kVar = dVarA.f146011e;
                                if (kVar != null) {
                                    String string = new h(gVar2, kVar).toString();
                                    LinkedHashMap linkedHashMapN = u0.n(dVarA.f146015i);
                                    linkedHashMapN.put(string, i53.a.g(map));
                                    dVarA = qp.d.a(dVarA, false, false, null, null, null, null, null, i53.a.g(linkedHashMapN), 255);
                                }
                            } while (!p2Var.b(value, dVarA));
                            break;
                        default:
                            long jLongValue = ((Long) obj5).longValue();
                            String str = (String) obj6;
                            str.getClass();
                            c cVar3 = cVar;
                            cVar3.getClass();
                            ge1.b.T(v1.a(cVar3), null, null, new d(cVar3, jLongValue, str, null), 3);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            mVar.K(objQ6);
        } else {
            aVar2.getClass();
            if (objQ6 == p3.m.a.f135155b) {
                objQ6 = new e23.p() { // from class: np.e
                    @Override // e23.p
                    public final Object invoke(Object obj5, Object obj6) {
                        Object value;
                        qp.d dVarA;
                        switch (i15) {
                            case 0:
                                o82.g gVar2 = (o82.g) obj5;
                                Map map = (Map) obj6;
                                gVar2.getClass();
                                map.getClass();
                                c cVar2 = cVar;
                                cVar2.getClass();
                                p2 p2Var = cVar2.f126788f;
                                do {
                                    value = p2Var.getValue();
                                    dVarA = (qp.d) value;
                                    k kVar = dVarA.f146011e;
                                    if (kVar != null) {
                                        String string = new h(gVar2, kVar).toString();
                                        LinkedHashMap linkedHashMapN = u0.n(dVarA.f146015i);
                                        linkedHashMapN.put(string, i53.a.g(map));
                                        dVarA = qp.d.a(dVarA, false, false, null, null, null, null, null, i53.a.g(linkedHashMapN), 255);
                                    }
                                } while (!p2Var.b(value, dVarA));
                                break;
                            default:
                                long jLongValue = ((Long) obj5).longValue();
                                String str = (String) obj6;
                                str.getClass();
                                c cVar3 = cVar;
                                cVar3.getClass();
                                ge1.b.T(v1.a(cVar3), null, null, new d(cVar3, jLongValue, str, null), 3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ6);
            }
        }
        np.b.a(gVar, dVar, fVar, lVar, pVar, lVar2, pVar2, pVar3, (e23.p) objQ6, mVar, (iIntValue << 3) & 896);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        i53.f fVar = (i53.f) this.f994b;
        iy0.f fVar2 = (iy0.f) this.f995c;
        sy0.l lVar = (sy0.l) this.f996d;
        i53.c cVar = (i53.c) this.f997e;
        int iIntValue = ((Integer) obj2).intValue();
        p3.m mVar = (p3.m) obj3;
        ((Integer) obj4).getClass();
        ((h2.c0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        ny0.f fVar3 = (ny0.f) fVar.get(iIntValue);
        if (fVar3 instanceof ny0.f.a) {
            mVar.C(-1138355213);
            if (fVar2 == null) {
                mVar.C(-1138355214);
                mVar.f();
            } else {
                mVar.C(-1138355213);
                com.garmin.android.apps.connectmobile.multidayactivities.presentation.charts.b.a(fVar2, mVar, 0);
                mVar.f();
                Unit unit = Unit.INSTANCE;
            }
            mVar.f();
        } else {
            if (!(fVar3 instanceof ny0.f.b)) {
                throw n23.j.m(mVar, -1145102983);
            }
            mVar.C(-1138169430);
            if (lVar == null) {
                mVar.C(-1138169431);
                mVar.f();
            } else {
                mVar.C(-1138169430);
                com.garmin.android.apps.connectmobile.multidayactivities.presentation.charts.a.a(lVar, cVar, mVar, 0);
                mVar.f();
                Unit unit2 = Unit.INSTANCE;
            }
            mVar.f();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:106:0x031a  */
    /* JADX WARN: Code duplicated, block: B:111:0x033c  */
    /* JADX WARN: Code duplicated, block: B:13:0x007d  */
    /* JADX WARN: Code duplicated, block: B:141:0x046c  */
    /* JADX WARN: Code duplicated, block: B:146:0x048b  */
    /* JADX WARN: Code duplicated, block: B:151:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:162:0x0529  */
    /* JADX WARN: Code duplicated, block: B:172:0x058c  */
    /* JADX WARN: Code duplicated, block: B:177:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:182:0x05da  */
    /* JADX WARN: Code duplicated, block: B:189:0x0621  */
    /* JADX WARN: Code duplicated, block: B:210:0x0705  */
    /* JADX WARN: Code duplicated, block: B:215:0x072b  */
    /* JADX WARN: Code duplicated, block: B:244:0x0872  */
    /* JADX WARN: Code duplicated, block: B:249:0x089f  */
    /* JADX WARN: Code duplicated, block: B:256:0x0914  */
    /* JADX WARN: Code duplicated, block: B:263:0x0970  */
    /* JADX WARN: Code duplicated, block: B:293:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:302:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:309:0x0b80  */
    /* JADX WARN: Code duplicated, block: B:314:0x0bb4  */
    /* JADX WARN: Code duplicated, block: B:319:0x0bd2  */
    /* JADX WARN: Code duplicated, block: B:324:0x0bf0  */
    /* JADX WARN: Code duplicated, block: B:329:0x0c0e  */
    /* JADX WARN: Code duplicated, block: B:334:0x0c2a  */
    /* JADX WARN: Code duplicated, block: B:339:0x0c46  */
    /* JADX WARN: Code duplicated, block: B:344:0x0c62  */
    /* JADX WARN: Code duplicated, block: B:349:0x0c80  */
    /* JADX WARN: Code duplicated, block: B:62:0x0146  */
    /* JADX WARN: Code duplicated, block: B:67:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:8:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        d42.b bVar;
        String str;
        i53.f fVarJ;
        Object obj5;
        p1 p1Var;
        NutritionActivity.g gVar;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        g21.h hVar;
        Object obj14;
        Object obj15;
        ?? r14;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        String strH;
        String strH2;
        Object obj21;
        Object obj22;
        Object obj23;
        Object obj24;
        int i14 = this.f993a;
        String str2 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
        final int i15 = 1;
        p3.m.a aVar = p3.m.f135153a;
        ?? r15 = this.f997e;
        ?? r16 = this.f996d;
        Object obj25 = this.f995c;
        Object obj26 = this.f994b;
        switch (i14) {
            case 0:
                u82.a aVar2 = (u82.a) obj26;
                e23.a aVar3 = (e23.a) obj25;
                e23.l lVar = (e23.l) r16;
                x3 x3Var = (x3) r15;
                u82.f fVar = (u82.f) obj2;
                p3.m mVar = (p3.m) obj3;
                int iC = vb.h.c((Integer) obj4, (c2.t) obj, fVar);
                if ((iC & 48) == 0) {
                    iC |= (iC & 64) == 0 ? mVar.B(fVar) : mVar.r(fVar) ? 32 : 16;
                }
                if (mVar.n(iC & 1, (iC & 145) != 144)) {
                    x1 x1Var = p3.n.f135158a;
                    o82.a aVar4 = (o82.a) p13.h0.c0(aVar2.b());
                    if (aVar4 == null) {
                        mVar.C(-31915716);
                        mVar.f();
                        bVar = null;
                    } else {
                        mVar.C(-31915715);
                        d42.b bVar2 = (d42.b) ((u82.f) aVar2.c(aVar4, mVar).getF182175a()).a();
                        mVar.f();
                        bVar = bVar2;
                    }
                    b0.b((q71.d) fVar.a(), bVar, (q71.e) x3Var.getF182175a(), aVar3, lVar, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m0 m0Var = (m0) obj25;
                NutritionActivity.g gVar2 = (NutritionActivity.g) r16;
                v21.e eVar = (v21.e) r15;
                i21.d dVar = (i21.d) obj;
                fe feVar = (fe) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                dVar.getClass();
                feVar.getClass();
                x1 x1Var2 = p3.n.f135158a;
                l4.y yVar = (l4.y) lc.w.a((lc.v) obj26, s0.f105811a.b(l4.y.class));
                u82.a aVar5 = dVar.f87289w;
                yVar.getClass();
                g21.i iVar = (g21.i) ((u82.f) aVar5.c(new o82.a(b63.o.Companion.b(b63.o.INSTANCE, yVar.f14992c), null, 2, null), mVar2).getF182175a()).a();
                if (iVar == null || (hVar = iVar.f75433a) == null) {
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    fVarJ = null;
                } else {
                    i53.c<g21.p> cVar = hVar.f75430g;
                    ArrayList arrayList = new ArrayList();
                    Iterator<g21.p> it = cVar.iterator();
                    while (it.hasNext()) {
                        i53.c<b11.i> cVar2 = it.next().f75476d;
                        ArrayList arrayList2 = new ArrayList();
                        for (b11.i iVar2 : cVar2) {
                            String str3 = str2;
                            if (p13.h0.R(yVar.f14993d, iVar2.getF14315a())) {
                                arrayList2.add(iVar2);
                            }
                            str2 = str3;
                        }
                        p13.d0.v(arrayList, arrayList2);
                    }
                    str = str2;
                    fVarJ = i53.a.j(arrayList);
                }
                if (fVarJ == null || fVarJ.isEmpty()) {
                    mVar2.C(745754420);
                    mVar2.f();
                    gVar2.invoke();
                } else {
                    mVar2.C(743221255);
                    Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    boolean zR = mVar2.r(yVar) | mVar2.B(fVarJ);
                    Object objQ = mVar2.q();
                    if (zR) {
                        obj5 = objQ;
                        ao1.i iVar3 = new ao1.i(13, yVar, fVarJ);
                        mVar2.K(iVar3);
                        obj5 = iVar3;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj5 = objQ;
                            ao1.i iVar4 = new ao1.i(13, yVar, fVarJ);
                            mVar2.K(iVar4);
                            obj5 = iVar4;
                        }
                    }
                    obj5 = objQ;
                    e23.a aVar6 = (e23.a) obj5;
                    mVar2.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar2);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z(str);
                        return null;
                    }
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(s11.e.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar2, 0), aVar6);
                    mVar2.R();
                    final s11.e eVar2 = (s11.e) u1VarResolveViewModel;
                    p1 p1VarC = s9.c.c(eVar2.f155910l, mVar2);
                    o13.p<i01.a, List<b63.o>> pVar = ((s11.d) p1VarC.getF182175a()).f155890l;
                    boolean zB = mVar2.B(p1VarC) | mVar2.r(dVar) | mVar2.r(eVar2) | mVar2.r(m0Var);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = new b21.u1(p1VarC, dVar, eVar2, m0Var, null);
                        p1Var = p1VarC;
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new b21.u1(p1VarC, dVar, eVar2, m0Var, null);
                            p1Var = p1VarC;
                            mVar2.K(objQ2);
                        } else {
                            p1Var = p1VarC;
                        }
                    }
                    l0.e((e23.p) objQ2, pVar, mVar2);
                    Boolean boolValueOf = Boolean.valueOf(((s11.d) p1Var.getF182175a()).f155891m);
                    boolean zB2 = mVar2.B(p1Var) | mVar2.r(context) | mVar2.r(eVar2) | mVar2.B(gVar2);
                    Object objQ3 = mVar2.q();
                    if (zB2) {
                        objQ3 = new b21.v1(context, eVar2, gVar2, p1Var, null);
                        gVar = gVar2;
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new b21.v1(context, eVar2, gVar2, p1Var, null);
                            gVar = gVar2;
                            mVar2.K(objQ3);
                        } else {
                            gVar = gVar2;
                        }
                    }
                    l0.e((e23.p) objQ3, boolValueOf, mVar2);
                    s11.d dVar2 = (s11.d) p1Var.getF182175a();
                    boolean zR2 = mVar2.r(eVar2);
                    Object objQ4 = mVar2.q();
                    if (zR2) {
                        obj6 = objQ4;
                        final int i16 = 0;
                        e23.l lVar2 = new e23.l() { // from class: b21.z0
                            @Override // e23.l
                            public final Object invoke(Object obj27) {
                                Object value;
                                switch (i16) {
                                    case 0:
                                        b11.l lVar3 = (b11.l) obj27;
                                        lVar3.getClass();
                                        long j8 = lVar3.f14331a;
                                        s11.e eVar3 = eVar2;
                                        r53.p2 p2Var = eVar3.f155909k;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s11.d.a((s11.d) value, null, Long.valueOf(j8), null, false, false, null, false, 0L, null, eVar3.G4(Long.valueOf(j8)), 458687)));
                                        break;
                                    case 1:
                                        eVar2.E4(((Long) obj27).longValue());
                                        break;
                                    case 2:
                                        eVar2.E4(((Long) obj27).longValue());
                                        break;
                                    case 3:
                                        Long l14 = (Long) obj27;
                                        long jLongValue = l14.longValue();
                                        s11.e eVar4 = eVar2;
                                        r53.p2 p2Var2 = eVar4.f155909k;
                                        long j14 = ((s11.d) p2Var2.getValue()).f155893o;
                                        if (j14 <= jLongValue) {
                                            b63.o oVarF4 = s11.e.F4(j14);
                                            b63.o oVarF5 = s11.e.F4(jLongValue);
                                            while (true) {
                                                Object value2 = p2Var2.getValue();
                                                r53.p2 p2Var3 = p2Var2;
                                                b63.o oVar = oVarF4;
                                                b63.o oVar2 = oVarF5;
                                                if (p2Var3.b(value2, s11.d.a((s11.d) value2, null, null, null, false, false, null, false, j14, l14, null, 475135))) {
                                                    g01.a0 a0Var = eVar4.f155908j;
                                                    if (a0Var != null) {
                                                        eVar4.H4(s11.e.D4(a0Var, oVar, oVar2));
                                                    }
                                                } else {
                                                    oVarF5 = oVar2;
                                                    p2Var2 = p2Var3;
                                                    oVarF4 = oVar;
                                                }
                                            }
                                        } else {
                                            eVar4.E4(jLongValue);
                                        }
                                        break;
                                    default:
                                        b63.v vVar = (b63.v) obj27;
                                        vVar.getClass();
                                        s11.e eVar5 = eVar2;
                                        r53.p2 p2Var4 = eVar5.f155909k;
                                        s11.d dVar3 = (s11.d) p2Var4.getValue();
                                        b11.l lVarL = zf.b.L(dVar3.f155884f, dVar3.f155879a, vVar, null, eVar5.f155905g.a());
                                        Long lValueOf = lVarL != null ? Long.valueOf(lVarL.f14331a) : null;
                                        while (true) {
                                            Object value3 = p2Var4.getValue();
                                            s11.e eVar6 = eVar5;
                                            if (!p2Var4.b(value3, s11.d.a((s11.d) value3, null, lValueOf, vVar, false, false, null, false, 0L, null, eVar5.G4(lValueOf), 458559))) {
                                                eVar5 = eVar6;
                                            }
                                            break;
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(lVar2);
                        obj6 = lVar2;
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            obj6 = objQ4;
                            final int i17 = 0;
                            e23.l lVar3 = new e23.l() { // from class: b21.z0
                                @Override // e23.l
                                public final Object invoke(Object obj27) {
                                    Object value;
                                    switch (i17) {
                                        case 0:
                                            b11.l lVar4 = (b11.l) obj27;
                                            lVar4.getClass();
                                            long j8 = lVar4.f14331a;
                                            s11.e eVar3 = eVar2;
                                            r53.p2 p2Var = eVar3.f155909k;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s11.d.a((s11.d) value, null, Long.valueOf(j8), null, false, false, null, false, 0L, null, eVar3.G4(Long.valueOf(j8)), 458687)));
                                            break;
                                        case 1:
                                            eVar2.E4(((Long) obj27).longValue());
                                            break;
                                        case 2:
                                            eVar2.E4(((Long) obj27).longValue());
                                            break;
                                        case 3:
                                            Long l14 = (Long) obj27;
                                            long jLongValue = l14.longValue();
                                            s11.e eVar4 = eVar2;
                                            r53.p2 p2Var2 = eVar4.f155909k;
                                            long j14 = ((s11.d) p2Var2.getValue()).f155893o;
                                            if (j14 <= jLongValue) {
                                                b63.o oVarF4 = s11.e.F4(j14);
                                                b63.o oVarF5 = s11.e.F4(jLongValue);
                                                while (true) {
                                                    Object value2 = p2Var2.getValue();
                                                    r53.p2 p2Var3 = p2Var2;
                                                    b63.o oVar = oVarF4;
                                                    b63.o oVar2 = oVarF5;
                                                    if (p2Var3.b(value2, s11.d.a((s11.d) value2, null, null, null, false, false, null, false, j14, l14, null, 475135))) {
                                                        g01.a0 a0Var = eVar4.f155908j;
                                                        if (a0Var != null) {
                                                            eVar4.H4(s11.e.D4(a0Var, oVar, oVar2));
                                                        }
                                                    } else {
                                                        oVarF5 = oVar2;
                                                        p2Var2 = p2Var3;
                                                        oVarF4 = oVar;
                                                    }
                                                }
                                            } else {
                                                eVar4.E4(jLongValue);
                                            }
                                            break;
                                        default:
                                            b63.v vVar = (b63.v) obj27;
                                            vVar.getClass();
                                            s11.e eVar5 = eVar2;
                                            r53.p2 p2Var4 = eVar5.f155909k;
                                            s11.d dVar3 = (s11.d) p2Var4.getValue();
                                            b11.l lVarL = zf.b.L(dVar3.f155884f, dVar3.f155879a, vVar, null, eVar5.f155905g.a());
                                            Long lValueOf = lVarL != null ? Long.valueOf(lVarL.f14331a) : null;
                                            while (true) {
                                                Object value3 = p2Var4.getValue();
                                                s11.e eVar6 = eVar5;
                                                if (!p2Var4.b(value3, s11.d.a((s11.d) value3, null, lValueOf, vVar, false, false, null, false, 0L, null, eVar5.G4(lValueOf), 458559))) {
                                                    eVar5 = eVar6;
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(lVar3);
                            obj6 = lVar3;
                        }
                    }
                    obj6 = objQ4;
                    e23.l lVar4 = (e23.l) obj6;
                    boolean zR3 = mVar2.r(eVar2);
                    Object objQ5 = mVar2.q();
                    if (zR3) {
                        obj7 = objQ5;
                        final int i18 = 1;
                        e23.l lVar5 = new e23.l() { // from class: b21.z0
                            @Override // e23.l
                            public final Object invoke(Object obj27) {
                                Object value;
                                switch (i18) {
                                    case 0:
                                        b11.l lVar6 = (b11.l) obj27;
                                        lVar6.getClass();
                                        long j8 = lVar6.f14331a;
                                        s11.e eVar3 = eVar2;
                                        r53.p2 p2Var = eVar3.f155909k;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s11.d.a((s11.d) value, null, Long.valueOf(j8), null, false, false, null, false, 0L, null, eVar3.G4(Long.valueOf(j8)), 458687)));
                                        break;
                                    case 1:
                                        eVar2.E4(((Long) obj27).longValue());
                                        break;
                                    case 2:
                                        eVar2.E4(((Long) obj27).longValue());
                                        break;
                                    case 3:
                                        Long l14 = (Long) obj27;
                                        long jLongValue = l14.longValue();
                                        s11.e eVar4 = eVar2;
                                        r53.p2 p2Var2 = eVar4.f155909k;
                                        long j14 = ((s11.d) p2Var2.getValue()).f155893o;
                                        if (j14 <= jLongValue) {
                                            b63.o oVarF4 = s11.e.F4(j14);
                                            b63.o oVarF5 = s11.e.F4(jLongValue);
                                            while (true) {
                                                Object value2 = p2Var2.getValue();
                                                r53.p2 p2Var3 = p2Var2;
                                                b63.o oVar = oVarF4;
                                                b63.o oVar2 = oVarF5;
                                                if (p2Var3.b(value2, s11.d.a((s11.d) value2, null, null, null, false, false, null, false, j14, l14, null, 475135))) {
                                                    g01.a0 a0Var = eVar4.f155908j;
                                                    if (a0Var != null) {
                                                        eVar4.H4(s11.e.D4(a0Var, oVar, oVar2));
                                                    }
                                                } else {
                                                    oVarF5 = oVar2;
                                                    p2Var2 = p2Var3;
                                                    oVarF4 = oVar;
                                                }
                                            }
                                        } else {
                                            eVar4.E4(jLongValue);
                                        }
                                        break;
                                    default:
                                        b63.v vVar = (b63.v) obj27;
                                        vVar.getClass();
                                        s11.e eVar5 = eVar2;
                                        r53.p2 p2Var4 = eVar5.f155909k;
                                        s11.d dVar3 = (s11.d) p2Var4.getValue();
                                        b11.l lVarL = zf.b.L(dVar3.f155884f, dVar3.f155879a, vVar, null, eVar5.f155905g.a());
                                        Long lValueOf = lVarL != null ? Long.valueOf(lVarL.f14331a) : null;
                                        while (true) {
                                            Object value3 = p2Var4.getValue();
                                            s11.e eVar6 = eVar5;
                                            if (!p2Var4.b(value3, s11.d.a((s11.d) value3, null, lValueOf, vVar, false, false, null, false, 0L, null, eVar5.G4(lValueOf), 458559))) {
                                                eVar5 = eVar6;
                                            }
                                            break;
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(lVar5);
                        obj7 = lVar5;
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            obj7 = objQ5;
                            final int i19 = 1;
                            e23.l lVar6 = new e23.l() { // from class: b21.z0
                                @Override // e23.l
                                public final Object invoke(Object obj27) {
                                    Object value;
                                    switch (i19) {
                                        case 0:
                                            b11.l lVar7 = (b11.l) obj27;
                                            lVar7.getClass();
                                            long j8 = lVar7.f14331a;
                                            s11.e eVar3 = eVar2;
                                            r53.p2 p2Var = eVar3.f155909k;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s11.d.a((s11.d) value, null, Long.valueOf(j8), null, false, false, null, false, 0L, null, eVar3.G4(Long.valueOf(j8)), 458687)));
                                            break;
                                        case 1:
                                            eVar2.E4(((Long) obj27).longValue());
                                            break;
                                        case 2:
                                            eVar2.E4(((Long) obj27).longValue());
                                            break;
                                        case 3:
                                            Long l14 = (Long) obj27;
                                            long jLongValue = l14.longValue();
                                            s11.e eVar4 = eVar2;
                                            r53.p2 p2Var2 = eVar4.f155909k;
                                            long j14 = ((s11.d) p2Var2.getValue()).f155893o;
                                            if (j14 <= jLongValue) {
                                                b63.o oVarF4 = s11.e.F4(j14);
                                                b63.o oVarF5 = s11.e.F4(jLongValue);
                                                while (true) {
                                                    Object value2 = p2Var2.getValue();
                                                    r53.p2 p2Var3 = p2Var2;
                                                    b63.o oVar = oVarF4;
                                                    b63.o oVar2 = oVarF5;
                                                    if (p2Var3.b(value2, s11.d.a((s11.d) value2, null, null, null, false, false, null, false, j14, l14, null, 475135))) {
                                                        g01.a0 a0Var = eVar4.f155908j;
                                                        if (a0Var != null) {
                                                            eVar4.H4(s11.e.D4(a0Var, oVar, oVar2));
                                                        }
                                                    } else {
                                                        oVarF5 = oVar2;
                                                        p2Var2 = p2Var3;
                                                        oVarF4 = oVar;
                                                    }
                                                }
                                            } else {
                                                eVar4.E4(jLongValue);
                                            }
                                            break;
                                        default:
                                            b63.v vVar = (b63.v) obj27;
                                            vVar.getClass();
                                            s11.e eVar5 = eVar2;
                                            r53.p2 p2Var4 = eVar5.f155909k;
                                            s11.d dVar3 = (s11.d) p2Var4.getValue();
                                            b11.l lVarL = zf.b.L(dVar3.f155884f, dVar3.f155879a, vVar, null, eVar5.f155905g.a());
                                            Long lValueOf = lVarL != null ? Long.valueOf(lVarL.f14331a) : null;
                                            while (true) {
                                                Object value3 = p2Var4.getValue();
                                                s11.e eVar6 = eVar5;
                                                if (!p2Var4.b(value3, s11.d.a((s11.d) value3, null, lValueOf, vVar, false, false, null, false, 0L, null, eVar5.G4(lValueOf), 458559))) {
                                                    eVar5 = eVar6;
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(lVar6);
                            obj7 = lVar6;
                        }
                    }
                    obj7 = objQ5;
                    e23.l lVar7 = (e23.l) obj7;
                    boolean zR4 = mVar2.r(eVar2);
                    Object objQ6 = mVar2.q();
                    if (zR4) {
                        obj8 = objQ6;
                        final int i24 = 2;
                        e23.l lVar8 = new e23.l() { // from class: b21.z0
                            @Override // e23.l
                            public final Object invoke(Object obj27) {
                                Object value;
                                switch (i24) {
                                    case 0:
                                        b11.l lVar9 = (b11.l) obj27;
                                        lVar9.getClass();
                                        long j8 = lVar9.f14331a;
                                        s11.e eVar3 = eVar2;
                                        r53.p2 p2Var = eVar3.f155909k;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s11.d.a((s11.d) value, null, Long.valueOf(j8), null, false, false, null, false, 0L, null, eVar3.G4(Long.valueOf(j8)), 458687)));
                                        break;
                                    case 1:
                                        eVar2.E4(((Long) obj27).longValue());
                                        break;
                                    case 2:
                                        eVar2.E4(((Long) obj27).longValue());
                                        break;
                                    case 3:
                                        Long l14 = (Long) obj27;
                                        long jLongValue = l14.longValue();
                                        s11.e eVar4 = eVar2;
                                        r53.p2 p2Var2 = eVar4.f155909k;
                                        long j14 = ((s11.d) p2Var2.getValue()).f155893o;
                                        if (j14 <= jLongValue) {
                                            b63.o oVarF4 = s11.e.F4(j14);
                                            b63.o oVarF5 = s11.e.F4(jLongValue);
                                            while (true) {
                                                Object value2 = p2Var2.getValue();
                                                r53.p2 p2Var3 = p2Var2;
                                                b63.o oVar = oVarF4;
                                                b63.o oVar2 = oVarF5;
                                                if (p2Var3.b(value2, s11.d.a((s11.d) value2, null, null, null, false, false, null, false, j14, l14, null, 475135))) {
                                                    g01.a0 a0Var = eVar4.f155908j;
                                                    if (a0Var != null) {
                                                        eVar4.H4(s11.e.D4(a0Var, oVar, oVar2));
                                                    }
                                                } else {
                                                    oVarF5 = oVar2;
                                                    p2Var2 = p2Var3;
                                                    oVarF4 = oVar;
                                                }
                                            }
                                        } else {
                                            eVar4.E4(jLongValue);
                                        }
                                        break;
                                    default:
                                        b63.v vVar = (b63.v) obj27;
                                        vVar.getClass();
                                        s11.e eVar5 = eVar2;
                                        r53.p2 p2Var4 = eVar5.f155909k;
                                        s11.d dVar3 = (s11.d) p2Var4.getValue();
                                        b11.l lVarL = zf.b.L(dVar3.f155884f, dVar3.f155879a, vVar, null, eVar5.f155905g.a());
                                        Long lValueOf = lVarL != null ? Long.valueOf(lVarL.f14331a) : null;
                                        while (true) {
                                            Object value3 = p2Var4.getValue();
                                            s11.e eVar6 = eVar5;
                                            if (!p2Var4.b(value3, s11.d.a((s11.d) value3, null, lValueOf, vVar, false, false, null, false, 0L, null, eVar5.G4(lValueOf), 458559))) {
                                                eVar5 = eVar6;
                                            }
                                            break;
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(lVar8);
                        obj8 = lVar8;
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            obj8 = objQ6;
                            final int i25 = 2;
                            e23.l lVar9 = new e23.l() { // from class: b21.z0
                                @Override // e23.l
                                public final Object invoke(Object obj27) {
                                    Object value;
                                    switch (i25) {
                                        case 0:
                                            b11.l lVar10 = (b11.l) obj27;
                                            lVar10.getClass();
                                            long j8 = lVar10.f14331a;
                                            s11.e eVar3 = eVar2;
                                            r53.p2 p2Var = eVar3.f155909k;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s11.d.a((s11.d) value, null, Long.valueOf(j8), null, false, false, null, false, 0L, null, eVar3.G4(Long.valueOf(j8)), 458687)));
                                            break;
                                        case 1:
                                            eVar2.E4(((Long) obj27).longValue());
                                            break;
                                        case 2:
                                            eVar2.E4(((Long) obj27).longValue());
                                            break;
                                        case 3:
                                            Long l14 = (Long) obj27;
                                            long jLongValue = l14.longValue();
                                            s11.e eVar4 = eVar2;
                                            r53.p2 p2Var2 = eVar4.f155909k;
                                            long j14 = ((s11.d) p2Var2.getValue()).f155893o;
                                            if (j14 <= jLongValue) {
                                                b63.o oVarF4 = s11.e.F4(j14);
                                                b63.o oVarF5 = s11.e.F4(jLongValue);
                                                while (true) {
                                                    Object value2 = p2Var2.getValue();
                                                    r53.p2 p2Var3 = p2Var2;
                                                    b63.o oVar = oVarF4;
                                                    b63.o oVar2 = oVarF5;
                                                    if (p2Var3.b(value2, s11.d.a((s11.d) value2, null, null, null, false, false, null, false, j14, l14, null, 475135))) {
                                                        g01.a0 a0Var = eVar4.f155908j;
                                                        if (a0Var != null) {
                                                            eVar4.H4(s11.e.D4(a0Var, oVar, oVar2));
                                                        }
                                                    } else {
                                                        oVarF5 = oVar2;
                                                        p2Var2 = p2Var3;
                                                        oVarF4 = oVar;
                                                    }
                                                }
                                            } else {
                                                eVar4.E4(jLongValue);
                                            }
                                            break;
                                        default:
                                            b63.v vVar = (b63.v) obj27;
                                            vVar.getClass();
                                            s11.e eVar5 = eVar2;
                                            r53.p2 p2Var4 = eVar5.f155909k;
                                            s11.d dVar3 = (s11.d) p2Var4.getValue();
                                            b11.l lVarL = zf.b.L(dVar3.f155884f, dVar3.f155879a, vVar, null, eVar5.f155905g.a());
                                            Long lValueOf = lVarL != null ? Long.valueOf(lVarL.f14331a) : null;
                                            while (true) {
                                                Object value3 = p2Var4.getValue();
                                                s11.e eVar6 = eVar5;
                                                if (!p2Var4.b(value3, s11.d.a((s11.d) value3, null, lValueOf, vVar, false, false, null, false, 0L, null, eVar5.G4(lValueOf), 458559))) {
                                                    eVar5 = eVar6;
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(lVar9);
                            obj8 = lVar9;
                        }
                    }
                    obj8 = objQ6;
                    e23.l lVar10 = (e23.l) obj8;
                    boolean zR5 = mVar2.r(eVar2);
                    Object objQ7 = mVar2.q();
                    if (zR5) {
                        obj9 = objQ7;
                        final int i26 = 3;
                        e23.l lVar11 = new e23.l() { // from class: b21.z0
                            @Override // e23.l
                            public final Object invoke(Object obj27) {
                                Object value;
                                switch (i26) {
                                    case 0:
                                        b11.l lVar12 = (b11.l) obj27;
                                        lVar12.getClass();
                                        long j8 = lVar12.f14331a;
                                        s11.e eVar3 = eVar2;
                                        r53.p2 p2Var = eVar3.f155909k;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s11.d.a((s11.d) value, null, Long.valueOf(j8), null, false, false, null, false, 0L, null, eVar3.G4(Long.valueOf(j8)), 458687)));
                                        break;
                                    case 1:
                                        eVar2.E4(((Long) obj27).longValue());
                                        break;
                                    case 2:
                                        eVar2.E4(((Long) obj27).longValue());
                                        break;
                                    case 3:
                                        Long l14 = (Long) obj27;
                                        long jLongValue = l14.longValue();
                                        s11.e eVar4 = eVar2;
                                        r53.p2 p2Var2 = eVar4.f155909k;
                                        long j14 = ((s11.d) p2Var2.getValue()).f155893o;
                                        if (j14 <= jLongValue) {
                                            b63.o oVarF4 = s11.e.F4(j14);
                                            b63.o oVarF5 = s11.e.F4(jLongValue);
                                            while (true) {
                                                Object value2 = p2Var2.getValue();
                                                r53.p2 p2Var3 = p2Var2;
                                                b63.o oVar = oVarF4;
                                                b63.o oVar2 = oVarF5;
                                                if (p2Var3.b(value2, s11.d.a((s11.d) value2, null, null, null, false, false, null, false, j14, l14, null, 475135))) {
                                                    g01.a0 a0Var = eVar4.f155908j;
                                                    if (a0Var != null) {
                                                        eVar4.H4(s11.e.D4(a0Var, oVar, oVar2));
                                                    }
                                                } else {
                                                    oVarF5 = oVar2;
                                                    p2Var2 = p2Var3;
                                                    oVarF4 = oVar;
                                                }
                                            }
                                        } else {
                                            eVar4.E4(jLongValue);
                                        }
                                        break;
                                    default:
                                        b63.v vVar = (b63.v) obj27;
                                        vVar.getClass();
                                        s11.e eVar5 = eVar2;
                                        r53.p2 p2Var4 = eVar5.f155909k;
                                        s11.d dVar3 = (s11.d) p2Var4.getValue();
                                        b11.l lVarL = zf.b.L(dVar3.f155884f, dVar3.f155879a, vVar, null, eVar5.f155905g.a());
                                        Long lValueOf = lVarL != null ? Long.valueOf(lVarL.f14331a) : null;
                                        while (true) {
                                            Object value3 = p2Var4.getValue();
                                            s11.e eVar6 = eVar5;
                                            if (!p2Var4.b(value3, s11.d.a((s11.d) value3, null, lValueOf, vVar, false, false, null, false, 0L, null, eVar5.G4(lValueOf), 458559))) {
                                                eVar5 = eVar6;
                                            }
                                            break;
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(lVar11);
                        obj9 = lVar11;
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            obj9 = objQ7;
                            final int i27 = 3;
                            e23.l lVar12 = new e23.l() { // from class: b21.z0
                                @Override // e23.l
                                public final Object invoke(Object obj27) {
                                    Object value;
                                    switch (i27) {
                                        case 0:
                                            b11.l lVar13 = (b11.l) obj27;
                                            lVar13.getClass();
                                            long j8 = lVar13.f14331a;
                                            s11.e eVar3 = eVar2;
                                            r53.p2 p2Var = eVar3.f155909k;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s11.d.a((s11.d) value, null, Long.valueOf(j8), null, false, false, null, false, 0L, null, eVar3.G4(Long.valueOf(j8)), 458687)));
                                            break;
                                        case 1:
                                            eVar2.E4(((Long) obj27).longValue());
                                            break;
                                        case 2:
                                            eVar2.E4(((Long) obj27).longValue());
                                            break;
                                        case 3:
                                            Long l14 = (Long) obj27;
                                            long jLongValue = l14.longValue();
                                            s11.e eVar4 = eVar2;
                                            r53.p2 p2Var2 = eVar4.f155909k;
                                            long j14 = ((s11.d) p2Var2.getValue()).f155893o;
                                            if (j14 <= jLongValue) {
                                                b63.o oVarF4 = s11.e.F4(j14);
                                                b63.o oVarF5 = s11.e.F4(jLongValue);
                                                while (true) {
                                                    Object value2 = p2Var2.getValue();
                                                    r53.p2 p2Var3 = p2Var2;
                                                    b63.o oVar = oVarF4;
                                                    b63.o oVar2 = oVarF5;
                                                    if (p2Var3.b(value2, s11.d.a((s11.d) value2, null, null, null, false, false, null, false, j14, l14, null, 475135))) {
                                                        g01.a0 a0Var = eVar4.f155908j;
                                                        if (a0Var != null) {
                                                            eVar4.H4(s11.e.D4(a0Var, oVar, oVar2));
                                                        }
                                                    } else {
                                                        oVarF5 = oVar2;
                                                        p2Var2 = p2Var3;
                                                        oVarF4 = oVar;
                                                    }
                                                }
                                            } else {
                                                eVar4.E4(jLongValue);
                                            }
                                            break;
                                        default:
                                            b63.v vVar = (b63.v) obj27;
                                            vVar.getClass();
                                            s11.e eVar5 = eVar2;
                                            r53.p2 p2Var4 = eVar5.f155909k;
                                            s11.d dVar3 = (s11.d) p2Var4.getValue();
                                            b11.l lVarL = zf.b.L(dVar3.f155884f, dVar3.f155879a, vVar, null, eVar5.f155905g.a());
                                            Long lValueOf = lVarL != null ? Long.valueOf(lVarL.f14331a) : null;
                                            while (true) {
                                                Object value3 = p2Var4.getValue();
                                                s11.e eVar6 = eVar5;
                                                if (!p2Var4.b(value3, s11.d.a((s11.d) value3, null, lValueOf, vVar, false, false, null, false, 0L, null, eVar5.G4(lValueOf), 458559))) {
                                                    eVar5 = eVar6;
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(lVar12);
                            obj9 = lVar12;
                        }
                    }
                    obj9 = objQ7;
                    e23.l lVar13 = (e23.l) obj9;
                    boolean zR6 = mVar2.r(eVar2);
                    Object objQ8 = mVar2.q();
                    if (zR6) {
                        obj10 = objQ8;
                        final int i28 = 4;
                        e23.l lVar14 = new e23.l() { // from class: b21.z0
                            @Override // e23.l
                            public final Object invoke(Object obj27) {
                                Object value;
                                switch (i28) {
                                    case 0:
                                        b11.l lVar15 = (b11.l) obj27;
                                        lVar15.getClass();
                                        long j8 = lVar15.f14331a;
                                        s11.e eVar3 = eVar2;
                                        r53.p2 p2Var = eVar3.f155909k;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s11.d.a((s11.d) value, null, Long.valueOf(j8), null, false, false, null, false, 0L, null, eVar3.G4(Long.valueOf(j8)), 458687)));
                                        break;
                                    case 1:
                                        eVar2.E4(((Long) obj27).longValue());
                                        break;
                                    case 2:
                                        eVar2.E4(((Long) obj27).longValue());
                                        break;
                                    case 3:
                                        Long l14 = (Long) obj27;
                                        long jLongValue = l14.longValue();
                                        s11.e eVar4 = eVar2;
                                        r53.p2 p2Var2 = eVar4.f155909k;
                                        long j14 = ((s11.d) p2Var2.getValue()).f155893o;
                                        if (j14 <= jLongValue) {
                                            b63.o oVarF4 = s11.e.F4(j14);
                                            b63.o oVarF5 = s11.e.F4(jLongValue);
                                            while (true) {
                                                Object value2 = p2Var2.getValue();
                                                r53.p2 p2Var3 = p2Var2;
                                                b63.o oVar = oVarF4;
                                                b63.o oVar2 = oVarF5;
                                                if (p2Var3.b(value2, s11.d.a((s11.d) value2, null, null, null, false, false, null, false, j14, l14, null, 475135))) {
                                                    g01.a0 a0Var = eVar4.f155908j;
                                                    if (a0Var != null) {
                                                        eVar4.H4(s11.e.D4(a0Var, oVar, oVar2));
                                                    }
                                                } else {
                                                    oVarF5 = oVar2;
                                                    p2Var2 = p2Var3;
                                                    oVarF4 = oVar;
                                                }
                                            }
                                        } else {
                                            eVar4.E4(jLongValue);
                                        }
                                        break;
                                    default:
                                        b63.v vVar = (b63.v) obj27;
                                        vVar.getClass();
                                        s11.e eVar5 = eVar2;
                                        r53.p2 p2Var4 = eVar5.f155909k;
                                        s11.d dVar3 = (s11.d) p2Var4.getValue();
                                        b11.l lVarL = zf.b.L(dVar3.f155884f, dVar3.f155879a, vVar, null, eVar5.f155905g.a());
                                        Long lValueOf = lVarL != null ? Long.valueOf(lVarL.f14331a) : null;
                                        while (true) {
                                            Object value3 = p2Var4.getValue();
                                            s11.e eVar6 = eVar5;
                                            if (!p2Var4.b(value3, s11.d.a((s11.d) value3, null, lValueOf, vVar, false, false, null, false, 0L, null, eVar5.G4(lValueOf), 458559))) {
                                                eVar5 = eVar6;
                                            }
                                            break;
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(lVar14);
                        obj10 = lVar14;
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            obj10 = objQ8;
                            final int i29 = 4;
                            e23.l lVar15 = new e23.l() { // from class: b21.z0
                                @Override // e23.l
                                public final Object invoke(Object obj27) {
                                    Object value;
                                    switch (i29) {
                                        case 0:
                                            b11.l lVar16 = (b11.l) obj27;
                                            lVar16.getClass();
                                            long j8 = lVar16.f14331a;
                                            s11.e eVar3 = eVar2;
                                            r53.p2 p2Var = eVar3.f155909k;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s11.d.a((s11.d) value, null, Long.valueOf(j8), null, false, false, null, false, 0L, null, eVar3.G4(Long.valueOf(j8)), 458687)));
                                            break;
                                        case 1:
                                            eVar2.E4(((Long) obj27).longValue());
                                            break;
                                        case 2:
                                            eVar2.E4(((Long) obj27).longValue());
                                            break;
                                        case 3:
                                            Long l14 = (Long) obj27;
                                            long jLongValue = l14.longValue();
                                            s11.e eVar4 = eVar2;
                                            r53.p2 p2Var2 = eVar4.f155909k;
                                            long j14 = ((s11.d) p2Var2.getValue()).f155893o;
                                            if (j14 <= jLongValue) {
                                                b63.o oVarF4 = s11.e.F4(j14);
                                                b63.o oVarF5 = s11.e.F4(jLongValue);
                                                while (true) {
                                                    Object value2 = p2Var2.getValue();
                                                    r53.p2 p2Var3 = p2Var2;
                                                    b63.o oVar = oVarF4;
                                                    b63.o oVar2 = oVarF5;
                                                    if (p2Var3.b(value2, s11.d.a((s11.d) value2, null, null, null, false, false, null, false, j14, l14, null, 475135))) {
                                                        g01.a0 a0Var = eVar4.f155908j;
                                                        if (a0Var != null) {
                                                            eVar4.H4(s11.e.D4(a0Var, oVar, oVar2));
                                                        }
                                                    } else {
                                                        oVarF5 = oVar2;
                                                        p2Var2 = p2Var3;
                                                        oVarF4 = oVar;
                                                    }
                                                }
                                            } else {
                                                eVar4.E4(jLongValue);
                                            }
                                            break;
                                        default:
                                            b63.v vVar = (b63.v) obj27;
                                            vVar.getClass();
                                            s11.e eVar5 = eVar2;
                                            r53.p2 p2Var4 = eVar5.f155909k;
                                            s11.d dVar3 = (s11.d) p2Var4.getValue();
                                            b11.l lVarL = zf.b.L(dVar3.f155884f, dVar3.f155879a, vVar, null, eVar5.f155905g.a());
                                            Long lValueOf = lVarL != null ? Long.valueOf(lVarL.f14331a) : null;
                                            while (true) {
                                                Object value3 = p2Var4.getValue();
                                                s11.e eVar6 = eVar5;
                                                if (!p2Var4.b(value3, s11.d.a((s11.d) value3, null, lValueOf, vVar, false, false, null, false, 0L, null, eVar5.G4(lValueOf), 458559))) {
                                                    eVar5 = eVar6;
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(lVar15);
                            obj10 = lVar15;
                        }
                    }
                    obj10 = objQ8;
                    e23.l lVar16 = (e23.l) obj10;
                    boolean zR7 = mVar2.r(eVar2);
                    Object objQ9 = mVar2.q();
                    if (zR7) {
                        obj11 = objQ9;
                        final int i30 = 0;
                        e23.a aVar7 = new e23.a() { // from class: b21.a1
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                switch (i30) {
                                    case 0:
                                        s11.e eVar3 = eVar2;
                                        ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new s11.g(eVar3, null), 3);
                                        break;
                                    case 1:
                                        s11.e eVar4 = eVar2;
                                        ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new s11.g(eVar4, null), 3);
                                        break;
                                    default:
                                        r53.p2 p2Var = eVar2.f155909k;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s11.d.a((s11.d) value, null, null, null, false, false, null, false, 0L, null, null, 523263)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar7);
                        obj11 = aVar7;
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            obj11 = objQ9;
                            final int i34 = 0;
                            e23.a aVar8 = new e23.a() { // from class: b21.a1
                                @Override // e23.a
                                public final Object invoke() {
                                    Object value;
                                    switch (i34) {
                                        case 0:
                                            s11.e eVar3 = eVar2;
                                            ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new s11.g(eVar3, null), 3);
                                            break;
                                        case 1:
                                            s11.e eVar4 = eVar2;
                                            ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new s11.g(eVar4, null), 3);
                                            break;
                                        default:
                                            r53.p2 p2Var = eVar2.f155909k;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s11.d.a((s11.d) value, null, null, null, false, false, null, false, 0L, null, null, 523263)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar8);
                            obj11 = aVar8;
                        }
                    }
                    obj11 = objQ9;
                    e23.a aVar9 = (e23.a) obj11;
                    boolean zR8 = mVar2.r(eVar2);
                    Object objQ10 = mVar2.q();
                    if (zR8) {
                        obj12 = objQ10;
                        final int i35 = 1;
                        e23.a aVar10 = new e23.a() { // from class: b21.a1
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                switch (i35) {
                                    case 0:
                                        s11.e eVar3 = eVar2;
                                        ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new s11.g(eVar3, null), 3);
                                        break;
                                    case 1:
                                        s11.e eVar4 = eVar2;
                                        ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new s11.g(eVar4, null), 3);
                                        break;
                                    default:
                                        r53.p2 p2Var = eVar2.f155909k;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s11.d.a((s11.d) value, null, null, null, false, false, null, false, 0L, null, null, 523263)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar10);
                        obj12 = aVar10;
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            obj12 = objQ10;
                            final int i36 = 1;
                            e23.a aVar11 = new e23.a() { // from class: b21.a1
                                @Override // e23.a
                                public final Object invoke() {
                                    Object value;
                                    switch (i36) {
                                        case 0:
                                            s11.e eVar3 = eVar2;
                                            ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new s11.g(eVar3, null), 3);
                                            break;
                                        case 1:
                                            s11.e eVar4 = eVar2;
                                            ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new s11.g(eVar4, null), 3);
                                            break;
                                        default:
                                            r53.p2 p2Var = eVar2.f155909k;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s11.d.a((s11.d) value, null, null, null, false, false, null, false, 0L, null, null, 523263)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar11);
                            obj12 = aVar11;
                        }
                    }
                    obj12 = objQ10;
                    e23.a aVar12 = (e23.a) obj12;
                    boolean zR9 = mVar2.r(eVar2);
                    Object objQ11 = mVar2.q();
                    if (zR9) {
                        obj13 = objQ11;
                        final int i37 = 2;
                        e23.a aVar13 = new e23.a() { // from class: b21.a1
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                switch (i37) {
                                    case 0:
                                        s11.e eVar3 = eVar2;
                                        ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new s11.g(eVar3, null), 3);
                                        break;
                                    case 1:
                                        s11.e eVar4 = eVar2;
                                        ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new s11.g(eVar4, null), 3);
                                        break;
                                    default:
                                        r53.p2 p2Var = eVar2.f155909k;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, s11.d.a((s11.d) value, null, null, null, false, false, null, false, 0L, null, null, 523263)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar13);
                        obj13 = aVar13;
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            obj13 = objQ11;
                            final int i38 = 2;
                            e23.a aVar14 = new e23.a() { // from class: b21.a1
                                @Override // e23.a
                                public final Object invoke() {
                                    Object value;
                                    switch (i38) {
                                        case 0:
                                            s11.e eVar3 = eVar2;
                                            ge1.b.T(androidx.lifecycle.v1.a(eVar3), null, null, new s11.g(eVar3, null), 3);
                                            break;
                                        case 1:
                                            s11.e eVar4 = eVar2;
                                            ge1.b.T(androidx.lifecycle.v1.a(eVar4), null, null, new s11.g(eVar4, null), 3);
                                            break;
                                        default:
                                            r53.p2 p2Var = eVar2.f155909k;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, s11.d.a((s11.d) value, null, null, null, false, false, null, false, 0L, null, null, 523263)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar14);
                            obj13 = aVar14;
                        }
                    }
                    obj13 = objQ11;
                    r11.j.a(eVar, dVar2, feVar, lVar4, lVar7, lVar10, lVar13, lVar16, aVar9, gVar, aVar12, (e23.a) obj13, mVar2, (iIntValue << 3) & 896);
                    mVar2.f();
                }
                x1 x1Var3 = p3.n.f135158a;
                return Unit.INSTANCE;
            case 2:
                final lc.v vVar = (lc.v) obj26;
                final m0 m0Var2 = (m0) obj25;
                final r1.l lVar17 = (r1.l) r16;
                final NutritionActivity.g gVar3 = (NutritionActivity.g) r15;
                final i21.d dVar3 = (i21.d) obj;
                p3.m mVar3 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                dVar3.getClass();
                ((fe) obj2).getClass();
                x1 x1Var4 = p3.n.f135158a;
                e5.a(vVar, m0Var2, z3.f.c(344853264, new e23.u() { // from class: b21.w4
                    /* JADX WARN: Code duplicated, block: B:102:0x04aa  */
                    /* JADX WARN: Code duplicated, block: B:109:0x04d5  */
                    /* JADX WARN: Code duplicated, block: B:114:0x04f2  */
                    /* JADX WARN: Code duplicated, block: B:119:0x050e  */
                    /* JADX WARN: Code duplicated, block: B:124:0x0536  */
                    /* JADX WARN: Code duplicated, block: B:129:0x055b  */
                    /* JADX WARN: Code duplicated, block: B:134:0x0586  */
                    /* JADX WARN: Code duplicated, block: B:139:0x05c1  */
                    /* JADX WARN: Code duplicated, block: B:144:0x0605  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0127  */
                    /* JADX WARN: Code duplicated, block: B:34:0x0186  */
                    /* JADX WARN: Code duplicated, block: B:41:0x01ec  */
                    /* JADX WARN: Code duplicated, block: B:48:0x0247  */
                    /* JADX WARN: Code duplicated, block: B:55:0x0294  */
                    /* JADX WARN: Code duplicated, block: B:60:0x02c8  */
                    /* JADX WARN: Code duplicated, block: B:65:0x02fc  */
                    /* JADX WARN: Code duplicated, block: B:6:0x0062  */
                    /* JADX WARN: Code duplicated, block: B:70:0x0330  */
                    /* JADX WARN: Code duplicated, block: B:75:0x0371  */
                    /* JADX WARN: Code duplicated, block: B:80:0x03b2  */
                    /* JADX WARN: Code duplicated, block: B:85:0x03f3  */
                    /* JADX WARN: Code duplicated, block: B:90:0x0420  */
                    /* JADX WARN: Code duplicated, block: B:97:0x046f  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.u
                    public final Object m(androidx.lifecycle.u1 u1Var, Object obj27, Object obj28, Object obj29, Object obj30, p3.m mVar4, Integer num) {
                        Object obj31;
                        Object obj32;
                        Object v5Var;
                        f11.m mVar5;
                        lc.v vVar2;
                        t13.d dVar4;
                        m21.g gVar4;
                        Object a5Var;
                        Object obj33;
                        final int i39;
                        m21.v vVar3 = (m21.v) u1Var;
                        fe feVar2 = (fe) obj30;
                        int iIntValue2 = num.intValue();
                        ((List) obj27).getClass();
                        ((List) obj28).getClass();
                        ((List) obj29).getClass();
                        feVar2.getClass();
                        p3.x1 x1Var5 = p3.n.f135158a;
                        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                        k23.d dVarB = t0Var.b(l4.m.class);
                        lc.v vVar4 = vVar;
                        final l4.m mVar6 = (l4.m) lc.w.a(vVar4, dVarB);
                        m21.b bVar3 = mVar6.f14927b;
                        b63.u uVarB = mVar6.b();
                        Object obj34 = mVar6.f14929d;
                        boolean zB3 = mVar4.B(bVar3) | mVar4.r(uVarB) | mVar4.r(obj34);
                        Object objQ12 = mVar4.q();
                        int i44 = 8;
                        p3.m.a aVar15 = p3.m.f135153a;
                        if (zB3) {
                            objQ12 = new ak0.m(bVar3, i44, uVarB, obj34);
                            mVar4.K(objQ12);
                        } else {
                            aVar15.getClass();
                            if (objQ12 == p3.m.a.f135155b) {
                                objQ12 = new ak0.m(bVar3, i44, uVarB, obj34);
                                mVar4.K(objQ12);
                            }
                        }
                        e23.a aVar16 = (e23.a) objQ12;
                        mVar4.L(-1614864554);
                        v9.a.f176280a.getClass();
                        ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar4);
                        if (viewModelStoreOwnerA2 == null) {
                            vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return null;
                        }
                        androidx.lifecycle.u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(m21.g.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar4, 0), aVar16);
                        mVar4.R();
                        m21.g gVar5 = (m21.g) u1VarResolveViewModel2;
                        final p3.p1 p1VarC2 = s9.c.c(gVar5.f116126t, mVar4);
                        final lc.m0 m0Var3 = m0Var2;
                        f11.m mVarC = e5.c(vVar4, m0Var3, mVar4);
                        boolean z14 = bVar3 instanceof m21.b.c;
                        if (!z14) {
                            mVarC = null;
                        }
                        if (z14) {
                            mVar4.C(-37251881);
                            p3.p1 p1VarC3 = s9.c.c(vVar4.a().d(null, "recipeIngredientPickResult"), mVar4);
                            d11.h hVar2 = (d11.h) p1VarC3.getF182175a();
                            boolean zB4 = mVar4.B(p1VarC3) | mVar4.r(gVar5) | mVar4.r(vVar4);
                            Object objQ13 = mVar4.q();
                            if (zB4) {
                                obj31 = obj34;
                            } else {
                                aVar15.getClass();
                                obj31 = obj34;
                                if (objQ13 == p3.m.a.f135155b) {
                                }
                                p3.l0.e((e23.p) objQ13, hVar2, mVar4);
                                mVar4.f();
                            }
                            objQ13 = new q5(vVar4, p1VarC3, gVar5, null);
                            mVar4.K(objQ13);
                            p3.l0.e((e23.p) objQ13, hVar2, mVar4);
                            mVar4.f();
                        } else {
                            obj31 = obj34;
                            mVar4.C(-36641646);
                            mVar4.f();
                        }
                        boolean zB5 = mVar4.B(bVar3) | mVar4.r(vVar3);
                        Object objQ14 = mVar4.q();
                        if (zB5) {
                            obj32 = null;
                            objQ14 = new u5(bVar3, vVar3, null);
                            mVar4.K(objQ14);
                        } else {
                            aVar15.getClass();
                            if (objQ14 == p3.m.a.f135155b) {
                                obj32 = null;
                                objQ14 = new u5(bVar3, vVar3, null);
                                mVar4.K(objQ14);
                            } else {
                                obj32 = null;
                            }
                        }
                        p3.l0.e((e23.p) objQ14, bVar3, mVar4);
                        p3.p1 p1VarN = n23.j.n(vVar4, "foodLoggedResult", obj32, mVar4);
                        b11.a aVar17 = (b11.a) p1VarN.getF182175a();
                        boolean zB6 = mVar4.B(p1VarN) | mVar4.r(mVar6) | mVar4.r(gVar5);
                        i21.d dVar5 = dVar3;
                        boolean zR10 = zB6 | mVar4.r(dVar5) | mVar4.r(uVarB) | mVar4.r(m0Var3) | mVar4.r(vVar3) | mVar4.r(mVarC) | mVar4.r(vVar4);
                        Object objQ15 = mVar4.q();
                        if (zR10) {
                            mVar5 = mVarC;
                            vVar2 = vVar4;
                            dVar4 = null;
                            v5Var = new v5(vVar2, p1VarN, mVar6, gVar5, dVar5, uVarB, vVar3, mVar5, m0Var3, null);
                            gVar4 = gVar5;
                            mVar4.K(v5Var);
                        } else {
                            aVar15.getClass();
                            if (objQ15 == p3.m.a.f135155b) {
                                mVar5 = mVarC;
                                vVar2 = vVar4;
                                dVar4 = null;
                                v5Var = new v5(vVar2, p1VarN, mVar6, gVar5, dVar5, uVarB, vVar3, mVar5, m0Var3, null);
                                gVar4 = gVar5;
                                mVar4.K(v5Var);
                            } else {
                                gVar4 = gVar5;
                                v5Var = objQ15;
                                vVar2 = vVar4;
                                mVar5 = mVarC;
                                dVar4 = null;
                            }
                        }
                        p3.l0.e((e23.p) v5Var, aVar17, mVar4);
                        p3.p1 p1VarN2 = n23.j.n(vVar2, "imageRecognitionFoodLoggedResult", dVar4, mVar4);
                        v11.a aVar18 = (v11.a) p1VarN2.getF182175a();
                        boolean zB7 = mVar4.B(p1VarN2) | mVar4.r(gVar4) | mVar4.r(dVar5) | mVar4.r(uVarB) | mVar4.r(vVar2);
                        Object objQ16 = mVar4.q();
                        if (zB7) {
                            objQ16 = new w5(vVar2, p1VarN2, gVar4, dVar5, uVarB, null);
                            mVar4.K(objQ16);
                        } else {
                            aVar15.getClass();
                            if (objQ16 == p3.m.a.f135155b) {
                                objQ16 = new w5(vVar2, p1VarN2, gVar4, dVar5, uVarB, null);
                                mVar4.K(objQ16);
                            }
                        }
                        p3.l0.e((e23.p) objQ16, aVar18, mVar4);
                        if (mVar6.f14927b instanceof m21.b.a) {
                            mVar4.C(-32418237);
                            p3.p1 p1VarC4 = s9.c.c(vVar2.a().d(dVar4, "foodsAddedToMealResult"), mVar4);
                            List list = (List) p1VarC4.getF182175a();
                            boolean zB8 = mVar4.B(p1VarC4) | mVar4.r(m0Var3) | mVar4.r(gVar4) | mVar4.r(vVar2);
                            Object objQ17 = mVar4.q();
                            if (zB8) {
                                objQ17 = new x5(p1VarC4, gVar4, vVar2, m0Var3, null);
                                mVar4.K(objQ17);
                            } else {
                                aVar15.getClass();
                                if (objQ17 == p3.m.a.f135155b) {
                                    objQ17 = new x5(p1VarC4, gVar4, vVar2, m0Var3, null);
                                    mVar4.K(objQ17);
                                }
                            }
                            p3.l0.e((e23.p) objQ17, list, mVar4);
                            mVar4.f();
                        } else {
                            mVar4.C(-31635022);
                            mVar4.f();
                        }
                        p3.p1 p1VarN3 = n23.j.n(vVar2, "quickAddResult", dVar4, mVar4);
                        gb gbVar = (gb) p1VarN3.getF182175a();
                        boolean zB9 = mVar4.B(p1VarN3) | mVar4.r(gVar4) | mVar4.r(vVar2);
                        Object objQ18 = mVar4.q();
                        if (zB9) {
                            objQ18 = new y5(vVar2, p1VarN3, gVar4, dVar4);
                            mVar4.K(objQ18);
                        } else {
                            aVar15.getClass();
                            if (objQ18 == p3.m.a.f135155b) {
                                objQ18 = new y5(vVar2, p1VarN3, gVar4, dVar4);
                                mVar4.K(objQ18);
                            }
                        }
                        p3.l0.e((e23.p) objQ18, gbVar, mVar4);
                        p3.p1 p1VarN4 = n23.j.n(vVar2, "foodUpdatedResult", dVar4, mVar4);
                        Boolean bool = (Boolean) p1VarN4.getF182175a();
                        boolean zB10 = mVar4.B(p1VarN4) | mVar4.r(gVar4) | mVar4.r(vVar2);
                        Object objQ19 = mVar4.q();
                        if (zB10) {
                            objQ19 = new z5(gVar4, vVar2, p1VarN4, dVar4);
                            mVar4.K(objQ19);
                        } else {
                            aVar15.getClass();
                            if (objQ19 == p3.m.a.f135155b) {
                                objQ19 = new z5(gVar4, vVar2, p1VarN4, dVar4);
                                mVar4.K(objQ19);
                            }
                        }
                        p3.l0.e((e23.p) objQ19, bool, mVar4);
                        p3.p1 p1VarN5 = n23.j.n(vVar2, "recipeUpdatedResult", dVar4, mVar4);
                        Boolean bool2 = (Boolean) p1VarN5.getF182175a();
                        boolean zB11 = mVar4.B(p1VarN5) | mVar4.r(gVar4) | mVar4.r(vVar2);
                        Object objQ20 = mVar4.q();
                        if (zB11) {
                            objQ20 = new a6(gVar4, vVar2, p1VarN5, dVar4);
                            mVar4.K(objQ20);
                        } else {
                            aVar15.getClass();
                            if (objQ20 == p3.m.a.f135155b) {
                                objQ20 = new a6(gVar4, vVar2, p1VarN5, dVar4);
                                mVar4.K(objQ20);
                            }
                        }
                        p3.l0.e((e23.p) objQ20, bool2, mVar4);
                        p3.p1 p1VarN6 = n23.j.n(vVar2, "customConsumableCreatedResultKey", dVar4, mVar4);
                        b11.b bVar4 = (b11.b) p1VarN6.getF182175a();
                        boolean zB12 = mVar4.B(p1VarN6) | mVar4.r(gVar4) | mVar4.r(vVar2);
                        Object objQ21 = mVar4.q();
                        if (zB12) {
                            objQ21 = new b6(vVar2, p1VarN6, gVar4, dVar4);
                            mVar4.K(objQ21);
                        } else {
                            aVar15.getClass();
                            if (objQ21 == p3.m.a.f135155b) {
                                objQ21 = new b6(vVar2, p1VarN6, gVar4, dVar4);
                                mVar4.K(objQ21);
                            }
                        }
                        p3.l0.e((e23.p) objQ21, bVar4, mVar4);
                        p3.p1 p1VarC5 = s9.c.c(vVar2.a().d(new o13.p(dVar4, dVar4), "foodFavoriteResult"), mVar4);
                        o13.p pVar2 = (o13.p) p1VarC5.getF182175a();
                        boolean zB13 = mVar4.B(p1VarC5) | mVar4.r(gVar4) | mVar4.r(vVar2);
                        Object objQ22 = mVar4.q();
                        if (zB13) {
                            objQ22 = new r5(vVar2, p1VarC5, gVar4, dVar4);
                            mVar4.K(objQ22);
                        } else {
                            aVar15.getClass();
                            if (objQ22 == p3.m.a.f135155b) {
                                objQ22 = new r5(vVar2, p1VarC5, gVar4, dVar4);
                                mVar4.K(objQ22);
                            }
                        }
                        p3.l0.e((e23.p) objQ22, pVar2, mVar4);
                        p3.p1 p1VarC6 = s9.c.c(vVar2.a().d(new o13.p(dVar4, dVar4), "mealFavoriteResult"), mVar4);
                        o13.p pVar3 = (o13.p) p1VarC6.getF182175a();
                        boolean zB14 = mVar4.B(p1VarC6) | mVar4.r(gVar4) | mVar4.r(vVar2);
                        Object objQ23 = mVar4.q();
                        if (zB14) {
                            objQ23 = new s5(vVar2, p1VarC6, gVar4, dVar4);
                            mVar4.K(objQ23);
                        } else {
                            aVar15.getClass();
                            if (objQ23 == p3.m.a.f135155b) {
                                objQ23 = new s5(vVar2, p1VarC6, gVar4, dVar4);
                                mVar4.K(objQ23);
                            }
                        }
                        p3.l0.e((e23.p) objQ23, pVar3, mVar4);
                        p3.p1 p1VarC7 = s9.c.c(vVar2.a().d(new o13.p(dVar4, dVar4), "recipeFavoriteResult"), mVar4);
                        o13.p pVar4 = (o13.p) p1VarC7.getF182175a();
                        boolean zB15 = mVar4.B(p1VarC7) | mVar4.r(gVar4) | mVar4.r(vVar2);
                        Object objQ24 = mVar4.q();
                        if (zB15) {
                            objQ24 = new t5(vVar2, p1VarC7, gVar4, dVar4);
                            mVar4.K(objQ24);
                        } else {
                            aVar15.getClass();
                            if (objQ24 == p3.m.a.f135155b) {
                                objQ24 = new t5(vVar2, p1VarC7, gVar4, dVar4);
                                mVar4.K(objQ24);
                            }
                        }
                        p3.l0.e((e23.p) objQ24, pVar4, mVar4);
                        boolean zR11 = mVar4.r(gVar4) | mVar4.r(mVar6) | mVar4.r(m0Var3) | mVar4.B(p1VarC2);
                        Object objQ25 = mVar4.q();
                        if (zR11) {
                            objQ25 = new a51.l(gVar4, mVar6, m0Var3, p1VarC2, 13);
                            mVar4.K(objQ25);
                        } else {
                            aVar15.getClass();
                            if (objQ25 == p3.m.a.f135155b) {
                                objQ25 = new a51.l(gVar4, mVar6, m0Var3, p1VarC2, 13);
                                mVar4.K(objQ25);
                            }
                        }
                        e23.p pVar5 = (e23.p) objQ25;
                        boolean zB16 = mVar4.B(bVar3) | mVar4.r(gVar4) | mVar4.r(dVar5) | mVar4.r(uVarB) | mVar4.r(m0Var3) | mVar4.r(vVar3) | mVar4.r(mVar6) | mVar4.r(mVar5);
                        Object objQ26 = mVar4.q();
                        if (zB16) {
                            obj33 = bVar3;
                            a5Var = new a5(obj33, gVar4, vVar3, mVar6, mVar5, dVar5, uVarB, m0Var3, 0);
                            mVar6 = mVar6;
                            uVarB = uVarB;
                            m0Var3 = m0Var3;
                            mVar4.K(a5Var);
                        } else {
                            aVar15.getClass();
                            if (objQ26 == p3.m.a.f135155b) {
                                obj33 = bVar3;
                                a5Var = new a5(obj33, gVar4, vVar3, mVar6, mVar5, dVar5, uVarB, m0Var3, 0);
                                mVar6 = mVar6;
                                uVarB = uVarB;
                                m0Var3 = m0Var3;
                                mVar4.K(a5Var);
                            } else {
                                a5Var = objQ26;
                                obj33 = bVar3;
                            }
                        }
                        e23.l lVar18 = (e23.l) a5Var;
                        Object obj35 = obj31;
                        boolean zR12 = mVar4.r(m0Var3) | mVar4.r(uVarB) | mVar4.B(p1VarC2) | mVar4.r(obj35);
                        Object objQ27 = mVar4.q();
                        if (zR12) {
                            objQ27 = new af0.e((Object) m0Var3, (Object) uVarB, obj35, (Object) p1VarC2, 6);
                            mVar4.K(objQ27);
                        } else {
                            aVar15.getClass();
                            if (objQ27 == p3.m.a.f135155b) {
                                objQ27 = new af0.e((Object) m0Var3, (Object) uVarB, obj35, (Object) p1VarC2, 6);
                                mVar4.K(objQ27);
                            }
                        }
                        e23.a aVar19 = (e23.a) objQ27;
                        boolean zR13 = mVar4.r(gVar4);
                        Object objQ28 = mVar4.q();
                        if (zR13) {
                            i39 = 0;
                            objQ28 = new b5(gVar4, 0);
                            mVar4.K(objQ28);
                        } else {
                            aVar15.getClass();
                            if (objQ28 == p3.m.a.f135155b) {
                                i39 = 0;
                                objQ28 = new b5(gVar4, 0);
                                mVar4.K(objQ28);
                            } else {
                                i39 = 0;
                            }
                        }
                        e23.l lVar19 = (e23.l) objQ28;
                        boolean zR14 = mVar4.r(gVar4);
                        Object objQ29 = mVar4.q();
                        final int i45 = 1;
                        if (zR14) {
                            objQ29 = new b5(gVar4, 1);
                            mVar4.K(objQ29);
                        } else {
                            aVar15.getClass();
                            if (objQ29 == p3.m.a.f135155b) {
                                objQ29 = new b5(gVar4, 1);
                                mVar4.K(objQ29);
                            }
                        }
                        e23.l lVar20 = (e23.l) objQ29;
                        boolean zR15 = mVar4.r(m0Var3);
                        Object objQ30 = mVar4.q();
                        if (zR15) {
                            objQ30 = new aa2.m(m0Var3, 8);
                            mVar4.K(objQ30);
                        } else {
                            aVar15.getClass();
                            if (objQ30 == p3.m.a.f135155b) {
                                objQ30 = new aa2.m(m0Var3, 8);
                                mVar4.K(objQ30);
                            }
                        }
                        e23.a aVar20 = (e23.a) objQ30;
                        boolean zR16 = mVar4.r(m0Var3) | mVar4.r(mVar6) | mVar4.B(p1VarC2);
                        Object objQ31 = mVar4.q();
                        if (zR16) {
                            objQ31 = new e23.a() { // from class: b21.c5
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i39) {
                                        case 0:
                                            l4.m mVar7 = mVar6;
                                            lc.y.l(m0Var3, new l4.j((Long) null, mVar7.b(), new b11.m(((m21.e) p1VarC2.getF182175a()).f116099p, mVar7.f14929d), 1, (p005kotlin.jvm.internal.j) null));
                                            break;
                                        default:
                                            l4.m mVar8 = mVar6;
                                            lc.y.l(m0Var3, new l4.f((String) null, new b11.m(((m21.e) p1VarC2.getF182175a()).f116099p, mVar8.f14929d), mVar8.b(), 1, (p005kotlin.jvm.internal.j) null));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ31);
                        } else {
                            aVar15.getClass();
                            if (objQ31 == p3.m.a.f135155b) {
                                objQ31 = new e23.a() { // from class: b21.c5
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i39) {
                                            case 0:
                                                l4.m mVar7 = mVar6;
                                                lc.y.l(m0Var3, new l4.j((Long) null, mVar7.b(), new b11.m(((m21.e) p1VarC2.getF182175a()).f116099p, mVar7.f14929d), 1, (p005kotlin.jvm.internal.j) null));
                                                break;
                                            default:
                                                l4.m mVar8 = mVar6;
                                                lc.y.l(m0Var3, new l4.f((String) null, new b11.m(((m21.e) p1VarC2.getF182175a()).f116099p, mVar8.f14929d), mVar8.b(), 1, (p005kotlin.jvm.internal.j) null));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar4.K(objQ31);
                            }
                        }
                        e23.a aVar21 = (e23.a) objQ31;
                        boolean zR17 = mVar4.r(m0Var3) | mVar4.r(mVar6) | mVar4.B(p1VarC2);
                        Object objQ32 = mVar4.q();
                        if (zR17) {
                            objQ32 = new e23.a() { // from class: b21.c5
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i45) {
                                        case 0:
                                            l4.m mVar7 = mVar6;
                                            lc.y.l(m0Var3, new l4.j((Long) null, mVar7.b(), new b11.m(((m21.e) p1VarC2.getF182175a()).f116099p, mVar7.f14929d), 1, (p005kotlin.jvm.internal.j) null));
                                            break;
                                        default:
                                            l4.m mVar8 = mVar6;
                                            lc.y.l(m0Var3, new l4.f((String) null, new b11.m(((m21.e) p1VarC2.getF182175a()).f116099p, mVar8.f14929d), mVar8.b(), 1, (p005kotlin.jvm.internal.j) null));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ32);
                        } else {
                            aVar15.getClass();
                            if (objQ32 == p3.m.a.f135155b) {
                                objQ32 = new e23.a() { // from class: b21.c5
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i45) {
                                            case 0:
                                                l4.m mVar7 = mVar6;
                                                lc.y.l(m0Var3, new l4.j((Long) null, mVar7.b(), new b11.m(((m21.e) p1VarC2.getF182175a()).f116099p, mVar7.f14929d), 1, (p005kotlin.jvm.internal.j) null));
                                                break;
                                            default:
                                                l4.m mVar8 = mVar6;
                                                lc.y.l(m0Var3, new l4.f((String) null, new b11.m(((m21.e) p1VarC2.getF182175a()).f116099p, mVar8.f14929d), mVar8.b(), 1, (p005kotlin.jvm.internal.j) null));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar4.K(objQ32);
                            }
                        }
                        e23.a aVar22 = (e23.a) objQ32;
                        boolean zR18 = mVar4.r(m0Var3) | mVar4.r(mVar6) | mVar4.r(gVar4) | mVar4.B(p1VarC2);
                        Object objQ33 = mVar4.q();
                        if (zR18) {
                            final int i46 = 1;
                            final m21.g gVar6 = gVar4;
                            final l4.m mVar7 = mVar6;
                            final lc.m0 m0Var4 = m0Var3;
                            objQ33 = new e23.a() { // from class: b21.z4
                                @Override // e23.a
                                public final Object invoke() {
                                    o4 o4Var;
                                    o4 o4Var2;
                                    switch (i46) {
                                        case 0:
                                            ht.a.f85464a.getClass();
                                            ht.a.a(null, "NutritionVoiceLoggingMicTapped");
                                            l4.m mVar8 = mVar7;
                                            m21.b bVar5 = mVar8.f14927b;
                                            if (bVar5 instanceof m21.b.a) {
                                                o4Var = o4.CREATE_MEAL;
                                            } else {
                                                o4Var = bVar5 instanceof m21.b.c ? o4.CREATE_RECIPE : o4.LOG_FOOD;
                                            }
                                            o4 o4Var3 = o4Var;
                                            b63.u uVarB2 = mVar8.b();
                                            p3.x3 x3Var2 = p1VarC2;
                                            boolean z15 = ((m21.e) x3Var2.getF182175a()).f116099p;
                                            b11.k kVar = ((m21.e) x3Var2.getF182175a()).f116102s;
                                            if (kVar == null) {
                                                kVar = mVar8.f14929d;
                                            }
                                            b11.m mVar9 = new b11.m(z15, kVar);
                                            m21.g gVar7 = gVar6;
                                            lc.y.l(m0Var4, new l4.z0(o4Var3, uVarB2, gVar7.f116117j, gVar7.f116118k, mVar9, bVar5 instanceof m21.b.C2206b));
                                            break;
                                        default:
                                            l4.m mVar10 = mVar7;
                                            m21.b bVar6 = mVar10.f14927b;
                                            if (bVar6 instanceof m21.b.a) {
                                                o4Var2 = o4.CREATE_MEAL;
                                            } else {
                                                o4Var2 = bVar6 instanceof m21.b.c ? o4.CREATE_RECIPE : o4.LOG_FOOD;
                                            }
                                            b63.u uVarB3 = mVar10.b();
                                            m21.g gVar8 = gVar6;
                                            String str4 = gVar8.f116117j;
                                            String str5 = gVar8.f116118k;
                                            p3.x3 x3Var3 = p1VarC2;
                                            boolean z16 = ((m21.e) x3Var3.getF182175a()).f116099p;
                                            b11.k kVar2 = ((m21.e) x3Var3.getF182175a()).f116102s;
                                            if (kVar2 == null) {
                                                kVar2 = mVar10.f14929d;
                                            }
                                            lc.y.l(m0Var4, new l4.o(o4Var2, uVarB3, str4, str5, new b11.m(z16, kVar2)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ33);
                        } else {
                            aVar15.getClass();
                            if (objQ33 == p3.m.a.f135155b) {
                                final int i47 = 1;
                                final m21.g gVar7 = gVar4;
                                final l4.m mVar8 = mVar6;
                                final lc.m0 m0Var5 = m0Var3;
                                objQ33 = new e23.a() { // from class: b21.z4
                                    @Override // e23.a
                                    public final Object invoke() {
                                        o4 o4Var;
                                        o4 o4Var2;
                                        switch (i47) {
                                            case 0:
                                                ht.a.f85464a.getClass();
                                                ht.a.a(null, "NutritionVoiceLoggingMicTapped");
                                                l4.m mVar9 = mVar8;
                                                m21.b bVar5 = mVar9.f14927b;
                                                if (bVar5 instanceof m21.b.a) {
                                                    o4Var = o4.CREATE_MEAL;
                                                } else {
                                                    o4Var = bVar5 instanceof m21.b.c ? o4.CREATE_RECIPE : o4.LOG_FOOD;
                                                }
                                                o4 o4Var3 = o4Var;
                                                b63.u uVarB2 = mVar9.b();
                                                p3.x3 x3Var2 = p1VarC2;
                                                boolean z15 = ((m21.e) x3Var2.getF182175a()).f116099p;
                                                b11.k kVar = ((m21.e) x3Var2.getF182175a()).f116102s;
                                                if (kVar == null) {
                                                    kVar = mVar9.f14929d;
                                                }
                                                b11.m mVar10 = new b11.m(z15, kVar);
                                                m21.g gVar8 = gVar7;
                                                lc.y.l(m0Var5, new l4.z0(o4Var3, uVarB2, gVar8.f116117j, gVar8.f116118k, mVar10, bVar5 instanceof m21.b.C2206b));
                                                break;
                                            default:
                                                l4.m mVar11 = mVar8;
                                                m21.b bVar6 = mVar11.f14927b;
                                                if (bVar6 instanceof m21.b.a) {
                                                    o4Var2 = o4.CREATE_MEAL;
                                                } else {
                                                    o4Var2 = bVar6 instanceof m21.b.c ? o4.CREATE_RECIPE : o4.LOG_FOOD;
                                                }
                                                b63.u uVarB3 = mVar11.b();
                                                m21.g gVar9 = gVar7;
                                                String str4 = gVar9.f116117j;
                                                String str5 = gVar9.f116118k;
                                                p3.x3 x3Var3 = p1VarC2;
                                                boolean z16 = ((m21.e) x3Var3.getF182175a()).f116099p;
                                                b11.k kVar2 = ((m21.e) x3Var3.getF182175a()).f116102s;
                                                if (kVar2 == null) {
                                                    kVar2 = mVar11.f14929d;
                                                }
                                                lc.y.l(m0Var5, new l4.o(o4Var2, uVarB3, str4, str5, new b11.m(z16, kVar2)));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar4.K(objQ33);
                            }
                        }
                        e23.a aVar23 = (e23.a) objQ33;
                        boolean zR19 = mVar4.r(m0Var3) | mVar4.r(mVar6) | mVar4.B(p1VarC2) | mVar4.r(gVar4);
                        Object objQ34 = mVar4.q();
                        if (zR19) {
                            final int i48 = 0;
                            final m21.g gVar8 = gVar4;
                            final l4.m mVar9 = mVar6;
                            final lc.m0 m0Var6 = m0Var3;
                            objQ34 = new e23.a() { // from class: b21.z4
                                @Override // e23.a
                                public final Object invoke() {
                                    o4 o4Var;
                                    o4 o4Var2;
                                    switch (i48) {
                                        case 0:
                                            ht.a.f85464a.getClass();
                                            ht.a.a(null, "NutritionVoiceLoggingMicTapped");
                                            l4.m mVar10 = mVar9;
                                            m21.b bVar5 = mVar10.f14927b;
                                            if (bVar5 instanceof m21.b.a) {
                                                o4Var = o4.CREATE_MEAL;
                                            } else {
                                                o4Var = bVar5 instanceof m21.b.c ? o4.CREATE_RECIPE : o4.LOG_FOOD;
                                            }
                                            o4 o4Var3 = o4Var;
                                            b63.u uVarB2 = mVar10.b();
                                            p3.x3 x3Var2 = p1VarC2;
                                            boolean z15 = ((m21.e) x3Var2.getF182175a()).f116099p;
                                            b11.k kVar = ((m21.e) x3Var2.getF182175a()).f116102s;
                                            if (kVar == null) {
                                                kVar = mVar10.f14929d;
                                            }
                                            b11.m mVar11 = new b11.m(z15, kVar);
                                            m21.g gVar9 = gVar8;
                                            lc.y.l(m0Var6, new l4.z0(o4Var3, uVarB2, gVar9.f116117j, gVar9.f116118k, mVar11, bVar5 instanceof m21.b.C2206b));
                                            break;
                                        default:
                                            l4.m mVar12 = mVar9;
                                            m21.b bVar6 = mVar12.f14927b;
                                            if (bVar6 instanceof m21.b.a) {
                                                o4Var2 = o4.CREATE_MEAL;
                                            } else {
                                                o4Var2 = bVar6 instanceof m21.b.c ? o4.CREATE_RECIPE : o4.LOG_FOOD;
                                            }
                                            b63.u uVarB3 = mVar12.b();
                                            m21.g gVar10 = gVar8;
                                            String str4 = gVar10.f116117j;
                                            String str5 = gVar10.f116118k;
                                            p3.x3 x3Var3 = p1VarC2;
                                            boolean z16 = ((m21.e) x3Var3.getF182175a()).f116099p;
                                            b11.k kVar2 = ((m21.e) x3Var3.getF182175a()).f116102s;
                                            if (kVar2 == null) {
                                                kVar2 = mVar12.f14929d;
                                            }
                                            lc.y.l(m0Var6, new l4.o(o4Var2, uVarB3, str4, str5, new b11.m(z16, kVar2)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ34);
                        } else {
                            aVar15.getClass();
                            if (objQ34 == p3.m.a.f135155b) {
                                final int i49 = 0;
                                final m21.g gVar9 = gVar4;
                                final l4.m mVar10 = mVar6;
                                final lc.m0 m0Var7 = m0Var3;
                                objQ34 = new e23.a() { // from class: b21.z4
                                    @Override // e23.a
                                    public final Object invoke() {
                                        o4 o4Var;
                                        o4 o4Var2;
                                        switch (i49) {
                                            case 0:
                                                ht.a.f85464a.getClass();
                                                ht.a.a(null, "NutritionVoiceLoggingMicTapped");
                                                l4.m mVar11 = mVar10;
                                                m21.b bVar5 = mVar11.f14927b;
                                                if (bVar5 instanceof m21.b.a) {
                                                    o4Var = o4.CREATE_MEAL;
                                                } else {
                                                    o4Var = bVar5 instanceof m21.b.c ? o4.CREATE_RECIPE : o4.LOG_FOOD;
                                                }
                                                o4 o4Var3 = o4Var;
                                                b63.u uVarB2 = mVar11.b();
                                                p3.x3 x3Var2 = p1VarC2;
                                                boolean z15 = ((m21.e) x3Var2.getF182175a()).f116099p;
                                                b11.k kVar = ((m21.e) x3Var2.getF182175a()).f116102s;
                                                if (kVar == null) {
                                                    kVar = mVar11.f14929d;
                                                }
                                                b11.m mVar12 = new b11.m(z15, kVar);
                                                m21.g gVar10 = gVar9;
                                                lc.y.l(m0Var7, new l4.z0(o4Var3, uVarB2, gVar10.f116117j, gVar10.f116118k, mVar12, bVar5 instanceof m21.b.C2206b));
                                                break;
                                            default:
                                                l4.m mVar13 = mVar10;
                                                m21.b bVar6 = mVar13.f14927b;
                                                if (bVar6 instanceof m21.b.a) {
                                                    o4Var2 = o4.CREATE_MEAL;
                                                } else {
                                                    o4Var2 = bVar6 instanceof m21.b.c ? o4.CREATE_RECIPE : o4.LOG_FOOD;
                                                }
                                                b63.u uVarB3 = mVar13.b();
                                                m21.g gVar11 = gVar9;
                                                String str4 = gVar11.f116117j;
                                                String str5 = gVar11.f116118k;
                                                p3.x3 x3Var3 = p1VarC2;
                                                boolean z16 = ((m21.e) x3Var3.getF182175a()).f116099p;
                                                b11.k kVar2 = ((m21.e) x3Var3.getF182175a()).f116102s;
                                                if (kVar2 == null) {
                                                    kVar2 = mVar13.f14929d;
                                                }
                                                lc.y.l(m0Var7, new l4.o(o4Var2, uVarB3, str4, str5, new b11.m(z16, kVar2)));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar4.K(objQ34);
                            }
                        }
                        e23.a aVar24 = (e23.a) objQ34;
                        boolean zB17 = mVar4.B(obj33);
                        Object obj36 = lVar17;
                        boolean zR20 = zB17 | mVar4.r(obj36) | mVar4.r(m0Var3);
                        Object obj37 = gVar3;
                        boolean zB18 = zR20 | mVar4.B(obj37);
                        Object objQ35 = mVar4.q();
                        if (zB18) {
                            objQ35 = new af0.e(obj33, obj36, obj37, m0Var3, 5);
                            mVar4.K(objQ35);
                        } else {
                            aVar15.getClass();
                            if (objQ35 == p3.m.a.f135155b) {
                                objQ35 = new af0.e(obj33, obj36, obj37, m0Var3, 5);
                                mVar4.K(objQ35);
                            }
                        }
                        l21.i.a(gVar4, null, feVar2, pVar5, lVar18, aVar19, lVar19, lVar20, aVar20, aVar21, aVar22, aVar23, aVar24, (e23.a) objQ35, mVar4, (iIntValue2 >> 6) & 896, 0, 2);
                        return Unit.INSTANCE;
                    }
                }, mVar3), mVar3, 384);
                return Unit.INSTANCE;
            case 3:
                gl1.b bVar3 = (gl1.b) obj26;
                e23.a aVar15 = (e23.a) obj25;
                ug2.x xVar = (ug2.x) r16;
                lc.y yVar2 = (lc.y) r15;
                lc.v vVar2 = (lc.v) obj2;
                p3.m mVar4 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, vVar2);
                x1 x1Var5 = p3.n.f135158a;
                boolean zB3 = mVar4.B(vVar2);
                Object objQ12 = mVar4.q();
                if (zB3) {
                    objQ12 = yVar2.c(s0.f105811a.b(c42.n.a.class));
                    mVar4.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = yVar2.c(s0.f105811a.b(c42.n.a.class));
                        mVar4.K(objQ12);
                    }
                }
                lc.v vVar3 = (lc.v) objQ12;
                t0 t0Var = s0.f105811a;
                c42.h.e(((c42.n.a) lc.w.a(vVar3, t0Var.b(c42.n.a.class))).f24416a, ((c42.n.a) lc.w.a(vVar3, t0Var.b(c42.n.a.class))).f24417b, bVar3, aVar15, xVar, mVar4, 0);
                return Unit.INSTANCE;
            case 4:
                c50.f fVar2 = (c50.f) obj26;
                m0 m0Var3 = (m0) r16;
                lc.v vVar4 = (lc.v) obj2;
                p3.m mVar5 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, vVar4);
                x1 x1Var6 = p3.n.f135158a;
                fa0.h hVarA = ca0.h.a(vVar4, (o1) r15, (e23.a) obj25, m0Var3, mVar5);
                p1 p1VarC2 = s9.c.c(hVarA.f70131m, mVar5);
                List list = (List) p1VarC2.getF182175a();
                boolean zB4 = mVar5.B(p1VarC2) | mVar5.B(fVar2) | mVar5.r(hVarA) | mVar5.r(m0Var3);
                Object objQ13 = mVar5.q();
                if (zB4) {
                    ca0.f fVar3 = new ca0.f(p1VarC2, fVar2, hVarA, m0Var3, null);
                    mVar5.K(fVar3);
                    objQ13 = fVar3;
                } else {
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        ca0.f fVar4 = new ca0.f(p1VarC2, fVar2, hVarA, m0Var3, null);
                        mVar5.K(fVar4);
                        objQ13 = fVar4;
                    }
                }
                l0.e((e23.p) objQ13, list, mVar5);
                da0.p.d(null, true, null, null, null, null, null, mVar5, 48, 253);
                return Unit.INSTANCE;
            case 5:
                ca0.u1 u1Var = (ca0.u1) obj26;
                lc.v vVar5 = (lc.v) obj2;
                p3.m mVar6 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar5.getClass();
                x1 x1Var7 = p3.n.f135158a;
                ga0.a aVarC = ca0.h0.c(vVar5, (e23.a) obj25, (s1) r16, (m0) r15, mVar6);
                p1 p1VarC3 = s9.c.c(aVarC.f76601j, mVar6);
                la0.a aVar16 = ((i0.n) lc.w.a(vVar5, s0.f105811a.b(i0.n.class))).f26271a;
                Unit unit = Unit.INSTANCE;
                boolean zR10 = mVar6.r(aVarC) | mVar6.r(aVar16);
                Object objQ14 = mVar6.q();
                if (zR10) {
                    obj14 = objQ14;
                    ca0.e0 e0Var = new ca0.e0(aVarC, aVar16, null);
                    mVar6.K(e0Var);
                    obj14 = e0Var;
                } else {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        obj14 = objQ14;
                        ca0.e0 e0Var2 = new ca0.e0(aVarC, aVar16, null);
                        mVar6.K(e0Var2);
                        obj14 = e0Var2;
                    }
                }
                obj14 = objQ14;
                l0.e((e23.p) obj14, unit, mVar6);
                Boolean bool = (Boolean) p1VarC3.getF182175a();
                bool.booleanValue();
                boolean zB5 = mVar6.B(p1VarC3) | mVar6.B(u1Var);
                Object objQ15 = mVar6.q();
                if (zB5) {
                    obj15 = objQ15;
                    ca0.f0 f0Var = new ca0.f0(u1Var, p1VarC3, null);
                    mVar6.K(f0Var);
                    obj15 = f0Var;
                } else {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        obj15 = objQ15;
                        ca0.f0 f0Var2 = new ca0.f0(u1Var, p1VarC3, null);
                        mVar6.K(f0Var2);
                        obj15 = f0Var2;
                    }
                }
                obj15 = objQ15;
                l0.e((e23.p) obj15, bool, mVar6);
                da0.p.d(null, true, null, null, null, null, null, mVar6, 48, 253);
                return unit;
            case 6:
                final m0 m0Var4 = (m0) obj26;
                final o0 o0Var = (o0) obj25;
                t1 t1Var = (t1) r15;
                e23.l lVar18 = (e23.l) r16;
                lc.v vVar6 = (lc.v) obj2;
                p3.m mVar7 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, vVar6);
                x1 x1Var8 = p3.n.f135158a;
                b1.i iVar5 = (b1.i) lc.w.a(vVar6, s0.f105811a.b(b1.i.class));
                Object objQ16 = mVar7.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                Object obj27 = objQ16;
                if (objQ16 == c2565a) {
                    d90.i iVar6 = iVar5.f26100a.f111531p.f58436b;
                    mVar7.K(iVar6);
                    obj27 = iVar6;
                }
                d90.i iVar7 = (d90.i) obj27;
                if (iVar7 == null) {
                    return Unit.INSTANCE;
                }
                ta0.x xVarA = y0.a(vVar6, m0Var4, mVar7);
                boolean zR11 = mVar7.r(m0Var4) | mVar7.B(o0Var);
                Object objQ17 = mVar7.q();
                if (zR11 || objQ17 == c2565a) {
                    r14 = 0;
                    final boolean z14 = false ? 1 : 0;
                    e23.a aVar17 = new e23.a() { // from class: ca0.p0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (z14) {
                                case 0:
                                    lc.m0 m0Var5 = m0Var4;
                                    try {
                                        m0Var5.c(p005kotlin.jvm.internal.s0.f105811a.b(b1.r.class));
                                        m0Var5.n();
                                    } catch (IllegalArgumentException unused) {
                                        o0Var.invoke();
                                    }
                                    break;
                                default:
                                    lc.m0 m0Var6 = m0Var4;
                                    try {
                                        m0Var6.c(p005kotlin.jvm.internal.s0.f105811a.b(b1.r.class));
                                        m0Var6.n();
                                    } catch (IllegalArgumentException unused2) {
                                        o0Var.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar7.K(aVar17);
                    obj16 = aVar17;
                } else {
                    r14 = 0;
                    obj16 = objQ17;
                }
                c.w.a(r14, 1, (e23.a) obj16, mVar7, r14);
                l90.b bVar4 = iVar5.f26100a;
                String str4 = bVar4.f111522g;
                String str5 = bVar4.f111521f;
                String str6 = bVar4.f111516a;
                o90.a aVar18 = bVar4.f111526k;
                boolean zR12 = mVar7.r(iVar5) | mVar7.r(xVarA) | mVar7.B(t1Var) | mVar7.r(m0Var4);
                Object objQ18 = mVar7.q();
                if (zR12 || objQ18 == c2565a) {
                    af0.e eVar3 = new af0.e(iVar5, xVarA, m0Var4, t1Var, 10);
                    mVar7.K(eVar3);
                    objQ18 = eVar3;
                }
                e23.a aVar19 = (e23.a) objQ18;
                boolean zR13 = mVar7.r(m0Var4) | mVar7.B(o0Var);
                Object objQ19 = mVar7.q();
                Object obj28 = objQ19;
                if (zR13 || objQ19 == c2565a) {
                    e23.a aVar20 = new e23.a() { // from class: ca0.p0
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    lc.m0 m0Var5 = m0Var4;
                                    try {
                                        m0Var5.c(p005kotlin.jvm.internal.s0.f105811a.b(b1.r.class));
                                        m0Var5.n();
                                    } catch (IllegalArgumentException unused) {
                                        o0Var.invoke();
                                    }
                                    break;
                                default:
                                    lc.m0 m0Var6 = m0Var4;
                                    try {
                                        m0Var6.c(p005kotlin.jvm.internal.s0.f105811a.b(b1.r.class));
                                        m0Var6.n();
                                    } catch (IllegalArgumentException unused2) {
                                        o0Var.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar7.K(aVar20);
                    obj28 = aVar20;
                }
                tb0.m.a(str4, str5, str6, aVar18, iVar7, aVar19, (e23.a) obj28, lVar18, mVar7, 0);
                return Unit.INSTANCE;
            case 7:
                aa2.f fVar5 = (aa2.f) obj26;
                o1 o1Var = (o1) obj25;
                m0 m0Var5 = (m0) r15;
                e23.l lVar19 = (e23.l) r16;
                lc.v vVar7 = (lc.v) obj2;
                p3.m mVar8 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar7.getClass();
                x1 x1Var9 = p3.n.f135158a;
                n1.j jVar = (n1.j) lc.w.a(vVar7, s0.f105811a.b(n1.j.class));
                boolean zB6 = mVar8.B(fVar5) | mVar8.r(jVar);
                Object objQ20 = mVar8.q();
                if (zB6) {
                    obj17 = objQ20;
                    j1 j1Var = new j1(2, fVar5, jVar);
                    mVar8.K(j1Var);
                    obj17 = j1Var;
                } else {
                    aVar.getClass();
                    if (objQ20 == p3.m.a.f135155b) {
                        obj17 = objQ20;
                        j1 j1Var2 = new j1(2, fVar5, jVar);
                        mVar8.K(j1Var2);
                        obj17 = j1Var2;
                    }
                }
                obj17 = objQ20;
                c.w.a(0, 1, (e23.a) obj17, mVar8, false);
                q90.c cVar3 = jVar.f26372a;
                boolean zR14 = mVar8.r(m0Var5) | mVar8.B(fVar5);
                Object objQ21 = mVar8.q();
                if (zR14) {
                    obj18 = objQ21;
                    aa2.f fVar6 = new aa2.f(16, m0Var5, fVar5);
                    mVar8.K(fVar6);
                    obj18 = fVar6;
                } else {
                    aVar.getClass();
                    if (objQ21 == p3.m.a.f135155b) {
                        obj18 = objQ21;
                        aa2.f fVar7 = new aa2.f(16, m0Var5, fVar5);
                        mVar8.K(fVar7);
                        obj18 = fVar7;
                    }
                }
                obj18 = objQ21;
                ya0.e0.a(cVar3, o1Var, (e23.q) obj18, lVar19, mVar8, 0);
                return Unit.INSTANCE;
            case 8:
                e23.a aVar21 = (e23.a) obj25;
                m0 m0Var6 = (m0) obj26;
                x80.e eVar4 = (x80.e) r16;
                e23.a aVar22 = (e23.a) r15;
                p3.m mVar9 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                x1 x1Var10 = p3.n.f135158a;
                boolean zB7 = mVar9.B(aVar21);
                Object objQ22 = mVar9.q();
                if (zB7) {
                    obj19 = objQ22;
                    v0 v0Var = new v0(aVar21, 5);
                    mVar9.K(v0Var);
                    obj19 = v0Var;
                } else {
                    aVar.getClass();
                    if (objQ22 == p3.m.a.f135155b) {
                        obj19 = objQ22;
                        v0 v0Var2 = new v0(aVar21, 5);
                        mVar9.K(v0Var2);
                        obj19 = v0Var2;
                    }
                }
                obj19 = objQ22;
                c.w.a(0, 1, (e23.a) obj19, mVar9, false);
                Object objQ23 = mVar9.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                Object obj29 = objQ23;
                if (objQ23 == c2565a2) {
                    q90.c cVar4 = (q90.c) aVar22.invoke();
                    mVar9.K(cVar4);
                    obj29 = cVar4;
                }
                q90.c cVar5 = (q90.c) obj29;
                boolean zR15 = mVar9.r(cVar5);
                Object objQ24 = mVar9.q();
                Object obj30 = objQ24;
                if (zR15 || objQ24 == c2565a2) {
                    a90.d dVar4 = new a90.d(cVar5, 3);
                    mVar9.K(dVar4);
                    obj30 = dVar4;
                }
                e23.a aVar23 = (e23.a) obj30;
                mVar9.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA2 = v9.a.a(mVar9);
                if (viewModelStoreOwnerA2 == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(s0.f105811a.b(ha0.k.class), viewModelStoreOwnerA2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA2), null, KoinApplicationKt.currentKoinScope(mVar9, 0), aVar23);
                mVar9.R();
                ha0.k kVar = (ha0.k) u1VarResolveViewModel2;
                boolean zR16 = mVar9.r(m0Var6) | mVar9.r(eVar4);
                Object objQ25 = mVar9.q();
                if (zR16 || objQ25 == c2565a2) {
                    obj20 = objQ25;
                    ca0.u1 u1Var2 = new ca0.u1(9, m0Var6, eVar4);
                    mVar9.K(u1Var2);
                    obj20 = u1Var2;
                }
                ha0.f.d(kVar, (e23.a) obj20, aVar21, mVar9, 0);
                return Unit.INSTANCE;
            case 9:
                e23.l lVar20 = (e23.l) r16;
                e23.a aVar24 = (e23.a) obj25;
                m0 m0Var7 = (m0) obj26;
                e23.p pVar2 = (e23.p) r15;
                p3.m mVar10 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                x1 x1Var11 = p3.n.f135158a;
                boolean zB8 = mVar10.B(lVar20);
                Object objQ26 = mVar10.q();
                if (zB8) {
                    objQ26 = new a40.a(lVar20, 20);
                    mVar10.K(objQ26);
                } else {
                    aVar.getClass();
                    if (objQ26 == p3.m.a.f135155b) {
                        objQ26 = new a40.a(lVar20, 20);
                        mVar10.K(objQ26);
                    }
                }
                c.w.a(0, 1, (e23.a) objQ26, mVar10, false);
                q90.c cVar6 = (q90.c) aVar24.invoke();
                boolean zR17 = mVar10.r(m0Var7) | mVar10.B(pVar2) | mVar10.B(aVar24);
                Object objQ27 = mVar10.q();
                if (zR17) {
                    objQ27 = new a4.a(m0Var7, 27, pVar2, aVar24);
                    mVar10.K(objQ27);
                } else {
                    aVar.getClass();
                    if (objQ27 == p3.m.a.f135155b) {
                        objQ27 = new a4.a(m0Var7, 27, pVar2, aVar24);
                        mVar10.K(objQ27);
                    }
                }
                e23.l lVar21 = (e23.l) objQ27;
                boolean zB9 = mVar10.B(lVar20);
                Object objQ28 = mVar10.q();
                if (zB9) {
                    objQ28 = new a40.a(lVar20, 21);
                    mVar10.K(objQ28);
                } else {
                    aVar.getClass();
                    if (objQ28 == p3.m.a.f135155b) {
                        objQ28 = new a40.a(lVar20, 21);
                        mVar10.K(objQ28);
                    }
                }
                xa0.a.c(cVar6, lVar21, (e23.a) objQ28, mVar10, 0);
                return Unit.INSTANCE;
            case 10:
                e23.a aVar25 = (e23.a) obj25;
                e23.l lVar22 = (e23.l) r16;
                e23.l lVar23 = (e23.l) obj26;
                e23.a aVar26 = (e23.a) r15;
                p3.m mVar11 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                x1 x1Var12 = p3.n.f135158a;
                d90.h hVar2 = ((q90.c) aVar25.invoke()).f143495c.f111531p.f58443i;
                d90.h hVar3 = hVar2 == null ? new d90.h((d90.j) null, 0, 0, false, 15, (p005kotlin.jvm.internal.j) null) : hVar2;
                q90.c cVar7 = (q90.c) aVar25.invoke();
                boolean zB10 = mVar11.B(lVar22);
                Object objQ29 = mVar11.q();
                if (zB10) {
                    objQ29 = new a40.a(lVar22, 19);
                    mVar11.K(objQ29);
                } else {
                    aVar.getClass();
                    if (objQ29 == p3.m.a.f135155b) {
                        objQ29 = new a40.a(lVar22, 19);
                        mVar11.K(objQ29);
                    }
                }
                e23.a aVar27 = (e23.a) objQ29;
                Object objQ30 = mVar11.q();
                aVar.getClass();
                if (objQ30 == p3.m.a.f135155b) {
                    objQ30 = new j0(19);
                    mVar11.K(objQ30);
                }
                tb0.g.a(hVar3, cVar7, aVar27, (e23.a) objQ30, lVar23, aVar26, mVar11, 3072, 0);
                return Unit.INSTANCE;
            case 11:
                v0 v0Var3 = (v0) obj26;
                m0 m0Var8 = (m0) r16;
                ca0.u1 u1Var3 = (ca0.u1) r15;
                e23.a aVar28 = (e23.a) obj25;
                lc.v vVar8 = (lc.v) obj2;
                p3.m mVar12 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar8.getClass();
                x1 x1Var13 = p3.n.f135158a;
                wa0.c cVarA = o2.a(vVar8, v0Var3, m0Var8, mVar12);
                p1 p1VarC4 = s9.c.c(cVarA.f183769f, mVar12);
                Boolean bool2 = ((wa0.c.b) p1VarC4.getF182175a()).f183772c;
                Boolean bool3 = Boolean.TRUE;
                if (p005kotlin.jvm.internal.s.g(bool2, bool3)) {
                    mVar12.C(-1695713514);
                    strH = gl1.y.P(R.string.lbl_try_inreach_lte_free_trial_title, new Object[]{Integer.valueOf(((wa0.c.b) p1VarC4.getF182175a()).f183773d)}, mVar12);
                    mVar12.f();
                } else {
                    strH = sn.a.h(mVar12, -1695589328, R.string.lbl_stay_connected_inreach_plan_title, mVar12);
                }
                String str7 = strH;
                if (p005kotlin.jvm.internal.s.g(((wa0.c.b) p1VarC4.getF182175a()).f183772c, bool3)) {
                    mVar12.C(-1695422982);
                    strH2 = gl1.y.P(R.string.lbl_try_free_inreach_description, new Object[]{Integer.valueOf(((wa0.c.b) p1VarC4.getF182175a()).f183773d)}, mVar12);
                    mVar12.f();
                } else {
                    strH2 = sn.a.h(mVar12, -1695302950, R.string.lbl_try_inreach_description, mVar12);
                }
                String str8 = strH2;
                long j8 = ((q90.c) v0Var3.invoke()).f143493a;
                boolean zR18 = mVar12.r(m0Var8);
                Object objQ31 = mVar12.q();
                if (zR18) {
                    objQ31 = new ca0.u0(m0Var8, 18);
                    mVar12.K(objQ31);
                } else {
                    aVar.getClass();
                    if (objQ31 == p3.m.a.f135155b) {
                        objQ31 = new ca0.u0(m0Var8, 18);
                        mVar12.K(objQ31);
                    }
                }
                e23.a aVar29 = (e23.a) objQ31;
                boolean zB11 = mVar12.B(u1Var3);
                Object objQ32 = mVar12.q();
                if (zB11) {
                    objQ32 = new l2(u1Var3, 0);
                    mVar12.K(objQ32);
                } else {
                    aVar.getClass();
                    if (objQ32 == p3.m.a.f135155b) {
                        objQ32 = new l2(u1Var3, 0);
                        mVar12.K(objQ32);
                    }
                }
                e23.a aVar30 = (e23.a) objQ32;
                boolean zB12 = mVar12.B(aVar28);
                Object objQ33 = mVar12.q();
                if (zB12) {
                    objQ33 = new v0(aVar28, 7);
                    mVar12.K(objQ33);
                } else {
                    aVar.getClass();
                    if (objQ33 == p3.m.a.f135155b) {
                        objQ33 = new v0(aVar28, 7);
                        mVar12.K(objQ33);
                    }
                }
                com.garmin.android.apps.connectmobile.device.setup.presentation.inreach.a.a(cVarA, str7, str8, j8, aVar29, aVar30, (e23.a) objQ33, mVar12, 0);
                return Unit.INSTANCE;
            case 12:
                ca0.u1 u1Var4 = (ca0.u1) obj26;
                e23.a aVar31 = (e23.a) obj25;
                lc.v vVar9 = (lc.v) obj2;
                p3.m mVar13 = (p3.m) obj3;
                q2.t((Integer) obj4, (r1.l) obj, vVar9);
                x1 x1Var14 = p3.n.f135158a;
                za0.i iVarA = t2.a(vVar9, (e23.a) r16, (m0) r15, mVar13);
                boolean z15 = (iVarA.f203249d.f143503k ? za0.o.SCREENLESS : za0.o.DEFAULT) == za0.o.SCREENLESS;
                Object objQ34 = mVar13.q();
                aVar.getClass();
                if (objQ34 == p3.m.a.f135155b) {
                    objQ34 = new d2(3);
                    mVar13.K(objQ34);
                }
                za0.q.b(iVarA, u1Var4, (e23.l) objQ34, u1Var4, aVar31, z15, mVar13, 384);
                return Unit.INSTANCE;
            case 13:
                ca0.u1 u1Var5 = (ca0.u1) obj26;
                m0 m0Var9 = (m0) r16;
                e23.a aVar32 = (e23.a) obj25;
                lc.v vVar10 = (lc.v) obj2;
                p3.m mVar14 = (p3.m) obj3;
                ((Integer) obj4).intValue();
                ((r1.l) obj).getClass();
                vVar10.getClass();
                x1 x1Var15 = p3.n.f135158a;
                sa0.n nVarA = f4.a(vVar10, (e23.a) r15, m0Var9, mVar14);
                p1 p1VarC5 = s9.c.c(nVarA.f158213d, mVar14);
                t0 t0Var2 = s0.f105811a;
                String str9 = ((g4.c) lc.w.a(vVar10, t0Var2.b(g4.c.class))).f26233a;
                WifiSetup.SecurityType securityTypeValueOf = WifiSetup.SecurityType.valueOf(((g4.c) lc.w.a(vVar10, t0Var2.b(g4.c.class))).f26234b);
                String str10 = ((g4.c) lc.w.a(vVar10, t0Var2.b(g4.c.class))).f26235c;
                sa0.n.b bVar5 = (sa0.n.b) p1VarC5.getF182175a();
                boolean zB13 = mVar14.B(u1Var5);
                Object objQ35 = mVar14.q();
                if (zB13) {
                    obj21 = objQ35;
                    e4 e4Var = new e4(u1Var5, 1);
                    mVar14.K(e4Var);
                    obj21 = e4Var;
                } else {
                    aVar.getClass();
                    if (objQ35 == p3.m.a.f135155b) {
                        obj21 = objQ35;
                        e4 e4Var2 = new e4(u1Var5, 1);
                        mVar14.K(e4Var2);
                        obj21 = e4Var2;
                    }
                }
                obj21 = objQ35;
                e23.a aVar33 = (e23.a) obj21;
                boolean zB14 = mVar14.B(u1Var5);
                Object objQ36 = mVar14.q();
                if (zB14) {
                    obj22 = objQ36;
                    e4 e4Var3 = new e4(u1Var5, 2);
                    mVar14.K(e4Var3);
                    obj22 = e4Var3;
                } else {
                    aVar.getClass();
                    if (objQ36 == p3.m.a.f135155b) {
                        obj22 = objQ36;
                        e4 e4Var4 = new e4(u1Var5, 2);
                        mVar14.K(e4Var4);
                        obj22 = e4Var4;
                    }
                }
                obj22 = objQ36;
                e23.a aVar34 = (e23.a) obj22;
                boolean zR19 = mVar14.r(nVarA) | mVar14.r(m0Var9);
                Object objQ37 = mVar14.q();
                if (zR19) {
                    obj23 = objQ37;
                    j1 j1Var3 = new j1(4, nVarA, m0Var9);
                    mVar14.K(j1Var3);
                    obj23 = j1Var3;
                } else {
                    aVar.getClass();
                    if (objQ37 == p3.m.a.f135155b) {
                        obj23 = objQ37;
                        j1 j1Var4 = new j1(4, nVarA, m0Var9);
                        mVar14.K(j1Var4);
                        obj23 = j1Var4;
                    }
                }
                obj23 = objQ37;
                sa0.m.c(str9, securityTypeValueOf, str10, bVar5, nVarA, aVar33, aVar34, (e23.a) obj23, aVar32, mVar14, 0);
                return Unit.INSTANCE;
            case 14:
                g81.l0 l0Var = (g81.l0) obj26;
                u4.d dVar5 = (u4.d) r16;
                p0 p0Var = (p0) r15;
                e23.a aVar35 = (e23.a) obj25;
                int iIntValue2 = ((Integer) obj2).intValue();
                p3.m mVar15 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((h2.c0) obj).getClass();
                x1 x1Var16 = p3.n.f135158a;
                if (iIntValue2 == 0) {
                    mVar15.C(-1030397708);
                    d81.a0.d(x2.f(h4.r.S, 1.0f), l0Var.f76364a, dVar5, p0Var, aVar35, mVar15, 6);
                    mVar15.f();
                } else {
                    mVar15.C(-1029925392);
                    d81.a0.d(x2.f(h4.r.S, 1.0f), l0Var.f76365b, dVar5, p0Var, aVar35, mVar15, 6);
                    mVar15.f();
                }
                return Unit.INSTANCE;
            case 15:
                zs.c cVar8 = (zs.c) obj26;
                m0 m0Var10 = (m0) obj25;
                e23.l lVar24 = (e23.l) r16;
                Context context2 = (Context) r15;
                p3.m mVar16 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                x1 x1Var17 = p3.n.f135158a;
                boolean zR20 = mVar16.r(m0Var10) | mVar16.B(lVar24);
                Object objQ38 = mVar16.q();
                if (zR20) {
                    objQ38 = new r1(m0Var10, lVar24, 1);
                    mVar16.K(objQ38);
                } else {
                    aVar.getClass();
                    if (objQ38 == p3.m.a.f135155b) {
                        objQ38 = new r1(m0Var10, lVar24, 1);
                        mVar16.K(objQ38);
                    }
                }
                e23.l lVar25 = (e23.l) objQ38;
                boolean zB15 = mVar16.B(lVar24);
                Object objQ39 = mVar16.q();
                if (zB15) {
                    objQ39 = new a40.a(lVar24, 25);
                    mVar16.K(objQ39);
                } else {
                    aVar.getClass();
                    if (objQ39 == p3.m.a.f135155b) {
                        objQ39 = new a40.a(lVar24, 25);
                        mVar16.K(objQ39);
                    }
                }
                e23.a aVar36 = (e23.a) objQ39;
                boolean zR21 = mVar16.r(context2) | mVar16.r(cVar8);
                Object objQ40 = mVar16.q();
                if (zR21) {
                    objQ40 = new dt.c(context2, cVar8, 1);
                    mVar16.K(objQ40);
                } else {
                    aVar.getClass();
                    if (objQ40 == p3.m.a.f135155b) {
                        objQ40 = new dt.c(context2, cVar8, 1);
                        mVar16.K(objQ40);
                    }
                }
                et.l.a(cVar8, lVar25, aVar36, (e23.a) objQ40, mVar16, 0);
                return Unit.INSTANCE;
            case 16:
                return a(obj, obj2, obj3, obj4);
            case 17:
                zc.d dVar6 = (zc.d) obj26;
                fo.q qVar = (fo.q) obj25;
                e23.p pVar3 = (e23.p) r15;
                e23.l lVar26 = (e23.l) r16;
                int iIntValue3 = ((Integer) obj2).intValue();
                p3.m mVar17 = (p3.m) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= mVar17.k(iIntValue3) ? 32 : 16;
                }
                if (mVar17.n(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    x1 x1Var18 = p3.n.f135158a;
                    wo0.a aVar37 = (wo0.a) dVar6.a(iIntValue3);
                    if (aVar37 == null) {
                        return Unit.INSTANCE;
                    }
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    boolean z16 = qVar.f72413l;
                    boolean zB16 = mVar17.B(qVar) | ((iIntValue4 & 112) == 32) | mVar17.B(aVar37) | mVar17.B(pVar3);
                    Object objQ41 = mVar17.q();
                    if (zB16) {
                        objQ41 = new b21.k(iIntValue3, qVar, aVar37, pVar3, 1);
                        mVar17.K(objQ41);
                    } else {
                        aVar.getClass();
                        if (objQ41 == p3.m.a.f135155b) {
                            objQ41 = new b21.k(iIntValue3, qVar, aVar37, pVar3, 1);
                            mVar17.K(objQ41);
                        }
                    }
                    e23.a aVar38 = (e23.a) objQ41;
                    boolean zB17 = mVar17.B(lVar26) | mVar17.B(aVar37);
                    Object objQ42 = mVar17.q();
                    if (zB17) {
                        obj24 = objQ42;
                        c2 c2Var = new c2(17, lVar26, aVar37);
                        mVar17.K(c2Var);
                        obj24 = c2Var;
                    } else {
                        aVar.getClass();
                        if (objQ42 == p3.m.a.f135155b) {
                            obj24 = objQ42;
                            c2 c2Var2 = new c2(17, lVar26, aVar37);
                            mVar17.K(c2Var2);
                            obj24 = c2Var2;
                        }
                    }
                    obj24 = objQ42;
                    fo.w.a(aVar37, z16, aVar38, (e23.a) obj24, rVarF, mVar17, 24576);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 18:
                return b(obj, obj2, obj3, obj4);
            case 19:
                return c(obj, obj2, obj3, obj4);
            case 20:
                return d(obj, obj2, obj3, obj4);
            case 21:
                return e(obj, obj2, obj3, obj4);
            case 22:
                return f(obj, obj2, obj3, obj4);
            case 23:
                return g(obj, obj2, obj3, obj4);
            case 24:
                return h(obj, obj2, obj3, obj4);
            case 25:
                return i(obj, obj2, obj3, obj4);
            case 26:
                return j(obj, obj2, obj3, obj4);
            case 27:
                return k(obj, obj2, obj3, obj4);
            case 28:
                return l(obj, obj2, obj3, obj4);
            default:
                m0 m0Var11 = (m0) obj26;
                WeightReportsActivity weightReportsActivity = (WeightReportsActivity) obj25;
                p3.m mVar18 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                int i39 = WeightReportsActivity.f47991a;
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                x1 x1Var19 = p3.n.f135158a;
                q42.y yVar3 = (q42.y) r16.getValue();
                q42.d0 d0Var = (q42.d0) r15.getValue();
                boolean zR22 = mVar18.r(m0Var11);
                Object objQ43 = mVar18.q();
                if (zR22) {
                    objQ43 = new nk0.l(m0Var11, 7);
                    mVar18.K(objQ43);
                } else {
                    aVar.getClass();
                    if (objQ43 == p3.m.a.f135155b) {
                        objQ43 = new nk0.l(m0Var11, 7);
                        mVar18.K(objQ43);
                    }
                }
                e23.a aVar39 = (e23.a) objQ43;
                boolean zR23 = mVar18.r(weightReportsActivity);
                Object objQ44 = mVar18.q();
                if (zR23) {
                    objQ44 = new q42.q(weightReportsActivity, 1);
                    mVar18.K(objQ44);
                } else {
                    aVar.getClass();
                    if (objQ44 == p3.m.a.f135155b) {
                        objQ44 = new q42.q(weightReportsActivity, 1);
                        mVar18.K(objQ44);
                    }
                }
                q42.x.a(yVar3, d0Var, aVar39, (e23.a) objQ44, mVar18, 0);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d0(e23.a aVar, Object obj, Object obj2, e23.a aVar2, int i14) {
        this.f993a = i14;
        this.f995c = aVar;
        this.f994b = obj;
        this.f996d = obj2;
        this.f997e = aVar2;
    }

    public /* synthetic */ d0(e23.l lVar, e23.a aVar, m0 m0Var, e23.p pVar) {
        this.f993a = 9;
        this.f996d = lVar;
        this.f995c = aVar;
        this.f994b = m0Var;
        this.f997e = pVar;
    }

    public /* synthetic */ d0(i53.c cVar, Context context, e23.l lVar, e23.a aVar) {
        this.f993a = 24;
        this.f994b = cVar;
        this.f997e = context;
        this.f996d = lVar;
        this.f995c = aVar;
    }

    public /* synthetic */ d0(Object obj, Object obj2, e23.a aVar, Object obj3, int i14) {
        this.f993a = i14;
        this.f994b = obj;
        this.f996d = obj2;
        this.f995c = aVar;
        this.f997e = obj3;
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, e23.a aVar, int i14) {
        this.f993a = i14;
        this.f994b = obj;
        this.f996d = obj2;
        this.f997e = obj3;
        this.f995c = aVar;
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f993a = i14;
        this.f994b = obj;
        this.f995c = obj2;
        this.f996d = obj3;
        this.f997e = obj4;
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, boolean z14, Object obj4, int i14) {
        this.f993a = i14;
        this.f994b = obj;
        this.f995c = obj2;
        this.f997e = obj3;
        this.f996d = obj4;
    }
}
