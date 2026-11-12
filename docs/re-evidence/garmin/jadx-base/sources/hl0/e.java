package hl0;

import android.app.DownloadManager;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.CheckGolfCourseDownloadStatusUseCase$saveDownloadFailed$2", f = "CheckGolfCourseDownloadStatusUseCase.kt", l = {132}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f84280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd2.h f84281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f84282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DownloadManager f84283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sd2.h hVar, a aVar, DownloadManager downloadManager, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f84281d = hVar;
        this.f84282e = aVar;
        this.f84283f = downloadManager;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f84281d, this.f84282e, this.f84283f, dVar);
        eVar.f84280c = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033 A[Catch: all -> 0x001a, InterruptedException -> 0x001d, TRY_ENTER, TryCatch #0 {InterruptedException -> 0x001d, blocks: (B:6:0x0016, B:22:0x0042, B:24:0x005a, B:19:0x0033), top: B:32:0x0016, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a A[Catch: all -> 0x001a, InterruptedException -> 0x001d, TRY_LEAVE, TryCatch #0 {InterruptedException -> 0x001d, blocks: (B:6:0x0016, B:22:0x0042, B:24:0x005a, B:19:0x0033), top: B:32:0x0016, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[PHI: r2
      0x0081: PHI (r2v5 int) = (r2v3 int), (r2v7 int) binds: [B:26:0x0060, B:23:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x003f -> B:22:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f84280c
            o53.b0 r0 = (o53.b0) r0
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r13.f84279b
            r3 = 0
            r4 = 0
            r5 = 6
            android.app.DownloadManager r6 = r13.f84283f
            r7 = 1
            sd2.h r8 = r13.f84281d
            if (r2 == 0) goto L25
            if (r2 != r7) goto L1f
            int r2 = r13.f84278a
            o13.r.b(r14)     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            goto L42
        L1a:
            r14 = move-exception
            goto L96
        L1d:
            r14 = move-exception
            goto L60
        L1f:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r14)
            return r3
        L25:
            o13.r.b(r14)
            java.lang.Integer r14 = new java.lang.Integer     // Catch: java.lang.Throwable -> L1a
            r14.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            r8.f158678w = r14     // Catch: java.lang.Throwable -> L1a
            r2 = r4
        L30:
            r14 = 5
            if (r2 >= r14) goto L83
            r13.f84280c = r0     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            r13.f84278a = r2     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            r13.f84279b = r7     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            r9 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r14 = o53.m0.b(r9, r13)     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            if (r14 != r1) goto L42
            return r1
        L42:
            rd2.l r14 = rd2.l.e()     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            java.lang.Long r9 = r8.f158679x     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            r9.getClass()     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            long r9 = r9.longValue()     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            java.lang.Integer r11 = r8.f158681z     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            r14.getClass()     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            int r14 = rd2.l.j(r9, r5, r3, r11)     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            if (r14 <= 0) goto L81
            hl0.a r14 = r13.f84282e     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            hl0.a.a(r14, r8)     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            goto L83
        L60:
            com.garmin.android.apps.connectmobile.a2 r9 = com.garmin.android.apps.connectmobile.a2.GOLF     // Catch: java.lang.Throwable -> L1a
            java.lang.String r10 = "GolfCourseDownloadViewModel"
            java.lang.String r14 = r14.getMessage()     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r11.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r12 = "saveDownloadFailed: "
            r11.append(r12)     // Catch: java.lang.Throwable -> L1a
            r11.append(r14)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r14 = r11.toString()     // Catch: java.lang.Throwable -> L1a
            com.garmin.android.apps.connectmobile.i2$a r11 = com.garmin.android.apps.connectmobile.i2.f36769a     // Catch: java.lang.Throwable -> L1a
            r11.getClass()     // Catch: java.lang.Throwable -> L1a
            com.garmin.android.apps.connectmobile.i2.a.f(r9, r10, r14)     // Catch: java.lang.Throwable -> L1a
        L81:
            int r2 = r2 + r7
            goto L30
        L83:
            java.lang.Long r14 = r8.f158679x
            r14.getClass()
            long r0 = r14.longValue()
            long[] r14 = new long[r7]
            r14[r4] = r0
            r6.remove(r14)
            kotlin.Unit r14 = p005kotlin.Unit.INSTANCE
            return r14
        L96:
            java.lang.Long r0 = r8.f158679x
            r0.getClass()
            long r0 = r0.longValue()
            long[] r2 = new long[r7]
            r2[r4] = r0
            r6.remove(r2)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: hl0.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
