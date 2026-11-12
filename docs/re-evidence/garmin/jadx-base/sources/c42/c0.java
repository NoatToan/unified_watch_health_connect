package c42;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import b21.d7;
import c2.s0;
import c2.x2;
import c62.f1;
import c62.w0;
import ca0.b1;
import ca0.j1;
import ca0.n1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.ui.ElectronicShiftingDataActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.ComplexEditText;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.PinConfig;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerNode;
import cw1.v1;
import ew1.w2;
import gg1.o0;
import i3.h1;
import i3.m4;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.u0;
import lc.m0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24363c;

    public /* synthetic */ c0(int i14, Object obj, Object obj2) {
        this.f24361a = i14;
        this.f24362b = obj;
        this.f24363c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:235:0x0784  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x0237  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f24361a;
        Long l14 = null;
        Object[] objArr = 0;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 2;
        Object obj3 = this.f24363c;
        Object obj4 = this.f24362b;
        switch (i14) {
            case 0:
                p pVar = (p) obj4;
                x3 x3Var = (x3) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarE, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    List list = (List) x3Var.getF182175a();
                    boolean zB = mVar.B(pVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new b41.a(pVar, 14);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b41.a(pVar, 14);
                            mVar.K(objQ);
                        }
                    }
                    h0.b(list, (e23.l) objQ, mVar, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                c50.e.a((e50.e) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                c50.h.a((e50.h) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                List list2 = (List) obj4;
                w0 w0Var = (w0) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarY, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    mVar2.C(-575205661);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        w0Var.d((c62.a) it.next(), mVar2, 0);
                    }
                    mVar2.f();
                    mVar2.y();
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ((w0) obj4).d((c62.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                f1 f1Var = (f1) obj4;
                j0 j0Var = (j0) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    l52.i.a<j0> aVar4 = f1Var.f24736a;
                    r0 r0Var = new r0();
                    l52.o.f(aVar4, new s0(r0Var, 7));
                    w52.t.b(f1Var, j0Var, (m52.d) r0Var.f105810a, mVar3, j0.R0 << 3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 6:
                na0.r rVar = (na0.r) obj4;
                m0 m0Var = (m0) obj3;
                int iIntValue4 = ((Integer) obj).intValue();
                List list3 = (List) obj2;
                list3.getClass();
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2.DEVICE_SETUP, "BikeWheelViewModel", "Refreshing circumference with new value: " + iIntValue4 + "mm and digits: " + list3);
                rVar.f125176a.a(o0.METRIC, iIntValue4);
                p2 p2Var = rVar.f125178c;
                while (true) {
                    Object value = p2Var.getValue();
                    List list4 = list3;
                    int i16 = iIntValue4;
                    if (p2Var.b(value, na0.q.a((na0.q) value, false, null, list3, iIntValue4, o0.METRIC, 7))) {
                        m0Var.n();
                        return Unit.INSTANCE;
                    }
                    iIntValue4 = i16;
                    list3 = list4;
                }
                break;
            case 7:
                e23.p pVar2 = (e23.p) obj4;
                m0 m0Var2 = (m0) obj3;
                Context context = (Context) obj;
                l90.b bVar3 = (l90.b) obj2;
                context.getClass();
                bVar3.getClass();
                l90.i iVar = bVar3.f111529n;
                if (iVar != null) {
                    pVar2.invoke(iVar, bVar3);
                } else if (bVar3.f111517b) {
                    String string = context.getString(R.string.pairing_generic_instructions_1);
                    string.getClass();
                    lc.y.l(m0Var2, new b1.k(bVar3, new d90.b(string, context.getString(R.string.pairing_generic_instructions_2_a), context.getString(R.string.device_pin_input_msg, context.getString(R.string.lbl_start)), d90.c.d.INSTANCE)));
                } else {
                    d90.a aVar5 = bVar3.f111531p.f58437c;
                    d90.b bVar4 = aVar5.f58417f;
                    if (bVar4 != null) {
                        lc.y.l(m0Var2, new b1.k(bVar3, bVar4));
                    } else if (aVar5.f58414c) {
                        lc.y.l(m0Var2, new b1.d(bVar3));
                    } else {
                        lc.y.l(m0Var2, new b1.l(bVar3, l14, i15, (p005kotlin.jvm.internal.j) (objArr == true ? 1 : 0)));
                    }
                }
                return Unit.INSTANCE;
            case 8:
                d7 d7Var = (d7) obj4;
                m0 m0Var3 = (m0) obj3;
                q90.c cVar = (q90.c) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                cVar.getClass();
                if (zBooleanValue) {
                    d7Var.invoke(cVar.f143495c);
                } else {
                    m0Var3.h(new ca0.k(22), new n1.j(cVar));
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                cb0.b.b((b63.o) obj4, (e23.a) obj3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                dh.b.j((List) obj4, (o82.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ck0.k.e((ck0.w) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ck0.v vVar = (ck0.v) obj4;
                String str = (String) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    String str2 = ((ck0.v.d) vVar).f27897a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar4);
                    h4.r.a aVar6 = h4.r.S;
                    boolean zB2 = mVar4.B(str);
                    Object objQ2 = mVar4.q();
                    if (zB2) {
                        objQ2 = new c82.b(str, 24);
                        mVar4.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new c82.b(str, 24);
                            mVar4.K(objQ2);
                        }
                    }
                    mh.c(str2, p5.v.c((e23.l) objQ2, aVar6, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar4, 0, 0, 131068);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ck0.k.a((ck0.v) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                xy2.b.d((e23.a) obj4, (com.garmin.android.apps.connectmobile.live.activity.h) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                return MarkerKt.AdvancedMarkerImpl_YTa4A8k$lambda$120$lambda$117((View) obj4, (PinConfig) obj3, (MarkerNode) obj, (PinConfig) obj2);
            case 16:
                ((Integer) obj2).getClass();
                cp1.e.a((cp1.j) obj4, (h4.r) obj3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 17:
                r0 r0Var2 = (r0) obj3;
                DialogInterface dialogInterface = (DialogInterface) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                cp2.f.a aVar7 = cp2.f.f54931p;
                dialogInterface.getClass();
                ComplexEditText complexEditText = ((cp2.f) obj4).f54946j;
                if (complexEditText == null) {
                    p005kotlin.jvm.internal.s.m("expirationYearLayout");
                    throw null;
                }
                complexEditText.getEditText().setText((CharSequence) ((List) r0Var2.f105810a).get(iIntValue6), TextView.BufferType.EDITABLE);
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 18:
                ArrayList arrayList = (ArrayList) obj3;
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                cp2.f.a aVar8 = cp2.f.f54931p;
                dialogInterface2.getClass();
                ComplexEditText complexEditText2 = ((cp2.f) obj4).f54945i;
                if (complexEditText2 == null) {
                    p005kotlin.jvm.internal.s.m("expirationMonthLayout");
                    throw null;
                }
                complexEditText2.getEditText().setText(d53.w.i0((String) arrayList.get(iIntValue7)).toString(), TextView.BufferType.EDITABLE);
                cp2.f.f54936w = iIntValue7 + 1 < cp2.f.f54934t ? cp2.f.f54935v : cp2.f.f54933r;
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 19:
                e23.l lVar = (e23.l) obj4;
                mc mcVar = (mc) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    g6.f.a aVar9 = g6.f.f75994b;
                    h4.r rVarY2 = c2.l.y(h4.r.S, 8);
                    boolean zB3 = mVar5.B(lVar) | mVar5.B(mcVar);
                    Object objQ3 = mVar5.q();
                    if (zB3) {
                        objQ3 = new cq.h(lVar, mcVar, 1);
                        mVar5.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new cq.h(lVar, mcVar, 1);
                            mVar5.K(objQ3);
                        }
                    }
                    u0.a(rVarY2, null, null, null, (e23.a) objQ3, mVar5, 6, 14);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 20:
                int iIntValue9 = ((Integer) obj).intValue();
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                ((p3.n1) obj4).t(iIntValue9);
                ((p1) obj3).setValue(bool);
                return Unit.INSTANCE;
            case 21:
                ElectronicShiftingDataActivity electronicShiftingDataActivity = (ElectronicShiftingDataActivity) obj4;
                List<to.l> list5 = (List) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ElectronicShiftingDataActivity.a aVar10 = ElectronicShiftingDataActivity.f29955b;
                if (mVar6.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    ArrayList arrayListL = androidx.core.view.j.l(list5);
                    Iterator it3 = list5.iterator();
                    double dC = 0.0d;
                    while (it3.hasNext()) {
                        dC += (double) ((to.l) it3.next()).getTimeInGearSeconds();
                    }
                    for (to.l lVar2 : list5) {
                        arrayListL.add(new to.m(lVar2.getFrontGearTeeth(), lVar2.getRearGearTeeth(), lVar2.getTimeInGearSeconds(), lVar2.getFrontGearTeeth() / lVar2.getRearGearTeeth(), (((double) lVar2.getTimeInGearSeconds()) * 100.0d) / dC));
                    }
                    boolean zR = mVar6.r(electronicShiftingDataActivity);
                    Object objQ4 = mVar6.q();
                    if (zR) {
                        objQ4 = new cq0.g(electronicShiftingDataActivity, i15);
                        mVar6.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new cq0.g(electronicShiftingDataActivity, i15);
                            mVar6.K(objQ4);
                        }
                    }
                    electronicShiftingDataActivity.da(arrayListL, (e23.a) objQ4, mVar6, 0);
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ElectronicShiftingDataActivity.a aVar11 = ElectronicShiftingDataActivity.f29955b;
                ((ElectronicShiftingDataActivity) obj4).ea((to.m) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                cv1.k.c((av1.g) obj4, (e23.p) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                e23.l lVar3 = (e23.l) obj4;
                m4 m4Var = (m4) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    boolean zB4 = mVar7.B(lVar3) | mVar7.B(m4Var);
                    Object objQ5 = mVar7.q();
                    if (zB4) {
                        objQ5 = new j1(13, lVar3, m4Var);
                        mVar7.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new j1(13, lVar3, m4Var);
                            mVar7.K(objQ5);
                        }
                    }
                    cw1.e.f56020a.getClass();
                    h1.c((e23.a) objQ5, null, false, null, null, null, null, null, cw1.e.f56021b, mVar7, C.ENCODING_PCM_32BIT, 510);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                v1.g((hv1.i) obj4, (w2) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                d21.i.a((e21.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                d50.h.a((e50.c) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 28:
                zd0.k.a aVar12 = (zd0.k.a) obj4;
                e23.l lVar4 = (e23.l) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    String strQ = gl1.y.Q(mVar8, R.string.common_confirm);
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    boolean z14 = aVar12 != null;
                    boolean zR2 = mVar8.r(aVar12) | mVar8.B(lVar4);
                    Object objQ6 = mVar8.q();
                    if (zR2) {
                        objQ6 = new f0(aVar12, lVar4);
                        mVar8.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new f0(aVar12, lVar4);
                            mVar8.K(objQ6);
                        }
                    }
                    f0Var.d(384, 1, (e23.a) objQ6, rVarF2, strQ, mVar8, null, z14);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            default:
                d62.j jVar = (d62.j) obj4;
                e23.a aVar13 = (e23.a) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    l72.f0.f110999a.d(384, 1, aVar13, x2.f(h4.r.S, 1.0f), gl1.y.Q(mVar9, R.string.lbl_next), mVar9, null, jVar != null);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c0(Object obj, Object obj2, int i14, int i15) {
        this.f24361a = i15;
        this.f24362b = obj;
        this.f24363c = obj2;
    }
}
