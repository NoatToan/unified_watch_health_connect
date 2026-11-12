package po2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardPurchaseDownloadFlowBuilder$Purchasing$launchPurchasePolling$1", f = "CardPurchaseDownloadFlowBuilder.kt", l = {77, 232, 79, 95}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.m0 f139199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.a f139200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f139201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f139202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f139203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f139204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f139205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g.c f139206h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, g.c cVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f139205g = gVar;
        this.f139206h = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f139205g, this.f139206h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0067 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:63:0x0139, B:26:0x0063, B:28:0x0067, B:31:0x0079, B:67:0x0161, B:68:0x0164, B:17:0x0049, B:22:0x0057, B:25:0x005e), top: B:77:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079 A[Catch: all -> 0x0052, PHI: r0
      0x0079: PHI (r0v8 kotlin.jvm.internal.m0) = (r0v10 kotlin.jvm.internal.m0), (r0v16 kotlin.jvm.internal.m0) binds: [B:29:0x0075, B:22:0x0057] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:63:0x0139, B:26:0x0063, B:28:0x0067, B:31:0x0079, B:67:0x0161, B:68:0x0164, B:17:0x0049, B:22:0x0057, B:25:0x005e), top: B:77:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:39:0x00b6, B:41:0x00ca, B:43:0x00d0, B:45:0x00e0, B:47:0x00e6, B:62:0x0135, B:35:0x0095, B:50:0x00f0, B:55:0x00fe, B:56:0x0114, B:57:0x0115, B:58:0x012b, B:59:0x012c, B:65:0x013e, B:66:0x0160), top: B:80:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:39:0x00b6, B:41:0x00ca, B:43:0x00d0, B:45:0x00e0, B:47:0x00e6, B:62:0x0135, B:35:0x0095, B:50:0x00f0, B:55:0x00fe, B:56:0x0114, B:57:0x0115, B:58:0x012b, B:59:0x012c, B:65:0x013e, B:66:0x0160), top: B:80:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:39:0x00b6, B:41:0x00ca, B:43:0x00d0, B:45:0x00e0, B:47:0x00e6, B:62:0x0135, B:35:0x0095, B:50:0x00f0, B:55:0x00fe, B:56:0x0114, B:57:0x0115, B:58:0x012b, B:59:0x012c, B:65:0x013e, B:66:0x0160), top: B:80:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0115 A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:39:0x00b6, B:41:0x00ca, B:43:0x00d0, B:45:0x00e0, B:47:0x00e6, B:62:0x0135, B:35:0x0095, B:50:0x00f0, B:55:0x00fe, B:56:0x0114, B:57:0x0115, B:58:0x012b, B:59:0x012c, B:65:0x013e, B:66:0x0160), top: B:80:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x012c A[Catch: all -> 0x00fc, TryCatch #2 {all -> 0x00fc, blocks: (B:39:0x00b6, B:41:0x00ca, B:43:0x00d0, B:45:0x00e0, B:47:0x00e6, B:62:0x0135, B:35:0x0095, B:50:0x00f0, B:55:0x00fe, B:56:0x0114, B:57:0x0115, B:58:0x012b, B:59:0x012c, B:65:0x013e, B:66:0x0160), top: B:80:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #2 {all -> 0x00fc, blocks: (B:39:0x00b6, B:41:0x00ca, B:43:0x00d0, B:45:0x00e0, B:47:0x00e6, B:62:0x0135, B:35:0x0095, B:50:0x00f0, B:55:0x00fe, B:56:0x0114, B:57:0x0115, B:58:0x012b, B:59:0x012c, B:65:0x013e, B:66:0x0160), top: B:80:0x00b6 }] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b4 -> B:80:0x00b6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po2.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
