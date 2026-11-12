package jx2;

import java.util.Iterator;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDDeviceManager$onDeviceReadyForCommunication$2", f = "SaMDDeviceManager.kt", l = {246, 260}, m = "invokeSuspend")
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m0 f101580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f101581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f101582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f101583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kx2.a f101584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f101585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f101586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f101587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f101588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f101589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f101590k;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101591a;

        static {
            int[] iArr = new int[kx2.a.values().length];
            try {
                iArr[kx2.a.ECG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f101591a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, String str, long j8, String str2, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f101587h = rVar;
        this.f101588i = str;
        this.f101589j = j8;
        this.f101590k = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f101587h, this.f101588i, this.f101589j, this.f101590k, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x0083 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:13:0x002f, B:28:0x00a2, B:23:0x0079, B:25:0x0083), top: B:55:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2 A[Catch: Exception -> 0x0034, PHI: r4 r7 r10 r12 r13 r14 r15
      0x00a2: PHI (r4v15 kotlin.jvm.internal.m0) = (r4v13 kotlin.jvm.internal.m0), (r4v16 kotlin.jvm.internal.m0) binds: [B:26:0x009f, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r7v6 boolean) = (r7v4 boolean), (r7v7 boolean) binds: [B:26:0x009f, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r10v5 long) = (r10v3 long), (r10v6 long) binds: [B:26:0x009f, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r12v4 kx2.a) = (r12v3 kx2.a), (r12v5 kx2.a) binds: [B:26:0x009f, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r13v4 java.util.Iterator) = (r13v2 java.util.Iterator), (r13v5 java.util.Iterator) binds: [B:26:0x009f, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r14v4 java.lang.String) = (r14v2 java.lang.String), (r14v5 java.lang.String) binds: [B:26:0x009f, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r15v4 jx2.r) = (r15v2 jx2.r), (r15v5 jx2.r) binds: [B:26:0x009f, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x0034, blocks: (B:13:0x002f, B:28:0x00a2, B:23:0x0079, B:25:0x0083), top: B:55:0x002f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0081 -> B:31:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009f -> B:28:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jx2.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
