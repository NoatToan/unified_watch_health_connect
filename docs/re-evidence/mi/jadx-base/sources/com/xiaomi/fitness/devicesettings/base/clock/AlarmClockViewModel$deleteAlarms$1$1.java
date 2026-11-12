package com.xiaomi.fitness.devicesettings.base.clock;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import defpackage.eu6;
import defpackage.wzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel$deleteAlarms$1$1", f = "AlarmClockViewModel.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
public final class AlarmClockViewModel$deleteAlarms$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<List<? extends AlarmSettingItem>, Unit> $callback;
    final /* synthetic */ WearableDeviceModel $device;
    final /* synthetic */ List<AlarmSettingItem> $list;
    int label;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel$deleteAlarms$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel$deleteAlarms$1$1$1", f = "AlarmClockViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
            ToastUtil.showShortToast(wzi.f2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlarmClockViewModel$deleteAlarms$1$1(WearableDeviceModel wearableDeviceModel, List<? extends AlarmSettingItem> list, Function1<? super List<? extends AlarmSettingItem>, Unit> function1, Continuation<? super AlarmClockViewModel$deleteAlarms$1$1> continuation) {
        super(2, continuation);
        this.$device = wearableDeviceModel;
        this.$list = list;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlarmClockViewModel$deleteAlarms$1$1(this.$device, this.$list, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$device.getIsDeviceConnected()) {
                WearableDeviceModel wearableDeviceModel = this.$device;
                final List<AlarmSettingItem> list = this.$list;
                final Function1<List<? extends AlarmSettingItem>, Unit> function1 = this.$callback;
                DeviceModelExtKt.deleteAlarms(wearableDeviceModel, list, new eu6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel$deleteAlarms$1$1.2
                    @Override // defpackage.eu6
                    public void onError(int errorCode) {
                        Logger.e(AlarmClockViewModel.TAG, "deleteAlarms error " + errorCode);
                        function1.invoke2(CollectionsKt__CollectionsKt.emptyList());
                    }

                    @Override // defpackage.eu6
                    public /* bridge */ /* synthetic */ void onResult(Boolean bool) {
                        onResult(bool.booleanValue());
                    }

                    public void onResult(boolean result) {
                        Logger.e(AlarmClockViewModel.TAG, "deleteAlarms onResult " + result);
                        if (result) {
                            function1.invoke2(list);
                        } else {
                            function1.invoke2(CollectionsKt__CollectionsKt.emptyList());
                        }
                    }
                });
                return Unit.INSTANCE;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AlarmClockViewModel$deleteAlarms$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
