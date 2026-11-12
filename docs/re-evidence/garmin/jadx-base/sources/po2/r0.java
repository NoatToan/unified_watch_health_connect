package po2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.TransitCardOperationFlowBuilder$launchJobPolling$1", f = "TransitCardOperationFlowBuilder.kt", l = {202, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 213, 228, 233}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f139366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fo2.n f139367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f139368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f139369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0<Object> f139370e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139371a;

        static {
            int[] iArr = new int[fo2.o.values().length];
            try {
                iArr[fo2.o.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fo2.o.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fo2.o.PROCESSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fo2.o.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f139371a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(String str, k0<Object> k0Var, t13.d<? super r0> dVar) {
        super(2, dVar);
        this.f139369d = str;
        this.f139370e = k0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r0(this.f139369d, this.f139370e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x001e, B:12:0x002a, B:45:0x00ef, B:55:0x010e, B:30:0x007a, B:32:0x007e, B:35:0x008e, B:38:0x00a3, B:40:0x00bc, B:41:0x00c1, B:63:0x0159, B:52:0x0107, B:53:0x010c, B:56:0x0113, B:57:0x0127, B:58:0x0128, B:60:0x012e, B:62:0x0158, B:61:0x0143, B:15:0x0031, B:18:0x0039, B:19:0x003d, B:25:0x005b, B:27:0x0073, B:66:0x0167, B:67:0x0178, B:22:0x0046), top: B:76:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[Catch: all -> 0x0023, PHI: r0
      0x008e: PHI (r0v10 java.lang.String) = (r0v6 java.lang.String), (r0v11 java.lang.String) binds: [B:18:0x0039, B:33:0x008a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0023, blocks: (B:7:0x001e, B:12:0x002a, B:45:0x00ef, B:55:0x010e, B:30:0x007a, B:32:0x007e, B:35:0x008e, B:38:0x00a3, B:40:0x00bc, B:41:0x00c1, B:63:0x0159, B:52:0x0107, B:53:0x010c, B:56:0x0113, B:57:0x0127, B:58:0x0128, B:60:0x012e, B:62:0x0158, B:61:0x0143, B:15:0x0031, B:18:0x0039, B:19:0x003d, B:25:0x005b, B:27:0x0073, B:66:0x0167, B:67:0x0178, B:22:0x0046), top: B:76:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[Catch: all -> 0x0023, PHI: r0 r3
      0x00a3: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v10 java.lang.String) binds: [B:16:0x0034, B:36:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r3v12 java.lang.Object) = (r3v11 java.lang.Object), (r3v19 java.lang.Object) binds: [B:16:0x0034, B:36:0x009f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0023, blocks: (B:7:0x001e, B:12:0x002a, B:45:0x00ef, B:55:0x010e, B:30:0x007a, B:32:0x007e, B:35:0x008e, B:38:0x00a3, B:40:0x00bc, B:41:0x00c1, B:63:0x0159, B:52:0x0107, B:53:0x010c, B:56:0x0113, B:57:0x0127, B:58:0x0128, B:60:0x012e, B:62:0x0158, B:61:0x0143, B:15:0x0031, B:18:0x0039, B:19:0x003d, B:25:0x005b, B:27:0x0073, B:66:0x0167, B:67:0x0178, B:22:0x0046), top: B:76:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x001e, B:12:0x002a, B:45:0x00ef, B:55:0x010e, B:30:0x007a, B:32:0x007e, B:35:0x008e, B:38:0x00a3, B:40:0x00bc, B:41:0x00c1, B:63:0x0159, B:52:0x0107, B:53:0x010c, B:56:0x0113, B:57:0x0127, B:58:0x0128, B:60:0x012e, B:62:0x0158, B:61:0x0143, B:15:0x0031, B:18:0x0039, B:19:0x003d, B:25:0x005b, B:27:0x0073, B:66:0x0167, B:67:0x0178, B:22:0x0046), top: B:76:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:50:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x0107 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x001e, B:12:0x002a, B:45:0x00ef, B:55:0x010e, B:30:0x007a, B:32:0x007e, B:35:0x008e, B:38:0x00a3, B:40:0x00bc, B:41:0x00c1, B:63:0x0159, B:52:0x0107, B:53:0x010c, B:56:0x0113, B:57:0x0127, B:58:0x0128, B:60:0x012e, B:62:0x0158, B:61:0x0143, B:15:0x0031, B:18:0x0039, B:19:0x003d, B:25:0x005b, B:27:0x0073, B:66:0x0167, B:67:0x0178, B:22:0x0046), top: B:76:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0113 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x001e, B:12:0x002a, B:45:0x00ef, B:55:0x010e, B:30:0x007a, B:32:0x007e, B:35:0x008e, B:38:0x00a3, B:40:0x00bc, B:41:0x00c1, B:63:0x0159, B:52:0x0107, B:53:0x010c, B:56:0x0113, B:57:0x0127, B:58:0x0128, B:60:0x012e, B:62:0x0158, B:61:0x0143, B:15:0x0031, B:18:0x0039, B:19:0x003d, B:25:0x005b, B:27:0x0073, B:66:0x0167, B:67:0x0178, B:22:0x0046), top: B:76:0x000f }] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ea -> B:45:0x00ef). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po2.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
