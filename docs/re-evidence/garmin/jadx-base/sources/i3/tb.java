package i3;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.proto.generated.WifiSetup;
import java.text.DecimalFormat;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tb implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f89787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f89788c;

    public /* synthetic */ tb(Object obj, boolean z14, int i14) {
        this.f89786a = i14;
        this.f89788c = obj;
        this.f89787b = z14;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x004e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v19, types: [com.garmin.android.apps.connectmobile.performance.stats.improvement.c] */
    /* JADX WARN: Type inference failed for: r14v9, types: [h82.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v9, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r19v10, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r19v11, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r1v47, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r20v8, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v36, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v37, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v44, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v45, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v53, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strI;
        ?? r14;
        ?? r15;
        float f14;
        int i14 = this.f89786a;
        int i15 = 14;
        boolean z14 = this.f89787b;
        Object obj4 = this.f89788c;
        switch (i14) {
            case 0:
                f5.v1 v1VarQ = ((f5.y0) obj2).Q(((g6.a) obj3).f75988a);
                return f5.b1.h0((f5.b1) obj, v1VarQ.f69144a, v1VarQ.f69145b, new ad0.f((p3.x3) obj4, z14, v1VarQ, 10));
            case 1:
                int i16 = ((rl1.h) obj4).f153419e;
                c2.t tVar = (c2.t) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(tVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC = tVar.c(aVar, h4.d.a.f81528f);
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    p3.i2 i2VarX = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    p3.b4.c(h5.g.a.f81810g, zVarA, mVar);
                    p3.b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    p3.b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    b10.c cVar = new b10.c(w2.a0.s(mVar));
                    int i17 = i16 * 60;
                    if (i17 > 0) {
                        o13.p pVar = i17 < 3600 ? new o13.p(Integer.valueOf(i17 / 60), 0) : new o13.p(Integer.valueOf((i17 % DateTimeConstants.SECONDS_PER_HOUR) / 60), Integer.valueOf(i17 / DateTimeConstants.SECONDS_PER_HOUR));
                        int iIntValue2 = ((Number) pVar.f128594a).intValue();
                        int iIntValue3 = ((Number) pVar.f128595b).intValue();
                        StringBuilder sb3 = new StringBuilder(15);
                        u00.a aVar3 = cVar.f14213c;
                        if (iIntValue3 > 0) {
                            sb3.append(iIntValue3);
                            sb3.append(aVar3.f167336a.getString(R.string.sleep_my_day_hour_unit));
                            sb3.append(StringUtils.SPACE);
                        }
                        sb3.append(iIntValue2);
                        sb3.append(aVar3.g());
                        strI = hb.a.i(sb3.toString());
                    } else {
                        strI = cVar.f14212b;
                    }
                    String str = strI;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarA = g02.q1.a(d92.c.b(j92.f.f97928e, mVar), 1.0f, mVar);
                    h4.g.a aVar4 = h4.d.a.f81537o;
                    h4.r rVarB = b0Var.b(aVar, aVar4);
                    float f15 = 11;
                    g6.f.a aVar5 = g6.f.f75994b;
                    float f16 = 8;
                    mh.c(str, c2.l.C(rVarB, f16, f15, f16, 0.0f, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, mVar, 0, 0, 131068);
                    mh.c(gl1.y.Q(mVar, R.string.lbl_total_sleep), c2.l.C(b0Var.b(aVar, aVar4), 0.0f, 0.0f, 0.0f, f15, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar), mVar, 0, 0, 131068);
                    if (!z14 || i16 < 480) {
                        mVar.C(1325590051);
                        mVar.f();
                    } else {
                        mVar.C(1325192600);
                        i7.a(n5.c.a(R.drawable.check, mVar, 0), null, c2.x2.q(b0Var.b(aVar, aVar4), 24), d92.b.a(mVar).f().e(), mVar, 48, 0);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                GeoPointDTO geoPointDTO = (GeoPointDTO) obj4;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c2.t2) obj).getClass();
                if (mVar2.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                    d6.h.f57752b.getClass();
                    int i18 = d6.h.f57757g;
                    c22.l3.a aVar6 = c22.l3.f23124b;
                    Context context = (Context) mVar2.A(c.n.f22332a);
                    Double d14 = geoPointDTO.distance;
                    double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                    c22.m3 m3Var = z14 ? c22.m3.KILOMETER : c22.m3.MILE;
                    DecimalFormat decimalFormat = c22.l3.f23129g;
                    aVar6.getClass();
                    String strO = c22.l3.a.O(context, dDoubleValue, m3Var, decimalFormat, true);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strO, rVarF, 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 48, 0, 130044);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                WifiSetup.StatusType statusType = (WifiSetup.StatusType) obj4;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar3.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    if (z14) {
                        mVar3.C(299725849);
                        boolean z15 = statusType == WifiSetup.StatusType.ConnectionSuccess;
                        s62.a.f157643a.getClass();
                        sa0.m.a(null, z15, v62.ia.a(t62.b.f162798a), mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(299927938);
                        if (statusType == WifiSetup.StatusType.ConnectionSuccess) {
                            mVar3.C(300002586);
                            s62.a.f157643a.getClass();
                            sa0.m.a(null, true, v62.e1.a(t62.b.f162798a), mVar3, 48);
                            mVar3.f();
                        } else {
                            mVar3.C(300159229);
                            mVar3.f();
                        }
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                rz1.h hVar = (rz1.h) obj4;
                h4.r rVar = (h4.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                rVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar4.B(rVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    if (z14) {
                        mVar4.C(-1225577764);
                        tz1.e.c(rVar, mVar4, iIntValue6 & 14);
                        mVar4.f();
                    } else {
                        mVar4.C(-1225499272);
                        tz1.e.a(rVar, hVar, mVar4, iIntValue6 & 14);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                ?? r16 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.c) obj4;
                ?? r17 = (h82.r) obj;
                ?? r18 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar7 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                r17.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= r18.B(r17) ? 4 : 2;
                }
                if (r18.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    r17.D(R.string.gcm_training_status_about_header_1, r18, (iIntValue7 << 3) & 112);
                    if (z14) {
                        r18.C(-402210844);
                        r17.o(R.string.gcm_training_status_about_help_description, (iIntValue7 << 6) & 896, 2, null, r18);
                        r18.f();
                        r14 = r18;
                    } else {
                        r18.C(-402111737);
                        r17.o(R.string.gcm_training_status_about_description_1, (iIntValue7 << 6) & 896, 2, null, r18);
                        ?? r19 = r18;
                        r19.f();
                        r14 = r19;
                    }
                    g6.f.a aVar8 = g6.f.f75994b;
                    h4.r rVarC3 = c2.l.C(h4.r.S, 0.0f, 8, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, r14, 0);
                    int iHashCode2 = Long.hashCode(r14.getU());
                    p3.i2 i2VarX2 = r14.x();
                    h4.r rVarC4 = h4.k.c(rVarC3, r14);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (r14.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    r14.z();
                    if (r14.getT()) {
                        r14.M(aVar9);
                    } else {
                        r14.c();
                    }
                    p3.b4.c(h5.g.a.f81810g, zVarA2, r14);
                    p3.b4.c(h5.g.a.f81809f, i2VarX2, r14);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (r14.getT() || !p005kotlin.jvm.internal.s.g(r14.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, r14, iHashCode2, bVar2);
                    }
                    p3.b4.c(h5.g.a.f81807d, rVarC4, r14);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    if (r16.f40124g || r16.f40125h) {
                        r14.C(288252437);
                        f02.e0.f67731a.getClass();
                        gl.c cVar2 = gl.c.f77766a;
                        cVar2.getClass();
                        ?? r110 = r14;
                        r16.k(R.string.aerobic_overreaching, gl.c.a(r14).l(), false, r110, 0, 4);
                        cVar2.getClass();
                        r16.k(R.string.lbl_peaking, gl.c.a(r110).j(), false, r110, 0, 4);
                        cVar2.getClass();
                        r16.k(R.string.lbl_productive, gl.c.a(r110).d(), false, r110, 0, 4);
                        cVar2.getClass();
                        r16.k(R.string.lbl_maintaining, gl.c.a(r110).r(), false, r110, 0, 4);
                        r16.k(R.string.activities_training_effect_recovery, fb1.c.i(cVar2, r110), false, r110, 0, 4);
                        if (z14) {
                            r110.C(288812204);
                            cVar2.getClass();
                            r16.k(R.string.lbl_strained, gl.c.a(r110).p(), false, r110, 0, 4);
                            r110.f();
                        } else {
                            r110.C(288935212);
                            r110.f();
                        }
                        cVar2.getClass();
                        r16.k(R.string.lbl_unproductive, gl.c.a(r110).h(), false, r110, 0, 4);
                        cVar2.getClass();
                        r16.k(R.string.lbl_detraining, gl.c.a(r110).g(), false, r110, 0, 4);
                        cVar2.getClass();
                        r16.k(R.string.lbl_no_status, gl.c.a(r110).g(), false, r110, 0, 4);
                        ?? r24 = r110;
                        if (zb0.n0.h()) {
                            r24.C(289327238);
                            r16.k(R.string.common_paused, f02.e0.a(r24), false, r24, 384, 0);
                            r24.f();
                        } else {
                            r24.C(289456012);
                            r24.f();
                        }
                        r24.f();
                        r15 = r24;
                    } else {
                        r14.C(289569503);
                        f02.e0.f67731a.getClass();
                        gl.c cVar3 = gl.c.f77766a;
                        cVar3.getClass();
                        ?? r25 = r14;
                        r16.l(R.string.aerobic_overreaching, R.string.training_status_overreaching_help_text, 0, 8, gl.c.a(r14).l(), r25, false);
                        cVar3.getClass();
                        r16.l(R.string.lbl_peaking, R.string.training_status_peaking_help_text, 0, 8, gl.c.a(r25).j(), r25, false);
                        cVar3.getClass();
                        r16.l(R.string.lbl_productive, R.string.training_status_productive_help_text, 0, 8, gl.c.a(r25).d(), r25, false);
                        cVar3.getClass();
                        r16.l(R.string.lbl_maintaining, R.string.training_status_maintaining_help_text, 0, 8, gl.c.a(r25).r(), r25, false);
                        r16.l(R.string.activities_training_effect_recovery, R.string.training_status_recovery_help_text, 0, 8, fb1.c.i(cVar3, r25), r25, false);
                        if (z14) {
                            r25.C(290860870);
                            cVar3.getClass();
                            r16.l(R.string.lbl_strained, R.string.training_status_strained_desc, 0, 8, gl.c.a(r25).p(), r25, false);
                            r25.f();
                        } else {
                            r25.C(291143404);
                            r25.f();
                        }
                        cVar3.getClass();
                        r16.l(R.string.lbl_unproductive, R.string.training_status_unproductive_help_text, 0, 8, gl.c.a(r25).h(), r25, false);
                        cVar3.getClass();
                        r16.l(R.string.lbl_detraining, R.string.training_status_detraining_help_text, 0, 8, gl.c.a(r25).g(), r25, false);
                        cVar3.getClass();
                        r16.l(R.string.lbl_no_status, R.string.training_status_no_status_help_text, 0, 8, gl.c.a(r25).g(), r25, false);
                        ?? r26 = r25;
                        if (zb0.n0.h()) {
                            r26.C(292009885);
                            r16.l(R.string.common_paused, R.string.gcm_training_status_paused_help_desc, 3072, 0, f02.e0.a(r26), r26, false);
                            r26.f();
                        } else {
                            r26.C(292331820);
                            r26.f();
                        }
                        r26.f();
                        r15 = r26;
                    }
                    r15.y();
                    if (z14) {
                        r15.C(-397654557);
                        r17.o(R.string.gcm_training_status_about_help_description2, (iIntValue7 << 6) & 896, 2, null, r15);
                        r15.f();
                    } else {
                        r15.C(-397554489);
                        ?? r111 = r15;
                        r17.o(R.string.gcm_training_status_about_description_2, (iIntValue7 << 6) & 896, 2, null, r111);
                        r111.f();
                    }
                } else {
                    r18.e();
                }
                return Unit.INSTANCE;
            case 6:
                j02.j jVar = (j02.j) obj4;
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                v.h.y(1553417634, rVar2, (Integer) obj3, mVar5);
                p3.x1 x1Var6 = p3.n.f135158a;
                if (z14) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97918c;
                } else {
                    f14 = 0;
                    g6.f.a aVar10 = g6.f.f75994b;
                }
                l4.w.a(rVar2, ((g6.f) s1.f.a(f14, null, "", mVar5, 384, 10).getF182175a()).f75997a, null, false, 30);
                h4.r rVarA = jVar.a(rVar2, (View) mVar5.A(AndroidCompositionLocals_androidKt.f6046f), new ig2.d(29), new ik2.b(23));
                mVar5.f();
                return rVarA;
            default:
                e23.l lVar = (e23.l) obj4;
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                v.h.y(-898951427, rVar3, (Integer) obj3, mVar6);
                p3.x1 x1Var7 = p3.n.f135158a;
                p5.l.f136032b.getClass();
                p5.l lVarA = p5.l.a(p5.l.f136033c);
                boolean zB = mVar6.B(lVar);
                Object objQ = mVar6.q();
                if (zB) {
                    objQ = new wr1.d(lVar, i15);
                    mVar6.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new wr1.d(lVar, i15);
                        mVar6.K(objQ);
                    }
                }
                h4.r rVarB2 = j2.g.b(rVar3, this.f89787b, false, lVarA, (e23.l) objQ, 10);
                mVar6.f();
                return rVarB2;
        }
    }

    public /* synthetic */ tb(boolean z14, Object obj, int i14) {
        this.f89786a = i14;
        this.f89787b = z14;
        this.f89788c = obj;
    }
}
