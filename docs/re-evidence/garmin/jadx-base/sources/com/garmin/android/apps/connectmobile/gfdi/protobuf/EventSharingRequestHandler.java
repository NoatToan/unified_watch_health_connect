package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import am.j;
import android.content.Context;
import bs2.nv;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIEventSharingProto;
import ds.e0;
import du0.h;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingRequestHandler;", "Lkk2/a$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceId", "<init>", "(Landroid/content/Context;J)V", "Lcom/garmin/proto/generated/GDIEventSharingProto$AlertNotification;", "alert", "", "onAlertReceived", "(Lcom/garmin/proto/generated/GDIEventSharingProto$AlertNotification;)V", "J", "Landroid/content/Context;", "Companion", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventSharingRequestHandler implements kk2.a.b {
    private static final String TAG = "EventSharingRequestHandler";
    private final Context context;
    private final long deviceId;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GDIEventSharingProto.AlertType.values().length];
            try {
                iArr[GDIEventSharingProto.AlertType.ACTIVITY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIEventSharingProto.AlertType.ACTIVITY_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GDIEventSharingProto.AlertType.ACTIVITY_DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GDIEventSharingProto.AlertType.ACTIVITY_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GDIEventSharingProto.AlertType.ACTIVITY_AUTO_LAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GDIEventSharingProto.AlertType.ACTIVITY_MANUAL_LAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GDIEventSharingProto.AlertType.ACTIVITY_TRANSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EventSharingRequestHandler(Context context, long j8) {
        context.getClass();
        this.deviceId = j8;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.context = applicationContext;
    }

    @Override // kk2.a.b
    public void onAlertReceived(GDIEventSharingProto.AlertNotification alert) {
        alert.getClass();
        if (alert.getAlertTypeCount() <= 0) {
            String strH = j.h(alert.getAlertTypeCount(), "Event sharing only supports 1 alert type. We received: ");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, TAG, strH);
            return;
        }
        GDIEventSharingProto.AlertType alertType = alert.getAlertType(0);
        GDIEventSharingProto.ActivityAlertDetails activityDetails = alert.getActivityDetails();
        a2 a2Var2 = a2.LIVE_EVENT_SHARING;
        String strD = n23.j.d(this.deviceId, "Notification Received: ", alertType.name(), " from device: ");
        i2.f36769a.getClass();
        i2.a.k(a2Var2, TAG, strD);
        int sportFitType = activityDetails.getLastSportType().getSportFitType();
        int sessionTime = activityDetails.getSessionTime();
        int sessionDist = activityDetails.getSessionDist();
        int averagePace = activityDetails.getAveragePace();
        int totalTime = activityDetails.getTotalTime();
        int totalDistance = activityDetails.getTotalDistance();
        int intervalTime = activityDetails.getIntervalTime();
        int intervalDist = activityDetails.getIntervalDist();
        int lapTime = activityDetails.getLapTime();
        int estFinishTime = activityDetails.getEstFinishTime();
        int localTime = activityDetails.getLocalTime();
        StringBuilder sbJ = e5.j(sportFitType, sessionTime, "The raw values from device are: \nlastSportType: ", ", \nsessionTime: ", ", \nsessionDistance: ");
        e0.m(sessionDist, averagePace, ", \naveragePace: ", ", \ntotalTime: ", sbJ);
        e0.m(totalTime, totalDistance, ", \ntotalDistance: ", ", \nintervalTime: ", sbJ);
        e0.m(intervalTime, intervalDist, ", \nintervalDist: ", ", \nlapTime: ", sbJ);
        e0.m(lapTime, estFinishTime, ", \nestFinishTime: ", ", \nlocalTime: ", sbJ);
        sbJ.append(localTime);
        i2.a.k(a2Var2, TAG, sbJ.toString());
        switch (WhenMappings.$EnumSwitchMapping$0[alertType.ordinal()]) {
            case 1:
                du0.c cVar = new du0.c(this.context, this.deviceId, activityDetails);
                i2.a.b(a2Var2, "StartEventSharingCommand", "execute():");
                lu0.b bVar = new lu0.b(cVar.f61225a);
                GDIEventSharingProto.ActivityAlertDetails activityAlertDetails = cVar.f61227c;
                bVar.f114966m = activityAlertDetails.getSportType().getSportFitType();
                bVar.f114964k = activityAlertDetails.getLocalTime();
                bVar.e(lu0.c.START);
                ge1.b.T(cVar, null, null, new du0.d(cVar, bVar.a(), null), 3);
                break;
            case 2:
                du0.e eVar = new du0.e(this.context, this.deviceId, activityDetails);
                ge1.b.T(eVar, null, null, new du0.f(eVar, null), 3);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                du0.a aVar2 = new du0.a(this.context, this.deviceId, activityDetails, alertType);
                if (aVar2.f61215c.getSportType().getSportFitType() != nv.SWIMMING.f20362a) {
                    ge1.b.T(aVar2, null, null, new du0.b(aVar2, null), 3);
                    break;
                }
                break;
            case 7:
                du0.g gVar = new du0.g(this.context, this.deviceId, activityDetails);
                ge1.b.T(gVar, null, null, new h(gVar, null), 3);
                break;
            default:
                i2.a.f(a2Var2, TAG, "Invalid Notification: " + alertType.name());
                break;
        }
    }
}
