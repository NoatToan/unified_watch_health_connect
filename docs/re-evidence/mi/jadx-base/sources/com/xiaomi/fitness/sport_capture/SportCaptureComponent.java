package com.xiaomi.fitness.sport_capture;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.sport_capture.SportCaptureComponent;
import com.xiaomi.fitness.sport_capture.app_lifecycle.LifeCycleHandler;
import com.xiaomi.fitness.sport_capture.app_lifecycle.SportCapturePreference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/SportCaptureComponent;", "", "<init>", "()V", "dataHandler", "Lcom/xiaomi/fitness/sport_capture/SportProjectionHandler;", "getDataHandler", "()Lcom/xiaomi/fitness/sport_capture/SportProjectionHandler;", "dataHandler$delegate", "Lkotlin/Lazy;", "initAppLifeCycleTask", "", "initProjectionTask", "Companion", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "sport_capture")
public final class SportCaptureComponent {

    @NotNull
    private static final String TAG = "SportCaptureComponent";

    /* JADX INFO: renamed from: dataHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pan
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportCaptureComponent.dataHandler_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_capture.SportCaptureComponent$initAppLifeCycleTask$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_capture.SportCaptureComponent$initAppLifeCycleTask$1", f = "SportCaptureComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SportCapturePreference sportCapturePreference = SportCapturePreference.INSTANCE;
            sportCapturePreference.setAppProjecting(false);
            sportCapturePreference.setAppForeground(false);
            ApplicationExtKt.getApplication().registerActivityLifecycleCallbacks(new LifeCycleHandler());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportProjectionHandler dataHandler_delegate$lambda$0() {
        return new SportProjectionHandler();
    }

    private final SportProjectionHandler getDataHandler() {
        return (SportProjectionHandler) this.dataHandler.getValue();
    }

    @ComponentTask(notLaterThan = 3)
    public final void initAppLifeCycleTask() {
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(null));
    }

    @ComponentTask(notLaterThan = 3, processName = ":device")
    public final void initProjectionTask() {
        SportCapturePreference.INSTANCE.setAppProjecting(false);
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(23, getDataHandler());
    }
}
