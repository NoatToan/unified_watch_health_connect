package com.xiaomi.fitness.about;

import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0006JA\u0010\u0007\u001a\u00020\b2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\fj\b\u0012\u0004\u0012\u00020\u000b`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\fj\u0002`\u000e¢\u0006\u0002\u0010\u0010JI\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000b2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\fj\b\u0012\u0004\u0012\u00020\u0005`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\fj\u0002`\u000e¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/about/DeviceDualAuthorizationModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "refreshRNDevices", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCommonConfig", "", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "setCommonConfig", "value", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceDualAuthorizationModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDualAuthorizationModel.kt\ncom/xiaomi/fitness/about/DeviceDualAuthorizationModel\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,43:1\n314#2,11:44\n*S KotlinDebug\n*F\n+ 1 DeviceDualAuthorizationModel.kt\ncom/xiaomi/fitness/about/DeviceDualAuthorizationModel\n*L\n16#1:44,11\n*E\n"})
public final class DeviceDualAuthorizationModel extends BaseModel {
    public final void getCommonConfig(@NotNull Function1<? super String, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getCommonConfig(onSuccess, onFail);
    }

    @Nullable
    public final Object refreshRNDevices(@NotNull Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).requestDeviceList(new Function1<List<? extends RNDeviceModel>, Unit>() { // from class: com.xiaomi.fitness.about.DeviceDualAuthorizationModel$refreshRNDevices$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends RNDeviceModel> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends RNDeviceModel> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                cancellableContinuation.resume(Boolean.TRUE, new Function1<Throwable, Unit>() { // from class: com.xiaomi.fitness.about.DeviceDualAuthorizationModel$refreshRNDevices$2$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        CancellableContinuation<Boolean> cancellableContinuation2 = cancellableContinuation;
                        Result.Companion companion = Result.Companion;
                        cancellableContinuation2.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(new ApiException(it2))));
                    }
                });
            }
        }, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.about.DeviceDualAuthorizationModel$refreshRNDevices$2$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(it)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final void setCommonConfig(@NotNull String value, @NotNull Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).setCommonConfig(value, onSuccess, onFail);
    }
}
