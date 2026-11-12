package defpackage;

import com.huami.bluetooth.feature.sleep.SleepDataSource;
import com.huami.bluetooth.feature.sleep.WriteSleepDataJob;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lpx;", "", "Lkd;", "device", "Lcom/huami/bluetooth/feature/sleep/SleepDataSource;", "source", "", PluginDeviceInfo.FMODEL, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class px {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final px f30868a = new px();

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.sdk.writeback.WriteSleepBack$doWrite$1", f = "WriteSleepBack.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ kd u;
        public final /* synthetic */ SleepDataSource v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kd kdVar, SleepDataSource sleepDataSource, Continuation<? super a> continuation) {
            super(2, continuation);
            this.u = kdVar;
            this.v = sleepDataSource;
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
                Deferred deferredStartAsync$default = WriteSleepDataJob.startAsync$default(new WriteSleepDataJob(this.u), this.v, null, null, 6, null);
                this.t = 1;
                if (deferredStartAsync$default.await(this) == coroutine_suspended) {
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

    @JvmStatic
    public static final void a(@NotNull kd device, @NotNull SleepDataSource source) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(source, "source");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(device, source, null), 2, null);
    }
}
