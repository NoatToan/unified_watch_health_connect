package us2;

import com.garmin.gfdi.core.ProtocolTimeoutException;
import e23.p;
import java.util.Timer;
import java.util.TimerTask;
import o53.b0;
import o53.l1;
import o53.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)[B"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.core.SendMessageTask$write$2", f = "SendMessageTask.kt", l = {83, 87, 92}, m = "invokeSuspend")
public final class i extends v13.i implements p<b0, t13.d<? super byte[]>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f172513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f172514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f172515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f172516d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"us2/i$a", "Ljava/util/TimerTask;", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0<String> f172517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f172518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Timer f172519c;

        public a(r0<String> r0Var, j jVar, Timer timer) {
            this.f172517a = r0Var;
            this.f172518b = jVar;
            this.f172519c = timer;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            String str = this.f172517a.f105810a;
            j jVar = this.f172518b;
            String str2 = "Failed to send " + ((Object) str) + " within timeout " + jVar.f172528g;
            jVar.f172529h.warn(str2);
            this.f172519c.cancel();
            ProtocolTimeoutException protocolTimeoutException = new ProtocolTimeoutException(str2, null, 2, null);
            l1 l1Var = jVar.f172531j.get();
            if (l1Var != null) {
                l1Var.c(gl1.d.a("SendMessageTask canceled", protocolTimeoutException));
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)[B"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.core.SendMessageTask$write$2$response$1", f = "SendMessageTask.kt", l = {88}, m = "invokeSuspend")
    public static final class b extends v13.i implements p<b0, t13.d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f172520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<r<byte[]>> f172521b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r0<r<byte[]>> r0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f172521b = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f172521b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super byte[]> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f172520a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            r<byte[]> rVar = this.f172521b.f105810a;
            this.f172520a = 1;
            Object objAwait = rVar.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f172516d = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f172516d, dVar);
        iVar.f172515c = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super byte[]> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x012b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0134  */
    /* JADX WARN: Code duplicated, block: B:41:0x013a  */
    /* JADX WARN: Code duplicated, block: B:45:0x015c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0161  */
    /* JADX WARN: Code duplicated, block: B:51:0x0166  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173 A[Catch: TimeoutCancellationException -> 0x018d, TryCatch #1 {TimeoutCancellationException -> 0x018d, blocks: (B:63:0x01a5, B:52:0x016b, B:54:0x0173, B:57:0x0185, B:60:0x0194), top: B:84:0x01a5 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0184  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185 A[Catch: TimeoutCancellationException -> 0x018d, PHI: r2 r3 r11 r16
      0x0185: PHI (r2v13 ??) = (r2v21 ??), (r2v22 ??) binds: [B:55:0x0182, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r3v30 java.lang.Object) = (r3v37 java.lang.Object), (r3v38 java.lang.Object) binds: [B:55:0x0182, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r11v8 kotlin.jvm.internal.r0) = (r11v9 kotlin.jvm.internal.r0), (r11v13 kotlin.jvm.internal.r0) binds: [B:55:0x0182, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r16v4 long) = (r16v5 long), (r16v8 long) binds: [B:55:0x0182, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {TimeoutCancellationException -> 0x018d, blocks: (B:63:0x01a5, B:52:0x016b, B:54:0x0173, B:57:0x0185, B:60:0x0194), top: B:84:0x01a5 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0024: MOVE (r16 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:10:0x0024 */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r15v2, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object, o53.s] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0166 -> B:52:0x016b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us2.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
