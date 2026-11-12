package pa0;

import c2.a0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h82.r;
import i3.mh;
import java.util.Arrays;
import l72.p2;
import o4.q1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.x1;
import po.v;
import q42.p;
import r1.e0;
import s5.i0;
import u1.y0;
import w5.b0;
import w5.c0;
import w5.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136707a;

    public /* synthetic */ b(int i14) {
        this.f136707a = i14;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        q42.a aVar = q42.a.f142593a;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            rVar.D(R.string.title_body_mass_index, mVar, (iIntValue << 3) & 112);
            int i14 = (iIntValue << 6) & 896;
            rVar.o(R.string.body_mass_index_explanation_message, i14, 2, null, mVar);
            rVar.o(R.string.body_mass_index_calculation_message, i14, 2, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        q42.a aVar = q42.a.f142593a;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            rVar.D(R.string.title_body_fat_numbers, mVar, (iIntValue << 3) & 112);
            rVar.o(R.string.body_fat_explanation_message, (iIntValue << 6) & 896, 0, y.Q(mVar, R.string.body_fat_explanation_message), mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = p.f142668f;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            rVar.D(R.string.title_bone_weight, mVar, (iIntValue << 3) & 112);
            rVar.o(R.string.bone_mass_message, (iIntValue << 6) & 896, 0, p.m(R.string.bone_mass_message, mVar, h82.c.f82429e << 3), mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = p.f142668f;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            rVar.D(R.string.title_muscle_weight, mVar, (iIntValue << 3) & 112);
            rVar.o(R.string.skeletal_muscle_mass_message, (iIntValue << 6) & 896, 0, p.m(R.string.skeletal_muscle_mass_message, mVar, h82.c.f82429e << 3), mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14;
        int i15 = 16;
        int i16 = 3;
        int i17 = 2;
        boolean z14 = true;
        switch (this.f136707a) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                c cVar = c.f136708a;
                ((a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                c cVar2 = c.f136708a;
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                r rVar = (r) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                pb1.a aVar = pb1.a.f136830a;
                rVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(rVar) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    int i18 = (iIntValue3 << 3) & 112;
                    rVar.D(R.string.pregnancy_help_guidance_advice, mVar3, i18);
                    rVar.l(R.string.pregnancy_help_overview_subtitle, (iIntValue3 << 6) & 896, 2, null, mVar3);
                    int i19 = i18 | 6;
                    rVar.j(z3.f.c(-1587836052, new or0.f(rVar, i17), mVar3), mVar3, i19);
                    rVar.j(z3.f.c(1574845141, new or0.f(rVar, i16), mVar3), mVar3, i19);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                r rVar2 = (r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                pf0.b bVar = pf0.b.f137466a;
                rVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar2) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    int i24 = (iIntValue4 << 3) & 112;
                    rVar2.D(R.string.lbl_sinus_rhythm, mVar4, i24);
                    rVar2.o(R.string.msg_ecg_sinus_rhythm_help, (iIntValue4 << 6) & 896, 2, null, mVar4);
                    mVar4.C(-2086925781);
                    s5.c.b bVar2 = new s5.c.b(0, 1, null);
                    mVar4.C(-2086924466);
                    f0.f182097b.getClass();
                    int iJ = bVar2.j(new i0(0L, 0L, f0.f182105j, (b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null));
                    try {
                        bVar2.b(y.Q(mVar4, R.string.msg_ecg_sinus_rhythm_help_note));
                        Unit unit = Unit.INSTANCE;
                        bVar2.f(iJ);
                        mVar4.f();
                        s5.c cVarK = bVar2.k();
                        mVar4.f();
                        rVar2.r(cVarK, mVar4, i24);
                    } catch (Throwable th3) {
                        bVar2.f(iJ);
                        throw th3;
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                r rVar3 = (r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                pf0.b bVar3 = pf0.b.f137466a;
                rVar3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar3) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    int i25 = (iIntValue5 << 3) & 112;
                    rVar3.D(R.string.lbl_atrial_fibrillation_with_abrev, mVar5, i25);
                    rVar3.o(R.string.msg_ecg_afib_info, (iIntValue5 << 6) & 896, 2, null, mVar5);
                    int i26 = i25 | 6;
                    rVar3.j(z3.f.c(629161832, new or0.f(rVar3, 13), mVar5), mVar5, i26);
                    rVar3.j(z3.f.c(731042513, new or0.f(rVar3, 14), mVar5), mVar5, i26);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                r rVar4 = (r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                pf0.b bVar4 = pf0.b.f137466a;
                rVar4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(rVar4) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = n.f135158a;
                    int i27 = (iIntValue6 << 3) & 112;
                    rVar4.D(R.string.lbl_heart_rate_too_high_or_too_low, mVar6, i27);
                    rVar4.j(z3.f.c(-1073973011, new or0.f(rVar4, 17), mVar6), mVar6, i27 | 6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                r rVar5 = (r) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                pf0.b bVar5 = pf0.b.f137466a;
                rVar5.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(rVar5) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var7 = n.f135158a;
                    int i28 = (iIntValue7 << 3) & 112;
                    rVar5.D(R.string.lbl_inconclusive, mVar7, i28);
                    rVar5.l(R.string.msg_inconclusive_1, (iIntValue7 << 6) & 896, 2, null, mVar7);
                    int i29 = i28 | 6;
                    rVar5.j(z3.f.c(1649791561, new or0.f(rVar5, 15), mVar7), mVar7, i29);
                    rVar5.j(z3.f.c(-111381774, new or0.f(rVar5, i15), mVar7), mVar7, i29);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                r rVar6 = (r) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                pf0.b bVar6 = pf0.b.f137466a;
                rVar6.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(rVar6) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    int i30 = (iIntValue8 << 3) & 112;
                    rVar6.D(R.string.lbl_ecg_capabilities, mVar8, i30);
                    rVar6.l(R.string.msg_ecg_app_capabilities_1, (iIntValue8 << 6) & 896, 2, null, mVar8);
                    rVar6.j(z3.f.c(2024990964, new or0.f(rVar6, 21), mVar8), mVar8, i30 | 6);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                pf1.a aVar2 = pf1.a.f137559a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var9 = n.f135158a;
                    og2.k.h(mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                pf1.b bVar7 = pf1.b.f137561a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var10 = n.f135158a;
                    og2.k.h(mVar10, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                r rVar7 = (r) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                pf1.b bVar8 = pf1.b.f137561a;
                rVar7.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar11.B(rVar7) ? 4 : 2;
                }
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var11 = n.f135158a;
                    int i34 = (iIntValue11 << 3) & 112;
                    rVar7.D(R.string.running_tolerance_help_about_what_is_rt_title, mVar11, i34);
                    rVar7.l(R.string.running_tolerance_help_about_header_description, (iIntValue11 << 6) & 896, 2, null, mVar11);
                    rVar7.A(R.string.running_tolerance_help_about_body, mVar11, i34);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                r rVar8 = (r) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                pf1.b bVar9 = pf1.b.f137561a;
                rVar8.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar12.B(rVar8) ? 4 : 2;
                }
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var12 = n.f135158a;
                    int i35 = (iIntValue12 << 3) & 112;
                    rVar8.D(R.string.running_tolerance_help_weekly_tolerance_header_title, mVar12, i35);
                    int i36 = (iIntValue12 << 6) & 896;
                    rVar8.l(R.string.running_tolerance_help_weekly_tolerance_header_description, i36, 2, null, mVar12);
                    rVar8.A(R.string.running_tolerance_help_weekly_tolerance_first_body, mVar12, i35);
                    rVar8.t(R.string.running_tolerance_help_weekly_tolerance_second_body_title, mVar12, i35);
                    rVar8.o(R.string.running_tolerance_help_weekly_tolerance_second_body, i36, 2, null, mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                r rVar9 = (r) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                pf1.b bVar10 = pf1.b.f137561a;
                rVar9.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar13.B(rVar9) ? 4 : 2;
                }
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var13 = n.f135158a;
                    int i37 = (iIntValue13 << 3) & 112;
                    rVar9.D(R.string.running_tolerance_help_impact_load_header_title, mVar13, i37);
                    x0 x0Var = x0.f105818a;
                    int i38 = (iIntValue13 << 6) & 896;
                    rVar9.m(i38, 2, String.format(y.Q(mVar13, R.string.running_tolerance_help_impact_load_header_description), Arrays.copyOf(new Object[]{og2.k.t(mVar13), og2.k.u(mVar13)}, 2)), null, mVar13);
                    rVar9.z(i38, 2, String.format(y.Q(mVar13, R.string.running_tolerance_help_impact_load_first_body), Arrays.copyOf(new Object[]{og2.k.u(mVar13)}, 1)), mVar13);
                    rVar9.t(R.string.running_tolerance_help_impact_load_second_body_title, mVar13, i37);
                    rVar9.q(String.format(y.Q(mVar13, R.string.running_tolerance_help_impact_load_second_body), Arrays.copyOf(new Object[]{og2.k.u(mVar13), og2.k.t(mVar13)}, 2)), mVar13, i37);
                    rVar9.t(R.string.acute_impact_load, mVar13, i37);
                    rVar9.o(R.string.running_tolerance_help_impact_load_third_body, i38, 2, null, mVar13);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                r rVar10 = (r) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ph1.a aVar3 = ph1.a.f137708a;
                rVar10.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar14.B(rVar10) ? 4 : 2;
                }
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var14 = n.f135158a;
                    rVar10.D(R.string.set_body_composition_title, mVar14, (iIntValue14 << 3) & 112);
                    int i39 = (iIntValue14 << 6) & 896;
                    rVar10.l(R.string.set_body_composition_help_description, i39, 2, null, mVar14);
                    rVar10.o(R.string.set_body_composition_help_note, i39, 2, null, mVar14);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                r rVar11 = (r) obj;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                pk1.a aVar4 = pk1.a.f138271a;
                rVar11.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar15.B(rVar11) ? 4 : 2;
                }
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    x1 x1Var15 = n.f135158a;
                    rVar11.D(R.string.lbl_user_settings_all_about_you, mVar15, (iIntValue15 << 3) & 112);
                    rVar11.o(R.string.msg_user_settings_all_about_you, (iIntValue15 << 6) & 896, 2, null, mVar15);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                r rVar12 = (r) obj;
                p3.m mVar16 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                pk1.c cVar3 = pk1.c.f138275a;
                rVar12.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= mVar16.B(rVar12) ? 4 : 2;
                }
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    x1 x1Var16 = n.f135158a;
                    rVar12.D(R.string.personal_info_title_help, mVar16, (iIntValue16 << 3) & 112);
                    rVar12.o(R.string.personal_info_help, (iIntValue16 << 6) & 896, 2, null, mVar16);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                r rVar13 = (r) obj;
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                pk1.c cVar4 = pk1.c.f138275a;
                rVar13.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= mVar17.B(rVar13) ? 4 : 2;
                }
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    x1 x1Var17 = n.f135158a;
                    rVar13.D(R.string.sleep_wake_time_title_help, mVar17, (iIntValue17 << 3) & 112);
                    rVar13.o(R.string.sleep_wake_time_help, (iIntValue17 << 6) & 896, 2, null, mVar17);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                r rVar14 = (r) obj;
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                pk1.c cVar5 = pk1.c.f138275a;
                rVar14.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= mVar18.B(rVar14) ? 4 : 2;
                }
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    x1 x1Var18 = n.f135158a;
                    rVar14.D(R.string.units_title_help, mVar18, (iIntValue18 << 3) & 112);
                    rVar14.o(R.string.units_help, (iIntValue18 << 6) & 896, 2, null, mVar18);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                r rVar15 = (r) obj;
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                pk1.c cVar6 = pk1.c.f138275a;
                rVar15.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= mVar19.B(rVar15) ? 4 : 2;
                }
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    x1 x1Var19 = n.f135158a;
                    rVar15.D(R.string.stride_length_title_help, mVar19, (iIntValue19 << 3) & 112);
                    rVar15.o(R.string.stride_length_help, (iIntValue19 << 6) & 896, 2, null, mVar19);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 19:
                r rVar16 = (r) obj;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                pk1.c cVar7 = pk1.c.f138275a;
                rVar16.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= mVar20.B(rVar16) ? 4 : 2;
                }
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    x1 x1Var20 = n.f135158a;
                    int i44 = (iIntValue20 << 3) & 112;
                    rVar16.D(R.string.lbl_display_preferences, mVar20, i44);
                    rVar16.j(z3.f.c(-2044817079, new or0.f(rVar16, 29), mVar20), mVar20, i44 | 6);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj3).intValue();
                v vVar = v.f138985a;
                ((e0) obj).getClass();
                x1 x1Var21 = n.f135158a;
                po.r.a((p3.m) obj2, 0);
                return Unit.INSTANCE;
            case 21:
                mp.b bVar11 = (mp.b) obj;
                p3.m mVar21 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                bVar11.getClass();
                mVar21.C(796403474);
                x1 x1Var22 = n.f135158a;
                am.x0 x0Var2 = bVar11.f119948a;
                String strT = gl1.d.T(x0Var2.f4360c, mVar21, 0);
                if (bVar11 instanceof mp.f) {
                    mVar21.C(256741668);
                    strT = y.P(R.string.label_all_activity_name, new Object[]{strT}, mVar21);
                    if (x0Var2 == am.x0.f4346x) {
                        mVar21.C(256914710);
                        strT = y.P(R.string.string_space_string_pattern, new Object[]{strT, y.Q(mVar21, R.string.concept_activities)}, mVar21);
                        mVar21.f();
                    } else {
                        mVar21.C(257154960);
                        mVar21.f();
                    }
                    mVar21.f();
                } else {
                    if (!(bVar11 instanceof mp.g)) {
                        throw n23.j.m(mVar21, 839564303);
                    }
                    mVar21.C(257257012);
                    mVar21.f();
                }
                mVar21.f();
                return strT;
            case 22:
                boolean z15 = false;
                r rVar17 = (r) obj;
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                pq1.a aVar5 = pq1.a.f139563a;
                rVar17.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= mVar22.B(rVar17) ? 4 : 2;
                }
                if ((iIntValue21 & 19) != 18) {
                    z15 = true;
                }
                if (mVar22.n(iIntValue21 & 1, z15)) {
                    x1 x1Var23 = n.f135158a;
                    int i45 = (iIntValue21 << 3) & 112;
                    rVar17.D(R.string.concept_steps, mVar22, i45);
                    rVar17.l(R.string.msg_device_track_steps, (iIntValue21 << 6) & 896, 2, null, mVar22);
                    int i46 = i45 | 6;
                    rVar17.j(z3.f.c(-257958983, new pk1.g(rVar17, z14 ? 1 : 0), mVar22), mVar22, i46);
                    rVar17.j(z3.f.c(1038234978, new pk1.g(rVar17, i17), mVar22), mVar22, i46);
                    rVar17.j(z3.f.c(-1146040959, new pk1.g(rVar17, i16), mVar22), mVar22, i46);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 23:
                p3.m mVar23 = (p3.m) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                px0.a aVar6 = px0.a.f141768a;
                ((ox0.a) obj).getClass();
                if (mVar23.n(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    x1 x1Var24 = n.f135158a;
                    og.a.g(mVar23, 0);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar24 = (p3.m) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                q31.b bVar12 = q31.b.f142405a;
                ((a0) obj).getClass();
                if (mVar24.n(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    x1 x1Var25 = n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar24, 0);
                    int iHashCode = Long.hashCode(mVar24.getU());
                    i2 i2VarX = mVar24.x();
                    h4.r rVarC = h4.k.c(aVar7, mVar24);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar24.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar24.z();
                    if (mVar24.getT()) {
                        mVar24.M(aVar8);
                    } else {
                        mVar24.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar24);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar24);
                    h5.g.a.b bVar13 = h5.g.a.f81813j;
                    if (mVar24.getT() || !s.g(mVar24.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar24, iHashCode, bVar13);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar24);
                    c2.b0 b0Var = c2.b0.f22601a;
                    t4.d dVarA = n5.c.a(R.drawable.komoot_image, mVar24, 0);
                    f5.k.f68985a.getClass();
                    y0.a(dVarA, null, x2.f(aVar7, 1.0f), null, f5.k.a.f68990e, 0.0f, null, mVar24, 25008, 104);
                    d92.b.f58623a.getClass();
                    if (d92.b.d(mVar24)) {
                        mVar24.C(3380485);
                        i14 = R.drawable.komoot_logo_dark;
                    } else {
                        mVar24.C(3382086);
                        i14 = R.drawable.komoot_logo_white;
                    }
                    t4.d dVarA2 = n5.c.a(i14, mVar24, 0);
                    mVar24.f();
                    h4.g.a aVar9 = h4.d.a.f81537o;
                    h4.r rVarB = b0Var.b(aVar7, aVar9);
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97921f;
                    float f15 = eVar.f97920e;
                    y0.a(dVarA2, null, x2.h(c2.l.y(rVarB, f14), j92.b.f97901d.f97905d), null, null, 0.0f, null, mVar24, 48, 120);
                    String strQ = y.Q(mVar24, R.string.lbl_sync_komoot_title);
                    d6.h.f57752b.getClass();
                    int i47 = d6.h.f57755e;
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var3 = j92.f.f97931h;
                    f0.f182097b.getClass();
                    mh.c(strQ, b0Var.b(c2.l.y(aVar7, f15), aVar9), 0L, null, 0L, f0.f182104i, 0L, d6.h.a(i47), 0L, 0, false, 0, 0, null, x0Var3, mVar24, 1572864, 0, 129980);
                    mh.c(y.Q(mVar24, R.string.lbl_sync_komoot_info), c2.l.y(aVar7, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, mVar24, 0, 0, 131068);
                    p2 p2Var = p2.f111205a;
                    String strQ2 = y.Q(mVar24, R.string.lbl_komoot_routes_item_title);
                    String strQ3 = y.Q(mVar24, R.string.lbl_komoot_routes_item_subtitle);
                    z3.e eVar2 = q31.b.f142406b;
                    Object objQ = mVar24.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new pk0.m(22);
                        mVar24.K(objQ);
                    }
                    p2Var.h(strQ2, strQ3, null, null, null, false, false, eVar2, null, null, (e23.a) objQ, mVar24, 12582912, 6, 892);
                    String strQ4 = y.Q(mVar24, R.string.lbl_komoot_sync_item_title);
                    String strQ5 = y.Q(mVar24, R.string.lbl_komoot_sync_item_subtitle);
                    z3.e eVar3 = q31.b.f142407c;
                    Object objQ2 = mVar24.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new pk0.m(23);
                        mVar24.K(objQ2);
                    }
                    p2Var.h(strQ4, strQ5, null, null, null, false, false, eVar3, null, null, (e23.a) objQ2, mVar24, 12582912, 6, 892);
                    String strQ6 = y.Q(mVar24, R.string.lbl_komoot_share_item_title);
                    String strQ7 = y.Q(mVar24, R.string.lbl_komoot_share_item_subtitle);
                    z3.e eVar4 = q31.b.f142408d;
                    Object objQ3 = mVar24.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new pk0.m(24);
                        mVar24.K(objQ3);
                    }
                    p2Var.h(strQ6, strQ7, null, null, null, false, false, eVar4, null, null, (e23.a) objQ3, mVar24, 12582912, 6, 892);
                    mVar24.y();
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 25:
                return a(obj, obj2, obj3);
            case 26:
                return b(obj, obj2, obj3);
            case 27:
                return c(obj, obj2, obj3);
            case 28:
                return d(obj, obj2, obj3);
            default:
                p3.m mVar25 = (p3.m) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                qb0.a aVar10 = qb0.a.f143954a;
                ((a0) obj).getClass();
                if (mVar25.n(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    x1 x1Var26 = n.f135158a;
                    String strQ8 = y.Q(mVar25, R.string.msg_sync_device);
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC2 = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar25);
                    d6.h.f57752b.getClass();
                    mh.c(strQ8, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar25, 0, 0, 130044);
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
        }
    }
}
