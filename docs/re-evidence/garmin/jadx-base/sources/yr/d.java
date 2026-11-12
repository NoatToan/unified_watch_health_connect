package yr;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import i3.mh;
import java.util.List;
import p005kotlin.Unit;
import p3.x1;
import z2.o1;
import z2.r1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f198854b;

    public /* synthetic */ d(Object obj, int i14) {
        this.f198853a = i14;
        this.f198854b = obj;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        char c14;
        long jFloatToRawIntBits;
        long jB0;
        long jFloatToRawIntBits2;
        String strU6;
        int i14 = this.f198853a;
        int i15 = 2;
        Object obj3 = this.f198854b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                e.a((nr.g.b) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                k.a((nr.g.d) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                o.c((nr.g.f) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                o.a((nr.g.f.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                p.a((nr.g.C2446g) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                c0.d((nr.y.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                c0.h((nr.y.c) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                c0.e((nr.y.b) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                f0.b((nr.g.m) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                g0.a((nr.g.n) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                i0.a((nr.g.c) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                j0.a((nr.g.p) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                p0.c((nr.g.q) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                p0.a((nr.g.q.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                q0.a((nr.g.r) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                u0.a((nr.g.t) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                w0.a((nr.g.u) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                x0.a((nr.g.v) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                y0.a((nr.g.w) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 19:
                o1 o1Var = (o1) obj3;
                n2.a aVar = (n2.a) obj;
                Context context = (Context) obj2;
                o13.p<s5.c, s5.w0> pVarE = o1Var.e();
                z2.x.a(aVar, context, false, pVarE != null ? pVarE.f128594a : null, pVarE != null ? pVarE.f128595b : null, o1Var.f201733x, new yt.f(6, o1Var, context));
                return Unit.INSTANCE;
            case 20:
                f5.c0 c0Var = (f5.c0) obj3;
                r1.a aVar2 = r1.f201764l;
                f5.c0 c0VarE = ((z2.y) obj).e();
                f5.c0 c0VarE2 = ((z2.y) obj2).e();
                long jB1 = 0;
                if (c0VarE != null) {
                    n4.c.f123541b.getClass();
                    jB0 = c0Var.b0(c0VarE, 0L);
                    c14 = ' ';
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB0 >> 32)) + ((int) (c0VarE.a() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB0 & 4294967295L)) + ((int) (c0VarE.a() & 4294967295L)))) & 4294967295L);
                } else {
                    c14 = ' ';
                    n4.c.f123541b.getClass();
                    jFloatToRawIntBits = 0;
                    jB0 = 0;
                }
                if (c0VarE2 != null) {
                    n4.c.f123541b.getClass();
                    jB1 = c0Var.b0(c0VarE2, 0L);
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB1 & 4294967295L)) + ((int) (c0VarE2.a() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB1 >> c14)) + ((int) (c0VarE2.a() >> c14)))) << c14);
                } else {
                    n4.c.f123541b.getClass();
                    jFloatToRawIntBits2 = 0;
                }
                int i16 = (int) (jFloatToRawIntBits & 4294967295L);
                int i17 = (int) (jB0 & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat(i16) - Float.intBitsToFloat(i17);
                int i18 = (int) (jFloatToRawIntBits >> c14);
                int i19 = (int) (jB0 >> c14);
                float fIntBitsToFloat2 = Float.intBitsToFloat(i18) - Float.intBitsToFloat(i19);
                int i24 = (int) (jFloatToRawIntBits2 & 4294967295L);
                int i25 = (int) (4294967295L & jB1);
                float fIntBitsToFloat3 = Float.intBitsToFloat(i24) - Float.intBitsToFloat(i25);
                int i26 = (int) (jFloatToRawIntBits2 >> c14);
                int i27 = (int) (jB1 >> c14);
                float fIntBitsToFloat4 = Float.intBitsToFloat(i26) - Float.intBitsToFloat(i27);
                float fMax = Math.max(0.0f, Math.min(Float.intBitsToFloat(i16), Float.intBitsToFloat(i24)) - Math.max(Float.intBitsToFloat(i17), Float.intBitsToFloat(i25)));
                float fMax2 = Math.max(0.0f, Math.min(Float.intBitsToFloat(i18), Float.intBitsToFloat(i26)) - Math.max(Float.intBitsToFloat(i19), Float.intBitsToFloat(i27)));
                return Integer.valueOf((((fMax > (fIntBitsToFloat * 0.5f) ? 1 : (fMax == (fIntBitsToFloat * 0.5f) ? 0 : -1)) >= 0 || (fMax > (fIntBitsToFloat3 * 0.5f) ? 1 : (fMax == (fIntBitsToFloat3 * 0.5f) ? 0 : -1)) >= 0) && ((fMax2 > (fIntBitsToFloat2 * 0.5f) ? 1 : (fMax2 == (fIntBitsToFloat2 * 0.5f) ? 0 : -1)) < 0 && (fMax2 > (fIntBitsToFloat4 * 0.5f) ? 1 : (fMax2 == (fIntBitsToFloat4 * 0.5f) ? 0 : -1)) < 0)) ? r13.a.b(Float.valueOf(Float.intBitsToFloat(i19)), Float.valueOf(Float.intBitsToFloat(i27))) : r13.a.b(Float.valueOf(Float.intBitsToFloat(i17)), Float.valueOf(Float.intBitsToFloat(i25))));
            case 21:
                i53.d dVar = (i53.d) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    List listB1 = p13.h0.b1(dVar.keySet());
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    z32.e.b(listB1, d92.c.f(j92.f.f97935l, mVar), mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 22:
                w20.b bVar = (w20.b) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strT = gl1.d.T(bVar.f181490a, mVar2, 0);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strT, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 23:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d dVar2 = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.d.f43911a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    f12.l.f68084a.getClass();
                    z02.b.a(false, null, null, null, false, z3.f.c(-271995673, new zi1.a(i15, dVar2, f12.l.a.a().W0()), mVar3), mVar3, 196608, 31);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 24:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f.f43923h;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                ((com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.f) obj3).requireActivity().getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
            case 25:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g gVar = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g) obj3;
                sd2.f fVar = (sd2.f) obj;
                uj1.e0.a aVar5 = (uj1.e0.a) obj2;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.f43936b;
                fVar.getClass();
                aVar5.getClass();
                GCMComplexTwoLineButton gCMComplexTwoLineButton = aVar5.f171503a;
                gCMComplexTwoLineButton.setButtonTopLabel(fVar.getDisplayName());
                if (fVar.y0()) {
                    String string = gVar.getString(R.string.incident_detection_assistance_plus);
                    string.getClass();
                    String string2 = gVar.getString(R.string.incident_detection_assistance);
                    string2.getClass();
                    String string3 = gVar.getString(R.string.incident_detection_concept);
                    string3.getClass();
                    strU6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.u6(string, string2, string3);
                } else if (fVar.B2()) {
                    String string4 = gVar.getString(R.string.lbl_emergency_calling);
                    string4.getClass();
                    String string5 = gVar.getString(R.string.incident_detection_assistance);
                    string5.getClass();
                    String string6 = gVar.getString(R.string.incident_detection_concept);
                    string6.getClass();
                    strU6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.u6(string4, string5, string6);
                } else {
                    strU6 = "";
                }
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(strU6);
                Resources resources = gCMComplexTwoLineButton.getResources();
                ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                Drawable drawable = resources.getDrawable(R.drawable.check, null);
                Context contextRequireContext = gVar.requireContext();
                contextRequireContext.getClass();
                og2.k.F(R.color.gcm_icon_primary_action, contextRequireContext, drawable);
                gCMComplexTwoLineButton.setRightIcon(drawable);
                gCMComplexTwoLineButton.d(false);
                gCMComplexTwoLineButton.setOnClickListener(new ty0.a(gCMComplexTwoLineButton, 12, gVar, fVar));
                return Unit.INSTANCE;
            case 26:
                yo1.b bVar2 = (yo1.b) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    String imageURI = bVar2.getImageURI();
                    h4.r.a aVar7 = h4.r.S;
                    float f14 = wz1.b.f188181a;
                    jf.r.a(imageURI, null, x2.h(x2.u(aVar7, f14), f14), null, null, null, null, mVar4, 48, 2040);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                zr.b.a((nr.u.b) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                zr.b.d((nr.u.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                e23.p<Integer, Integer, Unit> pVar = ((nr.e.b) obj3).f127011c;
                if (pVar != null) {
                    pVar.invoke(num, num2);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(Object obj, int i14, int i15) {
        this.f198853a = i15;
        this.f198854b = obj;
    }
}
