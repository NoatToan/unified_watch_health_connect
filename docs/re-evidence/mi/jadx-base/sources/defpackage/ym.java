package defpackage;

import com.huami.bluetooth.profile.channel.module.notification.NotificationModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¨\u0006\u0010"}, d2 = {"Lym;", "Lbn;", "Lxm;", "Ltk;", b.I, "Lkotlin/Function1;", "", "", "action", PluginDeviceInfo.FMODEL, "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", RnReportConst.ApiReport.PARAM_MODULE, "Lhn;", "version", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;Lhn;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class ym extends xm implements bn {

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.notification.NotificationApiImplV2$responseLogoRequest$1", f = "NotificationApiImplV2.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object t;
        public int u;
        public final /* synthetic */ Function1<Boolean, Unit> v;
        public final /* synthetic */ ym w;
        public final /* synthetic */ jq.a x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Boolean, Unit> function1, ym ymVar, jq.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.v = function1;
            this.w = ymVar;
            this.x = aVar;
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
            return new a(this.v, this.w, this.x, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.u;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Boolean, Unit> function2 = this.v;
                NotificationModule notificationModuleA = this.w.getF39252a();
                byte[] f34884a = this.x.getF34884a();
                this.t = function2;
                this.u = 1;
                Object objSendDataWithResult$default = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(notificationModuleA, f34884a, 0, false, this, 6, null);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
                obj = objSendDataWithResult$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.t;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke2(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(@NotNull NotificationModule module, @NotNull NotificationVersion version) {
        super(module, version);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(version, "version");
    }

    @Override // defpackage.bn
    public void a(@NotNull LogoResponse response, @NotNull Function1<? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(action, this, cn.c.c.withString(response.getPkg()).withByte(response.getCode()), null), 3, null);
    }
}
