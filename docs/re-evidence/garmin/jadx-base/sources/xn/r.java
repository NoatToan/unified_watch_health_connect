package xn;

import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.setup.CourseParametersActivity;
import com.garmin.android.apps.connectmobile.gcplus.presentation.dev.SubscriptionDevMenuActivity;
import com.garmin.android.apps.connectmobile.googlehealthconnect.data.database.GoogleHealthConnectDatabase_Impl;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingActivity;
import lc.u0;
import n70.l2;
import n70.n2;
import n70.o2;
import n70.r1;
import n70.s1;
import n70.v2;
import n70.w2;
import o53.s0;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p008y1.n1;
import r22.x1;
import r53.k2;
import r53.m1;
import r53.u1;
import ya0.c.b;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f191624b;

    public /* synthetic */ r(Object obj, int i14) {
        this.f191623a = i14;
        this.f191624b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:107:0x0205  */
    /* JADX WARN: Code duplicated, block: B:150:0x0360  */
    /* JADX WARN: Code duplicated, block: B:177:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:191:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:193:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:194:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bd  */
    @Override // e23.a
    public final Object invoke() throws Throwable {
        k30.k kVar;
        com.garmin.android.apps.connectmobile.courses.model.i iVar;
        w20.b bVar;
        Object serializable;
        Object serializable2;
        Object serializable3;
        Throwable th3;
        zf.a aVarA;
        float f14;
        float f15;
        tj.g.f0 f0Var;
        tj.g.f0 f0Var2;
        String str;
        hf.h fVar;
        float fMax;
        int i14 = this.f191623a;
        Object obj = this.f191624b;
        switch (i14) {
            case 0:
                int i15 = s.f191625f;
                ((s) obj).e("CALORIES_DURING_ACTIVITY");
                return Unit.INSTANCE;
            case 1:
                NewDeviceOnBoardingActivity newDeviceOnBoardingActivity = (NewDeviceOnBoardingActivity) obj;
                NewDeviceOnBoardingActivity.a aVar = NewDeviceOnBoardingActivity.f51700k;
                newDeviceOnBoardingActivity.setResult(13);
                newDeviceOnBoardingActivity.finish();
                return Unit.INSTANCE;
            case 2:
                return Integer.valueOf(((wg0.l) obj).d().size());
            case 3:
                oi2.a.f132270a.getClass();
                oi2.a.C2513a.c((xs.f.a) obj);
                return Unit.INSTANCE;
            case 4:
                return new x1(((xu1.b) obj).f192251a);
            case 5:
                return (n1.a) q53.m.b(((q53.i) obj).k());
            case 6:
                y2.s sVar = (y2.s) obj;
                sVar.f194173r = null;
                h5.k.g(sVar).U();
                h5.k.g(sVar).T();
                h5.t.a(sVar);
                return Boolean.TRUE;
            case 7:
                y2.v vVar = (y2.v) obj;
                vVar.f194199l = null;
                h5.k.g(vVar).U();
                h5.k.g(vVar).T();
                h5.t.a(vVar);
                return Boolean.TRUE;
            case 8:
                CourseParametersActivity courseParametersActivity = (CourseParametersActivity) obj;
                Bundle bundle = courseParametersActivity.f33103a;
                String string = bundle != null ? bundle.getString("GCM_extra_course_name") : null;
                Bundle bundle2 = courseParametersActivity.f33103a;
                if (bundle2 == null) {
                    kVar = k30.k.POPULARITY;
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable3 = bundle2.getSerializable("GCM_extra_course_routing_type", k30.k.class);
                    } else {
                        Object serializable4 = bundle2.getSerializable("GCM_extra_course_routing_type");
                        if (!(serializable4 instanceof k30.k)) {
                            serializable4 = null;
                        }
                        serializable3 = (k30.k) serializable4;
                    }
                    kVar = (k30.k) serializable3;
                    if (kVar == null) {
                        kVar = k30.k.POPULARITY;
                    }
                }
                k30.k kVar2 = kVar;
                Bundle bundle3 = courseParametersActivity.f33103a;
                boolean z14 = bundle3 != null ? bundle3.getBoolean("GCM_extra_course_avoid_high_traffic", false) : false;
                Bundle bundle4 = courseParametersActivity.f33103a;
                boolean z15 = bundle4 != null ? bundle4.getBoolean("GCM_extra_course_avoid_closed_roads", false) : false;
                Bundle bundle5 = courseParametersActivity.f33103a;
                boolean z16 = bundle5 != null ? bundle5.getBoolean("GCM_extra_course_avoid_unpaved_roads", false) : false;
                Bundle bundle6 = courseParametersActivity.f33103a;
                double d14 = bundle6 != null ? bundle6.getDouble("GCM_extra_course_distance", Double.NaN) : Double.NaN;
                Bundle bundle7 = courseParametersActivity.f33103a;
                if (bundle7 == null) {
                    iVar = com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable2 = bundle7.getSerializable("GCM_extra_course_type", com.garmin.android.apps.connectmobile.courses.model.i.class);
                    } else {
                        Object serializable5 = bundle7.getSerializable("GCM_extra_course_type");
                        if (!(serializable5 instanceof com.garmin.android.apps.connectmobile.courses.model.i)) {
                            serializable5 = null;
                        }
                        serializable2 = (com.garmin.android.apps.connectmobile.courses.model.i) serializable5;
                    }
                    iVar = (com.garmin.android.apps.connectmobile.courses.model.i) serializable2;
                    if (iVar == null) {
                        iVar = com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
                    }
                }
                Bundle bundle8 = courseParametersActivity.f33103a;
                if (bundle8 == null) {
                    w20.b.f181482c.getClass();
                    if (((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c()) {
                        bVar = w20.b.TAILWIND;
                    } else {
                        bVar = w20.b.NORTH;
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable = bundle8.getSerializable("GCM_extra_course_direction", w20.b.class);
                    } else {
                        Object serializable6 = bundle8.getSerializable("GCM_extra_course_direction");
                        if (!(serializable6 instanceof w20.b)) {
                            serializable6 = null;
                        }
                        serializable = (w20.b) serializable6;
                    }
                    bVar = (w20.b) serializable;
                    if (bVar == null) {
                        w20.b.f181482c.getClass();
                        if (((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c()) {
                            bVar = w20.b.TAILWIND;
                        } else {
                            bVar = w20.b.NORTH;
                        }
                    }
                }
                w20.b bVar2 = bVar;
                Bundle bundle9 = courseParametersActivity.f33103a;
                int i16 = bundle9 != null ? bundle9.getInt("GCM_create_course_flow", -1) : -1;
                Bundle bundle10 = courseParametersActivity.f33103a;
                return ParametersHolderKt.parametersOf(b60.a.a(courseParametersActivity, string, kVar2, z14, z15, z16, zf.b.D(Double.valueOf(d14)) ? Double.valueOf(d14) : null, iVar, bVar2, i16, bundle10 != null ? bundle10.getBoolean("GCM_reroute_flow", false) : false));
            case 9:
                y70.b bVar3 = (y70.b) obj;
                return new u1(new m1(bVar3.f194644a.f124518a.a(), new y70.b.a(bVar3, null)), bVar3.f194646c, new y70.b.C3625b(bVar3, null));
            case 10:
                r1 r1Var = (r1) obj;
                return r53.s.A(new u1(r1Var.f124524a.e(), r1Var.f124525b.J(), new s1(r1Var, null)), s0.f129406a);
            case 11:
                return ((l2) obj).f124385a.B();
            case 12:
                n2 n2Var = (n2) obj;
                s80.c cVar = n2Var.f124432a;
                return r53.s.A(new u1(cVar.getF157883f(), cVar.getF157885h(), new o2(n2Var, null)), s0.f129406a);
            case 13:
                w2 w2Var = (w2) obj;
                return r53.s.A(new v2(w2Var.f124707a.e(), w2Var), s0.f129406a);
            case 14:
                ya0.c cVar2 = (ya0.c) obj;
                p90.d dVar = cVar2.f195405b;
                q90.d.a aVar2 = cVar2.f195404a;
                dVar.getClass();
                aVar2.getClass();
                return r53.s.K(new ya0.c.C3638c(new r53.v(cVar2.new b(null), r53.s.f(new p90.e(aVar2, dVar, null))), cVar2), v1.a(cVar2), k2.a.a(k2.f150703a, 2), new q90.a.e(0.0f, aVar2.f143506b, false, false, false, null, null, 124, null));
            case 15:
                ya0.d dVar2 = (ya0.d) obj;
                p90.i iVar2 = dVar2.f195421b;
                q90.d.b bVar4 = dVar2.f195420a;
                iVar2.getClass();
                bVar4.getClass();
                return r53.s.K(r53.s.f(new p90.j(bVar4, iVar2, null)), v1.a(dVar2), k2.a.a(k2.f150703a, 2), new q90.b.c(0.0f, bVar4.f143510c, false, 4, null));
            case 16:
                ((p90.a) obj).f136457c.invoke();
                return Unit.INSTANCE;
            case 17:
                return ParametersHolderKt.parametersOf((q90.d.b) obj);
            case 18:
                ((ya1.m) obj).f195575e.invoke();
                return Unit.INSTANCE;
            case 19:
                yf.e eVar = (yf.e) obj;
                lf.o oVar = eVar.f196846a;
                boolean z17 = eVar.f196851f;
                wf.m mVar = eVar.f196847b;
                w63.g gVarSource = oVar.source();
                try {
                    aVarA = eVar.f196848c.a(gVarSource);
                    try {
                        gVarSource.close();
                        th3 = null;
                    } catch (Throwable th4) {
                        th3 = th4;
                    }
                } catch (Throwable th5) {
                    try {
                        gVarSource.close();
                    } catch (Throwable th6) {
                        o13.g.a(th5, th6);
                    }
                    th3 = th5;
                    aVarA = null;
                    break;
                }
                if (th3 != null) {
                    throw th3;
                }
                tj.g gVar = aVarA.f204326a;
                tj.g gVar2 = aVarA.f204326a;
                tj.g.f0 f0Var3 = gVar.f164761a;
                if (f0Var3 != null) {
                    tj.g.b bVar5 = f0Var3.f164932o;
                    RectF rectF = bVar5 == null ? null : new RectF(bVar5.f164769a, bVar5.f164770b, bVar5.a(), bVar5.b());
                    yf.d dVar3 = rectF != null ? new yf.d(rectF.left, rectF.top, rectF.right, rectF.bottom) : null;
                    if (eVar.f196850e && dVar3 != null) {
                        f14 = dVar3.f196842c - dVar3.f196840a;
                        f15 = dVar3.f196843d - dVar3.f196841b;
                    } else if (gVar2.f164761a != null) {
                        f14 = gVar2.a().f164771c;
                        if (gVar2.f164761a != null) {
                            f15 = gVar2.a().f164772d;
                        } else {
                            vb.h.s("SVG document is empty");
                        }
                    } else {
                        vb.h.s("SVG document is empty");
                    }
                    xf.g gVar3 = mVar.f184997b;
                    xf.f fVar2 = mVar.f184998c;
                    if (p005kotlin.jvm.internal.s.g(gVar3, xf.g.f190618c)) {
                        float fFloatValue = eVar.f196849d.invoke(mVar.f184996a).floatValue();
                        if (f14 > 0.0f) {
                            f14 *= fFloatValue;
                        }
                        if (f15 > 0.0f) {
                            f15 *= fFloatValue;
                        }
                    }
                    long jA = lf.g.a(f14 > 0.0f ? MathKt.c(f14) : 512, f15 > 0.0f ? MathKt.c(f15) : 512, mVar.f184997b, fVar2, (xf.g) hf.g.b(mVar, wf.g.f184982b));
                    int i17 = (int) (jA >> 32);
                    int i18 = (int) (jA & 4294967295L);
                    if (f14 <= 0.0f || f15 <= 0.0f) {
                        f0Var = gVar2.f164761a;
                        if (f0Var != null) {
                            f0Var.f164869r = tj.i.s("100%");
                            f0Var2 = gVar2.f164761a;
                            if (f0Var2 != null) {
                                f0Var2.f164870s = tj.i.s("100%");
                                str = (String) hf.g.b(mVar, yf.b.f196837a);
                                if (str != null) {
                                    tj.f fVar3 = new tj.f();
                                    tj.b bVar6 = new tj.b(tj.b.t.RenderOptions);
                                    tj.b.d dVar4 = new tj.b.d(str);
                                    dVar4.q();
                                    fVar3.f164759a = bVar6.e(dVar4);
                                    aVarA.f204327b = fVar3;
                                }
                                fVar = new yf.f(gVar2, aVarA.f204327b, i17, i18);
                                if (z17) {
                                    fVar = hf.m.c(hf.m.d(fVar));
                                }
                                return new lf.f(fVar, z17);
                            }
                            vb.h.s("SVG document is empty");
                        } else {
                            vb.h.s("SVG document is empty");
                        }
                    } else {
                        float f16 = i17 / f14;
                        float f17 = i18 / f15;
                        int i19 = lf.g.a.f112093a[fVar2.ordinal()];
                        if (i19 == 1) {
                            fMax = Math.max(f16, f17);
                        } else if (i19 == 2) {
                            fMax = Math.min(f16, f17);
                        } else {
                            u0.r();
                        }
                        int i24 = (int) (fMax * f14);
                        int i25 = (int) (fMax * f15);
                        if (dVar3 == null) {
                            yf.d dVar5 = new yf.d(0.0f, 0.0f, f14, f15);
                            float f18 = dVar5.f196842c;
                            float f19 = dVar5.f196840a;
                            float f22 = f18 - f19;
                            float f24 = dVar5.f196843d;
                            float f25 = dVar5.f196841b;
                            float f26 = f24 - f25;
                            tj.g.f0 f0Var4 = gVar2.f164761a;
                            if (f0Var4 != null) {
                                f0Var4.f164932o = new tj.g.b(f19, f25, f22, f26);
                            } else {
                                vb.h.s("SVG document is empty");
                            }
                        }
                        i18 = i25;
                        i17 = i24;
                        f0Var = gVar2.f164761a;
                        if (f0Var != null) {
                            f0Var.f164869r = tj.i.s("100%");
                            f0Var2 = gVar2.f164761a;
                            if (f0Var2 != null) {
                                f0Var2.f164870s = tj.i.s("100%");
                                str = (String) hf.g.b(mVar, yf.b.f196837a);
                                if (str != null) {
                                    tj.f fVar4 = new tj.f();
                                    tj.b bVar7 = new tj.b(tj.b.t.RenderOptions);
                                    tj.b.d dVar6 = new tj.b.d(str);
                                    dVar6.q();
                                    fVar4.f164759a = bVar7.e(dVar6);
                                    aVarA.f204327b = fVar4;
                                }
                                fVar = new yf.f(gVar2, aVarA.f204327b, i17, i18);
                                if (z17) {
                                    fVar = hf.m.c(hf.m.d(fVar));
                                }
                                return new lf.f(fVar, z17);
                            }
                            vb.h.s("SVG document is empty");
                        } else {
                            vb.h.s("SVG document is empty");
                        }
                    }
                } else {
                    vb.h.s("SVG document is empty");
                }
                return null;
            case 20:
                int i26 = SubscriptionDevMenuActivity.f35309d;
                ((SubscriptionDevMenuActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 21:
                StrideLengthSettingsActivity.a aVar3 = StrideLengthSettingsActivity.f44198b;
                ((StrideLengthSettingsActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 22:
                int i27 = GoogleHealthConnectDatabase_Impl.f36057c;
                return new com.garmin.android.apps.connectmobile.googlehealthconnect.data.database.a((GoogleHealthConnectDatabase_Impl) obj);
            case 23:
                r22.u0 u0Var = ((yo0.f) obj).f198359a;
                if (u0Var != null) {
                    u0Var.onDismiss();
                }
                return Unit.INSTANCE;
            case 24:
                TimingGatesActivity timingGatesActivity = (TimingGatesActivity) obj;
                TimingGatesActivity.a aVar4 = TimingGatesActivity.f29952c;
                j.a aVar5 = j.f191609g;
                String str2 = timingGatesActivity.f29954b;
                aVar5.getClass();
                Bundle bundleA = j.a.a(str2);
                HelpActivity.a aVar6 = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.FIVE_HZ_DATA_RECORDING;
                aVar6.getClass();
                HelpActivity.a.d(timingGatesActivity, lVar, null, bundleA);
                return Unit.INSTANCE;
            case 25:
                ((nr.g.f.b) obj).f127064b.invoke();
                return Unit.INSTANCE;
            case 26:
                ((nr.g.i) obj).f127078e.invoke();
                return Unit.INSTANCE;
            case 27:
                return new sr.h((l22.a) obj);
            case 28:
                e23.a<Unit> aVar7 = ((nr.g.m) obj).f127093g;
                if (aVar7 != null) {
                    aVar7.invoke();
                }
                return Unit.INSTANCE;
            default:
                ((nr.g.n) obj).f127107c.a();
                return Unit.INSTANCE;
        }
    }
}
