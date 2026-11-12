package defpackage;

import a03.k0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.w0;
import aq.j;
import aq.o2;
import aq.p3;
import as.c;
import as.k;
import au0.p;
import b82.d2;
import bd0.o;
import c2.b0;
import c2.l;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import d6.h;
import d92.b;
import e2.d;
import e23.q;
import f5.b1;
import f5.v1;
import f5.y0;
import g6.f;
import gl1.y;
import h4.r;
import h5.g;
import i3.e5;
import i3.i7;
import i3.mh;
import j92.e;
import java.util.ArrayList;
import k2.i;
import l72.p2;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import r1.e0;
import s5.x0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13a;

    private final Object a(Object obj, Object obj2, Object obj3) {
        t2 t2Var = (t2) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        as.a aVar = as.a.f12615a;
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i14 = iIntValue;
            d2 d2Var = d2.f16532a;
            String strQ = y.Q(mVar, R.string.strength_training_set);
            r.a aVar2 = r.S;
            b.f58623a.getClass();
            b.f58625c.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            float f16 = 10;
            f.a aVar3 = f.f75994b;
            float f17 = 7;
            int i15 = i14 & 14;
            d2Var.c(t2Var, strQ, null, t2Var.a(l.B(aVar2, f14, f16, f15, f17), 1.0f, true), null, 0, 0, mVar, i15, 58);
            d2Var.c(t2Var, y.Q(mVar, R.string.lbl_name), null, t2Var.a(k.d(aVar2), 3.0f, true), null, 0, 0, mVar, i15, 58);
            d2Var.c(t2Var, y.Q(mVar, R.string.lbl_time), null, t2Var.a(k.d(aVar2), 1.5f, true), null, 0, 0, mVar, i15, 58);
            d2Var.c(t2Var, y.Q(mVar, R.string.strength_training_reps), null, t2Var.a(l.B(aVar2, f15, f16, eVar.f97920e, f17), 1.5f, true), null, 0, 0, mVar, i15, 58);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        t2 t2Var = (t2) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        as.b bVar = as.b.f12618a;
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i14 = iIntValue;
            d2 d2Var = d2.f16532a;
            String strQ = y.Q(mVar, R.string.strength_training_set);
            r.a aVar = r.S;
            b.f58623a.getClass();
            b.f58625c.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            float f16 = 10;
            f.a aVar2 = f.f75994b;
            float f17 = 7;
            int i15 = i14 & 14;
            d2Var.c(t2Var, strQ, null, t2Var.a(l.B(aVar, f14, f16, f15, f17), 1.0f, true), null, 0, 0, mVar, i15, 58);
            d2Var.c(t2Var, y.Q(mVar, R.string.lbl_name), null, t2Var.a(k.d(aVar), 3.0f, true), null, 0, 0, mVar, i15, 58);
            d2Var.c(t2Var, y.Q(mVar, R.string.lbl_time), null, t2Var.a(k.d(aVar), 1.5f, true), null, 0, 0, mVar, i15, 58);
            d2Var.c(t2Var, y.Q(mVar, R.string.strength_training_reps), null, t2Var.a(l.B(aVar, f15, f16, eVar.f97920e, f17), 1.5f, true), null, 0, 0, mVar, i15, 58);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        t2 t2Var = (t2) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        c cVar = c.f12621a;
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i14 = iIntValue;
            d2 d2Var = d2.f16532a;
            String strQ = y.Q(mVar, R.string.strength_training_set);
            r.a aVar = r.S;
            b.f58623a.getClass();
            b.f58625c.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            float f16 = 10;
            f.a aVar2 = f.f75994b;
            float f17 = 7;
            int i15 = i14 & 14;
            d2Var.c(t2Var, strQ, null, t2Var.a(l.B(aVar, f14, f16, f15, f17), 0.2f, true), null, 0, 0, mVar, i15, 58);
            d2Var.c(t2Var, y.Q(mVar, R.string.lbl_name), null, t2Var.a(k.d(aVar), 0.6f, true), null, 0, 0, mVar, i15, 58);
            d2Var.c(t2Var, y.Q(mVar, R.string.lbl_time), null, t2Var.a(l.B(aVar, f15, f16, eVar.f97920e, f17), 0.2f, true), null, 0, 0, mVar, i15, 58);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        ((Integer) obj3).intValue();
        au0.a aVar = au0.a.f12847a;
        ((e0) obj).getClass();
        x1 x1Var = n.f135158a;
        p.e((m) obj2, 0);
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        av0.a aVar = av0.a.f13149a;
        ((d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(mVar, R.string.lte_select_phone_number);
            b.f58623a.getClass();
            b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97930g, mVar);
            h.f57752b.getClass();
            int i14 = h.f57755e;
            r.a aVar2 = r.S;
            r rVarF = x2.f(aVar2, 1.0f);
            b.f58625c.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            float f15 = eVar.f97920e;
            mh.c(strQ, l.C(rVarF, f15, f14, f15, 0.0f, 8), 0L, null, 0L, null, 0L, h.a(i14), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
            mh.c(y.Q(mVar, R.string.msg_where_should_we_send_invitation_to_messenger), l.B(x2.f(aVar2, 1.0f), f15, eVar.f97918c, f15, eVar.f97921f), 0L, null, 0L, null, 0L, h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 130044);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        h82.r rVar = (h82.r) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        o oVar = o.f17594a;
        rVar.getClass();
        int i14 = 4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            rVar.m((iIntValue << 6) & 896, 2, y.P(R.string.smart_scale_device_setup_help_title, new Object[]{y.Q(mVar, R.string.index_smart_scale_help_url)}, mVar), null, mVar);
            int i15 = ((iIntValue << 3) & 112) | 6;
            rVar.j(z3.f.c(-1519163894, new a42.l(rVar, i14), mVar), mVar, i15);
            rVar.j(z3.f.c(8143233, new a42.l(rVar, 5), mVar), mVar, i15);
            rVar.j(z3.f.c(1015065922, new a42.l(rVar, 6), mVar), mVar, i15);
            rVar.j(z3.f.c(2021988611, new a42.l(rVar, 7), mVar), mVar, i15);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = 0;
        switch (this.f13a) {
            case 0:
                r rVar = (r) obj;
                m mVar = (m) obj2;
                v.h.y(-1697705876, rVar, (Integer) obj3, mVar);
                x1 x1Var = n.f135158a;
                r rVarA = l4.k.a(rVar, 0.5f);
                mVar.f();
                return rVarA;
            case 1:
                r rVar2 = (r) obj;
                m mVar2 = (m) obj2;
                v.h.y(336208573, rVar2, (Integer) obj3, mVar2);
                x1 x1Var2 = n.f135158a;
                b.f58623a.getClass();
                b.f58625c.getClass();
                r rVarC = l.C(rVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
                mVar2.f();
                return rVarC;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                a11.a aVar = a11.a.f245a;
                ((t2) obj).getClass();
                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    d6.p.f57793b.getClass();
                    int i15 = d6.p.f57795d;
                    r.a aVar2 = r.S;
                    b.f58623a.getClass();
                    b.f58625c.getClass();
                    r rVarY = l.y(aVar2, j92.b.f97899b.f97917b);
                    String strQ = y.Q(mVar3, R.string.lbl_cancel);
                    b.f58624b.getClass();
                    mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, i15, false, 1, 0, null, d92.c.e(j92.f.f97933j), mVar3, 0, 28032, 102396);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar4 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                a11.a aVar3 = a11.a.f245a;
                ((t2) obj).getClass();
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    d6.p.f57793b.getClass();
                    int i16 = d6.p.f57795d;
                    r.a aVar4 = r.S;
                    b.f58623a.getClass();
                    b.f58625c.getClass();
                    r rVarY2 = l.y(aVar4, j92.b.f97899b.f97917b);
                    String strQ2 = y.Q(mVar4, R.string.lbl_ok);
                    b.f58624b.getClass();
                    mh.c(strQ2, rVarY2, 0L, null, 0L, null, 0L, null, 0L, i16, false, 1, 0, null, d92.c.e(j92.f.f97933j), mVar4, 0, 28032, 102396);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                b1 b1Var = (b1) obj;
                y0 y0Var = (y0) obj2;
                b1Var.getClass();
                y0Var.getClass();
                v1 v1VarQ = y0Var.Q(((g6.a) obj3).f75988a);
                int i17 = v1VarQ.f69145b;
                return b1.h0(b1Var, i17, i17, new k0(v1VarQ, 1));
            case 5:
                m mVar5 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                an0.a aVar5 = an0.a.f4456a;
                ((d) obj).getClass();
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    String strQ3 = y.Q(mVar5, R.string.msg_search_at_least_two);
                    b.f58623a.getClass();
                    b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97932i, mVar5);
                    h.f57752b.getClass();
                    int i18 = h.f57755e;
                    r rVarF = x2.f(r.S, 1.0f);
                    b.f58625c.getClass();
                    mh.c(strQ3, l.y(rVarF, j92.b.f97899b.f97922g), 0L, null, 0L, null, 0L, h.a(i18), 0L, 0, false, 0, 0, null, x0VarB, mVar5, 0, 0, 130044);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                m mVar6 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                an0.a aVar6 = an0.a.f4456a;
                ((d) obj).getClass();
                if (mVar6.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    String strQ4 = y.Q(mVar6, R.string.connection_search_no_results);
                    b.f58623a.getClass();
                    b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97932i, mVar6);
                    h.f57752b.getClass();
                    int i19 = h.f57755e;
                    r rVarF2 = x2.f(r.S, 1.0f);
                    b.f58625c.getClass();
                    mh.c(strQ4, l.y(rVarF2, j92.b.f97899b.f97922g), 0L, null, 0L, null, 0L, h.a(i19), 0L, 0, false, 0, 0, null, x0VarB2, mVar6, 0, 0, 130044);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                m mVar7 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                an0.a aVar7 = an0.a.f4456a;
                ((d) obj).getClass();
                if (mVar7.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var7 = n.f135158a;
                    p2.f111205a.a(y.Q(mVar7, R.string.lbl_loading), mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 8:
                m mVar8 = (m) obj2;
                ((Integer) obj3).intValue();
                an1.a aVar8 = an1.a.f4474a;
                ((e0) obj).getClass();
                x1 x1Var8 = n.f135158a;
                t4.d dVarA = n5.c.a(R.drawable.icon_danger, mVar8, 0);
                f.a aVar9 = f.f75994b;
                r rVarQ = x2.q(r.S, 16);
                d0.f128823b.getClass();
                i7.a(dVarA, null, rVarQ, d0.f128832k, mVar8, 3504, 0);
                return Unit.INSTANCE;
            case 9:
                m mVar9 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ao1.a aVar10 = ao1.a.f11535a;
                ((d) obj).getClass();
                if (mVar9.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var9 = n.f135158a;
                    ao1.k.a(mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 10:
                m mVar10 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ao1.a aVar11 = ao1.a.f11535a;
                ((d) obj).getClass();
                if (mVar10.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var10 = n.f135158a;
                    r.a aVar12 = r.S;
                    b.f58623a.getClass();
                    b.f58625c.getClass();
                    l.f(x2.h(aVar12, j92.b.f97899b.f97918c), mVar10);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 11:
                m mVar11 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ao1.a aVar13 = ao1.a.f11535a;
                ((d) obj).getClass();
                if (mVar11.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var11 = n.f135158a;
                    ao1.k.c(mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 12:
                m mVar12 = (m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ao1.a aVar14 = ao1.a.f11535a;
                ((d) obj).getClass();
                if (mVar12.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var12 = n.f135158a;
                    r.a aVar15 = r.S;
                    b.f58623a.getClass();
                    b.f58625c.getClass();
                    l.f(x2.h(aVar15, j92.b.f97899b.f97920e), mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 13:
                h82.r rVar3 = (h82.r) obj;
                m mVar13 = (m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                j jVar = j.f12013a;
                rVar3.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar13.B(rVar3) ? 4 : 2;
                }
                if (mVar13.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var13 = n.f135158a;
                    int i24 = (iIntValue10 << 3) & 112;
                    rVar3.D(R.string.workout_feel_help_title, mVar13, i24);
                    int i25 = (iIntValue10 << 6) & 896;
                    rVar3.l(R.string.workout_feel_help_intro, i25, 2, null, mVar13);
                    rVar3.t(R.string.workout_feel_help_subtitle1, mVar13, i24);
                    rVar3.o(R.string.workout_feel_help_msg1, i25, 2, null, mVar13);
                    rVar3.o(R.string.workout_feel_help_msg2, i25, 2, null, mVar13);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 14:
                h82.r rVar4 = (h82.r) obj;
                m mVar14 = (m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                j jVar2 = j.f12013a;
                rVar4.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar14.B(rVar4) ? 4 : 2;
                }
                if (mVar14.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var14 = n.f135158a;
                    int i26 = (iIntValue11 << 3) & 112;
                    rVar4.D(R.string.workout_perceived_effort_help_title, mVar14, i26);
                    int i27 = (iIntValue11 << 6) & 896;
                    rVar4.l(R.string.workout_perceived_effort_help_intro, i27, 2, null, mVar14);
                    rVar4.t(R.string.workout_perceived_effort_help_subtitle1, mVar14, i26);
                    rVar4.o(R.string.workout_perceived_effort_help_msg1, i27, 2, null, mVar14);
                    rVar4.o(R.string.workout_perceived_effort_help_msg2, i27, 2, null, mVar14);
                    f.a aVar16 = f.f75994b;
                    float f14 = 16;
                    r rVarB = l.B(r.S, 24, 8, f14, f14);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar14, 0);
                    int iHashCode = Long.hashCode(mVar14.getU());
                    i2 i2VarX = mVar14.x();
                    r rVarC2 = h4.k.c(rVarB, mVar14);
                    g.V.getClass();
                    h5.e0.a aVar17 = g.a.f81805b;
                    if (mVar14.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar17);
                    } else {
                        mVar14.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar14);
                    b4.c(g.a.f81809f, i2VarX, mVar14);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar14.getT() || !s.g(mVar14.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar14, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC2, mVar14);
                    b0 b0Var = b0.f22601a;
                    sr.r rVar5 = new sr.r(new l22.a((Context) mVar14.A(AndroidCompositionLocals_androidKt.f6042b)));
                    mVar14.C(-2041940723);
                    f02.a.f67722a.getClass();
                    gl.c cVar = gl.c.f77766a;
                    cVar.getClass();
                    gl.e eVar = gl.c.f77767b;
                    d0 d0VarA = d0.a(eVar.f77801q);
                    l22.b bVar2 = rVar5.f160582a;
                    o13.p pVar = new o13.p(d0VarA, bVar2.a(R.string.string_short_dash_line_string_pattern, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, bVar2.getString(R.string.workout_rpe_very_light)));
                    cVar.getClass();
                    o13.p pVar2 = new o13.p(d0.a(eVar.f77801q), bVar2.a(R.string.string_short_dash_line_string_pattern, "2", bVar2.getString(R.string.workout_rpe_light)));
                    cVar.getClass();
                    m mVar15 = mVar14;
                    for (o13.p pVar3 : x.k(pVar, pVar2, new o13.p(d0.a(eVar.f77819z), bVar2.a(R.string.string_short_dash_line_string_pattern, "3", bVar2.getString(R.string.lbl_moderate_weight))), new o13.p(d0.a(eVar.f77815x), bVar2.a(R.string.string_short_dash_line_string_pattern, "4", bVar2.getString(R.string.workout_rpe_somewhat_hard))), new o13.p(d0.a(eVar.f77814w0), bVar2.a(R.string.string_short_dash_line_string_pattern, "5-6", bVar2.getString(R.string.workout_rpe_hard))), new o13.p(d0.a(eVar.N), bVar2.a(R.string.string_short_dash_line_string_pattern, "7-8", bVar2.getString(R.string.workout_rpe_very_hard))), new o13.p(d0.a(eVar.Z), bVar2.a(R.string.string_short_dash_line_string_pattern, "9", bVar2.getString(R.string.workout_rpe_extremely_hard))), new o13.p(d0.a(eVar.f77772b0), bVar2.a(R.string.string_short_dash_line_string_pattern, "10", bVar2.getString(R.string.workout_rpe_max_effort))))) {
                        r.a aVar18 = r.S;
                        r rVarA2 = l.A(aVar18, 0.0f, 4, 1);
                        h4.d.f81522a.getClass();
                        h4.g.b bVar3 = h4.d.a.f81534l;
                        c2.j.f22691a.getClass();
                        s2 s2VarA = q2.a(c2.j.f22692b, bVar3, mVar15, 48);
                        x1 x1Var15 = n.f135158a;
                        int iHashCode2 = Long.hashCode(mVar15.getU());
                        i2 i2VarX2 = mVar15.x();
                        r rVarC3 = h4.k.c(rVarA2, mVar15);
                        g.V.getClass();
                        h5.e0.a aVar19 = g.a.f81805b;
                        if (mVar15.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar15.z();
                        if (mVar15.getT()) {
                            mVar15.M(aVar19);
                        } else {
                            mVar15.c();
                        }
                        b4.c(g.a.f81810g, s2VarA, mVar15);
                        b4.c(g.a.f81809f, i2VarX2, mVar15);
                        g.a.b bVar4 = g.a.f81813j;
                        if (mVar15.getT() || !s.g(mVar15.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar15, iHashCode2, bVar4);
                        }
                        b4.c(g.a.f81807d, rVarC3, mVar15);
                        u2 u2Var = u2.f22900a;
                        c2.q.a(u1.n.e(l4.k.b(x2.q(aVar18, f14), i.f102406a), ((d0) pVar3.f128594a).f128833a, m1.f128891a), mVar15, 0);
                        String str = (String) pVar3.f128595b;
                        b.f58623a.getClass();
                        b.f58624b.getClass();
                        float f15 = f14;
                        m mVar16 = mVar15;
                        mh.c(str, l.C(aVar18, f15, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar15), mVar16, 48, 0, 131068);
                        m mVar17 = mVar16;
                        mVar17.y();
                        f14 = f15;
                        mVar15 = mVar17;
                    }
                    mVar15.f();
                    mVar15.y();
                    x1 x1Var16 = n.f135158a;
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 15:
                h82.r rVar6 = (h82.r) obj;
                m mVar18 = (m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                aq.k kVar2 = aq.k.f12027a;
                rVar6.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar18.B(rVar6) ? 4 : 2;
                }
                if (mVar18.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var17 = n.f135158a;
                    int i28 = (iIntValue12 << 3) & 112;
                    rVar6.D(R.string.lbl_crosscountry_skiing_cadence_glide_length, mVar18, i28);
                    rVar6.l(R.string.lbl_crosscountry_skiing_cadence_glide_length_body, (iIntValue12 << 6) & 896, 2, null, mVar18);
                    rVar6.j(z3.f.c(299652415, new a42.l(rVar6, 2), mVar18), mVar18, i28 | 6);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 16:
                h82.r rVar7 = (h82.r) obj;
                m mVar19 = (m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                aq.l lVar = aq.l.f12034a;
                rVar7.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar19.B(rVar7) ? 4 : 2;
                }
                if (mVar19.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var18 = n.f135158a;
                    int i29 = (iIntValue13 << 3) & 112;
                    rVar7.D(R.string.winter_sports_ski_power, mVar19, i29);
                    int i30 = (iIntValue13 << 6) & 896;
                    rVar7.l(R.string.winter_sports_ski_power_help, i30, 2, null, mVar19);
                    rVar7.t(R.string.winter_sports_ski_power_help_title_1, mVar19, i29);
                    rVar7.o(R.string.winter_sports_ski_power_help_description_1, i30, 2, null, mVar19);
                    rVar7.t(R.string.winter_sports_ski_power_help_title_2, mVar19, i29);
                    rVar7.o(R.string.winter_sports_ski_power_help_description_2, i30, 2, null, mVar19);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 17:
                h82.r rVar8 = (h82.r) obj;
                m mVar20 = (m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                aq.m mVar21 = aq.m.f12045a;
                rVar8.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar20.B(rVar8) ? 4 : 2;
                }
                if (mVar20.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var19 = n.f135158a;
                    int i34 = (iIntValue14 << 3) & 112;
                    rVar8.D(R.string.activities_using_training_effect_title, mVar20, i34);
                    int i35 = (iIntValue14 << 6) & 896;
                    rVar8.o(R.string.activities_using_training_effect_help_message_1, i35, 2, null, mVar20);
                    rVar8.o(R.string.activities_using_training_effect_help_message_2, i35, 2, null, mVar20);
                    f.a aVar20 = f.f75994b;
                    float f16 = 16;
                    r rVarC4 = l.C(x2.f(r.S, 1.0f), f16, 24, f16, 0.0f, 8);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(kVar3, h4.d.a.f81536n, mVar20, 0);
                    int iHashCode3 = Long.hashCode(mVar20.getU());
                    i2 i2VarX3 = mVar20.x();
                    r rVarC5 = h4.k.c(rVarC4, mVar20);
                    g.V.getClass();
                    h5.e0.a aVar21 = g.a.f81805b;
                    if (mVar20.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar20.z();
                    if (mVar20.getT()) {
                        mVar20.M(aVar21);
                    } else {
                        mVar20.c();
                    }
                    b4.c(g.a.f81810g, zVarA2, mVar20);
                    b4.c(g.a.f81809f, i2VarX3, mVar20);
                    g.a.b bVar5 = g.a.f81813j;
                    if (mVar20.getT() || !s.g(mVar20.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar20, iHashCode3, bVar5);
                    }
                    b4.c(g.a.f81807d, rVarC5, mVar20);
                    b0 b0Var2 = b0.f22601a;
                    mVar20.C(-922500928);
                    p3[] p3VarArrValues = p3.values();
                    int length = p3VarArrValues.length;
                    int i36 = 0;
                    int i37 = 0;
                    while (i36 < length) {
                        p3 p3Var = p3VarArrValues[i36];
                        int i38 = i37 + 1;
                        p3[] p3VarArrValues2 = p3.values();
                        ArrayList arrayList = new ArrayList(p3VarArrValues2.length);
                        int length2 = p3VarArrValues2.length;
                        int i39 = 0;
                        int iD = 0;
                        while (iD < length2) {
                            p3 p3Var2 = p3VarArrValues2[iD];
                            int i44 = i39 + 1;
                            iD = e5.d(i39 == i37 ? p3Var2.f12159b : p3Var2.f12160c, iD, arrayList, 1);
                            i39 = i44;
                        }
                        i53.f fVarJ = i53.a.j(h0.G0(arrayList));
                        float f17 = f16;
                        r rVarC6 = l.C(r.S, 0.0f, 8, 0.0f, f17, 5);
                        String strQ5 = y.Q(mVar20, p3Var.f12158a);
                        b.f58623a.getClass();
                        b.f58624b.getClass();
                        mh.c(strQ5, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar20), mVar20, 48, 0, 131068);
                        long jC = b.a(mVar20).c().c();
                        int length3 = (p3.values().length - 1) - i37;
                        String str2 = p3Var.f12161d;
                        Context context = (Context) mVar20.A(AndroidCompositionLocals_androidKt.f6042b);
                        Object objQ = mVar20.q();
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new w0(2);
                            mVar20.K(objQ);
                        }
                        g02.m1.a(jC, fVarJ, length3, str2, oi0.c.A(context, (e23.l) objQ, str2), null, 0.0f, 0.0f, mVar20, 0);
                        i36++;
                        f16 = f17;
                        i37 = i38;
                    }
                    mVar20.f();
                    mVar20.y();
                    rVar8.t(R.string.activities_firstbeat, mVar20, i34);
                    rVar8.q(y.Q(mVar20, R.string.activities_firstbeat_description), mVar20, i34);
                    x1 x1Var20 = n.f135158a;
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 18:
                h82.r rVar9 = (h82.r) obj;
                m mVar22 = (m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                aq.m mVar23 = aq.m.f12045a;
                rVar9.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar22.B(rVar9) ? 4 : 2;
                }
                if (mVar22.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    x1 x1Var21 = n.f135158a;
                    rVar9.D(R.string.activities_aerobic_help_title, mVar22, (iIntValue15 << 3) & 112);
                    int i45 = (iIntValue15 << 6) & 896;
                    rVar9.o(R.string.activity_aerobic_help_message, i45, 2, null, mVar22);
                    rVar9.o(R.string.activity_training_effect_calculation_message_aerobic, i45, 2, null, mVar22);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 19:
                h82.r rVar10 = (h82.r) obj;
                m mVar24 = (m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                aq.m mVar25 = aq.m.f12045a;
                rVar10.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= mVar24.B(rVar10) ? 4 : 2;
                }
                if (mVar24.n(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    x1 x1Var22 = n.f135158a;
                    rVar10.D(R.string.activities_anaerobic_help_title, mVar24, (iIntValue16 << 3) & 112);
                    int i46 = (iIntValue16 << 6) & 896;
                    rVar10.o(R.string.activity_anaerobic_help_message, i46, 2, null, mVar24);
                    rVar10.o(R.string.activity_training_effect_calculation_message_anaerobic, i46, 2, null, mVar24);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 20:
                h82.r rVar11 = (h82.r) obj;
                m mVar26 = (m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                aq.m mVar27 = aq.m.f12045a;
                rVar11.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= mVar26.B(rVar11) ? 4 : 2;
                }
                if (mVar26.n(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    x1 x1Var23 = n.f135158a;
                    int i47 = (iIntValue17 << 3) & 112;
                    rVar11.D(R.string.activities_load_title, mVar26, i47);
                    int i48 = (iIntValue17 << 6) & 896;
                    rVar11.l(R.string.activities_exercise_load_description_text, i48, 2, null, mVar26);
                    rVar11.t(R.string.activities_exercise_load_description_title, mVar26, i47);
                    rVar11.o(R.string.activities_exercise_load_description_text_2, i48, 2, null, mVar26);
                    rVar11.t(R.string.activities_exercise_load_description_title_2, mVar26, i47);
                    rVar11.o(R.string.activities_exercise_load_description_text_3, i48, 2, null, mVar26);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 21:
                h82.r rVar12 = (h82.r) obj;
                m mVar28 = (m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                int i49 = o2.f12136f;
                rVar12.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= mVar28.B(rVar12) ? 4 : 2;
                }
                if (mVar28.n(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    x1 x1Var24 = n.f135158a;
                    rVar12.D(R.string.lbl_performance_condition, mVar28, (iIntValue18 << 3) & 112);
                    int i54 = (iIntValue18 << 6) & 896;
                    rVar12.l(R.string.gcm_help_performance_condition_subtitle, i54, 2, null, mVar28);
                    rVar12.o(R.string.gcm_help_performance_condition_description, i54, 2, null, mVar28);
                    rVar12.c(mVar28, iIntValue18 & 14);
                    d2.f16532a.d(null, z3.f.c(2011208334, new a(22), mVar28), mVar28, 48, 1);
                    for (Object obj4 : x.k(new o2.a(R.string.lbl_excellent, "> 10"), new o2.a(R.string.lbl_good, y.P(R.string.lbl_value1_to_value2, new Object[]{2, 10}, mVar28)), new o2.a(R.string.lbl_baseline, y.P(R.string.lbl_value1_to_value2, new Object[]{-1, 1}, mVar28)), new o2.a(R.string.lbl_fair, y.P(R.string.lbl_value1_to_value2, new Object[]{-10, -2}, mVar28)), new o2.a(R.string.lbl_poor, y.P(R.string.lbl_value1_to_value2, new Object[]{-20, -11}, mVar28)))) {
                        int i55 = i14 + 1;
                        if (i14 < 0) {
                            x.q();
                            throw null;
                        }
                        d2.f16532a.g(i55, 384, 2, null, mVar28, z3.f.c(-492100837, new a71.n((o2.a) obj4, 3), mVar28));
                        i14 = i55;
                    }
                    x1 x1Var25 = n.f135158a;
                } else {
                    mVar28.e();
                }
                return Unit.INSTANCE;
            case 22:
                t2 t2Var = (t2) obj;
                m mVar29 = (m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                int i56 = o2.f12136f;
                t2Var.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= mVar29.B(t2Var) ? 4 : 2;
                }
                if (mVar29.n(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    x1 x1Var26 = n.f135158a;
                    d2 d2Var = d2.f16532a;
                    String strQ6 = y.Q(mVar29, R.string.lbl_performance);
                    d2Var.getClass();
                    int i57 = iIntValue19 & 14;
                    d2Var.c(t2Var, strQ6, null, t2Var.a(d2.h(), 0.635f, true), null, 0, 0, mVar29, i57, 58);
                    d2Var.c(t2Var, y.Q(mVar29, R.string.lbl_score), null, t2Var.a(d2.h(), 0.365f, true), null, 0, 0, mVar29, i57, 58);
                } else {
                    mVar29.e();
                }
                return Unit.INSTANCE;
            case 23:
                return a(obj, obj2, obj3);
            case 24:
                return b(obj, obj2, obj3);
            case 25:
                return c(obj, obj2, obj3);
            case 26:
                return d(obj, obj2, obj3);
            case 27:
                return e(obj, obj2, obj3);
            case 28:
                return f(obj, obj2, obj3);
            default:
                r rVar13 = (r) obj;
                m mVar30 = (m) obj2;
                v.h.y(-711455028, rVar13, (Integer) obj3, mVar30);
                x1 x1Var27 = n.f135158a;
                b.f58623a.getClass();
                b.f58625c.getClass();
                r rVarB2 = u1.q.b(j92.b.f97899b.f97916a, b.a(mVar30).j().a(), rVar13, m1.f128891a);
                mVar30.f();
                return rVarB2;
        }
    }

    public /* synthetic */ a(int i14) {
        this.f13a = i14;
    }
}
