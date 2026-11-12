package d50;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.u;
import b11.t;
import c2.b0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import ds.e0;
import ds.z;
import e11.x;
import e23.p;
import ep0.s;
import g01.w;
import gl1.y;
import h4.r;
import i3.fe;
import i3.i7;
import i3.mh;
import java.util.Date;
import n70.a7;
import org.joda.time.DateTimeComparator;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;
import u1.y0;
import u62.i1;
import v62.b8;
import v62.d3;
import v62.h5;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57511a;

    public /* synthetic */ b(int i14) {
        this.f57511a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0613  */
    /* JADX WARN: Code duplicated, block: B:175:0x0747  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f57511a;
        p3.m.a aVar = p3.m.f135153a;
        p005kotlin.jvm.internal.j jVar = null;
        int i15 = 2;
        int i16 = 1;
        boolean z14 = false;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                c cVar = c.f57512a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = y.Q(mVar, R.string.lbl_edit);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar), mVar, 0, 0, 131070);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                c cVar2 = c.f57512a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ2 = y.Q(mVar2, R.string.workout_lbl_duplicate);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar2), mVar2, 0, 0, 131070);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                c cVar3 = c.f57512a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ3 = y.Q(mVar3, R.string.lbl_share);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar3), mVar3, 0, 0, 131070);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                c cVar4 = c.f57512a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    String strQ4 = y.Q(mVar4, R.string.lbl_delete_course);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar4), mVar4, 0, 0, 131070);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                d dVar = d.f57519a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.bike, mVar5, 0);
                    long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar5);
                    r.a aVar2 = r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA, null, x2.q(aVar2, j92.b.f97901d.f97905d), jA, mVar5, 48, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e eVar = e.f57521a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    t4.d dVarA2 = n5.c.a(R.drawable.pin, mVar6, 0);
                    long jB = e0.b(d92.b.f58623a, mVar6);
                    r.a aVar3 = r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA2, null, x2.q(aVar3, j92.b.f97901d.f97904c), jB, mVar6, 48, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                d51.a aVar4 = d51.a.f57557a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    String strQ5 = y.Q(mVar7, R.string.pacepro_title);
                    u uVar = (u) mVar7.A(g02.d.f74342a);
                    boolean zR = mVar7.r(uVar);
                    Object objQ = mVar7.q();
                    if (zR) {
                        objQ = new d51.a.C1230a(uVar);
                        mVar7.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new d51.a.C1230a(uVar);
                            mVar7.K(objQ);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) ((k23.g) objQ), null, strQ5, mVar7, null);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                d70.a aVar5 = d70.a.f58080a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97935l, mVar8);
                    d92.b.f58625c.getClass();
                    d70.g.b(x0VarF, j92.b.f97899b.f97918c, mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                dl0.k kVar = dl0.k.f60296a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = i1.a(t62.a.f162797a);
                    long jB2 = e0.b(d92.b.f58623a, mVar9);
                    r.a aVar6 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA3, null, x2.q(aVar6, j92.b.f97901d.f97905d), jB2, mVar9, 48, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                dl0.k kVar2 = dl0.k.f60296a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA4 = d3.a(t62.b.f162798a);
                    long jA2 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar10);
                    r.a aVar7 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA4, null, x2.q(aVar7, j92.b.f97901d.f97904c), jA2, mVar10, 48, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                return Integer.valueOf(DateTimeComparator.getInstance().compare(((ps.x1) obj).getStartDateTime(), ((ps.x1) obj2).getStartDateTime()));
            case 11:
                ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) obj;
                ConversationCommentDTO conversationCommentDTO2 = (ConversationCommentDTO) obj2;
                com.garmin.android.apps.connectmobile.social.b.a aVar8 = com.garmin.android.apps.connectmobile.social.b.T0;
                if (conversationCommentDTO == null || conversationCommentDTO2 == null) {
                    i16 = 0;
                } else {
                    Date date = conversationCommentDTO.f44549d;
                    Date date2 = conversationCommentDTO2.f44549d;
                    if (date == null || date2 == null) {
                        i16 = 0;
                    } else if (date.before(date2)) {
                        i16 = -1;
                    }
                }
                return Integer.valueOf(i16);
            case 12:
                Scope scope = (Scope) obj;
                dp0.a aVar9 = dp0.a.f60634a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var = s0.f105811a;
                return new gp0.b((pm1.f) scope.get((k23.d<?>) t0Var.b(pm1.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mq1.a) scope.get((k23.d<?>) t0Var.b(mq1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 13:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                dp0.a aVar10 = dp0.a.f60634a;
                scope2.getClass();
                parametersHolder.getClass();
                t0 t0Var2 = s0.f105811a;
                return new hp0.a(new ep0.b(ModuleExtKt.androidContext(scope2), (r53.i) parametersHolder.elementAt(0, t0Var2.b(r53.i.class)), new ae0.b(), (f12.l) scope2.get((k23.d<?>) t0Var2.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v21.e) scope2.get((k23.d<?>) t0Var2.b(v21.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)), new a7((l70.c) scope2.get((k23.d<?>) t0Var2.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
            case 14:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                dp0.a aVar11 = dp0.a.f60634a;
                scope3.getClass();
                parametersHolder2.getClass();
                t0 t0Var3 = s0.f105811a;
                return new fp0.e((hp0.a) parametersHolder2.elementAt(0, t0Var3.b(hp0.a.class)), (gp0.a) scope3.get((k23.d<?>) t0Var3.b(gp0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 15:
                Scope scope4 = (Scope) obj;
                dp0.b bVar = dp0.b.f60636a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var4 = s0.f105811a;
                return new gp0.d((pm1.f) scope4.get((k23.d<?>) t0Var4.b(pm1.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mq1.a) scope4.get((k23.d<?>) t0Var4.b(mq1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 16:
                Scope scope5 = (Scope) obj;
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                dp0.b bVar2 = dp0.b.f60636a;
                scope5.getClass();
                parametersHolder3.getClass();
                t0 t0Var5 = s0.f105811a;
                r53.i iVar = (r53.i) parametersHolder3.elementAt(0, t0Var5.b(r53.i.class));
                return new hp0.b(new s(ModuleExtKt.androidContext(scope5), iVar, new ae0.b(), (f12.l) scope5.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v21.e) scope5.get((k23.d<?>) t0Var5.b(v21.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)), new n70.m(new dp0.b.a(iVar), o70.f.YESTERDAY), new a7((l70.c) scope5.get((k23.d<?>) t0Var5.b(l70.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
            case 17:
                Scope scope6 = (Scope) obj;
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                dp0.b bVar3 = dp0.b.f60636a;
                scope6.getClass();
                parametersHolder4.getClass();
                t0 t0Var6 = s0.f105811a;
                return new fp0.h((hp0.b) parametersHolder4.elementAt(0, t0Var6.b(hp0.b.class)), (gp0.c) scope6.get((k23.d<?>) t0Var6.b(gp0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 18:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                g6.f.a aVar12 = g6.f.f75994b;
                return c2.l.c(64, 0.0f, 2);
            case 19:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ds.p pVar = ds.p.f61026a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    t62.b.f162798a.getClass();
                    u4.d dVarA5 = z62.m.a(h5.f175898a);
                    long jB3 = e0.b(d92.b.f58623a, mVar11);
                    r.a aVar13 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA5, "", z.b(c2.l.C(aVar13, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), mVar11), jB3, mVar11, 48, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                dt1.a aVar14 = dt1.a.f61111a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    r.a aVar15 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.a(n5.c.a(R.drawable.layers, mVar12, 0), y.Q(mVar12, R.string.lbl_map_settings), x2.q(aVar15, j92.b.f97901d.f97905d), n5.a.a(mVar12, R.color.gray_70_static), mVar12, 0, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                dt1.a aVar16 = dt1.a.f61111a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    r.a aVar17 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.a(n5.c.a(R.drawable.navigation, mVar13, 0), y.Q(mVar13, R.string.center_map_on_your_location_content_description), x2.q(aVar17, j92.b.f97901d.f97905d), n5.a.a(mVar13, R.color.gray_70_static), mVar13, 0, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                dv0.a aVar18 = dv0.a.f61352a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA6 = b8.a(t62.b.f162798a);
                    long jA3 = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar14);
                    r.a aVar19 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA6, null, x2.q(aVar19, j92.b.f97901d.f97904c), jA3, mVar14, 48, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 23:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                dv0.a aVar20 = dv0.a.f61352a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    t4.d dVarA7 = n5.c.a(R.drawable.exterior_link, mVar15, 0);
                    String strQ6 = y.Q(mVar15, R.string.livetrack_delete_profile);
                    r.a aVar21 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    y0.a(dVarA7, strQ6, x2.q(aVar21, j92.b.f97899b.f97920e), null, null, 0.0f, o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar15).f().d()), mVar15, 0, 56);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                dv0.b bVar4 = dv0.b.f61355a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    String strP = y.P(R.string.lbl_your_access_code_info, new Object[]{8, 64}, mVar16);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF2 = d92.c.f(j92.f.f97933j, mVar16);
                    r.a aVar22 = r.S;
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    mh.c(strP, c2.l.z(aVar22, f14, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar16, 0, 0, 131068);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                dv0.c cVar5 = dv0.c.f61357a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    zd0.e.c(0.0f, 0, 15, 0L, null, mVar17);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                dv0.c cVar6 = dv0.c.f61357a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    c2.j jVar2 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97918c;
                    jVar2.getClass();
                    c2.j.i iVarI = c2.j.i(f15);
                    r.a aVar23 = r.S;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, mVar18, 0);
                    int iHashCode = Long.hashCode(mVar18.getU());
                    i2 i2VarX = mVar18.x();
                    r rVarC = h4.k.c(aVar23, mVar18);
                    h5.g.V.getClass();
                    h5.e0.a aVar24 = h5.g.a.f81805b;
                    if (mVar18.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar18.z();
                    if (mVar18.getT()) {
                        mVar18.M(aVar24);
                    } else {
                        mVar18.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar18);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar18);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar18.getT() || !p005kotlin.jvm.internal.s.g(mVar18.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar18, iHashCode, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar18);
                    b0 b0Var = b0.f22601a;
                    dv0.s.a(true, true, "https://garmin.com/livetrack/", "username", null, mVar18, 3510, 16);
                    Object objQ2 = mVar18.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new dh0.j(14);
                        mVar18.K(objQ2);
                    }
                    dv0.u.a(false, (e23.a) objQ2, mVar18, 54);
                    mVar18.y();
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 27:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                e11.c cVar7 = e11.c.f61863a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    fe feVar = new fe();
                    v21.e eVar2 = new v21.e((Context) mVar19.A(AndroidCompositionLocals_androidKt.f6042b));
                    Double dValueOf = Double.valueOf(2.0d);
                    g01.c cVar8 = g01.c.SERVING;
                    x.a(new d11.i(null, new d11.g("My Recipe", "My Brand", "This is a note.", dValueOf, cVar8), i53.a.a(cVar8, g01.c.GRAMS), i53.a.a(new d11.f(new b11.a.C0202a(null, 1.0d, true, 1L, new b11.d("food_1", "Sample Food 1", w.BRAND, "Brand A", g01.u.FATSECRET, LocaleUnitResolver.ImperialCountryCode.US, "en", null, 128, null), new b11.s(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "serving", 1.0d, new b11.f(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null)), new t(null, null, null, 7, null), 1, null), z14, i15, jVar)), null, null, null, false, false, false, false, null, 4081, null), eVar2, feVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mVar19, 0, 1048568);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                return Unit.INSTANCE;
            default:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                return Unit.INSTANCE;
        }
    }
}
