package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tJ\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lj0;", "Lkotlinx/coroutines/CoroutineScope;", "Lne;", "device", "Lap;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "", "isMute", "Lxo;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class j0 implements CoroutineScope {

    @NotNull
    public static final a v = new a(null);

    @NotNull
    public static final j0 w = new j0();

    @NotNull
    public final Job t;

    @NotNull
    public final CoroutineContext u;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lj0$a;", "", "Lj0;", "instance", "Lj0;", PluginDeviceInfo.FMODEL, "()Lj0;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final j0 a() {
            return j0.w;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.sdk.utils.AudioDeviceUtils$phoneMute$1", f = "AudioDeviceUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ ne v;
        public final /* synthetic */ boolean w;

        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"j0$b$a", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "result", "", "onFinish", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
        public static final class a extends HMCallback<Boolean> {
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                onFinish(bool.booleanValue());
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                le.c("AudioDeviceUtils", "setRingMode:" + result, new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ne neVar, boolean z, Continuation<? super b> continuation) {
            super(2, continuation);
            this.v = neVar;
            this.w = z;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return j0.this.new b(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            xo xoVarA = j0.this.a(this.v);
            if (xoVarA == null) {
                le.c("AudioDeviceUtils", "setRingMode api is null", new Object[0]);
                return Unit.INSTANCE;
            }
            xoVarA.a(this.w, new a());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.sdk.utils.AudioDeviceUtils$phoneMutePermissionMiss$1", f = "AudioDeviceUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ ne v;

        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"j0$c$a", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "result", "", "onFinish", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
        public static final class a extends HMCallback<Boolean> {
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                onFinish(bool.booleanValue());
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                le.c("AudioDeviceUtils", "setPermissionMiss:" + result, new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ne neVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.v = neVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return j0.this.new c(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            xo xoVarA = j0.this.a(this.v);
            if (xoVarA == null) {
                le.c("AudioDeviceUtils", "setRingMode api is null", new Object[0]);
                return Unit.INSTANCE;
            }
            xoVarA.b(new a());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.sdk.utils.AudioDeviceUtils$registerPhoneMuteListener$1", f = "AudioDeviceUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ ne v;
        public final /* synthetic */ ap w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ne neVar, ap apVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.v = neVar;
            this.w = apVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return j0.this.new d(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            xo xoVarA = j0.this.a(this.v);
            if (xoVarA == null) {
                le.c("AudioDeviceUtils", "registerPhoneMuteListener:api is null", new Object[0]);
                return Unit.INSTANCE;
            }
            xoVarA.a(this.w);
            return Unit.INSTANCE;
        }
    }

    public j0() {
        Job jobM2382Job$default = JobKt__JobKt.m2382Job$default((Job) null, 1, (Object) null);
        this.t = jobM2382Job$default;
        this.u = jobM2382Job$default.plus(Dispatchers.getIO());
    }

    public final void b(@Nullable ne device) {
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new c(device, null), 2, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public CoroutineContext getU() {
        return this.u;
    }

    public final xo a(ne device) {
        if (device == null) {
            return null;
        }
        return yo.f40355a.a(device);
    }

    public final void a(@Nullable ne device, @NotNull ap listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new d(device, listener, null), 2, null);
    }

    public final void a(@Nullable ne device, boolean isMute) {
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new b(device, isMute, null), 2, null);
    }
}
