package vr1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import f02.b0;
import gl1.y;
import h4.r;
import java.util.List;
import l72.u1;
import o13.p;
import o4.d0;
import p005kotlin.Unit;
import p13.x;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.stress.presentation.view.a f179488b;

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar, int i14) {
        this.f179487a = i14;
        this.f179488b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0381  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r18v0, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r1v2, types: [h82.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [h82.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r5v5, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r9v11, types: [h82.r, java.lang.Object] */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        r rVarZ;
        int i14 = this.f179487a;
        int i15 = 0;
        com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar = this.f179488b;
        switch (i14) {
            case 0:
                ?? r14 = (h82.r) obj;
                ?? r15 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                r14.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= r15.B(r14) ? 4 : 2;
                }
                if (r15.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    int i16 = (iIntValue << 3) & 112;
                    r14.D(R.string.stress_data_accuracy_help_title, r15, i16);
                    r14.q(y.Q(r15, R.string.stress_data_accuracy_help_description_1), r15, i16);
                    Context context = (Context) r15.A(AndroidCompositionLocals_androidKt.f6042b);
                    String strP = y.P(R.string.stress_data_accuracy_help_description_2, new Object[]{am.j.m("<link>", y.Q(r15, R.string.activities_firstbeat), "</link>")}, r15);
                    boolean zR = r15.r(aVar) | r15.r(context);
                    Object objQ = r15.q();
                    if (zR) {
                        obj4 = objQ;
                        ug2.h hVar = new ug2.h(29, aVar, context);
                        r15.K(hVar);
                        obj4 = hVar;
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj4 = objQ;
                            ug2.h hVar2 = new ug2.h(29, aVar, context);
                            r15.K(hVar2);
                            obj4 = hVar2;
                        }
                    }
                    obj4 = objQ;
                    r14.w(strP, null, (e23.a) obj4, r15, (iIntValue << 9) & 7168, 2);
                } else {
                    r15.e();
                }
                return Unit.INSTANCE;
            case 1:
                ?? r16 = (h82.r) obj;
                ?? r17 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a2 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                r16.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= r17.B(r16) ? 4 : 2;
                }
                if (r17.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i17 = ((iIntValue2 << 3) & 112) | 6;
                    r16.k(z3.f.c(84378975, new t12.a(r16, 28), r17), r17, i17);
                    r16.a(z3.f.c(1811324424, new vq0.a(1, r16, aVar), r17), r17, i17);
                } else {
                    r17.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a3 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                if (mVar.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    aVar.i(mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a4 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                if (mVar2.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    aVar.g(mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a5 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                if (mVar3.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    aVar.h(mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a6 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                if (mVar4.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    aVar.k(mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a7 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                if (mVar5.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    aVar.j(mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            default:
                ?? r18 = (h82.r) obj;
                ?? r19 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a8 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                Float fValueOf = Float.valueOf(0.5f);
                r18.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= r19.B(r18) ? 4 : 2;
                }
                if (r19.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var8 = p3.n.f135158a;
                    r18.D(R.string.lbl_understanding_your_reading, r19, (iIntValue8 << 3) & 112);
                    if (aVar.f45027g == null || aVar.f45028h == null) {
                        r19.C(-1323372570);
                        r19.f();
                    } else {
                        r19.C(-1323514798);
                        String str = aVar.f45027g;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = aVar.f45028h;
                        r18.m((iIntValue8 << 6) & 896, 2, y.P(R.string.stress_help_levels_description_1, new Object[]{str, str2 != null ? str2 : ""}, r19), null, r19);
                        r19.f();
                    }
                    int i18 = (iIntValue8 << 6) & 896;
                    r18.o(R.string.stress_help_levels_description_2, i18, 2, null, r19);
                    r18.o(R.string.stress_help_levels_description_3, i18, 2, null, r19);
                    b0.f67725a.getClass();
                    gl.c cVar = gl.c.f77766a;
                    cVar.getClass();
                    p pVar = new p(d0.a(gl.c.a(r19).b()), x.k(y.Q(r19, R.string.stress_level_rest), y.P(R.string.string_short_dash_line_string_pattern, new Object[]{"0", "25"}, r19)));
                    cVar.getClass();
                    gl.e eVar = gl.c.f77767b;
                    p pVar2 = new p(d0.a(eVar.K), x.k(y.Q(r19, R.string.stress_level_low), y.P(R.string.string_short_dash_line_string_pattern, new Object[]{"26", "50"}, r19)));
                    cVar.getClass();
                    p pVar3 = new p(d0.a(eVar.N), x.k(y.Q(r19, R.string.stress_level_medium), y.P(R.string.string_short_dash_line_string_pattern, new Object[]{"51", "75"}, r19)));
                    cVar.getClass();
                    ?? r110 = r19;
                    for (Object obj5 : x.k(pVar, pVar2, pVar3, new p(d0.a(eVar.P), x.k(y.Q(r19, R.string.stress_level_high), y.P(R.string.string_short_dash_line_string_pattern, new Object[]{"76", "100"}, r19))))) {
                        int i19 = i15 + 1;
                        if (i15 < 0) {
                            x.q();
                            throw null;
                        }
                        p pVar4 = (p) obj5;
                        if (i15 == 0) {
                            g6.f.a aVar2 = g6.f.f75994b;
                            float f14 = 16;
                            rVarZ = c2.l.B(r.S, f14, 32, f14, 4);
                        } else {
                            g6.f.a aVar3 = g6.f.f75994b;
                            rVarZ = c2.l.z(r.S, 16, 4);
                        }
                        ?? r111 = r110;
                        u1.e(rVarZ, R.drawable.stress_table_circle_shape, ((d0) pVar4.f128594a).f128833a, 0.1f, (List) pVar4.f128595b, null, x.k(fValueOf, fValueOf), r111, 1575936, 32);
                        fValueOf = fValueOf;
                        i15 = i19;
                        r110 = r111;
                    }
                    x1 x1Var9 = p3.n.f135158a;
                } else {
                    r19.e();
                }
                return Unit.INSTANCE;
        }
    }
}
