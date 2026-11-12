package com.xiaomi.fitness.access.health_connect;

import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.PermissionController;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.access.health_connect.HealthConnectAuthedPermissionsActivity$initView$1$1$onDialogClick$1", f = "HealthConnectAuthedPermissionsActivity.kt", i = {}, l = {89, 90}, m = "invokeSuspend", n = {}, s = {})
public final class HealthConnectAuthedPermissionsActivity$initView$1$1$onDialogClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HealthConnectAuthedPermissionsActivity this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.health_connect.HealthConnectAuthedPermissionsActivity$initView$1$1$onDialogClick$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.health_connect.HealthConnectAuthedPermissionsActivity$initView$1$1$onDialogClick$1$1", f = "HealthConnectAuthedPermissionsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ HealthConnectAuthedPermissionsActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HealthConnectAuthedPermissionsActivity healthConnectAuthedPermissionsActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = healthConnectAuthedPermissionsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.finish();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthConnectAuthedPermissionsActivity$initView$1$1$onDialogClick$1(HealthConnectAuthedPermissionsActivity healthConnectAuthedPermissionsActivity, Continuation<? super HealthConnectAuthedPermissionsActivity$initView$1$1$onDialogClick$1> continuation) {
        super(2, continuation);
        this.this$0 = healthConnectAuthedPermissionsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HealthConnectAuthedPermissionsActivity$initView$1$1$onDialogClick$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Logger.i("HealthConnectAuthedPermissionsActivity", "revoke all permission success");
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            PermissionController permissionController = HealthConnectClient.Companion.getOrCreate$default(HealthConnectClient.INSTANCE, this.this$0, null, 2, null).getPermissionController();
            this.label = 1;
            if (permissionController.revokeAllPermissions(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 2;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Logger.i("HealthConnectAuthedPermissionsActivity", "revoke all permission success");
        } catch (Exception e) {
            Logger.e("HealthConnectAuthedPermissionsActivity", "revoke all permissions exception:" + e.getMessage(), e);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HealthConnectAuthedPermissionsActivity$initView$1$1$onDialogClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
