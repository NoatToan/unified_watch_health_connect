package cq0;

import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.incidentdetection.d f55142b;

    public /* synthetic */ h(com.garmin.android.apps.connectmobile.incidentdetection.d dVar, int i14) {
        this.f55141a = i14;
        this.f55142b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        IncidentDetectedActivity incidentDetectedActivity;
        IncidentDetectedActivity incidentDetectedActivity2;
        int i14 = this.f55141a;
        com.garmin.android.apps.connectmobile.incidentdetection.d dVar = this.f55142b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.incidentdetection.d.a aVar = com.garmin.android.apps.connectmobile.incidentdetection.d.f36855d;
                if (dVar.getActivity() != null && !dVar.requireActivity().isFinishing() && (incidentDetectedActivity = (IncidentDetectedActivity) dVar.getActivity()) != null) {
                    incidentDetectedActivity.fa();
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.incidentdetection.d.a aVar2 = com.garmin.android.apps.connectmobile.incidentdetection.d.f36855d;
                if (dVar.getActivity() != null && !dVar.requireActivity().isFinishing() && (incidentDetectedActivity2 = (IncidentDetectedActivity) dVar.getActivity()) != null) {
                    incidentDetectedActivity2.fa();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
