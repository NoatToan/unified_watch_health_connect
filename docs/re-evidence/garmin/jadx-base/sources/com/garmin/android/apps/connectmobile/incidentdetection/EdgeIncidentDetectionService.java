package com.garmin.android.apps.connectmobile.incidentdetection;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import c22.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.proto.generated.GDIIncidentDetectionExtension;
import com.garmin.proto.generated.GDIIncidentDetectionProto;
import com.garmin.proto.generated.GDISmartProto;
import cq0.j;
import cq0.l;
import e23.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p13.j0;
import tj1.t;
import tj1.u;
import v.e0;
import v13.i;
import z6.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/EdgeIncidentDetectionService;", "Landroid/app/Service;", "<init>", "()V", "a", "c", "b", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EdgeIncidentDetectionService extends Service {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f36785w = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GDIIncidentDetectionProto.IncidentDetectedRequest f36787b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownTimer f36790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36792g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f36795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f36796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Looper f36797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f36798m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f36799n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Messenger f36800o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<l20.a> f36801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Intent f36802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f36803r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f36804t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f36805v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36786a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicInteger f36788c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AtomicInteger f36789d = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f36793h = l.NONE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public cq0.f f36794i = cq0.f.NONE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/EdgeIncidentDetectionService$b;", "Landroid/os/Handler;", "<init>", "(Lcom/garmin/android/apps/connectmobile/incidentdetection/EdgeIncidentDetectionService;)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends Handler {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f36807a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.TICKING_TIMER_INCIDENT_DETECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.TICKING_TIMER_I_AM_OKAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[l.CANCELLING_TICKING_TIMER_INCIDENT_DETECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[l.NOTIFYING_EMERGENCY_CONTACTS_INCIDENT_DETECTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[l.NOTIFYING_EMERGENCY_CONTACTS_I_AM_OKAY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[l.FINISHED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f36807a = iArr;
            }
        }

        public b() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String strN;
            message.getClass();
            int i14 = message.what;
            EdgeIncidentDetectionService edgeIncidentDetectionService = EdgeIncidentDetectionService.this;
            if (i14 == 1) {
                ArrayList arrayList = edgeIncidentDetectionService.f36799n;
                Messenger messenger = message.replyTo;
                messenger.getClass();
                arrayList.add(messenger);
                sendEmptyMessage(3);
                return;
            }
            if (i14 == 2) {
                edgeIncidentDetectionService.f36799n.remove(message.replyTo);
                return;
            }
            if (i14 != 3) {
                super.handleMessage(message);
                return;
            }
            l lVar = edgeIncidentDetectionService.f36793h;
            ArrayList arrayList2 = edgeIncidentDetectionService.f36799n;
            Message messageObtain = Message.obtain(null, 3, lVar.ordinal(), 0);
            String strName = l.values()[messageObtain.arg1].name();
            switch (a.f36807a[edgeIncidentDetectionService.f36793h.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    messageObtain.arg2 = edgeIncidentDetectionService.f36788c.intValue();
                    strN = "seconds remaining";
                    break;
                case 4:
                case 5:
                    messageObtain.arg2 = edgeIncidentDetectionService.f36789d.intValue();
                    strN = "GCS retry attempt nbr";
                    break;
                case 6:
                    messageObtain.arg2 = edgeIncidentDetectionService.f36794i.ordinal();
                    strN = fb1.c.n("finished how ", cq0.f.values()[messageObtain.arg2].name());
                    break;
                default:
                    strN = "";
                    break;
            }
            int size = arrayList2.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i15 = size - 1;
                try {
                    ((Messenger) arrayList2.get(size)).send(Message.obtain(messageObtain));
                    kq0.a.a("EdgeIncidentDetectionService", "Client [" + size + "] updated. State [" + strName + "], arg2 val [" + messageObtain.arg2 + "], arg2 concept [" + strN + "]");
                } catch (RemoteException unused) {
                    arrayList2.remove(size);
                }
                if (i15 < 0) {
                    return;
                } else {
                    size = i15;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/EdgeIncidentDetectionService$c;", "Landroid/os/Handler;", "Landroid/os/Looper;", "looper", "<init>", "(Lcom/garmin/android/apps/connectmobile/incidentdetection/EdgeIncidentDetectionService;Landroid/os/Looper;)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EdgeIncidentDetectionService f36808a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EdgeIncidentDetectionService edgeIncidentDetectionService, Looper looper) {
            super(looper);
            looper.getClass();
            this.f36808a = edgeIncidentDetectionService;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            message.getClass();
            int i14 = message.what;
            EdgeIncidentDetectionService edgeIncidentDetectionService = this.f36808a;
            switch (i14) {
                case 1:
                    int i15 = message.arg1;
                    GDIIncidentDetectionProto.IncidentDetectedRequest incidentDetectedRequest = edgeIncidentDetectionService.f36787b;
                    if (incidentDetectedRequest == null) {
                        s.m("mIncidentDetectedProto");
                        throw null;
                    }
                    edgeIncidentDetectionService.f36790e = new com.garmin.android.apps.connectmobile.incidentdetection.b(edgeIncidentDetectionService, ((long) incidentDetectedRequest.getSecondsToDelayBeforeNotifyingContactPersons()) * 1000);
                    EdgeIncidentDetectionService.j(i15, edgeIncidentDetectionService.f36786a, GDIIncidentDetectionProto.IncidentDetectedResponse.ResponseStatus.TIMER_STARTED);
                    kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskStartIncidentDetectedCountdownTimer: IncidentDetectedResponse with [TIMER_STARTED] sent to device");
                    CountDownTimer countDownTimer = edgeIncidentDetectionService.f36790e;
                    if (countDownTimer != null) {
                        countDownTimer.start();
                    }
                    kq0.f.f106156a.getClass();
                    kq0.f.b();
                    return;
                case 2:
                    boolean z14 = message.arg1 == 1;
                    int i16 = message.arg2;
                    if (edgeIncidentDetectionService.f36791f) {
                        edgeIncidentDetectionService.f36789d.set(0);
                        if (z14) {
                            EdgeIncidentDetectionService.i(i16, edgeIncidentDetectionService.f36786a, GDIIncidentDetectionProto.CancelIncidentResponse.ResponseStatus.SUCCESS);
                            edgeIncidentDetectionService.d(cq0.f.FROM_DEVICE_I_AM_OKAY, j0.f134944a);
                            return;
                        } else {
                            kq0.a.a("EdgeIncidentDetectionService", "requestCancelIncident: sending protobuf request...");
                            ((j) KoinJavaComponent.get$default(j.class, null, null, 6, null)).l(edgeIncidentDetectionService.f36786a);
                            edgeIncidentDetectionService.d(cq0.f.FROM_GCM_I_AM_OKAY, j0.f134944a);
                            return;
                        }
                    }
                    if (z14) {
                        EdgeIncidentDetectionService.i(i16, edgeIncidentDetectionService.f36786a, GDIIncidentDetectionProto.CancelIncidentResponse.ResponseStatus.SUCCESS);
                        Message.obtain(edgeIncidentDetectionService.f36798m, 6, cq0.f.FROM_DEVICE_CANCELLED_COUNTDOWN_TIMER_NO_CONTACTS_NOTIFIED.ordinal(), 0).sendToTarget();
                        kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCancelIncident: [WHAT_FINISH_INCIDENT] sent to handler with finished how [FROM_DEVICE_CANCELLED_COUNTDOWN_TIMER_NO_CONTACTS_NOTIFIED]");
                        return;
                    } else {
                        kq0.a.a("EdgeIncidentDetectionService", "requestCancelIncident: sending protobuf request...");
                        ((j) KoinJavaComponent.get$default(j.class, null, null, 6, null)).l(edgeIncidentDetectionService.f36786a);
                        Message.obtain(edgeIncidentDetectionService.f36798m, 6, cq0.f.FROM_GCM_CANCELLED_TIMER_NO_CONTACTS_NOTIFIED.ordinal(), 0).sendToTarget();
                        kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCancelIncident: [WHAT_FINISH_INCIDENT] sent to handler with finished how [FROM_GCM_CANCELLED_TIMER_NO_CONTACTS_NOTIFIED]");
                        return;
                    }
                case 3:
                    edgeIncidentDetectionService.f36789d.set(0);
                    edgeIncidentDetectionService.c(j0.f134944a);
                    return;
                case 4:
                    int i17 = EdgeIncidentDetectionService.f36785w;
                    edgeIncidentDetectionService.getClass();
                    kq0.f.f106156a.getClass();
                    kq0.f.a();
                    com.garmin.android.apps.connectmobile.incidentdetection.a aVar = new com.garmin.android.apps.connectmobile.incidentdetection.a(edgeIncidentDetectionService);
                    edgeIncidentDetectionService.f36790e = aVar;
                    aVar.start();
                    return;
                case 5:
                case 6:
                    int i18 = message.arg1;
                    int i19 = EdgeIncidentDetectionService.f36785w;
                    edgeIncidentDetectionService.getClass();
                    edgeIncidentDetectionService.m(GDIIncidentDetectionProto.IncidentStatusNotification.Status.FINISHED);
                    kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskFinishIncident: [FINISHED] sent to device");
                    edgeIncidentDetectionService.f36791f = false;
                    edgeIncidentDetectionService.f36789d = new AtomicInteger(0);
                    edgeIncidentDetectionService.f36788c = new AtomicInteger(0);
                    edgeIncidentDetectionService.f36790e = null;
                    edgeIncidentDetectionService.f36786a = -1L;
                    try {
                        edgeIncidentDetectionService.f36793h = l.FINISHED;
                        edgeIncidentDetectionService.f36794i = cq0.f.values()[i18];
                        edgeIncidentDetectionService.f36800o.send(Message.obtain((Handler) null, 3));
                        break;
                    } catch (RemoteException e4) {
                        kq0.a.b("EdgeIncidentDetectionService", "backgroundTaskFinishIncident: error sending [MSG_CURRENT_STATE] to bound clients with finished how [" + edgeIncidentDetectionService.f36794i.name() + "]", e4);
                    }
                    kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskFinishIncident: attempting to stop service... (if a GCM Android activity is bound to this service, it will not stop until the activity is unbound from the service)");
                    edgeIncidentDetectionService.stopForeground(1);
                    edgeIncidentDetectionService.stopSelf();
                    return;
                case 7:
                    edgeIncidentDetectionService.f36789d.set(0);
                    edgeIncidentDetectionService.b(j0.f134944a);
                    return;
                default:
                    String strF = e0.f(i14, "Fix me developer! msg.what [", "] is not being handled by the ServiceHandler!");
                    a2 a2Var = kq0.a.f106152a;
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = kq0.a.f106152a;
                    aVar2.getClass();
                    i2.a.f(a2Var2, "EdgeIncidentDetectionService", strF);
                    return;
            }
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36809a;

        static {
            int[] iArr = new int[GDIIncidentDetectionProto.IncidentDetectedRequest.RequestType.values().length];
            try {
                iArr[GDIIncidentDetectionProto.IncidentDetectedRequest.RequestType.ASSISTANCE_NEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIIncidentDetectionProto.IncidentDetectedRequest.RequestType.CYCLING_INCIDENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GDIIncidentDetectionProto.IncidentDetectedRequest.RequestType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36809a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.incidentdetection.EdgeIncidentDetectionService$backgroundTaskCallGCSNotifyContactsAssistanceRequired$1", f = "EdgeIncidentDetectionService.kt", l = {701}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ jq0.a f36811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EdgeIncidentDetectionService f36812c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class a extends q implements e23.l<List<? extends String>, Unit> {
            public a(Object obj) {
                super(1, obj, EdgeIncidentDetectionService.class, "backgroundTaskCallGCSNotifyContactsAssistanceRequired", "backgroundTaskCallGCSNotifyContactsAssistanceRequired(Ljava/util/List;)V", 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Unit invoke(List<? extends String> list) {
                List<? extends String> list2 = list;
                list2.getClass();
                EdgeIncidentDetectionService edgeIncidentDetectionService = (EdgeIncidentDetectionService) this.receiver;
                int i14 = EdgeIncidentDetectionService.f36785w;
                edgeIncidentDetectionService.b(list2);
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class b extends q implements e23.l<List<? extends String>, Unit> {
            public b(Object obj) {
                super(1, obj, EdgeIncidentDetectionService.class, "backgroundTaskCallGCSNotifyContactsAssistanceRequired", "backgroundTaskCallGCSNotifyContactsAssistanceRequired(Ljava/util/List;)V", 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Unit invoke(List<? extends String> list) {
                List<? extends String> list2 = list;
                list2.getClass();
                EdgeIncidentDetectionService edgeIncidentDetectionService = (EdgeIncidentDetectionService) this.receiver;
                int i14 = EdgeIncidentDetectionService.f36785w;
                edgeIncidentDetectionService.b(list2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(jq0.a aVar, EdgeIncidentDetectionService edgeIncidentDetectionService, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f36811b = aVar;
            this.f36812c = edgeIncidentDetectionService;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f36811b, this.f36812c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f36810a;
            if (i14 == 0) {
                r.b(obj);
                dq0.c.f60700b.getClass();
                dq0.c cVarA = dq0.c.a.a();
                this.f36810a = 1;
                obj = f0.J(cVarA, new dq0.e(cVarA, this.f36811b, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCallGCSNotifyContactsAssistanceRequired: API status is [" + v2Var + "]");
            boolean z14 = v2Var instanceof v2.b;
            EdgeIncidentDetectionService edgeIncidentDetectionService = this.f36812c;
            if (z14) {
                u uVar = (u) ((v2.b) v2Var).f47386a;
                List<t> listD = uVar.d();
                if (listD == null || listD.isEmpty()) {
                    List<tj1.s> listB = uVar.b();
                    if (listB == null || listB.isEmpty()) {
                        kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCallGCSNotifyContactsAssistanceRequired: result has no successes and no failures. This should not have happened.");
                        int i15 = EdgeIncidentDetectionService.f36785w;
                        edgeIncidentDetectionService.h(1);
                        edgeIncidentDetectionService.e();
                    } else {
                        edgeIncidentDetectionService.f36791f = false;
                        List<String> listF = uVar.f();
                        if (listF.isEmpty()) {
                            kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCallGCSNotifyContactsAssistanceRequired: result has failures but no contacts make sense to retry");
                            edgeIncidentDetectionService.h(1);
                            edgeIncidentDetectionService.e();
                        } else {
                            int iIncrementAndGet = edgeIncidentDetectionService.f36789d.incrementAndGet();
                            edgeIncidentDetectionService.h(iIncrementAndGet);
                            edgeIncidentDetectionService.k(new a(edgeIncidentDetectionService), listF, iIncrementAndGet);
                        }
                    }
                } else {
                    edgeIncidentDetectionService.f36791f = true;
                    edgeIncidentDetectionService.m(GDIIncidentDetectionProto.IncidentStatusNotification.Status.SENT_NOTIFICATIONS_TO_CONTACTS_SUCCESS);
                    kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCallGCSNotifyContactsAssistanceRequired: [SENT_NOTIFICATIONS_TO_CONTACTS_SUCCESS] sent to device");
                    Message.obtain(edgeIncidentDetectionService.f36798m, 6).sendToTarget();
                }
            } else {
                v2.a aVar2 = v2Var instanceof v2.a ? (v2.a) v2Var : null;
                edgeIncidentDetectionService.f36791f = false;
                int iIncrementAndGet2 = edgeIncidentDetectionService.f36789d.incrementAndGet();
                edgeIncidentDetectionService.h(iIncrementAndGet2);
                if (aVar2 == null || ((num = aVar2.f47384b) != null && num.intValue() == 404)) {
                    kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCallGCSNotifyContactsAssistanceRequired: error = " + aVar2 + "; retried " + (iIncrementAndGet2 - 1) + " times without success");
                    edgeIncidentDetectionService.e();
                } else {
                    EdgeIncidentDetectionService.l(edgeIncidentDetectionService, iIncrementAndGet2, new b(edgeIncidentDetectionService));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.incidentdetection.EdgeIncidentDetectionService$backgroundTaskCallGCSNotifyContactsIncidentDetected$1", f = "EdgeIncidentDetectionService.kt", l = {617}, m = "invokeSuspend", v = 2)
    public static final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ jq0.b f36814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EdgeIncidentDetectionService f36815c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class a extends q implements e23.l<List<? extends String>, Unit> {
            public a(Object obj) {
                super(1, obj, EdgeIncidentDetectionService.class, "backgroundTaskCallGCSNotifyContactsIncidentDetected", "backgroundTaskCallGCSNotifyContactsIncidentDetected(Ljava/util/List;)V", 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Unit invoke(List<? extends String> list) {
                List<? extends String> list2 = list;
                list2.getClass();
                EdgeIncidentDetectionService edgeIncidentDetectionService = (EdgeIncidentDetectionService) this.receiver;
                int i14 = EdgeIncidentDetectionService.f36785w;
                edgeIncidentDetectionService.c(list2);
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class b extends q implements e23.l<List<? extends String>, Unit> {
            public b(Object obj) {
                super(1, obj, EdgeIncidentDetectionService.class, "backgroundTaskCallGCSNotifyContactsIncidentDetected", "backgroundTaskCallGCSNotifyContactsIncidentDetected(Ljava/util/List;)V", 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Unit invoke(List<? extends String> list) {
                List<? extends String> list2 = list;
                list2.getClass();
                EdgeIncidentDetectionService edgeIncidentDetectionService = (EdgeIncidentDetectionService) this.receiver;
                int i14 = EdgeIncidentDetectionService.f36785w;
                edgeIncidentDetectionService.c(list2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(jq0.b bVar, EdgeIncidentDetectionService edgeIncidentDetectionService, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f36814b = bVar;
            this.f36815c = edgeIncidentDetectionService;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f36814b, this.f36815c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f36813a;
            if (i14 == 0) {
                r.b(obj);
                dq0.c.f60700b.getClass();
                dq0.c cVarA = dq0.c.a.a();
                this.f36813a = 1;
                obj = f0.J(cVarA, new dq0.f(cVarA, this.f36814b, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCallGCSNotifyContactsIncidentDetected: API status is [" + v2Var + "]");
            EdgeIncidentDetectionService edgeIncidentDetectionService = this.f36815c;
            c cVar = edgeIncidentDetectionService.f36798m;
            if (cVar == null || edgeIncidentDetectionService.f36792g || edgeIncidentDetectionService.f36786a == -1) {
                kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCallGCSNotifyContactsIncidentDetected: aborting... mServiceHandler is null (actually " + cVar + ") OR mHasReceivedCancelAction is true (actually " + edgeIncidentDetectionService.f36792g + ") OR mIncidentDetectedDeviceID is -1 (actually " + edgeIncidentDetectionService.f36786a + ")");
                return Unit.INSTANCE;
            }
            if (v2Var instanceof v2.b) {
                u uVar = (u) ((v2.b) v2Var).f47386a;
                List<t> listD = uVar.d();
                if (listD == null || listD.isEmpty()) {
                    List<tj1.s> listB = uVar.b();
                    if (listB == null || listB.isEmpty()) {
                        kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCallGCSNotifyContactsIncidentDetected: result has no successes and no failures. This should not have happened.");
                        edgeIncidentDetectionService.h(1);
                        edgeIncidentDetectionService.e();
                    } else {
                        edgeIncidentDetectionService.f36791f = false;
                        List<String> listF = uVar.f();
                        if (listF.isEmpty()) {
                            kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCallGCSNotifyContactsIncidentDetected: result has failures but no contacts make sense to retry");
                            edgeIncidentDetectionService.h(1);
                            edgeIncidentDetectionService.e();
                        } else {
                            int iIncrementAndGet = edgeIncidentDetectionService.f36789d.incrementAndGet();
                            edgeIncidentDetectionService.h(iIncrementAndGet);
                            edgeIncidentDetectionService.k(new a(edgeIncidentDetectionService), listF, iIncrementAndGet);
                        }
                    }
                } else {
                    edgeIncidentDetectionService.f36791f = true;
                    edgeIncidentDetectionService.m(GDIIncidentDetectionProto.IncidentStatusNotification.Status.SENT_NOTIFICATIONS_TO_CONTACTS_SUCCESS);
                    kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCallGCSNotifyContactsIncidentDetected: [SENT_NOTIFICATIONS_TO_CONTACTS_SUCCESS] sent to device");
                    Message.obtain(edgeIncidentDetectionService.f36798m, 4).sendToTarget();
                }
            } else {
                v2.a aVar2 = v2Var instanceof v2.a ? (v2.a) v2Var : null;
                edgeIncidentDetectionService.f36791f = false;
                int iIncrementAndGet2 = edgeIncidentDetectionService.f36789d.incrementAndGet();
                edgeIncidentDetectionService.h(iIncrementAndGet2);
                if (aVar2 == null || ((num = aVar2.f47384b) != null && num.intValue() == 404)) {
                    kq0.a.a("EdgeIncidentDetectionService", "backgroundTaskCallGCSNotifyContactsIncidentDetected: error = " + aVar2 + "; retried " + (iIncrementAndGet2 - 1) + " times without success");
                    edgeIncidentDetectionService.e();
                } else {
                    EdgeIncidentDetectionService.l(edgeIncidentDetectionService, iIncrementAndGet2, new b(edgeIncidentDetectionService));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.incidentdetection.EdgeIncidentDetectionService$callGCSNotifyContactsIAmOkay$1", f = "EdgeIncidentDetectionService.kt", l = {844}, m = "invokeSuspend", v = 2)
    public static final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ jq0.c f36817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EdgeIncidentDetectionService f36818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ cq0.f f36819d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class a extends q implements e23.l<List<? extends String>, Unit> {
            public a(Object obj) {
                super(1, obj, EdgeIncidentDetectionService.class, "notifyContactsIAmOkayFromDevice", "notifyContactsIAmOkayFromDevice(Ljava/util/List;)V", 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Unit invoke(List<? extends String> list) {
                List<? extends String> list2 = list;
                list2.getClass();
                EdgeIncidentDetectionService edgeIncidentDetectionService = (EdgeIncidentDetectionService) this.receiver;
                int i14 = EdgeIncidentDetectionService.f36785w;
                edgeIncidentDetectionService.getClass();
                edgeIncidentDetectionService.d(cq0.f.FROM_DEVICE_I_AM_OKAY, list2);
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class b extends q implements e23.l<List<? extends String>, Unit> {
            public b(Object obj) {
                super(1, obj, EdgeIncidentDetectionService.class, "notifyContactsIAmOkayFromGCM", "notifyContactsIAmOkayFromGCM(Ljava/util/List;)V", 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Unit invoke(List<? extends String> list) {
                List<? extends String> list2 = list;
                list2.getClass();
                EdgeIncidentDetectionService edgeIncidentDetectionService = (EdgeIncidentDetectionService) this.receiver;
                int i14 = EdgeIncidentDetectionService.f36785w;
                edgeIncidentDetectionService.getClass();
                edgeIncidentDetectionService.d(cq0.f.FROM_GCM_I_AM_OKAY, list2);
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class c extends q implements e23.l<List<? extends String>, Unit> {
            public c(Object obj) {
                super(1, obj, EdgeIncidentDetectionService.class, "notifyContactsIAmOkayFromDevice", "notifyContactsIAmOkayFromDevice(Ljava/util/List;)V", 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Unit invoke(List<? extends String> list) {
                List<? extends String> list2 = list;
                list2.getClass();
                EdgeIncidentDetectionService edgeIncidentDetectionService = (EdgeIncidentDetectionService) this.receiver;
                int i14 = EdgeIncidentDetectionService.f36785w;
                edgeIncidentDetectionService.getClass();
                edgeIncidentDetectionService.d(cq0.f.FROM_DEVICE_I_AM_OKAY, list2);
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class d extends q implements e23.l<List<? extends String>, Unit> {
            public d(Object obj) {
                super(1, obj, EdgeIncidentDetectionService.class, "notifyContactsIAmOkayFromGCM", "notifyContactsIAmOkayFromGCM(Ljava/util/List;)V", 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Unit invoke(List<? extends String> list) {
                List<? extends String> list2 = list;
                list2.getClass();
                EdgeIncidentDetectionService edgeIncidentDetectionService = (EdgeIncidentDetectionService) this.receiver;
                int i14 = EdgeIncidentDetectionService.f36785w;
                edgeIncidentDetectionService.getClass();
                edgeIncidentDetectionService.d(cq0.f.FROM_GCM_I_AM_OKAY, list2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(jq0.c cVar, EdgeIncidentDetectionService edgeIncidentDetectionService, cq0.f fVar, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f36817b = cVar;
            this.f36818c = edgeIncidentDetectionService;
            this.f36819d = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f36817b, this.f36818c, this.f36819d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f36816a;
            if (i14 == 0) {
                r.b(obj);
                dq0.c.f60700b.getClass();
                dq0.c cVarA = dq0.c.a.a();
                this.f36816a = 1;
                obj = f0.J(cVarA, new dq0.d(cVarA, this.f36817b, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            kq0.a.a("EdgeIncidentDetectionService", "callGCSNotifyContactsIAmOkay: API status is [" + v2Var + "]");
            boolean z14 = v2Var instanceof v2.b;
            cq0.f fVar = this.f36819d;
            EdgeIncidentDetectionService edgeIncidentDetectionService = this.f36818c;
            if (z14) {
                u uVar = (u) ((v2.b) v2Var).f47386a;
                List<t> listD = uVar.d();
                if (listD == null || listD.isEmpty()) {
                    List<tj1.s> listB = uVar.b();
                    if (listB == null || listB.isEmpty()) {
                        kq0.a.a("EdgeIncidentDetectionService", "callGCSNotifyContactsIAmOkay: result has no successes and no failures. This should not have happened.");
                        int i15 = EdgeIncidentDetectionService.f36785w;
                        edgeIncidentDetectionService.h(1);
                        edgeIncidentDetectionService.e();
                    } else {
                        List<String> listF = uVar.f();
                        if (listF.isEmpty()) {
                            kq0.a.a("EdgeIncidentDetectionService", "callGCSNotifyContactsIAmOkay: result has failures but no contacts make sense to retry");
                            int i16 = EdgeIncidentDetectionService.f36785w;
                            edgeIncidentDetectionService.h(1);
                            edgeIncidentDetectionService.e();
                        } else {
                            int iIncrementAndGet = edgeIncidentDetectionService.f36789d.incrementAndGet();
                            edgeIncidentDetectionService.h(iIncrementAndGet);
                            if (fVar == cq0.f.FROM_DEVICE_I_AM_OKAY) {
                                edgeIncidentDetectionService.k(new a(edgeIncidentDetectionService), listF, iIncrementAndGet);
                            } else {
                                edgeIncidentDetectionService.k(new b(edgeIncidentDetectionService), listF, iIncrementAndGet);
                            }
                        }
                    }
                } else {
                    GDIIncidentDetectionProto.IncidentStatusNotification.Status status = GDIIncidentDetectionProto.IncidentStatusNotification.Status.SENT_NOTIFICATIONS_TO_CONTACTS_SUCCESS;
                    int i17 = EdgeIncidentDetectionService.f36785w;
                    edgeIncidentDetectionService.m(status);
                    kq0.a.a("EdgeIncidentDetectionService", "callGCSNotifyContactsIAmOkay: [SENT_NOTIFICATIONS_TO_CONTACTS_SUCCESS] sent to device");
                    Message.obtain(edgeIncidentDetectionService.f36798m, 6, fVar.ordinal(), 0).sendToTarget();
                }
            } else {
                v2.a aVar2 = v2Var instanceof v2.a ? (v2.a) v2Var : null;
                int iIncrementAndGet2 = edgeIncidentDetectionService.f36789d.incrementAndGet();
                edgeIncidentDetectionService.h(iIncrementAndGet2);
                if (aVar2 == null || ((num = aVar2.f47384b) != null && num.intValue() == 404)) {
                    kq0.a.a("EdgeIncidentDetectionService", "callGCSNotifyContactsIAmOkay: error = " + aVar2 + "; retried " + (iIncrementAndGet2 - 1) + " times without success");
                    edgeIncidentDetectionService.e();
                } else if (fVar == cq0.f.FROM_DEVICE_I_AM_OKAY) {
                    EdgeIncidentDetectionService.l(edgeIncidentDetectionService, iIncrementAndGet2, new c(edgeIncidentDetectionService));
                } else {
                    EdgeIncidentDetectionService.l(edgeIncidentDetectionService, iIncrementAndGet2, new d(edgeIncidentDetectionService));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/incidentdetection/EdgeIncidentDetectionService$h", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Ll20/r;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<l20.r> {
        public h() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            EdgeIncidentDetectionService edgeIncidentDetectionService = EdgeIncidentDetectionService.this;
            if (cVar == cVar2) {
                edgeIncidentDetectionService.f36789d.set(0);
                return;
            }
            kq0.c cVar3 = kq0.c.f106153a;
            int iIncrementAndGet = edgeIncidentDetectionService.f36789d.incrementAndGet();
            cVar3.getClass();
            long jA = kq0.c.a(iIncrementAndGet);
            if (jA <= 0) {
                kq0.a.a("EdgeIncidentDetectionService", "handleActionIncidentDetected: getEmergencyContactsFromGC operation failed, responding with ERROR");
                EdgeIncidentDetectionService.j(edgeIncidentDetectionService.f36804t, edgeIncidentDetectionService.f36803r, GDIIncidentDetectionProto.IncidentDetectedResponse.ResponseStatus.ERROR);
                return;
            }
            j jVar = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);
            c cVar4 = edgeIncidentDetectionService.f36798m;
            if (cVar4 != null) {
                cVar4.postDelayed(new cd0.f(29, jVar, this), jA);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, l20.r rVar) {
            Object serializableExtra;
            l20.r rVar2 = rVar;
            eVar.getClass();
            rVar2.getClass();
            List<l20.a> listF = rVar2.f();
            if (listF == null) {
                listF = j0.f134944a;
            }
            EdgeIncidentDetectionService edgeIncidentDetectionService = EdgeIncidentDetectionService.this;
            edgeIncidentDetectionService.f36801p = listF;
            if (listF == null) {
                s.m("mContactDTOList");
                throw null;
            }
            if (listF.isEmpty()) {
                kq0.a.a("EdgeIncidentDetectionService", "handleActionIncidentDetected: system doesn't have any contacts to notify, responding with ERROR");
                EdgeIncidentDetectionService.j(edgeIncidentDetectionService.f36804t, edgeIncidentDetectionService.f36803r, GDIIncidentDetectionProto.IncidentDetectedResponse.ResponseStatus.ERROR);
                return;
            }
            edgeIncidentDetectionService.f36786a = edgeIncidentDetectionService.f36803r;
            Intent intent = edgeIncidentDetectionService.f36802q;
            if (intent == null) {
                s.m("mIntent");
                throw null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("extra.incident.detected.proto", GDIIncidentDetectionProto.IncidentDetectedRequest.class);
            } else {
                Serializable serializableExtra2 = intent.getSerializableExtra("extra.incident.detected.proto");
                if (!(serializableExtra2 instanceof GDIIncidentDetectionProto.IncidentDetectedRequest)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (GDIIncidentDetectionProto.IncidentDetectedRequest) serializableExtra2;
            }
            serializableExtra.getClass();
            GDIIncidentDetectionProto.IncidentDetectedRequest incidentDetectedRequest = (GDIIncidentDetectionProto.IncidentDetectedRequest) serializableExtra;
            edgeIncidentDetectionService.f36787b = incidentDetectedRequest;
            if (incidentDetectedRequest.getType() == GDIIncidentDetectionProto.IncidentDetectedRequest.RequestType.ASSISTANCE_NEEDED) {
                Message.obtain(edgeIncidentDetectionService.f36798m, 7, edgeIncidentDetectionService.f36804t, 0).sendToTarget();
                kq0.a.a("EdgeIncidentDetectionService", "handleActionIncidentDetected: [WHAT_NOTIFY_CONTACTS_ASSISTANCE_REQUIRED] sent to handler");
                return;
            }
            long j14 = edgeIncidentDetectionService.f36786a;
            GDIIncidentDetectionProto.IncidentDetectedRequest incidentDetectedRequest2 = edgeIncidentDetectionService.f36787b;
            if (incidentDetectedRequest2 == null) {
                s.m("mIncidentDetectedProto");
                throw null;
            }
            int secondsToDelayBeforeNotifyingContactPersons = incidentDetectedRequest2.getSecondsToDelayBeforeNotifyingContactPersons();
            GDIIncidentDetectionProto.IncidentDetectedRequest incidentDetectedRequest3 = edgeIncidentDetectionService.f36787b;
            if (incidentDetectedRequest3 == null) {
                s.m("mIncidentDetectedProto");
                throw null;
            }
            int lat = incidentDetectedRequest3.getPosition().getLat();
            GDIIncidentDetectionProto.IncidentDetectedRequest incidentDetectedRequest4 = edgeIncidentDetectionService.f36787b;
            if (incidentDetectedRequest4 == null) {
                s.m("mIncidentDetectedProto");
                throw null;
            }
            int lon = incidentDetectedRequest4.getPosition().getLon();
            StringBuilder sbW = v.h.w(secondsToDelayBeforeNotifyingContactPersons, "handleActionIncidentDetected: remote device ID [", "]\n                *** proto ***\n                timer seconds [", j14);
            androidx.core.view.j.m(lat, lon, "]\n                lat/long [", "/", sbW);
            sbW.append("]");
            kq0.a.a("EdgeIncidentDetectionService", sbW.toString());
            Message.obtain(edgeIncidentDetectionService.f36798m, 1, edgeIncidentDetectionService.f36804t, 0).sendToTarget();
            kq0.a.a("EdgeIncidentDetectionService", "handleActionIncidentDetected: [WHAT_START_INCIDENT_DETECTED_COUNTDOWN_TIMER] sent to handler");
            kq0.i.f106173a.getClass();
            kq0.i.a();
        }
    }

    static {
        new a(null);
    }

    public EdgeIncidentDetectionService() {
        String userFullName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
        this.f36796k = userFullName.length() != 0 ? userFullName : null;
        this.f36799n = new ArrayList();
        this.f36800o = new Messenger(new b());
        this.f36803r = -1L;
        this.f36804t = -1;
        this.f36805v = new h();
    }

    public static void i(int i14, long j8, GDIIncidentDetectionProto.CancelIncidentResponse.ResponseStatus responseStatus) {
        kq0.a.a("EdgeIncidentDetectionService", "respondToIncidentCancelled: sending protobuf response message");
        GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIIncidentDetectionExtension.incidentDetectionService, GDIIncidentDetectionProto.IncidentDetectionService.newBuilder().setCancelIncidentResponse(GDIIncidentDetectionProto.CancelIncidentResponse.newBuilder().setStatus(responseStatus)).build()).build();
        j jVar = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);
        smartBuild.getClass();
        jVar.h(i14, j8, smartBuild);
    }

    public static void j(int i14, long j8, GDIIncidentDetectionProto.IncidentDetectedResponse.ResponseStatus responseStatus) {
        kq0.a.a("EdgeIncidentDetectionService", "respondToIncidentDetected: sending protobuf response message");
        GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIIncidentDetectionExtension.incidentDetectionService, GDIIncidentDetectionProto.IncidentDetectionService.newBuilder().setIncidentDetectedResponse(GDIIncidentDetectionProto.IncidentDetectedResponse.newBuilder().setStatus(responseStatus)).build()).build();
        j jVar = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);
        smartBuild.getClass();
        jVar.h(i14, j8, smartBuild);
    }

    public static void l(EdgeIncidentDetectionService edgeIncidentDetectionService, int i14, e23.l lVar) {
        edgeIncidentDetectionService.k(lVar, j0.f134944a, i14);
    }

    public final void a(GDIIncidentDetectionProto.IncidentDetectedRequest.RequestType requestType) {
        String string;
        String string2 = getString(R.string.incident_detection_assistance_notification_message);
        string2.getClass();
        PendingIntent pendingIntentF = null;
        o oVar = (o) KoinJavaComponent.get$default(o.class, null, null, 6, null);
        int i14 = d.f36809a[requestType.ordinal()];
        if (i14 == 1) {
            string = getString(R.string.incident_detection_assistance_requested);
            string.getClass();
        } else if (i14 == 2 || i14 == 3) {
            string = getString(R.string.incident_detected_title);
            string.getClass();
            h0 h0VarE = h0.e(oVar.c());
            h0VarE.d(IncidentDetectedActivity.class);
            Intent intent = new Intent(oVar.c(), (Class<?>) IncidentDetectedActivity.class);
            intent.setFlags(536870912);
            h0VarE.a(intent);
            pendingIntentF = h0VarE.f();
        } else {
            string = getString(R.string.incident_detected_title);
            string.getClass();
            h0 h0VarE2 = h0.e(oVar.c());
            h0VarE2.d(IncidentDetectedActivity.class);
            Intent intent2 = new Intent(oVar.c(), (Class<?>) IncidentDetectedActivity.class);
            intent2.setFlags(536870912);
            h0VarE2.a(intent2);
            pendingIntentF = h0VarE2.f();
        }
        Context contextC = oVar.c();
        sz0.e eVar = sz0.e.f161370j;
        z6.q qVar = new z6.q(contextC, eVar.f161386a);
        qVar.N.icon = 2131232011;
        qVar.f202683e = z6.q.e(string);
        qVar.f202684f = z6.q.e(string2);
        qVar.i(2, true);
        qVar.B = "service";
        qVar.f202691m = 2;
        qVar.E = 1;
        qVar.f202686h = pendingIntentF;
        z6.o oVar2 = new z6.o();
        oVar2.f202664e = z6.q.e(string2);
        qVar.l(oVar2);
        sz0.f.f161394a.getClass();
        sz0.f.a.c(this, eVar);
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(5, qVar.c(), 16);
        } else {
            startForeground(5, qVar.c());
        }
        kq0.a.a("EdgeIncidentDetectionService", "addToAndroidNotificationBar: service now running in foreground");
    }

    public final void b(List<String> list) {
        g(l.NOTIFYING_EMERGENCY_CONTACTS_INCIDENT_DETECTED);
        GDIIncidentDetectionProto.IncidentDetectedRequest incidentDetectedRequest = this.f36787b;
        if (incidentDetectedRequest == null) {
            s.m("mIncidentDetectedProto");
            throw null;
        }
        int lat = incidentDetectedRequest.getPosition().getLat();
        GDIIncidentDetectionProto.IncidentDetectedRequest incidentDetectedRequest2 = this.f36787b;
        if (incidentDetectedRequest2 == null) {
            s.m("mIncidentDetectedProto");
            throw null;
        }
        int lon = incidentDetectedRequest2.getPosition().getLon();
        String str = this.f36795j;
        if (str == null) {
            s.m("localeString");
            throw null;
        }
        jq0.a aVar = new jq0.a(lat, lon, str, this.f36796k, list, null, null, null, 224, null);
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new e(aVar, this, null), 3);
    }

    public final void c(List<String> list) {
        g(l.NOTIFYING_EMERGENCY_CONTACTS_INCIDENT_DETECTED);
        GDIIncidentDetectionProto.IncidentDetectedRequest incidentDetectedRequest = this.f36787b;
        if (incidentDetectedRequest == null) {
            s.m("mIncidentDetectedProto");
            throw null;
        }
        int lat = incidentDetectedRequest.getPosition().getLat();
        GDIIncidentDetectionProto.IncidentDetectedRequest incidentDetectedRequest2 = this.f36787b;
        if (incidentDetectedRequest2 == null) {
            s.m("mIncidentDetectedProto");
            throw null;
        }
        int lon = incidentDetectedRequest2.getPosition().getLon();
        String str = this.f36795j;
        if (str == null) {
            s.m("localeString");
            throw null;
        }
        jq0.b bVar = new jq0.b(lat, lon, str, this.f36796k, list);
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new f(bVar, this, null), 3);
    }

    public final void d(cq0.f fVar, List<String> list) {
        g(l.NOTIFYING_EMERGENCY_CONTACTS_I_AM_OKAY);
        String str = this.f36795j;
        if (str == null) {
            s.m("localeString");
            throw null;
        }
        jq0.c cVar = new jq0.c(str, this.f36796k, list);
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new g(cVar, this, fVar, null), 3);
    }

    public final void e() {
        c cVar = this.f36798m;
        cq0.f fVar = cq0.f.FROM_GCM_UNABLE_TO_NOTIFY_EMERGENCY_CONTACTS;
        Message.obtain(cVar, 6, fVar.ordinal(), 0).sendToTarget();
        kq0.a.a("EdgeIncidentDetectionService", "finishIncidentUnableToNotify: tried to notify contacts without success; [WHAT_FINISH_INCIDENT] sent to handler with finishedHow [" + fVar + "]");
    }

    public final void f(int i14, boolean z14) {
        CountDownTimer countDownTimer = this.f36790e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f36790e = null;
            kq0.a.a("EdgeIncidentDetectionService", "handleActionCancelIncident: countdown timer cancelled");
        }
        c cVar = this.f36798m;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
        Message.obtain(this.f36798m, 2, z14 ? 1 : 0, i14).sendToTarget();
    }

    public final void g(l lVar) {
        try {
            this.f36793h = lVar;
            this.f36800o.send(Message.obtain((Handler) null, 3));
        } catch (RemoteException e4) {
            kq0.a.b("EdgeIncidentDetectionService", "error sending [MSG_CURRENT_STATE] to bound clients, state [" + lVar.name() + "]", e4);
        }
    }

    public final void h(int i14) {
        if (i14 == 1) {
            m(GDIIncidentDetectionProto.IncidentStatusNotification.Status.SENT_NOTIFICATIONS_TO_CONTACTS_FAILURE);
            kq0.a.a("EdgeIncidentDetectionService", "notifyDevicesEmergencyContactNotificationFailure: [SENT_NOTIFICATIONS_TO_CONTACTS_FAILURE] sent to device");
        }
    }

    public final void k(e23.l lVar, List list, int i14) {
        kq0.c.f106153a.getClass();
        long jA = kq0.c.a(i14);
        if (jA <= 0) {
            StringBuilder sb3 = new StringBuilder("retryEmergencyContactNotifications: retried ");
            sb3.append(i14 - 1);
            sb3.append(" times without success");
            kq0.a.a("EdgeIncidentDetectionService", sb3.toString());
            e();
            return;
        }
        try {
            kq0.a.a("EdgeIncidentDetectionService", "retryEmergencyContactNotifications: result has failures and we haven't finished retrying yet; retrying contacts " + list + " with function " + lVar);
        } catch (Throwable unused) {
            kq0.a.a("EdgeIncidentDetectionService", "retryEmergencyContactNotifications: result has failures and we haven't finished retrying yet; retrying contacts " + list);
        }
        g(l.NOTIFYING_EMERGENCY_CONTACTS_INCIDENT_DETECTED);
        c cVar = this.f36798m;
        if (cVar != null) {
            cVar.postDelayed(new cq0.e(lVar, list, 0), jA);
        }
        kq0.a.a("EdgeIncidentDetectionService", "retryEmergencyContactNotifications: retry attempt " + i14 + " scheduled to fire in " + jA + " milliseconds");
    }

    public final void m(GDIIncidentDetectionProto.IncidentStatusNotification.Status status) {
        ((j) KoinJavaComponent.get$default(j.class, null, null, 6, null)).n(this.f36786a, status);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.f36800o.getBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        kq0.a.a("EdgeIncidentDetectionService", "onCreate");
        HandlerThread handlerThread = new HandlerThread("EdgeIncidentDetectionService", 10);
        handlerThread.start();
        this.f36797l = handlerThread.getLooper();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        this.f36798m = new c(this, looper);
        this.f36795j = hb2.h.d(hb2.h.a(this));
        a(GDIIncidentDetectionProto.IncidentDetectedRequest.RequestType.UNKNOWN);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        kq0.a.a("EdgeIncidentDetectionService", "onDestroy");
        c cVar = this.f36798m;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
        Looper looper = this.f36797l;
        if (looper != null) {
            looper.quit();
        }
        this.f36798m = null;
        stopForeground(1);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i14, int i15) {
        Object serializableExtra;
        GDIIncidentDetectionProto.IncidentDetectedRequest.RequestType type;
        if (intent == null) {
            return super.onStartCommand(null, i14, i15);
        }
        this.f36802q = intent;
        String action = intent.getAction();
        kq0.a.a("EdgeIncidentDetectionService", "onStartCommand: action [" + action + "]");
        Intent intent2 = this.f36802q;
        if (intent2 == null) {
            s.m("mIntent");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent2.getSerializableExtra("extra.incident.detected.proto", GDIIncidentDetectionProto.IncidentDetectedRequest.class);
        } else {
            Object serializableExtra2 = intent2.getSerializableExtra("extra.incident.detected.proto");
            if (!(serializableExtra2 instanceof GDIIncidentDetectionProto.IncidentDetectedRequest)) {
                serializableExtra2 = null;
            }
            serializableExtra = (GDIIncidentDetectionProto.IncidentDetectedRequest) serializableExtra2;
        }
        GDIIncidentDetectionProto.IncidentDetectedRequest incidentDetectedRequest = (GDIIncidentDetectionProto.IncidentDetectedRequest) serializableExtra;
        if (incidentDetectedRequest == null || (type = incidentDetectedRequest.getType()) == null) {
            type = GDIIncidentDetectionProto.IncidentDetectedRequest.RequestType.UNKNOWN;
        }
        a(type);
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1770631578) {
                if (iHashCode != 906988858) {
                    if (iHashCode == 1780099757 && action.equals("action.cancel.incident.from.gcm")) {
                        if (this.f36792g) {
                            kq0.a.a("EdgeIncidentDetectionService", "WARNING: action [" + action + "]: system already received a cancel earlier, so it's going to ignore this one");
                            return super.onStartCommand(intent, i14, i15);
                        }
                        this.f36792g = true;
                        kq0.f.f106156a.getClass();
                        kq0.f.a();
                        if (this.f36787b != null) {
                            f(-1, false);
                            return 1;
                        }
                        stopForeground(1);
                        stopSelf();
                        kq0.a.a("EdgeIncidentDetectionService", "onStartCommand: ignoring... no incident to cancel");
                        return super.onStartCommand(intent, i14, i15);
                    }
                } else if (action.equals("action.cancel.incident.from.device")) {
                    int intExtra = intent.getIntExtra("extra.protobuf.request.id", -1);
                    long longExtra = intent.getLongExtra("extra.remote.device.id", -99L);
                    if (this.f36792g) {
                        i(intExtra, longExtra, GDIIncidentDetectionProto.CancelIncidentResponse.ResponseStatus.SUCCESS);
                        kq0.a.a("EdgeIncidentDetectionService", "WARNING: action [" + action + "]: system already received a cancel earlier, so it's going to ignore this one");
                    } else {
                        this.f36792g = true;
                        kq0.f.f106156a.getClass();
                        kq0.f.a();
                        if (this.f36787b == null) {
                            i(intExtra, longExtra, GDIIncidentDetectionProto.CancelIncidentResponse.ResponseStatus.ERROR);
                            stopForeground(1);
                            stopSelf();
                            kq0.a.a("EdgeIncidentDetectionService", "onStartCommand: ignoring... no incident to cancel");
                            return super.onStartCommand(intent, i14, i15);
                        }
                        if (this.f36786a == longExtra) {
                            f(intExtra, true);
                            return 1;
                        }
                        i(intExtra, longExtra, GDIIncidentDetectionProto.CancelIncidentResponse.ResponseStatus.ERROR);
                    }
                    return super.onStartCommand(intent, i14, i15);
                }
            } else if (action.equals("action.incident.detected")) {
                this.f36803r = intent.getLongExtra("extra.remote.device.id", -1L);
                this.f36804t = intent.getIntExtra("extra.protobuf.request.id", -1);
                if (this.f36787b == null) {
                    ((j) KoinJavaComponent.get$default(j.class, null, null, 6, null)).q(this.f36805v);
                    return 1;
                }
                kq0.a.a("EdgeIncidentDetectionService", "handleActionIncidentDetected: system is already working on a previously submitted incident, responding with ERROR");
                j(this.f36804t, this.f36803r, GDIIncidentDetectionProto.IncidentDetectedResponse.ResponseStatus.ERROR);
                return 1;
            }
        }
        String strM = am.j.m("onStartCommand: fix me developer... I am not handling action [", action, "]");
        i2.a aVar = i2.f36769a;
        a2 a2Var = kq0.a.f106152a;
        aVar.getClass();
        i2.a.f(a2Var, "EdgeIncidentDetectionService", strM);
        return super.onStartCommand(intent, i14, i15);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/EdgeIncidentDetectionService$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEBUG", "Z", "", "I_AM_OKAY_COUNTDOWN_TIMER_MILLIS", "J", "ACTION_INCIDENT_DETECTED", "ACTION_CANCEL_INCIDENT_FROM_DEVICE", "EXTRA_INCIDENT_DETECTED_PROTO", "EXTRA_REMOTE_DEVICE_ID", "EXTRA_PROTOBUF_REQUEST_ID", "", "WHAT_START_INCIDENT_DETECTED_COUNTDOWN_TIMER", "I", "WHAT_CANCEL_INCIDENT", "WHAT_NOTIFY_CONTACTS_INCIDENT_DETECTED", "WHAT_START_I_AM_OKAY_COUNTDOWN_TIMER", "WHAT_NOTIFY_CONTACTS_I_AM_OKAY", "WHAT_FINISH_INCIDENT", "WHAT_NOTIFY_CONTACTS_ASSISTANCE_REQUIRED", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
