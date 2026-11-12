package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.handlers.FindMyEdgeCommunicationHandler;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDICoreExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.c1;
import p13.h0;
import p13.l0;
import p13.w;
import p13.y;
import t13.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J\u001c\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002¨\u0006\u001a"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/CoreProtobufRequestHandler;", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/ProtobufRequestHandler;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "deviceId", "", "requestId", "", "requestMsg", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "<init>", "(Landroid/content/Context;JILcom/garmin/proto/generated/GDISmartProto$Smart;)V", "run", "", "handleGetLocationRequest", "requestType", "Lcom/garmin/proto/generated/GDICore$GetLocationRequest$RequestType;", "sendGetLocationResponse", "status", "Lcom/garmin/proto/generated/GDICore$GetLocationResponse$Status;", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "handleLocationUpdatedSetEnabledRequest", "locationUpdatedSetEnabledRequest", "Lcom/garmin/proto/generated/GDICore$LocationUpdatedSetEnabledRequest;", "Companion", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CoreProtobufRequestHandler extends ProtobufRequestHandler {
    private static final long CURRENT_LOCATION_REQUEST_TIMEOUT = 5000;
    private static final String TAG = "CoreProtobufReqHandler";
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreProtobufRequestHandler(Context context, long j8, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
        context.getClass();
        smart.getClass();
    }

    @SuppressLint({"MissingPermission"})
    private final void handleGetLocationRequest(GDICore.GetLocationRequest.RequestType requestType) {
        mv0.e eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
        boolean z14 = requestType == GDICore.GetLocationRequest.RequestType.EMERGENCY;
        a2 a2Var = a2.LOCATION;
        String strG = com.airbnb.lottie.animation.keyframe.a.g("Request getLocationRequest isEmergency[", "]", z14);
        i2.f36769a.getClass();
        i2.a.b(a2Var, TAG, strG);
        if (!eVar.a(TAG)) {
            i2.a.b(a2Var, TAG, "Request getLocationRequest -> Location Service disabled");
            sendGetLocationResponse$default(this, GDICore.GetLocationResponse.Status.LOCATION_SERVICES_DISABLED, null, 2, null);
            return;
        }
        Context context = this.contextRef.get();
        if (context == null) {
            i2.a.b(a2Var, TAG, "Request getLocationRequest -> context is null");
            sendGetLocationResponse$default(this, GDICore.GetLocationResponse.Status.TRY_AGAIN_LATER, null, 2, null);
            return;
        }
        j22.b.f96736a.getClass();
        if (!j22.b.c(context)) {
            i2.a.b(a2Var, TAG, "Request getLocationRequest -> location permission not granted");
            sendGetLocationResponse$default(this, GDICore.GetLocationResponse.Status.LOCATION_SERVICES_DISABLED, null, 2, null);
            return;
        }
        CoreProtobufRequestHandler$handleGetLocationRequest$lastKnownLocation$1 coreProtobufRequestHandler$handleGetLocationRequest$lastKnownLocation$1 = new CoreProtobufRequestHandler$handleGetLocationRequest$lastKnownLocation$1(eVar, null);
        h hVar = h.f161748a;
        Location location = (Location) ge1.b.W(hVar, coreProtobufRequestHandler$handleGetLocationRequest$lastKnownLocation$1);
        if (location != null) {
            if (Minutes.minutesBetween(new DateTime(location.getTime()), DateTime.now()).getMinutes() <= (z14 ? 5 : 15)) {
                i2.a.b(a2Var, TAG, "Request getLocationRequest -> use last known location");
                sendGetLocationResponse(GDICore.GetLocationResponse.Status.OK, location);
                return;
            }
        }
        i2.a.b(a2Var, TAG, "Request getLocationRequest -> last location too old, request current location");
        int i14 = z14 ? 100 : 102;
        Location location2 = (Location) ge1.b.W(hVar, new CoreProtobufRequestHandler$handleGetLocationRequest$currentLocation$1(eVar, i14, null));
        if (location2 != null) {
            int i15 = i14 == 100 ? 500 : 10000;
            if (location2.hasAccuracy() && location2.getAccuracy() <= i15) {
                i2.a.b(a2Var, TAG, "Request getLocationRequest -> use current location");
                sendGetLocationResponse(GDICore.GetLocationResponse.Status.OK, location2);
                return;
            }
        }
        i2.a.b(a2Var, TAG, "Request getLocationRequest -> try again later");
        sendGetLocationResponse$default(this, GDICore.GetLocationResponse.Status.TRY_AGAIN_LATER, null, 2, null);
    }

    private final void handleLocationUpdatedSetEnabledRequest(GDICore.LocationUpdatedSetEnabledRequest locationUpdatedSetEnabledRequest) {
        Set linkedHashSet;
        Object next;
        com.garmin.android.apps.connectmobile.util.location.b eVar;
        if (locationUpdatedSetEnabledRequest == null) {
            return;
        }
        if (!locationUpdatedSetEnabledRequest.getEnabled()) {
            com.garmin.android.apps.connectmobile.util.location.a aVar = com.garmin.android.apps.connectmobile.util.location.a.f47272a;
            long j8 = this.deviceId;
            Integer numValueOf = Integer.valueOf(this.requestId);
            aVar.getClass();
            com.garmin.android.apps.connectmobile.util.location.a.b(numValueOf, j8);
            return;
        }
        List<GDICore.LocationUpdatedSetEnabledRequest.Request> requestsList = locationUpdatedSetEnabledRequest.getRequestsList();
        requestsList.getClass();
        ArrayList arrayList = new ArrayList(y.r(requestsList, 10));
        Iterator<T> it = requestsList.iterator();
        while (it.hasNext()) {
            arrayList.add(((GDICore.LocationUpdatedSetEnabledRequest.Request) it.next()).getRequested());
        }
        com.garmin.android.apps.connectmobile.util.location.a aVar2 = com.garmin.android.apps.connectmobile.util.location.a.f47272a;
        long j14 = this.deviceId;
        int i14 = this.requestId;
        aVar2.getClass();
        Logger logger = com.garmin.android.apps.connectmobile.util.location.a.f47273b;
        boolean zIsEmpty = arrayList.isEmpty();
        List<GDICore.LocationData.DataType> listC = arrayList;
        if (zIsEmpty) {
            listC = w.c(GDICore.LocationData.DataType.SIGNIFICANT_LOCATION);
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (GDICore.LocationData.DataType dataType : listC) {
            com.garmin.android.apps.connectmobile.util.location.b.f47275f.getClass();
            dataType.getClass();
            int number = dataType.getNumber();
            if (number == GDICore.LocationData.DataType.SIGNIFICANT_LOCATION.getNumber()) {
                eVar = new com.garmin.android.apps.connectmobile.util.location.d(j14, i14);
            } else if (number == GDICore.LocationData.DataType.REALTIME_TRACKING.getNumber()) {
                eVar = new com.garmin.android.apps.connectmobile.util.location.c(j14, i14);
            } else {
                String strN = fb1.c.n("Unknown GDICore.LocationData.DataType: ", dataType.name());
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "LocationSubscription", strN);
                eVar = new com.garmin.android.apps.connectmobile.util.location.e(j14, i14, dataType);
            }
            linkedHashSet2.add(eVar);
        }
        logger.debug("subscribe: received new subscriptions request for " + j14 + " with: " + linkedHashSet2);
        Set<com.garmin.android.apps.connectmobile.util.location.b> set = com.garmin.android.apps.connectmobile.util.location.a.f47274c.get(Long.valueOf(j14));
        if (set != null) {
            linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                com.garmin.android.apps.connectmobile.util.location.b bVar = (com.garmin.android.apps.connectmobile.util.location.b) obj;
                if (s.g(bVar.f47280e, com.garmin.android.apps.connectmobile.util.location.b.c.a.f47282a) || s.g(bVar.f47280e, com.garmin.android.apps.connectmobile.util.location.b.c.d.f47285a)) {
                    linkedHashSet.add(obj);
                }
            }
        } else {
            linkedHashSet = l0.f134950a;
        }
        logger.debug("subscribe: prevActiveOrPendingSubscriptions for " + j14 + " are: " + linkedHashSet);
        Set setG = c1.g(linkedHashSet2, linkedHashSet);
        Set setG2 = c1.g(linkedHashSet, linkedHashSet2);
        logger.debug("subscribe: toSubscribe for " + j14 + " are: " + setG);
        logger.debug("subscribe: toUnSubscribe for " + j14 + " are: " + setG2);
        Set set2 = setG;
        Iterator it3 = set2.iterator();
        while (it3.hasNext()) {
            ((com.garmin.android.apps.connectmobile.util.location.b) it3.next()).a().a();
        }
        Set set3 = setG2;
        Iterator it4 = set3.iterator();
        while (it4.hasNext()) {
            ((com.garmin.android.apps.connectmobile.util.location.b) it4.next()).b().a();
        }
        Iterator it5 = h0.h0(linkedHashSet, linkedHashSet2).iterator();
        while (it5.hasNext()) {
            ((com.garmin.android.apps.connectmobile.util.location.b) it5.next()).f47279d = false;
        }
        com.garmin.android.apps.connectmobile.util.location.a.c(j14, c1.h(c1.g(linkedHashSet, set3), set2));
        Iterator it6 = linkedHashSet2.iterator();
        do {
            if (!it6.hasNext()) {
                next = null;
                break;
            }
            next = it6.next();
        } while (!s.g(((com.garmin.android.apps.connectmobile.util.location.b) next).f47280e, com.garmin.android.apps.connectmobile.util.location.b.c.d.f47285a));
        if (next != null) {
            logger.debug("subscribe: pending subscription(s) exist(s), deferring device response");
        } else {
            com.garmin.android.apps.connectmobile.util.location.a.a(i14, j14);
        }
    }

    private final void sendGetLocationResponse(GDICore.GetLocationResponse.Status status, Location location) {
        GDICore.GetLocationResponse.Builder builderNewBuilder = GDICore.GetLocationResponse.newBuilder();
        builderNewBuilder.setStatus(status);
        if (location != null) {
            builderNewBuilder.setLocationData(zb1.b.b(new i22.d(location, null, 2, null)).build());
        }
        GDICore.CoreService.Builder builderNewBuilder2 = GDICore.CoreService.newBuilder();
        builderNewBuilder2.setGetLocationResponse(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDICoreExtension.coreService, builderNewBuilder2.build());
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        int i14 = this.requestId;
        long j8 = this.deviceId;
        GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
        smartBuild.getClass();
        protobufRequestManager.respondToRequest(i14, j8, smartBuild);
        a2 a2Var = a2.LOCATION;
        String str = "Responded to getLocationRequest with status: " + builderNewBuilder.getStatus() + " and location: " + location;
        i2.f36769a.getClass();
        i2.a.b(a2Var, TAG, str);
    }

    public static /* synthetic */ void sendGetLocationResponse$default(CoreProtobufRequestHandler coreProtobufRequestHandler, GDICore.GetLocationResponse.Status status, Location location, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            location = null;
        }
        coreProtobufRequestHandler.sendGetLocationResponse(status, location);
    }

    @Override // java.lang.Runnable
    public void run() {
        GDICore.CoreService coreService = ProtoUtil.INSTANCE.getCoreService(this.requestMsg);
        if (coreService == null) {
            return;
        }
        if (coreService.hasGetLocationRequest()) {
            GDICore.GetLocationRequest.RequestType requestType = coreService.getGetLocationRequest().hasRequestType() ? coreService.getGetLocationRequest().getRequestType() : GDICore.GetLocationRequest.RequestType.STANDARD;
            requestType.getClass();
            handleGetLocationRequest(requestType);
        } else if (coreService.hasLocationUpdatedSetEnabledRequest()) {
            handleLocationUpdatedSetEnabledRequest(coreService.getLocationUpdatedSetEnabledRequest());
        } else if (coreService.hasLocationUpdatedNotification()) {
            FindMyEdgeCommunicationHandler.getInstance().handleLocationUpdatedNotification(coreService.getLocationUpdatedNotification(), this.deviceId);
        }
    }
}
