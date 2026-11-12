package com.xiaomi.fitness.push.request;

import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.push.bean.PushRegisterBean;
import com.xiaomi.fitness.push.bean.PushUnRegisterBean;
import com.xiaomi.fitness.push.request.PushRequest;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import defpackage.xei;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u001a\u0010\u000b\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/push/request/PushRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/push/request/PushService;", "<init>", "()V", LoginPreferenceConfig.TYPE_REGISTER, "", "clientId", "", "success", "Lkotlin/Function0;", "unRegister", "Lkotlin/Function1;", "", "push_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPushRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushRequest.kt\ncom/xiaomi/fitness/push/request/PushRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,52:1\n89#2,5:53\n89#2,5:58\n*S KotlinDebug\n*F\n+ 1 PushRequest.kt\ncom/xiaomi/fitness/push/request/PushRequest\n*L\n23#1:53,5\n42#1:58,5\n*E\n"})
public final class PushRequest extends BaseRequest<PushService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.push.request.PushRequest$register$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/xiaomi/fitness/push/request/PushService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.push.request.PushRequest$register$1", f = "PushRequest.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PushService, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PushService pushService, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(pushService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PushService pushService = (PushService) this.L$0;
                String str = this.$data;
                Intrinsics.checkNotNull(str);
                this.label = 1;
                obj = pushService.register(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((BaseResult) obj).getResult();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.push.request.PushRequest$unRegister$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/xiaomi/fitness/push/request/PushService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.push.request.PushRequest$unRegister$1", f = "PushRequest.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27501 extends SuspendLambda implements Function2<PushService, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27501(String str, Continuation<? super C27501> continuation) {
            super(2, continuation);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27501 c27501 = new C27501(this.$data, continuation);
            c27501.L$0 = obj;
            return c27501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PushService pushService, Continuation<? super Boolean> continuation) {
            return ((C27501) create(pushService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PushService pushService = (PushService) this.L$0;
                String str = this.$data;
                Intrinsics.checkNotNull(str);
                this.label = 1;
                obj = pushService.unRegister(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((BaseResult) obj).getResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit register$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        xei.c(LoginPreferenceConfig.TYPE_REGISTER, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit register$lambda$1(Function0 success, boolean z) {
        Intrinsics.checkNotNullParameter(success, "$success");
        xei.d("register result:" + z);
        success.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unRegister$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        xei.c("unRegister", it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unRegister$lambda$3(Function1 success, boolean z) {
        Intrinsics.checkNotNullParameter(success, "$success");
        success.invoke2(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public final void register(@NotNull String clientId, @NotNull final Function0<Unit> success) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(success, "success");
        String json = getMGson().toJson(PushRegisterBean.create(clientId, DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getUniqueIdentify(), AppUtil.getApp().getPackageName()));
        xei.d("register data :" + json);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(json, null)).error(new Function1() { // from class: afi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PushRequest.register$lambda$0((ApiException) obj);
            }
        }).success(new Function1() { // from class: bfi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PushRequest.register$lambda$1(success, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void unRegister(@NotNull final Function1<? super Boolean, Unit> success) {
        Intrinsics.checkNotNullParameter(success, "success");
        String json = getMGson().toJson(PushUnRegisterBean.create(DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getUniqueIdentify(), AppUtil.getApp().getPackageName()));
        xei.a("unRegister data :" + json);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C27501(json, null)).error(new Function1() { // from class: cfi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PushRequest.unRegister$lambda$2((ApiException) obj);
            }
        }).success(new Function1() { // from class: dfi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PushRequest.unRegister$lambda$3(success, ((Boolean) obj).booleanValue());
            }
        });
    }
}
