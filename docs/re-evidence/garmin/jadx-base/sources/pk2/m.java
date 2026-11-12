package pk2;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$queueAllDownloadItems$2", f = "AgentQueueHelper.kt", l = {369}, m = "invokeSuspend")
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f138426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f138427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f138428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f138429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f138430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f138431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f138432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ok2.y f138433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ HashSet<UUID> f138434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0<Long> f138435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m0 f138436k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lwk2/i;", "<anonymous>", "(Lo53/b0;)Ljava/util/Collection;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$queueAllDownloadItems$2$1$1", f = "AgentQueueHelper.kt", l = {367}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Collection<? extends wk2.i>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f138437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f138438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f138439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ok2.y f138440d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, c0 c0Var, ok2.y yVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f138438b = bVar;
            this.f138439c = c0Var;
            this.f138440d = yVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f138438b, this.f138439c, this.f138440d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Collection<? extends wk2.i>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f138437a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f138437a = 1;
                Serializable serializableA = b.a(this.f138438b, this.f138439c, this.f138440d, this);
                return serializableA == aVar ? aVar : serializableA;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, ok2.y yVar, HashSet<UUID> hashSet, r0<Long> r0Var, m0 m0Var, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f138432g = bVar;
        this.f138433h = yVar;
        this.f138434i = hashSet;
        this.f138435j = r0Var;
        this.f138436k = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f138432g, this.f138433h, this.f138434i, this.f138435j, this.f138436k, dVar);
        mVar.f138431f = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae A[Catch: CancellationException -> 0x001e, CoreTransferException -> 0x0021, LOOP:0: B:26:0x00a8->B:28:0x00ae, LOOP_END, TryCatch #2 {CoreTransferException -> 0x0021, CancellationException -> 0x001e, blocks: (B:6:0x0019, B:25:0x0092, B:26:0x00a8, B:28:0x00ae, B:29:0x00bc, B:22:0x007f), top: B:46:0x0019 }] */
    /* JADX WARN: Type inference failed for: r13v21, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:25:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
