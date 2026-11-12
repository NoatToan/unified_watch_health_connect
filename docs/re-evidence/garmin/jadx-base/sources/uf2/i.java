package uf2;

import com.garmin.proto.generated.GDILiveSessionProto;
import com.google.protobuf.GeneratedMessageV3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Luf2/i;", "Luf2/s;", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f170392f = new c();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVSessionUpdateInteractor", f = "LSVSessionUpdateInteractor.kt", l = {113}, m = "clean", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f170393a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f170395c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f170393a = obj;
            this.f170395c |= Integer.MIN_VALUE;
            return i.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"uf2/i$c", "Luf2/r0$b;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r0.b {

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVSessionUpdateInteractor$protobufListener$1", f = "LSVSessionUpdateInteractor.kt", l = {81, 88}, m = "protobufMessage", v = 2)
        public static final class a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public GDILiveSessionProto.LiveSessionService f170397a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public GeneratedMessageV3 f170398b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f170399c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f170401e;

            public a(t13.d<? super a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f170399c = obj;
                this.f170401e |= Integer.MIN_VALUE;
                return c.this.d(null, null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVSessionUpdateInteractor$protobufListener$1", f = "LSVSessionUpdateInteractor.kt", l = {27, 34, 41, 48, 55, 61, 68}, m = "protobufMessage", v = 2)
        public static final class b extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public GDILiveSessionProto.LiveSessionEventNotification f170402a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f170403b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f170404c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f170406e;

            public b(t13.d<? super b> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f170404c = obj;
                this.f170406e |= Integer.MIN_VALUE;
                return c.this.b(null, null, null, null, this);
            }
        }

        public c() {
        }

        @Override // uf2.r0.b
        public final Object a(String str, r0.c cVar) throws Throwable {
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVSessionUpdateInteractor", "Connection " + str + " closed.");
            Object objEmit = i.this.f170500a.emit(sf2.c.d.f158900a, cVar);
            return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0216  */
        /* JADX WARN: Code duplicated, block: B:107:0x0223  */
        /* JADX WARN: Code duplicated, block: B:109:0x0226  */
        /* JADX WARN: Code duplicated, block: B:113:0x024f  */
        /* JADX WARN: Code duplicated, block: B:114:0x0254  */
        /* JADX WARN: Code duplicated, block: B:115:0x0257  */
        /* JADX WARN: Code duplicated, block: B:116:0x025a  */
        /* JADX WARN: Code duplicated, block: B:117:0x025d  */
        /* JADX WARN: Code duplicated, block: B:118:0x0260  */
        /* JADX WARN: Code duplicated, block: B:119:0x0263  */
        /* JADX WARN: Code duplicated, block: B:120:0x0266  */
        /* JADX WARN: Code duplicated, block: B:121:0x0269  */
        /* JADX WARN: Code duplicated, block: B:122:0x026c  */
        /* JADX WARN: Code duplicated, block: B:123:0x026f  */
        /* JADX WARN: Code duplicated, block: B:124:0x0272  */
        /* JADX WARN: Code duplicated, block: B:125:0x0275  */
        /* JADX WARN: Code duplicated, block: B:126:0x0278  */
        /* JADX WARN: Code duplicated, block: B:127:0x027b  */
        /* JADX WARN: Code duplicated, block: B:128:0x027e  */
        /* JADX WARN: Code duplicated, block: B:129:0x0281  */
        /* JADX WARN: Code duplicated, block: B:130:0x0284  */
        /* JADX WARN: Code duplicated, block: B:131:0x0287  */
        /* JADX WARN: Code duplicated, block: B:132:0x028a  */
        /* JADX WARN: Code duplicated, block: B:136:0x02a8  */
        /* JADX WARN: Code duplicated, block: B:139:0x02d6  */
        /* JADX WARN: Code duplicated, block: B:141:0x02db  */
        /* JADX WARN: Code duplicated, block: B:142:0x02de  */
        /* JADX WARN: Code duplicated, block: B:143:0x02e1  */
        /* JADX WARN: Code duplicated, block: B:144:0x02e4  */
        /* JADX WARN: Code duplicated, block: B:145:0x02e7  */
        /* JADX WARN: Code duplicated, block: B:146:0x02ea  */
        /* JADX WARN: Code duplicated, block: B:149:0x02fe A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:150:0x0300  */
        /* JADX WARN: Code duplicated, block: B:151:0x0302  */
        /* JADX WARN: Code duplicated, block: B:155:0x030b A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:158:0x0311  */
        /* JADX WARN: Code duplicated, block: B:159:0x0315  */
        /* JADX WARN: Code duplicated, block: B:164:0x035b  */
        /* JADX WARN: Code duplicated, block: B:170:0x02d1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:173:0x01d8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:175:0x01c6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:47:0x010c  */
        /* JADX WARN: Code duplicated, block: B:48:0x010e  */
        /* JADX WARN: Code duplicated, block: B:50:0x0111  */
        /* JADX WARN: Code duplicated, block: B:55:0x012b A[PHI: r4
          0x012b: PHI (r4v12 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification) = 
          (r4v8 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification)
          (r4v8 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification)
          (r4v8 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification)
          (r4v15 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification)
         binds: [B:49:0x010f, B:51:0x0115, B:53:0x0127, B:17:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:57:0x0131  */
        /* JADX WARN: Code duplicated, block: B:58:0x0133  */
        /* JADX WARN: Code duplicated, block: B:60:0x0136  */
        /* JADX WARN: Code duplicated, block: B:68:0x016e A[PHI: r4
          0x016e: PHI (r4v16 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification) = 
          (r4v12 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification)
          (r4v12 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification)
          (r4v12 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification)
          (r4v19 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification)
         binds: [B:59:0x0134, B:61:0x013a, B:66:0x016a, B:16:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:70:0x0174  */
        /* JADX WARN: Code duplicated, block: B:71:0x0176  */
        /* JADX WARN: Code duplicated, block: B:73:0x0179  */
        /* JADX WARN: Code duplicated, block: B:78:0x0194 A[PHI: r4
          0x0194: PHI (r4v20 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification) = 
          (r4v16 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification)
          (r4v16 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification)
          (r4v16 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification)
          (r4v23 com.garmin.proto.generated.GDILiveSessionProto$LiveSessionEventNotification)
         binds: [B:72:0x0177, B:74:0x017d, B:76:0x0190, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:80:0x019a  */
        /* JADX WARN: Code duplicated, block: B:81:0x019c  */
        /* JADX WARN: Code duplicated, block: B:83:0x019f  */
        /* JADX WARN: Code duplicated, block: B:90:0x01cc  */
        /* JADX WARN: Code duplicated, block: B:95:0x01e6  */
        /* JADX WARN: Code restructure failed: missing block: B:165:0x035d, code lost:
        
            if (r1 == r3) goto L166;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
        
            if (r4.c(r1, r12, r2) == r3) goto L166;
         */
        @Override // uf2.r0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(rs2.c cVar, rf2.g gVar, dt2.g gVar2, GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification, t13.d<? super Unit> dVar) throws Throwable {
            b bVar;
            GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification2;
            GDILiveSessionProto.WorkoutStepStartedRequest workoutStepStartedRequest;
            GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification3;
            GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification4;
            GDILiveSessionProto.FinalizeSetRequest finalizeSetRequest;
            GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification5;
            GDILiveSessionProto.SetConfigurationRequest setConfigurationRequest;
            GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification6;
            GDILiveSessionProto.CancelFinalizeTimerRequest cancelFinalizeTimerRequest;
            GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification7;
            GDILiveSessionProto.ActivityStateRequest activityStateRequest;
            GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification8;
            GDILiveSessionProto.DataNotification dataNotification;
            List<GDILiveSessionProto.Metric> metricsList;
            o13.t tVar;
            ArrayList arrayList;
            Iterator<T> it;
            Object objEmit;
            rf2.b bVarC;
            GDILiveSessionProto.ActivityAlertRequest activityAlertRequest;
            GDILiveSessionProto.ActivityAlertRequest.Type type;
            ug2.d dVar2;
            ArrayList arrayList2;
            Object objEmit2;
            GDILiveSessionProto.ActivityAlertMessage.Size size;
            ug2.b bVar2;
            int i14;
            ug2.c cVar2;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i15 = bVar.f170406e;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    bVar.f170406e = i15 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(dVar);
                }
            } else {
                bVar = new b(dVar);
            }
            Object obj = bVar.f170404c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = bVar.f170406e;
            int i17 = 3;
            i iVar = i.this;
            switch (i16) {
                case 0:
                    o13.r.b(obj);
                    i.v(iVar, gVar2);
                    GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification9 = liveSessionEventNotification.hasWorkoutStepStartedRequest() ? liveSessionEventNotification : null;
                    if (liveSessionEventNotification9 != null && (workoutStepStartedRequest = liveSessionEventNotification9.getWorkoutStepStartedRequest()) != null) {
                        l0 l0VarD = iVar.d();
                        e2 e2Var = iVar.f170500a;
                        liveSessionEventNotification2 = liveSessionEventNotification;
                        bVar.f170402a = liveSessionEventNotification2;
                        bVar.f170403b = workoutStepStartedRequest;
                        bVar.f170406e = 1;
                        l0VarD.getClass();
                        sf2.c.u uVar = new sf2.c.u(workoutStepStartedRequest.getStepId(), workoutStepStartedRequest.getCurrentRepeat(), workoutStepStartedRequest.getTotalRepeats());
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + uVar);
                        Object objEmit3 = e2Var.emit(uVar, bVar);
                        if (objEmit3 != aVar) {
                            objEmit3 = Unit.INSTANCE;
                        }
                        if (objEmit3 != aVar) {
                        }
                        return aVar;
                    }
                    liveSessionEventNotification2 = liveSessionEventNotification;
                    if (liveSessionEventNotification2.hasFinalizeSetRequest()) {
                        liveSessionEventNotification3 = liveSessionEventNotification2;
                    } else {
                        liveSessionEventNotification3 = null;
                    }
                    if (liveSessionEventNotification3 != null && (finalizeSetRequest = liveSessionEventNotification3.getFinalizeSetRequest()) != null) {
                        l0 l0VarD2 = iVar.d();
                        e2 e2Var2 = iVar.f170500a;
                        bVar.f170402a = liveSessionEventNotification2;
                        bVar.f170403b = finalizeSetRequest;
                        bVar.f170406e = 2;
                        break;
                    }
                    liveSessionEventNotification4 = liveSessionEventNotification2;
                    if (liveSessionEventNotification4.hasSetConfigurationRequest()) {
                        liveSessionEventNotification5 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification5 = null;
                    }
                    if (liveSessionEventNotification5 != null || (setConfigurationRequest = liveSessionEventNotification5.getSetConfigurationRequest()) == null) {
                        if (liveSessionEventNotification4.hasCancelFinalizeTimerRequest()) {
                            liveSessionEventNotification6 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification6 = null;
                        }
                        if (liveSessionEventNotification6 != null || (cancelFinalizeTimerRequest = liveSessionEventNotification6.getCancelFinalizeTimerRequest()) == null) {
                            if (liveSessionEventNotification4.hasActivityStateRequest()) {
                                liveSessionEventNotification7 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification7 = null;
                            }
                            if (liveSessionEventNotification7 != null || (activityStateRequest = liveSessionEventNotification7.getActivityStateRequest()) == null) {
                                if (liveSessionEventNotification4.hasDataNotification()) {
                                    liveSessionEventNotification8 = liveSessionEventNotification4;
                                } else {
                                    liveSessionEventNotification8 = null;
                                }
                                if (liveSessionEventNotification8 != null && (dataNotification = liveSessionEventNotification8.getDataNotification()) != null && (metricsList = dataNotification.getMetricsList()) != null) {
                                    l0 l0VarD3 = iVar.d();
                                    e2 e2Var3 = iVar.f170500a;
                                    bVar.f170402a = liveSessionEventNotification4;
                                    bVar.f170403b = metricsList;
                                    bVar.f170406e = 6;
                                    l0VarD3.getClass();
                                    tVar = l0VarD3.f170427b;
                                    arrayList = new ArrayList();
                                    it = metricsList.iterator();
                                    while (it.hasNext()) {
                                        bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                        if (bVarC != null) {
                                            arrayList.add(bVarC);
                                        }
                                    }
                                    if (!((y0) tVar.getValue()).f170543d && !arrayList.isEmpty()) {
                                        ((y0) tVar.getValue()).f170543d = true;
                                    }
                                    sf2.c.b bVar3 = new sf2.c.b(arrayList);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar3);
                                    objEmit = e2Var3.emit(bVar3, bVar);
                                    if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit = Unit.INSTANCE;
                                    }
                                    if (objEmit != aVar) {
                                    }
                                }
                                if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                    liveSessionEventNotification4 = null;
                                }
                                if (liveSessionEventNotification4 != null && (activityAlertRequest = liveSessionEventNotification4.getActivityAlertRequest()) != null) {
                                    l0 l0VarD4 = iVar.d();
                                    e2 e2Var4 = iVar.f170500a;
                                    bVar.f170402a = null;
                                    bVar.f170403b = activityAlertRequest;
                                    bVar.f170406e = 7;
                                    l0VarD4.getClass();
                                    type = activityAlertRequest.getType();
                                    type.getClass();
                                    switch (ug2.g.f170775d[type.ordinal()]) {
                                        case 1:
                                            dVar2 = ug2.d.UNKNOWN;
                                            break;
                                        case 2:
                                            dVar2 = ug2.d.DISTANCE;
                                            break;
                                        case 3:
                                            dVar2 = ug2.d.RUN;
                                            break;
                                        case 4:
                                            dVar2 = ug2.d.WALK;
                                            break;
                                        case 5:
                                            dVar2 = ug2.d.POWER;
                                            break;
                                        case 6:
                                            dVar2 = ug2.d.SPEED;
                                            break;
                                        case 7:
                                            dVar2 = ug2.d.PACE;
                                            break;
                                        case 8:
                                            dVar2 = ug2.d.HEART_RATE;
                                            break;
                                        case 9:
                                            dVar2 = ug2.d.CALORIES;
                                            break;
                                        case 10:
                                            dVar2 = ug2.d.ELEVATION;
                                            break;
                                        case 11:
                                            dVar2 = ug2.d.CADENCE_SPM;
                                            break;
                                        case 12:
                                            dVar2 = ug2.d.CADENCE_RPM;
                                            break;
                                        case 13:
                                            dVar2 = ug2.d.TIME;
                                            break;
                                        case 14:
                                            dVar2 = ug2.d.LAP;
                                            break;
                                        case 15:
                                            dVar2 = ug2.d.CLIMB;
                                            break;
                                        case 16:
                                            dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                            break;
                                        case 17:
                                            dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                            break;
                                        case 18:
                                            dVar2 = ug2.d.NAVIGATION;
                                            break;
                                        case 19:
                                            dVar2 = ug2.d.PHASE;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    List<GDILiveSessionProto.ActivityAlertMessage> messagesList = activityAlertRequest.getMessagesList();
                                    messagesList.getClass();
                                    arrayList2 = new ArrayList(p13.y.r(messagesList, 10));
                                    for (GDILiveSessionProto.ActivityAlertMessage activityAlertMessage : messagesList) {
                                        String displayString = activityAlertMessage.getDisplayString();
                                        displayString.getClass();
                                        rf2.b bVarC2 = zg2.e.c(activityAlertMessage.getMetric());
                                        size = activityAlertMessage.getSize();
                                        size.getClass();
                                        switch (ug2.g.f170772a[size.ordinal()]) {
                                            case 1:
                                                bVar2 = ug2.b.TINY;
                                                break;
                                            case 2:
                                                bVar2 = ug2.b.XSMALL;
                                                break;
                                            case 3:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            case 4:
                                                bVar2 = ug2.b.MEDIUM;
                                                break;
                                            case 5:
                                                bVar2 = ug2.b.LARGE;
                                                break;
                                            case 6:
                                                bVar2 = ug2.b.XLARGE;
                                                break;
                                            case 7:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            default:
                                                lc.u0.r();
                                                return null;
                                        }
                                        ug2.b bVar4 = bVar2;
                                        GDILiveSessionProto.ActivityAlertMessage.Weight weight = activityAlertMessage.getWeight();
                                        weight.getClass();
                                        i14 = ug2.g.f170774c[weight.ordinal()];
                                        if (i14 != 1) {
                                            cVar2 = ug2.c.REGULAR;
                                        } else if (i14 != 2) {
                                            if (i14 != i17 && i14 != 4) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            cVar2 = ug2.c.MEDIUM;
                                        } else {
                                            cVar2 = ug2.c.BOLD;
                                        }
                                        sf2.c.a.C3002a c3002a = new sf2.c.a.C3002a(displayString, bVarC2, bVar4, cVar2);
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a);
                                        arrayList2.add(c3002a);
                                        i17 = 3;
                                    }
                                    sf2.c.a aVar2 = new sf2.c.a(dVar2, arrayList2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar2);
                                    objEmit2 = e2Var4.emit(aVar2, bVar);
                                    if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit2 = Unit.INSTANCE;
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                            l0 l0VarD5 = iVar.d();
                            e2 e2Var5 = iVar.f170500a;
                            bVar.f170402a = liveSessionEventNotification4;
                            bVar.f170403b = activityStateRequest;
                            bVar.f170406e = 5;
                            if (l0VarD5.a(activityStateRequest, e2Var5, bVar) != aVar) {
                                if (liveSessionEventNotification4.hasDataNotification()) {
                                    liveSessionEventNotification8 = liveSessionEventNotification4;
                                } else {
                                    liveSessionEventNotification8 = null;
                                }
                                if (liveSessionEventNotification8 != null) {
                                    l0 l0VarD6 = iVar.d();
                                    e2 e2Var6 = iVar.f170500a;
                                    bVar.f170402a = liveSessionEventNotification4;
                                    bVar.f170403b = metricsList;
                                    bVar.f170406e = 6;
                                    l0VarD6.getClass();
                                    tVar = l0VarD6.f170427b;
                                    arrayList = new ArrayList();
                                    it = metricsList.iterator();
                                    while (it.hasNext()) {
                                        bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                        if (bVarC != null) {
                                            arrayList.add(bVarC);
                                        }
                                    }
                                    if (!((y0) tVar.getValue()).f170543d) {
                                        ((y0) tVar.getValue()).f170543d = true;
                                    }
                                    sf2.c.b bVar5 = new sf2.c.b(arrayList);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar5);
                                    objEmit = e2Var6.emit(bVar5, bVar);
                                    if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit = Unit.INSTANCE;
                                    }
                                    if (objEmit != aVar) {
                                    }
                                }
                                if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                    liveSessionEventNotification4 = null;
                                }
                                if (liveSessionEventNotification4 != null) {
                                    l0 l0VarD7 = iVar.d();
                                    e2 e2Var7 = iVar.f170500a;
                                    bVar.f170402a = null;
                                    bVar.f170403b = activityAlertRequest;
                                    bVar.f170406e = 7;
                                    l0VarD7.getClass();
                                    type = activityAlertRequest.getType();
                                    type.getClass();
                                    switch (ug2.g.f170775d[type.ordinal()]) {
                                        case 1:
                                            dVar2 = ug2.d.UNKNOWN;
                                            break;
                                        case 2:
                                            dVar2 = ug2.d.DISTANCE;
                                            break;
                                        case 3:
                                            dVar2 = ug2.d.RUN;
                                            break;
                                        case 4:
                                            dVar2 = ug2.d.WALK;
                                            break;
                                        case 5:
                                            dVar2 = ug2.d.POWER;
                                            break;
                                        case 6:
                                            dVar2 = ug2.d.SPEED;
                                            break;
                                        case 7:
                                            dVar2 = ug2.d.PACE;
                                            break;
                                        case 8:
                                            dVar2 = ug2.d.HEART_RATE;
                                            break;
                                        case 9:
                                            dVar2 = ug2.d.CALORIES;
                                            break;
                                        case 10:
                                            dVar2 = ug2.d.ELEVATION;
                                            break;
                                        case 11:
                                            dVar2 = ug2.d.CADENCE_SPM;
                                            break;
                                        case 12:
                                            dVar2 = ug2.d.CADENCE_RPM;
                                            break;
                                        case 13:
                                            dVar2 = ug2.d.TIME;
                                            break;
                                        case 14:
                                            dVar2 = ug2.d.LAP;
                                            break;
                                        case 15:
                                            dVar2 = ug2.d.CLIMB;
                                            break;
                                        case 16:
                                            dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                            break;
                                        case 17:
                                            dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                            break;
                                        case 18:
                                            dVar2 = ug2.d.NAVIGATION;
                                            break;
                                        case 19:
                                            dVar2 = ug2.d.PHASE;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    List<GDILiveSessionProto.ActivityAlertMessage> messagesList2 = activityAlertRequest.getMessagesList();
                                    messagesList2.getClass();
                                    arrayList2 = new ArrayList(p13.y.r(messagesList2, 10));
                                    while (r1.hasNext()) {
                                        String displayString2 = activityAlertMessage.getDisplayString();
                                        displayString2.getClass();
                                        rf2.b bVarC3 = zg2.e.c(activityAlertMessage.getMetric());
                                        size = activityAlertMessage.getSize();
                                        size.getClass();
                                        switch (ug2.g.f170772a[size.ordinal()]) {
                                            case 1:
                                                bVar2 = ug2.b.TINY;
                                                break;
                                            case 2:
                                                bVar2 = ug2.b.XSMALL;
                                                break;
                                            case 3:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            case 4:
                                                bVar2 = ug2.b.MEDIUM;
                                                break;
                                            case 5:
                                                bVar2 = ug2.b.LARGE;
                                                break;
                                            case 6:
                                                bVar2 = ug2.b.XLARGE;
                                                break;
                                            case 7:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            default:
                                                lc.u0.r();
                                                return null;
                                        }
                                        ug2.b bVar6 = bVar2;
                                        GDILiveSessionProto.ActivityAlertMessage.Weight weight2 = activityAlertMessage.getWeight();
                                        weight2.getClass();
                                        i14 = ug2.g.f170774c[weight2.ordinal()];
                                        if (i14 != 1) {
                                            cVar2 = ug2.c.REGULAR;
                                        } else if (i14 != 2) {
                                            if (i14 != i17) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            cVar2 = ug2.c.MEDIUM;
                                        } else {
                                            cVar2 = ug2.c.BOLD;
                                        }
                                        sf2.c.a.C3002a c3002a2 = new sf2.c.a.C3002a(displayString2, bVarC3, bVar6, cVar2);
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a2);
                                        arrayList2.add(c3002a2);
                                        i17 = 3;
                                    }
                                    sf2.c.a aVar3 = new sf2.c.a(dVar2, arrayList2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar3);
                                    objEmit2 = e2Var7.emit(aVar3, bVar);
                                    if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit2 = Unit.INSTANCE;
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            l0 l0VarD8 = iVar.d();
                            e2 e2Var8 = iVar.f170500a;
                            bVar.f170402a = liveSessionEventNotification4;
                            bVar.f170403b = cancelFinalizeTimerRequest;
                            bVar.f170406e = 4;
                            l0VarD8.getClass();
                            sf2.c.g gVar3 = sf2.c.g.f158908a;
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + gVar3);
                            Object objEmit4 = e2Var8.emit(gVar3, bVar);
                            if (objEmit4 != aVar) {
                                objEmit4 = Unit.INSTANCE;
                            }
                            if (objEmit4 != aVar) {
                                if (liveSessionEventNotification4.hasActivityStateRequest()) {
                                    liveSessionEventNotification7 = liveSessionEventNotification4;
                                } else {
                                    liveSessionEventNotification7 = null;
                                }
                                if (liveSessionEventNotification7 != null) {
                                    if (liveSessionEventNotification4.hasDataNotification()) {
                                        liveSessionEventNotification8 = liveSessionEventNotification4;
                                    } else {
                                        liveSessionEventNotification8 = null;
                                    }
                                    if (liveSessionEventNotification8 != null) {
                                        l0 l0VarD9 = iVar.d();
                                        e2 e2Var9 = iVar.f170500a;
                                        bVar.f170402a = liveSessionEventNotification4;
                                        bVar.f170403b = metricsList;
                                        bVar.f170406e = 6;
                                        l0VarD9.getClass();
                                        tVar = l0VarD9.f170427b;
                                        arrayList = new ArrayList();
                                        it = metricsList.iterator();
                                        while (it.hasNext()) {
                                            bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                            if (bVarC != null) {
                                                arrayList.add(bVarC);
                                            }
                                        }
                                        if (!((y0) tVar.getValue()).f170543d) {
                                            ((y0) tVar.getValue()).f170543d = true;
                                        }
                                        sf2.c.b bVar7 = new sf2.c.b(arrayList);
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar7);
                                        objEmit = e2Var9.emit(bVar7, bVar);
                                        if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                            objEmit = Unit.INSTANCE;
                                        }
                                        if (objEmit != aVar) {
                                        }
                                    }
                                    if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                        liveSessionEventNotification4 = null;
                                    }
                                    if (liveSessionEventNotification4 != null) {
                                        l0 l0VarD10 = iVar.d();
                                        e2 e2Var10 = iVar.f170500a;
                                        bVar.f170402a = null;
                                        bVar.f170403b = activityAlertRequest;
                                        bVar.f170406e = 7;
                                        l0VarD10.getClass();
                                        type = activityAlertRequest.getType();
                                        type.getClass();
                                        switch (ug2.g.f170775d[type.ordinal()]) {
                                            case 1:
                                                dVar2 = ug2.d.UNKNOWN;
                                                break;
                                            case 2:
                                                dVar2 = ug2.d.DISTANCE;
                                                break;
                                            case 3:
                                                dVar2 = ug2.d.RUN;
                                                break;
                                            case 4:
                                                dVar2 = ug2.d.WALK;
                                                break;
                                            case 5:
                                                dVar2 = ug2.d.POWER;
                                                break;
                                            case 6:
                                                dVar2 = ug2.d.SPEED;
                                                break;
                                            case 7:
                                                dVar2 = ug2.d.PACE;
                                                break;
                                            case 8:
                                                dVar2 = ug2.d.HEART_RATE;
                                                break;
                                            case 9:
                                                dVar2 = ug2.d.CALORIES;
                                                break;
                                            case 10:
                                                dVar2 = ug2.d.ELEVATION;
                                                break;
                                            case 11:
                                                dVar2 = ug2.d.CADENCE_SPM;
                                                break;
                                            case 12:
                                                dVar2 = ug2.d.CADENCE_RPM;
                                                break;
                                            case 13:
                                                dVar2 = ug2.d.TIME;
                                                break;
                                            case 14:
                                                dVar2 = ug2.d.LAP;
                                                break;
                                            case 15:
                                                dVar2 = ug2.d.CLIMB;
                                                break;
                                            case 16:
                                                dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                                break;
                                            case 17:
                                                dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                                break;
                                            case 18:
                                                dVar2 = ug2.d.NAVIGATION;
                                                break;
                                            case 19:
                                                dVar2 = ug2.d.PHASE;
                                                break;
                                            default:
                                                lc.u0.r();
                                                return null;
                                        }
                                        List<GDILiveSessionProto.ActivityAlertMessage> messagesList3 = activityAlertRequest.getMessagesList();
                                        messagesList3.getClass();
                                        arrayList2 = new ArrayList(p13.y.r(messagesList3, 10));
                                        while (r1.hasNext()) {
                                            String displayString3 = activityAlertMessage.getDisplayString();
                                            displayString3.getClass();
                                            rf2.b bVarC4 = zg2.e.c(activityAlertMessage.getMetric());
                                            size = activityAlertMessage.getSize();
                                            size.getClass();
                                            switch (ug2.g.f170772a[size.ordinal()]) {
                                                case 1:
                                                    bVar2 = ug2.b.TINY;
                                                    break;
                                                case 2:
                                                    bVar2 = ug2.b.XSMALL;
                                                    break;
                                                case 3:
                                                    bVar2 = ug2.b.SMALL;
                                                    break;
                                                case 4:
                                                    bVar2 = ug2.b.MEDIUM;
                                                    break;
                                                case 5:
                                                    bVar2 = ug2.b.LARGE;
                                                    break;
                                                case 6:
                                                    bVar2 = ug2.b.XLARGE;
                                                    break;
                                                case 7:
                                                    bVar2 = ug2.b.SMALL;
                                                    break;
                                                default:
                                                    lc.u0.r();
                                                    return null;
                                            }
                                            ug2.b bVar8 = bVar2;
                                            GDILiveSessionProto.ActivityAlertMessage.Weight weight3 = activityAlertMessage.getWeight();
                                            weight3.getClass();
                                            i14 = ug2.g.f170774c[weight3.ordinal()];
                                            if (i14 != 1) {
                                                cVar2 = ug2.c.REGULAR;
                                            } else if (i14 != 2) {
                                                if (i14 != i17) {
                                                    lc.u0.r();
                                                    return null;
                                                }
                                                cVar2 = ug2.c.MEDIUM;
                                            } else {
                                                cVar2 = ug2.c.BOLD;
                                            }
                                            sf2.c.a.C3002a c3002a3 = new sf2.c.a.C3002a(displayString3, bVarC4, bVar8, cVar2);
                                            zg2.c.f204692a.getClass();
                                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a3);
                                            arrayList2.add(c3002a3);
                                            i17 = 3;
                                        }
                                        sf2.c.a aVar4 = new sf2.c.a(dVar2, arrayList2);
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar4);
                                        objEmit2 = e2Var10.emit(aVar4, bVar);
                                        if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                            objEmit2 = Unit.INSTANCE;
                                        }
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (liveSessionEventNotification4.hasDataNotification()) {
                                    liveSessionEventNotification8 = liveSessionEventNotification4;
                                } else {
                                    liveSessionEventNotification8 = null;
                                }
                                if (liveSessionEventNotification8 != null) {
                                    l0 l0VarD11 = iVar.d();
                                    e2 e2Var11 = iVar.f170500a;
                                    bVar.f170402a = liveSessionEventNotification4;
                                    bVar.f170403b = metricsList;
                                    bVar.f170406e = 6;
                                    l0VarD11.getClass();
                                    tVar = l0VarD11.f170427b;
                                    arrayList = new ArrayList();
                                    it = metricsList.iterator();
                                    while (it.hasNext()) {
                                        bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                        if (bVarC != null) {
                                            arrayList.add(bVarC);
                                        }
                                    }
                                    if (!((y0) tVar.getValue()).f170543d) {
                                        ((y0) tVar.getValue()).f170543d = true;
                                    }
                                    sf2.c.b bVar9 = new sf2.c.b(arrayList);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar9);
                                    objEmit = e2Var11.emit(bVar9, bVar);
                                    if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit = Unit.INSTANCE;
                                    }
                                    if (objEmit != aVar) {
                                    }
                                }
                                if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                    liveSessionEventNotification4 = null;
                                }
                                if (liveSessionEventNotification4 != null) {
                                    l0 l0VarD12 = iVar.d();
                                    e2 e2Var12 = iVar.f170500a;
                                    bVar.f170402a = null;
                                    bVar.f170403b = activityAlertRequest;
                                    bVar.f170406e = 7;
                                    l0VarD12.getClass();
                                    type = activityAlertRequest.getType();
                                    type.getClass();
                                    switch (ug2.g.f170775d[type.ordinal()]) {
                                        case 1:
                                            dVar2 = ug2.d.UNKNOWN;
                                            break;
                                        case 2:
                                            dVar2 = ug2.d.DISTANCE;
                                            break;
                                        case 3:
                                            dVar2 = ug2.d.RUN;
                                            break;
                                        case 4:
                                            dVar2 = ug2.d.WALK;
                                            break;
                                        case 5:
                                            dVar2 = ug2.d.POWER;
                                            break;
                                        case 6:
                                            dVar2 = ug2.d.SPEED;
                                            break;
                                        case 7:
                                            dVar2 = ug2.d.PACE;
                                            break;
                                        case 8:
                                            dVar2 = ug2.d.HEART_RATE;
                                            break;
                                        case 9:
                                            dVar2 = ug2.d.CALORIES;
                                            break;
                                        case 10:
                                            dVar2 = ug2.d.ELEVATION;
                                            break;
                                        case 11:
                                            dVar2 = ug2.d.CADENCE_SPM;
                                            break;
                                        case 12:
                                            dVar2 = ug2.d.CADENCE_RPM;
                                            break;
                                        case 13:
                                            dVar2 = ug2.d.TIME;
                                            break;
                                        case 14:
                                            dVar2 = ug2.d.LAP;
                                            break;
                                        case 15:
                                            dVar2 = ug2.d.CLIMB;
                                            break;
                                        case 16:
                                            dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                            break;
                                        case 17:
                                            dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                            break;
                                        case 18:
                                            dVar2 = ug2.d.NAVIGATION;
                                            break;
                                        case 19:
                                            dVar2 = ug2.d.PHASE;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    List<GDILiveSessionProto.ActivityAlertMessage> messagesList4 = activityAlertRequest.getMessagesList();
                                    messagesList4.getClass();
                                    arrayList2 = new ArrayList(p13.y.r(messagesList4, 10));
                                    while (r1.hasNext()) {
                                        String displayString4 = activityAlertMessage.getDisplayString();
                                        displayString4.getClass();
                                        rf2.b bVarC5 = zg2.e.c(activityAlertMessage.getMetric());
                                        size = activityAlertMessage.getSize();
                                        size.getClass();
                                        switch (ug2.g.f170772a[size.ordinal()]) {
                                            case 1:
                                                bVar2 = ug2.b.TINY;
                                                break;
                                            case 2:
                                                bVar2 = ug2.b.XSMALL;
                                                break;
                                            case 3:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            case 4:
                                                bVar2 = ug2.b.MEDIUM;
                                                break;
                                            case 5:
                                                bVar2 = ug2.b.LARGE;
                                                break;
                                            case 6:
                                                bVar2 = ug2.b.XLARGE;
                                                break;
                                            case 7:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            default:
                                                lc.u0.r();
                                                return null;
                                        }
                                        ug2.b bVar10 = bVar2;
                                        GDILiveSessionProto.ActivityAlertMessage.Weight weight4 = activityAlertMessage.getWeight();
                                        weight4.getClass();
                                        i14 = ug2.g.f170774c[weight4.ordinal()];
                                        if (i14 != 1) {
                                            cVar2 = ug2.c.REGULAR;
                                        } else if (i14 != 2) {
                                            if (i14 != i17) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            cVar2 = ug2.c.MEDIUM;
                                        } else {
                                            cVar2 = ug2.c.BOLD;
                                        }
                                        sf2.c.a.C3002a c3002a4 = new sf2.c.a.C3002a(displayString4, bVarC5, bVar10, cVar2);
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a4);
                                        arrayList2.add(c3002a4);
                                        i17 = 3;
                                    }
                                    sf2.c.a aVar5 = new sf2.c.a(dVar2, arrayList2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar5);
                                    objEmit2 = e2Var12.emit(aVar5, bVar);
                                    if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit2 = Unit.INSTANCE;
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        l0 l0VarD13 = iVar.d();
                        e2 e2Var13 = iVar.f170500a;
                        bVar.f170402a = liveSessionEventNotification4;
                        bVar.f170403b = setConfigurationRequest;
                        bVar.f170406e = 3;
                        if (l0VarD13.b(setConfigurationRequest, e2Var13, bVar) != aVar) {
                            if (liveSessionEventNotification4.hasCancelFinalizeTimerRequest()) {
                                liveSessionEventNotification6 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification6 = null;
                            }
                            if (liveSessionEventNotification6 != null) {
                                if (liveSessionEventNotification4.hasActivityStateRequest()) {
                                    liveSessionEventNotification7 = liveSessionEventNotification4;
                                } else {
                                    liveSessionEventNotification7 = null;
                                }
                                if (liveSessionEventNotification7 != null) {
                                    if (liveSessionEventNotification4.hasDataNotification()) {
                                        liveSessionEventNotification8 = liveSessionEventNotification4;
                                    } else {
                                        liveSessionEventNotification8 = null;
                                    }
                                    if (liveSessionEventNotification8 != null) {
                                        l0 l0VarD14 = iVar.d();
                                        e2 e2Var14 = iVar.f170500a;
                                        bVar.f170402a = liveSessionEventNotification4;
                                        bVar.f170403b = metricsList;
                                        bVar.f170406e = 6;
                                        l0VarD14.getClass();
                                        tVar = l0VarD14.f170427b;
                                        arrayList = new ArrayList();
                                        it = metricsList.iterator();
                                        while (it.hasNext()) {
                                            bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                            if (bVarC != null) {
                                                arrayList.add(bVarC);
                                            }
                                        }
                                        if (!((y0) tVar.getValue()).f170543d) {
                                            ((y0) tVar.getValue()).f170543d = true;
                                        }
                                        sf2.c.b bVar11 = new sf2.c.b(arrayList);
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar11);
                                        objEmit = e2Var14.emit(bVar11, bVar);
                                        if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                            objEmit = Unit.INSTANCE;
                                        }
                                        if (objEmit != aVar) {
                                        }
                                    }
                                    if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                        liveSessionEventNotification4 = null;
                                    }
                                    if (liveSessionEventNotification4 != null) {
                                        l0 l0VarD15 = iVar.d();
                                        e2 e2Var15 = iVar.f170500a;
                                        bVar.f170402a = null;
                                        bVar.f170403b = activityAlertRequest;
                                        bVar.f170406e = 7;
                                        l0VarD15.getClass();
                                        type = activityAlertRequest.getType();
                                        type.getClass();
                                        switch (ug2.g.f170775d[type.ordinal()]) {
                                            case 1:
                                                dVar2 = ug2.d.UNKNOWN;
                                                break;
                                            case 2:
                                                dVar2 = ug2.d.DISTANCE;
                                                break;
                                            case 3:
                                                dVar2 = ug2.d.RUN;
                                                break;
                                            case 4:
                                                dVar2 = ug2.d.WALK;
                                                break;
                                            case 5:
                                                dVar2 = ug2.d.POWER;
                                                break;
                                            case 6:
                                                dVar2 = ug2.d.SPEED;
                                                break;
                                            case 7:
                                                dVar2 = ug2.d.PACE;
                                                break;
                                            case 8:
                                                dVar2 = ug2.d.HEART_RATE;
                                                break;
                                            case 9:
                                                dVar2 = ug2.d.CALORIES;
                                                break;
                                            case 10:
                                                dVar2 = ug2.d.ELEVATION;
                                                break;
                                            case 11:
                                                dVar2 = ug2.d.CADENCE_SPM;
                                                break;
                                            case 12:
                                                dVar2 = ug2.d.CADENCE_RPM;
                                                break;
                                            case 13:
                                                dVar2 = ug2.d.TIME;
                                                break;
                                            case 14:
                                                dVar2 = ug2.d.LAP;
                                                break;
                                            case 15:
                                                dVar2 = ug2.d.CLIMB;
                                                break;
                                            case 16:
                                                dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                                break;
                                            case 17:
                                                dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                                break;
                                            case 18:
                                                dVar2 = ug2.d.NAVIGATION;
                                                break;
                                            case 19:
                                                dVar2 = ug2.d.PHASE;
                                                break;
                                            default:
                                                lc.u0.r();
                                                return null;
                                        }
                                        List<GDILiveSessionProto.ActivityAlertMessage> messagesList5 = activityAlertRequest.getMessagesList();
                                        messagesList5.getClass();
                                        arrayList2 = new ArrayList(p13.y.r(messagesList5, 10));
                                        while (r1.hasNext()) {
                                            String displayString5 = activityAlertMessage.getDisplayString();
                                            displayString5.getClass();
                                            rf2.b bVarC6 = zg2.e.c(activityAlertMessage.getMetric());
                                            size = activityAlertMessage.getSize();
                                            size.getClass();
                                            switch (ug2.g.f170772a[size.ordinal()]) {
                                                case 1:
                                                    bVar2 = ug2.b.TINY;
                                                    break;
                                                case 2:
                                                    bVar2 = ug2.b.XSMALL;
                                                    break;
                                                case 3:
                                                    bVar2 = ug2.b.SMALL;
                                                    break;
                                                case 4:
                                                    bVar2 = ug2.b.MEDIUM;
                                                    break;
                                                case 5:
                                                    bVar2 = ug2.b.LARGE;
                                                    break;
                                                case 6:
                                                    bVar2 = ug2.b.XLARGE;
                                                    break;
                                                case 7:
                                                    bVar2 = ug2.b.SMALL;
                                                    break;
                                                default:
                                                    lc.u0.r();
                                                    return null;
                                            }
                                            ug2.b bVar12 = bVar2;
                                            GDILiveSessionProto.ActivityAlertMessage.Weight weight5 = activityAlertMessage.getWeight();
                                            weight5.getClass();
                                            i14 = ug2.g.f170774c[weight5.ordinal()];
                                            if (i14 != 1) {
                                                cVar2 = ug2.c.REGULAR;
                                            } else if (i14 != 2) {
                                                if (i14 != i17) {
                                                    lc.u0.r();
                                                    return null;
                                                }
                                                cVar2 = ug2.c.MEDIUM;
                                            } else {
                                                cVar2 = ug2.c.BOLD;
                                            }
                                            sf2.c.a.C3002a c3002a5 = new sf2.c.a.C3002a(displayString5, bVarC6, bVar12, cVar2);
                                            zg2.c.f204692a.getClass();
                                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a5);
                                            arrayList2.add(c3002a5);
                                            i17 = 3;
                                        }
                                        sf2.c.a aVar6 = new sf2.c.a(dVar2, arrayList2);
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar6);
                                        objEmit2 = e2Var15.emit(aVar6, bVar);
                                        if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                            objEmit2 = Unit.INSTANCE;
                                        }
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (liveSessionEventNotification4.hasDataNotification()) {
                                    liveSessionEventNotification8 = liveSessionEventNotification4;
                                } else {
                                    liveSessionEventNotification8 = null;
                                }
                                if (liveSessionEventNotification8 != null) {
                                    l0 l0VarD16 = iVar.d();
                                    e2 e2Var16 = iVar.f170500a;
                                    bVar.f170402a = liveSessionEventNotification4;
                                    bVar.f170403b = metricsList;
                                    bVar.f170406e = 6;
                                    l0VarD16.getClass();
                                    tVar = l0VarD16.f170427b;
                                    arrayList = new ArrayList();
                                    it = metricsList.iterator();
                                    while (it.hasNext()) {
                                        bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                        if (bVarC != null) {
                                            arrayList.add(bVarC);
                                        }
                                    }
                                    if (!((y0) tVar.getValue()).f170543d) {
                                        ((y0) tVar.getValue()).f170543d = true;
                                    }
                                    sf2.c.b bVar13 = new sf2.c.b(arrayList);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar13);
                                    objEmit = e2Var16.emit(bVar13, bVar);
                                    if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit = Unit.INSTANCE;
                                    }
                                    if (objEmit != aVar) {
                                    }
                                }
                                if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                    liveSessionEventNotification4 = null;
                                }
                                if (liveSessionEventNotification4 != null) {
                                    l0 l0VarD17 = iVar.d();
                                    e2 e2Var17 = iVar.f170500a;
                                    bVar.f170402a = null;
                                    bVar.f170403b = activityAlertRequest;
                                    bVar.f170406e = 7;
                                    l0VarD17.getClass();
                                    type = activityAlertRequest.getType();
                                    type.getClass();
                                    switch (ug2.g.f170775d[type.ordinal()]) {
                                        case 1:
                                            dVar2 = ug2.d.UNKNOWN;
                                            break;
                                        case 2:
                                            dVar2 = ug2.d.DISTANCE;
                                            break;
                                        case 3:
                                            dVar2 = ug2.d.RUN;
                                            break;
                                        case 4:
                                            dVar2 = ug2.d.WALK;
                                            break;
                                        case 5:
                                            dVar2 = ug2.d.POWER;
                                            break;
                                        case 6:
                                            dVar2 = ug2.d.SPEED;
                                            break;
                                        case 7:
                                            dVar2 = ug2.d.PACE;
                                            break;
                                        case 8:
                                            dVar2 = ug2.d.HEART_RATE;
                                            break;
                                        case 9:
                                            dVar2 = ug2.d.CALORIES;
                                            break;
                                        case 10:
                                            dVar2 = ug2.d.ELEVATION;
                                            break;
                                        case 11:
                                            dVar2 = ug2.d.CADENCE_SPM;
                                            break;
                                        case 12:
                                            dVar2 = ug2.d.CADENCE_RPM;
                                            break;
                                        case 13:
                                            dVar2 = ug2.d.TIME;
                                            break;
                                        case 14:
                                            dVar2 = ug2.d.LAP;
                                            break;
                                        case 15:
                                            dVar2 = ug2.d.CLIMB;
                                            break;
                                        case 16:
                                            dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                            break;
                                        case 17:
                                            dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                            break;
                                        case 18:
                                            dVar2 = ug2.d.NAVIGATION;
                                            break;
                                        case 19:
                                            dVar2 = ug2.d.PHASE;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    List<GDILiveSessionProto.ActivityAlertMessage> messagesList6 = activityAlertRequest.getMessagesList();
                                    messagesList6.getClass();
                                    arrayList2 = new ArrayList(p13.y.r(messagesList6, 10));
                                    while (r1.hasNext()) {
                                        String displayString6 = activityAlertMessage.getDisplayString();
                                        displayString6.getClass();
                                        rf2.b bVarC7 = zg2.e.c(activityAlertMessage.getMetric());
                                        size = activityAlertMessage.getSize();
                                        size.getClass();
                                        switch (ug2.g.f170772a[size.ordinal()]) {
                                            case 1:
                                                bVar2 = ug2.b.TINY;
                                                break;
                                            case 2:
                                                bVar2 = ug2.b.XSMALL;
                                                break;
                                            case 3:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            case 4:
                                                bVar2 = ug2.b.MEDIUM;
                                                break;
                                            case 5:
                                                bVar2 = ug2.b.LARGE;
                                                break;
                                            case 6:
                                                bVar2 = ug2.b.XLARGE;
                                                break;
                                            case 7:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            default:
                                                lc.u0.r();
                                                return null;
                                        }
                                        ug2.b bVar14 = bVar2;
                                        GDILiveSessionProto.ActivityAlertMessage.Weight weight6 = activityAlertMessage.getWeight();
                                        weight6.getClass();
                                        i14 = ug2.g.f170774c[weight6.ordinal()];
                                        if (i14 != 1) {
                                            cVar2 = ug2.c.REGULAR;
                                        } else if (i14 != 2) {
                                            if (i14 != i17) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            cVar2 = ug2.c.MEDIUM;
                                        } else {
                                            cVar2 = ug2.c.BOLD;
                                        }
                                        sf2.c.a.C3002a c3002a6 = new sf2.c.a.C3002a(displayString6, bVarC7, bVar14, cVar2);
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a6);
                                        arrayList2.add(c3002a6);
                                        i17 = 3;
                                    }
                                    sf2.c.a aVar7 = new sf2.c.a(dVar2, arrayList2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar7);
                                    objEmit2 = e2Var17.emit(aVar7, bVar);
                                    if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit2 = Unit.INSTANCE;
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                            if (liveSessionEventNotification4.hasActivityStateRequest()) {
                                liveSessionEventNotification7 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification7 = null;
                            }
                            if (liveSessionEventNotification7 != null) {
                                if (liveSessionEventNotification4.hasDataNotification()) {
                                    liveSessionEventNotification8 = liveSessionEventNotification4;
                                } else {
                                    liveSessionEventNotification8 = null;
                                }
                                if (liveSessionEventNotification8 != null) {
                                    l0 l0VarD18 = iVar.d();
                                    e2 e2Var18 = iVar.f170500a;
                                    bVar.f170402a = liveSessionEventNotification4;
                                    bVar.f170403b = metricsList;
                                    bVar.f170406e = 6;
                                    l0VarD18.getClass();
                                    tVar = l0VarD18.f170427b;
                                    arrayList = new ArrayList();
                                    it = metricsList.iterator();
                                    while (it.hasNext()) {
                                        bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                        if (bVarC != null) {
                                            arrayList.add(bVarC);
                                        }
                                    }
                                    if (!((y0) tVar.getValue()).f170543d) {
                                        ((y0) tVar.getValue()).f170543d = true;
                                    }
                                    sf2.c.b bVar15 = new sf2.c.b(arrayList);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar15);
                                    objEmit = e2Var18.emit(bVar15, bVar);
                                    if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit = Unit.INSTANCE;
                                    }
                                    if (objEmit != aVar) {
                                    }
                                }
                                if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                    liveSessionEventNotification4 = null;
                                }
                                if (liveSessionEventNotification4 != null) {
                                    l0 l0VarD19 = iVar.d();
                                    e2 e2Var19 = iVar.f170500a;
                                    bVar.f170402a = null;
                                    bVar.f170403b = activityAlertRequest;
                                    bVar.f170406e = 7;
                                    l0VarD19.getClass();
                                    type = activityAlertRequest.getType();
                                    type.getClass();
                                    switch (ug2.g.f170775d[type.ordinal()]) {
                                        case 1:
                                            dVar2 = ug2.d.UNKNOWN;
                                            break;
                                        case 2:
                                            dVar2 = ug2.d.DISTANCE;
                                            break;
                                        case 3:
                                            dVar2 = ug2.d.RUN;
                                            break;
                                        case 4:
                                            dVar2 = ug2.d.WALK;
                                            break;
                                        case 5:
                                            dVar2 = ug2.d.POWER;
                                            break;
                                        case 6:
                                            dVar2 = ug2.d.SPEED;
                                            break;
                                        case 7:
                                            dVar2 = ug2.d.PACE;
                                            break;
                                        case 8:
                                            dVar2 = ug2.d.HEART_RATE;
                                            break;
                                        case 9:
                                            dVar2 = ug2.d.CALORIES;
                                            break;
                                        case 10:
                                            dVar2 = ug2.d.ELEVATION;
                                            break;
                                        case 11:
                                            dVar2 = ug2.d.CADENCE_SPM;
                                            break;
                                        case 12:
                                            dVar2 = ug2.d.CADENCE_RPM;
                                            break;
                                        case 13:
                                            dVar2 = ug2.d.TIME;
                                            break;
                                        case 14:
                                            dVar2 = ug2.d.LAP;
                                            break;
                                        case 15:
                                            dVar2 = ug2.d.CLIMB;
                                            break;
                                        case 16:
                                            dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                            break;
                                        case 17:
                                            dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                            break;
                                        case 18:
                                            dVar2 = ug2.d.NAVIGATION;
                                            break;
                                        case 19:
                                            dVar2 = ug2.d.PHASE;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    List<GDILiveSessionProto.ActivityAlertMessage> messagesList7 = activityAlertRequest.getMessagesList();
                                    messagesList7.getClass();
                                    arrayList2 = new ArrayList(p13.y.r(messagesList7, 10));
                                    while (r1.hasNext()) {
                                        String displayString7 = activityAlertMessage.getDisplayString();
                                        displayString7.getClass();
                                        rf2.b bVarC8 = zg2.e.c(activityAlertMessage.getMetric());
                                        size = activityAlertMessage.getSize();
                                        size.getClass();
                                        switch (ug2.g.f170772a[size.ordinal()]) {
                                            case 1:
                                                bVar2 = ug2.b.TINY;
                                                break;
                                            case 2:
                                                bVar2 = ug2.b.XSMALL;
                                                break;
                                            case 3:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            case 4:
                                                bVar2 = ug2.b.MEDIUM;
                                                break;
                                            case 5:
                                                bVar2 = ug2.b.LARGE;
                                                break;
                                            case 6:
                                                bVar2 = ug2.b.XLARGE;
                                                break;
                                            case 7:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            default:
                                                lc.u0.r();
                                                return null;
                                        }
                                        ug2.b bVar16 = bVar2;
                                        GDILiveSessionProto.ActivityAlertMessage.Weight weight7 = activityAlertMessage.getWeight();
                                        weight7.getClass();
                                        i14 = ug2.g.f170774c[weight7.ordinal()];
                                        if (i14 != 1) {
                                            cVar2 = ug2.c.REGULAR;
                                        } else if (i14 != 2) {
                                            if (i14 != i17) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            cVar2 = ug2.c.MEDIUM;
                                        } else {
                                            cVar2 = ug2.c.BOLD;
                                        }
                                        sf2.c.a.C3002a c3002a7 = new sf2.c.a.C3002a(displayString7, bVarC8, bVar16, cVar2);
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a7);
                                        arrayList2.add(c3002a7);
                                        i17 = 3;
                                    }
                                    sf2.c.a aVar8 = new sf2.c.a(dVar2, arrayList2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar8);
                                    objEmit2 = e2Var19.emit(aVar8, bVar);
                                    if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit2 = Unit.INSTANCE;
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                            if (liveSessionEventNotification4.hasDataNotification()) {
                                liveSessionEventNotification8 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification8 = null;
                            }
                            if (liveSessionEventNotification8 != null) {
                                l0 l0VarD110 = iVar.d();
                                e2 e2Var110 = iVar.f170500a;
                                bVar.f170402a = liveSessionEventNotification4;
                                bVar.f170403b = metricsList;
                                bVar.f170406e = 6;
                                l0VarD110.getClass();
                                tVar = l0VarD110.f170427b;
                                arrayList = new ArrayList();
                                it = metricsList.iterator();
                                while (it.hasNext()) {
                                    bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                    if (bVarC != null) {
                                        arrayList.add(bVarC);
                                    }
                                }
                                if (!((y0) tVar.getValue()).f170543d) {
                                    ((y0) tVar.getValue()).f170543d = true;
                                }
                                sf2.c.b bVar17 = new sf2.c.b(arrayList);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar17);
                                objEmit = e2Var110.emit(bVar17, bVar);
                                if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit = Unit.INSTANCE;
                                }
                                if (objEmit != aVar) {
                                }
                            }
                            if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                liveSessionEventNotification4 = null;
                            }
                            if (liveSessionEventNotification4 != null) {
                                l0 l0VarD111 = iVar.d();
                                e2 e2Var111 = iVar.f170500a;
                                bVar.f170402a = null;
                                bVar.f170403b = activityAlertRequest;
                                bVar.f170406e = 7;
                                l0VarD111.getClass();
                                type = activityAlertRequest.getType();
                                type.getClass();
                                switch (ug2.g.f170775d[type.ordinal()]) {
                                    case 1:
                                        dVar2 = ug2.d.UNKNOWN;
                                        break;
                                    case 2:
                                        dVar2 = ug2.d.DISTANCE;
                                        break;
                                    case 3:
                                        dVar2 = ug2.d.RUN;
                                        break;
                                    case 4:
                                        dVar2 = ug2.d.WALK;
                                        break;
                                    case 5:
                                        dVar2 = ug2.d.POWER;
                                        break;
                                    case 6:
                                        dVar2 = ug2.d.SPEED;
                                        break;
                                    case 7:
                                        dVar2 = ug2.d.PACE;
                                        break;
                                    case 8:
                                        dVar2 = ug2.d.HEART_RATE;
                                        break;
                                    case 9:
                                        dVar2 = ug2.d.CALORIES;
                                        break;
                                    case 10:
                                        dVar2 = ug2.d.ELEVATION;
                                        break;
                                    case 11:
                                        dVar2 = ug2.d.CADENCE_SPM;
                                        break;
                                    case 12:
                                        dVar2 = ug2.d.CADENCE_RPM;
                                        break;
                                    case 13:
                                        dVar2 = ug2.d.TIME;
                                        break;
                                    case 14:
                                        dVar2 = ug2.d.LAP;
                                        break;
                                    case 15:
                                        dVar2 = ug2.d.CLIMB;
                                        break;
                                    case 16:
                                        dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                        break;
                                    case 17:
                                        dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                        break;
                                    case 18:
                                        dVar2 = ug2.d.NAVIGATION;
                                        break;
                                    case 19:
                                        dVar2 = ug2.d.PHASE;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                List<GDILiveSessionProto.ActivityAlertMessage> messagesList8 = activityAlertRequest.getMessagesList();
                                messagesList8.getClass();
                                arrayList2 = new ArrayList(p13.y.r(messagesList8, 10));
                                while (r1.hasNext()) {
                                    String displayString8 = activityAlertMessage.getDisplayString();
                                    displayString8.getClass();
                                    rf2.b bVarC9 = zg2.e.c(activityAlertMessage.getMetric());
                                    size = activityAlertMessage.getSize();
                                    size.getClass();
                                    switch (ug2.g.f170772a[size.ordinal()]) {
                                        case 1:
                                            bVar2 = ug2.b.TINY;
                                            break;
                                        case 2:
                                            bVar2 = ug2.b.XSMALL;
                                            break;
                                        case 3:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        case 4:
                                            bVar2 = ug2.b.MEDIUM;
                                            break;
                                        case 5:
                                            bVar2 = ug2.b.LARGE;
                                            break;
                                        case 6:
                                            bVar2 = ug2.b.XLARGE;
                                            break;
                                        case 7:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    ug2.b bVar18 = bVar2;
                                    GDILiveSessionProto.ActivityAlertMessage.Weight weight8 = activityAlertMessage.getWeight();
                                    weight8.getClass();
                                    i14 = ug2.g.f170774c[weight8.ordinal()];
                                    if (i14 != 1) {
                                        cVar2 = ug2.c.REGULAR;
                                    } else if (i14 != 2) {
                                        if (i14 != i17) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        cVar2 = ug2.c.MEDIUM;
                                    } else {
                                        cVar2 = ug2.c.BOLD;
                                    }
                                    sf2.c.a.C3002a c3002a8 = new sf2.c.a.C3002a(displayString8, bVarC9, bVar18, cVar2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a8);
                                    arrayList2.add(c3002a8);
                                    i17 = 3;
                                }
                                sf2.c.a aVar9 = new sf2.c.a(dVar2, arrayList2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar9);
                                objEmit2 = e2Var111.emit(aVar9, bVar);
                                if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit2 = Unit.INSTANCE;
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar;
                case 1:
                    GDILiveSessionProto.LiveSessionEventNotification liveSessionEventNotification10 = bVar.f170402a;
                    o13.r.b(obj);
                    liveSessionEventNotification2 = liveSessionEventNotification10;
                    if (liveSessionEventNotification2.hasFinalizeSetRequest()) {
                        liveSessionEventNotification3 = liveSessionEventNotification2;
                    } else {
                        liveSessionEventNotification3 = null;
                    }
                    if (liveSessionEventNotification3 != null) {
                        l0 l0VarD20 = iVar.d();
                        e2 e2Var20 = iVar.f170500a;
                        bVar.f170402a = liveSessionEventNotification2;
                        bVar.f170403b = finalizeSetRequest;
                        bVar.f170406e = 2;
                        break;
                    }
                    liveSessionEventNotification4 = liveSessionEventNotification2;
                    if (liveSessionEventNotification4.hasSetConfigurationRequest()) {
                        liveSessionEventNotification5 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification5 = null;
                    }
                    if (liveSessionEventNotification5 != null) {
                        if (liveSessionEventNotification4.hasCancelFinalizeTimerRequest()) {
                            liveSessionEventNotification6 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification6 = null;
                        }
                        if (liveSessionEventNotification6 != null) {
                            if (liveSessionEventNotification4.hasActivityStateRequest()) {
                                liveSessionEventNotification7 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification7 = null;
                            }
                            if (liveSessionEventNotification7 != null) {
                                if (liveSessionEventNotification4.hasDataNotification()) {
                                    liveSessionEventNotification8 = liveSessionEventNotification4;
                                } else {
                                    liveSessionEventNotification8 = null;
                                }
                                if (liveSessionEventNotification8 != null) {
                                    l0 l0VarD112 = iVar.d();
                                    e2 e2Var112 = iVar.f170500a;
                                    bVar.f170402a = liveSessionEventNotification4;
                                    bVar.f170403b = metricsList;
                                    bVar.f170406e = 6;
                                    l0VarD112.getClass();
                                    tVar = l0VarD112.f170427b;
                                    arrayList = new ArrayList();
                                    it = metricsList.iterator();
                                    while (it.hasNext()) {
                                        bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                        if (bVarC != null) {
                                            arrayList.add(bVarC);
                                        }
                                    }
                                    if (!((y0) tVar.getValue()).f170543d) {
                                        ((y0) tVar.getValue()).f170543d = true;
                                    }
                                    sf2.c.b bVar19 = new sf2.c.b(arrayList);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar19);
                                    objEmit = e2Var112.emit(bVar19, bVar);
                                    if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit = Unit.INSTANCE;
                                    }
                                    if (objEmit != aVar) {
                                    }
                                }
                                if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                    liveSessionEventNotification4 = null;
                                }
                                if (liveSessionEventNotification4 != null) {
                                    l0 l0VarD113 = iVar.d();
                                    e2 e2Var113 = iVar.f170500a;
                                    bVar.f170402a = null;
                                    bVar.f170403b = activityAlertRequest;
                                    bVar.f170406e = 7;
                                    l0VarD113.getClass();
                                    type = activityAlertRequest.getType();
                                    type.getClass();
                                    switch (ug2.g.f170775d[type.ordinal()]) {
                                        case 1:
                                            dVar2 = ug2.d.UNKNOWN;
                                            break;
                                        case 2:
                                            dVar2 = ug2.d.DISTANCE;
                                            break;
                                        case 3:
                                            dVar2 = ug2.d.RUN;
                                            break;
                                        case 4:
                                            dVar2 = ug2.d.WALK;
                                            break;
                                        case 5:
                                            dVar2 = ug2.d.POWER;
                                            break;
                                        case 6:
                                            dVar2 = ug2.d.SPEED;
                                            break;
                                        case 7:
                                            dVar2 = ug2.d.PACE;
                                            break;
                                        case 8:
                                            dVar2 = ug2.d.HEART_RATE;
                                            break;
                                        case 9:
                                            dVar2 = ug2.d.CALORIES;
                                            break;
                                        case 10:
                                            dVar2 = ug2.d.ELEVATION;
                                            break;
                                        case 11:
                                            dVar2 = ug2.d.CADENCE_SPM;
                                            break;
                                        case 12:
                                            dVar2 = ug2.d.CADENCE_RPM;
                                            break;
                                        case 13:
                                            dVar2 = ug2.d.TIME;
                                            break;
                                        case 14:
                                            dVar2 = ug2.d.LAP;
                                            break;
                                        case 15:
                                            dVar2 = ug2.d.CLIMB;
                                            break;
                                        case 16:
                                            dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                            break;
                                        case 17:
                                            dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                            break;
                                        case 18:
                                            dVar2 = ug2.d.NAVIGATION;
                                            break;
                                        case 19:
                                            dVar2 = ug2.d.PHASE;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    List<GDILiveSessionProto.ActivityAlertMessage> messagesList9 = activityAlertRequest.getMessagesList();
                                    messagesList9.getClass();
                                    arrayList2 = new ArrayList(p13.y.r(messagesList9, 10));
                                    while (r1.hasNext()) {
                                        String displayString9 = activityAlertMessage.getDisplayString();
                                        displayString9.getClass();
                                        rf2.b bVarC10 = zg2.e.c(activityAlertMessage.getMetric());
                                        size = activityAlertMessage.getSize();
                                        size.getClass();
                                        switch (ug2.g.f170772a[size.ordinal()]) {
                                            case 1:
                                                bVar2 = ug2.b.TINY;
                                                break;
                                            case 2:
                                                bVar2 = ug2.b.XSMALL;
                                                break;
                                            case 3:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            case 4:
                                                bVar2 = ug2.b.MEDIUM;
                                                break;
                                            case 5:
                                                bVar2 = ug2.b.LARGE;
                                                break;
                                            case 6:
                                                bVar2 = ug2.b.XLARGE;
                                                break;
                                            case 7:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            default:
                                                lc.u0.r();
                                                return null;
                                        }
                                        ug2.b bVar110 = bVar2;
                                        GDILiveSessionProto.ActivityAlertMessage.Weight weight9 = activityAlertMessage.getWeight();
                                        weight9.getClass();
                                        i14 = ug2.g.f170774c[weight9.ordinal()];
                                        if (i14 != 1) {
                                            cVar2 = ug2.c.REGULAR;
                                        } else if (i14 != 2) {
                                            if (i14 != i17) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            cVar2 = ug2.c.MEDIUM;
                                        } else {
                                            cVar2 = ug2.c.BOLD;
                                        }
                                        sf2.c.a.C3002a c3002a9 = new sf2.c.a.C3002a(displayString9, bVarC10, bVar110, cVar2);
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a9);
                                        arrayList2.add(c3002a9);
                                        i17 = 3;
                                    }
                                    sf2.c.a aVar10 = new sf2.c.a(dVar2, arrayList2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar10);
                                    objEmit2 = e2Var113.emit(aVar10, bVar);
                                    if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit2 = Unit.INSTANCE;
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                            if (liveSessionEventNotification4.hasDataNotification()) {
                                liveSessionEventNotification8 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification8 = null;
                            }
                            if (liveSessionEventNotification8 != null) {
                                l0 l0VarD114 = iVar.d();
                                e2 e2Var114 = iVar.f170500a;
                                bVar.f170402a = liveSessionEventNotification4;
                                bVar.f170403b = metricsList;
                                bVar.f170406e = 6;
                                l0VarD114.getClass();
                                tVar = l0VarD114.f170427b;
                                arrayList = new ArrayList();
                                it = metricsList.iterator();
                                while (it.hasNext()) {
                                    bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                    if (bVarC != null) {
                                        arrayList.add(bVarC);
                                    }
                                }
                                if (!((y0) tVar.getValue()).f170543d) {
                                    ((y0) tVar.getValue()).f170543d = true;
                                }
                                sf2.c.b bVar111 = new sf2.c.b(arrayList);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar111);
                                objEmit = e2Var114.emit(bVar111, bVar);
                                if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit = Unit.INSTANCE;
                                }
                                if (objEmit != aVar) {
                                }
                            }
                            if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                liveSessionEventNotification4 = null;
                            }
                            if (liveSessionEventNotification4 != null) {
                                l0 l0VarD115 = iVar.d();
                                e2 e2Var115 = iVar.f170500a;
                                bVar.f170402a = null;
                                bVar.f170403b = activityAlertRequest;
                                bVar.f170406e = 7;
                                l0VarD115.getClass();
                                type = activityAlertRequest.getType();
                                type.getClass();
                                switch (ug2.g.f170775d[type.ordinal()]) {
                                    case 1:
                                        dVar2 = ug2.d.UNKNOWN;
                                        break;
                                    case 2:
                                        dVar2 = ug2.d.DISTANCE;
                                        break;
                                    case 3:
                                        dVar2 = ug2.d.RUN;
                                        break;
                                    case 4:
                                        dVar2 = ug2.d.WALK;
                                        break;
                                    case 5:
                                        dVar2 = ug2.d.POWER;
                                        break;
                                    case 6:
                                        dVar2 = ug2.d.SPEED;
                                        break;
                                    case 7:
                                        dVar2 = ug2.d.PACE;
                                        break;
                                    case 8:
                                        dVar2 = ug2.d.HEART_RATE;
                                        break;
                                    case 9:
                                        dVar2 = ug2.d.CALORIES;
                                        break;
                                    case 10:
                                        dVar2 = ug2.d.ELEVATION;
                                        break;
                                    case 11:
                                        dVar2 = ug2.d.CADENCE_SPM;
                                        break;
                                    case 12:
                                        dVar2 = ug2.d.CADENCE_RPM;
                                        break;
                                    case 13:
                                        dVar2 = ug2.d.TIME;
                                        break;
                                    case 14:
                                        dVar2 = ug2.d.LAP;
                                        break;
                                    case 15:
                                        dVar2 = ug2.d.CLIMB;
                                        break;
                                    case 16:
                                        dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                        break;
                                    case 17:
                                        dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                        break;
                                    case 18:
                                        dVar2 = ug2.d.NAVIGATION;
                                        break;
                                    case 19:
                                        dVar2 = ug2.d.PHASE;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                List<GDILiveSessionProto.ActivityAlertMessage> messagesList10 = activityAlertRequest.getMessagesList();
                                messagesList10.getClass();
                                arrayList2 = new ArrayList(p13.y.r(messagesList10, 10));
                                while (r1.hasNext()) {
                                    String displayString10 = activityAlertMessage.getDisplayString();
                                    displayString10.getClass();
                                    rf2.b bVarC11 = zg2.e.c(activityAlertMessage.getMetric());
                                    size = activityAlertMessage.getSize();
                                    size.getClass();
                                    switch (ug2.g.f170772a[size.ordinal()]) {
                                        case 1:
                                            bVar2 = ug2.b.TINY;
                                            break;
                                        case 2:
                                            bVar2 = ug2.b.XSMALL;
                                            break;
                                        case 3:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        case 4:
                                            bVar2 = ug2.b.MEDIUM;
                                            break;
                                        case 5:
                                            bVar2 = ug2.b.LARGE;
                                            break;
                                        case 6:
                                            bVar2 = ug2.b.XLARGE;
                                            break;
                                        case 7:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    ug2.b bVar112 = bVar2;
                                    GDILiveSessionProto.ActivityAlertMessage.Weight weight10 = activityAlertMessage.getWeight();
                                    weight10.getClass();
                                    i14 = ug2.g.f170774c[weight10.ordinal()];
                                    if (i14 != 1) {
                                        cVar2 = ug2.c.REGULAR;
                                    } else if (i14 != 2) {
                                        if (i14 != i17) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        cVar2 = ug2.c.MEDIUM;
                                    } else {
                                        cVar2 = ug2.c.BOLD;
                                    }
                                    sf2.c.a.C3002a c3002a10 = new sf2.c.a.C3002a(displayString10, bVarC11, bVar112, cVar2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a10);
                                    arrayList2.add(c3002a10);
                                    i17 = 3;
                                }
                                sf2.c.a aVar11 = new sf2.c.a(dVar2, arrayList2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar11);
                                objEmit2 = e2Var115.emit(aVar11, bVar);
                                if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit2 = Unit.INSTANCE;
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        if (liveSessionEventNotification4.hasActivityStateRequest()) {
                            liveSessionEventNotification7 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification7 = null;
                        }
                        if (liveSessionEventNotification7 != null) {
                            if (liveSessionEventNotification4.hasDataNotification()) {
                                liveSessionEventNotification8 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification8 = null;
                            }
                            if (liveSessionEventNotification8 != null) {
                                l0 l0VarD116 = iVar.d();
                                e2 e2Var116 = iVar.f170500a;
                                bVar.f170402a = liveSessionEventNotification4;
                                bVar.f170403b = metricsList;
                                bVar.f170406e = 6;
                                l0VarD116.getClass();
                                tVar = l0VarD116.f170427b;
                                arrayList = new ArrayList();
                                it = metricsList.iterator();
                                while (it.hasNext()) {
                                    bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                    if (bVarC != null) {
                                        arrayList.add(bVarC);
                                    }
                                }
                                if (!((y0) tVar.getValue()).f170543d) {
                                    ((y0) tVar.getValue()).f170543d = true;
                                }
                                sf2.c.b bVar113 = new sf2.c.b(arrayList);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar113);
                                objEmit = e2Var116.emit(bVar113, bVar);
                                if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit = Unit.INSTANCE;
                                }
                                if (objEmit != aVar) {
                                }
                            }
                            if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                liveSessionEventNotification4 = null;
                            }
                            if (liveSessionEventNotification4 != null) {
                                l0 l0VarD117 = iVar.d();
                                e2 e2Var117 = iVar.f170500a;
                                bVar.f170402a = null;
                                bVar.f170403b = activityAlertRequest;
                                bVar.f170406e = 7;
                                l0VarD117.getClass();
                                type = activityAlertRequest.getType();
                                type.getClass();
                                switch (ug2.g.f170775d[type.ordinal()]) {
                                    case 1:
                                        dVar2 = ug2.d.UNKNOWN;
                                        break;
                                    case 2:
                                        dVar2 = ug2.d.DISTANCE;
                                        break;
                                    case 3:
                                        dVar2 = ug2.d.RUN;
                                        break;
                                    case 4:
                                        dVar2 = ug2.d.WALK;
                                        break;
                                    case 5:
                                        dVar2 = ug2.d.POWER;
                                        break;
                                    case 6:
                                        dVar2 = ug2.d.SPEED;
                                        break;
                                    case 7:
                                        dVar2 = ug2.d.PACE;
                                        break;
                                    case 8:
                                        dVar2 = ug2.d.HEART_RATE;
                                        break;
                                    case 9:
                                        dVar2 = ug2.d.CALORIES;
                                        break;
                                    case 10:
                                        dVar2 = ug2.d.ELEVATION;
                                        break;
                                    case 11:
                                        dVar2 = ug2.d.CADENCE_SPM;
                                        break;
                                    case 12:
                                        dVar2 = ug2.d.CADENCE_RPM;
                                        break;
                                    case 13:
                                        dVar2 = ug2.d.TIME;
                                        break;
                                    case 14:
                                        dVar2 = ug2.d.LAP;
                                        break;
                                    case 15:
                                        dVar2 = ug2.d.CLIMB;
                                        break;
                                    case 16:
                                        dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                        break;
                                    case 17:
                                        dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                        break;
                                    case 18:
                                        dVar2 = ug2.d.NAVIGATION;
                                        break;
                                    case 19:
                                        dVar2 = ug2.d.PHASE;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                List<GDILiveSessionProto.ActivityAlertMessage> messagesList11 = activityAlertRequest.getMessagesList();
                                messagesList11.getClass();
                                arrayList2 = new ArrayList(p13.y.r(messagesList11, 10));
                                while (r1.hasNext()) {
                                    String displayString11 = activityAlertMessage.getDisplayString();
                                    displayString11.getClass();
                                    rf2.b bVarC12 = zg2.e.c(activityAlertMessage.getMetric());
                                    size = activityAlertMessage.getSize();
                                    size.getClass();
                                    switch (ug2.g.f170772a[size.ordinal()]) {
                                        case 1:
                                            bVar2 = ug2.b.TINY;
                                            break;
                                        case 2:
                                            bVar2 = ug2.b.XSMALL;
                                            break;
                                        case 3:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        case 4:
                                            bVar2 = ug2.b.MEDIUM;
                                            break;
                                        case 5:
                                            bVar2 = ug2.b.LARGE;
                                            break;
                                        case 6:
                                            bVar2 = ug2.b.XLARGE;
                                            break;
                                        case 7:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    ug2.b bVar114 = bVar2;
                                    GDILiveSessionProto.ActivityAlertMessage.Weight weight11 = activityAlertMessage.getWeight();
                                    weight11.getClass();
                                    i14 = ug2.g.f170774c[weight11.ordinal()];
                                    if (i14 != 1) {
                                        cVar2 = ug2.c.REGULAR;
                                    } else if (i14 != 2) {
                                        if (i14 != i17) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        cVar2 = ug2.c.MEDIUM;
                                    } else {
                                        cVar2 = ug2.c.BOLD;
                                    }
                                    sf2.c.a.C3002a c3002a11 = new sf2.c.a.C3002a(displayString11, bVarC12, bVar114, cVar2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a11);
                                    arrayList2.add(c3002a11);
                                    i17 = 3;
                                }
                                sf2.c.a aVar12 = new sf2.c.a(dVar2, arrayList2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar12);
                                objEmit2 = e2Var117.emit(aVar12, bVar);
                                if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit2 = Unit.INSTANCE;
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        if (liveSessionEventNotification4.hasDataNotification()) {
                            liveSessionEventNotification8 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification8 = null;
                        }
                        if (liveSessionEventNotification8 != null) {
                            l0 l0VarD118 = iVar.d();
                            e2 e2Var118 = iVar.f170500a;
                            bVar.f170402a = liveSessionEventNotification4;
                            bVar.f170403b = metricsList;
                            bVar.f170406e = 6;
                            l0VarD118.getClass();
                            tVar = l0VarD118.f170427b;
                            arrayList = new ArrayList();
                            it = metricsList.iterator();
                            while (it.hasNext()) {
                                bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                if (bVarC != null) {
                                    arrayList.add(bVarC);
                                }
                            }
                            if (!((y0) tVar.getValue()).f170543d) {
                                ((y0) tVar.getValue()).f170543d = true;
                            }
                            sf2.c.b bVar115 = new sf2.c.b(arrayList);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar115);
                            objEmit = e2Var118.emit(bVar115, bVar);
                            if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                objEmit = Unit.INSTANCE;
                            }
                            if (objEmit != aVar) {
                            }
                        }
                        if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                            liveSessionEventNotification4 = null;
                        }
                        if (liveSessionEventNotification4 != null) {
                            l0 l0VarD119 = iVar.d();
                            e2 e2Var119 = iVar.f170500a;
                            bVar.f170402a = null;
                            bVar.f170403b = activityAlertRequest;
                            bVar.f170406e = 7;
                            l0VarD119.getClass();
                            type = activityAlertRequest.getType();
                            type.getClass();
                            switch (ug2.g.f170775d[type.ordinal()]) {
                                case 1:
                                    dVar2 = ug2.d.UNKNOWN;
                                    break;
                                case 2:
                                    dVar2 = ug2.d.DISTANCE;
                                    break;
                                case 3:
                                    dVar2 = ug2.d.RUN;
                                    break;
                                case 4:
                                    dVar2 = ug2.d.WALK;
                                    break;
                                case 5:
                                    dVar2 = ug2.d.POWER;
                                    break;
                                case 6:
                                    dVar2 = ug2.d.SPEED;
                                    break;
                                case 7:
                                    dVar2 = ug2.d.PACE;
                                    break;
                                case 8:
                                    dVar2 = ug2.d.HEART_RATE;
                                    break;
                                case 9:
                                    dVar2 = ug2.d.CALORIES;
                                    break;
                                case 10:
                                    dVar2 = ug2.d.ELEVATION;
                                    break;
                                case 11:
                                    dVar2 = ug2.d.CADENCE_SPM;
                                    break;
                                case 12:
                                    dVar2 = ug2.d.CADENCE_RPM;
                                    break;
                                case 13:
                                    dVar2 = ug2.d.TIME;
                                    break;
                                case 14:
                                    dVar2 = ug2.d.LAP;
                                    break;
                                case 15:
                                    dVar2 = ug2.d.CLIMB;
                                    break;
                                case 16:
                                    dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                    break;
                                case 17:
                                    dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                    break;
                                case 18:
                                    dVar2 = ug2.d.NAVIGATION;
                                    break;
                                case 19:
                                    dVar2 = ug2.d.PHASE;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            List<GDILiveSessionProto.ActivityAlertMessage> messagesList12 = activityAlertRequest.getMessagesList();
                            messagesList12.getClass();
                            arrayList2 = new ArrayList(p13.y.r(messagesList12, 10));
                            while (r1.hasNext()) {
                                String displayString12 = activityAlertMessage.getDisplayString();
                                displayString12.getClass();
                                rf2.b bVarC13 = zg2.e.c(activityAlertMessage.getMetric());
                                size = activityAlertMessage.getSize();
                                size.getClass();
                                switch (ug2.g.f170772a[size.ordinal()]) {
                                    case 1:
                                        bVar2 = ug2.b.TINY;
                                        break;
                                    case 2:
                                        bVar2 = ug2.b.XSMALL;
                                        break;
                                    case 3:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    case 4:
                                        bVar2 = ug2.b.MEDIUM;
                                        break;
                                    case 5:
                                        bVar2 = ug2.b.LARGE;
                                        break;
                                    case 6:
                                        bVar2 = ug2.b.XLARGE;
                                        break;
                                    case 7:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                ug2.b bVar116 = bVar2;
                                GDILiveSessionProto.ActivityAlertMessage.Weight weight12 = activityAlertMessage.getWeight();
                                weight12.getClass();
                                i14 = ug2.g.f170774c[weight12.ordinal()];
                                if (i14 != 1) {
                                    cVar2 = ug2.c.REGULAR;
                                } else if (i14 != 2) {
                                    if (i14 != i17) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    cVar2 = ug2.c.MEDIUM;
                                } else {
                                    cVar2 = ug2.c.BOLD;
                                }
                                sf2.c.a.C3002a c3002a12 = new sf2.c.a.C3002a(displayString12, bVarC13, bVar116, cVar2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a12);
                                arrayList2.add(c3002a12);
                                i17 = 3;
                            }
                            sf2.c.a aVar13 = new sf2.c.a(dVar2, arrayList2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar13);
                            objEmit2 = e2Var119.emit(aVar13, bVar);
                            if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                objEmit2 = Unit.INSTANCE;
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (liveSessionEventNotification4.hasCancelFinalizeTimerRequest()) {
                        liveSessionEventNotification6 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification6 = null;
                    }
                    if (liveSessionEventNotification6 != null) {
                        if (liveSessionEventNotification4.hasActivityStateRequest()) {
                            liveSessionEventNotification7 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification7 = null;
                        }
                        if (liveSessionEventNotification7 != null) {
                            if (liveSessionEventNotification4.hasDataNotification()) {
                                liveSessionEventNotification8 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification8 = null;
                            }
                            if (liveSessionEventNotification8 != null) {
                                l0 l0VarD1110 = iVar.d();
                                e2 e2Var1110 = iVar.f170500a;
                                bVar.f170402a = liveSessionEventNotification4;
                                bVar.f170403b = metricsList;
                                bVar.f170406e = 6;
                                l0VarD1110.getClass();
                                tVar = l0VarD1110.f170427b;
                                arrayList = new ArrayList();
                                it = metricsList.iterator();
                                while (it.hasNext()) {
                                    bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                    if (bVarC != null) {
                                        arrayList.add(bVarC);
                                    }
                                }
                                if (!((y0) tVar.getValue()).f170543d) {
                                    ((y0) tVar.getValue()).f170543d = true;
                                }
                                sf2.c.b bVar117 = new sf2.c.b(arrayList);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar117);
                                objEmit = e2Var1110.emit(bVar117, bVar);
                                if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit = Unit.INSTANCE;
                                }
                                if (objEmit != aVar) {
                                }
                            }
                            if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                liveSessionEventNotification4 = null;
                            }
                            if (liveSessionEventNotification4 != null) {
                                l0 l0VarD1111 = iVar.d();
                                e2 e2Var1111 = iVar.f170500a;
                                bVar.f170402a = null;
                                bVar.f170403b = activityAlertRequest;
                                bVar.f170406e = 7;
                                l0VarD1111.getClass();
                                type = activityAlertRequest.getType();
                                type.getClass();
                                switch (ug2.g.f170775d[type.ordinal()]) {
                                    case 1:
                                        dVar2 = ug2.d.UNKNOWN;
                                        break;
                                    case 2:
                                        dVar2 = ug2.d.DISTANCE;
                                        break;
                                    case 3:
                                        dVar2 = ug2.d.RUN;
                                        break;
                                    case 4:
                                        dVar2 = ug2.d.WALK;
                                        break;
                                    case 5:
                                        dVar2 = ug2.d.POWER;
                                        break;
                                    case 6:
                                        dVar2 = ug2.d.SPEED;
                                        break;
                                    case 7:
                                        dVar2 = ug2.d.PACE;
                                        break;
                                    case 8:
                                        dVar2 = ug2.d.HEART_RATE;
                                        break;
                                    case 9:
                                        dVar2 = ug2.d.CALORIES;
                                        break;
                                    case 10:
                                        dVar2 = ug2.d.ELEVATION;
                                        break;
                                    case 11:
                                        dVar2 = ug2.d.CADENCE_SPM;
                                        break;
                                    case 12:
                                        dVar2 = ug2.d.CADENCE_RPM;
                                        break;
                                    case 13:
                                        dVar2 = ug2.d.TIME;
                                        break;
                                    case 14:
                                        dVar2 = ug2.d.LAP;
                                        break;
                                    case 15:
                                        dVar2 = ug2.d.CLIMB;
                                        break;
                                    case 16:
                                        dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                        break;
                                    case 17:
                                        dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                        break;
                                    case 18:
                                        dVar2 = ug2.d.NAVIGATION;
                                        break;
                                    case 19:
                                        dVar2 = ug2.d.PHASE;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                List<GDILiveSessionProto.ActivityAlertMessage> messagesList13 = activityAlertRequest.getMessagesList();
                                messagesList13.getClass();
                                arrayList2 = new ArrayList(p13.y.r(messagesList13, 10));
                                while (r1.hasNext()) {
                                    String displayString13 = activityAlertMessage.getDisplayString();
                                    displayString13.getClass();
                                    rf2.b bVarC14 = zg2.e.c(activityAlertMessage.getMetric());
                                    size = activityAlertMessage.getSize();
                                    size.getClass();
                                    switch (ug2.g.f170772a[size.ordinal()]) {
                                        case 1:
                                            bVar2 = ug2.b.TINY;
                                            break;
                                        case 2:
                                            bVar2 = ug2.b.XSMALL;
                                            break;
                                        case 3:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        case 4:
                                            bVar2 = ug2.b.MEDIUM;
                                            break;
                                        case 5:
                                            bVar2 = ug2.b.LARGE;
                                            break;
                                        case 6:
                                            bVar2 = ug2.b.XLARGE;
                                            break;
                                        case 7:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    ug2.b bVar118 = bVar2;
                                    GDILiveSessionProto.ActivityAlertMessage.Weight weight13 = activityAlertMessage.getWeight();
                                    weight13.getClass();
                                    i14 = ug2.g.f170774c[weight13.ordinal()];
                                    if (i14 != 1) {
                                        cVar2 = ug2.c.REGULAR;
                                    } else if (i14 != 2) {
                                        if (i14 != i17) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        cVar2 = ug2.c.MEDIUM;
                                    } else {
                                        cVar2 = ug2.c.BOLD;
                                    }
                                    sf2.c.a.C3002a c3002a13 = new sf2.c.a.C3002a(displayString13, bVarC14, bVar118, cVar2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a13);
                                    arrayList2.add(c3002a13);
                                    i17 = 3;
                                }
                                sf2.c.a aVar14 = new sf2.c.a(dVar2, arrayList2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar14);
                                objEmit2 = e2Var1111.emit(aVar14, bVar);
                                if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit2 = Unit.INSTANCE;
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        if (liveSessionEventNotification4.hasDataNotification()) {
                            liveSessionEventNotification8 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification8 = null;
                        }
                        if (liveSessionEventNotification8 != null) {
                            l0 l0VarD1112 = iVar.d();
                            e2 e2Var1112 = iVar.f170500a;
                            bVar.f170402a = liveSessionEventNotification4;
                            bVar.f170403b = metricsList;
                            bVar.f170406e = 6;
                            l0VarD1112.getClass();
                            tVar = l0VarD1112.f170427b;
                            arrayList = new ArrayList();
                            it = metricsList.iterator();
                            while (it.hasNext()) {
                                bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                if (bVarC != null) {
                                    arrayList.add(bVarC);
                                }
                            }
                            if (!((y0) tVar.getValue()).f170543d) {
                                ((y0) tVar.getValue()).f170543d = true;
                            }
                            sf2.c.b bVar119 = new sf2.c.b(arrayList);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar119);
                            objEmit = e2Var1112.emit(bVar119, bVar);
                            if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                objEmit = Unit.INSTANCE;
                            }
                            if (objEmit != aVar) {
                            }
                        }
                        if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                            liveSessionEventNotification4 = null;
                        }
                        if (liveSessionEventNotification4 != null) {
                            l0 l0VarD1113 = iVar.d();
                            e2 e2Var1113 = iVar.f170500a;
                            bVar.f170402a = null;
                            bVar.f170403b = activityAlertRequest;
                            bVar.f170406e = 7;
                            l0VarD1113.getClass();
                            type = activityAlertRequest.getType();
                            type.getClass();
                            switch (ug2.g.f170775d[type.ordinal()]) {
                                case 1:
                                    dVar2 = ug2.d.UNKNOWN;
                                    break;
                                case 2:
                                    dVar2 = ug2.d.DISTANCE;
                                    break;
                                case 3:
                                    dVar2 = ug2.d.RUN;
                                    break;
                                case 4:
                                    dVar2 = ug2.d.WALK;
                                    break;
                                case 5:
                                    dVar2 = ug2.d.POWER;
                                    break;
                                case 6:
                                    dVar2 = ug2.d.SPEED;
                                    break;
                                case 7:
                                    dVar2 = ug2.d.PACE;
                                    break;
                                case 8:
                                    dVar2 = ug2.d.HEART_RATE;
                                    break;
                                case 9:
                                    dVar2 = ug2.d.CALORIES;
                                    break;
                                case 10:
                                    dVar2 = ug2.d.ELEVATION;
                                    break;
                                case 11:
                                    dVar2 = ug2.d.CADENCE_SPM;
                                    break;
                                case 12:
                                    dVar2 = ug2.d.CADENCE_RPM;
                                    break;
                                case 13:
                                    dVar2 = ug2.d.TIME;
                                    break;
                                case 14:
                                    dVar2 = ug2.d.LAP;
                                    break;
                                case 15:
                                    dVar2 = ug2.d.CLIMB;
                                    break;
                                case 16:
                                    dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                    break;
                                case 17:
                                    dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                    break;
                                case 18:
                                    dVar2 = ug2.d.NAVIGATION;
                                    break;
                                case 19:
                                    dVar2 = ug2.d.PHASE;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            List<GDILiveSessionProto.ActivityAlertMessage> messagesList14 = activityAlertRequest.getMessagesList();
                            messagesList14.getClass();
                            arrayList2 = new ArrayList(p13.y.r(messagesList14, 10));
                            while (r1.hasNext()) {
                                String displayString14 = activityAlertMessage.getDisplayString();
                                displayString14.getClass();
                                rf2.b bVarC15 = zg2.e.c(activityAlertMessage.getMetric());
                                size = activityAlertMessage.getSize();
                                size.getClass();
                                switch (ug2.g.f170772a[size.ordinal()]) {
                                    case 1:
                                        bVar2 = ug2.b.TINY;
                                        break;
                                    case 2:
                                        bVar2 = ug2.b.XSMALL;
                                        break;
                                    case 3:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    case 4:
                                        bVar2 = ug2.b.MEDIUM;
                                        break;
                                    case 5:
                                        bVar2 = ug2.b.LARGE;
                                        break;
                                    case 6:
                                        bVar2 = ug2.b.XLARGE;
                                        break;
                                    case 7:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                ug2.b bVar1110 = bVar2;
                                GDILiveSessionProto.ActivityAlertMessage.Weight weight14 = activityAlertMessage.getWeight();
                                weight14.getClass();
                                i14 = ug2.g.f170774c[weight14.ordinal()];
                                if (i14 != 1) {
                                    cVar2 = ug2.c.REGULAR;
                                } else if (i14 != 2) {
                                    if (i14 != i17) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    cVar2 = ug2.c.MEDIUM;
                                } else {
                                    cVar2 = ug2.c.BOLD;
                                }
                                sf2.c.a.C3002a c3002a14 = new sf2.c.a.C3002a(displayString14, bVarC15, bVar1110, cVar2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a14);
                                arrayList2.add(c3002a14);
                                i17 = 3;
                            }
                            sf2.c.a aVar15 = new sf2.c.a(dVar2, arrayList2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar15);
                            objEmit2 = e2Var1113.emit(aVar15, bVar);
                            if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                objEmit2 = Unit.INSTANCE;
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (liveSessionEventNotification4.hasActivityStateRequest()) {
                        liveSessionEventNotification7 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification7 = null;
                    }
                    if (liveSessionEventNotification7 != null) {
                        if (liveSessionEventNotification4.hasDataNotification()) {
                            liveSessionEventNotification8 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification8 = null;
                        }
                        if (liveSessionEventNotification8 != null) {
                            l0 l0VarD1114 = iVar.d();
                            e2 e2Var1114 = iVar.f170500a;
                            bVar.f170402a = liveSessionEventNotification4;
                            bVar.f170403b = metricsList;
                            bVar.f170406e = 6;
                            l0VarD1114.getClass();
                            tVar = l0VarD1114.f170427b;
                            arrayList = new ArrayList();
                            it = metricsList.iterator();
                            while (it.hasNext()) {
                                bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                if (bVarC != null) {
                                    arrayList.add(bVarC);
                                }
                            }
                            if (!((y0) tVar.getValue()).f170543d) {
                                ((y0) tVar.getValue()).f170543d = true;
                            }
                            sf2.c.b bVar1111 = new sf2.c.b(arrayList);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar1111);
                            objEmit = e2Var1114.emit(bVar1111, bVar);
                            if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                objEmit = Unit.INSTANCE;
                            }
                            if (objEmit != aVar) {
                            }
                        }
                        if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                            liveSessionEventNotification4 = null;
                        }
                        if (liveSessionEventNotification4 != null) {
                            l0 l0VarD1115 = iVar.d();
                            e2 e2Var1115 = iVar.f170500a;
                            bVar.f170402a = null;
                            bVar.f170403b = activityAlertRequest;
                            bVar.f170406e = 7;
                            l0VarD1115.getClass();
                            type = activityAlertRequest.getType();
                            type.getClass();
                            switch (ug2.g.f170775d[type.ordinal()]) {
                                case 1:
                                    dVar2 = ug2.d.UNKNOWN;
                                    break;
                                case 2:
                                    dVar2 = ug2.d.DISTANCE;
                                    break;
                                case 3:
                                    dVar2 = ug2.d.RUN;
                                    break;
                                case 4:
                                    dVar2 = ug2.d.WALK;
                                    break;
                                case 5:
                                    dVar2 = ug2.d.POWER;
                                    break;
                                case 6:
                                    dVar2 = ug2.d.SPEED;
                                    break;
                                case 7:
                                    dVar2 = ug2.d.PACE;
                                    break;
                                case 8:
                                    dVar2 = ug2.d.HEART_RATE;
                                    break;
                                case 9:
                                    dVar2 = ug2.d.CALORIES;
                                    break;
                                case 10:
                                    dVar2 = ug2.d.ELEVATION;
                                    break;
                                case 11:
                                    dVar2 = ug2.d.CADENCE_SPM;
                                    break;
                                case 12:
                                    dVar2 = ug2.d.CADENCE_RPM;
                                    break;
                                case 13:
                                    dVar2 = ug2.d.TIME;
                                    break;
                                case 14:
                                    dVar2 = ug2.d.LAP;
                                    break;
                                case 15:
                                    dVar2 = ug2.d.CLIMB;
                                    break;
                                case 16:
                                    dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                    break;
                                case 17:
                                    dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                    break;
                                case 18:
                                    dVar2 = ug2.d.NAVIGATION;
                                    break;
                                case 19:
                                    dVar2 = ug2.d.PHASE;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            List<GDILiveSessionProto.ActivityAlertMessage> messagesList15 = activityAlertRequest.getMessagesList();
                            messagesList15.getClass();
                            arrayList2 = new ArrayList(p13.y.r(messagesList15, 10));
                            while (r1.hasNext()) {
                                String displayString15 = activityAlertMessage.getDisplayString();
                                displayString15.getClass();
                                rf2.b bVarC16 = zg2.e.c(activityAlertMessage.getMetric());
                                size = activityAlertMessage.getSize();
                                size.getClass();
                                switch (ug2.g.f170772a[size.ordinal()]) {
                                    case 1:
                                        bVar2 = ug2.b.TINY;
                                        break;
                                    case 2:
                                        bVar2 = ug2.b.XSMALL;
                                        break;
                                    case 3:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    case 4:
                                        bVar2 = ug2.b.MEDIUM;
                                        break;
                                    case 5:
                                        bVar2 = ug2.b.LARGE;
                                        break;
                                    case 6:
                                        bVar2 = ug2.b.XLARGE;
                                        break;
                                    case 7:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                ug2.b bVar1112 = bVar2;
                                GDILiveSessionProto.ActivityAlertMessage.Weight weight15 = activityAlertMessage.getWeight();
                                weight15.getClass();
                                i14 = ug2.g.f170774c[weight15.ordinal()];
                                if (i14 != 1) {
                                    cVar2 = ug2.c.REGULAR;
                                } else if (i14 != 2) {
                                    if (i14 != i17) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    cVar2 = ug2.c.MEDIUM;
                                } else {
                                    cVar2 = ug2.c.BOLD;
                                }
                                sf2.c.a.C3002a c3002a15 = new sf2.c.a.C3002a(displayString15, bVarC16, bVar1112, cVar2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a15);
                                arrayList2.add(c3002a15);
                                i17 = 3;
                            }
                            sf2.c.a aVar16 = new sf2.c.a(dVar2, arrayList2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar16);
                            objEmit2 = e2Var1115.emit(aVar16, bVar);
                            if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                objEmit2 = Unit.INSTANCE;
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (liveSessionEventNotification4.hasDataNotification()) {
                        liveSessionEventNotification8 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification8 = null;
                    }
                    if (liveSessionEventNotification8 != null) {
                        l0 l0VarD1116 = iVar.d();
                        e2 e2Var1116 = iVar.f170500a;
                        bVar.f170402a = liveSessionEventNotification4;
                        bVar.f170403b = metricsList;
                        bVar.f170406e = 6;
                        l0VarD1116.getClass();
                        tVar = l0VarD1116.f170427b;
                        arrayList = new ArrayList();
                        it = metricsList.iterator();
                        while (it.hasNext()) {
                            bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                            if (bVarC != null) {
                                arrayList.add(bVarC);
                            }
                        }
                        if (!((y0) tVar.getValue()).f170543d) {
                            ((y0) tVar.getValue()).f170543d = true;
                        }
                        sf2.c.b bVar1113 = new sf2.c.b(arrayList);
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar1113);
                        objEmit = e2Var1116.emit(bVar1113, bVar);
                        if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                            objEmit = Unit.INSTANCE;
                        }
                        if (objEmit != aVar) {
                        }
                    }
                    if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                        liveSessionEventNotification4 = null;
                    }
                    if (liveSessionEventNotification4 != null) {
                        l0 l0VarD1117 = iVar.d();
                        e2 e2Var1117 = iVar.f170500a;
                        bVar.f170402a = null;
                        bVar.f170403b = activityAlertRequest;
                        bVar.f170406e = 7;
                        l0VarD1117.getClass();
                        type = activityAlertRequest.getType();
                        type.getClass();
                        switch (ug2.g.f170775d[type.ordinal()]) {
                            case 1:
                                dVar2 = ug2.d.UNKNOWN;
                                break;
                            case 2:
                                dVar2 = ug2.d.DISTANCE;
                                break;
                            case 3:
                                dVar2 = ug2.d.RUN;
                                break;
                            case 4:
                                dVar2 = ug2.d.WALK;
                                break;
                            case 5:
                                dVar2 = ug2.d.POWER;
                                break;
                            case 6:
                                dVar2 = ug2.d.SPEED;
                                break;
                            case 7:
                                dVar2 = ug2.d.PACE;
                                break;
                            case 8:
                                dVar2 = ug2.d.HEART_RATE;
                                break;
                            case 9:
                                dVar2 = ug2.d.CALORIES;
                                break;
                            case 10:
                                dVar2 = ug2.d.ELEVATION;
                                break;
                            case 11:
                                dVar2 = ug2.d.CADENCE_SPM;
                                break;
                            case 12:
                                dVar2 = ug2.d.CADENCE_RPM;
                                break;
                            case 13:
                                dVar2 = ug2.d.TIME;
                                break;
                            case 14:
                                dVar2 = ug2.d.LAP;
                                break;
                            case 15:
                                dVar2 = ug2.d.CLIMB;
                                break;
                            case 16:
                                dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                break;
                            case 17:
                                dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                break;
                            case 18:
                                dVar2 = ug2.d.NAVIGATION;
                                break;
                            case 19:
                                dVar2 = ug2.d.PHASE;
                                break;
                            default:
                                lc.u0.r();
                                return null;
                        }
                        List<GDILiveSessionProto.ActivityAlertMessage> messagesList16 = activityAlertRequest.getMessagesList();
                        messagesList16.getClass();
                        arrayList2 = new ArrayList(p13.y.r(messagesList16, 10));
                        while (r1.hasNext()) {
                            String displayString16 = activityAlertMessage.getDisplayString();
                            displayString16.getClass();
                            rf2.b bVarC17 = zg2.e.c(activityAlertMessage.getMetric());
                            size = activityAlertMessage.getSize();
                            size.getClass();
                            switch (ug2.g.f170772a[size.ordinal()]) {
                                case 1:
                                    bVar2 = ug2.b.TINY;
                                    break;
                                case 2:
                                    bVar2 = ug2.b.XSMALL;
                                    break;
                                case 3:
                                    bVar2 = ug2.b.SMALL;
                                    break;
                                case 4:
                                    bVar2 = ug2.b.MEDIUM;
                                    break;
                                case 5:
                                    bVar2 = ug2.b.LARGE;
                                    break;
                                case 6:
                                    bVar2 = ug2.b.XLARGE;
                                    break;
                                case 7:
                                    bVar2 = ug2.b.SMALL;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            ug2.b bVar1114 = bVar2;
                            GDILiveSessionProto.ActivityAlertMessage.Weight weight16 = activityAlertMessage.getWeight();
                            weight16.getClass();
                            i14 = ug2.g.f170774c[weight16.ordinal()];
                            if (i14 != 1) {
                                cVar2 = ug2.c.REGULAR;
                            } else if (i14 != 2) {
                                if (i14 != i17) {
                                    lc.u0.r();
                                    return null;
                                }
                                cVar2 = ug2.c.MEDIUM;
                            } else {
                                cVar2 = ug2.c.BOLD;
                            }
                            sf2.c.a.C3002a c3002a16 = new sf2.c.a.C3002a(displayString16, bVarC17, bVar1114, cVar2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a16);
                            arrayList2.add(c3002a16);
                            i17 = 3;
                        }
                        sf2.c.a aVar17 = new sf2.c.a(dVar2, arrayList2);
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar17);
                        objEmit2 = e2Var1117.emit(aVar17, bVar);
                        if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                            objEmit2 = Unit.INSTANCE;
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                    return aVar;
                case 2:
                    liveSessionEventNotification4 = bVar.f170402a;
                    o13.r.b(obj);
                    if (liveSessionEventNotification4.hasSetConfigurationRequest()) {
                        liveSessionEventNotification5 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification5 = null;
                    }
                    if (liveSessionEventNotification5 != null) {
                        if (liveSessionEventNotification4.hasCancelFinalizeTimerRequest()) {
                            liveSessionEventNotification6 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification6 = null;
                        }
                        if (liveSessionEventNotification6 != null) {
                            if (liveSessionEventNotification4.hasActivityStateRequest()) {
                                liveSessionEventNotification7 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification7 = null;
                            }
                            if (liveSessionEventNotification7 != null) {
                                if (liveSessionEventNotification4.hasDataNotification()) {
                                    liveSessionEventNotification8 = liveSessionEventNotification4;
                                } else {
                                    liveSessionEventNotification8 = null;
                                }
                                if (liveSessionEventNotification8 != null) {
                                    l0 l0VarD1118 = iVar.d();
                                    e2 e2Var1118 = iVar.f170500a;
                                    bVar.f170402a = liveSessionEventNotification4;
                                    bVar.f170403b = metricsList;
                                    bVar.f170406e = 6;
                                    l0VarD1118.getClass();
                                    tVar = l0VarD1118.f170427b;
                                    arrayList = new ArrayList();
                                    it = metricsList.iterator();
                                    while (it.hasNext()) {
                                        bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                        if (bVarC != null) {
                                            arrayList.add(bVarC);
                                        }
                                    }
                                    if (!((y0) tVar.getValue()).f170543d) {
                                        ((y0) tVar.getValue()).f170543d = true;
                                    }
                                    sf2.c.b bVar1115 = new sf2.c.b(arrayList);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar1115);
                                    objEmit = e2Var1118.emit(bVar1115, bVar);
                                    if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit = Unit.INSTANCE;
                                    }
                                    if (objEmit != aVar) {
                                    }
                                }
                                if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                    liveSessionEventNotification4 = null;
                                }
                                if (liveSessionEventNotification4 != null) {
                                    l0 l0VarD1119 = iVar.d();
                                    e2 e2Var1119 = iVar.f170500a;
                                    bVar.f170402a = null;
                                    bVar.f170403b = activityAlertRequest;
                                    bVar.f170406e = 7;
                                    l0VarD1119.getClass();
                                    type = activityAlertRequest.getType();
                                    type.getClass();
                                    switch (ug2.g.f170775d[type.ordinal()]) {
                                        case 1:
                                            dVar2 = ug2.d.UNKNOWN;
                                            break;
                                        case 2:
                                            dVar2 = ug2.d.DISTANCE;
                                            break;
                                        case 3:
                                            dVar2 = ug2.d.RUN;
                                            break;
                                        case 4:
                                            dVar2 = ug2.d.WALK;
                                            break;
                                        case 5:
                                            dVar2 = ug2.d.POWER;
                                            break;
                                        case 6:
                                            dVar2 = ug2.d.SPEED;
                                            break;
                                        case 7:
                                            dVar2 = ug2.d.PACE;
                                            break;
                                        case 8:
                                            dVar2 = ug2.d.HEART_RATE;
                                            break;
                                        case 9:
                                            dVar2 = ug2.d.CALORIES;
                                            break;
                                        case 10:
                                            dVar2 = ug2.d.ELEVATION;
                                            break;
                                        case 11:
                                            dVar2 = ug2.d.CADENCE_SPM;
                                            break;
                                        case 12:
                                            dVar2 = ug2.d.CADENCE_RPM;
                                            break;
                                        case 13:
                                            dVar2 = ug2.d.TIME;
                                            break;
                                        case 14:
                                            dVar2 = ug2.d.LAP;
                                            break;
                                        case 15:
                                            dVar2 = ug2.d.CLIMB;
                                            break;
                                        case 16:
                                            dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                            break;
                                        case 17:
                                            dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                            break;
                                        case 18:
                                            dVar2 = ug2.d.NAVIGATION;
                                            break;
                                        case 19:
                                            dVar2 = ug2.d.PHASE;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    List<GDILiveSessionProto.ActivityAlertMessage> messagesList17 = activityAlertRequest.getMessagesList();
                                    messagesList17.getClass();
                                    arrayList2 = new ArrayList(p13.y.r(messagesList17, 10));
                                    while (r1.hasNext()) {
                                        String displayString17 = activityAlertMessage.getDisplayString();
                                        displayString17.getClass();
                                        rf2.b bVarC18 = zg2.e.c(activityAlertMessage.getMetric());
                                        size = activityAlertMessage.getSize();
                                        size.getClass();
                                        switch (ug2.g.f170772a[size.ordinal()]) {
                                            case 1:
                                                bVar2 = ug2.b.TINY;
                                                break;
                                            case 2:
                                                bVar2 = ug2.b.XSMALL;
                                                break;
                                            case 3:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            case 4:
                                                bVar2 = ug2.b.MEDIUM;
                                                break;
                                            case 5:
                                                bVar2 = ug2.b.LARGE;
                                                break;
                                            case 6:
                                                bVar2 = ug2.b.XLARGE;
                                                break;
                                            case 7:
                                                bVar2 = ug2.b.SMALL;
                                                break;
                                            default:
                                                lc.u0.r();
                                                return null;
                                        }
                                        ug2.b bVar1116 = bVar2;
                                        GDILiveSessionProto.ActivityAlertMessage.Weight weight17 = activityAlertMessage.getWeight();
                                        weight17.getClass();
                                        i14 = ug2.g.f170774c[weight17.ordinal()];
                                        if (i14 != 1) {
                                            cVar2 = ug2.c.REGULAR;
                                        } else if (i14 != 2) {
                                            if (i14 != i17) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            cVar2 = ug2.c.MEDIUM;
                                        } else {
                                            cVar2 = ug2.c.BOLD;
                                        }
                                        sf2.c.a.C3002a c3002a17 = new sf2.c.a.C3002a(displayString17, bVarC18, bVar1116, cVar2);
                                        zg2.c.f204692a.getClass();
                                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a17);
                                        arrayList2.add(c3002a17);
                                        i17 = 3;
                                    }
                                    sf2.c.a aVar18 = new sf2.c.a(dVar2, arrayList2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar18);
                                    objEmit2 = e2Var1119.emit(aVar18, bVar);
                                    if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                        objEmit2 = Unit.INSTANCE;
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                            if (liveSessionEventNotification4.hasDataNotification()) {
                                liveSessionEventNotification8 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification8 = null;
                            }
                            if (liveSessionEventNotification8 != null) {
                                l0 l0VarD11110 = iVar.d();
                                e2 e2Var11110 = iVar.f170500a;
                                bVar.f170402a = liveSessionEventNotification4;
                                bVar.f170403b = metricsList;
                                bVar.f170406e = 6;
                                l0VarD11110.getClass();
                                tVar = l0VarD11110.f170427b;
                                arrayList = new ArrayList();
                                it = metricsList.iterator();
                                while (it.hasNext()) {
                                    bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                    if (bVarC != null) {
                                        arrayList.add(bVarC);
                                    }
                                }
                                if (!((y0) tVar.getValue()).f170543d) {
                                    ((y0) tVar.getValue()).f170543d = true;
                                }
                                sf2.c.b bVar1117 = new sf2.c.b(arrayList);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar1117);
                                objEmit = e2Var11110.emit(bVar1117, bVar);
                                if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit = Unit.INSTANCE;
                                }
                                if (objEmit != aVar) {
                                }
                            }
                            if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                liveSessionEventNotification4 = null;
                            }
                            if (liveSessionEventNotification4 != null) {
                                l0 l0VarD11111 = iVar.d();
                                e2 e2Var11111 = iVar.f170500a;
                                bVar.f170402a = null;
                                bVar.f170403b = activityAlertRequest;
                                bVar.f170406e = 7;
                                l0VarD11111.getClass();
                                type = activityAlertRequest.getType();
                                type.getClass();
                                switch (ug2.g.f170775d[type.ordinal()]) {
                                    case 1:
                                        dVar2 = ug2.d.UNKNOWN;
                                        break;
                                    case 2:
                                        dVar2 = ug2.d.DISTANCE;
                                        break;
                                    case 3:
                                        dVar2 = ug2.d.RUN;
                                        break;
                                    case 4:
                                        dVar2 = ug2.d.WALK;
                                        break;
                                    case 5:
                                        dVar2 = ug2.d.POWER;
                                        break;
                                    case 6:
                                        dVar2 = ug2.d.SPEED;
                                        break;
                                    case 7:
                                        dVar2 = ug2.d.PACE;
                                        break;
                                    case 8:
                                        dVar2 = ug2.d.HEART_RATE;
                                        break;
                                    case 9:
                                        dVar2 = ug2.d.CALORIES;
                                        break;
                                    case 10:
                                        dVar2 = ug2.d.ELEVATION;
                                        break;
                                    case 11:
                                        dVar2 = ug2.d.CADENCE_SPM;
                                        break;
                                    case 12:
                                        dVar2 = ug2.d.CADENCE_RPM;
                                        break;
                                    case 13:
                                        dVar2 = ug2.d.TIME;
                                        break;
                                    case 14:
                                        dVar2 = ug2.d.LAP;
                                        break;
                                    case 15:
                                        dVar2 = ug2.d.CLIMB;
                                        break;
                                    case 16:
                                        dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                        break;
                                    case 17:
                                        dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                        break;
                                    case 18:
                                        dVar2 = ug2.d.NAVIGATION;
                                        break;
                                    case 19:
                                        dVar2 = ug2.d.PHASE;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                List<GDILiveSessionProto.ActivityAlertMessage> messagesList18 = activityAlertRequest.getMessagesList();
                                messagesList18.getClass();
                                arrayList2 = new ArrayList(p13.y.r(messagesList18, 10));
                                while (r1.hasNext()) {
                                    String displayString18 = activityAlertMessage.getDisplayString();
                                    displayString18.getClass();
                                    rf2.b bVarC19 = zg2.e.c(activityAlertMessage.getMetric());
                                    size = activityAlertMessage.getSize();
                                    size.getClass();
                                    switch (ug2.g.f170772a[size.ordinal()]) {
                                        case 1:
                                            bVar2 = ug2.b.TINY;
                                            break;
                                        case 2:
                                            bVar2 = ug2.b.XSMALL;
                                            break;
                                        case 3:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        case 4:
                                            bVar2 = ug2.b.MEDIUM;
                                            break;
                                        case 5:
                                            bVar2 = ug2.b.LARGE;
                                            break;
                                        case 6:
                                            bVar2 = ug2.b.XLARGE;
                                            break;
                                        case 7:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    ug2.b bVar1118 = bVar2;
                                    GDILiveSessionProto.ActivityAlertMessage.Weight weight18 = activityAlertMessage.getWeight();
                                    weight18.getClass();
                                    i14 = ug2.g.f170774c[weight18.ordinal()];
                                    if (i14 != 1) {
                                        cVar2 = ug2.c.REGULAR;
                                    } else if (i14 != 2) {
                                        if (i14 != i17) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        cVar2 = ug2.c.MEDIUM;
                                    } else {
                                        cVar2 = ug2.c.BOLD;
                                    }
                                    sf2.c.a.C3002a c3002a18 = new sf2.c.a.C3002a(displayString18, bVarC19, bVar1118, cVar2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a18);
                                    arrayList2.add(c3002a18);
                                    i17 = 3;
                                }
                                sf2.c.a aVar19 = new sf2.c.a(dVar2, arrayList2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar19);
                                objEmit2 = e2Var11111.emit(aVar19, bVar);
                                if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit2 = Unit.INSTANCE;
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        if (liveSessionEventNotification4.hasActivityStateRequest()) {
                            liveSessionEventNotification7 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification7 = null;
                        }
                        if (liveSessionEventNotification7 != null) {
                            if (liveSessionEventNotification4.hasDataNotification()) {
                                liveSessionEventNotification8 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification8 = null;
                            }
                            if (liveSessionEventNotification8 != null) {
                                l0 l0VarD11112 = iVar.d();
                                e2 e2Var11112 = iVar.f170500a;
                                bVar.f170402a = liveSessionEventNotification4;
                                bVar.f170403b = metricsList;
                                bVar.f170406e = 6;
                                l0VarD11112.getClass();
                                tVar = l0VarD11112.f170427b;
                                arrayList = new ArrayList();
                                it = metricsList.iterator();
                                while (it.hasNext()) {
                                    bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                    if (bVarC != null) {
                                        arrayList.add(bVarC);
                                    }
                                }
                                if (!((y0) tVar.getValue()).f170543d) {
                                    ((y0) tVar.getValue()).f170543d = true;
                                }
                                sf2.c.b bVar1119 = new sf2.c.b(arrayList);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar1119);
                                objEmit = e2Var11112.emit(bVar1119, bVar);
                                if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit = Unit.INSTANCE;
                                }
                                if (objEmit != aVar) {
                                }
                            }
                            if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                liveSessionEventNotification4 = null;
                            }
                            if (liveSessionEventNotification4 != null) {
                                l0 l0VarD11113 = iVar.d();
                                e2 e2Var11113 = iVar.f170500a;
                                bVar.f170402a = null;
                                bVar.f170403b = activityAlertRequest;
                                bVar.f170406e = 7;
                                l0VarD11113.getClass();
                                type = activityAlertRequest.getType();
                                type.getClass();
                                switch (ug2.g.f170775d[type.ordinal()]) {
                                    case 1:
                                        dVar2 = ug2.d.UNKNOWN;
                                        break;
                                    case 2:
                                        dVar2 = ug2.d.DISTANCE;
                                        break;
                                    case 3:
                                        dVar2 = ug2.d.RUN;
                                        break;
                                    case 4:
                                        dVar2 = ug2.d.WALK;
                                        break;
                                    case 5:
                                        dVar2 = ug2.d.POWER;
                                        break;
                                    case 6:
                                        dVar2 = ug2.d.SPEED;
                                        break;
                                    case 7:
                                        dVar2 = ug2.d.PACE;
                                        break;
                                    case 8:
                                        dVar2 = ug2.d.HEART_RATE;
                                        break;
                                    case 9:
                                        dVar2 = ug2.d.CALORIES;
                                        break;
                                    case 10:
                                        dVar2 = ug2.d.ELEVATION;
                                        break;
                                    case 11:
                                        dVar2 = ug2.d.CADENCE_SPM;
                                        break;
                                    case 12:
                                        dVar2 = ug2.d.CADENCE_RPM;
                                        break;
                                    case 13:
                                        dVar2 = ug2.d.TIME;
                                        break;
                                    case 14:
                                        dVar2 = ug2.d.LAP;
                                        break;
                                    case 15:
                                        dVar2 = ug2.d.CLIMB;
                                        break;
                                    case 16:
                                        dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                        break;
                                    case 17:
                                        dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                        break;
                                    case 18:
                                        dVar2 = ug2.d.NAVIGATION;
                                        break;
                                    case 19:
                                        dVar2 = ug2.d.PHASE;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                List<GDILiveSessionProto.ActivityAlertMessage> messagesList19 = activityAlertRequest.getMessagesList();
                                messagesList19.getClass();
                                arrayList2 = new ArrayList(p13.y.r(messagesList19, 10));
                                while (r1.hasNext()) {
                                    String displayString19 = activityAlertMessage.getDisplayString();
                                    displayString19.getClass();
                                    rf2.b bVarC110 = zg2.e.c(activityAlertMessage.getMetric());
                                    size = activityAlertMessage.getSize();
                                    size.getClass();
                                    switch (ug2.g.f170772a[size.ordinal()]) {
                                        case 1:
                                            bVar2 = ug2.b.TINY;
                                            break;
                                        case 2:
                                            bVar2 = ug2.b.XSMALL;
                                            break;
                                        case 3:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        case 4:
                                            bVar2 = ug2.b.MEDIUM;
                                            break;
                                        case 5:
                                            bVar2 = ug2.b.LARGE;
                                            break;
                                        case 6:
                                            bVar2 = ug2.b.XLARGE;
                                            break;
                                        case 7:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    ug2.b bVar11110 = bVar2;
                                    GDILiveSessionProto.ActivityAlertMessage.Weight weight19 = activityAlertMessage.getWeight();
                                    weight19.getClass();
                                    i14 = ug2.g.f170774c[weight19.ordinal()];
                                    if (i14 != 1) {
                                        cVar2 = ug2.c.REGULAR;
                                    } else if (i14 != 2) {
                                        if (i14 != i17) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        cVar2 = ug2.c.MEDIUM;
                                    } else {
                                        cVar2 = ug2.c.BOLD;
                                    }
                                    sf2.c.a.C3002a c3002a19 = new sf2.c.a.C3002a(displayString19, bVarC110, bVar11110, cVar2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a19);
                                    arrayList2.add(c3002a19);
                                    i17 = 3;
                                }
                                sf2.c.a aVar110 = new sf2.c.a(dVar2, arrayList2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar110);
                                objEmit2 = e2Var11113.emit(aVar110, bVar);
                                if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit2 = Unit.INSTANCE;
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        if (liveSessionEventNotification4.hasDataNotification()) {
                            liveSessionEventNotification8 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification8 = null;
                        }
                        if (liveSessionEventNotification8 != null) {
                            l0 l0VarD11114 = iVar.d();
                            e2 e2Var11114 = iVar.f170500a;
                            bVar.f170402a = liveSessionEventNotification4;
                            bVar.f170403b = metricsList;
                            bVar.f170406e = 6;
                            l0VarD11114.getClass();
                            tVar = l0VarD11114.f170427b;
                            arrayList = new ArrayList();
                            it = metricsList.iterator();
                            while (it.hasNext()) {
                                bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                if (bVarC != null) {
                                    arrayList.add(bVarC);
                                }
                            }
                            if (!((y0) tVar.getValue()).f170543d) {
                                ((y0) tVar.getValue()).f170543d = true;
                            }
                            sf2.c.b bVar11111 = new sf2.c.b(arrayList);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar11111);
                            objEmit = e2Var11114.emit(bVar11111, bVar);
                            if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                objEmit = Unit.INSTANCE;
                            }
                            if (objEmit != aVar) {
                            }
                        }
                        if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                            liveSessionEventNotification4 = null;
                        }
                        if (liveSessionEventNotification4 != null) {
                            l0 l0VarD11115 = iVar.d();
                            e2 e2Var11115 = iVar.f170500a;
                            bVar.f170402a = null;
                            bVar.f170403b = activityAlertRequest;
                            bVar.f170406e = 7;
                            l0VarD11115.getClass();
                            type = activityAlertRequest.getType();
                            type.getClass();
                            switch (ug2.g.f170775d[type.ordinal()]) {
                                case 1:
                                    dVar2 = ug2.d.UNKNOWN;
                                    break;
                                case 2:
                                    dVar2 = ug2.d.DISTANCE;
                                    break;
                                case 3:
                                    dVar2 = ug2.d.RUN;
                                    break;
                                case 4:
                                    dVar2 = ug2.d.WALK;
                                    break;
                                case 5:
                                    dVar2 = ug2.d.POWER;
                                    break;
                                case 6:
                                    dVar2 = ug2.d.SPEED;
                                    break;
                                case 7:
                                    dVar2 = ug2.d.PACE;
                                    break;
                                case 8:
                                    dVar2 = ug2.d.HEART_RATE;
                                    break;
                                case 9:
                                    dVar2 = ug2.d.CALORIES;
                                    break;
                                case 10:
                                    dVar2 = ug2.d.ELEVATION;
                                    break;
                                case 11:
                                    dVar2 = ug2.d.CADENCE_SPM;
                                    break;
                                case 12:
                                    dVar2 = ug2.d.CADENCE_RPM;
                                    break;
                                case 13:
                                    dVar2 = ug2.d.TIME;
                                    break;
                                case 14:
                                    dVar2 = ug2.d.LAP;
                                    break;
                                case 15:
                                    dVar2 = ug2.d.CLIMB;
                                    break;
                                case 16:
                                    dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                    break;
                                case 17:
                                    dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                    break;
                                case 18:
                                    dVar2 = ug2.d.NAVIGATION;
                                    break;
                                case 19:
                                    dVar2 = ug2.d.PHASE;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            List<GDILiveSessionProto.ActivityAlertMessage> messagesList110 = activityAlertRequest.getMessagesList();
                            messagesList110.getClass();
                            arrayList2 = new ArrayList(p13.y.r(messagesList110, 10));
                            while (r1.hasNext()) {
                                String displayString110 = activityAlertMessage.getDisplayString();
                                displayString110.getClass();
                                rf2.b bVarC111 = zg2.e.c(activityAlertMessage.getMetric());
                                size = activityAlertMessage.getSize();
                                size.getClass();
                                switch (ug2.g.f170772a[size.ordinal()]) {
                                    case 1:
                                        bVar2 = ug2.b.TINY;
                                        break;
                                    case 2:
                                        bVar2 = ug2.b.XSMALL;
                                        break;
                                    case 3:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    case 4:
                                        bVar2 = ug2.b.MEDIUM;
                                        break;
                                    case 5:
                                        bVar2 = ug2.b.LARGE;
                                        break;
                                    case 6:
                                        bVar2 = ug2.b.XLARGE;
                                        break;
                                    case 7:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                ug2.b bVar11112 = bVar2;
                                GDILiveSessionProto.ActivityAlertMessage.Weight weight110 = activityAlertMessage.getWeight();
                                weight110.getClass();
                                i14 = ug2.g.f170774c[weight110.ordinal()];
                                if (i14 != 1) {
                                    cVar2 = ug2.c.REGULAR;
                                } else if (i14 != 2) {
                                    if (i14 != i17) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    cVar2 = ug2.c.MEDIUM;
                                } else {
                                    cVar2 = ug2.c.BOLD;
                                }
                                sf2.c.a.C3002a c3002a110 = new sf2.c.a.C3002a(displayString110, bVarC111, bVar11112, cVar2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a110);
                                arrayList2.add(c3002a110);
                                i17 = 3;
                            }
                            sf2.c.a aVar111 = new sf2.c.a(dVar2, arrayList2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar111);
                            objEmit2 = e2Var11115.emit(aVar111, bVar);
                            if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                objEmit2 = Unit.INSTANCE;
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (liveSessionEventNotification4.hasCancelFinalizeTimerRequest()) {
                        liveSessionEventNotification6 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification6 = null;
                    }
                    if (liveSessionEventNotification6 != null) {
                        if (liveSessionEventNotification4.hasActivityStateRequest()) {
                            liveSessionEventNotification7 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification7 = null;
                        }
                        if (liveSessionEventNotification7 != null) {
                            if (liveSessionEventNotification4.hasDataNotification()) {
                                liveSessionEventNotification8 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification8 = null;
                            }
                            if (liveSessionEventNotification8 != null) {
                                l0 l0VarD11116 = iVar.d();
                                e2 e2Var11116 = iVar.f170500a;
                                bVar.f170402a = liveSessionEventNotification4;
                                bVar.f170403b = metricsList;
                                bVar.f170406e = 6;
                                l0VarD11116.getClass();
                                tVar = l0VarD11116.f170427b;
                                arrayList = new ArrayList();
                                it = metricsList.iterator();
                                while (it.hasNext()) {
                                    bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                    if (bVarC != null) {
                                        arrayList.add(bVarC);
                                    }
                                }
                                if (!((y0) tVar.getValue()).f170543d) {
                                    ((y0) tVar.getValue()).f170543d = true;
                                }
                                sf2.c.b bVar11113 = new sf2.c.b(arrayList);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar11113);
                                objEmit = e2Var11116.emit(bVar11113, bVar);
                                if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit = Unit.INSTANCE;
                                }
                                if (objEmit != aVar) {
                                }
                            }
                            if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                liveSessionEventNotification4 = null;
                            }
                            if (liveSessionEventNotification4 != null) {
                                l0 l0VarD11117 = iVar.d();
                                e2 e2Var11117 = iVar.f170500a;
                                bVar.f170402a = null;
                                bVar.f170403b = activityAlertRequest;
                                bVar.f170406e = 7;
                                l0VarD11117.getClass();
                                type = activityAlertRequest.getType();
                                type.getClass();
                                switch (ug2.g.f170775d[type.ordinal()]) {
                                    case 1:
                                        dVar2 = ug2.d.UNKNOWN;
                                        break;
                                    case 2:
                                        dVar2 = ug2.d.DISTANCE;
                                        break;
                                    case 3:
                                        dVar2 = ug2.d.RUN;
                                        break;
                                    case 4:
                                        dVar2 = ug2.d.WALK;
                                        break;
                                    case 5:
                                        dVar2 = ug2.d.POWER;
                                        break;
                                    case 6:
                                        dVar2 = ug2.d.SPEED;
                                        break;
                                    case 7:
                                        dVar2 = ug2.d.PACE;
                                        break;
                                    case 8:
                                        dVar2 = ug2.d.HEART_RATE;
                                        break;
                                    case 9:
                                        dVar2 = ug2.d.CALORIES;
                                        break;
                                    case 10:
                                        dVar2 = ug2.d.ELEVATION;
                                        break;
                                    case 11:
                                        dVar2 = ug2.d.CADENCE_SPM;
                                        break;
                                    case 12:
                                        dVar2 = ug2.d.CADENCE_RPM;
                                        break;
                                    case 13:
                                        dVar2 = ug2.d.TIME;
                                        break;
                                    case 14:
                                        dVar2 = ug2.d.LAP;
                                        break;
                                    case 15:
                                        dVar2 = ug2.d.CLIMB;
                                        break;
                                    case 16:
                                        dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                        break;
                                    case 17:
                                        dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                        break;
                                    case 18:
                                        dVar2 = ug2.d.NAVIGATION;
                                        break;
                                    case 19:
                                        dVar2 = ug2.d.PHASE;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                List<GDILiveSessionProto.ActivityAlertMessage> messagesList111 = activityAlertRequest.getMessagesList();
                                messagesList111.getClass();
                                arrayList2 = new ArrayList(p13.y.r(messagesList111, 10));
                                while (r1.hasNext()) {
                                    String displayString111 = activityAlertMessage.getDisplayString();
                                    displayString111.getClass();
                                    rf2.b bVarC112 = zg2.e.c(activityAlertMessage.getMetric());
                                    size = activityAlertMessage.getSize();
                                    size.getClass();
                                    switch (ug2.g.f170772a[size.ordinal()]) {
                                        case 1:
                                            bVar2 = ug2.b.TINY;
                                            break;
                                        case 2:
                                            bVar2 = ug2.b.XSMALL;
                                            break;
                                        case 3:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        case 4:
                                            bVar2 = ug2.b.MEDIUM;
                                            break;
                                        case 5:
                                            bVar2 = ug2.b.LARGE;
                                            break;
                                        case 6:
                                            bVar2 = ug2.b.XLARGE;
                                            break;
                                        case 7:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    ug2.b bVar11114 = bVar2;
                                    GDILiveSessionProto.ActivityAlertMessage.Weight weight111 = activityAlertMessage.getWeight();
                                    weight111.getClass();
                                    i14 = ug2.g.f170774c[weight111.ordinal()];
                                    if (i14 != 1) {
                                        cVar2 = ug2.c.REGULAR;
                                    } else if (i14 != 2) {
                                        if (i14 != i17) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        cVar2 = ug2.c.MEDIUM;
                                    } else {
                                        cVar2 = ug2.c.BOLD;
                                    }
                                    sf2.c.a.C3002a c3002a111 = new sf2.c.a.C3002a(displayString111, bVarC112, bVar11114, cVar2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a111);
                                    arrayList2.add(c3002a111);
                                    i17 = 3;
                                }
                                sf2.c.a aVar112 = new sf2.c.a(dVar2, arrayList2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar112);
                                objEmit2 = e2Var11117.emit(aVar112, bVar);
                                if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit2 = Unit.INSTANCE;
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        if (liveSessionEventNotification4.hasDataNotification()) {
                            liveSessionEventNotification8 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification8 = null;
                        }
                        if (liveSessionEventNotification8 != null) {
                            l0 l0VarD11118 = iVar.d();
                            e2 e2Var11118 = iVar.f170500a;
                            bVar.f170402a = liveSessionEventNotification4;
                            bVar.f170403b = metricsList;
                            bVar.f170406e = 6;
                            l0VarD11118.getClass();
                            tVar = l0VarD11118.f170427b;
                            arrayList = new ArrayList();
                            it = metricsList.iterator();
                            while (it.hasNext()) {
                                bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                if (bVarC != null) {
                                    arrayList.add(bVarC);
                                }
                            }
                            if (!((y0) tVar.getValue()).f170543d) {
                                ((y0) tVar.getValue()).f170543d = true;
                            }
                            sf2.c.b bVar11115 = new sf2.c.b(arrayList);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar11115);
                            objEmit = e2Var11118.emit(bVar11115, bVar);
                            if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                objEmit = Unit.INSTANCE;
                            }
                            if (objEmit != aVar) {
                            }
                        }
                        if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                            liveSessionEventNotification4 = null;
                        }
                        if (liveSessionEventNotification4 != null) {
                            l0 l0VarD11119 = iVar.d();
                            e2 e2Var11119 = iVar.f170500a;
                            bVar.f170402a = null;
                            bVar.f170403b = activityAlertRequest;
                            bVar.f170406e = 7;
                            l0VarD11119.getClass();
                            type = activityAlertRequest.getType();
                            type.getClass();
                            switch (ug2.g.f170775d[type.ordinal()]) {
                                case 1:
                                    dVar2 = ug2.d.UNKNOWN;
                                    break;
                                case 2:
                                    dVar2 = ug2.d.DISTANCE;
                                    break;
                                case 3:
                                    dVar2 = ug2.d.RUN;
                                    break;
                                case 4:
                                    dVar2 = ug2.d.WALK;
                                    break;
                                case 5:
                                    dVar2 = ug2.d.POWER;
                                    break;
                                case 6:
                                    dVar2 = ug2.d.SPEED;
                                    break;
                                case 7:
                                    dVar2 = ug2.d.PACE;
                                    break;
                                case 8:
                                    dVar2 = ug2.d.HEART_RATE;
                                    break;
                                case 9:
                                    dVar2 = ug2.d.CALORIES;
                                    break;
                                case 10:
                                    dVar2 = ug2.d.ELEVATION;
                                    break;
                                case 11:
                                    dVar2 = ug2.d.CADENCE_SPM;
                                    break;
                                case 12:
                                    dVar2 = ug2.d.CADENCE_RPM;
                                    break;
                                case 13:
                                    dVar2 = ug2.d.TIME;
                                    break;
                                case 14:
                                    dVar2 = ug2.d.LAP;
                                    break;
                                case 15:
                                    dVar2 = ug2.d.CLIMB;
                                    break;
                                case 16:
                                    dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                    break;
                                case 17:
                                    dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                    break;
                                case 18:
                                    dVar2 = ug2.d.NAVIGATION;
                                    break;
                                case 19:
                                    dVar2 = ug2.d.PHASE;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            List<GDILiveSessionProto.ActivityAlertMessage> messagesList112 = activityAlertRequest.getMessagesList();
                            messagesList112.getClass();
                            arrayList2 = new ArrayList(p13.y.r(messagesList112, 10));
                            while (r1.hasNext()) {
                                String displayString112 = activityAlertMessage.getDisplayString();
                                displayString112.getClass();
                                rf2.b bVarC113 = zg2.e.c(activityAlertMessage.getMetric());
                                size = activityAlertMessage.getSize();
                                size.getClass();
                                switch (ug2.g.f170772a[size.ordinal()]) {
                                    case 1:
                                        bVar2 = ug2.b.TINY;
                                        break;
                                    case 2:
                                        bVar2 = ug2.b.XSMALL;
                                        break;
                                    case 3:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    case 4:
                                        bVar2 = ug2.b.MEDIUM;
                                        break;
                                    case 5:
                                        bVar2 = ug2.b.LARGE;
                                        break;
                                    case 6:
                                        bVar2 = ug2.b.XLARGE;
                                        break;
                                    case 7:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                ug2.b bVar11116 = bVar2;
                                GDILiveSessionProto.ActivityAlertMessage.Weight weight112 = activityAlertMessage.getWeight();
                                weight112.getClass();
                                i14 = ug2.g.f170774c[weight112.ordinal()];
                                if (i14 != 1) {
                                    cVar2 = ug2.c.REGULAR;
                                } else if (i14 != 2) {
                                    if (i14 != i17) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    cVar2 = ug2.c.MEDIUM;
                                } else {
                                    cVar2 = ug2.c.BOLD;
                                }
                                sf2.c.a.C3002a c3002a112 = new sf2.c.a.C3002a(displayString112, bVarC113, bVar11116, cVar2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a112);
                                arrayList2.add(c3002a112);
                                i17 = 3;
                            }
                            sf2.c.a aVar113 = new sf2.c.a(dVar2, arrayList2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar113);
                            objEmit2 = e2Var11119.emit(aVar113, bVar);
                            if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                objEmit2 = Unit.INSTANCE;
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (liveSessionEventNotification4.hasActivityStateRequest()) {
                        liveSessionEventNotification7 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification7 = null;
                    }
                    if (liveSessionEventNotification7 != null) {
                        if (liveSessionEventNotification4.hasDataNotification()) {
                            liveSessionEventNotification8 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification8 = null;
                        }
                        if (liveSessionEventNotification8 != null) {
                            l0 l0VarD111110 = iVar.d();
                            e2 e2Var111110 = iVar.f170500a;
                            bVar.f170402a = liveSessionEventNotification4;
                            bVar.f170403b = metricsList;
                            bVar.f170406e = 6;
                            l0VarD111110.getClass();
                            tVar = l0VarD111110.f170427b;
                            arrayList = new ArrayList();
                            it = metricsList.iterator();
                            while (it.hasNext()) {
                                bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                if (bVarC != null) {
                                    arrayList.add(bVarC);
                                }
                            }
                            if (!((y0) tVar.getValue()).f170543d) {
                                ((y0) tVar.getValue()).f170543d = true;
                            }
                            sf2.c.b bVar11117 = new sf2.c.b(arrayList);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar11117);
                            objEmit = e2Var111110.emit(bVar11117, bVar);
                            if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                objEmit = Unit.INSTANCE;
                            }
                            if (objEmit != aVar) {
                            }
                        }
                        if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                            liveSessionEventNotification4 = null;
                        }
                        if (liveSessionEventNotification4 != null) {
                            l0 l0VarD111111 = iVar.d();
                            e2 e2Var111111 = iVar.f170500a;
                            bVar.f170402a = null;
                            bVar.f170403b = activityAlertRequest;
                            bVar.f170406e = 7;
                            l0VarD111111.getClass();
                            type = activityAlertRequest.getType();
                            type.getClass();
                            switch (ug2.g.f170775d[type.ordinal()]) {
                                case 1:
                                    dVar2 = ug2.d.UNKNOWN;
                                    break;
                                case 2:
                                    dVar2 = ug2.d.DISTANCE;
                                    break;
                                case 3:
                                    dVar2 = ug2.d.RUN;
                                    break;
                                case 4:
                                    dVar2 = ug2.d.WALK;
                                    break;
                                case 5:
                                    dVar2 = ug2.d.POWER;
                                    break;
                                case 6:
                                    dVar2 = ug2.d.SPEED;
                                    break;
                                case 7:
                                    dVar2 = ug2.d.PACE;
                                    break;
                                case 8:
                                    dVar2 = ug2.d.HEART_RATE;
                                    break;
                                case 9:
                                    dVar2 = ug2.d.CALORIES;
                                    break;
                                case 10:
                                    dVar2 = ug2.d.ELEVATION;
                                    break;
                                case 11:
                                    dVar2 = ug2.d.CADENCE_SPM;
                                    break;
                                case 12:
                                    dVar2 = ug2.d.CADENCE_RPM;
                                    break;
                                case 13:
                                    dVar2 = ug2.d.TIME;
                                    break;
                                case 14:
                                    dVar2 = ug2.d.LAP;
                                    break;
                                case 15:
                                    dVar2 = ug2.d.CLIMB;
                                    break;
                                case 16:
                                    dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                    break;
                                case 17:
                                    dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                    break;
                                case 18:
                                    dVar2 = ug2.d.NAVIGATION;
                                    break;
                                case 19:
                                    dVar2 = ug2.d.PHASE;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            List<GDILiveSessionProto.ActivityAlertMessage> messagesList113 = activityAlertRequest.getMessagesList();
                            messagesList113.getClass();
                            arrayList2 = new ArrayList(p13.y.r(messagesList113, 10));
                            while (r1.hasNext()) {
                                String displayString113 = activityAlertMessage.getDisplayString();
                                displayString113.getClass();
                                rf2.b bVarC114 = zg2.e.c(activityAlertMessage.getMetric());
                                size = activityAlertMessage.getSize();
                                size.getClass();
                                switch (ug2.g.f170772a[size.ordinal()]) {
                                    case 1:
                                        bVar2 = ug2.b.TINY;
                                        break;
                                    case 2:
                                        bVar2 = ug2.b.XSMALL;
                                        break;
                                    case 3:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    case 4:
                                        bVar2 = ug2.b.MEDIUM;
                                        break;
                                    case 5:
                                        bVar2 = ug2.b.LARGE;
                                        break;
                                    case 6:
                                        bVar2 = ug2.b.XLARGE;
                                        break;
                                    case 7:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                ug2.b bVar11118 = bVar2;
                                GDILiveSessionProto.ActivityAlertMessage.Weight weight113 = activityAlertMessage.getWeight();
                                weight113.getClass();
                                i14 = ug2.g.f170774c[weight113.ordinal()];
                                if (i14 != 1) {
                                    cVar2 = ug2.c.REGULAR;
                                } else if (i14 != 2) {
                                    if (i14 != i17) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    cVar2 = ug2.c.MEDIUM;
                                } else {
                                    cVar2 = ug2.c.BOLD;
                                }
                                sf2.c.a.C3002a c3002a113 = new sf2.c.a.C3002a(displayString113, bVarC114, bVar11118, cVar2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a113);
                                arrayList2.add(c3002a113);
                                i17 = 3;
                            }
                            sf2.c.a aVar114 = new sf2.c.a(dVar2, arrayList2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar114);
                            objEmit2 = e2Var111111.emit(aVar114, bVar);
                            if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                objEmit2 = Unit.INSTANCE;
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (liveSessionEventNotification4.hasDataNotification()) {
                        liveSessionEventNotification8 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification8 = null;
                    }
                    if (liveSessionEventNotification8 != null) {
                        l0 l0VarD111112 = iVar.d();
                        e2 e2Var111112 = iVar.f170500a;
                        bVar.f170402a = liveSessionEventNotification4;
                        bVar.f170403b = metricsList;
                        bVar.f170406e = 6;
                        l0VarD111112.getClass();
                        tVar = l0VarD111112.f170427b;
                        arrayList = new ArrayList();
                        it = metricsList.iterator();
                        while (it.hasNext()) {
                            bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                            if (bVarC != null) {
                                arrayList.add(bVarC);
                            }
                        }
                        if (!((y0) tVar.getValue()).f170543d) {
                            ((y0) tVar.getValue()).f170543d = true;
                        }
                        sf2.c.b bVar11119 = new sf2.c.b(arrayList);
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar11119);
                        objEmit = e2Var111112.emit(bVar11119, bVar);
                        if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                            objEmit = Unit.INSTANCE;
                        }
                        if (objEmit != aVar) {
                        }
                    }
                    if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                        liveSessionEventNotification4 = null;
                    }
                    if (liveSessionEventNotification4 != null) {
                        l0 l0VarD111113 = iVar.d();
                        e2 e2Var111113 = iVar.f170500a;
                        bVar.f170402a = null;
                        bVar.f170403b = activityAlertRequest;
                        bVar.f170406e = 7;
                        l0VarD111113.getClass();
                        type = activityAlertRequest.getType();
                        type.getClass();
                        switch (ug2.g.f170775d[type.ordinal()]) {
                            case 1:
                                dVar2 = ug2.d.UNKNOWN;
                                break;
                            case 2:
                                dVar2 = ug2.d.DISTANCE;
                                break;
                            case 3:
                                dVar2 = ug2.d.RUN;
                                break;
                            case 4:
                                dVar2 = ug2.d.WALK;
                                break;
                            case 5:
                                dVar2 = ug2.d.POWER;
                                break;
                            case 6:
                                dVar2 = ug2.d.SPEED;
                                break;
                            case 7:
                                dVar2 = ug2.d.PACE;
                                break;
                            case 8:
                                dVar2 = ug2.d.HEART_RATE;
                                break;
                            case 9:
                                dVar2 = ug2.d.CALORIES;
                                break;
                            case 10:
                                dVar2 = ug2.d.ELEVATION;
                                break;
                            case 11:
                                dVar2 = ug2.d.CADENCE_SPM;
                                break;
                            case 12:
                                dVar2 = ug2.d.CADENCE_RPM;
                                break;
                            case 13:
                                dVar2 = ug2.d.TIME;
                                break;
                            case 14:
                                dVar2 = ug2.d.LAP;
                                break;
                            case 15:
                                dVar2 = ug2.d.CLIMB;
                                break;
                            case 16:
                                dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                break;
                            case 17:
                                dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                break;
                            case 18:
                                dVar2 = ug2.d.NAVIGATION;
                                break;
                            case 19:
                                dVar2 = ug2.d.PHASE;
                                break;
                            default:
                                lc.u0.r();
                                return null;
                        }
                        List<GDILiveSessionProto.ActivityAlertMessage> messagesList114 = activityAlertRequest.getMessagesList();
                        messagesList114.getClass();
                        arrayList2 = new ArrayList(p13.y.r(messagesList114, 10));
                        while (r1.hasNext()) {
                            String displayString114 = activityAlertMessage.getDisplayString();
                            displayString114.getClass();
                            rf2.b bVarC115 = zg2.e.c(activityAlertMessage.getMetric());
                            size = activityAlertMessage.getSize();
                            size.getClass();
                            switch (ug2.g.f170772a[size.ordinal()]) {
                                case 1:
                                    bVar2 = ug2.b.TINY;
                                    break;
                                case 2:
                                    bVar2 = ug2.b.XSMALL;
                                    break;
                                case 3:
                                    bVar2 = ug2.b.SMALL;
                                    break;
                                case 4:
                                    bVar2 = ug2.b.MEDIUM;
                                    break;
                                case 5:
                                    bVar2 = ug2.b.LARGE;
                                    break;
                                case 6:
                                    bVar2 = ug2.b.XLARGE;
                                    break;
                                case 7:
                                    bVar2 = ug2.b.SMALL;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            ug2.b bVar111110 = bVar2;
                            GDILiveSessionProto.ActivityAlertMessage.Weight weight114 = activityAlertMessage.getWeight();
                            weight114.getClass();
                            i14 = ug2.g.f170774c[weight114.ordinal()];
                            if (i14 != 1) {
                                cVar2 = ug2.c.REGULAR;
                            } else if (i14 != 2) {
                                if (i14 != i17) {
                                    lc.u0.r();
                                    return null;
                                }
                                cVar2 = ug2.c.MEDIUM;
                            } else {
                                cVar2 = ug2.c.BOLD;
                            }
                            sf2.c.a.C3002a c3002a114 = new sf2.c.a.C3002a(displayString114, bVarC115, bVar111110, cVar2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a114);
                            arrayList2.add(c3002a114);
                            i17 = 3;
                        }
                        sf2.c.a aVar115 = new sf2.c.a(dVar2, arrayList2);
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar115);
                        objEmit2 = e2Var111113.emit(aVar115, bVar);
                        if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                            objEmit2 = Unit.INSTANCE;
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                    return aVar;
                case 3:
                    liveSessionEventNotification4 = bVar.f170402a;
                    o13.r.b(obj);
                    if (liveSessionEventNotification4.hasCancelFinalizeTimerRequest()) {
                        liveSessionEventNotification6 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification6 = null;
                    }
                    if (liveSessionEventNotification6 != null) {
                        if (liveSessionEventNotification4.hasActivityStateRequest()) {
                            liveSessionEventNotification7 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification7 = null;
                        }
                        if (liveSessionEventNotification7 != null) {
                            if (liveSessionEventNotification4.hasDataNotification()) {
                                liveSessionEventNotification8 = liveSessionEventNotification4;
                            } else {
                                liveSessionEventNotification8 = null;
                            }
                            if (liveSessionEventNotification8 != null) {
                                l0 l0VarD111114 = iVar.d();
                                e2 e2Var111114 = iVar.f170500a;
                                bVar.f170402a = liveSessionEventNotification4;
                                bVar.f170403b = metricsList;
                                bVar.f170406e = 6;
                                l0VarD111114.getClass();
                                tVar = l0VarD111114.f170427b;
                                arrayList = new ArrayList();
                                it = metricsList.iterator();
                                while (it.hasNext()) {
                                    bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                    if (bVarC != null) {
                                        arrayList.add(bVarC);
                                    }
                                }
                                if (!((y0) tVar.getValue()).f170543d) {
                                    ((y0) tVar.getValue()).f170543d = true;
                                }
                                sf2.c.b bVar111111 = new sf2.c.b(arrayList);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar111111);
                                objEmit = e2Var111114.emit(bVar111111, bVar);
                                if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit = Unit.INSTANCE;
                                }
                                if (objEmit != aVar) {
                                }
                            }
                            if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                                liveSessionEventNotification4 = null;
                            }
                            if (liveSessionEventNotification4 != null) {
                                l0 l0VarD111115 = iVar.d();
                                e2 e2Var111115 = iVar.f170500a;
                                bVar.f170402a = null;
                                bVar.f170403b = activityAlertRequest;
                                bVar.f170406e = 7;
                                l0VarD111115.getClass();
                                type = activityAlertRequest.getType();
                                type.getClass();
                                switch (ug2.g.f170775d[type.ordinal()]) {
                                    case 1:
                                        dVar2 = ug2.d.UNKNOWN;
                                        break;
                                    case 2:
                                        dVar2 = ug2.d.DISTANCE;
                                        break;
                                    case 3:
                                        dVar2 = ug2.d.RUN;
                                        break;
                                    case 4:
                                        dVar2 = ug2.d.WALK;
                                        break;
                                    case 5:
                                        dVar2 = ug2.d.POWER;
                                        break;
                                    case 6:
                                        dVar2 = ug2.d.SPEED;
                                        break;
                                    case 7:
                                        dVar2 = ug2.d.PACE;
                                        break;
                                    case 8:
                                        dVar2 = ug2.d.HEART_RATE;
                                        break;
                                    case 9:
                                        dVar2 = ug2.d.CALORIES;
                                        break;
                                    case 10:
                                        dVar2 = ug2.d.ELEVATION;
                                        break;
                                    case 11:
                                        dVar2 = ug2.d.CADENCE_SPM;
                                        break;
                                    case 12:
                                        dVar2 = ug2.d.CADENCE_RPM;
                                        break;
                                    case 13:
                                        dVar2 = ug2.d.TIME;
                                        break;
                                    case 14:
                                        dVar2 = ug2.d.LAP;
                                        break;
                                    case 15:
                                        dVar2 = ug2.d.CLIMB;
                                        break;
                                    case 16:
                                        dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                        break;
                                    case 17:
                                        dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                        break;
                                    case 18:
                                        dVar2 = ug2.d.NAVIGATION;
                                        break;
                                    case 19:
                                        dVar2 = ug2.d.PHASE;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                List<GDILiveSessionProto.ActivityAlertMessage> messagesList115 = activityAlertRequest.getMessagesList();
                                messagesList115.getClass();
                                arrayList2 = new ArrayList(p13.y.r(messagesList115, 10));
                                while (r1.hasNext()) {
                                    String displayString115 = activityAlertMessage.getDisplayString();
                                    displayString115.getClass();
                                    rf2.b bVarC116 = zg2.e.c(activityAlertMessage.getMetric());
                                    size = activityAlertMessage.getSize();
                                    size.getClass();
                                    switch (ug2.g.f170772a[size.ordinal()]) {
                                        case 1:
                                            bVar2 = ug2.b.TINY;
                                            break;
                                        case 2:
                                            bVar2 = ug2.b.XSMALL;
                                            break;
                                        case 3:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        case 4:
                                            bVar2 = ug2.b.MEDIUM;
                                            break;
                                        case 5:
                                            bVar2 = ug2.b.LARGE;
                                            break;
                                        case 6:
                                            bVar2 = ug2.b.XLARGE;
                                            break;
                                        case 7:
                                            bVar2 = ug2.b.SMALL;
                                            break;
                                        default:
                                            lc.u0.r();
                                            return null;
                                    }
                                    ug2.b bVar111112 = bVar2;
                                    GDILiveSessionProto.ActivityAlertMessage.Weight weight115 = activityAlertMessage.getWeight();
                                    weight115.getClass();
                                    i14 = ug2.g.f170774c[weight115.ordinal()];
                                    if (i14 != 1) {
                                        cVar2 = ug2.c.REGULAR;
                                    } else if (i14 != 2) {
                                        if (i14 != i17) {
                                            lc.u0.r();
                                            return null;
                                        }
                                        cVar2 = ug2.c.MEDIUM;
                                    } else {
                                        cVar2 = ug2.c.BOLD;
                                    }
                                    sf2.c.a.C3002a c3002a115 = new sf2.c.a.C3002a(displayString115, bVarC116, bVar111112, cVar2);
                                    zg2.c.f204692a.getClass();
                                    zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a115);
                                    arrayList2.add(c3002a115);
                                    i17 = 3;
                                }
                                sf2.c.a aVar116 = new sf2.c.a(dVar2, arrayList2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar116);
                                objEmit2 = e2Var111115.emit(aVar116, bVar);
                                if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                    objEmit2 = Unit.INSTANCE;
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        if (liveSessionEventNotification4.hasDataNotification()) {
                            liveSessionEventNotification8 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification8 = null;
                        }
                        if (liveSessionEventNotification8 != null) {
                            l0 l0VarD111116 = iVar.d();
                            e2 e2Var111116 = iVar.f170500a;
                            bVar.f170402a = liveSessionEventNotification4;
                            bVar.f170403b = metricsList;
                            bVar.f170406e = 6;
                            l0VarD111116.getClass();
                            tVar = l0VarD111116.f170427b;
                            arrayList = new ArrayList();
                            it = metricsList.iterator();
                            while (it.hasNext()) {
                                bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                if (bVarC != null) {
                                    arrayList.add(bVarC);
                                }
                            }
                            if (!((y0) tVar.getValue()).f170543d) {
                                ((y0) tVar.getValue()).f170543d = true;
                            }
                            sf2.c.b bVar111113 = new sf2.c.b(arrayList);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar111113);
                            objEmit = e2Var111116.emit(bVar111113, bVar);
                            if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                objEmit = Unit.INSTANCE;
                            }
                            if (objEmit != aVar) {
                            }
                        }
                        if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                            liveSessionEventNotification4 = null;
                        }
                        if (liveSessionEventNotification4 != null) {
                            l0 l0VarD111117 = iVar.d();
                            e2 e2Var111117 = iVar.f170500a;
                            bVar.f170402a = null;
                            bVar.f170403b = activityAlertRequest;
                            bVar.f170406e = 7;
                            l0VarD111117.getClass();
                            type = activityAlertRequest.getType();
                            type.getClass();
                            switch (ug2.g.f170775d[type.ordinal()]) {
                                case 1:
                                    dVar2 = ug2.d.UNKNOWN;
                                    break;
                                case 2:
                                    dVar2 = ug2.d.DISTANCE;
                                    break;
                                case 3:
                                    dVar2 = ug2.d.RUN;
                                    break;
                                case 4:
                                    dVar2 = ug2.d.WALK;
                                    break;
                                case 5:
                                    dVar2 = ug2.d.POWER;
                                    break;
                                case 6:
                                    dVar2 = ug2.d.SPEED;
                                    break;
                                case 7:
                                    dVar2 = ug2.d.PACE;
                                    break;
                                case 8:
                                    dVar2 = ug2.d.HEART_RATE;
                                    break;
                                case 9:
                                    dVar2 = ug2.d.CALORIES;
                                    break;
                                case 10:
                                    dVar2 = ug2.d.ELEVATION;
                                    break;
                                case 11:
                                    dVar2 = ug2.d.CADENCE_SPM;
                                    break;
                                case 12:
                                    dVar2 = ug2.d.CADENCE_RPM;
                                    break;
                                case 13:
                                    dVar2 = ug2.d.TIME;
                                    break;
                                case 14:
                                    dVar2 = ug2.d.LAP;
                                    break;
                                case 15:
                                    dVar2 = ug2.d.CLIMB;
                                    break;
                                case 16:
                                    dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                    break;
                                case 17:
                                    dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                    break;
                                case 18:
                                    dVar2 = ug2.d.NAVIGATION;
                                    break;
                                case 19:
                                    dVar2 = ug2.d.PHASE;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            List<GDILiveSessionProto.ActivityAlertMessage> messagesList116 = activityAlertRequest.getMessagesList();
                            messagesList116.getClass();
                            arrayList2 = new ArrayList(p13.y.r(messagesList116, 10));
                            while (r1.hasNext()) {
                                String displayString116 = activityAlertMessage.getDisplayString();
                                displayString116.getClass();
                                rf2.b bVarC117 = zg2.e.c(activityAlertMessage.getMetric());
                                size = activityAlertMessage.getSize();
                                size.getClass();
                                switch (ug2.g.f170772a[size.ordinal()]) {
                                    case 1:
                                        bVar2 = ug2.b.TINY;
                                        break;
                                    case 2:
                                        bVar2 = ug2.b.XSMALL;
                                        break;
                                    case 3:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    case 4:
                                        bVar2 = ug2.b.MEDIUM;
                                        break;
                                    case 5:
                                        bVar2 = ug2.b.LARGE;
                                        break;
                                    case 6:
                                        bVar2 = ug2.b.XLARGE;
                                        break;
                                    case 7:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                ug2.b bVar111114 = bVar2;
                                GDILiveSessionProto.ActivityAlertMessage.Weight weight116 = activityAlertMessage.getWeight();
                                weight116.getClass();
                                i14 = ug2.g.f170774c[weight116.ordinal()];
                                if (i14 != 1) {
                                    cVar2 = ug2.c.REGULAR;
                                } else if (i14 != 2) {
                                    if (i14 != i17) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    cVar2 = ug2.c.MEDIUM;
                                } else {
                                    cVar2 = ug2.c.BOLD;
                                }
                                sf2.c.a.C3002a c3002a116 = new sf2.c.a.C3002a(displayString116, bVarC117, bVar111114, cVar2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a116);
                                arrayList2.add(c3002a116);
                                i17 = 3;
                            }
                            sf2.c.a aVar117 = new sf2.c.a(dVar2, arrayList2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar117);
                            objEmit2 = e2Var111117.emit(aVar117, bVar);
                            if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                objEmit2 = Unit.INSTANCE;
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (liveSessionEventNotification4.hasActivityStateRequest()) {
                        liveSessionEventNotification7 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification7 = null;
                    }
                    if (liveSessionEventNotification7 != null) {
                        if (liveSessionEventNotification4.hasDataNotification()) {
                            liveSessionEventNotification8 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification8 = null;
                        }
                        if (liveSessionEventNotification8 != null) {
                            l0 l0VarD111118 = iVar.d();
                            e2 e2Var111118 = iVar.f170500a;
                            bVar.f170402a = liveSessionEventNotification4;
                            bVar.f170403b = metricsList;
                            bVar.f170406e = 6;
                            l0VarD111118.getClass();
                            tVar = l0VarD111118.f170427b;
                            arrayList = new ArrayList();
                            it = metricsList.iterator();
                            while (it.hasNext()) {
                                bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                if (bVarC != null) {
                                    arrayList.add(bVarC);
                                }
                            }
                            if (!((y0) tVar.getValue()).f170543d) {
                                ((y0) tVar.getValue()).f170543d = true;
                            }
                            sf2.c.b bVar111115 = new sf2.c.b(arrayList);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar111115);
                            objEmit = e2Var111118.emit(bVar111115, bVar);
                            if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                objEmit = Unit.INSTANCE;
                            }
                            if (objEmit != aVar) {
                            }
                        }
                        if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                            liveSessionEventNotification4 = null;
                        }
                        if (liveSessionEventNotification4 != null) {
                            l0 l0VarD111119 = iVar.d();
                            e2 e2Var111119 = iVar.f170500a;
                            bVar.f170402a = null;
                            bVar.f170403b = activityAlertRequest;
                            bVar.f170406e = 7;
                            l0VarD111119.getClass();
                            type = activityAlertRequest.getType();
                            type.getClass();
                            switch (ug2.g.f170775d[type.ordinal()]) {
                                case 1:
                                    dVar2 = ug2.d.UNKNOWN;
                                    break;
                                case 2:
                                    dVar2 = ug2.d.DISTANCE;
                                    break;
                                case 3:
                                    dVar2 = ug2.d.RUN;
                                    break;
                                case 4:
                                    dVar2 = ug2.d.WALK;
                                    break;
                                case 5:
                                    dVar2 = ug2.d.POWER;
                                    break;
                                case 6:
                                    dVar2 = ug2.d.SPEED;
                                    break;
                                case 7:
                                    dVar2 = ug2.d.PACE;
                                    break;
                                case 8:
                                    dVar2 = ug2.d.HEART_RATE;
                                    break;
                                case 9:
                                    dVar2 = ug2.d.CALORIES;
                                    break;
                                case 10:
                                    dVar2 = ug2.d.ELEVATION;
                                    break;
                                case 11:
                                    dVar2 = ug2.d.CADENCE_SPM;
                                    break;
                                case 12:
                                    dVar2 = ug2.d.CADENCE_RPM;
                                    break;
                                case 13:
                                    dVar2 = ug2.d.TIME;
                                    break;
                                case 14:
                                    dVar2 = ug2.d.LAP;
                                    break;
                                case 15:
                                    dVar2 = ug2.d.CLIMB;
                                    break;
                                case 16:
                                    dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                    break;
                                case 17:
                                    dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                    break;
                                case 18:
                                    dVar2 = ug2.d.NAVIGATION;
                                    break;
                                case 19:
                                    dVar2 = ug2.d.PHASE;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            List<GDILiveSessionProto.ActivityAlertMessage> messagesList117 = activityAlertRequest.getMessagesList();
                            messagesList117.getClass();
                            arrayList2 = new ArrayList(p13.y.r(messagesList117, 10));
                            while (r1.hasNext()) {
                                String displayString117 = activityAlertMessage.getDisplayString();
                                displayString117.getClass();
                                rf2.b bVarC118 = zg2.e.c(activityAlertMessage.getMetric());
                                size = activityAlertMessage.getSize();
                                size.getClass();
                                switch (ug2.g.f170772a[size.ordinal()]) {
                                    case 1:
                                        bVar2 = ug2.b.TINY;
                                        break;
                                    case 2:
                                        bVar2 = ug2.b.XSMALL;
                                        break;
                                    case 3:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    case 4:
                                        bVar2 = ug2.b.MEDIUM;
                                        break;
                                    case 5:
                                        bVar2 = ug2.b.LARGE;
                                        break;
                                    case 6:
                                        bVar2 = ug2.b.XLARGE;
                                        break;
                                    case 7:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                ug2.b bVar111116 = bVar2;
                                GDILiveSessionProto.ActivityAlertMessage.Weight weight117 = activityAlertMessage.getWeight();
                                weight117.getClass();
                                i14 = ug2.g.f170774c[weight117.ordinal()];
                                if (i14 != 1) {
                                    cVar2 = ug2.c.REGULAR;
                                } else if (i14 != 2) {
                                    if (i14 != i17) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    cVar2 = ug2.c.MEDIUM;
                                } else {
                                    cVar2 = ug2.c.BOLD;
                                }
                                sf2.c.a.C3002a c3002a117 = new sf2.c.a.C3002a(displayString117, bVarC118, bVar111116, cVar2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a117);
                                arrayList2.add(c3002a117);
                                i17 = 3;
                            }
                            sf2.c.a aVar118 = new sf2.c.a(dVar2, arrayList2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar118);
                            objEmit2 = e2Var111119.emit(aVar118, bVar);
                            if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                objEmit2 = Unit.INSTANCE;
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (liveSessionEventNotification4.hasDataNotification()) {
                        liveSessionEventNotification8 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification8 = null;
                    }
                    if (liveSessionEventNotification8 != null) {
                        l0 l0VarD1111110 = iVar.d();
                        e2 e2Var1111110 = iVar.f170500a;
                        bVar.f170402a = liveSessionEventNotification4;
                        bVar.f170403b = metricsList;
                        bVar.f170406e = 6;
                        l0VarD1111110.getClass();
                        tVar = l0VarD1111110.f170427b;
                        arrayList = new ArrayList();
                        it = metricsList.iterator();
                        while (it.hasNext()) {
                            bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                            if (bVarC != null) {
                                arrayList.add(bVarC);
                            }
                        }
                        if (!((y0) tVar.getValue()).f170543d) {
                            ((y0) tVar.getValue()).f170543d = true;
                        }
                        sf2.c.b bVar111117 = new sf2.c.b(arrayList);
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar111117);
                        objEmit = e2Var1111110.emit(bVar111117, bVar);
                        if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                            objEmit = Unit.INSTANCE;
                        }
                        if (objEmit != aVar) {
                        }
                    }
                    if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                        liveSessionEventNotification4 = null;
                    }
                    if (liveSessionEventNotification4 != null) {
                        l0 l0VarD1111111 = iVar.d();
                        e2 e2Var1111111 = iVar.f170500a;
                        bVar.f170402a = null;
                        bVar.f170403b = activityAlertRequest;
                        bVar.f170406e = 7;
                        l0VarD1111111.getClass();
                        type = activityAlertRequest.getType();
                        type.getClass();
                        switch (ug2.g.f170775d[type.ordinal()]) {
                            case 1:
                                dVar2 = ug2.d.UNKNOWN;
                                break;
                            case 2:
                                dVar2 = ug2.d.DISTANCE;
                                break;
                            case 3:
                                dVar2 = ug2.d.RUN;
                                break;
                            case 4:
                                dVar2 = ug2.d.WALK;
                                break;
                            case 5:
                                dVar2 = ug2.d.POWER;
                                break;
                            case 6:
                                dVar2 = ug2.d.SPEED;
                                break;
                            case 7:
                                dVar2 = ug2.d.PACE;
                                break;
                            case 8:
                                dVar2 = ug2.d.HEART_RATE;
                                break;
                            case 9:
                                dVar2 = ug2.d.CALORIES;
                                break;
                            case 10:
                                dVar2 = ug2.d.ELEVATION;
                                break;
                            case 11:
                                dVar2 = ug2.d.CADENCE_SPM;
                                break;
                            case 12:
                                dVar2 = ug2.d.CADENCE_RPM;
                                break;
                            case 13:
                                dVar2 = ug2.d.TIME;
                                break;
                            case 14:
                                dVar2 = ug2.d.LAP;
                                break;
                            case 15:
                                dVar2 = ug2.d.CLIMB;
                                break;
                            case 16:
                                dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                break;
                            case 17:
                                dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                break;
                            case 18:
                                dVar2 = ug2.d.NAVIGATION;
                                break;
                            case 19:
                                dVar2 = ug2.d.PHASE;
                                break;
                            default:
                                lc.u0.r();
                                return null;
                        }
                        List<GDILiveSessionProto.ActivityAlertMessage> messagesList118 = activityAlertRequest.getMessagesList();
                        messagesList118.getClass();
                        arrayList2 = new ArrayList(p13.y.r(messagesList118, 10));
                        while (r1.hasNext()) {
                            String displayString118 = activityAlertMessage.getDisplayString();
                            displayString118.getClass();
                            rf2.b bVarC119 = zg2.e.c(activityAlertMessage.getMetric());
                            size = activityAlertMessage.getSize();
                            size.getClass();
                            switch (ug2.g.f170772a[size.ordinal()]) {
                                case 1:
                                    bVar2 = ug2.b.TINY;
                                    break;
                                case 2:
                                    bVar2 = ug2.b.XSMALL;
                                    break;
                                case 3:
                                    bVar2 = ug2.b.SMALL;
                                    break;
                                case 4:
                                    bVar2 = ug2.b.MEDIUM;
                                    break;
                                case 5:
                                    bVar2 = ug2.b.LARGE;
                                    break;
                                case 6:
                                    bVar2 = ug2.b.XLARGE;
                                    break;
                                case 7:
                                    bVar2 = ug2.b.SMALL;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            ug2.b bVar111118 = bVar2;
                            GDILiveSessionProto.ActivityAlertMessage.Weight weight118 = activityAlertMessage.getWeight();
                            weight118.getClass();
                            i14 = ug2.g.f170774c[weight118.ordinal()];
                            if (i14 != 1) {
                                cVar2 = ug2.c.REGULAR;
                            } else if (i14 != 2) {
                                if (i14 != i17) {
                                    lc.u0.r();
                                    return null;
                                }
                                cVar2 = ug2.c.MEDIUM;
                            } else {
                                cVar2 = ug2.c.BOLD;
                            }
                            sf2.c.a.C3002a c3002a118 = new sf2.c.a.C3002a(displayString118, bVarC119, bVar111118, cVar2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a118);
                            arrayList2.add(c3002a118);
                            i17 = 3;
                        }
                        sf2.c.a aVar119 = new sf2.c.a(dVar2, arrayList2);
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar119);
                        objEmit2 = e2Var1111111.emit(aVar119, bVar);
                        if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                            objEmit2 = Unit.INSTANCE;
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                    return aVar;
                case 4:
                    liveSessionEventNotification4 = bVar.f170402a;
                    o13.r.b(obj);
                    if (liveSessionEventNotification4.hasActivityStateRequest()) {
                        liveSessionEventNotification7 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification7 = null;
                    }
                    if (liveSessionEventNotification7 != null) {
                        if (liveSessionEventNotification4.hasDataNotification()) {
                            liveSessionEventNotification8 = liveSessionEventNotification4;
                        } else {
                            liveSessionEventNotification8 = null;
                        }
                        if (liveSessionEventNotification8 != null) {
                            l0 l0VarD1111112 = iVar.d();
                            e2 e2Var1111112 = iVar.f170500a;
                            bVar.f170402a = liveSessionEventNotification4;
                            bVar.f170403b = metricsList;
                            bVar.f170406e = 6;
                            l0VarD1111112.getClass();
                            tVar = l0VarD1111112.f170427b;
                            arrayList = new ArrayList();
                            it = metricsList.iterator();
                            while (it.hasNext()) {
                                bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                                if (bVarC != null) {
                                    arrayList.add(bVarC);
                                }
                            }
                            if (!((y0) tVar.getValue()).f170543d) {
                                ((y0) tVar.getValue()).f170543d = true;
                            }
                            sf2.c.b bVar111119 = new sf2.c.b(arrayList);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar111119);
                            objEmit = e2Var1111112.emit(bVar111119, bVar);
                            if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                                objEmit = Unit.INSTANCE;
                            }
                            if (objEmit != aVar) {
                            }
                        }
                        if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                            liveSessionEventNotification4 = null;
                        }
                        if (liveSessionEventNotification4 != null) {
                            l0 l0VarD1111113 = iVar.d();
                            e2 e2Var1111113 = iVar.f170500a;
                            bVar.f170402a = null;
                            bVar.f170403b = activityAlertRequest;
                            bVar.f170406e = 7;
                            l0VarD1111113.getClass();
                            type = activityAlertRequest.getType();
                            type.getClass();
                            switch (ug2.g.f170775d[type.ordinal()]) {
                                case 1:
                                    dVar2 = ug2.d.UNKNOWN;
                                    break;
                                case 2:
                                    dVar2 = ug2.d.DISTANCE;
                                    break;
                                case 3:
                                    dVar2 = ug2.d.RUN;
                                    break;
                                case 4:
                                    dVar2 = ug2.d.WALK;
                                    break;
                                case 5:
                                    dVar2 = ug2.d.POWER;
                                    break;
                                case 6:
                                    dVar2 = ug2.d.SPEED;
                                    break;
                                case 7:
                                    dVar2 = ug2.d.PACE;
                                    break;
                                case 8:
                                    dVar2 = ug2.d.HEART_RATE;
                                    break;
                                case 9:
                                    dVar2 = ug2.d.CALORIES;
                                    break;
                                case 10:
                                    dVar2 = ug2.d.ELEVATION;
                                    break;
                                case 11:
                                    dVar2 = ug2.d.CADENCE_SPM;
                                    break;
                                case 12:
                                    dVar2 = ug2.d.CADENCE_RPM;
                                    break;
                                case 13:
                                    dVar2 = ug2.d.TIME;
                                    break;
                                case 14:
                                    dVar2 = ug2.d.LAP;
                                    break;
                                case 15:
                                    dVar2 = ug2.d.CLIMB;
                                    break;
                                case 16:
                                    dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                    break;
                                case 17:
                                    dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                    break;
                                case 18:
                                    dVar2 = ug2.d.NAVIGATION;
                                    break;
                                case 19:
                                    dVar2 = ug2.d.PHASE;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            List<GDILiveSessionProto.ActivityAlertMessage> messagesList119 = activityAlertRequest.getMessagesList();
                            messagesList119.getClass();
                            arrayList2 = new ArrayList(p13.y.r(messagesList119, 10));
                            while (r1.hasNext()) {
                                String displayString119 = activityAlertMessage.getDisplayString();
                                displayString119.getClass();
                                rf2.b bVarC1110 = zg2.e.c(activityAlertMessage.getMetric());
                                size = activityAlertMessage.getSize();
                                size.getClass();
                                switch (ug2.g.f170772a[size.ordinal()]) {
                                    case 1:
                                        bVar2 = ug2.b.TINY;
                                        break;
                                    case 2:
                                        bVar2 = ug2.b.XSMALL;
                                        break;
                                    case 3:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    case 4:
                                        bVar2 = ug2.b.MEDIUM;
                                        break;
                                    case 5:
                                        bVar2 = ug2.b.LARGE;
                                        break;
                                    case 6:
                                        bVar2 = ug2.b.XLARGE;
                                        break;
                                    case 7:
                                        bVar2 = ug2.b.SMALL;
                                        break;
                                    default:
                                        lc.u0.r();
                                        return null;
                                }
                                ug2.b bVar1111110 = bVar2;
                                GDILiveSessionProto.ActivityAlertMessage.Weight weight119 = activityAlertMessage.getWeight();
                                weight119.getClass();
                                i14 = ug2.g.f170774c[weight119.ordinal()];
                                if (i14 != 1) {
                                    cVar2 = ug2.c.REGULAR;
                                } else if (i14 != 2) {
                                    if (i14 != i17) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    cVar2 = ug2.c.MEDIUM;
                                } else {
                                    cVar2 = ug2.c.BOLD;
                                }
                                sf2.c.a.C3002a c3002a119 = new sf2.c.a.C3002a(displayString119, bVarC1110, bVar1111110, cVar2);
                                zg2.c.f204692a.getClass();
                                zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a119);
                                arrayList2.add(c3002a119);
                                i17 = 3;
                            }
                            sf2.c.a aVar1110 = new sf2.c.a(dVar2, arrayList2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar1110);
                            objEmit2 = e2Var1111113.emit(aVar1110, bVar);
                            if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                                objEmit2 = Unit.INSTANCE;
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (liveSessionEventNotification4.hasDataNotification()) {
                        liveSessionEventNotification8 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification8 = null;
                    }
                    if (liveSessionEventNotification8 != null) {
                        l0 l0VarD1111114 = iVar.d();
                        e2 e2Var1111114 = iVar.f170500a;
                        bVar.f170402a = liveSessionEventNotification4;
                        bVar.f170403b = metricsList;
                        bVar.f170406e = 6;
                        l0VarD1111114.getClass();
                        tVar = l0VarD1111114.f170427b;
                        arrayList = new ArrayList();
                        it = metricsList.iterator();
                        while (it.hasNext()) {
                            bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                            if (bVarC != null) {
                                arrayList.add(bVarC);
                            }
                        }
                        if (!((y0) tVar.getValue()).f170543d) {
                            ((y0) tVar.getValue()).f170543d = true;
                        }
                        sf2.c.b bVar1111111 = new sf2.c.b(arrayList);
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar1111111);
                        objEmit = e2Var1111114.emit(bVar1111111, bVar);
                        if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                            objEmit = Unit.INSTANCE;
                        }
                        if (objEmit != aVar) {
                        }
                    }
                    if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                        liveSessionEventNotification4 = null;
                    }
                    if (liveSessionEventNotification4 != null) {
                        l0 l0VarD1111115 = iVar.d();
                        e2 e2Var1111115 = iVar.f170500a;
                        bVar.f170402a = null;
                        bVar.f170403b = activityAlertRequest;
                        bVar.f170406e = 7;
                        l0VarD1111115.getClass();
                        type = activityAlertRequest.getType();
                        type.getClass();
                        switch (ug2.g.f170775d[type.ordinal()]) {
                            case 1:
                                dVar2 = ug2.d.UNKNOWN;
                                break;
                            case 2:
                                dVar2 = ug2.d.DISTANCE;
                                break;
                            case 3:
                                dVar2 = ug2.d.RUN;
                                break;
                            case 4:
                                dVar2 = ug2.d.WALK;
                                break;
                            case 5:
                                dVar2 = ug2.d.POWER;
                                break;
                            case 6:
                                dVar2 = ug2.d.SPEED;
                                break;
                            case 7:
                                dVar2 = ug2.d.PACE;
                                break;
                            case 8:
                                dVar2 = ug2.d.HEART_RATE;
                                break;
                            case 9:
                                dVar2 = ug2.d.CALORIES;
                                break;
                            case 10:
                                dVar2 = ug2.d.ELEVATION;
                                break;
                            case 11:
                                dVar2 = ug2.d.CADENCE_SPM;
                                break;
                            case 12:
                                dVar2 = ug2.d.CADENCE_RPM;
                                break;
                            case 13:
                                dVar2 = ug2.d.TIME;
                                break;
                            case 14:
                                dVar2 = ug2.d.LAP;
                                break;
                            case 15:
                                dVar2 = ug2.d.CLIMB;
                                break;
                            case 16:
                                dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                break;
                            case 17:
                                dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                break;
                            case 18:
                                dVar2 = ug2.d.NAVIGATION;
                                break;
                            case 19:
                                dVar2 = ug2.d.PHASE;
                                break;
                            default:
                                lc.u0.r();
                                return null;
                        }
                        List<GDILiveSessionProto.ActivityAlertMessage> messagesList1110 = activityAlertRequest.getMessagesList();
                        messagesList1110.getClass();
                        arrayList2 = new ArrayList(p13.y.r(messagesList1110, 10));
                        while (r1.hasNext()) {
                            String displayString1110 = activityAlertMessage.getDisplayString();
                            displayString1110.getClass();
                            rf2.b bVarC1111 = zg2.e.c(activityAlertMessage.getMetric());
                            size = activityAlertMessage.getSize();
                            size.getClass();
                            switch (ug2.g.f170772a[size.ordinal()]) {
                                case 1:
                                    bVar2 = ug2.b.TINY;
                                    break;
                                case 2:
                                    bVar2 = ug2.b.XSMALL;
                                    break;
                                case 3:
                                    bVar2 = ug2.b.SMALL;
                                    break;
                                case 4:
                                    bVar2 = ug2.b.MEDIUM;
                                    break;
                                case 5:
                                    bVar2 = ug2.b.LARGE;
                                    break;
                                case 6:
                                    bVar2 = ug2.b.XLARGE;
                                    break;
                                case 7:
                                    bVar2 = ug2.b.SMALL;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            ug2.b bVar1111112 = bVar2;
                            GDILiveSessionProto.ActivityAlertMessage.Weight weight1110 = activityAlertMessage.getWeight();
                            weight1110.getClass();
                            i14 = ug2.g.f170774c[weight1110.ordinal()];
                            if (i14 != 1) {
                                cVar2 = ug2.c.REGULAR;
                            } else if (i14 != 2) {
                                if (i14 != i17) {
                                    lc.u0.r();
                                    return null;
                                }
                                cVar2 = ug2.c.MEDIUM;
                            } else {
                                cVar2 = ug2.c.BOLD;
                            }
                            sf2.c.a.C3002a c3002a1110 = new sf2.c.a.C3002a(displayString1110, bVarC1111, bVar1111112, cVar2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a1110);
                            arrayList2.add(c3002a1110);
                            i17 = 3;
                        }
                        sf2.c.a aVar1111 = new sf2.c.a(dVar2, arrayList2);
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar1111);
                        objEmit2 = e2Var1111115.emit(aVar1111, bVar);
                        if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                            objEmit2 = Unit.INSTANCE;
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                    return aVar;
                case 5:
                    liveSessionEventNotification4 = bVar.f170402a;
                    o13.r.b(obj);
                    if (liveSessionEventNotification4.hasDataNotification()) {
                        liveSessionEventNotification8 = liveSessionEventNotification4;
                    } else {
                        liveSessionEventNotification8 = null;
                    }
                    if (liveSessionEventNotification8 != null) {
                        l0 l0VarD1111116 = iVar.d();
                        e2 e2Var1111116 = iVar.f170500a;
                        bVar.f170402a = liveSessionEventNotification4;
                        bVar.f170403b = metricsList;
                        bVar.f170406e = 6;
                        l0VarD1111116.getClass();
                        tVar = l0VarD1111116.f170427b;
                        arrayList = new ArrayList();
                        it = metricsList.iterator();
                        while (it.hasNext()) {
                            bVarC = zg2.e.c((GDILiveSessionProto.Metric) it.next());
                            if (bVarC != null) {
                                arrayList.add(bVarC);
                            }
                        }
                        if (!((y0) tVar.getValue()).f170543d) {
                            ((y0) tVar.getValue()).f170543d = true;
                        }
                        sf2.c.b bVar1111113 = new sf2.c.b(arrayList);
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + bVar1111113);
                        objEmit = e2Var1111116.emit(bVar1111113, bVar);
                        if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                            objEmit = Unit.INSTANCE;
                        }
                        if (objEmit != aVar) {
                        }
                        return aVar;
                    }
                    if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                        liveSessionEventNotification4 = null;
                    }
                    if (liveSessionEventNotification4 != null) {
                        l0 l0VarD1111117 = iVar.d();
                        e2 e2Var1111117 = iVar.f170500a;
                        bVar.f170402a = null;
                        bVar.f170403b = activityAlertRequest;
                        bVar.f170406e = 7;
                        l0VarD1111117.getClass();
                        type = activityAlertRequest.getType();
                        type.getClass();
                        switch (ug2.g.f170775d[type.ordinal()]) {
                            case 1:
                                dVar2 = ug2.d.UNKNOWN;
                                break;
                            case 2:
                                dVar2 = ug2.d.DISTANCE;
                                break;
                            case 3:
                                dVar2 = ug2.d.RUN;
                                break;
                            case 4:
                                dVar2 = ug2.d.WALK;
                                break;
                            case 5:
                                dVar2 = ug2.d.POWER;
                                break;
                            case 6:
                                dVar2 = ug2.d.SPEED;
                                break;
                            case 7:
                                dVar2 = ug2.d.PACE;
                                break;
                            case 8:
                                dVar2 = ug2.d.HEART_RATE;
                                break;
                            case 9:
                                dVar2 = ug2.d.CALORIES;
                                break;
                            case 10:
                                dVar2 = ug2.d.ELEVATION;
                                break;
                            case 11:
                                dVar2 = ug2.d.CADENCE_SPM;
                                break;
                            case 12:
                                dVar2 = ug2.d.CADENCE_RPM;
                                break;
                            case 13:
                                dVar2 = ug2.d.TIME;
                                break;
                            case 14:
                                dVar2 = ug2.d.LAP;
                                break;
                            case 15:
                                dVar2 = ug2.d.CLIMB;
                                break;
                            case 16:
                                dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                break;
                            case 17:
                                dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                break;
                            case 18:
                                dVar2 = ug2.d.NAVIGATION;
                                break;
                            case 19:
                                dVar2 = ug2.d.PHASE;
                                break;
                            default:
                                lc.u0.r();
                                return null;
                        }
                        List<GDILiveSessionProto.ActivityAlertMessage> messagesList1111 = activityAlertRequest.getMessagesList();
                        messagesList1111.getClass();
                        arrayList2 = new ArrayList(p13.y.r(messagesList1111, 10));
                        while (r1.hasNext()) {
                            String displayString1111 = activityAlertMessage.getDisplayString();
                            displayString1111.getClass();
                            rf2.b bVarC1112 = zg2.e.c(activityAlertMessage.getMetric());
                            size = activityAlertMessage.getSize();
                            size.getClass();
                            switch (ug2.g.f170772a[size.ordinal()]) {
                                case 1:
                                    bVar2 = ug2.b.TINY;
                                    break;
                                case 2:
                                    bVar2 = ug2.b.XSMALL;
                                    break;
                                case 3:
                                    bVar2 = ug2.b.SMALL;
                                    break;
                                case 4:
                                    bVar2 = ug2.b.MEDIUM;
                                    break;
                                case 5:
                                    bVar2 = ug2.b.LARGE;
                                    break;
                                case 6:
                                    bVar2 = ug2.b.XLARGE;
                                    break;
                                case 7:
                                    bVar2 = ug2.b.SMALL;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            ug2.b bVar1111114 = bVar2;
                            GDILiveSessionProto.ActivityAlertMessage.Weight weight1111 = activityAlertMessage.getWeight();
                            weight1111.getClass();
                            i14 = ug2.g.f170774c[weight1111.ordinal()];
                            if (i14 != 1) {
                                cVar2 = ug2.c.REGULAR;
                            } else if (i14 != 2) {
                                if (i14 != i17) {
                                    lc.u0.r();
                                    return null;
                                }
                                cVar2 = ug2.c.MEDIUM;
                            } else {
                                cVar2 = ug2.c.BOLD;
                            }
                            sf2.c.a.C3002a c3002a1111 = new sf2.c.a.C3002a(displayString1111, bVarC1112, bVar1111114, cVar2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a1111);
                            arrayList2.add(c3002a1111);
                            i17 = 3;
                        }
                        sf2.c.a aVar1112 = new sf2.c.a(dVar2, arrayList2);
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar1112);
                        objEmit2 = e2Var1111117.emit(aVar1112, bVar);
                        if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                            objEmit2 = Unit.INSTANCE;
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                case 6:
                    liveSessionEventNotification4 = bVar.f170402a;
                    o13.r.b(obj);
                    if (!liveSessionEventNotification4.hasActivityAlertRequest()) {
                        liveSessionEventNotification4 = null;
                    }
                    if (liveSessionEventNotification4 != null) {
                        l0 l0VarD1111118 = iVar.d();
                        e2 e2Var1111118 = iVar.f170500a;
                        bVar.f170402a = null;
                        bVar.f170403b = activityAlertRequest;
                        bVar.f170406e = 7;
                        l0VarD1111118.getClass();
                        type = activityAlertRequest.getType();
                        type.getClass();
                        switch (ug2.g.f170775d[type.ordinal()]) {
                            case 1:
                                dVar2 = ug2.d.UNKNOWN;
                                break;
                            case 2:
                                dVar2 = ug2.d.DISTANCE;
                                break;
                            case 3:
                                dVar2 = ug2.d.RUN;
                                break;
                            case 4:
                                dVar2 = ug2.d.WALK;
                                break;
                            case 5:
                                dVar2 = ug2.d.POWER;
                                break;
                            case 6:
                                dVar2 = ug2.d.SPEED;
                                break;
                            case 7:
                                dVar2 = ug2.d.PACE;
                                break;
                            case 8:
                                dVar2 = ug2.d.HEART_RATE;
                                break;
                            case 9:
                                dVar2 = ug2.d.CALORIES;
                                break;
                            case 10:
                                dVar2 = ug2.d.ELEVATION;
                                break;
                            case 11:
                                dVar2 = ug2.d.CADENCE_SPM;
                                break;
                            case 12:
                                dVar2 = ug2.d.CADENCE_RPM;
                                break;
                            case 13:
                                dVar2 = ug2.d.TIME;
                                break;
                            case 14:
                                dVar2 = ug2.d.LAP;
                                break;
                            case 15:
                                dVar2 = ug2.d.CLIMB;
                                break;
                            case 16:
                                dVar2 = ug2.d.STROKE_RATE_INDOOR;
                                break;
                            case 17:
                                dVar2 = ug2.d.STROKE_RATE_OUTDOOR;
                                break;
                            case 18:
                                dVar2 = ug2.d.NAVIGATION;
                                break;
                            case 19:
                                dVar2 = ug2.d.PHASE;
                                break;
                            default:
                                lc.u0.r();
                                return null;
                        }
                        List<GDILiveSessionProto.ActivityAlertMessage> messagesList1112 = activityAlertRequest.getMessagesList();
                        messagesList1112.getClass();
                        arrayList2 = new ArrayList(p13.y.r(messagesList1112, 10));
                        while (r1.hasNext()) {
                            String displayString1112 = activityAlertMessage.getDisplayString();
                            displayString1112.getClass();
                            rf2.b bVarC1113 = zg2.e.c(activityAlertMessage.getMetric());
                            size = activityAlertMessage.getSize();
                            size.getClass();
                            switch (ug2.g.f170772a[size.ordinal()]) {
                                case 1:
                                    bVar2 = ug2.b.TINY;
                                    break;
                                case 2:
                                    bVar2 = ug2.b.XSMALL;
                                    break;
                                case 3:
                                    bVar2 = ug2.b.SMALL;
                                    break;
                                case 4:
                                    bVar2 = ug2.b.MEDIUM;
                                    break;
                                case 5:
                                    bVar2 = ug2.b.LARGE;
                                    break;
                                case 6:
                                    bVar2 = ug2.b.XLARGE;
                                    break;
                                case 7:
                                    bVar2 = ug2.b.SMALL;
                                    break;
                                default:
                                    lc.u0.r();
                                    return null;
                            }
                            ug2.b bVar1111115 = bVar2;
                            GDILiveSessionProto.ActivityAlertMessage.Weight weight1112 = activityAlertMessage.getWeight();
                            weight1112.getClass();
                            i14 = ug2.g.f170774c[weight1112.ordinal()];
                            if (i14 != 1) {
                                cVar2 = ug2.c.REGULAR;
                            } else if (i14 != 2) {
                                if (i14 != i17) {
                                    lc.u0.r();
                                    return null;
                                }
                                cVar2 = ug2.c.MEDIUM;
                            } else {
                                cVar2 = ug2.c.BOLD;
                            }
                            sf2.c.a.C3002a c3002a1112 = new sf2.c.a.C3002a(displayString1112, bVarC1113, bVar1111115, cVar2);
                            zg2.c.f204692a.getClass();
                            zg2.c.a("LiveActivityInteractorDeviceToApp", "Parsed alert message: " + c3002a1112);
                            arrayList2.add(c3002a1112);
                            i17 = 3;
                        }
                        sf2.c.a aVar1113 = new sf2.c.a(dVar2, arrayList2);
                        zg2.c.f204692a.getClass();
                        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + aVar1113);
                        objEmit2 = e2Var1111118.emit(aVar1113, bVar);
                        if (objEmit2 != u13.a.COROUTINE_SUSPENDED) {
                            objEmit2 = Unit.INSTANCE;
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                case 7:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }

        @Override // uf2.r0.b
        public final Object c(rs2.c cVar, dt2.g gVar, r0.e eVar) throws Throwable {
            zg2.c cVar2 = zg2.c.f204692a;
            String str = "Connection " + cVar.getF92741e() + " started.";
            cVar2.getClass();
            zg2.c.a("LSVSessionUpdateInteractor", str);
            i iVar = i.this;
            i.v(iVar, gVar);
            Object objEmit = iVar.f170500a.emit(sf2.c.C3003c.f158899a, eVar);
            return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
        
            if (r9 == r12) goto L41;
         */
        @Override // uf2.r0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object d(rs2.c cVar, dt2.g gVar, GDILiveSessionProto.LiveSessionService liveSessionService, t13.d<? super Unit> dVar) throws Throwable {
            a aVar;
            GDILiveSessionProto.WorkoutModifiedRequest workoutModifiedRequest;
            GDILiveSessionProto.PromptSkippedClustersRequest promptSkippedClustersRequest;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i14 = aVar.f170401e;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    aVar.f170401e = i14 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f170399c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = aVar.f170401e;
            i iVar = i.this;
            if (i15 != 0) {
                if (i15 == 1) {
                    liveSessionService = aVar.f170397a;
                    o13.r.b(obj);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            GDILiveSessionProto.LiveSessionService liveSessionService2 = liveSessionService.hasWorkoutModifiedRequest() ? liveSessionService : null;
            if (liveSessionService2 != null && (workoutModifiedRequest = liveSessionService2.getWorkoutModifiedRequest()) != null) {
                l0 l0VarD = iVar.d();
                e2 e2Var = iVar.f170500a;
                aVar.f170397a = liveSessionService;
                aVar.f170398b = workoutModifiedRequest;
                aVar.f170401e = 1;
                l0VarD.getClass();
                List<Integer> activeClustersList = workoutModifiedRequest.getActiveClustersList();
                activeClustersList.getClass();
                i53.c cVarE = i53.a.e(activeClustersList);
                List<Integer> skippedClustersList = workoutModifiedRequest.getSkippedClustersList();
                skippedClustersList.getClass();
                sf2.c.f fVar = new sf2.c.f(cVarE, i53.a.e(skippedClustersList));
                zg2.c.f204692a.getClass();
                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + fVar);
                Object objEmit = e2Var.emit(fVar, aVar);
                if (objEmit != aVar2) {
                    objEmit = Unit.INSTANCE;
                }
                if (objEmit != aVar2) {
                }
                return aVar2;
            }
            if (!liveSessionService.hasPromptSkippedClustersRequest()) {
                liveSessionService = null;
            }
            if (liveSessionService != null && (promptSkippedClustersRequest = liveSessionService.getPromptSkippedClustersRequest()) != null) {
                l0 l0VarD2 = iVar.d();
                e2 e2Var2 = iVar.f170500a;
                aVar.f170397a = null;
                aVar.f170398b = promptSkippedClustersRequest;
                aVar.f170401e = 2;
                l0VarD2.getClass();
                sf2.c.j jVar = sf2.c.j.f158918a;
                zg2.c.f204692a.getClass();
                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + jVar);
                Object objEmit2 = e2Var2.emit(jVar, aVar);
                if (objEmit2 != aVar2) {
                    objEmit2 = Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public static final void v(i iVar, dt2.g gVar) {
        dt2.g gVar2 = iVar.f170501b;
        if (gVar2 == null || !gVar2.equals(gVar)) {
            zg2.c.f204692a.getClass();
            zg2.c.a("LSVSessionUpdateInteractor", "New messenger " + gVar);
            iVar.f170501b = gVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // uf2.s
    public final Object b(t13.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f170395c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f170395c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f170393a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f170395c;
        if (i15 == 0) {
            o13.r.b(obj);
            bVar.f170395c = 1;
            if (this.f170500a.emit(null, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f170501b = null;
        return Unit.INSTANCE;
    }

    @Override // uf2.s
    public final r0.b e() {
        return this.f170392f;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luf2/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
