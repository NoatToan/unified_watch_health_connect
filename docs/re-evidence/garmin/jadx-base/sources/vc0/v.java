package vc0;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.y0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.work.impl.WorkDatabase;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activity.details.presentation.jumps.ActivityDetailsJumpMetricFragment;
import com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingActivity;
import com.garmin.android.apps.connectmobile.navigation.more.TestSearchActivity;
import com.garmin.android.apps.connectmobile.presentation.dev.PromotionsDevMenuActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.TransferActivityProfilesActivity;
import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import com.garmin.device.filetransfer.core.background.BackgroundTransferWorker;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaTopUpActivity;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.core.parameter.ParametersHolderKt;
import org.slf4j.LoggerFactory;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p3.p0;
import ps.w0;
import r53.p2;
import vd0.n1;
import ve.c0;
import ve.t0;
import vg1.v0;
import w51.q0;
import w61.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f177024b;

    public /* synthetic */ v(Object obj, int i14) {
        this.f177023a = i14;
        this.f177024b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        Object value;
        Object value2;
        String strE;
        int i14 = this.f177023a;
        Object parcelableArrayList = null;
        Object[] objArr = 0;
        Object obj = this.f177024b;
        switch (i14) {
            case 0:
                w wVar = (w) obj;
                String name = w.f177025g.getName();
                name.getClass();
                return new yr1.q(name, wVar, Long.valueOf(wVar.f177030f), null, 8, null);
            case 1:
                p2 p2Var = ((oe0.d) obj).f131259d;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, oe0.a.a((oe0.a) value, false, false, 3)));
                return Unit.INSTANCE;
            case 2:
                p2 p2Var2 = ((oe0.s) obj).f131410f;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, oe0.o.a((oe0.o) value2, false, false, false, false, false, 247)));
                return Unit.INSTANCE;
            case 3:
                return p0.n(n1.d(((pe0.j) obj).f137457g));
            case 4:
                vd2.b.a aVar = vd2.b.f177472p;
                Object systemService = ((vd2.b) obj).requireContext().getSystemService("camera");
                systemService.getClass();
                return (CameraManager) systemService;
            case 5:
                int i15 = c0.f177550j;
                df.f.a((c0) obj);
                return Unit.INSTANCE;
            case 6:
                t0 t0Var = (t0) obj;
                WorkDatabase workDatabase = t0Var.f177606d;
                Context context = t0Var.f177604b;
                int i16 = xe.e.f190407f;
                if (Build.VERSION.SDK_INT >= 34) {
                    xe.c.b(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListD = xe.e.d(context, jobScheduler);
                if (arrayListD != null && !arrayListD.isEmpty()) {
                    Iterator it = arrayListD.iterator();
                    while (it.hasNext()) {
                        xe.e.b(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                workDatabase.j().j();
                ve.t.b(t0Var.f177605c, workDatabase, t0Var.f177608f);
                return Unit.INSTANCE;
            case 7:
                vf2.k kVar = (vf2.k) obj;
                int i17 = vf2.k.f177993c;
                try {
                    InputStream inputStreamOpenRawResource = kVar.f177994a.getResources().openRawResource(R.raw.exercise_fit_enum_map);
                    inputStreamOpenRawResource.getClass();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, d53.c.f57666b), 8192);
                    try {
                        strE = lg.d.E(bufferedReader);
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jg.b.l(bufferedReader, th3);
                            throw th4;
                        }
                    }
                } catch (Exception e4) {
                    zg2.c.f204692a.getClass();
                    zg2.c.b("LiveActivityExerciseMapSource", "readJsonAsString Exception message: " + e4);
                    strE = "";
                }
                if (strE.length() <= 0) {
                    zg2.c.f204692a.getClass();
                    int i18 = gt2.c.f79010a;
                    gt2.b.f79005a.h("LiveActivity").warn(zg2.c.e("LiveActivityExerciseMapSource", "exercise_fit_enum_map content returns empty"));
                    return null;
                }
                try {
                    Object objFromJson = new Gson().fromJson(strE, new vf2.l().getType());
                    objFromJson.getClass();
                    return (List) objFromJson;
                } catch (Exception e14) {
                    zg2.c.f204692a.getClass();
                    zg2.c.b("LiveActivityExerciseMapSource", "Gson().fromJson Exception message: " + e14);
                    return null;
                }
            case 8:
                TransferActivityProfilesActivity transferActivityProfilesActivity = (TransferActivityProfilesActivity) obj;
                View view2 = transferActivityProfilesActivity.f42794c;
                if (view2 == null) {
                    p005kotlin.jvm.internal.s.m("transferBtn");
                    throw null;
                }
                v0 v0Var = transferActivityProfilesActivity.f42795d;
                if (v0Var != null) {
                    view2.setEnabled(v0Var.A() != null);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            case 9:
                return LoggerFactory.getLogger("CFT#" + ((BackgroundTransferWorker) obj).f50766g);
            case 10:
                com.garmin.android.apps.connectmobile.group.details.invite.b.a aVar2 = com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o;
                return new com.garmin.android.apps.connectmobile.group.details.invite.a((com.garmin.android.apps.connectmobile.group.details.invite.b) obj);
            case 11:
                FelicaTopUpActivity.a aVar3 = FelicaTopUpActivity.f50969p;
                return new un2.a((FelicaTopUpActivity) obj, pn2.a.d.f138714a);
            case 12:
                int i19 = ActivityDetailsJumpMetricFragment.f30072b;
                Bundle arguments = ((ActivityDetailsJumpMetricFragment) obj).getArguments();
                if (arguments != null) {
                    parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("JUMP_METRIC", w0.class) : arguments.getParcelableArrayList("JUMP_METRIC");
                }
                if (parcelableArrayList == null) {
                    parcelableArrayList = j0.f134944a;
                }
                return ParametersHolderKt.parametersOf(parcelableArrayList);
            case 13:
                Application application = (Application) obj;
                wa.e eVar = new wa.e(application);
                wa.e.C3405e c3405eA = eVar.a();
                c3405eA.getClass();
                wa.e.C3405e.a aVar4 = new wa.e.C3405e.a();
                aVar4.n(3, false);
                eVar.p(aVar4.a());
                ExoPlayer.b bVar = new ExoPlayer.b(application);
                bVar.b(eVar);
                return bVar.a();
            case 14:
                int i24 = LifestyleLoggingActivity.f38686e;
                ((LifestyleLoggingActivity) obj).finish();
                return Unit.INSTANCE;
            case 15:
                ((gk1.b) obj).invoke();
                return Unit.INSTANCE;
            case 16:
                ((ug2.x) obj).invoke();
                return Unit.INSTANCE;
            case 17:
                return ParametersHolderKt.parametersOf((ty0.b) obj);
            case 18:
                int i25 = TestSearchActivity.f39390b;
                ((TestSearchActivity) obj).onNavigateUp();
                return Unit.INSTANCE;
            case 19:
                return ((xy2.o) l23.f.a(s0.f105811a.b(((uy2.f) obj).providerClass()))).getF173457a();
            case 20:
                w2.k kVar2 = (w2.k) obj;
                if (kVar2.f181350f || ((w2.n.a) kVar2.f181348d.f181384t.getF182175a()) == w2.n.a.Touch) {
                    return n4.c.a(w2.g.a(kVar2.f181347c, kVar2.f181348d, kVar2.f181349e, ((g6.m) kVar2.f181351g.getF182175a()).f76013a));
                }
                n4.c.f123541b.getClass();
                return n4.c.a(n4.c.f123543d);
            case 21:
                return ParametersHolderKt.parametersOf((q71.e) obj);
            case 22:
                return ParametersHolderKt.parametersOf(null, null, ((com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c) obj).f39805a);
            case 23:
                ((q0) obj).G4();
                return Unit.INSTANCE;
            case 24:
                w52.d dVar = (w52.d) obj;
                AudioRecordingView audioRecordingView = dVar.f182488a;
                audioRecordingView.c();
                w52.d.i(dVar);
                audioRecordingView.h(false);
                v22.e.l(audioRecordingView.f47577q);
                return Unit.INSTANCE;
            case 25:
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar5 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.a) obj;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                Context contextRequireContext = aVar5.requireContext();
                contextRequireContext.getClass();
                l22.a aVar6 = new l22.a(contextRequireContext);
                Resources resources = aVar5.requireContext().getResources();
                resources.getClass();
                return new r0(new x61.k(aVar6, resources), null, null, false, 14, null);
            case 26:
                int i26 = w61.x.O0;
                return (y0) ((w61.x) obj).F.getValue();
            case 27:
                return ((w81.b) obj).getString(R.string.msg_optional_permissions_explanation);
            case 28:
                ((c42.c) obj).invoke();
                return Unit.INSTANCE;
            default:
                int i27 = PromotionsDevMenuActivity.f41027b;
                ((PromotionsDevMenuActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
        }
    }
}
