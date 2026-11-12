package kk2;

import a73.n;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.proto.generated.GDIEventSharingExtension;
import com.garmin.proto.generated.GDIEventSharingProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.h;
import dt2.k;
import e23.p;
import iz1.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p13.h0;
import p13.l0;
import p13.w;
import p13.y;
import t13.g;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\b\t\nB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkk2/a;", "Ldt2/a;", "Ldt2/h;", "Lt13/g;", "coroutineContext", "<init>", "(Lt13/g;)V", "()V", "a", "b", "c", "event-sharing_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements dt2.a, h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f105171h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f105172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Logger f105173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u53.d f105174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public dt2.g f105175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f105176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<Integer> f105177g;

    public interface b {
        void onAlertReceived(GDIEventSharingProto.AlertNotification alertNotification);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkk2/a$c;", "", "Lkk2/a$b;", "subscriber", "Lcom/garmin/proto/generated/GDIEventSharingProto$AlertMessage;", "alertMessage", "", "targetDistance", "<init>", "(Lkk2/a$b;Lcom/garmin/proto/generated/GDIEventSharingProto$AlertMessage;Ljava/lang/Integer;)V", "event-sharing_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f105178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GDIEventSharingProto.AlertMessage f105179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f105180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UUID f105181d;

        public c(b bVar, GDIEventSharingProto.AlertMessage alertMessage, Integer num) {
            bVar.getClass();
            alertMessage.getClass();
            this.f105178a = bVar;
            this.f105179b = alertMessage;
            this.f105180c = num;
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            this.f105181d = uuidRandomUUID;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(c cVar) {
            cVar.getClass();
            GDIEventSharingProto.AlertMessage alertMessage = cVar.f105179b;
            GDIEventSharingProto.AlertMessage alertMessage2 = this.f105179b;
            if (alertMessage2.hasInterval() && alertMessage.hasInterval()) {
                if (alertMessage2.getInterval() < alertMessage.getInterval()) {
                    return -1;
                }
                return alertMessage.getInterval() < alertMessage2.getInterval() ? 1 : 0;
            }
            if (alertMessage2.hasInterval()) {
                return -1;
            }
            return alertMessage.hasInterval() ? 1 : 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f105178a.equals(cVar.f105178a) && this.f105179b.equals(cVar.f105179b) && s.g(this.f105180c, cVar.f105180c);
        }

        public final int hashCode() {
            int iHashCode = (this.f105179b.hashCode() + (this.f105178a.hashCode() * 31)) * 31;
            Integer num = this.f105180c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("SubscriberWrapper(subscriber=");
            sb3.append(this.f105178a);
            sb3.append(", alertMessage=");
            sb3.append(this.f105179b);
            sb3.append(", targetDistance=");
            return f3.i(sb3, this.f105180c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.device.eventsharing.EventSharingDataHandler$onProtobufRequest$1", f = "EventSharingDataHandler.kt", l = {}, m = "invokeSuspend")
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GDIEventSharingProto.AlertNotification f105182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f105183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(GDIEventSharingProto.AlertNotification alertNotification, a aVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f105182a = alertNotification;
            this.f105183b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f105182a, this.f105183b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List<GDIEventSharingProto.AlertType> alertTypeList = this.f105182a.getAlertTypeList();
            alertTypeList.getClass();
            a aVar2 = this.f105183b;
            for (GDIEventSharingProto.AlertType alertType : alertTypeList) {
                synchronized (aVar2.f105176f) {
                    try {
                        List list = (List) aVar2.f105176f.get(alertType);
                        if (list != null) {
                            ArrayList arrayList = new ArrayList(y.r(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((c) it.next()).f105178a);
                            }
                            linkedHashSet.addAll(arrayList);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            GDIEventSharingProto.AlertNotification alertNotification = this.f105182a;
            a aVar3 = this.f105183b;
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                try {
                    ((b) it3.next()).onAlertReceived(alertNotification);
                } catch (Exception e4) {
                    Logger logger = aVar3.f105173c;
                    if (logger == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger.error("Error occurred when notifying subscribers of alert types: " + alertNotification.getAlertTypeList(), (Throwable) e4);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "com.garmin.device.eventsharing.EventSharingDataHandler", f = "EventSharingDataHandler.kt", l = {263}, m = "updateSubscription")
    public static final class e extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f105184a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f105186c;

        public e(t13.d<? super e> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f105184a = obj;
            this.f105186c |= Integer.MIN_VALUE;
            int i14 = a.f105171h;
            return a.this.m(this);
        }
    }

    static {
        new C2021a(null);
    }

    public a(g gVar) {
        gVar.getClass();
        this.f105172b = gVar;
        this.f105176f = new LinkedHashMap();
        this.f105177g = a1.b(81);
    }

    public final Object c(GDIEventSharingProto.AlertType alertType, b bVar, v13.c cVar) {
        Object objD = d(w.c(GDIEventSharingProto.AlertMessage.newBuilder().setType(alertType).build()), bVar, null, cVar);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        u53.d dVar = this.f105174d;
        if (dVar != null) {
            c0.d(dVar, "EventSharingDataHandler closed");
        } else {
            s.m("coroutineScope");
            throw null;
        }
    }

    public final Object d(List list, b bVar, Integer num, v13.c cVar) {
        boolean z14;
        Object objM;
        synchronized (this.f105176f) {
            try {
                Iterator it = list.iterator();
                z14 = false;
                while (it.hasNext()) {
                    GDIEventSharingProto.AlertMessage alertMessage = (GDIEventSharingProto.AlertMessage) it.next();
                    GDIEventSharingProto.AlertType type = alertMessage.getType();
                    if (!this.f105176f.containsKey(type)) {
                        z14 = true;
                    }
                    List arrayList = (List) this.f105176f.get(type);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    c cVar2 = new c(bVar, alertMessage, num);
                    arrayList.add(cVar2);
                    p13.c0.t(arrayList);
                    this.f105176f.put(type, arrayList);
                    if (s.g(((c) h0.b0(arrayList)).f105181d, cVar2.f105181d)) {
                        z14 = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return (z14 && (objM = m(cVar)) == u13.a.COROUTINE_SUSPENDED) ? objM : Unit.INSTANCE;
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f105177g;
    }

    public final Object l(List<? extends GDIEventSharingProto.AlertType> list, b bVar, t13.d<? super Unit> dVar) {
        boolean z14;
        Object objM;
        synchronized (this.f105176f) {
            try {
                z14 = false;
                for (GDIEventSharingProto.AlertType alertType : list) {
                    List list2 = (List) this.f105176f.get(alertType);
                    if (list2 != null) {
                        c cVar = (c) h0.d0(list2);
                        list2.removeIf(new n(new f(bVar, 26), 16));
                        c cVar2 = (c) h0.d0(list2);
                        if (cVar2 == null) {
                            this.f105176f.remove(alertType);
                        } else if (cVar == null || cVar2.compareTo(cVar) == 0) {
                        }
                        z14 = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return (z14 && (objM = m(dVar)) == u13.a.COROUTINE_SUSPENDED) ? objM : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(t13.d<? super Set<GDIEventSharingProto.AlertMessage>> dVar) {
        e eVar;
        GDIEventSharingProto.EventSharingService eventSharingService;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i14 = eVar.f105186c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f105186c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objB = eVar.f105184a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f105186c;
        if (i15 == 0) {
            r.b(objB);
            GDIEventSharingProto.SubscribeRequest.Builder builderNewBuilder = GDIEventSharingProto.SubscribeRequest.newBuilder();
            synchronized (this.f105176f) {
                try {
                    for (List<c> list : this.f105176f.values()) {
                        c cVar = (c) h0.d0(list);
                        if (cVar != null) {
                            builderNewBuilder.addAlerts(cVar.f105179b);
                        }
                        for (c cVar2 : list) {
                            if (cVar2.f105180c != null) {
                                if (builderNewBuilder.hasTargetDistance()) {
                                    builderNewBuilder.setTargetDistance(Math.max(builderNewBuilder.getTargetDistance(), cVar2.f105180c.intValue()));
                                } else {
                                    builderNewBuilder.setTargetDistance(cVar2.f105180c.intValue());
                                }
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            List<GDIEventSharingProto.AlertMessage> alertsList = builderNewBuilder.getAlertsList();
            alertsList.getClass();
            ArrayList arrayList = new ArrayList(y.r(alertsList, 10));
            Iterator<T> it = alertsList.iterator();
            while (it.hasNext()) {
                arrayList.add(((GDIEventSharingProto.AlertMessage) it.next()).getType());
            }
            arrayList.toString();
            GDIEventSharingProto.EventSharingService.Builder subscribeRequest = GDIEventSharingProto.EventSharingService.newBuilder().setSubscribeRequest(builderNewBuilder);
            GDISmartProto.Smart.Builder builderNewBuilder2 = GDISmartProto.Smart.newBuilder();
            builderNewBuilder2.setExtension(GDIEventSharingExtension.eventSharing, subscribeRequest.build());
            GDISmartProto.Smart smartBuild = builderNewBuilder2.build();
            smartBuild.getClass();
            dt2.g gVar = this.f105175e;
            if (gVar == null) {
                s.m("messenger");
                throw null;
            }
            eVar.f105186c = 1;
            objB = gVar.b(smartBuild, eVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objB);
        }
        GDISmartProto.Smart smart = (GDISmartProto.Smart) objB;
        if (smart != null) {
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIEventSharingProto.EventSharingService> generatedExtension = GDIEventSharingExtension.eventSharing;
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                eventSharingService = (GDIEventSharingProto.EventSharingService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            } else {
                eventSharingService = null;
            }
        } else {
            eventSharingService = null;
        }
        if (eventSharingService != null) {
            if (!eventSharingService.hasSubscribeResponse()) {
                eventSharingService = null;
            }
            if (eventSharingService != null) {
                List<GDIEventSharingProto.SubscribeResponse.AlertStatusMessage> alertStatusList = eventSharingService.getSubscribeResponse().getAlertStatusList();
                alertStatusList.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (GDIEventSharingProto.SubscribeResponse.AlertStatusMessage alertStatusMessage : alertStatusList) {
                    if (!alertStatusMessage.hasType() || alertStatusMessage.getSubscribeStatus() != GDIEventSharingProto.SubscribeResponse.AlertStatusMessage.Status.SUCCESS) {
                        alertStatusMessage = null;
                    }
                    GDIEventSharingProto.AlertMessage type = alertStatusMessage != null ? alertStatusMessage.getType() : null;
                    if (type != null) {
                        arrayList2.add(type);
                    }
                }
                return h0.g1(arrayList2);
            }
        }
        return l0.f134950a;
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        GDIEventSharingProto.AlertNotification alertNotification;
        smart.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIEventSharingProto.EventSharingService> generatedExtension = GDIEventSharingExtension.eventSharing;
        GDIEventSharingProto.EventSharingService eventSharingService = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDIEventSharingProto.EventSharingService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (eventSharingService == null) {
            return false;
        }
        if (!eventSharingService.hasAlertNotification()) {
            eventSharingService = null;
        }
        if (eventSharingService == null || (alertNotification = eventSharingService.getAlertNotification()) == null) {
            return false;
        }
        u53.d dVar = this.f105174d;
        if (dVar != null) {
            ge1.b.T(dVar, null, null, new d(alertNotification, this, null), 3);
            return true;
        }
        s.m("coroutineScope");
        throw null;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        GDIEventSharingExtension.registerAllExtensions(extensionRegistryLite);
        GDIEventSharingProto.registerAllExtensions(extensionRegistryLite);
        this.f105173c = LoggerFactory.getLogger("EventSharingDataHandler");
        this.f105174d = zl.a.e("EventSharingDataHandler", this.f105172b.plus(ge1.b.h()));
        this.f105175e = gVar;
        ((dt2.d) gVar).f61154i.add(this);
    }

    /* JADX INFO: renamed from: kk2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkk2/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "event-sharing_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2021a {
        public /* synthetic */ C2021a(j jVar) {
            this();
        }

        private C2021a() {
        }
    }

    public a() {
        this(s0.f129406a);
    }
}
