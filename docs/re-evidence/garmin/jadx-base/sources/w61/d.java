package w61;

import android.view.View;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.overnighthrv.OvernightHrvActivity;
import com.garmin.android.apps.connectmobile.performance.model.CurrentTrainingStatusDTO;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.a f183164b;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar, int i14) {
        this.f183163a = i14;
        this.f183164b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        String string;
        CurrentTrainingStatusDTO currentTrainingStatusDTO;
        int i14 = this.f183163a;
        com.garmin.android.apps.connectmobile.performance.stats.improvement.a aVar = this.f183164b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                x xVarI6 = aVar.I6();
                xVarI6.f183287x.m(new f<>(xVarI6.f183273i.d()));
                break;
            case 1:
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                x xVarI7 = aVar.I6();
                int i15 = x.O0;
                xVarI7.I4("LOAD_FOCUS_DEST");
                break;
            case 2:
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                x xVarI8 = aVar.I6();
                y0<f<c61.d>> y0Var = xVarI8.A;
                x61.k kVar = xVarI8.f183267c;
                fw.m mVar = (fw.m) xVarI8.f183280o.d();
                x61.e eVar = (mVar == null || (currentTrainingStatusDTO = (CurrentTrainingStatusDTO) mVar.f73770c) == null) ? null : currentTrainingStatusDTO.f39903h;
                gg1.o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                kVar.getClass();
                l22.b bVar = kVar.f189261b;
                o0VarG.getClass();
                String string2 = bVar.getString(R.string.lbl_altitude_acclimation);
                DateTime dateTimeB = eVar != null ? eVar.b() : null;
                l22.b bVar2 = kVar.f189280a;
                if (dateTimeB != null) {
                    DateTime dateTime = new DateTime();
                    string = g22.k.f(dateTime, dateTimeB) ? bVar2.getString(R.string.challenge_leaderboard_header_today_label) : g22.k.f(dateTime.minusDays(1), dateTimeB) ? bVar2.getString(R.string.social_elapsed_time_yesterday) : com.nimbusds.jose.shaded.gson.internal.a.i("EEEE, MMM d", dateTimeB);
                } else {
                    string = "";
                }
                String str = string;
                b61.a aVar2 = b61.a.f16163a;
                Integer altitudeAcclimationMeters = eVar != null ? eVar.getAltitudeAcclimationMeters() : null;
                aVar2.getClass();
                String strB = b61.a.b(bVar, altitudeAcclimationMeters, o0VarG, false);
                String strB2 = b61.a.b(bVar, eVar != null ? eVar.getPreviousAltitudeAcclimationMeters() : null, o0VarG, false);
                x61.a aVarI = eVar != null ? eVar.i() : null;
                b61.b bVar3 = b61.b.f16165a;
                Integer altitudeAcclimationMeters2 = eVar != null ? eVar.getAltitudeAcclimationMeters() : null;
                bVar3.getClass();
                y0Var.m(new f<>(new c61.d(string2, str, strB, b61.a.c(bVar, strB2, aVarI, altitudeAcclimationMeters2 != null && altitudeAcclimationMeters2.intValue() >= 4000), eVar != null ? eVar.i().f189180f : null, b61.a.a(bVar, eVar != null ? eVar.getAltitudeAcclimationMeters() : null, eVar != null ? eVar.i() : new x61.a.e()))));
                break;
            case 3:
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                aVar.I6().B.m(new f<>(Unit.INSTANCE));
                break;
            case 4:
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a5 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                aVar.I6().K4(null);
                break;
            case 5:
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a6 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                HelpActivity.a aVar3 = HelpActivity.f36653a;
                androidx.fragment.app.m mVarRequireActivity = aVar.requireActivity();
                ro0.l lVar = ro0.l.TRAINING_STATUS;
                aVar3.getClass();
                HelpActivity.a.d(mVarRequireActivity, lVar, "RECEIVE_ACTION", null);
                break;
            default:
                com.garmin.android.apps.connectmobile.performance.stats.improvement.a.C0746a c0746a7 = com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z;
                androidx.fragment.app.m activity = aVar.getActivity();
                if (activity != null) {
                    OvernightHrvActivity.a aVar4 = OvernightHrvActivity.f39738n;
                    DateTime dateTime2 = new DateTime(DateTime.now().getMillis());
                    aVar4.getClass();
                    aVar.startActivity(OvernightHrvActivity.a.a(activity, dateTime2, null));
                }
                break;
        }
    }
}
