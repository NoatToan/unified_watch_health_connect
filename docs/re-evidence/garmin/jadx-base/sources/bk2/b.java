package bk2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.room.b0;
import androidx.room.x;
import ch.qos.logback.core.CoreConstants;
import com.garmin.device.devicemessages.persistence.CIQMessageDatabase;
import com.garmin.proto.generated.GDIDeviceMessages;
import com.garmin.proto.generated.GDIDeviceMessagesExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import d53.t;
import dt2.k;
import e23.p;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o13.r;
import o53.a0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.a1;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0017\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\f"}, d2 = {"Lbk2/b;", "Ldt2/a;", "Lkotlin/Function0;", "Lck2/a;", "ciqMessageDAO", "<init>", "(Le23/a;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "b", "c", "device-messages_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements dt2.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f18501j = new c(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static b f18502k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<ck2.a> f18503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f18504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u53.d f18505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap<Long, Long> f18507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap<Long, C0269b> f18508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap<Long, String> f18509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f18510i;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lck2/a;", "invoke", "()Lck2/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends w implements e23.a<ck2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f18511a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f18511a = context;
        }

        @Override // e23.a
        public final ck2.a invoke() {
            CIQMessageDatabase.f50717a.getClass();
            Context context = this.f18511a;
            context.getClass();
            if (CIQMessageDatabase.f50718b == null) {
                b0.a aVarA = x.a(context.getApplicationContext(), CIQMessageDatabase.class, "ciq-message-database");
                aVarA.a(CIQMessageDatabase.f50719c);
                aVarA.f10732j = true;
                CIQMessageDatabase.f50718b = (CIQMessageDatabase) aVarA.b();
            }
            CIQMessageDatabase cIQMessageDatabase = CIQMessageDatabase.f50718b;
            cIQMessageDatabase.getClass();
            return cIQMessageDatabase.e();
        }
    }

    /* JADX INFO: renamed from: bk2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbk2/b$b;", "", "Lrs2/c;", "deviceInfo", "Ldt2/g;", "messenger", "<init>", "(Lrs2/c;Ldt2/g;)V", "device-messages_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0269b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rs2.c f18512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dt2.g f18513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u53.d f18514c;

        public C0269b(rs2.c cVar, dt2.g gVar) {
            cVar.getClass();
            gVar.getClass();
            this.f18512a = cVar;
            this.f18513b = gVar;
            this.f18514c = c0.a(new a0("CIQMessageManager[" + cVar.getF172493a() + ']'));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"bk2/b$d", "Ldt2/h;", "device-messages_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements dt2.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rs2.c f18516c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "com.garmin.device.devicemessages.CIQMessageManager$start$2$onProtobufRequest$1", f = "CIQMessageManager.kt", l = {245}, m = "invokeSuspend")
        public static final class a extends v13.i implements p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f18517a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f18518b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ rs2.c f18519c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ GDIDeviceMessages.DeviceMessageService f18520d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, rs2.c cVar, GDIDeviceMessages.DeviceMessageService deviceMessageService, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f18518b = bVar;
                this.f18519c = cVar;
                this.f18520d = deviceMessageService;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f18518b, this.f18519c, this.f18520d, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object objM;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f18517a;
                if (i14 == 0) {
                    r.b(obj);
                    b bVar = this.f18518b;
                    rs2.c cVar = this.f18519c;
                    GDIDeviceMessages.CIQMessageSubscribeNotification messageSubscribe = this.f18520d.getMessageSubscribe();
                    messageSubscribe.getClass();
                    this.f18517a = 1;
                    c cVar2 = b.f18501j;
                    bVar.getClass();
                    String f172493a = cVar.getF172493a();
                    String lastEventId = messageSubscribe.getLastEventId();
                    bVar.f18504c.debug(f172493a + " has subscribed with last event ID " + lastEventId);
                    synchronized (bVar.f18506e) {
                        C0269b c0269b = (C0269b) bVar.f18510i.get(f172493a);
                        if (c0269b == null) {
                            bVar.f18504c.warn("Missing device for " + f172493a);
                            objM = Unit.INSTANCE;
                        } else {
                            long f172494b = c0269b.f18512a.getF172494b();
                            if (!s.g(cVar.getF172493a(), cVar.getF172502j()) || bVar.f18508g.get(new Long(f172494b)) == null) {
                                bVar.f18508g.put(new Long(f172494b), c0269b);
                                lastEventId.getClass();
                                int iH = d53.w.H(lastEventId, "-", 0, false, 6);
                                if (iH == -1) {
                                    bVar.f18507f.put(new Long(f172494b), new Long(0L));
                                } else {
                                    ConcurrentHashMap<Long, Long> concurrentHashMap = bVar.f18507f;
                                    Long l14 = new Long(f172494b);
                                    Long lJ = t.j(lastEventId.substring(0, iH));
                                    concurrentHashMap.put(l14, new Long(lJ != null ? lJ.longValue() : 0L));
                                }
                                objM = bVar.m(f172494b, this);
                                if (objM != aVar) {
                                    objM = Unit.INSTANCE;
                                }
                            } else {
                                bVar.f18504c.warn("Already subscribed " + f172494b + ". Ignore subscribe for BTC " + f172493a);
                                objM = Unit.INSTANCE;
                            }
                        }
                    }
                    if (objM == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public d(rs2.c cVar) {
            this.f18516c = cVar;
        }

        @Override // dt2.h
        public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
            C0269b c0269b;
            smart.getClass();
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceMessages.DeviceMessageService> generatedExtension = GDIDeviceMessagesExtension.deviceMessageService;
            GDIDeviceMessages.DeviceMessageService deviceMessageService = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDIDeviceMessages.DeviceMessageService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            if (deviceMessageService == null) {
                return false;
            }
            b bVar = b.this;
            LinkedHashMap linkedHashMap = bVar.f18510i;
            rs2.c cVar = this.f18516c;
            synchronized (linkedHashMap) {
                c0269b = (C0269b) bVar.f18510i.get(cVar.getF172493a());
            }
            if (c0269b == null) {
                return false;
            }
            if (deviceMessageService.hasMessageSubscribe()) {
                ge1.b.T(c0269b.f18514c, null, null, new a(b.this, this.f18516c, deviceMessageService, null), 3);
                return true;
            }
            if (!deviceMessageService.hasMessageUnsubscribe()) {
                return false;
            }
            b.this.l(this.f18516c.getF172493a());
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(e23.a<? extends ck2.a> aVar) {
        aVar.getClass();
        this.f18503b = aVar;
        this.f18504c = LoggerFactory.getLogger("CIQMessageManager");
        this.f18505d = q2.l("CIQMessageManager");
        this.f18506e = new byte[0];
        this.f18507f = new ConcurrentHashMap<>();
        this.f18508g = new ConcurrentHashMap<>();
        this.f18509h = new ConcurrentHashMap<>();
        this.f18510i = new LinkedHashMap();
    }

    public static final Object c(b bVar, long j8, h.a aVar) {
        wr.g.v("Device ", j8, " returned an error for last message.  Retrying or moving on to next message.", bVar.f18504c);
        bVar.f18509h.remove(new Long(j8));
        Object objM = bVar.m(j8, aVar);
        return objM == u13.a.COROUTINE_SUSPENDED ? objM : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r10.p(r11, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b bVar, long j8, String str, v13.c cVar) {
        bk2.c cVar2;
        Throwable th3;
        b bVar2;
        b bVar3;
        long j14;
        bVar.getClass();
        if (cVar instanceof bk2.c) {
            cVar2 = (bk2.c) cVar;
            int i14 = cVar2.f18525e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f18525e = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new bk2.c(bVar, cVar);
            }
        } else {
            cVar2 = new bk2.c(bVar, cVar);
        }
        Object obj = cVar2.f18523c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f18525e;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    j14 = cVar2.f18522b;
                    bVar3 = cVar2.f18521a;
                    r.b(obj);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b bVar4 = cVar2.f18521a;
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            try {
                cVar2.f18521a = bVar;
                cVar2.f18522b = j8;
                cVar2.f18525e = 1;
                try {
                    x53.c cVar3 = s0.f129406a;
                    try {
                        bVar2 = bVar;
                        try {
                            if (ge1.b.e0(x53.b.f189152a, new bk2.d(bVar2, j8, str, null), cVar2) != aVar) {
                                bVar3 = bVar2;
                                j14 = j8;
                            }
                            return aVar;
                        } catch (Throwable th4) {
                            th = th4;
                            th3 = th;
                            bVar = bVar2;
                            bVar.f18504c.error("onError in ackEvent", th3);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        bVar2 = bVar;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    bVar2 = bVar;
                }
            } catch (Throwable th7) {
                th = th7;
                th3 = th;
                bVar.f18504c.error("onError in ackEvent", th3);
                return Unit.INSTANCE;
            }
            cVar2.f18521a = bVar3;
            cVar2.f18525e = 2;
        } catch (Throwable th8) {
            th = th8;
        }
    }

    @Override // dt2.a
    public final void close(String str) {
        C0269b c0269b;
        u53.d dVar;
        str.getClass();
        l(str);
        synchronized (this.f18510i) {
            c0269b = (C0269b) this.f18510i.remove(str);
        }
        if (c0269b == null || (dVar = c0269b.f18514c) == null) {
            return;
        }
        c0.d(dVar, "Connection " + str + " closed");
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return a1.b(74);
    }

    public final void l(String str) {
        this.f18504c.debug(str + " has unsubscribed");
        synchronized (this.f18506e) {
            C0269b c0269b = (C0269b) this.f18510i.get(str);
            if (c0269b == null) {
                this.f18504c.warn("Missing device for " + str);
                return;
            }
            LinkedHashMap linkedHashMap = this.f18510i;
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!s.g(entry.getKey(), str) && ((C0269b) entry.getValue()).f18512a.getF172494b() == c0269b.f18512a.getF172494b()) {
                        this.f18504c.warn("Ignore unsubscribe " + str + " since other BT link still available");
                        return;
                    }
                }
            }
            long f172494b = c0269b.f18512a.getF172494b();
            this.f18507f.remove(Long.valueOf(f172494b));
            this.f18508g.remove(Long.valueOf(f172494b));
            this.f18509h.remove(Long.valueOf(f172494b));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(long j8, v13.c cVar) {
        g gVar;
        b bVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f18537d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f18537d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f18535b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f18537d;
        if (i15 == 0) {
            r.b(obj);
            try {
                gVar.f18534a = this;
                gVar.f18537d = 1;
                if (p(j8, gVar) == aVar) {
                    return aVar;
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = this;
                bVar.f18504c.error("onError in send", th);
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = gVar.f18534a;
            try {
                r.b(obj);
            } catch (Throwable th4) {
                th = th4;
                bVar.f18504c.error("onError in send", th);
            }
        }
        return Unit.INSTANCE;
    }

    public final Object p(long j8, v13.c cVar) throws Throwable {
        x53.c cVar2 = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new i(this, j8, null), cVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        GDIDeviceMessagesExtension.registerAllExtensions(extensionRegistryLite);
        GDIDeviceMessages.registerAllExtensions(extensionRegistryLite);
        synchronized (this.f18510i) {
            this.f18510i.put(((us2.f) cVar).f172493a, new C0269b(cVar, gVar));
            Unit unit = Unit.INSTANCE;
        }
        ((dt2.d) gVar).f61154i.add(new d(cVar));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbk2/b$c;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lbk2/b;", "instance", "Lbk2/b;", "device-messages_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(j jVar) {
            this();
        }

        public static b a(Context context) {
            context.getClass();
            if (b.f18502k == null) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                b.f18502k = new b(applicationContext, null);
            }
            b bVar = b.f18502k;
            bVar.getClass();
            return bVar;
        }

        private c() {
        }
    }

    public /* synthetic */ b(Context context, j jVar) {
        this(context);
    }

    private b(Context context) {
        this(new a(context));
    }
}
