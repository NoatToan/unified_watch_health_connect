package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDILiveTrackExtension;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.garmin.proto.generated.GDISmartProto;
import de2.a0;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import o53.t;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import wd2.b2;
import wd2.e0;
import wd2.l;
import wd2.m;
import wd2.m1;
import wd2.n1;
import wd2.q;
import wd2.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/LiveTrackServiceProtobufRequestHandler;", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/ProtobufRequestHandler;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "macAddress", "", "deviceUnitId", "", "requestId", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "requestMsg", "<init>", "(Landroid/content/Context;Ljava/lang/String;JILcom/garmin/proto/generated/GDISmartProto$Smart;)V", "", "processStartRequest", "()V", "Lcom/garmin/proto/generated/GDILiveTrackProto$StatusNotification;", "statusNotification", "processStatusNotification", "(Lcom/garmin/proto/generated/GDILiveTrackProto$StatusNotification;)V", "", "isAutoStartEnabled", "processAutoStartUpdate", "(Z)V", "Lwd2/m1;", "settingsIO", "updateAutoStartSetting", "(Lwd2/m1;Z)V", "sendSuccessToDevice", "run", "Landroid/content/Context;", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "Lcom/garmin/proto/generated/GDILiveTrackProto$LiveTrackService;", "liveTrackService", "Lcom/garmin/proto/generated/GDILiveTrackProto$LiveTrackService;", "Lo53/t;", "job", "Lo53/t;", "Lo53/b0;", "coroutineScope", "Lo53/b0;", "Companion", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LiveTrackServiceProtobufRequestHandler extends ProtobufRequestHandler {
    private static final String TAG = "LtProtobufRequestHandler";
    private final Context context;
    private final b0 coroutineScope;
    private final t job;
    private GDILiveTrackProto.LiveTrackService liveTrackService;
    private final Logger logger;
    private final String macAddress;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.LiveTrackServiceProtobufRequestHandler$updateAutoStartSetting$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.LiveTrackServiceProtobufRequestHandler$updateAutoStartSetting$1", f = "LiveTrackServiceProtobufRequestHandler.kt", l = {183}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ ge2.a $deviceSettings;
        final /* synthetic */ m1 $settingsIO;
        int label;
        final /* synthetic */ LiveTrackServiceProtobufRequestHandler this$0;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gfdi.protobuf.LiveTrackServiceProtobufRequestHandler$updateAutoStartSetting$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.LiveTrackServiceProtobufRequestHandler$updateAutoStartSetting$1$1", f = "LiveTrackServiceProtobufRequestHandler.kt", l = {185, 187}, m = "invokeSuspend", v = 2)
        public static final class C06221 extends i implements p<b0, t13.d<? super Unit>, Object> {
            final /* synthetic */ ge2.a $deviceSettings;
            final /* synthetic */ m1 $settingsIO;
            int label;
            final /* synthetic */ LiveTrackServiceProtobufRequestHandler this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06221(m1 m1Var, LiveTrackServiceProtobufRequestHandler liveTrackServiceProtobufRequestHandler, ge2.a aVar, t13.d<? super C06221> dVar) {
                super(2, dVar);
                this.$settingsIO = m1Var;
                this.this$0 = liveTrackServiceProtobufRequestHandler;
                this.$deviceSettings = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C06221(this.$settingsIO, this.this$0, this.$deviceSettings, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C06221) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
            
                if (r7.e(r3, r6) == r0) goto L15;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                    } else {
                        if (i14 != 2) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                r.b(obj);
                m1 m1Var = this.$settingsIO;
                long j8 = this.this$0.deviceId;
                ge2.a aVar2 = this.$deviceSettings;
                this.label = 1;
                if (m1Var.c(j8, aVar2, this) != aVar) {
                }
                return aVar;
                m1 m1Var2 = this.$settingsIO;
                long j14 = this.this$0.deviceId;
                this.label = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(m1 m1Var, LiveTrackServiceProtobufRequestHandler liveTrackServiceProtobufRequestHandler, ge2.a aVar, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$settingsIO = m1Var;
            this.this$0 = liveTrackServiceProtobufRequestHandler;
            this.$deviceSettings = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass1(this.$settingsIO, this.this$0, this.$deviceSettings, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                C06221 c06221 = new C06221(this.$settingsIO, this.this$0, this.$deviceSettings, null);
                this.label = 1;
                if (ge1.b.e0(bVar, c06221, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            m1 m1Var = this.$settingsIO;
            Context applicationContext = this.this$0.context.getApplicationContext();
            applicationContext.getClass();
            m1Var.d(applicationContext);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTrackServiceProtobufRequestHandler(Context context, String str, long j8, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
        str.getClass();
        smart.getClass();
        this.context = context;
        this.macAddress = str;
        this.logger = nu0.c.a(TAG);
        o53.m1 m1VarC = g8.i.c();
        this.job = m1VarC;
        x53.c cVar = s0.f129406a;
        this.coroutineScope = c0.a(x53.b.f189152a.plus(m1VarC));
    }

    private final void processAutoStartUpdate(boolean isAutoStartEnabled) {
        Context context = this.context;
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        m.c((l) KoinJavaComponent.get$default(l.class, null, null, 6, null), new as2.d(this, isAutoStartEnabled, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit processAutoStartUpdate$lambda$0(LiveTrackServiceProtobufRequestHandler liveTrackServiceProtobufRequestHandler, boolean z14, m1 m1Var) {
        m1Var.getClass();
        Context applicationContext = liveTrackServiceProtobufRequestHandler.context.getApplicationContext();
        applicationContext.getClass();
        m1Var.i(applicationContext, new ad0.f(liveTrackServiceProtobufRequestHandler, m1Var, z14, 3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit processAutoStartUpdate$lambda$0$0(LiveTrackServiceProtobufRequestHandler liveTrackServiceProtobufRequestHandler, m1 m1Var, boolean z14, boolean z15) {
        if (z15) {
            liveTrackServiceProtobufRequestHandler.updateAutoStartSetting(m1Var, z14);
        }
        return Unit.INSTANCE;
    }

    private final void processStartRequest() {
        GDILiveTrackProto.StartRequest startRequest;
        n1 cVar;
        GDILiveTrackProto.LiveTrackService liveTrackService = this.liveTrackService;
        if (liveTrackService == null || (startRequest = liveTrackService.getStartRequest()) == null) {
            return;
        }
        sendSuccessToDevice();
        Context context = this.context;
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        if (!startRequest.hasTrackerId() || !startRequest.hasSession()) {
            Logger logger = this.logger;
            long j8 = this.deviceId;
            int size = startRequest.getSession().getSessionsList().size();
            GDILiveTrackProto.TrackerId trackerId = startRequest.getTrackerId();
            String unitId = trackerId != null ? trackerId.getUnitId() : null;
            StringBuilder sbW = v.h.w(size, "Start request from device ", ", sessions ", j8);
            sbW.append(" publisher = ");
            sbW.append(unitId);
            sbW.append(StringUtils.SPACE);
            logger.debug(sbW.toString());
            return;
        }
        GDILiveTrackProto.TrackerId trackerId2 = startRequest.getTrackerId();
        long j14 = this.deviceId;
        com.garmin.android.library.livetrack.i.b bVar = com.garmin.android.library.livetrack.i.b.f50229a;
        String nickname = trackerId2.getNickname();
        String unitId2 = trackerId2.getUnitId();
        GDILiveTrackProto.DeviceType deviceType = trackerId2.getDeviceType();
        if (deviceType == null || (cVar = LiveTrackServiceProtobufRequestHandlerKt.toTrackerType(deviceType)) == null) {
            cVar = new n1.c();
        }
        n1 n1Var = cVar;
        List<GDILiveTrackProto.Session> sessionsList = startRequest.getSession().getSessionsList();
        sessionsList.getClass();
        ArrayList arrayList = new ArrayList();
        for (GDILiveTrackProto.Session session : sessionsList) {
            String id3 = session.getId();
            id3.getClass();
            String token = session.getToken();
            token.getClass();
            GDILiveTrackProto.DeviceType deviceType2 = session.getDeviceType();
            arrayList.add(new b2(id3, token, deviceType2 != null ? LiveTrackServiceProtobufRequestHandlerKt.toSubscriberType(deviceType2) : null));
        }
        e0 e0Var = new e0(j14, bVar, nickname, true, unitId2, n1Var, arrayList, null, Long.valueOf(startRequest.getSession().getStartUnixTimestamp()), 128, null);
        l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
        lVar.getClass();
        q.f184563f.c().f(e0Var, lVar);
    }

    private final void processStatusNotification(GDILiveTrackProto.StatusNotification statusNotification) {
        n1 cVar;
        GDILiveTrackProto.DeviceType deviceType;
        Context context = this.context;
        if (context == null || context.getApplicationContext() == null || statusNotification == null) {
            return;
        }
        GDILiveTrackProto.TrackerId trackerId = statusNotification.getTrackerId();
        long j8 = this.deviceId;
        com.garmin.android.library.livetrack.i.b bVar = com.garmin.android.library.livetrack.i.b.f50229a;
        String nickname = trackerId != null ? trackerId.getNickname() : null;
        String unitId = trackerId != null ? trackerId.getUnitId() : null;
        if (trackerId == null || (deviceType = trackerId.getDeviceType()) == null || (cVar = LiveTrackServiceProtobufRequestHandlerKt.toTrackerType(deviceType)) == null) {
            cVar = new n1.c();
        }
        n1 n1Var = cVar;
        List<GDILiveTrackProto.Session> sessionsList = statusNotification.getSession().getSessionsList();
        sessionsList.getClass();
        ArrayList arrayList = new ArrayList();
        for (GDILiveTrackProto.Session session : sessionsList) {
            String id3 = session.getId();
            id3.getClass();
            String token = session.getToken();
            token.getClass();
            GDILiveTrackProto.DeviceType deviceType2 = session.getDeviceType();
            arrayList.add(new b2(id3, token, deviceType2 != null ? LiveTrackServiceProtobufRequestHandlerKt.toSubscriberType(deviceType2) : null));
        }
        e0 e0Var = new e0(j8, bVar, nickname, true, unitId, n1Var, arrayList, this.macAddress, Long.valueOf(statusNotification.getSession().getStartUnixTimestamp()));
        l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
        lVar.getClass();
        q qVarC = q.f184563f.c();
        Logger logger = q.f184565h;
        if (logger != null) {
            int size = e0Var.f184439g.size();
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(e0Var.f184433a, "Device connected: ", StringUtils.SPACE, e0Var.f184437e);
            sbK.append(" sessions size: ");
            sbK.append(size);
            logger.debug(sbK.toString());
        }
        ge1.b.T(qVarC, null, null, new y(e0Var, qVarC, lVar, null), 3);
    }

    private final void sendSuccessToDevice() {
        GDILiveTrackProto.StartResponse.Builder builderNewBuilder = GDILiveTrackProto.StartResponse.newBuilder();
        builderNewBuilder.setStartStatus(GDILiveTrackProto.StartResponse.Status.SUCCESS);
        GDILiveTrackProto.LiveTrackService.Builder builderNewBuilder2 = GDILiveTrackProto.LiveTrackService.newBuilder();
        builderNewBuilder2.setStartResponse(builderNewBuilder.build());
        GDISmartProto.Smart.Builder extension = GDISmartProto.Smart.newBuilder().setExtension(GDILiveTrackExtension.liveTrackService, builderNewBuilder2.build());
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        int i14 = this.requestId;
        long j8 = this.deviceId;
        GDISmartProto.Smart smartBuild = extension.build();
        smartBuild.getClass();
        protobufRequestManager.respondToRequest(i14, j8, smartBuild);
    }

    private final void updateAutoStartSetting(m1 settingsIO, boolean isAutoStartEnabled) {
        Context context = this.context;
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        ge1.b.T(this.coroutineScope, null, null, new AnonymousClass1(settingsIO, this, new ge2.a(Boolean.valueOf(isAutoStartEnabled), null, null, null, 14, null), null), 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        GDISmartProto.Smart smart = this.requestMsg;
        smart.getClass();
        GDILiveTrackProto.LiveTrackService liveTrackServiceA = a0.a(smart);
        this.liveTrackService = liveTrackServiceA;
        if (liveTrackServiceA.hasShareDeviceSettingNotification()) {
            this.logger.debug("Received AutoStartNotification: " + this.deviceId + " enabled " + liveTrackServiceA.getShareDeviceSettingNotification().getAutoStartEnabled());
            processAutoStartUpdate(liveTrackServiceA.getShareDeviceSettingNotification().getAutoStartEnabled());
        }
        if (liveTrackServiceA.hasStartRequest()) {
            wr.g.w("Received StartRequest from device: ", this.deviceId, this.logger);
            processStartRequest();
        } else if (liveTrackServiceA.hasStopNotification()) {
            wr.g.w("Received StopNotification from device: ", this.deviceId, this.logger);
            m.h(this.deviceId, com.garmin.android.library.livetrack.i.b.f50229a);
        } else if (liveTrackServiceA.hasStatusNotification()) {
            this.logger.debug("Received StatusNotification from device: " + this.deviceId);
            processStatusNotification(liveTrackServiceA.getStatusNotification());
        }
    }
}
