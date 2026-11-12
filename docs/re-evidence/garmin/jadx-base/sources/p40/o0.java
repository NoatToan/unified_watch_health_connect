package p40;

import am.a2;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.textclassifier.TextClassification;
import android.webkit.URLUtil;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.recyclerview.widget.RecyclerView;
import ca0.u1;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity;
import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPPlanOverviewActivity;
import java.util.Objects;
import lc.x0;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.p1;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f135711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f135712c;

    public /* synthetic */ o0(lc.v vVar, x0 x0Var, androidx.navigation.fragment.a aVar, Fragment fragment) {
        this.f135710a = 3;
        this.f135711b = x0Var;
        this.f135712c = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r0v51, types: [T, java.lang.Object] */
    @Override // e23.a
    public final Object invoke() throws PendingIntent.CanceledException {
        Object value;
        ok2.w wVarA;
        int i14 = this.f135710a;
        Object obj = this.f135712c;
        Object obj2 = this.f135711b;
        switch (i14) {
            case 0:
                ((e23.l) obj2).invoke((q40.b) obj);
                return Unit.INSTANCE;
            case 1:
                ((e23.l) obj2).invoke((n80.a) obj);
                return Unit.INSTANCE;
            case 2:
                LocalDate localDate = (LocalDate) obj2;
                p81.b bVar = (p81.b) obj;
                if (localDate != null) {
                    bVar.f136383b.invoke(localDate);
                } else {
                    int i15 = p81.b.f136381e;
                }
                return Unit.INSTANCE;
            case 3:
                x0 x0Var = (x0) obj2;
                Fragment fragment = (Fragment) obj;
                int i16 = androidx.navigation.fragment.a.f10129j;
                for (lc.v vVar : (Iterable) x0Var.f111901f.f150540a.getValue()) {
                    if (androidx.navigation.fragment.a.n()) {
                        Objects.toString(vVar);
                        Objects.toString(fragment);
                    }
                    x0Var.b(vVar);
                }
                return Unit.INSTANCE;
            case 4:
                ((pc0.o0) obj2).f137274a.r((lp.k) obj);
                return Unit.INSTANCE;
            case 5:
                ((com.garmin.android.apps.connectmobile.ecg.presentation.stats.c.C0591c) obj2).f34904c.Y0((gf0.a) obj);
                return Unit.INSTANCE;
            case 6:
                pk1.u uVar = (pk1.u) obj2;
                pk1.u.a aVar = pk1.u.E;
                g22.e.l(uVar);
                pk1.f fVar = (pk1.f) uVar.C.getValue();
                fVar.getClass();
                w9.a aVarA = v1.a(fVar);
                x53.c cVar = o53.s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new pk1.e(fVar, (String) obj, null), 2);
                return Unit.INSTANCE;
            case 7:
                pl1.d dVar = (pl1.d) obj;
                pl1.d.a aVar2 = pl1.d.f138528n;
                String strN = ((ol1.c) obj2).f132845j;
                if (!URLUtil.isHttpUrl(strN) && !URLUtil.isHttpsUrl(strN)) {
                    strN = fb1.c.n("http://", strN);
                }
                Uri uri = Uri.parse(strN);
                uri.getClass();
                g22.e.i(dVar, uri);
                return Unit.INSTANCE;
            case 8:
                GroupChallengeDTO groupChallengeDTO = (GroupChallengeDTO) obj;
                int i17 = com.garmin.android.apps.connectmobile.group.details.challenges.d.C0641d.f36330d;
                com.garmin.android.apps.connectmobile.group.details.challenges.d.c cVar2 = ((com.garmin.android.apps.connectmobile.group.details.challenges.d) obj2).f36323c;
                if (cVar2 != null) {
                    cVar2.W3(groupChallengeDTO);
                }
                return Unit.INSTANCE;
            case 9:
                ComposeView composeView = (ComposeView) obj2;
                composeView.disposeComposition();
                composeView.setVisibility(8);
                ((po.c) obj).invoke();
                return Unit.INSTANCE;
            case 10:
                ComposeView composeView2 = (ComposeView) obj2;
                int i18 = po.u.G1;
                composeView2.disposeComposition();
                composeView2.setVisibility(8);
                ((po.u) obj).onResume();
                return Unit.INSTANCE;
            case 11:
                yp.e eVar = (yp.e) obj;
                ((e23.p) obj2).invoke(Integer.valueOf(eVar.f198614a), Integer.valueOf(eVar.f198615b));
                return Unit.INSTANCE;
            case 12:
                yp.d dVar2 = (yp.d) obj;
                ((e23.p) obj2).invoke(Long.valueOf(dVar2.f198609b), dVar2.f198612e);
                return Unit.INSTANCE;
            case 13:
                ((RecyclerView) obj2).invalidateItemDecorations();
                ((pq.c) obj).notifyDataSetChanged();
                return Unit.INSTANCE;
            case 14:
                ITPDashboardActivity iTPDashboardActivity = (ITPDashboardActivity) obj2;
                ITPDashboardActivity.a aVar3 = ITPDashboardActivity.f45618m;
                ITPPlanOverviewActivity.a aVar4 = ITPPlanOverviewActivity.f45632a;
                tw1.m mVar = ((sw1.a) obj).f161085a;
                aVar4.getClass();
                mVar.getClass();
                Bundle bundle = new Bundle();
                a2.b(bundle, "EXTRA_TRAINING_PLAN", mVar);
                Intent intent = new Intent(iTPDashboardActivity, (Class<?>) ITPPlanOverviewActivity.class);
                intent.putExtras(bundle);
                iTPDashboardActivity.startActivity(intent);
                return Unit.INSTANCE;
            case 15:
                boolean zIsFullyZoomedOut = ((CustomCombinedChart) obj).isFullyZoomedOut();
                p2 p2Var = ((ix.j) obj2).f95629i;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.valueOf(zIsFullyZoomedOut)));
                return Unit.INSTANCE;
            case 16:
                sc.f fVar2 = (sc.f) obj2;
                b.u uVar2 = (b.u) obj;
                if (fVar2.f158448a.size() > 1) {
                    p13.d0.G(fVar2);
                } else if (uVar2 != null) {
                    uVar2.d();
                }
                return Unit.INSTANCE;
            case 17:
                ((p005kotlin.jvm.internal.r0) obj2).f105810a = ((e23.a) obj).invoke();
                return Unit.INSTANCE;
            case 18:
                return g6.k.a(jg.b.N(((s2.e) obj2).e0((f5.c0) ((e23.a) obj).invoke())));
            case 19:
                ((o2.e) obj2).f128628d.invoke((o2.h) obj);
                return Unit.INSTANCE;
            case 20:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                q2.u uVar3 = q2.u.f142195a;
                q2.q.f142189a.getClass();
                String text = textClassification.getText();
                q2.q.a(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                return Unit.INSTANCE;
            case 21:
                q42.y yVar = (q42.y) obj2;
                p1 p1Var = (p1) obj;
                k42.b.f102880a.getClass();
                if (k42.b.r()) {
                    l42.c cVar3 = ((q42.f0) yVar.f142756l.f150540a.getValue()).f142638d;
                    if (cVar3 != null) {
                        ge1.b.T(v1.a(yVar), null, null, new q42.a0(cVar3, yVar, null), 3);
                    }
                    yVar.A4(null);
                } else {
                    LocalDate localDateH = g22.l.h(((q42.f0) p1Var.getF182175a()).f142635a);
                    yVar.getClass();
                    ge1.b.T(v1.a(yVar), null, null, new q42.z(yVar, localDateH, null), 3);
                }
                return Unit.INSTANCE;
            case 22:
                q80.b bVar2 = q80.b.f143300a;
                ((e23.l) obj2).invoke((sd2.f) obj);
                return Unit.INSTANCE;
            case 23:
                ((q81.i) obj2).f143346a.I8(new o81.e((LocalDate) obj));
                return Unit.INSTANCE;
            case 24:
                qb0.b bVar3 = (qb0.b) obj2;
                u1 u1Var = (u1) obj;
                y90.b bVar4 = bVar3.f143965h;
                long j8 = bVar3.f143958a.f143493a;
                Logger logger = bVar4.f195269c;
                y90.c cVar4 = bVar4.f195267a;
                z90.a aVarB = cVar4.b(j8);
                if ((aVarB instanceof z90.a.c) || (aVarB instanceof z90.a.b)) {
                    cVar4.c(j8, new z90.a.d(aVarB.getF203116a()));
                    String f203117b = aVarB.getF203117b();
                    z90.a aVarB2 = cVar4.b(j8);
                    String f203117b2 = aVarB2 != null ? aVarB2.getF203117b() : null;
                    StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "userSkip ", " from ", f203117b);
                    sbK.append(" to ");
                    sbK.append(f203117b2);
                    logger.debug(sbK.toString());
                } else {
                    logger.debug(v.h.u(j8, "userSkip ", ", no update to current: ", aVarB != null ? aVarB.getF203117b() : null));
                }
                u1Var.invoke();
                return Unit.INSTANCE;
            case 25:
                qk0.i iVar = (qk0.i) obj2;
                iVar.m2();
                iVar.Y1((qk0.c) obj);
                return Unit.INSTANCE;
            case 26:
                rs2.c cVar5 = (rs2.c) obj;
                ok2.a0 a0Var = ((qk2.a) obj2).f145176f;
                if (a0Var == null || (wVarA = a0Var.a(cVar5.getF92741e())) == null) {
                    return null;
                }
                return wVarA.c();
            case 27:
                ((mk2.c) obj2).c(((al2.n) obj).f3832d);
                return Unit.INSTANCE;
            case 28:
                int i19 = qm0.p.f145525h;
                ((qm0.p) obj2).C4((wg0.a) obj);
                return Unit.INSTANCE;
            default:
                p1 p1Var2 = (p1) obj;
                p1Var2.setValue(Boolean.valueOf(!((Boolean) p1Var2.getF182175a()).booleanValue()));
                ((jn0.a) obj2).a(((Boolean) p1Var2.getF182175a()).booleanValue());
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ o0(int i14, Object obj, Object obj2) {
        this.f135710a = i14;
        this.f135711b = obj;
        this.f135712c = obj2;
    }
}
