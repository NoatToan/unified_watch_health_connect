package defpackage;

import com.huami.bluetooth.profile.channel.module.obsolete.ObsoleteModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorGuideActivity;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0007\u0010\u0011J\u0017\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0012J\u001b\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkn;", "Ljn;", "", "cmd", "", "cmdLen", "Lqe;", PluginDeviceInfo.FMODEL, "([BI)Lqe;", "data", "type", "", PluginDeviceInfo.FDESC, "([BI)Z", "Lgks;", "command", "Ltss;", "(Lgks;)Ltss;", "([B)Z", "byteArray", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/obsolete/ObsoleteModule;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/obsolete/ObsoleteModule;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class kn implements jn {

    @NotNull
    public static final b h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ObsoleteModule f23999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<Integer, FilterAction> f24000b;

    @NotNull
    public final Mutex c;

    @NotNull
    public final Mutex d;

    @NotNull
    public final Mutex e;

    @NotNull
    public final Mutex f;

    @NotNull
    public final FilterAction g;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Collection<FilterAction> collectionValues = kn.this.f24000b.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "callbackSet.values");
            for (FilterAction filterAction : collectionValues) {
                if (filterAction.b().invoke2(response.getData()).booleanValue()) {
                    filterAction.a().invoke2(ArraysKt___ArraysKt.sliceArray(response.getData(), new IntRange(1, response.getData().length - 1)));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lkn$b;", "", "", "CMD_ECF", "I", "CMD_GENERAL_NOTIFY", "CMD_IAS", "CMD_IAS_SUCCESS", "CMD_PIECE_DATA", "", "ECF_TIMEOUT", "J", "GENERIC_TIMEOUT", "IAS_TIMEOUT", "PIECE_DATA_TIMEOUT", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function1<byte[], Boolean> {
        public static final c t = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke2(@NotNull byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(ArraysKt___ArraysKt.first(it) == 2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)V"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function1<byte[], Unit> {
        public static final d t = new d();

        public d() {
            super(1);
        }

        public final void a(@NotNull byte[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lqe;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendECFCommand$1", f = "ObsoleteApiImpl.kt", i = {0, 1, 1, 2}, l = {214, 66, 71}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "completableDeferred", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$2", "L$0"})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super qe>, Object> {
        public final /* synthetic */ int A;
        public Object t;
        public Object u;
        public Object v;
        public int w;
        public int x;
        public final /* synthetic */ byte[] z;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
        public static final class a extends Lambda implements Function1<byte[], Boolean> {
            public static final a t = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke2(@NotNull byte[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(ArraysKt___ArraysKt.first(it) == 1);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)V"}, k = 3, mv = {1, 7, 1})
        public static final class b extends Lambda implements Function1<byte[], Unit> {
            public final /* synthetic */ CompletableDeferred<byte[]> t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CompletableDeferred<byte[]> completableDeferred) {
                super(1);
                this.t = completableDeferred;
            }

            public final void a(@NotNull byte[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.t.complete(it);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
                a(bArr);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendECFCommand$1$1$data$1", f = "ObsoleteApiImpl.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int t;
            public final /* synthetic */ CompletableDeferred<byte[]> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CompletableDeferred<byte[]> completableDeferred, Continuation<? super c> continuation) {
                super(2, continuation);
                this.u = completableDeferred;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CompletableDeferred<byte[]> completableDeferred = this.u;
                    this.t = 1;
                    obj = completableDeferred.await(this);
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
        public e(byte[] bArr, int i, Continuation<? super e> continuation) {
            super(2, continuation);
            this.z = bArr;
            this.A = i;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super qe> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return kn.this.new e(this.z, this.A, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:61:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v9, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v14, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9, types: [kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ?? r7;
            Mutex mutex;
            kn knVar;
            byte[] bArr;
            int i;
            kn knVar2;
            ?? r8;
            CompletableDeferred completableDeferred;
            kn knVar3;
            ?? r3;
            int i2;
            ConcurrentHashMap concurrentHashMap;
            Integer numBoxInt;
            qe qeVarH;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.x;
            try {
                try {
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = kn.this.c;
                        knVar = kn.this;
                        bArr = this.z;
                        i = this.A;
                        this.t = mutex;
                        this.u = knVar;
                        this.v = bArr;
                        this.w = i;
                        this.x = 1;
                        if (mutex.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i3 == 1) {
                        i = this.w;
                        bArr = (byte[]) this.v;
                        knVar = (kn) this.u;
                        Mutex mutex2 = (Mutex) this.t;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                    } else {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i2 = this.w;
                            knVar3 = (kn) this.u;
                            r3 = (Mutex) this.t;
                            try {
                                ResultKt.throwOnFailure(obj);
                                r3 = r3;
                                qeVarH = qe.h((byte[]) obj, i2);
                                concurrentHashMap = knVar3.f24000b;
                                numBoxInt = Boxing.boxInt(1);
                                r7 = r3;
                            } catch (Exception unused) {
                                concurrentHashMap = knVar3.f24000b;
                                numBoxInt = Boxing.boxInt(1);
                                r7 = r3;
                                qeVarH = null;
                            } catch (Throwable th) {
                                th = th;
                                knVar3.f24000b.remove(Boxing.boxInt(1));
                                throw th;
                            }
                            concurrentHashMap.remove(numBoxInt);
                            r7.unlock(null);
                            return qeVarH;
                        }
                        i = this.w;
                        completableDeferred = (CompletableDeferred) this.v;
                        knVar2 = (kn) this.u;
                        r7 = (Mutex) this.t;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r8 = r7;
                            if (!((Boolean) obj).booleanValue()) {
                                r8.unlock(null);
                                return null;
                            }
                            try {
                                c cVar = new c(completableDeferred, null);
                                this.t = r8;
                                this.u = knVar2;
                                this.v = null;
                                this.w = i;
                                this.x = 3;
                                obj = TimeoutKt.withTimeout(5000L, cVar, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i2 = i;
                                knVar3 = knVar2;
                                r3 = r8;
                                qeVarH = qe.h((byte[]) obj, i2);
                                concurrentHashMap = knVar3.f24000b;
                                numBoxInt = Boxing.boxInt(1);
                                r7 = r3;
                                concurrentHashMap.remove(numBoxInt);
                                r7.unlock(null);
                                return qeVarH;
                            } catch (Exception unused2) {
                                knVar3 = knVar2;
                                r3 = r8;
                                concurrentHashMap = knVar3.f24000b;
                                numBoxInt = Boxing.boxInt(1);
                                r7 = r3;
                                qeVarH = null;
                            } catch (Throwable th2) {
                                th = th2;
                                knVar3 = knVar2;
                                knVar3.f24000b.remove(Boxing.boxInt(1));
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r7.unlock(null);
                            throw th;
                        }
                    }
                    CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    knVar.f24000b.put(Boxing.boxInt(1), new FilterAction(a.t, new b(completableDeferredCompletableDeferred$default)));
                    byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{1}, bArr);
                    this.t = mutex;
                    this.u = knVar;
                    this.v = completableDeferredCompletableDeferred$default;
                    this.w = i;
                    this.x = 2;
                    Object objA = knVar.a(bArrPlus, this);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    knVar2 = knVar;
                    r8 = mutex;
                    obj = objA;
                    completableDeferred = completableDeferredCompletableDeferred$default;
                    if (!((Boolean) obj).booleanValue()) {
                        r8.unlock(null);
                        return null;
                    }
                    c cVar2 = new c(completableDeferred, null);
                    this.t = r8;
                    this.u = knVar2;
                    this.v = null;
                    this.w = i;
                    this.x = 3;
                    obj = TimeoutKt.withTimeout(5000L, cVar2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = i;
                    knVar3 = knVar2;
                    r3 = r8;
                    qeVarH = qe.h((byte[]) obj, i2);
                    concurrentHashMap = knVar3.f24000b;
                    numBoxInt = Boxing.boxInt(1);
                    r7 = r3;
                    concurrentHashMap.remove(numBoxInt);
                    r7.unlock(null);
                    return qeVarH;
                } catch (Throwable th4) {
                    r7 = mutex;
                    th = th4;
                    r7.unlock(null);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                r7 = 3;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ltss;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ltss;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendGenericCommand$1", f = "ObsoleteApiImpl.kt", i = {0, 1, 1, 1, 2, 2}, l = {214, 139, 143}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "genericResponse", "completableDeferred", "$this$withLock_u24default$iv", "genericResponse"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super tss>, Object> {
        public Object t;
        public Object u;
        public Object v;
        public int w;
        public final /* synthetic */ gks y;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
        public static final class a extends Lambda implements Function1<byte[], Boolean> {
            public static final a t = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke2(@NotNull byte[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(ArraysKt___ArraysKt.first(it) == 2);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)V"}, k = 3, mv = {1, 7, 1})
        public static final class b extends Lambda implements Function1<byte[], Unit> {
            public final /* synthetic */ CompletableDeferred<byte[]> t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CompletableDeferred<byte[]> completableDeferred) {
                super(1);
                this.t = completableDeferred;
            }

            public final void a(@NotNull byte[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.t.complete(it);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
                a(bArr);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendGenericCommand$1$1$data$1", f = "ObsoleteApiImpl.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int t;
            public final /* synthetic */ CompletableDeferred<byte[]> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CompletableDeferred<byte[]> completableDeferred, Continuation<? super c> continuation) {
                super(2, continuation);
                this.u = completableDeferred;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CompletableDeferred<byte[]> completableDeferred = this.u;
                    this.t = 1;
                    obj = completableDeferred.await(this);
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
        public f(gks gksVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.y = gksVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super tss> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return kn.this.new f(this.y, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:31:0x00bd A[Catch: all -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:15:0x0036, B:27:0x00b1, B:31:0x00bd), top: B:49:0x0036 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00d2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:39:0x00dc A[Catch: all -> 0x001f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x001f, blocks: (B:8:0x001a, B:35:0x00d4, B:39:0x00dc), top: B:51:0x001a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Mutex mutex;
            gks gksVar;
            kn knVar;
            Mutex mutex2;
            Throwable th;
            CompletableDeferred completableDeferredCompletableDeferred$default;
            tss tssVar;
            Mutex mutex3;
            byte[] bArr;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.w;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = kn.this.e;
                    gksVar = this.y;
                    knVar = kn.this;
                    this.t = mutex;
                    this.u = gksVar;
                    this.v = knVar;
                    this.w = 1;
                    if (mutex.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            tssVar = (tss) this.u;
                            mutex3 = (Mutex) this.t;
                            try {
                                ResultKt.throwOnFailure(obj);
                                bArr = (byte[]) obj;
                                if (bArr == null) {
                                    mutex3.unlock(null);
                                    return null;
                                }
                                tssVar.a(bArr);
                                mutex3.unlock(null);
                                return tssVar;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2 = mutex3;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        CompletableDeferred completableDeferred = (CompletableDeferred) this.v;
                        tss tssVar2 = (tss) this.u;
                        mutex2 = (Mutex) this.t;
                        try {
                            ResultKt.throwOnFailure(obj);
                            completableDeferredCompletableDeferred$default = completableDeferred;
                            tssVar = tssVar2;
                            if (!((Boolean) obj).booleanValue()) {
                                mutex2.unlock(null);
                                return null;
                            }
                            c cVar = new c(completableDeferredCompletableDeferred$default, null);
                            this.t = mutex2;
                            this.u = tssVar;
                            this.v = null;
                            this.w = 3;
                            obj = TimeoutKt.withTimeoutOrNull(10000L, cVar, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex3 = mutex2;
                            bArr = (byte[]) obj;
                            if (bArr == null) {
                                mutex3.unlock(null);
                                return null;
                            }
                            tssVar.a(bArr);
                            mutex3.unlock(null);
                            return tssVar;
                        } catch (Throwable th3) {
                            th = th3;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    knVar = (kn) this.v;
                    gksVar = (gks) this.u;
                    Mutex mutex4 = (Mutex) this.t;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex4;
                }
                tss tssVar3 = new tss(gksVar);
                completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                knVar.f24000b.put(Boxing.boxInt(2), new FilterAction(a.t, new b(completableDeferredCompletableDeferred$default)));
                byte[] bArrA = gksVar.a();
                Intrinsics.checkNotNullExpressionValue(bArrA, "command.bytes");
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{1}, bArrA);
                this.t = mutex;
                this.u = tssVar3;
                this.v = completableDeferredCompletableDeferred$default;
                this.w = 2;
                Object objA = knVar.a(bArrPlus, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex2 = mutex;
                obj = objA;
                tssVar = tssVar3;
                if (!((Boolean) obj).booleanValue()) {
                    mutex2.unlock(null);
                    return null;
                }
                c cVar2 = new c(completableDeferredCompletableDeferred$default, null);
                this.t = mutex2;
                this.u = tssVar;
                this.v = null;
                this.w = 3;
                obj = TimeoutKt.withTimeoutOrNull(10000L, cVar2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex3 = mutex2;
                bArr = (byte[]) obj;
                if (bArr == null) {
                    mutex3.unlock(null);
                    return null;
                }
                tssVar.a(bArr);
                mutex3.unlock(null);
                return tssVar;
            } catch (Throwable th4) {
                mutex2 = mutex;
                th = th4;
                mutex2.unlock(null);
                throw th;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendIASCommand$1", f = "ObsoleteApiImpl.kt", i = {0, 1, 1, 2}, l = {214, 161, 165}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "completableDeferred", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$1", "L$0"})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public Object t;
        public Object u;
        public Object v;
        public int w;
        public final /* synthetic */ byte[] y;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
        public static final class a extends Lambda implements Function1<byte[], Boolean> {
            public static final a t = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke2(@NotNull byte[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(ArraysKt___ArraysKt.first(it) == 3);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)V"}, k = 3, mv = {1, 7, 1})
        public static final class b extends Lambda implements Function1<byte[], Unit> {
            public final /* synthetic */ CompletableDeferred<byte[]> t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CompletableDeferred<byte[]> completableDeferred) {
                super(1);
                this.t = completableDeferred;
            }

            public final void a(@NotNull byte[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.t.complete(it);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
                a(bArr);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendIASCommand$1$1$data$1", f = "ObsoleteApiImpl.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int t;
            public final /* synthetic */ CompletableDeferred<byte[]> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CompletableDeferred<byte[]> completableDeferred, Continuation<? super c> continuation) {
                super(2, continuation);
                this.u = completableDeferred;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CompletableDeferred<byte[]> completableDeferred = this.u;
                    this.t = 1;
                    obj = completableDeferred.await(this);
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
        public g(byte[] bArr, Continuation<? super g> continuation) {
            super(2, continuation);
            this.y = bArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return kn.this.new g(this.y, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00a4 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #2 {all -> 0x003a, blocks: (B:15:0x0033, B:27:0x009c, B:29:0x00a4, B:32:0x00ac), top: B:61:0x0033 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00ac A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x003a, blocks: (B:15:0x0033, B:27:0x009c, B:29:0x00a4, B:32:0x00ac), top: B:61:0x0033 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00bf A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x0019, B:36:0x00c1, B:38:0x00c5, B:41:0x00cd, B:43:0x00d0, B:46:0x00d8, B:50:0x00e0), top: B:58:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00cd A[Catch: all -> 0x0020, TRY_ENTER, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x0019, B:36:0x00c1, B:38:0x00c5, B:41:0x00cd, B:43:0x00d0, B:46:0x00d8, B:50:0x00e0), top: B:58:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00d0 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x0019, B:36:0x00c1, B:38:0x00c5, B:41:0x00cd, B:43:0x00d0, B:46:0x00d8, B:50:0x00e0), top: B:58:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00d8 A[Catch: all -> 0x0020, TRY_ENTER, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x0019, B:36:0x00c1, B:38:0x00c5, B:41:0x00cd, B:43:0x00d0, B:46:0x00d8, B:50:0x00e0), top: B:58:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00de  */
        /* JADX WARN: Code duplicated, block: B:49:0x00df  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Mutex mutex;
            kn knVar;
            byte[] bArr;
            Mutex mutex2;
            CompletableDeferred completableDeferredCompletableDeferred$default;
            Object objA;
            Object objWithTimeoutOrNull;
            Mutex mutex3;
            byte[] bArr2;
            boolean z = true;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.w;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = kn.this.f;
                    knVar = kn.this;
                    bArr = this.y;
                    this.t = mutex;
                    this.u = knVar;
                    this.v = bArr;
                    this.w = 1;
                    if (mutex.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            CompletableDeferred completableDeferred = (CompletableDeferred) this.u;
                            mutex2 = (Mutex) this.t;
                            try {
                                ResultKt.throwOnFailure(obj);
                                completableDeferredCompletableDeferred$default = completableDeferred;
                                objA = obj;
                                if (!((Boolean) objA).booleanValue()) {
                                    Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                                    mutex2.unlock(null);
                                    return boolBoxBoolean;
                                }
                                c cVar = new c(completableDeferredCompletableDeferred$default, null);
                                this.t = mutex2;
                                this.u = null;
                                this.w = 3;
                                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, cVar, this);
                                if (objWithTimeoutOrNull == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutex3 = mutex2;
                                bArr2 = (byte[]) objWithTimeoutOrNull;
                                if (bArr2 == null) {
                                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                                    mutex3.unlock(null);
                                    return boolBoxBoolean2;
                                }
                                if (bArr2.length == 0) {
                                    Boolean boolBoxBoolean3 = Boxing.boxBoolean(false);
                                    mutex3.unlock(null);
                                    return boolBoxBoolean3;
                                }
                                if (ArraysKt___ArraysKt.first(bArr2) != 0) {
                                    z = false;
                                }
                                Boolean boolBoxBoolean4 = Boxing.boxBoolean(z);
                                mutex3.unlock(null);
                                return boolBoxBoolean4;
                            } catch (Throwable th) {
                                th = th;
                            }
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex3 = (Mutex) this.t;
                            try {
                                ResultKt.throwOnFailure(obj);
                                objWithTimeoutOrNull = obj;
                                bArr2 = (byte[]) objWithTimeoutOrNull;
                                if (bArr2 == null) {
                                    Boolean boolBoxBoolean5 = Boxing.boxBoolean(false);
                                    mutex3.unlock(null);
                                    return boolBoxBoolean5;
                                }
                                if (bArr2.length == 0) {
                                    Boolean boolBoxBoolean6 = Boxing.boxBoolean(false);
                                    mutex3.unlock(null);
                                    return boolBoxBoolean6;
                                }
                                if (ArraysKt___ArraysKt.first(bArr2) != 0) {
                                    z = false;
                                }
                                Boolean boolBoxBoolean7 = Boxing.boxBoolean(z);
                                mutex3.unlock(null);
                                return boolBoxBoolean7;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2 = mutex3;
                            }
                        }
                        mutex2.unlock(null);
                        throw th;
                    }
                    bArr = (byte[]) this.v;
                    knVar = (kn) this.u;
                    mutex = (Mutex) this.t;
                    ResultKt.throwOnFailure(obj);
                }
                completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                knVar.f24000b.put(Boxing.boxInt(3), new FilterAction(a.t, new b(completableDeferredCompletableDeferred$default)));
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{3}, bArr);
                this.t = mutex;
                this.u = completableDeferredCompletableDeferred$default;
                this.v = null;
                this.w = 2;
                objA = knVar.a(bArrPlus, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex2 = mutex;
                if (!((Boolean) objA).booleanValue()) {
                    Boolean boolBoxBoolean8 = Boxing.boxBoolean(false);
                    mutex2.unlock(null);
                    return boolBoxBoolean8;
                }
                c cVar2 = new c(completableDeferredCompletableDeferred$default, null);
                this.t = mutex2;
                this.u = null;
                this.w = 3;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, cVar2, this);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex3 = mutex2;
                bArr2 = (byte[]) objWithTimeoutOrNull;
                if (bArr2 == null) {
                    Boolean boolBoxBoolean9 = Boxing.boxBoolean(false);
                    mutex3.unlock(null);
                    return boolBoxBoolean9;
                }
                if (bArr2.length == 0) {
                    Boolean boolBoxBoolean10 = Boxing.boxBoolean(false);
                    mutex3.unlock(null);
                    return boolBoxBoolean10;
                }
                if (ArraysKt___ArraysKt.first(bArr2) != 0) {
                    z = false;
                }
                Boolean boolBoxBoolean11 = Boxing.boxBoolean(z);
                mutex3.unlock(null);
                return boolBoxBoolean11;
            } catch (Throwable th3) {
                th = th3;
                mutex2 = mutex;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendPieceData$1", f = "ObsoleteApiImpl.kt", i = {0, 1, 1, 1, 2, 2, 2, 3}, l = {214, 96, 101, 115}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "channel", "cmd", "$this$withLock_u24default$iv", "channel", "cmd", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$2", "I$0", "L$0", "L$2", "I$0", "L$0"})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public final /* synthetic */ byte[] A;
        public Object t;
        public Object u;
        public Object v;
        public int w;
        public int x;
        public final /* synthetic */ int z;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
        public static final class a extends Lambda implements Function1<byte[], Boolean> {
            public static final a t = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke2(@NotNull byte[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(ArraysKt___ArraysKt.first(it) == 0);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", PluginDeviceInfo.FMODEL, "([B)V"}, k = 3, mv = {1, 7, 1})
        public static final class b extends Lambda implements Function1<byte[], Unit> {
            public final /* synthetic */ Channel<byte[]> t;

            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendPieceData$1$1$2$1", f = "ObsoleteApiImpl.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int t;
                public final /* synthetic */ Channel<byte[]> u;
                public final /* synthetic */ byte[] v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Channel<byte[]> channel, byte[] bArr, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.u = channel;
                    this.v = bArr;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new a(this.u, this.v, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.t;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel<byte[]> channel = this.u;
                        byte[] bArr = this.v;
                        this.t = 1;
                        if (channel.send(bArr, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Channel<byte[]> channel) {
                super(1);
                this.t = channel;
            }

            public final void a(@NotNull byte[] it) throws InterruptedException {
                Intrinsics.checkNotNullParameter(it, "it");
                BuildersKt__BuildersKt.runBlocking$default(null, new a(this.t, it, null), 1, null);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) throws InterruptedException {
                a(bArr);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendPieceData$1$1$executeResultData$1", f = "ObsoleteApiImpl.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int t;
            public final /* synthetic */ Channel<byte[]> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Channel<byte[]> channel, Continuation<? super c> continuation) {
                super(2, continuation);
                this.u = channel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<byte[]> channel = this.u;
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

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.obsolete.impl.ObsoleteApiImpl$sendPieceData$1$1$response$1", f = "ObsoleteApiImpl.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int t;
            public final /* synthetic */ Channel<byte[]> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Channel<byte[]> channel, Continuation<? super d> continuation) {
                super(2, continuation);
                this.u = channel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new d(this.u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<byte[]> channel = this.u;
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
        public h(int i, byte[] bArr, Continuation<? super h> continuation) {
            super(2, continuation);
            this.z = i;
            this.A = bArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return kn.this.new h(this.z, this.A, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:118:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x0107  */
        /* JADX WARN: Code duplicated, block: B:47:0x0120 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:48:0x0121  */
        /* JADX WARN: Code duplicated, block: B:51:0x0128 A[Catch: all -> 0x0141, Exception -> 0x0144, TRY_LEAVE, TryCatch #13 {Exception -> 0x0144, all -> 0x0141, blocks: (B:18:0x0046, B:49:0x0124, B:51:0x0128, B:62:0x0147, B:64:0x014f, B:68:0x0163, B:70:0x0169, B:73:0x0171, B:75:0x0177, B:79:0x018b, B:100:0x01dd), top: B:129:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x0147 A[Catch: all -> 0x0141, Exception -> 0x0144, TRY_ENTER, TryCatch #13 {Exception -> 0x0144, all -> 0x0141, blocks: (B:18:0x0046, B:49:0x0124, B:51:0x0128, B:62:0x0147, B:64:0x014f, B:68:0x0163, B:70:0x0169, B:73:0x0171, B:75:0x0177, B:79:0x018b, B:100:0x01dd), top: B:129:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x014f A[Catch: all -> 0x0141, Exception -> 0x0144, TRY_LEAVE, TryCatch #13 {Exception -> 0x0144, all -> 0x0141, blocks: (B:18:0x0046, B:49:0x0124, B:51:0x0128, B:62:0x0147, B:64:0x014f, B:68:0x0163, B:70:0x0169, B:73:0x0171, B:75:0x0177, B:79:0x018b, B:100:0x01dd), top: B:129:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x0163 A[Catch: all -> 0x0141, Exception -> 0x0144, TRY_ENTER, TryCatch #13 {Exception -> 0x0144, all -> 0x0141, blocks: (B:18:0x0046, B:49:0x0124, B:51:0x0128, B:62:0x0147, B:64:0x014f, B:68:0x0163, B:70:0x0169, B:73:0x0171, B:75:0x0177, B:79:0x018b, B:100:0x01dd), top: B:129:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x0169 A[Catch: all -> 0x0141, Exception -> 0x0144, TryCatch #13 {Exception -> 0x0144, all -> 0x0141, blocks: (B:18:0x0046, B:49:0x0124, B:51:0x0128, B:62:0x0147, B:64:0x014f, B:68:0x0163, B:70:0x0169, B:73:0x0171, B:75:0x0177, B:79:0x018b, B:100:0x01dd), top: B:129:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x0177 A[Catch: all -> 0x0141, Exception -> 0x0144, TRY_LEAVE, TryCatch #13 {Exception -> 0x0144, all -> 0x0141, blocks: (B:18:0x0046, B:49:0x0124, B:51:0x0128, B:62:0x0147, B:64:0x014f, B:68:0x0163, B:70:0x0169, B:73:0x0171, B:75:0x0177, B:79:0x018b, B:100:0x01dd), top: B:129:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x018b A[Catch: all -> 0x0141, Exception -> 0x0144, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x0144, all -> 0x0141, blocks: (B:18:0x0046, B:49:0x0124, B:51:0x0128, B:62:0x0147, B:64:0x014f, B:68:0x0163, B:70:0x0169, B:73:0x0171, B:75:0x0177, B:79:0x018b, B:100:0x01dd), top: B:129:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x01a4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:85:0x01aa A[Catch: all -> 0x01c2, Exception -> 0x01c5, TRY_LEAVE, TryCatch #12 {Exception -> 0x01c5, all -> 0x01c2, blocks: (B:83:0x01a6, B:85:0x01aa, B:95:0x01c7), top: B:130:0x01a6 }] */
        /* JADX WARN: Code duplicated, block: B:95:0x01c7 A[Catch: all -> 0x01c2, Exception -> 0x01c5, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x01c5, all -> 0x01c2, blocks: (B:83:0x01a6, B:85:0x01aa, B:95:0x01c7), top: B:130:0x01a6 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r10v13 */
        /* JADX WARN: Type inference failed for: r10v16 */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v20 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v13, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v8, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r3v9, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ?? r10;
            ?? r11;
            Object obj2;
            kn knVar;
            byte[] bArr;
            int i;
            int i2;
            Object objA;
            Channel channel;
            kn knVar2;
            ?? r3;
            Object objWithTimeoutOrNull;
            Channel channel2;
            kn knVar3;
            ?? r9;
            byte[] bArr2;
            jls jlsVarB;
            Object objWithTimeoutOrNull2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.x;
            try {
                try {
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex = kn.this.d;
                        knVar = kn.this;
                        int i4 = this.z;
                        bArr = this.A;
                        this.t = mutex;
                        this.u = knVar;
                        this.v = bArr;
                        this.w = i4;
                        this.x = 1;
                        if (mutex.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r10 = mutex;
                        i = i4;
                    } else if (i3 == 1) {
                        i = this.w;
                        byte[] bArr3 = (byte[]) this.v;
                        kn knVar4 = (kn) this.u;
                        Mutex mutex2 = (Mutex) this.t;
                        ResultKt.throwOnFailure(obj);
                        bArr = bArr3;
                        knVar = knVar4;
                        r10 = mutex2;
                    } else {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                i2 = this.w;
                                Channel channel3 = (Channel) this.v;
                                knVar3 = (kn) this.u;
                                Mutex mutex3 = (Mutex) this.t;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    channel2 = channel3;
                                    objWithTimeoutOrNull = obj;
                                    r9 = mutex3;
                                    bArr2 = (byte[]) objWithTimeoutOrNull;
                                    try {
                                        if (bArr2 == null) {
                                            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                                            knVar3.f24000b.remove(Boxing.boxInt(0));
                                            r9.unlock(null);
                                            return boolBoxBoolean;
                                        }
                                        jlsVarB = jls.b(bArr2, wbt.h, i2);
                                        if (jlsVarB == null) {
                                            Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                                            knVar3.f24000b.remove(Boxing.boxInt(0));
                                            r9.unlock(null);
                                            return boolBoxBoolean2;
                                        }
                                        if (jlsVarB.d() && jlsVarB.e()) {
                                            if (jlsVarB.c() == 0) {
                                                Boolean boolBoxBoolean3 = Boxing.boxBoolean(true);
                                                knVar3.f24000b.remove(Boxing.boxInt(0));
                                                r9.unlock(null);
                                                return boolBoxBoolean3;
                                            }
                                            long jC = jlsVarB.c();
                                            c cVar = new c(channel2, null);
                                            this.t = r9;
                                            this.u = knVar3;
                                            this.v = null;
                                            this.x = 4;
                                            objWithTimeoutOrNull2 = TimeoutKt.withTimeoutOrNull(jC, cVar, this);
                                            if (objWithTimeoutOrNull2 == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            r3 = r9;
                                            if (((byte[]) objWithTimeoutOrNull2) == null) {
                                                Boolean boolBoxBoolean4 = Boxing.boxBoolean(false);
                                                knVar3.f24000b.remove(Boxing.boxInt(0));
                                                r3.unlock(null);
                                                return boolBoxBoolean4;
                                            }
                                            Boolean boolBoxBoolean5 = Boxing.boxBoolean(true);
                                            knVar3.f24000b.remove(Boxing.boxInt(0));
                                            r3.unlock(null);
                                            return boolBoxBoolean5;
                                        }
                                        Boolean boolBoxBoolean6 = Boxing.boxBoolean(false);
                                        knVar3.f24000b.remove(Boxing.boxInt(0));
                                        r9.unlock(null);
                                        return boolBoxBoolean6;
                                    } catch (Throwable th) {
                                        th = th;
                                        r10 = r9;
                                        obj2 = null;
                                        r11 = r10;
                                        r11.unlock(obj2);
                                        throw th;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    knVar2 = knVar3;
                                    r3 = mutex3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    knVar2 = knVar3;
                                    knVar2.f24000b.remove(Boxing.boxInt(0));
                                    throw th;
                                }
                            } else {
                                if (i3 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                knVar2 = (kn) this.u;
                                r3 = (Mutex) this.t;
                                try {
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        knVar3 = knVar2;
                                        objWithTimeoutOrNull2 = obj;
                                        r3 = r3;
                                        try {
                                            if (((byte[]) objWithTimeoutOrNull2) == null) {
                                                Boolean boolBoxBoolean7 = Boxing.boxBoolean(false);
                                                knVar3.f24000b.remove(Boxing.boxInt(0));
                                                r3.unlock(null);
                                                return boolBoxBoolean7;
                                            }
                                            Boolean boolBoxBoolean8 = Boxing.boxBoolean(true);
                                            knVar3.f24000b.remove(Boxing.boxInt(0));
                                            r3.unlock(null);
                                            return boolBoxBoolean8;
                                        } catch (Exception e2) {
                                            e = e2;
                                            knVar2 = knVar3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            knVar2 = knVar3;
                                            knVar2.f24000b.remove(Boxing.boxInt(0));
                                            throw th;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    knVar2.f24000b.remove(Boxing.boxInt(0));
                                    throw th;
                                }
                            }
                            t5t.d("ObsoleteApiImpl", "Waite piece result exception:" + e);
                            knVar2.f24000b.remove(Boxing.boxInt(0));
                            Boolean boolBoxBoolean9 = Boxing.boxBoolean(false);
                            r3.unlock(null);
                            return boolBoxBoolean9;
                        }
                        i2 = this.w;
                        channel = (Channel) this.v;
                        knVar = (kn) this.u;
                        Mutex mutex4 = (Mutex) this.t;
                        try {
                            ResultKt.throwOnFailure(obj);
                            objA = obj;
                            r10 = mutex4;
                            if (!((Boolean) objA).booleanValue()) {
                                try {
                                    Boolean boolBoxBoolean10 = Boxing.boxBoolean(false);
                                    r10.unlock(null);
                                    return boolBoxBoolean10;
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj2 = null;
                                    r11 = r10;
                                    r11.unlock(obj2);
                                    throw th;
                                }
                            }
                            try {
                                d dVar = new d(channel, null);
                                this.t = r10;
                                this.u = knVar;
                                this.v = channel;
                                this.w = i2;
                                this.x = 3;
                                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(SleepRhythmMonitorGuideActivity.INDICATOR_DELAY_DURATION, dVar, this);
                                if (objWithTimeoutOrNull == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                channel2 = channel;
                                knVar3 = knVar;
                                r9 = r10;
                                bArr2 = (byte[]) objWithTimeoutOrNull;
                                if (bArr2 == null) {
                                    Boolean boolBoxBoolean11 = Boxing.boxBoolean(false);
                                    knVar3.f24000b.remove(Boxing.boxInt(0));
                                    r9.unlock(null);
                                    return boolBoxBoolean11;
                                }
                                jlsVarB = jls.b(bArr2, wbt.h, i2);
                                if (jlsVarB == null) {
                                    Boolean boolBoxBoolean12 = Boxing.boxBoolean(false);
                                    knVar3.f24000b.remove(Boxing.boxInt(0));
                                    r9.unlock(null);
                                    return boolBoxBoolean12;
                                }
                                if (jlsVarB.d()) {
                                    if (jlsVarB.c() == 0) {
                                        Boolean boolBoxBoolean13 = Boxing.boxBoolean(true);
                                        knVar3.f24000b.remove(Boxing.boxInt(0));
                                        r9.unlock(null);
                                        return boolBoxBoolean13;
                                    }
                                    long jC2 = jlsVarB.c();
                                    c cVar2 = new c(channel2, null);
                                    this.t = r9;
                                    this.u = knVar3;
                                    this.v = null;
                                    this.x = 4;
                                    objWithTimeoutOrNull2 = TimeoutKt.withTimeoutOrNull(jC2, cVar2, this);
                                    if (objWithTimeoutOrNull2 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    r3 = r9;
                                    if (((byte[]) objWithTimeoutOrNull2) == null) {
                                        Boolean boolBoxBoolean14 = Boxing.boxBoolean(false);
                                        knVar3.f24000b.remove(Boxing.boxInt(0));
                                        r3.unlock(null);
                                        return boolBoxBoolean14;
                                    }
                                    Boolean boolBoxBoolean15 = Boxing.boxBoolean(true);
                                    knVar3.f24000b.remove(Boxing.boxInt(0));
                                    r3.unlock(null);
                                    return boolBoxBoolean15;
                                }
                                Boolean boolBoxBoolean16 = Boxing.boxBoolean(false);
                                knVar3.f24000b.remove(Boxing.boxInt(0));
                                r9.unlock(null);
                                return boolBoxBoolean16;
                            } catch (Exception e4) {
                                e = e4;
                                knVar2 = knVar;
                                r3 = r10;
                            } catch (Throwable th6) {
                                th = th6;
                                knVar2 = knVar;
                                knVar2.f24000b.remove(Boxing.boxInt(0));
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            obj2 = null;
                            r11 = mutex4;
                            r11.unlock(obj2);
                            throw th;
                        }
                    }
                    Channel channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                    knVar.f24000b.put(Boxing.boxInt(0), new FilterAction(a.t, new b(channelChannel$default)));
                    i2 = i | 192;
                    byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{0, wbt.h, (byte) i2, 0}, bArr);
                    this.t = r10;
                    this.u = knVar;
                    this.v = channelChannel$default;
                    this.w = i2;
                    this.x = 2;
                    objA = knVar.a(bArrPlus, this);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channel = channelChannel$default;
                    r10 = r10;
                    if (!((Boolean) objA).booleanValue()) {
                        Boolean boolBoxBoolean17 = Boxing.boxBoolean(false);
                        r10.unlock(null);
                        return boolBoxBoolean17;
                    }
                    d dVar2 = new d(channel, null);
                    this.t = r10;
                    this.u = knVar;
                    this.v = channel;
                    this.w = i2;
                    this.x = 3;
                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(SleepRhythmMonitorGuideActivity.INDICATOR_DELAY_DURATION, dVar2, this);
                    if (objWithTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channel2 = channel;
                    knVar3 = knVar;
                    r9 = r10;
                    bArr2 = (byte[]) objWithTimeoutOrNull;
                    if (bArr2 == null) {
                        Boolean boolBoxBoolean18 = Boxing.boxBoolean(false);
                        knVar3.f24000b.remove(Boxing.boxInt(0));
                        r9.unlock(null);
                        return boolBoxBoolean18;
                    }
                    jlsVarB = jls.b(bArr2, wbt.h, i2);
                    if (jlsVarB == null) {
                        Boolean boolBoxBoolean19 = Boxing.boxBoolean(false);
                        knVar3.f24000b.remove(Boxing.boxInt(0));
                        r9.unlock(null);
                        return boolBoxBoolean19;
                    }
                    if (jlsVarB.d()) {
                        if (jlsVarB.c() == 0) {
                            Boolean boolBoxBoolean110 = Boxing.boxBoolean(true);
                            knVar3.f24000b.remove(Boxing.boxInt(0));
                            r9.unlock(null);
                            return boolBoxBoolean110;
                        }
                        long jC3 = jlsVarB.c();
                        c cVar3 = new c(channel2, null);
                        this.t = r9;
                        this.u = knVar3;
                        this.v = null;
                        this.x = 4;
                        objWithTimeoutOrNull2 = TimeoutKt.withTimeoutOrNull(jC3, cVar3, this);
                        if (objWithTimeoutOrNull2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r3 = r9;
                        if (((byte[]) objWithTimeoutOrNull2) == null) {
                            Boolean boolBoxBoolean111 = Boxing.boxBoolean(false);
                            knVar3.f24000b.remove(Boxing.boxInt(0));
                            r3.unlock(null);
                            return boolBoxBoolean111;
                        }
                        Boolean boolBoxBoolean112 = Boxing.boxBoolean(true);
                        knVar3.f24000b.remove(Boxing.boxInt(0));
                        r3.unlock(null);
                        return boolBoxBoolean112;
                    }
                    Boolean boolBoxBoolean113 = Boxing.boxBoolean(false);
                    knVar3.f24000b.remove(Boxing.boxInt(0));
                    r9.unlock(null);
                    return boolBoxBoolean113;
                } catch (Throwable th8) {
                    th = th8;
                    obj2 = null;
                    r11 = r10;
                    r11.unlock(obj2);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                r10 = 4;
            }
        }
    }

    public kn(@NotNull ObsoleteModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.f23999a = module;
        ConcurrentHashMap<Integer, FilterAction> concurrentHashMap = new ConcurrentHashMap<>();
        this.f24000b = concurrentHashMap;
        this.c = MutexKt.Mutex$default(false, 1, null);
        this.d = MutexKt.Mutex$default(false, 1, null);
        this.e = MutexKt.Mutex$default(false, 1, null);
        this.f = MutexKt.Mutex$default(false, 1, null);
        FilterAction filterAction = new FilterAction(c.t, d.t);
        this.g = filterAction;
        module.registerListener(new a());
        concurrentHashMap.put(2, filterAction);
    }

    @Override // defpackage.jn
    public boolean b(@NotNull byte[] data, int type) {
        Intrinsics.checkNotNullParameter(data, "data");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new h(type, data, null), 1, null)).booleanValue();
    }

    @Override // defpackage.jn
    @Nullable
    public qe a(@NotNull byte[] cmd, int cmdLen) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        return (qe) BuildersKt__BuildersKt.runBlocking$default(null, new e(cmd, cmdLen, null), 1, null);
    }

    @Override // defpackage.jn
    @Nullable
    public tss a(@NotNull gks command) {
        Intrinsics.checkNotNullParameter(command, "command");
        return (tss) BuildersKt__BuildersKt.runBlocking$default(null, new f(command, null), 1, null);
    }

    @Override // defpackage.jn
    public boolean a(@NotNull byte[] command) {
        Intrinsics.checkNotNullParameter(command, "command");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new g(command, null), 1, null)).booleanValue();
    }

    public final Object a(byte[] bArr, Continuation<? super Boolean> continuation) {
        return com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(this.f23999a, bArr, 0, false, continuation, 6, null);
    }
}
