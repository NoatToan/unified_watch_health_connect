package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDIEventSharingExtension;
import com.garmin.proto.generated.GDIEventSharingProto;
import com.garmin.proto.generated.GDILiveTrackExtension;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import f12.l;
import gg1.k;
import hk0.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003'()B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0087@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0087@¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingSubscriptionHandler;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceRecordUnitId", "Lgu0/b;", "settings", "", "sendSubscription", "(Landroid/content/Context;JLgu0/b;Lt13/d;)Ljava/lang/Object;", "unitId", "Lkk2/a;", "getEventSharingHandler", "(J)Lkk2/a;", "", "anonymousSession", "deviceId", "setLiveTrackAnonymousSession", "(ZJ)V", "cancelSubscription", "(JLt13/d;)Ljava/lang/Object;", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingSubscriptionHandler$SupportedAlerts;", "supportedAlertsCallback", "fetchDeviceSupportedEvents", "(JLcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingSubscriptionHandler$SupportedAlerts;)V", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingSubscriptionHandler$DeviceSupportedLTFeaturesCallBack;", "deviceSupportedLTFeaturesCallBack", "askDeviceForLTSupportedFeatures", "(JLcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingSubscriptionHandler$DeviceSupportedLTFeaturesCallBack;)V", "", "TAG", "Ljava/lang/String;", "", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingSubscriptionHandler$Subscription;", "subscribers", "Ljava/util/Map;", "Subscription", "SupportedAlerts", "DeviceSupportedLTFeaturesCallBack", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventSharingSubscriptionHandler {
    private static final String TAG = "EventSharingSubscriptionHandler";
    public static final EventSharingSubscriptionHandler INSTANCE = new EventSharingSubscriptionHandler();
    private static final Map<Long, Subscription> subscribers = new LinkedHashMap();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingSubscriptionHandler$DeviceSupportedLTFeaturesCallBack;", "", "Lgg1/k;", "deviceSupportedLiveTrackFeatures", "", "onResponse", "(Lgg1/k;)V", "onResponseFailed", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface DeviceSupportedLTFeaturesCallBack {
        void onResponse(k deviceSupportedLiveTrackFeatures);

        void onResponseFailed();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingSubscriptionHandler$Subscription;", "", "requestHandler", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingRequestHandler;", "alertTypes", "", "Lcom/garmin/proto/generated/GDIEventSharingProto$AlertType;", "<init>", "(Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingRequestHandler;Ljava/util/List;)V", "getRequestHandler", "()Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingRequestHandler;", "getAlertTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Subscription {
        private final List<GDIEventSharingProto.AlertType> alertTypes;
        private final EventSharingRequestHandler requestHandler;

        /* JADX WARN: Multi-variable type inference failed */
        public Subscription(EventSharingRequestHandler eventSharingRequestHandler, List<? extends GDIEventSharingProto.AlertType> list) {
            eventSharingRequestHandler.getClass();
            list.getClass();
            this.requestHandler = eventSharingRequestHandler;
            this.alertTypes = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Subscription copy$default(Subscription subscription, EventSharingRequestHandler eventSharingRequestHandler, List list, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                eventSharingRequestHandler = subscription.requestHandler;
            }
            if ((i14 & 2) != 0) {
                list = subscription.alertTypes;
            }
            return subscription.copy(eventSharingRequestHandler, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EventSharingRequestHandler getRequestHandler() {
            return this.requestHandler;
        }

        public final List<GDIEventSharingProto.AlertType> component2() {
            return this.alertTypes;
        }

        public final Subscription copy(EventSharingRequestHandler requestHandler, List<? extends GDIEventSharingProto.AlertType> alertTypes) {
            requestHandler.getClass();
            alertTypes.getClass();
            return new Subscription(requestHandler, alertTypes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) other;
            return s.g(this.requestHandler, subscription.requestHandler) && s.g(this.alertTypes, subscription.alertTypes);
        }

        public final List<GDIEventSharingProto.AlertType> getAlertTypes() {
            return this.alertTypes;
        }

        public final EventSharingRequestHandler getRequestHandler() {
            return this.requestHandler;
        }

        public int hashCode() {
            return this.alertTypes.hashCode() + (this.requestHandler.hashCode() * 31);
        }

        public String toString() {
            return "Subscription(requestHandler=" + this.requestHandler + ", alertTypes=" + this.alertTypes + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/EventSharingSubscriptionHandler$SupportedAlerts;", "", "onResponse", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface SupportedAlerts {
        void onResponse();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.EventSharingSubscriptionHandler$sendSubscription$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.EventSharingSubscriptionHandler", f = "EventSharingSubscriptionHandler.kt", l = {149, 159}, m = "sendSubscription", v = 2)
    public static final class C38801 extends v13.c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C38801(t13.d<? super C38801> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventSharingSubscriptionHandler.sendSubscription(null, 0L, null, this);
        }
    }

    private EventSharingSubscriptionHandler() {
    }

    public static final void askDeviceForLTSupportedFeatures(final long deviceId, final DeviceSupportedLTFeaturesCallBack deviceSupportedLTFeaturesCallBack) {
        if (deviceId == -1 || !p.k(deviceId)) {
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            String strF = a0.f(deviceId, "Device ", " disconnected or unknown error");
            i2.f36769a.getClass();
            i2.a.f(a2Var, TAG, strF);
        }
        GDILiveTrackProto.LiveTrackService.Builder builderNewBuilder = GDILiveTrackProto.LiveTrackService.newBuilder();
        builderNewBuilder.setSessionSupportRequest(GDILiveTrackProto.SessionSupportRequest.newBuilder().build());
        GDILiveTrackProto.LiveTrackService liveTrackServiceBuild = builderNewBuilder.build();
        GDISmartProto.Smart.Builder builderNewBuilder2 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder2.getClass();
        liveTrackServiceBuild.getClass();
        builderNewBuilder2.setExtension(GDILiveTrackExtension.liveTrackService, liveTrackServiceBuild);
        GDISmartProto.Smart smartBuild = builderNewBuilder2.build();
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        smartBuild.getClass();
        protobufRequestManager.initiateRequest(smartBuild, deviceId, new wm2.b() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.EventSharingSubscriptionHandler.askDeviceForLTSupportedFeatures.1
            @Override // wm2.b
            public void onResponseFailed(int requestId) {
                a2 a2Var2 = a2.LIVE_EVENT_SHARING;
                String strE = org.apache.commons.lang3.e.e(deviceId, "Something went wrong trying to get LiveTrack features for ");
                i2.f36769a.getClass();
                i2.a.f(a2Var2, EventSharingSubscriptionHandler.TAG, strE);
                DeviceSupportedLTFeaturesCallBack deviceSupportedLTFeaturesCallBack2 = deviceSupportedLTFeaturesCallBack;
                if (deviceSupportedLTFeaturesCallBack2 != null) {
                    deviceSupportedLTFeaturesCallBack2.onResponseFailed();
                }
            }

            @Override // wm2.b
            public void onResponseReceived(int requestId, GDISmartProto.Smart message) {
                Object next;
                message.getClass();
                List<GDILiveTrackProto.DeviceType> supportedSessionTypesList = de2.a0.a(message).getSessionSupportResponse().getSupportedSessionTypesList();
                supportedSessionTypesList.getClass();
                Iterator<T> it = supportedSessionTypesList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((GDILiveTrackProto.DeviceType) next) != GDILiveTrackProto.DeviceType.LIVEEVENT);
                GDILiveTrackProto.DeviceType deviceType = (GDILiveTrackProto.DeviceType) next;
                boolean spectatorMessagingSupported = de2.a0.a(message).getSessionSupportResponse().getSpectatorMessagingSupported();
                boolean z14 = deviceType != null;
                a2 a2Var2 = a2.LIVE_EVENT_SHARING;
                String str = "DeviceId: " + deviceId + " supports GDILiveTrackProto.DeviceType.LIVEEVENT, value: " + z14;
                i2.f36769a.getClass();
                i2.a.k(a2Var2, EventSharingSubscriptionHandler.TAG, str);
                k kVar = new k(Boolean.valueOf(spectatorMessagingSupported), Boolean.valueOf(z14));
                l.f68084a.getClass();
                l.a.a().c4(deviceId, kVar);
                ru0.b bVar = new ru0.b(l.a.a());
                if (!bVar.c()) {
                    bVar.f154576a.O2("userHasLiveEventSharingCapableDevice", z14);
                }
                DeviceSupportedLTFeaturesCallBack deviceSupportedLTFeaturesCallBack2 = deviceSupportedLTFeaturesCallBack;
                if (deviceSupportedLTFeaturesCallBack2 != null) {
                    deviceSupportedLTFeaturesCallBack2.onResponse(kVar);
                }
            }
        });
    }

    public static /* synthetic */ void askDeviceForLTSupportedFeatures$default(long j8, DeviceSupportedLTFeaturesCallBack deviceSupportedLTFeaturesCallBack, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            deviceSupportedLTFeaturesCallBack = null;
        }
        askDeviceForLTSupportedFeatures(j8, deviceSupportedLTFeaturesCallBack);
    }

    public static final Object cancelSubscription(long j8, t13.d<? super Unit> dVar) {
        Subscription subscription;
        if (j8 == -1 || !p.k(j8)) {
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, TAG, "In cancelSubscription(): Did not send proto. Either mDeviceRecord is null or the handshake is not completed.");
            return Unit.INSTANCE;
        }
        EventSharingSubscriptionHandler eventSharingSubscriptionHandler = INSTANCE;
        kk2.a eventSharingHandler = eventSharingSubscriptionHandler.getEventSharingHandler(j8);
        Map<Long, Subscription> map = subscribers;
        synchronized (map) {
            subscription = map.get(new Long(j8));
            Unit unit = Unit.INSTANCE;
        }
        if (subscription != null) {
            eventSharingSubscriptionHandler.setLiveTrackAnonymousSession(false, j8);
            a2 a2Var2 = a2.LIVE_EVENT_SHARING;
            String strE = org.apache.commons.lang3.e.e(j8, "In cancelSubscription() deviceRecordUnitId: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, TAG, strE);
            if (eventSharingHandler != null) {
                Subscription subscription2 = subscription;
                Object objL = eventSharingHandler.l(subscription2.getAlertTypes(), subscription2.getRequestHandler(), dVar);
                return objL == u13.a.COROUTINE_SUSPENDED ? objL : Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    public static final void fetchDeviceSupportedEvents(final long deviceId, final SupportedAlerts supportedAlertsCallback) {
        if (deviceId == -1 || !p.k(deviceId)) {
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            String strF = a0.f(deviceId, "Device ", " disconnected or unknown error");
            i2.f36769a.getClass();
            i2.a.f(a2Var, TAG, strF);
        }
        GDIEventSharingProto.EventSharingService eventSharingServiceBuild = GDIEventSharingProto.EventSharingService.newBuilder().setSupportRequest(GDIEventSharingProto.AlertSupportRequest.newBuilder()).build();
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.setExtension(GDIEventSharingExtension.eventSharing, eventSharingServiceBuild);
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDISmartProto.Smart smartBuild = builderNewBuilder.build();
        smartBuild.getClass();
        protobufRequestManager.initiateRequest(smartBuild, deviceId, new wm2.b() { // from class: com.garmin.android.apps.connectmobile.gfdi.protobuf.EventSharingSubscriptionHandler.fetchDeviceSupportedEvents.1
            @Override // wm2.b
            public void onResponseFailed(int requestId) {
                a2 a2Var2 = a2.LIVE_EVENT_SHARING;
                String strE = org.apache.commons.lang3.e.e(deviceId, "Something went wrong trying to get supported events for ");
                i2.f36769a.getClass();
                i2.a.f(a2Var2, EventSharingSubscriptionHandler.TAG, strE);
                SupportedAlerts supportedAlerts = supportedAlertsCallback;
                if (supportedAlerts != null) {
                    supportedAlerts.onResponse();
                }
            }

            @Override // wm2.b
            public void onResponseReceived(int requestId, GDISmartProto.Smart message) {
                message.getClass();
                ArrayList arrayList = new ArrayList();
                GDIEventSharingProto.EventSharingService eventSharingService = (GDIEventSharingProto.EventSharingService) message.getExtension((GeneratedMessage.GeneratedExtension) GDIEventSharingExtension.eventSharing);
                List<GDIEventSharingProto.AlertType> supportedAlertsList = eventSharingService.getSupportResponse().getSupportedAlertsList();
                List<Integer> versionNumList = eventSharingService.getSupportResponse().getVersionNumList();
                int size = supportedAlertsList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    GDIEventSharingProto.AlertType alertType = (GDIEventSharingProto.AlertType) h0.e0(i14, supportedAlertsList);
                    versionNumList.getClass();
                    Integer num = (Integer) h0.e0(i14, versionNumList);
                    if (alertType != null && num != null) {
                        arrayList.add(new iu0.a(alertType.name(), num.intValue()));
                    }
                }
                a2 a2Var2 = a2.LIVE_EVENT_SHARING;
                String str = "Received the device alert types for deviceId: " + deviceId + ", alerts: " + arrayList;
                i2.f36769a.getClass();
                i2.a.k(a2Var2, EventSharingSubscriptionHandler.TAG, str);
                iu0.g gVar = new iu0.g(arrayList);
                long j8 = deviceId;
                GCMSettingManager.f41536b.edit().putString(GCMSettingManager.f41535a.getString(R.string.key_live_event_sharing_alerts) + "_" + j8, GsonUtil.a(gVar)).commit();
                l.f68084a.getClass();
                ru0.b bVar = new ru0.b(l.a.a());
                if (!bVar.b()) {
                    bVar.a(dh.b.F(arrayList));
                }
                l.a.a().H0(true);
                SupportedAlerts supportedAlerts = supportedAlertsCallback;
                if (supportedAlerts != null) {
                    supportedAlerts.onResponse();
                }
            }
        });
    }

    public static /* synthetic */ void fetchDeviceSupportedEvents$default(long j8, SupportedAlerts supportedAlerts, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            supportedAlerts = null;
        }
        fetchDeviceSupportedEvents(j8, supportedAlerts);
    }

    private final kk2.a getEventSharingHandler(long unitId) {
        da2.b bVarX = ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).x();
        for (DeviceProfile deviceProfile : bVarX.a(unitId)) {
            String macAddress = deviceProfile.getMacAddress();
            macAddress.getClass();
            kk2.a aVar = (kk2.a) bVarX.getCapability(macAddress, kk2.a.class);
            if (aVar != null) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:92:0x0292 A[LOOP:0: B:90:0x028c->B:92:0x0292, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x02c7  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e5, code lost:
    
        if (r2.d(r10, r8, r6, r4) == r5) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object sendSubscription(Context context, long j8, gu0.b bVar, t13.d<? super Unit> dVar) {
        C38801 c38801;
        int i14;
        Integer num;
        iu0.a aVar;
        ?? r14;
        Context context2;
        Integer num2;
        kk2.a aVar2;
        List<iu0.a> listA;
        Object next;
        List list;
        kk2.a aVar3;
        ArrayList arrayList;
        Iterator it;
        Subscription subscription;
        Map<Long, Subscription> map;
        List list2;
        long j14 = j8;
        if (dVar instanceof C38801) {
            c38801 = (C38801) dVar;
            int i15 = c38801.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c38801.label = i15 - Integer.MIN_VALUE;
            } else {
                c38801 = new C38801(dVar);
            }
        } else {
            c38801 = new C38801(dVar);
        }
        Object obj = c38801.result;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i16 = c38801.label;
        if (i16 != 0) {
            if (i16 == 1) {
                int i17 = c38801.I$0;
                long j15 = c38801.J$0;
                kk2.a aVar5 = (kk2.a) c38801.L$6;
                num2 = (Integer) c38801.L$3;
                List list3 = (List) c38801.L$2;
                context2 = (Context) c38801.L$0;
                r.b(obj);
                i14 = i17;
                j14 = j15;
                aVar2 = aVar5;
                list2 = list3;
            } else {
                if (i16 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        if (j14 == -1 || !p.k(j14) || !cu0.g.c(j14)) {
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            String strE = org.apache.commons.lang3.e.e(j14, "In sendSubscription(): Did not send proto. Either deviceUnit is invalid, handshake is not completed or live event sharing is not supported. deviceRecordUnitId: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, TAG, strE);
            return Unit.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        GDIEventSharingProto.AlertMessage alertMessageBuild = GDIEventSharingProto.AlertMessage.newBuilder().setType(GDIEventSharingProto.AlertType.ACTIVITY_START).build();
        alertMessageBuild.getClass();
        arrayList2.add(alertMessageBuild);
        GDIEventSharingProto.AlertMessage alertMessageBuild2 = GDIEventSharingProto.AlertMessage.newBuilder().setType(GDIEventSharingProto.AlertType.ACTIVITY_STOP).build();
        alertMessageBuild2.getClass();
        arrayList2.add(alertMessageBuild2);
        List<ju0.c> list4 = bVar.f79040e;
        if (list4 != null && list4.contains(ju0.c.DISTANCE) && bVar.f79043h != null) {
            GDIEventSharingProto.AlertMessage alertMessageBuild3 = GDIEventSharingProto.AlertMessage.newBuilder().setType(GDIEventSharingProto.AlertType.ACTIVITY_DISTANCE).setInterval(bVar.f79043h.intValue()).build();
            alertMessageBuild3.getClass();
            arrayList2.add(alertMessageBuild3);
        }
        List<ju0.c> list5 = bVar.f79040e;
        if (list5 != null && list5.contains(ju0.c.EVERY_LAP)) {
            GDIEventSharingProto.AlertMessage alertMessageBuild4 = GDIEventSharingProto.AlertMessage.newBuilder().setType(GDIEventSharingProto.AlertType.ACTIVITY_AUTO_LAP).build();
            alertMessageBuild4.getClass();
            arrayList2.add(alertMessageBuild4);
            GDIEventSharingProto.AlertMessage alertMessageBuild5 = GDIEventSharingProto.AlertMessage.newBuilder().setType(GDIEventSharingProto.AlertType.ACTIVITY_MANUAL_LAP).build();
            alertMessageBuild5.getClass();
            arrayList2.add(alertMessageBuild5);
        }
        List<ju0.c> list6 = bVar.f79040e;
        if (list6 != null && list6.contains(ju0.c.EVERY_TRANSITION)) {
            GDIEventSharingProto.AlertMessage alertMessageBuild6 = GDIEventSharingProto.AlertMessage.newBuilder().setType(GDIEventSharingProto.AlertType.ACTIVITY_TRANSITION).build();
            alertMessageBuild6.getClass();
            arrayList2.add(alertMessageBuild6);
        }
        List<ju0.b> list7 = bVar.f79041f;
        i14 = (list7 == null || !list7.contains(ju0.b.EST_COMPLETION_TIME) || bVar.f79042g == null) ? 0 : 1;
        num = i14 != 0 ? bVar.f79042g : null;
        INSTANCE.setLiveTrackAnonymousSession(s.g(bVar.f79039d, Boolean.TRUE), j14);
        iu0.g gVarQ = GCMSettingManager.q(j14);
        if (gVarQ == null || (listA = gVarQ.a()) == null) {
            aVar = null;
        } else {
            Iterator<T> it3 = listA.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!s.g(((iu0.a) next).getAlert(), "ACTIVITY_TIME"));
            aVar = (iu0.a) next;
        }
        List<ju0.c> list8 = bVar.f79040e;
        if (list8 != null && list8.contains(ju0.c.TIME) && bVar.f79044i != null) {
            int millis = (aVar == null || aVar.getVersionNumber() != 3) ? (int) TimeUnit.SECONDS.toMillis(bVar.f79044i.intValue()) : bVar.f79044i.intValue();
            i2.f36769a.getClass();
            i2.a.b(a2.LIVE_EVENT_SHARING, TAG, "timeDuration is: " + bVar + " in seconds");
            GDIEventSharingProto.AlertMessage alertMessageBuild7 = GDIEventSharingProto.AlertMessage.newBuilder().setType(GDIEventSharingProto.AlertType.ACTIVITY_TIME).setInterval(millis).build();
            alertMessageBuild7.getClass();
            arrayList2.add(alertMessageBuild7);
        }
        kk2.a eventSharingHandler = INSTANCE.getEventSharingHandler(j14);
        r0 r0Var = new r0();
        Map<Long, Subscription> map2 = subscribers;
        synchronized (map2) {
            r14 = map2.get(new Long(j14));
            r0Var.f105810a = r14;
            Unit unit = Unit.INSTANCE;
        }
        if (r14 != 0) {
            a2 a2Var2 = a2.LIVE_EVENT_SHARING;
            String strF = a0.f(j14, "sendSubscription() unsubscribing previous handler for ", " to prevent duplicate SMS");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, TAG, strF);
            if (eventSharingHandler != null) {
                List<GDIEventSharingProto.AlertType> alertTypes = ((Subscription) r0Var.f105810a).getAlertTypes();
                EventSharingRequestHandler requestHandler = ((Subscription) r0Var.f105810a).getRequestHandler();
                c38801.L$0 = context;
                c38801.L$1 = null;
                c38801.L$2 = arrayList2;
                c38801.L$3 = num;
                c38801.L$4 = null;
                c38801.L$5 = null;
                c38801.L$6 = eventSharingHandler;
                c38801.L$7 = null;
                c38801.J$0 = j14;
                c38801.I$0 = i14;
                c38801.label = 1;
                if (eventSharingHandler.l(alertTypes, requestHandler, c38801) != aVar4) {
                    num2 = num;
                    context2 = context;
                    aVar2 = eventSharingHandler;
                    list2 = arrayList2;
                }
            }
            return aVar4;
        }
        context2 = context;
        aVar3 = eventSharingHandler;
        list = arrayList2;
        EventSharingRequestHandler eventSharingRequestHandler = new EventSharingRequestHandler(context2, j14);
        arrayList = new ArrayList(y.r(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((GDIEventSharingProto.AlertMessage) it.next()).getType());
        }
        subscription = new Subscription(eventSharingRequestHandler, arrayList);
        map = subscribers;
        synchronized (map) {
            map.put(new Long(j14), subscription);
            Unit unit2 = Unit.INSTANCE;
        }
        a2 a2Var3 = a2.LIVE_EVENT_SHARING;
        String strE2 = org.apache.commons.lang3.e.e(j14, "sendSubscription() deviceRecordUnitId: ");
        i2.f36769a.getClass();
        i2.a.b(a2Var3, TAG, strE2);
        if (aVar3 != null) {
            return Unit.INSTANCE;
        }
        c38801.L$0 = null;
        c38801.L$1 = null;
        c38801.L$2 = null;
        c38801.L$3 = null;
        c38801.L$4 = null;
        c38801.L$5 = null;
        c38801.L$6 = null;
        c38801.L$7 = null;
        c38801.L$8 = null;
        c38801.L$9 = null;
        c38801.J$0 = j14;
        c38801.I$0 = i14;
        c38801.label = 2;
        aVar3 = aVar2;
        num = num2;
        list = list2;
        EventSharingRequestHandler eventSharingRequestHandler2 = new EventSharingRequestHandler(context2, j14);
        arrayList = new ArrayList(y.r(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((GDIEventSharingProto.AlertMessage) it.next()).getType());
        }
        subscription = new Subscription(eventSharingRequestHandler2, arrayList);
        map = subscribers;
        synchronized (map) {
            map.put(new Long(j14), subscription);
            Unit unit3 = Unit.INSTANCE;
            a2 a2Var4 = a2.LIVE_EVENT_SHARING;
            String strE3 = org.apache.commons.lang3.e.e(j14, "sendSubscription() deviceRecordUnitId: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var4, TAG, strE3);
            if (aVar3 != null) {
                return Unit.INSTANCE;
            }
            c38801.L$0 = null;
            c38801.L$1 = null;
            c38801.L$2 = null;
            c38801.L$3 = null;
            c38801.L$4 = null;
            c38801.L$5 = null;
            c38801.L$6 = null;
            c38801.L$7 = null;
            c38801.L$8 = null;
            c38801.L$9 = null;
            c38801.J$0 = j14;
            c38801.I$0 = i14;
            c38801.label = 2;
        }
    }

    private final void setLiveTrackAnonymousSession(boolean anonymousSession, long deviceId) {
        i2.f36769a.getClass();
        i2.a.b(a2.LIVE_EVENT_SHARING, TAG, "setLiveTrackAnonymousSession() deviceRecordUnitId: " + deviceId + ", anonymousSession: " + anonymousSession);
        GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDILiveTrackExtension.liveTrackService, GDILiveTrackProto.LiveTrackService.newBuilder().setLiveEventSharingNotification(GDILiveTrackProto.LiveEventSharingNotification.newBuilder().setLivetrackRequested(anonymousSession).build()).build()).build();
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        smartBuild.getClass();
        protobufRequestManager.initiateNotification(smartBuild, deviceId);
    }

    public static final void fetchDeviceSupportedEvents(long j8) {
        fetchDeviceSupportedEvents$default(j8, null, 2, null);
    }

    public static final void askDeviceForLTSupportedFeatures(long j8) {
        askDeviceForLTSupportedFeatures$default(j8, null, 2, null);
    }
}
