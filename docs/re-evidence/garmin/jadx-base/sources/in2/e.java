package in2;

import android.content.DialogInterface;
import androidx.room.a0;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactSendRequestActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.ManageTripsActivity;
import com.garmin.feature.garminpay.devicedrivensocket.NativeDeviceDrivenSocketApi;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import e23.p;
import f72.a3;
import f72.s9;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import i3.ve;
import iv0.g;
import j02.s;
import j23.q;
import j53.l;
import l4.k;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import us1.i;
import v.h;
import v62.k7;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94575a;

    public /* synthetic */ e(int i14) {
        this.f94575a = 1;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f94575a;
        int i15 = 24;
        int i16 = 27;
        m.a aVar = m.f135153a;
        boolean z14 = false;
        switch (i14) {
            case 0:
                return NativeDeviceDrivenSocketApi.a((Scope) obj, (ParametersHolder) obj2);
            case 1:
                ((Integer) obj2).getClass();
                io1.e.b((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).intValue();
                ManageTripsActivity.a aVar2 = ManageTripsActivity.f36985h;
                ((DialogInterface) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                boolean z15 = false;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                iv0.f fVar = iv0.f.f95096a;
                if ((iIntValue & 3) != 2) {
                    z15 = true;
                }
                if (mVar.n(1 & iIntValue, z15)) {
                    x1 x1Var = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = s9.a(t62.c.f162799a);
                    gl.c.f77766a.getClass();
                    long j8 = gl.c.f77767b.P;
                    r.a aVar3 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, null, k.a(x2.q(aVar3, j92.b.f97901d.f97905d), 0.5f), j8, mVar, 48, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 4:
                boolean z16 = false;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                iv0.f fVar2 = iv0.f.f95096a;
                if ((iIntValue2 & 3) != 2) {
                    z16 = true;
                }
                if (mVar2.n(1 & iIntValue2, z16)) {
                    x1 x1Var2 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = s9.a(t62.c.f162799a);
                    gl.c.f77766a.getClass();
                    long j14 = gl.c.f77767b.P;
                    r.a aVar4 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(dVarA2, null, x2.q(aVar4, j92.b.f97901d.f97905d), j14, mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 5:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g gVar = g.f95099a;
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    t4.d dVarA3 = n5.c.a(R.drawable.plus, mVar3, 0);
                    r.a aVar5 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.a(dVarA3, null, x2.q(aVar5, j92.b.f97899b.f97920e), a0.c(mVar3), mVar3, 48, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 6:
                n4.d dVar = (n4.d) obj;
                n4.d dVar2 = (n4.d) obj2;
                int i17 = s.f96125v;
                dVar.getClass();
                dVar2.getClass();
                return Boolean.valueOf(dVar.a(dVar2.f()));
            case 7:
                n4.d dVar3 = (n4.d) obj;
                n4.d dVar4 = (n4.d) obj2;
                dVar3.getClass();
                dVar4.getClass();
                return Boolean.valueOf(new q(dVar3.f123548b, dVar3.f123550d).contains(Float.valueOf(Float.intBitsToFloat((int) (dVar4.f() & 4294967295L)))));
            case 8:
                n4.d dVar5 = (n4.d) obj;
                n4.d dVar6 = (n4.d) obj2;
                dVar5.getClass();
                dVar6.getClass();
                return Boolean.valueOf(new q(dVar5.f123547a, dVar5.f123549c).contains(Float.valueOf(Float.intBitsToFloat((int) (dVar6.f() >> 32)))));
            case 9:
                boolean z17 = false;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                j20.a aVar6 = j20.a.f96546a;
                if ((iIntValue4 & 3) != 2) {
                    z17 = true;
                }
                if (mVar4.n(1 & iIntValue4, z17)) {
                    x1 x1Var4 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA4 = k7.a(t62.b.f162798a);
                    r.a aVar7 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar = j92.b.f97901d;
                    i7.b(dVarA4, null, x2.u(x2.h(aVar7, cVar.f97905d), cVar.f97905d), 0L, mVar4, 48, 8);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 10:
                boolean z18 = false;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                j20.a aVar8 = j20.a.f96546a;
                if ((iIntValue5 & 3) != 2) {
                    z18 = true;
                }
                if (mVar5.n(1 & iIntValue5, z18)) {
                    x1 x1Var5 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA5 = a3.a(t62.c.f162799a);
                    r.a aVar9 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar2 = j92.b.f97901d;
                    i7.b(dVarA5, null, x2.u(x2.h(aVar9, cVar2.f97905d), cVar2.f97905d), 0L, mVar5, 48, 8);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 11:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                EmergencyContactSendRequestActivity.a aVar10 = EmergencyContactSendRequestActivity.f32570v;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 12:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                j21.a aVar11 = j21.a.f96635a;
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    j21.k.b(x.k("Chicken", "Beef", "Pork", "Salad", "Rice", "Fish", "Eggs"), null, false, null, mVar6, 6, 14);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 13:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                j21.c cVar3 = j21.c.f96639a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    Object objQ = mVar7.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new ik2.b(26);
                        mVar7.K(objQ);
                    }
                    e23.a aVar12 = (e23.a) objQ;
                    Object objQ2 = mVar7.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new ik2.b(i16);
                        mVar7.K(objQ2);
                    }
                    j21.q.a("{Food Name} - {Brand}", "# {unit} • ### Cal • # P • # F • # C", null, null, true, true, aVar12, (e23.a) objQ2, 0.0f, mVar7, 14380086, 260);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 14:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                j62.a aVar13 = j62.a.f97397a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    r rVarD = x2.d(r.S, 1.0f);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode = Long.hashCode(mVar8.getU());
                    i2 i2VarX = mVar8.x();
                    r rVarC = h4.k.c(rVarD, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar14);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar8);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar8, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar8);
                    b0 b0Var = b0.f22601a;
                    u4.d.b bVar2 = u4.d.f168373k;
                    b82.n.c(n5.e.b(R.drawable.strength, mVar8, 6), null, gl1.y.Q(mVar8, R.string.msg_strength_workouts_no_filter_options), null, null, mVar8, 0, 26);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 15:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                j62.a aVar15 = j62.a.f97397a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    z02.b.a(false, null, null, null, false, j62.a.f97398b, mVar9, 196608, 31);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 16:
                jd0.q qVar = jd0.q.f98359a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new jd0.p();
            case 17:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                jg1.a aVar16 = jg1.a.f98724a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj).getClass();
                zf2.d dVar7 = (zf2.d) obj2;
                dVar7.getClass();
                cl1.b.a aVar17 = cl1.b.f27937b;
                int i18 = dVar7.f204633e;
                int i19 = dVar7.f204634f;
                aVar17.getClass();
                return cl1.b.a.a(i18, i19);
            case 19:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                FitPayCardVerificationActivity.b bVar3 = FitPayCardVerificationActivity.f51449m;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 20:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                jt1.a aVar18 = jt1.a.f100804a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    i7.a(n5.c.a(R.drawable.help, mVar11, 0), gl1.y.Q(mVar11, R.string.lbl_help), null, ds.e0.b(d92.b.f58623a, mVar11), mVar11, 0, 4);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 21:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                jt1.c cVar4 = jt1.c.f100809a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    i7.a(n5.c.a(R.drawable.overflow, mVar12, 0), gl1.y.Q(mVar12, R.string.lbl_menu), null, fb1.c.g(d92.b.f58623a, mVar12), mVar12, 0, 4);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 22:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                jt1.c cVar5 = jt1.c.f100809a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    pt1.x xVar = new pt1.x(-1L, -1L, "Anonymous Hiker", null, "Oct 03 2023 • Difficulty: Hard", 4, "Short description. This description is meant to be a longer one so we can test out the expandability of the text, but I'm lazy enough to only type out exactly 3 lines of text so Show More shows up.Testing further.", i53.a.a(i.DOG_FRIENDLY, i.MOUNTAINEERING, i.OCEANS), l.b(), i53.a.a(us1.g.BUGS, us1.g.MUDDY, us1.g.ICE_AND_SNOW), 45, false, null, null, "Course", false, false, 0L, "", true, false, false, 3389440, null);
                    Object objQ3 = mVar13.q();
                    aVar.getClass();
                    m.a.C2565a c2565a2 = m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new jl1.a(3);
                        mVar13.K(objQ3);
                    }
                    e23.q qVar2 = (e23.q) objQ3;
                    Object objQ4 = mVar13.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new e(z14 ? (byte) 1 : (byte) 0, i15);
                        mVar13.K(objQ4);
                    }
                    p pVar = (p) objQ4;
                    Object objQ5 = mVar13.q();
                    if (objQ5 == c2565a2) {
                        objQ5 = new jn2.b(7);
                        mVar13.K(objQ5);
                    }
                    e23.l lVar = (e23.l) objQ5;
                    Object objQ6 = mVar13.q();
                    if (objQ6 == c2565a2) {
                        objQ6 = new jn2.b(8);
                        mVar13.K(objQ6);
                    }
                    e23.l lVar2 = (e23.l) objQ6;
                    Object objQ7 = mVar13.q();
                    if (objQ7 == c2565a2) {
                        objQ7 = new jn2.b(9);
                        mVar13.K(objQ7);
                    }
                    e23.l lVar3 = (e23.l) objQ7;
                    Object objQ8 = mVar13.q();
                    if (objQ8 == c2565a2) {
                        objQ8 = new jn2.b(10);
                        mVar13.K(objQ8);
                    }
                    e23.l lVar4 = (e23.l) objQ8;
                    Object objQ9 = mVar13.q();
                    if (objQ9 == c2565a2) {
                        objQ9 = new jn2.b(11);
                        mVar13.K(objQ9);
                    }
                    e23.l lVar5 = (e23.l) objQ9;
                    Object objQ10 = mVar13.q();
                    if (objQ10 == c2565a2) {
                        objQ10 = new jn2.b(12);
                        mVar13.K(objQ10);
                    }
                    jt1.k.e(xVar, "Course", false, qVar2, pVar, lVar, lVar2, lVar3, lVar4, null, lVar5, (e23.l) objQ10, mVar13, 115043376, 54, 516);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 23:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                jt1.c cVar6 = jt1.c.f100809a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    ve.a(null, null, vb.h.e(d92.b.f58623a, mVar14), 0L, 0.0f, 0.0f, null, jt1.c.f100817i, mVar14, 12582912, 123);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 24:
                ((Long) obj).longValue();
                ((Boolean) obj2).booleanValue();
                jt1.c cVar7 = jt1.c.f100809a;
                return Unit.INSTANCE;
            case 25:
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                jt1.c cVar8 = jt1.c.f100809a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    pt1.x xVar2 = new pt1.x(-1L, -1L, "Anonymous Hiker", null, "Oct 03 2023 • Difficulty: Hard", 4, "Short description. This description is meant to be a longer one so we can test out the expandability of the text, but I'm lazy enough to only type out exactly 3 lines of text so Show More shows up.Testing further.", i53.a.a(i.DOG_FRIENDLY, i.MOUNTAINEERING, i.OCEANS), i53.a.a(new kt1.b(5L, "https://offloadmedia.feverup.com/secretseattle.co/wp-content/uploads/2021/04/29054810/cougar-mountain-seattle-hike-trail-1024x683.png", "https://offloadmedia.feverup.com/secretseattle.co/wp-content/uploads/2021/04/29054810/cougar-mountain-seattle-hike-trail-1024x683.png", 45L, "21 Jan 2023", 3, 1, true, false, 256, null)), i53.a.a(us1.g.BUGS, us1.g.MUDDY, us1.g.ICE_AND_SNOW), 45, false, null, null, "Course", false, false, 0L, "", false, true, false, 2340864, null);
                    Object objQ11 = mVar15.q();
                    aVar.getClass();
                    m.a.C2565a c2565a3 = m.a.f135155b;
                    if (objQ11 == c2565a3) {
                        objQ11 = new jl1.a(5);
                        mVar15.K(objQ11);
                    }
                    e23.q qVar3 = (e23.q) objQ11;
                    Object objQ12 = mVar15.q();
                    if (objQ12 == c2565a3) {
                        objQ12 = new e(z14 ? (byte) 1 : (byte) 0, i16);
                        mVar15.K(objQ12);
                    }
                    p pVar2 = (p) objQ12;
                    Object objQ13 = mVar15.q();
                    if (objQ13 == c2565a3) {
                        objQ13 = new jn2.b(19);
                        mVar15.K(objQ13);
                    }
                    e23.l lVar6 = (e23.l) objQ13;
                    Object objQ14 = mVar15.q();
                    if (objQ14 == c2565a3) {
                        objQ14 = new jn2.b(20);
                        mVar15.K(objQ14);
                    }
                    e23.l lVar7 = (e23.l) objQ14;
                    Object objQ15 = mVar15.q();
                    if (objQ15 == c2565a3) {
                        objQ15 = new jn2.b(21);
                        mVar15.K(objQ15);
                    }
                    e23.l lVar8 = (e23.l) objQ15;
                    Object objQ16 = mVar15.q();
                    if (objQ16 == c2565a3) {
                        objQ16 = new jn2.b(22);
                        mVar15.K(objQ16);
                    }
                    e23.l lVar9 = (e23.l) objQ16;
                    Object objQ17 = mVar15.q();
                    if (objQ17 == c2565a3) {
                        objQ17 = new jn2.b(23);
                        mVar15.K(objQ17);
                    }
                    e23.l lVar10 = (e23.l) objQ17;
                    Object objQ18 = mVar15.q();
                    if (objQ18 == c2565a3) {
                        objQ18 = new jn2.b(i15);
                        mVar15.K(objQ18);
                    }
                    jt1.k.e(xVar2, "Course", false, qVar3, pVar2, lVar6, lVar7, lVar8, lVar9, null, lVar10, (e23.l) objQ18, mVar15, 115043376, 54, 516);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Long) obj).longValue();
                ((Boolean) obj2).booleanValue();
                jt1.c cVar9 = jt1.c.f100809a;
                return Unit.INSTANCE;
            case 27:
                ((Long) obj).longValue();
                ((Boolean) obj2).booleanValue();
                jt1.c cVar10 = jt1.c.f100809a;
                return Unit.INSTANCE;
            case 28:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                jt1.c cVar11 = jt1.c.f100809a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    ve.a(null, null, vb.h.e(d92.b.f58623a, mVar16), 0L, 0.0f, 0.0f, null, jt1.c.f100818j, mVar16, 12582912, 123);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar17 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                jt1.c cVar12 = jt1.c.f100809a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    String strQ = gl1.y.Q(mVar17, R.string.lbl_share);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar17), mVar17, 0, 0, 131070);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(byte b14, int i14) {
        this.f94575a = i14;
    }
}
