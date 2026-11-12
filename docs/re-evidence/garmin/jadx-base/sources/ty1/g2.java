package ty1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import c22.k3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTTrainingGuidancePlayerActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTTrainingGuidancePlayerActivity.c;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.view.privacy.PrivacySelectionActivity;
import com.garmin.feature.garminpay.providers.felica.exception.ServerInMaintenanceAlertException;
import com.garmin.feature.garminpay.providers.felica.exception.ServerInMaintenanceException;
import com.garmin.feature.garminpay.providers.felica.exception.server.FNServerIncorrectResponseException;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaCardDetailActivity;
import com.google.common.base.Optional;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.UCropView;
import java.util.Calendar;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p006l2.t2;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g2 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f167118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f167119c;

    public /* synthetic */ g2(int i14, Object obj, Object obj2) {
        this.f167117a = i14;
        this.f167118b = obj;
        this.f167119c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        xw1.d dVar;
        Boolean bool;
        fg0.x xVarB;
        String string;
        Object value;
        DateTime dateTimeNow;
        Object value2;
        int i14 = this.f167117a;
        int i15 = 12;
        int i16 = 3;
        int i17 = 4;
        boolean z14 = true;
        Object obj2 = this.f167119c;
        Object obj3 = this.f167118b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a0) obj3;
                g3 g3Var = (g3) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                if (zBooleanValue) {
                    AddTIEventViewModel addTIEventViewModelF6 = a0Var.F6();
                    Boolean bool2 = Boolean.TRUE;
                    addTIEventViewModelF6.f204393j = bool2;
                    addTIEventViewModelF6.f46439u2 = false;
                    fg0.x xVar = addTIEventViewModelF6.f204394k;
                    if (xVar != null) {
                        xVarB = fg0.x.b(xVar, null, null, null, null, null, null, null, bool2, 511);
                        bool = bool2;
                    } else {
                        bool = bool2;
                        xVarB = null;
                    }
                    addTIEventViewModelF6.f204394k = xVarB;
                    addTIEventViewModelF6.y5().m(null);
                    ((androidx.lifecycle.y0) addTIEventViewModelF6.X1.getValue()).m(null);
                    addTIEventViewModelF6.m5().m(null);
                    addTIEventViewModelF6.M5().m(null);
                    addTIEventViewModelF6.A5().m(Boolean.FALSE);
                    ((androidx.lifecycle.y0) addTIEventViewModelF6.S0.getValue()).m(null);
                    addTIEventViewModelF6.a6().m(null);
                    ((androidx.lifecycle.y0) addTIEventViewModelF6.Z1.getValue()).m(null);
                    addTIEventViewModelF6.f46435s2 = new fg0.k(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
                    addTIEventViewModelF6.P = false;
                    addTIEventViewModelF6.O5().m("TIFindEventFragment");
                    addTIEventViewModelF6.N4().m(null);
                    if (p005kotlin.jvm.internal.s.g(addTIEventViewModelF6.f204393j, bool)) {
                        fg0.x xVar2 = addTIEventViewModelF6.f204394k;
                        addTIEventViewModelF6.f204394k = xVar2 != null ? fg0.x.b(xVar2, null, null, null, null, null, null, new xw1.k(null, null, null, null, null, 31, null), null, 767) : null;
                    }
                } else {
                    AddTIEventViewModel addTIEventViewModelF7 = a0Var.F6();
                    fg0.x xVar3 = a0Var.F6().f204394k;
                    long athletePlanId = (xVar3 == null || (dVar = xVar3.f71372h) == null) ? -1L : dVar.getAthletePlanId();
                    gg0.d dVar2 = (gg0.d) g3Var.f35301b;
                    if (dVar2 == null) {
                        dVar2 = gg0.d.DELETED;
                    }
                    addTIEventViewModelF7.R4(athletePlanId, true, dVar2);
                }
                return Unit.INSTANCE;
            case 1:
                u1.b.C3147b c3147b = u1.b.f167347z;
                ((a2.j) obj3).a((a2.l.a) obj2);
                return Unit.INSTANCE;
            case 2:
                q4.c cVar = (q4.c) obj;
                cVar.m1();
                q4.f.C1(cVar, (o4.f1) obj3, (o4.w) obj2, 0.0f, null, 60);
                return Unit.INSTANCE;
            case 3:
                q4.c cVar2 = (q4.c) obj;
                cVar2.m1();
                q4.f.C1(cVar2, ((o4.b1.a) obj3).f128811a, (o4.w) obj2, 0.0f, null, 60);
                return Unit.INSTANCE;
            case 4:
                u1.n0.a aVar2 = u1.n0.f167625i;
                ((a2.j) obj3).a((a2.h) obj2);
                return Unit.INSTANCE;
            case 5:
                u12.h hVar = (u12.h) obj3;
                hl.a aVar3 = (hl.a) obj2;
                ip.a aVar4 = (ip.a) obj;
                aVar4.getClass();
                hVar.f167782d = aVar4;
                String strB = dh.b.B(hVar, aVar4.f94639a.f4360c);
                if (aVar3 instanceof hl.a.b) {
                    string = "_Select a privacy level for all new %s activities.You can change the privacy on any individual activity later on by editing the activity. Your shared activity may include heart rate and activity location.";
                } else {
                    if (!p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b)) {
                        lc.u0.r();
                        return null;
                    }
                    string = hVar.getString(R.string.profile_privacy_custom_level_description, strB);
                    string.getClass();
                }
                f.c<Intent> cVar3 = hVar.f167784f;
                PrivacySelectionActivity.a aVar5 = PrivacySelectionActivity.f47684c;
                Context contextRequireContext = hVar.requireContext();
                contextRequireContext.getClass();
                PrivacyType privacyType = aVar4.f94640b;
                if (privacyType == null) {
                    privacyType = PrivacyType.ONLY_ME;
                }
                List<PrivacyType> listA = hl.b.a(aVar3);
                aVar5.getClass();
                cVar3.a(PrivacySelectionActivity.a.a(contextRequireContext, strB, string, privacyType, listA), null);
                return Unit.INSTANCE;
            case 6:
                lg2.a aVar6 = (lg2.a) obj2;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ((wg2.g) obj3).x4().r(false);
                ge1.b.T(androidx.lifecycle.v1.a(aVar6), null, null, new lg2.c(aVar6, zBooleanValue2, null), 3);
                return Unit.INSTANCE;
            case 7:
                lc.m0 m0Var = (lc.m0) obj2;
                Long l14 = (Long) obj;
                l14.getClass();
                r53.p2 p2Var = ((zl.b) obj3).f205174f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, l14));
                lc.y.l(m0Var, vl.a.b.INSTANCE);
                return Unit.INSTANCE;
            case 8:
                v2.y yVar = (v2.y) obj3;
                s5.c cVar4 = (s5.c) obj;
                if (yVar.f175257f || !yVar.f175258g) {
                    z14 = false;
                } else {
                    x5.p0 p0Var = yVar.f175256e.f108395e;
                    if (p0Var != null) {
                        t2.a aVar7 = t2.f108797a;
                        List<? extends x5.k> listK = p13.x.k(new x5.n(), new x5.b(cVar4, 1));
                        p006l2.b2 b2Var = yVar.f175256e;
                        x5.l lVar = b2Var.f108394d;
                        p006l2.x0 x0Var = b2Var.f108412v;
                        aVar7.getClass();
                        x5.l0 l0VarA = lVar.a(listK);
                        if (p005kotlin.jvm.internal.s.g(p0Var.f188928a.f188887b.get(), p0Var)) {
                            p0Var.f188929b.c(null, l0VarA);
                        }
                        x0Var.invoke(l0VarA);
                    } else {
                        x5.l0 l0Var = yVar.f175255d;
                        String str = l0Var.f188878a.f157138b;
                        long j8 = l0Var.f188879b;
                        s5.w0.a aVar8 = s5.w0.f157315b;
                        String string2 = d53.w.T(str, cVar4, (int) (j8 >> 32), (int) (j8 & 4294967295L)).toString();
                        int length = cVar4.f157138b.length() + ((int) (yVar.f175255d.f188879b >> 32));
                        yVar.f175256e.f108412v.invoke(new x5.l0(string2, og.a.l(length, length), (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    }
                }
                return Boolean.valueOf(z14);
            case 9:
                x50.e eVar = (x50.e) obj3;
                e23.l lVar2 = (e23.l) obj2;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                if (eVar.f189003c) {
                    e2.f0.b(f0Var, "trails_promotion", new z3.e(1170490558, true, new gt1.l(lVar2, i17)), 2);
                }
                i53.c<x50.a> cVar5 = eVar.f189001a;
                f0Var.a(cVar5.size(), new v50.g(new uu.o(23), cVar5), new v50.h(v50.f.f175749a, cVar5), new z3.e(802480018, true, new v50.i(cVar5, eVar, lVar2)));
                return Unit.INSTANCE;
            case 10:
                r70.z zVar = (r70.z) obj3;
                u70.a aVar9 = (u70.a) obj;
                aVar9.getClass();
                zVar.getClass();
                zVar.f151123g.k(null, aVar9);
                lc.y.l((lc.m0) obj2, DashboardRoute.ChooseFocus.INSTANCE);
                return Unit.INSTANCE;
            case 11:
                w4.a aVar10 = (w4.a) obj3;
                lc.m0 m0Var2 = (lc.m0) obj2;
                String str2 = (String) obj;
                str2.getClass();
                if (str2.equals("MenuEdit")) {
                    w4.b.f181904b.getClass();
                    w4.b.a.a();
                    aVar10.a(0);
                    lc.y.l(m0Var2, DashboardRoute.EditSecondaryStats.INSTANCE);
                }
                return Unit.INSTANCE;
            case 12:
                obj.getClass();
                return ((v82.c) obj3).f176254a.a((o82.a) obj2);
            case 13:
                Calendar calendar = (Calendar) obj;
                calendar.getClass();
                ((p3.p1) obj2).setValue(calendar);
                String strPrint = DateTimeFormat.forPattern("yyyy-MM-dd").print(new LocalDate(calendar.getTimeInMillis()));
                strPrint.getClass();
                ((oe0.d) obj3).x4(strPrint);
                return Unit.INSTANCE;
            case 14:
                UCropView uCropView = (UCropView) obj;
                uCropView.getClass();
                ((vd0.x0) obj3).f177429a = uCropView;
                uCropView.resetCropImageView();
                GestureCropImageView cropImageView = uCropView.getCropImageView();
                cropImageView.getClass();
                cropImageView.setTargetAspectRatio(1.0f);
                cropImageView.setRotateEnabled(false);
                cropImageView.setMaxResultImageSizeX(1024);
                cropImageView.setMaxResultImageSizeY(1024);
                cropImageView.setTransformImageListener(new vd0.y0(cropImageView));
                Context context = uCropView.getContext();
                context.getClass();
                cropImageView.setImageUri((Uri) obj2, k3.a(context, "dog_crop_output_" + System.currentTimeMillis() + ".png"));
                return Unit.INSTANCE;
            case 15:
                Calendar calendar2 = (Calendar) obj;
                calendar2.getClass();
                ((p3.p1) obj2).setValue(calendar2);
                String strPrint2 = DateTimeFormat.forPattern("yyyy-MM-dd").print(new LocalDate(calendar2.getTimeInMillis()));
                strPrint2.getClass();
                ((oe0.s) obj3).y4(strPrint2);
                return Unit.INSTANCE;
            case 16:
                e23.l lVar3 = (e23.l) obj3;
                vj2.g gVar = (vj2.g) obj2;
                o13.q qVar = (o13.q) obj;
                vj2.g.a aVar11 = vj2.g.f178515l;
                Object obj4 = qVar.f128597a;
                Throwable thB = o13.q.b(obj4);
                if (thB == null) {
                    gVar.b().debug("data transfer complete");
                } else {
                    gVar.b().error("data transfer failed", thB);
                }
                if (lVar3 != null) {
                    lVar3.invoke(qVar);
                }
                return Unit.INSTANCE;
            case 17:
                return vn2.s.V1((vn2.s) obj3, (rn2.i) obj2, (Optional) obj);
            case 18:
                vn2.b0 b0Var = (vn2.b0) obj3;
                FelicaCardDetailActivity felicaCardDetailActivity = (FelicaCardDetailActivity) obj2;
                Throwable th3 = (Throwable) obj;
                Logger logger = vn2.b0.f178864c;
                b0Var.getView().hideProgressOverlay();
                vn2.b0.f178864c.error("continueToMaintenanceAndGooglePayCheck Error: ", th3);
                if (th3 instanceof ServerInMaintenanceException) {
                    ServerInMaintenanceException serverInMaintenanceException = (ServerInMaintenanceException) th3;
                    b0Var.getView().Q0(tn2.f0.a.TOPUP, serverInMaintenanceException.getStartTime(), serverInMaintenanceException.getEndTime(), new ya0.j(12));
                } else if (th3 instanceof ServerInMaintenanceAlertException) {
                    b0Var.getView().l3(((ServerInMaintenanceAlertException) th3).getTimeToMaintenance(), new ug2.h(27, b0Var, felicaCardDetailActivity));
                } else {
                    com.garmin.feature.garminpay.providers.felica.ui.b view2 = b0Var.getView();
                    int i18 = vq2.b.f179457y0;
                    view2.J3(new vn2.b1(5));
                }
                return Unit.INSTANCE;
            case 19:
                vn2.b0 b0Var2 = (vn2.b0) obj3;
                tn2.y0.c cVar6 = (tn2.y0.c) obj2;
                Throwable th4 = (Throwable) obj;
                Logger logger2 = vn2.b0.f178864c;
                logger2.error("recoverCard Error: ", th4);
                th4.getClass();
                vn2.t tVar = new vn2.t(b0Var2, i15);
                logger2.trace("handleRecoverFailed()", th4);
                if (th4 instanceof FNServerIncorrectResponseException) {
                    FNServerIncorrectResponseException fNServerIncorrectResponseException = (FNServerIncorrectResponseException) th4;
                    if (fNServerIncorrectResponseException.needToDelete()) {
                        b0Var2.k0(new tn2.y0.c(cVar6.f165746a, cVar6.f165747b, tn2.y0.a.NEED_DELETION_ONLY));
                    } else if (fNServerIncorrectResponseException.needToRefundAndCallCenter()) {
                        b0Var2.k0(new tn2.y0.c(cVar6.f165746a, cVar6.f165747b, tn2.y0.a.NEED_REFUND));
                    } else if (fNServerIncorrectResponseException.needToDeleteAndCallCenter()) {
                        b0Var2.k0(new tn2.y0.c(cVar6.f165746a, cVar6.f165747b, tn2.y0.a.NEED_DELETION_AND_CALL_CENTER));
                    } else if (fNServerIncorrectResponseException.needCallCenter()) {
                        b0Var2.k0(new tn2.y0.c(cVar6.f165746a, cVar6.f165747b, tn2.y0.a.NEED_CALL_CENTER));
                    } else {
                        b0Var2.j0(th4, tVar);
                    }
                } else {
                    b0Var2.j0(th4, tVar);
                }
                return Unit.INSTANCE;
            case 20:
                byte[] bArr = ((com.garmin.device.nfc.b) obj2).f50857j;
                bArr.getClass();
                return ((wl2.b) obj3).k(20000L, bArr);
            case 21:
                vp0.e eVar2 = (vp0.e) obj3;
                DateTime dateTime = (DateTime) obj2;
                fw.m mVar = (fw.m) obj;
                vp0.e.a aVar12 = vp0.e.f179337o;
                if (mVar != null) {
                    fw.p pVar = mVar.f73769b;
                    if (pVar == fw.p.SUCCESS) {
                        vp0.k kVar = eVar2.f179341k;
                        if (kVar == null) {
                            p005kotlin.jvm.internal.s.m("hydrationView");
                            throw null;
                        }
                        kVar.f179381o = true;
                        if (g22.k.k(dateTime)) {
                            jp0.b bVar = (jp0.b) mVar.f73770c;
                            if (bVar == null || (dateTimeNow = bVar.h()) == null) {
                                dateTimeNow = DateTime.now();
                            }
                            vp0.k kVar2 = eVar2.f179341k;
                            if (kVar2 == null) {
                                p005kotlin.jvm.internal.s.m("hydrationView");
                                throw null;
                            }
                            kVar2.a(dateTimeNow);
                        }
                        vp0.e.b bVar2 = eVar2.f179338h;
                        if (bVar2 != null) {
                            bVar2.H5();
                        }
                    }
                    if (pVar == fw.p.ERROR) {
                        g22.e.a(eVar2, hb2.i.a(eVar2.requireContext()) ? mVar.f73771d : new fw.h());
                        eVar2.E6();
                    }
                }
                return Unit.INSTANCE;
            case 22:
                zc.d dVar3 = (zc.d) obj3;
                e2.f0 f0Var2 = (e2.f0) obj;
                f0Var2.getClass();
                e2.f0.f(f0Var2, dVar3.b(), null, new z3.e(2127099099, true, new o72.m1(i15, dVar3, (x3) obj2)), 6);
                return Unit.INSTANCE;
            case 23:
                vt0.a aVar13 = (vt0.a) obj;
                aVar13.getClass();
                ((zt0.c) obj3).f206955c.k(null, aVar13);
                ((zc.d) obj2).e();
                return Unit.INSTANCE;
            case 24:
                Context context2 = (Context) obj;
                FBTTrainingGuidancePlayerActivity.a aVar14 = FBTTrainingGuidancePlayerActivity.f45483c;
                context2.getClass();
                PlayerView playerView = new PlayerView(context2);
                playerView.setShowSubtitleButton(true);
                playerView.setPlayer((ExoPlayer) obj3);
                playerView.setResizeMode(0);
                playerView.setUseController(true);
                playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                playerView.setControllerVisibilityListener(((FBTTrainingGuidancePlayerActivity) obj2).new c(playerView));
                return playerView;
            case 25:
                com.garmin.android.apps.connectmobile.navigation.more.b bVar3 = (com.garmin.android.apps.connectmobile.navigation.more.b) obj;
                bVar3.getClass();
                ((vy0.t) obj3).a(bVar3, new vv0.n(i16, (vy0.a0) obj2, bVar3));
                return Unit.INSTANCE;
            case 26:
                com.garmin.android.apps.connectmobile.navigation.more.b bVar4 = (com.garmin.android.apps.connectmobile.navigation.more.b) obj;
                bVar4.getClass();
                ((vy0.u) obj3).a(bVar4, new vv0.n(i17, (vy0.n) obj2, bVar4));
                return Unit.INSTANCE;
            case 27:
                Context context3 = (Context) obj3;
                i41.f fVar = (i41.f) obj2;
                View view3 = (View) obj;
                HorseshoePieChart horseshoePieChart = (HorseshoePieChart) view3.findViewById(R.id.ohrv_piechart);
                ViewGroup.LayoutParams layoutParams = horseshoePieChart.getLayoutParams();
                Resources resources = context3.getResources();
                resources.getClass();
                layoutParams.width = (int) xy2.b.n(resources, 175.0f);
                Resources resources2 = context3.getResources();
                resources2.getClass();
                layoutParams.height = (int) xy2.b.n(resources2, 175.0f);
                horseshoePieChart.setLayoutParams(layoutParams);
                ImageView imageView = (ImageView) view3.findViewById(R.id.no_data_hrv_status_icon_layout);
                ComposeView composeView = (ComposeView) view3.findViewById(R.id.compose_view);
                composeView.getClass();
                composeView.setVisibility(4);
                if (fVar != null) {
                    String status = fVar.getStatus();
                    if (status != null && status.length() != 0 && !p005kotlin.jvm.internal.s.g(fVar.getStatus(), "NONE")) {
                        imageView.getClass();
                        imageView.setVisibility(8);
                        horseshoePieChart.setVisibility(0);
                        vz1.k.c(horseshoePieChart, fVar, context3);
                    } else if (fVar.getWeeklyAvg() != null) {
                        horseshoePieChart.setVisibility(0);
                        imageView.getClass();
                        imageView.setVisibility(8);
                        vz1.k.c(horseshoePieChart, new i41.f((String) null, fVar.getWeeklyAvg(), (Integer) null, (Integer) null, new i41.a(0, 0, 0, Double.valueOf(0.0d)), (String) null, (String) null, (String) null, 237, (p005kotlin.jvm.internal.j) null), context3);
                    }
                }
                return Unit.INSTANCE;
            case 28:
                r53.p2 p2Var2 = (r53.p2) obj3;
                g41.a aVar15 = (g41.a) obj2;
                y31.a aVar16 = (y31.a) obj;
                do {
                    value2 = p2Var2.getValue();
                    ((o41.b) value2).getClass();
                } while (!p2Var2.b(value2, new o41.b(aVar16)));
                aVar15.b(aVar16);
                return Unit.INSTANCE;
            default:
                sl1.h hVar2 = (sl1.h) obj3;
                ((CustomCombinedChart) obj).getClass();
                hVar2.b(null);
                uz.a.a(hVar2, (rm1.j) obj2, null, 4);
                return Unit.INSTANCE;
        }
    }
}
