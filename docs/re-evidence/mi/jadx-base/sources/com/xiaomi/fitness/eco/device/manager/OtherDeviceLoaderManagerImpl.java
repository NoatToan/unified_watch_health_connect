package com.xiaomi.fitness.eco.device.manager;

import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OtherDeviceLoaderManager;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import defpackage.hbk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u000e\u0010\u0006\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/OtherDeviceLoaderManagerImpl;", "Lcom/xiaomi/fitness/eco/device/manager/export/OtherDeviceLoaderManager;", "<init>", "()V", "updateDevices", "", "refreshEcoDevices", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshRNDevices", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOtherDeviceLoaderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherDeviceLoaderManagerImpl.kt\ncom/xiaomi/fitness/eco/device/manager/OtherDeviceLoaderManagerImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,63:1\n314#2,11:64\n314#2,11:75\n*S KotlinDebug\n*F\n+ 1 OtherDeviceLoaderManagerImpl.kt\ncom/xiaomi/fitness/eco/device/manager/OtherDeviceLoaderManagerImpl\n*L\n34#1:64,11\n53#1:75,11\n*E\n"})
public final class OtherDeviceLoaderManagerImpl implements OtherDeviceLoaderManager {

    @NotNull
    private static final String TAG = "OtherDeviceLoaderManagerImpl";

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.OtherDeviceLoaderManagerImpl$updateDevices$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.OtherDeviceLoaderManagerImpl$updateDevices$1", f = "OtherDeviceLoaderManagerImpl.kt", i = {}, l = {25, 26}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OtherDeviceLoaderManagerImpl.this.new AnonymousClass1(continuation);
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
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                OtherDeviceLoaderManagerImpl otherDeviceLoaderManagerImpl = OtherDeviceLoaderManagerImpl.this;
                this.label = 1;
                if (otherDeviceLoaderManagerImpl.refreshEcoDevices(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                OtherDeviceLoaderManagerImpl otherDeviceLoaderManagerImpl2 = OtherDeviceLoaderManagerImpl.this;
                this.label = 2;
                if (otherDeviceLoaderManagerImpl2.refreshRNDevices(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                Logger.i(OtherDeviceLoaderManagerImpl.TAG, "update device list error: " + e);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object refreshEcoDevices(Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).refreshEcoList(new hbk.a() { // from class: com.xiaomi.fitness.eco.device.manager.OtherDeviceLoaderManagerImpl$refreshEcoDevices$2$1
            @Override // defpackage.hbk
            public void onFail(int code, String msg) {
                Logger.e("OtherDeviceLoaderManagerImpl", "refreshEcoList error code : " + code + " , msg : " + msg);
                CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(new ApiException(msg, code))));
            }

            @Override // defpackage.hbk
            public void onSuccess() {
                AnyExtKt.main$default(null, new OtherDeviceLoaderManagerImpl$refreshEcoDevices$2$1$onSuccess$1(cancellableContinuationImpl, null), 1, null);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object refreshRNDevices(Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).requestDeviceList(new Function1<List<? extends RNDeviceModel>, Unit>() { // from class: com.xiaomi.fitness.eco.device.manager.OtherDeviceLoaderManagerImpl$refreshRNDevices$2$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(List<? extends RNDeviceModel> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends RNDeviceModel> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                cancellableContinuation.resume(Boolean.TRUE, new Function1<Throwable, Unit>() { // from class: com.xiaomi.fitness.eco.device.manager.OtherDeviceLoaderManagerImpl$refreshRNDevices$2$1.1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
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
        }, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.eco.device.manager.OtherDeviceLoaderManagerImpl$refreshRNDevices$2$2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
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

    @Override // com.xiaomi.fitness.eco.device.manager.export.OtherDeviceLoaderManager
    public void updateDevices() {
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }
}
