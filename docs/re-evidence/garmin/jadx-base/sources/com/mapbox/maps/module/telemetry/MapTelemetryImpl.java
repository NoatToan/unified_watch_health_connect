package com.mapbox.maps.module.telemetry;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.Gson;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Event;
import com.mapbox.common.EventPriority;
import com.mapbox.common.EventsServerOptions;
import com.mapbox.common.EventsService;
import com.mapbox.common.EventsServiceInterface;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.TelemetryCollectionState;
import com.mapbox.common.TelemetryService;
import com.mapbox.common.TelemetryUtils;
import com.mapbox.common.TurnstileEvent;
import com.mapbox.common.UserSKUIdentifier;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.module.MapTelemetry;
import e23.p;
import ge1.b;
import kg.f;
import o13.r;
import o53.a0;
import o53.b0;
import o53.c0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import t13.d;
import t13.g;
import u13.a;
import v13.e;
import v13.i;
import vb.h;
import x53.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u0019\u0010!\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;", "Lcom/mapbox/maps/module/MapTelemetry;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "Lcom/mapbox/common/EventsServiceInterface;", "eventsService", "Lcom/mapbox/common/TelemetryService;", "telemetryService", "Lcom/mapbox/common/EventsServerOptions;", "eventsServerOptions", "Lo53/z;", "defaultCoroutineDispatcher", "(Landroid/content/Context;Lcom/mapbox/common/EventsServiceInterface;Lcom/mapbox/common/TelemetryService;Lcom/mapbox/common/EventsServerOptions;Lo53/z;)V", "", "sendMapLoadEvent", "()V", "", "shouldSendEvents", "()Z", "", "event", "sendEvent", "(Ljava/lang/String;)V", "enabled", "enableTelemetryCollection", "(Z)V", "onAppUserTurnstileEvent", "setUserTelemetryRequestState", "disableTelemetrySession", "Landroid/os/Bundle;", "data", "onPerformanceEvent", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "Lcom/mapbox/common/EventsServiceInterface;", "Lcom/mapbox/common/TelemetryService;", "eventsServiceOptions", "Lcom/mapbox/common/EventsServerOptions;", "Lo53/b0;", "bgScope", "Lo53/b0;", "Companion", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapTelemetryImpl implements MapTelemetry {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "MapTelemetryImpl";
    private final Context appContext;
    private final b0 bgScope;
    private final EventsServiceInterface eventsService;
    private final EventsServerOptions eventsServiceOptions;
    private final TelemetryService telemetryService;

    /* JADX INFO: renamed from: com.mapbox.maps.module.telemetry.MapTelemetryImpl$sendMapLoadEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
    @e(c = "com.mapbox.maps.module.telemetry.MapTelemetryImpl$sendMapLoadEvent$1", f = "MapTelemetryImpl.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, d<? super Unit>, Object> {
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return MapTelemetryImpl.this.new AnonymousClass1(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            try {
                MapLoadEvent mapLoadEventBuildMapLoadEvent = MapEventFactory.INSTANCE.buildMapLoadEvent(new PhoneState(MapTelemetryImpl.this.appContext));
                MapTelemetryImpl mapTelemetryImpl = MapTelemetryImpl.this;
                String json = new Gson().toJson(mapLoadEventBuildMapLoadEvent);
                json.getClass();
                mapTelemetryImpl.sendEvent(json);
            } catch (Throwable th3) {
                MapboxLogger.logW(MapTelemetryImpl.TAG, "sendMapLoadEvent error: " + th3);
            }
            return Unit.INSTANCE;
        }
    }

    public MapTelemetryImpl(Context context) {
        context.getClass();
        this.appContext = context;
        EventsServerOptions eventsServerOptions = new EventsServerOptions(new SdkInformation(com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_IDENTIFIER, com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_VERSION, null), null);
        this.eventsServiceOptions = eventsServerOptions;
        EventsService orCreate = EventsService.getOrCreate(eventsServerOptions);
        orCreate.getClass();
        this.eventsService = orCreate;
        TelemetryService orCreate2 = TelemetryService.getOrCreate();
        orCreate2.getClass();
        this.telemetryService = orCreate2;
        g gVarPlus = new a0(TAG).plus(b.h());
        c cVar = s0.f129406a;
        this.bgScope = c0.a(gVarPlus.plus(x53.b.f189152a));
    }

    private final void enableTelemetryCollection(boolean enabled) {
        TelemetryUtils.setEventsCollectionState(enabled, new com.mapbox.maps.p(17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableTelemetryCollection$lambda$3(Expected expected) {
        expected.getClass();
        if (expected.isError()) {
            MapboxLogger.logE(TAG, "setEventsCollectionState error: " + expected.getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAppUserTurnstileEvent$lambda$0(Expected expected) {
        expected.getClass();
        if (expected.isError()) {
            MapboxLogger.logE(TAG, "sendTurnstileEvent error: " + expected.getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String event) {
        Expected<String, Value> expectedFromJson = Value.fromJson(event);
        expectedFromJson.getClass();
        Value value = expectedFromJson.getValue();
        Event event2 = value != null ? new Event(EventPriority.QUEUED, value, null) : null;
        if (event2 != null) {
            this.eventsService.sendEvent(event2, new com.mapbox.maps.p(16));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendEvent$lambda$2(Expected expected) {
        expected.getClass();
        if (expected.isError()) {
            MapboxLogger.logE(TAG, "sendEvent error: " + expected.getError());
        }
    }

    private final void sendMapLoadEvent() {
        b.T(this.bgScope, null, null, new AnonymousClass1(null), 3);
    }

    private final boolean shouldSendEvents() {
        return TelemetryUtils.getClientServerEventsCollectionState() != TelemetryCollectionState.TURNSTILE_EVENTS_ONLY;
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void disableTelemetrySession() {
        enableTelemetryCollection(false);
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void onAppUserTurnstileEvent() {
        this.eventsService.sendTurnstileEvent(new TurnstileEvent(UserSKUIdentifier.MAPS_MAUS), new com.mapbox.maps.p(15));
        if (shouldSendEvents()) {
            sendMapLoadEvent();
        }
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void onPerformanceEvent(Bundle data) {
        if (shouldSendEvents()) {
            MapEventFactory mapEventFactory = MapEventFactory.INSTANCE;
            PhoneState phoneState = new PhoneState(this.appContext);
            String strC = f.c();
            if (data == null) {
                data = new Bundle();
            }
            String json = new Gson().toJson(mapEventFactory.buildPerformanceEvent(phoneState, strC, data));
            json.getClass();
            sendEvent(json);
        }
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void setUserTelemetryRequestState(boolean enabled) {
        enableTelemetryCollection(enabled);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$Companion;", "", "()V", "TAG", "", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    public MapTelemetryImpl(Context context, EventsServiceInterface eventsServiceInterface, TelemetryService telemetryService, EventsServerOptions eventsServerOptions, z zVar) {
        context.getClass();
        eventsServiceInterface.getClass();
        telemetryService.getClass();
        eventsServerOptions.getClass();
        zVar.getClass();
        this.appContext = context;
        this.eventsService = eventsServiceInterface;
        this.telemetryService = telemetryService;
        this.eventsServiceOptions = eventsServerOptions;
        this.bgScope = c0.a(new a0(TAG).plus(b.h()).plus(zVar));
    }
}
