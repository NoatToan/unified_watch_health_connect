package zg2;

import e23.l;
import e23.p;
import o53.b0;
import o53.c0;
import o53.c2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lzg2/a;", "", "Lfg2/c;", "deviceProvider", "", "deviceId", "Lkotlin/Function1;", "", "", "onBatteryPercentageUpdated", "<init>", "(Lfg2/c;JLe23/l;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg2.c f204684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f204685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<Integer, Unit> f204686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f204687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u53.d f204688e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.util.DeviceBatteryPercentageProvider$start$1", f = "DeviceBatteryPercentageProvider.kt", l = {29, 35}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f204690b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = a.this.new b(dVar);
            bVar.f204690b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0032  */
        /* JADX WARN: Code duplicated, block: B:16:0x0038 A[Catch: Exception -> 0x0023, TRY_ENTER, TryCatch #0 {Exception -> 0x0023, blocks: (B:16:0x0038, B:19:0x0047, B:9:0x001f), top: B:27:0x001f }] */
        /* JADX WARN: Code duplicated, block: B:18:0x0046  */
        /* JADX WARN: Code duplicated, block: B:19:0x0047 A[Catch: Exception -> 0x0023, PHI: r10
          0x0047: PHI (r10v7 java.lang.Object) = (r10v12 java.lang.Object), (r10v0 java.lang.Object) binds: [B:17:0x0044, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0023, blocks: (B:16:0x0038, B:19:0x0047, B:9:0x001f), top: B:27:0x001f }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008d -> B:14:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f204690b
                o53.b0 r0 = (o53.b0) r0
                u13.a r1 = u13.a.COROUTINE_SUSPENDED
                int r2 = r9.f204689a
                zg2.a r3 = zg2.a.this
                r4 = 2
                r5 = 1
                java.lang.String r6 = "BatteryPercentageTimer"
                if (r2 == 0) goto L25
                if (r2 == r5) goto L1f
                if (r2 != r4) goto L18
                o13.r.b(r10)
                goto L32
            L18:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r10)
                r10 = 0
                return r10
            L1f:
                o13.r.b(r10)     // Catch: java.lang.Exception -> L23
                goto L47
            L23:
                r10 = move-exception
                goto L68
            L25:
                o13.r.b(r10)
                zg2.c r10 = zg2.c.f204692a
                r10.getClass()
                java.lang.String r10 = "Starting battery percentage timer"
                zg2.c.a(r6, r10)
            L32:
                boolean r10 = o53.c0.g(r0)
                if (r10 == 0) goto L90
                fg2.c r10 = r3.f204684a     // Catch: java.lang.Exception -> L23
                long r7 = r3.f204685b     // Catch: java.lang.Exception -> L23
                r9.f204690b = r0     // Catch: java.lang.Exception -> L23
                r9.f204689a = r5     // Catch: java.lang.Exception -> L23
                java.lang.Object r10 = r10.b(r7, r9)     // Catch: java.lang.Exception -> L23
                if (r10 != r1) goto L47
                goto L8f
            L47:
                java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Exception -> L23
                zg2.c r2 = zg2.c.f204692a     // Catch: java.lang.Exception -> L23
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
                r7.<init>()     // Catch: java.lang.Exception -> L23
                java.lang.String r8 = "Updated battery percentage: "
                r7.append(r8)     // Catch: java.lang.Exception -> L23
                r7.append(r10)     // Catch: java.lang.Exception -> L23
                java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L23
                r2.getClass()     // Catch: java.lang.Exception -> L23
                zg2.c.a(r6, r7)     // Catch: java.lang.Exception -> L23
                e23.l<java.lang.Integer, kotlin.Unit> r2 = r3.f204686c     // Catch: java.lang.Exception -> L23
                r2.invoke(r10)     // Catch: java.lang.Exception -> L23
                goto L82
            L68:
                zg2.c r2 = zg2.c.f204692a
                java.lang.String r10 = r10.getMessage()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r8 = "Error updating battery percentage: "
                r7.<init>(r8)
                r7.append(r10)
                java.lang.String r10 = r7.toString()
                r2.getClass()
                zg2.c.b(r6, r10)
            L82:
                r9.f204690b = r0
                r9.f204689a = r4
                r7 = 300000(0x493e0, double:1.482197E-318)
                java.lang.Object r10 = o53.m0.b(r7, r9)
                if (r10 != r1) goto L32
            L8f:
                return r1
            L90:
                kotlin.Unit r10 = p005kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: zg2.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new C3817a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(fg2.c cVar, long j8, l<? super Integer, Unit> lVar) {
        cVar.getClass();
        lVar.getClass();
        this.f204684a = cVar;
        this.f204685b = j8;
        this.f204686c = lVar;
        x53.c cVar2 = s0.f129406a;
        this.f204688e = c0.a(x53.b.f189152a);
    }

    public final void a() {
        c cVar = c.f204692a;
        String str = "Starting battery percentage updates for device (" + this.f204685b + ")";
        cVar.getClass();
        c.a("BatteryPercentageTimer", str);
        b();
        this.f204687d = ge1.b.T(this.f204688e, null, null, new b(null), 3);
    }

    public final void b() {
        c.f204692a.getClass();
        c.a("BatteryPercentageTimer", "Stopping battery percentage updates");
        c2 c2Var = this.f204687d;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f204687d = null;
    }

    /* JADX INFO: renamed from: zg2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzg2/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "BATTERY_UPDATE_INTERVAL_MS", "J", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3817a {
        public /* synthetic */ C3817a(j jVar) {
            this();
        }

        private C3817a() {
        }
    }
}
