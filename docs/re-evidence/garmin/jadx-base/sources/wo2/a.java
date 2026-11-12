package wo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import e23.p;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.c2;
import o53.m0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import vb.h;
import zn2.l;
import zn2.t;
import zn2.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lwo2/a;", "Lcom/garmin/feature/garminpay/providers/gpay/sync/NewDeviceSyncQueue;", "Lzn2/l;", "deviceDataManager", "Lhs2/d;", "payDevice", "Lzn2/t;", "deviceServiceProvider", "Lhs2/a;", "deviceWalletMetadata", "Lto2/a;", "userEventManager", "<init>", "(Lzn2/l;Lhs2/d;Lzn2/t;Lhs2/a;Lto2/a;)V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends NewDeviceSyncQueue {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f186456s = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final to2.a f186457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Logger f186458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f186459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f186460q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set<InterfaceC3465a> f186461r;

    /* JADX INFO: renamed from: wo2.a$a, reason: collision with other inner class name */
    public interface InterfaceC3465a {
        void a();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwo2/a$b;", "", "", TtmlNode.ATTR_ID, "", "timeToIdleSeconds", "<init>", "(Lwo2/a;Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f186462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f186463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c2 f186464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f186465d;

        /* JADX INFO: renamed from: wo2.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.model.EventAwareSyncQueue$Session$rescheduleSessionStopOnIdle$1$1", f = "EventAwareSyncQueue.kt", l = {46}, m = "invokeSuspend", v = 2)
        public static final class C3466a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f186466a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f186468c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3466a(a aVar, t13.d<? super C3466a> dVar) {
                super(2, dVar);
                this.f186468c = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return b.this.new C3466a(this.f186468c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3466a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f186466a;
                b bVar = b.this;
                if (i14 == 0) {
                    r.b(obj);
                    long j8 = ((long) bVar.f186463b) * 1000;
                    this.f186466a = 1;
                    if (m0.b(j8, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                a aVar2 = this.f186468c;
                aVar2.f186458o.trace("try stop session " + bVar.f186462a + " because of an idle");
                a.p(aVar2, bVar.f186462a);
                return Unit.INSTANCE;
            }
        }

        public b(a aVar, String str, int i14) {
            str.getClass();
            this.f186465d = aVar;
            this.f186462a = str;
            this.f186463b = i14;
        }

        public final void a() {
            a aVar = this.f186465d;
            synchronized (this) {
                try {
                    aVar.f186458o.trace("rescheduleSessionStopOnIdle");
                    c2 c2Var = this.f186464c;
                    if (c2Var != null) {
                        c2Var.c(null);
                    }
                    this.f186464c = ge1.b.T(aVar.f51335i, null, null, new C3466a(aVar, null), 3);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"wo2/a$c", "Lto2/b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements to2.b {

        /* JADX INFO: renamed from: wo2.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.model.EventAwareSyncQueue$apduSessionEventListener$1$onApduSessionEndEvent$1", f = "EventAwareSyncQueue.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C3467a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f186470a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f186471b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3467a(a aVar, String str, t13.d<? super C3467a> dVar) {
                super(2, dVar);
                this.f186470a = aVar;
                this.f186471b = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3467a(this.f186470a, this.f186471b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3467a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                a aVar2 = this.f186470a;
                Logger logger = aVar2.f186458o;
                StringBuilder sb3 = new StringBuilder("onApduSessionEndEvent(");
                String str = this.f186471b;
                sb3.append(str);
                sb3.append(")");
                logger.trace(sb3.toString());
                if (!a.p(aVar2, str)) {
                    e0.u("Received session end with session ID ", str, " but failing to stop the target session, ignore it", aVar2.f186458o);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.model.EventAwareSyncQueue$apduSessionEventListener$1$onApduSessionStartEvent$1", f = "EventAwareSyncQueue.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f186472a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f186473b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Integer f186474c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, String str, Integer num, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f186472a = aVar;
                this.f186473b = str;
                this.f186474c = num;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f186472a, this.f186473b, this.f186474c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f186472a.f186458o.trace("onApduSessionStartEvent(" + this.f186473b + ", " + this.f186474c + ")");
                a aVar2 = this.f186472a;
                String str = this.f186473b;
                Integer num = this.f186474c;
                int iIntValue = num != null ? num.intValue() : 60;
                synchronized (aVar2) {
                    b bVar = aVar2.f186459p;
                    if (bVar != null) {
                        aVar2.f186458o.info("We are now processing session " + bVar.f186462a + ", so cannot start another one for " + str + ".");
                        e0.u("Received session start with session ID ", this.f186473b, " but failing to start the target session, ignore it", this.f186472a.f186458o);
                    } else {
                        b bVar2 = new b(aVar2, str, iIntValue);
                        bVar2.a();
                        aVar2.f186459p = bVar2;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public c() {
        }

        @Override // to2.b
        public final void j0(String str, Integer num) {
            int i14 = a.f186456s;
            a aVar = a.this;
            gl.b.I(aVar.f51335i, null, new b(aVar, str, num, null), 3);
        }

        @Override // to2.b
        public final void x1(String str) {
            int i14 = a.f186456s;
            a aVar = a.this;
            gl.b.I(aVar.f51335i, null, new C3467a(aVar, str, null), 3);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.model.EventAwareSyncQueue", f = "EventAwareSyncQueue.kt", l = {194, 221, 225, 227, 248, 259}, m = "executeApduPackage", v = 2)
    public static final class d extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public xo2.c f186475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public xo2.d f186476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p005kotlin.jvm.internal.m0 f186477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f186478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f186479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f186480f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f186481g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Serializable f186482h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f186483i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f186484j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f186485k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f186487m;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f186485k = obj;
            this.f186487m |= Integer.MIN_VALUE;
            return a.this.d(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, hs2.d dVar, t tVar, hs2.a aVar, to2.a aVar2) {
        super(lVar, dVar, tVar, aVar);
        lVar.getClass();
        dVar.getClass();
        tVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f186457n = aVar2;
        String str = lVar.f205629a.f73101a;
        String strN = fb1.c.n("PAY#NEW_FITPAY#EventAwareSyncQueue: ", str);
        int i14 = gt2.c.f79010a;
        this.f186458o = gt2.b.f79005a.h(strN);
        c cVar = new c();
        this.f186460q = cVar;
        this.f186461r = Collections.synchronizedSet(new LinkedHashSet());
        aVar2.i(str, cVar);
    }

    public static final boolean p(a aVar, String str) {
        synchronized (aVar) {
            b bVar = aVar.f186459p;
            if (bVar == null) {
                aVar.f186458o.info("There is no current session, ignore this stop request.");
                return false;
            }
            if (!s.g(str, bVar.f186462a)) {
                aVar.f186458o.info("The current session ID " + str + " is not equal to the current session " + bVar.f186462a);
                return false;
            }
            a aVar2 = bVar.f186465d;
            synchronized (bVar) {
                try {
                    aVar2.f186458o.trace("cancelSessionStop");
                    c2 c2Var = bVar.f186464c;
                    if (c2Var != null) {
                        c2Var.c(null);
                    }
                    bVar.f186464c = null;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            aVar.f186459p = null;
            try {
                ge1.b.W(t13.h.f161748a, new wo2.c(aVar, null));
                return true;
            } catch (Throwable th4) {
                aVar.f186458o.warn("failed to release transfer, but activeTransfer should have been cleared, just ignore the error", th4);
                return false;
            }
        }
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue
    public final Object b(v vVar) {
        this.f186457n.l(this.f51327a.f205629a.f73101a, this.f186460q);
        Object objB = super.b(vVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0300  */
    /* JADX WARN: Code duplicated, block: B:105:0x0301 A[Catch: Exception -> 0x037a, TRY_LEAVE, TryCatch #3 {Exception -> 0x037a, blocks: (B:93:0x02ca, B:94:0x02cc, B:101:0x02da, B:102:0x02db, B:105:0x0301, B:125:0x037c, B:126:0x037d, B:95:0x02cd, B:97:0x02d1), top: B:154:0x02ca, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0307  */
    /* JADX WARN: Code duplicated, block: B:111:0x031b  */
    /* JADX WARN: Code duplicated, block: B:156:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0261  */
    /* JADX WARN: Code duplicated, block: B:92:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d1 A[Catch: all -> 0x02d7, TRY_LEAVE, TryCatch #4 {all -> 0x02d7, blocks: (B:95:0x02cd, B:97:0x02d1), top: B:156:0x02cd, outer: #3 }] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.List, kotlin.jvm.internal.m0, xo2.c] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0307 -> B:18:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.garmin.feature.garminpay.providers.gpay.sync.NewDeviceSyncQueue
    public final java.lang.Object d(xo2.c r28, wo2.e r29, t13.d<? super xo2.d> r30) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.a.d(xo2.c, wo2.e, t13.d):java.lang.Object");
    }
}
