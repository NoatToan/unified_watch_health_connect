package ww;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.l;
import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h82.r;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import wb1.i;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f187496b;

    public /* synthetic */ b(f fVar, int i14) {
        this.f187495a = i14;
        this.f187496b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:175:0x041d  */
    /* JADX WARN: Code duplicated, block: B:197:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:21:0x009e  */
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
        Object obj4;
        r rVar;
        Object obj5;
        Object obj6;
        Object obj7;
        int i14 = this.f187495a;
        m.a aVar = m.f135153a;
        final int i15 = 3;
        final int i16 = 2;
        final f fVar = this.f187496b;
        boolean z14 = false;
        final int i17 = 1;
        switch (i14) {
            case 0:
                r rVar2 = (r) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                f.a aVar2 = f.f187506i;
                rVar2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar2) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    int i18 = (iIntValue << 3) & 112;
                    rVar2.D(R.string.lbl_blood_pressure_in_gc, mVar, i18);
                    int i19 = (iIntValue << 6) & 896;
                    rVar2.l(R.string.lbl_blood_pressure_about_readings, i19, 2, null, mVar);
                    rVar2.o(R.string.lbl_blood_pressure_add_reading_options, i19, 2, null, mVar);
                    rVar2.o(R.string.lbl_blood_pressure_about_reports, i19, 2, null, mVar);
                    rVar2.t(R.string.lbl_receiving_accurate_results, mVar, i18);
                    rVar2.o(R.string.lbl_blood_pressure_why_measurements_vary, i19, 2, null, mVar);
                    rVar2.g(z3.f.c(-1435555851, new wd0.a(rVar2, 2), mVar), mVar, i18 | 6);
                    rVar2.o(R.string.lbl_blood_pressure_health_related_info, i19, 2, null, mVar);
                    final Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                    boolean zR = mVar.r(fVar) | mVar.r(context);
                    Object objQ = mVar.q();
                    if (zR) {
                        obj4 = objQ;
                        Object obj8 = new e23.a() { // from class: ww.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i17;
                                Context context2 = context;
                                f fVar2 = fVar;
                                switch (i24) {
                                    case 0:
                                        f.a aVar3 = f.f187506i;
                                        h82.c.f(fVar2, context2, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/five-simple-steps-to-control-your-blood-pressure");
                                        break;
                                    case 1:
                                        f.a aVar4 = f.f187506i;
                                        h82.c.f(fVar2, context2, "https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings/monitoring-your-blood-pressure-at-home");
                                        break;
                                    case 2:
                                        kw.m mVar2 = fVar2.f187507f;
                                        h82.c.f(fVar2, context2, mVar2 != null ? mVar2.f106885i : null);
                                        break;
                                    default:
                                        kw.m mVar3 = fVar2.f187507f;
                                        h82.c.f(fVar2, context2, mVar3 != null ? mVar3.f106887k : null);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(obj8);
                        obj4 = obj8;
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            obj4 = objQ;
                            Object obj9 = new e23.a() { // from class: ww.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i17;
                                    Context context2 = context;
                                    f fVar2 = fVar;
                                    switch (i24) {
                                        case 0:
                                            f.a aVar3 = f.f187506i;
                                            h82.c.f(fVar2, context2, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/five-simple-steps-to-control-your-blood-pressure");
                                            break;
                                        case 1:
                                            f.a aVar4 = f.f187506i;
                                            h82.c.f(fVar2, context2, "https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings/monitoring-your-blood-pressure-at-home");
                                            break;
                                        case 2:
                                            kw.m mVar2 = fVar2.f187507f;
                                            h82.c.f(fVar2, context2, mVar2 != null ? mVar2.f106885i : null);
                                            break;
                                        default:
                                            kw.m mVar3 = fVar2.f187507f;
                                            h82.c.f(fVar2, context2, mVar3 != null ? mVar3.f106887k : null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(obj9);
                            obj4 = obj9;
                        }
                    }
                    obj4 = objQ;
                    rVar2.i((e23.a) obj4, R.string.citation_american_heart_association, mVar, i19);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                r rVar3 = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                f.a aVar3 = f.f187506i;
                rVar3.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar3) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i24 = (iIntValue2 << 3) & 112;
                    rVar3.D(R.string.lbl_your_blood_pressure_reading, mVar2, i24);
                    final Context context2 = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    if (fVar.f187509h != null) {
                        mVar2.C(-230701961);
                        r rVar4 = rVar3;
                        rVar4.m((iIntValue2 << 6) & 896, 0, fVar.q(context2, fVar.f187509h, fVar.f187508g, false), fVar.q(context2, fVar.f187509h, fVar.f187508g, true), mVar2);
                        mVar2.f();
                        rVar = rVar4;
                    } else {
                        rVar = rVar3;
                        mVar2.C(-230379065);
                        mVar2.f();
                    }
                    kw.m mVar3 = fVar.f187507f;
                    String str = mVar3 != null ? mVar3.f106880d : null;
                    if (str == null) {
                        mVar2.C(-230330923);
                        mVar2.f();
                    } else {
                        mVar2.C(-230330922);
                        rVar.q(str, mVar2, i24);
                        mVar2.f();
                    }
                    g6.f.a aVar4 = g6.f.f75994b;
                    l.f(x2.k(h4.r.S, 16), mVar2);
                    fVar.j(null, z3.f.c(813795170, new b(fVar, i16), mVar2), mVar2, 48);
                    kw.m mVar4 = fVar.f187507f;
                    Map<kw.b, kw.f> map = mVar4 != null ? mVar4.f106878b : null;
                    if (map == null) {
                        mVar2.C(-229416175);
                        mVar2.f();
                    } else {
                        mVar2.C(-229416174);
                        Iterator<Map.Entry<kw.b, kw.f>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            fVar.o(null, z3.f.c(-1111495546, new vv0.e(16, fVar, it.next()), mVar2), mVar2, 48);
                        }
                        mVar2.f();
                    }
                    kw.m mVar5 = fVar.f187507f;
                    String str2 = mVar5 != null ? mVar5.f106881e : null;
                    if (str2 == null) {
                        mVar2.C(-228885579);
                        mVar2.f();
                    } else {
                        mVar2.C(-228885578);
                        rVar.q(str2, mVar2, i24);
                        mVar2.f();
                    }
                    kw.m mVar6 = fVar.f187507f;
                    String str3 = mVar6 != null ? mVar6.f106882f : null;
                    if (str3 == null) {
                        mVar2.C(-228790347);
                        mVar2.f();
                    } else {
                        mVar2.C(-228790346);
                        rVar.q(str3, mVar2, i24);
                        mVar2.f();
                    }
                    kw.m mVar7 = fVar.f187507f;
                    String str4 = mVar7 != null ? mVar7.f106883g : null;
                    if (str4 == null) {
                        mVar2.C(-228694123);
                        mVar2.f();
                    } else {
                        mVar2.C(-228694122);
                        rVar.q(str4, mVar2, i24);
                        mVar2.f();
                    }
                    kw.m mVar8 = fVar.f187507f;
                    Integer numValueOf = mVar8 != null ? Integer.valueOf(mVar8.f106884h) : null;
                    if (numValueOf == null) {
                        mVar2.C(-228595667);
                        mVar2.f();
                    } else {
                        mVar2.C(-228595666);
                        int iIntValue3 = numValueOf.intValue();
                        boolean zR2 = mVar2.r(fVar) | mVar2.r(context2);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            obj5 = objQ2;
                            Object obj10 = new e23.a() { // from class: ww.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i25 = i16;
                                    Context context3 = context2;
                                    f fVar2 = fVar;
                                    switch (i25) {
                                        case 0:
                                            f.a aVar5 = f.f187506i;
                                            h82.c.f(fVar2, context3, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/five-simple-steps-to-control-your-blood-pressure");
                                            break;
                                        case 1:
                                            f.a aVar6 = f.f187506i;
                                            h82.c.f(fVar2, context3, "https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings/monitoring-your-blood-pressure-at-home");
                                            break;
                                        case 2:
                                            kw.m mVar9 = fVar2.f187507f;
                                            h82.c.f(fVar2, context3, mVar9 != null ? mVar9.f106885i : null);
                                            break;
                                        default:
                                            kw.m mVar10 = fVar2.f187507f;
                                            h82.c.f(fVar2, context3, mVar10 != null ? mVar10.f106887k : null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(obj10);
                            obj5 = obj10;
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                obj5 = objQ2;
                                Object obj11 = new e23.a() { // from class: ww.c
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i25 = i16;
                                        Context context3 = context2;
                                        f fVar2 = fVar;
                                        switch (i25) {
                                            case 0:
                                                f.a aVar5 = f.f187506i;
                                                h82.c.f(fVar2, context3, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/five-simple-steps-to-control-your-blood-pressure");
                                                break;
                                            case 1:
                                                f.a aVar6 = f.f187506i;
                                                h82.c.f(fVar2, context3, "https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings/monitoring-your-blood-pressure-at-home");
                                                break;
                                            case 2:
                                                kw.m mVar9 = fVar2.f187507f;
                                                h82.c.f(fVar2, context3, mVar9 != null ? mVar9.f106885i : null);
                                                break;
                                            default:
                                                kw.m mVar10 = fVar2.f187507f;
                                                h82.c.f(fVar2, context3, mVar10 != null ? mVar10.f106887k : null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(obj11);
                                obj5 = obj11;
                            }
                        }
                        obj5 = objQ2;
                        rVar.i((e23.a) obj5, iIntValue3, mVar2, (iIntValue2 << 6) & 896);
                        mVar2.f();
                    }
                    kw.m mVar9 = fVar.f187507f;
                    Integer num = mVar9 != null ? mVar9.f106886j : null;
                    if (num == null) {
                        mVar2.C(-228395593);
                        mVar2.f();
                    } else {
                        mVar2.C(-228395592);
                        String strQ = y.Q(mVar2, num.intValue());
                        boolean zR3 = mVar2.r(fVar) | mVar2.r(context2);
                        Object objQ3 = mVar2.q();
                        if (zR3) {
                            obj6 = objQ3;
                            Object obj12 = new e23.a() { // from class: ww.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i25 = i15;
                                    Context context3 = context2;
                                    f fVar2 = fVar;
                                    switch (i25) {
                                        case 0:
                                            f.a aVar5 = f.f187506i;
                                            h82.c.f(fVar2, context3, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/five-simple-steps-to-control-your-blood-pressure");
                                            break;
                                        case 1:
                                            f.a aVar6 = f.f187506i;
                                            h82.c.f(fVar2, context3, "https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings/monitoring-your-blood-pressure-at-home");
                                            break;
                                        case 2:
                                            kw.m mVar10 = fVar2.f187507f;
                                            h82.c.f(fVar2, context3, mVar10 != null ? mVar10.f106885i : null);
                                            break;
                                        default:
                                            kw.m mVar11 = fVar2.f187507f;
                                            h82.c.f(fVar2, context3, mVar11 != null ? mVar11.f106887k : null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(obj12);
                            obj6 = obj12;
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                obj6 = objQ3;
                                Object obj13 = new e23.a() { // from class: ww.c
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i25 = i15;
                                        Context context3 = context2;
                                        f fVar2 = fVar;
                                        switch (i25) {
                                            case 0:
                                                f.a aVar5 = f.f187506i;
                                                h82.c.f(fVar2, context3, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/five-simple-steps-to-control-your-blood-pressure");
                                                break;
                                            case 1:
                                                f.a aVar6 = f.f187506i;
                                                h82.c.f(fVar2, context3, "https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings/monitoring-your-blood-pressure-at-home");
                                                break;
                                            case 2:
                                                kw.m mVar10 = fVar2.f187507f;
                                                h82.c.f(fVar2, context3, mVar10 != null ? mVar10.f106885i : null);
                                                break;
                                            default:
                                                kw.m mVar11 = fVar2.f187507f;
                                                h82.c.f(fVar2, context3, mVar11 != null ? mVar11.f106887k : null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(obj13);
                                obj6 = obj13;
                            }
                        }
                        obj6 = objQ3;
                        rVar.h((iIntValue2 << 6) & 896, (e23.a) obj6, strQ, mVar2);
                        mVar2.f();
                    }
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                t2 t2Var = (t2) obj;
                m mVar10 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                f.a aVar5 = f.f187506i;
                t2Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar10.B(t2Var) ? 4 : 2;
                }
                if (mVar10.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    String strQ2 = y.Q(mVar10, R.string.lbl_category);
                    int i25 = (iIntValue4 & 14) | 24576;
                    f fVar2 = this.f187496b;
                    fVar2.i(t2Var, strQ2, null, null, 0.35f, null, mVar10, i25, 22);
                    fVar2.i(t2Var, y.Q(mVar10, R.string.lbl_blood_pressure_systolic), null, y.Q(mVar10, R.string.lbl_blood_pressure_uom), 0.25f, null, mVar10, i25, 18);
                    fVar2.i(t2Var, y.Q(mVar10, R.string.image_content_description), null, null, 0.15f, null, mVar10, i25, 22);
                    fVar2.i(t2Var, y.Q(mVar10, R.string.lbl_blood_pressure_diastolic), null, y.Q(mVar10, R.string.lbl_blood_pressure_uom), 0.25f, null, mVar10, i25, 18);
                } else {
                    mVar10.e();
                }
                break;
            case 3:
                m mVar11 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                f.a aVar6 = f.f187506i;
                if (mVar11.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    fVar.n(mVar11, 0);
                } else {
                    mVar11.e();
                }
                break;
            case 4:
                m mVar12 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                f.a aVar7 = f.f187506i;
                if (mVar12.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    fVar.g(mVar12, 0);
                } else {
                    mVar12.e();
                }
                break;
            case 5:
                m mVar13 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                f.a aVar8 = f.f187506i;
                if (mVar13.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = n.f135158a;
                    fVar.k(mVar13, 0);
                } else {
                    mVar13.e();
                }
                break;
            case 6:
                m mVar14 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                f.a aVar9 = f.f187506i;
                if (mVar14.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = n.f135158a;
                    fVar.p(mVar14, 0);
                } else {
                    mVar14.e();
                }
                break;
            case 7:
                r rVar5 = (r) obj;
                m mVar15 = (m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                f.a aVar10 = f.f187506i;
                rVar5.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar15.B(rVar5) ? 4 : 2;
                }
                if (mVar15.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var9 = n.f135158a;
                    int i26 = ((iIntValue9 << 3) & 112) | 6;
                    rVar5.k(z3.f.c(-379426644, new wd0.a(rVar5, 3), mVar15), mVar15, i26);
                    rVar5.a(z3.f.c(-784987883, new i(13, rVar5, fVar), mVar15), mVar15, i26);
                } else {
                    mVar15.e();
                }
                break;
            default:
                r rVar6 = (r) obj;
                m mVar16 = (m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                f.a aVar11 = f.f187506i;
                rVar6.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar16.B(rVar6) ? 4 : 2;
                }
                if (mVar16.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var10 = n.f135158a;
                    int i27 = (iIntValue10 << 3) & 112;
                    rVar6.D(R.string.lbl_blood_pressure_usage, mVar16, i27);
                    int i28 = (iIntValue10 << 6) & 896;
                    rVar6.l(R.string.lbl_blood_pressure_usage_description, i28, 2, null, mVar16);
                    rVar6.o(R.string.lbl_blood_pressure_american_heart_association_general_recommendation, i28, 2, null, mVar16);
                    rVar6.g(z3.f.c(113522223, new wd0.a(rVar6, 1), mVar16), mVar16, i27 | 6);
                    rVar6.o(R.string.lbl_blood_pressure_consult_health_provider, i28, 2, null, mVar16);
                    final Context context3 = (Context) mVar16.A(AndroidCompositionLocals_androidKt.f6042b);
                    boolean zR4 = mVar16.r(fVar) | mVar16.r(context3);
                    Object objQ4 = mVar16.q();
                    if (zR4) {
                        obj7 = objQ4;
                        final int i29 = z14 ? 1 : 0;
                        Object obj14 = new e23.a() { // from class: ww.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i29;
                                Context context4 = context3;
                                f fVar3 = fVar;
                                switch (i210) {
                                    case 0:
                                        f.a aVar12 = f.f187506i;
                                        h82.c.f(fVar3, context4, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/five-simple-steps-to-control-your-blood-pressure");
                                        break;
                                    case 1:
                                        f.a aVar13 = f.f187506i;
                                        h82.c.f(fVar3, context4, "https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings/monitoring-your-blood-pressure-at-home");
                                        break;
                                    case 2:
                                        kw.m mVar17 = fVar3.f187507f;
                                        h82.c.f(fVar3, context4, mVar17 != null ? mVar17.f106885i : null);
                                        break;
                                    default:
                                        kw.m mVar18 = fVar3.f187507f;
                                        h82.c.f(fVar3, context4, mVar18 != null ? mVar18.f106887k : null);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar16.K(obj14);
                        obj7 = obj14;
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            obj7 = objQ4;
                            final int i210 = z14 ? 1 : 0;
                            Object obj15 = new e23.a() { // from class: ww.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i211 = i210;
                                    Context context4 = context3;
                                    f fVar3 = fVar;
                                    switch (i211) {
                                        case 0:
                                            f.a aVar12 = f.f187506i;
                                            h82.c.f(fVar3, context4, "https://www.heart.org/en/health-topics/high-blood-pressure/the-facts-about-high-blood-pressure/five-simple-steps-to-control-your-blood-pressure");
                                            break;
                                        case 1:
                                            f.a aVar13 = f.f187506i;
                                            h82.c.f(fVar3, context4, "https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings/monitoring-your-blood-pressure-at-home");
                                            break;
                                        case 2:
                                            kw.m mVar17 = fVar3.f187507f;
                                            h82.c.f(fVar3, context4, mVar17 != null ? mVar17.f106885i : null);
                                            break;
                                        default:
                                            kw.m mVar18 = fVar3.f187507f;
                                            h82.c.f(fVar3, context4, mVar18 != null ? mVar18.f106887k : null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar16.K(obj15);
                            obj7 = obj15;
                        }
                    }
                    obj7 = objQ4;
                    rVar6.i((e23.a) obj7, R.string.citation_american_heart_association, mVar16, i28);
                } else {
                    mVar16.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
