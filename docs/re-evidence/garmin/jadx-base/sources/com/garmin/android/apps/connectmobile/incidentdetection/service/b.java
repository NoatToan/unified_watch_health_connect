package com.garmin.android.apps.connectmobile.incidentdetection.service;

import com.garmin.proto.generated.GDILiveTrackProto;
import cq0.f;
import cq0.l;
import kq0.e;
import kq0.g;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/b;", "Lkq0/e;", "<init>", "()V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements e {
    static {
        new a(null);
    }

    @Override // kq0.e
    public final g a(g gVar, com.garmin.android.apps.connectmobile.incidentdetection.service.a aVar) {
        gVar.getClass();
        aVar.getClass();
        kq0.a.a("WellnessIncidentDetectionReducer", "Reduce {" + aVar.f36880b + "} + " + gVar);
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.f) {
            com.garmin.android.apps.connectmobile.incidentdetection.service.a.f fVar = (com.garmin.android.apps.connectmobile.incidentdetection.service.a.f) aVar;
            return g.a(gVar, l.TICKING_TIMER_INCIDENT_DETECTED, fVar.f36886c, fVar.f36888e, fVar.f36887d, null, 0, 0, null, null, 4066);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.d) {
            return g.a(gVar, null, 0L, false, null, ((com.garmin.android.apps.connectmobile.incidentdetection.service.a.d) aVar).f36884c, 0, 0, null, null, 4031);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.p) {
            return g.a(gVar, l.USER_CAN_CANCEL_LIVE_TRACK, 0L, false, null, null, -1, 0, null, null, 3966);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.g) {
            return g.a(gVar, l.NOTIFYING_EMERGENCY_CONTACTS_INCIDENT_DETECTED, 0L, false, null, null, -1, 0, null, null, 3966);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.C0659a) {
            return g.a(gVar, l.FINISHED, 0L, false, null, null, -1, -1, f.FROM_DEVICE_CANCELLED_COUNTDOWN_TIMER_NO_CONTACTS_NOTIFIED, null, 2174);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.b) {
            return g.a(gVar, l.FINISHED, 0L, false, null, null, -1, 0, f.FROM_GCM_CANCELLED_TIMER_NO_CONTACTS_NOTIFIED, null, 2430);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.n) {
            com.garmin.android.apps.connectmobile.incidentdetection.service.a.n nVar = (com.garmin.android.apps.connectmobile.incidentdetection.service.a.n) aVar;
            return g.a(gVar, l.TICKING_TIMER_INCIDENT_DETECTED, nVar.f36896c, nVar.f36898e, nVar.f36897d, null, 0, 0, null, null, 4066);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.j) {
            return g.a(gVar, l.USER_CAN_CANCEL_LIVE_TRACK, 0L, false, null, null, 0, ((com.garmin.android.apps.connectmobile.incidentdetection.service.a.j) aVar).f36892c, null, null, 3838);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.i) {
            return g.a(gVar, l.FINISHED, 0L, false, null, null, 0, -1, f.FROM_GCM_I_AM_OKAY_TIMER_EXPIRED, null, 3326);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.e) {
            return g.a(gVar, l.FINISHED, 0L, false, null, null, -1, -1, ((com.garmin.android.apps.connectmobile.incidentdetection.service.a.e) aVar).f36885c, null, 3198);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.l) {
            return g.a(gVar, l.TICKING_TIMER_INCIDENT_DETECTED, 0L, false, null, null, ((com.garmin.android.apps.connectmobile.incidentdetection.service.a.l) aVar).f36894c, 0, null, null, 3966);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.o) {
            return gVar;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.k) {
            return g.a(gVar, null, 0L, false, null, null, ((com.garmin.android.apps.connectmobile.incidentdetection.service.a.k) aVar).f36893c, 0, null, null, 3967);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.m) {
            l lVar = l.USER_CAN_CANCEL_LIVE_TRACK;
            GDILiveTrackProto.StartRequest startRequest = ((com.garmin.android.apps.connectmobile.incidentdetection.service.a.m) aVar).f36895c;
            return g.a(gVar, lVar, 0L, startRequest.getSession().getSessionType() == GDILiveTrackProto.SessionType.FALL_DETECTION, null, null, 0, 0, null, startRequest, 2038);
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.c) {
            return gVar;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.h) {
            return g.a(gVar, l.FINISHED, 0L, false, null, null, 0, 0, f.FROM_GCM_I_AM_OKAY, null, 3582);
        }
        u0.r();
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/service/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
