package o72;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.m;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailActivity;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupDetailMemberListFragment;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersActivity;
import com.garmin.android.apps.connectmobile.training.itp.ITPWorkoutScheduleActivity;
import com.garmin.android.gfdi.framework.FileManagerCompat;
import i3.e5;
import i3.i7;
import i3.l9;
import i3.mh;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import v62.e9;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f130312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f130313c;

    public /* synthetic */ b(Context context, o81.a aVar) {
        this.f130311a = 2;
        this.f130313c = context;
        this.f130312b = aVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        NumberFormat numberFormat = (NumberFormat) this.f130312b;
        p3.x3 x3Var = (p3.x3) this.f130313c;
        c2.t2 t2Var = (c2.t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.w wVar = l72.w.f111301a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            h4.r rVarA = t2Var.a(t2Var.c(aVar, h4.d.a.f81534l), 1.0f, false);
            String strQ = gl1.y.Q(mVar, R.string.filter_activities);
            String str = numberFormat.format(Integer.valueOf(((Number) x3Var.getF182175a()).intValue()));
            str.getClass();
            wVar.a(rVarA, strQ, gl1.y.P(R.string.lbl_filter_results, new Object[]{str}, mVar), null, mVar, 0, 8);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        tm1.b bVar;
        String str = (String) this.f130312b;
        mm1.c cVar = (mm1.c) this.f130313c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            mm1.c.a values = cVar.getValues();
            if (values == null) {
                bVar = new tm1.b(0, 0, 0, 0, 0, false, 63, null);
            } else {
                Integer totalSleepTimeInSeconds = values.getTotalSleepTimeInSeconds();
                int iIntValue2 = (totalSleepTimeInSeconds != null ? totalSleepTimeInSeconds.intValue() : 0) / 60;
                Integer deepTime = values.getDeepTime();
                int iIntValue3 = (deepTime != null ? deepTime.intValue() : 0) / 60;
                Integer lightTime = values.getLightTime();
                int iIntValue4 = (lightTime != null ? lightTime.intValue() : 0) / 60;
                Integer remTime = values.getRemTime();
                int iIntValue5 = (remTime != null ? remTime.intValue() : 0) / 60;
                Integer awakeTime = values.getAwakeTime();
                bVar = new tm1.b(iIntValue3, iIntValue4, iIntValue5, (awakeTime != null ? awakeTime.intValue() : 0) / 60, iIntValue2, false, 32, null);
            }
            an1.f.a(str, bVar, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        tm1.b bVar;
        String str = (String) this.f130312b;
        mm1.g gVar = (mm1.g) this.f130313c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            mm1.g.a values = gVar.getValues();
            if (values == null) {
                bVar = new tm1.b(0, 0, 0, 0, 0, false, 63, null);
            } else {
                Double averageSleepSeconds = values.getAverageSleepSeconds();
                int iDoubleValue = (averageSleepSeconds != null ? (int) averageSleepSeconds.doubleValue() : 0) / 60;
                Integer deepTime = values.getDeepTime();
                int iIntValue2 = (deepTime != null ? deepTime.intValue() : 0) / 60;
                Integer lightTime = values.getLightTime();
                int iIntValue3 = (lightTime != null ? lightTime.intValue() : 0) / 60;
                Integer remTime = values.getRemTime();
                int iIntValue4 = (remTime != null ? remTime.intValue() : 0) / 60;
                Integer awakeTime = values.getAwakeTime();
                bVar = new tm1.b(iIntValue2, iIntValue3, iIntValue4, (awakeTime != null ? awakeTime.intValue() : 0) / 60, iDoubleValue, false, 32, null);
            }
            an1.f.a(str, bVar, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        r02.m mVar = (r02.m) this.f130312b;
        o53.b0 b0Var = (o53.b0) this.f130313c;
        n4.c cVar = (n4.c) obj;
        n4.c cVar2 = (n4.c) obj2;
        float fFloatValue = ((Float) obj3).floatValue();
        if (mVar.f148902j.getFloatValue() == 0.0f) {
            ge1.b.T(b0Var, null, null, new r02.i.b.a(mVar, cVar, cVar2, fFloatValue, null), 3);
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        q11.a aVar = (q11.a) this.f130312b;
        e23.a aVar2 = (e23.a) this.f130313c;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        p3.x1 x1Var = p3.n.f135158a;
        h4.r.a aVar3 = h4.r.S;
        l9.f88870a.getClass();
        b82.c.b(c2.l.G(aVar3, l9.a(mVar)), null, z3.f.c(-1833470247, new q72.f(15, aVar, aVar2), mVar), null, 0L, mVar, 384, 26);
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        l01.a aVar = (l01.a) this.f130312b;
        e23.l lVar = (e23.l) this.f130313c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            r21.a.b(null, aVar, lVar, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        Map map = (Map) this.f130312b;
        rc.i iVar = (rc.i) this.f130313c;
        int iIntValue = ((Integer) obj).intValue();
        String str = (String) obj2;
        lc.q0 q0Var = (lc.q0) obj3;
        str.getClass();
        q0Var.getClass();
        Object obj4 = map.get(str);
        obj4.getClass();
        List list = (List) obj4;
        int i14 = rc.i.b.f151844a[(((q0Var instanceof lc.g) || iVar.f151837a.getF158591b().i(iIntValue)) ? rc.i.a.QUERY : rc.i.a.PATH).ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                lc.u0.r();
                return null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iVar.a(str, (String) it.next());
            }
        } else {
            if (list.size() != 1) {
                StringBuilder sbL = hb.a.l("Expected one value for argument ", str, ", found ");
                sbL.append(list.size());
                sbL.append("values instead.");
                throw new IllegalArgumentException(sbL.toString().toString());
            }
            iVar.f151839c += IOUtils.DIR_SEPARATOR_UNIX + ((String) p13.h0.b0(list));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    private final Object h(Object obj, Object obj2, Object obj3) {
        id1.c.e eVar = (id1.c.e) this.f130312b;
        e23.l lVar = (e23.l) this.f130313c;
        e2.d dVar = (e2.d) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        dVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(dVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (eVar instanceof tg0.c) {
                mVar.C(747041431);
                rg0.i.c(0, e2.d.c(dVar, h4.r.S), ((tg0.c) eVar).f164494a, mVar);
                mVar.f();
            } else if (eVar instanceof ei0.u0.a) {
                mVar.C(1683667115);
                ei0.u0.a aVar = (ei0.u0.a) eVar;
                b12.b bVar = aVar.f64341l;
                String str = aVar.f64332c;
                String str2 = aVar.f64333d;
                boolean z14 = aVar.f64337h;
                ei0.u0.a.b bVar2 = aVar.f64336g;
                h4.r rVarC = e2.d.c(dVar, h4.r.S);
                boolean zB = mVar.B(lVar) | mVar.r(eVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new qn0.f(26, lVar, eVar);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new qn0.f(26, lVar, eVar);
                        mVar.K(objQ);
                    }
                }
                rg0.i.b(bVar, str, str2, z14, bVar2, rVarC, (e23.a) objQ, mVar, b12.b.f14385f);
                mVar.f();
            } else {
                mVar.C(1684244397);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x02b0  */
    private final Object i(Object obj, Object obj2, Object obj3) {
        String string;
        com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d dVar = (com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d) this.f130312b;
        e23.a aVar = (e23.a) this.f130313c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = c2.x2.f(aVar2, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarF, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(aVar2, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(mVar, R.string.lbl_profile_picture);
            float f14 = SyslogConstants.LOG_LOCAL4;
            g6.f.a aVar5 = g6.f.f75994b;
            com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.a aVar6 = dVar.f35035a;
            b12.b bVar2 = aVar6.f35050h;
            b12.k.b(rVarC2, strQ, f14, new b12.b(bVar2.f14387a, null, bVar2.f14389c, null, null, 26, null), mVar, (b12.b.f14385f << 9) | 384, 16);
            String str = aVar6.f35046d;
            ue0.c cVar = aVar6.f35045c;
            AuthorizedViewerDetailActivity.b bVar3 = aVar6.f35049g;
            if (str == null) {
                str = "";
            }
            d92.b.f58624b.getClass();
            mh.c(str, c2.l.C(aVar2, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar), mVar, 0, 0, 131068);
            p3.m mVar2 = mVar;
            String str2 = aVar6.f35047e;
            if (str2 == null) {
                mVar2.C(892917615);
                mVar2.f();
            } else {
                mVar2.C(892917616);
                if (str2.length() > 0) {
                    mVar2.C(555554487);
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar2), mVar2, 0, 0, 131070);
                    mVar2 = mVar2;
                    mVar2.f();
                } else {
                    mVar2.C(555753414);
                    mVar2.f();
                }
                Unit unit = Unit.INSTANCE;
                mVar2.f();
            }
            Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
            context.getClass();
            DateTime dateTime = aVar6.f35048f;
            String strN = dateTime != null ? c22.j0.n(dateTime, 'M') : "";
            int i14 = com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.c.f35054b[bVar3.ordinal()];
            if (i14 == 1 || i14 == 2) {
                string = context.getString(R.string.accepted_date, strN);
                string.getClass();
            } else {
                if (i14 != 3 && i14 != 4) {
                    lc.u0.r();
                    return null;
                }
                int i15 = com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.d.c.f35053a[cVar.ordinal()];
                if (i15 == 1) {
                    string = context.getString(R.string.added_date, strN);
                    string.getClass();
                } else {
                    if (i15 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    string = context.getString(R.string.connection_request_sent);
                    string.getClass();
                }
            }
            p3.m mVar3 = mVar2;
            mh.c(string, c2.l.A(aVar2, 0.0f, eVar2.f97921f, 1), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar3, 0, 0, 131068);
            p3.m mVar4 = mVar3;
            if ((bVar3 == AuthorizedViewerDetailActivity.b.ViewableAccount && cVar == ue0.c.ACCEPTED) || bVar3 == AuthorizedViewerDetailActivity.b.ManagedAccount) {
                mVar4.C(893591401);
                c2.j.g gVar = c2.j.f22698h;
                h4.g.b bVar4 = h4.d.a.f81534l;
                h4.r rVarE = u1.n.e(c2.x2.f(aVar2, 1.0f), j20.x.b(mVar4), o4.m1.f128891a);
                boolean zB = mVar4.B(aVar);
                Object objQ = mVar4.q();
                if (zB) {
                    objQ = new qk0.o(aVar, 23);
                    mVar4.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new qk0.o(aVar, 23);
                        mVar4.K(objQ);
                    }
                }
                h4.r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) objQ, 15);
                c2.s2 s2VarA = c2.q2.a(gVar, bVar4, mVar4, 54);
                int iHashCode2 = Long.hashCode(mVar4.getU());
                p3.i2 i2VarX2 = mVar4.x();
                h4.r rVarC3 = h4.k.c(rVarD, mVar4);
                if (mVar4.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar4.z();
                if (mVar4.getT()) {
                    mVar4.M(aVar4);
                } else {
                    mVar4.c();
                }
                b4.c(eVar, s2VarA, mVar4);
                b4.c(c1623g, i2VarX2, mVar4);
                if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar4, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC3, mVar4);
                c2.u2 u2Var = c2.u2.f22900a;
                mh.c(gl1.y.Q(mVar4, R.string.view_account), c2.l.y(aVar2, eVar2.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, mVar4, 0, 0, 131068);
                s62.a.f157643a.getClass();
                u4.d dVarA = v62.d3.a(t62.b.f162798a);
                h4.r rVarC4 = c2.l.C(aVar2, 0.0f, 0.0f, eVar2.f97918c, 0.0f, 11);
                o4.r rVarA = o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar4).f().b());
                mVar4 = mVar4;
                u1.y0.b(dVarA, null, rVarC4, rVarA, mVar4, 48, 56);
                mVar4.y();
                mVar4.f();
            } else {
                mVar4.C(894688584);
                mVar4.f();
            }
            mVar4.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object j(Object obj, Object obj2, Object obj3) {
        double dDoubleValue;
        o13.p pVar;
        gg1.o0 o0Var = (gg1.o0) this.f130312b;
        rk0.f0 f0Var = (rk0.f0) this.f130313c;
        c2.t2 t2Var = (c2.t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(1);
            int i14 = rk0.d0.a.f153088a[o0Var.ordinal()];
            if (i14 == 1 || i14 == 2) {
                mVar.C(-1384181585);
                c22.l3.a aVar = c22.l3.f23124b;
                Double d14 = f0Var.f153117q;
                dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                aVar.getClass();
                pVar = new o13.p(numberInstance.format(dDoubleValue / 1609.344d), gl1.y.Q(mVar, R.string.lbl_mile));
                mVar.f();
            } else {
                if (i14 != 3) {
                    throw n23.j.m(mVar, 2033555784);
                }
                mVar.C(-1383871182);
                c22.l3.a aVar2 = c22.l3.f23124b;
                Double d15 = f0Var.f153117q;
                dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
                aVar2.getClass();
                pVar = new o13.p(numberInstance.format(dDoubleValue / 1000.0d), gl1.y.Q(mVar, R.string.lbl_km));
                mVar.f();
            }
            String str = (String) pVar.f128594a;
            String str2 = (String) pVar.f128595b;
            l72.x0 x0Var = l72.x0.f111346a;
            str.getClass();
            x0Var.f((iIntValue & 14) | (l72.x0.f111348c << 24), 116, null, t2Var, null, null, str, gl1.y.Q(mVar, R.string.lbl_distance), str2, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object k(Object obj, Object obj2, Object obj3) {
        String strP;
        p3.p1 p1Var = (p3.p1) this.f130312b;
        rk0.w0 w0Var = (rk0.w0) this.f130313c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        int iR0 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            am.x0 x0Var = ((rk0.c1) p1Var.getF182175a()).f153084d;
            if (x0Var == null) {
                x0Var = ((rk0.c1) p1Var.getF182175a()).f153082b;
            }
            String strT = gl1.d.T(x0Var.f4360c, mVar, 0);
            am.x0 x0Var2 = ((rk0.c1) p1Var.getF182175a()).f153084d;
            if (x0Var2 != null) {
                Integer num = w0Var.f153291b.get(x0Var2);
                if (num != null) {
                    iR0 = num.intValue();
                }
            } else {
                iR0 = p13.h0.R0(w0Var.f153291b.values());
            }
            String str = NumberFormat.getIntegerInstance().format(Integer.valueOf(iR0));
            if (iR0 == 1) {
                mVar.C(1466297152);
                String str2 = w0Var.f153290a;
                str.getClass();
                strP = gl1.y.P(R.string.gear_name_used_for_type_activity_singular, new Object[]{str2, str, strT}, mVar);
                mVar.f();
            } else {
                mVar.C(1466608547);
                String str3 = w0Var.f153290a;
                str.getClass();
                strP = gl1.y.P(R.string.gear_name_used_for_num_type_activities, new Object[]{str3, str, strT}, mVar);
                mVar.f();
            }
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, eVar.f97917b);
            String strG = sn.a.g(strP);
            d92.b.f58624b.getClass();
            mh.c(strG, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, mVar), mVar, 0, 0, 131068);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object l(Object obj, Object obj2, Object obj3) throws ParseException {
        mm1.e eVar = (mm1.e) this.f130312b;
        b10.d dVar = (b10.d) this.f130313c;
        c2.t2 t2Var = (c2.t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            b10.b bVar = new b10.b((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
            Long averageLocalSleepStartTime = eVar.getAverageLocalSleepStartTime();
            long jLongValue = averageLocalSleepStartTime != null ? averageLocalSleepStartTime.longValue() : -1L;
            int i14 = iIntValue;
            l72.x0 x0Var = l72.x0.f111346a;
            String strG = dVar.g(jLongValue);
            l22.a aVar = dVar.f14215a;
            String strH = dVar.h(jLongValue);
            String string = aVar.getString(R.string.lbl_avg_weekly_bedtime);
            b92.a aVarB = rn1.c.b(bVar.a(jLongValue));
            int i15 = i14 & 14;
            int i16 = b92.a.f16960b;
            int i17 = i15 | (l72.x0.f111348c << 24);
            x0Var.a(i17, 52, aVarB, t2Var, null, null, strG, string, strH, null, mVar);
            Long averageLocalSleepEndTime = eVar.getAverageLocalSleepEndTime();
            long jLongValue2 = averageLocalSleepEndTime != null ? averageLocalSleepEndTime.longValue() : -1L;
            x0Var.a(i17, 52, rn1.c.b(bVar.e(jLongValue2)), t2Var, null, null, dVar.g(jLongValue2), aVar.getString(R.string.lbl_avg_weekly_wake_time), dVar.h(jLongValue2), null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object n(Object obj, Object obj2, Object obj3) throws ParseException {
        mm1.a aVar = (mm1.a) this.f130312b;
        b10.d dVar = (b10.d) this.f130313c;
        l22.a aVar2 = dVar.f14215a;
        c2.t2 t2Var = (c2.t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            b10.b bVar = new b10.b((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
            Long averageLocalSleepStartTime = aVar.getAverageLocalSleepStartTime();
            long jLongValue = averageLocalSleepStartTime != null ? averageLocalSleepStartTime.longValue() : -1L;
            int i14 = iIntValue;
            l72.x0 x0Var = l72.x0.f111346a;
            String strG = dVar.g(jLongValue);
            String strH = dVar.h(jLongValue);
            String string = aVar2.getString(R.string.lbl_avg_bedtime);
            b92.a aVarB = rn1.c.b(bVar.a(jLongValue));
            int i15 = i14 & 14;
            int i16 = b92.a.f16960b;
            int i17 = i15 | (l72.x0.f111348c << 24);
            x0Var.a(i17, 52, aVarB, t2Var, null, null, strG, string, strH, null, mVar);
            Long averageLocalSleepEndTime = aVar.getAverageLocalSleepEndTime();
            long jLongValue2 = averageLocalSleepEndTime != null ? averageLocalSleepEndTime.longValue() : -1L;
            x0Var.a(i17, 52, rn1.c.b(bVar.e(jLongValue2)), t2Var, null, null, dVar.g(jLongValue2), aVar2.getString(R.string.lbl_avg_wake_time), dVar.h(jLongValue2), null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        List list = (List) this.f130312b;
        mm1.a aVar = (mm1.a) this.f130313c;
        c2.t2 t2Var = (c2.t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            rl1.i iVar = (rl1.i) p13.h0.e0(0, list);
            int i14 = (iIntValue & 14) | (mm1.a.f119613m << 6);
            rn1.j.b(t2Var, iVar, aVar, mVar, i14);
            rn1.j.b(t2Var, (rl1.i) p13.h0.e0(1, list), aVar, mVar, i14);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x033f  */
    /* JADX WARN: Code duplicated, block: B:274:0x090f  */
    /* JADX WARN: Code duplicated, block: B:279:0x092c  */
    /* JADX WARN: Code duplicated, block: B:294:0x09ac  */
    /* JADX WARN: Code duplicated, block: B:309:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:363:0x0c07  */
    /* JADX WARN: Code duplicated, block: B:368:0x0c38  */
    /* JADX WARN: Code duplicated, block: B:373:0x0c69  */
    /* JADX WARN: Code duplicated, block: B:378:0x0c97  */
    /* JADX WARN: Code duplicated, block: B:383:0x0cc7  */
    /* JADX WARN: Code duplicated, block: B:87:0x02a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v10, types: [b92.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r1v17, types: [h82.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v5, types: [java.lang.Object, o81.a] */
    /* JADX WARN: Type inference failed for: r26v2, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r26v3, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r3v27, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v28, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        String string;
        String string2;
        p3.m mVar;
        int i14 = this.f130311a;
        int i15 = 11;
        int i16 = 18;
        p3.m.a aVar = p3.m.f135153a;
        int i17 = 6;
        int i18 = 2;
        ?? r14 = 0;
        int i19 = 16;
        boolean z14 = true;
        z = true;
        boolean z15 = true;
        Object obj5 = this.f130313c;
        Object obj6 = this.f130312b;
        boolean z16 = false;
        switch (i14) {
            case 0:
                h4.r rVar = (h4.r) obj6;
                Context context = (Context) obj5;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.c1) obj).getClass();
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    boolean zR = mVar2.r(context);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new l71.g(context, i19);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new l71.g(context, i19);
                            mVar2.K(objQ);
                        }
                    }
                    l72.o.a(rVar, "https://connect.garmin.com/images/badges/xxhdpi/badge_18169DF205A646FD8B7E0F07AECA02A0_lrg.png?appVer=9110", "Grand Canyon Trail", false, false, true, (e23.a) objQ, mVar2, 197046, 88);
                    boolean zR2 = mVar2.r(context);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new l71.g(context, 17);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new l71.g(context, 17);
                            mVar2.K(objQ2);
                        }
                    }
                    l72.o.a(rVar, "https://connect.garmin.com/images/badges/xxhdpi/badge_18169DF205A646FD8B7E0F07AECA02A0_lrg.png?appVer=9110", "Grand Canyon Trail Earned", false, true, true, (e23.a) objQ2, mVar2, 221622, 72);
                    boolean zR3 = mVar2.r(context);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new l71.g(context, i16);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new l71.g(context, i16);
                            mVar2.K(objQ3);
                        }
                    }
                    l72.o.a(rVar, "https://connect.garmin.com/images/badges/xxhdpi/badge_9D1ED9E4E4484B01AFFE0E3C6AA85E1E_lrg.png?appVer=9110", "Everest Base Camp Trek Great Wall", false, true, false, (e23.a) objQ3, mVar2, 25014, 104);
                    boolean zR4 = mVar2.r(context);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        objQ4 = new l71.g(context, 19);
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new l71.g(context, 19);
                            mVar2.K(objQ4);
                        }
                    }
                    l72.o.a(rVar, "https://connect.garmin.com/images/badges/xxhdpi/badge_9377CF173E5A43B2B75C03F8F07A0700_lrg.png?appVer=9110\n", "K2 Pakistan Climb", false, true, false, (e23.a) objQ4, mVar2, 28086, 96);
                    boolean zR5 = mVar2.r(context);
                    Object objQ5 = mVar2.q();
                    if (zR5) {
                        objQ5 = new l71.g(context, 20);
                        mVar2.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new l71.g(context, 20);
                            mVar2.K(objQ5);
                        }
                    }
                    l72.o.a(rVar, "https://connect.garmin.com/images/=9110", "Placeholder", false, true, false, (e23.a) objQ5, mVar2, 25014, 104);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                e23.p<? super p3.m, ? super Integer, Unit> pVar = (e23.p) obj6;
                p3.p1 p1Var = (p3.p1) obj5;
                c2.t2 t2Var = (c2.t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar3.B(t2Var) ? 4 : 2;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    l72.w wVar = l72.w.f111301a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.d.f81522a.getClass();
                    wVar.a(t2Var.a(t2Var.c(aVar2, h4.d.a.f81534l), 1.0f, false), "Header", (String) p1Var.getF182175a(), pVar, mVar3, 48, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                int i24 = 0;
                Context context2 = (Context) obj5;
                ?? r24 = (o81.a) obj6;
                ?? r15 = (h82.r) obj;
                ?? r16 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i25 = o81.a.f130834f;
                r15.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= r16.B(r15) ? 4 : 2;
                }
                if (r16.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    int i26 = (iIntValue3 << 3) & 112;
                    r15.D(R.string.lbl_hill_score, r16, i26);
                    String strQ = gl1.y.Q(r16, R.string.text_hill_score_definition_v2);
                    Object objQ6 = r16.q();
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        obj4 = objQ6;
                        z0 z0Var = new z0(21);
                        r16.K(z0Var);
                        obj4 = z0Var;
                    }
                    obj4 = objQ6;
                    int i27 = (iIntValue3 << 6) & 896;
                    r15.l(R.string.text_hill_score_definition_v2, i27, 0, oi0.c.A(context2, (e23.l) obj4, strQ), r16);
                    r15.o(R.string.text_hill_score_rating_categories_v2, i27, 2, null, r16);
                    g6.f.a aVar3 = g6.f.f75994b;
                    c2.l.f(c2.l.C(h4.r.S, 0.0f, 8, 0.0f, 0.0f, 13), r16);
                    r16.C(-800104479);
                    q81.k[] kVarArrValues = q81.k.values();
                    int length = kVarArrValues.length;
                    ?? r17 = r16;
                    while (i24 < length) {
                        q81.k kVar = kVarArrValues[i24];
                        q81.k.f143328e.getClass();
                        ?? r26 = r17;
                        r24.h(h82.c.f82429e << 12, q81.k.a.a(kVar, r17), gl1.y.Q(r17, kVar.f143337b), kVar.f143339d, r26);
                        i24++;
                        r17 = r26;
                    }
                    ?? r27 = r17;
                    r27.f();
                    r15.o(R.string.msg_hill_score_rating_additional_info_v2, i27, 2, null, r27);
                    int i28 = i26 | 6;
                    r15.j(z3.f.c(-1845492904, new c70.b(r15, context2, i18), r27), r27, i28);
                    r15.j(z3.f.c(2064437057, new mw1.b((Object) r15, 14, (Object) r24, context2), r27), r27, i28);
                    r15.j(z3.f.c(460433184, new ix0.f(r15, i16), r27), r27, i28);
                    p3.x1 x1Var4 = p3.n.f135158a;
                } else {
                    r16.e();
                }
                return Unit.INSTANCE;
            case 3:
                zc.d dVar = (zc.d) obj6;
                GroupDetailMemberListFragment groupDetailMemberListFragment = (GroupDetailMemberListFragment) obj5;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    h4.r rVarD = c2.x2.d(h4.r.S, 1.0f);
                    boolean zR6 = mVar4.r(dVar) | mVar4.r(groupDetailMemberListFragment);
                    Object objQ7 = mVar4.q();
                    if (zR6) {
                        objQ7 = new o50.a(i17, dVar, groupDetailMemberListFragment);
                        mVar4.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new o50.a(i17, dVar, groupDetailMemberListFragment);
                            mVar4.K(objQ7);
                        }
                    }
                    e2.c.b(rVarD, null, null, null, null, null, false, null, (e23.l) objQ7, mVar4, 6, 510);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                zc.d dVar2 = (zc.d) obj6;
                GroupManageMembersActivity groupManageMembersActivity = (GroupManageMembersActivity) obj5;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                GroupManageMembersActivity.a aVar4 = GroupManageMembersActivity.f36194d;
                ((c2.t) obj).getClass();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    h4.r rVarD2 = c2.x2.d(h4.r.S, 1.0f);
                    boolean zR7 = mVar5.r(dVar2) | mVar5.r(groupManageMembersActivity);
                    Object objQ8 = mVar5.q();
                    if (zR7) {
                        objQ8 = new o50.a(8, dVar2, groupManageMembersActivity);
                        mVar5.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new o50.a(8, dVar2, groupManageMembersActivity);
                            mVar5.K(objQ8);
                        }
                    }
                    e2.c.b(rVarD2, null, null, null, null, null, false, null, (e23.l) objQ8, mVar5, 6, 510);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                vw1.e eVar = (vw1.e) obj6;
                final com.garmin.android.apps.connectmobile.training.itp.a aVar5 = (com.garmin.android.apps.connectmobile.training.itp.a) obj5;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                ((c2.t) obj).getClass();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                    fg0.k kVar2 = eVar.f180586v;
                    boolean zR8 = mVar6.r(aVar5);
                    Object objQ9 = mVar6.q();
                    if (zR8) {
                        final int i29 = z16 ? 1 : 0;
                        objQ9 = new e23.a() { // from class: ow1.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i30 = i29;
                                com.garmin.android.apps.connectmobile.training.itp.a aVar6 = aVar5;
                                switch (i30) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a2 = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                                        m activity = aVar6.getActivity();
                                        if (activity != null) {
                                            activity.setResult(208);
                                            activity.finish();
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a3 = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                                        aVar6.w6().f134302c = aVar6.w6().f134301b;
                                        aVar6.w6().f134304e = null;
                                        m activity2 = aVar6.getActivity();
                                        ITPWorkoutScheduleActivity iTPWorkoutScheduleActivity = activity2 instanceof ITPWorkoutScheduleActivity ? (ITPWorkoutScheduleActivity) activity2 : null;
                                        if (iTPWorkoutScheduleActivity != null) {
                                            iTPWorkoutScheduleActivity.J0();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            final int i210 = z16 ? 1 : 0;
                            objQ9 = new e23.a() { // from class: ow1.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i30 = i210;
                                    com.garmin.android.apps.connectmobile.training.itp.a aVar6 = aVar5;
                                    switch (i30) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a2 = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                                            m activity = aVar6.getActivity();
                                            if (activity != null) {
                                                activity.setResult(208);
                                                activity.finish();
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a3 = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                                            aVar6.w6().f134302c = aVar6.w6().f134301b;
                                            aVar6.w6().f134304e = null;
                                            m activity2 = aVar6.getActivity();
                                            ITPWorkoutScheduleActivity iTPWorkoutScheduleActivity = activity2 instanceof ITPWorkoutScheduleActivity ? (ITPWorkoutScheduleActivity) activity2 : null;
                                            if (iTPWorkoutScheduleActivity != null) {
                                                iTPWorkoutScheduleActivity.J0();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar6.K(objQ9);
                        }
                    }
                    e23.a aVar6 = (e23.a) objQ9;
                    boolean zR9 = mVar6.r(aVar5);
                    Object objQ10 = mVar6.q();
                    if (zR9) {
                        final int i30 = z14 ? 1 : 0;
                        objQ10 = new e23.a() { // from class: ow1.b
                            @Override // e23.a
                            public final Object invoke() {
                                int i34 = i30;
                                com.garmin.android.apps.connectmobile.training.itp.a aVar7 = aVar5;
                                switch (i34) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a2 = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                                        m activity = aVar7.getActivity();
                                        if (activity != null) {
                                            activity.setResult(208);
                                            activity.finish();
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a3 = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                                        aVar7.w6().f134302c = aVar7.w6().f134301b;
                                        aVar7.w6().f134304e = null;
                                        m activity2 = aVar7.getActivity();
                                        ITPWorkoutScheduleActivity iTPWorkoutScheduleActivity = activity2 instanceof ITPWorkoutScheduleActivity ? (ITPWorkoutScheduleActivity) activity2 : null;
                                        if (iTPWorkoutScheduleActivity != null) {
                                            iTPWorkoutScheduleActivity.J0();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            final int i34 = z14 ? 1 : 0;
                            objQ10 = new e23.a() { // from class: ow1.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i35 = i34;
                                    com.garmin.android.apps.connectmobile.training.itp.a aVar7 = aVar5;
                                    switch (i35) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a2 = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                                            m activity = aVar7.getActivity();
                                            if (activity != null) {
                                                activity.setResult(208);
                                                activity.finish();
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a3 = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                                            aVar7.w6().f134302c = aVar7.w6().f134301b;
                                            aVar7.w6().f134304e = null;
                                            m activity2 = aVar7.getActivity();
                                            ITPWorkoutScheduleActivity iTPWorkoutScheduleActivity = activity2 instanceof ITPWorkoutScheduleActivity ? (ITPWorkoutScheduleActivity) activity2 : null;
                                            if (iTPWorkoutScheduleActivity != null) {
                                                iTPWorkoutScheduleActivity.J0();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar6.K(objQ10);
                        }
                    }
                    jg0.d.a(rVarF, kVar2, null, false, null, false, null, null, false, aVar6, (e23.a) objQ10, null, mVar6, (fg0.k.X << 3) | 196614, 0, 2524);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj6;
                vw1.e eVar2 = (vw1.e) obj5;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a2 = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                ((c2.t) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.e3 e3Var = (com.garmin.android.apps.connectmobile.e3) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.e3.class, null, null, 6, null);
                    h4.r rVarF2 = c2.x2.f(h4.r.S, 1.0f);
                    if (!eVar2.f180575i && !eVar2.f180576j) {
                        z15 = false;
                    }
                    e3Var.v(3078, activityListItemDTO, null, rVarF2, mVar7, z15);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                rx.a aVar7 = (rx.a) obj6;
                String str = aVar7.f154900b;
                Context context3 = aVar7.f154899a;
                gs1.l lVar = (gs1.l) obj5;
                c2.t2 t2Var2 = (c2.t2) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(t2Var2) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    l72.x0 x0Var = l72.x0.f111346a;
                    Integer bodyBatteryChargedValue = lVar != null ? lVar.getBodyBatteryChargedValue() : null;
                    String str2 = (bodyBatteryChargedValue == null || (string2 = context3.getString(R.string.lbl_string_with_positive_sign, String.valueOf(bodyBatteryChargedValue.intValue()))) == null) ? str : string2;
                    String string3 = context3.getString(R.string.gcm_body_battery_lbl_charged);
                    string3.getClass();
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    String string4 = context3.getString(R.string.gcm_body_battery_lbl_charged);
                    string4.getClass();
                    c0235a.f16962a.put("merge", e5.g(string4, ", ", context3.getString(R.string.common_no_data)));
                    b92.a aVarB = c0235a.b();
                    int i35 = b92.a.f16960b;
                    int i36 = (iIntValue8 & 14) | (l72.x0.f111348c << 24);
                    x0Var.a(i36, 60, aVarB, t2Var2, null, null, str2, string3, null, null, mVar8);
                    Integer bodyBatteryDrainedValue = lVar != null ? lVar.getBodyBatteryDrainedValue() : null;
                    String str3 = (bodyBatteryDrainedValue == null || (string = context3.getString(R.string.lbl_string_with_negative_sign, String.valueOf(bodyBatteryDrainedValue.intValue()))) == null) ? str : string;
                    String string5 = context3.getString(R.string.gcm_body_battery_lbl_drained);
                    string5.getClass();
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    String string6 = context3.getString(R.string.gcm_body_battery_lbl_drained);
                    string6.getClass();
                    c0235a2.f16962a.put("merge", e5.g(string6, ", ", context3.getString(R.string.common_no_data)));
                    x0Var.a(i36, 60, c0235a2.b(), t2Var2, null, null, str3, string5, null, null, mVar8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                m4.q qVar = (m4.q) obj6;
                p3.p1 p1Var2 = (p3.p1) obj5;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.r rVarD3 = c2.x2.d(u1.n.e(aVar8, tn.k.a(d92.b.f58623a, mVar9), o4.m1.f128891a), 1.0f);
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97920e;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, mVar9, 0);
                    int iHashCode = Long.hashCode(mVar9.getU());
                    p3.i2 i2VarX = mVar9.x();
                    h4.r rVarC = h4.k.c(rVarD3, mVar9);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar9);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar9);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar9, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar9);
                    c2.b0 b0Var = c2.b0.f22601a;
                    p3.v.a(z2.u2.f201804a.c(new z2.t2(ds.e0.e(mVar9), o4.d0.c(0.4f, d92.b.a(mVar9).k().a(), 14), null)), z3.f.c(1075932001, new oo0.f(10, qVar, p1Var2), mVar9), mVar9, 56);
                    c2.t0.a(c2.l.A(aVar8, eVar3.f97920e, 0.0f, 2), null, null, null, 0, 0, z3.f.c(-2025549626, new eb0.a(p1Var2, 12), mVar9), mVar9, 1572864, 62);
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                yp.d dVar3 = (yp.d) obj6;
                qp.a aVar10 = (qp.a) obj5;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    h4.r.a aVar11 = h4.r.S;
                    h4.r rVarD4 = c2.x2.d(aVar11, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    h4.r rVarC2 = c2.l.C(rVarD4, eVar4.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    c2.j.f22691a.getClass();
                    c2.j.g gVar = c2.j.f22698h;
                    h4.d.f81522a.getClass();
                    c2.s2 s2VarA = c2.q2.a(gVar, h4.d.a.f81534l, mVar10, 54);
                    int iHashCode2 = Long.hashCode(mVar10.getU());
                    p3.i2 i2VarX2 = mVar10.x();
                    h4.r rVarC3 = h4.k.c(rVarC2, mVar10);
                    h5.g.V.getClass();
                    h5.e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar12);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar10);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar10.getT() || !p005kotlin.jvm.internal.s.g(mVar10.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar10, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar10);
                    c2.u2 u2Var = c2.u2.f22900a;
                    if (dVar3.f198613f) {
                        mVar10.C(633001043);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = e9.a(t62.b.f162798a);
                        gl.c.f77766a.getClass();
                        i7.b(dVarA, null, c2.x2.c(c2.l.C(aVar11, 0.0f, 0.0f, eVar4.f97920e, 0.0f, 11), 1.0f), gl.c.a(mVar10).i(), mVar10, 48, 0);
                        mVar = mVar10;
                        mVar.f();
                    } else {
                        mVar = mVar10;
                        mVar.C(633366781);
                        mVar.f();
                    }
                    p3.m mVar11 = mVar;
                    pp.a.c(aVar10.f145988a, null, aVar10.f145989b, aVar10.f145990c, null, mVar11, 0, 18);
                    mVar11.y();
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                mp.k kVar3 = (mp.k) obj6;
                List<qp.b> list = (List) obj5;
                c2.t2 t2Var3 = (c2.t2) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar12.B(t2Var3) ? 4 : 2;
                }
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    int i37 = pp.h.a.f139528a[kVar3.ordinal()];
                    String strQ2 = gl1.y.Q(mVar12, (i37 == 1 || i37 == 2) ? R.string.no_duration_value : R.string.no_value);
                    mVar12.C(-1326262249);
                    for (qp.b bVar3 : list) {
                        l72.x0 x0Var2 = l72.x0.f111346a;
                        z3.e eVarC = z3.f.c(1596026367, new b(i15, bVar3, strQ2), mVar12);
                        String str4 = bVar3.f145997c;
                        b92.a.C0235a c0235a3 = new b92.a.C0235a(r14, 1, r14);
                        c0235a3.f16962a.put("merge", com.nimbusds.jose.shaded.gson.internal.a.h(bVar3.f145998d, StringUtils.SPACE, bVar3.f145996b, StringSubstitutor.DEFAULT_VAR_END));
                        b92.a aVarB2 = c0235a3.b();
                        int i38 = b92.a.f16960b;
                        x0Var2.c(t2Var3, eVarC, str4, null, null, aVarB2, mVar12, (iIntValue11 & 14) | 48 | (l72.x0.f111348c << 18), 12);
                        r14 = r14;
                        i15 = 11;
                    }
                    mVar12.f();
                    if (list.size() == 1) {
                        mVar12.C(1836414994);
                        l72.x0.f111346a.h(t2Var3, mVar12, (iIntValue11 & 14) | (l72.x0.f111348c << 3));
                        mVar12.f();
                    } else {
                        mVar12.C(1836484186);
                        mVar12.f();
                    }
                    p3.x1 x1Var13 = p3.n.f135158a;
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 11:
                qp.b bVar4 = (qp.b) obj6;
                String str5 = (String) obj5;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((c2.t2) obj).getClass();
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    p3.x1 x1Var14 = p3.n.f135158a;
                    y02.b bVar5 = y02.b.f193048a;
                    String str6 = bVar4.f145995a;
                    bVar5.getClass();
                    str5.getClass();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.i0 i0Var = new s5.i0(0L, o53.f0.H(g6.q.d(j92.f.f97932i.f157322a.fontSize), 4294967296L), (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (s5.b0) null, (q4.g) null, FileManagerCompat.GARMIN_DEVICE_XML_FILE_INDEX, (p005kotlin.jvm.internal.j) null);
                    int length2 = d53.u.y(str6, str5, false) ? str5.length() : d53.w.G(' ', 0, 6, str6);
                    s5.c.b bVar6 = new s5.c.b(0, 1, null);
                    bVar6.b(str6);
                    if (length2 != -1) {
                        bVar6.a(i0Var, length2, str6.length());
                    }
                    mh.d(bVar6.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97929f, mVar13), mVar13, 0, 0, 262142);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 12:
                AtomicLongFieldUpdater atomicLongFieldUpdater = q53.b.f142949d;
                og.a.t((e23.l) obj6, obj5, (t13.g) obj3);
                return Unit.INSTANCE;
            case 13:
                e23.a aVar13 = (e23.a) obj6;
                p3.x3 x3Var = (p3.x3) obj5;
                c2.t2 t2Var4 = (c2.t2) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar14.B(t2Var4) ? 4 : 2;
                }
                if (mVar14.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    p3.x1 x1Var15 = p3.n.f135158a;
                    NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                    l72.w.a aVar14 = l72.w.a.f111302a;
                    z3.e eVarC2 = z3.f.c(794886939, new b(15, integerInstance, x3Var), mVar14);
                    boolean zB = mVar14.B(aVar13);
                    Object objQ11 = mVar14.q();
                    if (zB) {
                        objQ11 = new qk0.o(aVar13, 0);
                        mVar14.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new qk0.o(aVar13, 0);
                            mVar14.K(objQ11);
                        }
                    }
                    aVar14.a(t2Var4, eVarC2, null, (e23.a) objQ11, mVar14, (iIntValue13 & 14) | 48, 2);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                i53.c<am.x0> cVar = (i53.c) obj6;
                p3.p1 p1Var3 = (p3.p1) obj5;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar15.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    p3.x1 x1Var16 = p3.n.f135158a;
                    h4.r.a aVar15 = h4.r.S;
                    h4.r rVarD5 = c2.l.D(u1.a2.b(c2.x2.c(aVar15, 1.0f), u1.a2.a(mVar15), true));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar4 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar4, h4.d.a.f81536n, mVar15, 0);
                    int iHashCode3 = Long.hashCode(mVar15.getU());
                    p3.i2 i2VarX3 = mVar15.x();
                    h4.r rVarC4 = h4.k.c(rVarD5, mVar15);
                    h5.g.V.getClass();
                    h5.e0.a aVar16 = h5.g.a.f81805b;
                    if (mVar15.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar15.z();
                    if (mVar15.getT()) {
                        mVar15.M(aVar16);
                    } else {
                        mVar15.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar15);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar15);
                    h5.g.a.b bVar7 = h5.g.a.f81813j;
                    if (mVar15.getT() || !p005kotlin.jvm.internal.s.g(mVar15.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar15, iHashCode3, bVar7);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar15);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(c2.x2.h(aVar15, j92.b.f97899b.f97920e), mVar15);
                    l72.r1.b(gl1.y.Q(mVar15, R.string.txt_activity_type), null, mVar15, 0, 2);
                    mVar15.C(1884997573);
                    for (am.x0 x0Var3 : cVar) {
                        boolean zContains = ((i53.e) p1Var3.getF182175a()).contains(x0Var3);
                        boolean zH = mVar15.h(zContains) | mVar15.k(x0Var3.ordinal());
                        Object objQ12 = mVar15.q();
                        if (zH) {
                            objQ12 = new c.e(p1Var3, zContains, x0Var3, i15);
                            mVar15.K(objQ12);
                        } else {
                            aVar.getClass();
                            if (objQ12 == p3.m.a.f135155b) {
                                objQ12 = new c.e(p1Var3, zContains, x0Var3, i15);
                                mVar15.K(objQ12);
                            }
                        }
                        qk0.r.a(x0Var3, zContains, false, (e23.a) objQ12, mVar15, 384);
                    }
                    mVar15.f();
                    h4.r.a aVar17 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(c2.x2.h(aVar17, j92.b.f97899b.f97920e), mVar15);
                    mVar15.y();
                    p3.x1 x1Var17 = p3.n.f135158a;
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                return a(obj, obj2, obj3);
            case 16:
                return b(obj, obj2, obj3);
            case 17:
                return c(obj, obj2, obj3);
            case 18:
                return d(obj, obj2, obj3);
            case 19:
                return e(obj, obj2, obj3);
            case 20:
                return f(obj, obj2, obj3);
            case 21:
                return g(obj, obj2, obj3);
            case 22:
                return h(obj, obj2, obj3);
            case 23:
                return i(obj, obj2, obj3);
            case 24:
                return j(obj, obj2, obj3);
            case 25:
                return k(obj, obj2, obj3);
            case 26:
                return l(obj, obj2, obj3);
            case 27:
                return n(obj, obj2, obj3);
            case 28:
                return o(obj, obj2, obj3);
            default:
                x00.a aVar18 = (x00.a) obj6;
                ir0.f fVar = (ir0.f) obj5;
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar16.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    p3.x1 x1Var18 = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar8 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    c2.j.d dVar4 = c2.j.f22693c;
                    h4.r.a aVar19 = h4.r.S;
                    h4.r rVarF3 = c2.x2.f(aVar19, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar5 = j92.b.f97899b;
                    float f15 = eVar5.f97918c;
                    float f16 = eVar5.f97922g;
                    h4.r rVarC5 = c2.l.C(rVarF3, 0.0f, 0.0f, f15, 0.0f, 11);
                    c2.s2 s2VarA2 = c2.q2.a(dVar4, bVar8, mVar16, 54);
                    int iHashCode4 = Long.hashCode(mVar16.getU());
                    p3.i2 i2VarX4 = mVar16.x();
                    h4.r rVarC6 = h4.k.c(rVarC5, mVar16);
                    h5.g.V.getClass();
                    h5.e0.a aVar20 = h5.g.a.f81805b;
                    if (mVar16.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar16.z();
                    if (mVar16.getT()) {
                        mVar16.M(aVar20);
                    } else {
                        mVar16.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA2, mVar16);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar16);
                    h5.g.a.b bVar9 = h5.g.a.f81813j;
                    if (mVar16.getT() || !p005kotlin.jvm.internal.s.g(mVar16.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar16, iHashCode4, bVar9);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar16);
                    c2.l.f(c2.u2.f22900a.a(aVar19, 1.0f, true), mVar16);
                    Integer numF = fVar.f();
                    String strD = (numF == null || numF.intValue() < 0) ? aVar18.d() : aVar18.b(numF);
                    d92.b.f58624b.getClass();
                    mh.c(strD, c2.l.C(aVar19, 0.0f, 0.0f, eVar5.f97918c, 0.0f, 11), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar16), mVar16, 0, 0, 131068);
                    h4.r rVarR = c2.x2.r(aVar19, f16, f16);
                    Integer numF2 = fVar.f();
                    c02.h.e(rVarR, numF2 != null ? Double.valueOf(numF2.intValue()) : null, Double.valueOf(fVar.f94797b), mVar16, 3072);
                    mVar16.y();
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(int i14, Object obj, Object obj2) {
        this.f130311a = i14;
        this.f130312b = obj;
        this.f130313c = obj2;
    }
}
