package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJR\u0010\u000f\u001a\u00020\r\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0002R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u001d"}, d2 = {"Lwb;", "", "T", "", "type", "Ljava/util/Calendar;", "startTime", "Lbi;", "receiver", "", "Lci;", "headerFilters", "Lkotlin/Function1;", "Lmb;", "errorCodeTrans", PluginDeviceInfo.FMODEL, "", PluginDeviceInfo.FDESC, "errorCode", "Li6;", "dataTransferSniffApi$delegate", "Lkotlin/Lazy;", "()Li6;", "dataTransferSniffApi", "Lkc;", "mProfile", "mVersion", "<init>", "(Lkc;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class wb {

    @NotNull
    public static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kc f37789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37790b;

    @NotNull
    public AtomicBoolean c;

    @NotNull
    public final Lazy d;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lwb$a;", "", "", "CRC_DATA_LENGTH", "I", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li6;", PluginDeviceInfo.FMODEL, "()Li6;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<i6> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i6 invoke() {
            return new i6();
        }
    }

    /* JADX INFO: renamed from: wb$c, reason: from Kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lmb;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.GdspDataSyncUnit$sync$1", f = "GdspDataSyncUnit.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3}, l = {82, 91, 98, 118}, m = "invokeSuspend", n = {"code", "startResult", "header", "dataCrc32", "compress", "totalSize", "code", "startResult", "header", "dataCrc32", "compress", "totalSize", "code", "startResult", "header", "dataCrc32", "totalSize", "code", "dataCrc32"}, s = {"L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1"})
    public static final class T extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mb>, Object> {
        public Object A;
        public int B;
        public int C;
        public /* synthetic */ Object D;
        public final /* synthetic */ bi<T> E;
        public final /* synthetic */ wb F;
        public final /* synthetic */ Calendar G;
        public final /* synthetic */ int H;
        public final /* synthetic */ List<ci> I;
        public final /* synthetic */ Function1<mb, mb> J;
        public Object t;
        public Object u;
        public Object v;
        public Object w;
        public Object x;
        public Object y;
        public Object z;

        /* JADX INFO: renamed from: wb$c$a, reason: from Kotlin metadata and collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lqe;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.gdsp.common.GdspDataSyncUnit$sync$1$resultCode$1$startResponse$1", f = "GdspDataSyncUnit.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
        public static final class C1132a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super qe>, Object> {
            public int t;
            public final /* synthetic */ Ref.ObjectRef<Channel<qe>> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1132a(Ref.ObjectRef<Channel<qe>> objectRef, Continuation<? super C1132a> continuation) {
                super(2, continuation);
                this.u = objectRef;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super qe> continuation) {
                return ((C1132a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C1132a(this.u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<qe> channel = this.u.element;
                    Intrinsics.checkNotNull(channel);
                    this.t = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public T(bi<T> biVar, wb wbVar, Calendar calendar, int i, List<? extends ci> list, Function1<? super mb, ? extends mb> function1, Continuation<? super T> continuation) {
            super(2, continuation);
            this.E = biVar;
            this.F = wbVar;
            this.G = calendar;
            this.H = i;
            this.I = list;
            this.J = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super mb> continuation) {
            return ((T) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            T t = new T(this.E, this.F, this.G, this.H, this.I, this.J, continuation);
            t.D = obj;
            return t;
        }

        /* JADX WARN: Code duplicated, block: B:104:0x029a A[Catch: all -> 0x01fb, TryCatch #2 {all -> 0x01fb, blocks: (B:119:0x02de, B:121:0x02e2, B:124:0x02eb, B:126:0x02f1, B:128:0x02f5, B:99:0x0281, B:102:0x0296, B:104:0x029a, B:106:0x029e, B:109:0x02a4, B:110:0x02a6, B:112:0x02b0, B:114:0x02b4, B:116:0x02bb, B:76:0x01f2, B:83:0x0204, B:90:0x0238, B:92:0x0243), top: B:177:0x01f2 }] */
        /* JADX WARN: Code duplicated, block: B:106:0x029e A[Catch: all -> 0x01fb, TryCatch #2 {all -> 0x01fb, blocks: (B:119:0x02de, B:121:0x02e2, B:124:0x02eb, B:126:0x02f1, B:128:0x02f5, B:99:0x0281, B:102:0x0296, B:104:0x029a, B:106:0x029e, B:109:0x02a4, B:110:0x02a6, B:112:0x02b0, B:114:0x02b4, B:116:0x02bb, B:76:0x01f2, B:83:0x0204, B:90:0x0238, B:92:0x0243), top: B:177:0x01f2 }] */
        /* JADX WARN: Code duplicated, block: B:107:0x02a1  */
        /* JADX WARN: Code duplicated, block: B:109:0x02a4 A[Catch: all -> 0x01fb, TryCatch #2 {all -> 0x01fb, blocks: (B:119:0x02de, B:121:0x02e2, B:124:0x02eb, B:126:0x02f1, B:128:0x02f5, B:99:0x0281, B:102:0x0296, B:104:0x029a, B:106:0x029e, B:109:0x02a4, B:110:0x02a6, B:112:0x02b0, B:114:0x02b4, B:116:0x02bb, B:76:0x01f2, B:83:0x0204, B:90:0x0238, B:92:0x0243), top: B:177:0x01f2 }] */
        /* JADX WARN: Code duplicated, block: B:112:0x02b0 A[Catch: all -> 0x01fb, TryCatch #2 {all -> 0x01fb, blocks: (B:119:0x02de, B:121:0x02e2, B:124:0x02eb, B:126:0x02f1, B:128:0x02f5, B:99:0x0281, B:102:0x0296, B:104:0x029a, B:106:0x029e, B:109:0x02a4, B:110:0x02a6, B:112:0x02b0, B:114:0x02b4, B:116:0x02bb, B:76:0x01f2, B:83:0x0204, B:90:0x0238, B:92:0x0243), top: B:177:0x01f2 }] */
        /* JADX WARN: Code duplicated, block: B:114:0x02b4 A[Catch: all -> 0x01fb, TryCatch #2 {all -> 0x01fb, blocks: (B:119:0x02de, B:121:0x02e2, B:124:0x02eb, B:126:0x02f1, B:128:0x02f5, B:99:0x0281, B:102:0x0296, B:104:0x029a, B:106:0x029e, B:109:0x02a4, B:110:0x02a6, B:112:0x02b0, B:114:0x02b4, B:116:0x02bb, B:76:0x01f2, B:83:0x0204, B:90:0x0238, B:92:0x0243), top: B:177:0x01f2 }] */
        /* JADX WARN: Code duplicated, block: B:141:0x0340  */
        /* JADX WARN: Code duplicated, block: B:142:0x0341  */
        /* JADX WARN: Code duplicated, block: B:144:0x0344 A[Catch: all -> 0x0330, TryCatch #0 {all -> 0x0330, blocks: (B:130:0x030d, B:132:0x032c, B:139:0x033c, B:144:0x0344, B:145:0x0346, B:136:0x0332, B:137:0x0337), top: B:173:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:151:0x035c  */
        /* JADX WARN: Code duplicated, block: B:154:0x038f  */
        /* JADX WARN: Code duplicated, block: B:155:0x0391  */
        /* JADX WARN: Code duplicated, block: B:157:0x0394  */
        /* JADX WARN: Code duplicated, block: B:159:0x039a  */
        /* JADX WARN: Code duplicated, block: B:161:0x03a2  */
        /* JADX WARN: Code duplicated, block: B:163:0x03a8  */
        /* JADX WARN: Code duplicated, block: B:166:0x03b9  */
        /* JADX WARN: Code duplicated, block: B:168:0x03c1  */
        /* JADX WARN: Code duplicated, block: B:169:0x03c5  */
        /* JADX WARN: Code duplicated, block: B:171:0x03cd  */
        /* JADX WARN: Code duplicated, block: B:29:0x00fb A[Catch: all -> 0x002e, TryCatch #3 {all -> 0x002e, blocks: (B:9:0x0024, B:16:0x0054, B:19:0x0082, B:22:0x00ad, B:25:0x00d6, B:27:0x00ef, B:30:0x00fd, B:32:0x0101, B:34:0x0108, B:36:0x0112, B:38:0x0117, B:39:0x011b, B:41:0x0121, B:43:0x013b, B:45:0x0144, B:47:0x0156, B:48:0x015e, B:50:0x0162, B:52:0x0166, B:54:0x0177, B:56:0x017d, B:29:0x00fb), top: B:173:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0165  */
        /* JADX WARN: Code duplicated, block: B:63:0x01b9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x01c2 A[Catch: all -> 0x022a, TryCatch #1 {all -> 0x022a, blocks: (B:61:0x019d, B:64:0x01ba, B:66:0x01c2, B:69:0x01d7, B:71:0x01dd, B:73:0x01e3, B:60:0x018c), top: B:175:0x018c }] */
        /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:69:0x01d7 A[Catch: all -> 0x022a, TryCatch #1 {all -> 0x022a, blocks: (B:61:0x019d, B:64:0x01ba, B:66:0x01c2, B:69:0x01d7, B:71:0x01dd, B:73:0x01e3, B:60:0x018c), top: B:175:0x018c }] */
        /* JADX WARN: Code duplicated, block: B:71:0x01dd A[Catch: all -> 0x022a, TryCatch #1 {all -> 0x022a, blocks: (B:61:0x019d, B:64:0x01ba, B:66:0x01c2, B:69:0x01d7, B:71:0x01dd, B:73:0x01e3, B:60:0x018c), top: B:175:0x018c }] */
        /* JADX WARN: Code duplicated, block: B:73:0x01e3 A[Catch: all -> 0x022a, TRY_LEAVE, TryCatch #1 {all -> 0x022a, blocks: (B:61:0x019d, B:64:0x01ba, B:66:0x01c2, B:69:0x01d7, B:71:0x01dd, B:73:0x01e3, B:60:0x018c), top: B:175:0x018c }] */
        /* JADX WARN: Code duplicated, block: B:75:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:78:0x01f8  */
        /* JADX WARN: Code duplicated, block: B:79:0x01f9  */
        /* JADX WARN: Code duplicated, block: B:82:0x0200  */
        /* JADX WARN: Code duplicated, block: B:85:0x0229 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:88:0x022e  */
        /* JADX WARN: Code duplicated, block: B:89:0x0232  */
        /* JADX WARN: Code duplicated, block: B:90:0x0238 A[Catch: all -> 0x01fb, TryCatch #2 {all -> 0x01fb, blocks: (B:119:0x02de, B:121:0x02e2, B:124:0x02eb, B:126:0x02f1, B:128:0x02f5, B:99:0x0281, B:102:0x0296, B:104:0x029a, B:106:0x029e, B:109:0x02a4, B:110:0x02a6, B:112:0x02b0, B:114:0x02b4, B:116:0x02bb, B:76:0x01f2, B:83:0x0204, B:90:0x0238, B:92:0x0243), top: B:177:0x01f2 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x0243 A[Catch: all -> 0x01fb, TryCatch #2 {all -> 0x01fb, blocks: (B:119:0x02de, B:121:0x02e2, B:124:0x02eb, B:126:0x02f1, B:128:0x02f5, B:99:0x0281, B:102:0x0296, B:104:0x029a, B:106:0x029e, B:109:0x02a4, B:110:0x02a6, B:112:0x02b0, B:114:0x02b4, B:116:0x02bb, B:76:0x01f2, B:83:0x0204, B:90:0x0238, B:92:0x0243), top: B:177:0x01f2 }] */
        /* JADX WARN: Code duplicated, block: B:94:0x0270 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:95:0x0271  */
        /* JADX WARN: Code duplicated, block: B:97:0x027e  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v20, types: [T, kotlinx.coroutines.channels.Channel] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v29 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v30 */
        /* JADX WARN: Type inference failed for: r6v31 */
        /* JADX WARN: Type inference failed for: r6v32 */
        /* JADX WARN: Type inference failed for: r6v33 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v2, types: [T, com.huami.core.device.feature.compress.impl.ZipCompress] */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 985
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wb.T.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public wb(@NotNull kc mProfile, int i) {
        Intrinsics.checkNotNullParameter(mProfile, "mProfile");
        this.f37789a = mProfile;
        this.f37790b = i;
        this.c = new AtomicBoolean(false);
        this.d = LazyKt__LazyJVMKt.lazy(b.t);
    }

    public final void b() {
        t5t.d("GdspDataSyncUnit", "user cancel data sync");
        this.c.set(true);
        this.f37789a.b();
    }

    public final i6 a() {
        return (i6) this.d.getValue();
    }

    public final mb a(mb errorCode) {
        if (errorCode == mb.SUCCESS) {
            errorCode = null;
        }
        return errorCode == null ? mb.CANCEL : errorCode;
    }

    @NotNull
    public final <T> mb a(int type, @NotNull Calendar startTime, @NotNull bi<T> receiver, @NotNull List<? extends ci> headerFilters, @Nullable Function1<? super mb, ? extends mb> errorCodeTrans) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(headerFilters, "headerFilters");
        return (mb) BuildersKt.runBlocking(ic.t.getCoroutineContext(), new T(receiver, this, startTime, type, headerFilters, errorCodeTrans, null));
    }
}
