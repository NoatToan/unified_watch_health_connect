package com.mi.fitness.lpamanagement.ui;

import androidx.lifecycle.MutableLiveData;
import com.mi.fitness.lpamanagement.ui.LpaManagementViewModel;
import com.mi.fitness.lpamanagement.util.BluetoothSender;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.fve;
import defpackage.kve;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bR#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0006R\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0013\u0010(\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/LpaManagementViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "cmd", "", "operateProfile", "(I)V", "loadProfileInfo", "()V", "addDeviceStatusListener", "removeDeviceStatusListener", "disableProfile", "enableProfile", "deleteProfile", "Landroidx/lifecycle/MutableLiveData;", "", "Lkve;", "profilesLiveData", "Landroidx/lifecycle/MutableLiveData;", "getProfilesLiveData", "()Landroidx/lifecycle/MutableLiveData;", "Lfve;", "euiccLiveData", "getEuiccLiveData", "", "disconnectLiveData", "getDisconnectLiveData", "lastCmd", "I", "getLastCmd", "()I", "setLastCmd", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "deviceStatusListener", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "getDeviceStatusListener", "()Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "<init>", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LpaManagementViewModel extends AbsViewModel {

    @NotNull
    private final MutableLiveData<List<kve>> profilesLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<fve> euiccLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> disconnectLiveData = new MutableLiveData<>();
    private int lastCmd = -1;

    @NotNull
    private final OnDeviceStatusListener deviceStatusListener = new OnDeviceStatusListener() { // from class: com.mi.fitness.lpamanagement.ui.LpaManagementViewModel$deviceStatusListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            WearableDeviceModel deviceModel = this.this$0.getDeviceModel();
            if (Intrinsics.areEqual(did, deviceModel != null ? deviceModel.getDid() : null)) {
                this.this$0.getDisconnectLiveData().postValue(Boolean.TRUE);
            }
        }
    };

    /* JADX INFO: renamed from: com.mi.fitness.lpamanagement.ui.LpaManagementViewModel$addDeviceStatusListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.lpamanagement.ui.LpaManagementViewModel$addDeviceStatusListener$1", f = "LpaManagementViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LpaManagementViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(LpaManagementViewModel.this.getDeviceStatusListener());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.fitness.lpamanagement.ui.LpaManagementViewModel$removeDeviceStatusListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.lpamanagement.ui.LpaManagementViewModel$removeDeviceStatusListener$1", f = "LpaManagementViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C13861(Continuation<? super C13861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LpaManagementViewModel.this.new C13861(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(LpaManagementViewModel.this.getDeviceStatusListener());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadProfileInfo$lambda$1(final LpaManagementViewModel this$0, boolean z, List profiles) {
        String did;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Logger.i(LpaManagementFragmentKt.LPA_TAG, "profileList:" + profiles);
        this$0.profilesLiveData.postValue(profiles);
        BluetoothSender bluetoothSender = BluetoothSender.INSTANCE;
        WearableDeviceModel deviceModel = this$0.getDeviceModel();
        if (deviceModel == null || (did = deviceModel.getDid()) == null) {
            did = "";
        }
        bluetoothSender.getEuiccInfo(did, new Function2() { // from class: dve
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LpaManagementViewModel.loadProfileInfo$lambda$1$lambda$0(this.f15964a, ((Boolean) obj).booleanValue(), (fve) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadProfileInfo$lambda$1$lambda$0(LpaManagementViewModel this$0, boolean z, fve fveVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.euiccLiveData.postValue(fveVar);
        }
        return Unit.INSTANCE;
    }

    private final void operateProfile(int cmd) {
        String did;
        List<kve> value = this.profilesLiveData.getValue();
        if (value == null || !(!value.isEmpty())) {
            return;
        }
        BluetoothSender bluetoothSender = BluetoothSender.INSTANCE;
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel == null || (did = deviceModel.getDid()) == null) {
            did = "";
        }
        bluetoothSender.operateProfile(did, value.get(0), cmd);
    }

    public final void addDeviceStatusListener() {
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    public final void deleteProfile() {
        operateProfile(2);
        this.lastCmd = 2;
    }

    public final void disableProfile() {
        operateProfile(1);
        this.lastCmd = 1;
    }

    public final void enableProfile() {
        operateProfile(0);
        this.lastCmd = 0;
    }

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @NotNull
    public final OnDeviceStatusListener getDeviceStatusListener() {
        return this.deviceStatusListener;
    }

    @NotNull
    public final MutableLiveData<Boolean> getDisconnectLiveData() {
        return this.disconnectLiveData;
    }

    @NotNull
    public final MutableLiveData<fve> getEuiccLiveData() {
        return this.euiccLiveData;
    }

    public final int getLastCmd() {
        return this.lastCmd;
    }

    @NotNull
    public final MutableLiveData<List<kve>> getProfilesLiveData() {
        return this.profilesLiveData;
    }

    public final void loadProfileInfo() {
        String did;
        BluetoothSender bluetoothSender = BluetoothSender.INSTANCE;
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel == null || (did = deviceModel.getDid()) == null) {
            did = "";
        }
        bluetoothSender.loadProfiles(did, new Function2() { // from class: cve
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LpaManagementViewModel.loadProfileInfo$lambda$1(this.f14769a, ((Boolean) obj).booleanValue(), (List) obj2);
            }
        });
    }

    public final void removeDeviceStatusListener() {
        AnyExtKt.io$default(null, new C13861(null), 1, null);
    }

    public final void setLastCmd(int i) {
        this.lastCmd = i;
    }
}
