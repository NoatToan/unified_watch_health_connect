package qd0;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import androidx.fragment.app.v;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupAnnouncementDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.leaderboard.model.MetricsMapDTO;
import com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionManagerActivity;
import com.garmin.android.library.mapsdkadapter.i;
import com.garmin.android.library.mapsdkadapter.o;
import com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailActivity;
import e23.l;
import ie2.p;
import jn2.g;
import js2.f;
import k32.e;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import qe2.j;
import qm0.d;
import qm0.x;
import vn2.t0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f144463b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f144462a = i14;
        this.f144463b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14;
        e eVar;
        Button button;
        int i14 = this.f144462a;
        Object obj2 = this.f144463b;
        switch (i14) {
            case 0:
                ((b) obj2).f144470d.l4((String) obj);
                return Unit.INSTANCE;
            case 1:
                j jVar = (j) obj2;
                i iVar = (i) obj;
                iVar.getClass();
                com.garmin.android.library.mapsdkadapter.l lVarH = iVar.h(jVar.f144590a);
                jVar.f144592c = lVarH;
                p pVar = lVarH.getF144590a().f50328a;
                if (!s.g(pVar.f93153a, jVar.f144590a.f50328a.f93153a)) {
                    lVarH.h(jVar.f144590a.f50328a.f93153a);
                }
                float f14 = pVar.f93155c;
                float f15 = jVar.f144590a.f50328a.f93155c;
                if (f14 != f15) {
                    lVarH.i(f15);
                }
                int i15 = pVar.f93156d;
                int i16 = jVar.f144590a.f50328a.f93156d;
                if (i15 != i16) {
                    lVarH.f(i16);
                }
                float f16 = pVar.f93158f;
                float f17 = jVar.f144590a.f50328a.f93158f;
                if (f16 != f17) {
                    lVarH.a(f17);
                }
                boolean z15 = pVar.f93160h;
                boolean z16 = jVar.f144590a.f50328a.f93160h;
                if (z15 != z16) {
                    lVarH.setVisible(z16);
                }
                boolean z17 = pVar.f93161i;
                boolean z18 = jVar.f144590a.f50328a.f93161i;
                if (z17 != z18) {
                    lVarH.e(z18);
                }
                if (!s.g(pVar.f93162j, jVar.f144590a.f50328a.f93162j)) {
                    lVarH.c(jVar.f144590a.f50328a.f93162j);
                }
                if (!s.g(pVar.f93163k, jVar.f144590a.f50328a.f93163k)) {
                    lVarH.j(jVar.f144590a.f50328a.f93163k);
                }
                if (!s.g(pVar.f93164l, jVar.f144590a.f50328a.f93164l)) {
                    lVarH.b(jVar.f144590a.f50328a.f93164l);
                }
                if (jVar.f144591b) {
                    lVarH.remove();
                }
                jVar.f144590a = lVarH.getF144590a();
                return Unit.INSTANCE;
            case 2:
                i iVar2 = (i) obj;
                iVar2.getClass();
                iVar2.O((i.j) obj2);
                return Unit.INSTANCE;
            case 3:
                qe2.i iVar3 = (qe2.i) obj2;
                i iVar4 = (i) obj;
                iVar4.getClass();
                ie2.j jVarX = iVar4.x(iVar3.f144586a);
                iVar3.f144589d = jVarX;
                o oVar = jVarX.getF125728a().f50327a;
                if (!s.g(oVar.f50309a, iVar3.f144586a.f50327a.f50309a)) {
                    jVarX.g(iVar3.f144586a.f50327a.f50309a);
                }
                float f18 = oVar.f50310b;
                float f19 = iVar3.f144586a.f50327a.f50310b;
                if (f18 != f19) {
                    jVarX.setRotation(f19);
                }
                float f22 = oVar.f50311c;
                float f24 = iVar3.f144586a.f50327a.f50311c;
                if (f22 != f24) {
                    jVarX.a(f24);
                }
                if (!s.g(oVar.f50312d, iVar3.f144586a.f50327a.f50312d)) {
                    jVarX.e(iVar3.f144586a.f50327a.f50312d);
                }
                if (!s.g(oVar.f50313e, iVar3.f144586a.f50327a.f50313e)) {
                    jVarX.i(iVar3.f144586a.f50327a.f50313e);
                }
                boolean z19 = oVar.f50315g;
                boolean z24 = iVar3.f144586a.f50327a.f50315g;
                if (z19 != z24) {
                    jVarX.l(z24);
                }
                boolean z25 = oVar.f50316h;
                boolean z26 = iVar3.f144586a.f50327a.f50316h;
                if (z25 != z26) {
                    jVarX.n(z26);
                }
                boolean z27 = oVar.f50314f;
                boolean z28 = iVar3.f144586a.f50327a.f50314f;
                if (z27 != z28) {
                    jVarX.setVisible(z28);
                }
                float f25 = oVar.f50317i;
                float f26 = iVar3.f144586a.f50327a.f50317i;
                if (f25 != f26) {
                    jVarX.c(f26);
                }
                if (!s.g(oVar.f50322n, iVar3.f144586a.f50327a.f50322n)) {
                    jVarX.b(iVar3.f144586a.f50327a.f50322n);
                }
                float f27 = oVar.f50323o;
                o oVar2 = iVar3.f144586a.f50327a;
                float f28 = oVar2.f50323o;
                if (f27 != f28 || oVar.f50324p != oVar2.f50324p) {
                    jVarX.j(f28, oVar2.f50324p);
                }
                float f29 = oVar.f50325q;
                o oVar3 = iVar3.f144586a.f50327a;
                float f34 = oVar3.f50325q;
                if (f29 != f34 || oVar.f50326r != oVar3.f50326r) {
                    jVarX.h(f34, oVar3.f50326r);
                }
                if (iVar3.f144587b) {
                    jVarX.m();
                }
                if (iVar3.f144588c) {
                    jVarX.remove();
                }
                iVar3.f144586a = jVarX.getF125728a();
                return Unit.INSTANCE;
            case 4:
                i iVar5 = (i) obj;
                iVar5.getClass();
                iVar5.K((i.n) obj2);
                return Unit.INSTANCE;
            case 5:
                i iVar6 = (i) obj;
                iVar6.getClass();
                iVar6.E((i.g) obj2);
                return Unit.INSTANCE;
            case 6:
                i iVar7 = (i) obj;
                iVar7.getClass();
                iVar7.B((i.m) obj2);
                return Unit.INSTANCE;
            case 7:
                i iVar8 = (i) obj;
                iVar8.getClass();
                iVar8.A((i.k) obj2);
                return Unit.INSTANCE;
            case 8:
                i iVar9 = (i) obj;
                iVar9.getClass();
                iVar9.k((i.c) obj2);
                return Unit.INSTANCE;
            case 9:
                i iVar10 = (i) obj;
                iVar10.getClass();
                iVar10.R((i.f) obj2);
                return Unit.INSTANCE;
            case 10:
                i iVar11 = (i) obj;
                iVar11.getClass();
                iVar11.r((y40.i) obj2);
                return Unit.INSTANCE;
            case 11:
                i iVar12 = (i) obj;
                iVar12.getClass();
                iVar12.Z((i.h) obj2);
                return Unit.INSTANCE;
            case 12:
                i iVar13 = (i) obj;
                iVar13.getClass();
                iVar13.M((j40.a) obj2);
                return Unit.INSTANCE;
            case 13:
                i iVar14 = (i) obj;
                iVar14.getClass();
                iVar14.H((t0) obj2);
                return Unit.INSTANCE;
            case 14:
                i iVar15 = (i) obj;
                iVar15.getClass();
                iVar15.i((i.InterfaceC1001i) obj2);
                return Unit.INSTANCE;
            case 15:
                i iVar16 = (i) obj;
                iVar16.getClass();
                iVar16.t((n23.j) obj2);
                return Unit.INSTANCE;
            case 16:
                i iVar17 = (i) obj;
                iVar17.getClass();
                iVar17.N((i.o) obj2);
                return Unit.INSTANCE;
            case 17:
                LTESubscriptionManagerActivity lTESubscriptionManagerActivity = (LTESubscriptionManagerActivity) obj2;
                String str = (String) obj;
                LTESubscriptionManagerActivity.a aVar = LTESubscriptionManagerActivity.f43457e;
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != -1411740605) {
                        if (iHashCode != 1111294127) {
                            if (iHashCode == 1302516860 && str.equals("LTESubscriptionStatusFragment")) {
                                v supportFragmentManager = lTESubscriptionManagerActivity.getSupportFragmentManager();
                                androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                                com.garmin.android.apps.connectmobile.settings.lte.b.f43475i.getClass();
                                aVarB.l(R.id.content_frame, new com.garmin.android.apps.connectmobile.settings.lte.b(), str);
                                aVarB.e();
                            }
                        } else if (str.equals("LTESubscriptionWebViewFragment")) {
                            v supportFragmentManager2 = lTESubscriptionManagerActivity.getSupportFragmentManager();
                            androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
                            com.garmin.android.apps.connectmobile.settings.lte.c.f43491d.getClass();
                            aVarB2.l(R.id.content_frame, new com.garmin.android.apps.connectmobile.settings.lte.c(), str);
                            aVarB2.e();
                        }
                    } else if (str.equals("LTESubscriptionManagerFragment")) {
                        v supportFragmentManager3 = lTESubscriptionManagerActivity.getSupportFragmentManager();
                        androidx.fragment.app.a aVarB3 = androidx.core.view.j.b(supportFragmentManager3, supportFragmentManager3);
                        com.garmin.android.apps.connectmobile.settings.lte.a.f43463f.getClass();
                        aVarB3.l(R.id.content_frame, new com.garmin.android.apps.connectmobile.settings.lte.a(), str);
                        aVarB3.e();
                    }
                }
                return Unit.INSTANCE;
            case 18:
                com.garmin.android.apps.connectmobile.settings.lte.c cVar = (com.garmin.android.apps.connectmobile.settings.lte.c) obj2;
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.settings.lte.c.a aVar2 = com.garmin.android.apps.connectmobile.settings.lte.c.f43491d;
                int i17 = com.garmin.android.apps.connectmobile.settings.lte.c.b.f43495a[g3Var.f35300a.ordinal()];
                if (i17 == 1) {
                    g22.e.f(cVar);
                    String str2 = (String) g3Var.f35301b;
                    if (str2 != null) {
                        WebView webView = cVar.f43492a;
                        if (webView == null) {
                            s.m("webView");
                            throw null;
                        }
                        webView.loadUrl(str2);
                    }
                } else if (i17 == 2) {
                    g22.e.l(cVar);
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(cVar);
                    g22.e.c(cVar);
                }
                return Unit.INSTANCE;
            case 19:
                d.a aVar3 = d.E;
                ((d) obj2).M7();
                return Unit.INSTANCE;
            case 20:
                jo1.e eVar2 = (jo1.e) obj2;
                wg0.a aVar4 = (wg0.a) obj;
                int i18 = qm0.p.f145525h;
                aVar4.getClass();
                if (aVar4.m()) {
                    jo1.e eVar3 = aVar4.f185061v;
                    z14 = s.g(eVar3 != null ? eVar3.getUuid() : null, eVar2.getUuid());
                }
                return Boolean.valueOf(z14);
            case 21:
                GroupAnnouncementDTO groupAnnouncementDTO = (GroupAnnouncementDTO) obj2;
                wg0.a aVar5 = (wg0.a) obj;
                int i19 = qm0.p.f145525h;
                aVar5.getClass();
                if (aVar5.i()) {
                    GroupAnnouncementDTO groupAnnouncementDTO2 = aVar5.f185064y;
                    z14 = s.g(groupAnnouncementDTO2 != null ? groupAnnouncementDTO2.f31502a : null, groupAnnouncementDTO.f31502a);
                }
                return Boolean.valueOf(z14);
            case 22:
                k32.c<x.b> cVar2 = ((x) obj2).f145580e;
                if (cVar2 != null && (eVar = (e) h0.e0(x.b.POST_FEED.ordinal(), cVar2.f102673a)) != null && (button = eVar.f102679d) != null) {
                    button.performClick();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj).getClass();
                RabbitCardDetailActivity.a aVar6 = RabbitCardDetailActivity.f51749j;
                return new q42.d((RabbitCardDetailActivity) obj2, 15);
            case 24:
                ActivityDetailsActivity activityDetailsActivity = (ActivityDetailsActivity) obj2;
                int i24 = ActivityDetailsActivity.f29967g;
                ((View) obj).getClass();
                activityDetailsActivity.fa().L5(false);
                activityDetailsActivity.fa().f146518f2.setValue(j0.f134944a);
                activityDetailsActivity.getOnBackPressedDispatcher().d();
                activityDetailsActivity.updateActionBarTitle(activityDetailsActivity.getString(R.string.activity_history_share_activity_title));
                return Unit.INSTANCE;
            case 25:
                Logger logger = qr2.d.f146935v;
                ((g) obj2).accept((f) obj);
                return Unit.INSTANCE;
            case 26:
                MetricsMapDTO metricsMapDTO = (MetricsMapDTO) obj;
                com.garmin.android.apps.connectmobile.leaderboard.connections.a.C0674a c0674a = com.garmin.android.apps.connectmobile.leaderboard.connections.a.D;
                metricsMapDTO.getClass();
                l3.a aVar7 = l3.f23124b;
                Context contextRequireContext = ((com.garmin.android.apps.connectmobile.leaderboard.connections.a) obj2).requireContext();
                contextRequireContext.getClass();
                double d14 = metricsMapDTO.f38034b;
                f12.l.f68084a.getClass();
                boolean zY = f12.l.a.a().y();
                aVar7.getClass();
                return l3.a.T(d14, contextRequireContext, zY);
            case 27:
                MetricsMapDTO metricsMapDTO2 = (MetricsMapDTO) obj;
                com.garmin.android.apps.connectmobile.leaderboard.connections.b.a aVar8 = com.garmin.android.apps.connectmobile.leaderboard.connections.b.D;
                metricsMapDTO2.getClass();
                l3.a aVar9 = l3.f23124b;
                Context contextRequireContext2 = ((com.garmin.android.apps.connectmobile.leaderboard.connections.b) obj2).requireContext();
                contextRequireContext2.getClass();
                double d15 = metricsMapDTO2.f38034b;
                f12.l.f68084a.getClass();
                boolean zY2 = f12.l.a.a().y();
                aVar9.getClass();
                return l3.a.T(d15, contextRequireContext2, zY2);
            case 28:
                MetricsMapDTO metricsMapDTO3 = (MetricsMapDTO) obj;
                com.garmin.android.apps.connectmobile.leaderboard.connections.d.a aVar10 = com.garmin.android.apps.connectmobile.leaderboard.connections.d.D;
                metricsMapDTO3.getClass();
                l3.a aVar11 = l3.f23124b;
                Context contextRequireContext3 = ((com.garmin.android.apps.connectmobile.leaderboard.connections.d) obj2).requireContext();
                contextRequireContext3.getClass();
                double d16 = metricsMapDTO3.f38034b;
                f12.l.f68084a.getClass();
                boolean zY3 = f12.l.a.a().y();
                aVar11.getClass();
                return l3.a.T(d16, contextRequireContext3, zY3);
            default:
                com.garmin.android.apps.connectmobile.leaderboard.connections.f fVar = (com.garmin.android.apps.connectmobile.leaderboard.connections.f) obj2;
                MetricsMapDTO metricsMapDTO4 = (MetricsMapDTO) obj;
                com.garmin.android.apps.connectmobile.leaderboard.connections.f.a aVar12 = com.garmin.android.apps.connectmobile.leaderboard.connections.f.D;
                metricsMapDTO4.getClass();
                m3 m3Var = am.j.z(f12.l.f68084a) ? m3.METER : m3.YARD;
                l3.a aVar13 = l3.f23124b;
                Context context = fVar.getContext();
                double d17 = metricsMapDTO4.f38034b;
                aVar13.getClass();
                return l3.a.P(context, d17, m3Var, l3.f23131i, true, fVar.getString(R.string.no_value));
        }
    }
}
