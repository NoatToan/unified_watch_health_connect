package lq0;

import com.garmin.proto.generated.GDILiveTrackExtension;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.garmin.proto.generated.GDISmartProto;
import cq0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llq0/a;", "Lkq0/b;", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements kq0.b {
    @Override // kq0.b
    public final void a(com.garmin.android.apps.connectmobile.incidentdetection.service.a aVar, kq0.g gVar, kq0.h hVar) {
        ArrayList arrayList;
        GDILiveTrackProto.LiveTrackService liveTrackServiceBuild;
        GDILiveTrackProto.SessionGroup session;
        List<GDILiveTrackProto.Session> sessionsList;
        aVar.getClass();
        gVar.getClass();
        long j8 = gVar.f106159c;
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.b) {
            ((j) KoinJavaComponent.get$default(j.class, null, null, 6, null)).d(GDISmartProto.Smart.newBuilder().setExtension(GDILiveTrackExtension.liveTrackService, GDILiveTrackProto.LiveTrackService.newBuilder().setEmergencyCountdownNotification(GDILiveTrackProto.EmergencyCountdownNotification.newBuilder().setState(GDILiveTrackProto.EmergencyCountdownNotification.State.CANCELED).build()).build()).build(), j8);
            return;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.h) {
            GDILiveTrackProto.StartRequest startRequest = gVar.f106168l;
            if (startRequest == null || (session = startRequest.getSession()) == null || (sessionsList = session.getSessionsList()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(y.r(sessionsList, 10));
                Iterator<T> it = sessionsList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GDILiveTrackProto.Session) it.next()).getId());
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                liveTrackServiceBuild = null;
            } else {
                GDILiveTrackProto.StopNotification.Builder builderNewBuilder = GDILiveTrackProto.StopNotification.newBuilder();
                builderNewBuilder.setExtendedViewableDurationS(0L);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    builderNewBuilder.addSessionIds((String) it3.next());
                }
                GDILiveTrackProto.LiveTrackService.Builder builderNewBuilder2 = GDILiveTrackProto.LiveTrackService.newBuilder();
                builderNewBuilder2.setStopNotification(builderNewBuilder.build());
                liveTrackServiceBuild = builderNewBuilder2.build();
            }
            if (liveTrackServiceBuild != null) {
                ((j) KoinJavaComponent.get$default(j.class, null, null, 6, null)).d(GDISmartProto.Smart.newBuilder().setExtension(GDILiveTrackExtension.liveTrackService, liveTrackServiceBuild).build(), j8);
            }
        }
    }
}
