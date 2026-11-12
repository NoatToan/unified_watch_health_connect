package com.xiaomi.fitness.devicesettings.common.finddevice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.notify.data.Constant;
import defpackage.aje;
import defpackage.s7r;
import defpackage.txo;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0013J\u0006\u0010\u001a\u001a\u00020\u0013J\u0010\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010 \u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/finddevice/FindDeviceViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "findMode", "Landroidx/lifecycle/MutableLiveData;", "", "getFindMode", "()Landroidx/lifecycle/MutableLiveData;", "findResult", "", "getFindResult", "stopFindResult", "getStopFindResult", "stopFindDevice", "", "timer", "Ljava/util/Timer;", "timerTask", "Ljava/util/TimerTask;", "startTimer", "stopTimer", "findDevice", "mDeviceFindModeSetReceiver", "Lcom/xiaomi/fitness/devicesettings/common/finddevice/FindDeviceViewModel$DeviceFindModeSetReceiver;", "registerReceiver", "context", "Landroid/content/Context;", "unregisterReceiver", "DeviceFindModeSetReceiver", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FindDeviceViewModel extends BaseLoadableBindingViewModel {

    @Nullable
    private Timer timer;

    @Nullable
    private TimerTask timerTask;

    @NotNull
    private final MutableLiveData<Integer> findMode = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> findResult = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> stopFindResult = new MutableLiveData<>();

    @NotNull
    private final DeviceFindModeSetReceiver mDeviceFindModeSetReceiver = new DeviceFindModeSetReceiver();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/finddevice/FindDeviceViewModel$DeviceFindModeSetReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/common/finddevice/FindDeviceViewModel;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DeviceFindModeSetReceiver extends BroadcastReceiver {
        public DeviceFindModeSetReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String action = intent.getAction();
            if (action != null && action.hashCode() == 1496312527 && action.equals(Constant.SYSTEM_DEVICE_SETTINGS_REPORT)) {
                FindDeviceViewModel.this.getFindMode().postValue(Integer.valueOf(intent.getIntExtra(Constant.SYSTEM_DEVICE_SETTINGS_REPORT_FIND_WEAR_MODE, 0)));
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceViewModel$findDevice$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceViewModel$findDevice$1", f = "FindDeviceViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceViewModel$findDevice$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceViewModel$findDevice$1$1", f = "FindDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FindDeviceViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04821(FindDeviceViewModel findDeviceViewModel, Continuation<? super C04821> continuation) {
                super(2, continuation);
                this.this$0 = findDeviceViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04821(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 18;
                txo txoVar = new txo();
                txoVar.X(0);
                s7rVar.c0(txoVar);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                String did = mDeviceModel != null ? mDeviceModel.getDid() : null;
                final FindDeviceViewModel findDeviceViewModel = this.this$0;
                deviceSyncExtKt.call(did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceViewModel.findDevice.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did2, int type, int code) {
                        Logger.i(FindDeviceViewModelKt.TAG, "find device fail");
                        findDeviceViewModel.getFindResult().postValue(Boolean.FALSE);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did2, int type, SyncResult result) {
                        Logger.i(FindDeviceViewModelKt.TAG, "find device success");
                        findDeviceViewModel.getFindResult().postValue(Boolean.TRUE);
                    }
                }, 8000);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FindDeviceViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04821 c04821 = new C04821(FindDeviceViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04821, this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceViewModel$stopFindDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceViewModel$stopFindDevice$1", f = "FindDeviceViewModel.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceViewModel$stopFindDevice$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceViewModel$stopFindDevice$1$1", f = "FindDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FindDeviceViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04841(FindDeviceViewModel findDeviceViewModel, Continuation<? super C04841> continuation) {
                super(2, continuation);
                this.this$0 = findDeviceViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04841(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 2;
                s7rVar.f = 18;
                txo txoVar = new txo();
                txoVar.X(1);
                s7rVar.c0(txoVar);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                String did = mDeviceModel != null ? mDeviceModel.getDid() : null;
                final FindDeviceViewModel findDeviceViewModel = this.this$0;
                deviceSyncExtKt.call(did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceViewModel.stopFindDevice.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did2, int type, int code) {
                        Logger.i(FindDeviceViewModelKt.TAG, "stop find device fail");
                        findDeviceViewModel.getStopFindResult().postValue(Boolean.FALSE);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did2, int type, SyncResult result) {
                        Logger.i(FindDeviceViewModelKt.TAG, "stop find success");
                        findDeviceViewModel.getStopFindResult().postValue(Boolean.TRUE);
                    }
                }, 8000);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C21401(Continuation<? super C21401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FindDeviceViewModel.this.new C21401(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04841 c04841 = new C04841(FindDeviceViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04841, this) == coroutine_suspended) {
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
            return ((C21401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void findDevice() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Integer> getFindMode() {
        return this.findMode;
    }

    @NotNull
    public final MutableLiveData<Boolean> getFindResult() {
        return this.findResult;
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @NotNull
    public final MutableLiveData<Boolean> getStopFindResult() {
        return this.stopFindResult;
    }

    public final void registerReceiver(@Nullable Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constant.SYSTEM_DEVICE_SETTINGS_REPORT);
        Intrinsics.checkNotNull(context);
        aje.b(context).c(this.mDeviceFindModeSetReceiver, intentFilter);
    }

    public final void startTimer() {
        if (this.timerTask == null) {
            this.timerTask = new TimerTask() { // from class: com.xiaomi.fitness.devicesettings.common.finddevice.FindDeviceViewModel.startTimer.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Logger.i(FindDeviceViewModelKt.TAG, "find device time out 60s");
                    FindDeviceViewModel.this.getStopFindResult().postValue(Boolean.TRUE);
                }
            };
        }
        if (this.timer == null) {
            Timer timer = new Timer();
            this.timer = timer;
            timer.schedule(this.timerTask, 60000L);
        }
    }

    public final void stopFindDevice() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21401(null), 3, null);
    }

    public final void stopTimer() {
        TimerTask timerTask = this.timerTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.timerTask = null;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.purge();
        }
        this.timer = null;
    }

    public final void unregisterReceiver(@Nullable Context context) {
        Intrinsics.checkNotNull(context);
        aje.b(context).e(this.mDeviceFindModeSetReceiver);
    }
}
