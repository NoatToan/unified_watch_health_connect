package z10;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentActivity;
import com.garmin.feature.garminpay.providers.gpay.challenge.ChallengeActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.transitrefund.NewFitPayTransitRefundActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f200949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f200950c;

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f200948a = i14;
        this.f200949b = obj;
        this.f200950c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        long jB;
        long jFloatToRawIntBits;
        long j8;
        p006l2.i3 i3VarD;
        p006l2.b2 b2Var;
        p006l2.n2 n2Var;
        s5.c cVar;
        zo1.b0 b0Var;
        switch (this.f200948a) {
            case 0:
                com.garmin.android.apps.connectmobile.consent.a aVar = (com.garmin.android.apps.connectmobile.consent.a) this.f200949b;
                FrameLayout frameLayout = (FrameLayout) this.f200950c;
                int i14 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                List<Fragment> listF = aVar.getSupportFragmentManager().f7372c.f();
                listF.getClass();
                for (Fragment fragment : listF) {
                    androidx.fragment.app.v supportFragmentManager = aVar.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                    aVar2.k(fragment);
                    aVar2.f();
                }
                frameLayout.removeAllViews();
                aVar.ra(false);
                return Unit.INSTANCE;
            case 1:
                s92.e eVar = (s92.e) this.f200949b;
                PrivacyPolicyConsentActivity privacyPolicyConsentActivity = (PrivacyPolicyConsentActivity) this.f200950c;
                PrivacyPolicyConsentActivity.a aVar3 = PrivacyPolicyConsentActivity.f32218d;
                String url = eVar.getUrl();
                if (url != null && !d53.w.J(url)) {
                    GCMWebViewActivity.fa(privacyPolicyConsentActivity, eVar.getText(), eVar.getUrl());
                }
                return Unit.INSTANCE;
            case 2:
                PrivacyPolicyConsentActivity privacyPolicyConsentActivity2 = (PrivacyPolicyConsentActivity) this.f200949b;
                q2 q2Var = (q2) this.f200950c;
                PrivacyPolicyConsentActivity.a aVar4 = PrivacyPolicyConsentActivity.f32218d;
                p2 p2Var = (p2) privacyPolicyConsentActivity2.f32221c.getValue();
                hl.a aVar5 = (hl.a) privacyPolicyConsentActivity2.f32219a.getValue();
                s92.g gVar = q2Var.f201221d;
                q92.x xVar = (q92.x) privacyPolicyConsentActivity2.f32220b.getValue();
                p2Var.getClass();
                aVar5.getClass();
                gVar.getClass();
                xVar.getClass();
                ge1.b.T(androidx.lifecycle.v1.a(p2Var), null, null, new o2(p2Var, aVar5, xVar, gVar, null), 3);
                return Unit.INSTANCE;
            case 3:
                z2.o1 o1Var = (z2.o1) this.f200949b;
                long j14 = ((g6.m) ((p3.p1) this.f200950c).getF182175a()).f76013a;
                n4.d dVar = z2.p1.f201741a;
                z2.b0 b0VarG = o1Var.g();
                if (b0VarG == null) {
                    n4.c.f123541b.getClass();
                    jB = n4.c.f123543d;
                } else {
                    p006l2.l1 l1VarF = o1Var.f();
                    int i15 = l1VarF == null ? -1 : z2.p1.a.f201742a[l1VarF.ordinal()];
                    if (i15 == -1) {
                        n4.c.f123541b.getClass();
                        jB = n4.c.f123543d;
                    } else if (i15 == 1) {
                        jB = z2.p1.b(o1Var, j14, b0VarG.f201523a);
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                lc.u0.r();
                                return null;
                            }
                            vb.h.z("SelectionContainer does not support cursor");
                            return null;
                        }
                        jB = z2.p1.b(o1Var, j14, b0VarG.f201524b);
                    }
                }
                return n4.c.a(jB);
            case 4:
                z2.h2 h2Var = (z2.h2) this.f200949b;
                long j15 = ((g6.m) ((p3.p1) this.f200950c).getF182175a()).f76013a;
                n4.c cVarP = h2Var.p();
                if (cVarP != null) {
                    long j16 = cVarP.f123544a;
                    s5.c cVarT = h2Var.t();
                    if (cVarT == null || cVarT.f157138b.length() == 0) {
                        n4.c.f123541b.getClass();
                        jFloatToRawIntBits = n4.c.f123543d;
                    } else {
                        p006l2.l1 l1Var = (p006l2.l1) h2Var.f201622s.getF182175a();
                        int i16 = l1Var == null ? -1 : z2.m2.c.f201694a[l1Var.ordinal()];
                        if (i16 != -1) {
                            if (i16 == 1 || i16 == 2) {
                                long j17 = h2Var.u().f188879b;
                                s5.w0.a aVar6 = s5.w0.f157315b;
                                j8 = j17 >> 32;
                            } else {
                                if (i16 != 3) {
                                    lc.u0.r();
                                    return null;
                                }
                                long j18 = h2Var.u().f188879b;
                                s5.w0.a aVar7 = s5.w0.f157315b;
                                j8 = j18 & 4294967295L;
                            }
                            int i17 = (int) j8;
                            p006l2.b2 b2Var2 = h2Var.f201607d;
                            if (b2Var2 == null || (i3VarD = b2Var2.d()) == null || (b2Var = h2Var.f201607d) == null || (n2Var = b2Var.f108391a) == null || (cVar = n2Var.f108674a) == null) {
                                n4.c.f123541b.getClass();
                                jFloatToRawIntBits = n4.c.f123543d;
                            } else {
                                int iE = j23.t.e(h2Var.f201605b.b(i17), 0, cVar.f157138b.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (i3VarD.d(j16) >> 32));
                                s5.q0 q0Var = i3VarD.f108575a;
                                s5.o oVar = q0Var.f157281b;
                                int iD = oVar.d(iE);
                                float fG = q0Var.g(iD);
                                float fH = q0Var.h(iD);
                                float fD = j23.t.d(fIntBitsToFloat, Math.min(fG, fH), Math.max(fG, fH));
                                g6.m.f76012b.getClass();
                                if (g6.m.c(j15, 0L) || Math.abs(fIntBitsToFloat - fD) <= ((int) (j15 >> 32)) / 2) {
                                    float f14 = oVar.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(((oVar.b(iD) - f14) / 2) + f14)) & 4294967295L);
                                } else {
                                    n4.c.f123541b.getClass();
                                    jFloatToRawIntBits = n4.c.f123543d;
                                }
                            }
                        } else {
                            n4.c.f123541b.getClass();
                            jFloatToRawIntBits = n4.c.f123543d;
                        }
                    }
                } else {
                    n4.c.f123541b.getClass();
                    jFloatToRawIntBits = n4.c.f123543d;
                }
                return n4.c.a(jFloatToRawIntBits);
            case 5:
                ((e23.l) this.f200949b).invoke(Long.valueOf(((v61.a) this.f200950c).f175801a));
                return Unit.INSTANCE;
            case 6:
                ((z70.d) this.f200949b).f202789b.unregisterOnSharedPreferenceChangeListener((z70.e) this.f200950c);
                return Unit.INSTANCE;
            case 7:
                ((z70.d) this.f200949b).f202789b.unregisterOnSharedPreferenceChangeListener((z70.e) this.f200950c);
                return Unit.INSTANCE;
            case 8:
                ((z70.d) this.f200949b).f202789b.unregisterOnSharedPreferenceChangeListener((z70.e) this.f200950c);
                return Unit.INSTANCE;
            case 9:
                ((e23.l) this.f200949b).invoke((c.q) this.f200950c);
                return Unit.INSTANCE;
            case 10:
                Uri uri = (Uri) this.f200949b;
                Context context = (Context) this.f200950c;
                int i18 = zb0.f.f203478a;
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.addFlags(268435456);
                context.startActivity(intent);
                return Unit.INSTANCE;
            case 11:
                ((ContentResolver) this.f200949b).unregisterContentObserver((zd0.g.a) this.f200950c);
                return Unit.INSTANCE;
            case 12:
                ze.b bVar = (ze.b) this.f200949b;
                Object obj = (ze.a.C3810a) this.f200950c;
                af.g<T> gVar2 = bVar.f204252a;
                synchronized (gVar2.f3020c) {
                    if (gVar2.f3021d.remove(obj) && gVar2.f3021d.isEmpty()) {
                        gVar2.d();
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 13:
                ((ze0.b) this.f200949b).f204261a.r((lp.k) this.f200950c);
                return Unit.INSTANCE;
            case 14:
                zn2.v0 v0Var = (zn2.v0) this.f200949b;
                HashMap map = (HashMap) this.f200950c;
                Logger logger = zn2.v0.f205887h;
                PendingIntent activity = PendingIntent.getActivity(v0Var.f205889a, 0, ChallengeActivity.a.a(ChallengeActivity.f51119n, v0Var.f205889a, ChallengeActivity.a.EnumC1054a.PURCHASE, (String) map.get("bank-name"), (String) map.get("challenge-url"), null, 16).setFlags(1342210048), 201326592);
                activity.getClass();
                return activity;
            case 15:
                Map map2 = (Map) this.f200949b;
                zn2.v0 v0Var2 = (zn2.v0) this.f200950c;
                Object obj2 = map2.get(to2.a.EnumC3119a.USER_ID.f165868a);
                obj2.getClass();
                uo2.a.f172125n.getClass();
                uo2.a aVarA = uo2.a.C3210a.a(map2);
                NewFitPayTransitRefundActivity.a aVar8 = NewFitPayTransitRefundActivity.f51706l;
                Context context2 = v0Var2.f205889a;
                String productName = aVarA.getProductName();
                String refundId = aVarA.getRefundId();
                aVar8.getClass();
                PendingIntent activity2 = PendingIntent.getActivity(v0Var2.f205889a, 0, NewFitPayTransitRefundActivity.a.a(context2, productName, (String) obj2, refundId).setFlags(1342210048), 201326592);
                activity2.getClass();
                return activity2;
            case 16:
                zo0.b0 b0Var2 = (zo0.b0) this.f200949b;
                zo0.n nVar = (zo0.n) this.f200950c;
                int i19 = zo0.b0.f206098b;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DEVICES, "SystemBondingLostDialogHandler", "onDialog Add Device " + nVar);
                ge1.b.T(b0Var2.f206099a.Q7(), null, null, new zo0.c0(b0Var2, ((zo0.n.p) nVar).f206193a, null), 3);
                return Unit.INSTANCE;
            default:
                zo1.z zVar = (zo1.z) this.f200949b;
                p3.p1 p1Var = (p3.p1) this.f200950c;
                String str = zVar.f206497g;
                if (str != null && (b0Var = zVar.f206496f) != null) {
                    b0Var.f206237d.k(null, Boolean.TRUE);
                    ge1.b.T(androidx.lifecycle.v1.a(b0Var), null, null, new zo1.c0(b0Var, str, null), 3);
                }
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
