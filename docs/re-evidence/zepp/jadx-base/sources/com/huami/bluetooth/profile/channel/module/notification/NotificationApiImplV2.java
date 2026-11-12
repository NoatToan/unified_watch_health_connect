package com.huami.bluetooth.profile.channel.module.notification;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.notification.entity.AppReplyResult;
import com.huami.bluetooth.profile.channel.module.notification.entity.LogoResponse;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J$\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiImplV2;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiV2;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/LogoResponse;", AbstractJSONTokenResponse.RESPONSE, "Lkotlin/Function1;", "", "", "action", "responseLogoRequest", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/AppReplyResult;", "result", "setAppReplyResult", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;", "version", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class NotificationApiImplV2 extends NotificationApiImpl implements NotificationApiV2 {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.notification.NotificationApiImplV2$responseLogoRequest$1", f = "NotificationApiImplV2.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ Function1<Boolean, Unit> c;
        public final /* synthetic */ NotificationApiImplV2 d;
        public final /* synthetic */ Request.Command e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Boolean, Unit> function1, NotificationApiImplV2 notificationApiImplV2, Request.Command command, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = function1;
            this.d = notificationApiImplV2;
            this.e = command;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Boolean, Unit> function2 = this.c;
                NotificationModule module = this.d.getModule();
                byte[] bArr = this.e.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = function2;
                this.b = 1;
                Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(module, bArr, 0, false, this, 6, null);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
                obj = objSendDataWithResult$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.a;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.notification.NotificationApiImplV2$setAppReplyResult$1", f = "NotificationApiImplV2.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ Function1<Boolean, Unit> c;
        public final /* synthetic */ NotificationApiImplV2 d;
        public final /* synthetic */ Request.Command e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Boolean, Unit> function1, NotificationApiImplV2 notificationApiImplV2, Request.Command command, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = function1;
            this.d = notificationApiImplV2;
            this.e = command;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Boolean, Unit> function2 = this.c;
                NotificationModule module = this.d.getModule();
                byte[] bArr = this.e.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = function2;
                this.b = 1;
                Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(module, bArr, 0, false, this, 6, null);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
                obj = objSendDataWithResult$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.a;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    public NotificationApiImplV2(@NotNull NotificationModule notificationModule, @NotNull NotificationVersion notificationVersion) {
        super(notificationModule, notificationVersion);
    }

    @Override // com.huami.bluetooth.profile.channel.module.notification.NotificationApiV2
    public void responseLogoRequest(@NotNull LogoResponse response, @NotNull Function1<? super Boolean, Unit> action) {
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(action, this, NotificationCommand.LogoResponse.INSTANCE.withString(response.getPkg()).withByte(response.getCode()), null), 3, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.notification.NotificationApiV2
    public void setAppReplyResult(@NotNull AppReplyResult result, @NotNull Function1<? super Boolean, Unit> action) {
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new b(action, this, NotificationCommand.AppReplyResult.INSTANCE.withBytes(ByteUtilsKt.toByteArray$default(result.getUniqueId(), 0, 1, null)).withInt(!result.getSucceed() ? 1 : 0), null), 3, null);
    }
}
