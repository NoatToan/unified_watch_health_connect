package defpackage;

import com.huami.bluetooth.profile.channel.module.assistant.response.Failure;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.binary.BinaryDecoder;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0010B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tJ#\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ)\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\tJ#\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\tJ\u001b\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\tR\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Ld0;", "Lees;", "", "Lkotlinx/coroutines/CoroutineScope;", "", "data", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", PluginDeviceInfo.FICONOFF, "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Success;", "", PluginDeviceInfo.FICONON, PluginDeviceInfo.FBLUETOOTHPAIR, "", "Lz;", PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONOFFLINE, "", PluginDeviceInfo.FMODEL, "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class d0 implements ees, CoroutineScope {

    @NotNull
    public static final b y = new b(null);

    @NotNull
    public final com.huami.bluetooth.profile.channel.module.a t;

    @NotNull
    public final HashMap<Byte, Channel<Response<Integer>>> u;

    @NotNull
    public final HashMap<Byte, Channel<Response<Boolean>>> v;

    @NotNull
    public final HashMap<Byte, Channel<Response<List<AppCardsResponse>>>> w;

    @Nullable
    public e6 x;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl$1", f = "AssistantV1Impl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<byte[], Continuation<? super Unit>, Object> {
        public int t;
        public /* synthetic */ Object u;

        /* JADX INFO: renamed from: d0$a$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl$1$1", f = "AssistantV1Impl.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0908a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ d0 u;
            public final /* synthetic */ byte[] v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0908a(d0 d0Var, byte[] bArr, Continuation<? super C0908a> continuation) {
                super(2, continuation);
                this.u = d0Var;
                this.v = bArr;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0908a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0908a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        d0 d0Var = this.u;
                        byte[] bArr = this.v;
                        this.t = 1;
                        if (d0Var.a(bArr, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    t5t.f("AssistantApi", "error", th);
                }
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull byte[] bArr, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(bArr, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = d0.this.new a(continuation);
            aVar.u = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            byte[] bArr = (byte[]) this.u;
            if (bArr.length == 0) {
                return Unit.INSTANCE;
            }
            d0 d0Var = d0.this;
            BuildersKt__Builders_commonKt.launch$default(d0Var, null, null, new C0908a(d0Var, bArr, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ld0$b;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {1}, l = {155, 170}, m = "onQueryCardSettingBack", n = {com.xiaomi.onetrack.api.b.I}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return d0.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {1}, l = {107, 116}, m = "onQueryDisplayMattersSettingsBack", n = {com.xiaomi.onetrack.api.b.I}, s = {"L$0"})
    public static final class d extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return d0.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {1}, l = {80, 89}, m = "onQueryVersionBack", n = {"result"}, s = {"L$0"})
    public static final class e extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return d0.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {1}, l = {SportReportBaseParser.ReportType.maxWaterTemperature, SportReportBaseParser.ReportType.oxygenConcentration}, m = "onUpdateCardSettingBack", n = {com.xiaomi.onetrack.api.b.I}, s = {"L$0"})
    public static final class f extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return d0.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {1}, l = {133, 139}, m = "onUpdateDisplayMattersBack", n = {com.xiaomi.onetrack.api.b.I}, s = {"L$0"})
    public static final class g extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return d0.this.f(null, this);
        }
    }

    public d0(@NotNull com.huami.bluetooth.profile.channel.module.a module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.t = module;
        module.registerMessageCallback(new a(null));
        this.u = new HashMap<>();
        this.v = new HashMap<>();
        this.w = new HashMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object b(@NotNull byte[] bArr, @NotNull Continuation<? super Response<List<AppCardsResponse>>> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.w = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar.w;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return null;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Success success = (Success) cVar.t;
            ResultKt.throwOnFailure(obj);
            return success;
        }
        ResultKt.throwOnFailure(obj);
        if (bArr.length < 2) {
            Channel<Response<List<AppCardsResponse>>> channel = this.w.get(Boxing.boxByte((byte) 7));
            if (channel == null) {
                return null;
            }
            Failure failureA = Response.INSTANCE.a("数据错误", 7);
            cVar.w = 1;
            if (channel.send(failureA, cVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return null;
        }
        int iA = c3.a(bArr, 1, 1);
        ArrayList arrayList = new ArrayList();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 2;
        for (int i3 = 0; i3 < iA; i3++) {
            wdt wdtVar = new wdt();
            intRef.element = BinaryDecoder.decode(wdtVar, bArr, intRef.element);
            arrayList.add(wdtVar);
        }
        Response.Companion companion = Response.INSTANCE;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((wdt) it.next()).a());
        }
        Success successA = companion.a(arrayList2);
        Channel<Response<List<AppCardsResponse>>> channel2 = this.w.get(Boxing.boxByte((byte) 7));
        if (channel2 == null) {
            return successA;
        }
        cVar.t = successA;
        cVar.w = 2;
        return channel2.send(successA, cVar) == coroutine_suspended ? coroutine_suspended : successA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object c(@NotNull byte[] bArr, @NotNull Continuation<? super Success<Boolean>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.w = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dVar.w;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return null;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Success success = (Success) dVar.t;
            ResultKt.throwOnFailure(obj);
            return success;
        }
        ResultKt.throwOnFailure(obj);
        if (bArr.length >= 2) {
            Success successA = Response.INSTANCE.a(Boxing.boxBoolean(c3.a(bArr[1])));
            Channel<Response<Boolean>> channel = this.v.get(Boxing.boxByte((byte) 3));
            if (channel == null) {
                return successA;
            }
            dVar.t = successA;
            dVar.w = 2;
            return channel.send(successA, dVar) == coroutine_suspended ? coroutine_suspended : successA;
        }
        Channel<Response<Boolean>> channel2 = this.v.get(Boxing.boxByte((byte) 3));
        if (channel2 == null) {
            return null;
        }
        Failure failureA = Response.INSTANCE.a("Return settings命令 检查失败", 3);
        dVar.w = 1;
        if (channel2.send(failureA, dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object d(@NotNull byte[] bArr, @NotNull Continuation<? super Response<Integer>> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.w = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = eVar.w;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return null;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Success success = (Success) eVar.t;
            ResultKt.throwOnFailure(obj);
            return success;
        }
        ResultKt.throwOnFailure(obj);
        if (bArr.length >= 2) {
            Success successA = Response.INSTANCE.a(Boxing.boxInt(tet.d(bArr, 1, 1)));
            Channel<Response<Integer>> channel = this.u.get(Boxing.boxByte((byte) 1));
            if (channel == null) {
                return successA;
            }
            eVar.t = successA;
            eVar.w = 2;
            return channel.send(successA, eVar) == coroutine_suspended ? coroutine_suspended : successA;
        }
        Channel<Response<Boolean>> channel2 = this.v.get(Boxing.boxByte((byte) 1));
        if (channel2 == null) {
            return null;
        }
        Failure failureA = Response.INSTANCE.a("Return version命令 检查失败", 1);
        eVar.w = 1;
        if (channel2.send(failureA, eVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object e(@NotNull byte[] bArr, @NotNull Continuation<? super Response<Boolean>> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i = fVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.w = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = fVar.w;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return null;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Success success = (Success) fVar.t;
            ResultKt.throwOnFailure(obj);
            return success;
        }
        ResultKt.throwOnFailure(obj);
        if (bArr.length >= 2) {
            Success successA = Response.INSTANCE.a(Boxing.boxBoolean(c3.a(bArr[1])));
            Channel<Response<Boolean>> channel = this.v.get(Boxing.boxByte((byte) 9));
            if (channel == null) {
                return successA;
            }
            fVar.t = successA;
            fVar.w = 2;
            return channel.send(successA, fVar) == coroutine_suspended ? coroutine_suspended : successA;
        }
        Channel<Response<List<AppCardsResponse>>> channel2 = this.w.get(Boxing.boxByte((byte) 9));
        if (channel2 == null) {
            return null;
        }
        Failure failureA = Response.INSTANCE.a("数据错误", 9);
        fVar.w = 1;
        if (channel2.send(failureA, fVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public Object f(@NotNull byte[] bArr, @NotNull Continuation<? super Success<Boolean>> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i = gVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.w = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = gVar.w;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return null;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Success success = (Success) gVar.t;
            ResultKt.throwOnFailure(obj);
            return success;
        }
        ResultKt.throwOnFailure(obj);
        if (bArr.length >= 2) {
            Success successA = Response.INSTANCE.a(Boxing.boxBoolean(c3.a(bArr[1])));
            Channel<Response<Boolean>> channel = this.v.get(Boxing.boxByte((byte) 5));
            if (channel == null) {
                return successA;
            }
            gVar.t = successA;
            gVar.w = 2;
            return channel.send(successA, gVar) == coroutine_suspended ? coroutine_suspended : successA;
        }
        Channel<Response<Boolean>> channel2 = this.v.get(Boxing.boxByte((byte) 5));
        if (channel2 == null) {
            return null;
        }
        Failure failureA = Response.INSTANCE.a("Update settings result命令 检查失败", 5);
        gVar.w = 1;
        if (channel2.send(failureA, gVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return null;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getIO();
    }

    public final Object a(byte[] bArr, Continuation<? super Unit> continuation) {
        e6 e6Var = this.x;
        if (e6Var != null) {
            e6Var.b(bArr);
        }
        byte bFirst = ArraysKt___ArraysKt.first(bArr);
        if (bFirst == 2) {
            Object objD = d(bArr, continuation);
            return objD == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Unit.INSTANCE;
        }
        if (bFirst == 4) {
            Object objC = c(bArr, continuation);
            return objC == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Unit.INSTANCE;
        }
        if (bFirst == 6) {
            Object objF = f(bArr, continuation);
            return objF == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : Unit.INSTANCE;
        }
        if (bFirst == 8) {
            Object objB = b(bArr, continuation);
            return objB == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Unit.INSTANCE;
        }
        if (bFirst != 10) {
            return Unit.INSTANCE;
        }
        Object objE = e(bArr, continuation);
        return objE == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
    }
}
