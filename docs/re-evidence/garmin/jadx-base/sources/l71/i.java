package l71;

import android.content.Context;
import android.content.DialogInterface;
import c2.m0;
import c2.n3;
import c2.q;
import c2.x2;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity;
import e23.p;
import gl1.y;
import h4.r;
import i3.e5;
import i3.f0;
import i3.i7;
import i3.mh;
import j53.l;
import java.util.List;
import l72.b1;
import l72.d3;
import l72.o2;
import l72.p0;
import l72.r0;
import l72.s0;
import l72.t0;
import l72.w;
import lg2.u;
import li0.k0;
import li0.z;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import yg2.i0;
import yg2.j0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110863a;

    public /* synthetic */ i(int i14) {
        this.f110863a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws DefinitionParameterException {
        int i14 = this.f110863a;
        int i15 = 16;
        m.a aVar = m.f135153a;
        switch (i14) {
            case 0:
                Context context = (Context) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                context.getClass();
                TrainingStatusSummaryActivity.f40068w.getClass();
                TrainingStatusSummaryActivity.a.b(context, zBooleanValue);
                return Unit.INSTANCE;
            case 1:
                m mVar = (m) obj;
                ((Integer) obj2).getClass();
                w wVar = w.f111301a;
                mVar.C(-867502748);
                x1 x1Var = n.f135158a;
                f0.f88041a.getClass();
                c2.x1 x1VarB = f0.b(mVar);
                mVar.f();
                return x1VarB;
            case 2:
                m mVar2 = (m) obj;
                ((Integer) obj2).getClass();
                w wVar2 = w.f111301a;
                mVar2.C(703108046);
                x1 x1Var2 = n.f135158a;
                f0.f88041a.getClass();
                c2.x1 x1VarB2 = f0.b(mVar2);
                mVar2.f();
                return x1VarB2;
            case 3:
                m mVar3 = (m) obj;
                ((Integer) obj2).getClass();
                w wVar3 = w.f111301a;
                mVar3.C(-680566715);
                x1 x1Var3 = n.f135158a;
                f0.f88041a.getClass();
                c2.x1 x1VarB3 = f0.b(mVar3);
                mVar3.f();
                return x1VarB3;
            case 4:
                m mVar4 = (m) obj;
                ((Integer) obj2).getClass();
                w wVar4 = w.f111301a;
                mVar4.C(-1898216347);
                x1 x1Var4 = n.f135158a;
                f0.f88041a.getClass();
                c2.x1 x1VarB4 = f0.b(mVar4);
                mVar4.f();
                return x1VarB4;
            case 5:
                m mVar5 = (m) obj;
                ((Integer) obj2).getClass();
                w wVar5 = w.f111301a;
                mVar5.C(-455564063);
                x1 x1Var5 = n.f135158a;
                f0.f88041a.getClass();
                c2.x1 x1VarB5 = f0.b(mVar5);
                mVar5.f();
                return x1VarB5;
            case 6:
                m mVar6 = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                p0 p0Var = p0.f111203a;
                if (mVar6.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    g6.f.a aVar2 = g6.f.f75994b;
                    q.a(x2.r(r.S, (float) 32.0d, 4), mVar6, 6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                m mVar7 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                r0 r0Var = r0.f111217a;
                if (mVar7.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    i7.a(n5.c.a(R.drawable.chevron_down, mVar7, 0), null, null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar7), mVar7, 48, 4);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 8:
                m mVar8 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s0 s0Var = s0.f111243a;
                if (mVar8.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 9:
                m mVar9 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s0 s0Var2 = s0.f111243a;
                if (mVar9.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    b3.b.f15502a.getClass();
                    u4.d dVarA = d3.h.a();
                    String strQ = y.Q(mVar9, R.string.gak_lbl_close);
                    g6.f.a aVar3 = g6.f.f75994b;
                    i7.b(dVarA, strQ, x2.q(r.S, 16), 0L, mVar9, 384, 8);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 10:
                m mVar10 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                t0 t0Var = t0.f111258a;
                if (mVar10.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    d3.a(new t0.b(), null, mVar10, 0, 2);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 11:
                m mVar11 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                t0 t0Var2 = t0.f111258a;
                if (mVar11.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    d3.a(new t0.a(), null, mVar11, 0, 2);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 12:
                m mVar12 = (m) obj;
                ((Integer) obj2).getClass();
                mVar12.C(1537719583);
                x1 x1Var12 = n.f135158a;
                g6.f.a aVar4 = g6.f.f75994b;
                m0 m0VarB = n3.b(0.0f, 16, 0.0f, 0.0f, 13);
                mVar12.f();
                return m0VarB;
            case 13:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.a.C0772a c0772a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.a.f40930t;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 14:
                ((Float) obj).floatValue();
                ((com.garmin.android.library.mapsdkadapter.i.d) obj2).getClass();
                return Boolean.FALSE;
            case 15:
                ((Float) obj).floatValue();
                ((com.garmin.android.library.mapsdkadapter.i.d) obj2).getClass();
                return Float.valueOf(0.0f);
            case 16:
                ((Float) obj).floatValue();
                ((com.garmin.android.library.mapsdkadapter.i.d) obj2).getClass();
                return Float.valueOf(0.0f);
            case 17:
                m mVar13 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                lg2.i iVar = lg2.i.f112327a;
                if (mVar13.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    ag2.e eVar = ag2.e.LAP;
                    j0.b bVar = new j0.b(new i0(null, new nt2.e("Run", "Run"), l.b(), l.b(), null), -1);
                    lg2.r rVar = new lg2.r(false, false, 3, null);
                    Object objQ = mVar13.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    int i16 = 14;
                    if (objQ == c2565a) {
                        objQ = new o2(i16);
                        mVar13.K(objQ);
                    }
                    e23.a aVar5 = (e23.a) objQ;
                    Object objQ2 = mVar13.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new b1(21);
                        mVar13.K(objQ2);
                    }
                    lg2.q.a(null, eVar, bVar, aVar5, (e23.l) objQ2, rVar, new l72.q(i16), true, false, false, null, mVar13, 113273904, 0, 1537);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 18:
                m mVar14 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                lg2.i iVar2 = lg2.i.f112327a;
                if (mVar14.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    ag2.e eVar2 = ag2.e.START_RECORDING;
                    lg2.r rVar2 = new lg2.r(false, false, 3, null);
                    Object objQ3 = mVar14.q();
                    aVar.getClass();
                    m.a.C2565a c2565a2 = m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new b1(22);
                        mVar14.K(objQ3);
                    }
                    e23.l lVar = (e23.l) objQ3;
                    int i17 = 15;
                    l72.q qVar = new l72.q(i17);
                    Object objQ4 = mVar14.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new o2(i17);
                        mVar14.K(objQ4);
                    }
                    lg2.q.a(null, eVar2, null, null, lVar, rVar2, qVar, true, false, true, (e23.a) objQ4, mVar14, 918580656, 6, 1);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 19:
                m mVar15 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                lg2.j jVar = lg2.j.f112330a;
                if (mVar15.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 20:
                m mVar16 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                lg2.j jVar2 = lg2.j.f112330a;
                if (mVar16.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    r.a aVar6 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    r rVarC = c2.l.C(c2.l.A(aVar6, eVar3.f97920e, 0.0f, 2), 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                    Object objQ5 = mVar16.q();
                    aVar.getClass();
                    m.a.C2565a c2565a3 = m.a.f135155b;
                    if (objQ5 == c2565a3) {
                        objQ5 = new o2(i15);
                        mVar16.K(objQ5);
                    }
                    e23.a aVar7 = (e23.a) objQ5;
                    ag2.e eVar4 = ag2.e.LAP;
                    l72.q qVar2 = new l72.q(20);
                    lg2.r rVar3 = new lg2.r(false, false, 3, null);
                    Object objQ6 = mVar16.q();
                    if (objQ6 == c2565a3) {
                        objQ6 = new b1(24);
                        mVar16.K(objQ6);
                    }
                    u.a(rVarC, aVar7, eVar4, qVar2, rVar3, (e23.l) objQ6, new j0.b(new i0(null, new nt2.e("Run", "Run"), l.b(), i53.a.a(new nt2.e("5 min", "5 minutes")), null), -1), false, true, false, null, mVar16, 100860336, 1664);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 21:
                m mVar17 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                lg2.j jVar3 = lg2.j.f112330a;
                if (mVar17.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    r.a aVar8 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar5 = j92.b.f97899b;
                    r rVarC2 = c2.l.C(c2.l.A(aVar8, eVar5.f97920e, 0.0f, 2), 0.0f, eVar5.f97920e, 0.0f, 0.0f, 13);
                    Object objQ7 = mVar17.q();
                    aVar.getClass();
                    m.a.C2565a c2565a4 = m.a.f135155b;
                    int i18 = 17;
                    if (objQ7 == c2565a4) {
                        objQ7 = new o2(i18);
                        mVar17.K(objQ7);
                    }
                    e23.a aVar9 = (e23.a) objQ7;
                    ag2.e eVar6 = ag2.e.LAP;
                    l72.q qVar3 = new l72.q(i18);
                    lg2.r rVar4 = new lg2.r(false, false, 3, null);
                    Object objQ8 = mVar17.q();
                    if (objQ8 == c2565a4) {
                        objQ8 = new b1(23);
                        mVar17.K(objQ8);
                    }
                    u.a(rVarC2, aVar9, eVar6, qVar3, rVar4, (e23.l) objQ8, null, true, true, false, null, mVar17, 115016112, 1536);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                z.j((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                k0.d((m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 24:
                m mVar18 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                lj2.j jVar4 = lj2.j.f113128a;
                if (mVar18.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    String strQ2 = y.Q(mVar18, R.string.cm_please_correct_highlighted_fields);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97936m, mVar18), mVar18, 0, 0, 131070);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 25:
                m mVar19 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                lj2.j jVar5 = lj2.j.f113128a;
                if (mVar19.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var19 = n.f135158a;
                    String strQ3 = y.Q(mVar19, R.string.dialog_error_title);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97936m, mVar19), mVar19, 0, 0, 131070);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 26:
                m mVar20 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                lj2.j jVar6 = lj2.j.f113128a;
                if (mVar20.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var20 = n.f135158a;
                    String strQ4 = y.Q(mVar20, R.string.cm_something_went_wrong);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97936m, mVar20), mVar20, 0, 0, 131070);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 27:
                m mVar21 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                lj2.j jVar7 = lj2.j.f113128a;
                if (mVar21.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var21 = n.f135158a;
                    String strQ5 = y.Q(mVar21, R.string.cm_remove_address);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97936m, mVar21), mVar21, 0, 0, 131070);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 28:
                m mVar22 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                lj2.j jVar8 = lj2.j.f113128a;
                if (mVar22.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var22 = n.f135158a;
                    String strQ6 = y.Q(mVar22, R.string.cm_remove_address_message);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97936m, mVar22), mVar22, 0, 0, 131070);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            default:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                lk0.b bVar2 = lk0.b.f113140a;
                scope.getClass();
                parametersHolder.getClass();
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                kk0.b bVar3 = (kk0.b) scope.get((k23.d<?>) t0Var3.b(kk0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                Object orNull = parametersHolder.getOrNull(t0Var3.b(String.class));
                if (orNull == null) {
                    throw new DefinitionParameterException(e5.i(t0Var3, String.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
                }
                String str = (String) orNull;
                Object orNull2 = parametersHolder.getOrNull(t0Var3.b(List.class));
                if (orNull2 != null) {
                    return new rk0.s0(bVar3, str, (List) orNull2);
                }
                throw new DefinitionParameterException(e5.i(t0Var3, List.class, new StringBuilder("No value found for type '"), CoreConstants.SINGLE_QUOTE_CHAR));
        }
    }
}
