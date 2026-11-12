package po2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardChargingFlowBuilder$Purchasing$launchPurchasePolling$1", f = "CardChargingFlowBuilder.kt", l = {75, 190, 77, 92}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.m0 f139117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.a f139118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f139119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f139120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f139121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f139122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f139123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c.b f139124h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, c.b bVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f139123g = cVar;
        this.f139124h = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f139123g, this.f139124h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[Catch: all -> 0x004c, TryCatch #2 {all -> 0x004c, blocks: (B:53:0x00f2, B:26:0x005e, B:28:0x0062, B:31:0x0074, B:57:0x011a, B:58:0x011d, B:17:0x0045, B:22:0x0051, B:25:0x0058), top: B:71:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[Catch: all -> 0x004c, PHI: r1
      0x0074: PHI (r1v5 kotlin.jvm.internal.m0) = (r1v7 kotlin.jvm.internal.m0), (r1v10 kotlin.jvm.internal.m0) binds: [B:29:0x0070, B:22:0x0051] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x004c, blocks: (B:53:0x00f2, B:26:0x005e, B:28:0x0062, B:31:0x0074, B:57:0x011a, B:58:0x011d, B:17:0x0045, B:22:0x0051, B:25:0x0058), top: B:71:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6 A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:39:0x00b2, B:41:0x00c6, B:52:0x00ee, B:44:0x00d7, B:49:0x00e5, B:55:0x00f7, B:56:0x0119), top: B:67:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:39:0x00b2, B:41:0x00c6, B:52:0x00ee, B:44:0x00d7, B:49:0x00e5, B:55:0x00f7, B:56:0x0119), top: B:67:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5 A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:39:0x00b2, B:41:0x00c6, B:52:0x00ee, B:44:0x00d7, B:49:0x00e5, B:55:0x00f7, B:56:0x0119), top: B:67:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7 A[Catch: all -> 0x00e3, TRY_ENTER, TryCatch #0 {all -> 0x00e3, blocks: (B:39:0x00b2, B:41:0x00c6, B:52:0x00ee, B:44:0x00d7, B:49:0x00e5, B:55:0x00f7, B:56:0x0119), top: B:67:0x00b2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:67:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po2.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
