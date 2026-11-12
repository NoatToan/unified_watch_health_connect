package hl0;

import android.app.DownloadManager;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.CheckGolfCourseDownloadStatusUseCase$saveCourseToDatabase$2", f = "CheckGolfCourseDownloadStatusUseCase.kt", l = {101}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f84270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f84271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f84274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sd2.h f84275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f84276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ DownloadManager f84277h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sd2.h hVar, a aVar, DownloadManager downloadManager, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f84275f = hVar;
        this.f84276g = aVar;
        this.f84277h = downloadManager;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f84275f, this.f84276g, this.f84277h, dVar);
        dVar2.f84274e = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b A[Catch: all -> 0x0022, InterruptedException -> 0x0027, TRY_ENTER, TryCatch #1 {all -> 0x0022, blocks: (B:6:0x001e, B:24:0x006e, B:21:0x005b, B:15:0x0034, B:17:0x004c, B:18:0x0054), top: B:42:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f A[Catch: all -> 0x0093, InterruptedException -> 0x0095, TRY_LEAVE, TryCatch #0 {InterruptedException -> 0x0095, blocks: (B:26:0x0084, B:28:0x008f), top: B:40:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7 A[PHI: r4 r11 r12
      0x00b7: PHI (r4v8 int) = (r4v6 int), (r4v10 int) binds: [B:33:0x0096, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r11v6 java.lang.Integer) = (r11v4 java.lang.Integer), (r11v7 java.lang.Integer) binds: [B:33:0x0096, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r12v4 byte[]) = (r12v2 byte[]), (r12v5 byte[]) binds: [B:33:0x0096, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006b -> B:24:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hl0.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
