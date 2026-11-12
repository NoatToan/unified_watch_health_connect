package c;

import am.x0;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.v1;
import ca0.o1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeRedeemActivity;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import h2.j0;
import java.util.List;
import java.util.Set;
import lc.m0;
import mt0.l1;
import mt0.m1;
import nr.p0;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.c1;
import p13.h0;
import p3.p1;
import q42.b0;
import q42.y;
import q92.x;
import xg0.c0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22310d;

    public /* synthetic */ e(boolean z14, e23.a aVar, m0 m0Var) {
        this.f22307a = 13;
        this.f22308b = z14;
        this.f22310d = aVar;
        this.f22309c = m0Var;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f22307a;
        int i15 = 3;
        boolean z14 = false;
        z14 = false;
        final int i16 = 2;
        final int i17 = 1;
        boolean z15 = this.f22308b;
        ?? r14 = this.f22310d;
        Object obj = this.f22309c;
        switch (i14) {
            case 0:
                k kVar = (k) obj;
                kVar.f56981a.f(z15);
                kVar.f56982b.i(z15);
                kVar.f22322c = (e23.a) r14;
                return Unit.INSTANCE;
            case 1:
                l lVar = (l) obj;
                lVar.f(z15);
                lVar.f22324d = (e23.p) r14;
                return Unit.INSTANCE;
            case 2:
                return ParametersHolderKt.parametersOf(Boolean.valueOf(z15), (o1) obj, ((e23.a) r14).invoke());
            case 3:
                j0 j0Var = (j0) obj;
                p1 p1Var = (p1) r14;
                if (!z15) {
                    p0 p0Var = (p0) h0.e0(j0Var.l(), (List) p1Var.getF182175a());
                    if ((p0Var != null ? p0Var.f127286e : null) instanceof p0.a.b) {
                        z14 = true;
                    }
                }
                return Boolean.valueOf(z14);
            case 4:
                e23.l lVar2 = (e23.l) obj;
                zf2.d dVar = (zf2.d) r14;
                if (z15) {
                    lVar2.invoke(dVar);
                }
                return Unit.INSTANCE;
            case 5:
                e23.l lVar3 = (e23.l) obj;
                sy0.f fVar = (sy0.f) r14;
                if (z15) {
                    lVar3.invoke(null);
                } else {
                    lVar3.invoke(fVar);
                }
                return Unit.INSTANCE;
            case 6:
                com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = (com.garmin.android.apps.connectmobile.leaderboard.model.p) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.s) r14;
                if (z15) {
                    if (pVar.b1()) {
                        DateTime codeExpirationDate = pVar.getCodeExpirationDate();
                        if (codeExpirationDate != null) {
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                            sVar.getClass();
                            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMMM dd, yyyy");
                            dateTimeFormatterForPattern.getClass();
                            String strH = c22.j0.h(codeExpirationDate, dateTimeFormatterForPattern);
                            q1.b bVar = q1.f41066b;
                            String string = sVar.getString(R.string.lbl_expired_reward_message_title);
                            string.getClass();
                            String string2 = sVar.getString(R.string.badges_expired_reward_msg, strH);
                            string2.getClass();
                            bVar.getClass();
                            q1 q1VarB = q1.b.b(string, string2);
                            androidx.fragment.app.v parentFragmentManager = sVar.getParentFragmentManager();
                            parentFragmentManager.getClass();
                            q1VarB.v6(parentFragmentManager, "GCMFragTwoBttnAlertDialog");
                        }
                    } else if (pVar.getUrlEmbeddedSupported()) {
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                        pt0.p pVarE6 = sVar.E6();
                        Long badgeId = pVar.getBadgeId();
                        xy2.b.L(pVarE6, pVarE6.f140760g, new pt0.s(pVarE6, badgeId != null ? badgeId.longValue() : 0L, null));
                    } else {
                        BadgeChallengeRedeemActivity.a aVar3 = BadgeChallengeRedeemActivity.f37213i;
                        Context contextRequireContext = sVar.requireContext();
                        String strA = pVar.A();
                        com.garmin.android.apps.connectmobile.badges.service.model.g badgeTranslation = pVar.getBadgeTranslation();
                        String str = badgeTranslation != null ? badgeTranslation.f30581n : null;
                        com.garmin.android.apps.connectmobile.badges.service.model.g badgeTranslation2 = pVar.getBadgeTranslation();
                        String str2 = badgeTranslation2 != null ? badgeTranslation2.f30582o : null;
                        String badgePromotionCode = pVar.getBadgePromotionCode();
                        com.garmin.android.apps.connectmobile.badges.service.model.g badgeTranslation3 = pVar.getBadgeTranslation();
                        String str3 = badgeTranslation3 != null ? badgeTranslation3.f30583p : null;
                        String partnerRewardUrl = pVar.getPartnerRewardUrl();
                        aVar3.getClass();
                        if (contextRequireContext == null) {
                            a2 a2Var = a2.CHALLENGES;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var, "BadgeChallengeRedeemActivity", "Context cannot be null.");
                        } else {
                            Intent intent = new Intent(contextRequireContext, (Class<?>) BadgeChallengeRedeemActivity.class);
                            intent.putExtra("EXTRA_REDEEM_BANNER", strA);
                            intent.putExtra("EXTRA_REDEEM_TITLE", str);
                            intent.putExtra("EXTRA_REDEEM_DESCRIPTION", str2);
                            intent.putExtra("EXTRA_REDEEM_PROMOTION_CODE", badgePromotionCode);
                            intent.putExtra("EXTRA_REDEEM_FOOTER", str3);
                            intent.putExtra("EXTRA_REDEEM_PARTNER_LINK", partnerRewardUrl);
                            contextRequireContext.startActivity(intent);
                        }
                    }
                } else if (pVar.Z0()) {
                    w5.r.e(sVar, new l1(sVar, pVar, i16), new m1(sVar, 25));
                } else {
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.s.w6(sVar, pVar);
                }
                return Unit.INSTANCE;
            case 7:
                ((e23.p) obj).invoke((String) r14, Boolean.valueOf(!z15));
                return Unit.INSTANCE;
            case 8:
                vw1.e eVar = (vw1.e) obj;
                com.garmin.android.apps.connectmobile.training.itp.a aVar4 = (com.garmin.android.apps.connectmobile.training.itp.a) r14;
                com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                Long l14 = eVar.f180567a;
                if ((l14 != null ? l14.longValue() : 0L) > 0) {
                    aVar4.w6().f134302c = aVar4.w6().f134301b;
                    wt1.a aVar5 = (wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null);
                    androidx.fragment.app.m mVarRequireActivity = aVar4.requireActivity();
                    mVarRequireActivity.getClass();
                    long jLongValue = l14 != null ? l14.longValue() : 0L;
                    Long l15 = eVar.f180568b;
                    aVar5.q(mVarRequireActivity, jLongValue, l15 != null ? l15.longValue() : 0L, this.f22308b);
                }
                return Unit.INSTANCE;
            case 9:
                WeightReportsActivity weightReportsActivity = (WeightReportsActivity) obj;
                int i18 = WeightReportsActivity.f47991a;
                y yVar = (y) r14.getValue();
                yVar.getClass();
                ge1.b.T(v1.a(yVar), null, null, new b0(yVar, null), 3);
                if (z15) {
                    weightReportsActivity.finish();
                }
                return Unit.INSTANCE;
            case 10:
                WeightReportsActivity weightReportsActivity2 = (WeightReportsActivity) obj;
                m0 m0Var = (m0) r14;
                int i19 = WeightReportsActivity.f47991a;
                if (z15) {
                    weightReportsActivity2.finish();
                } else {
                    lc.y.p(m0Var, "EDIT_WEIGHT_GOAL_ROUTE", true);
                }
                return Unit.INSTANCE;
            case 11:
                p1 p1Var2 = (p1) obj;
                x0 x0Var = (x0) r14;
                p1Var2.setValue(z15 ? i53.a.h(c1.f((Set) p1Var2.getF182175a(), x0Var)) : i53.a.h(c1.i((Set) p1Var2.getF182175a(), x0Var)));
                return Unit.INSTANCE;
            case 12:
                ((v92.r) obj).D4((x) r14, z15);
                return Unit.INSTANCE;
            case 13:
                e23.a aVar6 = (e23.a) r14;
                m0 m0Var2 = (m0) obj;
                if (z15) {
                    aVar6.invoke();
                } else {
                    m0Var2.getClass();
                    w32.d dVar2 = w32.d.INSTANCE;
                    m0Var2.h(new c42.o(m0Var2, 10), dVar2);
                    m0Var2.f111904b.k().q(dVar2);
                }
                return Unit.INSTANCE;
            case 14:
                ((e23.p) obj).invoke(Boolean.valueOf(!z15), (o70.f) r14);
                return Unit.INSTANCE;
            default:
                final rs.h hVar = (rs.h) obj;
                GCMMapView gCMMapView = hVar.f154318b;
                final c0 c0Var = (c0) r14;
                if (z15) {
                    gCMMapView.getMapProxy().b(true, Boolean.TRUE);
                }
                final int i24 = z14 ? 1 : 0;
                gCMMapView.getMapProxy().O(new com.mapbox.maps.m(new e23.a() { // from class: xg0.b0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i24) {
                            case 0:
                                c0 c0Var2 = c0Var;
                                c0Var2.f190733a.o4(c0Var2.f190734b, hVar.f154318b.getMapProxy().f144584a.getCameraState());
                                return Unit.INSTANCE;
                            case 1:
                                c0 c0Var3 = c0Var;
                                c0Var3.f190733a.o4(c0Var3.f190734b, hVar.f154318b.getMapProxy().f144584a.getCameraState());
                                return Boolean.TRUE;
                            default:
                                c0 c0Var4 = c0Var;
                                c0Var4.f190733a.o4(c0Var4.f190734b, hVar.f154318b.getMapProxy().f144584a.getCameraState());
                                return Boolean.TRUE;
                        }
                    }
                }, i16));
                gCMMapView.getMapProxy().B(new com.mapbox.maps.m(new e23.a() { // from class: xg0.b0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                c0 c0Var2 = c0Var;
                                c0Var2.f190733a.o4(c0Var2.f190734b, hVar.f154318b.getMapProxy().f144584a.getCameraState());
                                return Unit.INSTANCE;
                            case 1:
                                c0 c0Var3 = c0Var;
                                c0Var3.f190733a.o4(c0Var3.f190734b, hVar.f154318b.getMapProxy().f144584a.getCameraState());
                                return Boolean.TRUE;
                            default:
                                c0 c0Var4 = c0Var;
                                c0Var4.f190733a.o4(c0Var4.f190734b, hVar.f154318b.getMapProxy().f144584a.getCameraState());
                                return Boolean.TRUE;
                        }
                    }
                }, 4));
                gCMMapView.getMapProxy().K(new com.mapbox.maps.m(new e23.a() { // from class: xg0.b0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                c0 c0Var2 = c0Var;
                                c0Var2.f190733a.o4(c0Var2.f190734b, hVar.f154318b.getMapProxy().f144584a.getCameraState());
                                return Unit.INSTANCE;
                            case 1:
                                c0 c0Var3 = c0Var;
                                c0Var3.f190733a.o4(c0Var3.f190734b, hVar.f154318b.getMapProxy().f144584a.getCameraState());
                                return Boolean.TRUE;
                            default:
                                c0 c0Var4 = c0Var;
                                c0Var4.f190733a.o4(c0Var4.f190734b, hVar.f154318b.getMapProxy().f144584a.getCameraState());
                                return Boolean.TRUE;
                        }
                    }
                }, i15));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(Object obj, boolean z14, Object obj2, int i14) {
        this.f22307a = i14;
        this.f22309c = obj;
        this.f22308b = z14;
        this.f22310d = obj2;
    }

    public /* synthetic */ e(Object obj, Object obj2, boolean z14, int i14) {
        this.f22307a = i14;
        this.f22309c = obj;
        this.f22310d = obj2;
        this.f22308b = z14;
    }

    public /* synthetic */ e(boolean z14, Object obj, Object obj2, int i14) {
        this.f22307a = i14;
        this.f22308b = z14;
        this.f22309c = obj;
        this.f22310d = obj2;
    }

    public /* synthetic */ e(boolean z14, rs.h hVar, boolean z15, c0 c0Var) {
        this.f22307a = 15;
        this.f22308b = z14;
        this.f22309c = hVar;
        this.f22310d = c0Var;
    }
}
