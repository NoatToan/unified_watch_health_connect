package com.xiaomi.fitness.devicesettings.huami.nightmode;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetViewModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.NightMode;
import defpackage.exo;
import defpackage.s7r;
import defpackage.txo;
import defpackage.wzi;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\fJ\u0011\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\u0010\u001dJ\u0011\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001f\u001a\u00020\u0015J\u0016\u0010 \u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0011H\u0002J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\fH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000eR!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/nightmode/NightModeSetViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "nightMode", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;", "getNightMode", "()Landroidx/lifecycle/MutableLiveData;", "nightMode$delegate", "getNightModel", "", "getHuamiSetting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncResult", "", "getSyncResult", "syncResult$delegate", "syncNightModel", "mode", "getLocationPermissionList", "", "", "()[Ljava/lang/String;", "getLocationPermissionDescList", "isBaseLocationPermissionGranted", "syncConfig", "(Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBleSetting", "syncBle", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNightModeSetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NightModeSetViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/nightmode/NightModeSetViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,167:1\n37#2:168\n36#2,3:169\n37#2:172\n36#2,3:173\n*S KotlinDebug\n*F\n+ 1 NightModeSetViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/nightmode/NightModeSetViewModel\n*L\n97#1:168\n97#1:169,3\n104#1:172\n104#1:173,3\n*E\n"})
public final class NightModeSetViewModel extends BaseLoadableBindingViewModel {

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: eug
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NightModeSetViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: nightMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy nightMode = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fug
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NightModeSetViewModel.nightMode_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: syncResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gug
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NightModeSetViewModel.syncResult_delegate$lambda$3();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetViewModel$getNightModel$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetViewModel$getNightModel$1", f = "NightModeSetViewModel.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public C21861(Continuation<? super C21861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NightModeSetViewModel.this.new C21861(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NightModeSetViewModel nightModeSetViewModel;
            MutableLiveData<NightMode> mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel mDeviceModel = NightModeSetViewModel.this.getMDeviceModel();
                if (mDeviceModel != null) {
                    nightModeSetViewModel = NightModeSetViewModel.this;
                    if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
                        MutableLiveData<NightMode> nightMode = nightModeSetViewModel.getNightMode();
                        this.L$0 = nightModeSetViewModel;
                        this.L$1 = nightMode;
                        this.label = 1;
                        Object huamiSetting = nightModeSetViewModel.getHuamiSetting(this);
                        if (huamiSetting == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData = nightMode;
                        obj = huamiSetting;
                    } else {
                        nightModeSetViewModel.getBleSetting();
                    }
                } else {
                    NightModeSetViewModel.this.postLoadStatus(3);
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.L$1;
            nightModeSetViewModel = (NightModeSetViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
            NightMode defaultNightMode = (NightMode) obj;
            if (defaultNightMode == null) {
                defaultNightMode = NightModeHelper.INSTANCE.getDefaultNightMode();
            }
            mutableLiveData.postValue(defaultNightMode);
            nightModeSetViewModel.postDataLoaded();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetViewModel$syncConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetViewModel", f = "NightModeSetViewModel.kt", i = {}, l = {114}, m = "syncConfig", n = {}, s = {})
    public static final class C21881 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C21881(Continuation<? super C21881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NightModeSetViewModel.this.syncConfig(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetViewModel$syncNightModel$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetViewModel$syncNightModel$1", f = "NightModeSetViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NightMode $mode;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21891(NightMode nightMode, Continuation<? super C21891> continuation) {
            super(2, continuation);
            this.$mode = nightMode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NightModeSetViewModel.this.new C21891(this.$mode, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NightModeSetViewModel nightModeSetViewModel;
            NightMode nightMode;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel mDeviceModel = NightModeSetViewModel.this.getMDeviceModel();
                if (mDeviceModel != null) {
                    nightModeSetViewModel = NightModeSetViewModel.this;
                    NightMode nightMode2 = this.$mode;
                    if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
                        this.L$0 = nightModeSetViewModel;
                        this.L$1 = nightMode2;
                        this.label = 1;
                        obj = nightModeSetViewModel.syncConfig(nightMode2, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        nightMode = nightMode2;
                    } else {
                        nightModeSetViewModel.syncBle(nightMode2);
                    }
                } else {
                    NightModeSetViewModel.this.postLoadStatus(3);
                }
                NightModeSetViewModel.this.postDataLoaded();
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nightMode = (NightMode) this.L$1;
            nightModeSetViewModel = (NightModeSetViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
                WearableDeviceModel mDeviceModel2 = nightModeSetViewModel.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel2);
                companion.sendSettingItem(mDeviceModel2.getDid(), DeviceSettingConfigKey.KEY_NIGHTMODE, nightMode);
                nightModeSetViewModel.getSyncResult().postValue(Boxing.boxBoolean(true));
            } else {
                nightModeSetViewModel.getSyncResult().postValue(Boxing.boxBoolean(false));
            }
            NightModeSetViewModel.this.postDataLoaded();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getBleSetting() {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 10;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetViewModel.getBleSetting.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                NightModeSetViewModel.this.postLoadStatus(3);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                txo txoVarE;
                s7r packet;
                exo exoVarX = null;
                if (((result == null || (packet = result.getPacket()) == null) ? null : packet.E()) == null) {
                    NightModeSetViewModel.this.postLoadStatus(3);
                    return;
                }
                NightModeHelper nightModeHelper = NightModeHelper.INSTANCE;
                s7r packet2 = result.getPacket();
                if (packet2 != null && (txoVarE = packet2.E()) != null) {
                    exoVarX = txoVarE.x();
                }
                NightMode nightModeConvertProtosToNightMode = nightModeHelper.convertProtosToNightMode(exoVarX);
                MutableLiveData<NightMode> nightMode = NightModeSetViewModel.this.getNightMode();
                if (nightModeConvertProtosToNightMode == null) {
                    nightModeConvertProtosToNightMode = nightModeHelper.getDefaultNightMode();
                }
                nightMode.postValue(nightModeConvertProtosToNightMode);
                NightModeSetViewModel.this.postDataLoaded();
            }
        }, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getHuamiSetting(Continuation<? super NightMode> continuation) {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null) {
            return null;
        }
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new NightModeSetViewModel$getHuamiSetting$2$1(mDeviceModel, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : (NightMode) objWithContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData nightMode_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncBle(NightMode mode) {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 11;
        exo exoVarConvertNightModeToProtos = NightModeHelper.INSTANCE.convertNightModeToProtos(mode);
        txo txoVar = new txo();
        txoVar.e0(exoVarConvertNightModeToProtos);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeSetViewModel.syncBle.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                NightModeSetViewModel.this.getSyncResult().postValue(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                MutableLiveData<Boolean> syncResult = NightModeSetViewModel.this.getSyncResult();
                boolean z = false;
                if (result != null && result.isSuccess()) {
                    z = true;
                }
                syncResult.postValue(Boolean.valueOf(z));
            }
        }, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncConfig(NightMode nightMode, Continuation<? super Boolean> continuation) {
        C21881 c21881;
        boolean zBooleanValue;
        if (continuation instanceof C21881) {
            c21881 = (C21881) continuation;
            int i = c21881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21881.label = i - Integer.MIN_VALUE;
            } else {
                c21881 = new C21881(continuation);
            }
        } else {
            c21881 = new C21881(continuation);
        }
        Object objWithContext = c21881.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c21881.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            if (mDeviceModel != null) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                NightModeSetViewModel$syncConfig$2$1 nightModeSetViewModel$syncConfig$2$1 = new NightModeSetViewModel$syncConfig$2$1(mDeviceModel, nightMode, null);
                c21881.label = 1;
                objWithContext = BuildersKt.withContext(io2, nightModeSetViewModel$syncConfig$2$1, c21881);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                zBooleanValue = false;
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objWithContext);
        zBooleanValue = ((Boolean) objWithContext).booleanValue();
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData syncResult_delegate$lambda$3() {
        return new MutableLiveData();
    }

    @NotNull
    public final String[] getLocationPermissionDescList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ResourceExtKt.getString(wzi.hf));
        arrayList.add(" ");
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public final String[] getLocationPermissionList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public final MutableLiveData<NightMode> getNightMode() {
        return (MutableLiveData) this.nightMode.getValue();
    }

    public final void getNightModel() {
        postDataOnLoading();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21861(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getSyncResult() {
        return (MutableLiveData) this.syncResult.getValue();
    }

    public final boolean isBaseLocationPermissionGranted() {
        return PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
    }

    public final void syncNightModel(@NotNull NightMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        postDataOnLoading();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21891(mode, null), 3, null);
    }
}
