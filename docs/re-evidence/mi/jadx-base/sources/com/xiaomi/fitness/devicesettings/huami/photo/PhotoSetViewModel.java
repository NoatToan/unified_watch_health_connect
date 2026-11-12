package com.xiaomi.fitness.devicesettings.huami.photo;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.common.extensions.SyncResultExitKt;
import com.xiaomi.fitness.devicesettings.huami.photo.PhotoSetViewModel;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import defpackage.s33;
import defpackage.s7r;
import defpackage.txo;
import defpackage.wzi;
import defpackage.xc6;
import defpackage.ywo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
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
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 V2\u00020\u0001:\u0003VWXB\u0007¢\u0006\u0004\bU\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b \u0010\u000eJ\u0015\u0010!\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\u0019J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0002¢\u0006\u0004\b*\u0010\u0004R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001f\u00100\u001a\n /*\u0004\u0018\u00010.0.8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0018\u00105\u001a\u000604R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u00060:R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R(\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bA\u0010C\"\u0004\bD\u0010ER(\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010B\u001a\u0004\bF\u0010C\"\u0004\bG\u0010ER(\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000b0@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010C\"\u0004\bJ\u0010ER(\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010B\u001a\u0004\bK\u0010C\"\u0004\bL\u0010ER(\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00070@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010B\u001a\u0004\bM\u0010C\"\u0004\bN\u0010ER\u001d\u0010T\u001a\u0004\u0018\u00010O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006Y"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/photo/PhotoSetViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "", "discovery", "()V", "toPair", "toUnPair", "", "status", "updateViewStatus", "(Z)V", "", "state", "onHidStatusChange", "(I)V", "enable", "Landroid/webkit/ValueCallback;", "resultCallback", "setHIDStatus", "(ZLandroid/webkit/ValueCallback;)V", "getHIDStatus", "(Landroid/webkit/ValueCallback;)V", "Landroid/content/Context;", "context", "registerReceiver", "(Landroid/content/Context;)V", "initPresenter", "initHidState", "connectDevice", "isPaired", "()Z", AccountInteractActivity.KEY_REQUEST_CODE, "onActivityResult", "unregisterReceiver", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroid/bluetooth/BluetoothDevice;", "device", "onPair", "(Landroid/bluetooth/BluetoothDevice;)V", "onUnPair", "Lcom/xiaomi/fitness/devicesettings/huami/photo/a;", "hidConnector", "Lcom/xiaomi/fitness/devicesettings/huami/photo/a;", "Landroid/bluetooth/BluetoothAdapter;", "kotlin.jvm.PlatformType", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBluetoothAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "Lcom/xiaomi/fitness/devicesettings/huami/photo/PhotoSetViewModel$BluetoothReceiver;", "broadcastReceiver", "Lcom/xiaomi/fitness/devicesettings/huami/photo/PhotoSetViewModel$BluetoothReceiver;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Lcom/xiaomi/fitness/devicesettings/huami/photo/PhotoSetViewModel$TimeoutRunnable;", "timeoutRunnable", "Lcom/xiaomi/fitness/devicesettings/huami/photo/PhotoSetViewModel$TimeoutRunnable;", "isLastPairedState", "Z", "hidStatus", "Landroidx/lifecycle/MutableLiveData;", "isPair", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "setPair", "(Landroidx/lifecycle/MutableLiveData;)V", "isConnect", "setConnect", "toast", "getToast", "setToast", "isBack", "setBack", "isGoBluetoothEnablePage", "setGoBluetoothEnablePage", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "<init>", "Companion", "BluetoothReceiver", "TimeoutRunnable", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PhotoSetViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    public static final String ACTION_HID_STATUS = "android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED";
    private boolean hidStatus;
    private boolean isLastPairedState;

    @NotNull
    private final a hidConnector = new a(new a.InterfaceC0503a() { // from class: tuh
        @Override // com.xiaomi.fitness.devicesettings.huami.photo.a.InterfaceC0503a
        public final void a() {
            PhotoSetViewModel.hidConnector$lambda$0();
        }
    });
    private final BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

    @NotNull
    private final BluetoothReceiver broadcastReceiver = new BluetoothReceiver();

    @NotNull
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private final TimeoutRunnable timeoutRunnable = new TimeoutRunnable();

    @NotNull
    private MutableLiveData<Boolean> isPair = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> isConnect = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Integer> toast = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> isBack = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> isGoBluetoothEnablePage = new MutableLiveData<>();

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: uuh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PhotoSetViewModel.mDeviceModel_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/photo/PhotoSetViewModel$BluetoothReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/huami/photo/PhotoSetViewModel;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class BluetoothReceiver extends BroadcastReceiver {
        public BluetoothReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            String action = intent.getAction();
            if (!Intrinsics.areEqual("android.bluetooth.device.action.BOND_STATE_CHANGED", action)) {
                if (Intrinsics.areEqual(PhotoSetViewModel.ACTION_HID_STATUS, action)) {
                    PhotoSetViewModel.this.onHidStatusChange(intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0));
                    return;
                }
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null) {
            }
            switch (bluetoothDevice.getBondState()) {
                case 10:
                    PhotoSetViewModel.this.onUnPair();
                    break;
                case 11:
                    xc6.d("pairing.....");
                    break;
                case 12:
                    xc6.d("pair  success");
                    PhotoSetViewModel.this.onPair(bluetoothDevice);
                    break;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/photo/PhotoSetViewModel$TimeoutRunnable;", "Ljava/lang/Runnable;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/huami/photo/PhotoSetViewModel;)V", "run", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class TimeoutRunnable implements Runnable {
        public TimeoutRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PhotoSetViewModel.this.isPaired()) {
                PhotoSetViewModel.this.getToast().postValue(Integer.valueOf(wzi.X0));
                PhotoSetViewModel.this.postDataLoaded();
            } else {
                PhotoSetViewModel.this.getToast().postValue(Integer.valueOf(wzi.V0));
                PhotoSetViewModel.this.postDataLoaded();
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.photo.PhotoSetViewModel$setHIDStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.photo.PhotoSetViewModel$setHIDStatus$1", f = "PhotoSetViewModel.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $enable;
        final /* synthetic */ ValueCallback<Boolean> $resultCallback;
        int label;
        final /* synthetic */ PhotoSetViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.photo.PhotoSetViewModel$setHIDStatus$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.photo.PhotoSetViewModel$setHIDStatus$1$1", f = "PhotoSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $enable;
            final /* synthetic */ ValueCallback<Boolean> $resultCallback;
            int label;
            final /* synthetic */ PhotoSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05021(boolean z, PhotoSetViewModel photoSetViewModel, ValueCallback<Boolean> valueCallback, Continuation<? super C05021> continuation) {
                super(2, continuation);
                this.$enable = z;
                this.this$0 = photoSetViewModel;
                this.$resultCallback = valueCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05021(this.$enable, this.this$0, this.$resultCallback, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Boolean boolBoxBoolean;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$enable) {
                    WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                    boolBoxBoolean = mDeviceModel != null ? Boxing.boxBoolean(DeviceModelExtKt.setHidStatus(mDeviceModel, new HidStatus.HidConnect())) : null;
                    xc6.d("setHIDStatus huami enable:" + this.$enable + " ret:" + boolBoxBoolean);
                    DeviceSettingsPreference.INSTANCE.setHID_STATUS(true);
                } else {
                    WearableDeviceModel mDeviceModel2 = this.this$0.getMDeviceModel();
                    boolBoxBoolean = mDeviceModel2 != null ? Boxing.boxBoolean(DeviceModelExtKt.setHidStatus(mDeviceModel2, new HidStatus.HidDisconnect())) : null;
                    xc6.d("setHIDStatus huami enable:" + this.$enable + " ret:" + boolBoxBoolean);
                    DeviceSettingsPreference.INSTANCE.setHID_STATUS(false);
                }
                this.$resultCallback.onReceiveValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21901(boolean z, PhotoSetViewModel photoSetViewModel, ValueCallback<Boolean> valueCallback, Continuation<? super C21901> continuation) {
            super(2, continuation);
            this.$enable = z;
            this.this$0 = photoSetViewModel;
            this.$resultCallback = valueCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21901(this.$enable, this.this$0, this.$resultCallback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05021 c05021 = new C05021(this.$enable, this.this$0, this.$resultCallback, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05021, this) == coroutine_suspended) {
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
            return ((C21901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectDevice$lambda$3(PhotoSetViewModel this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.postDataLoaded();
        this$0.updateViewStatus(!this$0.hidStatus);
    }

    private final void discovery() {
        try {
            if (this.bluetoothAdapter.startDiscovery()) {
                this.bluetoothAdapter.cancelDiscovery();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void getHIDStatus(final ValueCallback<Boolean> resultCallback) {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            xc6.d("getHIDStatus isHuaMi is true");
            resultCallback.onReceiveValue(Boolean.valueOf(DeviceSettingsPreference.INSTANCE.getHID_STATUS()));
            return;
        }
        xc6.d("getHIDStatus isHuaMi is false");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 7;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.photo.PhotoSetViewModel.getHIDStatus.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                xc6.d("getHidStatus onError" + code);
                resultCallback.onReceiveValue(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                ywo ywoVarU;
                if (result != null && SyncResultExitKt.isSuccess(result)) {
                    s7r packet = result.getPacket();
                    if ((packet != null ? packet.E() : null) != null && (ywoVarU = packet.E().u()) != null) {
                        resultCallback.onReceiveValue(Boolean.valueOf(ywoVarU.c));
                        xc6.d("getHidStatus success" + ywoVarU.c);
                        return;
                    }
                }
                resultCallback.onReceiveValue(Boolean.FALSE);
            }
        }, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hidConnector$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHidState$lambda$2(PhotoSetViewModel this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.postDataLoaded();
        Intrinsics.checkNotNull(bool);
        this$0.updateViewStatus(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$1() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onHidStatusChange(int state) {
        xc6.d("connect hid success state = " + state);
        if (state == 2) {
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel);
            if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(mDeviceModel)) {
                this.isPair.postValue(Boolean.TRUE);
                setHIDStatus(true, new ValueCallback() { // from class: ruh
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        PhotoSetViewModel.onHidStatusChange$lambda$7((Boolean) obj);
                    }
                });
                return;
            }
            WearableDeviceModel mDeviceModel2 = getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel2);
            if (mDeviceModel2.getIsDeviceConnected() && Build.VERSION.SDK_INT < 28) {
                postDataOnLoading();
                setHIDStatus(true, new ValueCallback() { // from class: suh
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        PhotoSetViewModel.onHidStatusChange$lambda$9(this.f33998a, (Boolean) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHidStatusChange$lambda$7(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHidStatusChange$lambda$9(final PhotoSetViewModel this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.postDataLoaded();
        if (bool.booleanValue()) {
            this$0.hidStatus = true;
            this$0.isConnect.postValue(Boolean.TRUE);
        } else {
            this$0.postDataOnLoading();
            this$0.getHIDStatus(new ValueCallback() { // from class: nuh
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    PhotoSetViewModel.onHidStatusChange$lambda$9$lambda$8(this.f28378a, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHidStatusChange$lambda$9$lambda$8(PhotoSetViewModel this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.postDataLoaded();
        this$0.isConnect.postValue(bool);
        this$0.hidStatus = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPair$lambda$5(PhotoSetViewModel this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.postDataLoaded();
        Intrinsics.checkNotNull(bool);
        this$0.updateViewStatus(bool.booleanValue());
    }

    private final void setHIDStatus(boolean enable, final ValueCallback<Boolean> resultCallback) {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21901(enable, this, resultCallback, null), 3, null);
            return;
        }
        xc6.d("setHIDStatus ble start");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 8;
        txo txoVar = new txo();
        ywo ywoVar = new ywo();
        ywoVar.c = enable;
        txoVar.Z(ywoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.photo.PhotoSetViewModel.setHIDStatus.2
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                xc6.d("setHIDStatus ble onError code:" + code);
                resultCallback.onReceiveValue(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                xc6.d("setHIDStatus ble onSuccess");
                if (result != null) {
                    resultCallback.onReceiveValue(Boolean.valueOf(SyncResultExitKt.isSuccess(result)));
                } else {
                    resultCallback.onReceiveValue(Boolean.FALSE);
                }
            }
        }, 0, 8, null);
    }

    private final void toPair() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(mDeviceModel));
        if (remoteDevice == null) {
            this.toast.postValue(Integer.valueOf(wzi.common_hint_unkonwn_error));
            this.isBack.postValue(Boolean.TRUE);
            return;
        }
        setLoadingMsg(ResourceExtKt.getString(wzi.W0));
        postDataOnLoading();
        Method method = BluetoothDevice.class.getMethod("createBond", new Class[0]);
        Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
        method.invoke(remoteDevice, new Object[0]);
    }

    private final void toUnPair() {
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (bluetoothAdapter.getRemoteDevice(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(mDeviceModel)) == null) {
            this.toast.setValue(Integer.valueOf(wzi.common_hint_unkonwn_error));
            this.isBack.setValue(Boolean.TRUE);
            return;
        }
        setLoadingMsg(ResourceExtKt.getString(wzi.Z0));
        postDataOnLoading();
        this.mainHandler.postDelayed(this.timeoutRunnable, 3000L);
        WearableDeviceModel mDeviceModel2 = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel2);
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(mDeviceModel2)) {
            setHIDStatus(false, new ValueCallback() { // from class: vuh
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    PhotoSetViewModel.toUnPair$lambda$4((Boolean) obj);
                }
            });
        }
        WearableDeviceModel mDeviceModel3 = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel3);
        s33.g(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(mDeviceModel3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toUnPair$lambda$4(Boolean bool) {
    }

    private final void updateViewStatus(final boolean status) {
        this.mainHandler.post(new Runnable() { // from class: muh
            @Override // java.lang.Runnable
            public final void run() {
                PhotoSetViewModel.updateViewStatus$lambda$6(this.f27220a, status);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateViewStatus$lambda$6(PhotoSetViewModel this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isConnect.postValue(Boolean.valueOf(z));
        this$0.hidStatus = z;
    }

    public final void connectDevice() {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (!mDeviceModel.getIsDeviceConnected()) {
            this.toast.postValue(Integer.valueOf(wzi.f2));
            return;
        }
        discovery();
        if (!isPaired()) {
            xc6.d("connectDevice go to pair");
            toPair();
            return;
        }
        xc6.d("connectDevice go to unpair");
        if (this.hidStatus) {
            setLoadingMsg(ResourceExtKt.getString(wzi.Z0));
        } else {
            setLoadingMsg(ResourceExtKt.getString(wzi.W0));
        }
        postDataOnLoading();
        setHIDStatus(!this.hidStatus, new ValueCallback() { // from class: ouh
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                PhotoSetViewModel.connectDevice$lambda$3(this.f29697a, (Boolean) obj);
            }
        });
    }

    public final BluetoothAdapter getBluetoothAdapter() {
        return this.bluetoothAdapter;
    }

    @NotNull
    public final MutableLiveData<Integer> getToast() {
        return this.toast;
    }

    public final void initHidState() {
        if (getMDeviceModel() == null) {
            this.isBack.postValue(Boolean.TRUE);
        }
        if (!this.bluetoothAdapter.isEnabled()) {
            xc6.d("initHidState bluetoothAdapter.isEnabled is false");
            this.isGoBluetoothEnablePage.postValue(Boolean.TRUE);
            return;
        }
        xc6.d("initHidState bluetoothAdapter.isEnabled is true");
        if (!isPaired()) {
            xc6.d("initHidState isPaired is false");
            this.isPair.postValue(Boolean.FALSE);
        } else {
            xc6.d("initHidState isPaired is true");
            postDataOnLoading();
            getHIDStatus(new ValueCallback() { // from class: quh
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    PhotoSetViewModel.initHidState$lambda$2(this.f31857a, (Boolean) obj);
                }
            });
        }
    }

    public final void initPresenter() {
        if (getMDeviceModel() == null) {
            this.isBack.postValue(Boolean.TRUE);
        }
        this.isLastPairedState = isPaired();
    }

    @NotNull
    public final MutableLiveData<Boolean> isBack() {
        return this.isBack;
    }

    @NotNull
    public final MutableLiveData<Boolean> isConnect() {
        return this.isConnect;
    }

    @NotNull
    public final MutableLiveData<Boolean> isGoBluetoothEnablePage() {
        return this.isGoBluetoothEnablePage;
    }

    @NotNull
    public final MutableLiveData<Boolean> isPair() {
        return this.isPair;
    }

    public final boolean isPaired() {
        if (getMDeviceModel() == null) {
            return false;
        }
        for (BluetoothDevice bluetoothDevice : this.bluetoothAdapter.getBondedDevices()) {
            Intrinsics.checkNotNullExpressionValue(bluetoothDevice, "next(...)");
            BluetoothDevice bluetoothDevice2 = bluetoothDevice;
            String address = bluetoothDevice2.getAddress();
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel);
            if (Intrinsics.areEqual(address, com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(mDeviceModel))) {
                if (bluetoothDevice2.getBondState() != 10) {
                    return true;
                }
                xc6.d("initHidState isPaired is false bleDevice.bondState:" + bluetoothDevice2.getBondState());
                return false;
            }
        }
        xc6.d("initHidState isPaired not found");
        return false;
    }

    public final void onActivityResult(int requestCode) {
        if (requestCode == 1006) {
            if (this.bluetoothAdapter.isEnabled()) {
                this.isPair.postValue(Boolean.valueOf(isPaired()));
            } else {
                this.isBack.postValue(Boolean.TRUE);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.mainHandler.removeCallbacksAndMessages(null);
        this.hidConnector.b();
    }

    public final void onPair(@NotNull BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.mainHandler.removeCallbacks(this.timeoutRunnable);
        if (Build.VERSION.SDK_INT < 28) {
            postDataLoaded();
            boolean zA = this.hidConnector.a(device);
            xc6.d("onPair result:" + zA);
            if (!zA) {
                this.isPair.postValue(Boolean.FALSE);
                this.toast.postValue(Integer.valueOf(wzi.V0));
            }
        } else {
            setHIDStatus(true, new ValueCallback() { // from class: puh
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    PhotoSetViewModel.onPair$lambda$5(this.f30799a, (Boolean) obj);
                }
            });
        }
        this.isLastPairedState = true;
    }

    public final void onUnPair() {
        postDataLoaded();
        if (this.isLastPairedState) {
            xc6.d("unPair success");
            this.mainHandler.removeCallbacks(this.timeoutRunnable);
            this.toast.postValue(Integer.valueOf(wzi.Y0));
            this.isPair.postValue(Boolean.FALSE);
            this.isBack.postValue(Boolean.TRUE);
        } else {
            this.toast.postValue(Integer.valueOf(wzi.V0));
        }
        this.isLastPairedState = false;
    }

    public final void registerReceiver(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction(ACTION_HID_STATUS);
        context.registerReceiver(this.broadcastReceiver, intentFilter);
    }

    public final void setBack(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isBack = mutableLiveData;
    }

    public final void setConnect(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isConnect = mutableLiveData;
    }

    public final void setGoBluetoothEnablePage(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isGoBluetoothEnablePage = mutableLiveData;
    }

    public final void setPair(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isPair = mutableLiveData;
    }

    public final void setToast(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.toast = mutableLiveData;
    }

    public final void unregisterReceiver(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            context.unregisterReceiver(this.broadcastReceiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
